/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.batchcontroller.step.DBD710130;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jp.co.ndensan.reams.db.dbd.business.report.HanyoListJigyoTaishoshaOrderby;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.hanyolist.jukyukyotsu.ChushutsuKomokuKubun;
import jp.co.ndensan.reams.db.dbd.definition.core.hanyorisutojigyotaishosha.JigyoTaishoshaCsvEnumEntity;
import jp.co.ndensan.reams.db.dbd.definition.processprm.dbd710130.HanyoListJigyoTaishoshaProcessParameter;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.hanyorisutojigyotaishosha.HanyoRisutoJigyoTaishoshaEntity;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.hanyorisutojigyotaishosha.HanyoRisutoJigyoTaishoshaEucCsvEntity;
import jp.co.ndensan.reams.db.dbd.service.core.dbd710130.HanyoListJigyoTaishoshaManager;
import jp.co.ndensan.reams.db.dbz.business.core.hanyolist.HanyoListShutsuryokuKomoku;
import jp.co.ndensan.reams.db.dbz.business.report.hanyolist.HanyoListReport;
import jp.co.ndensan.reams.db.dbz.definition.batchprm.hanyolist.atena.Chiku;
import jp.co.ndensan.reams.db.dbz.definition.batchprm.hanyolist.atena.NenreiSoChushutsuHoho;
import jp.co.ndensan.reams.db.dbz.definition.reportid.ReportIdDBZ;
import jp.co.ndensan.reams.db.dbz.entity.report.hanyolist.HanyoListReportSource;
import jp.co.ndensan.reams.db.dbz.service.core.hanyolist.HanyoListReportUtil;
import jp.co.ndensan.reams.ua.uax.business.core.psm.UaFt250FindAtesakiFunction;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.AtenaSearchKeyBuilder;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.AtesakiGyomuHanteiKeyFactory;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.ShikibetsuTaishoPSMSearchKeyBuilder;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.shikibetsutaisho.KensakuYusenKubun;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.shikibetsutaisho.psm.DataShutokuKubun;
import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.shikibetsutaisho.IShikibetsuTaishoPSMSearchKey;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IOutputOrder;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.ISetSortItem;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.MyBatisOrderByClauseCreator;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder._SetSortItem;
import jp.co.ndensan.reams.ur.urz.business.report.outputjokenhyo.EucFileOutputJokenhyoItem;
import jp.co.ndensan.reams.ur.urz.business.report.outputjokenhyo.ReportOutputJokenhyoItem;
import jp.co.ndensan.reams.ur.urz.definition.core.reportoutputorder.PageBreakType;
import jp.co.ndensan.reams.ur.urz.definition.core.reportoutputorder.SortOrder;
import jp.co.ndensan.reams.ur.urz.definition.core.reportyamawake.NewpageType;
import jp.co.ndensan.reams.ur.urz.definition.core.reportyamawake.YamawakeType;
import jp.co.ndensan.reams.ur.urz.definition.core.shikibetsutaisho.JuminJotai;
import jp.co.ndensan.reams.ur.urz.definition.core.shikibetsutaisho.JuminShubetsu;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.core.association.IAssociationFinder;
import jp.co.ndensan.reams.ur.urz.service.core.reportoutputorder.ChohyoShutsuryokujunFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.core.reportoutputorder.IChohyoShutsuryokujunFinder;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.EucFileOutputJokenhyoFactory;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.IReportOutputJokenhyoPrinter;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.OutputJokenhyoFactory;
import jp.co.ndensan.reams.uz.uza.batch.batchexecutor.util.JobContextHolder;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.ChikuCode;
import jp.co.ndensan.reams.uz.uza.biz.ChoikiCode;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.CodeShubetsu;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.GyoseikuCode;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.euc.definition.UzUDE0831EucAccesslogFileType;
import jp.co.ndensan.reams.uz.uza.euc.io.EucEntityId;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvListWriter;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvWriter;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogger;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.PersonalData;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.uuid.AccessLogUUID;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.spool.FileSpoolManager;
import jp.co.ndensan.reams.uz.uza.spool.entities.UzUDE0835SpoolOutputType;

/**
 * 汎用リスト出力(事業対象者)_process処理クラスです。
 *
 * @reamsid_L DBD-5080-030 mawy
 */
public class HanyoListJigyoTaishoshaProcess extends BatchProcessBase<HanyoRisutoJigyoTaishoshaEntity> {

