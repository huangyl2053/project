package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0820014;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * ServiceTeikyoShomeishoPanel のクラスファイル
 *
 * @reamsid_L DBC-1030-130 gongliang
 */
public class ServiceTeikyoShomeishoPanelDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("panelOne")
    private panelOneDiv panelOne;
    @JsonProperty("panelTwo")
    private panelTwoDiv panelTwo;
    @JsonProperty("panelShinseiNaiyo")
    private panelShinseiNaiyoDiv panelShinseiNaiyo;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getpanelOne
     * @return panelOne
     */
    @JsonProperty("panelOne")
    public panelOneDiv getPanelOne() {
        return panelOne;
    }

    /*
     * setpanelOne
     * @param panelOne panelOne
     */
    @JsonProperty("panelOne")
    public void setPanelOne(panelOneDiv panelOne) {
        this.panelOne = panelOne;
    }

    /*
     * getpanelTwo
     * @return panelTwo
     */
    @JsonProperty("panelTwo")
    public panelTwoDiv getPanelTwo() {
        return panelTwo;
    }

    /*
     * setpanelTwo
     * @param panelTwo panelTwo
     */
    @JsonProperty("panelTwo")
    public void setPanelTwo(panelTwoDiv panelTwo) {
        this.panelTwo = panelTwo;
    }

    /*
     * getpanelShinseiNaiyo
     * @return panelShinseiNaiyo
     */
    @JsonProperty("panelShinseiNaiyo")
    public panelShinseiNaiyoDiv getPanelShinseiNaiyo() {
        return panelShinseiNaiyo;
    }

    /*
     * setpanelShinseiNaiyo
     * @param panelShinseiNaiyo panelShinseiNaiyo
     */
    @JsonProperty("panelShinseiNaiyo")
    public void setPanelShinseiNaiyo(panelShinseiNaiyoDiv panelShinseiNaiyo) {
        this.panelShinseiNaiyo = panelShinseiNaiyo;
    }

    // </editor-fold>
}