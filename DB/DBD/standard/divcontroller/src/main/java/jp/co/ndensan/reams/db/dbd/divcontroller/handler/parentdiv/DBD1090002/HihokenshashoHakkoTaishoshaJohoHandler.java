/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.divcontroller.handler.parentdiv.DBD1090002;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbd.business.core.gemmengengaku.futangendogakunintei.FutanGendogakuNintei;
import jp.co.ndensan.reams.db.dbd.business.core.gemmengengaku.homonkaigogengaku.HomonKaigoRiyoshaFutangakuGengaku;
import jp.co.ndensan.reams.db.dbd.business.core.gemmengengaku.riyoshafutangengaku.RiyoshaFutangakuGengaku;
import jp.co.ndensan.reams.db.dbd.business.core.gemmengengaku.shafukukeigen.ShakaifukuRiyoshaFutanKeigen;
import jp.co.ndensan.reams.db.dbd.business.core.gemmengengaku.tokubetsuchikikasangemmen.TokubetsuchiikiKasanGemmen;
import jp.co.ndensan.reams.db.dbd.definition.core.gemmengengaku.KetteiKubun;
import jp.co.ndensan.reams.db.dbd.definition.core.gemmengengaku.futangendogakunintei.ShinseiRiyuKubun;
import jp.co.ndensan.reams.db.dbd.divcontroller.entity.parentdiv.DBD1090002.HihokenshashoHakkoTaishoshaJohoDiv;
import jp.co.ndensan.reams.db.dbd.service.core.genmengengakuninteishotsuchisho.GenmenGengakuNinteishoTsuchishoFinder;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogType;
import jp.co.ndensan.reams.uz.uza.log.accesslog.AccessLogger;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.PersonalData;

/**
 * 減免減額認定証・決定通知書個別発行のハンドラークラスです。
 *
 * @reamsid_L DBD-3540-010 xuyue
 */
public class HihokenshashoHakkoTaishoshaJohoHandler {

    private static final RString 該当 = new RString("該当");
    private static final RString 非該当 = new RString("非該当");
    private static final RString 対象者以外 = new RString("対象者以外");
    private static final RString 対象者 = new RString("対象者");

    private final HihokenshashoHakkoTaishoshaJohoDiv div;
    private final GenmenGengakuNinteishoTsuchishoFinder finder;

    /**
     * コンストラクタです。
     *
     * @param div 受給照会のコントロールdiv
     */
    public HihokenshashoHakkoTaishoshaJohoHandler(HihokenshashoHakkoTaishoshaJohoDiv div) {
        this.div = div;
        this.finder = GenmenGengakuNinteishoTsuchishoFinder.createIntance();

    }

    public void initialize(ShikibetsuCode 識別コード, HihokenshaNo 被保険者番号) {
        div.getCcdHakkoTaishosaInfo().initialize(識別コード);
        div.getCcdHakkoTaishoshaShikaku().initialize(被保険者番号);

        ExpandedInformation expandedInfo = new ExpandedInformation(new Code("0003"), new RString("被保険者番号"), 被保険者番号.value());
        PersonalData personalData = PersonalData.of(識別コード, expandedInfo);
        AccessLogger.log(AccessLogType.照会, personalData);
    }

    /**
     * 利用者負担額減免の情報が存在するかを判断します。
     *
     * @param 被保険者番号 被保険者番号
     * @return 結果 true:利用者負担額減免の情報が存在
     */
    public boolean is利用者負担額減免の情報存在(HihokenshaNo 被保険者番号) {
        return finder.is利用者負担額減免の情報存在(被保険者番号);
    }

    /**
     * 負担限度額認定の情報が存在するかを判断します。
     *
     * @param 被保険者番号 被保険者番号
     * @return 結果 true:負担限度額認定の情報が存在
     */
    public boolean is負担限度額認定の情報存在(HihokenshaNo 被保険者番号) {
        return finder.is負担限度額認定の情報存在(被保険者番号);
    }

    /**
     * 社会福祉法人等利用者負担軽減の情報が存在するかを判断します。
     *
     * @param 被保険者番号 被保険者番号
     * @return 結果 true:社会福祉法人等利用者負担軽減の情報が存在
     */
    public boolean is社会福祉法人等利用者負担軽減の情報存在(HihokenshaNo 被保険者番号) {
        return finder.is社会福祉法人等利用者負担軽減の情報存在(被保険者番号);
    }

