package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KaigoNinteiShinseiKihonJohoInput.KaigoNinteiShinseiKihonJohoInput;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

import java.util.HashSet;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ICommonChildDivMode;
import jp.co.ndensan.reams.uz.uza.ui.servlets._CommonChildDivModeUtil;
import jp.co.ndensan.reams.db.dbz.divcontroller.handler.commonchilddiv.KaigoNinteiShinseiKihonJohoInput.KaigoNinteiShinseiKihonJohoInput.KaigoNinteiShinseiKihonJohoInputHandler;

/**
 * KaigoNinteiShinseiKihonJohoInput のクラスファイル
 *
 * @author 自動生成
 */
public class KaigoNinteiShinseiKihonJohoInputDiv extends Panel implements IKaigoNinteiShinseiKihonJohoInputDiv {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("radShinseishoKubun")
    private RadioButton radShinseishoKubun;
    @JsonProperty("txtShinseiJokyo")
    private TextBox txtShinseiJokyo;
    @JsonProperty("txtShinseiYMD")
    private TextBoxDate txtShinseiYMD;
    @JsonProperty("ddlShinseiShubetsu")
    private DropDownList ddlShinseiShubetsu;
    @JsonProperty("ddlShinseiKubunShinseiji")
    private DropDownList ddlShinseiKubunShinseiji;
    @JsonProperty("ddlShinseiKubunHorei")
    private DropDownList ddlShinseiKubunHorei;
    @JsonProperty("ddlShisho")
    private DropDownList ddlShisho;
    @JsonProperty("chkKyuSochisha")
    private CheckBoxList chkKyuSochisha;
    @JsonProperty("ddlHihokenshaKubun")
    private DropDownList ddlHihokenshaKubun;
    @JsonProperty("chkShikakuShutokuMae")
    private CheckBoxList chkShikakuShutokuMae;
    @JsonProperty("ddlTokuteiShippei")
    private DropDownList ddlTokuteiShippei;
    @JsonProperty("ServiceSakujo")
    private ServiceSakujoDiv ServiceSakujo;
    @JsonProperty("NinteiShinseiRiyu")
    private NinteiShinseiRiyuDiv NinteiShinseiRiyu;
    @JsonProperty("hdnServiceSakujoTeikeibunKey")
    private RString hdnServiceSakujoTeikeibunKey;
    @JsonProperty("hdnNinteiRiyuTeikeibunKey")
    private RString hdnNinteiRiyuTeikeibunKey;
    @JsonProperty("hdnSubGyomuCode")
    private RString hdnSubGyomuCode;
    @JsonProperty("hdnServiceSakujoTeikeibun")
    private RString hdnServiceSakujoTeikeibun;
    @JsonProperty("hdnNinteiShinseiRiyuTeikeibun")
    private RString hdnNinteiShinseiRiyuTeikeibun;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getradShinseishoKubun
     * @return radShinseishoKubun
     */
    @JsonProperty("radShinseishoKubun")
    public RadioButton getRadShinseishoKubun() {
        return radShinseishoKubun;
    }

    /*
     * setradShinseishoKubun
     * @param radShinseishoKubun radShinseishoKubun
     */
    @JsonProperty("radShinseishoKubun")
    public void setRadShinseishoKubun(RadioButton radShinseishoKubun) {
        this.radShinseishoKubun = radShinseishoKubun;
    }

    /*
     * gettxtShinseiJokyo
     * @return txtShinseiJokyo
     */
    @JsonProperty("txtShinseiJokyo")
    public TextBox getTxtShinseiJokyo() {
        return txtShinseiJokyo;
    }

    /*
     * settxtShinseiJokyo
     * @param txtShinseiJokyo txtShinseiJokyo
     */
    @JsonProperty("txtShinseiJokyo")
    public void setTxtShinseiJokyo(TextBox txtShinseiJokyo) {
        this.txtShinseiJokyo = txtShinseiJokyo;
    }

    /*
     * gettxtShinseiYMD
     * @return txtShinseiYMD
     */
    @JsonProperty("txtShinseiYMD")
    public TextBoxDate getTxtShinseiYMD() {
        return txtShinseiYMD;
    }

    /*
     * settxtShinseiYMD
     * @param txtShinseiYMD txtShinseiYMD
     */
    @JsonProperty("txtShinseiYMD")
    public void setTxtShinseiYMD(TextBoxDate txtShinseiYMD) {
        this.txtShinseiYMD = txtShinseiYMD;
    }

