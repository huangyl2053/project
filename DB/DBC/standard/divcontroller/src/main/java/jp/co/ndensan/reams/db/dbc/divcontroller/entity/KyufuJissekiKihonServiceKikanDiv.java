package jp.co.ndensan.reams.db.dbc.divcontroller.entity;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * KyufuJissekiKihonServiceKikan のクラスファイル 
 * 
 * @author 自動生成
 */
public class KyufuJissekiKihonServiceKikanDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtKyufuJissekiKihonKaishiYMD")
    private TextBox txtKyufuJissekiKihonKaishiYMD;
    @JsonProperty("txtKyufuJissekiKihonChushiYMD")
    private TextBox txtKyufuJissekiKihonChushiYMD;
    @JsonProperty("txtKyufuJissekiKihonChushiRiyu")
    private TextBox txtKyufuJissekiKihonChushiRiyu;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtKyufuJissekiKihonKaishiYMD")
    public TextBox getTxtKyufuJissekiKihonKaishiYMD() {
        return txtKyufuJissekiKihonKaishiYMD;
    }

    @JsonProperty("txtKyufuJissekiKihonKaishiYMD")
    public void setTxtKyufuJissekiKihonKaishiYMD(TextBox txtKyufuJissekiKihonKaishiYMD) {
        this.txtKyufuJissekiKihonKaishiYMD=txtKyufuJissekiKihonKaishiYMD;
    }

    @JsonProperty("txtKyufuJissekiKihonChushiYMD")
    public TextBox getTxtKyufuJissekiKihonChushiYMD() {
        return txtKyufuJissekiKihonChushiYMD;
    }

    @JsonProperty("txtKyufuJissekiKihonChushiYMD")
    public void setTxtKyufuJissekiKihonChushiYMD(TextBox txtKyufuJissekiKihonChushiYMD) {
        this.txtKyufuJissekiKihonChushiYMD=txtKyufuJissekiKihonChushiYMD;
    }

    @JsonProperty("txtKyufuJissekiKihonChushiRiyu")
    public TextBox getTxtKyufuJissekiKihonChushiRiyu() {
        return txtKyufuJissekiKihonChushiRiyu;
    }

    @JsonProperty("txtKyufuJissekiKihonChushiRiyu")
    public void setTxtKyufuJissekiKihonChushiRiyu(TextBox txtKyufuJissekiKihonChushiRiyu) {
        this.txtKyufuJissekiKihonChushiRiyu=txtKyufuJissekiKihonChushiRiyu;
    }

}