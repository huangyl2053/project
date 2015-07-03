package jp.co.ndensan.reams.db.dbz.entity.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IColumnDefinition;

/**
 * DbT7022ShoriDateKanriの項目定義クラスです
 *
 */
public enum DbT7022ShoriDateKanri implements IColumnDefinition {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.3.1">
    insertDantaiCd(2147483647, 0),
    insertTimestamp(29, 0),
    insertReamsLoginId(2147483647, 0),
    insertContextId(2147483647, 0),
    isDeleted(1, 0),
    updateCount(10, 0),
    lastUpdateTimestamp(29, 0),
    lastUpdateReamsLoginId(2147483647, 0),
    subGyomuCode(2147483647, 0),
    shichosonCode(2147483647, 0),
    shoriName(100, 0),
    shoriEdaban(4, 0),
    nendo(2147483647, 0),
    nendoNaiRenban(4, 0),
    kijunYMD(2147483647, 0),
    taishoKaishiYMD(2147483647, 0),
    taishoShuryoYMD(2147483647, 0),
    taishoKaishiTimestamp(2147483647, 0),
    taishoShuryoTimestamp(2147483647, 0);

    private final int maxLength;
    private final int scale;

    private DbT7022ShoriDateKanri(int maxLength, int scale) {
        this.maxLength = maxLength;
        this.scale = scale;
    }

    /**
     * getMaxLength
     * @return 項目の最大長
     */
    public int getMaxLength() {
        return maxLength;
    }

    /**
     * getScale
     * @return 小数点以下の桁数
     */
    public int getScale() {
        return scale;
    }

// </editor-fold>
}