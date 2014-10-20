/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.hokensha;

import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 市町村名の印字方法の区分です。
 *
 * @author N3327 三浦 凌
 */
public enum ShichosonNamePrint {

    /**
     * 印字することを表します。
     */
    印字する("1"),
    /**
     * 印字しないことを表します。
     */
    印字しない("0");
    private final RString theCode;

    private ShichosonNamePrint(String code) {
        this.theCode = new RString(code);
    }

    /**
     * コードを返します。
     *
     * @return コード
     */
    public RString code() {
        return this.theCode;
    }
}
