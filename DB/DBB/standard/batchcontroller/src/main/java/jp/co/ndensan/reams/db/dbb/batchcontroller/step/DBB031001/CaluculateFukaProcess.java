/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.batchcontroller.step.DBB031001;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbb.business.core.choshuyuyo.honnsanteifuka.CalculateChoteiResult;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.fukakeisan.FukaKokyoBatchParameter;
import jp.co.ndensan.reams.db.dbb.business.core.fukajoho.fukajoho.FukaJoho;
import jp.co.ndensan.reams.db.dbb.business.core.fukajoho.fukajoho.FukaJohoBuilder;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.HokenryoDankaiHantei;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.core.TsukibetsuHokenryoDankai;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.fukakonkyo.FukaKonkyoBatchParameter;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.fukakonkyo.FukaKonkyoFactory;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.param.FukaKonkyo;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.param.HokenryoDankaiHanteiParameter;
import jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.param.SeigyoJoho;
import jp.co.ndensan.reams.db.dbb.business.core.kanri.HokenryoDankaiList;
import jp.co.ndensan.reams.db.dbb.business.core.kanri.MonthShichoson;
import jp.co.ndensan.reams.db.dbb.business.core.nengakukeisan.NengakuHokenryo;
import jp.co.ndensan.reams.db.dbb.business.core.nengakukeisan.NengakuHokenryoKeisan;
import jp.co.ndensan.reams.db.dbb.business.core.nengakukeisan.param.NengakuFukaKonkyo;
import jp.co.ndensan.reams.db.dbb.business.core.nengakukeisan.param.NengakuFukaKonkyoFactory;
import jp.co.ndensan.reams.db.dbb.business.core.nengakukeisan.param.NengakuHokenryoKeisanParameter;
import jp.co.ndensan.reams.db.dbb.business.core.nengakukeisan.param.NengakuSeigyoJoho;
import jp.co.ndensan.reams.db.dbb.definition.core.fuka.ErrorCode;
import jp.co.ndensan.reams.db.dbb.definition.core.fuka.KozaKubun;
import jp.co.ndensan.reams.db.dbb.definition.core.fuka.ShokkenKubun;
import jp.co.ndensan.reams.db.dbb.definition.processprm.dbbbt4300.HonsanteiFukaProcessParameter;
import jp.co.ndensan.reams.db.dbb.entity.db.basic.DbT2010FukaErrorListEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.fuka.SetaiShotokuEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.fukajohotoroku.DbT2002FukaJohoTempTableEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.honnsanteifuka.CaluculateFukaEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.honnsanteifuka.KuBunnGaTsurakuTempEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.tokuchokarisanteifukamanager.FukaJohoTempEntity;
import jp.co.ndensan.reams.db.dbb.service.core.fuka.fukakeisan.FukaKeisan;
import jp.co.ndensan.reams.db.dbb.service.core.honnsanteifuka.CreatFukaEntity;
import jp.co.ndensan.reams.db.dbb.service.core.honnsanteifuka.HonnSanteiFuka;
import jp.co.ndensan.reams.db.dbb.service.core.kanri.HokenryoDankaiSettings;
import jp.co.ndensan.reams.db.dbb.service.core.kanri.HokenryoRank;
import jp.co.ndensan.reams.db.dbx.business.core.choshuhoho.ChoshuHoho;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.TsuchishoNo;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT2001ChoshuHohoEntity;
import jp.co.ndensan.reams.db.dbz.business.core.HihokenshaDaicho;
import jp.co.ndensan.reams.db.dbz.business.core.basic.RoreiFukushiNenkinJukyusha;
import jp.co.ndensan.reams.db.dbz.business.core.hihokensha.seikatsuhogojukyusha.SeikatsuHogoJukyusha;
import jp.co.ndensan.reams.db.dbz.business.core.kyokaisogaitosha.kyokaisogaitosha.KyokaisoGaitosha;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1006KyokaisoGaitoshaEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1007KyokaisoHokenryoDankaiEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7006RoreiFukushiNenkinJukyushaEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.relate.hihokensha.seikatsuhogojukyusha.SeikatsuHogoJukyushaRelateEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.relate.kyokaisogaitosha.KyokaisoGaitoshaEntity;
import jp.co.ndensan.reams.ua.uax.entity.db.relate.TokuteiKozaRelateEntity;
import jp.co.ndensan.reams.ur.urd.entity.db.basic.seikatsuhogo.UrT0508SeikatsuHogoJukyushaEntity;
import jp.co.ndensan.reams.ur.urd.entity.db.basic.seikatsuhogo.UrT0526SeikatsuHogoFujoShuruiEntity;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchPermanentTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 賦課計算のクラスです。
 *
 * @reamsid_L DBB-0730-010 lijunjun
 */
