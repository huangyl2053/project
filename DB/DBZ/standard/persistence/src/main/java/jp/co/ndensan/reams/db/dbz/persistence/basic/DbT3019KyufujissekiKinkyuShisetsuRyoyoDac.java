/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.KokanShikibetsuNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.NyuryokuShikibetsuNo;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT3019KyufujissekiKinkyuShisetsuRyoyo;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3019KyufujissekiKinkyuShisetsuRyoyo.hiHokenshaNo;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3019KyufujissekiKinkyuShisetsuRyoyo.inputShikibetsuNo;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3019KyufujissekiKinkyuShisetsuRyoyo.jigyoshoNo;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3019KyufujissekiKinkyuShisetsuRyoyo.kokanJohoShikibetsuNo;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3019KyufujissekiKinkyuShisetsuRyoyo.recodeJunjiNo;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3019KyufujissekiKinkyuShisetsuRyoyo.recodeShubetsuCode;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3019KyufujissekiKinkyuShisetsuRyoyo.serviceTeikyoYM;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3019KyufujissekiKinkyuShisetsuRyoyo.shokisaiHokenshaNo;
import static jp.co.ndensan.reams.db.dbz.entity.basic.DbT3019KyufujissekiKinkyuShisetsuRyoyo.toshiNo;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT3019KyufujissekiKinkyuShisetsuRyoyoEntity;
import jp.co.ndensan.reams.db.dbz.persistence.IModifiable;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 給付実績緊急時施設療養のデータアクセスクラスです。
 *
 * @author LDNS 鄭雪双
 */
public class DbT3019KyufujissekiKinkyuShisetsuRyoyoDac implements IModifiable<DbT3019KyufujissekiKinkyuShisetsuRyoyoEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 主キーで給付実績緊急時施設療養を取得します。
     *
     * @param 交換情報識別番号 KokanJohoShikibetsuNo
     * @param 入力識別番号 InputShikibetsuNo
     * @param レコード種別コード RecodeShubetsuCode
     * @param 証記載保険者番号 ShokisaiHokenshaNo
     * @param 被保険者番号 HiHokenshaNo
     * @param サービス提供年月 ServiceTeikyoYM
     * @param 事業所番号 JigyoshoNo
     * @param 通し番号 ToshiNo
     * @param 緊急時施設療養情報レコード順次番号 RecodeJunjiNo
     * @return DbT3019KyufujissekiKinkyuShisetsuRyoyoEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT3019KyufujissekiKinkyuShisetsuRyoyoEntity selectByKey(
            KokanShikibetsuNo 交換情報識別番号,
            NyuryokuShikibetsuNo 入力識別番号,
            RString レコード種別コード,
            HokenshaNo 証記載保険者番号,
            HihokenshaNo 被保険者番号,
            FlexibleYearMonth サービス提供年月,
            JigyoshaNo 事業所番号,
            RString 通し番号,
            RString 緊急時施設療養情報レコード順次番号) throws NullPointerException {
        requireNonNull(交換情報識別番号, UrSystemErrorMessages.値がnull.getReplacedMessage("交換情報識別番号"));
        requireNonNull(入力識別番号, UrSystemErrorMessages.値がnull.getReplacedMessage("入力識別番号"));
        requireNonNull(レコード種別コード, UrSystemErrorMessages.値がnull.getReplacedMessage("レコード種別コード"));
        requireNonNull(証記載保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("証記載保険者番号"));
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(サービス提供年月, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス提供年月"));
        requireNonNull(事業所番号, UrSystemErrorMessages.値がnull.getReplacedMessage("事業所番号"));
        requireNonNull(通し番号, UrSystemErrorMessages.値がnull.getReplacedMessage("通し番号"));
        requireNonNull(緊急時施設療養情報レコード順次番号, UrSystemErrorMessages.値がnull.getReplacedMessage("緊急時施設療養情報レコード順次番号"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3019KyufujissekiKinkyuShisetsuRyoyo.class).
                where(and(
                                eq(kokanJohoShikibetsuNo, 交換情報識別番号),
                                eq(inputShikibetsuNo, 入力識別番号),
                                eq(recodeShubetsuCode, レコード種別コード),
                                eq(shokisaiHokenshaNo, 証記載保険者番号),
                                eq(hiHokenshaNo, 被保険者番号),
                                eq(serviceTeikyoYM, サービス提供年月),
                                eq(jigyoshoNo, 事業所番号),
                                eq(toshiNo, 通し番号),
                                eq(recodeJunjiNo, 緊急時施設療養情報レコード順次番号))).
                toObject(DbT3019KyufujissekiKinkyuShisetsuRyoyoEntity.class);
    }

    /**
     * 給付実績緊急時施設療養を全件返します。
     *
     * @return List<DbT3019KyufujissekiKinkyuShisetsuRyoyoEntity>
     */
    @Transaction
    public List<DbT3019KyufujissekiKinkyuShisetsuRyoyoEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT3019KyufujissekiKinkyuShisetsuRyoyo.class).
                toList(DbT3019KyufujissekiKinkyuShisetsuRyoyoEntity.class);
    }

    @Transaction
    @Override
    public int insert(DbT3019KyufujissekiKinkyuShisetsuRyoyoEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.insert(entity).execute();
    }

    @Transaction
    @Override
    public int update(DbT3019KyufujissekiKinkyuShisetsuRyoyoEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.update(entity).execute();
    }

    @Transaction
    @Override
    public int delete(DbT3019KyufujissekiKinkyuShisetsuRyoyoEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.delete(entity).execute();
    }

    // TODO 物理削除用メソッドが必要であるかは業務ごとに検討してください。
    /**
     * 物理削除を行う。
     *
     * @param entity DbT3019KyufujissekiKinkyuShisetsuRyoyoEntity
     * @return int 件数
     */
    @Transaction
    public int deletePhysical(DbT3019KyufujissekiKinkyuShisetsuRyoyoEntity entity) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.deletePhysical(entity).execute();
    }
}