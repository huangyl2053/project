/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.ChosaItakusakiAndChosainGuide.ChosaItakusakiAndChosainGuide;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBU;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbz.business.core.inkijuntsukishichosonjoho.KijuntsukiShichosonjoho;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaItakuKubunCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.ui.binding.KeyValueDataSource;
import jp.co.ndensan.reams.uz.uza.util.serialization.DataPassingConverter;
import jp.co.ndensan.reams.db.dbz.business.core.inkijuntsukishichosonjoho.KijuntsukiShichosonjohoiDataPassModel;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.ChosaItakusakiAndChosainGuide.ChosaItakusakiAndChosainGuide.ChosaItakusakiAndChosainGuideDiv.TaishoMode;

/**
 * 調査委託先＆調査員ガイドDivのHandlerクラスです。
 *
 * @reamsid_L DBZ-1300-020 wanghui
 */
public class ChosaItakusakiAndChosainGuideHandler {

    private final ChosaItakusakiAndChosainGuideDiv div;
    private static final int 委託先モードのカラム幅 = 357;
    private static final int 調査員モードのカラム幅 = 169;

    /**
     * コンストラクタです。
     *
     * @param div 調査委託先＆調査員ガイ共有子Divのエンティティ
     */
    public ChosaItakusakiAndChosainGuideHandler(ChosaItakusakiAndChosainGuideDiv div) {
        this.div = div;
    }

    /**
     * 画面初期化処理です。
     */
    public void intialize() {
        div.getTxtMaxKensu().setValue(new Decimal(DbBusinessConfig.
                get(ConfigNameDBU.検索制御_最大取得件数, RDate.getNowDate(), SubGyomuCode.DBU介護統計報告).toString()));
        List<KeyValueDataSource> ddlShoriKubun = new ArrayList<>();
        ddlShoriKubun.add(new KeyValueDataSource(RString.EMPTY, RString.EMPTY));
        for (ChosaItakuKubunCode code : ChosaItakuKubunCode.values()) {
            ddlShoriKubun.add(new KeyValueDataSource(code.getコード(), code.get名称()));
        }
        div.getDdlChosaItakusakiKubun().setDataSource(ddlShoriKubun);
        div.getTxtChikuCode().setMaxLength(5);
        div.getTxtChikuCode().setPaddingZero(true);
        KijuntsukiShichosonjohoiDataPassModel dataPassModel = DataPassingConverter.deserialize(
                div.getHdnDataPass(), KijuntsukiShichosonjohoiDataPassModel.class);
        if (dataPassModel != null) {
            div.setHdnDatabaseSubGyomuCode(dataPassModel.getサブ業務コード());
            div.setMode_TaishoMode(TaishoMode.getEnum(dataPassModel.get対象モード().toString()));
            if (dataPassModel.get対象モード().toString().equals(TaishoMode.Itakusaki.name())) {
                div.setTitle(new RString("認定調査委託先選択"));
            }
            if (dataPassModel.get対象モード().toString().equals(TaishoMode.Chosain.name())) {
                div.setTitle(new RString("認定調査員選択"));
            }
        }
    }

    /**
     * 「条件をクリアする」ボタン押下、検索条件をクリアします。
     */
    public void 検索条件クリア() {
        div.getTxtChosaItakusakiCodeFrom().clearValue();
        div.getTxtChosaItakuaskiCodeTo().clearValue();
        div.getTxtChosaItakusakiName().clearValue();
        div.getRadChosainJokyo().setSelectedKey(new RString("1"));
        div.getRadItakusakiJokyo().setSelectedKey(new RString("1"));
        div.getTxtChosaItakusakiKanaMeisho().clearValue();
        div.getDdlChosaItakusakiKubun().setSelectedKey(RString.EMPTY);
        div.getTxtChikuCode().clearDomain();
        div.getTxtChosainCodeFrom().clearValue();
        div.getTxtChosainCodeTo().clearValue();
        div.getTxtChosainName().clearValue();
        div.getTxtChosainKanaShimei().clearValue();
        div.getTxtMaxKensu().clearValue();
        div.getTxtMaxKensu().setValue(new Decimal(DbBusinessConfig.
                get(ConfigNameDBU.検索制御_最大取得件数, RDate.getNowDate(), SubGyomuCode.DBU介護統計報告).toString()));
    }

