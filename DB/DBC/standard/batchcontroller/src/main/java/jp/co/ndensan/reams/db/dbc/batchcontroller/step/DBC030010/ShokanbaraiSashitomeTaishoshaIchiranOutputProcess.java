/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC030010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbc.business.core.shokanketteitsuchishoshiharai.ShokanKetteiTsuchiShoShiharai;
import jp.co.ndensan.reams.db.dbc.business.report.dbc200024.ShokanbaraiSashitomeTaishoshaIchiranReport;
import jp.co.ndensan.reams.db.dbc.business.report.shokanbaraishikyufushikyuketteitsuchiichiran.KetteiTsuchiIchiranBreakPageItem;
import jp.co.ndensan.reams.db.dbc.business.report.shokanbaraishikyufushikyuketteitsuchiichiran.KetteiTsuchiIchiranOutPutOrder;
import jp.co.ndensan.reams.db.dbc.business.report.shokanbaraishikyufushikyuketteitsuchiichiran.ShokanbaraiShikyuFushikyuKetteiTsuchiIchiranItem;
import jp.co.ndensan.reams.db.dbc.definition.batchprm.shokanketteitsuchishosealer.ShokanKetteiTsuchiShoSealerBatchParameter;
import jp.co.ndensan.reams.db.dbc.definition.mybatisprm.shokanketteitsuchishoikkatsu.ShokanKetteiTsuchiShoKetteiTsuchiIchiranParameter;
import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.shokanketteitsuchishoshiharai.ShokanKetteiTsuchiShoShiharaiRelateEntity;
import jp.co.ndensan.reams.db.dbc.entity.report.dbc200024.ShokanbaraiSashitomeTaishoshaIchiranSource;
import jp.co.ndensan.reams.db.dbc.entity.report.source.shokanbaraishikyufushikyuketteitsuchiichiran.ShokanbaraiShikyuFushikyuReportSource;
import jp.co.ndensan.reams.db.dbc.service.core.shokanharaishikyufushikyuketeitsuchiichiranhyo.ShokanharaiShikyuFushikyuKeteiTsuchiIchiranhyo;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoHanyo;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoKyotsu;
import jp.co.ndensan.reams.db.dbz.business.core.mybatisorderbycreator.BreakPageCreator;
import jp.co.ndensan.reams.db.dbz.business.core.util.report.ChohyoUtil;
import jp.co.ndensan.reams.db.dbz.definition.core.shikakukubun.ShikakuKubun;
import jp.co.ndensan.reams.db.dbz.service.core.basic.ChohyoSeigyoHanyoManager;
import jp.co.ndensan.reams.db.dbz.service.core.basic.ChohyoSeigyoKyotsuManager;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.AtesakiGyomuHanteiKeyFactory;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.AtesakiPSMSearchKeyBuilder;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.ShikibetsuTaishoGyomuHanteiKeyFactory;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.ShikibetsuTaishoPSMSearchKeyBuilder;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.ShikibetsuTaishoSearchKeyBuilder;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.GyomuKoyuKeyRiyoKubun;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.SofusakiRiyoKubun;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.shikibetsutaisho.KensakuYusenKubun;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.shikibetsutaisho.psm.DataShutokuKubun;
import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.atesaki.IAtesakiGyomuHanteiKey;
import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.shikibetsutaisho.IShikibetsuTaishoPSMSearchKey;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IOutputOrder;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.ISetSortItem;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.MyBatisOrderByClauseCreator;
import jp.co.ndensan.reams.ur.urz.service.core.reportoutputorder.ChohyoShutsuryokujunFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.core.reportoutputorder.IChohyoShutsuryokujunFinder;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchKeyBreakBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogType;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogger;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.PersonalData;
import jp.co.ndensan.reams.uz.uza.report.BreakerCatalog;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 帳票設計_DBC200024_償還払支給差止対象者一覧表を出力します。
 *
 * @reamsid_L DBC-1000-020 zuotao
 */
public class ShokanbaraiSashitomeTaishoshaIchiranOutputProcess extends BatchKeyBreakBase<ShokanKetteiTsuchiShoShiharaiRelateEntity> {

