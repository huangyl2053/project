/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.divcontroller.handler.parentdiv.DBU0010011;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dba.business.core.shichosonsentaku.ShichosonSelectorModel;
import jp.co.ndensan.reams.db.dba.business.core.shichosonsentaku.ShichosonSelectorResult;
import jp.co.ndensan.reams.db.dbb.definition.core.HyojiUmu;
import jp.co.ndensan.reams.db.dbu.definition.batchprm.DBU010010.DBU010010_JigyoHokokuGeppo_MainParameter;
import jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0010011.JigyoJokyoHokokuGeppoSakuseiDiv;
import jp.co.ndensan.reams.db.dbx.business.core.shichosonsecurityjoho.KoseiShichosonJoho;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBU;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.DonyuKeitaiCode;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.GyomuBunrui;
import jp.co.ndensan.reams.db.dbx.service.core.shichosonsecurityjoho.ShichosonSecurityJoho;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ShoriDateKanri;
import jp.co.ndensan.reams.db.dbz.business.core.gappeijoho.gappeijoho.GappeiCityJyoho;
import jp.co.ndensan.reams.db.dbz.business.core.koikizenshichosonjoho.KoikiZenShichosonJoho;
import jp.co.ndensan.reams.db.dbz.service.core.basic.ShoriDateKanriManager;
import jp.co.ndensan.reams.db.dbz.service.core.gappeijoho.gappeijoho.GappeiCityJohoBFinder;
import jp.co.ndensan.reams.db.dbz.service.core.koikishichosonjoho.KoikiShichosonJohoFinder;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.RTime;
import jp.co.ndensan.reams.uz.uza.ui.binding.KeyValueDataSource;
import jp.co.ndensan.reams.uz.uza.util.serialization.DataPassingConverter;

/**
 * 事業状況報告（月報）作成の処理です
 *
 * @reamsid_L DBU-5550-010 dangjingjing
 */
public class JigyoJokyoHokokuGeppoSakuseiHandler {

    private static final RString 集計のみ_CODE = new RString("1");
    private static final RString 集計後に印刷_CODE = new RString("2");
    private static final RString 過去の集計結果を印刷_CODE = new RString("3");
    private static final RString 集計のみ = new RString("shukei");
    private static final RString 集計後に印刷 = new RString("shukeiOutput");
    private static final RString 過去の集計結果を印刷 = new RString("kakoShukeiOutput");
    private static final RString 合併あり = new RString("1");
    private static final RString 審査年月 = new RString("1");
    private static final RString 決定年月 = new RString("2");
    private static final RString 現物分_選択 = new RString("1");
    private static final RString 償還分_審査_選択 = new RString("2");
    private static final RString 償還分_決定_選択 = new RString("3");
    private static final int 月 = 3;
    private static final int 月別 = 4;
    private static final RString 点 = new RString(".");
    private static final RString すべて選択 = new RString("all");
    private static final RString 一般状況1_11 = new RString("ippan1_11");
    private static final RString 一般状況12_14_現物分 = new RString("ippan12_14Genbutsu");
    private static final RString 保険給付決定状況_現物分 = new RString("hokenKyufuGenbutsu");
    private static final RString 一般状況12_14_償還分 = new RString("ippan12_14Shokan");
    private static final RString 保険給付決定状況_償還分 = new RString("hokenKyufuShokan");
    private static final RString 保険給付決定状況_高額分 = new RString("hokenKyufuKogaku");
    private static final RString 保険給付決定状況_高額合算分 = new RString("hokenKyufuKogakuGassan");
    private static final RString 審査年月で集計 = new RString("shinsaYM4");
    private static final RString 決定年月で集計 = new RString("keiteiYM4");
    private static final RString 給付審査年月で集計 = new RString("shinsaYM5");
    private static final RString 給付決定年月で集計 = new RString("keiteiYM5");
    private static final RString DBU010020 = new RString("DBU010020");
    private static final RString DBU010030 = new RString("DBU010030");
    private static final RString DBU010040 = new RString("DBU010040");
    private static final RString DBU010050 = new RString("DBU010050");
    private static final RString DBU010060 = new RString("DBU010060");
    private static final RString DBU010070 = new RString("DBU010070");
    private static final RString DBU010080 = new RString("DBU010080");
    private static final RString DBU010090 = new RString("DBU010090");
    private static final RString DBU010100 = new RString("DBU010100");
    private static final RDate 基準日 = RDate.getNowDate();
    private static final RString 年度内連番 = new RString("0001");
    private final JigyoJokyoHokokuGeppoSakuseiDiv div;
    private final ShoriDateKanriManager shoriDateKanriManager = new ShoriDateKanriManager();

    /**
     * コンストラクタです。
     *
     * @param div 各種申請書Div
     */
    public JigyoJokyoHokokuGeppoSakuseiHandler(JigyoJokyoHokokuGeppoSakuseiDiv div) {
        this.div = div;
    }

    /**
     * 事業状況報告（月報）作成の初期化処理です。
     *
     * @param shoriDateKanriList <ShoriDateKanri>
     */
    public void onLoad(List<ShoriDateKanri> shoriDateKanriList) {
        set合併市町村用保険者選択ラジオボタン();
        set広域構成市町村用保険者選択ラジオボタン();
        set市町村選択ダイアログボタン();
        set過去報告年月(shoriDateKanriList);
        set審査年月決定年月();
        set日付時刻();
        setすべて選択チェックボックス();
    }

    private void set合併市町村用保険者選択ラジオボタン() {
        if (is合併あり() && is単一()) {
            div.getTblJikkoTani().getRadGappeiShichoson().setVisible(true);
        } else if (!is合併あり() && is単一()
                || is広域()) {
            div.getTblJikkoTani().getRadGappeiShichoson().setVisible(false);
        }
    }

    private void set広域構成市町村用保険者選択ラジオボタン() {
        if (is広域()) {
            div.getTblJikkoTani().getRadKoikiRengo().setVisible(true);
        } else if (is単一()) {
            div.getTblJikkoTani().getRadKoikiRengo().setVisible(false);
        }
    }

    private void set市町村選択ダイアログボタン() {
        if (is合併あり() || is広域()) {
            div.getTblJikkoTani().getBtnShichosonSelect().setVisible(true);
            div.getTblJikkoTani().getBtnShichosonSelect().setDisabled(true);
        } else if (is単一()) {
            div.getTblJikkoTani().getBtnShichosonSelect().setVisible(false);
        }
    }

    /**
     * 過去報告年月 DDLのデータソースを設定
     *
     * @param shoriDateKanriList
     */
    private void set過去報告年月(List<ShoriDateKanri> shoriDateKanriList) {
        List<KeyValueDataSource> dataSourceList = new ArrayList<>();
        int count = 1;
        for (ShoriDateKanri shoriDateKanri : shoriDateKanriList) {
            RStringBuilder 過去年月 = new RStringBuilder();
            過去年月.append(shoriDateKanri.get年度().wareki().toDateString());
            過去年月.append(点);
            過去年月.append(shoriDateKanri.get処理枝番().substring(2));
            KeyValueDataSource dataSource = new KeyValueDataSource(new RString(String.valueOf(count)), 過去年月.toRString());
            dataSourceList.add(dataSource);
            count = count + 1;
        }
        div.getDdlKakoHokokuYM().setDataSource(dataSourceList);
        div.getDdlKakoHokokuYM().setDisabled(true);
    }

    /**
     * 審査年月決定年月を設定する。
     */
    private void set審査年月決定年月() {
        RString 集計年月 = DbBusinessConfig.get(ConfigNameDBU.事業状況報告_一般状況集計方法, 基準日, SubGyomuCode.DBU介護統計報告);
        if (集計年月.equals(審査年月)) {
            div.getRadlblShukeiType4().setSelectedKey(審査年月で集計);
        } else if (集計年月.equals(決定年月)) {
            div.getRadlblShukeiType4().setSelectedKey(決定年月で集計);
        }
        RString 給付年月 = DbBusinessConfig.get(ConfigNameDBU.事業状況報告_保険給付集計方法, 基準日, SubGyomuCode.DBU介護統計報告);
        if (給付年月.equals(審査年月)) {
            div.getRadlblShukeiType5().setSelectedKey(給付審査年月で集計);
        } else if (給付年月.equals(決定年月)) {
            div.getRadlblShukeiType5().setSelectedKey(給付決定年月で集計);
        }
    }

