package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810023;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * panelThree のクラスファイル 
 * 
 * @author 自動生成
 */
public class panelThreeDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2015-11-16_12-38-19">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("dgdTokuteiShinryohi")
    private DataGrid<dgdTokuteiShinryohi_Row> dgdTokuteiShinryohi;
    @JsonProperty("ddgToteishinryoTokubetushinryo")
    private DataGrid<ddgToteishinryoTokubetushinryo_Row> ddgToteishinryoTokubetushinryo;
    @JsonProperty("panelFour")
    private panelFourDiv panelFour;
    @JsonProperty("panelFive")
    private panelFiveDiv panelFive;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getdgdTokuteiShinryohi
     * @return dgdTokuteiShinryohi
     */
    @JsonProperty("dgdTokuteiShinryohi")
    public DataGrid<dgdTokuteiShinryohi_Row> getDgdTokuteiShinryohi() {
        return dgdTokuteiShinryohi;
    }

    /*
     * setdgdTokuteiShinryohi
     * @param dgdTokuteiShinryohi dgdTokuteiShinryohi
     */
    @JsonProperty("dgdTokuteiShinryohi")
    public void setDgdTokuteiShinryohi(DataGrid<dgdTokuteiShinryohi_Row> dgdTokuteiShinryohi) {
        this.dgdTokuteiShinryohi = dgdTokuteiShinryohi;
    }

    /*
     * getddgToteishinryoTokubetushinryo
     * @return ddgToteishinryoTokubetushinryo
     */
    @JsonProperty("ddgToteishinryoTokubetushinryo")
    public DataGrid<ddgToteishinryoTokubetushinryo_Row> getDdgToteishinryoTokubetushinryo() {
        return ddgToteishinryoTokubetushinryo;
    }

    /*
     * setddgToteishinryoTokubetushinryo
     * @param ddgToteishinryoTokubetushinryo ddgToteishinryoTokubetushinryo
     */
    @JsonProperty("ddgToteishinryoTokubetushinryo")
    public void setDdgToteishinryoTokubetushinryo(DataGrid<ddgToteishinryoTokubetushinryo_Row> ddgToteishinryoTokubetushinryo) {
        this.ddgToteishinryoTokubetushinryo = ddgToteishinryoTokubetushinryo;
    }

    /*
     * getpanelFour
     * @return panelFour
     */
    @JsonProperty("panelFour")
    public panelFourDiv getPanelFour() {
        return panelFour;
    }

    /*
     * setpanelFour
     * @param panelFour panelFour
     */
    @JsonProperty("panelFour")
    public void setPanelFour(panelFourDiv panelFour) {
        this.panelFour = panelFour;
    }

    /*
     * getpanelFive
     * @return panelFive
     */
    @JsonProperty("panelFive")
    public panelFiveDiv getPanelFive() {
        return panelFive;
    }

    /*
     * setpanelFive
     * @param panelFive panelFive
     */
    @JsonProperty("panelFive")
    public void setPanelFive(panelFiveDiv panelFive) {
        this.panelFive = panelFive;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public TextBox getTxtShobyoMei() {
        return this.getPanelFour().getTxtShobyoMei();
    }

    @JsonIgnore
    public void  setTxtShobyoMei(TextBox txtShobyoMei) {
        this.getPanelFour().setTxtShobyoMei(txtShobyoMei);
    }

    @JsonIgnore
    public TextBoxNum getTxtShidouKanri() {
        return this.getPanelFour().getTxtShidouKanri();
    }

    @JsonIgnore
    public void  setTxtShidouKanri(TextBoxNum txtShidouKanri) {
        this.getPanelFour().setTxtShidouKanri(txtShidouKanri);
    }

    @JsonIgnore
    public TextBoxNum getTxtRibabiriteishon() {
        return this.getPanelFour().getTxtRibabiriteishon();
    }

    @JsonIgnore
    public void  setTxtRibabiriteishon(TextBoxNum txtRibabiriteishon) {
        this.getPanelFour().setTxtRibabiriteishon(txtRibabiriteishon);
    }

    @JsonIgnore
    public TextBoxNum getTxtSeishinkaSenmon() {
        return this.getPanelFour().getTxtSeishinkaSenmon();
    }

    @JsonIgnore
    public void  setTxtSeishinkaSenmon(TextBoxNum txtSeishinkaSenmon) {
        this.getPanelFour().setTxtSeishinkaSenmon(txtSeishinkaSenmon);
    }

    @JsonIgnore
    public TextBoxNum getTxtTanjyunXline() {
        return this.getPanelFour().getTxtTanjyunXline();
    }

    @JsonIgnore
    public void  setTxtTanjyunXline(TextBoxNum txtTanjyunXline) {
        this.getPanelFour().setTxtTanjyunXline(txtTanjyunXline);
    }

    @JsonIgnore
    public TextBoxNum getTxtSochi() {
        return this.getPanelFour().getTxtSochi();
    }

    @JsonIgnore
    public void  setTxtSochi(TextBoxNum txtSochi) {
        this.getPanelFour().setTxtSochi(txtSochi);
    }

    @JsonIgnore
    public TextBoxNum getTxtTejyutsu() {
        return this.getPanelFour().getTxtTejyutsu();
    }

    @JsonIgnore
    public void  setTxtTejyutsu(TextBoxNum txtTejyutsu) {
        this.getPanelFour().setTxtTejyutsu(txtTejyutsu);
    }

    @JsonIgnore
    public TextBoxNum getTxtGoukei() {
        return this.getPanelFour().getTxtGoukei();
    }

    @JsonIgnore
    public void  setTxtGoukei(TextBoxNum txtGoukei) {
        this.getPanelFour().setTxtGoukei(txtGoukei);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtMutiTekiyo() {
        return this.getPanelFour().getTxtMutiTekiyo();
    }

    @JsonIgnore
    public void  setTxtMutiTekiyo(TextBoxMultiLine txtMutiTekiyo) {
        this.getPanelFour().setTxtMutiTekiyo(txtMutiTekiyo);
    }

    @JsonIgnore
    public Button getBtnCloseUp() {
        return this.getPanelFour().getBtnCloseUp();
    }

    @JsonIgnore
    public void  setBtnCloseUp(Button btnCloseUp) {
        this.getPanelFour().setBtnCloseUp(btnCloseUp);
    }

    @JsonIgnore
    public TextBox getTxtShobyoMeiDown() {
        return this.getPanelFive().getTxtShobyoMeiDown();
    }

    @JsonIgnore
    public void  setTxtShobyoMeiDown(TextBox txtShobyoMeiDown) {
        this.getPanelFive().setTxtShobyoMeiDown(txtShobyoMeiDown);
    }

    @JsonIgnore
    public TextBoxCode getTxtShikibetsuCode() {
        return this.getPanelFive().getTxtShikibetsuCode();
    }

    @JsonIgnore
    public void  setTxtShikibetsuCode(TextBoxCode txtShikibetsuCode) {
        this.getPanelFive().setTxtShikibetsuCode(txtShikibetsuCode);
    }

    @JsonIgnore
    public TextBox getTxtName() {
        return this.getPanelFive().getTxtName();
    }

    @JsonIgnore
    public void  setTxtName(TextBox txtName) {
        this.getPanelFive().setTxtName(txtName);
    }

    @JsonIgnore
    public TextBox getTxtTanyi() {
        return this.getPanelFive().getTxtTanyi();
    }

    @JsonIgnore
    public void  setTxtTanyi(TextBox txtTanyi) {
        this.getPanelFive().setTxtTanyi(txtTanyi);
    }

    @JsonIgnore
    public Label getLblComment1() {
        return this.getPanelFive().getLblComment1();
    }

    @JsonIgnore
    public void  setLblComment1(Label lblComment1) {
        this.getPanelFive().setLblComment1(lblComment1);
    }

    @JsonIgnore
    public Label getLblComment2() {
        return this.getPanelFive().getLblComment2();
    }

    @JsonIgnore
    public void  setLblComment2(Label lblComment2) {
        this.getPanelFive().setLblComment2(lblComment2);
    }

    @JsonIgnore
    public TextBoxNum getTxtKaiyisuNisu() {
        return this.getPanelFive().getTxtKaiyisuNisu();
    }

    @JsonIgnore
    public void  setTxtKaiyisuNisu(TextBoxNum txtKaiyisuNisu) {
        this.getPanelFive().setTxtKaiyisuNisu(txtKaiyisuNisu);
    }

    @JsonIgnore
    public TextBoxNum getTxtGoukeiTanyi() {
        return this.getPanelFive().getTxtGoukeiTanyi();
    }

    @JsonIgnore
    public void  setTxtGoukeiTanyi(TextBoxNum txtGoukeiTanyi) {
        this.getPanelFive().setTxtGoukeiTanyi(txtGoukeiTanyi);
    }

    @JsonIgnore
    public TextBox getTxtTekiyoDown() {
        return this.getPanelFive().getTxtTekiyoDown();
    }

    @JsonIgnore
    public void  setTxtTekiyoDown(TextBox txtTekiyoDown) {
        this.getPanelFive().setTxtTekiyoDown(txtTekiyoDown);
    }

    @JsonIgnore
    public Button getBtnCloseDown() {
        return this.getPanelFive().getBtnCloseDown();
    }

    @JsonIgnore
    public void  setBtnCloseDown(Button btnCloseDown) {
        this.getPanelFive().setBtnCloseDown(btnCloseDown);
    }

    // </editor-fold>
}
