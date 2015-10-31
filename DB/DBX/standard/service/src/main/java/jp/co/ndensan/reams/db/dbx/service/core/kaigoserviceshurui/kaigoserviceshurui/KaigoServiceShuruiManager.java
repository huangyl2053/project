/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbx.service.core.kaigoserviceshurui.kaigoserviceshurui;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbx.business.core.kaigoserviceshurui.kaigoservicenaiyou.KaigoServiceNaiyou;
import jp.co.ndensan.reams.db.dbx.business.core.kaigoserviceshurui.kaigoserviceshurui.KaigoServiceShurui;
import jp.co.ndensan.reams.db.dbx.definition.mybatis.param.kaigoserviceshurui.KaigoServiceShuruiMapperParameter;
import jp.co.ndensan.reams.db.dbx.entity.db.relate.kaigoserviceshurui.KaigoServiceShuruiEntity;
import jp.co.ndensan.reams.db.dbx.persistence.db.basic.DbT7130KaigoServiceShuruiDac;
import jp.co.ndensan.reams.db.dbx.persistence.db.mapper.relate.kaigoserviceshurui.IKaigoServiceShuruiMapper;
import jp.co.ndensan.reams.db.dbx.service.core.MapperProvider;
import jp.co.ndensan.reams.db.dbx.service.core.kaigoserviceshurui.kaigoservicenaiyou.KaigoServiceNaiyouManager;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 介護サービス種類を管理するクラスです。
 */
public class KaigoServiceShuruiManager {

    private final MapperProvider mapperProvider;
    private final DbT7130KaigoServiceShuruiDac 介護サービス種類Dac;
    private final KaigoServiceNaiyouManager 介護サービス内容Manager;

    /**
     * コンストラクタです。
     */
    KaigoServiceShuruiManager() {
        this.mapperProvider = InstanceProvider.create(MapperProvider.class);
        this.介護サービス種類Dac = InstanceProvider.create(DbT7130KaigoServiceShuruiDac.class);
        this.介護サービス内容Manager = new KaigoServiceNaiyouManager();
    }

    /**
     * 単体テスト用のコンストラクタです。
     * 
     * @param mapperProvider mapperProvider
     * @param 介護サービス種類Dac 介護サービス種類Dac
     * @param 介護サービス内容Manager 介護サービス内容Manager
     */
    KaigoServiceShuruiManager(
            MapperProvider mapperProvider,
            DbT7130KaigoServiceShuruiDac 介護サービス種類Dac,
            KaigoServiceNaiyouManager 介護サービス内容Manager
    ) {
        this.mapperProvider = mapperProvider;
        this.介護サービス種類Dac = 介護サービス種類Dac;
        this.介護サービス内容Manager = 介護サービス内容Manager;
    }

    /**
     * {@link InstanceProvider#create}にて生成した{@link KaigoServiceShuruiManager}のインスタンスを返します。
     *
     * @return {@link InstanceProvider#create}にて生成した{@link KaigoServiceShuruiManager}のインスタンス
     */
    public static KaigoServiceShuruiManager createInstance() {
        return InstanceProvider.create(KaigoServiceShuruiManager.class);
    }

    /**
     * 主キーに合致する介護サービス種類を返します。
     *
     * @param 介護サービス種類検索条件 介護サービス種類検索条件
     * @return KaigoServiceShurui nullが返る可能性があります。
     */
    @Transaction
    public KaigoServiceShurui get介護サービス種類(KaigoServiceShuruiMapperParameter 介護サービス種類検索条件) {
        requireNonNull(介護サービス種類検索条件, UrSystemErrorMessages.値がnull.getReplacedMessage("介護サービス種類検索条件"));
        IKaigoServiceShuruiMapper mapper = mapperProvider.create(IKaigoServiceShuruiMapper.class);

        KaigoServiceShuruiEntity relateEntity = mapper.getKaigoServiceEntity(介護サービス種類検索条件);
        if (relateEntity == null) {
            return null;
        }
        relateEntity.initializeMd5ToEntities();
        return new KaigoServiceShurui(relateEntity);
    }

    /**
     * 介護サービス種類{@link KaigoServiceShurui}を保存します。
     *
     * @param 介護サービス種類 介護サービス種類
     * @return 更新あり:true、更新なし:false <br>
     * いずれかのテーブルに更新があればtrueを返す、いずれのテーブルもunchangedで更新無しの場合falseを返す
     */
    @Transaction
    public boolean save(KaigoServiceShurui 介護サービス種類) {
        requireNonNull(介護サービス種類, UrSystemErrorMessages.値がnull.getReplacedMessage("介護サービス種類"));

        if (!介護サービス種類.hasChanged()) {
            return false;
        }
        介護サービス種類 = 介護サービス種類.modifiedModel();
        save介護サービス内容リスト(介護サービス種類.getKaigoServiceNaiyouList());
        return 1 == 介護サービス種類Dac.save(介護サービス種類.toEntity());
    }

    private void save介護サービス内容リスト(List<KaigoServiceNaiyou> 介護サービス内容List) {    
        for (KaigoServiceNaiyou 介護サービス内容 : 介護サービス内容List) {
            介護サービス内容Manager.save介護サービス内容(介護サービス内容);
        }
    }
}