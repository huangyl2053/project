/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.persistence.db.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7114UwanoseServiceShuruiShikyuGendoGaku;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7114UwanoseServiceShuruiShikyuGendoGaku.rirekiNo;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7114UwanoseServiceShuruiShikyuGendoGaku.serviceShuruiCode;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7114UwanoseServiceShuruiShikyuGendoGaku.tekiyoKaishiYM;
import static jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7114UwanoseServiceShuruiShikyuGendoGaku.yoKaigoJotaiKubun;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7114UwanoseServiceShuruiShikyuGendoGakuEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.db.dbz.persistence.db.basic.ISaveable;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
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
 * 上乗せサービス種類支給限度額のデータアクセスクラスです。
 */
public class DbT7114UwanoseServiceShuruiShikyuGendoGakuDac implements ISaveable<DbT7114UwanoseServiceShuruiShikyuGendoGakuEntity> {

    @InjectSession
    private SqlSession session;

    /**
     * 主キーで上乗せサービス種類支給限度額を取得します。
     *
     * @param サービス種類コード ServiceShuruiCode
     * @param 要介護状態区分 YoKaigoJotaiKubun
     * @param 適用開始年月 TekiyoKaishiYM
     * @param 履歴番号 RirekiNo
     * @return DbT7114UwanoseServiceShuruiShikyuGendoGakuEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT7114UwanoseServiceShuruiShikyuGendoGakuEntity selectByKey(
            ServiceShuruiCode サービス種類コード,
            RString 要介護状態区分,
            FlexibleYearMonth 適用開始年月,
            int 履歴番号) throws NullPointerException {
        requireNonNull(サービス種類コード, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス種類コード"));
        requireNonNull(要介護状態区分, UrSystemErrorMessages.値がnull.getReplacedMessage("要介護状態区分"));
        requireNonNull(適用開始年月, UrSystemErrorMessages.値がnull.getReplacedMessage("適用開始年月"));
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("履歴番号"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT7114UwanoseServiceShuruiShikyuGendoGaku.class).
                where(and(
                                eq(serviceShuruiCode, サービス種類コード),
                                eq(yoKaigoJotaiKubun, 要介護状態区分),
                                eq(tekiyoKaishiYM, 適用開始年月),
                                eq(rirekiNo, 履歴番号))).
                toObject(DbT7114UwanoseServiceShuruiShikyuGendoGakuEntity.class);
    }

    /**
     * 上乗せサービス種類支給限度額を全件返します。
     *
     * @return List<DbT7114UwanoseServiceShuruiShikyuGendoGakuEntity>
     */
    @Transaction
    public List<DbT7114UwanoseServiceShuruiShikyuGendoGakuEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT7114UwanoseServiceShuruiShikyuGendoGaku.class).
                toList(DbT7114UwanoseServiceShuruiShikyuGendoGakuEntity.class);
    }

    /**
     * DbT7114UwanoseServiceShuruiShikyuGendoGakuEntityを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    @Override
    public int save(DbT7114UwanoseServiceShuruiShikyuGendoGakuEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("上乗せサービス種類支給限度額エンティティ"));
        // TODO 物理削除であるかは業務ごとに検討してください。
        //return DbAccessorMethodSelector.saveByForDeletePhysical(new DbAccessorNormalType(session), entity);
        return DbAccessors.saveBy(new DbAccessorNormalType(session), entity);
    }
}
