package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC1800000;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.printcontentssetting.IPrintContentsSettingDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.printcontentssetting.PrintContentsSettingDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.PanelPublish;

/**
 * KashitsukeShinseisho のクラスファイル
 *
 * @author 自動生成
 */
public class KashitsukeShinseishoDiv extends PanelPublish {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：Uz-master-49">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnPrint")
    private Button btnPrint;
    @JsonProperty("KyufuhiKariireShinseishoPrintSetting")
    private PrintContentsSettingDiv KyufuhiKariireShinseishoPrintSetting;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("btnPrint")
    public Button getBtnPrint() {
        return btnPrint;
    }

    @JsonProperty("btnPrint")
    public void setBtnPrint(Button btnPrint) {
        this.btnPrint = btnPrint;
    }

    @JsonProperty("KyufuhiKariireShinseishoPrintSetting")
    public IPrintContentsSettingDiv getKyufuhiKariireShinseishoPrintSetting() {
        return KyufuhiKariireShinseishoPrintSetting;
    }

    // </editor-fold>
}
