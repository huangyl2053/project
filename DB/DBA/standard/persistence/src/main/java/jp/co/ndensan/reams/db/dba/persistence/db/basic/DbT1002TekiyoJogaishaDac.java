/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.persistence.db.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1001HihokenshaDaicho.edaNo;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1002TekiyoJogaisha;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1002TekiyoJogaisha.idoYMD;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1002TekiyoJogaisha.kaijoYMD;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1002TekiyoJogaisha.shikibetsuCode;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1002TekiyoJogaisha.tekiyoYMD;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1002TekiyoJogaishaEntity;
import jp.co.ndensan.reams.db.dbz.persistence.db.basic.ISaveable;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.leq;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.lt;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.not;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.or;
import jp.co.ndensan.reams.uz.uza.util.db.util.DbAccessors;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 適用除外者のデータアクセスクラスです。
 */
public class DbT1002TekiyoJogaishaDac implements ISaveable<DbT1002TekiyoJogaishaEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 主キーで適用除外者を取得します。
     *
     * @param 識別コード ShikibetsuCode
     * @param 異動日 IdoYMD
     * @param 枝番 EdaNo
     * @return DbT1002TekiyoJogaishaEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT1002TekiyoJogaishaEntity selectByKey(
            ShikibetsuCode 識別コード,
            FlexibleDate 異動日,
            RString 枝番) throws NullPointerException {
        requireNonNull(識別コード, UrSystemErrorMessages.値がnull.getReplacedMessage("識別コード"));
        requireNonNull(異動日, UrSystemErrorMessages.値がnull.getReplacedMessage("異動日"));
        requireNonNull(枝番, UrSystemErrorMessages.値がnull.getReplacedMessage("枝番"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT1002TekiyoJogaisha.class).
                where(and(
                                eq(shikibetsuCode, 識別コード),
                                eq(idoYMD, 異動日),
                                eq(edaNo, 枝番))).
                toObject(DbT1002TekiyoJogaishaEntity.class);
    }

    /**
     * 適用除外者を全件返します。
     *
     * @return DbT1002TekiyoJogaishaEntityの{@code list}
     */
    @Transaction
    public List<DbT1002TekiyoJogaishaEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT1002TekiyoJogaisha.class).
                toList(DbT1002TekiyoJogaishaEntity.class);
    }

    /**
     * DbT1002TekiyoJogaishaEntityを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    @Override
    public int save(DbT1002TekiyoJogaishaEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("適用除外者エンティティ"));
        // TODO 物理削除であるかは業務ごとに検討してください。
        //return DbAccessors.saveOrDeletePhysicalBy(new DbAccessorNormalType(session), entity);
        return DbAccessors.saveBy(new DbAccessorNormalType(session), entity);
    }

    /**
     * 適用除外者情報件数を返します。
     *
     * @param 入所日 FlexibleDate
     * @param 退所日 FlexibleDate
     * @return 件数
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public int getCount(FlexibleDate 入所日, FlexibleDate 退所日) {
        requireNonNull(入所日, UrSystemErrorMessages.値がnull.getReplacedMessage("入所日"));
        requireNonNull(退所日, UrSystemErrorMessages.値がnull.getReplacedMessage("退所日"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.select()
                .table(DbT1002TekiyoJogaisha.class)
                .where(not(or(and(
                                                lt(tekiyoYMD, 入所日),
                                                leq(kaijoYMD, 入所日)),
                                        and(
                                                leq(退所日, tekiyoYMD),
                                                lt(退所日, kaijoYMD)))))
                .getCount();
    }
}