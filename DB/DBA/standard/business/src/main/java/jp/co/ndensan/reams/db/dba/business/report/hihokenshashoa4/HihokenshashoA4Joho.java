/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.co.ndensan.reams.db.dba.business.report.hihokenshashoa4;

import lombok.Getter;

/**
 * 介護保険被保険者証作成_帳票クラスパラメータクラスです。
 * 
 * @reamsid_L DBU-0490-070  suguangjun
 */
@Getter
@SuppressWarnings("PMD.UnusedPrivateField")
public class HihokenshashoA4Joho {
    
    private final HihokenshashoA4BodyItem bodyItem;
    
    /**
     * コンストラクタを作成します。
     * @param bodyItem 介護保険被保険者証情報
     */
    public HihokenshashoA4Joho(HihokenshashoA4BodyItem bodyItem) {
        this.bodyItem = bodyItem;
    }
}
