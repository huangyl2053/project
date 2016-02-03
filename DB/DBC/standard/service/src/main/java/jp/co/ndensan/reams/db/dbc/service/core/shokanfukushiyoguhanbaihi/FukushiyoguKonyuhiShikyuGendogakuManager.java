/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.service.core.shokanfukushiyoguhanbaihi;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.definition.core.shikyufushikyukubun.ShikyuFushikyuKubun;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3033KyufujissekiShukeiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3036ShokanHanteiKekkaEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.kyufujisseki.DbT3017KyufujissekiKihonEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.kyufujisseki.DbT3026KyufujissekiFukushiYoguHanbaihiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.shokanshinsei.DbT3034ShokanShinseiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.shokanshinsei.DbT3038ShokanKihonEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.shokanshinsei.DbT3048ShokanFukushiYoguHanbaihiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.shokanshinsei.DbT3053ShokanShukeiEntity;
import jp.co.ndensan.reams.db.dbc.persistence.db.basic.DbT3017KyufujissekiKihonDac;
import jp.co.ndensan.reams.db.dbc.persistence.db.basic.DbT3026KyufujissekiFukushiYoguHanbaihiDac;
import jp.co.ndensan.reams.db.dbc.persistence.db.basic.DbT3033KyufujissekiShukeiDac;
import jp.co.ndensan.reams.db.dbd.entity.db.basic.DbT4001JukyushaDaichoEntity;
import jp.co.ndensan.reams.db.dbd.persistence.db.basic.DbT4001JukyushaDaichoDac;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenKyufuRitsu;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.KokanShikibetsuNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.NyuryokuShikibetsuNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ServiceCode;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 福祉用具購入費支給決定給付実績編集
 *
 * @author chenaoqi
 */
public class FukushiyoguKonyuhiShikyuGendogakuManager {

    private final DbT4001JukyushaDaichoDac 受給者台帳Dac;
    private final DbT3017KyufujissekiKihonDac 給付実績基本Dac;
    private final DbT3026KyufujissekiFukushiYoguHanbaihiDac 給付実績福祉用具販売費Dac;
    private final DbT3033KyufujissekiShukeiDac 給付実績集計Dac;
    private static final RString モード_登録 = new RString("登録");
    private static final RString モード_修正 = new RString("修正");
    private static final RString モード_差額登録 = new RString("差額登録");
    private static final RString モード_削除 = new RString("削除");
    private static final RString モード_審査 = new RString("審査");

    public FukushiyoguKonyuhiShikyuGendogakuManager() {
        this.受給者台帳Dac = InstanceProvider.create(DbT4001JukyushaDaichoDac.class);
        this.給付実績基本Dac = InstanceProvider.create(DbT3017KyufujissekiKihonDac.class);
        this.給付実績福祉用具販売費Dac = InstanceProvider.create(DbT3026KyufujissekiFukushiYoguHanbaihiDac.class);
        this.給付実績集計Dac = InstanceProvider.create(DbT3033KyufujissekiShukeiDac.class);
    }

    /**
     * {@link InstanceProvider#create}にて生成した{@link FukushiyoguKonyuhiShikyuGendogakuManager}のインスタンスを返します。
     *
     * @return FukushiyoguKonyuhiShikyuGendogakuManager
     */
    public static FukushiyoguKonyuhiShikyuGendogakuManager createInstance() {

        return InstanceProvider.create(FukushiyoguKonyuhiShikyuGendogakuManager.class);
    }

    /**
     * 単体テスト用のコンストラクタです。
     *
     * @param 受給者台帳Dac
     * @param 給付実績基本Dac
     * @param 給付実績福祉用具販売費Dac
     * @param 給付実績集計Dac
     */
    FukushiyoguKonyuhiShikyuGendogakuManager(
            DbT4001JukyushaDaichoDac 受給者台帳Dac,
            DbT3017KyufujissekiKihonDac 給付実績基本Dac,
            DbT3026KyufujissekiFukushiYoguHanbaihiDac 給付実績福祉用具販売費Dac,
            DbT3033KyufujissekiShukeiDac 給付実績集計Dac
    ) {
        this.受給者台帳Dac = 受給者台帳Dac;
        this.給付実績基本Dac = 給付実績基本Dac;
        this.給付実績福祉用具販売費Dac = 給付実績福祉用具販売費Dac;
        this.給付実績集計Dac = 給付実績集計Dac;
    }

