package jp.co.ndensan.reams.db.dbb.divcontroller.entity.DBB0320005;
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
 * zanteihokenryoHeightKari2 のクラスファイル 
 * 
 * @author 自動生成
 */
public class zanteihokenryoHeightKari2Div extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtZanteihokenryoHeightKari2")
    private TextBox txtZanteihokenryoHeightKari2;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtZanteihokenryoHeightKari2")
    public TextBox getTxtZanteihokenryoHeightKari2() {
        return txtZanteihokenryoHeightKari2;
    }

    @JsonProperty("txtZanteihokenryoHeightKari2")
    public void setTxtZanteihokenryoHeightKari2(TextBox txtZanteihokenryoHeightKari2) {
        this.txtZanteihokenryoHeightKari2=txtZanteihokenryoHeightKari2;
    }

}
