/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.entity.db.relate.kyufugengakulist;

import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * Entity
 *
 * @reamsid_L DBD-3610-050 x_miaocl
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class TaisyoSaisiJoho {

    private Decimal 徴収権消滅期間;
    private Decimal 納付済み期間;

}