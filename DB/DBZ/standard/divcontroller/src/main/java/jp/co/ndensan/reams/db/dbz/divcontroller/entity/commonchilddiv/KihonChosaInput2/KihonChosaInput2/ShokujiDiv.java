package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KihonChosaInput2.KihonChosaInput2;
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
 * Shokuji のクラスファイル
 *
 * @author 自動生成
 */
public class ShokujiDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnShokuji")
    private ButtonDialog btnShokuji;
    @JsonProperty("radShokuji")
    private RadioButton radShokuji;
    @JsonProperty("ShokujiShinseishoKanriNo")
    private RString ShokujiShinseishoKanriNo;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnShokuji
     * @return btnShokuji
     */
    @JsonProperty("btnShokuji")
    public ButtonDialog getBtnShokuji() {
        return btnShokuji;
    }

    /*
     * setbtnShokuji
     * @param btnShokuji btnShokuji
     */
    @JsonProperty("btnShokuji")
    public void setBtnShokuji(ButtonDialog btnShokuji) {
        this.btnShokuji = btnShokuji;
    }

    /*
     * getradShokuji
     * @return radShokuji
     */
    @JsonProperty("radShokuji")
    public RadioButton getRadShokuji() {
        return radShokuji;
    }

    /*
     * setradShokuji
     * @param radShokuji radShokuji
     */
    @JsonProperty("radShokuji")
    public void setRadShokuji(RadioButton radShokuji) {
        this.radShokuji = radShokuji;
    }

    /*
     * getShokujiShinseishoKanriNo
     * @return ShokujiShinseishoKanriNo
     */
    @JsonProperty("ShokujiShinseishoKanriNo")
    public RString getShokujiShinseishoKanriNo() {
        return ShokujiShinseishoKanriNo;
    }

    /*
     * setShokujiShinseishoKanriNo
     * @param ShokujiShinseishoKanriNo ShokujiShinseishoKanriNo
     */
    @JsonProperty("ShokujiShinseishoKanriNo")
    public void setShokujiShinseishoKanriNo(RString ShokujiShinseishoKanriNo) {
        this.ShokujiShinseishoKanriNo = ShokujiShinseishoKanriNo;
    }

    // </editor-fold>
}
