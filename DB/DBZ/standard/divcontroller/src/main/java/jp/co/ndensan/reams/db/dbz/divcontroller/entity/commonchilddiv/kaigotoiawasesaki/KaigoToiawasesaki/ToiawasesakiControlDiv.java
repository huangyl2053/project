package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.kaigotoiawasesaki.KaigoToiawasesaki;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * ToiawasesakiControl のクラスファイル 
 * 
 * @author 自動生成
 */
public class ToiawasesakiControlDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-05-30_13-18-33">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnAddChohyoDokuji")
    private Button btnAddChohyoDokuji;
    @JsonProperty("dgToiawasesakiControl")
    private DataGrid<dgToiawasesakiControl_Row> dgToiawasesakiControl;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnAddChohyoDokuji
     * @return btnAddChohyoDokuji
     */
    @JsonProperty("btnAddChohyoDokuji")
    public Button getBtnAddChohyoDokuji() {
        return btnAddChohyoDokuji;
    }

    /*
     * setbtnAddChohyoDokuji
     * @param btnAddChohyoDokuji btnAddChohyoDokuji
     */
    @JsonProperty("btnAddChohyoDokuji")
    public void setBtnAddChohyoDokuji(Button btnAddChohyoDokuji) {
        this.btnAddChohyoDokuji = btnAddChohyoDokuji;
    }

    /*
     * getdgToiawasesakiControl
     * @return dgToiawasesakiControl
     */
    @JsonProperty("dgToiawasesakiControl")
    public DataGrid<dgToiawasesakiControl_Row> getDgToiawasesakiControl() {
        return dgToiawasesakiControl;
    }

    /*
     * setdgToiawasesakiControl
     * @param dgToiawasesakiControl dgToiawasesakiControl
     */
    @JsonProperty("dgToiawasesakiControl")
    public void setDgToiawasesakiControl(DataGrid<dgToiawasesakiControl_Row> dgToiawasesakiControl) {
        this.dgToiawasesakiControl = dgToiawasesakiControl;
    }

    // </editor-fold>
}
