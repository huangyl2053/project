/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import java.io.Serializable;
import lombok.Value;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 介護第三者行為示談の識別子です。
 */
@Value
public class DaisanshaKoiJidanIdentifier implements Serializable {

    private final HihokenshaNo 被保険者番号;
    private final RString 第三者行為届出管理番号;
    private final FlexibleDate 示談報告書受付年月日;
    private final Decimal 履歴番号;

    /**
     * コンストラクタです。
     *
     * @param 被保険者番号 被保険者番号
     * @param 第三者行為届出管理番号 第三者行為届出管理番号
     * @param 示談報告書受付年月日 示談報告書受付年月日
     * @param 履歴番号 履歴番号
     */
    public DaisanshaKoiJidanIdentifier(HihokenshaNo 被保険者番号,
            RString 第三者行為届出管理番号,
            FlexibleDate 示談報告書受付年月日,
            Decimal 履歴番号) {
        this.被保険者番号 = 被保険者番号;
        this.第三者行為届出管理番号 = 第三者行為届出管理番号;
        this.示談報告書受付年月日 = 示談報告書受付年月日;
        this.履歴番号 = 履歴番号;
    }
}
