/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.db.basic;

import java.util.List;
import jp.co.ndensan.reams.db.dbe.definition.core.enumeratedtype.ShinsakaiKaisaiBashoJokyo;
import jp.co.ndensan.reams.db.dbe.definition.core.valueobject.ShinsakaiKaisaiBashoCode;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT5104ShinsakaiKaisaiBashoJoho;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT5104ShinsakaiKaisaiBashoJohoEntity;
import jp.co.ndensan.reams.db.dbz.persistence.IDeletable;
import jp.co.ndensan.reams.db.dbz.persistence.IReplaceable;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.*;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 審査会開催場所情報テーブルから情報を取得するクラスです。
 *
 * @author N1013 松本直樹
 */
public class ShinsakaiKaisaiBashoDac implements IReplaceable<DbT5104ShinsakaiKaisaiBashoJohoEntity>,
        IDeletable<DbT5104ShinsakaiKaisaiBashoJohoEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 審査会開催場所コードを指定して、審査会開催場所情報を取得します。
     *
     * @param 審査会開催場所 審査会開催場所
     * @return 審査会開催場所Entity
     */
    @Transaction
    public DbT5104ShinsakaiKaisaiBashoJohoEntity select(ShinsakaiKaisaiBashoCode 審査会開催場所) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.select()
                .table(DbT5104ShinsakaiKaisaiBashoJoho.class)
                .where(eq(DbT5104ShinsakaiKaisaiBashoJoho.shinsakaiKaisaiBashoCode, 審査会開催場所.value()))
                .toObject(DbT5104ShinsakaiKaisaiBashoJohoEntity.class);
    }

    /**
     * 審査会開催場所コード、開催場所状況を指定して、審査会開催場所情報を取得します。
     *
     * @param 審査会開催場所 審査会開催場所
     * @param 開催場所状況 審査会開催場所状況
     * @return 審査会開催場所Entity
     */
    @Transaction
    public DbT5104ShinsakaiKaisaiBashoJohoEntity select(ShinsakaiKaisaiBashoCode 審査会開催場所, ShinsakaiKaisaiBashoJokyo 開催場所状況) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.select()
                .table(DbT5104ShinsakaiKaisaiBashoJoho.class)
                .where(and(eq(DbT5104ShinsakaiKaisaiBashoJoho.shinsakaiKaisaiBashoCode, 審査会開催場所.value()),
                eq(DbT5104ShinsakaiKaisaiBashoJoho.shinsakaiKaisaiBashoJokyo, 開催場所状況.is有効())))
                .toObject(DbT5104ShinsakaiKaisaiBashoJohoEntity.class);
    }

    /**
     * 審査会開催場所テーブルにある全件を取得します。
     *
     * @return 審査会開催場所Entityリスト
     */
    @Transaction
    public List<DbT5104ShinsakaiKaisaiBashoJohoEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.select()
                .table(DbT5104ShinsakaiKaisaiBashoJoho.class)
                .toList(DbT5104ShinsakaiKaisaiBashoJohoEntity.class);
    }

    /**
     * 審査会開催場所テーブルにある有効な開催場所を全件取得します。
     *
     * @param 開催場所状況 開催場所状況
     * @return 審査会開催場所Entityリスト
     */
    @Transaction
    public List<DbT5104ShinsakaiKaisaiBashoJohoEntity> selectAll(ShinsakaiKaisaiBashoJokyo 開催場所状況) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.select()
                .table(DbT5104ShinsakaiKaisaiBashoJoho.class)
                .where(eq(DbT5104ShinsakaiKaisaiBashoJoho.shinsakaiKaisaiBashoJokyo, 開催場所状況.is有効()))
                .toList(DbT5104ShinsakaiKaisaiBashoJohoEntity.class);
    }

    @Override
    public int insertOrUpdate(DbT5104ShinsakaiKaisaiBashoJohoEntity entity) {
        if (getMatchRowCount(entity) == 0) {
            return insert(entity);
        } else {
            return update(entity);
        }
    }

    /**
     * 審査会開催場所情報に対し、追加を行います。
     *
     * @param entity 審査会開催場所Entity
     * @return 追加結果
     */
    @Override
    public int insert(DbT5104ShinsakaiKaisaiBashoJohoEntity entity) {
        DbAccessorNormalType dbAccessor = new DbAccessorNormalType(session);
        return dbAccessor.insert(entity).execute();
    }

    /**
     * 審査会開催場所情報に対し、更新を行います。
     *
     * @param entity 審査会開催場所Entity
     * @return 更新結果
     */
    @Override
    public int update(DbT5104ShinsakaiKaisaiBashoJohoEntity entity) {
        DbAccessorNormalType dbAccessor = new DbAccessorNormalType(session);
        return dbAccessor.update(entity).execute();
    }

    @Override
    public int delete(DbT5104ShinsakaiKaisaiBashoJohoEntity entity) {
        DbAccessorNormalType dbAccessor = new DbAccessorNormalType(session);
        return dbAccessor.delete(entity).execute();
    }

    /**
     * 審査会開催場所の件数を取得します。
     *
     * @param entity 審査会開催場所情報エンティティ
     * @return 取得件数
     */
    private int getMatchRowCount(DbT5104ShinsakaiKaisaiBashoJohoEntity entity) {
        DbAccessorNormalType dbAccessor = new DbAccessorNormalType(session);

        return dbAccessor.
                select().
                table(DbT5104ShinsakaiKaisaiBashoJoho.class).
                where(eq(DbT5104ShinsakaiKaisaiBashoJoho.shinsakaiKaisaiBashoCode, entity.getShinsakaiKaisaiBashoCode())).
                getCount();
    }
}