    /**
     * 日付時刻を設定する
     */
    public void set日付時刻() {
        div.getTxtSakuseiYMD1().setValue(RDate.getNowDate());
        div.getTxtSakuseiYMD2().setValue(RDate.getNowDate());
        div.getTxtSakuseiYMD3().setValue(RDate.getNowDate());
        div.getTxtSakuseiYMD4().setValue(RDate.getNowDate());
        div.getTxtSakuseiYMD5().setValue(RDate.getNowDate());
        div.getTxtSakuseiYMD6().setValue(RDate.getNowDate());
        div.getTxtSakuseiYMD7().setValue(RDate.getNowDate());
        div.getTxtSakuseiTime1().setValue(RTime.now());
        div.getTxtSakuseiTime2().setValue(RTime.now());
        div.getTxtSakuseiTime3().setValue(RTime.now());
        div.getTxtSakuseiTime4().setValue(RTime.now());
        div.getTxtSakuseiTime5().setValue(RTime.now());
        div.getTxtSakuseiTime6().setValue(RTime.now());
        div.getTxtSakuseiTime7().setValue(RTime.now());
        if (div.getTxtShukeiYM1().getValue().isEmpty()) {
            div.getTxtSakuseiYMD1().setReadOnly(true);
            div.getTxtSakuseiTime1().setReadOnly(true);
        } else {
            div.getTxtSakuseiYMD1().setReadOnly(false);
            div.getTxtSakuseiTime1().setReadOnly(false);
        }
        if (div.getTxtShukeiYM2().getValue().isEmpty()) {
            div.getTxtSakuseiYMD2().setReadOnly(true);
            div.getTxtSakuseiTime2().setReadOnly(true);
        } else {
            div.getTxtSakuseiYMD2().setReadOnly(false);
            div.getTxtSakuseiTime2().setReadOnly(false);
        }
        if (div.getTxtShukeiYM3().getValue().isEmpty()) {
            div.getTxtSakuseiYMD3().setReadOnly(true);
            div.getTxtSakuseiTime3().setReadOnly(true);
        } else {
            div.getTxtSakuseiYMD3().setReadOnly(false);
            div.getTxtSakuseiTime3().setReadOnly(false);
        }
        if (div.getTxtShukeiYM4().getValue().isEmpty()) {
            div.getTxtSakuseiYMD4().setReadOnly(true);
            div.getTxtSakuseiTime4().setReadOnly(true);
        } else {
            div.getTxtSakuseiYMD4().setReadOnly(false);
            div.getTxtSakuseiTime4().setReadOnly(false);
        }
        if (div.getTxtShukeiYM5().getValue().isEmpty()) {
            div.getTxtSakuseiYMD5().setReadOnly(true);
            div.getTxtSakuseiTime5().setReadOnly(true);
        } else {
            div.getTxtSakuseiYMD5().setReadOnly(false);
            div.getTxtSakuseiTime5().setReadOnly(false);
        }
        if (div.getTxtShukeiYM6().getValue().isEmpty()) {
            div.getTxtSakuseiYMD6().setReadOnly(true);
            div.getTxtSakuseiTime6().setReadOnly(true);
        } else {
            div.getTxtSakuseiYMD6().setReadOnly(false);
            div.getTxtSakuseiTime6().setReadOnly(false);
        }
        if (div.getTxtShukeiYM7().getValue().isEmpty()) {
            div.getTxtSakuseiYMD7().setReadOnly(true);
            div.getTxtSakuseiTime7().setReadOnly(true);
        } else {
            div.getTxtSakuseiYMD7().setReadOnly(false);
            div.getTxtSakuseiTime7().setReadOnly(false);
        }
    }

    private void setすべて選択チェックボックス() {
        List<RString> allKey = new ArrayList<>();
        div.getCblOutputTaisho1().setSelectedItemsByKey(allKey);
        div.getCblOutputTaisho2().setSelectedItemsByKey(allKey);
        div.getCblOutputTaisho3().setSelectedItemsByKey(allKey);
        div.getCblOutputTaisho4().setSelectedItemsByKey(allKey);
        div.getCblOutputTaisho5().setSelectedItemsByKey(allKey);
        div.getCblOutputTaisho6().setSelectedItemsByKey(allKey);
        div.getCblOutputTaisho7().setSelectedItemsByKey(allKey);
        div.getCblOutputTaishoAll().setSelectedItemsByKey(allKey);
    }

    /**
     * 日付時刻、空白を設定する
     */
    public void set日付時刻の空白設定() {
        div.getTxtSakuseiYMD1().clearValue();
        div.getTxtSakuseiYMD2().clearValue();
        div.getTxtSakuseiYMD3().clearValue();
        div.getTxtSakuseiYMD4().clearValue();
        div.getTxtSakuseiYMD5().clearValue();
        div.getTxtSakuseiYMD6().clearValue();
        div.getTxtSakuseiYMD7().clearValue();
        div.getTxtSakuseiTime1().clearValue();
        div.getTxtSakuseiTime2().clearValue();
        div.getTxtSakuseiTime3().clearValue();
        div.getTxtSakuseiTime4().clearValue();
        div.getTxtSakuseiTime5().clearValue();
        div.getTxtSakuseiTime6().clearValue();
        div.getTxtSakuseiTime7().clearValue();
    }

    /**
     * 市町村コードを取得します。
     *
     * @return 市町村コード
     */
    public LasdecCode get市町村コード() {
        return ShichosonSecurityJoho.getShichosonSecurityJoho(GyomuBunrui.介護事務).get市町村情報().get市町村コード();
    }

    /**
     * 構成市町村コードListを取得します。
     *
     * @return 構成市町村コードList
     */
    public List<LasdecCode> get構成市町村コードList() {
        List<LasdecCode> 構成市町村コードList = new ArrayList<>();
        KoseiShichosonJoho 市町村情報 = ShichosonSecurityJoho.getShichosonSecurityJoho(GyomuBunrui.介護事務).get市町村情報();
        RString 市町村識別ID = 市町村情報.get市町村識別ID();
        if (new RString("00").equals(市町村識別ID)) {
            List<KoikiZenShichosonJoho> 現市町村情報List = KoikiShichosonJohoFinder.createInstance().getGenShichosonJoho().records();
            for (KoikiZenShichosonJoho 現市町村情報 : 現市町村情報List) {
                構成市町村コードList.add(現市町村情報.get市町村コード());
            }
        } else {
            構成市町村コードList.add(市町村情報.get市町村コード());
        }
        return 構成市町村コードList;
    }

    /**
     * 旧市町村コードListを取得します。
     *
     * @return 旧市町村コードList
     */
    public List<LasdecCode> get旧市町村コードList() {
        List<LasdecCode> 旧市町村コードList = new ArrayList<>();
        List<GappeiCityJyoho> 合併市町村情List = GappeiCityJohoBFinder.createInstance().
                getSennyoukouikigappeijohokensaku(HyojiUmu.表示する.getコード(),
                        ShichosonSecurityJoho.getShichosonSecurityJoho(GyomuBunrui.介護事務).get導入形態コード().value()).records();
        for (GappeiCityJyoho 合併市町村情 : 合併市町村情List) {
            旧市町村コードList.add(合併市町村情.get旧市町村コード());
        }
        return 旧市町村コードList;
    }

    private boolean is合併あり() {
        return 合併あり.equals(GappeiCityJohoBFinder.createInstance().getGappeijohokubun());
    }

    private boolean is単一() {
        return DonyuKeitaiCode.事務単一.getCode()
                .equals(ShichosonSecurityJoho.getShichosonSecurityJoho(GyomuBunrui.介護事務).get導入形態コード().value());
    }

    private boolean is広域() {
        return DonyuKeitaiCode.事務広域.getCode()
                .equals(ShichosonSecurityJoho.getShichosonSecurityJoho(GyomuBunrui.介護事務).get導入形態コード().value());
    }

