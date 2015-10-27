/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.controller.parentdiv;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0100000.KyotakuKeikakuTodokedeDetailDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0100000.KyotakuKeikakuTodokedeHenkoNaiyoDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0100000.KyotakuKeikakuTodokedeJigyoshaDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0100000.KyotakuKeikakuTodokedeMeisaiDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0100000.KyotakuKeikakuTodokedeRirekiListDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0100000.KyotakuKeikakuTodokedeshaDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0100000.dgKyotakuKeikakuTodokedeRirekiList_Row;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0100000.tplKyotakuKeikakuTodokedeDetailRirekiDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.shokaishujokyolist.dgShoKaishuJokyo_Row;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.shokaishukirokukanri.ShoKaishuKirokuKanriDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.ControlGenerator;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.YamlLoader;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.DataGrid;
import jp.co.ndensan.reams.uz.uza.ui.binding.RadioButton;
import jp.co.ndensan.reams.uz.uza.ui.binding.RowState;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxFlexibleDate;

/**
 * 居宅サービス計画作成依頼届出情報登録の居宅サービス計画作成依頼届出のコントロールです。
 *
 * @author N8187 久保田 英男
 */
//TODO n3317塚田　Yamlを使わないように変更
public class KyotakuKeikakuTodokedeDetail {

    /**
     * 画面ロード時の処理です。
     *
     * @param panel panel
     * @return ResponseData
     */
    public ResponseData onLoad(KyotakuKeikakuTodokedeDetailDiv panel) {
        setKihonData(panel);
        setRirekiList(panel);
        setMeisaiDefaultData(panel);
        setShoKaishuJokyoListData(panel);

        return ResponseData.of(panel).respond();
    }

    private enum 画面表示 {

        初期表示,
        新規届出,
        変更届出,
        届出内容修正
    }

    private enum 修正削除 {

        修正,
        削除
    }

    private void setKihonData(KyotakuKeikakuTodokedeDetailDiv panel) {
//        ShikibetsuCode 識別コード = new ShikibetsuCode(cg.getAsRString("識別コード"));
//        int rowId = 0;
//        KyotakuKeikakuTodokedeKihonDiv div = panel.getKyotakuKeikakuTodokedeKihon();
////        KaigoShikakuKぷびｃihon.setData(div.getKyotakuKeikakuTodokedeKihonAtena(), div.getKyotakuKeikakuTodokedeKaigoKihon(), 識別コード, rowId);
    }

    private void setRirekiList(KyotakuKeikakuTodokedeDetailDiv panel) {
//        Button btn = new Button();
//        for (int i = 3; i < 5; i++) {
//            ControlGenerator cg = new ControlGenerator(getYaml().get(i));
//            add履歴(panel, create履歴(
//                    btn,
//                    cg.getAsRString("計画適用期間開始日"),
//                    cg.getAsRString("計画適用期間終了日"),
//                    cg.getAsRString("届出日"),
//                    cg.getAsRString("届出区分"),
//                    cg.getAsRString("計画依頼事業者")));
//        }
    }

    /**
     * 履歴一覧の適用開始日を降順でソートするためのクラス。
     */
    private static class DateComparator implements Comparator<dgKyotakuKeikakuTodokedeRirekiList_Row> {

        @Override
        public int compare(dgKyotakuKeikakuTodokedeRirekiList_Row o1, dgKyotakuKeikakuTodokedeRirekiList_Row o2) {
            return new FlexibleDate(o2.getTxtKeikakuTekiyoKaishiYMD().replace(".", "")).
                    compareTo(new FlexibleDate(o1.getTxtKeikakuTekiyoKaishiYMD().replace(".", "")));
        }
    }

    private void add履歴(KyotakuKeikakuTodokedeDetailDiv panel, dgKyotakuKeikakuTodokedeRirekiList_Row addRow) {
        KyotakuKeikakuTodokedeRirekiListDiv rirekiList = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeRirekiList();
        List<dgKyotakuKeikakuTodokedeRirekiList_Row> dgList = rirekiList.getDgKyotakuKeikakuTodokedeRirekiList().getDataSource();
        dgList.add(addRow);
        Collections.sort(dgList, new DateComparator());
        rirekiList.getDgKyotakuKeikakuTodokedeRirekiList().setDataSource(dgList);
    }

