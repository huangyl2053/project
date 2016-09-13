/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.mybatisprm.shokanshinseiichiran;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;

/**
 * 償還払支給申請リスト取得条件を特定するためのMyBatis用パラメータクラスです。
 *
 * @reamsid_L DBC-0960-020 hezhenzhen
 *
 */
@lombok.Getter
@SuppressWarnings("PMD.UnusedPrivateField")
public class ShokanShinseiIchiranParameterCount {

    private final HihokenshaNo 被保険者番号;
    private final FlexibleYearMonth サービス年月;

    /**
     * コンストラクタです。
     *
     * @param 被保険者番号 被保険者番号
     * @param サービス年月 サービス年月
     */
    protected ShokanShinseiIchiranParameterCount(HihokenshaNo 被保険者番号, FlexibleYearMonth サービス年月) {
        this.被保険者番号 = 被保険者番号;
        this.サービス年月 = サービス年月;
    }

    /**
     * キー検索用のパラメータを生成します。
     *
     * @param 被保険者番号 被保険者番号
     * @param サービス年月 サービス年月
     * @return ShokanShinseiIchiranParameterCount
     */
    public static ShokanShinseiIchiranParameterCount createSelectByKeyParam(
            HihokenshaNo 被保険者番号,
            FlexibleYearMonth サービス年月) {
        return new ShokanShinseiIchiranParameterCount(被保険者番号, サービス年月);
    }
}