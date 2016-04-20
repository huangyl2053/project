package jp.co.ndensan.reams.db.dbz.definition.core.chohyo.kyotsu;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 地区表示3を表す列挙型です。
 *
 * @author LDNS
 */
public enum ChikuHyoji3 {

    /**
     * コード:0 名称:なし 略称:定義なし
     */
    なし("0", "なし"),
    /**
     * コード:3 名称:地区の分類1 略称:定義なし
     */
    地区の分類1("3", "地区の分類1"),
    /**
     * コード:4 名称:地区の分類2 略称:定義なし
     */
    地区の分類2("4", "地区の分類2"),
    /**
     * コード:5 名称:地区の分類3 略称:定義なし
     */
    地区の分類3("5", "地区の分類3"),
    /**
     * コード:6 名称:納組コード 略称:定義なし
     */
    納組コード("6", "納組コード");

    private final RString code;
    private final RString fullName;

    private ChikuHyoji3(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 地区表示3のコードを返します。
     *
     * @return 地区表示3のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 地区表示3の名称を返します。
     *
     * @return 地区表示3の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 地区表示3のコードと一致する内容を探します。
     *
     * @param code 地区表示3のコード
     * @return {@code code} に対応する地区表示3
     */
    public static ChikuHyoji3 toValue(RString code) {

        for (ChikuHyoji3 chikuHyoji3 : ChikuHyoji3.values()) {
            if (chikuHyoji3.code.equals(code)) {
                return chikuHyoji3;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("地区表示3"));
    }
}