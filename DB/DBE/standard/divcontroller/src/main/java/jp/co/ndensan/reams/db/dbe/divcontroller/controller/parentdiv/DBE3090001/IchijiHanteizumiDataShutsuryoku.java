/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.divcontroller.controller.parentdiv.DBE3090001;

import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.core.ichijihanteizumidatashutsuryoku.IchijiHanteizumiDataBusiness;
import jp.co.ndensan.reams.db.dbe.business.core.ichijihanteizumidatashutsuryoku.IchijiHanteizumiDataShutsuryokuBusiness;
import jp.co.ndensan.reams.db.dbe.business.core.ikensho.shujiiikenshoikenitem.ShujiiIkenshoIkenItem;
import jp.co.ndensan.reams.db.dbe.business.core.ninteichosahyo.ninteichosahyotokkijiko.NinteichosahyoTokkijiko;
import jp.co.ndensan.reams.db.dbe.definition.batchprm.DBE309003.DBE309003_IchijihanteiSumidataIfParameter;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE3090001.DBE3090001StateName;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE3090001.IchijiHanteizumiDataShutsuryokuDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE3090001.dgIchijiHanteiZumi_Row;
import jp.co.ndensan.reams.db.dbe.divcontroller.handler.parentdiv.DBE3090001.IchijiHanteizumiDataShutsuryokuHandler;
import jp.co.ndensan.reams.db.dbe.divcontroller.handler.parentdiv.DBE3090001.IchijiHanteizumiDataShutsuryokuValidationHandler;
import jp.co.ndensan.reams.db.dbe.divcontroller.handler.parentdiv.DBE3090001.ItiziHanteiZumiItiranEntity;
import jp.co.ndensan.reams.db.dbe.service.core.ichijihanteizumidatashutsuryoku.IchijiHanteizumiDataShutsuryokuFinder;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.db.dbz.business.core.basic.NinteichosahyoChosaItem;
import jp.co.ndensan.reams.db.dbz.business.core.basic.NinteichosahyoServiceJokyo;
import jp.co.ndensan.reams.db.dbz.business.core.basic.NinteichosahyoServiceJokyoFlag;
import jp.co.ndensan.reams.db.dbz.service.core.DbAccessLogger;
import jp.co.ndensan.reams.ur.urz.definition.message.UrInformationMessages;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemName;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemPath;
import jp.co.ndensan.reams.uz.uza.cooperation.SharedFile;
import jp.co.ndensan.reams.uz.uza.cooperation.SharedFileDirectAccessDescriptor;
import jp.co.ndensan.reams.uz.uza.cooperation.SharedFileDirectAccessDownload;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.CopyToSharedFileOpts;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.SharedFileDescriptor;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.SharedFileEntryDescriptor;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvWriter;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogType;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.report.SourceDataCollection;
import jp.co.ndensan.reams.uz.uza.ui.servlets.IDownLoadServletResponse;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ResponseHolder;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;

/**
 * 画面設計_DBE3090001_一次判定データ出力です。
 *
 * @reamsid_L DBE-1610-010 wanghui
 */
public class IchijiHanteizumiDataShutsuryoku {

    private final IchijiHanteizumiDataShutsuryokuFinder finder;
    private static final RString CSVファイル名 = new RString("IchijiHanteiSumiIchiran.csv");
    private static final RString EUC_WRITER_DELIMITER = new RString(",");
    private static final RString EUC_WRITER_ENCLOSURE = new RString("\"");
    private static final RString 申請日 = new RString("0");
    private static final RString 一次判定日 = new RString("1");

    /**
     * コンストラクタです。
     */
    public IchijiHanteizumiDataShutsuryoku() {
        finder = IchijiHanteizumiDataShutsuryokuFinder.createInstance();
    }

    /**
     * 画面初期化処理です。
     *
     * @param div 一次判定データ出力div
     * @return ResponseData<IchijiHanteizumiDataShutsuryokuDiv>
     */
    public ResponseData<IchijiHanteizumiDataShutsuryokuDiv> onLoad(IchijiHanteizumiDataShutsuryokuDiv div) {
        getHandler(div).onLoad();
        return ResponseData.of(div).setState(DBE3090001StateName.初期表示);
    }

    /**
     * 「日付指定」ラジオボタンの画面制御処理です。
     *
     * @param div 一次判定データ出力div
     * @return ResponseData<IchijiHanteizumiDataShutsuryokuDiv>
     */
    public ResponseData<IchijiHanteizumiDataShutsuryokuDiv> onChange_Shinseibi(IchijiHanteizumiDataShutsuryokuDiv div) {
        getHandler(div).settxtShinseibi();
        return ResponseData.of(div).setState(DBE3090001StateName.初期表示);
    }

