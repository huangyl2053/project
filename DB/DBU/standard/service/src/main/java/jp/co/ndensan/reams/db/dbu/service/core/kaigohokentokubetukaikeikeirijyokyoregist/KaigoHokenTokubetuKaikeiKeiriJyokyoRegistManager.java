/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.service.core.kaigohokentokubetukaikeikeirijyokyoregist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dba.definition.message.DbaErrorMessages;
import jp.co.ndensan.reams.db.dbu.business.kaigohokentokubetukaikeikeirijyokyoregist.KaigoHokenJigyoHokokuNenpo;
import jp.co.ndensan.reams.db.dbu.business.kaigohokentokubetukaikeikeirijyokyoregist.KaigoHokenShoriDateKanri;
import jp.co.ndensan.reams.db.dbu.business.kaigohokentokubetukaikeikeirijyokyoregist.Shichoson;
import jp.co.ndensan.reams.db.dbu.entity.db.basic.DbT7021JigyoHokokuTokeiDataEntity;
import jp.co.ndensan.reams.db.dbu.entity.kaigohokentokubetukaikeikeirijyokyoregist.KaigoHokenJigyoHokokuNenpoEntity;
import jp.co.ndensan.reams.db.dbu.entity.kaigohokentokubetukaikeikeirijyokyoregist.KaigoHokenShoriDateKanriEntity;
import jp.co.ndensan.reams.db.dbu.entity.kaigohokentokubetukaikeikeirijyokyoregist.ShichosonEntity;
import jp.co.ndensan.reams.db.dbu.persistence.db.basic.DbT7021JigyoHokokuTokeiDataDac;
import jp.co.ndensan.reams.db.dbx.business.shichosonsecurityjoho.KoseiShichosonJoho;
import jp.co.ndensan.reams.db.dbx.definition.core.hokensha.TokeiTaishoKubun;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.DonyuKeitaiCode;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.GyomuBunrui;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.db.dbx.service.ShichosonSecurityJoho;
import jp.co.ndensan.reams.db.dbz.business.core.koikizenshichosonjoho.KoikiZenShichosonJoho;
import jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.kyotsu.JigyoHokokuNenpoShoriName;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7022ShoriDateKanriEntity;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT7022ShoriDateKanriDac;
import jp.co.ndensan.reams.db.dbz.service.KyuShichosonCode;
import jp.co.ndensan.reams.db.dbz.service.core.basic.koikishichosonjoho.KoikiShichosonJohoFinder;
import jp.co.ndensan.reams.db.dbz.service.core.gappeijoho.gappeijoho.GappeiCityJohoBFinder;
import jp.co.ndensan.reams.db.dbz.service.kyushichosoncode.KyuShichosonCodeJoho;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.ApplicationException;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 *
 * 介護保険特別会計経理状況登録Managerクラスです。
 */
public class KaigoHokenTokubetuKaikeiKeiriJyokyoRegistManager {

    /**
     * コンストラクタです。
     *
     */
    public KaigoHokenTokubetuKaikeiKeiriJyokyoRegistManager() {
    }

