package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0710021;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.TabPanel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * tabShinseiJyoho のクラスファイル 
 * 
 * @author 自動生成
 */
public class tabShinseiJyohoDiv extends TabPanel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-10-07_19-12-57">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("JutakuKaishuShinseiContents")
    private JutakuKaishuShinseiContentsDiv JutakuKaishuShinseiContents;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getJutakuKaishuShinseiContents
     * @return JutakuKaishuShinseiContents
     */
    @JsonProperty("JutakuKaishuShinseiContents")
    public JutakuKaishuShinseiContentsDiv getJutakuKaishuShinseiContents() {
        return JutakuKaishuShinseiContents;
    }

    /*
     * setJutakuKaishuShinseiContents
     * @param JutakuKaishuShinseiContents JutakuKaishuShinseiContents
     */
    @JsonProperty("JutakuKaishuShinseiContents")
    public void setJutakuKaishuShinseiContents(JutakuKaishuShinseiContentsDiv JutakuKaishuShinseiContents) {
        this.JutakuKaishuShinseiContents = JutakuKaishuShinseiContents;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public TextBoxDate getTxtShinseiYMD() {
        return this.getJutakuKaishuShinseiContents().getShinseishaInfo().getTxtShinseiYMD();
    }

    @JsonIgnore
    public void  setTxtShinseiYMD(TextBoxDate txtShinseiYMD) {
        this.getJutakuKaishuShinseiContents().getShinseishaInfo().setTxtShinseiYMD(txtShinseiYMD);
    }

    @JsonIgnore
    public DropDownList getDdlShinseishaKubun() {
        return this.getJutakuKaishuShinseiContents().getShinseishaInfo().getDdlShinseishaKubun();
    }

    @JsonIgnore
    public void  setDdlShinseishaKubun(DropDownList ddlShinseishaKubun) {
        this.getJutakuKaishuShinseiContents().getShinseishaInfo().setDdlShinseishaKubun(ddlShinseishaKubun);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtShinseiRiyu() {
        return this.getJutakuKaishuShinseiContents().getShinseishaInfo().getTxtShinseiRiyu();
    }

    @JsonIgnore
    public void  setTxtShinseiRiyu(TextBoxMultiLine txtShinseiRiyu) {
        this.getJutakuKaishuShinseiContents().getShinseishaInfo().setTxtShinseiRiyu(txtShinseiRiyu);
    }

    @JsonIgnore
    public TextBoxCode getTxtJigyoshaNo() {
        return this.getJutakuKaishuShinseiContents().getShinseishaInfo().getTxtJigyoshaNo();
    }

    @JsonIgnore
    public void  setTxtJigyoshaNo(TextBoxCode txtJigyoshaNo) {
        this.getJutakuKaishuShinseiContents().getShinseishaInfo().setTxtJigyoshaNo(txtJigyoshaNo);
    }

    @JsonIgnore
    public ButtonDialog getBtnJigyosha() {
        return this.getJutakuKaishuShinseiContents().getShinseishaInfo().getBtnJigyosha();
    }

    @JsonIgnore
    public void  setBtnJigyosha(ButtonDialog btnJigyosha) {
        this.getJutakuKaishuShinseiContents().getShinseishaInfo().setBtnJigyosha(btnJigyosha);
    }

    @JsonIgnore
    public TextBoxAtenaMeisho getTxtJigyoshaName() {
        return this.getJutakuKaishuShinseiContents().getShinseishaInfo().getTxtJigyoshaName();
    }

    @JsonIgnore
    public void  setTxtJigyoshaName(TextBoxAtenaMeisho txtJigyoshaName) {
        this.getJutakuKaishuShinseiContents().getShinseishaInfo().setTxtJigyoshaName(txtJigyoshaName);
    }

    @JsonIgnore
    public TextBox getTxtShinseishaName() {
        return this.getJutakuKaishuShinseiContents().getShinseishaInfo().getTxtShinseishaName();
    }

    @JsonIgnore
    public void  setTxtShinseishaName(TextBox txtShinseishaName) {
        this.getJutakuKaishuShinseiContents().getShinseishaInfo().setTxtShinseishaName(txtShinseishaName);
    }

    @JsonIgnore
    public Button getBtnHonninJohoCopy() {
        return this.getJutakuKaishuShinseiContents().getShinseishaInfo().getBtnHonninJohoCopy();
    }

    @JsonIgnore
    public void  setBtnHonninJohoCopy(Button btnHonninJohoCopy) {
        this.getJutakuKaishuShinseiContents().getShinseishaInfo().setBtnHonninJohoCopy(btnHonninJohoCopy);
    }

    @JsonIgnore
    public TextBox getTxtShinseishaNameKana() {
        return this.getJutakuKaishuShinseiContents().getShinseishaInfo().getTxtShinseishaNameKana();
    }

    @JsonIgnore
    public void  setTxtShinseishaNameKana(TextBox txtShinseishaNameKana) {
        this.getJutakuKaishuShinseiContents().getShinseishaInfo().setTxtShinseishaNameKana(txtShinseishaNameKana);
    }

    @JsonIgnore
    public TextBoxTelNo getTxtTelNo() {
        return this.getJutakuKaishuShinseiContents().getShinseishaInfo().getTxtTelNo();
    }

    @JsonIgnore
    public void  setTxtTelNo(TextBoxTelNo txtTelNo) {
        this.getJutakuKaishuShinseiContents().getShinseishaInfo().setTxtTelNo(txtTelNo);
    }

    @JsonIgnore
    public DropDownList getDdlShinseiTorikesuJiyu() {
        return this.getJutakuKaishuShinseiContents().getShinseishaInfo().getDdlShinseiTorikesuJiyu();
    }

    @JsonIgnore
    public void  setDdlShinseiTorikesuJiyu(DropDownList ddlShinseiTorikesuJiyu) {
        this.getJutakuKaishuShinseiContents().getShinseishaInfo().setDdlShinseiTorikesuJiyu(ddlShinseiTorikesuJiyu);
    }

    @JsonIgnore
    public TextBoxYubinNo getTxtYubinNo() {
        return this.getJutakuKaishuShinseiContents().getShinseishaInfo().getTxtYubinNo();
    }

    @JsonIgnore
    public void  setTxtYubinNo(TextBoxYubinNo txtYubinNo) {
        this.getJutakuKaishuShinseiContents().getShinseishaInfo().setTxtYubinNo(txtYubinNo);
    }

    @JsonIgnore
    public TextBoxJusho getTxtAddress() {
        return this.getJutakuKaishuShinseiContents().getShinseishaInfo().getTxtAddress();
    }

    @JsonIgnore
    public void  setTxtAddress(TextBoxJusho txtAddress) {
        this.getJutakuKaishuShinseiContents().getShinseishaInfo().setTxtAddress(txtAddress);
    }

    @JsonIgnore
    public Space getTemp1Space() {
        return this.getJutakuKaishuShinseiContents().getShinsaKekkaPanel().getTemp1Space();
    }

    @JsonIgnore
    public void  setTemp1Space(Space temp1Space) {
        this.getJutakuKaishuShinseiContents().getShinsaKekkaPanel().setTemp1Space(temp1Space);
    }

    @JsonIgnore
    public Label getLblShinseiNaiyoyo() {
        return this.getJutakuKaishuShinseiContents().getShinsaKekkaPanel().getLblShinseiNaiyoyo();
    }

    @JsonIgnore
    public void  setLblShinseiNaiyoyo(Label lblShinseiNaiyoyo) {
        this.getJutakuKaishuShinseiContents().getShinsaKekkaPanel().setLblShinseiNaiyoyo(lblShinseiNaiyoyo);
    }

    @JsonIgnore
    public RadioButton getRadShinseiNaiyoyo() {
        return this.getJutakuKaishuShinseiContents().getShinsaKekkaPanel().getRadShinseiNaiyoyo();
    }

    @JsonIgnore
    public void  setRadShinseiNaiyoyo(RadioButton radShinseiNaiyoyo) {
        this.getJutakuKaishuShinseiContents().getShinsaKekkaPanel().setRadShinseiNaiyoyo(radShinseiNaiyoyo);
    }

    @JsonIgnore
    public Space getTemp2Space() {
        return this.getJutakuKaishuShinseiContents().getShinsaKekkaPanel().getTemp2Space();
    }

    @JsonIgnore
    public void  setTemp2Space(Space temp2Space) {
        this.getJutakuKaishuShinseiContents().getShinsaKekkaPanel().setTemp2Space(temp2Space);
    }

    // </editor-fold>
}
