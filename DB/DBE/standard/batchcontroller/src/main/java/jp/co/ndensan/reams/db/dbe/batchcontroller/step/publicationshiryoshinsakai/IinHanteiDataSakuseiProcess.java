/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.report.iinYobihanteiKinyuhyo.IinYobihanteiKinyuhyoItem;
import jp.co.ndensan.reams.db.dbe.business.report.iinYobihanteiKinyuhyo.IinYobihanteiKinyuhyoReport;
import jp.co.ndensan.reams.db.dbe.definition.core.reportid.ReportIdDBE;
import jp.co.ndensan.reams.db.dbe.definition.core.shinsakai.ShinsakaiOrderKakuteiFlg;
import jp.co.ndensan.reams.db.dbe.definition.mybatisprm.publicationshiryoshinsakai.IinTokkiJikouItiziHanteiMyBatisParameter;
import jp.co.ndensan.reams.db.dbe.definition.processprm.publicationshiryoshinsakai.IinTokkiJikouItiziHanteiProcessParameter;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.publicationshiryoshinsakai.HanteiJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.report.iinYobihanteiKinyuhyoReportSource.IinYobihanteiKinyuhyoReportSource;
import jp.co.ndensan.reams.db.dbz.definition.core.seibetsu.Seibetsu;
import jp.co.ndensan.reams.db.dbz.definition.core.tokuteishippei.TokuteiShippei;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigojotaikubun.YokaigoJotaiKubun09;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.ichijihantei.IchijiHanteiKekkaCode09;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.shinsei.NinteiShinseiShinseijiKubunCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.shinsei.ShoriJotaiKubun;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.report.outputjokenhyo.EucFileOutputJokenhyoItem;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.OutputJokenhyoFactory;
import jp.co.ndensan.reams.uz.uza.batch.batchexecutor.util.JobContextHolder;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.ui.binding.propertyenum.DisplayTimeFormat;

/**
 * 委員用予備判定記入表情報バッチクラスです。
 *
 * @reamsid_L DBE-0150-200 linghuhang
 */
public class IinHanteiDataSakuseiProcess extends BatchProcessBase<HanteiJohoEntity> {

    private static final RString SELECT_HANTEIJOHO = new RString("jp.co.ndensan.reams.db.dbe.persistence.db"
            + ".mapper.relate.publicationshiryoshinsakai.IShiryoShinsakaiIinMapper.getHanteiJoho");
    private IinTokkiJikouItiziHanteiProcessParameter paramter;
    private IinTokkiJikouItiziHanteiMyBatisParameter myBatisParameter;
    @BatchWriter
    private BatchReportWriter<IinYobihanteiKinyuhyoReportSource> batchWrite;
    private ReportSourceWriter<IinYobihanteiKinyuhyoReportSource> reportSourceWriter;
    private final RString 出力スタイル_A4 = new RString("1");

    @Override
    protected void initialize() {
        myBatisParameter = paramter.toIinTokkiJikouItiziHanteiMyBatisParameter();
        myBatisParameter.setOrderKakuteiFlg(ShinsakaiOrderKakuteiFlg.確定.is介護認定審査会審査順確定());
        myBatisParameter.setIsShoriJotaiKubun0(ShoriJotaiKubun.通常.getコード());
        myBatisParameter.setIsShoriJotaiKubun3(ShoriJotaiKubun.延期.getコード());
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(SELECT_HANTEIJOHO, myBatisParameter);
    }

    @Override
    protected void process(HanteiJohoEntity entity) {
        IinYobihanteiKinyuhyoReport report = IinYobihanteiKinyuhyoReport.createFrom(set項目(entity));
        report.writeBy(reportSourceWriter);
    }

    @Override
    protected void createWriter() {
        if (出力スタイル_A4.equals(paramter.getShuturyokuSutairu())) {
            batchWrite = BatchReportFactory.createBatchReportWriter(ReportIdDBE.DBE517022.getReportId().value()).create();
        } else {
            batchWrite = BatchReportFactory.createBatchReportWriter(ReportIdDBE.DBE517003.getReportId().value()).create();
        }
        reportSourceWriter = new ReportSourceWriter<>(batchWrite);
    }

    @Override
    protected void afterExecute() {
        outputJokenhyoFactory();
    }

    private IinYobihanteiKinyuhyoItem set項目(HanteiJohoEntity entity) {
        return new IinYobihanteiKinyuhyoItem(作成年月日(),
                paramter.getShinsakaiKaisaiNo(),
                new RString(entity.getShinsakaiOrder()),
                entity.getShichosonMeisho(),
                NinteiShinseiShinseijiKubunCode.toValue(
                        entity.getShinseijiKubunCode().getColumnValue()).get名称(),
                entity.getHihokenshaNo(),
                entity.getHihokenshaName().getColumnValue(),
                Seibetsu.toValue(entity.getSeibetsu().getColumnValue()).get名称(),
                new RString(entity.getAge()),
                YokaigoJotaiKubun09.toValue(entity.getYokaigoJotaiKubunCode().getColumnValue()).get名称(),
                new RString(entity.getHanteiNinteiYukoKikan()),
                IchijiHanteiKekkaCode09.toValue(entity.getIchijiHanteiKekkaCode().getColumnValue()).get名称(),
                RString.EMPTY,
                RString.EMPTY,
                RString.EMPTY,
                entity.getNigoTokuteiShippeiCode().getColumnValue(),
                TokuteiShippei.toValue(entity.getNigoTokuteiShippeiCode().getColumnValue()).get名称());
    }

    private RString 作成年月日() {
        RStringBuilder builder = new RStringBuilder();
        return builder.append(RDate.getNowDate().wareki().eraType(EraType.KANJI).
                firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString())
                .append(" ")
                .append(RDate.getNowTime().toFormattedTimeString(DisplayTimeFormat.HH時mm分ss秒).toString())
                .append(" ")
                .append("作成")
                .toRString();
    }

    private void outputJokenhyoFactory() {
        RString id;
        RString idName;
        RString 総ページ数 = new RString(batchWrite.getPageCount());
        if (出力スタイル_A4.equals(paramter.getShuturyokuSutairu())) {
            id = ReportIdDBE.DBE517022.getReportId().getColumnValue();
            idName = ReportIdDBE.DBE517022.getReportName();
        } else {
            id = ReportIdDBE.DBE517003.getReportId().getColumnValue();
            idName = ReportIdDBE.DBE517003.getReportName();
        }
        Association association = AssociationFinderFactory.createInstance().getAssociation();
        EucFileOutputJokenhyoItem item = new EucFileOutputJokenhyoItem(
                id,
                association.getLasdecCode_().getColumnValue(),
                association.get市町村名(),
                new RString(String.valueOf(JobContextHolder.getJobId())),
                idName,
                総ページ数,
                RString.EMPTY,
                出力条件());
        OutputJokenhyoFactory.createInstance(item).print();
    }

    private List<RString> 出力条件() {
        List<RString> list = new ArrayList<>();
        RStringBuilder builder = new RStringBuilder();
        builder.append("【介護認定審査会開催番号】")
                .append(" ")
                .append(paramter.getShinsakaiKaisaiNo());
        list.add(builder.toRString());
        return list;
    }
}