    /**
     * 市町村のリスト取得
     *
     * @return 市町村Entiyリスト
     * @throws ApplicationException ①　市町村セキュリティ情報を取得できなかった場合（URZErrMesage．存在しない：市町村セキュリティ情報が存在しません。）
     * @throws ApplicationException ②　合併情報区分を取得できなかった場合（URZErrMesage．存在しない：合併情報区分が存在しません。）
     * @throws ApplicationException ③　現市町村情報取得できなかった場合（URZErrMesage．存在しない：現市町村情報が存在しません。）
     * @throws ApplicationException ④　全市町村情報取得できなかった場合（URZErrMesage．存在しない：全市町村情報が存在しません。）
     * @throws ApplicationException ⑤　旧市町村コード情報取得できなかった場合（URZErrMesage．存在しない：旧市町村コード情報が存在しません。）
     * @throws ApplicationException ⑥　広域、市町村識別ID＝「00以外」の場合（DBAE00026：広域構成市町村からの補正処理は行えません。）
     *
     */
    public List<Shichoson> getShichosonCodeNameList() {
        ShichosonSecurityJoho shichosonsecurityjoho = ShichosonSecurityJoho.getShichosonSecurityJoho(GyomuBunrui.介護事務);
        Code 導入形態コード = Code.EMPTY;
        KoseiShichosonJoho 市町村情報 = new KoseiShichosonJoho();
        if (shichosonsecurityjoho != null && shichosonsecurityjoho.get市町村情報() != null) {
            導入形態コード = shichosonsecurityjoho.get導入形態コード();
            市町村情報 = shichosonsecurityjoho.get市町村情報();
        } else {
            throw new ApplicationException(UrErrorMessages.存在しない.getMessage().replace("市町村セキュリティ情報"));
        }

        GappeiCityJohoBFinder gappeicityjohobfinder = GappeiCityJohoBFinder.createInstance();
        RString 合併情報区分 = gappeicityjohobfinder.getGappeijohokubun();
        if (合併情報区分 == null) {
            throw new ApplicationException(UrErrorMessages.存在しない.getMessage().replace("合併情報区分"));
        }

        List<Shichoson> shichosonlist = new ArrayList<>();
        if (DonyuKeitaiCode.事務広域.getCode().equals(導入形態コード.getColumnValue())
                || DonyuKeitaiCode.認定広域.getCode().equals(導入形態コード.getColumnValue())) {
            if (new RString("0").equals(合併情報区分)) {
                if (new RString("00").equals(市町村情報.get市町村識別ID())) {
                    ShichosonEntity shichosonEntity1件目 = new ShichosonEntity(市町村情報.get市町村コード(), 市町村情報.get市町村名称(),
                            市町村情報.get証記載保険者番号(), TokeiTaishoKubun.保険者分);
                    Shichoson shichoson1件目 = new Shichoson(shichosonEntity1件目);
                    shichosonlist.add(shichoson1件目);

                    KoikiShichosonJohoFinder koikishichosonjohofinder = KoikiShichosonJohoFinder.createInstance();
                    List<KoikiZenShichosonJoho> koseiShichosonMasterEntityList = koikishichosonjohofinder.getGenShichosonJoho().records();
                    if (koseiShichosonMasterEntityList == null || koseiShichosonMasterEntityList.isEmpty()) {
                        throw new ApplicationException(UrErrorMessages.存在しない.getMessage().replace("現市町村情報"));
                    } else {
                        for (KoikiZenShichosonJoho koseiShichosonMasterEntity : koseiShichosonMasterEntityList) {
                            ShichosonEntity shichosonEntity = new ShichosonEntity(koseiShichosonMasterEntity.get市町村コード(),
                                    koseiShichosonMasterEntity.get市町村名称(),
                                    koseiShichosonMasterEntity.get証記載保険者番号(),
                                    TokeiTaishoKubun.構成市町村分);
                            Shichoson shichoson = new Shichoson(shichosonEntity);
                            shichosonlist.add(shichoson);
                        }
                    }
                    return shichosonlist;
                } else {
                    throw new ApplicationException(DbaErrorMessages.広域構成市町村からの補正処理.getMessage());
                }
            } else if (new RString("1").equals(合併情報区分)) {
                if (new RString("00").equals(市町村情報.get市町村識別ID())) {
                    ShichosonEntity shichosonEntity1件目 = new ShichosonEntity(市町村情報.get市町村コード(), 市町村情報.get市町村名称(),
                            市町村情報.get証記載保険者番号(), TokeiTaishoKubun.保険者分);
                    Shichoson shichoson1件目 = new Shichoson(shichosonEntity1件目);
                    shichosonlist.add(shichoson1件目);

                    KoikiShichosonJohoFinder koikishichosonjohofinder = KoikiShichosonJohoFinder.createInstance();
                    List<KoikiZenShichosonJoho> DbT7051KoseiShichosonMasterEntitylist = koikishichosonjohofinder.getZenShichosonJoho().records();
                    if (DbT7051KoseiShichosonMasterEntitylist == null || DbT7051KoseiShichosonMasterEntitylist.isEmpty()) {
                        throw new ApplicationException(UrErrorMessages.存在しない.getMessage().replace("全市町村情報"));
                    } else {
                        for (KoikiZenShichosonJoho DbT7051KoseiShichosonMasterEntity : DbT7051KoseiShichosonMasterEntitylist) {
                            ShichosonEntity shichosonEntity;
                            Shichoson shichoson;
                            if (new RString("0").equals(DbT7051KoseiShichosonMasterEntity.get合併旧市町村区分())) {
                                shichosonEntity = new ShichosonEntity(DbT7051KoseiShichosonMasterEntity.get市町村コード(),
                                        DbT7051KoseiShichosonMasterEntity.get市町村名称(),
                                        DbT7051KoseiShichosonMasterEntity.get証記載保険者番号(),
                                        TokeiTaishoKubun.構成市町村分);
                                shichoson = new Shichoson(shichosonEntity);
                                shichosonlist.add(shichoson);
                            } else if (new RString("1").equals(DbT7051KoseiShichosonMasterEntity.get合併旧市町村区分())) {
                                shichosonEntity = new ShichosonEntity(DbT7051KoseiShichosonMasterEntity.get市町村コード(),
                                        DbT7051KoseiShichosonMasterEntity.get市町村名称(),
                                        DbT7051KoseiShichosonMasterEntity.get証記載保険者番号(),
                                        TokeiTaishoKubun.旧市町村分);
                                shichoson = new Shichoson(shichosonEntity);
                                shichosonlist.add(shichoson);
                            }
                        }
                    }
                    return shichosonlist;
                } else {
                    throw new ApplicationException(DbaErrorMessages.該当資格異動情報なし.getMessage().replace("広域構成市町村からの補正処理は行えません。"));
                }
            }
        } else {
            ShichosonEntity shichosonEntity1件目;
            if (new RString("0").equals(合併情報区分)) {
                shichosonEntity1件目 = new ShichosonEntity(市町村情報.get市町村コード(), 市町村情報.get市町村名称(),
                        市町村情報.get証記載保険者番号(), TokeiTaishoKubun.保険者分);
                Shichoson shichoson1件目 = new Shichoson(shichosonEntity1件目);
                shichosonlist.add(shichoson1件目);
            } else if (new RString("1").equals(合併情報区分)) {
                shichosonEntity1件目 = new ShichosonEntity(市町村情報.get市町村コード(), 市町村情報.get市町村名称(),
                        市町村情報.get証記載保険者番号(), TokeiTaishoKubun.保険者分);
                Shichoson shichoson1件目 = new Shichoson(shichosonEntity1件目);
                shichosonlist.add(shichoson1件目);
                KyuShichosonCodeJoho kyuShichosonCodeJoho = KyuShichosonCode.getKyuShichosonCodeJoho(市町村情報.get市町村コード(),
                        DonyuKeitaiCode.toValue(導入形態コード.getColumnValue()));
                List<KyuShichosonCode> 旧市町村コード情報List = kyuShichosonCodeJoho.get旧市町村コード情報List();
                if (null == 旧市町村コード情報List || 旧市町村コード情報List.isEmpty()) {
                    throw new ApplicationException(UrErrorMessages.存在しない.getMessage().replace("旧市町村コード情報"));
                } else {
                    for (KyuShichosonCode 旧市町村コード情報 : 旧市町村コード情報List) {
                        ShichosonEntity shichosonEntity = new ShichosonEntity(旧市町村コード情報.get旧市町村コード(), 旧市町村コード情報.get旧市町村名称(),
                                new ShoKisaiHokenshaNo(旧市町村コード情報.get旧保険者番号().getColumnValue()), TokeiTaishoKubun.旧市町村分);
                        Shichoson shichoson = new Shichoson(shichosonEntity);
                        shichosonlist.add(shichoson);
                    }
                }
            }
        }
        return shichosonlist;
    }

