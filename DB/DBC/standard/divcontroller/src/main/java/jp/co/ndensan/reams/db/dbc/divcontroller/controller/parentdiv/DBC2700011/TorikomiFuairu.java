/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.controller.parentdiv.DBC2700011;

import java.io.File;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.definition.batchprm.DBC170020.DBC170020_KyufuhiTanisuhyoHyojunMasterInParameter;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC2700011.TorikomiFuairuDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.handler.parentdiv.DBC2700011.TorikomiFuairuHandler;
import jp.co.ndensan.reams.db.dbc.divcontroller.handler.parentdiv.DBC2700011.TorikomiFuairuValidationHandler;
import jp.co.ndensan.reams.db.dbz.definition.message.DbzErrorMessages;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemName;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemPath;
import jp.co.ndensan.reams.uz.uza.cooperation.SharedFile;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.CopyToSharedFileOpts;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.SharedFileDescriptor;
import jp.co.ndensan.reams.uz.uza.cooperation.entity.UzT0885SharedFileEntryEntity;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.lang.ApplicationException;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.ui.servlets.FileData;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;

/**
 * 給付費単位数表標準マスタ取込画面のDivControllerです。
 *
 * @reamsid_L DBC-3400-010 x_zhaowen
 */
public class TorikomiFuairu {

    private final RString 共有ファイル名 = new RString("KM999999_COMMON.csv");
    private static final int NO_300 = 300;

    /**
     * 「アップロード」ボタンの処理です。
     *
     * @param div TorikomiFuairuDiv
     * @param files FileData[]
     * @return ResponseData
     */
    @SuppressWarnings("checkstyle:illegaltoken")
    public ResponseData<TorikomiFuairuDiv> onClick_btnAppurodo(TorikomiFuairuDiv div, FileData... files) {
        ValidationMessageControlPairs pairs = new ValidationMessageControlPairs();
        getValidationHandler(div).validateForアップロードファイル未指定(pairs);
        if (pairs.iterator().hasNext()) {
            return ResponseData.of(div).addValidationMessages(pairs).respond();
        }
        RString filename = RString.EMPTY;
        for (FileData sharedfile : files) {
            File inFile = new File(sharedfile.getFilePath().toString());
            RString localFilePath = new RString(inFile.getPath());
            FilesystemPath path = new FilesystemPath(localFilePath);
            FilesystemName filesystemName = new FilesystemName(共有ファイル名);
            SharedFileDescriptor sfd = SharedFile.defineSharedFile(filesystemName);
            CopyToSharedFileOpts opts = new CopyToSharedFileOpts();
            SharedFile.deleteOldestEntry(sfd);
            SharedFile.copyToSharedFile(sfd, path, opts);
            SharedFile.copyToLocal(filesystemName, new FilesystemPath(Path.getTmpDirectoryPath()));
            filename = new RString(inFile.getName());
        }
        RString csvFilePath = Path.combinePath(Path.getTmpDirectoryPath(), filename);
        int size = getHandler(div).upload(csvFilePath, filename);
        div.getHdNumber().setValue(new RString(size % NO_300));
        getValidationHandler(div).validateForアップロードファイル項目数(pairs);
        if (pairs.iterator().hasNext()) {
            return ResponseData.of(div).addValidationMessages(pairs).respond();
        }
        div.getTxtFuairuRekodoSu().setValue(new Decimal(size / NO_300));
        return ResponseData.of(div).respond();
    }

    /**
     * 実行ボタンのチェックです。
     *
     * @param div TorikomiFuairuDiv
     * @return ResponseData<TorikomiFuairuDiv>
     */
    public ResponseData<TorikomiFuairuDiv> onCheck_btnExecute(TorikomiFuairuDiv div) {
        List<UzT0885SharedFileEntryEntity> sharedFiles = SharedFile.searchSharedFile(共有ファイル名);
        if (sharedFiles == null || sharedFiles.isEmpty()) {
            throw new ApplicationException(DbzErrorMessages.アップロードファイル無し.getMessage().toString());
        }
        return ResponseData.of(div).respond();
    }

    /**
     * 実行ボタン処理です。
     *
     * @param div TorikomiFuairuDiv
     * @return ResponseData<DBC170020_KyufuhiTanisuhyoHyojunMasterInParameter>
     */
    public ResponseData<DBC170020_KyufuhiTanisuhyoHyojunMasterInParameter> onClick_btnRegister(TorikomiFuairuDiv div) {
        return ResponseData.of(getHandler(div).setBatchParameter()).respond();
    }

    private TorikomiFuairuValidationHandler getValidationHandler(TorikomiFuairuDiv div) {
        return new TorikomiFuairuValidationHandler(div);
    }

    private TorikomiFuairuHandler getHandler(TorikomiFuairuDiv div) {
        return new TorikomiFuairuHandler(div);
    }

}
