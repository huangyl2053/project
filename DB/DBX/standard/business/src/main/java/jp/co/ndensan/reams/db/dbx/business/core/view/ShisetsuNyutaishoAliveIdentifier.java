/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbx.business.core.view;

import java.io.Serializable;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import lombok.Value;

/**
 * 介護保険施設入退所Aliveの識別子です。
 */
@Value
@SuppressWarnings("PMD.UnusedPrivateField")
public class ShisetsuNyutaishoAliveIdentifier implements Serializable {

    private final ShikibetsuCode 識別コード;
    private final Decimal 履歴番号;

    /**
     * コンストラクタです。
     *
     * @param 識別コード 識別コード
     * @param 履歴番号 履歴番号
     */
    public ShisetsuNyutaishoAliveIdentifier(ShikibetsuCode 識別コード,
            Decimal 履歴番号) {
        this.識別コード = 識別コード;
        this.履歴番号 = 履歴番号;
    }
}