    /**
     * 保険者情報取得
     *
     * @param 市町村コード 市町村コード
     * @return 市町村Entiy
     */
    public Shichoson getHokenshaJoho(LasdecCode 市町村コード) {
        List<Shichoson> shichosonlist = getShichosonCodeNameList();
        Iterator<Shichoson> shichoson = shichosonlist.iterator();
        while (shichoson.hasNext()) {
            Shichoson 市町村 = shichoson.next();
            if (市町村コード.equals(市町村.get市町村コード())) {
                return 市町村;
            }
        }
        return null;
    }

    /**
     * 介護保険特別会計経理状況一覧データの取得
     *
     * @param 年度 年度
     * @param 市町村コード 市町村コード
     * @param 保険者区分 保険者区分
     * @return 事業報告集計一覧データリスト
     */
    public List<KaigoHokenJigyoHokokuNenpo> getJigyoHokokuNenpoList(FlexibleYear 年度, LasdecCode 市町村コード, TokeiTaishoKubun 保険者区分) {

        List<KaigoHokenJigyoHokokuNenpo> kaigoHokenJigyoHokokuNenpoList = new ArrayList<>();
        if (年度 != null || 保険者区分 != null || 市町村コード != null) {
            DbT7021JigyoHokokuTokeiDataDac dbT7021Dac = InstanceProvider.create(DbT7021JigyoHokokuTokeiDataDac.class);
            List<DbT7021JigyoHokokuTokeiDataEntity> dbT7021EntityList = dbT7021Dac.selectKaigoHokenTokeiDataList(年度, 市町村コード, 保険者区分);
            for (DbT7021JigyoHokokuTokeiDataEntity jigyoHokokuTokeiDataEntity : dbT7021EntityList) {
                Map<RString, Decimal> 詳細データエリア = new HashMap<>();
                詳細データエリア.put(getMapKey(jigyoHokokuTokeiDataEntity.getTateNo(), jigyoHokokuTokeiDataEntity.getYokoNo()),
                        jigyoHokokuTokeiDataEntity.getShukeiKekkaAtai());
                KaigoHokenJigyoHokokuNenpoEntity kaigoHokenJigyoHokokuNenpoEntity = new KaigoHokenJigyoHokokuNenpoEntity(
                        jigyoHokokuTokeiDataEntity.getHokokuYSeireki(),
                        jigyoHokokuTokeiDataEntity.getHokokuM(),
                        jigyoHokokuTokeiDataEntity.getShukeiTaishoYSeireki(),
                        jigyoHokokuTokeiDataEntity.getShukeiTaishoM(),
                        jigyoHokokuTokeiDataEntity.getToukeiTaishoKubun(),
                        jigyoHokokuTokeiDataEntity.getShichosonCode(),
                        jigyoHokokuTokeiDataEntity.getHyoNo(),
                        jigyoHokokuTokeiDataEntity.getShukeiNo(),
                        jigyoHokokuTokeiDataEntity.getShukeiTani(),
                        jigyoHokokuTokeiDataEntity.getShukeiKomokuMeisho(),
                        jigyoHokokuTokeiDataEntity.getTateKomokuCode(),
                        jigyoHokokuTokeiDataEntity.getYokoKomokuCode(),
                        詳細データエリア);
                kaigoHokenJigyoHokokuNenpoList.add(new KaigoHokenJigyoHokokuNenpo(kaigoHokenJigyoHokokuNenpoEntity));
            }
        }
        return kaigoHokenJigyoHokokuNenpoList;
    }

