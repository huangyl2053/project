/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC180011;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.euc.futanwariaihanteiichiran.FutanWariaiHanteiIchiranCsvEntityEditor;
import jp.co.ndensan.reams.db.dbc.business.report.futanwariaihanteiichiran.FutanWariaiHanteiIchiranPageBreak;
import jp.co.ndensan.reams.db.dbc.business.report.futanwariaihanteiichiran.FutanWariaiHanteiIchiranReport;
import jp.co.ndensan.reams.db.dbc.definition.core.riyoshafutan.RiyoshaFutanWaritaiHantei_ErrorKubun;
import jp.co.ndensan.reams.db.dbc.definition.processprm.futanwariaihanteiichiran.FutanWariaiHanteiIchiranProcessParameter;
import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.db.dbc.entity.csv.futanwariaihanteiichiran.FutanWariaiHanteiIchiranCsvEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.futanwariaihanteiichiran.FutanwariaiHanteiIchiranEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.nenjiriyoshafutanwariaihantei.DbWT1801ShoriKekkaKakuninListEntity;
import jp.co.ndensan.reams.db.dbc.entity.report.futanwariaihanteiichiran.FutanWariaiHanteiIchiranSource;
import jp.co.ndensan.reams.db.dbx.business.util.DateConverter;
import jp.co.ndensan.reams.db.dbz.business.config.KaigoToiawasesakiConfig;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.report.outputjokenhyo.ReportOutputJokenhyoItem;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.OutputJokenhyoFactory;
import jp.co.ndensan.reams.uz.uza.batch.batchexecutor.util.JobContextHolder;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchKeyBreakBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchTableWriter;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.euc.definition.UzUDE0831EucAccesslogFileType;
import jp.co.ndensan.reams.uz.uza.euc.io.EucEntityId;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvWriter;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RYear;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogger;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.PersonalData;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.uuid.AccessLogUUID;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.spool.FileSpoolManager;
import jp.co.ndensan.reams.uz.uza.spool.entities.UzUDE0835SpoolOutputType;

/**
 * 負担割合判定一覧表帳票出力プロセスです。
 *
 * @reamsid_L DBC-4980-031 yuanzhenxia
 */
public class FutanWariaiHanteiIchiranProcess extends BatchKeyBreakBase<FutanwariaiHanteiIchiranEntity> {

    private static final ReportId ID = ReportIdDBC.DBC200089.getReportId();
    private static final RString MYBATIS_SELECT_ID = new RString(
            "jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate.futanwariaihanteiichiran.IFutanwariaiHanteiIchiranMapper.get負担割合判定一覧データ");
    private static final EucEntityId EUC_ENTITY_ID = new EucEntityId(new RString("DBC200089"));
    private static final RString EUC_WRITER_DELIMITER = new RString(",");
    private static final RString EUC_WRITER_ENCLOSURE = new RString("\"");
    private static final RString CSVMEISHO = new RString("FutanWariaiHanteiIchiran.csv");
    private static final RString 処理結果確認リストTEMP = new RString("DbWT1801ShoriKekkaKakuninList");
    private static final RString 帳票名 = new RString("負担割合判定一覧");
    private static final RString あり = new RString("あり");
    private static final RString 年度 = new RString("【年度】");
    private static final RString 抽出対象期間 = new RString("【抽出対象期間】");
    private static final RString テスト処理 = new RString("【テスト処理】");
    private static final RString 年 = new RString("年");
    private static final RString 時 = new RString("時");
    private static final RString 分 = new RString("分");
    private static final RString 秒 = new RString("秒");
    private static final RString HALFMONTH = new RString("#0");
    private static final RString 被保険者番号 = new RString("被保険者番号");
    private static final RString RSTRING = new RString("0003");
    private static final RString RSTRING_TWO = new RString("2");
    private static final RString RSTRING_THREE = new RString("3");
    private static final RString 年度STRING = new RString("年度");
    private static final RString 以前 = new RString("以前");
    private RString eucFilePath;
    private FileSpoolManager manager;
    private RString 共通_文字コード;
    private FutanWariaiHanteiIchiranProcessParameter processParameter;
    private final List<PersonalData> personalDataList = new ArrayList<>();
    private final List<RString> rStringList = new ArrayList<>();
    private Association 導入団体クラス;
    private boolean flag;
    private int 連番 = 0;
    /**
     * 送付対象データ取得後の返した
     */
    public static final RString PARAMETER_OUT_FLOWENTITY;

    static {
        PARAMETER_OUT_FLOWENTITY = new RString("flowEntity");
    }
    @BatchWriter
    private BatchReportWriter<FutanWariaiHanteiIchiranSource> batchReportWriter;
    private ReportSourceWriter<FutanWariaiHanteiIchiranSource> reportSourceWriter;
    private CsvWriter<FutanWariaiHanteiIchiranCsvEntity> eucCsvWriter;
    @BatchWriter
    private IBatchTableWriter tempResultListDbWriter;

    @Override
    protected void initialize() {
        導入団体クラス = AssociationFinderFactory.createInstance().getAssociation();
        KaigoToiawasesakiConfig config = new KaigoToiawasesakiConfig();
        共通_文字コード = config.getEUC共通_文字コード();
        flag = true;
    }

