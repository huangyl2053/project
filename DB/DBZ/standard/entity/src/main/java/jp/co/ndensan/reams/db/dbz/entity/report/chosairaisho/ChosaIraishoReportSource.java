/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.entity.report.chosairaisho;

import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportExpandedInfo;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;
import jp.co.ndensan.reams.uz.uza.report.source.ReportPerson;

/**
 * 要介護認定調査依頼書Sourceクラスです。
 *
 * @reamsid_L DBE-0010-020 lishengli
 */
public class ChosaIraishoReportSource implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportItem(name = "hakkoYMD1", length = 12, order = 1)
    public RString hakkoYMD1;
    @ReportItem(name = "denshiKoin", order = 2)
    public RString denshiKoin;
    @ReportItem(name = "ninshoshaYakushokuMei", length = 15, order = 3)
    public RString ninshoshaYakushokuMei;
    @ReportItem(name = "ninshoshaYakushokuMei2", order = 4)
    public RString ninshoshaYakushokuMei2;
    @ReportItem(name = "ninshoshaYakushokuMei1", order = 5)
    public RString ninshoshaYakushokuMei1;
    @ReportItem(name = "koinMojiretsu", length = 4, order = 6)
    public RString koinMojiretsu;
    @ReportItem(name = "ninshoshaShimeiKakeru", order = 7)
    public RString ninshoshaShimeiKakeru;
    @ReportItem(name = "ninshoshaShimeiKakenai", order = 8)
    public RString ninshoshaShimeiKakenai;
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
    @ReportItem(name = "birthGengo", length = 2, order = 31)
    public RString birthGengo;
    @ReportItem(name = "birthYMD", length = 11, order = 32)
    public RString birthYMD;
    @ReportItem(name = "hihokenshaNameKana", order = 33)
    public RString hihokenshaNameKana;
    @ReportItem(name = "hihokenshaName", order = 34)
    public RString hihokenshaName;
    @ReportItem(name = "seibetsu", length = 1, order = 35)
    public RString seibetsu;
    @ReportItem(name = "yubinNo", length = 8, order = 36)
    public RString yubinNo;
    @ReportItem(name = "jusho", order = 37)
    public RString jusho;
    @ReportItem(name = "telNo", length = 14, order = 38)
    public RString telNo;
    @ReportItem(name = "homonChosasakiYubinNo", length = 8, order = 39)
    public RString homonChosasakiYubinNo;
    @ReportItem(name = "homonChosasakiJusho", order = 40)
    public RString homonChosasakiJusho;
    @ReportItem(name = "homonChosasakiName", order = 41)
    public RString homonChosasakiName;
    @ReportItem(name = "homonChosasakiTelNo", length = 14, order = 42)
    public RString homonChosasakiTelNo;
    @ReportItem(name = "shinseiYMD", length = 11, order = 43)
    public RString shinseiYMD;
    @ReportItem(name = "teishutsuKigen", length = 11, order = 44)
    public RString teishutsuKigen;
    @ReportItem(name = "tsuchibun2", order = 45)
    public RString tsuchibun2;
    @ReportItem(name = "atenaRemban", order = 46)
    public RString atenaRemban;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    @ReportPerson(id = "X")
    public ShikibetsuCode 識別コード;
    @ReportExpandedInfo(id = "X")
    public ExpandedInformation 拡張情報;
// </editor-fold>
}