    private RString getMapKey(Decimal 縦番号, Decimal 横番号) {
        if (null == 縦番号 || null == 横番号) {
            return RString.EMPTY;
        }
        return new RString(縦番号.toString()).concat(new RString("_")).concat(new RString(横番号.toString()));
    }

    /**
     * 介護保険特別会計経理状況詳細データの取得
     *
     * @param 報告年 報告年
     * @param 集計対象年 集計対象年
     * @param 統計対象区分 統計対象区分
     * @param 市町村コード 市町村コード
     * @param 集計番号 集計番号
     * @return 事業報告集計一覧データEntityリスト
     */
    public List<KaigoHokenJigyoHokokuNenpo> getJigyoHokokuNenpoDetal(FlexibleYear 報告年, RString 集計対象年, RString 統計対象区分,
            LasdecCode 市町村コード, RString 集計番号) {

        List<KaigoHokenJigyoHokokuNenpo> kaigoHokenJigyoHokokuNenpoList = new ArrayList<>();
        DbT7021JigyoHokokuTokeiDataDac dbT7021dac = InstanceProvider.create(DbT7021JigyoHokokuTokeiDataDac.class);
        List<DbT7021JigyoHokokuTokeiDataEntity> dbT7021EntityList
                = dbT7021dac.selectKaigoHokenTokeiData(報告年, 集計対象年, 統計対象区分, 市町村コード, 集計番号);
        if (!dbT7021EntityList.isEmpty()) {
            DbT7021JigyoHokokuTokeiDataEntity jigyoHokokuTokeiDataEntity = dbT7021EntityList.get(0);
            Map<RString, Decimal> 詳細データエリア = new HashMap<>();
            for (DbT7021JigyoHokokuTokeiDataEntity jigyoHokokuTokeiData : dbT7021EntityList) {
                詳細データエリア.put(getMapKey(jigyoHokokuTokeiData.getTateNo(), jigyoHokokuTokeiData.getYokoNo()),
                        jigyoHokokuTokeiData.getShukeiKekkaAtai());
            }
            KaigoHokenJigyoHokokuNenpoEntity kaigoHokenJigyoHokokuNenpoEntity = new KaigoHokenJigyoHokokuNenpoEntity(
                    jigyoHokokuTokeiDataEntity.getHokokuYSeireki(),
                    jigyoHokokuTokeiDataEntity.getHokokuM(),
                    jigyoHokokuTokeiDataEntity.getShukeiTaishoYSeireki(),
                    jigyoHokokuTokeiDataEntity.getShukeiTaishoM(),
                    jigyoHokokuTokeiDataEntity.getToukeiTaishoKubun(),
                    jigyoHokokuTokeiDataEntity.getShichosonCode(),
                    jigyoHokokuTokeiDataEntity.getHyoNo(),
                    jigyoHokokuTokeiDataEntity.getShukeiNo(),
                    jigyoHokokuTokeiDataEntity.getShukeiTani(),
                    jigyoHokokuTokeiDataEntity.getShukeiKomokuMeisho(),
                    jigyoHokokuTokeiDataEntity.getTateKomokuCode(),
                    jigyoHokokuTokeiDataEntity.getYokoKomokuCode(),
                    詳細データエリア);
            KaigoHokenJigyoHokokuNenpo kaigoHokenJigyoHokokuNenpo = new KaigoHokenJigyoHokokuNenpo(kaigoHokenJigyoHokokuNenpoEntity);
            kaigoHokenJigyoHokokuNenpoList.add(kaigoHokenJigyoHokokuNenpo);
        }
        return kaigoHokenJigyoHokokuNenpoList;
    }

