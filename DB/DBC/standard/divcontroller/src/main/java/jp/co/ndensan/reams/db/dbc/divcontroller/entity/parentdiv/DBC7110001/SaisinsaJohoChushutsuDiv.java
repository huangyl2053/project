package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC7110001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * SaisinsaJohoChushutsu のクラスファイル 
 * 
 * @author 自動生成
 */
public class SaisinsaJohoChushutsuDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-08-09_21-40-56">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtSabisuTeikyoNengetu")
    private TextBoxDateRange txtSabisuTeikyoNengetu;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * gettxtSabisuTeikyoNengetu
     * @return txtSabisuTeikyoNengetu
     */
    @JsonProperty("txtSabisuTeikyoNengetu")
    public TextBoxDateRange getTxtSabisuTeikyoNengetu() {
        return txtSabisuTeikyoNengetu;
    }

    /*
     * settxtSabisuTeikyoNengetu
     * @param txtSabisuTeikyoNengetu txtSabisuTeikyoNengetu
     */
    @JsonProperty("txtSabisuTeikyoNengetu")
    public void setTxtSabisuTeikyoNengetu(TextBoxDateRange txtSabisuTeikyoNengetu) {
        this.txtSabisuTeikyoNengetu = txtSabisuTeikyoNengetu;
    }

    // </editor-fold>
}
