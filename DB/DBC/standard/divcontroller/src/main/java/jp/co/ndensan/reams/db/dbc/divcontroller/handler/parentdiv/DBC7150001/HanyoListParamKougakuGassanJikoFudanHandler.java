/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.handler.parentdiv.DBC7150001;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.definition.batchprm.DBC710150.DBC710150_HanyoListKogakuGassanJikoFutangakuParameter;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC7150001.ChushutsuJokenPanelDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC7150001.HanyoListParamKougakuGassanJikoFudanDiv;
import jp.co.ndensan.reams.db.dbx.business.core.shichosonsecurity.ShichosonSecurityJoho;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBB;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.GyomuBunrui;
import jp.co.ndensan.reams.db.dbx.service.core.shichosonsecurity.ShichosonSecurityJohoFinder;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RYear;
import jp.co.ndensan.reams.uz.uza.lang.SystemException;
import jp.co.ndensan.reams.uz.uza.message.IMessageGettable;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessage;
import jp.co.ndensan.reams.uz.uza.message.Message;
import jp.co.ndensan.reams.uz.uza.ui.binding.KeyValueDataSource;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPair;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;

/**
 * 汎用リスト(高額合算自己負担額情報)のHandlerです。
 *
 * @reamsid_L DBC-3102-010 dingminghao
 */
public class HanyoListParamKougakuGassanJikoFudanHandler {

    private final HanyoListParamKougakuGassanJikoFudanDiv div;
    private static final RString BLANK = new RString("0");
    private static final RString すべて = new RString("すべて");
    private static final RString 広域 = new RString("広域");
    private static final RString 単一 = new RString("単一");
    private static final RString 項目名付加 = new RString("1");
    private static final RString 連番付加 = new RString("2");
    private static final RString 日付 = new RString("3");
    private static final RString 送付対象外を含める = new RString("key0");
    private static final RString 交付申請書整理番号 = new RString("交付申請書整理番号");
    private static final int 調定年度を含めて8年分 = 8;
    private static final int INDEX_ゼロ = 0;

    /**
     * コンストラクタです。
     *
     * @param div 汎用リスト(高額合算自己負担額情報)画面のdiv
     */
    public HanyoListParamKougakuGassanJikoFudanHandler(HanyoListParamKougakuGassanJikoFudanDiv div) {
        this.div = div;
    }

    /**
     * initializeの初期化メソッドです。
     *
     * @return 市町村判定 RString
     */
    public RString initialize() {
        ShichosonSecurityJoho 市町村セキュリティ情報
                = ShichosonSecurityJohoFinder.createInstance().getShichosonSecurityJoho(GyomuBunrui.介護事務);
        ChushutsuJokenPanelDiv panel = div.getChushutsuJokenPanel();

        RString 市町村判定 = 単一;
        if (市町村セキュリティ情報 == null) {
            throw new SystemException(UrErrorMessages.対象データなし.getMessage().evaluate());
        }
        if (市町村セキュリティ情報.get導入形態コード() != null
                && 市町村セキュリティ情報.get導入形態コード().is広域()) {
            市町村判定 = 広域;
            panel.getCcdHokenshaList().setDisplayNone(true);
        } else {
            panel.getCcdHokenshaList().loadHokenshaList();
        }
        panel.getDdlDetaSakuseiKubun().setDataSource(getデータ作成区分());
        div.getChushutsuJokenPanel().getDdlDetaSakuseiKubun().setSelectedIndex(INDEX_ゼロ);
        set調定年度();
        return 市町村判定;
    }

    /**
     * 入力チェックのメソッドです。
     *
     * @return ValidationMessageControlPairs
     *
     */
    public ValidationMessageControlPairs getCheckMessage() {

        ValidationMessageControlPairs pairs = new ValidationMessageControlPairs();
        RString 支給申請書整理番号From = div.getTxtSikyuSinseishoSeiriBangoKaishi().getValue();
        RString 支給申請書整理番号To = div.getTxtSikyuSinseishoSeiriBangoShuryo().getValue();
        if (null != 支給申請書整理番号From && null != 支給申請書整理番号To) {
            int 支給申請書整理番号F = Integer.parseInt(支給申請書整理番号From.toString());
            int 支給申請書整理番号T = Integer.parseInt(支給申請書整理番号To.toString());
            if (支給申請書整理番号T < 支給申請書整理番号F) {
                pairs.add(new ValidationMessageControlPair(
                        new IdocheckMessages(UrErrorMessages.大小関係が不正, 交付申請書整理番号.toString())));
                return pairs;
            }
        }
        return pairs;
    }

