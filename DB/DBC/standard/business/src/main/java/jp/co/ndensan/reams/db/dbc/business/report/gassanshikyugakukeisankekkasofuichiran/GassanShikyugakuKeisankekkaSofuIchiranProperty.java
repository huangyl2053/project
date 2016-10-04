/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.gassanshikyugakukeisankekkasofuichiran;

import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.db.dbc.entity.report.gassanshikyugakukeisankekkasofuichiran.GassanShikyugakuKeisankekkaSofuIchiranSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * 帳票設計_DBC200036_高額合算支給額計算結果連絡票情報送付一覧表 Propertyクラスです。
 *
 * @reamsid_L DBC-2670-040 lijian
 */
public class GassanShikyugakuKeisankekkaSofuIchiranProperty extends ReportPropertyBase<GassanShikyugakuKeisankekkaSofuIchiranSource> {

    /**
     * コンストラクタです。
     *
     */
    public GassanShikyugakuKeisankekkaSofuIchiranProperty() {
        super(SubGyomuCode.DBC介護給付, ReportIdDBC.DBC200036.getReportId());
    }
}