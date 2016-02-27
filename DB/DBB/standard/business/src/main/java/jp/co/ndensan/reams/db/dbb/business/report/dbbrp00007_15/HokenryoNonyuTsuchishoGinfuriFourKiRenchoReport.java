/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.dbbrp00007_15;

import jp.co.ndensan.reams.db.dbb.entity.report.dbbrp00007_15.HokenryoNonyuTsuchishoGinfuriFourKiRenchoSource;
import jp.co.ndensan.reams.uz.uza.report.Report;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 *
 * 保険料納入通知書（本算定過年度）【銀振タイプ】帳票項目定義_4期_連帳
 */
public class HokenryoNonyuTsuchishoGinfuriFourKiRenchoReport extends Report<HokenryoNonyuTsuchishoGinfuriFourKiRenchoSource> {

    //private final HokenryoNonyuTsuchishoGinfuriFiveKiRenchoItem item;
    /**
     * コンストラクタです。
     *
     */
    protected HokenryoNonyuTsuchishoGinfuriFourKiRenchoReport() {
        //this.item = item;
    }

    /**
     *
     * @return HokenryoNonyuTsuchishoGinfuriFourKiRenchoReport
     * @throws NullPointerException 引数が{@code null}の時
     */
    public static HokenryoNonyuTsuchishoGinfuriFourKiRenchoReport createFrom() {
        return new HokenryoNonyuTsuchishoGinfuriFourKiRenchoReport();
    }

    @Override
    public void writeBy(ReportSourceWriter<HokenryoNonyuTsuchishoGinfuriFourKiRenchoSource> writer) {
        IHokenryoNonyuTsuchishoGinfuriFourKiRenchoEditor editor = new HokenryoNonyuTsuchishoGinfuriFourKiRenchoEditor();
        IHokenryoNonyuTsuchishoGinfuriFourKiRenchoBuilder builder = new HokenryoNonyuTsuchishoGinfuriFourKiRenchoBuilder(editor);
        writer.writeLine(builder);
    }

}
