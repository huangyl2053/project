package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE9010001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.DataGrid;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * ShujiiIchiran のクラスファイル 
 * @author 自動生成
 */
public class ShujiiIchiranDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnInsert")
    private Button btnInsert;
    @JsonProperty("btnOutputCsv")
    private Button btnOutputCsv;
    @JsonProperty("PanelShujiiIchiranBatchParameter")
    private PanelShujiiIchiranBatchParameterDiv PanelShujiiIchiranBatchParameter;

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
    public Button getBtnOutputCsv() {
        return btnOutputCsv;
    }

    /*
     * setbtnOutputCsv
     * @param btnOutputCsv btnOutputCsv
     */
    @JsonProperty("btnOutputCsv")
    public void setBtnOutputCsv(Button btnOutputCsv) {
        this.btnOutputCsv = btnOutputCsv;
    }

    /*
     * getPanelShujiiIchiranBatchParameter
     * @return PanelShujiiIchiranBatchParameter
     */
    @JsonProperty("PanelShujiiIchiranBatchParameter")
    public PanelShujiiIchiranBatchParameterDiv getPanelShujiiIchiranBatchParameter() {
        return PanelShujiiIchiranBatchParameter;
    }

    /*
     * setPanelShujiiIchiranBatchParameter
     * @param PanelShujiiIchiranBatchParameter PanelShujiiIchiranBatchParameter
     */
    @JsonProperty("PanelShujiiIchiranBatchParameter")
    public void setPanelShujiiIchiranBatchParameter(PanelShujiiIchiranBatchParameterDiv PanelShujiiIchiranBatchParameter) {
        this.PanelShujiiIchiranBatchParameter = PanelShujiiIchiranBatchParameter;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public DataGrid<dgShujiiIchiran_Row> getDgShujiiIchiran() {
        return this.getPanelShujiiIchiranBatchParameter().getDgShujiiIchiran();
    }

    @JsonIgnore
    public void  setDgShujiiIchiran(DataGrid<dgShujiiIchiran_Row> dgShujiiIchiran) {
        this.getPanelShujiiIchiranBatchParameter().setDgShujiiIchiran(dgShujiiIchiran);
    }

    // </editor-fold>
}
