package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC1400011;

/**
 * このコードはツールによって生成されました。 このファイルへの変更は、再生成時には損失するため 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC1400011.dgHihokenshaSearchGaitosha_Row;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * KyufuJissekiGaitoshaListPanel のクラスファイル
 *
 * @author 自動生成
 */
public class KyufuJissekiGaitoshaListPanelDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */

    @JsonProperty("dgHihokenshaSearchGaitosha")
    private DataGrid<dgHihokenshaSearchGaitosha_Row> dgHihokenshaSearchGaitosha;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("dgHihokenshaSearchGaitosha")
    public DataGrid<dgHihokenshaSearchGaitosha_Row> getDgHihokenshaSearchGaitosha() {
        return dgHihokenshaSearchGaitosha;
    }

    @JsonProperty("dgHihokenshaSearchGaitosha")
    public void setDgHihokenshaSearchGaitosha(DataGrid<dgHihokenshaSearchGaitosha_Row> dgHihokenshaSearchGaitosha) {
        this.dgHihokenshaSearchGaitosha = dgHihokenshaSearchGaitosha;
    }
}
