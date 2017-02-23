/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.hokenshalist.HokenshaList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import jp.co.ndensan.reams.db.dbx.business.core.hokenshalist.HokenshaSummary;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.GyomuBunrui;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.HokenshaDDLPattem;
import jp.co.ndensan.reams.db.dbx.definition.core.util.Comparators;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.db.dbz.service.core.hokenshalist.HokenshaListLoader;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.ui.binding.KeyValueDataSource;
import jp.co.ndensan.reams.uz.uza.ui.session.PanelSessionAccessor;

/**
 * HokenshaListDivを扱います。 関連するデータの取得やパネル内のデータ保持等を担当します。
 */
public class HokenshaListDivHandler {

    private static final RString ALL_SHICHOSON_KEY = new RString("000000");
    private static final RString ALL_SHICHOSON_VALUE = new RString("全市町村");

    private final HokenshaListDiv div;

    protected HokenshaListDivHandler(HokenshaListDiv div) {
        this.div = div;
    }

    /**
     * 保険者のリストを取得して、取得結果が持つ市町村名をddlHokenshaListへ市町村コードの昇順で設定します。
     * また、共有子Div内に、取得した保険者のリストを保持します。
     */
    void loadAndHoldHokenshaList(GyomuBunrui 業務分類) {
        List<HokenshaSummary> hokenshaList = getHokenshaList(業務分類);

        List<KeyValueDataSource> list = new ArrayList<>();

        if (1 < hokenshaList.size()) {
            list.add(new KeyValueDataSource(ALL_SHICHOSON_KEY, ALL_SHICHOSON_VALUE));
        }
        createMaping(hokenshaList, list);
    }

    /**
     * 保険者のリストを取得して、取得結果が持つ市町村名をddlHokenshaListへ市町村コードの昇順で設定します。
     * また、共有子Div内に、取得した保険者のリストを保持します。
     */
    void loadAndHoldHokenshaList(GyomuBunrui 業務分類, HokenshaDDLPattem 保険者パターン) {
        List<HokenshaSummary> hokenshaList = getHokenshaList(業務分類);

        List<KeyValueDataSource> list = new ArrayList<>();

        List<HokenshaSummary> chokenshaList = new ArrayList<>();
        if (1 < hokenshaList.size()) {
            for (HokenshaSummary s : hokenshaList) {
                if (!HokenshaDDLPattem.全市町村以外.equals(保険者パターン)) {
                    if (s.get保険者区分().getコード().equals(保険者パターン.code())) {
                        chokenshaList.add(s);
                    }
                } else {
                    chokenshaList.add(s);
                }
            }
            createMaping(chokenshaList, list);
        } else {
            createMaping(hokenshaList, list);
        }
    }

    /**
     * 保険者のリストを取得して、取得結果が持つ市町村名をddlHokenshaListへ市町村コードの昇順で設定します。
     * また、共有子Div内に、取得した保険者のリストを保持します。
     */
    void loadAndHoldHokenshaList(GyomuBunrui 業務分類, RString 証記載保険者番号) {
        List<HokenshaSummary> hokenshaList = getHokenshaList(業務分類);

        List<KeyValueDataSource> list = new ArrayList<>();

        List<HokenshaSummary> chokenshaList = new ArrayList<>();
        if (1 < hokenshaList.size()) {
            for (HokenshaSummary s : hokenshaList) {
                if (s.get証記載保険者番号().value().equals(証記載保険者番号)) {
                    chokenshaList.add(s);
                }
            }
            createMaping(chokenshaList, list);
        } else {
            createMaping(hokenshaList, list);
        }
    }

    private List<HokenshaSummary> getHokenshaList(GyomuBunrui 業務分類) {
        List<HokenshaSummary> hokenshaList = new ArrayList<>(
                HokenshaListLoader.createInstance()
                .getShichosonCodeNameList(業務分類)
                .getAll()
        );
        hokenshaList.removeAll(Collections.singleton(null));

        Collections.sort(hokenshaList, new Comparator<HokenshaSummary>() {
            @Override
            public int compare(HokenshaSummary o1, HokenshaSummary o2) {
                return Objects.compare(o1.get市町村コード(), o2.get市町村コード(),
                        Comparators.<LasdecCode>naturalOrder());
            }
        });
        return hokenshaList;
    }

