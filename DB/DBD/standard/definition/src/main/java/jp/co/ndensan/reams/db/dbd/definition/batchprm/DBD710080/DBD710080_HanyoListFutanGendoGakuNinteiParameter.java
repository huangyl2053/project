/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.definition.batchprm.DBD710080;

import jp.co.ndensan.reams.db.dbd.definition.processprm.dbd710080.HanyoListFutanGendoGakuNinteiProcessParameter;
import jp.co.ndensan.reams.db.dbz.definition.batchprm.hanyolist.atena.AtenaSelectBatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.BatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchParameterBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * 汎用リスト出力(負担限度額認定)_バッチ用のパラメータです。
 *
 * @reamsid_L DBD-3930-030 panxiaobo
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class DBD710080_HanyoListFutanGendoGakuNinteiParameter extends BatchParameterBase {

    private static final String HYOUDAI = "hyoudai";
    private static final String DETASYUBETSUMESYO = "detasyubetsumesyo";
    private static final String SYUTSURYOKU = "syutsuryoku";
    private static final String CYUSYUTSUHOHOKUBUN = "cyusyutsuhohokubun";
    private static final String CYUSYUTSUKOMOKUKUBUN = "cyusyutsukomokukubun";
    private static final String KIZYUNNICHI = "kizyunnichi";
    private static final String HITSUKEHANIFROM = "hitsukehanifrom";
    private static final String HITSUKEHANITO = "hitsukehanito";
    private static final String CHOKINDATACYUSYUTSU = "chokindatacyusyutsu";
    private static final String SHITEINYUSHOSHAKYUSOCHISHA = "shiteinyushoshakyusochisha";
    private static final String SHITEINYUSHOSHAFUTANKEIGENSHA = "shiteinyushoshafutankeigensha";
    private static final String SHITEINYUSHOSHASONOTA = "shiteinyushoshasonota";
    private static final String SHITEINYUSHOSHADAIICHIDANKAI = "shiteinyushoshadaiichidankai";
    private static final String SHITEINYUSHOSHADAINIDANKAI = "shiteinyushoshadainidankai";
    private static final String SHITEINYUSHOSHADAISANDANKAI = "shiteinyushoshadaisandankai";
    private static final String SHITEINYUSHOSHAKAZEISOU = "shiteinyushoshakazeisou";
    private static final String SOSHITSUKUBUN = "soshitsukubun";
    private static final String KOMOKUMEIFUKA = "komokumeifuka";
    private static final String RENBANFUKA = "renbanfuka";
    private static final String HITSUKESURASYUHENSYU = "hitsukesurasyuhensyu";
    private static final String ATENACYUSYUTSUJYOKEN = "atenacyusyutsujyoken";
    private static final String CYOHYOID = "cyohyoid";
    private static final String SYUTSURYOKUKOMOKU = "syutsuryokukomoku";
    private static final String KYAKASHA = "kyakasha";
    private static final String SHINSEISHADATACYUSHUTSU = "shinseishadatacyushutsu";
    private static final String SYUTSURYOKUJUNPARAMETER = "syutsuryokujunparameter";

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
    @BatchParameter(key = CHOKINDATACYUSYUTSU, name = "直近データ抽出")
    private boolean isChokindatacyusyutsu;
    @BatchParameter(key = SHINSEISHADATACYUSHUTSU, name = "申請者データ抽出")
    private boolean isShinseishadatacyushutsu;
    @BatchParameter(key = SHITEINYUSHOSHAKYUSOCHISHA, name = "特定入所者旧措置者")
    private boolean shiteinyushoshakyusochisha;
    @BatchParameter(key = SHITEINYUSHOSHAFUTANKEIGENSHA, name = "特定入所者負担軽減者")
    private boolean shiteinyushoshafutankeigensha;
    @BatchParameter(key = SHITEINYUSHOSHASONOTA, name = "特定入所者その他")
    private boolean shiteinyushoshasonota;
    @BatchParameter(key = SHITEINYUSHOSHADAIICHIDANKAI, name = "特定入所者第一段階")
    private boolean shiteinyushoshadaiichidankai;
    @BatchParameter(key = SHITEINYUSHOSHADAINIDANKAI, name = "特定入所者第二段階")
    private boolean shiteinyushoshadainidankai;
    @BatchParameter(key = SHITEINYUSHOSHADAISANDANKAI, name = "特定入所者第三段階")
    private boolean shiteinyushoshadaisandankai;
    @BatchParameter(key = SHITEINYUSHOSHAKAZEISOU, name = "特定入所者課税層")
    private boolean shiteinyushoshakazeisou;
    @BatchParameter(key = KYAKASHA, name = "却下者")
    private RString kyakasha;
    @BatchParameter(key = SOSHITSUKUBUN, name = "喪失区分")
    private RString soshitsukubun;
    @BatchParameter(key = KOMOKUMEIFUKA, name = "項目名付加")
    private boolean isCsvkomokumeifuka;
    @BatchParameter(key = RENBANFUKA, name = "連番付加")
    private boolean isCsvrenbanfuka;
    @BatchParameter(key = HITSUKESURASYUHENSYU, name = "日付スラッシュ付加")
    private boolean isCsvhitsukesurasyuhensyu;
    @BatchParameter(key = ATENACYUSYUTSUJYOKEN, name = "宛名抽出条件")
    private AtenaSelectBatchParameter atenacyusyutsujyoken;
    @BatchParameter(key = CYOHYOID, name = "帳票ID")
    private RString cyohyoid;
    @BatchParameter(key = SYUTSURYOKUJUNPARAMETER, name = "出力順パラメータ")
    private RString syutsuryokujunparameter;
    @BatchParameter(key = SYUTSURYOKUKOMOKU, name = "出力項目")
    private RString syutsuryokukomoku;

    /**
     * バーチのパラメータを作成します。
     *
     * @return HanyoListFutanGendoGakuNinteiProcessParameter
     */
    public HanyoListFutanGendoGakuNinteiProcessParameter toHanyoListFutanGendoGakuNinteiProcessParameter() {
        return new HanyoListFutanGendoGakuNinteiProcessParameter(
                hyoudai,
                detasyubetsumesyo,
                syutsuryoku,
                cyusyutsuhohokubun,
                cyusyutsukomokukubun,
                kizyunnichi,
                hitsukehanifrom,
                hitsukehanito,
                isChokindatacyusyutsu,
                isShinseishadatacyushutsu,
                shiteinyushoshakyusochisha,
                shiteinyushoshafutankeigensha,
                shiteinyushoshasonota,
                shiteinyushoshadaiichidankai,
                shiteinyushoshadainidankai,
                shiteinyushoshadaisandankai,
                shiteinyushoshakazeisou,
                kyakasha,
                soshitsukubun,
                isCsvkomokumeifuka,
                isCsvrenbanfuka,
                isCsvhitsukesurasyuhensyu,
                atenacyusyutsujyoken,
                cyohyoid,
                syutsuryokujunparameter,
                syutsuryokukomoku);
    }
}