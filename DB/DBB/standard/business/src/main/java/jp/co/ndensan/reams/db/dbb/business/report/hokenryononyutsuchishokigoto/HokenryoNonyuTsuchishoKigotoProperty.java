/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.hokenryononyutsuchishokigoto;

import jp.co.ndensan.reams.db.dbb.definition.reportid.ReportIdDBB;
import jp.co.ndensan.reams.db.dbb.entity.report.hokenryononyutsuchishokigoto.HokenryoNonyuTsuchishoKigotoSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * 保険料納入通知書（本算定）【期毎タイプ】HokenryoNonyuTsuchishoKigotoProperty
 *
 * @reamsid_L DBB-9110-080 huangh
 */
public class HokenryoNonyuTsuchishoKigotoProperty extends ReportPropertyBase<HokenryoNonyuTsuchishoKigotoSource> {

    /**
     * インスタンスを生成します。
     */
    public HokenryoNonyuTsuchishoKigotoProperty() {
        super(SubGyomuCode.DBB介護賦課, ReportIdDBB.DBB100045.getReportId());
    }

}
