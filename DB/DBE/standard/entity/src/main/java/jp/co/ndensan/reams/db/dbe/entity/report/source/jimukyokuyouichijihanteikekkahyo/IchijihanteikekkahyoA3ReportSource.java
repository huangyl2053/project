package jp.co.ndensan.reams.db.dbe.entity.report.source.jimukyokuyouichijihanteikekkahyo;

import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportExpandedInfo;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;
import jp.co.ndensan.reams.uz.uza.report.source.ReportPerson;

/**
 * 事務局用一次判定結果票A3のReportSourceクラスです。
 *
 * @reamsid_L DBE-0150-320 lishengli
 */
public class IchijihanteikekkahyoA3ReportSource implements IReportSource {
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
    @ReportItem(name = "hokenshaName", length = 30, order = 23)
    public RString hokenshaName;
    @ReportItem(name = "hihokenNo", length = 10, order = 24)
    public RString hihokenNo;
    @ReportItem(name = "hokenshaNo", length = 6, order = 25)
    public RString hokenshaNo;
    @ReportItem(name = "shichosonName", length = 10, order = 26)
    public RString shichosonName;
    @ReportItem(name = "listFuseigo1_1", length = 1, order = 27)
    public RString listFuseigo1_1;
    @ReportItem(name = "listFuseigo1_2", length = 1, order = 28)
    public RString listFuseigo1_2;
    @ReportItem(name = "listIchigun_1", length = 22, order = 29)
    public RString listIchigun_1;
    @ReportItem(name = "listIchigun_2", length = 1, order = 30)
    public RString listIchigun_2;
    @ReportItem(name = "listIchigun_3", length = 1, order = 31)
    public RString listIchigun_3;
    @ReportItem(name = "listIchigun_4", length = 22, order = 32)
    public RString listIchigun_4;
    @ReportItem(name = "chosaItakusakiName", length = 30, order = 33)
    public RString chosaItakusakiName;
    @ReportItem(name = "chosaItakusakiNo", length = 12, order = 34)
    public RString chosaItakusakiNo;
    @ReportItem(name = "chosainNo", length = 8, order = 35)
    public RString chosainNo;
    @ReportItem(name = "chosainName", length = 30, order = 36)
    public RString chosainName;
    @ReportItem(name = "chosainShikaku", length = 20, order = 37)
    public RString chosainShikaku;
    @ReportItem(name = "chosaJisshiBasho", length = 30, order = 38)
    public RString chosaJisshiBasho;
    @ReportItem(name = "chosaJisshiDate1", length = 9, order = 39)
    public RString chosaJisshiDate1;
    @ReportItem(name = "iryokikanNo", length = 12, order = 40)
    public RString iryokikanNo;
    @ReportItem(name = "iryokikanName", length = 30, order = 41)
    public RString iryokikanName;
    @ReportItem(name = "ishiName", length = 30, order = 42)
    public RString ishiName;
    @ReportItem(name = "ishiNo", length = 8, order = 43)
    public RString ishiNo;
    @ReportItem(name = "tokuteishippeiName", length = 40, order = 44)
    public RString tokuteishippeiName;
    @ReportItem(name = "ichijiHanteiKekka", length = 12, order = 45)
    public RString ichijiHanteiKekka;
    @ReportItem(name = "kijunGokeiTime", length = 30, order = 46)
    public RString kijunGokeiTime;
    @ReportItem(name = "zenkaiKijunGokeiTime", length = 30, order = 47)
    public RString zenkaiKijunGokeiTime;
    @ReportItem(name = "gurafuKijunTime", order = 48)
    public RString gurafuKijunTime;
    @ReportItem(name = "listFuseigo2_1", length = 1, order = 49)
    public RString listFuseigo2_1;
    @ReportItem(name = "listFuseigo2_2", length = 1, order = 50)
    public RString listFuseigo2_2;
    @ReportItem(name = "listNigun_1", length = 22, order = 51)
    public RString listNigun_1;
    @ReportItem(name = "listNigun_2", length = 1, order = 52)
    public RString listNigun_2;
    @ReportItem(name = "listNigun_3", length = 1, order = 53)
    public RString listNigun_3;
    @ReportItem(name = "listNigun_4", length = 22, order = 54)
    public RString listNigun_4;
    @ReportItem(name = "listkijunTime_1", length = 7, order = 55)
    public RString listkijunTime_1;
    @ReportItem(name = "listkijunTime_2", length = 7, order = 56)
    public RString listkijunTime_2;
    @ReportItem(name = "listkijunTime_3", length = 7, order = 57)
    public RString listkijunTime_3;
    @ReportItem(name = "listkijunTime_4", length = 7, order = 58)
    public RString listkijunTime_4;
    @ReportItem(name = "listkijunTime_5", length = 7, order = 59)
    public RString listkijunTime_5;
    @ReportItem(name = "listkijunTime_6", length = 7, order = 60)
    public RString listkijunTime_6;
    @ReportItem(name = "listkijunTime_7", length = 7, order = 61)
    public RString listkijunTime_7;
    @ReportItem(name = "listkijunTime_8", length = 7, order = 62)
    public RString listkijunTime_8;
    @ReportItem(name = "listkijunTime_9", length = 7, order = 63)
    public RString listkijunTime_9;
    @ReportItem(name = "keikokuNo", length = 120, order = 64)
    public RString keikokuNo;
    @ReportItem(name = "listFuseigo3_1", length = 1, order = 65)
    public RString listFuseigo3_1;
    @ReportItem(name = "listFuseigo3_2", length = 1, order = 66)
    public RString listFuseigo3_2;
    @ReportItem(name = "listSangun_1", length = 22, order = 67)
    public RString listSangun_1;
    @ReportItem(name = "listSangun_2", length = 1, order = 68)
    public RString listSangun_2;
    @ReportItem(name = "listSangun_3", length = 1, order = 69)
    public RString listSangun_3;
    @ReportItem(name = "listSangun_4", length = 22, order = 70)
    public RString listSangun_4;
    @ReportItem(name = "listChukanhyoka_1", length = 5, order = 71)
    public RString listChukanhyoka_1;
    @ReportItem(name = "listChukanhyoka_2", length = 5, order = 72)
    public RString listChukanhyoka_2;
    @ReportItem(name = "listChukanhyoka_3", length = 5, order = 73)
    public RString listChukanhyoka_3;
    @ReportItem(name = "listChukanhyoka_4", length = 5, order = 74)
    public RString listChukanhyoka_4;
    @ReportItem(name = "listChukanhyoka_5", length = 5, order = 75)
    public RString listChukanhyoka_5;
    @ReportItem(name = "ｌistSeikatsujiritsu_1", length = 2, order = 76)
    public RString ｌistSeikatsujiritsu_1;
    @ReportItem(name = "ｌistSeikatsujiritsu_2", length = 1, order = 77)
    public RString ｌistSeikatsujiritsu_2;
    @ReportItem(name = "listFuseigo4_1", length = 1, order = 78)
    public RString listFuseigo4_1;
    @ReportItem(name = "listFuseigo4_2", length = 1, order = 79)
    public RString listFuseigo4_2;
    @ReportItem(name = "listYongun_1", length = 22, order = 80)
    public RString listYongun_1;
    @ReportItem(name = "listYongun_2", length = 1, order = 81)
    public RString listYongun_2;
    @ReportItem(name = "listYongun_3", length = 1, order = 82)
    public RString listYongun_3;
    @ReportItem(name = "listYongun_4", length = 22, order = 83)
    public RString listYongun_4;
    @ReportItem(name = "chosaNinchishoJiritsudo", length = 2, order = 84)
    public RString chosaNinchishoJiritsudo;
    @ReportItem(name = "ikenNinchiJiritsudo", length = 2, order = 85)
    public RString ikenNinchiJiritsudo;
    @ReportItem(name = "manzensei", length = 6, order = 86)
    public RString manzensei;
    @ReportItem(name = "jotainoanteisei", length = 4, order = 87)
    public RString jotainoanteisei;
    @ReportItem(name = "kyufukubun", length = 4, order = 88)
    public RString kyufukubun;
    @ReportItem(name = "sabisuKubun", length = 15, order = 89)
    public RString sabisuKubun;
    @ReportItem(name = "sabisuName1", order = 90)
    public RString sabisuName1;
    @ReportItem(name = "sabisuKaisu1", length = 11, order = 91)
    public RString sabisuKaisu1;
    @ReportItem(name = "sabisuName15", order = 92)
    public RString sabisuName15;
    @ReportItem(name = "sabisuKaisu15", length = 11, order = 93)
    public RString sabisuKaisu15;
    @ReportItem(name = "sabisuName2", order = 94)
    public RString sabisuName2;
    @ReportItem(name = "sabisuKaisu2", length = 11, order = 95)
    public RString sabisuKaisu2;
    @ReportItem(name = "sabisuName16", order = 96)
    public RString sabisuName16;
    @ReportItem(name = "sabisuKaisu16", length = 11, order = 97)
    public RString sabisuKaisu16;
    @ReportItem(name = "listFuseigo5_1", length = 1, order = 98)
    public RString listFuseigo5_1;
    @ReportItem(name = "listFuseigo5_2", length = 1, order = 99)
    public RString listFuseigo5_2;
    @ReportItem(name = "listGogun_1", length = 22, order = 100)
    public RString listGogun_1;
    @ReportItem(name = "listGogun_2", length = 1, order = 101)
    public RString listGogun_2;
    @ReportItem(name = "listGogun_3", length = 1, order = 102)
    public RString listGogun_3;
    @ReportItem(name = "listGogun_4", length = 22, order = 103)
    public RString listGogun_4;
    @ReportItem(name = "sabisuName3", order = 104)
    public RString sabisuName3;
    @ReportItem(name = "sabisuKaisu3", length = 11, order = 105)
    public RString sabisuKaisu3;
    @ReportItem(name = "sabisuName17", order = 106)
    public RString sabisuName17;
    @ReportItem(name = "sabisuKaisu17", length = 11, order = 107)
    public RString sabisuKaisu17;
    @ReportItem(name = "sabisuName4", order = 108)
    public RString sabisuName4;
    @ReportItem(name = "sabisuKaisu4", length = 11, order = 109)
    public RString sabisuKaisu4;
    @ReportItem(name = "sabisuName18", order = 110)
    public RString sabisuName18;
    @ReportItem(name = "sabisuKaisu18", length = 11, order = 111)
    public RString sabisuKaisu18;
    @ReportItem(name = "sabisuName5", order = 112)
    public RString sabisuName5;
    @ReportItem(name = "sabisuKaisu5", length = 11, order = 113)
    public RString sabisuKaisu5;
    @ReportItem(name = "sabisuName19", order = 114)
    public RString sabisuName19;
    @ReportItem(name = "sabisuKaisu19", length = 11, order = 115)
    public RString sabisuKaisu19;
    @ReportItem(name = "sabisuName6", order = 116)
    public RString sabisuName6;
    @ReportItem(name = "sabisuKaisu6", length = 11, order = 117)
    public RString sabisuKaisu6;
    @ReportItem(name = "sabisuName20", order = 118)
    public RString sabisuName20;
    @ReportItem(name = "sabisuKaisu20", length = 11, order = 119)
    public RString sabisuKaisu20;
    @ReportItem(name = "sabisuName7", order = 120)
    public RString sabisuName7;
    @ReportItem(name = "sabisuKaisu7", length = 11, order = 121)
    public RString sabisuKaisu7;
    @ReportItem(name = "sabisuName21", order = 122)
    public RString sabisuName21;
    @ReportItem(name = "sabisuKaisu21", length = 11, order = 123)
    public RString sabisuKaisu21;
    @ReportItem(name = "listtokubetsunaIryo1_1", length = 2, order = 124)
    public RString listtokubetsunaIryo1_1;
    @ReportItem(name = "listtokubetsunaIryo1_2", length = 1, order = 125)
    public RString listtokubetsunaIryo1_2;
    @ReportItem(name = "listtokubetsunaIryo1_3", length = 1, order = 126)
    public RString listtokubetsunaIryo1_3;
    @ReportItem(name = "listtokubetsunaIryo1_4", length = 1, order = 127)
    public RString listtokubetsunaIryo1_4;
    @ReportItem(name = "listtokubetsunaIryo2_1", length = 2, order = 128)
    public RString listtokubetsunaIryo2_1;
    @ReportItem(name = "listtokubetsunaIryo2_2", length = 1, order = 129)
    public RString listtokubetsunaIryo2_2;
    @ReportItem(name = "listtokubetsunaIryo2_3", length = 1, order = 130)
    public RString listtokubetsunaIryo2_3;
    @ReportItem(name = "listtokubetsunaIryo2_4", length = 1, order = 131)
    public RString listtokubetsunaIryo2_4;
    @ReportItem(name = "sabisuName8", order = 132)
    public RString sabisuName8;
    @ReportItem(name = "sabisuKaisu8", length = 11, order = 133)
    public RString sabisuKaisu8;
    @ReportItem(name = "sabisuName9", order = 134)
    public RString sabisuName9;
    @ReportItem(name = "sabisuKaisu9", length = 11, order = 135)
    public RString sabisuKaisu9;
    @ReportItem(name = "sabisuName10", order = 136)
    public RString sabisuName10;
    @ReportItem(name = "sabisuKaisu10", length = 11, order = 137)
    public RString sabisuKaisu10;
    @ReportItem(name = "sabisuName11", order = 138)
    public RString sabisuName11;
    @ReportItem(name = "sabisuKaisu11", length = 11, order = 139)
    public RString sabisuKaisu11;
    @ReportItem(name = "sabisuName12", order = 140)
    public RString sabisuName12;
    @ReportItem(name = "sabisuKaisu12", length = 11, order = 141)
    public RString sabisuKaisu12;
    @ReportItem(name = "imgShisetsuName", order = 142)
    public RString imgShisetsuName;
    @ReportItem(name = "shisetsuNameTxit", order = 143)
    public RString shisetsuNameTxit;
    @ReportItem(name = "listshujiiikensho_1", length = 18, order = 144)
    public RString listshujiiikensho_1;
    @ReportItem(name = "listshujiiikensho_2", length = 1, order = 145)
    public RString listshujiiikensho_2;
    @ReportItem(name = "listshujiiikensho_3", length = 1, order = 146)
    public RString listshujiiikensho_3;
    @ReportItem(name = "listshujiiikensho_4", length = 18, order = 147)
    public RString listshujiiikensho_4;
    @ReportItem(name = "sabisuName13", order = 148)
    public RString sabisuName13;
    @ReportItem(name = "sabisuKaisu13", length = 11, order = 149)
    public RString sabisuKaisu13;
    @ReportItem(name = "sabisuName14", order = 150)
    public RString sabisuName14;
    @ReportItem(name = "sabisuKaisu14", length = 11, order = 151)
    public RString sabisuKaisu14;
    @ReportItem(name = "imgShisetsuAddress", order = 152)
    public RString imgShisetsuAddress;
    @ReportItem(name = "shisetsuAddressTxit", order = 153)
    public RString shisetsuAddressTxit;
    @ReportItem(name = "shisetsuTelTxit", order = 154)
    public RString shisetsuTelTxit;
    @ReportItem(name = "imgShisetsuTel", order = 155)
    public RString imgShisetsuTel;