    /*
     * getddlShinseiShubetsu
     * @return ddlShinseiShubetsu
     */
    @JsonProperty("ddlShinseiShubetsu")
    public DropDownList getDdlShinseiShubetsu() {
        return ddlShinseiShubetsu;
    }

    /*
     * setddlShinseiShubetsu
     * @param ddlShinseiShubetsu ddlShinseiShubetsu
     */
    @JsonProperty("ddlShinseiShubetsu")
    public void setDdlShinseiShubetsu(DropDownList ddlShinseiShubetsu) {
        this.ddlShinseiShubetsu = ddlShinseiShubetsu;
    }

    /*
     * getddlShinseiKubunShinseiji
     * @return ddlShinseiKubunShinseiji
     */
    @JsonProperty("ddlShinseiKubunShinseiji")
    public DropDownList getDdlShinseiKubunShinseiji() {
        return ddlShinseiKubunShinseiji;
    }

    /*
     * setddlShinseiKubunShinseiji
     * @param ddlShinseiKubunShinseiji ddlShinseiKubunShinseiji
     */
    @JsonProperty("ddlShinseiKubunShinseiji")
    public void setDdlShinseiKubunShinseiji(DropDownList ddlShinseiKubunShinseiji) {
        this.ddlShinseiKubunShinseiji = ddlShinseiKubunShinseiji;
    }

    /*
     * getddlShinseiKubunHorei
     * @return ddlShinseiKubunHorei
     */
    @JsonProperty("ddlShinseiKubunHorei")
    public DropDownList getDdlShinseiKubunHorei() {
        return ddlShinseiKubunHorei;
    }

    /*
     * setddlShinseiKubunHorei
     * @param ddlShinseiKubunHorei ddlShinseiKubunHorei
     */
    @JsonProperty("ddlShinseiKubunHorei")
    public void setDdlShinseiKubunHorei(DropDownList ddlShinseiKubunHorei) {
        this.ddlShinseiKubunHorei = ddlShinseiKubunHorei;
    }

    /*
     * getddlShisho
     * @return ddlShisho
     */
    @JsonProperty("ddlShisho")
    public DropDownList getDdlShisho() {
        return ddlShisho;
    }

    /*
     * setddlShisho
     * @param ddlShisho ddlShisho
     */
    @JsonProperty("ddlShisho")
    public void setDdlShisho(DropDownList ddlShisho) {
        this.ddlShisho = ddlShisho;
    }

    /*
     * getchkKyuSochisha
     * @return chkKyuSochisha
     */
    @JsonProperty("chkKyuSochisha")
    public CheckBoxList getChkKyuSochisha() {
        return chkKyuSochisha;
    }

    /*
     * setchkKyuSochisha
     * @param chkKyuSochisha chkKyuSochisha
     */
    @JsonProperty("chkKyuSochisha")
    public void setChkKyuSochisha(CheckBoxList chkKyuSochisha) {
        this.chkKyuSochisha = chkKyuSochisha;
    }

    /*
     * getddlHihokenshaKubun
     * @return ddlHihokenshaKubun
     */
    @JsonProperty("ddlHihokenshaKubun")
    public DropDownList getDdlHihokenshaKubun() {
        return ddlHihokenshaKubun;
    }

    /*
     * setddlHihokenshaKubun
     * @param ddlHihokenshaKubun ddlHihokenshaKubun
     */
    @JsonProperty("ddlHihokenshaKubun")
    public void setDdlHihokenshaKubun(DropDownList ddlHihokenshaKubun) {
        this.ddlHihokenshaKubun = ddlHihokenshaKubun;
    }

    /*
     * getchkShikakuShutokuMae
     * @return chkShikakuShutokuMae
     */
    @JsonProperty("chkShikakuShutokuMae")
    public CheckBoxList getChkShikakuShutokuMae() {
        return chkShikakuShutokuMae;
    }

    /*
     * setchkShikakuShutokuMae
     * @param chkShikakuShutokuMae chkShikakuShutokuMae
     */
    @JsonProperty("chkShikakuShutokuMae")
    public void setChkShikakuShutokuMae(CheckBoxList chkShikakuShutokuMae) {
        this.chkShikakuShutokuMae = chkShikakuShutokuMae;
    }

    /*
     * getddlTokuteiShippei
     * @return ddlTokuteiShippei
     */
    @JsonProperty("ddlTokuteiShippei")
    public DropDownList getDdlTokuteiShippei() {
        return ddlTokuteiShippei;
    }

