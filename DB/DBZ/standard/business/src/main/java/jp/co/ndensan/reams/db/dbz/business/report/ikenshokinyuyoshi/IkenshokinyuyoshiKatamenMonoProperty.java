/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.co.ndensan.reams.db.dbz.business.report.ikenshokinyuyoshi;

import jp.co.ndensan.reams.db.dbz.definition.reportid.ReportIdDBZ;
import jp.co.ndensan.reams.db.dbz.entity.report.ikenshokinyuyoshi.IkenshokinyuyoshiReportSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 *
 * @author n8344
 */
public class IkenshokinyuyoshiKatamenMonoProperty extends ReportPropertyBase<IkenshokinyuyoshiReportSource> {

    /**
     * インスタンスを生成します。
     */
    public IkenshokinyuyoshiKatamenMonoProperty() {
        super(SubGyomuCode.DBE認定支援, ReportIdDBZ.DBE231001KatamenMono.getReportId());
    }

}