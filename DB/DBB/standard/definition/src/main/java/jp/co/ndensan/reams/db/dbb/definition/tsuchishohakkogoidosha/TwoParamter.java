/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.definition.tsuchishohakkogoidosha;

import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import lombok.Getter;

/**
 *
 */
@Getter
public class TwoParamter {

    private final ReportId 帳票ID;
    private final YMDHMS 帳票作成日時;
    private final YMDHMS 最大計算処理日時;

    /**
     * TwoParamter
     *
     * @param 帳票ID 帳票ID
     * @param 帳票作成日時 帳票作成日時
     * @param 最大計算処理日時 最大計算処理日時
     */
    TwoParamter(ReportId 帳票ID, YMDHMS 帳票作成日時, YMDHMS 最大計算処理日時) {
        this.帳票ID = 帳票ID;
        this.帳票作成日時 = 帳票作成日時;
        this.最大計算処理日時 = 最大計算処理日時;
    }

    /**
     * createSelectByKeyParam
     *
     * @param 帳票ID 帳票ID
     * @param 帳票作成日時 帳票作成日時
     * @param 最大計算処理日時 最大計算処理日時
     * @return TwoParamter
     */
    public static TwoParamter createSelectByKeyParam(ReportId 帳票ID, YMDHMS 帳票作成日時, YMDHMS 最大計算処理日時) {
        return new TwoParamter(帳票ID, 帳票作成日時, 最大計算処理日時);
    }

}
