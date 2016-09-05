/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.handler.parentdiv.DBC2800011;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.definition.batchprm.DBC110810.DBC110810_JukyushaTotsugoIraiOutParameter;
import jp.co.ndensan.reams.db.dbc.definition.core.jukyushaido.JukyushaIF_ShinseiShubetsuCode;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC2800011.JukyushaTotsugoIraiJohoSakuseiDiv;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.KeyValueDataSource;

/**
 * 画面設計_DBC2800011_受給者突合依頼情報作成Handlerクラスです。
 *
 * @reamsid_L DBC-2750-010 xuyongchao
 */
public class JukyushaTotsugoIraiJohoSakuseiHandler {

    private static final RString RSTRING_3 = new RString("3");
    private static final RString RSTRING_4 = new RString("4");
    private final JukyushaTotsugoIraiJohoSakuseiDiv div;

    /**
     * コンストラクタです。
     *
     * @param div 画面情報
     */
    public JukyushaTotsugoIraiJohoSakuseiHandler(JukyushaTotsugoIraiJohoSakuseiDiv div) {
        this.div = div;
    }

    /**
     * 画面初期化処理です。
     *
     */
    public void onLoad() {
        List<KeyValueDataSource> chuushutuKunbun = new ArrayList<>();
        chuushutuKunbun.addAll(getChuushutuKunbun());
        div.getDdlChushutsuKubun().getDataSource().clear();
        div.getDdlChushutsuKubun().getDataSource().addAll(chuushutuKunbun);
        div.getTxtTaishoYM().setDisabled(true);
        div.getTxtNinteiYM().setDisabled(false);
    }

    /**
     * 抽出区分処理です。
     *
     */
    public void setActive() {
        RString index = div.getDdlChushutsuKubun().getSelectedKey();
        if (RSTRING_3.equals(index) || RSTRING_4.equals(index)) {
            div.getTxtTaishoYM().setDisabled(false);
            div.getTxtNinteiYM().setDisabled(true);
        } else {
            div.getTxtTaishoYM().setDisabled(true);
            div.getTxtNinteiYM().setDisabled(false);
        }
    }

    /**
     * バッチ用パラメータクラスを作成します。
     *
     * @return DBC110810_JukyushaTotsugoIraiOutParameter
     */
    public DBC110810_JukyushaTotsugoIraiOutParameter setBatchParameter() {
        DBC110810_JukyushaTotsugoIraiOutParameter batchParameter = new DBC110810_JukyushaTotsugoIraiOutParameter();
        batchParameter.setChuushutuKubun(div.getDdlChushutsuKubun().getSelectedKey());
        if (div.getTxtNinteiYM().isDisabled()) {
            batchParameter.setNinteiNengetu(FlexibleDate.EMPTY);
            batchParameter.setTaishouKaishiNengetu(new FlexibleDate(div.getTxtTaishoYM().getFromValue().toDateString()));
            batchParameter.setTaishouShuuryouNengetu(new FlexibleDate(div.getTxtTaishoYM().getToValue().toDateString()));
        } else {
            batchParameter.setNinteiNengetu(new FlexibleDate(div.getTxtNinteiYM().getValue().toDateString()));
            batchParameter.setTaishouKaishiNengetu(FlexibleDate.EMPTY);
            batchParameter.setTaishouShuuryouNengetu(FlexibleDate.EMPTY);
        }
        return batchParameter;

    }

    private List<KeyValueDataSource> getChuushutuKunbun() {
        //TODO:DBC.Enum.受給者IF_突合依頼情報抽出区分
        List<KeyValueDataSource> list = new ArrayList<>();
        for (JukyushaIF_ShinseiShubetsuCode code : JukyushaIF_ShinseiShubetsuCode.values()) {
            JukyushaIF_ShinseiShubetsuCode kubuncode = JukyushaIF_ShinseiShubetsuCode.toValue(code.getコード());
            KeyValueDataSource dataSource = new KeyValueDataSource(kubuncode.getコード(), kubuncode.get名称());
            list.add(dataSource);
        }
        return list;
    }
}
