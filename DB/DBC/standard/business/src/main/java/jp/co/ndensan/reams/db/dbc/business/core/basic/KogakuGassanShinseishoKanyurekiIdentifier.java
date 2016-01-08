/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import java.io.Serializable;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Value;

/**
 * 高額合算申請書加入歴の識別子です。
 */
@Value
public class KogakuGassanShinseishoKanyurekiIdentifier implements Serializable {

    private final HihokenshaNo 被保険者番号;
    private final FlexibleYear 対象年度;
    private final HokenshaNo 保険者番号;
    private final RString 整理番号;
    private final RString 加入歴番号;
    private final int 履歴番号;

    /**
     * コンストラクタです。
     *
     * @param 被保険者番号 被保険者番号
     * @param 対象年度 対象年度
     * @param 保険者番号 保険者番号
     * @param 整理番号 整理番号
     * @param 加入歴番号 加入歴番号
     * @param 履歴番号 履歴番号
     */
    public KogakuGassanShinseishoKanyurekiIdentifier(HihokenshaNo 被保険者番号,
            FlexibleYear 対象年度,
            HokenshaNo 保険者番号,
            RString 整理番号,
            RString 加入歴番号,
            int 履歴番号) {
        this.被保険者番号 = 被保険者番号;
        this.対象年度 = 対象年度;
        this.保険者番号 = 保険者番号;
        this.整理番号 = 整理番号;
        this.加入歴番号 = 加入歴番号;
        this.履歴番号 = 履歴番号;
    }
}
