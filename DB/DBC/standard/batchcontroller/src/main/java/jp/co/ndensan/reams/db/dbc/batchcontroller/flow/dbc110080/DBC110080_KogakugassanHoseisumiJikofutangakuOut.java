/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.flow.dbc110080;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.dbc110080.KogakugassanGassanMiSofuReprotProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.dbc110080.KogakugassanGassanSofuReprotProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.dbc110080.KogakugassanMeisaiKakuninProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.dbc110080.KogakugassanReadDataProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.dbc110080.KogakugassanSoufuFairuSakuseiProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.dbc110080.KogakugassanSoufuSetteiProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.dbc110080.UpdateKogakuGassanMiSofuProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.dbc110080.UpdateKogakuGassanSofuProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.kokuhorenkyoutsu.KokuhorenkyoutsuDoInterfaceKanriKousinProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.kokuhorenkyoutsu.KokuhorenkyoutsuDoShoriKekkaListSakuseiProcess;
import jp.co.ndensan.reams.db.dbc.definition.batchprm.DBC110080.DBC110080_KogakugassanHoseisumiJikofutangakuOutParameter;
import jp.co.ndensan.reams.db.dbc.definition.core.kokuhorenif.KokuhorenJoho_TorikomiErrorListType;
import jp.co.ndensan.reams.db.dbc.definition.core.kokuhoreninterface.ConfigKeysKokuhorenSofu;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kogakugassan.KogakugassanProcessParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kokuhorenkyotsu.KokuhorenkyotsuDoInterfaceKanriKousinProcessParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kokuhorenkyotsu.KokuhorenkyotsuDoShoriKekkaListSakuseiProcessParameter;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBU;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.uz.uza.batch.Step;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchFlowBase;
import jp.co.ndensan.reams.uz.uza.batch.flow.IBatchFlowCommand;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.SharedFileDescriptor;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 高額合算補正済自己負担額情報作成のバッチflowです。
 *
 * @reamsid_L DBC-2660-030 gongliang
 */
public class DBC110080_KogakugassanHoseisumiJikofutangakuOut extends BatchFlowBase<DBC110080_KogakugassanHoseisumiJikofutangakuOutParameter> {

    private static final String 送付対象データ取得 = "getFile";
    private static final String 高額合算自己負担額明細データの存在確認 = "meisaiKakunin";
    private static final String 宛名情報取得 = "getAtena";
    private static final String 送付除外区分設定 = "soufuSettei";
    private static final String 送付ファイル作成 = "soufuFairuSakusei";
    private static final String 帳票出力_送付一覧表 = "gassanSofuReprot";
    private static final String 帳票出力_未送付一覧表 = "gassanMiSofuReprot";
    private static final String DB更新_送付済 = "updateKogakuGassanSofu";
    private static final String DB更新_未送付 = "updateKogakuGassanMiSofu";
    private static final String 国保連インタフェース管理更新 = "kokuhorenkyoutsuDoInterfaceKanriKousinProcess";
    private static final String 処理結果リスト作成 = "kokuhorenkyoutsuDoShoriKekkaListSakuseiProcess";

    private static final RString データがある = new RString("1");
    private static final RString 被保険者_宛名情報取得BATCHID = new RString("HokenshaKyufujissekiOutHihokenshaAtenaFlow");

    private KogakugassanProcessParameter processParameter;
    private int レコード件数合計 = 0;
    private List<SharedFileDescriptor> エントリ情報List = new ArrayList<>();

    @Override
    protected void defineFlow() {
        processParameter = getParameter().toKogakugassanProcessParameter(YMDHMS.now());
        RDate date = processParameter.getNow().getDate();
        RString 保険者情報_保険者番号 = DbBusinessConfig.get(ConfigNameDBU.保険者情報_保険者番号, date, SubGyomuCode.DBU介護統計報告);
        RString 保険者情報_保険者名称 = DbBusinessConfig.get(ConfigNameDBU.保険者情報_保険者名称, date, SubGyomuCode.DBU介護統計報告);
        processParameter.set保険者情報_保険者番号(保険者情報_保険者番号);
        processParameter.set保険者情報_保険者名称(保険者情報_保険者名称);
        executeStep(送付対象データ取得);
        executeStep(高額合算自己負担額明細データの存在確認);
        if (データがある.equals((getResult(RString.class, new RString(送付対象データ取得), KogakugassanReadDataProcess.PARAMETER_OUT_FLOWFLAG)))) {
            executeStep(宛名情報取得);
            executeStep(送付除外区分設定);
            executeStep(送付ファイル作成);
            レコード件数合計 = getResult(
                    Integer.class, new RString(送付ファイル作成), KogakugassanSoufuFairuSakuseiProcess.PARAMETER_OUT_OUTPUTCOUNT);
            エントリ情報List = (ArrayList<SharedFileDescriptor>) getResult(
                    List.class, new RString(送付ファイル作成), KogakugassanSoufuFairuSakuseiProcess.PARAMETER_OUT_OUTPUTENTRY);
            executeStep(帳票出力_送付一覧表);
            executeStep(帳票出力_未送付一覧表);
            executeStep(DB更新_送付済);
            executeStep(DB更新_未送付);
        }
        executeStep(国保連インタフェース管理更新);
        executeStep(処理結果リスト作成);
    }

