/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.batchcontroller.flow.publicationshiryoshinsakai;

import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinHanteiDataSakuseiA3Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinHanteiDataSakuseiA4Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinIkenshoDataSakuseiA3Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinIkenshoDataSakuseiA4Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinItiziHanteiDataSakuseiA3Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinItiziHanteiDataSakuseiA4Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinShinsakaiIinJohoDataSakuseiA3Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinShinsakaiIinJohoDataSakuseiA4Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinTokkiIranDataSakuseiA3Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinTokkiIranDataSakuseiA4Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinTokkiJikouDataSakuseiA3Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinTokkiJikouDataSakuseiA4Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinTokkiJikouItiziHanteiDataSakuseiA3Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinTokkiJikouItiziHanteiDataSakuseiA4Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinTuikaSiryoDataSakuseiA3Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinTuikaSiryoDataSakuseiA4Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.IinTuutishoDataSakuseiProcess;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.ShinsakaiKaisaiYoteiJohoUpdateProcess;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.SonotaJohoDataSakuseiA3Process;
import jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai.SonotaJohoDataSakuseiA4Process;
import jp.co.ndensan.reams.db.dbe.definition.batchprm.publicationshiryoshinsakai.PublicationShiryoShinsakaiBatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.Step;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchFlowBase;
import jp.co.ndensan.reams.uz.uza.batch.flow.IBatchFlowCommand;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 審査会資料一括作成（委員）のバッチ処理クラスです。
 *
 * @reamsid_L DBE-0150-200 linghuhang
 */
public class PublicationShiryoShinsakaiFlow extends BatchFlowBase<PublicationShiryoShinsakaiBatchParameter> {

    private static final String 委員_審査会開催通知書 = "iinTuutisho";
    private static final String 委員_特記事項 = "iinTokkiJikou";
    private static final String 委員_一次判定結果 = "iinItiziHantei";
    private static final String 委員_特記事項_一次判定結果 = "iinTokkiJikouItiziHantei";
    private static final String 委員_主治医意見書 = "iinIkensho";
    private static final String 委員_予備判定一覧 = "iinHantei";
    private static final String 委員_審査対象者一覧 = "iinShinsakaiIinJoho";
    private static final String 委員_追加資料鑑 = "iinTuikaSiryo";
    private static final String 委員_概況特記 = "iinTokkiIran";
    private static final String 委員_その他資料 = "iinSonotaJoho";
    private static final String 審査会開催予定情報更新 = "kousin";
    private static final RString 選択 = new RString("1");
    private static final RString 作成条件_範囲指定 = new RString("範囲指定");
    private static final RString 作成条件_追加分 = new RString("追加分");

    @Override
    protected void defineFlow() {
        if (選択.equals(getParameter().getChohyoIin_tuutishoFalg())
                && !作成条件_範囲指定.equals(getParameter().getSakuseiJoken())) {
            executeStep(委員_審査会開催通知書);
        }
//        // TODO 帳票実装しない。
////        if (選択.equals(getParameter().getChohyoIin_tokkiJikouFalg())) {
////            executeStep(委員_特記事項);
////        }
//        if (選択.equals(getParameter().getChohyoIin_itiziHanteiFalg())) {
//            executeStep(委員_一次判定結果);
////        }
////        // TODO 帳票実装しない。
////        if (選択.equals(getParameter().getChohyoIin_tokkiJikouHanteiFalg())) {
////            executeStep(委員_特記事項_一次判定結果);
////        }
        if (選択.equals(getParameter().getChohyoIin_ikenshoFalg())) {
            executeStep(委員_主治医意見書);
        }
        if (選択.equals(getParameter().getChohyoIin_hanteiFalg())) {
            executeStep(委員_予備判定一覧);
        }
        if ((選択.equals(getParameter().getChohyoIin_tokkiJikouFalg())
                && 選択.equals(getParameter().getChohyoIin_itiziHanteiFalg())
                && 選択.equals(getParameter().getChohyoIin_ikenshoFalg()))
                || (選択.equals(getParameter().getChohyoIin_tokkiJikouHanteiFalg())
                && 選択.equals(getParameter().getChohyoIin_ikenshoFalg()))) {
            if (作成条件_追加分.equals(getParameter().getSakuseiJoken())) {
                executeStep(委員_追加資料鑑);
            } else {
                executeStep(委員_審査対象者一覧);
            }
        }
//        // TODO 帳票実装しない。
////        executeStep(委員_概況特記);
        executeStep(委員_その他資料);
        executeStep(審査会開催予定情報更新);
    }

