/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.entity.report.dbd100004;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportExpandedInfo;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;
import jp.co.ndensan.reams.uz.uza.report.source.ReportPerson;

/**
 * 滞納保険料控除通知書
 *
 * @reamsid_L DBD-3640-050 b_liuyang2
 */
public class TainoHokenryoKojoTsuchishoReportSource implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportItem(name = "bunshoNo", length = 36, order = 1)
    public RString bunshoNo;
    @ReportItem(name = "hihokenshaName", order = 2)
    public RString hihokenshaName;
    @ReportItem(name = "hihokenshaNo1", length = 1, order = 3)
    public RString hihokenshaNo1;
    @ReportItem(name = "hihokenshaNo2", length = 1, order = 4)
    public RString hihokenshaNo2;
    @ReportItem(name = "hihokenshaNo3", length = 1, order = 5)
    public RString hihokenshaNo3;
    @ReportItem(name = "hihokenshaNo4", length = 1, order = 6)
    public RString hihokenshaNo4;
    @ReportItem(name = "hihokenshaNo5", length = 1, order = 7)
    public RString hihokenshaNo5;
    @ReportItem(name = "hihokenshaNo6", length = 1, order = 8)
    public RString hihokenshaNo6;
    @ReportItem(name = "hihokenshaNo7", length = 1, order = 9)
    public RString hihokenshaNo7;
    @ReportItem(name = "hihokenshaNo8", length = 1, order = 10)
    public RString hihokenshaNo8;
    @ReportItem(name = "hihokenshaNo9", length = 1, order = 11)
    public RString hihokenshaNo9;
    @ReportItem(name = "hihokenshaNo10", length = 1, order = 12)
    public RString hihokenshaNo10;
    @ReportItem(name = "tsuchibun1", order = 13)
    public RString tsuchibun1;
    @ReportItem(name = "listKojoHokenryo_1", length = 4, order = 14)
    public RString listKojoHokenryo_1;
    @ReportItem(name = "listKojoHokenryo_2", length = 3, order = 15)
    public RString listKojoHokenryo_2;
    @ReportItem(name = "listKojoHokenryo_3", length = 10, order = 16)
    public RString listKojoHokenryo_3;
    @ReportItem(name = "listKojoHokenryo_4", length = 10, order = 17)
    public RString listKojoHokenryo_4;
    @ReportItem(name = "listKyufuhiNaiyo_1", length = 8, order = 18)
    public RString listKyufuhiNaiyo_1;
    @ReportItem(name = "listKyufuhiNaiyo_2", length = 22, order = 19)
    public RString listKyufuhiNaiyo_2;
    @ReportItem(name = "listKyufuhiNaiyo_3", length = 9, order = 20)
    public RString listKyufuhiNaiyo_3;
    @ReportItem(name = "kyufugakuGokei", length = 10, order = 21)
    public RString kyufugakuGokei;
    @ReportItem(name = "hokenryoGokei", length = 12, order = 22)
    public RString hokenryoGokei;
    @ReportItem(name = "tsuchibun2", order = 23)
    public RString tsuchibun2;
    @ReportItem(name = "shikyuGaku", length = 10, order = 24)
    public RString shikyuGaku;
    @ReportItem(name = "tsuchibun3", order = 25)
    public RString tsuchibun3;
    @ReportItem(name = "renrakusakiHoka", order = 26)
    public RString renrakusakiHoka;
    @ReportItem(name = "renrakusakiHokaJodanLarge", order = 27)
    public RString renrakusakiHokaJodanLarge;
    @ReportItem(name = "renrakusakiHokaGedanSmall", order = 28)
    public RString renrakusakiHokaGedanSmall;
    @ReportItem(name = "yubinNo", length = 8, order = 29)
    public RString yubinNo;
    @ReportItem(name = "gyoseiku1", length = 14, order = 30)
    public RString gyoseiku1;
    @ReportItem(name = "jusho4", length = 20, order = 31)
    public RString jusho4;
    @ReportItem(name = "jushoText", order = 32)
    public RString jushoText;
    @ReportItem(name = "jusho5", length = 20, order = 33)
    public RString jusho5;
    @ReportItem(name = "jusho6", length = 20, order = 34)
    public RString jusho6;
    @ReportItem(name = "katagakiText", order = 35)
    public RString katagakiText;
    @ReportItem(name = "katagaki3", length = 20, order = 36)
    public RString katagaki3;
    @ReportItem(name = "katagakiSmall2", length = 30, order = 37)
    public RString katagakiSmall2;
    @ReportItem(name = "katagaki4", length = 20, order = 38)
    public RString katagaki4;
    @ReportItem(name = "katagakiSmall1", length = 30, order = 39)
    public RString katagakiSmall1;
    @ReportItem(name = "shimei3", length = 20, order = 40)
    public RString shimei3;
    @ReportItem(name = "shimeiSmall2", length = 40, order = 41)
    public RString shimeiSmall2;
    @ReportItem(name = "shimeiText", order = 42)
    public RString shimeiText;
    @ReportItem(name = "meishoFuyo2", length = 3, order = 43)
    public RString meishoFuyo2;
    @ReportItem(name = "shimeiSmall1", length = 40, order = 44)
    public RString shimeiSmall1;
    @ReportItem(name = "dainoKubunMei", length = 8, order = 45)
    public RString dainoKubunMei;
    @ReportItem(name = "shimei4", length = 20, order = 46)
    public RString shimei4;
    @ReportItem(name = "meishoFuyo1", length = 3, order = 47)
    public RString meishoFuyo1;
    @ReportItem(name = "samabunShimeiText", order = 48)
    public RString samabunShimeiText;
    @ReportItem(name = "samaBun2", length = 3, order = 49)
    public RString samaBun2;
    @ReportItem(name = "samabunShimeiSmall2", length = 40, order = 50)
    public RString samabunShimeiSmall2;
    @ReportItem(name = "kakkoLeft2", length = 1, order = 51)
    public RString kakkoLeft2;
    @ReportItem(name = "samabunShimei2", length = 20, order = 52)
    public RString samabunShimei2;
    @ReportItem(name = "kakkoRight2", length = 1, order = 53)
    public RString kakkoRight2;
    @ReportItem(name = "kakkoLeft1", length = 1, order = 54)
    public RString kakkoLeft1;
    @ReportItem(name = "samabunShimei1", length = 20, order = 55)
    public RString samabunShimei1;
    @ReportItem(name = "samaBun1", length = 3, order = 56)
    public RString samaBun1;
    @ReportItem(name = "kakkoRight1", length = 1, order = 57)
    public RString kakkoRight1;
    @ReportItem(name = "samabunShimeiSmall1", length = 40, order = 58)
    public RString samabunShimeiSmall1;
    @ReportItem(name = "customerBarCode", order = 59)
    public RString customerBarCode;
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

// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    //追加コードは以下（「User Customize Area」内）に記述してください。
    //帳票ソースデータクラスを再作成する場合は、「User Customize Area」内のソースコードは記述されません。
    //再作成した後、当箇所に記述したコードを再作成された帳票ソースデータクラスの「User Customize Area」内にコピー＆ペーストする必要があります。
    @ReportItem(name = "renrakusakiHokaLarge", order = 69)
    public RString renrakusakiHokaLarge;
    @ReportItem(name = "renrakusakiHokaJodanSmall", order = 70)
    public RString renrakusakiHokaJodanSmall;
    @ReportItem(name = "renrakusakiHokaGedanLarge", order = 71)
    public RString renrakusakiHokaGedanLarge;
    @ReportPerson(id = "001")
    public RString shikibetsuCode;
    @ReportExpandedInfo(id = "001", code = "003", name = "被保険者番号")
    public RString hihokenshaNo;
// </editor-fold>
}