package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.Hihosyosai.Hihosyosai;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashSet;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.jushochitokureirirekilist.JushochiTokureiRirekiList.IJushochiTokureiRirekiListDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.shikakuhenkorireki.ShikakuHenkoRireki.IShikakuHenkoRirekiDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.shisetsunyutaishorirekikanri.IShisetsuNyutaishoRirekiKanriDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.DropDownList;
import jp.co.ndensan.reams.uz.uza.ui.binding.Label;
import jp.co.ndensan.reams.uz.uza.ui.binding.Mode;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBox;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxDate;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ICommonChildDivMode;
import jp.co.ndensan.reams.uz.uza.ui.servlets._CommonChildDivModeUtil;

/**
 * Hihosyosai のクラスファイル 
 * 
 * @author 自動生成
 */
public class HihosyosaiDiv extends Panel implements IHihosyosaiDiv {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：バージョン情報無し">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("lblSyutokubi")
    private Label lblSyutokubi;
    @JsonProperty("lblSyutokutodokedebi")
    private Label lblSyutokutodokedebi;
    @JsonProperty("lblSyutokujiyu")
    private Label lblSyutokujiyu;
    @JsonProperty("lblHihokubun")
    private Label lblHihokubun;
    @JsonProperty("lblSyozaiHokensya")
    private Label lblSyozaiHokensya;
    @JsonProperty("lblSotimotoHokensya")
    private Label lblSotimotoHokensya;
    @JsonProperty("lblKyuHokensya")
    private Label lblKyuHokensya;
    @JsonProperty("lblSyoniNichiji")
    private Label lblSyoniNichiji;
    @JsonProperty("txtSyutokuYMD")
    private TextBoxDate txtSyutokuYMD;
    @JsonProperty("txtSyutokutodokedeYMD")
    private TextBoxDate txtSyutokutodokedeYMD;
    @JsonProperty("ddlSyutokuJiyu")
    private DropDownList ddlSyutokuJiyu;
    @JsonProperty("ddlHihokubun")
    private DropDownList ddlHihokubun;
    @JsonProperty("ddlSyozaiHokensya")
    private DropDownList ddlSyozaiHokensya;
    @JsonProperty("ddlSotimotoHokensya")
    private DropDownList ddlSotimotoHokensya;
    @JsonProperty("ddlKyuHokensya")
    private DropDownList ddlKyuHokensya;
    @JsonProperty("txtSyoninichiji1")
    private TextBox txtSyoninichiji1;
    @JsonProperty("lblSosichibi")
    private Label lblSosichibi;
    @JsonProperty("lblSosichiTodokedebi")
    private Label lblSosichiTodokedebi;
    @JsonProperty("lblSosichiJiyu")
    private Label lblSosichiJiyu;
    @JsonProperty("lblSyoninichibi2")
    private Label lblSyoninichibi2;
    @JsonProperty("txtSosichiYMD")
    private TextBoxDate txtSosichiYMD;
    @JsonProperty("txtSosichiTodokedeYMD")
    private TextBoxDate txtSosichiTodokedeYMD;
    @JsonProperty("ddlSosichiJiyu")
    private DropDownList ddlSosichiJiyu;
    @JsonProperty("txtSyoninichiji2")
    private TextBox txtSyoninichiji2;
    @JsonProperty("tabContainerDetail")
    private tabContainerDetailDiv tabContainerDetail;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getlblSyutokubi
     * @return lblSyutokubi
     */
    @JsonProperty("lblSyutokubi")
    public Label getLblSyutokubi() {
        return lblSyutokubi;
    }

    /*
     * setlblSyutokubi
     * @param lblSyutokubi lblSyutokubi
     */
    @JsonProperty("lblSyutokubi")
    public void setLblSyutokubi(Label lblSyutokubi) {
        this.lblSyutokubi = lblSyutokubi;
    }

    /*
     * getlblSyutokutodokedebi
     * @return lblSyutokutodokedebi
     */
    @JsonProperty("lblSyutokutodokedebi")
    public Label getLblSyutokutodokedebi() {
        return lblSyutokutodokedebi;
    }

