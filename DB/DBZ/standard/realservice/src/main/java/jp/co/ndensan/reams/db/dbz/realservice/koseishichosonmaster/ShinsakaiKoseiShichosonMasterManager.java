/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.realservice.koseishichosonmaster;

import jp.co.ndensan.reams.db.dbz.business.koseishichosonmaster.IKoseiShichosonMaster;
import jp.co.ndensan.reams.db.dbz.business.koseishichosonmaster.ShinsakaiKoseiShichosonMaster;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT5051KoseiShichosonMasterEntity;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT5051KoseiShichosonMasterDac;
import jp.co.ndensan.reams.db.dbz.definition.util.function.IFunction;
import jp.co.ndensan.reams.db.dbz.definition.util.optional.Optional;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 構成市町村マスタ情報を作成するクラスです。
 *
 * @author n8223　朴義一
 */
public class ShinsakaiKoseiShichosonMasterManager extends KoseiShichosonMasterManagerBase {

    private final DbT5051KoseiShichosonMasterDac dac;

    /**
     * コンストラクタです。
     *
     */
    public ShinsakaiKoseiShichosonMasterManager() {
        this.dac = InstanceProvider.create(DbT5051KoseiShichosonMasterDac.class);
    }

    /**
     * 単体テスト用のコンストラクタです。
     */
    ShinsakaiKoseiShichosonMasterManager(DbT5051KoseiShichosonMasterDac dac) {
        this.dac = dac;
    }

    /**
     * 構成市町村マスタ情報を取得します。
     *
     * @param 市町村識別ID 市町村識別ID
     * @return 構成市町村マスタ情報
     */
    @Override
    public Optional<IKoseiShichosonMaster> find構成市町村(RString 市町村識別ID) {
        return dac.selectByKey(市町村識別ID)
                .map(new IFunction<DbT5051KoseiShichosonMasterEntity, IKoseiShichosonMaster>() {
                    @Override
                    public IKoseiShichosonMaster apply(DbT5051KoseiShichosonMasterEntity t) {
                        return new ShinsakaiKoseiShichosonMaster(t);
                    }
                });
    }

    /**
     * 証記載保険者番号より構成市町村マスタ情報を取得します。
     *
     * @param 証記載保険者番号 証記載保険者番号
     * @return 構成市町村マスタ情報
     */
    @Override
    public Optional<IKoseiShichosonMaster> find構成市町村(ShoKisaiHokenshaNo 証記載保険者番号) {
        return dac.selectByKey(証記載保険者番号)
                .map(new IFunction<DbT5051KoseiShichosonMasterEntity, IKoseiShichosonMaster>() {
                    @Override
                    public IKoseiShichosonMaster apply(DbT5051KoseiShichosonMasterEntity t) {
                        return new ShinsakaiKoseiShichosonMaster(t);
                    }
                });
    }

    /**
     * 証記載保険者番号より構成市町村マスタ情報を取得します。
     *
     * @param 市町村コード 市町村コード
     * @return 構成市町村マスタ情報
     */
    @Override
    public Optional<IKoseiShichosonMaster> find構成市町村(LasdecCode 市町村コード) {
        return dac.selectByKey(市町村コード)
                .map(new IFunction<DbT5051KoseiShichosonMasterEntity, IKoseiShichosonMaster>() {
                    @Override
                    public IKoseiShichosonMaster apply(DbT5051KoseiShichosonMasterEntity t) {
                        return new ShinsakaiKoseiShichosonMaster(t);
                    }
                });
    }

}
