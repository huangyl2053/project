package jp.co.ndensan.reams.db.dbd.divcontroller.entity.parentdiv.DBD5410001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.chosaitakusakiandchosaininput.ChosaItakusakiAndChosainInputDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.chosaitakusakiandchosaininput.IChosaItakusakiAndChosainInputDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * ChosaItakusakiAndChosainGuide のクラスファイル 
 * 
 * @author 自動生成
 */
public class ChosaItakusakiAndChosainGuideDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：バージョン情報無し">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("ccdChosaItakusakiAndChosainInput")
    private ChosaItakusakiAndChosainInputDiv ccdChosaItakusakiAndChosainInput;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getccdChosaItakusakiAndChosainInput
     * @return ccdChosaItakusakiAndChosainInput
     */
    @JsonProperty("ccdChosaItakusakiAndChosainInput")
    public IChosaItakusakiAndChosainInputDiv getCcdChosaItakusakiAndChosainInput() {
        return ccdChosaItakusakiAndChosainInput;
    }

    // </editor-fold>
}
