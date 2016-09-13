/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.dbc040050;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.kogakugassanshikyuketteitsuchisho.KogakugassanShikyuKetteiTsuchiIchiran;
import jp.co.ndensan.reams.db.dbc.business.core.kogakugassanshikyuketteitsuchisho.KogakugassanShikyuKetteitsuchisho;
import jp.co.ndensan.reams.db.dbc.business.report.dbc100053.GassanKetteiTsuchishoShiharaiYoteiBiYijiNashiReport;
import jp.co.ndensan.reams.db.dbc.business.report.dbc100054.GassanKetteiTsuchishoShiharaiYoteiBiYijiAriReport;
import jp.co.ndensan.reams.db.dbc.business.report.dbc200040.GassanShikyuFushikyuKetteishaIchiranOutPutOrder;
import jp.co.ndensan.reams.db.dbc.business.report.dbc200040.GassanShikyuFushikyuKetteishaIchiranPageBreak;
import jp.co.ndensan.reams.db.dbc.business.report.dbc200040.GassanShikyuFushikyuKetteishaIchiranParameter;
import jp.co.ndensan.reams.db.dbc.business.report.dbc200040.GassanShikyuFushikyuKetteishaIchiranReport;
import jp.co.ndensan.reams.db.dbc.definition.core.kaigogassan.KaigoGassan_ErrorKubun;
import jp.co.ndensan.reams.db.dbc.definition.core.kaigogassan.KaigoGassan_ErrorListType;
import jp.co.ndensan.reams.db.dbc.definition.mybatisprm.kogakugassanshikyuketteitsuchisho.KogakugassanShikyuKetteitsuchishoMybatisParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kogakugassanshikyuketteitsuchisho.KogakugassanShikyuKetteitsuchishoProcessParameter;
import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kogakugassanshikyuketteitsuchisho.KogakugassanShikyuKetteitsuchishoEntity;
import jp.co.ndensan.reams.db.dbc.entity.report.dbc100053.GassanKetteiTsuchishoShiharaiYoteiBiYijiNashiSource;
import jp.co.ndensan.reams.db.dbc.entity.report.dbc200040.GassanShikyuFushikyuKetteishaIchiranSource;
import jp.co.ndensan.reams.db.dbc.entity.report.gassanketteitsuchishoshiharaiyoteibiyijiari.GassanKetteiTsuchishoShiharaiYoteiBiYijiAriSource;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoHanyo;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoKyotsu;
import jp.co.ndensan.reams.db.dbz.definition.core.kyotsu.NinshoshaDenshikoinshubetsuCode;
import jp.co.ndensan.reams.db.dbz.service.core.basic.ChohyoSeigyoHanyoManager;
import jp.co.ndensan.reams.db.dbz.service.core.basic.ChohyoSeigyoKyotsuManager;
import jp.co.ndensan.reams.db.dbz.service.core.util.report.ReportUtil;
import jp.co.ndensan.reams.ua.uax.business.core.atesaki.AtesakiFactory;
import jp.co.ndensan.reams.ua.uax.business.core.atesaki.IAtesaki;
import jp.co.ndensan.reams.ua.uax.business.core.koza.Koza;
import jp.co.ndensan.reams.ua.uax.business.core.koza.KozaSearchKeyBuilder;
import jp.co.ndensan.reams.ua.uax.business.report.parts.sofubutsuatesaki.SofubutsuAtesakiEditorBuilder;
import jp.co.ndensan.reams.ua.uax.business.report.parts.sofubutsuatesaki.SofubutsuAtesakiSourceBuilder;
import jp.co.ndensan.reams.ua.uax.business.report.parts.util.atesaki.ReportAtesakiEditor;
import jp.co.ndensan.reams.ua.uax.service.core.koza.IKozaManager;
import jp.co.ndensan.reams.ua.uax.service.core.koza.KozaService;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IOutputOrder;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.ISetSortItem;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.MyBatisOrderByClauseCreator;
import jp.co.ndensan.reams.ur.urz.definition.core.ninshosha.KenmeiFuyoKubunType;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;
import jp.co.ndensan.reams.ur.urz.entity.report.sofubutsuatesaki.SofubutsuAtesakiSource;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.core.reportoutputorder.ChohyoShutsuryokujunFinderFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchKeyBreakBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.euc.definition.UzUDE0831EucAccesslogFileType;
import jp.co.ndensan.reams.uz.uza.euc.io.EucEntityId;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvListWriter;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.report.source.breaks.PageBreaker;
import jp.co.ndensan.reams.uz.uza.spool.FileSpoolManager;
import jp.co.ndensan.reams.uz.uza.spool.entities.UzUDE0835SpoolOutputType;
import jp.co.ndensan.reams.uz.uza.ui.binding.propertyenum.DisplayTimeFormat;
import jp.co.ndensan.reams.uz.uza.util.db.IDbColumnMappable;

/**
 * 高額合算支給決定通知書発行processクラスです。
 *
 * @reamsid_L DBC-2300-030 xuhao
 */
public class SetKougakuGassanKetteiTsuuchishoProcess extends BatchKeyBreakBase<KogakugassanShikyuKetteitsuchishoEntity> {