    @ReportItem(name = "gaikyotokkiImg", order = 156)
    public RString gaikyotokkiImg;
    @ReportItem(name = "gaikyotokkiText", order = 157)
    public RString gaikyotokkiText;

    @ReportItem(name = "tokkiImg1", order = 158)
    public RString tokkiImg1;
    @ReportItem(name = "listChosa_1", length = 4, order = 159)
    public RString listChosa_1;
    @ReportItem(name = "tokkiImg2", order = 160)
    public RString tokkiImg2;
    @ReportItem(name = "tokkiImg3", order = 161)
    public RString tokkiImg3;
    @ReportItem(name = "tokkiImg4", order = 162)
    public RString tokkiImg4;
    @ReportItem(name = "tokkiImg5", order = 163)
    public RString tokkiImg5;
    @ReportItem(name = "tokkiImg6", order = 164)
    public RString tokkiImg6;
    @ReportItem(name = "tokkiImg7", order = 165)
    public RString tokkiImg7;
    @ReportItem(name = "tokkiImg8", order = 166)
    public RString tokkiImg8;
    @ReportItem(name = "tokkiImg9", order = 167)
    public RString tokkiImg9;
    @ReportItem(name = "tokkiImg10", order = 168)
    public RString tokkiImg10;
    @ReportItem(name = "tokkiImg11", order = 169)
    public RString tokkiImg11;
    @ReportItem(name = "tokkiImg12", order = 170)
    public RString tokkiImg12;
    @ReportItem(name = "tokkiImg13", order = 171)
    public RString tokkiImg13;
    @ReportItem(name = "tokkiImg14", order = 172)
    public RString tokkiImg14;
    @ReportItem(name = "tokkiImg15", order = 173)
    public RString tokkiImg15;
    @ReportItem(name = "tokkiText1", order = 174)
    public RString tokkiText1;
    @ReportItem(name = "listChosa1_1", length = 4, order = 175)
    public RString listChosa1_1;
    @ReportItem(name = "tokkiText2", order = 176)
    public RString tokkiText2;
    @ReportItem(name = "tokkiText3", order = 177)
    public RString tokkiText3;
    @ReportItem(name = "tokkiText4", order = 178)
    public RString tokkiText4;
    @ReportItem(name = "tokkiText5", order = 179)
    public RString tokkiText5;
    @ReportItem(name = "tokkiText6", order = 180)
    public RString tokkiText6;
    @ReportItem(name = "tokkiText7", order = 181)
    public RString tokkiText7;
    @ReportItem(name = "tokkiText8", order = 182)
    public RString tokkiText8;
    @ReportItem(name = "tokkiText9", order = 183)
    public RString tokkiText9;
    @ReportItem(name = "tokkiText10", order = 184)
    public RString tokkiText10;
    @ReportItem(name = "tokkiText11", order = 185)
    public RString tokkiText11;
    @ReportItem(name = "tokkiText12", order = 186)
    public RString tokkiText12;
    @ReportItem(name = "tokkiText13", order = 187)
    public RString tokkiText13;
    @ReportItem(name = "tokkiText14", order = 188)
    public RString tokkiText14;
    @ReportItem(name = "tokkiText15", order = 189)
    public RString tokkiText15;
    @ReportItem(name = "tokkiImg", order = 190)
    public RString tokkiImg;
    @ReportItem(name = "tokkiText", order = 191)
    public RString tokkiText;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    //追加コードは以下（「User Customize Area」内）に記述してください。
    //帳票ソースデータクラスを再作成する場合は、「User Customize Area」内のソースコードは記述されません。
    //再作成した後、当箇所に記述したコードを再作成された帳票ソースデータクラスの「User Customize Area」内にコピー＆ペーストする必要があります。
// </editor-fold>

    @ReportPerson(id = "X")
    public ShikibetsuCode shikibetuCode;
    @ReportExpandedInfo(id = "X")
    public ExpandedInformation shinseishoKanriNo;

    /**
     * 改ページ条件のキーです。
     */
    public enum ReportSourceFields {

        shinseiCount,

    }
}