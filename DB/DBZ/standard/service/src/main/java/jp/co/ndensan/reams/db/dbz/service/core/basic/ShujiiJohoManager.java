/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.service.core.basic;

import java.util.ArrayList;
import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ShujiiJoho;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ninteishinsei.ShujiiCode;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ninteishinsei.ShujiiIryokikanCode;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT5912ShujiiJohoEntity;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT5912ShujiiJohoDac;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 主治医情報を管理するクラスです。
 */
public class ShujiiJohoManager {

    private final DbT5912ShujiiJohoDac dac;

    /**
     * コンストラクタです。
     */
    public ShujiiJohoManager() {
        dac = InstanceProvider.create(DbT5912ShujiiJohoDac.class);
    }

    /**
     * テスト用コンストラクタです。
     *
     * @param dac {@link DbT5912ShujiiJohoDac}
     */
    ShujiiJohoManager(DbT5912ShujiiJohoDac dac) {
        this.dac = dac;
    }

    /**
     * 主キーに合致する主治医情報を返します。
     *
     * @param 市町村コード 市町村コード
     * @param 主治医医療機関コード 主治医医療機関コード
     * @param 主治医コード 主治医コード
     * @return ShujiiJoho
     */
    @Transaction
    public ShujiiJoho get主治医情報(
            LasdecCode 市町村コード,
            ShujiiIryokikanCode 主治医医療機関コード,
            ShujiiCode 主治医コード) {
        requireNonNull(市町村コード, UrSystemErrorMessages.値がnull.getReplacedMessage("市町村コード"));
        requireNonNull(主治医医療機関コード, UrSystemErrorMessages.値がnull.getReplacedMessage("主治医医療機関コード"));
        requireNonNull(主治医コード, UrSystemErrorMessages.値がnull.getReplacedMessage("主治医コード"));

        DbT5912ShujiiJohoEntity entity = dac.selectByKey(
                市町村コード,
                主治医医療機関コード,
                主治医コード);
        if (entity == null) {
            return null;
        }
        entity.initializeMd5();
        return new ShujiiJoho(entity);
    }

    /**
     * 主治医情報を全件返します。
     *
     * @return ShujiiJohoの{@code list}
     */
    @Transaction
    public List<ShujiiJoho> get主治医情報一覧() {
        List<ShujiiJoho> businessList = new ArrayList<>();

        for (DbT5912ShujiiJohoEntity entity : dac.selectAll()) {
            entity.initializeMd5();
            businessList.add(new ShujiiJoho(entity));
        }

        return businessList;
    }

    /**
     * 主治医情報{@link ShujiiJoho}を保存します。
     *
     * @param 主治医情報 {@link ShujiiJoho}
     * @return 更新件数 更新結果の件数を返します。
     */
    @Transaction
    public boolean save主治医情報(ShujiiJoho 主治医情報) {
        requireNonNull(主治医情報, UrSystemErrorMessages.値がnull.getReplacedMessage("主治医情報"));
        if (!主治医情報.hasChanged()) {
            return false;
        }
        return 1 == dac.save(主治医情報.toEntity());
    }
}