    /**
     * 「実行する」ボタンを押下バッチ実行、バッチパラメータ作成をします。
     *
     * @return DBC710150_HanyoListKogakuGassanJikoFutangakuParameter
     * 汎用リスト(高額合算自己負担額情報))_バッチパラメータクラスです
     */
    public DBC710150_HanyoListKogakuGassanJikoFutangakuParameter getBatchParamter() {

        DBC710150_HanyoListKogakuGassanJikoFutangakuParameter batchparam = new DBC710150_HanyoListKogakuGassanJikoFutangakuParameter();
        if (すべて.equals(div.getRadChushutsuKubun().getSelectedValue())) {
            batchparam.setChushutsuKubun(RString.EMPTY);
        } else {
            batchparam.setChushutsuKubun(div.getRadChushutsuKubun().getSelectedValue());
        }
        if (すべて.equals(div.getDdlDetaSakuseiKubun().getSelectedValue())) {
            batchparam.setDetaSakuseiKubun(RString.EMPTY);
        } else {
            batchparam.setDetaSakuseiKubun(div.getDdlDetaSakuseiKubun().getSelectedKey());
        }
        if (すべて.equals(div.getRadDataShurui().getSelectedValue())) {
            batchparam.setDataShurui(RString.EMPTY);
        } else {
            batchparam.setDataShurui(div.getRadDataShurui().getSelectedValue());
        }
        if (すべて.equals(div.getRadHoseuJokyo().getSelectedValue())) {
            batchparam.setHoseuJokyo(RString.EMPTY);
        } else {
            batchparam.setHoseuJokyo(div.getRadHoseuJokyo().getSelectedValue());
        }
        batchparam.setFlexibleYear(div.getDdlTaishoNendo().getSelectedKey());
        if (null != div.getTxtSinseibi().getFromValue()) {
            batchparam.setFlexibleDateFrom(new FlexibleDate(div.getTxtSinseibi().getFromValue().toString()));
        }
        if (null != div.getTxtSinseibi().getToValue()) {
            batchparam.setFlexibleDateTo(new FlexibleDate(div.getTxtSinseibi().getToValue().toString()));
        }
        if (null != div.getTxtSikyuSinseishoSeiriBangoKaishi()) {
            batchparam.setShikyuShinseishoSeiriNoFrom(div.getTxtSikyuSinseishoSeiriBangoKaishi().getValue());
        }
        if (null != div.getTxtSikyuSinseishoSeiriBangoShuryo()) {
            batchparam.setShikyuShinseishoSeiriNoTo(div.getTxtSikyuSinseishoSeiriBangoShuryo().getValue());
        }
        if (送付対象外を含める.toString().equals(div.getChkSofuTaishogaiFukumu().getSelectedKeys().toString())) {
            batchparam.setSofuTaishogaiFukumu(true);
        }
        batchparam = setChkCsvHenshuHoho(batchparam);
        if (null != div.getCcdHokenshaList().getSelectedItem().get市町村コード().toString()) {
            batchparam.setHokenshaNo(div.getCcdHokenshaList().getSelectedItem().get市町村コード().getColumnValue());
        }
        if (null != div.getCcdShutsuryokujun().getSelected出力順()) {
            batchparam.setShutsuryokuju(div.getCcdShutsuryokujun().getSelected出力順().get出力順ID());
        }
        if (null != div.getCcdShutsuryokuKoumoku()) {
            batchparam.setShutsuryokuTomoku(div.getCcdShutsuryokuKoumoku().get出力項目ID());
        } else {
            batchparam.setShutsuryokuTomoku(RString.EMPTY);
        }
        return batchparam;
    }

