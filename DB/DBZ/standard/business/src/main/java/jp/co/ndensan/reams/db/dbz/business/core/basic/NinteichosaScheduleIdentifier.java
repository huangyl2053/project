/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.basic;

import java.io.Serializable;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 認定調査スケジュール情報の識別子です。
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@lombok.Value
public class NinteichosaScheduleIdentifier implements Serializable {

    private final FlexibleDate 認定調査予定年月日;
    private final RString 認定調査予定開始時間;
    private final RString 認定調査予定終了時間;
    private final Code 認定調査時間枠;
    private final RString 認定調査委託先コード;
    private final RString 認定調査員コード;

    /**
     * コンストラクタです。
     *
     * @param 認定調査予定年月日 認定調査予定年月日
     * @param 認定調査予定開始時間 認定調査予定開始時間
     * @param 認定調査予定終了時間 認定調査予定終了時間
     * @param 認定調査時間枠 認定調査時間枠
     * @param 認定調査委託先コード 認定調査委託先コード
     * @param 認定調査員コード 認定調査員コード
     */
    public NinteichosaScheduleIdentifier(FlexibleDate 認定調査予定年月日,
            RString 認定調査予定開始時間,
            RString 認定調査予定終了時間,
            Code 認定調査時間枠,
            RString 認定調査委託先コード,
            RString 認定調査員コード) {
        this.認定調査予定年月日 = 認定調査予定年月日;
        this.認定調査予定開始時間 = 認定調査予定開始時間;
        this.認定調査予定終了時間 = 認定調査予定終了時間;
        this.認定調査時間枠 = 認定調査時間枠;
        this.認定調査委託先コード = 認定調査委託先コード;
        this.認定調査員コード = 認定調査員コード;
    }
}