    /*
     * setddlTokuteiShippei
     * @param ddlTokuteiShippei ddlTokuteiShippei
     */
    @JsonProperty("ddlTokuteiShippei")
    public void setDdlTokuteiShippei(DropDownList ddlTokuteiShippei) {
        this.ddlTokuteiShippei = ddlTokuteiShippei;
    }

    /*
     * getServiceSakujo
     * @return ServiceSakujo
     */
    @JsonProperty("ServiceSakujo")
    public ServiceSakujoDiv getServiceSakujo() {
        return ServiceSakujo;
    }

    /*
     * setServiceSakujo
     * @param ServiceSakujo ServiceSakujo
     */
    @JsonProperty("ServiceSakujo")
    public void setServiceSakujo(ServiceSakujoDiv ServiceSakujo) {
        this.ServiceSakujo = ServiceSakujo;
    }

    /*
     * getNinteiShinseiRiyu
     * @return NinteiShinseiRiyu
     */
    @JsonProperty("NinteiShinseiRiyu")
    public NinteiShinseiRiyuDiv getNinteiShinseiRiyu() {
        return NinteiShinseiRiyu;
    }

    /*
     * setNinteiShinseiRiyu
     * @param NinteiShinseiRiyu NinteiShinseiRiyu
     */
    @JsonProperty("NinteiShinseiRiyu")
    public void setNinteiShinseiRiyu(NinteiShinseiRiyuDiv NinteiShinseiRiyu) {
        this.NinteiShinseiRiyu = NinteiShinseiRiyu;
    }

    /*
     * gethdnServiceSakujoTeikeibunKey
     * @return hdnServiceSakujoTeikeibunKey
     */
    @JsonProperty("hdnServiceSakujoTeikeibunKey")
    public RString getHdnServiceSakujoTeikeibunKey() {
        return hdnServiceSakujoTeikeibunKey;
    }

    /*
     * sethdnServiceSakujoTeikeibunKey
     * @param hdnServiceSakujoTeikeibunKey hdnServiceSakujoTeikeibunKey
     */
    @JsonProperty("hdnServiceSakujoTeikeibunKey")
    public void setHdnServiceSakujoTeikeibunKey(RString hdnServiceSakujoTeikeibunKey) {
        this.hdnServiceSakujoTeikeibunKey = hdnServiceSakujoTeikeibunKey;
    }

    /*
     * gethdnNinteiRiyuTeikeibunKey
     * @return hdnNinteiRiyuTeikeibunKey
     */
    @JsonProperty("hdnNinteiRiyuTeikeibunKey")
    public RString getHdnNinteiRiyuTeikeibunKey() {
        return hdnNinteiRiyuTeikeibunKey;
    }

    /*
     * sethdnNinteiRiyuTeikeibunKey
     * @param hdnNinteiRiyuTeikeibunKey hdnNinteiRiyuTeikeibunKey
     */
    @JsonProperty("hdnNinteiRiyuTeikeibunKey")
    public void setHdnNinteiRiyuTeikeibunKey(RString hdnNinteiRiyuTeikeibunKey) {
        this.hdnNinteiRiyuTeikeibunKey = hdnNinteiRiyuTeikeibunKey;
    }

    /*
     * gethdnSubGyomuCode
     * @return hdnSubGyomuCode
     */
    @JsonProperty("hdnSubGyomuCode")
    public RString getHdnSubGyomuCode() {
        return hdnSubGyomuCode;
    }

    /*
     * sethdnSubGyomuCode
     * @param hdnSubGyomuCode hdnSubGyomuCode
     */
    @JsonProperty("hdnSubGyomuCode")
    public void setHdnSubGyomuCode(RString hdnSubGyomuCode) {
        this.hdnSubGyomuCode = hdnSubGyomuCode;
    }

    /*
     * gethdnServiceSakujoTeikeibun
     * @return hdnServiceSakujoTeikeibun
     */
    @JsonProperty("hdnServiceSakujoTeikeibun")
    public RString getHdnServiceSakujoTeikeibun() {
        return hdnServiceSakujoTeikeibun;
    }

    /*
     * sethdnServiceSakujoTeikeibun
     * @param hdnServiceSakujoTeikeibun hdnServiceSakujoTeikeibun
     */
    @JsonProperty("hdnServiceSakujoTeikeibun")
    public void setHdnServiceSakujoTeikeibun(RString hdnServiceSakujoTeikeibun) {
        this.hdnServiceSakujoTeikeibun = hdnServiceSakujoTeikeibun;
    }

