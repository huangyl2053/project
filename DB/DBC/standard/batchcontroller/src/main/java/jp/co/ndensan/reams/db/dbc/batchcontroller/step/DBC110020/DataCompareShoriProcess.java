/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC110020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbc.business.report.dbc200010.JukyushaIdorenrakuhyoSofuTaishoshachiranReport;
import jp.co.ndensan.reams.db.dbc.business.report.dbc200074.JukyushaIdoRirekiTeiseiIchiranReport;
import jp.co.ndensan.reams.db.dbc.definition.core.jukyushaido.JukyushaIF_IdoKubunCode;
import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.db.dbc.entity.csv.dbc110020.DataCompareShoriCsvEntity;
import jp.co.ndensan.reams.db.dbc.entity.csv.dbc110020.JukyushaIdoRenrakuhyoOutFlowEntity;
import jp.co.ndensan.reams.db.dbc.entity.csv.dbc110020.JukyushaIdorenrakuhyoSofuCsvEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3001JukyushaIdoRenrakuhyoEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc200010.JukyushaIdorenrakuhyoSofuTaishoshachiranEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc200074.JukyushaIdoRirekiTeiseiIchiranEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushaidorenrakuhyo.JukyushaIdoRenrakuhyoCsvEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushaidorenrakuhyoout.DataCompareShoriEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushaidorenrakuhyoout.IdoTblTmpEntity;
import jp.co.ndensan.reams.db.dbc.entity.report.dbc200010.JukyushaIdorenrakuhyoSofuTaishoshachiranSource;
import jp.co.ndensan.reams.db.dbc.entity.report.dbc200074.JukyushaIdoRirekiTeiseiIchiranSource;
import jp.co.ndensan.reams.db.dbc.service.core.jukyushaidorenrakuhyo.JukyushaIdoRenrakuhyoCsvManager;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.core.YokaigoJotaiKubunSupport;
import jp.co.ndensan.reams.db.dbz.service.core.koikishichosonjoho.KoikiShichosonJohoFinder;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchKeyBreakBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchPermanentTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.batch.process.OutputParameter;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.euc.definition.UzUDE0831EucAccesslogFileType;
import jp.co.ndensan.reams.uz.uza.euc.io.EucEntityId;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvWriter;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.RTime;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.spool.FileSpoolManager;
import jp.co.ndensan.reams.uz.uza.spool.entities.UzUDE0835SpoolOutputType;
import jp.co.ndensan.reams.uz.uza.ui.binding.propertyenum.DisplayTimeFormat;

/**
 * データ比較処理を実行する。
 *
 * @reamsid_L DBC-2720-070 chenhui
 */
public class DataCompareShoriProcess extends BatchKeyBreakBase<DataCompareShoriEntity> {

