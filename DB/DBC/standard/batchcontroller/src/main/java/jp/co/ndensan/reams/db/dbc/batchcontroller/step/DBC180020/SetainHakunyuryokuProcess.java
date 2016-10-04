/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC180020;

import jp.co.ndensan.reams.db.dbc.definition.processprm.dbc180020.DBC180020ProcessParameter;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.riyoshafutanwariaihantei.temptables.SetaiHaakuEntity;
import jp.co.ndensan.reams.db.dbc.service.core.riyoshafutanwariaihantei.RiyoshaFutanWariaiHantei;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 世帯員把握入力Tempの入力のクラスです。<br/>
 * 処理詳細2.part1/処理詳細4.part1
 *
 * @reamsid_L DBC-4950-030 liuyang
 */
public class SetainHakunyuryokuProcess extends BatchProcessBase<SetaiHaakuEntity> {

    private static final RString TABLENAME = new RString("TmpSetaiHaaku");
    private static final RString PATH = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate."
            + "riyoshafutanwariaihantei.IRiyoshaFutanwariaiMapper.select世帯員把握入力");
    private DBC180020ProcessParameter parameter;
    @BatchWriter
    private BatchEntityCreatedTempTableWriter 世帯員把握入力Temp;

    @Override
    protected void createWriter() {
        世帯員把握入力Temp = new BatchEntityCreatedTempTableWriter(TABLENAME, SetaiHaakuEntity.class);
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(PATH, parameter.toMyBatisParameter(RiyoshaFutanWariaiHantei.createInstance().
                getTaishoShuryobi(parameter.getTaishoNendo())));
    }

    @Override
    protected void process(SetaiHaakuEntity entity) {
        if (entity.getShikibetsuCode() == null || entity.getShikibetsuCode().isEmpty()) {
            entity.setShikibetsuCode(entity.getShikibetsuCode2());
            entity.setJushochiTokureiFlag(null);
        }
        世帯員把握入力Temp.insert(entity);
    }

}