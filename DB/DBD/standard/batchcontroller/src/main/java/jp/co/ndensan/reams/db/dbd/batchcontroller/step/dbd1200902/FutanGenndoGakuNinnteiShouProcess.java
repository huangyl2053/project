/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.batchcontroller.step.dbd1200902;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbd.business.core.gemmengengaku.futangendogakunintei.FutanGendogakuNintei;
import jp.co.ndensan.reams.db.dbd.business.core.gemmengengaku.shinsei.GemmenGengakuShinsei;
import jp.co.ndensan.reams.db.dbd.business.report.dbd100020.FutanGendogakuNinteishoReport;
import jp.co.ndensan.reams.db.dbd.business.report.dbd1200902.FutanGenndoGakuNinnteiShouListPropery.DBD1200902_FutanGenndoGakuNinnteiShouListEnum;
import jp.co.ndensan.reams.db.dbd.definition.processprm.dbd1200902.FutanGenndoGakuNinnteiShouProcessParameter;
import jp.co.ndensan.reams.db.dbd.definition.reportid.ReportIdDBD;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.dbd1200902.FutanGenndoGakuNinnteiShouEntity;
import jp.co.ndensan.reams.db.dbd.entity.report.dbd100020.FutanGendogakuNinteishoReportSource;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoKyotsu;
import jp.co.ndensan.reams.db.dbz.business.report.hakkorireki.GyomuKoyuJoho;
import jp.co.ndensan.reams.db.dbz.definition.core.kyotsu.NinshoshaDenshikoinshubetsuCode;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7067ChohyoSeigyoHanyoEntity;
import jp.co.ndensan.reams.db.dbz.persistence.db.basic.DbT7067ChohyoSeigyoHanyoDac;
import jp.co.ndensan.reams.db.dbz.service.core.basic.ChohyoSeigyoKyotsuManager;
import jp.co.ndensan.reams.db.dbz.service.core.util.report.ReportUtil;
import jp.co.ndensan.reams.ua.uax.business.core.psm.UaFt200FindShikibetsuTaishoFunction;
import jp.co.ndensan.reams.ua.uax.business.core.psm.UaFt250FindAtesakiFunction;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.ShikibetsuTaishoFactory;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.kojin.IKojin;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.AtenaSearchKeyBuilder;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.AtesakiGyomuHanteiKeyFactory;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.ShikibetsuTaishoGyomuHanteiKeyFactory;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.ShikibetsuTaishoSearchKeyBuilder;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.shikibetsutaisho.KensakuYusenKubun;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.shikibetsutaisho.psm.DataShutokuKubun;
import jp.co.ndensan.reams.ur.urz.business.UrControlDataFactory;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.core.ninshosha.Ninshosha;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IOutputOrder;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.ISetSortItem;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.MyBatisOrderByClauseCreator;
import jp.co.ndensan.reams.ur.urz.business.report.outputjokenhyo.ReportOutputJokenhyoItem;
import jp.co.ndensan.reams.ur.urz.definition.core.ninshosha.KenmeiFuyoKubunType;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.core.ninshosha.NinshoshaFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.core.reportoutputorder.ChohyoShutsuryokujunFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.IReportOutputJokenhyoPrinter;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.OutputJokenhyoFactory;
import jp.co.ndensan.reams.uz.uza.batch.batchexecutor.util.JobContextHolder;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 負担限度額認定の認定証発行_process処理クラスです.
 *
 * @reamsid_L DBD-3981-050 x_xuliang
 */
public class FutanGenndoGakuNinnteiShouProcess extends BatchProcessBase<FutanGenndoGakuNinnteiShouEntity> {

