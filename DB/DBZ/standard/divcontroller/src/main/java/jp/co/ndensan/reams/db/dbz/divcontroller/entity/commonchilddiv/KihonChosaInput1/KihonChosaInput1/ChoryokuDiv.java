package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KihonChosaInput1.KihonChosaInput1;
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
 * Choryoku のクラスファイル
 *
 * @reamsid_L DBE-3000-090 wangjie2
 */
public class ChoryokuDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnChoryoku")
    private ButtonDialog btnChoryoku;
    @JsonProperty("radChoryoku")
    private RadioButton radChoryoku;
    @JsonProperty("ChoryokuShinseishoKanriNo")
    private RString ChoryokuShinseishoKanriNo;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnChoryoku
     * @return btnChoryoku
     */
    @JsonProperty("btnChoryoku")
    public ButtonDialog getBtnChoryoku() {
        return btnChoryoku;
    }

    /*
     * setbtnChoryoku
     * @param btnChoryoku btnChoryoku
     */
    @JsonProperty("btnChoryoku")
    public void setBtnChoryoku(ButtonDialog btnChoryoku) {
        this.btnChoryoku = btnChoryoku;
    }

    /*
     * getradChoryoku
     * @return radChoryoku
     */
    @JsonProperty("radChoryoku")
    public RadioButton getRadChoryoku() {
        return radChoryoku;
    }

    /*
     * setradChoryoku
     * @param radChoryoku radChoryoku
     */
    @JsonProperty("radChoryoku")
    public void setRadChoryoku(RadioButton radChoryoku) {
        this.radChoryoku = radChoryoku;
    }

    /*
     * getChoryokuShinseishoKanriNo
     * @return ChoryokuShinseishoKanriNo
     */
    @JsonProperty("ChoryokuShinseishoKanriNo")
    public RString getChoryokuShinseishoKanriNo() {
        return ChoryokuShinseishoKanriNo;
    }

    /*
     * setChoryokuShinseishoKanriNo
     * @param ChoryokuShinseishoKanriNo ChoryokuShinseishoKanriNo
     */
    @JsonProperty("ChoryokuShinseishoKanriNo")
    public void setChoryokuShinseishoKanriNo(RString ChoryokuShinseishoKanriNo) {
        this.ChoryokuShinseishoKanriNo = ChoryokuShinseishoKanriNo;
    }

    // </editor-fold>
}
