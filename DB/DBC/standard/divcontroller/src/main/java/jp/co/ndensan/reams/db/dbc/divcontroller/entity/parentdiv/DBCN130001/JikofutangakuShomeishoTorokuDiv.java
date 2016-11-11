package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBCN130001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.HokenshaJoho.IHokenshaJohoDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KaigoKanryoMessage.KaigoKanryoMessage.IKaigoKanryoMessageDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KaigoKanryoMessage.KaigoKanryoMessage.KaigoKanryoMessageDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.kaigoatenainfo.KaigoAtenaInfo.IKaigoAtenaInfoDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.kaigoatenainfo.KaigoAtenaInfo.KaigoAtenaInfoDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.kaigoshikakukihon.KaigoShikakuKihon.IKaigoShikakuKihonDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.kaigoshikakukihon.KaigoShikakuKihon.KaigoShikakuKihonDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.hokenshajoho.HokenshaJohoDiv;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * JikofutangakuShomeishoToroku のクラスファイル 
 * 
 * @author 自動生成
 */
public class JikofutangakuShomeishoTorokuDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-10-07_19-12-57">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("Shinki")
    private ShinkiDiv Shinki;
    @JsonProperty("Koshin")
    private KoshinDiv Koshin;
    @JsonProperty("TorokuJoho")
    private TorokuJohoDiv TorokuJoho;
    @JsonProperty("ccdShikakuInfo")
    private KaigoShikakuKihonDiv ccdShikakuInfo;
    @JsonProperty("ccdKanryoMessage")
    private KaigoKanryoMessageDiv ccdKanryoMessage;
    @JsonProperty("ccdAtenaInfo")
    private KaigoAtenaInfoDiv ccdAtenaInfo;
    @JsonProperty("executionStatus")
    private RString executionStatus;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getShinki
     * @return Shinki
     */
    @JsonProperty("Shinki")
    public ShinkiDiv getShinki() {
        return Shinki;
    }

    /*
     * setShinki
     * @param Shinki Shinki
     */
    @JsonProperty("Shinki")
    public void setShinki(ShinkiDiv Shinki) {
        this.Shinki = Shinki;
    }

    /*
     * getKoshin
     * @return Koshin
     */
    @JsonProperty("Koshin")
    public KoshinDiv getKoshin() {
        return Koshin;
    }

    /*
     * setKoshin
     * @param Koshin Koshin
     */
    @JsonProperty("Koshin")
    public void setKoshin(KoshinDiv Koshin) {
        this.Koshin = Koshin;
    }

    /*
     * getTorokuJoho
     * @return TorokuJoho
     */
    @JsonProperty("TorokuJoho")
    public TorokuJohoDiv getTorokuJoho() {
        return TorokuJoho;
    }

    /*
     * setTorokuJoho
     * @param TorokuJoho TorokuJoho
     */
    @JsonProperty("TorokuJoho")
    public void setTorokuJoho(TorokuJohoDiv TorokuJoho) {
        this.TorokuJoho = TorokuJoho;
    }

    /*
     * getccdShikakuInfo
     * @return ccdShikakuInfo
     */
    @JsonProperty("ccdShikakuInfo")
    public IKaigoShikakuKihonDiv getCcdShikakuInfo() {
        return ccdShikakuInfo;
    }

    /*
     * getccdKanryoMessage
     * @return ccdKanryoMessage
     */
    @JsonProperty("ccdKanryoMessage")
    public IKaigoKanryoMessageDiv getCcdKanryoMessage() {
        return ccdKanryoMessage;
    }

    /*
     * getccdAtenaInfo
     * @return ccdAtenaInfo
     */
    @JsonProperty("ccdAtenaInfo")
    public IKaigoAtenaInfoDiv getCcdAtenaInfo() {
        return ccdAtenaInfo;
    }

    /*
     * getexecutionStatus
     * @return executionStatus
     */
    @JsonProperty("executionStatus")
    public RString getExecutionStatus() {
        return executionStatus;
    }

    /*
     * setexecutionStatus
     * @param executionStatus executionStatus
     */
    @JsonProperty("executionStatus")
    public void setExecutionStatus(RString executionStatus) {
        this.executionStatus = executionStatus;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public DropDownList getDdlShinkiTaishoNendo() {
        return this.getShinki().getDdlShinkiTaishoNendo();
    }

    @JsonIgnore
    public void  setDdlShinkiTaishoNendo(DropDownList ddlShinkiTaishoNendo) {
        this.getShinki().setDdlShinkiTaishoNendo(ddlShinkiTaishoNendo);
    }

    @JsonIgnore
    public TextBox getTxtShinkiTuikaShokisaiHokenshaNo() {
        return this.getShinki().getTxtShinkiTuikaShokisaiHokenshaNo();
    }

    @JsonIgnore
    public void  setTxtShinkiTuikaShokisaiHokenshaNo(TextBox txtShinkiTuikaShokisaiHokenshaNo) {
        this.getShinki().setTxtShinkiTuikaShokisaiHokenshaNo(txtShinkiTuikaShokisaiHokenshaNo);
    }

    @JsonIgnore
    public TextBox getTxtShinkiShikyuShinseishoSeiriNo() {
        return this.getShinki().getTxtShinkiShikyuShinseishoSeiriNo();
    }

    @JsonIgnore
    public void  setTxtShinkiShikyuShinseishoSeiriNo(TextBox txtShinkiShikyuShinseishoSeiriNo) {
        this.getShinki().setTxtShinkiShikyuShinseishoSeiriNo(txtShinkiShikyuShinseishoSeiriNo);
    }

    @JsonIgnore
    public Button getBtnShinkiTsuika() {
        return this.getShinki().getBtnShinkiTsuika();
    }

    @JsonIgnore
    public void  setBtnShinkiTsuika(Button btnShinkiTsuika) {
        this.getShinki().setBtnShinkiTsuika(btnShinkiTsuika);
    }

    @JsonIgnore
    public Label getLblChui() {
        return this.getShinki().getLblChui();
    }

    @JsonIgnore
    public void  setLblChui(Label lblChui) {
        this.getShinki().setLblChui(lblChui);
    }

    @JsonIgnore
    public DropDownList getDdlKoshinTaishoNendo() {
        return this.getKoshin().getDdlKoshinTaishoNendo();
    }

    @JsonIgnore
    public void  setDdlKoshinTaishoNendo(DropDownList ddlKoshinTaishoNendo) {
        this.getKoshin().setDdlKoshinTaishoNendo(ddlKoshinTaishoNendo);
    }

    @JsonIgnore
    public TextBox getTxtKoshinShikyuShinseishoSeiriNo() {
        return this.getKoshin().getTxtKoshinShikyuShinseishoSeiriNo();
    }

    @JsonIgnore
    public void  setTxtKoshinShikyuShinseishoSeiriNo(TextBox txtKoshinShikyuShinseishoSeiriNo) {
        this.getKoshin().setTxtKoshinShikyuShinseishoSeiriNo(txtKoshinShikyuShinseishoSeiriNo);
    }

    @JsonIgnore
    public CheckBoxList getChkIsRirekiHyoji() {
        return this.getKoshin().getChkIsRirekiHyoji();
    }

    @JsonIgnore
    public void  setChkIsRirekiHyoji(CheckBoxList chkIsRirekiHyoji) {
        this.getKoshin().setChkIsRirekiHyoji(chkIsRirekiHyoji);
    }

    @JsonIgnore
    public Button getBtnSearch() {
        return this.getKoshin().getBtnSearch();
    }

    @JsonIgnore
    public void  setBtnSearch(Button btnSearch) {
        this.getKoshin().setBtnSearch(btnSearch);
    }

    @JsonIgnore
    public DataGrid<dgShomeishoRireki_Row> getDgShomeishoRireki() {
        return this.getKoshin().getDgShomeishoRireki();
    }

    @JsonIgnore
    public void  setDgShomeishoRireki(DataGrid<dgShomeishoRireki_Row> dgShomeishoRireki) {
        this.getKoshin().setDgShomeishoRireki(dgShomeishoRireki);
    }

    @JsonIgnore
    public TextBox getTxtTorokuTaishoNendo() {
        return this.getTorokuJoho().getTxtTorokuTaishoNendo();
    }

    @JsonIgnore
    public void  setTxtTorokuTaishoNendo(TextBox txtTorokuTaishoNendo) {
        this.getTorokuJoho().setTxtTorokuTaishoNendo(txtTorokuTaishoNendo);
    }

    @JsonIgnore
    public TextBox getTxtTorokuShokisaiHokenshaNo() {
        return this.getTorokuJoho().getTxtTorokuShokisaiHokenshaNo();
    }

    @JsonIgnore
    public void  setTxtTorokuShokisaiHokenshaNo(TextBox txtTorokuShokisaiHokenshaNo) {
        this.getTorokuJoho().setTxtTorokuShokisaiHokenshaNo(txtTorokuShokisaiHokenshaNo);
    }

    @JsonIgnore
    public TextBox getTxtTorokuShikyuShinseishoSeiriNo() {
        return this.getTorokuJoho().getTxtTorokuShikyuShinseishoSeiriNo();
    }

    @JsonIgnore
    public void  setTxtTorokuShikyuShinseishoSeiriNo(TextBox txtTorokuShikyuShinseishoSeiriNo) {
        this.getTorokuJoho().setTxtTorokuShikyuShinseishoSeiriNo(txtTorokuShikyuShinseishoSeiriNo);
    }

    @JsonIgnore
    public TextBox getTxtTorokuRirekiNo() {
        return this.getTorokuJoho().getTxtTorokuRirekiNo();
    }

    @JsonIgnore
    public void  setTxtTorokuRirekiNo(TextBox txtTorokuRirekiNo) {
        this.getTorokuJoho().setTxtTorokuRirekiNo(txtTorokuRirekiNo);
    }

    @JsonIgnore
    public tabTorokuJohoDiv getTabTorokuJoho() {
        return this.getTorokuJoho().getTabTorokuJoho();
    }

    @JsonIgnore
    public void  setTabTorokuJoho(tabTorokuJohoDiv tabTorokuJoho) {
        this.getTorokuJoho().setTabTorokuJoho(tabTorokuJoho);
    }

    @JsonIgnore
    public tplShomeishoKisaiJikoDiv getTplShomeishoKisaiJiko() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko();
    }

    @JsonIgnore
    public void  setTplShomeishoKisaiJiko(tplShomeishoKisaiJikoDiv tplShomeishoKisaiJiko) {
        this.getTorokuJoho().getTabTorokuJoho().setTplShomeishoKisaiJiko(tplShomeishoKisaiJiko);
    }

    @JsonIgnore
    public TextBoxFlexibleDate getTxtUketsukeDate() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getTxtUketsukeDate();
    }

    @JsonIgnore
    public void  setTxtUketsukeDate(TextBoxFlexibleDate txtUketsukeDate) {
        this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().setTxtUketsukeDate(txtUketsukeDate);
    }

    @JsonIgnore
    public ShomeishoKisaiJohoDiv getShomeishoKisaiJoho() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getShomeishoKisaiJoho();
    }

    @JsonIgnore
    public void  setShomeishoKisaiJoho(ShomeishoKisaiJohoDiv ShomeishoKisaiJoho) {
        this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().setShomeishoKisaiJoho(ShomeishoKisaiJoho);
    }

    @JsonIgnore
    public TextBox getTxtJikofutangakuShomeishoSeiriNo() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getShomeishoKisaiJoho().getTxtJikofutangakuShomeishoSeiriNo();
    }

    @JsonIgnore
    public void  setTxtJikofutangakuShomeishoSeiriNo(TextBox txtJikofutangakuShomeishoSeiriNo) {
        this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getShomeishoKisaiJoho().setTxtJikofutangakuShomeishoSeiriNo(txtJikofutangakuShomeishoSeiriNo);
    }

    @JsonIgnore
    public Label getLblTennyumae() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getShomeishoKisaiJoho().getLblTennyumae();
    }

    @JsonIgnore
    public void  setLblTennyumae(Label lblTennyumae) {
        this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getShomeishoKisaiJoho().setLblTennyumae(lblTennyumae);
    }

    @JsonIgnore
    public TextBoxDateRange getTxtTaishoKikan() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getShomeishoKisaiJoho().getTxtTaishoKikan();
    }

    @JsonIgnore
    public void  setTxtTaishoKikan(TextBoxDateRange txtTaishoKikan) {
        this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getShomeishoKisaiJoho().setTxtTaishoKikan(txtTaishoKikan);
    }

    @JsonIgnore
    public TextBoxDateRange getTxtHihokenshaKikan() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getShomeishoKisaiJoho().getTxtHihokenshaKikan();
    }

    @JsonIgnore
    public void  setTxtHihokenshaKikan(TextBoxDateRange txtHihokenshaKikan) {
        this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getShomeishoKisaiJoho().setTxtHihokenshaKikan(txtHihokenshaKikan);
    }

    @JsonIgnore
    public TextBoxFlexibleDate getTxtHakkoDate() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getShomeishoKisaiJoho().getTxtHakkoDate();
    }

    @JsonIgnore
    public void  setTxtHakkoDate(TextBoxFlexibleDate txtHakkoDate) {
        this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getShomeishoKisaiJoho().setTxtHakkoDate(txtHakkoDate);
    }

    @JsonIgnore
    public IHokenshaJohoDiv getCcdTennyumaeHokensha() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getShomeishoKisaiJoho().getCcdTennyumaeHokensha();
    }

    @JsonIgnore
    public RenrakusakiJohoDiv getRenrakusakiJoho() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getRenrakusakiJoho();
    }

    @JsonIgnore
    public void  setRenrakusakiJoho(RenrakusakiJohoDiv RenrakusakiJoho) {
        this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().setRenrakusakiJoho(RenrakusakiJoho);
    }

    @JsonIgnore
    public TextBoxYubinNo getTxtYubinNo() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getRenrakusakiJoho().getTxtYubinNo();
    }

    @JsonIgnore
    public void  setTxtYubinNo(TextBoxYubinNo txtYubinNo) {
        this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getRenrakusakiJoho().setTxtYubinNo(txtYubinNo);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtRenrakusakiJusho() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getRenrakusakiJoho().getTxtRenrakusakiJusho();
    }

    @JsonIgnore
    public void  setTxtRenrakusakiJusho(TextBoxMultiLine txtRenrakusakiJusho) {
        this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getRenrakusakiJoho().setTxtRenrakusakiJusho(txtRenrakusakiJusho);
    }

    @JsonIgnore
    public TextBox getTxtRenrakusakiMei1() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getRenrakusakiJoho().getTxtRenrakusakiMei1();
    }

    @JsonIgnore
    public void  setTxtRenrakusakiMei1(TextBox txtRenrakusakiMei1) {
        this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getRenrakusakiJoho().setTxtRenrakusakiMei1(txtRenrakusakiMei1);
    }

    @JsonIgnore
    public TextBox getTxtRenrakusakiMei2() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getRenrakusakiJoho().getTxtRenrakusakiMei2();
    }

    @JsonIgnore
    public void  setTxtRenrakusakiMei2(TextBox txtRenrakusakiMei2) {
        this.getTorokuJoho().getTabTorokuJoho().getTplShomeishoKisaiJiko().getRenrakusakiJoho().setTxtRenrakusakiMei2(txtRenrakusakiMei2);
    }

    @JsonIgnore
    public tplJikofutangakuJohoDiv getTplJikofutangakuJoho() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho();
    }

    @JsonIgnore
    public void  setTplJikofutangakuJoho(tplJikofutangakuJohoDiv tplJikofutangakuJoho) {
        this.getTorokuJoho().getTabTorokuJoho().setTplJikofutangakuJoho(tplJikofutangakuJoho);
    }

    @JsonIgnore
    public Label getLblJikofutangaku() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getLblJikofutangaku();
    }

    @JsonIgnore
    public void  setLblJikofutangaku(Label lblJikofutangaku) {
        this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().setLblJikofutangaku(lblJikofutangaku);
    }

    @JsonIgnore
    public tblJikofutangakuDiv getTblJikofutangaku() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku();
    }

    @JsonIgnore
    public void  setTblJikofutangaku(tblJikofutangakuDiv tblJikofutangaku) {
        this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().setTblJikofutangaku(tblJikofutangaku);
    }

    @JsonIgnore
    public Label getLblTsuki1() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getLblTsuki1();
    }

    @JsonIgnore
    public Label getLblJikofutangaku1() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getLblJikofutangaku1();
    }

    @JsonIgnore
    public Label getLblUchiFutangaku1() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getLblUchiFutangaku1();
    }

    @JsonIgnore
    public Label getLbl8Gatsu() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getLbl8Gatsu();
    }

    @JsonIgnore
    public TextBoxNum getTxtJikofutangaku8() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getTxtJikofutangaku8();
    }

    @JsonIgnore
    public TextBoxNum getTxtUchiFutangaku8() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getTxtUchiFutangaku8();
    }

    @JsonIgnore
    public Label getLbl9Gatsu() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getLbl9Gatsu();
    }

    @JsonIgnore
    public TextBoxNum getTxtJikofutangaku9() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getTxtJikofutangaku9();
    }

    @JsonIgnore
    public TextBoxNum getTxtUchiFutangaku9() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getTxtUchiFutangaku9();
    }

    @JsonIgnore
    public Label getLbl10Gatsu() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getLbl10Gatsu();
    }

    @JsonIgnore
    public TextBoxNum getTxtJikofutangaku10() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getTxtJikofutangaku10();
    }

    @JsonIgnore
    public TextBoxNum getTxtUchiFutangaku10() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getTxtUchiFutangaku10();
    }

    @JsonIgnore
    public Label getLbl11Gatsu() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getLbl11Gatsu();
    }

    @JsonIgnore
    public TextBoxNum getTxtJikofutangaku11() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getTxtJikofutangaku11();
    }

    @JsonIgnore
    public TextBoxNum getTxtUchiFutangaku11() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getTxtUchiFutangaku11();
    }

    @JsonIgnore
    public Label getLbl12Gatsu() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getLbl12Gatsu();
    }

    @JsonIgnore
    public TextBoxNum getTxtJikofutangaku12() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getTxtJikofutangaku12();
    }

    @JsonIgnore
    public TextBoxNum getTxtUchiFutangaku12() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getTxtUchiFutangaku12();
    }

    @JsonIgnore
    public Label getLbl1Gatsu() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getLbl1Gatsu();
    }

    @JsonIgnore
    public TextBoxNum getTxtJikofutangaku1() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getTxtJikofutangaku1();
    }

    @JsonIgnore
    public TextBoxNum getTxtUchiFutangaku1() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku().getTxtUchiFutangaku1();
    }

    @JsonIgnore
    public tblJikofutangaku2Div getTblJikofutangaku2() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2();
    }

    @JsonIgnore
    public void  setTblJikofutangaku2(tblJikofutangaku2Div tblJikofutangaku2) {
        this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().setTblJikofutangaku2(tblJikofutangaku2);
    }

    @JsonIgnore
    public Label getLblTsuki2() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getLblTsuki2();
    }

    @JsonIgnore
    public Label getLblJikofutangaku2() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getLblJikofutangaku2();
    }

    @JsonIgnore
    public Label getLblUchiFutangaku2() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getLblUchiFutangaku2();
    }

    @JsonIgnore
    public Label getLbl2Gatsu() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getLbl2Gatsu();
    }

    @JsonIgnore
    public TextBoxNum getTxtJikofutangaku2() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtJikofutangaku2();
    }

    @JsonIgnore
    public TextBoxNum getTxtUchiFutangaku2() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtUchiFutangaku2();
    }

    @JsonIgnore
    public Label getLbl3Gatsu() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getLbl3Gatsu();
    }

    @JsonIgnore
    public TextBoxNum getTxtJikofutangaku3() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtJikofutangaku3();
    }

    @JsonIgnore
    public TextBoxNum getTxtUchiFutangaku3() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtUchiFutangaku3();
    }

    @JsonIgnore
    public Label getLbl4Gatsu() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getLbl4Gatsu();
    }

    @JsonIgnore
    public TextBoxNum getTxtJikofutangaku4() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtJikofutangaku4();
    }

    @JsonIgnore
    public TextBoxNum getTxtUchiFutangaku4() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtUchiFutangaku4();
    }

    @JsonIgnore
    public Label getLbl5Gatsu() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getLbl5Gatsu();
    }

    @JsonIgnore
    public TextBoxNum getTxtJikofutangaku5() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtJikofutangaku5();
    }

    @JsonIgnore
    public TextBoxNum getTxtUchiFutangaku5() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtUchiFutangaku5();
    }

    @JsonIgnore
    public Label getLbl6Gatsu() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getLbl6Gatsu();
    }

    @JsonIgnore
    public TextBoxNum getTxtJikofutangaku6() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtJikofutangaku6();
    }

    @JsonIgnore
    public TextBoxNum getTxtUchiFutangaku6() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtUchiFutangaku6();
    }

    @JsonIgnore
    public Label getLbl7Gatsu() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getLbl7Gatsu();
    }

    @JsonIgnore
    public TextBoxNum getTxtJikofutangaku7() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtJikofutangaku7();
    }

    @JsonIgnore
    public TextBoxNum getTxtUchiFutangaku7() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtUchiFutangaku7();
    }

    @JsonIgnore
    public Button getBtnGokei() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getBtnGokei();
    }

    @JsonIgnore
    public TextBoxNum getTxtJikofutangakuGokei() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtJikofutangakuGokei();
    }

    @JsonIgnore
    public TextBoxNum getTxtUchiFutangakuGokei() {
        return this.getTorokuJoho().getTabTorokuJoho().getTplJikofutangakuJoho().getTblJikofutangaku2().getTxtUchiFutangakuGokei();
    }

    // </editor-fold>
}