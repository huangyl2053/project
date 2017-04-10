/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC180020;

import jp.co.ndensan.reams.db.dbd.entity.db.relate.riyoshafutanwariaihantei.temptables.RiyoshaFutanWariaiMeisaiTempEntity;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 利用者負担割合明細08Tempの削除プロセスです。
 *
 * @reamsid_L DBC-4950-030 liuyang
 */
public class ClearRiyoshaFutanWariaiMeisai11TempProcess extends BatchProcessBase<RiyoshaFutanWariaiMeisaiTempEntity> {

    private static final RString TABLENAME = new RString("RiyoshaFutanWariaiMeisai11Temp");
    private static final RString PATH = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate."
            + "riyoshafutanwariaihantei.IRiyoshaFutanwariaiMapper.select利用者負担割合明細11Temp");
    @BatchWriter
    private BatchEntityCreatedTempTableWriter 利用者負担割合明細11Temp;

    @Override
    protected void createWriter() {
        利用者負担割合明細11Temp = new BatchEntityCreatedTempTableWriter(TABLENAME, RiyoshaFutanWariaiMeisaiTempEntity.class);
    }

    @Override
    protected void process(RiyoshaFutanWariaiMeisaiTempEntity entity) {
        利用者負担割合明細11Temp.delete(entity);
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(PATH);
    }
}
