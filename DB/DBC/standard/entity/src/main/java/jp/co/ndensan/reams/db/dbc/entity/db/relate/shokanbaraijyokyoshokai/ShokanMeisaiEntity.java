/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.db.relate.shokanbaraijyokyoshokai;

import java.io.Serializable;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3039ShokanMeisaiEntity;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 償還払請求明細のオブジェクトクラスです。
 *
 * @reamsid_L DBC-1010-180 panhe
 */
@lombok.Getter
@lombok.Setter
public class ShokanMeisaiEntity implements Cloneable, Serializable {

    private DbT3039ShokanMeisaiEntity entity;
    private RString serviceName;

    /**
     * 償還払請求明細Entityを生成します
     */
    public ShokanMeisaiEntity() {
        entity = new DbT3039ShokanMeisaiEntity();
        serviceName = new RString("");
    }

    /**
     * MD5値を計算し、設定します
     */
    public void initializeMd5ToEntities() {
        entity.initializeMd5();
    }

}
