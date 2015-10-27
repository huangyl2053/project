/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.divcontroller.controller.parentdiv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbe.divcontroller.controller.demodata.ChosainData;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.dbe2010001.NinteichosaIraiListDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.dbe2010001.dgNinteichosaIraiList_Row;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.ControlGenerator;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.YamlLoader;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.YamlUtil;
import jp.co.ndensan.reams.db.dbz.divcontroller.util.DataGridUtil;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.DataGrid;
import jp.co.ndensan.reams.uz.uza.ui.servlets.CommonButtonHolder;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 * NinteichosaIraiListDuvを操作するためのクラスです。
 *
 * @author N3327 三浦 凌
 */
public class NinteichosaIraiList {

    /**
     * ロード時の処理です。
     *
     * @param div NinteichosaIraiListDiv
     * @return ResponseData
     */
    public ResponseData<NinteichosaIraiListDiv> onLoad(NinteichosaIraiListDiv div) {
        ResponseData<NinteichosaIraiListDiv> response = new ResponseData<>();

        DataGrid<dgNinteichosaIraiList_Row> dataGrid = div.getDgNinteichosaIraiList();
        List<dgNinteichosaIraiList_Row> dataSource = new DemoData().get調査依頼対象者();
        sortByHihokenshaNo(dataSource);
        dataGrid.setDataSource(dataSource);
        NinteichosaIraiListHolder.saveNinteichosaIraiList(Collections.EMPTY_LIST);

        response.data = div;
        return response;
    }

    /**
     * 復帰時の処理です。
     *
     * @param div NinteichosaIraiListDiv
     * @return ResponseData
     */
    public ResponseData<NinteichosaIraiListDiv> onRetrun(NinteichosaIraiListDiv div) {
        ResponseData<NinteichosaIraiListDiv> response = new ResponseData<>();

        DataGrid<dgNinteichosaIraiList_Row> dataGrid = div.getDgNinteichosaIraiList();
        List<dgNinteichosaIraiList_Row> list = new ArrayList<>(DataGridUtil.unselectedItems(dataGrid));
        list.addAll(NinteichosaIraiListHolder.getNinteichosaIraiList());
        NinteichosaIraiListHolder.saveNinteichosaIraiList(Collections.EMPTY_LIST);
        sortByHihokenshaNo(list);
        dataGrid.setDataSource(list);
        setDisableOrNot_btnComplete(list);

        response.data = div;
        return response;
    }

    private void setDisableOrNot_btnComplete(List list) {
        setDisabled_btnToComplete(true);
        for (Object obj : list) {
            if (has調査依頼日(obj)) {
                setDisabled_btnToComplete(false);
                return;
            }
        }
    }

    private boolean has調査依頼日(Object obj) {
        if (obj.getClass() == dgNinteichosaIraiList_Row.class) {
            return !isEmpty(((dgNinteichosaIraiList_Row) obj).get調査依頼日().getValue());
        } else if (obj.getClass() == LinkedHashMap.class) {
            try {
                RString dateString
                        = new RString(this.<LinkedHashMap<String, String>>toLinkedHashMap(obj).get("調査依頼日").get("value"));
                return dateString.length() != 0;
            } catch (ClassCastException e) {
                return false;
            }
        }
        return false;
    }

    private boolean isEmpty(FlexibleDate date) {
        return date == null || date.isEmpty();
    }

    private <T> LinkedHashMap<String, T> toLinkedHashMap(Object obj) {
        return (LinkedHashMap<String, T>) obj;
    }

    private void setDisabled_btnToComplete(boolean disabled) {
        CommonButtonHolder.setDisabledByCommonButtonFieldName(new RString("btnToComplete"), disabled);
    }

    private void sortByHihokenshaNo(List<dgNinteichosaIraiList_Row> list) {
        Collections.sort(list, createHihokenshaNoComparator());
    }

