package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810030;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * panelSeikyuShokai のクラスファイル 
 * 
 * @author 自動生成
 */
public class panelSeikyuShokaiDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2015-11-16_12-38-19">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtServiceShurui")
    private TextBoxCode txtServiceShurui;
    @JsonProperty("txtServiceName")
    private TextBox txtServiceName;
    @JsonProperty("txtJitsuNissu")
    private TextBoxNum txtJitsuNissu;
    @JsonProperty("rdoShinsahouhou")
    private RadioButton rdoShinsahouhou;
    @JsonProperty("txtKyufuritsu")
    private TextBoxNum txtKyufuritsu;
    @JsonProperty("txtKeikakuTanyi")
    private TextBoxNum txtKeikakuTanyi;
    @JsonProperty("txtTaishoTanyi")
    private TextBoxNum txtTaishoTanyi;
    @JsonProperty("txtTaishoGaiTanyi")
    private TextBoxNum txtTaishoGaiTanyi;
    @JsonProperty("txtKeikakuNissu")
    private TextBoxNum txtKeikakuNissu;
    @JsonProperty("txtJitsuNissuTankinyusho")
    private TextBoxNum txtJitsuNissuTankinyusho;
    @JsonProperty("txtTanyigokeiHokenbun")
    private TextBoxNum txtTanyigokeiHokenbun;
    @JsonProperty("txtTanyiTanka")
    private TextBoxNum txtTanyiTanka;
    @JsonProperty("txtSeikyugakuHoken")
    private TextBoxNum txtSeikyugakuHoken;
    @JsonProperty("txtRiyoshaFutanHoken")
    private TextBoxNum txtRiyoshaFutanHoken;
    @JsonProperty("txtSagakukinngakuHoken")
    private TextBoxNum txtSagakukinngakuHoken;
    @JsonProperty("txtTanyigokeiDekikatabun")
    private TextBoxNum txtTanyigokeiDekikatabun;
    @JsonProperty("txtSeikyugakuDekikata")
    private TextBoxNum txtSeikyugakuDekikata;
    @JsonProperty("txtRiyoshaFutanDekikata")
    private TextBoxNum txtRiyoshaFutanDekikata;
    @JsonProperty("txtSagakukinngakuDekikata")
    private TextBoxNum txtSagakukinngakuDekikata;
    @JsonProperty("btnClose")
    private Button btnClose;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * gettxtServiceShurui
     * @return txtServiceShurui
     */
    @JsonProperty("txtServiceShurui")
    public TextBoxCode getTxtServiceShurui() {
        return txtServiceShurui;
    }

    /*
     * settxtServiceShurui
     * @param txtServiceShurui txtServiceShurui
     */
    @JsonProperty("txtServiceShurui")
    public void setTxtServiceShurui(TextBoxCode txtServiceShurui) {
        this.txtServiceShurui = txtServiceShurui;
    }

    /*
     * gettxtServiceName
     * @return txtServiceName
     */
    @JsonProperty("txtServiceName")
    public TextBox getTxtServiceName() {
        return txtServiceName;
    }

    /*
     * settxtServiceName
     * @param txtServiceName txtServiceName
     */
    @JsonProperty("txtServiceName")
    public void setTxtServiceName(TextBox txtServiceName) {
        this.txtServiceName = txtServiceName;
    }

    /*
     * gettxtJitsuNissu
     * @return txtJitsuNissu
     */
    @JsonProperty("txtJitsuNissu")
    public TextBoxNum getTxtJitsuNissu() {
        return txtJitsuNissu;
    }

    /*
     * settxtJitsuNissu
     * @param txtJitsuNissu txtJitsuNissu
     */
    @JsonProperty("txtJitsuNissu")
    public void setTxtJitsuNissu(TextBoxNum txtJitsuNissu) {
        this.txtJitsuNissu = txtJitsuNissu;
    }

    /*
     * getrdoShinsahouhou
     * @return rdoShinsahouhou
     */
    @JsonProperty("rdoShinsahouhou")
    public RadioButton getRdoShinsahouhou() {
        return rdoShinsahouhou;
    }

    /*
     * setrdoShinsahouhou
     * @param rdoShinsahouhou rdoShinsahouhou
     */
    @JsonProperty("rdoShinsahouhou")
    public void setRdoShinsahouhou(RadioButton rdoShinsahouhou) {
        this.rdoShinsahouhou = rdoShinsahouhou;
    }

    /*
     * gettxtKyufuritsu
     * @return txtKyufuritsu
     */
    @JsonProperty("txtKyufuritsu")
    public TextBoxNum getTxtKyufuritsu() {
        return txtKyufuritsu;
    }

    /*
     * settxtKyufuritsu
     * @param txtKyufuritsu txtKyufuritsu
     */
    @JsonProperty("txtKyufuritsu")
    public void setTxtKyufuritsu(TextBoxNum txtKyufuritsu) {
        this.txtKyufuritsu = txtKyufuritsu;
    }

    /*
     * gettxtKeikakuTanyi
     * @return txtKeikakuTanyi
     */
    @JsonProperty("txtKeikakuTanyi")
    public TextBoxNum getTxtKeikakuTanyi() {
        return txtKeikakuTanyi;
    }

    /*
     * settxtKeikakuTanyi
     * @param txtKeikakuTanyi txtKeikakuTanyi
     */
    @JsonProperty("txtKeikakuTanyi")
    public void setTxtKeikakuTanyi(TextBoxNum txtKeikakuTanyi) {
        this.txtKeikakuTanyi = txtKeikakuTanyi;
    }

    /*
     * gettxtTaishoTanyi
     * @return txtTaishoTanyi
     */
    @JsonProperty("txtTaishoTanyi")
    public TextBoxNum getTxtTaishoTanyi() {
        return txtTaishoTanyi;
    }

    /*
     * settxtTaishoTanyi
     * @param txtTaishoTanyi txtTaishoTanyi
     */
    @JsonProperty("txtTaishoTanyi")
    public void setTxtTaishoTanyi(TextBoxNum txtTaishoTanyi) {
        this.txtTaishoTanyi = txtTaishoTanyi;
    }

    /*
     * gettxtTaishoGaiTanyi
     * @return txtTaishoGaiTanyi
     */
    @JsonProperty("txtTaishoGaiTanyi")
    public TextBoxNum getTxtTaishoGaiTanyi() {
        return txtTaishoGaiTanyi;
    }

    /*
     * settxtTaishoGaiTanyi
     * @param txtTaishoGaiTanyi txtTaishoGaiTanyi
     */
    @JsonProperty("txtTaishoGaiTanyi")
    public void setTxtTaishoGaiTanyi(TextBoxNum txtTaishoGaiTanyi) {
        this.txtTaishoGaiTanyi = txtTaishoGaiTanyi;
    }

    /*
     * gettxtKeikakuNissu
     * @return txtKeikakuNissu
     */
    @JsonProperty("txtKeikakuNissu")
    public TextBoxNum getTxtKeikakuNissu() {
        return txtKeikakuNissu;
    }

    /*
     * settxtKeikakuNissu
     * @param txtKeikakuNissu txtKeikakuNissu
     */
    @JsonProperty("txtKeikakuNissu")
    public void setTxtKeikakuNissu(TextBoxNum txtKeikakuNissu) {
        this.txtKeikakuNissu = txtKeikakuNissu;
    }

    /*
     * gettxtJitsuNissuTankinyusho
     * @return txtJitsuNissuTankinyusho
     */
    @JsonProperty("txtJitsuNissuTankinyusho")
    public TextBoxNum getTxtJitsuNissuTankinyusho() {
        return txtJitsuNissuTankinyusho;
    }

    /*
     * settxtJitsuNissuTankinyusho
     * @param txtJitsuNissuTankinyusho txtJitsuNissuTankinyusho
     */
    @JsonProperty("txtJitsuNissuTankinyusho")
    public void setTxtJitsuNissuTankinyusho(TextBoxNum txtJitsuNissuTankinyusho) {
        this.txtJitsuNissuTankinyusho = txtJitsuNissuTankinyusho;
    }

    /*
     * gettxtTanyigokeiHokenbun
     * @return txtTanyigokeiHokenbun
     */
    @JsonProperty("txtTanyigokeiHokenbun")
    public TextBoxNum getTxtTanyigokeiHokenbun() {
        return txtTanyigokeiHokenbun;
    }

    /*
     * settxtTanyigokeiHokenbun
     * @param txtTanyigokeiHokenbun txtTanyigokeiHokenbun
     */
    @JsonProperty("txtTanyigokeiHokenbun")
    public void setTxtTanyigokeiHokenbun(TextBoxNum txtTanyigokeiHokenbun) {
        this.txtTanyigokeiHokenbun = txtTanyigokeiHokenbun;
    }

    /*
     * gettxtTanyiTanka
     * @return txtTanyiTanka
     */
    @JsonProperty("txtTanyiTanka")
    public TextBoxNum getTxtTanyiTanka() {
        return txtTanyiTanka;
    }

    /*
     * settxtTanyiTanka
     * @param txtTanyiTanka txtTanyiTanka
     */
    @JsonProperty("txtTanyiTanka")
    public void setTxtTanyiTanka(TextBoxNum txtTanyiTanka) {
        this.txtTanyiTanka = txtTanyiTanka;
    }

    /*
     * gettxtSeikyugakuHoken
     * @return txtSeikyugakuHoken
     */
    @JsonProperty("txtSeikyugakuHoken")
    public TextBoxNum getTxtSeikyugakuHoken() {
        return txtSeikyugakuHoken;
    }

    /*
     * settxtSeikyugakuHoken
     * @param txtSeikyugakuHoken txtSeikyugakuHoken
     */
    @JsonProperty("txtSeikyugakuHoken")
    public void setTxtSeikyugakuHoken(TextBoxNum txtSeikyugakuHoken) {
        this.txtSeikyugakuHoken = txtSeikyugakuHoken;
    }

    /*
     * gettxtRiyoshaFutanHoken
     * @return txtRiyoshaFutanHoken
     */
    @JsonProperty("txtRiyoshaFutanHoken")
    public TextBoxNum getTxtRiyoshaFutanHoken() {
        return txtRiyoshaFutanHoken;
    }

    /*
     * settxtRiyoshaFutanHoken
     * @param txtRiyoshaFutanHoken txtRiyoshaFutanHoken
     */
    @JsonProperty("txtRiyoshaFutanHoken")
    public void setTxtRiyoshaFutanHoken(TextBoxNum txtRiyoshaFutanHoken) {
        this.txtRiyoshaFutanHoken = txtRiyoshaFutanHoken;
    }

    /*
     * gettxtSagakukinngakuHoken
     * @return txtSagakukinngakuHoken
     */
    @JsonProperty("txtSagakukinngakuHoken")
    public TextBoxNum getTxtSagakukinngakuHoken() {
        return txtSagakukinngakuHoken;
    }

    /*
     * settxtSagakukinngakuHoken
     * @param txtSagakukinngakuHoken txtSagakukinngakuHoken
     */
    @JsonProperty("txtSagakukinngakuHoken")
    public void setTxtSagakukinngakuHoken(TextBoxNum txtSagakukinngakuHoken) {
        this.txtSagakukinngakuHoken = txtSagakukinngakuHoken;
    }

    /*
     * gettxtTanyigokeiDekikatabun
     * @return txtTanyigokeiDekikatabun
     */
    @JsonProperty("txtTanyigokeiDekikatabun")
    public TextBoxNum getTxtTanyigokeiDekikatabun() {
        return txtTanyigokeiDekikatabun;
    }

    /*
     * settxtTanyigokeiDekikatabun
     * @param txtTanyigokeiDekikatabun txtTanyigokeiDekikatabun
     */
    @JsonProperty("txtTanyigokeiDekikatabun")
    public void setTxtTanyigokeiDekikatabun(TextBoxNum txtTanyigokeiDekikatabun) {
        this.txtTanyigokeiDekikatabun = txtTanyigokeiDekikatabun;
    }

    /*
     * gettxtSeikyugakuDekikata
     * @return txtSeikyugakuDekikata
     */
    @JsonProperty("txtSeikyugakuDekikata")
    public TextBoxNum getTxtSeikyugakuDekikata() {
        return txtSeikyugakuDekikata;
    }

    /*
     * settxtSeikyugakuDekikata
     * @param txtSeikyugakuDekikata txtSeikyugakuDekikata
     */
    @JsonProperty("txtSeikyugakuDekikata")
    public void setTxtSeikyugakuDekikata(TextBoxNum txtSeikyugakuDekikata) {
        this.txtSeikyugakuDekikata = txtSeikyugakuDekikata;
    }

    /*
     * gettxtRiyoshaFutanDekikata
     * @return txtRiyoshaFutanDekikata
     */
    @JsonProperty("txtRiyoshaFutanDekikata")
    public TextBoxNum getTxtRiyoshaFutanDekikata() {
        return txtRiyoshaFutanDekikata;
    }

    /*
     * settxtRiyoshaFutanDekikata
     * @param txtRiyoshaFutanDekikata txtRiyoshaFutanDekikata
     */
    @JsonProperty("txtRiyoshaFutanDekikata")
    public void setTxtRiyoshaFutanDekikata(TextBoxNum txtRiyoshaFutanDekikata) {
        this.txtRiyoshaFutanDekikata = txtRiyoshaFutanDekikata;
    }

    /*
     * gettxtSagakukinngakuDekikata
     * @return txtSagakukinngakuDekikata
     */
    @JsonProperty("txtSagakukinngakuDekikata")
    public TextBoxNum getTxtSagakukinngakuDekikata() {
        return txtSagakukinngakuDekikata;
    }

    /*
     * settxtSagakukinngakuDekikata
     * @param txtSagakukinngakuDekikata txtSagakukinngakuDekikata
     */
    @JsonProperty("txtSagakukinngakuDekikata")
    public void setTxtSagakukinngakuDekikata(TextBoxNum txtSagakukinngakuDekikata) {
        this.txtSagakukinngakuDekikata = txtSagakukinngakuDekikata;
    }

    /*
     * getbtnClose
     * @return btnClose
     */
    @JsonProperty("btnClose")
    public Button getBtnClose() {
        return btnClose;
    }

    /*
     * setbtnClose
     * @param btnClose btnClose
     */
    @JsonProperty("btnClose")
    public void setBtnClose(Button btnClose) {
        this.btnClose = btnClose;
    }

    // </editor-fold>
}
