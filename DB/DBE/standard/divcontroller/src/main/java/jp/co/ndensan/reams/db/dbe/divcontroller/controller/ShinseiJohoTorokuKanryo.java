/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.divcontroller.controller;

import jp.co.ndensan.reams.db.dbe.divcontroller.entity.ShinseiJohoInputDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.ShinseiJohoTorokuKanryoDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.controller.KaigoKanryoMessage;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 *
 * @author N3327 三浦 凌
 */
public class ShinseiJohoTorokuKanryo {

    /**
     * onLoad
     *
     * @param div ShinseiJohoTorokuKanryoDiv
     * @param shinsei ShinseiJohoInputDiv
     * @return ResponseData
     */
    public ResponseData<ShinseiJohoTorokuKanryoDiv> onLoad(ShinseiJohoTorokuKanryoDiv div, ShinseiJohoInputDiv shinsei) {
        return onClick_btnToSaveShinsei(div, shinsei);
    }

    public ResponseData<ShinseiJohoTorokuKanryoDiv> onClick_btnToSaveShinsei(ShinseiJohoTorokuKanryoDiv div, ShinseiJohoInputDiv shinsei) {
        KaigoKanryoMessage.setMessage(div.getKanryoMessage(),
                new RString("登録は正常に行われました。"),
                extractHihokenshaNo(shinsei),
                extractHihokenshaShimei(shinsei));
        div.setDisplayNone(false);
        return _createResponseData(div);
    }

    private RString extractHihokenshaNo(ShinseiJohoInputDiv shinsei) {
        return shinsei.getHihokenshaOutline().getTxtHihokenshaNo().getValue();
    }

    private RString extractHihokenshaShimei(ShinseiJohoInputDiv shinsei) {
        return shinsei.getHihokenshaOutline().getTxtShimei().getValue();
    }

    private ResponseData<ShinseiJohoTorokuKanryoDiv> _createResponseData(ShinseiJohoTorokuKanryoDiv div) {
        ResponseData<ShinseiJohoTorokuKanryoDiv> response = new ResponseData<>();
        response.data = div;
        return response;
    }
}