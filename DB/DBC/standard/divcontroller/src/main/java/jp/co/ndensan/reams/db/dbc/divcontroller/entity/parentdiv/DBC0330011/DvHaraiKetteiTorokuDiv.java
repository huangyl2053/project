package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0330011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * DvHaraiKetteiToroku のクラスファイル 
 * 
 * @author 自動生成
 */
public class DvHaraiKetteiTorokuDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-08-09_21-40-56">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnTorokuSeitaiIchiran")
    private ButtonDialog btnTorokuSeitaiIchiran;
    @JsonProperty("linLine2")
    private HorizontalLine linLine2;
    @JsonProperty("dgHaraiKettei")
    private DataGrid<dgHaraiKettei_Row> dgHaraiKettei;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnTorokuSeitaiIchiran
     * @return btnTorokuSeitaiIchiran
     */
    @JsonProperty("btnTorokuSeitaiIchiran")
    public ButtonDialog getBtnTorokuSeitaiIchiran() {
        return btnTorokuSeitaiIchiran;
    }

    /*
     * setbtnTorokuSeitaiIchiran
     * @param btnTorokuSeitaiIchiran btnTorokuSeitaiIchiran
     */
    @JsonProperty("btnTorokuSeitaiIchiran")
    public void setBtnTorokuSeitaiIchiran(ButtonDialog btnTorokuSeitaiIchiran) {
        this.btnTorokuSeitaiIchiran = btnTorokuSeitaiIchiran;
    }

    /*
     * getlinLine2
     * @return linLine2
     */
    @JsonProperty("linLine2")
    public HorizontalLine getLinLine2() {
        return linLine2;
    }

    /*
     * setlinLine2
     * @param linLine2 linLine2
     */
    @JsonProperty("linLine2")
    public void setLinLine2(HorizontalLine linLine2) {
        this.linLine2 = linLine2;
    }

    /*
     * getdgHaraiKettei
     * @return dgHaraiKettei
     */
    @JsonProperty("dgHaraiKettei")
    public DataGrid<dgHaraiKettei_Row> getDgHaraiKettei() {
        return dgHaraiKettei;
    }

    /*
     * setdgHaraiKettei
     * @param dgHaraiKettei dgHaraiKettei
     */
    @JsonProperty("dgHaraiKettei")
    public void setDgHaraiKettei(DataGrid<dgHaraiKettei_Row> dgHaraiKettei) {
        this.dgHaraiKettei = dgHaraiKettei;
    }

    // </editor-fold>
}
