/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.controller.parentdiv.DBC0410014;

import jp.co.ndensan.reams.db.dbc.definition.batchprm.kokuhorenkyoutsu.KokuhorenKyoutsuBatchParameter;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0410014.TsuchishoJoho631Div;
import jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.kaigokyufukokuhorenjohotorikomi.KokuhorenDataTorikomiViewStateClass;
import jp.co.ndensan.reams.db.dbz.definition.core.viewstatename.ViewStateHolderName;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 *
 * 国保連情報受取データ取込_[631]介護給付費等請求額通知書（公費）情報
 *
 * @reamsid_L DBC-0980-050 quxiaodong
 */
public class TsuchishoJoho631 {

    /**
     * onLoad事件
     *
     * @param div TsuchishoJoho631Div
     * @return ResponseData
     */
    public ResponseData<TsuchishoJoho631Div> onLoad(TsuchishoJoho631Div div) {
        KokuhorenDataTorikomiViewStateClass parmater = ViewStateHolder.get(ViewStateHolderName.国保連取込情報,
                KokuhorenDataTorikomiViewStateClass.class);
        div.getCcdKokurenJohoTorikomi().initialize(parmater);
        return ResponseData.of(div).respond();

    }

    /**
     * onImplement 事件
     *
     * @param div TsuchishoJoho631Div
     * @return ResponseData
     */
    public ResponseData<KokuhorenKyoutsuBatchParameter> onImplement(TsuchishoJoho631Div div) {
        KokuhorenKyoutsuBatchParameter parameter = new KokuhorenKyoutsuBatchParameter();
        RDate 処理年月 = div.getCcdKokurenJohoTorikomi().get処理年月();
        parameter.setShoriYM(new FlexibleYearMonth(処理年月.getYearMonth().toDateString()));
        return ResponseData.of(parameter).respond();
    }

}