package jp.co.ndensan.reams.db.dbd.divcontroller.entity.parentdiv.DBD4920001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.hokenshalist.HokenshaList.HokenshaListDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.hokenshalist.HokenshaList.IHokenshaListDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * YogaigoNinteiKekkaRenkeiDataTorikomi のクラスファイル 
 * 
 * @author 自動生成
 */
public class YogaigoNinteiKekkaRenkeiDataTorikomiDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-08-21_20-30-14">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter")
    private YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameterDiv YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter;
    @JsonProperty("torikomiichiran")
    private torikomiichiranDiv torikomiichiran;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getYogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter
     * @return YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter
     */
    @JsonProperty("YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter")
    public YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameterDiv getYogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter() {
        return YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter;
    }

    /*
     * setYogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter
     * @param YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter
     */
    @JsonProperty("YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter")
    public void setYogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter(YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameterDiv YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter) {
        this.YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter = YogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter;
    }

    /*
     * gettorikomiichiran
     * @return torikomiichiran
     */
    @JsonProperty("torikomiichiran")
    public torikomiichiranDiv getTorikomiichiran() {
        return torikomiichiran;
    }

    /*
     * settorikomiichiran
     * @param torikomiichiran torikomiichiran
     */
    @JsonProperty("torikomiichiran")
    public void setTorikomiichiran(torikomiichiranDiv torikomiichiran) {
        this.torikomiichiran = torikomiichiran;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public RadioButton getRadDataSelect() {
        return this.getYogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter().getRadDataSelect();
    }

    @JsonIgnore
    public void  setRadDataSelect(RadioButton radDataSelect) {
        this.getYogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter().setRadDataSelect(radDataSelect);
    }

    @JsonIgnore
    public RadioButton getRadIfType() {
        return this.getYogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter().getRadIfType();
    }

    @JsonIgnore
    public void  setRadIfType(RadioButton radIfType) {
        this.getYogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter().setRadIfType(radIfType);
    }

    @JsonIgnore
    public DataGrid<DataGridFile_Row> getDataGridFile() {
        return this.getYogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter().getDataGridFile();
    }

    @JsonIgnore
    public void  setDataGridFile(DataGrid<DataGridFile_Row> DataGridFile) {
        this.getYogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter().setDataGridFile(DataGridFile);
    }

    @JsonIgnore
    public Button getBtnDataInput() {
        return this.getYogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter().getBtnDataInput();
    }

    @JsonIgnore
    public void  setBtnDataInput(Button BtnDataInput) {
        this.getYogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter().setBtnDataInput(BtnDataInput);
    }

    @JsonIgnore
    public IHokenshaListDiv getHokenshaList() {
        return this.getYogaigoNinteiKekkaRenkeiDataTorikomiBatchParameter().getHokenshaList();
    }

    @JsonIgnore
    public DataGrid<dgtorikomidataichiran_Row> getDgtorikomidataichiran() {
        return this.getTorikomiichiran().getDgtorikomidataichiran();
    }

    @JsonIgnore
    public void  setDgtorikomidataichiran(DataGrid<dgtorikomidataichiran_Row> dgtorikomidataichiran) {
        this.getTorikomiichiran().setDgtorikomidataichiran(dgtorikomidataichiran);
    }

    // </editor-fold>
}