    /**
     * 給付実績処理
     *
     * @param 画面モード
     * @param 識別コード
     * @param shokanKihonEntity
     * @param businessList
     * @param shokanShinseiEntity
     * @param shokanHanteiKekkaEntity
     * @param shokanShukeiEntity
     * @param 修正前支給区分
     */
    public void dealKyufujisseki(RString 画面モード, ShikibetsuCode 識別コード,
            DbT3038ShokanKihonEntity shokanKihonEntity,
            List<DbT3048ShokanFukushiYoguHanbaihiEntity> businessList,
            DbT3034ShokanShinseiEntity shokanShinseiEntity,
            DbT3036ShokanHanteiKekkaEntity shokanHanteiKekkaEntity,
            DbT3053ShokanShukeiEntity shokanShukeiEntity,
            RString 修正前支給区分) {

        requireNonNull(画面モード, UrSystemErrorMessages.値がnull.getReplacedMessage("画面モード"));
        requireNonNull(識別コード, UrSystemErrorMessages.値がnull.getReplacedMessage("識別コード"));
        requireNonNull(shokanKihonEntity, UrSystemErrorMessages.値がnull.getReplacedMessage("償還払請求基本"));
        requireNonNull(businessList, UrSystemErrorMessages.値がnull.getReplacedMessage("償還払請求福祉用具販売費"));
        requireNonNull(shokanShinseiEntity, UrSystemErrorMessages.値がnull.getReplacedMessage("償還払支給申請"));
        requireNonNull(shokanHanteiKekkaEntity, UrSystemErrorMessages.値がnull.getReplacedMessage("償還払支給判定結果"));
        requireNonNull(shokanShukeiEntity, UrSystemErrorMessages.値がnull.getReplacedMessage("償還払請求集計"));

        RString 給付実績情報作成区分コード;

        if (モード_登録.equals(画面モード)
                && ShikyuFushikyuKubun.支給.getコード().equals(shokanHanteiKekkaEntity.getShikyuHushikyuKetteiKubun())) {
            給付実績情報作成区分コード = new RString("1");
            給付実績追加(識別コード, shokanKihonEntity, businessList,
                    shokanShinseiEntity, shokanHanteiKekkaEntity,
                    shokanShukeiEntity, 給付実績情報作成区分コード);
        }
        if (モード_修正.equals(画面モード) || モード_差額登録.equals(画面モード)) {
            if (修正前支給区分.equals(ShikyuFushikyuKubun.不支給.getコード())
                    && ShikyuFushikyuKubun.不支給.getコード().equals(shokanHanteiKekkaEntity.getShikyuHushikyuKetteiKubun())) {
            }
            if (修正前支給区分.equals(ShikyuFushikyuKubun.不支給.getコード())
                    && ShikyuFushikyuKubun.支給.getコード().equals(shokanHanteiKekkaEntity.getShikyuHushikyuKetteiKubun())) {
                給付実績情報作成区分コード = new RString("1");
                給付実績追加(識別コード, shokanKihonEntity, businessList,
                        shokanShinseiEntity, shokanHanteiKekkaEntity,
                        shokanShukeiEntity, 給付実績情報作成区分コード);
            }
            if (修正前支給区分.equals(ShikyuFushikyuKubun.支給.getコード())
                    && ShikyuFushikyuKubun.支給.getコード().equals(shokanHanteiKekkaEntity.getShikyuHushikyuKetteiKubun())) {
                給付実績情報作成区分コード = new RString("2");
                給付実績追加(識別コード, shokanKihonEntity, businessList,
                        shokanShinseiEntity, shokanHanteiKekkaEntity,
                        shokanShukeiEntity, 給付実績情報作成区分コード);
            }
            if (修正前支給区分.equals(ShikyuFushikyuKubun.支給.getコード())
                    && ShikyuFushikyuKubun.不支給.getコード().equals(shokanHanteiKekkaEntity.getShikyuHushikyuKetteiKubun())) {
                給付実績情報作成区分コード = new RString("3");
                給付実績追加(識別コード, shokanKihonEntity, businessList,
                        shokanShinseiEntity, shokanHanteiKekkaEntity,
                        shokanShukeiEntity, 給付実績情報作成区分コード);
            }
        }
        if (モード_削除.equals(画面モード)) {
            if (ShikyuFushikyuKubun.不支給.getコード().equals(shokanHanteiKekkaEntity.getShikyuHushikyuKetteiKubun())) {
            }
            if (ShikyuFushikyuKubun.支給.getコード().equals(shokanHanteiKekkaEntity.getShikyuHushikyuKetteiKubun())) {
                給付実績情報作成区分コード = new RString("3");
                給付実績追加(識別コード, shokanKihonEntity, businessList,
                        shokanShinseiEntity, shokanHanteiKekkaEntity,
                        shokanShukeiEntity, 給付実績情報作成区分コード);
            }
        }
        if (モード_審査.equals(画面モード)) {
            給付実績情報作成区分コード = new RString("1");
            給付実績追加(識別コード, shokanKihonEntity, businessList,
                    shokanShinseiEntity, shokanHanteiKekkaEntity,
                    shokanShukeiEntity, 給付実績情報作成区分コード);
        }

    }

