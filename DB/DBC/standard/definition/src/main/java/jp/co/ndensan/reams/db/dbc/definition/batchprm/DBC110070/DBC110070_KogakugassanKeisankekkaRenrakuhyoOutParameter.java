/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.batchprm.DBC110070;

import jp.co.ndensan.reams.db.dbc.definition.processprm.dbc110070.KogakugassanKeisankekkaRenrakuhyoOutProcessParameter;
import jp.co.ndensan.reams.uz.uza.batch.BatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchParameterBase;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RYearMonth;

/**
 * 高額合算計算結果連絡票情報作成のParameter
 *
 * @reamsid_L DBC-3300-110 wangxingpeng
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class DBC110070_KogakugassanKeisankekkaRenrakuhyoOutParameter extends BatchParameterBase {

    private static final String KEY_処理年月 = "処理年月";
    private static final String KEY_再処理区分 = "再処理区分";
    private static final String KEY_出力順ID = "出力順ID";
    @BatchParameter(key = KEY_処理年月, name = "処理年月")
    private RYearMonth 処理年月;
    @BatchParameter(key = KEY_再処理区分, name = "再処理区分")
    private RString 再処理区分;
    @BatchParameter(key = KEY_出力順ID, name = "出力順ID")
    private RString 出力順ID;

    /**
     * processのパラメータを生成します。
     *
     * @return KogakugassanKeisankekkaRenrakuhyoOutProcessParameter
     */
    public KogakugassanKeisankekkaRenrakuhyoOutProcessParameter toProcessParameter() {
        return new KogakugassanKeisankekkaRenrakuhyoOutProcessParameter(
                処理年月,
                再処理区分,
                出力順ID);
    }
}