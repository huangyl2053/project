/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.batchcontroller.step.DBE601002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.core.chosahyojissekiichiran.ChosahyoJissekiIchiranChange;
import jp.co.ndensan.reams.db.dbe.business.report.ichosahyojissekiichiran.ChosahyoJissekiIchiranReport;
import jp.co.ndensan.reams.db.dbe.definition.core.NinteiChosaShukeiKijunbiKubun;
import jp.co.ndensan.reams.db.dbe.definition.core.reportid.ReportIdDBE;
import jp.co.ndensan.reams.db.dbe.definition.processprm.chosahyojissekiichiran.ChosahyoJissekiIchiranProcessParameter;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.chosahyojissekiichiran.ChosahyoJissekiIchiranRelateEntity;
import jp.co.ndensan.reams.db.dbe.entity.report.chosahyojissekiichiran.ChosahyoJissekiIchiranReportSource;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.report.outputjokenhyo.ReportOutputJokenhyoItem;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.IReportOutputJokenhyoPrinter;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.OutputJokenhyoFactory;
import jp.co.ndensan.reams.uz.uza.batch.batchexecutor.util.JobContextHolder;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogType;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogger;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.PersonalData;
import jp.co.ndensan.reams.uz.uza.report.BreakerCatalog;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 帳票出力用認定調査実績集計表のReportSourceクラスです。
 *
 * @reamsid_L DBE-1691-020 dangjigjing
 */
public class ChosahyoJissekiIchiranProcessREPORT extends BatchProcessBase<ChosahyoJissekiIchiranRelateEntity> {

    private static final RString MYBATIS_SELECT_ID = new RString(
            "jp.co.ndensan.reams.db.dbe.persistence.db.mapper.relate.chosahyojissekiichiran."
            + "IChosahyoJissekiIchiranMapper.get帳票出力用認定調査実績集計表");
    private static final ReportId REPORT_ID = ReportIdDBE.DBE601002.getReportId();
    private static final RString なし = new RString("なし");
    private ChosahyoJissekiIchiranProcessParameter paramter;
    private RString 導入団体コード;
    private RString 市町村名;
    private static final RString 改頁項目 = new RString("調査委託先コード");

    @BatchWriter
    private BatchReportWriter<ChosahyoJissekiIchiranReportSource> batchWrite;
    private ReportSourceWriter<ChosahyoJissekiIchiranReportSource> reportSourceWriter;

    @Override
    protected void beforeExecute() {
        super.beforeExecute();
        Association 導入団体クラス = AssociationFinderFactory.createInstance().getAssociation();
        導入団体コード = 導入団体クラス.getLasdecCode_().value();
        市町村名 = 導入団体クラス.get市町村名();
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MYBATIS_SELECT_ID, paramter.toMybitisParamter());
    }

    @Override
    protected void createWriter() {
        List<RString> PAGE_BREAK_KEYS;
        if (paramter.get改頁().equals(改頁項目)) {
            PAGE_BREAK_KEYS = Collections.unmodifiableList(Arrays.asList(
                    new RString(ChosahyoJissekiIchiranReportSource.ReportSourceFields.listChosaJissekiIchiran_1.name()),
                    new RString(ChosahyoJissekiIchiranReportSource.ReportSourceFields.listChosaJissekiIchiran_2.name())));
        } else {
            PAGE_BREAK_KEYS = Collections.unmodifiableList(Arrays.asList(
                    new RString(ChosahyoJissekiIchiranReportSource.ReportSourceFields.listChosaJissekiIchiran_1.name())));
        }
        batchWrite = BatchReportFactory.createBatchReportWriter(REPORT_ID.value())
                .addBreak(new BreakerCatalog<ChosahyoJissekiIchiranReportSource>().simplePageBreaker(PAGE_BREAK_KEYS))
                .create();
        reportSourceWriter = new ReportSourceWriter<>(batchWrite);
    }

    @Override
    protected void process(ChosahyoJissekiIchiranRelateEntity relateEntity) {
        AccessLogger.log(AccessLogType.照会, toPersonalData(relateEntity));
        ChosahyoJissekiIchiranReport report = new ChosahyoJissekiIchiranReport(ChosahyoJissekiIchiranChange.createSyohyoData(relateEntity));
        report.writeBy(reportSourceWriter);
    }

    @Override
    protected void afterExecute() {
        帳票バッチ出力条件リストの出力();
    }

    private void 帳票バッチ出力条件リストの出力() {
        RStringBuilder ジョブ番号_Tmp = new RStringBuilder();
        ジョブ番号_Tmp.append(JobContextHolder.getJobId());
        RString ジョブ番号 = ジョブ番号_Tmp.toRString();
        RString 帳票名 = ReportIdDBE.DBE601002.getReportName();
        RString 出力ページ数 = new RString(reportSourceWriter.pageCount().value());
        RString csv出力有無 = なし;
        RString csvファイル名 = なし;
        List<RString> 出力条件 = get出力条件();
        ReportOutputJokenhyoItem item = new ReportOutputJokenhyoItem(
                ReportIdDBE.DBE601002.getReportId().value(), 導入団体コード, 市町村名, ジョブ番号,
                帳票名, 出力ページ数, csv出力有無, csvファイル名, 出力条件);
        IReportOutputJokenhyoPrinter printer = OutputJokenhyoFactory.createInstance(item);
        printer.print();
    }

    private List<RString> get出力条件() {
        List<RString> 出力条件 = new ArrayList<>();
        RString 基準日区分 = get基準日区分();
        RStringBuilder 保険者_SB = new RStringBuilder("【保険者】");
        保険者_SB.append(paramter.get証記載保険者());
        出力条件.add(get出力条件_基準日From(基準日区分));
        出力条件.add(get出力条件_基準日TO(基準日区分));
        出力条件.add(保険者_SB.toRString());
        出力条件.add(get出力条件_改頁());
        return 出力条件;
    }

    private RString get基準日区分() {
        if (paramter.get基準日区分() == null || paramter.get基準日区分().isEmpty()) {
            return new RString("基準日");
        }
        return NinteiChosaShukeiKijunbiKubun.toValue(paramter.get基準日区分()).getTitle();
    }

    private RString get出力条件_基準日From(RString 基準日区分) {
        RStringBuilder br = new RStringBuilder();
        return br.append("【")
                .append(基準日区分)
                .append("（From）】")
                .append(dateFormat(paramter.get基準日FROM()))
                .toRString();
    }

    private RString get出力条件_基準日TO(RString 基準日区分) {
        RStringBuilder br = new RStringBuilder();
        return br.append("【")
                .append(基準日区分)
                .append("（To）】")
                .append(dateFormat(paramter.get基準日TO()))
                .toRString();
    }

    private RString get出力条件_改頁() {
        RString 改頁 = new RString("【改頁】");
        改頁.concat(paramter.get改頁());
        return 改頁;
    }

    private PersonalData toPersonalData(ChosahyoJissekiIchiranRelateEntity entity) {
        ExpandedInformation expandedInfo = new ExpandedInformation(new Code(new RString("0001")), new RString("申請書管理番号"),
                entity.get申請書管理番号());
        return PersonalData.of(ShikibetsuCode.EMPTY, expandedInfo);
    }

    private static RString dateFormat(RString date) {
        if (RString.isNullOrEmpty(date)) {
            return RString.EMPTY;
        }
        RDate date_tem = new RDate(date.toString());
        return date_tem.wareki().toDateString();
    }

}
