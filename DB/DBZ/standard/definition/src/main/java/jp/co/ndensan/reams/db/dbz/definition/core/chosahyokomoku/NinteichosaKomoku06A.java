/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.definition.core.chosahyokomoku;

import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 認定調査特記事項マッピングを表す列挙型です。
 *
 * @reamsid_L DBD-9999-023 wangchao
 */
public enum NinteichosaKomoku06A {

    /**
     * 特記事項番号:1-1 群番号:1 群内順序:1 調査特記事項番号:101 前回基本調査項目コード:001 名称:麻痺等の有無
     */
    麻痺等の有無("1-1", "1", "1", "101", "001", "麻痺等の有無"),
    /**
     * 特記事項番号:1-2 群番号:1 群内順序:2 調査特記事項番号:102 前回基本調査項目コード:002 名称:間接の動く範囲の制限の有無
     */
    間接の動く範囲の制限の有無("1-2", "1", "2", "102", "002", "間接の動く範囲の制限の有無"),
    /**
     * 特記事項番号:2-1 群番号:2 群内順序:1 調査特記事項番号:201 前回基本調査項目コード:003 名称:寝返り
     */
    寝返り("2-1", "2", "1", "201", "003", "寝返り"),
    /**
     * 特記事項番号:2-2 群番号:2 群内順序:2 調査特記事項番号:202 前回基本調査項目コード:004 名称:起き上がり
     */
    起き上がり("2-2", "2", "2", "202", "004", "起き上がり"),
    /**
     * 特記事項番号:2-3 群番号:2 群内順序:3 調査特記事項番号:203 前回基本調査項目コード:005 名称:座位保持
     */
    座位保持("2-3", "2", "3", "203", "005", "座位保持"),
    /**
     * 特記事項番号:2-4 群番号:2 群内順序:4 調査特記事項番号:204 前回基本調査項目コード:006 名称:両足での立位保持
     */
    両足での立位保持("2-4", "2", "4", "204", "006", "両足での立位保持"),
    /**
     * 特記事項番号:2-5 群番号:2 群内順序:5 調査特記事項番号:205 前回基本調査項目コード:007 名称:歩行
     */
    歩行("2-5", "2", "5", "205", "007", "歩行"),
    /**
     * 特記事項番号:2-6 群番号:2 群内順序:6 調査特記事項番号:206 前回基本調査項目コード:008 名称:移乗
     */
    移乗("2-6", "2", "6", "206", "008", "移乗"),
    /**
     * 特記事項番号:2-7 群番号:2 群内順序:7 調査特記事項番号:207 前回基本調査項目コード:009 名称:移動
     */
    移動("2-7", "2", "7", "207", "009", "移動"),
    /**
     * 特記事項番号:3-1 群番号:3 群内順序:1 調査特記事項番号:301 前回基本調査項目コード:010 名称:立ち上がり
     */
    立ち上がり("3-1", "3", "1", "301", "010", "立ち上がり"),
    /**
     * 特記事項番号:3-2 群番号:3 群内順序:2 調査特記事項番号:302 前回基本調査項目コード:011 名称:片足での立位
     */
    片足での立位("3-2", "3", "2", "302", "011", "片足での立位"),
    /**
     * 特記事項番号:3-3 群番号:3 群内順序:3 調査特記事項番号:303 前回基本調査項目コード:012 名称:洗身
     */
    洗身("3-3", "3", "3", "303", "012", "洗身"),
    /**
     * 特記事項番号:4-1 群番号:4 群内順序:1 調査特記事項番号:4011 前回基本調査項目コード:013 名称:じょくそう（床ずれ）等の有無
     */
    じょくそう("4-1", "4", "1", "4011", "013", "じょくそう（床ずれ）等の有無"),
    /**
     * 特記事項番号:4-2 群番号:4 群内順序:2 調査特記事項番号:4012 前回基本調査項目コード:014 名称:じょくそう（床ずれ）以外の処理や手入れ
     */
    他の皮膚疾患("4-2", "4", "2", "4012", "014", "じょくそう（床ずれ）以外の処理や手入れ"),
    /**
     * 特記事項番号:4-3 群番号:4 群内順序:3 調査特記事項番号:402 前回基本調査項目コード:015 名称:えん下
     */
    えん下("4-3", "4", "3", "402", "015", "えん下"),
    /**
     * 特記事項番号:4-4 群番号:4 群内順序:4 調査特記事項番号:403 前回基本調査項目コード:016 名称:食事摂取
     */
    食事摂取("4-4", "4", "4", "403", "016", "食事摂取"),
    /**
     * 特記事項番号:4-5 群番号:4 群内順序:5 調査特記事項番号:404 前回基本調査項目コード:017 名称:飲水
     */
    飲水("4-5", "4", "5", "404", "017", "飲水"),
    /**
     * 特記事項番号:4-6 群番号:4 群内順序:6 調査特記事項番号:405 前回基本調査項目コード:018 名称:排尿
     */
    排尿("4-6", "4", "6", "405", "018", "排尿"),
    /**
     * 特記事項番号:4-7 群番号:4 群内順序:7 調査特記事項番号:406 前回基本調査項目コード:019 名称:排便
     */
    排便("4-7", "4", "7", "406", "019", "排便"),
    /**
     * 特記事項番号:5-1 群番号:5 群内順序:1 調査特記事項番号:5011 前回基本調査項目コード:020 名称:口腔清潔（はみがき等）
     */
    口腔清潔("5-1", "5", "1", "5011", "020", "口腔清潔（はみがき等）"),
    /**
     * 特記事項番号:5-2 群番号:5 群内順序:2 調査特記事項番号:5012 前回基本調査項目コード:021 名称:洗顔
     */
    洗顔("5-2", "5", "2", "5012", "021", "洗顔"),
    /**
     * 特記事項番号:5-3 群番号:5 群内順序:3 調査特記事項番号:5013 前回基本調査項目コード:022 名称:整髪
     */
    整髪("5-3", "5", "3", "5013", "022", "整髪"),
    /**
     * 特記事項番号:5-4 群番号:5 群内順序:4 調査特記事項番号:5014 前回基本調査項目コード:023 名称:つめ切り
     */
    つめ切り("5-4", "5", "4", "5014", "023", "つめ切り"),
    /**
     * 特記事項番号:5-5 群番号:5 群内順序:5 調査特記事項番号:5021 前回基本調査項目コード:024 名称:上衣の着脱
     */
    上衣の着脱("5-5", "5", "5", "5021", "024", "上衣の着脱"),
    /**
     * 特記事項番号:5-6 群番号:5 群内順序:6 調査特記事項番号:5022 前回基本調査項目コード:025 名称:ズボン、パンツ等の着脱
     */
    ズボン等の着脱("5-6", "5", "6", "5022", "025", "ズボン、パンツ等の着脱"),
    /**
     * 特記事項番号:5-7 群番号:5 群内順序:7 調査特記事項番号:503 前回基本調査項目コード:026 名称:薬の内服
     */
    薬の内服("5-7", "5", "7", "503", "026", "薬の内服"),
    /**
     * 特記事項番号:5-8 群番号:5 群内順序:8 調査特記事項番号:504 前回基本調査項目コード:027 名称:金銭の管理
     */
    金銭の管理("5-8", "5", "8", "504", "027", "金銭の管理"),
    /**
     * 特記事項番号:5-9 群番号:5 群内順序:9 調査特記事項番号:505 前回基本調査項目コード:028 名称:電話の利用
     */
    電話の利用("5-9", "5", "9", "505", "028", "電話の利用"),
    /**
     * 特記事項番号:5-10 群番号:5 群内順序:10 調査特記事項番号:506 前回基本調査項目コード:029 名称:日常の意思決定
     */
    意思決定("5-10", "5", "10", "506", "029", "日常の意思決定"),
    /**
     * 特記事項番号:6-1 群番号:6 群内順序:1 調査特記事項番号:601 前回基本調査項目コード:030 名称:視力
     */
    視力("6-1", "6", "1", "601", "030", "視力"),
    /**
     * 特記事項番号:6-2 群番号:6 群内順序:2 調査特記事項番号:602 前回基本調査項目コード:031 名称:聴力
     */
    聴力("6-2", "6", "2", "602", "031", "聴力"),
    /**
     * 特記事項番号:6-3 群番号:6 群内順序:3 調査特記事項番号:603 前回基本調査項目コード:032 名称:意思の伝達
     */
    意思の伝達("6-3", "6", "3", "603", "032", "意思の伝達"),
    /**
     * 特記事項番号:6-4 群番号:6 群内順序:4 調査特記事項番号:604 前回基本調査項目コード:033 名称:介護者の指示への反応
     */
    指示への反応("6-4", "6", "4", "604", "033", "介護者の指示への反応"),
    /**
     * 特記事項番号:6-5 群番号:6 群内順序:5 調査特記事項番号:6051 前回基本調査項目コード:034 名称:毎日の日課を理解
     */
    毎日の日課を理解("6-5", "6", "5", "6051", "034", "毎日の日課を理解"),
    /**
     * 特記事項番号:6-6 群番号:6 群内順序:6 調査特記事項番号:6052 前回基本調査項目コード:035 名称:生年月日や年齢をいう
     */
    生年月日や年齢をいう("6-6", "6", "6", "6052", "035", "生年月日や年齢をいう"),
    /**
     * 特記事項番号:6-7 群番号:6 群内順序:7 調査特記事項番号:6053 前回基本調査項目コード:036 名称:短期記憶
     */
    短期記憶("6-7", "6", "7", "6053", "036", "短期記憶"),
    /**
     * 特記事項番号:6-8 群番号:6 群内順序:8 調査特記事項番号:6054 前回基本調査項目コード:037 名称:自分の名前をいう
     */
    自分の名前をいう("6-8", "6", "8", "6054", "037", "自分の名前をいう"),
    /**
     * 特記事項番号:6-9 群番号:6 群内順序:9 調査特記事項番号:6055 前回基本調査項目コード:038 名称:今の季節を理解
     */
    今の季節を理解("6-9", "6", "9", "6055", "038", "今の季節を理解"),
    /**
     * 特記事項番号:6-10 群番号:6 群内順序:10 調査特記事項番号:6056 前回基本調査項目コード:039 名称:自分がいる場所の理解
     */
    自分がいる場所の理解("6-10", "6", "10", "6056", "039", "自分がいる場所の理解"),
    /**
     * 特記事項番号:7-1 群番号:7 群内順序:1 調査特記事項番号:701 前回基本調査項目コード:040 名称:被害的
     */
    被害的("7-1", "7", "1", "701", "040", "被害的"),
    /**
     * 特記事項番号:7-2 群番号:7 群内順序:2 調査特記事項番号:702 前回基本調査項目コード:041 名称:作話
     */
    作話("7-2", "7", "2", "702", "041", "作話"),
    /**
     * 特記事項番号:7-3 群番号:7 群内順序:3 調査特記事項番号:703 前回基本調査項目コード:042 名称:幻視幻聴
     */
    幻視幻聴("7-3", "7", "3", "703", "042", "幻視幻聴"),
    /**
     * 特記事項番号:7-4 群番号:7 群内順序:4 調査特記事項番号:704 前回基本調査項目コード:043 名称:感情が不安定
     */
    感情が不安定("7-4", "7", "4", "704", "043", "感情が不安定"),
    /**
     * 特記事項番号:7-5 群番号:7 群内順序:5 調査特記事項番号:705 前回基本調査項目コード:044 名称:昼夜逆転
     */
    昼夜逆転("7-5", "7", "5", "705", "044", "昼夜逆転"),
    /**
     * 特記事項番号:7-6 群番号:7 群内順序:6 調査特記事項番号:706 前回基本調査項目コード:045 名称:暴言暴行
     */
    暴言暴行("7-6", "7", "6", "706", "045", "暴言暴行"),
    /**
     * 特記事項番号:7-7 群番号:7 群内順序:7 調査特記事項番号:707 前回基本調査項目コード:046 名称:同じ話をする
     */
    同じ話をする("7-7", "7", "7", "707", "046", "同じ話をする"),
    /**
     * 特記事項番号:7-8 群番号:7 群内順序:8 調査特記事項番号:708 前回基本調査項目コード:047 名称:大声をだす
     */
    大声をだす("7-8", "7", "8", "708", "047", "大声をだす"),
    /**
     * 特記事項番号:7-9 群番号:7 群内順序:9 調査特記事項番号:709 前回基本調査項目コード:048 名称:介護に抵抗
     */
    介護に抵抗("7-9", "7", "9", "709", "048", "介護に抵抗"),
    /**
     * 特記事項番号:7-10 群番号:7 群内順序:10 調査特記事項番号:710 前回基本調査項目コード:049 名称:常時の徘徊
     */
    常時の徘徊("7-10", "7", "10", "710", "049", "常時の徘徊"),
    /**
     * 特記事項番号:7-11 群番号:7 群内順序:11 調査特記事項番号:711 前回基本調査項目コード:050 名称:落ち着きなし
     */
    落ち着きなし("7-11", "7", "11", "711", "050", "落ち着きなし"),
    /**
     * 特記事項番号:7-12 群番号:7 群内順序:12 調査特記事項番号:712 前回基本調査項目コード:051 名称:外出して戻れない
     */
    外出して戻れない("7-12", "7", "12", "712", "051", "外出して戻れない"),
    /**
     * 特記事項番号:7-13 群番号:7 群内順序:13 調査特記事項番号:713 前回基本調査項目コード:052 名称:一人で出たがる
     */
    一人で出たがる("7-13", "7", "13", "713", "052", "一人で出たがる"),
    /**
     * 特記事項番号:7-14 群番号:7 群内順序:14 調査特記事項番号:714 前回基本調査項目コード:053 名称:収集癖
     */
    収集癖("7-14", "7", "14", "714", "053", "収集癖"),
    /**
     * 特記事項番号:7-15 群番号:7 群内順序:15 調査特記事項番号:715 前回基本調査項目コード:054 名称:火の不始末
     */
    火の不始末("7-15", "7", "15", "715", "054", "火の不始末"),
    /**
     * 特記事項番号:7-16 群番号:7 群内順序:16 調査特記事項番号:716 前回基本調査項目コード:055 名称:物や衣類を壊す
     */
    物や衣類を壊す("7-16", "7", "16", "716", "055", "物や衣類を壊す"),
    /**
     * 特記事項番号:7-17 群番号:7 群内順序:17 調査特記事項番号:717 前回基本調査項目コード:056 名称:不潔行為
     */
    不潔行為("7-17", "7", "17", "717", "056", "不潔行為"),
    /**
     * 特記事項番号:7-18 群番号:7 群内順序:18 調査特記事項番号:718 前回基本調査項目コード:057 名称:異食行動
     */
    異食行動("7-18", "7", "18", "718", "057", "異食行動"),
    /**
     * 特記事項番号:7-19 群番号:7 群内順序:19 調査特記事項番号:719 前回基本調査項目コード:058 名称:ひどい物忘れ
     */
    ひどい物忘れ("7-19", "7", "19", "719", "058", "ひどい物忘れ"),
    /**
     * 特記事項番号:8-1 群番号:8 群内順序:1 調査特記事項番号:801 前回基本調査項目コード:059 名称:点滴の管理
     */
    点滴の管理("8-1", "8", "1", "801", "059", "点滴の管理"),
    /**
     * 特記事項番号:8-2 群番号:8 群内順序:2 調査特記事項番号:802 前回基本調査項目コード:060 名称:中心静脈栄養
     */
    中心静脈栄養("8-2", "8", "2", "802", "060", "中心静脈栄養"),
    /**
     * 特記事項番号:8-3 群番号:8 群内順序:3 調査特記事項番号:803 前回基本調査項目コード:061 名称:透析
     */
    透析("8-3", "8", "3", "803", "061", "透析"),
    /**
     * 特記事項番号:8-4 群番号:8 群内順序:4 調査特記事項番号:804 前回基本調査項目コード:062 名称:ストーマの処置
     */
    ストーマの処置("8-4", "8", "4", "804", "062", "ストーマの処置"),
    /**
     * 特記事項番号:8-5 群番号:8 群内順序:5 調査特記事項番号:805 前回基本調査項目コード:063 名称:酸素療法
     */
    酸素療法("8-5", "8", "5", "805", "063", "酸素療法"),
    /**
     * 特記事項番号:8-6 群番号:8 群内順序:6 調査特記事項番号:806 前回基本調査項目コード:064 名称:レスピレーター
     */
    レスピレーター("8-6", "8", "6", "806", "064", "レスピレーター"),
    /**
     * 特記事項番号:8-7 群番号:8 群内順序:7 調査特記事項番号:807 前回基本調査項目コード:065 名称:気管切開の処置
     */
    気管切開の処置("8-7", "8", "7", "807", "065", "気管切開の処置"),
    /**
     * 特記事項番号:8-8 群番号:8 群内順序:8 調査特記事項番号:808 前回基本調査項目コード:066 名称:疼痛の看護
     */
    疼痛の看護("8-8", "8", "8", "808", "066", "疼痛の看護"),
    /**
     * 特記事項番号:8-9 群番号:8 群内順序:9 調査特記事項番号:809 前回基本調査項目コード:067 名称:経管栄養
     */
    経管栄養("8-9", "8", "9", "809", "067", "経管栄養"),
    /**
     * 特記事項番号:8-10 群番号:8 群内順序:10 調査特記事項番号:810 前回基本調査項目コード:068 名称:モニター測定
     */
    モニター測定("8-10", "8", "10", "810", "068", "モニター測定"),
    /**
     * 特記事項番号:8-11 群番号:8 群内順序:11 調査特記事項番号:811 前回基本調査項目コード:069 名称:じょくそうの処置
     */
    じょくそうの処置("8-11", "8", "11", "811", "069", "じょくそうの処置"),
    /**
     * 特記事項番号:8-12 群番号:8 群内順序:12 調査特記事項番号:812 前回基本調査項目コード:070 名称:カテーテル
     */
    カテーテル("8-12", "8", "12", "812", "070", "カテーテル"),
    /**
     * 特記事項番号:9-1 群番号:9 群内順序:1 調査特記事項番号:901 前回基本調査項目コード:071 名称:障害高齢者の日常自立度（寝たきり度）
     */
    障害高齢者自立度("9-1", "9", "1", "901", "071", "障害高齢者の日常自立度（寝たきり度）"),
    /**
     * 特記事項番号:9-2 群番号:9 群内順序:2 調査特記事項番号:902 前回基本調査項目コード:072 名称:認知症高齢者の日常自立度
     */
    認知症高齢者自立度("9-2", "9", "2", "902", "072", "認知症高齢者の日常自立度"),
    /**
     * 特記事項番号:10-1 群番号:10 群内順序:1 調査特記事項番号:1001 前回基本調査項目コード:073 名称:日中の生活
     */
    日中の生活("10-1", "10", "1", "1001", "073", "日中の生活"),
    /**
     * 特記事項番号:10-2 群番号:10 群内順序:2 調査特記事項番号:1002 前回基本調査項目コード:074 名称:外出頻度
     */
    外出頻度("10-2", "10", "2", "1002", "074", "外出頻度"),
    /**
     * 特記事項番号:10-3 群番号:10 群内順序:3 調査特記事項番号:1003 前回基本調査項目コード:075 名称:廃用の程度
     */
    廃用の程度("10-3", "10", "3", "1003", "075", "廃用の程度"),
    /**
     * 特記事項番号:0-0 群番号:0 群内順序:0 調査特記事項番号:001 前回基本調査項目コード:076 名称:その他特記事項
     */
    その他特記事項("0-0", "0", "0", "001", "076", "その他特記事項");

