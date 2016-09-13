/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.csv.saishinsaketteihokenshain;

import jp.co.ndensan.reams.uz.uza.io.csv.CsvField;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * 再審査決定通知書情報取込共通処理（保険者分・ファイル読込）のMeisaiEntity。
 *
 * @reamsid_L DBC-2520-012 surun
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class SaishinsaKetteiHokenshaInCsvMeisaiEntity {

    @CsvField(order = 10, name = "レコード種別")
    private RString レコード種別;
    @CsvField(order = 20, name = "レコード番号")
    private RString レコード番号;
    @CsvField(order = 30, name = "交換情報識別番号")
    private RString 交換情報識別番号;
    @CsvField(order = 40, name = "帳票レコード種別")
    private RString 帳票レコード種別;
    @CsvField(order = 50, name = "事業所番号")
    private RString 事業所番号;
    @CsvField(order = 60, name = "事業所名")
    private RString 事業所名;
    @CsvField(order = 70, name = "被保険者番号")
    private RString 被保険者番号;
    @CsvField(order = 80, name = "被保険者氏名")
    private RString 被保険者氏名;
    @CsvField(order = 90, name = "サービス提供年月")
    private RString サービス提供年月;
    @CsvField(order = 100, name = "サービス種類コード")
    private RString サービス種類コード;
    @CsvField(order = 110, name = "サービス種類名")
    private RString サービス種類名;
    @CsvField(order = 120, name = "申立事由コード")
    private RString 申立事由コード;
    @CsvField(order = 130, name = "申立事由")
    private RString 申立事由;
    @CsvField(order = 140, name = "再審査結果コード")
    private RString 再審査結果コード;
    @CsvField(order = 150, name = "当初請求単位数")
    private RString 当初請求単位数;
    @CsvField(order = 160, name = "原審単位数")
    private RString 原審単位数;
    @CsvField(order = 170, name = "申立単位数")
    private RString 申立単位数;
    @CsvField(order = 180, name = "決定単位数")
    private RString 決定単位数;
    @CsvField(order = 190, name = "調整単位数")
    private RString 調整単位数;
    @CsvField(order = 200, name = "保険者負担額")
    private RString 保険者負担額;
    @CsvField(order = 210, name = "ブランク")
    private RString ブランク;

}