/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.batchcontroller.flow;

import jp.co.ndensan.reams.db.dbd.batchcontroller.step.DBD130010.InsKokuhoShikakuJyohoTempProcess;
import jp.co.ndensan.reams.db.dbd.batchcontroller.step.DBD130010.InsTorikomiKokuhoJyohoTempProcess;
import jp.co.ndensan.reams.db.dbd.batchcontroller.step.DBD130010.InsertKokuhoShikakuJyohoProcess;
import jp.co.ndensan.reams.db.dbd.batchcontroller.step.DBD130010.KokuhoCsvFyiiruSyutuRyokuProcess;
import jp.co.ndensan.reams.db.dbd.batchcontroller.step.DBD130010.UpdShoriDateKanriProcess;
import jp.co.ndensan.reams.db.dbd.batchcontroller.step.DBD130010.UpdTorikomiKokuhoJyohoTemp2Process;
import jp.co.ndensan.reams.db.dbd.batchcontroller.step.DBD130010.UpdTorikomiKokuhoJyohoTemp3Process;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.DBD130010.DBD130010_KokuhoShikakuIdoInParameter;
import jp.co.ndensan.reams.db.dbd.definition.processprm.dbd130010.InsKokuhoShikakuJyohoProcessParameter;
import jp.co.ndensan.reams.db.dbd.definition.processprm.dbd130010.InsKokuhoShikakuJyohoTempProcessParameter;
import jp.co.ndensan.reams.db.dbd.definition.processprm.dbd130010.InsTorikomiKokuhoJyohoTempProcessParameter;
import jp.co.ndensan.reams.db.dbd.definition.processprm.dbd130010.UpdShoriDateKanriProcessParameter;
import jp.co.ndensan.reams.db.dbd.definition.processprm.dbd130010.UpdTorikomiKokuhoJyohoTemp2ProcessParameter;
import jp.co.ndensan.reams.db.dbd.definition.processprm.dbd130010.UpdTorikomiKokuhoJyohoTemp3ProcessParameter;
import jp.co.ndensan.reams.uz.uza.batch.Step;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchFlowBase;
import jp.co.ndensan.reams.uz.uza.batch.flow.IBatchFlowCommand;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * バッチ設計_DBD130010_国保資格異動情報取込
 *
 * @reamsid_L DBC-3020-030 dengwei
 */
public class DBD130010_KokuhoShikakuIdoIn extends BatchFlowBase<DBD130010_KokuhoShikakuIdoInParameter> {

    private RString 市町村識別ID;
    private static final RString 処理名 = new RString("国保情報取り込み");

    private static final String INS_TORIKOMIKOKUHOJYOHOTEMP = "InsTorikomiKokuhoJyohoTempProcess";
    private static final String UPD_TORIKOMIKOKUHOJYOHOTEMP2 = "UpdTorikomiKokuhoJyohoTemp2Process";
    private static final String UPD_TORIKOMIKOKUHOJYOHOTEMP3 = "UpdTorikomiKokuhoJyohoTemp3Process";
    private static final String INS_KOKUHOSHIKAKUJYOHOTEMP = "InsKokuhoShikakuJyohoTempProcess";
    private static final String INS_KOKUHOSHIKAKUJYOHO = "InsKokuhoShikakuJyohoProcess";
    private static final String UPD_SHORIDATEKANRI = "UpdShoriDateKanriProcess";
    private static final String CREATE_CSVFILE = "CreateCsvFileProcess";

    @Override
    protected void initialize() {
        市町村識別ID = RString.EMPTY;
    }

    @Override
    protected void defineFlow() {
        for (RString value : getParameter().getShoriShichoson()) {
            市町村識別ID = value;
            executeStep(INS_TORIKOMIKOKUHOJYOHOTEMP);
        }
        executeStep(UPD_TORIKOMIKOKUHOJYOHOTEMP2);
        executeStep(UPD_TORIKOMIKOKUHOJYOHOTEMP3);
        executeStep(INS_KOKUHOSHIKAKUJYOHOTEMP);
        executeStep(INS_KOKUHOSHIKAKUJYOHO);
        executeStep(UPD_SHORIDATEKANRI);
        executeStep(CREATE_CSVFILE);
    }

    /**
     * 取込国保情報一時表登録
     *
     * @return IBatchFlowCommand
     */
    @Step(INS_TORIKOMIKOKUHOJYOHOTEMP)
    protected IBatchFlowCommand 取込国保情報一時表登録() {
        return loopBatch(InsTorikomiKokuhoJyohoTempProcess.class)
                .arguments(getInsTorikomiKokuhoJyohoTempProcessParameter())
                .define();
    }

    /**
     * 取込国保情報一時表更新
     *
     * @return IBatchFlowCommand
     */
    @Step(UPD_TORIKOMIKOKUHOJYOHOTEMP2)
    protected IBatchFlowCommand 取込国保情報一時表更新() {
        return loopBatch(UpdTorikomiKokuhoJyohoTemp2Process.class)
                .arguments(getUpdTorikomiKokuhoJyohoTemp2ProcessParameter())
                .define();
    }

