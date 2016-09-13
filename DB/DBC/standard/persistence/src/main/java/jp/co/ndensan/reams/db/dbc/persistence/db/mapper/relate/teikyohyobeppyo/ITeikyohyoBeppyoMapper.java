/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate.teikyohyobeppyo;

import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.teikyohyobeppyo.TankiRiyoNissuEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.teikyohyobeppyo.TeikyohyoBeppyoEntity;

/**
 * 画面設計_DBC0150011_サービス提供票別表 Mapper
 *
 * @reamsid_L DBC-5100-010 xuxin
 */
public interface ITeikyohyoBeppyoMapper {

    /**
     * 被保険者情報を取得する。
     *
     * @param map Map<String, Object>
     * @return TeikyohyoBeppyoEntity
     */
    TeikyohyoBeppyoEntity get被保険者情報(Map<String, Object> map);

    /**
     * 短期入所利用日数。
     *
     * @param map Map<String, Object>
     * @return List<TankiRiyoNissuEntity>
     */
    List<TankiRiyoNissuEntity> get短期入所利用日数(Map<String, Object> map);
}