package jp.co.ndensan.reams.db.dbc.divcontroller.entity.commonchilddiv.YokaigoninteiJigyotaishoRirekiList;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.DataGrid;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * pnlYokaigoNintei のクラスファイル
 *
 * @reamsid_L DBC-4350-010 wangxingpeng
 */
public class pnlYokaigoNinteiDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-05-30_13-18-33">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("dgNinteiRirekiList")
    private DataGrid<dgNinteiRirekiList_Row> dgNinteiRirekiList;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getdgNinteiRirekiList
     * @return dgNinteiRirekiList
     */
    @JsonProperty("dgNinteiRirekiList")
    public DataGrid<dgNinteiRirekiList_Row> getDgNinteiRirekiList() {
        return dgNinteiRirekiList;
    }

    /*
     * setdgNinteiRirekiList
     * @param dgNinteiRirekiList dgNinteiRirekiList
     */
    @JsonProperty("dgNinteiRirekiList")
    public void setDgNinteiRirekiList(DataGrid<dgNinteiRirekiList_Row> dgNinteiRirekiList) {
        this.dgNinteiRirekiList = dgNinteiRirekiList;
    }

    // </editor-fold>
}