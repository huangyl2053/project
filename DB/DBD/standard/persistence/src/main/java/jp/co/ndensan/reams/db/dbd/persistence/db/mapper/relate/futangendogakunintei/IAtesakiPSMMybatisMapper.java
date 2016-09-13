/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.persistence.db.mapper.relate.futangendogakunintei;

import jp.co.ndensan.reams.db.dbd.definition.mybatisprm.relate.futangendogakunintei.AtesakiPSMMybatisParameter;
import jp.co.ndensan.reams.ua.uax.entity.db.basic.UaFt250FindAtesakiEntity;

/**
 * 宛先情報を取得のMapperクラスです。
 *
 * @reamsid_L DBD-3570-030 wangchao
 */
public interface IAtesakiPSMMybatisMapper {

    /**
     * 宛先情報の取得処理です。
     *
     * @param atesakiPSMMapper atesakiPSMMapper
     * @return 宛先情報
     */
    UaFt250FindAtesakiEntity selectAtesakiPSMMybatis(AtesakiPSMMybatisParameter atesakiPSMMapper);
}