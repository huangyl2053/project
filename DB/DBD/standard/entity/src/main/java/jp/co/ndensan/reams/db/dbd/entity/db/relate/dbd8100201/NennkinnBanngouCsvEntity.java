/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.entity.db.relate.dbd8100201;

import jp.co.ndensan.reams.uz.uza.io.csv.CsvField;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * ファイル出力(非課税年金対象者情報　年金番号～CSV)用データEntity。
 *
 * @reamsid_L DBD-4910-030 donghj
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class NennkinnBanngouCsvEntity {

    @CsvField(order = 1, name = "市町村コード")
    private RString 市町村コード;
    @CsvField(order = 2, name = "被保険者番号")
    private RString 被保険者番号;
    @CsvField(order = 3, name = "年金保険者コード")
    private RString 年金保険者コード;
    @CsvField(order = 4, name = "年金保険者")
    private RString 年金保険者;
    @CsvField(order = 5, name = "基礎年金番号")
    private RString 基礎年金番号;
    @CsvField(order = 6, name = "年金コード")
    private RString 年金コード;
    @CsvField(order = 7, name = "年金名称")
    private RString 年金名称;
    @CsvField(order = 8, name = "識別コード")
    private RString 識別コード;
    @CsvField(order = 9, name = "世帯コード")
    private RString 世帯コード;
    @CsvField(order = 10, name = "生年月日")
    private RString 生年月日;
    @CsvField(order = 11, name = "性別コード")
    private RString 性別コード;
    @CsvField(order = 12, name = "性別")
    private RString 性別;
    @CsvField(order = 13, name = "カナ氏名")
    private RString カナ氏名;
    @CsvField(order = 14, name = "漢字氏名")
    private RString 漢字氏名;
    @CsvField(order = 15, name = "郵便番号")
    private RString 郵便番号;
    @CsvField(order = 16, name = "住所")
    private RString 住所;

}