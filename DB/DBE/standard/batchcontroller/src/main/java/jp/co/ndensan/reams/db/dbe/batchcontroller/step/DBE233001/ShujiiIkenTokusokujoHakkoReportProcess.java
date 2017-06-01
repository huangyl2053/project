/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.batchcontroller.step.DBE233001;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.report.ninteichosatokusokutaishoshaichiranhyo.NinteiChosaTokusokuTaishoshaIchiranhyoItem;
import jp.co.ndensan.reams.db.dbe.business.report.ninteichosatokusokutaishoshaichiranhyo.NinteiChosaTokusokuTaishoshaIchiranhyoReport;
import jp.co.ndensan.reams.db.dbe.business.report.shujiiikenshosakuseitokusokujo.ShujiiIkenshoTokusokuTaishoshaIchiranhyoOutputJokenhyoEditor;
import jp.co.ndensan.reams.db.dbe.definition.batchprm.DBE233001.ShujiiIkenTokusokujoHakkoReportProcessParameter;
import jp.co.ndensan.reams.db.dbe.definition.core.reportid.ReportIdDBE;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.dbe233001.ShujiiIkenTokusokujoCsvEntity;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.dbe233001.ShujiiIkenTokusokujoHakkoRelateEntity;
import jp.co.ndensan.reams.db.dbe.entity.report.source.ninteichosatokusokutaishoshaichiranhyo.NinteiChosaTokusokuTaishoshaIchiranhyoReportSource;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.report.outputjokenhyo.ReportOutputJokenhyoItem;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
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
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.euc.definition.UzUDE0831EucAccesslogFileType;
import jp.co.ndensan.reams.uz.uza.euc.io.EucEntityId;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvWriter;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogger;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.PersonalData;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.uuid.AccessLogUUID;
import jp.co.ndensan.reams.uz.uza.report.BreakerCatalog;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.report.api.ReportInfo;
import jp.co.ndensan.reams.uz.uza.spool.FileSpoolManager;
import jp.co.ndensan.reams.uz.uza.spool.entities.UzUDE0835SpoolOutputType;

/**
 * 主治医意見書督促対象者一覧表の作成クラスです。
 *
 * @reamsid_L DBE-0060-040 zhangzhiming
 */
public class ShujiiIkenTokusokujoHakkoReportProcess extends BatchProcessBase<ShujiiIkenTokusokujoHakkoRelateEntity> {

    private static final RString MYBATIS_SELECT_ID = new RString(
            "jp.co.ndensan.reams.db.dbe.persistence.db.mapper.relate.dbe233001."
            + "IDbe233001RelateMapper.select主治医意見書督促対象者一覧表ByKey");

    private static final ReportId REPORT_DBE233002 = ReportIdDBE.DBE233002.getReportId();
    @BatchWriter
    private BatchReportWriter<NinteiChosaTokusokuTaishoshaIchiranhyoReportSource> batchWrite;
    private ReportSourceWriter<NinteiChosaTokusokuTaishoshaIchiranhyoReportSource> reportSourceWriter;
    private CsvWriter<ShujiiIkenTokusokujoCsvEntity> csvWriter;
    private FileSpoolManager manager;
    private RString eucFilePath;
    private List<NinteiChosaTokusokuTaishoshaIchiranhyoItem> itemList;
    NinteiChosaTokusokuTaishoshaIchiranhyoItem item;
    private boolean outputCsv;
    private ShujiiIkenTokusokujoHakkoReportProcessParameter processPrm;
    private List<PersonalData> personalDataList;
    private static final RString CSVファイル名 = new RString("主治医意見書督促対象者一覧表.csv");
    private static final EucEntityId EUC_ENTITY_ID = new EucEntityId(new RString("DBE233002"));
    private static final RString EUC_WRITER_DELIMITER = new RString(",");
    private static final RString EUC_WRITER_ENCLOSURE = new RString("\"");
    private static final RString 改頁キー = new RString("cityCode");
    private static int index = 1;

