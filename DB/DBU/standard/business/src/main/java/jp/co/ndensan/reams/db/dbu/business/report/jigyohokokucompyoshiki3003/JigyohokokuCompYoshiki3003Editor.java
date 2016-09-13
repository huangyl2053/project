/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.business.report.jigyohokokucompyoshiki3003;

import jp.co.ndensan.reams.db.dbu.entity.db.relate.jigyohokokucompyoshiki3003.JigyohokokuCompYoshiki3003Data;
import jp.co.ndensan.reams.db.dbu.entity.report.jigyohokokucompyoshiki3003.JigyohokokuCompYoshiki3003ReportSource;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.Separator;

/**
 * 介護事業状況報告月報・一般状況（様式1-3） のEditorです。
 *
 * @reamsid_L DBU-5530-060 dangjingjing
 */
public class JigyohokokuCompYoshiki3003Editor implements IJigyohokokuCompYoshiki3003Editor {

    private static final int 年度 = 4;
    private final JigyohokokuCompYoshiki3003Data data;

    /**
     * インスタンスを生成します。
     *
     * @param data JigyohokokuCompYoshiki3003Data
     */
    protected JigyohokokuCompYoshiki3003Editor(JigyohokokuCompYoshiki3003Data data) {
        this.data = data;
    }

    @Override
    public JigyohokokuCompYoshiki3003ReportSource edit(JigyohokokuCompYoshiki3003ReportSource source) {

        return editSource(source);
    }

    private JigyohokokuCompYoshiki3003ReportSource editSource(JigyohokokuCompYoshiki3003ReportSource source) {
        source.yoshiki = data.get様式();
        source.printTimeStamp = data.get作成日時();
        source.shukeiKubun = data.get集計区分();
        source.shuukeiHani = set集計範囲(data.get集計範囲());
        source.hokenshaNo = data.get保険者番号();
        source.hokenshaName = data.get保険者名();
        source.hyo1Title = data.get表1のタイトル();
        source.hyo1ShinseishaKensu1 = data.get介護老人福祉施設の申請件数();
        source.hyo1ShinseishaKensu2 = data.get介護老人保健施設の申請件数();
        source.hyo1ShinseishaKensu3 = data.get介護療養型医療施設の申請件数();
        source.hyo1ShinseishaKensu4 = data.get地域密着型介護老人福祉施設入居者生活介護の申請件数();
        source.hyo1ShinseishaKensu5 = data.getその他の申請件数();
        source.hyo1ShinseishaKensu6 = data.get合計の申請件数();
        source.hyo2Title1 = data.get左下表2のタイトル1();
        source.hyo3Title = data.get右下表3のタイトル();
        source.hyo2Title2 = data.get左下表2のタイトル2();
        source.hyo3ShinseishaKensu = data.get特定負担限度額の申請件数();
        return source;
    }

    private RString set集計範囲(RString 集計範囲) {
        if (RString.isNullOrEmpty(集計範囲)) {
            return RString.EMPTY;
        }
        RStringBuilder 集計範囲_SB = new RStringBuilder();
        集計範囲_SB.append(new RString("("));
        FlexibleYear 集計範囲_年度 = new FlexibleYear(集計範囲.substring(0, 年度));
        FlexibleYearMonth 集計範囲_Temp = new FlexibleYearMonth(集計範囲);
        集計範囲_SB.append(集計範囲_年度.wareki().eraType(EraType.KANJI).getYear());
        集計範囲_SB.append(new RString("年度"));
        集計範囲_SB.append(集計範囲_Temp.wareki().separator(Separator.JAPANESE).fillType(FillType.ZERO).getMonth());
        集計範囲_SB.append(new RString("分)"));
        return 集計範囲_SB.toRString();
    }
}