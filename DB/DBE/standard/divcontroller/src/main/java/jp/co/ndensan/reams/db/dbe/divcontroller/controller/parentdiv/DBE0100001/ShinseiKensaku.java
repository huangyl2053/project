/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.divcontroller.controller.parentdiv.DBE0100001;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import jp.co.ndensan.reams.db.dbe.business.core.shinseikensaku.ShinseiKensakuBusiness;
import jp.co.ndensan.reams.db.dbe.business.core.shinseikensaku.ShinseiKensakuInfoBusiness;
import jp.co.ndensan.reams.db.dbe.business.report.yokaigoyoshienshinseiichiran.YokaigoYoshienShinseiIchiranItem;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE0100001.DBE0100001StateName;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE0100001.DBE0100001TransitionEventName;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE0100001.ShinseiKensakuDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE0100001.dgShinseiJoho_Row;
import jp.co.ndensan.reams.db.dbe.divcontroller.handler.parentdiv.DBE0100001.ShinseiKensakuHandler;
import jp.co.ndensan.reams.db.dbe.service.core.shinseikensaku.ShinseiKensakuFinder;
import jp.co.ndensan.reams.db.dbe.service.report.yokaigoyoshienshinseiichiran.YokaigoYoshienShinseiIchiranPrintService;
import jp.co.ndensan.reams.db.dbx.definition.core.util.Comparators;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.viewstate.ViewStateKeys;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.SourceDataCollection;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ResponseHolder;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;
import jp.co.ndensan.reams.uz.uza.util.db.SearchResult;
import jp.co.ndensan.reams.uz.uza.workflow.parameter.FlowParameterAccessor;
import jp.co.ndensan.reams.uz.uza.workflow.parameter.FlowParameters;
import jp.co.ndensan.reams.ur.urz.definition.message.UrInformationMessages;
import jp.co.ndensan.reams.db.dbx.definition.message.DbQuestionMessages;
import jp.co.ndensan.reams.db.dbz.business.core.ninteisaikinshorisha.NinteiSaikinShorisha;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;

/**
 * 要介護認定申請検索のクラスです。
 *
 * @reamsid_L DBE-1370-010 sunhaidi
 */
public class ShinseiKensaku {

    private static final RString MENUID_DBEMN21001 = new RString("DBEMN21001");
    private static final RString MENUID_DBEMN21003 = new RString("DBEMN21003");
    private static final RString MENUID_DBEMN24001 = new RString("DBEMN24001");
    private static final RString MENUID_DBEMN42002 = new RString("DBEMN42002");
    private static final RString MENUID_DBEMN41005 = new RString("DBEMN41005");
    private static final RString MENUID_DBEMN31001 = new RString("DBEMN31001");
    private static final RString MENUID_DBEMN31002 = new RString("DBEMN31002");
    private static final RString MENUID_DBEMN43001 = new RString("DBEMN43001");
    private static final RString MENUID_DBEMN72001 = new RString("DBEMN72001");
    private static final RString MENUID_DBEMN71003 = new RString("DBEMN71003");
    private static final RString WORKFLOW_KEY_KANRYO = new RString("Kanryo");

    /**
     * 画面初期化処理です。
     *
     * @param div ShinseiKensakuDiv
     * @return ResponseData<ShinseiKensakuDiv>
     */
    public ResponseData<ShinseiKensakuDiv> onLoad(ShinseiKensakuDiv div) {
        div.getCcdNinteishinseishaFinder().initialize();
        getHandler(div).load();
        ShoKisaiHokenshaNo 証記載保険者番号 = ViewStateHolder.get(ViewStateKeys.証記載保険者番号, ShoKisaiHokenshaNo.class);
        if (証記載保険者番号 != null && !証記載保険者番号.isEmpty()) {
            div.getCcdNinteishinseishaFinder().getNinteiShinseishaFinderDiv().getDdlHokenshaNumber().setSelectedShoKisaiHokenshaNoIfExist(証記載保険者番号);
        }
        return ResponseData.of(div).setState(findStateAt条件指定(div));
    }