    private void modify履歴(KyotakuKeikakuTodokedeDetailDiv panel, int index, 修正削除 kubun) {
        KyotakuKeikakuTodokedeRirekiListDiv rirekiList = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeRirekiList();
        List<dgKyotakuKeikakuTodokedeRirekiList_Row> dgList = rirekiList.getDgKyotakuKeikakuTodokedeRirekiList().getDataSource();
        dgKyotakuKeikakuTodokedeRirekiList_Row currentRow = dgList.get(index);
        KyotakuKeikakuTodokedeMeisaiDiv meisai = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeMeisai();
        dgKyotakuKeikakuTodokedeRirekiList_Row row;

        RString 計画適用期間開始日;
        RString 計画適用期間終了日;
        RString 届出日;
        try {
            計画適用期間開始日 = new FlexibleDate(meisai.getTxtTekiyoKikan().getFromValue().toDateString()).wareki().toDateString();
        } catch (Throwable e) {
            計画適用期間開始日 = RString.EMPTY;
        }
        try {
            計画適用期間終了日 = new FlexibleDate(meisai.getTxtTekiyoKikan().getToValue().toDateString()).wareki().toDateString();
        } catch (Throwable e) {
            計画適用期間終了日 = RString.EMPTY;
        }
        try {
            届出日 = new FlexibleDate(meisai.getTxtTodokedeYMD().getValue().toDateString()).wareki().toDateString();
        } catch (Throwable e) {
            届出日 = RString.EMPTY;
        }
        RString 計画依頼事業者 = meisai.getKyotakuKeikakuTodokedeJigyosha().getTxtJigyoshaCode().getValue().
                concat(":").concat(meisai.getKyotakuKeikakuTodokedeJigyosha().getTxtJigyoshaName().getValue());
        row = create履歴(
                currentRow.getBtnSelect(),
                計画適用期間開始日,
                計画適用期間終了日,
                届出日,
                currentRow.getTxtTodokedeKubun(),
                計画依頼事業者);
        if (kubun.equals(修正削除.修正)) {
            row.setRowState(RowState.Modified);
        } else {
            row.setRowState(RowState.Deleted);
        }

        dgList.remove(index);
        dgList.add(index, row);
        Collections.sort(dgList, new DateComparator());

        rirekiList.getDgKyotakuKeikakuTodokedeRirekiList().setDataSource(dgList);
    }

    private dgKyotakuKeikakuTodokedeRirekiList_Row create履歴(
            Button btn,
            RString txtKeikakuTekiyoKaishiYMD,
            RString txtKeikakuTekiyoShuryoYMD,
            RString txtTodokedeYMD,
            RString txtTodokedeKubun,
            RString txtKeikakuIraiJigyosha) {
        return new dgKyotakuKeikakuTodokedeRirekiList_Row(
                btn,
                txtKeikakuTekiyoKaishiYMD,
                txtKeikakuTekiyoShuryoYMD,
                txtTodokedeYMD,
                txtTodokedeKubun,
                txtKeikakuIraiJigyosha);
    }

    /**
     * 計画届出明細(初期表示)のデータ設定
     *
     * @param panel panel
     */
    private void setMeisaiDefaultData(KyotakuKeikakuTodokedeDetailDiv panel) {
        initMeisai(panel);
        setMeisaiData(panel, 画面表示.初期表示);
        showMeisai(panel, 画面表示.初期表示);
    }

    /**
     * 新規届出を追加するボタン押下時の処理
     *
     * @param panel panel
     * @return ResponseData
     */
    public ResponseData onClickTodokedeNew(KyotakuKeikakuTodokedeDetailDiv panel) {
        initMeisai(panel);
        setMeisaiData(panel, 画面表示.新規届出);
        showMeisai(panel, 画面表示.新規届出);

        return ResponseData.of(panel).respond();
    }

    /**
     * 変更届出を追加するボタン押下時の処理
     *
     * @param panel panel
     * @return ResponseData
     */
    public ResponseData onClickTodokedeModify(KyotakuKeikakuTodokedeDetailDiv panel) {
        initMeisai(panel);
        setMeisaiData(panel, 画面表示.変更届出);
        showMeisai(panel, 画面表示.変更届出);

        return ResponseData.of(panel).respond();
    }

