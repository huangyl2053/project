package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.dbe2050001;
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
 * SearchButtonsForShujiiIkenshoIraishoTargetPersons のクラスファイル 
 * 
 * @author 自動生成
 */
public class SearchButtonsForShujiiIkenshoIraishoTargetPersonsDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnToClearCriteriaOfIkensho")
    private Button btnToClearCriteriaOfIkensho;
    @JsonProperty("btnToSearchOfIkensho")
    private Button btnToSearchOfIkensho;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("btnToClearCriteriaOfIkensho")
    public Button getBtnToClearCriteriaOfIkensho() {
        return btnToClearCriteriaOfIkensho;
    }

    @JsonProperty("btnToClearCriteriaOfIkensho")
    public void setBtnToClearCriteriaOfIkensho(Button btnToClearCriteriaOfIkensho) {
        this.btnToClearCriteriaOfIkensho=btnToClearCriteriaOfIkensho;
    }

    @JsonProperty("btnToSearchOfIkensho")
    public Button getBtnToSearchOfIkensho() {
        return btnToSearchOfIkensho;
    }

    @JsonProperty("btnToSearchOfIkensho")
    public void setBtnToSearchOfIkensho(Button btnToSearchOfIkensho) {
        this.btnToSearchOfIkensho=btnToSearchOfIkensho;
    }

}