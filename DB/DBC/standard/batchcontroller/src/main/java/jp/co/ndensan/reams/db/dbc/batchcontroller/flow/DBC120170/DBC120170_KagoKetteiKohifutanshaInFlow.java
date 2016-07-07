/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.flow.DBC120170;

import jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC120170.KohifutanshaDeleteReveicedFileProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC120170.KohifutanshaDoHihokenshaKanrenProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC120170.KohifutanshaDoIchiranhyoSakuseiProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC120170.KohifutanshaDoInterfaceKanriKousinProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC120170.KohifutanshaDoMasterTorokuProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC120170.KohifutanshaDoShoriKekkaListSakuseiProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC120170.KohifutanshaGetFileProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC120170.KohifutanshaReadCsvFileProcess;
import jp.co.ndensan.reams.db.dbc.business.core.kokuhorenkyoutsuu.KokuhorenKyoutsuuFileGetReturnEntity;
import jp.co.ndensan.reams.db.dbc.definition.batchprm.kagoketteikohifutanshain.DBC120170_KagoKetteiKohifutanshaInBatchParameter;
import jp.co.ndensan.reams.db.dbc.definition.core.kokuhorenif.KokuhorenJoho_TorikomiErrorListType;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kagoketteikohifutanshain.KohifutanshaDeleteReveicedFileProcessParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kagoketteikohifutanshain.KohifutanshaDoIchiranhyoSakuseiProcessParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kagoketteikohifutanshain.KohifutanshaDoInterfaceKanriKousinProcessParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kagoketteikohifutanshain.KohifutanshaDoMasterTorokuProcessParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kagoketteikohifutanshain.KohifutanshaDoShoriKekkaListSakuseiProcessParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kagoketteikohifutanshain.KohifutanshaGetFileProcessParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kagoketteikohifutanshain.KohifutanshaReadCsvFileProcessParameter;
import jp.co.ndensan.reams.db.dbc.entity.csv.kagoketteihokenshain.FlowEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBC;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.uz.uza.batch.Step;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchFlowBase;
import jp.co.ndensan.reams.uz.uza.batch.flow.IBatchFlowCommand;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 介護給付費過誤決定通知書情報取込（公費負担者分）のバッチ処理フロー
 *
 * @reamsid_L DBC-0980-420 zhangrui
 */
