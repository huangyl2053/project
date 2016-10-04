/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.service.report.gassanketteitsuchisho;

import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.report.gassanketteitsuchisho.GassanKetteiTsuchishoShiharaiYoteiBiYijiAriProperty;
import jp.co.ndensan.reams.db.dbc.business.report.gassanketteitsuchisho.GassanKetteiTsuchishoShiharaiYoteiBiYijiAriReport;
import jp.co.ndensan.reams.db.dbc.business.report.gassanketteitsuchisho.KogakuGassanShikyuKetteiTsuchishoEntity;
import jp.co.ndensan.reams.db.dbc.entity.report.gassanketteitsuchisho.GassanKetteiTsuchishoShiharaiYoteiBiYijiAriSource;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoHanyo;
import jp.co.ndensan.reams.db.dbz.definition.core.kyotsu.NinshoshaDenshikoinshubetsuCode;
import jp.co.ndensan.reams.db.dbz.service.core.basic.ChohyoSeigyoHanyoManager;
import jp.co.ndensan.reams.db.dbz.service.core.util.report.ReportUtil;
import jp.co.ndensan.reams.ur.urz.definition.core.ninshosha.KenmeiFuyoKubunType;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.IReportProperty;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.Report;
import jp.co.ndensan.reams.uz.uza.report.ReportAssembler;
import jp.co.ndensan.reams.uz.uza.report.ReportAssemblerBuilder;
import jp.co.ndensan.reams.uz.uza.report.ReportManager;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.report.SourceDataCollection;
import jp.co.ndensan.reams.uz.uza.report.source.breaks.BreakAggregator;

/**
 * 帳票設計_DBCMN63003_高額合算支給決定通知書（単）のPrintSeviceクラスです。
 *
 * @reamsid_L DBC-2310-035 chenyadong
 */
public class GassanKetteiTsuchishoShiharaiYoteiBiYijiAriPrintService {

    private static final ReportId 帳票分類ID = new ReportId("DBC100053_GassanKetteiTsuchisho");

    /**
     * printメソッド(単一帳票出力用)
     *
     * @param entity KogakuGassanShikyuKetteiTsuchishoEntity
     * @return SourceDataCollection
     */
    public SourceDataCollection printSingle(KogakuGassanShikyuKetteiTsuchishoEntity entity) {
        try (ReportManager reportManager = new ReportManager()) {
            print(entity, reportManager);
            return reportManager.publish();
        }
    }

    /**
     * printメソッド(複数帳票出力用)
     *
     * @param tsuchisho KogakuGassanShikyuKetteiTsuchishoEntity
     * @param reportManager ReportManager
     */
    public void print(KogakuGassanShikyuKetteiTsuchishoEntity tsuchisho, ReportManager reportManager) {
        GassanKetteiTsuchishoShiharaiYoteiBiYijiAriProperty property = new GassanKetteiTsuchishoShiharaiYoteiBiYijiAriProperty();
        try (ReportAssembler<GassanKetteiTsuchishoShiharaiYoteiBiYijiAriSource> assembler = createAssembler(property, reportManager)) {
            ReportSourceWriter<GassanKetteiTsuchishoShiharaiYoteiBiYijiAriSource> reportSourceWriter
                    = new ReportSourceWriter(assembler);

            ChohyoSeigyoHanyoManager manager = new ChohyoSeigyoHanyoManager();
            List<ChohyoSeigyoHanyo> 帳票制御汎用キー = manager.get帳票制御汎用一覧(SubGyomuCode.DBC介護給付, 帳票分類ID);
            NinshoshaSource ninshoshaSource = ReportUtil.get認証者情報(SubGyomuCode.DBC介護給付, 帳票分類ID,
                    tsuchisho.get発行日(),
                    NinshoshaDenshikoinshubetsuCode.保険者印.getコード(), KenmeiFuyoKubunType.付与なし, reportSourceWriter);
            GassanKetteiTsuchishoShiharaiYoteiBiYijiAriReport report
                    = new GassanKetteiTsuchishoShiharaiYoteiBiYijiAriReport(tsuchisho, ninshoshaSource, 帳票制御汎用キー);
            report.writeBy(reportSourceWriter);

        }
    }

    private <T extends IReportSource, R extends Report<T>> ReportAssembler<T> createAssembler(IReportProperty<T> property, ReportManager manager) {
        ReportAssemblerBuilder builder = manager.reportAssembler(property.reportId().value(), property.subGyomuCode());
        for (BreakAggregator<? super T, ?> breaker : property.breakers()) {
            builder.addBreak(breaker);
        }
        builder.isHojinNo(property.containsHojinNo());
        builder.isKojinNo(property.containsKojinNo());
        return builder.<T>create();
    }
}