    private static final ReportIdDBD 帳票ID = ReportIdDBD.DBD100020;
    private static final ReportIdDBD 帳票分類ID = ReportIdDBD.DBD100020;
    private RString ReamsLoginID;
    private RString 出力順;
    private Association 地方公共団体;
    private Ninshosha 認証者;
    private final RString 単票発行区分 = new RString("【単票発行区分】");
    private final RString 旧措置者区分 = new RString("【旧措置者区分】");
    private final RString 年度 = new RString("【年度】");
    private final RString 抽出期間種類 = new RString("【抽出期間種類】");
    private final RString 対象期間範囲 = new RString("【対象期間範囲】");
    private final RString 交付日 = new RString("【交付日】");
    private final RString カラ = new RString("～");
    private final RString より大きい = new RString("＞");
    private FutanGenndoGakuNinnteiShouProcessParameter processParamter;
    private IOutputOrder outputOrder;
    private GyomuCode 業務コード;
    private RString 種別コード;
    private FutanGendogakuNinteishoReport report;
    private FutanGendogakuNintei 負担限度額認定;

    @BatchWriter
    private BatchReportWriter<FutanGendogakuNinteishoReportSource> batchReportWrite;
    private ReportSourceWriter<FutanGendogakuNinteishoReportSource> reportSourceWriter;
    private NinshoshaSource ninshoshaSource;

    private static final RString MYBATIS_SELECT_ID
            = new RString("jp.co.ndensan.reams.db.dbd.persistence.db.mapper.relate.futanngenndogakuninntei."
                    + "IFutanGenndoGakuNinnteiShouMapper.get負担限度額認定の認定証発行情報");

    @Override
    protected void initialize() {
        ReamsLoginID = UrControlDataFactory.createInstance().getLoginInfo().getUserId();
        outputOrder = ChohyoShutsuryokujunFinderFactory.createInstance().get出力順(SubGyomuCode.DBD介護受給, 帳票ID.getReportId(),
                ReamsLoginID, processParamter.get改頁出力順ID());
        出力順 = MyBatisOrderByClauseCreator.create(DBD1200902_FutanGenndoGakuNinnteiShouListEnum.class, outputOrder);
        地方公共団体 = AssociationFinderFactory.createInstance().getAssociation();
        業務コード = GyomuCode.DB介護保険;
        種別コード = new RString(帳票分類ID.name());
        認証者 = NinshoshaFinderFactory.createInstance().get帳票認証者(業務コード, 種別コード);
    }

    @Override
    protected IBatchReader createReader() {
        ShikibetsuTaishoSearchKeyBuilder key = new ShikibetsuTaishoSearchKeyBuilder(
                ShikibetsuTaishoGyomuHanteiKeyFactory.createInstance(GyomuCode.DB介護保険, KensakuYusenKubun.住登外優先), true);
        key.setデータ取得区分(DataShutokuKubun.直近レコード);
        UaFt200FindShikibetsuTaishoFunction uaFt200Psm = new UaFt200FindShikibetsuTaishoFunction(key.getPSM検索キー());
        RString psmShikibetsuTaisho = new RString(uaFt200Psm.getParameterMap().get("psmShikibetsuTaisho").toString());
        AtenaSearchKeyBuilder atenaSearchKeyBuilder = new AtenaSearchKeyBuilder(
                KensakuYusenKubun.未定義, AtesakiGyomuHanteiKeyFactory.createInstace(GyomuCode.DB介護保険, SubGyomuCode.DBD介護受給));
        UaFt250FindAtesakiFunction uaFt250Psm = new UaFt250FindAtesakiFunction(atenaSearchKeyBuilder.build().get宛先検索キー());
        RString psmAtesaki = new RString(uaFt250Psm.getParameterMap().get("psmAtesaki").toString());
        return new BatchDbReader(MYBATIS_SELECT_ID, processParamter.toFutanGenndoGakuNinnteiShouMybatisParameter(
                psmShikibetsuTaisho,
                psmAtesaki,
                出力順,
                帳票ID.getReportId().getColumnValue(),
                GyomuKoyuJoho.被保番号.getコード(),
                GyomuKoyuJoho.減免適用開始日.getコード()));
    }

