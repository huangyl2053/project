package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.SeikatsuhogoDetail;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * FujoShurui のクラスファイル 
 * 
 * @author 自動生成
 */
public class FujoShuruiDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("chkFujoShurui")
    private CheckBoxList chkFujoShurui;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getchkFujoShurui
     * @return chkFujoShurui
     */
    @JsonProperty("chkFujoShurui")
    public CheckBoxList getChkFujoShurui() {
        return chkFujoShurui;
    }

    /*
     * setchkFujoShurui
     * @param chkFujoShurui chkFujoShurui
     */
    @JsonProperty("chkFujoShurui")
    public void setChkFujoShurui(CheckBoxList chkFujoShurui) {
        this.chkFujoShurui = chkFujoShurui;
    }

    // </editor-fold>
}