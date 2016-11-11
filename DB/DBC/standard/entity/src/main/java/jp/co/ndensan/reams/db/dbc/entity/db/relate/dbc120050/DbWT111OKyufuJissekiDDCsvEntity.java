/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc120050;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.KokanShikibetsuNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.NyuryokuShikibetsuNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ServiceKomokuCode;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvField;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 給付実績DC一時TBLテーブルのcsvEntity。
 *
 * @reamsid_L DBC-2440-010 zhangrui
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@lombok.Getter
@lombok.Setter
public class DbWT111OKyufuJissekiDDCsvEntity {

    @CsvField(order = 10, name = "レコード種別")
    private RString レコード種別;
    @CsvField(order = 20, name = "レコード番号")
    private RString レコード番号;
    @CsvField(order = 30, name = "交換情報識別番号")
    private KokanShikibetsuNo 交換情報識別番号;
    @CsvField(order = 40, name = "入力識別番号")
    private NyuryokuShikibetsuNo 入力識別番号;
    @CsvField(order = 50, name = "レコード種別コード")
    private RString レコード種別コード;
    @CsvField(order = 60, name = "証記載保険者番号")
    private HokenshaNo 証記載保険者番号;
    @CsvField(order = 70, name = "被保険者番号")
    private HihokenshaNo 被保険者番号;
    @CsvField(order = 80, name = "サービス提供年月")
    private FlexibleYearMonth サービス提供年月;
    @CsvField(order = 90, name = "事業所番号")
    private JigyoshaNo 事業所番号;
    @CsvField(order = 100, name = "整理番号")
    private RString 整理番号;
    @CsvField(order = 110, name = "サービス種類コード")
    private ServiceShuruiCode サービス種類コード;
    @CsvField(order = 120, name = "サービス項目コード")
    private ServiceKomokuCode サービス項目コード;
    @CsvField(order = 130, name = "単位数")
    private Decimal 単位数;
    @CsvField(order = 140, name = "日数_回数")
    private Decimal 日数_回数;
    @CsvField(order = 150, name = "公費１対象日数_回数")
    private Decimal 公費１対象日数_回数;
    @CsvField(order = 160, name = "公費２対象日数_回数")
    private Decimal 公費２対象日数_回数;
    @CsvField(order = 170, name = "公費３対象日数_回数")
    private Decimal 公費３対象日数_回数;
    @CsvField(order = 180, name = "サービス単位数")
    private int サービス単位数;
    @CsvField(order = 190, name = "公費１対象サービス単位数")
    private int 公費１対象サービス単位数;
    @CsvField(order = 200, name = "公費２対象サービス単位数")
    private int 公費２対象サービス単位数;
    @CsvField(order = 210, name = "公費３対象サービス単位数")
    private int 公費３対象サービス単位数;
    @CsvField(order = 220, name = "施設所在保険者番号")
    private ShoKisaiHokenshaNo 施設所在保険者番号;
    @CsvField(order = 230, name = "摘要")
    private RString 摘要;
    @CsvField(order = 240, name = "後_単位数")
    private Decimal 後_単位数;
    @CsvField(order = 250, name = "後_日数_回数")
    private Decimal 後_日数_回数;
    @CsvField(order = 260, name = "後_公費１対象日数_回数")
    private Decimal 後_公費１対象日数_回数;
    @CsvField(order = 270, name = "後_公費２対象日数_回数")
    private Decimal 後_公費２対象日数_回数;
    @CsvField(order = 280, name = "後_公費３対象日数_回数")
    private Decimal 後_公費３対象日数_回数;
    @CsvField(order = 290, name = "後_サービス単位数")
    private int 後_サービス単位数;
    @CsvField(order = 300, name = "後_公費１対象サービス単位数")
    private int 後_公費１対象サービス単位数;
    @CsvField(order = 310, name = "後_公費２対象サービス単位数")
    private int 後_公費２対象サービス単位数;
    @CsvField(order = 320, name = "後_公費３対象サービス単位数")
    private int 後_公費３対象サービス単位数;
    @CsvField(order = 330, name = "再審査回数")
    private Decimal 再審査回数;
    @CsvField(order = 340, name = "過誤回数")
    private Decimal 過誤回数;
    @CsvField(order = 350, name = "審査年月")
    private FlexibleYearMonth 審査年月;
}