    @Override
    protected void createWriter() {
        batchReportWrite = BatchReportFactory.createBatchReportWriter(帳票ID.getReportId().value()).create();
        reportSourceWriter = new ReportSourceWriter<>(batchReportWrite);
        ninshoshaSource = ReportUtil.get認証者情報(SubGyomuCode.DBD介護受給, ReportIdDBD.DBD100020.getReportId(), FlexibleDate.getNowDate(),
                NinshoshaDenshikoinshubetsuCode.保険者印.getコード(),
                KenmeiFuyoKubunType.付与なし, reportSourceWriter);
    }

    @Override
    protected void process(FutanGenndoGakuNinnteiShouEntity entity) {
        IKojin iKojin = ShikibetsuTaishoFactory.createKojin(entity.getPsmEntity());
        GemmenGengakuShinsei 減免減額申請情報 = new GemmenGengakuShinsei(entity.get減免減額申請Entity());
        負担限度額認定.createBuilderForEdit()
                .setGemmenGengakuShinsei(減免減額申請情報)
                .setその他金額(entity.get介護保険負担限度額認定Entity().getSonotaKingaku())
                .setユニット型個室(entity.get介護保険負担限度額認定Entity().getUnitTypeKoshitsu())
                .setユニット型準個室(entity.get介護保険負担限度額認定Entity().getUnitTypeJunKoshitsu())
                .set一括認定処理日時(entity.get介護保険負担限度額認定Entity().getNinteiBatchExecutedTimestamp())
                .set利用者負担段階(entity.get介護保険負担限度額認定Entity().getRiyoshaFutanDankai())
                .set境界層該当者区分(entity.get介護保険負担限度額認定Entity().getKyokaisoGaitoshaKubun())
                .set多床室(entity.get介護保険負担限度額認定Entity().getTashoshitsu())
                .set居室種別(entity.get介護保険負担限度額認定Entity().getKyoshitsuShubetsu())
                .set従来型個室_特養等(entity.get介護保険負担限度額認定Entity().getJuraiTypeKoshitsu_Tokuyo())
                .set従来型個室_老健_療養等(entity.get介護保険負担限度額認定Entity().getJuraiTypeKoshitsu_Roken_Ryoyo())
                .set旧措置者区分(entity.get介護保険負担限度額認定Entity().getKetteiKubun())
                .set有価証券評価概算額(entity.get介護保険負担限度額認定Entity().getYukashoukenGaisangaku())
                .set決定区分(entity.get介護保険負担限度額認定Entity().getKetteiKubun())
                .set決定年月日(entity.get介護保険負担限度額認定Entity().getKetteiYMD())
                .set激変緩和措置対象者区分(entity.get介護保険負担限度額認定Entity().getGekihenKanwaSochiTaishoshaKubun())
                .set申請年月日(entity.get介護保険負担限度額認定Entity().getShinseiYMD())
                .set申請理由区分(entity.get介護保険負担限度額認定Entity().getShinseiRiyuKubun())
                .set適用終了年月日(entity.get介護保険負担限度額認定Entity().getTekiyoShuryoYMD())
                .set適用開始年月日(entity.get介護保険負担限度額認定Entity().getTekiyoKaishiYMD())
                .set配偶者の有無(entity.get介護保険負担限度額認定Entity().getHaigushaUmuFlag())
                .set配偶者住所(entity.get介護保険負担限度額認定Entity().getHaigushaJusho())
                .set配偶者住所２(entity.get介護保険負担限度額認定Entity().getHaigushaJusho2())
                .set配偶者氏名(entity.get介護保険負担限度額認定Entity().getHaigushaShimei())
                .set配偶者氏名カナ(entity.get介護保険負担限度額認定Entity().getHaigushaShimeiKana())
                .set配偶者生年月日(entity.get介護保険負担限度額認定Entity().getHaigushaSeinenGappiYMD())
                .set配偶者課税区分(entity.get介護保険負担限度額認定Entity().getHaigushaKazeiKubun())
                .set配偶者識別コード(entity.get介護保険負担限度額認定Entity().getHaigushaShikibetsuCd())
                .set配偶者連絡先(entity.get介護保険負担限度額認定Entity().getHaigushaRenrakusaki())
                .set非承認理由(entity.get介護保険負担限度額認定Entity().getHiShoninRiyu())
                .set預貯金申告区分(entity.get介護保険負担限度額認定Entity().getYochokinShinkokuKubun())
                .set預貯金額(entity.get介護保険負担限度額認定Entity().getYochokinGaku())
                .set食費負担限度額(entity.get介護保険負担限度額認定Entity().getShokuhiFutanGendogaku())
                .build();
        FutanGendogakuNinteishoReport.createReport(負担限度額認定, iKojin, 帳票制御共通取得(), 帳票制御汎用取得(), 地方公共団体,
                processParamter.get認定証の交付日().toRDate(), ninshoshaSource);

        report.writeBy(reportSourceWriter);
    }

