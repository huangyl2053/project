package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0820028;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Label;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBox;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxMultiLine;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxNum;

/**
 * panelOshinTuyin のクラスファイル
 *
 * @reamsid_L DBC-1030-050 xupeng
 */
public class panelOshinTuyinDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-05-30_13-18-33">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("lblOshin")
    private Label lblOshin;
    @JsonProperty("txtOshinNissu")
    private TextBoxNum txtOshinNissu;
    @JsonProperty("txtOshinIryoKikanName")
    private TextBox txtOshinIryoKikanName;
    @JsonProperty("lblTsuin")
    private Label lblTsuin;
    @JsonProperty("txtTsuyinNissu")
    private TextBoxNum txtTsuyinNissu;
    @JsonProperty("txtTsuinKikanName")
    private TextBox txtTsuinKikanName;
    @JsonProperty("txtTekiyou")
    private TextBoxMultiLine txtTekiyou;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getlblOshin
     * @return lblOshin
     */
    @JsonProperty("lblOshin")
    public Label getLblOshin() {
        return lblOshin;
    }

    /*
     * setlblOshin
     * @param lblOshin lblOshin
     */
    @JsonProperty("lblOshin")
    public void setLblOshin(Label lblOshin) {
        this.lblOshin = lblOshin;
    }

    /*
     * gettxtOshinNissu
     * @return txtOshinNissu
     */
    @JsonProperty("txtOshinNissu")
    public TextBoxNum getTxtOshinNissu() {
        return txtOshinNissu;
    }

    /*
     * settxtOshinNissu
     * @param txtOshinNissu txtOshinNissu
     */
    @JsonProperty("txtOshinNissu")
    public void setTxtOshinNissu(TextBoxNum txtOshinNissu) {
        this.txtOshinNissu = txtOshinNissu;
    }

    /*
     * gettxtOshinIryoKikanName
     * @return txtOshinIryoKikanName
     */
    @JsonProperty("txtOshinIryoKikanName")
    public TextBox getTxtOshinIryoKikanName() {
        return txtOshinIryoKikanName;
    }

    /*
     * settxtOshinIryoKikanName
     * @param txtOshinIryoKikanName txtOshinIryoKikanName
     */
    @JsonProperty("txtOshinIryoKikanName")
    public void setTxtOshinIryoKikanName(TextBox txtOshinIryoKikanName) {
        this.txtOshinIryoKikanName = txtOshinIryoKikanName;
    }

    /*
     * getlblTsuin
     * @return lblTsuin
     */
    @JsonProperty("lblTsuin")
    public Label getLblTsuin() {
        return lblTsuin;
    }

    /*
     * setlblTsuin
     * @param lblTsuin lblTsuin
     */
    @JsonProperty("lblTsuin")
    public void setLblTsuin(Label lblTsuin) {
        this.lblTsuin = lblTsuin;
    }

    /*
     * gettxtTsuyinNissu
     * @return txtTsuyinNissu
     */
    @JsonProperty("txtTsuyinNissu")
    public TextBoxNum getTxtTsuyinNissu() {
        return txtTsuyinNissu;
    }

    /*
     * settxtTsuyinNissu
     * @param txtTsuyinNissu txtTsuyinNissu
     */
    @JsonProperty("txtTsuyinNissu")
    public void setTxtTsuyinNissu(TextBoxNum txtTsuyinNissu) {
        this.txtTsuyinNissu = txtTsuyinNissu;
    }

    /*
     * gettxtTsuinKikanName
     * @return txtTsuinKikanName
     */
    @JsonProperty("txtTsuinKikanName")
    public TextBox getTxtTsuinKikanName() {
        return txtTsuinKikanName;
    }

    /*
     * settxtTsuinKikanName
     * @param txtTsuinKikanName txtTsuinKikanName
     */
    @JsonProperty("txtTsuinKikanName")
    public void setTxtTsuinKikanName(TextBox txtTsuinKikanName) {
        this.txtTsuinKikanName = txtTsuinKikanName;
    }

    /*
     * gettxtTekiyou
     * @return txtTekiyou
     */
    @JsonProperty("txtTekiyou")
    public TextBoxMultiLine getTxtTekiyou() {
        return txtTekiyou;
    }

    /*
     * settxtTekiyou
     * @param txtTekiyou txtTekiyou
     */
    @JsonProperty("txtTekiyou")
    public void setTxtTekiyou(TextBoxMultiLine txtTekiyou) {
        this.txtTekiyou = txtTekiyou;
    }

    // </editor-fold>
}