    /**
     * 訪問介護利用者負担額減額の情報が存在するかを判断します。
     *
     * @param 被保険者番号 被保険者番号
     * @return 結果 true:訪問介護利用者負担額減額の情報が存在
     */
    public boolean is訪問介護利用者負担額減額の情報存在(HihokenshaNo 被保険者番号) {
        return finder.is訪問介護利用者負担額減額の情報存在(被保険者番号);
    }

    /**
     * 特別地域加算減免の情報が存在するかを判断します。
     *
     * @param 被保険者番号 被保険者番号
     * @return 結果 true:特別地域加算減免の情報が存在
     */
    public boolean is特別地域加算減免の情報存在(HihokenshaNo 被保険者番号) {
        return finder.is特別地域加算減免の情報存在(被保険者番号);
    }

    /**
     * 利用者負担額減免の情報を取得します。
     *
     * @param 被保険者番号 被保険者番号
     * @return 利用者負担額減免の情報
     */
    public ArrayList<RiyoshaFutangakuGengaku> get利用者負担額減免の情報(HihokenshaNo 被保険者番号) {
        return finder.get利用者負担額減免の情報(被保険者番号);
    }

    /**
     * 負担限度額認定の情報を取得します。
     *
     * @param 被保険者番号 被保険者番号
     * @return 負担限度額認定の情報
     */
    public ArrayList<FutanGendogakuNintei> get負担限度額認定の情報(HihokenshaNo 被保険者番号) {
        return finder.get負担限度額認定の情報(被保険者番号);
    }

    /**
     * 社会福祉法人等利用者負担軽減の情報を取得します。
     *
     * @param 被保険者番号 被保険者番号
     * @return 社会福祉法人等利用者負担軽減の情報
     */
    public ArrayList<ShakaifukuRiyoshaFutanKeigen> get社会福祉法人等利用者負担軽減の情報(HihokenshaNo 被保険者番号) {
        return finder.get社会福祉法人等利用者負担軽減の情報(被保険者番号);
    }

    /**
     * 訪問介護利用者負担額減額の情報を取得します。
     *
     * @param 被保険者番号 被保険者番号
     * @return 訪問介護利用者負担額減額の情報
     */
    public ArrayList<HomonKaigoRiyoshaFutangakuGengaku> get訪問介護利用者負担額減額の情報(HihokenshaNo 被保険者番号) {
        return finder.get訪問介護利用者負担額減額の情報(被保険者番号);
    }

    /**
     * 特別地域加算減免の情報を取得します。
     *
     * @param 被保険者番号 被保険者番号
     * @return 特別地域加算減免の情報
     */
    public ArrayList<TokubetsuchiikiKasanGemmen> get特別地域加算減免の情報(HihokenshaNo 被保険者番号) {
        return finder.get特別地域加算減免の情報(被保険者番号);
    }

    /**
     * 利用者負担額減額を選択する場合、利用者負担額減額エリアを設定します。
     *
     * @param list 利用者負担額減額list
     * @param 被保険者番号 被保険者番号
     */
    public void 利用者負担額減額を選択する場合の設定(List<RiyoshaFutangakuGengaku> list, HihokenshaNo 被保険者番号) {
        div.getRiyoshaFutangakuGenmen().setDisplayNone(false);
        div.getFutanGendogakuNintei().setDisplayNone(true);
        div.getHomonKaigoRiyoshaFutangakuGengaku().setDisplayNone(true);
        div.getShafukuHojinToRiyushaFutanKeigen().setDisplayNone(true);
        div.getTokubetsuChilkiKasanGenmen().setDisplayNone(true);
        クリア利用者負担額減免エリア();
        div.getBtnOutputMaeRireki().setDisabled(false);
        div.getBtnOutputAtoRireki().setDisabled(false);

        if (list != null && !list.isEmpty()) {
            RiyoshaFutangakuGengaku riyoshaFutangakuGengaku = list.get(list.size() - 1);
            set認定証と通知書(riyoshaFutangakuGengaku.get決定区分(), new RString("利用者負担額減額・免除等認定証"),
                    new RString("利用者負担額減額・免除認定決定通知書"));
            set利用者負担額減免エリア(riyoshaFutangakuGengaku);
            div.setRiyoshaFutanGenmenInfoIndex(new RString(Integer.toString(list.size() - 1)));
            div.getBtnOutputAtoRireki().setDisabled(true);
            if (1 == list.size()) {
                div.getBtnOutputMaeRireki().setDisabled(true);
            }
        } else {
            div.setHiddenRirekiNo(new RString("-1"));
            div.setRiyoshaFutanGenmenInfoIndex(new RString("-1"));
            div.getBtnOutputMaeRireki().setDisabled(true);
            div.getBtnOutputAtoRireki().setDisabled(true);
        }
    }

