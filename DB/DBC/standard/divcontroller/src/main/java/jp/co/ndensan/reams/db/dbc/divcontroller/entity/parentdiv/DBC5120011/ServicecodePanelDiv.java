package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC5120011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.chikushichosonselect.ChikuShichosonSelect.ChikuShichosonSelectDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.chikushichosonselect.ChikuShichosonSelect.IChikuShichosonSelectDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Label;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * ServicecodePanel のクラスファイル
 *
 * @reamsid_L DBC-3340-010 lihang
 */
public class ServicecodePanelDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-08-09_21-40-56">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("chusyutsuPanel")
    private chusyutsuPanelDiv chusyutsuPanel;
    @JsonProperty("sekkeiPanel")
    private sekkeiPanelDiv sekkeiPanel;
    @JsonProperty("lblComment1")
    private Label lblComment1;
    @JsonProperty("lblComment2")
    private Label lblComment2;
    @JsonProperty("lblComment3")
    private Label lblComment3;
    @JsonProperty("lblComment4")
    private Label lblComment4;
    @JsonProperty("ccdChikuShichosonSelect")
    private ChikuShichosonSelectDiv ccdChikuShichosonSelect;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getchusyutsuPanel
     * @return chusyutsuPanel
     */
    @JsonProperty("chusyutsuPanel")
    public chusyutsuPanelDiv getChusyutsuPanel() {
        return chusyutsuPanel;
    }

    /*
     * setchusyutsuPanel
     * @param chusyutsuPanel chusyutsuPanel
     */
    @JsonProperty("chusyutsuPanel")
    public void setChusyutsuPanel(chusyutsuPanelDiv chusyutsuPanel) {
        this.chusyutsuPanel = chusyutsuPanel;
    }

    /*
     * getsekkeiPanel
     * @return sekkeiPanel
     */
    @JsonProperty("sekkeiPanel")
    public sekkeiPanelDiv getSekkeiPanel() {
        return sekkeiPanel;
    }

    /*
     * setsekkeiPanel
     * @param sekkeiPanel sekkeiPanel
     */
    @JsonProperty("sekkeiPanel")
    public void setSekkeiPanel(sekkeiPanelDiv sekkeiPanel) {
        this.sekkeiPanel = sekkeiPanel;
    }

    /*
     * getlblComment1
     * @return lblComment1
     */
    @JsonProperty("lblComment1")
    public Label getLblComment1() {
        return lblComment1;
    }

    /*
     * setlblComment1
     * @param lblComment1 lblComment1
     */
    @JsonProperty("lblComment1")
    public void setLblComment1(Label lblComment1) {
        this.lblComment1 = lblComment1;
    }

    /*
     * getlblComment2
     * @return lblComment2
     */
    @JsonProperty("lblComment2")
    public Label getLblComment2() {
        return lblComment2;
    }

    /*
     * setlblComment2
     * @param lblComment2 lblComment2
     */
    @JsonProperty("lblComment2")
    public void setLblComment2(Label lblComment2) {
        this.lblComment2 = lblComment2;
    }

    /*
     * getlblComment3
     * @return lblComment3
     */
    @JsonProperty("lblComment3")
    public Label getLblComment3() {
        return lblComment3;
    }

    /*
     * setlblComment3
     * @param lblComment3 lblComment3
     */
    @JsonProperty("lblComment3")
    public void setLblComment3(Label lblComment3) {
        this.lblComment3 = lblComment3;
    }

    /*
     * getlblComment4
     * @return lblComment4
     */
    @JsonProperty("lblComment4")
    public Label getLblComment4() {
        return lblComment4;
    }

    /*
     * setlblComment4
     * @param lblComment4 lblComment4
     */
    @JsonProperty("lblComment4")
    public void setLblComment4(Label lblComment4) {
        this.lblComment4 = lblComment4;
    }

    /*
     * getccdChikuShichosonSelect
     * @return ccdChikuShichosonSelect
     */
    @JsonProperty("ccdChikuShichosonSelect")
    public IChikuShichosonSelectDiv getCcdChikuShichosonSelect() {
        return ccdChikuShichosonSelect;
    }

    // </editor-fold>
}