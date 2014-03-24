/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype;

import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 回答項目を扱うインターフェースです。
 *
 * @author N8156 宮本 康
 */
public interface IAnsweringItem {

    /**
     * 回答項目の値を返します。
     *
     * @return 値
     */
    RString getValue();

    /**
     * 回答項目の名称を返します。
     *
     * @return 名称
     */
    RString getName();
}