    /**
     * 取込国保情報一時表再更新
     *
     * @return IBatchFlowCommand
     */
    @Step(UPD_TORIKOMIKOKUHOJYOHOTEMP3)
    protected IBatchFlowCommand 取込国保情報一時表再更新() {
        return loopBatch(UpdTorikomiKokuhoJyohoTemp3Process.class)
                .arguments(getUpdTorikomiKokuhoJyohoTemp3ProcessParameter())
                .define();
    }

    /**
     * 国保資格情報インポート用一時表登録
     *
     * @return IBatchFlowCommand
     */
    @Step(INS_KOKUHOSHIKAKUJYOHOTEMP)
    protected IBatchFlowCommand 国保資格情報インポート用一時表登録() {
        return loopBatch(InsKokuhoShikakuJyohoTempProcess.class)
                .arguments(getInsKokuhoShikakuJyohoTempProcessParameter())
                .define();
    }

    /**
     * 国保資格情報に登録
     *
     * @return IBatchFlowCommand
     */
    @Step(INS_KOKUHOSHIKAKUJYOHO)
    protected IBatchFlowCommand 国保資格情報に登録() {
        return loopBatch(InsertKokuhoShikakuJyohoProcess.class)
                .arguments(getInsKokuhoShikakuJyohoProcessParameter())
                .define();
    }

    /**
     * 処理管理日付マスタ更新
     *
     * @return IBatchFlowCommand
     */
    @Step(UPD_SHORIDATEKANRI)
    protected IBatchFlowCommand 処理管理日付マスタ更新() {
        return simpleBatch(UpdShoriDateKanriProcess.class)
                .arguments(getUpdShoriDateKanriProcessParameter()).define();
    }

    /**
     * 取込確認CSVファイル出力
     *
     * @return IBatchFlowCommand
     */
    @Step(CREATE_CSVFILE)
    protected IBatchFlowCommand 取込確認CSVファイル出力() {
        return loopBatch(KokuhoCsvFyiiruSyutuRyokuProcess.class).define();
    }

    private InsTorikomiKokuhoJyohoTempProcessParameter getInsTorikomiKokuhoJyohoTempProcessParameter() {
        return new InsTorikomiKokuhoJyohoTempProcessParameter(getParameter().getInsurerDistinction(),
                getParameter().getTableName(),
                市町村識別ID,
                getParameter().getIfType(),
                getParameter().getTorikomiKeishiki(),
                getParameter().getShoriTimestamp());
    }

    private UpdTorikomiKokuhoJyohoTemp2ProcessParameter getUpdTorikomiKokuhoJyohoTemp2ProcessParameter() {
        return new UpdTorikomiKokuhoJyohoTemp2ProcessParameter(getParameter().getInsurerDistinction(),
                getParameter().getTableName(),
                getParameter().getShoriShichoson(),
                getParameter().getIfType(),
                getParameter().getTorikomiKeishiki(),
                getParameter().getShoriTimestamp());
    }

    private UpdTorikomiKokuhoJyohoTemp3ProcessParameter getUpdTorikomiKokuhoJyohoTemp3ProcessParameter() {
        return new UpdTorikomiKokuhoJyohoTemp3ProcessParameter(getParameter().getInsurerDistinction(),
                getParameter().getTableName(),
                getParameter().getShoriShichoson(),
                getParameter().getIfType(),
                getParameter().getTorikomiKeishiki(),
                getParameter().getShoriTimestamp());
    }

    private InsKokuhoShikakuJyohoTempProcessParameter getInsKokuhoShikakuJyohoTempProcessParameter() {
        return new InsKokuhoShikakuJyohoTempProcessParameter(getParameter().getInsurerDistinction(),
                getParameter().getTableName(),
                getParameter().getShoriShichoson(),
                getParameter().getIfType(),
                getParameter().getTorikomiKeishiki(),
                getParameter().getShoriTimestamp());
    }

    private InsKokuhoShikakuJyohoProcessParameter getInsKokuhoShikakuJyohoProcessParameter() {
        return new InsKokuhoShikakuJyohoProcessParameter(getParameter().getInsurerDistinction(),
                getParameter().getTableName(),
                getParameter().getShoriShichoson(),
                getParameter().getIfType(),
                getParameter().getTorikomiKeishiki(),
                getParameter().getShoriTimestamp());
    }

    private UpdShoriDateKanriProcessParameter getUpdShoriDateKanriProcessParameter() {
        return new UpdShoriDateKanriProcessParameter(getParameter().getInsurerDistinction(),
                getParameter().getTableName(),
                getParameter().getShoriShichoson(),
                getParameter().getIfType(),
                getParameter().getTorikomiKeishiki(),
                getParameter().getShoriTimestamp(),
                処理名);
    }
}
