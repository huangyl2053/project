package jp.co.ndensan.reams.db.dbd.divcontroller.entity.dbd4030011;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.PrintContentsSettingDiv;
import jp.co.ndensan.reams.ur.urz.divcontroller.entity.ChohyoShutsuryokujunDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.PanelPublish;

/**
 * OutputShogaishaKojoTaishoshaNinteishoPanel のクラスファイル 
 * 
 * @author 自動生成
 */
public class OutputShogaishaKojoTaishoshaNinteishoPanelDiv extends PanelPublish {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("PrintContentsSetting")
    private PrintContentsSettingDiv PrintContentsSetting;
    @JsonProperty("OutputOrder")
    private ChohyoShutsuryokujunDiv OutputOrder;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("PrintContentsSetting")
    public PrintContentsSettingDiv getPrintContentsSetting() {
        return PrintContentsSetting;
    }

    @JsonProperty("PrintContentsSetting")
    public void setPrintContentsSetting(PrintContentsSettingDiv PrintContentsSetting) {
        this.PrintContentsSetting=PrintContentsSetting;
    }

    @JsonProperty("OutputOrder")
    public ChohyoShutsuryokujunDiv getOutputOrder() {
        return OutputOrder;
    }

    @JsonProperty("OutputOrder")
    public void setOutputOrder(ChohyoShutsuryokujunDiv OutputOrder) {
        this.OutputOrder=OutputOrder;
    }

}
