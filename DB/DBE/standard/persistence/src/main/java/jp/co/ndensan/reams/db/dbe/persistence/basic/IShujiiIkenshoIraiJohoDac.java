/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.basic;

import java.util.List;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5011ShujiiIkenshoIraiJohoEntity;
import jp.co.ndensan.reams.db.dbz.persistence.basic.IDeletable;
import jp.co.ndensan.reams.db.dbz.persistence.basic.IReplaceable;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 主治医意見書作成依頼情報のデータアクセスインターフェースです。
 *
 * @author N8156 宮本 康
 */
public interface IShujiiIkenshoIraiJohoDac
        extends IReplaceable<DbT5011ShujiiIkenshoIraiJohoEntity>, IDeletable<DbT5011ShujiiIkenshoIraiJohoEntity> {

    /**
     * 引数の条件に該当する主治医意見書作成依頼情報エンティティを取得します。
     *
     * @param 申請書管理番号 申請書管理番号
     * @param 意見書作成依頼履歴番号 意見書作成依頼履歴番号
     * @return 主治医意見書作成依頼情報エンティティ
     */
    @Transaction
    DbT5011ShujiiIkenshoIraiJohoEntity select(ShinseishoKanriNo 申請書管理番号, int 意見書作成依頼履歴番号);

    /**
     * 引数の条件に該当する主治医意見書作成依頼情報エンティティを取得します。
     *
     * @param 申請書管理番号 申請書管理番号
     * @return 主治医意見書作成依頼情報エンティティ
     */
    @Transaction
    List<DbT5011ShujiiIkenshoIraiJohoEntity> selectBy申請書管理番号(ShinseishoKanriNo 申請書管理番号);

    /**
     * 引数の条件に該当する主治医意見書作成依頼情報エンティティを取得します。
     *
     * @param 意見書作成依頼年月日 意見書作成依頼年月日
     * @return 主治医意見書作成依頼情報エンティティ
     */
    @Transaction
    List<DbT5011ShujiiIkenshoIraiJohoEntity> selectBy依頼年月日(FlexibleDate 意見書作成依頼年月日);

    /**
     * 引数の条件に該当する主治医意見書作成依頼情報エンティティを取得します。
     *
     * @param 主治医医療機関コード 主治医医療機関コード
     * @param 医師識別番号 医師識別番号
     * @return 主治医意見書作成依頼情報エンティティ
     */
    @Transaction
    List<DbT5011ShujiiIkenshoIraiJohoEntity> selectBy主治医情報(RString 主治医医療機関コード, RString 医師識別番号);

    /**
     * 引数の条件に該当する主治医意見書作成依頼情報エンティティを取得します。
     *
     * @param 意見書作成督促年月日 意見書作成督促年月日
     * @return 主治医意見書作成依頼情報エンティティ
     */
    @Transaction
    List<DbT5011ShujiiIkenshoIraiJohoEntity> selectBy督促年月日(FlexibleDate 意見書作成督促年月日);
}
