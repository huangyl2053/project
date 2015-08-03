package jp.co.ndensan.reams.db.dbu.entity.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IColumnDefinition;

/**
 * 弁明内容テーブルの項目定義クラスです。
 * <br/> 不服申立に対する弁明内容を登録する
 */
public enum DbT7002BemmeiNaiyo implements IColumnDefinition {
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
     * 証記載保険者番号
     */
    shoKisaiHokenshaNo(2147483647, 0),
    /**
     * 識別コード
     */
    shikibetsuCode(2147483647, 0),
    /**
     * 原処分被保険者番号
     */
    genshobunHihokenshaNo(2147483647, 0),
    /**
     * 審査請求届出日
     */
    shinsaseikyuTodokedeYMD(2147483647, 0),
    /**
     * 弁明書作成日
     */
    bemmeishoSakuseiYMD(2147483647, 0),
    /**
     * 審査請求に係る処分内容
     */
    shinsaseikyuKankeiShobunNaiyo(2147483647, 0),
    /**
     * 弁明内容
     */
    bemmeiNaiyo(2147483647, 0),
    /**
     * 弁明書作成日提出日
     */
    bemmeishoSakuseiTeishutsuYMD(2147483647, 0);

    private final int maxLength;
    private final int scale;

    private DbT7002BemmeiNaiyo(int maxLength, int scale) {
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