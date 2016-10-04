/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.gassanjikofutangakuhakkoichiran;

import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.db.dbc.entity.report.source.gassanjikofutangakuhakkoichiran.GassanJikofutangakuHakkoIchiranSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * 帳票設計_DBC200035_高額合算自己負担額証明書発行一覧表 のPropertyクラスです。
 *
 * @reamsid_L DBC-2380-040 qinzhen
 */
public class GassanJikofutangakuHakkoIchiranProperty extends
        ReportPropertyBase<GassanJikofutangakuHakkoIchiranSource> {

    /**
     * コンストラクタです。
     */
    public GassanJikofutangakuHakkoIchiranProperty() {

        super(SubGyomuCode.DBC介護給付, ReportIdDBC.DBC200035.getReportId());
    }
}