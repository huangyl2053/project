/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.service.core.ninteichosahyo.ninteichosahyochosaitem;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbe.business.core.ninteichosahyo.ninteichosahyochosaitem.NinteichosahyoChosaItem;
import jp.co.ndensan.reams.db.dbe.persistence.db.basic.DbT5211NinteichosahyoChosaItemDac;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 認定調査票（基本調査）調査項目を管理するクラスです。
 */
public class NinteichosahyoChosaItemManager {

    private final DbT5211NinteichosahyoChosaItemDac dac;

    /**
     * コンストラクタです。
     */
    public NinteichosahyoChosaItemManager() {
        dac = InstanceProvider.create(DbT5211NinteichosahyoChosaItemDac.class);
    }

    /**
     * テスト用コンストラクタです。
     *
     * @param dac {@link DbT5211NinteichosahyoChosaItemDac}
     */
    NinteichosahyoChosaItemManager(DbT5211NinteichosahyoChosaItemDac dac) {
        this.dac = dac;
    }

    /**
     * 認定調査票（基本調査）調査項目{@link NinteichosahyoChosaItem}を保存します。
     *
     * @param 認定調査票_基本調査_調査項目 {@link NinteichosahyoChosaItem}
     * @return 更新件数 更新結果の件数を返します。
     */
    @Transaction
    public boolean save認定調査票_基本調査_調査項目(NinteichosahyoChosaItem 認定調査票_基本調査_調査項目) {
        requireNonNull(認定調査票_基本調査_調査項目, UrSystemErrorMessages.値がnull.getReplacedMessage("認定調査票（基本調査）調査項目"));
        if (!認定調査票_基本調査_調査項目.hasChanged()) {
            return false;
        }
        return 1 == dac.save(認定調査票_基本調査_調査項目.toEntity());
    }
}