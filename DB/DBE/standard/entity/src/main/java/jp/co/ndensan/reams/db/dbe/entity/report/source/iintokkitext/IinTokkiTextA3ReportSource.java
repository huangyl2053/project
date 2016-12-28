/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.entity.report.source.iintokkitext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;

/**
 * 委員用特記事項A3版のReportSourceです。
 *
 * @reamsid_L DBE-0150-330 lishengli
 */
public class IinTokkiTextA3ReportSource implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportItem(name = "gogitaiNo", length = 3, order = 1)
    public RString gogitaiNo;
    @ReportItem(name = "zenZenkaiHanteikekka", length = 8, order = 2)
    public RString zenZenkaiHanteikekka;
    @ReportItem(name = "zenzenkaiYukokikan", length = 4, order = 3)
    public RString zenzenkaiYukokikan;
    @ReportItem(name = "zZenkaiNijiKaishiYMD", length = 9, order = 4)
    public RString zZenkaiNijiKaishiYMD;
    @ReportItem(name = "zZenkaiNijishuryoYMD", length = 9, order = 5)
    public RString zZenkaiNijishuryoYMD;
    @ReportItem(name = "kanriNo", length = 20, order = 6)
    public RString kanriNo;
    @ReportItem(name = "shinseiYMD", length = 9, order = 7)
    public RString shinseiYMD;
    @ReportItem(name = "sakuseiYMD", length = 9, order = 8)
    public RString sakuseiYMD;
    @ReportItem(name = "shinseiCount", length = 2, order = 9)
    public RString shinseiCount;
    @ReportItem(name = "shinseiCountGokei", length = 2, order = 10)
    public RString shinseiCountGokei;
    @ReportItem(name = "hihokenshaKubun", length = 7, order = 11)
    public RString hihokenshaKubun;
    @ReportItem(name = "age", length = 5, order = 12)
    public RString age;
    @ReportItem(name = "zenkaiNijihanteikekka", length = 8, order = 13)
    public RString zenkaiNijihanteikekka;
    @ReportItem(name = "zenkaiYukokikan", length = 4, order = 14)
    public RString zenkaiYukokikan;
    @ReportItem(name = "zenkaiNijiKaishiYMD", length = 9, order = 15)
    public RString zenkaiNijiKaishiYMD;
    @ReportItem(name = "zenkaiNijiShuryoYMD", length = 9, order = 16)
    public RString zenkaiNijiShuryoYMD;
    @ReportItem(name = "zenkaiNijihanteiDate", length = 9, order = 17)
    public RString zenkaiNijihanteiDate;
    @ReportItem(name = "zenkaiJotaizo", length = 10, order = 18)
    public RString zenkaiJotaizo;
    @ReportItem(name = "chosaYMD", length = 9, order = 19)
    public RString chosaYMD;
    @ReportItem(name = "shinsaYMD", length = 9, order = 20)
    public RString shinsaYMD;
    @ReportItem(name = "seibetsu", length = 1, order = 21)
    public RString seibetsu;
    @ReportItem(name = "shinseiKubun", length = 13, order = 22)
    public RString shinseiKubun;
    @ReportItem(name = "ichijiHanteiKekka", length = 12, order = 23)
    public RString ichijiHanteiKekka;
    @ReportItem(name = "kijunGokeiTime", length = 30, order = 24)
    public RString kijunGokeiTime;
    @ReportItem(name = "listFuseigo1_1", length = 1, order = 25)
    public RString listFuseigo1_1;
    @ReportItem(name = "listFuseigo1_2", length = 1, order = 26)
    public RString listFuseigo1_2;
    @ReportItem(name = "listIchigun_1", length = 22, order = 27)
    public RString listIchigun_1;
    @ReportItem(name = "listIchigun_2", length = 1, order = 28)
    public RString listIchigun_2;
    @ReportItem(name = "listIchigun_3", length = 1, order = 29)
    public RString listIchigun_3;
    @ReportItem(name = "listIchigun_4", length = 22, order = 30)
    public RString listIchigun_4;
    @ReportItem(name = "zenkaiKijunGokeiTime", length = 30, order = 31)
    public RString zenkaiKijunGokeiTime;
    @ReportItem(name = "gurafuKijunTime", order = 32)
    public RString gurafuKijunTime;
    @ReportItem(name = "listKijunTime_1", length = 7, order = 33)
    public RString listKijunTime_1;
    @ReportItem(name = "listKijunTime_2", length = 7, order = 34)
    public RString listKijunTime_2;
    @ReportItem(name = "listKijunTime_3", length = 7, order = 35)
    public RString listKijunTime_3;
    @ReportItem(name = "listKijunTime_4", length = 7, order = 36)
    public RString listKijunTime_4;
    @ReportItem(name = "listKijunTime_5", length = 7, order = 37)
    public RString listKijunTime_5;
    @ReportItem(name = "listKijunTime_6", length = 7, order = 38)
    public RString listKijunTime_6;
    @ReportItem(name = "listKijunTime_7", length = 7, order = 39)
    public RString listKijunTime_7;
    @ReportItem(name = "listKijunTime_8", length = 7, order = 40)
    public RString listKijunTime_8;
    @ReportItem(name = "listKijunTime_9", length = 7, order = 41)
    public RString listKijunTime_9;
    @ReportItem(name = "listFuseigo2_1", length = 1, order = 42)
    public RString listFuseigo2_1;
    @ReportItem(name = "listFuseigo2_2", length = 1, order = 43)
    public RString listFuseigo2_2;
    @ReportItem(name = "listNigun_1", length = 22, order = 44)
    public RString listNigun_1;
    @ReportItem(name = "listNigun_2", length = 1, order = 45)
    public RString listNigun_2;
    @ReportItem(name = "listNigun_3", length = 1, order = 46)
    public RString listNigun_3;
    @ReportItem(name = "listNigun_4", length = 22, order = 47)
    public RString listNigun_4;
    @ReportItem(name = "chosaJisshiDate1", length = 9, order = 48)
    public RString chosaJisshiDate1;
    @ReportItem(name = "chosaJisshiBasho", length = 30, order = 49)
    public RString chosaJisshiBasho;
    @ReportItem(name = "tokuteishippeiName", length = 40, order = 50)
    public RString tokuteishippeiName;
    @ReportItem(name = "keikokuNo", length = 120, order = 51)
    public RString keikokuNo;
    @ReportItem(name = "listFuseigo3_1", length = 1, order = 52)
    public RString listFuseigo3_1;
    @ReportItem(name = "listFuseigo3_2", length = 1, order = 53)
    public RString listFuseigo3_2;
    @ReportItem(name = "listSangun_1", length = 22, order = 54)
    public RString listSangun_1;
    @ReportItem(name = "listSangun_2", length = 1, order = 55)
    public RString listSangun_2;
    @ReportItem(name = "listSangun_3", length = 1, order = 56)
    public RString listSangun_3;
    @ReportItem(name = "listSangun_4", length = 22, order = 57)
    public RString listSangun_4;
    @ReportItem(name = "listChukanhyoka_1", length = 5, order = 58)
    public RString listChukanhyoka_1;
    @ReportItem(name = "listChukanhyoka_2", length = 5, order = 59)
    public RString listChukanhyoka_2;
    @ReportItem(name = "listChukanhyoka_3", length = 5, order = 60)
    public RString listChukanhyoka_3;
    @ReportItem(name = "listChukanhyoka_4", length = 5, order = 61)
    public RString listChukanhyoka_4;
    @ReportItem(name = "listChukanhyoka_5", length = 5, order = 62)
    public RString listChukanhyoka_5;
    @ReportItem(name = "ｌistSeikatsujiritsu_1", length = 2, order = 63)
    public RString ｌistSeikatsujiritsu_1;
    @ReportItem(name = "ｌistSeikatsujiritsu_2", length = 1, order = 64)
    public RString ｌistSeikatsujiritsu_2;
    @ReportItem(name = "listFuseigo4_1", length = 1, order = 65)
    public RString listFuseigo4_1;
    @ReportItem(name = "listFuseigo4_2", length = 1, order = 66)
    public RString listFuseigo4_2;
    @ReportItem(name = "listYongun_1", length = 22, order = 67)
    public RString listYongun_1;
    @ReportItem(name = "listYongun_2", length = 1, order = 68)
    public RString listYongun_2;
    @ReportItem(name = "listYongun_3", length = 1, order = 69)
    public RString listYongun_3;
    @ReportItem(name = "listYongun_4", length = 22, order = 70)
    public RString listYongun_4;
    @ReportItem(name = "chosaNinchishoJiritsudo", length = 2, order = 71)
    public RString chosaNinchishoJiritsudo;
    @ReportItem(name = "ikenNinchiJiritsudo", length = 2, order = 72)
    public RString ikenNinchiJiritsudo;
    @ReportItem(name = "manzensei", length = 6, order = 73)
    public RString manzensei;
    @ReportItem(name = "jotainoanteisei", length = 4, order = 74)
    public RString jotainoanteisei;
    @ReportItem(name = "kyufukubun", length = 4, order = 75)
    public RString kyufukubun;
    @ReportItem(name = "sabisuKubun", length = 15, order = 76)
    public RString sabisuKubun;
    @ReportItem(name = "sabisuName1", order = 77)
    public RString sabisuName1;
    @ReportItem(name = "sabisuKaisu1", length = 11, order = 78)
    public RString sabisuKaisu1;
    @ReportItem(name = "sabisuName15", order = 79)
    public RString sabisuName15;
    @ReportItem(name = "sabisuKaisu15", length = 11, order = 80)
    public RString sabisuKaisu15;
    @ReportItem(name = "sabisuName2", order = 81)
    public RString sabisuName2;
    @ReportItem(name = "sabisuKaisu2", length = 11, order = 82)
    public RString sabisuKaisu2;
    @ReportItem(name = "sabisuName16", order = 83)
    public RString sabisuName16;
    @ReportItem(name = "sabisuKaisu16", length = 11, order = 84)
    public RString sabisuKaisu16;
    @ReportItem(name = "listFuseigo5_1", length = 1, order = 85)
    public RString listFuseigo5_1;
    @ReportItem(name = "listFuseigo5_2", length = 1, order = 86)
    public RString listFuseigo5_2;
    @ReportItem(name = "listGogun_1", length = 22, order = 87)
    public RString listGogun_1;
    @ReportItem(name = "listGogun_2", length = 1, order = 88)
    public RString listGogun_2;
    @ReportItem(name = "listGogun_3", length = 1, order = 89)
    public RString listGogun_3;
    @ReportItem(name = "listGogun_4", length = 22, order = 90)
    public RString listGogun_4;
    @ReportItem(name = "sabisuName3", order = 91)
    public RString sabisuName3;
    @ReportItem(name = "sabisuKaisu3", length = 11, order = 92)
    public RString sabisuKaisu3;
    @ReportItem(name = "sabisuName17", order = 93)
    public RString sabisuName17;
    @ReportItem(name = "sabisuKaisu17", length = 11, order = 94)
    public RString sabisuKaisu17;
    @ReportItem(name = "sabisuName4", order = 95)
    public RString sabisuName4;
    @ReportItem(name = "sabisuKaisu4", length = 11, order = 96)
    public RString sabisuKaisu4;
    @ReportItem(name = "sabisuName18", order = 97)
    public RString sabisuName18;
    @ReportItem(name = "sabisuKaisu18", length = 11, order = 98)
    public RString sabisuKaisu18;
    @ReportItem(name = "sabisuName5", order = 99)
    public RString sabisuName5;
    @ReportItem(name = "sabisuKaisu5", length = 11, order = 100)
    public RString sabisuKaisu5;
    @ReportItem(name = "sabisuName19", order = 101)
    public RString sabisuName19;
    @ReportItem(name = "sabisuKaisu19", length = 11, order = 102)
    public RString sabisuKaisu19;
    @ReportItem(name = "sabisuName6", order = 103)
    public RString sabisuName6;
    @ReportItem(name = "sabisuKaisu6", length = 11, order = 104)
    public RString sabisuKaisu6;
    @ReportItem(name = "sabisuName20", order = 105)
    public RString sabisuName20;
    @ReportItem(name = "sabisuKaisu20", length = 11, order = 106)
    public RString sabisuKaisu20;
    @ReportItem(name = "sabisuName7", order = 107)
    public RString sabisuName7;
    @ReportItem(name = "sabisuKaisu7", length = 11, order = 108)
    public RString sabisuKaisu7;
    @ReportItem(name = "sabisuName21", order = 109)
    public RString sabisuName21;
    @ReportItem(name = "sabisuKaisu21", length = 11, order = 110)
    public RString sabisuKaisu21;
    @ReportItem(name = "sabisuName8", order = 111)
    public RString sabisuName8;
    @ReportItem(name = "sabisuKaisu8", length = 11, order = 112)
    public RString sabisuKaisu8;
    @ReportItem(name = "listTokubetsunaIryo1_1", length = 2, order = 113)
    public RString listTokubetsunaIryo1_1;
    @ReportItem(name = "listTokubetsunaIryo1_2", length = 1, order = 114)
    public RString listTokubetsunaIryo1_2;
    @ReportItem(name = "listTokubetsunaIryo1_3", length = 1, order = 115)
    public RString listTokubetsunaIryo1_3;
    @ReportItem(name = "listTokubetsunaIryo1_4", length = 1, order = 116)
    public RString listTokubetsunaIryo1_4;
    @ReportItem(name = "listTokubetsunaIryo2_1", length = 2, order = 117)
    public RString listTokubetsunaIryo2_1;
    @ReportItem(name = "listTokubetsunaIryo2_2", length = 1, order = 118)
    public RString listTokubetsunaIryo2_2;
    @ReportItem(name = "listTokubetsunaIryo2_3", length = 1, order = 119)
    public RString listTokubetsunaIryo2_3;
    @ReportItem(name = "listTokubetsunaIryo2_4", length = 1, order = 120)
    public RString listTokubetsunaIryo2_4;
    @ReportItem(name = "sabisuName9", order = 121)
    public RString sabisuName9;
    @ReportItem(name = "sabisuKaisu9", length = 11, order = 122)
    public RString sabisuKaisu9;
    @ReportItem(name = "sabisuName10", order = 123)
    public RString sabisuName10;
    @ReportItem(name = "sabisuKaisu10", length = 11, order = 124)
    public RString sabisuKaisu10;
    @ReportItem(name = "sabisuName11", order = 125)
    public RString sabisuName11;
    @ReportItem(name = "sabisuKaisu11", length = 11, order = 126)
    public RString sabisuKaisu11;
    @ReportItem(name = "sabisuName12", order = 127)
    public RString sabisuName12;
    @ReportItem(name = "sabisuKaisu12", length = 11, order = 128)
    public RString sabisuKaisu12;
    @ReportItem(name = "imgShisetsuName", order = 129)
    public RString imgShisetsuName;
    @ReportItem(name = "shisetsuNameTxit", order = 130)
    public RString shisetsuNameTxit;
    @ReportItem(name = "sabisuName13", order = 131)
    public RString sabisuName13;
    @ReportItem(name = "sabisuKaisu13", length = 11, order = 132)
    public RString sabisuKaisu13;
    @ReportItem(name = "imgShisetsuAddress", order = 133)
    public RString imgShisetsuAddress;
    @ReportItem(name = "shisetsuAddressTxit", order = 134)
    public RString shisetsuAddressTxit;
    @ReportItem(name = "sabisuName14", order = 135)
    public RString sabisuName14;
    @ReportItem(name = "sabisuKaisu14", length = 11, order = 136)
    public RString sabisuKaisu14;
    @ReportItem(name = "shisetsuTelTxit", order = 137)
    public RString shisetsuTelTxit;
    @ReportItem(name = "imgShisetsuTel", order = 138)
    public RString imgShisetsuTel;

    @ReportItem(name = "gaikyotokkiImg", order = 139)
    public RString gaikyotokkiImg;
    @ReportItem(name = "gaikyotokkiText", order = 140)
    public RString gaikyotokkiText;

    @ReportItem(name = "tokkiImg1", order = 141)
    public RString tokkiImg1;
    @ReportItem(name = "listChosa_1", length = 4, order = 142)
    public RString listChosa_1;
    @ReportItem(name = "tokkiImg2", order = 143)
    public RString tokkiImg2;
    @ReportItem(name = "tokkiImg3", order = 144)
    public RString tokkiImg3;
    @ReportItem(name = "tokkiImg4", order = 145)
    public RString tokkiImg4;
    @ReportItem(name = "tokkiImg5", order = 146)
    public RString tokkiImg5;
    @ReportItem(name = "tokkiImg6", order = 147)
    public RString tokkiImg6;
    @ReportItem(name = "tokkiImg7", order = 148)
    public RString tokkiImg7;
    @ReportItem(name = "tokkiImg8", order = 149)
    public RString tokkiImg8;
    @ReportItem(name = "tokkiImg9", order = 150)
    public RString tokkiImg9;
    @ReportItem(name = "tokkiImg10", order = 151)
    public RString tokkiImg10;
    @ReportItem(name = "tokkiImg11", order = 152)
    public RString tokkiImg11;
    @ReportItem(name = "tokkiImg12", order = 153)
    public RString tokkiImg12;
    @ReportItem(name = "tokkiImg13", order = 154)
    public RString tokkiImg13;
    @ReportItem(name = "tokkiImg14", order = 155)
    public RString tokkiImg14;
    @ReportItem(name = "tokkiImg15", order = 156)
    public RString tokkiImg15;
    @ReportItem(name = "tokkiText1", order = 157)
    public RString tokkiText1;
    @ReportItem(name = "listChosa1_1", length = 4, order = 158)
    public RString listChosa1_1;
    @ReportItem(name = "tokkiText2", order = 159)
    public RString tokkiText2;
    @ReportItem(name = "tokkiText3", order = 160)
    public RString tokkiText3;
    @ReportItem(name = "tokkiText4", order = 161)
    public RString tokkiText4;
    @ReportItem(name = "tokkiText5", order = 162)
    public RString tokkiText5;
    @ReportItem(name = "tokkiText6", order = 163)
    public RString tokkiText6;
    @ReportItem(name = "tokkiText7", order = 164)
    public RString tokkiText7;
    @ReportItem(name = "tokkiText8", order = 165)
    public RString tokkiText8;
    @ReportItem(name = "tokkiText9", order = 166)
    public RString tokkiText9;
    @ReportItem(name = "tokkiText10", order = 167)
    public RString tokkiText10;
    @ReportItem(name = "tokkiText11", order = 168)
    public RString tokkiText11;
    @ReportItem(name = "tokkiText12", order = 169)
    public RString tokkiText12;
    @ReportItem(name = "tokkiText13", order = 170)
    public RString tokkiText13;
    @ReportItem(name = "tokkiText14", order = 171)
    public RString tokkiText14;
    @ReportItem(name = "tokkiText15", order = 172)
    public RString tokkiText15;
    @ReportItem(name = "tokkiImg", order = 173)
    public RString tokkiImg;
    @ReportItem(name = "tokkiText", order = 174)
    public RString tokkiText;

    @ReportItem(name = "two_listChosa_1", length = 4, order = 201)
    public RString two_listChosa_1;
    @ReportItem(name = "two_tokkiImg3", order = 202)
    public RString two_tokkiImg3;
    @ReportItem(name = "two_listChosa1_1", length = 4, order = 203)
    public RString two_listChosa1_1;
    @ReportItem(name = "two_tokkiImg20", order = 204)
    public RString two_tokkiImg20;
    @ReportItem(name = "two_tokkiImg4", order = 205)
    public RString two_tokkiImg4;
    @ReportItem(name = "two_tokkiImg21", order = 206)
    public RString two_tokkiImg21;
    @ReportItem(name = "two_tokkiImg5", order = 207)
    public RString two_tokkiImg5;
    @ReportItem(name = "two_tokkiImg22", order = 208)
    public RString two_tokkiImg22;
    @ReportItem(name = "two_tokkiImg6", order = 209)
    public RString two_tokkiImg6;
    @ReportItem(name = "two_tokkiImg23", order = 210)
    public RString two_tokkiImg23;
    @ReportItem(name = "two_tokkiImg7", order = 211)
    public RString two_tokkiImg7;
    @ReportItem(name = "two_tokkiImg24", order = 212)
    public RString two_tokkiImg24;
    @ReportItem(name = "two_tokkiImg8", order = 213)
    public RString two_tokkiImg8;
    @ReportItem(name = "two_tokkiImg25", order = 214)
    public RString two_tokkiImg25;
    @ReportItem(name = "two_tokkiImg9", order = 215)
    public RString two_tokkiImg9;
    @ReportItem(name = "two_tokkiImg26", order = 216)
    public RString two_tokkiImg26;
    @ReportItem(name = "two_tokkiImg10", order = 217)
    public RString two_tokkiImg10;
    @ReportItem(name = "two_tokkiImg27", order = 218)
    public RString two_tokkiImg27;
    @ReportItem(name = "two_tokkiImg11", order = 219)
    public RString two_tokkiImg11;
    @ReportItem(name = "two_tokkiImg28", order = 220)
    public RString two_tokkiImg28;
    @ReportItem(name = "two_tokkiImg12", order = 221)
    public RString two_tokkiImg12;
    @ReportItem(name = "two_tokkiImg29", order = 222)
    public RString two_tokkiImg29;
    @ReportItem(name = "two_tokkiImg13", order = 223)
    public RString two_tokkiImg13;
    @ReportItem(name = "two_tokkiImg30", order = 224)
    public RString two_tokkiImg30;
    @ReportItem(name = "two_tokkiImg14", order = 225)
    public RString two_tokkiImg14;
    @ReportItem(name = "two_tokkiImg31", order = 226)
    public RString two_tokkiImg31;
    @ReportItem(name = "two_tokkiImg15", order = 227)
    public RString two_tokkiImg15;
    @ReportItem(name = "two_tokkiImg32", order = 228)
    public RString two_tokkiImg32;
    @ReportItem(name = "two_tokkiImg16", order = 229)
    public RString two_tokkiImg16;
    @ReportItem(name = "two_tokkiImg33", order = 230)
    public RString two_tokkiImg33;
    @ReportItem(name = "two_tokkiImg17", order = 231)
    public RString two_tokkiImg17;
    @ReportItem(name = "two_tokkiImg34", order = 232)
    public RString two_tokkiImg34;
    @ReportItem(name = "two_tokkiImg18", order = 233)
    public RString two_tokkiImg18;
    @ReportItem(name = "two_tokkiImg35", order = 234)
    public RString two_tokkiImg35;
    @ReportItem(name = "two_tokkiImg19", order = 235)
    public RString two_tokkiImg19;
    @ReportItem(name = "two_tokkiImg36", order = 236)
    public RString two_tokkiImg36;
    @ReportItem(name = "two_tokkiText3", order = 237)
    public RString two_tokkiText3;
    @ReportItem(name = "two_listChosa2_1", length = 4, order = 238)
    public RString two_listChosa2_1;
    @ReportItem(name = "two_listChosa3_1", length = 4, order = 239)
    public RString two_listChosa3_1;
    @ReportItem(name = "two_tokkiText20", order = 240)
    public RString two_tokkiText20;
    @ReportItem(name = "two_tokkiText4", order = 241)
    public RString two_tokkiText4;
    @ReportItem(name = "two_tokkiText21", order = 242)
    public RString two_tokkiText21;
    @ReportItem(name = "two_tokkiText5", order = 243)
    public RString two_tokkiText5;
    @ReportItem(name = "two_tokkiText22", order = 244)
    public RString two_tokkiText22;
    @ReportItem(name = "two_tokkiText6", order = 245)
    public RString two_tokkiText6;
    @ReportItem(name = "two_tokkiText23", order = 246)
    public RString two_tokkiText23;
    @ReportItem(name = "two_tokkiText7", order = 247)
    public RString two_tokkiText7;
    @ReportItem(name = "two_tokkiText24", order = 248)
    public RString two_tokkiText24;
    @ReportItem(name = "two_tokkiText8", order = 249)
    public RString two_tokkiText8;
    @ReportItem(name = "two_tokkiText25", order = 250)
    public RString two_tokkiText25;
    @ReportItem(name = "two_tokkiText9", order = 251)
    public RString two_tokkiText9;
    @ReportItem(name = "two_tokkiText26", order = 252)
    public RString two_tokkiText26;
    @ReportItem(name = "two_tokkiText10", order = 253)
    public RString two_tokkiText10;
    @ReportItem(name = "two_tokkiText27", order = 254)
    public RString two_tokkiText27;
    @ReportItem(name = "two_tokkiText11", order = 255)
    public RString two_tokkiText11;
    @ReportItem(name = "two_tokkiText28", order = 256)
    public RString two_tokkiText28;
    @ReportItem(name = "two_tokkiText12", order = 257)
    public RString two_tokkiText12;
    @ReportItem(name = "two_tokkiText29", order = 258)
    public RString two_tokkiText29;
    @ReportItem(name = "two_tokkiText13", order = 259)
    public RString two_tokkiText13;
    @ReportItem(name = "two_tokkiText30", order = 260)
    public RString two_tokkiText30;
    @ReportItem(name = "two_tokkiText14", order = 261)
    public RString two_tokkiText14;
    @ReportItem(name = "two_tokkiText31", order = 262)
    public RString two_tokkiText31;
    @ReportItem(name = "two_tokkiText15", order = 263)
    public RString two_tokkiText15;
    @ReportItem(name = "two_tokkiText32", order = 264)
    public RString two_tokkiText32;
    @ReportItem(name = "two_tokkiText16", order = 265)
    public RString two_tokkiText16;
    @ReportItem(name = "two_tokkiText33", order = 266)
    public RString two_tokkiText33;
    @ReportItem(name = "two_tokkiText17", order = 267)
    public RString two_tokkiText17;
    @ReportItem(name = "two_tokkiText34", order = 268)
    public RString two_tokkiText34;
    @ReportItem(name = "two_tokkiText18", order = 269)
    public RString two_tokkiText18;
    @ReportItem(name = "two_tokkiText35", order = 270)
    public RString two_tokkiText35;
    @ReportItem(name = "two_tokkiText19", order = 271)
    public RString two_tokkiText19;
    @ReportItem(name = "two_tokkiText36", order = 272)
    public RString two_tokkiText36;
    @ReportItem(name = "two_tokkiImg1", order = 273)
    public RString two_tokkiImg1;
    @ReportItem(name = "two_tokkiImg2", order = 274)
    public RString two_tokkiImg2;
    @ReportItem(name = "two_sakuseiGengo", length = 2, order = 275)
    public RString two_sakuseiGengo;
    @ReportItem(name = "two_sakuseiYY", length = 2, order = 276)
    public RString two_sakuseiYY;
    @ReportItem(name = "two_sakuseiMM", length = 2, order = 277)
    public RString two_sakuseiMM;
    @ReportItem(name = "two_sakuseiDD", length = 2, order = 278)
    public RString two_sakuseiDD;
    @ReportItem(name = "two_chosaGengo", length = 2, order = 279)
    public RString two_chosaGengo;
    @ReportItem(name = "two_chosaYY", length = 2, order = 280)
    public RString two_chosaYY;
    @ReportItem(name = "two_chosaMM", length = 2, order = 281)
    public RString two_chosaMM;
    @ReportItem(name = "two_chosaDD", length = 2, order = 282)
    public RString two_chosaDD;
    @ReportItem(name = "two_hokenshaNo", length = 6, order = 283)
    public RString two_hokenshaNo;
    @ReportItem(name = "two_hihokenshaNo", length = 10, order = 284)
    public RString two_hihokenshaNo;
    @ReportItem(name = "two_hihokenshaName", length = 30, order = 285)
    public RString two_hihokenshaName;
    @ReportItem(name = "two_shinseiGengo", length = 2, order = 286)
    public RString two_shinseiGengo;
    @ReportItem(name = "two_shinseiYY", length = 2, order = 287)
    public RString two_shinseiYY;
    @ReportItem(name = "two_shinseiMM", length = 2, order = 288)
    public RString two_shinseiMM;
    @ReportItem(name = "two_shinseiDD", length = 2, order = 289)
    public RString two_shinseiDD;
    @ReportItem(name = "two_shinsaGengo", length = 2, order = 290)
    public RString two_shinsaGengo;
    @ReportItem(name = "two_shinsaYY", length = 2, order = 291)
    public RString two_shinsaYY;
    @ReportItem(name = "two_shinsaMM", length = 2, order = 292)
    public RString two_shinsaMM;
    @ReportItem(name = "two_shinsaDD", length = 2, order = 293)
    public RString two_shinsaDD;
    @ReportItem(name = "two_tokkiText1", order = 294)
    public RString two_tokkiText1;
    @ReportItem(name = "two_tokkiText2", order = 295)
    public RString two_tokkiText2;
    @ReportItem(name = "two_shinsakaiOrder", order = 296)
    public RString two_shinsakaiOrder;
    //なし
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    //追加コードは以下（「User Customize Area」内）に記述してください。
    //帳票ソースデータクラスを再作成する場合は、「User Customize Area」内のソースコードは記述されません。
    //再作成した後、当箇所に記述したコードを再作成された帳票ソースデータクラスの「User Customize Area」内にコピー＆ペーストする必要があります。
    @ReportItem(name = "layout", order = 999)
    public int layout;

    /**
     * レイアウトブレイク用キーの一覧です。
     */
    public static final List<RString> LAYOUT_BREAK_KEYS;

    static {
        LAYOUT_BREAK_KEYS = Collections.unmodifiableList(Arrays.asList(new RString("layout")));
    }
// </editor-fold>

    /**
     * 改ページ条件のキーです。
     */
    public enum ReportSourceFields {

        two_tokkiText1,
        two_tokkiImg1,

    }

}
