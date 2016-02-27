/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.hokenryononyutsuchishokigoto;

import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.HonSanteiNonyuTsuchiShoJoho;
import lombok.Getter;

/**
 *
 * 保険料納入通知書（本算定）【期毎タイプ】HokenryoNonyuTsuchishoKigotoItem
 */
@Getter
@SuppressWarnings("PMD.UnusedPrivateField")
public class HokenryoNonyuTsuchishoKigotoItem {

    private final HonSanteiNonyuTsuchiShoJoho 本算定納入通知書情報;

    /**
     * インスタンスを生成します。
     *
     * @param 本算定納入通知書情報 本算定納入通知書情報
     */
    public HokenryoNonyuTsuchishoKigotoItem(HonSanteiNonyuTsuchiShoJoho 本算定納入通知書情報) {
        this.本算定納入通知書情報 = 本算定納入通知書情報;
    }

}
