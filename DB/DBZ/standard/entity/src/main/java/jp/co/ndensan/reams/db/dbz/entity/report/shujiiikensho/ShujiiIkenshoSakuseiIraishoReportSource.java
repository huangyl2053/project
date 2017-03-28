package jp.co.ndensan.reams.db.dbz.entity.report.shujiiikensho;

import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportExpandedInfo;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;
import jp.co.ndensan.reams.uz.uza.report.source.ReportPerson;

/**
 * 主治医意見書作成依頼書のReportSourceです。
 *
 * @reamsid_L DBE-0050-020 sunhaidi
 */
public class ShujiiIkenshoSakuseiIraishoReportSource implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportItem(name = "hakkoYMD1", length = 12, order = 1)
    public RString hakkoYMD1;
    @ReportItem(name = "denshiKoin", order = 2)
    public RString denshiKoin;
    @ReportItem(name = "ninshoshaYakushokuMei", length = 15, order = 3)
    public RString ninshoshaYakushokuMei;
    @ReportItem(name = "ninshoshaYakushokuMei1", order = 4)
    public RString ninshoshaYakushokuMei1;
    @ReportItem(name = "ninshoshaYakushokuMei2", order = 5)
    public RString ninshoshaYakushokuMei2;
    @ReportItem(name = "ninshoshaShimeiKakenai", order = 6)
    public RString ninshoshaShimeiKakenai;
    @ReportItem(name = "ninshoshaShimeiKakeru", order = 7)
    public RString ninshoshaShimeiKakeru;
    @ReportItem(name = "koinMojiretsu", length = 4, order = 8)
    public RString koinMojiretsu;
    @ReportItem(name = "koinShoryaku", length = 15, order = 9)
    public RString koinShoryaku;
    @ReportItem(name = "bunshoNo", length = 35, order = 10)
    public RString bunshoNo;
    @ReportItem(name = "yubinNo1", length = 8, order = 11)
    public RString yubinNo1;
    @ReportItem(name = "jushoText", order = 12)
    public RString jushoText;
    @ReportItem(name = "kikanNameText", order = 13)
    public RString kikanNameText;
    @ReportItem(name = "shimeiText", order = 14)
    public RString shimeiText;
    @ReportItem(name = "meishoFuyo", length = 3, order = 15)
    public RString meishoFuyo;
    @ReportItem(name = "customerBarCode", order = 16)
    public RString customerBarCode;
    @ReportItem(name = "sonota", length = 14, order = 17)
    public RString sonota;
    @ReportItem(name = "pageCount", length = 8, order = 18)
    public RString pageCount;
    @ReportItem(name = "title", length = 50, order = 19)
    public RString title;
    @ReportItem(name = "tsuchibun1", order = 20)
    public RString tsuchibun1;
    @ReportItem(name = "hihokenshaNo1", length = 1, order = 21)
    public RString hihokenshaNo1;
    @ReportItem(name = "hihokenshaNo2", length = 1, order = 22)
    public RString hihokenshaNo2;
    @ReportItem(name = "hihokenshaNo3", length = 1, order = 23)
    public RString hihokenshaNo3;
    @ReportItem(name = "hihokenshaNo4", length = 1, order = 24)
    public RString hihokenshaNo4;
    @ReportItem(name = "hihokenshaNo5", length = 1, order = 25)
    public RString hihokenshaNo5;
    @ReportItem(name = "hihokenshaNo6", length = 1, order = 26)
    public RString hihokenshaNo6;
    @ReportItem(name = "hihokenshaNo7", length = 1, order = 27)
    public RString hihokenshaNo7;
    @ReportItem(name = "hihokenshaNo8", length = 1, order = 28)
    public RString hihokenshaNo8;
    @ReportItem(name = "hihokenshaNo9", length = 1, order = 29)
    public RString hihokenshaNo9;
    @ReportItem(name = "hihokenshaNo10", length = 1, order = 30)
    public RString hihokenshaNo10;
    @ReportItem(name = "hokenshaNo1", length = 1, order = 31)
    public RString hokenshaNo1;
    @ReportItem(name = "hokenshaNo2", length = 1, order = 32)
    public RString hokenshaNo2;
    @ReportItem(name = "hokenshaNo3", length = 1, order = 33)
    public RString hokenshaNo3;
    @ReportItem(name = "hokenshaNo4", length = 1, order = 34)
    public RString hokenshaNo4;
    @ReportItem(name = "hokenshaNo5", length = 1, order = 35)
    public RString hokenshaNo5;
    @ReportItem(name = "hokenshaNo6", length = 1, order = 36)
    public RString hokenshaNo6;
    @ReportItem(name = "shinseiKubun", length = 2, order = 37)
    public RString shinseiKubun;
    @ReportItem(name = "hihokenshaNameKana", order = 38)
    public RString hihokenshaNameKana;
    @ReportItem(name = "seibetsu", length = 1, order = 39)
    public RString seibetsu;
    @ReportItem(name = "hihokenshaName", order = 40)
    public RString hihokenshaName;
    @ReportItem(name = "birthGengo", length = 2, order = 41)
    public RString birthGengo;
    @ReportItem(name = "birthYMD", length = 11, order = 42)
    public RString birthYMD;
    @ReportItem(name = "yubinNo", length = 8, order = 43)
    public RString yubinNo;
    @ReportItem(name = "jusho", order = 44)
    public RString jusho;
    @ReportItem(name = "shinseiYMD", length = 11, order = 45)
    public RString shinseiYMD;
    @ReportItem(name = "teishutsuKigen", length = 11, order = 46)
    public RString teishutsuKigen;
    @ReportItem(name = "tsuchibun2", order = 47)
    public RString tsuchibun2;
    @ReportItem(name = "shoriName", length = 4, order = 48)
    public RString shoriName;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    @ReportItem(name = "atenaRenban", length = 8, order = 999)
    public RString atenaRenban;
    @ReportItem(name = "remban", length = 4, order = 998)
    public RString remban;
    @ReportPerson(id = "X")
    public ShikibetsuCode 識別コード;
    @ReportExpandedInfo(id = "X")
    public ExpandedInformation 拡張情報;
// </editor-fold>
}