    /**
     * 履歴一覧で選択ボタン押下時の処理
     *
     * @param panel panel
     * @return ResponseData
     */
    public ResponseData onClickTodokedeSelect(KyotakuKeikakuTodokedeDetailDiv panel) {
        int selectRowindex = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().getTplKyotakuKeikakuTodokedeDetailRireki().
                getKyotakuKeikakuTodokedeRirekiList().getDgKyotakuKeikakuTodokedeRirekiList().getClickedRowId();
        RString index = new RString(String.valueOf(selectRowindex));
        panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().getTplKyotakuKeikakuTodokedeDetailRireki().
                getKyotakuKeikakuTodokedeMeisai().getTxtRirekiListSelectIndex().setValue(index);
        setMeisaiData(panel, 画面表示.届出内容修正);
        showMeisai(panel, 画面表示.届出内容修正);
        tplKyotakuKeikakuTodokedeDetailRirekiDiv div = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
                getTplKyotakuKeikakuTodokedeDetailRireki();
        div.getKyotakuKeikakuTodokedeRirekiList().setIsOpen(false);
        div.getKyotakuKeikakuTodokedeMeisai().setIsOpen(true);

        return ResponseData.of(panel).respond();
    }

    /**
     * 届出明細を削除するボタン押下時の処理
     *
     * @param panel panel
     * @return ResponseData
     */
    public ResponseData onClickTodokedeDelete(KyotakuKeikakuTodokedeDetailDiv panel) {
        int index = Integer.valueOf(panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeMeisai().getTxtRirekiListSelectIndex().getValue().toString());
        modify履歴(panel, index, 修正削除.削除);
        initMeisai(panel);

        return ResponseData.of(panel).respond();
    }

    /**
     * 届出明細をクリアするボタン押下時の処理
     *
     * @param panel panel
     * @return ResponseData
     */
    public ResponseData onClickTodokedeClear(KyotakuKeikakuTodokedeDetailDiv panel) {
        initMeisai(panel);

        return ResponseData.of(panel).respond();
    }

    /**
     * 届出明細を確定するボタン押下時の処理
     *
     * @param panel panel
     * @return ResponseData
     */
    public ResponseData onClickTodokedeKakutei(KyotakuKeikakuTodokedeDetailDiv panel) {
//        Button btn = new Button();
//        KyotakuKeikakuTodokedeMeisaiDiv meisai = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
//                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeMeisai();
//        RString kubun = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
//                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeMeisai().getTxtTodokedeKubun().getValue();
//        ControlGenerator cg;
//        if (new RString("新規").equals(kubun)) {
//            cg = new ControlGenerator(getYaml().get(5));
//        } else {
//            cg = new ControlGenerator(getYaml().get(6));
//        }
//
//        RString 計画適用期間開始日;
//        RString 計画適用期間終了日;
//        RString 届出日;
//        try {
//            計画適用期間開始日 = new FlexibleDate(meisai.getTxtTekiyoKikan().getFromValue().toDateString()).wareki().toDateString();
//        } catch (Throwable e) {
//            計画適用期間開始日 = RString.EMPTY;
//        }
//        try {
//            計画適用期間終了日 = new FlexibleDate(meisai.getTxtTekiyoKikan().getToValue().toDateString()).wareki().toDateString();
//        } catch (Throwable e) {
//            計画適用期間終了日 = RString.EMPTY;
//        }
//        try {
//            届出日 = new FlexibleDate(meisai.getTxtTodokedeYMD().getValue().toDateString()).wareki().toDateString();
//        } catch (Throwable e) {
//            届出日 = RString.EMPTY;
//        }
//        RString 計画依頼事業者 = meisai.getKyotakuKeikakuTodokedeJigyosha().getTxtJigyoshaCode().getValue().
//                concat(":").concat(meisai.getKyotakuKeikakuTodokedeJigyosha().getTxtJigyoshaName().getValue());
//
//        dgKyotakuKeikakuTodokedeRirekiList_Row row = create履歴(
//                btn,
//                計画適用期間開始日,
//                計画適用期間終了日,
//                届出日,
//                kubun,
//                計画依頼事業者);
//        row.setRowState(RowState.Added);
//        add履歴(panel, row);
//
//        initMeisai(panel);
        return ResponseData.of(panel).respond();
    }

