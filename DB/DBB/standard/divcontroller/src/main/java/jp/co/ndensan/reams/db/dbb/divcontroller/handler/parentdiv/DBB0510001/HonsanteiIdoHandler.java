/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.divcontroller.handler.parentdiv.DBB0510001;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jp.co.ndensan.reams.db.dbb.business.core.honsanteiidogennen.ChohyoMeter;
import jp.co.ndensan.reams.db.dbb.business.core.honsanteiidogennen.SanteiIdoGennen;
import jp.co.ndensan.reams.db.dbb.business.core.honsanteiidogennen.Shoriku;
import jp.co.ndensan.reams.db.dbb.business.core.kanri.KoseiTsukiHantei;
import jp.co.ndensan.reams.db.dbb.business.core.tsuchisho.notsu.ShutsuryokuKiKoho;
import jp.co.ndensan.reams.db.dbb.definition.batchprm.honsanteiidogennen.ChohyoResult;
import jp.co.ndensan.reams.db.dbb.definition.message.DbbErrorMessages;
import jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0510001.HonsanteiIdoDiv;
import jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0510001.dgChushutsuKikan_Row;
import jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0510001.dgHonsanteiIdoShoriKakunin_Row;
import jp.co.ndensan.reams.db.dbb.service.core.honsanteiidogennendo.HonsanteiIdoGennendo;
import jp.co.ndensan.reams.db.dbb.service.core.kanri.FukaNokiResearcher;
import jp.co.ndensan.reams.db.dbb.service.core.tsuchisho.notsu.ShutsuryokuKiKohoFactory;
import jp.co.ndensan.reams.db.dbx.business.core.kanri.FuchoKiUtil;
import jp.co.ndensan.reams.db.dbx.business.core.kanri.Kitsuki;
import jp.co.ndensan.reams.db.dbx.business.core.kanri.KitsukiList;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBB;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbx.definition.core.fuka.Tsuki;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoHanyo;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ShoriDateKanri;
import jp.co.ndensan.reams.db.dbz.definition.core.kyotsu.ShoriName;
import jp.co.ndensan.reams.ur.urc.business.core.noki.nokikanri.Noki;
import jp.co.ndensan.reams.ur.urz.divcontroller.entity.commonchilddiv.OutputChohyoIchiran.dgOutputChohyoIchiran_Row;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.ApplicationException;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RYear;
import jp.co.ndensan.reams.uz.uza.ui.binding.KeyValueDataSource;
import jp.co.ndensan.reams.uz.uza.ui.binding.propertyenum.DisplayTimeFormat;
import jp.co.ndensan.reams.uz.uza.ui.servlets.CommonButtonHolder;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ResponseHolder;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;

/**
 * 画面設計_DBBGM44001_本算定異動（現年度）のハンドラクラスです。
 *
 * @reamsid_L DBB-0880-010 wangkanglei
 */
public class HonsanteiIdoHandler {

    private final HonsanteiIdoDiv div;

