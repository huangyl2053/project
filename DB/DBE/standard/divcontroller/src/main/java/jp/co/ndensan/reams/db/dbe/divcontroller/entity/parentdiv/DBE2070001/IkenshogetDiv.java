package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE2070001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.NinteiTaskList.YokaigoNinteiTaskList.IYokaigoNinteiTaskListDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.NinteiTaskList.YokaigoNinteiTaskList.YokaigoNinteiTaskListDiv;
import jp.co.ndensan.reams.ur.urz.divcontroller.entity.commonchilddiv.KanryoMessage.IKanryoMessageDiv;
import jp.co.ndensan.reams.ur.urz.divcontroller.entity.commonchilddiv.KanryoMessage.KanryoMessageDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * Ikenshoget のクラスファイル 
 * 
 * @author 自動生成
 */
public class IkenshogetDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("Ikenshogetichiran")
    private IkenshogetichiranDiv Ikenshogetichiran;
    @JsonProperty("Ikenshogetselect")
    private IkenshogetselectDiv Ikenshogetselect;
    @JsonProperty("KanryoMsg")
    private KanryoMsgDiv KanryoMsg;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getIkenshogetichiran
     * @return Ikenshogetichiran
     */
    @JsonProperty("Ikenshogetichiran")
    public IkenshogetichiranDiv getIkenshogetichiran() {
        return Ikenshogetichiran;
    }

    /*
     * setIkenshogetichiran
     * @param Ikenshogetichiran Ikenshogetichiran
     */
    @JsonProperty("Ikenshogetichiran")
    public void setIkenshogetichiran(IkenshogetichiranDiv Ikenshogetichiran) {
        this.Ikenshogetichiran = Ikenshogetichiran;
    }

    /*
     * getIkenshogetselect
     * @return Ikenshogetselect
     */
    @JsonProperty("Ikenshogetselect")
    public IkenshogetselectDiv getIkenshogetselect() {
        return Ikenshogetselect;
    }

    /*
     * setIkenshogetselect
     * @param Ikenshogetselect Ikenshogetselect
     */
    @JsonProperty("Ikenshogetselect")
    public void setIkenshogetselect(IkenshogetselectDiv Ikenshogetselect) {
        this.Ikenshogetselect = Ikenshogetselect;
    }

    /*
     * getKanryoMsg
     * @return KanryoMsg
     */
    @JsonProperty("KanryoMsg")
    public KanryoMsgDiv getKanryoMsg() {
        return KanryoMsg;
    }

    /*
     * setKanryoMsg
     * @param KanryoMsg KanryoMsg
     */
    @JsonProperty("KanryoMsg")
    public void setKanryoMsg(KanryoMsgDiv KanryoMsg) {
        this.KanryoMsg = KanryoMsg;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public IYokaigoNinteiTaskListDiv getCcdTaskList() {
        return this.getIkenshogetichiran().getCcdTaskList();
    }

    @JsonIgnore
    public Button getBtnCheck() {
        return this.getIkenshogetselect().getBtnCheck();
    }

    @JsonIgnore
    public void  setBtnCheck(Button BtnCheck) {
        this.getIkenshogetselect().setBtnCheck(BtnCheck);
    }

    @JsonIgnore
    public ButtonDownLoad getBtnikenshogetoutput() {
        return this.getIkenshogetselect().getBtnikenshogetoutput();
    }

    @JsonIgnore
    public void  setBtnikenshogetoutput(ButtonDownLoad btnikenshogetoutput) {
        this.getIkenshogetselect().setBtnikenshogetoutput(btnikenshogetoutput);
    }

    @JsonIgnore
    public IKanryoMessageDiv getCcdKanryoMsg() {
        return this.getKanryoMsg().getCcdKanryoMsg();
    }

    // </editor-fold>
}
