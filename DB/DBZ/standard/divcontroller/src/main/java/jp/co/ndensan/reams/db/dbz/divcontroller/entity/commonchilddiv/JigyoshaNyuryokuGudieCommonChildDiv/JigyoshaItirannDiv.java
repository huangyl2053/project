package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.JigyoshaNyuryokuGudieCommonChildDiv;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * JigyoshaItirann のクラスファイル 
 * 
 * @author 自動生成
 */
public class JigyoshaItirannDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：バージョン情報無し">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("dgJigyoshaItiran")
    private DataGrid<dgJigyoshaItiran_Row> dgJigyoshaItiran;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getdgJigyoshaItiran
     * @return dgJigyoshaItiran
     */
    @JsonProperty("dgJigyoshaItiran")
    public DataGrid<dgJigyoshaItiran_Row> getDgJigyoshaItiran() {
        return dgJigyoshaItiran;
    }

    /*
     * setdgJigyoshaItiran
     * @param dgJigyoshaItiran dgJigyoshaItiran
     */
    @JsonProperty("dgJigyoshaItiran")
    public void setDgJigyoshaItiran(DataGrid<dgJigyoshaItiran_Row> dgJigyoshaItiran) {
        this.dgJigyoshaItiran = dgJigyoshaItiran;
    }

    // </editor-fold>
}
