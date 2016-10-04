/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.batchcontroller.flow;

import jp.co.ndensan.reams.db.dbd.batchcontroller.step.DBD710120.HanyoListKokiKoreishaProcess;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.DBD710120.DBD710120_HanyoListKokiKoreishaParameter;
import jp.co.ndensan.reams.uz.uza.batch.Step;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchFlowBase;
import jp.co.ndensan.reams.uz.uza.batch.flow.IBatchFlowCommand;

/**
 * 汎用リスト出力(後期高齢者)のバッチフロークラスです。
 *
 * @reamsid_L DBD-5520-030 mawy
 */
public class DBD710120_HanyoListKokiKoreisha extends BatchFlowBase<DBD710120_HanyoListKokiKoreishaParameter> {

    @Override
    protected void defineFlow() {
        executeStep(CSV_PROCESS);
    }

    private static final String CSV_PROCESS = "csvProcess";

    /**
     * batchProcessです。
     *
     * @return IBatchFlowCommand
     */
    @Step(CSV_PROCESS)
    protected IBatchFlowCommand reportProcess() {
        return loopBatch(HanyoListKokiKoreishaProcess.class)
                .arguments(getParameter().toHanyoRisutoKokiKoreishaProcessParameter())
                .define();
    }
}