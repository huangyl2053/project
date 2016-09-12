/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.core.servicecode;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 事業対象者実施区分を表す列挙型です。
 *
 * @reamsid_L DBC-9999-022 zhaowei
 */
public enum JigyoTaisyosyaJisiKubun {

    /**
     * コード:0 名称:未使用 略称:定義なし
     */
    未使用("0", "未使用"),
    /**
     * コード:1 名称:実施不可 略称:定義なし
     */
    実施不可("1", "実施不可"),
    /**
     * コード:2 名称:実施可 略称:定義なし
     */
    実施可("2", "実施可");
    private final RString code;
    private final RString fullName;

    private JigyoTaisyosyaJisiKubun(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 事業対象者実施区分のコードを返します。
     *
     * @return 事業対象者実施区分のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 事業対象者実施区分の名称を返します。
     *
     * @return 事業対象者実施区分の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 事業対象者実施区分のコードと一致する内容を探します。
     *
     * @param code 事業対象者実施区分のコード
     * @return {@code code} に対応する事業対象者実施区分
     */
    public static JigyoTaisyosyaJisiKubun toValue(RString code) {

        for (JigyoTaisyosyaJisiKubun kubun : JigyoTaisyosyaJisiKubun.values()) {
            if (kubun.code.equals(code)) {
                return kubun;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("事業対象者実施区分"));
    }
}
