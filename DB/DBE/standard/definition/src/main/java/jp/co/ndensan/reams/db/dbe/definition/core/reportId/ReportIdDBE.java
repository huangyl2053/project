/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.core.reportId;

import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 帳票ＩＤの列挙型です。
 */
public enum ReportIdDBE {

    /**
     * 主治医意見書作成依頼書の帳票ＩＤです。
     */
    DBE230001(new ReportId("DBE230001_ShujiiIkenshoSakuseiIraisho"), new RString("主治医意見書作成依頼書"));

    private final ReportId reportId;
    private final RString reportName;

    private ReportIdDBE(ReportId reportId, RString reportName) {
        this.reportId = reportId;
        this.reportName = reportName;
    }

    /**
     * 帳票ＩＤの取得します。
     *
     * @return 帳票ＩＤ
     */
    public ReportId getReportId() {
        return reportId;
    }

    /**
     * 帳票Nameの取得します。
     *
     * @return 帳票Name
     */
    public RString getReportName() {
        return reportName;
    }
}
