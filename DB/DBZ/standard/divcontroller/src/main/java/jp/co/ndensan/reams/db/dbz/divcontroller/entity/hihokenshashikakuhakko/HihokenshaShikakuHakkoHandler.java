/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.divcontroller.entity.hihokenshashikakuhakko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jp.co.ndensan.reams.db.dbz.business.config.HokenshaJohoConfig;
import jp.co.ndensan.reams.db.dbz.business.config.ShiharaiHohoHenkoConfig;
import jp.co.ndensan.reams.db.dbz.business.config.ShuruiShikyuGendoGetConfig;
import jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.YokaigoJotaiKubun09;
import jp.co.ndensan.reams.db.dbz.definition.util.itemlist.IItemList;
import jp.co.ndensan.reams.db.dbz.definition.util.itemlist.ItemList;
import jp.co.ndensan.reams.db.dbz.definition.util.optional.DbOptional;
import jp.co.ndensan.reams.db.dbz.definition.util.optional.IOptional;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import static jp.co.ndensan.reams.db.dbz.divcontroller.entity.hihokenshashikakuhakko.HihokenshaShikakuHakkoDiv.発行証タイプ.被保険者証;
import static jp.co.ndensan.reams.db.dbz.divcontroller.entity.hihokenshashikakuhakko.HihokenshaShikakuHakkoDiv.発行証タイプ.資格者証;
import jp.co.ndensan.reams.db.dbz.model.ServiceShuruiShikyuGendoGakuModel;
import jp.co.ndensan.reams.db.dbz.model.ShiharaiHohoHenkoModel;
import jp.co.ndensan.reams.db.dbz.model.hihokenshadaicho.HihokenshaDaichoModel;
import jp.co.ndensan.reams.db.dbz.model.hihokenshashikakuhakko.HihokenshaShikakuHakkoModel;
import jp.co.ndensan.reams.db.dbz.model.relate.KyotakuKeikakuRelateModel;
import jp.co.ndensan.reams.db.dbz.model.relate.NinteiShinseiKekkaModel;
import jp.co.ndensan.reams.db.dbz.realservice.HihokenshaDaichoFinder;
import jp.co.ndensan.reams.db.dbz.realservice.KyotakuKeikakuFinder;
import jp.co.ndensan.reams.db.dbz.realservice.NinteiShinseiKekkaFinder;
import jp.co.ndensan.reams.db.dbz.realservice.ServiceShuruiShikyuGendoGakuManager;
import jp.co.ndensan.reams.db.dbz.realservice.ShiharaiHohoHenkoManager;
import jp.co.ndensan.reams.db.dbz.business.hihokenshashikakuhakko.HihokenshaShikakuHakko;
import jp.co.ndensan.reams.db.dbz.business.hihokenshashikakuhakko.HihokenshaShikakuHakkoValidation;
import jp.co.ndensan.reams.db.dbz.business.hihokenshashikakuhakko.HihokenshaShikakuHakkoValidationMessage;
import jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.configvalues.ConfigValuesShiharaiHohoHenko;
import jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.configvalues.ConfigValuesShuruiShikyuGendoGet;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.code.shikaku.DBACodeShubetsu;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.code.shikaku.HihokenshashoKofuJiyu;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.code.shikaku.ShikakushashoKofuJiyu;
import jp.co.ndensan.reams.ur.urz.business.IKaigoService;
import jp.co.ndensan.reams.ur.urz.definition.code.CodeMasterHelper;
import jp.co.ndensan.reams.ur.urz.realservice.IKaigoServiceManager;
import jp.co.ndensan.reams.ur.urz.realservice.KaigoServiceManagerFactory;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessage;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessages;
import jp.co.ndensan.reams.uz.uza.ui.binding.DropDownList;
import jp.co.ndensan.reams.uz.uza.ui.binding.KeyValueDataSource;
import jp.co.ndensan.reams.uz.uza.ui.binding.ViewControl;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPair;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;

/**
 * 共有子Div「被保険者証資格者証発行」のHandlerクラスです。
 *
 * @author N8187 久保田 英男
 */
public class HihokenshaShikakuHakkoHandler {

    private final HihokenshaShikakuHakkoDiv div;

    private static final RString COLLON = new RString(":");
    private static final RString JIKOSAKUSEI = new RString("自己作成");
    private static final RString KOFUJIYU_TESTKEY = new RString("testKey");
    private static final RString KOFUJIYU_TEST = new RString("テスト");
    private static final RString KOFUJIYU_CHOKUZENKEY = new RString("chokuzenKey");
    private static final RString KOFUJIYU_CHOKUZEN = new RString("直前履歴");
    // TODO N8187 久保田 審査会意見の最大長(被保険者証の場合198文字)は被保険者証のソースデータクラスから取得するよう修正する。 2015/03/31。
    private static final int SHINSAKAIIKEN_MAX_HIHOKENSHASHO = 198;
    // TODO N8187 久保田 審査会意見の最大長(資格者証の場合175文字)は資格者証のソースデータクラスから取得するよう修正する。 2015/03/31。
    private static final int SHINSAKAIIKEN_MAX_SHIKAKUSHASHO = 175;
    private final RString 被保険者区分コード_2 = new RString("2");

    /**
     * コンストラクタです。
     *
     * @param div 被保険者証資格者証発行Divのエンティティ
     */
    public HihokenshaShikakuHakkoHandler(HihokenshaShikakuHakkoDiv div) {
        this.div = div;
    }

    /**
     * 引数を元に被保険者証・資格者証の情報を取得して共有子Divに表示します。
     *
     * @param 被保険者番号 HihokenshaNo
     * @param 識別コード ShikibetsuCode
     * @param is直前履歴 boolean
     */
    public void load(HihokenshaNo 被保険者番号, ShikibetsuCode 識別コード, boolean is直前履歴) {

        clear();

        set交付日交付事由(is直前履歴);

        IOptional<NinteiShinseiKekkaModel> 認定申請結果optional = load認定申請結果(被保険者番号, is直前履歴);
        IOptional<HihokenshaDaichoModel> 被保険者台帳optional = new HihokenshaDaichoFinder().find直近被保険者台帳(被保険者番号);
        if (!認定申請結果optional.isPresent()
                || !被保険者台帳optional.isPresent()) {
            return;
        }

        NinteiShinseiKekkaModel 認定申請結果 = 認定申請結果optional.get();
        HihokenshaDaichoModel 被保険者台帳 = 被保険者台帳optional.get();
        set保険者(被保険者台帳);
        set有効期限(認定申請結果);
        set認定情報(認定申請結果);
        set区分支給限度額(認定申請結果);
        set種類支給限度基準額(認定申請結果);
        set審査会意見(認定申請結果);

        set給付制限(被保険者番号, 被保険者台帳);
        set支援事業者(被保険者番号);
        set施設入退所(識別コード);

    }

