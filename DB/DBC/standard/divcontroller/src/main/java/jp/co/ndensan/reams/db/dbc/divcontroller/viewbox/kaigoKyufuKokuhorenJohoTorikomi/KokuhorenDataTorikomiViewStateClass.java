/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.kaigoKyufuKokuhorenJohoTorikomi;

import java.io.Serializable;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RYearMonth;
import lombok.Getter;
import lombok.Setter;

/**
 * 実際に値を格納するクラス名
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@Getter
@Setter
public class KokuhorenDataTorikomiViewStateClass implements Serializable {

    private static final long serialVersionUID = 1L;
    private final RYearMonth 処理年月;
    private final RString 再処理区分;

    /**
     * KokuhorenDataTorikomiViewStateClass
     *
     * @param 処理年月 RYearMonth
     * @param 再処理区分 RString
     */
    public KokuhorenDataTorikomiViewStateClass(RYearMonth 処理年月, RString 再処理区分) {
        this.処理年月 = 処理年月;
        this.再処理区分 = 再処理区分;
    }
}
