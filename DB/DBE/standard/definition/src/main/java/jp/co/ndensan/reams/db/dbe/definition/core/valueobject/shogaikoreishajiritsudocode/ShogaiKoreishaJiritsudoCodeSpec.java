/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.core.valueobject.shogaikoreishajiritsudocode;

import jp.co.ndensan.reams.uz.uza.core.validation.IPredicate;

/**
 * ValueObjectの{@link ShogaiKoreishaJiritsudoCode}の仕様クラスです。
 */
public enum ShogaiKoreishaJiritsudoCodeSpec implements IPredicate<ShogaiKoreishaJiritsudoCode> {

    /**
     * コードがNullでないこと
     */
    コードがNullでないこと {

                /**
                 *
                 * @param shogaiKoreishaJiritsudoCode 障害高齢者自立度コード
                 * @return true：仕様を満たす、false：仕様を満たさない
                 */
                @Override
                public boolean apply(ShogaiKoreishaJiritsudoCode shogaiKoreishaJiritsudoCode) {
                    return true;
                }
            }
}
