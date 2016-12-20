/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.entity.db.relate.ninteichosadataoutput;

import jp.co.ndensan.reams.uz.uza.io.csv.CsvField;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 *
 * 認定調査データ出力（モバイル）CSV用データEntity。
 *
 * @reamsid_L DBE-1860-011 duanzhanli
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class NinteiChosaDataOutputEucCsvEntity {

    @CsvField(order = 1, name = "申請書管理番号")
    private RString 申請書管理番号;
    @CsvField(order = 2, name = "厚労省IF識別コード")
    private RString 厚労省IF識別コード;
    @CsvField(order = 3, name = "厚労省認定ソフトのバージョン")
    private RString 厚労省認定ソフトのバージョン;
    @CsvField(order = 4, name = "証記載保険者番号")
    private RString 証記載保険者番号;
    @CsvField(order = 5, name = "被保険者番号")
    private RString 被保険者番号;
    @CsvField(order = 6, name = "認定申請年月日")
    private RString 認定申請年月日;
    @CsvField(order = 7, name = "認定申請区分（申請時）コード")
    private RString 認定申請区分申請時コード;
    @CsvField(order = 8, name = "認定申請区分（申請時）")
    private RString 認定申請区分申請時;
    @CsvField(order = 9, name = "被保険者氏名")
    private RString 被保険者氏名;
    @CsvField(order = 10, name = "被保険者氏名カナ")
    private RString 被保険者氏名カナ;
    @CsvField(order = 11, name = "生年月日")
    private RString 生年月日;
    @CsvField(order = 12, name = "年齢")
    private RString 年齢;
    @CsvField(order = 13, name = "性別")
    private RString 性別;
    @CsvField(order = 14, name = "郵便番号")
    private RString 郵便番号;
    @CsvField(order = 15, name = "住所")
    private RString 住所;
    @CsvField(order = 16, name = "電話番号")
    private RString 電話番号;
    @CsvField(order = 17, name = "保険者名")
    private RString 保険者名;
    @CsvField(order = 18, name = "認定調査依頼完了年月日")
    private RString 認定調査依頼完了年月日;
    @CsvField(order = 19, name = "認定調査依頼履歴番号")
    private RString 認定調査依頼履歴番号;
    @CsvField(order = 20, name = "認定調査委託先コード")
    private RString 認定調査委託先コード;
    @CsvField(order = 21, name = "調査委託先")
    private RString 調査委託先;
    @CsvField(order = 22, name = "認定調査員コード")
    private RString 認定調査員コード;
    @CsvField(order = 23, name = "調査員氏名")
    private RString 調査員氏名;
    @CsvField(order = 24, name = "概況特記テキスト・イメージ区分コード")
    private RString 概況特記テキスト_イメージ区分コード;
    @CsvField(order = 25, name = "概況特記テキスト・イメージ区分")
    private RString 概況特記テキスト_イメージ区分;
    @CsvField(order = 26, name = "認定調査依頼区分コード")
    private RString 認定調査依頼区分コード;
    @CsvField(order = 27, name = "認定調査依頼区分")
    private RString 認定調査依頼区分;
    @CsvField(order = 28, name = "認定調査回数")
    private RString 認定調査回数;
    @CsvField(order = 29, name = "認定調査実施年月日")
    private RString 認定調査実施年月日;
    @CsvField(order = 30, name = "認定調査受領年月日")
    private RString 認定調査受領年月日;
    @CsvField(order = 31, name = "認定調査区分コード")
    private RString 認定調査区分コード;
    @CsvField(order = 32, name = "認定調査区分")
    private RString 認定調査区分;
    @CsvField(order = 33, name = "認定調査実施場所コード")
    private RString 認定調査実施場所コード;
    @CsvField(order = 34, name = "認定調査実施場所")
    private RString 認定調査実施場所;
    @CsvField(order = 35, name = "認定調査実施場所名称")
    private RString 認定調査実施場所名称;
    @CsvField(order = 36, name = "家族等連絡先郵便番号")
    private RString 家族等連絡先郵便番号;
    @CsvField(order = 37, name = "家族等電話番号")
    private RString 家族等電話番号;
    @CsvField(order = 38, name = "家族等住所")
    private RString 家族等住所;
    @CsvField(order = 39, name = "家族等氏名")
    private RString 家族等氏名;
    @CsvField(order = 40, name = "調査対象者との関係")
    private RString 調査対象者との関係;
    @CsvField(order = 41, name = "認定調査・サービス区分コード")
    private RString 認定調査_サービス区分コード;
    @CsvField(order = 42, name = "認定調査・サービス区分")
    private RString 認定調査_サービス区分;
    @CsvField(order = 43, name = "利用施設名")
    private RString 利用施設名;
    @CsvField(order = 44, name = "利用施設住所")
    private RString 利用施設住所;
    @CsvField(order = 45, name = "利用施設電話番号")
    private RString 利用施設電話番号;
    @CsvField(order = 46, name = "利用施設郵便番号")
    private RString 利用施設郵便番号;
    @CsvField(order = 47, name = "特記")
    private RString 特記;
    @CsvField(order = 48, name = "認定調査特記事項受付年月日")
    private RString 認定調査特記事項受付年月日;
    @CsvField(order = 49, name = "認定調査特記事項受領年月日")
    private RString 認定調査特記事項受領年月日;
    @CsvField(order = 50, name = "住宅改修（改修箇所）")
    private RString 住宅改修_改修箇所;
    @CsvField(order = 51, name = "市町村特別給付サービス種類名")
    private RString 市町村特別給付サービス種類名;
    @CsvField(order = 52, name = "介護保険給付以外の在宅サービス種類名")
    private RString 介護保険給付以外の在宅サービス種類名;
    @CsvField(order = 53, name = "サービスの状況連番01")
    private RString サービスの状況連番01;
    @CsvField(order = 54, name = "サービスの状況01")
    private RString サービスの状況01;
    @CsvField(order = 55, name = "サービスの状況連番02")
    private RString サービスの状況連番02;
    @CsvField(order = 56, name = "サービスの状況02")
    private RString サービスの状況02;
    @CsvField(order = 57, name = "サービスの状況連番03")
    private RString サービスの状況連番03;
    @CsvField(order = 58, name = "サービスの状況03")
    private RString サービスの状況03;
    @CsvField(order = 59, name = "サービスの状況連番04")
    private RString サービスの状況連番04;
    @CsvField(order = 60, name = "サービスの状況04")
    private RString サービスの状況04;
    @CsvField(order = 61, name = "サービスの状況連番05")
    private RString サービスの状況連番05;
    @CsvField(order = 62, name = "サービスの状況05")
    private RString サービスの状況05;
    @CsvField(order = 63, name = "サービスの状況連番06")
    private RString サービスの状況連番06;
    @CsvField(order = 64, name = "サービスの状況06")
    private RString サービスの状況06;
    @CsvField(order = 65, name = "サービスの状況連番07")
    private RString サービスの状況連番07;
    @CsvField(order = 66, name = "サービスの状況07")
    private RString サービスの状況07;
    @CsvField(order = 67, name = "サービスの状況連番08")
    private RString サービスの状況連番08;
    @CsvField(order = 68, name = "サービスの状況08")
    private RString サービスの状況08;
    @CsvField(order = 69, name = "サービスの状況連番09")
    private RString サービスの状況連番09;
    @CsvField(order = 70, name = "サービスの状況09")
    private RString サービスの状況09;
    @CsvField(order = 71, name = "サービスの状況連番10")
    private RString サービスの状況連番10;
    @CsvField(order = 72, name = "サービスの状況10")
    private RString サービスの状況10;
    @CsvField(order = 73, name = "サービスの状況連番11")
    private RString サービスの状況連番11;
    @CsvField(order = 74, name = "サービスの状況11")
    private RString サービスの状況11;
    @CsvField(order = 75, name = "サービスの状況連番12")
    private RString サービスの状況連番12;
    @CsvField(order = 76, name = "サービスの状況12")
    private RString サービスの状況12;
    @CsvField(order = 77, name = "サービスの状況連番13")
    private RString サービスの状況連番13;
    @CsvField(order = 78, name = "サービスの状況13")
    private RString サービスの状況13;
    @CsvField(order = 79, name = "サービスの状況連番14")
    private RString サービスの状況連番14;
    @CsvField(order = 80, name = "サービスの状況14")
    private RString サービスの状況14;
    @CsvField(order = 81, name = "サービスの状況連番15")
    private RString サービスの状況連番15;
    @CsvField(order = 82, name = "サービスの状況15")
    private RString サービスの状況15;
    @CsvField(order = 83, name = "サービスの状況連番16")
    private RString サービスの状況連番16;
    @CsvField(order = 84, name = "サービスの状況16")
    private RString サービスの状況16;
    @CsvField(order = 85, name = "サービスの状況連番17")
    private RString サービスの状況連番17;
    @CsvField(order = 86, name = "サービスの状況17")
    private RString サービスの状況17;
    @CsvField(order = 87, name = "サービスの状況連番18")
    private RString サービスの状況連番18;
    @CsvField(order = 88, name = "サービスの状況18")
    private RString サービスの状況18;
    @CsvField(order = 89, name = "サービスの状況連番19")
    private RString サービスの状況連番19;
    @CsvField(order = 90, name = "サービスの状況19")
    private RString サービスの状況19;
    @CsvField(order = 91, name = "サービスの状況連番20")
    private RString サービスの状況連番20;
    @CsvField(order = 92, name = "サービスの状況20")
    private RString サービスの状況20;
    @CsvField(order = 93, name = "サービスの状況フラグ連番")
    private RString サービスの状況フラグ連番;
    @CsvField(order = 94, name = "サービスの状況フラグ")
    private RString サービスの状況フラグ;
    @CsvField(order = 95, name = "記入項目連番01")
    private RString 記入項目連番01;
    @CsvField(order = 96, name = "サービスの状況記入01")
    private RString サービスの状況記入01;
    @CsvField(order = 97, name = "記入項目連番02")
    private RString 記入項目連番02;
    @CsvField(order = 98, name = "サービスの状況記入02")
    private RString サービスの状況記入02;
    @CsvField(order = 99, name = "施設利用連番01")
    private RString 施設利用連番01;
    @CsvField(order = 100, name = "施設利用フラグ01")
    private RString 施設利用フラグ01;
    @CsvField(order = 101, name = "施設利用連番02")
    private RString 施設利用連番02;
    @CsvField(order = 102, name = "施設利用フラグ02")
    private RString 施設利用フラグ02;
    @CsvField(order = 103, name = "施設利用連番03")
    private RString 施設利用連番03;
    @CsvField(order = 104, name = "施設利用フラグ03")
    private RString 施設利用フラグ03;
    @CsvField(order = 105, name = "施設利用連番04")
    private RString 施設利用連番04;
    @CsvField(order = 106, name = "施設利用フラグ04")
    private RString 施設利用フラグ04;
    @CsvField(order = 107, name = "施設利用連番05")
    private RString 施設利用連番05;
    @CsvField(order = 108, name = "施設利用フラグ05")
    private RString 施設利用フラグ05;
    @CsvField(order = 109, name = "施設利用連番06")
    private RString 施設利用連番06;
    @CsvField(order = 110, name = "施設利用フラグ06")
    private RString 施設利用フラグ06;
    @CsvField(order = 111, name = "施設利用連番07")
    private RString 施設利用連番07;
    @CsvField(order = 112, name = "施設利用フラグ07")
    private RString 施設利用フラグ07;
    @CsvField(order = 113, name = "施設利用連番08")
    private RString 施設利用連番08;
    @CsvField(order = 114, name = "施設利用フラグ08")
    private RString 施設利用フラグ08;
    @CsvField(order = 115, name = "施設利用連番09")
    private RString 施設利用連番09;
    @CsvField(order = 116, name = "施設利用フラグ09")
    private RString 施設利用フラグ09;
    @CsvField(order = 117, name = "認定調査・認知症高齢者の日常生活自立度コード")
    private RString 認定調査_認知症高齢者の日常生活自立度コード;
    @CsvField(order = 118, name = "認定調査・認知症高齢者の日常生活自立度")
    private RString 認定調査_認知症高齢者の日常生活自立度;
    @CsvField(order = 119, name = "認定調査・障害高齢者の日常生活自立度コード")
    private RString 認定調査_障害高齢者の日常生活自立度コード;
    @CsvField(order = 120, name = "認定調査・障害高齢者の日常生活自立度")
    private RString 認定調査_障害高齢者の日常生活自立度;
    @CsvField(order = 121, name = "調査項目連番01")
    private RString 調査項目連番01;
    @CsvField(order = 122, name = "調査項目文言01")
    private RString 調査項目文言01;
    @CsvField(order = 123, name = "内容01")
    private RString 内容01;
    @CsvField(order = 124, name = "調査項目連番02")
    private RString 調査項目連番02;
    @CsvField(order = 125, name = "調査項目文言02")
    private RString 調査項目文言02;
    @CsvField(order = 126, name = "内容02")
    private RString 内容02;
    @CsvField(order = 127, name = "調査項目連番03")
    private RString 調査項目連番03;
    @CsvField(order = 128, name = "調査項目文言03")
    private RString 調査項目文言03;
    @CsvField(order = 129, name = "内容03")
    private RString 内容03;
    @CsvField(order = 130, name = "調査項目連番04")
    private RString 調査項目連番04;
    @CsvField(order = 131, name = "調査項目文言04")
    private RString 調査項目文言04;
    @CsvField(order = 132, name = "内容04")
    private RString 内容04;
    @CsvField(order = 133, name = "調査項目連番05")
    private RString 調査項目連番05;
    @CsvField(order = 134, name = "調査項目文言05")
    private RString 調査項目文言05;
    @CsvField(order = 135, name = "内容05")
    private RString 内容05;
    @CsvField(order = 136, name = "調査項目連番06")
    private RString 調査項目連番06;
    @CsvField(order = 137, name = "調査項目文言06")
    private RString 調査項目文言06;
    @CsvField(order = 138, name = "内容06")
    private RString 内容06;
    @CsvField(order = 139, name = "調査項目連番07")
    private RString 調査項目連番07;
    @CsvField(order = 140, name = "調査項目文言07")
    private RString 調査項目文言07;
    @CsvField(order = 141, name = "内容07")
    private RString 内容07;
    @CsvField(order = 142, name = "調査項目連番08")
    private RString 調査項目連番08;
    @CsvField(order = 143, name = "調査項目文言08")
    private RString 調査項目文言08;
    @CsvField(order = 144, name = "内容08")
    private RString 内容08;
    @CsvField(order = 145, name = "調査項目連番09")
    private RString 調査項目連番09;
    @CsvField(order = 146, name = "調査項目文言09")
    private RString 調査項目文言09;
    @CsvField(order = 147, name = "内容09")
    private RString 内容09;
    @CsvField(order = 148, name = "調査項目連番10")
    private RString 調査項目連番10;
    @CsvField(order = 149, name = "調査項目文言10")
    private RString 調査項目文言10;
    @CsvField(order = 150, name = "内容10")
    private RString 内容10;
    @CsvField(order = 151, name = "調査項目連番11")
    private RString 調査項目連番11;
    @CsvField(order = 152, name = "調査項目文言11")
    private RString 調査項目文言11;
    @CsvField(order = 153, name = "内容11")
    private RString 内容11;
    @CsvField(order = 154, name = "調査項目連番12")
    private RString 調査項目連番12;
    @CsvField(order = 155, name = "調査項目文言12")
    private RString 調査項目文言12;
    @CsvField(order = 156, name = "内容12")
    private RString 内容12;
    @CsvField(order = 157, name = "調査項目連番13")
    private RString 調査項目連番13;
    @CsvField(order = 158, name = "調査項目文言13")
    private RString 調査項目文言13;
    @CsvField(order = 159, name = "内容13")
    private RString 内容13;
    @CsvField(order = 160, name = "調査項目連番14")
    private RString 調査項目連番14;
    @CsvField(order = 161, name = "調査項目文言14")
    private RString 調査項目文言14;
    @CsvField(order = 162, name = "内容14")
    private RString 内容14;
    @CsvField(order = 163, name = "調査項目連番15")
    private RString 調査項目連番15;
    @CsvField(order = 164, name = "調査項目文言15")
    private RString 調査項目文言15;
    @CsvField(order = 165, name = "内容15")
    private RString 内容15;
    @CsvField(order = 166, name = "調査項目連番16")
    private RString 調査項目連番16;
    @CsvField(order = 167, name = "調査項目文言16")
    private RString 調査項目文言16;
    @CsvField(order = 168, name = "内容16")
    private RString 内容16;
    @CsvField(order = 169, name = "調査項目連番17")
    private RString 調査項目連番17;
    @CsvField(order = 170, name = "調査項目文言17")
    private RString 調査項目文言17;
    @CsvField(order = 171, name = "内容17")
    private RString 内容17;
    @CsvField(order = 172, name = "調査項目連番18")
    private RString 調査項目連番18;
    @CsvField(order = 173, name = "調査項目文言18")
    private RString 調査項目文言18;
    @CsvField(order = 174, name = "内容18")
    private RString 内容18;
    @CsvField(order = 175, name = "調査項目連番19")
    private RString 調査項目連番19;
    @CsvField(order = 176, name = "調査項目文言19")
    private RString 調査項目文言19;
    @CsvField(order = 177, name = "内容19")
    private RString 内容19;
    @CsvField(order = 178, name = "調査項目連番20")
    private RString 調査項目連番20;
    @CsvField(order = 179, name = "調査項目文言20")
    private RString 調査項目文言20;
    @CsvField(order = 180, name = "内容20")
    private RString 内容20;
    @CsvField(order = 181, name = "調査項目連番21")
    private RString 調査項目連番21;
    @CsvField(order = 182, name = "調査項目文言21")
    private RString 調査項目文言21;
    @CsvField(order = 183, name = "内容21")
    private RString 内容21;
    @CsvField(order = 184, name = "調査項目連番22")
    private RString 調査項目連番22;
    @CsvField(order = 185, name = "調査項目文言22")
    private RString 調査項目文言22;
    @CsvField(order = 186, name = "内容22")
    private RString 内容22;
    @CsvField(order = 187, name = "調査項目連番23")
    private RString 調査項目連番23;
    @CsvField(order = 188, name = "調査項目文言23")
    private RString 調査項目文言23;
    @CsvField(order = 189, name = "内容23")
    private RString 内容23;
    @CsvField(order = 190, name = "調査項目連番24")
    private RString 調査項目連番24;
    @CsvField(order = 191, name = "調査項目文言24")
    private RString 調査項目文言24;
    @CsvField(order = 192, name = "内容24")
    private RString 内容24;
    @CsvField(order = 193, name = "調査項目連番25")
    private RString 調査項目連番25;
    @CsvField(order = 194, name = "調査項目文言25")
    private RString 調査項目文言25;
    @CsvField(order = 195, name = "内容25")
    private RString 内容25;
    @CsvField(order = 196, name = "調査項目連番26")
    private RString 調査項目連番26;
    @CsvField(order = 197, name = "調査項目文言26")
    private RString 調査項目文言26;
    @CsvField(order = 198, name = "内容26")
    private RString 内容26;
    @CsvField(order = 199, name = "調査項目連番27")
    private RString 調査項目連番27;
    @CsvField(order = 200, name = "調査項目文言27")
    private RString 調査項目文言27;
    @CsvField(order = 201, name = "内容27")
    private RString 内容27;
    @CsvField(order = 202, name = "調査項目連番28")
    private RString 調査項目連番28;
    @CsvField(order = 203, name = "調査項目文言28")
    private RString 調査項目文言28;
    @CsvField(order = 204, name = "内容28")
    private RString 内容28;
    @CsvField(order = 205, name = "調査項目連番29")
    private RString 調査項目連番29;
    @CsvField(order = 206, name = "調査項目文言29")
    private RString 調査項目文言29;
    @CsvField(order = 207, name = "内容29")
    private RString 内容29;
    @CsvField(order = 208, name = "調査項目連番30")
    private RString 調査項目連番30;
    @CsvField(order = 209, name = "調査項目文言30")
    private RString 調査項目文言30;
    @CsvField(order = 210, name = "内容30")
    private RString 内容30;
    @CsvField(order = 211, name = "調査項目連番31")
    private RString 調査項目連番31;
    @CsvField(order = 212, name = "調査項目文言31")
    private RString 調査項目文言31;
    @CsvField(order = 213, name = "内容31")
    private RString 内容31;
    @CsvField(order = 214, name = "調査項目連番32")
    private RString 調査項目連番32;
    @CsvField(order = 215, name = "調査項目文言32")
    private RString 調査項目文言32;
    @CsvField(order = 216, name = "内容32")
    private RString 内容32;
    @CsvField(order = 217, name = "調査項目連番33")
    private RString 調査項目連番33;
    @CsvField(order = 218, name = "調査項目文言33")
    private RString 調査項目文言33;
    @CsvField(order = 219, name = "内容33")
    private RString 内容33;
    @CsvField(order = 220, name = "調査項目連番34")
    private RString 調査項目連番34;
    @CsvField(order = 221, name = "調査項目文言34")
    private RString 調査項目文言34;
    @CsvField(order = 222, name = "内容34")
    private RString 内容34;
    @CsvField(order = 223, name = "調査項目連番35")
    private RString 調査項目連番35;
    @CsvField(order = 224, name = "調査項目文言35")
    private RString 調査項目文言35;
    @CsvField(order = 225, name = "内容35")
    private RString 内容35;
    @CsvField(order = 226, name = "調査項目連番36")
    private RString 調査項目連番36;
    @CsvField(order = 227, name = "調査項目文言36")
    private RString 調査項目文言36;
    @CsvField(order = 228, name = "内容36")
    private RString 内容36;
    @CsvField(order = 229, name = "調査項目連番37")
    private RString 調査項目連番37;
    @CsvField(order = 230, name = "調査項目文言37")
    private RString 調査項目文言37;
    @CsvField(order = 231, name = "内容37")
    private RString 内容37;
    @CsvField(order = 232, name = "調査項目連番38")
    private RString 調査項目連番38;
    @CsvField(order = 233, name = "調査項目文言38")
    private RString 調査項目文言38;
    @CsvField(order = 234, name = "内容38")
    private RString 内容38;
    @CsvField(order = 235, name = "調査項目連番39")
    private RString 調査項目連番39;
    @CsvField(order = 236, name = "調査項目文言39")
    private RString 調査項目文言39;
    @CsvField(order = 237, name = "内容39")
    private RString 内容39;
    @CsvField(order = 238, name = "調査項目連番40")
    private RString 調査項目連番40;
    @CsvField(order = 239, name = "調査項目文言40")
    private RString 調査項目文言40;
    @CsvField(order = 240, name = "内容40")
    private RString 内容40;
    @CsvField(order = 241, name = "調査項目連番41")
    private RString 調査項目連番41;
    @CsvField(order = 242, name = "調査項目文言41")
    private RString 調査項目文言41;
    @CsvField(order = 243, name = "内容41")
    private RString 内容41;
    @CsvField(order = 244, name = "調査項目連番42")
    private RString 調査項目連番42;
    @CsvField(order = 245, name = "調査項目文言42")
    private RString 調査項目文言42;
    @CsvField(order = 246, name = "内容42")
    private RString 内容42;
    @CsvField(order = 247, name = "調査項目連番43")
    private RString 調査項目連番43;
    @CsvField(order = 248, name = "調査項目文言43")
    private RString 調査項目文言43;
    @CsvField(order = 249, name = "内容43")
    private RString 内容43;
    @CsvField(order = 250, name = "調査項目連番44")
    private RString 調査項目連番44;
    @CsvField(order = 251, name = "調査項目文言44")
    private RString 調査項目文言44;
    @CsvField(order = 252, name = "内容44")
    private RString 内容44;
    @CsvField(order = 253, name = "調査項目連番45")
    private RString 調査項目連番45;
    @CsvField(order = 254, name = "調査項目文言45")
    private RString 調査項目文言45;
    @CsvField(order = 255, name = "内容45")
    private RString 内容45;
    @CsvField(order = 256, name = "調査項目連番46")
    private RString 調査項目連番46;
    @CsvField(order = 257, name = "調査項目文言46")
    private RString 調査項目文言46;
    @CsvField(order = 258, name = "内容46")
    private RString 内容46;
    @CsvField(order = 259, name = "調査項目連番47")
    private RString 調査項目連番47;
    @CsvField(order = 260, name = "調査項目文言47")
    private RString 調査項目文言47;
    @CsvField(order = 261, name = "内容47")
    private RString 内容47;
    @CsvField(order = 262, name = "調査項目連番48")
    private RString 調査項目連番48;
    @CsvField(order = 263, name = "調査項目文言48")
    private RString 調査項目文言48;
    @CsvField(order = 264, name = "内容48")
    private RString 内容48;
    @CsvField(order = 265, name = "調査項目連番49")
    private RString 調査項目連番49;
    @CsvField(order = 266, name = "調査項目文言49")
    private RString 調査項目文言49;
    @CsvField(order = 267, name = "内容49")
    private RString 内容49;
    @CsvField(order = 268, name = "調査項目連番50")
    private RString 調査項目連番50;
    @CsvField(order = 269, name = "調査項目文言50")
    private RString 調査項目文言50;
    @CsvField(order = 270, name = "内容50")
    private RString 内容50;
    @CsvField(order = 271, name = "調査項目連番51")
    private RString 調査項目連番51;
    @CsvField(order = 272, name = "調査項目文言51")
    private RString 調査項目文言51;
    @CsvField(order = 273, name = "内容51")
    private RString 内容51;
    @CsvField(order = 274, name = "調査項目連番52")
    private RString 調査項目連番52;
    @CsvField(order = 275, name = "調査項目文言52")
    private RString 調査項目文言52;
    @CsvField(order = 276, name = "内容52")
    private RString 内容52;
    @CsvField(order = 277, name = "調査項目連番53")
    private RString 調査項目連番53;
    @CsvField(order = 278, name = "調査項目文言53")
    private RString 調査項目文言53;
    @CsvField(order = 279, name = "内容53")
    private RString 内容53;
    @CsvField(order = 280, name = "調査項目連番54")
    private RString 調査項目連番54;
    @CsvField(order = 281, name = "調査項目文言54")
    private RString 調査項目文言54;
    @CsvField(order = 282, name = "内容54")
    private RString 内容54;
    @CsvField(order = 283, name = "調査項目連番55")
    private RString 調査項目連番55;
    @CsvField(order = 284, name = "調査項目文言55")
    private RString 調査項目文言55;
    @CsvField(order = 285, name = "内容55")
    private RString 内容55;
    @CsvField(order = 286, name = "調査項目連番56")
    private RString 調査項目連番56;
    @CsvField(order = 287, name = "調査項目文言56")
    private RString 調査項目文言56;
    @CsvField(order = 288, name = "内容56")
    private RString 内容56;
    @CsvField(order = 289, name = "調査項目連番57")
    private RString 調査項目連番57;
    @CsvField(order = 290, name = "調査項目文言57")
    private RString 調査項目文言57;
    @CsvField(order = 291, name = "内容57")
    private RString 内容57;
    @CsvField(order = 292, name = "調査項目連番58")
    private RString 調査項目連番58;
    @CsvField(order = 293, name = "調査項目文言58")
    private RString 調査項目文言58;
    @CsvField(order = 294, name = "内容58")
    private RString 内容58;
    @CsvField(order = 295, name = "調査項目連番59")
    private RString 調査項目連番59;
    @CsvField(order = 296, name = "調査項目文言59")
    private RString 調査項目文言59;
    @CsvField(order = 297, name = "内容59")
    private RString 内容59;
    @CsvField(order = 298, name = "調査項目連番60")
    private RString 調査項目連番60;
    @CsvField(order = 299, name = "調査項目文言60")
    private RString 調査項目文言60;
    @CsvField(order = 300, name = "内容60")
    private RString 内容60;
    @CsvField(order = 301, name = "調査項目連番61")
    private RString 調査項目連番61;
    @CsvField(order = 302, name = "調査項目文言61")
    private RString 調査項目文言61;
    @CsvField(order = 303, name = "内容61")
    private RString 内容61;
    @CsvField(order = 304, name = "調査項目連番62")
    private RString 調査項目連番62;
    @CsvField(order = 305, name = "調査項目文言62")
    private RString 調査項目文言62;
    @CsvField(order = 306, name = "内容62")
    private RString 内容62;
    @CsvField(order = 307, name = "調査項目連番63")
    private RString 調査項目連番63;
    @CsvField(order = 308, name = "調査項目文言63")
    private RString 調査項目文言63;
    @CsvField(order = 309, name = "内容63")
    private RString 内容63;
    @CsvField(order = 310, name = "調査項目連番64")
    private RString 調査項目連番64;
    @CsvField(order = 311, name = "調査項目文言64")
    private RString 調査項目文言64;
    @CsvField(order = 312, name = "内容64")
    private RString 内容64;
    @CsvField(order = 313, name = "調査項目連番65")
    private RString 調査項目連番65;
    @CsvField(order = 314, name = "調査項目文言65")
    private RString 調査項目文言65;
    @CsvField(order = 315, name = "内容65")
    private RString 内容65;
    @CsvField(order = 316, name = "調査項目連番66")
    private RString 調査項目連番66;
    @CsvField(order = 317, name = "調査項目文言66")
    private RString 調査項目文言66;
    @CsvField(order = 318, name = "内容66")
    private RString 内容66;
    @CsvField(order = 319, name = "調査項目連番67")
    private RString 調査項目連番67;
    @CsvField(order = 320, name = "調査項目文言67")
    private RString 調査項目文言67;
    @CsvField(order = 321, name = "内容67")
    private RString 内容67;
    @CsvField(order = 322, name = "調査項目連番68")
    private RString 調査項目連番68;
    @CsvField(order = 323, name = "調査項目文言68")
    private RString 調査項目文言68;
    @CsvField(order = 324, name = "内容68")
    private RString 内容68;
    @CsvField(order = 325, name = "調査項目連番69")
    private RString 調査項目連番69;
    @CsvField(order = 326, name = "調査項目文言69")
    private RString 調査項目文言69;
    @CsvField(order = 327, name = "内容69")
    private RString 内容69;
    @CsvField(order = 328, name = "調査項目連番70")
    private RString 調査項目連番70;
    @CsvField(order = 329, name = "調査項目文言70")
    private RString 調査項目文言70;
    @CsvField(order = 330, name = "内容70")
    private RString 内容70;
    @CsvField(order = 331, name = "調査項目連番71")
    private RString 調査項目連番71;
    @CsvField(order = 332, name = "調査項目文言71")
    private RString 調査項目文言71;
    @CsvField(order = 333, name = "内容71")
    private RString 内容71;
    @CsvField(order = 334, name = "調査項目連番72")
    private RString 調査項目連番72;
    @CsvField(order = 335, name = "調査項目文言72")
    private RString 調査項目文言72;
    @CsvField(order = 336, name = "内容72")
    private RString 内容72;
    @CsvField(order = 337, name = "調査項目連番73")
    private RString 調査項目連番73;
    @CsvField(order = 338, name = "調査項目文言73")
    private RString 調査項目文言73;
    @CsvField(order = 339, name = "内容73")
    private RString 内容73;
    @CsvField(order = 340, name = "調査項目連番74")
    private RString 調査項目連番74;
    @CsvField(order = 341, name = "調査項目文言74")
    private RString 調査項目文言74;
    @CsvField(order = 342, name = "内容74")
    private RString 内容74;
    @CsvField(order = 343, name = "前回_証記載保険者番号")
    private RString 前回_証記載保険者番号;
    @CsvField(order = 344, name = "前回_被保険者番号")
    private RString 前回_被保険者番号;
    @CsvField(order = 345, name = "前回_認定申請年月日")
    private RString 前回_認定申請年月日;
    @CsvField(order = 346, name = "前回_認定調査・サービス区分コード")
    private RString 前回_認定調査_サービス区分コード;
    @CsvField(order = 347, name = "前回_認定調査・サービス区分")
    private RString 前回_認定調査_サービス区分;
    @CsvField(order = 348, name = "前回_サービスの状況連番01")
    private RString 前回_サービスの状況連番01;
    @CsvField(order = 349, name = "前回_サービスの状況01")
    private RString 前回_サービスの状況01;
    @CsvField(order = 350, name = "前回_サービスの状況連番02")
    private RString 前回_サービスの状況連番02;
    @CsvField(order = 351, name = "前回_サービスの状況02")
    private RString 前回_サービスの状況02;
    @CsvField(order = 352, name = "前回_サービスの状況連番03")
    private RString 前回_サービスの状況連番03;
    @CsvField(order = 353, name = "前回_サービスの状況03")
    private RString 前回_サービスの状況03;
    @CsvField(order = 354, name = "前回_サービスの状況連番04")
    private RString 前回_サービスの状況連番04;
    @CsvField(order = 355, name = "前回_サービスの状況04")
    private RString 前回_サービスの状況04;
    @CsvField(order = 356, name = "前回_サービスの状況連番05")
    private RString 前回_サービスの状況連番05;
    @CsvField(order = 357, name = "前回_サービスの状況05")
    private RString 前回_サービスの状況05;
    @CsvField(order = 358, name = "前回_サービスの状況連番06")
    private RString 前回_サービスの状況連番06;
    @CsvField(order = 359, name = "前回_サービスの状況06")
    private RString 前回_サービスの状況06;
    @CsvField(order = 360, name = "前回_サービスの状況連番07")
    private RString 前回_サービスの状況連番07;
    @CsvField(order = 361, name = "前回_サービスの状況07")
    private RString 前回_サービスの状況07;
    @CsvField(order = 362, name = "前回_サービスの状況連番08")
    private RString 前回_サービスの状況連番08;
    @CsvField(order = 363, name = "前回_サービスの状況08")
    private RString 前回_サービスの状況08;
    @CsvField(order = 364, name = "前回_サービスの状況連番09")
    private RString 前回_サービスの状況連番09;
    @CsvField(order = 365, name = "前回_サービスの状況09")
    private RString 前回_サービスの状況09;
    @CsvField(order = 366, name = "前回_サービスの状況連番10")
    private RString 前回_サービスの状況連番10;
    @CsvField(order = 367, name = "前回_サービスの状況10")
    private RString 前回_サービスの状況10;
    @CsvField(order = 368, name = "前回_サービスの状況連番11")
    private RString 前回_サービスの状況連番11;
    @CsvField(order = 369, name = "前回_サービスの状況11")
    private RString 前回_サービスの状況11;
    @CsvField(order = 370, name = "前回_サービスの状況連番12")
    private RString 前回_サービスの状況連番12;
    @CsvField(order = 371, name = "前回_サービスの状況12")
    private RString 前回_サービスの状況12;
    @CsvField(order = 372, name = "前回_サービスの状況連番13")
    private RString 前回_サービスの状況連番13;
    @CsvField(order = 373, name = "前回_サービスの状況13")
    private RString 前回_サービスの状況13;
    @CsvField(order = 374, name = "前回_サービスの状況連番14")
    private RString 前回_サービスの状況連番14;
    @CsvField(order = 375, name = "前回_サービスの状況14")
    private RString 前回_サービスの状況14;
    @CsvField(order = 376, name = "前回_サービスの状況連番15")
    private RString 前回_サービスの状況連番15;
    @CsvField(order = 377, name = "前回_サービスの状況15")
    private RString 前回_サービスの状況15;
    @CsvField(order = 378, name = "前回_サービスの状況連番16")
    private RString 前回_サービスの状況連番16;
    @CsvField(order = 379, name = "前回_サービスの状況16")
    private RString 前回_サービスの状況16;
    @CsvField(order = 380, name = "前回_サービスの状況連番17")
    private RString 前回_サービスの状況連番17;
    @CsvField(order = 381, name = "前回_サービスの状況17")
    private RString 前回_サービスの状況17;
    @CsvField(order = 382, name = "前回_サービスの状況連番18")
    private RString 前回_サービスの状況連番18;
    @CsvField(order = 383, name = "前回_サービスの状況18")
    private RString 前回_サービスの状況18;
    @CsvField(order = 384, name = "前回_サービスの状況連番19")
    private RString 前回_サービスの状況連番19;
    @CsvField(order = 385, name = "前回_サービスの状況19")
    private RString 前回_サービスの状況19;
    @CsvField(order = 386, name = "前回_サービスの状況連番20")
    private RString 前回_サービスの状況連番20;
    @CsvField(order = 387, name = "前回_サービスの状況20")
    private RString 前回_サービスの状況20;
    @CsvField(order = 388, name = "前回_サービスの状況フラグ連番")
    private RString 前回_サービスの状況フラグ連番;
    @CsvField(order = 389, name = "前回_サービスの状況フラグ")
    private RString 前回_サービスの状況フラグ;
    @CsvField(order = 390, name = "前回_記入項目連番01")
    private RString 前回_記入項目連番01;
    @CsvField(order = 391, name = "前回_サービスの状況記入01")
    private RString 前回_サービスの状況記入01;
    @CsvField(order = 392, name = "前回_記入項目連番02")
    private RString 前回_記入項目連番02;
    @CsvField(order = 393, name = "前回_サービスの状況記入02")
    private RString 前回_サービスの状況記入02;
    @CsvField(order = 394, name = "前回_施設利用連番01")
    private RString 前回_施設利用連番01;
    @CsvField(order = 395, name = "前回_施設利用フラグ01")
    private RString 前回_施設利用フラグ01;
    @CsvField(order = 396, name = "前回_施設利用連番02")
    private RString 前回_施設利用連番02;
    @CsvField(order = 397, name = "前回_施設利用フラグ02")
    private RString 前回_施設利用フラグ02;
    @CsvField(order = 398, name = "前回_施設利用連番03")
    private RString 前回_施設利用連番03;
    @CsvField(order = 399, name = "前回_施設利用フラグ03")
    private RString 前回_施設利用フラグ03;
    @CsvField(order = 400, name = "前回_施設利用連番04")
    private RString 前回_施設利用連番04;
    @CsvField(order = 401, name = "前回_施設利用フラグ04")
    private RString 前回_施設利用フラグ04;
    @CsvField(order = 402, name = "前回_施設利用連番05")
    private RString 前回_施設利用連番05;
    @CsvField(order = 403, name = "前回_施設利用フラグ05")
    private RString 前回_施設利用フラグ05;
    @CsvField(order = 404, name = "前回_施設利用連番06")
    private RString 前回_施設利用連番06;
    @CsvField(order = 405, name = "前回_施設利用フラグ06")
    private RString 前回_施設利用フラグ06;
    @CsvField(order = 406, name = "前回_施設利用連番07")
    private RString 前回_施設利用連番07;
    @CsvField(order = 407, name = "前回_施設利用フラグ07")
    private RString 前回_施設利用フラグ07;
    @CsvField(order = 408, name = "前回_施設利用連番08")
    private RString 前回_施設利用連番08;
    @CsvField(order = 409, name = "前回_施設利用フラグ08")
    private RString 前回_施設利用フラグ08;
    @CsvField(order = 410, name = "前回_施設利用連番09")
    private RString 前回_施設利用連番09;
    @CsvField(order = 411, name = "前回_施設利用フラグ09")
    private RString 前回_施設利用フラグ09;
    @CsvField(order = 412, name = "前回_認定調査・認知症高齢者の日常生活自立度コード")
    private RString 前回_認定調査_認知症高齢者の日常生活自立度コード;
    @CsvField(order = 413, name = "前回_認定調査・認知症高齢者の日常生活自立度")
    private RString 前回_認定調査_認知症高齢者の日常生活自立度;
    @CsvField(order = 414, name = "前回_認定調査・障害高齢者の日常生活自立度コード")
    private RString 前回_認定調査_障害高齢者の日常生活自立度コード;
    @CsvField(order = 415, name = "前回_認定調査・障害高齢者の日常生活自立度")
    private RString 前回_認定調査_障害高齢者の日常生活自立度;
    @CsvField(order = 416, name = "前回_調査項目連番01")
    private RString 前回_調査項目連番01;
    @CsvField(order = 417, name = "前回_調査項目文言01")
    private RString 前回_調査項目文言01;
    @CsvField(order = 418, name = "前回_内容01")
    private RString 前回_内容01;
    @CsvField(order = 419, name = "前回_調査項目連番02")
    private RString 前回_調査項目連番02;
    @CsvField(order = 420, name = "前回_調査項目文言02")
    private RString 前回_調査項目文言02;
    @CsvField(order = 421, name = "前回_内容02")
    private RString 前回_内容02;
    @CsvField(order = 422, name = "前回_調査項目連番03")
    private RString 前回_調査項目連番03;
    @CsvField(order = 423, name = "前回_調査項目文言03")
    private RString 前回_調査項目文言03;
    @CsvField(order = 424, name = "前回_内容03")
    private RString 前回_内容03;
    @CsvField(order = 425, name = "前回_調査項目連番04")
    private RString 前回_調査項目連番04;
    @CsvField(order = 426, name = "前回_調査項目文言04")
    private RString 前回_調査項目文言04;
    @CsvField(order = 427, name = "前回_内容04")
    private RString 前回_内容04;
    @CsvField(order = 428, name = "前回_調査項目連番05")
    private RString 前回_調査項目連番05;
    @CsvField(order = 429, name = "前回_調査項目文言05")
    private RString 前回_調査項目文言05;
    @CsvField(order = 430, name = "前回_内容05")
    private RString 前回_内容05;
    @CsvField(order = 431, name = "前回_調査項目連番06")
    private RString 前回_調査項目連番06;
    @CsvField(order = 432, name = "前回_調査項目文言06")
    private RString 前回_調査項目文言06;
    @CsvField(order = 433, name = "前回_内容06")
    private RString 前回_内容06;
    @CsvField(order = 434, name = "前回_調査項目連番07")
    private RString 前回_調査項目連番07;
    @CsvField(order = 435, name = "前回_調査項目文言07")
    private RString 前回_調査項目文言07;
    @CsvField(order = 436, name = "前回_内容07")
    private RString 前回_内容07;
    @CsvField(order = 437, name = "前回_調査項目連番08")
    private RString 前回_調査項目連番08;
    @CsvField(order = 438, name = "前回_調査項目文言08")
    private RString 前回_調査項目文言08;
    @CsvField(order = 439, name = "前回_内容08")
    private RString 前回_内容08;
    @CsvField(order = 440, name = "前回_調査項目連番09")
    private RString 前回_調査項目連番09;
    @CsvField(order = 441, name = "前回_調査項目文言09")
    private RString 前回_調査項目文言09;
    @CsvField(order = 442, name = "前回_内容09")
    private RString 前回_内容09;
    @CsvField(order = 443, name = "前回_調査項目連番10")
    private RString 前回_調査項目連番10;
    @CsvField(order = 444, name = "前回_調査項目文言10")
    private RString 前回_調査項目文言10;
    @CsvField(order = 445, name = "前回_内容10")
    private RString 前回_内容10;
    @CsvField(order = 446, name = "前回_調査項目連番11")
    private RString 前回_調査項目連番11;
    @CsvField(order = 447, name = "前回_調査項目文言11")
    private RString 前回_調査項目文言11;
    @CsvField(order = 448, name = "前回_内容11")
    private RString 前回_内容11;
    @CsvField(order = 449, name = "前回_調査項目連番12")
    private RString 前回_調査項目連番12;
    @CsvField(order = 450, name = "前回_調査項目文言12")
    private RString 前回_調査項目文言12;
    @CsvField(order = 451, name = "前回_内容12")
    private RString 前回_内容12;
    @CsvField(order = 452, name = "前回_調査項目連番13")
    private RString 前回_調査項目連番13;
    @CsvField(order = 453, name = "前回_調査項目文言13")
    private RString 前回_調査項目文言13;
    @CsvField(order = 454, name = "前回_内容13")
    private RString 前回_内容13;
    @CsvField(order = 455, name = "前回_調査項目連番14")
    private RString 前回_調査項目連番14;
    @CsvField(order = 456, name = "前回_調査項目文言14")
    private RString 前回_調査項目文言14;
    @CsvField(order = 457, name = "前回_内容14")
    private RString 前回_内容14;
    @CsvField(order = 458, name = "前回_調査項目連番15")
    private RString 前回_調査項目連番15;
    @CsvField(order = 459, name = "前回_調査項目文言15")
    private RString 前回_調査項目文言15;
    @CsvField(order = 460, name = "前回_内容15")
    private RString 前回_内容15;
    @CsvField(order = 461, name = "前回_調査項目連番16")
    private RString 前回_調査項目連番16;
    @CsvField(order = 462, name = "前回_調査項目文言16")
    private RString 前回_調査項目文言16;
    @CsvField(order = 463, name = "前回_内容16")
    private RString 前回_内容16;
    @CsvField(order = 464, name = "前回_調査項目連番17")
    private RString 前回_調査項目連番17;
    @CsvField(order = 465, name = "前回_調査項目文言17")
    private RString 前回_調査項目文言17;
    @CsvField(order = 466, name = "前回_内容17")
    private RString 前回_内容17;
    @CsvField(order = 467, name = "前回_調査項目連番18")
    private RString 前回_調査項目連番18;
    @CsvField(order = 468, name = "前回_調査項目文言18")
    private RString 前回_調査項目文言18;
    @CsvField(order = 469, name = "前回_内容18")
    private RString 前回_内容18;
    @CsvField(order = 470, name = "前回_調査項目連番19")
    private RString 前回_調査項目連番19;
    @CsvField(order = 471, name = "前回_調査項目文言19")
    private RString 前回_調査項目文言19;
    @CsvField(order = 472, name = "前回_内容19")
    private RString 前回_内容19;
    @CsvField(order = 473, name = "前回_調査項目連番20")
    private RString 前回_調査項目連番20;
    @CsvField(order = 474, name = "前回_調査項目文言20")
    private RString 前回_調査項目文言20;
    @CsvField(order = 475, name = "前回_内容20")
    private RString 前回_内容20;
    @CsvField(order = 476, name = "前回_調査項目連番21")
    private RString 前回_調査項目連番21;
    @CsvField(order = 477, name = "前回_調査項目文言21")
    private RString 前回_調査項目文言21;
    @CsvField(order = 478, name = "前回_内容21")
    private RString 前回_内容21;
    @CsvField(order = 479, name = "前回_調査項目連番22")
    private RString 前回_調査項目連番22;
    @CsvField(order = 480, name = "前回_調査項目文言22")
    private RString 前回_調査項目文言22;
    @CsvField(order = 481, name = "前回_内容22")
    private RString 前回_内容22;
    @CsvField(order = 482, name = "前回_調査項目連番23")
    private RString 前回_調査項目連番23;
    @CsvField(order = 483, name = "前回_調査項目文言23")
    private RString 前回_調査項目文言23;
    @CsvField(order = 484, name = "前回_内容23")
    private RString 前回_内容23;
    @CsvField(order = 485, name = "前回_調査項目連番24")
    private RString 前回_調査項目連番24;
    @CsvField(order = 486, name = "前回_調査項目文言24")
    private RString 前回_調査項目文言24;
    @CsvField(order = 487, name = "前回_内容24")
    private RString 前回_内容24;
    @CsvField(order = 488, name = "前回_調査項目連番25")
    private RString 前回_調査項目連番25;
    @CsvField(order = 489, name = "前回_調査項目文言25")
    private RString 前回_調査項目文言25;
    @CsvField(order = 490, name = "前回_内容25")
    private RString 前回_内容25;
    @CsvField(order = 491, name = "前回_調査項目連番26")
    private RString 前回_調査項目連番26;
    @CsvField(order = 492, name = "前回_調査項目文言26")
    private RString 前回_調査項目文言26;
    @CsvField(order = 493, name = "前回_内容26")
    private RString 前回_内容26;
    @CsvField(order = 494, name = "前回_調査項目連番27")
    private RString 前回_調査項目連番27;
    @CsvField(order = 495, name = "前回_調査項目文言27")
    private RString 前回_調査項目文言27;
    @CsvField(order = 496, name = "前回_内容27")
    private RString 前回_内容27;
    @CsvField(order = 497, name = "前回_調査項目連番28")
    private RString 前回_調査項目連番28;
    @CsvField(order = 498, name = "前回_調査項目文言28")
    private RString 前回_調査項目文言28;
    @CsvField(order = 499, name = "前回_内容28")
    private RString 前回_内容28;
    @CsvField(order = 500, name = "前回_調査項目連番29")
    private RString 前回_調査項目連番29;
    @CsvField(order = 501, name = "前回_調査項目文言29")
    private RString 前回_調査項目文言29;
    @CsvField(order = 502, name = "前回_内容29")
    private RString 前回_内容29;
    @CsvField(order = 503, name = "前回_調査項目連番30")
    private RString 前回_調査項目連番30;
    @CsvField(order = 504, name = "前回_調査項目文言30")
    private RString 前回_調査項目文言30;
    @CsvField(order = 505, name = "前回_内容30")
    private RString 前回_内容30;
    @CsvField(order = 506, name = "前回_調査項目連番31")
    private RString 前回_調査項目連番31;
    @CsvField(order = 507, name = "前回_調査項目文言31")
    private RString 前回_調査項目文言31;
    @CsvField(order = 508, name = "前回_内容31")
    private RString 前回_内容31;
    @CsvField(order = 509, name = "前回_調査項目連番32")
    private RString 前回_調査項目連番32;
    @CsvField(order = 510, name = "前回_調査項目文言32")
    private RString 前回_調査項目文言32;
    @CsvField(order = 511, name = "前回_内容32")
    private RString 前回_内容32;
    @CsvField(order = 512, name = "前回_調査項目連番33")
    private RString 前回_調査項目連番33;
    @CsvField(order = 513, name = "前回_調査項目文言33")
    private RString 前回_調査項目文言33;
    @CsvField(order = 514, name = "前回_内容33")
    private RString 前回_内容33;
    @CsvField(order = 515, name = "前回_調査項目連番34")
    private RString 前回_調査項目連番34;
    @CsvField(order = 516, name = "前回_調査項目文言34")
    private RString 前回_調査項目文言34;
    @CsvField(order = 517, name = "前回_内容34")
    private RString 前回_内容34;
    @CsvField(order = 518, name = "前回_調査項目連番35")
    private RString 前回_調査項目連番35;
    @CsvField(order = 519, name = "前回_調査項目文言35")
    private RString 前回_調査項目文言35;
    @CsvField(order = 520, name = "前回_内容35")
    private RString 前回_内容35;
    @CsvField(order = 521, name = "前回_調査項目連番36")
    private RString 前回_調査項目連番36;
    @CsvField(order = 522, name = "前回_調査項目文言36")
    private RString 前回_調査項目文言36;
    @CsvField(order = 523, name = "前回_内容36")
    private RString 前回_内容36;
    @CsvField(order = 524, name = "前回_調査項目連番37")
    private RString 前回_調査項目連番37;
    @CsvField(order = 525, name = "前回_調査項目文言37")
    private RString 前回_調査項目文言37;
    @CsvField(order = 526, name = "前回_内容37")
    private RString 前回_内容37;
    @CsvField(order = 527, name = "前回_調査項目連番38")
    private RString 前回_調査項目連番38;
    @CsvField(order = 528, name = "前回_調査項目文言38")
    private RString 前回_調査項目文言38;
    @CsvField(order = 529, name = "前回_内容38")
    private RString 前回_内容38;
    @CsvField(order = 530, name = "前回_調査項目連番39")
    private RString 前回_調査項目連番39;
    @CsvField(order = 531, name = "前回_調査項目文言39")
    private RString 前回_調査項目文言39;
    @CsvField(order = 532, name = "前回_内容39")
    private RString 前回_内容39;
    @CsvField(order = 533, name = "前回_調査項目連番40")
    private RString 前回_調査項目連番40;
    @CsvField(order = 534, name = "前回_調査項目文言40")
    private RString 前回_調査項目文言40;
    @CsvField(order = 535, name = "前回_内容40")
    private RString 前回_内容40;
    @CsvField(order = 536, name = "前回_調査項目連番41")
    private RString 前回_調査項目連番41;
    @CsvField(order = 537, name = "前回_調査項目文言41")
    private RString 前回_調査項目文言41;
    @CsvField(order = 538, name = "前回_内容41")
    private RString 前回_内容41;
    @CsvField(order = 539, name = "前回_調査項目連番42")
    private RString 前回_調査項目連番42;
    @CsvField(order = 540, name = "前回_調査項目文言42")
    private RString 前回_調査項目文言42;
    @CsvField(order = 541, name = "前回_内容42")
    private RString 前回_内容42;
    @CsvField(order = 542, name = "前回_調査項目連番43")
    private RString 前回_調査項目連番43;
    @CsvField(order = 543, name = "前回_調査項目文言43")
    private RString 前回_調査項目文言43;
    @CsvField(order = 544, name = "前回_内容43")
    private RString 前回_内容43;
    @CsvField(order = 545, name = "前回_調査項目連番44")
    private RString 前回_調査項目連番44;
    @CsvField(order = 546, name = "前回_調査項目文言44")
    private RString 前回_調査項目文言44;
    @CsvField(order = 547, name = "前回_内容44")
    private RString 前回_内容44;
    @CsvField(order = 548, name = "前回_調査項目連番45")
    private RString 前回_調査項目連番45;
    @CsvField(order = 549, name = "前回_調査項目文言45")
    private RString 前回_調査項目文言45;
    @CsvField(order = 550, name = "前回_内容45")
    private RString 前回_内容45;
    @CsvField(order = 551, name = "前回_調査項目連番46")
    private RString 前回_調査項目連番46;
    @CsvField(order = 552, name = "前回_調査項目文言46")
    private RString 前回_調査項目文言46;
    @CsvField(order = 553, name = "前回_内容46")
    private RString 前回_内容46;
    @CsvField(order = 554, name = "前回_調査項目連番47")
    private RString 前回_調査項目連番47;
    @CsvField(order = 555, name = "前回_調査項目文言47")
    private RString 前回_調査項目文言47;
    @CsvField(order = 556, name = "前回_内容47")
    private RString 前回_内容47;
    @CsvField(order = 557, name = "前回_調査項目連番48")
    private RString 前回_調査項目連番48;
    @CsvField(order = 558, name = "前回_調査項目文言48")
    private RString 前回_調査項目文言48;
    @CsvField(order = 559, name = "前回_内容48")
    private RString 前回_内容48;
    @CsvField(order = 560, name = "前回_調査項目連番49")
    private RString 前回_調査項目連番49;
    @CsvField(order = 561, name = "前回_調査項目文言49")
    private RString 前回_調査項目文言49;
    @CsvField(order = 562, name = "前回_内容49")
    private RString 前回_内容49;
    @CsvField(order = 563, name = "前回_調査項目連番50")
    private RString 前回_調査項目連番50;
    @CsvField(order = 564, name = "前回_調査項目文言50")
    private RString 前回_調査項目文言50;
    @CsvField(order = 565, name = "前回_内容50")
    private RString 前回_内容50;
    @CsvField(order = 566, name = "前回_調査項目連番51")
    private RString 前回_調査項目連番51;
    @CsvField(order = 567, name = "前回_調査項目文言51")
    private RString 前回_調査項目文言51;
    @CsvField(order = 568, name = "前回_内容51")
    private RString 前回_内容51;
    @CsvField(order = 569, name = "前回_調査項目連番52")
    private RString 前回_調査項目連番52;
    @CsvField(order = 570, name = "前回_調査項目文言52")
    private RString 前回_調査項目文言52;
    @CsvField(order = 571, name = "前回_内容52")
    private RString 前回_内容52;
    @CsvField(order = 572, name = "前回_調査項目連番53")
    private RString 前回_調査項目連番53;
    @CsvField(order = 573, name = "前回_調査項目文言53")
    private RString 前回_調査項目文言53;
    @CsvField(order = 574, name = "前回_内容53")
    private RString 前回_内容53;
    @CsvField(order = 575, name = "前回_調査項目連番54")
    private RString 前回_調査項目連番54;
    @CsvField(order = 576, name = "前回_調査項目文言54")
    private RString 前回_調査項目文言54;
    @CsvField(order = 577, name = "前回_内容54")
    private RString 前回_内容54;
    @CsvField(order = 578, name = "前回_調査項目連番55")
    private RString 前回_調査項目連番55;
    @CsvField(order = 579, name = "前回_調査項目文言55")
    private RString 前回_調査項目文言55;
    @CsvField(order = 580, name = "前回_内容55")
    private RString 前回_内容55;
    @CsvField(order = 581, name = "前回_調査項目連番56")
    private RString 前回_調査項目連番56;
    @CsvField(order = 582, name = "前回_調査項目文言56")
    private RString 前回_調査項目文言56;
    @CsvField(order = 583, name = "前回_内容56")
    private RString 前回_内容56;
    @CsvField(order = 584, name = "前回_調査項目連番57")
    private RString 前回_調査項目連番57;
    @CsvField(order = 585, name = "前回_調査項目文言57")
    private RString 前回_調査項目文言57;
    @CsvField(order = 586, name = "前回_内容57")
    private RString 前回_内容57;
    @CsvField(order = 587, name = "前回_調査項目連番58")
    private RString 前回_調査項目連番58;
    @CsvField(order = 588, name = "前回_調査項目文言58")
    private RString 前回_調査項目文言58;
    @CsvField(order = 589, name = "前回_内容58")
    private RString 前回_内容58;
    @CsvField(order = 590, name = "前回_調査項目連番59")
    private RString 前回_調査項目連番59;
    @CsvField(order = 591, name = "前回_調査項目文言59")
    private RString 前回_調査項目文言59;
    @CsvField(order = 592, name = "前回_内容59")
    private RString 前回_内容59;
    @CsvField(order = 593, name = "前回_調査項目連番60")
    private RString 前回_調査項目連番60;
    @CsvField(order = 594, name = "前回_調査項目文言60")
    private RString 前回_調査項目文言60;
    @CsvField(order = 595, name = "前回_内容60")
    private RString 前回_内容60;
    @CsvField(order = 596, name = "前回_調査項目連番61")
    private RString 前回_調査項目連番61;
    @CsvField(order = 597, name = "前回_調査項目文言61")
    private RString 前回_調査項目文言61;
    @CsvField(order = 598, name = "前回_内容61")
    private RString 前回_内容61;
    @CsvField(order = 599, name = "前回_調査項目連番62")
    private RString 前回_調査項目連番62;
    @CsvField(order = 600, name = "前回_調査項目文言62")
    private RString 前回_調査項目文言62;
    @CsvField(order = 601, name = "前回_内容62")
    private RString 前回_内容62;
    @CsvField(order = 602, name = "前回_調査項目連番63")
    private RString 前回_調査項目連番63;
    @CsvField(order = 603, name = "前回_調査項目文言63")
    private RString 前回_調査項目文言63;
    @CsvField(order = 604, name = "前回_内容63")
    private RString 前回_内容63;
    @CsvField(order = 605, name = "前回_調査項目連番64")
    private RString 前回_調査項目連番64;
    @CsvField(order = 606, name = "前回_調査項目文言64")
    private RString 前回_調査項目文言64;
    @CsvField(order = 607, name = "前回_内容64")
    private RString 前回_内容64;
    @CsvField(order = 608, name = "前回_調査項目連番65")
    private RString 前回_調査項目連番65;
    @CsvField(order = 609, name = "前回_調査項目文言65")
    private RString 前回_調査項目文言65;
    @CsvField(order = 610, name = "前回_内容65")
    private RString 前回_内容65;
    @CsvField(order = 611, name = "前回_調査項目連番66")
    private RString 前回_調査項目連番66;
    @CsvField(order = 612, name = "前回_調査項目文言66")
    private RString 前回_調査項目文言66;
    @CsvField(order = 613, name = "前回_内容66")
    private RString 前回_内容66;
    @CsvField(order = 614, name = "前回_調査項目連番67")
    private RString 前回_調査項目連番67;
    @CsvField(order = 615, name = "前回_調査項目文言67")
    private RString 前回_調査項目文言67;
    @CsvField(order = 616, name = "前回_内容67")
    private RString 前回_内容67;
    @CsvField(order = 617, name = "前回_調査項目連番68")
    private RString 前回_調査項目連番68;
    @CsvField(order = 618, name = "前回_調査項目文言68")
    private RString 前回_調査項目文言68;
    @CsvField(order = 619, name = "前回_内容68")
    private RString 前回_内容68;
    @CsvField(order = 620, name = "前回_調査項目連番69")
    private RString 前回_調査項目連番69;
    @CsvField(order = 621, name = "前回_調査項目文言69")
    private RString 前回_調査項目文言69;
    @CsvField(order = 622, name = "前回_内容69")
    private RString 前回_内容69;
    @CsvField(order = 623, name = "前回_調査項目連番70")
    private RString 前回_調査項目連番70;
    @CsvField(order = 624, name = "前回_調査項目文言70")
    private RString 前回_調査項目文言70;
    @CsvField(order = 625, name = "前回_内容70")
    private RString 前回_内容70;
    @CsvField(order = 626, name = "前回_調査項目連番71")
    private RString 前回_調査項目連番71;
    @CsvField(order = 627, name = "前回_調査項目文言71")
    private RString 前回_調査項目文言71;
    @CsvField(order = 628, name = "前回_内容71")
    private RString 前回_内容71;
    @CsvField(order = 629, name = "前回_調査項目連番72")
    private RString 前回_調査項目連番72;
    @CsvField(order = 630, name = "前回_調査項目文言72")
    private RString 前回_調査項目文言72;
    @CsvField(order = 631, name = "前回_内容72")
    private RString 前回_内容72;
    @CsvField(order = 632, name = "前回_調査項目連番73")
    private RString 前回_調査項目連番73;
    @CsvField(order = 633, name = "前回_調査項目文言73")
    private RString 前回_調査項目文言73;
    @CsvField(order = 634, name = "前回_内容73")
    private RString 前回_内容73;
    @CsvField(order = 635, name = "前回_調査項目連番74")
    private RString 前回_調査項目連番74;
    @CsvField(order = 636, name = "前回_調査項目文言74")
    private RString 前回_調査項目文言74;
    @CsvField(order = 637, name = "前回_内容74")
    private RString 前回_内容74;
    @CsvField(order = 638, name = "ステータス")
    private RString ステータス;
    @CsvField(order = 639, name = "被保険者区分")
    private RString 被保険者区分;

}
