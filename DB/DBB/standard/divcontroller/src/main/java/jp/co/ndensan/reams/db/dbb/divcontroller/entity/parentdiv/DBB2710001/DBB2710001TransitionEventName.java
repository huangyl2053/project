package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB2710001;

import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBB2710001のイベント名定義クラスです</br>
 *
 * @reamsid_L DBB-1850-010 zhangrui
 */
public enum DBB2710001TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    完了("完了"),
    単一市町村("単一市町村"),
    広域保険者("広域保険者");

    private final RString name;

    private DBB2710001TransitionEventName(String name) {
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
