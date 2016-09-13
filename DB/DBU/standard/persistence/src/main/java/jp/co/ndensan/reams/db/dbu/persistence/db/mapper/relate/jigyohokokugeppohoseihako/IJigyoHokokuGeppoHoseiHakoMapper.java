/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.persistence.db.mapper.relate.jigyohokokugeppohoseihako;

import java.util.List;
import jp.co.ndensan.reams.db.dbu.definition.mybatisprm.jigyohokokugeppoo.JigyoHokokuGeppoSearchParameter;
import jp.co.ndensan.reams.db.dbu.entity.db.relate.jigyohokokugeppohoseihako.JigyoHokokuGeppoHoseiHakoEntity;

/**
 * 事業報告（月報）補正発行のMapperクラスです。
 *
 * @reamsid_L DBU-1100-100 cuilin
 */
public interface IJigyoHokokuGeppoHoseiHakoMapper {

    /**
     * 事業報告集計一覧データを取得します。
     *
     * @param parameter 事業報告集計一覧用パラメータ
     * @return List<JigyoHokokuGeppoHoseiHakoEntity>
     */
    List<JigyoHokokuGeppoHoseiHakoEntity> select事業報告集計一覧データ(JigyoHokokuGeppoSearchParameter parameter);

}