/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.service.core.hihokenshashoShikakushoHakko;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dba.definition.core.hihokenshoshikakushohakko.HihokenshoShikakushoHakkoMapperParameter;
import static jp.co.ndensan.reams.db.dba.definition.core.hihokenshoshikakushohakko.HihokenshoShikakushoHakkoMapperParameter.createParam;
import jp.co.ndensan.reams.db.dba.entity.db.hihokenshoshikakushohakko.HihokenshoShikakushoHakkoEntity;
import jp.co.ndensan.reams.db.dba.entity.db.hihokenshoshikakushohakko.KaigoHokenShisetsuNyutaishoEntity;
import jp.co.ndensan.reams.db.dba.entity.db.hihokenshoshikakushohakko.KyotakuKeikakuTodokedeEntity;
import jp.co.ndensan.reams.db.dba.entity.db.hihokenshoshikakushohakko.ShiharaiHohoHenkoEntity;
import jp.co.ndensan.reams.db.dba.persistence.db.mapper.relate.hihokenshoshikakushohakko.IHihokenshoShikakushoHakkoMapper;
import jp.co.ndensan.reams.db.dbd.definition.enumeratedtype.core.ShiharaiHenkoKanriKubun;
import jp.co.ndensan.reams.db.dbd.definition.enumeratedtype.core.YukoMukoKubun;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.kaigojigyosha.DbT7060KaigoJigyosha;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.kaigojigyosha.DbT7060KaigoJigyoshaEntity;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.kaigojigyosha.DbT7130KaigoServiceShurui;
import static jp.co.ndensan.reams.db.dbx.entity.db.basic.kaigojigyosha.DbT7130KaigoServiceShurui.serviceShuruiCd;
import static jp.co.ndensan.reams.db.dbx.entity.db.basic.kaigojigyosha.DbT7130KaigoServiceShurui.teikyoKaishiYM;
import static jp.co.ndensan.reams.db.dbx.entity.db.basic.kaigojigyosha.DbT7130KaigoServiceShurui.teikyoshuryoYM;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.kaigojigyosha.DbT7130KaigoServiceShuruiEntity;
import jp.co.ndensan.reams.db.dbx.service.core.koseishichoson.KoikiShichosonJohoFinder;
import jp.co.ndensan.reams.db.dbx.service.core.shichosonsecurity.ShichosonSecurityJohoFinder;
import jp.co.ndensan.reams.db.dbz.definition.core.enumeratedtype.ShisetsuType;
import jp.co.ndensan.reams.db.dbz.definition.core.enumeratedtype.configkeys.ConfigKeysShiharaiHohoHenko;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1001HihokenshaDaicho;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1001HihokenshaDaicho.edaNo;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1001HihokenshaDaicho.hihokenshaNo;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1001HihokenshaDaicho.idoYMD;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1001HihokenshaDaicho.logicalDeletedFlag;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1001HihokenshaDaichoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1005KaigoJogaiTokureiTaishoShisetsu;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1005KaigoJogaiTokureiTaishoShisetsuEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT4001JukyushaDaicho;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT4001JukyushaDaicho.edaban;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT4001JukyushaDaicho.rirekiNo;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT4001JukyushaDaicho.yukoMukoKubun;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT4001JukyushaDaichoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.kyotakukeikaku.DbT3006KyotakuKeikakuJigyoshaSakusei;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.kyotakukeikaku.DbT3006KyotakuKeikakuJigyoshaSakuseiEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.kyotakukeikaku.DbT3007KyotakuKeikakuJikoSakusei;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.kyotakukeikaku.DbT3007KyotakuKeikakuJikoSakuseiEntity;
import jp.co.ndensan.reams.db.dbz.service.core.MapperProvider;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.config.BusinessConfig;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import jp.co.ndensan.reams.uz.uza.util.db.Order;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.by;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.isNULL;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.leq;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.or;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 *
 * @author huangh
 */
public class HihokenshashoShikakushoHakkoFinder {

    @InjectSession
    private SqlSession session;
    private static final RString MENUID_DBUMN12001 = new RString("DBUMN12001");
    private static final RString MENUID_DBUMN12002 = new RString("DBUMN12002");
    private static final RString JIBUNSAKUSEI = new RString("自己作成");
    private final MapperProvider mapperProvider;