public class CaluculateFukaProcess extends BatchProcessBase<CaluculateFukaEntity> {

    private static final int INDEX_0 = 0;
    private static final int INDEX_1 = 1;
    private static final RString 本算定賦課 = new RString("A1");
    private static final RString バッチID = new RString("DBBBT43001");
    private static final RString 内部帳票ID = new RString("DBB400001_FukaErrorIchitan");
    private static final RString SELECTPATH = new RString("jp.co.ndensan.reams.db.dbb.persistence.db.mapper.relate"
            + ".honnsanteifuka.IHonnSanteiFukaMapper.select生活老齢境界");
    private static final RString 賦課情報一時テーブル_NAME = new RString("DbT2002FukaJohoTemp");

    @BatchWriter
    private BatchEntityCreatedTempTableWriter fukaWriter;
    @BatchWriter
    private BatchPermanentTableWriter fukaErrorWriter;
    @BatchWriter
    private BatchPermanentTableWriter 介護徴収方法Writer;
    private HonnSanteiFuka manager;
    private CreatFukaEntity creatEntity;
    private HonsanteiFukaProcessParameter processParameter;
    private List<SeikatsuHogoJukyusha> 生保の情報;
    private List<KyokaisoGaitosha> 境界層の情報;
    private List<RoreiFukushiNenkinJukyusha> 老齢の情報;
    private UrT0508SeikatsuHogoJukyushaEntity 生活保護受給者Entity;
    private List<UrT0526SeikatsuHogoFujoShuruiEntity> 生活保護扶助種類EntityList;
    private DbT1006KyokaisoGaitoshaEntity 境界層該当者Entity;
    private List<DbT1007KyokaisoHokenryoDankaiEntity> 境界層保険料段階EntityList;
    private CaluculateFukaEntity fukaEntity;
    private List<TokuteiKozaRelateEntity> 口座List;
    private ChoshuHoho 徴収方法の情報;
    private HihokenshaDaicho 資格の情報;
    private KuBunnGaTsurakuTempEntity 月別ランク;
    private List<SetaiShotokuEntity> 世帯員所得情報List;
    private FukaJoho 賦課の情報;
    private ShikibetsuCode 識別コード;
    private GyomuCode 業務コード;
    private FlexibleDate 受給開始日;
    private HihokenshaNo 被保険者番号;
    private int 履歴番号;
    private int リンク番号;
    private FlexibleYear 調定年度 = FlexibleYear.EMPTY;
    private FlexibleYear 賦課年度 = FlexibleYear.EMPTY;
    private TsuchishoNo 通知書番号 = TsuchishoNo.EMPTY;
    private int count;

    @Override
    public void initialize() {
        count = INDEX_1;
        manager = HonnSanteiFuka.createInstance();
        世帯員所得情報List = new ArrayList<>();
        口座List = new ArrayList<>();
        生保の情報 = new ArrayList<>();
        境界層の情報 = new ArrayList<>();
        老齢の情報 = new ArrayList<>();
        生活保護扶助種類EntityList = new ArrayList<>();
        境界層保険料段階EntityList = new ArrayList<>();
        creatEntity = CreatFukaEntity.createInstance();
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(SELECTPATH);
    }

    @Override
    protected void createWriter() {
        fukaWriter = new BatchEntityCreatedTempTableWriter(賦課情報一時テーブル_NAME, FukaJohoTempEntity.class);
        fukaErrorWriter = new BatchPermanentTableWriter(DbT2010FukaErrorListEntity.class);
        介護徴収方法Writer = new BatchPermanentTableWriter(DbT2001ChoshuHohoEntity.class);
    }

