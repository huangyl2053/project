/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.nonyutsuchishocvskigoto;

import jp.co.ndensan.reams.db.dbb.definition.reportid.ReportIdDBB;
import jp.co.ndensan.reams.db.dbb.entity.report.nonyutsuchishocvskigoto.NonyuTsuchishoCVSKigotoRenchoSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * 保険料納入通知書（本算定）【コンビニ期毎タイプ】のPropertyです。
 *
 * @reamsid_L DBB-9110-130 huangh
 */
public class NonyuTsuchishoCVSKigotoRenchoProperty extends ReportPropertyBase<NonyuTsuchishoCVSKigotoRenchoSource> {

    /**
     * インスタンスを生成します。
     */
    public NonyuTsuchishoCVSKigotoRenchoProperty() {
        super(SubGyomuCode.DBB介護賦課, ReportIdDBB.DBB100064.getReportId());
    }
}