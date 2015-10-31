/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.mybatis.param.shinsakaiiinjoho;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 介護認定審査会委員情報を特定するためのMyBatis用パラメータクラスです。
 */
@lombok.Getter
public class ShinsakaiIinJohoMapperParameter {

    private final RString shinsakaiIinCode;

    /**
     * コンストラクタです。
     *
     * @param shinsakaiIinCode shinsakaiIinCode
     * @throws NullPointerException 引数のいずれかが{@code null}の場合
     */
    public ShinsakaiIinJohoMapperParameter(RString shinsakaiIinCode) {
        this.shinsakaiIinCode
                = requireNonNull(shinsakaiIinCode, UrSystemErrorMessages.値がnull.getReplacedMessage("介護認定審査会開催番号"));

    }

    /**
     * キー検索用のパラメータを生成します。
     *
     * @param shinsakaiIinCode shinsakaiIinCode
     * @return 身体手帳検索パラメータ
     */
    public static ShinsakaiIinJohoMapperParameter createSelectByKeyParam(
            RString shinsakaiIinCode) {
        return new ShinsakaiIinJohoMapperParameter(shinsakaiIinCode);
    }

}