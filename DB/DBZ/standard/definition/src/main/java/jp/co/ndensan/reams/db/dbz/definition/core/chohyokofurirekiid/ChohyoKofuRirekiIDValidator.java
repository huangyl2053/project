/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.definition.core.chohyokofurirekiid;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.core.validation.ValidateChain;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessages;

/**
 * {@link ChohyoKofuRirekiID}のバリデータークラスです。
 */
public class ChohyoKofuRirekiIDValidator {

    private final ChohyoKofuRirekiID chohyoKofuRirekiID;

    /**
     * コンストラクタです。
     *
     * @param chohyoKofuRirekiID 帳票交付履歴ID
     */
    public ChohyoKofuRirekiIDValidator(ChohyoKofuRirekiID chohyoKofuRirekiID) {
        requireNonNull(chohyoKofuRirekiID, UrSystemErrorMessages.値がnull.getReplacedMessage(""));
        this.chohyoKofuRirekiID = chohyoKofuRirekiID;
    }

    /**
     * 保持するvalue{@link RString}について{@link ChohyoKofuRirekiID}の仕様を満たすかどうか検証し、<br/>
     * 結果として{@link IValidationMessages}を返します。
     *
     * @return {@link IValidationMessages}
     */
    public IValidationMessages validate() {
        return ValidateChain.validateStart(chohyoKofuRirekiID)
                .messages();
    }
}