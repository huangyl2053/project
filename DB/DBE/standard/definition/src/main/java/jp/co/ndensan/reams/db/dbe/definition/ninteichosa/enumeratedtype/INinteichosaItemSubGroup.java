/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype;

import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 要介護認定調査の調査項目サブグループを扱うインターフェースです。
 *
 * @author N8156 宮本 康
 */
public interface INinteichosaItemSubGroup {

    /**
     * 調査項目サブグループの表示名称を返します。
     *
     * @return 表示名称
     */
    RString getName();
}
