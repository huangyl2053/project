/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.kyufujissekitorikomiichiran;

import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.db.dbc.entity.report.source.kyufujissekitorikomiichiran.KyufujissekiTorikomiIchiranSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * 帳票設計_DBC200007_給付実績情報取込結果一覧表 のPropertyクラスです。
 *
 * @reamsid_L DBC-2440-030 qinzhen
 */
public class KyufujissekiTorikomiIchiranProperty extends
        ReportPropertyBase<KyufujissekiTorikomiIchiranSource> {

    /**
     * コンストラクタです。
     */
    public KyufujissekiTorikomiIchiranProperty() {

        super(SubGyomuCode.DBC介護給付, ReportIdDBC.DBC200007.getReportId());
    }
}
