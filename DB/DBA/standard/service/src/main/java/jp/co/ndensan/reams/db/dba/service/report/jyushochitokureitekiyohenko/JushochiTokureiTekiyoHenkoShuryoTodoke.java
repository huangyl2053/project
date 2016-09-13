/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.service.report.jyushochitokureitekiyohenko;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dba.business.core.tokuteifutangendogakushinseisho.HihokenshaKihonBusiness;
import jp.co.ndensan.reams.db.dba.business.report.jyushochitokureitekiyohenko.JyushochiTokureiTekiyoHenkoItem;
import jp.co.ndensan.reams.db.dba.business.report.jyushochitokureitekiyohenko.JyushochiTokureiTekiyoHenkoProerty;
import jp.co.ndensan.reams.db.dba.business.report.jyushochitokureitekiyohenko.JyushochiTokureiTekiyoHenkoReport;
import jp.co.ndensan.reams.db.dba.entity.report.jyushochitokureitekiyohenko.JyushochiTokureiTekiyoHenkoReportSource;
import jp.co.ndensan.reams.db.dba.service.core.tokuteifutangendogakushinseisho.TokuteifutanGendogakuShinseisho;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBU;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.core.kyotsu.GaikokujinSeinengappiHyojihoho;
import jp.co.ndensan.reams.db.dbz.definition.core.kyotsu.NinshoshaDenshikoinshubetsuCode;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.core.ninshosha.Ninshosha;
import jp.co.ndensan.reams.ur.urz.business.report.parts.ninshosha.INinshoshaSourceBuilder;
import jp.co.ndensan.reams.ur.urz.business.report.parts.ninshosha.NinshoshaSourceBuilderFactory;
import jp.co.ndensan.reams.ur.urz.definition.core.shikibetsutaisho.Gender;
import jp.co.ndensan.reams.ur.urz.definition.core.shikibetsutaisho.JuminShubetsu;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.core.ninshosha.NinshoshaFinderFactory;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.report.IReportProperty;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.Report;
import jp.co.ndensan.reams.uz.uza.report.ReportAssembler;
import jp.co.ndensan.reams.uz.uza.report.ReportAssemblerBuilder;
import jp.co.ndensan.reams.uz.uza.report.ReportManager;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.report.SourceDataCollection;
import jp.co.ndensan.reams.uz.uza.report.source.breaks.BreakAggregator;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 介護保険住所地特例適用・変更・終了届のPrintクラスです。
 *
 * @reamsid_L DBA-0540-100 dongyabin
 */
public class JushochiTokureiTekiyoHenkoShuryoTodoke {

    private static final RString 生年月日不詳区分_FALG = new RString("0");

    /**
     * 介護保険住所地特例適用・変更・終了届をPrintします。
     *
     * @param 識別コード 識別コード
     * @param 被保険者番号 被保険者番号
     * @return 介護保険住所地特例適用・変更・終了届作成_帳票
     */
    public SourceDataCollection createJushochiTokureiTekiyoHenkoShuryoTodokeChohyo(
            ShikibetsuCode 識別コード, HihokenshaNo 被保険者番号) {
        JyushochiTokureiTekiyoHenkoProerty proerty = new JyushochiTokureiTekiyoHenkoProerty();
        try (ReportManager reportManager = new ReportManager()) {
            try (ReportAssembler<JyushochiTokureiTekiyoHenkoReportSource> assembler = createAssembler(proerty, reportManager)) {
                ReportSourceWriter<JyushochiTokureiTekiyoHenkoReportSource> reportSourceWrite = new ReportSourceWriter(assembler);
                Ninshosha nishosha = NinshoshaFinderFactory.createInstance().get帳票認証者(
                        GyomuCode.DB介護保険, NinshoshaDenshikoinshubetsuCode.保険者印.getコード());
                Association association = AssociationFinderFactory.createInstance().getAssociation();
                INinshoshaSourceBuilder ninshoshaSourceBuilder = NinshoshaSourceBuilderFactory.createInstance(
                        nishosha, association, reportSourceWrite.getImageFolderPath(), RDate.getNowDate());
                for (JyushochiTokureiTekiyoHenkoReport report : toReports(get被保険者基本情報(識別コード, 被保険者番号),
                        ninshoshaSourceBuilder.buildSource().ninshoshaYakushokuMei)) {
                    report.writeBy(reportSourceWrite);
                }
            }
            return reportManager.publish();
        }
    }