    /**
     * 「条件をクリアする」ボタンの検索条件をクリアする。
     *
     * @param div 一次判定データ出力div
     * @return ResponseData<IchijiHanteizumiDataShutsuryokuDiv>
     */
    public ResponseData<IchijiHanteizumiDataShutsuryokuDiv> onClick_btnKensakuClear(IchijiHanteizumiDataShutsuryokuDiv div) {
        getHandler(div).setbtnKensakuClear();
        return ResponseData.of(div).setState(DBE3090001StateName.初期表示);
    }

    /**
     * 一次判定済みデータの取得する。
     *
     * @param div 一次判定データ出力div
     * @return ResponseData<IchijiHanteizumiDataShutsuryokuDiv>
     */
    public ResponseData<IchijiHanteizumiDataShutsuryokuDiv> onClick_btnKensaku(IchijiHanteizumiDataShutsuryokuDiv div) {
        if (ResponseHolder.isReRequest()) {
            return ResponseData.of(div).respond();
        }
        ValidationMessageControlPairs validPairsMessage = new ValidationMessageControlPairs();
        if (申請日.equals(div.getRadJyoken().getSelectedKey())) {
            validPairsMessage = getValidatisonHandlerr(div).get申請日必須入力チェック();

        } else if (一次判定日.equals(div.getRadJyoken().getSelectedKey())) {
            validPairsMessage = getValidatisonHandlerr(div).get一次判定日必須チェック();
        }
        if (validPairsMessage.iterator().hasNext()) {
            return ResponseData.of(div).addValidationMessages(validPairsMessage).respond();
        }
        List<IchijiHanteizumiDataShutsuryokuBusiness> 一次判定情報List = finder.get次判定済みデータ(getHandler(div).createParam()).records();
        if (null == 一次判定情報List || 一次判定情報List.isEmpty()) {
            return ResponseData.of(div).addMessage(UrInformationMessages.該当データなし.getMessage()).respond();
        }
        getHandler(div).setdgIchijiHanteiZumi(一次判定情報List);
        return ResponseData.of(div).setState(DBE3090001StateName.検索結果);
    }

    /**
     * 一覧表を出力するボタンが押下された場合、ＣＳＶを出力します。
     *
     * @param div IchijiHanteizumiDataShutsuryokuDiv
     * @param response IDownLoadServletResponse
     * @return IDownLoadServletResponse
     */
    public IDownLoadServletResponse onClick_btnOutputCsv(IchijiHanteizumiDataShutsuryokuDiv div, IDownLoadServletResponse response) {
        RString filePath = Path.combinePath(Path.getTmpDirectoryPath(), CSVファイル名);
        DbAccessLogger accessLog = new DbAccessLogger();
        try (CsvWriter<ItiziHanteiZumiItiranEntity> csvWriter
                = new CsvWriter.InstanceBuilder(filePath).canAppend(false).
                setDelimiter(EUC_WRITER_DELIMITER).
                setEnclosure(EUC_WRITER_ENCLOSURE).
                setEncode(Encode.UTF_8withBOM).
                setNewLine(NewLine.CRLF).
                hasHeader(true).
                build()) {
            List<dgIchijiHanteiZumi_Row> dgChosainList = div.getDgIchijiHanteiZumi().getSelectedItems();
            for (dgIchijiHanteiZumi_Row row : dgChosainList) {
                csvWriter.writeLine(set一次判定済一覧(row));
                ShoKisaiHokenshaNo shoKisaiHokenshaNo = new ShoKisaiHokenshaNo(row.getShoKisaiHokenshaNo());
                ExpandedInformation expandedInfo = new ExpandedInformation(new Code("0001"), new RString("申請書管理番号"), row.getShinseishoKanriNo());
                accessLog.store(shoKisaiHokenshaNo, row.getHihoBango(), expandedInfo);
            }
            accessLog.flushBy(AccessLogType.照会);
            csvWriter.close();
        }
        SharedFileDescriptor sfd = new SharedFileDescriptor(GyomuCode.DB介護保険, FilesystemName.fromString(CSVファイル名));
        sfd = SharedFile.defineSharedFile(sfd);
        CopyToSharedFileOpts opts = new CopyToSharedFileOpts().isCompressedArchive(false);
        SharedFileEntryDescriptor entry = SharedFile.copyToSharedFile(sfd, new FilesystemPath(filePath), opts);
        return SharedFileDirectAccessDownload.directAccessDownload(new SharedFileDirectAccessDescriptor(entry, CSVファイル名), response);
    }

    /**
     * 「一次判定結果票を出力する」ボタンを押時のバリデーションチェックです。
     *
     * @param div 一次判定データ出力div
     * @return ResponseData
     */
    public ResponseData<IchijiHanteizumiDataShutsuryokuDiv> onClick_ValidationOfIchijiHanteiKekkahyoShutsuryoku(IchijiHanteizumiDataShutsuryokuDiv div) {
        ValidationMessageControlPairs validPairs = getValidatisonHandlerr(div).validate一覧未選択チェック();
        if (validPairs.iterator().hasNext()) {
            return ResponseData.of(div).addValidationMessages(validPairs).respond();
        }
        return ResponseData.of(div).respond();
    }

