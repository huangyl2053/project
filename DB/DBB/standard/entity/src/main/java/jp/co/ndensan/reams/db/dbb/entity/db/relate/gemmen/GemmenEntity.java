/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.entity.db.relate.gemmen;

import jp.co.ndensan.reams.db.dbb.entity.db.basic.DbT2004GemmenEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.fukajoho.fukajoho.FukaJohoRelateEntity;
import jp.co.ndensan.reams.ua.uax.entity.db.basic.UaFt200FindShikibetsuTaishoEntity;

/**
 * バッチ設計_DBBMN61002_介護保険料減免登録(一括)のEntity
 *
 * @reamsid_L DBB-1670-030 surun
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class GemmenEntity {

    private FukaJohoRelateEntity 賦課の情報;
    private DbT2004GemmenEntity 介護賦課減免;
    private UaFt200FindShikibetsuTaishoEntity 宛名Entity;

}
