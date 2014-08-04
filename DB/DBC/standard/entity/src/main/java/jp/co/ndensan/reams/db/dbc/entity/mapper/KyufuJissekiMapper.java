/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.mapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.InputShikibetsuNo;
import jp.co.ndensan.reams.db.dbc.business.JigyoshaNoListOfServiceTeikyoYM;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiDetailKeyInfo;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiJutakuKaishuhi;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiJutakuKaishuhiCollection;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiYoguHanbaihi;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiYoguHanbaihiCollection;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiKeyInfo;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiKihon;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiKihonGokei;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiKihonGokeiCollection;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiKihonHihokensha;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiKihonKohi;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiKihonKyotakuService;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiKihonKyufuritsu;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiKihonNyutaisho;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiKihonServiceKikan;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiKyotakuService;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiKyotakuServiceCollection;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiMeisai;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiMeisaiCollection;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiShafukuKeigen;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiShafukuKeigenCollection;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiShukei;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiShukeiCollection;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiTokuteiNyushohi;
import jp.co.ndensan.reams.db.dbc.business.KyufuJissekiTokuteiNyushohiCollection;
import jp.co.ndensan.reams.db.dbc.business.ServiceTeikyoYMListOfServiceShurui;
import jp.co.ndensan.reams.db.dbc.definition.enumeratedtype.KeikokuKubun;
import jp.co.ndensan.reams.db.dbc.definition.enumeratedtype.KyufuJissekiKubun;
import jp.co.ndensan.reams.db.dbc.definition.enumeratedtype.KyufuSakuseiKubun;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3017KyufujissekiKihonEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3018KyufujissekiMeisaiEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3025KyufujissekiKyotakuServiceEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3026KyufujissekiFukushiYoguHanbaihiEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3027KyufujissekiJutakuKaishuhiEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3029KyufujissekiTokuteiNyushosyaKaigoServiceHiyoEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3030KyufuJissekiShakaiFukushiHojinKeigengakuEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3033KyufujissekiShukeiEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbV3016KyufujissekiShuruiDetailEntity;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ServiceShuruiCode;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ServiceTeikyoYM;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.Gender;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Range;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 給付実績エンティティを給付実績情報に変換するMapperクラスです。
 *
 * @author N8156 宮本 康
 */
public final class KyufuJissekiMapper {

    private static final RString 空欄 = RString.EMPTY;
    private static final RString 後 = new RString("後");
    private static final RString 保険 = new RString("保険");
    private static final RString 公費1 = new RString("公費１");
    private static final RString 公費2 = new RString("公費２");
    private static final RString 公費3 = new RString("公費３");
    private static final RString 明細 = new RString("明細");
    private static final RString 合計 = new RString("合計");

    private static final RString[] 保険公費 = {保険, 空欄, 公費1, 空欄, 公費2, 空欄, 公費3, 空欄};
    private static final RString[] 明細合計 = {明細, 合計, 明細, 合計};
    private static final RString[] 前後1 = {空欄, 後};
    private static final RString[] 前後2 = {空欄, 空欄, 後, 後};
    private static final RString[] 前後3 = {空欄, 後, 空欄, 後, 空欄, 後, 空欄, 後};

    /**
     * インスタンス化を防ぐためのプライベートコンストラクタです。
     */
    private KyufuJissekiMapper() {
    }

    /**
     * 給付実績種類詳細エンティティから給付実績詳細キー情報を作成して返します。
     *
     * @param entities 給付実績種類詳細エンティティ
     * @param キー情報 給付実績キー情報
     * @return 給付実績詳細キー情報
     */
    public static KyufuJissekiDetailKeyInfo to給付実績詳細キー(List<DbV3016KyufujissekiShuruiDetailEntity> entities, KyufuJissekiKeyInfo キー情報) {
        if (entities == null || entities.isEmpty() || キー情報 == null) {
            return null;
        }

        DbV3016KyufujissekiShuruiDetailEntity entity = new DbV3016KyufujissekiShuruiDetailEntity();
        for (int index = 0; index < entities.size(); index++) {
            entity = entities.get(index);
            if ((キー情報.get被保番号() == null || キー情報.get被保番号().equals(entity.getHiHokenshaNo()))
                    && (キー情報.get入力識別番号() == null
                    || キー情報.get入力識別番号().getInputShikibetsuNoCode().value().equals(entity.getInputShikibetsuNo()))
                    && (キー情報.getサービス種類コード() == null || キー情報.getサービス種類コード().equals(entity.getServiceSyuruiCode()))
                    && (キー情報.getサービス提供年月() == null || キー情報.getサービス提供年月().equals(entity.getServiceTeikyoYM()))) {
                break;
            }
        }

        return new KyufuJissekiDetailKeyInfo(
                entity.getKokanShikibetsuNo(),
                //TODO 名称などはどこから取ってくるのか
                new InputShikibetsuNo(new Code(entity.getInputShikibetsuNo()), new RString(""), new RString("")),
                entity.getHokenshaNo(),
                entity.getHiHokenshaNo(),
                entity.getServiceTeikyoYM(),
                entity.getJigyoshoNo(),
                entity.getToshiNo(),
                to対象サービス種類リスト(entities));
    }

