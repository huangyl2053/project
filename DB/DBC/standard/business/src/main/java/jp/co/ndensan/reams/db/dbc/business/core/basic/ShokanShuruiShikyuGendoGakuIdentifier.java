/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value;
import java.io.Serializable;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;

/**
 * 償還払い給付種類支給限度額の識別子です。
 */
@Value
public class ShokanShuruiShikyuGendoGakuIdentifier implements Serializable {

    private final ServiceShuruiCode サービス種類コード;
    private final FlexibleYearMonth 適用開始年月;
    private final int 履歴番号;

    /**
     * コンストラクタです。
     *
     * @param サービス種類コード サービス種類コード
     * @param 適用開始年月 適用開始年月
     * @param 履歴番号 履歴番号
     */
    public ShokanShuruiShikyuGendoGakuIdentifier(ServiceShuruiCode サービス種類コード,
            FlexibleYearMonth 適用開始年月,
            int 履歴番号) {
        this.サービス種類コード = サービス種類コード;
        this.適用開始年月 = 適用開始年月;
        this.履歴番号 = 履歴番号;
    }
}