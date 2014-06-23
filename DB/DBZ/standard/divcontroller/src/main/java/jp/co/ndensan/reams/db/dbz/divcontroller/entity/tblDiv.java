package jp.co.ndensan.reams.db.dbz.divcontroller.entity;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.TableCell;
import jp.co.ndensan.reams.uz.uza.ui.binding.TablePanel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * tbl のクラスファイル 
 * 
 * @author 自動生成
 */
public class tblDiv extends TablePanel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("celShisetsuNyushoDateTitle")
    private celShisetsuNyushoDateTitleAttbl celShisetsuNyushoDateTitle;
    @JsonProperty("celShisetsuTaishoDateTitle")
    private celShisetsuTaishoDateTitleAttbl celShisetsuTaishoDateTitle;
    @JsonProperty("celNyushoShisetsuTitle")
    private celNyushoShisetsuTitleAttbl celNyushoShisetsuTitle;
    @JsonProperty("celShisetsuNyushoDate1")
    private celShisetsuNyushoDate1Attbl celShisetsuNyushoDate1;
    @JsonProperty("celShisetsuTaishoDate1")
    private celShisetsuTaishoDate1Attbl celShisetsuTaishoDate1;
    @JsonProperty("celNyushoShisetsu1")
    private celNyushoShisetsu1Attbl celNyushoShisetsu1;
    @JsonProperty("celShisetsuNyushoDate2")
    private celShisetsuNyushoDate2Attbl celShisetsuNyushoDate2;
    @JsonProperty("celShisetsuTaishoDate2")
    private celShisetsuTaishoDate2Attbl celShisetsuTaishoDate2;
    @JsonProperty("celNyushoShisetsu2")
    private celNyushoShisetsu2Attbl celNyushoShisetsu2;
    @JsonProperty("celTaishoJohoTitle")
    private celTaishoJohoTitleAttbl celTaishoJohoTitle;
    @JsonProperty("celShisetsuShuruiTitle")
    private celShisetsuShuruiTitleAttbl celShisetsuShuruiTitle;
    @JsonProperty("celTaishoJoho1")
    private celTaishoJoho1Attbl celTaishoJoho1;
    @JsonProperty("celShisetsuShurui1")
    private celShisetsuShurui1Attbl celShisetsuShurui1;
    @JsonProperty("celTaishoJoho2")
    private celTaishoJoho2Attbl celTaishoJoho2;
    @JsonProperty("celShisetsuShurui2")
    private celShisetsuShurui2Attbl celShisetsuShurui2;
    @JsonProperty("celShisetsuNyushoDate3")
    private celShisetsuNyushoDate3Attbl celShisetsuNyushoDate3;
    @JsonProperty("celShisetsuTaishoDate3")
    private celShisetsuTaishoDate3Attbl celShisetsuTaishoDate3;
    @JsonProperty("celNyushoShisetsu3")
    private celNyushoShisetsu3Attbl celNyushoShisetsu3;
    @JsonProperty("celTaishoJoho3")
    private celTaishoJoho3Attbl celTaishoJoho3;
    @JsonProperty("celShisetsuShurui3")
    private celShisetsuShurui3Attbl celShisetsuShurui3;

    /*
     * [ Helperの作成 ]
     * TablePanelコントロールに特化したヘルパーメソッドを作成
     */
    @JsonIgnore
    public Label getLblShisetsuNyushoDate() {
        return this.celShisetsuNyushoDateTitle.getLblShisetsuNyushoDate();
    }

    @JsonIgnore
    public Label getLblShisetsuTaishoDate() {
        return this.celShisetsuTaishoDateTitle.getLblShisetsuTaishoDate();
    }

    @JsonIgnore
    public Label getLblNyushoShisetsu() {
        return this.celNyushoShisetsuTitle.getLblNyushoShisetsu();
    }

    @JsonIgnore
    public TextBoxFlexibleDate getTxtShisetsuNyushoDate1() {
        return this.celShisetsuNyushoDate1.getTxtShisetsuNyushoDate1();
    }

    @JsonIgnore
    public TextBoxFlexibleDate getTxtShisetsuTaishoDate1() {
        return this.celShisetsuTaishoDate1.getTxtShisetsuTaishoDate1();
    }

    @JsonIgnore
    public TextBox getTxtNyushoShisetsu1() {
        return this.celNyushoShisetsu1.getTxtNyushoShisetsu1();
    }

    @JsonIgnore
    public TextBoxFlexibleDate getTxtShisetsuNyushoDate2() {
        return this.celShisetsuNyushoDate2.getTxtShisetsuNyushoDate2();
    }

    @JsonIgnore
    public TextBoxFlexibleDate getTxtShisetsuTaishoDate2() {
        return this.celShisetsuTaishoDate2.getTxtShisetsuTaishoDate2();
    }

    @JsonIgnore
    public TextBox getTxtNyushoShisetsu2() {
        return this.celNyushoShisetsu2.getTxtNyushoShisetsu2();
    }

    @JsonIgnore
    public Label getLblTaishoJoho() {
        return this.celTaishoJohoTitle.getLblTaishoJoho();
    }

    @JsonIgnore
    public Label getLblShisetsuShurui() {
        return this.celShisetsuShuruiTitle.getLblShisetsuShurui();
    }

    @JsonIgnore
    public TextBox getTxtTaishoJoho1() {
        return this.celTaishoJoho1.getTxtTaishoJoho1();
    }

    @JsonIgnore
    public TextBox getTxtShisetsuShurui1() {
        return this.celShisetsuShurui1.getTxtShisetsuShurui1();
    }

    @JsonIgnore
    public TextBox getTxtTaishoJoho2() {
        return this.celTaishoJoho2.getTxtTaishoJoho2();
    }

    @JsonIgnore
    public TextBox getTxtShisetsuShurui2() {
        return this.celShisetsuShurui2.getTxtShisetsuShurui2();
    }

    @JsonIgnore
    public TextBoxFlexibleDate getTxtShisetsuNyushoDate3() {
        return this.celShisetsuNyushoDate3.getTxtShisetsuNyushoDate3();
    }

    @JsonIgnore
    public TextBoxFlexibleDate getTxtShisetsuTaishoDate3() {
        return this.celShisetsuTaishoDate3.getTxtShisetsuTaishoDate3();
    }

    @JsonIgnore
    public TextBox getTxtNyushoShisetsu3() {
        return this.celNyushoShisetsu3.getTxtNyushoShisetsu3();
    }

    @JsonIgnore
    public TextBox getTxtTaishoJoho3() {
        return this.celTaishoJoho3.getTxtTaishoJoho3();
    }

    @JsonIgnore
    public TextBox getTxtShisetsuShurui3() {
        return this.celShisetsuShurui3.getTxtShisetsuShurui3();
    }

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("celShisetsuNyushoDateTitle")
    private celShisetsuNyushoDateTitleAttbl getCelShisetsuNyushoDateTitle() {
        return celShisetsuNyushoDateTitle;
    }

    @JsonProperty("celShisetsuNyushoDateTitle")
    private void setCelShisetsuNyushoDateTitle(celShisetsuNyushoDateTitleAttbl celShisetsuNyushoDateTitle) {
        this.celShisetsuNyushoDateTitle=celShisetsuNyushoDateTitle;
    }

    @JsonProperty("celShisetsuTaishoDateTitle")
    private celShisetsuTaishoDateTitleAttbl getCelShisetsuTaishoDateTitle() {
        return celShisetsuTaishoDateTitle;
    }

    @JsonProperty("celShisetsuTaishoDateTitle")
    private void setCelShisetsuTaishoDateTitle(celShisetsuTaishoDateTitleAttbl celShisetsuTaishoDateTitle) {
        this.celShisetsuTaishoDateTitle=celShisetsuTaishoDateTitle;
    }

    @JsonProperty("celNyushoShisetsuTitle")
    private celNyushoShisetsuTitleAttbl getCelNyushoShisetsuTitle() {
        return celNyushoShisetsuTitle;
    }

    @JsonProperty("celNyushoShisetsuTitle")
    private void setCelNyushoShisetsuTitle(celNyushoShisetsuTitleAttbl celNyushoShisetsuTitle) {
        this.celNyushoShisetsuTitle=celNyushoShisetsuTitle;
    }

    @JsonProperty("celShisetsuNyushoDate1")
    private celShisetsuNyushoDate1Attbl getCelShisetsuNyushoDate1() {
        return celShisetsuNyushoDate1;
    }

    @JsonProperty("celShisetsuNyushoDate1")
    private void setCelShisetsuNyushoDate1(celShisetsuNyushoDate1Attbl celShisetsuNyushoDate1) {
        this.celShisetsuNyushoDate1=celShisetsuNyushoDate1;
    }

    @JsonProperty("celShisetsuTaishoDate1")
    private celShisetsuTaishoDate1Attbl getCelShisetsuTaishoDate1() {
        return celShisetsuTaishoDate1;
    }

    @JsonProperty("celShisetsuTaishoDate1")
    private void setCelShisetsuTaishoDate1(celShisetsuTaishoDate1Attbl celShisetsuTaishoDate1) {
        this.celShisetsuTaishoDate1=celShisetsuTaishoDate1;
    }

    @JsonProperty("celNyushoShisetsu1")
    private celNyushoShisetsu1Attbl getCelNyushoShisetsu1() {
        return celNyushoShisetsu1;
    }

    @JsonProperty("celNyushoShisetsu1")
    private void setCelNyushoShisetsu1(celNyushoShisetsu1Attbl celNyushoShisetsu1) {
        this.celNyushoShisetsu1=celNyushoShisetsu1;
    }

    @JsonProperty("celShisetsuNyushoDate2")
    private celShisetsuNyushoDate2Attbl getCelShisetsuNyushoDate2() {
        return celShisetsuNyushoDate2;
    }

    @JsonProperty("celShisetsuNyushoDate2")
    private void setCelShisetsuNyushoDate2(celShisetsuNyushoDate2Attbl celShisetsuNyushoDate2) {
        this.celShisetsuNyushoDate2=celShisetsuNyushoDate2;
    }

    @JsonProperty("celShisetsuTaishoDate2")
    private celShisetsuTaishoDate2Attbl getCelShisetsuTaishoDate2() {
        return celShisetsuTaishoDate2;
    }

    @JsonProperty("celShisetsuTaishoDate2")
    private void setCelShisetsuTaishoDate2(celShisetsuTaishoDate2Attbl celShisetsuTaishoDate2) {
        this.celShisetsuTaishoDate2=celShisetsuTaishoDate2;
    }

    @JsonProperty("celNyushoShisetsu2")
    private celNyushoShisetsu2Attbl getCelNyushoShisetsu2() {
        return celNyushoShisetsu2;
    }

    @JsonProperty("celNyushoShisetsu2")
    private void setCelNyushoShisetsu2(celNyushoShisetsu2Attbl celNyushoShisetsu2) {
        this.celNyushoShisetsu2=celNyushoShisetsu2;
    }

    @JsonProperty("celTaishoJohoTitle")
    private celTaishoJohoTitleAttbl getCelTaishoJohoTitle() {
        return celTaishoJohoTitle;
    }

    @JsonProperty("celTaishoJohoTitle")
    private void setCelTaishoJohoTitle(celTaishoJohoTitleAttbl celTaishoJohoTitle) {
        this.celTaishoJohoTitle=celTaishoJohoTitle;
    }

    @JsonProperty("celShisetsuShuruiTitle")
    private celShisetsuShuruiTitleAttbl getCelShisetsuShuruiTitle() {
        return celShisetsuShuruiTitle;
    }

    @JsonProperty("celShisetsuShuruiTitle")
    private void setCelShisetsuShuruiTitle(celShisetsuShuruiTitleAttbl celShisetsuShuruiTitle) {
        this.celShisetsuShuruiTitle=celShisetsuShuruiTitle;
    }

    @JsonProperty("celTaishoJoho1")
    private celTaishoJoho1Attbl getCelTaishoJoho1() {
        return celTaishoJoho1;
    }

    @JsonProperty("celTaishoJoho1")
    private void setCelTaishoJoho1(celTaishoJoho1Attbl celTaishoJoho1) {
        this.celTaishoJoho1=celTaishoJoho1;
    }

    @JsonProperty("celShisetsuShurui1")
    private celShisetsuShurui1Attbl getCelShisetsuShurui1() {
        return celShisetsuShurui1;
    }

    @JsonProperty("celShisetsuShurui1")
    private void setCelShisetsuShurui1(celShisetsuShurui1Attbl celShisetsuShurui1) {
        this.celShisetsuShurui1=celShisetsuShurui1;
    }

    @JsonProperty("celTaishoJoho2")
    private celTaishoJoho2Attbl getCelTaishoJoho2() {
        return celTaishoJoho2;
    }

    @JsonProperty("celTaishoJoho2")
    private void setCelTaishoJoho2(celTaishoJoho2Attbl celTaishoJoho2) {
        this.celTaishoJoho2=celTaishoJoho2;
    }

    @JsonProperty("celShisetsuShurui2")
    private celShisetsuShurui2Attbl getCelShisetsuShurui2() {
        return celShisetsuShurui2;
    }

    @JsonProperty("celShisetsuShurui2")
    private void setCelShisetsuShurui2(celShisetsuShurui2Attbl celShisetsuShurui2) {
        this.celShisetsuShurui2=celShisetsuShurui2;
    }

    @JsonProperty("celShisetsuNyushoDate3")
    private celShisetsuNyushoDate3Attbl getCelShisetsuNyushoDate3() {
        return celShisetsuNyushoDate3;
    }

    @JsonProperty("celShisetsuNyushoDate3")
    private void setCelShisetsuNyushoDate3(celShisetsuNyushoDate3Attbl celShisetsuNyushoDate3) {
        this.celShisetsuNyushoDate3=celShisetsuNyushoDate3;
    }

    @JsonProperty("celShisetsuTaishoDate3")
    private celShisetsuTaishoDate3Attbl getCelShisetsuTaishoDate3() {
        return celShisetsuTaishoDate3;
    }

    @JsonProperty("celShisetsuTaishoDate3")
    private void setCelShisetsuTaishoDate3(celShisetsuTaishoDate3Attbl celShisetsuTaishoDate3) {
        this.celShisetsuTaishoDate3=celShisetsuTaishoDate3;
    }

    @JsonProperty("celNyushoShisetsu3")
    private celNyushoShisetsu3Attbl getCelNyushoShisetsu3() {
        return celNyushoShisetsu3;
    }

    @JsonProperty("celNyushoShisetsu3")
    private void setCelNyushoShisetsu3(celNyushoShisetsu3Attbl celNyushoShisetsu3) {
        this.celNyushoShisetsu3=celNyushoShisetsu3;
    }

    @JsonProperty("celTaishoJoho3")
    private celTaishoJoho3Attbl getCelTaishoJoho3() {
        return celTaishoJoho3;
    }

    @JsonProperty("celTaishoJoho3")
    private void setCelTaishoJoho3(celTaishoJoho3Attbl celTaishoJoho3) {
        this.celTaishoJoho3=celTaishoJoho3;
    }

    @JsonProperty("celShisetsuShurui3")
    private celShisetsuShurui3Attbl getCelShisetsuShurui3() {
        return celShisetsuShurui3;
    }

    @JsonProperty("celShisetsuShurui3")
    private void setCelShisetsuShurui3(celShisetsuShurui3Attbl celShisetsuShurui3) {
        this.celShisetsuShurui3=celShisetsuShurui3;
    }

}
/**
 * celShisetsuNyushoDateTitle のクラスファイル 
 * 
 * @author 自動生成
 */
