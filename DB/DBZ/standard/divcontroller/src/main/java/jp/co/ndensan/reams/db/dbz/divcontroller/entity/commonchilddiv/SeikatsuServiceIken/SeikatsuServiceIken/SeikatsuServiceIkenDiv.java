package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.SeikatsuServiceIken.SeikatsuServiceIken;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.SeikatsuServiceIken.SeikatsuServiceIken.ISeikatsuServiceIkenDiv;

/**
 * SeikatsuServiceIken のクラスファイル 
 * 
 * @author 自動生成
 */
public class SeikatsuServiceIkenDiv extends Panel implements ISeikatsuServiceIkenDiv {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2015-11-30_08-54-50">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("Ido")
    private IdoDiv Ido;
    @JsonProperty("EiyoShokuseikatsu")
    private EiyoShokuseikatsuDiv EiyoShokuseikatsu;
    @JsonProperty("HasseiJotaiTaishoHoshin")
    private HasseiJotaiTaishoHoshinDiv HasseiJotaiTaishoHoshin;
    @JsonProperty("SeikatsuKinoMitoshi")
    private SeikatsuKinoMitoshiDiv SeikatsuKinoMitoshi;
    @JsonProperty("IgakutekiKanriHitsuyosei")
    private IgakutekiKanriHitsuyoseiDiv IgakutekiKanriHitsuyosei;
    @JsonProperty("IgakutekiKantenRyuiten")
    private IgakutekiKantenRyuitenDiv IgakutekiKantenRyuiten;
    @JsonProperty("KansenshoUmu")
    private KansenshoUmuDiv KansenshoUmu;
    @JsonProperty("btnKakutei")
    private Button btnKakutei;
    @JsonProperty("btnCancel")
    private Button btnCancel;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getIdo
     * @return Ido
     */
    @JsonProperty("Ido")
    public IdoDiv getIdo() {
        return Ido;
    }

    /*
     * setIdo
     * @param Ido Ido
     */
    @JsonProperty("Ido")
    public void setIdo(IdoDiv Ido) {
        this.Ido = Ido;
    }

    /*
     * getEiyoShokuseikatsu
     * @return EiyoShokuseikatsu
     */
    @JsonProperty("EiyoShokuseikatsu")
    public EiyoShokuseikatsuDiv getEiyoShokuseikatsu() {
        return EiyoShokuseikatsu;
    }

    /*
     * setEiyoShokuseikatsu
     * @param EiyoShokuseikatsu EiyoShokuseikatsu
     */
    @JsonProperty("EiyoShokuseikatsu")
    public void setEiyoShokuseikatsu(EiyoShokuseikatsuDiv EiyoShokuseikatsu) {
        this.EiyoShokuseikatsu = EiyoShokuseikatsu;
    }

    /*
     * getHasseiJotaiTaishoHoshin
     * @return HasseiJotaiTaishoHoshin
     */
    @JsonProperty("HasseiJotaiTaishoHoshin")
    public HasseiJotaiTaishoHoshinDiv getHasseiJotaiTaishoHoshin() {
        return HasseiJotaiTaishoHoshin;
    }

    /*
     * setHasseiJotaiTaishoHoshin
     * @param HasseiJotaiTaishoHoshin HasseiJotaiTaishoHoshin
     */
    @JsonProperty("HasseiJotaiTaishoHoshin")
    public void setHasseiJotaiTaishoHoshin(HasseiJotaiTaishoHoshinDiv HasseiJotaiTaishoHoshin) {
        this.HasseiJotaiTaishoHoshin = HasseiJotaiTaishoHoshin;
    }

    /*
     * getSeikatsuKinoMitoshi
     * @return SeikatsuKinoMitoshi
     */
    @JsonProperty("SeikatsuKinoMitoshi")
    public SeikatsuKinoMitoshiDiv getSeikatsuKinoMitoshi() {
        return SeikatsuKinoMitoshi;
    }

    /*
     * setSeikatsuKinoMitoshi
     * @param SeikatsuKinoMitoshi SeikatsuKinoMitoshi
     */
    @JsonProperty("SeikatsuKinoMitoshi")
    public void setSeikatsuKinoMitoshi(SeikatsuKinoMitoshiDiv SeikatsuKinoMitoshi) {
        this.SeikatsuKinoMitoshi = SeikatsuKinoMitoshi;
    }

    /*
     * getIgakutekiKanriHitsuyosei
     * @return IgakutekiKanriHitsuyosei
     */
    @JsonProperty("IgakutekiKanriHitsuyosei")
    public IgakutekiKanriHitsuyoseiDiv getIgakutekiKanriHitsuyosei() {
        return IgakutekiKanriHitsuyosei;
    }

