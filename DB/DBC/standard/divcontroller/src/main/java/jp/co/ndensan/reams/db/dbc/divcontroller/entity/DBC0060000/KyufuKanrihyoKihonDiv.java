package jp.co.ndensan.reams.db.dbc.divcontroller.entity.DBC0060000;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.KaigoAtenaInfoDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.KaigoShikakuKihonDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * KyufuKanrihyoKihon のクラスファイル 
 * 
 * @author 自動生成
 */
public class KyufuKanrihyoKihonDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("KyufuKanrihyoKaigoAtena")
    private KaigoAtenaInfoDiv KyufuKanrihyoKaigoAtena;
    @JsonProperty("KyufuKanrihyoKaigoKihon")
    private KaigoShikakuKihonDiv KyufuKanrihyoKaigoKihon;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("KyufuKanrihyoKaigoAtena")
    public KaigoAtenaInfoDiv getKyufuKanrihyoKaigoAtena() {
        return KyufuKanrihyoKaigoAtena;
    }

    @JsonProperty("KyufuKanrihyoKaigoAtena")
    public void setKyufuKanrihyoKaigoAtena(KaigoAtenaInfoDiv KyufuKanrihyoKaigoAtena) {
        this.KyufuKanrihyoKaigoAtena=KyufuKanrihyoKaigoAtena;
    }

    @JsonProperty("KyufuKanrihyoKaigoKihon")
    public KaigoShikakuKihonDiv getKyufuKanrihyoKaigoKihon() {
        return KyufuKanrihyoKaigoKihon;
    }

    @JsonProperty("KyufuKanrihyoKaigoKihon")
    public void setKyufuKanrihyoKaigoKihon(KaigoShikakuKihonDiv KyufuKanrihyoKaigoKihon) {
        this.KyufuKanrihyoKaigoKihon=KyufuKanrihyoKaigoKihon;
    }

}
