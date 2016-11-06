/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.flow;

import jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC710150.HanyoListKogakuGassanJikoFutangakuNoProcess;
import jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC710150.HanyoListKogakuGassanJikoFutangakuProcess;
import jp.co.ndensan.reams.db.dbc.definition.batchprm.DBC710150.DBC710150_HanyoListKogakuGassanJikoFutangakuParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.hanyolistkogakugassanjikofutangaku.HanyoListKogakuGassanJikoFutangakuProcessParameter;
import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.uz.uza.batch.Step;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchFlowBase;
import jp.co.ndensan.reams.uz.uza.batch.flow.IBatchFlowCommand;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;

/**
 * 汎用リスト出力(高額合算自己負担額情報)のバッチ処理フロー
 *
 * @reamsid_L DBC-3102-020 sunqingzhu
 */
public class DBC710150_HanyoListKogakuGassanJikoFutangaku
        extends BatchFlowBase<DBC710150_HanyoListKogakuGassanJikoFutangakuParameter> {

    private static final String CSV_EUC_PROCESS = "csvEucProcess";

    @Override
    protected void defineFlow() {
        executeStep(CSV_EUC_PROCESS);
    }

    @Step(CSV_EUC_PROCESS)
    IBatchFlowCommand csvEucProcess() {

        HanyoListKogakuGassanJikoFutangakuProcessParameter processParam = getParameter().toProcessParam();
        processParam.setサブ業務コード(SubGyomuCode.DBC介護給付);
        processParam.set帳票ID(new ReportId(ReportIdDBC.DBC701015.getReportId().getColumnValue()));
        processParam.set出力順(getParameter().getShutsuryokuju());
        if (getParameter().isRebanFuka()) {
            return loopBatch(HanyoListKogakuGassanJikoFutangakuProcess.class)
                    .arguments(processParam).define();
        }
        return loopBatch(HanyoListKogakuGassanJikoFutangakuNoProcess.class)
                .arguments(processParam).define();
    }
}
