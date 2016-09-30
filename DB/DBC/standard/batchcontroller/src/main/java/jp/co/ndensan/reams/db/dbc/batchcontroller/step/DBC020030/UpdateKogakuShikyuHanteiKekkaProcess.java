/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC020030;

import jp.co.ndensan.reams.db.dbc.definition.processprm.kogakukaigoservicehishikyuketteitsuchisho.KogakuKaigoServiceProcessParameter;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3057KogakuShikyuHanteiKekkaEntity;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchPermanentTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 *
 * 高額介護サービス費支給判定結果の更新処理のクラスです。
 *
 * @reamsid_L DBC-2000-030 xicongwang
 */
public class UpdateKogakuShikyuHanteiKekkaProcess extends BatchProcessBase<DbT3057KogakuShikyuHanteiKekkaEntity> {

    private static final RString MAPPERPATH = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate."
            + "kogakukaigoservice.IKogakuKaigoServicehiShikyuKetteiTsuchishoMapper.select支給判定結果");

    private KogakuKaigoServiceProcessParameter parameter;

    @BatchWriter
    BatchPermanentTableWriter<DbT3057KogakuShikyuHanteiKekkaEntity> 支給判定結果tableWriter;

    @Override
    protected void createWriter() {
        支給判定結果tableWriter = new BatchPermanentTableWriter<>(DbT3057KogakuShikyuHanteiKekkaEntity.class);
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MAPPERPATH, parameter.toパラメータ());
    }

    @Override
    protected void process(DbT3057KogakuShikyuHanteiKekkaEntity entity) {
        entity.setKetteiYMD(new FlexibleDate(parameter.get決定日().toDateString()));
        支給判定結果tableWriter.update(entity);
    }
}
