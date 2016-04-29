/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.db.basic;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7069KaigoToiawasesaki;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7069KaigoToiawasesaki.chohyoBunruiID;
import static jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7069KaigoToiawasesaki.subGyomuCode;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7069KaigoToiawasesakiEntity;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.and;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.eq;
import jp.co.ndensan.reams.uz.uza.util.db.util.DbAccessors;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 介護問合せ先のデータアクセスクラスです。
 */
public class DbT7069KaigoToiawasesakiDac implements ISaveable<DbT7069KaigoToiawasesakiEntity> {

    @InjectSession
    private SqlSession session;
    private static final ReportId 共通帳票分類ID = new ReportId(new RString("000000000"));

    /**
     * 主キーで介護問合せ先を取得します。
     *
     * @param サブ業務コード SubGyomuCode
     * @param 帳票分類ID ChohyoBunruiID
     * @return DbT7069KaigoToiawasesakiEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT7069KaigoToiawasesakiEntity selectByKey(
            SubGyomuCode サブ業務コード,
            ReportId 帳票分類ID) throws NullPointerException {
        requireNonNull(サブ業務コード, UrSystemErrorMessages.値がnull.getReplacedMessage("サブ業務コード"));
        requireNonNull(帳票分類ID, UrSystemErrorMessages.値がnull.getReplacedMessage("帳票分類ID"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT7069KaigoToiawasesaki.class).
                where(and(
                                eq(subGyomuCode, サブ業務コード),
                                eq(chohyoBunruiID, 帳票分類ID))).
                toObject(DbT7069KaigoToiawasesakiEntity.class);
    }

    /**
     * 介護共通問合せ先取得
     *
     * @return DbT7069KaigoToiawasesakiEntity
     */
    @Transaction
    public DbT7069KaigoToiawasesakiEntity selectKaigoKyotsu() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT7069KaigoToiawasesaki.class).
                where(and(
                                eq(subGyomuCode, SubGyomuCode.DBZ介護共通),
                                eq(chohyoBunruiID, 共通帳票分類ID))).
                toObject(DbT7069KaigoToiawasesakiEntity.class);
    }

    /**
     * サブ業務共通問合せ先取得
     *
     * @param サブ業務コード SubGyomuCode
     * @return DbT7069KaigoToiawasesakiEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT7069KaigoToiawasesakiEntity selectBySubGyomuCode(SubGyomuCode サブ業務コード) throws NullPointerException {
        requireNonNull(サブ業務コード, UrSystemErrorMessages.値がnull.getReplacedMessage("サブ業務コード"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT7069KaigoToiawasesaki.class).
                where(and(
                                eq(subGyomuCode, サブ業務コード),
                                eq(chohyoBunruiID, 共通帳票分類ID))).
                toObject(DbT7069KaigoToiawasesakiEntity.class);
    }

    /**
     * 帳票問合せ先取得
     *
     * @param 帳票分類ID ReportId
     * @return DbT7069KaigoToiawasesakiEntity
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    @Transaction
    public DbT7069KaigoToiawasesakiEntity selectByChohyoBunruiID(
            ReportId 帳票分類ID) throws NullPointerException {
        requireNonNull(帳票分類ID, UrSystemErrorMessages.値がnull.getReplacedMessage("帳票分類ID"));

        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        List<DbT7069KaigoToiawasesakiEntity> list = accessor.select().
                table(DbT7069KaigoToiawasesaki.class).
                where(eq(chohyoBunruiID, 帳票分類ID)).
                toList(DbT7069KaigoToiawasesakiEntity.class);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /**
     * 介護問合せ先を全件返します。
     *
     * @return List<DbT7069KaigoToiawasesakiEntity>
     */
    @Transaction
    public List<DbT7069KaigoToiawasesakiEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor.select().
                table(DbT7069KaigoToiawasesaki.class).
                toList(DbT7069KaigoToiawasesakiEntity.class);
    }

    /**
     * DbT7069KaigoToiawasesakiEntityを登録します。状態によってinsert/update/delete処理に振り分けられます。
     *
     * @param entity entity
     * @return 登録件数
     */
    @Transaction
    @Override
    public int save(DbT7069KaigoToiawasesakiEntity entity) {
        requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("介護問合せ先エンティティ"));
        // TODO 物理削除であるかは業務ごとに検討してください。
        //return DbAccessorMethodSelector.saveByForDeletePhysical(new DbAccessorNormalType(session), entity);
        return DbAccessors.saveBy(new DbAccessorNormalType(session), entity);
    }
}
