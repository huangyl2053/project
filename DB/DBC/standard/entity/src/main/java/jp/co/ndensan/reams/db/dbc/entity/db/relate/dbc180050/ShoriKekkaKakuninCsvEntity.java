/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc180050;

import jp.co.ndensan.reams.uz.uza.io.csv.CsvField;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * バッチ設計_DBCMNK4001_更正対象給付実績一覧(処理結果確認リストCSV)
 *
 * @reamsid_L DBC-4960-030 dengwei
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class ShoriKekkaKakuninCsvEntity {

    @CsvField(order = 1, name = "作成日時")
    private RString 作成日時;
    @CsvField(order = 2, name = "処理名")
    private RString 処理名;
    @CsvField(order = 3, name = "被保険者番号")
    private RString 被保険者番号;
    @CsvField(order = 4, name = "エラー内容")
    private RString エラー内容;
    @CsvField(order = 5, name = "備考")
    private RString 備考;
}
