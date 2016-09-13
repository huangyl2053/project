package jp.co.ndensan.reams.db.dbe.definition.core.chosahyokomoku;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 施設利用-5-02Aを表す列挙型です。
 *
 * @reamsid_L DBE-0040-010 xuyue
 */
public enum GaikyochosaKomoku02A_21 {

    /**
     * コード:021 名称:特定施設入居者生活介護適用施設（ｹｱﾊｳｽ） 略称:定義なし
     */
    特定施設入居者生活介護適用施設_ｹｱﾊｳｽ("021", "特定施設入居者生活介護適用施設（ｹｱﾊｳｽ）");

    private final RString code;
    private final RString fullName;

    private GaikyochosaKomoku02A_21(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 施設利用-5-02Aのコードを返します。
     *
     * @return 施設利用-5-02Aのコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 施設利用-5-02Aの名称を返します。
     *
     * @return 施設利用-5-02Aの名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 施設利用-5-02Aのコードと一致する内容を探します。
     *
     * @param code 施設利用-5-02Aのコード
     * @return {@code code} に対応する施設利用-5-02A
     */
    public static GaikyochosaKomoku02A_21 toValue(RString code) {
        for (GaikyochosaKomoku02A_21 gaikyochosaKomoku02A_21 : GaikyochosaKomoku02A_21.values()) {
            if (gaikyochosaKomoku02A_21.code.equals(code)) {
                return gaikyochosaKomoku02A_21;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("施設利用-5-02A"));
    }
}