/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC710050;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbc.business.euc.hanyolistkyodojukyusha.HanyoListKyodoJukyushaCsvEntityEditor;
import jp.co.ndensan.reams.db.dbc.definition.batchprm.hanyolist.kyodoshoriyojukyushajoho.HizukeChushutsuKubun;
import jp.co.ndensan.reams.db.dbc.definition.processprm.dbc710050.HanyoListKyodoJukyushaProcessParameter;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc710050.KyodoJukyushaKihonEntity;
import jp.co.ndensan.reams.db.dbx.business.core.koseishichoson.KoseiShichosonMaster;
import jp.co.ndensan.reams.db.dbx.service.core.koseishichoson.KoseiShichosonJohoFinder;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoKyotsu;
import jp.co.ndensan.reams.db.dbz.service.core.basic.ChohyoSeigyoKyotsuManager;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.report.outputjokenhyo.ReportOutputJokenhyoItem;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.OutputJokenhyoFactory;
import jp.co.ndensan.reams.uz.uza.batch.batchexecutor.util.JobContextHolder;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.euc.definition.UzUDE0831EucAccesslogFileType;
import jp.co.ndensan.reams.uz.uza.euc.io.EucEntityId;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvListWriter;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogger;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.PersonalData;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.uuid.AccessLogUUID;
import jp.co.ndensan.reams.uz.uza.spool.FileSpoolManager;
import jp.co.ndensan.reams.uz.uza.spool.entities.UzUDE0835SpoolOutputType;

/**
 * 汎用リスト_共同処理用受給者情報（基本）のバッチ用パラメータフロークラスです。
 *
 * @reamsid_L DBC-3097-020 qinzhen
 */
public class HanyoListKyodoJukyushaOutputProcess extends BatchProcessBase<KyodoJukyushaKihonEntity> {

