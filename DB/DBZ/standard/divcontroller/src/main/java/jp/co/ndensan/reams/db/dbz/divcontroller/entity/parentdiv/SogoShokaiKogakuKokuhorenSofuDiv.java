package jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv;
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
 * SogoShokaiKogakuKokuhorenSofu のクラスファイル 
 * 
 * @author 自動生成
 */
public class SogoShokaiKogakuKokuhorenSofuDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtKogakuKokuhorenSofuYM")
    private TextBoxDate txtKogakuKokuhorenSofuYM;
    @JsonProperty("txtKogakuKokuhorenUketoriYM")
    private TextBoxDate txtKogakuKokuhorenUketoriYM;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtKogakuKokuhorenSofuYM")
    public TextBoxDate getTxtKogakuKokuhorenSofuYM() {
        return txtKogakuKokuhorenSofuYM;
    }

    @JsonProperty("txtKogakuKokuhorenSofuYM")
    public void setTxtKogakuKokuhorenSofuYM(TextBoxDate txtKogakuKokuhorenSofuYM) {
        this.txtKogakuKokuhorenSofuYM=txtKogakuKokuhorenSofuYM;
    }

    @JsonProperty("txtKogakuKokuhorenUketoriYM")
    public TextBoxDate getTxtKogakuKokuhorenUketoriYM() {
        return txtKogakuKokuhorenUketoriYM;
    }

    @JsonProperty("txtKogakuKokuhorenUketoriYM")
    public void setTxtKogakuKokuhorenUketoriYM(TextBoxDate txtKogakuKokuhorenUketoriYM) {
        this.txtKogakuKokuhorenUketoriYM=txtKogakuKokuhorenUketoriYM;
    }

}