    private static final int NUM_0 = 0;
    private static final int NUM_1 = 1;
    private static final int NUM_2 = 2;
    private static final int NUM_3 = 3;
    private static final RString 月 = new RString("月");
    private static final RString 未 = new RString("未");
    private static final RString 済 = new RString("済");
    private static final RString 遷移元区分_0 = new RString("0");
    private static final RString 遷移元区分_1 = new RString("1");
    private static final RString 算定月_2 = new RString("02");
    private static final RString 算定月_10 = new RString("10");
    private static final RString 算定月_12 = new RString("12");
    private static final RString 開始_2月 = new RString("02");
    private static final RString 開始_12月 = new RString("12");
    private static final RString スペース = RString.HALF_SPACE;
    private static final RString 現年度異動賦課 = new RString("DBBMN44001");
    private static final RString 実行する = new RString("btnRegister");
    private static final ReportId 帳票分類ID = new ReportId("DBB100045_HokenryoNonyuTsuchishoDaihyo");
    private static final RString 項目名 = new RString("当初出力_出力方法");
    private static final RString 別々出力 = new RString("別々出力");
    private static final RString 全件出力 = new RString("全件出力");
    private static final RString KEY0 = new RString("key0");
    private static final RString KEY1 = new RString("key1");
    private static final RString STR_時刻 = new RString("235959");
    private static final RString 特徴開始通知書 = new RString("DBB100032_TokubetsuChoshuKaishiTsuchishoDaihyo");
    private static final RString 特徴開始通知書_仮算定 = new RString("DBB100003_TokubetsuChoshuKaishiTsuchishoKariDaihyo");
    private static final RString 決定変更通知書 = new RString("DBB100039_KaigoHokenHokenryogakuKetteiTsuchishoDaihyo");
    private static final RString 納入通知書 = new RString("DBB100045_HokenryoNonyuTsuchishoDaihyo");
    private static final RString 納入通知書_45 = new RString("DBB100045_HokenryoNonyuTsuchishoKigoto");
    private static final RString 納入通知書_46 = new RString("DBB100046_HokenryoNonyuTsuchishoKigotoRencho");
    private static final RString 納入通知書_63 = new RString("DBB100063_NonyuTsuchishoCVSKigoto");
    private static final RString 納入通知書_64 = new RString("DBB100064_NonyuTsuchishoCVSKigotoRencho");
    private static final RString 特徴同定未完了 = new RString("0");
    private static final RString 計算未完了 = new RString("0");
    private static final RString 計算完了 = new RString("1");
    private static final RString 処理月10月 = new RString("10");
    private static final RString 処理月12月 = new RString("12");
    private static final RString 処理月2月 = new RString("2");
    private static final RString 通常12月 = new RString("12");
    private static final RString 通常2月 = new RString("02");
    private static final RString 通常4月 = new RString("04");
    private static final RString 特徴開始月_12 = new RString("特徴開始月：12月（捕捉月：6月）");
    private static final RString 特徴開始月_2 = new RString("特徴開始月：2月（捕捉月：8月）");
    private static final RString 特徴開始月_4 = new RString("特徴開始月：4月（捕捉月：10月）");
    private static final RString 待機_4 = new RString("特徴開始月：4月（捕捉月：6,8,10月）");
    private static final RString 処理対象なし = new RString("処理対象なし");
    private static final RString 本算定異動賦課 = new RString("DBB0510001");
    private static final RString 現年度異動_通知書作成 = new RString("DBB0510003");

    /**
     * コンストラクタです。
     *
     * @param div HonsanteiIdoDiv
     */
    public HonsanteiIdoHandler(HonsanteiIdoDiv div) {
        this.div = div;
    }