    /**
     * 介護保険特別会計経理状況詳細データの新規
     *
     * @param kaigoHokenJigyoHokokuNenpoList 事業報告集計一覧データリスト
     * @return 新規件数
     */
    public int regKaigoHokenTokubetuKaikeiKeiriJyokyo(List<KaigoHokenJigyoHokokuNenpo> kaigoHokenJigyoHokokuNenpoList) {

        int 新規件数 = insertJigyoHokokuNenpoData(kaigoHokenJigyoHokokuNenpoList);

        KaigoHokenShoriDateKanriEntity kaigoHokenShoriDateKanriEntity = new KaigoHokenShoriDateKanriEntity(
                SubGyomuCode.DBU介護統計報告,
                kaigoHokenJigyoHokokuNenpoList.get(0).get市町村コード(),
                JigyoHokokuNenpoShoriName.事業状況報告資料_年報_作成特別会計経理状況,
                new RString("00"),
                kaigoHokenJigyoHokokuNenpoList.get(0).get集計対象年(),
                new RString("00"),
                null,
                RDate.getNowDateTime(),
                new FlexibleDate(kaigoHokenJigyoHokokuNenpoList.get(0).get集計対象年().getYearValue(), 04, 01),
                new FlexibleDate(kaigoHokenJigyoHokokuNenpoList.get(0).get集計対象年().getYearValue() + 1, 03, 31),
                null,
                null);
        新規件数 = 新規件数 + insertShoriDateKanri(new KaigoHokenShoriDateKanri(kaigoHokenShoriDateKanriEntity));
        return 新規件数;
    }

    /**
     * 介護保険特別会計経理状況詳細データの修正新規
     *
     * @param kaigoHokenJigyoHokokuNenpoList 事業報告集計一覧データEntityリスト
     * @return 処理件数
     */
    public int regUpdKaigoHokenTokubetuKaikeiKeiriJyokyo(List<KaigoHokenJigyoHokokuNenpo> kaigoHokenJigyoHokokuNenpoList) {

        int 処理件数 = insertJigyoHokokuNenpoData(kaigoHokenJigyoHokokuNenpoList);

        KaigoHokenShoriDateKanriEntity kaigoHokenShoriDateKanriEntity = new KaigoHokenShoriDateKanriEntity(
                SubGyomuCode.DBU介護統計報告,
                kaigoHokenJigyoHokokuNenpoList.get(0).get市町村コード(),
                JigyoHokokuNenpoShoriName.事業状況報告資料_年報_作成特別会計経理状況,
                new RString("00"),
                kaigoHokenJigyoHokokuNenpoList.get(0).get集計対象年(),
                new RString("00"),
                null,
                RDate.getNowDateTime(),
                null,
                null,
                null,
                null);

        処理件数 = 処理件数 + updateShoriDateKanri(new KaigoHokenShoriDateKanri(kaigoHokenShoriDateKanriEntity));
        return 処理件数;
    }

