/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.divcontroller.controller.parentdiv.dbb0320003;

import jp.co.ndensan.reams.db.dbb.business.viewstate.FukaShokaiKey;
import jp.co.ndensan.reams.db.dbb.divcontroller.controller.parentdiv.fuka.FukaShokaiController;
import jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0320003.FukaShokaiControlDiv;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;

/**
 * 特別徴収画面の賦課照会コントロールdivです。
 *
 * @author N3317 塚田 萌
 */
public class TokuchoFukaShokaiControl {

    /**
     * コントロールdivの初期処理です。
     *
     * @param div コントロールdiv
     * @return レスポンスデータ
     */
    public ResponseData<FukaShokaiControlDiv> initialize(FukaShokaiControlDiv div) {

        FukaShokaiKey key = FukaShokaiController.getFukaShokaiKeyInViewState();

        div.getTxtChoteiNendo().setDomain(key.get調定年度());
        div.getTxtKoseiM().setValue(key.get更正月());
        div.getTxtKoseiYMD().setValue(new FlexibleDate(key.get更正日時().getDate().toString()));
        div.getTxtKoseiTime().setValue(key.get更正日時().getTime());

        return createResponseData(div);
    }

    private ResponseData<FukaShokaiControlDiv> createResponseData(FukaShokaiControlDiv div) {
        ResponseData<FukaShokaiControlDiv> response = new ResponseData<>();
        response.data = div;
        return response;
    }
}