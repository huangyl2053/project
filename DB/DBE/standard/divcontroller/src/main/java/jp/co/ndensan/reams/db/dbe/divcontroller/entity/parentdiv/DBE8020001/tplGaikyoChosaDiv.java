package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE8020001;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE8020001.GaikyoChosaKihonJohoDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE8020001.GaikyoChosaServiceJokyoDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.TabPanel;

/**
 * tplGaikyoChosa のクラスファイル 
 * 
 * @author 自動生成
 */
public class tplGaikyoChosaDiv extends TabPanel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("GaikyoChosaKihonJoho")
    private GaikyoChosaKihonJohoDiv GaikyoChosaKihonJoho;
    @JsonProperty("GaikyoChosaServiceJokyo")
    private GaikyoChosaServiceJokyoDiv GaikyoChosaServiceJokyo;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("GaikyoChosaKihonJoho")
    public GaikyoChosaKihonJohoDiv getGaikyoChosaKihonJoho() {
        return GaikyoChosaKihonJoho;
    }

    @JsonProperty("GaikyoChosaKihonJoho")
    public void setGaikyoChosaKihonJoho(GaikyoChosaKihonJohoDiv GaikyoChosaKihonJoho) {
        this.GaikyoChosaKihonJoho=GaikyoChosaKihonJoho;
    }

    @JsonProperty("GaikyoChosaServiceJokyo")
    public GaikyoChosaServiceJokyoDiv getGaikyoChosaServiceJokyo() {
        return GaikyoChosaServiceJokyo;
    }

    @JsonProperty("GaikyoChosaServiceJokyo")
    public void setGaikyoChosaServiceJokyo(GaikyoChosaServiceJokyoDiv GaikyoChosaServiceJokyo) {
        this.GaikyoChosaServiceJokyo=GaikyoChosaServiceJokyo;
    }

}