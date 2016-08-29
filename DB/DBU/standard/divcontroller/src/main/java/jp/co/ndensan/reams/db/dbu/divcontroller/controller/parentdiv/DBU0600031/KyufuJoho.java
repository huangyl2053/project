/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.divcontroller.controller.parentdiv.DBU0600031;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.definition.core.shikyufushikyukubun.ShikyuFushikyuKubun;
import jp.co.ndensan.reams.db.dbu.definition.mybatisprm.kyufujoho.KounyukingakuParamter;
import jp.co.ndensan.reams.db.dbu.definition.mybatisprm.kyufujoho.KyufuJohoParamter;
import jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0600031.KyufuJohoDiv;
import jp.co.ndensan.reams.db.dbu.divcontroller.handler.parentdiv.DBU0600031.KyufuJohoHandler;
import jp.co.ndensan.reams.db.dbu.service.core.kyufujoho.KyufuJohoFinder;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.viewstate.ViewStateKeys;
import jp.co.ndensan.reams.db.dbz.service.TaishoshaKey;
import jp.co.ndensan.reams.uz.uza.biz.SetaiCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 * 総合照会_給付情報のDivControllerです。
 *
 * @reamsid_L DBU-4100-040 wanghuafeng
 */
public class KyufuJoho {

    private TaishoshaKey key;
    private final KyufuJohoFinder kyufujohofinder;
    private static final int YEAR_3 = 3;

    /**
     * インスタンスです。
     */
    public KyufuJoho() {
        key = new TaishoshaKey(new HihokenshaNo("1000000000"), new ShikibetsuCode("000000000000010"), new SetaiCode("1"));
        ViewStateHolder.put(ViewStateKeys.資格対象者, key);
        key = ViewStateHolder.get(ViewStateKeys.資格対象者, TaishoshaKey.class);
        this.kyufujohofinder = KyufuJohoFinder.createInstance();
    }

    /**
     * 画面の初期化です。
     *
     * @param div KyufuJohoDiv
     * @return ResponseData<KyufuJohoDiv>
     */
    public ResponseData<KyufuJohoDiv> onLoad(KyufuJohoDiv div) {

        getHandler(div).onLoad(key);
        getHandler(div).set居宅サービス計画情報(kyufujohofinder.get居宅サービス計画情報(KyufuJohoParamter.
                createParameter(key.get被保険者番号().value(), RString.EMPTY, new ArrayList())));
        set福祉用具販売費情報(div);
        set住宅改修費情報(div);
        set利用状況情報(div);
        return ResponseData.of(div).respond();
    }

    private KyufuJohoHandler getHandler(KyufuJohoDiv div) {
        return new KyufuJohoHandler(div);
    }

    private void set福祉用具販売費情報(KyufuJohoDiv div) {
        KounyukingakuParamter maenendo = getHandler(div).set前年度抽出範囲(key);
        KounyukingakuParamter konnendo = getHandler(div).set今年度抽出範囲(key);
        getHandler(div).set前年度情報(kyufujohofinder.get購入金額(maenendo));
        getHandler(div).set前年度情報(kyufujohofinder.get請求負担額(maenendo));
        getHandler(div).set今年度情報(kyufujohofinder.get購入金額(konnendo));
        getHandler(div).set今年度情報(kyufujohofinder.get請求負担額(konnendo));
    }

    private void set住宅改修費情報(KyufuJohoDiv div) {
        getHandler(div).set住宅改修費用合計(kyufujohofinder.get住宅改修費用合計(KounyukingakuParamter.createParameter(
                key.get被保険者番号().value(), RString.EMPTY, RString.EMPTY, ShikyuFushikyuKubun.支給.getコード())));
        getHandler(div).set住宅改修請求負担額(kyufujohofinder.get住宅改修請求負担額(KounyukingakuParamter.createParameter(
                key.get被保険者番号().value(), RString.EMPTY, RString.EMPTY, ShikyuFushikyuKubun.支給.getコード())));
    }

    private List<RString> setサービス分類コード(KyufuJohoDiv div) {
        return getHandler(div).get分類コード();
    }

    private void set利用状況情報(KyufuJohoDiv div) {
        RDate date = RDate.getNowDate();
        getHandler(div).set利用状況情報(kyufujohofinder.getサービス利用状況情報(KyufuJohoParamter.createParameter(
                key.get被保険者番号().value(), new RString((date.getYearValue() - YEAR_3)), setサービス分類コード(div))).records());
    }
}
