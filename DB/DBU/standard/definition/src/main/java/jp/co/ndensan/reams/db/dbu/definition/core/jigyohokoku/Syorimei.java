package jp.co.ndensan.reams.db.dbu.definition.core.jigyohokoku;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 処理名を表す列挙型です。
 *
 * @reamsid_L DBU-9999-023 wangchao
 */
public enum Syorimei {

    /**
     * コード:DBU010010 名称:月報報告 一般状況１～１１ 略称:定義なし
     */
    月報報告一般状況１_１１("DBU010010", "月報報告　一般状況１～１１"),
    /**
     * コード:DBU010020 名称:月報報告 一般状況１２～１４ 現物分 略称:定義なし
     */
    月報報告一般状況１２_１４現物分("DBU010020", "月報報告　一般状況１２～１４　現物分"),
    /**
     * コード:DBU010030 名称:月報報告 一般状況１２～１４ 償還分審査 略称:定義なし
     */
    月報報告一般状況１２_１４償還分審査("DBU010030", "月報報告　一般状況１２～１４　償還分審査"),
    /**
     * コード:DBU010040 名称:月報報告 一般状況１２～１４ 償還分決定 略称:定義なし
     */
    月報報告一般状況１２_１４償還分決定("DBU010040", "月報報告　一般状況１２～１４　償還分決定"),
    /**
     * コード:DBU010050 名称:月報報告 保険給付決定 現物分 略称:定義なし
     */
    月報報告保険給付決定現物分("DBU010050", "月報報告　保険給付決定　現物分"),
    /**
     * コード:DBU010060 名称:月報報告 保険給付決定 市町村特別給付 略称:定義なし
     */
    月報報告保険給付決定市町村特別給付("DBU010060", "月報報告　保険給付決定　市町村特別給付"),
    /**
     * コード:DBU010070 名称:月報報告 保険給付決定 償還分審査 略称:定義なし
     */
    月報報告保険給付決定償還分審査("DBU010070", "月報報告　保険給付決定　償還分審査"),
    /**
     * コード:DBU010080 名称:月報報告 保険給付決定 償還分決定 略称:定義なし
     */
    月報報告保険給付決定償還分決定("DBU010080", "月報報告　保険給付決定　償還分決定"),
    /**
     * コード:DBU010090 名称:月報報告 保険給付決定 高額分 略称:定義なし
     */
    月報報告保険給付決定高額分("DBU010090", "月報報告　保険給付決定　高額分"),
    /**
     * コード:DBU010100 名称:月報報告 保険給付決定 高額合算分 略称:定義なし
     */
    月報報告保険給付決定高額合算分("DBU010100", "月報報告　保険給付決定　高額合算分"),
    /**
     * コード:DBU030020 名称:年報報告 様式１・２ 略称:定義なし
     */
    年報報告様式１_２("DBU030020", "年報報告　様式１・２"),
    /**
     * コード:DBU030030 名称:年報報告 一般状況１～１１ 略称:定義なし
     */
    年報報告一般状況１_１１("DBU030030", "年報報告　一般状況１～１１"),
    /**
     * コード:DBU030040 名称:年報報告 一般状況１２～１４ 現物分 略称:定義なし
     */
    年報報告一般状況１２_１４現物分("DBU030040", "年報報告　一般状況１２～１４　現物分"),
    /**
     * コード:DBU030050 名称:年報報告 一般状況1２～１４ 償還分審査 略称:定義なし
     */
    年報報告一般状況1２_１４償還分審査("DBU030050", "年報報告　一般状況1２～１４　償還分審査"),
    /**
     * コード:DBU030060 名称:年報報告 一般状況1２～１４ 償還分決定 略称:定義なし
     */
    年報報告一般状況1２_１４償還分決定("DBU030060", "年報報告　一般状況1２～１４　償還分決定"),
    /**
     * コード:DBU030070 名称:年報報告 保険給付決定 現物分 略称:定義なし
     */
    年報報告保険給付決定現物分("DBU030070", "年報報告　保険給付決定　現物分"),
    /**
     * コード:DBU030080 名称:年報報告 保険給付決定 償還分審査 略称:定義なし
     */
    年報報告保険給付決定償還分審査("DBU030080", "年報報告　保険給付決定　償還分審査"),
    /**
     * コード:DBU030090 名称:年報報告 保険給付決定 償還分決定 略称:定義なし
     */
    年報報告保険給付決定償還分決定("DBU030090", "年報報告　保険給付決定　償還分決定"),
    /**
     * コード:DBU030100 名称:年報報告 保険給付決定 高額分 略称:定義なし
     */
    年報報告保険給付決定高額分("DBU030100", "年報報告　保険給付決定　高額分"),
    /**
     * コード:DBU030110 名称:年報報告 保険給付決定 高額合算分 略称:定義なし
     */
    年報報告保険給付決定高額合算分("DBU030110", "年報報告　保険給付決定　高額合算分");

    private final RString code;
    private final RString fullName;

    private Syorimei(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 処理名のコードを返します。
     *
     * @return 処理名のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 処理名の名称を返します。
     *
     * @return 処理名の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 処理名のコードと一致する内容を探します。
     *
     * @param code 処理名のコード
     * @return {@code code} に対応する処理名
     */
    public static Syorimei toValue(RString code) {
        for (Syorimei syorimei : Syorimei.values()) {
            if (syorimei.code.equals(code)) {
                return syorimei;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("処理名"));
    }
}
