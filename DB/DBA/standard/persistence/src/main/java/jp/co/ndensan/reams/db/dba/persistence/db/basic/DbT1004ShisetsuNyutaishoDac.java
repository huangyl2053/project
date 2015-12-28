/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.persistence.db.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1002TekiyoJogaisha.shikibetsuCode;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1004ShisetsuNyutaisho;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1004ShisetsuNyutaishoEntity;
import jp.co.ndensan.reams.db.dbz.persistence.db.basic.ISaveable;
import static jp.co.ndensan.reams.ua.uax.entity.db.basic.UaT0050JutogaiRuiseki.rirekiNo;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.by;
import jp.co.ndensan.reams.uz.uza.util.db.util.DbAccessors;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 介護保険施設入退所のデータアクセスクラスです。
 */
public class DbT1004ShisetsuNyutaishoDac implements ISaveable<DbT1004ShisetsuNyutaishoEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 主キーで介護保険施設入退所を取得します。
     *
     * @param 識別コード 識別コード
     * @param 履歴番号 履歴番号
     * @return DbT1004ShisetsuNyutaishoEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT1004ShisetsuNyutaishoEntity selectByKey(
            ShikibetsuCode 識別コード,
            int 履歴番号) throws NullPointerException {
        requireNonNull(識別コード, UrSystemErrorMessages.値がnull.getReplacedMessage("識別コード"));
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("履歴番号"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT1004ShisetsuNyutaisho.class).
                where(and(
                                eq(shikibetsuCode, 識別コード),
                                eq(rirekiNo, 履歴番号))).
                toObject(DbT1004ShisetsuNyutaishoEntity.class);
    }

    /**
     * 介護保険施設入退所を全件返します。
     *
     * @return DbT1004ShisetsuNyutaishoEntityの{@code list}
     */
    @Transaction
    public List<DbT1004ShisetsuNyutaishoEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT1004ShisetsuNyutaisho.class).
                toList(DbT1004ShisetsuNyutaishoEntity.class);
    }

    /**
     * DbT1004ShisetsuNyutaishoEntityを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    @Override
    public int save(DbT1004ShisetsuNyutaishoEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("介護保険施設入退所エンティティ"));
        // TODO 物理削除であるかは業務ごとに検討してください。
        //return DbAccessors.saveByForDeletePhysical(new DbAccessorNormalType(session), entity);
        return DbAccessors.saveBy(new DbAccessorNormalType(session), entity);
    }

    /**
     * 入退所日リストの取得です。
     *
     * @param 識別コード 識別コード
     * @param 台帳種別 台帳種別
     * @param 入所施設種類 入所施設種類
     * @return 入退所日リスト
     * @throws NullPointerException
     */
    public List<DbT1004ShisetsuNyutaishoEntity> get入退所日(ShikibetsuCode 識別コード,
            RString 台帳種別, RString 入所施設種類) throws NullPointerException {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.select().
                table(DbT1004ShisetsuNyutaisho.class).
                where(and(eq(DbT1004ShisetsuNyutaisho.shikibetsuCode, 識別コード),
                                eq(DbT1004ShisetsuNyutaisho.daichoShubetsu, 台帳種別),
                                eq(DbT1004ShisetsuNyutaisho.nyushoShisetsuShurui, 入所施設種類))).
                order(by(DbT1004ShisetsuNyutaisho.nyushoYMD)).
                toList(DbT1004ShisetsuNyutaishoEntity.class);
    }
}
