/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.message;

import static jp.co.ndensan.reams.db.dbz.definition.message.MessageCreateHelper.toCode;
import jp.co.ndensan.reams.uz.uza.message.IMessageGettable;
import jp.co.ndensan.reams.uz.uza.message.InformationMessage;
import jp.co.ndensan.reams.uz.uza.message.Message;

/**
 * DBEのインフォメーションメッセージ定義列挙型です。
 *
 * @reamsid_L DBE-9999-023 liangbc
 */
public enum DbeInformationMessages implements IMessageGettable {

    割付申請者人数が最大割付可能人数を超過(1, "割付申請者人数が最大割付可能人数を超えています。"),
    審査会自動割付できない申請者(2, "審査会自動割付できない申請者がいます。"),
    一次判定処理完了(3, "一次判定処理を完了しました。"),
    対象者の割り当てがありません(4, "対象者の割り当てがありません。"),
    一次判定再処理(5, "以前に一次判定を行っています。一次判定をし直してください。"),
    審査会結果登録済み_イメージ削除不可(6, "審査会の結果が登録済みのため、イメージを削除することはできません。"),
    削除可能なイメージ情報なし(7, "削除可能なイメージ情報はありません。"),
    基本運用_完了(8, "?の保存処理が完了しました。"),
    市町村変更による再入力(9, "市町村が変更されたので、?の入力をクリアしました。<br>?を入力し直してください。");

    private final Message message;

    /**
     * コンストラクタです。
     *
     * @param no 番号
     * @param message メッセージ
     */
    private DbeInformationMessages(int no, String message) {
        this.message = new InformationMessage(toCode("DBEI", no), message);
    }

    @Override
    public Message getMessage() {
        return message;
    }
}