    /*
     * setIgakutekiKanriHitsuyosei
     * @param IgakutekiKanriHitsuyosei IgakutekiKanriHitsuyosei
     */
    @JsonProperty("IgakutekiKanriHitsuyosei")
    public void setIgakutekiKanriHitsuyosei(IgakutekiKanriHitsuyoseiDiv IgakutekiKanriHitsuyosei) {
        this.IgakutekiKanriHitsuyosei = IgakutekiKanriHitsuyosei;
    }

    /*
     * getIgakutekiKantenRyuiten
     * @return IgakutekiKantenRyuiten
     */
    @JsonProperty("IgakutekiKantenRyuiten")
    public IgakutekiKantenRyuitenDiv getIgakutekiKantenRyuiten() {
        return IgakutekiKantenRyuiten;
    }

    /*
     * setIgakutekiKantenRyuiten
     * @param IgakutekiKantenRyuiten IgakutekiKantenRyuiten
     */
    @JsonProperty("IgakutekiKantenRyuiten")
    public void setIgakutekiKantenRyuiten(IgakutekiKantenRyuitenDiv IgakutekiKantenRyuiten) {
        this.IgakutekiKantenRyuiten = IgakutekiKantenRyuiten;
    }

    /*
     * getKansenshoUmu
     * @return KansenshoUmu
     */
    @JsonProperty("KansenshoUmu")
    public KansenshoUmuDiv getKansenshoUmu() {
        return KansenshoUmu;
    }

    /*
     * setKansenshoUmu
     * @param KansenshoUmu KansenshoUmu
     */
    @JsonProperty("KansenshoUmu")
    public void setKansenshoUmu(KansenshoUmuDiv KansenshoUmu) {
        this.KansenshoUmu = KansenshoUmu;
    }

    /*
     * getbtnKakutei
     * @return btnKakutei
     */
    @JsonProperty("btnKakutei")
    public Button getBtnKakutei() {
        return btnKakutei;
    }

    /*
     * setbtnKakutei
     * @param btnKakutei btnKakutei
     */
    @JsonProperty("btnKakutei")
    public void setBtnKakutei(Button btnKakutei) {
        this.btnKakutei = btnKakutei;
    }

    /*
     * getbtnCancel
     * @return btnCancel
     */
    @JsonProperty("btnCancel")
    public Button getBtnCancel() {
        return btnCancel;
    }

