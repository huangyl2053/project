package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KihonChosaInput3.KihonChosaInput3;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * Kisetsu のクラスファイル
 *
 * @author 自動生成
 */
public class KisetsuDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-05-30_13-18-33">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnKisetsu")
    private ButtonDialog btnKisetsu;
    @JsonProperty("radKisetsu")
    private RadioButton radKisetsu;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnKisetsu
     * @return btnKisetsu
     */
    @JsonProperty("btnKisetsu")
    public ButtonDialog getBtnKisetsu() {
        return btnKisetsu;
    }

    /*
     * setbtnKisetsu
     * @param btnKisetsu btnKisetsu
     */
    @JsonProperty("btnKisetsu")
    public void setBtnKisetsu(ButtonDialog btnKisetsu) {
        this.btnKisetsu = btnKisetsu;
    }

    /*
     * getradKisetsu
     * @return radKisetsu
     */
    @JsonProperty("radKisetsu")
    public RadioButton getRadKisetsu() {
        return radKisetsu;
    }

    /*
     * setradKisetsu
     * @param radKisetsu radKisetsu
     */
    @JsonProperty("radKisetsu")
    public void setRadKisetsu(RadioButton radKisetsu) {
        this.radKisetsu = radKisetsu;
    }

    // </editor-fold>
}