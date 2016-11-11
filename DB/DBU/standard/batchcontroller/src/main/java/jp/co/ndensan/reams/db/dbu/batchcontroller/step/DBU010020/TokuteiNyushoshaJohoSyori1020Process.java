/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.batchcontroller.step.DBU010020;

import jp.co.ndensan.reams.db.dbu.definition.core.jigyohokoku.ShukeiNo;
import jp.co.ndensan.reams.db.dbu.definition.mybatisprm.jigyohokokugeppoippan.TokuteiNyushoshaJohoSyoriMybatisParameter;
import jp.co.ndensan.reams.db.dbu.definition.processprm.jigyohokokugeppoippan.TokuteiNyushoshaJohoSyoriProcessParameter;
import jp.co.ndensan.reams.db.dbu.entity.db.relate.jigyohokokugeppoippan.TokuteiNyushoshaGengakuNinteiJohoCSVEntity;
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
 * 特定入所者管理情報処理のバッチ処理クラスです。
 *
 * @reamsid_L DBU-5530-030 wangxiaodong
 */
public class TokuteiNyushoshaJohoSyori1020Process extends BatchProcessBase<TokuteiNyushoshaGengakuNinteiJohoCSVEntity> {

    private static final RString MYBATIS_SELECT_ID = new RString("jp.co.ndensan.reams.db.dbu.persistence."
            + "db.mapper.relate.jigyohokokugeppoippan.IJigyoHokokuGeppoIppanMapper.getTokuteiNyushoshaGengakuNinteiJohoCSV");
    private static final RString 拡張子 = new RString(".CSV");
    private static final RString CSVファイル名_前部 = new RString("DBU01");
    private static final RString EUC_WRITER_DELIMITER = new RString(",");
    private static final RString EUC_WRITER_ENCLOSURE = new RString("\"");

    private TokuteiNyushoshaJohoSyoriProcessParameter processParameter;
    private TokuteiNyushoshaJohoSyoriMybatisParameter mybatisParameter;
    private IJigyoHokokuGeppoIppanMapper mapper;
    private RString 集計番号;

    @BatchWriter
    private CsvWriter<TokuteiNyushoshaGengakuNinteiJohoCSVEntity> csvWriter;

    @Override
    protected void initialize() {
        集計番号 = ShukeiNo.一般状況_8_介護老人福祉施設旧措置入所者に係る減額_免除認定_再掲_第2号被保険者分_特定負担限度額.getコード();
        mybatisParameter = processParameter.toTokuteiNyushoshaJohoSyoriMybatisParameter();
        mybatisParameter.setShukeiNo(new Code(集計番号));
        mapper = getMapper(IJigyoHokokuGeppoIppanMapper.class);
        csvWriter = new CsvWriter.InstanceBuilder(Path.combinePath(processParameter.get出力ファイルPATH(), CSVファイル名_前部.concat(集計番号).concat(拡張子))).
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
        mapper.exeTokuteiNyushoshaDataInsert(mybatisParameter);
    }

    @Override
    protected void process(TokuteiNyushoshaGengakuNinteiJohoCSVEntity entity) {
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