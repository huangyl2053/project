/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.business.report.dbd100005;

import java.util.Map;
import jp.co.ndensan.reams.db.dbd.business.core.shiharaihohohenko.ShiharaiHohoHenko;
import jp.co.ndensan.reams.db.dbd.business.core.shiharaihohohenko.gengaku.ShiharaiHohoHenkoGengaku;
import jp.co.ndensan.reams.db.dbd.business.core.shiharaihohohenko.gengaku.meisai.ShiharaiHohoHenkoGengakuMeisai;
import jp.co.ndensan.reams.db.dbd.entity.report.dbd100005.KyufugakuGengakuTsuchishoReportSource;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoKyotsu;
import jp.co.ndensan.reams.db.dbz.business.core.kanri.JushoHenshu;
import jp.co.ndensan.reams.db.dbz.business.report.util.EditedAtesaki;
import jp.co.ndensan.reams.db.dbz.business.report.util.EditedKojin;
import jp.co.ndensan.reams.ua.uax.business.core.atesaki.IAtesaki;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.kojin.IKojin;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;
import jp.co.ndensan.reams.ur.urz.entity.report.sofubutsuatesaki.SofubutsuAtesakiSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.editor.DecimalFormatter;

/**
 *
 * 給付額減額通知書
 *
 * @reamsid_L DBD-3640-060 b_liuyang2
 */
public class KyufugakuGengakuTsuchishoEditor implements IKyufugakuGengakuTsuchishoEditor {

    private static final int NOCOUNT_1 = 1;
    private static final int NOCOUNT_2 = 2;
    private static final int NOCOUNT_3 = 3;
    private static final int NOCOUNT_4 = 4;
    private static final int NOCOUNT_5 = 5;
    private static final int NOCOUNT_6 = 6;
    private static final int NOCOUNT_7 = 7;
    private static final int NOCOUNT_8 = 8;
    private static final int NOCOUNT_9 = 9;
    private static final int NOCOUNT_10 = 10;

    private final IKojin 個人情報;
    private final IAtesaki 宛先;
    private final ChohyoSeigyoKyotsu 帳票制御共通;
    private final Association 地方公共団体;
    private final RString 文書番号;
    private final Map<Integer, RString> 通知書定型文リスト;
    private final NinshoshaSource 認証者ソースビルダー;
    private final ShiharaiHohoHenko 帳票情報;
    private final int index;

    /**
     * インスタンスを生成します。
     *
     * @param 個人情報 IKojin
     * @param 宛先 IAtesaki
     * @param 帳票制御共通 ChohyoSeigyoKyotsu
     * @param 地方公共団体 Association
     * @param 文書番号 RString
     * @param 通知書定型文リスト Map<Integer, RString>
     * @param 認証者ソースビルダー NinshoshaSource
     * @param 帳票情報 ShiharaiHohoHenko
     * @param index int
     *
     */
    public KyufugakuGengakuTsuchishoEditor(IKojin 個人情報, IAtesaki 宛先, ChohyoSeigyoKyotsu 帳票制御共通,
            Association 地方公共団体, RString 文書番号, Map<Integer, RString> 通知書定型文リスト,
            NinshoshaSource 認証者ソースビルダー, ShiharaiHohoHenko 帳票情報, int index) {
        this.個人情報 = 個人情報;
        this.宛先 = 宛先;
        this.帳票制御共通 = 帳票制御共通;
        this.地方公共団体 = 地方公共団体;
        this.文書番号 = 文書番号;
        this.通知書定型文リスト = 通知書定型文リスト;
        this.認証者ソースビルダー = 認証者ソースビルダー;
        this.帳票情報 = 帳票情報;
        this.index = index;

    }

    @Override
    public KyufugakuGengakuTsuchishoReportSource edit(KyufugakuGengakuTsuchishoReportSource source) {

        setCompSofubutsuAtesaki(source);
        setCompNinshosha(source);
        setLayer1(source);
        setKyufugakuGengaku(source);
        setLayerFontLarge(source);
        setLayerFontKonzai(source);
        setLayerFontKonzai2(source);
        setAccessLogEditor(source);
        return source;
    }

