/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.gassanshikyugakukakuninichiran;

import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.db.dbc.entity.report.source.gassanshikyugakukakuninichiran.GassanShikyugakuKakuninIchiranSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * 高額合算支給額計算結果連絡票情報確認リストのPropertyクラスです。
 *
 * @reamsid_L DBC-2680-031 qinzhen
 */
public class GassanShikyugakuKakuninIchiranProperty extends
        ReportPropertyBase<GassanShikyugakuKakuninIchiranSource> {

    /**
     * コンストラクタです。
     */
    public GassanShikyugakuKakuninIchiranProperty() {

        super(SubGyomuCode.DBC介護給付, ReportIdDBC.DBC200038.getReportId());
    }

}