    private static final RString EUC_WRITER_DELIMITER = new RString(",");
    private static final RString EUC_WRITER_ENCLOSURE = new RString("\"");
    private static final EucEntityId EUC_ENTITY_ID = new EucEntityId("DBD701013");
    private static final RString CYUSYUTSUTAISYOSHA = new RString("【抽出対象者】");
    private static final RString HOKENSHA = new RString("保険者：");
    private static final RString KIZYUNNICHI = new RString("基準日：");
    private static final RString CHOKINNOMI = new RString("対象データ：直近のみ");
    private static final RString SHIKIBETSUCODE = new RString("二次予防事業対象者_識別コード");
    private static final RString CHIKI_1 = new RString("地区１");
    private static final RString CHIKI_2 = new RString("地区２");
    private static final RString CHIKI_3 = new RString("地区３");
    private static final RString JUSHO = new RString("町域：");
    private static final RString GYOSEIKU = new RString("行政区");
    private static final RString JUSYO = new RString("住所");
    private static final RString NENLEI = new RString("年齢");
    private static final RString NENLEIKIZYUNNICHI = new RString("年齢基準日:");
    private static final RString SAI = new RString("歳");
    private static final RString SEINENGAPPI = new RString("生年月日");
    private static final RString SPACE = new RString(" ");
    private static final RString COMMA = new RString(",");
    private static final RString COLON = new RString(":");
    private static final RString カラ = new RString("～");
    private static final RString 左記号 = new RString("(");
    private static final RString 右記号 = new RString(")");
    private final List<RString> csvHeader = new ArrayList<>();
    private List<RString> csvContent = new ArrayList<>();
    private static final RString MYBATIS_SELECT_ID = new RString(
            "jp.co.ndensan.reams.db.dbd.persistence.db.mapper.relate.hanyorisutojigyotaishosha."
            + "IHanyoRisutoJigyoTaishoshaMapper.get汎用リスト");
    private FileSpoolManager manager;
    private RString eucFilePath;
    private HanyoListJigyoTaishoshaProcessParameter processParamter;
    private CsvWriter<HanyoRisutoJigyoTaishoshaEucCsvEntity> eucCsvWriter;
    private CsvListWriter eucCsvWriter1;
    private Association association;
    private List<PersonalData> personalDataList;
    private boolean is帳票出力;
    private boolean isCSV出力;
    private RString csvFilePath1;
    private RString 項目見出し;
    private int 項目名称;
    private int 出力文字の開始位置;
    private int 出力桁数;
    private RString 項目内容;
    private IOutputOrder outputOrder;
    private int 連番;
    @BatchWriter
    private BatchReportWriter<HanyoListReportSource> batchReportWrite;
    private ReportSourceWriter<HanyoListReportSource> reportSourceWriter;

    @Override
    protected void initialize() {
        association = AssociationFinderFactory.createInstance().getAssociation();
        personalDataList = new ArrayList<>();
        連番 = 0;
        項目見出し = RString.EMPTY;
        項目内容 = RString.EMPTY;
        出力文字の開始位置 = 0;
        出力桁数 = 0;
        set帳表CSV出力();
    }

