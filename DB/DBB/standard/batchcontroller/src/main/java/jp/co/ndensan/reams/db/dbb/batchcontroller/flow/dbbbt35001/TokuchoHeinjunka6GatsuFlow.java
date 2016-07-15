/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.batchcontroller.flow.dbbbt35001;

import jp.co.ndensan.reams.db.dbb.batchcontroller.step.dbbbt35001.HeijunkaMaeFukaTempCreatProcess;
import jp.co.ndensan.reams.db.dbb.batchcontroller.step.dbbbt35001.KaigoJyouhouJyourikuProcess;
import jp.co.ndensan.reams.db.dbb.batchcontroller.step.dbbbt35001.SystemTimeTokuchoHeinjunkaProcess;
import jp.co.ndensan.reams.db.dbb.batchcontroller.step.dbbbt35001.SystemTimeUpdateProcess;
import jp.co.ndensan.reams.db.dbb.batchcontroller.step.dbbbt35001.TaisyoushaToTaisyoukaiDataTempProcess;
import jp.co.ndensan.reams.db.dbb.batchcontroller.step.dbbbt35001.TokuchoHeinjunkaResultIchiranProcess;
import jp.co.ndensan.reams.db.dbb.definition.batchprm.karisanteiidofuka.TyouhyouEntity;
import jp.co.ndensan.reams.db.dbb.definition.batchprm.tokuchoheinjunka6gatsu.TokuchoHeinjunka6GatsuParameter;
import jp.co.ndensan.reams.db.dbb.definition.processprm.dbbbt35001.TokuchoHeinjunka6GatsuProcessParameter;
import jp.co.ndensan.reams.uz.uza.batch.Step;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchFlowBase;
import jp.co.ndensan.reams.uz.uza.batch.flow.IBatchFlowCommand;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 特徴平準化（特徴6月分)クラスです。
 *
 * @reamsid_L DBB-0810-010 yuanzhenxia
 */
public class TokuchoHeinjunka6GatsuFlow extends BatchFlowBase<TokuchoHeinjunka6GatsuParameter> {

    private static final String システム日時の取得 = "getSystemDate";
    private static final String 平準化前賦課TEMP作成 = "creatTmpProcess";
    private static final String 平準化対象者と対象外データTEMP作成 = "creatTaisyouTmpProcess";
    private static final String 介護情報の登録 = "creatKaigoProcess";
    private static final String 特徴平準化結果一覧表出力 = "printResultIchiranProcess";
    private static final String 処理日付管理テーブル更新 = "updateSystemTimeProcess";
    private TokuchoHeinjunka6GatsuParameter parameter;
    private TokuchoHeinjunka6GatsuProcessParameter processParameter;

    @Override
    protected void defineFlow() {
        parameter = getParameter();
        if (parameter == null || parameter.get出力帳票一覧() == null || parameter.get出力帳票一覧().isEmpty()) {
            return;
        }
        executeStep(システム日時の取得);
        YMDHMS システム日時 = getResult(YMDHMS.class, new RString(システム日時の取得), SystemTimeTokuchoHeinjunkaProcess.SYSTEM_TIME);
        processParameter = new TokuchoHeinjunka6GatsuProcessParameter();
        processParameter.set調定年度(new FlexibleYear(parameter.get調定年度()));
        processParameter.set賦課年度(new FlexibleYear(parameter.get賦課年度()));
        processParameter.set増額平準化方法(parameter.get増額平準化方法());
        processParameter.set減額平準化方法(parameter.get減額平準化方法());
        processParameter.set調定日時(システム日時.getRDateTime());
        executeStep(平準化前賦課TEMP作成);
        executeStep(平準化対象者と対象外データTEMP作成);
        executeStep(介護情報の登録);
        for (TyouhyouEntity entity : parameter.get出力帳票一覧()) {
            processParameter.set出力帳票一覧(entity);
            executeStep(特徴平準化結果一覧表出力);
        }
        executeStep(処理日付管理テーブル更新);

    }

    /**
     * システム日時の取得を行います。
     *
     * @return バッチコマンド
     */
    @Step(システム日時の取得)
    protected IBatchFlowCommand getSystemDate() {
        return simpleBatch(SystemTimeTokuchoHeinjunkaProcess.class).define();
    }

    /**
     * 平準化前賦課TEMP作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(平準化前賦課TEMP作成)
    protected IBatchFlowCommand creatTempProcess() {
        return simpleBatch(HeijunkaMaeFukaTempCreatProcess.class).arguments(processParameter).define();
    }

    /**
     * 平準化対象者と対象外データTEMP作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(平準化対象者と対象外データTEMP作成)
    protected IBatchFlowCommand creatTaisyouTempProcess() {
        return simpleBatch(TaisyoushaToTaisyoukaiDataTempProcess.class).arguments(processParameter).define();
    }

    /**
     * 平準化対象者と対象外データTEMP作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(介護情報の登録)
    protected IBatchFlowCommand creatKaigoProcess() {
        return simpleBatch(KaigoJyouhouJyourikuProcess.class).arguments(processParameter).define();
    }

    /**
     * 特徴平準化結果一覧表出力を行います。
     *
     * @return バッチコマンド
     */
    @Step(特徴平準化結果一覧表出力)
    protected IBatchFlowCommand printResultIchiranProcess() {
        return simpleBatch(TokuchoHeinjunkaResultIchiranProcess.class).arguments(processParameter).define();
    }

    /**
     * 処理日付管理テーブル更新を行います。
     *
     * @return バッチコマンド
     */
    @Step(処理日付管理テーブル更新)
    protected IBatchFlowCommand updateSystemTimeProcess() {
        return simpleBatch(SystemTimeUpdateProcess.class).arguments(processParameter).define();
    }

}