    /*
     * gethdnNinteiShinseiRiyuTeikeibun
     * @return hdnNinteiShinseiRiyuTeikeibun
     */
    @JsonProperty("hdnNinteiShinseiRiyuTeikeibun")
    public RString getHdnNinteiShinseiRiyuTeikeibun() {
        return hdnNinteiShinseiRiyuTeikeibun;
    }

    /*
     * sethdnNinteiShinseiRiyuTeikeibun
     * @param hdnNinteiShinseiRiyuTeikeibun hdnNinteiShinseiRiyuTeikeibun
     */
    @JsonProperty("hdnNinteiShinseiRiyuTeikeibun")
    public void setHdnNinteiShinseiRiyuTeikeibun(RString hdnNinteiShinseiRiyuTeikeibun) {
        this.hdnNinteiShinseiRiyuTeikeibun = hdnNinteiShinseiRiyuTeikeibun;
    }

    /*
     * [共有子DIVモード]
     */
    @JsonProperty("modes")
    private HashSet<Mode> modes;

    @Override
    public void setInputMode(RString inputType) {
        this.setMode_InputType(InputType.getEnum(inputType.toString()));
    }

    @Override
    public void initialize() {
        getHandler(this).initialize();
    }

    public static enum InputType implements ICommonChildDivMode {

        AllInputMode("AllInputMode"),
        ServiceHenkoMode("ServiceHenkoMode"),
        ShinseiMode("ShinseiMode"),
        RirekiShuseiMode("RirekiShuseiMode"),
        ShokkenShuseiAndTorikeshiMode("ShokkenShuseiAndTorikeshiMode"),
        ShinseiShuseiMode("ShinseiShuseiMode"),
        KubunHenkoMode("KubunHenkoMode"),
        TennyuMode("TennyuMode"),
        NinteiMode("NinteiMode"),
        ShokaiMode("ShokaiMode"),
        TorikeshiAndSakujoMode("TorikeshiAndSakujoMode"),
        TokushuTsuikaMode("TokushuTsuikaMode"),
        TokushuShuseiMode("TokushuShuseiMode"),
        ShokkenKisaiMode("ShokkenKisaiMode");

        private final String name;

        private InputType(final String name) {
            this.name = name;
        }

        public static InputType getEnum(String str) {
            InputType[] enumArray = InputType.values();

            for (InputType enumStr : enumArray) {
                if (str.equals(enumStr.name.toString())) {
                    return enumStr;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return this.name;
        }

    }

    public InputType getMode_InputType() {
        return (InputType) _CommonChildDivModeUtil.getMode(this.modes, InputType.class);
    }

    public void setMode_InputType(InputType value) {
        _CommonChildDivModeUtil.setMode(this.modes, InputType.class, value);
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public ButtonDialog getBtnServiceSakujoTeikeibun() {
        return this.getServiceSakujo().getBtnServiceSakujoTeikeibun();
    }

    @JsonIgnore
    public void setBtnServiceSakujoTeikeibun(ButtonDialog btnServiceSakujoTeikeibun) {
        this.getServiceSakujo().setBtnServiceSakujoTeikeibun(btnServiceSakujoTeikeibun);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtServiceSakujo() {
        return this.getServiceSakujo().getTxtServiceSakujo();
    }

    @JsonIgnore
    public void setTxtServiceSakujo(TextBoxMultiLine txtServiceSakujo) {
        this.getServiceSakujo().setTxtServiceSakujo(txtServiceSakujo);
    }

    @JsonIgnore
    public ButtonDialog getBtnNinteiShinseiRiyuTeikeibun() {
        return this.getNinteiShinseiRiyu().getBtnNinteiShinseiRiyuTeikeibun();
    }

    @JsonIgnore
    public void setBtnNinteiShinseiRiyuTeikeibun(ButtonDialog btnNinteiShinseiRiyuTeikeibun) {
        this.getNinteiShinseiRiyu().setBtnNinteiShinseiRiyuTeikeibun(btnNinteiShinseiRiyuTeikeibun);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtNinteiShinseRiyu() {
        return this.getNinteiShinseiRiyu().getTxtNinteiShinseRiyu();
    }

    @JsonIgnore
    public void setTxtNinteiShinseRiyu(TextBoxMultiLine txtNinteiShinseRiyu) {
        this.getNinteiShinseiRiyu().setTxtNinteiShinseRiyu(txtNinteiShinseRiyu);
    }

    // </editor-fold>
    //--------------- この行より下にコードを追加してください -------------------
    private KaigoNinteiShinseiKihonJohoInputHandler getHandler(KaigoNinteiShinseiKihonJohoInputDiv div) {
        return new KaigoNinteiShinseiKihonJohoInputHandler(div);
    }
}
