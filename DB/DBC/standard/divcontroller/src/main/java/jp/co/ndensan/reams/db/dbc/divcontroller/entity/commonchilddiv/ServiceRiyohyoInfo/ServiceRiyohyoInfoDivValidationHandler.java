/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.entity.commonchilddiv.ServiceRiyohyoInfo;

import java.util.List;
import jp.co.ndensan.reams.db.dbc.definition.message.DbcErrorMessages;
import jp.co.ndensan.reams.db.dbx.business.core.kaigojigyosha.kaigojigyoshashiteiservice.KaigoJigyoshaShiteiService;
import jp.co.ndensan.reams.db.dbx.definition.core.serviceshurui.ServiceCategoryShurui;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbx.service.core.kaigojigyosha.kaigojigyoshashiteiservice.KaigoJigyoshaShiteiServiceManager;
import jp.co.ndensan.reams.ua.uax.divcontroller.controller.testdriver.TestJukiAtenaValidation.ValidationDictionary;
import jp.co.ndensan.reams.ua.uax.divcontroller.controller.testdriver.TestJukiAtenaValidation.ValidationDictionaryBuilder;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.message.IMessageGettable;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessage;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessages;
import jp.co.ndensan.reams.uz.uza.message.Message;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPair;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;

/**
 * サービス利用票情報のValidationHandlerです。
 *
 * @reamsid_L DBC-1930-050 cuilin
 */
public class ServiceRiyohyoInfoDivValidationHandler {

    private final ServiceRiyohyoInfoDiv div;

    /**
     * コンストラクタです。
     *
     * @param div {@link ServiceRiyohyoInfoDiv}
     */
    public ServiceRiyohyoInfoDivValidationHandler(ServiceRiyohyoInfoDiv div) {
        this.div = div;
    }

    /**
     * 明細計算チェックです。
     *
     * @return {@link ValidationMessageControlPairs}
     */
    public ValidationMessageControlPairs validate明細計算() {
        IValidationMessages message = new ServiceRiyohyoInfoDivValidator(div).validate明細計算();
        return create明細計算Dictionary().check(message);
    }

    private ValidationDictionary create明細計算Dictionary() {
        return new ValidationDictionaryBuilder()
//                .add(ServiceRiyohyoInfoDivValidationMessage.事業者必須項目)
                .add(ServiceRiyohyoInfoDivValidationMessage.サービスコード必須項目)
                .add(ServiceRiyohyoInfoDivValidationMessage.単位必須項目, div.getServiceRiyohyoBeppyoMeisai().getTxtTani())
                .add(ServiceRiyohyoInfoDivValidationMessage.回数必須項目, div.getServiceRiyohyoBeppyoMeisai().getTxtKaisu()).build();
    }
    
    /**
     * 利用年月必須入力のチェックです。
     *
     * @return {@link ValidationMessageControlPairs}
     */
    public ValidationMessageControlPairs validate利用年月必須入力() {
        IValidationMessages message = new ServiceRiyohyoInfoDivValidator(div).validate利用年月必須入力();
        return create利用年月必須入力Dictionary().check(message);
    }

    private ValidationDictionary create利用年月必須入力Dictionary() {
        return new ValidationDictionaryBuilder()
                .add(ServiceRiyohyoInfoDivValidationMessage.利用年月必須項目, div.getTxtRiyoYM()).build();
    }
    
    /**
     * 事業者必須入力のチェックです。
     *
     * @return {@link ValidationMessageControlPairs}
     */
    public ValidationMessageControlPairs validate事業者必須入力() {
        IValidationMessages message = new ServiceRiyohyoInfoDivValidator(div).validate事業者必須入力();
        return create事業者必須入力Dictionary().check(message);
    }

    private ValidationDictionary create事業者必須入力Dictionary() {
        return new ValidationDictionaryBuilder().add(ServiceRiyohyoInfoDivValidationMessage.事業者必須項目).build();
    }

    /**
     * 割引適用後率のチェックです。
     *
     * @return {@link ValidationMessageControlPairs}
     */
    public ValidationMessageControlPairs validate割引適用後率() {
        IValidationMessages message = new ServiceRiyohyoInfoDivValidator(div).validate割引適用後率();
        return create割引適用後率Dictionary().check(message);
    }

