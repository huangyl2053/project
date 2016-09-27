/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.batchcontroller.step.DBB213001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbb.business.euc.dbb213001.TokuchoSofuJohoRenkeiCsvEntityEditor;
import jp.co.ndensan.reams.db.dbb.definition.processprm.tokuchosofujohorenkei.TokuchoSofuJohoRenkeiProcessParameter;
import jp.co.ndensan.reams.db.dbb.entity.csv.TokuchoSofuJohoRenkeiCsvEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.tokuchosofujohorenkei.TokuchoSofuJohoRenkeiEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBB;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbz.service.core.koikishichosonjoho.KoikiShichosonJohoFinder;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemName;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemPath;
import jp.co.ndensan.reams.uz.uza.cooperation.SharedFile;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.fld.FldWriter;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RYearMonth;

/**
 * 特徴送付情報連携プロセスです。
 *
 * @reamsid_L DBB-1790-040 yuanzhenxia
 */
public class TokuchoSofuJohoRenkeiProcess extends BatchProcessBase<TokuchoSofuJohoRenkeiEntity> {

    private static final RString MYBATIS_SELECT_ID
            = new RString("jp.co.ndensan.reams.db.dbb.persistence.db.mapper.relate.tokuchosofujohorenkei.ITokuchoSofuJohoRenkeiMapper"
                    + ".select特徴送付情報連携のデータ");
    private static final RString EUC_WRITER_DELIMITER = new RString(",");
    private static final RString Z1A000XXDTA = new RString("Z1A000xx.DTA");
    private static final RString Z99_550_XXDTA = new RString("Z99_550_xx.DTA");
    private static final RString DEXXZ12YYYY01DTA = new RString("DExxZ12yyyy01.DTA");
    private static final RString DEXXZ1AYYYYZZDTA = new RString("DExxZ1Ayyyyzz.DTA");
    private static final RString 七月 = new RString("07");
    private static final RString XX = new RString("xx");
    private static final RString YYYY = new RString("yyyy");
    private TokuchoSofuJohoRenkeiProcessParameter proParameter;
    private FlexibleYear 処理年度;
    private RYearMonth 処理対象年月;
    private List<RString> 市町村コードリスト;
    private List<RString> ファイル出力Z99_550List;
    private List<RString> ファイル出力Z1A000List;
    private List<RString> ファイル出力DE__Z12List;
    private List<RString> ファイル出力DE__Z1AList;
    private Map<RString, RString> 市町村IDMap;
    private Map<RString, Integer> 各種金額欄合偉一;
    private Map<RString, Integer> 各種金額欄合計二;
    private Map<RString, FldWriter> ファイル出力Z1A000Map;
    private Map<RString, FldWriter> ファイル出力Z99_550Map;
    private Map<RString, FldWriter> ファイル出力DE__Z12Map;
    private Map<RString, FldWriter> ファイル出力DE__Z1AMap;
    private RString 市町村;
    private int 各種金額欄合計1 = 0;
    private int 各種金額欄合計2 = 0;
    private int count = 1;
    private int circle = 1;
    private List<TokuchoSofuJohoRenkeiEntity> 特徴送付情報連携情報;

    @BatchWriter
    private FldWriter<TokuchoSofuJohoRenkeiCsvEntity> fldZ1A000Writer;
    private FldWriter<TokuchoSofuJohoRenkeiCsvEntity> fldZ99_550Writer;
    private FldWriter<TokuchoSofuJohoRenkeiCsvEntity> fldDE__Z12Writer;
    private FldWriter<TokuchoSofuJohoRenkeiCsvEntity> fldDE__Z1AWriter;

    @Override
    protected void initialize() {
        処理年度 = new FlexibleYear(DbBusinessConfig.get(ConfigNameDBB.日付関連_調定年度,
                RDate.getNowDate(), SubGyomuCode.DBB介護賦課));
        処理対象年月 = RDate.getNowDate().getYearMonth();
        市町村コードリスト = new ArrayList<>();
        市町村IDMap = new HashMap<>();
        ファイル出力Z1A000Map = new HashMap<>();
        ファイル出力Z99_550Map = new HashMap<>();
        ファイル出力DE__Z12Map = new HashMap<>();
        ファイル出力DE__Z1AMap = new HashMap<>();
        各種金額欄合偉一 = new HashMap<>();
        各種金額欄合計二 = new HashMap<>();
        特徴送付情報連携情報 = new ArrayList<>();
        ファイル出力Z99_550List = new ArrayList<>();
        ファイル出力Z1A000List = new ArrayList<>();
        ファイル出力DE__Z12List = new ArrayList<>();
        ファイル出力DE__Z1AList = new ArrayList<>();
        proParameter = new TokuchoSofuJohoRenkeiProcessParameter();
        KoikiShichosonJohoFinder finder = KoikiShichosonJohoFinder.createInstance();
//        List<KoseiShichoson> 広域市町村情報 = finder.getKoseiShichosonList().records();
//        if (!広域市町村情報.isEmpty()) {
//            for (KoseiShichoson item : 広域市町村情報) {
//                市町村コードリスト.add(item.get市町村コード().value());
//                市町村IDMap.put(item.get市町村コード().value(), item.get市町村識別ID());
//            }
//        }

        市町村コードリスト.add(new RString("00001"));
        市町村コードリスト.add(new RString("00002"));
        市町村コードリスト.add(new RString("00003"));
        市町村IDMap.put(new RString("00001"), new RString("01"));
        市町村IDMap.put(new RString("00002"), new RString("02"));
        市町村IDMap.put(new RString("00003"), new RString("03"));
        proParameter.set処理年度(処理年度);
        proParameter.set処理対象年月(処理対象年月);
        proParameter.set市町村コードリスト(市町村コードリスト);

    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(MYBATIS_SELECT_ID, proParameter.toTokuchoSofuJohoRenkeiMybitisParameter());
    }

