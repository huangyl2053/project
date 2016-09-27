/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.batchcontroller.step.DBU020010;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbu.definition.processprm.jigyohokokurenkei.JigyoHokokuRenkeiProcessParameter;
import jp.co.ndensan.reams.db.dbu.entity.db.basic.DbT7021JigyoHokokuTokeiDataEntity;
import jp.co.ndensan.reams.db.dbu.entity.euc.jigyohokokurenkei.IJigyoHokokuRenkeiEucCsvEntity;
import jp.co.ndensan.reams.db.dbu.entity.euc.jigyohokokurenkei.JigyoHokokuRenkei24or26EucCsvEntity;
import jp.co.ndensan.reams.db.dbu.entity.euc.jigyohokokurenkei.JigyoHokokuRenkeiFooterEucCsvEntity;
import jp.co.ndensan.reams.db.dbu.entity.euc.jigyohokokurenkei.JigyoHokokuRenkeiHead2EucCsvEntity;
import jp.co.ndensan.reams.db.dbu.persistence.db.mapper.relate.jigyohokokurenkei.IJigyoHokokuRenkeiMapper;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBU;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT7051KoseiShichosonMasterEntity;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT7056GappeiShichosonEntity;
import jp.co.ndensan.reams.db.dbx.persistence.db.mapper.util.MapperProvider;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.euc.io.EucCsvWriter;
import jp.co.ndensan.reams.uz.uza.euc.io.EucEntityId;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 様式別連携情報作成のバッチ処理・保険給付決定状況現物分に対応するのCSV出力のプロセスクラスです。
 *
 * @reamsid_L DBU-4050-020 lijia
 */
public class JigyoHokokuRenkeiGassanYousikiNi_GoToRokuProcess extends BatchProcessBase<DbT7021JigyoHokokuTokeiDataEntity> {

    private RString myBatisSelsectId;
    private static final EucEntityId EUC_ENTITY_ID = new EucEntityId(new RString("JigyoHokokuRenkeiEucCsv"));
    private static final RString EUC_WRITER_DELIMITER = new RString(",");
    private static final RString EUC_WRITER_ENCLOSURE = new RString("\"");
    private RString eucFilePath;
    private static final RString H1 = new RString("H1");
    private static final RString 国民健康保険団体連合会 = new RString("国民健康保険団体連合会");
    private static final RString 番号_1 = new RString("1");
    private static final RString 番号_2 = new RString("2");
    private static final RString 番号_3 = new RString("3");
    private static final RString 番号_4 = new RString("4");
    private static final RString 番号_5 = new RString("5");
    private static final RString 番号_6 = new RString("6");
    private static final RString 番号_7 = new RString("7");
    private static final RString 番号_8 = new RString("8");
    private static final RString 番号_9 = new RString("9");
    private static final RString 番号_10 = new RString("10");
    private static final RString 番号_11 = new RString("11");
    private static final RString 番号_12 = new RString("12");
    private static final RString 番号_13 = new RString("13");
    private static final RString 番号_14 = new RString("14");
    private static final RString 番号_15 = new RString("15");
    private static final RString 番号_16 = new RString("16");
    private static final RString 番号_17 = new RString("17");
    private static final RString 集計番号_0105 = new RString("0105");
    private static final RString 集計番号_0106 = new RString("0106");
    private static final RString 集計番号_0205 = new RString("0205");
    private static final RString 集計番号_0206 = new RString("0206");
    private static final RString ア_件数 = new RString("ア　件数");
    private static final RString イ_件数 = new RString("イ　給付費");
    private static final RString 番号 = new RString("保険者番号");
    private static final RString 名称 = new RString("保険者名称");
    private final JigyoHokokuRenkei24or26EucCsvEntity 食費Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 食費_介護老人福祉施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 食費_介護老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 食費_介護療養型医療施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 食費_地域密着型介護老人福祉Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 食費_短期入所生活介護Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 食費_老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 食費_介護療養型医療施設等Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 居住_滞在費Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 居住_介護老人福祉施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 居住_介護老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 居住_介護療養型医療施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 居住_地域密着型介護老人福祉Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 居住_短期入所生活介護Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 居住_老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 居住_療養型医療施設等Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 総計Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_食費Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_食費_介護老人福祉施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_食費_介護老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_食費_介護療養型医療施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_食費_地域密着型介護老人福祉Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_食費_短期入所生活介護Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_食費_老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_食費_介護療養型医療施設等Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_居住_滞在費Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_居住_介護老人福祉施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_居住_介護老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_居住_介護療養型医療施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_居住_地域密着型介護老人福祉Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_居住_短期入所生活介護Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_居住_老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_居住_療養型医療施設等Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 給付費_総計Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_食費Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_食費_介護老人福祉施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_食費_介護老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_食費_介護療養型医療施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_食費_地域密着型介護老人福祉Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_食費_短期入所生活介護Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_食費_老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_食費_介護療養型医療施設等Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_居住_滞在費Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_居住_介護老人福祉施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_居住_介護老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_居住_介護療養型医療施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_居住_地域密着型介護老人福祉Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_居住_短期入所生活介護Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_居住_老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_居住_療養型医療施設等Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_総計Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_食費Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_食費_介護老人福祉施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_食費_介護老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_食費_介護療養型医療施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_食費_地域密着型介護老人福祉Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_食費_短期入所生活介護Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_食費_老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_食費_介護療養型医療施設等Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_居住_滞在費Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_居住_介護老人福祉施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_居住_介護老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_居住_介護療養型医療施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_居住_地域密着型介護老人福祉Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_居住_短期入所生活介護Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_居住_老人保健施設Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_居住_療養型医療施設等Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity 第２号_給付費_総計Entity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private final JigyoHokokuRenkei24or26EucCsvEntity eucCsvEntity = new JigyoHokokuRenkei24or26EucCsvEntity();
    private RString csvFileName;
    private final RDate 基準日 = RDate.getNowDate();
    private JigyoHokokuRenkeiProcessParameter processParameter;
    private static MapperProvider mapperProvider;
    private IJigyoHokokuRenkeiMapper mapper;
    private Map<RString, List<RString>> 保険者番号data;
    private Map<RString, List<RString>> 保険者名称data;

