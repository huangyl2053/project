/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.divcontroller.controller.parentdiv.DBE5100001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbe.definition.mybatisprm.kaigoninteishinsakai.KaigoNinteiShinsakaiParameter;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE5100001.DBE5100001StateName;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE5100001.DBE5100001TransitionEventName;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE5100001.KaigoNinteiShinsakaiDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.handler.parentdiv.DBE5100001.KaigoNinteiShinsakaiValidationHandler;
import jp.co.ndensan.reams.db.dbx.definition.core.viewstate.ViewStateKeys;
import jp.co.ndensan.reams.db.dbz.business.core.shinsakaikaisai.ShinsakaiKaisai;
import jp.co.ndensan.reams.db.dbz.definition.core.shinsakai.IsShiryoSakuseiZumi;
import jp.co.ndensan.reams.db.dbz.definition.core.shinsakai.ShinsakaiShinchokuJokyo;
import jp.co.ndensan.reams.db.dbz.definition.core.shinsakaikaisai.ShinsakaiKaisaiParameter;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.YokaigoNinteiShinsakaiIchiranList.YokaigoNinteiShinsakaiIchiranList.dgShinsakaiIchiran_Row;
import jp.co.ndensan.reams.db.dbz.service.core.shinsakaikaisai.ShinsakaiKaisaiFinder;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IParentResponse;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RTime;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ResponseHolder;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;
import jp.co.ndensan.reams.uz.uza.workflow.menu.Menus;

/**
 * 審査会一覧のコントローラです。
 *
 * @reamsid_L DBE-1350-010 zuotao
 */
public class KaigoNinteiShinsakai {

    private static final RString 遷移モード_審査会個人別状況照会 = new RString("hanteiKekka");
    private static final RString 遷移モード_介護認定審査会審査対象データ出力 = new RString("dataShutsuryoku");
    private static final RString 遷移モード_介護認定審査会対象者割付 = new RString("kaisaiYoteiToroku");
    private static final RString 遷移モード_介護認定審査会資料作成 = new RString("shinsakaiShiryoSakusei");
    private static final RString 遷移モード_介護認定審査会委員事前審査結果登録 = new RString("jizenKekkaToroku");
    private static final RString 遷移モード_介護認定審査会委員事前審査 = new RString("jizenKekkaToroku");
    private static final RString 遷移モード_審査会結果登録 = new RString("shinsaKekkaToroku");
    private static final RString 遷移モード_介護認定審査会審査結果データ取込み = new RString("dataShutsuryoku");
    private static final RString 遷移モード_介護認定審査会審査結果登録 = new RString("shinsaKekkaToroku");
    private static final RString 遷移モード_介護認定審査会委員割付 = new RString("shinsakaiShiryoSakusei");
    private static final RString メニューID_審査会個人別状況照会 = new RString("DBEMN21004");
    private static final RString メニューID_介護認定審査会審査対象データ出力 = new RString("DBEMN61004");
    private static final RString メニューID_介護認定審査会対象者割付 = new RString("DBEMN61005");
    private static final RString メニューID_介護認定審査会資料作成 = new RString("DBEMN61007");
    private static final RString メニューID_介護認定審査会委員事前審査 = new RString("DBEMN61008");
    private static final RString メニューID_介護認定審査会委員事前審査結果登録 = new RString("DBEMN61009");
    private static final RString メニューID_審査会開催結果登録 = new RString("DBEMN62001");
    private static final RString メニューID_審査会審査結果登録 = new RString("DBEMN62003");
    private static final RString メニューID_介護認定審査会審査結果データ取込み = new RString("DBEMN62002");
    private static final RString メニューID_介護認定審査会審査結果登録 = new RString("DBEMN62004");
    private static final RString メニューID_介護認定審査会委員割付 = new RString("DBEMN61010");
    private static final int 数字_0 = 0;
    private static final int LENGTH_4 = 4;

    /**
     * 審査会一覧初期化の設定します。
     *
     * @param div 審査会一覧Div
     * @return ResponseData<KaigoNinteiShinsakaiDiv>
     */
    public ResponseData<KaigoNinteiShinsakaiDiv> onLoad(KaigoNinteiShinsakaiDiv div) {

        RString menuID = ResponseHolder.getMenuID();
        div.getCcdShinsakaiItiran().initialize(getMode().get(menuID));
        IParentResponse<KaigoNinteiShinsakaiDiv> response = ResponseData.of(div);
        response.rootTitle(Menus.getMenuInfo(SubGyomuCode.DBE認定支援, ResponseHolder.getMenuID()).getMenuName());
        response.setState(getState().get(menuID));
        return response.respond();
    }

