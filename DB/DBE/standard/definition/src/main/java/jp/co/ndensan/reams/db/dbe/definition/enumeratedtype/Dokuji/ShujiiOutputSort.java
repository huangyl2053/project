package jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.Dokuji;

import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 主治医医療機関・主治医一覧表出力順を表す列挙型です。
 * 
 * @author LDNS 作成者漢字名
 */
public enum ShujiiOutputSort {

    /**
     * コード:1 名称:医療機関コード+主治医コード 略称:定義なし
     */
    医療機関コード主治医コード("1", "医療機関コード+主治医コード"),

    /**
     * コード:2 名称:医療機関コード+主治医名称 略称:定義なし
     */
    医療機関コード主治医名称("2", "医療機関コード+主治医名称"),

    /**
     * コード:3 名称:医療機関名称+主治医コード 略称:定義なし
     */
    医療機関名称主治医コード("3", "医療機関名称+主治医コード"),

    /**
     * コード:4 名称:医療機関名称+主治医名称 略称:定義なし
     */
    医療機関名称主治医名称("4", "医療機関名称+主治医名称");

    private final RString code;
    private final RString fullName;

    private ShujiiOutputSort(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 主治医医療機関・主治医一覧表出力順のコードを返します。
     * 
     * @return 主治医医療機関・主治医一覧表出力順のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 主治医医療機関・主治医一覧表出力順の名称を返します。
     * 
     * @return 主治医医療機関・主治医一覧表出力順の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 主治医医療機関・主治医一覧表出力順のコードと一致する内容を探します。
     * 
     * @param code 主治医医療機関・主治医一覧表出力順のコード
     * @return {@code code} に対応する主治医医療機関・主治医一覧表出力順
     */
    public static ShujiiOutputSort toValue(RString code) {
//        requireNonNull(code, DcErrorMessages.E00001.getMessage().getMessage());
        for (ShujiiOutputSort shujiiOutputSort : ShujiiOutputSort.values()) {
            if (shujiiOutputSort.code.equals(code)) {
                return shujiiOutputSort;
            }
        }
        return null;
//        throw new IllegalArgumentException(DcErrorMessages.E09002.getMessage().getMessage());
    }
}