package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE2200001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KaigoKanryoMessage.KaigoKanryoMessage.IKaigoKanryoMessageDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KaigoKanryoMessage.KaigoKanryoMessage.KaigoKanryoMessageDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.hokenshalist.HokenshaList.HokenshaListDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.hokenshalist.HokenshaList.IHokenshaListDiv;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * NinteiChosaIrai のクラスファイル 
 * 
 * @author 自動生成
 */
public class NinteiChosaIraiDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2017-01-10_09-26-16">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("ChoisaItakusakiKensaku")
    private ChoisaItakusakiKensakuDiv ChoisaItakusakiKensaku;
    @JsonProperty("ChoisaItakusakiIchiran")
    private ChoisaItakusakiIchiranDiv ChoisaItakusakiIchiran;
    @JsonProperty("ChosaItakusakiAndChosainKihonJoho")
    private ChosaItakusakiAndChosainKihonJohoDiv ChosaItakusakiAndChosainKihonJoho;
    @JsonProperty("ChosainIchiran")
    private ChosainIchiranDiv ChosainIchiran;
    @JsonProperty("ChosaTaishoWaritsuke")
    private ChosaTaishoWaritsukeDiv ChosaTaishoWaritsuke;
    @JsonProperty("KanryoMessage")
    private KaigoKanryoMessageDiv KanryoMessage;
    @JsonProperty("shinseishaKanriNo")
    private RString shinseishaKanriNo;
    @JsonProperty("hiddenIuputModel")
    private RString hiddenIuputModel;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getChoisaItakusakiKensaku
     * @return ChoisaItakusakiKensaku
     */
    @JsonProperty("ChoisaItakusakiKensaku")
    public ChoisaItakusakiKensakuDiv getChoisaItakusakiKensaku() {
        return ChoisaItakusakiKensaku;
    }

    /*
     * setChoisaItakusakiKensaku
     * @param ChoisaItakusakiKensaku ChoisaItakusakiKensaku
     */
    @JsonProperty("ChoisaItakusakiKensaku")
    public void setChoisaItakusakiKensaku(ChoisaItakusakiKensakuDiv ChoisaItakusakiKensaku) {
        this.ChoisaItakusakiKensaku = ChoisaItakusakiKensaku;
    }

    /*
     * getChoisaItakusakiIchiran
     * @return ChoisaItakusakiIchiran
     */
    @JsonProperty("ChoisaItakusakiIchiran")
    public ChoisaItakusakiIchiranDiv getChoisaItakusakiIchiran() {
        return ChoisaItakusakiIchiran;
    }

    /*
     * setChoisaItakusakiIchiran
     * @param ChoisaItakusakiIchiran ChoisaItakusakiIchiran
     */
    @JsonProperty("ChoisaItakusakiIchiran")
    public void setChoisaItakusakiIchiran(ChoisaItakusakiIchiranDiv ChoisaItakusakiIchiran) {
        this.ChoisaItakusakiIchiran = ChoisaItakusakiIchiran;
    }

    /*
     * getChosaItakusakiAndChosainKihonJoho
     * @return ChosaItakusakiAndChosainKihonJoho
     */
    @JsonProperty("ChosaItakusakiAndChosainKihonJoho")
    public ChosaItakusakiAndChosainKihonJohoDiv getChosaItakusakiAndChosainKihonJoho() {
        return ChosaItakusakiAndChosainKihonJoho;
    }

    /*
     * setChosaItakusakiAndChosainKihonJoho
     * @param ChosaItakusakiAndChosainKihonJoho ChosaItakusakiAndChosainKihonJoho
     */
    @JsonProperty("ChosaItakusakiAndChosainKihonJoho")
    public void setChosaItakusakiAndChosainKihonJoho(ChosaItakusakiAndChosainKihonJohoDiv ChosaItakusakiAndChosainKihonJoho) {
        this.ChosaItakusakiAndChosainKihonJoho = ChosaItakusakiAndChosainKihonJoho;
    }

    /*
     * getChosainIchiran
     * @return ChosainIchiran
     */
    @JsonProperty("ChosainIchiran")
    public ChosainIchiranDiv getChosainIchiran() {
        return ChosainIchiran;
    }

    /*
     * setChosainIchiran
     * @param ChosainIchiran ChosainIchiran
     */
    @JsonProperty("ChosainIchiran")
    public void setChosainIchiran(ChosainIchiranDiv ChosainIchiran) {
        this.ChosainIchiran = ChosainIchiran;
    }

    /*
     * getChosaTaishoWaritsuke
     * @return ChosaTaishoWaritsuke
     */
    @JsonProperty("ChosaTaishoWaritsuke")
    public ChosaTaishoWaritsukeDiv getChosaTaishoWaritsuke() {
        return ChosaTaishoWaritsuke;
    }

    /*
     * setChosaTaishoWaritsuke
     * @param ChosaTaishoWaritsuke ChosaTaishoWaritsuke
     */
    @JsonProperty("ChosaTaishoWaritsuke")
    public void setChosaTaishoWaritsuke(ChosaTaishoWaritsukeDiv ChosaTaishoWaritsuke) {
        this.ChosaTaishoWaritsuke = ChosaTaishoWaritsuke;
    }

    /*
     * getKanryoMessage
     * @return KanryoMessage
     */
    @JsonProperty("KanryoMessage")
    public IKaigoKanryoMessageDiv getKanryoMessage() {
        return KanryoMessage;
    }

    /*
     * getshinseishaKanriNo
     * @return shinseishaKanriNo
     */
    @JsonProperty("shinseishaKanriNo")
    public RString getShinseishaKanriNo() {
        return shinseishaKanriNo;
    }

    /*
     * setshinseishaKanriNo
     * @param shinseishaKanriNo shinseishaKanriNo
     */
    @JsonProperty("shinseishaKanriNo")
    public void setShinseishaKanriNo(RString shinseishaKanriNo) {
        this.shinseishaKanriNo = shinseishaKanriNo;
    }

    /*
     * gethiddenIuputModel
     * @return hiddenIuputModel
     */
    @JsonProperty("hiddenIuputModel")
    public RString getHiddenIuputModel() {
        return hiddenIuputModel;
    }

    /*
     * sethiddenIuputModel
     * @param hiddenIuputModel hiddenIuputModel
     */
    @JsonProperty("hiddenIuputModel")
    public void setHiddenIuputModel(RString hiddenIuputModel) {
        this.hiddenIuputModel = hiddenIuputModel;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public TextBoxCode getTxtChosaItakusaki() {
        return this.getChoisaItakusakiKensaku().getTxtChosaItakusaki();
    }

    @JsonIgnore
    public void  setTxtChosaItakusaki(TextBoxCode txtChosaItakusaki) {
        this.getChoisaItakusakiKensaku().setTxtChosaItakusaki(txtChosaItakusaki);
    }

    @JsonIgnore
    public TextBoxNum getTxtSaidaiHyojiKensu() {
        return this.getChoisaItakusakiKensaku().getTxtSaidaiHyojiKensu();
    }

    @JsonIgnore
    public void  setTxtSaidaiHyojiKensu(TextBoxNum txtSaidaiHyojiKensu) {
        this.getChoisaItakusakiKensaku().setTxtSaidaiHyojiKensu(txtSaidaiHyojiKensu);
    }

    @JsonIgnore
    public Button getBtnKensakuJokenClear() {
        return this.getChoisaItakusakiKensaku().getBtnKensakuJokenClear();
    }

    @JsonIgnore
    public void  setBtnKensakuJokenClear(Button btnKensakuJokenClear) {
        this.getChoisaItakusakiKensaku().setBtnKensakuJokenClear(btnKensakuJokenClear);
    }

    @JsonIgnore
    public Button getBtnSearch() {
        return this.getChoisaItakusakiKensaku().getBtnSearch();
    }

    @JsonIgnore
    public void  setBtnSearch(Button btnSearch) {
        this.getChoisaItakusakiKensaku().setBtnSearch(btnSearch);
    }

    @JsonIgnore
    public IHokenshaListDiv getCcdHokenshaList() {
        return this.getChoisaItakusakiKensaku().getCcdHokenshaList();
    }

    @JsonIgnore
    public DataGrid<dgChosaItakusakiIchiran_Row> getDgChosaItakusakiIchiran() {
        return this.getChoisaItakusakiIchiran().getDgChosaItakusakiIchiran();
    }

    @JsonIgnore
    public void  setDgChosaItakusakiIchiran(DataGrid<dgChosaItakusakiIchiran_Row> dgChosaItakusakiIchiran) {
        this.getChoisaItakusakiIchiran().setDgChosaItakusakiIchiran(dgChosaItakusakiIchiran);
    }

    @JsonIgnore
    public TextBoxCode getTxtChosaItakusakiCode() {
        return this.getChosaItakusakiAndChosainKihonJoho().getTxtChosaItakusakiCode();
    }

    @JsonIgnore
    public void  setTxtChosaItakusakiCode(TextBoxCode txtChosaItakusakiCode) {
        this.getChosaItakusakiAndChosainKihonJoho().setTxtChosaItakusakiCode(txtChosaItakusakiCode);
    }

    @JsonIgnore
    public TextBox getTxtChosaItakusakiMeisho() {
        return this.getChosaItakusakiAndChosainKihonJoho().getTxtChosaItakusakiMeisho();
    }

    @JsonIgnore
    public void  setTxtChosaItakusakiMeisho(TextBox txtChosaItakusakiMeisho) {
        this.getChosaItakusakiAndChosainKihonJoho().setTxtChosaItakusakiMeisho(txtChosaItakusakiMeisho);
    }

    @JsonIgnore
    public TextBox getTxtChosaItakusakiChiku() {
        return this.getChosaItakusakiAndChosainKihonJoho().getTxtChosaItakusakiChiku();
    }

    @JsonIgnore
    public void  setTxtChosaItakusakiChiku(TextBox txtChosaItakusakiChiku) {
        this.getChosaItakusakiAndChosainKihonJoho().setTxtChosaItakusakiChiku(txtChosaItakusakiChiku);
    }

    @JsonIgnore
    public TextBoxCode getTxtChosainCode() {
        return this.getChosaItakusakiAndChosainKihonJoho().getTxtChosainCode();
    }

    @JsonIgnore
    public void  setTxtChosainCode(TextBoxCode txtChosainCode) {
        this.getChosaItakusakiAndChosainKihonJoho().setTxtChosainCode(txtChosainCode);
    }

    @JsonIgnore
    public TextBox getTxtChosainShimei() {
        return this.getChosaItakusakiAndChosainKihonJoho().getTxtChosainShimei();
    }

    @JsonIgnore
    public void  setTxtChosainShimei(TextBox txtChosainShimei) {
        this.getChosaItakusakiAndChosainKihonJoho().setTxtChosainShimei(txtChosainShimei);
    }

    @JsonIgnore
    public TextBox getTxtChosainChiku() {
        return this.getChosaItakusakiAndChosainKihonJoho().getTxtChosainChiku();
    }

    @JsonIgnore
    public void  setTxtChosainChiku(TextBox txtChosainChiku) {
        this.getChosaItakusakiAndChosainKihonJoho().setTxtChosainChiku(txtChosainChiku);
    }

    @JsonIgnore
    public DataGrid<dgchosainIchiran_Row> getDgchosainIchiran() {
        return this.getChosainIchiran().getDgchosainIchiran();
    }

    @JsonIgnore
    public void  setDgchosainIchiran(DataGrid<dgchosainIchiran_Row> dgchosainIchiran) {
        this.getChosainIchiran().setDgchosainIchiran(dgchosainIchiran);
    }

    @JsonIgnore
    public WaritsukeZumiTaishoshaDiv getWaritsukeZumiTaishosha() {
        return this.getChosaTaishoWaritsuke().getWaritsukeZumiTaishosha();
    }

    @JsonIgnore
    public void  setWaritsukeZumiTaishosha(WaritsukeZumiTaishoshaDiv WaritsukeZumiTaishosha) {
        this.getChosaTaishoWaritsuke().setWaritsukeZumiTaishosha(WaritsukeZumiTaishosha);
    }

    @JsonIgnore
    public DataGrid<dgWaritsukeZumiShinseishaIchiran_Row> getDgWaritsukeZumiShinseishaIchiran() {
        return this.getChosaTaishoWaritsuke().getWaritsukeZumiTaishosha().getDgWaritsukeZumiShinseishaIchiran();
    }

    @JsonIgnore
    public void  setDgWaritsukeZumiShinseishaIchiran(DataGrid<dgWaritsukeZumiShinseishaIchiran_Row> dgWaritsukeZumiShinseishaIchiran) {
        this.getChosaTaishoWaritsuke().getWaritsukeZumiTaishosha().setDgWaritsukeZumiShinseishaIchiran(dgWaritsukeZumiShinseishaIchiran);
    }

    @JsonIgnore
    public ButtonDialog getBtnIraishotoPrint() {
        return this.getChosaTaishoWaritsuke().getBtnIraishotoPrint();
    }

    @JsonIgnore
    public void  setBtnIraishotoPrint(ButtonDialog btnIraishotoPrint) {
        this.getChosaTaishoWaritsuke().setBtnIraishotoPrint(btnIraishotoPrint);
    }

    @JsonIgnore
    public ShinseishaWaritsukeKaijoDiv getShinseishaWaritsukeKaijo() {
        return this.getChosaTaishoWaritsuke().getShinseishaWaritsukeKaijo();
    }

    @JsonIgnore
    public void  setShinseishaWaritsukeKaijo(ShinseishaWaritsukeKaijoDiv ShinseishaWaritsukeKaijo) {
        this.getChosaTaishoWaritsuke().setShinseishaWaritsukeKaijo(ShinseishaWaritsukeKaijo);
    }

    @JsonIgnore
    public TextBoxDate getTxtChosaIraiDay() {
        return this.getChosaTaishoWaritsuke().getShinseishaWaritsukeKaijo().getTxtChosaIraiDay();
    }

    @JsonIgnore
    public void  setTxtChosaIraiDay(TextBoxDate txtChosaIraiDay) {
        this.getChosaTaishoWaritsuke().getShinseishaWaritsukeKaijo().setTxtChosaIraiDay(txtChosaIraiDay);
    }

    @JsonIgnore
    public Button getBtnWaritsuke() {
        return this.getChosaTaishoWaritsuke().getShinseishaWaritsukeKaijo().getBtnWaritsuke();
    }

    @JsonIgnore
    public void  setBtnWaritsuke(Button btnWaritsuke) {
        this.getChosaTaishoWaritsuke().getShinseishaWaritsukeKaijo().setBtnWaritsuke(btnWaritsuke);
    }

    @JsonIgnore
    public Button getBtnKaijo() {
        return this.getChosaTaishoWaritsuke().getShinseishaWaritsukeKaijo().getBtnKaijo();
    }

    @JsonIgnore
    public void  setBtnKaijo(Button btnKaijo) {
        this.getChosaTaishoWaritsuke().getShinseishaWaritsukeKaijo().setBtnKaijo(btnKaijo);
    }

    @JsonIgnore
    public MiwaritsukeShinseishaDiv getMiwaritsukeShinseisha() {
        return this.getChosaTaishoWaritsuke().getMiwaritsukeShinseisha();
    }

    @JsonIgnore
    public void  setMiwaritsukeShinseisha(MiwaritsukeShinseishaDiv MiwaritsukeShinseisha) {
        this.getChosaTaishoWaritsuke().setMiwaritsukeShinseisha(MiwaritsukeShinseisha);
    }

    @JsonIgnore
    public DataGrid<dgMiwaritsukeShinseishaIchiran_Row> getDgMiwaritsukeShinseishaIchiran() {
        return this.getChosaTaishoWaritsuke().getMiwaritsukeShinseisha().getDgMiwaritsukeShinseishaIchiran();
    }

    @JsonIgnore
    public void  setDgMiwaritsukeShinseishaIchiran(DataGrid<dgMiwaritsukeShinseishaIchiran_Row> dgMiwaritsukeShinseishaIchiran) {
        this.getChosaTaishoWaritsuke().getMiwaritsukeShinseisha().setDgMiwaritsukeShinseishaIchiran(dgMiwaritsukeShinseishaIchiran);
    }

    // </editor-fold>
}