    /*
     * setlblSyutokutodokedebi
     * @param lblSyutokutodokedebi lblSyutokutodokedebi
     */
    @JsonProperty("lblSyutokutodokedebi")
    public void setLblSyutokutodokedebi(Label lblSyutokutodokedebi) {
        this.lblSyutokutodokedebi = lblSyutokutodokedebi;
    }

    /*
     * getlblSyutokujiyu
     * @return lblSyutokujiyu
     */
    @JsonProperty("lblSyutokujiyu")
    public Label getLblSyutokujiyu() {
        return lblSyutokujiyu;
    }

    /*
     * setlblSyutokujiyu
     * @param lblSyutokujiyu lblSyutokujiyu
     */
    @JsonProperty("lblSyutokujiyu")
    public void setLblSyutokujiyu(Label lblSyutokujiyu) {
        this.lblSyutokujiyu = lblSyutokujiyu;
    }

    /*
     * getlblHihokubun
     * @return lblHihokubun
     */
    @JsonProperty("lblHihokubun")
    public Label getLblHihokubun() {
        return lblHihokubun;
    }

    /*
     * setlblHihokubun
     * @param lblHihokubun lblHihokubun
     */
    @JsonProperty("lblHihokubun")
    public void setLblHihokubun(Label lblHihokubun) {
        this.lblHihokubun = lblHihokubun;
    }

    /*
     * getlblSyozaiHokensya
     * @return lblSyozaiHokensya
     */
    @JsonProperty("lblSyozaiHokensya")
    public Label getLblSyozaiHokensya() {
        return lblSyozaiHokensya;
    }

    /*
     * setlblSyozaiHokensya
     * @param lblSyozaiHokensya lblSyozaiHokensya
     */
    @JsonProperty("lblSyozaiHokensya")
    public void setLblSyozaiHokensya(Label lblSyozaiHokensya) {
        this.lblSyozaiHokensya = lblSyozaiHokensya;
    }

    /*
     * getlblSotimotoHokensya
     * @return lblSotimotoHokensya
     */
    @JsonProperty("lblSotimotoHokensya")
    public Label getLblSotimotoHokensya() {
        return lblSotimotoHokensya;
    }

    /*
     * setlblSotimotoHokensya
     * @param lblSotimotoHokensya lblSotimotoHokensya
     */
    @JsonProperty("lblSotimotoHokensya")
    public void setLblSotimotoHokensya(Label lblSotimotoHokensya) {
        this.lblSotimotoHokensya = lblSotimotoHokensya;
    }

    /*
     * getlblKyuHokensya
     * @return lblKyuHokensya
     */
    @JsonProperty("lblKyuHokensya")
    public Label getLblKyuHokensya() {
        return lblKyuHokensya;
    }

    /*
     * setlblKyuHokensya
     * @param lblKyuHokensya lblKyuHokensya
     */
    @JsonProperty("lblKyuHokensya")
    public void setLblKyuHokensya(Label lblKyuHokensya) {
        this.lblKyuHokensya = lblKyuHokensya;
    }

    /*
     * getlblSyoniNichiji
     * @return lblSyoniNichiji
     */
    @JsonProperty("lblSyoniNichiji")
    public Label getLblSyoniNichiji() {
        return lblSyoniNichiji;
    }

    /*
     * setlblSyoniNichiji
     * @param lblSyoniNichiji lblSyoniNichiji
     */
    @JsonProperty("lblSyoniNichiji")
    public void setLblSyoniNichiji(Label lblSyoniNichiji) {
        this.lblSyoniNichiji = lblSyoniNichiji;
    }

    /*
     * gettxtSyutokuYMD
     * @return txtSyutokuYMD
     */
    @JsonProperty("txtSyutokuYMD")
    public TextBoxDate getTxtSyutokuYMD() {
        return txtSyutokuYMD;
    }

    /*
     * settxtSyutokuYMD
     * @param txtSyutokuYMD txtSyutokuYMD
     */
    @JsonProperty("txtSyutokuYMD")
    public void setTxtSyutokuYMD(TextBoxDate txtSyutokuYMD) {
        this.txtSyutokuYMD = txtSyutokuYMD;
    }

