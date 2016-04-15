/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.persistence.db.mapper.relate.futangendogakunintei;

import jp.co.ndensan.reams.db.dbd.definition.mybatisprm.relate.futangendogakunintei.ShikibetsuTaishoPSMMybatisParameter;
import jp.co.ndensan.reams.ua.uax.entity.db.basic.UaFt200FindShikibetsuTaishoEntity;

/**
 * 宛名情報を取得のMapperクラスです。
 *
 * @reamsid_L DBD-3570-030 wangchao
 */
public interface IShikibetsuTaishoPSMMybatisMapper {

    /**
     * 宛名情報の取得処理です。
     *
     * @param shikibetsuTaishoPSMParameter shikibetsuTaishoPSMParameter
     * @return 宛名情報
     */
    UaFt200FindShikibetsuTaishoEntity selectShikibetsuTaishoPSMMybatis(ShikibetsuTaishoPSMMybatisParameter shikibetsuTaishoPSMParameter);
}
