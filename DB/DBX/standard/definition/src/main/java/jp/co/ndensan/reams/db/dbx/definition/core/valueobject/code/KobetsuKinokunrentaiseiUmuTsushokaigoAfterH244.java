/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbx.definition.core.valueobject.code;

import java.util.Objects;
import jp.co.ndensan.reams.uz.uza.util.code.ICodeValueObject;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.CodeShubetsu;
import jp.co.ndensan.reams.uz.uza.biz.IValueObject;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.code.CodeMaster;
import jp.co.ndensan.reams.uz.uza.util.db.IDbColumnMappable;

/**
 * 個別機能訓練体制の有無_通所介護_平成24年4月以降を表すドメインクラスです。
 *
 * @author n3317 塚田 萌
 * @jpName 個別機能訓練体制の有無_通所介護_平成24年4月以降
 * @bizDomain
 * @category CodeValueObject
 * @subCategory
 * @mainClass
 * @reference
 */
public class KobetsuKinokunrentaiseiUmuTsushokaigoAfterH244 implements ICodeValueObject, IDbColumnMappable, IValueObject<Code> {

    /**
     * URZ業務共通を表すサブ業務コードです。
     */
    public static final SubGyomuCode SUB_GYOMU_CODE;
    /**
     * 個別機能訓練体制の有無_通所介護_平成24年4月以降を表すコード種別です。
     */
    public static final CodeShubetsu CODE_SHUBETSU;

    private final Code code;

    static {
        SUB_GYOMU_CODE = SubGyomuCode.DBX介護公開;
        CODE_SHUBETSU = DBXCodeShubetsu.個別機能訓練体制の有無_通所介護_平成24年4月以降.getCodeShubetsu();
    }

    /**
     * コンストラクタです。
     *
     * @param code 個別機能訓練体制の有無_通所介護_平成24年4月以降
     */
    public KobetsuKinokunrentaiseiUmuTsushokaigoAfterH244(Code code) {
        this.code = code;
    }

    /**
     * コンストラクタです。
     *
     * @param code 個別機能訓練体制の有無_通所介護_平成24年4月以降を表す文字列
     */
    public KobetsuKinokunrentaiseiUmuTsushokaigoAfterH244(RString code) {
        this.code = new Code(code);
    }

    @Override
    public RString toRString() {
        return code == null ? RString.EMPTY : code.value();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.code);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KobetsuKinokunrentaiseiUmuTsushokaigoAfterH244 other = (KobetsuKinokunrentaiseiUmuTsushokaigoAfterH244) obj;
        return Objects.equals(this.code, other.code);
    }

    @Override
    public String toString() {
        return toRString().toString();
    }

    @Override
    public Code value() {
        return code;
    }

    @Override
    public RString getColumnValue() {
        return value().getColumnValue();
    }

    @Override
    public RString getMeisho() {
        return code == null ? RString.EMPTY : CodeMaster.getCodeMeisho(SUB_GYOMU_CODE, CODE_SHUBETSU, code);
    }

    @Override
    public RString getMeisho(FlexibleDate kijunbi) {
        return code == null ? RString.EMPTY : CodeMaster.getCodeMeisho(SUB_GYOMU_CODE, CODE_SHUBETSU, code, kijunbi);
    }

    @Override
    public RString getRyakusho() {
        return code == null ? RString.EMPTY : CodeMaster.getCodeRyakusho(SUB_GYOMU_CODE, CODE_SHUBETSU, code);
    }

    @Override
    public RString getRyakusho(FlexibleDate kijunbi) {
        return code == null ? RString.EMPTY : CodeMaster.getCodeRyakusho(SUB_GYOMU_CODE, CODE_SHUBETSU, code, kijunbi);
    }
}
