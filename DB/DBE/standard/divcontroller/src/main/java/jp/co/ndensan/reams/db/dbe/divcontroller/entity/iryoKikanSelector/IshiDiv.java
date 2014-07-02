package jp.co.ndensan.reams.db.dbe.divcontroller.entity.iryoKikanSelector;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.iryoKikanSelector.IshiListDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * Ishi のクラスファイル 
 * 
 * @author 自動生成
 */
public class IshiDiv extends Panel {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("spaIshi")
    private Space spaIshi;
    @JsonProperty("IshiList")
    private IshiListDiv IshiList;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("spaIshi")
    public Space getSpaIshi() {
        return spaIshi;
    }

    @JsonProperty("spaIshi")
    public void setSpaIshi(Space spaIshi) {
        this.spaIshi=spaIshi;
    }

    @JsonProperty("IshiList")
    public IshiListDiv getIshiList() {
        return IshiList;
    }

    @JsonProperty("IshiList")
    public void setIshiList(IshiListDiv IshiList) {
        this.IshiList=IshiList;
    }

}