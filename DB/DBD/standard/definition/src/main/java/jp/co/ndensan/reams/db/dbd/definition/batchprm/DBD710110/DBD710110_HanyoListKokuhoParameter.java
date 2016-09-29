/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.definition.batchprm.DBD710110;

import jp.co.ndensan.reams.db.dbd.definition.processprm.dbd710110.HanyoListKokuhoProcessParameter;
import jp.co.ndensan.reams.db.dbz.definition.batchprm.hanyolist.atena.AtenaSelectBatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.BatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchParameterBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * 汎用リスト出力(国保)_バッチ用のパラメータです。
 *
 * @reamsid_L DBD-5510-030 mawy
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class DBD710110_HanyoListKokuhoParameter extends BatchParameterBase {

    private static final String HYOUDAI = "hyoudai";
    private static final String DETASYUBETSUMESYO = "detasyubetsumesyo";
    private static final String SYUTSURYOKU = "syutsuryoku";
    private static final String CYUSYUTSUHOHOKUBUN = "cyusyutsuhohokubun";
    private static final String CYUSYUTSUKOMOKUKUBUN = "cyusyutsukomokukubun";
    private static final String KIZYUNNICHI = "kizyunnichi";
    private static final String HITSUKEHANIFROM = "hitsukehanifrom";
    private static final String HITSUKEHANITO = "hitsukehanito";
    private static final String SOSHITSUKUBUN = "soshitsukubun";
    private static final String KOMOKUMEIFUKA = "komokumeifuka";
    private static final String RENBANFUKA = "renbanfuka";
    private static final String HITSUKESURASYUHENSYU = "hitsukesurasyuhensyu";
    private static final String ATENACYUSYUTSUJYOKEN = "atenacyusyutsujyoken";
    private static final String CYOHYOID = "cyohyoid";
    private static final String SYUTSURYOKUJUN = "syutsuryokujun";
    private static final String SYUTSURYOKUKOMOKU = "syutsuryokukomoku";

    @BatchParameter(key = HYOUDAI, name = "表題")
    private RString hyoudai;
    @BatchParameter(key = DETASYUBETSUMESYO, name = "データ種別名")
    private RString detasyubetsumesyo;
    @BatchParameter(key = SYUTSURYOKU, name = "出力方法")
    private RString syutsuryoku;
    @BatchParameter(key = CYUSYUTSUHOHOKUBUN, name = "抽出方法区分")
    private RString cyusyutsuhohokubun;
    @BatchParameter(key = CYUSYUTSUKOMOKUKUBUN, name = "抽出項目区分")
    private RString cyusyutsukomokukubun;
    @BatchParameter(key = KIZYUNNICHI, name = "基準日")
    private FlexibleDate kizyunnichi;
    @BatchParameter(key = HITSUKEHANIFROM, name = "日付範囲From")
    private FlexibleDate hitsukehanifrom;
    @BatchParameter(key = HITSUKEHANITO, name = "日付範囲To")
    private FlexibleDate hitsukehanito;
    @BatchParameter(key = SOSHITSUKUBUN, name = "喪失区分")
    private RString soshitsukubun;
    @BatchParameter(key = KOMOKUMEIFUKA, name = "項目名付加")
    private boolean isCsvkomokumeifuka;
    @BatchParameter(key = RENBANFUKA, name = "連番付加")
    private boolean isCsvrenbanfuka;
    @BatchParameter(key = HITSUKESURASYUHENSYU, name = "日付スラッシュ付加")
    private boolean isCsvhitsukesurasyuhensyu;
    @BatchParameter(key = CYOHYOID, name = "帳票ID")
    private RString cyohyoid;
    @BatchParameter(key = ATENACYUSYUTSUJYOKEN, name = "宛名抽出条件")
    private AtenaSelectBatchParameter atenacyusyutsujyoken;
    @BatchParameter(key = SYUTSURYOKUJUN, name = "出力順")
    private Long syutsuryokujun;
    @BatchParameter(key = SYUTSURYOKUKOMOKU, name = "出力項目")
    private RString syutsuryokukomoku;

    /**
     * バーチのパラメータを作成します。
     *
     * @return HanyoListKokuhoProcessParameter
     */
    public HanyoListKokuhoProcessParameter toHanyoRisutoKokuhoProcessParameter() {
        return new HanyoListKokuhoProcessParameter(
                hyoudai,
                detasyubetsumesyo,
                syutsuryoku,
                cyusyutsuhohokubun,
                cyusyutsukomokukubun,
                kizyunnichi,
                hitsukehanifrom,
                hitsukehanito,
                soshitsukubun,
                isCsvkomokumeifuka,
                isCsvrenbanfuka,
                isCsvhitsukesurasyuhensyu,
                atenacyusyutsujyoken,
                cyohyoid,
                syutsuryokujun,
                syutsuryokukomoku
        );
    }
}
