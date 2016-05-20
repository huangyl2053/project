/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.definition.message;

import jp.co.ndensan.reams.uz.uza.message.IMessageGettable;
import jp.co.ndensan.reams.uz.uza.message.Message;
import jp.co.ndensan.reams.uz.uza.message.InformationMessage;
import static jp.co.ndensan.reams.db.dbz.definition.message.MessageCreateHelper.toCode;

/**
 * DBUのインフォメーションメッセージ定義列挙型です。
 *
 * @author N9606 漢那 憲作
 */
public enum DbuInformationMessages implements IMessageGettable {

    // TODO 一つ目の要素が定義されたらこの要素は削除する。
    ダミーメッセージ(0, "");

    private final Message message;

    /**
     * コンストラクタです。
     *
     * @param no 番号
     * @param message メッセージ
     */
    private DbuInformationMessages(int no, String message) {
        this.message = new InformationMessage(toCode("DBUI", no), message);
    }

    @Override
    public Message getMessage() {
        return message;
    }
}
