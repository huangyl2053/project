/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.definition.core.entity;

import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 他市町村のデータアクセスクラスです。
 *
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class Tasichoson {

    private FlexibleDate kaishiYMD;
    private FlexibleDate shuryoYMD;
    private FlexibleDate idoYMD;
    private RString edaNo;

    /**
     * コンストラクタです。
     *
     * @param kaishiYMD 開始日
     * @param shuryoYMD 終了日
     * @param idoYMD 異動日
     * @param edaNo 枝番
     */
    public Tasichoson(FlexibleDate kaishiYMD, FlexibleDate shuryoYMD, FlexibleDate idoYMD, RString edaNo) {
        this.kaishiYMD = kaishiYMD;
        this.shuryoYMD = shuryoYMD;
        this.idoYMD = idoYMD;
        this.edaNo = edaNo;
    }
}
