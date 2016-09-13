/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.controller.parentdiv;

/**
 *
 */
public class ShokanShikyuTorokuShomeishoManager {

    // 南魚沼市のデモ向けに、基本情報」「給付費明細」「請求額集計」「社福系減額」以外のタブの機能をコメントアウト。
//    // !!!!!!!!!!!!!!!!!!!!!!↓↓ここから緊急時施設療養費タブに関連するコード↓↓!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    /**
//     * サービス提供証明書情報の緊急時施設療養費タブで明細情報を追加するボタンを押下したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onClickAddRyoyoMeisai(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        setRyoyoMeisaiData(panel, イベント.追加);
//        showRyoyo(panel, 一覧明細表示.明細表示);
//        response.data = panel;
//        return response;
//    }
//
//    /**
//     * サービス提供証明書情報の緊急時施設療養費タブで、一覧から行を選択したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onSelectedRyoyoList(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        setRyoyoMeisaiData(panel, イベント.選択);
//        showRyoyo(panel, 一覧明細表示.明細表示);
//        response.data = panel;
//        return response;
//    }
//
//    /**
//     * サービス提供証明書情報の緊急時施設療養費タブで、一覧の行の削除ボタンを押下したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onClickRyoyoListDelete(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        deleteRyoyoListData(panel);
//        response.data = panel;
//        return response;
//    }
//
//    /**
//     * サービス提供証明書情報の緊急時施設療養費タブで入力内容を確定するボタンを押下したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onClickRyoyoKakutei(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        kakuteiRyoyoMeisaiData(panel);
//        initRyoyoMeisaiData(panel);
//        showRyoyo(panel, 一覧明細表示.一覧表示);
//        response.data = panel;
//        return response;
//    }
//
//    private void showRyoyo(ShokanShikyuTorokuShomeishoDiv panel, 一覧明細表示 show) {
//        ShokanShikyuTorokuShomeishoRyoyoDiv ryoyo = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoRyoyo();
//        if (show.equals(一覧明細表示.一覧表示)) {
//            ryoyo.getShokanShikyuTorokuShomeishoRyoyoList().setIsOpen(true);
//            ryoyo.getShokanShikyuTorokuShomeishoRyoyoMeisai().setIsOpen(false);
//        } else if (show.equals(一覧明細表示.明細表示)) {
//            ryoyo.getShokanShikyuTorokuShomeishoRyoyoList().setIsOpen(false);
//            ryoyo.getShokanShikyuTorokuShomeishoRyoyoMeisai().setIsOpen(true);
//        }
//    }
//
//    private void setRyoyoListData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoRyoyoDiv ryoyo = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoRyoyo();
//        ServiceTeikyoShomeishoRyoyoListDiv ryoyoList = ryoyo.getShokanShikyuTorokuShomeishoRyoyoList()
//                .getShokanShikyuTorokuShomeishoRyoyoListInfo();
//        DataGrid<dgServiceTeikyoShomeishoRyoyoList_Row> dgRow = ryoyoList.getDgServiceTeikyoShomeishoRyoyoList();
//        List<dgServiceTeikyoShomeishoRyoyoList_Row> dgRowList = dgRow.getDataSource();
//
//        List<HashMap> sourceList = getShokanShikyuTorokuShomeishoYaml();
//        dgRowList.clear();
//        for (int i = 8; i < 11; i++) {
//            dgRowList.add(create療養費一覧アイテム(
//                    sourceList.get(i).get("所定疾患傷病名１").toString(),
//                    sourceList.get(i).get("療養開始日１").toString(),
//                    sourceList.get(i).get("所定疾患施設療養費合計").toString(),
//                    sourceList.get(i).get("緊急時傷病名１").toString(),
//                    sourceList.get(i).get("治療開始日１").toString(),
//                    sourceList.get(i).get("緊急時治療管理合計").toString(),
//                    sourceList.get(i).get("緊急時施設療養費合計").toString()
//            ));
//        }
//        dgRow.setDataSource(dgRowList);
//    }
//
//    private void deleteRyoyoListData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoRyoyoDiv ryoyo = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoRyoyo();
//        ServiceTeikyoShomeishoRyoyoListDiv ryoyoList = ryoyo.getShokanShikyuTorokuShomeishoRyoyoList()
//                .getShokanShikyuTorokuShomeishoRyoyoListInfo();
//        DataGrid<dgServiceTeikyoShomeishoRyoyoList_Row> dgRow = ryoyoList.getDgServiceTeikyoShomeishoRyoyoList();
//        List<dgServiceTeikyoShomeishoRyoyoList_Row> dgRowList = dgRow.getDataSource();
//        int index = dgRow.getClickedRowId();
//
//        dgServiceTeikyoShomeishoRyoyoList_Row item = dgRow.getClickedItem();
//        item.setRowState(RowState.Deleted);
//        dgRowList.remove(index);
//        dgRowList.add(index, item);
//        dgRow.setDataSource(dgRowList);
//    }
//
//    private void setRyoyoMeisaiData(ShokanShikyuTorokuShomeishoDiv panel, イベント event) {
//        ShokanShikyuTorokuShomeishoRyoyoDiv ryoyo = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoRyoyo();
//        ShokanShikyuTorokuShomeishoRyoyoMeisaiDiv ryoyoMeisai = ryoyo.getShokanShikyuTorokuShomeishoRyoyoMeisai();
//        if (event.equals(イベント.追加)) {
//            ryoyoMeisai.getTxtRyoyoSelectedIndex().setValue(new RString("-1"));
//        } else {
//            int index = ryoyo.getShokanShikyuTorokuShomeishoRyoyoList().getShokanShikyuTorokuShomeishoRyoyoListInfo()
//                    .getDgServiceTeikyoShomeishoRyoyoList().getActiveRowId();
//            ryoyoMeisai.getTxtRyoyoSelectedIndex().setValue(new RString(String.valueOf(index)));
//        }
//        HashMap sourceShikkan = getShokanShikyuTorokuShomeishoYamlId(11);
//        HashMap sourceKinkyuji = getShokanShikyuTorokuShomeishoYamlId(12);
//        HashMap sourceOshin = getShokanShikyuTorokuShomeishoYamlId(13);
//        HashMap sourceTensu = getShokanShikyuTorokuShomeishoYamlId(14);
//        ShokanShikyuTorokuShomeishoRyoyoShikkanDiv shikkan = ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoShikkan();
//        ShokanShikyuTorokuShomeishoRyoyoKinkyujiDiv kinkyuji = ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoKinkyuji();
//        ShokanShikyuTorokuShomeishoRyoyoOshinTsuinDiv oshin = ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoOshinTsuin();
//        ShokanShikyuTorokuShomeishoRyoyoTensuDiv tensu = ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoTensu();
//        shikkan.getTxtRyoyohiShikkanName1().setValue(new RString(sourceShikkan.get("疾病名１").toString()));
//        shikkan.getTxtRyoyohiShikkanName2().setValue(new RString(sourceShikkan.get("疾病名２").toString()));
//        shikkan.getTxtRyoyohiShikkanName3().setValue(new RString(sourceShikkan.get("疾病名３").toString()));
//        shikkan.getTxtRyoyohiRyoyoKaishiYMD1().setValue(new RDate(sourceShikkan.get("療養開始日１").toString()));
//        shikkan.getTxtRyoyohiRyoyoKaishiYMD2().setValue(new RDate(sourceShikkan.get("療養開始日２").toString()));
//        shikkan.getTxtRyoyohiRyoyoKaishiYMD3().setValue(new RDate(sourceShikkan.get("療養開始日３").toString()));
//        kinkyuji.getTxtRyoyohiKinkyuName1().setValue(new RString(sourceKinkyuji.get("疾病名１").toString()));
//        kinkyuji.getTxtRyoyohiKinkyuName2().setValue(new RString(sourceKinkyuji.get("疾病名２").toString()));
//        kinkyuji.getTxtRyoyohiKinkyuName3().setValue(new RString(sourceKinkyuji.get("疾病名３").toString()));
//        kinkyuji.getTxtRyoyohiChiryoKaishiYMD1().setValue(new RDate(sourceKinkyuji.get("治療開始日１").toString()));
//        kinkyuji.getTxtRyoyohiChiryoKaishiYMD2().setValue(new RDate(sourceKinkyuji.get("治療開始日２").toString()));
//        kinkyuji.getTxtRyoyohiChiryoKaishiYMD3().setValue(new RDate(sourceKinkyuji.get("治療開始日３").toString()));
//        oshin.getTxtRyoyohiOshinNissu().setValue(new Decimal(sourceOshin.get("往診日数").toString()));
//        oshin.getTxtRyoyohiOshinKikanName().setValue(new RString(sourceOshin.get("往診医療機関名").toString()));
//        oshin.getTxtRyoyohiTsuinNissu().setValue(new Decimal(sourceOshin.get("通院日数").toString()));
//        oshin.getTxtRyoyohiTsuinKikanName().setValue(new RString(sourceOshin.get("通院医療機関名").toString()));
//        oshin.getTxtRyoyohiTekiyo().setValue(new RString(sourceOshin.get("摘要").toString()));
//        tensu.getTxtRyoyohiRyoyohiTanisu().setValue(new Decimal(sourceTensu.get("療養費単位数").toString()));
//        tensu.getTxtRyoyohiRyoyohiNissu().setValue(new Decimal(sourceTensu.get("療養費日数").toString()));
//        tensu.getTxtRyoyohiRyoyohiShokei().setValue(new Decimal(sourceTensu.get("療養費小計").toString()));
//        tensu.getTxtRyoyohiChiryohiTanisu().setValue(new Decimal(sourceTensu.get("治療費単位数").toString()));
//        tensu.getTxtRyoyohiChiryohiNissu().setValue(new Decimal(sourceTensu.get("治療費日数").toString()));
//        tensu.getTxtRyoyohiChiryohiShokei().setValue(new Decimal(sourceTensu.get("治療費小計").toString()));
//        tensu.getTxtRyoyohiRehabili().setValue(new Decimal(sourceTensu.get("リハビリ").toString()));
//        tensu.getTxtRyoyohiShujutsu().setValue(new Decimal(sourceTensu.get("手術").toString()));
//        tensu.getTxtRyoyohiHoshasen().setValue(new Decimal(sourceTensu.get("放射線治療").toString()));
//        tensu.getTxtRyoyohiShochi().setValue(new Decimal(sourceTensu.get("処置").toString()));
//        tensu.getTxtRyoyohiMasui().setValue(new Decimal(sourceTensu.get("麻酔").toString()));
//        tensu.getTxtRyoyohiChiryoGokei().setValue(new Decimal(sourceTensu.get("特定治療合計").toString()));
//    }
//
//    private void initRyoyoMeisaiData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoRyoyoDiv ryoyo = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoRyoyo();
//        ShokanShikyuTorokuShomeishoRyoyoMeisaiDiv ryoyoMeisai = ryoyo.getShokanShikyuTorokuShomeishoRyoyoMeisai();
//        ryoyoMeisai.getTxtRyoyoSelectedIndex().setValue(new RString("-1"));
//        ShokanShikyuTorokuShomeishoRyoyoShikkanDiv shikkan = ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoShikkan();
//        ShokanShikyuTorokuShomeishoRyoyoKinkyujiDiv kinkyuji = ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoKinkyuji();
//        ShokanShikyuTorokuShomeishoRyoyoOshinTsuinDiv oshin = ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoOshinTsuin();
//        ShokanShikyuTorokuShomeishoRyoyoTensuDiv tensu = ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoTensu();
//        shikkan.getTxtRyoyohiShikkanName1().clearValue();
//        shikkan.getTxtRyoyohiShikkanName2().clearValue();
//        shikkan.getTxtRyoyohiShikkanName3().clearValue();
//        shikkan.getTxtRyoyohiRyoyoKaishiYMD1().clearValue();
//        shikkan.getTxtRyoyohiRyoyoKaishiYMD2().clearValue();
//        shikkan.getTxtRyoyohiRyoyoKaishiYMD3().clearValue();
//        kinkyuji.getTxtRyoyohiKinkyuName1().clearValue();
//        kinkyuji.getTxtRyoyohiKinkyuName2().clearValue();
//        kinkyuji.getTxtRyoyohiKinkyuName3().clearValue();
//        kinkyuji.getTxtRyoyohiChiryoKaishiYMD1().clearValue();
//        kinkyuji.getTxtRyoyohiChiryoKaishiYMD2().clearValue();
//        kinkyuji.getTxtRyoyohiChiryoKaishiYMD3().clearValue();
//        oshin.getTxtRyoyohiOshinNissu().clearValue();
//        oshin.getTxtRyoyohiOshinKikanName().clearValue();
//        oshin.getTxtRyoyohiTsuinNissu().clearValue();
//        oshin.getTxtRyoyohiTsuinKikanName().clearValue();
//        oshin.getTxtRyoyohiTekiyo().clearValue();
//        tensu.getTxtRyoyohiRyoyohiTanisu().clearValue();
//        tensu.getTxtRyoyohiRyoyohiNissu().clearValue();
//        tensu.getTxtRyoyohiRyoyohiShokei().clearValue();
//        tensu.getTxtRyoyohiChiryohiTanisu().clearValue();
//        tensu.getTxtRyoyohiChiryohiNissu().clearValue();
//        tensu.getTxtRyoyohiChiryohiShokei().clearValue();
//        tensu.getTxtRyoyohiRehabili().clearValue();
//        tensu.getTxtRyoyohiShujutsu().clearValue();
//        tensu.getTxtRyoyohiHoshasen().clearValue();
//        tensu.getTxtRyoyohiShochi().clearValue();
//        tensu.getTxtRyoyohiMasui().clearValue();
//        tensu.getTxtRyoyohiChiryoGokei().clearValue();
//    }
//
//    private void kakuteiRyoyoMeisaiData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoRyoyoDiv ryoyo = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoRyoyo();
//        ServiceTeikyoShomeishoRyoyoListDiv ryoyoList = ryoyo.getShokanShikyuTorokuShomeishoRyoyoList()
//                .getShokanShikyuTorokuShomeishoRyoyoListInfo();
//        ShokanShikyuTorokuShomeishoRyoyoMeisaiDiv ryoyoMeisai = ryoyo.getShokanShikyuTorokuShomeishoRyoyoMeisai();
//
//        DataGrid<dgServiceTeikyoShomeishoRyoyoList_Row> dgRow = ryoyoList.getDgServiceTeikyoShomeishoRyoyoList();
//        List<dgServiceTeikyoShomeishoRyoyoList_Row> dgRowList = dgRow.getDataSource();
//        int index = Integer.parseInt(ryoyoMeisai.getTxtRyoyoSelectedIndex().getValue().toString());
//
//        dgServiceTeikyoShomeishoRyoyoList_Row item = create療養費一覧アイテム(
//                ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoShikkan().getTxtRyoyohiShikkanName1().getValue().toString(),
//                ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoShikkan().getTxtRyoyohiRyoyoKaishiYMD1()
//                .getValue().wareki().toDateString().toString(),
//                ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoTensu().getTxtRyoyohiRyoyohiShokei().getValue().toString(),
//                ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoKinkyuji().getTxtRyoyohiKinkyuName1().getValue().toString(),
//                ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoKinkyuji().getTxtRyoyohiChiryoKaishiYMD1()
//                .getValue().wareki().toDateString().toString(),
//                ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoTensu().getTxtRyoyohiChiryohiShokei().getValue().toString(),
//                ryoyoMeisai.getShokanShikyuTorokuShomeishoRyoyoTensu().getTxtRyoyohiChiryoGokei().getValue().toString());
//        if (index == -1) {
//            item.setRowState(RowState.Added);
//            dgRowList.add(item);
//        } else {
//            item.setRowState(RowState.Modified);
//            dgRowList.remove(index);
//            dgRowList.add(index, item);
//        }
//        dgRow.setDataSource(dgRowList);
//    }
//
//    private dgServiceTeikyoShomeishoRyoyoList_Row create療養費一覧アイテム(
//            String txtShoteiShikkanName,
//            String txtRyoyoKaishiYMD,
//            String txtShoteiShikkanGokei,
//            String txtKinkyujiName,
//            String txtChiryoKaishiYMD,
//            String txtKinkyujiGokei,
//            String txtRyoyohiGokei
//    ) {
//        Button btnSelect = new Button();
//        Button btnEdit = new Button();
//        Button btnDelete = new Button();
//
//        return new dgServiceTeikyoShomeishoRyoyoList_Row(
//                btnSelect,
//                btnEdit,
//                btnDelete,
//                new RString(txtShoteiShikkanName),
//                new RString(txtRyoyoKaishiYMD),
//                new RString(txtShoteiShikkanGokei),
//                new RString(txtKinkyujiName),
//                new RString(txtChiryoKaishiYMD),
//                new RString(txtKinkyujiGokei),
//                new RString(txtRyoyohiGokei));
//    }
//    // !!!!!!!!!!!!!!!!!!!!!!↑↑ここまで緊急時施設療養費タブに関連するコード↑↑!!!!!!!!!!!!!!!!!!!!!!!!!!!
// 南魚沼市のデモ向けに、基本情報」「給付費明細」「請求額集計」「社福系減額」以外のタブの機能をコメントアウト。
//    // !!!!!!!!!!!!!!!!!!!!!!↓↓ここから特定診療費タブに関連するコード↓↓!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    private enum 診療費切替 {
//
//        H1503(20030331),
//        H1504(20030401);
//        private final RDate date;
//
//        private 診療費切替(int dateString) {
//            this.date = new RDate(dateString);
//        }
//
//        public RDate getDate() {
//            return date;
//        }
//    }
//
//    /**
//     * サービス提供証明書情報の特定診療費タブで明細情報を追加するボタンを押下したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onClickAddShinryoMeisai(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        setShinryoMeisaiData(panel, イベント.追加);
//        showShinryo(panel, 一覧明細表示.明細表示);
//        response.data = panel;
//        return response;
//    }
//
//    /**
//     * サービス提供証明書情報の特定診療費タブで、一覧から行を選択したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onSelectedShinryoList(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        setShinryoMeisaiData(panel, イベント.選択);
//        showShinryo(panel, 一覧明細表示.明細表示);
//        response.data = panel;
//        return response;
//    }
//
//    /**
//     * サービス提供証明書情報の特定診療費タブで、一覧の行の削除ボタンを押下したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onClickShinryoListDelete(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        deleteShinryoListData(panel);
//        response.data = panel;
//        return response;
//    }
//
//    /**
//     * サービス提供証明書情報の特定診療費タブで入力内容を確定するボタンを押下したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onClickShinryoKakutei(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        kakuteiShinryoMeisaiData(panel);
//        initShinryoMeisaiData(panel);
//        showShinryo(panel, 一覧明細表示.一覧表示);
//        response.data = panel;
//        return response;
//    }
//
//    private void showShinryo(ShokanShikyuTorokuShomeishoDiv panel, 一覧明細表示 show) {
//        ShokanShikyuTorokuShomeishoShinryoDiv shinryo = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoShinryo();
//        RDate date = panel.getTxtShomeishoTeikyoYM().getValue();
//        if (date.isBefore(診療費切替.H1504.getDate())) {
//            shinryo.getShokanShikyuTorokuShomeishoShinryoList()
//                    .getShokanShikyuTorokuShomeishoShinryoListInfoH1503().setVisible(true);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoList()
//                    .getShokanShikyuTorokuShomeishoShinryoListInfoH1503().setDisplayNone(false);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoList()
//                    .getShokanShikyuTorokuShomeishoShinryoListInfo().setVisible(false);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoList()
//                    .getShokanShikyuTorokuShomeishoShinryoListInfo().setDisplayNone(true);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoMeisai()
//                    .getShokanShikyuTorokuShomeishoShinryoMeisaiH1503().setVisible(true);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoMeisai()
//                    .getShokanShikyuTorokuShomeishoShinryoMeisaiH1503().setDisplayNone(false);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoMeisai()
//                    .getShokanShikyuTorokuShomeishoShinryoMeisaiH1504().setVisible(false);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoMeisai()
//                    .getShokanShikyuTorokuShomeishoShinryoMeisaiH1504().setDisplayNone(true);
//        } else {
//            shinryo.getShokanShikyuTorokuShomeishoShinryoList()
//                    .getShokanShikyuTorokuShomeishoShinryoListInfoH1503().setVisible(false);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoList()
//                    .getShokanShikyuTorokuShomeishoShinryoListInfoH1503().setDisplayNone(true);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoList()
//                    .getShokanShikyuTorokuShomeishoShinryoListInfo().setVisible(true);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoList()
//                    .getShokanShikyuTorokuShomeishoShinryoListInfo().setDisplayNone(false);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoMeisai()
//                    .getShokanShikyuTorokuShomeishoShinryoMeisaiH1503().setVisible(false);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoMeisai()
//                    .getShokanShikyuTorokuShomeishoShinryoMeisaiH1503().setDisplayNone(true);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoMeisai()
//                    .getShokanShikyuTorokuShomeishoShinryoMeisaiH1504().setVisible(true);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoMeisai()
//                    .getShokanShikyuTorokuShomeishoShinryoMeisaiH1504().setDisplayNone(false);
//        }
//        if (show.equals(一覧明細表示.一覧表示)) {
//            shinryo.getShokanShikyuTorokuShomeishoShinryoList().setIsOpen(true);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoMeisai().setIsOpen(false);
//        } else if (show.equals(一覧明細表示.明細表示)) {
//            shinryo.getShokanShikyuTorokuShomeishoShinryoList().setIsOpen(false);
//            shinryo.getShokanShikyuTorokuShomeishoShinryoMeisai().setIsOpen(true);
//        }
//    }
//
//    private void setShinryoListData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoShinryoDiv shinryo = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoShinryo();
//        ServiceTeikyoShomeishoShinryoListH1503Div shinryoH1503List = shinryo
//                .getShokanShikyuTorokuShomeishoShinryoList().getShokanShikyuTorokuShomeishoShinryoListInfoH1503();
//        ServiceTeikyoShomeishoShinryoListDiv shinryoH1504List = shinryo
//                .getShokanShikyuTorokuShomeishoShinryoList().getShokanShikyuTorokuShomeishoShinryoListInfo();
//
//        DataGrid<dgServiceTeikyoShomeishoShinryoListH1503_Row> dgRowH1503 = shinryoH1503List
//                .getDgServiceTeikyoShomeishoShinryoListH1503();
//        List<dgServiceTeikyoShomeishoShinryoListH1503_Row> dgRowListH1503 = dgRowH1503.getDataSource();
//        DataGrid<dgServiceTeikyoShomeishoShinryoList_Row> dgRowH1504 = shinryoH1504List
//                .getDgServiceTeikyoShomeishoShinryoList();
//        List<dgServiceTeikyoShomeishoShinryoList_Row> dgRowListH1504 = dgRowH1504.getDataSource();
//
//        List<HashMap> sourceList = getShokanShikyuTorokuShomeishoYaml();
//        dgRowListH1503.clear();
//        for (int i = 15; i < 18; i++) {
//            dgRowListH1503.add(create特定診療費一覧H1503アイテム(
//                    sourceList.get(i).get("傷病名").toString(),
//                    sourceList.get(i).get("指導管理").toString(),
//                    sourceList.get(i).get("リハビリ").toString(),
//                    sourceList.get(i).get("精神科").toString(),
//                    sourceList.get(i).get("エックス線").toString(),
//                    sourceList.get(i).get("その他１").toString(),
//                    sourceList.get(i).get("その他２").toString(),
//                    sourceList.get(i).get("合計").toString()
//            ));
//        }
//        dgRowH1503.setDataSource(dgRowListH1503);
//
//        dgRowListH1504.clear();
//        for (int i = 18; i < 21; i++) {
//            dgRowListH1504.add(create特定診療費一覧H1504アイテム(
//                    sourceList.get(i).get("傷病名").toString(),
//                    sourceList.get(i).get("識別番号").toString(),
//                    sourceList.get(i).get("単位数").toString(),
//                    sourceList.get(i).get("回数").toString(),
//                    sourceList.get(i).get("合計単位数").toString()
//            ));
//        }
//        dgRowH1504.setDataSource(dgRowListH1504);
//    }
//
//    private void deleteShinryoListData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoShinryoDiv shinryo = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoShinryo();
//        ServiceTeikyoShomeishoShinryoListDiv shinryoList = shinryo
//                .getShokanShikyuTorokuShomeishoShinryoList().getShokanShikyuTorokuShomeishoShinryoListInfo();
//        DataGrid<dgServiceTeikyoShomeishoShinryoList_Row> dgRow = shinryoList
//                .getDgServiceTeikyoShomeishoShinryoList();
//        List<dgServiceTeikyoShomeishoShinryoList_Row> dgRowList = dgRow.getDataSource();
//        int index = dgRow.getClickedRowId();
//
//        dgServiceTeikyoShomeishoShinryoList_Row item = dgRow.getClickedItem();
//        item.setRowState(RowState.Deleted);
//        dgRowList.remove(index);
//        dgRowList.add(index, item);
//
//        dgRow.setDataSource(dgRowList);
//    }
//
//    private void setShinryoMeisaiData(ShokanShikyuTorokuShomeishoDiv panel, イベント event) {
//        ShokanShikyuTorokuShomeishoShinryoDiv shinryo = panel.getTabShokanShikyuTorokuShomeisho().getShokanShikyuTorokuShomeishoShinryo();
//        ShokanShikyuTorokuShomeishoShinryoMeisaiDiv shinryoMeisai = shinryo.getShokanShikyuTorokuShomeishoShinryoMeisai();
//        if (event.equals(イベント.追加)) {
//            shinryoMeisai.getTxtShinryoSelectedIndex().setValue(new RString("-1"));
//        } else {
//            int index = shinryo.getShokanShikyuTorokuShomeishoShinryoList()
//                    .getShokanShikyuTorokuShomeishoShinryoListInfo().getDgServiceTeikyoShomeishoShinryoList().getActiveRowId();
//            shinryoMeisai.getTxtShinryoSelectedIndex().setValue(new RString(String.valueOf(index)));
//        }
//        RDate date = panel.getTxtShomeishoTeikyoYM().getValue();
//        if (date.isBefore(診療費切替.H1504.getDate())) {
//            HashMap source = getShokanShikyuTorokuShomeishoYamlId(21);
//            ShokanShikyuTorokuShomeishoShinryoMeisaiH1503Div h1503div = shinryoMeisai
//                    .getShokanShikyuTorokuShomeishoShinryoMeisaiH1503();
//            h1503div.getTxtShinryohiShobyoNameH1503().setValue(new RString(source.get("傷病名").toString()));
//            h1503div.getTxtShinryohiShidoKanri().setValue(new Decimal(source.get("指導管理等").toString()));
//            h1503div.getTxtShinryohiRehabili().setValue(new Decimal(source.get("リハビリ").toString()));
//            h1503div.getTxtShinryohiSenmonRyoho().setValue(new Decimal(source.get("精神科専門療法").toString()));
//            h1503div.getTxtShinryohiXSen().setValue(new Decimal(source.get("単純エックス線").toString()));
//            h1503div.getTxtShinryohiEtc1().setValue(new Decimal(source.get("その他１").toString()));
//            h1503div.getTxtShinryohiEtc2().setValue(new Decimal(source.get("その他２").toString()));
//            h1503div.getTxtShinryohiGokeiTanisuH1503().setValue(new Decimal(source.get("合計単位数").toString()));
//            h1503div.getTxtShinryohiTekiyoH1503().setValue(new RString(source.get("摘要").toString()));
//        } else {
//            HashMap source = getShokanShikyuTorokuShomeishoYamlId(22);
//            ShokanShikyuTorokuShomeishoShinryoMeisaiH1504Div h1504div = shinryoMeisai
//                    .getShokanShikyuTorokuShomeishoShinryoMeisaiH1504();
//            h1504div.getTxtShinryohiShobyoNameH1504().setValue(new RString(source.get("傷病名").toString()));
//            h1504div.getTxtShinryohiShikibetsuNo().setValue(new RString(source.get("識別番号").toString()));
//            h1504div.getTxtShinryohiShikibetsuName().setValue(new RString(source.get("識別名").toString()));
//            h1504div.getTxtShinryohiTanisu().setValue(new Decimal(source.get("単位").toString()));
//            h1504div.getTxtShinryohiKaisu().setValue(new Decimal(source.get("回数").toString()));
//            h1504div.getTxtShinryohiGokeiTanisuH1504().setValue(new Decimal(source.get("合計単位数").toString()));
//            h1504div.getTxtShinryohiTekiyoH1504().setValue(new RString(source.get("摘要").toString()));
//        }
//    }
//
//    private void initShinryoMeisaiData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoShinryoDiv shinryo = panel
//                .getTabShokanShikyuTorokuShomeisho().getShokanShikyuTorokuShomeishoShinryo();
//        ShokanShikyuTorokuShomeishoShinryoMeisaiDiv shinryoMeisai = shinryo
//                .getShokanShikyuTorokuShomeishoShinryoMeisai();
//        shinryoMeisai.getTxtShinryoSelectedIndex().setValue(new RString("-1"));
//        ShokanShikyuTorokuShomeishoShinryoMeisaiH1503Div h1503div = shinryoMeisai
//                .getShokanShikyuTorokuShomeishoShinryoMeisaiH1503();
//        h1503div.getTxtShinryohiShobyoNameH1503().clearValue();
//        h1503div.getTxtShinryohiShidoKanri().clearValue();
//        h1503div.getTxtShinryohiRehabili().clearValue();
//        h1503div.getTxtShinryohiSenmonRyoho().clearValue();
//        h1503div.getTxtShinryohiXSen().clearValue();
//        h1503div.getTxtShinryohiEtc1().clearValue();
//        h1503div.getTxtShinryohiEtc2().clearValue();
//        h1503div.getTxtShinryohiGokeiTanisuH1503().clearValue();
//        h1503div.getTxtShinryohiTekiyoH1503().clearValue();
//        ShokanShikyuTorokuShomeishoShinryoMeisaiH1504Div h1504div = shinryoMeisai
//                .getShokanShikyuTorokuShomeishoShinryoMeisaiH1504();
//        h1504div.getTxtShinryohiShobyoNameH1504().clearValue();
//        h1504div.getTxtShinryohiShikibetsuNo().clearValue();
//        h1504div.getTxtShinryohiShikibetsuName().clearValue();
//        h1504div.getTxtShinryohiTanisu().clearValue();
//        h1504div.getTxtShinryohiKaisu().clearValue();
//        h1504div.getTxtShinryohiGokeiTanisuH1504().clearValue();
//        h1504div.getTxtShinryohiTekiyoH1504().clearValue();
//    }
//
//    private void kakuteiShinryoMeisaiData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoShinryoDiv shinryo = panel
//                .getTabShokanShikyuTorokuShomeisho().getShokanShikyuTorokuShomeishoShinryo();
//        ShokanShikyuTorokuShomeishoShinryoListDiv shinryoList = shinryo
//                .getShokanShikyuTorokuShomeishoShinryoList();
//        ShokanShikyuTorokuShomeishoShinryoMeisaiDiv shinryoMeisai = shinryo
//                .getShokanShikyuTorokuShomeishoShinryoMeisai();
//        int index = Integer.parseInt(shinryoMeisai.getTxtShinryoSelectedIndex().getValue().toString());
//
//        RDate date = panel.getTxtShomeishoTeikyoYM().getValue();
//        if (date.isBefore(診療費切替.H1504.getDate())) {
//            ShokanShikyuTorokuShomeishoShinryoMeisaiH1503Div h1503div = shinryoMeisai
//                    .getShokanShikyuTorokuShomeishoShinryoMeisaiH1503();
//            ServiceTeikyoShomeishoShinryoListH1503Div shinryoH1503List = shinryoList
//                    .getShokanShikyuTorokuShomeishoShinryoListInfoH1503();
//            DataGrid<dgServiceTeikyoShomeishoShinryoListH1503_Row> dgRow = shinryoH1503List
//                    .getDgServiceTeikyoShomeishoShinryoListH1503();
//            List<dgServiceTeikyoShomeishoShinryoListH1503_Row> dgRowList = dgRow.getDataSource();
//            dgServiceTeikyoShomeishoShinryoListH1503_Row itemH1503 = create特定診療費一覧H1503アイテム(
//                    h1503div.getTxtShinryohiShobyoNameH1503().getValue().toString(),
//                    h1503div.getTxtShinryohiShidoKanri().getValue().toString(),
//                    h1503div.getTxtShinryohiRehabili().getValue().toString(),
//                    h1503div.getTxtShinryohiSenmonRyoho().getValue().toString(),
//                    h1503div.getTxtShinryohiXSen().getValue().toString(),
//                    h1503div.getTxtShinryohiEtc1().getValue().toString(),
//                    h1503div.getTxtShinryohiEtc2().getValue().toString(),
//                    h1503div.getTxtShinryohiGokeiTanisuH1503().getValue().toString());
//            if (index == -1) {
//                itemH1503.setRowState(RowState.Added);
//                dgRowList.add(itemH1503);
//            } else {
//                itemH1503.setRowState(RowState.Modified);
//                dgRowList.remove(index);
//                dgRowList.add(index, itemH1503);
//            }
//            dgRow.setDataSource(dgRowList);
//
//        } else {
//            ShokanShikyuTorokuShomeishoShinryoMeisaiH1504Div h1504div = shinryoMeisai
//                    .getShokanShikyuTorokuShomeishoShinryoMeisaiH1504();
//            ServiceTeikyoShomeishoShinryoListDiv shinryoH1504List = shinryoList
//                    .getShokanShikyuTorokuShomeishoShinryoListInfo();
//            DataGrid<dgServiceTeikyoShomeishoShinryoList_Row> dgRow = shinryoH1504List
//                    .getDgServiceTeikyoShomeishoShinryoList();
//            List<dgServiceTeikyoShomeishoShinryoList_Row> dgRowList = dgRow.getDataSource();
//            dgServiceTeikyoShomeishoShinryoList_Row itemH1504 = create特定診療費一覧H1504アイテム(
//                    h1504div.getTxtShinryohiShobyoNameH1504().getValue().toString(),
//                    h1504div.getTxtShinryohiShikibetsuNo().getValue().toString().concat(":")
//                    .concat(h1504div.getTxtShinryohiShikibetsuName().getValue().toString()),
//                    h1504div.getTxtShinryohiTanisu().getValue().toString(),
//                    h1504div.getTxtShinryohiKaisu().getValue().toString(),
//                    h1504div.getTxtShinryohiGokeiTanisuH1504().getValue().toString());
//            if (index == -1) {
//                itemH1504.setRowState(RowState.Added);
//                dgRowList.add(itemH1504);
//            } else {
//                itemH1504.setRowState(RowState.Modified);
//                dgRowList.remove(index);
//                dgRowList.add(index, itemH1504);
//            }
//            dgRow.setDataSource(dgRowList);
//        }
//    }
//
//    private dgServiceTeikyoShomeishoShinryoListH1503_Row create特定診療費一覧H1503アイテム(
//            String txtShobyoName,
//            String txtShidoKanri,
//            String txtRehabili,
//            String txtSeishinka,
//            String txtXSen,
//            String txtEtc1,
//            String txtEtc2,
//            String txtGokei
//    ) {
//        Button btnSelect = new Button();
//        Button btnEdit = new Button();
//        Button btnDelete = new Button();
//        return new dgServiceTeikyoShomeishoShinryoListH1503_Row(
//                btnSelect,
//                btnEdit,
//                btnDelete,
//                new RString(txtShobyoName),
//                new RString(txtShidoKanri),
//                new RString(txtRehabili),
//                new RString(txtSeishinka),
//                new RString(txtXSen),
//                new RString(txtEtc1),
//                new RString(txtEtc2),
//                new RString(txtGokei));
//    }
//
//    private dgServiceTeikyoShomeishoShinryoList_Row create特定診療費一覧H1504アイテム(
//            String txtShobyoName,
//            String txtShikibetsuNo,
//            String txtTanisu,
//            String txtKaisu,
//            String txtGokeiTanisu
//    ) {
//        Button btnSelect = new Button();
//        Button btnEdit = new Button();
//        Button btnDelete = new Button();
//
//        return new dgServiceTeikyoShomeishoShinryoList_Row(
//                btnSelect,
//                btnEdit,
//                btnDelete,
//                new RString(txtShobyoName),
//                new RString(txtShikibetsuNo),
//                new RString(txtTanisu),
//                new RString(txtKaisu),
//                new RString(txtGokeiTanisu));
//    }
//    // !!!!!!!!!!!!!!!!!!!!!!↑↑ここまで特定診療費タブに関連するコード↑↑!!!!!!!!!!!!!!!!!!!!!!!!!!!
// 南魚沼市のデモ向けに、基本情報」「給付費明細」「請求額集計」「社福系減額」以外のタブの機能をコメントアウト。
//    // !!!!!!!!!!!!!!!!!!!!!!↓↓ここから食事費用タブに関連するコード↓↓!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    private enum 食事費用切替 {
//
//        H1503(20030331),
//        H1504(20030401),
//        H1710(20051001);
//        private final RDate date;
//
//        private 食事費用切替(int dateString) {
//            this.date = new RDate(dateString);
//        }
//
//        public RDate getDate() {
//            return date;
//        }
//    }
//
//    /**
//     * サービス提供証明書情報の食事費用タブで明細情報を追加するボタンを押下したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onClickAddShokujiMeisai(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        setShokujiMeisaiData(panel, イベント.追加);
//        showShokuji(panel, 一覧明細表示.明細表示);
//        response.data = panel;
//        return response;
//    }
//
//    /**
//     * サービス提供証明書情報の食事費用タブで、一覧から行を選択したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onSelectedShokujiList(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        setShokujiMeisaiData(panel, イベント.選択);
//        showShokuji(panel, 一覧明細表示.明細表示);
//        response.data = panel;
//        return response;
//    }
//
//    /**
//     * サービス提供証明書情報の食事費用タブで、一覧の行の削除ボタンを押下したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onClickShokujiListDelete(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        deleteShokujiListData(panel);
//        response.data = panel;
//        return response;
//    }
//
//    /**
//     * サービス提供証明書情報の食事費用タブで入力内容を確定するボタンを押下したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onClickShokujiKakutei(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        kakuteiShokujiMeisaiData(panel);
//        initShokujiMeisaiData(panel);
//        showShokuji(panel, 一覧明細表示.一覧表示);
//        response.data = panel;
//        return response;
//    }
//
//    private void showShokuji(ShokanShikyuTorokuShomeishoDiv panel, 一覧明細表示 show) {
//        ShokanShikyuTorokuShomeishoShokujiDiv shokuji = panel.getTabShokanShikyuTorokuShomeisho().getShokanShikyuTorokuShomeishoShokuji();
//        RDate date = panel.getTxtShomeishoTeikyoYM().getValue();
//        if (date.isBefore(食事費用切替.H1504.getDate())) {
//            shokuji.getShokanShikyuTorokuShomeishoShokujiList()
//                    .getShokanShikyuTorokuShomeishoShokujiListInfoH1503().setVisible(true);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiList()
//                    .getShokanShikyuTorokuShomeishoShokujiListInfoH1503().setDisplayNone(false);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiList()
//                    .getShokanShikyuTorokuShomeishoShokujiListInfo().setVisible(false);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiList()
//                    .getShokanShikyuTorokuShomeishoShokujiListInfo().setDisplayNone(true);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiMeisai()
//                    .getShokanShikyuTorokuShomeishoShokujiMeisaiH1503().setVisible(true);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiMeisai()
//                    .getShokanShikyuTorokuShomeishoShokujiMeisaiH1503().setDisplayNone(false);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiMeisai()
//                    .getShokanShikyuTorokuShomeishoShokujiMeisaiH1504().setVisible(false);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiMeisai()
//                    .getShokanShikyuTorokuShomeishoShokujiMeisaiH1504().setDisplayNone(true);
//        } else {
//            shokuji.getShokanShikyuTorokuShomeishoShokujiList()
//                    .getShokanShikyuTorokuShomeishoShokujiListInfoH1503().setVisible(false);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiList()
//                    .getShokanShikyuTorokuShomeishoShokujiListInfoH1503().setDisplayNone(true);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiList()
//                    .getShokanShikyuTorokuShomeishoShokujiListInfo().setVisible(true);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiList()
//                    .getShokanShikyuTorokuShomeishoShokujiListInfo().setDisplayNone(false);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiMeisai()
//                    .getShokanShikyuTorokuShomeishoShokujiMeisaiH1503().setVisible(false);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiMeisai()
//                    .getShokanShikyuTorokuShomeishoShokujiMeisaiH1503().setDisplayNone(true);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiMeisai()
//                    .getShokanShikyuTorokuShomeishoShokujiMeisaiH1504().setVisible(true);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiMeisai()
//                    .getShokanShikyuTorokuShomeishoShokujiMeisaiH1504().setDisplayNone(false);
//        }
//        if (show.equals(一覧明細表示.一覧表示)) {
//            shokuji.getShokanShikyuTorokuShomeishoShokujiList().setIsOpen(true);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiMeisai().setIsOpen(false);
//        } else if (show.equals(一覧明細表示.明細表示)) {
//            shokuji.getShokanShikyuTorokuShomeishoShokujiList().setIsOpen(false);
//            shokuji.getShokanShikyuTorokuShomeishoShokujiMeisai().setIsOpen(true);
//        }
//    }
//
//    private void setShokujiListData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoShokujiDiv shokuji = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoShokuji();
//        ServiceTeikyoShomeishoShokujiListH1503Div shokujiH1503List = shokuji
//                .getShokanShikyuTorokuShomeishoShokujiList().getShokanShikyuTorokuShomeishoShokujiListInfoH1503();
//        ServiceTeikyoShomeishoShokujiListDiv shokujiH1504List = shokuji
//                .getShokanShikyuTorokuShomeishoShokujiList().getShokanShikyuTorokuShomeishoShokujiListInfo();
//
//        DataGrid<dgServiceTeikyoShomeishoShokujiListH1503_Row> dgRowH1503 = shokujiH1503List
//                .getDgServiceTeikyoShomeishoShokujiListH1503();
//        List<dgServiceTeikyoShomeishoShokujiListH1503_Row> dgRowListH1503 = dgRowH1503.getDataSource();
//        DataGrid<dgServiceTeikyoShomeishoShokujiList_Row> dgRowH1504 = shokujiH1504List
//                .getDgServiceTeikyoShomeishoShokujiList();
//        List<dgServiceTeikyoShomeishoShokujiList_Row> dgRowListH1504 = dgRowH1504.getDataSource();
//
//        List<HashMap> sourceList = getShokanShikyuTorokuShomeishoYaml();
//        dgRowListH1503.clear();
//        for (int i = 23; i < 26; i++) {
//            dgRowListH1503.add(create食事費用一覧H1503アイテム(
//                    sourceList.get(i).get("基本食日数").toString(),
//                    sourceList.get(i).get("基本食単価").toString(),
//                    sourceList.get(i).get("基本食金額").toString(),
//                    sourceList.get(i).get("特別食日数").toString(),
//                    sourceList.get(i).get("特別食単価").toString(),
//                    sourceList.get(i).get("特別食単価").toString(),
//                    sourceList.get(i).get("食事提供延べ日数").toString(),
//                    sourceList.get(i).get("食事提供費合計").toString(),
//                    sourceList.get(i).get("標準負担日額").toString(),
//                    sourceList.get(i).get("標準負担月額").toString(),
//                    sourceList.get(i).get("食事提供請求額").toString()
//            ));
//        }
//        dgRowH1503.setDataSource(dgRowListH1503);
//
//        dgRowListH1504.clear();
//        for (int i = 26; i < 29; i++) {
//            dgRowListH1504.add(create食事費用一覧H1504アイテム(
//                    sourceList.get(i).get("サービス").toString(),
//                    sourceList.get(i).get("単位数").toString(),
//                    sourceList.get(i).get("日数回数").toString(),
//                    sourceList.get(i).get("合計金額").toString()
//            ));
//        }
//        dgRowH1504.setDataSource(dgRowListH1504);
//
//        set食事費用合計(panel);
//    }
//
//    private void deleteShokujiListData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoShokujiDiv shokuji = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoShokuji();
//        ServiceTeikyoShomeishoShokujiListDiv shokujiList = shokuji
//                .getShokanShikyuTorokuShomeishoShokujiList().getShokanShikyuTorokuShomeishoShokujiListInfo();
//        DataGrid<dgServiceTeikyoShomeishoShokujiList_Row> dgRow = shokujiList.getDgServiceTeikyoShomeishoShokujiList();
//        List<dgServiceTeikyoShomeishoShokujiList_Row> dgRowList = dgRow.getDataSource();
//        int index = dgRow.getClickedRowId();
//
//        dgServiceTeikyoShomeishoShokujiList_Row item = dgRow.getClickedItem();
//        item.setRowState(RowState.Deleted);
//        dgRowList.remove(index);
//        dgRowList.add(index, item);
//
//        dgRow.setDataSource(dgRowList);
//    }
//
//    private void setShokujiMeisaiData(ShokanShikyuTorokuShomeishoDiv panel, イベント event) {
//        ShokanShikyuTorokuShomeishoShokujiDiv shokuji = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoShokuji();
//        ShokanShikyuTorokuShomeishoShokujiMeisaiDiv shokujiMeisai = shokuji.getShokanShikyuTorokuShomeishoShokujiMeisai();
//        if (event.equals(イベント.追加)) {
//            shokujiMeisai.getTxtShokujiSelectedIndex().setValue(new RString("-1"));
//        } else {
//            int index = shokuji.getShokanShikyuTorokuShomeishoShokujiList()
//                    .getShokanShikyuTorokuShomeishoShokujiListInfo().getDgServiceTeikyoShomeishoShokujiList().getActiveRowId();
//            shokujiMeisai.getTxtShokujiSelectedIndex().setValue(new RString(String.valueOf(index)));
//        }
//        RDate date = panel.getTxtShomeishoTeikyoYM().getValue();
//        if (date.isBefore(食事費用切替.H1504.getDate())) {
//            HashMap source = getShokanShikyuTorokuShomeishoYamlId(29);
//            ShokanShikyuTorokuShomeishoShokujiMeisaiH1503Div h1503div = shokujiMeisai
//                    .getShokanShikyuTorokuShomeishoShokujiMeisaiH1503();
//            h1503div.getTxtShokujihiKihonNissu().setValue(new Decimal(source.get("基本食日数").toString()));
//            h1503div.getTxtShokujihiKihonTanka().setValue(new Decimal(source.get("基本食単価").toString()));
//            h1503div.getTxtShokujihiKihonKingaku().setValue(new Decimal(source.get("基本食金額").toString()));
//            h1503div.getTxtShokujihiTokubetsuNissu().setValue(new Decimal(source.get("特別食日数").toString()));
//            h1503div.getTxtShokujihiTokubetsuTanka().setValue(new Decimal(source.get("特別食単価").toString()));
//            h1503div.getTxtShokujihiTokubetsuKingaku().setValue(new Decimal(source.get("特別食金額").toString()));
//            h1503div.getTxtShokujihiNobeNissu().setValue(new Decimal(source.get("食事提供延べ日数").toString()));
//            h1503div.getTxtShokujihiTeikyoGokei().setValue(new Decimal(source.get("食事提供費合計").toString()));
//            h1503div.getTxtShokujihiFutanNichigaku().setValue(new Decimal(source.get("標準負担日額").toString()));
//            h1503div.getTxtShokujihiFutanGetsugaku().setValue(new Decimal(source.get("標準負担月額").toString()));
//            h1503div.getTxtShokujihiSeikyugaku().setValue(new Decimal(source.get("食事提供請求額").toString()));
//        } else {
//            HashMap source = getShokanShikyuTorokuShomeishoYamlId(30);
//            ShokanShikyuTorokuShomeishoShokujiMeisaiH1504Div h1504div = shokujiMeisai
//                    .getShokanShikyuTorokuShomeishoShokujiMeisaiH1504();
//            h1504div.getTxtShokujihiShuruiCode().setValue(new RString(source.get("サービス種類コード").toString()));
//            h1504div.getTxtShokujihiServiceCode().setValue(new RString(source.get("サービスコード").toString()));
//            h1504div.getTxtShokujihiServiceName().setValue(new RString(source.get("サービス名称").toString()));
//            h1504div.getTxtShokujihiTanisu().setValue(new Decimal(source.get("単位").toString()));
//            h1504div.getTxtShokujihiNissuKaisu().setValue(new Decimal(source.get("日数回数").toString()));
//            h1504div.getTxtShokujihiKingaku().setValue(new Decimal(source.get("金額").toString()));
//        }
//    }
//
//    private void initShokujiMeisaiData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoShokujiDiv shokuji = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoShokuji();
//        ShokanShikyuTorokuShomeishoShokujiMeisaiDiv shokujiMeisai = shokuji
//                .getShokanShikyuTorokuShomeishoShokujiMeisai();
//        shokujiMeisai.getTxtShokujiSelectedIndex().setValue(new RString("-1"));
//        ShokanShikyuTorokuShomeishoShokujiMeisaiH1503Div h1503div = shokujiMeisai
//                .getShokanShikyuTorokuShomeishoShokujiMeisaiH1503();
//        h1503div.getTxtShokujihiKihonNissu().clearValue();
//        h1503div.getTxtShokujihiKihonTanka().clearValue();
//        h1503div.getTxtShokujihiKihonKingaku().clearValue();
//        h1503div.getTxtShokujihiTokubetsuNissu().clearValue();
//        h1503div.getTxtShokujihiTokubetsuTanka().clearValue();
//        h1503div.getTxtShokujihiTokubetsuKingaku().clearValue();
//        h1503div.getTxtShokujihiNobeNissu().clearValue();
//        h1503div.getTxtShokujihiFutanNichigaku().clearValue();
//        h1503div.getTxtShokujihiTeikyoGokei().clearValue();
//        h1503div.getTxtShokujihiFutanGetsugaku().clearValue();
//        h1503div.getTxtShokujihiSeikyugaku().clearValue();
//        ShokanShikyuTorokuShomeishoShokujiMeisaiH1504Div h1504div = shokujiMeisai
//                .getShokanShikyuTorokuShomeishoShokujiMeisaiH1504();
//        h1504div.getTxtShokujihiShuruiCode().clearValue();
//        h1504div.getTxtShokujihiServiceCode().clearValue();
//        h1504div.getTxtShokujihiServiceName().clearValue();
//        h1504div.getTxtShokujihiTanisu().clearValue();
//        h1504div.getTxtShokujihiNissuKaisu().clearValue();
//        h1504div.getTxtShokujihiKingaku().clearValue();
//    }
//
//    private void kakuteiShokujiMeisaiData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoShokujiDiv shokuji = panel
//                .getTabShokanShikyuTorokuShomeisho().getShokanShikyuTorokuShomeishoShokuji();
//        ShokanShikyuTorokuShomeishoShokujiListDiv shokujiList = shokuji
//                .getShokanShikyuTorokuShomeishoShokujiList();
//        ShokanShikyuTorokuShomeishoShokujiMeisaiDiv shokujiMeisai = shokuji
//                .getShokanShikyuTorokuShomeishoShokujiMeisai();
//        int index = Integer.parseInt(shokujiMeisai.getTxtShokujiSelectedIndex().getValue().toString());
//
//        RDate date = panel.getTxtShomeishoTeikyoYM().getValue();
//        if (date.isBefore(食事費用切替.H1504.getDate())) {
//            ShokanShikyuTorokuShomeishoShokujiMeisaiH1503Div h1503div = shokujiMeisai
//                    .getShokanShikyuTorokuShomeishoShokujiMeisaiH1503();
//            ServiceTeikyoShomeishoShokujiListH1503Div shokujiH1503List = shokujiList
//                    .getShokanShikyuTorokuShomeishoShokujiListInfoH1503();
//            DataGrid<dgServiceTeikyoShomeishoShokujiListH1503_Row> dgRow = shokujiH1503List
//                    .getDgServiceTeikyoShomeishoShokujiListH1503();
//            List<dgServiceTeikyoShomeishoShokujiListH1503_Row> dgRowList = dgRow.getDataSource();
//            dgServiceTeikyoShomeishoShokujiListH1503_Row itemH1503 = create食事費用一覧H1503アイテム(
//                    h1503div.getTxtShokujihiKihonNissu().getValue().toString(),
//                    h1503div.getTxtShokujihiKihonTanka().getValue().toString(),
//                    h1503div.getTxtShokujihiKihonKingaku().getValue().toString(),
//                    h1503div.getTxtShokujihiTokubetsuNissu().getValue().toString(),
//                    h1503div.getTxtShokujihiTokubetsuTanka().getValue().toString(),
//                    h1503div.getTxtShokujihiTokubetsuKingaku().getValue().toString(),
//                    h1503div.getTxtShokujihiNobeNissu().getValue().toString(),
//                    h1503div.getTxtShokujihiFutanNichigaku().getValue().toString(),
//                    h1503div.getTxtShokujihiTeikyoGokei().getValue().toString(),
//                    h1503div.getTxtShokujihiFutanGetsugaku().getValue().toString(),
//                    h1503div.getTxtShokujihiSeikyugaku().getValue().toString());
//            if (index == -1) {
//                itemH1503.setRowState(RowState.Added);
//                dgRowList.add(itemH1503);
//            } else {
//                itemH1503.setRowState(RowState.Modified);
//                dgRowList.remove(index);
//                dgRowList.add(index, itemH1503);
//            }
//            dgRow.setDataSource(dgRowList);
//        } else {
//            ShokanShikyuTorokuShomeishoShokujiMeisaiH1504Div h1504div = shokujiMeisai
//                    .getShokanShikyuTorokuShomeishoShokujiMeisaiH1504();
//            ServiceTeikyoShomeishoShokujiListDiv shokujiH1504List = shokujiList
//                    .getShokanShikyuTorokuShomeishoShokujiListInfo();
//            DataGrid<dgServiceTeikyoShomeishoShokujiList_Row> dgRow = shokujiH1504List
//                    .getDgServiceTeikyoShomeishoShokujiList();
//            List<dgServiceTeikyoShomeishoShokujiList_Row> dgRowList = dgRow.getDataSource();
//            dgServiceTeikyoShomeishoShokujiList_Row itemH1504 = create食事費用一覧H1504アイテム(
//                    h1504div.getTxtShokujihiShuruiCode().getValue().toString().
//                    concat(h1504div.getTxtShokujihiServiceCode().getValue().toString()).concat(":").
//                    concat(h1504div.getTxtShokujihiServiceName().getValue().toString()),
//                    h1504div.getTxtShokujihiTanisu().getValue().toString(),
//                    h1504div.getTxtShokujihiNissuKaisu().getValue().toString(),
//                    h1504div.getTxtShokujihiKingaku().getValue().toString());
//            if (index == -1) {
//                itemH1504.setRowState(RowState.Added);
//                dgRowList.add(itemH1504);
//            } else {
//                itemH1504.setRowState(RowState.Modified);
//                dgRowList.remove(index);
//                dgRowList.add(index, itemH1504);
//            }
//            dgRow.setDataSource(dgRowList);
//        }
//        set食事費用合計(panel);
//    }
//
//    private void set食事費用合計(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoShokujiDiv shokuji = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoShokuji();
//        ServiceTeikyoShomeishoShokujiListDiv shokujiH1504List = shokuji
//                .getShokanShikyuTorokuShomeishoShokujiList().getShokanShikyuTorokuShomeishoShokujiListInfo();
//        ShokanShikyuTorokuShomeishoShokujiGokeiDiv shokujiGokei = shokuji
//                .getShokanShikyuTorokuShomeishoShokujiList().getShokanShikyuTorokuShomeishoShokujiGokei();
//        Integer nobeNissu = 0;
//        Integer futanNichigaku;
//        Integer futanGetsugaku;
//        Integer teikyoGokei = 0;
//        Integer seikyuGokei;
//
//        for (dgServiceTeikyoShomeishoShokujiList_Row item : shokujiH1504List
//                .getDgServiceTeikyoShomeishoShokujiList().getDataSource()) {
//            nobeNissu = nobeNissu + Integer.parseInt(item.getTxtNissuKaisu().toString());
//            teikyoGokei = teikyoGokei + Integer.parseInt(item.getTxtKingaku().toString());
//        }
//        futanNichigaku = 760;
//        futanGetsugaku = nobeNissu * futanNichigaku;
//        seikyuGokei = teikyoGokei - futanGetsugaku;
//
//        shokujiGokei.getTxtGokeiNobeNissu().setValue(new Decimal(nobeNissu));
//        shokujiGokei.getTxtGokeiFutanNichigaku().setValue(new Decimal(futanNichigaku));
//        shokujiGokei.getTxtGokeiFutanGetsugaku().setValue(new Decimal(futanGetsugaku));
//        shokujiGokei.getTxtGokeiTeikyoGokei().setValue(new Decimal(teikyoGokei));
//        shokujiGokei.getTxtGokeiSeikyugaku().setValue(new Decimal(seikyuGokei));
//    }
//
//    private dgServiceTeikyoShomeishoShokujiListH1503_Row create食事費用一覧H1503アイテム(
//            String txtKihonNissu,
//            String txtKihonTanka,
//            String txtKihonKingaku,
//            String txtTokubetsuNissu,
//            String txtTokubetsuTanka,
//            String txtTokubetsuKingaku,
//            String txtNobeNissu,
//            String txtTeikyohiGokei,
//            String txtNichigaku,
//            String txtGetsugaku,
//            String txtSeikyugaku) {
//        Button btnSelect = new Button();
//        Button btnEdit = new Button();
//        Button btnDelete = new Button();
//        return new dgServiceTeikyoShomeishoShokujiListH1503_Row(
//                btnSelect,
//                btnEdit,
//                btnDelete,
//                new RString(txtKihonNissu),
//                new RString(txtKihonTanka),
//                new RString(txtKihonKingaku),
//                new RString(txtTokubetsuNissu),
//                new RString(txtTokubetsuTanka),
//                new RString(txtTokubetsuKingaku),
//                new RString(txtNobeNissu),
//                new RString(txtTeikyohiGokei),
//                new RString(txtNichigaku),
//                new RString(txtGetsugaku),
//                new RString(txtSeikyugaku));
//    }
//
//    private dgServiceTeikyoShomeishoShokujiList_Row create食事費用一覧H1504アイテム(
//            String txtService,
//            String txtTanisu,
//            String txtNissuKaisu,
//            String txtKingaku
//    ) {
//        Button btnSelect = new Button();
//        Button btnEdit = new Button();
//        Button btnDelete = new Button();
//
//        return new dgServiceTeikyoShomeishoShokujiList_Row(
//                btnSelect,
//                btnEdit,
//                btnDelete,
//                new RString(txtService),
//                new RString(txtTanisu),
//                new RString(txtNissuKaisu),
//                new RString(txtKingaku));
//    }
//    // !!!!!!!!!!!!!!!!!!!!!!↑↑ここまで食事費用タブに関連するコード↑↑!!!!!!!!!!!!!!!!!!!!!!!!!!!
// 南魚沼市のデモ向けに、基本情報」「給付費明細」「請求額集計」「社福系減額」以外のタブの機能をコメントアウト。
//    // !!!!!!!!!!!!!!!!!!!!!!↓↓ここから計画費タブに関連するコード↓↓!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    private enum 計画費切替 {
//
//        H2103(20090331),
//        H2104(20090401);
//        private final RDate date;
//
//        private 計画費切替(int dateString) {
//            this.date = new RDate(dateString);
//        }
//
//        public RDate getDate() {
//            return date;
//        }
//    }
//
//    /**
//     * サービス提供証明書情報の計画費タブで明細情報を追加するボタンを押下したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onClickAddKeikakuMeisai(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        setKeikakuMeisaiData(panel, イベント.追加);
//        showKeikaku(panel, 一覧明細表示.明細表示);
//        response.data = panel;
//        return response;
//    }
//
//    /**
//     * サービス提供証明書情報の計画費タブで、一覧から行を選択したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onSelectedKeikakuList(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        setKeikakuMeisaiData(panel, イベント.選択);
//        showKeikaku(panel, 一覧明細表示.明細表示);
//        response.data = panel;
//        return response;
//    }
//
//    /**
//     * サービス提供証明書情報の計画費タブで、一覧の行の削除ボタンを押下したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onClickKeikakuListDelete(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        deleteKeikakuListData(panel);
//        response.data = panel;
//        return response;
//    }
//
//    /**
//     * サービス提供証明書情報の計画費タブで入力内容を確定するボタンを押下したときの処理です。
//     *
//     * @param panel panel
//     * @return ResponseData
//     */
//    public ResponseData<ShokanShikyuTorokuShomeishoDiv> onClickKeikakuKakutei(ShokanShikyuTorokuShomeishoDiv panel) {
//        ResponseData<ShokanShikyuTorokuShomeishoDiv> response = new ResponseData<>();
//
//        kakuteiKeikakuMeisaiData(panel);
//        initKeikakuMeisaiData(panel);
//        showKeikaku(panel, 一覧明細表示.一覧表示);
//        response.data = panel;
//        return response;
//    }
//
//    private void showKeikaku(ShokanShikyuTorokuShomeishoDiv panel, 一覧明細表示 show) {
//        ShokanShikyuTorokuShomeishoKeikakuDiv keikaku = panel
//                .getTabShokanShikyuTorokuShomeisho().getShokanShikyuTorokuShomeishoKeikaku();
//        ShokanShikyuTorokuShomeishoKeikakuH2103Div h2103Div = keikaku.getShokanShikyuTorokuShomeishoKeikakuH2103();
//        ShokanShikyuTorokuShomeishoKeikakuH2104Div h2104Div = keikaku.getShokanShikyuTorokuShomeishoKeikakuH2104();
//        RDate date = panel.getTxtShomeishoTeikyoYM().getValue();
//        if (date.isBefore(計画費切替.H2104.getDate())) {
//            h2103Div.setVisible(true);
//            h2103Div.setDisplayNone(false);
//            h2104Div.setVisible(false);
//            h2104Div.setDisplayNone(true);
//        } else {
//            h2103Div.setVisible(false);
//            h2103Div.setDisplayNone(true);
//            h2104Div.setVisible(true);
//            h2104Div.setDisplayNone(false);
//            if (show.equals(一覧明細表示.一覧表示)) {
//                h2104Div.getShokanShikyuTorokuShomeishoKeikakuList().setIsOpen(true);
//                h2104Div.getShokanShikyuTorokuShomeishoKeikakuMeisai().setIsOpen(false);
//            } else if (show.equals(一覧明細表示.明細表示)) {
//                h2104Div.getShokanShikyuTorokuShomeishoKeikakuList().setIsOpen(false);
//                h2104Div.getShokanShikyuTorokuShomeishoKeikakuMeisai().setIsOpen(true);
//            }
//        }
//    }
//
//    private void setKeikakuData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoKeikakuDiv keikaku = panel
//                .getTabShokanShikyuTorokuShomeisho().getShokanShikyuTorokuShomeishoKeikaku();
//        ShokanShikyuTorokuShomeishoKeikakuH2103Div keikakuH2103 = keikaku
//                .getShokanShikyuTorokuShomeishoKeikakuH2103();
//        ShokanShikyuTorokuShomeishoKeikakuH2104Div keikakuH2104 = keikaku
//                .getShokanShikyuTorokuShomeishoKeikakuH2104();
//        ShokanShikyuTorokuShomeishoKeikakuListDiv keikakuH2104List = keikakuH2104
//                .getShokanShikyuTorokuShomeishoKeikakuList();
//        ServiceTeikyoShomeishoKeikakuListDiv keikakuH2104ListList = keikakuH2104List
//                .getShokanShikyuTorokuShomeishoKeikakuListInfo();
//
//        DataGrid<dgShokanShikyuTorokuShomeishoKeikakuList_Row> dgRowH2104 = keikakuH2104ListList
//                .getDgShokanShikyuTorokuShomeishoKeikakuList();
//        List<dgShokanShikyuTorokuShomeishoKeikakuList_Row> dgRowListH2104 = dgRowH2104.getDataSource();
//
//        List<HashMap> sourceList = getShokanShikyuTorokuShomeishoYaml();
//        RDate date = panel.getTxtShomeishoTeikyoYM().getValue();
//        if (date.isBefore(計画費切替.H2104.getDate())) {
//            keikakuH2103.getRadKeikakuhiShinsaHohoH2103().setSelectedItem(new RString("key0"));
//            HashMap source = sourceList.get(31);
//            keikakuH2103.getTxtKeikakuhiTodokedeYMDH2103().setValue(new RDate(source.get("届出日").toString()));
//            keikakuH2103.getTxtKeikakuhiShuruiCodeH2103().setValue(new RString(source.get("サービス種類コード").toString()));
//            keikakuH2103.getTxtKeikakuhiServiceCodeH2103().setValue(new RString(source.get("サービスコード").toString()));
//            keikakuH2103.getTxtKeikakuhiServiceNameH2103().setValue(new RString(source.get("サービス名称").toString()));
//            keikakuH2103.getTxtKeikakuhiTanisuH2103().setValue(new Decimal(source.get("単位数").toString()));
//            keikakuH2103.getTxtKeikakuhiTanisuTankaH2103().setValue(new Decimal(source.get("単位数単価").toString()));
//            keikakuH2103.getTxtKeikakuhiSeikyuKingakuH2103().setValue(new Decimal(source.get("請求金額").toString()));
//            keikakuH2103.getTxtKeikakuhiSenmoninNoH2103().setValue(new RString(source.get("担当介護支援専門員番号").toString()));
//            keikakuH2103.getTxtKeikakuhiTekiyoH2103().setValue(new RString(source.get("摘要").toString()));
//        } else {
//            HashMap source = sourceList.get(32);
//            keikakuH2104List.getRadKeikakuhiShinsaHohoH2104().setSelectedItem(new RString("key0"));
//            keikakuH2104List.getTxtKeikakuhiTodokedeYMDH2104().setValue(new RDate(source.get("届出日").toString()));
//            keikakuH2104List.getTxtKeikakuhiSenmoninNoH2104().setValue(new RString(source.get("担当介護支援専門員番号").toString()));
//            keikakuH2104List.getTxtKeikakuhiTanisuTankaH2104().setValue(new Decimal(source.get("単位数単価").toString()));
//            keikakuH2104List.getTxtKeikakuhiGokeiTanisu().setValue(new Decimal(source.get("合計単位数").toString()));
//            keikakuH2104List.getTxtKeikakuhiSeikyuKingakuH2104().setValue(new Decimal(source.get("請求金額").toString()));
//            dgRowListH2104.clear();
//            for (int i = 33; i < 36; i++) {
//                dgRowListH2104.add(create計画費一覧H2104アイテム(
//                        sourceList.get(i).get("サービス").toString(),
//                        sourceList.get(i).get("単位数").toString(),
//                        sourceList.get(i).get("回数").toString(),
//                        sourceList.get(i).get("サービス単位数").toString(),
//                        sourceList.get(i).get("摘要").toString()
//                ));
//            }
//            dgRowH2104.setDataSource(dgRowListH2104);
//        }
//    }
//
//    private void deleteKeikakuListData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoKeikakuH2104Div keikakuH2104 = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoKeikaku().getShokanShikyuTorokuShomeishoKeikakuH2104();
//        ServiceTeikyoShomeishoKeikakuListDiv keikakuH2104List = keikakuH2104
//                .getShokanShikyuTorokuShomeishoKeikakuList().getShokanShikyuTorokuShomeishoKeikakuListInfo();
//
//        DataGrid<dgShokanShikyuTorokuShomeishoKeikakuList_Row> dgRowH2104 = keikakuH2104List
//                .getDgShokanShikyuTorokuShomeishoKeikakuList();
//        List<dgShokanShikyuTorokuShomeishoKeikakuList_Row> dgRowListH2104 = dgRowH2104.getDataSource();
//
//        int index = dgRowH2104.getClickedRowId();
//
//        dgShokanShikyuTorokuShomeishoKeikakuList_Row item = dgRowH2104.getClickedItem();
//        item.setRowState(RowState.Deleted);
//        dgRowListH2104.remove(index);
//        dgRowListH2104.add(index, item);
//        dgRowH2104.setDataSource(dgRowListH2104);
//    }
//
//    private void setKeikakuMeisaiData(ShokanShikyuTorokuShomeishoDiv panel, イベント event) {
//        ShokanShikyuTorokuShomeishoKeikakuH2104Div keikakuH2104 = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoKeikaku().getShokanShikyuTorokuShomeishoKeikakuH2104();
//        ShokanShikyuTorokuShomeishoKeikakuMeisaiDiv keikakuH2104Meisai = keikakuH2104.getShokanShikyuTorokuShomeishoKeikakuMeisai();
//        if (event.equals(イベント.追加)) {
//            keikakuH2104Meisai.getTxtKeikakuSelectedIndex().setValue(new RString("-1"));
//        } else {
//            int index = keikakuH2104.getShokanShikyuTorokuShomeishoKeikakuList()
//                    .getShokanShikyuTorokuShomeishoKeikakuListInfo().getDgShokanShikyuTorokuShomeishoKeikakuList().getActiveRowId();
//            keikakuH2104Meisai.getTxtKeikakuSelectedIndex().setValue(new RString(String.valueOf(index)));
//        }
//        RDate date = panel.getTxtShomeishoTeikyoYM().getValue();
//        if (計画費切替.H2103.getDate().isBefore(date)) {
//            HashMap source = getShokanShikyuTorokuShomeishoYamlId(36);
//            keikakuH2104Meisai.getTxtKeikakuhiShuruiCodeH2104().setValue(new RString(source.get("サービス種類コード").toString()));
//            keikakuH2104Meisai.getTxtKeikakuhiServiceCodeH2104().setValue(new RString(source.get("サービスコード").toString()));
//            keikakuH2104Meisai.getTxtKeikakuhiServiceNameH2104().setValue(new RString(source.get("サービス名称").toString()));
//            keikakuH2104Meisai.getTxtKeikakuhiTanisuH2104().setValue(new Decimal(source.get("単位数").toString()));
//            keikakuH2104Meisai.getTxtKeikakuhiKaisu().setValue(new Decimal(source.get("回数").toString()));
//            keikakuH2104Meisai.getTxtKeikakuhiServiceTanisu().setValue(new Decimal(source.get("サービス単位数").toString()));
//            keikakuH2104Meisai.getTxtKeikakuhiTekiyoH2104().setValue(new RString(source.get("摘要").toString()));
//        }
//    }
//
//    private void initKeikakuMeisaiData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoKeikakuH2104Div keikakuH2104 = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoKeikaku().getShokanShikyuTorokuShomeishoKeikakuH2104();
//        ShokanShikyuTorokuShomeishoKeikakuMeisaiDiv keikakuH2104Meisai = keikakuH2104
//                .getShokanShikyuTorokuShomeishoKeikakuMeisai();
//        keikakuH2104Meisai.getTxtKeikakuSelectedIndex().setValue(new RString("-1"));
//        keikakuH2104Meisai.getTxtKeikakuhiShuruiCodeH2104().clearValue();
//        keikakuH2104Meisai.getTxtKeikakuhiServiceCodeH2104().clearValue();
//        keikakuH2104Meisai.getTxtKeikakuhiServiceNameH2104().clearValue();
//        keikakuH2104Meisai.getTxtKeikakuhiTanisuH2104().clearValue();
//        keikakuH2104Meisai.getTxtKeikakuhiKaisu().clearValue();
//        keikakuH2104Meisai.getTxtKeikakuhiServiceTanisu().clearValue();
//        keikakuH2104Meisai.getTxtKeikakuhiTekiyoH2104().clearValue();
//    }
//
//    private void kakuteiKeikakuMeisaiData(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoKeikakuH2104Div keikakuH2104 = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoKeikaku().getShokanShikyuTorokuShomeishoKeikakuH2104();
//        ServiceTeikyoShomeishoKeikakuListDiv keikakuH2104List = keikakuH2104
//                .getShokanShikyuTorokuShomeishoKeikakuList().getShokanShikyuTorokuShomeishoKeikakuListInfo();
//        ShokanShikyuTorokuShomeishoKeikakuMeisaiDiv keikakuH2104Meisai = keikakuH2104.getShokanShikyuTorokuShomeishoKeikakuMeisai();
//        int index = Integer.parseInt(keikakuH2104Meisai.getTxtKeikakuSelectedIndex().getValue().toString());
//
//        DataGrid<dgShokanShikyuTorokuShomeishoKeikakuList_Row> dgRow = keikakuH2104List
//                .getDgShokanShikyuTorokuShomeishoKeikakuList();
//        List<dgShokanShikyuTorokuShomeishoKeikakuList_Row> dgRowList = dgRow.getDataSource();
//        dgShokanShikyuTorokuShomeishoKeikakuList_Row itemH2104 = create計画費一覧H2104アイテム(
//                keikakuH2104Meisai.getTxtKeikakuhiShuruiCodeH2104().getValue().toString().
//                concat(keikakuH2104Meisai.getTxtKeikakuhiServiceCodeH2104().getValue().toString()).concat(":").
//                concat(keikakuH2104Meisai.getTxtKeikakuhiServiceNameH2104().getValue().toString()),
//                keikakuH2104Meisai.getTxtKeikakuhiTanisuH2104().getValue().toString(),
//                keikakuH2104Meisai.getTxtKeikakuhiKaisu().getValue().toString(),
//                keikakuH2104Meisai.getTxtKeikakuhiServiceTanisu().getValue().toString(),
//                keikakuH2104Meisai.getTxtKeikakuhiTekiyoH2104().getValue().toString());
//        if (index == -1) {
//            itemH2104.setRowState(RowState.Added);
//            dgRowList.add(itemH2104);
//        } else {
//            itemH2104.setRowState(RowState.Modified);
//            dgRowList.remove(index);
//            dgRowList.add(index, itemH2104);
//        }
//        dgRow.setDataSource(dgRowList);
//        set計画費合計(panel);
//    }
//
//    private void set計画費合計(ShokanShikyuTorokuShomeishoDiv panel) {
//        ShokanShikyuTorokuShomeishoKeikakuDiv keikaku = panel.getTabShokanShikyuTorokuShomeisho()
//                .getShokanShikyuTorokuShomeishoKeikaku();
//        ShokanShikyuTorokuShomeishoKeikakuH2104Div keikakuH2104 = keikaku
//                .getShokanShikyuTorokuShomeishoKeikakuH2104();
//        ShokanShikyuTorokuShomeishoKeikakuListDiv keikakuH2104List = keikakuH2104
//                .getShokanShikyuTorokuShomeishoKeikakuList();
//        ServiceTeikyoShomeishoKeikakuListDiv keikakuH2104ListList = keikakuH2104List
//                .getShokanShikyuTorokuShomeishoKeikakuListInfo();
//
//        Integer gokei = 0;
//        Integer seikyu = 0;
//        for (dgShokanShikyuTorokuShomeishoKeikakuList_Row item : keikakuH2104ListList
//                .getDgShokanShikyuTorokuShomeishoKeikakuList().getDataSource()) {
//            gokei = gokei + Integer.parseInt(item.getTxtTanisu().toString());
//            seikyu = seikyu + Integer.parseInt(item.getTxtServiceTanisu().toString());
//        }
//        keikakuH2104List.getTxtKeikakuhiGokeiTanisu().setValue(new Decimal(gokei));
//        keikakuH2104List.getTxtKeikakuhiSeikyuKingakuH2104().setValue(new Decimal(seikyu));
//    }
//
//    private dgShokanShikyuTorokuShomeishoKeikakuList_Row create計画費一覧H2104アイテム(
//            String txtService,
//            String txtTanisu,
//            String txtKaisu,
//            String txtServiceTanisu,
//            String txtTekiyo
//    ) {
//        Button btnSelect = new Button();
//        Button btnEdit = new Button();
//        Button btnDelete = new Button();
//
//        return new dgShokanShikyuTorokuShomeishoKeikakuList_Row(
//                btnSelect,
//                btnEdit,
//                btnDelete,
//                new RString(txtService),
//                new RString(txtTanisu),
//                new RString(txtKaisu),
//                new RString(txtServiceTanisu),
//                new RString(txtTekiyo));
//    }
//    // !!!!!!!!!!!!!!!!!!!!!!↑↑ここまで計画費タブに関連するコード↑↑!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // !!!!!!!!!!!!!!!!!!!!!!↓↓ここから請求額集計タブに関連するコード↓↓!!!!!!!!!!!!!!!!!!!!!!!!!!!
}