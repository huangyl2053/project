package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB2710002;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IStateEnumerations;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBB2710002の状態名定義クラスです
 *
 * @author 自動生成
 */
public enum DBB2710002StateName implements IStateEnumerations {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    NoChange(""),
    特別徴収対象者一覧作成("特別徴収対象者一覧作成");

    private final RString name;

    private DBB2710002StateName(String name) {
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