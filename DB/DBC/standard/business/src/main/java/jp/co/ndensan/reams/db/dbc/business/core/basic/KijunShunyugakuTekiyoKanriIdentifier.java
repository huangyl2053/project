/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import java.io.Serializable;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.uz.uza.biz.SetaiCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import lombok.Value;

/**
 * 基準収入額適用管理の識別子です。
 */
@Value
public class KijunShunyugakuTekiyoKanriIdentifier implements Serializable {

    private final SetaiCode 世帯コード;
    private final FlexibleYear 年度;
    private final int 履歴番号;
    private final HihokenshaNo 被保険者番号;

    /**
     * コンストラクタです。
     *
     * @param 世帯コード 世帯コード
     * @param 年度 年度
     * @param 履歴番号 履歴番号
     * @param 被保険者番号 被保険者番号
     */
    public KijunShunyugakuTekiyoKanriIdentifier(SetaiCode 世帯コード,
            FlexibleYear 年度,
            int 履歴番号,
            HihokenshaNo 被保険者番号) {
        this.世帯コード = 世帯コード;
        this.年度 = 年度;
        this.履歴番号 = 履歴番号;
        this.被保険者番号 = 被保険者番号;
    }
}
