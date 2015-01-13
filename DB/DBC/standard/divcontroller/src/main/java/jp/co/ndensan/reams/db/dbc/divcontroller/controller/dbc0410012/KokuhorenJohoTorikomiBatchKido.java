/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.controller.dbc0410012;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbc.business.KokuhorenJohoTorikomi;
import jp.co.ndensan.reams.db.dbc.definition.batchprm.KokuhorenJohoTorikomiBatchParameter;
import jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.ViewStateHolderName;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.DBC0410012.KokuhorenJohoTorikomiBatchKidoDiv;
import jp.co.ndensan.reams.db.dbc.model.relate.KokuhorenJohoTorikomiBatchKidoModel;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.cooperation.SharedFile;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 *
 * @author N2810 久保 里史
 */
public class KokuhorenJohoTorikomiBatchKido {

    private final RString 同月過誤分ファイル名 = new RString("01110000");
    private final RString 通常分ファイル名 = new RString("11100000");

    public ResponseData<KokuhorenJohoTorikomiBatchKidoDiv> onLoad(KokuhorenJohoTorikomiBatchKidoDiv panel) {

        ResponseData<KokuhorenJohoTorikomiBatchKidoDiv> response = new ResponseData<>();

        KokuhorenJohoTorikomiBatchKidoModel selectedrow
                = ViewStateHolder.get(ViewStateHolderName.国保連取込情報, KokuhorenJohoTorikomiBatchKidoModel.class);

        setDisplay(panel, selectedrow);

        response.data = panel;
        response.setRootTitle(selectedrow.get処理名());

        return response;

    }

    public ResponseData<KokuhorenJohoTorikomiBatchParameter> setBatchParameter(KokuhorenJohoTorikomiBatchKidoDiv panel) {

        KokuhorenJohoTorikomiBatchParameter batchparameter = new KokuhorenJohoTorikomiBatchParameter();
        KokuhorenJohoTorikomi business = new KokuhorenJohoTorikomi();

        batchparameter.setKokanjohoShikibetsuNo(panel.getTxtKokanShikibetsuNo().getValue());
        batchparameter.setSaishoriKubun(business.get再処理フラグコード(panel.getTxtSaishoriKubun().getValue()));
        batchparameter.setShoriYM(panel.getTxtShoriJoken().getValue().seireki().fillType(FillType.NONE).getYearMonth());
        batchparameter.setShutsuryokujunID(new RString(panel.getCommonShutsuryokuJun().get出力順ID().toString()));

        ResponseData<KokuhorenJohoTorikomiBatchParameter> responseData = new ResponseData<>();
        responseData.data = batchparameter;
        return responseData;

    }

    private void setDisplay(KokuhorenJohoTorikomiBatchKidoDiv panel, KokuhorenJohoTorikomiBatchKidoModel selectedrow) {
        setVisible(selectedrow.get交換識別番号(), panel);
        setDisplayData(selectedrow, panel);
    }

    private void setVisible(RString 交換識別番号, KokuhorenJohoTorikomiBatchKidoDiv panel) {
        switch (交換識別番号.toString()) {
            case "151":
            case "152":
            case "632":
            case "741":
            case "121":
            case "122":
                panel.getPnlShutsuryokuJun().setDisplayNone(true);
            case "5C3":
            case "112":
            case "161":
            case "171":
            case "172":
            case "651":
            case "652":
            case "641":
            case "533":
            case "114":
            case "221":
            case "222":
            case "331":
            case "351":
            case "37J":
            case "37H":
            case "386":
            case "38B":
            case "38P":
            case "175":
            case "162":
                panel.getPnlShoritaishoJoho().setDisplayNone(true);
            case "111":
            default:
        }
    }

    private void setDisplayData(KokuhorenJohoTorikomiBatchKidoModel selectedrow, KokuhorenJohoTorikomiBatchKidoDiv panel) {
        KokuhorenJohoTorikomi business = new KokuhorenJohoTorikomi();

        switch (selectedrow.get交換識別番号().toString()) {
            case "111":
                if (SharedFile.searchSharedFile(同月過誤分ファイル名).isEmpty()) {
                    panel.getPnlShoritaishoJoho().getDogetsuKagobun().setSelectedItems(Collections.EMPTY_LIST);
                } else {
                    panel.getPnlShoritaishoJoho().getDogetsuKagobun().setSelectedItems(panel.getPnlShoritaishoJoho().getTsujobun().getDataSource());
                }

                if (SharedFile.searchSharedFile(通常分ファイル名).isEmpty()) {
                    panel.getPnlShoritaishoJoho().getTsujobun().setSelectedItems(Collections.EMPTY_LIST);
                } else {
                    panel.getPnlShoritaishoJoho().getTsujobun().setSelectedItems(panel.getPnlShoritaishoJoho().getTsujobun().getDataSource());
                }
            case "5C3":
            case "112":
            case "161":
            case "171":
            case "172":
            case "651":
            case "652":
            case "641":
            case "533":
            case "114":
            case "221":
            case "222":
            case "331":
            case "351":
            case "37J":
            case "37H":
            case "386":
            case "38B":
            case "38P":
            case "175":
            case "162":
                panel.getPnlShutsuryokuJun().getCommonShutsuryokuJun().load(SubGyomuCode.DBC介護給付, business.get帳票ID(selectedrow.get交換識別番号()));
            case "151":
            case "152":
            case "632":
            case "741":
            case "121":
            case "122":
                panel.getPnlChushutsuJoken().getTxtShoriJoken().setValue(new RDate(selectedrow.get処理年月().toString()));
                panel.getPnlChushutsuJoken().getTxtSaishoriKubun().setValue(business.get再処理フラグ名称(selectedrow.get再処理フラグ()));
                panel.getPnlChushutsuJoken().getTxtKokanShikibetsuNo().setValue(selectedrow.get交換識別番号());

            default:
        }
    }

}
