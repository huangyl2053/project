package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE9050001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * SonotaKikanichiran のクラスファイル 
 * 
 * @author 自動生成
 */
public class SonotaKikanichiranDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2017-03-02_13-24-25">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnInsert")
    private Button btnInsert;
    @JsonProperty("btnOutputCsv")
    private ButtonDownLoad btnOutputCsv;
    @JsonProperty("btnCsvKozaNashi")
    private ButtonDownLoad btnCsvKozaNashi;
    @JsonProperty("btnCsvSpool")
    private Button btnCsvSpool;
    @JsonProperty("dgSonotaKikanIchiran")
    private DataGrid<dgSonotaKikanIchiran_Row> dgSonotaKikanIchiran;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnInsert
     * @return btnInsert
     */
    @JsonProperty("btnInsert")
    public Button getBtnInsert() {
        return btnInsert;
    }

    /*
     * setbtnInsert
     * @param btnInsert btnInsert
     */
    @JsonProperty("btnInsert")
    public void setBtnInsert(Button btnInsert) {
        this.btnInsert = btnInsert;
    }

    /*
     * getbtnOutputCsv
     * @return btnOutputCsv
     */
    @JsonProperty("btnOutputCsv")
    public ButtonDownLoad getBtnOutputCsv() {
        return btnOutputCsv;
    }

    /*
     * setbtnOutputCsv
     * @param btnOutputCsv btnOutputCsv
     */
    @JsonProperty("btnOutputCsv")
    public void setBtnOutputCsv(ButtonDownLoad btnOutputCsv) {
        this.btnOutputCsv = btnOutputCsv;
    }

    /*
     * getbtnCsvKozaNashi
     * @return btnCsvKozaNashi
     */
    @JsonProperty("btnCsvKozaNashi")
    public ButtonDownLoad getBtnCsvKozaNashi() {
        return btnCsvKozaNashi;
    }

    /*
     * setbtnCsvKozaNashi
     * @param btnCsvKozaNashi btnCsvKozaNashi
     */
    @JsonProperty("btnCsvKozaNashi")
    public void setBtnCsvKozaNashi(ButtonDownLoad btnCsvKozaNashi) {
        this.btnCsvKozaNashi = btnCsvKozaNashi;
    }

    /*
     * getbtnCsvSpool
     * @return btnCsvSpool
     */
    @JsonProperty("btnCsvSpool")
    public Button getBtnCsvSpool() {
        return btnCsvSpool;
    }

    /*
     * setbtnCsvSpool
     * @param btnCsvSpool btnCsvSpool
     */
    @JsonProperty("btnCsvSpool")
    public void setBtnCsvSpool(Button btnCsvSpool) {
        this.btnCsvSpool = btnCsvSpool;
    }

    /*
     * getdgSonotaKikanIchiran
     * @return dgSonotaKikanIchiran
     */
    @JsonProperty("dgSonotaKikanIchiran")
    public DataGrid<dgSonotaKikanIchiran_Row> getDgSonotaKikanIchiran() {
        return dgSonotaKikanIchiran;
    }

    /*
     * setdgSonotaKikanIchiran
     * @param dgSonotaKikanIchiran dgSonotaKikanIchiran
     */
    @JsonProperty("dgSonotaKikanIchiran")
    public void setDgSonotaKikanIchiran(DataGrid<dgSonotaKikanIchiran_Row> dgSonotaKikanIchiran) {
        this.dgSonotaKikanIchiran = dgSonotaKikanIchiran;
    }

    // </editor-fold>
}
