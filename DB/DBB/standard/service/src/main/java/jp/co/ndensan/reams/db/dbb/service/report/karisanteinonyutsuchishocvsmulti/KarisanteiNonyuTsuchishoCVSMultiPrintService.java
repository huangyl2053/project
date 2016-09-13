/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.service.report.karisanteinonyutsuchishocvsmulti;

import java.util.List;
import jp.co.ndensan.reams.db.dbb.business.report.NonyuTsuchisho;
import jp.co.ndensan.reams.db.dbb.business.report.karisanteinonyutsuchishocvsmulti.KarisanteiNonyuTsuchishoCVSMultiProperty;
import jp.co.ndensan.reams.db.dbb.business.report.karisanteinonyutsuchishocvsmulti.KarisanteiNonyuTsuchishoCVSMultiRenchoProperty;
import jp.co.ndensan.reams.db.dbb.business.report.karisanteinonyutsuchishocvsmulti.KarisanteiNonyuTsuchishoCVSMultiRenchoReport;
import jp.co.ndensan.reams.db.dbb.business.report.karisanteinonyutsuchishocvsmulti.KarisanteiNonyuTsuchishoCVSMultiReport;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.KariSanteiNonyuTsuchiShoJoho;
import jp.co.ndensan.reams.db.dbb.entity.report.karisanteinonyutsuchishocvsmulti.KarisanteiNonyuTsuchishoCVSMultiRenchoSource;
import jp.co.ndensan.reams.db.dbb.entity.report.karisanteinonyutsuchishocvsmulti.KarisanteiNonyuTsuchishoCVSMultiSource;
import jp.co.ndensan.reams.db.dbz.definition.core.kyotsu.NinshoshaDenshikoinshubetsuCode;
import jp.co.ndensan.reams.db.dbz.service.core.util.report.ReportUtil;
import jp.co.ndensan.reams.ur.urz.definition.core.ninshosha.KenmeiFuyoKubunType;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
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
 * 保険料納入通知書（仮算定）【コンビニマルチ収納タイプ】納付書のPrintServiceです。
 *
 * @reamsid_L DBB-9110-050 huangh
 */
public class KarisanteiNonyuTsuchishoCVSMultiPrintService {

    private final ReportId 帳票分類ID = new ReportId("DBB100014_KarisanteiHokenryoNonyuTsuchishoDaihyo");
    private final RString 帳票IDの先頭_DBB100026 = new RString("DBB100026");
    private final RString 帳票IDの先頭_DBB100027 = new RString("DBB100027");

    /**
     * 保険料納入通知書（仮算定）【コンビニマルチ収納タイプ】納付書 printメソッド
     *
     * @param 仮算定納入通知書情報 KariSanteiNonyuTsuchiShoJoho
     * @return SourceDataCollection
     */
    public SourceDataCollection print(KariSanteiNonyuTsuchiShoJoho 仮算定納入通知書情報) {
        RString 帳票IDRString = RString.EMPTY;
        if (仮算定納入通知書情報 != null && 仮算定納入通知書情報.get帳票ID() != null) {
            帳票IDRString = 仮算定納入通知書情報.get帳票ID().getColumnValue();
        }
        if (帳票IDRString.startsWith(帳票IDの先頭_DBB100026)) {
            return print全てページDBB100026(仮算定納入通知書情報);
        } else if (帳票IDRString.startsWith(帳票IDの先頭_DBB100027)) {
            return print全てページDBB100027(仮算定納入通知書情報);
        }
        return null;

    }

    /**
     * 帳票を出力します。
     *
     * @param 仮算定納入通知書情報 仮算定納入通知書情報
     * @param reportManager 帳票発行処理の制御機能
     */
    public void print(KariSanteiNonyuTsuchiShoJoho 仮算定納入通知書情報, ReportManager reportManager) {
        RString 帳票IDRString = RString.EMPTY;
        if (仮算定納入通知書情報 != null && 仮算定納入通知書情報.get帳票ID() != null) {
            帳票IDRString = 仮算定納入通知書情報.get帳票ID().getColumnValue();
        }
        if (帳票IDRString.startsWith(帳票IDの先頭_DBB100026)) {
            print全てページDBB100026(仮算定納入通知書情報, reportManager);
        } else if (帳票IDRString.startsWith(帳票IDの先頭_DBB100027)) {
            print全てページDBB100027(仮算定納入通知書情報, reportManager);
        }
    }

