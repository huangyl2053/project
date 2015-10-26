/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.entity.db.relate.ninteishinseijoho;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT5101NinteiShinseiJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.ninteichosairaijoho.NinteichosaIraiJohoRelateEntity;

/**
 * 要介護認定申請情報RelateEntityクラスです。
 */
@lombok.Getter
@lombok.Setter
public class NinteiShinseiJohoRelateEntity implements Cloneable, Serializable {

    private static final long serialVersionUID = 945347713306945346L;

    /**
     * -- GETTER -- 要介護認定申請情報Entityを返します。
     *
     * @return 要介護認定申請情報Entity -- SETTER -- 要介護認定申請情報Entityを設定します。
     *
     * @param 要介護認定申請情報Entity 要介護認定申請情報Entity
     */
    private DbT5101NinteiShinseiJohoEntity 要介護認定申請情報Entity;

    /**
     * -- GETTER -- 認定調査依頼情報EntityListを返します。
     *
     * @return 認定調査依頼情報EntityList -- SETTER -- 認定調査依頼情報EntityListを設定します。
     *
     * @param 認定調査依頼情報EntityList 認定調査依頼情報EntityList
     */
    private List<NinteichosaIraiJohoRelateEntity> 認定調査依頼情報RelateEntity;

    /**
     * コンストラクタです。
     */
    public NinteiShinseiJohoRelateEntity() {
        要介護認定申請情報Entity = new DbT5101NinteiShinseiJohoEntity();
        認定調査依頼情報RelateEntity = new ArrayList<>();
    }

    /**
     * MyBatisで取得された場合に使用して下さい。<br/>
     * MyBatisで当クラス取得時は、新規追加(Added)となるため、変更無し(Unchanged)に設定します。<br/>
     * NinteiShinseiJohoEntityが持つ{@link xxxxxxEntity}と{@link xxxxxxEntity}と<br/> {@link xxxxxxEntity}のMD5値を計算し、設定します。
     */
    public void initializeMd5ToEntities() {
        this.要介護認定申請情報Entity.initializeMd5();
        for (NinteichosaIraiJohoRelateEntity RelateEntity : this.認定調査依頼情報RelateEntity) {
            RelateEntity.initializeMd5ToEntities();
        }
    }
}
