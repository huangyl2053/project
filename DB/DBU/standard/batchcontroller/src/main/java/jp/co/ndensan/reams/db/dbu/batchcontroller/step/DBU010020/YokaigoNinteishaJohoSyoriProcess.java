/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.batchcontroller.step.DBU010020;

import jp.co.ndensan.reams.db.dbu.definition.core.jigyohokoku.ShukeiNo;
import jp.co.ndensan.reams.db.dbu.definition.mybatisprm.jigyohokokugeppoippan.YokaigoNinteishaJohoSyoriMybatisParameter;
import jp.co.ndensan.reams.db.dbu.definition.processprm.jigyohokokugeppoippan.YokaigoNinteishaJohoSyoriProcessParameter;
import jp.co.ndensan.reams.db.dbu.entity.db.relate.jigyohokokugeppoippan.YokaigoNinteishaJohoKonkyoCSVEntity;
import jp.co.ndensan.reams.db.dbu.persistence.db.mapper.relate.jigyohokokugeppoippan.IJigyoHokokuGeppoIppanMapper;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvWriter;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogType;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogger;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.PersonalData;

/**
 * 受給者台帳情報処理クラスです。
 *
 * @reamsid_L DBU-5530-030 wangxiaodong
 */
public class YokaigoNinteishaJohoSyoriProcess extends BatchProcessBase<YokaigoNinteishaJohoKonkyoCSVEntity> {

    private static final RString MYBATIS_SELECT_ID = new RString("jp.co.ndensan.reams.db.dbu.persistence."
            + "db.mapper.relate.jigyohokokugeppoippan.IJigyoHokokuGeppoIppanMapper.getYokaigoNinteishaJohoKonkyoCSV");
    private static final RString 拡張子 = new RString(".CSV");
    private static final RString CSVファイル名_前部 = new RString("DBU01");
    private static final RString EUC_WRITER_DELIMITER = new RString(",");
    private static final RString EUC_WRITER_ENCLOSURE = new RString("\"");

    private YokaigoNinteishaJohoSyoriProcessParameter processParameter;
    private YokaigoNinteishaJohoSyoriMybatisParameter mybatisParameter;
    private IJigyoHokokuGeppoIppanMapper mapper;
    private RString 集計番号;

    @BatchWriter
    private CsvWriter<YokaigoNinteishaJohoKonkyoCSVEntity> csvWriter;

    @Override
    protected void initialize() {
        集計番号 = ShukeiNo.一般状況_11_要介護_要支援_認定者数.getコード();
        mybatisParameter = processParameter.toYokaigoNinteishaJohoSyoriMybatisParameter();
        mybatisParameter.setShukeiNo(new Code(集計番号));
        mapper = getMapper(IJigyoHokokuGeppoIppanMapper.class);
        RString filename = Path.combinePath(processParameter.get出力ファイルPATH(), CSVファイル名_前部.concat(集計番号).concat(拡張子));
        csvWriter = new CsvWriter.InstanceBuilder(filename).
                setEncode(Encode.UTF_8withBOM)
                .canAppend(true)
                .setDelimiter(EUC_WRITER_DELIMITER)
                .setEnclosure(EUC_WRITER_ENCLOSURE)
                .setNewLine(NewLine.CRLF)
                .hasHeader(true).build();
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MYBATIS_SELECT_ID, mybatisParameter);
    }

    @Override
    protected void beforeExecute() {
        mapper.exeYokaigoNinteishaDataInsert(mybatisParameter);
    }

    @Override
    protected void process(YokaigoNinteishaJohoKonkyoCSVEntity entity) {
        if (集計番号.equals(entity.get集計番号())) {
            csvWriter.writeLine(entity);
            AccessLogger.log(AccessLogType.照会, toPersonalData(entity.get被保険者番号()));
        }
    }

    private PersonalData toPersonalData(RString 被保険者番号) {
        ExpandedInformation expandedInfo = new ExpandedInformation(new Code("0003"), new RString("被保険者番号"), 被保険者番号);
        return PersonalData.of(ShikibetsuCode.EMPTY, expandedInfo);
    }
}