    /**
     * 帳票を出力します。
     *
     * @param 仮算定納入通知書情報 仮算定納入通知書情報
     * @return SourceDataCollection
     */
    public SourceDataCollection printDevidedByPage(KariSanteiNonyuTsuchiShoJoho 仮算定納入通知書情報) {
        RString 帳票IDRString = RString.EMPTY;
        if (仮算定納入通知書情報 != null && 仮算定納入通知書情報.get帳票ID() != null) {
            帳票IDRString = 仮算定納入通知書情報.get帳票ID().getColumnValue();
        }
        if (帳票IDRString.startsWith(帳票IDの先頭_DBB100026)) {
            return print全てページDBB100026DevidedByPage(仮算定納入通知書情報);
        } else if (帳票IDRString.startsWith(帳票IDの先頭_DBB100027)) {
            return print全てページDBB100027DevidedByPage(仮算定納入通知書情報);
        }
        return null;
    }

    private SourceDataCollection print全てページDBB100026(KariSanteiNonyuTsuchiShoJoho 仮算定納入通知書情報) {
        KarisanteiNonyuTsuchishoCVSMultiProperty property = new KarisanteiNonyuTsuchishoCVSMultiProperty();
        try (ReportManager reportManager = new ReportManager()) {
            try (ReportAssembler<KarisanteiNonyuTsuchishoCVSMultiSource> assembler = createAssembler(property, reportManager)) {
                ReportSourceWriter<KarisanteiNonyuTsuchishoCVSMultiSource> reportSourceWriter
                        = new ReportSourceWriter(assembler);

                NinshoshaSource ninshoshaSource = ReportUtil.get認証者情報(SubGyomuCode.DBB介護賦課, 帳票分類ID, 仮算定納入通知書情報.get発行日(),
                        NinshoshaDenshikoinshubetsuCode.保険者印.getコード(), KenmeiFuyoKubunType.付与なし, reportSourceWriter);
                KarisanteiNonyuTsuchishoCVSMultiReport report
                        = new KarisanteiNonyuTsuchishoCVSMultiReport(仮算定納入通知書情報, ninshoshaSource);
                report.writeBy(reportSourceWriter);
            }
            return reportManager.publish();
        }
    }

    private void print全てページDBB100026(KariSanteiNonyuTsuchiShoJoho 仮算定納入通知書情報, ReportManager reportManager) {
        KarisanteiNonyuTsuchishoCVSMultiProperty property = new KarisanteiNonyuTsuchishoCVSMultiProperty();
        try (ReportAssembler<KarisanteiNonyuTsuchishoCVSMultiSource> assembler = createAssembler(property, reportManager)) {
            ReportSourceWriter<KarisanteiNonyuTsuchishoCVSMultiSource> reportSourceWriter
                    = new ReportSourceWriter(assembler);

            NinshoshaSource ninshoshaSource = ReportUtil.get認証者情報(SubGyomuCode.DBB介護賦課, 帳票分類ID, 仮算定納入通知書情報.get発行日(),
                    NinshoshaDenshikoinshubetsuCode.保険者印.getコード(), KenmeiFuyoKubunType.付与なし, reportSourceWriter);
            KarisanteiNonyuTsuchishoCVSMultiReport report
                    = new KarisanteiNonyuTsuchishoCVSMultiReport(仮算定納入通知書情報, ninshoshaSource);
            report.writeBy(reportSourceWriter);
        }
    }

    private SourceDataCollection print全てページDBB100027(KariSanteiNonyuTsuchiShoJoho 仮算定納入通知書情報) {
        KarisanteiNonyuTsuchishoCVSMultiRenchoProperty property = new KarisanteiNonyuTsuchishoCVSMultiRenchoProperty();
        try (ReportManager reportManager = new ReportManager()) {
            try (ReportAssembler<KarisanteiNonyuTsuchishoCVSMultiRenchoSource> assembler = createAssembler(property, reportManager)) {
                ReportSourceWriter<KarisanteiNonyuTsuchishoCVSMultiRenchoSource> reportSourceWriter
                        = new ReportSourceWriter(assembler);

                NinshoshaSource ninshoshaSource = ReportUtil.get認証者情報(SubGyomuCode.DBB介護賦課, 帳票分類ID, 仮算定納入通知書情報.get発行日(),
                        NinshoshaDenshikoinshubetsuCode.保険者印.getコード(), KenmeiFuyoKubunType.付与なし, reportSourceWriter);
                KarisanteiNonyuTsuchishoCVSMultiRenchoReport report
                        = new KarisanteiNonyuTsuchishoCVSMultiRenchoReport(仮算定納入通知書情報, ninshoshaSource);
                report.writeBy(reportSourceWriter);
            }
            return reportManager.publish();
        }
    }

