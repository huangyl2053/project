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

    @CsvField(order = 1, name = "申請書管理番号 ")
    private RString 申請書管理番号;
    @CsvField(order = 2, name = "厚労省IF識別コード")
    private RString 厚労省IF識別コード;
    @CsvField(order = 3, name = "厚労省認定ソフトのバージョン")
    private RString 厚労省認定ソフトのバージョン;
    @CsvField(order = 4, name = "証記載保険者番号")
    private RString 証記載保険者番号;
    @CsvField(order = 5, name = "被保険者番号　")
    private RString 被保険者番号;
    @CsvField(order = 6, name = "認定申請年月日")
    private RString 認定申請年月日;
    @CsvField(order = 7, name = "認定申請区分（申請時）コード")
    private RString 認定申請区分_申請時_コード;
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
    private RString イメージ区分コード;
    @CsvField(order = 25, name = "概況特記テキスト・イメージ区分")
    private RString イメージ区分;
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
    @CsvField(order = 36, name = "認定調査・サービス区分コード")
    private RString サービス区分コード;
    @CsvField(order = 37, name = "認定調査・サービス区分")
    private RString サービス区分;
    @CsvField(order = 38, name = "利用施設名")
    private RString 利用施設名;
    @CsvField(order = 39, name = "利用施設住所")
    private RString 利用施設住所;
    @CsvField(order = 40, name = "利用施設電話番号")
    private RString 利用施設電話番号;
    @CsvField(order = 41, name = "利用施設郵便番号")
    private RString 利用施設郵便番号;
    @CsvField(order = 42, name = "特記")
    private RString 特記;
    @CsvField(order = 43, name = "認定調査特記事項受付年月日")
    private RString 認定調査特記事項受付年月日;
    @CsvField(order = 44, name = "認定調査特記事項受領年月日")
    private RString 認定調査特記事項受領年月日;
    @CsvField(order = 45, name = "住宅改修（改修箇所）")
    private RString 住宅改修;
    @CsvField(order = 46, name = "市町村特別給付サービス種類名")
    private RString 市町村特別給付サービス種類名;
    @CsvField(order = 47, name = "介護保険給付以外の在宅サービス種類名")
    private RString 在宅サービス種類名;
    @CsvField(order = 48, name = "概況特記事項（主訴）")
    private RString 主訴;
    @CsvField(order = 49, name = "概況特記事項（家族状況）")
    private RString 家族状況;
    @CsvField(order = 50, name = "概況特記事項（居住環境）")
    private RString 居住環境;
    @CsvField(order = 51, name = "概況特記事項（機器・器械）")
    private RString 機器_器械;
    @CsvField(order = 52, name = "認定調査特記事項番号")
    private RString 認定調査特記事項番号;
    @CsvField(order = 53, name = "認定調査特記事項連番")
    private RString 認定調査特記事項連番;
    @CsvField(order = 54, name = "原本マスク区分コード")
    private RString 原本マスク区分コード;
    @CsvField(order = 55, name = "原本マスク区分")
    private RString 原本マスク区分;
    @CsvField(order = 56, name = "特記事項")
    private RString 特記事項;
    @CsvField(order = 57, name = "サービスの状況連番")
    private RString サービスの状況連番;
    @CsvField(order = 58, name = "サービスの状況")
    private RString サービスの状況;
    @CsvField(order = 59, name = "サービスの状況フラグ連番")
    private RString サービスの状況フラグ連番;
    @CsvField(order = 60, name = "サービスの状況フラグ")
    private RString サービスの状況フラグ;
    @CsvField(order = 61, name = "記入項目連番")
    private RString 記入項目連番;
    @CsvField(order = 62, name = "サービスの状況記入")
    private RString サービスの状況記入;
    @CsvField(order = 63, name = "施設利用連番")
    private RString 施設利用連番;
    @CsvField(order = 64, name = "施設利用フラグ")
    private RString 施設利用フラグ;
    @CsvField(order = 65, name = "認定調査・認知症高齢者の日常生活自立度コード")
    private RString 認知症日常生活自立度コード;
    @CsvField(order = 66, name = "認定調査・認知症高齢者の日常生活自立度")
    private RString 認知症日常生活自立度;
    @CsvField(order = 67, name = "認定調査・障害高齢者の日常生活自立度コード")
    private RString 障害日常生活自立度コード;
    @CsvField(order = 68, name = "認定調査・障害高齢者の日常生活自立度")
    private RString 障害日常生活自立度;
    @CsvField(order = 69, name = "調査項目連番")
    private RString 調査項目連番;
    @CsvField(order = 70, name = "調査項目文言")
    private RString 調査項目文言;
    @CsvField(order = 71, name = "内容")
    private RString 内容;
}
