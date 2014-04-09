/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.relate;

import java.util.List;
import jp.co.ndensan.reams.db.dbe.definition.YokaigoninteiDateConstants;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5001NinteiShinseiJoho;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5005NinteiShinchokuJoho;
import jp.co.ndensan.reams.db.dbe.entity.relate.KaigoNinteiShoriTaishoshaEntity;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.uz.uza.core.mybatis.SqlSession;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbAccessorNormalType;
import static jp.co.ndensan.reams.uz.uza.util.db.Restrictions.*;
import jp.co.ndensan.reams.uz.uza.util.di.InjectSession;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 認定調査依頼対象者に該当する介護認定処理対象者を取得するデータアクセスクラスです。
 * 要介護認定進捗情報の認定調査依頼完了年月日が、"00000000"のデータを取得します。
 *
 * @author N8187 久保田 英男
 */
public class NinteichosaIraiTaishoshaDac {

    @InjectSession
    private SqlSession session;

    /**
     * 認定調査依頼対象者を取得します。
     *
     * @return 認定調査依頼対象者に該当する介護認定処理対象者のエンティティリスト
     */
    @Transaction
    public List<KaigoNinteiShoriTaishoshaEntity> selectAll() {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);
        return accessor
                .select()
                .table(DbT5005NinteiShinchokuJoho.class)
                .leftJoin(DbT5001NinteiShinseiJoho.class, using(DbT5005NinteiShinchokuJoho.shinseishoKanriNo))
                .where(eq(DbT5005NinteiShinchokuJoho.ninteichosaIraiKanryoYMD, YokaigoninteiDateConstants.認定調査依頼未完了年月日))
                .toList(KaigoNinteiShoriTaishoshaEntity.class);
    }

    /**
     * 指定された証記載保険者番号に該当する、認定調査依頼対象者を取得します。
     *
     * @param 証記載保険者番号 証記載保険者番号
     * @return 認定調査依頼対象者に該当する介護認定処理対象者のエンティティリスト
     */
    @Transaction
    public List<KaigoNinteiShoriTaishoshaEntity> select証記載保険者番号(ShoKisaiHokenshaNo 証記載保険者番号) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor
                .select()
                .table(DbT5005NinteiShinchokuJoho.class)
                .leftJoin(DbT5001NinteiShinseiJoho.class, using(DbT5005NinteiShinchokuJoho.shinseishoKanriNo))
                .where(and(eq(DbT5001NinteiShinseiJoho.shoKisaiHokenshaNo, 証記載保険者番号),
                eq(DbT5005NinteiShinchokuJoho.ninteichosaIraiKanryoYMD, YokaigoninteiDateConstants.認定調査依頼未完了年月日)))
                .toList(KaigoNinteiShoriTaishoshaEntity.class);
    }

    /**
     * 指定された証記載保険者番号及び支所コードに該当する、認定調査依頼対象者を取得します。
     *
     * @param 証記載保険者番号 証記載保険者番号
     * @param 支所コード 支所コード
     * @return 認定調査依頼対象者に該当する介護認定処理対象者のエンティティリスト
     */
    @Transaction
    public List<KaigoNinteiShoriTaishoshaEntity> select証記載保険者番号及び支所コード(ShoKisaiHokenshaNo 証記載保険者番号, RString 支所コード) {
        DbAccessorNormalType accessor = new DbAccessorNormalType(session);

        return accessor
                .select()
                .table(DbT5005NinteiShinchokuJoho.class)
                .leftJoin(DbT5001NinteiShinseiJoho.class, using(DbT5005NinteiShinchokuJoho.shinseishoKanriNo))
                .where(and(eq(DbT5001NinteiShinseiJoho.shoKisaiHokenshaNo, 証記載保険者番号),
                eq(DbT5001NinteiShinseiJoho.shishoCode, 支所コード),
                eq(DbT5005NinteiShinchokuJoho.ninteichosaIraiKanryoYMD, YokaigoninteiDateConstants.認定調査依頼未完了年月日)))
                .toList(KaigoNinteiShoriTaishoshaEntity.class);
    }
}
