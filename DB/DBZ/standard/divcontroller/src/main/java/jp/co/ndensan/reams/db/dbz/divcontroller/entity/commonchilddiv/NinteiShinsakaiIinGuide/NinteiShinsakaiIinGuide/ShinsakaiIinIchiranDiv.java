package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.NinteiShinsakaiIinGuide.NinteiShinsakaiIinGuide;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * ShinsakaiIinIchiran のクラスファイル 
 * 
 * @reamsid_L DBE-3000-030  lijia
 * 
 */
public class ShinsakaiIinIchiranDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2017-03-07_20-09-44">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("dgShinsakaiIinIchiran")
    private DataGrid<dgShinsakaiIinIchiran_Row> dgShinsakaiIinIchiran;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getdgShinsakaiIinIchiran
     * @return dgShinsakaiIinIchiran
     */
    @JsonProperty("dgShinsakaiIinIchiran")
    public DataGrid<dgShinsakaiIinIchiran_Row> getDgShinsakaiIinIchiran() {
        return dgShinsakaiIinIchiran;
    }

    /*
     * setdgShinsakaiIinIchiran
     * @param dgShinsakaiIinIchiran dgShinsakaiIinIchiran
     */
    @JsonProperty("dgShinsakaiIinIchiran")
    public void setDgShinsakaiIinIchiran(DataGrid<dgShinsakaiIinIchiran_Row> dgShinsakaiIinIchiran) {
        this.dgShinsakaiIinIchiran = dgShinsakaiIinIchiran;
    }

    // </editor-fold>
}