class celShisetsuNyushoDateTitleAttbl extends TableCell {
    @JsonProperty("lblShisetsuNyushoDate")
    private Label lblShisetsuNyushoDate;

    @JsonProperty("lblShisetsuNyushoDate")
    public Label getLblShisetsuNyushoDate() {
        return lblShisetsuNyushoDate;
    }

    @JsonProperty("lblShisetsuNyushoDate")
    public void setLblShisetsuNyushoDate(Label lblShisetsuNyushoDate) {
        this.lblShisetsuNyushoDate=lblShisetsuNyushoDate;
    }

}
/**
 * celShisetsuTaishoDateTitle のクラスファイル 
 * 
 * @author 自動生成
 */
class celShisetsuTaishoDateTitleAttbl extends TableCell {
    @JsonProperty("lblShisetsuTaishoDate")
    private Label lblShisetsuTaishoDate;

    @JsonProperty("lblShisetsuTaishoDate")
    public Label getLblShisetsuTaishoDate() {
        return lblShisetsuTaishoDate;
    }

    @JsonProperty("lblShisetsuTaishoDate")
    public void setLblShisetsuTaishoDate(Label lblShisetsuTaishoDate) {
        this.lblShisetsuTaishoDate=lblShisetsuTaishoDate;
    }

}
/**
 * celNyushoShisetsuTitle のクラスファイル 
 * 
 * @author 自動生成
 */
