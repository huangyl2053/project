package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE2210001;
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
 * tplGaikyoChosa のクラスファイル 
 * 
 * @author 自動生成
 */
public class tplGaikyoChosaDiv extends TabPanel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2017-02-23_13-41-30">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("radGenzaiservis")
    private RadioButton radGenzaiservis;
    @JsonProperty("tabChosaBasho")
    private tabChosaBashoDiv tabChosaBasho;
    @JsonProperty("GaikyoTokkiInput")
    private GaikyoTokkiInputDiv GaikyoTokkiInput;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getradGenzaiservis
     * @return radGenzaiservis
     */
    @JsonProperty("radGenzaiservis")
    public RadioButton getRadGenzaiservis() {
        return radGenzaiservis;
    }

    /*
     * setradGenzaiservis
     * @param radGenzaiservis radGenzaiservis
     */
    @JsonProperty("radGenzaiservis")
    public void setRadGenzaiservis(RadioButton radGenzaiservis) {
        this.radGenzaiservis = radGenzaiservis;
    }

    /*
     * gettabChosaBasho
     * @return tabChosaBasho
     */
    @JsonProperty("tabChosaBasho")
    public tabChosaBashoDiv getTabChosaBasho() {
        return tabChosaBasho;
    }

    /*
     * settabChosaBasho
     * @param tabChosaBasho tabChosaBasho
     */
    @JsonProperty("tabChosaBasho")
    public void setTabChosaBasho(tabChosaBashoDiv tabChosaBasho) {
        this.tabChosaBasho = tabChosaBasho;
    }

    /*
     * getGaikyoTokkiInput
     * @return GaikyoTokkiInput
     */
    @JsonProperty("GaikyoTokkiInput")
    public GaikyoTokkiInputDiv getGaikyoTokkiInput() {
        return GaikyoTokkiInput;
    }

    /*
     * setGaikyoTokkiInput
     * @param GaikyoTokkiInput GaikyoTokkiInput
     */
    @JsonProperty("GaikyoTokkiInput")
    public void setGaikyoTokkiInput(GaikyoTokkiInputDiv GaikyoTokkiInput) {
        this.GaikyoTokkiInput = GaikyoTokkiInput;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public tplZaitakuDiv getTplZaitaku() {
        return this.getTabChosaBasho().getTplZaitaku();
    }

    @JsonIgnore
    public void  setTplZaitaku(tplZaitakuDiv tplZaitaku) {
        this.getTabChosaBasho().setTplZaitaku(tplZaitaku);
    }

    @JsonIgnore
    public RadioButton getRadJutakuKaishu() {
        return this.getTabChosaBasho().getTplZaitaku().getRadJutakuKaishu();
    }

    @JsonIgnore
    public void  setRadJutakuKaishu(RadioButton radJutakuKaishu) {
        this.getTabChosaBasho().getTplZaitaku().setRadJutakuKaishu(radJutakuKaishu);
    }

    @JsonIgnore
    public JutakuGaikyoChosaDiv getJutakuGaikyoChosa() {
        return this.getTabChosaBasho().getTplZaitaku().getJutakuGaikyoChosa();
    }

    @JsonIgnore
    public void  setJutakuGaikyoChosa(JutakuGaikyoChosaDiv JutakuGaikyoChosa) {
        this.getTabChosaBasho().getTplZaitaku().setJutakuGaikyoChosa(JutakuGaikyoChosa);
    }

    @JsonIgnore
    public DataGrid<dgRiyoServiceJyokyo_Row> getDgRiyoServiceJyokyo() {
        return this.getTabChosaBasho().getTplZaitaku().getJutakuGaikyoChosa().getDgRiyoServiceJyokyo();
    }

    @JsonIgnore
    public void  setDgRiyoServiceJyokyo(DataGrid<dgRiyoServiceJyokyo_Row> dgRiyoServiceJyokyo) {
        this.getTabChosaBasho().getTplZaitaku().getJutakuGaikyoChosa().setDgRiyoServiceJyokyo(dgRiyoServiceJyokyo);
    }

    @JsonIgnore
    public ShichosonTokubetsuKyufuDiv getShichosonTokubetsuKyufu() {
        return this.getTabChosaBasho().getTplZaitaku().getShichosonTokubetsuKyufu();
    }

    @JsonIgnore
    public void  setShichosonTokubetsuKyufu(ShichosonTokubetsuKyufuDiv ShichosonTokubetsuKyufu) {
        this.getTabChosaBasho().getTplZaitaku().setShichosonTokubetsuKyufu(ShichosonTokubetsuKyufu);
    }

    @JsonIgnore
    public Label getLblShichosonTokubetsuKyufu() {
        return this.getTabChosaBasho().getTplZaitaku().getShichosonTokubetsuKyufu().getLblShichosonTokubetsuKyufu();
    }

    @JsonIgnore
    public void  setLblShichosonTokubetsuKyufu(Label lblShichosonTokubetsuKyufu) {
        this.getTabChosaBasho().getTplZaitaku().getShichosonTokubetsuKyufu().setLblShichosonTokubetsuKyufu(lblShichosonTokubetsuKyufu);
    }

    @JsonIgnore
    public DynamicImage getImgShichosonTokubetsuKyufu() {
        return this.getTabChosaBasho().getTplZaitaku().getShichosonTokubetsuKyufu().getImgShichosonTokubetsuKyufu();
    }

    @JsonIgnore
    public void  setImgShichosonTokubetsuKyufu(DynamicImage imgShichosonTokubetsuKyufu) {
        this.getTabChosaBasho().getTplZaitaku().getShichosonTokubetsuKyufu().setImgShichosonTokubetsuKyufu(imgShichosonTokubetsuKyufu);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtShichosonTokubetsuKyufu() {
        return this.getTabChosaBasho().getTplZaitaku().getTxtShichosonTokubetsuKyufu();
    }

    @JsonIgnore
    public void  setTxtShichosonTokubetsuKyufu(TextBoxMultiLine txtShichosonTokubetsuKyufu) {
        this.getTabChosaBasho().getTplZaitaku().setTxtShichosonTokubetsuKyufu(txtShichosonTokubetsuKyufu);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtKyufuIgaiJutakuService() {
        return this.getTabChosaBasho().getTplZaitaku().getTxtKyufuIgaiJutakuService();
    }

    @JsonIgnore
    public void  setTxtKyufuIgaiJutakuService(TextBoxMultiLine txtKyufuIgaiJutakuService) {
        this.getTabChosaBasho().getTplZaitaku().setTxtKyufuIgaiJutakuService(txtKyufuIgaiJutakuService);
    }

    @JsonIgnore
    public ZaitakuServiceDiv getZaitakuService() {
        return this.getTabChosaBasho().getTplZaitaku().getZaitakuService();
    }

    @JsonIgnore
    public void  setZaitakuService(ZaitakuServiceDiv ZaitakuService) {
        this.getTabChosaBasho().getTplZaitaku().setZaitakuService(ZaitakuService);
    }

    @JsonIgnore
    public Label getLblZaitakuService() {
        return this.getTabChosaBasho().getTplZaitaku().getZaitakuService().getLblZaitakuService();
    }

    @JsonIgnore
    public void  setLblZaitakuService(Label lblZaitakuService) {
        this.getTabChosaBasho().getTplZaitaku().getZaitakuService().setLblZaitakuService(lblZaitakuService);
    }

    @JsonIgnore
    public DynamicImage getImgZaitakuService() {
        return this.getTabChosaBasho().getTplZaitaku().getZaitakuService().getImgZaitakuService();
    }

    @JsonIgnore
    public void  setImgZaitakuService(DynamicImage imgZaitakuService) {
        this.getTabChosaBasho().getTplZaitaku().getZaitakuService().setImgZaitakuService(imgZaitakuService);
    }

    @JsonIgnore
    public tplShisetsuDiv getTplShisetsu() {
        return this.getTabChosaBasho().getTplShisetsu();
    }

    @JsonIgnore
    public void  setTplShisetsu(tplShisetsuDiv tplShisetsu) {
        this.getTabChosaBasho().setTplShisetsu(tplShisetsu);
    }

    @JsonIgnore
    public GaikyoTokkiShisetsuDiv getGaikyoTokkiShisetsu() {
        return this.getTabChosaBasho().getTplShisetsu().getGaikyoTokkiShisetsu();
    }

    @JsonIgnore
    public void  setGaikyoTokkiShisetsu(GaikyoTokkiShisetsuDiv GaikyoTokkiShisetsu) {
        this.getTabChosaBasho().getTplShisetsu().setGaikyoTokkiShisetsu(GaikyoTokkiShisetsu);
    }

    @JsonIgnore
    public DataGrid<dgRiyoShisetsu_Row> getDgRiyoShisetsu() {
        return this.getTabChosaBasho().getTplShisetsu().getGaikyoTokkiShisetsu().getDgRiyoShisetsu();
    }

    @JsonIgnore
    public void  setDgRiyoShisetsu(DataGrid<dgRiyoShisetsu_Row> dgRiyoShisetsu) {
        this.getTabChosaBasho().getTplShisetsu().getGaikyoTokkiShisetsu().setDgRiyoShisetsu(dgRiyoShisetsu);
    }

    @JsonIgnore
    public GaigyoShisetsuRenrakusakiDiv getGaigyoShisetsuRenrakusaki() {
        return this.getTabChosaBasho().getTplShisetsu().getGaigyoShisetsuRenrakusaki();
    }

    @JsonIgnore
    public void  setGaigyoShisetsuRenrakusaki(GaigyoShisetsuRenrakusakiDiv GaigyoShisetsuRenrakusaki) {
        this.getTabChosaBasho().getTplShisetsu().setGaigyoShisetsuRenrakusaki(GaigyoShisetsuRenrakusaki);
    }

    @JsonIgnore
    public TextBox getTxtShisetsuMeisdho() {
        return this.getTabChosaBasho().getTplShisetsu().getGaigyoShisetsuRenrakusaki().getTxtShisetsuMeisdho();
    }

    @JsonIgnore
    public void  setTxtShisetsuMeisdho(TextBox txtShisetsuMeisdho) {
        this.getTabChosaBasho().getTplShisetsu().getGaigyoShisetsuRenrakusaki().setTxtShisetsuMeisdho(txtShisetsuMeisdho);
    }

    @JsonIgnore
    public TextBoxYubinNo getTxtShisetsuYubinNo() {
        return this.getTabChosaBasho().getTplShisetsu().getGaigyoShisetsuRenrakusaki().getTxtShisetsuYubinNo();
    }

    @JsonIgnore
    public void  setTxtShisetsuYubinNo(TextBoxYubinNo txtShisetsuYubinNo) {
        this.getTabChosaBasho().getTplShisetsu().getGaigyoShisetsuRenrakusaki().setTxtShisetsuYubinNo(txtShisetsuYubinNo);
    }

    @JsonIgnore
    public TextBoxJusho getTxtShisetsuJusho() {
        return this.getTabChosaBasho().getTplShisetsu().getGaigyoShisetsuRenrakusaki().getTxtShisetsuJusho();
    }

    @JsonIgnore
    public void  setTxtShisetsuJusho(TextBoxJusho txtShisetsuJusho) {
        this.getTabChosaBasho().getTplShisetsu().getGaigyoShisetsuRenrakusaki().setTxtShisetsuJusho(txtShisetsuJusho);
    }

    @JsonIgnore
    public TextBoxTelNo getTxtTelNo() {
        return this.getTabChosaBasho().getTplShisetsu().getGaigyoShisetsuRenrakusaki().getTxtTelNo();
    }

    @JsonIgnore
    public void  setTxtTelNo(TextBoxTelNo txtTelNo) {
        this.getTabChosaBasho().getTplShisetsu().getGaigyoShisetsuRenrakusaki().setTxtTelNo(txtTelNo);
    }

    @JsonIgnore
    public ImageGaigyoShisetsuRenrakusakiDiv getImageGaigyoShisetsuRenrakusaki() {
        return this.getTabChosaBasho().getTplShisetsu().getImageGaigyoShisetsuRenrakusaki();
    }

    @JsonIgnore
    public void  setImageGaigyoShisetsuRenrakusaki(ImageGaigyoShisetsuRenrakusakiDiv ImageGaigyoShisetsuRenrakusaki) {
        this.getTabChosaBasho().getTplShisetsu().setImageGaigyoShisetsuRenrakusaki(ImageGaigyoShisetsuRenrakusaki);
    }

    @JsonIgnore
    public Label getLblShisetsuMeisho() {
        return this.getTabChosaBasho().getTplShisetsu().getImageGaigyoShisetsuRenrakusaki().getLblShisetsuMeisho();
    }

    @JsonIgnore
    public void  setLblShisetsuMeisho(Label lblShisetsuMeisho) {
        this.getTabChosaBasho().getTplShisetsu().getImageGaigyoShisetsuRenrakusaki().setLblShisetsuMeisho(lblShisetsuMeisho);
    }

    @JsonIgnore
    public DynamicImage getImgShisetsuMeisho() {
        return this.getTabChosaBasho().getTplShisetsu().getImageGaigyoShisetsuRenrakusaki().getImgShisetsuMeisho();
    }

    @JsonIgnore
    public void  setImgShisetsuMeisho(DynamicImage imgShisetsuMeisho) {
        this.getTabChosaBasho().getTplShisetsu().getImageGaigyoShisetsuRenrakusaki().setImgShisetsuMeisho(imgShisetsuMeisho);
    }

    @JsonIgnore
    public Label getLblJusho() {
        return this.getTabChosaBasho().getTplShisetsu().getImageGaigyoShisetsuRenrakusaki().getLblJusho();
    }

    @JsonIgnore
    public void  setLblJusho(Label lblJusho) {
        this.getTabChosaBasho().getTplShisetsu().getImageGaigyoShisetsuRenrakusaki().setLblJusho(lblJusho);
    }

    @JsonIgnore
    public DynamicImage getImgJusho() {
        return this.getTabChosaBasho().getTplShisetsu().getImageGaigyoShisetsuRenrakusaki().getImgJusho();
    }

    @JsonIgnore
    public void  setImgJusho(DynamicImage imgJusho) {
        this.getTabChosaBasho().getTplShisetsu().getImageGaigyoShisetsuRenrakusaki().setImgJusho(imgJusho);
    }

    @JsonIgnore
    public Label getLbTel() {
        return this.getTabChosaBasho().getTplShisetsu().getImageGaigyoShisetsuRenrakusaki().getLbTel();
    }

    @JsonIgnore
    public void  setLbTel(Label lbTel) {
        this.getTabChosaBasho().getTplShisetsu().getImageGaigyoShisetsuRenrakusaki().setLbTel(lbTel);
    }

    @JsonIgnore
    public DynamicImage getImgTel() {
        return this.getTabChosaBasho().getTplShisetsu().getImageGaigyoShisetsuRenrakusaki().getImgTel();
    }

    @JsonIgnore
    public void  setImgTel(DynamicImage imgTel) {
        this.getTabChosaBasho().getTplShisetsu().getImageGaigyoShisetsuRenrakusaki().setImgTel(imgTel);
    }

    @JsonIgnore
    public Label getLblGaigyoTokkiComment() {
        return this.getGaikyoTokkiInput().getLblGaigyoTokkiComment();
    }

    @JsonIgnore
    public void  setLblGaigyoTokkiComment(Label lblGaigyoTokkiComment) {
        this.getGaikyoTokkiInput().setLblGaigyoTokkiComment(lblGaigyoTokkiComment);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtGaikyoTokkiNyuroku() {
        return this.getGaikyoTokkiInput().getTxtGaikyoTokkiNyuroku();
    }

    @JsonIgnore
    public void  setTxtGaikyoTokkiNyuroku(TextBoxMultiLine txtGaikyoTokkiNyuroku) {
        this.getGaikyoTokkiInput().setTxtGaikyoTokkiNyuroku(txtGaikyoTokkiNyuroku);
    }

    @JsonIgnore
    public TokkiDiv getTokki() {
        return this.getGaikyoTokkiInput().getTokki();
    }

    @JsonIgnore
    public void  setTokki(TokkiDiv Tokki) {
        this.getGaikyoTokkiInput().setTokki(Tokki);
    }

    @JsonIgnore
    public DynamicImage getImgTokkiJiko() {
        return this.getGaikyoTokkiInput().getTokki().getImgTokkiJiko();
    }

    @JsonIgnore
    public void  setImgTokkiJiko(DynamicImage imgTokkiJiko) {
        this.getGaikyoTokkiInput().getTokki().setImgTokkiJiko(imgTokkiJiko);
    }

    @JsonIgnore
    public ButtonDialog getBtnTeikeibun() {
        return this.getGaikyoTokkiInput().getBtnTeikeibun();
    }

    @JsonIgnore
    public void  setBtnTeikeibun(ButtonDialog btnTeikeibun) {
        this.getGaikyoTokkiInput().setBtnTeikeibun(btnTeikeibun);
    }

    // </editor-fold>
}
