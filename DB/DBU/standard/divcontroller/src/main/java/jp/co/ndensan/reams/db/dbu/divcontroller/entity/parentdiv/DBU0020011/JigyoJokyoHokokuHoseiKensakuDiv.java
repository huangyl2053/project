package jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0020011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * JigyoJokyoHokokuHoseiKensaku のクラスファイル
 *
 * @reamsid_L DBU-1100-010 huangyanan
 */
public class JigyoJokyoHokokuHoseiKensakuDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("Taishokensaku")
    private TaishokensakuDiv Taishokensaku;
    @JsonProperty("HoseitaishoYoshikiIchiran")
    private HoseitaishoYoshikiIchiranDiv HoseitaishoYoshikiIchiran;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getTaishokensaku
     * @return Taishokensaku
     */
    @JsonProperty("Taishokensaku")
    public TaishokensakuDiv getTaishokensaku() {
        return Taishokensaku;
    }

    /*
     * setTaishokensaku
     * @param Taishokensaku Taishokensaku
     */
    @JsonProperty("Taishokensaku")
    public void setTaishokensaku(TaishokensakuDiv Taishokensaku) {
        this.Taishokensaku = Taishokensaku;
    }

    /*
     * getHoseitaishoYoshikiIchiran
     * @return HoseitaishoYoshikiIchiran
     */
    @JsonProperty("HoseitaishoYoshikiIchiran")
    public HoseitaishoYoshikiIchiranDiv getHoseitaishoYoshikiIchiran() {
        return HoseitaishoYoshikiIchiran;
    }

    /*
     * setHoseitaishoYoshikiIchiran
     * @param HoseitaishoYoshikiIchiran HoseitaishoYoshikiIchiran
     */
    @JsonProperty("HoseitaishoYoshikiIchiran")
    public void setHoseitaishoYoshikiIchiran(HoseitaishoYoshikiIchiranDiv HoseitaishoYoshikiIchiran) {
        this.HoseitaishoYoshikiIchiran = HoseitaishoYoshikiIchiran;
    }

    // </editor-fold>
}