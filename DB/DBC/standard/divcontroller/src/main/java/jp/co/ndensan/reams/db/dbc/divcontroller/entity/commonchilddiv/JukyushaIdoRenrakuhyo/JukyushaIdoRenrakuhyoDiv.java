package jp.co.ndensan.reams.db.dbc.divcontroller.entity.commonchilddiv.JukyushaIdoRenrakuhyo;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

import java.util.HashSet;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ICommonChildDivMode;
import jp.co.ndensan.reams.uz.uza.ui.servlets._CommonChildDivModeUtil;

/**
 * JukyushaIdoRenrakuhyo のクラスファイル 
 * 
 * @author 自動生成
 */
public class JukyushaIdoRenrakuhyoDiv extends Panel implements IJukyushaIdoRenrakuhyoDiv {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("JukyushaIdoRenrakuhyoKihonJoho")
    private JukyushaIdoRenrakuhyoKihonJohoDiv JukyushaIdoRenrakuhyoKihonJoho;
    @JsonProperty("JukyushaIdoRenrakuhyoTeisei")
    private JukyushaIdoRenrakuhyoTeiseiDiv JukyushaIdoRenrakuhyoTeisei;
    @JsonProperty("YokaigoNinteiPanel")
    private YokaigoNinteiPanelDiv YokaigoNinteiPanel;
    @JsonProperty("ShikyuGendoKijungakuPanel")
    private ShikyuGendoKijungakuPanelDiv ShikyuGendoKijungakuPanel;
    @JsonProperty("KyotakuServicePlanPanel")
    private KyotakuServicePlanPanelDiv KyotakuServicePlanPanel;
    @JsonProperty("JushochiTokureiPanel")
    private JushochiTokureiPanelDiv JushochiTokureiPanel;
    @JsonProperty("GemmenGengakuPanel")
    private GemmenGengakuPanelDiv GemmenGengakuPanel;
    @JsonProperty("KokiKoureiIryoHokenshaPanel")
    private KokiKoureiIryoHokenshaPanelDiv KokiKoureiIryoHokenshaPanel;
    @JsonProperty("KyufuSeigenPanel")
    private KyufuSeigenPanelDiv KyufuSeigenPanel;
    @JsonProperty("RiyosyaFutanWariaiPanel")
    private RiyosyaFutanWariaiPanelDiv RiyosyaFutanWariaiPanel;
    @JsonProperty("NijiyoboJigyoPanel")
    private NijiyoboJigyoPanelDiv NijiyoboJigyoPanel;
    @JsonProperty("RojinHokenPanel")
    private RojinHokenPanelDiv RojinHokenPanel;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getJukyushaIdoRenrakuhyoKihonJoho
     * @return JukyushaIdoRenrakuhyoKihonJoho
     */
    @JsonProperty("JukyushaIdoRenrakuhyoKihonJoho")
    public JukyushaIdoRenrakuhyoKihonJohoDiv getJukyushaIdoRenrakuhyoKihonJoho() {
        return JukyushaIdoRenrakuhyoKihonJoho;
    }

    /*
     * setJukyushaIdoRenrakuhyoKihonJoho
     * @param JukyushaIdoRenrakuhyoKihonJoho JukyushaIdoRenrakuhyoKihonJoho
     */
    @JsonProperty("JukyushaIdoRenrakuhyoKihonJoho")
    public void setJukyushaIdoRenrakuhyoKihonJoho(JukyushaIdoRenrakuhyoKihonJohoDiv JukyushaIdoRenrakuhyoKihonJoho) {
        this.JukyushaIdoRenrakuhyoKihonJoho = JukyushaIdoRenrakuhyoKihonJoho;
    }

    /*
     * getJukyushaIdoRenrakuhyoTeisei
     * @return JukyushaIdoRenrakuhyoTeisei
     */
    @JsonProperty("JukyushaIdoRenrakuhyoTeisei")
    public JukyushaIdoRenrakuhyoTeiseiDiv getJukyushaIdoRenrakuhyoTeisei() {
        return JukyushaIdoRenrakuhyoTeisei;
    }

    /*
     * setJukyushaIdoRenrakuhyoTeisei
     * @param JukyushaIdoRenrakuhyoTeisei JukyushaIdoRenrakuhyoTeisei
     */
    @JsonProperty("JukyushaIdoRenrakuhyoTeisei")
    public void setJukyushaIdoRenrakuhyoTeisei(JukyushaIdoRenrakuhyoTeiseiDiv JukyushaIdoRenrakuhyoTeisei) {
        this.JukyushaIdoRenrakuhyoTeisei = JukyushaIdoRenrakuhyoTeisei;
    }

