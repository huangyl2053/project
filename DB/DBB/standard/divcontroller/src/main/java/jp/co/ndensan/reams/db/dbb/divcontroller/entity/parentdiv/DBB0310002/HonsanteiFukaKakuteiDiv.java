package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0310002;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0310002.HonsanteiShoriNichijiDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * HonsanteiFukaKakutei のクラスファイル 
 * 
 * @author 自動生成
 */
public class HonsanteiFukaKakuteiDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("lblHonsanteiKakuteiMsg")
    private Label lblHonsanteiKakuteiMsg;
    @JsonProperty("HonsanteiShoriNichiji")
    private HonsanteiShoriNichijiDiv HonsanteiShoriNichiji;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("lblHonsanteiKakuteiMsg")
    public Label getLblHonsanteiKakuteiMsg() {
        return lblHonsanteiKakuteiMsg;
    }

    @JsonProperty("lblHonsanteiKakuteiMsg")
    public void setLblHonsanteiKakuteiMsg(Label lblHonsanteiKakuteiMsg) {
        this.lblHonsanteiKakuteiMsg=lblHonsanteiKakuteiMsg;
    }

    @JsonProperty("HonsanteiShoriNichiji")
    public HonsanteiShoriNichijiDiv getHonsanteiShoriNichiji() {
        return HonsanteiShoriNichiji;
    }

    @JsonProperty("HonsanteiShoriNichiji")
    public void setHonsanteiShoriNichiji(HonsanteiShoriNichijiDiv HonsanteiShoriNichiji) {
        this.HonsanteiShoriNichiji=HonsanteiShoriNichiji;
    }

}
