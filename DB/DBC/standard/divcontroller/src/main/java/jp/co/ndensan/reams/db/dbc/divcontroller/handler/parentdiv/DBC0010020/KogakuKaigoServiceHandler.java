/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.handler.parentdiv.DBC0010020;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.basic.KyufujissekiKogakuKaigoServicehi;
import jp.co.ndensan.reams.db.dbc.business.core.basic.ShikibetsuNoKanri;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0010020.KogakuKaigoServiceMainDiv;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.NyuryokuShikibetsuNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.editor.DecimalFormatter;

/**
 * 給付実績照会の高額介護サービス費のHandlerです
 *
 * @reamsid_L DBC-2970-120 guoqilin
 */
public class KogakuKaigoServiceHandler {

    private final KogakuKaigoServiceMainDiv div;
    private static final RString ZERO = new RString("0");
    private static final int INT_ZERO = 0;
    private static final RString 前月 = new RString("前月");

    /**
     * コンストラクタです。
     *
     * @param div KogakuKaigoServiceMainDiv
     */
    public KogakuKaigoServiceHandler(KogakuKaigoServiceMainDiv div) {
        this.div = div;
    }

    /**
     * 高額介護サービス費等選別
     *
     * @param 高額介護サービス費等 高額介護サービス費等
     * @param サービス提供年月 サービス提供年月
     */
    public void set給付実績高額介護サービス費データ(List<KyufujissekiKogakuKaigoServicehi> 高額介護サービス費等, FlexibleYearMonth サービス提供年月) {
        List<KyufujissekiKogakuKaigoServicehi> 高額介護サービス費リスト = new ArrayList<>();
        if (高額介護サービス費等 != null && !高額介護サービス費等.isEmpty()) {
            this.setGetsuBtn(高額介護サービス費等, サービス提供年月);
            for (KyufujissekiKogakuKaigoServicehi 高額介護サービス費 : 高額介護サービス費等) {
                if (サービス提供年月 != null && サービス提供年月.compareTo(高額介護サービス費.getサービス提供年月()) == 0) {
                    高額介護サービス費リスト.add(高額介護サービス費);
                }
            }
            div.getCcdKyufuJissekiHeader().setサービス提供年月(new RDate(to日期変換(サービス提供年月).toString()));
        }
        if (!高額介護サービス費リスト.isEmpty()) {
            this.setData(高額介護サービス費リスト.get(INT_ZERO));
        } else {
            div.getBtnZengetsu().setDisabled(true);
            div.getBtnJigetsu().setDisabled(true);
        }
    }

    private void setData(KyufujissekiKogakuKaigoServicehi 高額介護サービス費) {
        div.getTxtKogakuKaigoServicehiKetteiYMD().setValue(to日期変換(高額介護サービス費.get決定年月日()));
        div.getTxtKogakuKaigoServicehiUketsukeYMD().setValue(to日期変換(高額介護サービス費.get受付年月日()));
        div.getTxtKogakuKaigoServicehiShinsaYM().setValue(to日期変換(高額介護サービス費.get審査年月()));
        div.getTxtKogakuKaigoServicehiSofuYM().setValue(to日期変換(高額介護サービス費.get送付年月()));
        div.getTxtKogakuKaigoServicehiRiyoshaFutangaku().setValue(get金額(高額介護サービス費.get利用者負担額()));
        div.getTxtKogakuKaigoServicehiShikyugaku().setValue(get金額(高額介護サービス費.get支給額()));
        div.getTxtKogakuKaigoServicehiKohi1FutanshaNo().setValue(get負担番号(高額介護サービス費.get公費１負担番号()));
        div.getTxtKogakuKaigoServicehiKohi2FutanshaNo().setValue(get負担番号(高額介護サービス費.get公費２負担番号()));
        div.getTxtKogakuKaigoServicehiKohi3FutanshaNo().setValue(get負担番号(高額介護サービス費.get公費３負担番号()));
        div.getTxtKogakuKaigoServicehiKohi1Futangaku().setValue(get金額(高額介護サービス費.get公費１負担額()));
        div.getTxtKogakuKaigoServicehiKohi2Futangaku().setValue(get金額(高額介護サービス費.get公費２負担額()));
        div.getTxtKogakuKaigoServicehiKohi3Futangaku().setValue(get金額(高額介護サービス費.get公費３負担額()));
        div.getTxtKogakuKaigoServicehiKohi1Shikyugaku().setValue(get金額(高額介護サービス費.get公費１支給額()));
        div.getTxtKogakuKaigoServicehiKohi2Shikyugaku().setValue(get金額(高額介護サービス費.get公費２支給額()));
        div.getTxtKogakuKaigoServicehiKohi3Shikyugaku().setValue(get金額(高額介護サービス費.get公費３支給額()));
    }

