/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.jukyushajyufujissekidaicho;

import jp.co.ndensan.reams.db.dbc.entity.db.relate.jukyushajyufujissekidaicho.JukyushaKyufuJissekidaichoData;
import jp.co.ndensan.reams.db.dbc.entity.report.source.jukyushajyufujissekidaicho.JukyushaKyufuJissekidaichoReportSource;
import jp.co.ndensan.reams.db.dbz.definition.core.seibetsu.Seibetsu;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 受給者給付実績台帳 のEditorです。
 *
 * @reamsid_L DBC-3080-040 dangjingjing
 */
public class JukyushaKyufuJissekidaichoEditor implements IJukyushaKyufuJissekidaichoEditor {

    private final JukyushaKyufuJissekidaichoData data;

    /**
     * インスタンスを生成します。
     *
     * @param data JukyushaKyufuJissekidaichoData
     */
    protected JukyushaKyufuJissekidaichoEditor(JukyushaKyufuJissekidaichoData data) {
        this.data = data;
    }

    @Override
    public JukyushaKyufuJissekidaichoReportSource edit(JukyushaKyufuJissekidaichoReportSource source) {
        return editSource(source);
    }

    private JukyushaKyufuJissekidaichoReportSource editSource(JukyushaKyufuJissekidaichoReportSource source) {
        source.hokenshaCd = data.get保険者コード();
        source.hokenshaMei = data.get保険者名();
        source.pagecnt = data.getページ数();
        source.hihoNo = data.get被保険者番号();
        source.tsuchiNoPage = data.get被保険者毎ページ数();
        source.tsuchiNoAllPage = data.get被保険者毎総ページ数();
        source.hihoNameKana = data.get被保険者氏名カナ();
        source.jissekiKbnMei = data.get実績区分();
        source.umareYmd = data.get生年月日();
        if (!RString.isNullOrEmpty(data.get性別())) {
            source.seibetsu = Seibetsu.toValue(data.get性別()).get名称();
        } else {
            source.seibetsu = RString.EMPTY;
        }
        source.youKaigoKbnMei = data.get要介護度();
        source.ninYmdStEd = data.get認定有効期間();
        source.shoHokenshaNo = data.get証記載保険者番号();
        source.rokenCityNo = data.get老健市町村番号();
        source.rokenJukyuNo = data.get老健受給者番号();
        source.kyusochiKbnMei = data.get旧措置特例();
        source.keikokuKbnMei = data.get警告区分();
        source.shinsaYmKihon = data.get審査年月();
        source.hihoName = data.get被保険者氏名();
        source.juminCd = data.get住民コード();
        source.jushoCd = data.get住所コード();
        source.gyoseikuCd = data.get行政区コード();
        source.serviceYm = data.getサービス提供年月();
        source.kokiHokenshano = data.get後期高齢者資格情報_保険者番号();
        source.kokiHihokenshano = data.get後期高齢者資格情報_被保険者番号();
        source.kokuhoHokenshano = data.get国保資格情報_保険者番号();
        source.kokuhoHihokenshashono = data.get国保資格情報_被保険者証番号();
        source.kokuhoKojinno = data.get国保資格情報_個人番号();
        source.setaiCd = data.get世帯コード();
        source.jusho = data.get住所();
        source.gyoseiku = data.get行政区();
        source.kihon1Hdr = data.get決定前_特別療養費請求額_保険lbl();
        source.kihon3Hdr = data.get決定前_特定入所者介護費等請求額_保険lbl();
        source.kihon2Hdr = data.get決定後_特別療養費請求額_保険lbl();
        source.kihon4Hdr = data.get決定後_特定入所者介護費等請求額_保険lbl();
        source.maeHkFutan = data.get決定前_負担額_保険();
        source.serviceSakuseiKbn1 = data.getサービス計画作成1();
        source.serviceJigyoshoNo = data.get居宅サービス計画事業者();
        source.serJigyoshoMei1 = data.get居宅サービス計画事業者名1();
        source.maeHkServiceTen = data.get決定前_ｻｰﾋﾞｽ単位数_保険();
        source.maeHkSeikyu = data.get決定前_請求額_保険();
        source.maeHkRSSeikyu = data.get決定前_施設療養費請求額_保険();
        source.maeHkTokuSeikyu = data.get決定前_特別療養費請求額_保険();
        source.maeHkShokuSeikyu = data.get決定前_特定入所者介護費等請求額_保険();
        source.gaihakuNissu = data.get外泊日数();
        source.seiriNo = data.get整理番号();
        source.nyushoYmdStEd = data.get入所_院_期間();
        source.nyushoNissu = data.get入所_院_実日数();
        source.hkKyufuRitsu = data.get保険_給付率();
        source.serviceSakuseiKbn2 = data.getサービス計画作成2();
        source.serJigyoshoMei2 = data.get居宅サービス計画事業者名2();
        source.atoHkServiceTen = data.get決定後_ｻｰﾋﾞｽ単位数_保険();
        source.atoHkSeikyu = data.get決定後_請求額_保険();
        source.atoHkFutan = data.get決定後_負担額_保険();
        source.atoHkRSSeikyu = data.get決定後_施設療養費請求額_保険();
        source.atoHkTokuSeikyu = data.get決定後_特別療養費請求額_保険();
        source.atoHkShokuSeikyu = data.get決定後_特定入所者介護費等請求額_保険();
        source.maeK1ServiceTen = data.get決定前_サービス単位数_公費1();
        source.maeK1Seikyu = data.get決定前_請求額_公費1();
        source.maeK1Futan = data.get決定前_負担額_公費1();
        source.maeK1RSSeikyu = data.get決定前_施設療養費請求額_公費1();
        source.maeK1TokuSeikyu = data.get決定前_特別療養費請求額_公費1();
        source.maeK1ShokuSeikyu = data.get決定前_特定入所者介護費等請求額_公費1();
        source.youshiki = data.get出力様式();
        source.k1JukyushaNo = data.get公費受給者_公費1();
        source.k1KyufuRitsu = data.get給付率_公費1();
        source.k1FutanshaNo = data.get公費負担者_公費1();
        source.atoK1ServiceTen = data.get決定後_サービス単位数_公費1();
        source.atoK1Seikyu = data.get決定後_請求額_公費1();
        source.atoK1Futan = data.get決定後_負担額_公費1();
        source.atoK1RSSeikyu = data.get決定後_施設療養費請求額_公費1();
        source.atoK1TokuSeikyu = data.get決定後_特別療養費請求額_公費1();
        source.atoK1ShokuSeikyu = data.get決定後_特定入所者介護費等請求額_公費1();
        source.maeK2Seikyu = data.get決定前_請求額_公費2();
        source.maeK2Futan = data.get決定前_負担額_公費2();
        source.youshikiMei1 = data.get出力様式1();
        source.jigyoshoNo = data.getサービス事業者();
        source.maeK2ServiceTen = data.get決定前_サービス単位数_公費2();
        source.maeK2RSSeikyu = data.get決定前_施設療養費請求額_公費2();
        source.maeK2TokuSeikyu = data.get決定前_特別療養費請求額_公費2();
        source.maeK2ShokuSeikyu = data.get決定前_特定入所者介護費等請求額_公費2();
        source.k2JukyushaNo = data.get公費受給者_公費2();
        source.k2KyufuRitsu = data.get給付率_公費2();
        source.taishogoJotai = data.get退所_院_の状態();
        source.k2FutanshaNo = data.get公費負担者_公費2();
        source.youshikiMei2 = data.get出力様式2();
        source.jigyoshoMei = data.getサービス事業者名();
        source.atoK2ServiceTen = data.get決定後_サービス単位数_公費2();
        source.atoK2Seikyu = data.get決定後_請求額_公費2();
        source.atoK2Futan = data.get決定後_負担額_公費2();
        source.atoK2RSSeikyu = data.get決定後_施設療養費請求額_公費2();
        source.atoK2TokuSeikyu = data.get決定後_特別療養費請求額_公費2();
        source.atoK2ShokuSeikyu = data.get決定後_特定入所者介護費等請求額_公費2();
        source.maeK3ServiceTen = data.get決定前_サービス単位数_公費3();
        source.maeK3Seikyu = data.get決定前_請求額_公費3();
        source.maeK3Futan = data.get決定前_負担額_公費3();
        source.maeK3RSSeikyu = data.get決定前_施設療養費請求額_公費3();
        source.maeK3TokuSeikyu = data.get決定前_特別療養費請求額_公費3();
        source.maeK3ShokuSeikyu = data.get決定前_特定入所者介護費等請求額_公費3();
        source.k3KyufuRitsu = data.get給付率_公費3();
        source.serviceYmdStEd = data.getサービス期間();
        source.chushiriyuTitle = data.get中止理由タイトル();
        source.chushiRiyu = data.get中止理由();
        source.k3FutanshaNo = data.get公費負担者_公費3();
        source.k3JukyushaNo = data.get公費受給者_公費3();
        source.atoK3ServiceTen = data.get決定後_ｻｰﾋﾞｽ単位数_公費3();
        source.atoK3Seikyu = data.get決定後_請求額_公費3();
        source.atoK3Futan = data.get決定後_負担額_公費3();
        source.atoK3RSSeikyu = data.get決定後_施設療養費請求額_公費3();
        source.atoK3TokuSeikyu = data.get決定後_特別療養費請求額_公費3();
        source.atoK3ShokuSeikyu = data.get決定後_特定入所者介護費等請求額_公費3();
        source.maeKaiNichi1 = data.get決定前_日の回数1();
        source.maeSerTani1 = data.get決定前_サービス単位数1();
        source.maeK1KaiNichi1 = data.get決定前_日の回数1_公費1対象();
        source.maeK1SerTani1 = data.get決定前_サービス単位数1_公費1対象();
        source.maeTanisu1 = data.get決定前_単位数1();
        source.maeK2KaiNichi1 = data.get決定前_1日の回数1_公費2対象();
        source.maeK2SerTani1 = data.get決定前_サービス単位数1_公費2対象();
        source.maeK3KaiNichi1 = data.get決定前_日の回数1_公費3対象();
        source.maeK3SerTani1 = data.get決定前_サービス単位数1_公費3対象();
        source.serviceCd1 = data.getサービスコード1();
        source.kagoKaisuD1 = data.get過誤回数1_d();
        source.serviceMei1 = data.getサービス内容1();
        source.taniShikibetsu1 = data.get単位数識別1();
        source.tekiyo1 = data.get摘要1();
        source.saishinKaisuD1 = data.get再審査回数1_d();
        source.shinsaYmD1 = data.get審査年月1_d();
        source.atoTanisu1 = data.get決定後_単位数1();
        source.atoKaiNichi1 = data.get決定後_日の回数1();
        source.atoSerTani1 = data.get決定後_サービス単位数1();
        source.atoK1KaiNichi1 = data.get決定後_日の回数1_公費1対象();
        source.atoK1SerTani1 = data.get決定後_サービス単位数1_公費1対象();
        source.atoK2KaiNichi1 = data.get決定後_1日の回数1_公費2対象();
        source.atoK2SerTani1 = data.get決定後_サービス単位数1_公費2対象();
        source.atoK3KaiNichi1 = data.get決定後_日の回数1_公費3対象();
        source.atoK3SerTani1 = data.get決定後_サービス単位数1_公費3対象();
        source.maeTanisu2 = data.get決定前_単位数2();
        source.maeKaiNichi2 = data.get決定前_日の回数2();
        source.maeSerTani2 = data.get決定前_サービス単位数2();
        source.maeK1KaiNichi2 = data.get決定前_日の回数2_公費1対象();
        source.maeK1SerTani2 = data.get決定前_サービス単位数2_公費1対象();
        source.maeK2KaiNichi2 = data.get決定前_日の回数2_公費2対象();
        source.maeK2SerTani2 = data.get決定前_サービス単位数2_公費2対象();
        source.maeK3KaiNichi2 = data.get決定前_日の回数2_公費3対象();
        source.maeK3SerTani2 = data.get決定前_サービス単位数2_公費3対象();
        editSource1(source);
        editSource2(source);
        return source;
    }

