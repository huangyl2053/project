/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.batchcontroller.step.DBB031001;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbb.business.core.kanri.MonthShichoson;
import jp.co.ndensan.reams.db.dbb.definition.core.fuka.ErrorCode;
import jp.co.ndensan.reams.db.dbb.definition.core.honnsanteifuka.KeisanTaishoshaParameter;
import jp.co.ndensan.reams.db.dbb.definition.processprm.dbbbt4300.HonsanteiFukaProcessParameter;
import jp.co.ndensan.reams.db.dbb.entity.db.basic.DbT2010FukaErrorListEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.honnsanteifuka.HonSanJonTyuShutuTempEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.honnsanteifuka.KeisanTaishoshaEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.honnsanteifuka.KuBunnGaTsurakuTempEntity;
import jp.co.ndensan.reams.db.dbb.service.core.kanri.HokenryoRank;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBU;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbx.definition.core.fuka.Tsuki;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.DonyuKeitaiCode;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.GyomuBunrui;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.TsuchishoNo;
import jp.co.ndensan.reams.db.dbx.service.core.shichosonsecurityjoho.ShichosonSecurityJoho;
import jp.co.ndensan.reams.db.dbz.business.core.HihokenshaDaicho;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1001HihokenshaDaichoEntity;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchPermanentTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 計算対象者抽出・通知書番号発番クラスです。
 *
 * @reamsid_L DBB-0730-010 lijunjun
 */
public class KeisanTaishoshaProcess extends BatchProcessBase<KeisanTaishoshaEntity> {

    private static final int INDEX_1 = 1;
    private static final int INDEX_14 = 14;
    private static final int INDEX_16 = 16;
    private static final int 一日 = 1;
    private static final int 四月 = 4;
    private static final RString FROMAT = new RString("%02d");
    private static final RString ゼロ_0000 = new RString("0000");
    private static final RString 合併情報区分_合併あり = new RString("1");
    private static final RString バッチID = new RString("DBBBT43001");
    private static final RString 内部帳票ID = new RString("DBB400001_FukaErrorIchitan");
    private static final RString SELECTPATH = new RString("jp.co.ndensan.reams.db.dbb.persistence.db.mapper.relate"
            + ".honnsanteifuka.IHonnSanteiFukaMapper.select計算対象者抽出");
    private static final RString 本算定抽出TEMP = new RString("HonSanJonTyuShutuTemp");
    private static final RString 月別ランクTEMP = new RString("KuBunnGaTsurakuTemp");
    @BatchWriter
    private BatchPermanentTableWriter writer;
    @BatchWriter
    private BatchEntityCreatedTempTableWriter 本算定抽出writer;
    @BatchWriter
    private BatchEntityCreatedTempTableWriter 月別ランクwriter;
    private HonsanteiFukaProcessParameter processParameter;
    private KeisanTaishoshaParameter myBatisParameter;
    private List<DbT1001HihokenshaDaichoEntity> 資格の情報List;
    private KeisanTaishoshaEntity 計算対象者抽出Entity;
    private HihokenshaNo 被保険者番号;
    private TsuchishoNo 通知書番号;
    private RString 導入形態コード;
    private int count;

    @Override
    public void initialize() {
        ShichosonSecurityJoho 市町村セキュリティ情報 = ShichosonSecurityJoho.getShichosonSecurityJoho(GyomuBunrui.介護事務);
        導入形態コード = 市町村セキュリティ情報.get導入形態コード().getKey();
        資格の情報List = new ArrayList<>();
        count = 0;
    }

    @Override
    protected IBatchReader createReader() {
        myBatisParameter = creatParameter(processParameter);
        return new BatchDbReader(SELECTPATH, myBatisParameter);
    }

    @Override
    protected void createWriter() {
        本算定抽出writer = new BatchEntityCreatedTempTableWriter(本算定抽出TEMP, HonSanJonTyuShutuTempEntity.class);
        月別ランクwriter = new BatchEntityCreatedTempTableWriter(月別ランクTEMP, KuBunnGaTsurakuTempEntity.class);
        writer = new BatchPermanentTableWriter(DbT2010FukaErrorListEntity.class);
    }