    @Override
    protected void createWriter() {
        for (RString 市町村コード : 市町村コードリスト) {
            RString ファイル出力Z1A000 = Z1A000XXDTA.replace(XX, 市町村IDMap.get(市町村コード));
            ファイル出力Z1A000List.add(ファイル出力Z1A000);
            fldZ1A000Writer = new FldWriter.InstanceBuilder(ファイル出力Z1A000).
                    setDelimiter(EUC_WRITER_DELIMITER).
                    setEncodeUtf8(true).
                    setNewLine(NewLine.CRLF).
                    build();
            ファイル出力Z1A000Map.put(市町村コード, fldZ1A000Writer);
            RString ファイル出力Z99_550 = Z99_550_XXDTA.replace(XX, 市町村IDMap.get(市町村コード));
            ファイル出力Z99_550List.add(ファイル出力Z99_550);
            fldZ99_550Writer = new FldWriter.InstanceBuilder(ファイル出力Z99_550).
                    setDelimiter(EUC_WRITER_DELIMITER).
                    setEncodeUtf8(true).
                    setNewLine(NewLine.CRLF).
                    build();
            ファイル出力Z99_550Map.put(市町村コード, fldZ99_550Writer);
            RString ファイル出力DE__Z12 = DEXXZ12YYYY01DTA.replace(XX, 市町村IDMap.get(市町村コード)).replace(YYYY,
                    処理年度.toDateString());
            ファイル出力DE__Z12List.add(ファイル出力DE__Z12);
            fldDE__Z12Writer = new FldWriter.InstanceBuilder(ファイル出力DE__Z12).
                    setDelimiter(EUC_WRITER_DELIMITER).
                    setEncodeUtf8(true).
                    setNewLine(NewLine.CRLF).
                    build();
            ファイル出力DE__Z12Map.put(市町村コード, fldDE__Z12Writer);
            RString ファイル出力DE__Z1A = DEXXZ1AYYYYZZDTA.replace(XX, 市町村IDMap.get(市町村コード)).replace(YYYY,
                    処理年度.toDateString());
            ファイル出力DE__Z1AList.add(ファイル出力DE__Z1A);
            fldDE__Z1AWriter = new FldWriter.InstanceBuilder(ファイル出力DE__Z1A).
                    setDelimiter(EUC_WRITER_DELIMITER).
                    setEncodeUtf8(true).
                    setNewLine(NewLine.CRLF).
                    build();
            ファイル出力DE__Z1AMap.put(市町村コード, fldDE__Z1AWriter);

        }

    }

    @Override
    protected void process(TokuchoSofuJohoRenkeiEntity entity) {
        if (circle == 1) {
            市町村 = entity.get市町村コードDT();
        }
        if (市町村.equals(entity.get市町村コードDT())) {
            各種金額欄合計1 = 各種金額欄合計1 + Integer.parseInt(entity.get各種金額欄1DT().toString());
            各種金額欄合計2 = 各種金額欄合計2 + Integer.parseInt(entity.get各種金額欄2DT().toString());
        } else {
            各種金額欄合計1 = Integer.parseInt(entity.get各種金額欄1DT().toString());
            各種金額欄合計2 = Integer.parseInt(entity.get各種金額欄2DT().toString());
            市町村 = entity.get市町村コードDT();
        }
        各種金額欄合偉一.put(entity.get市町村コードDT(), 各種金額欄合計1);
        各種金額欄合計二.put(entity.get市町村コードDT(), 各種金額欄合計2);
        特徴送付情報連携情報.add(entity);
        circle++;
    }

