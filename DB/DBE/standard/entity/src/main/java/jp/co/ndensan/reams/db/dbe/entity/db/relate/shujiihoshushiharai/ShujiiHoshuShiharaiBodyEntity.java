/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.entity.db.relate.shujiihoshushiharai;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * 帳票設計_DBE621002_主治医意見書作成報酬支払通知書のBodyEntityです。
 *
 * @reamsid_L DBE-1980-040 xuyongchao
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class ShujiiHoshuShiharaiBodyEntity {

    private final RString listGokei_1;
    private final RString listGokei_2;
    private final RString listGokei_3;

    /**
     * コンストラクタです。
     *
     *
     * @param listGokei_1 listGokei_1
     * @param listGokei_2 listGokei_2
     * @param listGokei_3 listGokei_3
     */
    public ShujiiHoshuShiharaiBodyEntity(
            RString listGokei_1,
            RString listGokei_2,
            RString listGokei_3) {
        this.listGokei_1 = listGokei_1;
        this.listGokei_2 = listGokei_2;
        this.listGokei_3 = listGokei_3;
    }
}
