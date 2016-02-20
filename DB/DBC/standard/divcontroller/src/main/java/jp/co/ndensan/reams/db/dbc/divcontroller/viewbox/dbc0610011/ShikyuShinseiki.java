/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.dbc0610011;

import java.io.Serializable;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * 支給申請情報検索キー
 *
 * @author きょう亮
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@Getter
@Setter
public class ShikyuShinseiki implements Serializable {

    private static final long serialVersionUID = 1L;
    private final HihokenshaNo hiHokenshaNo;
    private final FlexibleYearMonth serviceTeikyoYM;
    private final RString seiriNp;
    private final JigyoshaNo jigyoshaNo;
    private final RString yoshikiNo;
    private final RString meisaiNo;

    /**
     *
     * @param hiHokenshaNo
     * @param serviceTeikyoYM
     * @param seiriNp
     * @param jigyoshaNo
     * @param yoshikiNo
     * @param meisaiNo
     */
    public ShikyuShinseiki(HihokenshaNo hiHokenshaNo, FlexibleYearMonth serviceTeikyoYM,
            RString seiriNp, JigyoshaNo jigyoshaNo, RString yoshikiNo, RString meisaiNo) {
        this.hiHokenshaNo = hiHokenshaNo;
        this.serviceTeikyoYM = serviceTeikyoYM;
        this.seiriNp = seiriNp;
        this.jigyoshaNo = jigyoshaNo;
        this.yoshikiNo = yoshikiNo;
        this.meisaiNo = meisaiNo;
    }
}
