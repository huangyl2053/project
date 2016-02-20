/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.handler.dbc0810025;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.basic.ShokanTokuteiNyushoshaKaigoServiceHiyo;
import jp.co.ndensan.reams.db.dbc.definition.core.shikyufushikyukubun.ShikyuFushikyuKubun;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810025.TokuteiNyushoshaHiyoDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810025.dgdTokuteiYichiran_Row;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.shokanbaraijyokyoshokai.ShikibetsuNoKanriEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 償還払い状況照会_特定入所者費用のハンドラクラスです。
 *
 * @author wangkanglei
 */
public class TokuteiNyushoshaHiyoHandler {

    private final TokuteiNyushoshaHiyoDiv div;
    private static final RString 設定不可 = new RString("0");
    private static final RString 設定可_任意 = new RString("2");
    private static final FlexibleYearMonth 平成２４年４月 = new FlexibleYearMonth("201204");

    public TokuteiNyushoshaHiyoHandler(TokuteiNyushoshaHiyoDiv div) {
        this.div = div;
    }

    public void setヘッダーエリア(
            FlexibleYearMonth サービス年月,
            JigyoshaNo 事業者番号,
            RString 申請日,
            RString 明細番号,
            RString 証明書) {
        div.getPanelHead().getTxtServiceTeikyoYM().setValue(new RDate(サービス年月.toString()));
        div.getPanelHead().getTxtShinseiYMD().setValue(new RDate(申請日.toString()));
        div.getPanelHead().getTxtJigyoshaBango().setValue(事業者番号.getColumnValue());
        div.getPanelHead().getTxtMeisaiBango().setValue(明細番号);
        div.getPanelHead().getTxtShomeisho().setValue(証明書);
    }

