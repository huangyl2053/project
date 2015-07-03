/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT3004KyodoShoriyoJukyushaIdoKogakuSofu;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3004KyodoShoriyoJukyushaIdoKogakuSofu.hiHokenshaNo;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3004KyodoShoriyoJukyushaIdoKogakuSofu.idoKubunCode;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3004KyodoShoriyoJukyushaIdoKogakuSofu.idoYMD;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3004KyodoShoriyoJukyushaIdoKogakuSofu.jukyushaIdoJiyu;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3004KyodoShoriyoJukyushaIdoKogakuSofu.shoKisaiHokenshaNo;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3004KyodoShoriyoJukyushaIdoKogakuSofu.shoriTimestamp;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity;
import jp.co.ndensan.reams.db.dbz.persistence.IModifiable;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 共同処理用受給者異動高額送付のデータアクセスクラスです。
 *
 * @author LDNS 鄭雪双
 */
public class DbT3004KyodoShoriyoJukyushaIdoKogakuSofuDac implements IModifiable<DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 主キーで共同処理用受給者異動高額送付を取得します。
     *
     * @param 異動年月日 IdoYMD
     * @param 異動区分コード IdoKubunCode
     * @param 受給者異動事由 JukyushaIdoJiyu
     * @param 証記載保険者番号 ShoKisaiHokenshaNo
     * @param 被保険者番号 HiHokenshaNo
     * @param 処理日時 ShoriTimestamp
     * @return DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity selectByKey(
            FlexibleDate 異動年月日,
            RString 異動区分コード,
            RString 受給者異動事由,
            HokenshaNo 証記載保険者番号,
            HihokenshaNo 被保険者番号,
            YMDHMS 処理日時) throws NullPointerException {
        requireNonNull(異動年月日, UrSystemErrorMessages.値がnull.getReplacedMessage("異動年月日"));
        requireNonNull(異動区分コード, UrSystemErrorMessages.値がnull.getReplacedMessage("異動区分コード"));
        requireNonNull(受給者異動事由, UrSystemErrorMessages.値がnull.getReplacedMessage("受給者異動事由"));
        requireNonNull(証記載保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("証記載保険者番号"));
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(処理日時, UrSystemErrorMessages.値がnull.getReplacedMessage("処理日時"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3004KyodoShoriyoJukyushaIdoKogakuSofu.class).
                where(and(
                                eq(idoYMD, 異動年月日),
                                eq(idoKubunCode, 異動区分コード),
                                eq(jukyushaIdoJiyu, 受給者異動事由),
                                eq(shoKisaiHokenshaNo, 証記載保険者番号),
                                eq(hiHokenshaNo, 被保険者番号),
                                eq(shoriTimestamp, 処理日時))).
                toObject(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity.class);
    }

    /**
     * 共同処理用受給者異動高額送付を全件返します。
     *
     * @return List<DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity>
     */
    @Transaction
    public List<DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3004KyodoShoriyoJukyushaIdoKogakuSofu.class).
                toList(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity.class);
    }

    @Transaction
    @Override
    public int insert(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.insert(entity).execute();
    }

    @Transaction
    @Override
    public int update(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.update(entity).execute();
    }

    @Transaction
    @Override
    public int delete(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.delete(entity).execute();
    }

    // TODO 物理削除用メソッドが必要であるかは業務ごとに検討してください。
    /**
     * 物理削除を行う。
     *
     * @param entity DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity
     * @return int 件数
     */
    @Transaction
    public int deletePhysical(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.deletePhysical(entity).execute();
    }
}