    @Override
    protected IBatchReader createReader() {
        IChohyoShutsuryokujunFinder finder = ChohyoShutsuryokujunFinderFactory.createInstance();
        outputOrder = finder.get出力順(SubGyomuCode.DBD介護受給, new ReportId(processParamter.getCyohyoid()),
                Long.valueOf(processParamter.getSyutsuryokujun().toString()));
        RString 出力順 = get出力順(outputOrder);
        ShikibetsuTaishoPSMSearchKeyBuilder key = new ShikibetsuTaishoPSMSearchKeyBuilder(GyomuCode.DB介護保険, KensakuYusenKubun.住登外優先);
        List<JuminShubetsu> 住民種別List = new ArrayList<>();
        List<JuminJotai> 住民状態List = new ArrayList<>();
        key.setデータ取得区分(DataShutokuKubun.直近レコード);
        key.set住民種別(get住民種別(住民種別List));
        key.set住民状態(get住民状態(住民状態List));
        key.set町域コード開始値(new ChoikiCode(processParamter.getAtenacyusyutsujyoken().getJusho_From()));
        key.set町域コード終了値(new ChoikiCode(processParamter.getAtenacyusyutsujyoken().getJusho_To()));
        key.set行政区コード開始値(new GyoseikuCode(processParamter.getAtenacyusyutsujyoken().getGyoseiku_From()));
        key.set行政区コード終了値(new GyoseikuCode(processParamter.getAtenacyusyutsujyoken().getGyoseiku_To()));
        key.set地区コード1開始値(new ChikuCode(processParamter.getAtenacyusyutsujyoken().getChiku1_From()));
        key.set地区コード1終了値(new ChikuCode(processParamter.getAtenacyusyutsujyoken().getChiku1_To()));
        key.set地区コード2開始値(new ChikuCode(processParamter.getAtenacyusyutsujyoken().getChiku2_From()));
        key.set地区コード2終了値(new ChikuCode(processParamter.getAtenacyusyutsujyoken().getChiku2_To()));
        key.set地区コード3開始値(new ChikuCode(processParamter.getAtenacyusyutsujyoken().getChiku2_From()));
        key.set地区コード3終了値(new ChikuCode(processParamter.getAtenacyusyutsujyoken().getChiku3_To()));
        IShikibetsuTaishoPSMSearchKey psmShikibetsuTaisho = key.build();
        AtenaSearchKeyBuilder atenaSearchKeyBuilder = new AtenaSearchKeyBuilder(
                KensakuYusenKubun.未定義, AtesakiGyomuHanteiKeyFactory.createInstace(GyomuCode.DB介護保険, SubGyomuCode.DBD介護受給));
        UaFt250FindAtesakiFunction uaFt250Psm = new UaFt250FindAtesakiFunction(atenaSearchKeyBuilder.build().get宛先検索キー());
        RString psmAtesaki = new RString(uaFt250Psm.getParameterMap().get("psmAtesaki").toString());
        return new BatchDbReader(MYBATIS_SELECT_ID,
                processParamter.toHanyoRisutoJigyoTaishoshaMybatisParameter(psmShikibetsuTaisho, psmAtesaki, 出力順));
    }

    @Override
    protected void createWriter() {
        manager = new FileSpoolManager(UzUDE0835SpoolOutputType.EucOther, EUC_ENTITY_ID, UzUDE0831EucAccesslogFileType.Csv);
        eucFilePath = Path.combinePath(manager.getEucOutputDirectry(), new RString("DBD_JigyoTaishosha_Temp.csv"));
        csvFilePath1 = Path.combinePath(manager.getEucOutputDirectry(), new RString("HanyoList_JigyoTaishosha.csv"));
        eucCsvWriter = new CsvWriter.InstanceBuilder(eucFilePath).
                setDelimiter(EUC_WRITER_DELIMITER).
                setEnclosure(EUC_WRITER_ENCLOSURE).
                setEncode(Encode.UTF_8withBOM).
                setNewLine(NewLine.CRLF).
                hasHeader(processParamter.isCsvkomokumeifuka()).
                build();
        eucCsvWriter1 = new CsvListWriter.InstanceBuilder(csvFilePath1).
                setDelimiter(EUC_WRITER_DELIMITER).
                setEnclosure(EUC_WRITER_ENCLOSURE).
                setEncode(Encode.UTF_8withBOM).
                setNewLine(NewLine.CRLF).
                build();
        batchReportWrite = BatchReportFactory.createBatchReportWriter(ReportIdDBZ.DBZ700001.getReportId().value(),
                SubGyomuCode.DBZ介護共通).create();
        reportSourceWriter = new ReportSourceWriter<>(batchReportWrite);
    }

