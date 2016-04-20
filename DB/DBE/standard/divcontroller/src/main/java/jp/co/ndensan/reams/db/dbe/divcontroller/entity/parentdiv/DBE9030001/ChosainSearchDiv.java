package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE9030001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.hokenshalist.HokenshaList.HokenshaListDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.hokenshalist.HokenshaList.IHokenshaListDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.DropDownList;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.RadioButton;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBox;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxCode;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxKana;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxNum;

/**
 * ChosainSearch のクラスファイル
 *
 * @author 自動生成
 */
public class ChosainSearchDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：バージョン情報無し">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("radSearchChosainJokyo")
    private RadioButton radSearchChosainJokyo;
    @JsonProperty("txtSearchChosaItakusakiCodeFrom")
    private TextBoxCode txtSearchChosaItakusakiCodeFrom;
    @JsonProperty("txtSearchChosaItakusakiCodeTo")
    private TextBoxCode txtSearchChosaItakusakiCodeTo;
    @JsonProperty("txtSearchChosaItakusakiMeisho")
    private TextBox txtSearchChosaItakusakiMeisho;
    @JsonProperty("txtSearchChosaItakusakiKanaMeisho")
    private TextBoxKana txtSearchChosaItakusakiKanaMeisho;
    @JsonProperty("ddlitakukubun")
    private DropDownList ddlitakukubun;
    @JsonProperty("ddlkikankubun")
    private DropDownList ddlkikankubun;
    @JsonProperty("txtSaidaiHyojiKensu")
    private TextBoxNum txtSaidaiHyojiKensu;
    @JsonProperty("btnSearchShujii")
    private Button btnSearchShujii;
    @JsonProperty("btnClearKensakuJoken")
    private Button btnClearKensakuJoken;
    @JsonProperty("ccdHokenshaList")
    private HokenshaListDiv ccdHokenshaList;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getradSearchChosainJokyo
     * @return radSearchChosainJokyo
     */
    @JsonProperty("radSearchChosainJokyo")
    public RadioButton getRadSearchChosainJokyo() {
        return radSearchChosainJokyo;
    }

    /*
     * setradSearchChosainJokyo
     * @param radSearchChosainJokyo radSearchChosainJokyo
     */
    @JsonProperty("radSearchChosainJokyo")
    public void setRadSearchChosainJokyo(RadioButton radSearchChosainJokyo) {
        this.radSearchChosainJokyo = radSearchChosainJokyo;
    }

    /*
     * gettxtSearchChosaItakusakiCodeFrom
     * @return txtSearchChosaItakusakiCodeFrom
     */
    @JsonProperty("txtSearchChosaItakusakiCodeFrom")
    public TextBoxCode getTxtSearchChosaItakusakiCodeFrom() {
        return txtSearchChosaItakusakiCodeFrom;
    }

    /*
     * settxtSearchChosaItakusakiCodeFrom
     * @param txtSearchChosaItakusakiCodeFrom txtSearchChosaItakusakiCodeFrom
     */
    @JsonProperty("txtSearchChosaItakusakiCodeFrom")
    public void setTxtSearchChosaItakusakiCodeFrom(TextBoxCode txtSearchChosaItakusakiCodeFrom) {
        this.txtSearchChosaItakusakiCodeFrom = txtSearchChosaItakusakiCodeFrom;
    }

    /*
     * gettxtSearchChosaItakusakiCodeTo
     * @return txtSearchChosaItakusakiCodeTo
     */
    @JsonProperty("txtSearchChosaItakusakiCodeTo")
    public TextBoxCode getTxtSearchChosaItakusakiCodeTo() {
        return txtSearchChosaItakusakiCodeTo;
    }

    /*
     * settxtSearchChosaItakusakiCodeTo
     * @param txtSearchChosaItakusakiCodeTo txtSearchChosaItakusakiCodeTo
     */
    @JsonProperty("txtSearchChosaItakusakiCodeTo")
    public void setTxtSearchChosaItakusakiCodeTo(TextBoxCode txtSearchChosaItakusakiCodeTo) {
        this.txtSearchChosaItakusakiCodeTo = txtSearchChosaItakusakiCodeTo;
    }

    /*
     * gettxtSearchChosaItakusakiMeisho
     * @return txtSearchChosaItakusakiMeisho
     */
    @JsonProperty("txtSearchChosaItakusakiMeisho")
    public TextBox getTxtSearchChosaItakusakiMeisho() {
        return txtSearchChosaItakusakiMeisho;
    }

    /*
     * settxtSearchChosaItakusakiMeisho
     * @param txtSearchChosaItakusakiMeisho txtSearchChosaItakusakiMeisho
     */
    @JsonProperty("txtSearchChosaItakusakiMeisho")
    public void setTxtSearchChosaItakusakiMeisho(TextBox txtSearchChosaItakusakiMeisho) {
        this.txtSearchChosaItakusakiMeisho = txtSearchChosaItakusakiMeisho;
    }

    /*
     * gettxtSearchChosaItakusakiKanaMeisho
     * @return txtSearchChosaItakusakiKanaMeisho
     */
    @JsonProperty("txtSearchChosaItakusakiKanaMeisho")
    public TextBoxKana getTxtSearchChosaItakusakiKanaMeisho() {
        return txtSearchChosaItakusakiKanaMeisho;
    }

    /*
     * settxtSearchChosaItakusakiKanaMeisho
     * @param txtSearchChosaItakusakiKanaMeisho txtSearchChosaItakusakiKanaMeisho
     */
    @JsonProperty("txtSearchChosaItakusakiKanaMeisho")
    public void setTxtSearchChosaItakusakiKanaMeisho(TextBoxKana txtSearchChosaItakusakiKanaMeisho) {
        this.txtSearchChosaItakusakiKanaMeisho = txtSearchChosaItakusakiKanaMeisho;
    }

    /*
     * getddlitakukubun
     * @return ddlitakukubun
     */
    @JsonProperty("ddlitakukubun")
    public DropDownList getDdlitakukubun() {
        return ddlitakukubun;
    }

    /*
     * setddlitakukubun
     * @param ddlitakukubun ddlitakukubun
     */
    @JsonProperty("ddlitakukubun")
    public void setDdlitakukubun(DropDownList ddlitakukubun) {
        this.ddlitakukubun = ddlitakukubun;
    }

    /*
     * getddlkikankubun
     * @return ddlkikankubun
     */
    @JsonProperty("ddlkikankubun")
    public DropDownList getDdlkikankubun() {
        return ddlkikankubun;
    }

    /*
     * setddlkikankubun
     * @param ddlkikankubun ddlkikankubun
     */
    @JsonProperty("ddlkikankubun")
    public void setDdlkikankubun(DropDownList ddlkikankubun) {
        this.ddlkikankubun = ddlkikankubun;
    }

    /*
     * gettxtSaidaiHyojiKensu
     * @return txtSaidaiHyojiKensu
     */
    @JsonProperty("txtSaidaiHyojiKensu")
    public TextBoxNum getTxtSaidaiHyojiKensu() {
        return txtSaidaiHyojiKensu;
    }

    /*
     * settxtSaidaiHyojiKensu
     * @param txtSaidaiHyojiKensu txtSaidaiHyojiKensu
     */
    @JsonProperty("txtSaidaiHyojiKensu")
    public void setTxtSaidaiHyojiKensu(TextBoxNum txtSaidaiHyojiKensu) {
        this.txtSaidaiHyojiKensu = txtSaidaiHyojiKensu;
    }

    /*
     * getbtnSearchShujii
     * @return btnSearchShujii
     */
    @JsonProperty("btnSearchShujii")
    public Button getBtnSearchShujii() {
        return btnSearchShujii;
    }

    /*
     * setbtnSearchShujii
     * @param btnSearchShujii btnSearchShujii
     */
    @JsonProperty("btnSearchShujii")
    public void setBtnSearchShujii(Button btnSearchShujii) {
        this.btnSearchShujii = btnSearchShujii;
    }

    /*
     * getbtnClearKensakuJoken
     * @return btnClearKensakuJoken
     */
    @JsonProperty("btnClearKensakuJoken")
    public Button getBtnClearKensakuJoken() {
        return btnClearKensakuJoken;
    }

    /*
     * setbtnClearKensakuJoken
     * @param btnClearKensakuJoken btnClearKensakuJoken
     */
    @JsonProperty("btnClearKensakuJoken")
    public void setBtnClearKensakuJoken(Button btnClearKensakuJoken) {
        this.btnClearKensakuJoken = btnClearKensakuJoken;
    }

    /*
     * getccdHokenshaList
     * @return ccdHokenshaList
     */
    @JsonProperty("ccdHokenshaList")
    public IHokenshaListDiv getCcdHokenshaList() {
        return ccdHokenshaList;
    }

    // </editor-fold>
    public void clear() {
        this.getCcdHokenshaList().loadHokenshaList();
        this.getRadSearchChosainJokyo().setSelectedIndex(0);
        this.getTxtSearchChosaItakusakiCodeFrom().clearValue();
        this.getTxtSearchChosaItakusakiCodeTo().clearValue();
        this.getTxtSearchChosaItakusakiMeisho().clearValue();
        this.getTxtSearchChosaItakusakiKanaMeisho().clearValue();
        this.getDdlitakukubun().setSelectedIndex(0);
        this.getDdlkikankubun().setSelectedIndex(0);
        this.getTxtSaidaiHyojiKensu().clearValue();
    }
}