/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.controller.parentdiv.DBC0600011;

import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.fukushiyogukonyuhishikyushisei.FukushiyouguKonyuhiShikyuShinseiResult;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0600011.DBC0600011TransitionEventName;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0600011.PnlTotalDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.handler.parentdiv.DBC0600011.PnlTotalHandler;
import jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.ViewStateKeys;
import jp.co.ndensan.reams.db.dbc.service.core.fukushiyogukonyuhishikyushisei.FukushiyoguKonyuhiShikyuShinsei;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.divcontroller.util.viewstate.ViewStateKey;
import jp.co.ndensan.reams.db.dbz.service.TaishoshaKey;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ResponseHolder;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 * 福祉用具購入費支給申請_検索
 *
 * @reamsid_L DBC-1020-020 yangchenbing
 */
public class PnlTotal {

    private static final RString 登録 = new RString("登録");
    private static final RString 差額登録 = new RString("差額登録");
    private static final RString 修正 = new RString("修正");
    private static final RString 削除 = new RString("削除");

    /**
     * 画面初期化
     *
     * @param div 画面DIV
     * @return 福祉用具購入費支給申請
     */
    public ResponseData<PnlTotalDiv> onLoad(PnlTotalDiv div) {
        TaishoshaKey key = ViewStateHolder.get(ViewStateKey.資格対象者, TaishoshaKey.class);
        ShikibetsuCode 識別コード = key.get識別コード();
        HihokenshaNo 被保険者番号 = key.get被保険者番号();
        ViewStateHolder.put(ViewStateKeys.識別コード, 識別コード.value());
        ViewStateHolder.put(ViewStateKeys.被保険者番号, 被保険者番号);
        div.getKaigoCommonPanel().getCcdAtenaInfo().onLoad(識別コード);
        div.getKaigoCommonPanel().getCcdShikakuKihon().onLoad(被保険者番号);
        PnlTotalHandler handler = getHandler(div);
        List<FukushiyouguKonyuhiShikyuShinseiResult> list = FukushiyoguKonyuhiShikyuShinsei.createInstance().
                getShokanShikyuShinseiList(被保険者番号);
        handler.initializedgShikyuShinseiList(list);
        if (差額登録.equals(ResponseHolder.getState())) {
            div.getYoguKonyuhiShikyuShinseiList().getBtnAddShikyuShinsei().setDisabled(true);
            div.getYoguKonyuhiShikyuShinseiList().getDgShikyuShinseiList().getGridSetting().setIsShowSelectButtonColumn(false);
            div.getYoguKonyuhiShikyuShinseiList().getDgShikyuShinseiList().getGridSetting().setIsShowDeleteButtonColumn(false);
            div.getYoguKonyuhiShikyuShinseiList().getDgShikyuShinseiList().getGridSetting().setIsShowModifyButtonColumn(true);
        }
        return ResponseData.of(div).respond();
    }

    /**
     * 福祉用具購入費支給申請の申請を追加
     *
     * @param div 画面DIV
     * @return 福祉用具購入費支給申請_登録画面へ遷移
     */
    public ResponseData<PnlTotalDiv> onClick_btnAddShikyuShinsei(PnlTotalDiv div) {
        ViewStateHolder.put(ViewStateKeys.状態, 登録);
        return ResponseData.of(div).forwardWithEventName(DBC0600011TransitionEventName.明細情報).respond();
    }

    /**
     * 福祉用具購入費支給申請の申請グレードの選択
     *
     * @param div 画面DIV
     * @return 福祉用具購入費支給申請_登録画面へ遷移
     */
    public ResponseData<PnlTotalDiv> onClick_byselectbutton(PnlTotalDiv div) {
        return ResponseData.of(div).forwardWithEventName(DBC0600011TransitionEventName.明細情報).respond();
    }

    /**
     * 福祉用具購入費支給申請の申請グレードの修正
     *
     * @param div 画面DIV
     * @return 福祉用具購入費支給申請_登録画面へ遷移
     */
    public ResponseData<PnlTotalDiv> onClick_dgShikyuShinseiList_modify(PnlTotalDiv div) {
        RString 登録状態 = ResponseHolder.getState();

        if (登録状態.equals(差額登録)) {
            getHandler(div).putViewStateHolder(差額登録);
        } else {
            getHandler(div).putViewStateHolder(修正);
        }
        return ResponseData.of(div).forwardWithEventName(DBC0600011TransitionEventName.明細情報).respond();
    }

    /**
     * 福祉用具購入費支給申請の申請グレードの削除
     *
     * @param div 画面DIV
     * @return 福祉用具購入費支給申請_登録画面へ遷移
     */
    public ResponseData<PnlTotalDiv> onClick_dgShikyuShinseiList_delete(PnlTotalDiv div) {
        getHandler(div).putViewStateHolder(削除);
        return ResponseData.of(div).forwardWithEventName(DBC0600011TransitionEventName.明細情報).respond();
    }

    /**
     * 福祉用具購入費支給申請の該当者一覧画面へ遷移する。
     *
     * @param div 画面DIV
     * @return 福祉用具購入費支給申請の一覧画面
     */
    public ResponseData<PnlTotalDiv> onClick_btnBackToIchiran(PnlTotalDiv div) {
        return ResponseData.of(div).forwardWithEventName(DBC0600011TransitionEventName.一覧に戻る).respond();
    }

    /**
     * 福祉用具購入費支給申請の該当者検索画面へ遷移する。
     *
     * @param div 画面DIV
     * @return 福祉用具購入費支給申請の検索へ遷移
     */
    public ResponseData<PnlTotalDiv> onClick_btnBackToKensaku(PnlTotalDiv div) {
        return ResponseData.of(div).forwardWithEventName(DBC0600011TransitionEventName.検索に戻る).respond();
    }

    private PnlTotalHandler getHandler(PnlTotalDiv div) {
        return PnlTotalHandler.of(div);
    }
}
