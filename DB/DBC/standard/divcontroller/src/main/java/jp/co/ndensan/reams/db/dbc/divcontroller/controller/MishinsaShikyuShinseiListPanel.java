/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.JutakuKaishuShinseiResetInfoDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.MishinsaShikyuShinseiListPanelDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.dgMishinsaShikyuShinsei_Row;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.YamlLoader;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.message.ErrorMessage;
import jp.co.ndensan.reams.uz.uza.message.WarningMessage;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.CheckBoxList;
import jp.co.ndensan.reams.uz.uza.ui.binding.DataGrid;
import jp.co.ndensan.reams.uz.uza.ui.binding.KeyValueDataSource;
import jp.co.ndensan.reams.uz.uza.ui.binding.RowState;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxCode;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxDate;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxNum;
import jp.co.ndensan.reams.uz.uza.ui.servlets.DivcontrollerMethod;
import jp.co.ndensan.reams.uz.uza.ui.servlets.SingleButtonType;

/**
 * 住宅改修費支給申請審査 未審査支給申請検索条件(未審査分を検索するボタン押下後、未審査支給申請一覧の内容が表示する）
 *
 * @author n8223
 */
public class MishinsaShikyuShinseiListPanel {

    /**
     * 住宅改修費支給申請審査 未審査支給申請一覧の内容をセットします。
     *
     * @param panel JutakuKaishuShinseiListDiv
     * @param panel1
     * @return PanelDivのResponseData
     */
    public ResponseData<MishinsaShikyuShinseiListPanelDiv> onLoad(MishinsaShikyuShinseiListPanelDiv panel, JutakuKaishuShinseiResetInfoDiv panel1) {
        ResponseData<MishinsaShikyuShinseiListPanelDiv> response = new ResponseData<>();

        //TO DO
        String ymlDataName = "MishinsaShikyuShinseSearchCondition.yml";
        List<HashMap> ymlData = ymlData(ymlDataName);

        String shinsaDate = ymlData.get(1).get("shinsaDate").toString();
        panel.getTxtShinsaDate().setValue(new RDate(shinsaDate));

        //TO DO
        List<KeyValueDataSource> dataSource = new ArrayList<>();
        dataSource.add(new KeyValueDataSource(new RString("tenkyo"), new RString("転居リセットの判定を行う")));
        dataSource.add(new KeyValueDataSource(new RString("threeStep"), new RString("３段階リセットの判定を行う")));
        panel.getSystemCheck().getChkResetCheck().setSelectedItems(dataSource);

        response.data = panel;
        return response;

    }

    /**
     * 住宅改修費支給申請審査 未審査支給申請一覧の内容をセットします。
     *
     * @param panel JutakuKaishuShinseiListDiv
     * @param panel1
     * @return PanelDivのResponseData
     */
    public ResponseData<MishinsaShikyuShinseiListPanelDiv> onClick_btnSearchMishinsa(MishinsaShikyuShinseiListPanelDiv panel, JutakuKaishuShinseiResetInfoDiv panel1) {
        ResponseData<MishinsaShikyuShinseiListPanelDiv> response = new ResponseData<>();

        //TO DO
        setMishinsaShikyuShinseiList(panel);

        response.data = panel;
        return response;

    }

    /*
     * 住宅改修費支給申請審査 未審査支給申請一覧のデータを設定する。
     */
    private void setMishinsaShikyuShinseiList(MishinsaShikyuShinseiListPanelDiv panel) {

        //TO DO
        String ymlDataName = "MishinsaShikyuShinseiList.yml";

        List<dgMishinsaShikyuShinsei_Row> arraydata = createRowMishinsaShikyuShinseiTestData(ymlDataName);
        DataGrid<dgMishinsaShikyuShinsei_Row> grid = panel.getDgMishinsaShikyuShinsei();

        grid.setDataSource(arraydata);

    }

    /*
     * 住宅改修費支給申請審査 (YMLDATA)未審査支給申請一覧のデータを設定する。
     */
    private List<dgMishinsaShikyuShinsei_Row> createRowMishinsaShikyuShinseiTestData(String ymlDataName) {

        List<dgMishinsaShikyuShinsei_Row> arrayData = new ArrayList<>();

        List<HashMap> ymlData = ymlData(ymlDataName);

        //TO DO データを増える場合。
        for (int i = 0; i < ymlData.size(); i++) {
            HashMap hashMap = ymlData.get(i);
            hashMap(hashMap, arrayData);
        }

        return arrayData;

    }

