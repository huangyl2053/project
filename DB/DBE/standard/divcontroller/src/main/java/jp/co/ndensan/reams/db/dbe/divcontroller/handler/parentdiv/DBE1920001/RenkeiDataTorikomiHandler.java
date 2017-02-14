/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.divcontroller.handler.parentdiv.DBE1920001;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.definition.batchprm.DBE192001.DBE192001_NnteiShinseiInfoUploadParameter;
import jp.co.ndensan.reams.db.dbe.definition.batchprm.DBE192001.ShiseiDataParameter;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE1920001.NinteiShinseiJohoDensanCsvEntity;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE1920001.NinteiShinseiJohoKouroushouCsvEntity;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE1920001.RenkeiDataTorikomiDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE1920001.dgTorikomiTaisho_Row;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE1920001.dgtorikomidataichiran_Row;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBE;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.GyomuBunrui;
import jp.co.ndensan.reams.db.dbz.definition.core.seibetsu.Seibetsu;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.shinsei.HihokenshaKubunCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.shinsei.NinteiShinseiShinseijiKubunCode;
import jp.co.ndensan.reams.ua.uax.business.core.dateofbirth.AgeCalculator;
import jp.co.ndensan.reams.ua.uax.business.core.dateofbirth.DateOfBirthFactory;
import jp.co.ndensan.reams.ur.urz.definition.core.shikibetsutaisho.JuminJotai;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemName;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemPath;
import jp.co.ndensan.reams.uz.uza.cooperation.SharedFile;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.CopyToSharedFileOpts;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.ReadOnlySharedFileEntryDescriptor;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.SharedFileDescriptor;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.SharedFileEntryDescriptor;
import jp.co.ndensan.reams.uz.uza.io.Directory;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.FileReader;
import jp.co.ndensan.reams.uz.uza.io.ITextReadable;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvListReader;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvReader;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogType;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogger;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.PersonalData;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.ui.servlets.FileData;

/**
 * 要介護認定申請連携データ取込のHandlerクラスです。
 *
 * @reamsid_L DBE-1490-010 xuyannan
 */
public class RenkeiDataTorikomiHandler {

    private static final RString 法改正前 = new RString("key0");
    private static final RString 法改正後 = new RString("key1");
    private static final int 電算標準版_197 = 197;
    private static final int 厚労省_174 = 174;
    private static final int 東芝版_197 = 197;
    private static final RString フォーマット_要介護認定申請 = new RString("NCI201");
    private static final RString フォーマット_認定調査委託先 = new RString("NCI101");
    private static final RString フォーマット_認定調査員 = new RString("NCI111");
    private static final RString フォーマット_主治医医療機関 = new RString("NCI121");
    private static final RString フォーマット_主治医 = new RString("NCI131");
    private static final RString なし = new RString("0");
    private static final RString SJIS = new RString("1");
    private static final RString UTF8 = new RString("2");
    private static final RString EUC_WRITER_DELIMITER = new RString(",");
    private static final RString 共有ファイル名 = new RString("要介護認定申請連携データ取込");
    private static final int 無 = 0;
    private static RString 要介護認定申請連携データ取込みファイル名;
    private final RenkeiDataTorikomiDiv div;
    private final RDate 基準日;

    /**
     * コンストラクタです。
     *
     * @param div div
     */
    public RenkeiDataTorikomiHandler(RenkeiDataTorikomiDiv div) {
        this.div = div;
        基準日 = RDate.getNowDate();
    }

