/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.business.report.dbd200014;

import jp.co.ndensan.reams.db.dbd.definition.reportid.ReportIdDBD;
import jp.co.ndensan.reams.db.dbd.entity.report.dbd200014.HomonKaigoRiyoshaFutangakuGengakuNinteishaIchiranReportSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * {@link HomonKaigoRiyoshaFutangakuGengakuNinteishaIchiranReportSource}のプロパティです。
 *
 * @reamsid_L DBD-3970-060 b_liuyang2
 */
public class HomonKaigoRiyoshaFutangakuGengakuNinteishaIchiranProerty extends
        ReportPropertyBase<HomonKaigoRiyoshaFutangakuGengakuNinteishaIchiranReportSource> {

    /**
     * コンストラクタです。
     */
    public HomonKaigoRiyoshaFutangakuGengakuNinteishaIchiranProerty() {
        super(SubGyomuCode.DBD介護受給, ReportIdDBD.DBD200016.getReportId());
    }
}