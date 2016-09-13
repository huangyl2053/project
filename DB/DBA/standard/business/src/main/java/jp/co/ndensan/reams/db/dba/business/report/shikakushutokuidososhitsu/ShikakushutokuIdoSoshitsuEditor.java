/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.co.ndensan.reams.db.dba.business.report.shikakushutokuidososhitsu;

import jp.co.ndensan.reams.db.dba.entity.report.shikakushutokuidososhitsu.ShikakushutokuIdoSoshitsuReportSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 *
 * 介護保険資格取得・異動・喪失届Editorです。
 * @reamsid_L DBA-0540-681 dongyabin
 */
public class ShikakushutokuIdoSoshitsuEditor implements IShikakushutokuIdoSoshitsuEditor {

    private final ShikakushutokuIdoSoshitsuItem joho;
    
    /**
     * コンストラクタです。
     * @param joho 介護保険資格取得・異動・喪失届Entityリストです
     */
    public ShikakushutokuIdoSoshitsuEditor(ShikakushutokuIdoSoshitsuItem joho) {
        this.joho = joho;
    }

    /**
     * 介護保険資格取得・異動・喪失届editです。
     * @param source 介護保険資格取得・異動・喪失届Source
     * @return 介護保険資格取得・異動・喪失届
     */
    @Override
    public ShikakushutokuIdoSoshitsuReportSource edit(ShikakushutokuIdoSoshitsuReportSource source) {
        return editBody(source);
    }
    
    private ShikakushutokuIdoSoshitsuReportSource editBody(ShikakushutokuIdoSoshitsuReportSource source) {
        source.ninshoshaYakushokuMei = joho.getNinshoshaYakushokuMei();
        source.birthYMD1 = joho.getBirthYMD1();
        source.hihokenshaJusho = joho.getHihokenJusho();
        source.hihokenKatakaki = joho.getHihokenKatakaki();
        source.hihokenshaName1 = joho.getHihokenshaName1();
        source.hihokenshaNameKana1 = joho.getHihokenshaNameKana1();
        source.hihokenshaNo1 = joho.getHihokenshaNo1();
        source.seibetsu1 = joho.getSeibetsu1();
        source.setainushiName = joho.getSetainushiName();
        source.zokugara1 = joho.getZokugara1();
        source.remban = new RString("1");
        return source;
    }
    
}