    private void set交付日交付事由(boolean is直前履歴) {

        div.getTxtKofuDate().setValue(FlexibleDate.getNowDate());

        List<KeyValueDataSource> kofuJiyuList = new ArrayList<>();
        if (div.getMode_発行証タイプ() == 被保険者証) {
            kofuJiyuList = set被保険者証交付事由(is直前履歴);
        } else if (div.getMode_発行証タイプ() == 資格者証) {
            kofuJiyuList = set資格者証交付事由();
        }
        div.getDdlKofuJiyu().setDataSource(kofuJiyuList);
        if ((div.getMode_発行証タイプ() == 被保険者証) && is直前履歴) {
            div.getDdlKofuJiyu().setSelectedKey(KOFUJIYU_CHOKUZENKEY);
            div.getDdlKofuJiyu().setReadOnly(true);
        }
    }

    private List<KeyValueDataSource> set被保険者証交付事由(boolean is直前履歴) {
        List<KeyValueDataSource> result = new ArrayList<>();
        if (is直前履歴) {
            result.add(new KeyValueDataSource(KOFUJIYU_CHOKUZENKEY, KOFUJIYU_CHOKUZEN));
            return result;
        }
        List<HihokenshashoKofuJiyu> 被保険者証交付事由List = CodeMasterHelper.getCode(DBACodeShubetsu.被保険者証交付事由);

        for (HihokenshashoKofuJiyu 交付事由 : 被保険者証交付事由List) {
            result.add(new KeyValueDataSource(交付事由.value().value(), 交付事由.getMeisho()));
        }
        result.add(new KeyValueDataSource(KOFUJIYU_TESTKEY, KOFUJIYU_TEST));
        return result;
    }

    private List<KeyValueDataSource> set資格者証交付事由() {
        List<KeyValueDataSource> result = new ArrayList<>();
        List<ShikakushashoKofuJiyu> 資格者証交付事由List = CodeMasterHelper.getCode(DBACodeShubetsu.資格者証交付事由);

        for (ShikakushashoKofuJiyu 交付事由 : 資格者証交付事由List) {
            result.add(new KeyValueDataSource(交付事由.value().value(), 交付事由.getMeisho()));
        }
        result.add(new KeyValueDataSource(KOFUJIYU_TESTKEY, KOFUJIYU_TEST));
        return result;
    }

    private IOptional<NinteiShinseiKekkaModel> load認定申請結果(HihokenshaNo 被保険者番号, boolean is直前履歴) {

        IItemList<NinteiShinseiKekkaModel> 認定申請結果履歴 = new NinteiShinseiKekkaFinder().find要介護認定申請結果(被保険者番号);

        if (認定申請結果履歴.isEmpty()) {
            return DbOptional.empty();
        }
        if (認定申請結果履歴.isJustOne()
                && is直前履歴) {
            return DbOptional.empty();
        }

        if (is直前履歴) {
            return DbOptional.of(認定申請結果履歴.toList().get(1));
        }
        return 認定申請結果履歴.findFirst();
    }

    private void set保険者(HihokenshaDaichoModel 被保険者台帳) {

        RString 保険者コード;
        RString 保険者名称;
        LasdecCode 広住特措置元市町村コード = 被保険者台帳.get広住特措置元市町村コード();

        if (!広住特措置元市町村コード.isEmpty()) {
            // TODO N8187 久保田 IKoikiKoseiShichosonFinder(仮名)を使用して広域構成市町村情報を取得する。
            // 広域構成市町村情報から保険者コード・保険者名称を取得する。保険者コードはget証記載保険者番号：(仮名)で取得する。保険者名称取得メソッドは未定。 2015/01/31
            保険者コード = new RString("123456");
            保険者名称 = new RString("広住特措置元保険者名称");
        } else {
            HokenshaJohoConfig config = new HokenshaJohoConfig();
            保険者コード = config.get保険者情報_保険者番号();
            保険者名称 = config.get保険者情報_保険者名称();
        }

        RString hokenshaHyoji = new RStringBuilder(保険者コード).append(COLLON).append(保険者名称).toRString();
        div.getTxtHokensha().setValue(hokenshaHyoji);
    }

    private void set有効期限(NinteiShinseiKekkaModel 認定申請結果) {
        if (div.getMode_発行証タイプ() == 資格者証) {
            div.getTxtYukoKigen().setValue(new RDate(
                    HihokenshaShikakuHakko.get有効期限初期値(
                            認定申請結果.get要介護認定申請情報モデル().get().get認定申請区分申請時コード(),
                            認定申請結果.get要介護認定申請情報モデル().get().get認定申請年月日(),
                            認定申請結果.get要介護認定結果情報モデル().get().get認定有効期間終了年月日()).toString()));
        }
    }

    private void set認定情報(NinteiShinseiKekkaModel 認定申請結果) {

        //  TODO n8187 久保田 要介護状態のEnumクラスは制度改正年度ごとに増える予定。名称の取得は将来的にビジネスクラスを使用して取得する予定だが未検討。 2015/01/31。
        RString 要介護状態 = YokaigoJotaiKubun09.toValue(認定申請結果.get要介護認定結果情報モデル().get().get要介護状態区分コード().value()).getName();
        div.getTxtYokaigodo().setValue(要介護状態);
        div.getTxtNinteiYMD().setValue(new RDate(認定申請結果.get要介護認定結果情報モデル().get().get要介護度認定年月日().toString()));
        div.getTxtNinteiYukoFromYMD().setValue(new RDate(認定申請結果.get要介護認定結果情報モデル().get().get認定有効期間開始年月日().toString()));
        div.getTxtNinteiYukoToYMD().setValue(new RDate(認定申請結果.get要介護認定結果情報モデル().get().get認定有効期間終了年月日().toString()));
        div.getTxtShinseiDate().setValue(認定申請結果.get要介護認定申請情報モデル().get().get認定申請年月日());

    }

