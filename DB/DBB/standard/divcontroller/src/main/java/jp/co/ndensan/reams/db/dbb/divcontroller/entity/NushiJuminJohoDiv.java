package jp.co.ndensan.reams.db.dbb.divcontroller.entity;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、以下の状況下で不正な動作の原因になったり、
 * コードが再生成されるときに損失したりします。
 * Wed Apr 09 15:13:08 JST 2014 
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * NushiJuminJoho のクラスファイル 
 * 
 * @author 自動生成
 */
public class NushiJuminJohoDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("lblNushiName")
    private Label lblNushiName;
    @JsonProperty("txtNushiShikibetsuCode")
    private TextBoxCode txtNushiShikibetsuCode;
    @JsonProperty("txtNushiName")
    private TextBox txtNushiName;
    @JsonProperty("lblNushiSetaiCode")
    private Label lblNushiSetaiCode;
    @JsonProperty("txtNushiSetaiCode")
    private TextBoxCode txtNushiSetaiCode;
    @JsonProperty("lblNushiGyoseiku")
    private Label lblNushiGyoseiku;
    @JsonProperty("txtNushiGyoseiku")
    private TextBox txtNushiGyoseiku;
    @JsonProperty("lblNushiJusho")
    private Label lblNushiJusho;
    @JsonProperty("txtNushiYubinNo")
    private TextBoxYubinNo txtNushiYubinNo;
    @JsonProperty("txtNushiJusho")
    private TextBox txtNushiJusho;
    @JsonProperty("imgNushiTaino")
    private StaticImage imgNushiTaino;
    @JsonProperty("imgNushiSofusaki")
    private StaticImage imgNushiSofusaki;
    @JsonProperty("imgNushiKoza")
    private StaticImage imgNushiKoza;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("lblNushiName")
    public Label getLblNushiName() {
        return lblNushiName;
    }

    @JsonProperty("lblNushiName")
    public void setLblNushiName(Label lblNushiName) {
        this.lblNushiName=lblNushiName;
    }

    @JsonProperty("txtNushiShikibetsuCode")
    public TextBoxCode getTxtNushiShikibetsuCode() {
        return txtNushiShikibetsuCode;
    }

    @JsonProperty("txtNushiShikibetsuCode")
    public void setTxtNushiShikibetsuCode(TextBoxCode txtNushiShikibetsuCode) {
        this.txtNushiShikibetsuCode=txtNushiShikibetsuCode;
    }

    @JsonProperty("txtNushiName")
    public TextBox getTxtNushiName() {
        return txtNushiName;
    }

    @JsonProperty("txtNushiName")
    public void setTxtNushiName(TextBox txtNushiName) {
        this.txtNushiName=txtNushiName;
    }

    @JsonProperty("lblNushiSetaiCode")
    public Label getLblNushiSetaiCode() {
        return lblNushiSetaiCode;
    }

    @JsonProperty("lblNushiSetaiCode")
    public void setLblNushiSetaiCode(Label lblNushiSetaiCode) {
        this.lblNushiSetaiCode=lblNushiSetaiCode;
    }

    @JsonProperty("txtNushiSetaiCode")
    public TextBoxCode getTxtNushiSetaiCode() {
        return txtNushiSetaiCode;
    }

    @JsonProperty("txtNushiSetaiCode")
    public void setTxtNushiSetaiCode(TextBoxCode txtNushiSetaiCode) {
        this.txtNushiSetaiCode=txtNushiSetaiCode;
    }

    @JsonProperty("lblNushiGyoseiku")
    public Label getLblNushiGyoseiku() {
        return lblNushiGyoseiku;
    }

    @JsonProperty("lblNushiGyoseiku")
    public void setLblNushiGyoseiku(Label lblNushiGyoseiku) {
        this.lblNushiGyoseiku=lblNushiGyoseiku;
    }

    @JsonProperty("txtNushiGyoseiku")
    public TextBox getTxtNushiGyoseiku() {
        return txtNushiGyoseiku;
    }

    @JsonProperty("txtNushiGyoseiku")
    public void setTxtNushiGyoseiku(TextBox txtNushiGyoseiku) {
        this.txtNushiGyoseiku=txtNushiGyoseiku;
    }

    @JsonProperty("lblNushiJusho")
    public Label getLblNushiJusho() {
        return lblNushiJusho;
    }

    @JsonProperty("lblNushiJusho")
    public void setLblNushiJusho(Label lblNushiJusho) {
        this.lblNushiJusho=lblNushiJusho;
    }

    @JsonProperty("txtNushiYubinNo")
    public TextBoxYubinNo getTxtNushiYubinNo() {
        return txtNushiYubinNo;
    }

    @JsonProperty("txtNushiYubinNo")
    public void setTxtNushiYubinNo(TextBoxYubinNo txtNushiYubinNo) {
        this.txtNushiYubinNo=txtNushiYubinNo;
    }

    @JsonProperty("txtNushiJusho")
    public TextBox getTxtNushiJusho() {
        return txtNushiJusho;
    }

    @JsonProperty("txtNushiJusho")
    public void setTxtNushiJusho(TextBox txtNushiJusho) {
        this.txtNushiJusho=txtNushiJusho;
    }

    @JsonProperty("imgNushiTaino")
    public StaticImage getImgNushiTaino() {
        return imgNushiTaino;
    }

    @JsonProperty("imgNushiTaino")
    public void setImgNushiTaino(StaticImage imgNushiTaino) {
        this.imgNushiTaino=imgNushiTaino;
    }

    @JsonProperty("imgNushiSofusaki")
    public StaticImage getImgNushiSofusaki() {
        return imgNushiSofusaki;
    }

    @JsonProperty("imgNushiSofusaki")
    public void setImgNushiSofusaki(StaticImage imgNushiSofusaki) {
        this.imgNushiSofusaki=imgNushiSofusaki;
    }

    @JsonProperty("imgNushiKoza")
    public StaticImage getImgNushiKoza() {
        return imgNushiKoza;
    }

    @JsonProperty("imgNushiKoza")
    public void setImgNushiKoza(StaticImage imgNushiKoza) {
        this.imgNushiKoza=imgNushiKoza;
    }

}