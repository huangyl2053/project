/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.ikensho;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * その他受診科の有無を表す列挙型です。
 *
 * @reamsid_L DBZ-9999-023 wangchao
 */
public enum SonotaJushinkaUmu {

    /**
     * コード:True 名称:あり 略称:定義なし
     */
    あり(true, "あり"),
    /**
     * コード:False 名称:なし 略称:定義なし
     */
    なし(false, "なし");

    private final boolean code;
    private final RString fullName;

    private SonotaJushinkaUmu(boolean code, String fullname) {
        this.code = code;
        this.fullName = new RString(fullname);
    }

    /**
     * その他受診科の有無のコードを返します。
     *
     * @return その他受診科の有無のコード
     */
    public boolean isあり() {
        return code;
    }

    /**
     * その他受診科の有無の名称を返します。
     *
     * @return その他受診科の有無の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * その他受診科の有無のコードと一致する内容を探します。
     *
     * @param code その他受診科の有無のコード
     * @return {@code code} に対応するその他受診科の有無
     */
    public static SonotaJushinkaUmu toValue(boolean code) {
        for (SonotaJushinkaUmu sonotaJushinkaUmu : SonotaJushinkaUmu.values()) {
            if (sonotaJushinkaUmu.code == code) {
                return sonotaJushinkaUmu;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("その他受診科の有無"));
    }
}