    @Override
    protected void process(HanyoRisutoJigyoTaishoshaEntity entity) {
        連番 = 連番 + 1;
        HanyoRisutoJigyoTaishoshaEucCsvEntity eucCsvEntity = new HanyoRisutoJigyoTaishoshaEucCsvEntity();
        HanyoListJigyoTaishoshaManager.createInstance().CSV情報設定(eucCsvEntity, entity, association, processParamter.isCsvhitsukesurasyuhensyu());
        eucCsvWriter.writeLine(eucCsvEntity);
        personalDataList.add(toPersonalData(entity));
        Class clazz = eucCsvEntity.getClass();
        RString 項目内容new = RString.EMPTY;
        HanyoListShutsuryokuKomoku hanyoListShutsuryokuKomoku = HanyoListReportUtil.createInstance().get汎用リスト出力項目(GyomuCode.DB介護保険, SubGyomuCode.DBD介護受給,
                new ReportId(processParamter.getCyohyoid()), Long.parseLong(processParamter.getSyutsuryokukomoku().toString()));
        for (int i = 0; i < hanyoListShutsuryokuKomoku.get汎用リスト出力項目リスト().size(); i++) {
            try {
                Method getMethod = clazz.getDeclaredMethod(JigyoTaishoshaCsvEnumEntity
                        .toValue(new RString(String.valueOf(hanyoListShutsuryokuKomoku.get汎用リスト出力項目リスト()
                                                .get(i).get出力項目順位()))).get名称().toString());
                項目内容new = (RString) getMethod.invoke(eucCsvEntity);
            } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(HanyoListJigyoTaishoshaProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (is帳票出力) {
                RString get項目名称 = hanyoListShutsuryokuKomoku.get汎用リスト出力項目リスト().get(i).get項目名称();
                int get項目桁数 = hanyoListShutsuryokuKomoku.get汎用リスト出力項目リスト().get(i).get項目桁数();
                if (get項目名称.length()
                        > get項目桁数) {
                    get項目名称 = get項目名称.substring(0, get項目桁数);
                } else if (hanyoListShutsuryokuKomoku.get汎用リスト出力項目リスト().get(i).get項目位置().equals(new RString("左詰め(0)"))) {
                    for (int j = 0; j < get項目桁数 - get項目桁数; j++) {
                        get項目名称 = RString.HALF_SPACE.concat(get項目名称);
                    }
                } else if (hanyoListShutsuryokuKomoku.get汎用リスト出力項目リスト().get(i).get項目位置().equals(new RString("右詰め(1)"))) {
                    for (int j = 0; j < get項目桁数 - get項目桁数; j++) {
                        get項目名称 = get項目名称.concat(RString.HALF_SPACE);
                    }
                }
                if (i == 0) {
                    項目見出し = 項目見出し.concat(get項目名称);
//                    if (hanyoListShutsuryokuKomoku.get汎用リスト出力項目リスト().get(i).get出力項目日付区分().value().code().equals(new RString("02"))) {
//                        項目内容new = new RString(new FlexibleDate(項目内容new.toString()).wareki().firstYear(FirstYear.ICHI_NEN).toString());
//                    } else if (hanyoListShutsuryokuKomoku.get汎用リスト出力項目リスト().get(i).get出力項目日付区分().value().code().equals(new RString("03"))) {
//                        項目内容new = new RString(new FlexibleDate(項目内容new.toString()).wareki().firstYear(FirstYear.ICHI_NEN).toString());
//                    } else if (hanyoListShutsuryokuKomoku.get汎用リスト出力項目リスト().get(i).get出力項目日付区分().value().code().equals(new RString("04"))) {
//                        項目内容new = new RString(new FlexibleDate(項目内容new.toString()).wareki().toString());
//                    }
                    if (項目内容new == null) {
                        項目内容 = 項目内容.concat(RString.EMPTY);
                    } else {
                        項目内容 = 項目内容.concat(項目内容new);
                    }
                    出力桁数 = get項目桁数;
                    項目名称 = 出力文字の開始位置 + hanyoListShutsuryokuKomoku.get汎用リスト出力項目リスト().get(i).get項目名称().length();
                } else {
                    出力文字の開始位置 = 出力桁数 + hanyoListShutsuryokuKomoku.get項目間スペース数();
                    項目見出し = get項目見出し(項目見出し, 出力文字の開始位置 - 項目名称);
                    項目見出し = 項目見出し.concat(get項目名称);
                    項目内容 = get項目見出し(項目内容, 出力文字の開始位置 - 項目名称);
                    項目内容 = 項目内容.concat(項目内容new);
                    出力桁数 = 出力文字の開始位置 + get項目桁数;
                }
                HanyoListReport report = new HanyoListReport(processParamter.getHyoudai(), processParamter.getDetasyubetsumesyo(), 項目見出し, 項目内容, association, outputOrder);
                report.writeBy(reportSourceWriter);
                項目見出し = RString.EMPTY;
                項目内容 = RString.EMPTY;

            }
            if (isCSV出力) {
                if (processParamter.isCsvrenbanfuka()) {
                    if (i == 0) {
                        csvHeader.add(new RString("連番"));
                        csvContent.add(new RString(String.valueOf(連番)));
                    }
                    if (hanyoListShutsuryokuKomoku.get汎用リスト出力項目リスト().get(i).get項目名称() == null) {
                        csvHeader.add(RString.EMPTY);
                    } else {
                        csvHeader.add(hanyoListShutsuryokuKomoku.get汎用リスト出力項目リスト().get(i).get項目名称());
                    }
                    csvContent.add(項目内容new);
                } else {
                    csvHeader.add(hanyoListShutsuryokuKomoku.get汎用リスト出力項目リスト().get(i).get項目名称());
                    csvContent.add(項目内容new);
                }
            }
            if (連番 == 1 && processParamter.isCsvkomokumeifuka()) {
                eucCsvWriter1.writeLine(csvHeader);
            }
            eucCsvWriter1.writeLine(csvContent);
            csvContent = new ArrayList();
        }
    }

    @Override
    protected void afterExecute() {
        if (processParamter.isCsvkomokumeifuka() && eucCsvWriter.getCount() == 0) {
            eucCsvWriter.writeLine(HanyoListJigyoTaishoshaManager.createInstance().setBlank());
        }
        eucCsvWriter.close();
        eucCsvWriter1.close();
        AccessLogUUID log = AccessLogger.logEUC(UzUDE0835SpoolOutputType.Euc, personalDataList);
        if (isCSV出力) {
            manager.spool(eucFilePath, log);
        }
        バッチ出力条件リストの出力();
    }

    private void set帳表CSV出力() {
        if (processParamter.getSyutsuryoku().equals(new RString("帳表・CSV出力"))
                || processParamter.getSyutsuryoku().equals(new RString("CSVのみ出力"))) {
            isCSV出力 = true;
        }
        if (processParamter.getSyutsuryoku().equals(new RString("帳表・CSV出力"))
                || processParamter.getSyutsuryoku().equals(new RString("帳票のみ出力"))) {
            is帳票出力 = true;
        }

    }

    private RString get出力順(IOutputOrder order) {
        List<RString> 出力DB項目名 = new ArrayList();
        List<ISetSortItem> 設定項目リスト = order.get設定項目リスト();
        for (ISetSortItem item : 設定項目リスト) {
            出力DB項目名.add(item.getDB項目名());
        }
        if (!出力DB項目名.contains(SHIKIBETSUCODE)) {
            order.get設定項目リスト().add(new _SetSortItem(GyomuCode.DB介護保険, new RString("0009"), SHIKIBETSUCODE, NewpageType.選択不可,
                    0, YamawakeType.設定不可, SubGyomuCode.DBD介護受給, CodeShubetsu.EMPTY, 0, SortOrder.ASCENDING,
                    true, true, PageBreakType.設定なし, 0, 0));
        }
        RString 出力順 = MyBatisOrderByClauseCreator.create(HanyoListJigyoTaishoshaOrderby.class, order);
        return 出力順.concat(",二次予防事業対象者_履歴番号");
    }

    private PersonalData toPersonalData(HanyoRisutoJigyoTaishoshaEntity entity) {
        ExpandedInformation expandedInfo = new ExpandedInformation(new Code(new RString("0003")), new RString("被保険者番号"),
                entity.get二次予防事業対象者_被保険者番号());
        return PersonalData.of(entity.getPsmEntity() == null ? ShikibetsuCode.EMPTY : entity.getPsmEntity().getShikibetsuCode(), expandedInfo);
    }

    private void バッチ出力条件リストの出力() {
        RString 導入団体コード = association.getLasdecCode_().value();
        RString 市町村名 = association.get市町村名();
        RString 出力ページ数 = new RString(String.valueOf(eucCsvWriter.getCount()));
        RString 日本語ファイル名 = new RString("汎用リスト　事業対象者CSV");
        RString 英数字ファイル名 = new RString("HanyoList_Jigyotaisyosya.csv");
        RString ジョブ番号 = new RString(String.valueOf(JobContextHolder.getJobId()));
        List<RString> 出力条件 = new ArrayList<>();
        出力条件.add(CYUSYUTSUTAISYOSHA);
        RStringBuilder builder = new RStringBuilder();
        if (null != processParamter.getAtenacyusyutsujyoken()
                && null != processParamter.getAtenacyusyutsujyoken().getShichoson_Code()
                && !processParamter.getAtenacyusyutsujyoken().getShichoson_Code().equals(LasdecCode.EMPTY)) {
            builder.append(HOKENSHA);
            Association 地方公共団体 = get地方公共団体(processParamter.getAtenacyusyutsujyoken().getShichoson_Code());
            builder.append(地方公共団体.get市町村名());
            builder.append(COMMA);
        }
        if (null != processParamter.getKizyunnichi() && !processParamter.getKizyunnichi().isEmpty()) {
            builder.append(KIZYUNNICHI);
            builder.append(processParamter.getKizyunnichi().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(COMMA);
        }
        builder = get日付範囲(builder);
        if (processParamter.isJigyotaishoshadatacyusyutsu()) {
            builder.append(CHOKINNOMI);
            builder.append(COMMA);
        }
        if (!builder.toRString().isNullOrEmpty()) {
            List<RString> builderList = builder.toRString().substring(0, builder.toRString().length() - 1).split(COMMA.toString());
            for (RString build : builderList) {
                出力条件.add(build);
            }
        }
        if (null != processParamter.getAtenacyusyutsujyoken()
                && null != processParamter.getAtenacyusyutsujyoken().getAgeSelectKijun()) {
            RString get宛名抽出区分情報 = get宛名抽出区分情報();
            if (!get宛名抽出区分情報.isNullOrEmpty()) {
                出力条件.add(get宛名抽出区分情報());
            }
        }
        if (null != processParamter.getAtenacyusyutsujyoken()
                && null != processParamter.getAtenacyusyutsujyoken().getChiku_Kubun()) {
            RString get地区区分情報 = get地区選択区分情報();
            if (!get地区区分情報.isNullOrEmpty()) {
                List<RString> 地区区分情報 = get地区区分情報.substring(0, get地区区分情報.length() - 1).split(COMMA.toString());
                for (RString 情報 : 地区区分情報) {
                    出力条件.add(情報);
                }
            }
        }
        if (is帳票出力) {
            RString csv出力有無;
            RString csvファイル名;
            if (processParamter.getSyutsuryoku().equals(new RString("帳表・CSV出力"))) {
                csv出力有無 = new RString("あり");
                csvファイル名 = 英数字ファイル名;
            } else {
                csv出力有無 = new RString("なし");
                csvファイル名 = RString.EMPTY;
            }
            ReportOutputJokenhyoItem reportOutputJokenhyoItem = new ReportOutputJokenhyoItem(
                    new RString("DBD701013"),
                    導入団体コード,
                    市町村名,
                    ジョブ番号,
                    processParamter.getHyoudai(),
                    出力ページ数,
                    csv出力有無,
                    csvファイル名,
                    出力条件);
            IReportOutputJokenhyoPrinter printer = OutputJokenhyoFactory.createInstance(reportOutputJokenhyoItem);
            printer.print();
        } else if (processParamter.getSyutsuryoku().equals(new RString("CSVのみ出力"))) {
            EucFileOutputJokenhyoItem item = new EucFileOutputJokenhyoItem(
                    日本語ファイル名,
                    導入団体コード,
                    市町村名,
                    ジョブ番号,
                    英数字ファイル名,
                    new RString("DBD701013"),
                    出力ページ数,
                    出力条件);
            EucFileOutputJokenhyoFactory.createInstance(item).print();
        }
    }

    private RStringBuilder get日付範囲(RStringBuilder builder) {
        if (!processParamter.getHitsukehanifrom().isEmpty()
                && !processParamter.getHitsukehanito().isEmpty()) {
            builder.append(ChushutsuKomokuKubun.toValue(processParamter.getCyusyutsukomokukubun()).get名称());
            builder.append(SPACE);
            builder.append(COLON);
            builder.append(SPACE);
            builder.append(processParamter.getHitsukehanifrom().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(SPACE);
            builder.append(カラ);
            builder.append(SPACE);
            builder.append(processParamter.getHitsukehanito().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(COMMA);
        } else if (!processParamter.getHitsukehanifrom().isEmpty()
                && processParamter.getHitsukehanito().isEmpty()) {
            builder.append(ChushutsuKomokuKubun.toValue(processParamter.getCyusyutsukomokukubun()).get名称());
            builder.append(SPACE);
            builder.append(COLON);
            builder.append(SPACE);
            builder.append(processParamter.getHitsukehanifrom().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(SPACE);
            builder.append(カラ);
            builder.append(COMMA);
        } else if (processParamter.getHitsukehanifrom().isEmpty()
                && !processParamter.getHitsukehanito().isEmpty()) {
            builder.append(ChushutsuKomokuKubun.toValue(processParamter.getCyusyutsukomokukubun()).get名称());
            builder.append(SPACE);
            builder.append(COLON);
            builder.append(SPACE);
            builder.append(カラ);
            builder.append(SPACE);
            builder.append(processParamter.getHitsukehanito().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(COMMA);
        }
        return builder;
    }

    private RString get宛名抽出区分情報() {
        RStringBuilder builder = new RStringBuilder();
        if (NenreiSoChushutsuHoho.年齢範囲.equals(processParamter.getAtenacyusyutsujyoken().getAgeSelectKijun())
                && processParamter.getAtenacyusyutsujyoken().getNenreiKijunbi() != null) {
            builder = get年齢();
        } else if (NenreiSoChushutsuHoho.生年月日範囲.equals(processParamter.getAtenacyusyutsujyoken().getAgeSelectKijun())) {
            builder = get生年月日();
        }
        return builder.toRString();
    }

    private RString get地区選択区分情報() {
        RStringBuilder builder = new RStringBuilder();
        if (!RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getJusho_From())
                && !RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getJusho_To())) {
            builder.append(JUSHO);
            builder.append(get地区区間出力条件(processParamter.getAtenacyusyutsujyoken().getJusho_From(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_FromMesho(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_To(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_ToMesho()));
            builder.append(COMMA);
        } else if (!RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getJusho_From())
                && RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getJusho_To())) {
            builder.append(get地区区間出力条件(processParamter.getAtenacyusyutsujyoken().getJusho_From(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_FromMesho(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_To(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_ToMesho()));
            builder.append(COMMA);
        } else if (RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getJusho_From())
                && !RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getJusho_To())) {
            builder.append(get地区区間出力条件(processParamter.getAtenacyusyutsujyoken().getJusho_From(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_FromMesho(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_To(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_ToMesho()));
            builder.append(COMMA);
        }
        if (Chiku.地区.equals(processParamter.getAtenacyusyutsujyoken().getChiku_Kubun())) {
            if (!RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getChiku1_From())
                    && !RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getChiku1_To())) {
                builder.append(CHIKI_1);
                builder.append(COLON);
                builder.append(get地区区間出力条件(processParamter.getAtenacyusyutsujyoken().getChiku1_From(),
                        processParamter.getAtenacyusyutsujyoken().getChiku1_FromMesho(),
                        processParamter.getAtenacyusyutsujyoken().getChiku1_To(),
                        processParamter.getAtenacyusyutsujyoken().getChiku1_ToMesho()));
            } else if (!RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getChiku2_From())
                    && RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getChiku2_To())) {
                builder.append(CHIKI_2);
                builder.append(COLON);
                builder.append(get地区区間出力条件(processParamter.getAtenacyusyutsujyoken().getChiku2_From(),
                        processParamter.getAtenacyusyutsujyoken().getChiku2_FromMesho(),
                        RString.EMPTY,
                        RString.EMPTY));
            } else if (RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getChiku3_From())
                    && !RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getChiku3_To())) {
                builder.append(CHIKI_3);
                builder.append(COLON);
                builder.append(get地区区間出力条件(RString.EMPTY,
                        RString.EMPTY,
                        processParamter.getAtenacyusyutsujyoken().getChiku3_To(),
                        processParamter.getAtenacyusyutsujyoken().getChiku3_ToMesho()));
            }
            builder.append(COMMA);
        } else if (Chiku.行政区.equals(processParamter.getAtenacyusyutsujyoken().getChiku_Kubun())) {
            builder.append(GYOSEIKU);
            builder.append(COLON);
            builder.append(get地区区間出力条件(processParamter.getAtenacyusyutsujyoken().getGyoseiku_From(),
                    processParamter.getAtenacyusyutsujyoken().getGyoseiku_FromMesho(),
                    processParamter.getAtenacyusyutsujyoken().getGyoseiku_To(),
                    processParamter.getAtenacyusyutsujyoken().getGyoseiku_ToMesho()));
            builder.append(COMMA);
        } else if (Chiku.住所.equals(processParamter.getAtenacyusyutsujyoken().getChiku_Kubun())) {
            builder.append(JUSYO);
            builder.append(COLON);
            builder.append(get地区区間出力条件(processParamter.getAtenacyusyutsujyoken().getJusho_From(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_FromMesho(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_To(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_ToMesho()));
            builder.append(COMMA);
        }
        return builder.toRString();
    }

    private RString get地区区間出力条件(RString codeFrom, RString fromMesho, RString codeTo, RString toMesho) {
        RStringBuilder builder = new RStringBuilder();
        if (!RString.isNullOrEmpty(codeFrom)) {
            builder.append(左記号);
            builder.append(codeFrom);
            builder.append(右記号);
            builder.append(SPACE);
            builder.append(fromMesho);
            builder.append(SPACE);
        }
        builder.append(カラ);
        if (!RString.isNullOrEmpty(codeTo)) {
            builder.append(SPACE);
            builder.append(左記号);
            builder.append(codeTo);
            builder.append(右記号);
            builder.append(SPACE);
            builder.append(toMesho);
        }
        return builder.toRString();
    }

    private RStringBuilder get年齢() {
        RStringBuilder builder = new RStringBuilder();
        if (null != processParamter.getAtenacyusyutsujyoken().getNenreiRange()
                && null != processParamter.getAtenacyusyutsujyoken().getNenreiRange().getFrom()
                && null != processParamter.getAtenacyusyutsujyoken().getNenreiRange().getTo()) {
            builder.append(NENLEI);
            builder.append(SPACE);
            builder.append(COLON);
            builder.append(SPACE);
            builder.append(new RString(processParamter.getAtenacyusyutsujyoken().getNenreiRange().getFrom().toString()));
            builder.append(SAI);
            builder.append(SPACE);
            builder.append(カラ);
            builder.append(SPACE);
            builder.append(new RString(processParamter.getAtenacyusyutsujyoken().getNenreiRange().getTo().toString()));
            builder.append(SAI);
            builder.append(SPACE);
            builder.append(左記号);
            builder.append(NENLEIKIZYUNNICHI);
            builder.append(processParamter.getAtenacyusyutsujyoken().getNenreiKijunbi().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(右記号);
        } else if (null != processParamter.getAtenacyusyutsujyoken().getNenreiRange()
                && null != processParamter.getAtenacyusyutsujyoken().getNenreiRange().getFrom()
                && null == processParamter.getAtenacyusyutsujyoken().getNenreiRange().getTo()) {
            builder.append(NENLEI);
            builder.append(SPACE);
            builder.append(COLON);
            builder.append(SPACE);
            builder.append(new RString(processParamter.getAtenacyusyutsujyoken().getNenreiRange().getFrom().toString()));
            builder.append(SAI);
            builder.append(SPACE);
            builder.append(カラ);
            builder.append(SPACE);
            builder.append(左記号);
            builder.append(NENLEIKIZYUNNICHI);
            builder.append(processParamter.getAtenacyusyutsujyoken().getNenreiKijunbi().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(右記号);
        } else if (null != processParamter.getAtenacyusyutsujyoken().getNenreiRange()
                && null == processParamter.getAtenacyusyutsujyoken().getNenreiRange().getFrom()
                && null != processParamter.getAtenacyusyutsujyoken().getNenreiRange().getTo()) {
            builder.append(NENLEI);
            builder.append(SPACE);
            builder.append(COLON);
            builder.append(SPACE);
            builder.append(カラ);
            builder.append(SPACE);
            builder.append(new RString(processParamter.getAtenacyusyutsujyoken().getNenreiRange().getTo().toString()));
            builder.append(SAI);
            builder.append(SPACE);
            builder.append(左記号);
            builder.append(NENLEIKIZYUNNICHI);
            builder.append(processParamter.getAtenacyusyutsujyoken().getNenreiKijunbi().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(右記号);
        }
        return builder;
    }

    private RStringBuilder get生年月日() {
        RStringBuilder builder = new RStringBuilder();
        if (null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange()
                && null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getFrom()
                && null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getTo()) {
            builder.append(SEINENGAPPI);
            builder.append(COLON);
            builder.append(processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getFrom().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(SPACE);
            builder.append(カラ);
            builder.append(SPACE);
            builder.append(processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getTo().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
        } else if (null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange()
                && null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getFrom()
                && null == processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getTo()) {
            builder.append(SEINENGAPPI);
            builder.append(COLON);
            builder.append(processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getFrom().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(SPACE);
            builder.append(カラ);
        } else if (null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange()
                && null == processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getFrom()
                && null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getTo()) {
            builder.append(SEINENGAPPI);
            builder.append(COLON);
            builder.append(SPACE);
            builder.append(カラ);
            builder.append(SPACE);
            builder.append(processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getTo().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
        }
        return builder;
    }

    private Association get地方公共団体(LasdecCode 市町村コード) {
        IAssociationFinder finder = AssociationFinderFactory.createInstance();
        return finder.getAssociation(市町村コード);
    }

    private List<JuminShubetsu> get住民種別(List<JuminShubetsu> 住民種別List) {
        住民種別List.add(JuminShubetsu.日本人);
        住民種別List.add(JuminShubetsu.外国人);
        住民種別List.add(JuminShubetsu.住登外個人_日本人);
        住民種別List.add(JuminShubetsu.住登外個人_外国人);
        return 住民種別List;
    }

    private List<JuminJotai> get住民状態(List<JuminJotai> 住民状態List) {
        住民状態List.add(JuminJotai.住登外);
        住民状態List.add(JuminJotai.消除者);
        住民状態List.add(JuminJotai.転出者);
        住民状態List.add(JuminJotai.死亡者);
        return 住民状態List;
    }

    private RString get項目見出し(RString 項目見出し, int 出力文字の開始位置) {
        for (int i = 0; i < 出力文字の開始位置; i++) {
            項目見出し.concat(RString.HALF_SPACE);
        }
        return 項目見出し;
    }
}