    private ValidationDictionary create割引適用後率Dictionary() {
        return new ValidationDictionaryBuilder()
                .add(ServiceRiyohyoInfoDivValidationMessage.割引適用後率入力値が不正チェック,
                        div.getServiceRiyohyoBeppyoMeisai().getTxtWaribikigoRitsu()).build();
    }

    /**
     * 回数のチェックです。
     *
     * @return {@link ValidationMessageControlPairs}
     */
    public ValidationMessageControlPairs validate回数() {
        IValidationMessages message = new ServiceRiyohyoInfoDivValidator(div).validate回数();
        return create回数Dictionary().check(message);
    }

    private ValidationDictionary create回数Dictionary() {
        return new ValidationDictionaryBuilder()
                .add(ServiceRiyohyoInfoDivValidationMessage.回数入力値が不正,
                        div.getServiceRiyohyoBeppyoMeisai().getTxtKaisu()).build();
    }

    /**
     * 単位数単価のチェックです。
     *
     * @return {@link ValidationMessageControlPairs}
     */
    public ValidationMessageControlPairs validate単位数単価() {
        IValidationMessages message = new ServiceRiyohyoInfoDivValidator(div).validate単位数単価();
        return create単位数単価Dictionary().check(message);
    }

    private ValidationDictionary create単位数単価Dictionary() {
        return new ValidationDictionaryBuilder()
                .add(ServiceRiyohyoInfoDivValidationMessage.単位数単価入力値が不正,
                        div.getServiceRiyohyoBeppyoGokei().getTxtTanisuTanka()).build();
    }

    /**
     * 給付率のチェックです。
     *
     * @return {@link ValidationMessageControlPairs}
     */
    public ValidationMessageControlPairs validate給付率() {
        IValidationMessages message = new ServiceRiyohyoInfoDivValidator(div).validate給付率();
        return create給付率Dictionary().check(message);
    }

    private ValidationDictionary create給付率Dictionary() {
        return new ValidationDictionaryBuilder()
                .add(ServiceRiyohyoInfoDivValidationMessage.給付率入力値が不正,
                        div.getServiceRiyohyoBeppyoGokei().getTxtKyufuritsu()).build();
    }

    /**
     * サービス種類必須のチェックです。
     *
     * @return {@link ValidationMessageControlPairs}
     */
    public ValidationMessageControlPairs validateサービス種類必須() {
        IValidationMessages message = new ServiceRiyohyoInfoDivValidator(div).validateサービス種類必須();
        return createvalidateサービス種類必須Dictionary().check(message);
    }

    private ValidationDictionary createvalidateサービス種類必須Dictionary() {
        return new ValidationDictionaryBuilder()
                .add(ServiceRiyohyoInfoDivValidationMessage.サービス種類コード必須項目).build();
    }
    /**
     * サービス単位必須のチェックです。
     *
     * @return {@link ValidationMessageControlPairs}
     */
    public ValidationMessageControlPairs validateサービス単位必須() {
        IValidationMessages message = new ServiceRiyohyoInfoDivValidator(div).validateサービス単位必須();
        return createvalidateサービス単位必須Dictionary().check(message);
    }

    private ValidationDictionary createvalidateサービス単位必須Dictionary() {
        return new ValidationDictionaryBuilder()
                .add(ServiceRiyohyoInfoDivValidationMessage.サービス単位必須項目,
                        div.getServiceRiyohyoBeppyoMeisai().getTxtServiceTani()).build();
    }

    /**
     * サービス単位必須以外チェックです。
     *
     * @return {@link ValidationMessageControlPairs}
     */
    public ValidationMessageControlPairs validateサービス単位必須以外() {
        IValidationMessages message = new ServiceRiyohyoInfoDivValidator(div).validateサービス単位必須以外();
        return createサービス単位必須以外Dictionary().check(message);
    }

    private ValidationDictionary createサービス単位必須以外Dictionary() {
        return new ValidationDictionaryBuilder()
                .add(ServiceRiyohyoInfoDivValidationMessage.サービス種類コード必須項目)
                .add(ServiceRiyohyoInfoDivValidationMessage.単位必須項目, div.getServiceRiyohyoBeppyoMeisai().getTxtTani())
                .add(ServiceRiyohyoInfoDivValidationMessage.回数必須項目, div.getServiceRiyohyoBeppyoMeisai().getTxtKaisu())
                .add(ServiceRiyohyoInfoDivValidationMessage.単位数単価必須項目,
                        div.getServiceRiyohyoBeppyoGokei().getTxtTanisuTanka())
                .add(ServiceRiyohyoInfoDivValidationMessage.区分限度内単位必須項目,
                        div.getServiceRiyohyoBeppyoGokei().getTxtKubunGendonaiTani())
                .build();
    }