    /**
     * 調査委託先＆調査員ガ情報gridエリア。
     *
     * @param list 情報gridエリア内容
     * @param mode
     */
    public void setDataGrid(List<KijuntsukiShichosonjoho> list, RString mode) {
        List<dgKensakuKekkaIchiran_Row> kensakuKekkaIchiranGridList = new ArrayList<>();
        for (int i = 0; i < list.size() && i < div.getTxtMaxKensu().getText().toInt(); i++) {
            KijuntsukiShichosonjoho business = list.get(i);
            dgKensakuKekkaIchiran_Row kensakuKekkaIchiran_Row = new dgKensakuKekkaIchiran_Row();
            kensakuKekkaIchiran_Row.getItakusakicode().setValue(nullToEmpty(business.get認定調査委託先コード()));
            kensakuKekkaIchiran_Row.setItakusakiMeisho(nullToEmpty(business.get事業者名称()));
            kensakuKekkaIchiran_Row.setItakusakiKanaMeisho(nullToEmpty(business.get事業者名称カナ()));
            kensakuKekkaIchiran_Row.setItakusakiKubun(nullToEmpty(business.get調査委託区分()));
            kensakuKekkaIchiran_Row.setItakusakiJokyo(nullToEmpty(business.is状況フラグ()
                    ? new RString("有効") : new RString("無効")));
            kensakuKekkaIchiran_Row.setChosainCode(nullToEmpty(business.get認定調査員コード()));
            kensakuKekkaIchiran_Row.setChosainShimei(nullToEmpty(business.get調査員氏名()));
            kensakuKekkaIchiran_Row.setChosainKanaShimei(nullToEmpty(business.get調査員氏名カナ()));
            kensakuKekkaIchiran_Row.setChosainHJokyo(nullToEmpty(business.is調査員状況フラグ()
                    ? new RString("有効") : new RString("無効")));
            kensakuKekkaIchiran_Row.setShichosonCode(business.get市町村コード());
            kensakuKekkaIchiran_Row.setYubiBango(business.get郵便番号());
            kensakuKekkaIchiran_Row.setJyuSho(business.get住所());
            kensakuKekkaIchiran_Row.setTelCode(business.get電話番号());
            kensakuKekkaIchiranGridList.add(kensakuKekkaIchiran_Row);
        }
        div.getDgKensakuKekkaIchiran().setDataSource(kensakuKekkaIchiranGridList);
        div.getDgKensakuKekkaIchiran().getGridSetting().setSelectedRowCount(list.size());
        div.getDgKensakuKekkaIchiran().getGridSetting().setLimitRowCount(div.getTxtMaxKensu().getValue().intValue());
        div.getTxtChikuCode().setMaxLength(5);
        div.getTxtChikuCode().setPaddingZero(true);
        if (mode.toString().equals(TaishoMode.Itakusaki.name())) {
            div.getDgKensakuKekkaIchiran().getGridSetting().getColumn("itakusakiMeisho").setWidth(委託先モードのカラム幅);
            div.getDgKensakuKekkaIchiran().getGridSetting().getColumn("itakusakiKanaMeisho").setWidth(委託先モードのカラム幅);
            div.getDgKensakuKekkaIchiran().getGridSetting().getColumn("chosainCode").setVisible(false);
            div.getDgKensakuKekkaIchiran().getGridSetting().getColumn("chosainShimei").setVisible(false);
            div.getDgKensakuKekkaIchiran().getGridSetting().getColumn("chosainKanaShimei").setVisible(false);
            div.getDgKensakuKekkaIchiran().getGridSetting().getColumn("chosainHJokyo").setVisible(false);
        }
        if (mode.toString().equals(TaishoMode.Chosain.name())) {
            div.getDgKensakuKekkaIchiran().getGridSetting().getColumn("itakusakiMeisho").setWidth(調査員モードのカラム幅);
            div.getDgKensakuKekkaIchiran().getGridSetting().getColumn("itakusakiKanaMeisho").setWidth(調査員モードのカラム幅);
        }
    }

    /**
     * 選択ボタンを押下します。
     */
    public void onSelectbtn() {
        KijuntsukiShichosonjohoiDataPassModel dataPassModel = DataPassingConverter.deserialize(
                div.getHdnDataPass(), KijuntsukiShichosonjohoiDataPassModel.class);
        RString 対象モード;
        if (dataPassModel != null) {
            対象モード = nullToEmpty(dataPassModel.get対象モード());
            if (RString.isNullOrEmpty(dataPassModel.get市町村コード())) {
                dataPassModel.set市町村コード(div.getDgKensakuKekkaIchiran().getClickedItem().getShichosonCode());
            }
            dataPassModel.set郵便番号(div.getDgKensakuKekkaIchiran().getClickedItem().getYubiBango());
            dataPassModel.set住所(div.getDgKensakuKekkaIchiran().getClickedItem().getJyuSho());
            dataPassModel.set電話番号(div.getDgKensakuKekkaIchiran().getClickedItem().getTelCode());
            if (ChosaItakusakiAndChosainGuideDiv.TaishoMode.Itakusaki.toString().equals(対象モード.toString())) {
                dataPassModel.set委託先コード(div.getDgKensakuKekkaIchiran().getClickedItem().getItakusakicode().getValue());
                dataPassModel.set委託先名(div.getDgKensakuKekkaIchiran().getClickedItem().getItakusakiMeisho());
            } else {
                dataPassModel.set調査員コード(div.getDgKensakuKekkaIchiran().getClickedItem().getChosainCode());
                dataPassModel.set調査員名(div.getDgKensakuKekkaIchiran().getClickedItem().getChosainShimei());
                dataPassModel.set委託先コード(div.getDgKensakuKekkaIchiran().getClickedItem().getItakusakicode().getValue());
                dataPassModel.set委託先名(div.getDgKensakuKekkaIchiran().getClickedItem().getItakusakiMeisho());
            }
            div.setHdnDataPass(DataPassingConverter.serialize(dataPassModel));
        }

    }

    private RString nullToEmpty(RString obj) {
        if (obj == null) {
            return RString.EMPTY;
        }
        return obj;
    }
}
