/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.definition.core.hanyorisutoshakaifukushihojinkeigen;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 汎用リスト出力(社会福祉法人軽減)のEnumEntity処理クラスです。
 *
 * @reamsid_L DBD-3900-030 mawy
 */
public enum ShakaiFukushiHojinKeigenCsvEnumEntity {

    /**
     * コード:20 名称:get識別コード 略称:定義なし
     */
    get識別コード("20", "get識別コード"),
    /**
     * コード:30 名称:get住民種別 略称:定義なし
     */
    get住民種別("30", "get住民種別"),
    /**
     * コード:40 名称:氏名 略称:定義なし
     */
    get氏名("40", "get氏名"),
    /**
     * コード:50 名称:get氏名カナ 略称:定義なし
     */
    get氏名カナ("50", "get氏名カナ"),
    /**
     * コード:20 名称:get生年月日 略称:定義なし
     */
    get生年月日("60", "get生年月日"),
    /**
     * コード:70 名称:get年齢 略称:定義なし
     */
    get年齢("70", "get年齢"),
    /**
     * コード:80 名称:get性別 略称:定義なし
     */
    get性別("80", "get性別"),
    /**
     * コード:90 名称:get続柄コード 略称:定義なし
     */
    get続柄コード("90", "get続柄コード"),
    /**
     * コード:100 名称:get世帯コード 略称:定義なし
     */
    get世帯コード("100", "get世帯コード"),
    /**
     * コード:110 名称:get世帯主名 略称:定義なし
     */
    get世帯主名("110", "get世帯主名"),
    /**
     * コード:120 名称:住所コード 略称:定義なし
     */
    get住所コード("120", "get住所コード"),
    /**
     * コード:130 名称:get郵便番号 略称:定義なし
     */
    get郵便番号("130", "get郵便番号"),
    /**
     * コード:140 名称:get住所番地方書 略称:定義なし
     */
    get住所番地方書("140", "get住所番地方書"),
    /**
     * コード:150 名称:get住所 略称:定義なし
     */
    get住所("150", "get住所"),
    /**
     * コード:160 名称:get番地 略称:定義なし
     */
    get番地("160", "get番地"),
    /**
     * コード:170 名称:get方書 略称:定義なし
     */
    get方書("170", "get方書"),
    /**
     * コード:180 名称:get行政区コード 略称:定義なし
     */
    get行政区コード("180", "get行政区コード"),
    /**
     * コード:140 名称:get住所番地方書 略称:定義なし
     */
    get行政区名("190", "get行政区名"),
    /**
     * コード:200 名称:get地区１ 略称:定義なし
     */
    get地区１("200", "get地区１"),
    /**
     * コード:210 名称:get地区２ 略称:定義なし
     */
    get地区２("210", "get地区２"),
    /**
     * コード:220 名称:get地区３ 略称:定義なし
     */
    get地区３("220", "get地区３"),
    /**
     * コード:230 名称:get住所番地方書 略称:定義なし
     */
    get連絡先１("230", "get連絡先１"),
    /**
     * コード:240 名称:get連絡先２ 略称:定義なし
     */
    get連絡先２("240", "get連絡先２"),
    /**
     * コード:250 名称:get登録異動日 略称:定義なし
     */
    get登録異動日("250", "get登録異動日"),
    /**
     * コード:260 名称:get登録事由 略称:定義なし
     */
    get登録事由("260", "get登録事由"),
    /**
     * コード:270 名称:get登録届出日 略称:定義なし
     */
    get登録届出日("270", "get登録届出日"),
    /**
     * コード:280 名称:get住定異動日 略称:定義なし
     */
    get住定異動日("280", "get住定異動日"),
    /**
     * コード:290 名称:get住定事由 略称:定義なし
     */
    get住定事由("290", "get住定事由"),
    /**
     * コード:300 名称:get住定届出日 略称:定義なし
     */
    get住定届出日("300", "get住定届出日"),
    /**
     * コード:310 名称:get消除異動日 略称:定義なし
     */
    get消除異動日("310", "get消除異動日"),
    /**
     * コード:320 名称:get消除事由 略称:定義なし
     */
    get消除事由("320", "get消除事由"),
    /**
     * コード:330 名称:get消除届出日 略称:定義なし
     */
    get消除届出日("330", "get消除届出日"),
    /**
     * コード:340 名称:get転出入理由 略称:定義なし
     */
    get転出入理由("340", "get転出入理由"),
    /**
     * コード:350 名称:get前住所郵便番号 略称:定義なし
     */
    get前住所郵便番号("350", "get前住所郵便番号"),
    /**
     * コード:360 名称:get前住所番地方書 略称:定義なし
     */
    get前住所番地方書("360", "get前住所番地方書"),
    /**
     * コード:370 名称:get前住所 略称:定義なし
     */
    get前住所("370", "get前住所"),
    /**
     * コード:380 名称:get前住所番地 略称:定義なし
     */
    get前住所番地("380", "get前住所番地"),
    /**
     * コード:390 名称:get前住所方書 略称:定義なし
     */
    get前住所方書("390", "get前住所方書"),
    /**
     * コード:400 名称:get市町村コード 略称:定義なし
     */
    get市町村コード("400", "get市町村コード"),
    /**
     * コード:410 名称:get市町村名 略称:定義なし
     */
    get市町村名("410", "get市町村名"),
    /**
     * コード:420 名称:get保険者コード 略称:定義なし
     */
    get保険者コード("420", "get保険者コード"),
    /**
     * コード:430 名称:get保険者名 略称:定義なし
     */
    get保険者名("430", "get保険者名"),
    /**
     * コード:440 名称:get空白 略称:定義なし
     */
    get空白("440", "get空白"),
    /**
     * コード:450 名称:get送付先氏名 略称:定義なし
     */
    get送付先氏名("450", "get送付先氏名"),
    /**
     * コード:460 名称:get送付先氏名カナ 略称:定義なし
     */
    get送付先氏名カナ("460", "get送付先氏名カナ"),
    /**
     * コード:450 名称:get送付先住所コード 略称:定義なし
     */
    get送付先住所コード("470", "get送付先住所コード"),
    /**
     * コード:450 名称:get送付先郵便番号 略称:定義なし
     */
    get送付先郵便番号("480", "get送付先郵便番号"),
    /**
     * コード:490 名称:get送付先住所番地方書 略称:定義なし
     */
    get送付先住所番地方書("490", "get送付先住所番地方書"),
    /**
     * コード:500 名称:get送付先住所 略称:定義なし
     */
    get送付先住所("500", "get送付先住所"),
    /**
     * コード:510 名称:get送付先番地 略称:定義なし
     */
    get送付先番地("510", "get送付先番地"),
    /**
     * コード:520 名称:get送付先住所番地方書 略称:定義なし
     */
    get送付先方書("520", "get送付先方書"),
    /**
     * コード:530 名称:get送付先行政区コード 略称:定義なし
     */
    get送付先行政区コード("530", "get送付先行政区コード"),
    /**
     * コード:540 名称:get送付先行政区名 略称:定義なし
     */
    get送付先行政区名("540", "get送付先行政区名"),
    /**
     * コード:550 名称:get被保険者番号 略称:定義なし
     */
    get被保険者番号("550", "get被保険者番号"),
    /**
     * コード:560 名称:get資格取得事由 略称:定義なし
     */
    get資格取得事由("560", "get資格取得事由"),
    /**
     * コード:570 名称:get資格取得日 略称:定義なし
     */
    get資格取得日("570", "get資格取得日"),
    /**
     * コード:580 名称:get資格取得届出日 略称:定義なし
     */
    get資格取得届出日("580", "get資格取得届出日"),
    /**
     * コード:590 名称:get喪失事由 略称:定義なし
     */
    get喪失事由("590", "get喪失事由"),
    /**
     * コード:600 名称:get資格喪失日 略称:定義なし
     */
    get資格喪失日("600", "get資格喪失日"),
    /**
     * コード:610 名称:get資格喪失届日 略称:定義なし
     */
    get資格喪失届日("610", "get資格喪失届日"),
    /**
     * コード:620 名称:get資格区分 略称:定義なし
     */
    get資格区分("620", "get資格区分"),
    /**
     * コード:630 名称:get資格喪失届日 略称:定義なし
     */
    get住所地特例状態("630", "get住所地特例状態"),
    /**
     * コード:640 名称:get資格証記載保険者番号 略称:定義なし
     */
    get資格証記載保険者番号("640", "get資格証記載保険者番号"),
    /**
     * コード:650 名称:get医療保険種別 略称:定義なし
     */
    get医療保険種別("650", "get医療保険種別"),
    /**
     * コード:660 名称:get医療保険番号 略称:定義なし
     */
    get医療保険番号("660", "get医療保険番号"),
    /**
     * コード:670 名称:get医療保険者名 略称:定義なし
     */
    get医療保険者名("670", "get医療保険者名"),
    /**
     * コード:680 名称:get医療保険記号番号 略称:定義なし
     */
    get医療保険記号番号("680", "get医療保険記号番号"),
    /**
     * コード:690 名称:get特定疾病 略称:定義なし
     */
    get特定疾病("690", "get特定疾病"),
    /**
     * コード:700 名称:get受給申請事由 略称:定義なし
     */
    get受給申請事由("700", "get受給申請事由"),
    /**
     * コード:710 名称:get申請理由 略称:定義なし
     */
    get申請事由("710", "get申請理由"),
    /**
     * コード:720 名称:get申請事由 略称:定義なし
     */
    get申請関係者("720", "get申請関係者"),
    /**
     * コード:730 名称:get本人関係 略称:定義なし
     */
    get本人関係("730", "get本人関係"),
    /**
     * コード:740 名称:get申請氏名 略称:定義なし
     */
    get申請氏名("740", "get申請氏名"),
    /**
     * コード:750 名称:get申請氏名カナ 略称:定義なし
     */
    get申請氏名カナ("750", "get申請氏名カナ"),
    /**
     * コード:760 名称:get申請代行事業者名 略称:定義なし
     */
    get申請代行事業者名("760", "get申請代行事業者名"),
    /**
     * コード:770 名称:get申請代行事業者名カナ 略称:定義なし
     */
    get申請代行事業者名カナ("770", "get申請代行事業者名カナ"),
    /**
     * コード:780 名称:get申請者郵便番号 略称:定義なし
     */
    get申請者郵便番号("780", "get申請者郵便番号"),
    /**
     * コード:790 名称:get申請住所 略称:定義なし
     */
    get申請住所("790", "get申請住所"),
    /**
     * コード:800 名称:get申請連絡先 略称:定義なし
     */
    get申請連絡先("800", "get申請連絡先"),
    /**
     * コード:810 名称:get申請事業コード 略称:定義なし
     */
    get申請事業コード("810", "get申請事業コード"),
    /**
     * コード:820 名称:get受給申請日 略称:定義なし
     */
    get受給申請日("820", "get受給申請日"),
    /**
     * コード:830 名称:get調査委託先コード 略称:定義なし
     */
    get調査委託先コード("830", "get調査委託先コード"),
    /**
     * コード:840 名称:get調査員コード 略称:定義なし
     */
    get調査員コード("840", "get調査員コード"),
    /**
     * コード:850 名称:get委託先名 略称:定義なし
     */
    get委託先名("850", "get委託先名"),
    /**
     * コード:860 名称:get委託先名カナ 略称:定義なし
     */
    get委託先名カナ("860", "get委託先名カナ"),
    /**
     * コード:870 名称:get委託先代表者名 略称:定義なし
     */
    get委託先代表者名("870", "get委託先代表者名"),
    /**
     * コード:880 名称:get委託先代表者名カナ 略称:定義なし
     */
    get委託先代表者名カナ("880", "get委託先代表者名カナ"),
    /**
     * コード:890 名称:get委託先郵便番号 略称:定義なし
     */
    get委託先郵便番号("890", "get委託先郵便番号"),
    /**
     * コード:900 名称:get委託先住所 略称:定義なし
     */
    get委託先住所("900", "get委託先住所"),
    /**
     * コード:910 名称:get委託先連絡先 略称:定義なし
     */
    get委託先連絡先("910", "get委託先連絡先"),
    /**
     * コード:920 名称:get委託先状況 略称:定義なし
     */
    get委託先状況("920", "get委託先状況"),
    /**
     * コード:930 名称:get調査員氏名 略称:定義なし
     */
    get調査員氏名("930", "get調査員氏名"),
    /**
     * コード:940 名称:get調査員氏名カナ 略称:定義なし
     */
    get調査員氏名カナ("940", "get調査員氏名カナ"),
    /**
     * コード:950 名称:get調査員性別 略称:定義なし
     */
    get調査員性別("950", "get調査員性別"),
    /**
     * コード:960 名称:get調査員郵便 略称:定義なし
     */
    get調査員郵便("960", "get調査員郵便"),
    /**
     * コード:970 名称:get調査員住所 略称:定義なし
     */
    get調査員住所("970", "get調査員住所"),
    /**
     * コード:980 名称:get調査員連絡先 略称:定義なし
     */
    get調査員連絡先("980", "get調査員連絡先"),
    /**
     * コード:990 名称:get調査員資格 略称:定義なし
     */
    get調査員資格("990", "get調査員資格"),
    /**
     * コード:1000 名称:get調査員所属機関名 略称:定義なし
     */
    get調査員所属機関名("1000", "get調査員所属機関名"),
    /**
     * コード:1010 名称:get調査員状況 略称:定義なし
     */
    get調査員状況("1010", "get調査員状況"),
    /**
     * コード:1020 名称:get医療機関コード 略称:定義なし
     */
    get医療機関コード("1020", "get医療機関コード"),
    /**
     * コード:1030 名称:get主治医コード 略称:定義なし
     */
    get主治医コード("1030", "get主治医コード"),
    /**
     * コード:1040 名称:get医療機関名称 略称:定義なし
     */
    get医療機関名称("1040", "get医療機関名称"),
    /**
     * コード:1050 名称:get医療機関名称カナ 略称:定義なし
     */
    get医療機関名称カナ("1050", "get医療機関名称カナ"),
    /**
     * コード:1060 名称:get医療機関代表者名 略称:定義なし
     */
    get医療機関代表者名("1060", "get医療機関代表者名"),
    /**
     * コード:1070 名称:get医療機関代表者名カナ 略称:定義なし
     */
    get医療機関代表者名カナ("1070", "get医療機関代表者名カナ"),
    /**
     * コード:1080 名称:get医療機関郵便番号 略称:定義なし
     */
    get医療機関郵便番号("1080", "get医療機関郵便番号"),
    /**
     * コード:1090 名称:get医療機関住所 略称:定義なし
     */
    get医療機関住所("1090", "get医療機関住所"),
    /**
     * コード:1100 名称:get医療機関連絡先 略称:定義なし
     */
    get医療機関連絡先("1100", "get医療機関連絡先"),
    /**
     * コード:1110 名称:get医療機関状況 略称:定義なし
     */
    get医療機関状況("1110", "get医療機関状況"),
    /**
     * コード:1120 名称:get主治医名 略称:定義なし
     */
    get主治医名("1120", "get主治医名"),
    /**
     * コード:1130 名称:get主治医名カナ 略称:定義なし
     */
    get主治医名カナ("1130", "get主治医名カナ"),
    /**
     * コード:1140 名称:get主治医性別 略称:定義なし
     */
    get主治医性別("1140", "get主治医性別"),
    /**
     * コード:1150 名称:get主治医所属 略称:定義なし
     */
    get主治医所属("1150", "get主治医所属"),
    /**
     * コード:1160 名称:get主治医状況 略称:定義なし
     */
    get主治医状況("1160", "get主治医状況"),
    /**
     * コード:1170 名称:get一次判定要介護度 略称:定義なし
     */
    get一次判定要介護度("1170", "get一次判定要介護度"),
    /**
     * コード:1180 名称:get調査委託日 略称:定義なし
     */
    get調査委託日("1180", "get調査委託日"),
    /**
     * コード:1190 名称:get調査予定日 略称:定義なし
     */
    get調査予定日("1190", "get調査予定日"),
    /**
     * コード:1200 名称:get調査終了日 略称:定義なし
     */
    get調査終了日("1200", "get調査終了日"),
    /**
     * コード:1210 名称:get意見依頼日 略称:定義なし
     */
    get意見依頼日("1210", "get意見依頼日"),
    /**
     * コード:1220 名称:get意見予定日 略称:定義なし
     */
    get意見予定日("1220", "get意見予定日"),
    /**
     * コード:1230 名称:get意見取寄日 略称:定義なし
     */
    get意見取寄日("1230", "get意見取寄日"),
    /**
     * コード:1240 名称:get資料作成日 略称:定義なし
     */
    get資料作成日("1240", "get資料作成日"),
    /**
     * コード:1250 名称:get審査予定日 略称:定義なし
     */
    get審査予定日("1250", "get審査予定日"),
    /**
     * コード:1260 名称:get審査回答日 略称:定義なし
     */
    get審査回答日("1260", "get審査回答日"),
    /**
     * コード:1270 名称:get一次判定日 略称:定義なし
     */
    get一次判定日("1270", "get一次判定日"),
    /**
     * コード:1280 名称:get要介護度 略称:定義なし
     */
    get要介護度("1280", "get要介護度"),
    /**
     * コード:1290 名称:get調査終了日 略称:定義なし
     */
    get認定開始日("1290", "get認定開始日"),
    /**
     * コード:1300 名称:get認定終了日 略称:定義なし
     */
    get認定終了日("1300", "get認定終了日"),
    /**
     * コード:1310 名称:get認定終了日 略称:定義なし
     */
    get認定日("1310", "get認定日"),
    /**
     * コード:1320 名称:get旧措置 略称:定義なし
     */
    get旧措置("1320", "get旧措置"),
    /**
     * コード:1330 名称:getみなし更新認定 略称:定義なし
     */
    getみなし更新認定("1330", "getみなし更新認定"),
    /**
     * コード:1340 名称:get審査会意見 略称:定義なし
     */
    get審査会意見("1340", "get審査会意見"),
    /**
     * コード:1350 名称:get指定サービス種類 略称:定義なし
     */
    get指定サービス種類("1350", "get指定サービス種類"),
    /**
     * コード:1360 名称:get認定終了日 略称:定義なし
     */
    get受給喪失日("1360", "get受給喪失日"),
    /**
     * コード:1370 名称:get直近事由 略称:定義なし
     */
    get直近事由("1370", "get直近事由"),
    /**
     * コード:1380 名称:get受給状況 略称:定義なし
     */
    get受給状況("1380", "get受給状況"),
    /**
     * コード:1390 名称:get異動事由コード 略称:定義なし
     */
    get異動事由コード("1390", "get異動事由コード"),
    /**
     * コード:1400 名称:get異動事由追加文 略称:定義なし
     */
    get異動事由追加文("1400", "get異動事由追加文"),
    /**
     * コード:1410 名称:get削除理由コード 略称:定義なし
     */
    get削除理由コード("1410", "get削除理由コード"),
    /**
     * コード:1420 名称:get異動事由文言 略称:定義なし
     */
    get異動事由文言("1420", "get異動事由文言"),
    /**
     * コード:1430 名称:get削除理由文言 略称:定義なし
     */
    get削除理由文言("1430", "get削除理由文言"),
    /**
     * コード:1440 名称:get異動事由追加文 略称:定義なし
     */
    get支援申請区分("1440", "get支援申請区分"),
    /**
     * コード:1450 名称:get初回申請日 略称:定義なし
     */
    get初回申請日("1450", "get初回申請日"),
    /**
     * コード:1460 名称:get異動事由追加文 略称:定義なし
     */
    get初回認定日("1460", "get初回認定日"),
    /**
     * コード:1470 名称:get初回要介護度 略称:定義なし
     */
    get初回要介護度("1470", "get初回要介護度"),
    /**
     * コード:1480 名称:get初回認定開始日 略称:定義なし
     */
    get初回認定開始日("1480", "get初回認定開始日"),
    /**
     * コード:1490 名称:get初回認定終了日 略称:定義なし
     */
    get初回認定終了日("1490", "get初回認定終了日"),
    /**
     * コード:1500 名称:get初回申請事由 略称:定義なし
     */
    get初回申請事由("1500", "get初回申請事由"),
    /**
     * コード:1510 名称:get初回みなし更新 略称:定義なし
     */
    get初回みなし更新("1510", "get初回みなし更新"),
    /**
     * コード:1520 名称:get初回当初認定有効開始日 略称:定義なし
     */
    get初回当初認定有効開始日("1520", "get初回当初認定有効開始日"),
    /**
     * コード:1530 名称:get初回当初認定有効終了日 略称:定義なし
     */
    get初回当初認定有効終了日("1530", "get初回当初認定有効終了日"),
    /**
     * コード:1540 名称:get初回申請事由 略称:定義なし
     */
    get初回支援申請事由("1540", "get初回支援申請事由"),
    /**
     * コード:1550 名称:get初回申請事由 略称:定義なし
     */
    get前回申請日("1550", "get前回申請日"),
    /**
     * コード:1560 名称:get前回認定日 略称:定義なし
     */
    get前回認定日("1560", "get前回認定日"),
    /**
     * コード:1570 名称:get前回要介護度 略称:定義なし
     */
    get前回要介護度("1570", "get前回要介護度"),
    /**
     * コード:1580 名称:get前回認定開始日 略称:定義なし
     */
    get前回認定開始日("1580", "get前回認定開始日"),
    /**
     * コード:1590 名称:get前回認定終了日 略称:定義なし
     */
    get前回認定終了日("1590", "get前回認定終了日"),
    /**
     * コード:1600 名称:get初回申請事由 略称:定義なし
     */
    get前回受給申請事由("1600", "get前回受給申請事由"),
    /**
     * コード:1610 名称:get前回みなし更新 略称:定義なし
     */
    get前回みなし更新("1610", "get前回みなし更新"),
    /**
     * コード:1620 名称:get前回当初認定有効開始日 略称:定義なし
     */
    get前回当初認定有効開始日("1620", "get前回当初認定有効開始日"),
    /**
     * コード:1630 名称:get前回当初認定有効終了日 略称:定義なし
     */
    get前回当初認定有効終了日("1630", "get前回当初認定有効終了日"),
    /**
     * コード:1640 名称:get前回支援申請事由 略称:定義なし
     */
    get前回支援申請事由("140", "get前回支援申請事由"),
    /**
     * コード:1650 名称:get前々回申請日 略称:定義なし
     */
    get前々回申請日("1650", "get前々回申請日"),
    /**
     * コード:1660 名称:get前々回認定日 略称:定義なし
     */
    get前々回認定日("1660", "get前々回認定日"),
    /**
     * コード:1670 名称:get前々回要介護度 略称:定義なし
     */
    get前々回要介護度("1670", "get前々回要介護度"),
    /**
     * コード:1680 名称:get前々回認定開始日 略称:定義なし
     */
    get前々回認定開始日("1680", "get前々回認定開始日"),
    /**
     * コード:1690 名称:get前々回認定終了日 略称:定義なし
     */
    get前々回認定終了日("1690", "get前々回認定終了日"),
    /**
     * コード:1700 名称:get前々回受給申請事由 略称:定義なし
     */
    get前々回受給申請事由("1700", "get前々回受給申請事由"),
    /**
     * コード:1710 名称:get前々回みなし更新 略称:定義なし
     */
    get前々回みなし更新("1710", "get前々回みなし更新"),
    /**
     * コード:1720 名称:get前々回当初認定有効開始日 略称:定義なし
     */
    get前々回当初認定有効開始日("1720", "get前々回当初認定有効開始日"),
    /**
     * コード:1730 名称:前々回当初認定有効終了日 略称:定義なし
     */
    get前々回当初認定有効終了日("1730", "get前々回当初認定有効終了日"),
    /**
     * コード:1740 名称:get前々回支援申請事由 略称:定義なし
     */
    get前々回支援申請事由("1740", "get前々回支援申請事由"),
    /**
     * コード:1750 名称:get障害高齢者自立度 略称:定義なし
     */
    get障害高齢者自立度("1750", "get障害高齢者自立度"),
    /**
     * コード:1760 名称:get認知症高齢者自立度 略称:定義なし
     */
    get認知症高齢者自立度("1760", "get認知症高齢者自立度"),
    /**
     * コード:1770 名称:get訪問支給限度額単位数 略称:定義なし
     */
    get訪問支給限度額単位数("1770", "get訪問支給限度額単位数"),
    /**
     * コード:1780 名称:get訪問支給限度有効開始年月日 略称:定義なし
     */
    get訪問支給限度有効開始年月日("1780", "get訪問支給限度有効開始年月日"),
    /**
     * コード:1790 名称:get訪問支給限度有効終了年月日 略称:定義なし
     */
    get訪問支給限度有効終了年月日("1790", "get訪問支給限度有効終了年月日"),
    /**
     * コード:1800 名称:get短期入所支給限度日数 略称:定義なし
     */
    get短期入所支給限度日数("1800", "get短期入所支給限度日数"),
    /**
     * コード:1810 名称:get短期入所支給限度有効開始年月日 略称:定義なし
     */
    get短期入所支給限度有効開始年月日("1810", "get短期入所支給限度有効開始年月日"),
    /**
     * コード:1820 名称:get短期入所支給限度有効終了年月日 略称:定義なし
     */
    get短期入所支給限度有効終了年月日("1820", "get短期入所支給限度有効終了年月日"),
    /**
     * コード:1830 名称:get短期入所支給限度日数 略称:定義なし
     */
    get当初認定有効開始年月日("1830", "get当初認定有効開始年月日"),
    /**
     * コード:1840 名称:get当初認定有効終了年月日 略称:定義なし
     */
    get当初認定有効終了年月日("1840", "get当初認定有効終了年月日"),
    /**
     * コード:1850 名称:get認定延期通知書発行年月日 略称:定義なし
     */
    get認定延期通知書発行年月日("1850", "get認定延期通知書発行年月日"),
    /**
     * コード:1860 名称:get認定延期通知書発行回数 略称:定義なし
     */
    get認定延期通知書発行回数("1860", "get認定延期通知書発行回数"),
    /**
     * コード:1870 名称:get延期処理見込み開始年月日 略称:定義なし
     */
    get延期処理見込み開始年月日("1870", "get延期処理見込み開始年月日"),
    /**
     * コード:1880 名称:get延期処理見込み終了年月日 略称:定義なし
     */
    get延期処理見込み終了年月日("1880", "get延期処理見込み終了年月日"),
    /**
     * コード:1890 名称:get短期入所支給限度日数 略称:定義なし
     */
    get受給資格証明書発行日１("1890", "get受給資格証明書発行日１"),
    /**
     * コード:1900 名称:get受給資格証明書発行日２ 略称:定義なし
     */
    get受給資格証明書発行日２("1900", "get受給資格証明書発行日２"),
    /**
     * コード:1910 名称:get資格取得前申請区分 略称:定義なし
     */
    get資格取得前申請区分("1910", "get資格取得前申請区分"),
    /**
     * コード:1920 名称:get一次判定結果重み 略称:定義なし
     */
    get一次判定結果重み("1920", "get一次判定結果重み"),
    /**
     * コード:1930 名称:get指定医区分 略称:定義なし
     */
    get指定医区分("1930", "get指定医区分"),
    /**
     * コード:1940 名称:get訪問調査先郵便番号 略称:定義なし
     */
    get訪問調査先郵便番号("1940", "get訪問調査先郵便番号"),
    /**
     * コード:1950 名称:get訪問調査先住所 略称:定義なし
     */
    get訪問調査先住所("1950", "get訪問調査先住所"),
    /**
     * コード:1960 名称:get訪問調査先名称 略称:定義なし
     */
    get訪問調査先名称("1960", "get訪問調査先名称"),
    /**
     * コード:1970 名称:get訪問調査先電話番号 略称:定義なし
     */
    get訪問調査先電話番号("1970", "get訪問調査先電話番号"),
    /**
     * コード:1980 名称:get指定事業者コード 略称:定義なし
     */
    get指定事業者コード("1980", "get指定事業者コード"),
    /**
     * コード:1990 名称:get施設入所日 略称:定義なし
     */
    get施設入所日("1990", "get施設入所日"),
    /**
     * コード:2000 名称:get施設退所日 略称:定義なし
     */
    get施設退所日("2000", "get施設退所日"),
    /**
     * コード:2010 名称:get指定事業者名 略称:定義なし
     */
    get指定事業者名("2010", "get指定事業者名"),
    /**
     * コード:2020 名称:get指定事業者名カナ 略称:定義なし
     */
    get指定事業者名カナ("2020", "get指定事業者名カナ"),
    /**
     * コード:2030 名称:get指定事業者郵便番号 略称:定義なし
     */
    get指定事業者郵便番号("2030", "get指定事業者郵便番号"),
    /**
     * コード:2040 名称:get指定事業者住所 略称:定義なし
     */
    get指定事業者住所("2040", "get指定事業者住所"),
    /**
     * コード:2050 名称:get指定事業者代表者名 略称:定義なし
     */
    get指定事業者代表者名("2050", "get指定事業者代表者名"),
    /**
     * コード:2060 名称:get指定事業者代表者名カナ 略称:定義なし
     */
    get指定事業者代表者名カナ("2060", "get指定事業者代表者名カナ"),
    /**
     * コード:2070 名称:get指定事業者代表者役職 略称:定義なし
     */
    get指定事業者代表者役職("2070", "get指定事業者代表者役職"),
    /**
     * コード:2080 名称:get指定事業者電話番号 略称:定義なし
     */
    get指定事業者電話番号("2080", "get指定事業者電話番号"),
    /**
     * コード:2090 名称:get指定事業者ＦＡＸ番号 略称:定義なし
     */
    get指定事業者ＦＡＸ番号("2090", "get指定事業者ＦＡＸ番号"),
    /**
     * コード:2100 名称:get指定事業者ケアマネ数 略称:定義なし
     */
    get指定事業者ケアマネ数("2100", "get指定事業者ケアマネ数"),
    /**
     * コード:2110 名称:get指定事業者利用者数 略称:定義なし
     */
    get指定事業者利用者数("2110", "get指定事業者利用者数"),
    /**
     * コード:2120 名称:get指定事業者認定日 略称:定義なし
     */
    get指定事業者認定日("2120", "get指定事業者認定日"),
    /**
     * コード:2130 名称:get指定事業者取消日 略称:定義なし
     */
    get指定事業者取消日("2130", "get指定事業者取消日"),
    /**
     * コード:2140 名称:get指定事業者実施地域 略称:定義なし
     */
    get指定事業者実施地域("2140", "get指定事業者実施地域"),
    /**
     * コード:2150 名称:get転出先保険者番号 略称:定義なし
     */
    get転出先保険者番号("2150", "get転出先保険者番号"),
    /**
     * コード:2160 名称:get特定入所者申請日 略称:定義なし
     */
    get特定入所者申請日("2160", "get確認番号"),
    /**
     * コード:2170 名称:get社会福祉法人軽減申請日 略称:定義なし
     */
    get社会福祉法人軽減申請日("2170", "get社会福祉法人軽減申請日"),
    /**
     * コード:2180 名称:get社会福祉法人軽減決定日 略称:定義なし
     */
    get社会福祉法人軽減決定日("2180", "get社会福祉法人軽減決定日"),
    /**
     * コード:2190 名称:get社会福祉法人軽減承認区分 略称:定義なし
     */
    get社会福祉法人軽減承認区分("2190", "get社会福祉法人軽減承認区分"),
    /**
     * コード:2200 名称:get社会福祉法人軽減開始日 略称:定義なし
     */
    get社会福祉法人軽減開始日("2200", "get社会福祉法人軽減開始日"),
    /**
     * コード:2210 名称:get社会福祉法人軽減終了日 略称:定義なし
     */
    get社会福祉法人軽減終了日("2210", "get社会福祉法人軽減終了日"),
    /**
     * コード:2220 名称:get社会福祉法人軽減率 略称:定義なし
     */
    get社会福祉法人軽減率("2220", "get社会福祉法人軽減率"),
    /**
     * コード:2230 名称:get社会福祉法人軽減事由 略称:定義なし
     */
    get社会福祉法人軽減事由("2230", "get社会福祉法人軽減事由"),
    /**
     * コード:2240 名称:get居宅サービス区分 略称:定義なし
     */
    get居宅サービス区分("2240", "get居宅サービス区分"),
    /**
     * コード:2250 名称:get居住費／食費限定区分 略称:定義なし
     */
    get居住費食費限定区分("2250", "get居住費_食費限定区分"),
    /**
     * コード:2260 名称:get旧措置ユニット型個室限定区分 略称:定義なし
     */
    get旧措置ユニット型個室限定区分("2260", "get旧措置ユニット型個室限定区分"),
    /**
     * コード:2270 名称:get被保険者番号_総合事業対象者 略称:定義なし
     */
    get被保険者番号_総合事業対象者("2270", "get被保険者番号_総合事業対象者"),
    /**
     * コード:2280 名称:get履歴番号 略称:定義なし
     */
    get履歴番号("2280", "get履歴番号"),
    /**
     * コード:2290 名称:get事業適用開始日 略称:定義なし
     */
    get事業適用開始日("2290", "get事業適用開始日"),
    /**
     * コード:2300 名称:get事業適用終了日 略称:定義なし
     */
    get事業適用終了日("2300", "get事業適用終了日"),
    /**
     * コード:2310 名称:get事業チェック実施日 略称:定義なし
     */
    get事業チェック実施日("2310", "get事業チェック実施日"),
    /**
     * コード:2290 名称:get事業決定日 略称:定義なし
     */
    get事業決定日("2320", "get事業決定日"),
    /**
     * コード:2330 名称:get届出区分 略称:定義なし
     */
    get届出区分("2330", "get届出区分"),
    /**
     * コード:2340 名称:get居宅計画作成区分 略称:定義なし
     */
    get居宅計画作成区分("2340", "get居宅計画作成区分"),
    /**
     * コード:2480 名称:get計画事業者番号 略称:定義なし
     */
    get計画事業者番号("2350", "get計画事業者番号"),
    /**
     * コード:2490 名称:get計画事業者名 略称:定義なし
     */
    get計画事業者名("2360", "get計画事業者名"),
    /**
     * コード:2500 名称:get計画事業者カナ 略称:定義なし
     */
    get計画事業者カナ("2370", "get計画事業者カナ"),
    /**
     * コード:2510 名称:get計画管理者名 略称:定義なし
     */
    get計画管理者名("2380", "get計画管理者名"),
    /**
     * コード:2520 名称:get計画管理者カナ 略称:定義なし
     */
    get計画管理者カナ("2390", "get計画管理者カナ"),
    /**
     * コード:2530 名称:get計画適用開始日 略称:定義なし
     */
    get計画適用開始日("2400", "get計画適用開始日"),
    /**
     * コード:2540 名称:get計画適用終了日 略称:定義なし
     */
    get計画適用終了日("2410", "get計画適用終了日"),
    /**
     * コード:2550 名称:get計画届出日 略称:定義なし
     */
    get計画届出日("2420", "get計画届出日"),
    /**
     * コード:2560 名称:get計画作成日 略称:定義なし
     */
    get計画作成日("2430", "get計画作成日"),
    /**
     * コード:2570 名称:get計画変更日 略称:定義なし
     */
    get計画変更日("2440", "get計画変更日"),
    /**
     * コード:2580 名称:get変更理由 略称:定義なし
     */
    get変更理由("2450", "get変更理由");
    private final RString code;
    private final RString fullName;

    private ShakaiFukushiHojinKeigenCsvEnumEntity(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 負担限度額認定のコードを返します。
     *
     * @return 負担限度額認定のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 負担限度額認定の名称を返します。
     *
     * @return 負担限度額認定の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 負担限度額認定のコードと一致する内容を探します。
     *
     * @param code 負担限度額認定のコード
     * @return {@code code} に対応する対象リスト
     */
    public static ShakaiFukushiHojinKeigenCsvEnumEntity toValue(RString code) {
        for (ShakaiFukushiHojinKeigenCsvEnumEntity tokubetsuChi : ShakaiFukushiHojinKeigenCsvEnumEntity.values()) {
            if (tokubetsuChi.code.equals(code)) {
                return tokubetsuChi;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("負担限度額認定"));
    }
}
