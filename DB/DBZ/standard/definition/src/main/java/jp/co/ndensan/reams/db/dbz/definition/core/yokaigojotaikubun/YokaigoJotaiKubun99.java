package jp.co.ndensan.reams.db.dbz.definition.core.yokaigojotaikubun;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 要介護状態区分コード99を表す列挙型です。
 *
 * @reamsid_L DBZ-9999-023 liangbc
 */
public enum YokaigoJotaiKubun99 {

    /**
     * コード:01 名称:非該当 略称:非該
     */
    非該当("01", "非該当", "非該"),
    /**
     * コード:09 名称:みなし非該当 略称:み非
     */
    みなし非該当("09", "みなし非該当", "み非"),
    /**
     * コード:11 名称:経過的要介護 略称:経介
     */
    経過的要介護("11", "経過的要介護", "経介"),
    /**
     * コード:19 名称:みなし要支援 略称:み支
     */
    みなし要支援("19", "みなし要支援", "み支"),
    /**
     * コード:21 名称:要介護1 略称:介1
     */
    要介護1("21", "要介護1", "介1"),
    /**
     * コード:22 名称:要介護2 略称:介2
     */
    要介護2("22", "要介護2", "介2"),
    /**
     * コード:23 名称:要介護3 略称:介3
     */
    要介護3("23", "要介護3", "介3"),
    /**
     * コード:24 名称:要介護4 略称:介4
     */
    要介護4("24", "要介護4", "介4"),
    /**
     * コード:25 名称:要介護5 略称:介5
     */
    要介護5("25", "要介護5", "介5"),
    /**
     * コード:31 名称:再調査 略称:再調
     */
    再調査("31", "再調査", "再調"),
    /**
     * コード:32 名称:照会 略称:照会
     */
    照会("32", "照会", "照会"),
    /**
     * コード:88 名称:取消 略称:取消
     */
    取消("88", "取消", "取消"),
    /**
     * コード:98 名称:保留 略称:保留
     */
    保留("98", "保留", "保留"),
    /**
     * コード:99 名称:なし 略称:なし
     */
    なし("99", "なし", "なし");

    private final RString code;
    private final RString fullName;
    private final RString shortName;

    private YokaigoJotaiKubun99(String code, String fullname, String shortName) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
        this.shortName = new RString(shortName);
    }

    /**
     * 要介護状態区分コード99のコードを返します。
     *
     * @return 要介護状態区分コード99のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 要介護状態区分コード99の略称を返します。
     *
     * @return 要介護状態区分コード99の略称
     */
    public RString get略称() {
        return shortName;
    }

    /**
     * 要介護状態区分コード99の名称を返します。
     *
     * @return 要介護状態区分コード99の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 要介護状態区分コード99のコードと一致する内容を探します。
     *
     * @param code 要介護状態区分コード99のコード
     * @return {@code code} に対応する要介護状態区分コード99
     */
    public static YokaigoJotaiKubun99 toValue(RString code) {

        for (YokaigoJotaiKubun99 yokaigoJotaiKubun99 : YokaigoJotaiKubun99.values()) {
            if (yokaigoJotaiKubun99.code.equals(code)) {
                return yokaigoJotaiKubun99;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("要介護状態区分コード99"));
    }
}
