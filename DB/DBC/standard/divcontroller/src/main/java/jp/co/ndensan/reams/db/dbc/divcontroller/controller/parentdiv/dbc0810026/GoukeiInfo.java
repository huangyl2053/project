/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.co.ndensan.reams.db.dbc.divcontroller.controller.parentdiv.dbc0810026;

import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.basic.ShokanKihon;
import jp.co.ndensan.reams.db.dbc.business.core.basic.ShokanShokujiHiyo;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810026.GoukeiInfoDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.handler.dbc0810026.GoukeiInfoHandler;
import jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.ViewStateKeys;
import jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.dbc0810014.ServiceTeiKyoShomeishoParameter;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.shokanbaraijyokyoshokai.ShikibetsuNoKanriEntity;
import jp.co.ndensan.reams.db.dbc.service.core.shokanbaraijyokyoshokai.ShokanbaraiJyokyoShokai;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.ApplicationException;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RYearMonth;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 * 償還払い状況照会_合計情報のクラスです。
 * @author GC xuhao
 */
public class GoukeiInfo {
    
    public  ResponseData<GoukeiInfoDiv> onLoad(GoukeiInfoDiv div) {
        // TODO 引き継ぎデータの取得
        ServiceTeiKyoShomeishoParameter parmeter = new ServiceTeiKyoShomeishoParameter(
                new HihokenshaNo("000000003"), new FlexibleYearMonth(new RString("201601")),
                new RString("0000000003"), new JigyoshaNo("0000000003"), new RString("事業者名"),
                new RString("0003"), new RString("証明書"));
        ViewStateHolder.put(ViewStateKeys.基本情報パラメータ, parmeter);
        ServiceTeiKyoShomeishoParameter parameter = ViewStateHolder.get(
                ViewStateKeys.基本情報パラメータ, ServiceTeiKyoShomeishoParameter.class);
        FlexibleYearMonth サービス年月 = parameter.getServiceTeikyoYM();
        HihokenshaNo 被保険者番号 = parameter.getHiHokenshaNo();
        RString 整理番号 = parameter.getSeiriNp();
        JigyoshaNo 事業者番号 = parameter.getJigyoshaNo();
        RString 明細番号 = parameter.getMeisaiNo();
        RString 証明書 = parameter.getServiceYM();

        // TODO 該当者検索画面ViewState．識別コード
        ViewStateHolder.put(ViewStateKeys.識別コード, new ShikibetsuCode("123456"));
        ShikibetsuCode 識別コード = ViewStateHolder.get(ViewStateKeys.識別コード, ShikibetsuCode.class);
        // TODO 申請書検索ViewSate．様式番号
        ViewStateHolder.put(ViewStateKeys.様式番号, new RString("0003"));
        RString 様式番号 = ViewStateHolder.get(ViewStateKeys.様式番号, RString.class);
        // TODO 申請検索画面ViewState. 申請日
        ViewStateHolder.put(ViewStateKeys.申請日, new RDate("20151125"));
        RDate 申請日 = ViewStateHolder.get(ViewStateKeys.申請日, RDate.class);
        // KaigoAtenaInfo  「介護宛名情報」共有子Divの初期化
//        div.getPanelCcd().getCcdKaigoAtenaInfo().load(識別コード);
        // KaigoShikakuKihon 「介護資格系基本情報」共有子Div の初期化(这个entity中的load方法没写)
        if (!被保険者番号.isEmpty()) {
//            div.getPanelCcd().getCcdKaigoShikakuKihon().load(LasdecCode.EMPTY, 識別コード);
        } else {
            div.getPanelCcd().getCcdKaigoShikakuKihon().setVisible(false);
        }
        div.getPanelHead().getTxtServiceTeikyoYM().setDomain(new RYearMonth(サービス年月.wareki().toDateString()));
        div.getPanelHead().getTxtShinseiYMD().setValue(new RDate(申請日.wareki().toDateString().toString()));
        div.getPanelHead().getTxtJigyoshaBango().setValue(new RString(事業者番号.toString()));
        div.getPanelHead().getTxtMeisaiBango().setValue(明細番号);
        div.getPanelHead().getTxtShomeisho().setValue(証明書);
         List<ShokanKihon> shokanKihonList = ShokanbaraiJyokyoShokai.createInstance().getShokanbarayiSeikyukihonDetail(
                 被保険者番号, サービス年月, 整理番号, 事業者番号, 様式番号, 明細番号);
        if (shokanKihonList == null || shokanKihonList.isEmpty()) {
            throw new ApplicationException(UrErrorMessages.該当データなし.getMessage());
        }
        List<ShokanShokujiHiyo> shokanShokujiHiyoList = ShokanbaraiJyokyoShokai.createInstance().
                getSeikyuShokujiHiyoTanjyunSearch(被保険者番号, サービス年月, 整理番号, 事業者番号, 様式番号,   明細番号, null);
        getHandler(div).initialize(shokanKihonList, shokanShokujiHiyoList);
          
        ShikibetsuNoKanriEntity shikibetsuNoKanriEntity = ShokanbaraiJyokyoShokai.createInstance()
                .getShikibetsubangoKanri(サービス年月, 様式番号);
        getHandler(div).setボタン表示制御処理(shikibetsuNoKanriEntity, サービス年月);
        return ResponseData.of(div).respond();        
    }
    
