package jp.co.ndensan.reams.db.dbb.divcontroller.entity.DBB0310001;
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
 * HonsanteiChohyoHakko2 のクラスファイル 
 * 
 * @author 自動生成
 */
public class HonsanteiChohyoHakko2Div extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtHakkoYMD")
    private TextBoxDate txtHakkoYMD;
    @JsonProperty("dgHonsanteiTsuchisho")
    private DataGrid<dgHonsanteiTsuchisho_Row> dgHonsanteiTsuchisho;
    @JsonProperty("HonTsuchiKobetsuJoho")
    private HonTsuchiKobetsuJohoDiv HonTsuchiKobetsuJoho;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtHakkoYMD")
    public TextBoxDate getTxtHakkoYMD() {
        return txtHakkoYMD;
    }

    @JsonProperty("txtHakkoYMD")
    public void setTxtHakkoYMD(TextBoxDate txtHakkoYMD) {
        this.txtHakkoYMD=txtHakkoYMD;
    }

    @JsonProperty("dgHonsanteiTsuchisho")
    public DataGrid<dgHonsanteiTsuchisho_Row> getDgHonsanteiTsuchisho() {
        return dgHonsanteiTsuchisho;
    }

    @JsonProperty("dgHonsanteiTsuchisho")
    public void setDgHonsanteiTsuchisho(DataGrid<dgHonsanteiTsuchisho_Row> dgHonsanteiTsuchisho) {
        this.dgHonsanteiTsuchisho=dgHonsanteiTsuchisho;
    }

    @JsonProperty("HonTsuchiKobetsuJoho")
    public HonTsuchiKobetsuJohoDiv getHonTsuchiKobetsuJoho() {
        return HonTsuchiKobetsuJoho;
    }

    @JsonProperty("HonTsuchiKobetsuJoho")
    public void setHonTsuchiKobetsuJoho(HonTsuchiKobetsuJohoDiv HonTsuchiKobetsuJoho) {
        this.HonTsuchiKobetsuJoho=HonTsuchiKobetsuJoho;
    }

}