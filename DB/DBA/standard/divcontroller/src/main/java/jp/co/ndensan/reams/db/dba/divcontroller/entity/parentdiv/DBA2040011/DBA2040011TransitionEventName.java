package jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA2040011;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBA2040011のイベント名定義クラスです</br>
 *
 * @author 自動生成
 */
public enum DBA2040011TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    再検索("再検索"),
    完了("完了"),
    検索に戻る("検索に戻る"),
    通知書発行画面に遷移("通知書発行画面に遷移");

    private final RString name;

    private DBA2040011TransitionEventName(String name) {
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
