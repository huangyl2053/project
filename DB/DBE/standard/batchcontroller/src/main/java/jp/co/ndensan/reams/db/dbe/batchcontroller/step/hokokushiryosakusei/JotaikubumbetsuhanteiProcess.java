package jp.co.ndensan.reams.db.dbe.batchcontroller.step.hokokushiryosakusei;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.core.jotaikubumbetsuhantei.Jotaikubumbetsuhantei;
import jp.co.ndensan.reams.db.dbe.business.report.jotaikubumbetsuhantei.JotaikubumbetsuhanteiReport;
import jp.co.ndensan.reams.db.dbe.definition.core.reportid.ReportIdDBE;
import jp.co.ndensan.reams.db.dbe.definition.mybatisprm.hokokushiryosakusei.SinsakaiHanteiJyokyoMyBatisParameter;
import jp.co.ndensan.reams.db.dbe.definition.processprm.hokokushiryosakusei.SinsakaiHanteiJyokyoProcessParameter;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.hokokushiryosakusei.SinsakaiHanteiJyokyoEntity;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.hokokushiryosakusei.SinsakaiHanteiJyokyoHeaderEntity;
import jp.co.ndensan.reams.db.dbe.entity.report.source.jotaikubumbetsuhantei.JotaikubumbetsuhanteiReportSource;
import jp.co.ndensan.reams.db.dbe.persistence.db.mapper.relate.hokokushiryosakusei.IHokokuShiryoSakuSeiMapper;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchKeyBreakBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.BreakerCatalog;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 介護認定審査会判定状況の取得バッチクラスです。
 *
 * @reamsid_L DBE-1450-020 wangxiaodong
 */
public class JotaikubumbetsuhanteiProcess extends BatchKeyBreakBase<SinsakaiHanteiJyokyoHeaderEntity> {

    private static final RString SELECT_HEADER = new RString("jp.co.ndensan.reams.db.dbe.persistence"
            + ".db.mapper.relate.hokokushiryosakusei.IHokokuShiryoSakuSeiMapper.getJotaikubumbetsuhanteiHeader");
    private static final List<RString> PAGE_BREAK_KEYS = Collections.unmodifiableList(Arrays.asList(
            new RString(JotaikubumbetsuhanteiReportSource.ReportSourceFields.gogitaiName.name()),
            new RString(JotaikubumbetsuhanteiReportSource.ReportSourceFields.shichosonNo.name())));
    private static final RString 帳票タイトル = new RString("要介護状態区分別判定件数");
    private static final RString 非該当 = new RString("01");
    private static final RString 要支援1 = new RString("12");
    private static final RString 要支援2 = new RString("13");
    private static final RString 要介護1 = new RString("21");
    private static final RString 要介護2 = new RString("22");
    private static final RString 要介護3 = new RString("23");
    private static final RString 要介護4 = new RString("24");
    private static final RString 要介護5 = new RString("25");
    private static final RString 再調査 = new RString("31");
    private static final RString 非該当タイトル = new RString("非該当");
    private static final RString 要支援1タイトル = new RString("要支援1");
    private static final RString 要支援2タイトル = new RString("要支援2");
    private static final RString 要介護1タイトル = new RString("要介護1");
    private static final RString 要介護2タイトル = new RString("要介護2");
    private static final RString 要介護3タイトル = new RString("要介護3");
    private static final RString 要介護4タイトル = new RString("要介護4");
    private static final RString 要介護5タイトル = new RString("要介護5");
    private static final RString 計タイトル = new RString("計");
    private static final RString 変更者タイトル = new RString("変更者");
    private static final RString 割合タイトル = new RString("割合");
    private static final RString 割合計 = new RString("100%");
    private static final RString パーセント = new RString("%");
    private static final RString なし = new RString(0);
    private static final int 割合 = 100;
    private Jotaikubumbetsuhantei jotaikubumbetsuhantei;
    private SinsakaiHanteiJyokyoProcessParameter paramter;
    private IHokokuShiryoSakuSeiMapper mapper;

    @BatchWriter
    private BatchReportWriter<JotaikubumbetsuhanteiReportSource> batchWriter;
    private ReportSourceWriter<JotaikubumbetsuhanteiReportSource> reportSourceWriter;

    @Override
    protected void initialize() {
        jotaikubumbetsuhantei = new Jotaikubumbetsuhantei();
        mapper = getMapper(IHokokuShiryoSakuSeiMapper.class);
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(SELECT_HEADER, paramter.toSinsakaiHanteiJyokyoMyBatisParameter());
    }

    @Override
    protected void createWriter() {
        batchWriter = BatchReportFactory.createBatchReportWriter(ReportIdDBE.DBE701005.getReportId().value())
                .addBreak(new BreakerCatalog<JotaikubumbetsuhanteiReportSource>().simplePageBreaker(PAGE_BREAK_KEYS))
                .create();
        reportSourceWriter = new ReportSourceWriter<>(batchWriter);
    }

    @Override
    protected void keyBreakProcess(SinsakaiHanteiJyokyoHeaderEntity headerJoho) {
        if (hasBrek(getBefore(), headerJoho)) {
            JotaikubumbetsuhanteiReport report = new JotaikubumbetsuhanteiReport(jotaikubumbetsuhantei);
            report.writeBy(reportSourceWriter);
            jotaikubumbetsuhantei = new Jotaikubumbetsuhantei();
        }
    }

