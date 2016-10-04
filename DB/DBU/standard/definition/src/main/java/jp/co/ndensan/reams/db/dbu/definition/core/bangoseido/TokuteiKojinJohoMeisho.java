package jp.co.ndensan.reams.db.dbu.definition.core.bangoseido;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 特定個人情報名称を表す列挙型です。
 *
 * @reamsid_L DBU-9999-023 sunhaidi
 */
public enum TokuteiKojinJohoMeisho {

    /**
     * コード:04 名称:介護保険法における保険給付の支給若しくは保険料の徴収に関する情報 略称:定義なし
     */
    介護保険法における保険給付の支給若しくは保険料の徴収に関する情報("04", "介護保険法における保険給付の支給若しくは保険料の徴収に関する情報"),

    /**
     * コード:33 名称:国民健康保険法第五十六条第一項に規定する他の法令による給付の支給に関する情報 略称:定義なし
     */
    国民健康保険法第五十六条第一項に規定する他の法令による給付の支給に関する情報("33", "国民健康保険法第五十六条第一項に規定する他の法令による給付の支給に関する情報"),

    /**
     * コード:34 名称:健康保険法第五十五条に規定する他の法令による給付の支給に関する情報 略称:定義なし
     */
    健康保険法第五十五条に規定する他の法令による給付の支給に関する情報("34", "健康保険法第五十五条に規定する他の法令による給付の支給に関する情報"),

    /**
     * コード:35 名称:健康保険法第百二十八条に規定する他の法令による給付の支給に関する情報 略称:定義なし
     */
    健康保険法第百二十八条に規定する他の法令による給付の支給に関する情報("35", "健康保険法第百二十八条に規定する他の法令による給付の支給に関する情報"),

    /**
     * コード:36 名称:高齢者の医療の確保に関する法律第百五十七条第一項に規定する他の法令による給付の支給に関する情報 略称:定義なし
     */
    高齢者の医療の確保に関する法律第百五十七条第一項に規定する他の法令による給付の支給に関する情報("36", "高齢者の医療の確保に関する法律第百五十七条第一項に規定する他の法令による給付の支給に関する情報"),

    /**
     * コード:37 名称:障害者の日常生活及び社会生活を総合的に支援するための法律第七条に規定する他の法令により行われる給付の支給に関する情報 略称:定義なし
     */
    障害者の日常生活及び社会生活を総合的に支援するための法律第七条に規定する他の法令により行われる給付の支給に関する情報("37", "障害者の日常生活及び社会生活を総合的に支援するための法律第七条に規定する他の法令により行われる給付の支給に関する情報"),

    /**
     * コード:44 名称:船員保険法第三十三条に規定する他の法令による給付の支給に関する情報 略称:定義なし
     */
    船員保険法第三十三条に規定する他の法令による給付の支給に関する情報("44", "船員保険法第三十三条に規定する他の法令による給付の支給に関する情報"),

    /**
     * コード:46 名称:精神保健及び精神障害者福祉に関する法律第三十条の二に規定する他の法律による医療に関する給付の支給に関する情報 略称:定義なし
     */
    精神保健及び精神障害者福祉に関する法律第三十条の二に規定する他の法律による医療に関する給付の支給に関する情報("46", "精神保健及び精神障害者福祉に関する法律第三十条の二に規定する他の法律による医療に関する給付の支給に関する情報"),

    /**
     * コード:47 名称:感染症の予防及び感染症の患者に対する医療に関する法律第三十九条第一項に規定する他の法律による医療に関する給付の支給に関する情報 略称:定義なし
     */
    感染症の予防及び感染症の患者に対する医療に関する法律第三十九条第一項に規定する他の法律による医療に関する給付の支給に関する情報("47", "感染症の予防及び感染症の患者に対する医療に関する法律第三十九条第一項に規定する他の法律による医療に関する給付の支給に関する情報"),

    /**
     * コード:50 名称:医療保険各法その他の法令による医療に関する給付の支給に関する情報 略称:定義なし
     */
    医療保険各法その他の法令による医療に関する給付の支給に関する情報("50", "医療保険各法その他の法令による医療に関する給付の支給に関する情報"),

    /**
     * コード:83 名称:難病の患者に対する医療等に関する法律第十二条に規定する他の法令による給付の支給に関する情報 略称:定義なし
     */
    難病の患者に対する医療等に関する法律第十二条に規定する他の法令による給付の支給に関する情報("83", "難病の患者に対する医療等に関する法律第十二条に規定する他の法令による給付の支給に関する情報");

    private final RString code;
    private final RString fullName;

    private TokuteiKojinJohoMeisho(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 特定個人情報名称のコードを返します。
     *
     * @return 特定個人情報名称のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 特定個人情報名称の名称を返します。
     *
     * @return 特定個人情報名称の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 特定個人情報名称のコードと一致する内容を探します。
     *
     * @param code 特定個人情報名称のコード
     * @return {@code code} に対応する特定個人情報名称
     */
    public static TokuteiKojinJohoMeisho toValue(RString code) {
        for (TokuteiKojinJohoMeisho tokuteiKojinJohoMeisho : TokuteiKojinJohoMeisho.values()) {
            if (tokuteiKojinJohoMeisho.code.equals(code)) {
                return tokuteiKojinJohoMeisho;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getMessage());
    }
}