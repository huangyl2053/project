package jp.co.ndensan.reams.db.dbe.divcontroller.entity;
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
 * KaigoHihokenshaJoho のクラスファイル 
 * 
 * @author 自動生成
 */
public class KaigoHihokenshaJohoDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("lblHokensha")
    private Label lblHokensha;
    @JsonProperty("txtHokenshaNo")
    private TextBox txtHokenshaNo;
    @JsonProperty("txtHokenshaMeisho")
    private TextBox txtHokenshaMeisho;
    @JsonProperty("lblHihokensha")
    private Label lblHihokensha;
    @JsonProperty("txtHihokenshaNo")
    private TextBox txtHihokenshaNo;
    @JsonProperty("txtHihokenshaKubun")
    private TextBox txtHihokenshaKubun;
    @JsonProperty("lblHihokenshaShimei")
    private Label lblHihokenshaShimei;
    @JsonProperty("txtHihokenshaShimei")
    private TextBox txtHihokenshaShimei;
    @JsonProperty("lblSeinenGappi")
    private Label lblSeinenGappi;
    @JsonProperty("txtBirthDay")
    private TextBoxDate txtBirthDay;
    @JsonProperty("lblNenrei")
    private Label lblNenrei;
    @JsonProperty("txtNenrei")
    private TextBox txtNenrei;
    @JsonProperty("lblNinteiShinseiYMD")
    private Label lblNinteiShinseiYMD;
    @JsonProperty("txtNinteiShinseiYMD")
    private TextBoxFlexibleDate txtNinteiShinseiYMD;
    @JsonProperty("lblShinseiKubun")
    private Label lblShinseiKubun;
    @JsonProperty("txtShinseiKubun")
    private TextBox txtShinseiKubun;
    @JsonProperty("lblZenkaiYokaigodo")
    private Label lblZenkaiYokaigodo;
    @JsonProperty("txtZenkaiYokaigodo")
    private TextBox txtZenkaiYokaigodo;
    @JsonProperty("lblZenkaiNinteiKikan")
    private Label lblZenkaiNinteiKikan;
    @JsonProperty("txtZenYukokikanStart")
    private TextBoxFlexibleDate txtZenYukokikanStart;
    @JsonProperty("lblKara2")
    private Label lblKara2;
    @JsonProperty("txtZenYukokikanEnd")
    private TextBoxFlexibleDate txtZenYukokikanEnd;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("lblHokensha")
    public Label getLblHokensha() {
        return lblHokensha;
    }

    @JsonProperty("lblHokensha")
    public void setLblHokensha(Label lblHokensha) {
        this.lblHokensha=lblHokensha;
    }

    @JsonProperty("txtHokenshaNo")
    public TextBox getTxtHokenshaNo() {
        return txtHokenshaNo;
    }

    @JsonProperty("txtHokenshaNo")
    public void setTxtHokenshaNo(TextBox txtHokenshaNo) {
        this.txtHokenshaNo=txtHokenshaNo;
    }

    @JsonProperty("txtHokenshaMeisho")
    public TextBox getTxtHokenshaMeisho() {
        return txtHokenshaMeisho;
    }

    @JsonProperty("txtHokenshaMeisho")
    public void setTxtHokenshaMeisho(TextBox txtHokenshaMeisho) {
        this.txtHokenshaMeisho=txtHokenshaMeisho;
    }

    @JsonProperty("lblHihokensha")
    public Label getLblHihokensha() {
        return lblHihokensha;
    }

    @JsonProperty("lblHihokensha")
    public void setLblHihokensha(Label lblHihokensha) {
        this.lblHihokensha=lblHihokensha;
    }

    @JsonProperty("txtHihokenshaNo")
    public TextBox getTxtHihokenshaNo() {
        return txtHihokenshaNo;
    }

    @JsonProperty("txtHihokenshaNo")
    public void setTxtHihokenshaNo(TextBox txtHihokenshaNo) {
        this.txtHihokenshaNo=txtHihokenshaNo;
    }

    @JsonProperty("txtHihokenshaKubun")
    public TextBox getTxtHihokenshaKubun() {
        return txtHihokenshaKubun;
    }

    @JsonProperty("txtHihokenshaKubun")
    public void setTxtHihokenshaKubun(TextBox txtHihokenshaKubun) {
        this.txtHihokenshaKubun=txtHihokenshaKubun;
    }

    @JsonProperty("lblHihokenshaShimei")
    public Label getLblHihokenshaShimei() {
        return lblHihokenshaShimei;
    }

    @JsonProperty("lblHihokenshaShimei")
    public void setLblHihokenshaShimei(Label lblHihokenshaShimei) {
        this.lblHihokenshaShimei=lblHihokenshaShimei;
    }

    @JsonProperty("txtHihokenshaShimei")
    public TextBox getTxtHihokenshaShimei() {
        return txtHihokenshaShimei;
    }

    @JsonProperty("txtHihokenshaShimei")
    public void setTxtHihokenshaShimei(TextBox txtHihokenshaShimei) {
        this.txtHihokenshaShimei=txtHihokenshaShimei;
    }

    @JsonProperty("lblSeinenGappi")
    public Label getLblSeinenGappi() {
        return lblSeinenGappi;
    }

    @JsonProperty("lblSeinenGappi")
    public void setLblSeinenGappi(Label lblSeinenGappi) {
        this.lblSeinenGappi=lblSeinenGappi;
    }

    @JsonProperty("txtBirthDay")
    public TextBoxDate getTxtBirthDay() {
        return txtBirthDay;
    }

    @JsonProperty("txtBirthDay")
    public void setTxtBirthDay(TextBoxDate txtBirthDay) {
        this.txtBirthDay=txtBirthDay;
    }

    @JsonProperty("lblNenrei")
    public Label getLblNenrei() {
        return lblNenrei;
    }

    @JsonProperty("lblNenrei")
    public void setLblNenrei(Label lblNenrei) {
        this.lblNenrei=lblNenrei;
    }

    @JsonProperty("txtNenrei")
    public TextBox getTxtNenrei() {
        return txtNenrei;
    }

    @JsonProperty("txtNenrei")
    public void setTxtNenrei(TextBox txtNenrei) {
        this.txtNenrei=txtNenrei;
    }

    @JsonProperty("lblNinteiShinseiYMD")
    public Label getLblNinteiShinseiYMD() {
        return lblNinteiShinseiYMD;
    }

    @JsonProperty("lblNinteiShinseiYMD")
    public void setLblNinteiShinseiYMD(Label lblNinteiShinseiYMD) {
        this.lblNinteiShinseiYMD=lblNinteiShinseiYMD;
    }

    @JsonProperty("txtNinteiShinseiYMD")
    public TextBoxFlexibleDate getTxtNinteiShinseiYMD() {
        return txtNinteiShinseiYMD;
    }

    @JsonProperty("txtNinteiShinseiYMD")
    public void setTxtNinteiShinseiYMD(TextBoxFlexibleDate txtNinteiShinseiYMD) {
        this.txtNinteiShinseiYMD=txtNinteiShinseiYMD;
    }

    @JsonProperty("lblShinseiKubun")
    public Label getLblShinseiKubun() {
        return lblShinseiKubun;
    }

    @JsonProperty("lblShinseiKubun")
    public void setLblShinseiKubun(Label lblShinseiKubun) {
        this.lblShinseiKubun=lblShinseiKubun;
    }

    @JsonProperty("txtShinseiKubun")
    public TextBox getTxtShinseiKubun() {
        return txtShinseiKubun;
    }

    @JsonProperty("txtShinseiKubun")
    public void setTxtShinseiKubun(TextBox txtShinseiKubun) {
        this.txtShinseiKubun=txtShinseiKubun;
    }

    @JsonProperty("lblZenkaiYokaigodo")
    public Label getLblZenkaiYokaigodo() {
        return lblZenkaiYokaigodo;
    }

    @JsonProperty("lblZenkaiYokaigodo")
    public void setLblZenkaiYokaigodo(Label lblZenkaiYokaigodo) {
        this.lblZenkaiYokaigodo=lblZenkaiYokaigodo;
    }

    @JsonProperty("txtZenkaiYokaigodo")
    public TextBox getTxtZenkaiYokaigodo() {
        return txtZenkaiYokaigodo;
    }

    @JsonProperty("txtZenkaiYokaigodo")
    public void setTxtZenkaiYokaigodo(TextBox txtZenkaiYokaigodo) {
        this.txtZenkaiYokaigodo=txtZenkaiYokaigodo;
    }

    @JsonProperty("lblZenkaiNinteiKikan")
    public Label getLblZenkaiNinteiKikan() {
        return lblZenkaiNinteiKikan;
    }

    @JsonProperty("lblZenkaiNinteiKikan")
    public void setLblZenkaiNinteiKikan(Label lblZenkaiNinteiKikan) {
        this.lblZenkaiNinteiKikan=lblZenkaiNinteiKikan;
    }

    @JsonProperty("txtZenYukokikanStart")
    public TextBoxFlexibleDate getTxtZenYukokikanStart() {
        return txtZenYukokikanStart;
    }

    @JsonProperty("txtZenYukokikanStart")
    public void setTxtZenYukokikanStart(TextBoxFlexibleDate txtZenYukokikanStart) {
        this.txtZenYukokikanStart=txtZenYukokikanStart;
    }

    @JsonProperty("lblKara2")
    public Label getLblKara2() {
        return lblKara2;
    }

    @JsonProperty("lblKara2")
    public void setLblKara2(Label lblKara2) {
        this.lblKara2=lblKara2;
    }

    @JsonProperty("txtZenYukokikanEnd")
    public TextBoxFlexibleDate getTxtZenYukokikanEnd() {
        return txtZenYukokikanEnd;
    }

    @JsonProperty("txtZenYukokikanEnd")
    public void setTxtZenYukokikanEnd(TextBoxFlexibleDate txtZenYukokikanEnd) {
        this.txtZenYukokikanEnd=txtZenYukokikanEnd;
    }

}