    /**
     * 給付実績追加
     *
     * @param 識別コード
     * @param shokanKihonEntity
     * @param businessList
     * @param shokanShinseiEntity
     * @param shokanHanteiKekkaEntity
     * @param shokanShukeiEntity
     * @param 給付実績情報作成区分コード
     */
    private void 給付実績追加(ShikibetsuCode 識別コード,
            DbT3038ShokanKihonEntity shokanKihonEntity,
            List<DbT3048ShokanFukushiYoguHanbaihiEntity> businessList,
            DbT3034ShokanShinseiEntity shokanShinseiEntity,
            DbT3036ShokanHanteiKekkaEntity shokanHanteiKekkaEntity,
            DbT3053ShokanShukeiEntity shokanShukeiEntity,
            RString 給付実績情報作成区分コード) {
        requireNonNull(給付実績情報作成区分コード, UrSystemErrorMessages.値がnull.getReplacedMessage("給付実績情報作成区分コード"));
        RString 通し番号 = new RString("00");
        // TODO
//        RString 通し番号 = Saiban.get(SubGyomuCode.DBC介護給付,
//                SaibanHanyokeyName.実績管理番号.getコード()).nextString();
        if (通し番号 == null) {
            throw new IllegalArgumentException(UrErrorMessages.存在しない
                    .getMessage().replace("最新番号").evaluate());
        }

        //TODO
        //List<IKojin> Kojin = ShikibetsuTaishoService.getKojinFinder().get個人s((IShikibetsuTaishoSearchKey) 識別コード);
        // FlexibleDate 生年月日YMD = (FlexibleDate) Kojin.get(0).get生年月日();
        //RString 性別コード = Kojin.get(0).get性別().getCode();
        FlexibleDate 生年月日YMD = new FlexibleDate("19920610");
        RString 性別コード = new RString("1");

        DbT4001JukyushaDaichoEntity DbT4001entity = 受給者台帳Dac.select認定有効期間(shokanShinseiEntity.getHiHokenshaNo());
        if (DbT4001entity == null) {
            throw new IllegalArgumentException(UrErrorMessages.存在しない
                    .getMessage().replace("認定有効期間").evaluate());
        }

        save給付実績基本(給付実績情報作成区分コード, 通し番号, 生年月日YMD, 性別コード,
                DbT4001entity, shokanKihonEntity, shokanShinseiEntity, shokanHanteiKekkaEntity);
        save給付実績福祉用具販売費(通し番号, businessList, shokanShinseiEntity, shokanShukeiEntity, shokanHanteiKekkaEntity);
        save給付実績集計(通し番号, shokanKihonEntity, shokanShinseiEntity, shokanHanteiKekkaEntity, shokanShukeiEntity);

    }

