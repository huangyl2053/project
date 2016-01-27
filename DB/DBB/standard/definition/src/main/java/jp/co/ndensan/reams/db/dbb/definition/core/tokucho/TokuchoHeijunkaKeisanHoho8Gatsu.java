package jp.co.ndensan.reams.db.dbb.definition.core.tokucho;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 特別徴収平準化計算方法8月分を表す列挙型です。
 *
 * @author LDNS
 */
public enum TokuchoHeijunkaKeisanHoho8Gatsu {

    /**
     * コード:0 名称:平準化しない 略称:平準化しない
     */
    平準化しない("0", "平準化しない", "平準化しない"),
    /**
     * コード:1 名称:前半と後半を1対1にする 略称:前半と後半を１：１にする
     */
    前半と後半を１_１にする("1", "前半と後半を1対1にする", "前半と後半を１：１にする"),
    /**
     * コード:2 名称:年額より特徴3期分を含まない仮徴収額を引いた額を4期で割る 略称:年額より特徴３期分を含まない仮徴収額を引いた額を４期で割る
     */
    年額より特徴３期分を含まない仮徴収額を引いた額を４期で割る("2", "年額より特徴3期分を含まない仮徴収額を引いた額を4期で割る", "年額より特徴３期分を含まない仮徴収額を引いた額を４期で割る");

    private final RString code;
    private final RString fullName;
    private final RString shortName;

    private TokuchoHeijunkaKeisanHoho8Gatsu(String code, String fullname, String shortName) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
        this.shortName = new RString(shortName);
    }

    /**
     * 特別徴収平準化計算方法8月分のコードを返します。
     *
     * @return 特別徴収平準化計算方法8月分のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 特別徴収平準化計算方法8月分の名称を返します。
     *
     * @return 特別徴収平準化計算方法8月分の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 特別徴収平準化計算方法8月分の略称を返します。
     *
     * @return 特別徴収平準化計算方法8月分の略称
     */
    public RString get略称() {
        return shortName;
    }

    /**
     * 特別徴収平準化計算方法8月分のコードと一致する内容を探します。
     *
     * @param code 特別徴収平準化計算方法8月分のコード
     * @return {@code code} に対応する特別徴収平準化計算方法8月分
     */
    public static TokuchoHeijunkaKeisanHoho8Gatsu toValue(RString code) {
        for (TokuchoHeijunkaKeisanHoho8Gatsu value : TokuchoHeijunkaKeisanHoho8Gatsu.values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("特別徴収平準化計算方法8月分"));
    }
}