    /**
     * 届出明細を訂正するボタン押下時の処理
     *
     * @param panel panel
     * @return ResponseData
     */
    public ResponseData onClickTodokedeTeisei(KyotakuKeikakuTodokedeDetailDiv panel) {
        int index = Integer.valueOf(panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeMeisai().getTxtRirekiListSelectIndex().getValue().toString());
        modify履歴(panel, index, 修正削除.修正);
        initMeisai(panel);

        return ResponseData.of(panel).respond();
    }

    /**
     * 計画作成区分の選択を変更したときに委託先事業者の表示を切り替える。
     *
     * @param panel panel
     * @return ResponseData
     */
    public ResponseData onChangeRadKeikakuSakuseiKubun(KyotakuKeikakuTodokedeDetailDiv panel) {
        changeRadKeikakuSakuseiKubun(panel);

        return ResponseData.of(panel).respond();
    }

    /**
     * 事業者コードの入力補助ダイアログから事業者が選択された後の処理。
     *
     * @param panel panel
     * @return ResponseData
     */
    public ResponseData onOkCloseJigyoshaDialog(KyotakuKeikakuTodokedeDetailDiv panel) {
//        KyotakuKeikakuTodokedeJigyoshaDiv jigyosha = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
//                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeMeisai().getKyotakuKeikakuTodokedeJigyosha();
//        ControlGenerator cg = new ControlGenerator(getYaml().get(11));
//        jigyosha.getTxtServiceShurui1().setValue(cg.getAsRString("事業者サービス種類１"));
//        jigyosha.getTxtServiceShurui2().setValue(cg.getAsRString("事業者サービス種類２"));
//        jigyosha.getTxtKanrishaName().setValue(cg.getAsRString("事業者管理者名"));
//        jigyosha.getTxtJigyoshaTelNo().setValue(cg.getAsRString("事業者電話番号"));
//        jigyosha.getTxtJigyoshaYubinNo().setValue(cg.getAsYubinNo("事業者郵便番号"));
//        jigyosha.getTxtJigyoshaJusho().setValue(cg.getAsRString("事業者住所"));
        return ResponseData.of(panel).respond();
    }

    /**
     * 委託先事業者コードからフォーカスを外したときに名称等をセットする。
     *
     * @param panel panel
     * @return ResponseData
     */
    public ResponseData onBlurItakuJigyoshaCode(KyotakuKeikakuTodokedeDetailDiv panel) {
//        KyotakuKeikakuTodokedeJigyoshaDiv jigyosha = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
//                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeMeisai().getKyotakuKeikakuTodokedeJigyosha();
//        ControlGenerator cg = new ControlGenerator(getYaml().get(11));
//        jigyosha.getTxtItakuJigyoshaName().setValue(cg.getAsRString("委託先事業者名"));
        return ResponseData.of(panel).respond();
    }

    private void changeRadKeikakuSakuseiKubun(KyotakuKeikakuTodokedeDetailDiv panel) {
        KyotakuKeikakuTodokedeJigyoshaDiv jigyosha = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeMeisai().getKyotakuKeikakuTodokedeJigyosha();
        RadioButton rad = jigyosha.getRadKeikakuSakuseiKubun();
        if (rad.getSelectedItem().equals(new RString("key0"))) {
            jigyosha.getTxtItakuJigyoshaCode().setVisible(false);
            jigyosha.getTxtItakuJigyoshaCode().setDisplayNone(true);
            jigyosha.getBtnItakuJigyosha().setVisible(false);
            jigyosha.getBtnItakuJigyosha().setDisplayNone(true);
            jigyosha.getTxtItakuJigyoshaName().setVisible(false);
            jigyosha.getTxtItakuJigyoshaName().setDisplayNone(true);
        } else {
            jigyosha.getTxtItakuJigyoshaCode().setVisible(true);
            jigyosha.getTxtItakuJigyoshaCode().setDisplayNone(false);
            jigyosha.getBtnItakuJigyosha().setVisible(true);
            jigyosha.getBtnItakuJigyosha().setDisplayNone(false);
            jigyosha.getTxtItakuJigyoshaName().setVisible(true);
            jigyosha.getTxtItakuJigyoshaName().setDisplayNone(false);
        }
    }

    /**
     * ボタン表示の有効化処理
     *
     */
    private void btnVisible(Button btn) {
        btn.setVisible(true);
        btn.setDisplayNone(false);
    }

    /**
     * ボタン表示の無効化処理
     *
     */
    private void btnInvisible(Button btn) {
        btn.setVisible(false);
        btn.setDisplayNone(true);
    }

