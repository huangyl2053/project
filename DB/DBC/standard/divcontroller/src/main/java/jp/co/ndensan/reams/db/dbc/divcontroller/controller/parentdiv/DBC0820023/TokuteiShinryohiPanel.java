/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.controller.parentdiv.DBC0820023;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.basic.ShikibetsuNoKanri;
import jp.co.ndensan.reams.db.dbc.business.core.basic.ShokanTokuteiShinryoTokubetsuRyoyo;
import jp.co.ndensan.reams.db.dbc.business.core.basic.ShokanTokuteiShinryohi;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0820023.DBC0820023StateName;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0820023.DBC0820023TransitionEventName;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0820023.TokuteiShinryohiPanelDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0820023.ddgToteishinryoTokubetushinryo_Row;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0820023.dgdTokuteiShinryohi_Row;
import jp.co.ndensan.reams.db.dbc.divcontroller.handler.parentdiv.DBC0820023.TokuteiShinryohiPanelHandler;
import jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.shoukanharaihishinseikensaku.ShoukanharaihishinseikensakuParameter;
import jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.shoukanharaihishinseikensaku.ShoukanharaihishinseimeisaikensakuParameter;
import jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.shoukanharaihishinseikensaku.SikibetuNokennsakuki;
import jp.co.ndensan.reams.db.dbc.service.core.shokanbaraijyokyoshokai.ShokanbaraiJyokyoShokai;
import jp.co.ndensan.reams.db.dbc.service.core.syokanbaraihishikyushinseikette.SyokanbaraihiShikyuShinseiKetteManager;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.viewstate.ViewStateKeys;
import jp.co.ndensan.reams.db.dbz.definition.message.DbzInformationMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrInformationMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrQuestionMessages;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.ApplicationException;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.message.MessageDialogSelectedResult;
import jp.co.ndensan.reams.uz.uza.message.QuestionMessage;
import jp.co.ndensan.reams.uz.uza.ui.servlets.CommonButtonHolder;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ResponseHolder;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 * 償還払い費支給申請決定_サービス提供証明書(特定診療費）のクラスです。
 *
 * @reamsid_L DBC-1030-110 wangkanglei
 */
public class TokuteiShinryohiPanel {

    private static final RString 修正 = new RString("修正");
    private static final RString 削除 = new RString("削除");
    private static final RString 登録 = new RString("登録");
    private static final FlexibleYearMonth 平成１５年３月 = new FlexibleYearMonth("200303");
    private static final FlexibleYearMonth 平成１５年４月 = new FlexibleYearMonth("200304");
    private static final RString 申請を保存する = new RString("btnUpdate");
    private static final RString 申請を削除する = new RString("btnDelete");

    /**
     * 画面初期化のメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onLoad(TokuteiShinryohiPanelDiv div) {

        ShoukanharaihishinseimeisaikensakuParameter meisaiPar = ViewStateHolder.get(ViewStateKeys.明細検索キー,
                ShoukanharaihishinseimeisaikensakuParameter.class);
        HihokenshaNo 被保険者番号 = meisaiPar.get被保険者番号();
        FlexibleYearMonth サービス年月 = meisaiPar.getサービス年月();
        RString 整理番号 = meisaiPar.get整理番号();
        JigyoshaNo 事業者番号 = meisaiPar.get事業者番号();
        RString 様式番号 = meisaiPar.get様式番号();
        RString 明細番号 = meisaiPar.get明細番号();
        RDate 申請日 = meisaiPar.get申請日();
        ViewStateHolder.put(ViewStateKeys.サービス年月, サービス年月);
        ViewStateHolder.put(ViewStateKeys.様式番号, 様式番号);
        ViewStateHolder.put(ViewStateKeys.被保険者番号, 被保険者番号);
        ViewStateHolder.put(ViewStateKeys.整理番号, 整理番号);
        ViewStateHolder.put(ViewStateKeys.申請年月日, 申請日);

        ShoukanharaihishinseikensakuParameter 償還払費申請検索 = ViewStateHolder.get(ViewStateKeys.申請検索キー,
                ShoukanharaihishinseikensakuParameter.class);
        SikibetuNokennsakuki sikibetuKey = new SikibetuNokennsakuki(償還払費申請検索.getYoshikiNo(),
                償還払費申請検索.getServiceTeikyoYM());
        ViewStateHolder.put(ViewStateKeys.識別番号検索キー, sikibetuKey);

        ShikibetsuCode 識別コード = ViewStateHolder.get(ViewStateKeys.識別コード, ShikibetsuCode.class);
        getHandler(div).set申請共通エリア(サービス年月, 事業者番号, 申請日, 明細番号, 様式番号, 被保険者番号, 識別コード);

        if (サービス年月.isBeforeOrEquals(平成１５年３月)) {
            getHandler(div).setエリア制御(サービス年月);
            ArrayList<ShokanTokuteiShinryohi> shokanTokuteiShinryohiList = new ArrayList<>();
            if (明細番号 != null && !明細番号.isEmpty()) {
                shokanTokuteiShinryohiList = (ArrayList<ShokanTokuteiShinryohi>) ShokanbaraiJyokyoShokai.createInstance()
                        .getTokuteiShinryohiData(被保険者番号, サービス年月, 整理番号, 事業者番号, 様式番号, 明細番号, null);
            }
            getHandler(div).set特定診療費一覧グリッド(shokanTokuteiShinryohiList);
            ViewStateHolder.put(ViewStateKeys.償還払請求特定診療費データ, shokanTokuteiShinryohiList);
        }
        if (平成１５年４月.isBeforeOrEquals(サービス年月)) {
            getHandler(div).setエリア制御(サービス年月);
            ArrayList<ShokanTokuteiShinryoTokubetsuRyoyo> shokanTokuteiShinryoTokubetsuRyoyoList = new ArrayList<>();
            if (明細番号 != null && !明細番号.isEmpty()) {
                shokanTokuteiShinryoTokubetsuRyoyoList
                        = (ArrayList<ShokanTokuteiShinryoTokubetsuRyoyo>) ShokanbaraiJyokyoShokai.createInstance()
                        .getTokuteyiShinnryouhiTokubeturyoyohi(被保険者番号, サービス年月, 整理番号, 事業者番号,
                                様式番号, 明細番号, null);
            }
            getHandler(div).set特定診療費_特別診療費一覧グリッド(shokanTokuteiShinryoTokubetsuRyoyoList);
            ViewStateHolder.put(ViewStateKeys.特別療養費一覧, shokanTokuteiShinryoTokubetsuRyoyoList);
        }
        SikibetuNokennsakuki kennsakuki = ViewStateHolder.get(ViewStateKeys.識別番号検索キー, SikibetuNokennsakuki.class);
        ShikibetsuNoKanri shikibetsuNoKanri = SyokanbaraihiShikyuShinseiKetteManager.createInstance()
                .getShikibetsuNoKanri(kennsakuki.getServiceTeikyoYM(), kennsakuki.getSikibetuNo());
        if (shikibetsuNoKanri == null) {
            throw new ApplicationException(UrErrorMessages.データが存在しない.getMessage());
        }
        getHandler(div).getボタンを制御(shikibetsuNoKanri, meisaiPar);
        if (削除.equals(ViewStateHolder.get(ViewStateKeys.処理モード, RString.class))) {
            getHandler(div).set削除状態();
            return ResponseData.of(div).setState(DBC0820023StateName.削除モード);
        }
        return ResponseData.of(div).setState(DBC0820023StateName.新規修正モード);
    }

    /**
     * 追加ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnAdd(TokuteiShinryohiPanelDiv div) {
        FlexibleYearMonth サービス年月 = ViewStateHolder.get(ViewStateKeys.サービス年月, FlexibleYearMonth.class);
        if (サービス年月.isBeforeOrEquals(平成１５年３月)) {
            getHandler(div).set特定診療費登録(true);
            getHandler(div).readOnly特定診療費登録(false);
            getHandler(div).clear特定診療費登録();
        }
        if (平成１５年４月.isBeforeOrEquals(サービス年月)) {
            getHandler(div).set特定診療費(true);
            getHandler(div).readOnly特定診療費_特別診療費登録(false);
            getHandler(div).clear特定診療費_特別診療費登録();
        }
        ViewStateHolder.put(ViewStateKeys.状態, 登録);
        return createResponse(div);
    }

    /**
     * グリッド(平成１５年３月以前)エリアの修正ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_ddgModify(TokuteiShinryohiPanelDiv div) {
        getHandler(div).readOnly特定診療費登録(false);
        getHandler(div).clear特定診療費登録();
        getHandler(div).set特定診療費登録();
        ViewStateHolder.put(ViewStateKeys.状態, 修正);
        return createResponse(div);
    }

    /**
     * グリッド(平成１５年３月以前)エリアの削除ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_ddgDelete(TokuteiShinryohiPanelDiv div) {
        getHandler(div).readOnly特定診療費登録(true);
        getHandler(div).clear特定診療費登録();
        getHandler(div).set特定診療費登録();
        ViewStateHolder.put(ViewStateKeys.状態, 削除);
        return createResponse(div);
    }

    /**
     * グリッド(平成１５年４月以降)の修正ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_dgdModify(TokuteiShinryohiPanelDiv div) {
        getHandler(div).readOnly特定診療費_特別診療費登録(false);
        getHandler(div).clear特定診療費_特別診療費登録();
        getHandler(div).set特定診療費_特別診療費登録(
                ViewStateHolder.get(ViewStateKeys.サービス年月, FlexibleYearMonth.class),
                ViewStateHolder.get(ViewStateKeys.様式番号, RString.class));
        ViewStateHolder.put(ViewStateKeys.状態, 修正);
        return createResponse(div);
    }

    /**
     * グリッド(平成１５年４月以降)の削除ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_dgdDelete(TokuteiShinryohiPanelDiv div) {
        getHandler(div).readOnly特定診療費_特別診療費登録(true);
        getHandler(div).clear特定診療費_特別診療費登録();
        getHandler(div).set特定診療費_特別診療費登録(
                ViewStateHolder.get(ViewStateKeys.サービス年月, FlexibleYearMonth.class),
                ViewStateHolder.get(ViewStateKeys.様式番号, RString.class));
        ViewStateHolder.put(ViewStateKeys.状態, 削除);
        return createResponse(div);
    }

    /**
     * 特定診療費登録エリアの「計算する」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnKeisan(TokuteiShinryohiPanelDiv div) {
        getHandler(div).click計算結果();
        return createResponse(div);
    }

    /**
     * 特定診療費登録エリアの「クリアする」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnClear(TokuteiShinryohiPanelDiv div) {
        getHandler(div).clear特定診療費登録();
        return createResponse(div);
    }

    /**
     * 特定診療費登録エリアの「取消する」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnCancel(TokuteiShinryohiPanelDiv div) {
        getHandler(div).clear特定診療費登録();
        getHandler(div).set特定診療費登録(false);
        return createResponse(div);
    }

    /**
     * 特定診療費登録エリアの「確定する」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnConfirm(TokuteiShinryohiPanelDiv div) {
        ddgToteishinryoTokubetushinryo_Row ddgRow;
        RString 状態 = ViewStateHolder.get(ViewStateKeys.状態, RString.class);
        if (登録.equals(状態)) {
            ddgRow = new ddgToteishinryoTokubetushinryo_Row();
        } else {
            ddgRow = getHandler(div).getSelectedRow();
        }
        getHandler(div).modifyRow(ddgRow, 状態);
        return createResponse(div);
    }

    /**
     * 特定診療費・特別診療費登録エリアの「計算する」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnCal(TokuteiShinryohiPanelDiv div) {
        getHandler(div).click計算結果2();
        return createResponse(div);
    }

    /**
     * 特定診療費・特別診療費登録エリアの「クリアする」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnClear2(TokuteiShinryohiPanelDiv div) {
        getHandler(div).clear特定診療費_特別診療費登録();
        return createResponse(div);
    }

    /**
     * 特定診療費・特別診療費登録エリアの「取消する」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnCancel2(TokuteiShinryohiPanelDiv div) {
        getHandler(div).clear特定診療費_特別診療費登録();
        getHandler(div).set特定診療費(false);
        return createResponse(div);
    }

    /**
     * 特定診療費・特別診療費登録エリアの「確定する」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnConfirm2(TokuteiShinryohiPanelDiv div) {
        dgdTokuteiShinryohi_Row row;
        RString 状態 = ViewStateHolder.get(ViewStateKeys.状態, RString.class);
        if (登録.equals(状態)) {
            row = new dgdTokuteiShinryohi_Row();
        } else {
            row = getHandler(div).getSelectedRow2();
        }
        getHandler(div).modifyRow2(row, 状態);
        return createResponse(div);
    }

    /**
     * 共通エリア「取消する」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnFree(TokuteiShinryohiPanelDiv div) {
        if (削除.equals(ViewStateHolder.get(ViewStateKeys.処理モード, RString.class))) {
            return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.一覧に戻る).respond();
        }
        FlexibleYearMonth サービス年月 = ViewStateHolder.get(ViewStateKeys.サービス年月, FlexibleYearMonth.class);
        boolean flag = getHandler(div).get内容変更状態(サービス年月);
        if (flag) {
            return clear入力内容(div);
        } else {
            return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.一覧に戻る).respond();
        }
    }

    private ResponseData<TokuteiShinryohiPanelDiv> clear入力内容(TokuteiShinryohiPanelDiv div) {
        if (!ResponseHolder.isReRequest()) {
            QuestionMessage message = new QuestionMessage(UrQuestionMessages.入力内容の破棄.getMessage().getCode(),
                    UrQuestionMessages.入力内容の破棄.getMessage().evaluate());
            return ResponseData.of(div).addMessage(message).respond();
        }
        if (new RString(UrQuestionMessages.入力内容の破棄.getMessage().getCode())
                .equals(ResponseHolder.getMessageCode())
                && ResponseHolder.getButtonType() == MessageDialogSelectedResult.Yes) {
            return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.一覧に戻る).respond();
        } else {
            return ResponseData.of(div).respond();
        }
    }

    /**
     * 「申請を保存する」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnSave(TokuteiShinryohiPanelDiv div) {
        try {
            FlexibleYearMonth サービス年月 = ViewStateHolder.get(ViewStateKeys.サービス年月, FlexibleYearMonth.class);
            ShoukanharaihishinseimeisaikensakuParameter meisaiPar = ViewStateHolder.get(ViewStateKeys.明細検索キー,
                    ShoukanharaihishinseimeisaikensakuParameter.class);
            RString 処理モード = ViewStateHolder.get(ViewStateKeys.処理モード, RString.class);
            List<ShokanTokuteiShinryohi> shokanTokuteiShinryohiList = ViewStateHolder.get(
                    ViewStateKeys.償還払請求特定診療費データ, List.class);
            List<ShokanTokuteiShinryoTokubetsuRyoyo> shokanTokuteiShinryoTokubetsuRyoyoList = ViewStateHolder.get(
                    ViewStateKeys.特別療養費一覧, List.class);
            boolean flag = getHandler(div).get内容変更状態(サービス年月);
            if (flag) {
                return 保存処理(div, meisaiPar, 処理モード, shokanTokuteiShinryohiList,
                        shokanTokuteiShinryoTokubetsuRyoyoList);
            } else {
                return saveOut(div);
            }
        } catch (Exception e) {
            e.toString();
            throw new ApplicationException(UrErrorMessages.異常終了.getMessage());
        }
    }

    /**
     * 「申請を削除する」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnDelete(TokuteiShinryohiPanelDiv div) {
        try {
            ShoukanharaihishinseimeisaikensakuParameter meisaiPar = ViewStateHolder.get(ViewStateKeys.明細検索キー,
                    ShoukanharaihishinseimeisaikensakuParameter.class);
            RString 処理モード = ViewStateHolder.get(ViewStateKeys.処理モード, RString.class);
            if (!ResponseHolder.isReRequest()) {
                getHandler(div).保存処理(meisaiPar, 処理モード, null, null);
                return ResponseData.of(div).addMessage(UrInformationMessages.正常終了.getMessage()
                        .replace(削除.toString())).respond();
            }
            if (ResponseHolder.getButtonType() == MessageDialogSelectedResult.Yes) {
                CommonButtonHolder.setDisabledByCommonButtonFieldName(申請を削除する, true);
                return createResponse(div);
            }
            return ResponseData.of(div).respond();
        } catch (Exception e) {
            e.toString();
            throw new ApplicationException(UrErrorMessages.異常終了.getMessage());
        }
    }

    private ResponseData<TokuteiShinryohiPanelDiv> saveOut(TokuteiShinryohiPanelDiv div) {
        if (!ResponseHolder.isReRequest()) {
            return ResponseData.of(div).addMessage(DbzInformationMessages.内容変更なしで保存不可.getMessage()).respond();
        }
        if (ResponseHolder.getButtonType() == MessageDialogSelectedResult.Yes) {
            return createResponse(div);
        }
        return createResponse(div);
    }

    private ResponseData<TokuteiShinryohiPanelDiv> 保存処理(TokuteiShinryohiPanelDiv div,
            ShoukanharaihishinseimeisaikensakuParameter meisaiPar,
            RString 処理モード,
            List<ShokanTokuteiShinryohi> shokanTokuteiShinryohiList,
            List<ShokanTokuteiShinryoTokubetsuRyoyo> shokanTokuteiShinryoTokubetsuRyoyoList) {
        if (!ResponseHolder.isReRequest()) {
            RString 明細番号 = getHandler(div).保存処理(meisaiPar, 処理モード,
                    shokanTokuteiShinryohiList,
                    shokanTokuteiShinryoTokubetsuRyoyoList);
            getHandler(div).set明細番号(明細番号);
            return ResponseData.of(div).addMessage(UrInformationMessages.正常終了.getMessage()
                    .replace(登録.toString())).respond();
        }
        if (ResponseHolder.getButtonType() == MessageDialogSelectedResult.Yes) {
            CommonButtonHolder.setDisabledByCommonButtonFieldName(申請を保存する, true);
            return createResponse(div);
        }
        return createResponse(div);
    }

    private TokuteiShinryohiPanelHandler getHandler(TokuteiShinryohiPanelDiv div) {
        return new TokuteiShinryohiPanelHandler(div);
    }

    private ResponseData<TokuteiShinryohiPanelDiv> createResponse(TokuteiShinryohiPanelDiv div) {
        return ResponseData.of(div).respond();
    }

    /**
     * 「基本情報」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnKihoninfo(TokuteiShinryohiPanelDiv div) {
        setViewState(div);
        return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.基本情報).respond();
    }

    /**
     * 「給付費明細」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnKyufuMeisai(TokuteiShinryohiPanelDiv div) {
        setViewState(div);
        return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.給付費明細).respond();
    }

    /**
     * 「サービス計画費」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnServiceKeikakuhi(TokuteiShinryohiPanelDiv div) {
        setViewState(div);
        return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.サービス計画費).respond();
    }

    /**
     * 「特定入所者費用」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnTokuteinyushosha(TokuteiShinryohiPanelDiv div) {
        setViewState(div);
        return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.特定入所者費用).respond();
    }

    /**
     * 「合計情報」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnGokeiinfo(TokuteiShinryohiPanelDiv div) {
        setViewState(div);
        return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.合計情報).respond();
    }

    /**
     * 「給付費明細（住特）」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnKyufuhiMeisaiJutoku(TokuteiShinryohiPanelDiv div) {
        setViewState(div);
        return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.給付費明細_住特).respond();
    }

    /**
     * 「緊急時・所定疾患」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnKinkyujiShoteiShikan(TokuteiShinryohiPanelDiv div) {
        setViewState(div);
        return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.緊急時_所定疾患).respond();
    }

    /**
     * 「緊急時施設療養費」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnKinkyujiShisetsu(TokuteiShinryohiPanelDiv div) {
        setViewState(div);
        return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.緊急時施設療養費).respond();
    }

    /**
     * 「食事費用」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnShokujihiyo(TokuteiShinryohiPanelDiv div) {
        setViewState(div);
        return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.食事費用).respond();
    }

    /**
     * 「請求額集計」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnSeikyugaku(TokuteiShinryohiPanelDiv div) {
        setViewState(div);
        return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.請求額集計).respond();
    }

    /**
     * 「社福軽減額」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onClick_btnShafuku(TokuteiShinryohiPanelDiv div) {
        setViewState(div);
        return ResponseData.of(div).forwardWithEventName(DBC0820023TransitionEventName.社福軽減額).respond();
    }

    /**
     * 「識別コード入力補助ボタン」ボタンのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onBeforeOpenDialog_btnJigyosha(TokuteiShinryohiPanelDiv div) {
        getHandler(div).set識別コード(
                ViewStateHolder.get(ViewStateKeys.サービス年月, FlexibleYearMonth.class),
                ViewStateHolder.get(ViewStateKeys.様式番号, RString.class));
        return createResponse(div);
    }

    /**
     * onOkClose_btnJigyoshaのメソッドます。
     *
     * @param div TokuteiShinryohiPanelDiv
     * @return ResponseData
     */
    public ResponseData<TokuteiShinryohiPanelDiv> onOkClose_btnJigyosha(TokuteiShinryohiPanelDiv div) {
        getHandler(div).set識別名称(
                ViewStateHolder.get(ViewStateKeys.サービス年月, FlexibleYearMonth.class),
                ViewStateHolder.get(ViewStateKeys.様式番号, RString.class));
        return createResponse(div);
    }

    private void setViewState(TokuteiShinryohiPanelDiv div) {
        ShoukanharaihishinseikensakuParameter paramter = getHandler(div).putViewState(
                ViewStateHolder.get(ViewStateKeys.被保険者番号, HihokenshaNo.class),
                ViewStateHolder.get(ViewStateKeys.サービス年月, FlexibleYearMonth.class),
                ViewStateHolder.get(ViewStateKeys.整理番号, RString.class));
        ViewStateHolder.put(ViewStateKeys.申請検索キー, paramter);
    }
}