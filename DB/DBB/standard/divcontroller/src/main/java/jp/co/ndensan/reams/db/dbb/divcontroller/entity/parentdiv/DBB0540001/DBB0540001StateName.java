package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0540001;

import jp.co.ndensan.reams.uz.uza.core.ui.response.IStateEnumerations;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBB0540001の状態名定義クラスです
 *
 * @reamsid_L DBB-1760-010 sunhui
 */
public enum DBB0540001StateName implements IStateEnumerations {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    NoChange(""),
    徴収方法変更("徴収方法変更"),
    完了状態("完了状態");

    private final RString name;

    private DBB0540001StateName(String name) {
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