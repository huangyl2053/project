package jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA4010013;

/**
 * このコードはツールによって生成されました。 このファイルへの変更は、再生成時には損失するため 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.ShisetsuNyutaishoRirekiKanri.IShisetsuNyutaishoRirekiKanriDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.ShisetsuNyutaishoRirekiKanri.ShisetsuNyutaishoRirekiKanriDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.TabPanel;

/**
 * TabPanel1 のクラスファイル
 *
 * @author 自動生成
 */
public class TabPanel1Div extends TabPanel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */

    @JsonProperty("CommonChildDiv1")
    private ShisetsuNyutaishoRirekiKanriDiv CommonChildDiv1;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("CommonChildDiv1")
    public IShisetsuNyutaishoRirekiKanriDiv getCommonChildDiv1() {
        return CommonChildDiv1;
    }

}
