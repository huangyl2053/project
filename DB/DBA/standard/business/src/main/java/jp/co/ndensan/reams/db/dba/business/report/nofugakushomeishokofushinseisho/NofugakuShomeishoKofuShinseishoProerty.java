/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.business.report.nofugakushomeishokofushinseisho;

import jp.co.ndensan.reams.db.dba.definition.reportid.ReportIdDBA;
import jp.co.ndensan.reams.db.dba.entity.report.nofugakushomeishokofushinseisho.NofugakuShomeishoKofuShinseishoReportSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * 介護保険料納付額証明書交付申請書のプロパティです。
 *
 * @reamsid_L DBA-0540-694 yaodongsheng
 */
public class NofugakuShomeishoKofuShinseishoProerty extends ReportPropertyBase<NofugakuShomeishoKofuShinseishoReportSource> {

    /**
     * コンストラクタです。
     */
    public NofugakuShomeishoKofuShinseishoProerty() {
        super(SubGyomuCode.DBB介護賦課, ReportIdDBA.DBB800003.getReportId());
    }
}