    /**
     * 初期化の設定します。
     *
     * @param 法改正前Flag 法改正前Flag
     * @param path path
     * @param 要介護認定申請連携データ取込み_ファイル名 要介護認定申請連携データ取込み_ファイル名
     * @param 認定調査委託先データ取込み_ファイル名 認定調査委託先データ取込み_ファイル名
     * @param 認定調査員データ取込み_ファイル名 認定調査員データ取込み_ファイル名
     * @param 主治医医療機関データ取込み_ファイル名 主治医医療機関データ取込み_ファイル名
     * @param 主治医データ取込み_ファイル名 主治医データ取込み_ファイル名
     */
    public void onLoad(boolean 法改正前Flag, RString path, RString 要介護認定申請連携データ取込み_ファイル名,
            RString 認定調査委託先データ取込み_ファイル名, RString 認定調査員データ取込み_ファイル名,
            RString 主治医医療機関データ取込み_ファイル名, RString 主治医データ取込み_ファイル名) {
        div.getRenkeiDataTorikomiBatchParameter().getListHokennsha().loadHokenshaList(GyomuBunrui.介護認定);
        if (法改正前Flag) {
            div.getRenkeiDataTorikomiBatchParameter().getRadHoKaisei().setSelectedKey(法改正前);
        } else {
            div.getRenkeiDataTorikomiBatchParameter().getRadHoKaisei().setSelectedKey(法改正後);
        }
        要介護認定申請連携データ取込みファイル名 = 要介護認定申請連携データ取込み_ファイル名;
        div.getRenkeiDataTorikomiBatchParameter().getRadHoKaisei().setDisabled(true);
        div.getUploadArea().getBtnDataTorikomi().setDisabled(true);
        div.getDgTorikomiTaisho().setReadOnly(true);
        initDgTorikomiTaisho(path, 要介護認定申請連携データ取込み_ファイル名, 認定調査委託先データ取込み_ファイル名, 
                認定調査員データ取込み_ファイル名, 主治医医療機関データ取込み_ファイル名, 主治医データ取込み_ファイル名);
    }
    
    /**
     * 取込対象データグリッドを初期化
     * 
     * @param path path
     * @param 要介護認定申請連携データ取込み_ファイル名 要介護認定申請連携データ取込み_ファイル名
     * @param 認定調査委託先データ取込み_ファイル名 認定調査委託先データ取込み_ファイル名
     * @param 認定調査員データ取込み_ファイル名 認定調査員データ取込み_ファイル名
     * @param 主治医医療機関データ取込み_ファイル名 主治医医療機関データ取込み_ファイル名
     * @param 主治医データ取込み_ファイル名 主治医データ取込み_ファイル名
     */
    public void initDgTorikomiTaisho(RString path, RString 要介護認定申請連携データ取込み_ファイル名,
            RString 認定調査委託先データ取込み_ファイル名, RString 認定調査員データ取込み_ファイル名,
            RString 主治医医療機関データ取込み_ファイル名, RString 主治医データ取込み_ファイル名) {
        RString 要介護認定申請_名称 = DbBusinessConfig.get(ConfigNameDBE.NCI201ファイル名称, 基準日, SubGyomuCode.DBE認定支援);
        RString 認定調査委託先_名称 = DbBusinessConfig.get(ConfigNameDBE.NCI101ファイル名称, 基準日, SubGyomuCode.DBE認定支援);
        RString 認定調査員_名称 = DbBusinessConfig.get(ConfigNameDBE.NCI111ファイル名称, 基準日, SubGyomuCode.DBE認定支援);
        RString 主治医医療機関_名称 = DbBusinessConfig.get(ConfigNameDBE.NCI121ファイル名称, 基準日, SubGyomuCode.DBE認定支援);
        RString 主治医_名称 = DbBusinessConfig.get(ConfigNameDBE.NCI131ファイル名称, 基準日, SubGyomuCode.DBE認定支援);
        List<dgTorikomiTaisho_Row> list = new ArrayList<>();
        list.add(setRowFile(path, フォーマット_要介護認定申請,
                要介護認定申請_名称,
                要介護認定申請連携データ取込み_ファイル名));
        list.add(setRowFile(path, フォーマット_認定調査委託先,
                認定調査委託先_名称,
                認定調査委託先データ取込み_ファイル名));
        list.add(setRowFile(path, フォーマット_認定調査員,
                認定調査員_名称,
                認定調査員データ取込み_ファイル名));
        list.add(setRowFile(path, フォーマット_主治医医療機関,
                主治医医療機関_名称,
                主治医医療機関データ取込み_ファイル名));
        list.add(setRowFile(path, フォーマット_主治医,
                主治医_名称,
                主治医データ取込み_ファイル名));
        div.getRenkeiDataTorikomiBatchParameter().getDgTorikomiTaisho().getDataSource().addAll(list);
    }

