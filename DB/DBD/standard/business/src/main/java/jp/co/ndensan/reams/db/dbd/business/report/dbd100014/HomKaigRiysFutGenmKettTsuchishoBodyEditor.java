/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.business.report.dbd100014;

import java.util.List;
import jp.co.ndensan.reams.db.dbd.business.core.gemmengengaku.tokubetsuchikikasangemmen.TokubetsuchiikiKasanGemmen;
import jp.co.ndensan.reams.db.dbd.definition.core.gemmengengaku.KetteiKubun;
import jp.co.ndensan.reams.db.dbd.entity.report.dbd100014.HomKaigRiysFutGenmKettTsuchishoReportSource;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoKyotsu;
import jp.co.ndensan.reams.db.dbz.business.core.kanri.JushoHenshu;
import jp.co.ndensan.reams.db.dbz.business.report.util.EditedKojin;
import jp.co.ndensan.reams.db.dbz.definition.core.chohyo.kyotsu.TeikeibunMojiSize;
import jp.co.ndensan.reams.ua.uax.business.core.atesaki.IAtesaki;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.kojin.IKojin;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;
import jp.co.ndensan.reams.ur.urz.entity.report.sofubutsuatesaki.SofubutsuAtesakiSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 特別地域加算減免・訪問介護利用者負担減額決定通知書ボディEditorです。
 *
 * @reamsid_L DBD-3540-130 wangchao
 */
public class HomKaigRiysFutGenmKettTsuchishoBodyEditor implements IHomKaigRiysFutGenmKettTsuchishoEditor {

    private final RString 折り返す符号 = new RString("\n");
    private final RString マル = new RString("○");
    private static final int INDEX_0 = 0;
    private static final int INDEX_1 = 1;
    private static final int INDEX_2 = 2;
    private static final int INDEX_3 = 3;
    private static final int INDEX_4 = 4;
    private static final int INDEX_5 = 5;
    private static final int INDEX_6 = 6;
    private static final int INDEX_7 = 7;
    private static final int INDEX_8 = 8;
    private static final int INDEX_9 = 9;
    private static final int INDEX_10 = 10;
    private static final int INDEX_11 = 11;
    private static final int INDEX_12 = 12;
    private static final int INDEX_13 = 13;
    private static final int INDEX_14 = 14;
    private static final int INDEX_15 = 15;
    private static final int INDEX_16 = 16;
    private static final int INDEX_17 = 17;
    private static final int INDEX_18 = 18;
    private static final int INDEX_19 = 19;
    private static final int INDEX_20 = 20;
    private static final int INDEX_21 = 21;

    private final TokubetsuchiikiKasanGemmen 特別地域加算減免;
    private final IKojin iKojin;
    private final IAtesaki iAtesaki;
    private final ChohyoSeigyoKyotsu 帳票制御共通;
    private final Association 地方公共団体;
    private final RString 文書番号;
    private final List<RString> 通知書定型文List;
    private final NinshoshaSource ninshoshaSource;

    /**
     * インスタンスを生成します。
     *
     * @param 特別地域加算減免 特別地域加算減免
     * @param iKojin iKojin
     * @param iAtesaki iAtesaki
     * @param 帳票制御共通 帳票制御共通
     * @param 地方公共団体 地方公共団体
     * @param 文書番号 文書番号
     * @param 通知書定型文List 通知書定型文List
     * @param ninshoshaSource NinshoshaSource
     */
    public HomKaigRiysFutGenmKettTsuchishoBodyEditor(TokubetsuchiikiKasanGemmen 特別地域加算減免, IKojin iKojin, IAtesaki iAtesaki,
            ChohyoSeigyoKyotsu 帳票制御共通, Association 地方公共団体, RString 文書番号, List<RString> 通知書定型文List,
            NinshoshaSource ninshoshaSource) {
        this.特別地域加算減免 = 特別地域加算減免;
        this.iKojin = iKojin;
        this.iAtesaki = iAtesaki;
        this.帳票制御共通 = 帳票制御共通;
        this.地方公共団体 = 地方公共団体;
        this.文書番号 = 文書番号;
        this.通知書定型文List = 通知書定型文List;
        this.ninshoshaSource = ninshoshaSource;
    }

    /**
     * 特別地域加算減免・訪問介護利用者負担減額決定通知書ボディEditorです。
     *
     * @param source 特別地域加算減免・訪問介護利用者負担減額決定通知書Source
     * @return 特別地域加算減免・訪問介護利用者負担減額決定通知書Source
     */
    @Override
    public HomKaigRiysFutGenmKettTsuchishoReportSource edit(HomKaigRiysFutGenmKettTsuchishoReportSource source) {
        return bodyEdit(source);
    }