    /*
     * getYokaigoNinteiPanel
     * @return YokaigoNinteiPanel
     */
    @JsonProperty("YokaigoNinteiPanel")
    public YokaigoNinteiPanelDiv getYokaigoNinteiPanel() {
        return YokaigoNinteiPanel;
    }

    /*
     * setYokaigoNinteiPanel
     * @param YokaigoNinteiPanel YokaigoNinteiPanel
     */
    @JsonProperty("YokaigoNinteiPanel")
    public void setYokaigoNinteiPanel(YokaigoNinteiPanelDiv YokaigoNinteiPanel) {
        this.YokaigoNinteiPanel = YokaigoNinteiPanel;
    }

    /*
     * getShikyuGendoKijungakuPanel
     * @return ShikyuGendoKijungakuPanel
     */
    @JsonProperty("ShikyuGendoKijungakuPanel")
    public ShikyuGendoKijungakuPanelDiv getShikyuGendoKijungakuPanel() {
        return ShikyuGendoKijungakuPanel;
    }

    /*
     * setShikyuGendoKijungakuPanel
     * @param ShikyuGendoKijungakuPanel ShikyuGendoKijungakuPanel
     */
    @JsonProperty("ShikyuGendoKijungakuPanel")
    public void setShikyuGendoKijungakuPanel(ShikyuGendoKijungakuPanelDiv ShikyuGendoKijungakuPanel) {
        this.ShikyuGendoKijungakuPanel = ShikyuGendoKijungakuPanel;
    }

    /*
     * getKyotakuServicePlanPanel
     * @return KyotakuServicePlanPanel
     */
    @JsonProperty("KyotakuServicePlanPanel")
    public KyotakuServicePlanPanelDiv getKyotakuServicePlanPanel() {
        return KyotakuServicePlanPanel;
    }

    /*
     * setKyotakuServicePlanPanel
     * @param KyotakuServicePlanPanel KyotakuServicePlanPanel
     */
    @JsonProperty("KyotakuServicePlanPanel")
    public void setKyotakuServicePlanPanel(KyotakuServicePlanPanelDiv KyotakuServicePlanPanel) {
        this.KyotakuServicePlanPanel = KyotakuServicePlanPanel;
    }

    /*
     * getJushochiTokureiPanel
     * @return JushochiTokureiPanel
     */
    @JsonProperty("JushochiTokureiPanel")
    public JushochiTokureiPanelDiv getJushochiTokureiPanel() {
        return JushochiTokureiPanel;
    }

    /*
     * setJushochiTokureiPanel
     * @param JushochiTokureiPanel JushochiTokureiPanel
     */
    @JsonProperty("JushochiTokureiPanel")
    public void setJushochiTokureiPanel(JushochiTokureiPanelDiv JushochiTokureiPanel) {
        this.JushochiTokureiPanel = JushochiTokureiPanel;
    }

    /*
     * getGemmenGengakuPanel
     * @return GemmenGengakuPanel
     */
    @JsonProperty("GemmenGengakuPanel")
    public GemmenGengakuPanelDiv getGemmenGengakuPanel() {
        return GemmenGengakuPanel;
    }

    /*
     * setGemmenGengakuPanel
     * @param GemmenGengakuPanel GemmenGengakuPanel
     */
    @JsonProperty("GemmenGengakuPanel")
    public void setGemmenGengakuPanel(GemmenGengakuPanelDiv GemmenGengakuPanel) {
        this.GemmenGengakuPanel = GemmenGengakuPanel;
    }

    /*
     * getKokiKoureiIryoHokenshaPanel
     * @return KokiKoureiIryoHokenshaPanel
     */
    @JsonProperty("KokiKoureiIryoHokenshaPanel")
    public KokiKoureiIryoHokenshaPanelDiv getKokiKoureiIryoHokenshaPanel() {
        return KokiKoureiIryoHokenshaPanel;
    }

    /*
     * setKokiKoureiIryoHokenshaPanel
     * @param KokiKoureiIryoHokenshaPanel KokiKoureiIryoHokenshaPanel
     */
    @JsonProperty("KokiKoureiIryoHokenshaPanel")
    public void setKokiKoureiIryoHokenshaPanel(KokiKoureiIryoHokenshaPanelDiv KokiKoureiIryoHokenshaPanel) {
        this.KokiKoureiIryoHokenshaPanel = KokiKoureiIryoHokenshaPanel;
    }

    /*
     * getKyufuSeigenPanel
     * @return KyufuSeigenPanel
     */
    @JsonProperty("KyufuSeigenPanel")
    public KyufuSeigenPanelDiv getKyufuSeigenPanel() {
        return KyufuSeigenPanel;
    }

