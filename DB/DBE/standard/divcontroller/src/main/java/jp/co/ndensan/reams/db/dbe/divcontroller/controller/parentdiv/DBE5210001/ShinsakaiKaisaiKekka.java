/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.divcontroller.controller.parentdiv.DBE5210001;

import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.core.Shinsakai.shinsakaikaisaikekkajoho.ShinsakaiKaisaiKekkaJoho;
import jp.co.ndensan.reams.db.dbe.business.core.Shinsakai.shinsakaikaisaikekkajoho.ShinsakaiKaisaiKekkaJohoBuilder;
import jp.co.ndensan.reams.db.dbe.business.core.Shinsakai.shinsakaikaisaikekkajoho.ShinsakaiKaisaiKekkaJohoIdentifier;
import jp.co.ndensan.reams.db.dbe.business.core.Shinsakai.shinsakaikaisaiyoteijoho.ShinsakaiKaisaiYoteiJoho;
import jp.co.ndensan.reams.db.dbe.business.core.Shinsakai.shinsakaikaisaiyoteijoho.ShinsakaiKaisaiYoteiJohoBuilder;
import jp.co.ndensan.reams.db.dbe.business.core.Shinsakai.shinsakaikaisaiyoteijoho.ShinsakaiKaisaiYoteiJohoIdentifier;
import jp.co.ndensan.reams.db.dbe.business.core.Shinsakai.shinsakaiwariateiinjoho.ShinsakaiWariateIinJoho;
import jp.co.ndensan.reams.db.dbe.business.core.Shinsakai.shinsakaiwariateiinjoho.ShinsakaiWariateIinJohoBuilder;
import jp.co.ndensan.reams.db.dbe.business.core.Shinsakai.shinsakaiwariateiinjoho.ShinsakaiWariateIinJohoIdentifier;
import jp.co.ndensan.reams.db.dbe.business.core.shinsakaiKaisaiKekka.ShinsakaiKaisaiYoteiJohoBusiness;
import jp.co.ndensan.reams.db.dbe.business.core.shinsakaiKaisaiKekka.ShinsakaiWariateIinJohoBusiness;
import jp.co.ndensan.reams.db.dbe.definition.core.ViewStateKeys;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE5210001.DBE5210001TransitionEventName;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE5210001.ShinsakaiKaisaiKekkaDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE5210001.dgShinsakaiIinIchiran_Row;
import jp.co.ndensan.reams.db.dbe.divcontroller.handler.parentdiv.DBE5210001.ShinsakaiKaisaiKekkaHandler;
import jp.co.ndensan.reams.db.dbe.divcontroller.handler.parentdiv.DBE5210001.ShinsakaiKaisaiValidationHandler;
import jp.co.ndensan.reams.db.dbe.service.core.shinsakai.shinsakaikaisaikekkajoho.ShinsakaiKaisaiKekkaJohoManager;
import jp.co.ndensan.reams.db.dbe.service.core.shinsakai.shinsakaikaisaiyoteijoho.ShinsakaiKaisaiYoteiJohoManager;
import jp.co.ndensan.reams.db.dbe.service.core.shinsakai.shinsakaiwariateiinjoho.ShinsakaiWariateIinJohoManager;
import jp.co.ndensan.reams.db.dbe.service.core.shinsakaiKaisaiKekka.ShinsakaiKaisaiKekkaFinder;
import jp.co.ndensan.reams.ur.urz.definition.message.UrInformationMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrQuestionMessages;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RTime;
import jp.co.ndensan.reams.uz.uza.message.MessageDialogSelectedResult;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ResponseHolder;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;
import jp.co.ndensan.reams.uz.uza.util.Models;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import jp.co.ndensan.reams.uz.uza.util.db.SearchResult;

/**
 *
 * 介護認定審査会開催結果登録するクラスです
 *
 */
public class ShinsakaiKaisaiKekka {

    private final ShinsakaiKaisaiKekkaFinder service;
    private final ShinsakaiKaisaiYoteiJohoManager manager;

    /**
     * コンストラクタです。
     */
    public ShinsakaiKaisaiKekka() {
        service = ShinsakaiKaisaiKekkaFinder.createInstance();
        manager = ShinsakaiKaisaiYoteiJohoManager.createInstance();
    }