    /**
     * 計画届出明細の表示設定
     *
     * @param panel panel
     * @param pattern pattern
     */
    private void showMeisai(KyotakuKeikakuTodokedeDetailDiv panel, 画面表示 pattern) {

        KyotakuKeikakuTodokedeMeisaiDiv meisai = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeMeisai();
        DataGrid<dgKyotakuKeikakuTodokedeRirekiList_Row> rirekiList = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeRirekiList().getDgKyotakuKeikakuTodokedeRirekiList();
        dgKyotakuKeikakuTodokedeRirekiList_Row selectRow = rirekiList.getClickedItem();

        KyotakuKeikakuTodokedeHenkoNaiyoDiv henkoNaiyo = meisai.getKyotakuKeikakuTodokedeHenkoNaiyo();

        if (pattern.equals(画面表示.新規届出)) {
            btnVisible(meisai.getBtnTodokedeKakutei());
            btnVisible(meisai.getBtnTodokedeClear());
            btnInvisible(meisai.getBtnTodokedeDelete());
            btnInvisible(meisai.getBtnTodokedeTeisei());
            henkoNaiyo.setVisible(false);
            henkoNaiyo.setDisplayNone(true);
        } else if (pattern.equals(画面表示.変更届出)) {
            btnVisible(meisai.getBtnTodokedeKakutei());
            btnVisible(meisai.getBtnTodokedeClear());
            btnInvisible(meisai.getBtnTodokedeDelete());
            btnInvisible(meisai.getBtnTodokedeTeisei());
            henkoNaiyo.setVisible(true);
            henkoNaiyo.setDisplayNone(false);
        } else if (pattern.equals(画面表示.届出内容修正)) {
            btnInvisible(meisai.getBtnTodokedeKakutei());
            btnInvisible(meisai.getBtnTodokedeClear());
            btnVisible(meisai.getBtnTodokedeDelete());
            btnVisible(meisai.getBtnTodokedeTeisei());
            if (selectRow.getTxtTodokedeKubun().equals(new RString("新規"))) {
                henkoNaiyo.setVisible(false);
                henkoNaiyo.setDisplayNone(true);
            } else {
                henkoNaiyo.setVisible(true);
                henkoNaiyo.setDisplayNone(false);
            }
        }

        if (pattern.equals(画面表示.新規届出)
                || pattern.equals(画面表示.変更届出)
                || pattern.equals(画面表示.届出内容修正)) {

            changeRadKeikakuSakuseiKubun(panel);

        }
    }