    private void setCompSofubutsuAtesaki(KyufugakuGengakuTsuchishoReportSource source) {
        EditedAtesaki 編集後宛先 = JushoHenshu.create編集後宛先(this.宛先, this.地方公共団体, this.帳票制御共通);
        SofubutsuAtesakiSource sofubutsuAtesakiSource;
        try {
            sofubutsuAtesakiSource = 編集後宛先.getSofubutsuAtesakiSource().get送付物宛先ソース();
        } catch (Exception e) {
            sofubutsuAtesakiSource = new SofubutsuAtesakiSource();
        }
        source.yubinNo = sofubutsuAtesakiSource.yubinNo;
        source.gyoseiku1 = sofubutsuAtesakiSource.gyoseiku;
        source.jushoText = sofubutsuAtesakiSource.jushoText;
        source.katagakiText = sofubutsuAtesakiSource.katagakiText;
        source.shimei3 = sofubutsuAtesakiSource.shimei1;
        source.shimei4 = sofubutsuAtesakiSource.shimei2;
        source.katagaki3 = sofubutsuAtesakiSource.katagaki1;
        source.katagaki4 = sofubutsuAtesakiSource.katagaki2;
        source.jusho4 = sofubutsuAtesakiSource.jusho1;
        source.jusho5 = sofubutsuAtesakiSource.jusho2;
        source.jusho6 = sofubutsuAtesakiSource.jusho3;
        source.dainoKubunMei = sofubutsuAtesakiSource.dainoKubunMei;
        source.samabunShimeiText = sofubutsuAtesakiSource.samabunShimeiText;
        source.kakkoLeft1 = sofubutsuAtesakiSource.kakkoLeft1;
        source.kakkoLeft2 = sofubutsuAtesakiSource.kakkoLeft2;
        source.kakkoRight1 = sofubutsuAtesakiSource.kakkoRight1;
        source.kakkoRight2 = sofubutsuAtesakiSource.kakkoRight2;
        source.samaBun1 = sofubutsuAtesakiSource.samaBun1;
        source.samaBun2 = sofubutsuAtesakiSource.samaBun2;
        source.customerBarCode = sofubutsuAtesakiSource.customerBarCode;
        source.katagakiSmall1 = sofubutsuAtesakiSource.katagakiSmall1;
        source.katagakiSmall2 = sofubutsuAtesakiSource.katagakiSmall2;
        source.meishoFuyo1 = sofubutsuAtesakiSource.meishoFuyo1;
        source.meishoFuyo2 = sofubutsuAtesakiSource.meishoFuyo2;
        source.samabunShimei1 = sofubutsuAtesakiSource.samabunShimei1;
        source.samabunShimei2 = sofubutsuAtesakiSource.samabunShimei2;
        source.samabunShimeiSmall1 = sofubutsuAtesakiSource.samabunShimeiSmall1;
        source.samabunShimeiSmall2 = sofubutsuAtesakiSource.samabunShimeiSmall2;
        source.shimeiSmall1 = sofubutsuAtesakiSource.shimeiSmall1;
        source.shimeiSmall2 = sofubutsuAtesakiSource.shimeiSmall2;
        source.shimeiText = sofubutsuAtesakiSource.shimeiText;
    }

    private void setCompNinshosha(KyufugakuGengakuTsuchishoReportSource source) {
        source.denshiKoin = 認証者ソースビルダー.denshiKoin;
        source.hakkoYMD = 認証者ソースビルダー.hakkoYMD;
        source.ninshoshaYakushokuMei = 認証者ソースビルダー.ninshoshaYakushokuMei;
        source.ninshoshaYakushokuMei1 = 認証者ソースビルダー.ninshoshaYakushokuMei1;
        source.koinMojiretsu = 認証者ソースビルダー.koinMojiretsu;
        source.ninshoshaYakushokuMei2 = 認証者ソースビルダー.ninshoshaYakushokuMei2;
        source.ninshoshaShimeiKakenai = 認証者ソースビルダー.ninshoshaShimeiKakenai;
        source.ninshoshaShimeiKakeru = 認証者ソースビルダー.ninshoshaShimeiKakeru;
        source.koinShoryaku = 認証者ソースビルダー.koinShoryaku;
    }

    private void setLayer1(KyufugakuGengakuTsuchishoReportSource source) {
        source.bunshoNo = this.文書番号;
        EditedKojin 編集後個人 = getEditedKojin(this.個人情報, this.帳票制御共通, this.地方公共団体);
        if (null != 編集後個人) {
            source.hihokenshaName = 編集後個人.get名称().getName().getColumnValue();
        }
        if (null != 帳票情報) {
            RString 被保険者番号 = this.帳票情報.get被保険者番号().getColumnValue();
            source.hihokenshaNo1 = 被保険者番号.substring(0, NOCOUNT_1);
            source.hihokenshaNo2 = 被保険者番号.substring(NOCOUNT_1, NOCOUNT_2);
            source.hihokenshaNo3 = 被保険者番号.substring(NOCOUNT_2, NOCOUNT_3);
            source.hihokenshaNo4 = 被保険者番号.substring(NOCOUNT_3, NOCOUNT_4);
            source.hihokenshaNo5 = 被保険者番号.substring(NOCOUNT_4, NOCOUNT_5);
            source.hihokenshaNo6 = 被保険者番号.substring(NOCOUNT_5, NOCOUNT_6);
            source.hihokenshaNo7 = 被保険者番号.substring(NOCOUNT_6, NOCOUNT_7);
            source.hihokenshaNo8 = 被保険者番号.substring(NOCOUNT_7, NOCOUNT_8);
            source.hihokenshaNo9 = 被保険者番号.substring(NOCOUNT_8, NOCOUNT_9);
            source.hihokenshaNo10 = 被保険者番号.substring(NOCOUNT_9, NOCOUNT_10);
        }

        RString 定型文文字サイズ = this.帳票制御共通.get定型文文字サイズ();
        if (null != 通知書定型文リスト && !通知書定型文リスト.isEmpty()) {
            source.tsuchibun = 通知書定型文リスト.get(NOCOUNT_1);
            if (new RString("1").equals(定型文文字サイズ)) {
                source.renrakusakiHoka = 通知書定型文リスト.get(NOCOUNT_2);
            }
        }
    }

