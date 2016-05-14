/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.dbbrp00007.nonyutsuchishohonsanteibook;

import jp.co.ndensan.reams.db.dbb.entity.report.dbbrp00007.nonyutsuchishohonsanteibook.FuriKaeAriCoverToNofushoReportSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 *
 * @author xuyue
 */
public class FuriKaeAriCoverToNofushoEditor implements IFuriKaeAriCoverToNofushoEditor {

    private final FuriKaeAriCoverToNofushoItem item;

    private static final RString 次期以降 = new RString("次期以降");
    private static final RString 円 = new RString("円");
    private static final RString 期_4 = new RString("4");
    private static final RString 期_5 = new RString("5");
    private static final RString 期_6 = new RString("6");
    private static final RString FORMAT_第X期 = new RString("第%d期");
    private static final RString FORMAT_第XX期 = new RString("第%02d期");

    private static final RString REPORT_DBB100055 = new RString("DBB100055");
    private static final RString REPORT_DBB100056 = new RString("DBB100056");
    private static final RString REPORT_DBB100057 = new RString("DBB100057");
    private static final RString REPORT_DBB100058 = new RString("DBB100058");

    /**
     * インスタンスを生成します。
     *
     * @param item {@link NinteiChosaTokusokujoBodyEditor}
     */
    protected FuriKaeAriCoverToNofushoEditor(FuriKaeAriCoverToNofushoItem item) {
        this.item = item;
    }

    @Override
    public FuriKaeAriCoverToNofushoReportSource edit(FuriKaeAriCoverToNofushoReportSource source) {
        return editBody(source);

//        RString 帳票ID = item.get帳票ID().getColumnValue();
//        RString 編集範囲区分 = item.get編集範囲区分().getコード();
//
//        if (ShoriKubun.バッチ.getコード().equals(item.get処理区分().getコード())
//                && HyojiUmu.表示しない.getコード().equals(item.get本算定納入通知書制御情報().get納入通知書制御情報().getコンビニ_ブック口座用納付書表示().getコード())) { // TODO  QA && item.get編集後本算定通知書共通情報().get更正後().get口座区分()
//            編集範囲区分 = HenshuHaniKubun.Coverのみ.getコード();
//        }
//
//        if (編集範囲区分.equals(HenshuHaniKubun.全てのレイアウト.getコード())) {
//            if (REPORT_DBB100055.equals(帳票ID)) {
//
//            } else if (REPORT_DBB100057.equals(帳票ID)) {
//
//            } else if (REPORT_DBB100056.equals(帳票ID)) {
//
//            } else if (REPORT_DBB100058.equals(帳票ID)) {
//
//            }
//        } else if (編集範囲区分.equals(HenshuHaniKubun.Coverのみ.getコード())) {
//            if (REPORT_DBB100055.equals(帳票ID)) {
//
//            } else if (REPORT_DBB100057.equals(帳票ID)) {
//
//            } else if (REPORT_DBB100056.equals(帳票ID)) {
//
//            } else if (REPORT_DBB100058.equals(帳票ID)) {
//
//            }
//        } else if (編集範囲区分.equals(HenshuHaniKubun.Detailのみ.getコード())) {
//            if (REPORT_DBB100055.equals(帳票ID) || REPORT_DBB100056.equals(帳票ID)) {
//
//            } else if (REPORT_DBB100057.equals(帳票ID) || REPORT_DBB100058.equals(帳票ID)) {
//
//            }
//        }
    }

