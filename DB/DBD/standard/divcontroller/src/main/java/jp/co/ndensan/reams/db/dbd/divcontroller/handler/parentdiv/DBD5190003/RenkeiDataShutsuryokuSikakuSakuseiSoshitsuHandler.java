/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.divcontroller.handler.parentdiv.DBD5190003;

import jp.co.ndensan.reams.db.dbd.business.core.ninteishinseijoho.YokaigoNinteiGaibuDataOutputHistory;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.DBD519003.DBD519003_YokaigoNinteiSoshitsuDataSakusei;
import jp.co.ndensan.reams.db.dbd.definition.core.jukyunintei.yokaigointerface.Datakubun;
import jp.co.ndensan.reams.db.dbd.divcontroller.entity.parentdiv.DBD5190003.RenkeiDataShutsuryokuSikakuSakuseiSoshitsuDiv;
import jp.co.ndensan.reams.db.dbd.service.core.dbd5190001.RenkeiDataSakuseiShinseiJohoManager;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBE;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RTime;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxDate;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxTime;

/**
 * 資格喪失（死亡）データ作成画面のハンドラークラスです。
 *
 * @reamsid_L DBD-2110-010 LDNS shaotw
 */
public class RenkeiDataShutsuryokuSikakuSakuseiSoshitsuHandler {

    private final RenkeiDataShutsuryokuSikakuSakuseiSoshitsuDiv div;
    private static final int 時_23 = 23;
    private static final int 分_59 = 59;
    private static final int 秒_59 = 59;
    private static final int DAY_ONE = 1;
    private static final int SECOND_ONE = 1;
    private static final RString IF種別_新 = new RString("0");
    private static final RString IF種別_旧 = new RString("1");

    /**
     * コンストラクタです。
     *
     * @param div RenkeiDataShutsuryokuSikakuSakuseiSoshitsuDiv
     */
    public RenkeiDataShutsuryokuSikakuSakuseiSoshitsuHandler(RenkeiDataShutsuryokuSikakuSakuseiSoshitsuDiv div) {
        this.div = div;
    }

    /**
     * 資格喪失（死亡）データ作成画面の初期化。
     */
    public void initialize() {
        YokaigoNinteiGaibuDataOutputHistory history = get要介護認定外部データ出力履歴();
        if (history != null) {
            YMDHMS 前回開始年月日時分 = history.getDataOutputKaishiYMDHMS();
            YMDHMS 前回終了年月日時分 = history.getDataOutputShuryoYMDHMS();
            if (前回開始年月日時分 != null) {
                div.setTxtZenkaiKaishiDay(setTextBoxDate(前回開始年月日時分.getDate()));
                div.setTxtZenkaiKaishiTime(setTextBoxTime(前回開始年月日時分.getRDateTime().getTime()));
            }
            if (前回終了年月日時分 != null) {
                div.setTxtZenkaiShuryoDay(setTextBoxDate(前回終了年月日時分.getDate()));
                div.setTxtZenkaiShuryoTime(setTextBoxTime(前回終了年月日時分.getRDateTime().getTime()));
                今回開始データ処理(前回終了年月日時分);
            }
        }
        初期活性制御();
    }

    private void 今回開始データ処理(YMDHMS yMDHMS) {
        RDate 前回終了年月日 = yMDHMS.getDate();
        RTime 前回終了時分 = yMDHMS.getRDateTime().getTime();

        if (前回終了時分.getHour() == 時_23 && 前回終了時分.getMinute() == 分_59 && 前回終了時分.getSecond() == 秒_59) {
            div.getTxtKonkaiKaishiDay().setValue(前回終了年月日.plusDay(DAY_ONE));
            div.getTxtKonkaiKaishiTime().setValue(RTime.of(0, 0, 0));
        } else {
            div.getTxtKonkaiKaishiDay().setValue(前回終了年月日);
            div.getTxtKonkaiKaishiTime().setValue(前回終了時分.plusSeconds(SECOND_ONE));
        }
    }

    private void 初期活性制御() {
        div.getRadIfShubetu().setSelectedKey(IF種別_旧);
        div.getRadIfShubetu().setDisabled(false);
        div.getTxtNewFileName().setValue(getDBEConfigValue(ConfigNameDBE.資格喪失_死亡_データ送信ファイル名_旧));
        RDateTime date = RDate.getNowDateTime();
        div.getTxtKonkaiShuryoDay().setValue(date.getDate());
        div.getTxtKonkaiShuryoTime().setValue(date.getTime());
        div.getTxtZenkaiKaishiDay().setDisabled(true);
        div.getTxtZenkaiKaishiTime().setDisabled(true);
        div.getTxtZenkaiShuryoDay().setDisabled(true);
        div.getTxtZenkaiShuryoTime().setDisabled(true);
        div.getTxtNewFileName().setDisabled(true);
    }

    /**
     * IF種別　ラジオボタンの画面表示。
     *
     */
    public void onClick_radIfShubetu() {
        if (IF種別_新.equals(div.getRadIfShubetu().getSelectedKey())) {
            div.getTxtNewFileName().setValue(getDBEConfigValue(ConfigNameDBE.資格喪失_死亡_データ送信ファイル名_新));
        } else if (div.getRadIfShubetu().getSelectedKey() == IF種別_旧) {
            div.getTxtNewFileName().setValue(getDBEConfigValue(ConfigNameDBE.資格喪失_死亡_データ送信ファイル名_旧));
        }
    }

    private TextBoxDate setTextBoxDate(RDate rDate) {
        TextBoxDate date = new TextBoxDate();
        date.setValue(rDate);
        return date;
    }

    private TextBoxTime setTextBoxTime(RTime rTime) {
        TextBoxTime time = new TextBoxTime();
        time.setValue(rTime);
        return time;
    }

    private YokaigoNinteiGaibuDataOutputHistory get要介護認定外部データ出力履歴() {
        return RenkeiDataSakuseiShinseiJohoManager.createInstance().get介護認定外部データ出力履歴(new Code(Datakubun.資格喪失_死亡_情報.getコード()));
    }

    private RString getDBEConfigValue(ConfigNameDBE config) {
        return DbBusinessConfig.get(config, RDate.getNowDate(), SubGyomuCode.DBE認定支援);
    }

    /**
     * バッチパラメータの作成。
     *
     * @return バッチパラメータ
     */
    public DBD519003_YokaigoNinteiSoshitsuDataSakusei createParameter() {
        DBD519003_YokaigoNinteiSoshitsuDataSakusei parameter = new DBD519003_YokaigoNinteiSoshitsuDataSakusei();
        parameter.setKonkaikaishidatetime(RDateTime.convertFrom(div.getTxtKonkaiKaishiDay().getValue(), div.getTxtKonkaiKaishiTime().getValue()));
        parameter.setKonkaishoridatetime(RDateTime.convertFrom(div.getTxtKonkaiShuryoDay().getValue(), div.getTxtKonkaiShuryoTime().getValue()));
        parameter.setNewfilename(div.getTxtNewFileName().getValue());
        parameter.setHanteiiraiichiranhyou(div.getRadInsatsuDay().getSelectedKey());
        return parameter;
    }

}