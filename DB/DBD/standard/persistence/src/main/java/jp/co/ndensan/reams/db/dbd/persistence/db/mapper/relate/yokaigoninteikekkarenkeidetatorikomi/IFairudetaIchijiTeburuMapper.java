/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.persistence.db.mapper.relate.yokaigoninteikekkarenkeidetatorikomi;

import java.util.List;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.dbd492001.ichijiteburu.FairudetaIchijiTeburuEntity;

/**
 * ファイルデータ一時テーブル検索のマッパーインタフェースです。
 *
 * @reamsid_L DBD-1510-020 x_xuliang
 */
public interface IFairudetaIchijiTeburuMapper {

    /**
     * ファイルデータ一時テーブル検索
     *
     * @return ファイルデータ一時テーブル検索
     */
    List<FairudetaIchijiTeburuEntity> getファイルデータ一時テーブル();
}