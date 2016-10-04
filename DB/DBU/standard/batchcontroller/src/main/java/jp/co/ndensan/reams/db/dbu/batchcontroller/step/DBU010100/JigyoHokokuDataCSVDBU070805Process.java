/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.batchcontroller.step.DBU010100;

import jp.co.ndensan.reams.db.dbu.business.core.jigyohokokugeppohokenkyufukogakugassan.JigyoHokokuGeppoHokenkyufuKogakuGassan;
import jp.co.ndensan.reams.db.dbu.definition.core.jigyohokoku.ShukeiNo;
import jp.co.ndensan.reams.db.dbu.definition.processprm.jigyohokokugeppohokenkyufukogakugassan.JigyoHokokuGeppoHokenkyufuKogakuGassanProcessParamter;
import jp.co.ndensan.reams.db.dbu.entity.db.relate.jigyohokokugeppohokenkyufukogakugassan.JigyoHokokuDataCsvRelateEntity;
import jp.co.ndensan.reams.db.dbu.entity.euc.jigyohokokugeppohokenkyufukogakugassan.IJigyoHokokuGeppoHokenEUCEntity;
import jp.co.ndensan.reams.ur.urz.batchcontroller.step.writer.BatchWriters;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.ZipUtil;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvWriter;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.spool.FileSpoolManager;

/**
 * 根拠CSV作成のバッチ処理クラスです。
 *
 * @reamsid_L DBU-5590-030 zhangzhiming
 */
public class JigyoHokokuDataCSVDBU070805Process extends BatchProcessBase<JigyoHokokuDataCsvRelateEntity> {

    private static final RString MYBATIS_SELECT_ID = new RString(
            "jp.co.ndensan.reams.db.dbu.persistence.db.mapper.relate.jigyohokokugeppohokenkyufukogakugassan."
            + "IJigyoHokokuGeppoHokenkyufuKogakuGassanMapper.getJigyoHokokuDataCsv");
    private JigyoHokokuGeppoHokenkyufuKogakuGassanProcessParamter processParameter;
    private static final RString ダブル引用符 = new RString("\"");
    private static final RString コンマ = new RString(",");
    private FileSpoolManager manager;
    private RString eucFilePath;
    @BatchWriter
    private CsvWriter<IJigyoHokokuGeppoHokenEUCEntity> eucCsvWriter;
    private JigyoHokokuGeppoHokenkyufuKogakuGassan business;

    @Override
    protected void initialize() {
        business = new JigyoHokokuGeppoHokenkyufuKogakuGassan();
        manager = processParameter.getManager();
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MYBATIS_SELECT_ID, processParameter.toJigyoHokokuDataCSVMybitisParamter(ShukeiNo.合計_08.getコード()));
    }

    @Override
    protected void createWriter() {
        eucFilePath = Path.combinePath(processParameter.getCsvFilePath(), new RString("DBU070805.CSV"));
        eucCsvWriter = BatchWriters.csvWriter(IJigyoHokokuGeppoHokenEUCEntity.class)
                .filePath(eucFilePath)
                .setDelimiter(コンマ)
                .setEnclosure(ダブル引用符)
                .setEncode(Encode.UTF_8withBOM)
                .setNewLine(NewLine.CRLF)
                .hasHeader(true)
                .build();
    }

    @Override
    protected void process(JigyoHokokuDataCsvRelateEntity entity) {
        eucCsvWriter.writeLine(business.setEUCEntity(entity));
    }

    @Override
    protected void afterExecute() {
        eucCsvWriter.close();
        RString zipFilePath = new RString(Path.combinePath(processParameter.getCsvFilePath(),
                new RString("KonkyoCsv_HokenKyufuKetteJyokyou_Gassan.zip")).toString());
        ZipUtil.createFromFolder(zipFilePath, processParameter.getCsvFilePath());
        manager.spool(zipFilePath);
    }
}