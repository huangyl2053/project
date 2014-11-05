/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.business;

import jp.co.ndensan.reams.db.dbz.business.config.NenreiTotatsuKijunConfig;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbz.model.HihokenshaDaichoModel;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.ur.urz.model.IDateOfBirth;
import jp.co.ndensan.reams.ur.urz.model.validations.IValidatable;
import jp.co.ndensan.reams.ur.urz.model.validations.IValidationMessages;

/**
 * 資格取得対象者が、資格を取得可能な年齢に到達しているかのチェック機能を提供するクラスです。
 *
 * @author n8178 城間篤人
 */
public class NenreiTotatsuValidetor implements IValidatable {

    private final HihokenshaDaichoModel model;
    private final IDateOfBirth dateOfBirth;
    private final NenreiTotatsuKijunConfig config;

    /**
     * コンストラクタです。
     *
     * @param model 被保険者台帳Model
     * @param dateOfBirth 生年月日
     */
    public NenreiTotatsuValidetor(HihokenshaDaichoModel model, IDateOfBirth dateOfBirth) {
        requireNonNull(model, UrSystemErrorMessages.引数がnullのため生成不可
                .getReplacedMessage("引数のmodel", getClass().getSimpleName()));
        requireNonNull(dateOfBirth, UrSystemErrorMessages.引数がnullのため生成不可
                .getReplacedMessage("生年月日", getClass().getSimpleName()));
        this.model = model;
        this.dateOfBirth = dateOfBirth;
        this.config = new NenreiTotatsuKijunConfig();
    }

    /**
     * テスト用コンストラクタです。
     *
     * @param model 被保険者台帳Model
     * @param dateOfBirth 生年月日
     * @param config 業務コンフィグクラスのMock
     */
    NenreiTotatsuValidetor(HihokenshaDaichoModel model, IDateOfBirth dateOfBirth, NenreiTotatsuKijunConfig config) {
        this.model = model;
        this.dateOfBirth = dateOfBirth;
        this.config = config;
    }

    @Override
    public IValidationMessages validate() {
        //TODO #52997
        //生年月日と資格取得日を比較して、資格取得可能な年齢であるかどうかを判定する処理を実装してください。
        //資格取得可能な年齢は、取得事由によって変化するため、以下のように判定処理を分岐させてください。
        //
        //1, NenreiTotatsuKijunConfigとConfigKeysNenreiTotatsuKijunを利用して、
        //   業務コンフィグから年齢到達の基準を取得する。
        //      取得事由 == 年齢到達 の場合
        //          ConfigKeysNenreiTotatsuKijun.年齢到達基準_65歳を使用して取得する。
        //      それ以外の場合
        //          ConfigKeysNenreiTotatsuKijun.年齢到達基準_40歳を指定して取得する。
        //
        //2, 取得した年齢到達の基準を元に判定を行う。
        //   NenreiTotatsuCheckerを使用して判定を行い、条件を満たす場合メッセージを返す。
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
