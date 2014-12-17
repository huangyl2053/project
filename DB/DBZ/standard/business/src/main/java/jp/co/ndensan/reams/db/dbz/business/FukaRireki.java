/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.TsuchishoNo;
import jp.co.ndensan.reams.db.dbz.model.FukaModel;
import jp.co.ndensan.reams.db.dbz.model.FukaModelComparators;
import jp.co.ndensan.reams.db.dbz.model.util.itemlist.IItemList;
import jp.co.ndensan.reams.db.dbz.model.util.itemlist.ItemList;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import static java.util.Objects.requireNonNull;

/**
 * 賦課履歴を扱うクラスです。
 *
 * @author N8156 宮本 康
 */
public class FukaRireki {

    private final List<FukaModel> 賦課履歴明細;

    /**
     * コンストラクタです。
     *
     * @param 賦課履歴明細 賦課履歴明細
     * @throws NullPointerException 引数がnullの場合
     */
    public FukaRireki(List<FukaModel> 賦課履歴明細) throws NullPointerException {
        this.賦課履歴明細 = requireNonNull(賦課履歴明細, UrSystemErrorMessages.値がnull.getReplacedMessage("賦課履歴明細"));
    }

    /**
     * 全賦課履歴を返します。
     *
     * @return 全賦課履歴
     */
    public IItemList<FukaModel> get全賦課履歴() {
        Map<RString, FukaModel> map = new HashMap<>();
        for (FukaModel model : 賦課履歴明細) {
            RString key = getKey(model);
            FukaModel value = map.get(key);
            if (value == null || value.get処理日時().isBefore(model.get処理日時())) {
                map.put(key, model);
            }
        }
        return sort((List) Arrays.asList(map.values().toArray()));
    }

    /**
     * 全賦課履歴明細を返します。
     *
     * @return 全賦課履歴明細
     */
    public IItemList<FukaModel> get賦課履歴明細() {
        return sort(賦課履歴明細);
    }

    /**
     * 条件に該当する賦課履歴明細を返します。
     *
     * @param 賦課年度 賦課年度
     * @param 調定年度 調定年度
     * @param 通知書番号 通知書番号
     * @return 賦課履歴明細
     */
    public IItemList<FukaModel> get賦課履歴明細(FlexibleYear 賦課年度, FlexibleYear 調定年度, TsuchishoNo 通知書番号) {
        List<FukaModel> list = new ArrayList<>();
        for (FukaModel model : 賦課履歴明細) {
            if (model.get賦課年度().equals(賦課年度) && model.get調定年度().equals(調定年度) && model.get通知書番号().equals(通知書番号)) {
                list.add(model);
            }
        }
        return ItemList.of(list);
    }

    private RString getKey(FukaModel model) {
        return new RStringBuilder(model.get賦課年度().toDateString())
                .append(model.get調定年度().toDateString())
                .append(model.get通知書番号()).toRString();
    }

    private IItemList<FukaModel> sort(List<FukaModel> list) {
        return ItemList.of(list)
                .sorted(FukaModelComparators.orderBy通知書番号.desc())
                .sorted(FukaModelComparators.orderBy調定年度.desc())
                .sorted(FukaModelComparators.orderBy賦課年度.desc());
    }
}
