/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.jimushinsakaishiryoa3;

import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.JimuSonotashiryoBusiness;
import jp.co.ndensan.reams.db.dbe.entity.report.source.jimushinsakaishiryoa3.JimuShinsakaishiryoA3ReportSource;
import jp.co.ndensan.reams.db.dbz.entity.report.saichekkuhyo.Layouts;
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
 * その他資料A3版Editorです。
 *
 * @reamsid_L DBE-0150-200 lishengli
 */
public class JimuShinsakaishiryoA3Group5Editor implements IJimuShinsakaishiryoA3Editor {

    private final JimuSonotashiryoBusiness business;
    private static final int INT_4 = 4;

    /**
     * コンストラクタです。
     *
     * @param business {@link JimuSonotashiryoBusiness}
     */
    protected JimuShinsakaishiryoA3Group5Editor(JimuSonotashiryoBusiness business) {
        this.business = business;
    }

    /**
     * その他資料（A3版）を編集します。
     *
     * @param source 帳票ソース
     * @return 帳票ソース
     */
    @Override
    public JimuShinsakaishiryoA3ReportSource edit(JimuShinsakaishiryoA3ReportSource source) {
        source.four_hokenshaNo = business.get保険者番号();
        source.four_hihokenshaNo = business.get被保険者番号();
        source.four_hihokenshaName = business.get名前();
        source.four_shinseiGengo = get元号(business.get認定申請年月日());
        source.four_shinseiYY = get年(business.get認定申請年月日());
        source.four_shinseiMM = new RString(business.get認定申請年月日().getMonthValue());
        source.four_shinseiDD = new RString(business.get認定申請年月日().getDayValue());
        FlexibleDate システム日付 = FlexibleDate.getNowDate();
        source.four_sakuseiGengo = get元号(システム日付);
        source.four_sakuseiYY = get年(システム日付);
        source.four_sakuseiMM = new RString(システム日付.getMonthValue());
        source.four_sakuseiDD = new RString(システム日付.getDayValue());
        source.four_chosaGengo = get元号(business.get認定調査実施年月日());
        source.four_chosaYY = get年(business.get認定調査実施年月日());
        source.four_chosaMM = new RString(business.get認定調査実施年月日().getMonthValue());
        source.four_chosaDD = new RString(business.get認定調査実施年月日().getDayValue());
        source.four_shinsaGengo = get元号(business.get介護認定審査会開催年月日());
        source.four_shinsaYY = get年(business.get介護認定審査会開催年月日());
        source.four_shinsaMM = new RString(business.get介護認定審査会開催年月日().getMonthValue());
        source.four_shinsaDD = new RString(business.get介護認定審査会開催年月日().getDayValue());
        source.four_imgSonotashiryo1 = business.get左のその他資料イメージ();
        source.four_imgSonotashiryo2 = business.get右のその他資料イメージ();
        source.shikibetuCode = ShikibetsuCode.EMPTY;
        if (!RString.isNullOrEmpty(business.get申請書管理番号())) {
            source.shinseishoKanriNo = new ExpandedInformation(new Code("0001"), new RString("申請書管理番号"),
                    business.get申請書管理番号());
        }
        source.layout = Layouts.五頁目;
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

    private RString パターン12(FlexibleDate 年月日) {
        return 年月日.wareki().eraType(EraType.KANJI)
                .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE)
                .fillType(FillType.BLANK).toDateString();
    }
}