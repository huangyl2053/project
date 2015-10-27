/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.divcontroller.controller.parentdiv.DBA2030011;

import java.util.List;
import jp.co.ndensan.reams.db.dba.business.core.TaishoshaKey;
import jp.co.ndensan.reams.db.dba.definition.core.enumeratedtype.JushochiTokureiMenuType;
import jp.co.ndensan.reams.db.dba.definition.message.DbaErrorMessages;
import jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA2030011.KihonJohoDiv;
import jp.co.ndensan.reams.db.dbz.definition.core.util.optional.Optional;
import jp.co.ndensan.reams.db.dbz.divcontroller.util.ResponseDatas;
import jp.co.ndensan.reams.db.dbz.divcontroller.util.viewstate.ViewStateKey;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.kojin.IKojin;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.ShikibetsuTaishoGyomuHanteiKeyFactory;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.search.ShikibetsuTaishoSearchKeyBuilder;
import jp.co.ndensan.reams.ua.uax.definition.core.enumeratedtype.shikibetsutaisho.KensakuYusenKubun;
import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.shikibetsutaisho.IShikibetsuTaishoGyomuHanteiKey;
import jp.co.ndensan.reams.ua.uax.service.core.shikibetsutaisho.ShikibetsuTaishoService;
import jp.co.ndensan.reams.ua.uax.service.core.shikibetsutaisho.kojin.IKojinFinder;
import jp.co.ndensan.reams.ur.urz.business.IUrControlData;
import jp.co.ndensan.reams.ur.urz.business.UrControlDataFactory;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.ApplicationException;
import jp.co.ndensan.reams.uz.uza.message.WarningMessage;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;
import jp.co.ndensan.reams.uz.uza.biz.KojinNo;

/**
 * 住所地特例画面における、資格基本情報Divのイベントを定義したDivControllerです。
 *
 * @author n8178 城間篤人
 */
public class KihonJoho {

    /**
     * 画面が読み込まれた際に実行します。<br/>
     * 被保険者の基本情報を設定します。
     *
     * @param kihonDiv {@link KihonJohoDiv 基本情報Div}
     * @return 基本情報Divを持つResponseData
     */
    public ResponseData<KihonJohoDiv> initialize(KihonJohoDiv kihonDiv) {
        ResponseData<KihonJohoDiv> response = new ResponseData<>();

        TaishoshaKey taishoshaKey = ViewStateHolder.get(ViewStateKey.資格対象者, TaishoshaKey.class);
        IUrControlData controlData = UrControlDataFactory.createInstance();

        LasdecCode lasdecCode = new LasdecCode(controlData.getDonyuDantaiCode().getColumnValue());
        //TODO n8178 城間篤人 テスト用の市町村コードには何が入るか不明のため、検索に失敗する。テスト用市町村コードで取得できるデータが用意された後に修正する。
//        lasdecCode = new LasdecCode("209007");

        kihonDiv.getCcdKaigoAtenaInfo().load(taishoshaKey.get識別コード());
        kihonDiv.getCcdKaigoShikakuKihon().load(lasdecCode, taishoshaKey.get識別コード());

        if (isNot適用対象者(taishoshaKey, controlData)) {
            //TODO n8178 城間篤人 ApplicationExceptionでの実装ではメニューに遷移してしまうため問題がある。調査後、適切な処理に置き換える必要がある。 2015年3月

//            WarningMessage message = new WarningMessage(DbaErrorMessages.住所地特例適用対象者でない.getMessage().getCode(),
//                    DbaErrorMessages.住所地特例適用対象者でない.getMessage().evaluate(),
//                    "閉じる");
//            response.addMessage(message);
            throw new ApplicationException(DbaErrorMessages.住所地特例適用対象者でない.getMessage());
        }

        response.data = kihonDiv;
        return response;
    }

    private boolean isNot適用対象者(TaishoshaKey taishoshaKey, IUrControlData controlData) {
        JushochiTokureiMenuType menuType = JushochiTokureiMenuType.toValue(controlData.getMenuID());

        switch (menuType) {
            case DBAMN25001_届出により適用:
            case DBAMN61002_転入転出保留対象者管理:
                break;
            default:
                return false;
        }

        IKojinFinder kojinFinder = ShikibetsuTaishoService.getKojinFinder();
        // IKojin kojin = kojinFinder.get個人(controlData.getGyomuCD(), taishoshaKey.get識別コード());
        IShikibetsuTaishoGyomuHanteiKey createInstance = ShikibetsuTaishoGyomuHanteiKeyFactory.createInstance(GyomuCode.EMPTY, KensakuYusenKubun.住登内優先);
        ShikibetsuTaishoSearchKeyBuilder shikibetsuTaishoSearchKeyBuilder = new ShikibetsuTaishoSearchKeyBuilder(createInstance);
        shikibetsuTaishoSearchKeyBuilder.set個人番号(KojinNo.EMPTY);
        // IKojin kojin = kojinFinder.get個人s(shikibetsuTaishoSearchKeyBuilder);
        List<IKojin> kojinList = kojinFinder.get個人s(shikibetsuTaishoSearchKeyBuilder.build());
        switch (kojinList.get(0).get住民状態()) {
            case 転出者:
            case 消除者:
            case 住登外:
                return false;
            default:
                return true;
        }
    }
}