package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB2710002;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * KonkaiShorinaiyoPanel のクラスファイル 
 * 
 * @author 自動生成
 */
public class KonkaiShorinaiyoPanelDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtTokuchoGimusha")
    private TextBox txtTokuchoGimusha;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * gettxtTokuchoGimusha
     * @return txtTokuchoGimusha
     */
    @JsonProperty("txtTokuchoGimusha")
    public TextBox getTxtTokuchoGimusha() {
        return txtTokuchoGimusha;
    }

    /*
     * settxtTokuchoGimusha
     * @param txtTokuchoGimusha txtTokuchoGimusha
     */
    @JsonProperty("txtTokuchoGimusha")
    public void setTxtTokuchoGimusha(TextBox txtTokuchoGimusha) {
        this.txtTokuchoGimusha = txtTokuchoGimusha;
    }

    // </editor-fold>
}