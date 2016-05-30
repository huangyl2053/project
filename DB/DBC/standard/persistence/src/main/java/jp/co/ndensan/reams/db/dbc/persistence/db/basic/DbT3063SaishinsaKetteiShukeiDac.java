/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.persistence.db.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3063SaishinsaKetteiShukei;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3063SaishinsaKetteiShukei.hokenshaKubun;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3063SaishinsaKetteiShukei.rirekiNo;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3063SaishinsaKetteiShukei.toriatsukaiYM;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3063SaishinsaKetteiShukeiEntity;
import jp.co.ndensan.reams.db.dbz.persistence.db.basic.ISaveable;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import static jp.co.ndensan.reams.uz.uza.util.db.Order.DESC;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.by;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import jp.co.ndensan.reams.uz.uza.util.db.util.DbAccessors;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 再審査決定集計のデータアクセスクラスです。
 */
public class DbT3063SaishinsaKetteiShukeiDac implements ISaveable<DbT3063SaishinsaKetteiShukeiEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 主キーで再審査決定集計を取得します。
     *
     * @param 取扱年月 ToriatsukaiYM
     * @param 保険者区分 HokenshaKubun
     * @param 履歴番号 RirekiNo
     * @return DbT3063SaishinsaKetteiShukeiEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT3063SaishinsaKetteiShukeiEntity selectByKey(
            FlexibleYearMonth 取扱年月,
            RString 保険者区分,
            Decimal 履歴番号) throws NullPointerException {
        requireNonNull(取扱年月, UrSystemErrorMessages.値がnull.getReplacedMessage("取扱年月"));
        requireNonNull(保険者区分, UrSystemErrorMessages.値がnull.getReplacedMessage("保険者区分"));
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("履歴番号"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3063SaishinsaKetteiShukei.class).
                where(and(
                                eq(toriatsukaiYM, 取扱年月),
                                eq(hokenshaKubun, 保険者区分),
                                eq(rirekiNo, 履歴番号))).
                toObject(DbT3063SaishinsaKetteiShukeiEntity.class);
    }

    /**
     * 再審査決定集計を全件返します。
     *
     * @return List<DbT3063SaishinsaKetteiShukeiEntity>
     */
    @Transaction
    public List<DbT3063SaishinsaKetteiShukeiEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3063SaishinsaKetteiShukei.class).
                toList(DbT3063SaishinsaKetteiShukeiEntity.class);
    }

    /**
     * DbT3063SaishinsaKetteiShukeiEntityを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    @Override
    public int save(DbT3063SaishinsaKetteiShukeiEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("再審査決定集計エンティティ"));
        // TODO 物理削除であるかは業務ごとに検討してください。
        //return DbAccessorMethodSelector.saveByForDeletePhysical(new DbAccessorNormalType(session), entity);
        return DbAccessors.saveBy(new DbAccessorNormalType(session), entity);
    }

    /**
     * 主キーで再審査決定集計を取得します。
     *
     * @param 取扱年月 ToriatsukaiYM
     * @param 保険者区分 HokenshaKubun
     * @return DbT3063SaishinsaKetteiShukeiEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT3063SaishinsaKetteiShukeiEntity selectByKey(
            FlexibleYearMonth 取扱年月,
            RString 保険者区分) throws NullPointerException {
        requireNonNull(取扱年月, UrSystemErrorMessages.値がnull.getReplacedMessage("取扱年月"));
        requireNonNull(保険者区分, UrSystemErrorMessages.値がnull.getReplacedMessage("保険者区分"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3063SaishinsaKetteiShukei.class).
                where(and(
                                eq(toriatsukaiYM, 取扱年月),
                                eq(hokenshaKubun, 保険者区分)))
                .order(by(rirekiNo, DESC)).limit(1).
                toObject(DbT3063SaishinsaKetteiShukeiEntity.class);
    }

    /**
     * DbT3063SaishinsaKetteiShukeiEntityyを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    public int delete(DbT3063SaishinsaKetteiShukeiEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("償還払支給判定結果エンティティ"));
        return DbAccessors.saveOrDeletePhysicalBy(new DbAccessorNormalType(session), entity);
    }
}
