/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.jigyokogakushikyufushikyukettetsuchiich;

import jp.co.ndensan.reams.db.dbc.entity.db.relate.servicehishikyuketteitsuchisho.JigyoKogakuShikyuFushikyuKetteTsuchiEntity;
import jp.co.ndensan.reams.db.dbc.entity.report.jigyokogakushikyufushikyukettetsuchiichiran.JigyoKogakuShikyuFushikyuKetteTsuchiSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 事業高額支給不支給決定通知一覧表計画届出状況チェックリストIEditor
 *
 * @reamsid_L DBC-2000-110 wangxingpeng
 */
public class JigyoKogakuShikyuFushikyuKetteTsuchiBodyEditor
        implements IJigyoKogakuShikyuFushikyuKetteTsuchiEditor {

    private final JigyoKogakuShikyuFushikyuKetteTsuchiEntity entity;
    //   private static final RString 支給計 = new RString("支給計");
    private int 連番;

    /**
     * *コンストラクタです
     *
     * @param entity JigyoKogakuShikyuFushikyuKetteTsuchiEntity
     * @param 連番 int
     */
    public JigyoKogakuShikyuFushikyuKetteTsuchiBodyEditor(JigyoKogakuShikyuFushikyuKetteTsuchiEntity entity, int 連番) {
        this.entity = entity;
        this.連番 = 連番;
    }

    @Override
    public JigyoKogakuShikyuFushikyuKetteTsuchiSource edit(JigyoKogakuShikyuFushikyuKetteTsuchiSource source) {
        source.listUpper_1 = new RString(連番);
        source.listUpper_2 = entity.get決定通知No();
        source.listUpper_3 = entity.get被保険者番号();
        source.listUpper_4 = entity.get被保険者氏名();
        source.listUpper_5 = entity.get郵便番号();
        source.listLower_1 = entity.get住所();
        source.listUpper_6 = entity.get提供年月();
        source.listLower_2 = entity.get要介護度();
        source.listUpper_7 = entity.get認定開始日();
        source.listLower_3 = entity.get認定終了日();
        source.listUpper_8 = entity.get受付年月日();
        source.listLower_4 = entity.get決定年月日();
        source.listUpper_9 = entity.get本人支払額();
        source.listLower_5 = entity.get支給額();
        source.listUpper_10 = entity.get支給_不支給_決定区分();
        source.listUpper_11 = entity.get資格喪失日();
        source.listLower_7 = entity.get喪失事由();
        source.listUpper_12 = entity.get自動償還();
        //source.listUpper_7 = 支給計;
        //  source.listUpper_8 = entity.get支給総件数();
        //source.listUpper_9 = entity.get本人支給額合計();
        // source.listLower_5 = entity.get支給額給額合計();
        return source;
    }

}