/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.batchcontroller.step.DBU010060;

import jp.co.ndensan.reams.db.dbu.definition.processprm.hokenkyufushokankettei.JigyoHokokuRenkeiHokenkyufuShokanKetteiProcessParameter;
import jp.co.ndensan.reams.db.dbu.entity.db.relate.hokenkyufushokankettei.TempDwbTKyufujissekiShukeiKonkyo2Entity;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 事業報告資料登録(特定入所者介護用)のバッチ処理クラスです。
 *
 * @reamsid_L DBU-5560-030 xuyannan
 */
public class JigyoHokokuShiryouTorokuTokuteiNyusyoInsertProcess extends BatchProcessBase<TempDwbTKyufujissekiShukeiKonkyo2Entity> {

    private static final RString MYBATIS_SELECT_ID = new RString(
            "jp.co.ndensan.reams.db.dbu.persistence.db.mapper.relate.hokenkyufushokankettei."
            + "IJigyoHokokuRenkeiHokenkyufuShokanKetteiMapper.getJigyouHokokuShiryou_TokuteiNyusyo");
    private static final RString 特定入所者集計根拠テーブル = new RString("tempDwbTKyufujissekiShukeiKonkyo2");
    private JigyoHokokuRenkeiHokenkyufuShokanKetteiProcessParameter processParameter;
    @BatchWriter
    private BatchEntityCreatedTempTableWriter<TempDwbTKyufujissekiShukeiKonkyo2Entity> tempEntityWriter;

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MYBATIS_SELECT_ID, processParameter.create根拠CSV情報作成MybitisParamter());
    }

    @Override
    protected void createWriter() {
        tempEntityWriter = new BatchEntityCreatedTempTableWriter(特定入所者集計根拠テーブル, TempDwbTKyufujissekiShukeiKonkyo2Entity.class);
    }

    @Override
    protected void process(TempDwbTKyufujissekiShukeiKonkyo2Entity entity) {
        tempEntityWriter.insert(entity);
    }
}