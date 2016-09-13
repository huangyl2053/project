/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.shujiiikenshoa3;

import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.JimuShinsakaiWariateJohoBusiness;
import jp.co.ndensan.reams.db.dbe.entity.report.source.shujiiikenshoa3.ShujiiikenshoA3ReportSource;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;

/**
 * 主治医意見書A3のEditorです。
 *
 * @reamsid_L DBE-0150-240 lishengli
 */
public class ShujiiikenshoA3Editor implements IShujiiikenshoA3Editor {

    private static final int INT_4 = 4;
    private final JimuShinsakaiWariateJohoBusiness business;

    /**
     * インスタンスを生成します。
     *
     * @param business {@link JimuShinsakaiWariateJohoBusiness}
     */
    protected ShujiiikenshoA3Editor(JimuShinsakaiWariateJohoBusiness business) {
        this.business = business;
    }

    @Override
    public ShujiiikenshoA3ReportSource edit(ShujiiikenshoA3ReportSource source) {
        return editSource(source);
    }

    private ShujiiikenshoA3ReportSource editSource(ShujiiikenshoA3ReportSource source) {
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
        source.imgIkensho1 = business.get左の主治医意見書イメージ();
        source.imgIkensho2 = business.get右の主治医意見書イメージ();
        if (business.is事務局()) {
            source.shikibetuCode = ShikibetsuCode.EMPTY;
            if (!RString.isNullOrEmpty(business.get申請書管理番号())) {
                source.shinseishoKanriNo = new ExpandedInformation(new Code("0001"), new RString("申請書管理番号"), business.get申請書管理番号());
            }
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