    /**
     * 画面初期化表示、画面項目に設定されている値をクリアする。
     *
     * @param div
     * @return
     */
    public ResponseData<ShinsakaiKaisaiKekkaDiv> onLoad(ShinsakaiKaisaiKekkaDiv div) {
        ResponseData<ShinsakaiKaisaiKekkaDiv> responseData = new ResponseData<>();
//        RString 開催番号 = ViewStateHolder.get(ViewStateKeys.開催番号, RString.class);
        RString 開催番号 = new RString("41022222");
        ShinsakaiKaisaiYoteiJohoBusiness saiYoteiJoho = service.getヘッドエリア内容検索(開催番号);
        getHandler(div).onLoad(saiYoteiJoho);
        List<ShinsakaiWariateIinJohoBusiness> list = service.get審査会委員一覧検索(開催番号).records();
        getHandler(div).initialize(list);
        SearchResult<ShinsakaiKaisaiYoteiJoho> yoteiJohoList = service.get審査会委員(開催番号);
        Models<ShinsakaiKaisaiYoteiJohoIdentifier, ShinsakaiKaisaiYoteiJoho> shinsakaiKaisaiYoteiJoho = Models.create(yoteiJohoList.records());
        ViewStateHolder.put(ViewStateKeys.審査会開催結果登録, shinsakaiKaisaiYoteiJoho);
        responseData.data = div;
        return responseData;
    }

    /**
     * 音声ファイルを追加 ボタンを押下 音声ファイル取込を行う
     *
     * @param div
     * @return responseData
     */
    public ResponseData onClick_AddButton(ShinsakaiKaisaiKekkaDiv div) {
        ResponseData<ShinsakaiKaisaiKekkaDiv> responseData = new ResponseData<>();

        responseData.data = div;
        return responseData;
    }

    /**
     * 審査会委員一覧Gridの「削除」ボタンを押下 ＤＢ介護認定審査会割当委員情報」より物理削除する
     *
     * @param div
     * @return responseData
     */
    public ResponseData onClick_DeleteButton(ShinsakaiKaisaiKekkaDiv div) {
        if (!ResponseHolder.isReRequest()) {
            return ResponseData.of(div).addMessage(UrQuestionMessages.削除の確認.getMessage()).respond();
        }
        ResponseData<ShinsakaiKaisaiKekkaDiv> responseData = new ResponseData<>();
        if (ResponseHolder.getButtonType() == MessageDialogSelectedResult.Yes) {
            //        RString 開催番号 = ViewStateHolder.get(ViewStateKeys.開催番号, RString.class);
            RString 開催番号 = new RString("41022222");
            Models<ShinsakaiKaisaiYoteiJohoIdentifier, ShinsakaiKaisaiYoteiJoho> yoteiJohoModel = ViewStateHolder.get(ViewStateKeys.審査会開催結果登録, Models.class);
            ShinsakaiKaisaiYoteiJohoIdentifier shinsakaiKaisaiYoteiJohoIdentifier = new ShinsakaiKaisaiYoteiJohoIdentifier(開催番号);
            ShinsakaiKaisaiYoteiJoho shinsakaiKaisaiYoteiJoho = yoteiJohoModel.get(shinsakaiKaisaiYoteiJohoIdentifier);
            ShinsakaiWariateIinJohoIdentifier shinsakaiWariateIinJohoIdentifier = new ShinsakaiWariateIinJohoIdentifier(開催番号, div.getDgShinsakaiIinIchiran().getClickedItem().getShinsakjaiIinCode());
            ShinsakaiWariateIinJoho shinsakaiWariateIinJoho = shinsakaiKaisaiYoteiJoho.getShinsakaiWariateIinJoho(shinsakaiWariateIinJohoIdentifier);
            shinsakaiWariateIinJoho.deleted();
            ShinsakaiKaisaiYoteiJohoBuilder shinsakaiKaisaiYoteiJohoBuilder = shinsakaiKaisaiYoteiJoho.createBuilderForEdit();
            shinsakaiKaisaiYoteiJohoBuilder.setShinsakaiWariateIinJoho(shinsakaiWariateIinJoho);
            shinsakaiKaisaiYoteiJoho = shinsakaiKaisaiYoteiJohoBuilder.build();
            yoteiJohoModel.deleteOrRemove(shinsakaiKaisaiYoteiJohoIdentifier);
            yoteiJohoModel.add(shinsakaiKaisaiYoteiJoho);
            ViewStateHolder.put(ViewStateKeys.審査会開催結果登録, yoteiJohoModel);
        }
        responseData.data = div;
        return responseData;
    }