    /**
     * save給付実績基本
     *
     * @param 給付実績情報作成区分コード
     * @param 通し番号
     * @param 生年月日YMD
     * @param 性別コード
     * @param DbT4001entity
     * @param shokanKihonEntity
     * @param shokanShinseiEntity
     * @param shokanHanteiKekkaEntity
     */
    public void save給付実績基本(RString 給付実績情報作成区分コード, RString 通し番号,
            FlexibleDate 生年月日YMD, RString 性別コード,
            DbT4001JukyushaDaichoEntity DbT4001entity,
            DbT3038ShokanKihonEntity shokanKihonEntity,
            DbT3034ShokanShinseiEntity shokanShinseiEntity,
            DbT3036ShokanHanteiKekkaEntity shokanHanteiKekkaEntity) {
        DbT3017KyufujissekiKihonEntity DbT3017entity = new DbT3017KyufujissekiKihonEntity();

        DbT3017entity.setKokanShikibetsuNo(get交換情報識別番号(shokanKihonEntity.getServiceTeikyoYM()));
        DbT3017entity.setInputShikibetsuNo(new NyuryokuShikibetsuNo(shokanKihonEntity.getYoshikiNo()));
        DbT3017entity.setRecodeShubetsuCode(new RString("01"));
        DbT3017entity.setKyufuSakuseiKubunCode(給付実績情報作成区分コード);
        DbT3017entity.setHokenshaNo(shokanShinseiEntity.getShoKisaiHokenshaNo());
        DbT3017entity.setHiHokenshaNo(shokanKihonEntity.getHiHokenshaNo());
        DbT3017entity.setServiceTeikyoYM(shokanKihonEntity.getServiceTeikyoYM());
        DbT3017entity.setKyufuJissekiKubunCode(new RString("2"));
        DbT3017entity.setJigyoshoNo(shokanKihonEntity.getJigyoshaNo());
        DbT3017entity.setToshiNo(通し番号);
        DbT3017entity.setUmareYMD(生年月日YMD);
        DbT3017entity.setSeibetsuCode(性別コード);
        DbT3017entity.setNinteiYukoKaishiYMD(DbT4001entity.getNinteiYukoKikanKaishiYMD());
        DbT3017entity.setNinteiYukoShuryoYMD(DbT4001entity.getNinteiYukoKikanShuryoYMD());
        //TODO 償還払支給申請表中无字段給付率
        DbT3017entity.setHokenKyufuritsu(new HokenKyufuRitsu(new Decimal(shokanShinseiEntity.getHokenKyufuritsu())));
        DbT3017entity.setMaeHokenSeikyugaku(new Decimal(shokanShinseiEntity.getHokenKyufuritsu()));
        DbT3017entity.setMaeHokenRiyoshaFutangaku(new Decimal(shokanShinseiEntity.getRiyoshaFutangaku()));
        DbT3017entity.setAtoHokenRiyoshaFutangaku(new Decimal(shokanShinseiEntity.getHokenKyufuritsu()));
        DbT3017entity.setAtoHokenRiyoshaFutangaku(new Decimal(shokanShinseiEntity.getHokenKyufuritsu()));
        DbT3017entity.setShinsaYM(shokanHanteiKekkaEntity.getKetteiYMD().getYearMonth());
        DbT3017entity.setSeiriNo(shokanKihonEntity.getSeiriNp());
        DbT3017entity.setSofuYM(shokanHanteiKekkaEntity.getKetteiYMD().getYearMonth());
        DbT3017entity.setHokenshaHoyuKyufujissekiJohoSakujoFlag(false);
        DbT3017entity.setState(EntityDataState.Added);
        給付実績基本Dac.save(DbT3017entity);
    }