    /*
     * setKyufuSeigenPanel
     * @param KyufuSeigenPanel KyufuSeigenPanel
     */
    @JsonProperty("KyufuSeigenPanel")
    public void setKyufuSeigenPanel(KyufuSeigenPanelDiv KyufuSeigenPanel) {
        this.KyufuSeigenPanel = KyufuSeigenPanel;
    }

    /*
     * getRiyosyaFutanWariaiPanel
     * @return RiyosyaFutanWariaiPanel
     */
    @JsonProperty("RiyosyaFutanWariaiPanel")
    public RiyosyaFutanWariaiPanelDiv getRiyosyaFutanWariaiPanel() {
        return RiyosyaFutanWariaiPanel;
    }

    /*
     * setRiyosyaFutanWariaiPanel
     * @param RiyosyaFutanWariaiPanel RiyosyaFutanWariaiPanel
     */
    @JsonProperty("RiyosyaFutanWariaiPanel")
    public void setRiyosyaFutanWariaiPanel(RiyosyaFutanWariaiPanelDiv RiyosyaFutanWariaiPanel) {
        this.RiyosyaFutanWariaiPanel = RiyosyaFutanWariaiPanel;
    }

    /*
     * getNijiyoboJigyoPanel
     * @return NijiyoboJigyoPanel
     */
    @JsonProperty("NijiyoboJigyoPanel")
    public NijiyoboJigyoPanelDiv getNijiyoboJigyoPanel() {
        return NijiyoboJigyoPanel;
    }

    /*
     * setNijiyoboJigyoPanel
     * @param NijiyoboJigyoPanel NijiyoboJigyoPanel
     */
    @JsonProperty("NijiyoboJigyoPanel")
    public void setNijiyoboJigyoPanel(NijiyoboJigyoPanelDiv NijiyoboJigyoPanel) {
        this.NijiyoboJigyoPanel = NijiyoboJigyoPanel;
    }

    /*
     * getRojinHokenPanel
     * @return RojinHokenPanel
     */
    @JsonProperty("RojinHokenPanel")
    public RojinHokenPanelDiv getRojinHokenPanel() {
        return RojinHokenPanel;
    }

    /*
     * setRojinHokenPanel
     * @param RojinHokenPanel RojinHokenPanel
     */
    @JsonProperty("RojinHokenPanel")
    public void setRojinHokenPanel(RojinHokenPanelDiv RojinHokenPanel) {
        this.RojinHokenPanel = RojinHokenPanel;
    }

    /*
     * [共有子DIVモード]
     */
    @JsonProperty("modes")
    private HashSet<Mode> modes;

    public static enum DisplayMode implements ICommonChildDivMode {

        shinki("shinki"),
        teisei("teisei"),
        saihakko("saihakko"),
        shokai("shokai");

        private final String name;

        private DisplayMode(final String name) {
            this.name = name;
        }

        public static DisplayMode getEnum(String str) {
            DisplayMode[] enumArray = DisplayMode.values();

            for (DisplayMode enumStr : enumArray) {
                if (str.equals(enumStr.name.toString())) { 
                    return enumStr;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return this.name;
        }

    }

    public DisplayMode getMode_DisplayMode() {
        return (DisplayMode) _CommonChildDivModeUtil.getMode( this.modes, DisplayMode.class );
    }

    public void setMode_DisplayMode( DisplayMode value ) {
        _CommonChildDivModeUtil.setMode( this.modes, DisplayMode.class , value );
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public TextBoxDate getTxtTeiseiYMD() {
        return this.getJukyushaIdoRenrakuhyoTeisei().getTxtTeiseiYMD();
    }

    @JsonIgnore
    public void  setTxtTeiseiYMD(TextBoxDate txtTeiseiYMD) {
        this.getJukyushaIdoRenrakuhyoTeisei().setTxtTeiseiYMD(txtTeiseiYMD);
    }

    @JsonIgnore
    public RadioButton getRadTeiseiKubunCode() {
        return this.getJukyushaIdoRenrakuhyoTeisei().getRadTeiseiKubunCode();
    }

    @JsonIgnore
    public void  setRadTeiseiKubunCode(RadioButton radTeiseiKubunCode) {
        this.getJukyushaIdoRenrakuhyoTeisei().setRadTeiseiKubunCode(radTeiseiKubunCode);
    }

    @JsonIgnore
    public HorizontalLine getLin3() {
        return this.getJukyushaIdoRenrakuhyoTeisei().getLin3();
    }

    @JsonIgnore
    public void  setLin3(HorizontalLine lin3) {
        this.getJukyushaIdoRenrakuhyoTeisei().setLin3(lin3);
    }

    // </editor-fold>
    //--------------- この行より下にコードを追加してください -------------------

}