    private void createMaping(List<HokenshaSummary> hokenshaList, List<KeyValueDataSource> list) {
        Map<RString, HokenshaSummary> map = new HashMap<>();
        for (HokenshaSummary s : hokenshaList) {
            RString key = new RString(UUID.randomUUID().toString());
            list.add(new KeyValueDataSource(key, create表示名(s)));
            map.put(key, s);
        }

        div.getDdlHokenshaList().setDataSource(list);
        ShichosonListHolder.putTo(div, map);
    }

    /**
     * 指定の市町村コードに該当する要素を保持する場合、その市町村をDDLの選択値とします。
     *
     * @param lasdecCode 市町村コード
     */
    void setSelectedShichsonIfExist(LasdecCode lasdecCode) {
        if (!ShichosonListHolder.hasShichosonList(div)) {
            return;
        }
        if (lasdecCode == null) {
            return;
        }
        for (Map.Entry<RString, HokenshaSummary> entry : ShichosonListHolder.getFrom(div).entrySet()) {
            if (Objects.equals(entry.getValue().get市町村コード(), lasdecCode)) {
                div.getDdlHokenshaList().setSelectedKey(entry.getKey());
            }
        }
    }

    /**
     * 指定の証記載保険者番号に該当する要素を保持する場合、その市町村をDDLの選択値とします。
     *
     * @param 証記載保険者番号 証記載保険者番号
     */
    void setSelectedShoKisaiHokenshaNoIfExist(ShoKisaiHokenshaNo 証記載保険者番号) {
        if (!ShichosonListHolder.hasShichosonList(div)) {
            return;
        }
        if (証記載保険者番号 == null) {
            return;
        }
        for (Map.Entry<RString, HokenshaSummary> entry : ShichosonListHolder.getFrom(div).entrySet()) {
            if (Objects.equals(entry.getValue().get証記載保険者番号(), 証記載保険者番号)) {
                div.getDdlHokenshaList().setSelectedKey(entry.getKey());
            }
        }
    }

    private RString create表示名(HokenshaSummary s) {
        return new RStringBuilder()
                .append(s.get証記載保険者番号().value())
                .append(RString.HALF_SPACE)
                .append(s.get市町村名称())
                .toRString();
    }

    /**
     * ddlHokenshaListで選択されている市町村名に該当する保険者の情報を{@link HokenshaSummary}の形で返却します。
     *
     * @return 選択中の保険者の情報を持つ{@link HokenshaSummary}.
     * 選択中の物が無い場合、{@link HokenshaSummary#EMPTY}
     */
    public HokenshaSummary getSelectedItemAsHokenshaSummary() {
        if (!ShichosonListHolder.hasShichosonList(div)) {
            throw new IllegalStateException("divに対して保険者情報が初期化されていません。そのため、指定の情報は取得できません。");
        }
        Map<RString, HokenshaSummary> map = ShichosonListHolder.getFrom(div);
        RString selectedKey = this.div.getDdlHokenshaList().getSelectedKey();
        if (ALL_SHICHOSON_KEY.equals(selectedKey)) {
            return HokenshaSummary.EMPTY;
        }
        if (map.containsKey(selectedKey)) {
            return map.get(selectedKey);
        }
        throw new IllegalStateException("保険者情報が正しく設定されていません。");
    }

    private static class ShichosonListHolder {

        private static final RString KEY;

        static {
            KEY = new RString("市町村リスト");
        }

        private static Map<RString, HokenshaSummary> getFrom(HokenshaListDiv div) {
            return Collections.unmodifiableMap(PanelSessionAccessor.get(div, KEY, Map.class));
        }

        private static void putTo(HokenshaListDiv div, Map<RString, HokenshaSummary> map) {
            PanelSessionAccessor.put(div, KEY, new HashMap<>(map));
        }

        private static boolean hasShichosonList(HokenshaListDiv div) {
            return PanelSessionAccessor.containsKey(div, KEY);
        }

        private ShichosonListHolder() {
        }
    }
}