    /**
     * onActive処理です。
     *
     * @param div ShinseiKensakuDiv
     * @return ResponseData<ShinseiKensakuDiv>
     */
    public ResponseData<ShinseiKensakuDiv> onActive(ShinseiKensakuDiv div) {
        Boolean is機能詳細画面から再検索 = ViewStateHolder.get(ViewStateKeys.機能詳細画面から再検索, Boolean.class);
        if (is機能詳細画面から再検索 != null && is機能詳細画面から再検索.equals(Boolean.TRUE)) {
            div.getCcdNinteishinseishaFinder().initialize();
        }
        ViewStateHolder.remove(ViewStateKeys.機能詳細画面から再検索);
        return ResponseData.of(div).respond();
    }

    private static DBE0100001StateName findStateAt条件指定(ShinseiKensakuDiv div) {
        RString menuID = ResponseHolder.getMenuID();
        if (MENUID_DBEMN21001.equals(menuID)) {
            return DBE0100001StateName.申請検索;
        } else if (MENUID_DBEMN21003.equals(menuID)) {
            return DBE0100001StateName.個人照会;
        } else if (MENUID_DBEMN24001.equals(menuID)
                || MENUID_DBEMN42002.equals(menuID)
                || MENUID_DBEMN41005.equals(menuID)) {
            return DBE0100001StateName.情報提供;
        } else if (MENUID_DBEMN71003.equals(menuID)) {
            return DBE0100001StateName.要介護認定進捗データ出力へ;
        }
        return DBE0100001StateName.条件指定;
    }

    /**
     * 検索条件クリア処理です。
     *
     * @param div ShinseiKensakuDiv
     * @return ResponseData<ShinseiKensakuDiv>
     */
    public ResponseData<ShinseiKensakuDiv> onClick_btnClear(ShinseiKensakuDiv div) {
        div.getCcdNinteishinseishaFinder().initialize();
        getHandler(div).load();
        return ResponseData.of(div).respond();
    }

    /**
     * 検索処理です。
     *
     * @param div ShinseiKensakuDiv
     * @return ResponseData<ShinseiKensakuDiv>
     */
    public ResponseData<ShinseiKensakuDiv> onClick_btnKensaku(ShinseiKensakuDiv div) {
        return new KensakuProcess(div).exec(
                div.getCcdNinteishinseishaFinder().getNinteiShinseishaFinderDiv()
                .getDdlHokenshaNumber().getSelectedItem().get証記載保険者番号(),
                div.getCcdNinteishinseishaFinder().getNinteiShinseishaFinderDiv()
                .getTxtHihokenshaNumber().getValue());
    }

    private static class KensakuProcess {

        protected final ShinseiKensakuDiv div;

        protected KensakuProcess(ShinseiKensakuDiv div) {
            this.div = div;
        }

        ResponseData<ShinseiKensakuDiv> exec(ShoKisaiHokenshaNo shoKisaiHokenshaNo, RString hihokenshaNo) {
            if (ResponseHolder.isReRequest()) {
                return ResponseData.of(div).respond();
            }
            /* 検索条件のバリデーション */
            ValidationMessageControlPairs pairs = div.getCcdNinteishinseishaFinder().validate();
            if (pairs.existsError()) {
                return ResponseData.of(div).addValidationMessages(pairs).respond();
            }
            /* 検索を実施 */
            SearchResult<ShinseiKensakuBusiness> searchResult = ShinseiKensakuFinder.createInstance()
                    .getShinseiKensakuForList(getHandler(div).createParameter(shoKisaiHokenshaNo, hihokenshaNo));
            /* 一覧出力用に検索結果を保存 */
            List<ShinseishoKanriNo> selected申請書管理番号 = extract申請書管理番号(searchResult);
            ViewStateHolder.put(ViewStateKeys.認定申請情報, new ShinseiKensakuInfoBusiness(selected申請書管理番号));
            /* 検索結果が存在しない場合 */
            if (searchResult.records().isEmpty()) {
                div.getDgShinseiJoho().setDataSource(Collections.<dgShinseiJoho_Row>emptyList());
                return ResponseData.of(div).addMessage(UrInformationMessages.該当データなし.getMessage()).respond();
            }
            /* 検索結果が存在する場合 */
            if (updateSaikinShorisha(searchResult)) {
                div.getCcdNinteishinseishaFinder().reloadSaikinShorisha();
            }
            getHandler(div).setShinseiJohoIchiran(searchResult);
            div.getCcdNinteishinseishaFinder().getNinteiShinseishaFinderDiv().setIsOpen(false);
            div.getBtnClear().setDisabled(true);
            div.getTxtMaxDisp().setDisabled(true);
            div.getBtnModoru().setDisabled(false);
            if (searchResult.records().size() == 1) {
                div.getBtnClear().setDisabled(false);
                div.getTxtMaxDisp().setDisabled(false);
                return forwardNextOrStay(div, Events.検索結果1件);
            }
            return ResponseData.of(div).setState(DBE0100001StateName.検索結果一覧);
        }

