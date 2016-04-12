/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.persistence.db.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3048ShokanFukushiYoguHanbaihi;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3048ShokanFukushiYoguHanbaihi.hiHokenshaNo;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3048ShokanFukushiYoguHanbaihi.hinmokuCode;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3048ShokanFukushiYoguHanbaihi.jigyoshaNo;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3048ShokanFukushiYoguHanbaihi.meisaiNo;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3048ShokanFukushiYoguHanbaihi.renban;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3048ShokanFukushiYoguHanbaihi.seiriNo;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3048ShokanFukushiYoguHanbaihi.serviceTeikyoYM;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3048ShokanFukushiYoguHanbaihi.yoshikiNo;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3048ShokanFukushiYoguHanbaihiEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.persistence.db.basic.ISaveable;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import jp.co.ndensan.reams.uz.uza.util.db.Order;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.by;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.in;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.like;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.max;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.not;
import jp.co.ndensan.reams.uz.uza.util.db.util.DbAccessors;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 償還払請求福祉用具販売費のデータアクセスクラスです。
 * 
 * @reamsid_L DBC-1020-070 chenaoqi
 */
public class DbT3048ShokanFukushiYoguHanbaihiDac implements ISaveable<DbT3048ShokanFukushiYoguHanbaihiEntity> {

    private static final RString MSG_NAME_HIHOKENSHA = new RString("被保険者番号");
    private static final RString MSG_NAME_SERVICETEIKYOYM = new RString("サービス提供年月");
    private static final RString MSG_NAME_SERINO = new RString("整理番号");
    private static final RString MSG_NAME_YOSHIKINO = new RString("様式番号");
    private static final RString MSG_NAME_JIGYOSHANO = new RString("事業者番号");
    private static final RString MSG_NAME_MEISAINO = new RString("明細番号");
    @InjectSession
    private SqlSession session;