    private FuriKaeAriCoverToNofushoReportSource editBody(FuriKaeAriCoverToNofushoReportSource source) {
        source.layoutBreakItem = item.getLayoutBreakItem();
        // TODO
        source.ari_keisanMeisaishoNendo = item.getAri_keisanMeisaishoNendo();
        source.ari_keisanMeisaishoNendoBun = item.getAri_keisanMeisaishoNendoBun();
        source.ari_titleNendo = item.getAri_titleNendo();
        source.ari_titleNendoBun = item.getAri_titleNendoBun();
        source.ari_HyojicodeName1 = item.getAri_HyojicodeName1();
        source.ari_HyojicodeName2 = item.getAri_HyojicodeName2();
        source.ari_HyojicodeName3 = item.getAri_HyojicodeName3();
        source.ari_Hyojicode1 = item.getAri_Hyojicode1();
        source.ari_Hyojicode2 = item.getAri_Hyojicode2();
        source.ari_Hyojicode3 = item.getAri_Hyojicode3();
        source.ari_keisanMeisaishoKi1 = item.getAri_keisanMeisaishoKi1();
        source.ari_keisanMeisaishoNokigenKaishi1 = item.getAri_keisanMeisaishoNokigenKaishi1();
        source.ari_kaisanMeisaishoHihokenshaName = item.getAri_kaisanMeisaishoHihokenshaName();
        source.ari_kaisanMeisaishoSetaiNushiName = item.getAri_kaisanMeisaishoSetaiNushiName();
        source.ari_keisanMeisaishoTsuchishoNo = item.getAri_keisanMeisaishoTsuchishoNo();
        source.ari_keisanMeisaishoSetaiCode = item.getAri_keisanMeisaishoSetaiCode();
        source.ari_keisanMeisaishoTsuki1 = item.getAri_keisanMeisaishoTsuki1();
        source.ari_keisanMeisaishoNokigenShuryo1 = item.getAri_keisanMeisaishoNokigenShuryo1();
        source.ari_keisanMeisaishoKi2 = item.getAri_keisanMeisaishoKi2();
        source.ari_keisanMeisaishoNokigenKaishi2 = item.getAri_keisanMeisaishoNokigenKaishi2();
        source.ari_keisanMeisaishoTsuki2 = item.getAri_keisanMeisaishoTsuki2();
        source.ari_keisanMeisaishoNokigenShuryo2 = item.getAri_keisanMeisaishoNokigenShuryo2();
        source.ari_tsuchishoNo = item.getAri_tsuchishoNo();
        source.ari_setaiCode = item.getAri_setaiCode();
        source.ari_keisanMeisaishoKi3 = item.getAri_keisanMeisaishoKi3();
        source.ari_keisanMeisaishoNokigenKaishi3 = item.getAri_keisanMeisaishoNokigenKaishi3();
        source.ari_keisanMeisaishoKaishiKi = item.getAri_keisanMeisaishoKaishiKi();
        source.ari_keisanMeisaishoTsuki3 = item.getAri_keisanMeisaishoTsuki3();
        source.ari_keisanMeisaishoNokigenShuryo3 = item.getAri_keisanMeisaishoNokigenShuryo3();
        source.ari_keisanMeisaishoTsukiSu = item.getAri_keisanMeisaishoTsukiSu();
        source.ari_kaisanMeisaishoShuryoKi = item.getAri_kaisanMeisaishoShuryoKi();
        source.ari_keisanMeisaishoKi4 = item.getAri_keisanMeisaishoKi4();
        source.ari_keisanMeisaishoNokigenKaishi4 = item.getAri_keisanMeisaishoNokigenKaishi4();
        source.ari_bankCode = item.getAri_bankCode();
        source.ari_kozaShurui = item.getAri_kozaShurui();
        source.ari_kozaNo = item.getAri_kozaNo();
        source.ari_keisanMeisaishoTsuki4 = item.getAri_keisanMeisaishoTsuki4();
        source.ari_keisanMeisaishoNokigenShuryo4 = item.getAri_keisanMeisaishoNokigenShuryo4();
        source.ari_keisanMeisaishoShotokuDankai = item.getAri_keisanMeisaishoShotokuDankai();
        source.ari_kaisanHokenryoRitsu = item.getAri_kaisanHokenryoRitsu();
        source.ari_keisanMeisaishoKi5 = item.getAri_keisanMeisaishoKi5();
        source.ari_keisanMeisaishoNokigenKaishi5 = item.getAri_keisanMeisaishoNokigenKaishi5();
        source.ari_keisanMeisaishoTsuki5 = item.getAri_keisanMeisaishoTsuki5();
        source.ari_keisanMeisaishoNokigenShuryo5 = item.getAri_keisanMeisaishoNokigenShuryo5();
        source.ari_keisanMeisaishoCalHokenryoGaku = item.getAri_keisanMeisaishoCalHokenryoGaku();
        source.ari_keisanMeisaishoGenmenGaku = item.getAri_keisanMeisaishoGenmenGaku();
        source.ari_bankName = item.getAri_bankName();
        source.ari_keisanMeisaishoKi6 = item.getAri_keisanMeisaishoKi6();
        source.ari_keisanMeisaishoNokigenKaishi6 = item.getAri_keisanMeisaishoNokigenKaishi6();
        source.ari_keisanMeisaishoTsuki6 = item.getAri_keisanMeisaishoTsuki6();
        source.ari_keisanMeisaishoNokigenShuryo6 = item.getAri_keisanMeisaishoNokigenShuryo6();
        source.ari_keisanMeisaishoTokuchoGokeiGaku = item.getAri_keisanMeisaishoTokuchoGokeiGaku();
        source.ari_kaisanMeisaishoFuchoGokeiGaku = item.getAri_kaisanMeisaishoFuchoGokeiGaku();
        source.ari_keisanMeisaishoKi7 = item.getAri_keisanMeisaishoKi7();
        source.ari_keisanMeisaishoNokigenKaishi7 = item.getAri_keisanMeisaishoNokigenKaishi7();
        source.ari_kozaMeiginin = item.getAri_kozaMeiginin();
        source.ari_keisanMeisaishoTsuki7 = item.getAri_keisanMeisaishoTsuki7();
        source.ari_keisanMeisaishoNokigenShuryo7 = item.getAri_keisanMeisaishoNokigenShuryo7();
        source.ari_kaisanMeisaishoNofuZumiGaku = item.getAri_kaisanMeisaishoNofuZumiGaku();
        source.ari_keisanMeisaishoKongoNofuGaku = item.getAri_keisanMeisaishoKongoNofuGaku();
        source.ari_keisanMeisaishoKi8 = item.getAri_keisanMeisaishoKi8();
        source.ari_keisanMeisaishoNokigenKaishi8 = item.getAri_keisanMeisaishoNokigenKaishi8();
        source.ari_yen1 = item.getAri_yen1();
        source.ari_yen2 = item.getAri_yen2();
        source.ari_keisanMeisaishoTsuki8 = item.getAri_keisanMeisaishoTsuki8();
        source.ari_keisanMeisaishoNokigenShuryo8 = item.getAri_keisanMeisaishoNokigenShuryo8();
        source.ari_keisanMeisaishoKiTitle1 = item.getAri_keisanMeisaishoKiTitle1();
        source.ari_keisanMeisaishoKibetsuNofuGaku1 = item.getAri_keisanMeisaishoKibetsuNofuGaku1();
        source.ari_keisanMeisaishoKiTitle3 = item.getAri_keisanMeisaishoKiTitle3();
        source.ari_keisanMeisaishoKibetsuNofuGaku3 = item.getAri_keisanMeisaishoKibetsuNofuGaku3();
        source.ari_keisanMeisaishoKi9 = item.getAri_keisanMeisaishoKi9();
        source.ari_keisanMeisaishoNokigenKaishi9 = item.getAri_keisanMeisaishoNokigenKaishi9();
        source.ari_yen3 = item.getAri_yen3();
        source.ari_yen4 = item.getAri_yen4();
        source.ari_keisanMeisaishoTsuki9 = item.getAri_keisanMeisaishoTsuki9();
        source.ari_keisanMeisaishoNokigenShuryo9 = item.getAri_keisanMeisaishoNokigenShuryo9();
        source.ari_keisanMeisaishoKiTitle2 = item.getAri_keisanMeisaishoKiTitle2();
        source.ari_gekihenTitle = item.getAri_gekihenTitle();
        source.ari_keisanMeisaishoKibetsuNofuGaku2 = item.getAri_keisanMeisaishoKibetsuNofuGaku2();
        source.ari_keisanMeisaishoKiTitle4 = item.getAri_keisanMeisaishoKiTitle4();
        source.ari_gekihenMongon = item.getAri_gekihenMongon();
        source.ari_keisanMeisaishoKibetsuNofuGaku4 = item.getAri_keisanMeisaishoKibetsuNofuGaku4();
        source.ari_keisanMeisaishoKi10 = item.getAri_keisanMeisaishoKi10();
        source.ari_keisanMeisaishoNokigenKaishi10 = item.getAri_keisanMeisaishoNokigenKaishi10();
        source.ari_keisanmeisaishoNendo2 = item.getAri_keisanmeisaishoNendo2();
        source.ari_keisanMeisaishoTsuki10 = item.getAri_keisanMeisaishoTsuki10();
        source.ari_keisanMeisaishoNokigenShuryo10 = item.getAri_keisanMeisaishoNokigenShuryo10();
        source.ari_keisanMeisaishoHokenryoGokeiGaku = item.getAri_keisanMeisaishoHokenryoGokeiGaku();
        source.ari_pagerenban1 = item.getAri_pagerenban1();
        source.ari_pagerenban2 = item.getAri_pagerenban2();
        source.ari_nokibetsuMeisaishoNendo = item.getAri_nokibetsuMeisaishoNendo();
        source.ari_nokibetsuMeisaishoNendoBun = item.getAri_nokibetsuMeisaishoNendoBun();
        source.ari_kozaIraishoLeftJusho = item.getAri_kozaIraishoLeftJusho();
        source.ari_kozaIraishoRightJusho = item.getAri_kozaIraishoRightJusho();
        source.ari_nokibetsuMeisaishoTokuchoNofuGaku1 = item.getAri_nokibetsuMeisaishoTokuchoNofuGaku1();
        source.ari_nokibetsuMeisaishoTokuchoNofuZumiGaku1 = item.getAri_nokibetsuMeisaishoTokuchoNofuZumiGaku1();
        source.ari_nokibetsuMeisaishoTsuchishoNo = item.getAri_nokibetsuMeisaishoTsuchishoNo();
        source.ari_nokibetsuMeisaishoSetaiCode = item.getAri_nokibetsuMeisaishoSetaiCode();
        source.ari_nokibetsuMeisaishoTokuchoSaGaku1 = item.getAri_nokibetsuMeisaishoTokuchoSaGaku1();
        source.ari_nokibetsuMeisaishoTokuchoNofuGaku2 = item.getAri_nokibetsuMeisaishoTokuchoNofuGaku2();
        source.ari_nokibetsuMeisaishoTokuchoNofuZumiGaku2 = item.getAri_nokibetsuMeisaishoTokuchoNofuZumiGaku2();
        source.ari_nokibetsuMeisaishoTokuchoSaGaku2 = item.getAri_nokibetsuMeisaishoTokuchoSaGaku2();
        source.ari_kozaIraishoLeftHihokenshaName = item.getAri_kozaIraishoLeftHihokenshaName();
        source.ari_kozaIraishoRightHihokenshaName = item.getAri_kozaIraishoRightHihokenshaName();
        source.ari_nokibetsuMeisaishoHohokenshaName = item.getAri_nokibetsuMeisaishoHohokenshaName();
        source.ari_nokibetsuMeisaishoTokuchoNofuGaku3 = item.getAri_nokibetsuMeisaishoTokuchoNofuGaku3();
        source.ari_nokibetsuMeisaishoTokuchoNofuZumiGaku3 = item.getAri_nokibetsuMeisaishoTokuchoNofuZumiGaku3();
        source.ari_nokibetsuMeisaishoTokuchoSaGaku3 = item.getAri_nokibetsuMeisaishoTokuchoSaGaku3();
        source.ari_nokibetsuMeisaishoTokuchoNofuGaku4 = item.getAri_nokibetsuMeisaishoTokuchoNofuGaku4();
        source.ari_nokibetsuMeisaishoTokuchoNofuZumiGaku4 = item.getAri_nokibetsuMeisaishoTokuchoNofuZumiGaku4();
        source.ari_nokibetsuMeisaishoTokuchoSaGaku4 = item.getAri_nokibetsuMeisaishoTokuchoSaGaku4();
        source.ari_kozaIraishoLeftShikibetsuCode = item.getAri_kozaIraishoLeftShikibetsuCode();
        source.ari_kozaIraishoRightShikibetsuCode = item.getAri_kozaIraishoRightShikibetsuCode();
        source.ari_nokibetsuMeisaishoKi1 = item.getAri_nokibetsuMeisaishoKi1();
        source.ari_nokibetsuMeisaishoFuchoNofuGaku1 = item.getAri_nokibetsuMeisaishoFuchoNofuGaku1();
        source.ari_nokibetsuMeisaishoFuchoNofuZumiGaku1 = item.getAri_nokibetsuMeisaishoFuchoNofuZumiGaku1();
        source.ari_nokibetsuMeisaishoFuchoSaGaku1 = item.getAri_nokibetsuMeisaishoFuchoSaGaku1();
        source.ari_nokibetsuMeisaishoNokigen1 = item.getAri_nokibetsuMeisaishoNokigen1();
        source.ari_nokibetsuMeisaishoKi2 = item.getAri_nokibetsuMeisaishoKi2();
        source.ari_nokibetsuMeisaishoFuchoNofuGaku2 = item.getAri_nokibetsuMeisaishoFuchoNofuGaku2();
        source.ari_nokibetsuMeisaishoFuchoNofuZumiGaku2 = item.getAri_nokibetsuMeisaishoFuchoNofuZumiGaku2();
        source.ari_nokibetsuMeisaishoFuchoSaGaku2 = item.getAri_nokibetsuMeisaishoFuchoSaGaku2();
        source.ari_nokibetsuMeisaishoNokigen2 = item.getAri_nokibetsuMeisaishoNokigen2();
        source.ari_nokibetsuMeisaishoKi3 = item.getAri_nokibetsuMeisaishoKi3();
        source.ari_nokibetsuMeisaishoFuchoNofuGaku3 = item.getAri_nokibetsuMeisaishoFuchoNofuGaku3();
        source.ari_nokibetsuMeisaishoFuchoNofuZumiGaku3 = item.getAri_nokibetsuMeisaishoFuchoNofuZumiGaku3();
        source.ari_nokibetsuMeisaishoFuchoSaGaku3 = item.getAri_nokibetsuMeisaishoFuchoSaGaku3();
        source.ari_nokibetsuMeisaishoNokigen3 = item.getAri_nokibetsuMeisaishoNokigen3();
        source.ari_nokibetsuMeisaishoKi4 = item.getAri_nokibetsuMeisaishoKi4();
        source.ari_nokibetsuMeisaishoFuchoNofuGaku4 = item.getAri_nokibetsuMeisaishoFuchoNofuGaku4();
        source.ari_nokibetsuMeisaishoFuchoNofuZumiGaku4 = item.getAri_nokibetsuMeisaishoFuchoNofuZumiGaku4();
        source.ari_nokibetsuMeisaishoFuchoSaGaku4 = item.getAri_nokibetsuMeisaishoFuchoSaGaku4();
        source.ari_nokibetsuMeisaishoNokigen4 = item.getAri_nokibetsuMeisaishoNokigen4();
        source.ari_nokibetsuMeisaishoKi5 = item.getAri_nokibetsuMeisaishoKi5();
        source.ari_nokibetsuMeisaishoFuchoNofuGaku5 = item.getAri_nokibetsuMeisaishoFuchoNofuGaku5();
        source.ari_nokibetsuMeisaishoFuchoNofuZumiGaku5 = item.getAri_nokibetsuMeisaishoFuchoNofuZumiGaku5();
        source.ari_nokibetsuMeisaishoFuchoSaGaku5 = item.getAri_nokibetsuMeisaishoFuchoSaGaku5();
        source.ari_nokibetsuMeisaishoNokigen5 = item.getAri_nokibetsuMeisaishoNokigen5();
        source.ari_nokibetsuMeisaishoKi6 = item.getAri_nokibetsuMeisaishoKi6();
        source.ari_nokibetsuMeisaishoFuchoNofuGaku6 = item.getAri_nokibetsuMeisaishoFuchoNofuGaku6();
        source.ari_nokibetsuMeisaishoFuchoNofuZumiGaku6 = item.getAri_nokibetsuMeisaishoFuchoNofuZumiGaku6();
        source.ari_nokibetsuMeisaishoFuchoSaGaku6 = item.getAri_nokibetsuMeisaishoFuchoSaGaku6();
        source.ari_nokibetsuMeisaishoNokigen6 = item.getAri_nokibetsuMeisaishoNokigen6();
        source.ari_nokibetsuMeisaishoKi7 = item.getAri_nokibetsuMeisaishoKi7();
        source.ari_nokibetsuMeisaishoFuchoNofuGaku7 = item.getAri_nokibetsuMeisaishoFuchoNofuGaku7();
        source.ari_nokibetsuMeisaishoFuchoNofuZumiGaku7 = item.getAri_nokibetsuMeisaishoFuchoNofuZumiGaku7();
        source.ari_nokibetsuMeisaishoFuchoSaGaku7 = item.getAri_nokibetsuMeisaishoFuchoSaGaku7();
        source.ari_nokibetsuMeisaishoNokigen7 = item.getAri_nokibetsuMeisaishoNokigen7();
        source.ari_nokibetsuMeisaishoKi8 = item.getAri_nokibetsuMeisaishoKi8();
        source.ari_nokibetsuMeisaishoFuchoNofuGaku8 = item.getAri_nokibetsuMeisaishoFuchoNofuGaku8();
        source.ari_nokibetsuMeisaishoFuchoNofuZumiGaku8 = item.getAri_nokibetsuMeisaishoFuchoNofuZumiGaku8();
        source.ari_nokibetsuMeisaishoFuchoSaGaku8 = item.getAri_nokibetsuMeisaishoFuchoSaGaku8();
        source.ari_nokibetsuMeisaishoNokigen8 = item.getAri_nokibetsuMeisaishoNokigen8();
        source.ari_nokibetsuMeisaishoKi9 = item.getAri_nokibetsuMeisaishoKi9();
        source.ari_nokibetsuMeisaishoFuchoNofuGaku9 = item.getAri_nokibetsuMeisaishoFuchoNofuGaku9();
        source.ari_nokibetsuMeisaishoFuchoNofuZumiGaku9 = item.getAri_nokibetsuMeisaishoFuchoNofuZumiGaku9();
        source.ari_nokibetsuMeisaishoFuchoSaGaku9 = item.getAri_nokibetsuMeisaishoFuchoSaGaku9();
        source.ari_nokibetsuMeisaishoNokigen9 = item.getAri_nokibetsuMeisaishoNokigen9();
        source.ari_nokibetsuMeisaishoKi10 = item.getAri_nokibetsuMeisaishoKi10();
        source.ari_nokibetsuMeisaishoFuchoNofuGaku10 = item.getAri_nokibetsuMeisaishoFuchoNofuGaku10();
        source.ari_nokibetsuMeisaishoFuchoNofuZumiGaku10 = item.getAri_nokibetsuMeisaishoFuchoNofuZumiGaku10();
        source.ari_nokibetsuMeisaishoFuchoSaGaku10 = item.getAri_nokibetsuMeisaishoFuchoSaGaku10();
        source.ari_nokibetsuMeisaishoNokigen10 = item.getAri_nokibetsuMeisaishoNokigen10();
        source.ari_nokibetsuMeisaishoFuchoNofuGaku11 = item.getAri_nokibetsuMeisaishoFuchoNofuGaku11();
        source.ari_nokibetsuMeisaishoFuchoNofuZumiGaku11 = item.getAri_nokibetsuMeisaishoFuchoNofuZumiGaku11();
        source.ari_nokibetsuMeisaishoFuchoSaGaku11 = item.getAri_nokibetsuMeisaishoFuchoSaGaku11();
        source.ari_renban = item.getAri_renban();
        source.ari_hokenshaName = item.getAri_hokenshaName();
        source.ari_pagerenban3 = item.getAri_pagerenban3();
        source.ari_pagerenban4 = item.getAri_pagerenban4();
        source.ari_yubinNo = item.getAri_yubinNo();
        source.ari_gyoseiku = item.getAri_gyoseiku();
        source.ari_jushoText = item.getAri_jushoText();
        source.ari_jusho3 = item.getAri_jusho3();
        source.ari_jusho1 = item.getAri_jusho1();
        source.ari_jusho2 = item.getAri_jusho2();
        source.ari_katagakiText = item.getAri_katagakiText();
        source.ari_katagaki2 = item.getAri_katagaki2();
        source.ari_katagakiSmall2 = item.getAri_katagakiSmall2();
        source.ari_katagaki1 = item.getAri_katagaki1();
        source.ari_katagakiSmall1 = item.getAri_katagakiSmall1();
        source.ari_shimei2 = item.getAri_shimei2();
        source.ari_shimeiSmall2 = item.getAri_shimeiSmall2();
        source.ari_shimeiText = item.getAri_shimeiText();
        source.ari_meishoFuyo2 = item.getAri_meishoFuyo2();
        source.ari_shimeiSmall1 = item.getAri_shimeiSmall1();
        source.ari_dainoKubunMei = item.getAri_dainoKubunMei();
        source.ari_shimei1 = item.getAri_shimei1();
        source.ari_meishoFuyo1 = item.getAri_meishoFuyo1();
        source.ari_samabunShimeiText = item.getAri_samabunShimeiText();
        source.ari_samaBun2 = item.getAri_samaBun2();
        source.ari_samabunShimeiSmall2 = item.getAri_samabunShimeiSmall2();
        source.ari_kakkoLeft2 = item.getAri_kakkoLeft2();
        source.ari_samabunShimei2 = item.getAri_samabunShimei2();
        source.ari_kakkoRight2 = item.getAri_kakkoRight2();
        source.ari_kakkoLeft1 = item.getAri_kakkoLeft1();
        source.ari_samabunShimei1 = item.getAri_samabunShimei1();
        source.ari_samaBun1 = item.getAri_samaBun1();
        source.ari_kakkoRight1 = item.getAri_kakkoRight1();
        source.ari_samabunShimeiSmall1 = item.getAri_samabunShimeiSmall1();
        source.ari_customerBarCode = item.getAri_customerBarCode();
        source.ari_denshiKoin = item.getAri_denshiKoin();
        source.ari_hakkoYMD = item.getAri_hakkoYMD();
        source.ari_ninshoshaYakushokuMei = item.getAri_ninshoshaYakushokuMei();
        source.ari_ninshoshaYakushokuMei1 = item.getAri_ninshoshaYakushokuMei1();
        source.ari_koinMojiretsu = item.getAri_koinMojiretsu();
        source.ari_ninshoshaYakushokuMei2 = item.getAri_ninshoshaYakushokuMei2();
        source.ari_ninshoshaShimeiKakenai = item.getAri_ninshoshaShimeiKakenai();
        source.ari_ninshoshaShimeiKakeru = item.getAri_ninshoshaShimeiKakeru();
        source.ari_koinShoryaku = item.getAri_koinShoryaku();

        // 20
        source.nofuzumishoTitleNendoBun1 = item.getNofuzumishoTitleNendoBun1();
        source.nofuzumishoTitleKi1 = item.getNofuzumishoTitleKi1();
        source.nofuzumishoTitleTsuki1 = item.getNofuzumishoTitleTsuki1();
        source.nofozumishoTitleNendo1 = item.getNofozumishoTitleNendo1();
        source.nofozumishoTitleNendo2 = item.getNofozumishoTitleNendo2();
        source.nofuzumishoTitleNendoBun2 = item.getNofuzumishoTitleNendoBun2();
        source.nofuzumishoTitleKi2 = item.getNofuzumishoTitleKi2();
        source.nofuzumishoTitleTsuki2 = item.getNofuzumishoTitleTsuki2();
        source.ryoshushoTitleNendo2 = item.getRyoshushoTitleNendo2();
        source.ryoshushoTitleKi2 = item.getRyoshushoTitleKi2();
        source.ryoshushoTitleTsuki2 = item.getRyoshushoTitleTsuki2();
        source.nofushoTitleNendo2 = item.getNofushoTitleNendo2();
        source.nofushoTitleKi2 = item.getNofushoTitleKi2();
        source.nofushoTitleTsuki2 = item.getNofushoTitleTsuki2();
        source.ryoshushoTitleNendo1 = item.getRyoshushoTitleNendo1();
        source.ryoshushoTitleKi1 = item.getRyoshushoTitleKi1();
        source.ryoshushoTitleTsuki1 = item.getRyoshushoTitleTsuki1();
        source.nofushoTitleNendo1 = item.getNofushoTitleNendo1();
        source.nofushoTitleKi1 = item.getNofushoTitleKi1();
        source.nofushoTitleTsuki1 = item.getNofushoTitleTsuki1();
        source.ryoshushoJusho1 = item.getRyoshushoJusho1();
        source.ryoshushoJusho2 = item.getRyoshushoJusho2();
        source.nofuzumishoTsuchishoNo1 = item.getNofuzumishoTsuchishoNo1();
        source.nofuzumishoTsuchishoNo2 = item.getNofuzumishoTsuchishoNo2();
        source.nofuzumishoOCR11 = item.getNofuzumishoOCR11();
        source.nofuzumishoOCR12 = item.getNofuzumishoOCR12();
        source.ryoshushoKatagaki1 = item.getRyoshushoKatagaki1();
        source.ryoshushoKatagaki2 = item.getRyoshushoKatagaki2();
        source.nofuzumishoSetaiCode1 = item.getNofuzumishoSetaiCode1();
        source.nofuzumishoSetaiCode2 = item.getNofuzumishoSetaiCode2();
        source.nofuzumishoOCR22 = item.getNofuzumishoOCR22();
        source.nofuzumishoOCR21 = item.getNofuzumishoOCR21();
        source.ryoshushoHihokenshaName1 = item.getRyoshushoHihokenshaName1();
        source.nofushoHihokenshaName1 = item.getNofushoHihokenshaName1();
        source.ryoshushoHihokenshaName2 = item.getRyoshushoHihokenshaName2();
        source.nofushoHihokenshaName2 = item.getNofushoHihokenshaName2();
        source.nofuzumishoOCR31 = item.getNofuzumishoOCR31();
        source.nofuzumishoNokigen1 = item.getNofuzumishoNokigen1();
        source.nofuzumishoNokigen2 = item.getNofuzumishoNokigen2();
        source.nofuzumishoOCR32 = item.getNofuzumishoOCR32();
        source.ryoshushoTsuchishoNo1 = item.getRyoshushoTsuchishoNo1();
        source.nofushoTsuchishoNo1 = item.getNofushoTsuchishoNo1();
        source.ryoshushoTsuchishoNo2 = item.getRyoshushoTsuchishoNo2();
        source.nofushoTsuchishoNo2 = item.getNofushoTsuchishoNo2();
        source.ryoshushoHokenryoGaku1 = item.getRyoshushoHokenryoGaku1();
        source.nofushoHokenryoGaku1 = item.getNofushoHokenryoGaku1();
        source.ryoshushoHokenryoGaku2 = item.getRyoshushoHokenryoGaku2();
        source.nofushoHokenryoGaku2 = item.getNofushoHokenryoGaku2();
        source.nofuzumishoNofuGaku1 = item.getNofuzumishoNofuGaku1();
        source.nofuzumishoNofuGaku2 = item.getNofuzumishoNofuGaku2();
        source.ryoshushoNokigen1 = item.getRyoshushoNokigen1();
        source.nofushoNokigen1 = item.getNofushoNokigen1();
        source.ryoshushoNokigen2 = item.getRyoshushoNokigen2();
        source.nofushoNokigen2 = item.getNofushoNokigen2();
        source.nofuzumishoJusho1 = item.getNofuzumishoJusho1();
        source.nofuzumishoJusho2 = item.getNofuzumishoJusho2();
        source.nofuzumishoKatagaki1 = item.getNofuzumishoKatagaki1();
        source.nofuzumishoKatagaki2 = item.getNofuzumishoKatagaki2();
        source.ryoshushoNofuIn1 = item.getRyoshushoNofuIn1();
        source.nofushoNofuIn1 = item.getNofushoNofuIn1();
        source.nofuzumishoNofuIn1 = item.getNofuzumishoNofuIn1();
        source.ryoshushoNofuIn2 = item.getRyoshushoNofuIn2();
        source.nofushoNofuIn2 = item.getNofushoNofuIn2();
        source.nofuzumishoNofuIn2 = item.getNofuzumishoNofuIn2();
        source.ryoshushoKozaCom1 = item.getRyoshushoKozaCom1();
        source.nofushoKozaCom1 = item.getNofushoKozaCom1();
        source.nofuzumishoHihokenshaName1 = item.getNofuzumishoHihokenshaName1();
        source.nofuzumishoKozaCom1 = item.getNofuzumishoKozaCom1();
        source.ryoshushoKozaCom2 = item.getRyoshushoKozaCom2();
        source.nofushoKozaCom2 = item.getNofushoKozaCom2();
        source.nofuzumishoHihokenshaName2 = item.getNofuzumishoHihokenshaName2();
        source.nofuzumishoKozaCom2 = item.getNofuzumishoKozaCom2();
        source.ryoshushoZuiji1 = item.getRyoshushoZuiji1();
        source.nofushoZuiji1 = item.getNofushoZuiji1();
        source.nofuzumishoZuiji1 = item.getNofuzumishoZuiji1();
        source.ryoshushoZuiji2 = item.getRyoshushoZuiji2();
        source.nofushoZuiji2 = item.getNofushoZuiji2();
        source.nofuzumishoZuiji2 = item.getNofuzumishoZuiji2();
        source.nofuzumishoshichosonName1 = item.getNofuzumishoshichosonName1();
        source.pagerenban1 = item.getPagerenban1();
        source.nofuzumishoshichosonName2 = item.getNofuzumishoshichosonName2();
        source.pagerenban2 = item.getPagerenban2();
        source.nofozumishoTitleNendo3 = item.getNofozumishoTitleNendo3();
        source.nofuzumishoTitleNendoBun3 = item.getNofuzumishoTitleNendoBun3();
        source.nofuzumishoTitleKi3 = item.getNofuzumishoTitleKi3();
        source.nofuzumishoTitleTsuki3 = item.getNofuzumishoTitleTsuki3();
        source.nofozumishoTitleNendo4 = item.getNofozumishoTitleNendo4();
        source.nofuzumishoTitleNendoBun4 = item.getNofuzumishoTitleNendoBun4();
        source.nofuzumishoTitleKi4 = item.getNofuzumishoTitleKi4();
        source.nofuzumishoTitleTsuki4 = item.getNofuzumishoTitleTsuki4();
        source.ryoshushoTitleNendo3 = item.getRyoshushoTitleNendo3();
        source.ryoshushoTitleKi3 = item.getRyoshushoTitleKi3();
        source.ryoshushoTitleTsuki3 = item.getRyoshushoTitleTsuki3();
        source.nofushoTitleNendo3 = item.getNofushoTitleNendo3();
        source.nofushoTitleKi3 = item.getNofushoTitleKi3();
        source.nofushoTitleTsuki3 = item.getNofushoTitleTsuki3();
        source.ryoshushoTitleNendo4 = item.getRyoshushoTitleNendo4();
        source.ryoshushoTitleKi4 = item.getRyoshushoTitleKi4();
        source.ryoshushoTitleTsuki4 = item.getRyoshushoTitleTsuki4();
        source.nofushoTitleNendo4 = item.getNofushoTitleNendo4();
        source.nofushoTitleKi4 = item.getNofushoTitleKi4();
        source.nofushoTitleTsuki4 = item.getNofushoTitleTsuki4();
        source.ryoshushoJusho3 = item.getRyoshushoJusho3();
        source.ryoshushoJusho4 = item.getRyoshushoJusho4();
        source.nofuzumishoTsuchishoNo3 = item.getNofuzumishoTsuchishoNo3();
        source.nofuzumishoTsuchishoNo4 = item.getNofuzumishoTsuchishoNo4();
        source.nofuzumishoOCR13 = item.getNofuzumishoOCR13();
        source.nofuzumishoOCR14 = item.getNofuzumishoOCR14();
        source.ryoshushoKatagaki3 = item.getRyoshushoKatagaki3();
        source.ryoshushoKatagaki4 = item.getRyoshushoKatagaki4();
        source.nofuzumishoSetaiCode3 = item.getNofuzumishoSetaiCode3();
        source.nofuzumishoSetaiCode4 = item.getNofuzumishoSetaiCode4();
        source.nofuzumishoOCR23 = item.getNofuzumishoOCR23();
        source.nofuzumishoOCR24 = item.getNofuzumishoOCR24();
        source.ryoshushoHihokenshaName3 = item.getRyoshushoHihokenshaName3();
        source.nofushoHihokenshaName3 = item.getNofushoHihokenshaName3();
        source.ryoshushoHihokenshaName4 = item.getRyoshushoHihokenshaName4();
        source.nofushoHihokenshaName4 = item.getNofushoHihokenshaName4();
        source.nofuzumishoNokigen3 = item.getNofuzumishoNokigen3();
        source.nofuzumishoNokigen4 = item.getNofuzumishoNokigen4();
        source.nofuzumishoOCR33 = item.getNofuzumishoOCR33();
        source.nofuzumishoOCR34 = item.getNofuzumishoOCR34();
        source.ryoshushoTsuchishoNo3 = item.getRyoshushoTsuchishoNo3();
        source.nofushoTsuchishoNo3 = item.getNofushoTsuchishoNo3();
        source.ryoshushoTsuchishoNo4 = item.getRyoshushoTsuchishoNo4();
        source.nofushoTsuchishoNo4 = item.getNofushoTsuchishoNo4();
        source.ryoshushoHokenryoGaku3 = item.getRyoshushoHokenryoGaku3();
        source.nofushoHokenryoGaku3 = item.getNofushoHokenryoGaku3();
        source.ryoshushoHokenryoGaku4 = item.getRyoshushoHokenryoGaku4();
        source.nofushoHokenryoGaku4 = item.getNofushoHokenryoGaku4();
        source.nofuzumishoNofuGaku3 = item.getNofuzumishoNofuGaku3();
        source.nofuzumishoNofuGaku4 = item.getNofuzumishoNofuGaku4();
        source.ryoshushoNokigen3 = item.getRyoshushoNokigen3();
        source.nofushoNokigen3 = item.getNofushoNokigen3();
        source.ryoshushoNokigen4 = item.getRyoshushoNokigen4();
        source.nofushoNokigen4 = item.getNofushoNokigen4();
        source.nofuzumishoJusho3 = item.getNofuzumishoJusho3();
        source.nofuzumishoJusho4 = item.getNofuzumishoJusho4();
        source.nofuzumishoKatagaki3 = item.getNofuzumishoKatagaki3();
        source.nofuzumishoKatagaki4 = item.getNofuzumishoKatagaki4();
        source.ryoshushoNofuIn3 = item.getRyoshushoNofuIn3();
        source.nofushoNofuIn3 = item.getNofushoNofuIn3();
        source.nofuzumishoNofuIn3 = item.getNofuzumishoNofuIn3();
        source.ryoshushoNofuIn4 = item.getRyoshushoNofuIn4();
        source.nofushoNofuIn4 = item.getNofushoNofuIn4();
        source.nofuzumishoNofuIn4 = item.getNofuzumishoNofuIn4();
        source.ryoshushoKozaCom3 = item.getRyoshushoKozaCom3();
        source.nofushoKozaCom3 = item.getNofushoKozaCom3();
        source.nofuzumishoHihokenshaName3 = item.getNofuzumishoHihokenshaName3();
        source.nofuzumishoKozaCom3 = item.getNofuzumishoKozaCom3();
        source.ryoshushoKozaCom4 = item.getRyoshushoKozaCom4();
        source.nofushoKozaCom4 = item.getNofushoKozaCom4();
        source.nofuzumishoHihokenshaName4 = item.getNofuzumishoHihokenshaName4();
        source.nofuzumishoKozaCom4 = item.getNofuzumishoKozaCom4();
        source.ryoshushoZuiji3 = item.getRyoshushoZuiji3();
        source.nofushoZuiji3 = item.getNofushoZuiji3();
        source.nofuzumishoZuiji3 = item.getNofuzumishoZuiji3();
        source.ryoshushoZuiji4 = item.getRyoshushoZuiji4();
        source.nofushoZuiji4 = item.getNofushoZuiji4();
        source.nofuzumishoZuiji4 = item.getNofuzumishoZuiji4();
        source.eRenban = item.getERenban();
        source.ePage = item.getEPage();
        source.nofuzumishoshichosonName3 = item.getNofuzumishoshichosonName3();
        source.pagerenban3 = item.getPagerenban3();
        source.nofuzumishoshichosonName4 = item.getNofuzumishoshichosonName4();
        source.pagerenban4 = item.getPagerenban4();
        source.eHokensyaName = item.getEHokensyaName();
        return source;

    }

}