    /**
     * 負担限度額認定を選択する場合、負担限度額認定エリアを設定します。
     *
     * @param list 負担限度額認定list
     * @param 被保険者番号 被保険者番号
     */
    public void 負担限度額認定を選択する場合の設定(List<FutanGendogakuNintei> list, HihokenshaNo 被保険者番号) {
        div.getRiyoshaFutangakuGenmen().setDisplayNone(true);
        div.getFutanGendogakuNintei().setDisplayNone(false);
        div.getHomonKaigoRiyoshaFutangakuGengaku().setDisplayNone(true);
        div.getShafukuHojinToRiyushaFutanKeigen().setDisplayNone(true);
        div.getTokubetsuChilkiKasanGenmen().setDisplayNone(true);
        クリア負担限度額認定エリア();
        div.getBtnOutputMaeRireki().setDisabled(false);
        div.getBtnOutputAtoRireki().setDisabled(false);

        if (list != null && !list.isEmpty()) {
            FutanGendogakuNintei futanGendogakuNintei = list.get(list.size() - 1);
            set認定証と通知書(futanGendogakuNintei.get決定区分(), new RString("負担限度額認定証"), new RString("負担限度額決定通知書"));
            set負担限度額認定エリア(futanGendogakuNintei);
            div.setFutanGendogakuNinteiIndex(new RString(Integer.toString(list.size() - 1)));
            div.getBtnOutputAtoRireki().setDisabled(true);
            if (1 == list.size()) {
                div.getBtnOutputMaeRireki().setDisabled(true);
            }
        } else {
            div.setHiddenRirekiNo(new RString("-1"));
            div.setFutanGendogakuNinteiIndex(new RString("-1"));
            div.getBtnOutputMaeRireki().setDisabled(true);
            div.getBtnOutputAtoRireki().setDisabled(true);
        }
    }

    /**
     * 社会福祉法人等利用者負担軽減を選択する場合、社会福祉法人等利用者負担軽減エリアを設定します。
     *
     * @param list 社会福祉法人等利用者負担軽減list
     * @param 被保険者番号 被保険者番号
     */
    public void 社会福祉法人等利用者負担軽減を選択する場合の設定(List<ShakaifukuRiyoshaFutanKeigen> list, HihokenshaNo 被保険者番号) {
        div.getRiyoshaFutangakuGenmen().setDisplayNone(true);
        div.getFutanGendogakuNintei().setDisplayNone(true);
        div.getHomonKaigoRiyoshaFutangakuGengaku().setDisplayNone(true);
        div.getShafukuHojinToRiyushaFutanKeigen().setDisplayNone(false);
        div.getTokubetsuChilkiKasanGenmen().setDisplayNone(true);
        クリア社会福祉法人等利用者負担軽減エリア();
        div.getBtnOutputMaeRireki().setDisabled(false);
        div.getBtnOutputAtoRireki().setDisabled(false);

        if (list != null && !list.isEmpty()) {
            ShakaifukuRiyoshaFutanKeigen shakaifukuRiyoshaFutanKeigen = list.get(list.size() - 1);
            set認定証と通知書(shakaifukuRiyoshaFutanKeigen.get決定区分(), new RString("社会福祉法人等利用者負担軽減確認証"),
                    new RString("社会福祉法人等利用者負担軽減対象決定通知書"));
            set社会福祉法人等利用者負担軽減エリア(shakaifukuRiyoshaFutanKeigen);
            div.setShafukuHojinToRiyushaFutanKeigenIndex(new RString(Integer.toString(list.size() - 1)));
            div.getBtnOutputAtoRireki().setDisabled(true);
            if (1 == list.size()) {
                div.getBtnOutputMaeRireki().setDisabled(true);
            }
        } else {
            div.setHiddenRirekiNo(new RString("-1"));
            div.setShafukuHojinToRiyushaFutanKeigenIndex(new RString("-1"));
            div.getBtnOutputMaeRireki().setDisabled(true);
            div.getBtnOutputAtoRireki().setDisabled(true);
        }
    }

