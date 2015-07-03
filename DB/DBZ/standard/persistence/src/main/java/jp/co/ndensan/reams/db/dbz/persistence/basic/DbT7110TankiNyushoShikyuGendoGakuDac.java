/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT7110TankiNyushoShikyuGendoGaku;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT7110TankiNyushoShikyuGendoGaku.shoriTimestamp;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT7110TankiNyushoShikyuGendoGaku.tekiyoKaishiYM;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT7110TankiNyushoShikyuGendoGaku.yoKaigoJotaiKubun;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT7110TankiNyushoShikyuGendoGakuEntity;
import jp.co.ndensan.reams.db.dbz.persistence.IModifiable;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 短期入所系支給限度額のデータアクセスクラスです。
 *
 * @author LDNS 宋文娟
 */
public class DbT7110TankiNyushoShikyuGendoGakuDac implements IModifiable<DbT7110TankiNyushoShikyuGendoGakuEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 主キーで短期入所系支給限度額を取得します。
     *
     * @param 要介護状態区分 YoKaigoJotaiKubun
     * @param 適用開始年月 TekiyoKaishiYM
     * @param 処理日時 ShoriTimestamp
     * @return DbT7110TankiNyushoShikyuGendoGakuEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT7110TankiNyushoShikyuGendoGakuEntity selectByKey(
            RString 要介護状態区分,
            FlexibleYearMonth 適用開始年月,
            YMDHMS 処理日時) throws NullPointerException {
        requireNonNull(要介護状態区分, UrSystemErrorMessages.値がnull.getReplacedMessage("要介護状態区分"));
        requireNonNull(適用開始年月, UrSystemErrorMessages.値がnull.getReplacedMessage("適用開始年月"));
        requireNonNull(処理日時, UrSystemErrorMessages.値がnull.getReplacedMessage("処理日時"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT7110TankiNyushoShikyuGendoGaku.class).
                where(and(
                                eq(yoKaigoJotaiKubun, 要介護状態区分),
                                eq(tekiyoKaishiYM, 適用開始年月),
                                eq(shoriTimestamp, 処理日時))).
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
     * 短期入所系支給限度額を追加します。
     *
     * @param entity 短期入所系支給限度額
     * @return 影響行数
     */
    @Transaction
    @Override
    public int insert(DbT7110TankiNyushoShikyuGendoGakuEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.insert(entity).execute();
    }

    /**
     * 短期入所系支給限度額をDBに更新します。
     *
     * @param entity 短期入所系支給限度額
     * @return 影響行数
     */
    @Transaction
    @Override
    public int update(DbT7110TankiNyushoShikyuGendoGakuEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.update(entity).execute();
    }

    /**
     * 短期入所系支給限度額をDBから削除します。（論理削除）
     *
     * @param entity 短期入所系支給限度額
     * @return 影響行数
     */
    @Transaction
    @Override
    public int delete(DbT7110TankiNyushoShikyuGendoGakuEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.delete(entity).execute();
    }

    // TODO 物理削除用メソッドが必要であるかは業務ごとに検討してください。
    /**
     * 短期入所系支給限度額を物理削除。
     *
     * @param entity 短期入所系支給限度額
     * @return 影響行数
     */
    @Transaction
    public int deletePhysical(DbT7110TankiNyushoShikyuGendoGakuEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.deletePhysical(entity).execute();
    }
}