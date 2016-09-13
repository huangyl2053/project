package jp.co.ndensan.reams.db.dbe.definition.core.chosahyokomoku;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 在宅利用-19-09B-2015を表す列挙型です。
 *
 * @reamsid_L DBE-0040-010 xuyue
 */
public enum GaikyochosaKomoku09B2015_19 {

    /**
     * コード:019 名称:地域密着型特定施設入居者生活介護 略称:定義なし
     */
    地域密着型特定施設入居者生活介護("019", "地域密着型特定施設入居者生活介護");

    private final RString code;
    private final RString fullName;

    private GaikyochosaKomoku09B2015_19(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 在宅利用-19-09B-2015のコードを返します。
     *
     * @return 在宅利用-19-09B-2015のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 在宅利用-19-09B-2015の名称を返します。
     *
     * @return 在宅利用-19-09B-2015の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 在宅利用-19-09B-2015のコードと一致する内容を探します。
     *
     * @param code 在宅利用-19-09B-2015のコード
     * @return {@code code} に対応する在宅利用-19-09B-2015
     */
    public static GaikyochosaKomoku09B2015_19 toValue(RString code) {
        for (GaikyochosaKomoku09B2015_19 gaikyochosaKomoku09B2015_19 : GaikyochosaKomoku09B2015_19.values()) {
            if (gaikyochosaKomoku09B2015_19.code.equals(code)) {
                return gaikyochosaKomoku09B2015_19;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("在宅利用-19-09B-2015"));
    }
}