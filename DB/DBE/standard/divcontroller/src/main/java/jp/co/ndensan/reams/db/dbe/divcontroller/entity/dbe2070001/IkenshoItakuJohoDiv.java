package jp.co.ndensan.reams.db.dbe.divcontroller.entity.dbe2070001;
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
 * IkenshoItakuJoho のクラスファイル 
 * 
 * @author 自動生成
 */
public class IkenshoItakuJohoDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtIryokikanNo")
    private TextBoxCode txtIryokikanNo;
    @JsonProperty("txtIryokikanMei")
    private TextBox txtIryokikanMei;
    @JsonProperty("imgIryokikanSearch")
    private StaticImage imgIryokikanSearch;
    @JsonProperty("txtIkenshoKinyubi")
    private TextBoxDate txtIkenshoKinyubi;
    @JsonProperty("txtShujiiNo")
    private TextBoxCode txtShujiiNo;
    @JsonProperty("txtShujiiMei")
    private TextBox txtShujiiMei;
    @JsonProperty("imgShujiiSearch")
    private StaticImage imgShujiiSearch;
    @JsonProperty("txtIkenshoJuryobi")
    private TextBoxDate txtIkenshoJuryobi;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtIryokikanNo")
    public TextBoxCode getTxtIryokikanNo() {
        return txtIryokikanNo;
    }

    @JsonProperty("txtIryokikanNo")
    public void setTxtIryokikanNo(TextBoxCode txtIryokikanNo) {
        this.txtIryokikanNo=txtIryokikanNo;
    }

    @JsonProperty("txtIryokikanMei")
    public TextBox getTxtIryokikanMei() {
        return txtIryokikanMei;
    }

    @JsonProperty("txtIryokikanMei")
    public void setTxtIryokikanMei(TextBox txtIryokikanMei) {
        this.txtIryokikanMei=txtIryokikanMei;
    }

    @JsonProperty("imgIryokikanSearch")
    public StaticImage getImgIryokikanSearch() {
        return imgIryokikanSearch;
    }

    @JsonProperty("imgIryokikanSearch")
    public void setImgIryokikanSearch(StaticImage imgIryokikanSearch) {
        this.imgIryokikanSearch=imgIryokikanSearch;
    }

    @JsonProperty("txtIkenshoKinyubi")
    public TextBoxDate getTxtIkenshoKinyubi() {
        return txtIkenshoKinyubi;
    }

    @JsonProperty("txtIkenshoKinyubi")
    public void setTxtIkenshoKinyubi(TextBoxDate txtIkenshoKinyubi) {
        this.txtIkenshoKinyubi=txtIkenshoKinyubi;
    }

    @JsonProperty("txtShujiiNo")
    public TextBoxCode getTxtShujiiNo() {
        return txtShujiiNo;
    }

    @JsonProperty("txtShujiiNo")
    public void setTxtShujiiNo(TextBoxCode txtShujiiNo) {
        this.txtShujiiNo=txtShujiiNo;
    }

    @JsonProperty("txtShujiiMei")
    public TextBox getTxtShujiiMei() {
        return txtShujiiMei;
    }

    @JsonProperty("txtShujiiMei")
    public void setTxtShujiiMei(TextBox txtShujiiMei) {
        this.txtShujiiMei=txtShujiiMei;
    }

    @JsonProperty("imgShujiiSearch")
    public StaticImage getImgShujiiSearch() {
        return imgShujiiSearch;
    }

    @JsonProperty("imgShujiiSearch")
    public void setImgShujiiSearch(StaticImage imgShujiiSearch) {
        this.imgShujiiSearch=imgShujiiSearch;
    }

    @JsonProperty("txtIkenshoJuryobi")
    public TextBoxDate getTxtIkenshoJuryobi() {
        return txtIkenshoJuryobi;
    }

    @JsonProperty("txtIkenshoJuryobi")
    public void setTxtIkenshoJuryobi(TextBoxDate txtIkenshoJuryobi) {
        this.txtIkenshoJuryobi=txtIkenshoJuryobi;
    }

}
