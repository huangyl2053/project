/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.jikofutangakushomeisho;

import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.db.dbc.entity.report.jikofutangakushomeisho.JikoFutangakushomeishoReportSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * 自己負担証明書のPropertyです。
 *
 * @reamsid_L DBC-4810-030 sunhaidi
 */
public class JikoFutangakushomeishoProperty
        extends ReportPropertyBase<JikoFutangakushomeishoReportSource> {

    /**
     * コンストラクタです。
     */
    public JikoFutangakushomeishoProperty() {
        super(SubGyomuCode.DBC介護給付, ReportIdDBC.DBC100050.getReportId());
    }
}