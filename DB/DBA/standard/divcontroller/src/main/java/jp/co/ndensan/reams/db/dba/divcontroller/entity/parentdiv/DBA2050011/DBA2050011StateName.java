package jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA2050011;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IStateEnumerations;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBA2050011の状態名定義クラスです
 *
 * @author 自動生成
 */
public enum DBA2050011StateName implements IStateEnumerations {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    NoChange(""),
    照会適用("照会適用"),
    照会解除("照会解除"),
    照会変更("照会変更"),
    追加適用("追加適用"),
    追加解除("追加解除"),
    追加変更("追加変更"),
    完了適用("完了適用"),
    完了解除("完了解除"),
    完了変更("完了変更");

    private final RString name;

    private DBA2050011StateName(String name) {
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