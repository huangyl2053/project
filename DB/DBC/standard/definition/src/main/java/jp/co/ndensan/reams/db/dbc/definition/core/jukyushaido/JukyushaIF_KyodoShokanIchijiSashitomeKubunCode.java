/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.core.jukyushaido;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 受給者IF_共同_償還_一次差止区分コードを表す列挙型です。
 *
 * @reamsid_L DBC-9999-023 liangbc
 */
public enum JukyushaIF_KyodoShokanIchijiSashitomeKubunCode {

    /**
     * コード:1 名称:一部差止 表示名称:一部差止
     */
    一部差止("1", "一部差止"),
    /**
     * コード:2 名称:全部差止 表示名称:全部差止
     */
    全部差止("2", "全部差止");

    private final RString code;
    private final RString fullName;

    private JukyushaIF_KyodoShokanIchijiSashitomeKubunCode(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 受給者IF_共同_償還_一次差止区分コードのコードを返します。
     *
     * @return 受給者IF_共同_償還_一次差止区分コードのコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 受給者IF_共同_償還_一次差止区分コードの名称を返します。
     *
     * @return 受給者IF_共同_償還_一次差止区分コードの名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 受給者IF_共同_償還_一次差止区分コードのコードと一致する内容を探します。
     *
     * @param code 受給者IF_共同_償還_一次差止区分コードのコード
     * @return {@code code} に対応する受給者IF_共同_償還_一次差止区分コード
     */
    public static JukyushaIF_KyodoShokanIchijiSashitomeKubunCode toValue(RString code) {

        for (JukyushaIF_KyodoShokanIchijiSashitomeKubunCode jukyushaIF : JukyushaIF_KyodoShokanIchijiSashitomeKubunCode.values()) {
            if (jukyushaIF.code.equals(code)) {
                return jukyushaIF;
            }
        }
        throw new IllegalArgumentException(
                UrSystemErrorMessages.変換不可.getReplacedMessage("受給者IF_共同_償還_一次差止区分コードのコード"));
    }
}