    /**
     * 審査会一覧を更新します。
     *
     * @param div 審査会一覧Div
     * @return ResponseData<KaigoNinteiShinsakaiDiv>
     */
    public ResponseData<KaigoNinteiShinsakaiDiv> onActive_KaigoNinteiShinsakai(KaigoNinteiShinsakaiDiv div) {
        RString menuID = ResponseHolder.getMenuID();
        if (!is審査会一覧更新(menuID)) {
            return onActive_return(div, menuID);
        }

        RString 開催番号;
        開催番号 = ViewStateHolder.get(ViewStateKeys.開催番号, RString.class);
        ShinsakaiKaisaiParameter parameter = ShinsakaiKaisaiParameter.create審査会検索Param(開催番号);
        ShinsakaiKaisai shinsakaiKaisai = ShinsakaiKaisaiFinder.createInstance().get審査会(parameter);
        if (shinsakaiKaisai == null) {
            return onActive_return(div, menuID);
        }

        List<dgShinsakaiIchiran_Row> selectedRow = new ArrayList<>();
        int seledted = 0;
        for (dgShinsakaiIchiran_Row row : div.getCcdShinsakaiItiran().getDgShinsakaiIchiran().getDataSource()) {
            if (開催番号.equals(row.getShinsakaiKaisaiNo())) {
                selectedRow.add(row);
                row.getKaisaiYoteiDate().setValue(shinsakaiKaisai.get介護認定審査会開催予定年月日());
                row.getYoteiKaishiTime().setValue(getRStringToRtime(shinsakaiKaisai.get介護認定審査会開始予定時刻()));
                row.getYoteiShuryoTime().setValue(getRStringToRtime(shinsakaiKaisai.get介護認定審査会終了予定時刻()));
                row.setShinsakaiMeisho(shinsakaiKaisai.get編集審査会名称());
                row.setGogitaiMeisho(shinsakaiKaisai.get合議体名称());
                row.setShurui(shinsakaiKaisai.get種類());
                row.setShinsakaiKaijo(shinsakaiKaisai.get介護認定審査会開催場所名称());
                row.getKaisaiDay().setValue(shinsakaiKaisai.get介護認定審査会開催年月日());
                row.getKaisaiTime().setValue(getRStringToRtime(shinsakaiKaisai.get介護認定審査会開始時刻()));
                row.getShuryoTime().setValue(getRStringToRtime(shinsakaiKaisai.get介護認定審査会終了時刻()));
                row.getYoteiTeiin().setValue(shinsakaiKaisai.get介護認定審査会予定定員());
                row.getWariateNinzu().setValue(shinsakaiKaisai.get介護認定審査会割当済み人数());
                row.getTaishoNinzu().setValue(shinsakaiKaisai.get介護認定審査会実施人数());
                row.setOnseiKiroku(shinsakaiKaisai.get音声記録());
                row.getDataShutsuryoku().setValue(shinsakaiKaisai.getモバイルデータ出力年月日());
                if (shinsakaiKaisai.is資料作成済フラグ()) {
                    row.setShiryoSakuseiKubun(IsShiryoSakuseiZumi.toValue(shinsakaiKaisai.is資料作成済フラグ()).get名称());
                } else {
                    row.setShiryoSakuseiKubun(RString.EMPTY);
                }
                if (!RString.isNullOrEmpty(shinsakaiKaisai.get介護認定審査会進捗状況())) {
                    row.setShinchokuJokyo(ShinsakaiShinchokuJokyo.toValue(shinsakaiKaisai.get介護認定審査会進捗状況()).get画面表示名称());
                } else {
                    row.setShinchokuJokyo(RString.EMPTY);
                }
                row.setDummyFlag(shinsakaiKaisai.isダミーフラグ());
                row.setGogitaiNo(shinsakaiKaisai.get合議体番号());
                row.setShinsakaiKaisaiNo(shinsakaiKaisai.get審査会開催番号());
                div.getCcdShinsakaiItiran().getDgShinsakaiIchiran().getDataSource().set(seledted, row);
                break;
            }
            seledted++;
        }
        div.getCcdShinsakaiItiran().getDgShinsakaiIchiran().setSelectedItems(selectedRow);
        return onActive_return(div, menuID);
    }