    /*
     * gettxtSyutokutodokedeYMD
     * @return txtSyutokutodokedeYMD
     */
    @JsonProperty("txtSyutokutodokedeYMD")
    public TextBoxDate getTxtSyutokutodokedeYMD() {
        return txtSyutokutodokedeYMD;
    }

    /*
     * settxtSyutokutodokedeYMD
     * @param txtSyutokutodokedeYMD txtSyutokutodokedeYMD
     */
    @JsonProperty("txtSyutokutodokedeYMD")
    public void setTxtSyutokutodokedeYMD(TextBoxDate txtSyutokutodokedeYMD) {
        this.txtSyutokutodokedeYMD = txtSyutokutodokedeYMD;
    }

    /*
     * getddlSyutokuJiyu
     * @return ddlSyutokuJiyu
     */
    @JsonProperty("ddlSyutokuJiyu")
    public DropDownList getDdlSyutokuJiyu() {
        return ddlSyutokuJiyu;
    }

    /*
     * setddlSyutokuJiyu
     * @param ddlSyutokuJiyu ddlSyutokuJiyu
     */
    @JsonProperty("ddlSyutokuJiyu")
    public void setDdlSyutokuJiyu(DropDownList ddlSyutokuJiyu) {
        this.ddlSyutokuJiyu = ddlSyutokuJiyu;
    }

    /*
     * getddlHihokubun
     * @return ddlHihokubun
     */
    @JsonProperty("ddlHihokubun")
    public DropDownList getDdlHihokubun() {
        return ddlHihokubun;
    }

    /*
     * setddlHihokubun
     * @param ddlHihokubun ddlHihokubun
     */
    @JsonProperty("ddlHihokubun")
    public void setDdlHihokubun(DropDownList ddlHihokubun) {
        this.ddlHihokubun = ddlHihokubun;
    }

    /*
     * getddlSyozaiHokensya
     * @return ddlSyozaiHokensya
     */
    @JsonProperty("ddlSyozaiHokensya")
    public DropDownList getDdlSyozaiHokensya() {
        return ddlSyozaiHokensya;
    }

    /*
     * setddlSyozaiHokensya
     * @param ddlSyozaiHokensya ddlSyozaiHokensya
     */
    @JsonProperty("ddlSyozaiHokensya")
    public void setDdlSyozaiHokensya(DropDownList ddlSyozaiHokensya) {
        this.ddlSyozaiHokensya = ddlSyozaiHokensya;
    }

    /*
     * getddlSotimotoHokensya
     * @return ddlSotimotoHokensya
     */
    @JsonProperty("ddlSotimotoHokensya")
    public DropDownList getDdlSotimotoHokensya() {
        return ddlSotimotoHokensya;
    }

    /*
     * setddlSotimotoHokensya
     * @param ddlSotimotoHokensya ddlSotimotoHokensya
     */
    @JsonProperty("ddlSotimotoHokensya")
    public void setDdlSotimotoHokensya(DropDownList ddlSotimotoHokensya) {
        this.ddlSotimotoHokensya = ddlSotimotoHokensya;
    }

    /*
     * getddlKyuHokensya
     * @return ddlKyuHokensya
     */
    @JsonProperty("ddlKyuHokensya")
    public DropDownList getDdlKyuHokensya() {
        return ddlKyuHokensya;
    }

    /*
     * setddlKyuHokensya
     * @param ddlKyuHokensya ddlKyuHokensya
     */
    @JsonProperty("ddlKyuHokensya")
    public void setDdlKyuHokensya(DropDownList ddlKyuHokensya) {
        this.ddlKyuHokensya = ddlKyuHokensya;
    }

    /*
     * gettxtSyoninichiji1
     * @return txtSyoninichiji1
     */
    @JsonProperty("txtSyoninichiji1")
    public TextBox getTxtSyoninichiji1() {
        return txtSyoninichiji1;
    }