    private static final RString MYBATIS_SELECT_ID
            = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate.dbc710050."
                    + "IHanyoListKyodoJukyushaMapper.select共同処理用受給者情報");
    private static final EucEntityId EUC_ENTITY_ID = new EucEntityId("DBC701005");
    private final RString csvFileName = new RString("HanyoList_KyodoJukyushaKihon.csv");
    private static final RString 日本語ファイル名 = new RString("汎用リスト　共同受給者基本情報CSV");
    private static final RString 定数_なし = new RString("なし");
    private static final RString 定数_あり = new RString("あり");
    private static final RString TITLE_抽出条件 = new RString("【抽出条件】");
    private static final RString TITLE_保険者 = new RString("　　保険者：");
    private static final RString INDEX_1 = new RString("1");
    private static final RString INDEX_2 = new RString("2");
    private static final RString INDEX_3 = new RString("3");
    private static final RString TITLE_日付抽出区分 = new RString("　　日付抽出区分：");
    private static final RString TITLE_異動区分 = new RString("　　異動区分：");
    private static final RString TITLE_処理対象年月 = new RString("　　　　　処理対象年月：");
    private static final RString TITLE_異動年月 = new RString("　　　　　異動年月　　：");
    private static final RString 各異動月の最新のみ = new RString("　　　　　■各異動月の最新情報のみ抽出する");
    private static final RString 削除された情報 = new RString("　　■削除された情報を含める");
    private static final RString 新規_黒 = new RString("■新規");
    private static final RString 新規_白 = new RString("□新規");
    private static final RString 変更_黒 = new RString("■変更");
    private static final RString 変更_白 = new RString("□変更");
    private static final RString 終了_黒 = new RString("■終了");
    private static final RString 終了_白 = new RString("□終了");
    private static final RString 空白 = new RString("   ");
    private static final RString TILDE = new RString("～");
    private static final LasdecCode 全市町村_CODE = new LasdecCode("000000");
    private static final RString 全市町村 = new RString("00000 全市町村");
    private static final RString EUC_WRITER_DELIMITER = new RString(",");
    private static final RString EUC_WRITER_ENCLOSURE = new RString("\"");
    private static final Code CODE_0003 = new Code("0003");
    private static final RString DATANAME_被保険者番号 = new RString("被保険者番号");
    private HanyoListKyodoJukyushaProcessParameter parameter;
    private Association 地方公共団体情報;
    private HanyoListKyodoJukyushaCsvEntityEditor editor;
    private CsvListWriter csvListWriter;
    private Map<LasdecCode, KoseiShichosonMaster> 構成市町村マスタ;
    private List<PersonalData> personalDataList;
    private RString eucFilePath;
    private int 連番;
    private RString csv出力Flag;
    FileSpoolManager spoolManager;
    private ChohyoSeigyoKyotsu 帳票制御共通;

    @Override
    protected void initialize() {
        構成市町村マスタ = new HashMap<>();
        連番 = 0;
        csv出力Flag = 定数_なし;
        editor = new HanyoListKyodoJukyushaCsvEntityEditor();
        地方公共団体情報 = AssociationFinderFactory.createInstance().getAssociation();
        spoolManager = new FileSpoolManager(UzUDE0835SpoolOutputType.EucOther, EUC_ENTITY_ID,
                UzUDE0831EucAccesslogFileType.Csv);
        eucFilePath = Path.combinePath(spoolManager.getEucOutputDirectry(),
                csvFileName);
        List<KoseiShichosonMaster> 現市町村情報 = KoseiShichosonJohoFinder.createInstance().get現市町村情報();
        for (int i = 0; i < 現市町村情報.size(); i++) {
            構成市町村マスタ.put(現市町村情報.get(i).get市町村コード(), 現市町村情報.get(i));
        }
        ChohyoSeigyoKyotsuManager chohyoSeigyoKyotsuManager = new ChohyoSeigyoKyotsuManager();
        帳票制御共通 = chohyoSeigyoKyotsuManager.get帳票制御共通(SubGyomuCode.DBC介護給付, new ReportId(parameter.get帳票ID()));
        personalDataList = new ArrayList<>();
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MYBATIS_SELECT_ID, parameter.toMybatisParameter());
    }

    @Override
    protected void createWriter() {
        if (!parameter.is項目名付加()) {
            csvListWriter = new CsvListWriter.InstanceBuilder(eucFilePath).setNewLine(NewLine.CRLF)
                    .setDelimiter(EUC_WRITER_DELIMITER)
                    .setEnclosure(EUC_WRITER_ENCLOSURE)
                    .setEncode(Encode.UTF_8withBOM)
                    .hasHeader(false)
                    .build();
        } else {
            csvListWriter = new CsvListWriter.InstanceBuilder(eucFilePath).setNewLine(NewLine.CRLF)
                    .setDelimiter(EUC_WRITER_DELIMITER)
                    .setEnclosure(EUC_WRITER_ENCLOSURE)
                    .setEncode(Encode.UTF_8withBOM)
                    .hasHeader(true)
                    .setHeader(editor.setHeaderList(parameter))
                    .build();
        }
    }

    @Override
    protected void process(KyodoJukyushaKihonEntity entity) {
        連番++;
        csv出力Flag = 定数_あり;
        Association 導入団体情報 = AssociationFinderFactory.createInstance().getAssociation(entity.get被保険者台帳管理().getShichosonCode());
        csvListWriter.writeLine(editor.setBodyList(entity, parameter, 導入団体情報, 構成市町村マスタ, 連番, 帳票制御共通));
        ExpandedInformation expandedInformation = new ExpandedInformation(
                CODE_0003, DATANAME_被保険者番号, entity.get共同処理用受給者異動基本送付().getHiHokenshaNo().getColumnValue());
        personalDataList.add(PersonalData.of(entity.get宛名().getShikibetsuCode(), expandedInformation));

    }

    @Override
    protected void afterExecute() {
        if (定数_なし.equals(csv出力Flag) && parameter.is項目名付加()) {
            List<RString> list = new ArrayList<>();
            for (int i = 0; i < editor.setHeaderList(parameter).size(); i++) {
                list.add(RString.EMPTY);
            }
            csvListWriter.writeLine(list);
        }
        csvListWriter.close();
        if (!personalDataList.isEmpty()) {
            AccessLogUUID accessLogUUID = AccessLogger.logEUC(UzUDE0835SpoolOutputType.EucOther, personalDataList);
            spoolManager.spool(eucFilePath, accessLogUUID);
        } else {
            spoolManager.spool(eucFilePath);
        }
        ReportOutputJokenhyoItem reportOutputJokenhyoItem = new ReportOutputJokenhyoItem(
                EUC_ENTITY_ID.toRString(),
                地方公共団体情報.getLasdecCode_().value(),
                地方公共団体情報.get市町村名(),
                new RString(String.valueOf(JobContextHolder.getJobId())),
                日本語ファイル名,
                new RString(csvListWriter.getCount()),
                csv出力Flag,
                csvFileName,
                get抽出条件()
        );
        OutputJokenhyoFactory.createInstance(reportOutputJokenhyoItem)
                .print();
    }

    private List<RString> get抽出条件() {
        List<RString> 抽出条件 = new ArrayList<>();
        抽出条件.add(TITLE_抽出条件);
        if (parameter.get保険者コード() == null || LasdecCode.EMPTY.equals(parameter.get保険者コード())) {
            抽出条件.add(RString.EMPTY);
        } else if (parameter.get保険者コード() != null && 全市町村_CODE.equals(parameter.get保険者コード())) {
            抽出条件.add(TITLE_保険者.concat(全市町村));
        } else {
            Association association = AssociationFinderFactory.
                    createInstance().getAssociation(parameter.get保険者コード());
            抽出条件.add(TITLE_保険者.concat(parameter.get保険者コード().getColumnValue().concat(association.get市町村名())));
        }
        抽出条件.add(RString.EMPTY);
        if (!parameter.get日付抽出区分().isEmpty() && HizukeChushutsuKubun.すべて.getコード().equals(parameter.get日付抽出区分())) {
            抽出条件.add(TITLE_日付抽出区分.concat(HizukeChushutsuKubun.すべて.get名称()));
        }
        if (!parameter.get日付抽出区分().isEmpty() && HizukeChushutsuKubun.直近のみ.getコード().equals(parameter.get日付抽出区分())) {
            抽出条件.add(TITLE_日付抽出区分.concat(HizukeChushutsuKubun.直近のみ.get名称()));
        }
        get抽出条件Part2(抽出条件);
        return 抽出条件;
    }

    private void get抽出条件Part2(List<RString> 抽出条件) {
        if (!parameter.get日付抽出区分().isEmpty() && HizukeChushutsuKubun.範囲指定.getコード().equals(parameter.get日付抽出区分())) {
            抽出条件.add(TITLE_日付抽出区分.concat(HizukeChushutsuKubun.範囲指定.get名称()));
            RString temp = TITLE_処理対象年月;
            if (parameter.get処理対象年月FROM() != null && !FlexibleYearMonth.EMPTY.equals(parameter.get処理対象年月FROM())) {
                temp = temp.concat(dateFormat(parameter.get処理対象年月FROM())).concat(RString.FULL_SPACE);
            }
            temp = temp.concat(TILDE);
            if (parameter.get処理対象年月TO() != null && !FlexibleYearMonth.EMPTY.equals(parameter.get処理対象年月TO())) {
                temp = temp.concat(RString.FULL_SPACE).concat(dateFormat(parameter.get処理対象年月TO()));
            }
            抽出条件.add(temp);
            RString tem = TITLE_異動年月;
            if (parameter.get異動年月FROM() != null && !FlexibleYearMonth.EMPTY.equals(parameter.get異動年月FROM())) {
                tem = tem.concat(dateFormat(parameter.get異動年月FROM())).concat(RString.FULL_SPACE);
            }
            tem = tem.concat(TILDE);
            if (parameter.get異動年月TO() != null && !FlexibleYearMonth.EMPTY.equals(parameter.get異動年月TO())) {
                tem = tem.concat(RString.FULL_SPACE).concat(dateFormat(parameter.get異動年月TO()));
            }
            抽出条件.add(tem);
            if (parameter.is各異動月の最新のみ()) {
                抽出条件.add(各異動月の最新のみ);
            } else {
                抽出条件.add(RString.EMPTY);
            }
        }
        抽出条件.add(RString.EMPTY);
        RString 新規;
        if (parameter.get異動区分S() != null && !parameter.get異動区分S().isEmpty()) {
            if (parameter.get異動区分S().contains(INDEX_1)) {
                新規 = 新規_黒.concat(空白);
            } else {
                新規 = 新規_白.concat(空白);
            }
            RString 変更;
            if (parameter.get異動区分S().contains(INDEX_2)) {
                変更 = 変更_黒.concat(空白);
            } else {
                変更 = 変更_白.concat(空白);
            }
            RString 終了;
            if (parameter.get異動区分S().contains(INDEX_3)) {
                終了 = 終了_黒;
            } else {
                終了 = 終了_白;
            }
            抽出条件.add(TITLE_異動区分.concat(新規).concat(変更).concat(終了));
        }
        RString 削除された情報を含める;
        if (parameter.is削除含める()) {
            削除された情報を含める = 削除された情報;
        } else {
            削除された情報を含める = RString.EMPTY;
        }
        抽出条件.add(削除された情報を含める);
    }

    private RString dateFormat(FlexibleYearMonth date) {

        if (date == null) {
            return RString.EMPTY;
        }
        return date.wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).
                fillType(FillType.ZERO).toDateString();
    }

}
