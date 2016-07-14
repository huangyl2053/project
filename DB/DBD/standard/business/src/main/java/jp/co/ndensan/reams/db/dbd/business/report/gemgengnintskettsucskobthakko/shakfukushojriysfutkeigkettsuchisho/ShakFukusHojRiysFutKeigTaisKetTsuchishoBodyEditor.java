/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.business.report.gemgengnintskettsucskobthakko.shakfukushojriysfutkeigkettsuchisho;

import java.util.List;
import jp.co.ndensan.reams.db.dbd.definition.core.gemmengengaku.KetteiKubun;
import jp.co.ndensan.reams.db.dbd.entity.report.shakfukushojriysfutkeigkettsuchisho.ShakaiFukushiHojinRiyoshaFutanKeigenKetteiTsuchishoReportSource;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoKyotsu;
import jp.co.ndensan.reams.db.dbz.business.report.util.EditedKojin;
import jp.co.ndensan.reams.db.dbz.definition.core.chohyo.kyotsu.TeikeibunMojiSize;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.kojin.IKojin;
import jp.co.ndensan.reams.ur.urz.business.report.parts.ninshosha.NinshoshaSourceBuilderFactory;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;
import jp.co.ndensan.reams.ur.urz.entity.report.sofubutsuatesaki.SofubutsuAtesakiSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 社会福祉法人等利用者負担軽減対象決定通知書ボディEditorです。
 *
 * @reamsid_L DBD-3540-110 wangchao
 */
public class ShakFukusHojRiysFutKeigTaisKetTsuchishoBodyEditor implements IShakFukusHojRiysFutKeigTaisKetTsuchishoEditor {

    private final RString 折り返す符号 = new RString("\r\n");
    private final RString 決定区分_承認 = new RString("○");
    private final RString 通知文 = new RString("tsuchibun");
    private final RString 通知文Large = new RString("tsuchibunLarge");
    private final RString 通知文混在 = new RString("tsuchibunMix");
    private final RString 通知文混在２ = new RString("tsuchibunMixtwo");
    private final ShakFukusHojRiysFutKeigTaisKetTsuchishoItem item;

    /**
     * インスタンスを生成します。
     *
     * @param item 社会福祉法人等利用者負担軽減対象決定通知書
     */
    public ShakFukusHojRiysFutKeigTaisKetTsuchishoBodyEditor(ShakFukusHojRiysFutKeigTaisKetTsuchishoItem item) {
        this.item = item;
    }

    /**
     * 社会福祉法人等利用者負担軽減対象決定通知書ボディEditorです。
     *
     * @param source 社会福祉法人等利用者負担軽減対象決定通知書Source
     * @return 社会福祉法人等利用者負担軽減対象決定通知書Source
     */
    @Override
    public ShakaiFukushiHojinRiyoshaFutanKeigenKetteiTsuchishoReportSource edit(
            ShakaiFukushiHojinRiyoshaFutanKeigenKetteiTsuchishoReportSource source) {
        return bodyEdit(source);
    }