    @Override
    protected void afterExecute() {
        バッチ出力条件リストの出力();
    }

    private static ChohyoSeigyoKyotsu 帳票制御共通取得() {
        return new ChohyoSeigyoKyotsuManager().get帳票制御共通(SubGyomuCode.DBD介護受給, 帳票分類ID.getReportId());
    }

    private List<DbT7067ChohyoSeigyoHanyoEntity> 帳票制御汎用取得() {
        DbT7067ChohyoSeigyoHanyoDac dbT7067Dac = InstanceProvider.create(DbT7067ChohyoSeigyoHanyoDac.class);
        return dbT7067Dac.get帳票制御汎用一覧(SubGyomuCode.DBD介護受給, 帳票分類ID.getReportId());
    }

    private void バッチ出力条件リストの出力() {
        RString 導入団体コード = 地方公共団体.getLasdecCode_().getColumnValue();
        RString 市町村名 = 地方公共団体.get市町村名();
        RString ジョブ番号 = new RString(String.valueOf(JobContextHolder.getJobId()));
        RString 出力ページ数 = new RString(String.valueOf(batchReportWrite.getPageCount()));
        RString csv出力有無 = new RString("なし");
        RString csvファイル名 = new RString("なし");

        List<RString> 出力条件 = new ArrayList<>();
        出力条件.add(単票発行区分.concat(processParamter.get単票発行区分().get名称()));
        出力条件.add(旧措置者区分.concat(processParamter.get旧措置者区分().get名称()));
        出力条件.add(年度.concat(processParamter.get年度開始日().toString())
                .concat(カラ)
                .concat(processParamter.get年度終了日().toString()));
        出力条件.add(抽出期間種類.concat(processParamter.get対象区分().get名称()));
        出力条件.add(対象期間範囲.concat(processParamter.get対象日FROM().toString())
                .concat(カラ)
                .concat(processParamter.get対象日TO().toString()));
        出力条件.add(交付日.concat(processParamter.get認定証の交付日().toString()));
        RString 設定項目 = RString.EMPTY;
        for (ISetSortItem item : outputOrder.get設定項目リスト()) {
            設定項目.concat(より大きい).concat(item.get項目名());
        }
        if (!設定項目.isEmpty()) {
            設定項目 = 設定項目.substringEmptyOnError(1, 設定項目.length() - 1);
        }
        出力条件.add(new RString("【出力順】").concat(設定項目));

        ReportOutputJokenhyoItem reportOutputJokenhyoItem = new ReportOutputJokenhyoItem(
                帳票ID.getReportId().value(),
                導入団体コード,
                市町村名,
                ジョブ番号,
                帳票ID.getReportName(),
                出力ページ数,
                csv出力有無,
                csvファイル名,
                出力条件);
        IReportOutputJokenhyoPrinter printer = OutputJokenhyoFactory.createInstance(reportOutputJokenhyoItem);
        printer.print();
    }
}