    @Override
    protected void process(KeisanTaishoshaEntity entity) {
        if (INDEX_1 <= count) {
            if (entity.get資格の情報() == null && entity.get賦課の情報() != null) {
                set賦課情報Error(entity);
            } else if (entity.get資格の情報() != null && entity.get賦課の情報() != null) {
                HonSanJonTyuShutuTempEntity tempEntity = new HonSanJonTyuShutuTempEntity();
                set資格情報Entity(entity.get資格の情報(), tempEntity, myBatisParameter);
                editor賦課は空にしない(entity, tempEntity);
            } else if (entity.get資格の情報() != null && entity.get賦課の情報() == null) {
                HonSanJonTyuShutuTempEntity tempEntity = new HonSanJonTyuShutuTempEntity();
                set資格情報Entity(entity.get資格の情報(), tempEntity, myBatisParameter);
                tempEntity.setChoteiNendo(myBatisParameter.get調定年度());
                tempEntity.setFukaNendo(myBatisParameter.get賦課年度());
                tempEntity.setTsuchishoNo(create通知書番号(entity.get資格の情報().getHihokenshaNo().getColumnValue(), 1));
                本算定抽出writer.insert(tempEntity);
                editor賦課は空(entity);
            }
            get被保険者番号(entity);
            get通知書番号(entity);
        } else {
            資格の情報List.add(entity.get資格の情報());
            get被保険者番号(entity);
            get通知書番号(entity);
        }
        計算対象者抽出Entity = entity;
        count++;
    }

    private void get通知書番号(KeisanTaishoshaEntity entity) {
        通知書番号 = entity.get賦課の情報() == null ? TsuchishoNo.EMPTY : entity.get賦課の情報().getTsuchishoNo();
    }

    private void get被保険者番号(KeisanTaishoshaEntity entity) {
        被保険者番号 = entity.get資格の情報() == null ? entity.get賦課の情報().getHihokenshaNo()
                : entity.get資格の情報().getHihokenshaNo();
    }

    @Override
    protected void afterExecute() {
        if (計算対象者抽出Entity == null) {
            return;
        }
        if (計算対象者抽出Entity.get資格の情報() == null && count == 1) {
            set賦課情報Error(計算対象者抽出Entity);
        } else if (計算対象者抽出Entity.get賦課の情報() == null && count == 1) {
            HonSanJonTyuShutuTempEntity tempEntity = new HonSanJonTyuShutuTempEntity();
            set資格情報Entity(計算対象者抽出Entity.get資格の情報(), tempEntity, myBatisParameter);
            tempEntity.setChoteiNendo(myBatisParameter.get調定年度());
            tempEntity.setFukaNendo(myBatisParameter.get賦課年度());
            tempEntity.setTsuchishoNo(create通知書番号(計算対象者抽出Entity.get資格の情報().getHihokenshaNo().getColumnValue(), 1));
            本算定抽出writer.insert(tempEntity);
            load月別ランク情報();
        } else if (計算対象者抽出Entity.get賦課の情報() != null && count == 1) {
            HonSanJonTyuShutuTempEntity tempEntity = new HonSanJonTyuShutuTempEntity();
            set資格情報Entity(計算対象者抽出Entity.get資格の情報(), tempEntity, myBatisParameter);
            tempEntity.setChoteiNendo(計算対象者抽出Entity.get賦課の情報().getChoteiNendo());
            tempEntity.setChoteiNendo(計算対象者抽出Entity.get賦課の情報().getChoteiNendo());
            tempEntity.setFukaNendo(計算対象者抽出Entity.get賦課の情報().getFukaNendo());
            tempEntity.setTsuchishoNo(計算対象者抽出Entity.get賦課の情報().getTsuchishoNo());
            本算定抽出writer.insert(tempEntity);
            load月別ランク情報();
        }
    }

