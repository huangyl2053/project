/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.service.core.jikofutangakushomeishotoroku;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.basic.JigyoKogakuGassanJikoFutanGakuShomeisho;
import jp.co.ndensan.reams.db.dbc.business.core.basic.JigyoKogakuGassanJikoFutanGakuShomeishoMeisai;
import jp.co.ndensan.reams.db.dbc.business.core.jikofutangakushomeishotoroku.JikofutangakuShomeishoTorokuBusiness;
import jp.co.ndensan.reams.db.dbc.definition.mybatisprm.jikofutangakushomeishotoroku.JikofutangakuShomeishoTorokuParameter;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3180JigyoKogakuGassanJikoFutanGakuShomeishoEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3181JigyoKogakuGassanJikoFutanGakuShomeishoMeisaiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jikofutangakushomeishotoroku.JikofutangakuShomeishoTorokuEntity;
import jp.co.ndensan.reams.db.dbc.persistence.db.basic.DbT3180JigyoKogakuGassanJikoFutanGakuShomeishoDac;
import jp.co.ndensan.reams.db.dbc.persistence.db.basic.DbT3181JigyoKogakuGassanJikoFutanGakuShomeishoMeisaiDac;
import jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate.jikofutangakushomeishotoroku.IJikofutangakuShomeishoTorokuMapper;
import jp.co.ndensan.reams.db.dbc.service.core.MapperProvider;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import jp.co.ndensan.reams.uz.uza.util.db.SearchResult;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 事業分自己負担額証明書登録（単）用Managerクラスです。
 *
 * @reamsid_L DBC-4820-010 sunhaidi
 */
public class JikofutangakuShomeishoTorokuManager {

    private final MapperProvider mapperProvider;
    private final DbT3180JigyoKogakuGassanJikoFutanGakuShomeishoDac dbT3180Dac;
    private final DbT3181JigyoKogakuGassanJikoFutanGakuShomeishoMeisaiDac dbT3181Dac;

    /**
     * コンストラクタです。
     *
     */
    public JikofutangakuShomeishoTorokuManager() {
        this.mapperProvider = InstanceProvider.create(MapperProvider.class);
        this.dbT3180Dac = InstanceProvider.create(DbT3180JigyoKogakuGassanJikoFutanGakuShomeishoDac.class);
        this.dbT3181Dac = InstanceProvider.create(DbT3181JigyoKogakuGassanJikoFutanGakuShomeishoMeisaiDac.class);
    }

    /**
     * コンストラクタです。
     *
     * @param mapperProvider MapperProvider
     * @param dbT3180Dac DbT3180JigyoKogakuGassanJikoFutanGakuShomeishoDac
     * @param dbT3181Dac DbT3181JigyoKogakuGassanJikoFutanGakuShomeishoMeisaiDac
     */
    public JikofutangakuShomeishoTorokuManager(MapperProvider mapperProvider,
            DbT3180JigyoKogakuGassanJikoFutanGakuShomeishoDac dbT3180Dac,
            DbT3181JigyoKogakuGassanJikoFutanGakuShomeishoMeisaiDac dbT3181Dac) {
        this.mapperProvider = mapperProvider;
        this.dbT3180Dac = dbT3180Dac;
        this.dbT3181Dac = dbT3181Dac;
    }

    /**
     * {@link InstanceProvider#create}により生成されたインタフェースを返します。
     *
     * @return {@link InstanceProvider#create}により生成された{@link JikofutangakuShomeishoTorokuManager}
     */
    public static JikofutangakuShomeishoTorokuManager createInstance() {
        return InstanceProvider.create(JikofutangakuShomeishoTorokuManager.class);
    }

    /**
     * 事業高額合算自己負担額証明書情報を取得します。
     *
     * @param parameter JikofutangakuShomeishoTorokuParameter
     * @return JigyoKogakuGassanJikoFutanGakuShomeisho
     */
    public SearchResult<JigyoKogakuGassanJikoFutanGakuShomeisho> get事業高額合算自己負担額証明書情報(
            JikofutangakuShomeishoTorokuParameter parameter) {
        List<DbT3180JigyoKogakuGassanJikoFutanGakuShomeishoEntity> entityList = mapperProvider.create(IJikofutangakuShomeishoTorokuMapper.class)
                .get事業高額合算自己負担額証明書情報(parameter);

        List<JigyoKogakuGassanJikoFutanGakuShomeisho> list = new ArrayList<>();
        for (DbT3180JigyoKogakuGassanJikoFutanGakuShomeishoEntity entity : entityList) {
            entity.initializeMd5();
            JigyoKogakuGassanJikoFutanGakuShomeisho gakuShomeisho = new JigyoKogakuGassanJikoFutanGakuShomeisho(entity);
            list.add(gakuShomeisho);
        }
        return SearchResult.of(list, 0, true);
    }

    /**
     * 事業高額合算自己負担額証明書を保存します。
     *
     * @param shomeisho JigyoKogakuGassanJikoFutanGakuShomeisho
     */
    public void save事業高額合算自己負担額証明書(JigyoKogakuGassanJikoFutanGakuShomeisho shomeisho) {
        dbT3180Dac.save(shomeisho.toEntity());
    }

