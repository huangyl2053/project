/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.definition.batchprm.DBD102020;

import java.util.UUID;
import jp.co.ndensan.reams.db.dbd.definition.processprm.gemmen.shinseisho.hakko.ShinseishoHakkoProcessParameter;
import jp.co.ndensan.reams.uz.uza.batch.BatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchParameterBase;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import lombok.Getter;
import lombok.Setter;

/**
 * バッチ設計_DBDBT12021_2_減免減額申請書一括発行バッチパラメタークラスです．
 *
 * @reamsid_L DBD-3530-070 mawy
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class DBD102020_GemmenGengakuShinseishoIkkatsuHakkoParameter extends BatchParameterBase {

    private static final String HAKKOSHORIID = "hakkoshoriid";
    private static final String SHUTSURYOKUFLAG = "shutsuryokuflag";
    private static final String KAIPAGESHUTSURYOKUJUNID = "kaipageshutsuryokujunid";
    private static final String KIZYUNNICHI = "kizyunnichi";
    private static final String CYOHYOID = "cyohyoid";
    private static final String HAKKONICHI = "hakkonichi";

    @BatchParameter(key = HAKKOSHORIID, name = "発行処理ID")
    private UUID 発行処理ID;
    @BatchParameter(key = SHUTSURYOKUFLAG, name = "出力フラグ")
    private boolean 出力フラグ;
    @BatchParameter(key = KAIPAGESHUTSURYOKUJUNID, name = "改頁出力順ID")
    private long 改頁出力順ID;
    @BatchParameter(key = KIZYUNNICHI, name = "基準日")
    private FlexibleDate 基準日;
    @BatchParameter(key = CYOHYOID, name = "帳票ID")
    private ReportId 帳票ID;
    @BatchParameter(key = HAKKONICHI, name = "発行日")
    private FlexibleDate 発行日;

    /**
     * コンストラクタです。
     */
    public DBD102020_GemmenGengakuShinseishoIkkatsuHakkoParameter() {
    }

    /**
     * コンストラクタです。
     *
     * @param 発行処理ID 発行処理ID
     * @param 出力フラグ 出力フラグ
     * @param 改頁出力順ID 改頁出力順ID
     * @param 基準日 基準日
     * @param 帳票ID 帳票ID
     * @param 発行日 発行日
     */
    public DBD102020_GemmenGengakuShinseishoIkkatsuHakkoParameter(
            UUID 発行処理ID,
            boolean 出力フラグ,
            long 改頁出力順ID,
            FlexibleDate 基準日,
            ReportId 帳票ID,
            FlexibleDate 発行日) {
        this.発行処理ID = 発行処理ID;
        this.出力フラグ = 出力フラグ;
        this.改頁出力順ID = 改頁出力順ID;
        this.基準日 = 基準日;
        this.帳票ID = 帳票ID;
        this.発行日 = 発行日;
    }

    /**
     * バーチのパラメータを作成します。
     *
     * @return FutanGendogakuMybatisParameter
     */
    public ShinseishoHakkoProcessParameter toShinseishoHakkoProcessParameter() {
        return new ShinseishoHakkoProcessParameter(発行処理ID, 出力フラグ, 改頁出力順ID, 基準日, 帳票ID, 発行日);
    }
}