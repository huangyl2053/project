/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC120050;

import jp.co.ndensan.reams.db.dbc.definition.processprm.dbc120050.KyufuJissekiInMasterTorokuProcessParameter;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3030KyufuJissekiShakaiFukushiHojinKeigengakuEntity;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchPermanentTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;

/**
 * 給付更新結果情報取込・マスタ登録・DAを実行する。
 *
 * @reamsid_L DBC-2440-010 zhangrui
 */
public class KyufuJissekiInMasterTorokuDAProcess extends BatchProcessBase<DbT3030KyufuJissekiShakaiFukushiHojinKeigengakuEntity> {

    private static final RString READ_DATA_ID = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate."
            + "kyufujissekiin.IKyufuJissekiInMasterTorokuMapper.getマスタ登録データDA");
    @BatchWriter
    private BatchPermanentTableWriter 給付実績社会福祉法人軽減額tableWriter;

    private KyufuJissekiInMasterTorokuProcessParameter parameter;
    private static final int 十桁 = 10;

    @Override
    protected void createWriter() {
        給付実績社会福祉法人軽減額tableWriter
                = new BatchPermanentTableWriter(DbT3030KyufuJissekiShakaiFukushiHojinKeigengakuEntity.class);
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(READ_DATA_ID);
    }

    @Override
    protected void process(DbT3030KyufuJissekiShakaiFukushiHojinKeigengakuEntity entity) {
        RString 通し番号 = new RString(Long.parseLong(entity.getToshiNo().toString())
                + parameter.get番号() - 1).padZeroToLeft(十桁);
        entity.setToshiNo(通し番号);
        entity.setState(EntityDataState.Added);
        給付実績社会福祉法人軽減額tableWriter.insert(entity);
    }

}