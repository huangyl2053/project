package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC3510011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * HokenshaSofuList のクラスファイル 
 * 
 * @author 自動生成
 */
public class HokenshaSofuListDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-08-09_21-40-56">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("dgSofuJohoIchiran")
    private DataGrid<dgSofuJohoIchiran_Row> dgSofuJohoIchiran;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getdgSofuJohoIchiran
     * @return dgSofuJohoIchiran
     */
    @JsonProperty("dgSofuJohoIchiran")
    public DataGrid<dgSofuJohoIchiran_Row> getDgSofuJohoIchiran() {
        return dgSofuJohoIchiran;
    }

    /*
     * setdgSofuJohoIchiran
     * @param dgSofuJohoIchiran dgSofuJohoIchiran
     */
    @JsonProperty("dgSofuJohoIchiran")
    public void setDgSofuJohoIchiran(DataGrid<dgSofuJohoIchiran_Row> dgSofuJohoIchiran) {
        this.dgSofuJohoIchiran = dgSofuJohoIchiran;
    }

    // </editor-fold>
}