    private HomKaigRiysFutGenmKettTsuchishoReportSource bodyEdit(HomKaigRiysFutGenmKettTsuchishoReportSource source) {
        source.bunshoNo = 文書番号;

        source.title1 = new RString("特別地域加算に係る訪問介護利用者負担減額決定通知書");
        source.title2 = RString.EMPTY;

        set通知文(source);

        EditedKojin 編集後個人 = getEditedKojin(iKojin, 帳票制御共通, 地方公共団体);
        source.hihokenshaName = 編集後個人.get名称().getName().getColumnValue();
        source.hihokenshaNo1 = 特別地域加算減免.get被保険者番号().getColumnValue().substring(INDEX_0, INDEX_1);
        source.hihokenshaNo2 = 特別地域加算減免.get被保険者番号().getColumnValue().substring(INDEX_1, INDEX_2);
        source.hihokenshaNo3 = 特別地域加算減免.get被保険者番号().getColumnValue().substring(INDEX_2, INDEX_3);
        source.hihokenshaNo4 = 特別地域加算減免.get被保険者番号().getColumnValue().substring(INDEX_3, INDEX_4);
        source.hihokenshaNo5 = 特別地域加算減免.get被保険者番号().getColumnValue().substring(INDEX_4, INDEX_5);
        source.hihokenshaNo6 = 特別地域加算減免.get被保険者番号().getColumnValue().substring(INDEX_5, INDEX_6);
        source.hihokenshaNo7 = 特別地域加算減免.get被保険者番号().getColumnValue().substring(INDEX_6, INDEX_7);
        source.hihokenshaNo8 = 特別地域加算減免.get被保険者番号().getColumnValue().substring(INDEX_7, INDEX_8);
        source.hihokenshaNo9 = 特別地域加算減免.get被保険者番号().getColumnValue().substring(INDEX_8, INDEX_9);
        source.hihokenshaNo10 = 特別地域加算減免.get被保険者番号().getColumnValue().substring(INDEX_9, INDEX_10);
        source.ketteiYMD = 特別地域加算減免.get決定年月日().wareki().toDateString();

        if (KetteiKubun.承認する.getコード().equals(特別地域加算減免.get決定区分())) {
            source.tekiyoYMD = 特別地域加算減免.get適用開始年月日().wareki().toDateString();
            source.iken1 = new RString("（承認内容）");
            source.shoninSuru = マル;
            source.yukoYMD = 特別地域加算減免.get適用終了年月日().wareki().toDateString();
            source.kakuninNoTitle = new RString("確　認　番　号");
            source.kakuninNo1 = 特別地域加算減免.get確認番号().substring(INDEX_0, INDEX_1);
            source.kakuninNo2 = 特別地域加算減免.get確認番号().substring(INDEX_1, INDEX_2);
            source.kakuninNo3 = 特別地域加算減免.get確認番号().substring(INDEX_2, INDEX_3);
            source.kakuninNo4 = 特別地域加算減免.get確認番号().substring(INDEX_3, INDEX_4);
            source.kakuninNo5 = 特別地域加算減免.get確認番号().substring(INDEX_4, INDEX_5);
            source.kakuninNo6 = 特別地域加算減免.get確認番号().substring(INDEX_5, INDEX_6);
            source.kakuninNo7 = 特別地域加算減免.get確認番号().substring(INDEX_6, INDEX_7);
            source.kakuninNo8 = 特別地域加算減免.get確認番号().substring(INDEX_7, INDEX_8);
            source.kakuninNo9 = 特別地域加算減免.get確認番号().substring(INDEX_8, INDEX_9);
            source.kakuninNo10 = 特別地域加算減免.get確認番号().substring(INDEX_9, INDEX_10);
            source.shoninsinai = RString.EMPTY;
            source.riyu1 = RString.EMPTY;
            source.riyu2 = RString.EMPTY;
            source.riyu3 = RString.EMPTY;
            source.riyu4 = RString.EMPTY;
            source.riyu5 = RString.EMPTY;
        } else {
            source.tekiyoYMD = RString.EMPTY;
            source.iken1 = RString.EMPTY;
            source.shoninSuru = RString.EMPTY;
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
            source.shoninsinai = マル;
            List<RString> 非承認理由 = 特別地域加算減免.get非承認理由().split(折り返す符号.toString());
            source.riyu1 = get非承認理由List(INDEX_0, 非承認理由);
            source.riyu2 = get非承認理由List(INDEX_1, 非承認理由);
            source.riyu3 = get非承認理由List(INDEX_2, 非承認理由);
            source.riyu4 = get非承認理由List(INDEX_3, 非承認理由);
            source.riyu5 = get非承認理由List(INDEX_4, 非承認理由);

        }
        source.iken2 = new RString("　　　　減額率　　　").concat(特別地域加算減免.get減額率().getColumnValue().toString());
        source.iken3 = RString.EMPTY;
        source.iken4 = RString.EMPTY;
        source.iken5 = RString.EMPTY;
        source.iken6 = RString.EMPTY;
        source.iken7 = RString.EMPTY;

        if (TeikeibunMojiSize.フォント小.getコード().equals(帳票制御共通.get定型文文字サイズ())) {
            set連絡先他(source);
        } else if (TeikeibunMojiSize.フォント大.getコード().equals(帳票制御共通.get定型文文字サイズ())) {
            set連絡先他Large(source);
        } else if (TeikeibunMojiSize.フォント上小下大.getコード().equals(帳票制御共通.get定型文文字サイズ())) {
            set連絡先他上段Small(source);
            set連絡先他下段Large(source);
        } else if (TeikeibunMojiSize.フォント上大下小.getコード().equals(帳票制御共通.get定型文文字サイズ())) {
            set連絡先他上段Large(source);
            set連絡先他下段Small(source);
        }

        setCompNinshosha(source);
        setCompSofubutsuAtesaki(source);

        source.shikibetsuCode = iKojin.get識別コード().getColumnValue();
        source.hihokenshaNo = 特別地域加算減免.get被保険者番号().getColumnValue();
        return source;
    }

