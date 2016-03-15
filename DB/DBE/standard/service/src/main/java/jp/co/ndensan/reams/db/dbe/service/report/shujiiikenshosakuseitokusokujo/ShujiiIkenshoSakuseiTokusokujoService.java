/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.service.report.shujiiikenshosakuseitokusokujo;

import jp.co.ndensan.reams.db.dbe.business.report.shujiiikenshosakuseitokusokujo.ShujiiIkenshoSakuseiTokusokujoItem;
import jp.co.ndensan.reams.db.dbe.business.report.shujiiikenshosakuseitokusokujo.ShujiiIkenshoSakuseiTokusokujoProperty;
import jp.co.ndensan.reams.db.dbe.business.report.shujiiikenshosakuseitokusokujo.ShujiiIkenshoSakuseiTokusokujoReport;
import jp.co.ndensan.reams.db.dbe.entity.report.source.shujiiikenshosakuseitokusokujo.ShujiiIkenshoSakuseiTokusokujoReportSource;
import jp.co.ndensan.reams.ur.urz.business.report.parts.ninshosha.INinshoshaSourceBuilder;
import jp.co.ndensan.reams.ur.urz.service.report.parts.ninshosha.INinshoshaSourceBuilderCreator;
import jp.co.ndensan.reams.ur.urz.service.report.sourcebuilder.ReportSourceBuilders;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
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
 * 主治医意見書提出督促状Printerです。
 *
 */
public class ShujiiIkenshoSakuseiTokusokujoService {

    /**
     * 主治医意見書提出督促状を印刷します。
     *
     * @param item 主治医意見書提出督促状作成_帳票クラスパラメータクラス
     * @return {@link SourceDataCollection}
     */
    public SourceDataCollection print(ShujiiIkenshoSakuseiTokusokujoItem item) {

        ShujiiIkenshoSakuseiTokusokujoProperty property = new ShujiiIkenshoSakuseiTokusokujoProperty();
        try (ReportManager reportManager = new ReportManager()) {
            try (ReportAssembler<ShujiiIkenshoSakuseiTokusokujoReportSource> assembler = createAssembler(property, reportManager)) {
                INinshoshaSourceBuilderCreator ninshoshaSourceBuilderCreator = ReportSourceBuilders.ninshoshaSourceBuilder();
                INinshoshaSourceBuilder ninshoshaSourceBuilder = ninshoshaSourceBuilderCreator.create(GyomuCode.DB介護保険, RString.EMPTY,
                        RDate.getNowDate(), assembler.getImageFolderPath());
                item = setShujiiIkenshoSakuseiTokusokujoItem(item);
                ReportSourceWriter<ShujiiIkenshoSakuseiTokusokujoReportSource> reportSourceWriter
                        = new ReportSourceWriter(assembler);
                ShujiiIkenshoSakuseiTokusokujoReport.createFrom(item).writeBy(reportSourceWriter);
            }
            return reportManager.publish();
        }
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

    private static ShujiiIkenshoSakuseiTokusokujoItem
            setShujiiIkenshoSakuseiTokusokujoItem(ShujiiIkenshoSakuseiTokusokujoItem item) {

        return new ShujiiIkenshoSakuseiTokusokujoItem(
                item.getBunshoNo(),
                item.getDenshikoin(),
                item.getHakkoYMD1(),
                item.getKoinMojiretsu(),
                item.getKoinShoryaku(),
                item.getNinshoshaShimeiKakeru(),
                item.getNinshoshaYakushokuMei(),
                item.getNinshoshaShimeiKakenai(),
                item.getNinshoshaYakushokuMei1(),
                item.getNinshoshaYakushokuMei2(),
                item.getAtenaRenban(),
                item.getCustomerBarCode(),
                item.getYubinNo1(),
                item.getJushoText(),
                item.getKikanNameText(),
                item.getShimeiText(),
                item.getMeishoFuyo(),
                item.getSonota(),
                item.getTsuchibun1(),
                item.getTsuchibun2(),
                item.getHihokenshaNo1(),
                item.getHihokenshaNo2(),
                item.getHihokenshaNo3(),
                item.getHihokenshaNo4(),
                item.getHihokenshaNo5(),
                item.getHihokenshaNo6(),
                item.getHihokenshaNo7(),
                item.getHihokenshaNo8(),
                item.getHihokenshaNo9(),
                item.getHihokenshaNo10(),
                item.getHokenshaNo1(),
                item.getHokenshaNo2(),
                item.getHokenshaNo3(),
                item.getHokenshaNo4(),
                item.getHokenshaNo5(),
                item.getHokenshaNo6(),
                item.getShinseiKubun(),
                item.getHihokenshaNameKana(),
                item.getHihokennsyaName(),
                item.getShinseiYMD(),
                item.getYubinNo(),
                item.getJusho(),
                item.getBirthYMD(),
                item.getRemban(),
                item.getSeyibenMan(),
                item.getSeyibenWoman(),
                item.getBirthGengoMeiji(),
                item.getBirthGengoTaisho(),
                item.getBirthGengoShowa(),
                item.getShoriName());
    }
}
