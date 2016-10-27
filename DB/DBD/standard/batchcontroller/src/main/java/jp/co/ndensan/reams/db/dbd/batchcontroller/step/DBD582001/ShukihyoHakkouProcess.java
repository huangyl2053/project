/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.batchcontroller.step.DBD582001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbd.business.report.dbd300004.YokaigoNinteiTsukibetsuJukyushaSuJokyohyoReport;
import jp.co.ndensan.reams.db.dbd.definition.processprm.dbd582001.DBD582001ProcessParameter;
import jp.co.ndensan.reams.db.dbd.definition.reportid.ReportIdDBD;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.dbd582001.JukyushaSuJokyohyoEntity;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.dbd582001.JukyushaSuJokyohyoRisutoEntity;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.dbd582001.YokaigoNinteiTsukibetsuJukyushaSuJokyohyoEntity;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.yokaigoninteijisshijokyohyo.YokaigoNinteiJisshiJokyohyoEntity;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.yokaigoninteijisshijokyohyo.YokaigoNinteiJisshiJokyohyoReportEntity;
import jp.co.ndensan.reams.db.dbd.entity.report.dbd300004.YokaigoNinteiTsukibetsuJukyushaSuJokyohyoReportSource;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.ShikibetsuTaishoPSMSearchKeyBuilder;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.shikibetsutaisho.KensakuYusenKubun;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.report.outputjokenhyo.ReportOutputJokenhyoItem;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.OutputJokenhyoFactory;
import jp.co.ndensan.reams.uz.uza.batch.batchexecutor.util.JobContextHolder;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchKeyBreakBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.BreakerCatalog;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 要介護認定月別受給者数状況表（統計表）の発行_process処理クラスです。
 *
 * @reamsid_L DBD-1771-020 chenxin
 */
public class ShukihyoHakkouProcess extends BatchKeyBreakBase<YokaigoNinteiTsukibetsuJukyushaSuJokyohyoEntity> {

    private static final ReportId REPORT_DBD300004 = ReportIdDBD.DBD300004.getReportId();
    private static final RString MYBATIS_SELECT_ID
            = new RString("jp.co.ndensan.reams.db.dbd.persistence.db.mapper.relate.yokaigoninteitsukibetsujukyushasujokyohyo."
                    + "IYokaigoNinteiTsukibetsuJukyushaSuJokyohyoMapper.get印刷対象");
    private static final List<RString> PAGE_BREAK_KEYS = Collections.unmodifiableList(Arrays.asList(
            new RString(YokaigoNinteiTsukibetsuJukyushaSuJokyohyoReportSource.ReportSourceFields.hokenshaNo.name())));
    @BatchWriter
    private BatchReportWriter<YokaigoNinteiTsukibetsuJukyushaSuJokyohyoReportSource> batchReportWriter;
    private ReportSourceWriter<YokaigoNinteiTsukibetsuJukyushaSuJokyohyoReportSource> reportSourceWriter;
    private DBD582001ProcessParameter parameter;
    private JukyushaSuJokyohyoEntity 受給状況Entity;
    private JukyushaSuJokyohyoRisutoEntity 受給状況リストEntity;
    private YokaigoNinteiJisshiJokyohyoEntity jisshiJokyohyoEntity;
    private YokaigoNinteiJisshiJokyohyoReportEntity jisshiJokyohyoReportEntity;
    private YokaigoNinteiTsukibetsuJukyushaSuJokyohyoEntity beforeEntity = null;
    private LasdecCode beforeCode = LasdecCode.EMPTY;
    private static final RString 集計項目認定件数 = new RString("認定件数　（旧措置）");
    private static final RString 集計項目要介護度1 = new RString("要介護度１（旧措置）");
    private static final RString 集計項目要介護度2 = new RString("要介護度２（旧措置）");
    private static final RString 集計項目要介護度3 = new RString("要介護度３（旧措置）");
    private static final RString 集計項目要介護度4 = new RString("要介護度４（旧措置）");
    private static final RString 集計項目要介護度5 = new RString("要介護度５（旧措置）");
    private static final RString 集計項目要支援1 = new RString("要支援１  （旧措置）");
    private static final RString 集計項目要支援2 = new RString("要支援２  （旧措置）");
    private static final RString 集計項目経過介護 = new RString("経過介護　（旧措置）");
    private static final RString 集計項目自立 = new RString("自立      （旧措置）");
    private static final RString 集計項目新規 = new RString("新規　  （旧措置）");
    private static final RString 集計項目要支援 = new RString("（要支援）（旧措置）");
    private static final RString 集計項目更新 = new RString("更新　  （旧措置）");
    private static final RString 集計項目区分変更 = new RString("区分変更　（旧措置）");
    private static final RString 集計項目転入 = new RString("転入　  （旧措置）");
    private static final RString 集計項目職権他 = new RString("職権他　　（旧措置）");
    private static final RString 地区区分全て = new RString("ALL");
    private static final RString 地区全て = new RString("全て");
    private static final RString 集計単位受給申請 = new RString("ZIYU");
    private static final RString 集計単位申請時 = new RString("SHINSEIZI");
    private static final RString 集計単位法令 = new RString("HOUREI");
    private static final RString 受給申請事由 = new RString("受給申請事由");
    private static final RString 申請区分申請時 = new RString("申請区分(申請時)");
    private static final RString 申請区分法令 = new RString("申請区分(法令)");
    private static final int INDEX_3 = 3;
    private static final int INDEX_4 = 4;
    private static final int INDEX_5 = 5;
    private static final int INDEX_6 = 6;
    private static final int INDEX_7 = 7;
    private static final int INDEX_8 = 8;
    private static final int INDEX_9 = 9;
    private static final int INDEX_10 = 10;
    private static final RString 月別04 = new RString("004");
    private static final RString 月別05 = new RString("005");
    private static final RString 月別06 = new RString("006");
    private static final RString 月別07 = new RString("007");
    private static final RString 月別08 = new RString("008");
    private static final RString 月別09 = new RString("009");
    private static final RString 月別10 = new RString("010");
    private static final RString 月別11 = new RString("011");
    private static final RString 月別12 = new RString("012");
    private static final RString 月別01 = new RString("101");
    private static final RString 月別02 = new RString("102");
    private static final RString 月別03 = new RString("103");

