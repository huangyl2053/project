package jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA1010011;
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
 * SeikatsuHogo のクラスファイル
 *
 * @reamsid_L DBA-0520-030 wangkun
 */
public class SeikatsuHogoDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：Uz-master-49">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnAddSeikatsuHogo")
    private Button btnAddSeikatsuHogo;
    @JsonProperty("dgSeikatsuHogoRireki")
    private DataGrid<dgSeikatsuHogoRireki_Row> dgSeikatsuHogoRireki;
    @JsonProperty("SeikatsuHogoInput")
    private SeikatsuHogoInputDiv SeikatsuHogoInput;
    @JsonProperty("btnUpdataSeikatsuHogo")
    private Button btnUpdataSeikatsuHogo;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("btnAddSeikatsuHogo")
    public Button getBtnAddSeikatsuHogo() {
        return btnAddSeikatsuHogo;
    }

    @JsonProperty("btnAddSeikatsuHogo")
    public void setBtnAddSeikatsuHogo(Button btnAddSeikatsuHogo) {
        this.btnAddSeikatsuHogo = btnAddSeikatsuHogo;
    }

    @JsonProperty("dgSeikatsuHogoRireki")
    public DataGrid<dgSeikatsuHogoRireki_Row> getDgSeikatsuHogoRireki() {
        return dgSeikatsuHogoRireki;
    }

    @JsonProperty("dgSeikatsuHogoRireki")
    public void setDgSeikatsuHogoRireki(DataGrid<dgSeikatsuHogoRireki_Row> dgSeikatsuHogoRireki) {
        this.dgSeikatsuHogoRireki = dgSeikatsuHogoRireki;
    }

    @JsonProperty("SeikatsuHogoInput")
    public SeikatsuHogoInputDiv getSeikatsuHogoInput() {
        return SeikatsuHogoInput;
    }

    @JsonProperty("SeikatsuHogoInput")
    public void setSeikatsuHogoInput(SeikatsuHogoInputDiv SeikatsuHogoInput) {
        this.SeikatsuHogoInput = SeikatsuHogoInput;
    }

    @JsonProperty("btnUpdataSeikatsuHogo")
    public Button getBtnUpdataSeikatsuHogo() {
        return btnUpdataSeikatsuHogo;
    }

    @JsonProperty("btnUpdataSeikatsuHogo")
    public void setBtnUpdataSeikatsuHogo(Button btnUpdataSeikatsuHogo) {
        this.btnUpdataSeikatsuHogo = btnUpdataSeikatsuHogo;
    }

    // </editor-fold>
}