    /**
     * 画面初期化のメソッドます。
     *
     * @param 調定年度 FlexibleYear
     * @return flag boolean
     */
    public boolean initialize(FlexibleYear 調定年度) {

        RDate date = RDate.getNowDate();
        int 境界日付 = date.getLastDay() - Integer.valueOf(DbBusinessConfig.get(
                ConfigNameDBB.日付関連_更正月判定日数, date, SubGyomuCode.DBB介護賦課).toString());
        int 日 = date.getDayValue();
        RString 属する月 = new RString(String.valueOf(date.getMonthValue()));
        List<KeyValueDataSource> dataSource = new ArrayList<>();
        dataSource.add(new KeyValueDataSource(属する月.padZeroToLeft(NUM_2), 属する月.concat(月)));
        if (日 < 境界日付 || date.getMonthValue() == NUM_3) {
            div.getShotiJokyo().getHonsanteiIdoShoriNaiyo().getDdlShoritsuki().setDataSource(dataSource);
            div.getShotiJokyo().getHonsanteiIdoShoriNaiyo().getDdlShoritsuki().setSelectedKey(属する月.padZeroToLeft(NUM_2));
        } else {
            RString 翌月 = new RString(String.valueOf(date.plusMonth(NUM_1).getMonthValue()));
            dataSource.add(new KeyValueDataSource(翌月.padZeroToLeft(NUM_2), 翌月.concat(月)));
            div.getShotiJokyo().getHonsanteiIdoShoriNaiyo().getDdlShoritsuki().setDataSource(dataSource);
            div.getShotiJokyo().getHonsanteiIdoShoriNaiyo().getDdlShoritsuki().setSelectedKey(翌月.padZeroToLeft(NUM_2));
        }

        boolean flag = set処理状態(調定年度, date);
        if (現年度異動賦課.equals(ResponseHolder.getMenuID())) {
            RString 算定月 = div.getShotiJokyo().getHonsanteiIdoShoriNaiyo().getDdlShoritsuki().getSelectedKey();
            Shoriku 処理区分 = HonsanteiIdoGennendo.createInstance().setShorikubun(
                    new RString(Integer.valueOf(算定月.toString())), 調定年度);
            if (処理区分 != null) {
                set対象補足月テキストボックス(処理区分, date);
            } else {
                div.getXtTaishoTokuchoKaishiTsuki().setDisplayNone(false);
                div.getXtTaishoTokuchoKaishiTsuki().setValue(処理対象なし);
            }
            div.getXtTaishoTokuchoKaishiTsuki().setReadOnly(false);
            set抽出条件(調定年度);
        }
        set帳票作成個別情報(調定年度, date);
        return flag;
    }

    private void set対象補足月テキストボックス(Shoriku 処理区分, RDate date) {
        if (特徴同定未完了.equals(処理区分.get特徴同定区分())) {
            throw new ApplicationException(DbbErrorMessages.特徴対象者同定処理未完了.getMessage());
        }
        if (計算未完了.equals(処理区分.get計算処理区分())) {
            set対象特徴開始月テキストボックス(date);
        } else if (計算完了.equals(処理区分.get計算処理区分())) {
            div.getXtTaishoTokuchoKaishiTsuki().setDisplayNone(true);
        }
    }

    private void set対象特徴開始月テキストボックス(RDate date) {
        div.getXtTaishoTokuchoKaishiTsuki().setDisplayNone(false);
        RString 処理月 = RString.EMPTY;
        RString 捕捉月;
        if (処理月10月.equals(処理月)) {
            捕捉月 = DbBusinessConfig.get(ConfigNameDBB.特別徴収_特徴開始月_6月捕捉, date, SubGyomuCode.DBB介護賦課);
            if (通常12月.equals(捕捉月)) {
                div.getXtTaishoTokuchoKaishiTsuki().setValue(特徴開始月_12);
                div.getRadTokuchoHosokuIraiKingakuKeisan().setDisabled(false);
            } else {
                div.getXtTaishoTokuchoKaishiTsuki().setValue(処理対象なし);
            }
        } else if (処理月12月.equals(処理月)) {
            捕捉月 = DbBusinessConfig.get(ConfigNameDBB.特別徴収_特徴開始月_8月捕捉, date, SubGyomuCode.DBB介護賦課);
            if (通常2月.equals(捕捉月)) {
                div.getXtTaishoTokuchoKaishiTsuki().setValue(特徴開始月_2);
                div.getRadTokuchoHosokuIraiKingakuKeisan().setDisabled(false);
            } else {
                div.getXtTaishoTokuchoKaishiTsuki().setValue(処理対象なし);
            }
        } else if (処理月2月.equals(処理月)) {
            捕捉月 = DbBusinessConfig.get(ConfigNameDBB.特別徴収_特徴開始月_10月捕捉, date, SubGyomuCode.DBB介護賦課);
            if (通常4月.equals(捕捉月)) {
                div.getXtTaishoTokuchoKaishiTsuki().setValue(特徴開始月_4);
            } else {
                div.getXtTaishoTokuchoKaishiTsuki().setValue(待機_4);
                div.getRadTokuchoHosokuIraiKingakuKeisan().setDisabled(false);
            }
        } else {
            div.getXtTaishoTokuchoKaishiTsuki().setValue(処理対象なし);
        }
    }

