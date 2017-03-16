/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.divcontroller.controller.parentdiv.DBE5710002;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.db.dbe.business.core.yokaigoninteiimagekanri.ImageFileItem;
import jp.co.ndensan.reams.db.dbe.business.core.yokaigoninteiimagekanri.ImageFileNames;
import jp.co.ndensan.reams.db.dbe.business.core.yokaigoninteiimagekanri.ImagekanriJoho;
import jp.co.ndensan.reams.db.dbe.definition.core.yokaigoninteiimagekanri.ImageType;
import jp.co.ndensan.reams.db.dbe.divcontroller.controller.parentdiv.DBE5710001.Yokaigoninteiimagekanri;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE5710002.ImagePanelDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.handler.parentdiv.DBE5710002.ImagePanelValidationHandler;
import jp.co.ndensan.reams.db.dbe.service.core.yokaigoninteiimagesyutsuryoku.YokaigoninteiimageShutsuryokuFinder;
import jp.co.ndensan.reams.db.dbx.definition.core.viewstate.ViewStateKeys;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemName;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemPath;
import jp.co.ndensan.reams.uz.uza.cooperation.SharedFile;
import jp.co.ndensan.reams.uz.uza.cooperation.SharedFileDirectAccessDescriptor;
import jp.co.ndensan.reams.uz.uza.cooperation.SharedFileDirectAccessDownload;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.CopyToSharedFileOpts;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.ReadOnlySharedFileEntryDescriptor;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.SharedFileDescriptor;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.SharedFileEntryDescriptor;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.io.Directory;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.ZipUtil;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.KeyValueDataSource;
import jp.co.ndensan.reams.uz.uza.ui.binding.KeyValueDataSourceConverter;
import jp.co.ndensan.reams.uz.uza.ui.servlets.IDownLoadServletResponse;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 * 要介護認定イメージ情報出力のクラスです。
 *
 * @reamsid_L DBE-1670-011 wangxiaodong
 */
public class ImagePanel {

    private static final RString 調査票 = ImageType.調査票.key();
    private static final RString 調査票概況 = ImageType.概況特記.key();
    private static final RString 主治医意見書 = ImageType.意見書.key();
    private static final RString その他資料 = ImageType.その他資料.key();

    /**
     * 要介護認定イメージ情報出力画面をloadします。
     *
     * @param div 要介護認定イメージ情報出力画面
     * @return ResponseData
     */
    public ResponseData<ImagePanelDiv> onLoad(ImagePanelDiv div) {
        div.getChkImage().setDataSource(
                createDataSourceFromDownloadableImageTypes(ViewStateHolder.get(ViewStateKeys.イメージ情報, ImagekanriJoho.class))
        );
        return ResponseData.of(div).respond();
    }

    private static List<KeyValueDataSource> createDataSourceFromDownloadableImageTypes(ImagekanriJoho imageKanriJoho) {
        ImageFileNames imageFileNames = imageKanriJoho.collectImageNames();
        Map<RString, RString> map = ImageType.toMap();
        if (!imageFileNames.confirmChosahyoImagesPresent().exists()) {
            map.remove(調査票);
        }
        if (!Yokaigoninteiimagekanri.uses概況特記() || !imageFileNames.confirmGaikyoTokkiImagesPresent().exists()) {
            map.remove(調査票概況);
        }
        if (!imageFileNames.confirmIkenshoImagesPresent().exists()) {
            map.remove(主治医意見書);
        }
        if (!imageFileNames.confirmSonotaShiryoImagesPresent().exists()) {
            map.remove(その他資料);
        }
        return KeyValueDataSourceConverter.getDataSource(map);
    }

    /**
     * イメージファイルをdownLoadします。
     *
     * @param div 要介護認定イメージ情報出力画面
     * @return ResponseData
     */
    public ResponseData<ImagePanelDiv> onclick_btnDownLoadCheck(ImagePanelDiv div) {
        ImagekanriJoho イメージ情報 = ViewStateHolder.get(ViewStateKeys.イメージ情報, ImagekanriJoho.class);
        ReadOnlySharedFileEntryDescriptor ro_sfed = new ReadOnlySharedFileEntryDescriptor(
                new FilesystemName(sharedFileName(イメージ情報)), イメージ情報.getイメージ共有ファイルID());
        YokaigoninteiimageShutsuryokuFinder finder = new YokaigoninteiimageShutsuryokuFinder(ro_sfed);
        List<RString> 存在するファイル = finder.getSharedFile();
        List<RString> 存在する調査票ファイル = finder.get存在したイメージファイル(ImageFileItem.getGaikyoChosaImageFileList_ALL(), 存在するファイル);
        存在する調査票ファイル.addAll(finder.get存在したイメージファイル(ImageFileItem.getChosahyoTokkiImageFileList_ALL(), 存在するファイル));
        List<RString> 存在する調査票概況ファイル = finder.get存在したイメージファイル(ImageFileItem.getGaikyoTokkiImageFileList_ALL(), 存在するファイル);
        List<RString> 存在する主治医意見書ファイル = finder.get存在したイメージファイル(ImageFileItem.getOpinionTeikeiImageFileList_ALL(), 存在するファイル);
        存在する主治医意見書ファイル.addAll(finder.get存在したイメージファイル(ImageFileItem.getOpinionTeikeigaiImageFileList_ALL(), 存在するファイル));
        List<RString> 存在するその他資料ファイル = finder.get存在したイメージファイル(ImageFileItem.getOtherFileImageFileList_ALL(), 存在するファイル);
        ValidationMessageControlPairs controlPairs = new ImagePanelValidationHandler(div)
                .do事前チェック(存在するファイル, 存在する調査票ファイル, 存在する調査票概況ファイル, 存在する主治医意見書ファイル, 存在するその他資料ファイル);
        if (controlPairs.iterator().hasNext()) {
            return ResponseData.of(div).addValidationMessages(controlPairs).respond();
        }
        return ResponseData.of(div).respond();
    }

