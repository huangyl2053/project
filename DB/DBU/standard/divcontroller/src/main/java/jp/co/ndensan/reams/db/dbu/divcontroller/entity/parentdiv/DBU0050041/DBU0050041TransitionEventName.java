package jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0050041;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBU0050041のイベント名定義クラスです</br>
 *
 * @author 自動生成
 */
public enum DBU0050041TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    様式４("様式４"),
    様式４の２("様式４の２"),
    検索に戻る("検索に戻る"),
    処理完了("処理完了");

    private final RString name;

    private DBU0050041TransitionEventName(String name) {
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