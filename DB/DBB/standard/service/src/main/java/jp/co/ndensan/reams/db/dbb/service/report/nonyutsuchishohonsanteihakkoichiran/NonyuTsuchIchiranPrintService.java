/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.service.report.nonyutsuchishohonsanteihakkoichiran;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbb.business.report.nonyutsuchishohonsanteihakkoichiran.NonyuTsuchIchiranProperty;
import jp.co.ndensan.reams.db.dbb.business.report.nonyutsuchishohonsanteihakkoichiran.NonyuTsuchIchiranReport;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.EditedHonSanteiTsuchiShoKyotsu;
import jp.co.ndensan.reams.db.dbb.definition.reportid.ReportIdDBB;
import jp.co.ndensan.reams.db.dbb.entity.report.nonyutsuchishohonsanteihakkoichiran.NonyuTsuchIchiranSource;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IOutputOrder;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.ISetSortItem;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.core.reportoutputorder.ChohyoShutsuryokujunFinderFactory;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.report.IReportProperty;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.Report;
import jp.co.ndensan.reams.uz.uza.report.ReportAssembler;
import jp.co.ndensan.reams.uz.uza.report.ReportAssemblerBuilder;
import jp.co.ndensan.reams.uz.uza.report.ReportManager;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.report.source.breaks.BreakAggregator;

/**
 * 帳票設計_DBBRP43002_2_保険料納入通知書（本算定）PrintServiceです。
 *
 * @reamsid_L DBB-0780-080 yangchenbing
 */
public class NonyuTsuchIchiranPrintService {

    private static final int INDEX_0 = 0;
    private static final int INDEX_1 = 1;
    private static final int INDEX_2 = 2;
    private static final int INDEX_3 = 3;
    private static final int INDEX_4 = 4;

    /**
     * printメソッド
     *
     * @param 編集後本算定通知書共通情報List List<EditedHonSanteiTsuchiShoKyotsu>
     * @param 帳票作成日時 RDateTime
     * @param 出力期 int
     * @param 出力順ID Long
     * @param reportManager ReportManager
     */
    public void printタイプ(List<EditedHonSanteiTsuchiShoKyotsu> 編集後本算定通知書共通情報List, RDateTime 帳票作成日時,
            int 出力期, Long 出力順ID, ReportManager reportManager) {
        NonyuTsuchIchiranProperty property = new NonyuTsuchIchiranProperty();
        try (ReportAssembler<NonyuTsuchIchiranSource> assembler = createAssembler(property, reportManager)) {
            ReportSourceWriter<NonyuTsuchIchiranSource> reportSourceWriter
                    = new ReportSourceWriter(assembler);
            Association 地方公共団体 = AssociationFinderFactory.createInstance().getAssociation();
            Decimal 連番 = Decimal.ONE;
            if (編集後本算定通知書共通情報List != null && !編集後本算定通知書共通情報List.isEmpty()) {
                for (EditedHonSanteiTsuchiShoKyotsu 編集後本算定通知書共通情報 : 編集後本算定通知書共通情報List) {
                    List<RString> 並び順List = get出力順(出力順ID);
                    NonyuTsuchIchiranReport report = new NonyuTsuchIchiranReport(編集後本算定通知書共通情報,
                            出力期, 帳票作成日時, 地方公共団体, 並び順List, 連番);
                    report.writeBy(reportSourceWriter);
                    連番 = 連番.add(Decimal.ONE);
                }
            }
        }
    }

    private List<RString> get出力順(Long 出力順ID) {
        IOutputOrder 並び順 = ChohyoShutsuryokujunFinderFactory.createInstance()
                .get出力順(SubGyomuCode.DBB介護賦課, ReportIdDBB.DBB200010.getReportId(), 出力順ID);
        List<RString> 並び順List = new ArrayList<>();
        int i = 0;
        RString 並び順の１件目 = RString.EMPTY;
        RString 並び順の２件目 = RString.EMPTY;
        RString 並び順の３件目 = RString.EMPTY;
        RString 並び順の４件目 = RString.EMPTY;
        RString 並び順の５件目 = RString.EMPTY;
        if (並び順 != null) {
            for (ISetSortItem item : 並び順.get設定項目リスト()) {
                if (i == INDEX_0) {
                    並び順の１件目 = item.get項目名();
                    並び順List.add(並び順の１件目);
                } else if (i == INDEX_1) {
                    並び順の２件目 = item.get項目名();
                    並び順List.add(並び順の２件目);
                } else if (i == INDEX_2) {
                    並び順の３件目 = item.get項目名();
                    並び順List.add(並び順の３件目);
                } else if (i == INDEX_3) {
                    並び順の４件目 = item.get項目名();
                    並び順List.add(並び順の４件目);
                } else if (i == INDEX_4) {
                    並び順の５件目 = item.get項目名();
                    並び順List.add(並び順の５件目);
                }
                i = i + 1;
            }
        }
        return 並び順List;
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
