/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.business.core.futanwariai;

import java.io.Serializable;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import lombok.Value;

/**
 * 利用者負担割合世帯員の識別子です。
 */
@Value
@lombok.Getter
@SuppressWarnings("PMD.UnusedPrivateField")
public class RiyoshaFutanWariaiKonkyoIdentifier implements Serializable {

    private final FlexibleYear 年度;
    private final HihokenshaNo 被保険者番号;
    private final int 履歴番号;
    private final int 枝番号;
    private final HihokenshaNo 世帯員被保険者番号;

    /**
     * コンストラクタです。
     *
     * @param 年度 年度
     * @param 被保険者番号 被保険者番号
     * @param 履歴番号 履歴番号
     * @param 枝番号 枝番号
     * @param 世帯員被保険者番号 世帯員被保険者番号
     */
    public RiyoshaFutanWariaiKonkyoIdentifier(FlexibleYear 年度,
            HihokenshaNo 被保険者番号,
            int 履歴番号,
            int 枝番号,
            HihokenshaNo 世帯員被保険者番号) {
        this.年度 = 年度;
        this.被保険者番号 = 被保険者番号;
        this.履歴番号 = 履歴番号;
        this.枝番号 = 枝番号;
        this.世帯員被保険者番号 = 世帯員被保険者番号;
    }
}