     /**
     * 基本情報ボタンを押下した際に実行します。
     * @param div 
     * @return  
     */
    public ResponseData<GoukeiInfoDiv> onClick_btnKihonInfo(GoukeiInfoDiv div) {
        return ResponseData.of(div).respond();
    }
    
     /**
     * 給付費明細ボタンを押下した際に実行します。
     * @param div 
     * @return  
     */
    public ResponseData<GoukeiInfoDiv> onClick_btnKyufuhiMeisai(GoukeiInfoDiv div) {
        return ResponseData.of(div).respond();
    }

    /**
     * 特定診療費ボタンを押下した際に実行します。
     * @param div 
     * @return 
     */
    public ResponseData<GoukeiInfoDiv> onClick_btnTokuteiShinryohi(GoukeiInfoDiv div) {
        return ResponseData.of(div).respond();
    }

    /**
     * サービス計画費ボタンを押下した際に実行します。
     * @param div
     * @return 
     */
    public ResponseData<GoukeiInfoDiv> onClick_btnServiceKeikakuhi(GoukeiInfoDiv div) {
        return ResponseData.of(div).respond();
    }

    /**
     * 特定入所者費用ボタンを押下した際に実行します。
     * @param div 
     * @return
     */
    public ResponseData<GoukeiInfoDiv> onClick_btnTokuteiNyushosya(GoukeiInfoDiv div) {
        return ResponseData.of(div).respond();
    }
    
    /**
     * 給付費明細(住所地特例)ボタンを押下した際に実行します。
     * @param div 
     * @return 
     */
    public ResponseData<GoukeiInfoDiv> onClick_btnKyufuhiMeisaiJyuchi(GoukeiInfoDiv div) {
        return ResponseData.of(div).respond();
    }

    /**
     * 緊急時施設療養費ボタンを押下した際に実行します。
     * @param div
     * @return
     */
    public ResponseData<GoukeiInfoDiv> onClick_btnKinkyujiShisetsuRyoyo(GoukeiInfoDiv div) {
        return ResponseData.of(div).respond();
    }
    
    /**
     * 緊急時・所定疾患ボタンを押下した際に実行します。
     * @param div
     * @return
     */
    public ResponseData<GoukeiInfoDiv> onClick_btnKinkyujiShoteiShikkan(GoukeiInfoDiv div) {
        return ResponseData.of(div).respond();
    }

    /**
     * 食事費用ボタンを押下した際に実行します。
     * @param div
     * @return
     */
    public ResponseData<GoukeiInfoDiv> onClick_btnShokujiHiyo(GoukeiInfoDiv div) {
        return ResponseData.of(div).respond();
    }

    /**
     * 請求額集計ボタンを押下した際に実行します。
     * @param div 
     * @return
     */
    public ResponseData<GoukeiInfoDiv> onClick_btnSeikyugakuShukei(GoukeiInfoDiv div) {
        return ResponseData.of(div).respond();
    }
    
    /**
     * 社福軽減額ボタンを押下した際に実行します。
     * @param div 
     * @return
     */
    public ResponseData<GoukeiInfoDiv> onClick_btnShafukukeigengaku(GoukeiInfoDiv div) {
        return ResponseData.of(div).respond();
    }
    
    /**
     * サービス提供証明書へ戻るボタンを押下した際に実行します。
     * @param div 
     * @return
     */
    public ResponseData<GoukeiInfoDiv> onClick_btnBack(GoukeiInfoDiv div) {
        return ResponseData.of(div).respond();
    }

    
    private GoukeiInfoHandler getHandler(GoukeiInfoDiv div) {
        return new GoukeiInfoHandler(div);
    }
}
