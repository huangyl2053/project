/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.batchprm.saishinsai;

import jp.co.ndensan.reams.uz.uza.batch.BatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchParameterBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;

/**
 * 再審査決定通知書情報取込（公費負担者分）のバッチパラメータです。
 *
 * @reamsid_L DBC-2820-010 sunhui
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class DBC120200_SaishinsaKetteiKohifutanshaInBatchParameter extends BatchParameterBase {

    private static final String KEY_SHORIYM = "shoriYM";
    private static final String NAME_SHORIYM = "処理年月";
    private static final String KEY_SHUTSURYOKUJUNID = "shutsuryokujunId";
    private static final String NAME_SHUTSURYOKUJUNID = "出力順ID";

    @BatchParameter(key = KEY_SHORIYM, name = NAME_SHORIYM)
    private FlexibleYearMonth shoriYM;
    @BatchParameter(key = KEY_SHUTSURYOKUJUNID, name = NAME_SHUTSURYOKUJUNID)
    private Long shutsuryokujunId;
}
