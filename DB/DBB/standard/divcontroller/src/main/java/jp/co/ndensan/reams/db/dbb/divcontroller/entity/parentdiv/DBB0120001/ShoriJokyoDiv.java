package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0120001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * ShoriJokyo のクラスファイル 
 * 
 * @author 自動生成
 */
public class ShoriJokyoDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2015-11-30_08-54-50">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("HeijunkaShoriNaiyo")
    private HeijunkaShoriNaiyoDiv HeijunkaShoriNaiyo;
    @JsonProperty("HeijunkaShoriKakunin")
    private HeijunkaShoriKakuninDiv HeijunkaShoriKakunin;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getHeijunkaShoriNaiyo
     * @return HeijunkaShoriNaiyo
     */
    @JsonProperty("HeijunkaShoriNaiyo")
    public HeijunkaShoriNaiyoDiv getHeijunkaShoriNaiyo() {
        return HeijunkaShoriNaiyo;
    }

    /*
     * setHeijunkaShoriNaiyo
     * @param HeijunkaShoriNaiyo HeijunkaShoriNaiyo
     */
    @JsonProperty("HeijunkaShoriNaiyo")
    public void setHeijunkaShoriNaiyo(HeijunkaShoriNaiyoDiv HeijunkaShoriNaiyo) {
        this.HeijunkaShoriNaiyo = HeijunkaShoriNaiyo;
    }

    /*
     * getHeijunkaShoriKakunin
     * @return HeijunkaShoriKakunin
     */
    @JsonProperty("HeijunkaShoriKakunin")
    public HeijunkaShoriKakuninDiv getHeijunkaShoriKakunin() {
        return HeijunkaShoriKakunin;
    }

    /*
     * setHeijunkaShoriKakunin
     * @param HeijunkaShoriKakunin HeijunkaShoriKakunin
     */
    @JsonProperty("HeijunkaShoriKakunin")
    public void setHeijunkaShoriKakunin(HeijunkaShoriKakuninDiv HeijunkaShoriKakunin) {
        this.HeijunkaShoriKakunin = HeijunkaShoriKakunin;
    }

    // </editor-fold>
}
