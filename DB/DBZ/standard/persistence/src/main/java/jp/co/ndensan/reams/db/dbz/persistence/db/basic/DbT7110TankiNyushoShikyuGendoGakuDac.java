/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.db.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7110TankiNyushoShikyuGendoGaku;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7110TankiNyushoShikyuGendoGaku.rirekiNo;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7110TankiNyushoShikyuGendoGaku.tekiyoKaishiYM;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7110TankiNyushoShikyuGendoGaku.yoKaigoJotaiKubun;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7110TankiNyushoShikyuGendoGakuEntity;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import jp.co.ndensan.reams.uz.uza.util.db.util.DbAccessors;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 短期入所系支給限度額のデータアクセスクラスです。
 */
public class DbT7110TankiNyushoShikyuGendoGakuDac implements ISaveable<DbT7110TankiNyushoShikyuGendoGakuEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 主キーで短期入所系支給限度額を取得します。
     *
     * @param 要介護状態区分 YoKaigoJotaiKubun
     * @param 適用開始年月 TekiyoKaishiYM
     * @param 履歴番号 RirekiNo
     * @return DbT7110TankiNyushoShikyuGendoGakuEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT7110TankiNyushoShikyuGendoGakuEntity selectByKey(
            RString 要介護状態区分,
            FlexibleYearMonth 適用開始年月,
            int 履歴番号) throws NullPointerException {
        requireNonNull(要介護状態区分, UrSystemErrorMessages.値がnull.getReplacedMessage("要介護状態区分"));
        requireNonNull(適用開始年月, UrSystemErrorMessages.値がnull.getReplacedMessage("適用開始年月"));
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("履歴番号"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT7110TankiNyushoShikyuGendoGaku.class).
                where(and(
                                eq(yoKaigoJotaiKubun, 要介護状態区分),
                                eq(tekiyoKaishiYM, 適用開始年月),
                                eq(rirekiNo, 履歴番号))).
                toObject(DbT7110TankiNyushoShikyuGendoGakuEntity.class);
    }

    /**
     * 短期入所系支給限度額を全件返します。
     *
     * @return List<DbT7110TankiNyushoShikyuGendoGakuEntity>
     */
    @Transaction
    public List<DbT7110TankiNyushoShikyuGendoGakuEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT7110TankiNyushoShikyuGendoGaku.class).
                toList(DbT7110TankiNyushoShikyuGendoGakuEntity.class);
    }

    /**
     * DbT7110TankiNyushoShikyuGendoGakuEntityを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    @Override
    public int save(DbT7110TankiNyushoShikyuGendoGakuEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("短期入所系支給限度額エンティティ"));
        // TODO 物理削除であるかは業務ごとに検討してください。
        //return DbAccessorMethodSelector.saveByForDeletePhysical(new DbAccessorNormalType(session), entity);
        return DbAccessors.saveBy(new DbAccessorNormalType(session), entity);
    }
}