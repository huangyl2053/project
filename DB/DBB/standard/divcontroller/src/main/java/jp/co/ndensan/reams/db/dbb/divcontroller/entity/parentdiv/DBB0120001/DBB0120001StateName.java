package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0120001;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IStateEnumerations;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBB0120001の状態名定義クラスです
 *
 * @author 自動生成
 */
public enum DBB0120001StateName implements IStateEnumerations {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    NoChange(""),
    平準化計算("平準化計算"),
    通知書一括発行("通知書一括発行");

    private final RString name;

    private DBB0120001StateName(String name) {
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
