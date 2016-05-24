package jp.co.ndensan.reams.db.dbd.business.report.dbd100009;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 帳票制御汎用キーDBD100009を表す列挙型です。
 *
 * @reamsid_L DBD-9999-023 wangchao
 */
public enum ChohyoSeigyoHanyoKeysDBD100009 {

    /**
     * コード:なし 名称:帳票タイトル_上段 略称:定義なし
     */
    帳票タイトル_上段("帳票タイトル_上段"),
    /**
     * コード:なし 名称:帳票タイトル_下段 略称:定義なし
     */
    帳票タイトル_下段("帳票タイトル_下段"),
    /**
     * コード:なし 名称:帳票タイトル_上段_旧措置者用 略称:定義なし
     */
    帳票タイトル_上段_旧措置者用("帳票タイトル_上段_旧措置者用"),
    /**
     * コード:なし 名称:帳票タイトル__旧措置者用 略称:定義なし
     */
    帳票タイトル__旧措置者用("帳票タイトル__旧措置者用");

    private final RString fullName;

    private ChohyoSeigyoHanyoKeysDBD100009(String fullname) {
        this.fullName = new RString(fullname);
    }

    /**
     * 帳票制御汎用キーDBD100009の名称を返します。
     *
     * @return 帳票制御汎用キーDBD100009の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 帳票制御汎用キーDBD100009の名称と一致する内容を探します。
     *
     * @param fullname 帳票制御汎用キーDBD100009の名称
     * @return {@code fullname} に対応する帳票制御汎用キーDBD100009
     */
    public static ChohyoSeigyoHanyoKeysDBD100009 toValue(RString fullname) {
        for (ChohyoSeigyoHanyoKeysDBD100009 value : ChohyoSeigyoHanyoKeysDBD100009.values()) {
            if (value.get名称().equals(fullname)) {
                return value;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("帳票制御汎用キーDBD100009"));
    }
}
