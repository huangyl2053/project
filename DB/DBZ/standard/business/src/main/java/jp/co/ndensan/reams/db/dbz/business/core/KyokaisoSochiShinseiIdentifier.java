/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core;

import java.io.Serializable;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import lombok.Value;

/**
 * 境界層措置申請の識別子です。
 */
@Value
public class KyokaisoSochiShinseiIdentifier implements Serializable {

    private static final long serialVersionUID = -9167924161581162602L;
    private final HihokenshaNo 被保険者番号;
    private final int 履歴番号;
    private final int リンク番号;

    /**
     * コンストラクタです。
     *
     * @param 被保険者番号 被保険者番号
     * @param 履歴番号 履歴番号
     * @param リンク番号 リンク番号
     */
    public KyokaisoSochiShinseiIdentifier(HihokenshaNo 被保険者番号,
            int 履歴番号,
            int リンク番号) {
        this.被保険者番号 = 被保険者番号;
        this.履歴番号 = 履歴番号;
        this.リンク番号 = リンク番号;
    }

    /**
     * get被保険者番号
     *
     * @return 被保険者番号
     */
    public HihokenshaNo get被保険者番号() {
        return 被保険者番号;
    }

    /**
     * get履歴番号
     *
     * @return 履歴番号
     */
    public int get履歴番号() {
        return 履歴番号;
    }

    /**
     * getリンク番号
     *
     * @return リンク番号
     */
    public int getリンク番号() {
        return リンク番号;
    }
}
