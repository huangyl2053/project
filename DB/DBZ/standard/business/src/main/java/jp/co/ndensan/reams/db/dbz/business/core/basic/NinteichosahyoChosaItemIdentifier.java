/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.basic;

import java.io.Serializable;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ShinseishoKanriNo;

/**
 * 認定調査票_基本調査_調査項目の識別子です。
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@lombok.Value
public class NinteichosahyoChosaItemIdentifier implements Serializable {

    private final ShinseishoKanriNo 申請書管理番号;
    private final int 要介護認定調査履歴番号;
    private final int 連番;

    /**
     * コンストラクタです。
     *
     * @param 申請書管理番号 申請書管理番号
     * @param 要介護認定調査履歴番号 要介護認定調査履歴番号
     * @param 連番 連番
     */
    public NinteichosahyoChosaItemIdentifier(ShinseishoKanriNo 申請書管理番号,
            int 要介護認定調査履歴番号,
            int 連番) {
        this.申請書管理番号 = 申請書管理番号;
        this.要介護認定調査履歴番号 = 要介護認定調査履歴番号;
        this.連番 = 連番;
    }
}