package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0820029;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * ShokujiHiyoPanel のクラスファイル 
 * 
 * @author 自動生成
 */
public class ShokujiHiyoPanelDiv extends Panel {
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
    @JsonProperty("panelShokuji")
    private panelShokujiDiv panelShokuji;
    @JsonProperty("RowId")
    private RString RowId;

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
     * getpanelShokuji
     * @return panelShokuji
     */
    @JsonProperty("panelShokuji")
    public panelShokujiDiv getPanelShokuji() {
        return panelShokuji;
    }

    /*
     * setpanelShokuji
     * @param panelShokuji panelShokuji
     */
    @JsonProperty("panelShokuji")
    public void setPanelShokuji(panelShokujiDiv panelShokuji) {
        this.panelShokuji = panelShokuji;
    }

    /*
     * getRowId
     * @return RowId
     */
    @JsonProperty("RowId")
    public RString getRowId() {
        return RowId;
    }

    /*
     * setRowId
     * @param RowId RowId
     */
    @JsonProperty("RowId")
    public void setRowId(RString RowId) {
        this.RowId = RowId;
    }

    // </editor-fold>
}
