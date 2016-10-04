/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.mybatisprm.dbc050010;

import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.shikibetsutaisho.IShikibetsuTaishoPSMSearchKey;
import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.shikibetsutaisho.UaFt200FindShikibetsuTaishoParam;
import jp.co.ndensan.reams.uz.uza.batch.parameter.IMyBatisParameter;

/**
 * 一時TBLに登録する_Process処理パラメタークラスです．
 *
 * @reamsid_L DBC-2180-030 donghj
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class HihokenshaAtenaMybatisParameter extends UaFt200FindShikibetsuTaishoParam implements IMyBatisParameter {

    private UaFt200FindShikibetsuTaishoParam psmShikibetsuTaisho;

    /**
     * コンストラクタです。
     *
     * @param searchKey IShikibetsuTaishoPSMSearchKey
     */
    public HihokenshaAtenaMybatisParameter(IShikibetsuTaishoPSMSearchKey searchKey) {
        super(searchKey);
        this.psmShikibetsuTaisho = new UaFt200FindShikibetsuTaishoParam(searchKey);
    }

}