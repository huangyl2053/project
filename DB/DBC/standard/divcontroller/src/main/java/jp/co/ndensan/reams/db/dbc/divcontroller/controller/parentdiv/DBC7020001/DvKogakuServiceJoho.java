/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.controller.parentdiv.DBC7020001;

import jp.co.ndensan.reams.db.dbc.definition.batchprm.dvkogakuservicejoho.DvKogakuServiceJohoBatchParamter;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC7020001.DvKogakuChushutsuJokenDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC7020001.DvKogakuServiceJohoDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.handler.parentdiv.DBC7020001.DvKogakuServiceJohoHandler;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.GyomuBunrui;
import jp.co.ndensan.reams.db.dbx.service.ShichosonSecurityJoho;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;

/**
 * 汎用リスト_高額介護サービス費状況
 *
 * @reamsid_L DBC-3092-010 zhuliangwei
 */
public class DvKogakuServiceJoho {

    private static final Code CODE_111 = new Code("111");

    /**
     * 画面初期化のonLoadメソッドます。
     *
     * @param div DvKogakuServiceJohoDiv
     * @return ResponseData
     */
    public ResponseData<DvKogakuServiceJohoDiv> onLoad(DvKogakuServiceJohoDiv div) {
        DvKogakuServiceJohoHandler handler = getHandler(div);
        handler.initialize();
        ShichosonSecurityJoho 市町村セキュリティ情報 = ShichosonSecurityJoho.getShichosonSecurityJoho(GyomuBunrui.介護事務);
        DvKogakuChushutsuJokenDiv panel = div.getDvKogakuServiceParam().getDvKogakuChushutsuJoken();
        panel.getCcdHokenshaList().loadHokenshaList();
        if (CODE_111.equals(市町村セキュリティ情報.get導入形態コード())) {
            panel.getCcdHokenshaList().setDisabled(false);
            panel.getCcdHokenshaList().setVisible(true);
        } else {
            panel.getCcdHokenshaList().setDisabled(true);
            panel.getCcdHokenshaList().setVisible(false);
        }
        return createResponse(div);
    }

    /**
     * onClick事件 条件の保存 画面条件の保存 処理詳細シート「2．条件の保存・復元」 のとおり、画面項目の設定値をバッチパラメータに設定、更新する。
     *
     * @param div DvKogakuServiceJohoDiv
     * @return ResponseData
     */
    public ResponseData<DvKogakuServiceJohoDiv> onClick_btnKogakuParamSave(DvKogakuServiceJohoDiv div) {
        DvKogakuServiceJohoHandler handler = getHandler(div);
        handler.getCheckMessage();
        // TODO
        return createResponse(div);
    }

    /**
     * onClick事件 条件の復元 画面条件の復元 処理詳細シート「2．条件の保存・復元」 のとおり、バッチパラメータより画面設定値を取得し画面項目にセットする。
     *
     * @param div DvKogakuServiceJohoDiv
     * @return ResponseData
     */
    public ResponseData<DvKogakuServiceJohoDiv> onClick_btnKogakuParamRestore(DvKogakuServiceJohoDiv div) {
        // TODO
        return createResponse(div);
    }

    /**
     * onChange事件 支払先RDBボタンの制御事件
     *
     * @param div DvKogakuServiceJohoDiv
     * @return ResponseData
     */
    public ResponseData<DvKogakuServiceJohoDiv> onChange_radKogakuShiharaisaki(DvKogakuServiceJohoDiv div) {
        DvKogakuServiceJohoHandler handler = getHandler(div);
        handler.getKinyuKikanSeigyo();
        return createResponse(div);
    }

    /**
     * click事件「実行する」ボタン(画面用)
     *
     * @param div DvKogakuServiceJohoDiv
     * @return ResponseData
     */
    public ResponseData<DvKogakuServiceJohoDiv> click_ExecuteCheck(DvKogakuServiceJohoDiv div) {
        DvKogakuServiceJohoHandler handler = getHandler(div);
        ValidationMessageControlPairs pairs = handler.getCheckMessage();
        if (pairs.iterator().hasNext()) {
            return ResponseData.of(div).addValidationMessages(pairs).respond();
        }
        return createResponse(div);
    }

    /**
     * click事件「実行する」ボタン（batch用）
     *
     * @param div DvKogakuServiceJohoDiv
     * @return ResponseData
     */
    public ResponseData<DvKogakuServiceJohoBatchParamter> check_batchRegister(DvKogakuServiceJohoDiv div) {
        DvKogakuServiceJohoHandler handler = getHandler(div);
        DvKogakuServiceJohoBatchParamter parameter = handler.getBatchParamter();
        return ResponseData.of(parameter).respond();
    }

    /**
     * createResponseメソッドの設定
     *
     * @param div DvKogakuServiceJohoDiv
     * @return ResponseData
     */
    private ResponseData<DvKogakuServiceJohoDiv> createResponse(DvKogakuServiceJohoDiv div) {
        return ResponseData.of(div).respond();
    }

    /**
     * Handlerクラスの取得
     *
     * @param div DvKogakuServiceJohoDiv
     * @return DvKogakuServiceJohoHandler
     */
    private DvKogakuServiceJohoHandler getHandler(DvKogakuServiceJohoDiv div) {
        return DvKogakuServiceJohoHandler.of(div);
    }

}