    private void load月別ランク情報() {
        List<HihokenshaDaicho> 資格情報List = new ArrayList<>();
        for (DbT1001HihokenshaDaichoEntity daichoentity : 資格の情報List) {
            資格情報List.add(new HihokenshaDaicho(daichoentity));
        }
        if (DonyuKeitaiCode.事務広域.getCode().equals(導入形態コード)) {
            RString 合併情報区分 = DbBusinessConfig.get(ConfigNameDBU.合併情報管理_合併情報区分,
                    RDate.getNowDate(), SubGyomuCode.DBU介護統計報告);
            if (合併情報区分_合併あり.equals(合併情報区分)) {
                HokenryoRank rank = InstanceProvider.create(HokenryoRank.class);
                List<MonthShichoson> 月別ランク情報 = rank.get月別ランク情報(資格情報List, myBatisParameter.get賦課年度());
                KuBunnGaTsurakuTempEntity rankuEntity = new KuBunnGaTsurakuTempEntity();
                rankuEntity.setHihokenshaNo(資格情報List.get(0).get被保険者番号());
                set月別ランク(rankuEntity, 月別ランク情報);
                月別ランクwriter.insert(rankuEntity);
            }
        }
    }

    private void editor賦課は空(KeisanTaishoshaEntity entity) {
        if (被保険者番号.equals(entity.get資格の情報().getHihokenshaNo())) {
            資格の情報List.add(entity.get資格の情報());
        } else {
            load月別ランク情報();
            資格の情報List.clear();
            資格の情報List.add(entity.get資格の情報());
        }
    }

    private void editor賦課は空にしない(KeisanTaishoshaEntity entity, HonSanJonTyuShutuTempEntity tempEntity) {
        if (被保険者番号.equals(entity.get賦課の情報().getHihokenshaNo())) {
            tempEntity.setChoteiNendo(entity.get賦課の情報().getChoteiNendo());
            tempEntity.setChoteiNendo(entity.get賦課の情報().getChoteiNendo());
            tempEntity.setFukaNendo(entity.get賦課の情報().getFukaNendo());
            int 番号 = Integer.parseInt(通知書番号.getColumnValue().substring(INDEX_14, INDEX_16).toString()) + 1;
            tempEntity.setTsuchishoNo(create通知書番号(entity.get賦課の情報().getHihokenshaNo().getColumnValue(), 番号));
            本算定抽出writer.insert(tempEntity);
            資格の情報List.add(entity.get資格の情報());
        } else if (!被保険者番号.equals(entity.get賦課の情報().getHihokenshaNo())) {
            tempEntity.setChoteiNendo(entity.get賦課の情報().getChoteiNendo());
            tempEntity.setChoteiNendo(entity.get賦課の情報().getChoteiNendo());
            tempEntity.setFukaNendo(entity.get賦課の情報().getFukaNendo());
            tempEntity.setTsuchishoNo(entity.get賦課の情報().getTsuchishoNo());
            本算定抽出writer.insert(tempEntity);
            load月別ランク情報();
            資格の情報List.clear();
            資格の情報List.add(entity.get資格の情報());
        }
    }

    private void set賦課情報Error(KeisanTaishoshaEntity entity) {
        DbT2010FukaErrorListEntity errorListEntity = new DbT2010FukaErrorListEntity();
        errorListEntity.setSubGyomuCode(SubGyomuCode.DBB介護賦課);
        errorListEntity.setInternalReportId(内部帳票ID);
        errorListEntity.setFukaNendo(myBatisParameter.get賦課年度());
        TsuchishoNo tsuchishoNo = entity.get賦課の情報().getTsuchishoNo();
        if (tsuchishoNo != null) {
            errorListEntity.setTsuchishoNo(tsuchishoNo);
        }
        YMDHMS choteiNichiji = entity.get賦課の情報().getChoteiNichiji();
        if (choteiNichiji != null) {
            errorListEntity.setInternalReportCreationDateTime(choteiNichiji.isEmpty()
                    ? null : choteiNichiji.getRDateTime());
        }
        errorListEntity.setBatchId(バッチID);
        errorListEntity.setBatchStartingDateTime(processParameter.getバッチ起動時処理日時().getRDateTime());
        errorListEntity.setErrorCode(new Code(ErrorCode.被保険者台帳データなし.getコード()));
        errorListEntity.setHihokenshaNo(entity.get賦課の情報().getHihokenshaNo());
        errorListEntity.setShikibetsuCode(entity.get賦課の情報().getShikibetsuCode());
        errorListEntity.setShikakuShutokuYMD(entity.get賦課の情報().getShikakuShutokuYMD());
        errorListEntity.setShikakuShutokuJiyu(entity.get賦課の情報().getShikakuShutokuJiyu());
        errorListEntity.setShikakuSoshitsuYMD(entity.get賦課の情報().getShikakuSoshitsuYMD());
        errorListEntity.setShikakuSoshitsuJiyu(entity.get賦課の情報().getShikakuSoshitsuJiyu());
        writer.insert(errorListEntity);
    }