    @Override
    protected void initialize() {
        itemList = new ArrayList();
        personalDataList = new ArrayList<>();
        outputCsv = processPrm.getTemp_CSV出力().equals(new RString("1"));
        super.initialize();
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MYBATIS_SELECT_ID, processPrm.toShujiiIkenTokusokujoHakkoMybitisParamter());
    }

    @Override
    protected void createWriter() {
        batchWrite = BatchReportFactory.createBatchReportWriter(REPORT_DBE233002.value())
                .addBreak(new BreakerCatalog<NinteiChosaTokusokuTaishoshaIchiranhyoReportSource>().simplePageBreaker(改頁キー))
                .create();
        reportSourceWriter = new ReportSourceWriter(batchWrite);
        if (outputCsv) {
            manager = new FileSpoolManager(UzUDE0835SpoolOutputType.EucOther, EUC_ENTITY_ID,
                    UzUDE0831EucAccesslogFileType.Csv);
            RString spoolWorkPath = manager.getEucOutputDirectry();
            eucFilePath = Path.combinePath(spoolWorkPath, CSVファイル名);
            csvWriter = new CsvWriter.InstanceBuilder(eucFilePath).
                    setDelimiter(EUC_WRITER_DELIMITER).
                    setEnclosure(EUC_WRITER_ENCLOSURE).
                    setEncode(Encode.UTF_8withBOM).
                    setNewLine(NewLine.CRLF).
                    hasHeader(true).
                    build();
        }
    }

    @Override
    protected void process(ShujiiIkenTokusokujoHakkoRelateEntity entity) {
        item = new NinteiChosaTokusokuTaishoshaIchiranhyoItem(
                entity.getTemp_市町村コード() == null ? RString.EMPTY : entity.getTemp_市町村コード().getColumnValue(),
                entity.getTemp_市町村名称(),
                entity.getTemp_市町村名称(),
                entity.getTemp_被保険者番号(),
                entity.getTemp_被保険者氏名カナ() == null ? RString.EMPTY : entity.getTemp_被保険者氏名カナ().getColumnValue(),
                entity.getTemp_被保険者氏名() == null ? RString.EMPTY : entity.getTemp_被保険者氏名().getColumnValue(),
                entity.getTemp_申請日() == null ? RDate.MIN : new RDate(entity.getTemp_申請日().toString()),
                entity.getTemp_督促状発行日() == null ? RDate.MIN : new RDate(entity.getTemp_督促状発行日().toString()),
                entity.getTemp_主治医氏名() == null ? RString.EMPTY : entity.getTemp_主治医氏名(),
                entity.getTemp_事業者名称(),
                entity.getTemp_事業者住所(),
                entity.getTemp_事業者電話番号() == null ? RString.EMPTY : entity.getTemp_事業者電話番号().getColumnValue(),
                entity.getTemp_保険者番号(),
                new RString(entity.getTemp_申請書管理番号().toString()));
        itemList.add(item);
        NinteiChosaTokusokuTaishoshaIchiranhyoReport report = new NinteiChosaTokusokuTaishoshaIchiranhyoReport(item, index);
        report.writeBy(reportSourceWriter);
        if (outputCsv) {
            csvWriter.writeLine(createCsvEntity(
                    item,
                    entity.getTemp_医療機関コード() == null ? RString.EMPTY : entity.getTemp_医療機関コード(),
                    entity.getTemp_主治医コード() == null ? RString.EMPTY : entity.getTemp_主治医コード(),
                    index));
            personalDataList.add(toPersonalData(entity.getTemp_保険者番号(), entity.getTemp_被保険者番号(), new RString(entity.getTemp_申請書管理番号().toString())));
        }
        index = index + 1;
    }

    private PersonalData toPersonalData(RString 証記載保険者番号, RString 被保険者番号, RString 申請書管理番号) {
        ShikibetsuCode shikibetsuCode = new ShikibetsuCode(証記載保険者番号.substring(0, 5).concat(被保険者番号));
        ExpandedInformation expandedInformation = new ExpandedInformation(new Code("0001"), new RString("申請書管理番号"), 申請書管理番号);
        return PersonalData.of(shikibetsuCode, expandedInformation);
    }

    private ShujiiIkenTokusokujoCsvEntity createCsvEntity(NinteiChosaTokusokuTaishoshaIchiranhyoItem item,
            RString 医療機関コード, RString 主治医コード, int idenx) {
        return new ShujiiIkenTokusokujoCsvEntity(
                new RString(String.valueOf(idenx)), item.getCityCode(), item.getCityName(), item.getListUpper1_1(),
                item.getListLower1_1(), item.getListUpper1_2(),
                item.getListLower1_2(), item.getListShinseiYMD_1().toDateString(),
                item.getListTokusokujoHakkoYMD_1().toDateString(),
                医療機関コード, item.getListUpper2_1(),
                item.getListUpper2_2(), item.getListLower2_2(), 主治医コード, item.getListLower2_1());
    }

    @Override
    protected void afterExecute() {
        ShujiiIkenshoTokusokuTaishoshaIchiranhyoOutputJokenhyoEditor outputJokenhyoEditor
                = new ShujiiIkenshoTokusokuTaishoshaIchiranhyoOutputJokenhyoEditor(processPrm);
        List<RString> 条件リスト = outputJokenhyoEditor.edit();
        Association association = AssociationFinderFactory.createInstance().getAssociation();
        ReportOutputJokenhyoItem 帳票出力条件表パラメータ = new ReportOutputJokenhyoItem(
                REPORT_DBE233002.value(),
                association.get地方公共団体コード().value(),
                association.get市町村名(),
                new RString(JobContextHolder.getJobId()),
                ReportInfo.getReportName(SubGyomuCode.DBE認定支援, REPORT_DBE233002.value()),
                new RString(batchWrite.getPageCount()),
                outputCsv ? new RString("あり") : new RString("なし"),
                outputCsv ? CSVファイル名 : RString.EMPTY,
                条件リスト);
        OutputJokenhyoFactory.createInstance(帳票出力条件表パラメータ).print();
        if (outputCsv) {
            csvWriter.close();
            AccessLogUUID accessLogUUID = AccessLogger.logEUC(UzUDE0835SpoolOutputType.EucOther, personalDataList);
            manager.spool(eucFilePath, accessLogUUID);
        }
    }
}
