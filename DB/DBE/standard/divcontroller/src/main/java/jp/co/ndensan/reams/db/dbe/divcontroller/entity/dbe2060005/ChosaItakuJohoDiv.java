package jp.co.ndensan.reams.db.dbe.divcontroller.entity.dbe2060005;
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
 * ChosaItakuJoho のクラスファイル 
 * 
 * @author 自動生成
 */
public class ChosaItakuJohoDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtChosakikanNo")
    private TextBoxCode txtChosakikanNo;
    @JsonProperty("btnChosakikanSearch")
    private ButtonDialog btnChosakikanSearch;
    @JsonProperty("txtChosakikanMei")
    private TextBox txtChosakikanMei;
    @JsonProperty("txtChosaJissibi")
    private TextBoxDate txtChosaJissibi;
    @JsonProperty("txtChosainNo")
    private TextBoxCode txtChosainNo;
    @JsonProperty("btnChosainSearch")
    private ButtonDialog btnChosainSearch;
    @JsonProperty("txtChosainMei")
    private TextBox txtChosainMei;
    @JsonProperty("txtChosahyoJuryobi")
    private TextBoxDate txtChosahyoJuryobi;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtChosakikanNo")
    public TextBoxCode getTxtChosakikanNo() {
        return txtChosakikanNo;
    }

    @JsonProperty("txtChosakikanNo")
    public void setTxtChosakikanNo(TextBoxCode txtChosakikanNo) {
        this.txtChosakikanNo=txtChosakikanNo;
    }

    @JsonProperty("btnChosakikanSearch")
    public ButtonDialog getBtnChosakikanSearch() {
        return btnChosakikanSearch;
    }

    @JsonProperty("btnChosakikanSearch")
    public void setBtnChosakikanSearch(ButtonDialog btnChosakikanSearch) {
        this.btnChosakikanSearch=btnChosakikanSearch;
    }

    @JsonProperty("txtChosakikanMei")
    public TextBox getTxtChosakikanMei() {
        return txtChosakikanMei;
    }

    @JsonProperty("txtChosakikanMei")
    public void setTxtChosakikanMei(TextBox txtChosakikanMei) {
        this.txtChosakikanMei=txtChosakikanMei;
    }

    @JsonProperty("txtChosaJissibi")
    public TextBoxDate getTxtChosaJissibi() {
        return txtChosaJissibi;
    }

    @JsonProperty("txtChosaJissibi")
    public void setTxtChosaJissibi(TextBoxDate txtChosaJissibi) {
        this.txtChosaJissibi=txtChosaJissibi;
    }

    @JsonProperty("txtChosainNo")
    public TextBoxCode getTxtChosainNo() {
        return txtChosainNo;
    }

    @JsonProperty("txtChosainNo")
    public void setTxtChosainNo(TextBoxCode txtChosainNo) {
        this.txtChosainNo=txtChosainNo;
    }

    @JsonProperty("btnChosainSearch")
    public ButtonDialog getBtnChosainSearch() {
        return btnChosainSearch;
    }

    @JsonProperty("btnChosainSearch")
    public void setBtnChosainSearch(ButtonDialog btnChosainSearch) {
        this.btnChosainSearch=btnChosainSearch;
    }

    @JsonProperty("txtChosainMei")
    public TextBox getTxtChosainMei() {
        return txtChosainMei;
    }

    @JsonProperty("txtChosainMei")
    public void setTxtChosainMei(TextBox txtChosainMei) {
        this.txtChosainMei=txtChosainMei;
    }

    @JsonProperty("txtChosahyoJuryobi")
    public TextBoxDate getTxtChosahyoJuryobi() {
        return txtChosahyoJuryobi;
    }

    @JsonProperty("txtChosahyoJuryobi")
    public void setTxtChosahyoJuryobi(TextBoxDate txtChosahyoJuryobi) {
        this.txtChosahyoJuryobi=txtChosahyoJuryobi;
    }

}