    /**
     * 計画届出明細のデータ設定
     *
     * @param panel panel
     * @param pattern pattern
     */
    private void setMeisaiData(KyotakuKeikakuTodokedeDetailDiv panel, 画面表示 pattern) {

//        KyotakuKeikakuTodokedeMeisaiDiv meisai = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
//                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeMeisai();
//        DataGrid<dgKyotakuKeikakuTodokedeRirekiList_Row> rirekiList = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
//                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeRirekiList().getDgKyotakuKeikakuTodokedeRirekiList();
//        dgKyotakuKeikakuTodokedeRirekiList_Row selectRow = rirekiList.getClickedItem();
//
//        KyotakuKeikakuTodokedeshaDiv todokedesha = meisai.getKyotakuKeikakuTodokedesha();
//        KyotakuKeikakuTodokedeJigyoshaDiv jigyosha = meisai.getKyotakuKeikakuTodokedeJigyosha();
//        KyotakuKeikakuTodokedeHenkoNaiyoDiv henkoNaiyo = meisai.getKyotakuKeikakuTodokedeHenkoNaiyo();
//
//        ControlGenerator cg = new ControlGenerator(getYaml().get(7));
//        if (pattern.equals(画面表示.初期表示)) {
//            meisai.getTxtTodokedeKubun().clearValue();
//        } else if (pattern.equals(画面表示.新規届出)) {
//            cg = new ControlGenerator(getYaml().get(8));
//            meisai.getTxtTodokedeKubun().setValue(cg.getAsRString("届出区分"));
//        } else if (pattern.equals(画面表示.変更届出)) {
//            cg = new ControlGenerator(getYaml().get(9));
//            meisai.getTxtTodokedeKubun().setValue(cg.getAsRString("届出区分"));
//        } else if (pattern.equals(画面表示.届出内容修正)) {
//            cg = new ControlGenerator(getYaml().get(10));
//            meisai.getTxtTodokedeKubun().setValue(selectRow.getTxtTodokedeKubun());
//        }
//
//        if (pattern.equals(画面表示.新規届出)
//                || pattern.equals(画面表示.変更届出)
//                || pattern.equals(画面表示.届出内容修正)) {
//
//            if (pattern.equals(画面表示.届出内容修正)) {
//                try {
//                    meisai.getTxtTodokedeYMD().setValue(new RDate(selectRow.getTxtTodokedeYMD().toString()));
//                } catch (Throwable e) {
//                    meisai.getTxtTodokedeYMD().clearValue();
//                }
//                try {
//                    meisai.getTxtTekiyoKikan().setFromValue(new RDate(selectRow.getTxtKeikakuTekiyoKaishiYMD().toString()));
//                } catch (Throwable e) {
//                    meisai.getTxtTekiyoKikan().clearFromValue();
//                }
//                try {
//                    meisai.getTxtTekiyoKikan().setToValue(new RDate(selectRow.getTxtKeikakuTekiyoShuryoYMD().toString()));
//                } catch (Throwable e) {
//                    meisai.getTxtTekiyoKikan().clearToValue();
//                }
//            } else {
//                meisai.getTxtTodokedeYMD().setValue(cg.getAsRDate("届出日"));
//                meisai.getTxtTekiyoKikan().setFromValue(cg.getAsRDate("適用期間開始日"));
//            }
//
//            todokedesha.getTxtTodokedeshaName().setValue(cg.getAsRString("届出者氏名"));
//            todokedesha.getTxtTodokedeshaKana().setValue(cg.getAsRString("届出者カナ"));
//            todokedesha.getTxtTodokedeshaTelNo().setValue(cg.getAsRString("届出者電話番号"));
//            todokedesha.getTxtTodokedeshaYubinNo().setValue(cg.getAsYubinNo("届出者郵便番号"));
//            todokedesha.getTxtTodokedeshaJusho().setValue(cg.getAsRString("届出者住所"));
//
//            jigyosha.getRadKeikakuSakuseiKubun().setSelectedItem(cg.getAsRString("事業者作成区分"));
//            if (pattern.equals(画面表示.届出内容修正)) {
//                RString 事業者コード = selectRow.getTxtKeikakuIraiJigyosha().substring(0, 10);
//                RString 事業者名 = selectRow.getTxtKeikakuIraiJigyosha().substring(11);
//                jigyosha.getTxtJigyoshaCode().setValue(事業者コード);
//                jigyosha.getTxtJigyoshaName().setValue(事業者名);
//            } else {
//                jigyosha.getTxtJigyoshaCode().setValue(cg.getAsRString("事業者コード"));
//                jigyosha.getTxtJigyoshaName().setValue(cg.getAsRString("事業者名"));
//            }
//            jigyosha.getTxtServiceShurui1().setValue(cg.getAsRString("事業者サービス種類１"));
//            jigyosha.getTxtServiceShurui2().setValue(cg.getAsRString("事業者サービス種類２"));
//            jigyosha.getTxtKanrishaName().setValue(cg.getAsRString("事業者管理者名"));
//            jigyosha.getTxtJigyoshaTelNo().setValue(cg.getAsRString("事業者電話番号"));
//            jigyosha.getTxtJigyoshaYubinNo().setValue(cg.getAsYubinNo("事業者郵便番号"));
//            jigyosha.getTxtJigyoshaJusho().setValue(cg.getAsRString("事業者住所"));
//            jigyosha.getTxtItakuJigyoshaCode().setValue(cg.getAsRString("委託先事業者コード"));
//            jigyosha.getTxtItakuJigyoshaName().setValue(cg.getAsRString("委託先事業者名"));
//
//            if (pattern.equals(画面表示.変更届出)
//                    || (pattern.equals(画面表示.届出内容修正) && !selectRow.getTxtTodokedeKubun().equals(new RString("新規")))) {
//                henkoNaiyo.getTxtHenkoYMD().setValue(cg.getAsRDate("変更日"));
//                henkoNaiyo.getTxtHenkoJiyu().setValue(cg.getAsRString("変更事由"));
//            }
//        }
    }

