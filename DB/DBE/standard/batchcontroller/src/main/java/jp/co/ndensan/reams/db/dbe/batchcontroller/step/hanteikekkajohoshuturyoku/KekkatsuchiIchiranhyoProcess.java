/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.batchcontroller.step.hanteikekkajohoshuturyoku;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.report.kekkatsuchiichiranhyo.KekkatsuchiIchiranhyoReport;
import jp.co.ndensan.reams.db.dbe.definition.core.reportid.ReportIdDBE;
import jp.co.ndensan.reams.db.dbe.definition.processprm.hanteikekkajohoshuturyoku.HanteiKekkaJohoShuturyokuProcessParameter;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.kekkatsuchiichiranhyo.KekkatsuchiIchiranhyoEntity;
import jp.co.ndensan.reams.db.dbe.entity.report.kekkatsuchiichiranhyo.KekkatsuchiIchiranhyoReportSource;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBE;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbz.definition.core.seibetsu.Seibetsu;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigojotaikubun.YokaigoJotaiKubun09;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.report.BreakerCatalog;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 要介護認定結果通知一覧表のデータを作成します。
 *
 * @reamsid_L DBE-0180-030 xuyannan
 */
public class KekkatsuchiIchiranhyoProcess extends BatchProcessBase<KekkatsuchiIchiranhyoEntity> {

    private static final ReportId ID = ReportIdDBE.DBE525004.getReportId();
    private static final RString 改ページ = new RString("shinsakaiNo");
    private static final RString MYBATIS_SELECT_ID = new RString(
            "jp.co.ndensan.reams.db.dbe.persistence.db.mapper.relate.hanteikekkajohoshuturyoku."
            + "IHanteiKekkaJohoShuturyokuMapper.getKekkatsuchiIchiranList");
    private HanteiKekkaJohoShuturyokuProcessParameter processParameter;
    private List<RString> page_break_keys;
    private RDateTime システム時刻;
    private int index;
    private RStringBuilder builder;
    private RString newShinsakaiNo;
    private RString oldShinsakaiNo;

    @BatchWriter
    private BatchReportWriter<KekkatsuchiIchiranhyoReportSource> batchReportWriter;
    private ReportSourceWriter<KekkatsuchiIchiranhyoReportSource> reportSourceWriter;

    @Override
    protected void initialize() {
        システム時刻 = RDateTime.now();
        index = 1;
        page_break_keys = Collections.unmodifiableList(Arrays.asList(改ページ));
        newShinsakaiNo = RString.EMPTY;
        oldShinsakaiNo = RString.EMPTY;
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MYBATIS_SELECT_ID, processParameter.toHanteiKekkaJohoShuturyokuMybatisParameter());
    }

    @Override
    protected void createWriter() {
        batchReportWriter = BatchReportFactory.createBatchReportWriter(ID.value())
                .addBreak(new BreakerCatalog<KekkatsuchiIchiranhyoReportSource>().simplePageBreaker(page_break_keys)).create();
        reportSourceWriter = new ReportSourceWriter<>(batchReportWriter);
    }

    @Override
    protected void process(KekkatsuchiIchiranhyoEntity entity) {
        entity.setShichosonName(DbBusinessConfig.get(ConfigNameDBE.判定結果情報出力_広域連合名称, RDate.getNowDate(), SubGyomuCode.DBE認定支援));
        builder = new RStringBuilder();
        builder.append(entity.getShinsakaiNo());
        builder.append("回");
        entity.setShinsakaiNo(builder.toRString());
        entity.setPrintTimeStamp(システム時刻);
        entity.setSeibetsu(Seibetsu.toValue(entity.getSeibetsu()).get名称());
        entity.setNijiHanteiKekka(YokaigoJotaiKubun09.toValue(entity.getNijiHanteiKekka()).get名称());
        newShinsakaiNo = entity.getShinsakaiNo();
        if (oldShinsakaiNo.equals(newShinsakaiNo)) {
            index = index + 1;
        } else {
            index = 1;
        }
        oldShinsakaiNo = newShinsakaiNo;
        KekkatsuchiIchiranhyoReport report = new KekkatsuchiIchiranhyoReport(entity, index);
        report.writeBy(reportSourceWriter);
    }

}