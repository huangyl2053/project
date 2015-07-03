package jp.co.ndensan.reams.db.dbz.entity.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IColumnDefinition;

/**
 * 主治医情報テーブルの項目定義クラスです。
 */
public enum DbT5912ShujiiJoho implements IColumnDefinition {
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
     * 市町村コード
     */
    shichosonCode(2147483647, 0),
    /**
     * 主治医医療機関コード
     */
    shujiiIryokikanCode(10, 0),
    /**
     * 主治医コード
     * <br/>主治医コード
     */
    shujiiCode(8, 0),
    /**
     * 主治医氏名
     */
    shujiiName(2147483647, 0),
    /**
     * 主治医カナ
     */
    shujiiKana(2147483647, 0),
    /**
     * 郵便番号
     */
    yubinNo(2147483647, 0),
    /**
     * 住所
     */
    jusho(2147483647, 0),
    /**
     * 電話番号
     */
    telNo(2147483647, 0),
    /**
     * FAX番号
     */
    faxNo(2147483647, 0),
    /**
     * 診療科名称
     */
    shinryokaName(64, 0),
    /**
     * 指定医フラグ
     * <br/>True：指定医になれる、False：なれない
     */
    shiteiiFlag(1, 0),
    /**
     * 状況フラグ
     */
    jokyoFlag(1, 0);

    private final int maxLength;
    private final int scale;

    private DbT5912ShujiiJoho(int maxLength, int scale) {
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