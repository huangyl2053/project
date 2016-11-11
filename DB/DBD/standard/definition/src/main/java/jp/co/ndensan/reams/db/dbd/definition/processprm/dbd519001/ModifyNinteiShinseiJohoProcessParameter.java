/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.definition.processprm.dbd519001;

import jp.co.ndensan.reams.db.dbd.definition.mybatisprm.dbd519001.ModifyNinteiShinseiJohoMybatisParameter;
import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.shikibetsutaisho.IShikibetsuTaishoPSMSearchKey;
import jp.co.ndensan.reams.uz.uza.batch.parameter.IBatchProcessParameter;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * 申請情報IF編集_バッチ処理パラメータクラスです。
 *
 * @reamsid_L DBD-1480-020 liuyl
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class ModifyNinteiShinseiJohoProcessParameter implements IBatchProcessParameter {

    private RString 認定申請IF種類;
    private LasdecCode 市町村コード;

    /**
     * コンストラクタです。
     *
     * @param 認定申請IF種類 RString
     * @param 市町村コード LasdecCode
     */
    public ModifyNinteiShinseiJohoProcessParameter(RString 認定申請IF種類, LasdecCode 市町村コード) {
        this.認定申請IF種類 = 認定申請IF種類;
        this.市町村コード = 市町村コード;
    }

    /**
     * Mybatisのパラメータを作成します。
     *
     * @param searchKey IShikibetsuTaishoPSMSearchKey
     * @return ModifyNinteiShinseiJohoMybatisParameter
     */
    public ModifyNinteiShinseiJohoMybatisParameter toModifyNinteiShinseiJohoMybatisParameter(IShikibetsuTaishoPSMSearchKey searchKey) {
        return new ModifyNinteiShinseiJohoMybatisParameter(searchKey, 認定申請IF種類, 市町村コード);
    }
}