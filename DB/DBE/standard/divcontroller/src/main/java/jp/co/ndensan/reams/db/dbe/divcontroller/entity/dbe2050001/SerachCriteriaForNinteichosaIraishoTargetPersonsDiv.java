package jp.co.ndensan.reams.db.dbe.divcontroller.entity.dbe2050001;
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
 * SerachCriteriaForNinteichosaIraishoTargetPersons のクラスファイル 
 * 
 * @author 自動生成
 */
public class SerachCriteriaForNinteichosaIraishoTargetPersonsDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtChosaIraiDateRange")
    private TextBoxDateRange txtChosaIraiDateRange;
    @JsonProperty("txtShinseiDateRangeOfChosa")
    private TextBoxDateRange txtShinseiDateRangeOfChosa;
    @JsonProperty("chkNinteichosaIraishoHakkoExistence")
    private CheckBoxList chkNinteichosaIraishoHakkoExistence;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtChosaIraiDateRange")
    public TextBoxDateRange getTxtChosaIraiDateRange() {
        return txtChosaIraiDateRange;
    }

    @JsonProperty("txtChosaIraiDateRange")
    public void setTxtChosaIraiDateRange(TextBoxDateRange txtChosaIraiDateRange) {
        this.txtChosaIraiDateRange=txtChosaIraiDateRange;
    }

    @JsonProperty("txtShinseiDateRangeOfChosa")
    public TextBoxDateRange getTxtShinseiDateRangeOfChosa() {
        return txtShinseiDateRangeOfChosa;
    }

    @JsonProperty("txtShinseiDateRangeOfChosa")
    public void setTxtShinseiDateRangeOfChosa(TextBoxDateRange txtShinseiDateRangeOfChosa) {
        this.txtShinseiDateRangeOfChosa=txtShinseiDateRangeOfChosa;
    }

    @JsonProperty("chkNinteichosaIraishoHakkoExistence")
    public CheckBoxList getChkNinteichosaIraishoHakkoExistence() {
        return chkNinteichosaIraishoHakkoExistence;
    }

    @JsonProperty("chkNinteichosaIraishoHakkoExistence")
    public void setChkNinteichosaIraishoHakkoExistence(CheckBoxList chkNinteichosaIraishoHakkoExistence) {
        this.chkNinteichosaIraishoHakkoExistence=chkNinteichosaIraishoHakkoExistence;
    }

}