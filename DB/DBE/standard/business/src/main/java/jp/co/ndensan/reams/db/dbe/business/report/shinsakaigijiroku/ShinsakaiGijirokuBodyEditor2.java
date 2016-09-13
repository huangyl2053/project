/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.shinsakaigijiroku;

import jp.co.ndensan.reams.db.dbe.entity.db.relate.shinsakaigijiroku.SanGyoumeKuIchiRanEntity;
import jp.co.ndensan.reams.db.dbe.entity.report.source.shinsakaigijiroku.ShinsakaiGijirokuReportSource;

/**
 * 介護認定審査会議事録Editorです。
 *
 * @reamsid_L DBE-0170-040 wangkun
 */
public class ShinsakaiGijirokuBodyEditor2 implements IShinsakaiGijirokuEditor {

    private final SanGyoumeKuIchiRanEntity item;

    /**
     * インスタンスを生成します。
     *
     * @param item {@link HanteiKekkaIchiranEntity}
     */
    protected ShinsakaiGijirokuBodyEditor2(SanGyoumeKuIchiRanEntity item) {
        this.item = item;
    }

    @Override
    public ShinsakaiGijirokuReportSource edit(ShinsakaiGijirokuReportSource source) {
        if (item != null) {
            source.listIchijihanteibetsuCount_1 = item.get一行目();
            source.listIchijihanteibetsuCount_2 = item.get二行目();
            source.listIchijihanteibetsuCount_3 = item.get三行目();
            source.listIchijihanteibetsuCount_4 = item.get四行目();
            source.listIchijihanteibetsuCount_5 = item.get五行目();
            source.listIchijihanteibetsuCount_6 = item.get六行目();
            source.listIchijihanteibetsuCount_7 = item.get七行目();
            source.listIchijihanteibetsuCount_8 = item.get八行目();
            source.listIchijihanteibetsuCount_9 = item.get九行目();
        }
        return source;
    }
}