package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KihonChosaInput4.KihonChosaInput4;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.ButtonDialog;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.RadioButton;

/**
 * TukuriHanashi のクラスファイル
 *
 * @author 自動生成
 */
public class TukuriHanashiDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnTukuriHanashi")
    private ButtonDialog btnTukuriHanashi;
    @JsonProperty("radTukuriHanashi")
    private RadioButton radTukuriHanashi;
    @JsonProperty("TukuriHanashiShinseishoKanriNo")
    private RString TukuriHanashiShinseishoKanriNo;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnTukuriHanashi
     * @return btnTukuriHanashi
     */
    @JsonProperty("btnTukuriHanashi")
    public ButtonDialog getBtnTukuriHanashi() {
        return btnTukuriHanashi;
    }

    /*
     * setbtnTukuriHanashi
     * @param btnTukuriHanashi btnTukuriHanashi
     */
    @JsonProperty("btnTukuriHanashi")
    public void setBtnTukuriHanashi(ButtonDialog btnTukuriHanashi) {
        this.btnTukuriHanashi = btnTukuriHanashi;
    }

    /*
     * getradTukuriHanashi
     * @return radTukuriHanashi
     */
    @JsonProperty("radTukuriHanashi")
    public RadioButton getRadTukuriHanashi() {
        return radTukuriHanashi;
    }

    /*
     * setradTukuriHanashi
     * @param radTukuriHanashi radTukuriHanashi
     */
    @JsonProperty("radTukuriHanashi")
    public void setRadTukuriHanashi(RadioButton radTukuriHanashi) {
        this.radTukuriHanashi = radTukuriHanashi;
    }

    /*
     * getTukuriHanashiShinseishoKanriNo
     * @return TukuriHanashiShinseishoKanriNo
     */
    @JsonProperty("TukuriHanashiShinseishoKanriNo")
    public RString getTukuriHanashiShinseishoKanriNo() {
        return TukuriHanashiShinseishoKanriNo;
    }

    /*
     * setTukuriHanashiShinseishoKanriNo
     * @param TukuriHanashiShinseishoKanriNo TukuriHanashiShinseishoKanriNo
     */
    @JsonProperty("TukuriHanashiShinseishoKanriNo")
    public void setTukuriHanashiShinseishoKanriNo(RString TukuriHanashiShinseishoKanriNo) {
        this.TukuriHanashiShinseishoKanriNo = TukuriHanashiShinseishoKanriNo;
    }

    // </editor-fold>
}
