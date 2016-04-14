/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.controller.parentdiv.DBC0710011;

import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0710011.DBC0710011StateName;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0710011.DBC0710011TransitionEventName;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0710011.JutakuKaishuShinseiDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.handler.dbc0710011.JutakuKaishuShinseiHandler;
import jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.ViewStateKeys;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.message.DbzErrorMessages;
import jp.co.ndensan.reams.db.dbz.divcontroller.util.viewstate.ViewStateKey;
import jp.co.ndensan.reams.db.dbz.service.TaishoshaKey;
import jp.co.ndensan.reams.ur.urz.definition.message.UrQuestionMessages;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.ApplicationException;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.message.MessageDialogSelectedResult;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ResponseHolder;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 * 住宅改修費支給申請クラスです
 *
 * @reamsid_L DBC-0992-100 yebangqiang
 */
public class JutakuKaishuShinsei {

    private static final RString 申請区分事前申請 = new RString("1");
    private final RString 申請区分取消 = new RString("9");

    /**
     * 画面ロードメソッド
     *
     * @param div 住宅改修費支給申請DIV
     * @return 画面初期化
     */
    public ResponseData<JutakuKaishuShinseiDiv> onLoad(JutakuKaishuShinseiDiv div) {
        TaishoshaKey key = ViewStateHolder.get(ViewStateKey.資格対象者, TaishoshaKey.class);
        ShikibetsuCode 識別コード = key.get識別コード();
        HihokenshaNo 被保険者番号 = key.get被保険者番号();
        div.getJutakuKaishuShinseiHihokenshaPanel().getKaigoAtenaInfo().onLoad(識別コード);
        div.getJutakuKaishuShinseiHihokenshaPanel().getKaigoShikakuKihon().onLoad(識別コード);
        JutakuKaishuShinseiHandler handler = getHandler(div);
        RString 画面モード = ResponseHolder.getState();
        handler.onLoad(被保険者番号, 画面モード);
        ViewStateHolder.put(ViewStateKeys.識別コード, 識別コード);
        ViewStateHolder.put(ViewStateKeys.被保険者番号, 被保険者番号);
        return ResponseData.of(div).respond();
    }

    /**
     * 申請を追加するメソッド
     *
     * @param div 住宅改修費支給申請DIV
     * @return 本画面
     */
    public ResponseData<JutakuKaishuShinseiDiv> onClick_btnAddShinsei(JutakuKaishuShinseiDiv div) {
        JutakuKaishuShinseiHandler handler = getHandler(div);
        handler.setAddMode();
        return ResponseData.of(div).forwardWithEventName(DBC0710011TransitionEventName.to申請登録)
                .parameter(ResponseHolder.getState());
    }

    /**
     * 該当行の修正するメソッド
     *
     * @param div 住宅改修費支給申請DIV
     * @return 本画面
     */
    public ResponseData<JutakuKaishuShinseiDiv> onClick_btnModify(JutakuKaishuShinseiDiv div) {
        JutakuKaishuShinseiHandler handler = getHandler(div);
        RString 画面モード = ResponseHolder.getState();
        handler.setModifyMode(画面モード);
        return ResponseData.of(div).forwardWithEventName(DBC0710011TransitionEventName.to申請登録)
                .parameter(ResponseHolder.getState());
    }

    /**
     * 該当行の削除するメソッド
     *
     * @param div 住宅改修費支給申請DIV
     * @return 本画面
     */
    public ResponseData<JutakuKaishuShinseiDiv> onClick_btnDelete(JutakuKaishuShinseiDiv div) {
        JutakuKaishuShinseiHandler handler = getHandler(div);
        RString 画面モード = ResponseHolder.getState();
        handler.setDeleteMode();
        RString 申請区分 = div.getJutakuKaishuShinseiList().getDgJutakuKaishuShinseiList().getClickedItem()
                .getTxtShinseiKubun();
        if (画面モード.equals(DBC0710011StateName.支給申請モード.getName()) && !申請区分事前申請.equals(申請区分)) {
            return ResponseData.of(div).forwardWithEventName(DBC0710011TransitionEventName.to申請登録)
                    .parameter(DBC0710011StateName.支給申請モード.getName());
        } else if ((画面モード.equals(DBC0710011StateName.事前申請モード.getName())
                || 画面モード.equals(DBC0710011StateName.支給申請モード.getName()) && 申請区分事前申請.equals(申請区分))) {
            return ResponseData.of(div).forwardWithEventName(DBC0710011TransitionEventName.to申請登録)
                    .parameter(DBC0710011StateName.事前申請モード.getName());
        }
        return ResponseData.of(div).respond();
    }

    /**
     * 該当行の取り消しするメソッド
     *
     * @param div 住宅改修費支給申請DIV
     * @return 本画面
     */
    public ResponseData<JutakuKaishuShinseiDiv> onClick_btnCancel(JutakuKaishuShinseiDiv div) {
        RString 申請区分 = div.getJutakuKaishuShinseiList().getDgJutakuKaishuShinseiList().getClickedItem()
                .getTxtShinseiKubun();
        if (申請区分取消.equals(申請区分)) {
            throw new ApplicationException(DbzErrorMessages.実行不可.getMessage().replace("該当データが既に取消されている", "取消").evaluate());
        }
        JutakuKaishuShinseiHandler handler = getHandler(div);
        handler.setCancelMode();
        return ResponseData.of(div).forwardWithEventName(DBC0710011TransitionEventName.to申請登録)
                .parameter(ResponseHolder.getState());
    }

    /**
     * 個人検索へ戻るメソッド
     *
     * @param div 住宅改修費支給申請DIV
     * @return 本画面
     */
    public ResponseData<JutakuKaishuShinseiDiv> onClick_btnBackSearch(JutakuKaishuShinseiDiv div) {
        if (!ResponseHolder.isReRequest()) {
            return ResponseData.of(div).addMessage(UrQuestionMessages.画面遷移の確認.getMessage()).respond();
        }
        if (new RString(UrQuestionMessages.画面遷移の確認.getMessage().getCode()).equals(
                ResponseHolder.getMessageCode()) && ResponseHolder.getButtonType() == MessageDialogSelectedResult.Yes) {
            return ResponseData.of(div).forwardWithEventName(DBC0710011TransitionEventName.検索条件).respond();
        }
        return ResponseData.of(div).respond();
    }

    /**
     * 該当者一覧へ戻るメソッド
     *
     * @param div 住宅改修費支給申請DIV
     * @return 本画面
     */
    public ResponseData<JutakuKaishuShinseiDiv> onClick_btnBackResult(JutakuKaishuShinseiDiv div) {
        if (!ResponseHolder.isReRequest()) {
            return ResponseData.of(div).addMessage(UrQuestionMessages.検索画面遷移の確認.getMessage()).respond();
        }
        if (new RString(UrQuestionMessages.検索画面遷移の確認.getMessage().getCode()).equals(
                ResponseHolder.getMessageCode()) && ResponseHolder.getButtonType() == MessageDialogSelectedResult.Yes) {
            return ResponseData.of(div).forwardWithEventName(DBC0710011TransitionEventName.該当者一覧).respond();
        }
        return ResponseData.of(div).respond();
    }

    private JutakuKaishuShinseiHandler getHandler(JutakuKaishuShinseiDiv div) {
        return JutakuKaishuShinseiHandler.of(div);
    }
}
