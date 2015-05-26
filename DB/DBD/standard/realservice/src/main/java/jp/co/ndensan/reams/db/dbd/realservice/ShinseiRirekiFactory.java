/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.realservice;

import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;

/**
 * {@link IShinseiRirekiManager}を生成するクラスです。
 *
 * @author n8223　朴義一
 */
public final class ShinseiRirekiFactory {

    private ShinseiRirekiFactory() {
    }

    /**
     * 業務コード{@code SubGyomuCode}で{@link IShinseiRirekiManager}を生成します。
     *
     * @param subGyomuCode サブ業務コード
     * @return {@link IShinseiRirekiManager}
     */
    public static IShinseiRirekiManager getInstance(SubGyomuCode subGyomuCode) {

        if (subGyomuCode.equals(SubGyomuCode.DBD介護受給)) {
            return new HokenshaShinseiRirekiManager();
        }
        return new HokenshaShinseiRirekiManager();

    }

}