    /**
     * save給付実績福祉用具販売費
     *
     * @param 通し番号
     * @param businessList
     * @param shokanShinseiEntity
     * @param shokanShukeiEntity
     * @param shokanHanteiKekkaEntity
     */
    public void save給付実績福祉用具販売費(RString 通し番号,
            List<DbT3048ShokanFukushiYoguHanbaihiEntity> businessList,
            DbT3034ShokanShinseiEntity shokanShinseiEntity,
            DbT3053ShokanShukeiEntity shokanShukeiEntity,
            DbT3036ShokanHanteiKekkaEntity shokanHanteiKekkaEntity) {

        DbT3026KyufujissekiFukushiYoguHanbaihiEntity DbT3026entity = new DbT3026KyufujissekiFukushiYoguHanbaihiEntity();
        int 連番 = 0;
        for (DbT3048ShokanFukushiYoguHanbaihiEntity shokanFukushiYoguHanbaihiEntity : businessList) {
            連番 = 連番 + 1;
            DbT3026entity.setKokanJohoShikibetsuNo(get交換情報識別番号(shokanFukushiYoguHanbaihiEntity.getServiceTeikyoYM()));
            DbT3026entity.setInputShikibetsuNo(new NyuryokuShikibetsuNo(shokanFukushiYoguHanbaihiEntity.getYoshikiNo()));
            DbT3026entity.setRecodeShubetsuCode(new RString("06"));
            DbT3026entity.setShokisaiHokenshaNo(shokanShinseiEntity.getShoKisaiHokenshaNo());
            DbT3026entity.setHiHokenshaNo(shokanFukushiYoguHanbaihiEntity.getHiHokenshaNo());
            DbT3026entity.setServiceTeikyoYM(shokanFukushiYoguHanbaihiEntity.getServiceTeikyoYM());
            DbT3026entity.setJigyoshoNo(shokanFukushiYoguHanbaihiEntity.getJigyoshaNo());
            DbT3026entity.setToshiNo(通し番号);
            DbT3026entity.setMeisaiNo(new RString(String.valueOf(連番)));
            RString サービス種類コード = new RString(shokanShukeiEntity.getServiceShuruiCode().toString() + "0000");
            DbT3026entity.setServiceCode(new ServiceCode(サービス種類コード));
            DbT3026entity.setFukushiyoguHanbaiYMD(shokanFukushiYoguHanbaihiEntity.getFukushiYoguHanbaiYMD());
            DbT3026entity.setFukushiyoguShohinName(shokanFukushiYoguHanbaihiEntity.getFukushiYoguShohinName());
            DbT3026entity.setFukushiyoguSyumokuCode(shokanFukushiYoguHanbaihiEntity.getFukushiYoguShumokuCode());
            DbT3026entity.setFukushiyoguSeizoJigyoshaName(shokanFukushiYoguHanbaihiEntity.getFukushiYoguSeizoJigyoshaName());
            DbT3026entity.setFukushiyoguHanbaiJigyoshaName(shokanFukushiYoguHanbaihiEntity.getFukushiYoguHanbaiJigyoshaName());
            DbT3026entity.setHanbaiKingaku(new Decimal(shokanFukushiYoguHanbaihiEntity.getKounyuKingaku()));
            DbT3026entity.setTekiyo(shokanFukushiYoguHanbaihiEntity.getHinmokuCode());
            DbT3026entity.setShinsaYM(shokanHanteiKekkaEntity.getKetteiYMD().getYearMonth());
            DbT3026entity.setSeiriNo(shokanHanteiKekkaEntity.getSeiriNo());
            DbT3026entity.setTorikomiYM(shokanHanteiKekkaEntity.getKetteiYMD().getYearMonth());
            DbT3026entity.setState(EntityDataState.Added);
            給付実績福祉用具販売費Dac.save(DbT3026entity);
        }

    }

