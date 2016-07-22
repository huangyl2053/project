/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.persistence.db.mapper.relate.generalPurposeListOutput;

import java.util.List;
import jp.co.ndensan.reams.db.dbd.definition.mybatisprm.DBDBT13011.GeneralPurposeListOutputMybatisParameter;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.DBDBT13011.GeneralPurposeListOutputEntity;

/**
 * 汎用リスト出力(施設入退所)マッパーインタフェースです。
 */
public interface IGeneralPurposeListOutputMapper {

    /**
     * 汎用リスト出力(施設入退所)情報を取得します．
     *
     * @param parameter　パラメター
     * @return　汎用リスト出力(施設入退所)情報
     */
    List<GeneralPurposeListOutputEntity> getGeneralPurposeListOutputInfo(GeneralPurposeListOutputMybatisParameter parameter);
}