public class DBC120170_KagoKetteiKohifutanshaInFlow
        extends BatchFlowBase<DBC120170_KagoKetteiKohifutanshaInBatchParameter> {

    private static final String ファイル取得 = "getFile";
    private static final String CSVファイル取込 = "readCsvFile";
    private static final String 被保険者関連処理 = "doHihokenshaKanren";
    private static final String マスタ登録 = "doMasterToroku";
    private static final String 国保連インタフェース管理更新 = "doInterfaceKanriKousin";
    private static final String 一覧表作成 = "doIchiranhyoSakusei";
    private static final String 処理結果リスト作成 = "doShoriKekkaListSakusei";
    private static final String 取込済ファイル削除 = "deleteReveicedFile";

    private static final RString ファイル格納フォルダ名 = new RString("DBC120170");
    private static final RString 帳票ID = new RString("DBC200051_KagoKetteitsuchishoTorikomiIchiranKohifutanshaBun");

    private KokuhorenKyoutsuuFileGetReturnEntity returnEntity;
    private FlowEntity flowEntity;

    private static RString 交換情報識別番号;

    @Override
    protected void defineFlow() {
        RDate now = RDate.getNowDate();
        交換情報識別番号 = DbBusinessConfig.get(
                ConfigNameDBC.国保連取込_介護給付費過誤決定通知書公費情報_交換情報識別番号, now, SubGyomuCode.DBC介護給付);
        executeStep(ファイル取得);
        returnEntity
                = getResult(KokuhorenKyoutsuuFileGetReturnEntity.class, new RString(ファイル取得),
                        KohifutanshaGetFileProcess.PARAMETER_OUT_RETURNENTITY);
        executeStep(CSVファイル取込);
        flowEntity = getResult(FlowEntity.class, new RString(CSVファイル取込),
                KohifutanshaReadCsvFileProcess.PARAMETER_OUT_FLOWENTITY);
        if (0 == flowEntity.get明細データ登録件数() && 0 == flowEntity.get集計データ登録件数()) {
            executeStep(国保連インタフェース管理更新);
            executeStep(処理結果リスト作成);
            executeStep(取込済ファイル削除);
        } else {
            executeStep(被保険者関連処理);
            executeStep(マスタ登録);
            executeStep(国保連インタフェース管理更新);
            executeStep(一覧表作成);
            executeStep(処理結果リスト作成);
            executeStep(取込済ファイル削除);
        }

    }

    /**
     * ファイル取得処理クラスです。
     *
     * @return CreateGyomuHokenshaJohoGetsujiProcess
     */
    @Step(ファイル取得)
    protected IBatchFlowCommand callGetFileProcess() {
        KohifutanshaGetFileProcessParameter parameter = new KohifutanshaGetFileProcessParameter();
        parameter.set交換情報識別番号(交換情報識別番号);
        parameter.setファイル格納フォルダ名(ファイル格納フォルダ名);
        return simpleBatch(KohifutanshaGetFileProcess.class).arguments(parameter).define();
    }

    /**
     * CSVファイル取込処理クラスです。
     *
     * @return CreateGyomuHokenshaJohoGetsujiProcess
     */
    @Step(CSVファイル取込)
    protected IBatchFlowCommand callReadCsvFileProcess() {
        KohifutanshaReadCsvFileProcessParameter parameter = new KohifutanshaReadCsvFileProcessParameter();
        parameter.set処理年月(getParameter().getShoriYM());
        parameter.set保存先フォルダ(returnEntity.get保存先フォルダのパス().toRString());
        parameter.setエントリ情報List(returnEntity.getFileNameList());
        return simpleBatch(KohifutanshaReadCsvFileProcess.class).arguments(parameter).define();
    }

    /**
     * 被保険者関連処理クラスです。
     *
     * @return CreateGyomuHokenshaJohoGetsujiProcess
     */
    @Step(被保険者関連処理)
    protected IBatchFlowCommand callDoHihokenshaKanrenProcess() {
        return simpleBatch(KohifutanshaDoHihokenshaKanrenProcess.class).define();
    }

    /**
     * マスタ登録処理クラスです。
     *
     * @return CreateGyomuHokenshaJohoGetsujiProcess
     */
    @Step(マスタ登録)
    protected IBatchFlowCommand callDoMasterTorokuProcess() {
        KohifutanshaDoMasterTorokuProcessParameter parameter = new KohifutanshaDoMasterTorokuProcessParameter();
        parameter.set処理年月(getParameter().getShoriYM());
        parameter.set再処理区分(getParameter().getSaishoriKubun());
        parameter.set交換情報識別番号(交換情報識別番号);
        return simpleBatch(KohifutanshaDoMasterTorokuProcess.class).arguments(parameter).define();
    }

    /**
     * 国保連インタフェース管理更新処理クラスです。
     *
     * @return CreateGyomuHokenshaJohoGetsujiProcess
     */
    @Step(国保連インタフェース管理更新)
    protected IBatchFlowCommand callDoInterfaceKanriKousinProcess() {
        KohifutanshaDoInterfaceKanriKousinProcessParameter parameter
                = new KohifutanshaDoInterfaceKanriKousinProcessParameter();
        parameter.set処理年月(getParameter().getShoriYM());
        parameter.set交換情報識別番号(交換情報識別番号);
        parameter.set処理対象年月(flowEntity.getShoriYM());
        parameter.setレコード件数合計(flowEntity.getCodeNum());
        parameter.setFileNameList(returnEntity.getFileNameList());
        return simpleBatch(KohifutanshaDoInterfaceKanriKousinProcess.class).arguments(parameter).define();
    }

    /**
     * 一覧表作成クラスです。
     *
     * @return CreateGyomuHokenshaJohoGetsujiProcess
     */
    @Step(一覧表作成)
    protected IBatchFlowCommand callDoIchiranhyoSakuseiProcess() {
        KohifutanshaDoIchiranhyoSakuseiProcessParameter parameter
                = new KohifutanshaDoIchiranhyoSakuseiProcessParameter();
        parameter.setサブ業務コード(SubGyomuCode.DBC介護給付);
        parameter.set帳票ID(new ReportId(帳票ID));
        parameter.set出力順ID(getParameter().getShutsuryokujunId());
        parameter.set処理年月(getParameter().getShoriYM());
        parameter.setシステム日付(RDateTime.now());
        return simpleBatch(KohifutanshaDoIchiranhyoSakuseiProcess.class).arguments(parameter).
                define();
    }

    /**
     * 処理結果リスト作成クラスです。
     *
     * @return CreateGyomuHokenshaJohoGetsujiProcess
     */
    @Step(処理結果リスト作成)
    protected IBatchFlowCommand callDoShoriKekkaListSakuseiProcess() {
        KohifutanshaDoShoriKekkaListSakuseiProcessParameter parameter
                = new KohifutanshaDoShoriKekkaListSakuseiProcessParameter();
        parameter.setエラーリストタイプ(KokuhorenJoho_TorikomiErrorListType.リストタイプ1);
        return simpleBatch(KohifutanshaDoShoriKekkaListSakuseiProcess.class).arguments(parameter).define();
    }

    /**
     * 取込済ファイル削除クラスです。
     *
     * @return CreateGyomuHokenshaJohoGetsujiProcess
     */
    @Step(取込済ファイル削除)
    protected IBatchFlowCommand callDeleteReveicedFileProcess() {
        KohifutanshaDeleteReveicedFileProcessParameter parameter
                = new KohifutanshaDeleteReveicedFileProcessParameter();
        parameter.set処理年月(getParameter().getShoriYM());
        parameter.set保存先フォルダ(returnEntity.get保存先フォルダのパス().toRString());
        parameter.setエントリ情報List(returnEntity.getEntityList());
        return simpleBatch(KohifutanshaDeleteReveicedFileProcess.class).arguments(parameter).define();
    }
}
