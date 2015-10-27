/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.core.valueobject.gogitaichokubuncode;

import static jp.co.ndensan.reams.uz.uza.batch.parameter.message._BatchMessageUtil.toCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.message.ErrorMessage;
import jp.co.ndensan.reams.uz.uza.message.IMessageGettable;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessage;
import jp.co.ndensan.reams.uz.uza.message.Message;

/**
 *
 * {@link GogitaichoKubunCode}のバリデーションメッセージです。
 */
public enum GogitaichoKubunCodeValidationMessage implements IValidationMessage {

    コードがNullであること(GogitaichoKubunCodeErrorMessage.コードがNullであること);
    private final Message message;

    private GogitaichoKubunCodeValidationMessage(IMessageGettable message, String... replacements) {
        this.message = message.getMessage().replace(replacements);
    }

    @Override
    public Message getMessage() {
        return message;
    }

    /**
     * {@link GogitaichoKubunCode}のErroroMessageです。
     */
    public enum GogitaichoKubunCodeErrorMessage implements IMessageGettable {

        コードがNullであること(1, "合議体長区分コードを指定してください。");
        private final int no;
        private final RString message;

        private GogitaichoKubunCodeErrorMessage(int no, String message) {
            this.no = no;
            this.message = new RString(message);
        }

        @Override
        public Message getMessage() {
            return new ErrorMessage(toCode("GogitaichoKubunCodeError", no), this.message.toString());
        }
    }
}