    @Override
    protected void process(CaluculateFukaEntity entity) {
        fukaEntity = entity;
        if (count == INDEX_1) {
            set区分Key(fukaEntity);
            set識別コード(fukaEntity);
            setリンクコード(fukaEntity);
            set世帯員所得情報(fukaEntity);
            set口座(fukaEntity);
            set生活保護扶助種類EntityList(fukaEntity);
            set老齢の情報EntityList(fukaEntity);
            set境界層保険料段階EntityList(fukaEntity);
            set賦課の情報(fukaEntity);
            set資格の情報(fukaEntity);
            set徴収方法の情報(fukaEntity);
            set月別ランク(fukaEntity);
            set生活保護受給者Entity(fukaEntity);
            set境界層該当者(fukaEntity);
        } else {
            if (調定年度.equals(fukaEntity.getChoteiNendo())
                    && 賦課年度.equals(fukaEntity.getFukaNendo())
                    && 通知書番号.equals(fukaEntity.getTsuchishoNo())) {
                set生保の情報List(fukaEntity);
                set老齢の情報EntityList(fukaEntity);
                set境界層の情報List(fukaEntity);
            } else {
                SeikatsuHogoJukyushaRelateEntity 生活保護受給者RelateEntity = new SeikatsuHogoJukyushaRelateEntity();
                生活保護受給者RelateEntity.set生活保護受給者Entity(生活保護受給者Entity);
                生活保護受給者RelateEntity.set生活保護扶助種類Entity(生活保護扶助種類EntityList);
                set生保の情報(生活保護受給者RelateEntity);
                KyokaisoGaitoshaEntity 境界層RelateEntity = new KyokaisoGaitoshaEntity();
                境界層RelateEntity.set境界層該当者Entity(境界層該当者Entity);
                境界層RelateEntity.set境界層保険料段階Entity(境界層保険料段階EntityList);
                set境界層の情報(境界層RelateEntity);
                caluculateFuka(fukaEntity, 資格の情報, 賦課の情報, 徴収方法の情報, 世帯員所得情報List, 月別ランク,
                        生保の情報, 老齢の情報, 境界層の情報, 賦課年度);
                世帯員所得情報List.clear();
                set世帯員所得情報(fukaEntity);
                口座List.clear();
                set口座(fukaEntity);
                生活保護扶助種類EntityList.clear();
                set生活保護扶助種類EntityList(fukaEntity);
                老齢の情報.clear();
                set老齢の情報EntityList(fukaEntity);
                境界層保険料段階EntityList.clear();
                set境界層保険料段階EntityList(fukaEntity);
                set識別コード(fukaEntity);
                setリンクコード(fukaEntity);
                set賦課の情報(fukaEntity);
                set資格の情報(fukaEntity);
                set徴収方法の情報(fukaEntity);
                set月別ランク(fukaEntity);
                set生活保護受給者Entity(fukaEntity);
                set境界層該当者(fukaEntity);
                生保の情報.clear();
                境界層の情報.clear();
            }
            set区分Key(fukaEntity);
        }
        count++;
    }

    private void set区分Key(CaluculateFukaEntity entity) {
        通知書番号 = entity.getTsuchishoNo();
        賦課年度 = entity.getFukaNendo();
        調定年度 = entity.getChoteiNendo();
    }

    private void set識別コード(CaluculateFukaEntity entity) {
        if (entity.get生活保護受給者Entity() != null) {
            識別コード = entity.get生活保護受給者Entity().getShikibetsuCode();
            業務コード = entity.get生活保護受給者Entity().getGyomuCode();
            受給開始日 = entity.get生活保護受給者Entity().getJukyuKaishiYMD();
        }
    }

    private void setリンクコード(CaluculateFukaEntity entity) {
        if (entity.get境界層該当者Entity() != null) {
            被保険者番号 = entity.get境界層該当者Entity().getHihokenshaNo();
            履歴番号 = entity.get境界層該当者Entity().getRirekiNo();
            リンク番号 = entity.get境界層該当者Entity().getLinkNo();
        }
    }

    @Override
    protected void afterExecute() {
        if (fukaEntity != null) {
            SeikatsuHogoJukyushaRelateEntity 生活保護受給者RelateEntity = new SeikatsuHogoJukyushaRelateEntity();
            生活保護受給者RelateEntity.set生活保護受給者Entity(生活保護受給者Entity);
            生活保護受給者RelateEntity.set生活保護扶助種類Entity(生活保護扶助種類EntityList);
            set生保の情報(生活保護受給者RelateEntity);
            KyokaisoGaitoshaEntity 境界層RelateEntity = new KyokaisoGaitoshaEntity();
            境界層RelateEntity.set境界層該当者Entity(境界層該当者Entity);
            境界層RelateEntity.set境界層保険料段階Entity(境界層保険料段階EntityList);
            set境界層の情報(境界層RelateEntity);
            caluculateFuka(fukaEntity, 資格の情報, 賦課の情報, 徴収方法の情報, 世帯員所得情報List, 月別ランク,
                    生保の情報, 老齢の情報, 境界層の情報, 賦課年度);
        }
    }

    private void set資格の情報(CaluculateFukaEntity entity) {
        if (entity.get資格の情報Entity() != null) {
            資格の情報 = new HihokenshaDaicho(entity.get資格の情報Entity());
        }
    }