    /**
     * 入力された報告年月より、各集計年月を設定する。
     *
     * @param 報告年月 RDate
     */
    public void set入力された報告年月より各集計年月の設定(RDate 報告年月) {
        FlexibleDate 入力決定年月 = new FlexibleDate("平成21年7月");
        FlexibleDate 入力決定年月6 = new FlexibleDate("平成18年6月");
        FlexibleDate 入力決定年月7 = new FlexibleDate("平成24年6月");
        RDate 日付 = new RDate("平成12年5月");
        RDate 報告年月の前月 = 報告年月.minusMonth(1);
        RDate 報告年月の前々月 = 報告年月.minusMonth(2);
        RDate 報告年月の前々々月 = 報告年月.minusMonth(月);
        if (日付.isBefore(報告年月の前月)) {
            div.getTxtShukeiYM1().setValue(new FlexibleDate(報告年月の前月.toDateString()));
        } else {
            div.getTxtShukeiYM1().clearValue();
        }
        if (日付.isBefore(報告年月の前々月)) {
            div.getTxtShukeiYM2().setValue(new FlexibleDate(報告年月の前々月.toDateString()));
        } else {
            div.getTxtShukeiYM2().clearValue();
        }
        if (日付.isBefore(報告年月の前々月)) {
            div.getTxtShukeiYM3().setValue(new FlexibleDate(報告年月の前々月.toDateString()));
        } else {
            div.getTxtShukeiYM3().clearValue();
        }
        RString 償還分集計年月設定 = DbBusinessConfig.get(ConfigNameDBU.事業状況報告_一般状況集計方法, 基準日, SubGyomuCode.DBU介護統計報告);
        if (償還分集計年月設定.equals(審査年月)) {
            if (日付.isBefore(報告年月の前々々月)) {
                div.getTxtShukeiYM4().setValue(new FlexibleDate(報告年月の前々々月.toDateString()));
            } else {
                div.getTxtShukeiYM4().clearValue();
            }
            if (日付.isBefore(報告年月の前々月)) {
                div.setTxtShukeiYM4Bak(報告年月の前々月.toDateString());
            } else {
                div.setTxtShukeiYM4Bak(RString.EMPTY);
            }
        } else if (償還分集計年月設定.equals(決定年月)) {
            if (日付.isBefore(報告年月の前々月)) {
                div.getTxtShukeiYM4().setValue(new FlexibleDate(報告年月の前々月.toDateString()));
            } else {
                div.getTxtShukeiYM4().clearValue();
            }
            if (日付.isBefore(報告年月の前々々月)) {
                div.setTxtShukeiYM4Bak(報告年月の前々々月.toDateString());
            } else {
                div.setTxtShukeiYM4Bak(RString.EMPTY);
            }
        }
        RString 保険給付集計年月設定 = DbBusinessConfig.get(ConfigNameDBU.事業状況報告_保険給付集計方法, 基準日, SubGyomuCode.DBU介護統計報告);
        if (保険給付集計年月設定.equals(審査年月)) {
            if (日付.isBefore(報告年月の前々々月)) {
                div.getTxtShukeiYM5().setValue(new FlexibleDate(報告年月の前々々月.toDateString()));
            } else {
                div.getTxtShukeiYM5().clearValue();
            }
            if (日付.isBefore(報告年月の前々月)) {
                div.setTxtShukeiYM5Bak(報告年月の前々月.toDateString());
            } else {
                div.setTxtShukeiYM5Bak(RString.EMPTY);
            }
        } else if (保険給付集計年月設定.equals(決定年月)) {
            if (日付.isBefore(報告年月の前々月)) {
                div.getTxtShukeiYM5().setValue(new FlexibleDate(報告年月の前々月.toDateString()));
            } else {
                div.getTxtShukeiYM5().clearValue();
            }
            if (日付.isBefore(報告年月の前々々月)) {
                div.setTxtShukeiYM5Bak(報告年月の前々々月.toDateString());
            } else {
                div.setTxtShukeiYM5Bak(RString.EMPTY);
            }
        }
        if (日付.isBefore(報告年月の前々月)) {
            div.getTxtShukeiYM6().setValue(new FlexibleDate(報告年月の前々月.toDateString()));
        } else {
            div.getTxtShukeiYM6().clearValue();
        }
        if (日付.isBefore(報告年月の前々月)) {
            div.getTxtShukeiYM7().setValue(new FlexibleDate(報告年月の前々月.toDateString()));
        } else {
            div.getTxtShukeiYM7().clearValue();
        }
        set入力年月(入力決定年月, 入力決定年月6, 入力決定年月7);
    }

    private void set入力年月(FlexibleDate 入力決定年月, FlexibleDate 入力決定年月6, FlexibleDate 入力決定年月7) {
        if (div.getTxtShukeiYM3().getValue().isBefore(入力決定年月)) {
            div.getTxtSakuseiYMD3().setDisabled(true);
            div.getTxtSakuseiTime3().setDisabled(true);
        } else {
            div.getTxtSakuseiYMD3().setDisabled(false);
            div.getTxtSakuseiTime3().setDisabled(false);
        }
        if (div.getTxtShukeiYM5().getValue().isBefore(入力決定年月)) {
            div.getTxtSakuseiYMD5().setDisabled(true);
            div.getTxtSakuseiTime5().setDisabled(true);
        } else {
            div.getTxtSakuseiYMD5().setDisabled(false);
            div.getTxtSakuseiTime5().setDisabled(false);
        }
        if (div.getTxtShukeiYM6().getValue().isBefore(入力決定年月6)) {
            div.getTxtSakuseiYMD6().setDisabled(true);
            div.getTxtSakuseiTime6().setDisabled(true);
        } else {
            div.getTxtSakuseiYMD6().setDisabled(false);
            div.getTxtSakuseiTime6().setDisabled(false);
        }
        if (div.getTxtShukeiYM7().getValue().isBefore(入力決定年月7)) {
            div.getTxtSakuseiYMD7().setDisabled(true);
            div.getTxtSakuseiTime7().setDisabled(true);
        } else {
            div.getTxtSakuseiYMD7().setDisabled(false);
            div.getTxtSakuseiTime7().setDisabled(false);
        }
    }

    /**
     * チェックボックスの操作設定
     */
    public void setチェックボックス設定() {
        List<RString> 一般状況1_11_List = new ArrayList<>();
        List<RString> 一般状況12_14_現物分_List = new ArrayList<>();
        List<RString> 保険給付決定状況_現物分_List = new ArrayList<>();
        List<RString> 一般状況12_14_償還分_List = new ArrayList<>();
        List<RString> 保険給付決定状況_償還分_List = new ArrayList<>();
        List<RString> 保険給付決定状況_高額分_List = new ArrayList<>();
        List<RString> 保険給付決定状況_高額合算分_List = new ArrayList<>();
        if (div.getTxtShukeiYM1().getValue() != null) {
            一般状況1_11_List.add(一般状況1_11);
            div.getCblOutputTaisho1().setSelectedItemsByKey(一般状況1_11_List);
        } else {
            div.getCblOutputTaisho1().setSelectedItemsByKey(一般状況1_11_List);
        }
        if (div.getTxtShukeiYM2().getValue() != null) {
            一般状況12_14_現物分_List.add(一般状況12_14_現物分);
            div.getCblOutputTaisho2().setSelectedItemsByKey(一般状況12_14_現物分_List);
        } else {
            div.getCblOutputTaisho2().setSelectedItemsByKey(一般状況12_14_現物分_List);
        }
        if (div.getTxtShukeiYM3().getValue() != null) {
            保険給付決定状況_現物分_List.add(保険給付決定状況_現物分);
            div.getCblOutputTaisho3().setSelectedItemsByKey(保険給付決定状況_現物分_List);
        } else {
            div.getCblOutputTaisho3().setSelectedItemsByKey(保険給付決定状況_現物分_List);
        }
        if (div.getTxtShukeiYM4().getValue() != null) {
            一般状況12_14_償還分_List.add(一般状況12_14_償還分);
            div.getCblOutputTaisho4().setSelectedItemsByKey(一般状況12_14_償還分_List);
        } else {
            div.getCblOutputTaisho4().setSelectedItemsByKey(一般状況12_14_償還分_List);
        }
        if (div.getTxtShukeiYM5().getValue() != null) {
            保険給付決定状況_償還分_List.add(保険給付決定状況_償還分);
            div.getCblOutputTaisho5().setSelectedItemsByKey(保険給付決定状況_償還分_List);
        } else {
            div.getCblOutputTaisho5().setSelectedItemsByKey(保険給付決定状況_償還分_List);
        }
        if (div.getTxtShukeiYM6().getValue() != null) {
            保険給付決定状況_高額分_List.add(保険給付決定状況_高額分);
            div.getCblOutputTaisho6().setSelectedItemsByKey(保険給付決定状況_高額分_List);
        } else {
            div.getCblOutputTaisho6().setSelectedItemsByKey(保険給付決定状況_高額分_List);
        }
        if (div.getTxtShukeiYM7().getValue() != null) {
            保険給付決定状況_高額合算分_List.add(保険給付決定状況_高額合算分);
            div.getCblOutputTaisho7().setSelectedItemsByKey(保険給付決定状況_高額合算分_List);
        } else {
            div.getCblOutputTaisho7().setSelectedItemsByKey(保険給付決定状況_高額合算分_List);
        }
    }

    /**
     * 「月報報告 一般状況１～１１」の処理日付管理情報を取得する。
     */
    public void set月報報告_一般状況1_11onClick() {
        RDate 過去報告年月_Date = new RDate(div.getTblJikkoTani().getDdlKakoHokokuYM().getSelectedValue().toString());
        RString 処理枝番 = new RString("00").concat(過去報告年月_Date.minusMonth(1).getYearMonth().toDateString().substring(月別));
        ShoriDateKanri 月報報告_一般状況1_11 = shoriDateKanriManager.get処理日付管理マスタ(SubGyomuCode.DBU介護統計報告,
                new RString("月報報告  一般状況１～１１"), 処理枝番, new FlexibleYear(過去報告年月_Date.seireki().getYear()),
                年度内連番);
        if (月報報告_一般状況1_11 != null) {
            FlexibleDate 集計年月1テキストボックス = new FlexibleDate(月報報告_一般状況1_11.get年度().toDateString()
                    .concat(月報報告_一般状況1_11.get処理枝番().substring(2)));
            if (div.getTxtShukeiYM1().getValue() != null && !div.getTxtShukeiYM1().getValue().isEmpty()) {
                div.getTxtShukeiYM1().setReadOnly(false);
                div.getTxtShukeiYM1().setValue(集計年月1テキストボックス);
            } else {
                div.getTxtShukeiYM1().setReadOnly(true);
            }
            if (月報報告_一般状況1_11.get基準日時() != null) {
                RDate 処理日付 = new RDate(月報報告_一般状況1_11.get基準日時().toString());
                div.getTxtSakuseiYMD1().setValue(処理日付);
                RTime 処理日時 = new RTime(月報報告_一般状況1_11.get基準日時().toDateString());
                div.getTxtSakuseiTime1().setValue(処理日時);
            }
        }
    }

