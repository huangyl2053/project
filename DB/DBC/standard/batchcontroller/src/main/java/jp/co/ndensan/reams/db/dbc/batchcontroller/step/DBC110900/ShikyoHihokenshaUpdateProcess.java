/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC110900;

import jp.co.ndensan.reams.db.dbc.definition.processprm.kakohorenjyohosakusei.HihokenshaTempUpdateProcessParameter;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kakohorenjyohosakuseicommon.KakohorenJyohoSakuseiCommonEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kyufukanrihyoout.HihokenshaTempEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kyufukanrihyoout.KokuhorenSakuseiErrorTempEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7026ShinKyuHihokenshaNoHenkanEntity;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 国保連情報作成共通処理（証記載保険者番号取得）プロセスです。
 *
 * @reamsid_L DBC-2840-031 sunhaidi
 */
public class ShikyoHihokenshaUpdateProcess extends BatchProcessBase<KakohorenJyohoSakuseiCommonEntity> {

    private static final RString MYBATIS_SELECT_ID = new RString(
            "jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate.kakohorenjyohosakuseicommon.IKakohorenJyohoSakuseiCommonMapper."
            + "select新旧被保険者番号変換情報");
    private static final RString 被保険者一時TBL_NAME = new RString("DbWT1001Hihokensha");
    private static final RString 処理結果リスト一時TBL_NAME = new RString("DbWT1002KokuhorenSakuseiError");
    private HihokenshaTempUpdateProcessParameter parameter;
    @BatchWriter
    BatchEntityCreatedTempTableWriter 被保険者一時TBL;
    @BatchWriter
    BatchEntityCreatedTempTableWriter 処理結果リスト一時TBL;

    @Override
    protected IBatchReader createReader() {
        被保険者一時TBL = new BatchEntityCreatedTempTableWriter(被保険者一時TBL_NAME,
                HihokenshaTempEntity.class);
        処理結果リスト一時TBL = new BatchEntityCreatedTempTableWriter(処理結果リスト一時TBL_NAME,
                KokuhorenSakuseiErrorTempEntity.class);
        return new BatchDbReader(MYBATIS_SELECT_ID, parameter.toMybatisParamterByサービス提供年月());
    }

    @Override
    protected void process(KakohorenJyohoSakuseiCommonEntity commonEntity) {
        HihokenshaTempEntity hihokenshaTempEntity = commonEntity.getHihokenshaTempEntity();
        DbT7026ShinKyuHihokenshaNoHenkanEntity dbT7026Entity = commonEntity.getDbT7026Entity();
        if (dbT7026Entity.getShichosonCode() != null) {
            hihokenshaTempEntity.setOldShichosonCode(dbT7026Entity.getShichosonCode().value());
        }
        hihokenshaTempEntity.setSofuHihokenshaNo(dbT7026Entity.getKyuNo());
        被保険者一時TBL.update(hihokenshaTempEntity);
    }
}