    /**
     * 事業高額合算自己負担額証明書を削除します。
     *
     * @param shomeisho JigyoKogakuGassanJikoFutanGakuShomeisho
     */
    public void delete事業高額合算自己負担額証明書(JigyoKogakuGassanJikoFutanGakuShomeisho shomeisho) {
        DbT3180JigyoKogakuGassanJikoFutanGakuShomeishoEntity shomeishoEntity = shomeisho.toEntity();
        shomeishoEntity.setState(EntityDataState.Deleted);
        dbT3180Dac.save(shomeishoEntity);
    }

    /**
     * 事業高額合算自己負担額証明書明細を保存します。
     *
     * @param meisaiList List<JigyoKogakuGassanJikoFutanGakuShomeishoMeisai>
     */
    public void save事業高額合算自己負担額証明書明細(List<JigyoKogakuGassanJikoFutanGakuShomeishoMeisai> meisaiList) {
        for (JigyoKogakuGassanJikoFutanGakuShomeishoMeisai meisai : meisaiList) {
            dbT3181Dac.save(meisai.toEntity());
        }
    }

    /**
     * 事業高額合算自己負担額証明書明細を保存します。
     *
     * @param meisaiList List<JigyoKogakuGassanJikoFutanGakuShomeishoMeisai>
     */
    public void delete事業高額合算自己負担額証明書明細(List<JigyoKogakuGassanJikoFutanGakuShomeishoMeisai> meisaiList) {
        for (JigyoKogakuGassanJikoFutanGakuShomeishoMeisai meisai : meisaiList) {
            DbT3181JigyoKogakuGassanJikoFutanGakuShomeishoMeisaiEntity entity = meisai.toEntity();
            entity.setState(EntityDataState.Deleted);
            dbT3181Dac.save(entity);
        }
    }

    /**
     * 事業高額合算自己負担額証明書履歴情報を取得します。
     *
     * @param parameter JikofutangakuShomeishoTorokuParameter
     * @return JigyoKogakuGassanJikoFutanGakuShomeisho
     */
    public SearchResult<JigyoKogakuGassanJikoFutanGakuShomeisho> get事業高額合算自己負担額証明書履歴情報(
            JikofutangakuShomeishoTorokuParameter parameter) {
        List<DbT3180JigyoKogakuGassanJikoFutanGakuShomeishoEntity> entityList = mapperProvider.create(IJikofutangakuShomeishoTorokuMapper.class)
                .get事業高額合算自己負担額証明書履歴情報(parameter);

        List<JigyoKogakuGassanJikoFutanGakuShomeisho> list = new ArrayList<>();
        for (DbT3180JigyoKogakuGassanJikoFutanGakuShomeishoEntity entity : entityList) {
            entity.initializeMd5();
            JigyoKogakuGassanJikoFutanGakuShomeisho gakuShomeisho = new JigyoKogakuGassanJikoFutanGakuShomeisho(entity);
            list.add(gakuShomeisho);
        }
        return SearchResult.of(list, 0, false);
    }

    /**
     * 事業高額合算自己負担額証明書履歴情報を取得します。
     *
     * @param parameter JikofutangakuShomeishoTorokuParameter
     * @return JikofutangakuShomeishoTorokuBusiness
     */
    public SearchResult<JikofutangakuShomeishoTorokuBusiness> get事業高額合算支給申請書情報(JikofutangakuShomeishoTorokuParameter parameter) {
        JikofutangakuShomeishoTorokuEntity torokuEntity = mapperProvider.create(IJikofutangakuShomeishoTorokuMapper.class)
                .get事業高額合算支給申請書情報(parameter);

        List<JikofutangakuShomeishoTorokuBusiness> list = new ArrayList<>();
        JikofutangakuShomeishoTorokuBusiness business = new JikofutangakuShomeishoTorokuBusiness(torokuEntity);
        list.add(business);
        return SearchResult.of(list, 0, false);
    }

    /**
     * 事業高額合算自己負担額証明書Countを取得します。
     *
     * @param parameter JikofutangakuShomeishoTorokuParameter
     * @return JikofutangakuShomeishoTorokuBusiness
     */
    public int get事業高額合算自己負担額証明書Count(JikofutangakuShomeishoTorokuParameter parameter) {
        return mapperProvider.create(IJikofutangakuShomeishoTorokuMapper.class).get事業高額合算自己負担額証明書Count(parameter);
    }

    /**
     * 事業高額合算自己負担額証明書最新履歴番号を取得します。
     *
     * @param parameter JikofutangakuShomeishoTorokuParameter
     * @return JikofutangakuShomeishoTorokuBusiness
     */
    public Decimal get事業高額合算自己負担額証明書最新履歴番号(JikofutangakuShomeishoTorokuParameter parameter) {
        return mapperProvider.create(IJikofutangakuShomeishoTorokuMapper.class).get事業高額合算自己負担額証明書最新履歴番号(parameter);
    }
}
