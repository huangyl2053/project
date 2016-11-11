/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC020010;

import jp.co.ndensan.reams.db.dbc.definition.processprm.kogakukaigoservicehikyufutaishoshatoroku.InsKyufuJissekiKihonKogakuTmp4Param;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kogakukaigoservicehikyufutaishoshatoroku.InsKyufuJissekiKihonKogakuTmpProcess4Param;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3017KyufujissekiKihonEntity;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 *
 * 給付実績基本抽出03のProcessフロークラスです。
 *
 * @reamsid_L DBC-2010-040 jianglaisheng
 */
public class InsKyufuJissekiKihonKogakuTmpProcess4 extends BatchProcessBase<DbT3017KyufujissekiKihonEntity> {

    private static final RString 給付実績基本 = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate."
            + "kogakukaigoservicehikyufutaishoshatoroku.IKogakuKaigoServicehiKyufugakuSanshutsuMapper.get給付実績基本");
    private static final RString TABLE_給付実績基本情報高額一時4 = new RString("TempKyufujissekiKihon4");

    private InsKyufuJissekiKihonKogakuTmpProcess4Param processParameter;
    private DbT3017KyufujissekiKihonEntity beforeEntity;
    @BatchWriter
    private BatchEntityCreatedTempTableWriter 給付実績基本情報高額一時;

    @Override
    protected IBatchReader createReader() {
        InsKyufuJissekiKihonKogakuTmp4Param parameterDB = new InsKyufuJissekiKihonKogakuTmp4Param(
                processParameter.get最古のサービス提供年月(), processParameter.get最新のサービス提供年月());
        return new BatchDbReader(給付実績基本, parameterDB);
    }

    @Override
    protected void createWriter() {
        給付実績基本情報高額一時 = new BatchEntityCreatedTempTableWriter(
                TABLE_給付実績基本情報高額一時4, DbT3017KyufujissekiKihonEntity.class);
    }

    @Override
    protected void process(DbT3017KyufujissekiKihonEntity entity) {
        if (beforeEntity == null) {
            beforeEntity = entity;
        }
        if (getBreakKey(beforeEntity).equals(getBreakKey(entity))) {
            beforeEntity = entity;
            return;
        }
        if (processParameter.get処理年月() != null && !processParameter.get処理年月().isEmpty()
                && beforeEntity.getShinsaYM() != null && !beforeEntity.getShinsaYM().isEmpty()
                && processParameter.get処理年月().isBeforeOrEquals(beforeEntity.getShinsaYM())) {
            beforeEntity = entity;
            return;
        }
        給付実績基本情報高額一時.insert(beforeEntity);
        beforeEntity = entity;
    }

    @Override
    protected void afterExecute() {
        if (processParameter.get処理年月() != null && !processParameter.get処理年月().isEmpty()
                && beforeEntity.getShinsaYM() != null && !beforeEntity.getShinsaYM().isEmpty()
                && beforeEntity.getShinsaYM().isBefore(processParameter.get処理年月())) {
            給付実績基本情報高額一時.insert(beforeEntity);
        }
    }

    private RString getBreakKey(DbT3017KyufujissekiKihonEntity entity) {
        return entity.getInputShikibetsuNo().getColumnValue()
                .concat(entity.getHiHokenshaNo().getColumnValue())
                .concat(entity.getServiceTeikyoYM().toDateString())
                .concat(entity.getKyufuJissekiKubunCode())
                .concat(entity.getJigyoshoNo().getColumnValue());
    }
}