    private TsuchishoNo create通知書番号(RString 被保険者番号, int 枝番号) {
        RStringBuilder builder = new RStringBuilder();
        builder.append(ゼロ_0000);
        builder.append(被保険者番号);
        builder.append(new RString(String.format(FROMAT.toString(), 枝番号)));
        return new TsuchishoNo(builder.toRString());
    }

    private void set資格情報Entity(DbT1001HihokenshaDaichoEntity daichoEntity, HonSanJonTyuShutuTempEntity entity,
            KeisanTaishoshaParameter param) {
        entity.setHihokenshaNo(daichoEntity.getHihokenshaNo());
        entity.setIdoYMD(daichoEntity.getIdoYMD());
        entity.setEdaNo(daichoEntity.getEdaNo());
        entity.setIdoJiyuCode(daichoEntity.getIdoJiyuCode());
        entity.setShichosonCode(daichoEntity.getShichosonCode());
        entity.setShikibetsuCode(daichoEntity.getShikibetsuCode());
        entity.setShikakuShutokuJiyuCode(daichoEntity.getShikakuShutokuJiyuCode());
        entity.setShikakuShutokuYMD(daichoEntity.getShikakuShutokuYMD());
        entity.setShikakuShutokuTodokedeYMD(daichoEntity.getShikakuShutokuTodokedeYMD());
        entity.setIchigoShikakuShutokuYMD(daichoEntity.getIchigoShikakuShutokuYMD());
        entity.setHihokennshaKubunCode(daichoEntity.getHihokennshaKubunCode());
        entity.setShikakuSoshitsuJiyuCode(daichoEntity.getShikakuSoshitsuJiyuCode());
        entity.setShikakuSoshitsuYMD(daichoEntity.getShikakuSoshitsuYMD());
        entity.setShikakuSoshitsuTodokedeYMD(daichoEntity.getShikakuSoshitsuTodokedeYMD());
        entity.setShikakuHenkoJiyuCode(daichoEntity.getShikakuHenkoJiyuCode());
        entity.setShikakuHenkoYMD(daichoEntity.getShikakuHenkoYMD());
        entity.setShikakuHenkoTodokedeYMD(daichoEntity.getShikakuHenkoTodokedeYMD());
        entity.setJushochitokureiTekiyoJiyuCode(daichoEntity.getJushochitokureiTekiyoJiyuCode());
        entity.setJushochitokureiTekiyoYMD(daichoEntity.getJushochitokureiTekiyoYMD());
        entity.setJushochitokureiTekiyoTodokedeYMD(daichoEntity.getJushochitokureiTekiyoTodokedeYMD());
        entity.setJushochitokureiKaijoJiyuCode(daichoEntity.getJushochitokureiKaijoJiyuCode());
        entity.setJushochitokureiKaijoYMD(daichoEntity.getJushochitokureiKaijoYMD());
        entity.setJushochitokureiKaijoTodokedeYMD(daichoEntity.getJushochitokureiKaijoTodokedeYMD());
        entity.setJushochiTokureiFlag(daichoEntity.getJushochiTokureiFlag());
        entity.setKoikinaiJushochiTokureiFlag(daichoEntity.getKoikinaiJushochiTokureiFlag());
        entity.setKoikinaiTokureiSochimotoShichosonCode(daichoEntity.getKoikinaiTokureiSochimotoShichosonCode());
        entity.setKyuShichosonCode(daichoEntity.getKyuShichosonCode());
        entity.setLogicalDeletedFlag(daichoEntity.getLogicalDeletedFlag());
        FlexibleDate fukaDate = new FlexibleDate(param.get賦課年度().getYearValue(), 四月, INDEX_1);
        if (daichoEntity.getIchigoShikakuShutokuYMD() != null
                && fukaDate.isBeforeOrEquals(daichoEntity.getIchigoShikakuShutokuYMD())) {
            entity.setKijunYMD(daichoEntity.getIchigoShikakuShutokuYMD());
        } else {
            entity.setKijunYMD(fukaDate);
        }
    }

