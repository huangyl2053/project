package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB1140011;

import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBB1140011のイベント名定義クラスです</br>
 *
 * @reamsid_L DBB-1750-010 zhangrui
 */
public enum DBB1140011TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    所得照会状況一覧へ("所得照会状況一覧へ"),
    再検索("再検索"),
    完了("完了");

    private final RString name;

    private DBB1140011TransitionEventName(String name) {
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