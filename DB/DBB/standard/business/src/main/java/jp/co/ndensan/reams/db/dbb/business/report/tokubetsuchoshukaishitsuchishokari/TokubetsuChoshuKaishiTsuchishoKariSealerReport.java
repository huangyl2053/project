/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.tokubetsuchoshukaishitsuchishokari;

import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.KariTokuchoKaishiTsuchisyoJoho;
import jp.co.ndensan.reams.db.dbb.entity.report.tokubetsuchoshukaishitsuchishokari.TokubetsuChoshuKaishiTsuchishoKariSealerSource;
import jp.co.ndensan.reams.db.dbz.business.report.util.EditedAtesaki;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;
import jp.co.ndensan.reams.uz.uza.report.Report;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import lombok.NonNull;

/**
 * 特別徴収開始通知書（仮算定）帳票 シーラタイプReport
 *
 * @reamsid_L DBB-0790-050 lijunjun
 */
public class TokubetsuChoshuKaishiTsuchishoKariSealerReport extends
        Report<TokubetsuChoshuKaishiTsuchishoKariSealerSource> {

    private final KariTokuchoKaishiTsuchisyoJoho 仮算定特徴開始通知書情報;
    private final EditedAtesaki 編集後宛先;
    private final NinshoshaSource ninshoshaSource;

    /**
     * コンストラクタです
     *
     * @param 編集後宛先 EditedAtesaki
     * @param ninshoshaSource NinshoshaSource
     * @param 仮算定特徴開始通知書情報 KariTokuchoKaishiTsuchisyoJoho
     */
    public TokubetsuChoshuKaishiTsuchishoKariSealerReport(EditedAtesaki 編集後宛先,
            NinshoshaSource ninshoshaSource,
            @NonNull KariTokuchoKaishiTsuchisyoJoho 仮算定特徴開始通知書情報) {
        this.編集後宛先 = 編集後宛先;
        this.ninshoshaSource = ninshoshaSource;
        this.仮算定特徴開始通知書情報 = 仮算定特徴開始通知書情報;
    }

    @Override
    public void writeBy(ReportSourceWriter<TokubetsuChoshuKaishiTsuchishoKariSealerSource> writer) {
        ITokubetsuChoshuKaishiTsuchishoKariSealerEditor editor = new TokubetsuChoshuKaishiTsuchishoKariSealerEditor(
                編集後宛先, ninshoshaSource, 仮算定特徴開始通知書情報);
        ITokubetsuChoshuKaishiTsuchishoKariSealerBuilder builder = new TokubetsuChoshuKaishiTsuchishoKariSealerBuilder(editor);
        writer.writeLine(builder);
    }

}
