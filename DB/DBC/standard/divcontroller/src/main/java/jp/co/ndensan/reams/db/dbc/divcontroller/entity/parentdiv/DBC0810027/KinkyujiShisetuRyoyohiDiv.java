package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810027;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.DataGrid;
import jp.co.ndensan.reams.uz.uza.ui.binding.Label;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBox;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxDate;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxMultiLine;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxNum;

/**
 * KinkyujiShisetuRyoyohi のクラスファイル
 *
 * @reamsid_L DBC-1010-070 xupeng
 */
public class KinkyujiShisetuRyoyohiDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("panelCcd")
    private panelCcdDiv panelCcd;
    @JsonProperty("panelHead")
    private panelHeadDiv panelHead;
    @JsonProperty("panelKinkyujiShisetuRyoyohi")
    private panelKinkyujiShisetuRyoyohiDiv panelKinkyujiShisetuRyoyohi;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getpanelCcd
     * @return panelCcd
     */
    @JsonProperty("panelCcd")
    public panelCcdDiv getPanelCcd() {
        return panelCcd;
    }

    /*
     * setpanelCcd
     * @param panelCcd panelCcd
     */
    @JsonProperty("panelCcd")
    public void setPanelCcd(panelCcdDiv panelCcd) {
        this.panelCcd = panelCcd;
    }

    /*
     * getpanelHead
     * @return panelHead
     */
    @JsonProperty("panelHead")
    public panelHeadDiv getPanelHead() {
        return panelHead;
    }

    /*
     * setpanelHead
     * @param panelHead panelHead
     */
    @JsonProperty("panelHead")
    public void setPanelHead(panelHeadDiv panelHead) {
        this.panelHead = panelHead;
    }

    /*
     * getpanelKinkyujiShisetuRyoyohi
     * @return panelKinkyujiShisetuRyoyohi
     */
    @JsonProperty("panelKinkyujiShisetuRyoyohi")
    public panelKinkyujiShisetuRyoyohiDiv getPanelKinkyujiShisetuRyoyohi() {
        return panelKinkyujiShisetuRyoyohi;
    }

    /*
     * setpanelKinkyujiShisetuRyoyohi
     * @param panelKinkyujiShisetuRyoyohi panelKinkyujiShisetuRyoyohi
     */
    @JsonProperty("panelKinkyujiShisetuRyoyohi")
    public void setPanelKinkyujiShisetuRyoyohi(panelKinkyujiShisetuRyoyohiDiv panelKinkyujiShisetuRyoyohi) {
        this.panelKinkyujiShisetuRyoyohi = panelKinkyujiShisetuRyoyohi;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public DataGrid<dgdKinkyujiShiseturyoyo_Row> getDgdKinkyujiShiseturyoyo() {
        return this.getPanelKinkyujiShisetuRyoyohi().getDgdKinkyujiShiseturyoyo();
    }

    @JsonIgnore
    public void setDgdKinkyujiShiseturyoyo(DataGrid<dgdKinkyujiShiseturyoyo_Row> dgdKinkyujiShiseturyoyo) {
        this.getPanelKinkyujiShisetuRyoyohi().setDgdKinkyujiShiseturyoyo(dgdKinkyujiShiseturyoyo);
    }

    @JsonIgnore
    public panelKinkyujiShiseturyoyoDetailDiv getPanelKinkyujiShiseturyoyoDetail() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail();
    }

    @JsonIgnore
    public void setPanelKinkyujiShiseturyoyoDetail(panelKinkyujiShiseturyoyoDetailDiv panelKinkyujiShiseturyoyoDetail) {
        this.getPanelKinkyujiShisetuRyoyohi().setPanelKinkyujiShiseturyoyoDetail(panelKinkyujiShiseturyoyoDetail);
    }

    @JsonIgnore
    public panelShobyoNameDiv getPanelShobyoName() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelShobyoName();
    }

    @JsonIgnore
    public void setPanelShobyoName(panelShobyoNameDiv panelShobyoName) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().setPanelShobyoName(panelShobyoName);
    }

    @JsonIgnore
    public TextBox getTxtKinkyuShobyoName1() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelShobyoName().getTxtKinkyuShobyoName1();
    }

    @JsonIgnore
    public void setTxtKinkyuShobyoName1(TextBox txtKinkyuShobyoName1) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelShobyoName().setTxtKinkyuShobyoName1(txtKinkyuShobyoName1);
    }

    @JsonIgnore
    public TextBoxDate getTxtKinkyuJiryoStartYMD1() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelShobyoName().getTxtKinkyuJiryoStartYMD1();
    }

    @JsonIgnore
    public void setTxtKinkyuJiryoStartYMD1(TextBoxDate txtKinkyuJiryoStartYMD1) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelShobyoName().setTxtKinkyuJiryoStartYMD1(txtKinkyuJiryoStartYMD1);
    }

    @JsonIgnore
    public TextBox getTxtKinkyuShobyoName2() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelShobyoName().getTxtKinkyuShobyoName2();
    }

    @JsonIgnore
    public void setTxtKinkyuShobyoName2(TextBox txtKinkyuShobyoName2) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelShobyoName().setTxtKinkyuShobyoName2(txtKinkyuShobyoName2);
    }

    @JsonIgnore
    public TextBoxDate getTxtKinkyuJiryoStartYMD2() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelShobyoName().getTxtKinkyuJiryoStartYMD2();
    }

    @JsonIgnore
    public void setTxtKinkyuJiryoStartYMD2(TextBoxDate txtKinkyuJiryoStartYMD2) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelShobyoName().setTxtKinkyuJiryoStartYMD2(txtKinkyuJiryoStartYMD2);
    }

    @JsonIgnore
    public TextBox getTxtKinkyuShobyoName3() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelShobyoName().getTxtKinkyuShobyoName3();
    }

    @JsonIgnore
    public void setTxtKinkyuShobyoName3(TextBox txtKinkyuShobyoName3) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelShobyoName().setTxtKinkyuShobyoName3(txtKinkyuShobyoName3);
    }

    @JsonIgnore
    public TextBoxDate getTxtKinkyuJiryoStartYMD3() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelShobyoName().getTxtKinkyuJiryoStartYMD3();
    }

    @JsonIgnore
    public void setTxtKinkyuJiryoStartYMD3(TextBoxDate txtKinkyuJiryoStartYMD3) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelShobyoName().setTxtKinkyuJiryoStartYMD3(txtKinkyuJiryoStartYMD3);
    }

    @JsonIgnore
    public panelOshinTsuyinDiv getPanelOshinTsuyin() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin();
    }

    @JsonIgnore
    public void setPanelOshinTsuyin(panelOshinTsuyinDiv panelOshinTsuyin) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().setPanelOshinTsuyin(panelOshinTsuyin);
    }

    @JsonIgnore
    public Label getLblOshin() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().getLblOshin();
    }

    @JsonIgnore
    public void setLblOshin(Label lblOshin) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().setLblOshin(lblOshin);
    }

    @JsonIgnore
    public TextBoxNum getTxtOshinNissu() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().getTxtOshinNissu();
    }

    @JsonIgnore
    public void setTxtOshinNissu(TextBoxNum txtOshinNissu) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().setTxtOshinNissu(txtOshinNissu);
    }

    @JsonIgnore
    public TextBox getTxtOshinYiryokikanName() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().getTxtOshinYiryokikanName();
    }

    @JsonIgnore
    public void setTxtOshinYiryokikanName(TextBox txtOshinYiryokikanName) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().setTxtOshinYiryokikanName(txtOshinYiryokikanName);
    }

    @JsonIgnore
    public Label getLblTuyin() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().getLblTuyin();
    }

    @JsonIgnore
    public void setLblTuyin(Label lblTuyin) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().setLblTuyin(lblTuyin);
    }

    @JsonIgnore
    public TextBoxNum getTxtTuyinNissu() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().getTxtTuyinNissu();
    }

    @JsonIgnore
    public void setTxtTuyinNissu(TextBoxNum txtTuyinNissu) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().setTxtTuyinNissu(txtTuyinNissu);
    }

    @JsonIgnore
    public TextBox getTxtTuyinYiryokikanName() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().getTxtTuyinYiryokikanName();
    }

    @JsonIgnore
    public void setTxtTuyinYiryokikanName(TextBox txtTuyinYiryokikanName) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().setTxtTuyinYiryokikanName(txtTuyinYiryokikanName);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTikiyo() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().getTxtTikiyo();
    }

    @JsonIgnore
    public void setTxtTikiyo(TextBoxMultiLine txtTikiyo) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelOshinTsuyin().setTxtTikiyo(txtTikiyo);
    }

    @JsonIgnore
    public panelJiryoTensuuDiv getPanelJiryoTensuu() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu();
    }

    @JsonIgnore
    public void setPanelJiryoTensuu(panelJiryoTensuuDiv panelJiryoTensuu) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().setPanelJiryoTensuu(panelJiryoTensuu);
    }

    @JsonIgnore
    public TextBoxNum getTxtkinkyuChiryoKanriTanisu() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().getTxtkinkyuChiryoKanriTanisu();
    }

    @JsonIgnore
    public void setTxtkinkyuChiryoKanriTanisu(TextBoxNum txtkinkyuChiryoKanriTanisu) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().setTxtkinkyuChiryoKanriTanisu(txtkinkyuChiryoKanriTanisu);
    }

    @JsonIgnore
    public TextBoxNum getTxtkinkyuChiryoKanriNissu() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().getTxtkinkyuChiryoKanriNissu();
    }

    @JsonIgnore
    public void setTxtkinkyuChiryoKanriNissu(TextBoxNum txtkinkyuChiryoKanriNissu) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().setTxtkinkyuChiryoKanriNissu(txtkinkyuChiryoKanriNissu);
    }

    @JsonIgnore
    public TextBoxNum getTxtkinkyuChiryoKanriSubTotal() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().getTxtkinkyuChiryoKanriSubTotal();
    }

    @JsonIgnore
    public void setTxtkinkyuChiryoKanriSubTotal(TextBoxNum txtkinkyuChiryoKanriSubTotal) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().setTxtkinkyuChiryoKanriSubTotal(txtkinkyuChiryoKanriSubTotal);
    }

    @JsonIgnore
    public TextBoxNum getTxtrehabilitationTanisu() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().getTxtrehabilitationTanisu();
    }

    @JsonIgnore
    public void setTxtrehabilitationTanisu(TextBoxNum txtrehabilitationTanisu) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().setTxtrehabilitationTanisu(txtrehabilitationTanisu);
    }

    @JsonIgnore
    public TextBoxNum getTxtshujutsuTanisu() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().getTxtshujutsuTanisu();
    }

    @JsonIgnore
    public void setTxtshujutsuTanisu(TextBoxNum txtshujutsuTanisu) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().setTxtshujutsuTanisu(txtshujutsuTanisu);
    }

    @JsonIgnore
    public TextBoxNum getTxtHoshasenChiryoTanisu() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().getTxtHoshasenChiryoTanisu();
    }

    @JsonIgnore
    public void setTxtHoshasenChiryoTanisu(TextBoxNum txtHoshasenChiryoTanisu) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().setTxtHoshasenChiryoTanisu(txtHoshasenChiryoTanisu);
    }

    @JsonIgnore
    public TextBoxNum getTxtShochiTanisu() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().getTxtShochiTanisu();
    }

    @JsonIgnore
    public void setTxtShochiTanisu(TextBoxNum txtShochiTanisu) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().setTxtShochiTanisu(txtShochiTanisu);
    }

    @JsonIgnore
    public TextBoxNum getTxtMasuiTanisu() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().getTxtMasuiTanisu();
    }

    @JsonIgnore
    public void setTxtMasuiTanisu(TextBoxNum txtMasuiTanisu) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().setTxtMasuiTanisu(txtMasuiTanisu);
    }

    @JsonIgnore
    public TextBoxNum getTxtKinkyuShisetsuRyoyohiTotalTanisu() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().getTxtKinkyuShisetsuRyoyohiTotalTanisu();
    }

    @JsonIgnore
    public void setTxtKinkyuShisetsuRyoyohiTotalTanisu(TextBoxNum txtKinkyuShisetsuRyoyohiTotalTanisu) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getPanelJiryoTensuu().setTxtKinkyuShisetsuRyoyohiTotalTanisu(txtKinkyuShisetsuRyoyohiTotalTanisu);
    }

    @JsonIgnore
    public Button getBtnClose() {
        return this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().getBtnClose();
    }

    @JsonIgnore
    public void setBtnClose(Button btnClose) {
        this.getPanelKinkyujiShisetuRyoyohi().getPanelKinkyujiShiseturyoyoDetail().setBtnClose(btnClose);
    }

    // </editor-fold>
}