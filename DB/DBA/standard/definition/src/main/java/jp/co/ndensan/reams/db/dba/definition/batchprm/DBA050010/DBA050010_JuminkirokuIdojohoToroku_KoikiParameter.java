/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.definition.batchprm.DBA050010;

import jp.co.ndensan.reams.db.dba.definition.processprm.dba050010.JuminkirokuIdojohoTorokuKoikiProcessParameter;
import jp.co.ndensan.reams.uz.uza.batch.BatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchParameterBase;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import lombok.Getter;
import lombok.Setter;

/**
 * 住民異動連携情報登録【広域保険者用】のバッチ用パラメータフロークラスです。
 *
 * @reamsid_L DBA-1390-010 wanghuafeng
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class DBA050010_JuminkirokuIdojohoToroku_KoikiParameter extends BatchParameterBase {

    private static final long serialVersionUID = 1L;

    private static final String SYORINICHIJI = "処理日時";

    @BatchParameter(key = SYORINICHIJI, name = "処理日時")
    private YMDHMS syorinichiji;

    /**
     * バーチのパラメータを作成します。
     *
     * @return JuminkirokuIdojohoTorokuKoikiProcessParameter
     */
    public JuminkirokuIdojohoTorokuKoikiProcessParameter toJuminkirokuIdojohoTorokuKoikiProcessParameter() {
        return new JuminkirokuIdojohoTorokuKoikiProcessParameter(
                syorinichiji);
    }
}
