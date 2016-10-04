/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.definition.processprm.dbd8100201;

import java.util.List;
import jp.co.ndensan.reams.uz.uza.batch.parameter.IBatchProcessParameter;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * ファイル取込Parameterクラスです．
 *
 * @reamsid_L DBD-4910-030 x_youyj
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class FileReaderProcessParameter implements IBatchProcessParameter {

    private List<RString> 構成市町村コードリスト;
    private RString 処理区分;
    private RString 対象月;
    private FlexibleYear 処理年度;

    /**
     * ファイル取込のParameterです。
     *
     * @param 処理年度 FlexibleYear
     * @param 処理区分 RString
     * @param 対象月 RString
     * @param 構成市町村コードリスト List<RString>
     */
    public FileReaderProcessParameter(FlexibleYear 処理年度, RString 処理区分, RString 対象月, List<RString> 構成市町村コードリスト) {
        this.処理区分 = 処理区分;
        this.処理年度 = 処理年度;
        this.対象月 = 対象月;
        this.構成市町村コードリスト = 構成市町村コードリスト;
    }
}