package jp.co.ndensan.reams.db.dbc.divcontroller.entity.DBC0120000;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.ServiceRiyohyoRirekiList.ServiceRiyohyoRirekiListDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * KyotakuJikoRiyohyoRireki のクラスファイル 
 * 
 * @author 自動生成
 */
public class KyotakuJikoRiyohyoRirekiDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("KyotakuJikoRiyohyoRirekiList")
    private ServiceRiyohyoRirekiListDiv KyotakuJikoRiyohyoRirekiList;
    @JsonProperty("btnGaitoshaReturn")
    private Button btnGaitoshaReturn;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("KyotakuJikoRiyohyoRirekiList")
    public ServiceRiyohyoRirekiListDiv getKyotakuJikoRiyohyoRirekiList() {
        return KyotakuJikoRiyohyoRirekiList;
    }

    @JsonProperty("KyotakuJikoRiyohyoRirekiList")
    public void setKyotakuJikoRiyohyoRirekiList(ServiceRiyohyoRirekiListDiv KyotakuJikoRiyohyoRirekiList) {
        this.KyotakuJikoRiyohyoRirekiList=KyotakuJikoRiyohyoRirekiList;
    }

    @JsonProperty("btnGaitoshaReturn")
    public Button getBtnGaitoshaReturn() {
        return btnGaitoshaReturn;
    }

    @JsonProperty("btnGaitoshaReturn")
    public void setBtnGaitoshaReturn(Button btnGaitoshaReturn) {
        this.btnGaitoshaReturn=btnGaitoshaReturn;
    }

}