package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * TankiNyushoJikoSakuseiSummarySub1 のクラスファイル 
 * 
 * @author 自動生成
 */
public class TankiNyushoJikoSakuseiSummarySub1Div extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("tblTankiNyushoJikoSakuseiSummarySub1")
    private tblTankiNyushoJikoSakuseiSummarySub1Div tblTankiNyushoJikoSakuseiSummarySub1;
    @JsonProperty("tblTankiNyushoJikoSakuseiSummarySub2")
    private tblTankiNyushoJikoSakuseiSummarySub2Div tblTankiNyushoJikoSakuseiSummarySub2;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("tblTankiNyushoJikoSakuseiSummarySub1")
    public tblTankiNyushoJikoSakuseiSummarySub1Div getTblTankiNyushoJikoSakuseiSummarySub1() {
        return tblTankiNyushoJikoSakuseiSummarySub1;
    }

    @JsonProperty("tblTankiNyushoJikoSakuseiSummarySub1")
    public void setTblTankiNyushoJikoSakuseiSummarySub1(tblTankiNyushoJikoSakuseiSummarySub1Div tblTankiNyushoJikoSakuseiSummarySub1) {
        this.tblTankiNyushoJikoSakuseiSummarySub1=tblTankiNyushoJikoSakuseiSummarySub1;
    }

    @JsonProperty("tblTankiNyushoJikoSakuseiSummarySub2")
    public tblTankiNyushoJikoSakuseiSummarySub2Div getTblTankiNyushoJikoSakuseiSummarySub2() {
        return tblTankiNyushoJikoSakuseiSummarySub2;
    }

    @JsonProperty("tblTankiNyushoJikoSakuseiSummarySub2")
    public void setTblTankiNyushoJikoSakuseiSummarySub2(tblTankiNyushoJikoSakuseiSummarySub2Div tblTankiNyushoJikoSakuseiSummarySub2) {
        this.tblTankiNyushoJikoSakuseiSummarySub2=tblTankiNyushoJikoSakuseiSummarySub2;
    }

}