    @Override
    protected void createWriter() {
        batchReportWriter = BatchReportFactory.createBatchReportWriter(ID.value())
                .addBreak(new FutanWariaiHanteiIchiranPageBreak(rStringList)).create();
        reportSourceWriter = new ReportSourceWriter<>(batchReportWriter);
        manager = new FileSpoolManager(UzUDE0835SpoolOutputType.Euc, EUC_ENTITY_ID, UzUDE0831EucAccesslogFileType.Csv);
        this.tempResultListDbWriter = new BatchEntityCreatedTempTableWriter(処理結果確認リストTEMP, DbWT1801ShoriKekkaKakuninListEntity.class);
        RString spoolWorkPath = manager.getEucOutputDirectry();
        Encode 文字コード;
        if (RSTRING_TWO.equals(共通_文字コード)) {
            文字コード = Encode.SJIS;
        } else if (RSTRING_THREE.equals(共通_文字コード)) {
            文字コード = Encode.UTF_8withBOM;
        } else {
            文字コード = Encode.UTF_8withBOM;
        }
        eucFilePath = Path.combinePath(spoolWorkPath, CSVMEISHO);
        eucCsvWriter = new CsvWriter.InstanceBuilder(eucFilePath).
                setDelimiter(EUC_WRITER_DELIMITER).
                setEnclosure(EUC_WRITER_ENCLOSURE).
                setEncode(文字コード).
                setNewLine(NewLine.CRLF).
                hasHeader(true).
                build();
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MYBATIS_SELECT_ID, processParameter.toFutanwariaiHanteiIchiranMybaticParameter());
    }

    @Override
    protected void afterExecute() {
        eucCsvWriter.close();
        AccessLogUUID accessLogUUIDKodomo = AccessLogger.logEUC(UzUDE0835SpoolOutputType.Euc, personalDataList);
        manager.spool(eucFilePath, accessLogUUIDKodomo);
        if (flag) {
            DbWT1801ShoriKekkaKakuninListEntity resultListEntity = new DbWT1801ShoriKekkaKakuninListEntity();
            resultListEntity.setErrorKubun(RiyoshaFutanWaritaiHantei_ErrorKubun.負担割合判定一覧作成.getコード());
            if (!RSTRING_THREE.equals(processParameter.get処理区分())) {
                resultListEntity.setBiko(パターン107(processParameter.get対象年度()));
            } else {
                resultListEntity.setBiko(パターン107(processParameter.get対象年度()).concat(以前));
            }
            tempResultListDbWriter.insert(resultListEntity);
        }
        ReportOutputJokenhyoItem item = new ReportOutputJokenhyoItem(
                ID.value(),
                導入団体クラス.getLasdecCode_().value(),
                導入団体クラス.get市町村名(),
                new RString(String.valueOf(JobContextHolder.getJobId())),
                帳票名,
                new RString(String.valueOf(reportSourceWriter.pageCount().value())),
                あり,
                CSVMEISHO,
                getOutputJokenhyoParam());
        OutputJokenhyoFactory.createInstance(item).print();
    }

    private List<RString> getOutputJokenhyoParam() {
        List<RString> outputJokenhyoList = new ArrayList<>();
        RString tmp = RString.EMPTY;
        tmp = tmp.concat(年度).concat(DateConverter.getWarekiYear(new RYear(processParameter.get対象年度().toString())));
        outputJokenhyoList.add(tmp);
        tmp = RString.EMPTY;
        tmp = tmp.concat(抽出対象期間).concat(edit処理日(processParameter.get処理日時()));
        outputJokenhyoList.add(tmp);
        tmp = RString.EMPTY;
        tmp = tmp.concat(テスト処理);
        outputJokenhyoList.add(tmp);
        return outputJokenhyoList;
    }

    private RString パターン107(FlexibleYear year) {
        RString wareki = RString.EMPTY;
        if (year != null) {
            wareki = year.wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN).fillType(FillType.BLANK).toDateString().concat(年度STRING);
        }
        return wareki;
    }

    private RString edit処理日(RDateTime dateTime) {
        RString wareki = RString.EMPTY;
        if (dateTime != null) {
            wareki = dateTime.getDate().wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN).fillType(FillType.ZERO)
                    .getYear().concat(年).concat(dateTime.getDate().wareki().separator(Separator.JAPANESE)
                            .fillType(FillType.ZERO).getMonthDay())
                    .concat(RString.FULL_SPACE)
                    .concat(new RString(new Decimal(dateTime.getHour()).toString(HALFMONTH.toString()))).concat(時)
                    .concat(new RString(new Decimal(dateTime.getMinute()).toString(HALFMONTH.toString()))).concat(分)
                    .concat(new RString(new Decimal(dateTime.getSecond()).toString(HALFMONTH.toString()))).concat(秒);
        }
        return wareki;
    }

    private PersonalData getPersonalData(FutanwariaiHanteiIchiranEntity entity) {
        ExpandedInformation expandedInfo = new ExpandedInformation(new Code(RSTRING), 被保険者番号, entity.get今回被保険者番号().value());
        return PersonalData.of(entity.get判定対象者識別コード(), expandedInfo);
    }

    @Override
    protected void keyBreakProcess(FutanwariaiHanteiIchiranEntity t) {
    }

    @Override
    protected void usualProcess(FutanwariaiHanteiIchiranEntity entity) {
        連番++;
        flag = false;
        entity.set連番(連番);
        entity.set地方公共団体コード(導入団体クラス.get地方公共団体コード().value());
        entity.set市町村名(導入団体クラス.get市町村名());
        FutanWariaiHanteiIchiranReport report = new FutanWariaiHanteiIchiranReport(processParameter, entity);
        report.writeBy(reportSourceWriter);
        eucCsvWriter.writeLine(new FutanWariaiHanteiIchiranCsvEntityEditor(entity, processParameter).edit());
        if (entity.get判定対象者識別コード() != null) {
            PersonalData personalData = getPersonalData(entity);
            personalDataList.add(personalData);
        }
    }
}