package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.dbe8020001;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * KihonChosa1gun のクラスファイル 
 * 
 * @author 自動生成
 */
public class KihonChosa1gunDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("lblKihonChosa1gun")
    private Label lblKihonChosa1gun;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("lblKihonChosa1gun")
    public Label getLblKihonChosa1gun() {
        return lblKihonChosa1gun;
    }

    @JsonProperty("lblKihonChosa1gun")
    public void setLblKihonChosa1gun(Label lblKihonChosa1gun) {
        this.lblKihonChosa1gun=lblKihonChosa1gun;
    }

}