    @Override
    protected void initialize() {
        if (processParameter.is出力_保険給付決定状況合算_審査年月()) {
            myBatisSelsectId = new RString(
                    "jp.co.ndensan.reams.db.dbu.persistence.db.mapper.relate.jigyohokokurenkei.IJigyoHokokuRenkeiMapper."
                    + "get保険給付決定状況合算分審査年月情報の取得");
        }
        if (processParameter.is出力_保険給付決定状況合算_決定年月()) {
            myBatisSelsectId = new RString(
                    "jp.co.ndensan.reams.db.dbu.persistence.db.mapper.relate.jigyohokokurenkei.IJigyoHokokuRenkeiMapper."
                    + "get保険給付決定状況合算分決定年月情報の取得");
        }
        mapperProvider = InstanceProvider.create(MapperProvider.class);
        mapper = mapperProvider.create(IJigyoHokokuRenkeiMapper.class);
        保険者番号data = new HashMap<>();
        保険者名称data = new HashMap<>();
        List<RString> 保険者番号List = new ArrayList<>();
        List<RString> 保険者名称List = new ArrayList<>();
        if (processParameter.is旧保険者分()) {
            List<DbT7056GappeiShichosonEntity> 合併市町村data = mapper.get合併市町村の取得(processParameter.toMybatisParamter());
            for (DbT7056GappeiShichosonEntity dbT7056entity : 合併市町村data) {
                保険者番号List.add(get旧保険者番号(dbT7056entity.getKyuHokenshaNo()));
                保険者名称List.add(dbT7056entity.getKyuShichosonMeisho());
            }
        } else if (processParameter.is構成市町村分()) {
            List<DbT7051KoseiShichosonMasterEntity> 構成市町村data = mapper.get構成市町村マスタの取得(processParameter.toMybatisParamter());
            for (DbT7051KoseiShichosonMasterEntity dbT7051entity : 構成市町村data) {
                保険者番号List.add(get証記載保険者番号(dbT7051entity.getShoKisaiHokenshaNo()));
                保険者名称List.add(dbT7051entity.getShichosonMeisho());
            }
        } else {
            保険者番号List.add(DbBusinessConfig.get(ConfigNameDBU.保険者情報_保険者番号, 基準日, SubGyomuCode.DBU介護統計報告));
            保険者名称List.add(DbBusinessConfig.get(ConfigNameDBU.保険者情報_保険者名称, 基準日, SubGyomuCode.DBU介護統計報告));
        }
        保険者番号data.put(番号, 保険者番号List);
        保険者名称data.put(名称, 保険者名称List);
        csvFileName = new RString("tmp.csv");
    }

