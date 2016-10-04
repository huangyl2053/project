/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.nofugakuichiranshinkokuyo;

import java.util.List;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.nofugakudatasakuseitandokushichoson.DbT2016NofugakuJohoTemp;
import jp.co.ndensan.reams.db.dbb.entity.report.source.nofugakuichiranshinkokuyo.NofugakuIchiranShinkokuyoSource;
import jp.co.ndensan.reams.ua.uax.entity.db.basic.UaFt200FindShikibetsuTaishoEntity;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.Report;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 帳票設計_DBBRP91003-1_納付額一覧表（確定申告用） のReportクラスです。
 *
 * @reamsid_L DBB-1890-040 qinzhen
 */
public class NofugakuIchiranShinkokuyoReport extends Report<NofugakuIchiranShinkokuyoSource> {

    private final RString 市町村名称;
    private final List<RString> 出力項目リスト;
    private final List<RString> 改頁項目リスト;
    private final RDate 対象年;
    private final DbT2016NofugakuJohoTemp 納付額情報;
    private final UaFt200FindShikibetsuTaishoEntity 宛名Entity;

    /**
     * コンストラクタです
     *
     * @param 市町村名称 RString
     * @param 出力項目リスト List<RString>
     * @param 改頁項目リスト List<RString>
     * @param 対象年 RDate
     * @param 納付額情報 DbT2016NofugakuJohoTemp
     * @param 宛名Entity UaFt200FindShikibetsuTaishoEntity
     */
    public NofugakuIchiranShinkokuyoReport(RString 市町村名称, List<RString> 出力項目リスト, List<RString> 改頁項目リスト,
            RDate 対象年, DbT2016NofugakuJohoTemp 納付額情報, UaFt200FindShikibetsuTaishoEntity 宛名Entity) {
        this.市町村名称 = 市町村名称;
        this.出力項目リスト = 出力項目リスト;
        this.改頁項目リスト = 改頁項目リスト;
        this.対象年 = 対象年;
        this.納付額情報 = 納付額情報;
        this.宛名Entity = 宛名Entity;
    }

    @Override
    public void writeBy(ReportSourceWriter<NofugakuIchiranShinkokuyoSource> writer) {

        INofugakuIchiranShinkokuyoEditor editor = new NofugakuIchiranShinkokuyoEditor(市町村名称, 出力項目リスト, 改頁項目リスト, 対象年, 納付額情報, 宛名Entity);

        INofugakuIchiranShinkokuyoBuilder builder = new NofugakuIchiranShinkokuyoBuilder(editor);

        writer.writeLine(builder);

    }
}