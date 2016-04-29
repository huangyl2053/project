/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.service.report.tashichosonjushochitokureisharenrakuhyo;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dba.business.report.tashichosonjushochitokureisharenrakuhyo.TashichosonJushochitokureishaRenrakuhyoItem;
import jp.co.ndensan.reams.db.dba.business.report.tashichosonjushochitokureisharenrakuhyo.TashichosonJushochitokureishaRenrakuhyoProperty;
import jp.co.ndensan.reams.db.dba.business.report.tashichosonjushochitokureisharenrakuhyo.TashichosonJushochitokureishaRenrakuhyoReport;
import jp.co.ndensan.reams.db.dba.entity.report.source.tashichosonjushochitokureisharenrakuhyo.TashichosonJushochitokureishaRenrakuhyoReportSource;
import jp.co.ndensan.reams.db.dbz.service.util.report.ReportUtil;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.report.IReportProperty;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.Printer;
import jp.co.ndensan.reams.uz.uza.report.Report;
import jp.co.ndensan.reams.uz.uza.report.ReportAssembler;
import jp.co.ndensan.reams.uz.uza.report.ReportAssemblerBuilder;
import jp.co.ndensan.reams.uz.uza.report.ReportManager;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.report.SourceDataCollection;
import jp.co.ndensan.reams.uz.uza.report.source.breaks.BreakAggregator;

/**
 * 介護保険他市町村住所地特例者連絡票Printerです。
 *
 * @reamsid_L DBA-0380-080 duanzhanli
 *
 */
public class TashichosonJushochitokureishaRenrakuhyoPrintService {

    /**
     * 介護保険他市町村住所地特例者連絡票を印刷します。
     *
     * @param item 介護保険他市町村住所地特例者連絡票_帳票クラスパラメータクラス
     * @return {@link SourceDataCollection}
     */
    public SourceDataCollection print(TashichosonJushochitokureishaRenrakuhyoItem item) {
        TashichosonJushochitokureishaRenrakuhyoProperty property = new TashichosonJushochitokureishaRenrakuhyoProperty();
        try (ReportManager reportManager = new ReportManager()) {
            try (ReportAssembler<TashichosonJushochitokureishaRenrakuhyoReportSource> assembler = createAssembler(property, reportManager)) {
                ReportSourceWriter<TashichosonJushochitokureishaRenrakuhyoReportSource> reportSourceWriter = new ReportSourceWriter(assembler);
                NinshoshaSource ninshoshaSource = ReportUtil.get認証者情報(property.subGyomuCode(),
                        property.reportId(),
                        FlexibleDate.getNowDate(),
                        reportSourceWriter);
                item.setDenshiKoin(ninshoshaSource.denshiKoin);
                item.setHakkoYMD1(ninshoshaSource.hakkoYMD);
                item.setNinshoshaYakushokuMei(ninshoshaSource.ninshoshaYakushokuMei);
                item.setNinshoshaYakushokuMei1(ninshoshaSource.ninshoshaYakushokuMei1);
                item.setKoinMojiretsu(ninshoshaSource.koinMojiretsu);
                item.setNinshoshaShimeiKakenai(ninshoshaSource.ninshoshaShimeiKakenai);
                item.setNinshoshaShimeiKakeru(ninshoshaSource.ninshoshaShimeiKakeru);
                item.setNinshoshaYakushokuMei2(ninshoshaSource.ninshoshaYakushokuMei2);
                item.setKoinShoryaku(ninshoshaSource.koinShoryaku);
            }
        }
        return new Printer<TashichosonJushochitokureishaRenrakuhyoReportSource>().spool(property, toReports(item));
    }

    private static List<TashichosonJushochitokureishaRenrakuhyoReport> toReports(TashichosonJushochitokureishaRenrakuhyoItem item) {
        List<TashichosonJushochitokureishaRenrakuhyoReport> list = new ArrayList<>();
        list.add(TashichosonJushochitokureishaRenrakuhyoReport.createFrom(item));
        return list;
    }

    private static <T extends IReportSource, R extends Report<T>> ReportAssembler<T> createAssembler(
            IReportProperty<T> property, ReportManager manager) {
        ReportAssemblerBuilder builder = manager.reportAssembler(property.reportId().value(), property.subGyomuCode());
        for (BreakAggregator<? super T, ?> breaker : property.breakers()) {
            builder.addBreak(breaker);
        }
        builder.isHojinNo(property.containsHojinNo());
        builder.isKojinNo(property.containsKojinNo());
        return builder.<T>create();
    }
}
