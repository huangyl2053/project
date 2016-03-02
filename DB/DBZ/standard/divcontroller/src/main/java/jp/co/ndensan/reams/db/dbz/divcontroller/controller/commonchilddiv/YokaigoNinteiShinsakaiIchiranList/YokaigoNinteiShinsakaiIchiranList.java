/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.divcontroller.controller.commonchilddiv.YokaigoNinteiShinsakaiIchiranList;

import java.util.List;
import jp.co.ndensan.reams.db.dbz.business.core.shinsakaikaisai.ShinsakaiKaisai;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.YokaigoNinteiShinsakaiIchiranList.YokaigoNinteiShinsakaiIchiranList.YokaigoNinteiShinsakaiIchiranListDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.handler.commonchilddiv.yokaigoninteishinsakaiichiranlist.YokaigoNinteiShinsakaiIchiranListHandler;
import jp.co.ndensan.reams.db.dbz.divcontroller.viewbox.ViewStateKeys;
import jp.co.ndensan.reams.db.dbz.service.core.shinsakaikaisai.ShinsakaiKaisaiFinder;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 *
 * 介護認定審査会共有一覧のダイアログのDivControllerです。
 */
public class YokaigoNinteiShinsakaiIchiranList {

    private static final RString モード_開催予定登録 = new RString("開催予定登録");
    private static final RString モード_対象者割付 = new RString("対象者割付");
    private static final RString モード_審査会資料 = new RString("審査会資料");
    private static final RString モード_審査結果登録 = new RString("審査結果登録");
    private static final RString モード_事前結果登録 = new RString("事前結果登録");
    private static final RString モード_データ出力 = new RString("データ出力");
    private static final RString モード_判定結果 = new RString("判定結果");
    private RString モード;
    private RString 表示条件;
    private RString ダミー審査会;

    /**
     * 介護認定審査会共有一覧の初期化処理ください。
     *
     * @param div YokaigoNinteiShinsakaiIchiranListDiv
     * @return YokaigoNinteiShinsakaiIchiranListDiv
     */
    public ResponseData<YokaigoNinteiShinsakaiIchiranListDiv> onLoad(YokaigoNinteiShinsakaiIchiranListDiv div) {
        ViewStateHolder.put(ViewStateKeys.モード, new RString("対象者割付"));
        getHandler(div).initialize();
        return ResponseData.of(div).respond();
    }

    /**
     * 検索するの処理です。
     *
     * @param div YokaigoNinteiShinsakaiIchiranListDiv
     * @return YokaigoNinteiShinsakaiIchiranListDiv
     */
    public ResponseData<YokaigoNinteiShinsakaiIchiranListDiv> onClick_BtnKensaku(YokaigoNinteiShinsakaiIchiranListDiv div) {
        モード = ViewStateHolder.get(ViewStateKeys.モード, RString.class);
        RDate 表示期間From = div.getTxtHyojiKikanFrom().getValue();
        RDate 表示期間To = div.getTxtHyojiKikanTo().getValue();
        ValidationMessageControlPairs validationMessages
                = getHandler(div).表示期間Fromと表示期間Toの前後順チェック();
        if (表示期間To.isBefore(表示期間From)) {
            return ResponseData.of(div).addValidationMessages(validationMessages).respond();
        }
        if (モード_開催予定登録.equals(モード) || モード_対象者割付.equals(モード)) {
            ダミー審査会 = div.getRadDammyShinsakai().getSelectedValue();
            表示条件 = div.getRadHyojiJokenWaritsukeMikanryo().getSelectedValue();
        }
        if (モード_審査会資料.equals(モード)) {
            表示条件 = div.getRadHyojiJokenWaritsukeKanryo().getSelectedValue();
        }
        if (モード_審査結果登録.equals(モード) || モード_事前結果登録.equals(モード)
                || モード_データ出力.equals(モード)) {
            表示条件 = div.getRadHyojiJokenShinsakaiMikanryo().getSelectedValue();
        }
        if (モード_判定結果.equals(モード)) {
            表示条件 = div.getRadHyojiJokenShinsakaiKanryo().getSelectedValue();
        }
        List<ShinsakaiKaisai> 審査会一覧 = ShinsakaiKaisaiFinder.
                createInstance().get審査会一覧(表示期間From, 表示期間To, モード, 表示条件, ダミー審査会).records();
        getHandler(div).set審査会委員一覧(審査会一覧);
        return ResponseData.of(div).respond();
    }

    /**
     * 選択アイコンの処理です。
     *
     * @param div YokaigoNinteiShinsakaiIchiranListDiv
     * @return YokaigoNinteiShinsakaiIchiranListDiv
     */
    public ResponseData<YokaigoNinteiShinsakaiIchiranListDiv> onClick_btnSelect(YokaigoNinteiShinsakaiIchiranListDiv div) {
        getHandler(div).get開催番号();
        return ResponseData.of(div).respond();
    }

    private YokaigoNinteiShinsakaiIchiranListHandler getHandler(YokaigoNinteiShinsakaiIchiranListDiv div) {
        return new YokaigoNinteiShinsakaiIchiranListHandler(div);
    }
}
