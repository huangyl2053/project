/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC150030;

import jp.co.ndensan.reams.db.dbc.definition.processprm.servicecoderiyojokyo.KyufuJissekiMeisaiGetProcessParameter;
import jp.co.ndensan.reams.db.dbc.entity.csv.kagoketteihokenshain.FlowEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc150030.DbWT3470ToukeihyoMeisaiTempEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc150030.KyufuJissekiMeisaiEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.batch.process.OutputParameter;
import jp.co.ndensan.reams.uz.uza.biz.ChoikiCode;
import jp.co.ndensan.reams.uz.uza.biz.GyoseikuCode;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.IDbColumnMappable;

/**
 * 給付実績明細情報の取得処理Processクラスです。
 *
 * @reamsid_L DBC-3340-030 jiangxiaolong
 */
public class KyufuJissekiMeisaiGetProcess
        extends BatchProcessBase<KyufuJissekiMeisaiEntity> {

    /**
     * 登録結果返した
     */
    public static final RString PARAMETER_OUT_FLOWENTITY;
    private KyufuJissekiMeisaiGetProcessParameter parameter;

    static {
        PARAMETER_OUT_FLOWENTITY = new RString("flowEntity");
    }

    private static final RString READ_DATA_ID
            = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate.servicecoderiyojokyo."
                    + "IServicecodeRiyojokyoMapper.get給付実績明細情報");
    @BatchWriter
    BatchEntityCreatedTempTableWriter 統計表明細一時tableWriter;
    private static final RString 統計表明細一時_TABLE_NAME = new RString("DbWT3470ToukeihyoMeisai");

    private OutputParameter<FlowEntity> flowEntity;
    FlowEntity returnEntity;
    private int 連番;
    private static final int INT_0 = 0;
    private static final int INT_1 = 1;

    @Override
    protected void initialize() {
        returnEntity = new FlowEntity();
        連番 = INT_0;
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(READ_DATA_ID, parameter.toMybatisParam());
    }

    @Override
    protected void createWriter() {
        統計表明細一時tableWriter = new BatchEntityCreatedTempTableWriter(
                統計表明細一時_TABLE_NAME, DbWT3470ToukeihyoMeisaiTempEntity.class);
    }

    @Override
    protected void process(KyufuJissekiMeisaiEntity entity) {
        連番 = 連番 + INT_1;
        DbWT3470ToukeihyoMeisaiTempEntity toukeihyoMeisaiTempEntity = new DbWT3470ToukeihyoMeisaiTempEntity();
        toukeihyoMeisaiTempEntity.setRenban(連番);
        toukeihyoMeisaiTempEntity.setHiHokenshaNo(entity.get被保険者番号());
        toukeihyoMeisaiTempEntity.setInputShikibetsuNo(entity.get入力識別番号());
        toukeihyoMeisaiTempEntity.setServiceTeikyoYM(entity.getサービス提供年月());
        toukeihyoMeisaiTempEntity.setJigyoshoNo(getColumnValue(entity.get事業所番号()));
        toukeihyoMeisaiTempEntity.setToshiNo(entity.get通し番号());
        toukeihyoMeisaiTempEntity.setYoKaigoJotaiKubunCode(entity.get要介護状態区分コード());
        toukeihyoMeisaiTempEntity.setServiceShuruiCode(entity.getサービス種類コード());
        toukeihyoMeisaiTempEntity.setServiceKomokuCode(entity.getサービス項目コード());
        toukeihyoMeisaiTempEntity.setTaniSu(getDecimalVaule(entity.get後_単位数()));
        toukeihyoMeisaiTempEntity.setNissuKaisu(getDecimalVaule(entity.get後_日数_回数()));
        toukeihyoMeisaiTempEntity.setServiceTanisu(getDecimalVaule(entity.get後_サービス単位数()));
        toukeihyoMeisaiTempEntity.setSortYouShuruiCode(ServiceShuruiCode.EMPTY);
        toukeihyoMeisaiTempEntity.setSortYouKomokuName(RString.EMPTY);
        toukeihyoMeisaiTempEntity.setShichosonCode(LasdecCode.EMPTY);
        toukeihyoMeisaiTempEntity.setKoikinaiJushochiTokureiFlag(RString.EMPTY);
        toukeihyoMeisaiTempEntity.setKoikinaiTokureiSochimotoShichosonCode(LasdecCode.EMPTY);
        toukeihyoMeisaiTempEntity.setKyuShichosonCode(LasdecCode.EMPTY);
        toukeihyoMeisaiTempEntity.setMachiikiCode(ChoikiCode.EMPTY);
        toukeihyoMeisaiTempEntity.setGyoseikuCode(GyoseikuCode.EMPTY);
        toukeihyoMeisaiTempEntity.setChikuCode1(RString.EMPTY);
        toukeihyoMeisaiTempEntity.setChikuCode2(RString.EMPTY);
        toukeihyoMeisaiTempEntity.setChikuCode3(RString.EMPTY);
        統計表明細一時tableWriter.insert(toukeihyoMeisaiTempEntity);
    }

    @Override
    protected void afterExecute() {
        returnEntity.set明細データ登録件数(連番);
        flowEntity = new OutputParameter<>();
        flowEntity.setValue(returnEntity);
    }

    private RString getColumnValue(IDbColumnMappable entity) {
        if (null != entity) {
            return entity.getColumnValue();
        }
        return RString.EMPTY;
    }

    private Decimal getDecimalVaule(Decimal 値) {
        if (null != 値) {
            return 値;
        }
        return Decimal.ZERO;
    }

}