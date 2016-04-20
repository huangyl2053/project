package jp.co.ndensan.reams.db.dbb.definition.core.fucho;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 普徴期情報月処理区分を表す列挙型です。
 *
 * @author LDNS
 */
public enum FuchokiJohoTsukiShoriKubun {

    /**
     * コード:0 名称:なし 略称:定義なし
     */
    なし("0", "なし"),
    /**
     * コード:1 名称:普徴仮算定 略称:定義なし
     */
    普徴仮算定("1", "普徴仮算定"),
    /**
     * コード:2 名称:普徴仮算定異動 略称:定義なし
     */
    普徴仮算定異動("2", "普徴仮算定異動"),
    /**
     * コード:3 名称:特徴仮算定異動 略称:定義なし
     */
    特徴仮算定異動("3", "特徴仮算定異動"),
    /**
     * コード:4 名称:本算定 略称:定義なし
     */
    本算定("4", "本算定"),
    /**
     * コード:5 名称:本算定異動 略称:定義なし
     */
    本算定異動("5", "本算定異動"),
    /**
     * コード:6 名称:随時 略称:定義なし
     */
    随時("6", "随時"),
    /**
     * コード:7 名称:現年随時 略称:定義なし
     */
    現年随時("7", "現年随時");

    private final RString code;
    private final RString fullName;

    private FuchokiJohoTsukiShoriKubun(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 普徴期情報月処理区分のコードを返します。
     *
     * @return 普徴期情報月処理区分のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 普徴期情報月処理区分の名称を返します。
     *
     * @return 普徴期情報月処理区分の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 普徴期情報月処理区分のコードと一致する内容を探します。
     *
     * @param code 普徴期情報月処理区分のコード
     * @return {@code code} に対応する普徴期情報月処理区分
     */
    public static FuchokiJohoTsukiShoriKubun toValue(RString code) {
        for (FuchokiJohoTsukiShoriKubun fuchokiJohoTsukiShoriKubun : FuchokiJohoTsukiShoriKubun.values()) {
            if (fuchokiJohoTsukiShoriKubun.code.equals(code)) {
                return fuchokiJohoTsukiShoriKubun;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("普徴期情報月処理区分"));
    }
}