    private void set区分支給限度額(NinteiShinseiKekkaModel 認定申請結果) {
        div.getTxtKubunShikyuGendoKijunGaku().setValue(認定申請結果.get受給者台帳モデル().get支給限度単位数());
        div.getTxtYukoFromYMD().setValue(new RDate(認定申請結果.get受給者台帳モデル().get支給限度有効開始年月日().toString()));
        div.getTxtYukoToYMD().setValue(new RDate(認定申請結果.get受給者台帳モデル().get支給限度有効終了年月日().toString()));
    }

    private void set種類支給限度基準額(NinteiShinseiKekkaModel 認定申請結果) {

        ShuruiShikyuGendoGetConfig config = new ShuruiShikyuGendoGetConfig();
        ConfigValuesShuruiShikyuGendoGet 取得方法 = config.get種類支給限度額_取得方法();
        IItemList<ServiceShuruiShikyuGendoGakuModel> list;

        if (取得方法 == ConfigValuesShuruiShikyuGendoGet.種類支給限度額検索時に要介護度を検索キーにしない) {
            list = new ServiceShuruiShikyuGendoGakuManager().getサービス種類支給限度額一覧(
                    YokaigoJotaiKubun09.toValue(認定申請結果.get要介護認定結果情報モデル().get().get要介護状態区分コード().value()),
                    認定申請結果.get受給者台帳モデル().get支給限度有効開始年月日());
        } else {
            list = new ServiceShuruiShikyuGendoGakuManager().getサービス種類支給限度額一覧(
                    YokaigoJotaiKubun09.toValue(認定申請結果.get要介護認定結果情報モデル().get().get要介護状態区分コード().value()));
        }
        List<dgShuruiShikyuGendoKijunGaku_Row> serviceList = new ArrayList<>();

        IKaigoServiceManager manager = KaigoServiceManagerFactory.createInstance();
        for (ServiceShuruiShikyuGendoGakuModel item : list) {
            IKaigoService service = manager.get介護サービス(
                    認定申請結果.get受給者台帳モデル().get支給限度有効開始年月日().getYearMonth(),
                    item.getサービス種類コード().value());
            if (service != null) {
                serviceList.add(new dgShuruiShikyuGendoKijunGaku_Row(
                        service.get介護サービス種類().getサービス種類名称(),
                        new RString(item.get支給限度単位数().toString())));
            }
        }
        div.getTplGendoGaku().getShuruiShikyuGendoKijungaku().getDgShuruiShikyuGendoKijunGaku().setDataSource(serviceList);
    }

    private void set審査会意見(NinteiShinseiKekkaModel 認定申請結果) {

        int 最大長;
        if (div.getMode_発行証タイプ() == 被保険者証) {
            最大長 = SHINSAKAIIKEN_MAX_HIHOKENSHASHO;
        } else {
            最大長 = SHINSAKAIIKEN_MAX_SHIKAKUSHASHO;
        }

        List<IKaigoService> serviceList = new ArrayList<>();
        IKaigoServiceManager manager = KaigoServiceManagerFactory.createInstance();
        FlexibleYearMonth ServiceYM = 認定申請結果.get要介護認定結果情報モデル().get().get要介護度認定年月日().getYearMonth();
        List<RString> list = 認定申請結果.getサービス種類List();
        for (RString サービス種類 : list) {
            if (!サービス種類.isEmpty()) {
                IKaigoService serviceShurui = manager.get介護サービス(ServiceYM, サービス種類);
                if (serviceShurui != null) {
                    serviceList.add(serviceShurui);
                }
            }
        }

        IItemList<IKaigoService> 介護サービス種類リスト = ItemList.empty();
        if (!serviceList.isEmpty()) {
            介護サービス種類リスト = ItemList.of(serviceList);
        }
        RString 審査会意見 = HihokenshaShikakuHakko.compose審査会意見(
                認定申請結果.get要介護認定結果情報モデル().get().get介護認定審査会意見(),
                介護サービス種類リスト,
                最大長);

        div.getTxtShinsakaiIken().setValue(審査会意見);
    }

    private static class KyufuSeigenShutsuryoku {

        private final RString 制限内容;
        private final FlexibleDate 制限期間開始日;
        private final FlexibleDate 制限期間終了日;

        KyufuSeigenShutsuryoku(RString 制限内容,
                FlexibleDate 制限期間開始日,
                FlexibleDate 制限期間終了日) {
            this.制限内容 = 制限内容;
            this.制限期間開始日 = 制限期間開始日;
            this.制限期間終了日 = 制限期間終了日;
        }

        RString get制限内容() {
            return this.制限内容;
        }

        FlexibleDate get制限期間開始日() {
            return this.制限期間開始日;
        }

        FlexibleDate get制限期間終了日() {
            return this.制限期間終了日;
        }

    };

