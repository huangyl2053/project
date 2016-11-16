/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.db.relate.honnsanteifuka;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;

/**
 * 異動中間償還送付一時テーブルEntity項目定義クラスです。
 *
 * @reamsid_L DBC-2770-050 zhangzhiming
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@lombok.Getter
@lombok.Setter
public class IdouChuukannShouKannTempEntity extends DbTableEntityBase<IdouChuukannShouKannTempEntity> implements IDbAccessable {

    @PrimaryKey
    private FlexibleDate 異動年月日;
    private RString 異動区分コード;
    private RString 受給者異動事由;
    private ShoKisaiHokenshaNo 証記載保険者番号;
    @PrimaryKey
    private HihokenshaNo 被保険者番号;
    private RString 被保険者氏名;
    private int 履歴番号;
    private FlexibleDate 保険給付支払一時差止開始年月日;
    private FlexibleDate 保険給付支払一時差止終了年月日;
    private RString 保険給付支払一時差止区分コード;
    private Decimal 保険給付支払一時差止金額;
    private boolean 訂正連絡票フラグ;
    private FlexibleYearMonth 送付年月;
    private RString 訂正区分コード;
    private FlexibleDate 訂正年月日;
    private boolean 論理削除フラグ;
    private RString 論理削除フラグ2;
    private LasdecCode 市町村コード;
    private FlexibleDate 資格取得年月日;
    private FlexibleDate 資格喪失年月日;
    private FlexibleDate 差止決定年月日;
    private FlexibleDate 差止解除年月日;
}
