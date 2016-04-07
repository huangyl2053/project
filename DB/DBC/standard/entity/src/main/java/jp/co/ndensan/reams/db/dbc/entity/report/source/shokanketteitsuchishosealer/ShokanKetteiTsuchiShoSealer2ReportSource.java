/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.report.source.shokanketteitsuchishosealer;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;

/**
 * 償還払支給（不支給）決定通知書（ｼｰﾗﾀｲﾌﾟ2）のReportSourceです。
 *
 * @reamsid_L DBC-1000-140 hezhenzhen
 *
 */
public class ShokanKetteiTsuchiShoSealer2ReportSource implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportItem(name = "bunshoNo", length = 36, order = 1)
    public RString bunshoNo;
    @ReportItem(name = "tsuban", length = 4, order = 2)
    public RString tsuban;
    @ReportItem(name = "title", length = 70, order = 3)
    public RString title;
    @ReportItem(name = "title2_1", length = 7, order = 4)
    public RString title2_1;
    @ReportItem(name = "title2_2_1", length = 2, order = 5)
    public RString title2_2_1;
    @ReportItem(name = "title2_2_2", length = 2, order = 6)
    public RString title2_2_2;
    @ReportItem(name = "title2_3_1", length = 5, order = 7)
    public RString title2_3_1;
    @ReportItem(name = "title2_3_2", length = 5, order = 8)
    public RString title2_3_2;
    @ReportItem(name = "title2_4", length = 5, order = 9)
    public RString title2_4;
    @ReportItem(name = "hihokenshaName", order = 10)
    public RString hihokenshaName;
    @ReportItem(name = "hihokenshaNo1", length = 1, order = 11)
    public RString hihokenshaNo1;
    @ReportItem(name = "hihokenshaNo2", length = 1, order = 12)
    public RString hihokenshaNo2;
    @ReportItem(name = "hihokenshaNo3", length = 1, order = 13)
    public RString hihokenshaNo3;
    @ReportItem(name = "hihokenshaNo4", length = 1, order = 14)
    public RString hihokenshaNo4;
    @ReportItem(name = "hihokenshaNo5", length = 1, order = 15)
    public RString hihokenshaNo5;
    @ReportItem(name = "hihokenshaNo6", length = 1, order = 16)
    public RString hihokenshaNo6;
    @ReportItem(name = "hihokenshaNo7", length = 1, order = 17)
    public RString hihokenshaNo7;
    @ReportItem(name = "hihokenshaNo8", length = 1, order = 18)
    public RString hihokenshaNo8;
    @ReportItem(name = "hihokenshaNo9", length = 1, order = 19)
    public RString hihokenshaNo9;
    @ReportItem(name = "hihokenshaNo10", length = 1, order = 20)
    public RString hihokenshaNo10;
    @ReportItem(name = "uketsukeYMD", length = 11, order = 21)
    public RString uketsukeYMD;
    @ReportItem(name = "ketteiYMD", length = 11, order = 22)
    public RString ketteiYMD;
    @ReportItem(name = "shiharaiGaku", length = 14, order = 23)
    public RString shiharaiGaku;
    @ReportItem(name = "taishoYM", length = 11, order = 24)
    public RString taishoYM;
    @ReportItem(name = "kyufuShurui1", length = 76, order = 25)
    public RString kyufuShurui1;
    @ReportItem(name = "kyufuShurui2", length = 76, order = 26)
    public RString kyufuShurui2;
    @ReportItem(name = "kyufuShurui3", length = 76, order = 27)
    public RString kyufuShurui3;
    @ReportItem(name = "kekka", length = 30, order = 28)
    public RString kekka;
    @ReportItem(name = "shikyuGaku", length = 14, order = 29)
    public RString shikyuGaku;
    @ReportItem(name = "riyu1", length = 76, order = 30)
    public RString riyu1;
    @ReportItem(name = "riyuTitle", length = 12, order = 31)
    public RString riyuTitle;
    @ReportItem(name = "riyu2", length = 76, order = 32)
    public RString riyu2;
    @ReportItem(name = "riyu3", length = 76, order = 33)
    public RString riyu3;
    @ReportItem(name = "torikeshi1", length = 14, order = 34)
    public RString torikeshi1;
    @ReportItem(name = "torikeshi2", length = 14, order = 35)
    public RString torikeshi2;
    @ReportItem(name = "mochimono1", length = 30, order = 36)
    public RString mochimono1;
    @ReportItem(name = "bankName", length = 30, order = 37)
    public RString bankName;
    @ReportItem(name = "torikeshiMochimono1", length = 12, order = 38)
    public RString torikeshiMochimono1;
    @ReportItem(name = "mochimono2", length = 30, order = 39)
    public RString mochimono2;
    @ReportItem(name = "torikeshiMochimono2", length = 12, order = 40)
    public RString torikeshiMochimono2;
    @ReportItem(name = "branchBankName", order = 41)
    public RString branchBankName;
    @ReportItem(name = "mochimono3", length = 30, order = 42)
    public RString mochimono3;
    @ReportItem(name = "torikeshiShiharaibasho", length = 12, order = 43)
    public RString torikeshiShiharaibasho;
    @ReportItem(name = "shiharaiBasho", order = 44)
    public RString shiharaiBasho;
    @ReportItem(name = "shumokuTitle", length = 8, order = 45)
    public RString shumokuTitle;
    @ReportItem(name = "kouzaShu", length = 30, order = 46)
    public RString kouzaShu;
    @ReportItem(name = "ShoHokenshaNo", length = 6, order = 47)
    public RString shoHokenshaNo;
    @ReportItem(name = "hihokenshaNo21", length = 10, order = 48)
    public RString hihokenshaNo21;
    @ReportItem(name = "ServiceYM", length = 6, order = 49)
    public RString serviceYM;
    @ReportItem(name = "Tsuban2", length = 4, order = 50)
    public RString tsuban2;
    @ReportItem(name = "bangoTitle", length = 8, order = 51)
    public RString bangoTitle;
    @ReportItem(name = "kouzaNo", length = 10, order = 52)
    public RString kouzaNo;
    @ReportItem(name = "shiharaiStartYMD", length = 17, order = 53)
    public RString shiharaiStartYMD;
    @ReportItem(name = "torikeshiShiharaikikan", length = 12, order = 54)
    public RString torikeshiShiharaikikan;
    @ReportItem(name = "shiharaiEndYMD", length = 14, order = 55)
    public RString shiharaiEndYMD;
    @ReportItem(name = "kouzaMeigi ", order = 56)
    public RString kouzaMeigi;
    @ReportItem(name = "shiharaiStartHMS", length = 12, order = 57)
    public RString shiharaiStartHMS;
    @ReportItem(name = "karaFugo", length = 2, order = 58)
    public RString karaFugo;
    @ReportItem(name = "shiharaiEndHMS", length = 12, order = 59)
    public RString shiharaiEndHMS;
    @ReportItem(name = "hakkoYMD", length = 12, order = 60)
    public RString hakkoYMD;
    @ReportItem(name = "denshiKoin", order = 61)
    public RString denshiKoin;
    @ReportItem(name = "ninshoshaYakushokuMei", length = 15, order = 62)
    public RString ninshoshaYakushokuMei;
    @ReportItem(name = "ninshoshaYakushokuMei1", order = 63)
    public RString ninshoshaYakushokuMei1;
    @ReportItem(name = "koinMojiretsu", length = 4, order = 64)
    public RString koinMojiretsu;
    @ReportItem(name = "ninshoshaYakushokuMei2", order = 65)
    public RString ninshoshaYakushokuMei2;
    @ReportItem(name = "ninshoshaShimeiKakenai", order = 66)
    public RString ninshoshaShimeiKakenai;
    @ReportItem(name = "ninshoshaShimeiKakeru", order = 67)
    public RString ninshoshaShimeiKakeru;
    @ReportItem(name = "koinShoryaku", length = 15, order = 68)
    public RString koinShoryaku;
    @ReportItem(name = "yubinNo", length = 8, order = 69)
    public RString yubinNo;
    @ReportItem(name = "gyoseiku2", length = 14, order = 70)
    public RString gyoseiku2;
    @ReportItem(name = "jusho4", length = 20, order = 71)
    public RString jusho4;
    @ReportItem(name = "jushoText", order = 72)
    public RString jushoText;
    @ReportItem(name = "jusho5", length = 20, order = 73)
    public RString jusho5;
    @ReportItem(name = "jusho6", length = 20, order = 74)
    public RString jusho6;
    @ReportItem(name = "katagakiText", order = 75)
    public RString katagakiText;
    @ReportItem(name = "katagaki3", length = 20, order = 76)
    public RString katagaki3;
    @ReportItem(name = "katagakiSmall2", length = 30, order = 77)
    public RString katagakiSmall2;
    @ReportItem(name = "katagaki4", length = 20, order = 78)
    public RString katagaki4;
    @ReportItem(name = "katagakiSmall1", length = 30, order = 79)
    public RString katagakiSmall1;
    @ReportItem(name = "shimei5", length = 20, order = 80)
    public RString shimei5;
    @ReportItem(name = "shimeiSmall2", length = 40, order = 81)
    public RString shimeiSmall2;
    @ReportItem(name = "shimeiText", order = 82)
    public RString shimeiText;
    @ReportItem(name = "meishoFuyo2", length = 3, order = 83)
    public RString meishoFuyo2;
    @ReportItem(name = "shimeiSmall1", length = 40, order = 84)
    public RString shimeiSmall1;
    @ReportItem(name = "dainoKubunMei", length = 8, order = 85)
    public RString dainoKubunMei;
    @ReportItem(name = "shimei6", length = 20, order = 86)
    public RString shimei6;
    @ReportItem(name = "meishoFuyo1", length = 3, order = 87)
    public RString meishoFuyo1;
    @ReportItem(name = "samabunShimeiText", order = 88)
    public RString samabunShimeiText;
    @ReportItem(name = "samaBun2", length = 3, order = 89)
    public RString samaBun2;
    @ReportItem(name = "samabunShimeiSmall2", length = 40, order = 90)
    public RString samabunShimeiSmall2;
    @ReportItem(name = "kakkoLeft2", length = 1, order = 91)
    public RString kakkoLeft2;
    @ReportItem(name = "samabunShimei2", length = 20, order = 92)
    public RString samabunShimei2;
    @ReportItem(name = "kakkoRight2", length = 1, order = 93)
    public RString kakkoRight2;
    @ReportItem(name = "kakkoLeft1", length = 1, order = 94)
    public RString kakkoLeft1;
    @ReportItem(name = "samabunShimei1", length = 20, order = 95)
    public RString samabunShimei1;
    @ReportItem(name = "samaBun1", length = 3, order = 96)
    public RString samaBun1;
    @ReportItem(name = "kakkoRight1", length = 1, order = 97)
    public RString kakkoRight1;
    @ReportItem(name = "samabunShimeiSmall1", length = 40, order = 98)
    public RString samabunShimeiSmall1;
    @ReportItem(name = "customerBarCode", order = 99)
    public RString customerBarCode;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    //追加コードは以下（「User Customize Area」内）に記述してください。
    //帳票ソースデータクラスを再作成する場合は、「User Customize Area」内のソースコードは記述されません。
    //再作成した後、当箇所に記述したコードを再作成された帳票ソースデータクラスの「User Customize Area」内にコピー＆ペーストする必要があります。
// </editor-fold>
}