    private static List<ServiceTeikyoYMListOfServiceShurui> to対象サービス種類リスト(List<DbV3016KyufujissekiShuruiDetailEntity> entities) {

        List<JigyoshaNo> jigyoshaNoList = new ArrayList<>();
        List<JigyoshaNoListOfServiceTeikyoYM> teikyoYMList = new ArrayList<>();
        List<ServiceTeikyoYMListOfServiceShurui> shuruiCodeList = new ArrayList<>();

        for (int index = 0; index < entities.size(); index++) {

            jigyoshaNoList.add(entities.get(index).getJigyoshoNo());

            boolean last = (index == (entities.size() - 1));

            ServiceTeikyoYM teikyoYM = entities.get(index).getServiceTeikyoYM();
            ServiceTeikyoYM nextTeikyoYM = !last ? entities.get(index + 1).getServiceTeikyoYM() : null;
            if (last || !teikyoYM.equals(nextTeikyoYM)) {
                teikyoYMList.add(new JigyoshaNoListOfServiceTeikyoYM(teikyoYM, jigyoshaNoList));
                jigyoshaNoList = new ArrayList<>();
            }

            ServiceShuruiCode shuruiCode = entities.get(index).getServiceSyuruiCode();
            ServiceShuruiCode nextShuruiCode = !last ? entities.get(index + 1).getServiceSyuruiCode() : null;
            if (last || !shuruiCode.equals(nextShuruiCode)) {
                shuruiCodeList.add(new ServiceTeikyoYMListOfServiceShurui(shuruiCode, teikyoYMList));
                jigyoshaNoList = new ArrayList<>();
                teikyoYMList = new ArrayList<>();
            }

        }

        return shuruiCodeList;
    }

    /**
     * 給付実績基本エンティティから給付実績基本情報を作成して返します。
     *
     * @param entity 給付実績基本エンティティ
     * @return 給付実績基本情報
     */
    public static KyufuJissekiKihon to給付実績基本(DbT3017KyufujissekiKihonEntity entity) {
        return entity != null ? new KyufuJissekiKihon(
                entity.getHiHokenshaNo(),
                RString.EMPTY,
                Gender.toValue(entity.getSeibetsuCode()),
                entity.getUmareYMD(),
                new ServiceTeikyoYM(entity.getServiceTeikyoYM()),
                KyufuJissekiKubun.toValue(entity.getKyufuJissekiKubunCode()),
                entity.getSeiriNo(),
                entity.getHokenshaNo().getValue(),
                new InputShikibetsuNo(new Code(entity.getInputShikibetsuNo()), RString.EMPTY, RString.EMPTY),
                entity.getJigyoshoNo().value(),
                KyufuSakuseiKubun.toValue(entity.getKyufuSakuseiKubunCode()),
                entity.getYoKaigoJotaiKubunCode(),
                new Range<>(entity.getNinteiYukoKaishiYMD(), entity.getNinteiYukoShuryoYMD()),
                entity.getShinsaYM(),
                KeikokuKubun.toValue(entity.getKeikaiKubunCode()),
                to被保険者情報(entity),
                to居宅サービス計画情報(entity),
                toサービス期間情報(entity),
                to施設入退所情報(entity),
                to給付率情報(entity),
                to公費情報(entity),
                to合計情報List(entity)) : null;
    }

    private static KyufuJissekiKihonHihokensha to被保険者情報(DbT3017KyufujissekiKihonEntity entity) {
        return new KyufuJissekiKihonHihokensha(
                entity.getKyuSochiNyushoshaTokureiCode(),
                entity.getRojinHokenShichosonNo(),
                entity.getRojinhokenJukyushaNo(),
                entity.getKokiHokenshaNo(),
                entity.getKokiHiHokenshaNo(),
                entity.getKokuhoHokenshaNo(),
                entity.getKokuhoHiHokenshashoNo(),
                entity.getKokuhoKojinNo());
    }

    private static KyufuJissekiKihonKyotakuService to居宅サービス計画情報(DbT3017KyufujissekiKihonEntity entity) {
        return new KyufuJissekiKihonKyotakuService(
                entity.getKyotakuServiceSakuseiKubunCode(),
                entity.getKyotakuKaigoShienJigyoshoNo(),
                RString.EMPTY);
    }