        private ShinseiKensakuHandler getHandler(ShinseiKensakuDiv div) {
            return new ShinseiKensakuHandler(div);
        }

        private List<ShinseishoKanriNo> extract申請書管理番号(SearchResult<ShinseiKensakuBusiness> searchResult) {
            List<ShinseishoKanriNo> selectedShinseishoKanriNo = new ArrayList<>();
            for (ShinseiKensakuBusiness rec : searchResult.records()) {
                selectedShinseishoKanriNo.add(rec.get申請書管理番号());
            }
            return selectedShinseishoKanriNo;
        }

        protected boolean updateSaikinShorisha(SearchResult<ShinseiKensakuBusiness> searchResult) {
            return false;
        }

    }

    /**
     * 最近処理者の「表示する」を押下した時の処理です。
     *
     * @param div ShinseiKensakuDiv
     * @return ResponseData<ShinseiKensakuDiv>
     */
    public ResponseData<ShinseiKensakuDiv> onSaikinshorishaClick(ShinseiKensakuDiv div) {
        ValidationMessageControlPairs pairs = div.getCcdNinteishinseishaFinder().getSaikinShorishaDiv().validate();
        if (pairs.existsError()) {
            return ResponseData.of(div).addValidationMessages(pairs).respond();
        }

        NinteiSaikinShorisha saikinShorisha = div.getCcdNinteishinseishaFinder().getSaikinShorishaDiv().getSelectedItem();
        return new SaikinShorishaKensakuProcess(div).exec(saikinShorisha.getShoKisaiHokenshaNo(), saikinShorisha.getHihokenshaNo());
    }

    private static class SaikinShorishaKensakuProcess extends KensakuProcess {

        protected SaikinShorishaKensakuProcess(ShinseiKensakuDiv div) {
            super(div);
        }

        @Override
        protected boolean updateSaikinShorisha(SearchResult<ShinseiKensakuBusiness> searchResult) {
            ShinseiKensakuBusiness skb = findLast(searchResult.records());
            if (skb == null) {
                return false;
            }
            div.getCcdNinteishinseishaFinder().updateSaikinShorisha(
                    new ShoKisaiHokenshaNo(skb.get証記載保険者番号()), skb.get被保険者番号(), skb.get被保険者氏名().value());
            return true;
        }

        private static ShinseiKensakuBusiness findLast(Collection<? extends ShinseiKensakuBusiness> searchResult) {
            List<ShinseiKensakuBusiness> list = new ArrayList<>(searchResult);
            if (list.isEmpty()) {
                return null;
            }
            Collections.sort(list, new Comparator<ShinseiKensakuBusiness>() {
                @Override
                public int compare(ShinseiKensakuBusiness o1, ShinseiKensakuBusiness o2) {
                    return Objects.compare(o1.get認定申請年月日(), o2.get認定申請年月日(), Comparators.reverseOrder());
                }
            });
            return list.get(0);
        }

    }

    private static enum Events {

        検索結果1件,
        対象選択;
    }

