/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC120130;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jp.co.ndensan.reams.db.dbc.business.report.KogakuGassanJikofutangaku.KogakuGassanJikofutangakuShomeiPageBreak;
import jp.co.ndensan.reams.db.dbc.business.report.KogakuGassanJikofutangaku.KogakuGassanJikofutangakuShomeiProperty;
import jp.co.ndensan.reams.db.dbc.business.report.KogakuGassanJikofutangaku.KogakuGassanJikofutangakuShomeiReport;
import jp.co.ndensan.reams.db.dbc.definition.mybatisprm.kokuhorenkyoutsuu.KokuhorenIchiranhyoMybatisParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kyufujissekikoshinin.KyufuJissekiKoshinDoIchiranhyoSakuseiProcessParameter;
import jp.co.ndensan.reams.db.dbc.entity.csv.kogakugassanjikofutangakushomeishoin.KogakuGassanJikofutangakuCsvEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kogakugassanjikofutangakushomeishoin.GassanJikofutangakuShomeishoTorikomiIchiranSource;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kogakugassanjikofutangakushomeishoin.KogakuGassanJikofutangakuShomeishoDateEntity;
import jp.co.ndensan.reams.db.dbc.service.core.kogakugassanjikofutangaku.KogakuGassanJikofutangakuShomeiService;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IOutputOrder;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.ISetSortItem;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.MyBatisOrderByClauseCreator;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.ur.urz.service.core.reportoutputorder.ChohyoShutsuryokujunFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.core.reportoutputorder.IChohyoShutsuryokujunFinder;
import jp.co.ndensan.reams.uz.uza.batch.BatchInterruptedException;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchKeyBreakBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.euc.definition.UzUDE0831EucAccesslogFileType;
import jp.co.ndensan.reams.uz.uza.euc.io.EucEntityId;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvWriter;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogger;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.PersonalData;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.uuid.AccessLogUUID;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.report.source.breaks.PageBreaker;
import jp.co.ndensan.reams.uz.uza.spool.FileSpoolManager;
import jp.co.ndensan.reams.uz.uza.spool.entities.UzUDE0835SpoolOutputType;
import jp.co.ndensan.reams.uz.uza.util.db.IDbColumnMappable;

/**
 * 高額合算自己負担額証明書情報取込・一覧表作成を実行する。
 *
 * @reamsid_L DBC-2640-010 zhengshenlei
 */
public class KogakuGassanJikofutangakuShomeishoIchiranhyoSakuseiProcess extends BatchKeyBreakBase<KogakuGassanJikofutangakuShomeishoDateEntity> {

