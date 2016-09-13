/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.entity.db.relate.fukajoho.fukajoho;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT2002FukaEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.fukajoho.kibetsu.KibetsuEntity;

/**
 * 賦課の情報RelateEntityクラスです。
 *
 * @reamsid_L DBB-9999-013 huangh
 */
@lombok.Getter
@lombok.Setter
public class FukaJohoRelateEntity implements Cloneable, Serializable {

    /**
     * -- GETTER -- 介護賦課Entityを返します。
     *
     * @return 介護賦課Entity -- SETTER -- 介護賦課Entityを設定します。
     *
     * @param 介護賦課Entity 介護賦課Entity
     */
    private DbT2002FukaEntity 介護賦課Entity;
    /**
     * -- GETTER -- 介護期別EntityListを返します。
     *
     * @return 介護期別EntityList -- SETTER -- 介護期別EntityListを設定します。
     *
     * @param 介護期別EntityList 介護期別EntityList
     */
    private List<KibetsuEntity> 介護期別RelateEntity;

    /**
     * コンストラクタです。
     */
    public FukaJohoRelateEntity() {
        介護賦課Entity = new DbT2002FukaEntity();
        介護期別RelateEntity = new ArrayList<>();
    }

    /**
     * MyBatisで取得された場合に使用して下さい。<br/>
     * MyBatisで当クラス取得時は、新規追加(Added)となるため、変更無し(Unchanged)に設定します。<br/>
     * FukaJohoRelateEntityが持つ{@link DbT2002FukaEntity}と{@link DbT2003KibetsuEntity}のMD5値を計算し、設定します。
     */
    public void initializeMd5ToEntities() {
        this.介護賦課Entity.initializeMd5();
        for (KibetsuEntity entity : this.介護期別RelateEntity) {
            entity.initializeMd5ToEntities();
        }
    }
    private static final long serialVersionUID = 3991822322960224299L;
}