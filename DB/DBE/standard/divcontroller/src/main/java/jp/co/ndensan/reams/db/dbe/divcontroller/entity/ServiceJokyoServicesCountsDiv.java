package jp.co.ndensan.reams.db.dbe.divcontroller.entity;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.ServiceWithCountCom;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * ServiceJokyoServicesCounts のクラスファイル 
 * 
 * @author 自動生成
 */
public class ServiceJokyoServicesCountsDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("comCountHomeHelp")
    private ServiceWithCountCom comCountHomeHelp;
    @JsonProperty("comCountTankiSeikatsuKaigo")
    private ServiceWithCountCom comCountTankiSeikatsuKaigo;
    @JsonProperty("comCountHomonBathing")
    private ServiceWithCountCom comCountHomonBathing;
    @JsonProperty("comCountTankiRyoyoKaigo")
    private ServiceWithCountCom comCountTankiRyoyoKaigo;
    @JsonProperty("comCountHomonKango")
    private ServiceWithCountCom comCountHomonKango;
    @JsonProperty("comCountHomonRehabilitation")
    private ServiceWithCountCom comCountHomonRehabilitation;
    @JsonProperty("comCountYakanHomonKaigo")
    private ServiceWithCountCom comCountYakanHomonKaigo;
    @JsonProperty("comCountTsushoRehabilitation")
    private ServiceWithCountCom comCountTsushoRehabilitation;
    @JsonProperty("comCountRyoyoKanriShido")
    private ServiceWithCountCom comCountRyoyoKanriShido;
    @JsonProperty("comCountDayService")
    private ServiceWithCountCom comCountDayService;
    @JsonProperty("comCountTokuteiSeikatsuKaigo")
    private ServiceWithCountCom comCountTokuteiSeikatsuKaigo;
    @JsonProperty("comCountNinchishoTsushoKaigo")
    private ServiceWithCountCom comCountNinchishoTsushoKaigo;
    @JsonProperty("comCountHukushiyoguTaiyo")
    private ServiceWithCountCom comCountHukushiyoguTaiyo;
    @JsonProperty("comCountNinchishoKyodoKaigo")
    private ServiceWithCountCom comCountNinchishoKyodoKaigo;
    @JsonProperty("comCountHukushiyoguHanbai")
    private ServiceWithCountCom comCountHukushiyoguHanbai;
    @JsonProperty("comCountSmallTakinoKaigo")
    private ServiceWithCountCom comCountSmallTakinoKaigo;
    @JsonProperty("lblJutakuKaishu")
    private Label lblJutakuKaishu;
    @JsonProperty("radJutakuKaishu")
    private RadioButton radJutakuKaishu;
    @JsonProperty("comCountChiikiTokuteiShisetsuKaigo")
    private ServiceWithCountCom comCountChiikiTokuteiShisetsuKaigo;
    @JsonProperty("comCountChiikiRojinHukushiShisetsuKaigo")
    private ServiceWithCountCom comCountChiikiRojinHukushiShisetsuKaigo;
    @JsonProperty("comCountTeikiJunkaiHomonKaigo")
    private ServiceWithCountCom comCountTeikiJunkaiHomonKaigo;
    @JsonProperty("lblNewLine2")
    private Label lblNewLine2;
    @JsonProperty("lblShichosonTokubetsuKyufu")
    private Label lblShichosonTokubetsuKyufu;
    @JsonProperty("txtShichosonTokubetsuKyufu")
    private TextBox txtShichosonTokubetsuKyufu;
    @JsonProperty("lblZaitakuSeriviceOutsideKaigoKyufu")
    private Label lblZaitakuSeriviceOutsideKaigoKyufu;
    @JsonProperty("txtZaitakuSeriviceOutsideKaigoKyufu")
    private TextBox txtZaitakuSeriviceOutsideKaigoKyufu;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("comCountHomeHelp")
    public ServiceWithCountCom getComCountHomeHelp() {
        return comCountHomeHelp;
    }

    @JsonProperty("comCountHomeHelp")
    public void setComCountHomeHelp(ServiceWithCountCom comCountHomeHelp) {
        this.comCountHomeHelp=comCountHomeHelp;
    }

    @JsonProperty("comCountTankiSeikatsuKaigo")
    public ServiceWithCountCom getComCountTankiSeikatsuKaigo() {
        return comCountTankiSeikatsuKaigo;
    }

    @JsonProperty("comCountTankiSeikatsuKaigo")
    public void setComCountTankiSeikatsuKaigo(ServiceWithCountCom comCountTankiSeikatsuKaigo) {
        this.comCountTankiSeikatsuKaigo=comCountTankiSeikatsuKaigo;
    }

    @JsonProperty("comCountHomonBathing")
    public ServiceWithCountCom getComCountHomonBathing() {
        return comCountHomonBathing;
    }

    @JsonProperty("comCountHomonBathing")
    public void setComCountHomonBathing(ServiceWithCountCom comCountHomonBathing) {
        this.comCountHomonBathing=comCountHomonBathing;
    }

    @JsonProperty("comCountTankiRyoyoKaigo")
    public ServiceWithCountCom getComCountTankiRyoyoKaigo() {
        return comCountTankiRyoyoKaigo;
    }

    @JsonProperty("comCountTankiRyoyoKaigo")
    public void setComCountTankiRyoyoKaigo(ServiceWithCountCom comCountTankiRyoyoKaigo) {
        this.comCountTankiRyoyoKaigo=comCountTankiRyoyoKaigo;
    }

    @JsonProperty("comCountHomonKango")
    public ServiceWithCountCom getComCountHomonKango() {
        return comCountHomonKango;
    }

    @JsonProperty("comCountHomonKango")
    public void setComCountHomonKango(ServiceWithCountCom comCountHomonKango) {
        this.comCountHomonKango=comCountHomonKango;
    }

    @JsonProperty("comCountHomonRehabilitation")
    public ServiceWithCountCom getComCountHomonRehabilitation() {
        return comCountHomonRehabilitation;
    }

    @JsonProperty("comCountHomonRehabilitation")
    public void setComCountHomonRehabilitation(ServiceWithCountCom comCountHomonRehabilitation) {
        this.comCountHomonRehabilitation=comCountHomonRehabilitation;
    }

    @JsonProperty("comCountYakanHomonKaigo")
    public ServiceWithCountCom getComCountYakanHomonKaigo() {
        return comCountYakanHomonKaigo;
    }

    @JsonProperty("comCountYakanHomonKaigo")
    public void setComCountYakanHomonKaigo(ServiceWithCountCom comCountYakanHomonKaigo) {
        this.comCountYakanHomonKaigo=comCountYakanHomonKaigo;
    }

    @JsonProperty("comCountTsushoRehabilitation")
    public ServiceWithCountCom getComCountTsushoRehabilitation() {
        return comCountTsushoRehabilitation;
    }

    @JsonProperty("comCountTsushoRehabilitation")
    public void setComCountTsushoRehabilitation(ServiceWithCountCom comCountTsushoRehabilitation) {
        this.comCountTsushoRehabilitation=comCountTsushoRehabilitation;
    }

    @JsonProperty("comCountRyoyoKanriShido")
    public ServiceWithCountCom getComCountRyoyoKanriShido() {
        return comCountRyoyoKanriShido;
    }

    @JsonProperty("comCountRyoyoKanriShido")
    public void setComCountRyoyoKanriShido(ServiceWithCountCom comCountRyoyoKanriShido) {
        this.comCountRyoyoKanriShido=comCountRyoyoKanriShido;
    }

    @JsonProperty("comCountDayService")
    public ServiceWithCountCom getComCountDayService() {
        return comCountDayService;
    }

    @JsonProperty("comCountDayService")
    public void setComCountDayService(ServiceWithCountCom comCountDayService) {
        this.comCountDayService=comCountDayService;
    }

    @JsonProperty("comCountTokuteiSeikatsuKaigo")
    public ServiceWithCountCom getComCountTokuteiSeikatsuKaigo() {
        return comCountTokuteiSeikatsuKaigo;
    }

    @JsonProperty("comCountTokuteiSeikatsuKaigo")
    public void setComCountTokuteiSeikatsuKaigo(ServiceWithCountCom comCountTokuteiSeikatsuKaigo) {
        this.comCountTokuteiSeikatsuKaigo=comCountTokuteiSeikatsuKaigo;
    }

    @JsonProperty("comCountNinchishoTsushoKaigo")
    public ServiceWithCountCom getComCountNinchishoTsushoKaigo() {
        return comCountNinchishoTsushoKaigo;
    }

    @JsonProperty("comCountNinchishoTsushoKaigo")
    public void setComCountNinchishoTsushoKaigo(ServiceWithCountCom comCountNinchishoTsushoKaigo) {
        this.comCountNinchishoTsushoKaigo=comCountNinchishoTsushoKaigo;
    }

    @JsonProperty("comCountHukushiyoguTaiyo")
    public ServiceWithCountCom getComCountHukushiyoguTaiyo() {
        return comCountHukushiyoguTaiyo;
    }

    @JsonProperty("comCountHukushiyoguTaiyo")
    public void setComCountHukushiyoguTaiyo(ServiceWithCountCom comCountHukushiyoguTaiyo) {
        this.comCountHukushiyoguTaiyo=comCountHukushiyoguTaiyo;
    }

    @JsonProperty("comCountNinchishoKyodoKaigo")
    public ServiceWithCountCom getComCountNinchishoKyodoKaigo() {
        return comCountNinchishoKyodoKaigo;
    }

    @JsonProperty("comCountNinchishoKyodoKaigo")
    public void setComCountNinchishoKyodoKaigo(ServiceWithCountCom comCountNinchishoKyodoKaigo) {
        this.comCountNinchishoKyodoKaigo=comCountNinchishoKyodoKaigo;
    }

    @JsonProperty("comCountHukushiyoguHanbai")
    public ServiceWithCountCom getComCountHukushiyoguHanbai() {
        return comCountHukushiyoguHanbai;
    }

    @JsonProperty("comCountHukushiyoguHanbai")
    public void setComCountHukushiyoguHanbai(ServiceWithCountCom comCountHukushiyoguHanbai) {
        this.comCountHukushiyoguHanbai=comCountHukushiyoguHanbai;
    }

    @JsonProperty("comCountSmallTakinoKaigo")
    public ServiceWithCountCom getComCountSmallTakinoKaigo() {
        return comCountSmallTakinoKaigo;
    }

    @JsonProperty("comCountSmallTakinoKaigo")
    public void setComCountSmallTakinoKaigo(ServiceWithCountCom comCountSmallTakinoKaigo) {
        this.comCountSmallTakinoKaigo=comCountSmallTakinoKaigo;
    }

    @JsonProperty("lblJutakuKaishu")
    public Label getLblJutakuKaishu() {
        return lblJutakuKaishu;
    }

    @JsonProperty("lblJutakuKaishu")
    public void setLblJutakuKaishu(Label lblJutakuKaishu) {
        this.lblJutakuKaishu=lblJutakuKaishu;
    }

    @JsonProperty("radJutakuKaishu")
    public RadioButton getRadJutakuKaishu() {
        return radJutakuKaishu;
    }

    @JsonProperty("radJutakuKaishu")
    public void setRadJutakuKaishu(RadioButton radJutakuKaishu) {
        this.radJutakuKaishu=radJutakuKaishu;
    }

    @JsonProperty("comCountChiikiTokuteiShisetsuKaigo")
    public ServiceWithCountCom getComCountChiikiTokuteiShisetsuKaigo() {
        return comCountChiikiTokuteiShisetsuKaigo;
    }

    @JsonProperty("comCountChiikiTokuteiShisetsuKaigo")
    public void setComCountChiikiTokuteiShisetsuKaigo(ServiceWithCountCom comCountChiikiTokuteiShisetsuKaigo) {
        this.comCountChiikiTokuteiShisetsuKaigo=comCountChiikiTokuteiShisetsuKaigo;
    }

    @JsonProperty("comCountChiikiRojinHukushiShisetsuKaigo")
    public ServiceWithCountCom getComCountChiikiRojinHukushiShisetsuKaigo() {
        return comCountChiikiRojinHukushiShisetsuKaigo;
    }

    @JsonProperty("comCountChiikiRojinHukushiShisetsuKaigo")
    public void setComCountChiikiRojinHukushiShisetsuKaigo(ServiceWithCountCom comCountChiikiRojinHukushiShisetsuKaigo) {
        this.comCountChiikiRojinHukushiShisetsuKaigo=comCountChiikiRojinHukushiShisetsuKaigo;
    }

    @JsonProperty("comCountTeikiJunkaiHomonKaigo")
    public ServiceWithCountCom getComCountTeikiJunkaiHomonKaigo() {
        return comCountTeikiJunkaiHomonKaigo;
    }

    @JsonProperty("comCountTeikiJunkaiHomonKaigo")
    public void setComCountTeikiJunkaiHomonKaigo(ServiceWithCountCom comCountTeikiJunkaiHomonKaigo) {
        this.comCountTeikiJunkaiHomonKaigo=comCountTeikiJunkaiHomonKaigo;
    }

    @JsonProperty("lblNewLine2")
    public Label getLblNewLine2() {
        return lblNewLine2;
    }

    @JsonProperty("lblNewLine2")
    public void setLblNewLine2(Label lblNewLine2) {
        this.lblNewLine2=lblNewLine2;
    }

    @JsonProperty("lblShichosonTokubetsuKyufu")
    public Label getLblShichosonTokubetsuKyufu() {
        return lblShichosonTokubetsuKyufu;
    }

    @JsonProperty("lblShichosonTokubetsuKyufu")
    public void setLblShichosonTokubetsuKyufu(Label lblShichosonTokubetsuKyufu) {
        this.lblShichosonTokubetsuKyufu=lblShichosonTokubetsuKyufu;
    }

    @JsonProperty("txtShichosonTokubetsuKyufu")
    public TextBox getTxtShichosonTokubetsuKyufu() {
        return txtShichosonTokubetsuKyufu;
    }

    @JsonProperty("txtShichosonTokubetsuKyufu")
    public void setTxtShichosonTokubetsuKyufu(TextBox txtShichosonTokubetsuKyufu) {
        this.txtShichosonTokubetsuKyufu=txtShichosonTokubetsuKyufu;
    }

    @JsonProperty("lblZaitakuSeriviceOutsideKaigoKyufu")
    public Label getLblZaitakuSeriviceOutsideKaigoKyufu() {
        return lblZaitakuSeriviceOutsideKaigoKyufu;
    }

    @JsonProperty("lblZaitakuSeriviceOutsideKaigoKyufu")
    public void setLblZaitakuSeriviceOutsideKaigoKyufu(Label lblZaitakuSeriviceOutsideKaigoKyufu) {
        this.lblZaitakuSeriviceOutsideKaigoKyufu=lblZaitakuSeriviceOutsideKaigoKyufu;
    }

    @JsonProperty("txtZaitakuSeriviceOutsideKaigoKyufu")
    public TextBox getTxtZaitakuSeriviceOutsideKaigoKyufu() {
        return txtZaitakuSeriviceOutsideKaigoKyufu;
    }

    @JsonProperty("txtZaitakuSeriviceOutsideKaigoKyufu")
    public void setTxtZaitakuSeriviceOutsideKaigoKyufu(TextBox txtZaitakuSeriviceOutsideKaigoKyufu) {
        this.txtZaitakuSeriviceOutsideKaigoKyufu=txtZaitakuSeriviceOutsideKaigoKyufu;
    }

}
