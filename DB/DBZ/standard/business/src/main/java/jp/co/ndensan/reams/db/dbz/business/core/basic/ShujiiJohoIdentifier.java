/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.basic;

import java.io.Serializable;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ninteishinsei.ShujiiCode;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ninteishinsei.ShujiiIryokikanCode;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;

/**
 * 主治医情報の識別子です。
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@lombok.Value
public class ShujiiJohoIdentifier implements Serializable {

    private final LasdecCode 市町村コード;
    private final ShujiiIryokikanCode 主治医医療機関コード;
    private final ShujiiCode 主治医コード;

    /**
     * コンストラクタです。
     *
     * @param 市町村コード 市町村コード
     * @param 主治医医療機関コード 主治医医療機関コード
     * @param 主治医コード 主治医コード
     */
    public ShujiiJohoIdentifier(LasdecCode 市町村コード,
            ShujiiIryokikanCode 主治医医療機関コード,
            ShujiiCode 主治医コード) {
        this.市町村コード = 市町村コード;
        this.主治医医療機関コード = 主治医医療機関コード;
        this.主治医コード = 主治医コード;
    }
}