    /**
     * 審査会開催のお知らせ一覧情報データの作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(委員_審査会開催通知書)
    protected IBatchFlowCommand createIinTuutishoData() {
        return loopBatch(IinTuutishoDataSakuseiProcess.class)
                .arguments(getParameter().toIinTuutishoProcessParameter()).define();
    }

    /**
     * 委員用特記事項情報データの作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(委員_特記事項)
    protected IBatchFlowCommand createIinTokkiJikouData() {
        if (選択.equals(getParameter().getShuturyokuSutairu())) {
            return loopBatch(IinTokkiJikouDataSakuseiA4Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();
        } else {
            return loopBatch(IinTokkiJikouDataSakuseiA3Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();
        }
    }

    /**
     * 委員一次判定結果情報データの作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(委員_一次判定結果)
    protected IBatchFlowCommand createIinItiziHanteiData() {
        if (選択.equals(getParameter().getShuturyokuSutairu())) {
            return loopBatch(IinItiziHanteiDataSakuseiA4Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();
        } else {
            return loopBatch(IinItiziHanteiDataSakuseiA3Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();
        }
    }

    /**
     * 委員用特記事項と一次判定結果票情報データの作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(委員_特記事項_一次判定結果)
    protected IBatchFlowCommand createIinTokkiJikouItiziHanteiData() {
        if (選択.equals(getParameter().getShuturyokuSutairu())) {
            return loopBatch(IinTokkiJikouItiziHanteiDataSakuseiA4Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();
        } else {
            return loopBatch(IinTokkiJikouItiziHanteiDataSakuseiA3Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();

        }
    }

    /**
     * 委員用主治医意見書情報データの作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(委員_主治医意見書)
    protected IBatchFlowCommand createIinIkenshoData() {
        if (選択.equals(getParameter().getShuturyokuSutairu())) {
            return loopBatch(IinIkenshoDataSakuseiA4Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();
        } else {
            return loopBatch(IinIkenshoDataSakuseiA3Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();
        }
    }

    /**
     * 委員用予備判定一覧情報データの作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(委員_予備判定一覧)
    protected IBatchFlowCommand createIinHanteiData() {
        if (選択.equals(getParameter().getShuturyokuSutairu())) {
            return loopBatch(IinHanteiDataSakuseiA4Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();
        } else {
            return loopBatch(IinHanteiDataSakuseiA3Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();
        }
    }

    /**
     * 介護認定審査対象者一覧表情報データの作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(委員_審査対象者一覧)
    protected IBatchFlowCommand createIinShinsakaiIinJohoData() {
        if (選択.equals(getParameter().getShuturyokuSutairu())) {
            return loopBatch(IinShinsakaiIinJohoDataSakuseiA4Process.class)
                    .arguments(getParameter().toIinShinsakaiIinJohoProcessParameter()).define();
        } else {
            return loopBatch(IinShinsakaiIinJohoDataSakuseiA3Process.class)
                    .arguments(getParameter().toIinShinsakaiIinJohoProcessParameter()).define();
        }
    }

    /**
     * 介護認定追加資料鑑情報データの作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(委員_追加資料鑑)
    protected IBatchFlowCommand createIinTuikaSiryoData() {
        if (選択.equals(getParameter().getShuturyokuSutairu())) {
            return loopBatch(IinTuikaSiryoDataSakuseiA4Process.class)
                    .arguments(getParameter().toIinTuikaSiryoProcessParameter()).define();
        } else {
            return loopBatch(IinTuikaSiryoDataSakuseiA3Process.class)
                    .arguments(getParameter().toIinTuikaSiryoProcessParameter()).define();
        }
    }

    /**
     * 概況特記情報データの作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(委員_概況特記)
    protected IBatchFlowCommand createIinTokkiIranData() {
        if (選択.equals(getParameter().getShuturyokuSutairu())) {
            return loopBatch(IinTokkiIranDataSakuseiA4Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();
        } else {
            return loopBatch(IinTokkiIranDataSakuseiA3Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();
        }
    }

    /**
     * その他資料情報データの作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(委員_その他資料)
    protected IBatchFlowCommand createSonotaJohoData() {
        if (選択.equals(getParameter().getShuturyokuSutairu())) {
            return loopBatch(SonotaJohoDataSakuseiA4Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();
        } else {
            return loopBatch(SonotaJohoDataSakuseiA3Process.class)
                    .arguments(getParameter().toIinTokkiJikouItiziHanteiProcessParameter()).define();
        }
    }

    /**
     * 審査会開催予定情報更新の作成を行います。
     *
     * @return バッチコマンド
     */
    @Step(審査会開催予定情報更新)
    protected IBatchFlowCommand createKosinData() {
        return loopBatch(ShinsakaiKaisaiYoteiJohoUpdateProcess.class)
                .arguments(getParameter().toIinItiziHanteiProcessParameter()).define();
    }
}
