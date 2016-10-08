/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC110020;

import java.util.HashMap;
import java.util.Map;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushaidorenrakuhyoout.IdouTblEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushaidorenrakuhyoout.IdouTempEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenKyufuRitsu;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT4021ShiharaiHohoHenkoEntity;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 支払方法変更の情報の取得を実行する。
 *
 * @reamsid_L DBC-2720-070 chenhui
 */
public class InsShiharaihohoTempProcess extends BatchProcessBase<IdouTempEntity> {

    private static final RString READ_DATA_ID = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate."
            + "jukyushaidorenrakuhyoout.IJukyushaIdoRenrakuhyoOutMapper.select支払方法変更_支払方法");
    private static final RString 異動一時_TABLE_NAME = new RString("IdouTemp");
    private static final RString SPLIT = new RString("|");
    private static final RString RST_TRUE = new RString("TRUE");
    private static final RString RST_FALSE = new RString("FALSE");

    private Map<HihokenshaNo, Decimal> 連番Map;

    @BatchWriter
    BatchEntityCreatedTempTableWriter 異動一時tableWriter;

    @Override
    protected void initialize() {
        連番Map = new HashMap<>();
        super.initialize();
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(READ_DATA_ID);
    }

    @Override
    protected void createWriter() {
        異動一時tableWriter
                = new BatchEntityCreatedTempTableWriter(異動一時_TABLE_NAME, IdouTblEntity.class);
    }

    @Override
    protected void process(IdouTempEntity entity) {
        IdouTblEntity insert = new IdouTblEntity();
        insert.set被保険者番号(entity.get被保険者番号());
        Decimal 連番 = Decimal.ONE;
        if (連番Map.containsKey(entity.get被保険者番号())) {
            連番 = 連番Map.get(entity.get被保険者番号()).add(Decimal.ONE);
        }
        連番Map.put(entity.get被保険者番号(), 連番);
        insert.set連番(連番.intValue());
        if (entity.get支払方法変更_支払方法() != null && !RString.isNullOrEmpty(entity.get支払方法変更_支払方法().getKanriKubun())) {
            insert.set支払方法変更_支払方法(支払方法変更全項目(entity.get支払方法変更_支払方法()));
        } else {
            insert.set支払方法変更_支払方法(RString.EMPTY);
        }
        insert.set支払方法変更_給付費減額(RString.EMPTY);
        insert.set支払方法変更_給付費減額(RString.EMPTY);
        insert.set後期高齢者情報(RString.EMPTY);
        insert.set国保資格情報(RString.EMPTY);
        insert.set生活保護受給者(RString.EMPTY);
        insert.set特定入所者(RString.EMPTY);
        insert.set社福減免(RString.EMPTY);
        insert.set利用者負担額減額(RString.EMPTY);
        insert.set標準負担(RString.EMPTY);
        insert.set利用者負担割合明細(RString.EMPTY);
        insert.set居宅計画(RString.EMPTY);
        insert.set住所地特例(RString.EMPTY);
        insert.set宛名(RString.EMPTY);
        insert.set受給者台帳(RString.EMPTY);
        insert.set二次予防事業対象者(RString.EMPTY);
        insert.set総合事業対象者(RString.EMPTY);
        insert.set被保険者台帳管理(RString.EMPTY);
        異動一時tableWriter.insert(insert);
    }

    private RString 支払方法変更全項目(DbT4021ShiharaiHohoHenkoEntity 支払方法変更) {
        RString 全項目 = RString.EMPTY;
        全項目 = 全項目.concat(支払方法変更.getShoKisaiHokenshaNo().getColumnValue()).concat(SPLIT)
                .concat(支払方法変更.getHihokenshaNo().getColumnValue()).concat(SPLIT)
                .concat(支払方法変更.getKanriKubun()).concat(SPLIT)
                .concat(new RString(支払方法変更.getRirekiNo())).concat(SPLIT)
                .concat(支払方法変更.getInsertDantaiCd()).concat(SPLIT)
                .concat(支払方法変更.getIsDeleted() ? RST_TRUE : RST_FALSE).concat(SPLIT)
                .concat(支払方法変更.getTorokuKubun()).concat(SPLIT);
        全項目 = cancatYMD(支払方法変更.getTekiyoKaishiYMD(), 全項目);
        全項目 = cancatYMD(支払方法変更.getTekiyoShuryoYMD(), 全項目);
        全項目 = cancatRString(支払方法変更.getShuryoKubun(), 全項目);
        全項目 = cancatYMD(支払方法変更.getYokoku_TorokuYMD(), 全項目);
        全項目 = cancatYMD(支払方法変更.getSashitome_IraiJuriYMD(), 全項目);
        全項目 = cancatYMD(支払方法変更.getYokoku_TsuchiHakkoYMD(), 全項目);
        全項目 = 全項目.concat(支払方法変更.getYokoku_TsuchiSaiHakkoFlag() ? RST_TRUE : RST_FALSE).concat(SPLIT);
        全項目 = cancatYMD(支払方法変更.getBemmei_TeishutsuYMD(), 全項目);
        全項目 = cancatYMD(支払方法変更.getBemmei_UketsukeYMD(), 全項目);
        全項目 = cancatRString(支払方法変更.getBemmei_RiyuCode(), 全項目);
        全項目 = cancatYMD(支払方法変更.getBemmei_ShinsaKetteiYMD(), 全項目);
        全項目 = cancatRString(支払方法変更.getBemmei_ShinsaKekkaKubun(), 全項目);
        全項目 = cancatYMD(支払方法変更.getShokan_KetteiYMD(), 全項目);
        全項目 = cancatYMD(支払方法変更.getShokan_TsuchiHakkoYMD(), 全項目);
        全項目 = 全項目.concat(支払方法変更.getShokan_TsuchiSaiHakkoFlag() ? RST_TRUE : RST_FALSE).concat(SPLIT);
        全項目 = cancatYMD(支払方法変更.getHihokenshaShoTeishutsuYMD(), 全項目);
        全項目 = 全項目.concat(支払方法変更.getSashitome_Flag() ? RST_TRUE : RST_FALSE).concat(SPLIT);
        全項目 = cancatYMD(支払方法変更.getSashitome_KetteiYMD(), 全項目);
        全項目 = cancatYMD(支払方法変更.getGemmen_KetteiYMD(), 全項目);
        全項目 = cancatYMD(支払方法変更.getGemmen_TsuchiHakkoYMD(), 全項目);
        全項目 = 全項目.concat(支払方法変更.getGemmen_TsuchiSaiHakkoFlag() ? RST_TRUE : RST_FALSE).concat(SPLIT);
        全項目 = cancatHokenKyufuRitsu(支払方法変更.getKyufuRitsu(), 全項目);
        全項目 = cancatYMD(支払方法変更.getShuryoShinsei_UketsukeYMD(), 全項目);
        全項目 = cancatYMD(支払方法変更.getShuryoShinsei_YMD(), 全項目);
        全項目 = cancatRString(支払方法変更.getShuryoShinsei_RiyuCode(), 全項目);
        全項目 = cancatYMD(支払方法変更.getShuryoShinsei_ShinsaKetteiYMD(), 全項目);
        全項目 = cancatRString(支払方法変更.getShuryoShinsei_ShinsaKekkaKubun(), 全項目);
        全項目 = cancatRString(支払方法変更.getMukoKubun(), 全項目);
        全項目 = 全項目.concat(支払方法変更.getLogicalDeletedFlag() ? RST_TRUE : RST_FALSE);
        return 全項目;
    }

    private RString cancatYMD(FlexibleDate date, RString 全項目) {
        if (date != null) {
            return 全項目.concat(new RString(date.toString())).concat(SPLIT);
        }
        return 全項目.concat(RString.EMPTY).concat(SPLIT);
    }

    private RString cancatRString(RString 項目, RString 全項目) {
        if (!RString.isNullOrEmpty(項目)) {
            return 全項目.concat(項目).concat(SPLIT);
        }
        return 全項目.concat(RString.EMPTY).concat(SPLIT);
    }

    private RString cancatHokenKyufuRitsu(HokenKyufuRitsu 項目, RString 全項目) {
        if (項目 != null) {
            return 全項目.concat(項目.toString()).concat(SPLIT);
        }
        return 全項目.concat(RString.EMPTY).concat(SPLIT);
    }
}