    private void set賦課の情報(CaluculateFukaEntity entity) {
        if (entity.get賦課の情報Entity() != null && entity.get賦課の情報Entity().getDbT2002_hihokenshaNo() != null) {
            賦課の情報 = manager.get賦課の情報(entity.get賦課の情報Entity());
        } else {
            賦課の情報 = null;
        }
    }

    private void set徴収方法の情報(CaluculateFukaEntity entity) {
        if (entity.get徴収方法の情報Entity() != null) {
            徴収方法の情報 = new ChoshuHoho(entity.get徴収方法の情報Entity());
        }
    }

    private void set月別ランク(CaluculateFukaEntity entity) {
        if (entity.get月別ランクEntity() != null) {
            月別ランク = entity.get月別ランクEntity();
        }
    }

    private void set世帯員所得情報(CaluculateFukaEntity entity) {
        if (entity.get世帯員所得情報Entity() != null) {
            世帯員所得情報List = creatEntity.get世帯員所得情報List(entity.get世帯員所得情報Entity());
        }
    }

    private void set口座(CaluculateFukaEntity entity) {
        if (entity.get口座Entity() != null) {
            口座List.add(entity.get口座Entity());
        }
    }

    private void set老齢の情報EntityList(CaluculateFukaEntity entity) {
        if (entity != null && entity.get老齢情報Entity() != null
                && (老齢の情報.isEmpty() || isContain(entity.get老齢情報Entity()))) {
            老齢の情報.add(new RoreiFukushiNenkinJukyusha(entity.get老齢情報Entity()));
        }
    }

