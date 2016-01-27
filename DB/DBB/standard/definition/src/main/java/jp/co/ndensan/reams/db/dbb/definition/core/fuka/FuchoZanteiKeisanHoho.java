package jp.co.ndensan.reams.db.dbb.definition.core.fuka;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 普徴仮算定計算方法を表す列挙型です。
 *
 * @author LDNS
 */
public enum FuchoZanteiKeisanHoho {

    /**
     * コード:00 名称:仮算定賦課なし 略称:仮算定賦課なし
     */
    仮算定賦課なし("00", "仮算定賦課なし", "仮算定賦課なし"),
    /**
     * コード:01 名称:前年度最終期の保険料額 略称:前年度・最終期保険料額
     */
    前年度_最終期保険料額("01", "前年度最終期の保険料額", "前年度・最終期保険料額"),
    /**
     * コード:02 名称:前年度末時点での基準年額保険料_月割前年額保険料_を今年度の納期数で除す 略称:前年度末・基準年額／今納期数
     */
    前年度末_基準年額_今納期数("02", "前年度末時点での基準年額保険料_月割前年額保険料_を今年度の納期数で除す", "前年度末・基準年額／今納期数"),
    /**
     * コード:03 名称:前年度末時点での基準年額保険料_月割前年額保険料_を前年度の納期数で除す 略称:前年度末・基準年額／前納期数
     */
    前年度末_基準年額_前納期数("03", "前年度末時点での基準年額保険料_月割前年額保険料_を前年度の納期数で除す", "前年度末・基準年額／前納期数"),
    /**
     * コード:04 名称:前年度の確定年額保険料_月割後年額保険料_を今年度の納期数で除す 略称:前年度・確定年額／今納期数
     */
    前年度_確定年額_今納期数("04", "前年度の確定年額保険料_月割後年額保険料_を今年度の納期数で除す", "前年度・確定年額／今納期数"),
    /**
     * コード:05 名称:前年度の確定年額保険料_月割後年額保険料_を前年度の納期数_全納期数_で除す 略称:前年度・確定年額／前納期数（全納期数）
     */
    前年度_確定年額_前納期数_全納期数("05", "前年度の確定年額保険料_月割後年額保険料_を前年度の納期数_全納期数_で除す", "前年度・確定年額／前納期数（全納期数）"),
    /**
     * コード:06 名称:前年度の確定年額保険料_月割後年額保険料_を前年度の納期数_賦課納期数_で除す 略称:前年度・確定年額／前納期数（賦課納期数）
     */
    前年度_確定年額_前納期数_賦課納期数("06", "前年度の確定年額保険料_月割後年額保険料_を前年度の納期数_賦課納期数_で除す", "前年度・確定年額／前納期数（賦課納期数）"),
    /**
     * コード:07 名称:前年度末時点の所得段階に応じた今年度基準年額保険料を今年度納期数で除す 略称:今年度・基準年額／今納期数
     */
    今年度_基準年額_今納期数("07", "前年度末時点の所得段階に応じた今年度基準年額保険料を今年度納期数で除す", "今年度・基準年額／今納期数"),
    /**
     * コード:08 名称:前年度末時点での基準年額保険料に3分の4を乗じた額を今年度の納期数で除す 略称:前年度・基準年額乗３分の４／今納期数
     */
    前年度_基準年額乗３分の４_今納期数("08", "前年度末時点での基準年額保険料に3分の4を乗じた額を今年度の納期数で除す", "前年度・基準年額乗３分の４／今納期数"),
    /**
     * コード:09 名称:前年度の確定年額保険料に3分の4を乗じた額を今年度の納期数で除す 略称:前年度・確定年額乗３分の４／今納期数
     */
    前年度_確定年額乗３分の４_今納期数("09", "前年度の確定年額保険料に3分の4を乗じた額を今年度の納期数で除す", "前年度・確定年額乗３分の４／今納期数"),
    /**
     * コード:10 名称:今年度の基準年額保険料を今年度の納期数で除す_前年度の所得情報より段階補正 略称:今年度・基準年額／今納期数(段階補正)
     */
    今年度_基準年額_今納期数_段階補正("10", "今年度の基準年額保険料を今年度の納期数で除す_前年度の所得情報より段階補正", "今年度・基準年額／今納期数(段階補正)"),
    /**
     * コード:11 名称:前年度所得_今年度賦課期日に応じた基準年額保険料を今年度納期数で除す 略称:今年度・基準年額（前年度所得・今年度賦課期日）／今納期数(段階補正)
     */
    今年度_基準年額_前年度所得_今年度賦課期日__今納期数_段階補正("11", "前年度所得_今年度賦課期日に応じた基準年額保険料を今年度納期数で除す", "今年度・基準年額（前年度所得・今年度賦課期日）／今納期数(段階補正)"),
    /**
     * コード:12 名称:一律_今年度基準年額保険料を今納期数で除す 略称:今年度・基準年額／今納期数（一律）
     */
    今年度_基準年額_今納期数_一律("12", "一律_今年度基準年額保険料を今納期数で除す", "今年度・基準年額／今納期数（一律）"),
    /**
     * コード:91 名称:千代田区独自算定 略称:千代田区独自算定
     */
    千代田区独自算定("91", "千代田区独自算定", "千代田区独自算定"),
    /**
     * コード:99 名称:その他 略称:その他
     */
    その他("99", "その他", "その他");

    private final RString code;
    private final RString fullName;
    private final RString shortName;

    private FuchoZanteiKeisanHoho(String code, String fullname, String shortName) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
        this.shortName = new RString(shortName);
    }

    /**
     * 普徴仮算定計算方法のコードを返します。
     *
     * @return 普徴仮算定計算方法のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 普徴仮算定計算方法の名称を返します。
     *
     * @return 普徴仮算定計算方法の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 普徴仮算定計算方法の略称を返します。
     *
     * @return 普徴仮算定計算方法の略称
     */
    public RString get略称() {
        return shortName;
    }

    /**
     * 普徴仮算定計算方法のコードと一致する内容を探します。
     *
     * @param code 普徴仮算定計算方法のコード
     * @return {@code code} に対応する普徴仮算定計算方法
     */
    public static FuchoZanteiKeisanHoho toValue(RString code) {
        for (FuchoZanteiKeisanHoho fuchoZanteiKeisanHoho : FuchoZanteiKeisanHoho.values()) {
            if (fuchoZanteiKeisanHoho.code.equals(code)) {
                return fuchoZanteiKeisanHoho;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("普徴仮算定計算方法"));
    }
}
