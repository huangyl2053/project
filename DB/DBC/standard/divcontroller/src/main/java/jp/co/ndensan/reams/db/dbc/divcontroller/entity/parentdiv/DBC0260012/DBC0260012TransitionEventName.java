package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0260012;

import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBC0260012のイベント名定義クラスです</br>
 *
 * @reamsid_L DBC-1951-020 wangkanglei
 */
public enum DBC0260012TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    完了("完了"),
    再検索("再検索"),
    検索結果一覧("検索結果一覧");

    private final RString name;

    private DBC0260012TransitionEventName(String name) {
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