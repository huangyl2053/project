/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.divcontroller.controller.parentdiv.DBD6010004;

import jp.co.ndensan.reams.db.dbd.divcontroller.entity.parentdiv.DBD6010004.DBD6010004StateName;
import jp.co.ndensan.reams.db.dbd.divcontroller.entity.parentdiv.DBD6010004.SystemKanriTokubetsuChiikiTotalDiv;
import jp.co.ndensan.reams.db.dbd.divcontroller.handler.parentdiv.DBD6010004.SystemKanriTokubetsuChiikiTotalHandler;
import jp.co.ndensan.reams.db.dbd.divcontroller.handler.parentdiv.DBD6010004.SystemKanriTokubetsuChiikiTotalValidationHandler;
import jp.co.ndensan.reams.ur.urz.definition.message.UrInformationMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrQuestionMessages;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.message.MessageDialogSelectedResult;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ResponseHolder;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;

/**
 * システム管理登録（特別地域加算減免確認番号）画面のDivControllerです。
 *
 * @reamsid_L DBD-3763-010 tz_chengpeng
 */
public class SystemKanriTokubetsuChiikiTotal {

    /**
     * 画面初期化
     *
     * @param div SystemKanriTokubetsuChiikiTotalDiv
     * @return ResponseData<SystemKanriTokubetsuChiikiTotalDiv>
     */
    public ResponseData<SystemKanriTokubetsuChiikiTotalDiv> onLoad(SystemKanriTokubetsuChiikiTotalDiv div) {
        getHandler(div).initialize();
        return ResponseData.of(div).setState(DBD6010004StateName.初期状態);
    }

    /**
     * 「保存」ボタンの処理
     *
     * @param div SystemKanriTokubetsuChiikiTotalDiv
     * @return ResponseData<SystemKanriTokubetsuChiikiTotalDiv>
     */
    public ResponseData<SystemKanriTokubetsuChiikiTotalDiv> onClick_btnUpdate(SystemKanriTokubetsuChiikiTotalDiv div) {
        if (!ResponseHolder.isReRequest()) {
            ValidationMessageControlPairs pairs = getValidationHandler(div).validate();
            if (pairs.iterator().hasNext()) {
                return ResponseData.of(div).addValidationMessages(pairs).respond();
            }
            return ResponseData.of(div).addMessage(UrQuestionMessages.処理実行の確認.getMessage()).respond();
        }

        if (ResponseHolder.getButtonType() == MessageDialogSelectedResult.Yes) {
            getHandler(div).save画面項目();
            div.getKoshinKekkaKakunin().getCcdKaigoKanryoMessage().setSuccessMessage(new RString(UrInformationMessages.保存終了.getMessage().evaluate()));
            return ResponseData.of(div).setState(DBD6010004StateName.完了状態);
        } else {
            return ResponseData.of(div).respond();
        }
    }

    private SystemKanriTokubetsuChiikiTotalHandler getHandler(SystemKanriTokubetsuChiikiTotalDiv div) {
        return new SystemKanriTokubetsuChiikiTotalHandler(div);
    }

    private SystemKanriTokubetsuChiikiTotalValidationHandler getValidationHandler(SystemKanriTokubetsuChiikiTotalDiv div) {
        return new SystemKanriTokubetsuChiikiTotalValidationHandler(div);
    }
}