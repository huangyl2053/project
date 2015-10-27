/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.koseishichosonshishomaster;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShishoCode;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7052KoseiShichosonShishoMasterEntity;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * {@link KoseiShichosonShishoMaster}の編集を行うビルダークラスです。
 */
public class KoseiShichosonShishoMasterBuilder {

    private final DbT7052KoseiShichosonShishoMasterEntity entity;
    private final KoseiShichosonShishoMasterIdentifier id;

    /**
     * {@link DbT7052KoseiShichosonShishoMasterEntity}より{@link KoseiShichosonShishoMaster}の編集用Builderクラスを生成します。
     *
     * @param entity {@link DbT7052KoseiShichosonShishoMasterEntity}
     * @param id {@link KoseiShichosonShishoMasterIdentifier}
     *
     */
    KoseiShichosonShishoMasterBuilder(
            DbT7052KoseiShichosonShishoMasterEntity entity,
            KoseiShichosonShishoMasterIdentifier id
    ) {
        this.entity = entity.clone();
        this.id = id;

    }

    /**
     * 市町村コードを設定します。
     *
     * @param 市町村コード 市町村コード
     * @return {@link KoseiShichosonShishoMasterBuilder}
     */
    public KoseiShichosonShishoMasterBuilder set市町村コード(LasdecCode 市町村コード) {
        requireNonNull(市町村コード, UrSystemErrorMessages.値がnull.getReplacedMessage("市町村コード"));
        entity.setShichosonCode(市町村コード);
        return this;
    }

    /**
     * 支所コードを設定します。
     *
     * @param 支所コード 支所コード
     * @return {@link KoseiShichosonShishoMasterBuilder}
     */
    public KoseiShichosonShishoMasterBuilder set支所コード(ShishoCode 支所コード) {
        requireNonNull(支所コード, UrSystemErrorMessages.値がnull.getReplacedMessage("支所コード"));
        entity.setShishoCode(支所コード);
        return this;
    }

    /**
     * 支所名を設定します。
     *
     * @param 支所名 支所名
     * @return {@link KoseiShichosonShishoMasterBuilder}
     */
    public KoseiShichosonShishoMasterBuilder set支所名(RString 支所名) {
        requireNonNull(支所名, UrSystemErrorMessages.値がnull.getReplacedMessage("支所名"));
        entity.setShishoMei(支所名);
        return this;
    }

    /**
     * {@link KoseiShichosonShishoMaster}のインスタンスを生成します。
     *
     * @return {@link KoseiShichosonShishoMaster}のインスタンス
     */
    public KoseiShichosonShishoMaster build() {
        return new KoseiShichosonShishoMaster(entity, id);
    }
}