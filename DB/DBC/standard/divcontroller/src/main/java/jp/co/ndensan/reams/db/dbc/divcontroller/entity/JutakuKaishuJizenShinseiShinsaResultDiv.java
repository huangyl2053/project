package jp.co.ndensan.reams.db.dbc.divcontroller.entity;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * JutakuKaishuJizenShinseiShinsaResult のクラスファイル 
 * 
 * @author 自動生成
 */
public class JutakuKaishuJizenShinseiShinsaResultDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtJudgeDate")
    private TextBoxDate txtJudgeDate;
    @JsonProperty("radJudgeKubun")
    private RadioButton radJudgeKubun;
    @JsonProperty("txtShoninCondition")
    private TextBoxMultiLine txtShoninCondition;
    @JsonProperty("txtFushoninReason")
    private TextBoxMultiLine txtFushoninReason;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtJudgeDate")
    public TextBoxDate getTxtJudgeDate() {
        return txtJudgeDate;
    }

    @JsonProperty("txtJudgeDate")
    public void setTxtJudgeDate(TextBoxDate txtJudgeDate) {
        this.txtJudgeDate=txtJudgeDate;
    }

    @JsonProperty("radJudgeKubun")
    public RadioButton getRadJudgeKubun() {
        return radJudgeKubun;
    }

    @JsonProperty("radJudgeKubun")
    public void setRadJudgeKubun(RadioButton radJudgeKubun) {
        this.radJudgeKubun=radJudgeKubun;
    }

    @JsonProperty("txtShoninCondition")
    public TextBoxMultiLine getTxtShoninCondition() {
        return txtShoninCondition;
    }

    @JsonProperty("txtShoninCondition")
    public void setTxtShoninCondition(TextBoxMultiLine txtShoninCondition) {
        this.txtShoninCondition=txtShoninCondition;
    }

    @JsonProperty("txtFushoninReason")
    public TextBoxMultiLine getTxtFushoninReason() {
        return txtFushoninReason;
    }

    @JsonProperty("txtFushoninReason")
    public void setTxtFushoninReason(TextBoxMultiLine txtFushoninReason) {
        this.txtFushoninReason=txtFushoninReason;
    }

}
