/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.business.report.dbd511002;

import jp.co.ndensan.reams.db.dbd.entity.db.relate.dbd511002.TongzhiShufaxingEntity;
import jp.co.ndensan.reams.db.dbd.entity.report.dbd511002.KoshinShinseiTsuchishoHakkoIchiranhyoReportSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 更新申請のお知らせ通知書発行一覧表Editorです。
 *
 * @reamsid_L DBD-2030-040 donghj
 */
public class KoshinShinseiTsuchishoHakkoIchiranhyoEditor implements IKoshinShinseiTsuchishoHakkoIchiranhyoEditor {

    private final TongzhiShufaxingEntity entity;

    /**
     * インスタンスを生成します。
     *
     * @param entity TongzhiShufaxingEntity
     */
    public KoshinShinseiTsuchishoHakkoIchiranhyoEditor(TongzhiShufaxingEntity entity) {
        this.entity = entity;
    }

    @Override
    public KoshinShinseiTsuchishoHakkoIchiranhyoReportSource edit(KoshinShinseiTsuchishoHakkoIchiranhyoReportSource source) {
        return edit項目(source);
    }

    private KoshinShinseiTsuchishoHakkoIchiranhyoReportSource edit項目(KoshinShinseiTsuchishoHakkoIchiranhyoReportSource source) {
        source.taishoKikan = entity.get抽出対象期間();
        source.cityCode = entity.get市町村コード();
        source.cityName = entity.get市町村名称();
        source.sort1 = entity.get並び順1();
        source.sort2 = entity.get並び順2();
        source.sort3 = entity.get並び順3();
        source.sort4 = entity.get並び順4();
        source.sort5 = entity.get並び順5();
        source.printTimeStamp = entity.get印刷時間();
        if (entity.getTongzhiShu() != null) {
            source.listHakkoIchiranhyo_1 = new RString(entity.getTongzhiShu().get連番());
            source.listHakkoIchiranhyo_2 = entity.getTongzhiShu().get被保険者番号();
            source.listHakkoIchiranhyo_3 = entity.getTongzhiShu().get被保険者氏名();
            source.listHakkoIchiranhyo_4 = entity.getTongzhiShu().get要介護度();
            source.listHakkoIchiranhyo_5 = entity.getTongzhiShu().get受給申請日();
            source.listHakkoIchiranhyo_6 = entity.getTongzhiShu().get認定日();
            source.listHakkoIchiranhyo_7 = entity.getTongzhiShu().get認定開始日();
            source.listHakkoIchiranhyo_8 = entity.getTongzhiShu().get認定終了日();
            source.listHakkoIchiranhyo_9 = entity.getTongzhiShu().get受給申請事由();
            source.listHakkoIchiranhyo_10 = entity.getTongzhiShu().get申請区分_申請時();
            source.listHakkoIchiranhyo_11 = entity.getTongzhiShu().get申請区分_法令();
            source.listHakkoIchiranhyo_12 = entity.getTongzhiShu().get居宅支援事業者コード();
            source.listHakkoIchiranhyo_13 = entity.getTongzhiShu().get居宅支援事業者名称();
            source.listHakkoIchiranhyo_14 = entity.getTongzhiShu().get入所施設事業者コード();
            source.listHakkoIchiranhyo_15 = entity.getTongzhiShu().get入所施設事業者名称();
        } else {
            source.listHakkoIchiranhyo_1 = RString.EMPTY;
            source.listHakkoIchiranhyo_2 = RString.EMPTY;
            source.listHakkoIchiranhyo_3 = RString.EMPTY;
            source.listHakkoIchiranhyo_4 = RString.EMPTY;
            source.listHakkoIchiranhyo_5 = RString.EMPTY;
            source.listHakkoIchiranhyo_6 = RString.EMPTY;
            source.listHakkoIchiranhyo_7 = RString.EMPTY;
            source.listHakkoIchiranhyo_8 = RString.EMPTY;
            source.listHakkoIchiranhyo_9 = RString.EMPTY;
            source.listHakkoIchiranhyo_10 = RString.EMPTY;
            source.listHakkoIchiranhyo_11 = RString.EMPTY;
            source.listHakkoIchiranhyo_12 = RString.EMPTY;
            source.listHakkoIchiranhyo_13 = RString.EMPTY;
            source.listHakkoIchiranhyo_14 = RString.EMPTY;
            source.listHakkoIchiranhyo_15 = RString.EMPTY;
        }

        return source;
    }

}
