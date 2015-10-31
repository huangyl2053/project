/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.service.core.syujii.shujiiiryokikanjoho;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbe.business.core.syujii.koseishichosonmaster.KoseiShichosonMaster;
import jp.co.ndensan.reams.db.dbe.business.core.syujii.shujiiiryokikanjoho.ShujiiIryoKikanJoho;
import jp.co.ndensan.reams.db.dbe.business.core.syujii.shujiijoho.ShujiiJoho;
import jp.co.ndensan.reams.db.dbe.definition.mybatis.param.shujiiiryokikanshujii.ShujiiIryoKikanShujiiParameter;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.syujii.shujiiiryokikanjoho.ShujiiIryoKikanJohoRelateEntity;
import jp.co.ndensan.reams.db.dbe.persistence.core.basic.MapperProvider;
import jp.co.ndensan.reams.db.dbe.persistence.db.basic.DbT5911ShujiiIryoKikanJohoDac;
import jp.co.ndensan.reams.db.dbe.persistence.db.mapper.relate.shujiiiryokikanshujii.IShujiiIryoKikanShujiiMapper;
import jp.co.ndensan.reams.db.dbe.service.core.syujii.koseishichosonmaster.KoseiShichosonMasterManager;
import jp.co.ndensan.reams.db.dbe.service.core.syujii.shujiijoho.ShujiiJohoManager;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 主治医医療機関情報を管理するクラスです。
 */
public class ShujiiIryoKikanJohoManager {

    private final MapperProvider mapperProvider;
    private final DbT5911ShujiiIryoKikanJohoDac 主治医医療機関情報Dac;
    private final KoseiShichosonMasterManager 構成市町村マスタManager;
    private final ShujiiJohoManager 主治医情報Manager;

    /**
     * コンストラクタです。
     */
    ShujiiIryoKikanJohoManager() {
        this.mapperProvider = InstanceProvider.create(MapperProvider.class);
        this.主治医医療機関情報Dac = InstanceProvider.create(DbT5911ShujiiIryoKikanJohoDac.class);
        this.構成市町村マスタManager = new KoseiShichosonMasterManager();
        this.主治医情報Manager = new ShujiiJohoManager();
    }

    /**
     * 単体テスト用のコンストラクタです。
     *
     * @param mapperProvider mapperProvider
     * @param 主治医医療機関情報Dac 主治医医療機関情報Dac
     * @param 構成市町村マスタManager 構成市町村マスタManager
     * @param 主治医情報Manager 主治医情報Manager
     */
    ShujiiIryoKikanJohoManager(
            MapperProvider mapperProvider,
            DbT5911ShujiiIryoKikanJohoDac 主治医医療機関情報Dac,
            KoseiShichosonMasterManager 構成市町村マスタManager,
            ShujiiJohoManager 主治医情報Manager
    ) {
        this.mapperProvider = mapperProvider;
        this.主治医医療機関情報Dac = 主治医医療機関情報Dac;
        this.構成市町村マスタManager = 構成市町村マスタManager;
        this.主治医情報Manager = 主治医情報Manager;
    }

    /**
     * {@link InstanceProvider#create}にて生成した{@link ShujiiIryoKikanJohoManager}のインスタンスを返します。
     *
     * @return {@link InstanceProvider#create}にて生成した{@link ShujiiIryoKikanJohoManager}のインスタンス
     */
    public static ShujiiIryoKikanJohoManager createInstance() {
        return InstanceProvider.create(ShujiiIryoKikanJohoManager.class);
    }

    /**
     * 主キーに合致する主治医医療機関情報を返します。
     *
     * @param 主治医医療機関情報検索条件 主治医医療機関情報検索条件
     * @return ShujiiIryoKikanJoho nullが返る可能性があります。
     */
    @Transaction
    public ShujiiIryoKikanJoho get主治医医療機関情報(ShujiiIryoKikanShujiiParameter 主治医医療機関情報検索条件) {
        requireNonNull(主治医医療機関情報検索条件, UrSystemErrorMessages.値がnull.getReplacedMessage("主治医医療機関情報検索条件"));
        IShujiiIryoKikanShujiiMapper mapper = mapperProvider.create(IShujiiIryoKikanShujiiMapper.class);

        ShujiiIryoKikanJohoRelateEntity relateEntity = mapper.getShujiiIryoKikanShujiiRelateEntity(主治医医療機関情報検索条件);
        if (relateEntity == null) {
            return null;
        }
        relateEntity.initializeMd5ToEntities();
        return new ShujiiIryoKikanJoho(relateEntity);
    }

    /**
     * 主治医医療機関情報{@link ShujiiIryoKikanJoho}を保存します。
     *
     * @param 主治医医療機関情報 主治医医療機関情報
     * @return 更新あり:true、更新なし:false <br>
     * いずれかのテーブルに更新があればtrueを返す、いずれのテーブルもunchangedで更新無しの場合falseを返す
     */
    @Transaction
    public boolean save(ShujiiIryoKikanJoho 主治医医療機関情報) {
        requireNonNull(主治医医療機関情報, UrSystemErrorMessages.値がnull.getReplacedMessage("主治医医療機関情報"));

        if (!主治医医療機関情報.hasChanged()) {
            return false;
        }
        主治医医療機関情報 = 主治医医療機関情報.modifiedModel();
        save構成市町村マスタリスト(主治医医療機関情報.getKoseiShichosonMasterList());
        save主治医情報リスト(主治医医療機関情報.getShujiiJohoList());
        return 1 == 主治医医療機関情報Dac.save(主治医医療機関情報.toEntity());
    }

    private void save構成市町村マスタリスト(List<KoseiShichosonMaster> 構成市町村マスタList) {
        for (KoseiShichosonMaster 構成市町村マスタ : 構成市町村マスタList) {
            構成市町村マスタManager.save構成市町村マスタ(構成市町村マスタ);
        }
    }

    private void save主治医情報リスト(List<ShujiiJoho> 主治医情報List) {
        for (ShujiiJoho 主治医情報 : 主治医情報List) {
            主治医情報Manager.save主治医情報(主治医情報);
        }
    }
}