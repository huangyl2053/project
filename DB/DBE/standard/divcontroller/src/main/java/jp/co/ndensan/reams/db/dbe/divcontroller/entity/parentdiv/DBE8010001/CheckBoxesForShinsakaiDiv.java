package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE8010001;
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
 * CheckBoxesForShinsakai のクラスファイル 
 * 
 * @author 自動生成
 */
public class CheckBoxesForShinsakaiDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("chkShinsakaiWariate")
    private CheckBoxList chkShinsakaiWariate;
    @JsonProperty("chkShinsakaiJisshi")
    private CheckBoxList chkShinsakaiJisshi;
    @JsonProperty("lblPadding3")
    private Label lblPadding3;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("chkShinsakaiWariate")
    public CheckBoxList getChkShinsakaiWariate() {
        return chkShinsakaiWariate;
    }

    @JsonProperty("chkShinsakaiWariate")
    public void setChkShinsakaiWariate(CheckBoxList chkShinsakaiWariate) {
        this.chkShinsakaiWariate=chkShinsakaiWariate;
    }

    @JsonProperty("chkShinsakaiJisshi")
    public CheckBoxList getChkShinsakaiJisshi() {
        return chkShinsakaiJisshi;
    }

    @JsonProperty("chkShinsakaiJisshi")
    public void setChkShinsakaiJisshi(CheckBoxList chkShinsakaiJisshi) {
        this.chkShinsakaiJisshi=chkShinsakaiJisshi;
    }

    @JsonProperty("lblPadding3")
    public Label getLblPadding3() {
        return lblPadding3;
    }

    @JsonProperty("lblPadding3")
    public void setLblPadding3(Label lblPadding3) {
        this.lblPadding3=lblPadding3;
    }

}
