/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.ikensho;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 *
 * 意見書項目マッピング09Aを表す列挙型です。
 */
public enum IkenshoKomokuMapping09A {

    /**
     * コード:1 名称:点滴の管理 略称:定義なし
     */
    点滴の管理("1", "処置内容（点滴の管理）"),
    /**
     * コード:2 名称:中心静脈栄養 略称:定義なし
     */
    中心静脈栄養("2", "処置内容（中心静脈栄養）"),
    /**
     * コード:3 名称:透析 略称:定義なし
     */
    透析("3", "処置内容（透析）"),
    /**
     * コード:4 名称:ストーマの処置 略称:定義なし
     */
    ストーマの処置("4", "処置内容（ストーマの処置）"),
    /**
     * コード:5 名称:酸素療法 略称:定義なし
     */
    酸素療法("5", "処置内容（酸素療法）"),
    /**
     * コード:6 名称:レスピレーター 略称:定義なし
     */
    レスピレーター("6", "処置内容（レスピレーター）"),
    /**
     * コード:7 名称:気管切開の処置 略称:定義なし
     */
    気管切開の処置("7", "処置内容（気管切開の処置）"),
    /**
     * コード:8 名称:疼痛の看護 略称:定義なし
     */
    疼痛の看護("8", "処置内容（疼痛の看護）"),
    /**
     * コード:9 名称:経管栄養 略称:定義なし
     */
    経管栄養("9", "処置内容（経管栄養）"),
    /**
     * コード:10 名称:モニター測定 略称:定義なし
     */
    モニター測定("10", "特別な対応（モニター測定）"),
    /**
     * コード:11 名称:じょくそうの処置 略称:定義なし
     */
    じょくそうの処置("11", "特別な対応（じょくそうの処置）"),
    /**
     * コード:12 名称:カテーテル 略称:定義なし
     */
    カテーテル("12", "失禁への対応（カテーテル）"),
    /**
     * コード:13 名称:寝たきり度 略称:定義なし
     */
    寝たきり度("13", "障害老人の日常生活自立度"),
    /**
     * コード:14 名称:認知症高齢者の日常生活自立度 略称:定義なし
     */
    認知症高齢者の日常生活自立度("14", "痴呆性老人の日常生活自立度"),
    /**
     * コード:15 名称:短期記憶 略称:定義なし
     */
    短期記憶("15", "短期記憶"),
    /**
     * コード:16 名称:認知能力 略称:定義なし
     */
    認知能力("16", "日常の意思決定を行うための認知能力"),
    /**
     * コード:17 名称:伝達能力 略称:定義なし
     */
    伝達能力("17", "自分の意思の伝達能力"),
    /**
     * コード:18 名称:認知症の周辺症状 略称:定義なし
     */
    認知症の周辺症状("18", "問題行動の有無"),
    /**
     * コード:19 名称:幻視・幻聴 略称:定義なし
     */
    幻視_幻聴("19", "問題行動の有の場合（幻視・幻聴）"),
    /**
     * コード:20 名称:妄想 略称:定義なし
     */
    妄想("20", "問題行動の有の場合（妄想）"),
    /**
     * コード:21 名称:昼夜逆転 略称:定義なし
     */
    昼夜逆転("21", "問題行動の有の場合（昼夜逆転）"),
    /**
     * コード:22 名称:暴言 略称:定義なし
     */
    暴言("22", "問題行動の有の場合（暴言）"),
    /**
     * コード:23 名称:暴行 略称:定義なし
     */
    暴行("23", "問題行動の有の場合（暴行）"),
    /**
     * コード:24 名称:介護への抵抗 略称:定義なし
     */
    介護への抵抗("24", "問題行動の有の場合（介護への抵抗）"),
    /**
     * コード:25 名称:徘徊_問題行動 略称:定義なし
     */
    徘徊("25", "認知症の周辺症状が有の場合（徘徊）"),
    /**
     * コード:26 名称:火の不始末 略称:定義なし
     */
    火の不始末("26", "問題行動の有の場合（火の不始末）"),
    /**
     * コード:27 名称:不潔行為 略称:定義なし
     */
    不潔行為("27", "問題行動の有の場合（不潔行為）"),
    /**
     * コード:28 名称:異食行動 略称:定義なし
     */
    異食行動("328", "問題行動の有の場合（異食行動）"),
    /**
     * コード:29 名称:性的問題行動 略称:定義なし
     */
    性的問題行動("29", "問題行動の有の場合（性的問題行動）"),
    /**
     * コード:30 名称:その他 略称:定義なし
     */
    その他("30", "問題行動の有の場合（その他）"),
    /**
     * コード:31 名称:その他の精神・神経症状 略称:定義なし
     */
    その他の精神_神経症状("31", "精神・神経症状の有無"),
    /**
     * コード:32 名称:専門医受診の有無 略称:定義なし
     */
    専門医受診の有無("32", "精神・神経症状の有の場合専門医受診の有無"),
    /**
     * コード:33 名称:利き腕 略称:定義なし
     */
    利き腕("33", "利き腕"),
    /**
     * コード:34 名称:過去6カ月の体重の変化 略称:定義なし
     */
    過去6カ月の体重の変化("34", "過去6カ月の体重の変化"),
    /**
     * コード:35 名称:四肢欠損 略称:定義なし
     */
    四肢欠損("35", "四肢欠損"),
    /**
     * コード:36 名称:麻痺 略称:定義なし
     */
    麻痺("36", "麻痺"),
    /**
     * コード:37 名称:麻痺_右上肢 略称:定義なし
     */
    麻痺_右上肢("37", "麻痺（右上肢）"),
    /**
     * コード:38 名称:麻痺_右上肢　程度 略称:定義なし
     */
    麻痺_右上肢_程度("38", ""),
    /**
     * コード:39 名称:麻痺_左上肢 略称:定義なし
     */
    麻痺_左上肢("39", "麻痺（左上肢）"),
    /**
     * コード:40 名称:麻痺_左上肢_程度 略称:定義なし
     */
    麻痺_左上肢_程度("40", ""),
    /**
     * コード:41 名称:麻痺_右下肢 略称:定義なし
     */
    麻痺_右下肢("41", "麻痺（右下肢）"),
    /**
     * コード:42 名称:麻痺_右下肢　程度 略称:定義なし
     */
    麻痺_右下肢_程度("42", ""),
    /**
     * コード:43 名称:麻痺_左下肢 略称:定義なし
     */
    麻痺_左下肢("43", "麻痺（左下肢）"),
    /**
     * コード:44 名称:麻痺_左下肢　程度 略称:定義なし
     */
    麻痺_左下肢_程度("44", ""),
    /**
     * コード:45 名称:麻痺_その他 略称:定義なし
     */
    麻痺_その他("45", "麻痺（その他）"),
    /**
     * コード:46 名称:麻痺_その他　程度 略称:定義なし
     */
    麻痺_その他_程度("46", ""),
    /**
     * コード:47 名称:筋力の低下 略称:定義なし
     */
    筋力の低下("47", "筋力の低下"),
    /**
     * コード:48 名称:筋力の低下　程度 略称:定義なし
     */
    筋力の低下_程度("48", "筋力の低下　程度"),
    /**
     * コード:49 名称:関節の拘縮 略称:定義なし
     */
    関節の拘縮("49", "関節の拘縮"),
    /**
     * コード:50 名称:関節の拘縮　程度 略称:定義なし
     */
    関節の拘縮_程度("50", "関節の拘縮　程度"),
    /**
     * コード:51 名称:関節の痛み 略称:定義なし
     */
    関節の痛み("51", "関節の痛み"),
    /**
     * コード:52 名称:関節の痛み　程度 略称:定義なし
     */
    関節の痛み_程度("52", "関節の痛み　程度"),
    /**
     * コード:53 名称:失調・不随意運動 略称:定義なし
     */
    失調_不随意運動("53", "失調・不随意運動"),
    /**
     * コード:54 名称:失調・不随意運動（上肢） 略称:定義なし
     */
    失調_不随意運動_上肢_右("54", "失調・不随意運動（上肢）右"),
    /**
     * コード:55 名称:失調・不随意運動（上肢） 略称:定義なし
     */
    失調_不随意運動_上肢_左("55", "失調・不随意運動（上肢）左"),
    /**
     * コード:56 名称:失調・不随意運動（下肢） 略称:定義なし
     */
    失調_不随意運動_下肢_右("56", "失調・不随意運動（下肢）右"),
    /**
     * コード:57 名称:失調・不随意運動（下肢） 略称:定義なし
     */
    失調_不随意運動_下肢_左("57", "失調・不随意運動（下肢）左"),
    /**
     * コード:58 名称:失調・不随意運動（体幹） 略称:定義なし
     */
    失調_不随意運動_体幹_右("58", "失調・不随意運動（体幹）右"),
    /**
     * コード:59 名称:失調・不随意運動（体幹） 略称:定義なし
     */
    失調_不随意運動_体幹_左("59", "失調・不随意運動（体幹）左"),
    /**
     * コード:60 名称:じょくそう 略称:定義なし
     */
    じょくそう("60", "じょくそう"),
    /**
     * コード:61 名称:じょくそう_程度 略称:定義なし
     */
    じょくそう_程度("61", "じょくそう　程度"),
    /**
     * コード:62 名称:その他の皮膚疾患 略称:定義なし
     */
    その他の皮膚疾患("62", "その他の皮膚疾患"),
    /**
     * コード:63 名称:その他の皮膚疾患　程度 略称:定義なし
     */
    その他の皮膚疾患_程度("63", "その他の皮膚疾患　程度"),
    /**
     * コード:64 名称:屋外歩行 略称:定義なし
     */
    屋外歩行("64", "屋外歩行"),
    /**
     * コード:65 名称:車いすの使用 略称:定義なし
     */
    車いすの使用("65", "車いすの使用"),
    /**
     * コード:66 名称:歩行補助具・装具の使用_用いていない 略称:定義なし
     */
    歩行補助具_装具の使用_用いていない("66", "歩行補助具・装具の使用_用いていない"),
    /**
     * コード:67 名称:歩行補助具・装具の使用_屋外で使用 略称:定義なし
     */
    歩行補助具_装具の使用_屋外で使用("67", "歩行補助具・装具の使用_屋外で使用"),
    /**
     * コード:68 名称:歩行補助具・装具の使用_屋内で使用 略称:定義なし
     */
    歩行補助具_装具の使用_屋内で使用("68", "歩行補助具・装具の使用_屋内で使用"),
    /**
     * コード:69 名称:食事行為 略称:定義なし
     */
    食事行為("69", "食事行為"),
    /**
     * コード:70 名称:現在の栄養状態 略称:定義なし
     */
    現在の栄養状態("70", "現在の栄養状態"),
    /**
     * コード:71 名称:尿失禁 略称:定義なし
     */
    尿失禁("71", "現在、今後発生の可能性が高い病態（尿失禁）"),
    /**
     * コード:72 名称:転倒・骨折 略称:定義なし
     */
    転倒_骨折("72", "現在、今後発生の可能性が高い病態（転倒・骨折）"),
    /**
     * コード:73 名称:移動能力の低下 略称:定義なし
     */
    移動能力の低下("73", "現在、今後発生の可能性が高い病態（移動能力の低下）"),
    /**
     * コード:74 名称:褥瘡 略称:定義なし
     */
    褥瘡("74", "現在、今後発生の可能性が高い病態（褥瘡）"),
    /**
     * コード:75 名称:心肺機能の低下 略称:定義なし
     */
    心肺機能の低下("75", "現在、今後発生の可能性が高い病態（心肺機能の低下）"),
    /**
     * コード:76 名称:閉じこもり 略称:定義なし
     */
    閉じこもり("76", "現在、今後発生の可能性が高い病態（閉じこもり）"),
    /**
     * コード:77 名称:意欲低下 略称:定義なし
     */
    意欲低下("77", "現在、今後発生の可能性が高い病態（意欲低下）"),
    /**
     * コード:78 名称:徘徊_可能性が高い病態 略称:定義なし
     */
    徘徊_可能性が高い病態("78", "現在、今後発生の可能性が高い病態（徘徊）"),
    /**
     * コード:79 名称:低栄養 略称:定義なし
     */
    低栄養("79", "現在、今後発生の可能性が高い病態（低栄養）"),
    /**
     * コード:81 名称:脱水 略称:定義なし
     */
    脱水("81", "現在、今後発生の可能性が高い病態（脱水）"),
    /**
     * コード:82 名称:易感染性 略称:定義なし
     */
    易感染性("82", "現在、今後発生の可能性が高い病態（易感染性）"),
    /**
     * コード:83 名称:脱水 略称:定義なし
     */
    がん等による疼痛("83", "現在、今後発生の可能性が高い病態（がん等による疼痛）"),
    /**
     * コード:84 名称:病態_その他 略称:定義なし
     */
    病態_その他("84", "現在、今後発生の可能性が高い病態（その他）"),
    /**
     * コード:85 名称:生活機能の維持・改善の見通し 略称:定義なし
     */
    生活機能の維持_改善の見通し("85", "生活機能の維持・改善の見通し"),
    /**
     * コード:86 名称:訪問診療 略称:定義なし
     */
    訪問診療("86", "医学的管理の必要性（訪問診療）"),
    /**
     * コード:87 名称:訪問診療_必要性 略称:定義なし
     */
    訪問診療_必要性("87", "医学的管理の必要性（訪問診療）必要性"),
    /**
     * コード:88 名称:訪問看護 略称:定義なし
     */
    訪問看護("88", "医学的管理の必要性（訪問看護）"),
    /**
     * コード:89 名称:訪問看護_必要性 略称:定義なし
     */
    訪問看護_必要性("89", "医学的管理の必要性（訪問看護）必要性"),
    /**
     * コード:90 名称:看護職員による相談 略称:定義なし
     */
    看護職員による相談("90", "医学的管理の必要性（看護職員の訪問による相談・支援）"),
    /**
     * コード:91 名称:看護職員による相談_必要性 略称:定義なし
     */
    看護職員による相談_必要性("91", "医学的管理の必要性（看護職員の訪問による相談・支援）必要性"),
    /**
     * コード:92 名称:訪問歯科診療 略称:定義なし
     */
    訪問歯科診療("92", "医学的管理の必要性（訪問歯科診療）"),
    /**
     * コード:93 名称:訪問歯科診療_必要性 略称:定義なし
     */
    訪問歯科診療_必要性("93", "医学的管理の必要性（訪問歯科診療）必要性"),
    /**
     * コード:94 名称:訪問薬剤管理指導 略称:定義なし
     */
    訪問薬剤管理指導("94", "医学的管理の必要性（訪問薬剤管理指導）"),
    /**
     * コード:95 名称:訪問薬剤管理指導_必要性 略称:定義なし
     */
    訪問薬剤管理指導_必要性("95", "医学的管理の必要性（訪問薬剤管理指導）必要性"),
    /**
     * コード:96 名称:訪問リハビリテーション 略称:定義なし
     */
    訪問リハビリテーション("96", "医学的管理の必要性（訪問リハビリテーション）"),
    /**
     * コード:97 名称:訪問リハビリテーション_必要性 略称:定義なし
     */
    訪問リハビリテーション_必要性("97", "医学的管理の必要性（訪問リハビリテーション）必要性"),
    /**
     * コード:98 名称:短期入所療養介護 略称:定義なし
     */
    短期入所療養介護("98", "医学的管理の必要性（短期入所療養介護）"),
    /**
     * コード:99 名称:短期入所療養介護_必要性 略称:定義なし
     */
    短期入所療養介護_必要性("99", "医学的管理の必要性（短期入所療養介護）必要性"),
    /**
     * コード:100 名称:訪問栄養食事指導 略称:定義なし
     */
    訪問歯科衛生指導("100", "医学的管理の必要性（訪問歯科衛生指導）"),
    /**
     * コード:101 名称:訪問栄養食事指導 略称:定義なし
     */
    訪問歯科衛生指導_必要性("101", "医学的管理の必要性（訪問歯科衛生指導）必要性"),
    /**
     * コード:102 名称:訪問栄養食事指導 略称:定義なし
     */
    訪問栄養食事指導("102", "医学的管理の必要性（訪問栄養食事指導）"),
    /**
     * コード:103 名称:訪問栄養食事指導_必要性 略称:定義なし
     */
    訪問栄養食事指導_必要性("103", "医学的管理の必要性（訪問栄養食事指導）必要性"),
    /**
     * コード:104 名称:通所リハビリテーション 略称:定義なし
     */
    通所リハビリテーション("104", "医学的管理の必要性（通所リハビリテーション）"),
    /**
     * コード:105 名称:通所リハビリテーション_必要性 略称:定義なし
     */
    通所リハビリテーション_必要性("105", "医学的管理の必要性（通所リハビリテーション）必要性"),
    /**
     * コード:106 名称:その他の医療系のサービス 略称:定義なし
     */
    その他の医療系のサービス("106", "医学的管理の必要性（その他の医療系のサービス）"),
    /**
     * コード:107 名称:その他の医療系のサービス_必要性 略称:定義なし
     */
    その他の医療系のサービス_必要性("107", "医学的管理の必要性（その他の医療系のサービス）必要性"),
    /**
     * コード:108 名称:介護サービスの留意事項_血圧 略称:定義なし
     */
    介護サービスの留意事項_血圧("108", "介護サービスの留意事項（血圧）"),
    /**
     * コード:109 名称:介護サービスの留意事項_移動 略称:定義なし
     */
    介護サービスの留意事項_移動("109", "介護サービスの留意事項（移動）"),
    /**
     * コード:110 名称:介護サービスの留意事項_摂食 略称:定義なし
     */
    介護サービスの留意事項_摂食("110", "介護サービスの留意事項（摂食）"),
    /**
     * コード:111 名称:介護サービスの留意事項運動 略称:定義なし
     */
    介護サービスの留意事項_運動("111", "介護サービスの留意事項（運動）"),
    /**
     * コード:112 名称:介護サービスの留意事項_嚥下 略称:定義なし
     */
    介護サービスの留意事項_嚥下("112", "介護サービスの留意事項（嚥下）"),
    /**
     * コード:113 名称:感染症の有無 略称:定義なし
     */
    感染症の有無("113", "感染症の有無");

    private final RString code;
    private final RString fullName;

    private IkenshoKomokuMapping09A(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 意見書項目マッピング09Aのコードを返します。
     *
     * @return 意見書項目マッピング09Aのコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 意見書項目マッピング09Aの名称を返します。
     *
     * @return 意見書項目マッピング09Aの名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 意見書項目マッピング09Aのコードと一致する内容を探します。
     *
     * @param code 意見書項目マッピング09Aのコード
     * @return {@code code} に対応する意見書項目マッピング09A
     */
    public static IkenshoKomokuMapping09A toValue(RString code) {
        for (IkenshoKomokuMapping09A ikenshoKomokuMapping99A : IkenshoKomokuMapping09A.values()) {
            if (ikenshoKomokuMapping99A.code.equals(code)) {
                return ikenshoKomokuMapping99A;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("意見書項目マッピング09A"));
    }
}
