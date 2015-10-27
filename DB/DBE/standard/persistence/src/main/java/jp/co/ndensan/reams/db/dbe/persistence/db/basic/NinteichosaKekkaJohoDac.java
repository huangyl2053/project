/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.db.basic;

import java.util.List;
import jp.co.ndensan.reams.db.dbe.definition.core.valueobject.NinteichosaIraiRirekiNo;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT5008NinteichosaKekkaJoho;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT5008NinteichosaKekkaJohoEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.persistence.IDeletable;
import jp.co.ndensan.reams.db.dbz.persistence.IReplaceable;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;
import static jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT5008NinteichosaKekkaJoho.*;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.*;

/**
 * 要介護認定調査結果情報のデータアクセスクラスです。
 *
 * @author N8156 宮本 康
 */
public class NinteichosaKekkaJohoDac implements IReplaceable<DbT5008NinteichosaKekkaJohoEntity>, IDeletable<DbT5008NinteichosaKekkaJohoEntity> {

    @InjectSession
    private SqlSession session;

    @Transaction
    public DbT5008NinteichosaKekkaJohoEntity select(ShinseishoKanriNo 申請書管理番号, NinteichosaIraiRirekiNo 認定調査履歴番号) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        List<DbT5008NinteichosaKekkaJohoEntity> list = accessor.select()
                .table(DbT5008NinteichosaKekkaJoho.class)
                .where(and(
                eq(shinseishoKanriNo, 申請書管理番号),
                eq(ninteichosaRirekiNo, 認定調査履歴番号)))
                .toList(DbT5008NinteichosaKekkaJohoEntity.class);
        return !list.isEmpty() ? list.get(0) : null;
    }

    @Override
    @Transaction
    public int insertOrUpdate(DbT5008NinteichosaKekkaJohoEntity entity) {
        return getMatchRowCount(entity) == 0 ? insert(entity) : update(entity);
    }

    @Override
    @Transaction
    public int insert(DbT5008NinteichosaKekkaJohoEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.insert(entity).execute();
    }

    @Override
    @Transaction
    public int update(DbT5008NinteichosaKekkaJohoEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.update(entity).execute();
    }

    @Override
    @Transaction
    public int delete(DbT5008NinteichosaKekkaJohoEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.delete(entity).execute();
    }

    @Transaction
    private int getMatchRowCount(DbT5008NinteichosaKekkaJohoEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.select()
                .table(DbT5008NinteichosaKekkaJoho.class)
                .where(and(
                eq(shinseishoKanriNo, entity.getShinseishoKanriNo()),
                eq(ninteichosaRirekiNo, entity.getNinteichosaRirekiNo())))
                .getCount();
    }
}