    private RString get非承認理由List(int i, List<RString> 非承認理由) {
        if (非承認理由.size() >= i + 1) {
            return 非承認理由.get(i);
        } else {
            return RString.EMPTY;
        }
    }

    private void set通知文(HomKaigRiysFutGenmKettTsuchishoReportSource source) {
        List<RString> 通知書定型文リスト = 通知書定型文List.get(1).split(折り返す符号.toString());
        source.tsuchibun1 = getLenStr(INDEX_0, 通知書定型文リスト);
        source.tsuchibun2 = getLenStr(INDEX_1, 通知書定型文リスト);
    }

    private void set連絡先他(HomKaigRiysFutGenmKettTsuchishoReportSource source) {
        List<RString> 通知書定型文リスト = 通知書定型文List.get(2).split(折り返す符号.toString());
        source.tsuchibun3 = getLenStr(INDEX_0, 通知書定型文リスト);
        source.tsuchibun4 = getLenStr(INDEX_1, 通知書定型文リスト);
        source.tsuchibun5 = getLenStr(INDEX_2, 通知書定型文リスト);
        source.tsuchibun6 = getLenStr(INDEX_3, 通知書定型文リスト);
        source.tsuchibun7 = getLenStr(INDEX_4, 通知書定型文リスト);
        source.tsuchibun8 = getLenStr(INDEX_5, 通知書定型文リスト);
        source.tsuchibun9 = getLenStr(INDEX_6, 通知書定型文リスト);
        source.tsuchibun10 = getLenStr(INDEX_7, 通知書定型文リスト);
        source.tsuchibun11 = getLenStr(INDEX_8, 通知書定型文リスト);
        source.tsuchibun12 = getLenStr(INDEX_9, 通知書定型文リスト);
        source.tsuchibun13 = getLenStr(INDEX_10, 通知書定型文リスト);
        source.tsuchibun14 = getLenStr(INDEX_11, 通知書定型文リスト);
        source.tsuchibun15 = getLenStr(INDEX_12, 通知書定型文リスト);
        source.tsuchibun16 = getLenStr(INDEX_13, 通知書定型文リスト);
        source.tsuchibun17 = getLenStr(INDEX_14, 通知書定型文リスト);
        source.tsuchibun18 = getLenStr(INDEX_15, 通知書定型文リスト);
        source.tsuchibun19 = getLenStr(INDEX_16, 通知書定型文リスト);
        source.tsuchibun20 = getLenStr(INDEX_17, 通知書定型文リスト);
        source.tsuchibun21 = getLenStr(INDEX_18, 通知書定型文リスト);
        source.tsuchibun22 = getLenStr(INDEX_19, 通知書定型文リスト);
        source.tsuchibun23 = getLenStr(INDEX_20, 通知書定型文リスト);
        source.tsuchibun24 = getLenStr(INDEX_21, 通知書定型文リスト);
    }