    /**
     * 抽出条件設定のメソッドます。
     *
     * @param 調定年度 RString
     */
    public void set抽出条件(FlexibleYear 調定年度) {
        ShoriDateKanri 処理日付管理 = HonsanteiIdoGennendo.createInstance().getChushutsuKaishiNichiji(調定年度);
        if (処理日付管理 != null) {
            YMDHMS 抽出開始日時 = 処理日付管理.get基準日時();
            List<dgChushutsuKikan_Row> rowList = new ArrayList<>();
            dgChushutsuKikan_Row row = new dgChushutsuKikan_Row();
            if (抽出開始日時 != null) {
                RString 年月日 = 抽出開始日時.getRDateTime().getDate().wareki().toDateString();
                RString 時刻 = 抽出開始日時.getRDateTime().getTime().toFormattedTimeString(
                        DisplayTimeFormat.HH_mm_ss);
                row.getTxtChishutsuStNichiji().setValue(年月日.concat(スペース).concat(時刻));
                row.getTxtChushutsuStYMD().setValue(抽出開始日時.getRDateTime().getDate());
                row.getTxtChushutsuStTime().setValue(抽出開始日時.getRDateTime().getTime());
            }
            RString key = div.getHonsanteiIdoChushutsuJoken().getRadChushutsuJoken().getSelectedKey();
            RDate nowDate = RDate.getNowDate();
            if (KEY0.equals(key)) {
                YMDHMS date = new YMDHMS(nowDate.minusDay(nowDate.getDayValue()).toDateString()
                        .concat(STR_時刻));
                set抽出終了日時_未満(row, date.getRDateTime());
            } else if (KEY1.equals(key)) {
                YMDHMS date = new YMDHMS(nowDate.minusDay(NUM_1).toDateString()
                        .concat(STR_時刻));
                set抽出終了日時_未満(row, date.getRDateTime());
            } else {
                set抽出終了日時_未満(row, RDate.getNowDateTime());
            }
            rowList.add(row);
            div.getHonsanteiIdoChushutsuJoken().getDgChushutsuKikan().setDataSource(rowList);
        }
    }

    private void set抽出終了日時_未満(dgChushutsuKikan_Row row, RDateTime date) {
        RString 年月日 = date.getDate().wareki().toDateString();
        RString 時刻 = date.getTime().toFormattedTimeString(DisplayTimeFormat.HH_mm_ss);
        row.getTxtChishutsuEdNichiji().setValue(年月日.concat(スペース).concat(時刻));
        row.getTxtChushutsuEdYMD().setValue(date.getDate());
        row.getTxtChushutsuEdTime().setValue(date.getTime());
    }

