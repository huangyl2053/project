package jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0010011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * HokokuNendo のクラスファイル 
 * 
 * @author 自動生成
 */
public class HokokuNendoDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-07-28_11-34-20">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtHokokuYM")
    private TextBoxDate txtHokokuYM;
    @JsonProperty("btnKakutei")
    private Button btnKakutei;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * gettxtHokokuYM
     * @return txtHokokuYM
     */
    @JsonProperty("txtHokokuYM")
    public TextBoxDate getTxtHokokuYM() {
        return txtHokokuYM;
    }

    /*
     * settxtHokokuYM
     * @param txtHokokuYM txtHokokuYM
     */
    @JsonProperty("txtHokokuYM")
    public void setTxtHokokuYM(TextBoxDate txtHokokuYM) {
        this.txtHokokuYM = txtHokokuYM;
    }

    /*
     * getbtnKakutei
     * @return btnKakutei
     */
    @JsonProperty("btnKakutei")
    public Button getBtnKakutei() {
        return btnKakutei;
    }

    /*
     * setbtnKakutei
     * @param btnKakutei btnKakutei
     */
    @JsonProperty("btnKakutei")
    public void setBtnKakutei(Button btnKakutei) {
        this.btnKakutei = btnKakutei;
    }

    // </editor-fold>
}