    /**
     * コンストラクタです。
     */
    public HihokenshashoShikakushoHakkoFinder() {
        this.mapperProvider = InstanceProvider.create(MapperProvider.class);
    }

    /**
     * インスタンスを生成します。
     *
     * @return {@link ShichosonSecurityJohoFinder}
     */
    public static HihokenshashoShikakushoHakkoFinder createInstance() {
        return InstanceProvider.create(HihokenshashoShikakushoHakkoFinder.class);
    }

    /**
     * 被保険者証資格証発行情報取得です。
     *
     * @param 被保険者番号 被保険者番号
     * @param メニューID メニューID
     * @return 被保険者証資格証発行情報取得Entity
     */
    public HihokenshoShikakushoHakkoEntity 被保険者証資格証発行情報取得(HihokenshaNo 被保険者番号, RString メニューID) {

        // SQL発行
        IHihokenshoShikakushoHakkoMapper hihokenshoShikakushoHakkoMapper = mapperProvider.create(IHihokenshoShikakushoHakkoMapper.class);

        HihokenshoShikakushoHakkoMapperParameter SQL発行Parameter
                = createParam(被保険者番号,
                        メニューID,
                        RString.EMPTY,
                        Boolean.TRUE,
                        RString.EMPTY,
                        FlexibleDate.EMPTY,
                        FlexibleDate.EMPTY,
                        RString.EMPTY,
                        FlexibleDate.EMPTY,
                        FlexibleDate.EMPTY);

        HihokenshoShikakushoHakkoEntity entity = hihokenshoShikakushoHakkoMapper.被保険者証資格証発行情報取得(SQL発行Parameter);
        // 保険者情報取得
        this.保険者情報取得(entity, 被保険者番号);

        // 指定サービス種類の取得
        this.指定サービス種類の取得(entity, 被保険者番号);

        // 限度額データ取得
        this.限度額データ取得(entity);

        // 給付制限データ取得
        this.給付制限データ取得(entity, メニューID);

        // 支援事業者データ取得
        this.支援事業者データ取得(entity);

        // 施設入退所データ取得
        this.施設入退所データ取得(entity);

        return entity;

    }

    /**
     * 被保険者証資格証発行情報取得です。
     *
     * @param HihokenshoShikakushoHakkoEntity HihokenshoShikakushoHakkoEntity
     * @param 被保険者番号 被保険者番号
     */
    private void 保険者情報取得(HihokenshoShikakushoHakkoEntity entity, HihokenshaNo 被保険者番号) {

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        DbT1001HihokenshaDaichoEntity hokenshajohoEntity = accessor.select().
                table(DbT1001HihokenshaDaicho.class).
                where(and(
                                eq(hihokenshaNo, 被保険者番号),
                                eq(logicalDeletedFlag, false))).order(by(idoYMD, Order.DESC), by(edaNo, Order.DESC)).limit(1).toObject(DbT1001HihokenshaDaichoEntity.class);

        // 「ビジネス設計_DBUMN00000_市町村情報取得_広域」の「市町村コードによる市町村情報」を呼び出し
        // TODO上記取得できる場合、広住特措置元市町村コードがNULLではない場合
        if (hokenshajohoEntity != null) {
            KoikiShichosonJohoFinder finder = KoikiShichosonJohoFinder.createInstance();
            RString 保険者名称 = RString.EMPTY;

            // 広住特措置元市町村コードがNULLではない場合
            if (!hokenshajohoEntity.getKoikinaiTokureiSochimotoShichosonCode().isEmpty()) {
                保険者名称 = finder.shichosonCodeYoriShichosonJoho(hokenshajohoEntity.getKoikinaiTokureiSochimotoShichosonCode()).get(0).getShichosonMeisho();
                entity.set市町村コード(hokenshajohoEntity.getKoikinaiTokureiSochimotoShichosonCode().value());
                entity.set保険者名称(保険者名称);
                // 住特措置元市町村コードがNULLの場合
            } else {
                保険者名称 = finder.shichosonCodeYoriShichosonJoho(hokenshajohoEntity.getShichosonCode()).get(0).getShichosonMeisho();
                entity.set市町村コード(hokenshajohoEntity.getShichosonCode().value());
                entity.set保険者名称(保険者名称);
            }
        }

    }