    private void editSource1(JukyushaKyufuJissekidaichoReportSource source) {
        source.serviceCd2 = data.getサービスコードﾞ2_d();
        source.serviceMei2 = data.getサービス内容2_d();
        source.tekiyo2 = data.get摘要2();
        source.saishinKaisuD2 = data.get再審査回数2_d();
        source.kagoKaisuD2 = data.get過誤回数2_d();
        source.shinsaYmD2 = data.get審査年月2_d();
        source.taniShikibetsu2 = data.get単位数識別2();
        source.atoTanisu2 = data.get決定後_単位数2();
        source.atoKaiNichi2 = data.get決定後_日の回数2();
        source.atoSerTani2 = data.get決定後_サービス単位数2();
        source.atoK1KaiNichi2 = data.get決定後_日の回数2_公費1対象();
        source.atoK1SerTani2 = data.get決定後_サービス単位数2_公費1対象();
        source.atoK2KaiNichi2 = data.get決定後_日の回数2_公費2対象();
        source.atoK2SerTani2 = data.get決定後_サービス単位数2_公費2対象();
        source.atoK3KaiNichi2 = data.get決定後_日の回数2_公費3対象();
        source.atoK3SerTani2 = data.get決定後_サービス単位数2_公費3対象();
        source.maeTanisu3 = data.get決定前_単位数3();
        source.maeKaiNichi3 = data.get決定前_日の回数3();
        source.maeSerTani3 = data.get決定前_サービス単位数3();
        source.maeK1KaiNichi3 = data.get決定前_日の回数3_公費1対象();
        source.maeK1SerTani3 = data.get決定前_サービス単位数3_公費1対象();
        source.maeK2KaiNichi3 = data.get決定前_日の回数3_公費2対象();
        source.maeK2SerTani3 = data.get決定前_サービス単位数3_公費2対象();
        source.maeK3KaiNichi3 = data.get決定前_日の回数3_公費3対象();
        source.maeK3SerTani3 = data.get決定前_サービス単位数3_公費3対象();
        source.serviceCd3 = data.getサービスコードﾞ3_d();
        source.tekiyo3 = data.get摘要3();
        source.saishinKaisuD3 = data.get再審査回数3_d();
        source.kagoKaisuD3 = data.get過誤回数3_d();
        source.serviceMei3 = data.getサービス内容3_d();
        source.taniShikibetsu3 = data.get単位数識別3();
        source.shinsaYmD3 = data.get審査年月3_d();
        source.atoK2KaiNichi3 = data.get決定後_日の回数3_公費2対象();
        source.atoK3SerTani3 = data.get決定後_サービス単位数3_公費3対象();
        source.atoTanisu3 = data.get決定後_単位数3();
        source.atoKaiNichi3 = data.get決定後_日の回数3();
        source.atoSerTani3 = data.get決定後_サービス単位数3();
        source.atoK1KaiNichi3 = data.get決定後_日の回数3_公費1対象();
        source.atoK1SerTani3 = data.get決定後_サービス単位数3_公費1対象();
        source.atoK2SerTani3 = data.get決定後_サービス単位数3_公費2対象();
        source.atoK3KaiNichi3 = data.get決定後_日の回数3_公費3対象();
        source.maeKou1Nissu1 = data.get決定前_公費1日数1();
        source.maeKHiyougaku1 = data.get決定前_費用額1();
        source.kServicecd1 = data.getサービスコードﾞ1();
        source.maeKTanka1 = data.get決定前_費用単価1();
        source.maeKNissu1 = data.get決定前_日数1();
        source.maeKou2Nissu1 = data.get決定前_公費2日数1();
        source.maeKou3Nissu1 = data.get決定前_公費3日数1();
        source.maeKHknseikyu1 = data.get決定前_保険分請求額1();
        source.maeK1Hutangaku1 = data.get決定前_公費1負担額1();
        source.maeK2Hutangaku1 = data.get決定前_公費2負担額1();
        source.maeK3Hutangaku1 = data.get決定前_公費3負担額1();
        source.maeKHutangaku1 = data.get決定前_利用者負担額1();
        source.shinsaYmK1 = data.get審査年月1_k();
        source.kBango1 = data.get番号1();
        source.futanGendo1 = data.get負担限度額1();
        source.saishinKaisuK1 = data.get再審査回数1_k();
        source.kagoKaisuK1 = data.get過誤回数1_k();
        source.atoKNissu1 = data.get決定後_日数1();
        source.atoKou1Nissu1 = data.get決定後_公費1日数1();
        source.kServicemei1 = data.getサービス内容1_k();
        source.atoKTanka1 = data.get決定後_費用単価1();
        source.atoKou2Nissu1 = data.get決定後_公費2日数1();
        source.atoKou3Nissu1 = data.get決定後_公費3日数1();
        source.atoKHknseikyu1 = data.get決定後_保険分請求額1();
        source.atoK1Hutangaku1 = data.get決定後_公費1負担額1();
        source.atoK2Hutangaku1 = data.get決定後_公費2負担額1();
        source.atoK3Hutangaku1 = data.get決定後_公費3負担額1();
        source.atoKHutangaku1 = data.get決定後_利用者負担額1();
        source.kServicecd2 = data.getサービスコードﾞ2_k();
        source.maeKTanka2 = data.get決定前_費用単価2();
        source.maeKNissu2 = data.get決定前_日数2();
        source.maeKou1Nissu2 = data.get決定前_公費1日数2();
        source.maeKou2Nissu2 = data.get決定前_公費2日数2();
        source.maeKou3Nissu2 = data.get決定前_公費3日数2();
        source.maeKHiyougaku2 = data.get決定前_費用額2();
        source.maeKHknseikyu2 = data.get決定前_保険分請求額2();
        source.maeK1Hutangaku2 = data.get決定前_公費1負担額2();
        source.maeK2Hutangaku2 = data.get決定前_公費2負担額2();
        source.maeK3Hutangaku2 = data.get決定前_公費3負担額2();
        source.maeKHutangaku2 = data.get決定前_利用者負担額2();
        source.maeKeHiyogaku = data.get決定前_費用額合計_合計情報();
        source.maeKeSeikyugaku = data.get決定前_保険分請求額合計_合計情報();
        source.maeKeHutangaku = data.get決定前_利用者負担額合計_合計情報();
        source.maeKe2Hiyogaku = data.get決定前_費用額合計_合計情報公費2();
        source.maeKe2Seikyugaku = data.get決定前_保険分請求額合計_合計情報公費2();
        source.maeKe2Hutangaku = data.get決定前_利用者負担額合計_合計情報公費2();
        source.atoKHiyougaku1 = data.get決定後_費用額1();
        source.shinsaYmK2 = data.get審査年月2_k();
        source.kBango2 = data.get番号2();
        source.futanGendo2 = data.get負担限度額2();
        source.saishinKaisuK2 = data.get再審査回数2_k();
        source.kagoKaisuK2 = data.get過誤回数2_k();
        source.atoKNissu2 = data.get決定後_日数2();
        source.atoKou1Nissu2 = data.get決定後_公費1日数2();
        source.kServicemei2 = data.getサービス内容2_k();
        source.atoKTanka2 = data.get決定後_費用単価2();
        source.atoKou2Nissu2 = data.get決定後_公費2日数2();
        source.atoKou3Nissu2 = data.get決定後_公費3日数2();
        source.atoKHiyougaku2 = data.get決定後_費用額2();
        source.atoKHknseikyu2 = data.get決定後_保険分請求額2();
        source.atoK1Hutangaku2 = data.get決定後_公費1負担額2();
        source.atoK2Hutangaku2 = data.get決定後_公費2負担額2();
        source.atoK3Hutangaku2 = data.get決定後_公費3負担額2();
        source.atoKHutangaku2 = data.get決定後_利用者負担額2();
        source.atoKeHiyogaku = data.get決定後_費用額合計_合計情報();
        source.atoKeSeikyugaku = data.get決定後_保険分請求額合計_合計情報();
        source.atoKeHutangaku = data.get決定後_利用者負担額合計_合計情報();
        source.atoKe2Hiyogaku = data.get決定後_費用額合計_合計情報公費2();
        source.atoKe2Seikyugaku = data.get決定後_保険分請求額合計_合計情報公費2();
        source.atoKe2Hutangaku = data.get決定後_利用者負担額合計_合計情報公費2();
        source.kServicecd3 = data.getサービスコードﾞ3_k();
        source.maeKTanka3 = data.get決定前_費用単価3();
        source.maeKNissu3 = data.get決定前_日数3();
        source.maeKou1Nissu3 = data.get決定前_公費1日数3();
        source.maeKou2Nissu3 = data.get決定前_公費2日数3();
        source.maeKou3Nissu3 = data.get決定前_公費3日数3();
        source.maeKHiyougaku3 = data.get決定前_費用額3();
        source.maeKHknseikyu3 = data.get決定前_保険分請求額3();
        source.maeK1Hutangaku3 = data.get決定前_公費1負担額3();
        source.maeK2Hutangaku3 = data.get決定前_公費2負担額3();
        source.maeK3Hutangaku3 = data.get決定前_公費3負担額3();
        source.maeKHutangaku3 = data.get決定前_利用者負担額3();
        source.maeKe1Hiyogaku = data.get決定前_費用額合計_合計情報公費1();
        source.maeKe1Seikyugaku = data.get決定前_保険分請求額合計_合計情報公費1();
        source.maeKe1Hutangaku = data.get決定前_利用者負担額合計_合計情報公費1();
        source.maeKe3Hiyogaku = data.get決定前_費用額合計_合計情報公費3();
        source.maeKe3Seikyugaku = data.get決定前_保険分請求額合計_合計情報公費3();
        source.maeKe3Hutangaku = data.get決定前_利用者負担額合計_合計情報公費3();
        source.kBango3 = data.get番号3();
        source.shinsaYmK3 = data.get審査年月3_k();
        source.futanGendo3 = data.get負担限度額3();
        source.saishinKaisuK3 = data.get再審査回数3_k();
        source.kagoKaisuK3 = data.get過誤回数3_k();
        source.atoKou1Nissu3 = data.get決定後_公費1日数3();
        source.atoKou2Nissu3 = data.get決定後_公費2日数3();
        source.kServicemei3 = data.getサービス内容3_k();
        source.atoKTanka3 = data.get決定後_費用単価3();
        source.atoKNissu3 = data.get決定後_日数3();
        source.atoKou3Nissu3 = data.get決定後_公費3日数3();
        source.atoKHiyougaku3 = data.get決定後_費用額3();
        source.atoKHknseikyu3 = data.get決定後_保険分請求額3();
    }