    private static final RString READ_DATA_ID = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate."
            + "kogakugassanshikyuketteitsuchisho.IKogakugassanShikyuKetteitsuchishoMapper.select高額合算支給決定通知書データ");
    private KogakugassanShikyuKetteitsuchishoProcessParameter processParameter;
    private static final int INT_0 = 0;
    private static final int INT_1 = 1;
    private static final RString 文字列_0 = new RString("0");
    private static final RString 文字列_1 = new RString("1");
    // TODO QA 1517
    private static final EucEntityId EUC_ENTITY_ID = new EucEntityId(new RString("DBC900002"));
    private static final RString 出力ファイル名 = new RString("処理結果リスト.csv");
    private static final RString コンマ = new RString(",");
    private static final RString ダブル引用符 = new RString("\"");
    private int 対象件数;
    private int 行目数;
    private RString 取り消し線;
    private RString 帳票タイトル;
    private RString 帳票タイトル_抹消線あり１;
    private RString 帳票タイトル_抹消線あり２;
    private RString 帳票タイトル_抹消線あり３;
    private RString 帳票タイトル_抹消線あり４;
    private RString 帳票タイトル_内部帳票文字切れ制御;
    private List<ChohyoSeigyoHanyo> 帳票制御汎用キーList;
    private Association 地方公共団体;
    private List<RString> headerList;
    private IOutputOrder 並び順;
    private List<RString> 改頁項目リスト;
    private RString 支給不支給区分;
    private int 連番;
    private int 支給不支給件数;
    private Decimal 自己負担総額の合計金額;
    private Decimal 支給額の合計金額;
    FileSpoolManager eucmanager;
    RString eucFilePath;
    private KogakugassanShikyuKetteitsuchishoEntity nowentity;
    private boolean key_1flag = false;
    private boolean key_2flag = false;
    private boolean key_3flag = false;
    private boolean key_4flag = false;
    private boolean key_5flag = false;
    private static final RString HEADER_作成日時 = new RString("作成日時");
    private static final RString HEADER_処理名 = new RString("処理名");
    private static final RString HEADER_証記載保険者番号 = new RString("証記載保険者番号");
    private static final RString HEADER_被保険者番号 = new RString("被保険者番号");
    private static final RString HEADER_被保険者カナ氏名 = new RString("被保険者カナ氏名");
    private static final RString HEADER_被保険者氏名 = new RString("被保険者氏名");
    private static final RString HEADER_エラー内容 = new RString("エラー内容");
    private static final RString HEADER_備考 = new RString("備考");
    private static final RString バッチＩＤ = new RString("DBC040050_KogakugassanShikyuKetteitsuchisho");
    private static final ReportId 帳票分類ID = new ReportId("DBC200201_GassanJigyobunKetteiTsuchisho");
    private static final ReportId 出力順帳票分類ID = new ReportId("DBC100053_GassanKetteiTsuchisho");
    private static final FlexibleYear 管理年度 = new FlexibleYear("0000");
    private static final RString 項目名_取り消し線 = new RString("取り消し線");
    private static final RString 項目名_帳票タイトル = new RString("帳票タイトル");
    private static final RString 項目名_帳票タイトル_抹消線あり１ = new RString("帳票タイトル_抹消線あり１");
    private static final RString 項目名_帳票タイトル_抹消線あり２ = new RString("帳票タイトル_抹消線あり１");
    private static final RString 項目名_帳票タイトル_抹消線あり３ = new RString("帳票タイトル_抹消線あり１");
    private static final RString 項目名_帳票タイトル_抹消線あり４ = new RString("帳票タイトル_抹消線あり１");
    private static final RString 項目名_帳票タイトル_持ち物内容文言１ = new RString("持ち物内容文言１");
    private static final RString 項目名_帳票タイトル_持ち物内容文言２ = new RString("持ち物内容文言２");
    private static final RString 項目名_帳票タイトル_持ち物内容文言３ = new RString("持ち物内容文言３");
    private static final RString 支給額タイトル = new RString("支給額");
    private static final SubGyomuCode サブ業務コード = SubGyomuCode.DBC介護給付;
    private static final ReportId 帳票分類ID_内部帳票文字切れ = new ReportId("DBC100053_GassanKetteiTsuchisho");
    private static final RString ORDER_BY = new RString("order by");
    private static final FlexibleDate 作成日_QA = new FlexibleDate("20160501");

    private BatchReportWriter<GassanShikyuFushikyuKetteishaIchiranSource> batchReportWriter_一覧表;
    private ReportSourceWriter<GassanShikyuFushikyuKetteishaIchiranSource> reportSourceWriter_一覧表;
    private BatchReportWriter<GassanKetteiTsuchishoShiharaiYoteiBiYijiNashiSource> batchReportWriter_通知書_DBC100053;
    private ReportSourceWriter<GassanKetteiTsuchishoShiharaiYoteiBiYijiNashiSource> reportSourceWriter_通知書_DBC100053;
    private BatchReportWriter<GassanKetteiTsuchishoShiharaiYoteiBiYijiAriSource> batchReportWriter_通知書_DBC100054;
    private ReportSourceWriter<GassanKetteiTsuchishoShiharaiYoteiBiYijiAriSource> reportSourceWriter_通知書_DBC100054;

    @BatchWriter
    private CsvListWriter csvListWriter;

    @Override
    protected void initialize() {
        super.initialize();
        対象件数 = INT_0;
        行目数 = INT_0;
        取り消し線 = RString.EMPTY;
        帳票タイトル = RString.EMPTY;
        帳票タイトル_抹消線あり１ = RString.EMPTY;
        帳票タイトル_抹消線あり２ = RString.EMPTY;
        帳票タイトル_抹消線あり３ = RString.EMPTY;
        帳票タイトル_抹消線あり４ = RString.EMPTY;
        帳票タイトル_内部帳票文字切れ制御 = RString.EMPTY;
        帳票制御汎用キーList = new ArrayList<>();
        地方公共団体 = null;
        headerList = new ArrayList<>();
        改頁項目リスト = new ArrayList<>();
        支給不支給区分 = RString.EMPTY;
        連番 = INT_1;
        支給不支給件数 = INT_0;
        自己負担総額の合計金額 = Decimal.ZERO;
        支給額の合計金額 = Decimal.ZERO;
        RString key1 = KaigoGassan_ErrorListType.リストタイプ1.getキー1();
        RString key2 = KaigoGassan_ErrorListType.リストタイプ1.getキー2();
        RString key3 = KaigoGassan_ErrorListType.リストタイプ1.getキー3();
        RString key4 = KaigoGassan_ErrorListType.リストタイプ1.getキー4();
        RString key5 = KaigoGassan_ErrorListType.リストタイプ1.getキー5();
        headerList.add(HEADER_作成日時);
        headerList.add(HEADER_処理名);
        headerList.add(HEADER_証記載保険者番号);
        headerList.add(HEADER_被保険者番号);
        headerList.add(HEADER_被保険者カナ氏名);
        headerList.add(HEADER_被保険者氏名);
        if (!RString.isNullOrEmpty(key1)) {
            headerList.add(key1);
            this.key_1flag = true;
        }
        if (!RString.isNullOrEmpty(key2)) {
            headerList.add(key2);
            this.key_2flag = true;
        }
        if (!RString.isNullOrEmpty(key3)) {
            headerList.add(key3);
            this.key_3flag = true;
        }
        if (!RString.isNullOrEmpty(key4)) {
            headerList.add(key4);
            this.key_4flag = true;
        }
        if (!RString.isNullOrEmpty(key5)) {
            headerList.add(key5);
            this.key_5flag = true;
        }
        headerList.add(HEADER_エラー内容);
        headerList.add(HEADER_備考);
        並び順 = ChohyoShutsuryokujunFinderFactory.createInstance().get出力順(
                SubGyomuCode.DBC介護給付, 出力順帳票分類ID, Long.parseLong(processParameter.get改頁出力順ID().toString()));
        eucmanager = new FileSpoolManager(UzUDE0835SpoolOutputType.EucOther,
                EUC_ENTITY_ID, UzUDE0831EucAccesslogFileType.Csv);
        RString spoolWorkPath = eucmanager.getEucOutputDirectry();
        eucFilePath = Path.combinePath(spoolWorkPath, 出力ファイル名);
        nowentity = null;
    }

    @Override
    protected void beforeExecute() {
        ChohyoSeigyoHanyoManager 帳票制御汎用Manager = new ChohyoSeigyoHanyoManager();
        ChohyoSeigyoHanyo 帳票制御汎用取り消し線 = 帳票制御汎用Manager.get帳票制御汎用(SubGyomuCode.DBC介護給付, 帳票分類ID,
                管理年度, 項目名_取り消し線);
        if (帳票制御汎用取り消し線 != null) {
            取り消し線 = 帳票制御汎用取り消し線.get設定値();
        }
        ChohyoSeigyoHanyo 帳票制御汎用帳票タイトル = 帳票制御汎用Manager.get帳票制御汎用(SubGyomuCode.DBC介護給付, 帳票分類ID,
                管理年度, 項目名_帳票タイトル);
        if (帳票制御汎用帳票タイトル != null) {
            帳票タイトル = 帳票制御汎用帳票タイトル.get設定値();
        }
        ChohyoSeigyoHanyo 帳票制御汎用帳票タイトル_抹消線あり１ = 帳票制御汎用Manager.get帳票制御汎用(SubGyomuCode.DBC介護給付, 帳票分類ID,
                管理年度, 項目名_帳票タイトル_抹消線あり１);
        if (帳票制御汎用帳票タイトル_抹消線あり１ != null) {
            帳票タイトル_抹消線あり１ = 帳票制御汎用帳票タイトル_抹消線あり１.get設定値();
        }
        ChohyoSeigyoHanyo 帳票制御汎用帳票タイトル_抹消線あり２ = 帳票制御汎用Manager.get帳票制御汎用(SubGyomuCode.DBC介護給付, 帳票分類ID,
                管理年度, 項目名_帳票タイトル_抹消線あり２);
        if (帳票制御汎用帳票タイトル_抹消線あり２ != null) {
            帳票タイトル_抹消線あり２ = 帳票制御汎用帳票タイトル_抹消線あり２.get設定値();
        }
        ChohyoSeigyoHanyo 帳票制御汎用帳票タイトル_抹消線あり３ = 帳票制御汎用Manager.get帳票制御汎用(SubGyomuCode.DBC介護給付, 帳票分類ID,
                管理年度, 項目名_帳票タイトル_抹消線あり３);
        if (帳票制御汎用帳票タイトル_抹消線あり３ != null) {
            帳票タイトル_抹消線あり３ = 帳票制御汎用帳票タイトル_抹消線あり３.get設定値();
        }
        ChohyoSeigyoHanyo 帳票制御汎用帳票タイトル_抹消線あり４ = 帳票制御汎用Manager.get帳票制御汎用(SubGyomuCode.DBC介護給付, 帳票分類ID,
                管理年度, 項目名_帳票タイトル_抹消線あり４);
        if (帳票制御汎用帳票タイトル_抹消線あり４ != null) {
            帳票タイトル_抹消線あり４ = 帳票制御汎用帳票タイトル_抹消線あり４.get設定値();
        }
        ChohyoSeigyoHanyo 帳票制御汎用帳票タイトル_持ち物内容文言１ = 帳票制御汎用Manager.get帳票制御汎用(SubGyomuCode.DBC介護給付, 帳票分類ID,
                管理年度, 項目名_帳票タイトル_持ち物内容文言１);
        帳票制御汎用キーList.add(帳票制御汎用帳票タイトル_持ち物内容文言１);
        ChohyoSeigyoHanyo 帳票制御汎用帳票タイトル_持ち物内容文言２ = 帳票制御汎用Manager.get帳票制御汎用(SubGyomuCode.DBC介護給付, 帳票分類ID,
                管理年度, 項目名_帳票タイトル_持ち物内容文言２);
        帳票制御汎用キーList.add(帳票制御汎用帳票タイトル_持ち物内容文言２);
        ChohyoSeigyoHanyo 帳票制御汎用帳票タイトル_持ち物内容文言３ = 帳票制御汎用Manager.get帳票制御汎用(SubGyomuCode.DBC介護給付, 帳票分類ID,
                管理年度, 項目名_帳票タイトル_持ち物内容文言３);
        帳票制御汎用キーList.add(帳票制御汎用帳票タイトル_持ち物内容文言３);
        ChohyoSeigyoKyotsuManager manager = new ChohyoSeigyoKyotsuManager();
        ChohyoSeigyoKyotsu 帳票制御共通 = manager.get帳票制御共通(サブ業務コード, 帳票分類ID_内部帳票文字切れ);
        if (帳票制御共通 != null) {
            帳票タイトル_内部帳票文字切れ制御 = 帳票制御共通.get内部帳票文字切れ制御();
        }
        地方公共団体 = AssociationFinderFactory.createInstance().getAssociation();
        if (並び順 != null) {
            for (ISetSortItem item : 並び順.get設定項目リスト()) {
                if (item.is改頁項目()) {
                    改頁項目リスト.add(item.get項目名());
                }
            }
        }
    }

    @Override
    protected IBatchReader createReader() {
        KogakugassanShikyuKetteitsuchishoMybatisParameter 高額合算支給不支給決定データParameter
                = new KogakugassanShikyuKetteitsuchishoMybatisParameter();
        if (並び順 != null) {
            高額合算支給不支給決定データParameter.set出力順(MyBatisOrderByClauseCreator.create(
                    GassanShikyuFushikyuKetteishaIchiranOutPutOrder.class, 並び順).replace(ORDER_BY, RString.EMPTY));
        } else {
            高額合算支給不支給決定データParameter.set出力順(null);
        }
        return new BatchDbReader(READ_DATA_ID, 高額合算支給不支給決定データParameter);
    }

    @Override
    protected void createWriter() {
        PageBreaker<GassanShikyuFushikyuKetteishaIchiranSource> breaker = new GassanShikyuFushikyuKetteishaIchiranPageBreak(改頁項目リスト);
        batchReportWriter_一覧表 = BatchReportFactory.createBatchReportWriter(
                ReportIdDBC.DBC200040.getReportId().value(), SubGyomuCode.DBC介護給付).addBreak(breaker).create();
        reportSourceWriter_一覧表 = new ReportSourceWriter<>(batchReportWriter_一覧表);
        batchReportWriter_通知書_DBC100053 = BatchReportFactory.createBatchReportWriter(
                ReportIdDBC.DBC100053.getReportId().value(), SubGyomuCode.DBC介護給付).create();
        reportSourceWriter_通知書_DBC100053 = new ReportSourceWriter<>(batchReportWriter_通知書_DBC100053);
        batchReportWriter_通知書_DBC100054 = BatchReportFactory.createBatchReportWriter(
                ReportIdDBC.DBC100054.getReportId().value(), SubGyomuCode.DBC介護給付).create();
        reportSourceWriter_通知書_DBC100054 = new ReportSourceWriter<>(batchReportWriter_通知書_DBC100054);
        csvListWriter = new CsvListWriter.InstanceBuilder(eucFilePath).setNewLine(NewLine.CRLF)
                .setDelimiter(コンマ)
                .setEnclosure(ダブル引用符)
                .setEncode(Encode.SJIS)
                .hasHeader(true).setHeader(headerList)
                .build();
    }

    @Override
    protected void keyBreakProcess(KogakugassanShikyuKetteitsuchishoEntity entity) {
    }

    @Override
    protected void usualProcess(KogakugassanShikyuKetteitsuchishoEntity entity) {
        nowentity = entity;
        if (getBefore() != null && new GassanShikyuFushikyuKetteishaIchiranPageBreak(改頁項目リスト).is改頁(entity, getBefore())) {
            連番 = INT_1;
        }
        if (entity.get被保検者情報() == null) {
            List<RString> outputList = getCSVファイル(entity);
            csvListWriter.writeLine(outputList);
        }
        SofubutsuAtesakiSource compSofubutsuAtesakiソース = getCompSofubutsuAtesakiソース(entity);
        Koza 口座情報Entity = get口座情報(entity);
        対象件数++;
        KogakugassanShikyuKetteitsuchisho 高額合算支給決定通知書Entity
                = get高額合算支給決定通知書Entity(entity, compSofubutsuAtesakiソース, processParameter, 口座情報Entity);
        if (processParameter.get支払予定日() == null || processParameter.get支払予定日().isEmpty()) {
            GassanKetteiTsuchishoShiharaiYoteiBiYijiNashiReport 通知書report_DBC100053 = new GassanKetteiTsuchishoShiharaiYoteiBiYijiNashiReport(
                    高額合算支給決定通知書Entity, getCompNinshoshaソース_DBC100053(), 帳票制御汎用キーList);
            通知書report_DBC100053.writeBy(reportSourceWriter_通知書_DBC100053);
        } else {
            GassanKetteiTsuchishoShiharaiYoteiBiYijiAriReport 通知書report_DBC100054 = new GassanKetteiTsuchishoShiharaiYoteiBiYijiAriReport(
                    高額合算支給決定通知書Entity, getCompNinshoshaソース_DBC100054(), 帳票制御汎用キーList);
            通知書report_DBC100054.writeBy(reportSourceWriter_通知書_DBC100054);
        }
        if (getBefore() != null && !entity.getShikyuKubun().equals(getBefore().getShikyuKubun())) {
            KogakugassanShikyuKetteiTsuchiIchiran 高額合算支給決定者一覧表Entity = new KogakugassanShikyuKetteiTsuchiIchiran();
            高額合算支給決定者一覧表Entity.set出力順1(entity.getShutsuryokujunMei1());
            高額合算支給決定者一覧表Entity.set出力順2(entity.getShutsuryokujunMei2());
            高額合算支給決定者一覧表Entity.set出力順3(entity.getShutsuryokujunMei3());
            高額合算支給決定者一覧表Entity.set出力順4(entity.getShutsuryokujunMei4());
            高額合算支給決定者一覧表Entity.set出力順5(entity.getShutsuryokujunMei5());
            高額合算支給決定者一覧表Entity.set改頁1(entity.getKaiPeiji1());
            高額合算支給決定者一覧表Entity.set改頁2(entity.getKaiPeiji2());
            高額合算支給決定者一覧表Entity.set改頁3(entity.getKaiPeiji3());
            高額合算支給決定者一覧表Entity.set改頁4(entity.getKaiPeiji4());
            高額合算支給決定者一覧表Entity.set改頁5(entity.getKaiPeiji5());
            高額合算支給決定者一覧表Entity.set支給不支給区分(支給不支給区分);
            高額合算支給決定者一覧表Entity.set帳票通番(対象件数);
            GassanShikyuFushikyuKetteishaIchiranReport 一覧表合計report = new GassanShikyuFushikyuKetteishaIchiranReport(高額合算支給決定者一覧表Entity,
                    processParameter.get処理日時(), true, getGassanShikyuFushikyuKetteishaIchiranParameter(), 帳票タイトル_内部帳票文字切れ制御);
            一覧表合計report.writeBy(reportSourceWriter_一覧表);
            支給不支給件数 = INT_0;
            自己負担総額の合計金額 = Decimal.ZERO;
            支給額の合計金額 = Decimal.ZERO;
        }
        KogakugassanShikyuKetteiTsuchiIchiran 高額合算支給決定者一覧表Entity
                = get高額合算支給決定者一覧表Entity(entity, 口座情報Entity);
        GassanShikyuFushikyuKetteishaIchiranReport 一覧表report = new GassanShikyuFushikyuKetteishaIchiranReport(高額合算支給決定者一覧表Entity,
                processParameter.get処理日時(), false, getGassanShikyuFushikyuKetteishaIchiranParameter(), 帳票タイトル_内部帳票文字切れ制御);
        一覧表report.writeBy(reportSourceWriter_一覧表);
        支給不支給件数++;
        連番++;
        if (entity.getJikoFutanSogaku() != null) {
            自己負担総額の合計金額 = 自己負担総額の合計金額.add(entity.getJikoFutanSogaku());
        }
        if (entity.getShikyugaku() != null) {
            支給額の合計金額 = 支給額の合計金額.add(entity.getShikyugaku());
        }
        支給不支給区分 = entity.getShikyuKubun();
    }

    @Override
    protected void afterExecute() {
        if (nowentity != null) {
            KogakugassanShikyuKetteiTsuchiIchiran 高額合算支給決定者一覧表Entity = new KogakugassanShikyuKetteiTsuchiIchiran();
            高額合算支給決定者一覧表Entity.set出力順1(nowentity.getShutsuryokujunMei1());
            高額合算支給決定者一覧表Entity.set出力順2(nowentity.getShutsuryokujunMei2());
            高額合算支給決定者一覧表Entity.set出力順3(nowentity.getShutsuryokujunMei3());
            高額合算支給決定者一覧表Entity.set出力順4(nowentity.getShutsuryokujunMei4());
            高額合算支給決定者一覧表Entity.set出力順5(nowentity.getShutsuryokujunMei5());
            高額合算支給決定者一覧表Entity.set改頁1(nowentity.getKaiPeiji1());
            高額合算支給決定者一覧表Entity.set改頁2(nowentity.getKaiPeiji2());
            高額合算支給決定者一覧表Entity.set改頁3(nowentity.getKaiPeiji3());
            高額合算支給決定者一覧表Entity.set改頁4(nowentity.getKaiPeiji4());
            高額合算支給決定者一覧表Entity.set改頁5(nowentity.getKaiPeiji5());
            高額合算支給決定者一覧表Entity.set支給不支給区分(支給不支給区分);
            高額合算支給決定者一覧表Entity.set帳票通番(対象件数);
            GassanShikyuFushikyuKetteishaIchiranReport 一覧表合計report = new GassanShikyuFushikyuKetteishaIchiranReport(高額合算支給決定者一覧表Entity,
                    processParameter.get処理日時(), true, getGassanShikyuFushikyuKetteishaIchiranParameter(), 帳票タイトル_内部帳票文字切れ制御);
            一覧表合計report.writeBy(reportSourceWriter_一覧表);
        }
        csvListWriter.close();
        eucmanager.spool(SubGyomuCode.DBC介護給付, eucFilePath);
        batchReportWriter_通知書_DBC100053.close();
        batchReportWriter_通知書_DBC100054.close();
        batchReportWriter_一覧表.close();
    }

    private Koza get口座情報(KogakugassanShikyuKetteitsuchishoEntity entity) {
        Koza 口座情報Entity = null;
        if (entity.get口座情報() != null) {
            KozaSearchKeyBuilder builder = new KozaSearchKeyBuilder();
            List<RString> 業務固有キーリスト = new ArrayList<>();
            業務固有キーリスト.add(entity.get口座情報().get業務固有キー());
            builder.setサブ業務コード(entity.get口座情報().getサブ業務コード());
            builder.set業務コード(entity.get口座情報().get業務コード());
            builder.set科目コード(entity.get口座情報().get科目コード());
            builder.set業務固有キーリスト(業務固有キーリスト);
            builder.set用途区分(entity.get口座情報().get用途区分());
            IKozaManager iKozaManager = KozaService.createKozaManager();
            口座情報Entity = iKozaManager.get口座(builder.build()) == null || iKozaManager.get口座(builder.build()).isEmpty()
                    ? null : iKozaManager.get口座(builder.build()).get(0);
        }
        return 口座情報Entity;
    }

    private List<RString> getCSVファイル(KogakugassanShikyuKetteitsuchishoEntity entity) {
        List<RString> rStringList = new ArrayList<>();
        if (行目数 == 0) {
            RDateTime 作成日時 = RDateTime.now();
            RString 作成日 = 作成日時.getDate().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
            RString 作成時 = 作成日時.getTime()
                    .toFormattedTimeString(DisplayTimeFormat.HH時mm分ss秒);
            rStringList.add(作成日.concat(RString.HALF_SPACE).concat(作成時));
            行目数++;
        } else {
            rStringList.add(RString.EMPTY);
        }
        rStringList.add(バッチＩＤ);
        rStringList.add(getValue(entity.getHokenshaNo()));
        rStringList.add(getValue(entity.getHihokenshaNo()));
        rStringList.add(RString.EMPTY);
        rStringList.add(RString.EMPTY);
        if (this.key_1flag) {
            rStringList.add(getValue(entity.getHihokenshaNo()));
        }
        if (this.key_2flag) {
            rStringList.add(RString.EMPTY);
        }
        if (this.key_3flag) {
            rStringList.add(RString.EMPTY);
        }
        if (this.key_4flag) {
            rStringList.add(RString.EMPTY);
        }
        if (this.key_5flag) {
            rStringList.add(RString.EMPTY);
        }
        rStringList.add(KaigoGassan_ErrorKubun.被保険者情報取得エラー.get名称());
        rStringList.add(RString.EMPTY);
        return rStringList;
    }

    private RString getValue(IDbColumnMappable column) {
        if (null == column) {
            return RString.EMPTY;
        }
        return column.getColumnValue();
    }

    private KogakugassanShikyuKetteitsuchisho get高額合算支給決定通知書Entity(KogakugassanShikyuKetteitsuchishoEntity 高額合算支給決定通知書データ,
            SofubutsuAtesakiSource compSofubutsuAtesakiソース,
            KogakugassanShikyuKetteitsuchishoProcessParameter processParameter,
            Koza 口座情報Entity) {
        KogakugassanShikyuKetteitsuchisho 高額合算支給決定通知書Entity = new KogakugassanShikyuKetteitsuchisho();
        高額合算支給決定通知書Entity.set支給不支給区分(高額合算支給決定通知書データ.getShikyuKubun());
        高額合算支給決定通知書Entity.set出力順1(高額合算支給決定通知書データ.getShutsuryokujunMei1());
        高額合算支給決定通知書Entity.set出力順2(高額合算支給決定通知書データ.getShutsuryokujunMei2());
        高額合算支給決定通知書Entity.set出力順3(高額合算支給決定通知書データ.getShutsuryokujunMei3());
        高額合算支給決定通知書Entity.set出力順4(高額合算支給決定通知書データ.getShutsuryokujunMei4());
        高額合算支給決定通知書Entity.set出力順5(高額合算支給決定通知書データ.getShutsuryokujunMei5());
        高額合算支給決定通知書Entity.set改頁1(高額合算支給決定通知書データ.getKaiPeiji1());
        高額合算支給決定通知書Entity.set改頁2(高額合算支給決定通知書データ.getKaiPeiji2());
        高額合算支給決定通知書Entity.set改頁3(高額合算支給決定通知書データ.getKaiPeiji3());
        高額合算支給決定通知書Entity.set改頁4(高額合算支給決定通知書データ.getKaiPeiji4());
        高額合算支給決定通知書Entity.set改頁5(高額合算支給決定通知書データ.getKaiPeiji5());
        if (compSofubutsuAtesakiソース != null) {
            高額合算支給決定通知書Entity.set郵便番号(compSofubutsuAtesakiソース.yubinNo);
            高額合算支給決定通知書Entity.set行政区(compSofubutsuAtesakiソース.gyoseiku);
            高額合算支給決定通知書Entity.set住所Text(compSofubutsuAtesakiソース.jushoText);
            高額合算支給決定通知書Entity.set住所1(compSofubutsuAtesakiソース.jusho1);
            高額合算支給決定通知書Entity.set住所2(compSofubutsuAtesakiソース.jusho2);
            高額合算支給決定通知書Entity.set住所3(compSofubutsuAtesakiソース.jusho3);
            高額合算支給決定通知書Entity.set方書Text(compSofubutsuAtesakiソース.katagakiText);
            高額合算支給決定通知書Entity.set方書1(compSofubutsuAtesakiソース.katagaki1);
            高額合算支給決定通知書Entity.set方書2(compSofubutsuAtesakiソース.katagaki2);
            高額合算支給決定通知書Entity.set方書Small1(compSofubutsuAtesakiソース.katagakiSmall1);
            高額合算支給決定通知書Entity.set方書Small2(compSofubutsuAtesakiソース.katagakiSmall2);
            高額合算支給決定通知書Entity.set代納人区分(compSofubutsuAtesakiソース.dainoKubunMei);
            高額合算支給決定通知書Entity.set氏名Text(compSofubutsuAtesakiソース.shimeiText);
            高額合算支給決定通知書Entity.set氏名1(compSofubutsuAtesakiソース.shimei1);
            高額合算支給決定通知書Entity.set氏名2(compSofubutsuAtesakiソース.shimei2);
            高額合算支給決定通知書Entity.set氏名Small1(compSofubutsuAtesakiソース.shimeiSmall1);
            高額合算支給決定通知書Entity.set氏名Small2(compSofubutsuAtesakiソース.shimeiSmall2);
            高額合算支給決定通知書Entity.set氏名samabunText(compSofubutsuAtesakiソース.samabunShimeiText);
            高額合算支給決定通知書Entity.set氏名samabun1(compSofubutsuAtesakiソース.samabunShimei1);
            高額合算支給決定通知書Entity.set氏名samabun2(compSofubutsuAtesakiソース.samabunShimei2);
            高額合算支給決定通知書Entity.set氏名samabunSmall1(compSofubutsuAtesakiソース.samabunShimeiSmall1);
            高額合算支給決定通知書Entity.set氏名samabunSmall2(compSofubutsuAtesakiソース.samabunShimeiSmall2);
            高額合算支給決定通知書Entity.set名称付与1(compSofubutsuAtesakiソース.meishoFuyo1);
            高額合算支給決定通知書Entity.set名称付与2(compSofubutsuAtesakiソース.meishoFuyo2);
            高額合算支給決定通知書Entity.set様文1(compSofubutsuAtesakiソース.samaBun1);
            高額合算支給決定通知書Entity.set様文2(compSofubutsuAtesakiソース.samaBun2);
            高額合算支給決定通知書Entity.set括弧Left1(compSofubutsuAtesakiソース.kakkoLeft1);
            高額合算支給決定通知書Entity.set括弧Left2(compSofubutsuAtesakiソース.kakkoLeft2);
            高額合算支給決定通知書Entity.set括弧Right1(compSofubutsuAtesakiソース.kakkoRight1);
            高額合算支給決定通知書Entity.set括弧Right2(compSofubutsuAtesakiソース.kakkoRight2);
            高額合算支給決定通知書Entity.setカスタマバーコード(compSofubutsuAtesakiソース.customerBarCode);
        }
        高額合算支給決定通知書Entity.set文書番号(processParameter.get文書番号());
        高額合算支給決定通知書Entity.set発行日(processParameter.get発行日());
        if (!取り消し線.isEmpty()) {
            if (取り消し線.equals(文字列_0)) {
                高額合算支給決定通知書Entity.setタイトル(帳票タイトル);
            } else if (文字列_1.equals(高額合算支給決定通知書Entity.get支給不支給区分())) {
                高額合算支給決定通知書Entity.setタイトル21(帳票タイトル_抹消線あり１);
                高額合算支給決定通知書Entity.setタイトル221(帳票タイトル_抹消線あり２);
                高額合算支給決定通知書Entity.setタイトル222(RString.EMPTY);
                高額合算支給決定通知書Entity.setタイトル231(RString.EMPTY);
                高額合算支給決定通知書Entity.setタイトル232(帳票タイトル_抹消線あり３);
                高額合算支給決定通知書Entity.setタイトル24(帳票タイトル_抹消線あり４);
            } else {
                高額合算支給決定通知書Entity.setタイトル21(帳票タイトル_抹消線あり１);
                高額合算支給決定通知書Entity.setタイトル221(RString.EMPTY);
                高額合算支給決定通知書Entity.setタイトル222(帳票タイトル_抹消線あり２);
                高額合算支給決定通知書Entity.setタイトル231(帳票タイトル_抹消線あり３);
                高額合算支給決定通知書Entity.setタイトル232(RString.EMPTY);
                高額合算支給決定通知書Entity.setタイトル24(帳票タイトル_抹消線あり４);
            }
        }
        // TODO QA1503
        if (高額合算支給決定通知書データ.get被保検者情報() != null && 高額合算支給決定通知書データ.get被保検者情報().getMeisho() != null) {
            高額合算支給決定通知書Entity.set被保険者氏名(高額合算支給決定通知書データ.get被保検者情報().getMeisho().value());
        }
        高額合算支給決定通知書Entity.set被保険者番号(高額合算支給決定通知書データ.getHihokenshaNo());
        高額合算支給決定通知書Entity.set対象計算期間開始年月日(高額合算支給決定通知書データ.getKeisanKaishiYMD());
        高額合算支給決定通知書Entity.set対象計算期間終了年月日(高額合算支給決定通知書データ.getKeisanShuryoYMD());
        高額合算支給決定通知書Entity.set申請年月日(高額合算支給決定通知書データ.getShinseiYMD());
        高額合算支給決定通知書Entity.set決定年月日(高額合算支給決定通知書データ.getKetteiYMD());
        高額合算支給決定通知書Entity.set計算対象期間中の自己負担額合計額(高額合算支給決定通知書データ.getJikoFutanSogaku());
        高額合算支給決定通知書Entity.set支給額タイトル(支給額タイトル);
        高額合算支給決定通知書Entity.set支給額(高額合算支給決定通知書データ.getShikyugaku());
        高額合算支給決定通知書Entity.set支給区分コード(高額合算支給決定通知書データ.getShikyuKubunCode());
        高額合算支給決定通知書Entity.set給付の種類(高額合算支給決定通知書データ.getKyufuShurui());
        高額合算支給決定通知書Entity.set備考(高額合算支給決定通知書データ.getBiko());
        高額合算支給決定通知書Entity.set不支給の理由(高額合算支給決定通知書データ.getFushikyuRiyu());
        高額合算支給決定通知書Entity.set支給方法区分(高額合算支給決定通知書データ.getShiharaiHohoKubun());
        高額合算支給決定通知書Entity.set支払場所(高額合算支給決定通知書データ.getShiharaiBasho());
        高額合算支給決定通知書Entity.set支払期間開始年月日(高額合算支給決定通知書データ.getShiharaiKaishiYMD());
        高額合算支給決定通知書Entity.set支払期間終了年月日(高額合算支給決定通知書データ.getShiharaiShuryoYMD());
        高額合算支給決定通知書Entity.set支払期間開始時間(高額合算支給決定通知書データ.getShiharaiKaishiTime());
        高額合算支給決定通知書Entity.set支払期間終了時間(高額合算支給決定通知書データ.getShiharaiShuryoTime());
        if (口座情報Entity != null) {
            高額合算支給決定通知書Entity.set金融機関名称(口座情報Entity.get金融機関().get金融機関名称());
            高額合算支給決定通知書Entity.set支店名称(口座情報Entity.get支店().get支店名称());
            高額合算支給決定通知書Entity.set金融機関コード(口座情報Entity.get金融機関コード());
            高額合算支給決定通知書Entity.set支店コード(口座情報Entity.get支店コード());
            高額合算支給決定通知書Entity.set預金種別(口座情報Entity.get預金種別());
            高額合算支給決定通知書Entity.set口座番号(口座情報Entity.get口座番号());
            高額合算支給決定通知書Entity.set口座名義人(口座情報Entity.get口座名義人());
        }
        高額合算支給決定通知書Entity.set通知書番号(高額合算支給決定通知書データ.getShikyuSeiriNo());
        高額合算支給決定通知書Entity.set通番(対象件数);
        return 高額合算支給決定通知書Entity;
    }

    private KogakugassanShikyuKetteiTsuchiIchiran get高額合算支給決定者一覧表Entity(KogakugassanShikyuKetteitsuchishoEntity 高額合算支給決定通知書データ,
            Koza 口座情報Entity) {
        KogakugassanShikyuKetteiTsuchiIchiran 高額合算支給決定者一覧表Entity = new KogakugassanShikyuKetteiTsuchiIchiran();
        高額合算支給決定者一覧表Entity.set出力順1(高額合算支給決定通知書データ.getShutsuryokujunMei1());
        高額合算支給決定者一覧表Entity.set出力順2(高額合算支給決定通知書データ.getShutsuryokujunMei2());
        高額合算支給決定者一覧表Entity.set出力順3(高額合算支給決定通知書データ.getShutsuryokujunMei3());
        高額合算支給決定者一覧表Entity.set出力順4(高額合算支給決定通知書データ.getShutsuryokujunMei4());
        高額合算支給決定者一覧表Entity.set出力順5(高額合算支給決定通知書データ.getShutsuryokujunMei5());
        高額合算支給決定者一覧表Entity.set改頁1(高額合算支給決定通知書データ.getKaiPeiji1());
        高額合算支給決定者一覧表Entity.set改頁2(高額合算支給決定通知書データ.getKaiPeiji2());
        高額合算支給決定者一覧表Entity.set改頁3(高額合算支給決定通知書データ.getKaiPeiji3());
        高額合算支給決定者一覧表Entity.set改頁4(高額合算支給決定通知書データ.getKaiPeiji4());
        高額合算支給決定者一覧表Entity.set改頁5(高額合算支給決定通知書データ.getKaiPeiji5());
        高額合算支給決定者一覧表Entity.set帳票通番(対象件数);
        高額合算支給決定者一覧表Entity.set被保険者番号(高額合算支給決定通知書データ.getHihokenshaNo());
        if (高額合算支給決定通知書データ.get被保検者情報() != null && 高額合算支給決定通知書データ.get被保検者情報().getMeisho() != null) {
            高額合算支給決定者一覧表Entity.set被保険者氏名(高額合算支給決定通知書データ.get被保検者情報().getMeisho().value());
        }
        if (高額合算支給決定通知書データ.get被保検者情報() != null) {
            高額合算支給決定者一覧表Entity.set住所(高額合算支給決定通知書データ.get被保検者情報().getJusho());
        }
        高額合算支給決定者一覧表Entity.set支給申請整理番号(高額合算支給決定通知書データ.getShikyuSeiriNo());
        高額合算支給決定者一覧表Entity.set対象年度(高額合算支給決定通知書データ.getTaishoNendo());
        高額合算支給決定者一覧表Entity.set履歴番号(高額合算支給決定通知書データ.getRirekiNo());
        高額合算支給決定者一覧表Entity.set申請年月日(高額合算支給決定通知書データ.getShinseiYMD());
        高額合算支給決定者一覧表Entity.set決定年月日(高額合算支給決定通知書データ.getKetteiYMD());
        高額合算支給決定者一覧表Entity.set支給区分コード(高額合算支給決定通知書データ.getShikyuKubunCode());
        高額合算支給決定者一覧表Entity.set自己負担総額(高額合算支給決定通知書データ.getJikoFutanSogaku());
        高額合算支給決定者一覧表Entity.set支給額(高額合算支給決定通知書データ.getShikyugaku());
        高額合算支給決定者一覧表Entity.set支給区分コード(高額合算支給決定通知書データ.getShikyuKubunCode());
        高額合算支給決定者一覧表Entity.set支払場所(高額合算支給決定通知書データ.getShiharaiBasho());
        高額合算支給決定者一覧表Entity.set支払期間開始年月日(高額合算支給決定通知書データ.getShiharaiKaishiYMD());
        高額合算支給決定者一覧表Entity.set支払期間終了年月日(高額合算支給決定通知書データ.getShiharaiShuryoYMD());
        高額合算支給決定者一覧表Entity.set支払期間開始時間(高額合算支給決定通知書データ.getShiharaiKaishiTime());
        高額合算支給決定者一覧表Entity.set支払期間終了時間(高額合算支給決定通知書データ.getShiharaiShuryoTime());
        if (口座情報Entity != null) {
            高額合算支給決定者一覧表Entity.set金融機関名称(口座情報Entity.get金融機関().get金融機関名称());
            高額合算支給決定者一覧表Entity.set支店名称(口座情報Entity.get支店().get支店名称());
            高額合算支給決定者一覧表Entity.set預金種別(口座情報Entity.get預金種別());
            高額合算支給決定者一覧表Entity.set口座番号(口座情報Entity.get口座番号());
            高額合算支給決定者一覧表Entity.set口座名義人カナ(口座情報Entity.get口座名義人());
        }
        return 高額合算支給決定者一覧表Entity;
    }

    private GassanShikyuFushikyuKetteishaIchiranParameter getGassanShikyuFushikyuKetteishaIchiranParameter() {
        GassanShikyuFushikyuKetteishaIchiranParameter gassanShikyuFushikyuKetteishaIchiranParameter
                = new GassanShikyuFushikyuKetteishaIchiranParameter();
        gassanShikyuFushikyuKetteishaIchiranParameter.set連番(連番);
        if (地方公共団体 != null) {
            gassanShikyuFushikyuKetteishaIchiranParameter.set市町村コード(地方公共団体.get地方公共団体コード());
            gassanShikyuFushikyuKetteishaIchiranParameter.set市町村名称(地方公共団体.get市町村名());
        }
        gassanShikyuFushikyuKetteishaIchiranParameter.set作成日時(processParameter.get処理日時());
        gassanShikyuFushikyuKetteishaIchiranParameter.set日付選択区分(processParameter.get日付選択区分());
        gassanShikyuFushikyuKetteishaIchiranParameter.set受取年月(processParameter.get受取年月());
        gassanShikyuFushikyuKetteishaIchiranParameter.set申請開始年月日(processParameter.get申請開始年月日());
        gassanShikyuFushikyuKetteishaIchiranParameter.set申請終了年月日(processParameter.get申請終了年月日());
        gassanShikyuFushikyuKetteishaIchiranParameter.set決定開始年月日(processParameter.get決定開始年月日());
        gassanShikyuFushikyuKetteishaIchiranParameter.set決定終了年月日(processParameter.get決定終了年月日());
        gassanShikyuFushikyuKetteishaIchiranParameter.set支給の件数(支給不支給件数);
        gassanShikyuFushikyuKetteishaIchiranParameter.set自己負担総額の合計金額(自己負担総額の合計金額);
        gassanShikyuFushikyuKetteishaIchiranParameter.set支給額の合計金額(支給額の合計金額);
        return gassanShikyuFushikyuKetteishaIchiranParameter;
    }

    private NinshoshaSource getCompNinshoshaソース_DBC100053() {
        // TODO QA1510
        NinshoshaSource compNinshoshaソース = ReportUtil.get認証者情報(SubGyomuCode.DBC介護給付, ReportIdDBC.DBC100053.getReportId(),
                作成日_QA, NinshoshaDenshikoinshubetsuCode.保険者印.getコード(),
                KenmeiFuyoKubunType.付与なし, reportSourceWriter_通知書_DBC100053);
        return compNinshoshaソース;
    }

    private NinshoshaSource getCompNinshoshaソース_DBC100054() {
        // TODO QA1510
        NinshoshaSource compNinshoshaソース = ReportUtil.get認証者情報(SubGyomuCode.DBC介護給付, ReportIdDBC.DBC100054.getReportId(),
                作成日_QA, NinshoshaDenshikoinshubetsuCode.保険者印.getコード(),
                KenmeiFuyoKubunType.付与なし, reportSourceWriter_通知書_DBC100054);
        return compNinshoshaソース;
    }

    private SofubutsuAtesakiSource getCompSofubutsuAtesakiソース(KogakugassanShikyuKetteitsuchishoEntity entity) {
        SofubutsuAtesakiSource compSofubutsuAtesakiソース = null;
        if (entity.get宛先Entity() != null) {
            IAtesaki atesaki = AtesakiFactory.createInstance(entity.get宛先Entity());
            ReportAtesakiEditor editor = new SofubutsuAtesakiEditorBuilder(atesaki).build();
            return new SofubutsuAtesakiSourceBuilder(editor).buildSource();
        }
        return compSofubutsuAtesakiソース;
    }

}
