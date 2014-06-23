package jp.co.ndensan.reams.db.dbe.divcontroller.entity;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.HihokenshaOutlineDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.HihokenshaShujiiDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.KankeiIinDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.LatestNinteiResultDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.N2HihokenshaDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.NinteiShinseishaDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.NinteichosainAdvanceEntryDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.NyuinNyushoDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.ShichosonRenrakuJikoDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.SinseiRiyuDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * ShinseiJohoInput のクラスファイル 
 * 
 * @author 自動生成
 */
public class ShinseiJohoInputDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("HihokenshaOutline")
    private HihokenshaOutlineDiv HihokenshaOutline;
    @JsonProperty("ddlShinseiKubunShinseiji")
    private DropDownList ddlShinseiKubunShinseiji;
    @JsonProperty("txtShinseiDate")
    private TextBoxDate txtShinseiDate;
    @JsonProperty("txtShinseiYukoKubun")
    private TextBox txtShinseiYukoKubun;
    @JsonProperty("ddlChiku")
    private DropDownList ddlChiku;
    @JsonProperty("SinseiRiyu")
    private SinseiRiyuDiv SinseiRiyu;
    @JsonProperty("NinteiShinseisha")
    private NinteiShinseishaDiv NinteiShinseisha;
    @JsonProperty("LatestNinteiResult")
    private LatestNinteiResultDiv LatestNinteiResult;
    @JsonProperty("HihokenshaShujii")
    private HihokenshaShujiiDiv HihokenshaShujii;
    @JsonProperty("N2Hihokensha")
    private N2HihokenshaDiv N2Hihokensha;
    @JsonProperty("NinteichosainAdvanceEntry")
    private NinteichosainAdvanceEntryDiv NinteichosainAdvanceEntry;
    @JsonProperty("NyuinNyusho")
    private NyuinNyushoDiv NyuinNyusho;
    @JsonProperty("chkEnkitsuchiHakko")
    private CheckBoxList chkEnkitsuchiHakko;
    @JsonProperty("chkJohoteikyo")
    private CheckBoxList chkJohoteikyo;
    @JsonProperty("ShichosonRenrakuJiko")
    private ShichosonRenrakuJikoDiv ShichosonRenrakuJiko;
    @JsonProperty("KankeiIin")
    private KankeiIinDiv KankeiIin;
    @JsonProperty("btnToSaveShinsei")
    private Button btnToSaveShinsei;
    @JsonProperty("btnToBack")
    private Button btnToBack;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("HihokenshaOutline")
    public HihokenshaOutlineDiv getHihokenshaOutline() {
        return HihokenshaOutline;
    }

    @JsonProperty("HihokenshaOutline")
    public void setHihokenshaOutline(HihokenshaOutlineDiv HihokenshaOutline) {
        this.HihokenshaOutline=HihokenshaOutline;
    }

    @JsonProperty("ddlShinseiKubunShinseiji")
    public DropDownList getDdlShinseiKubunShinseiji() {
        return ddlShinseiKubunShinseiji;
    }

    @JsonProperty("ddlShinseiKubunShinseiji")
    public void setDdlShinseiKubunShinseiji(DropDownList ddlShinseiKubunShinseiji) {
        this.ddlShinseiKubunShinseiji=ddlShinseiKubunShinseiji;
    }

    @JsonProperty("txtShinseiDate")
    public TextBoxDate getTxtShinseiDate() {
        return txtShinseiDate;
    }

    @JsonProperty("txtShinseiDate")
    public void setTxtShinseiDate(TextBoxDate txtShinseiDate) {
        this.txtShinseiDate=txtShinseiDate;
    }

    @JsonProperty("txtShinseiYukoKubun")
    public TextBox getTxtShinseiYukoKubun() {
        return txtShinseiYukoKubun;
    }

    @JsonProperty("txtShinseiYukoKubun")
    public void setTxtShinseiYukoKubun(TextBox txtShinseiYukoKubun) {
        this.txtShinseiYukoKubun=txtShinseiYukoKubun;
    }

    @JsonProperty("ddlChiku")
    public DropDownList getDdlChiku() {
        return ddlChiku;
    }

    @JsonProperty("ddlChiku")
    public void setDdlChiku(DropDownList ddlChiku) {
        this.ddlChiku=ddlChiku;
    }

    @JsonProperty("SinseiRiyu")
    public SinseiRiyuDiv getSinseiRiyu() {
        return SinseiRiyu;
    }

    @JsonProperty("SinseiRiyu")
    public void setSinseiRiyu(SinseiRiyuDiv SinseiRiyu) {
        this.SinseiRiyu=SinseiRiyu;
    }

    @JsonProperty("NinteiShinseisha")
    public NinteiShinseishaDiv getNinteiShinseisha() {
        return NinteiShinseisha;
    }

    @JsonProperty("NinteiShinseisha")
    public void setNinteiShinseisha(NinteiShinseishaDiv NinteiShinseisha) {
        this.NinteiShinseisha=NinteiShinseisha;
    }

    @JsonProperty("LatestNinteiResult")
    public LatestNinteiResultDiv getLatestNinteiResult() {
        return LatestNinteiResult;
    }

    @JsonProperty("LatestNinteiResult")
    public void setLatestNinteiResult(LatestNinteiResultDiv LatestNinteiResult) {
        this.LatestNinteiResult=LatestNinteiResult;
    }

    @JsonProperty("HihokenshaShujii")
    public HihokenshaShujiiDiv getHihokenshaShujii() {
        return HihokenshaShujii;
    }

    @JsonProperty("HihokenshaShujii")
    public void setHihokenshaShujii(HihokenshaShujiiDiv HihokenshaShujii) {
        this.HihokenshaShujii=HihokenshaShujii;
    }

    @JsonProperty("N2Hihokensha")
    public N2HihokenshaDiv getN2Hihokensha() {
        return N2Hihokensha;
    }

    @JsonProperty("N2Hihokensha")
    public void setN2Hihokensha(N2HihokenshaDiv N2Hihokensha) {
        this.N2Hihokensha=N2Hihokensha;
    }

    @JsonProperty("NinteichosainAdvanceEntry")
    public NinteichosainAdvanceEntryDiv getNinteichosainAdvanceEntry() {
        return NinteichosainAdvanceEntry;
    }

    @JsonProperty("NinteichosainAdvanceEntry")
    public void setNinteichosainAdvanceEntry(NinteichosainAdvanceEntryDiv NinteichosainAdvanceEntry) {
        this.NinteichosainAdvanceEntry=NinteichosainAdvanceEntry;
    }

    @JsonProperty("NyuinNyusho")
    public NyuinNyushoDiv getNyuinNyusho() {
        return NyuinNyusho;
    }

    @JsonProperty("NyuinNyusho")
    public void setNyuinNyusho(NyuinNyushoDiv NyuinNyusho) {
        this.NyuinNyusho=NyuinNyusho;
    }

    @JsonProperty("chkEnkitsuchiHakko")
    public CheckBoxList getChkEnkitsuchiHakko() {
        return chkEnkitsuchiHakko;
    }

    @JsonProperty("chkEnkitsuchiHakko")
    public void setChkEnkitsuchiHakko(CheckBoxList chkEnkitsuchiHakko) {
        this.chkEnkitsuchiHakko=chkEnkitsuchiHakko;
    }

    @JsonProperty("chkJohoteikyo")
    public CheckBoxList getChkJohoteikyo() {
        return chkJohoteikyo;
    }

    @JsonProperty("chkJohoteikyo")
    public void setChkJohoteikyo(CheckBoxList chkJohoteikyo) {
        this.chkJohoteikyo=chkJohoteikyo;
    }

    @JsonProperty("ShichosonRenrakuJiko")
    public ShichosonRenrakuJikoDiv getShichosonRenrakuJiko() {
        return ShichosonRenrakuJiko;
    }

    @JsonProperty("ShichosonRenrakuJiko")
    public void setShichosonRenrakuJiko(ShichosonRenrakuJikoDiv ShichosonRenrakuJiko) {
        this.ShichosonRenrakuJiko=ShichosonRenrakuJiko;
    }

    @JsonProperty("KankeiIin")
    public KankeiIinDiv getKankeiIin() {
        return KankeiIin;
    }

    @JsonProperty("KankeiIin")
    public void setKankeiIin(KankeiIinDiv KankeiIin) {
        this.KankeiIin=KankeiIin;
    }

    @JsonProperty("btnToSaveShinsei")
    public Button getBtnToSaveShinsei() {
        return btnToSaveShinsei;
    }

    @JsonProperty("btnToSaveShinsei")
    public void setBtnToSaveShinsei(Button btnToSaveShinsei) {
        this.btnToSaveShinsei=btnToSaveShinsei;
    }

    @JsonProperty("btnToBack")
    public Button getBtnToBack() {
        return btnToBack;
    }

    @JsonProperty("btnToBack")
    public void setBtnToBack(Button btnToBack) {
        this.btnToBack=btnToBack;
    }

}