    private void editSource2(JukyushaKyufuJissekidaichoReportSource source) {
        source.atoK1Hutangaku3 = data.get決定後_公費1負担額3();
        source.atoK2Hutangaku3 = data.get決定後_公費2負担額3();
        source.atoK3Hutangaku3 = data.get決定後_公費3負担額3();
        source.atoKHutangaku3 = data.get決定後_利用者負担額3();
        source.atoKe1Hiyogaku = data.get決定後_費用額合計_合計情報公費1();
        source.atoKe1Seikyugaku = data.get決定後_保険分請求額合計_合計情報公費1();
        source.atoKe1Hutangaku = data.get決定後_利用者負担額合計_合計情報公費1();
        source.atoKe3Hiyogaku = data.get決定後_費用額合計_合計情報公費3();
        source.atoKe3Seikyugaku = data.get決定後_保険分請求額合計_合計情報公費3();
        source.atoKe3Hutangaku = data.get決定後_利用者負担額合計_合計情報公費3();
        source.tanKeikakuNissu1 = data.get決定後サービス計画日数1();
        source.tanNsJituNissu1 = data.get決定後サービス実施日数1();
        source.hdr1 = data.getヘッダー1();
        source.hdr4 = data.getヘッダー4();
        source.hdr2 = data.getヘッダー2();
        source.hdr5 = data.getヘッダー5();
        source.tanNsJituNissu2 = data.get決定後サービス実施日数2();
        source.tanKeikakuNissu2 = data.get決定後サービス計画日数2();
        source.hdr3 = data.getヘッダー3();
        source.hdr6 = data.getヘッダー6();
        source.tanNsJituNissu3 = data.get決定後サービス実施日数3();
        source.serviceShuMei1 = data.getサービス種類名称1();
        source.maeTankiNissu = data.get記MaeTankiNissu();
        source.meisai1 = data.get明細1();
        source.tekiyoS1 = data.get適用1();
        source.serviceShu = data.getｻｰﾋﾞｽ種類();
        source.gendoTaishoTani = data.get限度額管理対象単位数();
        source.gendoTaishogaiTani = data.get限度額管理対象外単位数();
        source.serviceNissu = data.getサービス実日数();
        source.keikakuTanisu = data.get計画単位数();
        source.tankiNissu = data.get短期日数();
        source.meisai2 = data.get明細2();
        source.tekiyoS2 = data.get適用2();
        source.serviceShuMei2 = data.getサービス種類名称2();
        source.atoTankiNissu = data.get記AtoTankiNissu();
        source.meisai3 = data.get明細3();
        source.tekiyoS3 = data.get適用3();
        source.meisai4 = data.get明細4();
        source.tekiyoS4 = data.get適用4();
        source.meisai5 = data.get明細5();
        source.tekiyoS5 = data.get適用5();
        source.meisai6 = data.get明細6();
        source.tekiyoS6 = data.get適用6();
        source.maeHkTaniGokei = data.get決定前_単位数合計_保険();
        source.tanisuTanka = data.get単位数単価_保険();
        source.maeHkSeikyuGaku = data.get決定前_請求額_保険_gaku();
        source.hkFutanGaku = data.get負担額_保険();
        source.maeHkIryoTanisu = data.get決定前_出来高医療費単位数合計_保険();
        source.maeHkIryoSeikyu = data.get決定前_出来高医療費請求額_保険();
        source.hkIryoFutan = data.get出来高医療費負担額_保険();
        source.meisai7 = data.get明細7();
        source.tekiyoS7 = data.get適用7();
        source.meisai8 = data.get明細8();
        source.tekiyoS8 = data.get適用8();
        source.atoHkIryoTanisu = data.get決定後_出来高医療費単位数合計_保険();
        source.meisai9 = data.get明細9();
        source.atoHkTaniGokei = data.get決定後_単位数合計_保険();
        source.atoHkSeikyuGaku = data.get決定後_請求額_保険_gaku();
        source.atoHkIryoSeikyu = data.get決定後_出来高医療費請求額_保険();
        source.tekiyoS9 = data.get適用9();
        source.k1FutanGaku = data.get負担額_公費1();
        source.maeK1IryoTanisu = data.get決定前_出来高医療費単位数合計_公費1();
        source.k1IryoFutan = data.get出来高医療費負担額_公費1();
        source.meisai10 = data.get明細10();
        source.maeK1TaniGokei = data.get決定前_単位数合計_公費1();
        source.maeK1SeikyuGaku = data.get決定前_請求額_公費1_gaku();
        source.maeK1IryoSeikyu = data.get決定前_出来高医療費請求額_公費1();
        source.tekiyoS10 = data.get適用10();
        source.meisai11 = data.get明細11();
        source.tekiyoS11 = data.get適用11();
        source.atoK1IryoTanisu = data.get決定後_出来高医療費単位数合計_公費1();
        source.meisai12 = data.get明細12();
        source.atoK1TaniGokei = data.get決定後_単位数合計_公費1();
        source.atoK1SeikyuGaku = data.get決定後_請求額_公費1_gaku();
        source.atoK1IryoSeikyu = data.get決定後_出来高医療費請求額_公費1();
        source.tekiyoS12 = data.get適用12();
        source.maeK2TaniGokei = data.get決定前_単位数合計_公費2();
        source.maeK2SeikyuGaku = data.get決定前_請求額_公費2_gaku();
        source.k2FutanGaku = data.get負担額_公費2();
        source.maeK2IryoTanisu = data.get決定前_出来高医療費単位数合計_公費2();
        source.maeK2IryoSeikyu = data.get決定前_出来高医療費請求額_公費2();
        source.k2IryoFutan = data.get出来高医療費負担額_公費2();
        source.meisai13 = data.get明細13();
        source.tekiyoS13 = data.get適用13();
        source.meisai14 = data.get明細14();
        source.tekiyoS14 = data.get適用14();
        source.atoK2IryoTanisu = data.get決定後_出来高医療費単位数合計_公費2();
        source.atoK2IryoSeikyu = data.get決定後_出来高医療費請求額_公費2();
        source.meisai15 = data.get明細15();
        source.tekiyoS15 = data.get適用15();
        source.atoK2TaniGokei = data.get決定後_単位数合計_公費2();
        source.atoK2SeikyuGaku = data.get決定後_請求額_公費2_gaku();
        source.k3FutanGaku = data.get負担額_公費3();
        source.maeK3IryoTanisu = data.get決定前_出来高医療費単位数合計_公費3();
        source.maeK3IryoSeikyu = data.get決定前_出来高医療費請求額_公費3();
        source.k3IryoFutan = data.get出来高医療費負担額_公費3();
        source.meisai16 = data.get明細16();
        source.tekiyoS16 = data.get適用16();
        source.maeK3TaniGokei = data.get決定前_単位数合計_公費3();
        source.maeK3SeikyuGaku = data.get決定前_請求額_公費3_gaku();
        source.meisai17 = data.get明細17();
        source.tekiyoS17 = data.get適用17();
        source.atoK3SeikyuGaku = data.get決定後_請求額_公費3_gaku();
        source.atoK3IryoTanisu = data.get決定後_出来高医療費単位数合計_公費3();
        source.atoK3IryoSeikyu = data.get決定後_出来高医療費請求額_公費3();
        source.meisai18 = data.get明細18();
        source.tekiyoS18 = data.get適用18();
        source.atoK3TaniGokei = data.get決定後_単位数合計_公費3();
        source.meisai19 = data.get明細19();
        source.tekiyoS19 = data.get適用19();
        source.saishinKaisuT = data.get再審査回数();
        source.kagoKaisuT = data.get過誤回数();
        source.meisai20 = data.get明細20();
        source.tekiyoS20 = data.get適用20();
        source.shinsaYmT = data.get審査年月_B();
        source.meisai21 = data.get明細21();
        source.tekiyoS21 = data.get適用21();
        source.shoriYmdHms = data.get発行日時();
    }
}
