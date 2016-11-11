/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC190030;

import java.util.HashSet;
import java.util.Set;
import jp.co.ndensan.reams.db.dbc.definition.mybatisprm.inssetaiyinshotokujyoho.InsSetaiyin3MybatisParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kijunsyunyunenji.InsTaishoSeitaiyinTempProcessParameter;
import jp.co.ndensan.reams.db.dbc.entity.csv.kijunsyunyunenji.TaishoSetaiinEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3116KijunShunyugakuTekiyoKanriEntity;
import jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate.dbc190030.IDBC190030Mapper;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchPermanentTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.SetaiCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 基準収入額適用申請書_異動分作成の基準収入額管理マスタに登録 クラスです
 *
 * @reamsid_L DBC-4640-030 jianglaisheng
 */
public class InsSetaiyinShotokuJyohoTemp3Process extends BatchProcessBase<TaishoSetaiinEntity> {

    private InsTaishoSeitaiyinTempProcessParameter parameter;
    private static final RString RSTRING_1 = new RString("1");
    private static final RString RSTRING_01 = new RString("01");
    private static final int INT_0 = 0;

    private static final RString READ_DATA_ID = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate.kijunsyunyunenji."
            + "IKijunsyunyunenjiMapper.insert基準収入額適用管理");
    private final Set<RString> keySet = new HashSet();
    private final RString symbol = new RString(",");
    @BatchWriter
    BatchPermanentTableWriter<DbT3116KijunShunyugakuTekiyoKanriEntity> dbT3166TableWriter;

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(READ_DATA_ID);
    }

    @Override
    protected void createWriter() {
        this.dbT3166TableWriter = new BatchPermanentTableWriter<>(DbT3116KijunShunyugakuTekiyoKanriEntity.class);
    }

    @Override
    protected void process(TaishoSetaiinEntity entity) {
        RString key = entity.getShotaiCode().concat(symbol).concat(parameter.get処理年度().toDateString())
                .concat(symbol).concat(entity.getHihokenshaNo().getColumnValue()).concat(symbol).concat(entity.getKoushinnNo().toString());
        if (!keySet.contains(key)) {
            DbT3116KijunShunyugakuTekiyoKanriEntity dbT3116Entity = new DbT3116KijunShunyugakuTekiyoKanriEntity();
            dbT3116Entity.setSetaiCode(new SetaiCode(entity.getShotaiCode()));
            dbT3116Entity.setNendo(parameter.get処理年度());
            dbT3116Entity.setRirekiNo(entity.getKoushinnNo());
            dbT3116Entity.setHihokenshaNo(entity.getHihokenshaNo());
            dbT3116Entity.setKotekiNenkinShunyugaku(Decimal.ZERO);
            dbT3116Entity.setKyuyoShunyugaku(Decimal.ZERO);
            dbT3116Entity.setSonotaShunyugaku(Decimal.ZERO);
            dbT3116Entity.setSanteiKijungaku(Decimal.ZERO);
            dbT3116Entity.setTekiyoKaishiYMD(FlexibleYearMonth.EMPTY);
            dbT3116Entity.setShinseiYMD(FlexibleDate.EMPTY);
            dbT3116Entity.setKetteiYMD(FlexibleDate.EMPTY);
            dbT3116Entity.setShinseishoSakuseiYMD(FlexibleDate.getNowDate());
            dbT3116Entity.setShinseishoSakuseiSetaiKijunYMD(entity.getShotaikijunDay());
            dbT3116Entity.setKetteiTsuchishoHakkoYMD(FlexibleDate.EMPTY);
            if (RSTRING_1.equals(entity.getAtenaInnjiKubun())) {
                dbT3116Entity.setAtesakiInjiTaishoshaFlag(true);
            } else {
                dbT3116Entity.setAtesakiInjiTaishoshaFlag(false);
            }
            dbT3116Entity.setNenshoFuyokojoUnder16Ninzu(entity.getNennshouLess16Num());
            dbT3116Entity.setNenshoFuyokojoOver16Ninzu(entity.getNennshouLess16_18Num());
            dbT3116Entity.setSetaiinSoShunyugaku(entity.getSoushuu());
            if (RSTRING_01.equals(entity.getHennshuuZokugaraCode())) {
                dbT3116Entity.setSetainushiFlag(true);
            } else {
                dbT3116Entity.setSetainushiFlag(false);
            }
            dbT3116Entity.setKazeiShotokugaku(entity.getKazeiShotokuGaku());
            dbT3116Entity.setKazeiShotokugakuKojogo(entity.getKazeiShotokuGakuAfter());

            InsSetaiyin3MybatisParameter param = new InsSetaiyin3MybatisParameter();
            param.set世帯コード(dbT3116Entity.getSetaiCode());
            param.set年度(dbT3116Entity.getNendo());
            param.set履歴番号(dbT3116Entity.getRirekiNo());
            param.set被保険者番号(dbT3116Entity.getHihokenshaNo());

            int 件数 = getMapper(IDBC190030Mapper.class).select基準収入額管理マスタ(param);
            if (INT_0 == 件数) {
                this.dbT3166TableWriter.insert(dbT3116Entity);
            } else {
                this.dbT3166TableWriter.update(dbT3116Entity);
            }
            keySet.add(key);
        }
    }

}