    private static KyufuJissekiKihonServiceKikan toサービス期間情報(DbT3017KyufujissekiKihonEntity entity) {
        return new KyufuJissekiKihonServiceKikan(
                entity.getKaishiYMD(),
                entity.getChushiYMD(),
                entity.getChushiRiyuNyushomaeJyokyoCode());
    }

    private static KyufuJissekiKihonNyutaisho to施設入退所情報(DbT3017KyufujissekiKihonEntity entity) {
        return new KyufuJissekiKihonNyutaisho(
                entity.getNyushoYMD(),
                entity.getTaishoYMD(),
                entity.getNyushoJitsunissu(),
                entity.getGaihakuNissu(),
                entity.getChushiRiyuNyushomaeJyokyoCode(),
                entity.getTaishogoJotaiCode());
    }

    private static KyufuJissekiKihonKyufuritsu to給付率情報(DbT3017KyufujissekiKihonEntity entity) {
        return new KyufuJissekiKihonKyufuritsu(
                entity.getHokenKyufuritsu(),
                entity.getKohi1Kyufuritsu(),
                entity.getKohi2Kyufuritsu(),
                entity.getKohi3Kyufuritsu());
    }

    private static KyufuJissekiKihonKohi to公費情報(DbT3017KyufujissekiKihonEntity entity) {
        return new KyufuJissekiKihonKohi(
                entity.getKohi1FutanshaNo(),
                entity.getKohi1JukyushaNo(),
                entity.getKohi2FutanshaNo(),
                entity.getKohi2JukyushaNo(),
                entity.getKohi3FutanshaNo(),
                entity.getKohi3JukyushaNo());
    }

    private static KyufuJissekiKihonGokeiCollection to合計情報List(DbT3017KyufujissekiKihonEntity entity) {

        int[] サービス単位 = {
            entity.getMaeHokenServiceTanisu(),
            entity.getAtoHokenServiceTanisu(),
            entity.getMaeKohi1ServiceTanisu(),
            entity.getAtoKohi1ServiceTanisu(),
            entity.getMaeKohi2ServiceTanisu(),
            entity.getAtoKohi2ServiceTanisu(),
            entity.getMaeKohi3ServiceTanisu(),
            entity.getAtoKohi3ServiceTanisu()
        };
        Decimal[] 保険料請求額 = {
            entity.getMaeHokenSeikyugaku(),
            entity.getAtoHokenSeikyugaku(),
            new Decimal(entity.getMaeKohi1Seikyugaku()),
            new Decimal(entity.getAtoKohi1Seikyugaku()),
            new Decimal(entity.getMaeKohi2Seikyugaku()),
            new Decimal(entity.getAtoKohi2Seikyugaku()),
            new Decimal(entity.getMaeKohi3Seikyugaku()),
            new Decimal(entity.getAtoKohi3Seikyugaku())
        };
        int[] 利用者負担額 = {
            entity.getMaeHokenRiyoshaFutangaku(),
            entity.getAtoHokenRiyoshaFutangaku(),
            entity.getMaeKohi1RiyoshaFutangaku(),
            entity.getAtoKohi1RiyoshaFutangaku(),
            entity.getMaeKohi2RiyoshaFutangaku(),
            entity.getAtoKohi2RiyoshaFutangaku(),
            entity.getMaeKohi3RiyoshaFutangaku(),
            entity.getAtoKohi3RiyoshaFutangaku()
        };
        Decimal[] 緊急時施設療養費保険請求分合計 = {
            entity.getMaeHokenKinkyuShisetsuRyoyoSeikyugaku(),
            entity.getAtoHokenKinkyuShisetsuRyoyoSeikyugaku(),
            new Decimal(entity.getMaeKohi1KinkyuShisetsuRyoyoSeikyugaku()),
            new Decimal(entity.getAtoKohi1KinkyuShisetsuRyoyoSeikyugaku()),
            new Decimal(entity.getMaeKohi2KinkyuShisetsuRyoyoSeikyugaku()),
            new Decimal(entity.getAtoKohi2KinkyuShisetsuRyoyoSeikyugaku()),
            new Decimal(entity.getMaeKohi3KinkyuShisetsuRyoyoSeikyugaku()),
            new Decimal(entity.getAtoKohi3KinkyuShisetsuRyoyoSeikyugaku())
        };
        Decimal[] 特定診療費公費請求分合計 = {
            entity.getMaeHokenTokuteiShinryohiSeikyugaku(),
            entity.getAtoHokenTokuteiShinryohiSeikyugaku(),
            new Decimal(entity.getMaeKohi1TokuteiShinryohiSeikyugaku()),
            new Decimal(entity.getAtoKohi1TokuteiShinryohiSeikyugaku()),
            new Decimal(entity.getMaeKohi2TokuteiShinryohiSeikyugaku()),
            new Decimal(entity.getAtoKohi2TokuteiShinryohiSeikyugaku()),
            new Decimal(entity.getMaeKohi3TokuteiShinryohiSeikyugaku()),
            new Decimal(entity.getAtoKohi3TokuteiShinryohiSeikyugaku())
        };
        int[] 特定入所者介護等請求額 = {
            entity.getMaeHokenTokuteiNyushoshaKaigoServiceHiSeikyugaku(),
            entity.getAtoHokenTokuteiNyushoshaKaigoServiceHiSeikyugaku(),
            entity.getMaeKohi1TokuteiNyushoshaKaigoServiceHiSeikyugaku(),
            entity.getAtoKohi1TokuteiNyushoshaKaigoServiceHiSeikyugaku(),
            entity.getMaeKohi2TokuteiNyushoshaKaigoServiceHiSeikyugaku(),
            entity.getAtoKohi2TokuteiNyushoshaKaigoServiceHiSeikyugaku(),
            entity.getMaeKohi3TokuteiNyushoshaKaigoServiceHiSeikyugaku(),
            entity.getAtoKohi3TokuteiNyushoshaKaigoServiceHiSeikyugaku()
        };

        List<KyufuJissekiKihonGokei> list = new ArrayList<>();
        for (int index = 0; index < 保険公費.length; index++) {
            list.add(new KyufuJissekiKihonGokei(
                    保険公費[index],
                    前後3[index],
                    new Decimal(サービス単位[index]),
                    保険料請求額[index],
                    new Decimal(利用者負担額[index]),
                    緊急時施設療養費保険請求分合計[index],
                    特定診療費公費請求分合計[index],
                    new Decimal(特定入所者介護等請求額[index])));
        }

        return new KyufuJissekiKihonGokeiCollection(list);
    }

