package jp.co.ndensan.reams.db.dbc.divcontroller.entity.DBC0810000;

/**
 * このコードはツールによって生成されました。 このファイルへの変更は、再生成時には損失するため 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.ServiceTeikyoShomeishoShukeiList.ServiceTeikyoShomeishoShukeiListDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.TabPanel;

/**
 * ShokanShikyuKetteiShomeishoShukei のクラスファイル
 *
 * @author 自動生成
 */
public class ShokanShikyuKetteiShomeishoShukeiDiv extends TabPanel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */

    @JsonProperty("ShokanShikyuKetteiShomeishoShukeiListInfo")
    private ServiceTeikyoShomeishoShukeiListDiv ShokanShikyuKetteiShomeishoShukeiListInfo;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("ShokanShikyuKetteiShomeishoShukeiListInfo")
    public ServiceTeikyoShomeishoShukeiListDiv getShokanShikyuKetteiShomeishoShukeiListInfo() {
        return ShokanShikyuKetteiShomeishoShukeiListInfo;
    }

    @JsonProperty("ShokanShikyuKetteiShomeishoShukeiListInfo")
    public void setShokanShikyuKetteiShomeishoShukeiListInfo(ServiceTeikyoShomeishoShukeiListDiv ShokanShikyuKetteiShomeishoShukeiListInfo) {
        this.ShokanShikyuKetteiShomeishoShukeiListInfo = ShokanShikyuKetteiShomeishoShukeiListInfo;
    }

}