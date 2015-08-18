/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.persistence.db.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3002KyodoShoriyoJukyushaIdoKihonSofu;
import static jp.co.ndensan.reams.db.dbc.entity.basic.DbT3002KyodoShoriyoJukyushaIdoKihonSofu.*;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntity;
import jp.co.ndensan.reams.db.dbz.persistence.basic.ISaveable;
import jp.co.ndensan.reams.db.dbx.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import jp.co.ndensan.reams.uz.uza.util.db.util.DbAccessorMethodSelector;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 共同処理用受給者異動基本送付のデータアクセスクラスです。
 */
public class DbT3002KyodoShoriyoJukyushaIdoKihonSofuDac implements ISaveable<DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 主キーで共同処理用受給者異動基本送付を取得します。
     *
     * @param 異動年月日 IdoYMD
     * @param 異動区分コード IdoKubunCode
     * @param 受給者異動事由 JukyushaIdoJiyu
     * @param 証記載保険者番号 ShoKisaiHokenshaNo
     * @param 被保険者番号 HiHokenshaNo
     * @param 履歴番号 RirekiNo
     * @return DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntity selectByKey(
            FlexibleDate 異動年月日,
            RString 異動区分コード,
            RString 受給者異動事由,
            HokenshaNo 証記載保険者番号,
            HihokenshaNo 被保険者番号,
            Decimal 履歴番号) throws NullPointerException {
        requireNonNull(異動年月日, UrSystemErrorMessages.値がnull.getReplacedMessage("異動年月日"));
        requireNonNull(異動区分コード, UrSystemErrorMessages.値がnull.getReplacedMessage("異動区分コード"));
        requireNonNull(受給者異動事由, UrSystemErrorMessages.値がnull.getReplacedMessage("受給者異動事由"));
        requireNonNull(証記載保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("証記載保険者番号"));
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("履歴番号"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3002KyodoShoriyoJukyushaIdoKihonSofu.class).
                where(and(
                                eq(idoYMD, 異動年月日),
                                eq(idoKubunCode, 異動区分コード),
                                eq(jukyushaIdoJiyu, 受給者異動事由),
                                eq(shoKisaiHokenshaNo, 証記載保険者番号),
                                eq(hiHokenshaNo, 被保険者番号),
                                eq(rirekiNo, 履歴番号))).
                toObject(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntity.class);
    }

    /**
     * 共同処理用受給者異動基本送付を全件返します。
     *
     * @return List<DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntity>
     */
    @Transaction
    public List<DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3002KyodoShoriyoJukyushaIdoKihonSofu.class).
                toList(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntity.class);
    }

    /**
     * DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    @Override
    public int save(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("共同処理用受給者異動基本送付エンティティ"));
        // TODO 物理削除であるかは業務ごとに検討してください。
        //return DbAccessorMethodSelector.saveByForDeletePhysical(new DbAccessorNormalType(session), entity);
        return DbAccessorMethodSelector.saveBy(new DbAccessorNormalType(session), entity);
    }
}
