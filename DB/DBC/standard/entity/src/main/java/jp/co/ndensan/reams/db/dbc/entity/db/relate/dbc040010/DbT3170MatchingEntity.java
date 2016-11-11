/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc040010;

import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3170JigyoKogakuGassanJikoFutanGakuEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3171JigyoKogakuGassanJikoFutanGakuMeisaiEntity;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;

/**
 * ビジネス設計_DBCMN62006_自己負担額計算（一括）の実績負担額データ<br/>
 * と高額合算自己負担額TBLを被保険者番号＋対象年度をキーにしてマッチングしたエンティティです。
 *
 * @reamsid_L DBC-2060-050 liuyang
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@lombok.Getter
@lombok.Setter
public class DbT3170MatchingEntity extends DbTableEntityBase<DbT3170MatchingEntity> implements IDbAccessable {

    private JissekiFutangakuDataTempEntity 実績負担額データ;
    private DbT3170JigyoKogakuGassanJikoFutanGakuEntity 高額合算自己負担額;
    private DbT3171JigyoKogakuGassanJikoFutanGakuMeisaiEntity 高額合算自己負担額明細;

}