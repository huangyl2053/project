package jp.co.ndensan.reams.db.dbe.divcontroller.entity.dbe8020001;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.dbe8020001.tplIkenshoKomokuDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.dbe8020001.tplShujiiIraiJohoDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.TabContainer;

/**
 * tabIkenshoKojinShokai のクラスファイル 
 * 
 * @author 自動生成
 */
public class tabIkenshoKojinShokaiDiv extends TabContainer {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("tplShujiiIraiJoho")
    private tplShujiiIraiJohoDiv tplShujiiIraiJoho;
    @JsonProperty("tplIkenshoKomoku")
    private tplIkenshoKomokuDiv tplIkenshoKomoku;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("tplShujiiIraiJoho")
    public tplShujiiIraiJohoDiv getTplShujiiIraiJoho() {
        return tplShujiiIraiJoho;
    }

    @JsonProperty("tplShujiiIraiJoho")
    public void setTplShujiiIraiJoho(tplShujiiIraiJohoDiv tplShujiiIraiJoho) {
        this.tplShujiiIraiJoho=tplShujiiIraiJoho;
    }

    @JsonProperty("tplIkenshoKomoku")
    public tplIkenshoKomokuDiv getTplIkenshoKomoku() {
        return tplIkenshoKomoku;
    }

    @JsonProperty("tplIkenshoKomoku")
    public void setTplIkenshoKomoku(tplIkenshoKomokuDiv tplIkenshoKomoku) {
        this.tplIkenshoKomoku=tplIkenshoKomoku;
    }

}