/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.hokenryononyutsuchishoginfuri;

import jp.co.ndensan.reams.db.dbb.definition.reportid.ReportIdDBB;
import jp.co.ndensan.reams.db.dbb.entity.report.hokenryononyutsuchishoginfuri.HokenryoNonyuTsuchishoGinfuriFourKiRenchoSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * 保険料納入通知書（本算定）【銀振タイプ】帳票項目定義_4期_連帳のプロパティです。
 *
 * @reamsid_L DBB-9110-090 huangh
 */
public class HokenryoNonyuTsuchishoGinfuriFourKiRenchoProperty
        extends ReportPropertyBase<HokenryoNonyuTsuchishoGinfuriFourKiRenchoSource> {

    /**
     * コンストラクタです。
     *
     */
    public HokenryoNonyuTsuchishoGinfuriFourKiRenchoProperty() {
        super(SubGyomuCode.DBB介護賦課, ReportIdDBB.DBB100052.getReportId());
    }
}