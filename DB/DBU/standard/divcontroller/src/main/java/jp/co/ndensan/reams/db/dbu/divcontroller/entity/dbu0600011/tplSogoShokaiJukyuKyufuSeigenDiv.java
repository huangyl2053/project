package jp.co.ndensan.reams.db.dbu.divcontroller.entity.dbu0600011;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbu.divcontroller.entity.dbu0600011.dgSogoShokaiJukyuKyufuSeigenList_Row;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.TabPanel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * tplSogoShokaiJukyuKyufuSeigen のクラスファイル 
 * 
 * @author 自動生成
 */
public class tplSogoShokaiJukyuKyufuSeigenDiv extends TabPanel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("dgSogoShokaiJukyuKyufuSeigenList")
    private DataGrid<dgSogoShokaiJukyuKyufuSeigenList_Row> dgSogoShokaiJukyuKyufuSeigenList;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("dgSogoShokaiJukyuKyufuSeigenList")
    public DataGrid<dgSogoShokaiJukyuKyufuSeigenList_Row> getDgSogoShokaiJukyuKyufuSeigenList() {
        return dgSogoShokaiJukyuKyufuSeigenList;
    }

    @JsonProperty("dgSogoShokaiJukyuKyufuSeigenList")
    public void setDgSogoShokaiJukyuKyufuSeigenList(DataGrid<dgSogoShokaiJukyuKyufuSeigenList_Row> dgSogoShokaiJukyuKyufuSeigenList) {
        this.dgSogoShokaiJukyuKyufuSeigenList=dgSogoShokaiJukyuKyufuSeigenList;
    }

}