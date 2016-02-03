/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.ninteichosatokusokutaishoshaichiranhyo;

import jp.co.ndensan.reams.db.dbe.entity.report.source.ninteichosatokusokutaishoshaichiranhyo.NinteiChosaTokusokuTaishoshaIchiranhyoReportSource;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.Separator;

/**
 * 主治医意見書督促対象者一覧表のEditorです。
 *
 */
public class NinteiChosaTokusokuTaishoshaIchiranhyoEditor implements INinteiChosaTokusokuTaishoshaIchiranhyoEditor {

    private final NinteiChosaTokusokuTaishoshaIchiranhyoItem item;
    private static final RString 医療機関名称 = new RString("医療機関名称");
    private static final RString 医療機関住所 = new RString("医療機関住所");
    private static final RString 主治医氏名 = new RString("主治医氏名");
    private static final RString 医療機関TEL = new RString("医療機関TEL");

    /**
     * インスタンスを生成します。
     *
     * @param item {@link NinteiChosaTokusokuTaishoshaIchiranhyoItem}
     */
    protected NinteiChosaTokusokuTaishoshaIchiranhyoEditor(NinteiChosaTokusokuTaishoshaIchiranhyoItem item) {
        this.item = item;
    }

    @Override
    public NinteiChosaTokusokuTaishoshaIchiranhyoReportSource edit(NinteiChosaTokusokuTaishoshaIchiranhyoReportSource source) {
        return editSource(source);
    }

    private NinteiChosaTokusokuTaishoshaIchiranhyoReportSource editSource(NinteiChosaTokusokuTaishoshaIchiranhyoReportSource source) {
        RStringBuilder systemDateTime = new RStringBuilder();
        RDateTime datetime = RDate.getNowDateTime();
        systemDateTime.append(datetime.getDate().wareki().eraType(EraType.KANJI).
                firstYear(FirstYear.GAN_NEN).
                separator(Separator.JAPANESE).
                fillType(FillType.ZERO).toDateString());
        systemDateTime.append(RString.HALF_SPACE);
        systemDateTime.append(String.format("%02d", datetime.getHour()));
        systemDateTime.append(new RString("時"));
        systemDateTime.append(String.format("%02d", datetime.getMinute()));
        systemDateTime.append(new RString("分"));
        systemDateTime.append(String.format("%02d", datetime.getSecond()));
        systemDateTime.append(new RString("秒"));
        systemDateTime.append(RString.HALF_SPACE);
        systemDateTime.append(new RString("作成"));
        source.printTimeStamp = systemDateTime.toRString();

        source.cityCode = item.getCityCode();
        source.cityName = item.getCityName();
        source.listNo_1 = item.getListNo_1();
        source.listUpper1_1 = item.getListUpper1_1();
        source.kikanNameTitle = 医療機関名称;
        source.kikanJushoTitle = 医療機関住所;
        source.nameTitle = 主治医氏名;
        source.kikanTelTitle = 医療機関TEL;
        source.listUpper1_2 = item.getListUpper1_2();
        source.listUpper2_1 = item.getListUpper2_1();
        source.listUpper2_2 = item.getListUpper2_2();
        source.listShinseiYMD_1 = item.getListShinseiYMD_1().wareki()
                .eraType(EraType.KANJI_RYAKU)
                .firstYear(FirstYear.GAN_NEN)
                .separator(Separator.PERIOD)
                .fillType(FillType.BLANK).toDateString();
        source.listTokusokujoHakkoYMD_1 = item.getListTokusokujoHakkoYMD_1().wareki()
                .eraType(EraType.KANJI_RYAKU)
                .firstYear(FirstYear.GAN_NEN)
                .separator(Separator.PERIOD)
                .fillType(FillType.BLANK).toDateString();

        return source;

    }
}
