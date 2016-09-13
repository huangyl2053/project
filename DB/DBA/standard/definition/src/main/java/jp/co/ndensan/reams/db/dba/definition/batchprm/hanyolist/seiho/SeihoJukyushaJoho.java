package jp.co.ndensan.reams.db.dba.definition.batchprm.hanyolist.seiho;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 生保受給者情報を表す列挙型です。
 *
 * @reamsid_L DBA-9999-023 wangchao
 */
public enum SeihoJukyushaJoho {

    /**
     * コード:1 名称:日本人 略称:定義なし
     */
    日本人("1", "日本人"),
    /**
     * コード:2 名称:外国人 略称:定義なし
     */
    外国人("2", "外国人");

    private final RString code;
    private final RString fullName;

    private SeihoJukyushaJoho(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 生保受給者情報のコードを返します。
     *
     * @return 生保受給者情報のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 生保受給者情報の名称を返します。
     *
     * @return 生保受給者情報の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 生保受給者情報のコードと一致する内容を探します。
     *
     * @param code 生保受給者情報のコード
     * @return {@code code} に対応する生保受給者情報
     */
    public static SeihoJukyushaJoho toValue(RString code) {
        for (SeihoJukyushaJoho seihoJukyushaJoho : SeihoJukyushaJoho.values()) {
            if (seihoJukyushaJoho.code.equals(code)) {
                return seihoJukyushaJoho;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("生保受給者情報"));
    }
}