    /*
     * settxtSyoninichiji1
     * @param txtSyoninichiji1 txtSyoninichiji1
     */
    @JsonProperty("txtSyoninichiji1")
    public void setTxtSyoninichiji1(TextBox txtSyoninichiji1) {
        this.txtSyoninichiji1 = txtSyoninichiji1;
    }

    /*
     * getlblSosichibi
     * @return lblSosichibi
     */
    @JsonProperty("lblSosichibi")
    public Label getLblSosichibi() {
        return lblSosichibi;
    }

    /*
     * setlblSosichibi
     * @param lblSosichibi lblSosichibi
     */
    @JsonProperty("lblSosichibi")
    public void setLblSosichibi(Label lblSosichibi) {
        this.lblSosichibi = lblSosichibi;
    }

    /*
     * getlblSosichiTodokedebi
     * @return lblSosichiTodokedebi
     */
    @JsonProperty("lblSosichiTodokedebi")
    public Label getLblSosichiTodokedebi() {
        return lblSosichiTodokedebi;
    }

    /*
     * setlblSosichiTodokedebi
     * @param lblSosichiTodokedebi lblSosichiTodokedebi
     */
    @JsonProperty("lblSosichiTodokedebi")
    public void setLblSosichiTodokedebi(Label lblSosichiTodokedebi) {
        this.lblSosichiTodokedebi = lblSosichiTodokedebi;
    }

    /*
     * getlblSosichiJiyu
     * @return lblSosichiJiyu
     */
    @JsonProperty("lblSosichiJiyu")
    public Label getLblSosichiJiyu() {
        return lblSosichiJiyu;
    }

    /*
     * setlblSosichiJiyu
     * @param lblSosichiJiyu lblSosichiJiyu
     */
    @JsonProperty("lblSosichiJiyu")
    public void setLblSosichiJiyu(Label lblSosichiJiyu) {
        this.lblSosichiJiyu = lblSosichiJiyu;
    }

    /*
     * getlblSyoninichibi2
     * @return lblSyoninichibi2
     */
    @JsonProperty("lblSyoninichibi2")
    public Label getLblSyoninichibi2() {
        return lblSyoninichibi2;
    }

    /*
     * setlblSyoninichibi2
     * @param lblSyoninichibi2 lblSyoninichibi2
     */
    @JsonProperty("lblSyoninichibi2")
    public void setLblSyoninichibi2(Label lblSyoninichibi2) {
        this.lblSyoninichibi2 = lblSyoninichibi2;
    }

    /*
     * gettxtSosichiYMD
     * @return txtSosichiYMD
     */
    @JsonProperty("txtSosichiYMD")
    public TextBoxDate getTxtSosichiYMD() {
        return txtSosichiYMD;
    }

    /*
     * settxtSosichiYMD
     * @param txtSosichiYMD txtSosichiYMD
     */
    @JsonProperty("txtSosichiYMD")
    public void setTxtSosichiYMD(TextBoxDate txtSosichiYMD) {
        this.txtSosichiYMD = txtSosichiYMD;
    }

    /*
     * gettxtSosichiTodokedeYMD
     * @return txtSosichiTodokedeYMD
     */
    @JsonProperty("txtSosichiTodokedeYMD")
    public TextBoxDate getTxtSosichiTodokedeYMD() {
        return txtSosichiTodokedeYMD;
    }

    /*
     * settxtSosichiTodokedeYMD
     * @param txtSosichiTodokedeYMD txtSosichiTodokedeYMD
     */
    @JsonProperty("txtSosichiTodokedeYMD")
    public void setTxtSosichiTodokedeYMD(TextBoxDate txtSosichiTodokedeYMD) {
        this.txtSosichiTodokedeYMD = txtSosichiTodokedeYMD;
    }

    /*
     * getddlSosichiJiyu
     * @return ddlSosichiJiyu
     */
    @JsonProperty("ddlSosichiJiyu")
    public DropDownList getDdlSosichiJiyu() {
        return ddlSosichiJiyu;
    }

    /*
     * setddlSosichiJiyu
     * @param ddlSosichiJiyu ddlSosichiJiyu
     */
    @JsonProperty("ddlSosichiJiyu")
    public void setDdlSosichiJiyu(DropDownList ddlSosichiJiyu) {
        this.ddlSosichiJiyu = ddlSosichiJiyu;
    }

