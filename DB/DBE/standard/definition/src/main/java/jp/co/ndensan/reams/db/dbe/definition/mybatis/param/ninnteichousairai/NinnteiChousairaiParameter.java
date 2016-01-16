/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.mybatis.param.ninnteichousairai;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 要介護認定結果情報を特定するためのMyBatis用パラメータクラスです。
 */
@lombok.Getter
@SuppressWarnings("PMD.UnusedPrivateField")
public class NinnteiChousairaiParameter {

    private final ShoKisaiHokenshaNo shoKisaiHokenshaNo;
    private final RString shishoCode;
    private final boolean flag;

    private NinnteiChousairaiParameter(
            ShoKisaiHokenshaNo shoKisaiHokenshaNo,
            RString shishoCode,
            boolean flag) {

        this.shoKisaiHokenshaNo = shoKisaiHokenshaNo;
        this.shishoCode = shishoCode;
        this.flag = flag;
    }

    /**
     * 検索用のパラメータを生成します。
     *
     * @param shoKisaiHokenshaNo ShoKisaiHokenshaNo
     * @param shishoCode RString
     * @return 要介護認定結果情報検索パラメータ
     */
    public static NinnteiChousairaiParameter createSelectByKeyParam(
            ShoKisaiHokenshaNo shoKisaiHokenshaNo,
            RString shishoCode) {
        boolean flag = true;
        if (shishoCode == null || shishoCode.isEmpty()) {
            flag = false;
        }
        return new NinnteiChousairaiParameter(shoKisaiHokenshaNo, shishoCode, flag);
    }
}
