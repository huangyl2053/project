/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.divcontroller.controller.parentdiv.DBA1110011;

import java.util.List;
import jp.co.ndensan.reams.db.dba.business.core.hihokenshashohakkokanribo.KayiSyuuJiyuu;
import jp.co.ndensan.reams.db.dba.business.core.hihokenshashohakkokanribo.KouFuJiyuu;
import jp.co.ndensan.reams.db.dba.definition.batchprm.hihokenshashohakkokanribo.HihokenshashoHakkoKanriboBatchParameter;
import jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA1110011.BatchPanelDiv;
import jp.co.ndensan.reams.db.dba.divcontroller.handler.DBA1110011.BatchPanelHandler;
import jp.co.ndensan.reams.db.dba.service.core.hihokenshashohakkokanribo.HihokenshashoHakkoKanriboFinder;
import jp.co.ndensan.reams.db.dbz.definition.message.DbzErrorMessages;
import jp.co.ndensan.reams.ur.urz.business.IUrControlData;
import jp.co.ndensan.reams.ur.urz.business.UrControlDataFactory;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrQuestionMessages;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.ApplicationException;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.message.MessageDialogSelectedResult;
import jp.co.ndensan.reams.uz.uza.message.QuestionMessage;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ResponseHolder;

/**
 *
 * 被保険者証発行管理簿Divを制御します。
 */
public class BatchPanel {

    private static final RString 未回収者リスト = new RString("key1");

    /**
     * 被保険者証発行管理簿を画面初期化処理しました。
     *
     * @param div {@link BatchPanelDiv 被保険者証発行管理簿Div}
     * @return 被保険者証発行管理簿Divを持つResponseData
     */
    public ResponseData<BatchPanelDiv> onLoad(BatchPanelDiv div) {
        IUrControlData controlData = UrControlDataFactory.createInstance();
        RString menuID = controlData.getMenuID();
        //List<KouFuJiyuu> kouFuJiyuuList = HihokenshashoHakkoKanriboFinder.createInstance().getKofuJiyuInitialData(new RString("DBAMN72001")).records();
        //List<KayiSyuuJiyuu> kayiSyuuJiyuuList = HihokenshashoHakkoKanriboFinder.createInstance().getKaishuJiyuInitialData(new RString("DBAMN72001")).records();
        List<KouFuJiyuu> kouFuJiyuuList = HihokenshashoHakkoKanriboFinder.createInstance().getKofuJiyuInitialData(menuID).records();
        List<KayiSyuuJiyuu> kayiSyuuJiyuuList = HihokenshashoHakkoKanriboFinder.createInstance().getKaishuJiyuInitialData(menuID).records();
        getHandler(div).initialize(kouFuJiyuuList, kayiSyuuJiyuuList);
        SubGyomuCode subGyomuCode = div.getCcdChohyoShutsuryokujun().getサブ業務コード();
        ReportId reportId = div.getCcdChohyoShutsuryokujun().get帳票ID();
        div.getCcdChohyoShutsuryokujun().load(subGyomuCode, reportId);
        return ResponseData.of(div).respond();
    }

    /**
     * 被保険者証発行管理簿を「実行する」を押下する。<br/>
     *
     * @param div {@link BatchPanelDiv 被保険者証発行管理簿Div}
     * @return 被保険者証発行管理簿Divを持つResponseData
     */
    public ResponseData onClick_btnJikko(BatchPanelDiv div) {

        ResponseData<HihokenshashoHakkoKanriboBatchParameter> response = new ResponseData<>();
        RDate koufubiFrom = div.getTxtKoufubiRange().getFromValue();
        RDate koufubiTo = div.getTxtKoufubiRange().getToValue();
        RDate kaishubiFrom = div.getTxtKaishubiRange().getFromValue();
        RDate kaishubiTo = div.getTxtKaishubiRange().getToValue();
        if (!ResponseHolder.isReRequest()) {
            QuestionMessage message = new QuestionMessage(UrQuestionMessages.処理実行の確認.getMessage().getCode(),
                    UrQuestionMessages.処理実行の確認.getMessage().evaluate());
            return ResponseData.of(div).addMessage(message).respond();
        }
        if (new RString(UrQuestionMessages.処理実行の確認.getMessage().getCode()).equals(ResponseHolder.getMessageCode())
                && ResponseHolder.getButtonType() == MessageDialogSelectedResult.Yes) {
            if ((koufubiFrom != null && koufubiTo != null) && koufubiTo.isBefore(koufubiFrom)) {
                throw new ApplicationException(
                        DbzErrorMessages.期間が不正_未来日付不可.getMessage().replace(koufubiFrom.toString(), koufubiTo.toString()));
            }
            if ((kaishubiFrom != null && kaishubiTo != null) && kaishubiTo.isBefore(kaishubiFrom)) {
                throw new ApplicationException(
                        DbzErrorMessages.期間が不正_未来日付不可.getMessage().replace(kaishubiFrom.toString(), kaishubiTo.toString()));
            }
            boolean flg = HihokenshashoHakkoKanriboFinder.createInstance().checkInput(
                    koufubiFrom, koufubiTo, kaishubiFrom, kaishubiTo);
            if (!flg) {
                throw new IllegalStateException(UrErrorMessages.必須.toString());
            } else {
                IUrControlData controlData = UrControlDataFactory.createInstance();
                RString menuID = controlData.getMenuID();
                List<KouFuJiyuu> kouFuJiyuuList = HihokenshashoHakkoKanriboFinder.createInstance().getKofuJiyuInitialData(new RString("DBAMN72001")).records();
                List<KayiSyuuJiyuu> kayiSyuuJiyuuList = HihokenshashoHakkoKanriboFinder.createInstance().getKaishuJiyuInitialData(new RString("DBAMN72001")).records();
                response.data = getHandler(div).batchParameter(kouFuJiyuuList, kayiSyuuJiyuuList, menuID);
            }
        }
        return response;
    }

    /**
     * 被保険者証発行管理簿を「連動」する。<br/>
     *
     * @param div {@link BatchPanelDiv 被保険者証発行管理簿Div}
     * @return 被保険者証発行管理簿Divを持つResponseData
     */
    public ResponseData<BatchPanelDiv> onClick_btnChange(BatchPanelDiv div) {

        if (未回収者リスト.equals(div.getRadShutsuTaisho().getSelectedKey())) {
            div.getTxtKaishubiRange().setReadOnly(true);
            div.getChkSaishinJoho().setReadOnly(true);
            div.getDgKaishuJiyu().setDisabled(true);
        } else {
            div.getTxtKoufubiRange().clearFromValue();
            div.getTxtKoufubiRange().clearToValue();
            div.getTxtKaishubiRange().clearFromValue();
            div.getTxtKaishubiRange().clearToValue();
            div.getTxtKaishubiRange().setReadOnly(false);
            div.getChkSaishinJoho().setReadOnly(false);
            div.getDgKaishuJiyu().setDisabled(false);
        }
        return ResponseData.of(div).respond();
    }

    private BatchPanelHandler getHandler(BatchPanelDiv div) {
        return new BatchPanelHandler(div);
    }
}