    private static ResponseData<ShinseiKensakuDiv> forwardNextOrStay(ShinseiKensakuDiv div, Events event) {
        RString menuID = ResponseHolder.getMenuID();
        dgShinseiJoho_Row row = (event == Events.検索結果1件) ? div.getDgShinseiJoho().getDataSource().get(0)
                : (event == Events.対象選択) ? div.getDgShinseiJoho().getClickedItem()
                        : null;
        if (row == null) {
            return ResponseData.of(div).respond();
        }

        RString 申請書管理番号 = row.getShinseishoKanriNo();
        int 認定調査履歴番号 = Integer.valueOf(row.getNinteichosaIraiRirekiNo().toString());
        RString 主治医意見書作成依頼履歴番号 = row.getIkenshoIraiRirekiNo();
        RString 被保険者番号 = row.getHihokenshaNo();
        RString 証記載保険者番号 = row.getShoKisaiHokenshaNo();
        LasdecCode 市町村コード = new LasdecCode(row.getShichosonCode());

        div.getCcdNinteishinseishaFinder().updateSaikinShorisha(new ShoKisaiHokenshaNo(証記載保険者番号), 被保険者番号, row.getShimei());
        div.getCcdNinteishinseishaFinder().reloadSaikinShorisha();

        if (MENUID_DBEMN21001.equals(menuID)) {
            ViewStateHolder.put(ViewStateKeys.申請書管理番号, 申請書管理番号);
            ViewStateHolder.put(ViewStateKeys.認定調査履歴番号, 認定調査履歴番号);
            ViewStateHolder.put(ViewStateKeys.主治医意見書作成依頼履歴番号, 主治医意見書作成依頼履歴番号);
            return ResponseData.of(div).forwardWithEventName(DBE0100001TransitionEventName.要介護認定個人状況照会へ).respond();
        }

        if (MENUID_DBEMN21003.equals(menuID)) {
            ViewStateHolder.put(ViewStateKeys.申請書管理番号, 申請書管理番号);
            ViewStateHolder.put(ViewStateKeys.認定調査履歴番号, 認定調査履歴番号);
            ViewStateHolder.put(ViewStateKeys.主治医意見書作成依頼履歴番号, 主治医意見書作成依頼履歴番号);
            return ResponseData.of(div).forwardWithEventName(DBE0100001TransitionEventName.要介護認定個人状況照会へ).respond();
        }

        if (MENUID_DBEMN24001.equals(menuID)) {
            ViewStateHolder.put(ViewStateKeys.証記載保険者番号, 証記載保険者番号);
            ViewStateHolder.put(ViewStateKeys.申請書管理番号, 申請書管理番号);
            ViewStateHolder.put(ViewStateKeys.被保険者番号, 被保険者番号);
            return ResponseData.of(div).forwardWithEventName(DBE0100001TransitionEventName.要介護認定情報提供へ).respond();
        }

        if (MENUID_DBEMN42002.equals(menuID)) {
            ViewStateHolder.put(ViewStateKeys.申請書管理番号, 申請書管理番号);
            ViewStateHolder.put(ViewStateKeys.主治医意見書作成依頼履歴番号, 主治医意見書作成依頼履歴番号);
            ViewStateHolder.put(ViewStateKeys.市町村コード, 市町村コード);
            return ResponseData.of(div).forwardWithEventName(DBE0100001TransitionEventName.主治医意見書登録へ).respond();
        }

        if (MENUID_DBEMN41005.equals(menuID)) {
            ViewStateHolder.put(jp.co.ndensan.reams.db.dbx.definition.core.viewstate.ViewStateKeys.申請書管理番号,
                    new ShinseishoKanriNo(申請書管理番号));
            ViewStateHolder.put(jp.co.ndensan.reams.db.dbx.definition.core.viewstate.ViewStateKeys.認定調査履歴番号,
                    認定調査履歴番号);
            ViewStateHolder.put(ViewStateKeys.被保険者番号, 被保険者番号);
            ViewStateHolder.put(ViewStateKeys.証記載保険者番号, 証記載保険者番号);
            return ResponseData.of(div).forwardWithEventName(DBE0100001TransitionEventName.認定調査結果登録1へ).respond();
        } else if (MENUID_DBEMN31001.equals(menuID)) {
            ViewStateHolder.put(ViewStateKeys.申請書管理番号, new ShinseishoKanriNo(申請書管理番号));
            return ResponseData.of(div).forwardWithEventName(DBE0100001TransitionEventName.審査依頼受付へ).respond();
        } else if (MENUID_DBEMN31002.equals(menuID)) {
            ViewStateHolder.put(ViewStateKeys.申請書管理番号, new ShinseishoKanriNo(申請書管理番号));
            return ResponseData.of(div).forwardWithEventName(DBE0100001TransitionEventName.審査依頼受付へ).respond();
        } else if (MENUID_DBEMN43001.equals(menuID)) {
            ViewStateHolder.put(ViewStateKeys.申請書管理番号, new ShinseishoKanriNo(申請書管理番号));
            ViewStateHolder.put(ViewStateKeys.市町村コード, 市町村コード);
            if (event == Events.検索結果1件) {
                ViewStateHolder.put(ViewStateKeys.モード, new RString("1件"));
            } else {
                ViewStateHolder.remove(ViewStateKeys.モード);
            }
            return ResponseData.of(div).forwardWithEventName(DBE0100001TransitionEventName.個人依頼内容更新へ).respond();
        } else if (MENUID_DBEMN72001.equals(menuID)) {
            ViewStateHolder.put(ViewStateKeys.申請書管理番号, 申請書管理番号);
            ViewStateHolder.put(ViewStateKeys.認定調査履歴番号, 認定調査履歴番号);
            return ResponseData.of(div).forwardWithEventName(DBE0100001TransitionEventName.要介護認定イメージ情報管理へ).respond();
        }
        if (MENUID_DBEMN71003.equals(menuID)) {
            ViewStateHolder.put(ViewStateKeys.被保険者番号, 被保険者番号);
            return ResponseData.of(div).forwardWithEventName(DBE0100001TransitionEventName.要介護認定進捗情報データ出力へ).respond();
        }
        return ResponseData.of(div).respond();
    }