    /**
     * 給付実績明細エンティティから給付実績明細情報を作成して返す。
     *
     * @param entities 給付実績明細エンティティList
     * @return 給付実績明細情報List
     */
    public static KyufuJissekiMeisaiCollection to給付実績明細List(List<DbT3018KyufujissekiMeisaiEntity> entities) {
        if (entities == null || entities.isEmpty()) {
            return new KyufuJissekiMeisaiCollection(Collections.EMPTY_LIST);
        }

        List<KyufuJissekiMeisai> list = new ArrayList<>();
        for (DbT3018KyufujissekiMeisaiEntity entity : entities) {

            RString[] 適要 = {entity.getTekiyo(), RString.EMPTY};
            int[] 単位 = {entity.getTanisu(), entity.getAtoTanisu()};
            int[] 回数日数 = {entity.getNissuKaisu(), entity.getAtoNissuKaisu()};
            int[] 公費1日数 = {entity.getKohi1TaishoNissuKaisu(), entity.getAtoKohi1TaishoNissuKaisu()};
            int[] 公費2日数 = {entity.getKohi2TaishoNissuKaisu(), entity.getAtoKohi2TaishoNissukaisu()};
            int[] 公費3日数 = {entity.getKohi3TaishoNissuKaisu(), entity.getAtoKohi3TaishoNissuKaisu()};
            int[] 公費1単位 = {entity.getKohi1TaishoServiceTanisu(), entity.getAtoKohi1TaishoServiceTanisu()};
            int[] 公費2単位 = {entity.getKohi2TaishoServiceTanisu(), entity.getAtoKohi2TaishoServiceTanisu()};
            int[] 公費3単位 = {entity.getKohi3TaishoServiceTanisu(), entity.getAtoKohi3TaishoServiceTanisu()};

            for (int index = 0; index < 前後1.length; index++) {
                list.add(new KyufuJissekiMeisai(
                        entity.getServiceShuruiCode().value(),
                        適要[index],
                        前後1[index],
                        new Decimal(単位[index]),
                        回数日数[index],
                        公費1日数[index], 公費2日数[index], 公費3日数[index],
                        new Decimal(entity.getServiceTanisu()),
                        公費1単位[index], 公費2単位[index], 公費3単位[index],
                        entity.getSaishinsaKaisu(),
                        entity.getKagoKaisu(),
                        entity.getShinsaYM()));
            }
        }

        return new KyufuJissekiMeisaiCollection(list);
    }