    private boolean is審査会一覧更新(RString menuID) {
        return メニューID_審査会開催結果登録.equals(menuID)
                || メニューID_審査会審査結果登録.equals(menuID)
                || メニューID_介護認定審査会対象者割付.equals(menuID)
                || メニューID_介護認定審査会委員割付.equals(menuID);
    }

    private RTime getRStringToRtime(RString time) {
        if (!RString.isNullOrEmpty(time)) {
            time = time.padZeroToLeft(LENGTH_4);
            return RTime.of(Integer.valueOf(time.substring(0, 2).toString()), Integer.valueOf(time.substring(2).toString()));
        }
        return RTime.of(0, 0, 0, 0);
    }

    private ResponseData<KaigoNinteiShinsakaiDiv> onActive_return(KaigoNinteiShinsakaiDiv div, RString menuID) {
        IParentResponse<KaigoNinteiShinsakaiDiv> response = ResponseData.of(div);
        response.rootTitle(Menus.getMenuInfo(SubGyomuCode.DBE認定支援, menuID).getMenuName());
        response.setState(getState().get(menuID));
        return response.respond();
    }

    /**
     * 個人別状況照会へ遷移を処理します。
     *
     * @param div 審査会一覧Div
     * @return ResponseData<KaigoNinteiShinsakaiDiv>
     */
    public ResponseData<KaigoNinteiShinsakaiDiv> onClick_btnkojin(KaigoNinteiShinsakaiDiv div) {
        ValidationMessageControlPairs validationMessages = check_審査会複数選択不可(div);
        if (validationMessages.iterator().hasNext()) {
            return ResponseData.of(div)
                    .rootTitle(Menus.getMenuInfo(SubGyomuCode.DBE認定支援, ResponseHolder.getMenuID()).getMenuName())
                    .addValidationMessages(validationMessages).respond();
        }
        ViewStateHolder.put(ViewStateKeys.開催番号, div.getCcdShinsakaiItiran().get開催番号List().get(数字_0));
        return ResponseData.of(div)
                .forwardWithEventName(DBE5100001TransitionEventName.個人別状況照会へ遷移する).respond();
    }

    /**
     * データ出力を実行します。
     *
     * @param div 審査会一覧Div
     * @return ResponseData<KaigoNinteiShinsakaiDiv>
     */
    public ResponseData<KaigoNinteiShinsakaiDiv> onClick_btndataoutput(KaigoNinteiShinsakaiDiv div) {
        ValidationMessageControlPairs validationMessages = check_審査会複数選択可(div);
        if (validationMessages.iterator().hasNext()) {
            return ResponseData.of(div)
                    .rootTitle(Menus.getMenuInfo(SubGyomuCode.DBE認定支援, ResponseHolder.getMenuID()).getMenuName())
                    .addValidationMessages(validationMessages).respond();
        }
        ViewStateHolder.put(ViewStateKeys.開催番号,
                new KaigoNinteiShinsakaiParameter(div.getCcdShinsakaiItiran().get開催番号List()));
        return ResponseData.of(div)
                .forwardWithEventName(DBE5100001TransitionEventName.データ出力を実行する).respond();
    }

    /**
     * 審査会対象者割付へ遷移を実行します。
     *
     * @param div 審査会一覧Div
     * @return ResponseData<KaigoNinteiShinsakaiDiv>
     */
    public ResponseData<KaigoNinteiShinsakaiDiv> onClick_btnwaritsuke(KaigoNinteiShinsakaiDiv div) {
        ValidationMessageControlPairs validationMessages = check_審査会複数選択不可(div);
        if (validationMessages.iterator().hasNext()) {
            return ResponseData.of(div)
                    .rootTitle(Menus.getMenuInfo(SubGyomuCode.DBE認定支援, ResponseHolder.getMenuID()).getMenuName())
                    .addValidationMessages(validationMessages).respond();
        }
        ViewStateHolder.put(ViewStateKeys.介護認定審査会番号, div.getCcdShinsakaiItiran().get開催番号List().get(数字_0));
        return ResponseData.of(div)
                .forwardWithEventName(DBE5100001TransitionEventName.審査会対象者割付へ遷移する).respond();
    }