    private final RString 特記事項番号;
    private final RString 群番号;
    private final RString 群内順序;
    private final RString 調査特記事項番;
    private final RString 前回基本調査項目コード;
    private final RString 名称;

    private NinteichosaKomoku06A(String 特記事項番号, String 群番号, String 群内順序,
            String 調査特記事項番, String 前回基本調査項目コード, String 名称) {
        this.特記事項番号 = new RString(特記事項番号);
        this.群番号 = new RString(群番号);
        this.群内順序 = new RString(群内順序);
        this.調査特記事項番 = new RString(調査特記事項番);
        this.前回基本調査項目コード = new RString(前回基本調査項目コード);
        this.名称 = new RString(名称);
    }

    /**
     * 認定調査特記事項マッピングの特記事項番号を返します。
     *
     * @return 認定調査特記事項マッピングのコード
     */
    public RString get特記事項番号() {
        return 特記事項番号;
    }

    /**
     * 認定調査特記事項マッピングの群番号を返します。
     *
     * @return 認定調査特記事項マッピングの群番号
     */
    public RString get群番号() {
        return 群番号;
    }

    /**
     * 認定調査特記事項マッピングの群内順序を返します。
     *
     * @return 認定調査特記事項マッピングの群内順序
     */
    public RString get群内順序() {
        return 群内順序;
    }

