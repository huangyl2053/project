package jp.co.ndensan.reams.db.dbe.entity.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IColumnDefinition;

/**
 * 介護認定審査会開催結果情報テーブルの項目定義クラスです。
 */
public enum DbT5109ShinsakaiKaisaiKekkaJoho implements IColumnDefinition {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.3.9">
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
     * 介護認定審査会開催番号
     */
    shinsakaiKaisaiNo(5, 0),
    /**
     * 合議体番号
     */
    gogitaiNo(5, 0),
    /**
     * 介護認定審査会開催年月日
     */
    shinsakaiKaisaiYMD(2147483647, 0),
    /**
     * 介護認定審査会開始時刻
     */
    shinsakaiKaishiTime(4, 0),
    /**
     * 介護認定審査会終了時刻
     */
    shinsakaiShuryoTime(4, 0),
    /**
     * 介護認定審査会開催場所コード
     */
    shinsakaiKaisaiBashoCode(9, 0),
    /**
     * 介護認定審査会委員の状況
     */
    shinsakaiIinJokyo(1, 0),
    /**
     * 開催済み登録区分
     */
    isKaisaiZumi(1, 0),
    /**
     * 所要時間合計
     */
    shoyoJikanGokei(5, 0);

    private final int maxLength;
    private final int scale;

    private DbT5109ShinsakaiKaisaiKekkaJoho(int maxLength, int scale) {
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