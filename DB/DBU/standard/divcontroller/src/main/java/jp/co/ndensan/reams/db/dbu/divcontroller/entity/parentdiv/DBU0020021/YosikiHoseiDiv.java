package jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0020021;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBox;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxDate;

/**
 * YosikiHosei のクラスファイル
 *
 * @reamsid_L DBU-1100-060 zhangrui
 */
public class YosikiHoseiDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：バージョン情報無し">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtHokokuNengetsu")
    private TextBoxDate txtHokokuNengetsu;
    @JsonProperty("txtShukeiNengetsu")
    private TextBoxDate txtShukeiNengetsu;
    @JsonProperty("txtHokensyaCode")
    private TextBox txtHokensyaCode;
    @JsonProperty("txtHokensyaName")
    private TextBox txtHokensyaName;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * gettxtHokokuNengetsu
     * @return txtHokokuNengetsu
     */
    @JsonProperty("txtHokokuNengetsu")
    public TextBoxDate getTxtHokokuNengetsu() {
        return txtHokokuNengetsu;
    }

    /*
     * settxtHokokuNengetsu
     * @param txtHokokuNengetsu txtHokokuNengetsu
     */
    @JsonProperty("txtHokokuNengetsu")
    public void setTxtHokokuNengetsu(TextBoxDate txtHokokuNengetsu) {
        this.txtHokokuNengetsu = txtHokokuNengetsu;
    }

    /*
     * gettxtShukeiNengetsu
     * @return txtShukeiNengetsu
     */
    @JsonProperty("txtShukeiNengetsu")
    public TextBoxDate getTxtShukeiNengetsu() {
        return txtShukeiNengetsu;
    }

    /*
     * settxtShukeiNengetsu
     * @param txtShukeiNengetsu txtShukeiNengetsu
     */
    @JsonProperty("txtShukeiNengetsu")
    public void setTxtShukeiNengetsu(TextBoxDate txtShukeiNengetsu) {
        this.txtShukeiNengetsu = txtShukeiNengetsu;
    }

    /*
     * gettxtHokensyaCode
     * @return txtHokensyaCode
     */
    @JsonProperty("txtHokensyaCode")
    public TextBox getTxtHokensyaCode() {
        return txtHokensyaCode;
    }

    /*
     * settxtHokensyaCode
     * @param txtHokensyaCode txtHokensyaCode
     */
    @JsonProperty("txtHokensyaCode")
    public void setTxtHokensyaCode(TextBox txtHokensyaCode) {
        this.txtHokensyaCode = txtHokensyaCode;
    }

    /*
     * gettxtHokensyaName
     * @return txtHokensyaName
     */
    @JsonProperty("txtHokensyaName")
    public TextBox getTxtHokensyaName() {
        return txtHokensyaName;
    }

    /*
     * settxtHokensyaName
     * @param txtHokensyaName txtHokensyaName
     */
    @JsonProperty("txtHokensyaName")
    public void setTxtHokensyaName(TextBox txtHokensyaName) {
        this.txtHokensyaName = txtHokensyaName;
    }

    // </editor-fold>
}