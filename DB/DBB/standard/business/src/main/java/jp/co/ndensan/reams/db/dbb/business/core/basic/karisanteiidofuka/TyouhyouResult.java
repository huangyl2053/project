/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.core.basic.karisanteiidofuka;

import jp.co.ndensan.reams.db.dbb.definition.batchprm.karisanteiidofuka.TyouhyouEntity;

/**
 * 出力帳票一覧のクラスです。
 *
 * @reamsid_L DBB-0890-020 yangchenbing
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class TyouhyouResult {

    private final TyouhyouEntity entity;

    /**
     * コンストラクタです。<br/>
     *
     * @param entity TyouhyouEntity
     */
    public TyouhyouResult(TyouhyouEntity entity) {
        this.entity = entity;
    }
}