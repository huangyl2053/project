/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.processprm.kagoketteikohifutanshain;

import java.util.List;
import jp.co.ndensan.reams.uz.uza.batch.parameter.IBatchProcessParameter;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * KohifutanshaReadCsvFileProcessパラメータです。
 *
 * @reamsid_L DBC-0980-420 zhangrui
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class KohifutanshaReadCsvFileProcessParameter implements IBatchProcessParameter {

    private FlexibleYearMonth 処理年月;
    private RString 保存先フォルダ;
    private List<RString> エントリ情報List;

}