    /**
     *
     * 制御性設定です。
     *
     * @param 識別番号管理データ 識別番号
     */
    public void clear制御性(ShikibetsuNoKanri 識別番号管理データ) {
        div.getBtnKogakuKaigoService().setDisabled(true);
        if (ZERO.equals(識別番号管理データ.get基本設定区分())) {
            div.getBtnKihon().setDisabled(true);
        } else {
            div.getBtnKihon().setDisabled(false);
        }
        if (ZERO.equals(識別番号管理データ.get明細設定区分())) {
            div.getBtnMeisaiShukei().setDisabled(true);
        } else {
            div.getBtnMeisaiShukei().setDisabled(false);
        }
        if (ZERO.equals(識別番号管理データ.get食事費用設定区分())) {
            div.getBtnShokuji().setDisabled(true);
        } else {
            div.getBtnShokuji().setDisabled(false);
        }
        if (ZERO.equals(識別番号管理データ.get福祉用具購入費設定区分())) {
            div.getBtnFukushiYoguKonyu().setDisabled(true);
        } else {
            div.getBtnFukushiYoguKonyu().setDisabled(false);
        }
        if (ZERO.equals(識別番号管理データ.get特定入所者設定区分())) {
            div.getBtnTokuteiNyushosha().setDisabled(true);
        } else {
            div.getBtnTokuteiNyushosha().setDisabled(false);
        }
        if (ZERO.equals(識別番号管理データ.get特定診療費設定区分())) {
            div.getBtnTokuteiShinryo().setDisabled(true);
        } else {
            div.getBtnTokuteiShinryo().setDisabled(false);
        }
        if (ZERO.equals(識別番号管理データ.get居宅計画費設定区分())) {
            div.getBtnKyotakuServiceKeikaku().setDisabled(true);
        } else {
            div.getBtnKyotakuServiceKeikaku().setDisabled(false);
        }
        if (ZERO.equals(識別番号管理データ.get住宅改修費設定区分())) {
            div.getBtnJutakuKaishu().setDisabled(true);
        } else {
            div.getBtnJutakuKaishu().setDisabled(false);
        }
        if (ZERO.equals(識別番号管理データ.getケアマネジメント設定区分())) {
            div.getBtnCareManagement().setDisabled(true);
        } else {
            div.getBtnCareManagement().setDisabled(false);
        }
        if (ZERO.equals(識別番号管理データ.get社会福祉法人軽減設定区分())) {
            div.getBtnShafukuKeigen().setDisabled(true);
        } else {
            div.getBtnShafukuKeigen().setDisabled(false);
        }
        if (ZERO.equals(識別番号管理データ.get所定疾患施設療養設定区分())) {
            div.getBtnShoteiShikkanShisetsuRyoyo().setDisabled(true);
        } else {
            div.getBtnShoteiShikkanShisetsuRyoyo().setDisabled(false);
        }
        if (ZERO.equals(識別番号管理データ.get緊急時施設療養設定区分())) {
            div.getBtnKinkyujiShisetsuRyoyo().setDisabled(true);
        } else {
            div.getBtnKinkyujiShisetsuRyoyo().setDisabled(false);
        }
    }