    @Override
    protected void initialize() {
        受給状況リスト初期化();
        受給状況リストEntity = new JukyushaSuJokyohyoRisutoEntity();
        受給状況リストEntity.set受給状況リスト(new ArrayList<YokaigoNinteiJisshiJokyohyoReportEntity>());
        parameter.setKey(new ShikibetsuTaishoPSMSearchKeyBuilder(GyomuCode.DB介護保険, KensakuYusenKubun.住登外優先).build());
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MYBATIS_SELECT_ID, parameter.toYokaigoNinteiTsukibetsuJukyushaMybatisParameter());
    }

    @Override
    protected void createWriter() {
        batchReportWriter = BatchReportFactory.createBatchReportWriter(REPORT_DBD300004.value())
                .addBreak(new BreakerCatalog<YokaigoNinteiTsukibetsuJukyushaSuJokyohyoReportSource>().simplePageBreaker(PAGE_BREAK_KEYS))
                .create();
        reportSourceWriter = new ReportSourceWriter(batchReportWriter);
    }

    @Override
    protected void keyBreakProcess(YokaigoNinteiTsukibetsuJukyushaSuJokyohyoEntity current) {

    }

    @Override
    protected void usualProcess(YokaigoNinteiTsukibetsuJukyushaSuJokyohyoEntity jukyushaSuJokyohyoEntity) {
        if (!beforeCode.isEmpty() && !jukyushaSuJokyohyoEntity.get市町村コード().equals(beforeCode)) {
            受給状況リストEntity作成();
            受給状況リスト初期化();
        }
        受給状況Entity作成(受給状況Entity.get受給状況リスト1().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get件数().intValue());
        受給状況Entity作成(受給状況Entity.get受給状況リスト2().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get件数旧措置().intValue());
        受給状況Entity作成(受給状況Entity.get受給状況リスト3().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get新規().intValue());
        受給状況Entity作成(受給状況Entity.get受給状況リスト4().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get新規旧措置().intValue());
        受給状況Entity作成(受給状況Entity.get受給状況リスト5().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get要支援().intValue());
        受給状況Entity作成(受給状況Entity.get受給状況リスト6().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get要支援旧措置().intValue());
        受給状況Entity作成(受給状況Entity.get受給状況リスト7().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get更新().intValue());
        受給状況Entity作成(受給状況Entity.get受給状況リスト8().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get更新旧措置().intValue());
        受給状況Entity作成(受給状況Entity.get受給状況リスト9().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get区分変更().intValue());
        受給状況Entity作成(受給状況Entity.get受給状況リスト10().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get区分変更旧措置().intValue());
        受給状況Entity作成(受給状況Entity.get受給状況リスト11().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get転入().intValue());
        受給状況Entity作成(受給状況Entity.get受給状況リスト12().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get転入旧措置().intValue());
        受給状況Entity作成(受給状況Entity.get受給状況リスト13().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get職権他().intValue());
        受給状況Entity作成(受給状況Entity.get受給状況リスト14().get(rstringToInt(jukyushaSuJokyohyoEntity.get取得条件().substring(0, 2))),
                jukyushaSuJokyohyoEntity, jukyushaSuJokyohyoEntity.get職権他旧措置().intValue());
        beforeCode = jukyushaSuJokyohyoEntity.get市町村コード();
        beforeEntity = jukyushaSuJokyohyoEntity;
    }

    private void 受給状況Entity作成(YokaigoNinteiJisshiJokyohyoEntity jisshiJokyohyoEntity,
            YokaigoNinteiTsukibetsuJukyushaSuJokyohyoEntity jukyushaSuJokyohyoEntity,
            int 件数) {
        if (jukyushaSuJokyohyoEntity.get取得条件().substring(2).equals(月別04)) {
            jisshiJokyohyoEntity.set四月の合計(件数);
        } else if (jukyushaSuJokyohyoEntity.get取得条件().substring(2).equals(月別05)) {
            jisshiJokyohyoEntity.set五月の合計(件数);
        } else if (jukyushaSuJokyohyoEntity.get取得条件().substring(2).equals(月別06)) {
            jisshiJokyohyoEntity.set六月の合計(件数);
        } else if (jukyushaSuJokyohyoEntity.get取得条件().substring(2).equals(月別07)) {
            jisshiJokyohyoEntity.set七月の合計(件数);
        } else if (jukyushaSuJokyohyoEntity.get取得条件().substring(2).equals(月別08)) {
            jisshiJokyohyoEntity.set八月の合計(件数);
        } else if (jukyushaSuJokyohyoEntity.get取得条件().substring(2).equals(月別09)) {
            jisshiJokyohyoEntity.set九月の合計(件数);
        } else if (jukyushaSuJokyohyoEntity.get取得条件().substring(2).equals(月別10)) {
            jisshiJokyohyoEntity.set十月の合計(件数);
        } else if (jukyushaSuJokyohyoEntity.get取得条件().substring(2).equals(月別11)) {
            jisshiJokyohyoEntity.set十一月の合計(件数);
        } else if (jukyushaSuJokyohyoEntity.get取得条件().substring(2).equals(月別12)) {
            jisshiJokyohyoEntity.set十二月の合計(件数);
        } else if (jukyushaSuJokyohyoEntity.get取得条件().substring(2).equals(月別01)) {
            jisshiJokyohyoEntity.set一月の合計(件数);
        } else if (jukyushaSuJokyohyoEntity.get取得条件().substring(2).equals(月別02)) {
            jisshiJokyohyoEntity.set二月の合計(件数);
        } else if (jukyushaSuJokyohyoEntity.get取得条件().substring(2).equals(月別03)) {
            jisshiJokyohyoEntity.set三月の合計(件数);
        }

    }

    private int rstringToInt(RString rstring) {
        return Integer.parseInt(rstring.toString()) - 1;
    }

    private void 受給状況リスト初期化() {
        受給状況Entity = new JukyushaSuJokyohyoEntity();
        受給状況Entity.set受給状況リスト1(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト2(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト3(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト4(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト5(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト6(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト7(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト8(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト9(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト10(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト11(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト12(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト13(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト14(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト15(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        受給状況Entity.set受給状況リスト16(new ArrayList<YokaigoNinteiJisshiJokyohyoEntity>());
        for (int index = 0; index < INDEX_10; index++) {
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト1().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト2().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト3().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト4().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト5().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト6().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト7().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト8().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト9().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト10().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト11().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト12().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト13().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト14().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト15().add(jisshiJokyohyoEntity);
            jisshiJokyohyoEntity = new YokaigoNinteiJisshiJokyohyoEntity();
            受給状況Entity.get受給状況リスト16().add(jisshiJokyohyoEntity);
        }
    }

    private void 受給状況リストEntity作成() {
        for (int index = 0; index < INDEX_10; index++) {
            受給状況Entity.get受給状況リスト1().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト1().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト2().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト2().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト3().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト3().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト4().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト4().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト5().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト5().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト6().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト6().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト7().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト7().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト8().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト8().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト9().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト9().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト10().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト10().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト11().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト11().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト12().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト12().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト13().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト13().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト14().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト14().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト15().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト15().get(index).set市町村名(beforeEntity.get市町村名称());
            受給状況Entity.get受給状況リスト16().get(index).set市町村番号(beforeEntity.get市町村コード().value());
            受給状況Entity.get受給状況リスト16().get(index).set市町村名(beforeEntity.get市町村名称());
        }
        for (int index = 0; index < INDEX_10; index++) {
            jisshiJokyohyoReportEntity = new YokaigoNinteiJisshiJokyohyoReportEntity();
            jisshiJokyohyoReportEntity.set集計項目(集計項目設定(index));
            帳票リスト作成(受給状況Entity.get受給状況リスト1().get(index), 受給状況Entity.get受給状況リスト2().get(index));

            jisshiJokyohyoReportEntity = new YokaigoNinteiJisshiJokyohyoReportEntity();
            jisshiJokyohyoReportEntity.set集計項目(集計項目新規);
            帳票リスト作成(受給状況Entity.get受給状況リスト3().get(index), 受給状況Entity.get受給状況リスト4().get(index));

            jisshiJokyohyoReportEntity = new YokaigoNinteiJisshiJokyohyoReportEntity();
            jisshiJokyohyoReportEntity.set集計項目(集計項目要支援);
            帳票リスト作成(受給状況Entity.get受給状況リスト5().get(index), 受給状況Entity.get受給状況リスト6().get(index));

            jisshiJokyohyoReportEntity = new YokaigoNinteiJisshiJokyohyoReportEntity();
            jisshiJokyohyoReportEntity.set集計項目(集計項目更新);
            帳票リスト作成(受給状況Entity.get受給状況リスト7().get(index), 受給状況Entity.get受給状況リスト8().get(index));

            jisshiJokyohyoReportEntity = new YokaigoNinteiJisshiJokyohyoReportEntity();
            jisshiJokyohyoReportEntity.set集計項目(集計項目区分変更);
            帳票リスト作成(受給状況Entity.get受給状況リスト9().get(index), 受給状況Entity.get受給状況リスト10().get(index));

            jisshiJokyohyoReportEntity = new YokaigoNinteiJisshiJokyohyoReportEntity();
            jisshiJokyohyoReportEntity.set集計項目(集計項目転入);
            帳票リスト作成(受給状況Entity.get受給状況リスト11().get(index), 受給状況Entity.get受給状況リスト12().get(index));

            jisshiJokyohyoReportEntity = new YokaigoNinteiJisshiJokyohyoReportEntity();
            jisshiJokyohyoReportEntity.set集計項目(集計項目職権他);
            帳票リスト作成(受給状況Entity.get受給状況リスト13().get(index), 受給状況Entity.get受給状況リスト14().get(index));

            jisshiJokyohyoReportEntity = new YokaigoNinteiJisshiJokyohyoReportEntity();
            jisshiJokyohyoReportEntity.set集計項目(null);
            jisshiJokyohyoReportEntity.set市町村番号(jisshiJokyohyoEntity.get市町村番号());
            jisshiJokyohyoReportEntity.set市町村名(jisshiJokyohyoEntity.get市町村名());
            受給状況リストEntity.get受給状況リスト().add(jisshiJokyohyoReportEntity);
        }
    }

    private RString 集計項目設定(int index) {
        switch (index) {
            case 0:
                return 集計項目認定件数;
            case 1:
                return 集計項目要介護度1;
            case 2:
                return 集計項目要介護度2;
            case INDEX_3:
                return 集計項目要介護度3;
            case INDEX_4:
                return 集計項目要介護度4;
            case INDEX_5:
                return 集計項目要介護度5;
            case INDEX_6:
                return 集計項目要支援1;
            case INDEX_7:
                return 集計項目要支援2;
            case INDEX_8:
                return 集計項目経過介護;
            case INDEX_9:
                return 集計項目自立;
            default:
                break;
        }
        return RString.EMPTY;
    }

    private void 帳票リスト作成(YokaigoNinteiJisshiJokyohyoEntity jisshiJokyohyoEntity,
            YokaigoNinteiJisshiJokyohyoEntity jisshiJokyohyoEntity2) {
        jisshiJokyohyoReportEntity.set市町村番号(jisshiJokyohyoEntity.get市町村番号());
        jisshiJokyohyoReportEntity.set市町村名(jisshiJokyohyoEntity.get市町村名());
        jisshiJokyohyoReportEntity.set四月の合計(new RString(jisshiJokyohyoEntity.get四月の合計())
                .concat("(").concat(new RString(jisshiJokyohyoEntity2.get四月の合計())).concat(")"));
        jisshiJokyohyoReportEntity.set五月の合計(new RString(jisshiJokyohyoEntity.get五月の合計())
                .concat("(").concat(new RString(jisshiJokyohyoEntity2.get五月の合計())).concat(")"));
        jisshiJokyohyoReportEntity.set六月の合計(new RString(jisshiJokyohyoEntity.get六月の合計())
                .concat("(").concat(new RString(jisshiJokyohyoEntity2.get六月の合計())).concat(")"));
        jisshiJokyohyoReportEntity.set七月の合計(new RString(jisshiJokyohyoEntity.get七月の合計())
                .concat("(").concat(new RString(jisshiJokyohyoEntity2.get七月の合計())).concat(")"));
        jisshiJokyohyoReportEntity.set八月の合計(new RString(jisshiJokyohyoEntity.get八月の合計())
                .concat("(").concat(new RString(jisshiJokyohyoEntity2.get八月の合計())).concat(")"));
        jisshiJokyohyoReportEntity.set九月の合計(new RString(jisshiJokyohyoEntity.get九月の合計())
                .concat("(").concat(new RString(jisshiJokyohyoEntity2.get九月の合計())).concat(")"));
        jisshiJokyohyoReportEntity.set十月の合計(new RString(jisshiJokyohyoEntity.get十月の合計())
                .concat("(").concat(new RString(jisshiJokyohyoEntity2.get十月の合計())).concat(")"));
        jisshiJokyohyoReportEntity.set十一月の合計(new RString(jisshiJokyohyoEntity.get十一月の合計())
                .concat("(").concat(new RString(jisshiJokyohyoEntity2.get十一月の合計())).concat(")"));
        jisshiJokyohyoReportEntity.set十二月の合計(new RString(jisshiJokyohyoEntity.get十二月の合計())
                .concat("(").concat(new RString(jisshiJokyohyoEntity2.get十二月の合計())).concat(")"));
        jisshiJokyohyoReportEntity.set一月の合計(new RString(jisshiJokyohyoEntity.get一月の合計())
                .concat("(").concat(new RString(jisshiJokyohyoEntity2.get一月の合計())).concat(")"));
        jisshiJokyohyoReportEntity.set二月の合計(new RString(jisshiJokyohyoEntity.get二月の合計())
                .concat("(").concat(new RString(jisshiJokyohyoEntity2.get二月の合計())).concat(")"));
        jisshiJokyohyoReportEntity.set三月の合計(new RString(jisshiJokyohyoEntity.get三月の合計())
                .concat("(").concat(new RString(jisshiJokyohyoEntity2.get三月の合計())).concat(")"));
        jisshiJokyohyoReportEntity.set年度合計(new RString(
                jisshiJokyohyoEntity.get一月の合計() + jisshiJokyohyoEntity.get二月の合計()
                + jisshiJokyohyoEntity.get三月の合計() + jisshiJokyohyoEntity.get四月の合計()
                + jisshiJokyohyoEntity.get五月の合計() + jisshiJokyohyoEntity.get六月の合計()
                + jisshiJokyohyoEntity.get七月の合計() + jisshiJokyohyoEntity.get八月の合計()
                + jisshiJokyohyoEntity.get九月の合計() + jisshiJokyohyoEntity.get十月の合計()
                + jisshiJokyohyoEntity.get十一月の合計() + jisshiJokyohyoEntity.get十二月の合計())
                .concat("(").concat(new RString(
                jisshiJokyohyoEntity2.get一月の合計() + jisshiJokyohyoEntity2.get二月の合計()
                + jisshiJokyohyoEntity2.get三月の合計() + jisshiJokyohyoEntity2.get四月の合計()
                + jisshiJokyohyoEntity2.get五月の合計() + jisshiJokyohyoEntity2.get六月の合計()
                + jisshiJokyohyoEntity2.get七月の合計() + jisshiJokyohyoEntity2.get八月の合計()
                + jisshiJokyohyoEntity2.get九月の合計() + jisshiJokyohyoEntity2.get十月の合計()
                + jisshiJokyohyoEntity2.get十一月の合計() + jisshiJokyohyoEntity2.get十二月の合計()))
                .concat(")"));
        受給状況リストEntity.get受給状況リスト().add(jisshiJokyohyoReportEntity);
    }

    @Override
    protected void afterExecute() {
        if (beforeEntity != null) {
            受給状況リストEntity作成();
        }
        FlexibleDate 基準日 = parameter.get基準年月日04();
        RString 年齢 = new RString(parameter.get年齢From())
                .concat("～")
                .concat(new RString(parameter.get年齢To()));
        RString 地区;
        RString 集計単位 = RString.EMPTY;
        if (parameter.get地区区分().equals(地区区分全て)) {
            地区 = 地区全て;

        } else {
            地区 = new RString(parameter.get開始地区コード().toString())
                    .concat("～")
                    .concat(new RString(parameter.get終了地区コード().toString()));
        }
        if (parameter.get集計単位().equals(集計単位受給申請)) {
            集計単位 = 受給申請事由;
        } else if (parameter.get集計単位().equals(集計単位申請時)) {
            集計単位 = 申請区分申請時;

        } else if (parameter.get集計単位().equals(集計単位法令)) {
            集計単位 = 申請区分法令;
        }

        YokaigoNinteiTsukibetsuJukyushaSuJokyohyoReport report = YokaigoNinteiTsukibetsuJukyushaSuJokyohyoReport.createReport(
                基準日,
                年齢,
                地区,
                集計単位,
                parameter.get対象年度(),
                受給状況リストEntity.get受給状況リスト());
        report.writeBy(reportSourceWriter);
        outputJokenhyoFactory();
    }

    private void outputJokenhyoFactory() {
        Association association = AssociationFinderFactory.createInstance().getAssociation();
        ReportOutputJokenhyoItem item = new ReportOutputJokenhyoItem(
                ReportIdDBD.DBD300004.getReportId().getColumnValue(),
                association.getLasdecCode_().getColumnValue(),
                association.get市町村名(),
                new RString(String.valueOf(JobContextHolder.getJobId())),
                ReportIdDBD.DBD300004.getReportName(),
                new RString("3"),
                new RString("なし"),
                new RString("なし"),
                contribute());
        OutputJokenhyoFactory.createInstance(item).print();
    }

    private List<RString> contribute() {
        List<RString> 出力条件 = new ArrayList<>();
        出力条件.add(new RString("【対象年度】 " + parameter.get対象年度().wareki().eraType(EraType.KANJI).firstYear(FirstYear.ICHI_NEN).toDateString()));
        if (parameter.get基準年月日04() != null && !parameter.get基準年月日04().isEmpty()) {
            出力条件.add(new RString("【基準日】 ").concat(parameter.get基準年月日04().wareki().toDateString().substring(INDEX_7)));
        } else {
            出力条件.add(new RString("【基準日】 "));
        }
        出力条件.add(new RString("【集計単位】 " + parameter.get集計単位()));
        出力条件.add(new RString("【年齢From】 " + parameter.get年齢From()));
        出力条件.add(new RString("【年齢To】 " + parameter.get年齢To()));
        if (parameter.get年齢基準日() == null || parameter.get年齢基準日().isEmpty()) {
            出力条件.add(new RString("【年齢基準日】 "));
        } else {
            出力条件.add(new RString("【年齢基準日】 " + parameter.get年齢基準日().wareki().toDateString()));
        }
        if (parameter.get生年月日From() == null || parameter.get生年月日To() == null) {
            出力条件.add(new RString("【生年月日From】 "));
            出力条件.add(new RString("【生年月日To】 "));
        } else {
            出力条件.add(new RString("【生年月日From】 " + parameter.get生年月日From()));
            出力条件.add(new RString("【生年月日To】 " + parameter.get生年月日To()));
        }
        出力条件.add(new RString("【地区区分】 " + parameter.get地区区分()));
        出力条件.add(new RString("【開始地区コード】 " + parameter.get開始地区コード()));
        出力条件.add(new RString("【終了地区コード】 " + parameter.get終了地区コード()));
        return 出力条件;
    }
}
