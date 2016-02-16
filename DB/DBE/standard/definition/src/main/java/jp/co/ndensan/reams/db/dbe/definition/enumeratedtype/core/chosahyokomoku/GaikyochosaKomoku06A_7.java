package jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.core.chosahyokomoku;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 在宅利用-7-06Aを表す列挙型です。
 * 
 * @author LDNS 
 */
public enum GaikyochosaKomoku06A_7 {

    /**
     * コード:007 名称:（介護予防）通所ﾘﾊﾋﾞﾘﾃｰｼｮﾝ（ﾃﾞｲｹｱ） 略称:定義なし
     */
    _介護予防_通所ﾘﾊﾋﾞﾘﾃｰｼｮﾝ_ﾃﾞｲｹｱ("007", "（介護予防）通所ﾘﾊﾋﾞﾘﾃｰｼｮﾝ（ﾃﾞｲｹｱ）");

    private final RString code;
    private final RString fullName;

    private GaikyochosaKomoku06A_7(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 在宅利用-7-06Aのコードを返します。
     * 
     * @return 在宅利用-7-06Aのコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 在宅利用-7-06Aの名称を返します。
     * 
     * @return 在宅利用-7-06Aの名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 在宅利用-7-06Aのコードと一致する内容を探します。
     * 
     * @param code 在宅利用-7-06Aのコード
     * @return {@code code} に対応する在宅利用-7-06A
     */
    public static GaikyochosaKomoku06A_7 toValue(RString code) {
        for (GaikyochosaKomoku06A_7 gaikyochosaKomoku06A_7 : GaikyochosaKomoku06A_7.values()) {
            if (gaikyochosaKomoku06A_7.code.equals(code)) {
                return gaikyochosaKomoku06A_7;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("在宅利用-7-06A"));
    }
}