    /**
     * 介護保険特別会計経理状況詳細データの更新
     *
     * @param kaigoHokenJigyoHokokuNenpoList 事業報告集計一覧データEntityリスト
     * @return 更新件数
     */
    public int updKaigoHokenTokubetuKaikeiKeiriJyokyo(List<KaigoHokenJigyoHokokuNenpo> kaigoHokenJigyoHokokuNenpoList) {

        int 更新件数 = updateJigyoHokokuNenpoData(kaigoHokenJigyoHokokuNenpoList);

        KaigoHokenShoriDateKanriEntity kaigoHokenShoriDateKanriEntity = new KaigoHokenShoriDateKanriEntity(
                SubGyomuCode.DBU介護統計報告,
                kaigoHokenJigyoHokokuNenpoList.get(0).get市町村コード(),
                JigyoHokokuNenpoShoriName.事業状況報告資料_年報_作成特別会計経理状況,
                new RString("00"),
                kaigoHokenJigyoHokokuNenpoList.get(0).get集計対象年(),
                new RString("00"),
                null,
                RDate.getNowDateTime(),
                null,
                null,
                null,
                null);
        更新件数 = 更新件数 + updateShoriDateKanri(new KaigoHokenShoriDateKanri(kaigoHokenShoriDateKanriEntity));
        return 更新件数;
    }

    /**
     * 介護保険特別会計経理状況詳細データの削除
     *
     * @param 報告年 報告年
     * @param 集計対象年 集計対象年
     * @param 統計対象区分 統計対象区分
     * @param 市町村コード 市町村コード
     * @param 表番号 表番号
     * @param 集計番号 集計番号
     * @return 削除件数
     */
    public int delKaigoHokenTokubetuKaikeiKeiriJyokyo(FlexibleYear 報告年, FlexibleYear 集計対象年, RString 統計対象区分,
            LasdecCode 市町村コード, Code 表番号, Code 集計番号) {

        int 削除件数 = 0;
        //事業報告年報の削除処理
        KaigoHokenShoriDateKanriEntity kaigoHokenShoriDateKanriEntity = new KaigoHokenShoriDateKanriEntity(
                SubGyomuCode.DBU介護統計報告,
                市町村コード,
                JigyoHokokuNenpoShoriName.事業状況報告資料_年報_作成特別会計経理状況,
                new RString("00"),
                集計対象年,
                new RString("00"),
                null,
                RDate.getNowDateTime(),
                null,
                null,
                null,
                null);

        削除件数 = 削除件数 + updateShoriDateKanri(new KaigoHokenShoriDateKanri(kaigoHokenShoriDateKanriEntity));
        return 削除件数;
    }

    /**
     * 事業報告年報集計データ登録処理
     *
     * @param kaigoHokenJigyoHokokuNenpoList 事業報告集計一覧データリスト
     * @return 新規件数
     */
    public int insertJigyoHokokuNenpoData(List<KaigoHokenJigyoHokokuNenpo> kaigoHokenJigyoHokokuNenpoList) {
        DbT7021JigyoHokokuTokeiDataDac dbT7021Dac = InstanceProvider.create(DbT7021JigyoHokokuTokeiDataDac.class);
        int count = 0;
        for (KaigoHokenJigyoHokokuNenpo kaigoHokenJigyoHokokuNenpo : kaigoHokenJigyoHokokuNenpoList) {
            Map<RString, Decimal> 詳細データエリア = kaigoHokenJigyoHokokuNenpo.get詳細データエリア();
            for (Map.Entry<RString, Decimal> 詳細データエリアMapEntry : 詳細データエリア.entrySet()) {
                DbT7021JigyoHokokuTokeiDataEntity dbT7021JigyoHokokuTokeiDataEntity = new DbT7021JigyoHokokuTokeiDataEntity();
                dbT7021JigyoHokokuTokeiDataEntity.setHokokuYSeireki(kaigoHokenJigyoHokokuNenpo.get報告年());
                dbT7021JigyoHokokuTokeiDataEntity.setHokokuM(new RString("00"));
                dbT7021JigyoHokokuTokeiDataEntity.setShukeiTaishoYSeireki(kaigoHokenJigyoHokokuNenpo.get集計対象年());
                dbT7021JigyoHokokuTokeiDataEntity.setShukeiTaishoM(new RString("00"));
                dbT7021JigyoHokokuTokeiDataEntity.setToukeiTaishoKubun(kaigoHokenJigyoHokokuNenpo.get統計対象区分());
                dbT7021JigyoHokokuTokeiDataEntity.setShichosonCode(kaigoHokenJigyoHokokuNenpo.get市町村コード());
                dbT7021JigyoHokokuTokeiDataEntity.setHyoNo(new Code("09"));
                dbT7021JigyoHokokuTokeiDataEntity.setShukeiNo(new Code("0100"));
                dbT7021JigyoHokokuTokeiDataEntity.setShukeiTani(new Code("1"));
                dbT7021JigyoHokokuTokeiDataEntity.setTateNo(get縦横番号(詳細データエリアMapEntry.getKey(), 0));
                dbT7021JigyoHokokuTokeiDataEntity.setYokoNo(get縦横番号(詳細データエリアMapEntry.getKey(), 1));
                dbT7021JigyoHokokuTokeiDataEntity.setShukeiKekkaAtai(詳細データエリアMapEntry.getValue());
                dbT7021JigyoHokokuTokeiDataEntity.setState(EntityDataState.Added);
                count = count + dbT7021Dac.save(dbT7021JigyoHokokuTokeiDataEntity);
            }
        }
        return count;
    }