    /**
     * 指定サービス種類の取得
     *
     * @param HihokenshoShikakushoHakkoEntity HihokenshoShikakushoHakkoEntity
     * @param 被保険者番号 被保険者番号
     */
    private void 指定サービス種類の取得(HihokenshoShikakushoHakkoEntity entity, HihokenshaNo 被保険者番号) {

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        DbT4001JukyushaDaichoEntity jukyushaDaichoEntity = accessor.select().
                table(DbT4001JukyushaDaicho.class).
                where(and(
                                eq(hihokenshaNo, 被保険者番号),
                                eq(yukoMukoKubun, YukoMukoKubun.有効),
                                eq(logicalDeletedFlag, false))).order(by(rirekiNo, Order.DESC), by(edaban, Order.DESC)).limit(1).toObject(DbT4001JukyushaDaichoEntity.class);

        List<RString> サービス種類list = new ArrayList<>();

        サービス種類list.set(0, jukyushaDaichoEntity.getShiteiServiceShurui01().value());
        サービス種類list.set(1, jukyushaDaichoEntity.getShiteiServiceShurui02().value());
        サービス種類list.set(2, jukyushaDaichoEntity.getShiteiServiceShurui03().value());
        サービス種類list.set(3, jukyushaDaichoEntity.getShiteiServiceShurui04().value());
        サービス種類list.set(4, jukyushaDaichoEntity.getShiteiServiceShurui05().value());
        サービス種類list.set(5, jukyushaDaichoEntity.getShiteiServiceShurui06().value());
        サービス種類list.set(6, jukyushaDaichoEntity.getShiteiServiceShurui07().value());
        サービス種類list.set(7, jukyushaDaichoEntity.getShiteiServiceShurui08().value());
        サービス種類list.set(8, jukyushaDaichoEntity.getShiteiServiceShurui09().value());
        サービス種類list.set(9, jukyushaDaichoEntity.getShiteiServiceShurui10().value());
        サービス種類list.set(10, jukyushaDaichoEntity.getShiteiServiceShurui11().value());
        サービス種類list.set(11, jukyushaDaichoEntity.getShiteiServiceShurui12().value());
        サービス種類list.set(12, jukyushaDaichoEntity.getShiteiServiceShurui13().value());
        サービス種類list.set(13, jukyushaDaichoEntity.getShiteiServiceShurui14().value());
        サービス種類list.set(14, jukyushaDaichoEntity.getShiteiServiceShurui15().value());
        サービス種類list.set(15, jukyushaDaichoEntity.getShiteiServiceShurui16().value());
        サービス種類list.set(16, jukyushaDaichoEntity.getShiteiServiceShurui17().value());
        サービス種類list.set(17, jukyushaDaichoEntity.getShiteiServiceShurui18().value());
        サービス種類list.set(18, jukyushaDaichoEntity.getShiteiServiceShurui19().value());
        サービス種類list.set(19, jukyushaDaichoEntity.getShiteiServiceShurui20().value());
        サービス種類list.set(20, jukyushaDaichoEntity.getShiteiServiceShurui21().value());
        サービス種類list.set(21, jukyushaDaichoEntity.getShiteiServiceShurui22().value());
        サービス種類list.set(22, jukyushaDaichoEntity.getShiteiServiceShurui23().value());
        サービス種類list.set(23, jukyushaDaichoEntity.getShiteiServiceShurui24().value());
        サービス種類list.set(24, jukyushaDaichoEntity.getShiteiServiceShurui25().value());
        サービス種類list.set(25, jukyushaDaichoEntity.getShiteiServiceShurui26().value());
        サービス種類list.set(26, jukyushaDaichoEntity.getShiteiServiceShurui27().value());
        サービス種類list.set(27, jukyushaDaichoEntity.getShiteiServiceShurui28().value());
        サービス種類list.set(28, jukyushaDaichoEntity.getShiteiServiceShurui29().value());
        サービス種類list.set(29, jukyushaDaichoEntity.getShiteiServiceShurui30().value());

        RString 介護認定審査会意見_名称 = entity.get介護認定審査会意見();
        RString 介護認定審査会意見_略称 = entity.get介護認定審査会意見();
        for (int i = 0; i < サービス種類list.size(); i++) {

            if (サービス種類list.get(i) != null) {
                DbT7130KaigoServiceShuruiEntity kaigoServiceShuruiEntity = accessor.select().
                        table(DbT7130KaigoServiceShurui.class).
                        where(and(eq(serviceShuruiCd, サービス種類list.get(i)),
                                        leq(teikyoKaishiYM, RDate.getNowDate()),
                                        or(leq(RDate.getNowDate(), teikyoshuryoYM), isNULL(teikyoshuryoYM)))).toObject(DbT7130KaigoServiceShuruiEntity.class);

                介護認定審査会意見_名称 = 介護認定審査会意見_名称.concat(RString.FULL_SPACE).concat(kaigoServiceShuruiEntity.getServiceShuruiMeisho());
                介護認定審査会意見_略称 = 介護認定審査会意見_略称.concat(RString.FULL_SPACE).concat(kaigoServiceShuruiEntity.getServiceShuruiRyakusho());

            } else {
                break;
            }

        }

        if (介護認定審査会意見_略称.length() >= 150) {

            entity.set介護認定審査会意見(介護認定審査会意見_略称.substring(0, 150));
        } else if (介護認定審査会意見_名称.length() >= 150) {

            entity.set介護認定審査会意見(介護認定審査会意見_略称);
        } else {

            entity.set介護認定審査会意見(介護認定審査会意見_名称);
        }
    }