    /**
     * 「月報報告 一般状況１２～１４ 現物分」の処理日付管理情報を取得する。
     */
    public void set月報報告_一般状況12_14_現物分onClick() {
        RDate 過去報告年月_Date = new RDate(div.getTblJikkoTani().getDdlKakoHokokuYM().getSelectedValue().toString());
        RString 処理枝番 = new RString("00").concat(過去報告年月_Date.minusMonth(2).getYearMonth().toDateString().substring(月別));
        ShoriDateKanri 月報報告_一般状況12_14_現物分 = shoriDateKanriManager.get処理日付管理マスタ(SubGyomuCode.DBU介護統計報告,
                new RString("月報報告 一般状況１２～１４ 現物分"), 処理枝番, new FlexibleYear(過去報告年月_Date.seireki().getYear()),
                年度内連番);
        if (月報報告_一般状況12_14_現物分 != null) {
            FlexibleDate 集計年月2テキストボックス = new FlexibleDate(月報報告_一般状況12_14_現物分.get年度().toDateString()
                    .concat(月報報告_一般状況12_14_現物分.get処理枝番().substring(2)));
            if (div.getTxtShukeiYM2().getValue() != null && !div.getTxtShukeiYM2().getValue().isEmpty()) {
                div.getTxtShukeiYM2().setReadOnly(false);
                div.getTxtShukeiYM2().setValue(集計年月2テキストボックス);
            } else {
                div.getTxtShukeiYM2().setReadOnly(true);
            }
            RDate 処理日付 = new RDate(月報報告_一般状況12_14_現物分.get基準日時().toString());
            div.getTxtSakuseiYMD2().setValue(処理日付);
            RTime 処理日時 = new RTime(月報報告_一般状況12_14_現物分.get基準日時().toDateString());
            div.getTxtSakuseiTime2().setValue(処理日時);
        }
    }

    /**
     * 「月報報告 保険給付決定 現物分」の処理日付管理情報を取得する。
     */
    public void set月報報告_保険給付決定_現物分_onClick() {
        RDate 過去報告年月_Date = new RDate(div.getTblJikkoTani().getDdlKakoHokokuYM().getSelectedValue().toString());
        RString 処理枝番 = new RString("00").concat(過去報告年月_Date.minusMonth(2).getYearMonth().toDateString().substring(月別));
        ShoriDateKanri 月報報告_保険給付決定_現物分 = shoriDateKanriManager.get処理日付管理マスタ(SubGyomuCode.DBU介護統計報告,
                new RString("月報報告  保険給付決定  現物分"), 処理枝番, new FlexibleYear(過去報告年月_Date.seireki().getYear()),
                年度内連番);
        if (月報報告_保険給付決定_現物分 != null) {
            FlexibleDate 集計年月3テキストボックス = new FlexibleDate(月報報告_保険給付決定_現物分.get年度().toDateString()
                    .concat(月報報告_保険給付決定_現物分.get処理枝番().substring(2)));
            if (div.getTxtShukeiYM3().getValue() != null && !div.getTxtShukeiYM3().getValue().isEmpty()) {
                div.getTxtShukeiYM3().setReadOnly(false);
                div.getTxtShukeiYM3().setValue(集計年月3テキストボックス);
            } else {
                div.getTxtShukeiYM3().setReadOnly(true);
            }
            RDate 処理日付 = new RDate(月報報告_保険給付決定_現物分.get基準日時().toString());
            div.getTxtSakuseiYMD3().setValue(処理日付);
            RTime 処理日時 = new RTime(月報報告_保険給付決定_現物分.get基準日時().toDateString());
            div.getTxtSakuseiTime3().setValue(処理日時);
        }
    }

    /**
     * 月報報告 一般状況1２～１４ 償還分審査 の処理日付管理情報を取得する。
     */
    public void set月報報告_一般状況12_14_償還分() {
        RDate 過去報告年月_Date = new RDate(div.getTblJikkoTani().getDdlKakoHokokuYM().getSelectedValue().toString());
        RString 処理枝番1 = new RString("00").concat(過去報告年月_Date.minusMonth(2).getYearMonth().toDateString().substring(月別));
        FlexibleYear 過去報告年月_Year = new FlexibleYear(過去報告年月_Date.seireki().getYear());
        ShoriDateKanri 月報報告_一般状況12_14_償還分審査 = shoriDateKanriManager.get処理日付管理マスタ(SubGyomuCode.DBU介護統計報告,
                new RString("月報報告  一般状況1２～１４  償還分審査"), 処理枝番1, 過去報告年月_Year, 年度内連番);
        RString 処理枝番2 = new RString("00").concat(過去報告年月_Date.minusMonth(1).getYearMonth().toDateString().substring(月別));
        ShoriDateKanri 月報報告_一般状況12_14_償還分決定 = shoriDateKanriManager.get処理日付管理マスタ(SubGyomuCode.DBU介護統計報告,
                new RString("月報報告  一般状況1２～１４  償還分決定"), 処理枝番2, 過去報告年月_Year, 年度内連番);
        if (月報報告_一般状況12_14_償還分審査 != null && 月報報告_一般状況12_14_償還分決定 != null) {
            set一般状況両方日付年月(月報報告_一般状況12_14_償還分審査, 月報報告_一般状況12_14_償還分決定);
        }
        if (月報報告_一般状況12_14_償還分審査 != null && 月報報告_一般状況12_14_償還分決定 == null) {
            set償還分審査(月報報告_一般状況12_14_償還分審査);
        }
        if (月報報告_一般状況12_14_償還分審査 == null && 月報報告_一般状況12_14_償還分決定 != null) {
            set償還分決定(月報報告_一般状況12_14_償還分決定);
        }
    }

    private void set一般状況両方日付年月(ShoriDateKanri 月報報告_一般状況12_14_償還分審査, ShoriDateKanri 月報報告_一般状況12_14_償還分決定) {
        RString 両方日付管理情報 = DbBusinessConfig.get(ConfigNameDBU.事業状況報告_一般状況集計方法, 基準日, SubGyomuCode.DBU介護統計報告);
        if (両方日付管理情報.equals(審査年月)) {
            FlexibleDate 集計年月4審査 = new FlexibleDate(月報報告_一般状況12_14_償還分審査.get年度().toDateString()
                    .concat(月報報告_一般状況12_14_償還分審査.get処理枝番().substring(2)));
            if (!div.getTxtShukeiYM4().getValue().isEmpty()) {
                div.getTxtShukeiYM4().setReadOnly(false);
                div.getTxtShukeiYM4().setValue(集計年月4審査);
            } else {
                div.getTxtShukeiYM4().setReadOnly(true);
            }
            RDate 処理日付審査 = new RDate(月報報告_一般状況12_14_償還分審査.get基準日時().toString());
            div.getTxtSakuseiYMD4().setValue(処理日付審査);

            RTime 処理日時審査 = new RTime(月報報告_一般状況12_14_償還分審査.get基準日時().toDateString());
            div.getTxtSakuseiTime4().setValue(処理日時審査);
            FlexibleDate 集計年月4決定 = new FlexibleDate(月報報告_一般状況12_14_償還分決定.get年度().toDateString()
                    .concat(月報報告_一般状況12_14_償還分決定.get処理枝番().substring(2)));
            div.setTxtShukeiYM4Bak(new RString(集計年月4決定.toString()));
            RDate 処理日付決定 = new RDate(月報報告_一般状況12_14_償還分決定.get基準日時().toString());
            div.getTxtSakuseiYMD4().setValue(処理日付決定);
            RTime 処理日時決定 = new RTime(月報報告_一般状況12_14_償還分決定.get基準日時().toDateString());
            div.getTxtSakuseiTime4().setValue(処理日時決定);
            div.getRadlblShukeiType4().setSelectedKey(審査年月で集計);
        } else if (両方日付管理情報.equals(決定年月)) {
            FlexibleDate 集計年月4決定 = new FlexibleDate(月報報告_一般状況12_14_償還分決定.get年度().toDateString()
                    .concat(月報報告_一般状況12_14_償還分決定.get処理枝番().substring(2)));
            if (!div.getTxtShukeiYM4().getValue().isEmpty()) {
                div.getTxtShukeiYM4().setReadOnly(false);
                div.getTxtShukeiYM4().setValue(集計年月4決定);
            } else {
                div.getTxtShukeiYM4().setReadOnly(true);
            }
            RDate 処理日付決定 = new RDate(月報報告_一般状況12_14_償還分決定.get基準日時().toString());
            div.getTxtSakuseiYMD4().setValue(処理日付決定);
            RTime 処理日時決定 = new RTime(月報報告_一般状況12_14_償還分決定.get基準日時().toDateString());
            div.getTxtSakuseiTime4().setValue(処理日時決定);
            FlexibleDate 集計年月4審査 = new FlexibleDate(月報報告_一般状況12_14_償還分審査.get年度().toDateString()
                    .concat(月報報告_一般状況12_14_償還分審査.get処理枝番().substring(2)));
            div.setTxtShukeiYM4Bak(new RString(集計年月4審査.toString()));
            RDate 処理日付審査 = new RDate(月報報告_一般状況12_14_償還分審査.get基準日時().toString());
            div.getTxtSakuseiYMD4().setValue(処理日付審査);
            RTime 処理日時審査 = new RTime(月報報告_一般状況12_14_償還分審査.get基準日時().toDateString());
            div.getTxtSakuseiTime4().setValue(処理日時審査);
            div.getRadlblShukeiType4().setSelectedKey(決定年月で集計);
        }
    }