    private void set給付制限(HihokenshaNo 被保険者番号, HihokenshaDaichoModel 被保険者台帳) {

        List<KyufuSeigenShutsuryoku> 給付制限 = new ArrayList<>();
        List<KyufuSeigenShutsuryoku> 優先的 = new ArrayList<>();
        List<KyufuSeigenShutsuryoku> 優先外 = new ArrayList<>();

        if (被保険者台帳.get被保険者区分コード().equals(被保険者区分コード_2)) {

            ConfigValuesShiharaiHohoHenko 終了分記載区分;
            RString 記載文言;
            ShiharaiHohoHenkoConfig config = new ShiharaiHohoHenkoConfig();
            if (div.getMode_発行証タイプ() == 被保険者証) {
                終了分記載区分 = config.get支払方法変更_証表示差止_終了分記載区分();
                記載文言 = config.get支払方法変更_証表示差止_記載文言();
            } else {
                終了分記載区分 = config.get支払方法変更_資格者証表示差止_終了分記載区分();
                記載文言 = config.get支払方法変更_資格者証表示差止_記載文言();
            }
            ShiharaiHohoHenkoManager manager = new ShiharaiHohoHenkoManager();
            IItemList<ShiharaiHohoHenkoModel> history = manager.get2号差止履歴(被保険者番号);

            int historySize;
            if (終了分記載区分 == ConfigValuesShiharaiHohoHenko.支払方法変更_終了分記載区分_終了後も記載する) {
                historySize = 3;
            } else {
                historySize = 1;
            }

            for (int i = 0; i < historySize && i < history.size(); i++) {
                給付制限.add(new KyufuSeigenShutsuryoku(
                        記載文言,
                        history.toList().get(i).get適用開始年月日(),
                        history.toList().get(i).get適用終了年月日()));
            }
            set給付制限to画面(給付制限);

        } else {
            ConfigValuesShiharaiHohoHenko 終了分記載区分;
            RString 記載文言;
            ShiharaiHohoHenkoConfig config = new ShiharaiHohoHenkoConfig();
            if (div.getMode_発行証タイプ() == 被保険者証) {
                終了分記載区分 = config.get支払方法変更_証表示支払方法_終了分記載区分();
                記載文言 = config.get支払方法変更_証表示支払方法_記載文言();
            } else {
                終了分記載区分 = config.get支払方法変更_資格者証表示支払方法_終了分記載区分();
                記載文言 = config.get支払方法変更_資格者証表示支払方法_記載文言();
            }
            ShiharaiHohoHenkoManager manager = new ShiharaiHohoHenkoManager();
            IItemList<ShiharaiHohoHenkoModel> history = manager.get1号償還払化履歴(被保険者番号);

            int historySize;
            if (終了分記載区分 == ConfigValuesShiharaiHohoHenko.支払方法変更_終了分記載区分_終了後も記載する) {
                historySize = 3;
                for (int i = 0; i < historySize && i < history.size(); i++) {
                    優先外.add(new KyufuSeigenShutsuryoku(
                            記載文言,
                            history.toList().get(i).get適用開始年月日(),
                            history.toList().get(i).get適用終了年月日()));
                }
            } else {
                if (!history.isEmpty()) {
                    if (history.toList().get(0).get終了区分().isEmpty()) {
                        優先的.add(new KyufuSeigenShutsuryoku(
                                記載文言,
                                history.toList().get(0).get適用開始年月日(),
                                history.toList().get(0).get適用終了年月日()));
                    }
                }
            }

            if (div.getMode_発行証タイプ() == 被保険者証) {
                終了分記載区分 = config.get支払方法変更_証表示減額_終了分記載区分();
                記載文言 = config.get支払方法変更_証表示減額_記載文言();
            } else {
                終了分記載区分 = config.get支払方法変更_資格者証表示減額_終了分記載区分();
                記載文言 = config.get支払方法変更_資格者証表示減額_記載文言();
            }

            history = manager.get1号減額履歴(被保険者番号);
            if (終了分記載区分 == ConfigValuesShiharaiHohoHenko.支払方法変更_終了分記載区分_終了後も記載する) {
                historySize = 3;
                for (int i = 0; i < historySize && i < history.size(); i++) {
                    優先外.add(new KyufuSeigenShutsuryoku(
                            記載文言,
                            history.toList().get(i).get適用開始年月日(),
                            history.toList().get(i).get適用終了年月日()));
                }
            } else {
                if (!history.isEmpty()) {
                    if ((!history.toList().get(0).get終了区分().isEmpty())
                            || (history.toList().get(0).get終了区分().isEmpty()
                            && history.toList().get(0).get適用終了年月日().isBefore(FlexibleDate.getNowDate()))) {
                        優先的.add(new KyufuSeigenShutsuryoku(
                                記載文言,
                                history.toList().get(0).get適用開始年月日(),
                                history.toList().get(0).get適用終了年月日()));
                    }
                }
            }

            if (!優先的.isEmpty()) {
                給付制限.addAll(優先的);
                給付制限.addAll(優先外);
                給付制限 = sort給付制限(給付制限);

            } else {
                給付制限.addAll(優先外);
                給付制限 = sort給付制限(給付制限);

            }
            set給付制限to画面(給付制限);
        }

    }

    private List<KyufuSeigenShutsuryoku> sort給付制限(List<KyufuSeigenShutsuryoku> 給付制限) {

        Collections.sort(給付制限, new Comparator<KyufuSeigenShutsuryoku>() {
            @Override
            public int compare(KyufuSeigenShutsuryoku o1, KyufuSeigenShutsuryoku o2) {
                int sortType = -1;
                if (o1 == null && o2 == null) {
                    return 0;
                } else if (o1 == null) {
                    return 1 * sortType;
                } else if (o2 == null) {
                    return -1 * sortType;
                }
                return (Integer.parseInt(o1.get制限期間開始日().toString()) - Integer.parseInt(o2.get制限期間開始日().toString())) * sortType;
            }
        });

        return 給付制限;
    }

    private void set給付制限to画面(List<KyufuSeigenShutsuryoku> 給付制限) throws IllegalArgumentException {
        if (!給付制限.isEmpty()) {
            div.getTxtKyufuSeigenNaiyo1().setValue(給付制限.get(0).get制限内容());
            div.getTxtKyufuSeigenKikan1().setFromValue(new RDate(給付制限.get(0).get制限期間開始日().toString()));
            if (has給付制限期間終了日(給付制限.get(0))) {
                div.getTxtKyufuSeigenKikan1().setToValue(new RDate(給付制限.get(0).get制限期間終了日().toString()));
            }
            if (給付制限.size() > 1) {
                div.getTxtKyufuSeigenNaiyo2().setValue(給付制限.get(1).get制限内容());
                div.getTxtKyufuSeigenKikan2().setFromValue(new RDate(給付制限.get(1).get制限期間開始日().toString()));
                if (has給付制限期間終了日(給付制限.get(1))) {
                    div.getTxtKyufuSeigenKikan2().setToValue(new RDate(給付制限.get(1).get制限期間終了日().toString()));
                }
            }
            if (給付制限.size() > 2) {
                div.getTxtKyufuSeigenNaiyo3().setValue(給付制限.get(2).get制限内容());
                div.getTxtKyufuSeigenKikan3().setFromValue(new RDate(給付制限.get(2).get制限期間開始日().toString()));
                if (has給付制限期間終了日(給付制限.get(2))) {
                    div.getTxtKyufuSeigenKikan3().setToValue(new RDate(給付制限.get(2).get制限期間終了日().toString()));
                }
            }
        }
    }

