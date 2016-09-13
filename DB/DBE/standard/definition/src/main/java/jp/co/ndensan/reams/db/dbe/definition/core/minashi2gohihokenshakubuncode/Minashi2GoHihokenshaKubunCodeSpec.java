/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.core.minashi2gohihokenshakubuncode;

import jp.co.ndensan.reams.uz.uza.core.validation.IPredicate;

/**
 * ValueObjectの{@link Minashi2GoHihokenshaKubunCode}の仕様クラスです。
 */
public enum Minashi2GoHihokenshaKubunCodeSpec implements IPredicate<Minashi2GoHihokenshaKubunCode> {

    /**
     * コードがNullでないこと。
     */
    コードがNullでないこと {

                /**
                 *
                 * @param minashi2GoHihokenshaKubunCode みなし2号者の被保険者区分
                 * @return true：仕様を満たす、false：仕様を満たさない
                 */
                @Override
                public boolean apply(Minashi2GoHihokenshaKubunCode minashi2GoHihokenshaKubunCode) {
                    return true;
                }
            }
}