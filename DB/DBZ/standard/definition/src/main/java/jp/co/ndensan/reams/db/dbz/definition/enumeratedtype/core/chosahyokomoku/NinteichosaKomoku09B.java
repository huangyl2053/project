package jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.core.chosahyokomoku;

import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 認定調査特記事項を表す列挙型です。
 *
 */
public enum NinteichosaKomoku09B {

    /**
     * コード:101 名称:麻痺等の有無 略称:1-1
     */
    麻痺等の有無("101", "麻痺等の有無", "1-1"),
    /**
     * コード:102 名称:拘縮の有無 略称:1-2
     */
    拘縮の有無("102", "拘縮の有無", "1-2"),
    /**
     * コード:103 名称:寝返り 略称:1-3
     */
    寝返り("103", "寝返り", "1-3"),
    /**
     * コード:104 名称:起き上がり 略称:1-4
     */
    起き上がり("104", "起き上がり", "1-4"),
    /**
     * コード:105 名称:座位保持 略称:1-5
     */
    座位保持("105", "座位保持", "1-5"),
    /**
     * コード:106 名称:両足での立位保持 略称:1-6
     */
    両足での立位保持("106", "両足での立位保持", "1-6"),
    /**
     * コード:107 名称:歩行 略称:1-7
     */
    歩行("107", "歩行", "1-7"),
    /**
     * コード:108 名称:立ち上がり 略称:1-8
     */
    立ち上がり("108", "立ち上がり", "1-8"),
    /**
     * コード:109 名称:片足での立位 略称:1-9
     */
    片足での立位("109", "片足での立位", "1-9"),
    /**
     * コード:110 名称:洗身 略称:1-10
     */
    洗身("110", "洗身", "1-10"),
    /**
     * コード:111 名称:つめ切り 略称:1-11
     */
    つめ切り("111", "つめ切り", "1-11"),
    /**
     * コード:112 名称:視力 略称:1-12
     */
    視力("112", "視力", "1-12"),
    /**
     * コード:113 名称:聴力 略称:1-13
     */
    聴力("113", "聴力", "1-13"),
    /**
     * コード:201 名称:移乗 略称:2-1
     */
    移乗("201", "移乗", "2-1"),
    /**
     * コード:202 名称:移動 略称:2-2
     */
    移動("202", "移動", "2-2"),
    /**
     * コード:203 名称:えん下 略称:2-3
     */
    えん下("203", "えん下", "2-3"),
    /**
     * コード:204 名称:食事摂取 略称:2-4
     */
    食事摂取("204", "食事摂取", "2-4"),
    /**
     * コード:205 名称:排尿 略称:2-5
     */
    排尿("205", "排尿", "2-5"),
    /**
     * コード:206 名称:排便 略称:2-6
     */
    排便("206", "排便", "2-6"),
    /**
     * コード:207 名称:口腔清潔 略称:2-7
     */
    口腔清潔("207", "口腔清潔", "2-7"),
    /**
     * コード:208 名称:洗顔 略称:2-8
     */
    洗顔("208", "洗顔", "2-8"),
    /**
     * コード:209 名称:整髪 略称:2-9
     */
    整髪("209", "整髪", "2-9"),
    /**
     * コード:210 名称:上衣の着脱 略称:2-10
     */
    上衣の着脱("210", "上衣の着脱", "2-10"),
    /**
     * コード:211 名称:ズボン等の着脱 略称:2-11
     */
    ズボン等の着脱("211", "ズボン等の着脱", "2-11"),
    /**
     * コード:212 名称:外出頻度 略称:2-12
     */
    外出頻度("212", "外出頻度", "2-12"),
    /**
     * コード:301 名称:意思の伝達 略称:3-1
     */
    意思の伝達("301", "意思の伝達", "3-1"),
    /**
     * コード:302 名称:毎日の日課を理解 略称:3-2
     */
    毎日の日課を理解("302", "毎日の日課を理解", "3-2"),
    /**
     * コード:303 名称:生年月日や年齢を言う 略称:3-3
     */
    生年月日や年齢を言う("303", "生年月日や年齢を言う", "3-3"),
    /**
     * コード:304 名称:短期記憶 略称:3-4
     */
    短期記憶("304", "短期記憶", "3-4"),
    /**
     * コード:305 名称:自分の名前を言う 略称:3-5
     */
    自分の名前を言う("305", "自分の名前を言う", "3-5"),
    /**
     * コード:306 名称:今の季節を理解する 略称:3-6
     */
    今の季節を理解する("306", "今の季節を理解する", "3-6"),
    /**
     * コード:307 名称:場所の理解 略称:3-7
     */
    場所の理解("307", "場所の理解", "3-7"),
    /**
     * コード:308 名称:徘徊 略称:3-8
     */
    徘徊("308", "徘徊", "3-8"),
    /**
     * コード:309 名称:外出すると戻れない 略称:3-9
     */
    外出すると戻れない("309", "外出すると戻れない", "3-9"),
    /**
     * コード:401 名称:被害的 略称:4-1
     */
    被害的("401", "被害的", "4-1"),
    /**
     * コード:402 名称:作話 略称:4-2
     */
    作話("402", "作話", "4-2"),
    /**
     * コード:403 名称:感情が不安定 略称:4-3
     */
    感情が不安定("403", "感情が不安定", "4-3"),
    /**
     * コード:404 名称:昼夜逆転 略称:4-4
     */
    昼夜逆転("404", "昼夜逆転", "4-4"),
    /**
     * コード:405 名称:同じ話をする 略称:4-5
     */
    同じ話をする("405", "同じ話をする", "4-5"),
    /**
     * コード:406 名称:大声を出す 略称:4-6
     */
    大声を出す("406", "大声を出す", "4-6"),
    /**
     * コード:407 名称:介護に抵抗 略称:4-7
     */
    介護に抵抗("407", "介護に抵抗", "4-7"),
    /**
     * コード:408 名称:落ち着きなし 略称:4-8
     */
    落ち着きなし("408", "落ち着きなし", "4-8"),
    /**
     * コード:409 名称:一人で出たがる 略称:4-9
     */
    一人で出たがる("409", "一人で出たがる", "4-9"),
    /**
     * コード:410 名称:収集癖 略称:4-10
     */
    収集癖("410", "収集癖", "4-10"),
    /**
     * コード:411 名称:物や衣類を壊す 略称:4-11
     */
    物や衣類を壊す("411", "物や衣類を壊す", "4-11"),
    /**
     * コード:412 名称:ひどい物忘れ 略称:4-12
     */
    ひどい物忘れ("412", "ひどい物忘れ", "4-12"),
    /**
     * コード:413 名称:独り言独り笑い 略称:4-13
     */
    独り言独り笑い("413", "独り言独り笑い", "4-13"),
    /**
     * コード:414 名称:自分勝手に行動する 略称:4-14
     */
    自分勝手に行動する("414", "自分勝手に行動する", "4-14"),
    /**
     * コード:415 名称:話がまとまらない 略称:4-15
     */
    話がまとまらない("415", "話がまとまらない", "4-15"),
    /**
     * コード:501 名称:薬の内服 略称:5-1
     */
    薬の内服("501", "薬の内服", "5-1"),
    /**
     * コード:502 名称:金銭の管理 略称:5-2
     */
    金銭の管理("502", "金銭の管理", "5-2"),
    /**
     * コード:503 名称:日常の意思決定 略称:5-3
     */
    日常の意思決定("503", "日常の意思決定", "5-3"),
    /**
     * コード:504 名称:集団への不適応 略称:5-4
     */
    集団への不適応("504", "集団への不適応", "5-4"),
    /**
     * コード:505 名称:買い物 略称:5-5
     */
    買い物("505", "買い物", "5-5"),
    /**
     * コード:506 名称:簡単な調理 略称:5-6
     */
    簡単な調理("506", "簡単な調理", "5-6"),
    /**
     * コード:601 名称:点滴の管理 略称:6-1
     */
    点滴の管理("601", "点滴の管理", "6-1"),
    /**
     * コード:602 名称:中心静脈栄養 略称:6-2
     */
    中心静脈栄養("602", "中心静脈栄養", "6-2"),
    /**
     * コード:603 名称:透析 略称:6-3
     */
    透析("603", "透析", "6-3"),
    /**
     * コード:604 名称:ストーマの処置 略称:6-4
     */
    ストーマの処置("604", "ストーマの処置", "6-4"),
    /**
     * コード:605 名称:酸素療法 略称:6-5
     */
    酸素療法("605", "酸素療法", "6-5"),
    /**
     * コード:606 名称:レスピレーター 略称:6-6
     */
    レスピレーター("606", "レスピレーター", "6-6"),
    /**
     * コード:607 名称:気管切開 略称:6-7
     */
    気管切開("607", "気管切開", "6-7"),
    /**
     * コード:608 名称:疼痛の看護 略称:6-8
     */
    疼痛の看護("608", "疼痛の看護", "6-8"),
    /**
     * コード:609 名称:経管栄養 略称:6-9
     */
    経管栄養("609", "経管栄養", "6-9"),
    /**
     * コード:610 名称:モニター測定 略称:6-10
     */
    モニター測定("610", "モニター測定", "6-10"),
    /**
     * コード:611 名称:じょくそうの処置 略称:6-11
     */
    じょくそうの処置("611", "じょくそうの処置", "6-11"),
    /**
     * コード:612 名称:カテーテル 略称:6-12
     */
    カテーテル("612", "カテーテル", "6-12"),
    /**
     * コード:701 名称:障害高齢者自立度 略称:7-1
     */
    障害高齢者自立度("701", "障害高齢者自立度", "7-1"),
    /**
     * コード:702 名称:認知症高齢者自立度 略称:7-2
     */
    認知症高齢者自立度("702", "認知症高齢者自立度", "7-2"),
    /**
     * コード:001 名称:その他特記事項 略称:0-0
     */
    その他特記事項("001", "その他特記事項", "0-0");

    private final RString code;
    private final RString fullName;
    private final RString shortName;

    private NinteichosaKomoku09B(String code, String fullname, String shortName) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
        this.shortName = new RString(shortName);
    }

    /**
     * 認定調査特記事項のコードを返します。
     *
     * @return 認定調査特記事項のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 認定調査特記事項の名称を返します。
     *
     * @return 認定調査特記事項の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 認定調査特記事項の略称を返します。
     *
     * @return 認定調査特記事項の略称
     */
    public RString get略称() {
        return shortName;
    }

    /**
     * 認定調査特記事項のコードと一致する内容を探します。
     *
     * @param code 認定調査特記事項のコード
     * @return {@code code} に対応する認定調査特記事項
     * @throws IllegalArgumentException IllegalArgumentException
     */
    public static NinteichosaKomoku09B toValue(RString code) throws IllegalArgumentException {

        if (code == null || code.isEmpty()) {
            return その他特記事項;
        }

        for (NinteichosaKomoku09B target : values()) {
            if (target.getコード().equals(code)) {
                return target;
            }
        }

        throw new IllegalArgumentException(UrErrorMessages.存在しない.getMessage().replace("コード:" + code + " に対応する特記事項名称").evaluate());
    }
}
