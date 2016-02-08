/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbx.service.core.kaigoserviceshurui.kaigoservicenaiyou;

import java.util.ArrayList;
import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbx.business.core.kaigoserviceshurui.kaigoservicenaiyou.KaigoServiceNaiyou;
import jp.co.ndensan.reams.db.dbx.definition.mybatis.param.servicecode.SabisuKodoParameter;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT7131KaigoServiceNaiyouEntity;
import jp.co.ndensan.reams.db.dbx.persistence.db.basic.DbT7131KaigoServiceNaiyouDac;
import jp.co.ndensan.reams.db.dbx.persistence.db.mapper.basic.IDbT7131KaigoServiceNaiyouMapper;
import jp.co.ndensan.reams.db.dbx.service.core.MapperProvider;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.KaigoServiceShuruiCode;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 介護サービス内容を管理するクラスです。
 */
public class KaigoServiceNaiyouManager {

    private final DbT7131KaigoServiceNaiyouDac dac;
    
    private final MapperProvider mapperProvider;
    
    /**
     * コンストラクタです。
     */
    public KaigoServiceNaiyouManager() {
        dac = InstanceProvider.create(DbT7131KaigoServiceNaiyouDac.class);
        mapperProvider = InstanceProvider.create(MapperProvider.class);
    }

    /**
     * テスト用コンストラクタです。
     *
     * @param dac {@link DbT7131KaigoServiceNaiyouDac}
     */
    KaigoServiceNaiyouManager(DbT7131KaigoServiceNaiyouDac dac,
            MapperProvider mapperProvider) {
        this.dac = dac;
        this.mapperProvider = mapperProvider;
    }
    
    /**
     * {@link InstanceProvider#create}にて生成した{@link KaigoJigyoshaManager}のインスタンスを返します。
     *
     * @return {@link InstanceProvider#create}にて生成した{@link KaigoJigyoshaManager}のインスタンス
     */
    public static KaigoServiceNaiyouManager createInstance() {
        return InstanceProvider.create(KaigoServiceNaiyouManager.class);
    }
    
    /**
     * 介護サービス内容{@link KaigoServiceNaiyou}を保存します。
     *
     * @param 介護サービス内容 {@link KaigoServiceNaiyou}
     * @return 更新件数 更新結果の件数を返します。
     */
    @Transaction
    public boolean save介護サービス内容(KaigoServiceNaiyou 介護サービス内容) {
        requireNonNull(介護サービス内容, UrSystemErrorMessages.値がnull.getReplacedMessage("介護サービス内容"));
        if (!介護サービス内容.hasChanged()) {
            return false;
        }
        return 1 == dac.save(介護サービス内容.toEntity());
    }
    
    /**
     * サービスコードのフォーカスアウトを取得します。
     *
     * @param parameter SabisuKodoParameter
     * @return List<KaigoServiceNaiyou>
     */
    public List<KaigoServiceNaiyou> getFouceServiceCodeList(SabisuKodoParameter parameter) {
        List<DbT7131KaigoServiceNaiyouEntity> サービスコード情報リスト = dac.getサービス内容(new KaigoServiceShuruiCode(parameter.
                getServiceShuruiCode()),
                parameter.getServiceKoumokuCode(), 
                parameter.getHaakuKijunYM());
        List<KaigoServiceNaiyou> サービスコード情報検索リスト = new ArrayList<>();
        for (DbT7131KaigoServiceNaiyouEntity kaigoServiceNaiyouEntity : サービスコード情報リスト) {
            サービスコード情報検索リスト.add(new KaigoServiceNaiyou(kaigoServiceNaiyouEntity));
        }
        return サービスコード情報検索リスト;
    }
    
    /**
     * サービスコード取得を取得します。
     *
     * @param parameter SabisuKodoParameter
     * @return List<KaigoServiceNaiyou>
     */
    public List<KaigoServiceNaiyou> getServiceCodeList(SabisuKodoParameter parameter) {
        IDbT7131KaigoServiceNaiyouMapper mapper = mapperProvider.create(IDbT7131KaigoServiceNaiyouMapper.class);
        List<DbT7131KaigoServiceNaiyouEntity> サービスコード情報リスト = mapper.getKaigoServiceNaiyou(parameter);
        List<KaigoServiceNaiyou> サービスコード情報検索リスト = new ArrayList<>();
        for (DbT7131KaigoServiceNaiyouEntity kaigoServiceNaiyouEntity : サービスコード情報リスト) {
            サービスコード情報検索リスト.add(new KaigoServiceNaiyou(kaigoServiceNaiyouEntity));
        }
        return サービスコード情報検索リスト;
    }
    
}
