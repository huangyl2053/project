package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.rirekishusei.RirekiShusei;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.KaigoNinteiShinseiKihonJohoInput.IKaigoNinteiShinseiKihonJohoInputDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.KaigoNinteiShinseiKihonJohoInput.KaigoNinteiShinseiKihonJohoInputDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.NinteiInput.INinteiInputDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.NinteiInput.NinteiInputDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.NinteiShinseiTodokedesha.INinteiShinseiTodokedeshaDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.NinteiShinseiTodokedesha.NinteiShinseiTodokedeshaDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.ShinseisonotaJohoInput.IShinseiSonotaJohoInputDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.ZenkaiNinteiKekkaJoho.IZenkaiNinteiKekkaJohoDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.ZenkaiNinteiKekkaJoho.ZenkaiNinteiKekkaJohoDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.chosaitakusakiandchosaininput.ChosaItakusakiAndChosainInputDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.chosaitakusakiandchosaininput.IChosaItakusakiAndChosainInputDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.ShinseiSonotaJohoInput.ShinseiSonotaJohoInput.ShinseiSonotaJohoInputDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.shujiiIryokikanandshujiiinput.IShujiiIryokikanAndShujiiInputDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.shujiiIryokikanandshujiiinput.ShujiiIryokikanAndShujiiInputDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.rirekishusei.RirekiShusei.IRirekiShuseiDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.ShinseisonotaJohoInput.ShinseiSonotaJohoInputDiv;

/**
 * RirekiShusei のクラスファイル 
 * 
 * @author 自動生成
 */
public class RirekiShuseiDiv extends Panel implements IRirekiShuseiDiv {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：Uz-master-57">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("ccdKaigoNinteiShinseiKihonJohoInput")
    private KaigoNinteiShinseiKihonJohoInputDiv ccdKaigoNinteiShinseiKihonJohoInput;
    @JsonProperty("ccdNinteiShinseiTodokedesha")
    private NinteiShinseiTodokedeshaDiv ccdNinteiShinseiTodokedesha;
    @JsonProperty("ShijiiIryokikanAndShijiiInput")
    private ShijiiIryokikanAndShijiiInputDiv ShijiiIryokikanAndShijiiInput;
    @JsonProperty("ChsaItakusakiAndChosainInput")
    private ChsaItakusakiAndChosainInputDiv ChsaItakusakiAndChosainInput;
    @JsonProperty("ccdNinteiJohoInput")
    private NinteiInputDiv ccdNinteiJohoInput;
    @JsonProperty("ccdZenkaiNinteiKekka")
    private ZenkaiNinteiKekkaJohoDiv ccdZenkaiNinteiKekka;
    @JsonProperty("ccdShinseiSonotaJohoInput")
    private ShinseiSonotaJohoInputDiv ccdShinseiSonotaJohoInput;
    @JsonProperty("btnChosaJokyo")
    private ButtonDialog btnChosaJokyo;
    @JsonProperty("btnKakutei")
    private Button btnKakutei;
    @JsonProperty("btnCancel")
    private Button btnCancel;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getccdKaigoNinteiShinseiKihonJohoInput
     * @return ccdKaigoNinteiShinseiKihonJohoInput
     */
    @JsonProperty("ccdKaigoNinteiShinseiKihonJohoInput")
    public IKaigoNinteiShinseiKihonJohoInputDiv getCcdKaigoNinteiShinseiKihonJohoInput() {
        return ccdKaigoNinteiShinseiKihonJohoInput;
    }

    /*
     * getccdNinteiShinseiTodokedesha
     * @return ccdNinteiShinseiTodokedesha
     */
    @JsonProperty("ccdNinteiShinseiTodokedesha")
    public INinteiShinseiTodokedeshaDiv getCcdNinteiShinseiTodokedesha() {
        return ccdNinteiShinseiTodokedesha;
    }

    /*
     * getShijiiIryokikanAndShijiiInput
     * @return ShijiiIryokikanAndShijiiInput
     */
    @JsonProperty("ShijiiIryokikanAndShijiiInput")
    public ShijiiIryokikanAndShijiiInputDiv getShijiiIryokikanAndShijiiInput() {
        return ShijiiIryokikanAndShijiiInput;
    }

