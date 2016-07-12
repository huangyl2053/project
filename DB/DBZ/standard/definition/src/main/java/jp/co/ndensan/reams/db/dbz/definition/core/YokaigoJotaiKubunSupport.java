/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.definition.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static jp.co.ndensan.reams.db.dbz.definition.core.KoroshoInterfaceShikibetsuCode.V02A;
import static jp.co.ndensan.reams.db.dbz.definition.core.KoroshoInterfaceShikibetsuCode.V06A;
import static jp.co.ndensan.reams.db.dbz.definition.core.KoroshoInterfaceShikibetsuCode.V09A;
import static jp.co.ndensan.reams.db.dbz.definition.core.KoroshoInterfaceShikibetsuCode.V09B;
import static jp.co.ndensan.reams.db.dbz.definition.core.KoroshoInterfaceShikibetsuCode.V99A;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.KoroshoIfShikibetsuCode;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 要介護状態区分のサポートクラスです。
 *
 * @author N8156 宮本 康
 * @jpName
 * @bizDomain
 * @category
 * @subCategory
 * @mainClass
 * @reference
 */
public final class YokaigoJotaiKubunSupport {

    /**
     * インスタンス化を防ぐためのプライベートコンストラクタです。
     */
    private YokaigoJotaiKubunSupport() {
    }

    /**
     * 厚労省インターフェース識別コードに対応する要介護状態区分の中からコードに対応する列挙型を返します。
     *
     * @param koroshoIfCode 厚労省インターフェース識別コード
     * @param code コード
     * @return 要介護状態区分
     * @throws IllegalArgumentException 変換不可の場合
     */
    public static IYokaigoJotaiKubun toValue(KoroshoInterfaceShikibetsuCode koroshoIfCode, RString code) throws IllegalArgumentException {
        switch (koroshoIfCode) {
            case V09B:
                return YokaigoJotaiKubun09B.toValue(code);
            case V09A:
                return YokaigoJotaiKubun09A.toValue(code);
            case V06A:
                return YokaigoJotaiKubun06A.toValue(code);
            case V02A:
                return YokaigoJotaiKubun02A.toValue(code);
            case V99A:
                return YokaigoJotaiKubun99A.toValue(code);
            default:
                throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("要介護状態区分"));
        }
    }

    /**
     * 基準日時点の要介護状態区分の中からコードに対応する列挙型を返します。
     *
     * @param 基準日 基準日
     * @param code コード
     * @return 要介護状態区分
     * @throws IllegalArgumentException 変換不可の場合
     */
    public static IYokaigoJotaiKubun toValue(FlexibleDate 基準日, RString code) throws IllegalArgumentException {
        if (KoroshoInterfaceShikibetsuCode.V09B.isValidOn(基準日)) {
            return YokaigoJotaiKubun09B.toValue(code);
        } else if (KoroshoInterfaceShikibetsuCode.V09A.isValidOn(基準日)) {
            return YokaigoJotaiKubun09A.toValue(code);
        } else if (KoroshoInterfaceShikibetsuCode.V06A.isValidOn(基準日)) {
            return YokaigoJotaiKubun06A.toValue(code);
        } else if (KoroshoInterfaceShikibetsuCode.V02A.isValidOn(基準日)) {
            return YokaigoJotaiKubun02A.toValue(code);
        } else if (KoroshoInterfaceShikibetsuCode.V99A.isValidOn(基準日)) {
            return YokaigoJotaiKubun99A.toValue(code);
        } else {
            throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("要介護状態区分"));
        }
    }

    /**
     * 基準年月時点の要介護状態区分の中からコードに対応する列挙型を返します。
     *
     * @param 基準年月 基準年月
     * @param code コード
     * @return 要介護状態区分
     * @throws IllegalArgumentException 変換不可の場合
     */
    public static IYokaigoJotaiKubun toValue(FlexibleYearMonth 基準年月, RString code) throws IllegalArgumentException {
        return toValue(new FlexibleDate(基準年月.toDateString()), code);
    }

    /**
     * 指定の厚労省IF識別コードに該当する要介護状態区分をすべて返却します。
     *
     * @param koroshoIfCode 厚労省IF識別コード
     * @return 該当する要介護状態区分すべて
     */
    public static List<IYokaigoJotaiKubun> values(KoroshoIfShikibetsuCode koroshoIfCode) {
        switch (koroshoIfCode) {
            case 認定ｿﾌﾄ2009_SP3:
                return Arrays.<IYokaigoJotaiKubun>asList(YokaigoJotaiKubun09B.values());
            case 認定ｿﾌﾄ2009:
                return Arrays.<IYokaigoJotaiKubun>asList(YokaigoJotaiKubun09A.values());
            case 認定ｿﾌﾄ2006_新要介護認定適用区分が未適用:
                return Arrays.<IYokaigoJotaiKubun>asList(YokaigoJotaiKubun06A.values());
            case 認定ｿﾌﾄ2002:
                return Arrays.<IYokaigoJotaiKubun>asList(YokaigoJotaiKubun02A.values());
            case 認定ｿﾌﾄ99:
                return Arrays.<IYokaigoJotaiKubun>asList(YokaigoJotaiKubun99A.values());
            default:
                return Collections.emptyList();
        }
    }
}
