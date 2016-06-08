/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.message;

import static jp.co.ndensan.reams.db.dbz.definition.message.MessageCreateHelper.toCode;
import jp.co.ndensan.reams.uz.uza.message.IMessageGettable;
import jp.co.ndensan.reams.uz.uza.message.Message;
import jp.co.ndensan.reams.uz.uza.message.QuestionMessage;

/**
 * DBCの質問メッセージ定義列挙型です。
 *
 * @reamsid_L DBC-9999-023 liangbc
 */
public enum DbcQuestionMessages implements IMessageGettable {

    要介護状態区分変更_限度額リセット対象(1, "要介護状態区分3段階変更による限度額リセット対象です。"
            + "「要介護状態区分3段階変更による」をチェックしてよろしいですか？"),
    要介護状態区分変更_限度額リセット対象外(2, "要介護状態区分3段階変更による限度額リセット対象外です。"
            + "｢要介護状態区分3段階変更による｣をチェックしないでよろしいですか？"),
    改修住所変更_限度額リセット対象(3, "改修住所変更による限度額リセット対象です。｢住宅住所変更による｣をチェックしてよろしいですか？"),
    改修住所変更_限度額リセット対象外(4, "改修住所変更による限度額リセット対象外です。｢住宅住所変更による｣をチェックしないでよろしいですか？"),
    限度額変更確認(5, "住宅改修情報が変更されています。限度額の確認はよろしいですか？"),
    領収日不一致_提供年月変更確認(6, "領収日が提供（着工）年月と一致しません。提供（着工）年月を?に変更します。よろしいですか？"),
    旧措置者_保存確認(7, "該当保険者が旧措置者です。申請内容を保存してよろしいですか？"),
    高額合算支給申請検索_処理不可(8, "指定されたデータは\"未計算\"または\"取下げ\"状態にあるため、<br>更新処理ができません。"
            + "指定したデータを照会モードで参照しますか？"),
    高額合算支給申請検索_訂正(9, "送信済みのデータです。<br>処理を継続しますか？"),
    年次負担割合再処理(10, "年次負担割合判定を実行すると、?年度の利用者負担割合情報は全件削除した上で再判定、再登録します。"
            + "<br>異動者について判定する場合、異動分負担割合判定処理を実行してください。<br>年次負担割合判定を実行しますか？"),
    限度余裕確認(11, "種類限度基準超過にサービス単位が割り振られていますが、限度額に余裕があります。この設定でよろしいですか？"),
    給付率修正確認(12, "当該被保険者の利用者負担割合は「?」割（給付率 & viewState.給付率 & %）です。\\nこのまま設定された給付率で確定してよろしいですか？");

    private final Message message;

    /**
     * コンストラクタです。
     *
     * @param no 番号
     * @param message メッセージ
     */
    private DbcQuestionMessages(int no, String message) {
        this.message = new QuestionMessage(toCode("DBCQ", no), message);
    }

    @Override
    public Message getMessage() {
        return message;
    }
}
