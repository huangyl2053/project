/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.jushochitokureirirekilist.JushochiTokureiRirekiList;

import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 住所地特例共有子Divの状態を表します。ダイアログで開いた際に状態を指定する時などに使用します。
 *
 * @author n8178
 */
public enum JushochiTokureiState {

    /**
     * 照会モード
     */
    照会("照会"),
    /**
     * 登録モード
     */
    登録("登録");

    private final RString stateValue;

    private JushochiTokureiState(String value) {
        this.stateValue = new RString(value);
    }

    /**
     * 状態を示す文字列を返します。
     *
     * @return 詳細を示す文字列
     */
    public RString getStateValue() {
        return stateValue;
    }
}