    /**
     * 認定調査特記事項マッピングの調査特記事項番を返します。
     *
     * @return 認定調査特記事項マッピングの調査特記事項番
     */
    public RString get調査特記事項番序() {
        return 調査特記事項番;
    }

    /**
     * 認定調査特記事項マッピングの前回基本調査項目コードを返します。
     *
     * @return 認定調査特記事項マッピングの前回基本調査項目コード
     */
    public RString get前回基本調査項目コード() {
        return 前回基本調査項目コード;
    }

    /**
     * 認定調査特記事項マッピングの名称を返します。
     *
     * @return 認定調査特記事項マッピングの名称
     */
    public RString get名称() {
        return 名称;
    }

    /**
     * 認定調査特記事項マッピングのコードと一致する内容を探します。
     *
     * @param code 認定調査特記事項マッピングのコード
     * @return {@code code} に対応する認定調査特記事項マッピング
     * @throws IllegalArgumentException IllegalArgumentException
     */
    public static NinteichosaKomoku06A toValue(RString code) throws IllegalArgumentException {
        for (NinteichosaKomoku06A target : NinteichosaKomoku06A.values()) {
            if (target.get特記事項番号().equals(code)) {
                return target;
            }
        }

        throw new IllegalArgumentException(UrErrorMessages.存在しない.getMessage().replace("コード:" + code + " に対応する特記事項名称").evaluate());
    }

    /**
     * 認定調査特記事項マッピングの調査特記事項番と一致する内容を探します。
     *
     * @param code 認定調査特記事項マッピングのコード
     * @return {@code code} に対応する認定調査特記事項マッピング
     * @throws IllegalArgumentException IllegalArgumentException
     */
    public static NinteichosaKomoku06A getAllBy調査特記事項番(RString code) throws IllegalArgumentException {
        for (NinteichosaKomoku06A target : NinteichosaKomoku06A.values()) {
            if (target.get調査特記事項番序().equals(code)) {
                return target;
            }
        }

        throw new IllegalArgumentException(UrErrorMessages.存在しない.getMessage().replace("コード:" + code + " に対応する特記事項名称").evaluate());
    }
}