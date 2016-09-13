/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.kokuhorenkyoutsu;

import jp.co.ndensan.reams.db.dbc.definition.processprm.kokuhorenkyotsu.KokuhorenkyotsuDeleteReveicedFileProcessParameter;
import jp.co.ndensan.reams.db.dbc.service.core.kokuhorenkyoutsuu.KokuhorenKyoutsuuFileReceivedDeleteManager;
import jp.co.ndensan.reams.uz.uza.batch.process.SimpleBatchProcessBase;

/**
 * 取込済ファイル削除する。
 *
 * @reamsid_L DBC-0980-420 zhangrui
 */
public class KokuhorenkyoutsuDeleteReveicedFileProcess extends SimpleBatchProcessBase {

    private KokuhorenkyotsuDeleteReveicedFileProcessParameter parameter;

    @Override
    protected void process() {
        KokuhorenKyoutsuuFileReceivedDeleteManager 取込済ファイル削除Manager
                = new KokuhorenKyoutsuuFileReceivedDeleteManager();
        取込済ファイル削除Manager.deleteReceivedFile(parameter.get処理年月(), parameter.get保存先フォルダ(),
                parameter.getエントリ情報List());
    }

}