/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.iinshinsakaishiryoa3;

import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.JimuShinsakaiWariateJohoBusiness;
import jp.co.ndensan.reams.db.dbe.definition.core.reportid.ReportIdDBE;
import jp.co.ndensan.reams.db.dbe.entity.report.source.iinshinsakaishiryoa3.IinShinsakaishiryoA3ReportSource;
import jp.co.ndensan.reams.db.dbz.entity.report.saichekkuhyo.Layouts;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Separator;

/**
 * 主治医意見書（A3版）のEditorです。
 *
 * @reamsid_L DBE-0150-200 zhaoyao
 */
public class IinShinsakaishiryoA3Group4Editor implements IIinShinsakaishiryoA3Editor {

    private static final int INT_4 = 4;
    private final JimuShinsakaiWariateJohoBusiness business;
    private final RString reportId;

    /**
     * インスタンスを生成します。
     *
     * @param business {@link JimuShinsakaiWariateJohoBusiness}
     * @param reportId 帳票ＩＤ
     */
    protected IinShinsakaishiryoA3Group4Editor(JimuShinsakaiWariateJohoBusiness business, RString reportId) {
        this.business = business;
        this.reportId = reportId;
    }

    @Override
    public IinShinsakaishiryoA3ReportSource edit(IinShinsakaishiryoA3ReportSource source) {
        return editSource(source);
    }

    private IinShinsakaishiryoA3ReportSource editSource(IinShinsakaishiryoA3ReportSource source) {
        source.five_hokenshaNo = business.get保険者番号();
        source.five_hihokenshaNo = business.get被保険者番号();
        source.five_hihokenshaName = business.get名前();
        source.five_shinseiGengo = get元号(business.get今回認定申請年月日());
        source.five_shinseiYY = get年(business.get今回認定申請年月日());
        source.five_shinseiMM = get月(business.get今回認定申請年月日());
        source.five_shinseiDD = get日(business.get今回認定申請年月日());
        source.five_sakuseiGengo = get元号(business.get審査会資料作成年月日());
        source.five_sakuseiYY = get年(business.get審査会資料作成年月日());
        source.five_sakuseiMM = get月(business.get審査会資料作成年月日());
        source.five_sakuseiDD = get日(business.get審査会資料作成年月日());
        source.five_chosaGengo = get元号(business.get今回認定調査実施年月日());
        source.five_chosaYY = get年(business.get今回認定調査実施年月日());
        source.five_chosaMM = get月(business.get今回認定調査実施年月日());
        source.five_chosaDD = get日(business.get今回認定調査実施年月日());
        source.five_shinsaGengo = get元号(business.get今回認定審査年月日());
        source.five_shinsaYY = get年(business.get今回認定審査年月日());
        source.five_shinsaMM = get月(business.get今回認定審査年月日());
        source.five_shinsaDD = get日(business.get今回認定審査年月日());
        source.five_imgIkensho1 = business.get左の主治医意見書イメージ();
        source.five_imgIkensho2 = business.get右の主治医意見書イメージ();
        if (ReportIdDBE.DBE517915.getReportId().value().equals(reportId)) {
            source.layout = Layouts.任意;
        } else {
            source.layout = Layouts.四頁目;
        }
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