    private boolean isContain(DbT7006RoreiFukushiNenkinJukyushaEntity entity) {
        boolean flag = true;
        for (RoreiFukushiNenkinJukyusha 老齢 : 老齢の情報) {
            if (老齢.get識別コード().equals(entity.getShikibetsuCode()) && 老齢.get受給開始年月日().equals(entity.getJukyuKaishiYMD())) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private void set生活保護受給者Entity(CaluculateFukaEntity entity) {
        if (entity.get生活保護受給者Entity() != null) {
            生活保護受給者Entity = entity.get生活保護受給者Entity();
        }
    }

    private void set生活保護扶助種類EntityList(CaluculateFukaEntity entity) {
        if (entity != null && entity.get生活保護扶助種類Entity() != null
                && (生活保護扶助種類EntityList.isEmpty() || isContain生活保護扶助種類(entity.get生活保護扶助種類Entity()))) {
            生活保護扶助種類EntityList.add(entity.get生活保護扶助種類Entity());
        }
    }

    private boolean isContain生活保護扶助種類(UrT0526SeikatsuHogoFujoShuruiEntity entity) {
        boolean flag = true;
        for (UrT0526SeikatsuHogoFujoShuruiEntity urt0526Entity : 生活保護扶助種類EntityList) {
            if (urt0526Entity.getShikibetsuCode().equals(entity.getShikibetsuCode())
                    && urt0526Entity.getGyomuCode().equals(entity.getGyomuCode())
                    && urt0526Entity.getJukyuKaishiYMD().equals(entity.getJukyuKaishiYMD())
                    && urt0526Entity.getFujoShuruiCode().equals(entity.getFujoShuruiCode())) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private void set境界層該当者(CaluculateFukaEntity entity) {
        if (entity != null && entity.get境界層該当者Entity() != null) {
            境界層該当者Entity = entity.get境界層該当者Entity();
        }
    }

    private void set境界層保険料段階EntityList(CaluculateFukaEntity entity) {
        if (entity != null && entity.get境界層保険料段階Entity() != null
                && (境界層保険料段階EntityList.isEmpty() || isContain境界層保険料段階(entity.get境界層保険料段階Entity()))) {
            境界層保険料段階EntityList.add(entity.get境界層保険料段階Entity());
        }
    }

    private boolean isContain境界層保険料段階(DbT1007KyokaisoHokenryoDankaiEntity entity) {
        boolean flag = true;
        for (DbT1007KyokaisoHokenryoDankaiEntity dbT1007Entity : 境界層保険料段階EntityList) {
            if (dbT1007Entity.getHihokenshaNo().equals(entity.getHihokenshaNo())
                    && dbT1007Entity.getRirekiNo() == entity.getRirekiNo()
                    && dbT1007Entity.getLinkNo() == entity.getLinkNo()
                    && dbT1007Entity.getTekiyoKaishiYM().equals(entity.getTekiyoKaishiYM())) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private void set生保の情報(SeikatsuHogoJukyushaRelateEntity entity) {
        if (entity != null && entity.get生活保護受給者Entity() != null) {
            生保の情報.add(new SeikatsuHogoJukyusha(entity));
        }
    }

    private void set境界層の情報(KyokaisoGaitoshaEntity entity) {
        if (entity != null && entity.get境界層該当者Entity() != null) {
            境界層の情報.add(new KyokaisoGaitosha(entity));
        }
    }

    private void set生保の情報List(CaluculateFukaEntity entity) {
        if (entity.get生活保護受給者Entity() != null) {
            if (!entity.get生活保護受給者Entity().getShikibetsuCode().equals(識別コード)
                    || !entity.get生活保護受給者Entity().getGyomuCode().equals(業務コード)
                    || !entity.get生活保護受給者Entity().getJukyuKaishiYMD().equals(受給開始日)) {
                SeikatsuHogoJukyushaRelateEntity 生活保護受給者RelateEntity = new SeikatsuHogoJukyushaRelateEntity();
                生活保護受給者RelateEntity.set生活保護受給者Entity(生活保護受給者Entity);
                生活保護受給者RelateEntity.set生活保護扶助種類Entity(生活保護扶助種類EntityList);
                set生保の情報(生活保護受給者RelateEntity);
                set生活保護受給者Entity(entity);
                生活保護扶助種類EntityList.clear();
                set生活保護扶助種類EntityList(entity);
                set識別コード(entity);
            } else {
                set生活保護扶助種類EntityList(entity);
            }
        }
    }

    private void set境界層の情報List(CaluculateFukaEntity entity) {
        if (entity.get境界層該当者Entity() != null) {
            if (!entity.get境界層該当者Entity().getHihokenshaNo().equals(被保険者番号)
                    || entity.get境界層該当者Entity().getRirekiNo() != 履歴番号
                    || entity.get境界層該当者Entity().getLinkNo() != リンク番号) {
                KyokaisoGaitoshaEntity 境界層RelateEntity = new KyokaisoGaitoshaEntity();
                境界層RelateEntity.set境界層該当者Entity(境界層該当者Entity);
                境界層RelateEntity.set境界層保険料段階Entity(境界層保険料段階EntityList);
                set境界層の情報(境界層RelateEntity);
                set境界層該当者(entity);
                境界層保険料段階EntityList.clear();
                set境界層保険料段階EntityList(entity);
                setリンクコード(entity);
            } else {
                set境界層保険料段階EntityList(entity);
            }
        }
    }

    private void caluculateFuka(CaluculateFukaEntity entity,
            HihokenshaDaicho 資格の情報,
            FukaJoho 賦課の情報,
            ChoshuHoho 徴収方法の情報,
            List<SetaiShotokuEntity> 世帯員所得情報List,
            KuBunnGaTsurakuTempEntity 月別ランク,
            List<SeikatsuHogoJukyusha> 生保の情報のリスト,
            List<RoreiFukushiNenkinJukyusha> 老福の情報のリスト,
            List<KyokaisoGaitosha> 境界層の情報のリスト,
            FlexibleYear 賦課の年度) {
        HokenryoDankaiList 保険料段階List = HokenryoDankaiSettings.createInstance().get保険料段階ListIn(賦課の年度);
        SeigyoJoho 月別保険料制御情報 = manager.editor月別保険料制御情報(保険料段階List);
        NengakuSeigyoJoho 年額制御情報 = manager.editor年額制御情報();
        FukaKonkyoBatchParameter 賦課根拠param = new FukaKonkyoBatchParameter();
        賦課根拠param.set賦課基準日(entity.getKijunYMD());
        賦課根拠param.set生保の情報リスト(生保の情報のリスト);
        賦課根拠param.set老齢の情報のリスト(老福の情報のリスト);
        賦課根拠param.set世帯員所得情報List(世帯員所得情報List);
        FukaKonkyoFactory factory = new FukaKonkyoFactory();
        FukaKonkyo 賦課根拠 = factory.create(賦課根拠param);

        HokenryoDankaiHantei hantei = InstanceProvider.create(HokenryoDankaiHantei.class);
        HokenryoDankaiHanteiParameter 保険料段階パラメータ = new HokenryoDankaiHanteiParameter();
        保険料段階パラメータ.setFukaNendo(entity.getFukaNendo());
        保険料段階パラメータ.setFukaKonkyo(賦課根拠);
        保険料段階パラメータ.setSeigyoJoho(月別保険料制御情報);
        TsukibetsuHokenryoDankai 月別保険料段階 = hantei.determine月別保険料段階(保険料段階パラメータ);

        NengakuHokenryoKeisanParameter 年額保険料パラメータ = new NengakuHokenryoKeisanParameter();
        年額保険料パラメータ.set賦課年度(賦課の年度);
        NengakuFukaKonkyoFactory nengakuFukaKonkyo = InstanceProvider.create(NengakuFukaKonkyoFactory.class);
        NengakuFukaKonkyo 年額賦課根拠;
        if (月別ランク == null) {
            年額賦課根拠 = nengakuFukaKonkyo.createNengakuFukaKonkyo(
                    entity.getKijunYMD(),
                    資格の情報.get第1号資格取得年月日(),
                    資格の情報.get資格喪失年月日(),
                    月別保険料段階,
                    null, null, null, null, null, null, null, null, null, null, null, null);
        } else {
            年額賦課根拠 = nengakuFukaKonkyo.createNengakuFukaKonkyo(
                    entity.getKijunYMD(),
                    資格の情報.get第1号資格取得年月日(),
                    資格の情報.get資格喪失年月日(),
                    月別保険料段階,
                    月別ランク.getRankKubun4Gatsu(), 月別ランク.getRankKubun5Gatsu(), 月別ランク.getRankKubun6Gatsu(),
                    月別ランク.getRankKubun7Gatsu(), 月別ランク.getRankKubun8Gatsu(), 月別ランク.getRankKubun9Gatsu(),
                    月別ランク.getRankKubun10Gatsu(), 月別ランク.getRankKubun11Gatsu(), 月別ランク.getRankKubun12Gatsu(),
                    月別ランク.getRankKubun1Gatsu(), 月別ランク.getRankKubun2Gatsu(), 月別ランク.getRankKubun3Gatsu());
        }

        年額保険料パラメータ.set年額賦課根拠(年額賦課根拠);
        年額保険料パラメータ.set年額制御情報(年額制御情報);
        NengakuHokenryoKeisan keisan = InstanceProvider.create(NengakuHokenryoKeisan.class);
        NengakuHokenryo 年額保険料 = keisan.calculate年額保険料(年額保険料パラメータ);

        FukaKokyoBatchParameter fukaKokyoBatchParameter = new FukaKokyoBatchParameter();
        fukaKokyoBatchParameter.set賦課年度(賦課の年度);
        fukaKokyoBatchParameter.set資格の情報(資格の情報);
        fukaKokyoBatchParameter.set世帯員所得情報List(世帯員所得情報List);
        fukaKokyoBatchParameter.set生保の情報のリスト(生保の情報のリスト);
        fukaKokyoBatchParameter.set老福の情報のリスト(老福の情報のリスト);
        fukaKokyoBatchParameter.set境界層の情報のリスト(境界層の情報のリスト);
        fukaKokyoBatchParameter.set賦課根拠パラメータ(賦課根拠);
        fukaKokyoBatchParameter.set月別保険料段階(月別保険料段階);
        fukaKokyoBatchParameter.set年額保険料(年額保険料.getHokenryoNengaku());
        fukaKokyoBatchParameter.set調定日時(processParameter.getバッチ起動時処理日時());
        if (賦課の情報 == null) {
            create新規の賦課処理(entity, 資格の情報, 徴収方法の情報, 口座List, fukaKokyoBatchParameter,
                    processParameter.getバッチ起動時処理日時(), 年額保険料, 賦課の年度);
        } else {
            create既存の賦課処理(資格の情報, 賦課の情報, 徴収方法の情報, 口座List, fukaKokyoBatchParameter,
                    processParameter.getバッチ起動時処理日時(), 年額保険料, 賦課の年度);
        }
    }

    private void create既存の賦課処理(HihokenshaDaicho 資格の情報,
            FukaJoho 賦課の情報,
            ChoshuHoho 徴収方法の情報,
            List<TokuteiKozaRelateEntity> 口座List,
            FukaKokyoBatchParameter fukaKokyoBatchParameter,
            YMDHMS 調定日時,
            NengakuHokenryo 年額保険料,
            FlexibleYear 賦課年度) {
        FukaJoho 賦課の情報_更正前 = 賦課の情報;
        fukaKokyoBatchParameter.set賦課の情報_設定前(賦課の情報_更正前);
        FukaJoho 賦課の情報_更正後 = FukaKeisan.createInstance().reflect賦課根拠(fukaKokyoBatchParameter);
        ChoshuHoho 徴収方法の情報_更正後 = 徴収方法の情報;
        if ((賦課の情報_更正後.get調定年度().equals(賦課の情報_更正後.get賦課年度())
                && !賦課の情報_更正後.get減免前介護保険料_年額().equals(年額保険料.getHokenryoNengaku()))
                || !RString.isNullOrEmpty(徴収方法の情報.get特別徴収停止事由コード())) {
            CalculateChoteiResult choteiResult = manager.caluculateChotei(調定日時, 賦課の情報_更正後,
                    徴収方法の情報, 年額保険料, 資格の情報);
            賦課の情報_更正後 = choteiResult.get賦課情報();
            徴収方法の情報_更正後 = choteiResult.get徴収方法情報();
        }
        if (Decimal.ZERO.compareTo(賦課の情報_更正前.get減免額()) == INDEX_0) {
            賦課の情報_更正後 = creat出力対象(賦課年度, 賦課の情報_更正後,
                    賦課の情報_更正前, 調定日時, 徴収方法の情報_更正後, 資格の情報, 口座List);
            FukaJoho 賦課の情報_設定後 = manager.setChoteiJiyu(賦課の情報_更正前, 賦課の情報_更正後,
                    徴収方法の情報);

            DbT2002FukaJohoTempTableEntity fukaJohoTempTableEntity = new DbT2002FukaJohoTempTableEntity();
            fukaJohoTempTableEntity = manager.set一時賦課情報(fukaJohoTempTableEntity, 賦課の情報_設定後);
            fukaWriter.insert(fukaJohoTempTableEntity);

            DbT2001ChoshuHohoEntity dbT2001ChoshuHohoEntity = 徴収方法の情報_更正後.toEntity();
            dbT2001ChoshuHohoEntity.setRirekiNo(徴収方法の情報_更正後.get履歴番号() + INDEX_1);
            介護徴収方法Writer.insert(dbT2001ChoshuHohoEntity);

        } else if (Decimal.ZERO.compareTo(賦課の情報_更正前.get減免額()) < INDEX_0) {
            DbT2010FukaErrorListEntity errorListEntity = new DbT2010FukaErrorListEntity();
            errorListEntity.setSubGyomuCode(SubGyomuCode.DBB介護賦課);
            errorListEntity.setInternalReportId(内部帳票ID);
            errorListEntity.setInternalReportCreationDateTime(調定日時.getRDateTime());
            errorListEntity.setFukaNendo(賦課年度);
            errorListEntity.setTsuchishoNo(賦課の情報_更正後.get通知書番号());
            errorListEntity.setBatchId(バッチID);
            errorListEntity.setBatchStartingDateTime(RDate.getNowDateTime());
            errorListEntity.setErrorCode(new Code(ErrorCode.賦課に減免あり.getコード()));
            errorListEntity.setHihokenshaNo(賦課の情報_更正後.get被保険者番号());
            errorListEntity.setShikibetsuCode(賦課の情報_更正後.get識別コード());
            errorListEntity.setShikakuShutokuYMD(賦課の情報_更正後.get資格取得日());
            errorListEntity.setShikakuShutokuJiyu(賦課の情報_更正後.get資格取得事由());
            errorListEntity.setShikakuSoshitsuYMD(賦課の情報_更正後.get資格喪失日());
            errorListEntity.setShikakuSoshitsuJiyu(賦課の情報_更正後.get資格喪失事由());
            fukaErrorWriter.insert(errorListEntity);
        }
    }

    private void create新規の賦課処理(CaluculateFukaEntity entity,
            HihokenshaDaicho 資格の情報,
            ChoshuHoho 徴収方法の情報,
            List<TokuteiKozaRelateEntity> 口座List,
            FukaKokyoBatchParameter fukaKokyoBatchParameter,
            YMDHMS 調定日時,
            NengakuHokenryo 年額保険料,
            FlexibleYear 賦課年度) {
        FukaJoho 新しい賦課の情報 = new FukaJoho(entity.getChoteiNendo(), entity.getFukaNendo(),
                entity.getTsuchishoNo(), INDEX_0);
        fukaKokyoBatchParameter.set賦課の情報_設定前(新しい賦課の情報);
        FukaJoho 賦課の情報_設定後 = FukaKeisan.createInstance().reflect賦課根拠(fukaKokyoBatchParameter);
        CalculateChoteiResult choteiResult = manager.caluculateChotei(調定日時, 賦課の情報_設定後,
                徴収方法の情報, 年額保険料, 資格の情報);
        FukaJoho 賦課の情報_更正後 = choteiResult.get賦課情報();
        ChoshuHoho 徴収方法の情報_更正後 = choteiResult.get徴収方法情報();
        FukaJohoBuilder fukaBuilder = 賦課の情報_更正後.createBuilderForEdit();
        fukaBuilder.set被保険者番号(資格の情報.get被保険者番号())
                .set調定日時(調定日時)
                .set異動基準日時(調定日時)
                .set徴収方法履歴番号(徴収方法の情報.get履歴番号() + INDEX_1)
                .set職権区分(ShokkenKubun.非該当.getコード())
                .set特徴歳出還付額(Decimal.ZERO)
                .set普徴歳出還付額(Decimal.ZERO)
                .set減免額(Decimal.ONE);
        if (manager.is普徴期別がZERO(賦課の情報_更正後)) {
            fukaBuilder.set口座区分(KozaKubun.現金納付.getコード());
        } else {
            if (!口座List.isEmpty()) {
                fukaBuilder.set口座区分(KozaKubun.口座振替.getコード());
            } else {
                fukaBuilder.set口座区分(KozaKubun.現金納付.getコード());
            }
        }
        HokenryoRank rank = InstanceProvider.create(HokenryoRank.class);
        List<HihokenshaDaicho> 資格の情報リスト = new ArrayList<>();
        資格の情報リスト.add(資格の情報);
        List<MonthShichoson> 月別ランク情報 = rank.get月別ランク情報(資格の情報リスト, 賦課年度);
        賦課の情報_更正後 = fukaBuilder.set賦課市町村コード(manager.get最終月の市町村コード(月別ランク情報)).build();
        賦課の情報_更正後 = 賦課の情報_更正後.createBuilderForEdit().set調定事由1(本算定賦課).build();

        DbT2002FukaJohoTempTableEntity fukaJohoTempTableEntity = new DbT2002FukaJohoTempTableEntity();
        fukaJohoTempTableEntity = manager.set一時賦課情報(fukaJohoTempTableEntity, 賦課の情報_更正後);
        fukaWriter.insert(fukaJohoTempTableEntity);

        DbT2001ChoshuHohoEntity dbT2001ChoshuHohoEntity = 徴収方法の情報_更正後.toEntity();
        dbT2001ChoshuHohoEntity.setRirekiNo(徴収方法の情報_更正後.get履歴番号() + INDEX_1);
        介護徴収方法Writer.insert(dbT2001ChoshuHohoEntity);

    }

    private FukaJoho creat出力対象(FlexibleYear 賦課年度,
            FukaJoho 賦課の情報_更正後, FukaJoho 賦課の情報_更正前, YMDHMS 調定日時,
            ChoshuHoho 徴収方法の情報_更正後, HihokenshaDaicho 資格の情報, List<TokuteiKozaRelateEntity> 口座List) {
        FukaJohoBuilder builder = 賦課の情報_更正後.createBuilderForEdit();
        builder.set被保険者番号(資格の情報.get被保険者番号());
        if (賦課の情報_更正前 == null) {
            builder.set履歴番号(INDEX_0);
        } else if (manager.is変化有り(賦課の情報_更正前, 賦課の情報_更正後)) {
            builder.set履歴番号(賦課の情報_更正前.get履歴番号() + INDEX_1);
        }
        builder.set調定日時(調定日時);
        builder.set異動基準日時(調定日時);
        builder.set徴収方法履歴番号(徴収方法の情報_更正後.get履歴番号() + INDEX_1);
        if (manager.is普徴期別がZERO(賦課の情報_更正後)) {
            builder.set口座区分(KozaKubun.現金納付.getコード());
        } else {
            if (!口座List.isEmpty()) {
                builder.set口座区分(KozaKubun.口座振替.getコード());
            } else {
                builder.set口座区分(KozaKubun.現金納付.getコード());
            }
        }
        builder.set職権区分(ShokkenKubun.非該当.getコード());
        HokenryoRank rank = InstanceProvider.create(HokenryoRank.class);
        List<HihokenshaDaicho> 資格の情報リスト = new ArrayList<>();
        資格の情報リスト.add(資格の情報);
        List<MonthShichoson> 月別ランク情報 = rank.get月別ランク情報(資格の情報リスト, 賦課年度);
        builder.set賦課市町村コード(manager.get最終月の市町村コード(月別ランク情報));
        if (賦課の情報_更正前 != null) {
            builder.set特徴歳出還付額(賦課の情報_更正前.get特徴歳出還付額());
            builder.set普徴歳出還付額(賦課の情報_更正前.get普徴歳出還付額());
            builder.set減免額(賦課の情報_更正前.get減免額());
        }
        賦課の情報_更正後 = builder.build();
        return 賦課の情報_更正後;
    }

}