package jp.co.ndensan.reams.db.dbd.divcontroller.entity.commonchilddiv.TokubetsuChiikiKasanGemmen.TokubetsuChiikiKasanGemmen;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * TokubetsuChiikiKasanGemmenRiyoshaFutan のクラスファイル 
 * 
 * @author 自動生成
 */
public class TokubetsuChiikiKasanGemmenRiyoshaFutanDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-05-30_13-18-33">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtKetteiDate")
    private TextBoxFlexibleDate txtKetteiDate;
    @JsonProperty("txtKetteiKubun")
    private TextBox txtKetteiKubun;
    @JsonProperty("txtTekiyoDate")
    private TextBoxFlexibleDate txtTekiyoDate;
    @JsonProperty("txtYukokigenDate")
    private TextBoxFlexibleDate txtYukokigenDate;
    @JsonProperty("txtGengakuRitsu")
    private TextBoxNum txtGengakuRitsu;
    @JsonProperty("txtKakuninNo")
    private TextBoxCode txtKakuninNo;
    @JsonProperty("txtFushoninRiyu")
    private TextBoxMultiLine txtFushoninRiyu;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * gettxtKetteiDate
     * @return txtKetteiDate
     */
    @JsonProperty("txtKetteiDate")
    public TextBoxFlexibleDate getTxtKetteiDate() {
        return txtKetteiDate;
    }

    /*
     * settxtKetteiDate
     * @param txtKetteiDate txtKetteiDate
     */
    @JsonProperty("txtKetteiDate")
    public void setTxtKetteiDate(TextBoxFlexibleDate txtKetteiDate) {
        this.txtKetteiDate = txtKetteiDate;
    }

    /*
     * gettxtKetteiKubun
     * @return txtKetteiKubun
     */
    @JsonProperty("txtKetteiKubun")
    public TextBox getTxtKetteiKubun() {
        return txtKetteiKubun;
    }

    /*
     * settxtKetteiKubun
     * @param txtKetteiKubun txtKetteiKubun
     */
    @JsonProperty("txtKetteiKubun")
    public void setTxtKetteiKubun(TextBox txtKetteiKubun) {
        this.txtKetteiKubun = txtKetteiKubun;
    }

    /*
     * gettxtTekiyoDate
     * @return txtTekiyoDate
     */
    @JsonProperty("txtTekiyoDate")
    public TextBoxFlexibleDate getTxtTekiyoDate() {
        return txtTekiyoDate;
    }

    /*
     * settxtTekiyoDate
     * @param txtTekiyoDate txtTekiyoDate
     */
    @JsonProperty("txtTekiyoDate")
    public void setTxtTekiyoDate(TextBoxFlexibleDate txtTekiyoDate) {
        this.txtTekiyoDate = txtTekiyoDate;
    }

    /*
     * gettxtYukokigenDate
     * @return txtYukokigenDate
     */
    @JsonProperty("txtYukokigenDate")
    public TextBoxFlexibleDate getTxtYukokigenDate() {
        return txtYukokigenDate;
    }

    /*
     * settxtYukokigenDate
     * @param txtYukokigenDate txtYukokigenDate
     */
    @JsonProperty("txtYukokigenDate")
    public void setTxtYukokigenDate(TextBoxFlexibleDate txtYukokigenDate) {
        this.txtYukokigenDate = txtYukokigenDate;
    }

    /*
     * gettxtGengakuRitsu
     * @return txtGengakuRitsu
     */
    @JsonProperty("txtGengakuRitsu")
    public TextBoxNum getTxtGengakuRitsu() {
        return txtGengakuRitsu;
    }

    /*
     * settxtGengakuRitsu
     * @param txtGengakuRitsu txtGengakuRitsu
     */
    @JsonProperty("txtGengakuRitsu")
    public void setTxtGengakuRitsu(TextBoxNum txtGengakuRitsu) {
        this.txtGengakuRitsu = txtGengakuRitsu;
    }

    /*
     * gettxtKakuninNo
     * @return txtKakuninNo
     */
    @JsonProperty("txtKakuninNo")
    public TextBoxCode getTxtKakuninNo() {
        return txtKakuninNo;
    }

    /*
     * settxtKakuninNo
     * @param txtKakuninNo txtKakuninNo
     */
    @JsonProperty("txtKakuninNo")
    public void setTxtKakuninNo(TextBoxCode txtKakuninNo) {
        this.txtKakuninNo = txtKakuninNo;
    }

    /*
     * gettxtFushoninRiyu
     * @return txtFushoninRiyu
     */
    @JsonProperty("txtFushoninRiyu")
    public TextBoxMultiLine getTxtFushoninRiyu() {
        return txtFushoninRiyu;
    }

    /*
     * settxtFushoninRiyu
     * @param txtFushoninRiyu txtFushoninRiyu
     */
    @JsonProperty("txtFushoninRiyu")
    public void setTxtFushoninRiyu(TextBoxMultiLine txtFushoninRiyu) {
        this.txtFushoninRiyu = txtFushoninRiyu;
    }

    // </editor-fold>
}
