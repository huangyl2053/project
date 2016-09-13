/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.core.ninteichosajisshibashokubuncode;

import static jp.co.ndensan.reams.db.dbz.definition.message.MessageCreateHelper.toCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.message.ErrorMessage;
import jp.co.ndensan.reams.uz.uza.message.IMessageGettable;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessage;
import jp.co.ndensan.reams.uz.uza.message.Message;

/**
 *
 * {@link NinteichosaJisshibashoKubunCode}のバリデーションメッセージです。
 */
public enum NinteichosaJisshibashoKubunCodeValidationMessage implements IValidationMessage {

    /**
     * コードがNullであること。
     */
    コードがNullであること(NinteichosaJisshibashoKubunCodeErrorMessage.コードがNullであること);
    private final Message message;

    private NinteichosaJisshibashoKubunCodeValidationMessage(IMessageGettable message, String... replacements) {
        this.message = message.getMessage().replace(replacements);
    }

    @Override
    public Message getMessage() {
        return message;
    }

    /**
     * {@link NinteichosaJisshibashoKubunCode}のErroroMessageです。
     */
    public enum NinteichosaJisshibashoKubunCodeErrorMessage implements IMessageGettable {

        /**
         * コードがNullであること。
         */
        コードがNullであること(1, "実施場所区分コードを指定してください。");
        private final int no;
        private final RString message;

        private NinteichosaJisshibashoKubunCodeErrorMessage(int no, String message) {
            this.no = no;
            this.message = new RString(message);
        }

        @Override
        public Message getMessage() {
            return new ErrorMessage(toCode("NinteichosaJisshibashoKubunCodeError", no), this.message.toString());
        }
    }
}