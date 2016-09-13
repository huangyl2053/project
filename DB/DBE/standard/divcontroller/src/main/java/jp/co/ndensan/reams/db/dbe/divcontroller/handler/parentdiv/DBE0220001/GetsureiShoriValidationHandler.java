/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.divcontroller.handler.parentdiv.DBE0220001;

import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.uz.uza.message.IMessageGettable;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessage;
import jp.co.ndensan.reams.uz.uza.message.Message;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPair;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;

/**
 * 完了処理・センター送信のValidationHandlerクラスです。
 *
 * @reamsid_L DBE-1520-010 lishengli
 */
public class GetsureiShoriValidationHandler {

    /**
     * コンストラクタです。
     *
     */
    public GetsureiShoriValidationHandler() {
    }

    /**
     * センター送信完了対象者一覧データの存在チェックを行います。
     *
     * @param pairs バリデーションコントロール
     * @return バリデーション結果
     */
    public ValidationMessageControlPairs センター送信完了対象者一覧データの存在チェック(ValidationMessageControlPairs pairs) {
        pairs.add(new ValidationMessageControlPair(GetsureiShoriMessages.センター送信完了対象者一覧データの存在チェック));
        return pairs;
    }

    /**
     * センター送信完了対象者一覧データの行選択チェックを行います。
     *
     * @param pairs バリデーションコントロール
     * @return バリデーション結果
     */
    public ValidationMessageControlPairs センター送信完了対象者一覧データの行選択チェック(ValidationMessageControlPairs pairs) {
        pairs.add(new ValidationMessageControlPair(GetsureiShoriMessages.センター送信完了対象者一覧データの行選択チェック));
        return pairs;
    }

    /**
     * センター送信完了対象者一覧選択行の完了処理事前チェックを行います。
     *
     * @param pairs バリデーションコントロール
     * @return バリデーション結果
     */
    public ValidationMessageControlPairs センター送信完了対象者一覧選択行の完了処理事前チェック(ValidationMessageControlPairs pairs) {
        pairs.add(new ValidationMessageControlPair(GetsureiShoriMessages.センター送信完了対象者一覧選択行の完了処理事前チェック));
        return pairs;
    }

    private static enum GetsureiShoriMessages implements IValidationMessage {

        センター送信完了対象者一覧データの存在チェック(UrErrorMessages.該当データなし),
        センター送信完了対象者一覧データの行選択チェック(UrErrorMessages.対象行を選択),
        センター送信完了対象者一覧選択行の完了処理事前チェック(UrErrorMessages.更新不可_汎用, "センター未送信");
        private final Message message;

        private GetsureiShoriMessages(IMessageGettable message, String... replacements) {
            this.message = message.getMessage().replace(replacements);
        }

        @Override
        public Message getMessage() {
            return message;
        }
    }
}