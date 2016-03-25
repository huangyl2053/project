/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.business.report.shakaifukushihojinfutan;

import jp.co.ndensan.reams.db.dba.definition.reportid.ReportIdDBA;
import jp.co.ndensan.reams.db.dba.entity.report.shakaifukushihojinfutan.ShakaiFukushiHojinFutanKeigenTaishoKakuninShinseishoReportSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * {@link 社会福祉法人等利用者負担軽減対象確認申請書}のプロパティです。
 */
public class ShakaiFukushiHojinFutanKeigenTaishoKakuninShinseishoProperty extends
        ReportPropertyBase<ShakaiFukushiHojinFutanKeigenTaishoKakuninShinseishoReportSource> {

    /**
     * インスタンスを生成します。
     */
    public ShakaiFukushiHojinFutanKeigenTaishoKakuninShinseishoProperty() {
        super(SubGyomuCode.DBA介護資格, ReportIdDBA.DBD800006.getReportId());
    }

}
