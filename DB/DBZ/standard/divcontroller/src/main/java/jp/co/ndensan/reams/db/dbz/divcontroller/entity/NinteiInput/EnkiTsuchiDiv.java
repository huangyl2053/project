package jp.co.ndensan.reams.db.dbz.divcontroller.entity.NinteiInput;
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
 * EnkiTsuchi のクラスファイル 
 * 
 * @author 自動生成
 */
public class EnkiTsuchiDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtEnkiTsuchiHakkoDay")
    private TextBoxDate txtEnkiTsuchiHakkoDay;
    @JsonProperty("txtEnkiTsuchiHakkoCount")
    private TextBoxNum txtEnkiTsuchiHakkoCount;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtEnkiTsuchiHakkoDay")
    public TextBoxDate getTxtEnkiTsuchiHakkoDay() {
        return txtEnkiTsuchiHakkoDay;
    }

    @JsonProperty("txtEnkiTsuchiHakkoDay")
    public void setTxtEnkiTsuchiHakkoDay(TextBoxDate txtEnkiTsuchiHakkoDay) {
        this.txtEnkiTsuchiHakkoDay=txtEnkiTsuchiHakkoDay;
    }

    @JsonProperty("txtEnkiTsuchiHakkoCount")
    public TextBoxNum getTxtEnkiTsuchiHakkoCount() {
        return txtEnkiTsuchiHakkoCount;
    }

    @JsonProperty("txtEnkiTsuchiHakkoCount")
    public void setTxtEnkiTsuchiHakkoCount(TextBoxNum txtEnkiTsuchiHakkoCount) {
        this.txtEnkiTsuchiHakkoCount=txtEnkiTsuchiHakkoCount;
    }

}
