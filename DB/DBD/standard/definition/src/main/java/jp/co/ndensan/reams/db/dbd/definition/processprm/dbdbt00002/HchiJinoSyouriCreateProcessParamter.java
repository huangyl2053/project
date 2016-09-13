/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.definition.processprm.dbdbt00002;

import jp.co.ndensan.reams.db.dbd.definition.batchprm.common.KyusochishaKubun;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.gemmen.niteishalist.JukyushaKubun2;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.gemmen.niteishalist.TargetList;
import jp.co.ndensan.reams.db.dbd.definition.mybatisprm.dbdbt00002.HchiJinoSyouriCreateMybatisprmParamter;
import jp.co.ndensan.reams.uz.uza.batch.parameter.IBatchProcessParameter;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import lombok.Getter;
import lombok.Setter;

/**
 * 減免減額対象者判定用根拠作成対象者一時テーブル
 *
 * @reamsid_L DBD-3980-050 x_youyj
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class HchiJinoSyouriCreateProcessParamter implements IBatchProcessParameter {

    // 対象リスト
    private TargetList 対象リスト;
    // 基準日
    private FlexibleDate 基準日;
    // 旧措置区分
    private KyusochishaKubun 旧措置区分;
    // 受給者区分
    private JukyushaKubun2 受給者区分;

    /**
     * 対象者一次特定の引数を返します。
     *
     * @param 対象リスト 対象リスト
     * @param 受給者区分 受給者区分
     * @param 旧措置区分 旧措置区分
     * @param 基準日 基準日
     */
    public HchiJinoSyouriCreateProcessParamter(TargetList 対象リスト,
            JukyushaKubun2 受給者区分, KyusochishaKubun 旧措置区分, FlexibleDate 基準日) {
        this.対象リスト = 対象リスト;
        this.受給者区分 = 受給者区分;
        this.旧措置区分 = 旧措置区分;
        this.基準日 = 基準日;
    }

    /**
     * 利用者負担額減免認定者リスト発行の引数を返します。
     *
     * @return HchiJinoSyouriCreateMybatisprmParamter
     */
    public HchiJinoSyouriCreateMybatisprmParamter toHchiJinoSyouriCreateMybatisprmParamter() {
        return new HchiJinoSyouriCreateMybatisprmParamter(対象リスト, 受給者区分, 旧措置区分, 基準日);
    }

}