    private Decimal get縦横番号(RString mapKey, int 縦横区分) {
        return new Decimal(mapKey.split("_").get(縦横区分).toString());
    }

    /**
     * 事業報告年報集計データ更新処理
     *
     * @param kaigoHokenJigyoHokokuNenpoList 事業報告集計一覧データリスト
     * @return 更新件数
     */
    public int updateJigyoHokokuNenpoData(List<KaigoHokenJigyoHokokuNenpo> kaigoHokenJigyoHokokuNenpoList) {
        DbT7021JigyoHokokuTokeiDataDac jigyoHokokuTokeiDataDac = InstanceProvider.create(DbT7021JigyoHokokuTokeiDataDac.class);
        int 更新件数 = 0;
        for (KaigoHokenJigyoHokokuNenpo kaigoHokenJigyoHokokuNenpo : kaigoHokenJigyoHokokuNenpoList) {
            Map<RString, Decimal> 詳細データエリア = kaigoHokenJigyoHokokuNenpo.get詳細データエリア();
            for (Map.Entry<RString, Decimal> 詳細データエリアMapEntry : 詳細データエリア.entrySet()) {
                DbT7021JigyoHokokuTokeiDataEntity dbT7021JigyoHokokuTokeiDataEntity = jigyoHokokuTokeiDataDac
                        .selectByKey(kaigoHokenJigyoHokokuNenpo.get報告年(), kaigoHokenJigyoHokokuNenpo.get報告月(),
                                kaigoHokenJigyoHokokuNenpo.get集計対象年(), kaigoHokenJigyoHokokuNenpo.get集計対象月(),
                                kaigoHokenJigyoHokokuNenpo.get統計対象区分(), kaigoHokenJigyoHokokuNenpo.get市町村コード(),
                                kaigoHokenJigyoHokokuNenpo.get表番号(), kaigoHokenJigyoHokokuNenpo.get集計番号(),
                                kaigoHokenJigyoHokokuNenpo.get集計単位(), get縦横番号(詳細データエリアMapEntry.getKey(), 0),
                                get縦横番号(詳細データエリアMapEntry.getKey(), 1));

                dbT7021JigyoHokokuTokeiDataEntity.setShukeiKekkaAtai(詳細データエリアMapEntry.getValue());
                dbT7021JigyoHokokuTokeiDataEntity.setState(EntityDataState.Modified);
                更新件数 = 更新件数 + jigyoHokokuTokeiDataDac.save(dbT7021JigyoHokokuTokeiDataEntity);
            }
        }
        return 更新件数;
    }

    /**
     * 事業報告年報集計データ削除処理
     *
     * @param 報告年 報告年
     * @param 集計対象年 集計対象年
     * @param 統計対象区分 統計対象区分
     * @param 市町村コード 市町村コード
     * @param 表番号 表番号
     * @param 集計番号list 集計番号list
     * @return 削除件数
     */
    public int deleteJigyoHokokuNenpoData(FlexibleYear 報告年, FlexibleYear 集計対象年, RString 統計対象区分,
            LasdecCode 市町村コード, Code 表番号, List<Code> 集計番号list) {
        int 削除件数 = 0;
        Iterator<Code> it = 集計番号list.iterator();
        DbT7021JigyoHokokuTokeiDataDac dbT7021JigyoHokokuTokeiDataDac = InstanceProvider.create(DbT7021JigyoHokokuTokeiDataDac.class);
        while (it.hasNext()) {
            DbT7021JigyoHokokuTokeiDataEntity dbT7021JigyoHokokuTokeiDataEntity = new DbT7021JigyoHokokuTokeiDataEntity();
            dbT7021JigyoHokokuTokeiDataEntity.setHokokuYSeireki(報告年);
            dbT7021JigyoHokokuTokeiDataEntity.setHokokuM(new RString("00"));
            dbT7021JigyoHokokuTokeiDataEntity.setShukeiTaishoYSeireki(集計対象年);
            dbT7021JigyoHokokuTokeiDataEntity.setShukeiTaishoM(new RString("00"));
            dbT7021JigyoHokokuTokeiDataEntity.setToukeiTaishoKubun(統計対象区分);
            dbT7021JigyoHokokuTokeiDataEntity.setShichosonCode(市町村コード);
            dbT7021JigyoHokokuTokeiDataEntity.setHyoNo(表番号);
            dbT7021JigyoHokokuTokeiDataEntity.setShukeiNo(it.next());
            dbT7021JigyoHokokuTokeiDataEntity.setState(EntityDataState.Deleted);
            削除件数 = 削除件数 + dbT7021JigyoHokokuTokeiDataDac.save(dbT7021JigyoHokokuTokeiDataEntity);
        }
        return 削除件数;
    }