    /**
     * 保存」ボタンを押下 介護認定審査会結果情報更新処理。
     *
     * @param div ShinsakaiKaisaiKekkaDiv
     * @return ResponseData<ShinsakaiKaisaiKekkaDiv>
     */
    public ResponseData onClick_btnUpdate(ShinsakaiKaisaiKekkaDiv div) {
        ResponseData<ShinsakaiKaisaiKekkaDiv> responseData = new ResponseData<>();
        ValidationMessageControlPairs validationMessages = new ValidationMessageControlPairs();
        validationMessages.add(getValidationHandler(div).yoteiStartToKaisaiEndTimeCheck());
        validationMessages.add(getValidationHandler(div).出席時間Check());
        validationMessages.add(getValidationHandler(div).退席時間Check());
        validationMessages.add(getValidationHandler(div).議長複数Check());
        validationMessages.add(getValidationHandler(div).議長出席Check());
        validationMessages.add(getValidationHandler(div).全員が遅刻Check());
        validationMessages.add(getValidationHandler(div).全員が早退Check());
        if (validationMessages.iterator().hasNext()) {
            return ResponseData.of(div).addValidationMessages(validationMessages).respond();
        }
        if (!ResponseHolder.isReRequest()) {
            return ResponseData.of(div).addMessage(UrQuestionMessages.保存の確認.getMessage()).respond();
        }
        if (ResponseHolder.getButtonType() == MessageDialogSelectedResult.Yes) {
            setYotei(div);
            return ResponseData.of(div).addMessage(
                    UrInformationMessages.正常終了.getMessage().replace("審査会開催結果登録")).respond();
        }
        onLoad(div);
        return responseData;
    }

    public ResponseData<ShinsakaiKaisaiKekkaDiv> onClick_btnRetuen(ShinsakaiKaisaiKekkaDiv div) {
        return ResponseData.of(div).forwardWithEventName(DBE5210001TransitionEventName.審査会一覧に戻る).respond();
    }

    private ShinsakaiKaisaiKekkaHandler getHandler(ShinsakaiKaisaiKekkaDiv div) {
        return new ShinsakaiKaisaiKekkaHandler(div);
    }

    private void setYotei(ShinsakaiKaisaiKekkaDiv div) {
        RString 開催番号 = new RString("410222222");
//        RString 開催番号 = ViewStateHolder.get(ViewStateKeys.開催番号, RString.class);
        Models<ShinsakaiKaisaiYoteiJohoIdentifier, ShinsakaiKaisaiYoteiJoho> yoteiJohoModel = ViewStateHolder.get(ViewStateKeys.審査会開催結果登録, Models.class);
        if (div.getTxtKaisaiBi().getValue().isEmpty()) {
            setYoteiJoho(div);
        } else {
            setKekkaJoho(div);
        }
        ShinsakaiKaisaiYoteiJohoIdentifier shinsakaiKaisaiYoteiJohoIdentifier = new ShinsakaiKaisaiYoteiJohoIdentifier(開催番号);
        ShinsakaiKaisaiYoteiJoho shinsakaiKaisaiYoteiJoho = yoteiJohoModel.get(shinsakaiKaisaiYoteiJohoIdentifier);
        ShinsakaiWariateIinJohoManager shinsakaiWariateIinJohoManager = ShinsakaiWariateIinJohoManager.createInstance();
        for (ShinsakaiWariateIinJoho shinsakaiWariateIinJoho : shinsakaiKaisaiYoteiJoho.getShinsakaiWariateIinJohoList()) {
            if (shinsakaiKaisaiYoteiJoho.toEntity().getState() == EntityDataState.Deleted) {
                shinsakaiWariateIinJohoManager.deletePhysical(shinsakaiWariateIinJoho);
            }
        }
        setWariateIinJoho(div);
    }

