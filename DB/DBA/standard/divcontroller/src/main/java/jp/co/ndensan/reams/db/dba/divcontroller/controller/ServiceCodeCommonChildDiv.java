/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.co.ndensan.reams.db.dba.divcontroller.controller;

import java.util.List;
import jp.co.ndensan.reams.db.dba.divcontroller.entity.commonchilddiv.ServiceCodeCommonChildDiv.ServiceCodeCommonChildDivDiv;
import jp.co.ndensan.reams.db.dba.divcontroller.entity.commonchilddiv.ServiceCodeCommonChildDiv.ServiceCodeCommonChildHandler;
import jp.co.ndensan.reams.db.dbx.business.core.kaigoserviceshurui.kaigoservicenaiyou.KaigoServiceNaiyou;
import jp.co.ndensan.reams.db.dbx.definition.mybatis.param.servicecode.SabisuKodoParameter;
import jp.co.ndensan.reams.db.dbx.service.core.kaigoserviceshurui.kaigoservicenaiyou.KaigoServiceNaiyouManager;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.KaigoServiceShuruiCode;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.ApplicationException;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 *
 * サービスコード検索一覧のコントローラです。
 */
public class ServiceCodeCommonChildDiv {
    
    /**
     * サービスコード検索一覧初期化の設定します。
     *
     * @param div ServiceCodeCommonChildDivDiv
     * @return ResponseData<ServiceCodeCommonChildDivDiv>
     */
    public ResponseData<ServiceCodeCommonChildDivDiv> onLoad(ServiceCodeCommonChildDivDiv div) {
        getHandler(div).onLoad();
        return ResponseData.of(div).respond();
    }
    
    /**
     * 「サービスコードを検索する」ボタンをクリックの設定します。
     *
     * @param div ServiceCodeCommonChildDivDiv
     * @return ResponseData<ServiceCodeCommonChildDivDiv>
     */
    public ResponseData<ServiceCodeCommonChildDivDiv> onClick_Kensaku(ServiceCodeCommonChildDivDiv div) {
        if (div.getTxtKijunYM().getValue() == null
                || div.getTxtServiceCode().getValue().isEmpty()) {
            return ResponseData.of(div).respond();
        }
        KaigoServiceShuruiCode サービス種類コード = new KaigoServiceShuruiCode(div.getTxtServiceCode().getValue().substring(0, 2));
        KaigoServiceNaiyouManager service = KaigoServiceNaiyouManager.createInstance();
        RDate kijunYmDate = new RDate(div.getTxtKijunYM().getValue().toString());
        FlexibleYearMonth kijunYmFlex = new FlexibleYearMonth(kijunYmDate.getYearMonth().toDateString());
        kijunYmFlex.wareki().fillType(FillType.NONE);
        // TODO 董亜彬 QA:47の回答する、2015/11/30まで
        // サービス項目コード:div.getTxtServiceCode().getValue().substring(2, 6);
        SabisuKodoParameter param = SabisuKodoParameter.createSearchParam(サービス種類コード.getColumnValue(),
                new RString("1001"), kijunYmFlex);
        List<KaigoServiceNaiyou> list = service.getServiceCodeList(param);
        getHandler(div).initialize(list);
        return ResponseData.of(div).respond();
    }
    
    /**
     * 「やめる」ボタンをクリック場合、画面が閉じるします。
     *
     * @param div ServiceCodeCommonChildDivDiv
     * @return ResponseData<ServiceCodeCommonChildDivDiv>
     */
    public ResponseData<ServiceCodeCommonChildDivDiv> onClick_btnYameru(ServiceCodeCommonChildDivDiv div) {
        return ResponseData.of(div).respond();
    }
    
    /**
     * 「確定する」ボタンをクリック場合、画面遷移が表示します。
     *
     * @param div ServiceCodeCommonChildDivDiv
     * @return ResponseData<ServiceCodeCommonChildDivDiv>
     */
    public ResponseData<ServiceCodeCommonChildDivDiv> onClick_btnKakutei(ServiceCodeCommonChildDivDiv div) {
        if (div.getDgCodeIchiran().getSelectedItems().size() < 1) {
            throw new ApplicationException(UrErrorMessages.対象行を選択.getMessage());
        }
        getHandler(div).onClick_btnKakutei();
        return ResponseData.of(div).respond();
    }
    
    private ServiceCodeCommonChildHandler getHandler(ServiceCodeCommonChildDivDiv div) {
        return new ServiceCodeCommonChildHandler(div);
    }
}
