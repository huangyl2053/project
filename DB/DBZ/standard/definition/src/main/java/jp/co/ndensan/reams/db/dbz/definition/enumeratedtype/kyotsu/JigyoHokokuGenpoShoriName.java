package jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.kyotsu;

import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 事業報告月報処理名を表す列挙型です。
 *
 * @author LDNS
 */
public enum JigyoHokokuGenpoShoriName {

    /**
     * コード:無し 名称:事業状況報告資料（月報）作成 一般状況１～１１ 略称:定義なし
     */
    事業状況報告資料_月報_作成一般状況１_１１("事業状況報告資料（月報）作成 一般状況１～１１"),
    /**
     * コード:無し 名称:事業状況報告資料（月報）作成 一般状況１２～１４【現物分】 略称:定義なし
     */
    事業状況報告資料_月報_作成一般状況１２_１４_現物分("事業状況報告資料（月報）作成 一般状況１２～１４【現物分】"),
    /**
     * コード:無し 名称:事業状況報告資料（月報）作成 一般状況１２～１４【償還分_審査年月】 略称:定義なし
     */
    事業状況報告資料_月報_作成一般状況１２_１４_償還分_審査年月("事業状況報告資料（月報）作成 一般状況１２～１４【償還分_審査年月】"),
    /**
     * コード:無し 名称:事業状況報告資料（月報）作成 一般状況１２～１４【償還分_決定年月】 略称:定義なし
     */
    事業状況報告資料_月報_作成一般状況１２_１４_償還分_決定年月("事業状況報告資料（月報）作成 一般状況１２～１４【償還分_決定年月】"),
    /**
     * コード:無し 名称:事業状況報告資料（月報）作成 保険給付決定状況【現物分】 略称:定義なし
     */
    事業状況報告資料_月報_作成保険給付決定状況_現物分("事業状況報告資料（月報）作成 保険給付決定状況【現物分】"),
    /**
     * コード:無し 名称:事業状況報告資料（月報）作成 保険給付決定状況【償還分_審査年月】 略称:定義なし
     */
    事業状況報告資料_月報_作成保険給付決定状況_償還分_審査年月("事業状況報告資料（月報）作成 保険給付決定状況【償還分_審査年月】"),
    /**
     * コード:無し 名称:事業状況報告資料（月報）作成 保険給付決定状況【償還分_決定年月】 略称:定義なし
     */
    事業状況報告資料_月報_作成保険給付決定状況_償還分_決定年月("事業状況報告資料（月報）作成 保険給付決定状況【償還分_決定年月】"),
    /**
     * コード:無し 名称:事業状況報告資料（月報）作成 保険給付決定状況【高額分】 略称:定義なし
     */
    事業状況報告資料_月報_作成保険給付決定状況_高額分("事業状況報告資料（月報）作成 保険給付決定状況【高額分】"),
    /**
     * コード:無し 名称:事業状況報告資料（月報）作成 保険給付決定状況【高額合算分】 略称:定義なし
     */
    事業状況報告資料_月報_作成保険給付決定状況_高額合算分("事業状況報告資料（月報）作成 保険給付決定状況【高額合算分】");

    private final RString fullName;

    private JigyoHokokuGenpoShoriName(String fullname) {
        this.fullName = new RString(fullname);
    }

    /**
     * 事業報告月報処理名の名称を返します。
     *
     * @return 事業報告月報処理名の名称
     */
    public RString get名称() {
        return fullName;
    }

}
