package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0540001;

import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBB0540001のイベント名定義クラスです</br>
 *
 * @reamsid_L DBB-1760-010 sunhui
 */
public enum DBB0540001TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    検索結果一覧へ("検索結果一覧へ"),
    再検索する("再検索する"),
    完了("完了");

    private final RString name;

    private DBB0540001TransitionEventName(String name) {
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