    /**
     * 給付実績集計エンティティから給付実績集計情報を作成して返す。
     *
     * @param entities 給付実績集計エンティティList
     * @return 給付実績集計情報List
     */
    public static KyufuJissekiShukeiCollection to給付実績集計List(List<DbT3033KyufujissekiShukeiEntity> entities) {
        if (entities == null || entities.isEmpty()) {
            return new KyufuJissekiShukeiCollection(Collections.EMPTY_LIST);
        }

        List<KyufuJissekiShukei> list = new ArrayList<>();
        for (DbT3033KyufujissekiShukeiEntity entity : entities) {

            int[] 短実日数 = {
                entity.getTankiNyushoJitsunissu(),
                entity.getAtoTankiNyushoJitsunissu(),
                entity.getTankiNyushoJitsunissu(),
                entity.getAtoTankiNyushoJitsunissu(),
                entity.getTankiNyushoJitsunissu(),
                entity.getAtoTankiNyushoJitsunissu(),
                entity.getTankiNyushoJitsunissu(),
                entity.getAtoTankiNyushoJitsunissu()
            };
            int[] 単位合計 = {
                entity.getHokenTanisuTotal(),
                entity.getAtoHokenTanisuTotal(),
                entity.getKohi1TanisuTotal(),
                entity.getAtoKohi1TanisuTotal(),
                entity.getKohi2TanisuTotal(),
                entity.getAtoKohi2TanisuTotal(),
                entity.getKohi3TanisuTotal(),
                entity.getAtoKohi3TanisuTotal()
            };
            Decimal[] 単位数単価 = {
                entity.getHokenTanisuTani(),
                new Decimal(0),
                new Decimal(0),
                new Decimal(0),
                new Decimal(0),
                new Decimal(0),
                new Decimal(0),
                new Decimal(0)
            };
            RString[] 請求額 = {
                entity.getHokenSeikyugaku(),
                entity.getAtoHokenSeikyugaku(),
                entity.getKohi1Seikyugaku(),
                entity.getAtoKohi1Seikyugaku(),
                entity.getKohi2Seikyugaku(),
                entity.getAtoKohi2Seikyugaku(),
                entity.getKohi3Seikyugaku(),
                entity.getAtoKohi3Seikyugaku()
            };
            int[] 利用者負担額 = {
                entity.getHokenRiyoshaFutangaku(),
                0,
                entity.getKohi1HonninFutangaku(),
                0,
                entity.getKohi2HonninFutangaku(),
                0,
                entity.getKohi3HonninFutangaku(),
                0
            };
            int[] 出来高単位合計 = {
                entity.getHokenDekidakaTanisuTotal(),
                entity.getAtoHokenDekidakaTanisuTotal(),
                entity.getKohi1DekidakaTanisuTotal(),
                entity.getAtoKohi1DekidakaTanisuTotal(),
                entity.getKohi2DekidakaTanisuTotal(),
                entity.getAtoKohi2DekidakaTanisuTotal(),
                entity.getKohi3DekidakaTanisuTotal(),
                entity.getAtoKohi3DekidakaTanisuTotal()
            };
            RString[] 出来高請求 = {
                entity.getHokenDekidakaSeikyugaku(),
                entity.getAtoHokenDekidakaSeikyugaku(),
                entity.getKohi1DekidakaSeikyugaku(),
                entity.getAtoKohi1DekidakaSeikyugaku(),
                entity.getKohi2DekidakaSeikyugaku(),
                entity.getAtoKohi2DekidakaSeikyugaku(),
                entity.getKohi3DekidakaSeikyugaku(),
                entity.getAtoKohi3DekidakaSeikyugaku()
            };
            int[] 出来高本人負担額 = {
                entity.getHokenDekidakaIryohiRiyoshaFutangaku(),
                0,
                entity.getKohi1DekidakaIryohiRiyoshaFutangaku(),
                0,
                entity.getKohi2DekidakaIryohiRiyoshaFutangaku(),
                0,
                entity.getKohi3DekidakaIryohiRiyoshaFutangaku(),
                0
            };

            for (int index = 0; index < 保険公費.length; index++) {
                list.add(new KyufuJissekiShukei(
                        entity.getServiceSyuruiCode().value(),
                        entity.getServiceJitsunissu(),
                        new Decimal(entity.getPlanTanisu()),
                        new Decimal(entity.getGendogakuKanriTaishoTanisu()),
                        new Decimal(entity.getGendogakuKanritaishogaiTanisu()),
                        entity.getTankiNyushoPlanNissu(),
                        保険公費[index],
                        前後3[index],
                        短実日数[index],
                        new Decimal(単位合計[index]),
                        単位数単価[index],
                        new Decimal(請求額[index].toString()),
                        new Decimal(利用者負担額[index]),
                        new Decimal(出来高単位合計[index]),
                        new Decimal(出来高請求[index].toString()),
                        new Decimal(出来高本人負担額[index]),
                        entity.getSaishinsaKaisu(),
                        entity.getKagoKaisu(),
                        entity.getShinsaYM()));
            }
        }

        return new KyufuJissekiShukeiCollection(list);
    }

