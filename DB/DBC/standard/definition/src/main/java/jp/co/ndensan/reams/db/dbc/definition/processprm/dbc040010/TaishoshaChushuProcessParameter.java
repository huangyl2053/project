/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.processprm.dbc040010;

import jp.co.ndensan.reams.db.dbc.definition.mybatisprm.dbc040010.TaishoshaChushuMyBatisParameter;
import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.shikibetsutaisho.IShikibetsuTaishoPSMSearchKey;
import jp.co.ndensan.reams.uz.uza.batch.parameter.IBatchProcessParameter;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * ビジネス設計_DBCMN62006_自己負担額計算（一括）のプロセスパラメタークラスです。
 *
 * @reamsid_L DBC-2060-050 liuyang
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@lombok.Getter
@lombok.Setter
public class TaishoshaChushuProcessParameter implements IBatchProcessParameter {

    private RDateTime 処理日時;
    private FlexibleDate 申請対象日開始;
    private FlexibleDate 申請対象日終了;
    private IShikibetsuTaishoPSMSearchKey 宛名検索条件;

    /**
     * DBC020080ProcessParameterのコンストラクタです。
     */
    public TaishoshaChushuProcessParameter() {
    }

    /**
     * DBC020080ProcessParameterのコンストラクタです。
     *
     * @param 処理日時 RDateTime
     * @param 申請対象日開始 FlexibleDate
     * @param 申請対象日終了 FlexibleDate
     */
    public TaishoshaChushuProcessParameter(
            RDateTime 処理日時,
            FlexibleDate 申請対象日開始,
            FlexibleDate 申請対象日終了) {
        this.処理日時 = 処理日時;
        this.申請対象日開始 = 申請対象日開始;
        this.申請対象日終了 = 申請対象日終了;
    }

    /**
     * toTaishoshaChushuMyBatisParameterのコンストラクタです。
     *
     * @return TaishoshaChushuMyBatisParameter
     */
    public TaishoshaChushuMyBatisParameter toTaishoshaChushuMyBatisParameter() {
        return new TaishoshaChushuMyBatisParameter(
                申請対象日開始 == null ? RString.EMPTY : new RString(申請対象日開始.toString()),
                申請対象日終了 == null ? RString.EMPTY : new RString(申請対象日終了.toString()),
                宛名検索条件);
    }
}