/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.handler.dbc0810023;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.basic.ShokanTokuteiShinryoTokubetsuRyoyo;
import jp.co.ndensan.reams.db.dbc.business.core.basic.ShokanTokuteiShinryohi;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810023.TokuteiShinryohiDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810023.ddgToteishinryoTokubetushinryo_Row;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810023.dgdTokuteiShinryohi_Row;
import jp.co.ndensan.reams.db.dbc.divcontroller.viewbox.ViewStateKeys;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7120TokuteiShinryoServiceCodeEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.shokanbaraijyokyoshokai.ShikibetsuNoKanriEntity;
import jp.co.ndensan.reams.db.dbc.service.core.shokanbaraijyokyoshokai.ShokanbaraiJyokyoShokai;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.CodeShubetsu;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;
import jp.co.ndensan.reams.uz.uza.util.code.CodeMaster;
import jp.co.ndensan.reams.uz.uza.util.code.entity.UzT0007CodeEntity;
import jp.co.ndensan.reams.uz.uza.util.editor.DecimalFormatter;

/**
 * 償還払い状況照会_特定診療費画面のハンドラクラスです。
 *
 * @author wangkanglei
 */
public class TokuteiShinryohiHandler {

    private final TokuteiShinryohiDiv div;
    private static final RString 設定不可 = new RString("0");
    private static final RString 単位 = new RString("単位");
    private static final RString 回まで = new RString("回まで");
    private static final RString 設定可_任意 = new RString("2");
    private static final FlexibleYearMonth 平成２４年４月 = new FlexibleYearMonth("201204");
    private static final RString 改行 = new RString("\n");

    public TokuteiShinryohiHandler(TokuteiShinryohiDiv div) {
        this.div = div;
    }

    public void setヘッダーエリア(
            FlexibleYearMonth サービス年月,
            JigyoshaNo 事業者番号,
            RString 申請日,
            RString 明細番号,
            RString 証明書) {
        div.getPanelTwo().getTxtServiceTeikyoYM().setValue(new RDate(サービス年月.toString()));
        div.getPanelTwo().getTxtShinseiYMD().setValue(new RDate(申請日.toString()));
        div.getPanelTwo().getTxtJigyoshaBango().setValue(事業者番号.getColumnValue());
        div.getPanelTwo().getTxtMeisaibango().setValue(明細番号);
        div.getPanelTwo().getTxtShomeisho().setValue(証明書);
    }

