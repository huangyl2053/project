/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.persistence.db.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3107ShokanMeisaiJushochiTokurei;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3107ShokanMeisaiJushochiTokurei.hiHokenshaNo;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3107ShokanMeisaiJushochiTokurei.jigyoshaNo;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3107ShokanMeisaiJushochiTokurei.meisaiNo;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3107ShokanMeisaiJushochiTokurei.seiriNp;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3107ShokanMeisaiJushochiTokurei.serviceTeikyoYM;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3107ShokanMeisaiJushochiTokurei.yoshikiNo;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3107ShokanMeisaiJushochiTokureiEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.persistence.db.basic.ISaveable;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import jp.co.ndensan.reams.uz.uza.util.db.ITrueFalseCriteria;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import jp.co.ndensan.reams.uz.uza.util.db.util.DbAccessors;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 償還払請求明細・住所地特例のデータアクセスクラスです。
 */
public class DbT3107ShokanMeisaiJushochiTokureiDac implements ISaveable<DbT3107ShokanMeisaiJushochiTokureiEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 主キーで償還払請求明細・住所地特例を取得します。
     *
     * @param 被保険者番号 HiHokenshaNo
     * @param サービス提供年月 ServiceTeikyoYM
     * @param 整理番号 SeiriNp
     * @param 事業者番号 JigyoshaNo
     * @param 様式番号 YoshikiNo
     * @return DbT3107ShokanMeisaiJushochiTokureiEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT3107ShokanMeisaiJushochiTokureiEntity selectByKey(
            HihokenshaNo 被保険者番号,
            FlexibleYearMonth サービス提供年月,
            RString 整理番号,
            JigyoshaNo 事業者番号,
            RString 様式番号) throws NullPointerException {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(サービス提供年月, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス提供年月"));
        requireNonNull(整理番号, UrSystemErrorMessages.値がnull.getReplacedMessage("整理番号"));
        requireNonNull(事業者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("事業者番号"));
        requireNonNull(様式番号, UrSystemErrorMessages.値がnull.getReplacedMessage("様式番号"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3107ShokanMeisaiJushochiTokurei.class).
                where(and(
                                eq(hiHokenshaNo, 被保険者番号),
                                eq(serviceTeikyoYM, サービス提供年月),
                                eq(seiriNp, 整理番号),
                                eq(jigyoshaNo, 事業者番号),
                                eq(yoshikiNo, 様式番号))).
                toObject(DbT3107ShokanMeisaiJushochiTokureiEntity.class);
    }

    /**
     * 償還払請求明細・住所地特例を全件返します。
     *
     * @return List<DbT3107ShokanMeisaiJushochiTokureiEntity>
     */
    @Transaction
    public List<DbT3107ShokanMeisaiJushochiTokureiEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3107ShokanMeisaiJushochiTokurei.class).
                toList(DbT3107ShokanMeisaiJushochiTokureiEntity.class);
    }

    /**
     * DbT3107ShokanMeisaiJushochiTokureiEntityを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    @Override
    public int save(DbT3107ShokanMeisaiJushochiTokureiEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("償還払請求明細・住所地特例エンティティ"));
        // TODO 物理削除であるかは業務ごとに検討してください。
        //return DbAccessorMethodSelector.saveByForDeletePhysical(new DbAccessorNormalType(session), entity);
        return DbAccessors.saveBy(new DbAccessorNormalType(session), entity);
    }

    /**
     * DbT3107ShokanMeisaiJushochiTokureiEntityを登録します。delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    public int delete(DbT3107ShokanMeisaiJushochiTokureiEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("償還払請求明細・住所地特例エンティティ"));
        return DbAccessors.saveOrDeletePhysicalBy(new DbAccessorNormalType(session), entity);
    }

    /**
     * 取得された件数を返却する
     *
     * @param 被保険者番号 被保険者番号
     * @param サービス提供年月 サービス提供年月
     * @param 整理番号 整理番号
     * @param 事業者番号 事業者番号
     * @param 様式番号 様式番号
     * @param 明細番号 明細番号
     * @return 取得された件数
     * @throws NullPointerException Exception
     */
    public int selectデータ件数(
            HihokenshaNo 被保険者番号,
            FlexibleYearMonth サービス提供年月,
            RString 整理番号,
            JigyoshaNo 事業者番号,
            RString 様式番号,
            RString 明細番号) throws NullPointerException {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(サービス提供年月, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス提供年月"));
        requireNonNull(整理番号, UrSystemErrorMessages.値がnull.getReplacedMessage("整理番号"));
        requireNonNull(事業者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("事業者番号"));
        requireNonNull(様式番号, UrSystemErrorMessages.値がnull.getReplacedMessage("様式番号"));
        requireNonNull(明細番号, UrSystemErrorMessages.値がnull.getReplacedMessage("明細番号"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3107ShokanMeisaiJushochiTokurei.class).
                where(and(
                                eq(hiHokenshaNo, 被保険者番号),
                                eq(serviceTeikyoYM, サービス提供年月),
                                eq(seiriNp, 整理番号),
                                eq(jigyoshaNo, 事業者番号),
                                eq(yoshikiNo, 様式番号),
                                eq(meisaiNo, 明細番号))).getCount();
    }

    /**
     * 償還払請求明細・住所地特例を全件返します。
     *
     * @param 被保険者番号 被保険者番号
     * @param サービス提供年月 サービス提供年月
     * @param 整理番号 整理番号
     * @param 事業者番号 事業者番号
     * @param 様式番号 様式番号
     * @param 明細番号 明細番号
     * @return List<DbT3107ShokanMeisaiJushochiTokureiEntity>
     */
    @Transaction
    public List<DbT3107ShokanMeisaiJushochiTokureiEntity> select証明書削除(
            HihokenshaNo 被保険者番号,
            FlexibleYearMonth サービス提供年月,
            RString 整理番号,
            JigyoshaNo 事業者番号,
            RString 様式番号,
            RString 明細番号) {

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        ITrueFalseCriteria iTrueFalseCriteria
                = getiTrueFalseCriteria(被保険者番号, サービス提供年月, 整理番号, 事業者番号, 様式番号, 明細番号);

        return accessor.select().
                table(DbT3107ShokanMeisaiJushochiTokurei.class).
                where(iTrueFalseCriteria).
                toList(DbT3107ShokanMeisaiJushochiTokureiEntity.class);
    }

    private ITrueFalseCriteria getiTrueFalseCriteria(HihokenshaNo 被保険者番号,
            FlexibleYearMonth サービス提供年月,
            RString 整理番号,
            JigyoshaNo 事業者番号,
            RString 様式番号,
            RString 明細番号) {
        ITrueFalseCriteria iTrueFalseCriteria;
        if (事業者番号 == null && 様式番号 == null && 明細番号 == null) {
            iTrueFalseCriteria = and(
                    eq(hiHokenshaNo, 被保険者番号),
                    eq(serviceTeikyoYM, サービス提供年月),
                    eq(seiriNp, 整理番号));
        } else {
            iTrueFalseCriteria = and(
                    eq(hiHokenshaNo, 被保険者番号),
                    eq(serviceTeikyoYM, サービス提供年月),
                    eq(seiriNp, 整理番号),
                    eq(jigyoshaNo, 事業者番号),
                    eq(yoshikiNo, 様式番号),
                    eq(meisaiNo, 明細番号));
        }
        return iTrueFalseCriteria;
    }
}