class celNyushoShisetsuTitleAttbl extends TableCell {
    @JsonProperty("lblNyushoShisetsu")
    private Label lblNyushoShisetsu;

    @JsonProperty("lblNyushoShisetsu")
    public Label getLblNyushoShisetsu() {
        return lblNyushoShisetsu;
    }

    @JsonProperty("lblNyushoShisetsu")
    public void setLblNyushoShisetsu(Label lblNyushoShisetsu) {
        this.lblNyushoShisetsu=lblNyushoShisetsu;
    }

}
/**
 * celShisetsuNyushoDate1 のクラスファイル 
 * 
 * @author 自動生成
 */
class celShisetsuNyushoDate1Attbl extends TableCell {
    @JsonProperty("txtShisetsuNyushoDate1")
    private TextBoxFlexibleDate txtShisetsuNyushoDate1;

    @JsonProperty("txtShisetsuNyushoDate1")
    public TextBoxFlexibleDate getTxtShisetsuNyushoDate1() {
        return txtShisetsuNyushoDate1;
    }

    @JsonProperty("txtShisetsuNyushoDate1")
    public void setTxtShisetsuNyushoDate1(TextBoxFlexibleDate txtShisetsuNyushoDate1) {
        this.txtShisetsuNyushoDate1=txtShisetsuNyushoDate1;
    }

}
/**
 * celShisetsuTaishoDate1 のクラスファイル 
 * 
 * @author 自動生成
 */