    /**
     * 申請一覧の「選択」ボタン処理です。
     *
     * @param div ShinseiKensakuDiv
     * @return ResponseData<ShinseiKensakuDiv>
     */
    public ResponseData<ShinseiKensakuDiv> onSelect_dgShinseiJoho(ShinseiKensakuDiv div) {
        div.getBtnClear().setDisabled(false);
        div.getTxtMaxDisp().setDisabled(false);
        return forwardNextOrStay(div, Events.対象選択);
    }

    /**
     * 「検索条件に戻る」ボタン処理です。
     *
     * @param div ShinseiKensakuDiv
     * @return ResponseData<ShinseiKensakuDiv>
     */
    public ResponseData<ShinseiKensakuDiv> onClick_btnModoru(ShinseiKensakuDiv div) {
        div.getDgShinseiJoho().setDataSource(Collections.<dgShinseiJoho_Row>emptyList());
        div.getBtnClear().setDisabled(false);
        div.getTxtMaxDisp().setDisabled(false);
        return ResponseData.of(div).setState(findStateAt条件指定(div));
    }

    /**
     * 「戻る」ボタン処理です。「要介護認定進捗データ出力画面へ戻る」
     *
     * @param div ShinseiKensakuDiv
     * @return ResponseData<ShinseiKensakuDiv>
     */
    public ResponseData<ShinseiKensakuDiv> onClick_btnModoruShinchokuData(ShinseiKensakuDiv div) {
        return ResponseData.of(div).forwardWithEventName(DBE0100001TransitionEventName.要介護認定進捗情報データ出力へ).respond();
    }

    /**
     * 「選択した帳票を発行する」ボタンのclick後処理です。
     *
     * @param div ShinseiKensakuDiv
     * @return ResponseData<ShinseiKensakuDiv>
     */
    public ResponseData<ShinseiKensakuDiv> onClick_printAfter(ShinseiKensakuDiv div) {
        RString menuID = ResponseHolder.getMenuID();
        if (MENUID_DBEMN24001.equals(menuID)) {
            FlowParameters fp = FlowParameters.of(new RString("key"), WORKFLOW_KEY_KANRYO);
            FlowParameterAccessor.merge(fp);
            div.setWfParameter(WORKFLOW_KEY_KANRYO);
        }
        return ResponseData.of(div).setState(DBE0100001StateName.検索結果一覧);
    }

