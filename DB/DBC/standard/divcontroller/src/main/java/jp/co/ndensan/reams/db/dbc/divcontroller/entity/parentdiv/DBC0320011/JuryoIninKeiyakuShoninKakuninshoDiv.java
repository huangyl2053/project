package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0320011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.ur.urz.divcontroller.entity.commonchilddiv.chohyoshutsuryokujun.ChohyoShutsuryokujun.ChohyoShutsuryokujunDiv;
import jp.co.ndensan.reams.ur.urz.divcontroller.entity.commonchilddiv.chohyoshutsuryokujun.ChohyoShutsuryokujun.IChohyoShutsuryokujunDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * JuryoIninKeiyakuShoninKakuninsho のクラスファイル 
 * 
 * @author 自動生成
 */
public class JuryoIninKeiyakuShoninKakuninshoDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-08-09_21-40-56">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("JuryoininChushutsuJoken")
    private JuryoininChushutsuJokenDiv JuryoininChushutsuJoken;
    @JsonProperty("ccdChohyoShutsuryokujun")
    private ChohyoShutsuryokujunDiv ccdChohyoShutsuryokujun;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getJuryoininChushutsuJoken
     * @return JuryoininChushutsuJoken
     */
    @JsonProperty("JuryoininChushutsuJoken")
    public JuryoininChushutsuJokenDiv getJuryoininChushutsuJoken() {
        return JuryoininChushutsuJoken;
    }

    /*
     * setJuryoininChushutsuJoken
     * @param JuryoininChushutsuJoken JuryoininChushutsuJoken
     */
    @JsonProperty("JuryoininChushutsuJoken")
    public void setJuryoininChushutsuJoken(JuryoininChushutsuJokenDiv JuryoininChushutsuJoken) {
        this.JuryoininChushutsuJoken = JuryoininChushutsuJoken;
    }

    /*
     * getccdChohyoShutsuryokujun
     * @return ccdChohyoShutsuryokujun
     */
    @JsonProperty("ccdChohyoShutsuryokujun")
    public IChohyoShutsuryokujunDiv getCcdChohyoShutsuryokujun() {
        return ccdChohyoShutsuryokujun;
    }

    // </editor-fold>
}
