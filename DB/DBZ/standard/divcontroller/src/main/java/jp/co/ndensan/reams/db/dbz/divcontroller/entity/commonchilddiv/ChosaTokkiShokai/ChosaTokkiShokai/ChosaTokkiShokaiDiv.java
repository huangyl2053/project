package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.ChosaTokkiShokai.ChosaTokkiShokai;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import java.util.ArrayList;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.business.core.basic.Image;
import jp.co.ndensan.reams.db.dbz.business.core.basic.NinteichosahyoTokkijiko;
import jp.co.ndensan.reams.db.dbz.definition.core.ninteichosatokkijikou.NinteiChosaTokkiJikou;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.GenponMaskKubun;
import jp.co.ndensan.reams.db.dbz.service.core.basic.ImageManager;
import jp.co.ndensan.reams.db.dbz.service.core.basic.NinteichosahyoTokkijikoManager;
import jp.co.ndensan.reams.db.dbz.service.core.chosatokkishokai.ChosaTokkiShokaiFinder;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemName;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemPath;
import jp.co.ndensan.reams.uz.uza.cooperation.SharedFile;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.ReadOnlySharedFileEntryDescriptor;
import jp.co.ndensan.reams.uz.uza.io.File;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.lang.ApplicationException;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.Label;
import jp.co.ndensan.reams.uz.uza.ui.binding.StaticImage;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBox;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxMultiLine;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxNum;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * ChosaTokkiShokai のクラスファイル
 *
 * @reamsid_L DBE-3000-200 liangbc
 */