class celShisetsuTaishoDate1Attbl extends TableCell {
    @JsonProperty("txtShisetsuTaishoDate1")
    private TextBoxFlexibleDate txtShisetsuTaishoDate1;

    @JsonProperty("txtShisetsuTaishoDate1")
    public TextBoxFlexibleDate getTxtShisetsuTaishoDate1() {
        return txtShisetsuTaishoDate1;
    }

    @JsonProperty("txtShisetsuTaishoDate1")
    public void setTxtShisetsuTaishoDate1(TextBoxFlexibleDate txtShisetsuTaishoDate1) {
        this.txtShisetsuTaishoDate1=txtShisetsuTaishoDate1;
    }

}
/**
 * celNyushoShisetsu1 のクラスファイル 
 * 
 * @author 自動生成
 */
class celNyushoShisetsu1Attbl extends TableCell {
    @JsonProperty("txtNyushoShisetsu1")
    private TextBox txtNyushoShisetsu1;

    @JsonProperty("txtNyushoShisetsu1")
    public TextBox getTxtNyushoShisetsu1() {
        return txtNyushoShisetsu1;
    }

    @JsonProperty("txtNyushoShisetsu1")
    public void setTxtNyushoShisetsu1(TextBox txtNyushoShisetsu1) {
        this.txtNyushoShisetsu1=txtNyushoShisetsu1;
    }

}
/**
 * celShisetsuNyushoDate2 のクラスファイル 
 * 
 * @author 自動生成
 */