    private static final RString 帳票取得SQL = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate."
            + "shokanketteitsuchishoikkatsusakusei.IShokanKetteiTsuchiShoIkkatsuSakuseiMapper.get償還払支給差止対象者一覧用帳票データ");
    private static final RString ORDER_BY = new RString("order by");
    private static final int INT3 = 3;
    private static final int INT4 = 4;
    private static final int INT5 = 5;
    private static final int ZERO = 0;
    private static final int TEN = 10;
    private static final RString カンマ = new RString(",");
    List<ShokanKetteiTsuchiShoShiharai> 帳票データリスト = new ArrayList<>();
    Map<RString, RString> 種類Map = new HashMap<RString, RString>();
    ShokanKetteiTsuchiShoSealerBatchParameter batchPram;
    List<RString> 並び順List;
    List<RString> 改頁List;
    List<RString> pageBreakKeys;
    private RString 出力順1 = RString.EMPTY;
    private RString 出力順2 = RString.EMPTY;
    private RString 出力順3 = RString.EMPTY;
    private RString 出力順4 = RString.EMPTY;
    private RString 出力順5 = RString.EMPTY;
    private RString 改頁1 = RString.EMPTY;
    private RString 改頁2 = RString.EMPTY;
    private RString 改頁3 = RString.EMPTY;
    private RString 改頁4 = RString.EMPTY;
    private RString 改頁5 = RString.EMPTY;
    private static final RString 帳票制御汎用キー_償還払い支給不支給決定通知書 = new RString("２号発行有無");
    private static final RString 発行有無_発行しない = new RString("0");
    private List<PersonalData> personalDataList;
    IOutputOrder outputOrder;
    private ChohyoSeigyoKyotsu 帳票制御共通情報;

    @BatchWriter
    private BatchReportWriter<ShokanbaraiSashitomeTaishoshaIchiranSource> batchWrite;
    private ReportSourceWriter<ShokanbaraiSashitomeTaishoshaIchiranSource> reportSourceWriter;

    @Override
    protected void initialize() {
        並び順List = new ArrayList();
        改頁List = new ArrayList();
    }

    @Override
    protected IBatchReader createReader() {
        personalDataList = new ArrayList<>();
        RString 出力順 = get出力順(ReportIdDBC.DBC100002_2.getReportId(), batchPram.getSyutujunId());
        if (!RString.isNullOrEmpty(出力順)) {
            出力順 = 出力順.replace(ORDER_BY, RString.EMPTY);
        }
        get出力順項目();
        ChohyoSeigyoHanyoManager 帳票制御汎用Manager = new ChohyoSeigyoHanyoManager();
        RString 資格区分 = null;

        ChohyoSeigyoHanyo 帳票制御汎発行有無 = 帳票制御汎用Manager.get帳票制御汎用(SubGyomuCode.DBC介護給付, ReportIdDBC.DBC100002_2.getReportId(),
                FlexibleYear.MIN, 帳票制御汎用キー_償還払い支給不支給決定通知書);
        if (帳票制御汎発行有無 != null && 発行有無_発行しない.equals(帳票制御汎発行有無.get設定値())) {
            資格区分 = ShikakuKubun._２号.getコード();
        }
        帳票制御共通情報 = get帳票制御共通情報();
        ShikibetsuTaishoSearchKeyBuilder key = new ShikibetsuTaishoSearchKeyBuilder(
                ShikibetsuTaishoGyomuHanteiKeyFactory.createInstance(GyomuCode.DB介護保険, KensakuYusenKubun.住登外優先), true);
        key.setデータ取得区分(DataShutokuKubun.直近レコード);

        IAtesakiGyomuHanteiKey 宛先業務判定キー = AtesakiGyomuHanteiKeyFactory.createInstace(GyomuCode.DB介護保険, SubGyomuCode.DBC介護給付);
        AtesakiPSMSearchKeyBuilder 宛先builder = new AtesakiPSMSearchKeyBuilder(宛先業務判定キー);
        宛先builder.set業務固有キー利用区分(GyomuKoyuKeyRiyoKubun.利用しない);
        宛先builder.set基準日(batchPram.getHakkoYMD());
        宛先builder.set送付先利用区分(SofusakiRiyoKubun.利用する);
        ShikibetsuTaishoPSMSearchKeyBuilder key2 = new ShikibetsuTaishoPSMSearchKeyBuilder(GyomuCode.DB介護保険, KensakuYusenKubun.住登外優先);
        IShikibetsuTaishoPSMSearchKey psmShikibetsuTaisho = key2.build();
        ShokanKetteiTsuchiShoKetteiTsuchiIchiranParameter parameter
                = ShokanKetteiTsuchiShoKetteiTsuchiIchiranParameter.toMybatisParameter(出力順, 資格区分, psmShikibetsuTaisho,
                        key.getPSM検索キー(), 宛先builder.build());
        return new BatchDbReader(帳票取得SQL, parameter);
    }

    private ChohyoSeigyoKyotsu get帳票制御共通情報() {
        ChohyoSeigyoKyotsuManager chohyoSeigyoKyotsuManager = new ChohyoSeigyoKyotsuManager();
        return chohyoSeigyoKyotsuManager.get帳票制御共通(SubGyomuCode.DBC介護給付,
                new ReportId(ReportIdDBC.DBC100002_2.getReportId().value()));
    }

    @Override
    protected void createWriter() {
        batchWrite = BatchReportFactory.createBatchReportWriter(ReportIdDBC.DBC200024.getReportId().value())
                .addBreak(new BreakerCatalog<ShokanbaraiShikyuFushikyuReportSource>().simplePageBreaker(pageBreakKeys)).create();
        reportSourceWriter = new ReportSourceWriter<>(batchWrite);
    }

    @Override
    protected void usualProcess(ShokanKetteiTsuchiShoShiharaiRelateEntity entity) {

        ShokanKetteiTsuchiShoShiharai データ = new ShokanKetteiTsuchiShoShiharai(entity);
        RString key = getJufukuKey(データ);
        RString 種類 = データ.get種類() == null ? RString.EMPTY : データ.get種類();
        if (種類Map.containsKey(key)) {
            RString bef種類 = 種類Map.get(key) == null ? RString.EMPTY : 種類Map.get(key);
            if (bef種類.indexOf(種類) == 0) {
                種類Map.put(key, set種類(bef種類, データ.get種類()));
            }
        } else {
            帳票データリスト.add(データ);
            種類Map.put(key, 種類);
            personalDataList.add(toPersonalData(entity));
        }
    }

    private RString set種類(RString kyufuShu, RString 種類) {
        if (RString.isNullOrEmpty(kyufuShu)) {
            return 種類;
        }
        RStringBuilder builder = new RStringBuilder(kyufuShu);
        if (!RString.isNullOrEmpty(種類)) {
            builder.append(カンマ);
            builder.append(種類);
        }
        return builder.toRString();
    }

    private RString getJufukuKey(ShokanKetteiTsuchiShoShiharai shiharai) {
        RStringBuilder key = new RStringBuilder();
        key.append(shiharai.get被保険者番号().value());
        key.append(shiharai.get提供年月().wareki().toDateString());
        key.append(shiharai.get整理番号().padLeft(new RString(ZERO), TEN));
        return key.toRString();
    }

    @Override
    protected void afterExecute() {
        if (帳票データリスト.isEmpty()) {
            return;
        }
        ShokanharaiShikyuFushikyuKeteiTsuchiIchiranhyo ichiranhyo = new ShokanharaiShikyuFushikyuKeteiTsuchiIchiranhyo();
        List<ShokanbaraiShikyuFushikyuKetteiTsuchiIchiranItem> itemList
                = ichiranhyo.
                getShokanharaiShikyuFushikyuKeteiTsuchiIchiranhyoData(帳票データリスト, batchPram, 並び順List, 改頁List, 種類Map, 帳票制御共通情報);

        ShokanbaraiSashitomeTaishoshaIchiranReport report = ShokanbaraiSashitomeTaishoshaIchiranReport.createFrom(itemList);
        report.writeBy(reportSourceWriter);
        AccessLogger.log(AccessLogType.照会, personalDataList);
    }

    private RString get出力順(ReportId 帳票分類ID, RString 出力順ID) {

        if (RString.isNullOrEmpty(出力順ID)) {
            return RString.EMPTY;
        }
        IChohyoShutsuryokujunFinder fider = ChohyoShutsuryokujunFinderFactory.createInstance();
        outputOrder = fider.get出力順(SubGyomuCode.DBC介護給付, 帳票分類ID, Long.parseLong(出力順ID.toString()));
        if (outputOrder == null) {
            return RString.EMPTY;
        }
        return MyBatisOrderByClauseCreator.create(KetteiTsuchiIchiranOutPutOrder.class, outputOrder);
    }

    private void get出力順項目() {
        Map<Integer, ISetSortItem> 改頁Map = ChohyoUtil.get改頁項目Map(outputOrder);
        Map<Integer, ISetSortItem> 出力順Map = ChohyoUtil.get出力順項目Map(outputOrder);
        if (出力順Map.get(1) != null) {
            出力順1 = 出力順Map.get(1).get項目名();
        }
        if (出力順Map.get(2) != null) {
            出力順2 = 出力順Map.get(2).get項目名();
        }
        if (出力順Map.get(INT3) != null) {
            出力順3 = 出力順Map.get(INT3).get項目名();
        }
        if (出力順Map.get(INT4) != null) {
            出力順4 = 出力順Map.get(INT4).get項目名();
        }
        if (出力順Map.get(INT5) != null) {
            出力順5 = 出力順Map.get(INT5).get項目名();
        }
        if (改頁Map.get(1) != null) {
            改頁1 = 改頁Map.get(1).get項目名();
        }
        if (改頁Map.get(2) != null) {
            改頁2 = 改頁Map.get(2).get項目名();
        }
        if (改頁Map.get(INT3) != null) {
            改頁3 = 改頁Map.get(INT3).get項目名();
        }
        if (改頁Map.get(INT4) != null) {
            改頁4 = 改頁Map.get(INT4).get項目名();
        }
        if (改頁Map.get(INT5) != null) {
            改頁5 = 改頁Map.get(INT5).get項目名();
        }
        並び順List.add(出力順1);
        並び順List.add(出力順2);
        並び順List.add(出力順3);
        並び順List.add(出力順4);
        並び順List.add(出力順5);
        改頁List.add(改頁1);
        改頁List.add(改頁2);
        改頁List.add(改頁3);
        改頁List.add(改頁4);
        改頁List.add(改頁5);
        getPageBreakKeys();
    }

    private void getPageBreakKeys() {
        List<RString> pageBreakKeyList = new ArrayList<>();
        if (!RString.isNullOrEmpty(改頁1)) {
            pageBreakKeyList.add(BreakPageCreator.getBreakPageName(KetteiTsuchiIchiranBreakPageItem.class, 改頁1));
        }
        if (!RString.isNullOrEmpty(改頁2)) {
            pageBreakKeyList.add(BreakPageCreator.getBreakPageName(KetteiTsuchiIchiranBreakPageItem.class, 改頁2));
        }
        if (!RString.isNullOrEmpty(改頁3)) {
            pageBreakKeyList.add(BreakPageCreator.getBreakPageName(KetteiTsuchiIchiranBreakPageItem.class, 改頁3));
        }
        if (!RString.isNullOrEmpty(改頁4)) {
            pageBreakKeyList.add(BreakPageCreator.getBreakPageName(KetteiTsuchiIchiranBreakPageItem.class, 改頁4));
        }
        if (!RString.isNullOrEmpty(改頁5)) {
            pageBreakKeyList.add(BreakPageCreator.getBreakPageName(KetteiTsuchiIchiranBreakPageItem.class, 改頁5));
        }
        pageBreakKeys = Collections.unmodifiableList(pageBreakKeyList);
    }

    private PersonalData toPersonalData(ShokanKetteiTsuchiShoShiharaiRelateEntity entity) {
        ExpandedInformation expandedInfo = new ExpandedInformation(new Code("0003"),
                new RString("被保険者番号"), new RString(entity.getHiHokenshaNo().toString()));
        return PersonalData.of(entity.getShikibetsuCode(), expandedInfo);
    }

    @Override
    protected void keyBreakProcess(ShokanKetteiTsuchiShoShiharaiRelateEntity t) {
    }
}
