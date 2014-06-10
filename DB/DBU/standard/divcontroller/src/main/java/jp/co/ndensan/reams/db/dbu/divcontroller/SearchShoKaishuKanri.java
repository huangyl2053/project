/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.divcontroller;

import java.util.HashMap;
import java.util.List;
import jp.co.ndensan.reams.db.dbu.divcontroller.entity.DBU0500011.SearchShoKaishuKanriDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.ControlGenerator;
import jp.co.ndensan.reams.db.dbz.divcontroller.helper.YamlLoader;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 証回収記録管理対象者を検索するDivControllerです。
 *
 * @author n8178 城間篤人
 */
public class SearchShoKaishuKanri {

    private final static RString HIHOKENSHA_DATA = new RString("DBU0500011/HihokenshaData.yml");

    /**
     * 検索対象の被保険者番号を入力し、フォーカスをはずした際に実行されます。<br/>
     * 入力した被保険者番号に対応する被保険者が存在していた場合
     *
     * @param searchDiv 証回収状況検索Div
     * @return レスポンス
     */
    public ResponseData onBlur_txtSearchHihokenshaNo(SearchShoKaishuKanriDiv searchDiv) {
        ResponseData<SearchShoKaishuKanriDiv> response = new ResponseData<>();

        searchDiv.getTxtSearchHihokenshaMeisho().setValue(RString.EMPTY);
        List<HashMap> yamlDataList = YamlLoader.FOR_DBU.loadAsList(HIHOKENSHA_DATA);
        for (HashMap yamlData : yamlDataList) {
            ControlGenerator generator = new ControlGenerator(yamlData);
            RString hihokenshaNo = searchDiv.getTxtSearchHihokenshaNo().getValue();
            if (hihokenshaNo != null && hihokenshaNo.equals(generator.getAsRString("被保番号"))) {
                searchDiv.getTxtSearchHihokenshaMeisho().setValue(generator.getAsRString("氏名"));
            }
        }

        response.data = searchDiv;
        return response;
    }
}