    /**
     * 取込みファイルデータを取得します。
     */
    public void getFileData() {
        RString path = Directory.createTmpDirectory();
        List<RString> filedIdList = div.getHiddenFileId().split(",");
        for (RString filedId : filedIdList) {
            if (!RString.isNullOrEmpty(filedId)) {
                SharedFile.copyToLocal(new ReadOnlySharedFileEntryDescriptor(new FilesystemName(共有ファイル名),
                        RDateTime.parse(filedId.toString())), new FilesystemPath(path));
            }
        }
        RString filePath = Path.combinePath(path, 要介護認定申請連携データ取込みファイル名);
        File file = new File(filePath.toString());
        if (file.exists() && !なし.equals(div.getRenkeiDataTorikomiBatchParameter().getDgTorikomiTaisho().getDataSource().get(0).getTotal())) {
            setRowFileData(set文字コード(), path, filePath);
        }
    }

    /**
     * 対象ファイルを共有フォルダに保存します。
     *
     * @param file ファイルデータ
     * @param buider buider
     * @return SharedFileEntryDescriptor
     */
    public SharedFileEntryDescriptor upLoadFile(FileData file, RStringBuilder buider) {
        FilesystemPath path = new FilesystemPath(file.getFilePath());
        SharedFileDescriptor sfd = new SharedFileDescriptor(GyomuCode.DB介護保険, FilesystemName.fromString(共有ファイル名));
        sfd = SharedFile.defineSharedFile(sfd);
        CopyToSharedFileOpts opts = new CopyToSharedFileOpts().dateToDelete(RDate.getNowDate().plusMonth(1));
        SharedFileEntryDescriptor entity = SharedFile.copyToSharedFile(sfd, path, opts);
        div.setPath(entity.getDirectAccessPath());
        buider.append(new RString(entity.getSharedFileId().toString())).append(",");
        div.setHiddenFileId(buider.toRString());
        List<dgTorikomiTaisho_Row> dataSource = div.getRenkeiDataTorikomiBatchParameter().getDgTorikomiTaisho().getDataSource();
        for (dgTorikomiTaisho_Row rowData : dataSource) {
            if (rowData.getFileName().equals(file.getFileName())) {
                getFileCount(path.toRString(), RString.EMPTY, rowData);
                if (!rowData.getTotal().equals(なし)) {
                    div.getDgTorikomiTaisho().setReadOnly(false);
                    rowData.setSelectable(Boolean.TRUE);
                    rowData.setSelected(Boolean.TRUE);
                }
                break;
            }
        }
        return entity;
    }

