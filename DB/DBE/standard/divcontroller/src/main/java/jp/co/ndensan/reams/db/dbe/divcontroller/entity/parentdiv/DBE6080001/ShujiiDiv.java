package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE6080001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * Shujii のクラスファイル 
 * 
 * @author 自動生成
 */
public class ShujiiDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-05-30_13-18-33">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("dgShujii")
    private DataGrid<dgShujii_Row> dgShujii;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getdgShujii
     * @return dgShujii
     */
    @JsonProperty("dgShujii")
    public DataGrid<dgShujii_Row> getDgShujii() {
        return dgShujii;
    }

    /*
     * setdgShujii
     * @param dgShujii dgShujii
     */
    @JsonProperty("dgShujii")
    public void setDgShujii(DataGrid<dgShujii_Row> dgShujii) {
        this.dgShujii = dgShujii;
    }

    // </editor-fold>
}