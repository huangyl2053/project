/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.realservice;

import db.dbd.definition.valueobject.ninteishinsei.ShujiiCode;
import db.dbd.definition.valueobject.ninteishinsei.ShujiiIryokikanCode;
import jp.co.ndensan.reams.db.dbd.business.IShujiiJoho;
import jp.co.ndensan.reams.db.dbd.business.ShinsakaiShujiiJoho;
import jp.co.ndensan.reams.db.dbd.entity.basic.DbT5912ShujiiJohoEntity;
import jp.co.ndensan.reams.db.dbd.persistence.basic.DbT5912ShujiiJohoDac;
import jp.co.ndensan.reams.db.dbz.definition.util.function.IFunction;
import jp.co.ndensan.reams.db.dbz.definition.util.itemlist.ItemList;
import jp.co.ndensan.reams.db.dbz.definition.util.optional.Optional;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 受給(DBD)用の主治医を管理するクラスです。
 *
 * @author N8235 船山 洋介
 */
public class ShinsakaiShujiiManager extends ShujiiManagerBase {

    private final DbT5912ShujiiJohoDac dac;

    /**
     * コンストラクタです。
     */
    public ShinsakaiShujiiManager() {
        this.dac = InstanceProvider.create(DbT5912ShujiiJohoDac.class);
    }

    /**
     * テスト用コンストラクタです。
     */
    ShinsakaiShujiiManager(DbT5912ShujiiJohoDac dac) {
        this.dac = dac;
    }

    @Override
    public Optional<IShujiiJoho> find主治医(LasdecCode 市町村コード, ShujiiIryokikanCode 主治医医療機関コード, ShujiiCode 主治医コード) {

        return dac.selectByKey(市町村コード, 主治医医療機関コード, 主治医コード)
                .map(new IFunction<DbT5912ShujiiJohoEntity, IShujiiJoho>() {
                    @Override
                    public IShujiiJoho apply(DbT5912ShujiiJohoEntity t) {
                        return new ShinsakaiShujiiJoho(t);
                    }
                });
    }

    @Override
    public ItemList<IShujiiJoho> getAll主治医() {

        return to主治医List(dac.selectAll());
    }

    private ItemList<IShujiiJoho> to主治医List(ItemList<DbT5912ShujiiJohoEntity> entityList) {

        ItemList<IShujiiJoho> shinsakaiShujiiJohoList = ItemList.empty();

        for (DbT5912ShujiiJohoEntity entity : entityList) {
            ShinsakaiShujiiJoho shinsakaiShujiiIryoKikanJoho = new ShinsakaiShujiiJoho(entity);
            shinsakaiShujiiJohoList.added(shinsakaiShujiiIryoKikanJoho);
        }

        return shinsakaiShujiiJohoList;
    }

}
