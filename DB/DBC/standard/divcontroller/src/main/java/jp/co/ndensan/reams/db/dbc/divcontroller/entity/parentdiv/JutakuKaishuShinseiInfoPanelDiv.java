package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.JutakuKaishuShinseiContentsDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.JutakuKaishuShinseiResetInfoDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * JutakuKaishuShinseiInfoPanel のクラスファイル 
 * 
 * @author 自動生成
 */
public class JutakuKaishuShinseiInfoPanelDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("JutakuKaishuShinseiContents")
    private JutakuKaishuShinseiContentsDiv JutakuKaishuShinseiContents;
    @JsonProperty("JutakuKaishuShinseiResetInfo")
    private JutakuKaishuShinseiResetInfoDiv JutakuKaishuShinseiResetInfo;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("JutakuKaishuShinseiContents")
    public JutakuKaishuShinseiContentsDiv getJutakuKaishuShinseiContents() {
        return JutakuKaishuShinseiContents;
    }

    @JsonProperty("JutakuKaishuShinseiContents")
    public void setJutakuKaishuShinseiContents(JutakuKaishuShinseiContentsDiv JutakuKaishuShinseiContents) {
        this.JutakuKaishuShinseiContents=JutakuKaishuShinseiContents;
    }

    @JsonProperty("JutakuKaishuShinseiResetInfo")
    public JutakuKaishuShinseiResetInfoDiv getJutakuKaishuShinseiResetInfo() {
        return JutakuKaishuShinseiResetInfo;
    }

    @JsonProperty("JutakuKaishuShinseiResetInfo")
    public void setJutakuKaishuShinseiResetInfo(JutakuKaishuShinseiResetInfoDiv JutakuKaishuShinseiResetInfo) {
        this.JutakuKaishuShinseiResetInfo=JutakuKaishuShinseiResetInfo;
    }

}
