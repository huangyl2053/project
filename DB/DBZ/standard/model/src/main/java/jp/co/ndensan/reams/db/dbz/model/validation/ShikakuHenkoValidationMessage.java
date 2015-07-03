/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.model.validation;

import jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.message.DbzErrorMessages;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrErrorMessages;
import jp.co.ndensan.reams.uz.uza.message.IMessageGettable;
import jp.co.ndensan.reams.uz.uza.message.Message;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessage;

/**
 * 資格変更履歴のバリデーションメッセージを定義した列挙クラスです。
 *
 * @author N8235 船山 洋介
 */
public enum ShikakuHenkoValidationMessage implements IValidationMessage {

    /**
     * 届出日なし
     */
    届出日設定なし(DbzErrorMessages.終了日設定なし),
    /**
     * 変更日
     */
    変更日が未入力(DbzErrorMessages.必須項目を入力_追加メッセージあり, "資格変更年月日"),
    /**
     * 変更事由
     */
    変更事由が未入力(DbzErrorMessages.必須項目を入力_追加メッセージあり, "資格変更事由"),
    /**
     * 日付の前後関係が逆転（変更日が取得日より前）
     */
    取得日より前(UrErrorMessages.大小関係が不正, "変更日が、取得日以降でない"),
    /**
     * 日付の前後関係が逆転（変更日が喪失日より後）
     */
    喪失日より後(UrErrorMessages.大小関係が不正, "変更日が、喪失日以前でない"),
    /**
     * 変更日と次の履歴データの変更日の期間が重複
     */
    変更日と次の履歴データの変更日の期間が重複(DbzErrorMessages.大小関係が不正, "変更日 － 次履歴の変更日"),
    /**
     * 変更日と前の履歴データの変更日の期間が重複
     */
    変更日と前の履歴データの変更日の期間が重複(DbzErrorMessages.大小関係が不正, "変更日 － 前履歴の変更日"),
    /**
     * 住所地特例履歴と期間が重複する履歴がある
     */
    変更日と住所地特例履歴の期間が重複する履歴がある(DbzErrorMessages.期間が重複),
    /**
     * 最新の取得日として登録不可
     */
    最新の取得日として登録不可(DbzErrorMessages.確定不可, "最新の取得日として登録不可"),
    /**
     * 変更事由が１号到達で変更日時点での年齢が65歳未満
     */
    変更事由が１号到達で年齢が65歳未満(DbzErrorMessages.確定不可, "変更日時点での年齢が65歳未満"),
    /**
     * 変更事由が１号到達以外で変更日時点での年齢が40歳未満
     */
    変更事由が１号到達以外年齢が40歳未満(DbzErrorMessages.確定不可, "変更日時点での年齢が40歳未満");

    private final Message message;

    private ShikakuHenkoValidationMessage(IMessageGettable message, String... replacements) {
        this.message = message.getMessage().replace(replacements);
    }

    @Override
    public Message getMessage() {
        return message;
    }

}