    /**
     * change年月です。
     *
     * @param data RString
     * @param 高額介護サービス費リスト List<KyufujissekiKogakuKaigoServicehi>
     * @param サービス提供年月 FlexibleYearMonth
     * @param 整理番号 RString
     * @param 被保険者番号 HihokenshaNo
     * @param 識別番号 NyuryokuShikibetsuNo
     */
    public void change年月(RString data, List<KyufujissekiKogakuKaigoServicehi> 高額介護サービス費リスト,
            FlexibleYearMonth サービス提供年月, RString 整理番号, HihokenshaNo 被保険者番号, NyuryokuShikibetsuNo 識別番号) {
        int index = INT_ZERO;
        List<FlexibleYearMonth> サービス提供年月リスト = getサービス提供年月リスト(高額介護サービス費リスト);
        Collections.sort(サービス提供年月リスト, new DateComparatorServiceTeikyoYM());
        for (int i = 0; i < サービス提供年月リスト.size(); i++) {
            if (サービス提供年月.equals(サービス提供年月リスト.get(i))) {
                index = i;
                break;
            }
        }
        FlexibleYearMonth 今提供年月;
        if (前月.equals(data)) {
            今提供年月 = サービス提供年月リスト.get(index + 1);
            div.getBtnJigetsu().setDisabled(false);
        } else {
            今提供年月 = サービス提供年月リスト.get(index - 1);
            div.getBtnZengetsu().setDisabled(false);

        }
        div.getCcdKyufuJissekiHeader().initialize(被保険者番号, 今提供年月, 整理番号, 識別番号);
        set給付実績高額介護サービス費データ(高額介護サービス費リスト, 今提供年月);
    }

    private List<FlexibleYearMonth> getサービス提供年月リスト(List<KyufujissekiKogakuKaigoServicehi> 高額介護サービス費リスト) {
        List<FlexibleYearMonth> サービス提供年月リスト = new ArrayList<>();
        for (KyufujissekiKogakuKaigoServicehi 高額介護サービス費 : 高額介護サービス費リスト) {
            FlexibleYearMonth 提供年月 = 高額介護サービス費.getサービス提供年月();
            if (!サービス提供年月リスト.contains(提供年月)) {
                サービス提供年月リスト.add(提供年月);
            }
        }
        return サービス提供年月リスト;
    }

    private void setGetsuBtn(List<KyufujissekiKogakuKaigoServicehi> 高額介護サービス費リスト, FlexibleYearMonth サービス提供年月) {
        List<FlexibleYearMonth> サービス提供年月リスト = getサービス提供年月リスト(高額介護サービス費リスト);
        div.getBtnZengetsu().setDisabled(true);
        div.getBtnJigetsu().setDisabled(true);
        if (サービス提供年月リスト != null && !サービス提供年月リスト.isEmpty()) {
            Collections.sort(サービス提供年月リスト, new DateComparatorServiceTeikyoYM());
            if (!サービス提供年月.isBeforeOrEquals(サービス提供年月リスト.get(サービス提供年月リスト.size() - 1))) {
                div.getBtnZengetsu().setDisabled(false);
            }
            if (!サービス提供年月リスト.get(INT_ZERO).isBeforeOrEquals(サービス提供年月)) {
                div.getBtnJigetsu().setDisabled(false);
            }
        }
    }

    private RString to日期変換(FlexibleDate 日期) {
        if (日期 != null && !日期.isEmpty()) {
            return 日期.wareki().toDateString();
        }
        return RString.EMPTY;
    }

    private RString to日期変換(FlexibleYearMonth 日期) {
        if (日期 != null && !日期.isEmpty()) {
            return 日期.wareki().toDateString();
        }
        return RString.EMPTY;
    }

    private RString get金額(int 金額) {
        if (金額 == 0) {
            return RString.EMPTY;
        } else {
            Decimal 金額変換 = new Decimal(金額);
            return DecimalFormatter.toコンマ区切りRString(金額変換, 0);
        }
    }

    private RString get負担番号(RString 負担番号) {
        if (負担番号 != null && !負担番号.isEmpty()) {
            return 負担番号;
        }
        return RString.EMPTY;
    }

    private static class DateComparatorServiceTeikyoYM implements Comparator<FlexibleYearMonth>, Serializable {

        private static final long serialVersionUID = -300796001015547240L;

        @Override
        public int compare(FlexibleYearMonth o1, FlexibleYearMonth o2) {
            return o2.compareTo(o1);
        }
    }

}