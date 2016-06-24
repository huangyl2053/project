package jp.co.ndensan.reams.db.dbz.definition.core.ninteichosahyou;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 認定調査票09A（データベース内連番）を表す列挙型です。
 *
 * @reamsid_L DBZ-9999-023 wangchao
 */
public enum NinteichosaKomokuMapping09A {

    /**
     * コード:1 名称:麻痺等の有無（左上肢） 略称:定義なし
     */
    麻痺等_左上肢("1", "麻痺等の有無（左上肢）"),
    /**
     * コード:2 名称:麻痺等の有無（右上肢） 略称:定義なし
     */
    麻痺等_右上肢("2", "麻痺等の有無（右上肢）"),
    /**
     * コード:3 名称:麻痺等の有無（左下肢） 略称:定義なし
     */
    麻痺等_左下肢("3", "麻痺等の有無（左下肢）"),
    /**
     * コード:4 名称:麻痺等の有無（右下肢） 略称:定義なし
     */
    麻痺等_右下肢("4", "麻痺等の有無（右下肢）"),
    /**
     * コード:5 名称:麻痺等の有無（その他） 略称:定義なし
     */
    麻痺等_その他("5", "麻痺等の有無（その他）"),
    /**
     * コード:6 名称:拘縮の有無（肩関節） 略称:定義なし
     */
    拘縮_肩関節("6", "拘縮の有無（肩関節）"),
    /**
     * コード:7 名称:拘縮の有無（股関節） 略称:定義なし
     */
    拘縮_股関節("7", "拘縮の有無（股関節）"),
    /**
     * コード:8 名称:拘縮の有無（膝関節） 略称:定義なし
     */
    拘縮_膝関節("8", "拘縮の有無（膝関節）"),
    /**
     * コード:9 名称:拘縮の有無（その他） 略称:定義なし
     */
    拘縮_その他("9", "拘縮の有無（その他）"),
    /**
     * コード:10 名称:寝返り 略称:定義なし
     */
    寝返り("10", "寝返り"),
    /**
     * コード:11 名称:起き上がり 略称:定義なし
     */
    起き上がり("11", "起き上がり"),
    /**
     * コード:12 名称:座位保持 略称:定義なし
     */
    座位保持("12", "座位保持"),
    /**
     * コード:13 名称:両足での立位 略称:定義なし
     */
    両足での立位("13", "両足での立位"),
    /**
     * コード:14 名称:歩行 略称:定義なし
     */
    歩行("14", "歩行"),
    /**
     * コード:15 名称:立ち上がり 略称:定義なし
     */
    立ち上がり("15", "立ち上がり"),
    /**
     * コード:16 名称:片足での立位 略称:定義なし
     */
    片足での立位("16", "片足での立位"),
    /**
     * コード:17 名称:洗身 略称:定義なし
     */
    洗身("17", "洗身"),
    /**
     * コード:18 名称:つめ切り 略称:定義なし
     */
    つめ切り("18", "つめ切り"),
    /**
     * コード:19 名称:視力 略称:定義なし
     */
    視力("19", "視力"),
    /**
     * コード:20 名称:聴力 略称:定義なし
     */
    聴力("20", "聴力"),
    /**
     * コード:21 名称:移乗 略称:定義なし
     */
    移乗("21", "移乗"),
    /**
     * コード:22 名称:移動 略称:定義なし
     */
    移動("22", "移動"),
    /**
     * コード:23 名称:嚥下 略称:定義なし
     */
    えん下("23", "嚥下"),
    /**
     * コード:24 名称:食事摂取 略称:定義なし
     */
    食事摂取("24", "食事摂取"),
    /**
     * コード:25 名称:排尿 略称:定義なし
     */
    排尿("25", "排尿"),
    /**
     * コード:26 名称:排便 略称:定義なし
     */
    排便("26", "排便"),
    /**
     * コード:27 名称:口腔清潔 略称:定義なし
     */
    口腔清潔("27", "口腔清潔"),
    /**
     * コード:28 名称:洗顔 略称:定義なし
     */
    洗顔("28", "洗顔"),
    /**
     * コード:29 名称:整髪 略称:定義なし
     */
    整髪("29", "整髪"),
    /**
     * コード:30 名称:上衣の着脱 略称:定義なし
     */
    上衣の着脱("30", "上衣の着脱"),
    /**
     * コード:31 名称:ズボン等の着脱 略称:定義なし
     */
    ズボン等の着脱("31", "ズボン等の着脱"),
    /**
     * コード:32 名称:外出頻度 略称:定義なし
     */
    外出頻度("32", "外出頻度"),
    /**
     * コード:33 名称:意思の伝達 略称:定義なし
     */
    意思の伝達("33", "意思の伝達"),
    /**
     * コード:34 名称:毎日の日課を理解 略称:定義なし
     */
    毎日の日課を理解("34", "毎日の日課を理解"),
    /**
     * コード:35 名称:生年月日をいう 略称:定義なし
     */
    生年月日をいう("35", "生年月日をいう"),
    /**
     * コード:36 名称:短期記憶 略称:定義なし
     */
    短期記憶("36", "短期記憶"),
    /**
     * コード:37 名称:自分の名前をいう 略称:定義なし
     */
    自分の名前をいう("37", "自分の名前をいう"),
    /**
     * コード:38 名称:今の季節を理解 略称:定義なし
     */
    今の季節を理解("38", "今の季節を理解"),
    /**
     * コード:39 名称:場所の理解 略称:定義なし
     */
    場所の理解("39", "場所の理解"),
    /**
     * コード:40 名称:常時の徘徊 略称:定義なし
     */
    常時の徘徊("40", "常時の徘徊"),
    /**
     * コード:41 名称:外出して戻れない 略称:定義なし
     */
    外出して戻れない("41", "外出して戻れない"),
    /**
     * コード:42 名称:被害的 略称:定義なし
     */
    被害的("42", "被害的"),
    /**
     * コード:43 名称:作話 略称:定義なし
     */
    作話("43", "作話"),
    /**
     * コード:44 名称:感情が不安定 略称:定義なし
     */
    感情が不安定("44", "感情が不安定"),
    /**
     * コード:45 名称:昼夜逆転 略称:定義なし
     */
    昼夜逆転("45", "昼夜逆転"),
    /**
     * コード:46 名称:同じ話をする 略称:定義なし
     */
    同じ話をする("46", "同じ話をする"),
    /**
     * コード:47 名称:大声を出す 略称:定義なし
     */
    大声を出す("47", "大声を出す"),
    /**
     * コード:48 名称:介護に抵抗 略称:定義なし
     */
    介護に抵抗("48", "介護に抵抗"),
    /**
     * コード:49 名称:落ち着きなし 略称:定義なし
     */
    落ち着きなし("49", "落ち着きなし"),
    /**
     * コード:50 名称:一人で出たがる 略称:定義なし
     */
    一人で出たがる("50", "一人で出たがる"),
    /**
     * コード:51 名称:収集癖 略称:定義なし
     */
    収集癖("51", "収集癖"),
    /**
     * コード:52 名称:物や衣類を壊す 略称:定義なし
     */
    物や衣類を壊す("52", "物や衣類を壊す"),
    /**
     * コード:53 名称:ひどい物忘れ 略称:定義なし
     */
    ひどい物忘れ("53", "ひどい物忘れ"),
    /**
     * コード:54 名称:独り言・独り笑い 略称:定義なし
     */
    独り言_独り笑い("54", "独り言・独り笑い"),
    /**
     * コード:55 名称:自分勝手に行動する 略称:定義なし
     */
    自分勝手に行動する("55", "自分勝手に行動する"),
    /**
     * コード:56 名称:話がまとまらない 略称:定義なし
     */
    話がまとまらない("56", "話がまとまらない"),
    /**
     * コード:57 名称:薬の内服 略称:定義なし
     */
    薬の内服("57", "薬の内服"),
    /**
     * コード:58 名称:金銭の管理 略称:定義なし
     */
    金銭の管理("58", "金銭の管理"),
    /**
     * コード:59 名称:日常の意思決定 略称:定義なし
     */
    日常の意思決定("59", "日常の意思決定"),
    /**
     * コード:60 名称:集団への不適応 略称:定義なし
     */
    集団への不適応("60", "集団への不適応"),
    /**
     * コード:61 名称:買い物 略称:定義なし
     */
    買い物("61", "買い物"),
    /**
     * コード:62 名称:簡単な調理 略称:定義なし
     */
    簡単な調理("62", "簡単な調理"),
    /**
     * コード:63 名称:処置内容（点滴の管理） 略称:定義なし
     */
    点滴の管理("63", "処置内容（点滴の管理）"),
    /**
     * コード:64 名称:処置内容（中心静脈栄養） 略称:定義なし
     */
    中心静脈栄養("64", "処置内容（中心静脈栄養）"),
    /**
     * コード:65 名称:処置内容（透析） 略称:定義なし
     */
    透析("65", "処置内容（透析）"),
    /**
     * コード:66 名称:処置内容（ストーマの処置） 略称:定義なし
     */
    ストーマの処置("66", "処置内容（ストーマの処置）"),
    /**
     * コード:67 名称:処置内容（酸素療法） 略称:定義なし
     */
    酸素療法("67", "処置内容（酸素療法）"),
    /**
     * コード:68 名称:処置内容（レスピレーター） 略称:定義なし
     */
    レスピレーター("68", "処置内容（レスピレーター）"),
    /**
     * コード:69 名称:処置内容（気管切開の処置） 略称:定義なし
     */
    気管切開の処置("69", "処置内容（気管切開の処置）"),
    /**
     * コード:70 名称:処置内容（疼痛の看護） 略称:定義なし
     */
    疼痛の看護("70", "処置内容（疼痛の看護）"),
    /**
     * コード:71 名称:処置内容（経管栄養） 略称:定義なし
     */
    経管栄養("71", "処置内容（経管栄養）"),
    /**
     * コード:72 名称:特別な対応（モニター測定） 略称:定義なし
     */
    モニター測定("72", "特別な対応（モニター測定）"),
    /**
     * コード:73 名称:特別な対応（じょくそうの処置） 略称:定義なし
     */
    じょくそうの処置("73", "特別な対応（じょくそうの処置）"),
    /**
     * コード:74 名称:失禁への対応（カテーテル） 略称:定義なし
     */
    カテーテル("74", "失禁への対応（カテーテル）");

    private final RString code;
    private final RString fullName;

    private NinteichosaKomokuMapping09A(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 認定調査票09A（データベース内連番）のコードを返します。
     *
     * @return 認定調査票09A（データベース内連番）のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 認定調査票09A（データベース内連番）の名称を返します。
     *
     * @return 認定調査票09A（データベース内連番）の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 認定調査票09A（データベース内連番）のコードと一致する内容を探します。
     *
     * @param code 認定調査票09A（データベース内連番）のコード
     * @return {@code code} に対応する認定調査票09A（データベース内連番）
     */
    public static NinteichosaKomokuMapping09A toValue(RString code) {
        for (NinteichosaKomokuMapping09A ninteichosaKomokuMapping09A : NinteichosaKomokuMapping09A.values()) {
            if (ninteichosaKomokuMapping09A.code.equals(code)) {
                return ninteichosaKomokuMapping09A;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage(" 認定調査票09A（データベース内連番）"));
    }
}