    @Override
    protected void afterExecute() {
        for (TokuchoSofuJohoRenkeiEntity entity : 特徴送付情報連携情報) {
            if (七月.equals(new RString(処理対象年月.getMonthValue()))) {
                if (count == 1) {
                    ファイル出力Z1A000Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity)
                            .edit管理(count, 特徴送付情報連携情報.size()));
                    ファイル出力Z1A000Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity).editヘッダ());
                    ファイル出力Z99_550Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity)
                            .edit管理(count, 特徴送付情報連携情報.size()));
                    ファイル出力Z99_550Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity).editヘッダ());
                    ファイル出力DE__Z12Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity).editヘッダ());
                }
                ファイル出力Z1A000Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity).editデータ());
                ファイル出力Z99_550Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity)
                        .editデータZ99_550_xx_DTAファイルのみ());
                ファイル出力DE__Z12Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity).editデータ());
                if (count == 1) {
                    ファイル出力Z1A000Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity)
                            .editトレイラ(各種金額欄合偉一.get(entity.get市町村コードDT()), 各種金額欄合計二.get(entity.get市町村コードDT()),
                                    特徴送付情報連携情報.size()));
                    ファイル出力Z99_550Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity)
                            .editトレイラ(各種金額欄合偉一.get(entity.get市町村コードDT()), 各種金額欄合計二.get(entity.get市町村コードDT()),
                                    特徴送付情報連携情報.size()));
                    ファイル出力DE__Z12Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity)
                            .editトレイラ(各種金額欄合偉一.get(entity.get市町村コードDT()), 各種金額欄合計二.get(entity.get市町村コードDT()),
                                    特徴送付情報連携情報.size()));
                }

            } else {
                if (count == 1) {
                    ファイル出力Z1A000Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity).edit管理(count,
                            特徴送付情報連携情報.size()));
                    ファイル出力Z1A000Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity).editヘッダ());
                    ファイル出力Z99_550Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity).edit管理(count,
                            特徴送付情報連携情報.size()));
                    ファイル出力Z99_550Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity).editヘッダ());
                    ファイル出力DE__Z1AMap.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity).editヘッダ());
                }
                ファイル出力Z1A000Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity).editデータ());
                ファイル出力Z99_550Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity)
                        .editデータZ99_550_xx_DTAファイルのみ());
                ファイル出力DE__Z1AMap.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity).editデータ());
                if (count == 1) {
                    ファイル出力Z1A000Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity)
                            .editトレイラ(各種金額欄合偉一.get(entity.get市町村コードDT()), 各種金額欄合計二.get(entity.get市町村コードDT()),
                                    特徴送付情報連携情報.size()));
                    ファイル出力Z99_550Map.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity)
                            .editトレイラ(各種金額欄合偉一.get(entity.get市町村コードDT()), 各種金額欄合計二.get(entity.get市町村コードDT()),
                                    特徴送付情報連携情報.size()));
                    ファイル出力DE__Z1AMap.get(entity.get市町村コードDT()).writeLine(new TokuchoSofuJohoRenkeiCsvEntityEditor(entity)
                            .editトレイラ(各種金額欄合偉一.get(entity.get市町村コードDT()), 各種金額欄合計二.get(entity.get市町村コードDT()),
                                    特徴送付情報連携情報.size()));
                }
            }
            count++;
        }
        for (RString fileName : ファイル出力Z1A000List) {
            FilesystemName sharedFileName = new FilesystemName(fileName);
            SharedFile.defineSharedFile(sharedFileName);
            FilesystemPath 絶対パス = new FilesystemPath(Path.getTmpDirectoryPath());
            SharedFile.copyToSharedFile(絶対パス, sharedFileName);
        }
        for (RString fileName : ファイル出力Z99_550List) {
            FilesystemName sharedFileName = new FilesystemName(fileName);
            SharedFile.defineSharedFile(sharedFileName);
            FilesystemPath 絶対パス = new FilesystemPath(Path.getTmpDirectoryPath());
            SharedFile.copyToSharedFile(絶対パス, sharedFileName);
        }
        for (RString fileName : ファイル出力DE__Z12List) {
            FilesystemName sharedFileName = new FilesystemName(fileName);
            SharedFile.defineSharedFile(sharedFileName);
            FilesystemPath 絶対パス = new FilesystemPath(Path.getTmpDirectoryPath());
            SharedFile.copyToSharedFile(絶対パス, sharedFileName);
        }
        for (RString fileName : ファイル出力DE__Z1AList) {
            FilesystemName sharedFileName = new FilesystemName(fileName);
            SharedFile.defineSharedFile(sharedFileName);
            FilesystemPath 絶対パス = new FilesystemPath(Path.getTmpDirectoryPath());
            SharedFile.copyToSharedFile(絶対パス, sharedFileName);
        }

    }

}
