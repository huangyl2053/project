/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.db.basic;

import java.util.List;
import jp.co.ndensan.reams.db.dbe.definition.core.enumeratedtype.ChosainJokyo;
import jp.co.ndensan.reams.db.dbe.definition.core.valueobject.kaigoninteichosainno.KaigoNinteichosainNo;
//import jp.co.ndensan.reams.db.dbz.definition.valueobject.KaigoJigyoshaNo;
import jp.co.ndensan.reams.uz.uza.biz.KaigoJigyoshaNo;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT7013ChosainJoho;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT7013ChosainJohoEntity;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import static jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT7013ChosainJoho.*;
import jp.co.ndensan.reams.db.dbz.persistence.IDeletable;
import jp.co.ndensan.reams.db.dbz.persistence.IReplaceable;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.*;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 介護認定調査員情報のデータアクセスクラスです。
 *
 * @author N8187 久保田 英男
 */
public class KaigoNinteichosainDac implements IReplaceable<DbT7013ChosainJohoEntity>, IDeletable<DbT7013ChosainJohoEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 引数の条件に該当する調査員情報エンティティを取得します。
     *
     * @param 市町村コード 市町村コード
     * @param 介護事業者番号 介護事業者番号
     * @param 介護調査員番号 介護調査員番号
     * @return 調査員情報エンティティ
     */
    @Transaction
    public DbT7013ChosainJohoEntity select(LasdecCode 市町村コード, KaigoJigyoshaNo 介護事業者番号, KaigoNinteichosainNo 介護調査員番号) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.select()
                .table(DbT7013ChosainJoho.class)
                .where(and(
                                eq(shichosonCode, 市町村コード),
                                eq(kaigoJigyoshaNo, 介護事業者番号),
                                eq(kaigoChosainNo, 介護調査員番号.value())))
                .toObject(DbT7013ChosainJohoEntity.class);
    }

    /**
     * 引数の条件に該当する調査員情報エンティティを取得します。
     *
     * @param 市町村コード 市町村コード
     * @param 介護事業者番号 介護事業者番号
     * @param 介護調査員番号 介護調査員番号
     * @param 調査員の状況 調査員の状況
     * @return 調査員情報エンティティ
     */
    @Transaction
    public DbT7013ChosainJohoEntity select(LasdecCode 市町村コード, KaigoJigyoshaNo 介護事業者番号, KaigoNinteichosainNo 介護調査員番号, ChosainJokyo 調査員の状況) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.select()
                .table(DbT7013ChosainJoho.class)
                .where(and(
                                eq(shichosonCode, 市町村コード),
                                eq(kaigoJigyoshaNo, 介護事業者番号),
                                eq(kaigoChosainNo, 介護調査員番号.value()),
                                eq(kaigoChosainJokyo, 調査員の状況.有効.getCode())))
                .toObject(DbT7013ChosainJohoEntity.class);
    }

    /**
     * 引数の条件に該当する調査員情報エンティティをリストで取得します。
     *
     * @param 市町村コード 市町村コード
     * @param 介護事業者番号 介護事業者番号
     * @return 調査員情報エンティティのリスト
     */
    @Transaction
    public List<DbT7013ChosainJohoEntity> selectAll(LasdecCode 市町村コード, KaigoJigyoshaNo 介護事業者番号) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor
                .select()
                .table(DbT7013ChosainJoho.class)
                .where(and(
                                eq(shichosonCode, 市町村コード),
                                eq(kaigoJigyoshaNo, 介護事業者番号)))
                .toList(DbT7013ChosainJohoEntity.class);
    }

    /**
     * 引数の条件に該当する調査員情報エンティティをリストで取得します。
     *
     * @param 市町村コード 市町村コード
     * @param 介護事業者番号 介護事業者番号
     * @param 調査員の状況 調査員の状況
     * @return 調査員情報エンティティのリスト
     */
    @Transaction
    public List<DbT7013ChosainJohoEntity> selectAll(LasdecCode 市町村コード, KaigoJigyoshaNo 介護事業者番号, ChosainJokyo 調査員の状況) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor
                .select()
                .table(DbT7013ChosainJoho.class)
                .where(and(
                                eq(shichosonCode, 市町村コード),
                                eq(kaigoJigyoshaNo, 介護事業者番号),
                                eq(kaigoChosainJokyo, 調査員の状況.有効.getCode())))
                .toList(DbT7013ChosainJohoEntity.class);
    }

    /**
     * 引数の条件に該当する調査員情報エンティティをリストで取得します。
     *
     * @param 市町村コード 市町村コード
     * @param 調査員の状況 調査員の状況
     * @return 調査員情報エンティティのリスト
     */
    @Transaction
    public List<DbT7013ChosainJohoEntity> selectAll(LasdecCode 市町村コード, ChosainJokyo 調査員の状況) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor
                .select()
                .table(DbT7013ChosainJoho.class)
                .where(and(
                                eq(shichosonCode, 市町村コード),
                                eq(kaigoChosainJokyo, 調査員の状況.有効.getCode())))
                .toList(DbT7013ChosainJohoEntity.class);
    }

    /**
     * 引数の条件に該当する調査員情報エンティティをリストで取得します。
     *
     * @param 市町村コード 市町村コード
     * @return 調査員情報エンティティのリスト
     */
    @Transaction
    public List<DbT7013ChosainJohoEntity> selectAll(LasdecCode 市町村コード) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor
                .select()
                .table(DbT7013ChosainJoho.class)
                .where(eq(shichosonCode, 市町村コード))
                .toList(DbT7013ChosainJohoEntity.class);
    }

    @Override
    public int insertOrUpdate(DbT7013ChosainJohoEntity entity) {
        return getMatchRowCount(entity) == 0 ? insert(entity) : update(entity);
    }

    @Override
    public int insert(DbT7013ChosainJohoEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.insert(entity).execute();
    }

    @Override
    public int update(DbT7013ChosainJohoEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.update(entity).execute();
    }

    @Override
    public int delete(DbT7013ChosainJohoEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.delete(entity).execute();
    }

    private int getMatchRowCount(DbT7013ChosainJohoEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.select()
                .table(DbT7013ChosainJoho.class)
                .where(and(
                                eq(shichosonCode, entity.getShichosonCode().value()),
                                eq(kaigoJigyoshaNo, entity.getKaigoJigyoshaNo()),
                                eq(kaigoChosainNo, entity.getKaigoChosainNo())))
                .getCount();
    }
}