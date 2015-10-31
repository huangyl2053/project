/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.service.core.gogitaijoho.shinsakaikaisaibashojoho;

import java.util.ArrayList;
import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbe.business.core.gogitaijoho.shinsakaikaisaibashojoho.ShinsakaiKaisaiBashoJoho;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT5592ShinsakaiKaisaiBashoJohoEntity;
import jp.co.ndensan.reams.db.dbe.persistence.db.basic.DbT5592ShinsakaiKaisaiBashoJohoDac;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 介護認定審査会開催場所情報を管理するクラスです。
 */
public class ShinsakaiKaisaiBashoJohoManager {

    private final DbT5592ShinsakaiKaisaiBashoJohoDac dac;

    /**
     * コンストラクタです。
     */
    public ShinsakaiKaisaiBashoJohoManager() {
        dac = InstanceProvider.create(DbT5592ShinsakaiKaisaiBashoJohoDac.class);
    }

    /**
     * テスト用コンストラクタです。
     *
     * @param dac {@link DbT5592ShinsakaiKaisaiBashoJohoDac}
     */
    ShinsakaiKaisaiBashoJohoManager(DbT5592ShinsakaiKaisaiBashoJohoDac dac) {
        this.dac = dac;
    }

    /**
     * 主キーに合致する介護認定審査会開催場所情報を返します。
     *
     * @param 介護認定審査会開催場所コード 介護認定審査会開催場所コード
     * @return ShinsakaiKaisaiBashoJoho
     */
    @Transaction
    public ShinsakaiKaisaiBashoJoho get介護認定審査会開催場所情報(
            RString 介護認定審査会開催場所コード) {
        requireNonNull(介護認定審査会開催場所コード, UrSystemErrorMessages.値がnull.getReplacedMessage("介護認定審査会開催場所コード"));

        DbT5592ShinsakaiKaisaiBashoJohoEntity entity = dac.selectByKey(
                介護認定審査会開催場所コード);
        if (entity == null) {
            return null;
        }
        entity.initializeMd5();
        return new ShinsakaiKaisaiBashoJoho(entity);
    }

    /**
     * 介護認定審査会開催場所情報を全件返します。
     *
     * @return ShinsakaiKaisaiBashoJohoの{@code list}
     */
    @Transaction
    public List<ShinsakaiKaisaiBashoJoho> get介護認定審査会開催場所情報一覧() {
        List<ShinsakaiKaisaiBashoJoho> businessList = new ArrayList<>();

        for (DbT5592ShinsakaiKaisaiBashoJohoEntity entity : dac.selectAll()) {
            entity.initializeMd5();
            businessList.add(new ShinsakaiKaisaiBashoJoho(entity));
        }

        return businessList;
    }

    /**
     * 介護認定審査会開催場所情報{@link ShinsakaiKaisaiBashoJoho}を保存します。
     *
     * @param 介護認定審査会開催場所情報 {@link ShinsakaiKaisaiBashoJoho}
     * @return 更新件数 更新結果の件数を返します。
     */
    @Transaction
    public boolean save介護認定審査会開催場所情報(ShinsakaiKaisaiBashoJoho 介護認定審査会開催場所情報) {
        requireNonNull(介護認定審査会開催場所情報, UrSystemErrorMessages.値がnull.getReplacedMessage("介護認定審査会開催場所情報"));
        if (!介護認定審査会開催場所情報.hasChanged()) {
            return false;
        }
        return 1 == dac.save(介護認定審査会開催場所情報.toEntity());
    }
}