/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.batchcontroller.step.DBE561001;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.definition.mybatisprm.centertransmission.CenterTransmissionMybitisParamter;
import jp.co.ndensan.reams.db.dbe.definition.processprm.centertransmission.CenterTransmissionProcessParameter;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.centertransmission.CenterTransmissionCsvEntity;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.centertransmission.CenterTransmissionEditEntity;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.centertransmission.CenterTransmissionEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBE;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.shinsei.NinteiShinseiShinseijiKubunCode;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.core.date.DateEditor;
import jp.co.ndensan.reams.ur.urz.business.report.outputjokenhyo.EucFileOutputJokenhyoItem;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.OutputJokenhyoFactory;
import jp.co.ndensan.reams.uz.uza.batch.batchexecutor.util.JobContextHolder;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.batch.process.OutputParameter;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.euc.api.EucOtherInfo;
import jp.co.ndensan.reams.uz.uza.euc.definition.UzUDE0831EucAccesslogFileType;
import jp.co.ndensan.reams.uz.uza.euc.io.EucEntityId;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvWriter;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogType;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogger;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.PersonalData;
import jp.co.ndensan.reams.uz.uza.spool.FileSpoolManager;
import jp.co.ndensan.reams.uz.uza.spool.entities.UzUDE0835SpoolOutputType;

/**
 * センター送信データ作成のProcessクラスです。
 *
 * @reamsid_L DBE-1520-020 wangxiaodong
 */
public class CenterTransmissionProcess extends BatchProcessBase<CenterTransmissionEntity> {

    private static final RString SELECT_SHUJIIIKENSHOIKENITEM = new RString("jp.co.ndensan.reams.db.dbe"
            + ".persistence.db.mapper.relate.centertransmission.ICenterTransmissionMapper.getCenterTransmissionData");
    private static final EucEntityId EUC_ENTITY_ID = new EucEntityId(new RString("DBE561001"));
    private static final RString EUC_WRITER_DELIMITER = new RString(",");
    private static final RString EUC_WRITER_ENCLOSURE = RString.EMPTY;

    private CenterTransmissionProcessParameter parameter;
    private CenterTransmissionMybitisParamter mybitisParamter;
    private CenterTransmissionEntity beforeEntity;
    private FileSpoolManager manager;
    private RString filename;
    private RString ファイル名;
    private int シーケンシャル番号;
    private int 出力データ件数;

    private static final RString 出力する = new RString("出力する");
    private static final RString 出力しない = new RString("出力しない");
    private static final RString 未出力のみ = new RString("未出力のみ");
    private static final RString 出力済みも含む = new RString("出力済みも含む");

    /**
     * データ有無の判定です。
     */
    public static final RString OUTPUTSHINSEISHOKANRINO;

    static {
        OUTPUTSHINSEISHOKANRINO = new RString("outputShinseishoKanriNo");
    }
    private OutputParameter<List<RString>> outputShinseishoKanriNo;
    private List<RString> 出力された申請書管理番号;

    @BatchWriter
    private CsvWriter<CenterTransmissionCsvEntity> csvWriterCenterTransmission;

    @Override
    protected void initialize() {
        outputShinseishoKanriNo = new OutputParameter<>();
        シーケンシャル番号 = 0;
        出力データ件数 = 0;
        出力された申請書管理番号 = new ArrayList<>();
        mybitisParamter = parameter.toCenterTransmissionMybitisParamter();
        if (parameter.is転入死亡情報出力()) {
            List<RString> shinseijiKubunCodeList = new ArrayList<>();
            shinseijiKubunCodeList.add(NinteiShinseiShinseijiKubunCode.転入申請.getコード());
            shinseijiKubunCodeList.add(NinteiShinseiShinseijiKubunCode.資格喪失_死亡.getコード());
            mybitisParamter.setShinseijiKubunCodeList(shinseijiKubunCodeList);
        }
        mybitisParamter.setGaikyoChosaTextImageKubun(DbBusinessConfig.get(ConfigNameDBE.概況調査テキストイメージ区分, RDate.getNowDate(), SubGyomuCode.DBE認定支援));
        ファイル名 = EucOtherInfo.getDisplayName(SubGyomuCode.DBE認定支援, EUC_ENTITY_ID.toRString());
        manager = new FileSpoolManager(UzUDE0835SpoolOutputType.EucOther, EUC_ENTITY_ID, UzUDE0831EucAccesslogFileType.Csv);
        RString spoolWorkPath = manager.getEucOutputDirectry();
        filename = Path.combinePath(spoolWorkPath, ファイル名);
        csvWriterCenterTransmission = new CsvWriter.InstanceBuilder(filename).
                setEncode(Encode.SJIS)
                .canAppend(true)
                .setDelimiter(EUC_WRITER_DELIMITER)
                .setEnclosure(EUC_WRITER_ENCLOSURE)
                .setNewLine(NewLine.CRLF)
                .hasHeader(false).build();
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(SELECT_SHUJIIIKENSHOIKENITEM, mybitisParamter);
    }

