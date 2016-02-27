package jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.core.chosahyokomoku;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 施設利用-0-02Aを表す列挙型です。
 * 
 * @author LDNS 
 */
public enum GaikyochosaKomoku02A_25 {

    /**
     * コード:099 名称:居宅 略称:定義なし
     */
    居宅("099", "居宅");

    private final RString code;
    private final RString fullName;

    private GaikyochosaKomoku02A_25(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 施設利用-0-02Aのコードを返します。
     * 
     * @return 施設利用-0-02Aのコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 施設利用-0-02Aの名称を返します。
     * 
     * @return 施設利用-0-02Aの名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 施設利用-0-02Aのコードと一致する内容を探します。
     * 
     * @param code 施設利用-0-02Aのコード
     * @return {@code code} に対応する施設利用-0-02A
     */
    public static GaikyochosaKomoku02A_25 toValue(RString code) {
        for (GaikyochosaKomoku02A_25 gaikyochosaKomoku02A_25 : GaikyochosaKomoku02A_25.values()) {
            if (gaikyochosaKomoku02A_25.code.equals(code)) {
                return gaikyochosaKomoku02A_25;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("施設利用-0-02A"));
    }
}
