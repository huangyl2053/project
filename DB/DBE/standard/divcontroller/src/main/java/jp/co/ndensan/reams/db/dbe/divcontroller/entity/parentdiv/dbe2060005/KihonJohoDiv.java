package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.dbe2060005;
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
 * KihonJoho のクラスファイル 
 * 
 * @author 自動生成
 */
public class KihonJohoDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnShinseiJohoSearch")
    private Button btnShinseiJohoSearch;
    @JsonProperty("txtHokenshaNo")
    private TextBoxCode txtHokenshaNo;
    @JsonProperty("txtHihokenshaNo")
    private TextBoxCode txtHihokenshaNo;
    @JsonProperty("txtShinseiDate")
    private TextBoxFlexibleDate txtShinseiDate;
    @JsonProperty("ddlShinseiKubun")
    private DropDownList ddlShinseiKubun;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("btnShinseiJohoSearch")
    public Button getBtnShinseiJohoSearch() {
        return btnShinseiJohoSearch;
    }

    @JsonProperty("btnShinseiJohoSearch")
    public void setBtnShinseiJohoSearch(Button btnShinseiJohoSearch) {
        this.btnShinseiJohoSearch=btnShinseiJohoSearch;
    }

    @JsonProperty("txtHokenshaNo")
    public TextBoxCode getTxtHokenshaNo() {
        return txtHokenshaNo;
    }

    @JsonProperty("txtHokenshaNo")
    public void setTxtHokenshaNo(TextBoxCode txtHokenshaNo) {
        this.txtHokenshaNo=txtHokenshaNo;
    }

    @JsonProperty("txtHihokenshaNo")
    public TextBoxCode getTxtHihokenshaNo() {
        return txtHihokenshaNo;
    }

    @JsonProperty("txtHihokenshaNo")
    public void setTxtHihokenshaNo(TextBoxCode txtHihokenshaNo) {
        this.txtHihokenshaNo=txtHihokenshaNo;
    }

    @JsonProperty("txtShinseiDate")
    public TextBoxFlexibleDate getTxtShinseiDate() {
        return txtShinseiDate;
    }

    @JsonProperty("txtShinseiDate")
    public void setTxtShinseiDate(TextBoxFlexibleDate txtShinseiDate) {
        this.txtShinseiDate=txtShinseiDate;
    }

    @JsonProperty("ddlShinseiKubun")
    public DropDownList getDdlShinseiKubun() {
        return ddlShinseiKubun;
    }

    @JsonProperty("ddlShinseiKubun")
    public void setDdlShinseiKubun(DropDownList ddlShinseiKubun) {
        this.ddlShinseiKubun=ddlShinseiKubun;
    }

}