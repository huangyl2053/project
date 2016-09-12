/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.batchcontroller.step.ichijihanteizumifoutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbe.business.core.ichijihanteizumifoutput.ichijihanteizumi.IchijiHanteizumIfOutputBusiness;
import jp.co.ndensan.reams.db.dbe.definition.processprm.itizihanteishori.ItziHanteiShoriProcessParamter;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.niinteichosajoho.NinteichosaJohoTempTableEntity;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.niinteichosajoho.NinteichosahyoServiceJokyoRelateEntity;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 前回調査票（概況調査）サービスの状況一時テーブルProcessクラスです。
 *
 * @reamsid_L DBE-1470-021 wanghui
 */
public class ZenkaiChosaGaikyouChousaJokyoProcess extends BatchProcessBase<NinteichosahyoServiceJokyoRelateEntity> {

    private static final RString MYBATIS_SELECT_ID = new RString("jp.co.ndensan.reams.db.dbe.persistence.db.mapper.relate.ichijihanteizumifoutput."
            + "IchijiHanteizumIfOutputMapper.get前回調査票概況調査サービスの状況");
    private static final RString 前回調査票概況調査 = new RString("ZenkaiChosaGaikyouJohoTemp");
    private ItziHanteiShoriProcessParamter paramter;
    private List<NinteichosaJohoTempTableEntity> サービスの状況一時リスト;
    private static final RString 申請書管理番号 = new RString("申請書管理番号");
    private static final RString 厚労省IF識別コード = new RString("厚労省IF識別コード");
    private NinteichosaJohoTempTableEntity temoTableEntity;
    private IchijiHanteizumIfOutputBusiness business;
    private Map<RString, RString> map;
    @BatchWriter
    BatchEntityCreatedTempTableWriter 前回調査票概況調査サービスの状況TempTable;

    @Override
    protected void beforeExecute() {
        サービスの状況一時リスト = new ArrayList<>();
        business = new IchijiHanteizumIfOutputBusiness();
        map = new HashMap<>();
        map.put(申請書管理番号, RString.EMPTY);
        map.put(厚労省IF識別コード, RString.EMPTY);
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MYBATIS_SELECT_ID, paramter.toItziHanteiShoriMybitisParamter());
    }

    @Override
    protected void createWriter() {
        前回調査票概況調査サービスの状況TempTable = new BatchEntityCreatedTempTableWriter(前回調査票概況調査,
                NinteichosaJohoTempTableEntity.class);
    }

    @Override
    protected void process(NinteichosahyoServiceJokyoRelateEntity entity) {
        temoTableEntity = business.getサービスの状況一時テーブル(entity, temoTableEntity, map, サービスの状況一時リスト);
    }

    @Override
    protected void afterExecute() {
        for (NinteichosaJohoTempTableEntity entity : サービスの状況一時リスト) {
            前回調査票概況調査サービスの状況TempTable.insert(entity);
        }
    }
}
