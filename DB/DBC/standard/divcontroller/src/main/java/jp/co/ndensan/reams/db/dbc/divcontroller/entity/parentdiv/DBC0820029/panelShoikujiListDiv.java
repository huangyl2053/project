package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0820029;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.DataGrid;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * panelShoikujiList のクラスファイル
 *
 * @reamsid_L DBC-1030-090 lijunjun
 */
public class panelShoikujiListDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnAdd")
    private Button btnAdd;
    @JsonProperty("dgdShokuji")
    private DataGrid<dgdShokuji_Row> dgdShokuji;

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
     * getdgdShokuji
     * @return dgdShokuji
     */
    @JsonProperty("dgdShokuji")
    public DataGrid<dgdShokuji_Row> getDgdShokuji() {
        return dgdShokuji;
    }

    /*
     * setdgdShokuji
     * @param dgdShokuji dgdShokuji
     */
    @JsonProperty("dgdShokuji")
    public void setDgdShokuji(DataGrid<dgdShokuji_Row> dgdShokuji) {
        this.dgdShokuji = dgdShokuji;
    }

    // </editor-fold>
}
