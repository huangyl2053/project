package jp.co.ndensan.reams.db.dbz.divcontroller.entity.parentdiv.DBZ0300001;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBZ0300001のイベント名定義クラスです</br>
 *
 * @author 自動生成
 */
public enum DBZ0300001TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    対象者特定("対象者特定"),
    再検索("再検索"),
    対象者特定1件("対象者特定1件");

    private final RString name;

    private DBZ0300001TransitionEventName(String name) {
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
