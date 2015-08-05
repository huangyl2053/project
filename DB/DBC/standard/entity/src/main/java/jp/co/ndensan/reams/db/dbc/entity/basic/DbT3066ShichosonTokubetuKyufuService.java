package jp.co.ndensan.reams.db.dbc.entity.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IColumnDefinition;

/**
 * 市町村特別給付サービス内容テーブルの項目定義クラスです。
 */
public enum DbT3066ShichosonTokubetuKyufuService implements IColumnDefinition {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.4.1">

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
     * 市町村特別給付用サービスコード
     */
    serviceCode(6, 0),
    /**
     * 市町村特別給付用サービス有効期間開始年月日
     */
    serviceYukoKikanKaishiYMD(2147483647, 0),
    /**
     * 履歴番号
     */
    rirekiNo(5, 0),
    /**
     * 市町村特別給付用サービス名（正式名称）
     */
    serviceSeishikiName(15, 0),
    /**
     * 市町村特別給付用サービス名（略称）
     */
    serviceRyakushoName(5, 0),
    /**
     * 市町村特別給付用サービス有効期間終了年月日
     */
    serviceYukoKikanShuryoYMD(2147483647, 0),
    /**
     * 市町村特別給付用サービス区分
     * <br/>単位、日数
     */
    serviceKubun(1, 0),
    /**
     * 市町村特別給付用単位・日数
     * <br/>サービスの1回あたりの単位数
     */
    tanisuNissu(10, 0),
    /**
     * 市町村特別給付用支給限度基準額
     * <br/>サービスの支給限度基準額（月あたり）
     */
    shikyuGendoKijungaku(10, 0),
    /**
     * 市町村特別給付用給付率引下有フラグ
     */
    kyufuritsuHikisageAriFlag(1, 0),
    /**
     * 登録年月日
     */
    torokuYMD(2147483647, 0),
    /**
     * 変更年月日
     */
    henkoYMD(2147483647, 0);

    private final int maxLength;
    private final int scale;

    private DbT3066ShichosonTokubetuKyufuService(int maxLength, int scale) {
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
