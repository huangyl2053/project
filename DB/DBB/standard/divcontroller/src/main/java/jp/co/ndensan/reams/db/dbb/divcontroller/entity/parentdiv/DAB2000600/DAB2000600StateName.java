package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DAB2000600;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IStateEnumerations;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DAB2000600の状態名定義クラスです
 *
 * @author 自動生成
 */
public enum DAB2000600StateName implements IStateEnumerations {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    NoChange(""),
    初期状態("初期状態"),
    所得照会票印字内容修正("所得照会票印字内容修正"),
    所得照会票発行("所得照会票発行");

    private final RString name;

    private DAB2000600StateName(String name) {
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