    private void set連絡先他Large(HomKaigRiysFutGenmKettTsuchishoReportSource source) {
        List<RString> 通知書定型文リスト = 通知書定型文List.get(2).split(折り返す符号.toString());
        source.tsuchibunLarge3 = getLenStr(INDEX_0, 通知書定型文リスト);
        source.tsuchibunLarge4 = getLenStr(INDEX_1, 通知書定型文リスト);
        source.tsuchibunLarge5 = getLenStr(INDEX_2, 通知書定型文リスト);
        source.tsuchibunLarge6 = getLenStr(INDEX_3, 通知書定型文リスト);
        source.tsuchibunLarge7 = getLenStr(INDEX_4, 通知書定型文リスト);
        source.tsuchibunLarge8 = getLenStr(INDEX_5, 通知書定型文リスト);
        source.tsuchibunLarge9 = getLenStr(INDEX_6, 通知書定型文リスト);
        source.tsuchibunLarge10 = getLenStr(INDEX_7, 通知書定型文リスト);
        source.tsuchibunLarge11 = getLenStr(INDEX_8, 通知書定型文リスト);
        source.tsuchibunLarge12 = getLenStr(INDEX_9, 通知書定型文リスト);
        source.tsuchibunLarge13 = getLenStr(INDEX_10, 通知書定型文リスト);
        source.tsuchibunLarge14 = getLenStr(INDEX_11, 通知書定型文リスト);
        source.tsuchibunLarge15 = getLenStr(INDEX_12, 通知書定型文リスト);
        source.tsuchibunLarge16 = getLenStr(INDEX_13, 通知書定型文リスト);
        source.tsuchibunLarge17 = getLenStr(INDEX_14, 通知書定型文リスト);
        source.tsuchibunLarge18 = getLenStr(INDEX_15, 通知書定型文リスト);
        source.tsuchibunLarge19 = getLenStr(INDEX_16, 通知書定型文リスト);
        source.tsuchibunLarge20 = getLenStr(INDEX_17, 通知書定型文リスト);
    }

    private void set連絡先他上段Small(HomKaigRiysFutGenmKettTsuchishoReportSource source) {
        List<RString> 通知書定型文リスト = 通知書定型文List.get(2).split(折り返す符号.toString());
        source.tsuchibunMix3 = getLenStr(INDEX_0, 通知書定型文リスト);
        source.tsuchibunMix4 = getLenStr(INDEX_1, 通知書定型文リスト);
        source.tsuchibunMix5 = getLenStr(INDEX_2, 通知書定型文リスト);
        source.tsuchibunMix6 = getLenStr(INDEX_3, 通知書定型文リスト);
        source.tsuchibunMix7 = getLenStr(INDEX_4, 通知書定型文リスト);
        source.tsuchibunMix8 = getLenStr(INDEX_5, 通知書定型文リスト);
        source.tsuchibunMix9 = getLenStr(INDEX_6, 通知書定型文リスト);
        source.tsuchibunMix10 = getLenStr(INDEX_7, 通知書定型文リスト);
        source.tsuchibunMix11 = getLenStr(INDEX_8, 通知書定型文リスト);
        source.tsuchibunMix12 = getLenStr(INDEX_9, 通知書定型文リスト);
        source.tsuchibunMix13 = getLenStr(INDEX_10, 通知書定型文リスト);
        source.tsuchibunMix14 = getLenStr(INDEX_11, 通知書定型文リスト);
        source.tsuchibunMix15 = getLenStr(INDEX_12, 通知書定型文リスト);

    }

    private void set連絡先他下段Large(HomKaigRiysFutGenmKettTsuchishoReportSource source) {
        List<RString> 通知書定型文リスト = 通知書定型文List.get(INDEX_3).split(折り返す符号.toString());
        source.tsuchibunMix16 = getLenStr(INDEX_0, 通知書定型文リスト);
        source.tsuchibunMix17 = getLenStr(INDEX_1, 通知書定型文リスト);
        source.tsuchibunMix18 = getLenStr(INDEX_2, 通知書定型文リスト);
        source.tsuchibunMix19 = getLenStr(INDEX_3, 通知書定型文リスト);
        source.tsuchibunMix20 = getLenStr(INDEX_4, 通知書定型文リスト);
        source.tsuchibunMix21 = getLenStr(INDEX_5, 通知書定型文リスト);
        source.tsuchibunMix22 = getLenStr(INDEX_6, 通知書定型文リスト);
    }

