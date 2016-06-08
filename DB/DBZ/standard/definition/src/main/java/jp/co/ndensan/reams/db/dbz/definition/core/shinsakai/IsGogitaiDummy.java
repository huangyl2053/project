package jp.co.ndensan.reams.db.dbz.definition.core.shinsakai;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 合議体ダミーフラグを表す列挙型です。
 *
 * @reamsid_L DBZ-9999-023 liangbc
 */
public enum IsGogitaiDummy {

    /**
     * コード:True 名称:ダミー 略称:定義なし
     */
    ダミー(true, "ダミー"),
    /**
     * コード:False 名称:正規 略称:定義なし
     */
    正規(false, "正規");

    private final boolean code;
    private final RString fullName;

    private IsGogitaiDummy(boolean code, String fullname) {
        this.code = code;
        this.fullName = new RString(fullname);
    }

    /**
     * 合議体ダミーフラグのコードを返します。
     *
     * @return 合議体ダミーフラグのコード
     */
    public boolean is合議体ダミーフラグTrue() {
        return code;
    }

    /**
     * 合議体ダミーフラグの名称を返します。
     *
     * @return 合議体ダミーフラグの名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 合議体ダミーフラグのコードと一致する内容を探します。
     *
     * @param code 合議体ダミーフラグのコード
     * @return {@code code} に対応する合議体ダミーフラグ
     */
    public static IsGogitaiDummy toValue(boolean code) {
        for (IsGogitaiDummy isGogitaiDummy : IsGogitaiDummy.values()) {
            if (isGogitaiDummy.code == code) {
                return isGogitaiDummy;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("合議体ダミーフラグ"));
    }
}
