package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0320005;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBB0320005のイベント名定義クラスです</br>
 *
 * @author 自動生成
 */
public enum DBB0320005TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    履歴一覧("履歴一覧"),
    初期化("初期化"),
    検索に戻る("検索に戻る");

    private final RString name;

    private DBB0320005TransitionEventName(String name) {
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