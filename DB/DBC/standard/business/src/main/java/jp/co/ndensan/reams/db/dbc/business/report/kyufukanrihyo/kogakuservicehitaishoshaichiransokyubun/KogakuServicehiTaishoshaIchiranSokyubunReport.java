/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.kyufukanrihyo.kogakuservicehitaishoshaichiransokyubun;

import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kogakuservicehitaishoshaichiransokyubun.KogakuServicehiTaishoshaIchiranSokyubunEntity;
import jp.co.ndensan.reams.db.dbc.entity.report.source.kogakuservicehitaishoshaichiransokyubun.KogakuServicehiTaishoshaIchiranSokyubunReportSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.Report;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 帳票設計_DBCMN41003_高額介護サービス費対象者一覧表（遡及分）のReportです。
 *
 * @reamsid_L DBC-5750-040 kanghongsong
 */
public class KogakuServicehiTaishoshaIchiranSokyubunReport extends Report<KogakuServicehiTaishoshaIchiranSokyubunReportSource> {

    private final KogakuServicehiTaishoshaIchiranSokyubunEntity entity;
    private final Map<RString, RString> 出力順Map;
    private final List<RString> 改頁リスト;

    /**
     * インスタンスを生成するメソッド。
     *
     * @param entity 給付管理票送付一覧表
     * @param 出力順Map Map<RString, RString>
     * @param 改頁リスト List<RString>
     *
     */
    public KogakuServicehiTaishoshaIchiranSokyubunReport(
            KogakuServicehiTaishoshaIchiranSokyubunEntity entity, Map<RString, RString> 出力順Map, List<RString> 改頁リスト) {
        this.entity = entity;
        this.出力順Map = 出力順Map;
        this.改頁リスト = 改頁リスト;
    }

    @Override
    public void writeBy(ReportSourceWriter<KogakuServicehiTaishoshaIchiranSokyubunReportSource> reportSourceWriter) {
        KogakuServicehiTaishoshaIchiranSokyubunEditor editor = new KogakuServicehiTaishoshaIchiranSokyubunEditor(entity, 出力順Map, 改頁リスト);
        
        IKogakuServicehiTaishoshaIchiranSokyubunBuilder builder = new KogakuServicehiTaishoshaIchiranSokyubunBuilder(editor);
        reportSourceWriter.writeLine(builder);
    }
}