    private boolean has給付制限期間終了日(KyufuSeigenShutsuryoku 給付制限) {

        if (給付制限.get制限期間終了日() == null) {
            return false;
        }
        if (給付制限.get制限期間終了日().equals(FlexibleDate.EMPTY)) {
            return false;
        }
        return true;

    }

    private static class ShienJigyosha {

        private final RString 名称;
        private final FlexibleDate 届出日;
        private final FlexibleDate 適用開始日;

        ShienJigyosha(RString 名称,
                FlexibleDate 届出日,
                FlexibleDate 適用開始日) {
            this.名称 = 名称;
            this.届出日 = 届出日;
            this.適用開始日 = 適用開始日;
        }

        RString get名称() {
            return this.名称;
        }

        FlexibleDate get届出日() {
            return this.届出日;
        }

        FlexibleDate get適用開始日() {
            return this.適用開始日;
        }
    }

    private void set支援事業者(HihokenshaNo 被保険者番号) {

        KyotakuKeikakuFinder finder = new KyotakuKeikakuFinder();
        IItemList<KyotakuKeikakuRelateModel> 居宅計画List = finder.find居宅計画履歴一覧(被保険者番号);
        RString 名称;
        FlexibleDate 届出日;
        FlexibleDate 適用開始日;

        List<ShienJigyosha> list = new ArrayList<>();
        if (!居宅計画List.isEmpty()) {
            for (KyotakuKeikakuRelateModel model : 居宅計画List) {
                届出日 = model.get居宅給付計画届出モデル().get届出年月日();
                if (model.get居宅給付計画事業者作成モデル().isPresent()) {
                    // TODO n8187 久保田 計画事業者、委託先事業者の名称は、URのIKaigoJigyoshaDaichoManager(未実装)の
                    //                  getJigyoshaCurrent(引数＝事業者番号)を使用して取得する。
                    //                  事業者番号は、model.get居宅給付計画事業者作成モデル().get().get計画事業者番号()と、
                    //                  model.get居宅給付計画事業者作成モデル().get().get委託先事業者番号()を使用する。 2015/01/31。
                    RString 計画事業者名称 = new RString("計画事業者名称");
                    RString 委託先事業者名称 = new RString("委託先事業者名称");
                    if (div.getMode_発行証タイプ() == 被保険者証) {
                        名称 = HihokenshaShikakuHakko.compose被保険者証支援事業者名称(計画事業者名称, 委託先事業者名称);
                    } else {
                        名称 = HihokenshaShikakuHakko.compose資格者証支援事業者名称(計画事業者名称, 委託先事業者名称);
                    }
                    適用開始日 = model.get居宅給付計画事業者作成モデル().get().get適用開始年月日();
                } else {
                    名称 = JIKOSAKUSEI;
                    適用開始日 = model.get居宅給付計画自己作成モデル().get().get適用開始年月日();
                }
                list.add(new ShienJigyosha(名称, 届出日, 適用開始日));
            }
        }

        if (!list.isEmpty()) {
            div.getTxtJigyosha1().setValue(list.get(0).get名称());
            div.getTxtTodokedeYMD1().setValue(list.get(0).get届出日());
            div.getTxtTekiyoStYMD1().setValue(list.get(0).get適用開始日());
            if (list.size() > 1) {
                div.getTxtJigyosha2().setValue(list.get(1).get名称());
                div.getTxtTodokedeYMD2().setValue(list.get(1).get届出日());
                div.getTxtTekiyoStYMD2().setValue(list.get(1).get適用開始日());
            }
            if (list.size() > 2) {
                div.getTxtJigyosha3().setValue(list.get(2).get名称());
                div.getTxtTodokedeYMD3().setValue(list.get(2).get届出日());
                div.getTxtTekiyoStYMD3().setValue(list.get(2).get適用開始日());
            }
        }

    }

