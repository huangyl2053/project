/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.persistence.db.mapper.relate.riyoulyagennmenn;

import java.util.List;
import jp.co.ndensan.reams.db.dbd.definition.mybatisprm.dbdbt00002.NinteishaListSakuseiMybatisprmParameter;
import jp.co.ndensan.reams.db.dbd.definition.mybatisprm.dbdbt00002.TaishoshaIchijiTokuteiMybatisprmParamter;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.dbdbt00002.NinteishaListSakuseiResultCsvEntity;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.dbdbt00002.temptable.TaishoshaIchijiTokuteiTempTableEntity;

/**
 * 減免減額対象者判定用根拠作成対象者作成データの取得
 *
 * @reamsid_L DBD-3980-050 x_youyj
 */
public interface IGennMennGennGakuTaiSyoulyaMapper {

    /**
     * 減免減額対象者判定用根拠作成対象者作成情報を取得する
     *
     * @param 減免減額対象者判定用検索条件 減免減額対象者判定用検索条件
     * @return TaishoshaIchijiTokuteiTempTableEntity
     */
    List<TaishoshaIchijiTokuteiTempTableEntity> select減免減額対象者判定用ByKey(
            TaishoshaIchijiTokuteiMybatisprmParamter 減免減額対象者判定用検索条件);

    /**
     * 利用者負担額減免認定者リスト情報を取得する
     *
     * @param 利用者負担額減免認定者検索条件 利用者負担額減免認定者検索条件
     * @return NinteishaListSakuseiResultCsvEntity
     */
    List<NinteishaListSakuseiResultCsvEntity> select利用者負担額減免認定者(
            NinteishaListSakuseiMybatisprmParameter 利用者負担額減免認定者検索条件);
}
