package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE2210003;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBE2210003のイベント名定義クラスです</br>
 *
 * @author 自動生成
 */
public enum DBE2210003TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    認定調査結果登録に戻る("認定調査結果登録に戻る"),
    認定調査結果登録_概況特記非表示に戻る("認定調査結果登録_概況特記非表示に戻る"),
    基本運用に戻る("基本運用に戻る");

    private final RString name;

    private DBE2210003TransitionEventName(String name) {
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
