package jp.co.ndensan.reams.db.dbz.entity.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IColumnDefinition;

/**
 * DbT7119ServiceCodeの項目定義クラスです
 *
 */
public enum DbT7119ServiceCode implements IColumnDefinition {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.3.1">
    insertDantaiCd(2147483647, 0),
    insertTimestamp(29, 0),
    insertReamsLoginId(2147483647, 0),
    insertContextId(2147483647, 0),
    isDeleted(1, 0),
    updateCount(10, 0),
    lastUpdateTimestamp(29, 0),
    lastUpdateReamsLoginId(2147483647, 0),
    serviceShuruiCode(2147483647, 0),
    serviceKomokuCode(2147483647, 0),
    tekiyoKaishiYM(2147483647, 0),
    shoriTimestamp(2147483647, 0),
    tekiyoShuryoYM(2147483647, 0),
    serviceMeisho(100, 0),
    taniSu(10, 0),
    gendoGakuTaishogaiFlag(1, 0),
    taniSuShikibetsuCode(2, 0),
    gaibuServiceRiyogataKubun(1, 0),
    tokubetsuChiikiKasanFlag(1, 0),
    teiRitsu_TeiGakuKubun(1, 0),
    riyoshaFutanGaku(10, 0),
    kyufuRitsu(2147483647, 0);

    private final int maxLength;
    private final int scale;

    private DbT7119ServiceCode(int maxLength, int scale) {
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