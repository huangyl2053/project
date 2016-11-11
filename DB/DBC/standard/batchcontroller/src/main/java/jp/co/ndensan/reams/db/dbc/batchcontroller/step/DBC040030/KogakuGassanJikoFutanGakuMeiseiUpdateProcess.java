/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC040030;

import jp.co.ndensan.reams.db.dbc.definition.processprm.dbc040030.KogakugassanJikofutangakuInfoHoseiProcessParameter;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3071KogakuGassanJikoFutanGakuMeisaiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc040030.KogakuGassanUpdateEntity;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchPermanentTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 高額合算自己負担額明細情報更新プロセスです。
 *
 * @reamsid_L DBC-2320-060 yuanzhenxia
 */
public class KogakuGassanJikoFutanGakuMeiseiUpdateProcess extends BatchProcessBase<KogakuGassanUpdateEntity> {

    private static final RString READ_DATA_ID = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate.dbc040030."
            + "IKogakugassanJikofutangakuInfoHoseiMapper.select高額合算自己負担額明細データ");
    private KogakugassanJikofutangakuInfoHoseiProcessParameter processParameter;
    private static final RString 当年4月 = new RString("004");
    private static final RString 当年5月 = new RString("005");
    private static final RString 当年6月 = new RString("006");
    private static final RString 当年7月 = new RString("007");
    private static final RString 当年8月 = new RString("008");
    private static final RString 当年9月 = new RString("009");
    private static final RString 当年10月 = new RString("010");
    private static final RString 当年11月 = new RString("011");
    private static final RString 当年12月 = new RString("012");
    private static final RString 翌年1月 = new RString("101");
    private static final RString 翌年2月 = new RString("102");
    private static final RString 翌年3月 = new RString("103");
    private static final RString 翌年4月 = new RString("104");
    private static final RString 翌年5月 = new RString("105");
    private static final RString 翌年6月 = new RString("106");
    private static final RString 翌年7月 = new RString("107");
    @BatchWriter
    BatchPermanentTableWriter<DbT3071KogakuGassanJikoFutanGakuMeisaiEntity> tableWrite;

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(READ_DATA_ID, processParameter.toKogakugassanJikofutangakuMybatisParameter());
    }

    @Override
    protected void createWriter() {
        this.tableWrite = new BatchPermanentTableWriter<>(DbT3071KogakuGassanJikoFutanGakuMeisaiEntity.class);
    }

    @Override
    protected void process(KogakuGassanUpdateEntity entity) {
        DbT3071KogakuGassanJikoFutanGakuMeisaiEntity 高額合算自己負担額明細 = entity.get高額合算自己負担額明細();
        if (当年4月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getTounen_04_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getTounen_04_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getTounen_04_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getTounen_04_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getTounen_04_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (当年5月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getTounen_05_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getTounen_05_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getTounen_05_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getTounen_05_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getTounen_05_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (当年6月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getTounen_06_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getTounen_06_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getTounen_06_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getTounen_06_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getTounen_06_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (当年7月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getTounen_07_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getTounen_07_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getTounen_07_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getTounen_07_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getTounen_07_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (当年8月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getTounen_08_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getTounen_08_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getTounen_08_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getTounen_08_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getTounen_08_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (当年9月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getTounen_09_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getTounen_09_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getTounen_09_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getTounen_09_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getTounen_09_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (当年10月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getTounen_10_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getTounen_10_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getTounen_10_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getTounen_10_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getTounen_10_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (当年11月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getTounen_11_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getTounen_11_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getTounen_11_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getTounen_11_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getTounen_11_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (当年12月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getTounen_12_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getTounen_12_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getTounen_12_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getTounen_12_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getTounen_12_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (翌年1月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getYokunen_01_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getYokunen_01_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_01_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_01_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getYokunen_01_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (翌年2月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getYokunen_02_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getYokunen_02_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_02_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_02_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getYokunen_02_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (翌年3月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getYokunen_03_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getYokunen_03_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_03_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_03_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getYokunen_03_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (翌年4月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getYokunen_04_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getYokunen_04_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_04_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_04_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getYokunen_04_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (翌年5月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getYokunen_05_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getYokunen_05_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_05_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_05_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getYokunen_05_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (翌年6月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getYokunen_06_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getYokunen_06_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_06_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_06_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getYokunen_06_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        } else if (翌年7月.equals(高額合算自己負担額明細.getTaishoM())) {
            高額合算自己負担額明細.setSumi_JikoFutanGaku(entity.get中間DBEntity().getYokunen_07_sumi_JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74JikoFutanGaku(entity.get中間DBEntity().getYokunen_07_sumi_70_74JikoFutanGaku());
            高額合算自己負担額明細.setSumi_70_74KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_07_sumi_70_74KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_under_70KogakuShikyuGaku(entity.get中間DBEntity().getYokunen_07_sumi_under_70KogakuShikyuGaku());
            高額合算自己負担額明細.setSumi_Tekiyo(entity.get中間DBEntity().getYokunen_07_sumi_Tekiyo());
            tableWrite.update(高額合算自己負担額明細);
        }
    }

}