/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.divcontroller.controller.parentdiv.DBA1030011;

import jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA1030011.DBA1030011StateName;
import jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA1030011.DBA1030011TransitionEventName;
import jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA1030011.ShikakuSoshitsuIdoTotalDiv;
import jp.co.ndensan.reams.db.dba.divcontroller.handler.parentdiv.DBA1030011.ShikakuSoshitsuIdoTotalHandler;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.ShikakuTokusoRireki.dgShikakuShutokuRireki_Row;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrInformationMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrQuestionMessages;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.exclusion.LockingKey;
import jp.co.ndensan.reams.uz.uza.exclusion.RealInitialLocker;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.message.IMessageGettable;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessage;
import jp.co.ndensan.reams.uz.uza.message.Message;
import jp.co.ndensan.reams.uz.uza.message.MessageDialogSelectedResult;
import jp.co.ndensan.reams.uz.uza.message.QuestionMessage;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ResponseHolder;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPair;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;

/**
 * 資格喪失異動の対象者情報を表示するためのDivControllerです。
 *
 * @reamsid_L DBA-0552-030 wangkun
 */
public class ShikakuSoshitsuIdoTotal {

    private static final LockingKey 前排他ロックキー = new LockingKey("ShikakuSoshitsuIdo");
    private static final RString DEFAULT = new RString("被保履歴");
    private static final RString IRYOU = new RString("医療保険");
    private static final RString RONEN = new RString("老福年金");
    private static final RString SHISETSU = new RString("施設入退所");
    private static final RString SHORUIJOKYO = new RString("証類状況");
    private static final RString 修正 = new RString("修正");

    /**
     * 資格喪失異動の初期化します。
     *
     * @param div ShikakuSoshitsuIdoTotalDiv
     * @return レスポンス
     */
    public ResponseData<ShikakuSoshitsuIdoTotalDiv> onLoad(ShikakuSoshitsuIdoTotalDiv div) {
        createHandler(div).load();
        if (!RealInitialLocker.tryGetLock(前排他ロックキー)) {
            div.setReadOnly(true);
            ValidationMessageControlPairs validationMessages = new ValidationMessageControlPairs();
            validationMessages.add(new ValidationMessageControlPair(ShikakuSoshitsuIdoErrorMessage.排他_他のユーザが使用中));
            return ResponseData.of(div).addValidationMessages(validationMessages).respond();
        }
        return ResponseData.of(div).respond();
    }

    /**
     * 資格喪失異動タブの切替処理します。
     *
     * @param div ShikakuSoshitsuIdoTotalDiv
     * @return レスポンス
     */
    public ResponseData<ShikakuSoshitsuIdoTotalDiv> onChange_tabInputs(ShikakuSoshitsuIdoTotalDiv div) {
        ResponseData<ShikakuSoshitsuIdoTotalDiv> response = new ResponseData<>();
        RString title = div.getShikakuSoshitsuJoho().getTabInputs().getSelectedItem().getTitle();
        if (DEFAULT.equals(title)) {
            createHandler(div).onOpenTplDefault();
        } else if (IRYOU.equals(title)) {
            createHandler(div).onOpenTplIryou();
        } else if (RONEN.equals(title)) {
            createHandler(div).onOpenTplRoNen();
        } else if (SHISETSU.equals(title)) {
            createHandler(div).onOpenTplShisetsu();
        } else if (SHORUIJOKYO.equals(title)) {
            createHandler(div).onOpenTplShoruiJokyo();
        }
        response.data = div;
        return response;
    }

    /**
     * 「資格情報を保存する」ボタン処理します。
     *
     * @param div ShikakuSoshitsuIdoTotalDiv
     * @return レスポンス
     */
    public ResponseData<ShikakuSoshitsuIdoTotalDiv> onClick_btnUpdate(ShikakuSoshitsuIdoTotalDiv div) {
        ResponseData<ShikakuSoshitsuIdoTotalDiv> response = new ResponseData<>();
        if (!ResponseHolder.isReRequest()) {
            QuestionMessage message = new QuestionMessage(UrQuestionMessages.処理実行の確認.getMessage().getCode(),
                    UrQuestionMessages.処理実行の確認.getMessage().evaluate());
            return ResponseData.of(div).addMessage(message).respond();
        }
        if (new RString(UrQuestionMessages.処理実行の確認.getMessage().getCode()).equals(ResponseHolder.getMessageCode())
                && ResponseHolder.getButtonType() == MessageDialogSelectedResult.Yes) {
            createHandler(div).save();
            RealInitialLocker.release(前排他ロックキー);
            div.getComplete().getCcdKaigoKanryoMessage().setSuccessMessage(new RString(UrInformationMessages.保存終了.getMessage().evaluate()));
            return ResponseData.of(div).setState(DBA1030011StateName.完了状態);
        }
        response.data = div;
        return response;
    }

    /**
     * 「資格情報を詳細」ボタン処理します。
     *
     * @param div ShikakuSoshitsuIdoTotalDiv
     * @return レスポンス
     */
    public ResponseData<ShikakuSoshitsuIdoTotalDiv> onClick_btnSyouHoSo(ShikakuSoshitsuIdoTotalDiv div) {
        RealInitialLocker.release(前排他ロックキー);
        return ResponseData.of(div).forwardWithEventName(DBA1030011TransitionEventName.詳細へ).respond();
    }

