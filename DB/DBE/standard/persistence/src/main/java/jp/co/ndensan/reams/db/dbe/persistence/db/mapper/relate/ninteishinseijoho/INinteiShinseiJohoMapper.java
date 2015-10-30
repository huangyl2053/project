/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.db.mapper.relate.ninteishinseijoho;

import jp.co.ndensan.reams.db.dbe.definition.mybatis.param.ninteishinseijoho.NinteiShinseiJohoMapperParameter;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.ninteishinseijoho.NinteiShinseiJohoEntity;

/**
 * 要介護認定申請情報のマッパーインタフェースです。
 */
public interface INinteiShinseiJohoMapper {

    /**
     * 要介護認定申請情報情報をキー検索で１件取得します。
     *
     * @param 要介護認定申請情報検索条件 要介護認定申請情報検索条件
     * @return NinteiShinseiJohoEntity
     */
    NinteiShinseiJohoEntity getNinteiShinseiJohoEntity(NinteiShinseiJohoMapperParameter 要介護認定申請情報検索条件);

}