    private static final RString READ_DATA_ID = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate."
            + "jukyushaidorenrakuhyoout.IJukyushaIdoRenrakuhyoOutMapper.select比較処理データ");
    private static final RString CSV_FILENAME = new RString("JukyusyaIdouJohoRirekilist.csv");
    private static final RString CSV_FILENAME_DBC200010 = new RString("JukyusyaIdouJohoSofuTaisyosyaList.csv");
    private static final EucEntityId EUC_ENTITY_ID_DBC200074 = new EucEntityId("DBC200074");
    private static final EucEntityId EUC_ENTITY_ID_DBC200010 = new EucEntityId("DBC200010");
    private static final int COUNT_0 = 0;
    private static final int COUNT_1 = 1;
    private static final int COUNT_2 = 2;
    private static final int COUNT_3 = 3;
    private static final int COUNT_4 = 4;
    private static final int COUNT_5 = 5;
    private static final int COUNT_6 = 6;
    private static final int COUNT_7 = 7;
    private static final int COUNT_8 = 8;
    private static final int COUNT_9 = 9;
    private static final RString EUC_WRITER_DELIMITER = new RString(",");
    private static final RString EUC_WRITER_ENCLOSURE = new RString("\"");
    private static final RString 証保険番号 = new RString("証保険番号");
    private static final RString 資格取得日 = new RString("資格取得日");
    private static final RString 資格喪失日 = new RString("資格喪失日");
    private static final RString 変更申請中 = new RString("変更申請中");
    private static final RString 申請年月日 = new RString("申請年月日");
    private static final RString みなし区分 = new RString("みなし区分");
    private static final RString 要介護度 = new RString("要介護度");
    private static final RString 認定開始日 = new RString("認定開始日");
    private static final RString 認定終了日 = new RString("認定終了日");
    private static final RString 計作成区分 = new RString("計作成区分");
    private static final RString 計画事業所 = new RString("計画事業所");
    private static final RString サ計適用日 = new RString("サ計適用日");
    private static final RString サ計終了日 = new RString("サ計終了日");
    private static final RString 訪問限度額 = new RString("訪問限度額");
    private static final RString 訪問開始日 = new RString("訪問開始日");
    private static final RString 訪問終了日 = new RString("訪問終了日");
    private static final RString 短期基準額 = new RString("短期基準額");
    private static final RString 短期開始日 = new RString("短期開始日");
    private static final RString 短期終了日 = new RString("短期終了日");
    private static final RString 公費上有無 = new RString("公費上有無");
    private static final RString 償還開始日 = new RString("償還開始日");
    private static final RString 償還終了日 = new RString("償還終了日");
    private static final RString 引下開始日 = new RString("引下開始日");
    private static final RString 引下終了日 = new RString("引下終了日");
    private static final RString 減免申請中 = new RString("減免申請中");
    private static final RString 利減免区分 = new RString("利減免区分");
    private static final RString 利給付率 = new RString("利給付率");
    private static final RString 利減開始日 = new RString("利減開始日");
    private static final RString 利減終了日 = new RString("利減終了日");
    private static final RString 標減額区分 = new RString("標減額区分");
    private static final RString 標準負担額 = new RString("標準負担額");
    private static final RString 標減開始日 = new RString("標減開始日");
    private static final RString 標負終了日 = new RString("標負終了日");
    private static final RString 特申請中 = new RString("特申請中");
    private static final RString 特サ区分 = new RString("特サ区分");
    private static final RString 特措置対象 = new RString("特措置対象");
    private static final RString 特食事額 = new RString("特食事額");
    private static final RString 特ユ個室 = new RString("特ユ個室");
    private static final RString 特ユ準個室 = new RString("特ユ準個室");
    private static final RString 特従来特養 = new RString("特従来特養");
    private static final RString 特従来老健 = new RString("特従来老健");
    private static final RString 特多床室 = new RString("特多床室");
    private static final RString 特定適用日 = new RString("特定適用日");
    private static final RString 特定終了日 = new RString("特定終了日");
    private static final RString 社福軽減率 = new RString("社福軽減率");
    private static final RString 社福適用日 = new RString("社福適用日");
    private static final RString 社福終了日 = new RString("社福終了日");
    private static final RString 予事業区分 = new RString("予事業区分");
    private static final RString 予事業開始 = new RString("予事業開始");
    private static final RString 予事業終了 = new RString("予事業終了");
    private static final RString 住特対象者 = new RString("住特対象者");
    private static final RString 住特保険者 = new RString("住特保険者");
    private static final RString 住特開始日 = new RString("住特開始日");
    private static final RString 住特終了日 = new RString("住特終了日");
    private static final RString 二割開始日 = new RString("二割開始日");
    private static final RString 二割終了日 = new RString("二割終了日");
    private static final RString 記号 = new RString("*");
    private static final RString エラーあり = new RString("1");
    private static final RString RST_0 = new RString("0");
    private static final RString RST_1 = new RString("1");
    private static final RString RST_2 = new RString("2");
    private static final RString RST_3 = new RString("3");
    private static final RString RST_SPACE = new RString("　");
    private static final RString RST_TRUE = new RString("TRUE");
    private static final RString RST_FALSE = new RString("FALSE");
    private int 異動連絡票件数;
    private int 訂正連絡票件数;

    /**
     * returnEntity
     */
    public static final RString PARAMETER_OUT_RETURNENTITY;
    private OutputParameter<JukyushaIdoRenrakuhyoOutFlowEntity> returnEntity;

    private RString eucFilePath_DBC200074;
    private RString eucFilePath_DBC200010;
    private BatchReportWriter<JukyushaIdoRirekiTeiseiIchiranSource> batchReportWriter_DBC200074;
    private ReportSourceWriter<JukyushaIdoRirekiTeiseiIchiranSource> reportSourceWriter_DBC200074;

    private BatchReportWriter<JukyushaIdorenrakuhyoSofuTaishoshachiranSource> batchReportWriter_DBC200010;
    private ReportSourceWriter<JukyushaIdorenrakuhyoSofuTaishoshachiranSource> reportSourceWriter_DBC200010;
    Map<HihokenshaNo, List<IdoTblTmpEntity>> 異動一時2Map;
    Map<HihokenshaNo, List<DbT3001JukyushaIdoRenrakuhyoEntity>> 受給者異動送付Map;
    List<HihokenshaNo> 被保険者番号List;
    private RString 市町村コード = RString.EMPTY;
    private RString 市町村名称 = RString.EMPTY;
    private RString 作成年月日 = RString.EMPTY;
    private FileSpoolManager spoolManager_DBC200074;
    private CsvWriter csvWriter_DBC200074;
    private FileSpoolManager spoolManager_DBC200010;
    private CsvWriter csvWriter_DBC200010;
    private List<JukyushaIdoRenrakuhyoCsvEntity> entityList;
    @BatchWriter
    BatchPermanentTableWriter<DbT3001JukyushaIdoRenrakuhyoEntity> dbT3001TableWriter;

    static {
        PARAMETER_OUT_RETURNENTITY = new RString("returnEntity");
    }

    @Override
    protected void initialize() {
        異動連絡票件数 = 0;
        訂正連絡票件数 = 0;
        市町村コード = AssociationFinderFactory.createInstance().getAssociation().get地方公共団体コード().value();
        市町村名称 = KoikiShichosonJohoFinder.createInstance().koseiShichosonJoho().records().get(COUNT_0).get市町村名称();
        RDateTime sysDate = RDate.getNowDateTime();
        RString 年月日 = sysDate.getDate().seireki().separator(Separator.SLASH).fillType(FillType.BLANK).toDateString();
        RTime 時刻 = sysDate.getTime();
        作成年月日 = 年月日.concat(RString.HALF_SPACE).concat(時刻.toFormattedTimeString(DisplayTimeFormat.HH_mm_ss));
        異動一時2Map = new HashMap<>();
        受給者異動送付Map = new HashMap<>();
        被保険者番号List = new ArrayList<>();
        entityList = new ArrayList<>();
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(READ_DATA_ID);
    }

    @Override
    protected void createWriter() {
        batchReportWriter_DBC200074 = BatchReportFactory.createBatchReportWriter(ReportIdDBC.DBC200074.getReportId().value()).create();
        reportSourceWriter_DBC200074 = new ReportSourceWriter<>(batchReportWriter_DBC200074);

        batchReportWriter_DBC200010 = BatchReportFactory.createBatchReportWriter(ReportIdDBC.DBC200010.getReportId().value()).create();
        reportSourceWriter_DBC200010 = new ReportSourceWriter<>(batchReportWriter_DBC200010);
        spoolManager_DBC200074 = new FileSpoolManager(UzUDE0835SpoolOutputType.EucOther, EUC_ENTITY_ID_DBC200074,
                UzUDE0831EucAccesslogFileType.Csv);
        eucFilePath_DBC200074 = Path.combinePath(spoolManager_DBC200074.getEucOutputDirectry(),
                CSV_FILENAME);
        csvWriter_DBC200074 = new CsvWriter.InstanceBuilder(eucFilePath_DBC200074).setNewLine(NewLine.CRLF)
                .setDelimiter(EUC_WRITER_DELIMITER)
                .setEnclosure(EUC_WRITER_ENCLOSURE)
                .setEncode(Encode.UTF_8withBOM)
                .hasHeader(true)
                //                .setHeader(getHeaderList())
                .build();

        spoolManager_DBC200010 = new FileSpoolManager(UzUDE0835SpoolOutputType.EucOther, EUC_ENTITY_ID_DBC200010,
                UzUDE0831EucAccesslogFileType.Csv);
        eucFilePath_DBC200010 = Path.combinePath(spoolManager_DBC200010.getEucOutputDirectry(),
                CSV_FILENAME_DBC200010);
        csvWriter_DBC200010 = new CsvWriter.InstanceBuilder(eucFilePath_DBC200010).setNewLine(NewLine.CRLF)
                .setDelimiter(EUC_WRITER_DELIMITER)
                .setEnclosure(EUC_WRITER_ENCLOSURE)
                .setEncode(Encode.UTF_8withBOM)
                .hasHeader(true)
                //                .setHeader(getHeaderList())
                .build();
        this.dbT3001TableWriter = new BatchPermanentTableWriter<>(DbT3001JukyushaIdoRenrakuhyoEntity.class);
    }

    @Override
    protected void keyBreakProcess(DataCompareShoriEntity entity) {
    }

    @Override
    protected void usualProcess(DataCompareShoriEntity entity) {
        IdoTblTmpEntity 異動一時2entity = entity.get異動一時2();
        DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付 = entity.get受給者異動送付();
        if (異動一時2entity == null || 異動一時2entity.get被保険者番号() == null) {
            国保連受給者異動情報履歴削除(受給者異動送付);
        } else if (受給者異動送付 == null || 受給者異動送付.getHiHokenshaNo() == null) {
            受給者異動連絡票Entity出力処理(異動一時2entity);
        } else if (!エラーあり.equals(異動一時2entity.getエラーフラグ())) {
            HihokenshaNo 被保険者番号 = 異動一時2entity.get被保険者番号();
            被保険者番号List.add(被保険者番号);
            List<IdoTblTmpEntity> 異動一時2List = 異動一時2Map.get(被保険者番号);
            if (異動一時2List == null) {
                異動一時2List = new ArrayList<>();
                異動一時2Map.put(被保険者番号, 異動一時2List);
            }
            異動一時2List.add(異動一時2entity);
            List<DbT3001JukyushaIdoRenrakuhyoEntity> 受給者異動送付List = 受給者異動送付Map.get(被保険者番号);
            if (受給者異動送付List == null) {
                受給者異動送付List = new ArrayList<>();
                受給者異動送付Map.put(被保険者番号, 受給者異動送付List);
            }
            受給者異動送付List.add(受給者異動送付);
            国保連受給者異動情報履歴訂正(異動一時2entity, 受給者異動送付);
        }
//        csvListWriter.writeLine(getBodyList(entity.get異動一時2()));
    }

    @Override
    protected void afterExecute() {
        被保険者番号マッチング();
        JukyushaIdoRenrakuhyoCsvManager manager = JukyushaIdoRenrakuhyoCsvManager.createInstance();
        manager.csvの出力(entityList);
        csvWriter_DBC200074.close();
        spoolManager_DBC200074.spool(SubGyomuCode.DBC介護給付, eucFilePath_DBC200074);
        csvWriter_DBC200010.close();
        spoolManager_DBC200010.spool(SubGyomuCode.DBC介護給付, eucFilePath_DBC200010);
        returnEntity = new OutputParameter<>();
        JukyushaIdoRenrakuhyoOutFlowEntity flowEntity = new JukyushaIdoRenrakuhyoOutFlowEntity();
        flowEntity.set異動連絡票件数(異動連絡票件数);
        flowEntity.set訂正連絡票件数(訂正連絡票件数);
        returnEntity.setValue(flowEntity);
    }

    private void 受給者異動連絡票Entity出力処理(IdoTblTmpEntity 異動一時2entity) {
        if (異動一時2entity == null) {
            return;
        }
        if (エラーあり.equals(異動一時2entity.getエラーフラグ())) {
            return;
        }
        JukyushaIdoRenrakuhyoCsvEntity csventity = new JukyushaIdoRenrakuhyoCsvEntity();
        csventity.set被保険者番号(異動一時2entity.get被保険者番号());
        csventity.set異動年月日(異動一時2entity.get異動年月日());
        csventity.set履歴番号(異動一時2entity.get履歴番号());
        csventity.set異動区分(異動一時2entity.get異動区分コード());
        csventity.set異動事由(異動一時2entity.get受給者異動事由());
        csventity.set証記載保険者番号(異動一時2entity.get証記載保険者番号());
        csventity.set被保険者氏名カナ(異動一時2entity.get被保険者氏名カナ());
        csventity.set生年月日(異動一時2entity.get生年月日());
        csventity.set性別(異動一時2entity.get性別コード());
        csventity.set資格取得年月日(異動一時2entity.get資格取得年月日());
        csventity.set資格喪失年月日(異動一時2entity.get資格喪失年月日());
        csventity.set老人保健市町村番号(異動一時2entity.get老人保健市町村番号());
        csventity.set老人保健受給者番号(異動一時2entity.get老人保健受給者番号());
        csventity.set公費負担者番号(異動一時2entity.get公費負担者番号());
        csventity.set広域保険者番号(異動一時2entity.get広域連合_政令市_保険者番号());
        csventity.set申請種別(異動一時2entity.get申請種別コード());
        csventity.set変更申請中区分(異動一時2entity.get変更申請中区分コード());
        csventity.set申請年月日(異動一時2entity.get申請年月日());
        csventity.setみなし区分(異動一時2entity.getみなし要介護状態区分コード());
        csventity.set要介護状態区分(異動一時2entity.get要介護状態区分コード());
        csventity.set有効期間開始年月日(異動一時2entity.get認定有効期間開始年月日());
        csventity.set有効期間終了年月日(new FlexibleDate(異動一時2entity.get認定有効期間終了年月日()));
        csventity.set計画作成区分(異動一時2entity.get居宅サービス計画作成区分コード());
        csventity.set居宅支援事業所番号(異動一時2entity.get居宅介護支援事業所番号());
        csventity.set居宅適用開始年月日(new FlexibleDate(異動一時2entity.get居宅サービス計画適用開始年月日()));
        csventity.set居宅適用終了年月日(new FlexibleDate(異動一時2entity.get居宅サービス計画適用終了年月日()));
        csventity.set支給限度基準額1(異動一時2entity.get訪問通所サービス支給限度基準額());
        csventity.set上限管理適用開始年月日1(異動一時2entity.get訪問通所サービス上限管理適用期間開始年月日());
        csventity.set上限管理適用終了年月日1(new FlexibleDate(異動一時2entity.get訪問通所サービス上限管理適用期間終了年月日()));
        csventity.set支給限度基準額2(異動一時2entity.get短期入所サービス支給限度基準額());
        csventity.set上限管理適用開始年月日2(異動一時2entity.get短期入所サービス上限管理適用期間開始年月日());
        csventity.set上限管理適用終了年月日2(異動一時2entity.get短期入所サービス上限管理適用期間終了年月日());
        csventity.set公費負担上限額減額の有無(異動一時2entity.is公費負担上限額減額有フラグ() ? RST_1 : RST_0);
        csventity.set償還払化適用開始年月日(new FlexibleDate(異動一時2entity.get償還払化開始年月日()));
        csventity.set償還払化適用終了年月日(new FlexibleDate(異動一時2entity.get償還払化終了年月日()));
        csventity.set給付率引下げ適用開始年月日(new FlexibleDate(異動一時2entity.get給付率引下げ開始年月日()));
        csventity.set給付率引下げ適用終了年月日(new FlexibleDate(異動一時2entity.get給付率引下げ終了年月日()));
        csventity.set減免申請中区分(異動一時2entity.get減免申請中区分コード());
        csventity.set利用者負担区分(異動一時2entity.get利用者負担区分コード());
        csventity.set利用給付率(異動一時2entity.get給付率());
        csventity.set利用適用開始年月日(new FlexibleDate(異動一時2entity.get適用開始年月日()));
        csventity.set利用適用終了年月日(new FlexibleDate(異動一時2entity.get適用終了年月日()));
        csventity.set標準負担区分(異動一時2entity.get標準負担区分コード());
        csventity.set標準負担額(異動一時2entity.get負担額());
        csventity.set標準適用開始年月日(new FlexibleDate(異動一時2entity.get負担額適用開始年月日()));
        csventity.set標準適用終了年月日(new FlexibleDate(異動一時2entity.get負担額適用終了年月日()));
        csventity.set認定申請中区分(異動一時2entity.get特定入所者認定申請中区分コード());
        csventity.setサービス区分(異動一時2entity.get特定入所者介護サービス区分コード());
        csventity.set特例減額措置対象(異動一時2entity.get課税層の特例減額措置対象フラグ());
        csventity.set食費負担限度額(異動一時2entity.get食費負担限度額());
        csventity.setユニット型個室(異動一時2entity.get居住費ユニット型個室負担限度額());
        csventity.setユニット型準個室(異動一時2entity.get居住費ユニット型準個室負担限度額());
        csventity.set従来型個室特(異動一時2entity.get居住費従来型個室特養等負担限度額());
        csventity.set従来型個室老療(異動一時2entity.get居住費従来型個室老健療養等負担限度額());
        csventity.set多床室(異動一時2entity.get居住費多床室負担限度額());
        csventity.set特定入所者適用開始年月日(new FlexibleDate(異動一時2entity.get負担限度額適用開始年月日()));
        csventity.set特定入所者適用終了年月日(new FlexibleDate(異動一時2entity.get負担限度額適用終了年月日()));
        csventity.set軽減率(異動一時2entity.get軽減率());
        csventity.set軽減率適用開始年月日(new FlexibleDate(異動一時2entity.get軽減率適用開始年月日()));
        csventity.set軽減率適用終了年月日(new FlexibleDate(異動一時2entity.get軽減率適用終了年月日()));
        csventity.set小規模居宅ｻｰﾋﾞｽ利用(異動一時2entity.is小多機能居宅介護利用開始月利用有フラグ() ? RST_1 : RST_2);
        csventity.set後期高齢保険者番号(異動一時2entity.get後期高齢者医療保険者番号());
        csventity.set後期高齢被保険者番号(異動一時2entity.get後期高齢者医療被保険者番号());
        csventity.set国保保険者番号(異動一時2entity.get国民健康保険保険者番号());
        csventity.set国保被保険者証番号(異動一時2entity.get国民健康保険被保険者証番号());
        csventity.set国保個人番号(異動一時2entity.get国民健康保険個人番号());
        csventity.set二次予防事業区分(異動一時2entity.get二次予防事業区分コード());
        csventity.set二次予防有効期間開始年月日(異動一時2entity.get二次予防事業有効期間開始年月日());
        csventity.set二次予防有効期間終了年月日(異動一時2entity.get二次予防事業有効期間終了年月日());
        csventity.set訂正連絡票フラグ(異動一時2entity.is訂正連絡票フラグ());
        csventity.set送付年月(異動一時2entity.get送付年月());
        csventity.set住特対象者区分(異動一時2entity.get住所地特例対象者区分コード());
        csventity.set住特施設所在保険者番号(異動一時2entity.get施設所在保険者番号());
        csventity.set住特適用開始年月日(new FlexibleDate(異動一時2entity.get住所地特例適用開始日()));
        csventity.set住特適用終了年月日(new FlexibleDate(異動一時2entity.get住所地特例適用終了日()));
        csventity.set新１(異動一時2entity.get居宅費_新１_負担限度額());
        csventity.set新２(異動一時2entity.get居宅費_新２_負担限度額());
        csventity.set新３(異動一時2entity.get居宅費_新３_負担限度額());
        csventity.set二割負担適用開始年月日(new FlexibleDate(異動一時2entity.get利用者負担割合有効開始日()));
        csventity.set二割負担適用終了年月日(new FlexibleDate(異動一時2entity.get利用者負担割合有効終了日()));
        csventity.set訂正区分コード(異動一時2entity.get訂正区分コード());
        csventity.set訂正年月日(異動一時2entity.get訂正年月日());
        csventity.set論理削除フラグ(異動一時2entity.is論理削除フラグ());
        entityList.add(csventity);
        this.dbT3001TableWriter.insert(異動一時2entity.copyTo3001Entity());
    }

    private void 国保連受給者異動情報履歴削除(DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付) {
        if (受給者異動送付 == null || 受給者異動送付.getHiHokenshaNo() == null) {
            return;
        }
        JukyushaIdoRirekiTeiseiIchiranEntity 履歴訂正Entity = new JukyushaIdoRirekiTeiseiIchiranEntity();
        if (受給者異動送付.getHiHokenshaNo() != null) {
            履歴訂正Entity.set被保険者番号(受給者異動送付.getHiHokenshaNo().value());
        }
        履歴訂正Entity.set被保険者氏名(受給者異動送付.getHiHokenshaNameKana());
        履歴訂正Entity.set異動年月日(受給者異動送付.getIdoYMD());
        履歴訂正Entity.set訂正情報の項目名1(証保険番号);
        履歴訂正Entity.set訂正情報の項目名2(資格取得日);
        履歴訂正Entity.set訂正情報の項目名3(資格喪失日);
        履歴訂正Entity.set訂正情報の項目名4(変更申請中);
        履歴訂正Entity.set訂正情報の項目名5(申請年月日);
        履歴訂正Entity.set訂正情報の項目名6(みなし区分);
        履歴訂正Entity.set訂正情報の項目名7(要介護度);
        履歴訂正Entity.set訂正情報の項目名8(認定開始日);
        履歴訂正Entity.set訂正情報の項目名9(認定終了日);
        履歴訂正Entity.set訂正情報の項目名10(計作成区分);
        履歴訂正Entity.set送付済内容1(受給者異動送付.getShoKisaiHokenshaNo().value());
        履歴訂正Entity.set送付済内容2(new RString(受給者異動送付.getShikakuShutokuYMD().toString()));
        if (受給者異動送付.getShikakuSoshitsuYMD() != null) {
            履歴訂正Entity.set送付済内容3(new RString(受給者異動送付.getShikakuSoshitsuYMD().toString()));
        }
        if (受給者異動送付.getHenkoShinseichuKubunCode() != null) {
            履歴訂正Entity.set送付済内容4(new RString(受給者異動送付.getHenkoShinseichuKubunCode().toString()));
        }
        if (受給者異動送付.getShinseiYMD() != null) {
            履歴訂正Entity.set送付済内容5(new RString(受給者異動送付.getShinseiYMD().toString()));
        }
        履歴訂正Entity.set送付済内容6(受給者異動送付.getMinashiYokaigoJotaiKubunCode());
        履歴訂正Entity.set送付済内容7(受給者異動送付.getYokaigoJotaiKubunCode());
        if (受給者異動送付.getNinteiYukoKikankaishiYMD() != null) {
            履歴訂正Entity.set送付済内容8(new RString(受給者異動送付.getNinteiYukoKikankaishiYMD().toString()));
        }
        履歴訂正Entity.set送付済内容9(受給者異動送付.getNinteiYukoKikanShuryoYMD());
        履歴訂正Entity.set送付済内容10(受給者異動送付.getKyotakuServiceSakuseiKubunCode());
        履歴訂正Entity.set訂正内容1(記号);
        履歴訂正Entity.set訂正内容2(記号);
        履歴訂正Entity.set訂正内容3(記号);
        履歴訂正Entity.set訂正内容4(記号);
        履歴訂正Entity.set訂正内容5(記号);
        履歴訂正Entity.set訂正内容6(記号);
        履歴訂正Entity.set訂正内容7(記号);
        履歴訂正Entity.set訂正内容8(記号);
        履歴訂正Entity.set訂正内容9(記号);
        履歴訂正Entity.set訂正内容10(記号);
        csvWriter_DBC200074.writeLine(to明細項目(履歴訂正Entity));
        異動連絡票件数++;
        JukyushaIdoRirekiTeiseiIchiranReport report
                = new JukyushaIdoRirekiTeiseiIchiranReport(履歴訂正Entity, 市町村コード, 市町村名称);
        report.writeBy(reportSourceWriter_DBC200074);
    }

    private void 国保連受給者異動情報履歴訂正(IdoTblTmpEntity 異動一時2entity, DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付) {

        JukyushaIdoRirekiTeiseiIchiranEntity 履歴訂正Entity = new JukyushaIdoRirekiTeiseiIchiranEntity();
        if (受給者異動送付.getHiHokenshaNo() != null) {
            履歴訂正Entity.set被保険者番号(受給者異動送付.getHiHokenshaNo().value());
        }
        履歴訂正Entity.set被保険者氏名(受給者異動送付.getHiHokenshaNameKana());
        履歴訂正Entity.set異動年月日(受給者異動送付.getIdoYMD());
        List<List<RString>> 違う項目 = get違う項目(異動一時2entity, 受給者異動送付);
        if (違う項目.size() > 0) {
            List<RString> 違う項目1 = 違う項目.get(COUNT_0);
            履歴訂正Entity.set訂正情報の項目名1(違う項目1.get(COUNT_0));
            履歴訂正Entity.set送付済内容1(違う項目1.get(COUNT_1));
            履歴訂正Entity.set訂正内容1(違う項目1.get(COUNT_2));
        }

        if (違う項目.size() > COUNT_1) {
            List<RString> 違う項目2 = 違う項目.get(COUNT_1);
            履歴訂正Entity.set訂正情報の項目名2(違う項目2.get(COUNT_0));
            履歴訂正Entity.set送付済内容2(違う項目2.get(COUNT_1));
            履歴訂正Entity.set訂正内容2(違う項目2.get(COUNT_2));
        }
        if (違う項目.size() > COUNT_2) {
            List<RString> 違う項目3 = 違う項目.get(COUNT_2);
            履歴訂正Entity.set訂正情報の項目名3(違う項目3.get(COUNT_0));
            履歴訂正Entity.set送付済内容3(違う項目3.get(COUNT_1));
            履歴訂正Entity.set訂正内容3(違う項目3.get(COUNT_2));
        }
        if (違う項目.size() > COUNT_3) {
            List<RString> 違う項目4 = 違う項目.get(COUNT_3);
            履歴訂正Entity.set訂正情報の項目名4(違う項目4.get(COUNT_0));
            履歴訂正Entity.set送付済内容4(違う項目4.get(COUNT_1));
            履歴訂正Entity.set訂正内容4(違う項目4.get(COUNT_2));
        }
        if (違う項目.size() > COUNT_4) {
            List<RString> 違う項目5 = 違う項目.get(COUNT_4);
            履歴訂正Entity.set訂正情報の項目名5(違う項目5.get(COUNT_0));
            履歴訂正Entity.set送付済内容5(違う項目5.get(COUNT_1));
            履歴訂正Entity.set訂正内容5(違う項目5.get(COUNT_2));
        }
        if (違う項目.size() > COUNT_5) {
            List<RString> 違う項目6 = 違う項目.get(COUNT_5);
            履歴訂正Entity.set訂正情報の項目名6(違う項目6.get(COUNT_0));
            履歴訂正Entity.set送付済内容6(違う項目6.get(COUNT_1));
            履歴訂正Entity.set訂正内容6(違う項目6.get(COUNT_2));
        }
        if (違う項目.size() > COUNT_6) {
            List<RString> 違う項目7 = 違う項目.get(COUNT_6);
            履歴訂正Entity.set訂正情報の項目名7(違う項目7.get(COUNT_0));
            履歴訂正Entity.set送付済内容7(違う項目7.get(COUNT_1));
            履歴訂正Entity.set訂正内容7(違う項目7.get(COUNT_2));
        }
        if (違う項目.size() > COUNT_7) {
            List<RString> 違う項目8 = 違う項目.get(COUNT_7);
            履歴訂正Entity.set訂正情報の項目名8(違う項目8.get(COUNT_0));
            履歴訂正Entity.set送付済内容8(違う項目8.get(COUNT_1));
            履歴訂正Entity.set訂正内容8(違う項目8.get(COUNT_2));
        }
        if (違う項目.size() > COUNT_8) {
            List<RString> 違う項目9 = 違う項目.get(COUNT_8);
            履歴訂正Entity.set訂正情報の項目名9(違う項目9.get(COUNT_0));
            履歴訂正Entity.set送付済内容9(違う項目9.get(COUNT_1));
            履歴訂正Entity.set訂正内容9(違う項目9.get(COUNT_2));
        }
        if (違う項目.size() > COUNT_9) {
            List<RString> 違う項目10 = 違う項目.get(COUNT_9);
            履歴訂正Entity.set訂正情報の項目名10(違う項目10.get(COUNT_0));
            履歴訂正Entity.set送付済内容10(違う項目10.get(COUNT_1));
            履歴訂正Entity.set訂正内容10(違う項目10.get(COUNT_2));
        }
        RString 変更項目 = get変更項目(違う項目);
        csvWriter_DBC200074.writeLine(to明細項目(履歴訂正Entity));
        csvWriter_DBC200010.writeLine(get送付対象者リスト(異動一時2entity, 変更項目));
        異動連絡票件数++;
        訂正連絡票件数++;
        JukyushaIdoRirekiTeiseiIchiranReport report_200074
                = new JukyushaIdoRirekiTeiseiIchiranReport(履歴訂正Entity, 市町村コード, 市町村名称);
        report_200074.writeBy(reportSourceWriter_DBC200074);

        JukyushaIdorenrakuhyoSofuTaishoshachiranEntity 送付対象者
                = get送付対象者(異動一時2entity, 変更項目);
        JukyushaIdorenrakuhyoSofuTaishoshachiranReport report_200010
                = new JukyushaIdorenrakuhyoSofuTaishoshachiranReport(送付対象者, 市町村コード, 市町村名称);
        report_200010.writeBy(reportSourceWriter_DBC200010);
    }

    private JukyushaIdorenrakuhyoSofuTaishoshachiranEntity get送付対象者(IdoTblTmpEntity 異動一時2entity, RString 変更項目) {
        JukyushaIdorenrakuhyoSofuTaishoshachiranEntity 送付対象者 = new JukyushaIdorenrakuhyoSofuTaishoshachiranEntity();
        送付対象者.set被保険者番号(異動一時2entity.get被保険者番号().getColumnValue());
        送付対象者.set氏名(異動一時2entity.get被保険者氏名カナ());
        送付対象者.set区分(JukyushaIF_IdoKubunCode.toValue(異動一時2entity.get異動区分コード()).get名称());
        送付対象者.set異動年月日(異動一時2entity.get異動年月日());
        送付対象者.set要介護度(YokaigoJotaiKubunSupport.toValue(FlexibleDate.getNowDate(),
                異動一時2entity.get要介護状態区分コード()).getName());
        送付対象者.set開始認定日(異動一時2entity.get認定有効期間開始年月日());
        送付対象者.set終了認定日(new FlexibleDate(異動一時2entity.get認定有効期間終了年月日()));
        送付対象者.set変更項目(変更項目);
        return 送付対象者;
    }

    private RString get変更項目(List<List<RString>> 違う項目) {
        RStringBuilder 変更項目 = new RStringBuilder();
        for (List<RString> 違う : 違う項目) {
            変更項目.append(違う.get(COUNT_0));
        }
        return 変更項目.toRString();
    }

    private List get違う項目(IdoTblTmpEntity 異動一時2entity, DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付) {
        List<List<RString>> 違う項目 = new ArrayList<>();
        if (!異動一時2entity.get証記載保険者番号().equals(受給者異動送付.getShoKisaiHokenshaNo())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(証保険番号);
            違う.add(受給者異動送付.getShoKisaiHokenshaNo().getColumnValue());
            違う.add(異動一時2entity.get証記載保険者番号().getColumnValue());
            違う項目.add(違う);
        }
        if (!異動一時2entity.get資格取得年月日().equals(受給者異動送付.getShikakuShutokuYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(資格取得日);
            違う.add(new RString(受給者異動送付.getShikakuShutokuYMD().toString()));
            違う.add(new RString(異動一時2entity.get資格取得年月日().toString()));
            違う項目.add(違う);
        }
        if (!異動一時2entity.get資格喪失年月日().equals(受給者異動送付.getShikakuSoshitsuYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(資格喪失日);
            if (受給者異動送付.getShikakuSoshitsuYMD() != null) {
                違う.add(new RString(受給者異動送付.getShikakuSoshitsuYMD().toString()));
            }
            違う.add(new RString(異動一時2entity.get資格喪失年月日().toString()));
            違う項目.add(違う);
        }
        if (!異動一時2entity.get変更申請中区分コード().equals(受給者異動送付.getHenkoShinseichuKubunCode())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(変更申請中);
            違う.add(受給者異動送付.getHenkoShinseichuKubunCode());
            違う.add(異動一時2entity.get変更申請中区分コード());
            違う項目.add(違う);
        }
        if (!異動一時2entity.get申請年月日().equals(受給者異動送付.getShinseiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(申請年月日);
            if (受給者異動送付.getShinseiYMD() != null) {
                違う.add(new RString(受給者異動送付.getShinseiYMD().toString()));
            }
            if (異動一時2entity.get申請年月日() != null) {
                違う.add(new RString(異動一時2entity.get申請年月日().toString()));
            }
            違う項目.add(違う);
        }
        if (!異動一時2entity.getみなし要介護状態区分コード().equals(受給者異動送付.getMinashiYokaigoJotaiKubunCode())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(みなし区分);
            違う.add(受給者異動送付.getMinashiYokaigoJotaiKubunCode());
            違う.add(異動一時2entity.getみなし要介護状態区分コード());
            違う項目.add(違う);
        }
        if (!異動一時2entity.get要介護状態区分コード().equals(受給者異動送付.getYokaigoJotaiKubunCode())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(要介護度);
            違う.add(受給者異動送付.getYokaigoJotaiKubunCode());
            違う.add(異動一時2entity.get要介護状態区分コード());
            違う項目.add(違う);
        }
        if (!異動一時2entity.get認定有効期間開始年月日().equals(受給者異動送付.getNinteiYukoKikankaishiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(認定開始日);
            違う.add(new RString(受給者異動送付.getNinteiYukoKikankaishiYMD().toString()));
            違う.add(new RString(異動一時2entity.get認定有効期間開始年月日().toString()));
            違う項目.add(違う);
        }
        if (!異動一時2entity.get認定有効期間終了年月日().equals(受給者異動送付.getNinteiYukoKikanShuryoYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(認定終了日);
            違う.add(new RString(受給者異動送付.getNinteiYukoKikanShuryoYMD().toString()));
            違う.add(new RString(異動一時2entity.get認定有効期間終了年月日().toString()));
            違う項目.add(違う);
        }

        if (!異動一時2entity.get居宅サービス計画作成区分コード().equals(受給者異動送付.getKyotakuServiceSakuseiKubunCode())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(計作成区分);
            違う.add(受給者異動送付.getKyotakuServiceSakuseiKubunCode());
            違う.add(異動一時2entity.get居宅サービス計画作成区分コード());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get居宅介護支援事業所番号().equals(受給者異動送付.getKyotakuServiceSakuseiKubunCode())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(計画事業所);
            違う.add(受給者異動送付.getKyotakuKaigoShienJigyoshoNo());
            違う.add(異動一時2entity.get居宅介護支援事業所番号());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get居宅サービス計画適用開始年月日().equals(受給者異動送付.getKyotakuServiceTekiyoKaishiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(サ計適用日);
            違う.add(new RString(受給者異動送付.getKyotakuServiceTekiyoKaishiYMD().toString()));
            違う.add(new RString(異動一時2entity.get居宅サービス計画適用開始年月日().toString()));
            違う項目.add(違う);
        }
        if (!異動一時2entity.get居宅サービス計画適用終了年月日().equals(受給者異動送付.getKyotakuServiceTekiyoShuryoYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(サ計終了日);
            違う.add(new RString(受給者異動送付.getKyotakuServiceTekiyoShuryoYMD().toString()));
            違う.add(new RString(異動一時2entity.get居宅サービス計画適用終了年月日().toString()));
            違う項目.add(違う);
        }

        if (異動一時2entity.get訪問通所サービス支給限度基準額() != 受給者異動送付.getHomonTsushoServiceShikyuGendoKijungaku()) {
            List<RString> 違う = new ArrayList<>();
            違う.add(訪問限度額);
            違う.add(new RString(受給者異動送付.getHomonTsushoServiceShikyuGendoKijungaku()));
            違う.add(new RString(異動一時2entity.get訪問通所サービス支給限度基準額()));
            違う項目.add(違う);
        }

        if (!異動一時2entity.get訪問通所サービス上限管理適用期間開始年月日().equals(
                受給者異動送付.getHomonTsushoServiceJogenKanriTekiyoKaishiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(訪問開始日);
            違う.add(new RString(受給者異動送付.getHomonTsushoServiceJogenKanriTekiyoKaishiYMD().toString()));
            違う.add(new RString(異動一時2entity.get訪問通所サービス上限管理適用期間開始年月日().toString()));
            違う項目.add(違う);
        }
        get違う項目1(異動一時2entity, 受給者異動送付, 違う項目);
        get違う項目2(異動一時2entity, 受給者異動送付, 違う項目);
        get違う項目3(異動一時2entity, 受給者異動送付, 違う項目);
        return 違う項目;
    }

    private void get違う項目1(IdoTblTmpEntity 異動一時2entity, DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付,
            List<List<RString>> 違う項目) {
        if (!異動一時2entity.get訪問通所サービス上限管理適用期間終了年月日().equals(
                受給者異動送付.getHomonTsushoServiceJogenKanriTekiyoShuryoYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(訪問終了日);
            違う.add(new RString(受給者異動送付.getHomonTsushoServiceJogenKanriTekiyoShuryoYMD().toString()));
            違う.add(new RString(異動一時2entity.get訪問通所サービス上限管理適用期間終了年月日().toString()));
            違う項目.add(違う);
        }

        if (異動一時2entity.get短期入所サービス支給限度基準額() != 受給者異動送付.getTankiNyushoServiceShikyuGendoKijungaku()) {
            List<RString> 違う = new ArrayList<>();
            違う.add(短期基準額);
            違う.add(new RString(受給者異動送付.getTankiNyushoServiceShikyuGendoKijungaku()));
            違う.add(new RString(異動一時2entity.get短期入所サービス支給限度基準額()));
            違う項目.add(違う);
        }
        if (!異動一時2entity.get短期入所サービス上限管理適用期間開始年月日().equals(
                受給者異動送付.getTankinyushoServiceJogenKanriTekiyoKaishiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(短期開始日);
            違う.add(new RString(受給者異動送付.getTankinyushoServiceJogenKanriTekiyoKaishiYMD().toString()));
            違う.add(new RString(異動一時2entity.get短期入所サービス上限管理適用期間開始年月日().toString()));
            違う項目.add(違う);
        }

        if (!異動一時2entity.get短期入所サービス上限管理適用期間終了年月日().equals(
                受給者異動送付.getTankinyushoServiceJogenKanriTekiyoShuryoYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(短期終了日);
            違う.add(new RString(受給者異動送付.getTankinyushoServiceJogenKanriTekiyoShuryoYMD().toString()));
            違う.add(new RString(異動一時2entity.get短期入所サービス上限管理適用期間終了年月日().toString()));
            違う項目.add(違う);
        }

        if (異動一時2entity.is公費負担上限額減額有フラグ() != 受給者異動送付.getKohiFutanJogenGengakuAriFlag()) {
            List<RString> 違う = new ArrayList<>();
            違う.add(公費上有無);
            違う.add(受給者異動送付.getKohiFutanJogenGengakuAriFlag() ? RST_TRUE : RST_FALSE);
            違う.add(異動一時2entity.is公費負担上限額減額有フラグ() ? RST_TRUE : RST_FALSE);
            違う項目.add(違う);
        }

        if (!異動一時2entity.get償還払化開始年月日().equals(
                受給者異動送付.getShokanbaraikaKaishiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(償還開始日);
            違う.add(受給者異動送付.getShokanbaraikaKaishiYMD());
            違う.add(異動一時2entity.get償還払化開始年月日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get償還払化終了年月日().equals(
                受給者異動送付.getShokanbaraikaShuryoYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(償還終了日);
            違う.add(受給者異動送付.getShokanbaraikaShuryoYMD());
            違う.add(異動一時2entity.get償還払化終了年月日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get給付率引下げ開始年月日().equals(
                受給者異動送付.getKyufuritsuHikisageKaishiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(引下開始日);
            違う.add(受給者異動送付.getKyufuritsuHikisageKaishiYMD());
            違う.add(異動一時2entity.get給付率引下げ開始年月日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get給付率引下げ終了年月日().equals(
                受給者異動送付.getKyufuritsuHikisageShuryoYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(引下終了日);
            違う.add(受給者異動送付.getKyufuritsuHikisageShuryoYMD());
            違う.add(異動一時2entity.get給付率引下げ終了年月日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get減免申請中区分コード().equals(
                受給者異動送付.getGemmenShinseichuKubunCode())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(減免申請中);
            違う.add(受給者異動送付.getGemmenShinseichuKubunCode());
            違う.add(異動一時2entity.get減免申請中区分コード());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get利用者負担区分コード().equals(
                受給者異動送付.getRiyoshaFutanKubunCode())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(利減免区分);
            違う.add(受給者異動送付.getRiyoshaFutanKubunCode());
            違う.add(異動一時2entity.get利用者負担区分コード());
            違う項目.add(違う);
        }

        if (異動一時2entity.get給付率() != 受給者異動送付.getKyufuritsu()) {
            List<RString> 違う = new ArrayList<>();
            違う.add(利給付率);
            違う.add(new RString(受給者異動送付.getKyufuritsu().toString()));
            違う.add(new RString(異動一時2entity.get給付率().toString()));
            違う項目.add(違う);
        }

        if (!異動一時2entity.get適用開始年月日().equals(
                受給者異動送付.getTekiyoKaishiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(利減開始日);
            違う.add(受給者異動送付.getTekiyoKaishiYMD());
            違う.add(異動一時2entity.get適用開始年月日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get適用終了年月日().equals(
                受給者異動送付.getTekiyoShuryoYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(利減終了日);
            違う.add(受給者異動送付.getTekiyoShuryoYMD());
            違う.add(異動一時2entity.get適用終了年月日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get標準負担区分コード().equals(
                受給者異動送付.getHyojunFutanKubunCode())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(標減額区分);
            違う.add(受給者異動送付.getHyojunFutanKubunCode());
            違う.add(異動一時2entity.get標準負担区分コード());
            違う項目.add(違う);
        }

        if (異動一時2entity.get負担額() != 受給者異動送付.getFutangaku()) {
            List<RString> 違う = new ArrayList<>();
            違う.add(標準負担額);
            違う.add(new RString(受給者異動送付.getFutangaku().toString()));
            違う.add(new RString(異動一時2entity.get負担額().toString()));
            違う項目.add(違う);
        }

    }

    private void get違う項目2(IdoTblTmpEntity 異動一時2entity, DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付,
            List<List<RString>> 違う項目) {
        if (!異動一時2entity.get負担額適用開始年月日().equals(
                受給者異動送付.getFutangakuTekiyoKaishiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(標減開始日);
            違う.add(受給者異動送付.getFutangakuTekiyoKaishiYMD());
            違う.add(異動一時2entity.get負担額適用開始年月日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get負担額適用終了年月日().equals(
                受給者異動送付.getFutangakuTekiyoShuryoYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(標負終了日);
            違う.add(受給者異動送付.getFutangakuTekiyoShuryoYMD());
            違う.add(異動一時2entity.get負担額適用終了年月日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get特定入所者認定申請中区分コード().equals(
                受給者異動送付.getTokuteiNyushoshaNinteiShinseichuKubunCode())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(特申請中);
            違う.add(受給者異動送付.getTokuteiNyushoshaNinteiShinseichuKubunCode());
            違う.add(異動一時2entity.get特定入所者認定申請中区分コード());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get特定入所者介護サービス区分コード().equals(
                受給者異動送付.getTokuteiNyushoshaKaigoServiceKubunCode())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(特サ区分);
            違う.add(受給者異動送付.getTokuteiNyushoshaKaigoServiceKubunCode());
            違う.add(異動一時2entity.get特定入所者介護サービス区分コード());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get課税層の特例減額措置対象フラグ().equals(
                受給者異動送付.getKaizeisoTokureiGengakuSochiTaishoFlag())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(特措置対象);
            違う.add(受給者異動送付.getKaizeisoTokureiGengakuSochiTaishoFlag());
            違う.add(異動一時2entity.get課税層の特例減額措置対象フラグ());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get食費負担限度額().equals(受給者異動送付.getShokuhiFutanGendogaku())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(特食事額);
            違う.add(受給者異動送付.getShokuhiFutanGendogaku());
            違う.add(異動一時2entity.get食費負担限度額());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get居住費ユニット型個室負担限度額().equals(
                受給者異動送付.getKyojuhiUnitGataKoshitsuFutanGendogaku())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(特ユ個室);
            違う.add(受給者異動送付.getKyojuhiUnitGataKoshitsuFutanGendogaku());
            違う.add(異動一時2entity.get居住費ユニット型個室負担限度額());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get居住費ユニット型準個室負担限度額().equals(
                受給者異動送付.getKyojuhiUnitGataJunKoshitsuFutanGendogaku())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(特ユ準個室);
            違う.add(受給者異動送付.getKyojuhiUnitGataJunKoshitsuFutanGendogaku());
            違う.add(異動一時2entity.get居住費ユニット型準個室負担限度額());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get居住費従来型個室特養等負担限度額().equals(
                受給者異動送付.getKyojuhiJuraiGataKoshitsuTokuyoFutanGendogaku())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(特従来特養);
            違う.add(受給者異動送付.getKyojuhiJuraiGataKoshitsuTokuyoFutanGendogaku());
            違う.add(異動一時2entity.get居住費従来型個室特養等負担限度額());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get居住費従来型個室老健療養等負担限度額().equals(
                受給者異動送付.getKyojuhiJuraiGataKoshitsuRokenRyoyoFutanGendogaku())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(特従来老健);
            違う.add(受給者異動送付.getKyojuhiJuraiGataKoshitsuRokenRyoyoFutanGendogaku());
            違う.add(異動一時2entity.get居住費従来型個室老健療養等負担限度額());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get居住費多床室負担限度額().equals(受給者異動送付.getKyujuhiTashoshitsuFutanGendogaku())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(特多床室);
            違う.add(受給者異動送付.getKyujuhiTashoshitsuFutanGendogaku());
            違う.add(異動一時2entity.get居住費多床室負担限度額());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get負担限度額適用開始年月日().equals(
                受給者異動送付.getFutanGendogakuTekiyoKaishiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(特定適用日);
            違う.add(受給者異動送付.getFutanGendogakuTekiyoKaishiYMD());
            違う.add(異動一時2entity.get負担限度額適用開始年月日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get負担限度額適用終了年月日().equals(
                受給者異動送付.getFutanGendogakuTekiyoShuryoYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(特定終了日);
            違う.add(受給者異動送付.getFutanGendogakuTekiyoShuryoYMD());
            違う.add(異動一時2entity.get負担限度額適用終了年月日());
            違う項目.add(違う);
        }

    }

    private void get違う項目3(IdoTblTmpEntity 異動一時2entity, DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付,
            List<List<RString>> 違う項目) {
        if (!異動一時2entity.get軽減率().equals(受給者異動送付.getKeigenritsu())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(社福軽減率);
            違う.add(受給者異動送付.getKeigenritsu());
            違う.add(異動一時2entity.get軽減率());
            違う項目.add(違う);
        }
        if (!異動一時2entity.get軽減率適用開始年月日().equals(
                受給者異動送付.getKeigenritsuTekiyoKaishiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(社福適用日);
            違う.add(受給者異動送付.getKeigenritsuTekiyoKaishiYMD());
            違う.add(異動一時2entity.get軽減率適用開始年月日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get軽減率適用終了年月日().equals(
                受給者異動送付.getKeigenritsuTekiyoShuryoYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(社福終了日);
            違う.add(受給者異動送付.getKeigenritsuTekiyoShuryoYMD());
            違う.add(異動一時2entity.get軽減率適用終了年月日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get二次予防事業区分コード().equals(受給者異動送付.getNijiyoboJigyoKubunCode())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(予事業区分);
            違う.add(受給者異動送付.getNijiyoboJigyoKubunCode());
            違う.add(異動一時2entity.get二次予防事業区分コード());
            違う項目.add(違う);
        }
        if (!異動一時2entity.get二次予防事業有効期間開始年月日().equals(
                受給者異動送付.getNijiyoboJigyoYukoKikanKaishiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(予事業開始);
            違う.add(new RString(受給者異動送付.getNijiyoboJigyoYukoKikanKaishiYMD().toString()));
            違う.add(new RString(異動一時2entity.get二次予防事業有効期間開始年月日().toString()));
            違う項目.add(違う);
        }

        if (!異動一時2entity.get二次予防事業有効期間終了年月日().equals(
                受給者異動送付.getNijiyoboJigyoYukoKikanShuryoYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(予事業終了);
            違う.add(new RString(受給者異動送付.getNijiyoboJigyoYukoKikanShuryoYMD().toString()));
            違う.add(new RString(異動一時2entity.get二次予防事業有効期間終了年月日().toString()));
            違う項目.add(違う);
        }

        if (!異動一時2entity.get住所地特例対象者区分コード().equals(受給者異動送付.getJushochiTokureiTaishoshaKubunCode())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(住特対象者);
            違う.add(受給者異動送付.getJushochiTokureiTaishoshaKubunCode());
            違う.add(異動一時2entity.get住所地特例対象者区分コード());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get施設所在保険者番号().equals(受給者異動送付.getShisetsuShozaiHokenjaNo())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(住特保険者);
            違う.add(受給者異動送付.getShisetsuShozaiHokenjaNo());
            違う.add(異動一時2entity.get施設所在保険者番号());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get住所地特例適用開始日().equals(
                受給者異動送付.getJushochiTokureiTekiyoKaishiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(住特開始日);
            違う.add(受給者異動送付.getJushochiTokureiTekiyoKaishiYMD());
            違う.add(異動一時2entity.get住所地特例適用開始日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get住所地特例適用終了日().equals(
                受給者異動送付.getJushochiTokureiTekiyoShuryoYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(住特終了日);
            違う.add(受給者異動送付.getJushochiTokureiTekiyoShuryoYMD());
            違う.add(異動一時2entity.get住所地特例適用終了日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get利用者負担割合有効開始日().equals(
                受給者異動送付.getRiyosyaFutanWariaiYukoKaishiYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(二割開始日);
            違う.add(受給者異動送付.getRiyosyaFutanWariaiYukoKaishiYMD());
            違う.add(異動一時2entity.get利用者負担割合有効開始日());
            違う項目.add(違う);
        }

        if (!異動一時2entity.get利用者負担割合有効終了日().equals(
                受給者異動送付.getRiyosyaFutanWariaiYukoShuryoYMD())) {
            List<RString> 違う = new ArrayList<>();
            違う.add(二割終了日);
            違う.add(受給者異動送付.getRiyosyaFutanWariaiYukoShuryoYMD());
            違う.add(異動一時2entity.get利用者負担割合有効終了日());
            違う項目.add(違う);
        }
    }

    private void 被保険者番号マッチング() {
        for (HihokenshaNo 被保険者番号 : 被保険者番号List) {
            List<IdoTblTmpEntity> 異動一時2List = 異動一時2Map.get(被保険者番号);
            List<DbT3001JukyushaIdoRenrakuhyoEntity> 受給者異動送付List = 受給者異動送付Map.get(被保険者番号);
            被保険者番号項目比較(異動一時2List, 受給者異動送付List);

        }
    }

    private void 被保険者番号項目比較(List<IdoTblTmpEntity> 異動一時2List, List<DbT3001JukyushaIdoRenrakuhyoEntity> 受給者異動送付List) {
        sort異動一時2List(異動一時2List);
        sort受給者異動送付List(受給者異動送付List);
        List<FlexibleYearMonth> 異動年月List = new ArrayList<>();
        Map<FlexibleYearMonth, List<IdoTblTmpEntity>> 異動年月異動一時Map = new HashMap<>();
        for (IdoTblTmpEntity 異動一時2 : 異動一時2List) {
            FlexibleYearMonth 異動年月 = 異動一時2.get異動年月日().getYearMonth();
            List<IdoTblTmpEntity> list = 異動年月異動一時Map.get(異動年月);
            if (list == null) {
                list = new ArrayList<>();
                異動年月異動一時Map.put(異動年月, list);
            }
            list.add(異動一時2);
        }
        Map<FlexibleYearMonth, List<DbT3001JukyushaIdoRenrakuhyoEntity>> 異動年月受給者異動送付Map = new HashMap<>();
        for (DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付 : 受給者異動送付List) {
            FlexibleYearMonth 異動年月 = 受給者異動送付.getIdoYMD().getYearMonth();
            List<DbT3001JukyushaIdoRenrakuhyoEntity> list = 異動年月受給者異動送付Map.get(異動年月);
            if (list == null) {
                list = new ArrayList<>();
                異動年月受給者異動送付Map.put(異動年月, list);
            }
            list.add(受給者異動送付);
        }
        for (FlexibleYearMonth 異動年月 : 異動年月List) {
            if (異動年月異動一時Map.containsKey(異動年月) && 異動年月受給者異動送付Map.containsKey(異動年月)) {
                List<IdoTblTmpEntity> 異動年月異動一時List = 異動年月異動一時Map.get(異動年月);
                List<DbT3001JukyushaIdoRenrakuhyoEntity> 異動年月受給者異動送付List = 異動年月受給者異動送付Map.get(異動年月);
                if (異動年月受給者異動送付List.size() < 異動年月異動一時List.size()) {
                    すべての項目比較(異動年月異動一時List.get(異動年月異動一時List.size() - COUNT_1),
                            異動年月受給者異動送付List.get(異動年月受給者異動送付List.size() - COUNT_1));
                } else {
                    //TODO
                }

            } else if (異動年月異動一時Map.containsKey(異動年月)) {
                List<IdoTblTmpEntity> 異動年月異動一時List = 異動年月異動一時Map.get(異動年月);
                for (IdoTblTmpEntity 異動年月異動一時 : 異動年月異動一時List) {
                    受給者異動連絡票Entity出力処理(異動年月異動一時);
                }
            } else {
                List<DbT3001JukyushaIdoRenrakuhyoEntity> 異動年月受給者異動送付List = 異動年月受給者異動送付Map.get(異動年月);
                for (DbT3001JukyushaIdoRenrakuhyoEntity 異動年月受給者異動送付 : 異動年月受給者異動送付List) {
                    国保連受給者異動情報履歴削除(異動年月受給者異動送付);
                }
            }
        }
    }

    private void すべての項目比較(IdoTblTmpEntity 異動一時2entity, DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付) {
        RString 異動一時2All項目 = get異動一時2All項目(異動一時2entity, true);
        RString 受給者異動送付All項目 = get受給者異動送付All項目(受給者異動送付, true);
        boolean hasChange = false;
        if (!異動一時2All項目.equals(受給者異動送付All項目)) {
            hasChange = true;
        }
        boolean 申請中区分コード変更 = 申請中区分コード変更Check(異動一時2entity.get変更申請中区分コード(),
                受給者異動送付.getHenkoShinseichuKubunCode());
        if (!申請中区分コード変更) {
            申請中区分コード変更 = 申請中区分コード変更Check(異動一時2entity.get減免申請中区分コード(),
                    受給者異動送付.getGemmenShinseichuKubunCode());
        }
        if (!申請中区分コード変更) {
            申請中区分コード変更 = 申請中区分コード変更Check(異動一時2entity.get特定入所者認定申請中区分コード(),
                    受給者異動送付.getTokuteiNyushoshaNinteiShinseichuKubunCode());
        }
        if (!hasChange && !申請中区分コード変更) {
            return;
        }
        if (dateChangeCheck(異動一時2entity.get資格喪失年月日(), 受給者異動送付.getShikakuSoshitsuYMD())) {
            資格喪失年月日変更(異動一時2entity, 受給者異動送付, 申請中区分コード変更);
            return;
        }
        資格喪失年月日変更なし(異動一時2entity, 受給者異動送付, 申請中区分コード変更);
    }

    private void 資格喪失年月日変更なし(IdoTblTmpEntity 異動一時2entity, DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付,
            boolean 申請中区分コード変更) {
        if (申請中区分コード変更) {
            国保連受給者異動情報履歴訂正(異動一時2entity, 受給者異動送付);
            return;
        }
        if (checkRString(異動一時2entity.get要介護状態区分コード(), 受給者異動送付.getMinashiYokaigoJotaiKubunCode())
                || checkRString(異動一時2entity.get認定有効期間終了年月日(), 受給者異動送付.getNinteiYukoKikanShuryoYMD())) {
            if (dateChangeCheck(異動一時2entity.get認定有効期間開始年月日(), 受給者異動送付.getNinteiYukoKikankaishiYMD())) {
                受給者異動連絡票Entity出力処理(異動一時2entity);
                return;
            }
            if (checkRString(異動一時2entity.get要介護状態区分コード(), 受給者異動送付.getMinashiYokaigoJotaiKubunCode())) {
                国保連受給者異動情報履歴訂正(異動一時2entity, 受給者異動送付);
                return;
            }
            //TODO
            国保連受給者異動情報履歴訂正(異動一時2entity, 受給者異動送付);
            return;
        }
        RString 異動一時2All項目 = get異動一時2All項目(異動一時2entity, false);
        RString 受給者異動送付All項目 = get受給者異動送付All項目(受給者異動送付, false);
        if ((異動一時2All項目.equals(受給者異動送付All項目) && !申請中区分コード変更)
                || 部分項目変更Check(異動一時2entity, 受給者異動送付)) {
            国保連受給者異動情報履歴訂正(異動一時2entity, 受給者異動送付);
            return;
        }
        if (checkRString(異動一時2entity.get居宅サービス計画適用開始年月日(), 受給者異動送付.getKyotakuServiceTekiyoKaishiYMD())) {
            if (checkRString(異動一時2entity.get居宅サービス計画作成区分コード(), 受給者異動送付.getKyotakuServiceSakuseiKubunCode())) {
                受給者異動連絡票Entity出力処理(異動一時2entity);
                return;
            }
            国保連受給者異動情報履歴訂正(異動一時2entity, 受給者異動送付);
            return;
        }
        if (checkRString(異動一時2entity.get適用終了年月日(), 受給者異動送付.getTekiyoShuryoYMD())
                || checkRString(異動一時2entity.get負担額適用終了年月日(), 受給者異動送付.getFutangakuTekiyoShuryoYMD())
                || checkRString(異動一時2entity.get負担限度額適用終了年月日(), 受給者異動送付.getFutanGendogakuTekiyoShuryoYMD())
                || checkRString(異動一時2entity.get軽減率適用終了年月日(), 受給者異動送付.getKeigenritsuTekiyoShuryoYMD())) {
            if (部分項目変更2Check(異動一時2entity, 受給者異動送付)) {
                国保連受給者異動情報履歴訂正(異動一時2entity, 受給者異動送付);
                return;
            }
            受給者異動連絡票Entity出力処理(異動一時2entity);
            return;
        }
        if (!isDateEmpty(異動一時2entity.get資格喪失年月日()) && isDateEmpty(受給者異動送付.getShikakuSoshitsuYMD())) {
            受給者異動連絡票Entity出力処理(異動一時2entity);
            return;
        }
        国保連受給者異動情報履歴訂正(異動一時2entity, 受給者異動送付);
    }

    private boolean 部分項目変更Check(IdoTblTmpEntity 異動一時2entity, DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付) {
        if (!checkRString(異動一時2entity.get居宅サービス計画作成区分コード(), 受給者異動送付.getKyotakuServiceSakuseiKubunCode())
                && !checkRString(異動一時2entity.get居宅介護支援事業所番号(), 受給者異動送付.getKyotakuKaigoShienJigyoshoNo())
                && !checkRString(異動一時2entity.get居宅サービス計画適用開始年月日(), 受給者異動送付.getKyotakuServiceTekiyoKaishiYMD())
                && !checkRString(異動一時2entity.get居宅サービス計画適用終了年月日(), 受給者異動送付.getKyotakuServiceTekiyoShuryoYMD())) {
            return true;
        }
        return false;
    }

    private boolean 部分項目変更2Check(IdoTblTmpEntity 異動一時2entity, DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付) {
        if (RString.isNullOrEmpty(異動一時2entity.get適用終了年月日())
                && !RString.isNullOrEmpty(受給者異動送付.getTekiyoShuryoYMD())) {
            return true;
        }
        if (RString.isNullOrEmpty(異動一時2entity.get負担額適用終了年月日())
                && !RString.isNullOrEmpty(受給者異動送付.getFutangakuTekiyoShuryoYMD())) {
            return true;
        }
        if (RString.isNullOrEmpty(異動一時2entity.get負担限度額適用終了年月日())
                && !RString.isNullOrEmpty(受給者異動送付.getFutanGendogakuTekiyoShuryoYMD())) {
            return true;
        }
        if (RString.isNullOrEmpty(異動一時2entity.get軽減率適用終了年月日())
                && !RString.isNullOrEmpty(受給者異動送付.getKeigenritsuTekiyoShuryoYMD())) {
            return true;
        }
        return false;
    }

    private void 資格喪失年月日変更(IdoTblTmpEntity 異動一時2entity, DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付,
            boolean 申請中区分コード変更) {
        if (!isDateEmpty(異動一時2entity.get資格喪失年月日()) && !isDateEmpty(受給者異動送付.getShikakuSoshitsuYMD())) {
            国保連受給者異動情報履歴訂正(異動一時2entity, 受給者異動送付);
            return;
        }
        if (!isDateEmpty(異動一時2entity.get資格喪失年月日())) {
            return;
        }
        国保連受給者異動情報履歴削除(受給者異動送付);
        if (申請中区分コード変更) {
            受給者異動連絡票Entity出力処理(異動一時2entity);
            return;
        }
        if (checkRString(異動一時2entity.get要介護状態区分コード(), 受給者異動送付.getMinashiYokaigoJotaiKubunCode())
                || checkRString(異動一時2entity.get認定有効期間終了年月日(), 受給者異動送付.getNinteiYukoKikanShuryoYMD())) {
            if (!RST_3.equals(異動一時2entity.get変更申請中区分コード())) {
                受給者異動連絡票Entity出力処理(異動一時2entity);
            }
        } else {
            受給者異動連絡票Entity出力処理(異動一時2entity);
        }
    }

    private boolean checkRString(RString data1, RString data2) {
        if (RString.isNullOrEmpty(data1) && RString.isNullOrEmpty(data2)) {
            return false;
        }
        if (!RString.isNullOrEmpty(data1)) {
            return data1.equals(data2);
        }
        return true;
    }

    private boolean dateChangeCheck(FlexibleDate date1, FlexibleDate date2) {
        if (isDateEmpty(date1) && isDateEmpty(date2)) {
            return false;
        }
        if (isDateEmpty(date1)) {
            return true;
        }
        if (isDateEmpty(date2)) {
            return true;
        }
        return !date1.equals(date2);
    }

    private boolean isDateEmpty(FlexibleDate date) {
        if (date == null || date.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean 申請中区分コード変更Check(RString 異動一時申請中区分コード, RString 異動送付申請中区分コード) {
        if (RST_2.equals(異動一時申請中区分コード)
                && (RString.isNullOrEmpty(異動送付申請中区分コード)
                || RST_1.equals(異動送付申請中区分コード)
                || RST_3.equals(異動送付申請中区分コード)
                || RST_SPACE.equals(異動送付申請中区分コード))) {
            return true;
        }
        if (RST_2.equals(異動送付申請中区分コード)
                && (RString.isNullOrEmpty(異動一時申請中区分コード)
                || RST_1.equals(異動一時申請中区分コード)
                || RST_3.equals(異動一時申請中区分コード)
                || RST_SPACE.equals(異動一時申請中区分コード))) {
            return true;
        }
        return false;
    }

    private RString get異動一時2All項目(IdoTblTmpEntity 異動一時2entity, boolean flag) {
        RStringBuilder all項目 = new RStringBuilder();
        all項目.append(異動一時2entity.get証記載保険者番号())
                .append(異動一時2entity.get資格取得年月日())
                .append(異動一時2entity.get資格喪失年月日())
                .append(異動一時2entity.get申請年月日())
                .append(異動一時2entity.getみなし要介護状態区分コード())
                .append(異動一時2entity.get要介護状態区分コード())
                .append(異動一時2entity.get認定有効期間開始年月日())
                .append(異動一時2entity.get認定有効期間終了年月日())
                .append(異動一時2entity.get居宅サービス計画作成区分コード());
        if (flag) {
            all項目.append(異動一時2entity.get居宅介護支援事業所番号());
        }

        all項目.append(異動一時2entity.get居宅サービス計画適用開始年月日())
                .append(異動一時2entity.get居宅サービス計画適用終了年月日().substring(COUNT_0, COUNT_6))
                .append(異動一時2entity.get訪問通所サービス支給限度基準額())
                .append(異動一時2entity.get訪問通所サービス上限管理適用期間開始年月日().getYearMonth())
                .append(異動一時2entity.get訪問通所サービス上限管理適用期間終了年月日().substring(COUNT_0, COUNT_6))
                .append(異動一時2entity.get短期入所サービス支給限度基準額())
                .append(異動一時2entity.get短期入所サービス上限管理適用期間開始年月日().getYearMonth())
                .append(異動一時2entity.get短期入所サービス上限管理適用期間終了年月日().getYearMonth())
                .append(異動一時2entity.is公費負担上限額減額有フラグ())
                .append(異動一時2entity.get償還払化開始年月日())
                .append(異動一時2entity.get償還払化終了年月日())
                .append(異動一時2entity.get給付率引下げ開始年月日())
                .append(異動一時2entity.get給付率引下げ終了年月日())
                .append(異動一時2entity.get利用者負担区分コード())
                .append(異動一時2entity.get給付率())
                .append(異動一時2entity.get適用開始年月日())
                .append(異動一時2entity.get適用終了年月日())
                .append(異動一時2entity.get標準負担区分コード())
                .append(異動一時2entity.get負担額())
                .append(異動一時2entity.get負担額適用開始年月日())
                .append(異動一時2entity.get負担額適用終了年月日())
                .append(異動一時2entity.get特定入所者介護サービス区分コード())
                .append(異動一時2entity.get課税層の特例減額措置対象フラグ())
                .append(異動一時2entity.get食費負担限度額())
                .append(異動一時2entity.get居住費ユニット型個室負担限度額())
                .append(異動一時2entity.get居住費ユニット型準個室負担限度額())
                .append(異動一時2entity.get居住費従来型個室特養等負担限度額())
                .append(異動一時2entity.get居住費従来型個室老健療養等負担限度額())
                .append(異動一時2entity.get居住費多床室負担限度額())
                .append(異動一時2entity.get負担限度額適用開始年月日())
                .append(異動一時2entity.get負担限度額適用終了年月日())
                .append(異動一時2entity.get軽減率())
                .append(異動一時2entity.get軽減率適用開始年月日())
                .append(異動一時2entity.get軽減率適用終了年月日())
                .append(異動一時2entity.get二次予防事業区分コード())
                .append(異動一時2entity.get二次予防事業有効期間開始年月日())
                .append(異動一時2entity.get二次予防事業有効期間終了年月日())
                .append(異動一時2entity.get住所地特例対象者区分コード())
                .append(異動一時2entity.get施設所在保険者番号())
                .append(異動一時2entity.get住所地特例適用開始日())
                .append(異動一時2entity.get住所地特例適用終了日())
                .append(異動一時2entity.get利用者負担割合有効開始日())
                .append(異動一時2entity.get利用者負担割合有効終了日());
        return all項目.toRString();
    }

    private RString get受給者異動送付All項目(DbT3001JukyushaIdoRenrakuhyoEntity 受給者異動送付, boolean flag) {
        RStringBuilder all項目 = new RStringBuilder();
        all項目.append(受給者異動送付.getShoKisaiHokenshaNo())
                .append(受給者異動送付.getShikakuShutokuYMD())
                .append(受給者異動送付.getShikakuSoshitsuYMD())
                .append(受給者異動送付.getShinseiYMD())
                .append(受給者異動送付.getMinashiYokaigoJotaiKubunCode())
                .append(受給者異動送付.getYokaigoJotaiKubunCode())
                .append(受給者異動送付.getNinteiYukoKikankaishiYMD())
                .append(受給者異動送付.getNinteiYukoKikanShuryoYMD())
                .append(受給者異動送付.getKyotakuServiceSakuseiKubunCode());
        if (flag) {
            all項目.append(受給者異動送付.getKyotakuKaigoShienJigyoshoNo());
        }
        all項目.append(受給者異動送付.getKyotakuServiceTekiyoKaishiYMD())
                .append(受給者異動送付.getKyotakuServiceTekiyoShuryoYMD().substring(COUNT_0, COUNT_6))
                .append(受給者異動送付.getHomonTsushoServiceShikyuGendoKijungaku())
                .append(受給者異動送付.getHomonTsushoServiceJogenKanriTekiyoKaishiYMD().getYearMonth())
                .append(受給者異動送付.getHomonTsushoServiceJogenKanriTekiyoShuryoYMD().substring(COUNT_0, COUNT_6))
                .append(受給者異動送付.getTankiNyushoServiceShikyuGendoKijungaku())
                .append(受給者異動送付.getTankinyushoServiceJogenKanriTekiyoKaishiYMD().getYearMonth())
                .append(受給者異動送付.getTankinyushoServiceJogenKanriTekiyoShuryoYMD().getYearMonth())
                .append(受給者異動送付.getKohiFutanJogenGengakuAriFlag())
                .append(受給者異動送付.getShokanbaraikaKaishiYMD())
                .append(受給者異動送付.getShokanbaraikaShuryoYMD())
                .append(受給者異動送付.getKyufuritsuHikisageKaishiYMD())
                .append(受給者異動送付.getKyufuritsuHikisageShuryoYMD())
                .append(受給者異動送付.getRiyoshaFutanKubunCode())
                .append(受給者異動送付.getKyufuritsu())
                .append(受給者異動送付.getTekiyoKaishiYMD())
                .append(受給者異動送付.getTekiyoShuryoYMD())
                .append(受給者異動送付.getHyojunFutanKubunCode())
                .append(受給者異動送付.getFutangaku())
                .append(受給者異動送付.getFutangakuTekiyoKaishiYMD())
                .append(受給者異動送付.getFutangakuTekiyoShuryoYMD())
                .append(受給者異動送付.getTokuteiNyushoshaNinteiShinseichuKubunCode())
                .append(受給者異動送付.getKaizeisoTokureiGengakuSochiTaishoFlag())
                .append(受給者異動送付.getShokuhiFutanGendogaku())
                .append(受給者異動送付.getKyojuhiUnitGataKoshitsuFutanGendogaku())
                .append(受給者異動送付.getKyojuhiUnitGataJunKoshitsuFutanGendogaku())
                .append(受給者異動送付.getKyojuhiJuraiGataKoshitsuTokuyoFutanGendogaku())
                .append(受給者異動送付.getKyojuhiJuraiGataKoshitsuRokenRyoyoFutanGendogaku())
                .append(受給者異動送付.getKyujuhiTashoshitsuFutanGendogaku())
                .append(受給者異動送付.getFutanGendogakuTekiyoKaishiYMD())
                .append(受給者異動送付.getFutanGendogakuTekiyoShuryoYMD())
                .append(受給者異動送付.getKeigenritsu())
                .append(受給者異動送付.getKeigenritsuTekiyoKaishiYMD())
                .append(受給者異動送付.getKeigenritsuTekiyoShuryoYMD())
                .append(受給者異動送付.getNijiyoboJigyoKubunCode())
                .append(受給者異動送付.getNijiyoboJigyoYukoKikanKaishiYMD())
                .append(受給者異動送付.getNijiyoboJigyoYukoKikanShuryoYMD())
                .append(受給者異動送付.getJushochiTokureiTaishoshaKubunCode())
                .append(受給者異動送付.getShisetsuShozaiHokenjaNo())
                .append(受給者異動送付.getJushochiTokureiTekiyoKaishiYMD())
                .append(受給者異動送付.getJushochiTokureiTekiyoShuryoYMD())
                .append(受給者異動送付.getRiyosyaFutanWariaiYukoKaishiYMD())
                .append(受給者異動送付.getRiyosyaFutanWariaiYukoShuryoYMD());
        return all項目.toRString();
    }

//    /**
//     * CSVヘッダを設定します。
//     *
//     * @return {@link List<RString>}
//     */
//    public List<RString> getHeaderList() {
//        List<RString> headerList = new ArrayList<>();
//        headerList.add(CSV_作成年月日);
//        headerList.add(CSV_市町村コード);
//        headerList.add(CSV_市町村名称);
//        headerList.add(CSV_被保険者番号1);
//        headerList.add(CSV_氏名1);
//        headerList.add(CSV_異動年月日１);
//        headerList.add(CSV_訂正情報_項目１);
//        headerList.add(CSV_訂正情報_項目２);
//        headerList.add(CSV_訂正情報_項目３);
//        headerList.add(CSV_訂正情報_項目４);
//        headerList.add(CSV_訂正情報_項目５);
//        headerList.add(CSV_訂正情報_項目６);
//        headerList.add(CSV_訂正情報_項目７);
//        headerList.add(CSV_訂正情報_項目８);
//        headerList.add(CSV_訂正情報_項目９);
//        headerList.add(CSV_訂正情報_項目１０);
//        headerList.add(CSV_訂正情報_項目１１);
//        headerList.add(CSV_訂正情報_項目１２);
//        headerList.add(CSV_被保険者番号２);
//        headerList.add(CSV_氏名２);
//        headerList.add(CSV_異動年月日２);
//        headerList.add(CSV_訂正情報_送付済内容１);
//        headerList.add(CSV_訂正情報_送付済内容２);
//        headerList.add(CSV_訂正情報_送付済内容３);
//        headerList.add(CSV_訂正情報_送付済内容４);
//        headerList.add(CSV_訂正情報_送付済内容５);
//        headerList.add(CSV_訂正情報_送付済内容６);
//        headerList.add(CSV_訂正情報_送付済内容７);
//        headerList.add(CSV_訂正情報_送付済内容８);
//        headerList.add(CSV_訂正情報_送付済内容９);
//        headerList.add(CSV_訂正情報_送付済内容１０);
//        headerList.add(CSV_訂正情報_送付済内容１１);
//        headerList.add(CSV_訂正情報_送付済内容１２);
//
//        headerList.add(CSV_被保険者番号3);
//        headerList.add(CSV_氏名３);
//        headerList.add(CSV_異動年月日３);
//        headerList.add(CSV_訂正情報_訂正内容1);
//        headerList.add(CSV_訂正情報_訂正内容2);
//        headerList.add(CSV_訂正情報_訂正内容3);
//        headerList.add(CSV_訂正情報_訂正内容4);
//        headerList.add(CSV_訂正情報_訂正内容5);
//        headerList.add(CSV_訂正情報_訂正内容6);
//        headerList.add(CSV_訂正情報_訂正内容7);
//        headerList.add(CSV_訂正情報_訂正内容8);
//        headerList.add(CSV_訂正情報_訂正内容9);
//        headerList.add(CSV_訂正情報_訂正内容10);
//        headerList.add(CSV_訂正情報_訂正内容11);
//        headerList.add(CSV_訂正情報_訂正内容12);
//        return headerList;
//    }
//
//    /**
//     * CSVレコードを取得します。
//     *
//     * @param entity IdoTblTmpEntity
//     *
//     * @return {@link List<RString>}
//     */
//    private List<RString> getBodyList(IdoTblTmpEntity entity) {
//        List<RString> bodyList = new ArrayList<>();
//        bodyList.add(作成年月日);
//        bodyList.add(市町村コード);
//        bodyList.add(市町村名称);
//        if (entity.get被保険者番号() != null && !entity.get被保険者番号().isEmpty()) {
//            bodyList.add(entity.get被保険者番号().value());
//        }
//        bodyList.add(entity.get被保険者氏名カナ());
//        bodyList.add(dateChangeToRString(entity.get異動年月日()));
//        bodyList.add(証保険番号);
//        bodyList.add(資格取得日);
//        bodyList.add(資格喪失日);
//        bodyList.add(変更申請中);
//        bodyList.add(申請年月日);
//        bodyList.add(みなし区分);
//        bodyList.add(要介護度);
//        bodyList.add(認定開始日);
//        bodyList.add(認定終了日);
//        bodyList.add(計作成区分);
//        bodyList.add(RString.EMPTY);
//        bodyList.add(RString.EMPTY);
//        bodyList.add(RString.EMPTY);
//        bodyList.add(RString.EMPTY);
//        bodyList.add(RString.EMPTY);
//        if (entity.get証記載保険者番号() != null && !entity.get証記載保険者番号().isEmpty()) {
//            bodyList.add(entity.get証記載保険者番号().value());
//        }
//        bodyList.add(dateChangeToRString(entity.get資格取得年月日()));
//        bodyList.add(entity.get変更申請中区分コード());
//        bodyList.add(dateChangeToRString(entity.get申請年月日()));
//        bodyList.add(entity.getみなし要介護状態区分コード());
//        bodyList.add(entity.get要介護状態区分コード());
//        bodyList.add(dateChangeToRString(entity.get認定有効期間開始年月日()));
//        bodyList.add(entity.get認定有効期間終了年月日());
//        bodyList.add(entity.get居宅サービス計画作成区分コード());
//        bodyList.add(RString.EMPTY);
//        bodyList.add(RString.EMPTY);
//        bodyList.add(RString.EMPTY);
//        bodyList.add(RString.EMPTY);
//        bodyList.add(RString.EMPTY);
//        bodyList.add(記号);
//        bodyList.add(記号);
//        bodyList.add(記号);
//        bodyList.add(記号);
//        bodyList.add(記号);
//        bodyList.add(記号);
//        bodyList.add(記号);
//        bodyList.add(記号);
//        bodyList.add(記号);
//        bodyList.add(記号);
//        bodyList.add(RString.EMPTY);
//        bodyList.add(RString.EMPTY);
//        return bodyList;
//    }
//    private RString dateChangeToRString(FlexibleDate date) {
//        if (date == null || date.isEmpty()) {
//            return RString.EMPTY;
//        }
//        return new RString(date.toString());
//    }
    private static void sort異動一時2List(List<IdoTblTmpEntity> 異動一時List) {
        Collections.sort(異動一時List, new Comparator<IdoTblTmpEntity>() {
            @Override
            public int compare(IdoTblTmpEntity o1, IdoTblTmpEntity o2) {
                if (o1.get異動年月日().isBefore(o2.get異動年月日())) {
                    return -1;
                }
                if (o2.get異動年月日().isBefore(o1.get異動年月日())) {
                    return -1;
                }
                return 0;
            }
        });
    }

    private static void sort受給者異動送付List(List<DbT3001JukyushaIdoRenrakuhyoEntity> 受給者異動送付List) {
        Collections.sort(受給者異動送付List, new Comparator<DbT3001JukyushaIdoRenrakuhyoEntity>() {
            @Override
            public int compare(DbT3001JukyushaIdoRenrakuhyoEntity o1, DbT3001JukyushaIdoRenrakuhyoEntity o2) {
                if (o1.getIdoYMD().isBefore(o2.getIdoYMD())) {
                    return -1;
                }
                if (o2.getIdoYMD().isBefore(o1.getIdoYMD())) {
                    return -1;
                }
                return 0;
            }
        });
    }

    /**
     * CSVファイル2行目以降細項目データを出力する
     *
     * @param entity JukyushaIdoRirekiTeiseiIchiranEntity
     * @return DataCompareShoriCsvEntity
     */
    public DataCompareShoriCsvEntity to明細項目(JukyushaIdoRirekiTeiseiIchiranEntity entity) {

        DataCompareShoriCsvEntity resultEntity = new DataCompareShoriCsvEntity();
        resultEntity.set作成年月日(作成年月日);
        resultEntity.set市町村コード(市町村コード);
        resultEntity.set市町村名称(市町村名称);
        resultEntity.set被保険者番号１(entity.get被保険者番号());
        resultEntity.set氏名１(entity.get被保険者氏名());
        resultEntity.set異動年月日１(new RString(entity.get異動年月日().toString()));
        resultEntity.set訂正情報項目名1(entity.get訂正情報の項目名1());
        resultEntity.set訂正情報項目名2(entity.get訂正情報の項目名2());
        resultEntity.set訂正情報項目名3(entity.get訂正情報の項目名3());
        resultEntity.set訂正情報項目名4(entity.get訂正情報の項目名4());
        resultEntity.set訂正情報項目名5(entity.get訂正情報の項目名5());
        resultEntity.set訂正情報項目名6(entity.get訂正情報の項目名6());
        resultEntity.set訂正情報項目名7(entity.get訂正情報の項目名7());
        resultEntity.set訂正情報項目名8(entity.get訂正情報の項目名8());
        resultEntity.set訂正情報項目名9(entity.get訂正情報の項目名9());
        resultEntity.set訂正情報項目名10(entity.get訂正情報の項目名10());
        resultEntity.set訂正情報項目名11(RString.EMPTY);
        resultEntity.set訂正情報項目名12(RString.EMPTY);
        resultEntity.set被保険者番号２(RString.EMPTY);
        resultEntity.set氏名2(RString.EMPTY);
        resultEntity.set異動年月日2(RString.EMPTY);

        resultEntity.set送付済内容1(entity.get送付済内容1());
        resultEntity.set送付済内容2(entity.get送付済内容2());
        resultEntity.set送付済内容3(entity.get送付済内容3());
        resultEntity.set送付済内容4(entity.get送付済内容4());
        resultEntity.set送付済内容5(entity.get送付済内容5());
        resultEntity.set送付済内容6(entity.get送付済内容6());
        resultEntity.set送付済内容7(entity.get送付済内容7());
        resultEntity.set送付済内容8(entity.get送付済内容8());
        resultEntity.set送付済内容9(entity.get送付済内容9());
        resultEntity.set送付済内容10(entity.get送付済内容10());
        resultEntity.set送付済内容11(RString.EMPTY);
        resultEntity.set送付済内容12(RString.EMPTY);
        resultEntity.set被保険者番号3(RString.EMPTY);
        resultEntity.set氏名3(RString.EMPTY);
        resultEntity.set異動年月日3(RString.EMPTY);

        resultEntity.set訂正内容1(entity.get訂正内容1());
        resultEntity.set訂正内容2(entity.get訂正内容2());
        resultEntity.set訂正内容3(entity.get訂正内容3());
        resultEntity.set訂正内容4(entity.get訂正内容4());
        resultEntity.set訂正内容5(entity.get訂正内容5());
        resultEntity.set訂正内容6(entity.get訂正内容6());
        resultEntity.set訂正内容7(entity.get訂正内容7());
        resultEntity.set訂正内容8(entity.get訂正内容8());
        resultEntity.set訂正内容9(entity.get訂正内容9());
        resultEntity.set訂正内容10(entity.get訂正内容10());
        resultEntity.set訂正内容11(RString.EMPTY);
        resultEntity.set訂正内容12(RString.EMPTY);
        return resultEntity;
    }

    private JukyushaIdorenrakuhyoSofuCsvEntity get送付対象者リスト(IdoTblTmpEntity 異動一時2entity, RString 変更項目) {
        JukyushaIdorenrakuhyoSofuCsvEntity entity = new JukyushaIdorenrakuhyoSofuCsvEntity();
        entity.set被保険者番号(異動一時2entity.get被保険者番号().getColumnValue());
        entity.set氏名(異動一時2entity.get被保険者氏名カナ());
        entity.set区分(JukyushaIF_IdoKubunCode.toValue(異動一時2entity.get異動区分コード()).get名称());
        entity.set異動年月日(new RString(異動一時2entity.get異動年月日().toString()));
        entity.set要介護度(YokaigoJotaiKubunSupport.toValue(FlexibleDate.getNowDate(),
                異動一時2entity.get要介護状態区分コード()).getName());
        entity.set開始認定日(new RString(異動一時2entity.get認定有効期間開始年月日().toString()));
        entity.set終了認定日(異動一時2entity.get認定有効期間終了年月日());
        entity.set変更項目(変更項目);
        return entity;
    }
}