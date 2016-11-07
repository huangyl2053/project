/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.definition.core.nenpoyoushi3;

import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 事業報告（年報）補正、発行_様式３画面のパラメータです。
 *
 * @reamsid_L DBU-1060-040 zhengshukai
 *
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@lombok.Getter
public final class NenpoYoushi3DetalParameter {

    private final Decimal 縦番号;
    private final Decimal 横番号;
    private final Decimal 集計結果値;

    private NenpoYoushi3DetalParameter(Decimal 縦番号, Decimal 横番号, Decimal 集計結果値) {
        this.縦番号 = safeValue(縦番号);
        this.横番号 = safeValue(横番号);
        this.集計結果値 = safeValue(集計結果値);
    }

    /**
     * パラメータを生成します。
     *
     * @param 縦番号 縦番号
     * @param 横番号 横番号
     * @param 集計結果値 集計結果値
     * @return NenpoYoushi3DetalParameter 事業報告（年報）補正、発行_様式３画面のパラメータ
     */
    public static NenpoYoushi3DetalParameter creatDetalParameter(Decimal 縦番号, Decimal 横番号, Decimal 集計結果値) {
        return new NenpoYoushi3DetalParameter(縦番号, 横番号, 集計結果値);
    }

    //TODO n8178 城間 本来事業状況報告では集計値などにnullは渡ってこない（データが積まれていないなんてことはない想定）はずなので不要な考慮の可能性あり。
    //null == 0 として扱うことに問題がある場合はこの記述を削除し、別の方法を考える。
    private Decimal safeValue(Decimal dec) {
        if (dec == null) {
            return Decimal.ZERO;
        }
        return dec;
    }
}
