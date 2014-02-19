/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.basic;

import java.util.List;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5001NinteiShinseiJoho;
import static jp.co.ndensan.reams.db.dbe.entity.basic.DbT5001NinteiShinseiJoho.*;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5001NinteiShinseiJohoEntity;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ShichosonCode;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.ShinseishoKanriNo;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.DateRoundingType;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.Range;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessor;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.*;

/**
 * 認定申請情報テーブルから情報を取得するクラスです。
 *
 * @author n8178 城間篤人
 */
public class NinteiShinseiJohoDac implements INinteiShinseiJohoDac {

    @InjectSession
    private SqlSession session;

    @Override
    public DbT5001NinteiShinseiJohoEntity select(ShinseishoKanriNo 申請書管理番号) {
        DbAccessor accessor = new DbAccessor(session);
        return accessor.select()
                .table(DbT5001NinteiShinseiJoho.class)
                .where(eq(shinseishoKanriNo, 申請書管理番号))
                .toObject(DbT5001NinteiShinseiJohoEntity.class);
    }

    @Override
    public List<DbT5001NinteiShinseiJohoEntity> selectAllBy認定申請年月日(ShichosonCode 市町村コード, Range<FlexibleDate> 認定申請年月日範囲) {
        DbAccessor accessor = new DbAccessor(session);
        return accessor.select()
                .table(DbT5001NinteiShinseiJoho.class)
                .where(and(eq(shichosonCode, 市町村コード),
                eq(torisageYMD, FlexibleDate.MIN),
                leq(認定申請年月日範囲.getFrom().toRDate(DateRoundingType.同月の歴上日), ninteiShinseiYMD),
                leq(ninteiShinseiYMD, 認定申請年月日範囲.getTo().toRDate(DateRoundingType.同月の歴上日))))
                .toList(DbT5001NinteiShinseiJohoEntity.class);
    }

    @Override
    public List<DbT5001NinteiShinseiJohoEntity> selectAllBy取下げ年月日(ShichosonCode 市町村コード, Range<FlexibleDate> 取下げ年月日範囲) {
        DbAccessor accessor = new DbAccessor(session);
        return accessor.select()
                .table(DbT5001NinteiShinseiJoho.class)
                .where(and(eq(shichosonCode, 市町村コード),
                not(eq(torisageYMD, FlexibleDate.MIN)),
                leq(取下げ年月日範囲.getFrom().toRDate(DateRoundingType.同月の歴上日), torisageYMD),
                leq(torisageYMD, 取下げ年月日範囲.getTo().toRDate(DateRoundingType.同月の歴上日))))
                .toList(DbT5001NinteiShinseiJohoEntity.class);
    }

    @Override
    public int update(DbT5001NinteiShinseiJohoEntity entity) {
        DbAccessor accessor = new DbAccessor(session);
        return accessor.update(entity).execute();
    }
}
