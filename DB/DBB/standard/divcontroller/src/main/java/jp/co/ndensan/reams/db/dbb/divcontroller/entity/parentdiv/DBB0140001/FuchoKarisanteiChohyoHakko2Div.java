package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0140001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.ur.urz.divcontroller.entity.commonchilddiv.OutputChohyoIchiran.IOutputChohyoIchiranDiv;
import jp.co.ndensan.reams.ur.urz.divcontroller.entity.commonchilddiv.OutputChohyoIchiran.OutputChohyoIchiranDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * FuchoKarisanteiChohyoHakko2 のクラスファイル
 *
 * @reamsid_L DBB-0710-010 gongliang
 */
public class FuchoKarisanteiChohyoHakko2Div extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("FuchoTsuchiKobetsuJoho")
    private FuchoTsuchiKobetsuJohoDiv FuchoTsuchiKobetsuJoho;
    @JsonProperty("ccdChohyoIchiran")
    private OutputChohyoIchiranDiv ccdChohyoIchiran;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getFuchoTsuchiKobetsuJoho
     * @return FuchoTsuchiKobetsuJoho
     */
    @JsonProperty("FuchoTsuchiKobetsuJoho")
    public FuchoTsuchiKobetsuJohoDiv getFuchoTsuchiKobetsuJoho() {
        return FuchoTsuchiKobetsuJoho;
    }

    /*
     * setFuchoTsuchiKobetsuJoho
     * @param FuchoTsuchiKobetsuJoho FuchoTsuchiKobetsuJoho
     */
    @JsonProperty("FuchoTsuchiKobetsuJoho")
    public void setFuchoTsuchiKobetsuJoho(FuchoTsuchiKobetsuJohoDiv FuchoTsuchiKobetsuJoho) {
        this.FuchoTsuchiKobetsuJoho = FuchoTsuchiKobetsuJoho;
    }

    /*
     * getccdChohyoIchiran
     * @return ccdChohyoIchiran
     */
    @JsonProperty("ccdChohyoIchiran")
    public IOutputChohyoIchiranDiv getCcdChohyoIchiran() {
        return ccdChohyoIchiran;
    }

    // </editor-fold>
}