    private void set連絡先他上段Large(HomKaigRiysFutGenmKettTsuchishoReportSource source) {
        List<RString> 通知書定型文リスト = 通知書定型文List.get(2).split(折り返す符号.toString());
        source.tsuchibunMixtwo3 = getLenStr(INDEX_0, 通知書定型文リスト);
        source.tsuchibunMixtwo4 = getLenStr(INDEX_1, 通知書定型文リスト);
        source.tsuchibunMixtwo5 = getLenStr(INDEX_2, 通知書定型文リスト);
        source.tsuchibunMixtwo6 = getLenStr(INDEX_3, 通知書定型文リスト);
        source.tsuchibunMixtwo7 = getLenStr(INDEX_4, 通知書定型文リスト);
        source.tsuchibunMixtwo8 = getLenStr(INDEX_5, 通知書定型文リスト);
        source.tsuchibunMixtwo9 = getLenStr(INDEX_6, 通知書定型文リスト);

    }

    private void set連絡先他下段Small(HomKaigRiysFutGenmKettTsuchishoReportSource source) {
        List<RString> 通知書定型文リスト = 通知書定型文List.get(INDEX_3).split(折り返す符号.toString());
        source.tsuchibunMixtwo10 = getLenStr(INDEX_0, 通知書定型文リスト);
        source.tsuchibunMixtwo11 = getLenStr(INDEX_1, 通知書定型文リスト);
        source.tsuchibunMixtwo12 = getLenStr(INDEX_2, 通知書定型文リスト);
        source.tsuchibunMixtwo13 = getLenStr(INDEX_3, 通知書定型文リスト);
        source.tsuchibunMixtwo14 = getLenStr(INDEX_4, 通知書定型文リスト);
        source.tsuchibunMixtwo15 = getLenStr(INDEX_5, 通知書定型文リスト);
        source.tsuchibunMixtwo16 = getLenStr(INDEX_6, 通知書定型文リスト);
        source.tsuchibunMixtwo17 = getLenStr(INDEX_7, 通知書定型文リスト);
        source.tsuchibunMixtwo18 = getLenStr(INDEX_8, 通知書定型文リスト);
        source.tsuchibunMixtwo19 = getLenStr(INDEX_9, 通知書定型文リスト);
        source.tsuchibunMixtwo20 = getLenStr(INDEX_10, 通知書定型文リスト);
        source.tsuchibunMixtwo21 = getLenStr(INDEX_11, 通知書定型文リスト);
        source.tsuchibunMixtwo22 = getLenStr(INDEX_12, 通知書定型文リスト);
    }

    private RString getLenStr(int i, List<RString> 通知書定型文List) {
        if (通知書定型文List.size() >= i + 1) {
            return 通知書定型文List.get(i);
        } else {
            return RString.EMPTY;
        }
    }

    private void setCompNinshosha(HomKaigRiysFutGenmKettTsuchishoReportSource source) {
        source.denshiKoin = ninshoshaSource.denshiKoin;
        source.hakkoYMD = ninshoshaSource.hakkoYMD;
        source.ninshoshaYakushokuMei1 = ninshoshaSource.ninshoshaYakushokuMei1;
        source.koinMojiretsu = ninshoshaSource.koinMojiretsu;
        source.ninshoshaYakushokuMei2 = ninshoshaSource.ninshoshaYakushokuMei2;
        source.ninshoshaShimeiKakenai = ninshoshaSource.ninshoshaShimeiKakenai;
        source.ninshoshaShimeiKakeru = ninshoshaSource.ninshoshaShimeiKakeru;
        source.koinShoryaku = ninshoshaSource.koinShoryaku;
    }

    private void setCompSofubutsuAtesaki(HomKaigRiysFutGenmKettTsuchishoReportSource source) {
        SofubutsuAtesakiSource sofubutsuAtesakiSource;
        try {
            sofubutsuAtesakiSource = JushoHenshu.create編集後宛先(iAtesaki, 地方公共団体, 帳票制御共通).getSofubutsuAtesakiSource().get送付物宛先ソース();
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
    }

    private static EditedKojin getEditedKojin(IKojin kojin, ChohyoSeigyoKyotsu 帳票制御共通, Association 地方公共団体) {
        return new EditedKojin(kojin, 帳票制御共通, 地方公共団体);
    }
}