    /**
     * 給付率必須のチェックです。
     *
     * @return {@link ValidationMessageControlPairs}
     */
    public ValidationMessageControlPairs validate給付率必須() {
        IValidationMessages message = new ServiceRiyohyoInfoDivValidator(div).validate給付率必須();
        return create給付率必須Dictionary().check(message);
    }

    private ValidationDictionary create給付率必須Dictionary() {
        return new ValidationDictionaryBuilder()
                .add(ServiceRiyohyoInfoDivValidationMessage.給付率必須項目,
                        div.getServiceRiyohyoBeppyoGokei().getTxtKyufuritsu()).build();
    }
    
    /**
     * 「確定する」ボタンボタンクリック時のバリデーションチェック。
     * 
     * @return バリデーション突合結果
     */
    public ValidationMessageControlPairs validate事業者サービス種類チェック() {
        ValidationMessageControlPairs validPairs = new ValidationMessageControlPairs();
        事業者サービス種類チェックチェックValidate(validPairs);
        return validPairs;
    }
    
    private void 事業者サービス種類チェックチェックValidate(ValidationMessageControlPairs validPairs) {
        
        JigyoshaNo 事業者番号 = new JigyoshaNo(div.getCcdJigyoshaInput().getNyuryokuShisetsuKodo());
        KaigoJigyoshaShiteiServiceManager manager = new KaigoJigyoshaShiteiServiceManager();
        List<KaigoJigyoshaShiteiService> 介護事業者指定サービスリスト = manager.get介護事業者指定サービス(事業者番号);
        RString サービス種類コード;
        if (!div.getCcdServiceCodeInput().isDisplayNone()) {
            サービス種類コード = div.getCcdServiceCodeInput().getサービスコード1();
        } else {
            サービス種類コード = div.getCcdServiceTypeInput().getサービス種類コード();
        }
        for (KaigoJigyoshaShiteiService 介護事業者指定サービス : 介護事業者指定サービスリスト) {
            if (ServiceCategoryShurui.居宅支援.getコード().equals(
                    介護事業者指定サービス.getサービス種類コード().value())
                    && ServiceCategoryShurui.居宅支援.getコード().equals(サービス種類コード)) {
                return;
            }
            if (ServiceCategoryShurui.予防支援.getコード().equals(
                    介護事業者指定サービス.getサービス種類コード().value())
                    && ServiceCategoryShurui.予防支援.getコード().equals(サービス種類コード)) {
                return;
            }
            if (ServiceCategoryShurui.地小短外.getコード().equals(
                    介護事業者指定サービス.getサービス種類コード().value())
                    && ServiceCategoryShurui.地小短外.getコード().equals(サービス種類コード)) {
                return;
            }
            if (ServiceCategoryShurui.地予小外.getコード().equals(
                    介護事業者指定サービス.getサービス種類コード().value())
                    && ServiceCategoryShurui.地予小外.getコード().equals(サービス種類コード)) {
                return;
            }
            if (ServiceCategoryShurui.予防ケア.getコード().equals(
                    介護事業者指定サービス.getサービス種類コード().value())
                    && ServiceCategoryShurui.予防ケア.getコード().equals(サービス種類コード)) {
                return;
            }
        }
        validPairs.add(new ValidationMessageControlPair(
                new KyotakuSabisuKeikakuIraiTodokedeJohoTorokuValidationMessages(DbcErrorMessages.事業者サービス種類)));
    }
    
    private static class KyotakuSabisuKeikakuIraiTodokedeJohoTorokuValidationMessages
            implements IValidationMessage {

        private final Message message;

        KyotakuSabisuKeikakuIraiTodokedeJohoTorokuValidationMessages(IMessageGettable message,
                String... replacements) {
            this.message = message.getMessage().replace(replacements);
        }

        @Override
        public Message getMessage() {
            return message;
        }
    }
}
