package jp.co.ndensan.reams.db.dbc.divcontroller.entity.DBC0120000;
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
 * KyotakuJikoRiyohyoKihon のクラスファイル 
 * 
 * @author 自動生成
 */
public class KyotakuJikoRiyohyoKihonDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("KyotakuJikoRiyohyoKihonAtena")
    private KaigoAtenaInfoDiv KyotakuJikoRiyohyoKihonAtena;
    @JsonProperty("KyotakuJikoRiyohyoKaigoKihon")
    private KaigoShikakuKihonDiv KyotakuJikoRiyohyoKaigoKihon;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("KyotakuJikoRiyohyoKihonAtena")
    public KaigoAtenaInfoDiv getKyotakuJikoRiyohyoKihonAtena() {
        return KyotakuJikoRiyohyoKihonAtena;
    }

    @JsonProperty("KyotakuJikoRiyohyoKihonAtena")
    public void setKyotakuJikoRiyohyoKihonAtena(KaigoAtenaInfoDiv KyotakuJikoRiyohyoKihonAtena) {
        this.KyotakuJikoRiyohyoKihonAtena=KyotakuJikoRiyohyoKihonAtena;
    }

    @JsonProperty("KyotakuJikoRiyohyoKaigoKihon")
    public KaigoShikakuKihonDiv getKyotakuJikoRiyohyoKaigoKihon() {
        return KyotakuJikoRiyohyoKaigoKihon;
    }

    @JsonProperty("KyotakuJikoRiyohyoKaigoKihon")
    public void setKyotakuJikoRiyohyoKaigoKihon(KaigoShikakuKihonDiv KyotakuJikoRiyohyoKaigoKihon) {
        this.KyotakuJikoRiyohyoKaigoKihon=KyotakuJikoRiyohyoKaigoKihon;
    }

}