package jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0070011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * ShokuhiFutanGaitosha のクラスファイル 
 * 
 * @author 自動生成
 */
public class ShokuhiFutanGaitoshaDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-10-07_19-12-57">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("radShokuhiGakuGaitosha")
    private RadioButton radShokuhiGakuGaitosha;
    @JsonProperty("txtShokuhiGakuOtherGaitosha")
    private TextBox txtShokuhiGakuOtherGaitosha;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getradShokuhiGakuGaitosha
     * @return radShokuhiGakuGaitosha
     */
    @JsonProperty("radShokuhiGakuGaitosha")
    public RadioButton getRadShokuhiGakuGaitosha() {
        return radShokuhiGakuGaitosha;
    }

    /*
     * setradShokuhiGakuGaitosha
     * @param radShokuhiGakuGaitosha radShokuhiGakuGaitosha
     */
    @JsonProperty("radShokuhiGakuGaitosha")
    public void setRadShokuhiGakuGaitosha(RadioButton radShokuhiGakuGaitosha) {
        this.radShokuhiGakuGaitosha = radShokuhiGakuGaitosha;
    }

    /*
     * gettxtShokuhiGakuOtherGaitosha
     * @return txtShokuhiGakuOtherGaitosha
     */
    @JsonProperty("txtShokuhiGakuOtherGaitosha")
    public TextBox getTxtShokuhiGakuOtherGaitosha() {
        return txtShokuhiGakuOtherGaitosha;
    }

    /*
     * settxtShokuhiGakuOtherGaitosha
     * @param txtShokuhiGakuOtherGaitosha txtShokuhiGakuOtherGaitosha
     */
    @JsonProperty("txtShokuhiGakuOtherGaitosha")
    public void setTxtShokuhiGakuOtherGaitosha(TextBox txtShokuhiGakuOtherGaitosha) {
        this.txtShokuhiGakuOtherGaitosha = txtShokuhiGakuOtherGaitosha;
    }

    // </editor-fold>
}