    @Override
    protected void usualProcess(SinsakaiHanteiJyokyoHeaderEntity current) {
        jotaikubumbetsuhantei.setタイトル(帳票タイトル);
        jotaikubumbetsuhantei.set合議体名称(current.getGogitaiMei());
        jotaikubumbetsuhantei.set開催開始年月日(current.getShinsakaiKaisaiYMDMin());
        jotaikubumbetsuhantei.set開催終了年月日(current.getShinsakaiKaisaiYMDMax());
        jotaikubumbetsuhantei.set開催回数(new RString(current.getShinsakaiKaisaiNoCount()));
        jotaikubumbetsuhantei.set市町村番号(current.getShichosonCode().value());
        jotaikubumbetsuhantei.set市町村名(current.getShichosonMeisho());
        jotaikubumbetsuhantei.set発行日時(RDateTime.now());
        jotaikubumbetsuhantei.set二次判定非該当タイトル(非該当タイトル);
        jotaikubumbetsuhantei.set二次判定要支援1タイトル(要支援1タイトル);
        jotaikubumbetsuhantei.set二次判定要支援2タイトル(要支援2タイトル);
        jotaikubumbetsuhantei.set二次判定要介護1タイトル(要介護1タイトル);
        jotaikubumbetsuhantei.set二次判定要介護2タイトル(要介護2タイトル);
        jotaikubumbetsuhantei.set二次判定要介護3タイトル(要介護3タイトル);
        jotaikubumbetsuhantei.set二次判定要介護4タイトル(要介護4タイトル);
        jotaikubumbetsuhantei.set二次判定要介護5タイトル(要介護5タイトル);
        jotaikubumbetsuhantei.set一次判定_計タイトル(計タイトル);
        List<SinsakaiHanteiJyokyoEntity> 審査判定状況 = get審査判定状況(current);
        set一次判定非該当(審査判定状況);
        set一次判定要支援1(審査判定状況);
        set一次判定要支援2(審査判定状況);
        set一次判定要介護1(審査判定状況);
        set一次判定要介護2(審査判定状況);
        set一次判定要介護3(審査判定状況);
        set一次判定要介護4(審査判定状況);
        set一次判定要介護5(審査判定状況);
        set計();
        set変更者();
        set割合();
        jotaikubumbetsuhantei.set変更者(jotaikubumbetsuhantei.get計_判定変更者数());
        jotaikubumbetsuhantei.set軽度(jotaikubumbetsuhantei.get計_軽度変更者数());
        jotaikubumbetsuhantei.set重度(jotaikubumbetsuhantei.get計_重度変更者数());
    }

    @Override
    protected void afterExecute() {
        JotaikubumbetsuhanteiReport report = new JotaikubumbetsuhanteiReport(jotaikubumbetsuhantei);
        report.writeBy(reportSourceWriter);
    }

    private boolean hasBrek(SinsakaiHanteiJyokyoHeaderEntity before, SinsakaiHanteiJyokyoHeaderEntity current) {
        return !(before.getGogitaiMei() == current.getGogitaiMei()
                && before.getShichosonCode().equals(current.getShichosonCode()));
    }

    private List<SinsakaiHanteiJyokyoEntity> get審査判定状況(SinsakaiHanteiJyokyoHeaderEntity current) {
        SinsakaiHanteiJyokyoMyBatisParameter batisParameter = paramter.toSinsakaiHanteiJyokyoMyBatisParameter();
        batisParameter.setGogitaiNo(current.getGogitaiNo());
        batisParameter.setTaishoGeppiFrom(current.getShinsakaiKaisaiYMDMin());
        batisParameter.setTaishoGeppiTo(current.getShinsakaiKaisaiYMDMax());
        batisParameter.setShichosonCode(current.getShichosonCode());
        return mapper.getSinsakaiHanteiJyokyo(batisParameter);
    }

