package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE7010002;
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
 * TermBusinessYear のクラスファイル 
 * 
 * @author 自動生成
 */
public class TermBusinessYearDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtBusinessYuear")
    private TextBoxDate txtBusinessYuear;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtBusinessYuear")
    public TextBoxDate getTxtBusinessYuear() {
        return txtBusinessYuear;
    }

    @JsonProperty("txtBusinessYuear")
    public void setTxtBusinessYuear(TextBoxDate txtBusinessYuear) {
        this.txtBusinessYuear=txtBusinessYuear;
    }

}