    private void set償還分審査(ShoriDateKanri 月報報告_一般状況12_14_償還分審査) {
        FlexibleDate 集計年月4審査 = new FlexibleDate(月報報告_一般状況12_14_償還分審査.get年度().toDateString()
                .concat(月報報告_一般状況12_14_償還分審査.get処理枝番().substring(2)));
        if (!div.getTxtShukeiYM4().getValue().isEmpty()) {
            div.getTxtShukeiYM4().setReadOnly(false);
            div.getTxtShukeiYM4().setValue(集計年月4審査);
        } else {
            div.getTxtShukeiYM4().setReadOnly(true);
        }
        RDate 処理日付審査 = new RDate(月報報告_一般状況12_14_償還分審査.get基準日時().toString());
        div.getTxtSakuseiYMD4().setValue(処理日付審査);
        RTime 処理日時審査 = new RTime(月報報告_一般状況12_14_償還分審査.get基準日時().toDateString());
        div.getTxtSakuseiTime4().setValue(処理日時審査);
        div.setTxtShukeiYM4Bak(RString.EMPTY);
        div.getRadlblShukeiType4().setSelectedKey(審査年月で集計);
    }

    private void set償還分決定(ShoriDateKanri 月報報告_一般状況12_14_償還分決定) {
        FlexibleDate 集計年月4決定 = new FlexibleDate(月報報告_一般状況12_14_償還分決定.get年度().toDateString()
                .concat(月報報告_一般状況12_14_償還分決定.get処理枝番().substring(2)));
        if (!div.getTxtShukeiYM4().getValue().isEmpty()) {
            div.getTxtShukeiYM4().setReadOnly(false);
            div.getTxtShukeiYM4().setValue(集計年月4決定);
        } else {
            div.getTxtShukeiYM4().setReadOnly(true);
        }
        RDate 処理日付決定 = new RDate(月報報告_一般状況12_14_償還分決定.get基準日時().toString());
        div.getTxtSakuseiYMD4().setValue(処理日付決定);
        RTime 処理日時決定 = new RTime(月報報告_一般状況12_14_償還分決定.get基準日時().toDateString());
        div.getTxtSakuseiTime4().setValue(処理日時決定);
        div.setTxtShukeiYM4Bak(RString.EMPTY);
        div.getRadlblShukeiType4().setSelectedKey(決定年月で集計);
    }

    /**
     * 月報報告 保険給付決定 償還分 の処理日付管理情報を取得する。
     */
    public void set月報報告_保険給付決定_償還分() {
        RDate 過去報告年月_Date = new RDate(div.getTblJikkoTani().getDdlKakoHokokuYM().getSelectedValue().toString());
        RString 処理枝番1 = new RString("00").concat(過去報告年月_Date.minusMonth(月).getYearMonth().toDateString().substring(月別));
        FlexibleYear 過去報告年月_Year = new FlexibleYear(過去報告年月_Date.seireki().getYear());
        ShoriDateKanri 月報報告_保険給付決定_償還分審査 = shoriDateKanriManager.get処理日付管理マスタ(SubGyomuCode.DBU介護統計報告,
                new RString("月報報告  保険給付決定  償還分審査"), 処理枝番1, 過去報告年月_Year, 年度内連番);
        RString 処理枝番2 = new RString("00").concat(過去報告年月_Date.minusMonth(2).getYearMonth().toDateString().substring(月別));
        ShoriDateKanri 月報報告_保険給付決定_償還分決定 = shoriDateKanriManager.get処理日付管理マスタ(SubGyomuCode.DBU介護統計報告,
                new RString("月報報告  保険給付決定  償還分決定"), 処理枝番2, 過去報告年月_Year, 年度内連番);
        if (月報報告_保険給付決定_償還分審査 != null && 月報報告_保険給付決定_償還分決定 != null) {
            set保険給付両方日付管理(月報報告_保険給付決定_償還分審査, 月報報告_保険給付決定_償還分決定);
        }
        if (月報報告_保険給付決定_償還分審査 != null && 月報報告_保険給付決定_償還分決定 == null) {
            set保険給付償還分審査(月報報告_保険給付決定_償還分審査);
        }
        if (月報報告_保険給付決定_償還分審査 == null && 月報報告_保険給付決定_償還分決定 != null) {
            set保険給付償還分決定(月報報告_保険給付決定_償還分決定);
        }
    }

    private void set保険給付両方日付管理(ShoriDateKanri 月報報告_保険給付決定_償還分審査, ShoriDateKanri 月報報告_保険給付決定_償還分決定) {
        RString 両方日付管理情報 = DbBusinessConfig.get(ConfigNameDBU.事業状況報告_保険給付集計方法, 基準日, SubGyomuCode.DBU介護統計報告);
        if (両方日付管理情報.equals(審査年月)) {
            FlexibleDate 集計年月5審査 = new FlexibleDate(月報報告_保険給付決定_償還分審査.get年度().toDateString()
                    .concat(月報報告_保険給付決定_償還分審査.get処理枝番().substring(2)));
            if (!div.getTxtShukeiYM5().getValue().isEmpty()) {
                div.getTxtShukeiYM5().setReadOnly(false);
                div.getTxtShukeiYM5().setValue(集計年月5審査);
            } else {
                div.getTxtShukeiYM5().setReadOnly(true);
            }
            RDate 処理日付審査 = new RDate(月報報告_保険給付決定_償還分審査.get基準日時().toString());
            div.getTxtSakuseiYMD5().setValue(処理日付審査);
            RTime 処理日時審査 = new RTime(月報報告_保険給付決定_償還分審査.get基準日時().toDateString());
            div.getTxtSakuseiTime5().setValue(処理日時審査);
            FlexibleDate 集計年月5決定 = new FlexibleDate(月報報告_保険給付決定_償還分決定.get年度().toDateString()
                    .concat(月報報告_保険給付決定_償還分決定.get処理枝番().substring(2)));
            div.setTxtShukeiYM5Bak(new RString(集計年月5決定.toString()));
            RDate 処理日付決定 = new RDate(月報報告_保険給付決定_償還分決定.get基準日時().toString());
            div.getTxtSakuseiYMD5().setValue(処理日付決定);
            RTime 処理日時決定 = new RTime(月報報告_保険給付決定_償還分決定.get基準日時().toDateString());
            div.getTxtSakuseiTime5().setValue(処理日時決定);
            div.getRadlblShukeiType5().setSelectedKey(給付審査年月で集計);
        } else if (両方日付管理情報.equals(決定年月)) {
            FlexibleDate 集計年月5決定 = new FlexibleDate(月報報告_保険給付決定_償還分決定.get年度().toDateString()
                    .concat(月報報告_保険給付決定_償還分決定.get処理枝番().substring(2)));
            if (!div.getTxtShukeiYM5().getValue().isEmpty()) {
                div.getTxtShukeiYM5().setReadOnly(false);
                div.getTxtShukeiYM5().setValue(集計年月5決定);
            } else {
                div.getTxtShukeiYM5().setReadOnly(true);
            }
            RDate 処理日付決定 = new RDate(月報報告_保険給付決定_償還分決定.get基準日時().toString());
            div.getTxtSakuseiYMD5().setValue(処理日付決定);
            RTime 処理日時決定 = new RTime(月報報告_保険給付決定_償還分決定.get基準日時().toDateString());
            div.getTxtSakuseiTime5().setValue(処理日時決定);
            FlexibleDate 集計年月5審査 = new FlexibleDate(月報報告_保険給付決定_償還分審査.get年度().toDateString()
                    .concat(月報報告_保険給付決定_償還分審査.get処理枝番().substring(2)));
            div.setTxtShukeiYM5Bak(new RString(集計年月5審査.toString()));
            RDate 処理日付審査 = new RDate(月報報告_保険給付決定_償還分審査.get基準日時().toString());
            div.getTxtSakuseiYMD5().setValue(処理日付審査);
            RTime 処理日時審査 = new RTime(月報報告_保険給付決定_償還分審査.get基準日時().toDateString());
            div.getTxtSakuseiTime5().setValue(処理日時審査);
            div.getRadlblShukeiType5().setSelectedKey(給付決定年月で集計);
        }
    }

    private void set保険給付償還分審査(ShoriDateKanri 月報報告_保険給付決定_償還分審査) {
        FlexibleDate 集計年月5審査 = new FlexibleDate(月報報告_保険給付決定_償還分審査.get年度().toDateString()
                .concat(月報報告_保険給付決定_償還分審査.get処理枝番().substring(2)));
        if (!div.getTxtShukeiYM5().getValue().isEmpty()) {
            div.getTxtShukeiYM5().setReadOnly(false);
            div.getTxtShukeiYM5().setValue(集計年月5審査);
        } else {
            div.getTxtShukeiYM5().setReadOnly(true);
        }
        RDate 処理日付審査 = new RDate(月報報告_保険給付決定_償還分審査.get基準日時().toString());
        div.getTxtSakuseiYMD5().setValue(処理日付審査);
        RTime 処理日時審査 = new RTime(月報報告_保険給付決定_償還分審査.get基準日時().toDateString());
        div.getTxtSakuseiTime5().setValue(処理日時審査);
        div.setTxtShukeiYM5Bak(RString.EMPTY);
        div.getRadlblShukeiType5().setSelectedKey(給付審査年月で集計);
    }