class celShisetsuNyushoDate2Attbl extends TableCell {
    @JsonProperty("txtShisetsuNyushoDate2")
    private TextBoxFlexibleDate txtShisetsuNyushoDate2;

    @JsonProperty("txtShisetsuNyushoDate2")
    public TextBoxFlexibleDate getTxtShisetsuNyushoDate2() {
        return txtShisetsuNyushoDate2;
    }

    @JsonProperty("txtShisetsuNyushoDate2")
    public void setTxtShisetsuNyushoDate2(TextBoxFlexibleDate txtShisetsuNyushoDate2) {
        this.txtShisetsuNyushoDate2=txtShisetsuNyushoDate2;
    }

}
/**
 * celShisetsuTaishoDate2 のクラスファイル 
 * 
 * @author 自動生成
 */
class celShisetsuTaishoDate2Attbl extends TableCell {
    @JsonProperty("txtShisetsuTaishoDate2")
    private TextBoxFlexibleDate txtShisetsuTaishoDate2;

    @JsonProperty("txtShisetsuTaishoDate2")
    public TextBoxFlexibleDate getTxtShisetsuTaishoDate2() {
        return txtShisetsuTaishoDate2;
    }

    @JsonProperty("txtShisetsuTaishoDate2")
    public void setTxtShisetsuTaishoDate2(TextBoxFlexibleDate txtShisetsuTaishoDate2) {
        this.txtShisetsuTaishoDate2=txtShisetsuTaishoDate2;
    }

}
/**
 * celNyushoShisetsu2 のクラスファイル 
 * 
 * @author 自動生成
 */