    /**
     * 「選択した帳票を発行する」ボタンのclick前処理です。
     *
     * @param div ShinseiKensakuDiv
     * @return ResponseData<ShinseiKensakuDiv>
     */
    public ResponseData<ShinseiKensakuDiv> onClick_btnChkPublish(ShinseiKensakuDiv div) {
        if (!ResponseHolder.isReRequest()) {
            return ResponseData.of(div).addMessage(DbQuestionMessages.処理実行の確認.getMessage()).respond();
        }
        return ResponseData.of(div).respond();
    }

    /**
     * 「選択した帳票を発行する」ボタンのclick処理です。
     *
     * @param div ShinseiKensakuDiv
     * @return ResponseData<SourceDataCollection>
     */
    public ResponseData<SourceDataCollection> onClick_btnitiranprint(ShinseiKensakuDiv div) {
        List<YokaigoYoshienShinseiIchiranItem> items = new ArrayList<>();
        ShinseiKensakuInfoBusiness infoBusiness = ViewStateHolder.get(ViewStateKeys.認定申請情報, ShinseiKensakuInfoBusiness.class);
        int renban = 1;
        //申請書管理番号からデータ取得しなおす
        SearchResult<ShinseiKensakuBusiness> searchResult
                = ShinseiKensakuFinder.createInstance().getShinseiKensaku(getHandler(div).createParameter(infoBusiness.getShinseiKensakuList()));
        for (ShinseiKensakuBusiness row : searchResult.records()) {
            YokaigoYoshienShinseiIchiranItem item = new YokaigoYoshienShinseiIchiranItem();
            item.setRenban(new RString(String.valueOf(renban++)));
            item.setShoKisaiHokenshaNo(row.get証記載保険者番号());
            item.setShichosonName(row.get市町村名称());
            if (row.get被保険者氏名() != null) {
                item.setHihokenshaName(row.get被保険者氏名().value());
            }
            item.setHihokenshaNo(row.get被保険者番号());
            item.setSeinengappiYMD(row.get生年月日());
            item.setSeibetsu(row.get性別());
            item.setKoroshoIfShikibetsuCode(row.get厚労省IF識別コード());
            item.setNijiHanteiYokaigoJotaiKubun(row.get前回二次判定要介護状態区分コード());
            if (row.get前回二次判定認定有効期間() != 0) {
                item.setNijiHanteiNinteiYukoKikan(new RString(row.get前回二次判定認定有効期間()));
            } else {
                item.setNijiHanteiNinteiYukoKikan(RString.EMPTY);
            }
            item.setNijiHanteiNinteiYukoKaishiYMD(row.get前回認定有効期間_開始_());
            item.setNijiHanteiNinteiYukoShuryoYMD(row.get前回認定有効期間_終了_());
            item.setNinteiShinseiYMD(row.get認定申請年月日());
            item.setNinteiShinseiShinseijiKubun(row.get認定申請区分_申請時_コード());
            item.setJigyoshaMeisho(row.get事業者名称());
            item.setChosainShimei(row.get調査員氏名());
            item.setIryoKikanMeisho(row.get医療機関名称());
            item.setShujiiName(row.get主治医氏名());
            item.setZenkaiKoroshoIfShikibetsuCode(row.get前回厚労省IF識別コード());
            items.add(item);
        }
        Collections.sort(items, new Comparator<YokaigoYoshienShinseiIchiranItem>() {
            @Override
            public int compare(YokaigoYoshienShinseiIchiranItem entity1, YokaigoYoshienShinseiIchiranItem entity2) {
                return entity1.getShoKisaiHokenshaNo().compareTo(entity2.getShoKisaiHokenshaNo());
            }
        });
        return ResponseData.of(new YokaigoYoshienShinseiIchiranPrintService().print(items)).respond();
    }

    private static ShinseiKensakuHandler getHandler(ShinseiKensakuDiv div) {
        return new ShinseiKensakuHandler(div);
    }
}