    private Comparator<Object> createHihokenshaNoComparator() {
        return new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return toRString(o1).compareTo(toRString(o2));
            }

            private RString toRString(Object obj) {
                if (obj.getClass() == dgNinteichosaIraiList_Row.class) {
                    return extractHihokenshaNo((dgNinteichosaIraiList_Row) obj);
                } else if (obj.getClass() == LinkedHashMap.class) {
                    /* dgNinteichosaIraiList_Row のつもりが、
                     * なぜかViewStateからとってくるとLinkedHashMapになるため....
                     */
                    return extractHihokenshaNo((LinkedHashMap) obj);
                } else {
                    return RString.EMPTY;
                }
            }

            private RString extractHihokenshaNo(dgNinteichosaIraiList_Row row) {
                return row.get被保険者番号();
            }

            private RString extractHihokenshaNo(LinkedHashMap map) {
                return new RString((String) map.get("被保険者番号"));
            }

        };
    }

    /**
     * btnToEntry1押下時の処理です。
     *
     * @param div NinteichosaIraiListDiv
     * @return ResponseData
     */
    public ResponseData<NinteichosaIraiListDiv> onClick_btnToEntryChosaIrai(NinteichosaIraiListDiv div) {
        ResponseData<NinteichosaIraiListDiv> response = new ResponseData<>();
        CommonButtonHolder.setDisabledByCommonButtonFieldName(new RString("btnToComplete"), false);
        response.data = div;
        return response;
    }

    /**
     * btnToComplete押下時の処理です。
     *
     * @param div NinteichosaIraiListDiv
     * @return ResponseData
     */
    public ResponseData<NinteichosaIraiListDiv> onClick_btnToComplete(NinteichosaIraiListDiv div) {
        ResponseData<NinteichosaIraiListDiv> response = new ResponseData<>();

        DataGrid<dgNinteichosaIraiList_Row> grid = div.getDgNinteichosaIraiList();

        List<dgNinteichosaIraiList_Row> list = new ArrayList<>();
        for (dgNinteichosaIraiList_Row selectedItem : grid.getSelectedItems()) {
            if (has調査依頼日(selectedItem)) {
                selectedItem.get調査依頼完了日().setValue(FlexibleDate.getNowDate());
            }
            list.add(selectedItem);
        }
        list.addAll(DataGridUtil.unselectedItems(grid));
        sortByHihokenshaNo(list);
        grid.setDataSource(list);

        response.data = div;
        return response;

    }

    /**
     * 認定調査依頼対象者を保持します。
     */
    static final class NinteichosaIraiListHolder {

        private static final RString SELECTED = new RString("認定調査依頼対象者");

        /**
         * 認定調査依頼対象者を保存します。
         *
         * @param list 認定調査依頼対象者
         */
        static void saveNinteichosaIraiList(List<dgNinteichosaIraiList_Row> list) {
            ViewStateHolder.put(SELECTED.toString(), list);
        }

        /**
         * 認定調査依頼対象者を取得します。
         *
         * @return 認定調査依頼対象者
         */
        static List<dgNinteichosaIraiList_Row> getNinteichosaIraiList() {
            List<dgNinteichosaIraiList_Row> dataSource
                    = (List<dgNinteichosaIraiList_Row>) ViewStateHolder.get(SELECTED.toString(), List.class);
            return _isNull(dataSource) ? Collections.EMPTY_LIST : dataSource;
        }

        private static boolean _isNull(Object obj) {
            return obj == null;
        }

    }

    /**
     * 調査依頼対象のデモ用データを持ちます。
     */
    //<editor-fold defaultstate="collapsed" desc="Demodata">
    private static final class DemoData {

        private final List<dgNinteichosaIraiList_Row> chosaIraiTargets;

        /**
         * デモデータを生成します。
         */
        DemoData() {
            this.chosaIraiTargets = _createList();
        }

        /**
         * 調査依頼対象者を取得します。
         *
         * @return 調査依頼対象者
         */
        List<dgNinteichosaIraiList_Row> get調査依頼対象者() {
            return this.chosaIraiTargets;
        }

        private List<dgNinteichosaIraiList_Row> _createList() {
            List<HashMap> dataFromYaml = YamlLoader.DBE.loadAsList(new RString("dbeuc21000/ChosaIraiTargets.yml"));
            return YamlUtil.convertList(dataFromYaml, _createConverter());
        }

        private YamlUtil.Converter.IConverter<dgNinteichosaIraiList_Row> _createConverter() {
            return new YamlUtil.Converter.IConverter<dgNinteichosaIraiList_Row>() {

                @Override
                public dgNinteichosaIraiList_Row exec(Map map) {
                    return _toDgNinteichosaIraiList_Row(map);
                }
            };
        }

        private dgNinteichosaIraiList_Row _toDgNinteichosaIraiList_Row(Map map) {
            ControlGenerator cg = new ControlGenerator(map);
            RString shimei = cg.getAsRString("氏名");
            RString kanaShimei = cg.getAsRString("カナ氏名");
            RString iraiDate = cg.getAsRString("依頼完了日");
            boolean is依頼済 = !iraiDate.equals(RString.EMPTY);
            RString iraishoHakkoDate = cg.getAsRString("依頼書発行日");
            boolean is依頼書発行済 = !iraishoHakkoDate.equals(RString.EMPTY);
            ChosainData.Chosain currentChosain = new ChosainData().get調査員From(cg.getAsRString("調査員番号"));
            ChosainData.Chosain latestChosain = new ChosainData().get調査員From(cg.getAsRString("前回調査員番号"));
            return new dgNinteichosaIraiList_Row(
                    cg.getAsRString("保険者番号"),
                    cg.getAsRString("市町村"),
                    cg.getAsRString("市著コード"),
                    cg.getAsRString("支所"),
                    cg.getAsRString("被保番号"),
                    cg.getAsRString("識別コード"),
                    shimei, kanaShimei,
                    DataGridUtil.lineFeedBetween(kanaShimei, shimei),
                    cg.getAsTextBoxFlexibleDate("認定申請日"),
                    cg.getAsRString("認定申請区分"),
                    cg.getAsRString("申請書管理番号"),
                    cg.getAsRString("地区"),
                    cg.getAsTextBoxFlexibleDate("調査依頼日"),
                    cg.getAsTextBoxFlexibleDate("依頼書発行日"),
                    cg.getAsTextBoxFlexibleDate("依頼完了日"),
                    cg.getAsTextBoxFlexibleDate("調査期限日"),
                    cg.getAsRString("調査依頼区分"),
                    cg.getAsRString("調査回数"),
                    cg.getAsRString("認定調査履歴番号"),
                    currentChosain.itakusaki().code(),
                    currentChosain.itakusaki().name(),
                    currentChosain.code(),
                    currentChosain.name(),
                    latestChosain.itakusaki().code(),
                    latestChosain.itakusaki().name(),
                    latestChosain.code(),
                    latestChosain.name(),
                    cg.getAsRString("審査会開催地区コード"),
                    cg.getAsRString("審査会開催地区"),
                    cg.getAsTextBoxFlexibleDate("督促日"),
                    cg.getAsRString("督促方法"),
                    cg.getAsRString("督促回数"),
                    cg.getAsTextBoxFlexibleDate("督促期限"),
                    cg.getAsTextBoxFlexibleDate("督促発行日"),
                    cg.getAsRString("郵便番号"),
                    cg.getAsRString("住所"),
                    cg.getAsRString("入所施設"),
                    cg.getAsRString("性別"),
                    cg.getAsTextBoxFlexibleDate("生年月日"),
                    cg.getAsRString("データ出力"),
                    is依頼済, is依頼書発行済);
        }
    }
//</editor-fold>
}