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
 * ShokuhiFutan のクラスファイル 
 * 
 * @author 自動生成
 */
public class ShokuhiFutanDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-05-30_13-18-33">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("radShokuhiGaku")
    private RadioButton radShokuhiGaku;
    @JsonProperty("txtShokuhiGakuOther")
    private TextBox txtShokuhiGakuOther;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getradShokuhiGaku
     * @return radShokuhiGaku
     */
    @JsonProperty("radShokuhiGaku")
    public RadioButton getRadShokuhiGaku() {
        return radShokuhiGaku;
    }

    /*
     * setradShokuhiGaku
     * @param radShokuhiGaku radShokuhiGaku
     */
    @JsonProperty("radShokuhiGaku")
    public void setRadShokuhiGaku(RadioButton radShokuhiGaku) {
        this.radShokuhiGaku = radShokuhiGaku;
    }

    /*
     * gettxtShokuhiGakuOther
     * @return txtShokuhiGakuOther
     */
    @JsonProperty("txtShokuhiGakuOther")
    public TextBox getTxtShokuhiGakuOther() {
        return txtShokuhiGakuOther;
    }

    /*
     * settxtShokuhiGakuOther
     * @param txtShokuhiGakuOther txtShokuhiGakuOther
     */
    @JsonProperty("txtShokuhiGakuOther")
    public void setTxtShokuhiGakuOther(TextBox txtShokuhiGakuOther) {
        this.txtShokuhiGakuOther = txtShokuhiGakuOther;
    }

    // </editor-fold>
}