    private void set施設入退所(ShikibetsuCode 識別コード) {
        // TODO n8187 久保田
        // DBZ_CCD_ShisetsuNyutaishoRirekiKanri-55509 で作成された
        // 施設入退所履歴取得のManager(ShisetsuNyutaishoTokureiTaishoRelateManager)を使用して施設入退所情報を取得する。
        // 以下にコメントアウトしている処理は、古いShisetsuNyutaishoManagerを使用したときに考えていたロジック。
        // 施設入退所履歴取得のManagerを使用する時に削除すること。2015/01/31。
//// 1 ShisetsuNyutaishoManager.get個人台帳別施設入退所履歴(ShikibetsuCode 個人識別コード, DaichoType 台帳種別)を使用して、履歴を取得する。
//        ShisetsuNyutaishoManager manager = new ShisetsuNyutaishoManager();
//        ShisetsuNyutaishoList list = manager.get個人台帳別施設入退所履歴(識別コード, DaichoType.被保険者);
//// 2 入所施設名称を設定する。
//        RString 施設名称;
//        ShisetsuNyutaisho 施設入退所;
//        if (list.iterator().hasNext()) {
//            施設入退所 = list.iterator().next();
//            if (施設入退所.get入所施設().get施設種類() == ShisetsuType.介護保険施設) {
////    2-1 履歴の入所施設種類が介護施設の場合、URのIKaigoJigyoshaDaichoManager(未実装)のgetJigyoshaCurrent(引数＝事業者番号)を使用して施設名を取得する。
//                施設名称 = new RString("介護保険施設");
//            } else {
////    2-2 履歴の入所施設種類が他特例施設・適用除外施設の場合、JogaiJushochitokureiTaishoShisetsuManager.get対象施設(ShisetsuType 施設種類, ShisetsuCode 施設コード)を使用して施設情報を取得し、事業者名称を設定する。
//                // TODO N8187 久保田 Managerが古いので再作成が必要。 2014/01/31
//                JogaiJushochitokureiTaishoShisetsuManager shisetsuManager = new JogaiJushochitokureiTaishoShisetsuManager();
//                JogaiJushochitokureiTaishoShisetsu tokureiShisetsu = shisetsuManager.get対象施設(施設入退所.get入所施設().get施設種類(), 施設入退所.get入所施設().get施設コード());
//                施設名称 = tokureiShisetsu.get施設略称();
//            }
//            div.getTplShisetsuNyutaisho().getTxtNyushoShisetsu1().setValue(施設名称);
//            div.getTplShisetsuNyutaisho().getTxtShisetsuNyushoDate1().setValue(施設入退所.get入所処理年月日());
//            div.getTplShisetsuNyutaisho().getTxtShisetsuTaishoDate1().setValue(施設入退所.get退所処理年月日());
//        }
//        if (list.iterator().hasNext()) {
//            施設入退所 = list.iterator().next();
//            if (施設入退所.get入所施設().get施設種類() == ShisetsuType.介護保険施設) {
////    2-1 履歴の入所施設種類が介護施設の場合、URのIKaigoJigyoshaDaichoManager(未実装)のgetJigyoshaCurrent(引数＝事業者番号)を使用して施設名を取得する。
//                施設名称 = new RString("介護保険施設");
//            } else {
////    2-2 履歴の入所施設種類が他特例施設・適用除外施設の場合、JogaiJushochitokureiTaishoShisetsuManager.get対象施設(ShisetsuType 施設種類, ShisetsuCode 施設コード)を使用して施設情報を取得し、事業者名称を設定する。
//                // TODO N8187 久保田 Managerが古いので再作成が必要。 2014/01/31
//                JogaiJushochitokureiTaishoShisetsuManager shisetsuManager = new JogaiJushochitokureiTaishoShisetsuManager();
//                JogaiJushochitokureiTaishoShisetsu tokureiShisetsu = shisetsuManager.get対象施設(施設入退所.get入所施設().get施設種類(), 施設入退所.get入所施設().get施設コード());
//                施設名称 = tokureiShisetsu.get施設略称();
//            }
//            div.getTplShisetsuNyutaisho().getTxtNyushoShisetsu2().setValue(施設名称);
//            div.getTplShisetsuNyutaisho().getTxtShisetsuNyushoDate2().setValue(施設入退所.get入所処理年月日());
//            div.getTplShisetsuNyutaisho().getTxtShisetsuTaishoDate2().setValue(施設入退所.get退所処理年月日());
//        }
//        if (list.iterator().hasNext()) {
//            施設入退所 = list.iterator().next();
//            if (施設入退所.get入所施設().get施設種類() == ShisetsuType.介護保険施設) {
////    2-1 履歴の入所施設種類が介護施設の場合、URのIKaigoJigyoshaDaichoManager(未実装)のgetJigyoshaCurrent(引数＝事業者番号)を使用して施設名を取得する。
//                施設名称 = new RString("介護保険施設");
//            } else {
////    2-2 履歴の入所施設種類が他特例施設・適用除外施設の場合、JogaiJushochitokureiTaishoShisetsuManager.get対象施設(ShisetsuType 施設種類, ShisetsuCode 施設コード)を使用して施設情報を取得し、事業者名称を設定する。
//                // TODO N8187 久保田 Managerが古いので再作成が必要。 2014/01/31
//                JogaiJushochitokureiTaishoShisetsuManager shisetsuManager = new JogaiJushochitokureiTaishoShisetsuManager();
//                JogaiJushochitokureiTaishoShisetsu tokureiShisetsu = shisetsuManager.get対象施設(施設入退所.get入所施設().get施設種類(), 施設入退所.get入所施設().get施設コード());
//                施設名称 = tokureiShisetsu.get施設略称();
//            }
//            div.getTplShisetsuNyutaisho().getTxtNyushoShisetsu3().setValue(施設名称);
//            div.getTplShisetsuNyutaisho().getTxtShisetsuNyushoDate3().setValue(施設入退所.get入所処理年月日());
//            div.getTplShisetsuNyutaisho().getTxtShisetsuTaishoDate3().setValue(施設入退所.get退所処理年月日());
//        }
    }

    /**
     * 画面に表示している情報を被保険者証資格者証Modelにセットして返します。
     *
     * @return HihokenshaShikakuHakkoModel
     */
    public HihokenshaShikakuHakkoModel create証発行情報() {

        HihokenshaShikakuHakkoModel model = new HihokenshaShikakuHakkoModel();

        model = set有効期限to証発行情報Model(model);
        model = set認定情報to証発行情報Model(model);
        model = set限度額to証発行情報Model(model);
        model = set審査会意見to証発行情報Model(model);
        model = set給付制限to証発行情報Model(model);
        model = set支援事業者to証発行情報Model(model);
        model = set施設入退所to証発行情報Model(model);

        return model;
    }

    private HihokenshaShikakuHakkoModel set有効期限to証発行情報Model(HihokenshaShikakuHakkoModel model) {

        model.set有効期限(div.getYukoKigenInfo().getTxtYukoKigen().getValue());
        model.set交付日(div.getYukoKigenInfo().getTxtKofuDate().getValue());
        RString 保険者 = div.getYukoKigenInfo().getTxtHokensha().getValue();
        RString 保険者番号 = RString.EMPTY;
        RString 保険者名称 = RString.EMPTY;
        if (保険者.contains(COLLON)) {
            保険者番号 = 保険者.split(COLLON.toString()).get(0);
            保険者名称 = 保険者.split(COLLON.toString()).get(1);
        }

        model.set保険者番号(保険者番号);
        model.set保険者名称(保険者名称);
        model.set保険者表示(保険者);
        model.set交付事由コード(div.getYukoKigenInfo().getDdlKofuJiyu().getSelectedKey());
        model.set交付事由(div.getYukoKigenInfo().getDdlKofuJiyu().getSelectedValue());
        if (div.getYukoKigenInfo().getDdlKofuJiyu().getSelectedKey().equals(KOFUJIYU_TESTKEY)) {
            model.setSelectedテスト(true);
        } else if (div.getYukoKigenInfo().getDdlKofuJiyu().getSelectedKey().equals(KOFUJIYU_CHOKUZENKEY)) {
            model.setSelected直前履歴(true);
        }

        return model;
    }