    /*
     * 共通内容を設定する
     */
    private void hashMap(HashMap hashMap, List<dgMishinsaShikyuShinsei_Row> arrayData) {

        //TO DO DataGrid
        String shikyuShinseiDate = hashMap.get("shikyuShinseiDate").toString();
        String teikyoYM = hashMap.get("teikyoYM").toString();
        String hihoNo = hashMap.get("hihoNo").toString();
        String hihokenshaName = hashMap.get("hihokenshaName").toString();
        String hokenKyufuAmount = hashMap.get("hokenKyufuAmount").toString();
        String riyoshaFutanAmount = hashMap.get("riyoshaFutanAmount").toString();
        String hiyoTotalAmount = hashMap.get("hiyoTotalAmount").toString();
        String tenkyoReset = hashMap.get("tenkyoReset").toString();
        String DankaiReset3 = hashMap.get("DankaiReset3").toString();
        String seiriNo = hashMap.get("seiriNo").toString();

        dgMishinsaShikyuShinsei_Row item;

        item = createRowishinsaShikyuShinseiListData(
                shikyuShinseiDate,
                teikyoYM,
                hihoNo,
                hihokenshaName,
                hokenKyufuAmount,
                riyoshaFutanAmount,
                hiyoTotalAmount,
                tenkyoReset,
                DankaiReset3,
                // shinsaResult,
                seiriNo
        );
        arrayData.add(item);
    }

    /*
     *引数を元にデータグリッド内に挿入する個人データを作成します。
     */
    private dgMishinsaShikyuShinsei_Row createRowishinsaShikyuShinseiListData(
            String 支給申請日,
            String 提供年月,
            String 被保番号,
            String 氏名,
            String 保険給付額,
            String 利用者負担額,
            String 費用額合計,
            String 転居,
            String 段階3,
            String 整理番号) {

        dgMishinsaShikyuShinsei_Row rowMishinsaShikyuShinseiListData;
        rowMishinsaShikyuShinseiListData = new dgMishinsaShikyuShinsei_Row(
                new TextBoxDate(),
                new TextBoxDate(),
                RString.EMPTY,
                RString.EMPTY,
                new TextBoxNum(),
                new TextBoxNum(),
                new TextBoxNum(), false, false,
                RString.EMPTY,
                new TextBoxCode()
        );

        rowMishinsaShikyuShinseiListData.getTxtShikyuShinseiDate().setValue(new RDate(支給申請日));
        rowMishinsaShikyuShinseiListData.getTxtTeikyoYM().setValue(new RDate(提供年月));
        rowMishinsaShikyuShinseiListData.setTxtHihoNo(new RString(被保番号));
        rowMishinsaShikyuShinseiListData.setTxtHihokenshaName(new RString(氏名));
        rowMishinsaShikyuShinseiListData.getTxtHokenKyufuAmount().setValue(new Decimal(保険給付額));
        rowMishinsaShikyuShinseiListData.getTxtRiyoshaFutanAmount().setValue(new Decimal(利用者負担額));
        rowMishinsaShikyuShinseiListData.getTxtHiyoTotalAmount().setValue(new Decimal(費用額合計));
        rowMishinsaShikyuShinseiListData.setTxtTenkyoReset(Boolean.valueOf(転居));
        rowMishinsaShikyuShinseiListData.setTxt3DankaiReset(Boolean.valueOf(段階3));
        rowMishinsaShikyuShinseiListData.getTxtSeiriNo().setValue(new RString(整理番号));

        return rowMishinsaShikyuShinseiListData;

    }