    private boolean set処理状態(FlexibleYear 調定年度, RDate date) {
        dgHonsanteiIdoShoriKakunin_Row row = new dgHonsanteiIdoShoriKakunin_Row();
        List<dgHonsanteiIdoShoriKakunin_Row> rowList = new ArrayList<>();
        boolean flag = false;
        RString 算定月 = div.getShotiJokyo().getHonsanteiIdoShoriNaiyo().getDdlShoritsuki().getSelectedKey();
        if (現年度異動賦課.equals(ResponseHolder.getMenuID())) {
            List<ShoriDateKanri> entityList = HonsanteiIdoGennendo.createInstance().getShoriDateKanriList(
                    new RString(Integer.valueOf(算定月.toString())),
                    調定年度,
                    遷移元区分_0);
            RString 特別徴収対象同定 = ShoriName.特徴対象者同定.get名称();
            RString 開始月_6月 = DbBusinessConfig.get(ConfigNameDBB.特別徴収_特徴開始月_6月捕捉, date, SubGyomuCode.DBB介護賦課);
            RString 開始月_8月 = DbBusinessConfig.get(ConfigNameDBB.特別徴収_特徴開始月_8月捕捉, date, SubGyomuCode.DBB介護賦課);
            if (算定月_10.equals(算定月) && 開始_12月.equals(開始月_6月)) {
                flag = set状況と処理日時(entityList, rowList, row, 特別徴収対象同定, flag);
            } else if (算定月_12.equals(算定月) && 開始_2月.equals(開始月_8月)) {
                flag = set状況と処理日時(entityList, rowList, row, 特別徴収対象同定, flag);
            } else if (算定月_2.equals(算定月)) {
                flag = set状況と処理日時(entityList, rowList, row, 特別徴収対象同定, flag);
            }
            // TODO QA#85917 処理名＝住民税更正分課税確定処理の場合  この部分についてはTODOとして。
        } else {
            List<ShoriDateKanri> entityList = HonsanteiIdoGennendo.createInstance().getShoriDateKanriList(
                    new RString(Integer.valueOf(算定月.toString())),
                    調定年度,
                    遷移元区分_1);
            RString 処理名_異動 = ShoriName.異動賦課.get名称();
            set状況と処理日時(entityList, rowList, row, 処理名_異動, flag);
        }
        return flag;
    }

    private boolean set状況と処理日時(List<ShoriDateKanri> entityList,
            List<dgHonsanteiIdoShoriKakunin_Row> rowList,
            dgHonsanteiIdoShoriKakunin_Row row,
            RString 処理名,
            boolean flag) {
        if (entityList.isEmpty()) {
            rowList.add(setDgRow(row, 処理名, 未, RString.EMPTY));
        } else {
            for (ShoriDateKanri entity : entityList) {
                YMDHMS 基準日時 = entity.get基準日時();
                if (基準日時 != null && !基準日時.isEmpty() && 処理名.equals(entity.get処理名())) {
                    RString 年月日 = 基準日時.getRDateTime().getDate().wareki().toDateString();
                    RString 時刻 = 基準日時.getRDateTime().getTime().toFormattedTimeString(
                            DisplayTimeFormat.HH_mm_ss);
                    rowList.add(setDgRow(row, 処理名, 済, 年月日.concat(スペース).concat(時刻)));
                    flag = true;
                } else {
                    rowList.add(setDgRow(row, 処理名, 未, RString.EMPTY));
                }
            }
        }
        return flag;
    }

    private dgHonsanteiIdoShoriKakunin_Row setDgRow(
            dgHonsanteiIdoShoriKakunin_Row row,
            RString 処理名,
            RString 状況,
            RString 処理日時) {
        row.setTxtShoriMei(処理名);
        row.setTxtJokyo(状況);
        row.setTxtShoriNichiji(処理日時);
        return row;
    }

    /**
     * 異動賦課に対応する賦課確定処理のメソッドます。
     *
     * @param choteiNendo 調定年度
     * @return boolean
     */
    public boolean is基準日時(RString choteiNendo) {
        FlexibleYear 年度 = new FlexibleYear(choteiNendo.toString());
        RYear 調定年度 = new RYear(choteiNendo.toString());
        div.getShotiJokyo().getHonsanteiIdoShoriNaiyo().getTxtChoteiNendo().setDomain(調定年度);
        div.getShotiJokyo().getHonsanteiIdoShoriNaiyo().getTxtFukaNendo().setDomain(調定年度);
        ShoriDateKanri dbT7022Entity = HonsanteiIdoGennendo.createInstance().getMax基準日時(
                年度, ShoriName.異動賦課.get名称());
        YMDHMS 異動賦課の基準日時 = dbT7022Entity.get基準日時();
        dbT7022Entity = HonsanteiIdoGennendo.createInstance().getMax基準日時(年度, ShoriName.異動賦課確定.get名称());
        YMDHMS 異動賦課確定の基準日時 = dbT7022Entity.get基準日時();
        return 異動賦課確定の基準日時.isBefore(異動賦課の基準日時);
    }

