package jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0020071;

import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBU0020071のイベント名定義クラスです</br>
 *
 * @reamsid_L DBU-1100-090 lijunjun
 */
public enum DBU0020071TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    補正発行検索に戻る("補正発行検索に戻る"),
    完了("完了");

    private final RString name;

    private DBU0020071TransitionEventName(String name) {
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
