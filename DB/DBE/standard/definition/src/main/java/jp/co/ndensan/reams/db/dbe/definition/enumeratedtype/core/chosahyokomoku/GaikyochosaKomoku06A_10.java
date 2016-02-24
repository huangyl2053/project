package jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.core.chosahyokomoku;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 在宅利用-10-06Aを表す列挙型です。
 *
 * @author LDNS
 */
public enum GaikyochosaKomoku06A_10 {

    /**
     * コード:010 名称:（介護予防）特定施設入居者生活介護 略称:定義なし
     */
    _介護予防_特定施設入居者生活介護("010", "（介護予防）特定施設入居者生活介護", "日/月");

    private final RString code;
    private final RString fullName;
    private final RString tani;

    private GaikyochosaKomoku06A_10(String code, String fullname, String tani) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
        this.tani = new RString(tani);
    }

    /**
     * 在宅利用-10-06Aのコードを返します。
     *
     * @return 在宅利用-10-06Aのコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 在宅利用-10-06Aの名称を返します。
     *
     * @return 在宅利用-10-06Aの名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 在宅利用-10-06Aの単位を返します。
     *
     * @return 在宅利用-10-06Aの単位
     */
    public RString get単位() {
        return tani;
    }

    /**
     * 在宅利用-10-06Aのコードと一致する内容を探します。
     *
     * @param code 在宅利用-10-06Aのコード
     * @return {@code code} に対応する在宅利用-10-06A
     */
    public static GaikyochosaKomoku06A_10 toValue(RString code) {
        for (GaikyochosaKomoku06A_10 gaikyochosaKomoku06A_10 : GaikyochosaKomoku06A_10.values()) {
            if (gaikyochosaKomoku06A_10.code.equals(code)) {
                return gaikyochosaKomoku06A_10;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("在宅利用-10-06A"));
    }
}