    private void set保険給付償還分決定(ShoriDateKanri 月報報告_保険給付決定_償還分決定) {
        FlexibleDate 集計年月5決定 = new FlexibleDate(月報報告_保険給付決定_償還分決定.get年度().toDateString()
                .concat(月報報告_保険給付決定_償還分決定.get処理枝番().substring(2)));
        if (!div.getTxtShukeiYM5().getValue().isEmpty()) {
            div.getTxtShukeiYM5().setReadOnly(false);
            div.getTxtShukeiYM5().setValue(集計年月5決定);
        } else {
            div.getTxtShukeiYM5().setReadOnly(true);
        }
        RDate 処理日付決定 = new RDate(月報報告_保険給付決定_償還分決定.get基準日時().toString());
        div.getTxtSakuseiYMD5().setValue(処理日付決定);
        RTime 処理日時決定 = new RTime(月報報告_保険給付決定_償還分決定.get基準日時().toDateString());
        div.getTxtSakuseiTime5().setValue(処理日時決定);
        div.setTxtShukeiYM5Bak(RString.EMPTY);
        div.getRadlblShukeiType5().setSelectedKey(給付決定年月で集計);
        if (div.getTxtShukeiYM5().getValue().isBefore(new FlexibleDate("平成21年7月"))) {
            div.getTxtShukeiYM5().setDisabled(true);
        } else {
            div.getTxtShukeiYM5().setDisabled(false);
        }
    }

    /**
     * 「月報報告 保険給付決定 高額分」の処理日付管理情報を取得する。
     */
    public void set月報報告_保険給付決定_高額分() {
        RDate 過去報告年月_Date = new RDate(div.getTblJikkoTani().getDdlKakoHokokuYM().getSelectedValue().toString());
        RString 処理枝番 = new RString("00").concat(過去報告年月_Date.minusMonth(2).getYearMonth().toDateString().substring(月別));
        ShoriDateKanri 月報報告_保険給付決定_高額分 = shoriDateKanriManager.get処理日付管理マスタ(SubGyomuCode.DBU介護統計報告,
                new RString("月報報告  保険給付決定  高額分"), 処理枝番, new FlexibleYear(過去報告年月_Date.seireki().getYear()),
                年度内連番);
        if (月報報告_保険給付決定_高額分 != null) {
            FlexibleDate 集計年月6テキストボックス = new FlexibleDate(月報報告_保険給付決定_高額分.get年度().toDateString()
                    .concat(月報報告_保険給付決定_高額分.get処理枝番().substring(2)));
            if (div.getTxtShukeiYM6().getValue() != null && !div.getTxtShukeiYM6().getValue().isEmpty()) {
                div.getTxtShukeiYM6().setReadOnly(false);
                div.getTxtShukeiYM6().setValue(集計年月6テキストボックス);
            } else {
                div.getTxtShukeiYM6().setReadOnly(true);
            }
            if (div.getTxtShukeiYM6().getValue().isBefore(new FlexibleDate("平成18年6月"))) {
                div.getTxtShukeiYM6().setDisabled(true);
            } else {
                div.getTxtShukeiYM6().setDisabled(false);
            }
            RDate 処理日付 = new RDate(月報報告_保険給付決定_高額分.get基準日時().toString());
            div.getTxtSakuseiYMD6().setValue(処理日付);
            RTime 処理日時 = new RTime(月報報告_保険給付決定_高額分.get基準日時().toDateString());
            div.getTxtSakuseiTime6().setValue(処理日時);
        }
    }

    /**
     * 「月報報告 保険給付決定 高額合算分」の処理日付管理情報を取得する。
     */
    public void set月報報告_保険給付決定_高額分算分() {
        RDate 過去報告年月_Date = new RDate(div.getTblJikkoTani().getDdlKakoHokokuYM().getSelectedValue().toString());
        RString 処理枝番 = new RString("00").concat(過去報告年月_Date.minusMonth(2).getYearMonth().toDateString().substring(月別));
        ShoriDateKanri 月報報告_保険給付決定_高額合算分 = shoriDateKanriManager.get処理日付管理マスタ(SubGyomuCode.DBU介護統計報告,
                new RString("月報報告  保険給付決定  高額合算分"), 処理枝番, new FlexibleYear(過去報告年月_Date.seireki().getYear()),
                年度内連番);
        if (月報報告_保険給付決定_高額合算分 != null) {
            FlexibleDate 集計年月7テキストボックス = new FlexibleDate(月報報告_保険給付決定_高額合算分.get年度().toDateString()
                    .concat(月報報告_保険給付決定_高額合算分.get処理枝番().substring(2)));
            if (div.getTxtShukeiYM7().getValue() != null && !div.getTxtShukeiYM7().getValue().isEmpty()) {
                div.getTxtShukeiYM7().setReadOnly(false);
                div.getTxtShukeiYM7().setValue(集計年月7テキストボックス);
            } else {
                div.getTxtShukeiYM7().setReadOnly(true);
            }
            if (div.getTxtShukeiYM7().getValue().isBefore(new FlexibleDate("平成24年6月"))) {
                div.getTxtShukeiYM7().setDisabled(true);
            } else {
                div.getTxtShukeiYM7().setDisabled(false);
            }
            RDate 処理日付 = new RDate(月報報告_保険給付決定_高額合算分.get基準日時().toString());
            div.getTxtSakuseiYMD7().setValue(処理日付);
            RTime 処理日時 = new RTime(月報報告_保険給付決定_高額合算分.get基準日時().toDateString());
            div.getTxtSakuseiTime7().setValue(処理日時);
        }

    }

    /**
     * すべて選択チェックボックス の処理です。
     */
    public void setすべて選択() {
        List<RString> 一般状況1_11_List = new ArrayList<>();
        List<RString> 一般状況12_14_現物分_List = new ArrayList<>();
        List<RString> 保険給付決定状況_現物分_List = new ArrayList<>();
        List<RString> 一般状況12_14_償還分_List = new ArrayList<>();
        List<RString> 保険給付決定状況_償還分_List = new ArrayList<>();
        List<RString> 保険給付決定状況_高額分_List = new ArrayList<>();
        List<RString> 保険給付決定状況_高額合算分_List = new ArrayList<>();
        if (div.getCblOutputTaishoAll().getSelectedKeys().contains(すべて選択)) {
            一般状況1_11_List.add(一般状況1_11);
            一般状況12_14_現物分_List.add(一般状況12_14_現物分);
            保険給付決定状況_現物分_List.add(保険給付決定状況_現物分);
            一般状況12_14_償還分_List.add(一般状況12_14_償還分);
            保険給付決定状況_償還分_List.add(保険給付決定状況_償還分);
            保険給付決定状況_高額分_List.add(保険給付決定状況_高額分);
            保険給付決定状況_高額合算分_List.add(保険給付決定状況_高額合算分);
            div.getCblOutputTaisho1().setSelectedItemsByKey(一般状況1_11_List);
            div.getCblOutputTaisho2().setSelectedItemsByKey(一般状況12_14_現物分_List);
            div.getCblOutputTaisho3().setSelectedItemsByKey(保険給付決定状況_現物分_List);
            div.getCblOutputTaisho4().setSelectedItemsByKey(一般状況12_14_償還分_List);
            div.getCblOutputTaisho5().setSelectedItemsByKey(保険給付決定状況_償還分_List);
            div.getCblOutputTaisho6().setSelectedItemsByKey(保険給付決定状況_高額分_List);
            div.getCblOutputTaisho7().setSelectedItemsByKey(保険給付決定状況_高額合算分_List);
        } else {
            div.getCblOutputTaisho1().setSelectedItemsByKey(一般状況1_11_List);
            div.getCblOutputTaisho2().setSelectedItemsByKey(一般状況12_14_現物分_List);
            div.getCblOutputTaisho3().setSelectedItemsByKey(保険給付決定状況_現物分_List);
            div.getCblOutputTaisho4().setSelectedItemsByKey(一般状況12_14_償還分_List);
            div.getCblOutputTaisho5().setSelectedItemsByKey(保険給付決定状況_償還分_List);
            div.getCblOutputTaisho6().setSelectedItemsByKey(保険給付決定状況_高額分_List);
            div.getCblOutputTaisho7().setSelectedItemsByKey(保険給付決定状況_高額合算分_List);
        }
    }

