/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.dbc110040;

import jp.co.ndensan.reams.db.dbc.entity.db.relate.kogakuservicehihanteikekkaout.DbWT3411KogakuShikyuShinseiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kogakuservicehihanteikekkaout.KogakuServicehiHanteiKanrenDataKoushinEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.saishinsamoshitateshoout.DbWT1001HihokenshaEntity;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchTableWriter;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;

/**
 * 高額サービス費給付判定結果情報作成・保険者番号取込を実行する。
 *
 * @reamsid_L DBC-2610-030 liuhui
 */
public class KogakuServicehiHanteiReadHokenshaNoProcess extends BatchProcessBase<KogakuServicehiHanteiKanrenDataKoushinEntity> {

    private static final RString READ_DATA_ID = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate."
            + "kogakuservicehihanteikekkaout.IKogakuServicehiHanteikekkaOutJohoMapper.select保険者番号取込関連リスト");
    @BatchWriter
    private IBatchTableWriter 高額介護サービス費支給一時tableWriter;
    private static final RString 高額介護サービス費支給一時_TABLE_NAME = new RString("DbWT3411KogakuShikyuShinsei");

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(READ_DATA_ID);
    }

    @Override
    protected void createWriter() {
        高額介護サービス費支給一時tableWriter
                = new BatchEntityCreatedTempTableWriter(高額介護サービス費支給一時_TABLE_NAME, DbWT3411KogakuShikyuShinseiEntity.class);
    }

    @Override
    protected void process(KogakuServicehiHanteiKanrenDataKoushinEntity entity) {
        DbWT3411KogakuShikyuShinseiEntity 高額介護 = entity.get高額介護();
        DbWT1001HihokenshaEntity 被保険者 = entity.get被保険者();
        高額介護.setHokenshaNo(被保険者.getExHokenshaNo());
        高額介護.setHokenshaName(被保険者.getExHokenshaName());
        高額介護.setState(EntityDataState.Modified);
        高額介護サービス費支給一時tableWriter.update(高額介護);
    }
}