    /**
     * 給付実績社会福祉法人軽減額エンティティから給付実績社会福祉法人軽減額情報を作成して返す。
     *
     * @param entities 給付実績社会福祉法人軽減額エンティティList
     * @return 給付実績社会福祉法人軽減額情報List
     */
    public static KyufuJissekiShafukuKeigenCollection to給付実績社会福祉法人軽減額List(
            List<DbT3030KyufuJissekiShakaiFukushiHojinKeigengakuEntity> entities) {
        if (entities == null || entities.isEmpty()) {
            return new KyufuJissekiShafukuKeigenCollection(Collections.EMPTY_LIST);
        }

        List<KyufuJissekiShafukuKeigen> list = new ArrayList<>();
        for (DbT3030KyufuJissekiShakaiFukushiHojinKeigengakuEntity entity : entities) {

            int[] 受領すべき利用者負担の総額 = {entity.getRiyoshaFutanTotal(), entity.getAtoRiyoshaFutanTotal()};
            int[] 軽減額 = {entity.getKeigengaku(), entity.getAtoKeigengaku()};
            int[] 軽減後利用者負担額 = {entity.getKeigengoRiyoshaFutangaku(), entity.getAtoKeigengoRiyoshaFutangaku()};

            for (int index = 0; index < 前後1.length; index++) {
                list.add(new KyufuJissekiShafukuKeigen(
                        new RString(entity.getKeigenritsu().toString()),
                        entity.getServiceSyuruiCode().value(),
                        前後1[index],
                        new Decimal(受領すべき利用者負担の総額[index]),
                        new Decimal(軽減額[index]),
                        new Decimal(軽減後利用者負担額[index]),
                        entity.getBiko(),
                        entity.getSaishinsaKaisu(),
                        entity.getKagoKaisu(),
                        entity.getShinsaYM()));
            }
        }

        return new KyufuJissekiShafukuKeigenCollection(list);
    }

    /**
     * 給付実績サービス計画費エンティティから給付実績サービス計画費情報を作成して返す。
     *
     * @param entities 給付実績サービス計画費エンティティList
     * @return 給付実績サービス計画費情報List
     */
    public static KyufuJissekiKyotakuServiceCollection to給付実績サービス計画費List(List<DbT3025KyufujissekiKyotakuServiceEntity> entities) {
        if (entities == null || entities.isEmpty()) {
            return new KyufuJissekiKyotakuServiceCollection(Collections.EMPTY_LIST);
        }

        List<KyufuJissekiKyotakuService> list = new ArrayList<>();
        for (DbT3025KyufujissekiKyotakuServiceEntity entity : entities) {

            RString[] 指定基準区分 = {
                entity.getShiteiKijunGaitoJigyoshaKubunCode(), RString.EMPTY,
                entity.getShiteiKijunGaitoJigyoshaKubunCode(), RString.EMPTY
            };
            FlexibleDate[] 届出日 = {
                entity.getKyotakuServiceSakuseiIraiYMD(), null,
                entity.getKyotakuServiceSakuseiIraiYMD(), null
            };
            RString[] サービス = {
                entity.getServiceCode().value(), RString.EMPTY,
                entity.getServiceCode().value(), RString.EMPTY
            };
            Decimal[] 単位数単価 = {
                entity.getTanisuTanka(), null,
                entity.getTanisuTanka(), null
            };
            Decimal[] 単位数 = {
                new Decimal(entity.getTanisu()), null,
                new Decimal(entity.getAtoTanisu()), null
            };
            Integer[] 回数 = {
                new Integer(entity.getKaisu()), null,
                new Integer(entity.getAtoKaisu()), null
            };
            Decimal[] サービス単位数 = {
                new Decimal(entity.getServiceTanisu()), new Decimal(entity.getServiceTanisuTotal()),
                new Decimal(entity.getAtoServiceTanisu()), new Decimal(entity.getAtoServiceTanisuTotal())
            };
            Decimal[] 請求金額 = {
                null, new Decimal(entity.getSeikyuKingaku()),
                null, new Decimal(entity.getAtoSeikyuKingaku())
            };
            RString[] 専門員番号 = {
                entity.getTantouKaigoShienSemmoninNo(), RString.EMPTY,
                entity.getTantouKaigoShienSemmoninNo(), RString.EMPTY,};
            Integer[] 再審査回数 = {
                new Integer(entity.getSaishinsaKaisu()), null,
                new Integer(entity.getSaishinsaKaisu()), null
            };
            Integer[] 過誤回数 = {
                new Integer(entity.getKagoKaisu()), null,
                new Integer(entity.getKagoKaisu()), null
            };
            FlexibleYearMonth[] 審査年月 = {
                entity.getShinsaYM(), null,
                entity.getShinsaYM(), null
            };
            RString[] 摘要 = {
                entity.getTekiyo(), RString.EMPTY,
                entity.getTekiyo(), RString.EMPTY
            };

            for (int index = 0; index < 明細合計.length; index++) {
                list.add(new KyufuJissekiKyotakuService(
                        指定基準区分[index],
                        届出日[index],
                        サービス[index],
                        単位数単価[index],
                        前後2[index],
                        明細合計[index],
                        単位数[index],
                        回数[index],
                        サービス単位数[index],
                        請求金額[index],
                        専門員番号[index],
                        再審査回数[index],
                        過誤回数[index],
                        審査年月[index],
                        摘要[index]));
            }
        }

        return new KyufuJissekiKyotakuServiceCollection(list);
    }

