package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE0120001;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBE0120001のイベント名定義クラスです</br>
 *
 * @author 自動生成
 */
public enum DBE0120001TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    一覧に戻る("一覧に戻る"),
    対象者選択("対象者選択");

    private final RString name;

    private DBE0120001TransitionEventName(String name) {
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