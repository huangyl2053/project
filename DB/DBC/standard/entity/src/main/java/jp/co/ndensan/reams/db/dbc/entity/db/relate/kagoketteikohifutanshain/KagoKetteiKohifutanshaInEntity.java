/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.db.relate.kagoketteikohifutanshain;

import java.io.Serializable;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 過誤決定通知書情報取込一覧表（公費負担者分）Entityです。
 *
 * @reamsid_L DBC-0980-440 zhangrui
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class KagoKetteiKohifutanshaInEntity implements Serializable {

    private RString 交換情報識別番号;
    private RString 帳票レコード種別ヘッダ部;
    private FlexibleYearMonth 取扱年月;
    private RString 公費負担者番号;
    private RString 公費負担者名;
    private FlexibleDate 作成年月日;
    private RString 頁;
    private RString 国保連合会名;
    private RString 帳票レコード種別明細部;
    private JigyoshaNo 事業所番号;
    private RString 事業所名;
    private RString 公費受給者番号;
    private RString 公費受給者氏名;
    private HokenshaNo 証記載保険者番号;
    private RString 証記載保険者名;
    private HihokenshaNo 被保険者番号;
    private FlexibleYearMonth サービス提供年月;
    private ServiceShuruiCode サービス種類コード;
    private RString サービス種類名;
    private Code 過誤申立事由コード;
    private RString 過誤申立事由;
    private Decimal 単位数;
    private Decimal 公費負担額;
    private RString 帳票レコード種別集計部;
    private int 介護給付費の件数;
    private Decimal 介護給付費の単位数;
    private Decimal 介護給付費の公費負担額;
    private int 高額介護サービス費の件数;
    private Decimal 高額介護サービス費の単位数;
    private Decimal 高額介護サービス費の公費負担額;
    private int 特定入所者介護サービス費等の件数;
    private Decimal 特定入所者介護サービス費等の単位数;
    private Decimal 特定入所者介護サービス費等の公費負担額;
}
