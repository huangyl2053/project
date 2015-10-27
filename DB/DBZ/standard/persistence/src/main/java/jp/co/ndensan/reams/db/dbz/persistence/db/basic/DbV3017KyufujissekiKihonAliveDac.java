/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.db.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3017KyufujissekiKihon;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3017KyufujissekiKihon.hiHokenshaNo;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3017KyufujissekiKihon.hokenshaNo;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3017KyufujissekiKihon.inputShikibetsuNo;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3017KyufujissekiKihon.jigyoshoNo;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3017KyufujissekiKihon.kokanShikibetsuNo;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3017KyufujissekiKihon.kyufuJissekiKubunCode;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3017KyufujissekiKihon.kyufuSakuseiKubunCode;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3017KyufujissekiKihon.recodeShubetsuCode;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3017KyufujissekiKihon.serviceTeikyoYM;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3017KyufujissekiKihon.toshiNo;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3017KyufujissekiKihonEntity;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import jp.co.ndensan.reams.uz.uza.util.db.util.DbAccessors;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 給付実績基本Aliveのデータアクセスクラスです。
 */
public class DbV3017KyufujissekiKihonAliveDac implements ISaveable<DbV3017KyufujissekiKihonEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 主キーで給付実績基本Aliveを取得します。
     *
     * @param 交換情報識別番号 交換情報識別番号
     * @param 入力識別番号 入力識別番号
     * @param レコード種別コード レコード種別コード
     * @param 証記載保険者番号 証記載保険者番号
     * @param 被保険者番号 被保険者番号
     * @param サービス提供年月 サービス提供年月
     * @param 事業所番号 事業所番号
     * @param 給付実績情報作成区分コード 給付実績情報作成区分コード
     * @param 給付実績区分コード 給付実績区分コード
     * @param 通し番号 通し番号
     * @return DbV3017KyufujissekiKihonEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbV3017KyufujissekiKihonEntity selectByKey(
            ShikibetsuCode 交換情報識別番号,
            ShikibetsuCode 入力識別番号,
            RString レコード種別コード,
            HokenshaNo 証記載保険者番号,
            HihokenshaNo 被保険者番号,
            FlexibleYearMonth サービス提供年月,
            JigyoshaNo 事業所番号,
            RString 給付実績情報作成区分コード,
            RString 給付実績区分コード,
            RString 通し番号) throws NullPointerException {
        requireNonNull(交換情報識別番号, UrSystemErrorMessages.値がnull.getReplacedMessage("交換情報識別番号"));
        requireNonNull(入力識別番号, UrSystemErrorMessages.値がnull.getReplacedMessage("入力識別番号"));
        requireNonNull(レコード種別コード, UrSystemErrorMessages.値がnull.getReplacedMessage("レコード種別コード"));
        requireNonNull(証記載保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("証記載保険者番号"));
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(サービス提供年月, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス提供年月"));
        requireNonNull(事業所番号, UrSystemErrorMessages.値がnull.getReplacedMessage("事業所番号"));
        requireNonNull(給付実績情報作成区分コード, UrSystemErrorMessages.値がnull.getReplacedMessage("給付実績情報作成区分コード"));
        requireNonNull(給付実績区分コード, UrSystemErrorMessages.値がnull.getReplacedMessage("給付実績区分コード"));
        requireNonNull(通し番号, UrSystemErrorMessages.値がnull.getReplacedMessage("通し番号"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbV3017KyufujissekiKihon.class).
                where(and(
                                eq(kokanShikibetsuNo, 交換情報識別番号),
                                eq(inputShikibetsuNo, 入力識別番号),
                                eq(recodeShubetsuCode, レコード種別コード),
                                eq(hokenshaNo, 証記載保険者番号),
                                eq(hiHokenshaNo, 被保険者番号),
                                eq(serviceTeikyoYM, サービス提供年月),
                                eq(jigyoshoNo, 事業所番号),
                                eq(kyufuSakuseiKubunCode, 給付実績情報作成区分コード),
                                eq(kyufuJissekiKubunCode, 給付実績区分コード),
                                eq(toshiNo, 通し番号))).
                toObject(DbV3017KyufujissekiKihonEntity.class);
    }

    /**
     * 給付実績基本Aliveを全件返します。
     *
     * @return DbV3017KyufujissekiKihonEntityの{@code list}
     */
    @Transaction
    public List<DbV3017KyufujissekiKihonEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbV3017KyufujissekiKihon.class).
                toList(DbV3017KyufujissekiKihonEntity.class);
    }

    /**
     * DbV3017KyufujissekiKihonEntityを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    @Override
    public int save(DbV3017KyufujissekiKihonEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("給付実績基本Aliveエンティティ"));
        // TODO 物理削除であるかは業務ごとに検討してください。
        //return DbAccessorMethodSelector.saveByForDeletePhysical(new DbAccessorNormalType(session), entity);
        return DbAccessors.saveBy(new DbAccessorNormalType(session), entity);
    }
}