    /**
     * 自動割付へ遷移を実行します。
     *
     * @param div 審査会一覧Div
     * @return ResponseData<KaigoNinteiShinsakaiDiv>
     */
    public ResponseData<KaigoNinteiShinsakaiDiv> onClick_btnAutoWaritsuke(KaigoNinteiShinsakaiDiv div) {
        ValidationMessageControlPairs validationMessages = check_審査会複数選択可(div);
        if (validationMessages.iterator().hasNext()) {
            return ResponseData.of(div)
                    .rootTitle(Menus.getMenuInfo(SubGyomuCode.DBE認定支援, ResponseHolder.getMenuID()).getMenuName())
                    .addValidationMessages(validationMessages).respond();
        }
        ViewStateHolder.put(ViewStateKeys.開催番号,
                new KaigoNinteiShinsakaiParameter(div.getCcdShinsakaiItiran().get開催番号List()));
        return ResponseData.of(div)
                .forwardWithEventName(DBE5100001TransitionEventName.自動割付を実行する).respond();
    }

    /**
     * 選択ボタンの処理を実行します。
     *
     * @param div 審査会一覧Div
     * @return ResponseData<KaigoNinteiShinsakaiDiv>
     */
    public ResponseData<KaigoNinteiShinsakaiDiv> onClick_btnSelectAlias(KaigoNinteiShinsakaiDiv div) {
        RString 合議体名称 = div.getCcdShinsakaiItiran().getDgShinsakaiIchiran().getActiveRow().getShinsakaiMeisho();
        RString 開催番号 = RString.EMPTY;
        if (!RString.isNullOrEmpty(合議体名称)) {
            開催番号 = 合議体名称.substring(1, 合議体名称.length() - LENGTH_4);
        }
        RString 開催年月日 = RString.EMPTY;
        if (!div.getCcdShinsakaiItiran().getDgShinsakaiIchiran().getActiveRow().getKaisaiYoteiDate().getValue().isEmpty()) {
            開催年月日 = new RString(div.getCcdShinsakaiItiran().getDgShinsakaiIchiran().getActiveRow().getKaisaiYoteiDate().getValue().toString());
        }
        ViewStateHolder.put(ViewStateKeys.開催番号, 開催番号);
        ViewStateHolder.put(ViewStateKeys.開催年月日, 開催年月日);
        div.getCcdShinsakaiItiran().setHdnSelectedGridLine(new RString(String.valueOf(div.getCcdShinsakaiItiran().getDgShinsakaiIchiran().getActiveRow().getId())));

        ValidationMessageControlPairs validationMessages = check_審査会選択(div);
        if (validationMessages.iterator().hasNext()) {
            return ResponseData.of(div)
                    .rootTitle(Menus.getMenuInfo(SubGyomuCode.DBE認定支援, ResponseHolder.getMenuID()).getMenuName())
                    .addValidationMessages(validationMessages).respond();
        }

        div.getCcdShinsakaiItiran().getSelectedGridLine();
        return ResponseData.of(div)
                .forwardWithEventName(DBE5100001TransitionEventName.審査会選択).respond();
    }

    /**
     * データ取込みを実行します。
     *
     * @param div 審査会一覧Div
     * @return ResponseData<KaigoNinteiShinsakaiDiv>
     */
    public ResponseData<KaigoNinteiShinsakaiDiv> onClick_btndatainput(KaigoNinteiShinsakaiDiv div) {

        ValidationMessageControlPairs validationMessages = check_審査会複数選択可(div);
        if (validationMessages.iterator().hasNext()) {
            return ResponseData.of(div)
                    .rootTitle(Menus.getMenuInfo(SubGyomuCode.DBE認定支援, ResponseHolder.getMenuID()).getMenuName())
                    .addValidationMessages(validationMessages).respond();
        }
        ViewStateHolder.put(ViewStateKeys.開催番号,
                new KaigoNinteiShinsakaiParameter(div.getCcdShinsakaiItiran().get開催番号List()));
        return ResponseData.of(div)
                .forwardWithEventName(DBE5100001TransitionEventName.データ取込みを実行する).respond();
    }

