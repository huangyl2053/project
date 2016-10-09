/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC020010;

import java.util.List;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3109JigyoKogakuKyufuTaishoshaGokeiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3110JigyoKogakuShikyuShinseiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3111JigyoKogakuShikyuHanteiKekkaEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3112KogakuShikyuShinsaKetteiEntity;
import jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate.kogakukaigoservicehikyufutaishoshatoroku.IKogakuKaigoServicehiKyufugakuSanshutsuMapper;
import jp.co.ndensan.reams.db.dbc.service.core.kogakukaigoservicehikyufugakusanshutsu.KogakuKaigoServicehiKyufugakuSanshutsuManager;
import jp.co.ndensan.reams.uz.uza.batch.process.SimpleBatchProcessBase;

/**
 * 事業高額介護サービス費追加のProcessフロークラスです。
 *
 * @reamsid_L DBC-2010-040 wangxingpeng
 */
public class InsJigyoKogakuKaigoServiceHiProcess extends SimpleBatchProcessBase {

    private KogakuKaigoServicehiKyufugakuSanshutsuManager manager;
    private IKogakuKaigoServicehiKyufugakuSanshutsuMapper mapper;

    @Override
    protected void beforeExecute() {
        manager = KogakuKaigoServicehiKyufugakuSanshutsuManager.createInstance();
        mapper = getMapper(IKogakuKaigoServicehiKyufugakuSanshutsuMapper.class);
    }

    @Override
    protected void process() {
        List<DbT3110JigyoKogakuShikyuShinseiEntity> 事業高額介護サービス費支給申請リスト = mapper.get事業高額介護サービス費支給申請();
        for (DbT3110JigyoKogakuShikyuShinseiEntity entity : 事業高額介護サービス費支給申請リスト) {
            manager.save事業高額介護サービス費支給申請(entity);
        }
        List<DbT3111JigyoKogakuShikyuHanteiKekkaEntity> 事業高額介護サービス費支給判定結果リスト = mapper.get事業高額介護サービス費支給判定結果();
        for (DbT3111JigyoKogakuShikyuHanteiKekkaEntity entity : 事業高額介護サービス費支給判定結果リスト) {
            manager.save事業高額介護サービス費支給判定結果(entity);
        }
        List<DbT3112KogakuShikyuShinsaKetteiEntity> 事業高額介護サービス費支給審査決定リスト = mapper.get事業高額介護サービス費支給審査決定();
        for (DbT3112KogakuShikyuShinsaKetteiEntity entity : 事業高額介護サービス費支給審査決定リスト) {
            manager.save事業高額介護サービス費支給審査決定(entity);
        }
        List<DbT3109JigyoKogakuKyufuTaishoshaGokeiEntity> 事業高額介護サービス費給付対象者合計リスト = mapper.get事業高額介護サービス費給付対象者合計();
        for (DbT3109JigyoKogakuKyufuTaishoshaGokeiEntity entity : 事業高額介護サービス費給付対象者合計リスト) {
            manager.save事業高額介護サービス費給付対象者合計(entity);
        }
        mapper.update事業高額介護サービス費給付対象者合計();
        // QA確認中
//        mapper.insert事業高額介護サービス給付対象者明細();
    }
}