    private DBC710150_HanyoListKogakuGassanJikoFutangakuParameter setChkCsvHenshuHoho(DBC710150_HanyoListKogakuGassanJikoFutangakuParameter batchparam) {
        if (null != div.getTxtJikoFutangakuKakunin().getFromValue()) {
            batchparam.setJikoFutangakuKakuninFrom(new FlexibleDate(div.getTxtJikoFutangakuKakunin().getFromValue().toString()));
        }
        if (null != div.getTxtJikoFutangakuKakunin().getToValue()) {
            batchparam.setSofuTaishogaiFukumuTo(new FlexibleDate(div.getTxtJikoFutangakuKakunin().getToValue().toString()));
        }
        if (null != div.getTxtHoseizumiJikoFutangaku().getFromValue()) {
            batchparam.setHoseizumiJikoFutangakuFrom(new FlexibleDate(div.getTxtHoseizumiJikoFutangaku().getFromValue().toString()));
        }
        if (null != div.getTxtHoseizumiJikoFutangaku().getToValue()) {
            batchparam.setHoseizumiJikoFutangakuTo(new FlexibleDate(div.getTxtHoseizumiJikoFutangaku().getToValue().toString()));
        }
        if (null != div.getTxtJikoFutanngakuShoumeisho().getFromValue()) {
            batchparam.setJikoFutanngakuShoumeishoFrom(new FlexibleDate(div.getTxtJikoFutanngakuShoumeisho().getFromValue().toString()));
        }
        if (null != div.getTxtJikoFutangakuKakunin().getToValue()) {
            batchparam.setJikoFutanngakuShoumeishoTo(new FlexibleDate(div.getTxtJikoFutanngakuShoumeisho().getToValue().toString()));
        }
        List<RString> selectKey = div.getChkCsvHenshuHoho().getSelectedKeys();
        if (selectKey.contains(項目名付加)) {
            batchparam.setRebanFuka(true);
        } else {
            batchparam.setRebanFuka(false);
        }
        if (selectKey.contains(連番付加)) {
            batchparam.setTomokumeFuka(true);
        } else {
            batchparam.setTomokumeFuka(false);
        }
        if (selectKey.contains(日付)) {
            batchparam.setSlashDate(true);
        } else {
            batchparam.setSlashDate(false);
        }
        return batchparam;
    }

    private List<KeyValueDataSource> getデータ作成区分() {
        List<KeyValueDataSource> dataSourceList = new ArrayList<>();
        KeyValueDataSource dataSourceBlank = new KeyValueDataSource(BLANK, すべて);
        dataSourceList.add(dataSourceBlank);
        // TODO QA328
//        for (KaigoGassan_ShinseiJokyoKbn データ作成 : KaigoGassan_ShinseiJokyoKbn.values()) {
//            KeyValueDataSource dataSource = new KeyValueDataSource(データ作成.getコード(), データ作成.get名称());
//            dataSourceList.add(dataSource);
//    }
        return dataSourceList;
    }

    private void set調定年度() {
        List<KeyValueDataSource> dataSourceList = new ArrayList<>();
        RYear 日付関連_当初年度 = new RYear(DbBusinessConfig.get(ConfigNameDBB.日付関連_当初年度,
                RDate.getNowDate(), SubGyomuCode.DBB介護賦課).toString());
        RYear 日付関連_調定年度 = new RYear(DbBusinessConfig.get(ConfigNameDBB.日付関連_調定年度,
                RDate.getNowDate(), SubGyomuCode.DBB介護賦課).toString());
        KeyValueDataSource dataSourceBlank = new KeyValueDataSource(BLANK, RString.EMPTY);
        dataSourceList.add(dataSourceBlank);
        for (int i = 日付関連_調定年度.getYearValue(); 日付関連_当初年度.getYearValue() <= i; i--) {
            if (i <= 日付関連_調定年度.getYearValue() - 調定年度を含めて8年分) {
                break;
            }
            KeyValueDataSource 調定年度Key = new KeyValueDataSource();
            調定年度Key.setKey(new RString(String.valueOf(i)));
            調定年度Key.setValue(new RYear(String.valueOf(i)).wareki().toDateString());
            dataSourceList.add(調定年度Key);
        }
        div.getChushutsuJokenPanel().getDdlTaishoNendo().setDataSource(dataSourceList);

    }

    private static class IdocheckMessages implements IValidationMessage {

        private final Message message;

        public IdocheckMessages(IMessageGettable message, String... replacements) {
            this.message = message.getMessage().replace(replacements);
        }

        @Override
        public Message getMessage() {
            return message;
        }
    }
}