    /**
     * 給付実績福祉用具購入費エンティティから給付実績福祉用具購入費情報を作成して返す。
     *
     * @param entities 給付実績福祉用具購入費エンティティList
     * @return 給付実績福祉用具購入費情報List
     */
    public static KyufuJissekiYoguHanbaihiCollection to給付実績福祉用具購入費List(
            List<DbT3026KyufujissekiFukushiYoguHanbaihiEntity> entities) {
        if (entities == null || entities.isEmpty()) {
            return new KyufuJissekiYoguHanbaihiCollection(Collections.EMPTY_LIST);
        }

        List<KyufuJissekiYoguHanbaihi> list = new ArrayList<>();
        for (DbT3026KyufujissekiFukushiYoguHanbaihiEntity entity : entities) {
            list.add(new KyufuJissekiYoguHanbaihi(
                    entity.getServiceCode(),
                    entity.getFukushiyoguHanbaiYMD(),
                    entity.getFukushiyoguShohinName(),
                    entity.getFukushiyoguSyumokuCode(),
                    entity.getFukushiyoguSeizoJigyoshaName(),
                    entity.getFukushiyoguHanbaiJigyoshaName(),
                    new Decimal(entity.getHanbaiKingaku()),
                    entity.getShinsaYM(),
                    entity.getTekiyo()));
        }

        return new KyufuJissekiYoguHanbaihiCollection(list);
    }

    /**
     * 給付実績住宅改修費エンティティから給付実績住宅改修費情報を作成して返す。
     *
     * @param entities 給付実績住宅改修費エンティティList
     * @return 給付実績住宅改修費情報List
     */
    public static KyufuJissekiJutakuKaishuhiCollection to給付実績住宅改修費List(
            List<DbT3027KyufujissekiJutakuKaishuhiEntity> entities) {
        if (entities == null || entities.isEmpty()) {
            return new KyufuJissekiJutakuKaishuhiCollection(Collections.EMPTY_LIST);
        }

        List<KyufuJissekiJutakuKaishuhi> list = new ArrayList<>();
        for (DbT3027KyufujissekiJutakuKaishuhiEntity entity : entities) {
            list.add(new KyufuJissekiJutakuKaishuhi(
                    entity.getServiceCode(),
                    entity.getJutakuKaishuchakkoYMD(),
                    entity.getJutakuKaishuJigyoshaName(),
                    entity.getJuutakukaishuJyutakuAdress(),
                    new Decimal(entity.getKaishuKingaku()),
                    entity.getShinsaYM()));
        }

        return new KyufuJissekiJutakuKaishuhiCollection(list);
    }

