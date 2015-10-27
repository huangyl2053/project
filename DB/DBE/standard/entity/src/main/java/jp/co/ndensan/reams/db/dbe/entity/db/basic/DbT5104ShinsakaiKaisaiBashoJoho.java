package jp.co.ndensan.reams.db.dbe.entity.db.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IColumnDefinition;

/**
 * DbT5104ShinsakaiKaisaiBashoJohoの項目定義クラスです
 *
 * @author n8178 城間篤人
 */
public enum DbT5104ShinsakaiKaisaiBashoJoho implements IColumnDefinition {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.2">

    insertDantaiCd(2147483647, 0),
    insertTimestamp(29, 0),
    insertReamsLoginId(2147483647, 0),
    insertContextId(2147483647, 0),
    isDeleted(1, 0),
    updateCount(10, 0),
    lastUpdateTimestamp(29, 0),
    lastUpdateReamsLoginId(2147483647, 0),
    shinsakaiKaisaiBashoCode(9, 0),
    shinsakaiKaisaiBashoMei(80, 0),
    shinsakaiKaisaiChikuCode(2147483647, 0),
    shinsakaiKaisaiBashoJusho(2147483647, 0),
    shinsakaiKaisaiBashoTelNo(2147483647, 0),
    shinsakaiKaisaiBashoJokyo(1, 0);
    private final int maxLength;
    private final int scale;

    private DbT5104ShinsakaiKaisaiBashoJoho(int maxLength, int scale) {
        this.maxLength = maxLength;
        this.scale = scale;
    }

    /**
     * getMaxLength
     *
     * @return 項目の最大長
     */
    public int getMaxLength() {
        return maxLength;
    }

    /**
     * getScale
     *
     * @return 小数点以下の桁数
     */
    public int getScale() {
        return scale;
    }
// </editor-fold>
}