    /**
     * 作成日時の設定 の処理です。
     */
    public void set作成日時の設定() {
        if (div.getCblOutputTaisho1().getSelectedKeys().contains(一般状況1_11)) {
            div.getTxtSakuseiYMD1().setReadOnly(false);
            div.getTxtSakuseiTime1().setReadOnly(false);
        } else {
            div.getTxtSakuseiYMD1().setReadOnly(true);
            div.getTxtSakuseiTime1().setReadOnly(true);
        }
        if (div.getCblOutputTaisho2().getSelectedKeys().contains(一般状況12_14_現物分)) {
            div.getTxtSakuseiYMD2().setReadOnly(false);
            div.getTxtSakuseiTime2().setReadOnly(false);
        } else {
            div.getTxtSakuseiYMD2().setReadOnly(true);
            div.getTxtSakuseiTime2().setReadOnly(true);
        }
        if (div.getCblOutputTaisho3().getSelectedKeys().contains(保険給付決定状況_現物分)) {
            div.getTxtSakuseiYMD3().setReadOnly(false);
            div.getTxtSakuseiTime3().setReadOnly(false);
        } else {
            div.getTxtSakuseiYMD3().setReadOnly(true);
            div.getTxtSakuseiTime3().setReadOnly(true);
        }
        if (div.getCblOutputTaisho6().getSelectedKeys().contains(保険給付決定状況_高額分)) {
            div.getTxtSakuseiYMD6().setReadOnly(false);
            div.getTxtSakuseiTime6().setReadOnly(false);
        } else {
            div.getTxtSakuseiYMD6().setReadOnly(true);
            div.getTxtSakuseiTime6().setReadOnly(true);
        }
        if (div.getCblOutputTaisho7().getSelectedKeys().contains(保険給付決定状況_高額合算分)) {
            div.getTxtSakuseiYMD7().setReadOnly(false);
            div.getTxtSakuseiTime7().setReadOnly(false);
        } else {
            div.getTxtSakuseiYMD7().setReadOnly(true);
            div.getTxtSakuseiTime7().setReadOnly(true);
        }
    }

    /**
     * 一般状況12～14【償還分】チェックボックス の　作成日時の設定 の処理の処理です。
     */
    public void set一般状況償還分() {
        if (div.getCblOutputTaisho4().getSelectedKeys().contains(一般状況12_14_償還分)) {
            div.getTxtSakuseiYMD4().setReadOnly(false);
            div.getTxtSakuseiTime4().setReadOnly(false);
            if (div.getTxtShukeiYM4().getValue() != null
                    || !RString.isNullOrEmpty(div.getTxtShukeiYM4Bak())) {
                div.getRadlblShukeiType4().setReadOnly(false);
            }
        } else {
            div.getTxtSakuseiYMD4().setReadOnly(true);
            div.getTxtSakuseiTime4().setReadOnly(true);
            div.getRadlblShukeiType4().setReadOnly(true);
        }
    }

    /**
     * 一般状況12～14【償還分】チェックボックス の　作成日時の設定 の処理の処理です。
     */
    public void set保険給付償還分() {
        if (div.getCblOutputTaisho5().getSelectedKeys().contains(保険給付決定状況_償還分)) {
            div.getTxtSakuseiYMD5().setReadOnly(false);
            div.getTxtSakuseiTime5().setReadOnly(false);
            if (div.getTxtShukeiYM5().getValue() != null
                    || !RString.isNullOrEmpty(div.getTxtShukeiYM5Bak())) {
                div.getRadlblShukeiType5().setReadOnly(false);
            }
        } else {
            div.getTxtSakuseiYMD5().setReadOnly(true);
            div.getTxtSakuseiTime5().setReadOnly(true);
            div.getRadlblShukeiType5().setReadOnly(true);
        }
    }

    /**
     * 実行するボタンを押します。
     *
     * @return DBU010010_JigyoHokokuGeppo_MainParameter
     */
    public DBU010010_JigyoHokokuGeppo_MainParameter onClick_Jikou() {
        DBU010010_JigyoHokokuGeppo_MainParameter param = new DBU010010_JigyoHokokuGeppo_MainParameter();
        param.setPrintControlKbn(getプリントコントロール区分());
        param.setShuukeiNengetu(get集計年月());
        if (div.getTxtHokokuYM().getValue() != null) {
            param.setHoukokuNengetu(div.getTxtHokokuYM().getValue().toDateString());
            param.setHokokuNendo(div.getTxtHokokuYM().getValue().getYear().toDateString());
        }
        param.setNendo(get年度());
        param.setSakuseiNitizi(get作成日時());
        param.setSyoriNitizi(RDate.getNowDateTime());
        param.setOldShichosonKubun(GappeiCityJohoBFinder.createInstance().getGappeijohokubun());
        param.setKouseiShichosonKubun(new RString("0"));
        if (is広域()) {
            param.setKouseiShichosonKubun(new RString("1"));
        }
        param.setShichosonCode(get市町村コード());
        param.setKouseiShichosonCode(get構成市町村コードList());
        param.setOldShichosonCode(get旧市町村コードList());
        ShichosonSelectorModel model = DataPassingConverter.deserialize(div.getShichosonKubun(), ShichosonSelectorModel.class);
        if (model != null) {
            if (model.getList() != null && !model.getList().isEmpty()) {
                param.setShuukeibunShichosonKubun(
                        get過去集計分旧市町村区分(model.getList().get(0).get市町村コード().value(),
                                param.getOldShichosonCode()));
            }
            param.setShuukeibunShichosonCode(get過去集計分市町村コードリスト(model.getList()));
        }
        param.setKyuufuShuukeiKubunn(get給付集計区分());
        param.setHokokuKubun(合併あり);
        param.setKaishiYm(div.getTxtShukeiYM4Bak());
        param.setShusyoYm(div.getTxtShukeiYM5Bak());
        param.setKetteiYm(get決定年月());
        if (div.getTxtShukeiYM7().getValue() != null) {
            param.setShukeiNendo(div.getTxtShukeiYM7().getValue().seireki().toDateString());
        }
        return getバッチID(param);
    }

    private RString getプリントコントロール区分() {
        RString プリントコントロール区分 = RString.EMPTY;
        if (集計のみ.equals(div.getRadJikkoTaniShukeiOnly().getSelectedKey())) {
            プリントコントロール区分 = 集計のみ_CODE;
        } else if (集計後に印刷.equals(div.getRadJikkoTaniShukeiAfterPrint().getSelectedKey())) {
            プリントコントロール区分 = 集計後に印刷_CODE;
        } else if (過去の集計結果を印刷.equals(div.getRadJikkoTaniKakoShukeiKekka().getSelectedKey())) {
            プリントコントロール区分 = 過去の集計結果を印刷_CODE;
        }
        return プリントコントロール区分;
    }

    private List<RString> get集計年月() {
        List<RString> shuukeiNengetu = new ArrayList<>();
        if (div.getTxtShukeiYM1().getValue() != null) {
            shuukeiNengetu.add(div.getTxtShukeiYM1().getValue().seireki().getYearMonth());
        } else {
            shuukeiNengetu.add(RString.EMPTY);
        }
        if (div.getTxtShukeiYM2().getValue() != null) {
            shuukeiNengetu.add(div.getTxtShukeiYM1().getValue().seireki().getYearMonth());
        } else {
            shuukeiNengetu.add(RString.EMPTY);
        }
        if (div.getTxtShukeiYM4().getValue() != null) {
            shuukeiNengetu.add(div.getTxtShukeiYM4().getValue().seireki().getYearMonth());
        } else {
            shuukeiNengetu.add(RString.EMPTY);
        }
        if (div.getTxtShukeiYM3().getValue() != null) {
            shuukeiNengetu.add(div.getTxtShukeiYM3().getValue().seireki().getYearMonth());
        } else {
            shuukeiNengetu.add(RString.EMPTY);
        }
        if (div.getTxtShukeiYM5().getValue() != null) {
            shuukeiNengetu.add(div.getTxtShukeiYM5().getValue().seireki().getYearMonth());
        } else {
            shuukeiNengetu.add(RString.EMPTY);
        }
        if (div.getTxtShukeiYM6().getValue() != null) {
            shuukeiNengetu.add(div.getTxtShukeiYM6().getValue().seireki().getYearMonth());
        } else {
            shuukeiNengetu.add(RString.EMPTY);
        }
        if (div.getTxtShukeiYM7().getValue() != null) {
            shuukeiNengetu.add(div.getTxtShukeiYM7().getValue().seireki().getYearMonth());
        } else {
            shuukeiNengetu.add(RString.EMPTY);
        }
        return shuukeiNengetu;
    }

    private List<RString> get年度() {
        List<RString> nendo = new ArrayList<>();
        if (!div.getTxtShukeiYM1().getValue().isEmpty()) {
            nendo.add(div.getTxtShukeiYM1().getValue().getYear().toDateString());
        } else {
            nendo.add(RString.EMPTY);
        }
        if (!div.getTxtShukeiYM4().getValue().isEmpty()) {
            nendo.add(div.getTxtShukeiYM4().getValue().getYear().toDateString());
        } else {
            nendo.add(RString.EMPTY);
        }
        if (!div.getTxtShukeiYM6().getValue().isEmpty()) {
            nendo.add(div.getTxtShukeiYM6().getValue().seireki().toDateString());
        } else {
            nendo.add(RString.EMPTY);
        }
        if (!div.getTxtShukeiYM7().getValue().isEmpty()) {
            nendo.add(div.getTxtShukeiYM7().getValue().getYear().toDateString());
        } else {
            nendo.add(RString.EMPTY);
        }
        return nendo;
    }