    /**
     * 訪問介護利用者負担額減額を選択する場合、訪問介護利用者負担額減額エリアを設定します。
     *
     * @param list 訪問介護利用者負担額減額list
     * @param 被保険者番号 被保険者番号
     */
    public void 訪問介護利用者負担額減額を選択する場合の設定(List<HomonKaigoRiyoshaFutangakuGengaku> list, HihokenshaNo 被保険者番号) {
        div.getRiyoshaFutangakuGenmen().setDisplayNone(true);
        div.getFutanGendogakuNintei().setDisplayNone(true);
        div.getHomonKaigoRiyoshaFutangakuGengaku().setDisplayNone(false);
        div.getShafukuHojinToRiyushaFutanKeigen().setDisplayNone(true);
        div.getTokubetsuChilkiKasanGenmen().setDisplayNone(true);
        クリア訪問介護利用者負担額減額エリア();
        div.getBtnOutputMaeRireki().setDisabled(false);
        div.getBtnOutputAtoRireki().setDisabled(false);

        if (list != null && !list.isEmpty()) {
            HomonKaigoRiyoshaFutangakuGengaku homonKaigoRiyoshaFutangakuGengaku = list.get(list.size() - 1);
            set認定証と通知書(homonKaigoRiyoshaFutangakuGengaku.get決定区分(), new RString("訪問介護等利用者負担額減額認定証"),
                    new RString("訪問介護等利用者負担額減額決定通知書"));
            set訪問介護利用者負担額減額エリア(homonKaigoRiyoshaFutangakuGengaku);
            div.setHomonKaigoRiyoshaFutangakuGengakuIndex(new RString(Integer.toString(list.size() - 1)));
            div.getBtnOutputAtoRireki().setDisabled(true);
            if (1 == list.size()) {
                div.getBtnOutputMaeRireki().setDisabled(true);
            }
        } else {
            div.setHiddenRirekiNo(new RString("-1"));
            div.setHomonKaigoRiyoshaFutangakuGengakuIndex(new RString("-1"));
            div.getBtnOutputMaeRireki().setDisabled(true);
            div.getBtnOutputAtoRireki().setDisabled(true);
        }
    }

    /**
     * 特別地域加算減免を選択する場合、特別地域加算減免エリアを設定します。
     *
     * @param list 特別地域加算減免list
     * @param 被保険者番号 被保険者番号
     */
    public void 特別地域加算減免を選択する場合の設定(List<TokubetsuchiikiKasanGemmen> list, HihokenshaNo 被保険者番号) {
        div.getRiyoshaFutangakuGenmen().setDisplayNone(true);
        div.getFutanGendogakuNintei().setDisplayNone(true);
        div.getHomonKaigoRiyoshaFutangakuGengaku().setDisplayNone(true);
        div.getShafukuHojinToRiyushaFutanKeigen().setDisplayNone(true);
        div.getTokubetsuChilkiKasanGenmen().setDisplayNone(false);
        クリア特別地域加算減免エリア();
        div.getBtnOutputMaeRireki().setDisabled(false);
        div.getBtnOutputAtoRireki().setDisabled(false);

        if (list != null && !list.isEmpty()) {
            TokubetsuchiikiKasanGemmen tokubetsuchiikiKasanGemmen = list.get(list.size() - 1);
            set認定証と通知書(tokubetsuchiikiKasanGemmen.get決定区分(), new RString("特別地域加算に係る訪問介護利用者負担減額確認証"),
                    new RString("特別地域加算に係る訪問介護利用者負担減額決定通知書"));
            set特別地域加算減免エリア(tokubetsuchiikiKasanGemmen);
            div.setTokubetsuChilkiKasanGenmenIndex(new RString(Integer.toString(list.size() - 1)));
            div.getBtnOutputAtoRireki().setDisabled(true);
            if (1 == list.size()) {
                div.getBtnOutputMaeRireki().setDisabled(true);
            }
        } else {
            div.setHiddenRirekiNo(new RString("-1"));
            div.setTokubetsuChilkiKasanGenmenIndex(new RString("-1"));
            div.getBtnOutputMaeRireki().setDisabled(true);
            div.getBtnOutputAtoRireki().setDisabled(true);
        }
    }

    private void クリア利用者負担額減免エリア() {
        div.getTxtRiyoshaFutanGendogakuKetteiKubun().clearValue();
        div.getTxtRiyoshaFutanGendogakuKyufuRitsu().clearValue();
        div.getTxtRiyoshaFutanGendogakuShinseibi().clearValue();
        div.getTxtRiyoshaFutanGendogakuKetteibi().clearValue();
        div.getTxtRiyoshaFutanGendogakuTekiyobi().clearValue();
        div.getTxtRiyoshaFutanGendogakuYukoKigen().clearValue();
        div.getTxtRiyoshaFutanGendogakuShoninShinaiRiyu().clearValue();
    }