    /**
     * バッチパラメータを作成します。
     *
     * @return RenkeiDataTorikomiBatchParamter
     */
    public DBE192001_NnteiShinseiInfoUploadParameter setBatchParameter() {
        DBE192001_NnteiShinseiInfoUploadParameter batchParameter = new DBE192001_NnteiShinseiInfoUploadParameter();
        List<RString> list = new ArrayList<>();
        List<ShiseiDataParameter> parameterList = new ArrayList<>();
        RString 市町村コード = div.getRenkeiDataTorikomiBatchParameter().getListHokennsha().getSelectedItem().get市町村コード().value();
        if (RString.isNullOrEmpty(市町村コード)) {
            batchParameter.set市町村コード(new RString("000000"));
        } else {
            batchParameter.set市町村コード(市町村コード);
        }
        for (dgTorikomiTaisho_Row row : div.getRenkeiDataTorikomiBatchParameter().getDgTorikomiTaisho().getSelectedItems()) {
            list.add(row.getFileName());
        }
        batchParameter.set取込み対象ファイルリスト(list);
        for (dgtorikomidataichiran_Row row : div.getTorikomiichiran().getDgtorikomidataichiran().getSelectedItems()) {
            ShiseiDataParameter dataParameter = new ShiseiDataParameter();
            dataParameter.set保険者番号(row.getHokenshano());
            dataParameter.set被保険者番号(row.getHihono());
            dataParameter.set認定申請日(row.getNinteishinseiymd().getValue().toDateString());
            dataParameter.set申請種別コード(NinteiShinseiShinseijiKubunCode.toName(row.getShinseikubunshinseiji().toString()).getコード());
            parameterList.add(dataParameter);
        }
        batchParameter.set申請情報データリスト(parameterList);
        batchParameter.set格納パス(div.getPath());
        List<RDateTime> 共有ファイルIDList = new ArrayList<>();
        List<RString> filedIdList = div.getHiddenFileId().split(",");
        for (RString filedId : filedIdList) {
            if (!RString.isNullOrEmpty(filedId)) {
                共有ファイルIDList.add(RDateTime.parse(filedId.toString()));
            }
        }
        batchParameter.set共有ファイルIDList(共有ファイルIDList);
        if (div.getRenkeiDataTorikomiBatchParameter().getRadHoKaisei().getSelectedKey().equals(法改正前)) {
            batchParameter.set法改正後フラグ(false);
        } else {
            batchParameter.set法改正後フラグ(true);
        }
        return batchParameter;
    }

