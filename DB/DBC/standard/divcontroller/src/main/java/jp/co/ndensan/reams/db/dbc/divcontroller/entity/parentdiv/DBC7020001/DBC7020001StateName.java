package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC7020001;

import jp.co.ndensan.reams.uz.uza.core.ui.response.IStateEnumerations;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBC7020001の状態名定義クラスです
 *
 * @reamsid_L DBC-3092-010 sunhui
 */
public enum DBC7020001StateName implements IStateEnumerations {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    NoChange(""),
    高額サービス費状況("高額サービス費状況");

    private final RString name;

    private DBC7020001StateName(String name) {
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