    private void setYoteiJoho(ShinsakaiKaisaiKekkaDiv div) {
        RString 開催番号 = new RString("410222222");
//        RString 開催番号 = ViewStateHolder.get(ViewStateKeys.開催番号, RString.class);
        Models<ShinsakaiKaisaiYoteiJohoIdentifier, ShinsakaiKaisaiYoteiJoho> yoteiJohoModel = ViewStateHolder.get(ViewStateKeys.審査会開催結果登録, Models.class);
        ShinsakaiKaisaiYoteiJohoIdentifier shinsakaiKaisaiYoteiJohoIdentifier = new ShinsakaiKaisaiYoteiJohoIdentifier(開催番号);
        ShinsakaiKaisaiYoteiJoho shinsakaiKaisaiYoteiJoho = yoteiJohoModel.get(shinsakaiKaisaiYoteiJohoIdentifier);
        ShinsakaiKaisaiKekkaJoho shinsakaiKaisaiKekkaJoho = new ShinsakaiKaisaiKekkaJoho(開催番号);
        ShinsakaiKaisaiKekkaJohoBuilder shinsakaiKaisaiKekkaJohoBuilder = shinsakaiKaisaiKekkaJoho.createBuilderForEdit();
        shinsakaiKaisaiKekkaJohoBuilder.set介護認定審査会開催年月日(div.getTxtKaisaiBi().getValue());
        shinsakaiKaisaiKekkaJohoBuilder.set介護認定審査会開始時刻(timeToStr(div.getTxtKaisaiStartTime().getValue()));
        shinsakaiKaisaiKekkaJohoBuilder.set介護認定審査会終了時刻(timeToStr(div.getTxtKaisaiEndTime().getValue()));
        shinsakaiKaisaiKekkaJohoBuilder.set介護認定審査会開催場所コード(div.getDdlKaisaiBasho().getSelectedKey());
        shinsakaiKaisaiKekkaJohoBuilder.set所要時間合計(Integer.valueOf(String.valueOf(div.getTxtShoyoTime().getValue())));
        shinsakaiKaisaiKekkaJohoBuilder.set介護認定審査会実施人数(div.getTxtJissiSu().getValue().intValue());
        shinsakaiKaisaiKekkaJoho = shinsakaiKaisaiKekkaJohoBuilder.build();
        ShinsakaiKaisaiYoteiJohoBuilder shinsakaiKaisaiYoteiJohoBuilder = shinsakaiKaisaiYoteiJoho.createBuilderForEdit();
        shinsakaiKaisaiYoteiJohoBuilder.set介護認定審査会進捗状況(new Code("3"));
        shinsakaiKaisaiYoteiJohoBuilder.setShinsakaiKaisaiKekkaJoho(shinsakaiKaisaiKekkaJoho);
        shinsakaiKaisaiYoteiJoho.modifiedModel();
        shinsakaiKaisaiYoteiJoho = shinsakaiKaisaiYoteiJohoBuilder.build();
        manager.save(shinsakaiKaisaiYoteiJoho);

    }

    private void setKekkaJoho(ShinsakaiKaisaiKekkaDiv div) {
        RString 開催番号 = new RString("41022222");
//        RString 開催番号 = ViewStateHolder.get(ViewStateKeys.開催番号, RString.class);
        Models<ShinsakaiKaisaiYoteiJohoIdentifier, ShinsakaiKaisaiYoteiJoho> yoteiJohoModel = ViewStateHolder.get(ViewStateKeys.審査会開催結果登録, Models.class);
        ShinsakaiKaisaiYoteiJohoIdentifier shinsakaiKaisaiYoteiJohoIdentifier = new ShinsakaiKaisaiYoteiJohoIdentifier(開催番号);
        ShinsakaiKaisaiYoteiJoho shinsakaiKaisaiYoteiJoho = yoteiJohoModel.get(shinsakaiKaisaiYoteiJohoIdentifier);
        ShinsakaiKaisaiKekkaJohoIdentifier shinsakaiKaisaiKekkaJohoIdentifier = new ShinsakaiKaisaiKekkaJohoIdentifier(開催番号);
        ShinsakaiKaisaiKekkaJoho shinsakaiKaisaiKekkaJoho = shinsakaiKaisaiYoteiJoho.getShinsakaiKaisaiKekkaJoho(shinsakaiKaisaiKekkaJohoIdentifier);
        ShinsakaiKaisaiKekkaJohoBuilder shinsakaiKaisaiKekkaJohoBuilder = shinsakaiKaisaiKekkaJoho.createBuilderForEdit();
        shinsakaiKaisaiKekkaJohoBuilder.set介護認定審査会開催年月日(div.getTxtKaisaiBi().getValue());
        shinsakaiKaisaiKekkaJohoBuilder.set介護認定審査会開始時刻(timeToStr(div.getTxtKaisaiStartTime().getValue()));
        shinsakaiKaisaiKekkaJohoBuilder.set介護認定審査会終了時刻(timeToStr(div.getTxtKaisaiEndTime().getValue()));
        shinsakaiKaisaiKekkaJohoBuilder.set介護認定審査会開催場所コード(div.getDdlKaisaiBasho().getSelectedKey());
        shinsakaiKaisaiKekkaJohoBuilder.set所要時間合計(Integer.valueOf(String.valueOf(div.getTxtShoyoTime().getValue())));
        shinsakaiKaisaiKekkaJohoBuilder.set介護認定審査会実施人数(div.getTxtJissiSu().getValue().intValue());
        shinsakaiKaisaiKekkaJoho.modifiedModel();
        shinsakaiKaisaiKekkaJoho = shinsakaiKaisaiKekkaJohoBuilder.build();
        ShinsakaiKaisaiKekkaJohoManager kekkaJohoManager = ShinsakaiKaisaiKekkaJohoManager.createInstance();
        kekkaJohoManager.save介護認定審査会開催結果情報(shinsakaiKaisaiKekkaJoho);
    }

