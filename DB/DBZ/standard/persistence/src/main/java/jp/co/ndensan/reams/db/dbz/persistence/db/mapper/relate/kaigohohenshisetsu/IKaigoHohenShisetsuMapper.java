/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.db.mapper.relate.kaigohohenshisetsu;

import java.util.List;
import jp.co.ndensan.reams.db.dbz.definition.mybatisprm.kaigohohenshisetsu.KaigoHohenShisetsuMybatisParameter;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1004ShisetsuNyutaishoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.relate.kaigohohenshisetsu.KaigoHohenShisetsuRelateEntity;

/**
 * 介護保険施設入退所者管理のマッパーインタフェースです。
 *
 * @reamsid_L DBA-0360-050 wangkun
 */
public interface IKaigoHohenShisetsuMapper {

    /**
     * 入所施設種類を取得します。
     *
     * @param 施設情報の検索条件 施設情報の検索条件
     * @return 施設情報リスト
     */
    List<DbT1004ShisetsuNyutaishoEntity> getShiSeTsuJyoHon_A(KaigoHohenShisetsuMybatisParameter 施設情報の検索条件);

    /**
     * 入所施設種類を取得します。
     *
     * @param 施設情報の検索条件 施設情報の検索条件
     * @return 施設情報リスト
     */
    List<DbT1004ShisetsuNyutaishoEntity> getShiSeTsuJyoHon_I(KaigoHohenShisetsuMybatisParameter 施設情報の検索条件);

    /**
     * 入所施設種類は「介護保険施設」の場合、施設情報の取得を取得します。
     *
     * @param 施設情報の検索条件 施設情報の検索条件
     * @return 施設情報リスト
     */
    List<KaigoHohenShisetsuRelateEntity> get施設情報の取得_A(KaigoHohenShisetsuMybatisParameter 施設情報の検索条件);

    /**
     * 入所施設種類は「住所地特例対象施設」または「適用除外施設」の場合、施設情報の取得を取得します。
     *
     * @param 施設情報の検索条件 施設情報の検索条件
     * @return 施設情報リスト
     */
    List<KaigoHohenShisetsuRelateEntity> get施設情報の取得_I(KaigoHohenShisetsuMybatisParameter 施設情報の検索条件);
}