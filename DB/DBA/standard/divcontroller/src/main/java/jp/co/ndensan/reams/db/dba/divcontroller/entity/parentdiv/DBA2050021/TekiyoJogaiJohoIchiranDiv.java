package jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA2050021;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.TekiyoJogaiRireki.ITekiyoJogaiRirekiDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.TekiyoJogaiRireki.TekiyoJogaiRirekiDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * TekiyoJogaiJohoIchiran のクラスファイル
 *
 * @reamsid_L DBA-0411-050 lizhuoxuan
 */
public class TekiyoJogaiJohoIchiranDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("ShisetsuHenkoJohoInput")
    private ShisetsuHenkoJohoInputDiv ShisetsuHenkoJohoInput;
    @JsonProperty("ccdTekiyoJogaiRireki")
    private TekiyoJogaiRirekiDiv ccdTekiyoJogaiRireki;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getShisetsuHenkoJohoInput
     * @return ShisetsuHenkoJohoInput
     */
    @JsonProperty("ShisetsuHenkoJohoInput")
    public ShisetsuHenkoJohoInputDiv getShisetsuHenkoJohoInput() {
        return ShisetsuHenkoJohoInput;
    }

    /*
     * setShisetsuHenkoJohoInput
     * @param ShisetsuHenkoJohoInput ShisetsuHenkoJohoInput
     */
    @JsonProperty("ShisetsuHenkoJohoInput")
    public void setShisetsuHenkoJohoInput(ShisetsuHenkoJohoInputDiv ShisetsuHenkoJohoInput) {
        this.ShisetsuHenkoJohoInput = ShisetsuHenkoJohoInput;
    }

    /*
     * getccdTekiyoJogaiRireki
     * @return ccdTekiyoJogaiRireki
     */
    @JsonProperty("ccdTekiyoJogaiRireki")
    public ITekiyoJogaiRirekiDiv getCcdTekiyoJogaiRireki() {
        return ccdTekiyoJogaiRireki;
    }

    // </editor-fold>
}
