/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.batchprm.DBC120120;

import jp.co.ndensan.reams.db.dbc.definition.core.saishori.SaiShoriKubun;
import jp.co.ndensan.reams.uz.uza.batch.BatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchParameterBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * バッチ設計書_DBCMNF2002-386_高額合算支給額計算結果連絡票情報取込バッチパラメータクラスです。
 *
 * @reamsid_L DBC-2680-010 xicongwang
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class DBC120120_KogakuGassanShikyugakuKeisanKekkaInParameter extends BatchParameterBase {

    private static final String KEY_処理年月 = "処理年月";
    private static final String KEY_再処理区分 = "再処理区分";
    private static final String KEY_出力順ID = "出力順ID";
    private static final String KEY_処理区分 = "処理区分";

    @BatchParameter(key = KEY_処理年月, name = "処理年月")
    private FlexibleYearMonth 処理年月;
    @BatchParameter(key = KEY_再処理区分, name = "再処理区分")
    private SaiShoriKubun 再処理区分;
    @BatchParameter(key = KEY_出力順ID, name = "出力順ID")
    private RString 出力順ID;
    @BatchParameter(key = KEY_処理区分, name = "処理区分")
    private RString 処理区分;
}