    private void setRowFileData(Encode コード, RString path, RString filePath) {
        List<dgtorikomidataichiran_Row> list = new ArrayList<>();
        try (CsvListReader read = new CsvListReader.InstanceBuilder(Path.combinePath(path, 要介護認定申請連携データ取込みファイル名)).build()) {
            int size = read.readLine().size();
            if (電算標準版_197 == size) {
                try (CsvReader<NinteiShinseiJohoDensanCsvEntity> csvReader = new CsvReader.InstanceBuilder(
                        filePath, NinteiShinseiJohoDensanCsvEntity.class)
                        .setDelimiter(EUC_WRITER_DELIMITER)
                        .setEncode(コード)
                        .setNewLine(NewLine.CRLF)
                        .hasHeader(false).build()) {
                    List<NinteiShinseiJohoDensanCsvEntity> csvEntityList = new ArrayList<>();
                    while (true) {
                        NinteiShinseiJohoDensanCsvEntity entity = csvReader.readLine();
                        if (entity != null) {
                            entity.set項目数(size);
                            csvEntityList.add(entity);
                        } else {
                            break;
                        }
                    }
                    for (NinteiShinseiJohoDensanCsvEntity entity : csvEntityList) {
                        dgtorikomidataichiran_Row rowData = new dgtorikomidataichiran_Row();
                        rowData.setSelected(Boolean.TRUE);
                        rowData.setKoroshoifshikibetsucode(entity.get識別コード());
                        rowData.setHokenshano(entity.get保険者番号());
                        rowData.setHihono(entity.get被保険者番号());
                        rowData.getNinteishinseiymd().setValue(new RDate(entity.get認定申請日().toString()));
                        rowData.setShinseikubunshinseiji(NinteiShinseiShinseijiKubunCode.toValue(entity.get申請区分コード_申請時()).get名称());
                        rowData.setHihokubun(HihokenshaKubunCode.toValue(entity.get被保険者区分コード()).get名称());
                        rowData.setShimei(entity.get氏名());
                        rowData.getSeinengappi().setValue(new RDate(entity.get生年月日().toString()));
                        AgeCalculator ageCalculator = new AgeCalculator(DateOfBirthFactory.createInstance(getFlexibleDate(entity.get生年月日())),
                                JuminJotai.住民, FlexibleDate.EMPTY, getFlexibleDate(entity.get認定申請日()));
                        int 年齢 = ageCalculator.get年齢().toInt();
                        rowData.getNenrei().setValue(new Decimal(String.valueOf(年齢)));
                        rowData.setSeibetsu(Seibetsu.toValue(entity.get性別()).get名称());
                        list.add(rowData);
                        PersonalData personalData = PersonalData.of(ShikibetsuCode.EMPTY,
                                new ExpandedInformation(new Code("0001"),
                                        new RString("被保険者番号"), rowData.getHihono()));
                        AccessLogger.log(AccessLogType.照会, personalData);
                    }
                }
            } else if (厚労省_174 == size) {
                try (CsvReader<NinteiShinseiJohoKouroushouCsvEntity> csvReader = new CsvReader.InstanceBuilder(
                        filePath, NinteiShinseiJohoKouroushouCsvEntity.class)
                        .setDelimiter(EUC_WRITER_DELIMITER)
                        .setEncode(コード)
                        .setNewLine(NewLine.CRLF)
                        .hasHeader(false).build()) {
                    List<NinteiShinseiJohoKouroushouCsvEntity> csvEntityList = new ArrayList<>();
                    while (true) {
                        NinteiShinseiJohoKouroushouCsvEntity entity = csvReader.readLine();
                        if (entity != null) {
                            entity.set項目数(size);
                            csvEntityList.add(entity);
                        } else {
                            break;
                        }
                    }
                    for (NinteiShinseiJohoKouroushouCsvEntity csvEntity : csvEntityList) {
                        dgtorikomidataichiran_Row rowData = new dgtorikomidataichiran_Row();
                        rowData.setSelected(Boolean.TRUE);
                        rowData.setKoroshoifshikibetsucode(csvEntity.get識別コード());
                        rowData.setHokenshano(csvEntity.get保険者番号());
                        rowData.setHihono(csvEntity.get被保険者番号());
                        rowData.getNinteishinseiymd().setValue(new RDate(csvEntity.get認定申請日().toString()));
                        rowData.setShinseikubunshinseiji(NinteiShinseiShinseijiKubunCode.toValue(csvEntity.get申請区分コード_申請時()).get名称());
                        rowData.setHihokubun(HihokenshaKubunCode.toValue(csvEntity.get被保険者区分コード()).get名称());
                        rowData.setShimei(csvEntity.get氏名());
                        rowData.getSeinengappi().setValue(new RDate(csvEntity.get生年月日().toString()));
                        AgeCalculator ageCalculator = new AgeCalculator(DateOfBirthFactory.createInstance(getFlexibleDate(csvEntity.get生年月日())),
                                JuminJotai.住民, FlexibleDate.EMPTY, getFlexibleDate(csvEntity.get認定申請日()));
                        int 年齢 = ageCalculator.get年齢().toInt();
                        rowData.getNenrei().setValue(new Decimal(String.valueOf(年齢)));
                        rowData.setSeibetsu(Seibetsu.toValue(csvEntity.get性別()).get名称());
                        list.add(rowData);
                        PersonalData personalData = PersonalData.of(ShikibetsuCode.EMPTY,
                                new ExpandedInformation(new Code("0001"),
                                        new RString("被保険者番号"), rowData.getHihono()));
                        AccessLogger.log(AccessLogType.照会, personalData);
                    }
                }
            } else if (東芝版_197 == size) {
                try (CsvReader<NinteiShinseiJohoDensanCsvEntity> csvReader = new CsvReader.InstanceBuilder(
                        filePath, NinteiShinseiJohoDensanCsvEntity.class).setDelimiter(EUC_WRITER_DELIMITER)
                        .setEncode(コード).setNewLine(NewLine.CRLF).hasHeader(false).build()) {
                    List<NinteiShinseiJohoDensanCsvEntity> csvEntityList = new ArrayList<>();
                    while (true) {
                        NinteiShinseiJohoDensanCsvEntity csventity = csvReader.readLine();
                        if (csventity != null) {
                            csventity.set項目数(size);
                            csvEntityList.add(csventity);
                        } else {
                            break;
                        }
                    }
                    for (NinteiShinseiJohoDensanCsvEntity csvEntity : csvEntityList) {
                        dgtorikomidataichiran_Row row = new dgtorikomidataichiran_Row();
                        row.setSelected(Boolean.TRUE);
                        row.setKoroshoifshikibetsucode(csvEntity.get識別コード());
                        row.setHokenshano(csvEntity.get保険者番号());
                        row.setHihono(csvEntity.get被保険者番号());
                        row.getNinteishinseiymd().setValue(new RDate(csvEntity.get認定申請日().toString()));
                        row.setShinseikubunshinseiji(NinteiShinseiShinseijiKubunCode.toValue(csvEntity.get申請区分コード_申請時()).get名称());
                        row.setHihokubun(HihokenshaKubunCode.toValue(csvEntity.get被保険者区分コード()).get名称());
                        row.setShimei(csvEntity.get氏名());
                        row.getSeinengappi().setValue(new RDate(csvEntity.get生年月日().toString()));
                        AgeCalculator ageCalculator = new AgeCalculator(DateOfBirthFactory.createInstance(getFlexibleDate(csvEntity.get生年月日())),
                                JuminJotai.住民, FlexibleDate.EMPTY, getFlexibleDate(csvEntity.get認定申請日()));
                        int 年齢 = ageCalculator.get年齢().toInt();
                        row.getNenrei().setValue(new Decimal(String.valueOf(年齢)));
                        row.setSeibetsu(Seibetsu.toValue(csvEntity.get性別()).get名称());
                        list.add(row);
                        PersonalData personalData = PersonalData.of(ShikibetsuCode.EMPTY,
                                new ExpandedInformation(new Code("0001"),
                                        new RString("被保険者番号"), row.getHihono()));
                        AccessLogger.log(AccessLogType.照会, personalData);
                    }
                }
            }
            div.getTorikomiichiran().getDgtorikomidataichiran().setDataSource(list);
        }
    }