    @BatchWriter
    private EucCsvWriter<IJigyoHokokuRenkeiEucCsvEntity> eucCsvWriter;

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(myBatisSelsectId, processParameter.toMybatisParamter());
    }

    @Override
    protected void createWriter() {
        RString spoolWorkPath = processParameter.getSpoolWorkPath();
        eucFilePath = Path.combinePath(spoolWorkPath, csvFileName);
        eucCsvWriter = new EucCsvWriter.InstanceBuilder(eucFilePath, EUC_ENTITY_ID).
                setEncode(Encode.SJIS)
                .setDelimiter(EUC_WRITER_DELIMITER)
                .setEnclosure(EUC_WRITER_ENCLOSURE)
                .setNewLine(NewLine.CRLF)
                .hasHeader(false).
                build();
    }

    @Override
    protected void process(DbT7021JigyoHokokuTokeiDataEntity entity) {
        get総数_件数のデータ編集(entity);
        get総数_給付費のデータ編集(entity);
        get第２号被保険者分_件数のデータ編集(entity);
        get第２号被保険者分_給付費のデータ編集(entity);
    }

    @Override
    protected void afterExecute() {
        boolean flag = true;
        int i = 0;
        RString 保険者番号bak = RString.EMPTY;
        for (RString 保険者番号 : 保険者番号data.get(番号)) {
            if (!保険者番号bak.equals(保険者番号)) {
                eucCsvWriter.close();
                tempCsv(flag);
                flag = false;
                RStringBuilder filePath = new RStringBuilder();
                filePath.append("DUJRENF11_");
                filePath.append(processParameter.get過去集計年月());
                filePath.append("_");
                filePath.append(保険者番号);
                filePath.append(".csv");
                setFilePath(filePath);
                保険者番号bak = 保険者番号;
            }
            get様式２の５_様式２の６のCSV出力(保険者番号, 保険者名称data.get(名称).get(i));
            i++;
        }
        eucCsvWriter.close();
    }

    private void tempCsv(boolean flag) {
        if (flag) {
            File tmpfile = new File(eucFilePath.toString());
            if (tmpfile.exists()) {
                tmpfile.delete();
            }
        }
    }

    private void setFilePath(RStringBuilder filePath) {
        eucFilePath = Path.combinePath(processParameter.getSpoolWorkPath(), filePath.toRString());
        eucCsvWriter = new EucCsvWriter.InstanceBuilder(eucFilePath, EUC_ENTITY_ID).
                setEncode(Encode.SJIS)
                .setDelimiter(EUC_WRITER_DELIMITER)
                .setEnclosure(EUC_WRITER_ENCLOSURE)
                .setNewLine(NewLine.CRLF)
                .hasHeader(false).
                build();
    }

    private void get様式２の５_様式２の６のCSV出力(RString 保険者番号, RString 保険者名称) {
        eucCsvWriter.writeLine(setヘッダレコード(ア_件数, イ_件数, 保険者番号, 保険者名称));
        eucCsvWriter.writeLine(eucCsvEntity);
        eucCsvWriter.writeLine(食費Entity);
        eucCsvWriter.writeLine(食費_介護老人福祉施設Entity);
        eucCsvWriter.writeLine(食費_介護老人保健施設Entity);
        eucCsvWriter.writeLine(食費_介護療養型医療施設Entity);
        eucCsvWriter.writeLine(食費_地域密着型介護老人福祉Entity);
        eucCsvWriter.writeLine(食費_短期入所生活介護Entity);
        eucCsvWriter.writeLine(食費_老人保健施設Entity);
        eucCsvWriter.writeLine(食費_介護療養型医療施設等Entity);
        eucCsvWriter.writeLine(居住_滞在費Entity);
        eucCsvWriter.writeLine(居住_介護老人福祉施設Entity);
        eucCsvWriter.writeLine(居住_介護老人保健施設Entity);
        eucCsvWriter.writeLine(居住_介護療養型医療施設Entity);
        eucCsvWriter.writeLine(居住_地域密着型介護老人福祉Entity);
        eucCsvWriter.writeLine(居住_短期入所生活介護Entity);
        eucCsvWriter.writeLine(居住_老人保健施設Entity);
        eucCsvWriter.writeLine(居住_療養型医療施設等Entity);
        eucCsvWriter.writeLine(総計Entity);
        eucCsvWriter.writeLine(eucCsvEntity);
        eucCsvWriter.writeLine(給付費_食費Entity);
        eucCsvWriter.writeLine(給付費_食費_介護老人福祉施設Entity);
        eucCsvWriter.writeLine(給付費_食費_介護老人保健施設Entity);
        eucCsvWriter.writeLine(給付費_食費_介護療養型医療施設Entity);
        eucCsvWriter.writeLine(給付費_食費_地域密着型介護老人福祉Entity);
        eucCsvWriter.writeLine(給付費_食費_短期入所生活介護Entity);
        eucCsvWriter.writeLine(給付費_食費_老人保健施設Entity);
        eucCsvWriter.writeLine(給付費_食費_介護療養型医療施設等Entity);
        eucCsvWriter.writeLine(給付費_居住_滞在費Entity);
        eucCsvWriter.writeLine(給付費_居住_介護老人福祉施設Entity);
        eucCsvWriter.writeLine(給付費_居住_介護老人保健施設Entity);
        eucCsvWriter.writeLine(給付費_居住_介護療養型医療施設Entity);
        eucCsvWriter.writeLine(給付費_居住_地域密着型介護老人福祉Entity);
        eucCsvWriter.writeLine(給付費_居住_短期入所生活介護Entity);
        eucCsvWriter.writeLine(給付費_居住_老人保健施設Entity);
        eucCsvWriter.writeLine(給付費_居住_療養型医療施設等Entity);
        eucCsvWriter.writeLine(給付費_総計Entity);
        eucCsvWriter.writeLine(setヘッダレコード(ア_件数, イ_件数, 保険者番号, 保険者名称));
        eucCsvWriter.writeLine(eucCsvEntity);
        eucCsvWriter.writeLine(第２号_食費Entity);
        eucCsvWriter.writeLine(第２号_食費_介護老人福祉施設Entity);
        eucCsvWriter.writeLine(第２号_食費_介護老人保健施設Entity);
        eucCsvWriter.writeLine(第２号_食費_介護療養型医療施設Entity);
        eucCsvWriter.writeLine(第２号_食費_地域密着型介護老人福祉Entity);
        eucCsvWriter.writeLine(第２号_食費_短期入所生活介護Entity);
        eucCsvWriter.writeLine(第２号_食費_老人保健施設Entity);
        eucCsvWriter.writeLine(第２号_食費_介護療養型医療施設等Entity);
        eucCsvWriter.writeLine(第２号_居住_滞在費Entity);
        eucCsvWriter.writeLine(第２号_居住_介護老人福祉施設Entity);
        eucCsvWriter.writeLine(第２号_居住_介護老人保健施設Entity);
        eucCsvWriter.writeLine(第２号_居住_介護療養型医療施設Entity);
        eucCsvWriter.writeLine(第２号_居住_地域密着型介護老人福祉Entity);
        eucCsvWriter.writeLine(第２号_居住_短期入所生活介護Entity);
        eucCsvWriter.writeLine(第２号_居住_老人保健施設Entity);
        eucCsvWriter.writeLine(第２号_居住_療養型医療施設等Entity);
        eucCsvWriter.writeLine(第２号_総計Entity);
        eucCsvWriter.writeLine(eucCsvEntity);
        eucCsvWriter.writeLine(第２号_給付費_食費Entity);
        eucCsvWriter.writeLine(第２号_給付費_食費_介護老人福祉施設Entity);
        eucCsvWriter.writeLine(第２号_給付費_食費_介護老人保健施設Entity);
        eucCsvWriter.writeLine(第２号_給付費_食費_介護療養型医療施設Entity);
        eucCsvWriter.writeLine(第２号_給付費_食費_地域密着型介護老人福祉Entity);
        eucCsvWriter.writeLine(第２号_給付費_食費_短期入所生活介護Entity);
        eucCsvWriter.writeLine(第２号_給付費_食費_老人保健施設Entity);
        eucCsvWriter.writeLine(第２号_給付費_食費_介護療養型医療施設等Entity);
        eucCsvWriter.writeLine(第２号_給付費_居住_滞在費Entity);
        eucCsvWriter.writeLine(第２号_給付費_居住_介護老人福祉施設Entity);
        eucCsvWriter.writeLine(第２号_給付費_居住_介護老人保健施設Entity);
        eucCsvWriter.writeLine(第２号_給付費_居住_介護療養型医療施設Entity);
        eucCsvWriter.writeLine(第２号_給付費_居住_地域密着型介護老人福祉Entity);
        eucCsvWriter.writeLine(第２号_給付費_居住_短期入所生活介護Entity);
        eucCsvWriter.writeLine(第２号_給付費_居住_老人保健施設Entity);
        eucCsvWriter.writeLine(第２号_給付費_居住_療養型医療施設等Entity);
        eucCsvWriter.writeLine(第２号_給付費_総計Entity);
        eucCsvWriter.writeLine(set終了レコード());
    }

    private JigyoHokokuRenkeiHead2EucCsvEntity setヘッダレコード(RString 先頭項目_件数, RString 先頭項目_給付費, RString 保険者番号, RString 保険者名称) {
        return new JigyoHokokuRenkeiHead2EucCsvEntity(
                先頭項目_件数,
                先頭項目_給付費,
                RString.EMPTY,
                H1,
                dateFomart(new RString(processParameter.get過去集計年月() + "01")),
                dateFomart(RDate.getNowDate().toDateString()),
                国民健康保険団体連合会,
                保険者番号,
                保険者名称
        );
    }

    private JigyoHokokuRenkeiFooterEucCsvEntity set終了レコード() {
        return new JigyoHokokuRenkeiFooterEucCsvEntity(
                RString.EMPTY,
                new RString("E")
        );
    }

    private void get総数_件数のデータ編集(DbT7021JigyoHokokuTokeiDataEntity entity) {
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_1, 食費Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_4, 食費_介護老人福祉施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_5, 食費_介護老人保健施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_6, 食費_介護療養型医療施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_16, 食費_地域密着型介護老人福祉Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_7, 食費_短期入所生活介護Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_8, 食費_老人保健施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_9, 食費_介護療養型医療施設等Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_2, 居住_滞在費Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_10, 居住_介護老人福祉施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_11, 居住_介護老人保健施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_12, 居住_介護療養型医療施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_17, 居住_地域密着型介護老人福祉Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_13, 居住_短期入所生活介護Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_14, 居住_老人保健施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_15, 居住_療養型医療施設等Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0105, 番号_3, 総計Entity, ア_件数);
    }

    private void get総数_給付費のデータ編集(DbT7021JigyoHokokuTokeiDataEntity entity) {
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_1, 給付費_食費Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_4, 給付費_食費_介護老人福祉施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_5, 給付費_食費_介護老人保健施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_6, 給付費_食費_介護療養型医療施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_16, 給付費_食費_地域密着型介護老人福祉Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_7, 給付費_食費_短期入所生活介護Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_8, 給付費_食費_老人保健施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_9, 給付費_食費_介護療養型医療施設等Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_2, 給付費_居住_滞在費Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_10, 給付費_居住_介護老人福祉施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_11, 給付費_居住_介護老人保健施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_12, 給付費_居住_介護療養型医療施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_17, 給付費_居住_地域密着型介護老人福祉Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_13, 給付費_居住_短期入所生活介護Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_14, 給付費_居住_老人保健施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_15, 給付費_居住_療養型医療施設等Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0106, 番号_3, 給付費_総計Entity, イ_件数);
    }

    private void get第２号被保険者分_件数のデータ編集(DbT7021JigyoHokokuTokeiDataEntity entity) {
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_1, 第２号_食費Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_4, 第２号_食費_介護老人福祉施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_5, 第２号_食費_介護老人保健施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_6, 第２号_食費_介護療養型医療施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_16, 第２号_食費_地域密着型介護老人福祉Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_7, 第２号_食費_短期入所生活介護Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_8, 第２号_食費_老人保健施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_9, 第２号_食費_介護療養型医療施設等Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_2, 第２号_居住_滞在費Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_10, 第２号_居住_介護老人福祉施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_11, 第２号_居住_介護老人保健施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_12, 第２号_居住_介護療養型医療施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_17, 第２号_居住_地域密着型介護老人福祉Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_13, 第２号_居住_短期入所生活介護Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_14, 第２号_居住_老人保健施設Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_15, 第２号_居住_療養型医療施設等Entity, ア_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0205, 番号_3, 第２号_総計Entity, ア_件数);
    }

    private void get第２号被保険者分_給付費のデータ編集(DbT7021JigyoHokokuTokeiDataEntity entity) {
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_1, 第２号_給付費_食費Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_4, 第２号_給付費_食費_介護老人福祉施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_5, 第２号_給付費_食費_介護老人保健施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_6, 第２号_給付費_食費_介護療養型医療施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_16, 第２号_給付費_食費_地域密着型介護老人福祉Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_7, 第２号_給付費_食費_短期入所生活介護Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_8, 第２号_給付費_食費_老人保健施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_9, 第２号_給付費_食費_介護療養型医療施設等Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_2, 第２号_給付費_居住_滞在費Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_10, 第２号_給付費_居住_介護老人福祉施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_11, 第２号_給付費_居住_介護老人保健施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_12, 第２号_給付費_居住_介護療養型医療施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_17, 第２号_給付費_居住_地域密着型介護老人福祉Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_13, 第２号_給付費_居住_短期入所生活介護Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_14, 第２号_給付費_居住_老人保健施設Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_15, 第２号_給付費_居住_療養型医療施設等Entity, イ_件数);
        get様式２から様式２の６のデータ編集(entity, 集計番号_0206, 番号_3, 第２号_給付費_総計Entity, イ_件数);
    }

    private void get様式２から様式２の６のデータ編集(
            DbT7021JigyoHokokuTokeiDataEntity entity,
            RString 集計番号,
            RString 縦番号,
            JigyoHokokuRenkei24or26EucCsvEntity eucCsvEntity, RString 先頭項目) {
        eucCsvEntity.setレコード種別番号(new RString("D1"));
        eucCsvEntity.set交換情報識別番号(RString.EMPTY);
        eucCsvEntity.set先頭項目(先頭項目);
        if (集計番号.equals(entity.getShukeiNo().getColumnValue()) && 縦番号.equals(new RString(entity.getTateNo().toString()))) {
            if (番号_9.equals(new RString(entity.getYokoNo().toString()))) {
                eucCsvEntity.set要支援１(new RString(entity.getShukeiKekkaAtai().toString()));
            }
            if (番号_10.equals(new RString(entity.getYokoNo().toString()))) {
                eucCsvEntity.set要支援２(new RString(entity.getShukeiKekkaAtai().toString()));
            }
            if (番号_11.equals(new RString(entity.getYokoNo().toString()))) {
                eucCsvEntity.set計_予防給付(new RString(entity.getShukeiKekkaAtai().toString()));
            }
            if (番号_2.equals(new RString(entity.getYokoNo().toString()))) {
                eucCsvEntity.set経過的要介護(new RString(entity.getShukeiKekkaAtai().toString()));
            }
            if (番号_3.equals(new RString(entity.getYokoNo().toString()))) {
                eucCsvEntity.set要介護１(new RString(entity.getShukeiKekkaAtai().toString()));
            }
            if (番号_4.equals(new RString(entity.getYokoNo().toString()))) {
                eucCsvEntity.set要介護２(new RString(entity.getShukeiKekkaAtai().toString()));
            }
            if (番号_5.equals(new RString(entity.getYokoNo().toString()))) {
                eucCsvEntity.set要介護３(new RString(entity.getShukeiKekkaAtai().toString()));
            }
            if (番号_6.equals(new RString(entity.getYokoNo().toString()))) {
                eucCsvEntity.set要介護４(new RString(entity.getShukeiKekkaAtai().toString()));
            }
            if (番号_7.equals(new RString(entity.getYokoNo().toString()))) {
                eucCsvEntity.set要介護５(new RString(entity.getShukeiKekkaAtai().toString()));
            }
            if (番号_8.equals(new RString(entity.getYokoNo().toString()))) {
                eucCsvEntity.set計_介護給付(new RString(entity.getShukeiKekkaAtai().toString()));
            }
            if (番号_12.equals(new RString(entity.getYokoNo().toString()))) {
                eucCsvEntity.set計(new RString(entity.getShukeiKekkaAtai().toString()));
            }
        }
    }

    private RString dateFomart(RString 年月日) {
        if (年月日 == null || 年月日.isEmpty()) {
            return RString.EMPTY;
        }
        FlexibleDate flexibleDate = new FlexibleDate(年月日);
        return flexibleDate.seireki().separator(Separator.SLASH).fillType(FillType.ZERO).toDateString();
    }

    private RString get旧保険者番号(HokenshaNo date) {
        if (date == null || date.isEmpty()) {
            return RString.EMPTY;
        }
        return date.value();
    }

    private RString get証記載保険者番号(ShoKisaiHokenshaNo date) {
        if (date == null || date.isEmpty()) {
            return RString.EMPTY;
        }
        return date.value();
    }
}