class celNyushoShisetsu2Attbl extends TableCell {
    @JsonProperty("txtNyushoShisetsu2")
    private TextBox txtNyushoShisetsu2;

    @JsonProperty("txtNyushoShisetsu2")
    public TextBox getTxtNyushoShisetsu2() {
        return txtNyushoShisetsu2;
    }

    @JsonProperty("txtNyushoShisetsu2")
    public void setTxtNyushoShisetsu2(TextBox txtNyushoShisetsu2) {
        this.txtNyushoShisetsu2=txtNyushoShisetsu2;
    }

}
/**
 * celTaishoJohoTitle のクラスファイル 
 * 
 * @author 自動生成
 */
class celTaishoJohoTitleAttbl extends TableCell {
    @JsonProperty("lblTaishoJoho")
    private Label lblTaishoJoho;

    @JsonProperty("lblTaishoJoho")
    public Label getLblTaishoJoho() {
        return lblTaishoJoho;
    }

    @JsonProperty("lblTaishoJoho")
    public void setLblTaishoJoho(Label lblTaishoJoho) {
        this.lblTaishoJoho=lblTaishoJoho;
    }

}
/**
 * celShisetsuShuruiTitle のクラスファイル 
 * 
 * @author 自動生成
 */
class celShisetsuShuruiTitleAttbl extends TableCell {
    @JsonProperty("lblShisetsuShurui")
    private Label lblShisetsuShurui;

    @JsonProperty("lblShisetsuShurui")
    public Label getLblShisetsuShurui() {
        return lblShisetsuShurui;
    }

    @JsonProperty("lblShisetsuShurui")
    public void setLblShisetsuShurui(Label lblShisetsuShurui) {
        this.lblShisetsuShurui=lblShisetsuShurui;
    }

}
/**
 * celTaishoJoho1 のクラスファイル 
 * 
 * @author 自動生成
 */
class celTaishoJoho1Attbl extends TableCell {
    @JsonProperty("txtTaishoJoho1")
    private TextBox txtTaishoJoho1;

    @JsonProperty("txtTaishoJoho1")
    public TextBox getTxtTaishoJoho1() {
        return txtTaishoJoho1;
    }

    @JsonProperty("txtTaishoJoho1")
    public void setTxtTaishoJoho1(TextBox txtTaishoJoho1) {
        this.txtTaishoJoho1=txtTaishoJoho1;
    }

}
/**
 * celShisetsuShurui1 のクラスファイル 
 * 
 * @author 自動生成
 */
class celShisetsuShurui1Attbl extends TableCell {
    @JsonProperty("txtShisetsuShurui1")
    private TextBox txtShisetsuShurui1;

    @JsonProperty("txtShisetsuShurui1")
    public TextBox getTxtShisetsuShurui1() {
        return txtShisetsuShurui1;
    }

    @JsonProperty("txtShisetsuShurui1")
    public void setTxtShisetsuShurui1(TextBox txtShisetsuShurui1) {
        this.txtShisetsuShurui1=txtShisetsuShurui1;
    }

}
/**
 * celTaishoJoho2 のクラスファイル 
 * 
 * @author 自動生成
 */
class celTaishoJoho2Attbl extends TableCell {
    @JsonProperty("txtTaishoJoho2")
    private TextBox txtTaishoJoho2;

    @JsonProperty("txtTaishoJoho2")
    public TextBox getTxtTaishoJoho2() {
        return txtTaishoJoho2;
    }

    @JsonProperty("txtTaishoJoho2")
    public void setTxtTaishoJoho2(TextBox txtTaishoJoho2) {
        this.txtTaishoJoho2=txtTaishoJoho2;
    }

}
/**
 * celShisetsuShurui2 のクラスファイル 
 * 
 * @author 自動生成
 */