    /**
     * 計画届出明細の内容を初期化する(ただし届出区分については初期化しない)。
     *
     * @param panel panel
     */
    private void initMeisai(KyotakuKeikakuTodokedeDetailDiv panel) {
        KyotakuKeikakuTodokedeMeisaiDiv meisai = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
                getTplKyotakuKeikakuTodokedeDetailRireki().getKyotakuKeikakuTodokedeMeisai();

        KyotakuKeikakuTodokedeshaDiv todokedesha = meisai.getKyotakuKeikakuTodokedesha();
        KyotakuKeikakuTodokedeJigyoshaDiv jigyosha = meisai.getKyotakuKeikakuTodokedeJigyosha();
        KyotakuKeikakuTodokedeHenkoNaiyoDiv henkoNaiyo = meisai.getKyotakuKeikakuTodokedeHenkoNaiyo();

        meisai.getTxtTodokedeYMD().clearValue();
        meisai.getTxtTekiyoKikan().clearFromValue();
        meisai.getTxtTekiyoKikan().clearToValue();

        todokedesha.getTxtTodokedeshaName().clearValue();
        todokedesha.getTxtTodokedeshaKana().clearValue();
        todokedesha.getTxtTodokedeshaTelNo().clearValue();
        todokedesha.getTxtTodokedeshaYubinNo().clearValue();
        todokedesha.getTxtTodokedeshaJusho().clearValue();

        jigyosha.getTxtJigyoshaCode().clearValue();
        jigyosha.getTxtJigyoshaName().clearValue();
        jigyosha.getRadKeikakuSakuseiKubun().setSelectedItem(new RString(""));
        jigyosha.getTxtServiceShurui1().clearValue();
        jigyosha.getTxtServiceShurui2().clearValue();
        jigyosha.getTxtJigyoshaYubinNo().clearValue();
        jigyosha.getTxtJigyoshaJusho().clearValue();
        jigyosha.getTxtKanrishaName().clearValue();
        jigyosha.getTxtJigyoshaTelNo().clearValue();
        jigyosha.getTxtItakuJigyoshaCode().clearValue();
        jigyosha.getTxtItakuJigyoshaName().clearValue();

        henkoNaiyo.getTxtHenkoYMD().clearValue();
        henkoNaiyo.getTxtHenkoJiyu().clearValue();
    }

    /**
     * 証類交付情報をセットする。
     *
     * @param panel panel
     */
    private void setShoKaishuJokyoListData(KyotakuKeikakuTodokedeDetailDiv panel) {
        ShoKaishuKirokuKanriDiv kanri = panel.getTabKyotakuServiceKeikakuSakuseiIraiTodokede().
                getTplKyotakuKeikakuTodokedeDetailShorui().getKyotakuKeikakuTodokedeShoruiJyokyo();
        List<HashMap> yamlData = YamlLoader.DBC.loadAsList(new RString("dbc0100000/KyotakuKeikakuTodokedeShoKofuKaishu.yml"));
        List<dgShoKaishuJokyo_Row> dgRow = kanri.getCcdShoKaishuJokyoList().getDgShoKaishuJokyo().getDataSource();
        dgRow.clear();
        for (int i = 0; i < 2; i++) {
            ControlGenerator cg = new ControlGenerator(yamlData.get(i));
            dgShoKaishuJokyo_Row row = new dgShoKaishuJokyo_Row(RString.EMPTY, RString.EMPTY, new TextBoxFlexibleDate(),
                    RString.EMPTY, RString.EMPTY, RString.EMPTY, new TextBoxFlexibleDate(), RString.EMPTY, RString.EMPTY,
                    RString.EMPTY, new TextBoxFlexibleDate());

            row.setKofushoShurui(cg.getAsRString("証交付種類"));
            row.getKofuDate().setValue(cg.getAsFlexibleDate("交付日"));
            row.setKofuJiyu(cg.getAsRString("交付事由"));
            row.setKofuJiyuKey(cg.getAsRString("交付事由Key"));
            row.getKaishuDate().setValue(cg.getAsFlexibleDate("回収日"));
            row.setKaishuJiyu(cg.getAsRString("回収事由"));
            row.setKaishuJiyuKey(cg.getAsRString("回収事由Key"));
            row.getYukoKigen().setValue(cg.getAsFlexibleDate("有効期限"));
            dgRow.add(row);
        }
    }
}