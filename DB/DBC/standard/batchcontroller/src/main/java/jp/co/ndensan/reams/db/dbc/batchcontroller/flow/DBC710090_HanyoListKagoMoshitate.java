/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.flow;

import jp.co.ndensan.reams.db.dbc.batchcontroller.step.dbc710090.HanyoListKagoMoshitateOutputProcess;
import jp.co.ndensan.reams.db.dbc.definition.batchprm.DBC710090.DBC710090_HanyoListKagoMoshitateParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.dbc710090.HanyoListKagoMoshitateProcessParameter;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.ShikibetsuTaishoPSMSearchKeyBuilder;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.shikibetsutaisho.KensakuYusenKubun;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.shikibetsutaisho.psm.DataShutokuKubun;
import jp.co.ndensan.reams.uz.uza.batch.Step;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchFlowBase;
import jp.co.ndensan.reams.uz.uza.batch.flow.IBatchFlowCommand;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;

/**
 * 汎用リスト(過誤申立情報)のバッチ用パラメータフロークラスです。
 *
 * @reamsid_L DBC-3095-020 pengxingyi
 */
public class DBC710090_HanyoListKagoMoshitate extends BatchFlowBase<DBC710090_HanyoListKagoMoshitateParameter> {

    private static final String 過誤申立情報 = "HanyoListKagoMoshitateOutputProcess";
    private RDateTime システム日時;

    @Override
    protected void defineFlow() {
        システム日時 = RDateTime.now();
        executeStep(過誤申立情報);
    }

    @Step(過誤申立情報)
    IBatchFlowCommand hanyoListKagoMoshitateOutputProcess() {
        return loopBatch(HanyoListKagoMoshitateOutputProcess.class)
                .arguments(getProcessParameter())
                .define();
    }

    private HanyoListKagoMoshitateProcessParameter getProcessParameter() {
        HanyoListKagoMoshitateProcessParameter param = new HanyoListKagoMoshitateProcessParameter();
        if (getParameter().get国保連送付年月From() != null) {
            param.set国保連送付年月From(getParameter().get国保連送付年月From().getYearMonth());
        }
        if (getParameter().get国保連送付年月To() != null) {
            param.set国保連送付年月To(getParameter().get国保連送付年月To().getYearMonth());
        }
        param.set過誤申立給付区分(getParameter().get過誤申立給付区分());
        if (getParameter().getサービス提供年月From() != null) {
            param.setサービス提供年月From(getParameter().getサービス提供年月From().getYearMonth());
        }
        if (getParameter().getサービス提供年月To() != null) {
            param.setサービス提供年月To(getParameter().getサービス提供年月To().getYearMonth());
        }
        param.set事業者コード(getParameter().get事業者コード());
        param.set事業者名(getParameter().get事業者名());
        param.set項目名付加(getParameter().is項目名付加());
        param.set連番付加(getParameter().is連番付加());
        param.set日付スラッシュ付加(getParameter().is日付スラッシュ付加());
        param.set保険者コード(getParameter().get保険者コード());
        param.setシステム日時(システム日時);
        param.setシステム日付(new FlexibleDate(システム日時.getDate().toDateString()));
        param.setSearchKey(new ShikibetsuTaishoPSMSearchKeyBuilder(
                GyomuCode.DB介護保険, KensakuYusenKubun.住登外優先).setデータ取得区分(DataShutokuKubun.直近レコード).build());
        return param;
    }
}
