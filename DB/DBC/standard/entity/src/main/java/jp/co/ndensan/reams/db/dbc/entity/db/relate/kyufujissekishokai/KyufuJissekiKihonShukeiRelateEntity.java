/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.db.relate.kyufujissekishokai;

import java.io.Serializable;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3017KyufujissekiKihonEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3033KyufujissekiShukeiEntity;

/**
 * 給付実績基本集計データEntityクラスです。
 *
 * @reamsid_L DBC-2970-170 dingyi
 */
@lombok.Setter
@lombok.Getter
@SuppressWarnings("PMD.UnusedPrivateField")
public class KyufuJissekiKihonShukeiRelateEntity implements Serializable {

    private static final long serialVersionUID = -4696623917043891214L;

    private DbT3033KyufujissekiShukeiEntity 給付実績集計データ;
    private DbT3017KyufujissekiKihonEntity 給付実績基本データ;
}
