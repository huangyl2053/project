package jp.co.ndensan.reams.db.dbz.divcontroller.entity.dbz0010000;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * SogoShokaiSaishinsaJiyu のクラスファイル 
 * 
 * @author 自動生成
 */
public class SogoShokaiSaishinsaJiyuDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtSaishinsaMoshitateKomoku")
    private TextBox txtSaishinsaMoshitateKomoku;
    @JsonProperty("txtSaishinsaMoshitateRiyu")
    private TextBox txtSaishinsaMoshitateRiyu;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtSaishinsaMoshitateKomoku")
    public TextBox getTxtSaishinsaMoshitateKomoku() {
        return txtSaishinsaMoshitateKomoku;
    }

    @JsonProperty("txtSaishinsaMoshitateKomoku")
    public void setTxtSaishinsaMoshitateKomoku(TextBox txtSaishinsaMoshitateKomoku) {
        this.txtSaishinsaMoshitateKomoku=txtSaishinsaMoshitateKomoku;
    }

    @JsonProperty("txtSaishinsaMoshitateRiyu")
    public TextBox getTxtSaishinsaMoshitateRiyu() {
        return txtSaishinsaMoshitateRiyu;
    }

    @JsonProperty("txtSaishinsaMoshitateRiyu")
    public void setTxtSaishinsaMoshitateRiyu(TextBox txtSaishinsaMoshitateRiyu) {
        this.txtSaishinsaMoshitateRiyu=txtSaishinsaMoshitateRiyu;
    }

}
