package jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.kaigoatenainfo;

/**
 * このコードはツールによって生成されました。 このファイルへの変更は、再生成時には損失するため 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jp.co.ndensan.reams.ua.uax.divcontroller.entity.commonchilddiv.AtenaShokaiSimple.AtenaShokaiSimpleDiv;
import jp.co.ndensan.reams.ua.uax.divcontroller.entity.commonchilddiv.AtenaShokaiSimple.IAtenaShokaiSimpleDiv;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;

/**
 * KaigoAtenaInfo のクラスファイル
 *
 * @author 自動生成
 */
public class KaigoAtenaInfoDiv extends Panel implements IKaigoAtenaInfoDiv {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */

    @JsonProperty("atenaInfo")
    private AtenaShokaiSimpleDiv atenaInfo;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("atenaInfo")
    public IAtenaShokaiSimpleDiv getAtenaInfo() {
        return atenaInfo;
    }

    //--------------- この行より下にコードを追加してください -------------------
    @Override
    public void load(ShikibetsuCode 識別コード) {
        getHandler().load(識別コード);
    }

    @Override
    public void set介護宛名資格モード() {
        getHandler().set介護宛名資格モード();
    }

    @Override
    public void set介護宛名賦課モード() {
        getHandler().set介護宛名賦課モード();
    }

    @Override
    public AtenaMeisho getName() {
        return atenaInfo.getShokaiData().getTxtAtenaMeisho().getDomain();
    }

    @JsonIgnore
    public KaigoAtenaInfoHandler getHandler() {
        return new KaigoAtenaInfoHandler(this);
    }
}