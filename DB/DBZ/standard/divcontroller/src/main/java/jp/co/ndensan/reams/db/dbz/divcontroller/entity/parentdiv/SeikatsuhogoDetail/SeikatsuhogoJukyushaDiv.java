package jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.SeikatsuhogoDetail;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.SeikatsuhogoDetail.HokenryoDairinofuDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.SeikatsuhogoDetail.KyugoShisetsuDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * SeikatsuhogoJukyusha のクラスファイル 
 * 
 * @author 自動生成
 */
public class SeikatsuhogoJukyushaDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("txtJukyushaNo")
    private TextBoxCode txtJukyushaNo;
    @JsonProperty("txtKaishiYM")
    private TextBoxDate txtKaishiYM;
    @JsonProperty("txtHaishiYM")
    private TextBoxDate txtHaishiYM;
    @JsonProperty("HokenryoDairinofu")
    private HokenryoDairinofuDiv HokenryoDairinofu;
    @JsonProperty("KyugoShisetsu")
    private KyugoShisetsuDiv KyugoShisetsu;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("txtJukyushaNo")
    public TextBoxCode getTxtJukyushaNo() {
        return txtJukyushaNo;
    }

    @JsonProperty("txtJukyushaNo")
    public void setTxtJukyushaNo(TextBoxCode txtJukyushaNo) {
        this.txtJukyushaNo=txtJukyushaNo;
    }

    @JsonProperty("txtKaishiYM")
    public TextBoxDate getTxtKaishiYM() {
        return txtKaishiYM;
    }

    @JsonProperty("txtKaishiYM")
    public void setTxtKaishiYM(TextBoxDate txtKaishiYM) {
        this.txtKaishiYM=txtKaishiYM;
    }

    @JsonProperty("txtHaishiYM")
    public TextBoxDate getTxtHaishiYM() {
        return txtHaishiYM;
    }

    @JsonProperty("txtHaishiYM")
    public void setTxtHaishiYM(TextBoxDate txtHaishiYM) {
        this.txtHaishiYM=txtHaishiYM;
    }

    @JsonProperty("HokenryoDairinofu")
    public HokenryoDairinofuDiv getHokenryoDairinofu() {
        return HokenryoDairinofu;
    }

    @JsonProperty("HokenryoDairinofu")
    public void setHokenryoDairinofu(HokenryoDairinofuDiv HokenryoDairinofu) {
        this.HokenryoDairinofu=HokenryoDairinofu;
    }

    @JsonProperty("KyugoShisetsu")
    public KyugoShisetsuDiv getKyugoShisetsu() {
        return KyugoShisetsu;
    }

    @JsonProperty("KyugoShisetsu")
    public void setKyugoShisetsu(KyugoShisetsuDiv KyugoShisetsu) {
        this.KyugoShisetsu=KyugoShisetsu;
    }

}