    private HihokenshaShikakuHakkoModel set認定情報to証発行情報Model(HihokenshaShikakuHakkoModel model) {

        model.set要介護状態(div.getNinteiInfo().getTxtYokaigodo().getValue());
        model.set認定日(div.getNinteiInfo().getTxtNinteiYMD().getValue());
        model.set有効期間開始日(div.getNinteiInfo().getTxtNinteiYukoFromYMD().getValue());
        model.set有効期間終了日(div.getNinteiInfo().getTxtNinteiYukoToYMD().getValue());
        model.set申請日(div.getNinteiInfo().getTxtShinseiDate().getValue());
        if (!div.getNinteiInfo().getChkSeidoitsuseiShogai().getSelectedKeys().isEmpty()) {
            model.setSelected性同一障害用(true);
        }

        return model;
    }

    private HihokenshaShikakuHakkoModel set限度額to証発行情報Model(HihokenshaShikakuHakkoModel model) {

        model.set限度基準額(div.getTplGendoGaku().getTxtKubunShikyuGendoKijunGaku().getValue());
        model.set限度額有効期間開始日(div.getTplGendoGaku().getTxtYukoFromYMD().getValue());
        model.set限度額有効期間終了日(div.getTplGendoGaku().getTxtYukoFromYMD().getValue());
        List<RString> 限度基準額サービス種類 = new ArrayList<>();
        List<RString> 限度基準額サービス額 = new ArrayList<>();
        for (dgShuruiShikyuGendoKijunGaku_Row item
                : div.getTplGendoGaku().getShuruiShikyuGendoKijungaku().
                getDgShuruiShikyuGendoKijunGaku().getDataSource()) {
            限度基準額サービス種類.add(item.getServiceShurui());
            限度基準額サービス額.add(item.getGendoGaku());
        }
        model.set限度基準額サービス種類(限度基準額サービス種類);
        model.set限度基準額サービス額(限度基準額サービス額);

        return model;
    }

    private HihokenshaShikakuHakkoModel set審査会意見to証発行情報Model(HihokenshaShikakuHakkoModel model) {

        model.set審査会意見(div.getTplShinsakaiIken().getTxtShinsakaiIken().getValue());

        return model;
    }

    private HihokenshaShikakuHakkoModel set給付制限to証発行情報Model(HihokenshaShikakuHakkoModel model) {

        List<RString> 給付制限内容 = new ArrayList<>();
        List<RDate> 給付制限開始日 = new ArrayList<>();
        List<RDate> 給付制限終了日 = new ArrayList<>();
        給付制限内容.add(div.getTplKyufuSeigen().getTxtKyufuSeigenNaiyo1().getValue());
        給付制限内容.add(div.getTplKyufuSeigen().getTxtKyufuSeigenNaiyo2().getValue());
        給付制限内容.add(div.getTplKyufuSeigen().getTxtKyufuSeigenNaiyo3().getValue());
        給付制限開始日.add(div.getTplKyufuSeigen().getTxtKyufuSeigenKikan1().getFromValue());
        給付制限開始日.add(div.getTplKyufuSeigen().getTxtKyufuSeigenKikan2().getFromValue());
        給付制限開始日.add(div.getTplKyufuSeigen().getTxtKyufuSeigenKikan3().getFromValue());
        給付制限終了日.add(div.getTplKyufuSeigen().getTxtKyufuSeigenKikan1().getToValue());
        給付制限終了日.add(div.getTplKyufuSeigen().getTxtKyufuSeigenKikan2().getToValue());
        給付制限終了日.add(div.getTplKyufuSeigen().getTxtKyufuSeigenKikan3().getToValue());

        model.set給付制限内容(給付制限内容);
        model.set給付制限開始日(給付制限開始日);
        model.set給付制限終了日(給付制限終了日);

        return model;
    }

    private HihokenshaShikakuHakkoModel set支援事業者to証発行情報Model(HihokenshaShikakuHakkoModel model) {

        List<RString> 支援事業者名称 = new ArrayList<>();
        List<FlexibleDate> 支援事業者届出日 = new ArrayList<>();
        List<FlexibleDate> 支援事業者適用開始日 = new ArrayList<>();
        支援事業者名称.add(div.getTplShienJigyosha().getTxtJigyosha1().getValue());
        支援事業者名称.add(div.getTplShienJigyosha().getTxtJigyosha2().getValue());
        支援事業者名称.add(div.getTplShienJigyosha().getTxtJigyosha3().getValue());
        支援事業者届出日.add(div.getTplShienJigyosha().getTxtTodokedeYMD1().getValue());
        支援事業者届出日.add(div.getTplShienJigyosha().getTxtTodokedeYMD2().getValue());
        支援事業者届出日.add(div.getTplShienJigyosha().getTxtTodokedeYMD3().getValue());
        支援事業者適用開始日.add(div.getTplShienJigyosha().getTxtTekiyoStYMD1().getValue());
        支援事業者適用開始日.add(div.getTplShienJigyosha().getTxtTekiyoStYMD2().getValue());
        支援事業者適用開始日.add(div.getTplShienJigyosha().getTxtTekiyoStYMD3().getValue());

        model.set支援事業者名称(支援事業者名称);
        model.set支援事業者届出日(支援事業者届出日);
        model.set支援事業者適用開始日(支援事業者適用開始日);

        return model;
    }

    private HihokenshaShikakuHakkoModel set施設入退所to証発行情報Model(HihokenshaShikakuHakkoModel model) {

        List<RString> 施設名 = new ArrayList<>();
        List<FlexibleDate> 施設入所日 = new ArrayList<>();
        List<FlexibleDate> 施設退所日 = new ArrayList<>();
        施設名.add(div.getTplShisetsuNyutaisho().getTxtNyushoShisetsu1().getValue());
        施設名.add(div.getTplShisetsuNyutaisho().getTxtNyushoShisetsu2().getValue());
        施設名.add(div.getTplShisetsuNyutaisho().getTxtNyushoShisetsu3().getValue());
        施設入所日.add(div.getTplShisetsuNyutaisho().getTxtShisetsuNyushoDate1().getValue());
        施設入所日.add(div.getTplShisetsuNyutaisho().getTxtShisetsuNyushoDate2().getValue());
        施設入所日.add(div.getTplShisetsuNyutaisho().getTxtShisetsuNyushoDate3().getValue());
        施設退所日.add(div.getTplShisetsuNyutaisho().getTxtShisetsuTaishoDate1().getValue());
        施設退所日.add(div.getTplShisetsuNyutaisho().getTxtShisetsuTaishoDate2().getValue());
        施設退所日.add(div.getTplShisetsuNyutaisho().getTxtShisetsuTaishoDate3().getValue());

        model.set施設名(施設名);
        model.set施設入所日(施設入所日);
        model.set施設退所日(施設退所日);

        return model;
    }