    public void setボタン表示制御処理(ShikibetsuNoKanriEntity shikibetsuNoKanriEntity, FlexibleYearMonth サービス年月) {

        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getKihonSetteiKubun())) {
            div.getPanelTwo().getBtnKihoninfo().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getMeisaiSetteiKubun())) {
            div.getPanelTwo().getBtnKyufuMeisai().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getKyotakuKeikakuSetteiKubun())) {
            div.getPanelTwo().getBtnServiceKeikakuhi().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getTokuteinyushoshaSetteiKubun())) {
            div.getPanelTwo().getBtnTokuteinyushosha().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getShokujiHiyosetteiKubun())) {
            div.getPanelTwo().getBtnShokujihiyo().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getShukeiSetteiKubun())) {
            div.getPanelTwo().getBtnSeikyugaku().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getShakaifukushiKeigenSetteiKubun())) {
            div.getPanelTwo().getBtnShafuku().setDisabled(true);
        }
        if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getMeisaiJushochitokureiSetteiKubun())) {
            div.getPanelTwo().getBtnKyufuhiMeisaiJyutoku().setDisabled(true);
        }
        if (設定可_任意.equals(shikibetsuNoKanriEntity.getEntity().getTokuteiShikkanSetteiKubun())
                && 平成２４年４月.isBeforeOrEquals(サービス年月)) {
            div.getPanelTwo().getBtnKinkyujiShoteiShokan().setDisplayNone(false);
            div.getPanelTwo().getBtnKinkyujiShoteiShokan().setVisible(true);
            div.getPanelTwo().getBtnKinkyujiShisetsu().setVisible(false);
            div.getPanelTwo().getBtnKinkyujiShisetsu().setDisplayNone(true);
        } else {
            div.getPanelTwo().getBtnKinkyujiShoteiShokan().setVisible(false);
            if (設定不可.equals(shikibetsuNoKanriEntity.getEntity().getKinkyuShisetsuRyoyoSetteiKubun())) {
                div.getPanelTwo().getBtnKinkyujiShisetsu().setDisabled(true);
            }
        }
    }

    public void set特定診療費_特別診療費一覧グリッド(List<ShokanTokuteiShinryoTokubetsuRyoyo> list) {
        List<dgdTokuteiShinryohi_Row> dataSource = new ArrayList<>();
        for (ShokanTokuteiShinryoTokubetsuRyoyo entity : list) {
            dgdTokuteiShinryohi_Row row = new dgdTokuteiShinryohi_Row();
            row.setShobyoName(entity.get傷病名());
            row.setShikibetsuNo(entity.get識別番号());
            row.setTani(DecimalFormatter.toコンマ区切りRString(entity.get単位数(), 0));
            row.setKaisu(DecimalFormatter.toコンマ区切りRString(entity.get回数(), 0));
            row.setGokeiTani(DecimalFormatter.toコンマ区切りRString(new Decimal(entity.get合計単位数()), 0));
            row.setRemban(entity.get連番());
            dataSource.add(row);
        }
        div.getPanelThree().getDgdTokuteiShinryohi().setDataSource(dataSource);
    }

    public void set特定診療費一覧グリッド(List<ShokanTokuteiShinryohi> shokanTokuteiShinryohiList) {
        List<ddgToteishinryoTokubetushinryo_Row> dataSource = new ArrayList<>();
        for (ShokanTokuteiShinryohi entity : shokanTokuteiShinryohiList) {
            ddgToteishinryoTokubetushinryo_Row row = new ddgToteishinryoTokubetushinryo_Row();
            row.setShobyouName(entity.get傷病名());
            row.setShidouKanri(DecimalFormatter.toコンマ区切りRString(new Decimal(entity.get指導管理料等単位数()), 0));
            row.setRihabiri(DecimalFormatter.toコンマ区切りRString(new Decimal(entity.getリハビリテーション単位数()), 0));
            row.setSeishinka(DecimalFormatter.toコンマ区切りRString(new Decimal(entity.get精神科専門療法単位数()), 0));
            row.setXLine(DecimalFormatter.toコンマ区切りRString(new Decimal(entity.get単純エックス線単位数()), 0));
            row.setSochi(DecimalFormatter.toコンマ区切りRString(new Decimal(entity.get措置単位数()), 0));
            row.setTejyutsu(DecimalFormatter.toコンマ区切りRString(new Decimal(entity.get手術単位数()), 0));
            row.setGoukeyiTanyi(DecimalFormatter.toコンマ区切りRString(new Decimal(entity.get合計単位数()), 0));
            row.setRemban(entity.get連番());
            dataSource.add(row);
        }
        div.getPanelThree().getDdgToteishinryoTokubetushinryo().setDataSource(dataSource);
    }

    public void set特定診療費_特別診療費パネル(List<ShokanTokuteiShinryoTokubetsuRyoyo> list,
            FlexibleYearMonth サービス年月) {

        ShokanTokuteiShinryoTokubetsuRyoyo entity = list.get(0);
        DbT7120TokuteiShinryoServiceCodeEntity serviceCode = ShokanbaraiJyokyoShokai.createInstance()
                .getTokuteiShinryoServiceCodeInfo(
                        new ShikibetsuCode(entity.get識別番号()),
                        サービス年月,
                        ViewStateHolder.get(ViewStateKeys.様式番号, RString.class));
        div.getPanelThree().getPanelFive().getTxtShobyoMeiDown().setValue(entity.get傷病名());
        div.getPanelThree().getPanelFive().getTxtShikibetsuNo().setValue(entity.get識別番号());
        div.getPanelThree().getPanelFive().getTxtName().setValue(serviceCode.getServiceMeisho());
        UzT0007CodeEntity code1 = CodeMaster.getCode(SubGyomuCode.DBC介護給付, new CodeShubetsu(new RString("0025")),
                new Code(serviceCode.getSanteiTani()));
        RStringBuilder builder1 = new RStringBuilder();
        builder1.append(code1.getコード名称());
        builder1.append(serviceCode.getTaniSu());
        builder1.append(単位);
        div.getPanelThree().getPanelFive().getLblComment1().setText(builder1.toRString());
        UzT0007CodeEntity code2 = CodeMaster.getCode(SubGyomuCode.DBC介護給付, new CodeShubetsu(new RString("0026")),
                new Code(serviceCode.getSanteiSeiyakuKikan()));
        RStringBuilder builder2 = new RStringBuilder();
        builder2.append(code2.getコード名称());
        builder2.append(serviceCode.getSanteiSeiyakuKaisu());
        builder2.append(回まで);
        div.getPanelThree().getPanelFive().getLblComment2().setText(builder2.toRString());
        div.getPanelThree().getPanelFive().getTxtTanyi().setValue(DecimalFormatter.toコンマ区切りRString(entity.get単位数(), 0));
        div.getPanelThree().getPanelFive().getTxtKaiyisuNisu().setValue(entity.get回数());
        div.getPanelThree().getPanelFive().getTxtGoukeiTanyi().setValue(new Decimal(entity.get合計単位数()));
        div.getPanelThree().getPanelFive().getTxtTekiyoDown().setValue(entity.get摘要());
    }

    public void set特定診療費パネル(List<ShokanTokuteiShinryohi> list) {
        ShokanTokuteiShinryohi entity = list.get(0);
        div.getPanelThree().getPanelFour().getTxtShobyoMei().setValue(entity.get傷病名());
        div.getPanelThree().getPanelFour().getTxtShidouKanri().setValue(new Decimal(entity.get指導管理料等単位数()));
        div.getPanelThree().getPanelFour().getTxtRibabiriteishon().setValue(new Decimal(entity.getリハビリテーション単位数()));
        div.getPanelThree().getPanelFour().getTxtSeishinkaSenmon().setValue(new Decimal(entity.get精神科専門療法単位数()));
        div.getPanelThree().getPanelFour().getTxtTanjyunXline().setValue(new Decimal(entity.get単純エックス線単位数()));
        div.getPanelThree().getPanelFour().getTxtSochi().setValue(new Decimal(entity.get措置単位数()));
        div.getPanelThree().getPanelFour().getTxtTejyutsu().setValue(new Decimal(entity.get手術単位数()));
        div.getPanelThree().getPanelFour().getTxtGoukei().setValue(new Decimal(entity.get合計単位数()));
        RStringBuilder builder = new RStringBuilder();
        builder.append(entity.get摘要１()).append(改行);
        builder.append(entity.get摘要２()).append(改行);
        builder.append(entity.get摘要３()).append(改行);
        builder.append(entity.get摘要４()).append(改行);
        builder.append(entity.get摘要５()).append(改行);
        builder.append(entity.get摘要６()).append(改行);
        builder.append(entity.get摘要７()).append(改行);
        builder.append(entity.get摘要８()).append(改行);
        builder.append(entity.get摘要９()).append(改行);
        builder.append(entity.get摘要１０()).append(改行);
        builder.append(entity.get摘要１１()).append(改行);
        builder.append(entity.get摘要１２()).append(改行);
        builder.append(entity.get摘要１３()).append(改行);
        builder.append(entity.get摘要１４()).append(改行);
        builder.append(entity.get摘要１５()).append(改行);
        builder.append(entity.get摘要１６()).append(改行);
        builder.append(entity.get摘要１７()).append(改行);
        builder.append(entity.get摘要１８()).append(改行);
        builder.append(entity.get摘要１９()).append(改行);
        builder.append(entity.get摘要２０());
        div.getPanelThree().getPanelFour().getTxtMutiTekiyo().setValue(builder.toRString());
    }
}
