/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import java.io.Serializable;
import lombok.Value;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 再審査決定集計の識別子です。
 */
@Value
public class SaishinsaKetteiShukeiIdentifier implements Serializable {

    private final FlexibleYearMonth 取扱年月;
    private final RString 保険者区分;
    private final Decimal 履歴番号;

    /**
     * コンストラクタです。
     *
     * @param 取扱年月 取扱年月
     * @param 保険者区分 保険者区分
     * @param 履歴番号 履歴番号
     */
    public SaishinsaKetteiShukeiIdentifier(FlexibleYearMonth 取扱年月,
            RString 保険者区分,
            Decimal 履歴番号) {
        this.取扱年月 = 取扱年月;
        this.保険者区分 = 保険者区分;
        this.履歴番号 = 履歴番号;
    }
}