public class ChosaTokkiShokaiDiv extends Panel implements IChosaTokkiShokaiDiv {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-11-10_12-10-23">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtTokkiJikouNo")
    private TextBox txtTokkiJikouNo;
    @JsonProperty("txtTokkiJikouName")
    private TextBox txtTokkiJikouName;
    @JsonProperty("textPanel")
    private textPanelDiv textPanel;
    @JsonProperty("imgPanel1")
    private imgPanel1Div imgPanel1;
    @JsonProperty("imgPanel2")
    private imgPanel2Div imgPanel2;
    @JsonProperty("btnReturn")
    private Button btnReturn;
    @JsonProperty("shinseishoKanriNo")
    private RString shinseishoKanriNo;
    @JsonProperty("maxRemban")
    private RString maxRemban;
    @JsonProperty("maxTokkijikoNo")
    private RString maxTokkijikoNo;
    @JsonProperty("minTokkijikoNo")
    private RString minTokkijikoNo;
    @JsonProperty("rembanPageNo")
    private RString rembanPageNo;
    @JsonProperty("tokkijikoNoPageNo")
    private RString tokkijikoNoPageNo;
    @JsonProperty("ninteichosaRirekiNo")
    private RString ninteichosaRirekiNo;
    @JsonProperty("ninteichosaTokkijikoNoList")
    private RString ninteichosaTokkijikoNoList;
    @JsonProperty("downLoadFilePath")
    private RString downLoadFilePath;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * gettxtTokkiJikouNo
     * @return txtTokkiJikouNo
     */
    @JsonProperty("txtTokkiJikouNo")
    public TextBox getTxtTokkiJikouNo() {
        return txtTokkiJikouNo;
    }

    /*
     * settxtTokkiJikouNo
     * @param txtTokkiJikouNo txtTokkiJikouNo
     */
    @JsonProperty("txtTokkiJikouNo")
    public void setTxtTokkiJikouNo(TextBox txtTokkiJikouNo) {
        this.txtTokkiJikouNo = txtTokkiJikouNo;
    }

    /*
     * gettxtTokkiJikouName
     * @return txtTokkiJikouName
     */
    @JsonProperty("txtTokkiJikouName")
    public TextBox getTxtTokkiJikouName() {
        return txtTokkiJikouName;
    }

    /*
     * settxtTokkiJikouName
     * @param txtTokkiJikouName txtTokkiJikouName
     */
    @JsonProperty("txtTokkiJikouName")
    public void setTxtTokkiJikouName(TextBox txtTokkiJikouName) {
        this.txtTokkiJikouName = txtTokkiJikouName;
    }

    /*
     * gettextPanel
     * @return textPanel
     */
    @JsonProperty("textPanel")
    public textPanelDiv getTextPanel() {
        return textPanel;
    }

    /*
     * settextPanel
     * @param textPanel textPanel
     */
    @JsonProperty("textPanel")
    public void setTextPanel(textPanelDiv textPanel) {
        this.textPanel = textPanel;
    }

    /*
     * getimgPanel1
     * @return imgPanel1
     */
    @JsonProperty("imgPanel1")
    public imgPanel1Div getImgPanel1() {
        return imgPanel1;
    }

    /*
     * setimgPanel1
     * @param imgPanel1 imgPanel1
     */
    @JsonProperty("imgPanel1")
    public void setImgPanel1(imgPanel1Div imgPanel1) {
        this.imgPanel1 = imgPanel1;
    }

    /*
     * getimgPanel2
     * @return imgPanel2
     */
    @JsonProperty("imgPanel2")
    public imgPanel2Div getImgPanel2() {
        return imgPanel2;
    }

    /*
     * setimgPanel2
     * @param imgPanel2 imgPanel2
     */
    @JsonProperty("imgPanel2")
    public void setImgPanel2(imgPanel2Div imgPanel2) {
        this.imgPanel2 = imgPanel2;
    }

    /*
     * getbtnReturn
     * @return btnReturn
     */
    @JsonProperty("btnReturn")
    public Button getBtnReturn() {
        return btnReturn;
    }

    /*
     * setbtnReturn
     * @param btnReturn btnReturn
     */
    @JsonProperty("btnReturn")
    public void setBtnReturn(Button btnReturn) {
        this.btnReturn = btnReturn;
    }

    /*
     * getshinseishoKanriNo
     * @return shinseishoKanriNo
     */
    @JsonProperty("shinseishoKanriNo")
    public RString getShinseishoKanriNo() {
        return shinseishoKanriNo;
    }

    /*
     * setshinseishoKanriNo
     * @param shinseishoKanriNo shinseishoKanriNo
     */
    @JsonProperty("shinseishoKanriNo")
    public void setShinseishoKanriNo(RString shinseishoKanriNo) {
        this.shinseishoKanriNo = shinseishoKanriNo;
    }

    /*
     * getmaxRemban
     * @return maxRemban
     */
    @JsonProperty("maxRemban")
    public RString getMaxRemban() {
        return maxRemban;
    }

    /*
     * setmaxRemban
     * @param maxRemban maxRemban
     */
    @JsonProperty("maxRemban")
    public void setMaxRemban(RString maxRemban) {
        this.maxRemban = maxRemban;
    }

    /*
     * getmaxTokkijikoNo
     * @return maxTokkijikoNo
     */
    @JsonProperty("maxTokkijikoNo")
    public RString getMaxTokkijikoNo() {
        return maxTokkijikoNo;
    }

    /*
     * setmaxTokkijikoNo
     * @param maxTokkijikoNo maxTokkijikoNo
     */
    @JsonProperty("maxTokkijikoNo")
    public void setMaxTokkijikoNo(RString maxTokkijikoNo) {
        this.maxTokkijikoNo = maxTokkijikoNo;
    }

    /*
     * getminTokkijikoNo
     * @return minTokkijikoNo
     */
    @JsonProperty("minTokkijikoNo")
    public RString getMinTokkijikoNo() {
        return minTokkijikoNo;
    }

    /*
     * setminTokkijikoNo
     * @param minTokkijikoNo minTokkijikoNo
     */
    @JsonProperty("minTokkijikoNo")
    public void setMinTokkijikoNo(RString minTokkijikoNo) {
        this.minTokkijikoNo = minTokkijikoNo;
    }

    /*
     * getrembanPageNo
     * @return rembanPageNo
     */
    @JsonProperty("rembanPageNo")
    public RString getRembanPageNo() {
        return rembanPageNo;
    }

    /*
     * setrembanPageNo
     * @param rembanPageNo rembanPageNo
     */
    @JsonProperty("rembanPageNo")
    public void setRembanPageNo(RString rembanPageNo) {
        this.rembanPageNo = rembanPageNo;
    }

    /*
     * gettokkijikoNoPageNo
     * @return tokkijikoNoPageNo
     */
    @JsonProperty("tokkijikoNoPageNo")
    public RString getTokkijikoNoPageNo() {
        return tokkijikoNoPageNo;
    }

    /*
     * settokkijikoNoPageNo
     * @param tokkijikoNoPageNo tokkijikoNoPageNo
     */
    @JsonProperty("tokkijikoNoPageNo")
    public void setTokkijikoNoPageNo(RString tokkijikoNoPageNo) {
        this.tokkijikoNoPageNo = tokkijikoNoPageNo;
    }

    /*
     * getninteichosaRirekiNo
     * @return ninteichosaRirekiNo
     */
    @JsonProperty("ninteichosaRirekiNo")
    public RString getNinteichosaRirekiNo() {
        return ninteichosaRirekiNo;
    }

    /*
     * setninteichosaRirekiNo
     * @param ninteichosaRirekiNo ninteichosaRirekiNo
     */
    @JsonProperty("ninteichosaRirekiNo")
    public void setNinteichosaRirekiNo(RString ninteichosaRirekiNo) {
        this.ninteichosaRirekiNo = ninteichosaRirekiNo;
    }

    /*
     * getninteichosaTokkijikoNoList
     * @return ninteichosaTokkijikoNoList
     */
    @JsonProperty("ninteichosaTokkijikoNoList")
    public RString getNinteichosaTokkijikoNoList() {
        return ninteichosaTokkijikoNoList;
    }

    /*
     * setninteichosaTokkijikoNoList
     * @param ninteichosaTokkijikoNoList ninteichosaTokkijikoNoList
     */
    @JsonProperty("ninteichosaTokkijikoNoList")
    public void setNinteichosaTokkijikoNoList(RString ninteichosaTokkijikoNoList) {
        this.ninteichosaTokkijikoNoList = ninteichosaTokkijikoNoList;
    }

    /*
     * getdownLoadFilePath
     * @return downLoadFilePath
     */
    @JsonProperty("downLoadFilePath")
    public RString getDownLoadFilePath() {
        return downLoadFilePath;
    }

    /*
     * setdownLoadFilePath
     * @param downLoadFilePath downLoadFilePath
     */
    @JsonProperty("downLoadFilePath")
    public void setDownLoadFilePath(RString downLoadFilePath) {
        this.downLoadFilePath = downLoadFilePath;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public Label getLblTextGenpon() {
        return this.getTextPanel().getLblTextGenpon();
    }

    @JsonIgnore
    public void  setLblTextGenpon(Label lblTextGenpon) {
        this.getTextPanel().setLblTextGenpon(lblTextGenpon);
    }

    @JsonIgnore
    public Label getLblTextMask() {
        return this.getTextPanel().getLblTextMask();
    }

    @JsonIgnore
    public void  setLblTextMask(Label lblTextMask) {
        this.getTextPanel().setLblTextMask(lblTextMask);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo1() {
        return this.getTextPanel().getTxtTokkijikoNo1();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo1(TextBox txtTokkijikoNo1) {
        this.getTextPanel().setTxtTokkijikoNo1(txtTokkijikoNo1);
    }

    @JsonIgnore
    public Label getLbl1() {
        return this.getTextPanel().getLbl1();
    }

    @JsonIgnore
    public void  setLbl1(Label lbl1) {
        this.getTextPanel().setLbl1(lbl1);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban1() {
        return this.getTextPanel().getTxtRemban1();
    }

    @JsonIgnore
    public void  setTxtRemban1(TextBoxNum txtRemban1) {
        this.getTextPanel().setTxtRemban1(txtRemban1);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextGenpo1() {
        return this.getTextPanel().getTxtTextGenpo1();
    }

    @JsonIgnore
    public void  setTxtTextGenpo1(TextBoxMultiLine txtTextGenpo1) {
        this.getTextPanel().setTxtTextGenpo1(txtTextGenpo1);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextMask1() {
        return this.getTextPanel().getTxtTextMask1();
    }

    @JsonIgnore
    public void  setTxtTextMask1(TextBoxMultiLine txtTextMask1) {
        this.getTextPanel().setTxtTextMask1(txtTextMask1);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo2() {
        return this.getTextPanel().getTxtTokkijikoNo2();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo2(TextBox txtTokkijikoNo2) {
        this.getTextPanel().setTxtTokkijikoNo2(txtTokkijikoNo2);
    }

    @JsonIgnore
    public Label getLbl2() {
        return this.getTextPanel().getLbl2();
    }

    @JsonIgnore
    public void  setLbl2(Label lbl2) {
        this.getTextPanel().setLbl2(lbl2);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban2() {
        return this.getTextPanel().getTxtRemban2();
    }

    @JsonIgnore
    public void  setTxtRemban2(TextBoxNum txtRemban2) {
        this.getTextPanel().setTxtRemban2(txtRemban2);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextGenpo2() {
        return this.getTextPanel().getTxtTextGenpo2();
    }

    @JsonIgnore
    public void  setTxtTextGenpo2(TextBoxMultiLine txtTextGenpo2) {
        this.getTextPanel().setTxtTextGenpo2(txtTextGenpo2);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextMask2() {
        return this.getTextPanel().getTxtTextMask2();
    }

    @JsonIgnore
    public void  setTxtTextMask2(TextBoxMultiLine txtTextMask2) {
        this.getTextPanel().setTxtTextMask2(txtTextMask2);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo3() {
        return this.getTextPanel().getTxtTokkijikoNo3();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo3(TextBox txtTokkijikoNo3) {
        this.getTextPanel().setTxtTokkijikoNo3(txtTokkijikoNo3);
    }

    @JsonIgnore
    public Label getLbl3() {
        return this.getTextPanel().getLbl3();
    }

    @JsonIgnore
    public void  setLbl3(Label lbl3) {
        this.getTextPanel().setLbl3(lbl3);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban3() {
        return this.getTextPanel().getTxtRemban3();
    }

    @JsonIgnore
    public void  setTxtRemban3(TextBoxNum txtRemban3) {
        this.getTextPanel().setTxtRemban3(txtRemban3);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextGenpo3() {
        return this.getTextPanel().getTxtTextGenpo3();
    }

    @JsonIgnore
    public void  setTxtTextGenpo3(TextBoxMultiLine txtTextGenpo3) {
        this.getTextPanel().setTxtTextGenpo3(txtTextGenpo3);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextMask3() {
        return this.getTextPanel().getTxtTextMask3();
    }

    @JsonIgnore
    public void  setTxtTextMask3(TextBoxMultiLine txtTextMask3) {
        this.getTextPanel().setTxtTextMask3(txtTextMask3);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo4() {
        return this.getTextPanel().getTxtTokkijikoNo4();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo4(TextBox txtTokkijikoNo4) {
        this.getTextPanel().setTxtTokkijikoNo4(txtTokkijikoNo4);
    }

    @JsonIgnore
    public Label getLbl4() {
        return this.getTextPanel().getLbl4();
    }

    @JsonIgnore
    public void  setLbl4(Label lbl4) {
        this.getTextPanel().setLbl4(lbl4);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban4() {
        return this.getTextPanel().getTxtRemban4();
    }

    @JsonIgnore
    public void  setTxtRemban4(TextBoxNum txtRemban4) {
        this.getTextPanel().setTxtRemban4(txtRemban4);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextGenpo4() {
        return this.getTextPanel().getTxtTextGenpo4();
    }

    @JsonIgnore
    public void  setTxtTextGenpo4(TextBoxMultiLine txtTextGenpo4) {
        this.getTextPanel().setTxtTextGenpo4(txtTextGenpo4);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextMask4() {
        return this.getTextPanel().getTxtTextMask4();
    }

    @JsonIgnore
    public void  setTxtTextMask4(TextBoxMultiLine txtTextMask4) {
        this.getTextPanel().setTxtTextMask4(txtTextMask4);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo5() {
        return this.getTextPanel().getTxtTokkijikoNo5();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo5(TextBox txtTokkijikoNo5) {
        this.getTextPanel().setTxtTokkijikoNo5(txtTokkijikoNo5);
    }

    @JsonIgnore
    public Label getLbl5() {
        return this.getTextPanel().getLbl5();
    }

    @JsonIgnore
    public void  setLbl5(Label lbl5) {
        this.getTextPanel().setLbl5(lbl5);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban5() {
        return this.getTextPanel().getTxtRemban5();
    }

    @JsonIgnore
    public void  setTxtRemban5(TextBoxNum txtRemban5) {
        this.getTextPanel().setTxtRemban5(txtRemban5);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextGenpo5() {
        return this.getTextPanel().getTxtTextGenpo5();
    }

    @JsonIgnore
    public void  setTxtTextGenpo5(TextBoxMultiLine txtTextGenpo5) {
        this.getTextPanel().setTxtTextGenpo5(txtTextGenpo5);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextMask5() {
        return this.getTextPanel().getTxtTextMask5();
    }

    @JsonIgnore
    public void  setTxtTextMask5(TextBoxMultiLine txtTextMask5) {
        this.getTextPanel().setTxtTextMask5(txtTextMask5);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo6() {
        return this.getTextPanel().getTxtTokkijikoNo6();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo6(TextBox txtTokkijikoNo6) {
        this.getTextPanel().setTxtTokkijikoNo6(txtTokkijikoNo6);
    }

    @JsonIgnore
    public Label getLbl6() {
        return this.getTextPanel().getLbl6();
    }

    @JsonIgnore
    public void  setLbl6(Label lbl6) {
        this.getTextPanel().setLbl6(lbl6);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban6() {
        return this.getTextPanel().getTxtRemban6();
    }

    @JsonIgnore
    public void  setTxtRemban6(TextBoxNum txtRemban6) {
        this.getTextPanel().setTxtRemban6(txtRemban6);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextGenpo6() {
        return this.getTextPanel().getTxtTextGenpo6();
    }

    @JsonIgnore
    public void  setTxtTextGenpo6(TextBoxMultiLine txtTextGenpo6) {
        this.getTextPanel().setTxtTextGenpo6(txtTextGenpo6);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextMask6() {
        return this.getTextPanel().getTxtTextMask6();
    }

    @JsonIgnore
    public void  setTxtTextMask6(TextBoxMultiLine txtTextMask6) {
        this.getTextPanel().setTxtTextMask6(txtTextMask6);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo7() {
        return this.getTextPanel().getTxtTokkijikoNo7();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo7(TextBox txtTokkijikoNo7) {
        this.getTextPanel().setTxtTokkijikoNo7(txtTokkijikoNo7);
    }

    @JsonIgnore
    public Label getLbl7() {
        return this.getTextPanel().getLbl7();
    }

    @JsonIgnore
    public void  setLbl7(Label lbl7) {
        this.getTextPanel().setLbl7(lbl7);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban7() {
        return this.getTextPanel().getTxtRemban7();
    }

    @JsonIgnore
    public void  setTxtRemban7(TextBoxNum txtRemban7) {
        this.getTextPanel().setTxtRemban7(txtRemban7);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextGenpo7() {
        return this.getTextPanel().getTxtTextGenpo7();
    }

    @JsonIgnore
    public void  setTxtTextGenpo7(TextBoxMultiLine txtTextGenpo7) {
        this.getTextPanel().setTxtTextGenpo7(txtTextGenpo7);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextMask7() {
        return this.getTextPanel().getTxtTextMask7();
    }

    @JsonIgnore
    public void  setTxtTextMask7(TextBoxMultiLine txtTextMask7) {
        this.getTextPanel().setTxtTextMask7(txtTextMask7);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo8() {
        return this.getTextPanel().getTxtTokkijikoNo8();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo8(TextBox txtTokkijikoNo8) {
        this.getTextPanel().setTxtTokkijikoNo8(txtTokkijikoNo8);
    }

    @JsonIgnore
    public Label getLbl8() {
        return this.getTextPanel().getLbl8();
    }

    @JsonIgnore
    public void  setLbl8(Label lbl8) {
        this.getTextPanel().setLbl8(lbl8);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban8() {
        return this.getTextPanel().getTxtRemban8();
    }

    @JsonIgnore
    public void  setTxtRemban8(TextBoxNum txtRemban8) {
        this.getTextPanel().setTxtRemban8(txtRemban8);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextGenpo8() {
        return this.getTextPanel().getTxtTextGenpo8();
    }

    @JsonIgnore
    public void  setTxtTextGenpo8(TextBoxMultiLine txtTextGenpo8) {
        this.getTextPanel().setTxtTextGenpo8(txtTextGenpo8);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextMask8() {
        return this.getTextPanel().getTxtTextMask8();
    }

    @JsonIgnore
    public void  setTxtTextMask8(TextBoxMultiLine txtTextMask8) {
        this.getTextPanel().setTxtTextMask8(txtTextMask8);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo9() {
        return this.getTextPanel().getTxtTokkijikoNo9();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo9(TextBox txtTokkijikoNo9) {
        this.getTextPanel().setTxtTokkijikoNo9(txtTokkijikoNo9);
    }

    @JsonIgnore
    public Label getLbl9() {
        return this.getTextPanel().getLbl9();
    }

    @JsonIgnore
    public void  setLbl9(Label lbl9) {
        this.getTextPanel().setLbl9(lbl9);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban9() {
        return this.getTextPanel().getTxtRemban9();
    }

    @JsonIgnore
    public void  setTxtRemban9(TextBoxNum txtRemban9) {
        this.getTextPanel().setTxtRemban9(txtRemban9);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextGenpo9() {
        return this.getTextPanel().getTxtTextGenpo9();
    }

    @JsonIgnore
    public void  setTxtTextGenpo9(TextBoxMultiLine txtTextGenpo9) {
        this.getTextPanel().setTxtTextGenpo9(txtTextGenpo9);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextMask9() {
        return this.getTextPanel().getTxtTextMask9();
    }

    @JsonIgnore
    public void  setTxtTextMask9(TextBoxMultiLine txtTextMask9) {
        this.getTextPanel().setTxtTextMask9(txtTextMask9);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo10() {
        return this.getTextPanel().getTxtTokkijikoNo10();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo10(TextBox txtTokkijikoNo10) {
        this.getTextPanel().setTxtTokkijikoNo10(txtTokkijikoNo10);
    }

    @JsonIgnore
    public Label getLbl10() {
        return this.getTextPanel().getLbl10();
    }

    @JsonIgnore
    public void  setLbl10(Label lbl10) {
        this.getTextPanel().setLbl10(lbl10);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban10() {
        return this.getTextPanel().getTxtRemban10();
    }

    @JsonIgnore
    public void  setTxtRemban10(TextBoxNum txtRemban10) {
        this.getTextPanel().setTxtRemban10(txtRemban10);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextGenpo10() {
        return this.getTextPanel().getTxtTextGenpo10();
    }

    @JsonIgnore
    public void  setTxtTextGenpo10(TextBoxMultiLine txtTextGenpo10) {
        this.getTextPanel().setTxtTextGenpo10(txtTextGenpo10);
    }

    @JsonIgnore
    public TextBoxMultiLine getTxtTextMask10() {
        return this.getTextPanel().getTxtTextMask10();
    }

    @JsonIgnore
    public void  setTxtTextMask10(TextBoxMultiLine txtTextMask10) {
        this.getTextPanel().setTxtTextMask10(txtTextMask10);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo11() {
        return this.getImgPanel1().getTxtTokkijikoNo11();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo11(TextBox txtTokkijikoNo11) {
        this.getImgPanel1().setTxtTokkijikoNo11(txtTokkijikoNo11);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo16() {
        return this.getImgPanel1().getTxtTokkijikoNo16();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo16(TextBox txtTokkijikoNo16) {
        this.getImgPanel1().setTxtTokkijikoNo16(txtTokkijikoNo16);
    }

    @JsonIgnore
    public Label getLbl16() {
        return this.getImgPanel1().getLbl16();
    }

    @JsonIgnore
    public void  setLbl16(Label lbl16) {
        this.getImgPanel1().setLbl16(lbl16);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban16() {
        return this.getImgPanel1().getTxtRemban16();
    }

    @JsonIgnore
    public void  setTxtRemban16(TextBoxNum txtRemban16) {
        this.getImgPanel1().setTxtRemban16(txtRemban16);
    }

    @JsonIgnore
    public genpoPanel6Div getGenpoPanel6() {
        return this.getImgPanel1().getGenpoPanel6();
    }

    @JsonIgnore
    public void  setGenpoPanel6(genpoPanel6Div genpoPanel6) {
        this.getImgPanel1().setGenpoPanel6(genpoPanel6);
    }

    @JsonIgnore
    public StaticImage getImgGenpo6() {
        return this.getImgPanel1().getGenpoPanel6().getImgGenpo6();
    }

    @JsonIgnore
    public void  setImgGenpo6(StaticImage imgGenpo6) {
        this.getImgPanel1().getGenpoPanel6().setImgGenpo6(imgGenpo6);
    }

    @JsonIgnore
    public Label getLbl11() {
        return this.getImgPanel1().getLbl11();
    }

    @JsonIgnore
    public void  setLbl11(Label lbl11) {
        this.getImgPanel1().setLbl11(lbl11);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban11() {
        return this.getImgPanel1().getTxtRemban11();
    }

    @JsonIgnore
    public void  setTxtRemban11(TextBoxNum txtRemban11) {
        this.getImgPanel1().setTxtRemban11(txtRemban11);
    }

    @JsonIgnore
    public genpoPanel1Div getGenpoPanel1() {
        return this.getImgPanel1().getGenpoPanel1();
    }

    @JsonIgnore
    public void  setGenpoPanel1(genpoPanel1Div genpoPanel1) {
        this.getImgPanel1().setGenpoPanel1(genpoPanel1);
    }

    @JsonIgnore
    public StaticImage getImgGenpo1() {
        return this.getImgPanel1().getGenpoPanel1().getImgGenpo1();
    }

    @JsonIgnore
    public void  setImgGenpo1(StaticImage imgGenpo1) {
        this.getImgPanel1().getGenpoPanel1().setImgGenpo1(imgGenpo1);
    }

    @JsonIgnore
    public maskPanel1Div getMaskPanel1() {
        return this.getImgPanel1().getMaskPanel1();
    }

    @JsonIgnore
    public void  setMaskPanel1(maskPanel1Div maskPanel1) {
        this.getImgPanel1().setMaskPanel1(maskPanel1);
    }

    @JsonIgnore
    public StaticImage getImgMasking1() {
        return this.getImgPanel1().getMaskPanel1().getImgMasking1();
    }

    @JsonIgnore
    public void  setImgMasking1(StaticImage imgMasking1) {
        this.getImgPanel1().getMaskPanel1().setImgMasking1(imgMasking1);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo12() {
        return this.getImgPanel1().getTxtTokkijikoNo12();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo12(TextBox txtTokkijikoNo12) {
        this.getImgPanel1().setTxtTokkijikoNo12(txtTokkijikoNo12);
    }

    @JsonIgnore
    public Label getLbl12() {
        return this.getImgPanel1().getLbl12();
    }

    @JsonIgnore
    public void  setLbl12(Label lbl12) {
        this.getImgPanel1().setLbl12(lbl12);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban12() {
        return this.getImgPanel1().getTxtRemban12();
    }

    @JsonIgnore
    public void  setTxtRemban12(TextBoxNum txtRemban12) {
        this.getImgPanel1().setTxtRemban12(txtRemban12);
    }

    @JsonIgnore
    public genpoPanel2Div getGenpoPanel2() {
        return this.getImgPanel1().getGenpoPanel2();
    }

    @JsonIgnore
    public void  setGenpoPanel2(genpoPanel2Div genpoPanel2) {
        this.getImgPanel1().setGenpoPanel2(genpoPanel2);
    }

    @JsonIgnore
    public StaticImage getImgGenpo2() {
        return this.getImgPanel1().getGenpoPanel2().getImgGenpo2();
    }

    @JsonIgnore
    public void  setImgGenpo2(StaticImage imgGenpo2) {
        this.getImgPanel1().getGenpoPanel2().setImgGenpo2(imgGenpo2);
    }

    @JsonIgnore
    public maskPanel2Div getMaskPanel2() {
        return this.getImgPanel1().getMaskPanel2();
    }

    @JsonIgnore
    public void  setMaskPanel2(maskPanel2Div maskPanel2) {
        this.getImgPanel1().setMaskPanel2(maskPanel2);
    }

    @JsonIgnore
    public StaticImage getImgMasking2() {
        return this.getImgPanel1().getMaskPanel2().getImgMasking2();
    }

    @JsonIgnore
    public void  setImgMasking2(StaticImage imgMasking2) {
        this.getImgPanel1().getMaskPanel2().setImgMasking2(imgMasking2);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo13() {
        return this.getImgPanel1().getTxtTokkijikoNo13();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo13(TextBox txtTokkijikoNo13) {
        this.getImgPanel1().setTxtTokkijikoNo13(txtTokkijikoNo13);
    }

    @JsonIgnore
    public Label getLbl13() {
        return this.getImgPanel1().getLbl13();
    }

    @JsonIgnore
    public void  setLbl13(Label lbl13) {
        this.getImgPanel1().setLbl13(lbl13);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban13() {
        return this.getImgPanel1().getTxtRemban13();
    }

    @JsonIgnore
    public void  setTxtRemban13(TextBoxNum txtRemban13) {
        this.getImgPanel1().setTxtRemban13(txtRemban13);
    }

    @JsonIgnore
    public genpoPanel3Div getGenpoPanel3() {
        return this.getImgPanel1().getGenpoPanel3();
    }

    @JsonIgnore
    public void  setGenpoPanel3(genpoPanel3Div genpoPanel3) {
        this.getImgPanel1().setGenpoPanel3(genpoPanel3);
    }

    @JsonIgnore
    public StaticImage getImgGenpo3() {
        return this.getImgPanel1().getGenpoPanel3().getImgGenpo3();
    }

    @JsonIgnore
    public void  setImgGenpo3(StaticImage imgGenpo3) {
        this.getImgPanel1().getGenpoPanel3().setImgGenpo3(imgGenpo3);
    }

    @JsonIgnore
    public maskPanel3Div getMaskPanel3() {
        return this.getImgPanel1().getMaskPanel3();
    }

    @JsonIgnore
    public void  setMaskPanel3(maskPanel3Div maskPanel3) {
        this.getImgPanel1().setMaskPanel3(maskPanel3);
    }

    @JsonIgnore
    public StaticImage getImgMasking3() {
        return this.getImgPanel1().getMaskPanel3().getImgMasking3();
    }

    @JsonIgnore
    public void  setImgMasking3(StaticImage imgMasking3) {
        this.getImgPanel1().getMaskPanel3().setImgMasking3(imgMasking3);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo14() {
        return this.getImgPanel1().getTxtTokkijikoNo14();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo14(TextBox txtTokkijikoNo14) {
        this.getImgPanel1().setTxtTokkijikoNo14(txtTokkijikoNo14);
    }

    @JsonIgnore
    public Label getLbl14() {
        return this.getImgPanel1().getLbl14();
    }

    @JsonIgnore
    public void  setLbl14(Label lbl14) {
        this.getImgPanel1().setLbl14(lbl14);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban14() {
        return this.getImgPanel1().getTxtRemban14();
    }

    @JsonIgnore
    public void  setTxtRemban14(TextBoxNum txtRemban14) {
        this.getImgPanel1().setTxtRemban14(txtRemban14);
    }

    @JsonIgnore
    public genpoPanel4Div getGenpoPanel4() {
        return this.getImgPanel1().getGenpoPanel4();
    }

    @JsonIgnore
    public void  setGenpoPanel4(genpoPanel4Div genpoPanel4) {
        this.getImgPanel1().setGenpoPanel4(genpoPanel4);
    }

    @JsonIgnore
    public StaticImage getImgGenpo4() {
        return this.getImgPanel1().getGenpoPanel4().getImgGenpo4();
    }

    @JsonIgnore
    public void  setImgGenpo4(StaticImage imgGenpo4) {
        this.getImgPanel1().getGenpoPanel4().setImgGenpo4(imgGenpo4);
    }

    @JsonIgnore
    public maskPanel4Div getMaskPanel4() {
        return this.getImgPanel1().getMaskPanel4();
    }

    @JsonIgnore
    public void  setMaskPanel4(maskPanel4Div maskPanel4) {
        this.getImgPanel1().setMaskPanel4(maskPanel4);
    }

    @JsonIgnore
    public StaticImage getImgMasking4() {
        return this.getImgPanel1().getMaskPanel4().getImgMasking4();
    }

    @JsonIgnore
    public void  setImgMasking4(StaticImage imgMasking4) {
        this.getImgPanel1().getMaskPanel4().setImgMasking4(imgMasking4);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo15() {
        return this.getImgPanel1().getTxtTokkijikoNo15();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo15(TextBox txtTokkijikoNo15) {
        this.getImgPanel1().setTxtTokkijikoNo15(txtTokkijikoNo15);
    }

    @JsonIgnore
    public Label getLbl15() {
        return this.getImgPanel1().getLbl15();
    }

    @JsonIgnore
    public void  setLbl15(Label lbl15) {
        this.getImgPanel1().setLbl15(lbl15);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban15() {
        return this.getImgPanel1().getTxtRemban15();
    }

    @JsonIgnore
    public void  setTxtRemban15(TextBoxNum txtRemban15) {
        this.getImgPanel1().setTxtRemban15(txtRemban15);
    }

    @JsonIgnore
    public genpoPanel5Div getGenpoPanel5() {
        return this.getImgPanel1().getGenpoPanel5();
    }

    @JsonIgnore
    public void  setGenpoPanel5(genpoPanel5Div genpoPanel5) {
        this.getImgPanel1().setGenpoPanel5(genpoPanel5);
    }

    @JsonIgnore
    public StaticImage getImgGenpo5() {
        return this.getImgPanel1().getGenpoPanel5().getImgGenpo5();
    }

    @JsonIgnore
    public void  setImgGenpo5(StaticImage imgGenpo5) {
        this.getImgPanel1().getGenpoPanel5().setImgGenpo5(imgGenpo5);
    }

    @JsonIgnore
    public maskPanel5Div getMaskPanel5() {
        return this.getImgPanel1().getMaskPanel5();
    }

    @JsonIgnore
    public void  setMaskPanel5(maskPanel5Div maskPanel5) {
        this.getImgPanel1().setMaskPanel5(maskPanel5);
    }

    @JsonIgnore
    public StaticImage getImgMasking5() {
        return this.getImgPanel1().getMaskPanel5().getImgMasking5();
    }

    @JsonIgnore
    public void  setImgMasking5(StaticImage imgMasking5) {
        this.getImgPanel1().getMaskPanel5().setImgMasking5(imgMasking5);
    }

    @JsonIgnore
    public maskPanel6Div getMaskPanel6() {
        return this.getImgPanel1().getMaskPanel6();
    }

    @JsonIgnore
    public void  setMaskPanel6(maskPanel6Div maskPanel6) {
        this.getImgPanel1().setMaskPanel6(maskPanel6);
    }

    @JsonIgnore
    public StaticImage getImgMasking6() {
        return this.getImgPanel1().getMaskPanel6().getImgMasking6();
    }

    @JsonIgnore
    public void  setImgMasking6(StaticImage imgMasking6) {
        this.getImgPanel1().getMaskPanel6().setImgMasking6(imgMasking6);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo17() {
        return this.getImgPanel1().getTxtTokkijikoNo17();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo17(TextBox txtTokkijikoNo17) {
        this.getImgPanel1().setTxtTokkijikoNo17(txtTokkijikoNo17);
    }

    @JsonIgnore
    public Label getLbl17() {
        return this.getImgPanel1().getLbl17();
    }

    @JsonIgnore
    public void  setLbl17(Label lbl17) {
        this.getImgPanel1().setLbl17(lbl17);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban17() {
        return this.getImgPanel1().getTxtRemban17();
    }

    @JsonIgnore
    public void  setTxtRemban17(TextBoxNum txtRemban17) {
        this.getImgPanel1().setTxtRemban17(txtRemban17);
    }

    @JsonIgnore
    public genpoPanel7Div getGenpoPanel7() {
        return this.getImgPanel1().getGenpoPanel7();
    }

    @JsonIgnore
    public void  setGenpoPanel7(genpoPanel7Div genpoPanel7) {
        this.getImgPanel1().setGenpoPanel7(genpoPanel7);
    }

    @JsonIgnore
    public StaticImage getImgGenpo7() {
        return this.getImgPanel1().getGenpoPanel7().getImgGenpo7();
    }

    @JsonIgnore
    public void  setImgGenpo7(StaticImage imgGenpo7) {
        this.getImgPanel1().getGenpoPanel7().setImgGenpo7(imgGenpo7);
    }

    @JsonIgnore
    public maskPanel7Div getMaskPanel7() {
        return this.getImgPanel1().getMaskPanel7();
    }

    @JsonIgnore
    public void  setMaskPanel7(maskPanel7Div maskPanel7) {
        this.getImgPanel1().setMaskPanel7(maskPanel7);
    }

    @JsonIgnore
    public StaticImage getImgMasking7() {
        return this.getImgPanel1().getMaskPanel7().getImgMasking7();
    }

    @JsonIgnore
    public void  setImgMasking7(StaticImage imgMasking7) {
        this.getImgPanel1().getMaskPanel7().setImgMasking7(imgMasking7);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo18() {
        return this.getImgPanel1().getTxtTokkijikoNo18();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo18(TextBox txtTokkijikoNo18) {
        this.getImgPanel1().setTxtTokkijikoNo18(txtTokkijikoNo18);
    }

    @JsonIgnore
    public Label getLbl18() {
        return this.getImgPanel1().getLbl18();
    }

    @JsonIgnore
    public void  setLbl18(Label lbl18) {
        this.getImgPanel1().setLbl18(lbl18);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban18() {
        return this.getImgPanel1().getTxtRemban18();
    }

    @JsonIgnore
    public void  setTxtRemban18(TextBoxNum txtRemban18) {
        this.getImgPanel1().setTxtRemban18(txtRemban18);
    }

    @JsonIgnore
    public genpoPanel8Div getGenpoPanel8() {
        return this.getImgPanel1().getGenpoPanel8();
    }

    @JsonIgnore
    public void  setGenpoPanel8(genpoPanel8Div genpoPanel8) {
        this.getImgPanel1().setGenpoPanel8(genpoPanel8);
    }

    @JsonIgnore
    public StaticImage getImgGenpo8() {
        return this.getImgPanel1().getGenpoPanel8().getImgGenpo8();
    }

    @JsonIgnore
    public void  setImgGenpo8(StaticImage imgGenpo8) {
        this.getImgPanel1().getGenpoPanel8().setImgGenpo8(imgGenpo8);
    }

    @JsonIgnore
    public maskPanel8Div getMaskPanel8() {
        return this.getImgPanel1().getMaskPanel8();
    }

    @JsonIgnore
    public void  setMaskPanel8(maskPanel8Div maskPanel8) {
        this.getImgPanel1().setMaskPanel8(maskPanel8);
    }

    @JsonIgnore
    public StaticImage getImgMasking8() {
        return this.getImgPanel1().getMaskPanel8().getImgMasking8();
    }

    @JsonIgnore
    public void  setImgMasking8(StaticImage imgMasking8) {
        this.getImgPanel1().getMaskPanel8().setImgMasking8(imgMasking8);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo19() {
        return this.getImgPanel1().getTxtTokkijikoNo19();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo19(TextBox txtTokkijikoNo19) {
        this.getImgPanel1().setTxtTokkijikoNo19(txtTokkijikoNo19);
    }

    @JsonIgnore
    public Label getLbl19() {
        return this.getImgPanel1().getLbl19();
    }

    @JsonIgnore
    public void  setLbl19(Label lbl19) {
        this.getImgPanel1().setLbl19(lbl19);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban19() {
        return this.getImgPanel1().getTxtRemban19();
    }

    @JsonIgnore
    public void  setTxtRemban19(TextBoxNum txtRemban19) {
        this.getImgPanel1().setTxtRemban19(txtRemban19);
    }

    @JsonIgnore
    public genpoPanel9Div getGenpoPanel9() {
        return this.getImgPanel1().getGenpoPanel9();
    }

    @JsonIgnore
    public void  setGenpoPanel9(genpoPanel9Div genpoPanel9) {
        this.getImgPanel1().setGenpoPanel9(genpoPanel9);
    }

    @JsonIgnore
    public StaticImage getImgGenpo9() {
        return this.getImgPanel1().getGenpoPanel9().getImgGenpo9();
    }

    @JsonIgnore
    public void  setImgGenpo9(StaticImage imgGenpo9) {
        this.getImgPanel1().getGenpoPanel9().setImgGenpo9(imgGenpo9);
    }

    @JsonIgnore
    public maskPanel9Div getMaskPanel9() {
        return this.getImgPanel1().getMaskPanel9();
    }

    @JsonIgnore
    public void  setMaskPanel9(maskPanel9Div maskPanel9) {
        this.getImgPanel1().setMaskPanel9(maskPanel9);
    }

    @JsonIgnore
    public StaticImage getImgMasking9() {
        return this.getImgPanel1().getMaskPanel9().getImgMasking9();
    }

    @JsonIgnore
    public void  setImgMasking9(StaticImage imgMasking9) {
        this.getImgPanel1().getMaskPanel9().setImgMasking9(imgMasking9);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo20() {
        return this.getImgPanel1().getTxtTokkijikoNo20();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo20(TextBox txtTokkijikoNo20) {
        this.getImgPanel1().setTxtTokkijikoNo20(txtTokkijikoNo20);
    }

    @JsonIgnore
    public Label getLbl20() {
        return this.getImgPanel1().getLbl20();
    }

    @JsonIgnore
    public void  setLbl20(Label lbl20) {
        this.getImgPanel1().setLbl20(lbl20);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban20() {
        return this.getImgPanel1().getTxtRemban20();
    }

    @JsonIgnore
    public void  setTxtRemban20(TextBoxNum txtRemban20) {
        this.getImgPanel1().setTxtRemban20(txtRemban20);
    }

    @JsonIgnore
    public genpoPanel10Div getGenpoPanel10() {
        return this.getImgPanel1().getGenpoPanel10();
    }

    @JsonIgnore
    public void  setGenpoPanel10(genpoPanel10Div genpoPanel10) {
        this.getImgPanel1().setGenpoPanel10(genpoPanel10);
    }

    @JsonIgnore
    public StaticImage getImgGenpo10() {
        return this.getImgPanel1().getGenpoPanel10().getImgGenpo10();
    }

    @JsonIgnore
    public void  setImgGenpo10(StaticImage imgGenpo10) {
        this.getImgPanel1().getGenpoPanel10().setImgGenpo10(imgGenpo10);
    }

    @JsonIgnore
    public maskPanel10Div getMaskPanel10() {
        return this.getImgPanel1().getMaskPanel10();
    }

    @JsonIgnore
    public void  setMaskPanel10(maskPanel10Div maskPanel10) {
        this.getImgPanel1().setMaskPanel10(maskPanel10);
    }

    @JsonIgnore
    public StaticImage getImgMasking10() {
        return this.getImgPanel1().getMaskPanel10().getImgMasking10();
    }

    @JsonIgnore
    public void  setImgMasking10(StaticImage imgMasking10) {
        this.getImgPanel1().getMaskPanel10().setImgMasking10(imgMasking10);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo21() {
        return this.getImgPanel2().getTxtTokkijikoNo21();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo21(TextBox txtTokkijikoNo21) {
        this.getImgPanel2().setTxtTokkijikoNo21(txtTokkijikoNo21);
    }

    @JsonIgnore
    public Label getLbl21() {
        return this.getImgPanel2().getLbl21();
    }

    @JsonIgnore
    public void  setLbl21(Label lbl21) {
        this.getImgPanel2().setLbl21(lbl21);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban21() {
        return this.getImgPanel2().getTxtRemban21();
    }

    @JsonIgnore
    public void  setTxtRemban21(TextBoxNum txtRemban21) {
        this.getImgPanel2().setTxtRemban21(txtRemban21);
    }

    @JsonIgnore
    public genpoPanel11Div getGenpoPanel11() {
        return this.getImgPanel2().getGenpoPanel11();
    }

    @JsonIgnore
    public void  setGenpoPanel11(genpoPanel11Div genpoPanel11) {
        this.getImgPanel2().setGenpoPanel11(genpoPanel11);
    }

    @JsonIgnore
    public StaticImage getImgGenpo11() {
        return this.getImgPanel2().getGenpoPanel11().getImgGenpo11();
    }

    @JsonIgnore
    public void  setImgGenpo11(StaticImage imgGenpo11) {
        this.getImgPanel2().getGenpoPanel11().setImgGenpo11(imgGenpo11);
    }

    @JsonIgnore
    public maskPanel11Div getMaskPanel11() {
        return this.getImgPanel2().getMaskPanel11();
    }

    @JsonIgnore
    public void  setMaskPanel11(maskPanel11Div maskPanel11) {
        this.getImgPanel2().setMaskPanel11(maskPanel11);
    }

    @JsonIgnore
    public StaticImage getImgMasking11() {
        return this.getImgPanel2().getMaskPanel11().getImgMasking11();
    }

    @JsonIgnore
    public void  setImgMasking11(StaticImage imgMasking11) {
        this.getImgPanel2().getMaskPanel11().setImgMasking11(imgMasking11);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo22() {
        return this.getImgPanel2().getTxtTokkijikoNo22();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo22(TextBox txtTokkijikoNo22) {
        this.getImgPanel2().setTxtTokkijikoNo22(txtTokkijikoNo22);
    }

    @JsonIgnore
    public Label getLbl22() {
        return this.getImgPanel2().getLbl22();
    }

    @JsonIgnore
    public void  setLbl22(Label lbl22) {
        this.getImgPanel2().setLbl22(lbl22);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban22() {
        return this.getImgPanel2().getTxtRemban22();
    }

    @JsonIgnore
    public void  setTxtRemban22(TextBoxNum txtRemban22) {
        this.getImgPanel2().setTxtRemban22(txtRemban22);
    }

    @JsonIgnore
    public genpoPanel12Div getGenpoPanel12() {
        return this.getImgPanel2().getGenpoPanel12();
    }

    @JsonIgnore
    public void  setGenpoPanel12(genpoPanel12Div genpoPanel12) {
        this.getImgPanel2().setGenpoPanel12(genpoPanel12);
    }

    @JsonIgnore
    public StaticImage getImgGenpo12() {
        return this.getImgPanel2().getGenpoPanel12().getImgGenpo12();
    }

    @JsonIgnore
    public void  setImgGenpo12(StaticImage imgGenpo12) {
        this.getImgPanel2().getGenpoPanel12().setImgGenpo12(imgGenpo12);
    }

    @JsonIgnore
    public maskPanel12Div getMaskPanel12() {
        return this.getImgPanel2().getMaskPanel12();
    }

    @JsonIgnore
    public void  setMaskPanel12(maskPanel12Div maskPanel12) {
        this.getImgPanel2().setMaskPanel12(maskPanel12);
    }

    @JsonIgnore
    public StaticImage getImgMasking12() {
        return this.getImgPanel2().getMaskPanel12().getImgMasking12();
    }

    @JsonIgnore
    public void  setImgMasking12(StaticImage imgMasking12) {
        this.getImgPanel2().getMaskPanel12().setImgMasking12(imgMasking12);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo23() {
        return this.getImgPanel2().getTxtTokkijikoNo23();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo23(TextBox txtTokkijikoNo23) {
        this.getImgPanel2().setTxtTokkijikoNo23(txtTokkijikoNo23);
    }

    @JsonIgnore
    public Label getLbl23() {
        return this.getImgPanel2().getLbl23();
    }

    @JsonIgnore
    public void  setLbl23(Label lbl23) {
        this.getImgPanel2().setLbl23(lbl23);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban23() {
        return this.getImgPanel2().getTxtRemban23();
    }

    @JsonIgnore
    public void  setTxtRemban23(TextBoxNum txtRemban23) {
        this.getImgPanel2().setTxtRemban23(txtRemban23);
    }

    @JsonIgnore
    public genpoPanel13Div getGenpoPanel13() {
        return this.getImgPanel2().getGenpoPanel13();
    }

    @JsonIgnore
    public void  setGenpoPanel13(genpoPanel13Div genpoPanel13) {
        this.getImgPanel2().setGenpoPanel13(genpoPanel13);
    }

    @JsonIgnore
    public StaticImage getImgGenpo13() {
        return this.getImgPanel2().getGenpoPanel13().getImgGenpo13();
    }

    @JsonIgnore
    public void  setImgGenpo13(StaticImage imgGenpo13) {
        this.getImgPanel2().getGenpoPanel13().setImgGenpo13(imgGenpo13);
    }

    @JsonIgnore
    public maskPanel13Div getMaskPanel13() {
        return this.getImgPanel2().getMaskPanel13();
    }

    @JsonIgnore
    public void  setMaskPanel13(maskPanel13Div maskPanel13) {
        this.getImgPanel2().setMaskPanel13(maskPanel13);
    }

    @JsonIgnore
    public StaticImage getImgMasking13() {
        return this.getImgPanel2().getMaskPanel13().getImgMasking13();
    }

    @JsonIgnore
    public void  setImgMasking13(StaticImage imgMasking13) {
        this.getImgPanel2().getMaskPanel13().setImgMasking13(imgMasking13);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo24() {
        return this.getImgPanel2().getTxtTokkijikoNo24();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo24(TextBox txtTokkijikoNo24) {
        this.getImgPanel2().setTxtTokkijikoNo24(txtTokkijikoNo24);
    }

    @JsonIgnore
    public Label getLbl24() {
        return this.getImgPanel2().getLbl24();
    }

    @JsonIgnore
    public void  setLbl24(Label lbl24) {
        this.getImgPanel2().setLbl24(lbl24);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban24() {
        return this.getImgPanel2().getTxtRemban24();
    }

    @JsonIgnore
    public void  setTxtRemban24(TextBoxNum txtRemban24) {
        this.getImgPanel2().setTxtRemban24(txtRemban24);
    }

    @JsonIgnore
    public genpoPanel14Div getGenpoPanel14() {
        return this.getImgPanel2().getGenpoPanel14();
    }

    @JsonIgnore
    public void  setGenpoPanel14(genpoPanel14Div genpoPanel14) {
        this.getImgPanel2().setGenpoPanel14(genpoPanel14);
    }

    @JsonIgnore
    public StaticImage getImgGenpo14() {
        return this.getImgPanel2().getGenpoPanel14().getImgGenpo14();
    }

    @JsonIgnore
    public void  setImgGenpo14(StaticImage imgGenpo14) {
        this.getImgPanel2().getGenpoPanel14().setImgGenpo14(imgGenpo14);
    }

    @JsonIgnore
    public maskPanel14Div getMaskPanel14() {
        return this.getImgPanel2().getMaskPanel14();
    }

    @JsonIgnore
    public void  setMaskPanel14(maskPanel14Div maskPanel14) {
        this.getImgPanel2().setMaskPanel14(maskPanel14);
    }

    @JsonIgnore
    public StaticImage getImgMasking14() {
        return this.getImgPanel2().getMaskPanel14().getImgMasking14();
    }

    @JsonIgnore
    public void  setImgMasking14(StaticImage imgMasking14) {
        this.getImgPanel2().getMaskPanel14().setImgMasking14(imgMasking14);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo25() {
        return this.getImgPanel2().getTxtTokkijikoNo25();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo25(TextBox txtTokkijikoNo25) {
        this.getImgPanel2().setTxtTokkijikoNo25(txtTokkijikoNo25);
    }

    @JsonIgnore
    public Label getLbl25() {
        return this.getImgPanel2().getLbl25();
    }

    @JsonIgnore
    public void  setLbl25(Label lbl25) {
        this.getImgPanel2().setLbl25(lbl25);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban25() {
        return this.getImgPanel2().getTxtRemban25();
    }

    @JsonIgnore
    public void  setTxtRemban25(TextBoxNum txtRemban25) {
        this.getImgPanel2().setTxtRemban25(txtRemban25);
    }

    @JsonIgnore
    public genpoPanel15Div getGenpoPanel15() {
        return this.getImgPanel2().getGenpoPanel15();
    }

    @JsonIgnore
    public void  setGenpoPanel15(genpoPanel15Div genpoPanel15) {
        this.getImgPanel2().setGenpoPanel15(genpoPanel15);
    }

    @JsonIgnore
    public StaticImage getImgGenpo15() {
        return this.getImgPanel2().getGenpoPanel15().getImgGenpo15();
    }

    @JsonIgnore
    public void  setImgGenpo15(StaticImage imgGenpo15) {
        this.getImgPanel2().getGenpoPanel15().setImgGenpo15(imgGenpo15);
    }

    @JsonIgnore
    public maskPanel15Div getMaskPanel15() {
        return this.getImgPanel2().getMaskPanel15();
    }

    @JsonIgnore
    public void  setMaskPanel15(maskPanel15Div maskPanel15) {
        this.getImgPanel2().setMaskPanel15(maskPanel15);
    }

    @JsonIgnore
    public StaticImage getImgMasking15() {
        return this.getImgPanel2().getMaskPanel15().getImgMasking15();
    }

    @JsonIgnore
    public void  setImgMasking15(StaticImage imgMasking15) {
        this.getImgPanel2().getMaskPanel15().setImgMasking15(imgMasking15);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo26() {
        return this.getImgPanel2().getTxtTokkijikoNo26();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo26(TextBox txtTokkijikoNo26) {
        this.getImgPanel2().setTxtTokkijikoNo26(txtTokkijikoNo26);
    }

    @JsonIgnore
    public Label getLbl26() {
        return this.getImgPanel2().getLbl26();
    }

    @JsonIgnore
    public void  setLbl26(Label lbl26) {
        this.getImgPanel2().setLbl26(lbl26);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban26() {
        return this.getImgPanel2().getTxtRemban26();
    }

    @JsonIgnore
    public void  setTxtRemban26(TextBoxNum txtRemban26) {
        this.getImgPanel2().setTxtRemban26(txtRemban26);
    }

    @JsonIgnore
    public genpoPanel16Div getGenpoPanel16() {
        return this.getImgPanel2().getGenpoPanel16();
    }

    @JsonIgnore
    public void  setGenpoPanel16(genpoPanel16Div genpoPanel16) {
        this.getImgPanel2().setGenpoPanel16(genpoPanel16);
    }

    @JsonIgnore
    public StaticImage getImgGenpo16() {
        return this.getImgPanel2().getGenpoPanel16().getImgGenpo16();
    }

    @JsonIgnore
    public void  setImgGenpo16(StaticImage imgGenpo16) {
        this.getImgPanel2().getGenpoPanel16().setImgGenpo16(imgGenpo16);
    }

    @JsonIgnore
    public maskPanel16Div getMaskPanel16() {
        return this.getImgPanel2().getMaskPanel16();
    }

    @JsonIgnore
    public void  setMaskPanel16(maskPanel16Div maskPanel16) {
        this.getImgPanel2().setMaskPanel16(maskPanel16);
    }

    @JsonIgnore
    public StaticImage getImgMasking16() {
        return this.getImgPanel2().getMaskPanel16().getImgMasking16();
    }

    @JsonIgnore
    public void  setImgMasking16(StaticImage imgMasking16) {
        this.getImgPanel2().getMaskPanel16().setImgMasking16(imgMasking16);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo27() {
        return this.getImgPanel2().getTxtTokkijikoNo27();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo27(TextBox txtTokkijikoNo27) {
        this.getImgPanel2().setTxtTokkijikoNo27(txtTokkijikoNo27);
    }

    @JsonIgnore
    public Label getLbl27() {
        return this.getImgPanel2().getLbl27();
    }

    @JsonIgnore
    public void  setLbl27(Label lbl27) {
        this.getImgPanel2().setLbl27(lbl27);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban27() {
        return this.getImgPanel2().getTxtRemban27();
    }

    @JsonIgnore
    public void  setTxtRemban27(TextBoxNum txtRemban27) {
        this.getImgPanel2().setTxtRemban27(txtRemban27);
    }

    @JsonIgnore
    public genpoPanel17Div getGenpoPanel17() {
        return this.getImgPanel2().getGenpoPanel17();
    }

    @JsonIgnore
    public void  setGenpoPanel17(genpoPanel17Div genpoPanel17) {
        this.getImgPanel2().setGenpoPanel17(genpoPanel17);
    }

    @JsonIgnore
    public StaticImage getImgGenpo17() {
        return this.getImgPanel2().getGenpoPanel17().getImgGenpo17();
    }

    @JsonIgnore
    public void  setImgGenpo17(StaticImage imgGenpo17) {
        this.getImgPanel2().getGenpoPanel17().setImgGenpo17(imgGenpo17);
    }

    @JsonIgnore
    public maskPanel17Div getMaskPanel17() {
        return this.getImgPanel2().getMaskPanel17();
    }

    @JsonIgnore
    public void  setMaskPanel17(maskPanel17Div maskPanel17) {
        this.getImgPanel2().setMaskPanel17(maskPanel17);
    }

    @JsonIgnore
    public StaticImage getImgMasking17() {
        return this.getImgPanel2().getMaskPanel17().getImgMasking17();
    }

    @JsonIgnore
    public void  setImgMasking17(StaticImage imgMasking17) {
        this.getImgPanel2().getMaskPanel17().setImgMasking17(imgMasking17);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo28() {
        return this.getImgPanel2().getTxtTokkijikoNo28();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo28(TextBox txtTokkijikoNo28) {
        this.getImgPanel2().setTxtTokkijikoNo28(txtTokkijikoNo28);
    }

    @JsonIgnore
    public Label getLbl28() {
        return this.getImgPanel2().getLbl28();
    }

    @JsonIgnore
    public void  setLbl28(Label lbl28) {
        this.getImgPanel2().setLbl28(lbl28);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban28() {
        return this.getImgPanel2().getTxtRemban28();
    }

    @JsonIgnore
    public void  setTxtRemban28(TextBoxNum txtRemban28) {
        this.getImgPanel2().setTxtRemban28(txtRemban28);
    }

    @JsonIgnore
    public genpoPanel18Div getGenpoPanel18() {
        return this.getImgPanel2().getGenpoPanel18();
    }

    @JsonIgnore
    public void  setGenpoPanel18(genpoPanel18Div genpoPanel18) {
        this.getImgPanel2().setGenpoPanel18(genpoPanel18);
    }

    @JsonIgnore
    public StaticImage getImgGenpo18() {
        return this.getImgPanel2().getGenpoPanel18().getImgGenpo18();
    }

    @JsonIgnore
    public void  setImgGenpo18(StaticImage imgGenpo18) {
        this.getImgPanel2().getGenpoPanel18().setImgGenpo18(imgGenpo18);
    }

    @JsonIgnore
    public maskPanel18Div getMaskPanel18() {
        return this.getImgPanel2().getMaskPanel18();
    }

    @JsonIgnore
    public void  setMaskPanel18(maskPanel18Div maskPanel18) {
        this.getImgPanel2().setMaskPanel18(maskPanel18);
    }

    @JsonIgnore
    public StaticImage getImgMasking18() {
        return this.getImgPanel2().getMaskPanel18().getImgMasking18();
    }

    @JsonIgnore
    public void  setImgMasking18(StaticImage imgMasking18) {
        this.getImgPanel2().getMaskPanel18().setImgMasking18(imgMasking18);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo29() {
        return this.getImgPanel2().getTxtTokkijikoNo29();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo29(TextBox txtTokkijikoNo29) {
        this.getImgPanel2().setTxtTokkijikoNo29(txtTokkijikoNo29);
    }

    @JsonIgnore
    public Label getLbl29() {
        return this.getImgPanel2().getLbl29();
    }

    @JsonIgnore
    public void  setLbl29(Label lbl29) {
        this.getImgPanel2().setLbl29(lbl29);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban29() {
        return this.getImgPanel2().getTxtRemban29();
    }

    @JsonIgnore
    public void  setTxtRemban29(TextBoxNum txtRemban29) {
        this.getImgPanel2().setTxtRemban29(txtRemban29);
    }

    @JsonIgnore
    public genpoPanel19Div getGenpoPanel19() {
        return this.getImgPanel2().getGenpoPanel19();
    }

    @JsonIgnore
    public void  setGenpoPanel19(genpoPanel19Div genpoPanel19) {
        this.getImgPanel2().setGenpoPanel19(genpoPanel19);
    }

    @JsonIgnore
    public StaticImage getImgGenpo19() {
        return this.getImgPanel2().getGenpoPanel19().getImgGenpo19();
    }

    @JsonIgnore
    public void  setImgGenpo19(StaticImage imgGenpo19) {
        this.getImgPanel2().getGenpoPanel19().setImgGenpo19(imgGenpo19);
    }

    @JsonIgnore
    public maskPanel19Div getMaskPanel19() {
        return this.getImgPanel2().getMaskPanel19();
    }

    @JsonIgnore
    public void  setMaskPanel19(maskPanel19Div maskPanel19) {
        this.getImgPanel2().setMaskPanel19(maskPanel19);
    }

    @JsonIgnore
    public StaticImage getImgMasking19() {
        return this.getImgPanel2().getMaskPanel19().getImgMasking19();
    }

    @JsonIgnore
    public void  setImgMasking19(StaticImage imgMasking19) {
        this.getImgPanel2().getMaskPanel19().setImgMasking19(imgMasking19);
    }

    @JsonIgnore
    public TextBox getTxtTokkijikoNo30() {
        return this.getImgPanel2().getTxtTokkijikoNo30();
    }

    @JsonIgnore
    public void  setTxtTokkijikoNo30(TextBox txtTokkijikoNo30) {
        this.getImgPanel2().setTxtTokkijikoNo30(txtTokkijikoNo30);
    }

    @JsonIgnore
    public Label getLbl30() {
        return this.getImgPanel2().getLbl30();
    }

    @JsonIgnore
    public void  setLbl30(Label lbl30) {
        this.getImgPanel2().setLbl30(lbl30);
    }

    @JsonIgnore
    public TextBoxNum getTxtRemban30() {
        return this.getImgPanel2().getTxtRemban30();
    }

    @JsonIgnore
    public void  setTxtRemban30(TextBoxNum txtRemban30) {
        this.getImgPanel2().setTxtRemban30(txtRemban30);
    }

    @JsonIgnore
    public genpoPanel20Div getGenpoPanel20() {
        return this.getImgPanel2().getGenpoPanel20();
    }

    @JsonIgnore
    public void  setGenpoPanel20(genpoPanel20Div genpoPanel20) {
        this.getImgPanel2().setGenpoPanel20(genpoPanel20);
    }

    @JsonIgnore
    public StaticImage getImgGenpo20() {
        return this.getImgPanel2().getGenpoPanel20().getImgGenpo20();
    }

    @JsonIgnore
    public void  setImgGenpo20(StaticImage imgGenpo20) {
        this.getImgPanel2().getGenpoPanel20().setImgGenpo20(imgGenpo20);
    }

    @JsonIgnore
    public maskPanel20Div getMaskPanel20() {
        return this.getImgPanel2().getMaskPanel20();
    }

    @JsonIgnore
    public void  setMaskPanel20(maskPanel20Div maskPanel20) {
        this.getImgPanel2().setMaskPanel20(maskPanel20);
    }

    @JsonIgnore
    public StaticImage getImgMasking20() {
        return this.getImgPanel2().getMaskPanel20().getImgMasking20();
    }

    @JsonIgnore
    public void  setImgMasking20(StaticImage imgMasking20) {
        this.getImgPanel2().getMaskPanel20().setImgMasking20(imgMasking20);
    }

    // </editor-fold>
    //--------------- この行より下にコードを追加してください -------------------
    @Override
    @JsonIgnore
    public void onLoad(ShinseishoKanriNo 申請書管理番号, int 認定調査依頼履歴番号, ArrayList<RString> 認定調査特記事項番号List) {
        NinteichosahyoTokkijikoManager manager = InstanceProvider.create(NinteichosahyoTokkijikoManager.class);
        ArrayList<NinteichosahyoTokkijiko> list = manager.get調査特記事項(申請書管理番号, 認定調査依頼履歴番号, 認定調査特記事項番号List);
        if (list.isEmpty()) {
            throw new ApplicationException(UrErrorMessages.対象データなし.getMessage());
        }
        initializa(list, 認定調査特記事項番号List.get(0));
    }

    /**
     * 画面初期化
     *
     * @param 認定調査特記事項List ArrayList<NinteichosahyoTokkijiko>
     * @param 認定調査特記事項番号 RString
     */
    @JsonIgnore
    public void initializa(ArrayList<NinteichosahyoTokkijiko> 認定調査特記事項List, RString 認定調査特記事項番号) {
        clearValue();
        NinteiChosaTokkiJikou 認定調査特記事項マッピング
                = NinteiChosaTokkiJikou.getEnumByDbt5205認定調査特記事項番号(認定調査特記事項番号);

        this.txtTokkiJikouNo.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
        this.txtTokkiJikouName.setValue(認定調査特記事項マッピング.get特記事項名());
        
        RString path原本 = RString.EMPTY;
        RString pathマスク = RString.EMPTY;
        ImageManager imageManager = InstanceProvider.create(ImageManager.class);
        ChosaTokkiShokaiFinder finder = InstanceProvider.create(ChosaTokkiShokaiFinder.class);
        Image イメージ情報 = imageManager.getイメージ情報(new ShinseishoKanriNo(shinseishoKanriNo));
        if (イメージ情報.getイメージ共有ファイルID() != null) {
            FilesystemName sharedFileName = finder.selectSharedFileNameByKey(new ShinseishoKanriNo(shinseishoKanriNo));
            downLoadFilePath = getDownLoadFilePath(イメージ情報.getイメージ共有ファイルID(), sharedFileName);
            
            path原本 = getImageSrc(Path.combinePath(downLoadFilePath, replaceShareFileName(
                    NinteiChosaTokkiJikou.getEnumBy画面認定調査特記事項番号(this.txtTokkiJikouNo.getValue()).getイメージファイル(),
                    1, true)));
            pathマスク = getImageSrc(Path.combinePath(downLoadFilePath, replaceShareFileName(
                    NinteiChosaTokkiJikou.getEnumBy画面認定調査特記事項番号(this.txtTokkiJikouNo.getValue()).getイメージファイル(),
                    1, false)));
        }

        if (File.exists(pathマスク) || File.exists(path原本)) {
            setGamenDisplay(false);
            for (NinteichosahyoTokkijiko 認定調査特記事項 : 認定調査特記事項List) {
                initializaイメージエリア(認定調査特記事項マッピング, 認定調査特記事項, 認定調査特記事項.get認定調査特記事項連番());
            }
        } else {
            setGamenDisplay(true);
            for (NinteichosahyoTokkijiko 認定調査特記事項 : 認定調査特記事項List) {
                initializaテキストエリア(認定調査特記事項マッピング, 認定調査特記事項, 認定調査特記事項.get認定調査特記事項連番());
            }
        }
    }

    private void clearValue() {
//        this.txtTokkijikoNo1.setValue(RString.EMPTY);
//        this.txtTokkijikoNo2.setValue(RString.EMPTY);
//        this.txtTokkijikoNo3.setValue(RString.EMPTY);
//        this.txtTokkijikoNo4.setValue(RString.EMPTY);
//        this.txtTokkijikoNo5.setValue(RString.EMPTY);
//        this.txtTokkijikoNo6.setValue(RString.EMPTY);
//        this.txtTokkijikoNo7.setValue(RString.EMPTY);
//        this.txtTokkijikoNo8.setValue(RString.EMPTY);
//        this.txtTokkijikoNo9.setValue(RString.EMPTY);
//        this.txtTokkijikoNo10.setValue(RString.EMPTY);
//        this.txtTokkijikoNo11.setValue(RString.EMPTY);
//        this.txtTokkijikoNo12.setValue(RString.EMPTY);
//        this.txtTokkijikoNo13.setValue(RString.EMPTY);
//        this.txtTokkijikoNo14.setValue(RString.EMPTY);
//        this.txtTokkijikoNo15.setValue(RString.EMPTY);
//        this.txtTokkijikoNo16.setValue(RString.EMPTY);
//        this.txtTokkijikoNo17.setValue(RString.EMPTY);
//        this.txtTokkijikoNo18.setValue(RString.EMPTY);
//        this.txtTokkijikoNo19.setValue(RString.EMPTY);
//        this.txtTokkijikoNo20.setValue(RString.EMPTY);
//        
//        this.txtRemban1.clearValue();
//        this.txtRemban2.clearValue();
//        this.txtRemban3.clearValue();
//        this.txtRemban4.clearValue();
//        this.txtRemban5.clearValue();
//        this.txtRemban6.clearValue();
//        this.txtRemban7.clearValue();
//        this.txtRemban8.clearValue();
//        this.txtRemban9.clearValue();
//        this.txtRemban10.clearValue();
//        this.txtRemban11.clearValue();
//        this.txtRemban12.clearValue();
//        this.txtRemban13.clearValue();
//        this.txtRemban14.clearValue();
//        this.txtRemban15.clearValue();
//        this.txtRemban16.clearValue();
//        this.txtRemban17.clearValue();
//        this.txtRemban18.clearValue();
//        this.txtRemban19.clearValue();
//        this.txtRemban20.clearValue();
//        
//        this.txtTextGenpo1.setValue(RString.EMPTY);
//        this.txtTextGenpo2.setValue(RString.EMPTY);
//        this.txtTextGenpo3.setValue(RString.EMPTY);
//        this.txtTextGenpo4.setValue(RString.EMPTY);
//        this.txtTextGenpo5.setValue(RString.EMPTY);
//        this.txtTextGenpo6.setValue(RString.EMPTY);
//        this.txtTextGenpo7.setValue(RString.EMPTY);
//        this.txtTextGenpo8.setValue(RString.EMPTY);
//        this.txtTextGenpo9.setValue(RString.EMPTY);
//        this.txtTextGenpo10.setValue(RString.EMPTY);
//        this.txtTextMask1.setValue(RString.EMPTY);
//        this.txtTextMask2.setValue(RString.EMPTY);
//        this.txtTextMask3.setValue(RString.EMPTY);
//        this.txtTextMask4.setValue(RString.EMPTY);
//        this.txtTextMask5.setValue(RString.EMPTY);
//        this.txtTextMask6.setValue(RString.EMPTY);
//        this.txtTextMask7.setValue(RString.EMPTY);
//        this.txtTextMask8.setValue(RString.EMPTY);
//        this.txtTextMask9.setValue(RString.EMPTY);
//        this.txtTextMask10.setValue(RString.EMPTY);
//        
//        this.imgGenpo1.setSrc(RString.EMPTY);
//        this.imgGenpo2.setSrc(RString.EMPTY);
//        this.imgGenpo3.setSrc(RString.EMPTY);
//        this.imgGenpo4.setSrc(RString.EMPTY);
//        this.imgGenpo5.setSrc(RString.EMPTY);
//        this.imgGenpo6.setSrc(RString.EMPTY);
//        this.imgGenpo7.setSrc(RString.EMPTY);
//        this.imgGenpo8.setSrc(RString.EMPTY);
//        this.imgGenpo9.setSrc(RString.EMPTY);
//        this.imgGenpo10.setSrc(RString.EMPTY);
//        this.imgMasking1.setSrc(RString.EMPTY);
//        this.imgMasking2.setSrc(RString.EMPTY);
//        this.imgMasking3.setSrc(RString.EMPTY);
//        this.imgMasking4.setSrc(RString.EMPTY);
//        this.imgMasking5.setSrc(RString.EMPTY);
//        this.imgMasking6.setSrc(RString.EMPTY);
//        this.imgMasking7.setSrc(RString.EMPTY);
//        this.imgMasking8.setSrc(RString.EMPTY);
//        this.imgMasking9.setSrc(RString.EMPTY);
//        this.imgMasking10.setSrc(RString.EMPTY);
    }
    
    private void setGamenDisplay(boolean isテキスト) {
//        this.txtTokkijikoNo1.setDisplayNone(!isテキスト);
//        this.txtTokkijikoNo2.setDisplayNone(!isテキスト);
//        this.txtTokkijikoNo3.setDisplayNone(!isテキスト);
//        this.txtTokkijikoNo4.setDisplayNone(!isテキスト);
//        this.txtTokkijikoNo5.setDisplayNone(!isテキスト);
//        this.txtTokkijikoNo6.setDisplayNone(!isテキスト);
//        this.txtTokkijikoNo7.setDisplayNone(!isテキスト);
//        this.txtTokkijikoNo8.setDisplayNone(!isテキスト);
//        this.txtTokkijikoNo9.setDisplayNone(!isテキスト);
//        this.txtTokkijikoNo10.setDisplayNone(!isテキスト);
//        this.txtTokkijikoNo11.setDisplayNone(isテキスト);
//        this.txtTokkijikoNo12.setDisplayNone(isテキスト);
//        this.txtTokkijikoNo13.setDisplayNone(isテキスト);
//        this.txtTokkijikoNo14.setDisplayNone(isテキスト);
//        this.txtTokkijikoNo15.setDisplayNone(isテキスト);
//        this.txtTokkijikoNo16.setDisplayNone(isテキスト);
//        this.txtTokkijikoNo17.setDisplayNone(isテキスト);
//        this.txtTokkijikoNo18.setDisplayNone(isテキスト);
//        this.txtTokkijikoNo19.setDisplayNone(isテキスト);
//        this.txtTokkijikoNo20.setDisplayNone(isテキスト);
//        
//        this.lbl1.setDisplayNone(!isテキスト);
//        this.lbl2.setDisplayNone(!isテキスト);
//        this.lbl3.setDisplayNone(!isテキスト);
//        this.lbl4.setDisplayNone(!isテキスト);
//        this.lbl5.setDisplayNone(!isテキスト);
//        this.lbl6.setDisplayNone(!isテキスト);
//        this.lbl7.setDisplayNone(!isテキスト);
//        this.lbl8.setDisplayNone(!isテキスト);
//        this.lbl9.setDisplayNone(!isテキスト);
//        this.lbl10.setDisplayNone(!isテキスト);
//        this.lbl11.setDisplayNone(isテキスト);
//        this.lbl12.setDisplayNone(isテキスト);
//        this.lbl13.setDisplayNone(isテキスト);
//        this.lbl14.setDisplayNone(isテキスト);
//        this.lbl15.setDisplayNone(isテキスト);
//        this.lbl16.setDisplayNone(isテキスト);
//        this.lbl17.setDisplayNone(isテキスト);
//        this.lbl18.setDisplayNone(isテキスト);
//        this.lbl19.setDisplayNone(isテキスト);
//        this.lbl20.setDisplayNone(isテキスト);
//        
//        this.txtRemban1.setDisplayNone(!isテキスト);
//        this.txtRemban2.setDisplayNone(!isテキスト);
//        this.txtRemban3.setDisplayNone(!isテキスト);
//        this.txtRemban4.setDisplayNone(!isテキスト);
//        this.txtRemban5.setDisplayNone(!isテキスト);
//        this.txtRemban6.setDisplayNone(!isテキスト);
//        this.txtRemban7.setDisplayNone(!isテキスト);
//        this.txtRemban8.setDisplayNone(!isテキスト);
//        this.txtRemban9.setDisplayNone(!isテキスト);
//        this.txtRemban10.setDisplayNone(!isテキスト);
//        this.txtRemban11.setDisplayNone(isテキスト);
//        this.txtRemban12.setDisplayNone(isテキスト);
//        this.txtRemban13.setDisplayNone(isテキスト);
//        this.txtRemban14.setDisplayNone(isテキスト);
//        this.txtRemban15.setDisplayNone(isテキスト);
//        this.txtRemban16.setDisplayNone(isテキスト);
//        this.txtRemban17.setDisplayNone(isテキスト);
//        this.txtRemban18.setDisplayNone(isテキスト);
//        this.txtRemban19.setDisplayNone(isテキスト);
//        this.txtRemban20.setDisplayNone(isテキスト);
//        
//        this.txtTextGenpo1.setDisplayNone(!isテキスト);
//        this.txtTextGenpo2.setDisplayNone(!isテキスト);
//        this.txtTextGenpo3.setDisplayNone(!isテキスト);
//        this.txtTextGenpo4.setDisplayNone(!isテキスト);
//        this.txtTextGenpo5.setDisplayNone(!isテキスト);
//        this.txtTextGenpo6.setDisplayNone(!isテキスト);
//        this.txtTextGenpo7.setDisplayNone(!isテキスト);
//        this.txtTextGenpo8.setDisplayNone(!isテキスト);
//        this.txtTextGenpo9.setDisplayNone(!isテキスト);
//        this.txtTextGenpo10.setDisplayNone(!isテキスト);
//        this.txtTextMask1.setDisplayNone(!isテキスト);
//        this.txtTextMask2.setDisplayNone(!isテキスト);
//        this.txtTextMask3.setDisplayNone(!isテキスト);
//        this.txtTextMask4.setDisplayNone(!isテキスト);
//        this.txtTextMask5.setDisplayNone(!isテキスト);
//        this.txtTextMask6.setDisplayNone(!isテキスト);
//        this.txtTextMask7.setDisplayNone(!isテキスト);
//        this.txtTextMask8.setDisplayNone(!isテキスト);
//        this.txtTextMask9.setDisplayNone(!isテキスト);
//        this.txtTextMask10.setDisplayNone(!isテキスト);
//        
//        this.imgGenpo1.setDisplayNone(isテキスト);
//        this.imgGenpo2.setDisplayNone(isテキスト);
//        this.imgGenpo3.setDisplayNone(isテキスト);
//        this.imgGenpo4.setDisplayNone(isテキスト);
//        this.imgGenpo5.setDisplayNone(isテキスト);
//        this.imgGenpo6.setDisplayNone(isテキスト);
//        this.imgGenpo7.setDisplayNone(isテキスト);
//        this.imgGenpo8.setDisplayNone(isテキスト);
//        this.imgGenpo9.setDisplayNone(isテキスト);
//        this.imgGenpo10.setDisplayNone(isテキスト);
//        this.imgMasking1.setDisplayNone(isテキスト);
//        this.imgMasking2.setDisplayNone(isテキスト);
//        this.imgMasking3.setDisplayNone(isテキスト);
//        this.imgMasking4.setDisplayNone(isテキスト);
//        this.imgMasking5.setDisplayNone(isテキスト);
//        this.imgMasking6.setDisplayNone(isテキスト);
//        this.imgMasking7.setDisplayNone(isテキスト);
//        this.imgMasking8.setDisplayNone(isテキスト);
//        this.imgMasking9.setDisplayNone(isテキスト);
//        this.imgMasking10.setDisplayNone(isテキスト); 
    }
    
    @JsonIgnore
    private void initializaテキストエリア(NinteiChosaTokkiJikou 認定調査特記事項マッピング, NinteichosahyoTokkijiko 認定調査特記事項, int remban) {
        
//        switch (remban) {
//            case 1:
//                this.txtTokkijikoNo1.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban1.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (GenponMaskKubun.原本.getコード().equals(認定調査特記事項.get原本マスク区分().getColumnValue())) {
//                    this.txtTextGenpo1.setValue(認定調査特記事項.get特記事項());
//                } else {
//                    this.txtTextMask1.setValue(認定調査特記事項.get特記事項());
//                }
//                break;
//            case 2:
//                this.txtTokkijikoNo2.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban2.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (GenponMaskKubun.原本.getコード().equals(認定調査特記事項.get原本マスク区分().getColumnValue())) {
//                    this.txtTextGenpo2.setValue(認定調査特記事項.get特記事項());
//                } else {
//                    this.txtTextMask2.setValue(認定調査特記事項.get特記事項());
//                }
//                break;
//            case 3:
//                this.txtTokkijikoNo3.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban3.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (GenponMaskKubun.原本.getコード().equals(認定調査特記事項.get原本マスク区分().getColumnValue())) {
//                    this.txtTextGenpo3.setValue(認定調査特記事項.get特記事項());
//                } else {
//                    this.txtTextMask3.setValue(認定調査特記事項.get特記事項());
//                }
//                break;
//            case 4:
//                this.txtTokkijikoNo4.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban4.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (GenponMaskKubun.原本.getコード().equals(認定調査特記事項.get原本マスク区分().getColumnValue())) {
//                    this.txtTextGenpo4.setValue(認定調査特記事項.get特記事項());
//                } else {
//                    this.txtTextMask4.setValue(認定調査特記事項.get特記事項());
//                }
//                break;
//            case 5:
//                this.txtTokkijikoNo5.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban5.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (GenponMaskKubun.原本.getコード().equals(認定調査特記事項.get原本マスク区分().getColumnValue())) {
//                    this.txtTextGenpo5.setValue(認定調査特記事項.get特記事項());
//                } else {
//                    this.txtTextMask5.setValue(認定調査特記事項.get特記事項());
//                }
//                break;
//            case 6:
//                this.txtTokkijikoNo6.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban6.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (GenponMaskKubun.原本.getコード().equals(認定調査特記事項.get原本マスク区分().getColumnValue())) {
//                    this.txtTextGenpo6.setValue(認定調査特記事項.get特記事項());
//                } else {
//                    this.txtTextMask6.setValue(認定調査特記事項.get特記事項());
//                }
//                break;
//            case 7:
//                this.txtTokkijikoNo7.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban7.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (GenponMaskKubun.原本.getコード().equals(認定調査特記事項.get原本マスク区分().getColumnValue())) {
//                    this.txtTextGenpo7.setValue(認定調査特記事項.get特記事項());
//                } else {
//                    this.txtTextMask7.setValue(認定調査特記事項.get特記事項());
//                }
//                break;
//            case 8:
//                this.txtTokkijikoNo8.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban8.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (GenponMaskKubun.原本.getコード().equals(認定調査特記事項.get原本マスク区分().getColumnValue())) {
//                    this.txtTextGenpo8.setValue(認定調査特記事項.get特記事項());
//                } else {
//                    this.txtTextMask8.setValue(認定調査特記事項.get特記事項());
//                }
//                break;
//            case 9:
//                this.txtTokkijikoNo9.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban9.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (GenponMaskKubun.原本.getコード().equals(認定調査特記事項.get原本マスク区分().getColumnValue())) {
//                    this.txtTextGenpo9.setValue(認定調査特記事項.get特記事項());
//                } else {
//                    this.txtTextMask9.setValue(認定調査特記事項.get特記事項());
//                }
//                break;
//            case 10:
//                this.txtTokkijikoNo10.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban10.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (GenponMaskKubun.原本.getコード().equals(認定調査特記事項.get原本マスク区分().getColumnValue())) {
//                    this.txtTextGenpo10.setValue(認定調査特記事項.get特記事項());
//                } else {
//                    this.txtTextMask10.setValue(認定調査特記事項.get特記事項());
//                }
//                break;
//        }
    }

    @JsonIgnore
    private void initializaイメージエリア(NinteiChosaTokkiJikou 認定調査特記事項マッピング,  NinteichosahyoTokkijiko 認定調査特記事項, int remban) {
        RString path原本 = getImageSrc(Path.combinePath(downLoadFilePath, replaceShareFileName(
                NinteiChosaTokkiJikou.getEnumBy画面認定調査特記事項番号(this.txtTokkiJikouNo.getValue()).getイメージファイル(),
                remban, true)));
        RString pathマスク = getImageSrc(Path.combinePath(downLoadFilePath, replaceShareFileName(
                NinteiChosaTokkiJikou.getEnumBy画面認定調査特記事項番号(this.txtTokkiJikouNo.getValue()).getイメージファイル(),
                remban, false)));

//        switch (remban) {
//            case 1:
//                this.txtTokkijikoNo11.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban11.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (File.exists(pathマスク)) {
//                    this.imgGenpo1.setSrc(pathマスク);
//                    this.imgMasking1.setSrc(path原本);
//                } else {
//                    this.imgGenpo1.setSrc(path原本);
//                }
//                break;
//            case 2:
//                this.txtTokkijikoNo12.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban12.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (File.exists(pathマスク)) {
//                    this.imgGenpo2.setSrc(pathマスク);
//                    this.imgMasking2.setSrc(path原本);
//                } else {
//                    this.imgGenpo2.setSrc(path原本);
//                }
//                break;
//            case 3:
//                this.txtTokkijikoNo13.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban13.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (File.exists(pathマスク)) {
//                    this.imgGenpo3.setSrc(pathマスク);
//                    this.imgMasking3.setSrc(path原本);
//                } else {
//                    this.imgGenpo3.setSrc(path原本);
//                }
//                break;
//            case 4:
//                this.txtTokkijikoNo14.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban14.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (File.exists(pathマスク)) {
//                    this.imgGenpo4.setSrc(pathマスク);
//                    this.imgMasking4.setSrc(path原本);
//                } else {
//                    this.imgGenpo4.setSrc(path原本);
//                }
//                break;
//            case 5:
//                this.txtTokkijikoNo15.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban15.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (File.exists(pathマスク)) {
//                    this.imgGenpo5.setSrc(pathマスク);
//                    this.imgMasking5.setSrc(path原本);
//                } else {
//                    this.imgGenpo5.setSrc(path原本);
//                }
//                break;
//            case 6:
//                this.txtTokkijikoNo16.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban16.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (File.exists(pathマスク)) {
//                    this.imgGenpo6.setSrc(pathマスク);
//                    this.imgMasking6.setSrc(path原本);
//                } else {
//                    this.imgGenpo6.setSrc(path原本);
//                }
//                break;
//            case 7:
//                this.txtTokkijikoNo17.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban17.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (File.exists(pathマスク)) {
//                    this.imgGenpo7.setSrc(pathマスク);
//                    this.imgMasking7.setSrc(path原本);
//                } else {
//                    this.imgGenpo7.setSrc(path原本);
//                }
//                break;
//            case 8:
//                this.txtTokkijikoNo18.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban18.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (File.exists(pathマスク)) {
//                    this.imgGenpo8.setSrc(pathマスク);
//                    this.imgMasking8.setSrc(path原本);
//                } else {
//                    this.imgGenpo8.setSrc(path原本);
//                }
//                break;
//            case 9:
//                this.txtTokkijikoNo19.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban19.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (File.exists(pathマスク)) {
//                    this.imgGenpo9.setSrc(pathマスク);
//                    this.imgMasking9.setSrc(path原本);
//                } else {
//                    this.imgGenpo9.setSrc(path原本);
//                }
//                break;
//            case 10:
//                this.txtTokkijikoNo20.setValue(認定調査特記事項マッピング.get画面表示用特記事項番号());
//                this.txtRemban20.setValue(new Decimal(認定調査特記事項.get認定調査特記事項連番()));
//                if (File.exists(pathマスク)) {
//                    this.imgGenpo10.setSrc(pathマスク);
//                    this.imgMasking10.setSrc(path原本);
//                } else {
//                    this.imgGenpo10.setSrc(path原本);
//                }
//                break;
//        }
    }

    private RString getImageSrc(RString path) {
        return Path.combinePath(new RString(File.separator + "db"), new RString("dbz"), path.substring(path.indexOf("image")));
    }

    @JsonIgnore
    private RString replaceShareFileName(RString sharedFileName, Integer remban, boolean isイメージ原本) {
        RString fileName = sharedFileName.replace("xx", new RString(remban.toString()).padZeroToLeft(2).toString());
        if (!isイメージ原本) {
            return fileName.replace(".png", "_BAK.png");
        }
        return fileName;
    }

    @JsonIgnore
    private RString getDownLoadFilePath(RDateTime sharedFileId, FilesystemName sharedFileName) {
        RString imagePath = Path.combinePath(Path.getUserHomePath(), new RString("app"), new RString("webapps"), new RString("db#dbz"),
                new RString("WEB-INF"), new RString("image"));
        ReadOnlySharedFileEntryDescriptor descriptor
                = new ReadOnlySharedFileEntryDescriptor(sharedFileName, sharedFileId);
        return SharedFile.copyToLocal(descriptor, new FilesystemPath(imagePath)).toRString();
    }

    /**
     * 認定調査特記事項照会用なViewStateKey
     */
    public static enum ChosaTokkiShokaiKey {

        /**
         * 認定調査特記事項List
         */
        認定調査特記事項List;
    }
}
