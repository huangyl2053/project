package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810022;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.HorizontalLine;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBox;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxCode;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxDate;

/**
 * panelTwo のクラスファイル
 *
 * @reamsid_L DBC-1010-050 quxiaodong
 */
public class panelTwoDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("hlUp")
    private HorizontalLine hlUp;
    @JsonProperty("txtServiceTeikyoYM")
    private TextBoxDate txtServiceTeikyoYM;
    @JsonProperty("txtShinseiYMD")
    private TextBoxDate txtShinseiYMD;
    @JsonProperty("txtJigyoshaBango")
    private TextBoxCode txtJigyoshaBango;
    @JsonProperty("txtMeisaiBango")
    private TextBoxCode txtMeisaiBango;
    @JsonProperty("txtShomeisho")
    private TextBox txtShomeisho;
    @JsonProperty("btnKihonInfo")
    private Button btnKihonInfo;
    @JsonProperty("btnKyufuMeisai")
    private Button btnKyufuMeisai;
    @JsonProperty("btnTokuteiShinryouhi")
    private Button btnTokuteiShinryouhi;
    @JsonProperty("btnServiceKeikakuhi")
    private Button btnServiceKeikakuhi;
    @JsonProperty("btnTokuteiNyushosya")
    private Button btnTokuteiNyushosya;
    @JsonProperty("btnGoukeiInfo")
    private Button btnGoukeiInfo;
    @JsonProperty("btnKyufuhiMeisaiJyutoku")
    private Button btnKyufuhiMeisaiJyutoku;
    @JsonProperty("btnKinkyushisetuRyoyouhi")
    private Button btnKinkyushisetuRyoyouhi;
    @JsonProperty("btnKinkyujiShoteiShikkan")
    private Button btnKinkyujiShoteiShikkan;
    @JsonProperty("btnShokujihiyo")
    private Button btnShokujihiyo;
    @JsonProperty("btnSeikyugakuShukei")
    private Button btnSeikyugakuShukei;
    @JsonProperty("btnShafukukeigenGaku")
    private Button btnShafukukeigenGaku;
    @JsonProperty("hlDown")
    private HorizontalLine hlDown;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * gethlUp
     * @return hlUp
     */
    @JsonProperty("hlUp")
    public HorizontalLine getHlUp() {
        return hlUp;
    }

    /*
     * sethlUp
     * @param hlUp hlUp
     */
    @JsonProperty("hlUp")
    public void setHlUp(HorizontalLine hlUp) {
        this.hlUp = hlUp;
    }

    /*
     * gettxtServiceTeikyoYM
     * @return txtServiceTeikyoYM
     */
    @JsonProperty("txtServiceTeikyoYM")
    public TextBoxDate getTxtServiceTeikyoYM() {
        return txtServiceTeikyoYM;
    }

    /*
     * settxtServiceTeikyoYM
     * @param txtServiceTeikyoYM txtServiceTeikyoYM
     */
    @JsonProperty("txtServiceTeikyoYM")
    public void setTxtServiceTeikyoYM(TextBoxDate txtServiceTeikyoYM) {
        this.txtServiceTeikyoYM = txtServiceTeikyoYM;
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
     * gettxtJigyoshaBango
     * @return txtJigyoshaBango
     */
    @JsonProperty("txtJigyoshaBango")
    public TextBoxCode getTxtJigyoshaBango() {
        return txtJigyoshaBango;
    }

    /*
     * settxtJigyoshaBango
     * @param txtJigyoshaBango txtJigyoshaBango
     */
    @JsonProperty("txtJigyoshaBango")
    public void setTxtJigyoshaBango(TextBoxCode txtJigyoshaBango) {
        this.txtJigyoshaBango = txtJigyoshaBango;
    }

    /*
     * gettxtMeisaiBango
     * @return txtMeisaiBango
     */
    @JsonProperty("txtMeisaiBango")
    public TextBoxCode getTxtMeisaiBango() {
        return txtMeisaiBango;
    }

    /*
     * settxtMeisaiBango
     * @param txtMeisaiBango txtMeisaiBango
     */
    @JsonProperty("txtMeisaiBango")
    public void setTxtMeisaiBango(TextBoxCode txtMeisaiBango) {
        this.txtMeisaiBango = txtMeisaiBango;
    }

    /*
     * gettxtShomeisho
     * @return txtShomeisho
     */
    @JsonProperty("txtShomeisho")
    public TextBox getTxtShomeisho() {
        return txtShomeisho;
    }

    /*
     * settxtShomeisho
     * @param txtShomeisho txtShomeisho
     */
    @JsonProperty("txtShomeisho")
    public void setTxtShomeisho(TextBox txtShomeisho) {
        this.txtShomeisho = txtShomeisho;
    }

    /*
     * getbtnKihonInfo
     * @return btnKihonInfo
     */
    @JsonProperty("btnKihonInfo")
    public Button getBtnKihonInfo() {
        return btnKihonInfo;
    }

    /*
     * setbtnKihonInfo
     * @param btnKihonInfo btnKihonInfo
     */
    @JsonProperty("btnKihonInfo")
    public void setBtnKihonInfo(Button btnKihonInfo) {
        this.btnKihonInfo = btnKihonInfo;
    }

    /*
     * getbtnKyufuMeisai
     * @return btnKyufuMeisai
     */
    @JsonProperty("btnKyufuMeisai")
    public Button getBtnKyufuMeisai() {
        return btnKyufuMeisai;
    }

    /*
     * setbtnKyufuMeisai
     * @param btnKyufuMeisai btnKyufuMeisai
     */
    @JsonProperty("btnKyufuMeisai")
    public void setBtnKyufuMeisai(Button btnKyufuMeisai) {
        this.btnKyufuMeisai = btnKyufuMeisai;
    }

    /*
     * getbtnTokuteiShinryouhi
     * @return btnTokuteiShinryouhi
     */
    @JsonProperty("btnTokuteiShinryouhi")
    public Button getBtnTokuteiShinryouhi() {
        return btnTokuteiShinryouhi;
    }

    /*
     * setbtnTokuteiShinryouhi
     * @param btnTokuteiShinryouhi btnTokuteiShinryouhi
     */
    @JsonProperty("btnTokuteiShinryouhi")
    public void setBtnTokuteiShinryouhi(Button btnTokuteiShinryouhi) {
        this.btnTokuteiShinryouhi = btnTokuteiShinryouhi;
    }

    /*
     * getbtnServiceKeikakuhi
     * @return btnServiceKeikakuhi
     */
    @JsonProperty("btnServiceKeikakuhi")
    public Button getBtnServiceKeikakuhi() {
        return btnServiceKeikakuhi;
    }

    /*
     * setbtnServiceKeikakuhi
     * @param btnServiceKeikakuhi btnServiceKeikakuhi
     */
    @JsonProperty("btnServiceKeikakuhi")
    public void setBtnServiceKeikakuhi(Button btnServiceKeikakuhi) {
        this.btnServiceKeikakuhi = btnServiceKeikakuhi;
    }

    /*
     * getbtnTokuteiNyushosya
     * @return btnTokuteiNyushosya
     */
    @JsonProperty("btnTokuteiNyushosya")
    public Button getBtnTokuteiNyushosya() {
        return btnTokuteiNyushosya;
    }

    /*
     * setbtnTokuteiNyushosya
     * @param btnTokuteiNyushosya btnTokuteiNyushosya
     */
    @JsonProperty("btnTokuteiNyushosya")
    public void setBtnTokuteiNyushosya(Button btnTokuteiNyushosya) {
        this.btnTokuteiNyushosya = btnTokuteiNyushosya;
    }

    /*
     * getbtnGoukeiInfo
     * @return btnGoukeiInfo
     */
    @JsonProperty("btnGoukeiInfo")
    public Button getBtnGoukeiInfo() {
        return btnGoukeiInfo;
    }

    /*
     * setbtnGoukeiInfo
     * @param btnGoukeiInfo btnGoukeiInfo
     */
    @JsonProperty("btnGoukeiInfo")
    public void setBtnGoukeiInfo(Button btnGoukeiInfo) {
        this.btnGoukeiInfo = btnGoukeiInfo;
    }

    /*
     * getbtnKyufuhiMeisaiJyutoku
     * @return btnKyufuhiMeisaiJyutoku
     */
    @JsonProperty("btnKyufuhiMeisaiJyutoku")
    public Button getBtnKyufuhiMeisaiJyutoku() {
        return btnKyufuhiMeisaiJyutoku;
    }

    /*
     * setbtnKyufuhiMeisaiJyutoku
     * @param btnKyufuhiMeisaiJyutoku btnKyufuhiMeisaiJyutoku
     */
    @JsonProperty("btnKyufuhiMeisaiJyutoku")
    public void setBtnKyufuhiMeisaiJyutoku(Button btnKyufuhiMeisaiJyutoku) {
        this.btnKyufuhiMeisaiJyutoku = btnKyufuhiMeisaiJyutoku;
    }

    /*
     * getbtnKinkyushisetuRyoyouhi
     * @return btnKinkyushisetuRyoyouhi
     */
    @JsonProperty("btnKinkyushisetuRyoyouhi")
    public Button getBtnKinkyushisetuRyoyouhi() {
        return btnKinkyushisetuRyoyouhi;
    }

    /*
     * setbtnKinkyushisetuRyoyouhi
     * @param btnKinkyushisetuRyoyouhi btnKinkyushisetuRyoyouhi
     */
    @JsonProperty("btnKinkyushisetuRyoyouhi")
    public void setBtnKinkyushisetuRyoyouhi(Button btnKinkyushisetuRyoyouhi) {
        this.btnKinkyushisetuRyoyouhi = btnKinkyushisetuRyoyouhi;
    }

    /*
     * getbtnKinkyujiShoteiShikkan
     * @return btnKinkyujiShoteiShikkan
     */
    @JsonProperty("btnKinkyujiShoteiShikkan")
    public Button getBtnKinkyujiShoteiShikkan() {
        return btnKinkyujiShoteiShikkan;
    }

    /*
     * setbtnKinkyujiShoteiShikkan
     * @param btnKinkyujiShoteiShikkan btnKinkyujiShoteiShikkan
     */
    @JsonProperty("btnKinkyujiShoteiShikkan")
    public void setBtnKinkyujiShoteiShikkan(Button btnKinkyujiShoteiShikkan) {
        this.btnKinkyujiShoteiShikkan = btnKinkyujiShoteiShikkan;
    }

    /*
     * getbtnShokujihiyo
     * @return btnShokujihiyo
     */
    @JsonProperty("btnShokujihiyo")
    public Button getBtnShokujihiyo() {
        return btnShokujihiyo;
    }

    /*
     * setbtnShokujihiyo
     * @param btnShokujihiyo btnShokujihiyo
     */
    @JsonProperty("btnShokujihiyo")
    public void setBtnShokujihiyo(Button btnShokujihiyo) {
        this.btnShokujihiyo = btnShokujihiyo;
    }

    /*
     * getbtnSeikyugakuShukei
     * @return btnSeikyugakuShukei
     */
    @JsonProperty("btnSeikyugakuShukei")
    public Button getBtnSeikyugakuShukei() {
        return btnSeikyugakuShukei;
    }

    /*
     * setbtnSeikyugakuShukei
     * @param btnSeikyugakuShukei btnSeikyugakuShukei
     */
    @JsonProperty("btnSeikyugakuShukei")
    public void setBtnSeikyugakuShukei(Button btnSeikyugakuShukei) {
        this.btnSeikyugakuShukei = btnSeikyugakuShukei;
    }

    /*
     * getbtnShafukukeigenGaku
     * @return btnShafukukeigenGaku
     */
    @JsonProperty("btnShafukukeigenGaku")
    public Button getBtnShafukukeigenGaku() {
        return btnShafukukeigenGaku;
    }

    /*
     * setbtnShafukukeigenGaku
     * @param btnShafukukeigenGaku btnShafukukeigenGaku
     */
    @JsonProperty("btnShafukukeigenGaku")
    public void setBtnShafukukeigenGaku(Button btnShafukukeigenGaku) {
        this.btnShafukukeigenGaku = btnShafukukeigenGaku;
    }

    /*
     * gethlDown
     * @return hlDown
     */
    @JsonProperty("hlDown")
    public HorizontalLine getHlDown() {
        return hlDown;
    }

    /*
     * sethlDown
     * @param hlDown hlDown
     */
    @JsonProperty("hlDown")
    public void setHlDown(HorizontalLine hlDown) {
        this.hlDown = hlDown;
    }

    // </editor-fold>
}