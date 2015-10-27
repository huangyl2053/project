/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbx.business.core.basic;

import java.io.Serializable;
import jp.co.ndensan.reams.uz.uza.biz.KaigoServiceShuruiCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import lombok.Value;

/**
 * 介護サービス種類の識別子です。
 */
@Value
public class KaigoServiceShuruiIdentifier implements Serializable {

    private final KaigoServiceShuruiCode サービス種類コード;
    private final FlexibleYearMonth 提供開始年月;

    /**
     * コンストラクタです。
     *
     * @param サービス種類コード サービス種類コード
     * @param 提供開始年月 提供開始年月
     */
    public KaigoServiceShuruiIdentifier(KaigoServiceShuruiCode サービス種類コード,
            FlexibleYearMonth 提供開始年月) {
        this.サービス種類コード = サービス種類コード;
        this.提供開始年月 = 提供開始年月;
    }
}