    /**
     * save給付実績集計
     *
     * @param 通し番号
     * @param shokanKihonEntity
     * @param shokanShinseiEntity
     * @param shokanHanteiKekkaEntity
     * @param shokanShukeiEntity
     */
    private void save給付実績集計(RString 通し番号,
            DbT3038ShokanKihonEntity shokanKihonEntity,
            DbT3034ShokanShinseiEntity shokanShinseiEntity,
            DbT3036ShokanHanteiKekkaEntity shokanHanteiKekkaEntity,
            DbT3053ShokanShukeiEntity shokanShukeiEntity) {

        DbT3033KyufujissekiShukeiEntity DbT3033entity = new DbT3033KyufujissekiShukeiEntity();
        DbT3033entity.setKokanJohoShikibetsuNo(get交換情報識別番号(shokanKihonEntity.getServiceTeikyoYM()));
        DbT3033entity.setInputShikibetsuNo(new NyuryokuShikibetsuNo(shokanKihonEntity.getYoshikiNo()));
        DbT3033entity.setRecodeShubetsuCode(new RString("10"));
        DbT3033entity.setShokisaiHokenshaNo(shokanShinseiEntity.getShoKisaiHokenshaNo());
        DbT3033entity.setHiHokenshaNo(shokanKihonEntity.getHiHokenshaNo());
        DbT3033entity.setServiceTeikyoYM(shokanKihonEntity.getServiceTeikyoYM());
        DbT3033entity.setJigyoshoNo(shokanKihonEntity.getJigyoshaNo());
        DbT3033entity.setToshiNo(通し番号);
        DbT3033entity.setServiceSyuruiCode(shokanShukeiEntity.getServiceShuruiCode());
        DbT3033entity.setShinsaYM(shokanHanteiKekkaEntity.getKetteiYMD().getYearMonth());
        DbT3033entity.setSeiriNo(shokanKihonEntity.getSeiriNp());
        DbT3033entity.setTorikomiYM(shokanHanteiKekkaEntity.getKetteiYMD().getYearMonth());
        DbT3033entity.setState(EntityDataState.Added);
        給付実績集計Dac.save(DbT3033entity);
    }

    /**
     * 交換情報識別番号の取得
     *
     * @param serviceTeikyoYM
     * @return 交換情報識別番号
     */
    private KokanShikibetsuNo get交換情報識別番号(FlexibleYearMonth serviceTeikyoYM) {
        KokanShikibetsuNo 交換情報識別番号 = new KokanShikibetsuNo("1131");
        if (serviceTeikyoYM.isBeforeOrEquals(new FlexibleYearMonth("200303"))) {
            return 交換情報識別番号;
        }
        if (new FlexibleYearMonth("201504").isBeforeOrEquals(serviceTeikyoYM)) {
            交換情報識別番号 = new KokanShikibetsuNo("1138");
            return 交換情報識別番号;
        }
        if (new FlexibleYearMonth("201204").isBeforeOrEquals(serviceTeikyoYM)) {
            交換情報識別番号 = new KokanShikibetsuNo("1137");
            return 交換情報識別番号;
        }
        if (new FlexibleYearMonth("200904").isBeforeOrEquals(serviceTeikyoYM)) {
            交換情報識別番号 = new KokanShikibetsuNo("1136");
            return 交換情報識別番号;
        }
        if (new FlexibleYearMonth("200804").isBeforeOrEquals(serviceTeikyoYM)) {
            交換情報識別番号 = new KokanShikibetsuNo("1135");
            return 交換情報識別番号;
        }
        if (new FlexibleYearMonth("200604").isBeforeOrEquals(serviceTeikyoYM)) {
            交換情報識別番号 = new KokanShikibetsuNo("1134");
            return 交換情報識別番号;
        }
        if (new FlexibleYearMonth("200504").isBeforeOrEquals(serviceTeikyoYM)) {
            交換情報識別番号 = new KokanShikibetsuNo("1133");
            return 交換情報識別番号;
        }
        if (new FlexibleYearMonth("200304").isBeforeOrEquals(serviceTeikyoYM)) {
            交換情報識別番号 = new KokanShikibetsuNo("1132");
            return 交換情報識別番号;
        }
        return 交換情報識別番号;
    }

}
