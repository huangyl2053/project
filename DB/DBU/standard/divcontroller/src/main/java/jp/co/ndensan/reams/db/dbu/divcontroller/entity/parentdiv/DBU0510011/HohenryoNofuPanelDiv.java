package jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0510011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * HohenryoNofuPanel のクラスファイル 
 * 
 * @author 自動生成
 */
public class HohenryoNofuPanelDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnTuikaSuru")
    private Button btnTuikaSuru;
    @JsonProperty("dghokenryoNofu")
    private DataGrid<dghokenryoNofu_Row> dghokenryoNofu;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnTuikaSuru
     * @return btnTuikaSuru
     */
    @JsonProperty("btnTuikaSuru")
    public Button getBtnTuikaSuru() {
        return btnTuikaSuru;
    }

    /*
     * setbtnTuikaSuru
     * @param btnTuikaSuru btnTuikaSuru
     */
    @JsonProperty("btnTuikaSuru")
    public void setBtnTuikaSuru(Button btnTuikaSuru) {
        this.btnTuikaSuru = btnTuikaSuru;
    }

    /*
     * getdghokenryoNofu
     * @return dghokenryoNofu
     */
    @JsonProperty("dghokenryoNofu")
    public DataGrid<dghokenryoNofu_Row> getDghokenryoNofu() {
        return dghokenryoNofu;
    }

    /*
     * setdghokenryoNofu
     * @param dghokenryoNofu dghokenryoNofu
     */
    @JsonProperty("dghokenryoNofu")
    public void setDghokenryoNofu(DataGrid<dghokenryoNofu_Row> dghokenryoNofu) {
        this.dghokenryoNofu = dghokenryoNofu;
    }

    // </editor-fold>
}
