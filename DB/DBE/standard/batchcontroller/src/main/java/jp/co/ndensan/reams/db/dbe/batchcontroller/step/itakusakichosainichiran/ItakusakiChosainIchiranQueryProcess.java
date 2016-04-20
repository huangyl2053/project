/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.batchcontroller.step.itakusakichosainichiran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.report.itakusakichosainichiran.ItakusakiChosainIchiranBodyItem;
import jp.co.ndensan.reams.db.dbe.business.report.itakusakichosainichiran.ItakusakiChosainIchiranHeadItem;
import jp.co.ndensan.reams.db.dbe.business.report.itakusakichosainichiran.ItakusakiChosainIchiranReport;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.itakusakichosainzichiran.ItakusakiChosainIchiranReportId;
import jp.co.ndensan.reams.db.dbe.definition.processprm.itakusakichosainichiran.ItakusakiChosainIchiranQueryProcessParemeter;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.itakusakichosainichiran.ItakusakiChosainIchiranRelateEntity;
import jp.co.ndensan.reams.db.dbe.entity.report.itakusakichosainichiran.ItakusakiChosainIchiranReportSource;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchKeyBreakBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.batch.process.InputParameter;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.BreakerCatalog;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 *
 * 調査員一覧情報の取得バッチクラスです。
 */
public class ItakusakiChosainIchiranQueryProcess extends BatchKeyBreakBase<ItakusakiChosainIchiranRelateEntity> {

    private static final RString MYBATIS_SELECT_ID
            = new RString("jp.co.ndensan.reams.db.dbe.persistence.db.mapper.relate.itakusakichosainichiran."
                    + "IItakusakiChosainIchiranMapper.getNinteiChoSain");
    private static final ReportId REPORT_ID = new ReportId(ItakusakiChosainIchiranReportId.REPORT_ID.getCode());
    private static final List<RString> PAGE_BREAK_KEYS = Collections.unmodifiableList(Arrays.asList(new RString("listIchiranhyoUpper_1")));
    private ItakusakiChosainIchiranQueryProcessParemeter paramter;
    List<ItakusakiChosainIchiranBodyItem> bodyItem;
    ItakusakiChosainIchiranHeadItem headItem;
    InputParameter<ItakusakiChosainIchiranQueryProcessParemeter> parameterClass;
    @BatchWriter
    private BatchReportWriter<ItakusakiChosainIchiranReportSource> batchWrite;
    private ReportSourceWriter<ItakusakiChosainIchiranReportSource> retortWrite;

    @Override
    protected void initialize() {
        bodyItem = new ArrayList<>();
        headItem = new ItakusakiChosainIchiranHeadItem(paramter.getItakusakiCodeFrom(),
                paramter.getItakusakiCodeTo(),
                paramter.getChosainNoFrom(),
                paramter.getChosainNoTo(),
                paramter.getJyoukyou(),
                paramter.getShichosonCode(),
                paramter.getShichosonMeisho(),
                paramter.getNarabiJun(),
                paramter.getNextPage());
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MYBATIS_SELECT_ID, paramter.toMybitisParameter());
    }

    @Override
    protected void createWriter() {
        batchWrite = BatchReportFactory.createBatchReportWriter(REPORT_ID.value())
                .addBreak(new BreakerCatalog<ItakusakiChosainIchiranReportSource>().simplePageBreaker(PAGE_BREAK_KEYS))
                .create();
        retortWrite = new ReportSourceWriter<>(batchWrite);
    }

    @Override
    protected void afterExecute() {
        ItakusakiChosainIchiranReport report = ItakusakiChosainIchiranReport.createFrom(headItem, bodyItem);
        report.writeBy(retortWrite);

    }

    private ItakusakiChosainIchiranBodyItem setBodyItemm(ItakusakiChosainIchiranRelateEntity entity) {
        RString dDbT5910_YubinNo = RString.EMPTY;
        RString dbT5910_TelNo = RString.EMPTY;
        if (entity.getDbT5910_YubinNo() != null) {
            dDbT5910_YubinNo = entity.getDbT5910_YubinNo().value();
        }
        if (entity.getDbT5910_TelNo() != null) {
            dbT5910_TelNo = entity.getDbT5910_TelNo().value();
        }

        return new ItakusakiChosainIchiranBodyItem(entity.getDbT5910_NinteichosaItakusakiCode(),
                entity.getDbT5910_JigyoshaMeishoKana(),
                entity.getDbT5910_DaihyoshaNameKana(),
                dDbT5910_YubinNo,
                dbT5910_TelNo,
                entity.isDbT5910_JokyoFlag(),
                entity.getDbT5913_NinteiChosainNo(),
                entity.getDbT5913_ChosainKanaShimei(),
                entity.getDbT5913_ChosainShikaku(),
                entity.getDbT5913_ChosainShikaku(),
                entity.isDbT5913_JokyoFlag(),
                entity.getDbT5910_JigyoshaMeisho(),
                entity.getDbT5910_DaihyoshaName(),
                entity.getDbT5910_Jusho(),
                entity.getDbT5913_ChosainShimei(),
                entity.getDbT5913_Seibetsu(),
                entity.getDbT5913_ShozokuKikanName());
    }

    @Override
    protected void keyBreakProcess(ItakusakiChosainIchiranRelateEntity current) {
        if (hasBrek(getBefore(), current)) {
            ItakusakiChosainIchiranReport report = ItakusakiChosainIchiranReport.createFrom(headItem, bodyItem);
            report.writeBy(retortWrite);
            bodyItem = new ArrayList<>();
        }
    }

    private boolean hasBrek(ItakusakiChosainIchiranRelateEntity before, ItakusakiChosainIchiranRelateEntity current) {
        return !before.getDbT5910_NinteichosaItakusakiCode().equals(current.getDbT5910_NinteichosaItakusakiCode());
    }

    @Override
    protected void usualProcess(ItakusakiChosainIchiranRelateEntity entity) {
        bodyItem.add(setBodyItemm(entity));
    }
}