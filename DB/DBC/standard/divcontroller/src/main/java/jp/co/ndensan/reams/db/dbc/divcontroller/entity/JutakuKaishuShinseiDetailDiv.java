package jp.co.ndensan.reams.db.dbc.divcontroller.entity;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.JutakuKaishuShinseiDetailInputDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.KyufugakuSummaryDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * JutakuKaishuShinseiDetail のクラスファイル 
 * 
 * @author 自動生成
 */
public class JutakuKaishuShinseiDetailDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("JutakuKaishuShinseiDetailInput")
    private JutakuKaishuShinseiDetailInputDiv JutakuKaishuShinseiDetailInput;
    @JsonProperty("JutakuKaishuShinseiKyufugakuSummary")
    private KyufugakuSummaryDiv JutakuKaishuShinseiKyufugakuSummary;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("JutakuKaishuShinseiDetailInput")
    public JutakuKaishuShinseiDetailInputDiv getJutakuKaishuShinseiDetailInput() {
        return JutakuKaishuShinseiDetailInput;
    }

    @JsonProperty("JutakuKaishuShinseiDetailInput")
    public void setJutakuKaishuShinseiDetailInput(JutakuKaishuShinseiDetailInputDiv JutakuKaishuShinseiDetailInput) {
        this.JutakuKaishuShinseiDetailInput=JutakuKaishuShinseiDetailInput;
    }

    @JsonProperty("JutakuKaishuShinseiKyufugakuSummary")
    public KyufugakuSummaryDiv getJutakuKaishuShinseiKyufugakuSummary() {
        return JutakuKaishuShinseiKyufugakuSummary;
    }

    @JsonProperty("JutakuKaishuShinseiKyufugakuSummary")
    public void setJutakuKaishuShinseiKyufugakuSummary(KyufugakuSummaryDiv JutakuKaishuShinseiKyufugakuSummary) {
        this.JutakuKaishuShinseiKyufugakuSummary=JutakuKaishuShinseiKyufugakuSummary;
    }

}