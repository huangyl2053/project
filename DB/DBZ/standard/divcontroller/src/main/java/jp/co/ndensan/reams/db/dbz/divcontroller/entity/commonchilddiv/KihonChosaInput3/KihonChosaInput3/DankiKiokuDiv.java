package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KihonChosaInput3.KihonChosaInput3;
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
 * DankiKioku のクラスファイル
 *
 * @author 自動生成
 */
public class DankiKiokuDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnDankiKioku")
    private ButtonDialog btnDankiKioku;
    @JsonProperty("radDankiKioku")
    private RadioButton radDankiKioku;
    @JsonProperty("DankiKiokuShinseishoKanriNo")
    private RString DankiKiokuShinseishoKanriNo;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnDankiKioku
     * @return btnDankiKioku
     */
    @JsonProperty("btnDankiKioku")
    public ButtonDialog getBtnDankiKioku() {
        return btnDankiKioku;
    }

    /*
     * setbtnDankiKioku
     * @param btnDankiKioku btnDankiKioku
     */
    @JsonProperty("btnDankiKioku")
    public void setBtnDankiKioku(ButtonDialog btnDankiKioku) {
        this.btnDankiKioku = btnDankiKioku;
    }

    /*
     * getradDankiKioku
     * @return radDankiKioku
     */
    @JsonProperty("radDankiKioku")
    public RadioButton getRadDankiKioku() {
        return radDankiKioku;
    }

    /*
     * setradDankiKioku
     * @param radDankiKioku radDankiKioku
     */
    @JsonProperty("radDankiKioku")
    public void setRadDankiKioku(RadioButton radDankiKioku) {
        this.radDankiKioku = radDankiKioku;
    }

    /*
     * getDankiKiokuShinseishoKanriNo
     * @return DankiKiokuShinseishoKanriNo
     */
    @JsonProperty("DankiKiokuShinseishoKanriNo")
    public RString getDankiKiokuShinseishoKanriNo() {
        return DankiKiokuShinseishoKanriNo;
    }

    /*
     * setDankiKiokuShinseishoKanriNo
     * @param DankiKiokuShinseishoKanriNo DankiKiokuShinseishoKanriNo
     */
    @JsonProperty("DankiKiokuShinseishoKanriNo")
    public void setDankiKiokuShinseishoKanriNo(RString DankiKiokuShinseishoKanriNo) {
        this.DankiKiokuShinseishoKanriNo = DankiKiokuShinseishoKanriNo;
    }

    // </editor-fold>
}
