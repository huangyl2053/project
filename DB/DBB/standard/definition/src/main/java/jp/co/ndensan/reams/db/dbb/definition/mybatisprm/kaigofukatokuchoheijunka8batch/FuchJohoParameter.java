/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.definition.mybatisprm.kaigofukatokuchoheijunka8batch;

import jp.co.ndensan.reams.uz.uza.batch.parameter.IMyBatisParameter;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;

/**
 * 賦課の情報テーブルパラメータ
 *
 * @reamsid_L DBB-0860-050 yebangqiang
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public final class FuchJohoParameter implements IMyBatisParameter {

    private FlexibleYear 調定年度;
    private FlexibleYear 賦課年度;

    /**
     * コンストラクタです。
     *
     * @param 調定年度 FlexibleYear
     * @param 賦課年度 FlexibleYear
     */
    private FuchJohoParameter(
            FlexibleYear 調定年度,
            FlexibleYear 賦課年度) {
        this.調定年度 = 調定年度;
        this.賦課年度 = 賦課年度;
    }

    /**
     * パラメータメソッドです。
     *
     * @param 調定年度 FlexibleYear
     * @param 賦課年度 FlexibleYear
     * @return パラメータ
     */
    public static FuchJohoParameter createParam(
            FlexibleYear 調定年度,
            FlexibleYear 賦課年度) {
        return new FuchJohoParameter(調定年度, 賦課年度);
    }
}