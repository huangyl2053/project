/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.divcontroller.controller.parentdiv.DBA2030011;

import jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA2030011.CompleteDiv;
import jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA2030011.KihonJohoDiv;
import jp.co.ndensan.reams.ur.urz.definition.message.UrInformationMessages;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 住所地特例画面における、完了メッセージDivのイベントを定義したDivControllerです。
 *
 * @author n8178 城間篤人
 */
public class Complete {

    /**
     * 住所地特例異動の登録を完了するボタンが押下されたときに実行します。<br/>
     * 完了メッセージに、処理対象者の情報を設定します。
     *
     * @param compDiv {@link CompleteDiv 完了メッセージDiv}
     * @param kihonDiv {@link KihonJohoDiv 基本情報Div}
     * @return 完了メッセージDivを持つResponseData
     */
    public ResponseData<CompleteDiv> onAciveComplete(CompleteDiv compDiv, KihonJohoDiv kihonDiv) {

        RString messageMain = new RString(UrInformationMessages.保存終了.getMessage().evaluate());
        RString messageTaishoHihoNo = kihonDiv.getCcdKaigoShikakuKihon().get被保険者番号().getColumnValue();
        RString messageTaishoName = kihonDiv.getCcdKaigoAtenaInfo().getName().getColumnValue();

        compDiv.getCcdKaigoKanryoMessage().setSuccessMessage(messageMain, messageTaishoHihoNo, messageTaishoName);

        return ResponseData.of(compDiv).respond();
    }
}