    private void setKyufugakuGengaku(KyufugakuGengakuTsuchishoReportSource source) {
        ShiharaiHohoHenkoGengaku 支払方法変更情報 = this.帳票情報.getShiharaiHohoHenkoGengakuList().get(0);
        ShiharaiHohoHenkoGengakuMeisai 支払方法変更減額明細 = 支払方法変更情報.getShiharaiHohoHenkoGengakuMeisaiList().get(index);
        if (null != this.帳票情報.getShiharaiHohoHenkoGengakuList()) {
            source.gengakuKikan = 支払方法変更情報.get確定減額期間開始年月日().wareki().toDateString().concat("~").
                    concat(支払方法変更情報.get確定減額期間終了年月日().wareki().toDateString());
            source.listTainoJokyo_1 = 支払方法変更減額明細.get対象年度().toDateString();
            source.listTainoJokyo_2 = DecimalFormatter.toコンマ区切りRString(支払方法変更減額明細.get未納_時効消滅減額(), 0);
            source.listTainoJokyo_3 = DecimalFormatter.toコンマ区切りRString(支払方法変更減額明細.get納付額(), 0);
            source.listTainoJokyo_4 = DecimalFormatter.toコンマ区切りRString(支払方法変更減額明細.get年賦課額(), 0);
        }
        source.santeiKonkyoKikan1 = new RString("徴収権消滅期間：（未納・時効消滅額／年賦課額）＋（未納・時効消滅額／年賦課額）＋・・");
        source.shometsuKikan = DecimalFormatter.toコンマ区切りRString(支払方法変更情報.get徴収権消滅期間(), 0);
        source.santeiKonkyoKikan2 = new RString("納付済期間：（納付額／年賦課額）＋（納付額／年賦課額）＋・・・・・・・・・・・・・・");
        source.sumiKikan = DecimalFormatter.toコンマ区切りRString(支払方法変更情報.get納付済期間(), 0);
        source.calGengakuKikan = new RString("給付額減額期間＝徴収権消滅期間*徴収権消滅期間/(徴収権消滅期間＋納付済期間)/2*12");
        source.shometsuKikana = DecimalFormatter.toコンマ区切りRString(支払方法変更情報.get徴収権消滅期間(), 0);
        source.shometsuKikanb = DecimalFormatter.toコンマ区切りRString(支払方法変更情報.get徴収権消滅期間(), 0);
        source.shometsuKikanc = DecimalFormatter.toコンマ区切りRString(支払方法変更情報.get徴収権消滅期間(), 0);
        source.sumiKikana = DecimalFormatter.toコンマ区切りRString(支払方法変更情報.get納付済期間(), 0);
    }

    private void setLayerFontLarge(KyufugakuGengakuTsuchishoReportSource source) {
        RString 定型文文字サイズ = this.帳票制御共通.get定型文文字サイズ();
        if (null != 通知書定型文リスト && !通知書定型文リスト.isEmpty() && new RString("2").equals(定型文文字サイズ)) {
            source.renrakusakiHokaLarge = 通知書定型文リスト.get(NOCOUNT_2);
        }
    }

    private void setLayerFontKonzai(KyufugakuGengakuTsuchishoReportSource source) {
        if (null != 帳票制御共通) {
            RString 定型文文字サイズ = this.帳票制御共通.get定型文文字サイズ();
            if (null != 通知書定型文リスト && !通知書定型文リスト.isEmpty() && new RString("3").equals(定型文文字サイズ)) {
                source.renrakusakiHokaJodanSmall = 通知書定型文リスト.get(NOCOUNT_2);
                source.renrakusakiHokaGedanLarge = 通知書定型文リスト.get(NOCOUNT_3);
            }
        }
    }

    private void setLayerFontKonzai2(KyufugakuGengakuTsuchishoReportSource source) {
        if (null != 帳票制御共通) {
            RString 定型文文字サイズ = this.帳票制御共通.get定型文文字サイズ();
            if (null != 通知書定型文リスト && !通知書定型文リスト.isEmpty() && new RString("4").equals(定型文文字サイズ)) {
                source.renrakusakiHokaJodanLarge = 通知書定型文リスト.get(NOCOUNT_2);
                source.renrakusakiHokaGedanSmall = 通知書定型文リスト.get(NOCOUNT_3);
            }
        }
    }

    private static EditedKojin getEditedKojin(IKojin 個人情報, ChohyoSeigyoKyotsu 帳票制御共通, Association 地方公共団体) {
        return new EditedKojin(個人情報, 帳票制御共通, 地方公共団体);
    }

    private void setAccessLogEditor(KyufugakuGengakuTsuchishoReportSource source) {
        source.shikibetsuCode = this.個人情報.get識別コード().getColumnValue();
        source.hihokenshaNo = this.帳票情報.get被保険者番号().getColumnValue();

    }

}