    private void setWariateIinJoho(ShinsakaiKaisaiKekkaDiv div) {
        RString 開催番号 = new RString("41022222");
//        RString 開催番号 = ViewStateHolder.get(ViewStateKeys.開催番号, RString.class);
        Models<ShinsakaiKaisaiYoteiJohoIdentifier, ShinsakaiKaisaiYoteiJoho> yoteiJohoModel = ViewStateHolder.get(ViewStateKeys.審査会開催結果登録, Models.class);
        for (dgShinsakaiIinIchiran_Row row : div.getDgShinsakaiIinIchiran().getDataSource()) {
            ShinsakaiKaisaiYoteiJohoIdentifier shinsakaiKaisaiYoteiJohoIdentifier = new ShinsakaiKaisaiYoteiJohoIdentifier(開催番号);
            ShinsakaiKaisaiYoteiJoho shinsakaiKaisaiYoteiJoho = yoteiJohoModel.get(shinsakaiKaisaiYoteiJohoIdentifier);
            ShinsakaiWariateIinJohoIdentifier shinsakaiWariateIinJohoIdentifier
                    = new ShinsakaiWariateIinJohoIdentifier(開催番号, row.getShinsakjaiIinCode());
            ShinsakaiWariateIinJoho shinsakaiWariateIinJoho
                    = shinsakaiKaisaiYoteiJoho.getShinsakaiWariateIinJoho(shinsakaiWariateIinJohoIdentifier);
            ShinsakaiWariateIinJohoBuilder shinsakaiWariateIinJohoBuilder
                    = shinsakaiWariateIinJoho.createBuilderForEdit();
            shinsakaiWariateIinJohoBuilder.set介護認定審査会議長区分コード(new Code(row.getGichoKubun().getSelectedKey()));
            shinsakaiWariateIinJohoBuilder.set介護認定審査会開催年月日(div.getTxtKaisaiBi().getValue());
            shinsakaiWariateIinJohoBuilder.set委員出席(Boolean.valueOf(row.getShukketsuKubun().getSelectedKey().toString()));
            shinsakaiWariateIinJohoBuilder.set委員出席時間(row.getShussekiTime());
            shinsakaiWariateIinJohoBuilder.set委員早退有無(Boolean.valueOf(row.getSotaiUmu().getSelectedKey().toString()));
            shinsakaiWariateIinJohoBuilder.set委員退席時間(row.getTaisekiTime());
            shinsakaiWariateIinJohoBuilder.set委員遅刻有無(Boolean.valueOf(row.getChikokuUmu().getSelectedKey().toString()));
            shinsakaiWariateIinJoho.modifiedModel();
            shinsakaiWariateIinJoho = shinsakaiWariateIinJohoBuilder.build();
            ShinsakaiWariateIinJohoManager shinsakaiWariateIinJohoManager = ShinsakaiWariateIinJohoManager.createInstance();
            shinsakaiWariateIinJohoManager.save介護認定審査会割当委員情報(shinsakaiWariateIinJoho);
        }
    }

    private ShinsakaiKaisaiValidationHandler getValidationHandler(ShinsakaiKaisaiKekkaDiv div) {
        return new ShinsakaiKaisaiValidationHandler(div);
    }

    private RString timeToStr(RTime time) {
        if (time == null) {
            return RString.EMPTY;
        }
        int hour = time.getHour();
        int min = time.getMinute();
        return new RString(String.valueOf(hour)).padZeroToLeft(2).concat(new RString(String.valueOf(min)).padZeroToLeft(2));
    }
}
