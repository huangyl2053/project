/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc180050;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenKyufuRitsu;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.NyuryokuShikibetsuNo;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;

/**
 * バッチ設計_DBCMNK4001_更正対象給付実績一覧(一時表：更正対象給付実績情報Temp)
 *
 * @reamsid_L DBC-4960-030 dengwei
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class KoseitaishoKyuhuzissekiJohoTempEntity extends DbTableEntityBase<KoseitaishoKyuhuzissekiJohoTempEntity> implements IDbAccessable {

    private HihokenshaNo 被保険者番号;
    private FlexibleYear 年度;
    private ShikibetsuCode 識別コード;
    private RString 氏名;
    private NyuryokuShikibetsuNo 入力識別番号;
    private FlexibleYearMonth サービス提供年月;
    private RString 事業者番号;
    private RString 整理番号;
    private RString サービス種類コード;
    private RString 給付実績情報作成区分コード;
    private RString サービス種類;
    private Decimal サービス費用額;
    private HokenKyufuRitsu 更正前保険給付率;
    private Decimal 更正前請求額;
    private Decimal 更正前自己負担額;
    private HokenKyufuRitsu 更正後保険給付率;
    private Decimal 更正後請求額;
    private Decimal 更正後自己負担額;
    private Decimal 自己負担額差額;
    private Decimal 軽減率;
    private Decimal 軽減後自己負担額;
    private Decimal 高額サービス費用額;

}