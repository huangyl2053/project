package jp.co.ndensan.reams.db.dbd.divcontroller.entity.parentdiv.DBD5110001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * YukokikanTo のクラスファイル 
 * 
 * @author 自動生成
 */
public class YukokikanToDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-05-30_13-18-33">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("spSpace2")
    private Space spSpace2;
    @JsonProperty("txtInsatsuDate")
    private TextBoxYearMonth txtInsatsuDate;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getspSpace2
     * @return spSpace2
     */
    @JsonProperty("spSpace2")
    public Space getSpSpace2() {
        return spSpace2;
    }

    /*
     * setspSpace2
     * @param spSpace2 spSpace2
     */
    @JsonProperty("spSpace2")
    public void setSpSpace2(Space spSpace2) {
        this.spSpace2 = spSpace2;
    }

    /*
     * gettxtInsatsuDate
     * @return txtInsatsuDate
     */
    @JsonProperty("txtInsatsuDate")
    public TextBoxYearMonth getTxtInsatsuDate() {
        return txtInsatsuDate;
    }

    /*
     * settxtInsatsuDate
     * @param txtInsatsuDate txtInsatsuDate
     */
    @JsonProperty("txtInsatsuDate")
    public void setTxtInsatsuDate(TextBoxYearMonth txtInsatsuDate) {
        this.txtInsatsuDate = txtInsatsuDate;
    }

    // </editor-fold>
}