    private void set帳票作成個別情報(FlexibleYear 調定年度, RDate date) {
        if (現年度異動賦課.equals(ResponseHolder.getMenuID())) {
            div.getHonsanteiIdoChohyoHakko().getCcdChohyoIchiran().load(SubGyomuCode.DBB介護賦課, 本算定異動賦課);
        } else {
            div.getHonsanteiIdoChohyoHakko().getCcdChohyoIchiran().load(SubGyomuCode.DBB介護賦課, 現年度異動_通知書作成);
        }

        KoseiTsukiHantei 更正月判定 = new KoseiTsukiHantei();
        Kitsuki 更正月 = 更正月判定.find更正月(date);
        Noki 普徴納期 = FukaNokiResearcher.createInstance().get普徴納期(更正月.get期AsInt());
        div.getHonSanteiIdoTsuchiKobetsuJoho().getTxtNotsuHakkoYMD().setValue(普徴納期.get通知書発行日());

        ChohyoSeigyoHanyo 帳票制御汎用キー = HonsanteiIdoGennendo.createInstance().getChohyoHanyoKey(
                SubGyomuCode.DBB介護賦課, 帳票分類ID, 調定年度, 項目名);
        if (帳票制御汎用キー != null) {
            if (遷移元区分_0.equals(帳票制御汎用キー.get設定値())) {
                div.getHonSanteiIdoTsuchiKobetsuJoho().getTxtNotsuShutsuryokuKi().setValue(別々出力);
            } else if (遷移元区分_1.equals(帳票制御汎用キー.get設定値())) {
                div.getHonSanteiIdoTsuchiKobetsuJoho().getTxtNotsuShutsuryokuKi().setValue(全件出力);
            }
        }

        FuchoKiUtil util = new FuchoKiUtil();
        KitsukiList 期月リスト = util.get期月リスト();
//        KitsukiList 本算定期間_期月リスト = 期月リスト.filtered本算定期間();
        RString 処理対象月 = div.getShotiJokyo().getHonsanteiIdoShoriNaiyo().getDdlShoritsuki().getSelectedKey();
//        boolean 本算定異動 = false;
//        if (FuchokiJohoTsukiShoriKubun.随時.getName().equals(
//                本算定期間_期月リスト.get期の月(NUM_0).get(NUM_0).get月処理区分().getName())) {
//            本算定異動 = true;
//        }
        Kitsuki 月の期 = 期月リスト.get月の期(Tsuki.toValue(処理対象月));
        try {
            List<ChohyoResult> 帳票IDList = HonsanteiIdoGennendo.createInstance().getChohyoID(
                    調定年度, new RString(月の期.get期AsInt()), get各通知書の帳票ID());
            List<ShutsuryokuKiKoho> 出力期;
            ShutsuryokuKiKohoFactory kohoFactory = new ShutsuryokuKiKohoFactory(調定年度);
            if (帳票IDList != null) {
                boolean flag = false;
                for (ChohyoResult result : 帳票IDList) {
                    if (納入通知書_45.equals(result.get帳票ID())
                            || 納入通知書_46.equals(result.get帳票ID())
                            || 納入通知書_63.equals(result.get帳票ID())
                            || 納入通知書_64.equals(result.get帳票ID())) {
                        flag = true;
                    }
                }
                出力期 = kohoFactory.create出力期候補(flag, false);
            } else {
                出力期 = kohoFactory.create出力期候補(false, false);
            }
            List<KeyValueDataSource> dataSource = new ArrayList<>();
            for (ShutsuryokuKiKoho entity : 出力期) {
                dataSource.add(new KeyValueDataSource(entity.get期月().get期(), entity.get表示文字列()));
            }
            div.getHonSanteiIdoTsuchiKobetsuJoho().getDdlNotsuShuturyokuki().setDataSource(dataSource);
//            if (本算定異動) {
//                // TODO
//                div.getHonSanteiIdoTsuchiKobetsuJoho().getDdlNotsuShuturyokuki().setSelectedKey(月);
//            }
        } catch (ApplicationException e) {
            throw new ApplicationException(DbbErrorMessages.帳票ID取得不可のため処理不可.getMessage());
        }
    }

