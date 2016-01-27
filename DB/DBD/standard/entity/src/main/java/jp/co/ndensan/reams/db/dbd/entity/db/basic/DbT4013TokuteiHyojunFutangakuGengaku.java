package jp.co.ndensan.reams.db.dbd.entity.db.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IColumnDefinition;

/**
 * 特定標準負担額減額テーブルの項目定義クラスです。
 */
public enum DbT4013TokuteiHyojunFutangakuGengaku implements IColumnDefinition {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.4.2">
    /**
     * insertDantaiCd
     */
    insertDantaiCd(2147483647, 0),
    /**
     * insertTimestamp
     */
    insertTimestamp(29, 0),
    /**
     * insertReamsLoginId
     */
    insertReamsLoginId(2147483647, 0),
    /**
     * insertContextId
     */
    insertContextId(2147483647, 0),
    /**
     * isDeleted
     */
    isDeleted(1, 0),
    /**
     * updateCount
     */
    updateCount(10, 0),
    /**
     * lastUpdateTimestamp
     */
    lastUpdateTimestamp(29, 0),
    /**
     * lastUpdateReamsLoginId
     */
    lastUpdateReamsLoginId(2147483647, 0),
    /**
     * 証記載保険者番号
     */
    shoKisaiHokenshaNo(2147483647, 0),
    /**
     * 被保険者番号
     */
    hihokenshaNo(2147483647, 0),
    /**
     * 履歴番号
     */
    rirekiNo(5, 0),
    /**
     * 申請事由
     */
    shinseiJiyu(200, 0),
    /**
     * 利用者負担段階
     * <br/>・第一段階
     * <br/>・第二段階
     * <br/>・第三段階
     * <br/>・課税層第三段階
     */
    riyoshaFutanDankai(1, 0),
    /**
     * 標準負担区分
     * <br/>1:標準負担 
     * <br/>2:特定標準負担
     */
    hyojunFutanKubun(1, 0),
    /**
     * 居室種別
     * <br/>1：ユニット型個室
     * <br/>2：ユニット型準個室
     * <br/>3：従来型個室
     * <br/>4：多床室
     * <br/>5：従来型個室（老健）
     */
    kyoshitsuShubetsu(1, 0),
    /**
     * 食費負担限度額
     */
    shokuhiFutanGendogaku(5, 0),
    /**
     * ユニット型個室
     */
    unitTypeKoshitsu(5, 0),
    /**
     * ユニット型準個室
     */
    unitTypeJunKoshitsu(5, 0),
    /**
     * 従来型個室（特養等）
     */
    juraiTypeKoshitsu_Tokuyo(5, 0),
    /**
     * 従来型個室（老健・療養等）
     */
    juraiTypeKoshitsu_Roken_Ryoyo(5, 0),
    /**
     * 多床室
     */
    tashoshitsu(5, 0);

    private final int maxLength;
    private final int scale;

    private DbT4013TokuteiHyojunFutangakuGengaku(int maxLength, int scale) {
        this.maxLength = maxLength;
        this.scale = scale;
    }

    /**
     * 項目の最大長のgetメソッドです。
     * 
     * @return 項目の最大長
     */
    public int getMaxLength() {
        return maxLength;
    }

    /**
     * 小数点以下の桁数のgetメソッドです。
     * 
     * @return 小数点以下の桁数
     */
    public int getScale() {
        return scale;
    }

// </editor-fold>
}
