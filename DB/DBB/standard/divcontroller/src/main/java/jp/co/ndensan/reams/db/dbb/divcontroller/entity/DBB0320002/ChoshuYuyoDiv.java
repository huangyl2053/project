package jp.co.ndensan.reams.db.dbb.divcontroller.entity.DBB0320002;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbb.divcontroller.entity.DBB0320002.ChoshuYuyoKikanDiv;
import jp.co.ndensan.reams.db.dbb.divcontroller.entity.DBB0320002.ChoshuYuyoTblDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * ChoshuYuyo のクラスファイル 
 * 
 * @author 自動生成
 */
public class ChoshuYuyoDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("ChoshuYuyoTbl")
    private ChoshuYuyoTblDiv ChoshuYuyoTbl;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("ChoshuYuyoTbl")
    public ChoshuYuyoTblDiv getChoshuYuyoTbl() {
        return ChoshuYuyoTbl;
    }

    @JsonProperty("ChoshuYuyoTbl")
    public void setChoshuYuyoTbl(ChoshuYuyoTblDiv ChoshuYuyoTbl) {
        this.ChoshuYuyoTbl=ChoshuYuyoTbl;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public TextBoxDate getTxtChoshuYuyoShinseiYMD() {
        return this.getChoshuYuyoTbl().getTxtChoshuYuyoShinseiYMD();
    }

    @JsonIgnore
    public TextBox getTxtChoshuYuyoShinseiRiyu() {
        return this.getChoshuYuyoTbl().getTxtChoshuYuyoShinseiRiyu();
    }

    @JsonIgnore
    public TextBoxDate getTxtChoshuYuyoKeitteiYMD() {
        return this.getChoshuYuyoTbl().getTxtChoshuYuyoKeitteiYMD();
    }

    @JsonIgnore
    public TextBox getTxtChoshuYuyoShouninRiyu() {
        return this.getChoshuYuyoTbl().getTxtChoshuYuyoShouninRiyu();
    }

    @JsonIgnore
    public TextBox getTxtChoshuYuyoShurui() {
        return this.getChoshuYuyoTbl().getTxtChoshuYuyoShurui();
    }

    @JsonIgnore
    public ChoshuYuyoKikanDiv getChoshuYuyoKikan() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi();
    }

    @JsonIgnore
    public Label getLblYuyoKaishiFrom() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblYuyoKaishiFrom();
    }

    @JsonIgnore
    public Label getLblYuyoKaishiTo() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblYuyoKaishiTo();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki1() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki1();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi1() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi1();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki2() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki2();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi2() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi2();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki3() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki3();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi3() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi3();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki4() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki4();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi4() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi4();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki5() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki5();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi5() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi5();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki6() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki6();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi6() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi6();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki7() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki7();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi7() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi7();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki8() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki8();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi8() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi8();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki9() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki9();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi9() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi9();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki10() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki10();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi10() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi10();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki11() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki11();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi11() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi11();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki12() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki12();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi12() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi12();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki13() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki13();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi13() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi13();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoTsuki14() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoTsuki14();
    }

    @JsonIgnore
    public Label getLblChoshuYuyoKi14() {
        return this.getChoshuYuyoTbl().getChoshuYuyoKikan().getLblChoshuYuyoKi14();
    }

}
