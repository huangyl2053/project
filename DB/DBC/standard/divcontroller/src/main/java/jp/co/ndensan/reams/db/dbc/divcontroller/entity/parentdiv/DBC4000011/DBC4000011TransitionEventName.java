package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC4000011;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBC4000011のイベント名定義クラスです</br>
 *
 * @author 自動生成
 */
public enum DBC4000011TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    処理完了("処理完了");

    private final RString name;

    private DBC4000011TransitionEventName(String name) {
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
