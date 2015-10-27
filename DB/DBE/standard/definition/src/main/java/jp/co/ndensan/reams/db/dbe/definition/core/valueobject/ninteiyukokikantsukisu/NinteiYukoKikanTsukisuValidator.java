/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.core.valueobject.ninteiyukokikantsukisu;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.core.validation.ValidateChain;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessages;

/**
 * {@link NinteiYukoKikanTsukisu}のバリデータークラスです。
 */
public class NinteiYukoKikanTsukisuValidator {

    private final NinteiYukoKikanTsukisu ninteiYukoKikanTsukisu;

    /**
     * コンストラクタです
     *
     * @param ninteiYukoKikanTsukisu 認定有効期間月数
     */
    public NinteiYukoKikanTsukisuValidator(NinteiYukoKikanTsukisu ninteiYukoKikanTsukisu) {
        requireNonNull(ninteiYukoKikanTsukisu, UrSystemErrorMessages.値がnull.getReplacedMessage("認定有効期間月数"));
        this.ninteiYukoKikanTsukisu = ninteiYukoKikanTsukisu;
    }

    /**
     * 保持するvalue{@link RString}について{@link NinteiYukoKikanTsukisu}の仕様を満たすかどうか検証し、<br/>
     * 結果として{@link IValidationMessages}を返します。
     *
     * @return {@link IValidationMessages}
     */
    public IValidationMessages validate() {
        return ValidateChain.validateStart(ninteiYukoKikanTsukisu)
                .messages();
    }
}