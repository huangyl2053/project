/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.controller.parentdiv.dbc0810015;

import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810015.ShokanbarayiKeteiInfoDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.ViewStateKeys;
import jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.dbc0810014.ServiceTeiKyoShomeishoParameter;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 * 償還払い状況照会_償還払決定情報のクラスです。
 *
 * @author yebangqiang
 */
public class ShokanbarayiKeteiInfo {

    /**
     * 償還払い状況照会_償還払決定情報のonLoad
     *
     * @param div 画面DIV
     * @return 償還払い状況照会
     */
    public ResponseData<ShokanbarayiKeteiInfoDiv> onLoad(ShokanbarayiKeteiInfoDiv div) {
        // TODO 引き継ぎデータの取得
        ServiceTeiKyoShomeishoParameter parmeter = new ServiceTeiKyoShomeishoParameter(
                new HihokenshaNo("000000003"), new FlexibleYearMonth(new RString("201601")),
                new RString("0000000003"), new JigyoshaNo("0000000003"), new RString("事業者名"),
                new RString("0003"), new RString("証明書"));
        ViewStateHolder.put(ViewStateKeys.基本情報パラメータ, parmeter);
        ServiceTeiKyoShomeishoParameter parameter = ViewStateHolder.get(
                ViewStateKeys.基本情報パラメータ, ServiceTeiKyoShomeishoParameter.class);
        FlexibleYearMonth サービス年月 = parameter.getServiceTeikyoYM();
//        HihokenshaNo 被保険者番号 = parameter.getHiHokenshaNo();
        RString 整理番号 = parameter.getSeiriNp();
        ViewStateHolder.put(ViewStateKeys.識別コード, new ShikibetsuCode("123456"));
        ViewStateHolder.put(ViewStateKeys.様式番号, new RString("0003"));
        ViewStateHolder.put(ViewStateKeys.申請日, new RDate("20151120"));
//        if (!被保険者番号.isEmpty()) {
//            RString load = new RString("共有子Divの初期化");
//            div.getPanelCcd().getCcdKaigoShikakuKihon().load(LasdecCode.EMPTY, 識別コード);
//        } else {
//            div.getPanelOne().getCcdKaigoShikakuKihon().setVisible(false);
//        }
        div.getPanelTwo().getTxtServiceTeikyoYM().setValue(new RDate(サービス年月.wareki().toDateString().toString()));
        div.getPanelTwo().getTxtSeiriBango().setValue(整理番号);
//        div.getCcdShokanbaraiketteiJoho().load(被保険者番号, サービス年月, 整理番号);
//        int count = div.getCcdShokanbaraiketteiJoho().get件数();
//        if(count == 0) {
//            throw new ApplicationException(UrErrorMessages.該当データなし.getMessage());
//        }
        div.getPanelTwo().getBtnShokanbariKeteiInfo().setDisabled(true);
        return ResponseData.of(div).respond();
    }

    /**
     * 申請情報ボタンを押下した際に実行します.
     *
     * @param div 画面DIV
     * @return 申請情報
     */
    public ResponseData<ShokanbarayiKeteiInfoDiv> onClick_btnShinsei(ShokanbarayiKeteiInfoDiv div) {
        return ResponseData.of(div).respond();
    }

    /**
     * 口座情報ボタンを押下した際に実行します.
     *
     * @param div 画面DIV
     * @return 口座情報
     */
    public ResponseData<ShokanbarayiKeteiInfoDiv> onClick_btnKouza(ShokanbarayiKeteiInfoDiv div) {
        return ResponseData.of(div).respond();
    }

    /**
     * サービス提供証明書ボタンを押下した際に実行します.
     *
     * @param div 画面DIV
     * @return サービス提供証明書
     */
    public ResponseData<ShokanbarayiKeteiInfoDiv> onClick_btnServiceTeikyoShomeisyo(ShokanbarayiKeteiInfoDiv div) {
        return ResponseData.of(div).respond();
    }

    /**
     * 申請情報検索へ戻るボタンを押下した際に実行します.
     *
     * @param div 画面DIV
     * @return 申請情報検索
     */
    public ResponseData<ShokanbarayiKeteiInfoDiv> onClick_btnBack(ShokanbarayiKeteiInfoDiv div) {
        //getHandler(div).btnKihonInfo();
        return ResponseData.of(div).respond();
    }
}
