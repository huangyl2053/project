/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.entity.db.relate.gemmen.shinseisho.hakko;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.ua.uax.entity.db.basic.UaFt200FindShikibetsuTaishoEntity;
import jp.co.ndensan.reams.ua.uax.entity.db.basic.UaFt250FindAtesakiEntity;
import jp.co.ndensan.reams.uz.uza.biz.ChoikiCode;
import jp.co.ndensan.reams.uz.uza.biz.GyoseikuCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.TelNo;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 負担限度額認定お知らせ通知書発行Entityクラスです。
 *
 * @reamsid_L DBD-3530-080 mawy
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class FutanGendogakuOshiraseTsuchiHakkoEntity {

    private HihokenshaNo 被保険者番号;
    private ShikibetsuCode 識別コード;
    private boolean 旧措置者フラグ;
    private boolean 更新認定フラグ;
    private TelNo 電話番号;
    private ChoikiCode 町域コード;
    private GyoseikuCode 行政区コード;
    private YubinNo 郵便番号;
    private RString 氏名カナ;
    private FlexibleDate 生年月日;
    private UaFt200FindShikibetsuTaishoEntity 宛名;
    private UaFt250FindAtesakiEntity 宛先;
}