    /**
     * 住宅改修費支給申請審査 申請内容の画面で、3段階リセットをチェックしたから、戻るとき、相違有り：3段階リセットの行で、３段階チェックを設定する。
     *
     * @param panel MishinsaShikyuShinseiListPanelDiv
     * @param panel1
     * @return
     */
    public ResponseData<MishinsaShikyuShinseiListPanelDiv> onClick_btnModifyShinseiContents(MishinsaShikyuShinseiListPanelDiv panel, JutakuKaishuShinseiResetInfoDiv panel1) {
        ResponseData<MishinsaShikyuShinseiListPanelDiv> response = new ResponseData<>();

        panel.getDgMishinsaShikyuShinsei().getClickedItem().setRowState(RowState.Modified);

        List<dgMishinsaShikyuShinsei_Row> selectedMishinsaShikyuShinsei
                = panel.getDgMishinsaShikyuShinsei().getSelectedItems();

        //TO DO  介護状態区分３段階変更による　チェックされたことを確認する。JutakuKaishuShinseiResetInfoDiv
        String chkResetInfoSelValue = panel1.getChkResetInfo().getSelectedValues().toString();

        for (int i = 0; i < selectedMishinsaShikyuShinsei.size(); i++) {
            dgMishinsaShikyuShinsei_Row mishinsaShikyuShinsei_Row = selectedMishinsaShikyuShinsei.get(i);
            if (i == 3) {
                mishinsaShikyuShinsei_Row.setTxtShinsaResult(new RString("相違有り：3段階リセット"));

                if (chkResetInfoSelValue.equals("[要介護状態区分３段階変更による]")) {
                    if (!chkResetInfoSelValue.isEmpty()) {
                        mishinsaShikyuShinsei_Row.setTxt3DankaiReset(Boolean.TRUE);
                    }
                }

            } else {
                mishinsaShikyuShinsei_Row.setTxtShinsaResult(new RString("承認"));
            }
        }

        response.data = panel;
        return response;

    }

    /**
     * 住宅改修費支給申請審査 選択された未審査支給申請一覧情報をもとに、 支給申請内容を一括審査するボタンを押下後、審査結果の内容をセットされる。
     *
     * @param panel MishinsaShikyuShinseiListPanelDiv
     * @param panel1
     * @return
     */
    public ResponseData<MishinsaShikyuShinseiListPanelDiv> onClick_btnShinsa(MishinsaShikyuShinseiListPanelDiv panel, JutakuKaishuShinseiResetInfoDiv panel1) {
        ResponseData<MishinsaShikyuShinseiListPanelDiv> response = new ResponseData<>();

        List<dgMishinsaShikyuShinsei_Row> selectedMishinsaShikyuShinsei
                = panel.getDgMishinsaShikyuShinsei().getSelectedItems();

        //TO DO  介護状態区分３段階変更による　チェックされたことを確認する。JutakuKaishuShinseiResetInfoDiv
        String chkResetInfoSelValue = panel1.getChkResetInfo().getSelectedValues().toString();
        int rowErr = -1;
        for (int i = 0; i < selectedMishinsaShikyuShinsei.size(); i++) {
            dgMishinsaShikyuShinsei_Row mishinsaShikyuShinsei_Row = selectedMishinsaShikyuShinsei.get(i);
            if (i == 3) {
                mishinsaShikyuShinsei_Row.setTxtShinsaResult(new RString("相違有り：3段階リセット"));
                rowErr = i;
            } else {
                mishinsaShikyuShinsei_Row.setTxtShinsaResult(new RString("承認"));
            }
        }

        if (rowErr == 3) {
            if (!chkResetInfoSelValue.equals("[要介護状態区分３段階変更による]")) {
                /*  validate(response);  */
            }
            if (chkResetInfoSelValue.equals("[要介護状態区分３段階変更による]")) {
                if (!chkResetInfoSelValue.isEmpty()) {
                    dgMishinsaShikyuShinsei_Row mishinsaShikyuShinsei_Row = selectedMishinsaShikyuShinsei.get(rowErr);
                    mishinsaShikyuShinsei_Row.setTxtShinsaResult(new RString("承認"));
                    // mishinsaShikyuShinsei_Row.setTxt3DankaiReset(Boolean.TRUE);
                }
            }
        }

        response.data = panel;
        return response;

    }

    /*
     * エラーMESSAGE
     */
//    private void validate(ResponseData<MishinsaShikyuShinseiListPanelDiv> response) {
//       String errMessage = "【未審査支給申請一覧】3行：相違有り3段階をリセットしてください";
//       response.addMessage(new WarningMessage("エラー", errMessage), DivcontrollerMethod.method(SingleButtonType.Free,null));
//    }
    /*
     * YML DATA 設定する
     */
    private List<HashMap> ymlData(String ymlDataName) {

        return YamlLoader.DBC.loadAsList(new RString("dbc0720011/" + ymlDataName));
    }
}