    public void set利用者負担額減免エリア(RiyoshaFutangakuGengaku riyoshaFutangakuGengaku) {
        div.setHiddenRirekiNo(new RString(riyoshaFutangakuGengaku.get履歴番号()));
        div.getTxtRiyoshaFutanGendogakuKetteiKubun().setValue(riyoshaFutangakuGengaku.get決定区分() == null
                || riyoshaFutangakuGengaku.get決定区分().isEmpty()
                ? RString.EMPTY : KetteiKubun.toValue(riyoshaFutangakuGengaku.get決定区分()).get名称());

        if (riyoshaFutangakuGengaku.get給付率() != null) {
            div.getTxtRiyoshaFutanGendogakuKyufuRitsu().setValue(new RString(riyoshaFutangakuGengaku.get給付率().getColumnValue().toString()));
        }
        div.getTxtRiyoshaFutanGendogakuShinseibi().setValue(riyoshaFutangakuGengaku.get申請年月日());
        div.getTxtRiyoshaFutanGendogakuKetteibi().setValue(riyoshaFutangakuGengaku.get決定年月日());
        div.getTxtRiyoshaFutanGendogakuTekiyobi().setValue(riyoshaFutangakuGengaku.get適用開始年月日());
        div.getTxtRiyoshaFutanGendogakuYukoKigen().setValue(riyoshaFutangakuGengaku.get適用終了年月日());
        div.getTxtRiyoshaFutanGendogakuShoninShinaiRiyu().setValue(riyoshaFutangakuGengaku.get非承認理由());
    }

    private void クリア負担限度額認定エリア() {
        div.getTxtFutanGendogakuNinteiKetteiKubun().clearValue();
        div.getTxtFutanGendogakuNinteiShinseibi().clearValue();
        div.getFutanGendogakuNinteiKetteibi().clearValue();
        div.getTxtFutanGendogakuNinteiTekiyobi().clearValue();
        div.getTxtFutanGendogakuNinteiYukoKigen().clearValue();
        div.getTxtFutanGendogakuNinteiShoninShinsaiRiyu().clearValue();
        div.getTxtFutanGendogakuNinteiFutanDankai().clearValue();
        div.getTxtFutanGendogakuNinteiKyuSochi().clearValue();
        div.getTxtFutanGendogakuNinteiKyokaiso().clearValue();
        div.getFutanGendogakuNinteiGekihenKanwa().clearValue();
        div.getTxtFutanGendogakuNinteiShokuhi().clearValue();
        div.getTxtFutanGendogakuNinteiUnitGataKoshitsu().clearValue();
        div.getTxtFutanGendogakuNinteiUnitGataJunkoshitsu().clearValue();
        div.getTxtFutanGendogakuNinteiJuraigataKoshitsuTokuyo().clearValue();
        div.getTxtFutanGendogakuNinteiJuraigataKoshitsuRoken().clearValue();
        div.getTxtFutanGendogakuNinteiTashoshitsu().clearValue();
    }

    public void set負担限度額認定エリア(FutanGendogakuNintei futanGendogakuNintei) {
        div.setHiddenRirekiNo(new RString(futanGendogakuNintei.get履歴番号()));
        div.getTxtFutanGendogakuNinteiKetteiKubun().setValue(futanGendogakuNintei.get決定区分() == null
                || futanGendogakuNintei.get決定区分().isEmpty()
                ? RString.EMPTY : KetteiKubun.toValue(futanGendogakuNintei.get決定区分()).get名称());
        div.getTxtFutanGendogakuNinteiShinseibi().setValue(futanGendogakuNintei.get申請年月日());
        div.getFutanGendogakuNinteiKetteibi().setValue(futanGendogakuNintei.get決定年月日());
        div.getTxtFutanGendogakuNinteiTekiyobi().setValue(futanGendogakuNintei.get適用開始年月日());
        div.getTxtFutanGendogakuNinteiYukoKigen().setValue(futanGendogakuNintei.get適用終了年月日());
        div.getTxtFutanGendogakuNinteiShoninShinsaiRiyu().setValue(futanGendogakuNintei.get非承認理由());
        div.getTxtFutanGendogakuNinteiShinseiRiyu().setValue(
                futanGendogakuNintei.get申請理由区分() == null || futanGendogakuNintei.get申請理由区分().isEmpty()
                ? RString.EMPTY : ShinseiRiyuKubun.toValue(futanGendogakuNintei.get申請理由区分()).get名称());
        div.getTxtFutanGendogakuNinteiFutanDankai().setValue(futanGendogakuNintei.get利用者負担段階());
        div.getTxtFutanGendogakuNinteiKyuSochi().setValue(futanGendogakuNintei.get旧措置者区分());
        div.getTxtFutanGendogakuNinteiKyokaiso().setValue(futanGendogakuNintei.is境界層該当者区分() ? 該当 : 非該当);
        div.getFutanGendogakuNinteiGekihenKanwa().setValue(futanGendogakuNintei.is激変緩和措置対象者区分() ? 対象者 : 対象者以外);
        div.getTxtFutanGendogakuNinteiShokuhi().setValue(futanGendogakuNintei.get食費負担限度額());
        div.getTxtFutanGendogakuNinteiUnitGataKoshitsu().setValue(futanGendogakuNintei.getユニット型個室());
        div.getTxtFutanGendogakuNinteiUnitGataJunkoshitsu().setValue(futanGendogakuNintei.getユニット型準個室());
        div.getTxtFutanGendogakuNinteiJuraigataKoshitsuTokuyo().setValue(futanGendogakuNintei.get従来型個室_特養等());
        div.getTxtFutanGendogakuNinteiJuraigataKoshitsuRoken().setValue(futanGendogakuNintei.get従来型個室_老健_療養等());
        div.getTxtFutanGendogakuNinteiTashoshitsu().setValue(futanGendogakuNintei.get多床室());
    }

