/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc180050;

import jp.co.ndensan.reams.db.dbd.entity.db.basic.DbT3114RiyoshaFutanWariaiMeisaiEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import lombok.Getter;
import lombok.Setter;

/**
 * バッチ設計_DBCMNK4001_更正対象給付実績一覧(利用者負担割合明細Newest取得Entity)
 *
 * @reamsid_L DBC-4960-030 dengwei
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class InsFutanwariaiJohoTempResultEntity {

    private HihokenshaNo 被保険者番号;
    private FlexibleYear 年度;
    private DbT3114RiyoshaFutanWariaiMeisaiEntity 利用者負担割合明細最新Entity;
}
