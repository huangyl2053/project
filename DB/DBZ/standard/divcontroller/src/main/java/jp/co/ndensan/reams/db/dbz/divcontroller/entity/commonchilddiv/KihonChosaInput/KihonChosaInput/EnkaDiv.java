package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KihonChosaInput.KihonChosaInput;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * Enka のクラスファイル 
 * 
 * @author 自動生成
 */
public class EnkaDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnEnka")
    private ButtonDialog btnEnka;
    @JsonProperty("radEnka")
    private RadioButton radEnka;
    @JsonProperty("EnkaShinseishoKanriNo")
    private RString EnkaShinseishoKanriNo;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnEnka
     * @return btnEnka
     */
    @JsonProperty("btnEnka")
    public ButtonDialog getBtnEnka() {
        return btnEnka;
    }

    /*
     * setbtnEnka
     * @param btnEnka btnEnka
     */
    @JsonProperty("btnEnka")
    public void setBtnEnka(ButtonDialog btnEnka) {
        this.btnEnka = btnEnka;
    }

    /*
     * getradEnka
     * @return radEnka
     */
    @JsonProperty("radEnka")
    public RadioButton getRadEnka() {
        return radEnka;
    }

    /*
     * setradEnka
     * @param radEnka radEnka
     */
    @JsonProperty("radEnka")
    public void setRadEnka(RadioButton radEnka) {
        this.radEnka = radEnka;
    }

    /*
     * getEnkaShinseishoKanriNo
     * @return EnkaShinseishoKanriNo
     */
    @JsonProperty("EnkaShinseishoKanriNo")
    public RString getEnkaShinseishoKanriNo() {
        return EnkaShinseishoKanriNo;
    }

    /*
     * setEnkaShinseishoKanriNo
     * @param EnkaShinseishoKanriNo EnkaShinseishoKanriNo
     */
    @JsonProperty("EnkaShinseishoKanriNo")
    public void setEnkaShinseishoKanriNo(RString EnkaShinseishoKanriNo) {
        this.EnkaShinseishoKanriNo = EnkaShinseishoKanriNo;
    }

    // </editor-fold>
}
