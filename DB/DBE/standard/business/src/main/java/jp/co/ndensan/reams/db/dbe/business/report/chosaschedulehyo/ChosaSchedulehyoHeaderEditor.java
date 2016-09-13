/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.chosaschedulehyo;

import jp.co.ndensan.reams.db.dbe.entity.report.chosaschedulehyo.ChosaSchedulehyoReportSource;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.Separator;

/**
 * 認定調査スケジュール表(事務所)ヘッダEditorです。
 *
 * @reamsid_L DBE-0020-090 zhangguopeng
 */
class ChosaSchedulehyoHeaderEditor implements IChosaSchedulehyoEditor {

    private final ChosaSchedulehyoHeadItem item;

    /**
     * インスタンスを生成します。
     *
     * @param item {@link ChosaSchedulehyoItem}
     */
    protected ChosaSchedulehyoHeaderEditor(ChosaSchedulehyoHeadItem item) {
        this.item = item;
    }

    @Override
    public ChosaSchedulehyoReportSource edit(ChosaSchedulehyoReportSource source) {
        return editHeader(source);
    }

    private ChosaSchedulehyoReportSource editHeader(ChosaSchedulehyoReportSource source) {

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
        source.title = new RString("認定調査スケジュール表");
        source.chosaItakusakiNo = item.getChosaItakusakiNo();
        source.chosaItakusakiName = item.getChosaItakusakiName();
        source.chosaTaishoYM = new FlexibleYearMonth(item.getChosaTaishoYM().toString()).wareki().eraType(EraType.KANJI_RYAKU).
                firstYear(FirstYear.GAN_NEN).
                separator(Separator.JAPANESE).
                fillType(FillType.BLANK).toDateString();

        return source;
    }
}