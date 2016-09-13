package jp.co.ndensan.reams.db.dbc.definition.core.configkeys;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 介護給付費再審査決定通知書公費情報コンフィグキーを表す列挙型です。
 *
 * @reamsid_L DBC-9999-023 liangbc
 */
public enum ConfigKeysSaishinsaKetteiTuchi_Kohi implements IConfigKeysKokuhorenTorikomi {

    /**
     * コード:無し 名称:国保連取込_介護給付費再審査決定通知書公費情報 略称:定義なし
     */
    国保連取込_介護給付費再審査決定通知書公費情報("国保連取込_介護給付費再審査決定通知書公費情報"),
    /**
     * コード:無し 名称:国保連取込_介護給付費再審査決定通知書公費情報_バッチID 略称:定義なし
     */
    国保連取込_介護給付費再審査決定通知書公費情報_バッチID("国保連取込_介護給付費再審査決定通知書公費情報_バッチID"),
    /**
     * コード:無し 名称:国保連取込_介護給付費再審査決定通知書公費情報_一覧表示順 略称:定義なし
     */
    国保連取込_介護給付費再審査決定通知書公費情報_一覧表示順("国保連取込_介護給付費再審査決定通知書公費情報_一覧表示順"),
    /**
     * コード:無し 名称:国保連取込_介護給付費再審査決定通知書公費情報_交換情報識別番号 略称:定義なし
     */
    国保連取込_介護給付費再審査決定通知書公費情報_交換情報識別番号("国保連取込_介護給付費再審査決定通知書公費情報_交換情報識別番号"),
    /**
     * コード:無し 名称:国保連取込_介護給付費再審査決定通知書公費情報_再処理不可区分 略称:定義なし
     */
    国保連取込_介護給付費再審査決定通知書公費情報_再処理不可区分("国保連取込_介護給付費再審査決定通知書公費情報_再処理不可区分"),
    /**
     * コード:無し 名称:国保連取込_介護給付費再審査決定通知書公費情報_処理サイクル区分 略称:定義なし
     */
    国保連取込_介護給付費再審査決定通知書公費情報_処理サイクル区分("国保連取込_介護給付費再審査決定通知書公費情報_処理サイクル区分"),
    /**
     * コード:無し 名称:国保連取込_介護給付費再審査決定通知書公費情報_処理月 略称:定義なし
     */
    国保連取込_介護給付費再審査決定通知書公費情報_処理月("国保連取込_介護給付費再審査決定通知書公費情報_処理月"),
    /**
     * コード:無し 名称:国保連取込_介護給付費再審査決定通知書公費情報_処理名称 略称:定義なし
     */
    国保連取込_介護給付費再審査決定通知書公費情報_処理名称("国保連取込_介護給付費再審査決定通知書公費情報_処理名称"),
    /**
     * コード:無し 名称:国保連取込_介護給付費再審査決定通知書公費情報_排他チェック有り区分 略称:定義なし
     */
    国保連取込_介護給付費再審査決定通知書公費情報_排他チェック有り区分("国保連取込_介護給付費再審査決定通知書公費情報_排他チェック有り区分"),
    /**
     * コード:無し 名称:国保連取込_介護給付費再審査決定通知書公費情報_有効区分 略称:定義なし
     */
    国保連取込_介護給付費再審査決定通知書公費情報_有効区分("国保連取込_介護給付費再審査決定通知書公費情報_有効区分");

    private final RString fullName;

    private ConfigKeysSaishinsaKetteiTuchi_Kohi(String fullname) {
        this.fullName = new RString(fullname);
    }

    /**
     * 介護給付費再審査決定通知書公費情報コンフィグキーの名称を返します。
     *
     * @return 介護給付費再審査決定通知書公費情報コンフィグキーの名称
     */
    public RString get名称() {
        return fullName;
    }

    @Override
    public Enum getバッチID() {
        return 国保連取込_介護給付費再審査決定通知書公費情報_バッチID;
    }

    @Override
    public Enum get一覧表示順() {
        return 国保連取込_介護給付費再審査決定通知書公費情報_一覧表示順;
    }

    @Override
    public Enum get交換情報識別番号() {
        return 国保連取込_介護給付費再審査決定通知書公費情報_交換情報識別番号;
    }

    @Override
    public Enum get再処理不可区分() {
        return 国保連取込_介護給付費再審査決定通知書公費情報_再処理不可区分;
    }

    @Override
    public Enum get処理サイクル区分() {
        return 国保連取込_介護給付費再審査決定通知書公費情報_処理サイクル区分;
    }

    @Override
    public Enum get処理月() {
        return 国保連取込_介護給付費再審査決定通知書公費情報_処理月;
    }

    @Override
    public Enum get処理名称() {
        return 国保連取込_介護給付費再審査決定通知書公費情報_処理名称;
    }

    @Override
    public Enum get排他チェック有り区分() {
        return 国保連取込_介護給付費再審査決定通知書公費情報_排他チェック有り区分;
    }

    @Override
    public Enum get有効区分() {
        return 国保連取込_介護給付費再審査決定通知書公費情報_有効区分;
    }

    /**
     * 国保連取込_介護給付費再審査決定通知書公費情報
     *
     * @return 国保連取込_介護給付費再審査決定通知書公費情報
     */
    public static IConfigKeysKokuhorenTorikomi getEnum() {
        return 国保連取込_介護給付費再審査決定通知書公費情報;
    }

    /**
     * 介護給付費再審査決定通知書公費情報コンフィグキーの名称と一致する内容を探します。
     *
     * @param fullname 介護給付費再審査決定通知書公費情報コンフィグキーの名称
     * @return {@code code} に対応する介護給付費再審査決定通知書公費情報コンフィグキー
     */
    public static ConfigKeysSaishinsaKetteiTuchi_Kohi toValue(RString fullname) {

        for (ConfigKeysSaishinsaKetteiTuchi_Kohi value : ConfigKeysSaishinsaKetteiTuchi_Kohi.values()) {
            if (value.get名称().equals(fullname)) {
                return value;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("介護給付費再審査決定通知書公費情報コンフィグキー"));
    }
}