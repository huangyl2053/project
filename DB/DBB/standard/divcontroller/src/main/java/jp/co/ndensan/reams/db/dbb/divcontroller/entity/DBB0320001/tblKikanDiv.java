package jp.co.ndensan.reams.db.dbb.divcontroller.entity.DBB0320001;
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
 * tblKikan のクラスファイル 
 * 
 * @author 自動生成
 */
public class tblKikanDiv extends TablePanel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("cellFukaShokaiData1")
    private cellFukaShokaiData1AttblKikan cellFukaShokaiData1;
    @JsonProperty("cellFukaShokaiData2")
    private cellFukaShokaiData2AttblKikan cellFukaShokaiData2;
    @JsonProperty("cellFukaShokaiData3")
    private cellFukaShokaiData3AttblKikan cellFukaShokaiData3;
    @JsonProperty("cellFukaShokaiData4")
    private cellFukaShokaiData4AttblKikan cellFukaShokaiData4;
    @JsonProperty("cellFukaShokaiData5")
    private cellFukaShokaiData5AttblKikan cellFukaShokaiData5;
    @JsonProperty("cellFukaShokaiData6")
    private cellFukaShokaiData6AttblKikan cellFukaShokaiData6;
    @JsonProperty("cellFukaShokaiData7")
    private cellFukaShokaiData7AttblKikan cellFukaShokaiData7;
    @JsonProperty("cellFukaShokaiData8")
    private cellFukaShokaiData8AttblKikan cellFukaShokaiData8;
    @JsonProperty("cellFukaShokaiData9")
    private cellFukaShokaiData9AttblKikan cellFukaShokaiData9;
    @JsonProperty("cellFukaShokaiData10")
    private cellFukaShokaiData10AttblKikan cellFukaShokaiData10;
    @JsonProperty("cellFukaShokaiData11")
    private cellFukaShokaiData11AttblKikan cellFukaShokaiData11;
    @JsonProperty("cellFukaShokaiData12")
    private cellFukaShokaiData12AttblKikan cellFukaShokaiData12;
    @JsonProperty("cellFukaShokaiData13")
    private cellFukaShokaiData13AttblKikan cellFukaShokaiData13;
    @JsonProperty("cellFukaShokaiData14")
    private cellFukaShokaiData14AttblKikan cellFukaShokaiData14;
    @JsonProperty("cellFukaShokaiData15")
    private cellFukaShokaiData15AttblKikan cellFukaShokaiData15;
    @JsonProperty("cellFukaShokaiData16")
    private cellFukaShokaiData16AttblKikan cellFukaShokaiData16;
    @JsonProperty("cellFukaShokaiData17")
    private cellFukaShokaiData17AttblKikan cellFukaShokaiData17;
    @JsonProperty("cellFukaShokaiData18")
    private cellFukaShokaiData18AttblKikan cellFukaShokaiData18;

    /*
     * [ Helperの作成 ]
     * TablePanelコントロールに特化したヘルパーメソッドを作成
     */
    @JsonIgnore
    public Label getLblKikan() {
        return this.cellFukaShokaiData1.getLblKikan();
    }

    @JsonIgnore
    public Label getLblTsukiSu() {
        return this.cellFukaShokaiData2.getLblTsukiSu();
    }

    @JsonIgnore
    public Label getLblShotokuDankai() {
        return this.cellFukaShokaiData3.getLblShotokuDankai();
    }

    @JsonIgnore
    public Label getLblKikan1() {
        return this.cellFukaShokaiData4.getLblKikan1();
    }

    @JsonIgnore
    public Label getLblTsukiSu1() {
        return this.cellFukaShokaiData5.getLblTsukiSu1();
    }

    @JsonIgnore
    public Label getLblShotokuDankai1() {
        return this.cellFukaShokaiData6.getLblShotokuDankai1();
    }

    @JsonIgnore
    public Label getLblKikan2() {
        return this.cellFukaShokaiData7.getLblKikan2();
    }

    @JsonIgnore
    public Label getLblTsukiSu2() {
        return this.cellFukaShokaiData8.getLblTsukiSu2();
    }

    @JsonIgnore
    public Label getLblShotokuDankai2() {
        return this.cellFukaShokaiData9.getLblShotokuDankai2();
    }

    @JsonIgnore
    public Label getLblHokenryoritsu() {
        return this.cellFukaShokaiData10.getLblHokenryoritsu();
    }

    @JsonIgnore
    public Label getLblHokenryoSansyutsu() {
        return this.cellFukaShokaiData11.getLblHokenryoSansyutsu();
    }

    @JsonIgnore
    public Label getLblHokenryo() {
        return this.cellFukaShokaiData12.getLblHokenryo();
    }

    @JsonIgnore
    public Label getLblHokenryoritsu1() {
        return this.cellFukaShokaiData13.getLblHokenryoritsu1();
    }

    @JsonIgnore
    public Label getLblHokenryoSansyutsu1() {
        return this.cellFukaShokaiData14.getLblHokenryoSansyutsu1();
    }

    @JsonIgnore
    public Label getLblHokenryo1() {
        return this.cellFukaShokaiData15.getLblHokenryo1();
    }

    @JsonIgnore
    public Label getLblHokenryoritsu2() {
        return this.cellFukaShokaiData16.getLblHokenryoritsu2();
    }

    @JsonIgnore
    public Label getLblHokenryoSansyutsu2() {
        return this.cellFukaShokaiData17.getLblHokenryoSansyutsu2();
    }

    @JsonIgnore
    public Label getLblHokenryo2() {
        return this.cellFukaShokaiData18.getLblHokenryo2();
    }

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("cellFukaShokaiData1")
    private cellFukaShokaiData1AttblKikan getCellFukaShokaiData1() {
        return cellFukaShokaiData1;
    }

    @JsonProperty("cellFukaShokaiData1")
    private void setCellFukaShokaiData1(cellFukaShokaiData1AttblKikan cellFukaShokaiData1) {
        this.cellFukaShokaiData1=cellFukaShokaiData1;
    }

    @JsonProperty("cellFukaShokaiData2")
    private cellFukaShokaiData2AttblKikan getCellFukaShokaiData2() {
        return cellFukaShokaiData2;
    }

    @JsonProperty("cellFukaShokaiData2")
    private void setCellFukaShokaiData2(cellFukaShokaiData2AttblKikan cellFukaShokaiData2) {
        this.cellFukaShokaiData2=cellFukaShokaiData2;
    }

    @JsonProperty("cellFukaShokaiData3")
    private cellFukaShokaiData3AttblKikan getCellFukaShokaiData3() {
        return cellFukaShokaiData3;
    }

    @JsonProperty("cellFukaShokaiData3")
    private void setCellFukaShokaiData3(cellFukaShokaiData3AttblKikan cellFukaShokaiData3) {
        this.cellFukaShokaiData3=cellFukaShokaiData3;
    }

    @JsonProperty("cellFukaShokaiData4")
    private cellFukaShokaiData4AttblKikan getCellFukaShokaiData4() {
        return cellFukaShokaiData4;
    }

    @JsonProperty("cellFukaShokaiData4")
    private void setCellFukaShokaiData4(cellFukaShokaiData4AttblKikan cellFukaShokaiData4) {
        this.cellFukaShokaiData4=cellFukaShokaiData4;
    }

    @JsonProperty("cellFukaShokaiData5")
    private cellFukaShokaiData5AttblKikan getCellFukaShokaiData5() {
        return cellFukaShokaiData5;
    }

    @JsonProperty("cellFukaShokaiData5")
    private void setCellFukaShokaiData5(cellFukaShokaiData5AttblKikan cellFukaShokaiData5) {
        this.cellFukaShokaiData5=cellFukaShokaiData5;
    }

    @JsonProperty("cellFukaShokaiData6")
    private cellFukaShokaiData6AttblKikan getCellFukaShokaiData6() {
        return cellFukaShokaiData6;
    }

    @JsonProperty("cellFukaShokaiData6")
    private void setCellFukaShokaiData6(cellFukaShokaiData6AttblKikan cellFukaShokaiData6) {
        this.cellFukaShokaiData6=cellFukaShokaiData6;
    }

    @JsonProperty("cellFukaShokaiData7")
    private cellFukaShokaiData7AttblKikan getCellFukaShokaiData7() {
        return cellFukaShokaiData7;
    }

    @JsonProperty("cellFukaShokaiData7")
    private void setCellFukaShokaiData7(cellFukaShokaiData7AttblKikan cellFukaShokaiData7) {
        this.cellFukaShokaiData7=cellFukaShokaiData7;
    }

    @JsonProperty("cellFukaShokaiData8")
    private cellFukaShokaiData8AttblKikan getCellFukaShokaiData8() {
        return cellFukaShokaiData8;
    }

    @JsonProperty("cellFukaShokaiData8")
    private void setCellFukaShokaiData8(cellFukaShokaiData8AttblKikan cellFukaShokaiData8) {
        this.cellFukaShokaiData8=cellFukaShokaiData8;
    }

    @JsonProperty("cellFukaShokaiData9")
    private cellFukaShokaiData9AttblKikan getCellFukaShokaiData9() {
        return cellFukaShokaiData9;
    }

    @JsonProperty("cellFukaShokaiData9")
    private void setCellFukaShokaiData9(cellFukaShokaiData9AttblKikan cellFukaShokaiData9) {
        this.cellFukaShokaiData9=cellFukaShokaiData9;
    }

    @JsonProperty("cellFukaShokaiData10")
    private cellFukaShokaiData10AttblKikan getCellFukaShokaiData10() {
        return cellFukaShokaiData10;
    }

    @JsonProperty("cellFukaShokaiData10")
    private void setCellFukaShokaiData10(cellFukaShokaiData10AttblKikan cellFukaShokaiData10) {
        this.cellFukaShokaiData10=cellFukaShokaiData10;
    }

    @JsonProperty("cellFukaShokaiData11")
    private cellFukaShokaiData11AttblKikan getCellFukaShokaiData11() {
        return cellFukaShokaiData11;
    }

    @JsonProperty("cellFukaShokaiData11")
    private void setCellFukaShokaiData11(cellFukaShokaiData11AttblKikan cellFukaShokaiData11) {
        this.cellFukaShokaiData11=cellFukaShokaiData11;
    }

    @JsonProperty("cellFukaShokaiData12")
    private cellFukaShokaiData12AttblKikan getCellFukaShokaiData12() {
        return cellFukaShokaiData12;
    }

    @JsonProperty("cellFukaShokaiData12")
    private void setCellFukaShokaiData12(cellFukaShokaiData12AttblKikan cellFukaShokaiData12) {
        this.cellFukaShokaiData12=cellFukaShokaiData12;
    }

    @JsonProperty("cellFukaShokaiData13")
    private cellFukaShokaiData13AttblKikan getCellFukaShokaiData13() {
        return cellFukaShokaiData13;
    }

    @JsonProperty("cellFukaShokaiData13")
    private void setCellFukaShokaiData13(cellFukaShokaiData13AttblKikan cellFukaShokaiData13) {
        this.cellFukaShokaiData13=cellFukaShokaiData13;
    }

    @JsonProperty("cellFukaShokaiData14")
    private cellFukaShokaiData14AttblKikan getCellFukaShokaiData14() {
        return cellFukaShokaiData14;
    }

    @JsonProperty("cellFukaShokaiData14")
    private void setCellFukaShokaiData14(cellFukaShokaiData14AttblKikan cellFukaShokaiData14) {
        this.cellFukaShokaiData14=cellFukaShokaiData14;
    }

    @JsonProperty("cellFukaShokaiData15")
    private cellFukaShokaiData15AttblKikan getCellFukaShokaiData15() {
        return cellFukaShokaiData15;
    }

    @JsonProperty("cellFukaShokaiData15")
    private void setCellFukaShokaiData15(cellFukaShokaiData15AttblKikan cellFukaShokaiData15) {
        this.cellFukaShokaiData15=cellFukaShokaiData15;
    }

    @JsonProperty("cellFukaShokaiData16")
    private cellFukaShokaiData16AttblKikan getCellFukaShokaiData16() {
        return cellFukaShokaiData16;
    }

    @JsonProperty("cellFukaShokaiData16")
    private void setCellFukaShokaiData16(cellFukaShokaiData16AttblKikan cellFukaShokaiData16) {
        this.cellFukaShokaiData16=cellFukaShokaiData16;
    }

    @JsonProperty("cellFukaShokaiData17")
    private cellFukaShokaiData17AttblKikan getCellFukaShokaiData17() {
        return cellFukaShokaiData17;
    }

    @JsonProperty("cellFukaShokaiData17")
    private void setCellFukaShokaiData17(cellFukaShokaiData17AttblKikan cellFukaShokaiData17) {
        this.cellFukaShokaiData17=cellFukaShokaiData17;
    }

    @JsonProperty("cellFukaShokaiData18")
    private cellFukaShokaiData18AttblKikan getCellFukaShokaiData18() {
        return cellFukaShokaiData18;
    }

    @JsonProperty("cellFukaShokaiData18")
    private void setCellFukaShokaiData18(cellFukaShokaiData18AttblKikan cellFukaShokaiData18) {
        this.cellFukaShokaiData18=cellFukaShokaiData18;
    }

}
/**
 * cellFukaShokaiData1 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData1AttblKikan extends TableCell {
    @JsonProperty("lblKikan")
    private Label lblKikan;

    @JsonProperty("lblKikan")
    public Label getLblKikan() {
        return lblKikan;
    }

    @JsonProperty("lblKikan")
    public void setLblKikan(Label lblKikan) {
        this.lblKikan=lblKikan;
    }

}
/**
 * cellFukaShokaiData2 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData2AttblKikan extends TableCell {
    @JsonProperty("lblTsukiSu")
    private Label lblTsukiSu;

    @JsonProperty("lblTsukiSu")
    public Label getLblTsukiSu() {
        return lblTsukiSu;
    }

    @JsonProperty("lblTsukiSu")
    public void setLblTsukiSu(Label lblTsukiSu) {
        this.lblTsukiSu=lblTsukiSu;
    }

}
/**
 * cellFukaShokaiData3 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData3AttblKikan extends TableCell {
    @JsonProperty("lblShotokuDankai")
    private Label lblShotokuDankai;

    @JsonProperty("lblShotokuDankai")
    public Label getLblShotokuDankai() {
        return lblShotokuDankai;
    }

    @JsonProperty("lblShotokuDankai")
    public void setLblShotokuDankai(Label lblShotokuDankai) {
        this.lblShotokuDankai=lblShotokuDankai;
    }

}
/**
 * cellFukaShokaiData4 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData4AttblKikan extends TableCell {
    @JsonProperty("lblKikan1")
    private Label lblKikan1;

    @JsonProperty("lblKikan1")
    public Label getLblKikan1() {
        return lblKikan1;
    }

    @JsonProperty("lblKikan1")
    public void setLblKikan1(Label lblKikan1) {
        this.lblKikan1=lblKikan1;
    }

}
/**
 * cellFukaShokaiData5 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData5AttblKikan extends TableCell {
    @JsonProperty("lblTsukiSu1")
    private Label lblTsukiSu1;

    @JsonProperty("lblTsukiSu1")
    public Label getLblTsukiSu1() {
        return lblTsukiSu1;
    }

    @JsonProperty("lblTsukiSu1")
    public void setLblTsukiSu1(Label lblTsukiSu1) {
        this.lblTsukiSu1=lblTsukiSu1;
    }

}
/**
 * cellFukaShokaiData6 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData6AttblKikan extends TableCell {
    @JsonProperty("lblShotokuDankai1")
    private Label lblShotokuDankai1;

    @JsonProperty("lblShotokuDankai1")
    public Label getLblShotokuDankai1() {
        return lblShotokuDankai1;
    }

    @JsonProperty("lblShotokuDankai1")
    public void setLblShotokuDankai1(Label lblShotokuDankai1) {
        this.lblShotokuDankai1=lblShotokuDankai1;
    }

}
/**
 * cellFukaShokaiData7 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData7AttblKikan extends TableCell {
    @JsonProperty("lblKikan2")
    private Label lblKikan2;

    @JsonProperty("lblKikan2")
    public Label getLblKikan2() {
        return lblKikan2;
    }

    @JsonProperty("lblKikan2")
    public void setLblKikan2(Label lblKikan2) {
        this.lblKikan2=lblKikan2;
    }

}
/**
 * cellFukaShokaiData8 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData8AttblKikan extends TableCell {
    @JsonProperty("lblTsukiSu2")
    private Label lblTsukiSu2;

    @JsonProperty("lblTsukiSu2")
    public Label getLblTsukiSu2() {
        return lblTsukiSu2;
    }

    @JsonProperty("lblTsukiSu2")
    public void setLblTsukiSu2(Label lblTsukiSu2) {
        this.lblTsukiSu2=lblTsukiSu2;
    }

}
/**
 * cellFukaShokaiData9 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData9AttblKikan extends TableCell {
    @JsonProperty("lblShotokuDankai2")
    private Label lblShotokuDankai2;

    @JsonProperty("lblShotokuDankai2")
    public Label getLblShotokuDankai2() {
        return lblShotokuDankai2;
    }

    @JsonProperty("lblShotokuDankai2")
    public void setLblShotokuDankai2(Label lblShotokuDankai2) {
        this.lblShotokuDankai2=lblShotokuDankai2;
    }

}
/**
 * cellFukaShokaiData10 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData10AttblKikan extends TableCell {
    @JsonProperty("lblHokenryoritsu")
    private Label lblHokenryoritsu;

    @JsonProperty("lblHokenryoritsu")
    public Label getLblHokenryoritsu() {
        return lblHokenryoritsu;
    }

    @JsonProperty("lblHokenryoritsu")
    public void setLblHokenryoritsu(Label lblHokenryoritsu) {
        this.lblHokenryoritsu=lblHokenryoritsu;
    }

}
/**
 * cellFukaShokaiData11 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData11AttblKikan extends TableCell {
    @JsonProperty("lblHokenryoSansyutsu")
    private Label lblHokenryoSansyutsu;

    @JsonProperty("lblHokenryoSansyutsu")
    public Label getLblHokenryoSansyutsu() {
        return lblHokenryoSansyutsu;
    }

    @JsonProperty("lblHokenryoSansyutsu")
    public void setLblHokenryoSansyutsu(Label lblHokenryoSansyutsu) {
        this.lblHokenryoSansyutsu=lblHokenryoSansyutsu;
    }

}
/**
 * cellFukaShokaiData12 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData12AttblKikan extends TableCell {
    @JsonProperty("lblHokenryo")
    private Label lblHokenryo;

    @JsonProperty("lblHokenryo")
    public Label getLblHokenryo() {
        return lblHokenryo;
    }

    @JsonProperty("lblHokenryo")
    public void setLblHokenryo(Label lblHokenryo) {
        this.lblHokenryo=lblHokenryo;
    }

}
/**
 * cellFukaShokaiData13 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData13AttblKikan extends TableCell {
    @JsonProperty("lblHokenryoritsu1")
    private Label lblHokenryoritsu1;

    @JsonProperty("lblHokenryoritsu1")
    public Label getLblHokenryoritsu1() {
        return lblHokenryoritsu1;
    }

    @JsonProperty("lblHokenryoritsu1")
    public void setLblHokenryoritsu1(Label lblHokenryoritsu1) {
        this.lblHokenryoritsu1=lblHokenryoritsu1;
    }

}
/**
 * cellFukaShokaiData14 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData14AttblKikan extends TableCell {
    @JsonProperty("lblHokenryoSansyutsu1")
    private Label lblHokenryoSansyutsu1;

    @JsonProperty("lblHokenryoSansyutsu1")
    public Label getLblHokenryoSansyutsu1() {
        return lblHokenryoSansyutsu1;
    }

    @JsonProperty("lblHokenryoSansyutsu1")
    public void setLblHokenryoSansyutsu1(Label lblHokenryoSansyutsu1) {
        this.lblHokenryoSansyutsu1=lblHokenryoSansyutsu1;
    }

}
/**
 * cellFukaShokaiData15 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData15AttblKikan extends TableCell {
    @JsonProperty("lblHokenryo1")
    private Label lblHokenryo1;

    @JsonProperty("lblHokenryo1")
    public Label getLblHokenryo1() {
        return lblHokenryo1;
    }

    @JsonProperty("lblHokenryo1")
    public void setLblHokenryo1(Label lblHokenryo1) {
        this.lblHokenryo1=lblHokenryo1;
    }

}
/**
 * cellFukaShokaiData16 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData16AttblKikan extends TableCell {
    @JsonProperty("lblHokenryoritsu2")
    private Label lblHokenryoritsu2;

    @JsonProperty("lblHokenryoritsu2")
    public Label getLblHokenryoritsu2() {
        return lblHokenryoritsu2;
    }

    @JsonProperty("lblHokenryoritsu2")
    public void setLblHokenryoritsu2(Label lblHokenryoritsu2) {
        this.lblHokenryoritsu2=lblHokenryoritsu2;
    }

}
/**
 * cellFukaShokaiData17 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData17AttblKikan extends TableCell {
    @JsonProperty("lblHokenryoSansyutsu2")
    private Label lblHokenryoSansyutsu2;

    @JsonProperty("lblHokenryoSansyutsu2")
    public Label getLblHokenryoSansyutsu2() {
        return lblHokenryoSansyutsu2;
    }

    @JsonProperty("lblHokenryoSansyutsu2")
    public void setLblHokenryoSansyutsu2(Label lblHokenryoSansyutsu2) {
        this.lblHokenryoSansyutsu2=lblHokenryoSansyutsu2;
    }

}
/**
 * cellFukaShokaiData18 のクラスファイル 
 * 
 * @author 自動生成
 */
class cellFukaShokaiData18AttblKikan extends TableCell {
    @JsonProperty("lblHokenryo2")
    private Label lblHokenryo2;

    @JsonProperty("lblHokenryo2")
    public Label getLblHokenryo2() {
        return lblHokenryo2;
    }

    @JsonProperty("lblHokenryo2")
    public void setLblHokenryo2(Label lblHokenryo2) {
        this.lblHokenryo2=lblHokenryo2;
    }

}
