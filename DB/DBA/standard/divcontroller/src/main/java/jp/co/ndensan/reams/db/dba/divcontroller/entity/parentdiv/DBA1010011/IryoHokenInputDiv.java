package jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA1010011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.DropDownList;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBox;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxCode;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxFlexibleDate;

/**
 * IryoHokenInput のクラスファイル
 *
 */
public class IryoHokenInputDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：Uz-master-49">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtIryoHokenKanyuDate")
    private TextBoxFlexibleDate txtIryoHokenKanyuDate;
    @JsonProperty("txtIryoHokenDattaiDate")
    private TextBoxFlexibleDate txtIryoHokenDattaiDate;
    @JsonProperty("ddlIryoHokenShubetsu")
    private DropDownList ddlIryoHokenShubetsu;
    @JsonProperty("txtIryoHokenHokenshaNo")
    private TextBoxCode txtIryoHokenHokenshaNo;
    @JsonProperty("txtIryoHokenHokenshaMeisho")
    private TextBox txtIryoHokenHokenshaMeisho;
    @JsonProperty("txtIryoHokenKigoNo")
    private TextBox txtIryoHokenKigoNo;
    @JsonProperty("btnIryoHokenKakutei")
    private Button btnIryoHokenKakutei;
    @JsonProperty("btnIryoHokenTorikeshi")
    private Button btnIryoHokenTorikeshi;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtIryoHokenKanyuDate")
    public TextBoxFlexibleDate getTxtIryoHokenKanyuDate() {
        return txtIryoHokenKanyuDate;
    }

    @JsonProperty("txtIryoHokenKanyuDate")
    public void setTxtIryoHokenKanyuDate(TextBoxFlexibleDate txtIryoHokenKanyuDate) {
        this.txtIryoHokenKanyuDate = txtIryoHokenKanyuDate;
    }

    @JsonProperty("txtIryoHokenDattaiDate")
    public TextBoxFlexibleDate getTxtIryoHokenDattaiDate() {
        return txtIryoHokenDattaiDate;
    }

    @JsonProperty("txtIryoHokenDattaiDate")
    public void setTxtIryoHokenDattaiDate(TextBoxFlexibleDate txtIryoHokenDattaiDate) {
        this.txtIryoHokenDattaiDate = txtIryoHokenDattaiDate;
    }

    @JsonProperty("ddlIryoHokenShubetsu")
    public DropDownList getDdlIryoHokenShubetsu() {
        return ddlIryoHokenShubetsu;
    }

    @JsonProperty("ddlIryoHokenShubetsu")
    public void setDdlIryoHokenShubetsu(DropDownList ddlIryoHokenShubetsu) {
        this.ddlIryoHokenShubetsu = ddlIryoHokenShubetsu;
    }

    @JsonProperty("txtIryoHokenHokenshaNo")
    public TextBoxCode getTxtIryoHokenHokenshaNo() {
        return txtIryoHokenHokenshaNo;
    }

    @JsonProperty("txtIryoHokenHokenshaNo")
    public void setTxtIryoHokenHokenshaNo(TextBoxCode txtIryoHokenHokenshaNo) {
        this.txtIryoHokenHokenshaNo = txtIryoHokenHokenshaNo;
    }

    @JsonProperty("txtIryoHokenHokenshaMeisho")
    public TextBox getTxtIryoHokenHokenshaMeisho() {
        return txtIryoHokenHokenshaMeisho;
    }

    @JsonProperty("txtIryoHokenHokenshaMeisho")
    public void setTxtIryoHokenHokenshaMeisho(TextBox txtIryoHokenHokenshaMeisho) {
        this.txtIryoHokenHokenshaMeisho = txtIryoHokenHokenshaMeisho;
    }

    @JsonProperty("txtIryoHokenKigoNo")
    public TextBox getTxtIryoHokenKigoNo() {
        return txtIryoHokenKigoNo;
    }

    @JsonProperty("txtIryoHokenKigoNo")
    public void setTxtIryoHokenKigoNo(TextBox txtIryoHokenKigoNo) {
        this.txtIryoHokenKigoNo = txtIryoHokenKigoNo;
    }

    @JsonProperty("btnIryoHokenKakutei")
    public Button getBtnIryoHokenKakutei() {
        return btnIryoHokenKakutei;
    }

    @JsonProperty("btnIryoHokenKakutei")
    public void setBtnIryoHokenKakutei(Button btnIryoHokenKakutei) {
        this.btnIryoHokenKakutei = btnIryoHokenKakutei;
    }

    @JsonProperty("btnIryoHokenTorikeshi")
    public Button getBtnIryoHokenTorikeshi() {
        return btnIryoHokenTorikeshi;
    }

    @JsonProperty("btnIryoHokenTorikeshi")
    public void setBtnIryoHokenTorikeshi(Button btnIryoHokenTorikeshi) {
        this.btnIryoHokenTorikeshi = btnIryoHokenTorikeshi;
    }

    // </editor-fold>
}
