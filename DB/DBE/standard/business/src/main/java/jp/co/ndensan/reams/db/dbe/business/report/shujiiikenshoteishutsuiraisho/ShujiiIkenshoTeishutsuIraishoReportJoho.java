/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.shujiiikenshoteishutsuiraisho;

import java.util.List;

/**
 * 介護保険指定医依頼兼主治医意見書提出依頼書_帳票クラスパラメータクラスです。
 *
 * @reamsid_L DBE-0080-080 duanzhanli
 */
@lombok.Getter
@SuppressWarnings("PMD.UnusedPrivateField")
public class ShujiiIkenshoTeishutsuIraishoReportJoho {

    private final List<ShujiiIkenshoTeishutsuIraishoItem> itemList;

    /**
     * コンストラクタを作成します。
     *
     * @param itemList 主介護保険指定医依頼兼主治医意見書提出依頼書情報item
     */
    public ShujiiIkenshoTeishutsuIraishoReportJoho(List<ShujiiIkenshoTeishutsuIraishoItem> itemList) {
        this.itemList = itemList;
    }
}
