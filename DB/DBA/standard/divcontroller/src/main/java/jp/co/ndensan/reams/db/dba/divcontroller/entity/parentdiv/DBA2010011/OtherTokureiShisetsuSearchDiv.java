package jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA2010011;

/**
 * このコードはツールによって生成されました。 このファイルへの変更は、再生成時には損失するため 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * OtherTokureiShisetsuSearch のクラスファイル
 *
 */
public class OtherTokureiShisetsuSearchDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */

    @JsonProperty("radKannaiKangaiKubun")
    private RadioButton radKannaiKangaiKubun;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("radKannaiKangaiKubun")
    public RadioButton getRadKannaiKangaiKubun() {
        return radKannaiKangaiKubun;
    }

    @JsonProperty("radKannaiKangaiKubun")
    public void setRadKannaiKangaiKubun(RadioButton radKannaiKangaiKubun) {
        this.radKannaiKangaiKubun = radKannaiKangaiKubun;
    }

}