    private void getFileCount(RString path, RString ファイル, dgTorikomiTaisho_Row row) {
        RStringBuilder builder = new RStringBuilder();
        builder.append(path).append(File.separator).append(ファイル);
        File file = new File(builder.toString());
        if (file.exists()) {
            List<RString> list = new ArrayList<>();
            ITextReadable reader = new FileReader(builder.toRString(), set文字コード());
            RString stemp;
            while (true) {
                stemp = reader.readLine();
                if (!RString.isNullOrEmpty(stemp)) {
                    list.add(stemp);
                } else {
                    break;
                }
            }
            if (list.size() == 無) {
                row.setTotal(new RString(list.size()));
            } else {
                row.setTotal(new RString(list.size()));
            }
        } else {
            row.setTotal(なし);
        }
    }

    private dgTorikomiTaisho_Row setRowFile(RString path, RString フォーマット, RString 名称, RString ファイル名) {
        dgTorikomiTaisho_Row row = new dgTorikomiTaisho_Row();
        row.setFileFormat(フォーマット);
        row.setMeisho(名称);
        row.setFileName(ファイル名);
        getFileCount(path, ファイル名, row);
        return row;
    }

    private Encode set文字コード() {
        RString 文字コード = DbBusinessConfig.get(ConfigNameDBE.連携文字コード, 基準日, SubGyomuCode.DBE認定支援);
        Encode コード = null;
        if (SJIS.equals(文字コード)) {
            コード = Encode.SJIS;
        } else if (UTF8.equals(文字コード)) {
            コード = Encode.UTF_8;
        }
        return コード;
    }

    private FlexibleDate getFlexibleDate(RString value) {
        FlexibleDate flexibleDate = FlexibleDate.EMPTY;
        if (!RString.isNullOrEmpty(value)) {
            flexibleDate = new FlexibleDate(value);
        }
        return flexibleDate;
    }
}