    public void setボタン表示制御処理(ShikibetsuNoKanriEntity shikibetsuNoKanriEntity, FlexibleYearMonth サービス年月) {

        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getKihonSetteiKubun())) {
            div.getPanelHead().getBtnKihonInfo().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getMeisaiSetteiKubun())) {
            div.getPanelHead().getBtnKyufuhiMeisai().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getTokuteiShinryoSetteiKubun())) {
            div.getPanelHead().getBtnTokuteiShinryouhi().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getKyotakuKeikakuSetteiKubun())) {
            div.getPanelHead().getBtnServiceKeikakuhi().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getShokujiHiyosetteiKubun())) {
            div.getPanelHead().getBtnShokujiHiyo().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getShukeiSetteiKubun())) {
            div.getPanelHead().getBtnSeikyugakuShukei().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getShakaifukushiKeigenSetteiKubun())) {
            div.getPanelHead().getBtnShafukukeigengaku().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getMeisaiJushochitokureiSetteiKubun())) {
            div.getPanelHead().getBtnKyufuhiMeisaiJyutoku().setDisabled(true);
        }
        if (設定可_任意.equals(shikibetsuNoKanriEntity.getEntity().getTokuteiShikkanSetteiKubun())
                && 平成２４年４月.isBeforeOrEquals(サービス年月)) {
            div.getPanelHead().getBtnKinkyujiShoteiShokan().setDisplayNone(false);
            div.getPanelHead().getBtnKinkyujiShoteiShokan().setVisible(true);
            div.getPanelHead().getBtnKinkyujiShisetsuRyoyo().setVisible(false);
            div.getPanelHead().getBtnKinkyujiShisetsuRyoyo().setDisplayNone(true);
        } else {
            div.getPanelHead().getBtnKinkyujiShoteiShokan().setVisible(false);
            if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getKinkyuShisetsuRyoyoSetteiKubun())) {
                div.getPanelHead().getBtnKinkyujiShisetsuRyoyo().setDisabled(true);
            }
        }
    }

    public void set特定入所者費用一覧グリッド(List<ShokanTokuteiNyushoshaKaigoServiceHiyo> list) {
        List<dgdTokuteiYichiran_Row> dataSource = new ArrayList<>();
        for (ShokanTokuteiNyushoshaKaigoServiceHiyo entity : list) {
            dgdTokuteiYichiran_Row row = new dgdTokuteiYichiran_Row();
            RStringBuilder builder = new RStringBuilder();
            builder.append(entity.getサービス種類コード().value()).append(entity.getサービス項目コード().value());
            row.setDefaultDataName1(builder.toRString());
            row.getDefaultDataName2().setValue(new Decimal(entity.get費用単価()));
            row.getDefaultDataName3().setValue(new Decimal(entity.get負担限度額()));
            row.getDefaultDataName4().setValue(new Decimal(entity.get日数()));
            row.getDefaultDataName5().setValue(new Decimal(entity.get費用額()));
            row.getDefaultDataName6().setValue(new Decimal(entity.get保険分請求額()));
            row.getDefaultDataName7().setValue(new Decimal(entity.get利用者負担額()));
            row.getTaniKingaku().setValue(new Decimal(entity.get点数_金額()));
            if (ShikyuFushikyuKubun.toValue(entity.get支給区分コード()) != null) {
                row.setShikyuKubun(ShikyuFushikyuKubun.toValue(entity.get支給区分コード()).get名称());
            }
            row.getShiharaiKingaku().setValue(new Decimal(entity.get支給金額()));
            row.getZogenTen().setValue(new Decimal(entity.get増減点()));
            dataSource.add(row);
        }
        div.getPanelTokutei().getDgdTokuteiYichiran().setDataSource(dataSource);
        set特定入所者費用一覧の合計エリア(list.get(0));
    }

    public void set特定入所者費用一覧の合計エリア(ShokanTokuteiNyushoshaKaigoServiceHiyo entity) {

        div.getPanelTokutei().getTxtHiyogakuTotal().setValue(new Decimal(entity.get費用額合計()));
        div.getPanelTokutei().getTxtHokenbunTotal().setValue(new Decimal(entity.get保険分請求額合計()));
        div.getPanelTokutei().getTxtRiyoshaFutangakuTotal().setValue(new Decimal(entity.get利用者負担額合計()));
    }

    public void set特定入所者費用照会パネル() {
        dgdTokuteiYichiran_Row row = div.getPanelTokutei().getDgdTokuteiYichiran().getClickedItem();
        RString serviceCodeShuruyi = new RString(row.getDefaultDataName1().subSequence(0, 2).toString());
        RString serviceCodeKoumoku = new RString(row.getDefaultDataName1().subSequence(2, 6).toString());
        // TODOサービスコード取得
//        List<ServiceCode> serviceCode = ServiceCodeInput.getServiceCodeList(serviceCodeShuruyi, serviceCodeKoumoku,
//        ViewStateHolder.get(ViewStateKeys.サービス年月, FlexibleYearMonth.class));
        div.getPanelTokutei().getPanelMeisai().getTxtServiceCodeShuruyi().setValue(serviceCodeShuruyi);
        div.getPanelTokutei().getPanelMeisai().getTxtServiceCodeKoumoku().setValue(serviceCodeKoumoku);
        // TODO
        div.getPanelTokutei().getPanelMeisai().getTxtServiceName().setValue(new RString("サービス名称"));
        div.getPanelTokutei().getPanelMeisai().getTxtHyojyuntanka().setValue(row.getDefaultDataName2().getValue());
        div.getPanelTokutei().getPanelMeisai().getTxtFutangenndogaku().setValue(row.getDefaultDataName3().getValue());
        div.getPanelTokutei().getPanelMeisai().getTxtNisu().setValue(row.getDefaultDataName4().getValue());
        div.getPanelTokutei().getPanelMeisai().getTxtHiyogaku().setValue(row.getDefaultDataName5().getValue());
        div.getPanelTokutei().getPanelMeisai().getTxtHokenbun().setValue(row.getDefaultDataName6().getValue());
        div.getPanelTokutei().getPanelMeisai().getTxtRiyoshafutangaku().setValue(row.getDefaultDataName7().getValue());
        div.getPanelTokutei().getPanelMeisai().getTxtTanyiGaku().setValue(row.getTaniKingaku().getValue());
        div.getPanelTokutei().getPanelMeisai().getTxtShikyukubun().setValue(row.getShikyuKubun());
        div.getPanelTokutei().getPanelMeisai().getTxtShiharaiGaku().setValue(row.getShiharaiKingaku().getValue());
        div.getPanelTokutei().getPanelMeisai().getTxtZogenten().setValue(row.getZogenTen().getValue());
    }
}
