/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.definition.mybatisprm.honsanteiidokanendofuka;

import java.util.List;
import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.koza.IKozaSearchKey;
import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.koza.KozaSearchParameter;
import jp.co.ndensan.reams.uz.uza.biz.KamokuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 計算後情報と宛名識別対象PSM、口座情報取得PSMをもとに取得した情報のパラメータです。
 *
 * @reamsid_L DBB-0910-020 zhujun
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class KeisangojohoToKozaParameter extends KozaSearchParameter {

    private FlexibleYear 調定年度;
    private YMDHMS 調定日時;
    private RString 出力順;
    private int 日付関連_年度サイクル;

    /**
     * コンストラクタです。
     *
     * @param 調定年度 FlexibleYear
     * @param 調定日時 YMDHMS
     * @param 出力順 RString
     * @param searchkey IKozaSearchKey
     * @param 日付関連_年度サイクル RString
     * @param list List<KamokuCode>
     */
    public KeisangojohoToKozaParameter(FlexibleYear 調定年度,
            YMDHMS 調定日時,
            RString 出力順,
            IKozaSearchKey searchkey,
            List<KamokuCode> list,
            int 日付関連_年度サイクル) {
        super(searchkey, list);
        this.調定年度 = 調定年度;
        this.調定日時 = 調定日時;
        this.出力順 = 出力順;
        this.日付関連_年度サイクル = 日付関連_年度サイクル;
    }

    /**
     * パラメータメソッドです。
     *
     * @param 調定年度 FlexibleYear
     * @param 調定日時 YMDHMS
     * @param 出力順 RString
     * @param key RString
     * @param list List<KamokuCode>
     * @param 日付関連_年度サイクル int
     * @return HonsenteiKeisangojohoParameter
     */
    public static KeisangojohoToKozaParameter createSelectByKeyParam(FlexibleYear 調定年度,
            YMDHMS 調定日時,
            RString 出力順,
            IKozaSearchKey key,
            List<KamokuCode> list,
            int 日付関連_年度サイクル) {
        return new KeisangojohoToKozaParameter(調定年度, 調定日時, 出力順, key, list, 日付関連_年度サイクル);
    }

}