    /*
     * setbtnCancel
     * @param btnCancel btnCancel
     */
    @JsonProperty("btnCancel")
    public void setBtnCancel(Button btnCancel) {
        this.btnCancel = btnCancel;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public RadioButton getRadOkugaiHokou() {
        return this.getIdo().getRadOkugaiHokou();
    }

    @JsonIgnore
    public void  setRadOkugaiHokou(RadioButton radOkugaiHokou) {
        this.getIdo().setRadOkugaiHokou(radOkugaiHokou);
    }

    @JsonIgnore
    public RadioButton getRadKurumaisuShiyo() {
        return this.getIdo().getRadKurumaisuShiyo();
    }

    @JsonIgnore
    public void  setRadKurumaisuShiyo(RadioButton radKurumaisuShiyo) {
        this.getIdo().setRadKurumaisuShiyo(radKurumaisuShiyo);
    }

    @JsonIgnore
    public CheckBoxList getChkHokohojoShiyo() {
        return this.getIdo().getChkHokohojoShiyo();
    }

    @JsonIgnore
    public void  setChkHokohojoShiyo(CheckBoxList chkHokohojoShiyo) {
        this.getIdo().setChkHokohojoShiyo(chkHokohojoShiyo);
    }

    @JsonIgnore
    public RadioButton getRadShokujiKoi() {
        return this.getEiyoShokuseikatsu().getRadShokujiKoi();
    }

    @JsonIgnore
    public void  setRadShokujiKoi(RadioButton radShokujiKoi) {
        this.getEiyoShokuseikatsu().setRadShokujiKoi(radShokujiKoi);
    }

    @JsonIgnore
    public RadioButton getRadGenzaiEiyoJotai() {
        return this.getEiyoShokuseikatsu().getRadGenzaiEiyoJotai();
    }

    @JsonIgnore
    public void  setRadGenzaiEiyoJotai(RadioButton radGenzaiEiyoJotai) {
        this.getEiyoShokuseikatsu().setRadGenzaiEiyoJotai(radGenzaiEiyoJotai);
    }

    @JsonIgnore
    public TextBox getTxtEiyoShokuseikatsuRyuiten() {
        return this.getEiyoShokuseikatsu().getTxtEiyoShokuseikatsuRyuiten();
    }

    @JsonIgnore
    public void  setTxtEiyoShokuseikatsuRyuiten(TextBox txtEiyoShokuseikatsuRyuiten) {
        this.getEiyoShokuseikatsu().setTxtEiyoShokuseikatsuRyuiten(txtEiyoShokuseikatsuRyuiten);
    }

    @JsonIgnore
    public CheckBoxList getChkHasseiShojo() {
        return this.getHasseiJotaiTaishoHoshin().getChkHasseiShojo();
    }

    @JsonIgnore
    public void  setChkHasseiShojo(CheckBoxList chkHasseiShojo) {
        this.getHasseiJotaiTaishoHoshin().setChkHasseiShojo(chkHasseiShojo);
    }

    @JsonIgnore
    public CheckBoxList getChkJotaiSonota() {
        return this.getHasseiJotaiTaishoHoshin().getChkJotaiSonota();
    }

    @JsonIgnore
    public void  setChkJotaiSonota(CheckBoxList chkJotaiSonota) {
        this.getHasseiJotaiTaishoHoshin().setChkJotaiSonota(chkJotaiSonota);
    }

    @JsonIgnore
    public TextBox getTxtSonotaJotaiShosai() {
        return this.getHasseiJotaiTaishoHoshin().getTxtSonotaJotaiShosai();
    }

    @JsonIgnore
    public void  setTxtSonotaJotaiShosai(TextBox txtSonotaJotaiShosai) {
        this.getHasseiJotaiTaishoHoshin().setTxtSonotaJotaiShosai(txtSonotaJotaiShosai);
    }

    @JsonIgnore
    public TextBox getTxtTaishoHoushin() {
        return this.getHasseiJotaiTaishoHoshin().getTxtTaishoHoushin();
    }

    @JsonIgnore
    public void  setTxtTaishoHoushin(TextBox txtTaishoHoushin) {
        this.getHasseiJotaiTaishoHoshin().setTxtTaishoHoushin(txtTaishoHoushin);
    }

    @JsonIgnore
    public RadioButton getRadSeikatsuKinoMitoshi() {
        return this.getSeikatsuKinoMitoshi().getRadSeikatsuKinoMitoshi();
    }

    @JsonIgnore
    public void  setRadSeikatsuKinoMitoshi(RadioButton radSeikatsuKinoMitoshi) {
        this.getSeikatsuKinoMitoshi().setRadSeikatsuKinoMitoshi(radSeikatsuKinoMitoshi);
    }

    @JsonIgnore
    public CheckBoxList getChkIgakutekiKanri() {
        return this.getIgakutekiKanriHitsuyosei().getChkIgakutekiKanri();
    }

    @JsonIgnore
    public void  setChkIgakutekiKanri(CheckBoxList chkIgakutekiKanri) {
        this.getIgakutekiKanriHitsuyosei().setChkIgakutekiKanri(chkIgakutekiKanri);
    }

    @JsonIgnore
    public CheckBoxList getChkSonotaIryoService() {
        return this.getIgakutekiKanriHitsuyosei().getChkSonotaIryoService();
    }

    @JsonIgnore
    public void  setChkSonotaIryoService(CheckBoxList chkSonotaIryoService) {
        this.getIgakutekiKanriHitsuyosei().setChkSonotaIryoService(chkSonotaIryoService);
    }

    @JsonIgnore
    public TextBox getTxtShonotaIryoServiceShosai() {
        return this.getIgakutekiKanriHitsuyosei().getTxtShonotaIryoServiceShosai();
    }

    @JsonIgnore
    public void  setTxtShonotaIryoServiceShosai(TextBox txtShonotaIryoServiceShosai) {
        this.getIgakutekiKanriHitsuyosei().setTxtShonotaIryoServiceShosai(txtShonotaIryoServiceShosai);
    }

    @JsonIgnore
    public CheckBoxList getChkSonotaIryoServiceHitsuyoSei() {
        return this.getIgakutekiKanriHitsuyosei().getChkSonotaIryoServiceHitsuyoSei();
    }

    @JsonIgnore
    public void  setChkSonotaIryoServiceHitsuyoSei(CheckBoxList chkSonotaIryoServiceHitsuyoSei) {
        this.getIgakutekiKanriHitsuyosei().setChkSonotaIryoServiceHitsuyoSei(chkSonotaIryoServiceHitsuyoSei);
    }

    @JsonIgnore
    public RadioButton getRadKetsuatsu() {
        return this.getIgakutekiKantenRyuiten().getRadKetsuatsu();
    }

    @JsonIgnore
    public void  setRadKetsuatsu(RadioButton radKetsuatsu) {
        this.getIgakutekiKantenRyuiten().setRadKetsuatsu(radKetsuatsu);
    }

    @JsonIgnore
    public TextBox getTxtKetsuatsu() {
        return this.getIgakutekiKantenRyuiten().getTxtKetsuatsu();
    }

    @JsonIgnore
    public void  setTxtKetsuatsu(TextBox txtKetsuatsu) {
        this.getIgakutekiKantenRyuiten().setTxtKetsuatsu(txtKetsuatsu);
    }

    @JsonIgnore
    public RadioButton getRadIdo() {
        return this.getIgakutekiKantenRyuiten().getRadIdo();
    }

    @JsonIgnore
    public void  setRadIdo(RadioButton radIdo) {
        this.getIgakutekiKantenRyuiten().setRadIdo(radIdo);
    }

    @JsonIgnore
    public TextBox getTxtIdo() {
        return this.getIgakutekiKantenRyuiten().getTxtIdo();
    }

    @JsonIgnore
    public void  setTxtIdo(TextBox txtIdo) {
        this.getIgakutekiKantenRyuiten().setTxtIdo(txtIdo);
    }

    @JsonIgnore
    public RadioButton getRadSesshoku() {
        return this.getIgakutekiKantenRyuiten().getRadSesshoku();
    }

    @JsonIgnore
    public void  setRadSesshoku(RadioButton radSesshoku) {
        this.getIgakutekiKantenRyuiten().setRadSesshoku(radSesshoku);
    }

    @JsonIgnore
    public TextBox getTxtSesshoku() {
        return this.getIgakutekiKantenRyuiten().getTxtSesshoku();
    }

    @JsonIgnore
    public void  setTxtSesshoku(TextBox txtSesshoku) {
        this.getIgakutekiKantenRyuiten().setTxtSesshoku(txtSesshoku);
    }

    @JsonIgnore
    public RadioButton getRadUndo() {
        return this.getIgakutekiKantenRyuiten().getRadUndo();
    }

    @JsonIgnore
    public void  setRadUndo(RadioButton radUndo) {
        this.getIgakutekiKantenRyuiten().setRadUndo(radUndo);
    }

    @JsonIgnore
    public TextBox getTxtUndo() {
        return this.getIgakutekiKantenRyuiten().getTxtUndo();
    }

    @JsonIgnore
    public void  setTxtUndo(TextBox txtUndo) {
        this.getIgakutekiKantenRyuiten().setTxtUndo(txtUndo);
    }

    @JsonIgnore
    public RadioButton getRadEnka() {
        return this.getIgakutekiKantenRyuiten().getRadEnka();
    }

    @JsonIgnore
    public void  setRadEnka(RadioButton radEnka) {
        this.getIgakutekiKantenRyuiten().setRadEnka(radEnka);
    }

    @JsonIgnore
    public TextBox getTxtEnka() {
        return this.getIgakutekiKantenRyuiten().getTxtEnka();
    }

    @JsonIgnore
    public void  setTxtEnka(TextBox txtEnka) {
        this.getIgakutekiKantenRyuiten().setTxtEnka(txtEnka);
    }

    @JsonIgnore
    public TextBox getTxtSonotaRyuiJiko() {
        return this.getIgakutekiKantenRyuiten().getTxtSonotaRyuiJiko();
    }

    @JsonIgnore
    public void  setTxtSonotaRyuiJiko(TextBox txtSonotaRyuiJiko) {
        this.getIgakutekiKantenRyuiten().setTxtSonotaRyuiJiko(txtSonotaRyuiJiko);
    }

    @JsonIgnore
    public RadioButton getRadKansenshoUmu() {
        return this.getKansenshoUmu().getRadKansenshoUmu();
    }

    @JsonIgnore
    public void  setRadKansenshoUmu(RadioButton radKansenshoUmu) {
        this.getKansenshoUmu().setRadKansenshoUmu(radKansenshoUmu);
    }

    @JsonIgnore
    public Space getSpSpace1() {
        return this.getKansenshoUmu().getSpSpace1();
    }

    @JsonIgnore
    public void  setSpSpace1(Space spSpace1) {
        this.getKansenshoUmu().setSpSpace1(spSpace1);
    }

    @JsonIgnore
    public TextBox getTxtKansenshoShosai() {
        return this.getKansenshoUmu().getTxtKansenshoShosai();
    }

    @JsonIgnore
    public void  setTxtKansenshoShosai(TextBox txtKansenshoShosai) {
        this.getKansenshoUmu().setTxtKansenshoShosai(txtKansenshoShosai);
    }

    // </editor-fold>
    //--------------- この行より下にコードを追加してください -------------------

}
