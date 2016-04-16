/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.controller.parentdiv.DBC0810011;

import static jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810011.DBC0810011TransitionEventName.住宅改修費支給申請;
import static jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810011.DBC0810011TransitionEventName.償還払い費支給申請;
import static jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810011.DBC0810011TransitionEventName.福祉用具購入費支給;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810011.ShinseiSearchDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.ViewStateKeys;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;

import jp.co.ndensan.reams.db.dbz.service.TaishoshaKey;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 * 償還払い状況照会_申請情報検索
 *
 * @reamsid_L DBC-1010-130 panhe
 */
public class ShinseiSearch {

    private static final RString 照会 = new RString("照会");
    private static final RString 判定_21C = new RString("21C");
    private static final RString 判定_21D = new RString("21D");

    /**
     * 初期表示
     *
     * @param div ShinseiSearchDiv
     * @return ResponseData
     */
    public ResponseData<ShinseiSearchDiv> onLoad(ShinseiSearchDiv div) {
        TaishoshaKey 引継ぎデータ = ViewStateHolder.get(ViewStateKeys.資格対象者, TaishoshaKey.class);
        ShikibetsuCode 識別コード = 引継ぎデータ.get識別コード();
        div.getPanelAtenaShikaku().getCcdKaigoAtenalInfo().onLoad(識別コード);
        HihokenshaNo 被保険者番号 = 引継ぎデータ.get被保険者番号();
        div.getPanelAtenaShikaku().getCcdKaigoShikakuKihon().onLoad(被保険者番号);
        div.getPanelShokan().getCcdShokanShinseiList().initialize(照会, 被保険者番号, FlexibleYearMonth.MIN, FlexibleYearMonth.MAX);
        return ResponseData.of(div).respond();
    }

    /**
     * 選択ボタン
     *
     * @param div ShinseiSearchDiv
     * @return ResponseData<ShinseiSearchDiv>
     */
    public ResponseData<ShinseiSearchDiv> onClick_SelectButton(ShinseiSearchDiv div) {
        RString yoshikiNo = ViewStateHolder.get(ViewStateKeys.償還払申請一覧_様式番号, RString.class);
        if (yoshikiNo.startsWith(判定_21C)) {
            return ResponseData.of(div).forwardWithEventName(福祉用具購入費支給).respond();
        } else if (yoshikiNo.startsWith(判定_21D)) {
            return ResponseData.of(div).forwardWithEventName(住宅改修費支給申請).respond();
        } else {
            return ResponseData.of(div).forwardWithEventName(償還払い費支給申請).respond();
        }
    }
}