    /**
     * 「戻る」ボタン処理します。
     *
     * @param div ShikakuSoshitsuIdoTotalDiv
     * @return レスポンス
     */
    public ResponseData<ShikakuSoshitsuIdoTotalDiv> onClick_btnBack(ShikakuSoshitsuIdoTotalDiv div) {
        RealInitialLocker.release(前排他ロックキー);
        return ResponseData.of(div).forwardWithEventName(DBA1030011TransitionEventName.再検索).respond();
    }

    /**
     * 「資格得喪履歴を修正する」ボタン処理します。
     *
     * @param div ShikakuSoshitsuIdoTotalDiv
     * @return レスポンス
     */
    public ResponseData<ShikakuSoshitsuIdoTotalDiv> onClick_ModifyButton(ShikakuSoshitsuIdoTotalDiv div) {
        ResponseData<ShikakuSoshitsuIdoTotalDiv> response = new ResponseData<>();
        div.getShikakuSoshitsuJoho().getShikakuTokusoRirekiMain().getShikakuSoshitsuInput().setDisabled(false);
        dgShikakuShutokuRireki_Row row = div.getShikakuSoshitsuJoho().getShikakuTokusoRirekiMain().getCcdShikakuTokusoRireki()
                .getDataGridSelectItem();
        div.getShikakuSoshitsuJoho().getShikakuTokusoRirekiMain().getShikakuSoshitsuInput().getTxtShutokuDate()
                .setValue(row.getSoshitsuDate().getValue());
        div.getShikakuSoshitsuJoho().getShikakuTokusoRirekiMain().getShikakuSoshitsuInput().getTxtShutokuTodokedeDate()
                .setValue(row.getSoshitsuTodokedeDate().getValue());
        if (!RString.isNullOrEmpty(row.getSoshitsuJiyuKey())) {
            div.getShikakuSoshitsuJoho().getShikakuTokusoRirekiMain().getShikakuSoshitsuInput().getDdlShikakuShutokuJiyu()
                    .setSelectedKey(row.getSoshitsuJiyuKey());
        }
        response.data = div;
        return response;
    }

    /**
     * 「資格得喪履歴を確定する」ボタン処理します。
     *
     * @param div ShikakuSoshitsuIdoTotalDiv
     * @return レスポンス
     */
    public ResponseData<ShikakuSoshitsuIdoTotalDiv> onClick_btnKakutei(ShikakuSoshitsuIdoTotalDiv div) {
        ResponseData<ShikakuSoshitsuIdoTotalDiv> response = new ResponseData<>();
        dgShikakuShutokuRireki_Row row = div.getShikakuSoshitsuJoho().getShikakuTokusoRirekiMain().getCcdShikakuTokusoRireki().getDataGridSelectItem();
        if (row != null) {
            row.getShutokuDate().setValue(div.getShikakuSoshitsuJoho().getShikakuTokusoRirekiMain().getShikakuSoshitsuInput()
                    .getTxtShutokuDate().getValue());
            row.getShutokuTodokedeDate().setValue(div.getShikakuSoshitsuJoho().getShikakuTokusoRirekiMain().getShikakuSoshitsuInput()
                    .getTxtShutokuTodokedeDate().getValue());
            row.setShutokuJiyu(div.getShikakuSoshitsuJoho().getShikakuTokusoRirekiMain().getShikakuSoshitsuInput()
                    .getDdlShikakuShutokuJiyu().getSelectedValue());
            row.setShutokuJiyuKey(div.getShikakuSoshitsuJoho().getShikakuTokusoRirekiMain().getShikakuSoshitsuInput()
                    .getDdlShikakuShutokuJiyu().getSelectedKey());
            row.setState(修正);
            div.getShikakuSoshitsuJoho().getShikakuTokusoRirekiMain().getCcdShikakuTokusoRireki().setDataGridSelectItem(row);
            createHandler(div).資格喪失情報パネルの初期化();
            div.getShikakuSoshitsuJoho().getShikakuTokusoRirekiMain().getShikakuSoshitsuInput().setDisabled(true);
        }
        response.data = div;
        return response;
    }

    /**
     * 「資格得喪履歴を取消する」ボタン処理します。
     *
     * @param div ShikakuSoshitsuIdoTotalDiv
     * @return レスポンス
     */
    public ResponseData<ShikakuSoshitsuIdoTotalDiv> onClick_btnTorikeshi(ShikakuSoshitsuIdoTotalDiv div) {
        ResponseData<ShikakuSoshitsuIdoTotalDiv> response = new ResponseData<>();
        createHandler(div).資格喪失情報パネルの初期化();
        response.data = div;
        return response;
    }

    private enum ShikakuSoshitsuIdoErrorMessage implements IValidationMessage {

        排他_他のユーザが使用中(UrErrorMessages.排他_他のユーザが使用中);
        private final Message message;

        private ShikakuSoshitsuIdoErrorMessage(IMessageGettable message) {
            this.message = message.getMessage();
        }

        @Override
        public Message getMessage() {
            return message;
        }
    }

    private ShikakuSoshitsuIdoTotalHandler createHandler(ShikakuSoshitsuIdoTotalDiv div) {
        return new ShikakuSoshitsuIdoTotalHandler(div);
    }
}