    private ShakaiFukushiHojinRiyoshaFutanKeigenKetteiTsuchishoReportSource bodyEdit(
            ShakaiFukushiHojinRiyoshaFutanKeigenKetteiTsuchishoReportSource source) {

        source.bunshoNo = item.get文書番号();
        source.title1 = new RString("社会福祉法人等利用者負担軽減対象決定通知書");
        source.title2 = new RString("（社会福祉法人等による利用者負担の減免措置）");
        set通知書定型文(source, 1, item, 通知文);

        EditedKojin 編集後個人 = getEditedKojin(item.getIKojin(), item.get帳票制御共通());
        source.hihokenshaName = 編集後個人.get名称().getName().getColumnValue();
        source.hihokenshaNo1 = item.get社会福祉法人等利用者負担軽減().get被保険者番号().getColumnValue().substring(1, 2);
        source.hihokenshaNo2 = item.get社会福祉法人等利用者負担軽減().get被保険者番号().getColumnValue().substring(2, 3);
        source.hihokenshaNo3 = item.get社会福祉法人等利用者負担軽減().get被保険者番号().getColumnValue().substring(3, 4);
        source.hihokenshaNo4 = item.get社会福祉法人等利用者負担軽減().get被保険者番号().getColumnValue().substring(4, 5);
        source.hihokenshaNo5 = item.get社会福祉法人等利用者負担軽減().get被保険者番号().getColumnValue().substring(5, 6);
        source.hihokenshaNo6 = item.get社会福祉法人等利用者負担軽減().get被保険者番号().getColumnValue().substring(6, 7);
        source.hihokenshaNo7 = item.get社会福祉法人等利用者負担軽減().get被保険者番号().getColumnValue().substring(7, 8);
        source.hihokenshaNo8 = item.get社会福祉法人等利用者負担軽減().get被保険者番号().getColumnValue().substring(8, 9);
        source.hihokenshaNo9 = item.get社会福祉法人等利用者負担軽減().get被保険者番号().getColumnValue().substring(9, 10);
        source.hihokenshaNo10 = item.get社会福祉法人等利用者負担軽減().get被保険者番号().getColumnValue().substring(10, 10);
        source.ketteiYMD = item.get社会福祉法人等利用者負担軽減().get決定年月日().wareki().toDateString();

        source.ninteiKekka4 = RString.EMPTY;
        source.ninteiKekka5 = RString.EMPTY;
        source.ninteiKekka6 = RString.EMPTY;
        source.ninteiKekka7 = RString.EMPTY;

        if (KetteiKubun.承認する.getコード().equals(item.get社会福祉法人等利用者負担軽減().get決定区分())) {
            source.ninteiKekka1 = new RString("（承認内容）");
            source.tekiyoYMD = item.get社会福祉法人等利用者負担軽減().get適用開始年月日().wareki().toDateString();
            source.shoninSuru = 決定区分_承認;
            source.ninteiKekka2 = new RString(item.get社会福祉法人等利用者負担軽減().get軽減率_分子().toString().concat("/0").concat(
                    item.get社会福祉法人等利用者負担軽減().get軽減率_分母().toString()));
            source.yukoYMD = item.get社会福祉法人等利用者負担軽減().get適用終了年月日().wareki().toDateString();
            source.ninteiKekka3 = new RString("居住費．食費のみ");
            source.kakuninNoTitle = new RString("確　認　番　号");
            source.kakuninNo1 = item.get社会福祉法人等利用者負担軽減().get確認番号().substring(1, 2);
            source.kakuninNo2 = item.get社会福祉法人等利用者負担軽減().get確認番号().substring(2, 3);
            source.kakuninNo3 = item.get社会福祉法人等利用者負担軽減().get確認番号().substring(3, 4);
            source.kakuninNo4 = item.get社会福祉法人等利用者負担軽減().get確認番号().substring(4, 5);
            source.kakuninNo5 = item.get社会福祉法人等利用者負担軽減().get確認番号().substring(5, 6);
            source.kakuninNo6 = item.get社会福祉法人等利用者負担軽減().get確認番号().substring(6, 7);
            source.kakuninNo7 = item.get社会福祉法人等利用者負担軽減().get確認番号().substring(7, 8);
            source.kakuninNo8 = item.get社会福祉法人等利用者負担軽減().get確認番号().substring(8, 9);
            source.kakuninNo9 = item.get社会福祉法人等利用者負担軽減().get確認番号().substring(9, 10);
            source.kakuninNo10 = item.get社会福祉法人等利用者負担軽減().get確認番号().substring(10, 10);

            source.shoninNg = RString.EMPTY;
            source.riyu1 = RString.EMPTY;
            source.riyu2 = RString.EMPTY;
            source.riyu3 = RString.EMPTY;
            source.riyu4 = RString.EMPTY;
            source.riyu5 = RString.EMPTY;
        } else {
            source.ninteiKekka1 = RString.EMPTY;
            source.tekiyoYMD = RString.EMPTY;
            source.shoninSuru = RString.EMPTY;
            source.ninteiKekka2 = RString.EMPTY;
            source.yukoYMD = RString.EMPTY;
            source.ninteiKekka3 = RString.EMPTY;
            source.kakuninNoTitle = RString.EMPTY;

            source.kakuninNo1 = RString.EMPTY;
            source.kakuninNo2 = RString.EMPTY;
            source.kakuninNo3 = RString.EMPTY;
            source.kakuninNo4 = RString.EMPTY;
            source.kakuninNo5 = RString.EMPTY;
            source.kakuninNo6 = RString.EMPTY;
            source.kakuninNo7 = RString.EMPTY;
            source.kakuninNo8 = RString.EMPTY;
            source.kakuninNo9 = RString.EMPTY;
            source.kakuninNo10 = RString.EMPTY;

            source.shoninNg = 決定区分_承認;
            source.riyu1 = item.get社会福祉法人等利用者負担軽減().get非承認理由();
            // source.riyu2 = RString.EMPTY;
            // source.riyu3 = RString.EMPTY;
            // source.riyu4 = RString.EMPTY;
            // source.riyu5 = RString.EMPTY;

            if (TeikeibunMojiSize.フォント小.getコード().equals(item.get帳票制御共通().get定型文文字サイズ())) {
                set通知書定型文(source, 2, item, 通知文);
            }

            if (TeikeibunMojiSize.フォント大.getコード().equals(item.get帳票制御共通().get定型文文字サイズ())) {
                set通知書定型文(source, 2, item, 通知文Large);

            }
            if (TeikeibunMojiSize.フォント上小下大.getコード().equals(item.get帳票制御共通().get定型文文字サイズ())) {
                set通知書定型文(source, 2, item, 通知文混在);
                set通知書定型文(source, 3, item, 通知文混在);
            }
            if (TeikeibunMojiSize.フォント上大下小.getコード().equals(item.get帳票制御共通().get定型文文字サイズ())) {
                set通知書定型文(source, 2, item, 通知文混在２);
                set通知書定型文(source, 3, item, 通知文混在２);
            }
            setCompNinshosha(source, item);
            setCompSofubutsuAtesaki(source, item);

            source.shikibetsuCode = item.getIKojin().get識別コード().getColumnValue();
            source.hihokenshaNo = item.get社会福祉法人等利用者負担軽減().get被保険者番号().getColumnValue();
        }
        return source;
    }