    /*
     * gettxtSyoninichiji2
     * @return txtSyoninichiji2
     */
    @JsonProperty("txtSyoninichiji2")
    public TextBox getTxtSyoninichiji2() {
        return txtSyoninichiji2;
    }

    /*
     * settxtSyoninichiji2
     * @param txtSyoninichiji2 txtSyoninichiji2
     */
    @JsonProperty("txtSyoninichiji2")
    public void setTxtSyoninichiji2(TextBox txtSyoninichiji2) {
        this.txtSyoninichiji2 = txtSyoninichiji2;
    }

    /*
     * gettabContainerDetail
     * @return tabContainerDetail
     */
    @JsonProperty("tabContainerDetail")
    public tabContainerDetailDiv getTabContainerDetail() {
        return tabContainerDetail;
    }

    /*
     * settabContainerDetail
     * @param tabContainerDetail tabContainerDetail
     */
    @JsonProperty("tabContainerDetail")
    public void setTabContainerDetail(tabContainerDetailDiv tabContainerDetail) {
        this.tabContainerDetail = tabContainerDetail;
    }

    /*
     * [共有子DIVモード]
     */
    @JsonProperty("modes")
    private HashSet<Mode> modes;

    public static enum DisplayType implements ICommonChildDivMode {

        shokai("shokai"),
        toroku("toroku"),
        teiseitoroku_jyusyoti("teiseitoroku_jyusyoti"),
        teiseitoroku_shikaku("teiseitoroku_shikaku");

        private final String name;

        private DisplayType(final String name) {
            this.name = name;
        }

        public static DisplayType getEnum(String str) {
            DisplayType[] enumArray = DisplayType.values();

            for (DisplayType enumStr : enumArray) {
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

    public DisplayType getMode_DisplayType() {
        return (DisplayType) _CommonChildDivModeUtil.getMode( this.modes, DisplayType.class );
    }

    public void setMode_DisplayType( DisplayType value ) {
        _CommonChildDivModeUtil.setMode( this.modes, DisplayType.class , value );
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public tabPnlJyusyotiDiv getTabPnlJyusyoti() {
        return this.getTabContainerDetail().getTabPnlJyusyoti();
    }

    @JsonIgnore
    public void  setTabPnlJyusyoti(tabPnlJyusyotiDiv tabPnlJyusyoti) {
        this.getTabContainerDetail().setTabPnlJyusyoti(tabPnlJyusyoti);
    }

    @JsonIgnore
    public IJushochiTokureiRirekiListDiv getCcdJyusyotiTokure() {
        return this.getTabContainerDetail().getTabPnlJyusyoti().getCcdJyusyotiTokure();
    }

    @JsonIgnore
    public tabPnlShikakuDiv getTabPnlShikaku() {
        return this.getTabContainerDetail().getTabPnlShikaku();
    }

    @JsonIgnore
    public void  setTabPnlShikaku(tabPnlShikakuDiv tabPnlShikaku) {
        this.getTabContainerDetail().setTabPnlShikaku(tabPnlShikaku);
    }

    @JsonIgnore
    public IShikakuHenkoRirekiDiv getCcdShikakuKanrenIdo() {
        return this.getTabContainerDetail().getTabPnlShikaku().getCcdShikakuKanrenIdo();
    }

    @JsonIgnore
    public tabPnlShisetuDiv getTabPnlShisetu() {
        return this.getTabContainerDetail().getTabPnlShisetu();
    }

    @JsonIgnore
    public void  setTabPnlShisetu(tabPnlShisetuDiv tabPnlShisetu) {
        this.getTabContainerDetail().setTabPnlShisetu(tabPnlShisetu);
    }

    @JsonIgnore
    public IShisetsuNyutaishoRirekiKanriDiv getCcdShisetuNyutaisyo() {
        return this.getTabContainerDetail().getTabPnlShisetu().getCcdShisetuNyutaisyo();
    }

    // </editor-fold>
    //--------------- この行より下にコードを追加してください -------------------

}