    private void set一次判定非該当(List<SinsakaiHanteiJyokyoEntity> 審査判定状況) {
        int 非該当非該当被保険者数 = get被保険者数(審査判定状況, 非該当, 非該当);
        int 非該当要支援1被保険者数 = get被保険者数(審査判定状況, 非該当, 要支援1);
        int 非該当要支援2被保険者数 = get被保険者数(審査判定状況, 非該当, 要支援2);
        int 非該当要介護1被保険者数 = get被保険者数(審査判定状況, 非該当, 要介護1);
        int 非該当要介護2被保険者数 = get被保険者数(審査判定状況, 非該当, 要介護2);
        int 非該当要介護3被保険者数 = get被保険者数(審査判定状況, 非該当, 要介護3);
        int 非該当要介護4被保険者数 = get被保険者数(審査判定状況, 非該当, 要介護4);
        int 非該当要介護5被保険者数 = get被保険者数(審査判定状況, 非該当, 要介護5);
        int 非該当計 = 非該当非該当被保険者数 + 非該当要支援1被保険者数 + 非該当要支援2被保険者数 + 非該当要介護1被保険者数
                + 非該当要介護2被保険者数 + 非該当要介護3被保険者数 + 非該当要介護4被保険者数 + 非該当要介護5被保険者数;
        int 非該当再調査二次被保険者数 = get被保険者数(審査判定状況, 非該当, 再調査);
        jotaikubumbetsuhantei.set一次判定非該当タイトル(非該当タイトル);
        jotaikubumbetsuhantei.set一次判定非該当_二次判定非該当(new RString(非該当非該当被保険者数));
        jotaikubumbetsuhantei.set一次判定非該当_二次判定要支援1(new RString(非該当要支援1被保険者数));
        jotaikubumbetsuhantei.set一次判定非該当_二次判定要支援2(new RString(非該当要支援2被保険者数));
        jotaikubumbetsuhantei.set一次判定非該当_二次判定要介護1(new RString(非該当要介護1被保険者数));
        jotaikubumbetsuhantei.set一次判定非該当_二次判定要介護2(new RString(非該当要介護2被保険者数));
        jotaikubumbetsuhantei.set一次判定非該当_二次判定要介護3(new RString(非該当要介護3被保険者数));
        jotaikubumbetsuhantei.set一次判定非該当_二次判定要介護4(new RString(非該当要介護4被保険者数));
        jotaikubumbetsuhantei.set一次判定非該当_二次判定要介護5(new RString(非該当要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定非該当_計(new RString(非該当計));
        jotaikubumbetsuhantei.set一次判定非該当_再調査二次保留分(new RString(非該当再調査二次被保険者数));
        jotaikubumbetsuhantei.set一次判定非該当_判定変更者数(new RString(非該当計 - 非該当非該当被保険者数));
        jotaikubumbetsuhantei.set一次判定非該当_軽度変更者数(なし);
        jotaikubumbetsuhantei.set一次判定非該当_重度変更者数(new RString(非該当計 - 非該当非該当被保険者数));
        jotaikubumbetsuhantei.set一次判定非該当_判定変更割合(非該当計 == 非該当非該当被保険者数
                ? なし : new RString(String.valueOf((非該当計 - 非該当非該当被保険者数) / 非該当計 * 割合)));
    }

    private void set一次判定要支援1(List<SinsakaiHanteiJyokyoEntity> 審査判定状況) {
        int 要支援1非該当被保険者数 = get被保険者数(審査判定状況, 要支援1, 非該当);
        int 要支援1要支援1被保険者数 = get被保険者数(審査判定状況, 要支援1, 要支援1);
        int 要支援1要支援2被保険者数 = get被保険者数(審査判定状況, 要支援1, 要支援2);
        int 要支援1要介護1被保険者数 = get被保険者数(審査判定状況, 要支援1, 要介護1);
        int 要支援1要介護2被保険者数 = get被保険者数(審査判定状況, 要支援1, 要介護2);
        int 要支援1要介護3被保険者数 = get被保険者数(審査判定状況, 要支援1, 要介護3);
        int 要支援1要介護4被保険者数 = get被保険者数(審査判定状況, 要支援1, 要介護4);
        int 要支援1要介護5被保険者数 = get被保険者数(審査判定状況, 要支援1, 要介護5);
        int 要支援1計 = 要支援1非該当被保険者数 + 要支援1要支援1被保険者数 + 要支援1要支援2被保険者数 + 要支援1要介護1被保険者数
                + 要支援1要介護2被保険者数 + 要支援1要介護3被保険者数 + 要支援1要介護4被保険者数 + 要支援1要介護5被保険者数;
        int 要支援1再調査二次被保険者数 = get被保険者数(審査判定状況, 要支援1, 再調査);
        jotaikubumbetsuhantei.set一次判定要支援1タイトル(要支援1タイトル);
        jotaikubumbetsuhantei.set一次判定要支援1_二次判定非該当(new RString(要支援1非該当被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援1_二次判定要支援1(new RString(要支援1要支援1被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援1_二次判定要支援2(new RString(要支援1要支援2被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援1_二次判定要介護1(new RString(要支援1要介護1被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援1_二次判定要介護2(new RString(要支援1要介護2被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援1_二次判定要介護3(new RString(要支援1要介護3被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援1_二次判定要介護4(new RString(要支援1要介護4被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援1_二次判定要介護5(new RString(要支援1要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援1_計(new RString(要支援1計));
        jotaikubumbetsuhantei.set一次判定要支援1_再調査二次保留分(new RString(要支援1再調査二次被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援1_判定変更者数(new RString(要支援1計 - 要支援1要支援1被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援1_軽度変更者数(new RString(要支援1非該当被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援1_重度変更者数(new RString(要支援1計 - 要支援1非該当被保険者数 - 要支援1要支援1被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援1_判定変更割合(要支援1計 == 要支援1要支援1被保険者数
                ? なし : new RString(String.valueOf((要支援1計 - 要支援1要支援1被保険者数) / 要支援1計 * 割合)));
    }

    private void set一次判定要支援2(List<SinsakaiHanteiJyokyoEntity> 審査判定状況) {
        int 要支援2非該当被保険者数 = get被保険者数(審査判定状況, 要支援2, 非該当);
        int 要支援2要支援1被保険者数 = get被保険者数(審査判定状況, 要支援2, 要支援1);
        int 要支援2要支援2被保険者数 = get被保険者数(審査判定状況, 要支援2, 要支援2);
        int 要支援2要介護1被保険者数 = get被保険者数(審査判定状況, 要支援2, 要介護1);
        int 要支援2要介護2被保険者数 = get被保険者数(審査判定状況, 要支援2, 要介護2);
        int 要支援2要介護3被保険者数 = get被保険者数(審査判定状況, 要支援2, 要介護3);
        int 要支援2要介護4被保険者数 = get被保険者数(審査判定状況, 要支援2, 要介護4);
        int 要支援2要介護5被保険者数 = get被保険者数(審査判定状況, 要支援2, 要介護5);
        int 要支援2計 = 要支援2非該当被保険者数 + 要支援2要支援1被保険者数 + 要支援2要支援2被保険者数 + 要支援2要介護1被保険者数
                + 要支援2要介護2被保険者数 + 要支援2要介護3被保険者数 + 要支援2要介護4被保険者数 + 要支援2要介護5被保険者数;
        int 要支援2再調査二次被保険者数 = get被保険者数(審査判定状況, 要支援2, 再調査);
        jotaikubumbetsuhantei.set一次判定要支援2タイトル(要支援2タイトル);
        jotaikubumbetsuhantei.set一次判定要支援2_二次判定非該当(new RString(要支援2非該当被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援2_二次判定要支援1(new RString(要支援2要支援1被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援2_二次判定要支援2(new RString(要支援2要支援2被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援2_二次判定要介護1(new RString(要支援2要介護1被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援2_二次判定要介護2(new RString(要支援2要介護2被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援2_二次判定要介護3(new RString(要支援2要介護3被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援2_二次判定要介護4(new RString(要支援2要介護4被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援2_二次判定要介護5(new RString(要支援2要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援2_計(new RString(要支援2計));
        jotaikubumbetsuhantei.set一次判定要支援2_再調査二次保留分(new RString(要支援2再調査二次被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援2_判定変更者数(new RString(要支援2計 - 要支援2要支援2被保険者数 - 要支援2要介護1被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援2_軽度変更者数(new RString(要支援2非該当被保険者数 + 要支援2要支援1被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援2_重度変更者数(new RString(要支援2要介護2被保険者数
                + 要支援2要介護3被保険者数 + 要支援2要介護4被保険者数 + 要支援2要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要支援2_判定変更割合(要支援2計 - 要支援2要支援2被保険者数 - 要支援2要介護1被保険者数 == 0
                ? なし : new RString(String.valueOf((要支援2計 - 要支援2要支援2被保険者数 - 要支援2要介護1被保険者数) / 要支援2計 * 割合)));
    }

    private void set一次判定要介護1(List<SinsakaiHanteiJyokyoEntity> 審査判定状況) {
        int 要介護1非該当被保険者数 = get被保険者数(審査判定状況, 要介護1, 非該当);
        int 要介護1要支援1被保険者数 = get被保険者数(審査判定状況, 要介護1, 要支援1);
        int 要介護1要支援2被保険者数 = get被保険者数(審査判定状況, 要介護1, 要支援2);
        int 要介護1要介護1被保険者数 = get被保険者数(審査判定状況, 要介護1, 要介護1);
        int 要介護1要介護2被保険者数 = get被保険者数(審査判定状況, 要介護1, 要介護2);
        int 要介護1要介護3被保険者数 = get被保険者数(審査判定状況, 要介護1, 要介護3);
        int 要介護1要介護4被保険者数 = get被保険者数(審査判定状況, 要介護1, 要介護4);
        int 要介護1要介護5被保険者数 = get被保険者数(審査判定状況, 要介護1, 要介護5);
        int 要介護1計 = 要介護1非該当被保険者数 + 要介護1要支援1被保険者数 + 要介護1要支援2被保険者数 + 要介護1要介護1被保険者数
                + 要介護1要介護2被保険者数 + 要介護1要介護3被保険者数 + 要介護1要介護4被保険者数 + 要介護1要介護5被保険者数;
        int 要介護1再調査二次被保険者数 = get被保険者数(審査判定状況, 要介護1, 再調査);
        jotaikubumbetsuhantei.set一次判定要介護1タイトル(要介護1タイトル);
        jotaikubumbetsuhantei.set一次判定要介護1_二次判定非該当(new RString(要介護1非該当被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護1_二次判定要支援1(new RString(要介護1要支援1被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護1_二次判定要支援2(new RString(要介護1要支援2被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護1_二次判定要介護1(new RString(要介護1要介護1被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護1_二次判定要介護2(new RString(要介護1要介護2被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護1_二次判定要介護3(new RString(要介護1要介護3被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護1_二次判定要介護4(new RString(要介護1要介護4被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護1_二次判定要介護5(new RString(要介護1要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護1_計(new RString(要介護1計));
        jotaikubumbetsuhantei.set一次判定要介護1_再調査二次保留分(new RString(要介護1再調査二次被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護1_判定変更者数(new RString(要介護1計 - 要介護1要支援2被保険者数 - 要介護1要介護1被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護1_軽度変更者数(new RString(要介護1非該当被保険者数 + 要介護1要支援1被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護1_重度変更者数(new RString(要介護1要介護2被保険者数
                + 要介護1要介護3被保険者数 + 要介護1要介護4被保険者数 + 要介護1要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護1_判定変更割合(要介護1計 - 要介護1要支援2被保険者数 - 要介護1要介護1被保険者数 == 0
                ? なし : new RString(String.valueOf((要介護1計 - 要介護1要支援2被保険者数 - 要介護1要介護1被保険者数) / 要介護1計 * 割合)));
    }

    private void set一次判定要介護2(List<SinsakaiHanteiJyokyoEntity> 審査判定状況) {
        int 要介護2非該当被保険者数 = get被保険者数(審査判定状況, 要介護2, 非該当);
        int 要介護2要支援1被保険者数 = get被保険者数(審査判定状況, 要介護2, 要支援1);
        int 要介護2要支援2被保険者数 = get被保険者数(審査判定状況, 要介護2, 要支援2);
        int 要介護2要介護1被保険者数 = get被保険者数(審査判定状況, 要介護2, 要介護1);
        int 要介護2要介護2被保険者数 = get被保険者数(審査判定状況, 要介護2, 要介護2);
        int 要介護2要介護3被保険者数 = get被保険者数(審査判定状況, 要介護2, 要介護3);
        int 要介護2要介護4被保険者数 = get被保険者数(審査判定状況, 要介護2, 要介護4);
        int 要介護2要介護5被保険者数 = get被保険者数(審査判定状況, 要介護2, 要介護5);
        int 要介護2計 = 要介護2非該当被保険者数 + 要介護2要支援1被保険者数 + 要介護2要支援2被保険者数 + 要介護2要介護1被保険者数
                + 要介護2要介護2被保険者数 + 要介護2要介護3被保険者数 + 要介護2要介護4被保険者数 + 要介護2要介護5被保険者数;
        int 要介護2再調査二次被保険者数 = get被保険者数(審査判定状況, 要介護2, 再調査);
        jotaikubumbetsuhantei.set一次判定要介護2タイトル(要介護2タイトル);
        jotaikubumbetsuhantei.set一次判定要介護2_二次判定非該当(new RString(要介護2非該当被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護2_二次判定要支援1(new RString(要介護2要支援1被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護2_二次判定要支援2(new RString(要介護2要支援2被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護2_二次判定要介護1(new RString(要介護2要介護1被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護2_二次判定要介護2(new RString(要介護2要介護2被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護2_二次判定要介護3(new RString(要介護2要介護3被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護2_二次判定要介護4(new RString(要介護2要介護4被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護2_二次判定要介護5(new RString(要介護2要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護2_計(new RString(要介護2計));
        jotaikubumbetsuhantei.set一次判定要介護2_再調査二次保留分(new RString(要介護2再調査二次被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護2_判定変更者数(new RString(要介護2計 - 要介護2要介護2被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護2_軽度変更者数(new RString(要介護2非該当被保険者数
                + 要介護2要支援1被保険者数 + 要介護2要支援2被保険者数 + 要介護2要介護1被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護2_重度変更者数(new RString(要介護2要介護3被保険者数
                + 要介護2要介護4被保険者数 + 要介護2要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護2_判定変更割合(要介護2計 == 要介護2要介護2被保険者数
                ? なし : new RString(String.valueOf((要介護2計 - 要介護2要介護2被保険者数) / 要介護2計 * 割合)));
    }

    private void set一次判定要介護3(List<SinsakaiHanteiJyokyoEntity> 審査判定状況) {
        int 要介護3非該当被保険者数 = get被保険者数(審査判定状況, 要介護3, 非該当);
        int 要介護3要支援1被保険者数 = get被保険者数(審査判定状況, 要介護3, 要支援1);
        int 要介護3要支援2被保険者数 = get被保険者数(審査判定状況, 要介護3, 要支援2);
        int 要介護3要介護1被保険者数 = get被保険者数(審査判定状況, 要介護3, 要介護1);
        int 要介護3要介護2被保険者数 = get被保険者数(審査判定状況, 要介護3, 要介護2);
        int 要介護3要介護3被保険者数 = get被保険者数(審査判定状況, 要介護3, 要介護3);
        int 要介護3要介護4被保険者数 = get被保険者数(審査判定状況, 要介護3, 要介護4);
        int 要介護3要介護5被保険者数 = get被保険者数(審査判定状況, 要介護3, 要介護5);
        int 要介護3計 = 要介護3非該当被保険者数 + 要介護3要支援1被保険者数 + 要介護3要支援2被保険者数 + 要介護3要介護1被保険者数
                + 要介護3要介護2被保険者数 + 要介護3要介護3被保険者数 + 要介護3要介護4被保険者数 + 要介護3要介護5被保険者数;
        int 要介護3再調査二次被保険者数 = get被保険者数(審査判定状況, 要介護3, 再調査);
        jotaikubumbetsuhantei.set一次判定要介護3タイトル(要介護3タイトル);
        jotaikubumbetsuhantei.set一次判定要介護3_二次判定非該当(new RString(要介護3非該当被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護3_二次判定要支援1(new RString(要介護3要支援1被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護3_二次判定要支援2(new RString(要介護3要支援2被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護3_二次判定要介護1(new RString(要介護3要介護1被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護3_二次判定要介護2(new RString(要介護3要介護2被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護3_二次判定要介護3(new RString(要介護3要介護3被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護3_二次判定要介護4(new RString(要介護3要介護4被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護3_二次判定要介護5(new RString(要介護3要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護3_計(new RString(要介護3計));
        jotaikubumbetsuhantei.set一次判定要介護3_再調査二次保留分(new RString(要介護3再調査二次被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護3_判定変更者数(new RString(要介護3計 - 要介護3要介護3被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護3_軽度変更者数(new RString(要介護3非該当被保険者数
                + 要介護3要支援1被保険者数 + 要介護3要支援2被保険者数 + 要介護3要介護1被保険者数 + 要介護3要介護2被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護3_重度変更者数(new RString(要介護3要介護4被保険者数 + 要介護3要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護3_判定変更割合(要介護3計 == 要介護3要介護3被保険者数
                ? なし : new RString(String.valueOf((要介護3計 - 要介護3要介護3被保険者数) / 要介護3計 * 割合)));
    }

    private void set一次判定要介護4(List<SinsakaiHanteiJyokyoEntity> 審査判定状況) {
        int 要介護4非該当被保険者数 = get被保険者数(審査判定状況, 要介護4, 非該当);
        int 要介護4要支援1被保険者数 = get被保険者数(審査判定状況, 要介護4, 要支援1);
        int 要介護4要支援2被保険者数 = get被保険者数(審査判定状況, 要介護4, 要支援2);
        int 要介護4要介護1被保険者数 = get被保険者数(審査判定状況, 要介護4, 要介護1);
        int 要介護4要介護2被保険者数 = get被保険者数(審査判定状況, 要介護4, 要介護2);
        int 要介護4要介護3被保険者数 = get被保険者数(審査判定状況, 要介護4, 要介護3);
        int 要介護4要介護4被保険者数 = get被保険者数(審査判定状況, 要介護4, 要介護4);
        int 要介護4要介護5被保険者数 = get被保険者数(審査判定状況, 要介護4, 要介護5);
        int 要介護4計 = 要介護4非該当被保険者数 + 要介護4要支援1被保険者数 + 要介護4要支援2被保険者数 + 要介護4要介護1被保険者数
                + 要介護4要介護2被保険者数 + 要介護4要介護3被保険者数 + 要介護4要介護4被保険者数 + 要介護4要介護5被保険者数;
        int 要介護4再調査二次被保険者数 = get被保険者数(審査判定状況, 要介護4, 再調査);
        jotaikubumbetsuhantei.set一次判定要介護4タイトル(要介護4タイトル);
        jotaikubumbetsuhantei.set一次判定要介護4_二次判定非該当(new RString(要介護4非該当被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護4_二次判定要支援1(new RString(要介護4要支援1被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護4_二次判定要支援2(new RString(要介護4要支援2被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護4_二次判定要介護1(new RString(要介護4要介護1被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護4_二次判定要介護2(new RString(要介護4要介護2被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護4_二次判定要介護3(new RString(要介護4要介護3被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護4_二次判定要介護4(new RString(要介護4要介護4被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護4_二次判定要介護5(new RString(要介護4要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護4_計(new RString(要介護4計));
        jotaikubumbetsuhantei.set一次判定要介護4_再調査二次保留分(new RString(要介護4再調査二次被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護4_判定変更者数(new RString(要介護4計 - 要介護4要介護4被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護4_軽度変更者数(new RString(要介護4計 - 要介護4要介護4被保険者数 - 要介護4要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護4_重度変更者数(new RString(要介護4要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護4_判定変更割合(要介護4計 == 要介護4要介護4被保険者数
                ? なし : new RString(String.valueOf((要介護4計 - 要介護4要介護4被保険者数) / 要介護4計 * 割合)));
    }

    private void set一次判定要介護5(List<SinsakaiHanteiJyokyoEntity> 審査判定状況) {
        int 要介護5非該当被保険者数 = get被保険者数(審査判定状況, 要介護5, 非該当);
        int 要介護5要支援1被保険者数 = get被保険者数(審査判定状況, 要介護5, 要支援1);
        int 要介護5要支援2被保険者数 = get被保険者数(審査判定状況, 要介護5, 要支援2);
        int 要介護5要介護1被保険者数 = get被保険者数(審査判定状況, 要介護5, 要介護1);
        int 要介護5要介護2被保険者数 = get被保険者数(審査判定状況, 要介護5, 要介護2);
        int 要介護5要介護3被保険者数 = get被保険者数(審査判定状況, 要介護5, 要介護3);
        int 要介護5要介護4被保険者数 = get被保険者数(審査判定状況, 要介護5, 要介護4);
        int 要介護5要介護5被保険者数 = get被保険者数(審査判定状況, 要介護5, 要介護5);
        int 要介護5計 = 要介護5非該当被保険者数 + 要介護5要支援1被保険者数 + 要介護5要支援2被保険者数 + 要介護5要介護1被保険者数
                + 要介護5要介護2被保険者数 + 要介護5要介護3被保険者数 + 要介護5要介護4被保険者数 + 要介護5要介護5被保険者数;
        int 要介護5再調査二次被保険者数 = get被保険者数(審査判定状況, 要介護5, 再調査);
        jotaikubumbetsuhantei.set一次判定要介護5タイトル(要介護5タイトル);
        jotaikubumbetsuhantei.set一次判定要介護5_二次判定非該当(new RString(要介護5非該当被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護5_二次判定要支援1(new RString(要介護5要支援1被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護5_二次判定要支援2(new RString(要介護5要支援2被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護5_二次判定要介護1(new RString(要介護5要介護1被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護5_二次判定要介護2(new RString(要介護5要介護2被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護5_二次判定要介護3(new RString(要介護5要介護3被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護5_二次判定要介護4(new RString(要介護5要介護4被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護5_二次判定要介護5(new RString(要介護5要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護5_計(new RString(要介護5計));
        jotaikubumbetsuhantei.set一次判定要介護5_再調査二次保留分(new RString(要介護5再調査二次被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護5_判定変更者数(new RString(要介護5計 - 要介護5要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護5_軽度変更者数(new RString(要介護5計 - 要介護5要介護5被保険者数));
        jotaikubumbetsuhantei.set一次判定要介護5_重度変更者数(なし);
        jotaikubumbetsuhantei.set一次判定要介護5_判定変更割合(要介護5計 == 要介護5要介護5被保険者数
                ? なし : new RString(String.valueOf((要介護5計 - 要介護5要介護5被保険者数) / 要介護5計 * 割合)));
    }

    private void set計() {
        jotaikubumbetsuhantei.set計タイトル(計タイトル);
        jotaikubumbetsuhantei.set計_二次判定非該当(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定非該当().toString())));
        jotaikubumbetsuhantei.set計_二次判定要支援1(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定要支援1().toString())));
        jotaikubumbetsuhantei.set計_二次判定要支援2(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定要支援2().toString())));
        jotaikubumbetsuhantei.set計_二次判定要介護1(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定要介護1().toString())));
        jotaikubumbetsuhantei.set計_二次判定要介護2(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定要介護2().toString())));
        jotaikubumbetsuhantei.set計_二次判定要介護3(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定要介護3().toString())));
        jotaikubumbetsuhantei.set計_二次判定要介護4(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定要介護4().toString())));
        jotaikubumbetsuhantei.set計_二次判定要介護5(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要介護5().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定要介護5().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定要介護5().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定要介護5().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定要介護5().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定要介護5().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定要介護5().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定要介護5().toString())));
        jotaikubumbetsuhantei.set計_計(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_計().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_計().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_計().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_計().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_計().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_計().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_計().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_計().toString())));
        jotaikubumbetsuhantei.set計_再調査二次保留分(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_再調査二次保留分().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_再調査二次保留分().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_再調査二次保留分().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_再調査二次保留分().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_再調査二次保留分().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_再調査二次保留分().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_再調査二次保留分().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_再調査二次保留分().toString())));
        jotaikubumbetsuhantei.set計_判定変更者数(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_判定変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_判定変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_判定変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_判定変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_判定変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_判定変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_判定変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_判定変更者数().toString())));
        jotaikubumbetsuhantei.set計_軽度変更者数(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_軽度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_軽度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_軽度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_軽度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_軽度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_軽度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_軽度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_軽度変更者数().toString())));
        jotaikubumbetsuhantei.set計_重度変更者数(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_重度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_重度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_重度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_重度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_重度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_重度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_重度変更者数().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_重度変更者数().toString())));
        jotaikubumbetsuhantei.set計_判定変更割合(なし.equals(jotaikubumbetsuhantei.get計_計()) ? なし : new RString(String.valueOf(
                Integer.parseInt(jotaikubumbetsuhantei.get計_判定変更者数().toString())
                / Integer.parseInt(jotaikubumbetsuhantei.get計_計().toString()) * 割合)));
    }

    private void set変更者() {
        jotaikubumbetsuhantei.set変更者タイトル(変更者タイトル);
        jotaikubumbetsuhantei.set変更者_二次判定非該当(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定非該当().toString())));
        jotaikubumbetsuhantei.set変更者_二次判定要支援1(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定要支援1().toString())));
        jotaikubumbetsuhantei.set変更者_二次判定要支援2(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定要支援2().toString())));
        jotaikubumbetsuhantei.set変更者_二次判定要介護1(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定要介護1().toString())));
        jotaikubumbetsuhantei.set変更者_二次判定要介護2(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定要介護2().toString())));
        jotaikubumbetsuhantei.set変更者_二次判定要介護3(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定要介護3().toString())));
        jotaikubumbetsuhantei.set変更者_二次判定要介護4(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護5_二次判定要介護4().toString())));
        jotaikubumbetsuhantei.set変更者_二次判定要介護5(new RString(Integer.parseInt(jotaikubumbetsuhantei.get一次判定非該当_二次判定要介護5().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援1_二次判定要介護5().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要支援2_二次判定要介護5().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護1_二次判定要介護5().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護2_二次判定要介護5().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護3_二次判定要介護5().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get一次判定要介護4_二次判定要介護5().toString())));
        jotaikubumbetsuhantei.set変更者_計(new RString(Integer.parseInt(jotaikubumbetsuhantei.get変更者_二次判定非該当().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get変更者_二次判定要支援1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get変更者_二次判定要支援2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get変更者_二次判定要介護1().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get変更者_二次判定要介護2().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get変更者_二次判定要介護3().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get変更者_二次判定要介護4().toString())
                + Integer.parseInt(jotaikubumbetsuhantei.get変更者_二次判定要介護5().toString())));
        jotaikubumbetsuhantei.set変更者_再調査二次保留分(RString.EMPTY);
        jotaikubumbetsuhantei.set変更者_判定変更者数(RString.EMPTY);
        jotaikubumbetsuhantei.set変更者_軽度変更者数(RString.EMPTY);
        jotaikubumbetsuhantei.set変更者_重度変更者数(RString.EMPTY);
        jotaikubumbetsuhantei.set変更者_判定変更割合(RString.EMPTY);
    }

    private void set割合() {
        jotaikubumbetsuhantei.set割合タイトル(割合タイトル);
        int 計_計 = Integer.parseInt(jotaikubumbetsuhantei.get計_計().toString());
        if (0 != 計_計) {
            jotaikubumbetsuhantei.set割合_二次判定非該当(new RString(String.valueOf(
                    Integer.parseInt(jotaikubumbetsuhantei.get計_二次判定非該当().toString()) / 計_計 * 割合) + パーセント));
            jotaikubumbetsuhantei.set割合_二次判定要支援1(new RString(String.valueOf(
                    Integer.parseInt(jotaikubumbetsuhantei.get計_二次判定要支援1().toString()) / 計_計 * 割合) + パーセント));
            jotaikubumbetsuhantei.set割合_二次判定要支援2(new RString(String.valueOf(
                    Integer.parseInt(jotaikubumbetsuhantei.get計_二次判定要支援2().toString()) / 計_計 * 割合) + パーセント));
            jotaikubumbetsuhantei.set割合_二次判定要介護1(new RString(String.valueOf(
                    Integer.parseInt(jotaikubumbetsuhantei.get計_二次判定要介護1().toString()) / 計_計 * 割合) + パーセント));
            jotaikubumbetsuhantei.set割合_二次判定要介護2(new RString(String.valueOf(
                    Integer.parseInt(jotaikubumbetsuhantei.get計_二次判定要介護2().toString()) / 計_計 * 割合) + パーセント));
            jotaikubumbetsuhantei.set割合_二次判定要介護3(new RString(String.valueOf(
                    Integer.parseInt(jotaikubumbetsuhantei.get計_二次判定要介護3().toString()) / 計_計 * 割合) + パーセント));
            jotaikubumbetsuhantei.set割合_二次判定要介護4(new RString(String.valueOf(
                    Integer.parseInt(jotaikubumbetsuhantei.get計_二次判定要介護4().toString()) / 計_計 * 割合) + パーセント));
            jotaikubumbetsuhantei.set割合_二次判定要介護5(new RString(String.valueOf(
                    Integer.parseInt(jotaikubumbetsuhantei.get計_二次判定要介護5().toString()) / 計_計 * 割合) + パーセント));
        } else {
            jotaikubumbetsuhantei.set割合_二次判定非該当(なし);
            jotaikubumbetsuhantei.set割合_二次判定要支援1(なし);
            jotaikubumbetsuhantei.set割合_二次判定要支援2(なし);
            jotaikubumbetsuhantei.set割合_二次判定要介護1(なし);
            jotaikubumbetsuhantei.set割合_二次判定要介護2(なし);
            jotaikubumbetsuhantei.set割合_二次判定要介護3(なし);
            jotaikubumbetsuhantei.set割合_二次判定要介護4(なし);
            jotaikubumbetsuhantei.set割合_二次判定要介護5(なし);
        }
        jotaikubumbetsuhantei.set割合_計(割合計);
        jotaikubumbetsuhantei.set割合_再調査二次保留分(RString.EMPTY);
        jotaikubumbetsuhantei.set割合_判定変更者数(RString.EMPTY);
        jotaikubumbetsuhantei.set割合_軽度変更者数(RString.EMPTY);
        jotaikubumbetsuhantei.set割合_重度変更者数(RString.EMPTY);
        jotaikubumbetsuhantei.set割合_判定変更割合(RString.EMPTY);
    }

    private int get被保険者数(List<SinsakaiHanteiJyokyoEntity> 審査判定状況,
            RString 要介護認定一次判定結果コード,
            RString 二次判定要介護状態区分コード) {
        for (SinsakaiHanteiJyokyoEntity sinsakaiHanteiJyokyoEntity : 審査判定状況) {
            if (sinsakaiHanteiJyokyoEntity.getIchijiHanteiKekkaCode().value().equals(要介護認定一次判定結果コード)
                    && sinsakaiHanteiJyokyoEntity.getNijiHanteiYokaigoJotaiKubunCode().value().equals(二次判定要介護状態区分コード)) {
                return sinsakaiHanteiJyokyoEntity.getHihokenshaCount();
            }
        }
        return 0;
    }
}