    /**
     * 「一次判定結果票を出力する」ボタンを押下。
     *
     * @param div 一次判定データ出力div
     * @return ResponseData
     */
    public ResponseData<SourceDataCollection> onClick_btnIchijiHanteiKekkahyoShutsuryoku(IchijiHanteizumiDataShutsuryokuDiv div) {
        ResponseData<SourceDataCollection> response = new ResponseData<>();
        List<IchijiHanteizumiDataBusiness> 一次判定結果list = finder.get一次判定結果情報(getHandler(div).createParam帳票()).records();
        List<NinteichosahyoServiceJokyo> 認定調査票概況調査リスト = finder.get認定調査票概況調査(getHandler(div).createParam帳票()).records();
        List<NinteichosahyoServiceJokyoFlag> 認定調査票フラグリスト = finder.get認定調査票フラグ(getHandler(div).createParam帳票()).records();
        List<NinteichosahyoChosaItem> 認定調査票調査項目リスト = finder.get認定調査票調査項目(getHandler(div).createParam帳票()).records();
        List<NinteichosahyoChosaItem> 前回調査票調査項目リスト = finder.get前回認定調査票調査項目(getHandler(div).createParam帳票()).records();
        List<ShujiiIkenshoIkenItem> 主治医意見書意見項目リスト = finder.get主治医意見書意見項目(getHandler(div).createParam帳票()).records();
        List<ShujiiIkenshoIkenItem> 前回主治医意見書意見項目リスト = finder.get前回主治医意見書意見項目(getHandler(div).createParam帳票()).records();
        List<NinteichosahyoTokkijiko> 認定調査特記事項番号リスト = finder.get認定調査特記事項番号(getHandler(div).createParam帳票()).records();
        return ResponseData.of(getHandler(div).set帳票(一次判定結果list, 認定調査票概況調査リスト, 認定調査票フラグリスト, 認定調査票調査項目リスト, 前回調査票調査項目リスト,
                主治医意見書意見項目リスト, 前回主治医意見書意見項目リスト, 認定調査特記事項番号リスト)).respond();
    }

    /**
     * 「認定ソフト用データを出力する」ボタンを押下時、バッチパラメータを引き渡し、バッチを起動する。
     *
     * @param div 一次判定データ出力div
     * @return ResponseData
     */
    public ResponseData<DBE309003_IchijihanteiSumidataIfParameter> onClick_jiko(IchijiHanteizumiDataShutsuryokuDiv div) {
        return ResponseData.of(getHandler(div).setBatchParameter()).respond();
    }

    /**
     * 対象者一覧データの選択チェック。
     *
     * @param div IchijiHanteiDiv
     * @return ResponseData
     */
    public ResponseData<IchijiHanteizumiDataShutsuryokuDiv> btn_check(IchijiHanteizumiDataShutsuryokuDiv div) {

        ValidationMessageControlPairs validation = getValidatisonHandlerr(div).validate一覧未選択チェック();
        if (validation.iterator().hasNext()) {

            return ResponseData.of(div).addValidationMessages(validation).respond();
        }
        return ResponseData.of(div).respond();
    }

    /**
     * Modoru。
     *
     * @param div IchijiHanteiDiv
     * @return ResponseData
     */
    public ResponseData<IchijiHanteizumiDataShutsuryokuDiv> btn_btnModoru(IchijiHanteizumiDataShutsuryokuDiv div) {

        return ResponseData.of(div).setState(DBE3090001StateName.初期表示);
    }

    private IchijiHanteizumiDataShutsuryokuHandler getHandler(IchijiHanteizumiDataShutsuryokuDiv div) {
        return new IchijiHanteizumiDataShutsuryokuHandler(div);
    }

    private IchijiHanteizumiDataShutsuryokuValidationHandler getValidatisonHandlerr(IchijiHanteizumiDataShutsuryokuDiv div) {
        return new IchijiHanteizumiDataShutsuryokuValidationHandler(div);
    }

    /**
     * CSVでEntityの設定します。
     *
     * @param div div
     * @return List<ItiziHanteiZumiItiranEntity>
     */
    private ItiziHanteiZumiItiranEntity set一次判定済一覧(dgIchijiHanteiZumi_Row row) {
        ItiziHanteiZumiItiranEntity entity = new ItiziHanteiZumiItiranEntity();
        entity.set保険者名(row.getHokenshaMei());
        entity.set申請日(row.getShinseibi());
        entity.set被保険者_被保番号(row.getHihoBango());
        entity.set被保険者_氏名(row.getShimei());
        entity.set申請区分_申請時(row.getShinseitoki());
        entity.set申請区分_法令(row.getHorei());
        entity.set一次判定_完了日(row.getKanryobi());
        entity.set一次判定_一次判定結果(row.getIchijihanteikekka());
        entity.set一次判定_資料作成(row.getShiryoSakusei());
        entity.set一次判定_警告コード(row.getKeikokuCode());
        return entity;

    }
}