    private void print全てページDBB100027(KariSanteiNonyuTsuchiShoJoho 仮算定納入通知書情報, ReportManager reportManager) {
        KarisanteiNonyuTsuchishoCVSMultiRenchoProperty property = new KarisanteiNonyuTsuchishoCVSMultiRenchoProperty();
        try (ReportAssembler<KarisanteiNonyuTsuchishoCVSMultiRenchoSource> assembler = createAssembler(property, reportManager)) {
            ReportSourceWriter<KarisanteiNonyuTsuchishoCVSMultiRenchoSource> reportSourceWriter
                    = new ReportSourceWriter(assembler);

            NinshoshaSource ninshoshaSource = ReportUtil.get認証者情報(SubGyomuCode.DBB介護賦課, 帳票分類ID, 仮算定納入通知書情報.get発行日(),
                    NinshoshaDenshikoinshubetsuCode.保険者印.getコード(), KenmeiFuyoKubunType.付与なし, reportSourceWriter);
            KarisanteiNonyuTsuchishoCVSMultiRenchoReport report
                    = new KarisanteiNonyuTsuchishoCVSMultiRenchoReport(仮算定納入通知書情報, ninshoshaSource);
            report.writeBy(reportSourceWriter);
        }
    }

    private SourceDataCollection print全てページDBB100026DevidedByPage(KariSanteiNonyuTsuchiShoJoho 仮算定納入通知書情報) {
        KarisanteiNonyuTsuchishoCVSMultiProperty property = new KarisanteiNonyuTsuchishoCVSMultiProperty();
        try (ReportManager reportManager = new ReportManager()) {
            try (ReportAssembler<KarisanteiNonyuTsuchishoCVSMultiSource> assembler = createAssembler(property, reportManager)) {
                ReportSourceWriter<KarisanteiNonyuTsuchishoCVSMultiSource> reportSourceWriter = new ReportSourceWriter(assembler);

                NinshoshaSource ninshoshaSource = ReportUtil.get認証者情報(SubGyomuCode.DBB介護賦課, 帳票分類ID, 仮算定納入通知書情報.get発行日(),
                        NinshoshaDenshikoinshubetsuCode.保険者印.getコード(), KenmeiFuyoKubunType.付与なし, reportSourceWriter);
                List<NonyuTsuchisho<KarisanteiNonyuTsuchishoCVSMultiSource>> reportList
                        = new KarisanteiNonyuTsuchishoCVSMultiReport(仮算定納入通知書情報, ninshoshaSource).devidedByPage();
                for (NonyuTsuchisho report : reportList) {
                    report.writeBy(reportSourceWriter);
                }
            }
            return reportManager.publish();
        }
    }

    private SourceDataCollection print全てページDBB100027DevidedByPage(KariSanteiNonyuTsuchiShoJoho 仮算定納入通知書情報) {
        KarisanteiNonyuTsuchishoCVSMultiRenchoProperty property = new KarisanteiNonyuTsuchishoCVSMultiRenchoProperty();
        try (ReportManager reportManager = new ReportManager()) {
            try (ReportAssembler<KarisanteiNonyuTsuchishoCVSMultiRenchoSource> assembler = createAssembler(property, reportManager)) {
                ReportSourceWriter<KarisanteiNonyuTsuchishoCVSMultiRenchoSource> reportSourceWriter = new ReportSourceWriter(assembler);

                NinshoshaSource ninshoshaSource = ReportUtil.get認証者情報(SubGyomuCode.DBB介護賦課, 帳票分類ID, 仮算定納入通知書情報.get発行日(),
                        NinshoshaDenshikoinshubetsuCode.保険者印.getコード(), KenmeiFuyoKubunType.付与なし, reportSourceWriter);
                List<NonyuTsuchisho<KarisanteiNonyuTsuchishoCVSMultiRenchoSource>> reportList
                        = new KarisanteiNonyuTsuchishoCVSMultiRenchoReport(仮算定納入通知書情報, ninshoshaSource).devidedByPage();
                for (NonyuTsuchisho report : reportList) {
                    report.writeBy(reportSourceWriter);
                }
            }
            return reportManager.publish();
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