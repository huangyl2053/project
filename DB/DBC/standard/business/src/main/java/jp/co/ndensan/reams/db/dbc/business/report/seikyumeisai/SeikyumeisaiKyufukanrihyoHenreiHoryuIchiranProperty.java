/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.seikyumeisai;

import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.db.dbc.entity.report.seikyumeisai.SeikyumeisaiKyufukanrihyoHenreiHoryuIchiranReportSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * 請求明細・給付管理票返戻（保留）一覧表のプロパティです。
 *
 * @reamsid_L DBC-2830-030 xuyannan
 */
public class SeikyumeisaiKyufukanrihyoHenreiHoryuIchiranProperty
        extends ReportPropertyBase<SeikyumeisaiKyufukanrihyoHenreiHoryuIchiranReportSource> {

    /**
     * コンストラクタです。
     */
    public SeikyumeisaiKyufukanrihyoHenreiHoryuIchiranProperty() {
        super(SubGyomuCode.DBC介護給付, ReportIdDBC.DBC200001.getReportId());
    }

}