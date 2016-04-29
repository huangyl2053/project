/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.db.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1013KyokaisoSochiShinsei;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1013KyokaisoSochiShinsei.hihokenshaNo;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1013KyokaisoSochiShinsei.linkNo;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1013KyokaisoSochiShinsei.rirekiNo;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1013KyokaisoSochiShinseiEntity;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import jp.co.ndensan.reams.uz.uza.util.db.util.DbAccessors;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 境界層措置申請のデータアクセスクラスです。
 */
public class DbT1013KyokaisoSochiShinseiDac implements ISaveable<DbT1013KyokaisoSochiShinseiEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 主キーで境界層措置申請を取得します。
     *
     * @param 被保険者番号 HihokenshaNo
     * @param 履歴番号 RirekiNo
     * @param リンク番号 int
     * @return DbT1013KyokaisoSochiShinseiEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT1013KyokaisoSochiShinseiEntity selectByKey(
            HihokenshaNo 被保険者番号,
            int 履歴番号,
            int リンク番号) throws NullPointerException {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("履歴番号"));
        requireNonNull(リンク番号, UrSystemErrorMessages.値がnull.getReplacedMessage("リンク番号"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT1013KyokaisoSochiShinsei.class).
                where(and(
                                eq(hihokenshaNo, 被保険者番号),
                                eq(rirekiNo, 履歴番号),
                                eq(linkNo, リンク番号))).
                toObject(DbT1013KyokaisoSochiShinseiEntity.class);
    }

    /**
     * 境界層措置申請を全件返します。
     *
     * @return List<DbT1013KyokaisoSochiShinseiEntity>
     */
    @Transaction
    public List<DbT1013KyokaisoSochiShinseiEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT1013KyokaisoSochiShinsei.class).
                toList(DbT1013KyokaisoSochiShinseiEntity.class);
    }

    /**
     * DbT1013KyokaisoSochiShinseiEntityを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    @Override
    public int save(DbT1013KyokaisoSochiShinseiEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("境界層措置申請エンティティ"));
        // TODO 物理削除であるかは業務ごとに検討してください。
        //return DbAccessorMethodSelector.saveByForDeletePhysical(new DbAccessorNormalType(session), entity);
        return DbAccessors.saveBy(new DbAccessorNormalType(session), entity);
    }
}