    private void クリア訪問介護利用者負担額減額エリア() {
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuKetteiKubun().clearValue();
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuShinseibi().clearValue();
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuKetteibi().clearValue();
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuTekiyobi().clearValue();
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuYukoKigen().clearValue();
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuShoninShinaiRiyu().clearValue();
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuHobetsuKubun().clearValue();
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuKyufuritsu().clearValue();
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuKohiJukyushaNo().clearValue();
    }

    public void set訪問介護利用者負担額減額エリア(HomonKaigoRiyoshaFutangakuGengaku homonKaigoRiyoshaFutangakuGengaku) {
        div.setHiddenRirekiNo(new RString(homonKaigoRiyoshaFutangakuGengaku.get履歴番号()));
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuKetteiKubun().setValue(homonKaigoRiyoshaFutangakuGengaku.get決定区分() == null
                || homonKaigoRiyoshaFutangakuGengaku.get決定区分().isEmpty()
                ? RString.EMPTY : KetteiKubun.toValue(homonKaigoRiyoshaFutangakuGengaku.get決定区分()).get名称());
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuShinseibi().setValue(homonKaigoRiyoshaFutangakuGengaku.get申請年月日());
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuKetteibi().setValue(homonKaigoRiyoshaFutangakuGengaku.get決定年月日());
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuTekiyobi().setValue(homonKaigoRiyoshaFutangakuGengaku.get適用開始年月日());
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuYukoKigen().setValue(homonKaigoRiyoshaFutangakuGengaku.get適用終了年月日());
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuShoninShinaiRiyu().setValue(homonKaigoRiyoshaFutangakuGengaku.get非承認理由());
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuHobetsuKubun().setValue(homonKaigoRiyoshaFutangakuGengaku.get法別区分());
        if (homonKaigoRiyoshaFutangakuGengaku.get給付率() != null) {
            div.getTxtHomonKaigoRiyoshaFutangakuGengakuKyufuritsu().setValue(new RString(homonKaigoRiyoshaFutangakuGengaku.get給付率().getColumnValue().toString()));
        }
        div.getTxtHomonKaigoRiyoshaFutangakuGengakuKohiJukyushaNo().setValue(homonKaigoRiyoshaFutangakuGengaku.get公費受給者番号());
    }

    private void クリア社会福祉法人等利用者負担軽減エリア() {
        div.getTxtShafukuHojinToRiyushaFutanKeigenKetteiKubun().clearValue();
        div.getTxtShafukuHojinToRiyushaFutanKeigenShinseibi().clearValue();
        div.getTxtShafukuHojinToRiyushaFutanKeigenKetteibi().clearValue();
        div.getTxtShafukuHojinToRiyushaFutanKeigenTekiyobi().clearValue();
        div.getTxtShafukuHojinToRiyushaFutanKeigenYukoKigen().clearValue();
        div.getTxtShafukuHojinToRiyushaFutanKeigenShoninShinaiRiyu().clearValue();
        div.getTxtShafukuHojinToRiyushaFutanKeigenKeigenJiyu().clearValue();
        div.getTxtShafukuHojinToRiyushaFutanKeigenKeigenritsu().clearValue();
        div.getTxtShafukuHojinToRiyushaFutanKeigenKakuninNo().clearValue();
        div.getTxtShafukuHojinToRiyushaFutanKeigenKyotakuServiceGentei().clearValue();
        div.getTxtShafukuHojinToRiyushaFutanKeigenKyojuhiShokuhiGentei().clearValue();
        div.getTxtShafukuHojinToRiyushaFutanKeigenKyuSothishaUnitgataKoshitsuGentei().clearValue();
    }

