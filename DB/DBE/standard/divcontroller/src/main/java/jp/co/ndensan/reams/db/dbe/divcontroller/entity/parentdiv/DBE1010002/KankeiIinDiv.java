package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE1010002;

/**
 * このコードはツールによって生成されました。 このファイルへの変更は、再生成時には損失するため 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.DataGrid;
import jp.co.ndensan.reams.uz.uza.ui.binding.Label;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * KankeiIin のクラスファイル
 *
 * @author 自動生成
 */
public class KankeiIinDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */

    @JsonProperty("lblExplanationForKankeiIin")
    private Label lblExplanationForKankeiIin;
    @JsonProperty("btnToAddKankeiIin")
    private Button btnToAddKankeiIin;
    @JsonProperty("dgKankeiIin")
    private DataGrid<dgKankeiIin_Row> dgKankeiIin;
    @JsonProperty("EditShinsakaiIin")
    private EditShinsakaiIinDiv EditShinsakaiIin;
    @JsonProperty("kankeiIinGridSelectedRow")
    private RString kankeiIinGridSelectedRow;
    @JsonProperty("decideFlag")
    private RString decideFlag;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("lblExplanationForKankeiIin")
    public Label getLblExplanationForKankeiIin() {
        return lblExplanationForKankeiIin;
    }

    @JsonProperty("lblExplanationForKankeiIin")
    public void setLblExplanationForKankeiIin(Label lblExplanationForKankeiIin) {
        this.lblExplanationForKankeiIin = lblExplanationForKankeiIin;
    }

    @JsonProperty("btnToAddKankeiIin")
    public Button getBtnToAddKankeiIin() {
        return btnToAddKankeiIin;
    }

    @JsonProperty("btnToAddKankeiIin")
    public void setBtnToAddKankeiIin(Button btnToAddKankeiIin) {
        this.btnToAddKankeiIin = btnToAddKankeiIin;
    }

    @JsonProperty("dgKankeiIin")
    public DataGrid<dgKankeiIin_Row> getDgKankeiIin() {
        return dgKankeiIin;
    }

    @JsonProperty("dgKankeiIin")
    public void setDgKankeiIin(DataGrid<dgKankeiIin_Row> dgKankeiIin) {
        this.dgKankeiIin = dgKankeiIin;
    }

    @JsonProperty("EditShinsakaiIin")
    public EditShinsakaiIinDiv getEditShinsakaiIin() {
        return EditShinsakaiIin;
    }

    @JsonProperty("EditShinsakaiIin")
    public void setEditShinsakaiIin(EditShinsakaiIinDiv EditShinsakaiIin) {
        this.EditShinsakaiIin = EditShinsakaiIin;
    }

    @JsonProperty("kankeiIinGridSelectedRow")
    public RString getKankeiIinGridSelectedRow() {
        return kankeiIinGridSelectedRow;
    }

    @JsonProperty("kankeiIinGridSelectedRow")
    public void setKankeiIinGridSelectedRow(RString kankeiIinGridSelectedRow) {
        this.kankeiIinGridSelectedRow = kankeiIinGridSelectedRow;
    }

    @JsonProperty("decideFlag")
    public RString getDecideFlag() {
        return decideFlag;
    }

    @JsonProperty("decideFlag")
    public void setDecideFlag(RString decideFlag) {
        this.decideFlag = decideFlag;
    }

}