    private KaigoNinteiShinsakaiValidationHandler createValidationHandler(KaigoNinteiShinsakaiDiv div) {
        return new KaigoNinteiShinsakaiValidationHandler(div);
    }

    private ValidationMessageControlPairs check_審査会複数選択不可(KaigoNinteiShinsakaiDiv div) {
        ValidationMessageControlPairs validationMessages = new ValidationMessageControlPairs();
        validationMessages.add(check_審査会複数選択可(div));
        validationMessages.add(createValidationHandler(div).審査会複数選択不可チェック());
        return validationMessages;
    }

    private ValidationMessageControlPairs check_審査会複数選択可(KaigoNinteiShinsakaiDiv div) {
        ValidationMessageControlPairs validationMessages = new ValidationMessageControlPairs();
        validationMessages.add(createValidationHandler(div).審査会データ空チェック());
        validationMessages.add(createValidationHandler(div).審査会未選択チェック());
        return validationMessages;
    }

    private ValidationMessageControlPairs check_審査会選択(KaigoNinteiShinsakaiDiv div) {
        ValidationMessageControlPairs validationMessages = new ValidationMessageControlPairs();
        validationMessages.add(createValidationHandler(div).審査会データ空チェック());
        validationMessages.add(createValidationHandler(div).
                審査会未選択チェック_選択(ViewStateHolder.get(ViewStateKeys.開催番号, RString.class)));
        return validationMessages;
    }

    private Map<RString, RString> getMode() {
        Map<RString, RString> mode = new HashMap<>();
        mode.put(メニューID_審査会個人別状況照会, 遷移モード_審査会個人別状況照会);
        mode.put(メニューID_介護認定審査会審査対象データ出力, 遷移モード_介護認定審査会審査対象データ出力);
        mode.put(メニューID_介護認定審査会対象者割付, 遷移モード_介護認定審査会対象者割付);
        mode.put(メニューID_介護認定審査会資料作成, 遷移モード_介護認定審査会資料作成);
        mode.put(メニューID_介護認定審査会委員事前審査結果登録, 遷移モード_介護認定審査会委員事前審査結果登録);
        mode.put(メニューID_介護認定審査会委員事前審査, 遷移モード_介護認定審査会委員事前審査);
        mode.put(メニューID_審査会開催結果登録, 遷移モード_審査会結果登録);
        mode.put(メニューID_審査会審査結果登録, 遷移モード_介護認定審査会委員事前審査結果登録);
        mode.put(メニューID_介護認定審査会審査結果データ取込み, 遷移モード_介護認定審査会審査結果データ取込み);
        mode.put(メニューID_介護認定審査会審査結果登録, 遷移モード_介護認定審査会審査結果登録);
        mode.put(メニューID_介護認定審査会委員割付, 遷移モード_介護認定審査会委員割付);
        return mode;
    }

    private Map<RString, DBE5100001StateName> getState() {
        Map<RString, DBE5100001StateName> state = new HashMap<>();
        state.put(メニューID_審査会個人別状況照会, DBE5100001StateName.審査会個人別状況照会);
        state.put(メニューID_介護認定審査会審査対象データ出力, DBE5100001StateName.データ出力_モバイル);
        state.put(メニューID_介護認定審査会対象者割付, DBE5100001StateName.対象者割付);
        state.put(メニューID_介護認定審査会資料作成, DBE5100001StateName.審査会資料);
        state.put(メニューID_介護認定審査会委員事前審査結果登録, DBE5100001StateName.事前審査結果登録);
        state.put(メニューID_介護認定審査会委員事前審査, DBE5100001StateName.事前審査);
        state.put(メニューID_審査会開催結果登録, DBE5100001StateName.開催結果登録);
        state.put(メニューID_審査会審査結果登録, DBE5100001StateName.審査結果登録);
        state.put(メニューID_介護認定審査会審査結果データ取込み, DBE5100001StateName.データ取込み_モバイル);
        state.put(メニューID_介護認定審査会審査結果登録, DBE5100001StateName.結果登録_OCR);
        state.put(メニューID_介護認定審査会委員割付, DBE5100001StateName.審査会資料);
        return state;
    }
}