    private static final RString MAPPERPATH = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate."
            + "KogakuGassanJikofutangaku.IKogakuGassanJSaiSyoriJyunbiMapper.get帳票出力対象データ");

    private KyufuJissekiKoshinDoIchiranhyoSakuseiProcessParameter parameter;
    private KokuhorenIchiranhyoMybatisParameter 帳票データの取得Parameter;
    private static final EucEntityId EUC_ENTITY_ID = new EucEntityId("DBC200034");
    private final List<PersonalData> personalDataList = new ArrayList<>();
    private BatchReportWriter<GassanJikofutangakuShomeishoTorikomiIchiranSource> batchReportWriter;
    private ReportSourceWriter<GassanJikofutangakuShomeishoTorikomiIchiranSource> reportSourceWriter;
    private FileSpoolManager manager;
    private RString eucFilePath;
    private static final RString ダブル引用符 = new RString("\"");
    private KogakuGassanJikofutangakuShomeishoDateEntity lastEntity;
    @BatchWriter
    private CsvWriter<KogakuGassanJikofutangakuCsvEntity> csvWriter;

    private RString 出力順;
    private IOutputOrder 並び順;
    private Set<ShikibetsuCode> 識別コードset;
    private List<RString> 改頁項目リスト;
    private List<RString> 改頁リスト;
    private RString 並び順の１件目 = RString.EMPTY;
    private RString 並び順の２件目 = RString.EMPTY;
    private RString 並び順の３件目 = RString.EMPTY;
    private RString 並び順の４件目 = RString.EMPTY;
    private RString 並び順の５件目 = RString.EMPTY;
    private static final int INDEX_1 = 1;
    private static final int INDEX_2 = 2;
    private static final int INDEX_3 = 3;
    private static final int INDEX_4 = 4;
    private int 連番 = 0;
    private int 連番_NO = 0;
    private static final RString CODE = new RString("0003");
    private static final RString 被保険者番号 = new RString("被保険者番号");

    private KogakuGassanJikofutangakuShomeiService service;

    private static final RString 出力ファイル名
            = new RString("DBC200034_GassanJikofutangakuShomeishoTorikomiIchiran.csv");
    private static final RString 実行不可MESSAGE = new RString("帳票出力順の取得");
    private static final RString デフォルト出力順 = new RString(" ORDER BY DbWT37H1.\"hokenshaNo\" ASC ,DbWT37H1.\"hokenshaNo\" DEC");
    private static final RString コンマ = new RString(",");

    private static final RString 固定改頁項目ID = new RString("0365");

    @Override
    protected void initialize() {
        service = KogakuGassanJikofutangakuShomeiService.createInstance();
        帳票データの取得Parameter = new KokuhorenIchiranhyoMybatisParameter();
        識別コードset = new HashSet<>();
        改頁項目リスト = new ArrayList<>();
        改頁リスト = new ArrayList<>();
        改頁リスト.add(固定改頁項目ID);
        並び順 = get並び順();

        if (null == 並び順) {
            throw new BatchInterruptedException(UrErrorMessages.実行不可.getMessage()
                    .replace(実行不可MESSAGE.toString()).toString());
        } else {
            int i = 0;
            for (ISetSortItem item : 並び順.get設定項目リスト()) {
                if (item.is改頁項目()) {
                    改頁項目リスト.add(item.get項目名());
                    改頁リスト.add(item.get項目ID());
                }
                if (i == 0) {
                    並び順の１件目 = item.get項目名();
                } else if (i == INDEX_1) {
                    並び順の２件目 = item.get項目名();
                } else if (i == INDEX_2) {
                    並び順の３件目 = item.get項目名();
                } else if (i == INDEX_3) {
                    並び順の４件目 = item.get項目名();
                } else if (i == INDEX_4) {
                    並び順の５件目 = item.get項目名();
                }
                i = i + 1;
            }
        }
        出力順 = get出力順();
        帳票データの取得Parameter.set出力順(出力順);
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MAPPERPATH, 帳票データの取得Parameter);
    }

    @Override
    protected void createWriter() {
        PageBreaker<GassanJikofutangakuShomeishoTorikomiIchiranSource> breaker = new KogakuGassanJikofutangakuShomeiPageBreak(改頁リスト);
        batchReportWriter = BatchReportFactory.createBatchReportWriter(parameter.get帳票ID().value()).addBreak(breaker).create();
        reportSourceWriter = new ReportSourceWriter<>(batchReportWriter);
        manager = new FileSpoolManager(UzUDE0835SpoolOutputType.EucOther, EUC_ENTITY_ID, UzUDE0831EucAccesslogFileType.Csv);
        RString spoolWorkPath = manager.getEucOutputDirectry();
        eucFilePath = Path.combinePath(spoolWorkPath, 出力ファイル名);
        csvWriter = new CsvWriter.InstanceBuilder(eucFilePath)
                .setDelimiter(コンマ)
                .setEnclosure(ダブル引用符)
                .setEncode(Encode.SJIS)
                .setNewLine(NewLine.CRLF)
                .hasHeader(true)
                .build();
    }

    @Override
    protected void keyBreakProcess(KogakuGassanJikofutangakuShomeishoDateEntity entity) {
    }

    @Override
    protected void usualProcess(KogakuGassanJikofutangakuShomeishoDateEntity entity) {
        連番 = 連番 + 1;
        KogakuGassanJikofutangakuShomeishoDateEntity beforeEntity = getBefore();
        if (null == beforeEntity) {
            csvWriter.writeLine(service.toヘッダのデータ(entity, parameter, 連番));
        } else {
            連番_NO = 連番_NO + 1;
            KogakuGassanJikofutangakuShomeiReport report = new KogakuGassanJikofutangakuShomeiReport(parameter.get処理年月(),
                    beforeEntity, 並び順の１件目, 並び順の２件目,
                    並び順の３件目, 並び順の４件目, 並び順の５件目, 改頁項目リスト, new YMDHMS(parameter.getシステム日付()), 連番_NO);
            report.writeBy(reportSourceWriter);
            csvWriter.writeLine(service.to明細項目(entity, 連番));
        }

        lastEntity = entity;
        if (null != entity.get被保険者_識別コード() && !entity.get被保険者_識別コード().isEmpty()
                && !識別コードset.contains(new ShikibetsuCode(entity.get被保険者_識別コード()))) {
            識別コードset.add(new ShikibetsuCode(entity.get被保険者_識別コード()));
            personalDataList.add(getPersonalData(entity));
        }
    }

    @Override
    protected void afterExecute() {

        if (null != lastEntity) {
            連番_NO = 連番_NO + 1;
            KogakuGassanJikofutangakuShomeiReport report = new KogakuGassanJikofutangakuShomeiReport(parameter.get処理年月(),
                    lastEntity, 並び順の１件目, 並び順の２件目,
                    並び順の３件目, 並び順の４件目, 並び順の５件目, 改頁項目リスト, new YMDHMS(parameter.getシステム日付()), 連番_NO);
            report.writeBy(reportSourceWriter);
        }
        if (null != personalDataList && !personalDataList.isEmpty()) {
            AccessLogUUID log = AccessLogger.logEUC(UzUDE0835SpoolOutputType.EucOther, personalDataList);
            manager.spool(eucFilePath, log);
        } else {
            manager.spool(eucFilePath);
        }
        batchReportWriter.close();
    }

    private PersonalData getPersonalData(KogakuGassanJikofutangakuShomeishoDateEntity entity) {
        ExpandedInformation expandedInformations
                = new ExpandedInformation(new Code(CODE), 被保険者番号, getColumnValue(new HihokenshaNo(entity.get被保険者_登録被保険者番号())));
        return PersonalData.of(new ShikibetsuCode(entity.get被保険者_識別コード()), expandedInformations);
    }

    private RString getColumnValue(IDbColumnMappable entity) {
        if (null != entity) {
            return entity.getColumnValue();
        }
        return RString.EMPTY;
    }

    private IOutputOrder get並び順() {

        IChohyoShutsuryokujunFinder finder = ChohyoShutsuryokujunFinderFactory.createInstance();
        IOutputOrder order = finder.get出力順(parameter.getサブ業務コード(), parameter.get帳票ID(),
                parameter.get出力順ID());
        return order;
    }

    private RString get出力順() {
        RString syuturyokuJun = MyBatisOrderByClauseCreator
                .create(KogakuGassanJikofutangakuShomeiProperty.DBC200034_GassanJikofutangakuShomeishoTorikomiIchiran.class, 並び順);
        if (RString.isNullOrEmpty(syuturyokuJun)) {
            syuturyokuJun = デフォルト出力順;
        } else {
            List<RString> 出力順BODY = syuturyokuJun.split(コンマ.toString());
            syuturyokuJun = デフォルト出力順;
            if (出力順BODY.size() > 1) {
                for (int i = 1; i < 出力順BODY.size(); i++) {
                    syuturyokuJun = syuturyokuJun.concat(コンマ).concat(出力順BODY.get(i));
                }
            }
        }
        return syuturyokuJun;
    }

}