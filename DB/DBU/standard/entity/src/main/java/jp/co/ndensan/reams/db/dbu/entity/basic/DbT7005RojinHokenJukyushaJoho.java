package jp.co.ndensan.reams.db.dbu.entity.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IColumnDefinition;

/**
 * 老人保健受給者情報テーブルの項目定義クラスです。
 * <br/> 老人保険者の受給情報を管理する
 */
public enum DbT7005RojinHokenJukyushaJoho implements IColumnDefinition {
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
     * 被保険者番号
     */
    hihokenshaNo(2147483647, 0),
    /**
     * 老人保健市町村コード
     */
    rojinHokenShichosonCode(2147483647, 0),
    /**
     * 老人保健受給者番号
     */
    rojinHokenJukyushaNo(7, 0);

    private final int maxLength;
    private final int scale;

    private DbT7005RojinHokenJukyushaJoho(int maxLength, int scale) {
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
