/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.batchcontroller.flow.hanyorisutojyukyusyadaicho;

import jp.co.ndensan.reams.db.dbd.batchcontroller.step.hanyorisutojyukyusyadaicho.HanyoRisutoJyukyusyaDaichoProcess;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.hanyorisutojyukyusyadaicho.HanyoRisutoJyukyusyaDaichoBatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.Step;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchFlowBase;
import jp.co.ndensan.reams.uz.uza.batch.flow.IBatchFlowCommand;

/**
 * 汎用リスト受給者台帳２のバッチフロークラスです。
 *
 * @reamsid_L DBD-1810-020 yaodongsheng
 */
public class HanyoRisutoJyukyusyaDaichoFlow extends BatchFlowBase<HanyoRisutoJyukyusyaDaichoBatchParameter> {

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
        return loopBatch(HanyoRisutoJyukyusyaDaichoProcess.class)
                .arguments(getParameter().toHanyoRisutoJyukyusyaDaichoProcessParameter())
                .define();
    }
}