/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.batchprm.DBE250002;

import jp.co.ndensan.reams.db.dbe.definition.core.ocr.OcrFiles;
import jp.co.ndensan.reams.db.dbe.definition.core.ocr.TreatmentWhenIchijiHanteiZumi;
import jp.co.ndensan.reams.db.dbe.definition.processprm.ocr.ImageInputProcessParameter;
import jp.co.ndensan.reams.uz.uza.batch.BatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchParameterBase;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 *
 * @author n2818
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class DBE250002_ImageTorikomiParameter extends BatchParameterBase {

    private static final String KYOYU_FILE_ENTRY = "KyoyuFileEntry";

    @BatchParameter(key = KYOYU_FILE_ENTRY, name = "共有ファイルエントリ情報文字列")
    private RString 共有ファイルエントリ情報文字列;
    @BatchParameter(name = "一次判定済みの申請者")
    private TreatmentWhenIchijiHanteiZumi 一次判定済み時処理方法;

    /**
     * バッチ基盤でパラメータを作成する際に用いられるコンストラクタです。
     */
    public DBE250002_ImageTorikomiParameter() {
    }

    /**
     * イメージ取込（規定・規定外）バッチパラメータクラスのコンストラクタです。
     *
     * @param 共有ファイルエントリ情報文字列 アップロードされた共有ファイルのエントリ情報
     * @param 一次判定済み時処理方法 一次判定済み時処理方法
     */
    public DBE250002_ImageTorikomiParameter(
            RString 共有ファイルエントリ情報文字列,
            TreatmentWhenIchijiHanteiZumi 一次判定済み時処理方法) {
        this.共有ファイルエントリ情報文字列 = 共有ファイルエントリ情報文字列;
        this.一次判定済み時処理方法 = 一次判定済み時処理方法;
    }

    /**
     * @param 処理日 処理日
     * @param catalogFilePath catalogFilePath
     * @param imageFilePaths 全イメージファイルのPath
     * @param tempTableName 一時テーブル名
     * @return {@link ImageInputProcessParameter}
     */
    public ImageInputProcessParameter toImageInputProcessParameter(RDate 処理日,
            RString catalogFilePath,
            OcrFiles imageFilePaths,
            RString tempTableName) {
        return new ImageInputProcessParameter(処理日, catalogFilePath, imageFilePaths, tempTableName,
                一次判定済み時処理方法);
    }
}
