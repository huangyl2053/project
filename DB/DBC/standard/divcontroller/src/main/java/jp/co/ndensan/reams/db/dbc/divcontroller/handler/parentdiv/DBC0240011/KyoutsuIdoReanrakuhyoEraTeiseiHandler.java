/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.handler.parentdiv.DBC0240011;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.jukyusyaidoujohorirek.JukyusyaIdouJohoRirekEntity;
import jp.co.ndensan.reams.db.dbc.business.core.kyodojukyushataishosha.KyodoJukyushaTaishoshaEntity;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0240011.KyoutsuIdoReanrakuhyoEraTeiseiDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0240011.dgIdoReanrakuhyoEraTeisei_Row;
import jp.co.ndensan.reams.uz.uza.lang.RDate;

/**
 * 共同処理用受給者異動連絡票エラー訂正のハンドラクラスです。
 *
 * @reamsid_L DBC-2850-010 chenxiangyu
 */
public class KyoutsuIdoReanrakuhyoEraTeiseiHandler {

    private final KyoutsuIdoReanrakuhyoEraTeiseiDiv div;

    /**
     * コンストラクタです。
     *
     * @param div 画面情報
     */
    public KyoutsuIdoReanrakuhyoEraTeiseiHandler(KyoutsuIdoReanrakuhyoEraTeiseiDiv div) {
        this.div = div;
    }

    /**
     * 画面初期化します。
     *
     * @param entityList 履歴訂正のCSVEntity
     */
    public void onLoad(List<JukyusyaIdouJohoRirekEntity> entityList) {
        List<dgIdoReanrakuhyoEraTeisei_Row> rowList = new ArrayList<>();
        for (JukyusyaIdouJohoRirekEntity entity : entityList) {
            dgIdoReanrakuhyoEraTeisei_Row row = new dgIdoReanrakuhyoEraTeisei_Row();
            if (entity.get異動日() != null) {
                row.getTxtIdobi().setValue(new RDate(
                        entity.get異動日().getYearValue(),
                        entity.get異動日().getMonthValue(),
                        entity.get異動日().getDayValue()));
            }
            if (entity.get被保番号() != null) {
                row.setTxtHihoBango(entity.get被保番号().value());
            }
            row.setTxtHihokenshaShimei(entity.getかな氏名());
            // TODO QA104461により、エラー訂正処理全体の設計の見直しが必要なので、送付区分は実装できません。
//            row.setTxtSofuKubun(entity.get送付区分());
            row.setTxtKomoku(entity.get項目());
            rowList.add(row);
        }
        div.getDgIdoReanrakuhyoEraTeisei().setDataSource(rowList);
    }

    /**
     * 一覧検索キーEntityを取得します。
     *
     * @return 一覧検索キーEntity
     */
    public KyodoJukyushaTaishoshaEntity get一覧検索キー() {
        KyodoJukyushaTaishoshaEntity entity = new KyodoJukyushaTaishoshaEntity();
        // TODO QA104461により、エラー訂正処理全体の設計の見直しが必要なので実装できません。
//        dgIdoReanrakuhyoEraTeisei_Row row = div.getDgIdoReanrakuhyoEraTeisei().getActiveRow();
//        if (!RString.isNullOrEmpty(row.getTxtIdobi().getValue().toDateString())) {
//            entity.set異動日(new FlexibleDate(row.getTxtIdobi().getValue().toDateString()));
//        }
//        entity.set被保番号(new HihokenshaNo(row.getTxtHihoBango()));
//        entity.set被保険者氏名(row.getTxtHihokenshaShimei());
//        entity.set履歴番号(0);
//        entity.set対象年月(FlexibleYearMonth.MAX);
//        entity.set論理削除フラグ(true);
//        entity.set送付区分(row.getTxtSofuKubun());
//        entity.set項目(row.getTxtKomoku());
        return entity;
    }
}