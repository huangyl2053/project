/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.divcontroller.handler.parentdiv.DBU0500011;

import jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0500011.ShoKaishuKirokuKanriJohoDiv;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.exclusion.LockingKey;
import jp.co.ndensan.reams.uz.uza.exclusion.RealInitialLocker;
import jp.co.ndensan.reams.uz.uza.lang.ApplicationException;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogType;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogger;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.PersonalData;

/**
 * 証回収記録管理ハンドラクラスです。
 *
 * @reamsid_L DBU-0160-020 yaodongsheng
 */
public class ShoKaishuKirokuKanriJohoHandler {

    private final ShoKaishuKirokuKanriJohoDiv div;
    private static final RString 状態_更新 = new RString("更新");

    /**
     * コンストラクタです。
     *
     * @param div 証回収記録管理Div
     */
    public ShoKaishuKirokuKanriJohoHandler(ShoKaishuKirokuKanriJohoDiv div) {
        this.div = div;
    }

    /**
     * 初期化です。
     *
     * @param 識別コード 識別コード
     * @param 被保険者番号 被保険者番号
     */
    public void onLoad(ShikibetsuCode 識別コード, HihokenshaNo 被保険者番号) {
        div.getKihonJoho().getCcdKaigoAtenaInfo().onLoad(識別コード);
        div.getKihonJoho().getCcdKaigoShikakuKihon().onLoad(識別コード);
        div.getShoKaishuList().getCcdShokaishuKirokuKanri().initialize(状態_更新, 被保険者番号);
        LockingKey lockingKey = new LockingKey(new RString("ShoKaishuKirokuKanri"));
        if (RealInitialLocker.tryGetLock(lockingKey)) {
            RealInitialLocker.lock(lockingKey);
        } else {
            div.getShoKaishuList().setDisabled(true);
            throw new ApplicationException(UrErrorMessages.排他_他のユーザが使用中.getMessage());
        }
        アクセスログ(識別コード);
    }

    private void アクセスログ(ShikibetsuCode 識別コード) {
        AccessLogger.log(AccessLogType.照会, toPersonalData(識別コード));
    }

    private PersonalData toPersonalData(ShikibetsuCode 識別コード) {
        ExpandedInformation expandedInfo = new ExpandedInformation(new Code("01"), new RString("有り"), new RString("無し"));
        return PersonalData.of(識別コード, expandedInfo);
    }
}