    /**
     * 限度額データ取得です。
     *
     * @param HihokenshoShikakushoHakkoEntity HihokenshoShikakushoHakkoEntity
     */
    private void 限度額データ取得(HihokenshoShikakushoHakkoEntity entity) {

        IHihokenshoShikakushoHakkoMapper hihokenshoShikakushoHakkoMapper = mapperProvider.create(IHihokenshoShikakushoHakkoMapper.class);

        HihokenshoShikakushoHakkoMapperParameter 限度額データ取得Parameter
                = createParam(HihokenshaNo.EMPTY,
                        RString.EMPTY,
                        RString.EMPTY,
                        Boolean.TRUE,
                        RString.EMPTY,
                        FlexibleDate.EMPTY,
                        FlexibleDate.EMPTY,
                        RString.EMPTY,
                        entity.get認定有効期間開始年月日(),
                        entity.get認定有効期間終了年月日());
        HihokenshoShikakushoHakkoEntity 限度額取得Entity = hihokenshoShikakushoHakkoMapper
                .限度額データ取得(限度額データ取得Parameter);

        entity.set支給限度単位数(限度額取得Entity.get支給限度単位数());
        entity.setServiceTypeListEntity(限度額取得Entity.getServiceTypeListEntity());
    }

    /**
     * 給付制限データ取得です。
     *
     * @param HihokenshoShikakushoHakkoEntity HihokenshoShikakushoHakkoEntity
     * @param メニューID メニューID
     *
     */
    private void 給付制限データ取得(HihokenshoShikakushoHakkoEntity entity, RString メニューID) {

        IHihokenshoShikakushoHakkoMapper hihokenshoShikakushoHakkoMapper = mapperProvider.create(IHihokenshoShikakushoHakkoMapper.class);
        List<ShiharaiHohoHenkoEntity> shiharaiHohoHenkoList = hihokenshoShikakushoHakkoMapper.支払方法変更の情報取得();

        for (int i = 0; i < shiharaiHohoHenkoList.size(); i++) {

            if (MENUID_DBUMN12001.equals(メニューID)) {
                if (ShiharaiHenkoKanriKubun._２号差止.getコード().equals(shiharaiHohoHenkoList.get(i).get管理区分())) {

                    if (i == 0) {
                        entity.set給付制限内容１(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_証表示差止_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始１(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了１(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));
                    } else if (i == 1) {
                        entity.set給付制限内容２(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_証表示差止_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始２(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了２(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));

                    } else if (i == 2) {
                        entity.set給付制限内容３(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_証表示差止_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始３(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了３(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));
                    }

                } else if (ShiharaiHenkoKanriKubun._１号償還払い化.getコード().equals(shiharaiHohoHenkoList.get(i).get管理区分())) {
                    if (i == 0) {
                        entity.set給付制限内容１(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_証表示支払方法_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始１(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了１(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));
                    } else if (i == 1) {
                        entity.set給付制限内容２(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_証表示支払方法_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始２(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了２(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));

                    } else if (i == 2) {
                        entity.set給付制限内容３(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_証表示支払方法_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始３(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了３(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));
                    }
                } else if (ShiharaiHenkoKanriKubun._１号給付額減額.getコード().equals(shiharaiHohoHenkoList.get(i).get管理区分())) {
                    if (i == 0) {
                        entity.set給付制限内容１(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_証表示減額_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始１(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了１(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));
                    } else if (i == 1) {
                        entity.set給付制限内容２(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_証表示減額_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始２(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了２(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));

                    } else if (i == 2) {
                        entity.set給付制限内容３(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_証表示減額_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始３(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了３(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));
                    }
                }
            } else if (MENUID_DBUMN12002.equals(メニューID)) {
                if (ShiharaiHenkoKanriKubun._２号差止.getコード().equals(shiharaiHohoHenkoList.get(i).get管理区分())) {

                    if (i == 0) {
                        entity.set給付制限内容１(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_資格者証表示差止_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始１(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了１(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));
                    } else if (i == 1) {
                        entity.set給付制限内容２(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_資格者証表示差止_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始２(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了２(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));

                    } else if (i == 2) {
                        entity.set給付制限内容３(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_資格者証表示差止_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始３(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了３(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));
                    }

                } else if (ShiharaiHenkoKanriKubun._１号償還払い化.getコード().equals(shiharaiHohoHenkoList.get(i).get管理区分())) {
                    if (i == 0) {
                        entity.set給付制限内容１(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_資格者証表示支払方法_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始１(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了１(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));
                    } else if (i == 1) {
                        entity.set給付制限内容２(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_資格者証表示支払方法_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始２(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了２(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));

                    } else if (i == 2) {
                        entity.set給付制限内容３(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_資格者証表示支払方法_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始３(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了３(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));
                    }
                } else if (ShiharaiHenkoKanriKubun._１号給付額減額.getコード().equals(shiharaiHohoHenkoList.get(i).get管理区分())) {
                    if (i == 0) {
                        entity.set給付制限内容１(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_資格者証表示減額_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始１(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了１(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));
                    } else if (i == 1) {
                        entity.set給付制限内容２(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_資格者証表示減額_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始２(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了２(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));

                    } else if (i == 2) {
                        entity.set給付制限内容３(BusinessConfig.get(ConfigKeysShiharaiHohoHenko.支払方法変更_資格者証表示減額_記載文言, SubGyomuCode.DBD介護受給));
                        entity.set制限期間開始３(new RString(shiharaiHohoHenkoList.get(i).get適用開始年月日().toString()));
                        entity.set制限期間終了３(new RString(shiharaiHohoHenkoList.get(i).get適用終了年月日().toString()));
                    }
                }
            }
        }
    }

    /**
     * 支援事業者データ取得。
     *
     * @param HihokenshoShikakushoHakkoEntity HihokenshoShikakushoHakkoEntity
     */
    private void 支援事業者データ取得(HihokenshoShikakushoHakkoEntity entity) {

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        IHihokenshoShikakushoHakkoMapper hihokenshoShikakushoHakkoMapper = mapperProvider.create(IHihokenshoShikakushoHakkoMapper.class);

        List<KyotakuKeikakuTodokedeEntity> kyotakuKeikakuTodokedeList = hihokenshoShikakushoHakkoMapper.居宅給付計画届出情報取得();
        int dbT3006Count = accessor.select().table(DbT3006KyotakuKeikakuJigyoshaSakusei.class).getCount();
        int dbT3007Count = accessor.select().table(DbT3007KyotakuKeikakuJikoSakusei.class).getCount();

        for (int i = 0; i < kyotakuKeikakuTodokedeList.size(); i++) {
            if (i == 0) {
                if (dbT3006Count > 0) {
                    DbT3006KyotakuKeikakuJigyoshaSakuseiEntity dbT3006KyotakuKeikakuJigyoshaSakusei = accessor.select().
                            table(DbT3006KyotakuKeikakuJigyoshaSakusei.class).
                            where(and(
                                            eq(DbT3006KyotakuKeikakuJigyoshaSakusei.hihokenshano, kyotakuKeikakuTodokedeList.get(i).get被保険者番号()),
                                            eq(DbT3006KyotakuKeikakuJigyoshaSakusei.taishoYM, kyotakuKeikakuTodokedeList.get(i).get対象年月()),
                                            eq(DbT3006KyotakuKeikakuJigyoshaSakusei.rirekiNo, kyotakuKeikakuTodokedeList.get(i).get履歴番号()))).toObject(DbT3006KyotakuKeikakuJigyoshaSakuseiEntity.class);

                    DbT7060KaigoJigyoshaEntity dbT7060KaigoJigyosha = accessor.select().table(DbT7060KaigoJigyosha.class).where(
                            eq(DbT7060KaigoJigyosha.jigyoshaNo, dbT3006KyotakuKeikakuJigyoshaSakusei.getKeikakuJigyoshaNo())).
                            order(by(DbT7060KaigoJigyosha.yukoKaishiYMD, Order.DESC)).limit(1).toObject(DbT7060KaigoJigyoshaEntity.class);

                    entity.set事業者１(dbT7060KaigoJigyosha.getJigyoshaName().value());
                    entity.set届出年月日１(kyotakuKeikakuTodokedeList.get(i).get届出年月日());
                    entity.set適用開始年月日１(dbT3006KyotakuKeikakuJigyoshaSakusei.getTekiyoKaishiYMD());
                } else if (dbT3007Count > 0) {

                    DbT3007KyotakuKeikakuJikoSakuseiEntity dbT3007KyotakuKeikakuJigyoshaSakusei = accessor.select().
                            table(DbT3007KyotakuKeikakuJikoSakusei.class).
                            where(and(
                                            eq(DbT3007KyotakuKeikakuJikoSakusei.hihokenshaNo, kyotakuKeikakuTodokedeList.get(i).get被保険者番号()),
                                            eq(DbT3007KyotakuKeikakuJikoSakusei.taishoYM, kyotakuKeikakuTodokedeList.get(i).get対象年月()),
                                            eq(DbT3007KyotakuKeikakuJikoSakusei.rirekiNo, kyotakuKeikakuTodokedeList.get(i).get履歴番号()))).toObject(DbT3007KyotakuKeikakuJikoSakuseiEntity.class);

                    entity.set事業者１(JIBUNSAKUSEI);
                    entity.set届出年月日１(kyotakuKeikakuTodokedeList.get(i).get届出年月日());
                    entity.set適用開始年月日１(dbT3007KyotakuKeikakuJigyoshaSakusei.getTekiyoKaishiYMD());
                }

            } else if (i == 1) {

                if (dbT3006Count > 0) {
                    DbT3006KyotakuKeikakuJigyoshaSakuseiEntity dbT3006KyotakuKeikakuJigyoshaSakusei = accessor.select().
                            table(DbT3006KyotakuKeikakuJigyoshaSakusei.class).
                            where(and(
                                            eq(DbT3006KyotakuKeikakuJigyoshaSakusei.hihokenshano, kyotakuKeikakuTodokedeList.get(i).get被保険者番号()),
                                            eq(DbT3006KyotakuKeikakuJigyoshaSakusei.taishoYM, kyotakuKeikakuTodokedeList.get(i).get対象年月()),
                                            eq(DbT3006KyotakuKeikakuJigyoshaSakusei.rirekiNo, kyotakuKeikakuTodokedeList.get(i).get履歴番号()))).toObject(DbT3006KyotakuKeikakuJigyoshaSakuseiEntity.class);

                    DbT7060KaigoJigyoshaEntity dbT7060KaigoJigyosha = accessor.select().table(DbT7060KaigoJigyosha.class).where(
                            eq(DbT7060KaigoJigyosha.jigyoshaNo, dbT3006KyotakuKeikakuJigyoshaSakusei.getKeikakuJigyoshaNo())).
                            order(by(DbT7060KaigoJigyosha.yukoKaishiYMD, Order.DESC)).limit(1).toObject(DbT7060KaigoJigyoshaEntity.class);

                    entity.set事業者２(dbT7060KaigoJigyosha.getJigyoshaName().value());
                    entity.set届出年月日２(kyotakuKeikakuTodokedeList.get(i).get届出年月日());
                    entity.set適用開始年月日２(dbT3006KyotakuKeikakuJigyoshaSakusei.getTekiyoKaishiYMD());
                } else if (dbT3007Count > 0) {

                    DbT3007KyotakuKeikakuJikoSakuseiEntity dbT3007KyotakuKeikakuJigyoshaSakusei = accessor.select().
                            table(DbT3007KyotakuKeikakuJikoSakusei.class).
                            where(and(
                                            eq(DbT3007KyotakuKeikakuJikoSakusei.hihokenshaNo, kyotakuKeikakuTodokedeList.get(i).get被保険者番号()),
                                            eq(DbT3007KyotakuKeikakuJikoSakusei.taishoYM, kyotakuKeikakuTodokedeList.get(i).get対象年月()),
                                            eq(DbT3007KyotakuKeikakuJikoSakusei.rirekiNo, kyotakuKeikakuTodokedeList.get(i).get履歴番号()))).toObject(DbT3007KyotakuKeikakuJikoSakuseiEntity.class);

                    entity.set事業者２(JIBUNSAKUSEI);
                    entity.set届出年月日２(kyotakuKeikakuTodokedeList.get(i).get届出年月日());
                    entity.set適用開始年月日２(dbT3007KyotakuKeikakuJigyoshaSakusei.getTekiyoKaishiYMD());
                }
            } else if (i == 2) {

                if (dbT3006Count > 0) {
                    DbT3006KyotakuKeikakuJigyoshaSakuseiEntity dbT3006KyotakuKeikakuJigyoshaSakusei = accessor.select().
                            table(DbT3006KyotakuKeikakuJigyoshaSakusei.class).
                            where(and(
                                            eq(DbT3006KyotakuKeikakuJigyoshaSakusei.hihokenshano, kyotakuKeikakuTodokedeList.get(i).get被保険者番号()),
                                            eq(DbT3006KyotakuKeikakuJigyoshaSakusei.taishoYM, kyotakuKeikakuTodokedeList.get(i).get対象年月()),
                                            eq(DbT3006KyotakuKeikakuJigyoshaSakusei.rirekiNo, kyotakuKeikakuTodokedeList.get(i).get履歴番号()))).toObject(DbT3006KyotakuKeikakuJigyoshaSakuseiEntity.class);

                    DbT7060KaigoJigyoshaEntity dbT7060KaigoJigyosha = accessor.select().table(DbT7060KaigoJigyosha.class).where(
                            eq(DbT7060KaigoJigyosha.jigyoshaNo, dbT3006KyotakuKeikakuJigyoshaSakusei.getKeikakuJigyoshaNo())).
                            order(by(DbT7060KaigoJigyosha.yukoKaishiYMD, Order.DESC)).limit(1).toObject(DbT7060KaigoJigyoshaEntity.class);

                    entity.set事業者３(dbT7060KaigoJigyosha.getJigyoshaName().value());
                    entity.set届出年月日３(kyotakuKeikakuTodokedeList.get(i).get届出年月日());
                    entity.set適用開始年月日３(dbT3006KyotakuKeikakuJigyoshaSakusei.getTekiyoKaishiYMD());
                } else if (dbT3007Count > 0) {

                    DbT3007KyotakuKeikakuJikoSakuseiEntity dbT3007KyotakuKeikakuJigyoshaSakusei = accessor.select().
                            table(DbT3007KyotakuKeikakuJikoSakusei.class).
                            where(and(
                                            eq(DbT3007KyotakuKeikakuJikoSakusei.hihokenshaNo, kyotakuKeikakuTodokedeList.get(i).get被保険者番号()),
                                            eq(DbT3007KyotakuKeikakuJikoSakusei.taishoYM, kyotakuKeikakuTodokedeList.get(i).get対象年月()),
                                            eq(DbT3007KyotakuKeikakuJikoSakusei.rirekiNo, kyotakuKeikakuTodokedeList.get(i).get履歴番号()))).toObject(DbT3007KyotakuKeikakuJikoSakuseiEntity.class);

                    entity.set事業者３(JIBUNSAKUSEI);
                    entity.set届出年月日３(kyotakuKeikakuTodokedeList.get(i).get届出年月日());
                    entity.set適用開始年月日３(dbT3007KyotakuKeikakuJigyoshaSakusei.getTekiyoKaishiYMD());
                }
            }
        }
    }

    /**
     * 施設入退所データ取得。
     *
     * @param HihokenshoShikakushoHakkoEntity HihokenshoShikakushoHakkoEntity
     */
    private void 施設入退所データ取得(HihokenshoShikakushoHakkoEntity entity) {

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        IHihokenshoShikakushoHakkoMapper hihokenshoShikakushoHakkoMapper = mapperProvider.create(IHihokenshoShikakushoHakkoMapper.class);

        List<KaigoHokenShisetsuNyutaishoEntity> kaigoHokenShisetsuNyutaishoList = hihokenshoShikakushoHakkoMapper.介護保険施設入退所の情報取得();

        for (int i = 0; i < kaigoHokenShisetsuNyutaishoList.size(); i++) {

            if (i == 0) {
                if (ShisetsuType.介護保険施設.getCode().equals(kaigoHokenShisetsuNyutaishoList.get(i).get入所施設種類())) {
                    DbT7060KaigoJigyoshaEntity dbT7060KaigoJigyosha = accessor.select().table(DbT7060KaigoJigyosha.class).where(
                            eq(DbT7060KaigoJigyosha.jigyoshaNo, kaigoHokenShisetsuNyutaishoList.get(i).get入所施設コード())).
                            order(by(DbT7060KaigoJigyosha.yukoKaishiYMD, Order.DESC)).limit(1).toObject(DbT7060KaigoJigyoshaEntity.class);

                    entity.set入所施設１(dbT7060KaigoJigyosha.getJigyoshaName().value());
                } else if (ShisetsuType.住所地特例対象施設.getCode().equals(kaigoHokenShisetsuNyutaishoList.get(i).get入所施設種類())) {
                    DbT1005KaigoJogaiTokureiTaishoShisetsuEntity dbT1005KaigoJogaiTokureiTaishoShisetsu = accessor.select().table(DbT1005KaigoJogaiTokureiTaishoShisetsu.class).where(
                            eq(DbT1005KaigoJogaiTokureiTaishoShisetsu.jigyoshaNo, kaigoHokenShisetsuNyutaishoList.get(i).get入所施設コード())).
                            order(by(DbT1005KaigoJogaiTokureiTaishoShisetsu.yukoKaishiYMD, Order.DESC)).limit(1).toObject(DbT1005KaigoJogaiTokureiTaishoShisetsuEntity.class);

                    entity.set入所施設１(dbT1005KaigoJogaiTokureiTaishoShisetsu.getJigyoshaMeisho().value());

                }
                entity.set入所年月日１(kaigoHokenShisetsuNyutaishoList.get(i).get入所年月日());
                entity.set退所年月日１(kaigoHokenShisetsuNyutaishoList.get(i).get退所年月日());
            } else if (i == 1) {
                if (ShisetsuType.介護保険施設.getCode().equals(kaigoHokenShisetsuNyutaishoList.get(i).get入所施設種類())) {
                    DbT7060KaigoJigyoshaEntity dbT7060KaigoJigyosha = accessor.select().table(DbT7060KaigoJigyosha.class).where(
                            eq(DbT7060KaigoJigyosha.jigyoshaNo, kaigoHokenShisetsuNyutaishoList.get(i).get入所施設コード())).
                            order(by(DbT7060KaigoJigyosha.yukoKaishiYMD, Order.DESC)).limit(1).toObject(DbT7060KaigoJigyoshaEntity.class);

                    entity.set入所施設２(dbT7060KaigoJigyosha.getJigyoshaName().value());
                } else if (ShisetsuType.住所地特例対象施設.getCode().equals(kaigoHokenShisetsuNyutaishoList.get(i).get入所施設種類())) {
                    DbT1005KaigoJogaiTokureiTaishoShisetsuEntity dbT1005KaigoJogaiTokureiTaishoShisetsu = accessor.select().table(DbT1005KaigoJogaiTokureiTaishoShisetsu.class).where(
                            eq(DbT1005KaigoJogaiTokureiTaishoShisetsu.jigyoshaNo, kaigoHokenShisetsuNyutaishoList.get(i).get入所施設コード())).
                            order(by(DbT1005KaigoJogaiTokureiTaishoShisetsu.yukoKaishiYMD, Order.DESC)).limit(1).toObject(DbT1005KaigoJogaiTokureiTaishoShisetsuEntity.class);

                    entity.set入所施設２(dbT1005KaigoJogaiTokureiTaishoShisetsu.getJigyoshaMeisho().value());

                }
                entity.set入所年月日２(kaigoHokenShisetsuNyutaishoList.get(i).get入所年月日());
                entity.set退所年月日２(kaigoHokenShisetsuNyutaishoList.get(i).get退所年月日());
            }
        }
    }
}