    /**
     * 送付対象データ取得操作です。
     *
     * @return IBatchFlowCommand
     */
    @Step(送付対象データ取得)
    protected IBatchFlowCommand callGetFileProcess() {
        return loopBatch(KogakugassanReadDataProcess.class).arguments(processParameter).define();
    }

    /**
     * 送付対象データ取得操作です。
     *
     * @return IBatchFlowCommand
     */
    @Step(高額合算自己負担額明細データの存在確認)
    protected IBatchFlowCommand callKogakugassanMeisaiKakuninProcess() {
        return loopBatch(KogakugassanMeisaiKakuninProcess.class).define();
    }

    /**
     * 宛名情報取得操作です。
     *
     * @return IBatchFlowCommand
     */
    @Step(宛名情報取得)
    protected IBatchFlowCommand callGetAtenaProcess() {
        return otherBatchFlow(被保険者_宛名情報取得BATCHID, SubGyomuCode.DBC介護給付, null).define();
    }

    /**
     * 送付除外区分設定操作です。
     *
     * @return IBatchFlowCommand
     */
    @Step(送付除外区分設定)
    protected IBatchFlowCommand callSoufuSetteiProcess() {
        return loopBatch(KogakugassanSoufuSetteiProcess.class).define();
    }

    /**
     * 送付ファイル作成操作です。
     *
     * @return IBatchFlowCommand
     */
    @Step(送付ファイル作成)
    protected IBatchFlowCommand callSoufuFairuSakuseiProcess() {
        return loopBatch(KogakugassanSoufuFairuSakuseiProcess.class).arguments(processParameter).define();
    }

    /**
     * 帳票出力_送付操作です。
     *
     * @return IBatchFlowCommand
     */
    @Step(帳票出力_送付一覧表)
    protected IBatchFlowCommand callGassanSofuReprotProcess() {
        return loopBatch(KogakugassanGassanSofuReprotProcess.class).arguments(processParameter).define();
    }

    /**
     * 帳票出力_未送付操作です。
     *
     * @return IBatchFlowCommand
     */
    @Step(帳票出力_未送付一覧表)
    protected IBatchFlowCommand callGassanMiSofuReprotProcess() {
        return loopBatch(KogakugassanGassanMiSofuReprotProcess.class).arguments(processParameter).define();
    }

    /**
     * DB更新_送付済操作です。
     *
     * @return IBatchFlowCommand
     */
    @Step(DB更新_送付済)
    protected IBatchFlowCommand callUpdateKogakuGassanSofuProcess() {
        return loopBatch(UpdateKogakuGassanSofuProcess.class).arguments(processParameter).define();
    }

    /**
     * DB更新_未送付操作です。
     *
     * @return IBatchFlowCommand
     */
    @Step(DB更新_未送付)
    protected IBatchFlowCommand callUpdateKogakuGassanMiSofuProcess() {
        return loopBatch(UpdateKogakuGassanMiSofuProcess.class).define();
    }

    /**
     * 国保連インタフェース管理更新操作です。
     *
     * @return IBatchFlowCommand
     */
    @Step(国保連インタフェース管理更新)
    protected IBatchFlowCommand callKokuhorenkyoutsuDoInterfaceKanriKousinProcess() {
        return simpleBatch(KokuhorenkyoutsuDoInterfaceKanriKousinProcess.class).arguments(getParam()).define();
    }

    /**
     * 処理結果リスト作成操作です。
     *
     * @return IBatchFlowCommand
     */
    @Step(処理結果リスト作成)
    protected IBatchFlowCommand callKokuhorenkyoutsuDoShoriKekkaListSakuseiProcess() {
        KokuhorenkyotsuDoShoriKekkaListSakuseiProcessParameter parameter = new KokuhorenkyotsuDoShoriKekkaListSakuseiProcessParameter();
        parameter.setエラーリストタイプ(KokuhorenJoho_TorikomiErrorListType.リストタイプ2);
        return simpleBatch(KokuhorenkyoutsuDoShoriKekkaListSakuseiProcess.class).arguments(parameter).define();
    }

    private KokuhorenkyotsuDoInterfaceKanriKousinProcessParameter getParam() {
        KokuhorenkyotsuDoInterfaceKanriKousinProcessParameter param = new KokuhorenkyotsuDoInterfaceKanriKousinProcessParameter();
        param.set処理年月(getParameter().getShoriYM());
        param.set交換情報識別番号(ConfigKeysKokuhorenSofu.高額合算補正済自己負担額情報.getコード());
        param.set処理対象年月(getParameter().getShoriYM());
        param.setレコード件数合計(レコード件数合計);
        List<RString> list = new ArrayList<>();
        if (エントリ情報List.isEmpty()) {
            param.setFileNameList(Collections.EMPTY_LIST);
        } else {
            for (SharedFileDescriptor entry : エントリ情報List) {
                // TODO エントリ情報Listの1件目のファイル名
                list.add(entry.getSharedFileName().toRString());
                param.setFileNameList(list);
            }
        }
        return param;
    }

}