class celShisetsuShurui2Attbl extends TableCell {
    @JsonProperty("txtShisetsuShurui2")
    private TextBox txtShisetsuShurui2;

    @JsonProperty("txtShisetsuShurui2")
    public TextBox getTxtShisetsuShurui2() {
        return txtShisetsuShurui2;
    }

    @JsonProperty("txtShisetsuShurui2")
    public void setTxtShisetsuShurui2(TextBox txtShisetsuShurui2) {
        this.txtShisetsuShurui2=txtShisetsuShurui2;
    }

}
/**
 * celShisetsuNyushoDate3 のクラスファイル 
 * 
 * @author 自動生成
 */
class celShisetsuNyushoDate3Attbl extends TableCell {
    @JsonProperty("txtShisetsuNyushoDate3")
    private TextBoxFlexibleDate txtShisetsuNyushoDate3;

    @JsonProperty("txtShisetsuNyushoDate3")
    public TextBoxFlexibleDate getTxtShisetsuNyushoDate3() {
        return txtShisetsuNyushoDate3;
    }

    @JsonProperty("txtShisetsuNyushoDate3")
    public void setTxtShisetsuNyushoDate3(TextBoxFlexibleDate txtShisetsuNyushoDate3) {
        this.txtShisetsuNyushoDate3=txtShisetsuNyushoDate3;
    }

}
/**
 * celShisetsuTaishoDate3 のクラスファイル 
 * 
 * @author 自動生成
 */
class celShisetsuTaishoDate3Attbl extends TableCell {
    @JsonProperty("txtShisetsuTaishoDate3")
    private TextBoxFlexibleDate txtShisetsuTaishoDate3;

    @JsonProperty("txtShisetsuTaishoDate3")
    public TextBoxFlexibleDate getTxtShisetsuTaishoDate3() {
        return txtShisetsuTaishoDate3;
    }

    @JsonProperty("txtShisetsuTaishoDate3")
    public void setTxtShisetsuTaishoDate3(TextBoxFlexibleDate txtShisetsuTaishoDate3) {
        this.txtShisetsuTaishoDate3=txtShisetsuTaishoDate3;
    }

}
/**
 * celNyushoShisetsu3 のクラスファイル 
 * 
 * @author 自動生成
 */
class celNyushoShisetsu3Attbl extends TableCell {
    @JsonProperty("txtNyushoShisetsu3")
    private TextBox txtNyushoShisetsu3;

    @JsonProperty("txtNyushoShisetsu3")
    public TextBox getTxtNyushoShisetsu3() {
        return txtNyushoShisetsu3;
    }

    @JsonProperty("txtNyushoShisetsu3")
    public void setTxtNyushoShisetsu3(TextBox txtNyushoShisetsu3) {
        this.txtNyushoShisetsu3=txtNyushoShisetsu3;
    }

}
/**
 * celTaishoJoho3 のクラスファイル 
 * 
 * @author 自動生成
 */
class celTaishoJoho3Attbl extends TableCell {
    @JsonProperty("txtTaishoJoho3")
    private TextBox txtTaishoJoho3;

    @JsonProperty("txtTaishoJoho3")
    public TextBox getTxtTaishoJoho3() {
        return txtTaishoJoho3;
    }

    @JsonProperty("txtTaishoJoho3")
    public void setTxtTaishoJoho3(TextBox txtTaishoJoho3) {
        this.txtTaishoJoho3=txtTaishoJoho3;
    }

}
/**
 * celShisetsuShurui3 のクラスファイル 
 * 
 * @author 自動生成
 */
class celShisetsuShurui3Attbl extends TableCell {
    @JsonProperty("txtShisetsuShurui3")
    private TextBox txtShisetsuShurui3;

    @JsonProperty("txtShisetsuShurui3")
    public TextBox getTxtShisetsuShurui3() {
        return txtShisetsuShurui3;
    }

    @JsonProperty("txtShisetsuShurui3")
    public void setTxtShisetsuShurui3(TextBox txtShisetsuShurui3) {
        this.txtShisetsuShurui3=txtShisetsuShurui3;
    }

}