    /**
     * 主キーで償還払請求福祉用具販売費を取得します。
     *
     * @param 被保険者番号 HiHokenshaNo
     * @param サービス提供年月 ServiceTeikyoYM
     * @param 整理番号 SeiriNo
     * @param 事業者番号 JigyoshaNo
     * @param 様式番号 YoshikiNo
     * @param 明細番号 MeisaiNo
     * @param 連番 Renban
     * @return DbT3048ShokanFukushiYoguHanbaihiEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT3048ShokanFukushiYoguHanbaihiEntity selectByKey(
            HihokenshaNo 被保険者番号,
            FlexibleYearMonth サービス提供年月,
            RString 整理番号,
            JigyoshaNo 事業者番号,
            RString 様式番号,
            RString 明細番号,
            RString 連番) throws NullPointerException {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(サービス提供年月, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス提供年月"));
        requireNonNull(整理番号, UrSystemErrorMessages.値がnull.getReplacedMessage("整理番号"));
        requireNonNull(事業者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("事業者番号"));
        requireNonNull(様式番号, UrSystemErrorMessages.値がnull.getReplacedMessage("様式番号"));
        requireNonNull(明細番号, UrSystemErrorMessages.値がnull.getReplacedMessage("明細番号"));
        requireNonNull(連番, UrSystemErrorMessages.値がnull.getReplacedMessage("連番"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3048ShokanFukushiYoguHanbaihi.class).
                where(and(
                                eq(hiHokenshaNo, 被保険者番号),
                                eq(serviceTeikyoYM, サービス提供年月),
                                eq(seiriNo, 整理番号),
                                eq(jigyoshaNo, 事業者番号),
                                eq(yoshikiNo, 様式番号),
                                eq(meisaiNo, 明細番号),
                                eq(renban, 連番))).
                toObject(DbT3048ShokanFukushiYoguHanbaihiEntity.class);
    }

    /**
     * 償還払請求福祉用具販売費を全件返します。
     *
     * @return List<DbT3048ShokanFukushiYoguHanbaihiEntity>
     */
    @Transaction
    public List<DbT3048ShokanFukushiYoguHanbaihiEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3048ShokanFukushiYoguHanbaihi.class).
                toList(DbT3048ShokanFukushiYoguHanbaihiEntity.class);
    }

    /**
     * DbT3048ShokanFukushiYoguHanbaihiEntityを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    @Override
    public int save(DbT3048ShokanFukushiYoguHanbaihiEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("償還払請求福祉用具販売費エンティティ"));
        // TODO 物理削除であるかは業務ごとに検討してください。
        //return DbAccessorMethodSelector.saveByForDeletePhysical(new DbAccessorNormalType(session), entity);
        return DbAccessors.saveBy(new DbAccessorNormalType(session), entity);
    }

    /**
     * DbT3048ShokanFukushiYoguHanbaihiEntityを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    public int delete(DbT3048ShokanFukushiYoguHanbaihiEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("償還払請求福祉用具販売費エンティティ"));
        return DbAccessors.saveOrDeletePhysicalBy(new DbAccessorNormalType(session), entity);
    }

    /**
     * キーより、償還払請求福祉用具販売費情報リストを取得する。
     *
     * @param 被保険者番号 HihokenshaNo
     * @param サービス提供年月 FlexibleYearMonth
     * @param 整理番号 RString
     * @param 事業者番号 JigyoshaNo
     * @param 様式番号 RString
     * @param 明細番号 RString
     * @return List<DbT3048ShokanFukushiYoguHanbaihiEntity>
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public List<DbT3048ShokanFukushiYoguHanbaihiEntity> select償還払請求福祉用具販売費リスト(
            HihokenshaNo 被保険者番号,
            FlexibleYearMonth サービス提供年月,
            RString 整理番号,
            JigyoshaNo 事業者番号,
            RString 様式番号,
            RString 明細番号) throws NullPointerException {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage(MSG_NAME_HIHOKENSHA.toString()));
        requireNonNull(サービス提供年月,
                UrSystemErrorMessages.値がnull.getReplacedMessage(MSG_NAME_SERVICETEIKYOYM.toString()));
        requireNonNull(整理番号, UrSystemErrorMessages.値がnull.getReplacedMessage(MSG_NAME_SERINO.toString()));
        requireNonNull(事業者番号, UrSystemErrorMessages.値がnull.getReplacedMessage(MSG_NAME_JIGYOSHANO.toString()));
        requireNonNull(様式番号, UrSystemErrorMessages.値がnull.getReplacedMessage(MSG_NAME_YOSHIKINO.toString()));
        requireNonNull(明細番号, UrSystemErrorMessages.値がnull.getReplacedMessage(MSG_NAME_MEISAINO.toString()));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3048ShokanFukushiYoguHanbaihi.class).
                where(and(
                                eq(hiHokenshaNo, 被保険者番号),
                                eq(serviceTeikyoYM, サービス提供年月),
                                eq(seiriNo, 整理番号),
                                eq(jigyoshaNo, 事業者番号),
                                eq(yoshikiNo, 様式番号),
                                eq(meisaiNo, 明細番号))).
                order(by(meisaiNo, Order.ASC)).
                toList(DbT3048ShokanFukushiYoguHanbaihiEntity.class);
    }

    /**
     * 最大連番を取得する。
     *
     * @param 被保険者番号 被保険者番号
     * @param サービス提供年月 サービス提供年月
     * @param 整理番号 整理番号
     * @param 事業者番号 事業者番号
     * @param 様式番号 様式番号
     * @param 明細番号 明細番号
     * @return DbT3048ShokanFukushiYoguHanbaihiEntity 検索結果
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    public DbT3048ShokanFukushiYoguHanbaihiEntity getMAX連番(
            HihokenshaNo 被保険者番号,
            FlexibleYearMonth サービス提供年月,
            RString 整理番号,
            JigyoshaNo 事業者番号,
            RString 様式番号,
            RString 明細番号) throws NullPointerException {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage(MSG_NAME_HIHOKENSHA.toString()));
        requireNonNull(サービス提供年月,
                UrSystemErrorMessages.値がnull.getReplacedMessage(MSG_NAME_SERVICETEIKYOYM.toString()));
        requireNonNull(整理番号, UrSystemErrorMessages.値がnull.getReplacedMessage(MSG_NAME_SERINO.toString()));
        requireNonNull(事業者番号, UrSystemErrorMessages.値がnull.getReplacedMessage(MSG_NAME_JIGYOSHANO.toString()));
        requireNonNull(様式番号, UrSystemErrorMessages.値がnull.getReplacedMessage(MSG_NAME_YOSHIKINO.toString()));
        requireNonNull(明細番号, UrSystemErrorMessages.値がnull.getReplacedMessage(MSG_NAME_MEISAINO.toString()));
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.selectSpecific(max(renban)).
                table(DbT3048ShokanFukushiYoguHanbaihi.class).
                where(and(eq(hiHokenshaNo, 被保険者番号),
                                eq(serviceTeikyoYM, サービス提供年月),
                                eq(seiriNo, 整理番号),
                                eq(jigyoshaNo, 事業者番号),
                                eq(yoshikiNo, 様式番号),
                                eq(meisaiNo, 明細番号))).
                toObject(DbT3048ShokanFukushiYoguHanbaihiEntity.class);
    }

    /**
     * select品目コード
     *
     * @param 被保険者番号 被保険者番号
     * @param サービス提供年月 サービス提供年月
     * @param arrList arrList
     * @param 整理番号 整理番号
     * @return List<DbT3048ShokanFukushiYoguHanbaihiEntity>
     */
    @Transaction
    public List<DbT3048ShokanFukushiYoguHanbaihiEntity> select品目コード(HihokenshaNo 被保険者番号, FlexibleYearMonth サービス提供年月,
            List<RString> arrList, RString 整理番号) {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(サービス提供年月, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス提供年月"));
        requireNonNull(arrList, UrSystemErrorMessages.値がnull.getReplacedMessage("arrList"));
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        if (整理番号 == null || 整理番号.isEmpty()) {
            return accessor.select().
                    table(DbT3048ShokanFukushiYoguHanbaihi.class).
                    where(and(
                                    eq(hiHokenshaNo, 被保険者番号),
                                    like(serviceTeikyoYM, サービス提供年月.getYear().toString() + "%"),
                                    in(hinmokuCode, arrList)
                            )).
                    toList(DbT3048ShokanFukushiYoguHanbaihiEntity.class);
        } else {
            return accessor.select().
                    table(DbT3048ShokanFukushiYoguHanbaihi.class).
                    where(and(
                                    eq(hiHokenshaNo, 被保険者番号),
                                    like(serviceTeikyoYM, サービス提供年月.getYear().toString() + "%"),
                                    not(eq(seiriNo, 整理番号)),
                                    in(hinmokuCode, arrList)
                            )).
                    toList(DbT3048ShokanFukushiYoguHanbaihiEntity.class);
        }
    }
}