    public void set社会福祉法人等利用者負担軽減エリア(ShakaifukuRiyoshaFutanKeigen shakaifukuRiyoshaFutanKeigen) {
        div.setHiddenRirekiNo(new RString(shakaifukuRiyoshaFutanKeigen.get履歴番号()));
        div.getTxtShafukuHojinToRiyushaFutanKeigenKetteiKubun().setValue(shakaifukuRiyoshaFutanKeigen.get決定区分() == null
                || shakaifukuRiyoshaFutanKeigen.get決定区分().isEmpty()
                ? RString.EMPTY : KetteiKubun.toValue(shakaifukuRiyoshaFutanKeigen.get決定区分()).get名称());
        div.getTxtShafukuHojinToRiyushaFutanKeigenShinseibi().setValue(shakaifukuRiyoshaFutanKeigen.get申請年月日());
        div.getTxtShafukuHojinToRiyushaFutanKeigenKetteibi().setValue(shakaifukuRiyoshaFutanKeigen.get決定年月日());
        div.getTxtShafukuHojinToRiyushaFutanKeigenTekiyobi().setValue(shakaifukuRiyoshaFutanKeigen.get適用開始年月日());
        div.getTxtShafukuHojinToRiyushaFutanKeigenYukoKigen().setValue(shakaifukuRiyoshaFutanKeigen.get適用終了年月日());
        div.getTxtShafukuHojinToRiyushaFutanKeigenShoninShinaiRiyu().setValue(shakaifukuRiyoshaFutanKeigen.get非承認理由());
        div.getTxtShafukuHojinToRiyushaFutanKeigenKeigenJiyu().setValue(shakaifukuRiyoshaFutanKeigen.get申請事由());
        div.getTxtShafukuHojinToRiyushaFutanKeigenKeigenritsu().setValue(
                new RString(shakaifukuRiyoshaFutanKeigen.get軽減率_分子().toString().concat("/").
                        concat(shakaifukuRiyoshaFutanKeigen.get軽減率_分母().toString())));
        div.getTxtShafukuHojinToRiyushaFutanKeigenKakuninNo().setValue(shakaifukuRiyoshaFutanKeigen.get確認番号());
        div.getTxtShafukuHojinToRiyushaFutanKeigenKyotakuServiceGentei().setValue(shakaifukuRiyoshaFutanKeigen.is居宅サービス限定() ? 該当 : 非該当);
        div.getTxtShafukuHojinToRiyushaFutanKeigenKyojuhiShokuhiGentei().setValue(shakaifukuRiyoshaFutanKeigen.is居住費_食費のみ() ? 該当 : 非該当);
        div.getTxtShafukuHojinToRiyushaFutanKeigenKyuSothishaUnitgataKoshitsuGentei().setValue(shakaifukuRiyoshaFutanKeigen.is旧措置者ユニット型個室のみ() ? 該当 : 非該当);
    }

    private void クリア特別地域加算減免エリア() {
        div.getTxtTokubetsuChilkiKasanGenmenKetteiKubun().clearValue();
        div.getTxtTokubetsuChilkiKasanGenmenShinseibi().clearValue();
        div.getTxtTokubetsuChilkiKasanGenmenTekiyobi().clearValue();
        div.getTxtTokubetsuChilkiKasanGenmenShoninShinaiRiyu().clearValue();
        div.getTxtTokubetsuChilkiKasanGenmenKeigenritsu().clearValue();
        div.getTxtTokubetsuChilkiKasanGenmenKetteibi().clearValue();
        div.getTxtTokubetsuChilkiKasanGenmenYukoKigen().clearValue();
        div.getTxtTokubetsuChilkiKasanGenmenKakuninNo().clearValue();
    }