    private void set月別ランク(KuBunnGaTsurakuTempEntity rankuEntity, List<MonthShichoson> 月別ランク情報リスト) {
        for (MonthShichoson 月別ランク情報 : 月別ランク情報リスト) {
            if (Tsuki._4月.getコード().equals(月別ランク情報.get月().getコード())) {
                rankuEntity.setRankKubun4Gatsu(月別ランク情報.getランク区分());
                rankuEntity.setShichosonCode4Gatsu(月別ランク情報.get市町村コード());
            } else if (Tsuki._5月.getコード().equals(月別ランク情報.get月().getコード())) {
                rankuEntity.setRankKubun5Gatsu(月別ランク情報.getランク区分());
                rankuEntity.setShichosonCode5Gatsu(月別ランク情報.get市町村コード());
            } else if (Tsuki._6月.getコード().equals(月別ランク情報.get月().getコード())) {
                rankuEntity.setRankKubun6Gatsu(月別ランク情報.getランク区分());
                rankuEntity.setShichosonCode6Gatsu(月別ランク情報.get市町村コード());
            } else if (Tsuki._7月.getコード().equals(月別ランク情報.get月().getコード())) {
                rankuEntity.setRankKubun7Gatsu(月別ランク情報.getランク区分());
                rankuEntity.setShichosonCode7Gatsu(月別ランク情報.get市町村コード());
            } else if (Tsuki._8月.getコード().equals(月別ランク情報.get月().getコード())) {
                rankuEntity.setRankKubun8Gatsu(月別ランク情報.getランク区分());
                rankuEntity.setShichosonCode8Gatsu(月別ランク情報.get市町村コード());
            } else if (Tsuki._9月.getコード().equals(月別ランク情報.get月().getコード())) {
                rankuEntity.setRankKubun9Gatsu(月別ランク情報.getランク区分());
                rankuEntity.setShichosonCode9Gatsu(月別ランク情報.get市町村コード());
            } else if (Tsuki._10月.getコード().equals(月別ランク情報.get月().getコード())) {
                rankuEntity.setRankKubun10Gatsu(月別ランク情報.getランク区分());
                rankuEntity.setShichosonCode10Gatsu(月別ランク情報.get市町村コード());
            } else if (Tsuki._11月.getコード().equals(月別ランク情報.get月().getコード())) {
                rankuEntity.setRankKubun11Gatsu(月別ランク情報.getランク区分());
                rankuEntity.setShichosonCode11Gatsu(月別ランク情報.get市町村コード());
            } else if (Tsuki._12月.getコード().equals(月別ランク情報.get月().getコード())) {
                rankuEntity.setRankKubun12Gatsu(月別ランク情報.getランク区分());
                rankuEntity.setShichosonCode12Gatsu(月別ランク情報.get市町村コード());
            } else if (Tsuki._1月.getコード().equals(月別ランク情報.get月().getコード())) {
                rankuEntity.setRankKubun1Gatsu(月別ランク情報.getランク区分());
                rankuEntity.setShichosonCode1Gatsu(月別ランク情報.get市町村コード());
            } else if (Tsuki._2月.getコード().equals(月別ランク情報.get月().getコード())) {
                rankuEntity.setRankKubun2Gatsu(月別ランク情報.getランク区分());
                rankuEntity.setShichosonCode2Gatsu(月別ランク情報.get市町村コード());
            } else if (Tsuki._3月.getコード().equals(月別ランク情報.get月().getコード())) {
                rankuEntity.setRankKubun3Gatsu(月別ランク情報.getランク区分());
                rankuEntity.setShichosonCode3Gatsu(月別ランク情報.get市町村コード());
            }
        }
    }

    private KeisanTaishoshaParameter creatParameter(HonsanteiFukaProcessParameter processParameter) {
        FlexibleYear 調定年度 = processParameter.get調定年度();
        FlexibleYear 賦課年度 = processParameter.get賦課年度();
        FlexibleDate 資格基準日 = processParameter.get資格基準日();
        FlexibleDate 賦課年度_修正後 = new FlexibleDate(賦課年度.getYearValue(), 四月, 一日);
        KeisanTaishoshaParameter parameter = KeisanTaishoshaParameter
                .createSelectByKeyParam(調定年度, 賦課年度, 資格基準日, 賦課年度_修正後);
        return parameter;
    }

}