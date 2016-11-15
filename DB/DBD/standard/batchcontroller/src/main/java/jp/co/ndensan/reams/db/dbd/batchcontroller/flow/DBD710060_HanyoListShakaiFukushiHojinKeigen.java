/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.batchcontroller.flow;

import jp.co.ndensan.reams.db.dbd.batchcontroller.step.DBD710060.HanyoListShakaiFukushiHojinKeigenProcess;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.DBD710060.DBD710060_HanyoListShakaiFukushiHojinKeigenParameter;
import jp.co.ndensan.reams.uz.uza.batch.Step;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchFlowBase;
import jp.co.ndensan.reams.uz.uza.batch.flow.IBatchFlowCommand;

/**
 * 汎用リスト出力(社会福祉法人軽減)のバッチフロークラスです。
 *
 * @reamsid_L DBD-3900-030 mawy
 */
public class DBD710060_HanyoListShakaiFukushiHojinKeigen extends BatchFlowBase<DBD710060_HanyoListShakaiFukushiHojinKeigenParameter> {
    private static final String CSV_PROCESS = "csvProcess";
    
    @Override
    protected void defineFlow() {
        executeStep(CSV_PROCESS);
    }

    /**
     * batchProcessです。
     *
     * @return IBatchFlowCommand
     */
    @Step(CSV_PROCESS)
    protected IBatchFlowCommand reportProcess() {
        return loopBatch(HanyoListShakaiFukushiHojinKeigenProcess.class)
                .arguments(getParameter().toHanyoRisutoShakaiFukushiHoujinKeigenProcessParameter())
                .define();
    }

}
