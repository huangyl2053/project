/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.shujiiikensho1a4;

import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.JimuShinsakaiWariateJohoBusiness;
import jp.co.ndensan.reams.db.dbe.entity.report.source.shujiiikenshoa3.Shujiiikensho1A4ReportSource;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Separator;

/**
 * 主治医意見書A4のEditorです。
 *
 * @reamsid_L DBE-0150-380 lishengli
 */
public class Shujiiikensho1A4Editor implements IShujiiikensho1A4Editor {

    private static final int INT_4 = 4;
    private final JimuShinsakaiWariateJohoBusiness business;

    /**
     * インスタンスを生成します。
     *
     * @param business {@link JimuShinsakaiWariateJohoBusiness}
     */
    protected Shujiiikensho1A4Editor(JimuShinsakaiWariateJohoBusiness business) {
        this.business = business;
    }

    @Override
    public Shujiiikensho1A4ReportSource edit(Shujiiikensho1A4ReportSource source) {
        return editSource(source);
    }

    private Shujiiikensho1A4ReportSource editSource(Shujiiikensho1A4ReportSource source) {
        source.hokenshaNo = business.get保険者番号();
        source.hihokenshaNo = business.get被保険者番号();
        source.hihokenshaName = business.get名前();
        source.shinseiGengo = get元号(business.get今回認定申請年月日());
        source.shinseiYY = get年(business.get今回認定申請年月日());
        source.shinseiMM = get月(business.get今回認定申請年月日());
        source.shinseiDD = get日(business.get今回認定申請年月日());
        source.sakuseiGengo = get元号(business.get審査会資料作成年月日());
        source.sakuseiYY = get年(business.get審査会資料作成年月日());
        source.sakuseiMM = get月(business.get審査会資料作成年月日());
        source.sakuseiDD = get日(business.get審査会資料作成年月日());
        source.chosaGengo = get元号(business.get今回認定調査実施年月日());
        source.chosaYY = get年(business.get今回認定調査実施年月日());
        source.chosaMM = get月(business.get今回認定調査実施年月日());
        source.chosaDD = get日(business.get今回認定調査実施年月日());
        source.shinsaGengo = get元号(business.get今回認定審査年月日());
        source.shinsaYY = get年(business.get今回認定審査年月日());
        source.shinsaMM = get月(business.get今回認定審査年月日());
        source.shinsaDD = get日(business.get今回認定審査年月日());
        source.imgIkensho1 = business.get主治医意見書イメージ１();
        return source;
    }

    private RString get元号(FlexibleDate 年月日) {
        if (年月日 != null && !年月日.isEmpty()) {
            return パターン12(年月日).substring(0, 2);
        }
        return RString.EMPTY;
    }

    private RString get年(FlexibleDate 年月日) {
        if (年月日 != null && !年月日.isEmpty()) {
            return パターン12(年月日).substring(2, INT_4);
        }
        return RString.EMPTY;
    }

    private RString get月(FlexibleDate 年月日) {
        if (年月日 != null && !年月日.isEmpty()) {
            return new RString(年月日.getMonthValue());
        }
        return RString.EMPTY;
    }

    private RString get日(FlexibleDate 年月日) {
        if (年月日 != null && !年月日.isEmpty()) {
            return new RString(年月日.getDayValue());
        }
        return RString.EMPTY;
    }

    private RString パターン12(FlexibleDate 年月日) {
        return 年月日.wareki().eraType(EraType.KANJI)
                .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE)
                .fillType(FillType.BLANK).toDateString();
    }
}
