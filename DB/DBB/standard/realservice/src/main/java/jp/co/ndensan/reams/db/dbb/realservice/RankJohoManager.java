/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.realservice;

import jp.co.ndensan.reams.db.dbb.entity.basic.DbT2011RankJohoEntity;
import jp.co.ndensan.reams.db.dbb.persistence.relate.RankJohoDac;
import jp.co.ndensan.reams.db.dbz.definition.util.itemlist.IItemList;
import jp.co.ndensan.reams.db.dbz.definition.util.itemlist.ItemList;
import jp.co.ndensan.reams.db.dbz.definition.util.optional.Optional;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.RankKubun;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.ApplicationException;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * ランク情報を管理するクラスです。
 *
 * @author N8156 宮本 康
 */
public class RankJohoManager {

    private final RankJohoDac dac;

    /**
     * コンストラクタです。
     */
    public RankJohoManager() {
        dac = InstanceProvider.create(RankJohoDac.class);
    }

    /**
     * 単体テスト用のコンストラクタです。
     */
    RankJohoManager(RankJohoDac dac) {
        this.dac = dac;
    }

    /**
     * 引数に合致するランク情報を返します。
     *
     * @param 賦課年度 賦課年度
     * @param ランク区分 ランク区分
     * @return DbT2011RankJohoEntity
     */
    @Transaction
    public Optional<DbT2011RankJohoEntity> getランク情報(FlexibleYear 賦課年度, RankKubun ランク区分) {

        return Optional.ofNullable(dac.selectランク情報ByKey(賦課年度, ランク区分));
    }

    /**
     * 引数に合致するランク情報の一覧を返します。
     *
     * @param 賦課年度 賦課年度
     * @return List<DbT2011RankJohoEntity>
     */
    @Transaction
    public IItemList<DbT2011RankJohoEntity> getランク情報一覧(FlexibleYear 賦課年度) {
        return ItemList.of(dac.selectランク情報一覧(賦課年度));
    }

    /**
     * ランク情報を登録します。
     *
     * @param ランク情報モデル DbT2011RankJohoEntity
     * @return 登録件数
     */
    @Transaction
    public int saveランク情報(DbT2011RankJohoEntity ランク情報モデル) {

        if (ランク情報モデル.getState() == EntityDataState.Added) {
            return dac.insert(ランク情報モデル);
        } else if (ランク情報モデル.getState() == EntityDataState.Modified) {
            return dac.update(ランク情報モデル);
        } else if (ランク情報モデル.getState() == EntityDataState.Deleted) {
            return dac.delete(ランク情報モデル);
        }

        throw new ApplicationException(UrErrorMessages.更新対象のデータがない.getMessage());
    }
}