/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.persistence.db.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7115UwanoseShokanShuruiShikyuGendoGaku;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7115UwanoseShokanShuruiShikyuGendoGaku.rirekiNo;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7115UwanoseShokanShuruiShikyuGendoGaku.serviceShuruiCode;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7115UwanoseShokanShuruiShikyuGendoGaku.shikyuGendoTaniSu;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7115UwanoseShokanShuruiShikyuGendoGaku.tekiyoKaishiYM;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7115UwanoseShokanShuruiShikyuGendoGaku.tekiyoShuryoYM;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.db.dbz.persistence.IDeletable;
import jp.co.ndensan.reams.db.dbz.persistence.db.basic.ISaveable;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import jp.co.ndensan.reams.uz.uza.util.db.Order;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.by;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.isNULL;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.leq;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.or;
import jp.co.ndensan.reams.uz.uza.util.db.util.DbAccessors;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 上乗せ償還払い給付種類支給限度額のデータアクセスクラスです。
 *
 * @reamsid_L DBC-9999-012 xicongwang
 */
public class DbT7115UwanoseShokanShuruiShikyuGendoGakuDac implements
        ISaveable<DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity>, IDeletable<DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity> {

    @InjectSession
    private SqlSession session;
    private static final RString 定値_サービス種類コード = new RString("サービス種類コード");
    private static final RString 定値_適用開始年月 = new RString("適用開始年月");
    private static final RString 定値_履歴番号 = new RString("履歴番号");
    private static final RString 定値_上乗せ償還払い給付種類支給限度額エンティティ = new RString("上乗せ償還払い給付種類支給限度額エンティティ");
    private static final RString 定値_サービス提供年月 = new RString("サービス提供年月");

    /**
     * 主キーで上乗せ償還払い給付種類支給限度額を取得します。
     *
     * @param サービス種類コード ServiceShuruiCode
     * @param 適用開始年月 TekiyoKaishiYM
     * @param 履歴番号 RirekiNo
     * @return DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity selectByKey(
            ServiceShuruiCode サービス種類コード,
            FlexibleYearMonth 適用開始年月,
            int 履歴番号) throws NullPointerException {
        requireNonNull(サービス種類コード, UrSystemErrorMessages.値がnull.getReplacedMessage(定値_サービス種類コード.toString()));
        requireNonNull(適用開始年月, UrSystemErrorMessages.値がnull.getReplacedMessage(定値_適用開始年月.toString()));
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage(定値_履歴番号.toString()));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT7115UwanoseShokanShuruiShikyuGendoGaku.class).
                where(and(
                                eq(serviceShuruiCode, サービス種類コード),
                                eq(tekiyoKaishiYM, 適用開始年月),
                                eq(rirekiNo, 履歴番号))).
                toObject(DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity.class);
    }

    /**
     * キーで上乗せ償還払い給付種類支給限度額を取得します。
     *
     * @param サービス種類コード ServiceShuruiCode
     * @param 適用開始年月 TekiyoKaishiYM
     * @return DbT7112ShokanShuruiShikyuGendoGakuEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity selectByValue(
            ServiceShuruiCode サービス種類コード,
            FlexibleYearMonth 適用開始年月) throws NullPointerException {
        requireNonNull(サービス種類コード, UrSystemErrorMessages.値がnull.getReplacedMessage(定値_サービス種類コード.toString()));
        requireNonNull(適用開始年月, UrSystemErrorMessages.値がnull.getReplacedMessage(定値_適用開始年月.toString()));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT7115UwanoseShokanShuruiShikyuGendoGaku.class).
                where(and(
                                eq(serviceShuruiCode, サービス種類コード),
                                eq(tekiyoKaishiYM, 適用開始年月))).
                toObject(DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity.class);
    }

    /**
     * 上乗せ償還払い給付種類支給限度額を全件返します。
     *
     * @return List<DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity>
     */
    @Transaction
    public List<DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT7115UwanoseShokanShuruiShikyuGendoGaku.class).
                toList(DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity.class);
    }

    /**
     * 上乗せ償還払い給付種類支給限度額を全件返します。
     *
     * @return List<DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity>
     */
    @Transaction
    public List<DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity> selectAllOrder() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT7115UwanoseShokanShuruiShikyuGendoGaku.class).order(
                        by(tekiyoKaishiYM, Order.DESC),
                        by(serviceShuruiCode, Order.ASC)).
                toList(DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity.class);
    }

    /**
     * DbT7115UwanoseShokanShuruiShikyuGendoGakuEntityを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    @Override
    public int save(DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage(定値_上乗せ償還払い給付種類支給限度額エンティティ.toString()));
        // TODO 物理削除であるかは業務ごとに検討してください。
        //return DbAccessorMethodSelector.saveByForDeletePhysical(new DbAccessorNormalType(session), entity);
        return DbAccessors.saveBy(new DbAccessorNormalType(session), entity);
    }

    /**
     * 上乗せ償還払い給付種類支給限度額からデータを抽出する。
     *
     * @param サービス種類コード ServiceShuruiCode
     * @param サービス提供年月 FlexibleYearMonth
     * @return Decimal
     */
    @Transaction
    public DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity select支給限度単位数(ServiceShuruiCode サービス種類コード, FlexibleYearMonth サービス提供年月) {
        requireNonNull(サービス種類コード, UrSystemErrorMessages.値がnull.getReplacedMessage(定値_サービス種類コード.toString()));
        requireNonNull(サービス提供年月, UrSystemErrorMessages.値がnull.getReplacedMessage(定値_サービス提供年月.toString()));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.selectSpecific(shikyuGendoTaniSu).
                table(DbT7115UwanoseShokanShuruiShikyuGendoGaku.class).
                where(and(
                                eq(serviceShuruiCode, サービス種類コード),
                                leq(tekiyoKaishiYM, サービス提供年月),
                                leq(サービス提供年月, tekiyoShuryoYM))).
                order(
                        by(tekiyoKaishiYM, Order.DESC),
                        by(rirekiNo, Order.DESC)).
                limit(1).
                toObject(DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity.class);
    }

    /**
     * 上乗せ償還払い給付種類支給限度額。
     *
     * @param サービス種類コード ServiceShuruiCode
     * @param サービス提供年月 FlexibleYearMonth
     * @return List<DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity>
     */
    public List<DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity> get支給限度額(ServiceShuruiCode サービス種類コード,
            FlexibleYearMonth サービス提供年月) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.select().
                table(DbT7115UwanoseShokanShuruiShikyuGendoGaku.class).
                where(and(
                                eq(serviceShuruiCode, サービス種類コード),
                                or(and(
                                                isNULL(tekiyoShuryoYM),
                                                leq(tekiyoKaishiYM, サービス提供年月)),
                                        and(
                                                leq(tekiyoKaishiYM, サービス提供年月),
                                                leq(サービス提供年月, tekiyoShuryoYM))))).
                order(by(tekiyoKaishiYM, Order.DESC), by(rirekiNo, Order.DESC)).
                toList(DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity.class);
    }

    /**
     * データを物理削除する
     *
     * @param entity DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity
     * @return 更新件数 更新結果の件数を返します。
     */
    @Override
    public int delete(DbT7115UwanoseShokanShuruiShikyuGendoGakuEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage(定値_上乗せ償還払い給付種類支給限度額エンティティ.toString()));
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor.deletePhysical(entity).execute();
    }
}
