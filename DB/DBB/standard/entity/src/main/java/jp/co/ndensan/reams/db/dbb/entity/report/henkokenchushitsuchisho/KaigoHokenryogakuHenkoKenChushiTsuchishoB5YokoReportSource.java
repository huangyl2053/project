package jp.co.ndensan.reams.db.dbb.entity.report.henkokenchushitsuchisho;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;

/**
 * 介護保険料額変更兼特別徴収中止通知書のB5横タイプのReportSourceです。
 *
 * @reamsid_L DBB-9080-020 sunhaidi
 */
public class KaigoHokenryogakuHenkoKenChushiTsuchishoB5YokoReportSource implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportItem(name = "bunshoNo", length = 36, order = 1)
    public RString bunshoNo;
    @ReportItem(name = "tsuchiKbn", length = 8, order = 2)
    public RString tsuchiKbn;
    @ReportItem(name = "shutokuYmdMae", length = 9, order = 3)
    public RString shutokuYmdMae;
    @ReportItem(name = "shutokuYmdAto", length = 9, order = 4)
    public RString shutokuYmdAto;
    @ReportItem(name = "listKibetsu_1", length = 2, order = 5)
    public RString listKibetsu_1;
    @ReportItem(name = "listKibetsu_2", length = 2, order = 6)
    public RString listKibetsu_2;
    @ReportItem(name = "listKibetsu_3", length = 7, order = 7)
    public RString listKibetsu_3;
    @ReportItem(name = "listKibetsu_4", length = 7, order = 8)
    public RString listKibetsu_4;
    @ReportItem(name = "listKibetsu_5", length = 2, order = 9)
    public RString listKibetsu_5;
    @ReportItem(name = "listKibetsu_6", length = 2, order = 10)
    public RString listKibetsu_6;
    @ReportItem(name = "listKibetsu_7", length = 7, order = 11)
    public RString listKibetsu_7;
    @ReportItem(name = "listKibetsu_8", length = 7, order = 12)
    public RString listKibetsu_8;
    @ReportItem(name = "listZuiji_1", length = 2, order = 13)
    public RString listZuiji_1;
    @ReportItem(name = "soshitsuYmdMae", length = 9, order = 14)
    public RString soshitsuYmdMae;
    @ReportItem(name = "soshitsuYmdAto", length = 9, order = 15)
    public RString soshitsuYmdAto;
    @ReportItem(name = "tsukisuMae", length = 4, order = 16)
    public RString tsukisuMae;
    @ReportItem(name = "tsukisuAto", length = 4, order = 17)
    public RString tsukisuAto;
    @ReportItem(name = "shotokuKbnMae", length = 5, order = 18)
    public RString shotokuKbnMae;
    @ReportItem(name = "shotokuKbnAto", length = 5, order = 19)
    public RString shotokuKbnAto;
    @ReportItem(name = "hokenRitsuMae", length = 7, order = 20)
    public RString hokenRitsuMae;
    @ReportItem(name = "hokenRitsuAto", length = 7, order = 21)
    public RString hokenRitsuAto;
    @ReportItem(name = "hokenSanshutsuMae", length = 7, order = 22)
    public RString hokenSanshutsuMae;
    @ReportItem(name = "hokenSanshutsuAto", length = 7, order = 23)
    public RString hokenSanshutsuAto;
    @ReportItem(name = "genmenMae", length = 7, order = 24)
    public RString genmenMae;
    @ReportItem(name = "genmenAto", length = 7, order = 25)
    public RString genmenAto;
    @ReportItem(name = "birthYMD", length = 11, order = 26)
    public RString birthYMD;
    @ReportItem(name = "seibetsu", length = 1, order = 27)
    public RString seibetsu;
    @ReportItem(name = "hokenGakuMae", length = 7, order = 28)
    public RString hokenGakuMae;
    @ReportItem(name = "hokenGakuAto", length = 7, order = 29)
    public RString hokenGakuAto;
    @ReportItem(name = "hyojicodeName1", length = 8, order = 30)
    public RString hyojicodeName1;
    @ReportItem(name = "hyojicodeName2", length = 8, order = 31)
    public RString hyojicodeName2;
    @ReportItem(name = "hyojicodeName3", length = 8, order = 32)
    public RString hyojicodeName3;
    @ReportItem(name = "zogenGaku", length = 8, order = 33)
    public RString zogenGaku;
    @ReportItem(name = "nofuzumiGaku", length = 7, order = 34)
    public RString nofuzumiGaku;
    @ReportItem(name = "hyojicode1", length = 11, order = 35)
    public RString hyojicode1;
    @ReportItem(name = "hyojicode2", length = 11, order = 36)
    public RString hyojicode2;
    @ReportItem(name = "hyojicode3", length = 11, order = 37)
    public RString hyojicode3;
    @ReportItem(name = "tsuchishoNo", order = 38)
    public RString tsuchishoNo;
    @ReportItem(name = "setaiCode", length = 15, order = 39)
    public RString setaiCode;
    @ReportItem(name = "hihokenshaNo", length = 10, order = 40)
    public RString hihokenshaNo;
    @ReportItem(name = "shikibetsuCode", length = 15, order = 41)
    public RString shikibetsuCode;
    @ReportItem(name = "listShotokuDankai_1", length = 2, order = 42)
    public RString listShotokuDankai_1;
    @ReportItem(name = "listShotokuDankai_2", length = 2, order = 43)
    public RString listShotokuDankai_2;
    @ReportItem(name = "listShotokuDankai_3", length = 2, order = 44)
    public RString listShotokuDankai_3;
    @ReportItem(name = "listShotokuDankai_4", length = 2, order = 45)
    public RString listShotokuDankai_4;
    @ReportItem(name = "listShotokuDankai_5", length = 2, order = 46)
    public RString listShotokuDankai_5;
    @ReportItem(name = "listShotokuDankai_6", length = 2, order = 47)
    public RString listShotokuDankai_6;
    @ReportItem(name = "listShotokuDankai_7", length = 2, order = 48)
    public RString listShotokuDankai_7;
    @ReportItem(name = "listShotokuDankai_8", length = 2, order = 49)
    public RString listShotokuDankai_8;
    @ReportItem(name = "listShotokuDankai_9", length = 2, order = 50)
    public RString listShotokuDankai_9;
    @ReportItem(name = "listShotokuDankai_10", length = 2, order = 51)
    public RString listShotokuDankai_10;
    @ReportItem(name = "listShotokuDankai_11", length = 2, order = 52)
    public RString listShotokuDankai_11;
    @ReportItem(name = "listShotokuDankai_12", length = 2, order = 53)
    public RString listShotokuDankai_12;
    @ReportItem(name = "choteiNendo", length = 6, order = 54)
    public RString choteiNendo;
    @ReportItem(name = "title1", length = 24, order = 55)
    public RString title1;
    @ReportItem(name = "title3", length = 22, order = 56)
    public RString title3;
    @ReportItem(name = "title2", length = 18, order = 57)
    public RString title2;
    @ReportItem(name = "kongoNofuSubekiGaku", length = 9, order = 58)
    public RString kongoNofuSubekiGaku;
    @ReportItem(name = "mitoraikiNofuzumiGaku", length = 9, order = 59)
    public RString mitoraikiNofuzumiGaku;
    @ReportItem(name = "tsuchibun1", order = 60)
    public RString tsuchibun1;
    @ReportItem(name = "tsuchibun2", order = 61)
    public RString tsuchibun2;
    @ReportItem(name = "koremadeChoshuho", length = 17, order = 62)
    public RString koremadeChoshuho;
    @ReportItem(name = "korekaraChoshuho", length = 17, order = 63)
    public RString korekaraChoshuho;
    @ReportItem(name = "koremadeTokuchoGimusha", length = 20, order = 64)
    public RString koremadeTokuchoGimusha;
    @ReportItem(name = "korekaraTokuchoGimusha", length = 20, order = 65)
    public RString korekaraTokuchoGimusha;
    @ReportItem(name = "koremadeTokuchoTaishoNenkin", length = 20, order = 66)
    public RString koremadeTokuchoTaishoNenkin;
    @ReportItem(name = "korekaraTokuchoTaishoNenkin", length = 20, order = 67)
    public RString korekaraTokuchoTaishoNenkin;
    @ReportItem(name = "bankCode", length = 7, order = 68)
    public RString bankCode;
    @ReportItem(name = "kozaNo", length = 14, order = 69)
    public RString kozaNo;
    @ReportItem(name = "bankName", order = 70)
    public RString bankName;
    @ReportItem(name = "koseiNaiyo", length = 6, order = 71)
    public RString koseiNaiyo;
    @ReportItem(name = "koseiNaiyo2", length = 38, order = 72)
    public RString koseiNaiyo2;
    @ReportItem(name = "kakuteiHokenryoGaku", length = 7, order = 73)
    public RString kakuteiHokenryoGaku;
    @ReportItem(name = "koseiRiyu", length = 9, order = 74)
    public RString koseiRiyu;
    @ReportItem(name = "kozaShurui", length = 3, order = 75)
    public RString kozaShurui;
    @ReportItem(name = "kozaMeigi", order = 76)
    public RString kozaMeigi;
    @ReportItem(name = "choteiJiyu1", length = 40, order = 77)
    public RString choteiJiyu1;
    @ReportItem(name = "choteiJiyu2", length = 40, order = 78)
    public RString choteiJiyu2;
    @ReportItem(name = "choteiJiyu3", length = 40, order = 79)
    public RString choteiJiyu3;
    @ReportItem(name = "choteiJiyu4", length = 40, order = 80)
    public RString choteiJiyu4;
    @ReportItem(name = "gekinenkanwaHeader", length = 25, order = 81)
    public RString gekinenkanwaHeader;
    @ReportItem(name = "gekihenkanwaMongon", length = 25, order = 82)
    public RString gekihenkanwaMongon;
    @ReportItem(name = "yubinNo1", length = 8, order = 83)
    public RString yubinNo1;
    @ReportItem(name = "gyoseiku1", length = 14, order = 84)
    public RString gyoseiku1;
    @ReportItem(name = "jusho3", length = 20, order = 85)
    public RString jusho3;
    @ReportItem(name = "jushoText", order = 86)
    public RString jushoText;
    @ReportItem(name = "jusho1", length = 20, order = 87)
    public RString jusho1;
    @ReportItem(name = "jusho2", length = 20, order = 88)
    public RString jusho2;
    @ReportItem(name = "katagakiText", order = 89)
    public RString katagakiText;
    @ReportItem(name = "katagaki2", length = 20, order = 90)
    public RString katagaki2;
    @ReportItem(name = "katagakiSmall2", length = 30, order = 91)
    public RString katagakiSmall2;
    @ReportItem(name = "katagaki1", length = 20, order = 92)
    public RString katagaki1;
    @ReportItem(name = "katagakiSmall1", length = 30, order = 93)
    public RString katagakiSmall1;
    @ReportItem(name = "shimei2", length = 20, order = 94)
    public RString shimei2;
    @ReportItem(name = "shimeiSmall2", length = 40, order = 95)
    public RString shimeiSmall2;
    @ReportItem(name = "shimeiText", order = 96)
    public RString shimeiText;
    @ReportItem(name = "meishoFuyo2", length = 3, order = 97)
    public RString meishoFuyo2;
    @ReportItem(name = "shimeiSmall1", length = 40, order = 98)
    public RString shimeiSmall1;
    @ReportItem(name = "dainoKubunMei", length = 8, order = 99)
    public RString dainoKubunMei;
    @ReportItem(name = "shimei1", length = 20, order = 100)
    public RString shimei1;
    @ReportItem(name = "meishoFuyo1", length = 3, order = 101)
    public RString meishoFuyo1;
    @ReportItem(name = "samabunShimeiText", order = 102)
    public RString samabunShimeiText;
    @ReportItem(name = "samaBun2", length = 3, order = 103)
    public RString samaBun2;
    @ReportItem(name = "samabunShimeiSmall2", length = 40, order = 104)
    public RString samabunShimeiSmall2;
    @ReportItem(name = "kakkoLeft2", length = 1, order = 105)
    public RString kakkoLeft2;
    @ReportItem(name = "samabunShimei2", length = 20, order = 106)
    public RString samabunShimei2;
    @ReportItem(name = "kakkoRight2", length = 1, order = 107)
    public RString kakkoRight2;
    @ReportItem(name = "kakkoLeft1", length = 1, order = 108)
    public RString kakkoLeft1;
    @ReportItem(name = "samabunShimei1", length = 20, order = 109)
    public RString samabunShimei1;
    @ReportItem(name = "samaBun1", length = 3, order = 110)
    public RString samaBun1;
    @ReportItem(name = "kakkoRight1", length = 1, order = 111)
    public RString kakkoRight1;
    @ReportItem(name = "samabunShimeiSmall1", length = 40, order = 112)
    public RString samabunShimeiSmall1;
    @ReportItem(name = "customerBarCode", order = 113)
    public RString customerBarCode;
    @ReportItem(name = "denshiKoin", order = 114)
    public RString denshiKoin;
    @ReportItem(name = "hakkoYMD", length = 12, order = 115)
    public RString hakkoYMD;
    @ReportItem(name = "ninshoshaYakushokuMei", length = 15, order = 116)
    public RString ninshoshaYakushokuMei;
    @ReportItem(name = "koinMojiretsu", length = 4, order = 117)
    public RString koinMojiretsu;
    @ReportItem(name = "ninshoshaShimeiKakeru", order = 118)
    public RString ninshoshaShimeiKakeru;
    @ReportItem(name = "ninshoshaShimeiKakenai", order = 119)
    public RString ninshoshaShimeiKakenai;
    @ReportItem(name = "koinShoryaku", length = 15, order = 120)
    public RString koinShoryaku;
    @ReportItem(name = "yubinBango", length = 8, order = 121)
    public RString yubinBango;
    @ReportItem(name = "shozaichi", order = 122)
    public RString shozaichi;
    @ReportItem(name = "choshaBushoName", order = 123)
    public RString choshaBushoName;
    @ReportItem(name = "tantoName", order = 124)
    public RString tantoName;
    @ReportItem(name = "telNo", length = 20, order = 125)
    public RString telNo;
    @ReportItem(name = "naisenLabel", length = 4, order = 126)
    public RString naisenLabel;
    @ReportItem(name = "naisenNo", length = 20, order = 127)
    public RString naisenNo;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    //追加コードは以下（「User Customize Area」内）に記述してください。
    //帳票ソースデータクラスを再作成する場合は、「User Customize Area」内のソースコードは記述されません。
    //再作成した後、当箇所に記述したコードを再作成された帳票ソースデータクラスの「User Customize Area」内にコピー＆ペーストする必要があります。
// </editor-fold>
}
