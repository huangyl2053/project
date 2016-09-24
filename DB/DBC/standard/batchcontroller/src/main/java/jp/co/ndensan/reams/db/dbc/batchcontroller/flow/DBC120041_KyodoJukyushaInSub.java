/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.flow;

import jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC120041.CreateTmptableProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC120041.IchiTmpTableTorokuProcess;
import jp.co.ndensan.reams.db.dbc.definition.batchprm.DBC120041.DBC120041_KyodoJukyushaInSubParameter;
import jp.co.ndensan.reams.uz.uza.batch.BatchInterruptedException;
import jp.co.ndensan.reams.uz.uza.batch.Step;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchFlowBase;
import jp.co.ndensan.reams.uz.uza.batch.flow.IBatchFlowCommand;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * バッチ設計書_DBCMNF2002-5Cx_共同処理用受給者情報更新結果情報取込共通処理（CSVファイル取込）クラスです。
 *
 * @reamsid_L DBC-2780-011 lishengli
 */
public class DBC120041_KyodoJukyushaInSub extends BatchFlowBase<DBC120041_KyodoJukyushaInSubParameter> {

    private static final String 一時TBL基本情報作成 = "一時TBL基本情報作成";
    private static final String 一時TBLの登録 = "一時TBLの登録";
    private RString ファイル名;
    private Integer レコード総件数;

    @Override
    protected void defineFlow() {
        レコード総件数 = 0;
        for (RString csvファイル名 : getParameter().getエントリ情報List()) {
            ファイル名 = csvファイル名;
            try {
                executeStep(一時TBL基本情報作成);
                レコード総件数 = レコード総件数 + checkNull(getResult(Integer.class, new RString(一時TBL基本情報作成),
                        CreateTmptableProcess.レコード件数));
            } catch (Exception e) {
                throw new BatchInterruptedException(e.getMessage());
            }
        }
        executeStep(一時TBLの登録);
    }

    /**
     * 一時TBL基本情報_5C3作成処理Processです。
     *
     * @return CreateTmptable5C3Process
     */
    @Step(一時TBL基本情報作成)
    protected IBatchFlowCommand createTmptableProcess() {
        return loopBatch(CreateTmptableProcess.class)
                .arguments(getParameter().toKyufuJissekiInProcessParameter(ファイル名)).define();
    }

    /**
     * 一時TBLの登録Processです。
     *
     * @return IchiTmpTableTorokuProcess
     */
    @Step(一時TBLの登録)
    protected IBatchFlowCommand ichiTmpTableTorokuProcess() {
        return loopBatch(IchiTmpTableTorokuProcess.class).define();
    }

    private Integer checkNull(Integer レコード件数) {
        if (レコード件数 != null) {
            return レコード件数;
        }
        return 0;
    }
}