    /**
     * この共有子Divに設定されているデータをクリアします。
     */
    public void clear() {
        clear有効期限();
        clear認定情報();
        clear限度額();
        clear審査会意見();
        clear給付制限();
        clear支援事業者();
        clear施設入退所();
    }

    private void clear有効期限() {
        div.getYukoKigenInfo().getTxtYukoKigen().clearValue();
        div.getYukoKigenInfo().getTxtHokensha().clearValue();
        div.getYukoKigenInfo().getDdlKofuJiyu().setSelectedKey(DropDownList.BLANKLINE_KEY);
        div.getYukoKigenInfo().getDdlKofuJiyu().setReadOnly(false);
    }

    private void clear認定情報() {
        div.getNinteiInfo().getTxtYokaigodo().clearValue();
        div.getNinteiInfo().getTxtNinteiYMD().clearValue();
        div.getNinteiInfo().getTxtNinteiYukoFromYMD().clearValue();
        div.getNinteiInfo().getTxtNinteiYukoToYMD().clearValue();
        div.getNinteiInfo().getTxtShinseiDate().clearValue();
    }

    private void clear限度額() {
        div.getTplGendoGaku().getKubunGendoGaku().getTxtKubunShikyuGendoKijunGaku().clearValue();
        div.getTplGendoGaku().getKubunGendoGaku().getTxtYukoFromYMD().clearValue();
        div.getTplGendoGaku().getKubunGendoGaku().getTxtYukoToYMD().clearValue();
        List<dgShuruiShikyuGendoKijunGaku_Row> blankList = new ArrayList<>();
        div.getTplGendoGaku().getShuruiShikyuGendoKijungaku().getDgShuruiShikyuGendoKijunGaku().setDataSource(blankList);
    }

    private void clear審査会意見() {
        div.getTplShinsakaiIken().getTxtShinsakaiIken().clearValue();
    }

    private void clear給付制限() {
        div.getTplKyufuSeigen().getTxtKyufuSeigenNaiyo1().clearValue();
        div.getTplKyufuSeigen().getTxtKyufuSeigenNaiyo2().clearValue();
        div.getTplKyufuSeigen().getTxtKyufuSeigenNaiyo3().clearValue();
        div.getTplKyufuSeigen().getTxtKyufuSeigenKikan1().clearFromValue();
        div.getTplKyufuSeigen().getTxtKyufuSeigenKikan2().clearFromValue();
        div.getTplKyufuSeigen().getTxtKyufuSeigenKikan3().clearFromValue();
        div.getTplKyufuSeigen().getTxtKyufuSeigenKikan1().clearToValue();
        div.getTplKyufuSeigen().getTxtKyufuSeigenKikan2().clearToValue();
        div.getTplKyufuSeigen().getTxtKyufuSeigenKikan3().clearToValue();
    }

    private void clear支援事業者() {
        div.getTplShienJigyosha().getTxtJigyosha1().clearValue();
        div.getTplShienJigyosha().getTxtJigyosha2().clearValue();
        div.getTplShienJigyosha().getTxtJigyosha3().clearValue();
        div.getTplShienJigyosha().getTxtTekiyoStYMD1().clearValue();
        div.getTplShienJigyosha().getTxtTekiyoStYMD2().clearValue();
        div.getTplShienJigyosha().getTxtTekiyoStYMD3().clearValue();
        div.getTplShienJigyosha().getTxtTodokedeYMD1().clearValue();
        div.getTplShienJigyosha().getTxtTodokedeYMD2().clearValue();
        div.getTplShienJigyosha().getTxtTodokedeYMD3().clearValue();
    }

    private void clear施設入退所() {
        div.getTplShisetsuNyutaisho().getTxtNyushoShisetsu1().clearValue();
        div.getTplShisetsuNyutaisho().getTxtNyushoShisetsu2().clearValue();
        div.getTplShisetsuNyutaisho().getTxtNyushoShisetsu3().clearValue();
        div.getTplShisetsuNyutaisho().getTxtShisetsuNyushoDate1().clearValue();
        div.getTplShisetsuNyutaisho().getTxtShisetsuNyushoDate2().clearValue();
        div.getTplShisetsuNyutaisho().getTxtShisetsuNyushoDate3().clearValue();
        div.getTplShisetsuNyutaisho().getTxtShisetsuTaishoDate1().clearValue();
        div.getTplShisetsuNyutaisho().getTxtShisetsuTaishoDate2().clearValue();
        div.getTplShisetsuNyutaisho().getTxtShisetsuTaishoDate3().clearValue();
    }

    public ValidationMessageControlPairs validate被保険者証資格者証() {

        ValidationMessageControlPairs controlPairs = new ValidationMessageControlPairs();
        IValidationMessages messages = new HihokenshaShikakuHakkoValidation().
                validateIn(div.getYukoKigenInfo().getDdlKofuJiyu().getSelectedValue());

        controlPairs = addValidationMessage(controlPairs, messages, HihokenshaShikakuHakkoValidationMessage.交付事由が未選択, div.getYukoKigenInfo().getDdlKofuJiyu());
        return controlPairs;
    }

    private ValidationMessageControlPairs addValidationMessage(ValidationMessageControlPairs controlPairs, IValidationMessages messages, IValidationMessage validationMessage, ViewControl controls) {

        if (messages.contains(validationMessage)) {
            controlPairs.add(new ValidationMessageControlPair(validationMessage, controls));
        }
        return controlPairs;
    }
}
