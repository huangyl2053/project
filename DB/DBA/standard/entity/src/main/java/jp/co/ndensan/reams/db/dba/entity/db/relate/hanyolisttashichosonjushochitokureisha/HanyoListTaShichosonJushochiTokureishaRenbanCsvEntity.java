/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.entity.db.relate.hanyolisttashichosonjushochitokureisha;

import jp.co.ndensan.reams.uz.uza.io.csv.CsvField;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 汎用リスト_他市町村住所地特例者CsvEntity。
 *
 * @reamsid_L DBA-1590-030 yaodongsheng
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class HanyoListTaShichosonJushochiTokureishaRenbanCsvEntity {

    @CsvField(order = 1, name = "連番")
    private RString 連番;
    @CsvField(order = 2, name = "識別コード")
    private RString 識別コード;
    @CsvField(order = 3, name = "住民種別")
    private RString 住民種別;
    @CsvField(order = 4, name = "氏名")
    private RString 氏名;
    @CsvField(order = 5, name = "氏名カナ")
    private RString 氏名カナ;
    @CsvField(order = 6, name = "生年月日")
    private RString 生年月日;
    @CsvField(order = 7, name = "年齢")
    private RString 年齢;
    @CsvField(order = 8, name = "性別")
    private RString 性別;
    @CsvField(order = 9, name = "続柄コード")
    private RString 続柄コード;
    @CsvField(order = 10, name = "世帯コード")
    private RString 世帯コード;
    @CsvField(order = 11, name = "世帯主名")
    private RString 世帯主名;
    @CsvField(order = 12, name = "住所コード")
    private RString 住所コード;
    @CsvField(order = 13, name = "郵便番号")
    private RString 郵便番号;
    @CsvField(order = 14, name = "住所＋番地＋方書")
    private RString 住所番地方書;
    @CsvField(order = 15, name = "住所")
    private RString 住所;
    @CsvField(order = 16, name = "番地")
    private RString 番地;
    @CsvField(order = 17, name = "方書")
    private RString 方書;
    @CsvField(order = 18, name = "行政区コード")
    private RString 行政区コード;
    @CsvField(order = 19, name = "行政区名")
    private RString 行政区名;
    @CsvField(order = 20, name = "地区１")
    private RString 地区１;
    @CsvField(order = 21, name = "地区２")
    private RString 地区２;
    @CsvField(order = 22, name = "地区３")
    private RString 地区３;
    @CsvField(order = 23, name = "連絡先１")
    private RString 連絡先１;
    @CsvField(order = 24, name = "連絡先２")
    private RString 連絡先２;
    @CsvField(order = 25, name = "登録異動日")
    private RString 登録異動日;
    @CsvField(order = 26, name = "登録事由")
    private RString 登録事由;
    @CsvField(order = 27, name = "登録届出日")
    private RString 登録届出日;
    @CsvField(order = 28, name = "住定異動日")
    private RString 住定異動日;
    @CsvField(order = 29, name = "住定事由")
    private RString 住定事由;
    @CsvField(order = 30, name = "住定届出日")
    private RString 住定届出日;
    @CsvField(order = 31, name = "消除異動日")
    private RString 消除異動日;
    @CsvField(order = 32, name = "消除事由")
    private RString 消除事由;
    @CsvField(order = 33, name = "消除届出日")
    private RString 消除届出日;
    @CsvField(order = 34, name = "転出入理由")
    private RString 転出入理由;
    @CsvField(order = 35, name = "前住所郵便番号")
    private RString 前住所郵便番号;
    @CsvField(order = 36, name = "前住所＋番地＋方書")
    private RString 前住所番地方書;
    @CsvField(order = 37, name = "前住所")
    private RString 前住所;
    @CsvField(order = 38, name = "前住所番地")
    private RString 前住所番地;
    @CsvField(order = 39, name = "前住所方書")
    private RString 前住所方書;
    @CsvField(order = 40, name = "市町村コード")
    private RString 市町村コード;
    @CsvField(order = 41, name = "市町村名")
    private RString 市町村名;
    @CsvField(order = 42, name = "保険者コード")
    private RString 保険者コード;
    @CsvField(order = 43, name = "保険者名")
    private RString 保険者名;
    @CsvField(order = 44, name = "空白")
    private RString 空白;
    @CsvField(order = 45, name = "被保険者番号")
    private RString 被保険者番号;
    @CsvField(order = 46, name = "資格取得事由")
    private RString 資格取得事由;
    @CsvField(order = 47, name = "資格取得日")
    private RString 資格取得日;
    @CsvField(order = 48, name = "資格取得届出日")
    private RString 資格取得届出日;
    @CsvField(order = 49, name = "喪失事由")
    private RString 喪失事由;
    @CsvField(order = 50, name = "資格喪失日")
    private RString 資格喪失日;
    @CsvField(order = 51, name = "資格喪失届日")
    private RString 資格喪失届日;
    @CsvField(order = 52, name = "資格区分")
    private RString 資格区分;
    @CsvField(order = 53, name = "住所地特例状態")
    private RString 住所地特例状態;
    @CsvField(order = 54, name = "（資格）証記載保険者番号")
    private RString 資格証記載保険者番号;
    @CsvField(order = 55, name = "他住所特例適用事由")
    private RString 他住所特例適用事由;
    @CsvField(order = 56, name = "他住所特例適用日")
    private RString 他住所特例適用日;
    @CsvField(order = 57, name = "他住所特例適用届出日")
    private RString 他住所特例適用届出日;
    @CsvField(order = 58, name = "他住所特例解除事由")
    private RString 他住所特例解除事由;
    @CsvField(order = 59, name = "他住所特例解除日")
    private RString 他住所特例解除日;
    @CsvField(order = 60, name = "他住所特例解除届出日")
    private RString 他住所特例解除届出日;
    @CsvField(order = 61, name = "他住所特例施設コード")
    private RString 他住所特例施設コード;
    @CsvField(order = 62, name = "他住所特例施設名称")
    private RString 他住所特例施設名称;
    @CsvField(order = 63, name = "他住所特例施設郵便番号")
    private RString 他住所特例施設郵便番号;
    @CsvField(order = 64, name = "他住所特例施設住所")
    private RString 他住所特例施設住所;
    @CsvField(order = 65, name = "他住所特例施設電話番号")
    private RString 他住所特例施設電話番号;
    @CsvField(order = 66, name = "他住所特例入所日")
    private RString 他住所特例入所日;
    @CsvField(order = 67, name = "他住所特例退所日")
    private RString 他住所特例退所日;
    @CsvField(order = 68, name = "前保険者番号")
    private RString 前保険者番号;
    @CsvField(order = 69, name = "他被保険者番号")
    private RString 他被保険者番号;
    @CsvField(order = 70, name = "他住所特例連絡票発行日")
    private RString 他住所特例連絡票発行日;
    @CsvField(order = 71, name = "施設退所通知発行日")
    private RString 施設退所通知発行日;
    @CsvField(order = 72, name = "施設変更通知発行日")
    private RString 施設変更通知発行日;
    @CsvField(order = 73, name = "医療保険種別")
    private RString 医療保険種別;
    @CsvField(order = 74, name = "医療保険番号")
    private RString 医療保険番号;
    @CsvField(order = 75, name = "医療保険者名")
    private RString 医療保険者名;
    @CsvField(order = 76, name = "医療保険記号番号")
    private RString 医療保険記号番号;
}