    /**
     * 処理日付管理マスタ登録処理
     *
     * @param kaigoHokenShoriDateKanriEntity 処理日付管理マスタEntity
     * @return 新規件数
     */
    public int insertShoriDateKanri(KaigoHokenShoriDateKanri kaigoHokenShoriDateKanriEntity) {

        DbT7022ShoriDateKanriEntity dbT7022ShoriDateKanriEntity = new DbT7022ShoriDateKanriEntity();
        dbT7022ShoriDateKanriEntity.setSubGyomuCode(kaigoHokenShoriDateKanriEntity.getサブ業務コード());
        dbT7022ShoriDateKanriEntity.setShichosonCode(kaigoHokenShoriDateKanriEntity.get市町村コード());
        dbT7022ShoriDateKanriEntity.setShoriName(new RString(kaigoHokenShoriDateKanriEntity.get処理名().toString()));
        dbT7022ShoriDateKanriEntity.setShoriEdaban(kaigoHokenShoriDateKanriEntity.get処理枝番());
        dbT7022ShoriDateKanriEntity.setNendo(kaigoHokenShoriDateKanriEntity.get年度());
        dbT7022ShoriDateKanriEntity.setNendoNaiRenban(kaigoHokenShoriDateKanriEntity.get年度内連番());
        dbT7022ShoriDateKanriEntity.setKijunTimestamp(new YMDHMS(kaigoHokenShoriDateKanriEntity.get基準日時()));
        dbT7022ShoriDateKanriEntity.setTaishoKaishiYMD(kaigoHokenShoriDateKanriEntity.get対象開始年月日());
        dbT7022ShoriDateKanriEntity.setTaishoShuryoYMD(kaigoHokenShoriDateKanriEntity.get対象終了年月日());
        dbT7022ShoriDateKanriEntity.setTaishoKaishiTimestamp(kaigoHokenShoriDateKanriEntity.get対象開始日時());
        dbT7022ShoriDateKanriEntity.setTaishoShuryoTimestamp(kaigoHokenShoriDateKanriEntity.get対象終了日時());
        DbT7022ShoriDateKanriDac horiDateKanriDac = InstanceProvider.create(DbT7022ShoriDateKanriDac.class);
        dbT7022ShoriDateKanriEntity.setState(EntityDataState.Added);
        int 新規件数 = horiDateKanriDac.save(dbT7022ShoriDateKanriEntity);
        return 新規件数;
    }

    /**
     * 処理日付管理マスタ更新処理
     *
     * @param kaigoHokenShoriDateKanriEntity 処理日付管理マスタEntity
     * @return 新規件数
     */
    public int updateShoriDateKanri(KaigoHokenShoriDateKanri kaigoHokenShoriDateKanriEntity) {
        DbT7022ShoriDateKanriDac horiDateKanriDac = InstanceProvider.create(DbT7022ShoriDateKanriDac.class);
        DbT7022ShoriDateKanriEntity dbT7022ShoriDateKanriEntity = horiDateKanriDac.selectByKey(kaigoHokenShoriDateKanriEntity.getサブ業務コード(),
                kaigoHokenShoriDateKanriEntity.get市町村コード(), new RString(kaigoHokenShoriDateKanriEntity.get処理名().toString()),
                kaigoHokenShoriDateKanriEntity.get処理枝番(), kaigoHokenShoriDateKanriEntity.get年度(), kaigoHokenShoriDateKanriEntity.get年度内連番());

        dbT7022ShoriDateKanriEntity.setKijunTimestamp(new YMDHMS(kaigoHokenShoriDateKanriEntity.get基準日時()));

        dbT7022ShoriDateKanriEntity.setState(EntityDataState.Modified);
        int 新規件数 = horiDateKanriDac.save(dbT7022ShoriDateKanriEntity);
        return 新規件数;
    }
}
