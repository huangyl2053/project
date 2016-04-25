package jp.co.ndensan.reams.db.dbz.definition.core.ninteichosahyou;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 認定調査票09A（センター送信_項番）を表す列挙型です。
 *
 * @reamsid_L DBZ-9999-023 wangchao
 */
public enum NinteichosaCenterSoshinMapping09A {

    /**
     * コード:95 名称:麻痺等の有無（左上肢） 略称:定義なし
     */
    麻痺等_左上肢("95", "麻痺等の有無（左上肢）"),
    /**
     * コード:96 名称:麻痺等の有無（右上肢） 略称:定義なし
     */
    麻痺等_右上肢("96", "麻痺等の有無（右上肢）"),
    /**
     * コード:97 名称:麻痺等の有無（左下肢） 略称:定義なし
     */
    麻痺等_左下肢("97", "麻痺等の有無（左下肢）"),
    /**
     * コード:98 名称:麻痺等の有無（右下肢） 略称:定義なし
     */
    麻痺等_右下肢("98", "麻痺等の有無（右下肢）"),
    /**
     * コード:99 名称:麻痺等の有無（その他） 略称:定義なし
     */
    麻痺等_その他("99", "麻痺等の有無（その他）"),
    /**
     * コード:100 名称:拘縮の有無（肩関節） 略称:定義なし
     */
    拘縮_肩関節("100", "拘縮の有無（肩関節）"),
    /**
     * コード:101 名称:拘縮の有無（股関節） 略称:定義なし
     */
    拘縮_股関節("101", "拘縮の有無（股関節）"),
    /**
     * コード:102 名称:拘縮の有無（膝関節） 略称:定義なし
     */
    拘縮_膝関節("102", "拘縮の有無（膝関節）"),
    /**
     * コード:103 名称:拘縮の有無（その他） 略称:定義なし
     */
    拘縮_その他("103", "拘縮の有無（その他）"),
    /**
     * コード:104 名称:寝返り 略称:定義なし
     */
    寝返り("104", "寝返り"),
    /**
     * コード:105 名称:起き上がり 略称:定義なし
     */
    起き上がり("105", "起き上がり"),
    /**
     * コード:106 名称:座位保持 略称:定義なし
     */
    座位保持("106", "座位保持"),
    /**
     * コード:107 名称:両足での立位 略称:定義なし
     */
    両足での立位("107", "両足での立位"),
    /**
     * コード:108 名称:歩行 略称:定義なし
     */
    歩行("108", "歩行"),
    /**
     * コード:109 名称:立ち上がり 略称:定義なし
     */
    立ち上がり("109", "立ち上がり"),
    /**
     * コード:110 名称:片足での立位 略称:定義なし
     */
    片足での立位("110", "片足での立位"),
    /**
     * コード:111 名称:洗身 略称:定義なし
     */
    洗身("111", "洗身"),
    /**
     * コード:112 名称:つめ切り 略称:定義なし
     */
    つめ切り("112", "つめ切り"),
    /**
     * コード:113 名称:視力 略称:定義なし
     */
    視力("113", "視力"),
    /**
     * コード:114 名称:聴力 略称:定義なし
     */
    聴力("114", "聴力"),
    /**
     * コード:115 名称:移乗 略称:定義なし
     */
    移乗("115", "移乗"),
    /**
     * コード:116 名称:移動 略称:定義なし
     */
    移動("116", "移動"),
    /**
     * コード:117 名称:嚥下 略称:定義なし
     */
    嚥下("117", "嚥下"),
    /**
     * コード:118 名称:食事摂取 略称:定義なし
     */
    食事摂取("118", "食事摂取"),
    /**
     * コード:119 名称:排尿 略称:定義なし
     */
    排尿("119", "排尿"),
    /**
     * コード:120 名称:排便 略称:定義なし
     */
    排便("120", "排便"),
    /**
     * コード:121 名称:口腔清潔 略称:定義なし
     */
    口腔清潔("121", "口腔清潔"),
    /**
     * コード:122 名称:洗顔 略称:定義なし
     */
    洗顔("122", "洗顔"),
    /**
     * コード:123 名称:整髪 略称:定義なし
     */
    整髪("123", "整髪"),
    /**
     * コード:124 名称:上衣の着脱 略称:定義なし
     */
    上衣の着脱("124", "上衣の着脱"),
    /**
     * コード:125 名称:ズボン等の着脱 略称:定義なし
     */
    ズボン等の着脱("125", "ズボン等の着脱"),
    /**
     * コード:126 名称:外出頻度 略称:定義なし
     */
    外出頻度("126", "外出頻度"),
    /**
     * コード:127 名称:意思の伝達 略称:定義なし
     */
    意思の伝達("127", "意思の伝達"),
    /**
     * コード:128 名称:毎日の日課を理解 略称:定義なし
     */
    毎日の日課を理解("128", "毎日の日課を理解"),
    /**
     * コード:129 名称:生年月日をいう 略称:定義なし
     */
    生年月日をいう("129", "生年月日をいう"),
    /**
     * コード:130 名称:短期記憶 略称:定義なし
     */
    短期記憶("130", "短期記憶"),
    /**
     * コード:131 名称:自分の名前をいう 略称:定義なし
     */
    自分の名前をいう("131", "自分の名前をいう"),
    /**
     * コード:132 名称:今の季節を理解 略称:定義なし
     */
    今の季節を理解("132", "今の季節を理解"),
    /**
     * コード:133 名称:場所の理解 略称:定義なし
     */
    場所の理解("133", "場所の理解"),
    /**
     * コード:134 名称:常時の徘徊 略称:定義なし
     */
    常時の徘徊("134", "常時の徘徊"),
    /**
     * コード:135 名称:外出して戻れない 略称:定義なし
     */
    外出して戻れない("135", "外出して戻れない"),
    /**
     * コード:136 名称:被害的 略称:定義なし
     */
    被害的("136", "被害的"),
    /**
     * コード:137 名称:作話 略称:定義なし
     */
    作話("137", "作話"),
    /**
     * コード:138 名称:感情が不安定 略称:定義なし
     */
    感情が不安定("138", "感情が不安定"),
    /**
     * コード:139 名称:昼夜逆転 略称:定義なし
     */
    昼夜逆転("139", "昼夜逆転"),
    /**
     * コード:140 名称:同じ話をする 略称:定義なし
     */
    同じ話をする("140", "同じ話をする"),
    /**
     * コード:141 名称:大声を出す 略称:定義なし
     */
    大声を出す("141", "大声を出す"),
    /**
     * コード:142 名称:介護に抵抗 略称:定義なし
     */
    介護に抵抗("142", "介護に抵抗"),
    /**
     * コード:143 名称:落ち着きなし 略称:定義なし
     */
    落ち着きなし("143", "落ち着きなし"),
    /**
     * コード:144 名称:一人で出たがる 略称:定義なし
     */
    一人で出たがる("144", "一人で出たがる"),
    /**
     * コード:145 名称:収集癖 略称:定義なし
     */
    収集癖("145", "収集癖"),
    /**
     * コード:146 名称:物や衣類を壊す 略称:定義なし
     */
    物や衣類を壊す("146", "物や衣類を壊す"),
    /**
     * コード:147 名称:ひどい物忘れ 略称:定義なし
     */
    ひどい物忘れ("147", "ひどい物忘れ"),
    /**
     * コード:148 名称:独り言・独り笑い 略称:定義なし
     */
    独り言_独り笑い("148", "独り言・独り笑い"),
    /**
     * コード:149 名称:自分勝手に行動する 略称:定義なし
     */
    自分勝手に行動する("149", "自分勝手に行動する"),
    /**
     * コード:150 名称:話がまとまらない 略称:定義なし
     */
    話がまとまらない("150", "話がまとまらない"),
    /**
     * コード:151 名称:薬の内服 略称:定義なし
     */
    薬の内服("151", "薬の内服"),
    /**
     * コード:152 名称:金銭の管理 略称:定義なし
     */
    金銭の管理("152", "金銭の管理"),
    /**
     * コード:153 名称:日常の意思決定 略称:定義なし
     */
    日常の意思決定("153", "日常の意思決定"),
    /**
     * コード:154 名称:集団への不適応 略称:定義なし
     */
    集団への不適応("154", "集団への不適応"),
    /**
     * コード:155 名称:買い物 略称:定義なし
     */
    買い物("155", "買い物"),
    /**
     * コード:156 名称:簡単な調理 略称:定義なし
     */
    簡単な調理("156", "簡単な調理"),
    /**
     * コード:157 名称:処置内容（点滴の管理） 略称:定義なし
     */
    点滴の管理("157", "処置内容（点滴の管理）"),
    /**
     * コード:158 名称:処置内容（中心静脈栄養） 略称:定義なし
     */
    中心静脈栄養("158", "処置内容（中心静脈栄養）"),
    /**
     * コード:159 名称:処置内容（透析） 略称:定義なし
     */
    透析("159", "処置内容（透析）"),
    /**
     * コード:160 名称:処置内容（ストーマの処置） 略称:定義なし
     */
    ストーマの処置("160", "処置内容（ストーマの処置）"),
    /**
     * コード:161 名称:処置内容（酸素療法） 略称:定義なし
     */
    酸素療法("161", "処置内容（酸素療法）"),
    /**
     * コード:162 名称:処置内容（レスピレーター） 略称:定義なし
     */
    レスピレーター("162", "処置内容（レスピレーター）"),
    /**
     * コード:163 名称:処置内容（気管切開の処置） 略称:定義なし
     */
    気管切開の処置("163", "処置内容（気管切開の処置）"),
    /**
     * コード:164 名称:処置内容（疼痛の看護） 略称:定義なし
     */
    疼痛の看護("164", "処置内容（疼痛の看護）"),
    /**
     * コード:165 名称:処置内容（経管栄養） 略称:定義なし
     */
    経管栄養("165", "処置内容（経管栄養）"),
    /**
     * コード:166 名称:特別な対応（モニター測定） 略称:定義なし
     */
    モニター測定("166", "特別な対応（モニター測定）"),
    /**
     * コード:167 名称:特別な対応（じょくそうの処置） 略称:定義なし
     */
    じょくそうの処置("167", "特別な対応（じょくそうの処置）"),
    /**
     * コード:168 名称:失禁への対応（カテーテル） 略称:定義なし
     */
    カテーテル("168", "失禁への対応（カテーテル）");

    private final RString code;
    private final RString fullName;

    private NinteichosaCenterSoshinMapping09A(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 認定調査票09A（センター送信_項番）のコードを返します。
     *
     * @return 認定調査票09A（センター送信_項番）のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 認定調査票09A（センター送信_項番）の名称を返します。
     *
     * @return 認定調査票09A（センター送信_項番）の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 認定調査票09A（センター送信_項番）のコードと一致する内容を探します。
     *
     * @param code 認定調査票09A（センター送信_項番）のコード
     * @return {@code code} に対応する認定調査票09A（センター送信_項番）
     */
    public static NinteichosaCenterSoshinMapping09A toValue(RString code) {
        for (NinteichosaCenterSoshinMapping09A value : NinteichosaCenterSoshinMapping09A.values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("認定調査票09A（センター送信_項番）"));
    }
}
