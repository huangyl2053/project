/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC110010;

import jp.co.ndensan.reams.db.dbc.entity.db.relate.kyufukanrihyoout.KyotakuKeikakuJikosakuseiKanriTempEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kyufukanrihyoout.ShikyuGendoGakuEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT4001JukyushaDaichoEntity;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 支給限度額情報取得2のクラスです。
 *
 * @reamsid_L DBC-2840-030 yaoyahui
 */
public class ShikyuGendoGakuJohoProcess2 extends BatchProcessBase<ShikyuGendoGakuEntity> {

    private static final RString READ_DATA_ID = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate.dbc110010"
            + ".IKyufukanrihyoOutMapper.get支給限度額登録2");
    private static final RString 自己作成管理一時_NAME = new RString("DbWT8211KyotakuKeikakuJikosakuseiKanri");
    @BatchWriter
    private BatchEntityCreatedTempTableWriter 自己作成管理一時TBL;

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(READ_DATA_ID);
    }

    @Override
    protected void createWriter() {
        自己作成管理一時TBL = new BatchEntityCreatedTempTableWriter(自己作成管理一時_NAME,
                KyotakuKeikakuJikosakuseiKanriTempEntity.class);
    }

    @Override
    protected void process(ShikyuGendoGakuEntity entity) {
        DbT4001JukyushaDaichoEntity 受給者台帳Entity2 = entity.get受給者台帳Entity();
        KyotakuKeikakuJikosakuseiKanriTempEntity 居宅給付計画自己作成管理一時Entity2 = entity.get居宅給付計画自己作成管理一時Entity();
        居宅給付計画自己作成管理一時Entity2.setHyojiShikyuGendoTanisu(受給者台帳Entity2.getShikyuGendoTanisu());
        居宅給付計画自己作成管理一時Entity2.setYokaigoJotaiKubunCode(getRString(受給者台帳Entity2.getYokaigoJotaiKubunCode()));
        居宅給付計画自己作成管理一時Entity2.setNinteiYukoKikanKaishiYM(getFlexibleYearMonth(受給者台帳Entity2.getNinteiYukoKikanKaishiYMD()));
        居宅給付計画自己作成管理一時Entity2.setNinteiYukoKikanShuryoYM(getFlexibleYearMonth(受給者台帳Entity2.getNinteiYukoKikanShuryoYMD()));
        居宅給付計画自己作成管理一時Entity2.setShikyuGendoTanisu(受給者台帳Entity2.getShikyuGendoTanisu());
        居宅給付計画自己作成管理一時Entity2.setShikyuGendoKaishiYM(getFlexibleYearMonth(受給者台帳Entity2.getShikyuGendoKaishiYMD()));
        居宅給付計画自己作成管理一時Entity2.setShikyuGendoShuryoYM(getFlexibleYearMonth(受給者台帳Entity2.getShikyuGendoShuryoYMD()));
        自己作成管理一時TBL.update(居宅給付計画自己作成管理一時Entity2);
    }

    private FlexibleYearMonth getFlexibleYearMonth(FlexibleDate fb) {
        if (fb == null) {
            return FlexibleYearMonth.EMPTY;
        }
        if (fb.isEmpty()) {
            return FlexibleYearMonth.EMPTY;
        }
        return fb.getYearMonth();
    }

    private RString getRString(Code cd) {
        if (cd == null) {
            return RString.EMPTY;
        }
        if (cd.isEmpty()) {
            return RString.EMPTY;
        }
        return new RString(cd.toString());
    }
}