package jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA2040011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dba.divcontroller.entity.commonchilddiv.TaJushochiTokureishaKanri.TaJushochiTokureishaKanri.ITaJushochiTokureishaKanriDiv;
import jp.co.ndensan.reams.db.dba.divcontroller.entity.commonchilddiv.TaJushochiTokureishaKanri.TaJushochiTokureishaKanri.TaJushochiTokureishaKanriDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.kaigoatenainfo.KaigoAtenaInfo.IKaigoAtenaInfoDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.kaigoatenainfo.KaigoAtenaInfo.KaigoAtenaInfoDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * ShikakuKihonJoho のクラスファイル 
 * 
 * @author 自動生成
 */
public class ShikakuKihonJohoDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2017-03-16_09-04-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("ccdKaigoAtenaInfo")
    private KaigoAtenaInfoDiv ccdKaigoAtenaInfo;
    @JsonProperty("cddTaJushochiTokureishaKanri")
    private TaJushochiTokureishaKanriDiv cddTaJushochiTokureishaKanri;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getccdKaigoAtenaInfo
     * @return ccdKaigoAtenaInfo
     */
    @JsonProperty("ccdKaigoAtenaInfo")
    public IKaigoAtenaInfoDiv getCcdKaigoAtenaInfo() {
        return ccdKaigoAtenaInfo;
    }

    /*
     * getcddTaJushochiTokureishaKanri
     * @return cddTaJushochiTokureishaKanri
     */
    @JsonProperty("cddTaJushochiTokureishaKanri")
    public ITaJushochiTokureishaKanriDiv getCddTaJushochiTokureishaKanri() {
        return cddTaJushochiTokureishaKanri;
    }

    // </editor-fold>
}
