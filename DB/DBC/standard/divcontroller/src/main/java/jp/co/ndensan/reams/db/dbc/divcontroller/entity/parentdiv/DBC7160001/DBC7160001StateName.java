package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC7160001;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IStateEnumerations;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBC7160001の状態名定義クラスです
 *
 * @author 自動生成
 */
public enum DBC7160001StateName implements IStateEnumerations {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    NoChange(""),
    高額合算計算結果連絡票情報("高額合算計算結果連絡票情報");

    private final RString name;

    private DBC7160001StateName(String name) {
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