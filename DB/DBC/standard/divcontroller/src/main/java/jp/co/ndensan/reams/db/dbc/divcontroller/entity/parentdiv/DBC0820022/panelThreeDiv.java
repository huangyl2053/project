package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0820022;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.DataGrid;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxNum;

/**
 * panelThree のクラスファイル
 *
 * @reamsid_L DBC-1030-040 quxiaodong
 */
public class panelThreeDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnAdd")
    private Button btnAdd;
    @JsonProperty("dgdKyufuhiMeisai")
    private DataGrid<dgdKyufuhiMeisai_Row> dgdKyufuhiMeisai;
    @JsonProperty("panelFour")
    private panelFourDiv panelFour;
    @JsonProperty("rowId")
    private TextBoxNum rowId;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnAdd
     * @return btnAdd
     */
    @JsonProperty("btnAdd")
    public Button getBtnAdd() {
        return btnAdd;
    }

    /*
     * setbtnAdd
     * @param btnAdd btnAdd
     */
    @JsonProperty("btnAdd")
    public void setBtnAdd(Button btnAdd) {
        this.btnAdd = btnAdd;
    }

    /*
     * getdgdKyufuhiMeisai
     * @return dgdKyufuhiMeisai
     */
    @JsonProperty("dgdKyufuhiMeisai")
    public DataGrid<dgdKyufuhiMeisai_Row> getDgdKyufuhiMeisai() {
        return dgdKyufuhiMeisai;
    }

    /*
     * setdgdKyufuhiMeisai
     * @param dgdKyufuhiMeisai dgdKyufuhiMeisai
     */
    @JsonProperty("dgdKyufuhiMeisai")
    public void setDgdKyufuhiMeisai(DataGrid<dgdKyufuhiMeisai_Row> dgdKyufuhiMeisai) {
        this.dgdKyufuhiMeisai = dgdKyufuhiMeisai;
    }

    /*
     * getpanelFour
     * @return panelFour
     */
    @JsonProperty("panelFour")
    public panelFourDiv getPanelFour() {
        return panelFour;
    }

    /*
     * setpanelFour
     * @param panelFour panelFour
     */
    @JsonProperty("panelFour")
    public void setPanelFour(panelFourDiv panelFour) {
        this.panelFour = panelFour;
    }

    /*
     * getrowId
     * @return rowId
     */
    @JsonProperty("rowId")
    public TextBoxNum getRowId() {
        return rowId;
    }

    /*
     * setrowId
     * @param rowId rowId
     */
    @JsonProperty("rowId")
    public void setRowId(TextBoxNum rowId) {
        this.rowId = rowId;
    }

    // </editor-fold>
}