    private static RString sharedFileName(ImagekanriJoho imageKanri) {
        return imageKanri.get証記載保険者番号().concat(imageKanri.get被保険者番号());
    }

    /**
     * イメージファイルをdownLoadします。
     *
     * @param div 要介護認定イメージ情報出力画面
     * @param response IDownLoadServletResponse
     * @return ResponseData
     */
    public IDownLoadServletResponse onclick_btnDownLoad(ImagePanelDiv div, IDownLoadServletResponse response) {
        ImagekanriJoho イメージ情報 = ViewStateHolder.get(ViewStateKeys.イメージ情報, ImagekanriJoho.class);
        ReadOnlySharedFileEntryDescriptor ro_sfed = new ReadOnlySharedFileEntryDescriptor(
                new FilesystemName(イメージ情報.get証記載保険者番号().concat(イメージ情報.get被保険者番号())), イメージ情報.getイメージ共有ファイルID());
        RString 書庫化ファイル名 = sharedFileName(イメージ情報).concat(".zip");
        RString zipPath = Path.combinePath(Path.getTmpDirectoryPath(), 書庫化ファイル名);
        File zipFile = new File(zipPath.toString());
        if (zipFile.exists()) {
            zipFile.delete();
        }
        ZipUtil.createFromFiles(zipPath, createDownloadFileList(div, ro_sfed));
        SharedFileDescriptor sfd = new SharedFileDescriptor(GyomuCode.DB介護保険, FilesystemName.fromString(書庫化ファイル名));
        sfd = SharedFile.defineSharedFile(sfd);
        CopyToSharedFileOpts opts = new CopyToSharedFileOpts().isCompressedArchive(false);
        SharedFileEntryDescriptor entry = SharedFile.copyToSharedFile(sfd, new FilesystemPath(zipPath), opts);
        return SharedFileDirectAccessDownload.directAccessDownload(
                new SharedFileDirectAccessDescriptor(entry, 書庫化ファイル名), response);
    }

    private List<RString> createDownloadFileList(ImagePanelDiv div, ReadOnlySharedFileEntryDescriptor ro_sfed) {
        RString localCopyPath = ViewStateHolder.get(ViewStateKeys.イメージ取込み, RString.class);
        YokaigoninteiimageShutsuryokuFinder finder = new YokaigoninteiimageShutsuryokuFinder(ro_sfed);
        List<RString> 存在するファイル = finder.getSharedFile();
        List<RString> 存在する調査票ファイル = finder.get存在したイメージファイル(ImageFileItem.getGaikyoChosaImageFileList_ALL(), 存在するファイル);
        存在する調査票ファイル.addAll(finder.get存在したイメージファイル(ImageFileItem.getChosahyoTokkiImageFileList_ALL(), 存在するファイル));
        List<RString> 存在する調査票概況ファイル = finder.get存在したイメージファイル(ImageFileItem.getGaikyoTokkiImageFileList_ALL(), 存在するファイル);
        List<RString> 存在する主治医意見書ファイル = finder.get存在したイメージファイル(ImageFileItem.getOpinionTeikeiImageFileList_ALL(), 存在するファイル);
        存在する主治医意見書ファイル.addAll(finder.get存在したイメージファイル(ImageFileItem.getOpinionTeikeigaiImageFileList_ALL(), 存在するファイル));
        List<RString> 存在するその他資料ファイル = finder.get存在したイメージファイル(ImageFileItem.getOtherFileImageFileList_ALL(), 存在するファイル);
        List<RString> fileList = new ArrayList<>();
        if (div.getChkImage().getSelectedKeys().contains(調査票) && !存在する調査票ファイル.isEmpty()) {
            fileList.addAll(存在する調査票ファイル);
        }
        if (div.getChkImage().getSelectedKeys().contains(調査票概況) && !存在する調査票概況ファイル.isEmpty()) {
            fileList.addAll(存在する調査票概況ファイル);
        }
        if (div.getChkImage().getSelectedKeys().contains(主治医意見書) && !存在する主治医意見書ファイル.isEmpty()) {
            fileList.addAll(存在する主治医意見書ファイル);
        }
        if (div.getChkImage().getSelectedKeys().contains(その他資料) && !存在するその他資料ファイル.isEmpty()) {
            fileList.addAll(存在するその他資料ファイル);
        }
        List<RString> result = new ArrayList<>();
        for (RString fileName : fileList) {
            if (Directory.exists(Path.combinePath(localCopyPath, fileName))) {
                result.add(Path.combinePath(localCopyPath, fileName));
            }
        }
        return result.isEmpty() ? Collections.EMPTY_LIST : result;
    }
}