    private ShakaiFukushiHojinRiyoshaFutanKeigenKetteiTsuchishoReportSource set通知書定型文(
            ShakaiFukushiHojinRiyoshaFutanKeigenKetteiTsuchishoReportSource source, int index,
            ShakFukusHojRiysFutKeigTaisKetTsuchishoItem item, RString taisyou) {
        List<RString> 通知書定型文List = item.get通知書定型文List().get(index).split(折り返す符号.toString());
        Class reportSource = source.getClass();
        for (int i = 0; i <= 通知書定型文List.size(); i++) {
            try {
                if (index == 2) {
                    reportSource.getDeclaredField(taisyou.toString().concat(String.valueOf(i + 1))).set(source, 通知書定型文List.get(i));
                    if (i == 1) {
                        break;
                    }
                } else if (index == 3 && (通知文).equals(taisyou)) {
                    reportSource.getDeclaredField(taisyou.toString().concat(String.valueOf(i + 2))).set(source, 通知書定型文List.get(i + 2));
                } else if ((通知文Large).equals(taisyou)) {
                    reportSource.getDeclaredField(taisyou.toString().concat(String.valueOf(i + 3))).set(source, 通知書定型文List.get(i + 2));
                } else if (index == 3 && (通知文混在).equals(taisyou)) {
                    reportSource.getDeclaredField(taisyou.toString().concat(String.valueOf(i + 3))).set(source, 通知書定型文List.get(i + 2));
                    if (i == 11) {
                        break;
                    }
                } else if (index == 4 && (通知文混在).equals(taisyou)) {
                    reportSource.getDeclaredField(taisyou.toString().concat(String.valueOf(i + 15))).set(source, 通知書定型文List.get(i + 14));
                } else if (index == 3 && (通知文混在２).equals(taisyou)) {
                    reportSource.getDeclaredField(taisyou.toString().concat(String.valueOf(i + 3))).set(source, 通知書定型文List.get(i + 2));
                    if (i == 6) {
                        break;
                    }
                } else if (index == 4 && (通知文混在２).equals(taisyou)) {
                    reportSource.getDeclaredField(taisyou.toString().concat(String.valueOf(i + 10))).set(source, 通知書定型文List.get(i + 9));
                }
            } catch (IllegalAccessException | NoSuchFieldException ex) {
                break;
            }
        }
        return source;
    }

