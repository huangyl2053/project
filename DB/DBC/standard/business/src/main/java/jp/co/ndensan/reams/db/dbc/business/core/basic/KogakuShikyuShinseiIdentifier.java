/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import java.io.Serializable;
import lombok.Value;

/**
 * 高額介護サービス費支給申請の識別子です。
 */
@Value
public class KogakuShikyuShinseiIdentifier implements Serializable {

    private final HihokenshaNo 被保険者番号;
    private final FlexibleYearMonth サービス提供年月;
    private final HokenshaNo 証記載保険者番号;
    private final Decimal 履歴番号;

    /**
     * コンストラクタです。
     *
     * @param 被保険者番号 被保険者番号
     * @param サービス提供年月 サービス提供年月
     * @param 証記載保険者番号 証記載保険者番号
     * @param 履歴番号 履歴番号
     */
    public KogakuShikyuShinseiIdentifier(HihokenshaNo 被保険者番号,
FlexibleYearMonth サービス提供年月,
HokenshaNo 証記載保険者番号,
Decimal 履歴番号) {
        this.被保険者番号 = 被保険者番号;
        this.サービス提供年月 = サービス提供年月;
        this.証記載保険者番号 = 証記載保険者番号;
        this.履歴番号 = 履歴番号;
    }
}