    /**
     * 帳票IDのチェック。
     *
     * @param 調定年度 FlexibleYear
     */
    public void check帳票ID(FlexibleYear 調定年度) {
        try {
            HonsanteiIdoGennendo.createInstance().getChohyoID(調定年度, 月, get各通知書の帳票ID());
        } catch (ApplicationException e) {
            throw new ApplicationException(DbbErrorMessages.帳票ID取得不可のため処理不可.getMessage());
        }
    }

    private List<ChohyoMeter> get各通知書の帳票ID() {
        Map<RString, RString> rowMap = div.getHonsanteiIdoChohyoHakko().getCcdChohyoIchiran().getSelected帳票IdAnd出力順Id();
        List<ChohyoMeter> 出力帳票一覧 = new ArrayList<>();
        ChohyoMeter chohyoMeter;
        Set<Map.Entry<RString, RString>> set = rowMap.entrySet();
        for (Map.Entry<RString, RString> entry : set) {
            chohyoMeter = new ChohyoMeter();
            chohyoMeter.set帳票分類ID(new ReportId(entry.getKey()));
            chohyoMeter.set出力順ID(entry.getValue());
            出力帳票一覧.add(chohyoMeter);
        }
        return 出力帳票一覧;
    }

    /**
     * 入力チェックのメソッドます。
     *
     * @return ResponseData
     */
    public ValidationMessageControlPairs getCheckMessage() {
        Map<RString, RString> rowMap = div.getHonsanteiIdoChohyoHakko().getCcdChohyoIchiran().getSelected帳票IdAnd出力順Id();

        Set<Map.Entry<RString, RString>> set = rowMap.entrySet();
        boolean 特徴開始通知書Flag = false;
        boolean 決定変更通知書Flag = false;
        boolean 納入通知書Flag = false;
        for (Map.Entry<RString, RString> entry : set) {
            if (特徴開始通知書.equals(entry.getKey()) || 特徴開始通知書_仮算定.equals(entry.getKey())) {
                特徴開始通知書Flag = true;
            }
            if (決定変更通知書.equals(entry.getKey())) {
                決定変更通知書Flag = true;
            }
            if (納入通知書.equals(entry.getKey())) {
                納入通知書Flag = true;
            }
        }
        HonsanteiIdoValidationHandler validation = new HonsanteiIdoValidationHandler(div);
        ValidationMessageControlPairs pairs = validation.必須チェックのValidate(特徴開始通知書Flag,
                決定変更通知書Flag, 納入通知書Flag);
        return pairs;
    }

