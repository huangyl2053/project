/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.hokensha.koiki;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 広域における市町村の種類です。
 *
 * @author N3327 三浦 凌
 */
public enum ShichosonType {

    /**
     * 合併して、今は存在しない市町村であることを表します。
     */
    合併旧市町村("1"),
    /**
     * 広域の構成市町村であることを表します。
     */
    構成市町村("0");
    private final RString theCode;

    private ShichosonType(String code) {
        this.theCode = new RString(code);

    }

    /**
     * コードを返します。
     *
     * @return コード
     */
    public RString code() {
        return this.theCode;
    }

    /**
     * 引数のコードに対応する ShichosonType を返します。
     *
     * @param code コード
     * @return コードに対応する ShichosonType
     * @throws IllegalArgumentException コードに対応する ShichosonType が無い時
     */
    public static ShichosonType toValue(RString code) throws IllegalArgumentException {
        ShichosonType value = CodeToValue.get(code);
        if (value != null) {
            return value;
        }
        throw new IllegalArgumentException();
    }

    //<editor-fold defaultstate="collapsed" desc="CodeToValue">
    private static final class CodeToValue {

        private static final Map<RString, ShichosonType> DICTHIONARY;

        static {
            Map<RString, ShichosonType> map = new HashMap<>();
            for (ShichosonType value : values()) {
                map.put(value.code(), value);
            }
            DICTHIONARY = Collections.unmodifiableMap(map);
        }

        static ShichosonType get(RString code) {
            return DICTHIONARY.get(code);
        }
    }
    //</editor-fold>
}