    private static List<JyushochiTokureiTekiyoHenkoReport> toReports(HihokenshaKihonBusiness entity, RString ninshoshaYakushokuMei) {
        List<JyushochiTokureiTekiyoHenkoReport> list = new ArrayList<>();
        RString birthYMD = RString.EMPTY;
        RString 住民種別コード = entity.get住民種別コード();
        FlexibleDate 生年月日 = entity.get生年月日();
        if (生年月日 != null && !生年月日.isEmpty()) {
            if (JuminShubetsu.日本人.getCode().equals(住民種別コード)
                || JuminShubetsu.住登外個人_日本人.getCode().equals(住民種別コード)) {
                birthYMD = set生年月日_日本人(生年月日);
            } else if (JuminShubetsu.外国人.getCode().equals(住民種別コード)
                       || JuminShubetsu.住登外個人_外国人.getCode().equals(住民種別コード)) {
                birthYMD = set生年月日(生年月日, entity.get生年月日不詳区分());
            }
        }
        RStringBuilder 認証者 = new RStringBuilder();
        if (!RString.isNullOrEmpty(ninshoshaYakushokuMei)) {
            認証者.append(ninshoshaYakushokuMei);
            認証者.append("長様");
        }
        JyushochiTokureiTekiyoHenkoItem item = new JyushochiTokureiTekiyoHenkoItem(
                認証者.toRString(),
                entity.get被保険者番号() == null ? RString.EMPTY : entity.get被保険者番号().getColumnValue(),
                entity.getフリガナ(),
                entity.get被保険者氏名(),
                birthYMD,
                Gender.toValue(entity.get性別()).getCommonName());
        list.add(JyushochiTokureiTekiyoHenkoReport.createReport(item));
        return list;
    }

    private static RString set生年月日_日本人(FlexibleDate 生年月日) {
        return 生年月日.wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN)
                .separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
    }

    private static RString set生年月日(FlexibleDate 生年月日, RString 生年月日不詳区分) {
        RString 外国人表示制御_生年月日表示方法 = DbBusinessConfig.get(ConfigNameDBU.外国人表示制御_生年月日表示方法, RDate.getNowDate(), SubGyomuCode.DBU介護統計報告);
        if (GaikokujinSeinengappiHyojihoho.西暦表示.getコード().equals(外国人表示制御_生年月日表示方法)) {
            return 生年月日.seireki().separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
        } else if (GaikokujinSeinengappiHyojihoho.和暦表示.getコード().equals(外国人表示制御_生年月日表示方法)) {
            return set生年月日_和暦表示(生年月日, 生年月日不詳区分);
        }
        return RString.EMPTY;
    }

    private static RString set生年月日_和暦表示(FlexibleDate 生年月日, RString 生年月日不詳区分) {
        if (生年月日不詳区分_FALG.equals(生年月日不詳区分)) {
            return 生年月日.wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN)
                    .separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
        }
        return RString.EMPTY;
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

    private HihokenshaKihonBusiness get被保険者基本情報(ShikibetsuCode 識別コード, HihokenshaNo 被保険者番号) {
        TokuteifutanGendogakuShinseisho shinjoho = InstanceProvider.create(TokuteifutanGendogakuShinseisho.class);
        return shinjoho.getHihokenshaKihonJoho(被保険者番号, 識別コード);
    }
}