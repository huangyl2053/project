package jp.co.ndensan.reams.db.dba.service.core.shichosonSentaku;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dba.business.core.shichosonSentaku.ShichosonSelectorResult;
import jp.co.ndensan.reams.db.dba.persistence.mapper.basic.IShichosonSentakuMapper;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7051KoseiShichosonMasterEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7056GappeiShichosonEntity;
import jp.co.ndensan.reams.db.dbz.persistence.db.basic.DbT7056GappeiShichosonDac;
import jp.co.ndensan.reams.db.dbz.service.core.MapperProvider;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 市町村選択には、旧市町村選択情報を取得する、構成市町村選択情報を取得する機能を提供します。
 *
 */
public class ShichosonSentakuFinder {

    private final DbT7056GappeiShichosonDac dac;
    private final MapperProvider mapperProvider;

    /**
     * コンストラクタです。
     */
    public ShichosonSentakuFinder() {
        this.dac = InstanceProvider.create(DbT7056GappeiShichosonDac.class);
        this.mapperProvider = InstanceProvider.create(MapperProvider.class);
    }

    /**
     * コンストラクタです。
     *
     * @return
     */
    public static ShichosonSentakuFinder createInstance() {
        return InstanceProvider.create(ShichosonSentakuFinder.class);
    }

    /**
     * テスト用コンストラクタです。
     *
     * @param dac {@link DbT7056GappeiShichosonDac}
     * @param dac {@link IShichosonSentakuMapper}
     */
    ShichosonSentakuFinder(DbT7056GappeiShichosonDac dac, MapperProvider mapperProvider) {
        this.dac = dac;
        this.mapperProvider = mapperProvider;
    }

    /**
     * 合併市町村選択情報を取得する。
     *
     * @param 基準日
     * @return 旧市町村選択情報取得
     */
    public List<ShichosonSelectorResult> getGapeiShichosonSentaku(FlexibleDate 基準日) {
        List<DbT7056GappeiShichosonEntity> entityList = dac.selectfor合併市町村選択情報の取得処理(
                基準日);
        if (entityList.isEmpty()) {
            return new ArrayList();
        }
        List<ShichosonSelectorResult> resultList = new ArrayList();
        for (DbT7056GappeiShichosonEntity entity : entityList) {
            ShichosonSelectorResult result = new ShichosonSelectorResult();
            result.set市町村コード(entity.getKyuShichosonCode());
            result.set市町村名(entity.getKyuShichosonMeisho());
            resultList.add(result);
        }
        return resultList;
    }

    /**
     * 構成市町村選択情報を取得する。
     *
     * @param 基準日
     * @return 構成市町村選択情報取得
     */
    public List<ShichosonSelectorResult> getKouseiShichosonSentaku(FlexibleDate 基準日) {
        IShichosonSentakuMapper mapper = mapperProvider.create(IShichosonSentakuMapper.class);
        List<DbT7051KoseiShichosonMasterEntity> mapperList = mapper.getEntity(基準日);
        if (mapperList.isEmpty()) {
            return new ArrayList();
        }
        List<ShichosonSelectorResult> resultList = new ArrayList();
        for (DbT7051KoseiShichosonMasterEntity entity : mapperList) {
            ShichosonSelectorResult result = new ShichosonSelectorResult();
            result.set合併旧市町村区分(entity.getGappeiKyuShichosonKubun());
            result.set市町村コード(entity.getShichosonCode());
            result.set市町村名(entity.getShichosonMeisho());

            resultList.add(result);
        }
        return resultList;
    }
}
