package jp.co.ndensan.reams.db.dbb.divcontroller.entity.DBB0310001;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbb.divcontroller.entity.DBB0310001.HonsanteiShoriKakuninDiv;
import jp.co.ndensan.reams.db.dbb.divcontroller.entity.DBB0310001.HonsanteiShoriNaiyoDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * ShoriJokyo のクラスファイル 
 * 
 * @author 自動生成
 */
public class ShoriJokyoDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("HonsanteiShoriNaiyo")
    private HonsanteiShoriNaiyoDiv HonsanteiShoriNaiyo;
    @JsonProperty("HonsanteiShoriKakunin")
    private HonsanteiShoriKakuninDiv HonsanteiShoriKakunin;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("HonsanteiShoriNaiyo")
    public HonsanteiShoriNaiyoDiv getHonsanteiShoriNaiyo() {
        return HonsanteiShoriNaiyo;
    }

    @JsonProperty("HonsanteiShoriNaiyo")
    public void setHonsanteiShoriNaiyo(HonsanteiShoriNaiyoDiv HonsanteiShoriNaiyo) {
        this.HonsanteiShoriNaiyo=HonsanteiShoriNaiyo;
    }

    @JsonProperty("HonsanteiShoriKakunin")
    public HonsanteiShoriKakuninDiv getHonsanteiShoriKakunin() {
        return HonsanteiShoriKakunin;
    }

    @JsonProperty("HonsanteiShoriKakunin")
    public void setHonsanteiShoriKakunin(HonsanteiShoriKakuninDiv HonsanteiShoriKakunin) {
        this.HonsanteiShoriKakunin=HonsanteiShoriKakunin;
    }

}