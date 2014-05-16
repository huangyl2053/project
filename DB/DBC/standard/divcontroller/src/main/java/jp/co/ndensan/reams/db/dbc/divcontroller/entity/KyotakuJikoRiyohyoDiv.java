package jp.co.ndensan.reams.db.dbc.divcontroller.entity;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.ServiceRiyohyoInfoDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * KyotakuJikoRiyohyo のクラスファイル 
 * 
 * @author 自動生成
 */
public class KyotakuJikoRiyohyoDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("KyotakuJikoRiyohyoInfo")
    private ServiceRiyohyoInfoDiv KyotakuJikoRiyohyoInfo;
    @JsonProperty("btnReturn")
    private Button btnReturn;
    @JsonProperty("btnRiyohyoSave")
    private Button btnRiyohyoSave;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("KyotakuJikoRiyohyoInfo")
    public ServiceRiyohyoInfoDiv getKyotakuJikoRiyohyoInfo() {
        return KyotakuJikoRiyohyoInfo;
    }

    @JsonProperty("KyotakuJikoRiyohyoInfo")
    public void setKyotakuJikoRiyohyoInfo(ServiceRiyohyoInfoDiv KyotakuJikoRiyohyoInfo) {
        this.KyotakuJikoRiyohyoInfo=KyotakuJikoRiyohyoInfo;
    }

    @JsonProperty("btnReturn")
    public Button getBtnReturn() {
        return btnReturn;
    }

    @JsonProperty("btnReturn")
    public void setBtnReturn(Button btnReturn) {
        this.btnReturn=btnReturn;
    }

    @JsonProperty("btnRiyohyoSave")
    public Button getBtnRiyohyoSave() {
        return btnRiyohyoSave;
    }

    @JsonProperty("btnRiyohyoSave")
    public void setBtnRiyohyoSave(Button btnRiyohyoSave) {
        this.btnRiyohyoSave=btnRiyohyoSave;
    }

}