    /**
     * 給付実績の特定入所者エンティティから給付実績の特定入所者情報を作成して返す。
     *
     * @param entities 給付実績の特定入所者エンティティList
     * @return 給付実績の特定入所者List
     */
    public static KyufuJissekiTokuteiNyushohiCollection to給付実績特定入所者費用List(
            List<DbT3029KyufujissekiTokuteiNyushosyaKaigoServiceHiyoEntity> entities) {
        if (entities == null || entities.isEmpty()) {
            return new KyufuJissekiTokuteiNyushohiCollection(Collections.EMPTY_LIST);
        }

        List<KyufuJissekiTokuteiNyushohi> list = new ArrayList<>();
        //前　明細
        for (DbT3029KyufujissekiTokuteiNyushosyaKaigoServiceHiyoEntity entity : entities) {
            list.add(
                    new KyufuJissekiTokuteiNyushohi(
                            new RString(entity.getServiceSyuruiCode().toString().concat(entity.getServiceKomokuCode().toString())),
                            new Decimal(entity.getFutanGendogaku()),
                            前後1[0],
                            明細,
                            new Decimal(entity.getHiyoTanka()),
                            entity.getNissu(),
                            new Decimal(entity.getHiyogaku()),
                            new Decimal(entity.getHokenbunSeikyugaku()),
                            new Decimal(entity.getRiyoshaFutangaku()),
                            entity.getKohi1Nissu(),
                            new Decimal(entity.getKohi1Futangaku()),
                            null,
                            null,
                            entity.getKohi2Nissu(),
                            new Decimal(entity.getKohi2Futangaku()),
                            null,
                            null,
                            entity.getKohi3Nissu(),
                            new Decimal(entity.getKohi3Futangaku()),
                            null,
                            null,
                            entity.getSaishinsaKaisu(),
                            entity.getKagoKaisu(),
                            entity.getShinsaYM()
                    ));
        }

        //前　合計
        list.add(new KyufuJissekiTokuteiNyushohi(
                null,
                null,
                前後1[0],
                合計,
                null,
                0,
                new Decimal(entities.get(0).getHiyogakuTotal()),
                new Decimal(entities.get(0).getHokenbunSeikyugakuTotal()),
                new Decimal(entities.get(0).getRiyoshaFutangakuTotal()),
                0,
                new Decimal(entities.get(0).getKohi1FutangakuTotal()),
                new Decimal(entities.get(0).getKohi1Seikyugaku()),
                new Decimal(entities.get(0).getKohi1HonninFutanGetsugaku()),
                0,
                new Decimal(entities.get(0).getKohi2FutangakuTotal()),
                new Decimal(entities.get(0).getKohi2Seikyugaku()),
                new Decimal(entities.get(0).getKohi2HonninFutanGetsugaku()),
                0,
                new Decimal(entities.get(0).getKohi3FutangakuTotal()),
                new Decimal(entities.get(0).getKohi3Seikyugaku()),
                new Decimal(entities.get(0).getKohi3HonninFutanGetsugaku()),
                0,
                0,
                null
        ));

        //後　明細
        for (DbT3029KyufujissekiTokuteiNyushosyaKaigoServiceHiyoEntity entity : entities) {
            list.add(
                    new KyufuJissekiTokuteiNyushohi(
                            new RString(entity.getServiceSyuruiCode().toString().concat(entity.getServiceKomokuCode().toString())),
                            new Decimal(entity.getFutanGendogaku()),
                            前後1[1],
                            明細,
                            new Decimal(entity.getAtoHiyoTanka()),
                            entity.getAtoNissu(),
                            new Decimal(entity.getAtoHiyogaku()),
                            new Decimal(entity.getAtoHokenbunSeikyugaku()),
                            new Decimal(entity.getAtoRiyoshaFutangaku()),
                            entity.getAtoKohi1Nissu(),
                            new Decimal(entity.getAtoKohi1Futangaku()),
                            null,
                            null,
                            entity.getAtoKohi2Nissu(),
                            new Decimal(entity.getAtoKohi2Futangaku()),
                            null,
                            null,
                            entity.getAtoKohi3Nissu(),
                            new Decimal(entity.getAtoKohi3Futangaku()),
                            null,
                            null,
                            entity.getSaishinsaKaisu(),
                            entity.getKagoKaisu(),
                            entity.getShinsaYM()
                    ));
        }

        //後　合計
        list.add(new KyufuJissekiTokuteiNyushohi(
                null,
                null,
                前後1[1],
                合計,
                null,
                0,
                new Decimal(entities.get(0).getAtoHiyogakuTotal()),
                new Decimal(entities.get(0).getAtoHokenbunSeikyugakuTotal()),
                new Decimal(entities.get(0).getAtoRiyoshaFutangakuTotal()),
                0,
                new Decimal(entities.get(0).getAtoKohi1FutangakuTotal()),
                new Decimal(entities.get(0).getAtoKohi1Seikyugaku()),
                new Decimal(entities.get(0).getAtoKohi1HonninFutanGetsugaku()),
                0,
                new Decimal(entities.get(0).getAtoKohi2FutangakuTotal()),
                new Decimal(entities.get(0).getAtoKohi2Seikyugaku()),
                new Decimal(entities.get(0).getAtoKohi2HonninFutanGetsugaku()),
                0,
                new Decimal(entities.get(0).getAtoKohi3FutangakuTotal()),
                new Decimal(entities.get(0).getAtoKohi3Seikyugaku()),
                new Decimal(entities.get(0).getAtoKohi3HonninFutanGetsugaku()),
                0,
                0,
                null
        ));

        return new KyufuJissekiTokuteiNyushohiCollection(list);
    }

}