    private List<RDateTime> get作成日時() {
        List<RDateTime> 作成日時 = new ArrayList<>();
        if (div.getTxtSakuseiYMD1().getValue() != null) {
            作成日時.add(set作成日時(div.getTxtSakuseiYMD1().getValue(), div.getTxtSakuseiTime1().getValue()));
        } else {
            作成日時.add(RDateTime.MIN);
        }
        if (div.getTxtSakuseiYMD2().getValue() != null) {
            作成日時.add(set作成日時(div.getTxtSakuseiYMD2().getValue(), div.getTxtSakuseiTime2().getValue()));
        } else {
            作成日時.add(RDateTime.MIN);
        }
        if (div.getTxtSakuseiYMD4().getValue() != null) {
            作成日時.add(set作成日時(div.getTxtSakuseiYMD4().getValue(), div.getTxtSakuseiTime4().getValue()));
            作成日時.add(set作成日時(div.getTxtSakuseiYMD4().getValue(), div.getTxtSakuseiTime4().getValue()));
        } else {
            作成日時.add(RDateTime.MIN);
            作成日時.add(RDateTime.MIN);
        }
        if (div.getTxtSakuseiYMD3().getValue() != null) {
            作成日時.add(set作成日時(div.getTxtSakuseiYMD3().getValue(), div.getTxtSakuseiTime3().getValue()));
            作成日時.add(set作成日時(div.getTxtSakuseiYMD3().getValue(), div.getTxtSakuseiTime3().getValue()));
        } else {
            作成日時.add(RDateTime.MIN);
            作成日時.add(RDateTime.MIN);
        }
        if (div.getTxtSakuseiYMD5().getValue() != null) {
            作成日時.add(set作成日時(div.getTxtSakuseiYMD5().getValue(), div.getTxtSakuseiTime5().getValue()));
        } else {
            作成日時.add(RDateTime.MIN);
        }
        if (div.getTxtSakuseiYMD6().getValue() != null) {
            作成日時.add(set作成日時(div.getTxtSakuseiYMD6().getValue(), div.getTxtSakuseiTime6().getValue()));
        } else {
            作成日時.add(RDateTime.MIN);
        }
        if (div.getTxtSakuseiYMD7().getValue() != null) {
            作成日時.add(set作成日時(div.getTxtSakuseiYMD7().getValue(), div.getTxtSakuseiTime7().getValue()));
        } else {
            作成日時.add(RDateTime.MIN);
        }
        return 作成日時;
    }

    private RDateTime set作成日時(RDate 作成日, RTime 作成時) {
        if (作成時 != null) {
            return RDateTime.of(作成日.getYearValue(), 作成日.getMonthValue(),
                    作成日.getDayValue(), 作成時.getHour(), 作成時.getSecond());
        }
        return RDateTime.of(作成日.getYearValue(), 作成日.getMonthValue(),
                作成日.getDayValue(), 00, 00);
    }

    private RString get過去集計分旧市町村区分(RString 市町村コード, List<LasdecCode> 旧市町村コードリスト) {
        for (LasdecCode 旧市町村コード : 旧市町村コードリスト) {
            if (市町村コード.equals(旧市町村コード.value())) {
                return new RString("1");
            }
        }
        return new RString("2");
    }

    private List<RString> get過去集計分市町村コードリスト(List<ShichosonSelectorResult> 市町村選択検索結果) {
        List<RString> 過去集計分市町村コードリスト = new ArrayList<>();
        for (ShichosonSelectorResult 市町村選択結果 : 市町村選択検索結果) {
            過去集計分市町村コードリスト.add(市町村選択結果.get市町村コード().value());
        }
        return 過去集計分市町村コードリスト;
    }

    private DBU010010_JigyoHokokuGeppo_MainParameter getバッチID(DBU010010_JigyoHokokuGeppo_MainParameter param) {
        List<RString> バッチID = new ArrayList<>();
        List<RString> 出力区分List = new ArrayList<>();
        if (div.getCblOutputTaisho1().getSelectedKeys().contains(一般状況1_11)) {
            バッチID.add(DBU010020);
            出力区分List.add(合併あり);
        } else {
            バッチID.add(RString.EMPTY);
            出力区分List.add(RString.EMPTY);
        }
        if (div.getCblOutputTaisho2().getSelectedKeys().contains(一般状況12_14_現物分)) {
            バッチID.add(DBU010030);
            出力区分List.add(合併あり);
        } else {
            バッチID.add(RString.EMPTY);
            出力区分List.add(RString.EMPTY);
        }
        if (div.getCblOutputTaisho4().getSelectedKeys().contains(一般状況12_14_償還分)) {

            if (div.getRadlblShukeiType4().getSelectedKey().equals(審査年月で集計)) {
                バッチID.add(DBU010040);
                出力区分List.add(合併あり);
            } else {
                バッチID.add(RString.EMPTY);
                出力区分List.add(RString.EMPTY);
            }
            if (div.getRadlblShukeiType4().getSelectedKey().equals(決定年月で集計)) {
                バッチID.add(DBU010050);
                出力区分List.add(合併あり);
            } else {
                バッチID.add(RString.EMPTY);
                出力区分List.add(RString.EMPTY);
            }
        } else {
            バッチID.add(RString.EMPTY);
            バッチID.add(RString.EMPTY);
            出力区分List.add(RString.EMPTY);
            出力区分List.add(RString.EMPTY);
        }
        if (div.getCblOutputTaisho3().getSelectedKeys().contains(保険給付決定状況_現物分)) {
            出力区分List.add(合併あり);
            バッチID.add(DBU010060);
        } else {
            バッチID.add(RString.EMPTY);
            出力区分List.add(RString.EMPTY);
        }
        if (div.getCblOutputTaisho5().getSelectedKeys().contains(保険給付決定状況_償還分)) {

            if (div.getRadlblShukeiType5().getSelectedKey().equals(給付審査年月で集計)) {
                バッチID.add(DBU010070);
                出力区分List.add(合併あり);
            } else {
                バッチID.add(RString.EMPTY);
                出力区分List.add(RString.EMPTY);
            }
            if (div.getRadlblShukeiType5().getSelectedKey().equals(給付決定年月で集計)) {
                バッチID.add(DBU010080);
                出力区分List.add(合併あり);
            } else {
                バッチID.add(RString.EMPTY);
                出力区分List.add(RString.EMPTY);
            }
        } else {
            バッチID.add(RString.EMPTY);
            バッチID.add(RString.EMPTY);
            出力区分List.add(RString.EMPTY);
            出力区分List.add(RString.EMPTY);
        }
        if (div.getCblOutputTaisho6().getSelectedKeys().contains(保険給付決定状況_高額分)) {
            出力区分List.add(合併あり);
            バッチID.add(DBU010090);
        } else {
            バッチID.add(RString.EMPTY);
            出力区分List.add(RString.EMPTY);
        }
        if (div.getCblOutputTaisho6().getSelectedKeys().contains(保険給付決定状況_高額合算分)) {
            出力区分List.add(合併あり);
            バッチID.add(DBU010100);
        } else {
            バッチID.add(RString.EMPTY);
            出力区分List.add(RString.EMPTY);
        }
        param.setBatchID(バッチID);
        param.setSyutyoryokuKubun(出力区分List);
        return param;
    }

    private List<RString> get給付集計区分() {
        List<RString> 給付集計区分 = new ArrayList<>();
        if (div.getCblOutputTaisho2().getSelectedKeys().contains(一般状況12_14_現物分)) {
            給付集計区分.add(現物分_選択);
        } else {
            給付集計区分.add(RString.EMPTY);
        }
        if (div.getCblOutputTaisho4().getSelectedKeys().contains(一般状況12_14_償還分)) {
            if (div.getRadlblShukeiType4().getSelectedKey().equals(審査年月で集計)) {
                給付集計区分.add(償還分_審査_選択);
            } else {
                給付集計区分.add(RString.EMPTY);
            }
            if (div.getRadlblShukeiType4().getSelectedKey().equals(決定年月で集計)) {
                給付集計区分.add(償還分_決定_選択);
            } else {
                給付集計区分.add(RString.EMPTY);
            }
        } else {
            給付集計区分.add(RString.EMPTY);
            給付集計区分.add(RString.EMPTY);
        }
        if (div.getCblOutputTaisho3().getSelectedKeys().contains(保険給付決定状況_現物分)) {
            給付集計区分.add(現物分_選択);
        } else {
            給付集計区分.add(RString.EMPTY);
        }
        if (div.getCblOutputTaisho5().getSelectedKeys().contains(保険給付決定状況_償還分)) {
            if (div.getRadlblShukeiType5().getSelectedKey().equals(給付審査年月で集計)) {
                給付集計区分.add(償還分_審査_選択);
            } else {
                給付集計区分.add(RString.EMPTY);
            }
            if (div.getRadlblShukeiType5().getSelectedKey().equals(給付決定年月で集計)) {
                給付集計区分.add(償還分_決定_選択);
            } else {
                給付集計区分.add(RString.EMPTY);
            }
        } else {
            給付集計区分.add(RString.EMPTY);
            給付集計区分.add(RString.EMPTY);
        }
        return 給付集計区分;
    }

    private List<RString> get決定年月() {
        List<RString> 決定年月 = new ArrayList<>();
        if (div.getTxtShukeiYM4().getValue() != null) {
            決定年月.add(div.getTxtShukeiYM4().getValue().seireki().toDateString());
        } else {
            決定年月.add(RString.EMPTY);
        }
        if (div.getTxtShukeiYM7().getValue() != null) {
            決定年月.add(div.getTxtShukeiYM7().getValue().seireki().toDateString());
        } else {
            決定年月.add(RString.EMPTY);
        }
        return 決定年月;
    }
}
