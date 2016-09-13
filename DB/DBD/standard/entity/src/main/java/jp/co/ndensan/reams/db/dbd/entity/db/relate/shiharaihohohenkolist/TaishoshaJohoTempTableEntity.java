/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.entity.db.relate.shiharaihohohenkolist;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import lombok.Getter;
import lombok.Setter;

/**
 * 支払方法変更管理リストの一時テーブルEntityです。
 *
 * @reamsid_L DBD-3630-050 liangbc
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class TaishoshaJohoTempTableEntity extends DbTableEntityBase<TaishoshaJohoTempTableEntity> implements IDbAccessable {

    private HihokenshaNo hihokenshaNo;

    /**
     * コンストラクタです。
     *
     * @param hihokenshaNo 被保険者番号
     */
    public TaishoshaJohoTempTableEntity(HihokenshaNo hihokenshaNo) {
        this.hihokenshaNo = hihokenshaNo;
    }
}