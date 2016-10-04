/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.entity.db.relate.kyufugengakulist;

import jp.co.ndensan.reams.ca.cax.entity.db.basic.CaT1018TokusokuHakkoRirekiEntity;
import jp.co.ndensan.reams.ca.cax.entity.db.relate.TotalShunyuRelateEntity;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.UrT0705ChoteiKyotsuEntity;

/**
 * 調定情報のRelateEntityクラスです。
 *
 * @reamsid_L DBD-3610-050 xuyue
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class ChoteiRelateEntity {

    private UrT0705ChoteiKyotsuEntity 調定共通Entity;
    private TotalShunyuRelateEntity 収入;
    private CaT1018TokusokuHakkoRirekiEntity caT1018_督促状発行履歴Entity;

}