    @Override
    protected void process(CenterTransmissionEntity currentEntity) {
        int 連番 = 0;
        シーケンシャル番号 = シーケンシャル番号 + 1;
        出力データ件数 = 出力データ件数 + 1;
        if (is死亡データ(beforeEntity, currentEntity)) {
            連番 = 1;
        }
        csvWriterCenterTransmission.writeLine(new CenterTransmissionEditEntity(currentEntity, シーケンシャル番号, 連番).getファイル出力項目());
        beforeEntity = currentEntity;
        RString 申請書管理番号 = currentEntity.getShinseishoKanriNo().value();
        if (!出力された申請書管理番号.contains(申請書管理番号)) {
            出力された申請書管理番号.add(申請書管理番号);
            AccessLogger.log(AccessLogType.照会, toPersonalData(申請書管理番号));
        }
    }

    private boolean is死亡データ(CenterTransmissionEntity before, CenterTransmissionEntity current) {

        if (before == null) {
            return false;
        } else {
            return before.getNinteiShinseiYMD().equals(current.getNinteiShinseiYMD())
                    && before.getShoKisaiHokenshaNo().equals(current.getShoKisaiHokenshaNo())
                    && before.getHihokenshaNo().equals(current.getHihokenshaNo());
        }
    }

    @Override
    protected void afterExecute() {
        outputShinseishoKanriNo.setValue(出力された申請書管理番号);
        outputJokenhyoFactory();
        csvWriterCenterTransmission.close();
        if (出力データ件数 != 0) {
            manager.spool(filename);
        }
    }

    private PersonalData toPersonalData(RString 申請書管理番号) {
        ExpandedInformation expandedInfo = new ExpandedInformation(new Code("0001"), new RString("申請書管理番号"), 申請書管理番号);
        return PersonalData.of(ShikibetsuCode.EMPTY, expandedInfo);
    }

    private void outputJokenhyoFactory() {
        Association association = AssociationFinderFactory.createInstance().getAssociation();
        EucFileOutputJokenhyoItem item = new EucFileOutputJokenhyoItem(
                new RString("認定支援センター送信ファイル"),
                association.getLasdecCode_().value(),
                association.get市町村名(),
                new RString(JobContextHolder.getJobId()),
                ファイル名,
                EUC_ENTITY_ID.toRString(),
                new RString(出力データ件数),
                contribute());
        OutputJokenhyoFactory.createInstance(item).print();
    }

    private List<RString> contribute() {
        List<RString> 出力条件 = new ArrayList<>();
        出力条件.add(条件(new RString("【データ出力区分】"), getデータ出力区分For出力条件(parameter.is未出力のみ())));
        if (FlexibleDate.canConvert(parameter.get二次判定開始日())) {
            出力条件.add(条件(new RString("【二次判定日(開始)】"), DateEditor.to和暦(new FlexibleDate(parameter.get二次判定開始日().toString()))));
        } else {
            出力条件.add(条件(new RString("【二次判定日(開始)】"), RString.EMPTY));
        }
        if (FlexibleDate.canConvert(parameter.get二次判定終了日())) {
            出力条件.add(条件(new RString("【二次判定日(終了)】"), DateEditor.to和暦(new FlexibleDate(parameter.get二次判定終了日().toString()))));
        } else {
            出力条件.add(条件(new RString("【二次判定日(終了)】"), RString.EMPTY));
        }
        出力条件.add(条件(new RString("【転入/死亡情報出力区分】"), get情報出力区分For出力条件(parameter.is転入死亡情報出力())));
        return 出力条件;
    }

    private RString 条件(RString バッチパラメータ名, RString 値) {
        RStringBuilder 条件 = new RStringBuilder();
        条件.append(バッチパラメータ名);
        条件.append(値);
        return 条件.toRString();
    }

    private RString getデータ出力区分For出力条件(boolean is未出力のみ) {
        if (is未出力のみ) {
            return 未出力のみ;
        }
        return 出力済みも含む;
    }

    private RString get情報出力区分For出力条件(boolean is情報出力) {
        if (is情報出力) {
            return 出力する;
        }
        return 出力しない;
    }
}
