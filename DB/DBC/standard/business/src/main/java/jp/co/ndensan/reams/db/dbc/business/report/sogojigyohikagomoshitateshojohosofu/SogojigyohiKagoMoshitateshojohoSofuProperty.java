/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.sogojigyohikagomoshitateshojohosofu;

import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.sogojigyohikagomoshitateshojohosofuichiran.SogojigyohiKagoMoshitateshojohoSofuSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * 帳票設計_DBC200079_総合事業費過誤申立書情報送付一覧表 のPropertyクラスです。
 *
 * @reamsid_L DBC-2530-042 zhengshenlei
 */
public class SogojigyohiKagoMoshitateshojohoSofuProperty extends ReportPropertyBase<SogojigyohiKagoMoshitateshojohoSofuSource> {

    /**
     * コンストラクタです。
     */
    public SogojigyohiKagoMoshitateshojohoSofuProperty() {
        super(SubGyomuCode.DBC介護給付, ReportIdDBC.DBC200079.getReportId());
    }
}