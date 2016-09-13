/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.divcontroller.controller.parentdiv.DBB0130002;

import jp.co.ndensan.reams.db.dbb.definition.batchprm.tokuchoheijunkakakutei.TokuchoHeijunkaKakuteiBatchParameter;
import jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0130002.DBB0130002StateName;
import jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0130002.HeijunkaKakuteiDiv;
import jp.co.ndensan.reams.db.dbb.divcontroller.handler.parentdiv.DBB0130002.HeijunkaKakuteiHandler;
import jp.co.ndensan.reams.db.dbx.definition.core.viewstate.ViewStateKeys;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ShoriDateKanri;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 * 画面設計_DBBGM35004_特徴平準化確定のクラスです。
 *
 * @reamsid_L DBB-0830-010 wangkanglei
 */
public class HeijunkaKakutei {

    /**
     * 画面初期化のメソッドます。
     *
     * @param div HeijunkaKakuteiDiv
     * @return ResponseData
     */
    public ResponseData<HeijunkaKakuteiDiv> onLoad(HeijunkaKakuteiDiv div) {
        getHandler(div).check基準日時();
        ShoriDateKanri 処理日付管理 = getHandler(div).initialize();
        ViewStateHolder.put(ViewStateKeys.処理日付管理, 処理日付管理);
        return ResponseData.of(div).setState(DBB0130002StateName.平準化確定リアル);
    }

    /**
     * 「設定する」ボタンのメソッドます。
     *
     * @param div HeijunkaKakuteiDiv
     * @return ResponseData
     */
    public ResponseData<HeijunkaKakuteiDiv> onClick_btnSagakuSettei(HeijunkaKakuteiDiv div) {
        getHandler(div).set差額();
        return ResponseData.of(div).respond();
    }

    /**
     * 「差額設定による対象外件数を算出する」ボタンのメソッドます。
     *
     * @param div HeijunkaKakuteiDiv
     * @return ResponseData
     */
    public ResponseData<HeijunkaKakuteiDiv> onClick_btnTaishoGaiKensuSanshutsu(HeijunkaKakuteiDiv div) {
        ShoriDateKanri 処理日付管理 = ViewStateHolder.get(ViewStateKeys.処理日付管理, ShoriDateKanri.class);
        if (getHandler(div).set対象件数と対象外件数(処理日付管理.get基準日時())) {
            return ResponseData.of(div).setState(DBB0130002StateName.平準化確定リアル);
        } else {
            return ResponseData.of(div).setState(DBB0130002StateName.平準化確定バッチ);
        }
    }

    /**
     * 「確定処理を実行する（リアル用）」ボタンのメソッドます。
     *
     * @param div HeijunkaKakuteiDiv
     * @return ResponseData
     */
    public ResponseData<HeijunkaKakuteiDiv> onClick_btnKakuteiReal(HeijunkaKakuteiDiv div) {
        ShoriDateKanri 処理日付管理 = ViewStateHolder.get(ViewStateKeys.処理日付管理, ShoriDateKanri.class);
        getHandler(div).更新賦課処理状況更新(処理日付管理);
        return ResponseData.of(div).respond();
    }

    /**
     * 「確定処理を実行する（バッチ用）」ボタンのメソッドます。
     *
     * @param div HeijunkaKakuteiDiv
     * @return ResponseData
     */
    public ResponseData<TokuchoHeijunkaKakuteiBatchParameter> onClick_btnKakuteiBatch(HeijunkaKakuteiDiv div) {
        ShoriDateKanri 処理日付管理 = ViewStateHolder.get(ViewStateKeys.処理日付管理, ShoriDateKanri.class);
        TokuchoHeijunkaKakuteiBatchParameter parameter = getHandler(div).creatParameter(処理日付管理.get基準日時());
        return ResponseData.of(parameter).respond();
    }

    private HeijunkaKakuteiHandler getHandler(HeijunkaKakuteiDiv div) {
        return new HeijunkaKakuteiHandler(div);
    }
}