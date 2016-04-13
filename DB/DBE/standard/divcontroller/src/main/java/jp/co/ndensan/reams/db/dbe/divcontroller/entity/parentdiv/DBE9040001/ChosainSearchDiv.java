package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE9040001;
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
 */
public class ChosainSearchDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtSearchChosaItakusakiCodeFrom")
    private TextBoxCode txtSearchChosaItakusakiCodeFrom;
    @JsonProperty("txtSearchChosaItakusakiCodeTo")
    private TextBoxCode txtSearchChosaItakusakiCodeTo;
    @JsonProperty("txtSearchChosaItakusakiMeisho")
    private TextBox txtSearchChosaItakusakiMeisho;
    @JsonProperty("ddlItakusakiMeisho")
    private DropDownList ddlItakusakiMeisho;
    @JsonProperty("txtSearchChosaItakusakiKanaMeisho")
    private TextBoxKana txtSearchChosaItakusakiKanaMeisho;
    @JsonProperty("ddlItakusakiKanaMeisho")
    private DropDownList ddlItakusakiKanaMeisho;
    @JsonProperty("txtSearchChosainCodeFrom")
    private TextBoxCode txtSearchChosainCodeFrom;
    @JsonProperty("txtSearchChosainCodeTo")
    private TextBoxCode txtSearchChosainCodeTo;
    @JsonProperty("txtSearchChosainShimei")
    private TextBox txtSearchChosainShimei;
    @JsonProperty("ddlChosainMeisho")
    private DropDownList ddlChosainMeisho;
    @JsonProperty("txtSearchChosainKanaShimei")
    private TextBoxKana txtSearchChosainKanaShimei;
    @JsonProperty("ddlChosainKanaMeisho")
    private DropDownList ddlChosainKanaMeisho;
    @JsonProperty("ddlChikuCode")
    private DropDownList ddlChikuCode;
    @JsonProperty("radSearchChosainJokyo")
    private RadioButton radSearchChosainJokyo;
    @JsonProperty("txtSaidaiHyojiKensu")
    private TextBoxNum txtSaidaiHyojiKensu;
    @JsonProperty("btnSearchShujii")
    private Button btnSearchShujii;
    @JsonProperty("btnClearKensakuJoken")
    private Button btnClearKensakuJoken;
    @JsonProperty("hokenshaList")
    private HokenshaListDiv hokenshaList;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
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
     * getddlItakusakiMeisho
     * @return ddlItakusakiMeisho
     */
    @JsonProperty("ddlItakusakiMeisho")
    public DropDownList getDdlItakusakiMeisho() {
        return ddlItakusakiMeisho;
    }

    /*
     * setddlItakusakiMeisho
     * @param ddlItakusakiMeisho ddlItakusakiMeisho
     */
    @JsonProperty("ddlItakusakiMeisho")
    public void setDdlItakusakiMeisho(DropDownList ddlItakusakiMeisho) {
        this.ddlItakusakiMeisho = ddlItakusakiMeisho;
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
     * getddlItakusakiKanaMeisho
     * @return ddlItakusakiKanaMeisho
     */
    @JsonProperty("ddlItakusakiKanaMeisho")
    public DropDownList getDdlItakusakiKanaMeisho() {
        return ddlItakusakiKanaMeisho;
    }

    /*
     * setddlItakusakiKanaMeisho
     * @param ddlItakusakiKanaMeisho ddlItakusakiKanaMeisho
     */
    @JsonProperty("ddlItakusakiKanaMeisho")
    public void setDdlItakusakiKanaMeisho(DropDownList ddlItakusakiKanaMeisho) {
        this.ddlItakusakiKanaMeisho = ddlItakusakiKanaMeisho;
    }

    /*
     * gettxtSearchChosainCodeFrom
     * @return txtSearchChosainCodeFrom
     */
    @JsonProperty("txtSearchChosainCodeFrom")
    public TextBoxCode getTxtSearchChosainCodeFrom() {
        return txtSearchChosainCodeFrom;
    }

    /*
     * settxtSearchChosainCodeFrom
     * @param txtSearchChosainCodeFrom txtSearchChosainCodeFrom
     */
    @JsonProperty("txtSearchChosainCodeFrom")
    public void setTxtSearchChosainCodeFrom(TextBoxCode txtSearchChosainCodeFrom) {
        this.txtSearchChosainCodeFrom = txtSearchChosainCodeFrom;
    }

    /*
     * gettxtSearchChosainCodeTo
     * @return txtSearchChosainCodeTo
     */
    @JsonProperty("txtSearchChosainCodeTo")
    public TextBoxCode getTxtSearchChosainCodeTo() {
        return txtSearchChosainCodeTo;
    }

    /*
     * settxtSearchChosainCodeTo
     * @param txtSearchChosainCodeTo txtSearchChosainCodeTo
     */
    @JsonProperty("txtSearchChosainCodeTo")
    public void setTxtSearchChosainCodeTo(TextBoxCode txtSearchChosainCodeTo) {
        this.txtSearchChosainCodeTo = txtSearchChosainCodeTo;
    }

    /*
     * gettxtSearchChosainShimei
     * @return txtSearchChosainShimei
     */
    @JsonProperty("txtSearchChosainShimei")
    public TextBox getTxtSearchChosainShimei() {
        return txtSearchChosainShimei;
    }

    /*
     * settxtSearchChosainShimei
     * @param txtSearchChosainShimei txtSearchChosainShimei
     */
    @JsonProperty("txtSearchChosainShimei")
    public void setTxtSearchChosainShimei(TextBox txtSearchChosainShimei) {
        this.txtSearchChosainShimei = txtSearchChosainShimei;
    }

    /*
     * getddlChosainMeisho
     * @return ddlChosainMeisho
     */
    @JsonProperty("ddlChosainMeisho")
    public DropDownList getDdlChosainMeisho() {
        return ddlChosainMeisho;
    }

    /*
     * setddlChosainMeisho
     * @param ddlChosainMeisho ddlChosainMeisho
     */
    @JsonProperty("ddlChosainMeisho")
    public void setDdlChosainMeisho(DropDownList ddlChosainMeisho) {
        this.ddlChosainMeisho = ddlChosainMeisho;
    }

    /*
     * gettxtSearchChosainKanaShimei
     * @return txtSearchChosainKanaShimei
     */
    @JsonProperty("txtSearchChosainKanaShimei")
    public TextBoxKana getTxtSearchChosainKanaShimei() {
        return txtSearchChosainKanaShimei;
    }

    /*
     * settxtSearchChosainKanaShimei
     * @param txtSearchChosainKanaShimei txtSearchChosainKanaShimei
     */
    @JsonProperty("txtSearchChosainKanaShimei")
    public void setTxtSearchChosainKanaShimei(TextBoxKana txtSearchChosainKanaShimei) {
        this.txtSearchChosainKanaShimei = txtSearchChosainKanaShimei;
    }

    /*
     * getddlChosainKanaMeisho
     * @return ddlChosainKanaMeisho
     */
    @JsonProperty("ddlChosainKanaMeisho")
    public DropDownList getDdlChosainKanaMeisho() {
        return ddlChosainKanaMeisho;
    }

    /*
     * setddlChosainKanaMeisho
     * @param ddlChosainKanaMeisho ddlChosainKanaMeisho
     */
    @JsonProperty("ddlChosainKanaMeisho")
    public void setDdlChosainKanaMeisho(DropDownList ddlChosainKanaMeisho) {
        this.ddlChosainKanaMeisho = ddlChosainKanaMeisho;
    }

    /*
     * getddlChikuCode
     * @return ddlChikuCode
     */
    @JsonProperty("ddlChikuCode")
    public DropDownList getDdlChikuCode() {
        return ddlChikuCode;
    }

    /*
     * setddlChikuCode
     * @param ddlChikuCode ddlChikuCode
     */
    @JsonProperty("ddlChikuCode")
    public void setDdlChikuCode(DropDownList ddlChikuCode) {
        this.ddlChikuCode = ddlChikuCode;
    }

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
     * gethokenshaList
     * @return hokenshaList
     */
    @JsonProperty("hokenshaList")
    public IHokenshaListDiv getHokenshaList() {
        return hokenshaList;
    }

    // </editor-fold>
}