    /*
     * setShijiiIryokikanAndShijiiInput
     * @param ShijiiIryokikanAndShijiiInput ShijiiIryokikanAndShijiiInput
     */
    @JsonProperty("ShijiiIryokikanAndShijiiInput")
    public void setShijiiIryokikanAndShijiiInput(ShijiiIryokikanAndShijiiInputDiv ShijiiIryokikanAndShijiiInput) {
        this.ShijiiIryokikanAndShijiiInput = ShijiiIryokikanAndShijiiInput;
    }

    /*
     * getChsaItakusakiAndChosainInput
     * @return ChsaItakusakiAndChosainInput
     */
    @JsonProperty("ChsaItakusakiAndChosainInput")
    public ChsaItakusakiAndChosainInputDiv getChsaItakusakiAndChosainInput() {
        return ChsaItakusakiAndChosainInput;
    }

    /*
     * setChsaItakusakiAndChosainInput
     * @param ChsaItakusakiAndChosainInput ChsaItakusakiAndChosainInput
     */
    @JsonProperty("ChsaItakusakiAndChosainInput")
    public void setChsaItakusakiAndChosainInput(ChsaItakusakiAndChosainInputDiv ChsaItakusakiAndChosainInput) {
        this.ChsaItakusakiAndChosainInput = ChsaItakusakiAndChosainInput;
    }

    /*
     * getccdNinteiJohoInput
     * @return ccdNinteiJohoInput
     */
    @JsonProperty("ccdNinteiJohoInput")
    public INinteiInputDiv getCcdNinteiJohoInput() {
        return ccdNinteiJohoInput;
    }

    /*
     * getccdZenkaiNinteiKekka
     * @return ccdZenkaiNinteiKekka
     */
    @JsonProperty("ccdZenkaiNinteiKekka")
    public IZenkaiNinteiKekkaJohoDiv getCcdZenkaiNinteiKekka() {
        return ccdZenkaiNinteiKekka;
    }

    /*
     * getccdShinseiSonotaJohoInput
     * @return ccdShinseiSonotaJohoInput
     */
    @JsonProperty("ccdShinseiSonotaJohoInput")
    public IShinseiSonotaJohoInputDiv getCcdShinseiSonotaJohoInput() {
        return ccdShinseiSonotaJohoInput;
    }

    /*
     * getbtnChosaJokyo
     * @return btnChosaJokyo
     */
    @JsonProperty("btnChosaJokyo")
    public ButtonDialog getBtnChosaJokyo() {
        return btnChosaJokyo;
    }

    /*
     * setbtnChosaJokyo
     * @param btnChosaJokyo btnChosaJokyo
     */
    @JsonProperty("btnChosaJokyo")
    public void setBtnChosaJokyo(ButtonDialog btnChosaJokyo) {
        this.btnChosaJokyo = btnChosaJokyo;
    }

    /*
     * getbtnKakutei
     * @return btnKakutei
     */
    @JsonProperty("btnKakutei")
    public Button getBtnKakutei() {
        return btnKakutei;
    }

    /*
     * setbtnKakutei
     * @param btnKakutei btnKakutei
     */
    @JsonProperty("btnKakutei")
    public void setBtnKakutei(Button btnKakutei) {
        this.btnKakutei = btnKakutei;
    }

    /*
     * getbtnCancel
     * @return btnCancel
     */
    @JsonProperty("btnCancel")
    public Button getBtnCancel() {
        return btnCancel;
    }

    /*
     * setbtnCancel
     * @param btnCancel btnCancel
     */
    @JsonProperty("btnCancel")
    public void setBtnCancel(Button btnCancel) {
        this.btnCancel = btnCancel;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public IShujiiIryokikanAndShujiiInputDiv getCcdShujiiIryokikanAndShujiiInput() {
        return this.getShijiiIryokikanAndShijiiInput().getCcdShujiiIryokikanAndShujiiInput();
    }

    @JsonIgnore
    public IChosaItakusakiAndChosainInputDiv getCcdChosaItakusakiAndChosainInput() {
        return this.getChsaItakusakiAndChosainInput().getCcdChosaItakusakiAndChosainInput();
    }

    // </editor-fold>
    //--------------- この行より下にコードを追加してください -------------------

}
