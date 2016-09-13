/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.fukushiyogukonyuhishikyuikkatushinsa;

import java.io.Serializable;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.fukushiyogukonyuhishikyuikkatushinsa.ShokanShinseiEntity;

/**
 * 福祉用具購入費支給申請一括審査・決定Entityクラスです。
 *
 * @reamsid_L DBC-1021-100 chenaoqi
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class ShokanShinseiEntityResult implements Serializable {

    private final ShokanShinseiEntity entity;

    /**
     * コンストラクタです。
     *
     * @param entity ShokanShinseiEntity
     */
    public ShokanShinseiEntityResult(ShokanShinseiEntity entity) {
        this.entity = entity;

    }

}