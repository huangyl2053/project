package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.ShoKaishuKirokuKanri;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * panelKoufuList のクラスファイル 
 * 
 * @author 自動生成
 */
public class panelKoufuListDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：バージョン情報無し">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("dgKoufuKaishu")
    private DataGrid<dgKoufuKaishu_Row> dgKoufuKaishu;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getdgKoufuKaishu
     * @return dgKoufuKaishu
     */
    @JsonProperty("dgKoufuKaishu")
    public DataGrid<dgKoufuKaishu_Row> getDgKoufuKaishu() {
        return dgKoufuKaishu;
    }

    /*
     * setdgKoufuKaishu
     * @param dgKoufuKaishu dgKoufuKaishu
     */
    @JsonProperty("dgKoufuKaishu")
    public void setDgKoufuKaishu(DataGrid<dgKoufuKaishu_Row> dgKoufuKaishu) {
        this.dgKoufuKaishu = dgKoufuKaishu;
    }

    // </editor-fold>
}