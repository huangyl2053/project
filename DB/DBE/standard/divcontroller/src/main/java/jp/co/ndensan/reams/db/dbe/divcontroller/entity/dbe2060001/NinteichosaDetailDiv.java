package jp.co.ndensan.reams.db.dbe.divcontroller.entity.dbe2060001;
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
 * NinteichosaDetail のクラスファイル 
 * 
 * @author 自動生成
 */
public class NinteichosaDetailDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtChosaItakusakiCode")
    private TextBoxCode txtChosaItakusakiCode;
    @JsonProperty("txtChosaItakusakiName")
    private TextBox txtChosaItakusakiName;
    @JsonProperty("btnToSearchChosaItakusaki")
    private ButtonDialog btnToSearchChosaItakusaki;
    @JsonProperty("txtChosainCode")
    private TextBoxCode txtChosainCode;
    @JsonProperty("txtChosainName")
    private TextBox txtChosainName;
    @JsonProperty("txtChosaJisshiDate")
    private TextBoxFlexibleDate txtChosaJisshiDate;
    @JsonProperty("radChosaJisshiBasho")
    private RadioButton radChosaJisshiBasho;
    @JsonProperty("txtChosaJisshiBashoFreeInput")
    private TextBox txtChosaJisshiBashoFreeInput;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtChosaItakusakiCode")
    public TextBoxCode getTxtChosaItakusakiCode() {
        return txtChosaItakusakiCode;
    }

    @JsonProperty("txtChosaItakusakiCode")
    public void setTxtChosaItakusakiCode(TextBoxCode txtChosaItakusakiCode) {
        this.txtChosaItakusakiCode=txtChosaItakusakiCode;
    }

    @JsonProperty("txtChosaItakusakiName")
    public TextBox getTxtChosaItakusakiName() {
        return txtChosaItakusakiName;
    }

    @JsonProperty("txtChosaItakusakiName")
    public void setTxtChosaItakusakiName(TextBox txtChosaItakusakiName) {
        this.txtChosaItakusakiName=txtChosaItakusakiName;
    }

    @JsonProperty("btnToSearchChosaItakusaki")
    public ButtonDialog getBtnToSearchChosaItakusaki() {
        return btnToSearchChosaItakusaki;
    }

    @JsonProperty("btnToSearchChosaItakusaki")
    public void setBtnToSearchChosaItakusaki(ButtonDialog btnToSearchChosaItakusaki) {
        this.btnToSearchChosaItakusaki=btnToSearchChosaItakusaki;
    }

    @JsonProperty("txtChosainCode")
    public TextBoxCode getTxtChosainCode() {
        return txtChosainCode;
    }

    @JsonProperty("txtChosainCode")
    public void setTxtChosainCode(TextBoxCode txtChosainCode) {
        this.txtChosainCode=txtChosainCode;
    }

    @JsonProperty("txtChosainName")
    public TextBox getTxtChosainName() {
        return txtChosainName;
    }

    @JsonProperty("txtChosainName")
    public void setTxtChosainName(TextBox txtChosainName) {
        this.txtChosainName=txtChosainName;
    }

    @JsonProperty("txtChosaJisshiDate")
    public TextBoxFlexibleDate getTxtChosaJisshiDate() {
        return txtChosaJisshiDate;
    }

    @JsonProperty("txtChosaJisshiDate")
    public void setTxtChosaJisshiDate(TextBoxFlexibleDate txtChosaJisshiDate) {
        this.txtChosaJisshiDate=txtChosaJisshiDate;
    }

    @JsonProperty("radChosaJisshiBasho")
    public RadioButton getRadChosaJisshiBasho() {
        return radChosaJisshiBasho;
    }

    @JsonProperty("radChosaJisshiBasho")
    public void setRadChosaJisshiBasho(RadioButton radChosaJisshiBasho) {
        this.radChosaJisshiBasho=radChosaJisshiBasho;
    }

    @JsonProperty("txtChosaJisshiBashoFreeInput")
    public TextBox getTxtChosaJisshiBashoFreeInput() {
        return txtChosaJisshiBashoFreeInput;
    }

    @JsonProperty("txtChosaJisshiBashoFreeInput")
    public void setTxtChosaJisshiBashoFreeInput(TextBox txtChosaJisshiBashoFreeInput) {
        this.txtChosaJisshiBashoFreeInput=txtChosaJisshiBashoFreeInput;
    }

}