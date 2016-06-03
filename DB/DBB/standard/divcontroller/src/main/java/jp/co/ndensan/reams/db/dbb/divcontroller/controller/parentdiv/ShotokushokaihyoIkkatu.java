/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.divcontroller.controller.parentdiv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB1140001.ShotokushokaihyoIkkatuDiv;
import jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB1140001.dgSaihakko_Row;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.ControlGenerator;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.YamlLoader;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.DataGrid;

/**
 *
 * @author N2810
 */
public class ShotokushokaihyoIkkatu {

    private static final RString SAIHAKKO_H25 = new RString("DBB1140001/Saihakko_H25.yml");
    private static final RString SAIHAKKO_H26 = new RString("DBB1140001/Saihakko_H26.yml");

    /**
     * 画面の初期化メソッドです。
     *
     * @param panel ShotokushokaihyoIkkatuDiv
     * @return 画面のResponseData
     */
    public ResponseData<ShotokushokaihyoIkkatuDiv> onLoad_HeijunkaAugustKeisan(ShotokushokaihyoIkkatuDiv panel) {

        return loadSaihakkoData(panel);
    }

    /**
     * 画面の初期化メソッドです。
     *
     * @param panel ShotokushokaihyoIkkatuDiv
     * @return 画面のResponseData
     */
    public ResponseData<ShotokushokaihyoIkkatuDiv> onChange_ddlShoriNendo(ShotokushokaihyoIkkatuDiv panel) {

        return loadSaihakkoData(panel);
    }

    private ResponseData<ShotokushokaihyoIkkatuDiv> loadSaihakkoData(ShotokushokaihyoIkkatuDiv panel) {

        ResponseData<ShotokushokaihyoIkkatuDiv> response = new ResponseData<>();
        List<dgSaihakko_Row> arrayData = createRowSaihakkoData(panel.getDdlShoriNendo().getSelectedValue());
        DataGrid<dgSaihakko_Row> grid = panel.getDgSaihakko();
        grid.setDataSource(arrayData);
        response.data = panel;

        return response;
    }

    private List<dgSaihakko_Row> createRowSaihakkoData(RString shorinendo) {

        RString filename = getFileName(shorinendo);

        List<dgSaihakko_Row> arrayData = new ArrayList<>();

        if (filename != null && !filename.isEmpty()) {
            List<HashMap> demoDataList = YamlLoader.DBB.loadAsList(filename);
            for (HashMap demoData : demoDataList) {
                // コンストラクタにMapを渡して生成。
                ControlGenerator cg = new ControlGenerator(demoData);
                dgSaihakko_Row row = new dgSaihakko_Row(Boolean.FALSE, RString.EMPTY, RString.EMPTY, RString.EMPTY, RString.EMPTY);

                row.setTxtShoriNendo(cg.getAsRString("shorinendo"));
                row.setTxtShoriNichiji(cg.getAsRString("shorinichiji"));
                row.setTxtHakkoKensu(cg.getAsRString("hakkokensu"));
                row.setTxtUser(cg.getAsRString("user"));

                arrayData.add(row);
            }
        }
        return arrayData;
    }

    private RString getFileName(RString shorinendo) {

        if (shorinendo.equals(new RString("平26"))) {
            return SAIHAKKO_H26;
        } else if (shorinendo.equals(new RString("平25"))) {
            return SAIHAKKO_H25;
        } else {
            return null;
        }
    }
}
