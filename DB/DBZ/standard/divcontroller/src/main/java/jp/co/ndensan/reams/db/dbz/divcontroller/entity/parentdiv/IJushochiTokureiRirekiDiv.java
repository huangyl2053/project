package jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv;

//import jp.co.ndensan.reams.db.dbz.divcontroller.entity.JushochiTokureiRirekiDiv.DisplayMode;
import jp.co.ndensan.reams.uz.uza.ui.binding.DataGrid;

/**
 * このコードはツールによって生成されました。
 */
public interface IJushochiTokureiRirekiDiv {

    /**
     * 住所地特例履歴Gridを取得します。
     *
     * @return 住所地特例履歴Grid
     */
    DataGrid<dgJushochiTokureiRireki_Row> getDgJushochiTokureiRireki();

    void setDgJushochiTokureiRireki(DataGrid<dgJushochiTokureiRireki_Row> dgJushochiTokureiRireki);
//
//    DisplayMode getMode_DisplayMode();
//
//    void setMode_DisplayMode(DisplayMode value);
}