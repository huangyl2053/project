package jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0600051;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBU0600051のイベント名定義クラスです</br>
 *
 * @author 自動生成
 */
public enum DBU0600051TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    再検索("再検索"),
    完了("完了"),
    総合照会資格情報("総合照会資格情報"),
    総合照会受給情報("総合照会受給情報"),
    総合照会給付情報("総合照会給付情報"),
    総合照会賦課情報("総合照会賦課情報");

    private final RString name;

    private DBU0600051TransitionEventName(String name) {
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