package jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.core.chosahyokomoku;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 在宅利用-15-99Aを表す列挙型です。
 * 
 * @author LDNS 
 */
public enum GaikyochosaKomoku99A_15 {

    /**
     * コード:015 名称:市町村特別給付 略称:定義なし
     */
    市町村特別給付("015", "市町村特別給付");

    private final RString code;
    private final RString fullName;

    private GaikyochosaKomoku99A_15(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 在宅利用-15-99Aのコードを返します。
     * 
     * @return 在宅利用-15-99Aのコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 在宅利用-15-99Aの名称を返します。
     * 
     * @return 在宅利用-15-99Aの名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 在宅利用-15-99Aのコードと一致する内容を探します。
     * 
     * @param code 在宅利用-15-99Aのコード
     * @return {@code code} に対応する在宅利用-15-99A
     */
    public static GaikyochosaKomoku99A_15 toValue(RString code) {
        for (GaikyochosaKomoku99A_15 gaikyochosaKomoku99A_15 : GaikyochosaKomoku99A_15.values()) {
            if (gaikyochosaKomoku99A_15.code.equals(code)) {
                return gaikyochosaKomoku99A_15;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("在宅利用-15-99A"));
    }
}
