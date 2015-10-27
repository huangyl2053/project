/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.divcontroller.parentdiv.dbu0600011;

import java.util.HashMap;
import jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0600011.SogoShokaiKihonDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.ControlGenerator;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.YamlLoader;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RString;
//import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 * 総合照会基本情報Divを制御します。
 *
 * @author N9606 漢那 憲作
 */
public class SogoShokaiKihon {

    /**
     * 検索結果画面-「選択」押下時の処理を表します。
     *
     * @param panel SogoShokaiKihonDiv
     * @return ResponseData
     */
    public ResponseData<SogoShokaiKihonDiv> dispTaishoshaJoho(
            SogoShokaiKihonDiv panel) {
        ResponseData<SogoShokaiKihonDiv> response = new ResponseData<>();

        HashMap hashMap
                = YamlLoader.DBU.loadAsList(new RString("dbu0600011/AtenaKihonData.yml")).get(0);

        ControlGenerator ymlData = new ControlGenerator(hashMap);

        //宛名照会 識別コード設定
//        AtenaShokaiSimple.setData(panel.getSogoShokaiKihonInfo().getAtenaInfo(),
//                new ShikibetsuCode(ymlData.getAsRString("識別コード")));
//
        //RString rsShikibetsuCode = (RString) ViewStateHolder.get("shikibetsuCode", RString.class);
        //宛名照会 識別コード設定
        //AtenaShokaiSimple.setData(panel.getSogoShokaiKihonInfo(), new ShikibetsuCode(rsShikibetsuCode));
//        RString rsHihoNo = (RString) ViewStateHolder.get("hihokenshaNo", RString.class);
//        List<HashMap> hihokenshashoHakkoTaishoshaJohoList = YamlLoader.DBU.loadAsList(
//                new RString("dbu0600011/AtenaKihonData.yml"));
//
//        int iIdx;
//        if (rsHihoNo.toString().equals("1234500001")) {
//            iIdx = 0;
//        } else {
//            iIdx = 1;
//        }
//        HashMap hashMap = hihokenshashoHakkoTaishoshaJohoList.get(iIdx);
//        ControlGenerator ymlData = new ControlGenerator(hashMap);
//        //宛名基本情報の出力
//        panel.getSogoShokaiKihonInfo().getTxtAtenaMeisho().
//                setValue(ymlData.getAsRString("氏名"));
//
//        panel.getSogoShokaiKihonInfo().getTxtAtenaKanaMeisho().
//                setValue(ymlData.getAsRString("カナ氏名"));
//
//        panel.getSogoShokaiKihonInfo().getTxtJusho().
//                setValue(ymlData.getAsRString("住所"));
//
//        panel.getSogoShokaiKihonInfo().getTxtSeinengappiYMD().
//                setValue(ymlData.getAsRDate("生年月日"));
//
//        panel.getSogoShokaiKihonInfo().getTxtNenrei().
//                setValue(ymlData.getAsRString("年齢"));
//
//        panel.getSogoShokaiKihonInfo().getTxtSeibetsu().
//                setValue(ymlData.getAsRString("性別"));
//
//        panel.getSogoShokaiKihonInfo().getTxtGyoseiku().
//                setValue(ymlData.getAsRString("行政区"));
//
//        panel.getSogoShokaiKihonInfo().getTxtYubinNo().
//                setValue(ymlData.getAsYubinNo("郵便番号"));
//
//        panel.getSogoShokaiKihonInfo().getTxtJuminJotai().
//                setValue(ymlData.getAsRString("住民状態"));
//
//        panel.getSogoShokaiKihonInfo().getTxtShikibetsuCode().
//                setValue(ymlData.getAsRString("識別コード"));
//
//        panel.getSogoShokaiKihonInfo().getTxtKojinHojinCode().
//                setValue(ymlData.getAsRString("個人番号"));
//
//        panel.getSogoShokaiKihonInfo().getTxtSetaiCode().
//                setValue(ymlData.getAsRString("世帯コード"));
        response.data = panel;
        return response;

    }

}