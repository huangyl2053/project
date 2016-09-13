package jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0020041;

import jp.co.ndensan.reams.uz.uza.core.ui.response.IStateEnumerations;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBU0020041の状態名定義クラスです
 *
 * @reamsid_L DBU-1100-040 yebangqiang
 */
public enum DBU0020041StateName implements IStateEnumerations {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    NoChange(""),
    修正状態1("修正状態1"),
    修正状態2("修正状態2"),
    削除状態3("削除状態3"),
    削除状態4("削除状態4"),
    完了状態("完了状態");

    private final RString name;

    private DBU0020041StateName(String name) {
        this.name = new RString(name);
    }

    /**
     * getName
     *
     * @return 名前
     */
    @Override
    public RString getName() {
        return name;
    }
// </editor-fold>
}