    /**
     * 本算定異動（現年度）画面divのParamter。
     *
     * @return 画面で入力した項目
     */
    public SanteiIdoGennen setParamter() {
        SanteiIdoGennen paramter = new SanteiIdoGennen();
        paramter.set調定年度(new FlexibleYear(div.getTxtChoteiNendo().getDomain().toString()));
        paramter.set賦課年度(new FlexibleYear(div.getTxtFukaNendo().getDomain().toString()));
        paramter.set処理対象(div.getHonsanteiIdoShoriNaiyo().getDdlShoritsuki().getSelectedKey());
        dgChushutsuKikan_Row row = div.getDgChushutsuKikan().getDataSource().get(0);
        YMDHMS 抽出開始日時 = new YMDHMS(row.getTxtChushutsuStYMD().getValue(), row.getTxtChushutsuStTime().getValue());
        YMDHMS 抽出終了日時 = new YMDHMS(row.getTxtChushutsuEdYMD().getValue(), row.getTxtChushutsuEdTime().getValue());
        paramter.set抽出開始日時(抽出開始日時);
        paramter.set抽出終了日時(抽出終了日時);
        paramter.set特徴捕捉分(div.getXtTaishoTokuchoKaishiTsuki().getValue());
        paramter.set依頼金額計算(div.getRadTokuchoHosokuIraiKingakuKeisan().getSelectedKey());
        List<ChohyoMeter> 出力帳票一覧 = new ArrayList<>();
        ChohyoMeter chohyoMeter;
        for (dgOutputChohyoIchiran_Row 帳票 : div.getCcdChohyoIchiran().get出力帳票一覧()) {
            chohyoMeter = new ChohyoMeter();
            chohyoMeter.set出力順ID(帳票.getShutsuryokujunID());
            chohyoMeter.set帳票分類ID(new ReportId(帳票.getChohyoID()));
            出力帳票一覧.add(chohyoMeter);
        }
        paramter.set出力帳票一覧List(出力帳票一覧);
        paramter.set特徴_出力対象(div.getRadTokuchoKaishiTsuchiTaishosha().getSelectedKey());
        RDate 特徴_発行日 = div.getTxtTokuchoKaishiTsuchishoHakkoYMD().getValue();
        if (特徴_発行日 != null) {
            paramter.set特徴_発行日(new FlexibleDate(特徴_発行日.toString()));
        }
        paramter.set決定_チェックボックス(div.getChkKetteiTsuchi().getSelectedKeys().get(NUM_0));
        paramter.set決定_文書番号(div.getCcdBushiNoKetteiTsuchi().get文書番号());
        RDate 決定_発行日 = div.getTxtKetteiTsuchiHakkoYMD().getValue();
        if (決定_発行日 != null) {
            paramter.set決定_発行日(new FlexibleDate(決定_発行日.toString()));
        }
        paramter.set変更_チェックボックス(div.getChkHenkoTsuchi().getSelectedKeys().get(NUM_0));
        paramter.set変更_対象者(div.getChkHenkoTsuchiTaishosha().getSelectedKeys().get(NUM_0));
        paramter.set変更_文書番号(div.getCcdBunshoBangoHenkoTsuchi().get文書番号());
        RDate 変更_発行日 = div.getTxtHenkoTsuchiHakkoYMD().getValue();
        if (変更_発行日 != null) {
            paramter.set変更_発行日(new FlexibleDate(変更_発行日.toString()));
        }
        paramter.set納入_対象者(div.getChkNotsuTaishoSha().getSelectedKeys().get(NUM_0));
        paramter.set納入_口座振替者(div.getRadNotsuKozaShutsuryokuYoshiki().getSelectedKey());
        RDate 納入_発行日 = div.getTxtNotsuHakkoYMD().getValue();
        if (納入_発行日 != null) {
            paramter.set納入_発行日(new FlexibleDate(納入_発行日.toString()));
        }
        paramter.set納入_出力方法(div.getTxtNotsuShutsuryokuKi().getValue());
//       paramter.set納入_出力期(div.getDdlNotsuShuturyokuki().getSelectedKey());
        paramter.set納入_生活保護対象者(div.getRadNotsuSeikatsuHogo().getSelectedKey());
        paramter.set納入_ページごとに山分け(div.getRadNotsuYamawake().getSelectedKey());
        if (現年度異動賦課.equals(ResponseHolder.getMenuID())) {
            paramter.set一括発行起動フラグ(false);
        } else {
            paramter.set一括発行起動フラグ(true);
        }
        // 本算定異動（随時期）の場合、TRUE ||  本算定異動（法定納期内）の場合、FALSE
//       paramter.set随時フラグ();
        return paramter;
    }

    /**
     * 実行ボタン設定する。
     *
     * @param flag boolean
     */
    public void set実行ボタン(boolean flag) {
        if (flag) {
            CommonButtonHolder.setDisabledByCommonButtonFieldName(実行する, false);
        } else {
            CommonButtonHolder.setDisabledByCommonButtonFieldName(実行する, true);
        }
    }
}