    private ShakaiFukushiHojinRiyoshaFutanKeigenKetteiTsuchishoReportSource setCompNinshosha(
            ShakaiFukushiHojinRiyoshaFutanKeigenKetteiTsuchishoReportSource source,
            ShakFukusHojRiysFutKeigTaisKetTsuchishoItem item) {
        source.denshiKoin = getCompNinshosha(item).denshiKoin;
        source.hakkoYMD = getCompNinshosha(item).hakkoYMD;
        source.ninshoshaYakushokuMei1 = getCompNinshosha(item).ninshoshaYakushokuMei1;
        source.koinMojiretsu = getCompNinshosha(item).koinMojiretsu;
        source.ninshoshaYakushokuMei2 = getCompNinshosha(item).ninshoshaYakushokuMei2;
        source.ninshoshaShimeiKakenai = getCompNinshosha(item).ninshoshaShimeiKakenai;
        source.ninshoshaShimeiKakeru = getCompNinshosha(item).ninshoshaShimeiKakeru;
        source.koinShoryaku = getCompNinshosha(item).koinShoryaku;
        return source;
    }

    private ShakaiFukushiHojinRiyoshaFutanKeigenKetteiTsuchishoReportSource setCompSofubutsuAtesaki(
            ShakaiFukushiHojinRiyoshaFutanKeigenKetteiTsuchishoReportSource source, ShakFukusHojRiysFutKeigTaisKetTsuchishoItem item) {
        SofubutsuAtesakiSource sofubutsuAtesakiSource;
        try {
            sofubutsuAtesakiSource = item.get編集後宛先().getSofubutsuAtesakiSource().get送付物宛先ソース();
        } catch (Exception e) {
            sofubutsuAtesakiSource = new SofubutsuAtesakiSource();
        }
        source.yubinNo = sofubutsuAtesakiSource.yubinNo;
        source.gyoseiku1 = sofubutsuAtesakiSource.gyoseiku;
        // source.jusho4 = sofubutsuAtesakiSource.j;
        source.jushoText = sofubutsuAtesakiSource.jushoText;
        // source.jusho5 = RString.EMPTY;
        // source.jusho6 = RString.EMPTY;
        source.katagakiText = sofubutsuAtesakiSource.katagakiText;
        // source.katagaki3 = RString.EMPTY;
        source.katagakiSmall2 = sofubutsuAtesakiSource.katagakiSmall2;
        // source.katagaki4 = RString.EMPTY;
        source.katagakiSmall1 = sofubutsuAtesakiSource.katagakiSmall1;
        // source.shimei3 = RString.EMPTY;
        source.shimeiSmall2 = sofubutsuAtesakiSource.shimeiSmall2;
        source.shimeiText = sofubutsuAtesakiSource.shimeiText;
        source.meishoFuyo2 = sofubutsuAtesakiSource.meishoFuyo2;
        source.shimeiSmall1 = sofubutsuAtesakiSource.shimeiSmall1;
        source.dainoKubunMei = sofubutsuAtesakiSource.dainoKubunMei;
        // source.shimei4 = RString.EMPTY;
        source.meishoFuyo1 = sofubutsuAtesakiSource.meishoFuyo1;
        source.samabunShimeiText = sofubutsuAtesakiSource.samabunShimeiText;
        source.samabunShimeiSmall2 = sofubutsuAtesakiSource.samabunShimeiSmall2;
        source.samaBun2 = sofubutsuAtesakiSource.samaBun2;
        source.kakkoLeft2 = sofubutsuAtesakiSource.kakkoLeft2;
        source.samabunShimei2 = sofubutsuAtesakiSource.samabunShimei2;
        source.kakkoRight2 = sofubutsuAtesakiSource.kakkoRight2;
        source.kakkoLeft1 = sofubutsuAtesakiSource.kakkoLeft1;
        source.samabunShimei1 = sofubutsuAtesakiSource.samabunShimei1;
        source.samaBun1 = sofubutsuAtesakiSource.samaBun1;
        source.kakkoRight1 = sofubutsuAtesakiSource.kakkoRight1;
        source.samabunShimeiSmall1 = sofubutsuAtesakiSource.samabunShimeiSmall1;
        source.customerBarCode = sofubutsuAtesakiSource.customerBarCode;
        return source;
    }

    private static EditedKojin getEditedKojin(IKojin kojin, ChohyoSeigyoKyotsu 帳票制御共通) {
        return new EditedKojin(kojin, 帳票制御共通);
    }

    private static NinshoshaSource getCompNinshosha(ShakFukusHojRiysFutKeigTaisKetTsuchishoItem item) {
        return NinshoshaSourceBuilderFactory.createInstance(
                item.get認証者(), item.get地方公共団体(), item.getイメージファイルパス(), item.get発行日()).buildSource();
    }
}