    public void set特別地域加算減免エリア(TokubetsuchiikiKasanGemmen tokubetsuchiikiKasanGemmen) {
        div.setHiddenRirekiNo(new RString(tokubetsuchiikiKasanGemmen.get履歴番号()));
        div.getTxtTokubetsuChilkiKasanGenmenKetteiKubun().setValue(tokubetsuchiikiKasanGemmen.get決定区分() == null
                || tokubetsuchiikiKasanGemmen.get決定区分().isEmpty()
                ? RString.EMPTY : KetteiKubun.toValue(tokubetsuchiikiKasanGemmen.get決定区分()).get名称());
        div.getTxtTokubetsuChilkiKasanGenmenShinseibi().setValue(tokubetsuchiikiKasanGemmen.get申請年月日());
        div.getTxtTokubetsuChilkiKasanGenmenTekiyobi().setValue(tokubetsuchiikiKasanGemmen.get適用開始年月日());
        div.getTxtTokubetsuChilkiKasanGenmenShoninShinaiRiyu().setValue(tokubetsuchiikiKasanGemmen.get非承認理由());
        if (tokubetsuchiikiKasanGemmen.get減額率() != null) {
            div.getTxtTokubetsuChilkiKasanGenmenKeigenritsu().setValue(new RString(tokubetsuchiikiKasanGemmen.get減額率().getColumnValue().toString()));
        }
        div.getTxtTokubetsuChilkiKasanGenmenKetteibi().setValue(tokubetsuchiikiKasanGemmen.get決定年月日());
        div.getTxtTokubetsuChilkiKasanGenmenYukoKigen().setValue(tokubetsuchiikiKasanGemmen.get適用終了年月日());
        div.getTxtTokubetsuChilkiKasanGenmenKakuninNo().setValue(tokubetsuchiikiKasanGemmen.get確認番号());
    }

    /**
     * 認定証と通知書パネルを設定します。
     *
     * @param 決定区分 決定区分
     * @param 認定証title 認定証パネルのタイトル
     * @param 通知書title 通知書パネルのタイトル
     */
    public void set認定証と通知書(RString 決定区分, RString 認定証title, RString 通知書title) {
        div.getTsuchishoSakuseiKobetsu().getNinteiShoKobetsu().setDisplayNone(false);
        div.getTsuchishoSakuseiKobetsu().getNinteiShoKobetsu().setTitle(認定証title);
        if (KetteiKubun.承認する.getコード().equals(決定区分)) {
            div.getTsuchishoSakuseiKobetsu().getNinteiShoKobetsu().setDisabled(false);
            div.getTsuchishoSakuseiKobetsu().getNinteiShoKobetsu().setIsPublish(true);
            div.getTsuchishoSakuseiKobetsu().getNinteiShoKobetsu().getTxtKetteiTsuchiHakkoYMD().setDisabled(false);
            div.getTsuchishoSakuseiKobetsu().getNinteiShoKobetsu().getTxtKetteiTsuchiHakkoYMD().setValue(new FlexibleDate(RDate.getNowDate().toDateString()));
        } else {
            div.getTsuchishoSakuseiKobetsu().getNinteiShoKobetsu().setDisabled(true);
            div.getTsuchishoSakuseiKobetsu().getNinteiShoKobetsu().setIsPublish(false);
            div.getTsuchishoSakuseiKobetsu().getNinteiShoKobetsu().getTxtKetteiTsuchiHakkoYMD().setDisabled(true);
            div.getTsuchishoSakuseiKobetsu().getNinteiShoKobetsu().getTxtKetteiTsuchiHakkoYMD().clearValue();
        }

        div.getTsuchishoSakuseiKobetsu().getHenkoTsuchiKobetsu().setDisplayNone(false);
        div.getTsuchishoSakuseiKobetsu().getHenkoTsuchiKobetsu().setTitle(通知書title);
        div.getTsuchishoSakuseiKobetsu().getHenkoTsuchiKobetsu().setIsPublish(true);
        div.getTsuchishoSakuseiKobetsu().getHenkoTsuchiKobetsu().getTxtHenkoTsuchiHakkoYMD().setValue(new FlexibleDate(RDate.getNowDate().toDateString()));
        // TODO #90825 文書番号
    }

    /**
     * 介護保険負担限度額認定のenumクラスです。
     */
    public enum HihokenshashoHakkoTaishosha {

        /**
         * 減免減額種類
         */
        減免減額種類,
        /**
         * 利用者負担額減額List
         */
        利用者負担額減額List,
        /**
         * 負担限度額認定List
         */
        負担限度額認定List,
        /**
         * 社会福祉法人等利用者負担軽減List
         */
        社会福祉法人等利用者負担軽減List,
        /**
         * 訪問介護利用者負担額減額List
         */
        訪問介護利用者負担額減額List,
        /**
         * 特別地域加算減免
         */
        特別地域加算減免List;
    }

}
