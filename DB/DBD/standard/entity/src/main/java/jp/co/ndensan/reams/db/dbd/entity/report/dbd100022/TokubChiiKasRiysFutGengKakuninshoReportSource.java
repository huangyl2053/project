package jp.co.ndensan.reams.db.dbd.entity.report.dbd100022;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportExpandedInfo;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;
import jp.co.ndensan.reams.uz.uza.report.source.ReportPerson;

/**
 * 特別地域加算に係る訪問介護利用者負担減額確認証のReportSource
 *
 * @reamsid_L DBD-3540-120 wangchao
 */
public class TokubChiiKasRiysFutGengKakuninshoReportSource implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportPerson(id = "001")
    public RString shikibetsuCode;
    @ReportExpandedInfo(id = "001", code = "003", name = "被保険者番号")
    @ReportItem(name = "hihokenshaNo", length = 10, order = 17)
    public RString hihokenshaNo;
    @ReportItem(name = "kofuGengo", length = 2, order = 1)
    public RString kofuGengo;
    @ReportItem(name = "kofuYYYY", length = 2, order = 2)
    public RString kofuYYYY;
    @ReportItem(name = "kofuMM", length = 2, order = 3)
    public RString kofuMM;
    @ReportItem(name = "kofuDD", length = 2, order = 4)
    public RString kofuDD;
    @ReportItem(name = "kakuninNo", length = 10, order = 5)
    public RString kakuninNo;
    @ReportItem(name = "jusho", order = 6)
    public RString jusho;
    @ReportItem(name = "hihokenshaNameKana", length = 34, order = 7)
    public RString hihokenshaNameKana;
    @ReportItem(name = "hihokenshaName", order = 8)
    public RString hihokenshaName;
    @ReportItem(name = "birthGengoMeiji", length = 1, order = 9)
    public RString birthGengoMeiji;
    @ReportItem(name = "birthGengoTaisho", length = 1, order = 10)
    public RString birthGengoTaisho;
    @ReportItem(name = "birthGengoShowa", length = 1, order = 11)
    public RString birthGengoShowa;
    @ReportItem(name = "man", length = 1, order = 12)
    public RString man;
    @ReportItem(name = "woman", length = 1, order = 13)
    public RString woman;
    @ReportItem(name = "birthYYYY", length = 4, order = 14)
    public RString birthYYYY;
    @ReportItem(name = "birthMM", length = 2, order = 15)
    public RString birthMM;
    @ReportItem(name = "birthDD", length = 2, order = 16)
    public RString birthDD;
    @ReportItem(name = "tekiyoGengo", length = 2, order = 18)
    public RString tekiyoGengo;
    @ReportItem(name = "tekiyoYYYY", length = 2, order = 19)
    public RString tekiyoYYYY;
    @ReportItem(name = "tekiyoMM", length = 2, order = 20)
    public RString tekiyoMM;
    @ReportItem(name = "tekiyoDD", length = 2, order = 21)
    public RString tekiyoDD;
    @ReportItem(name = "yukoGengo", length = 2, order = 22)
    public RString yukoGengo;
    @ReportItem(name = "yukoYYYY", length = 2, order = 23)
    public RString yukoYYYY;
    @ReportItem(name = "yukoMM", length = 2, order = 24)
    public RString yukoMM;
    @ReportItem(name = "yukoDD", length = 2, order = 25)
    public RString yukoDD;
    @ReportItem(name = "genmenRitsu", length = 10, order = 26)
    public RString genmenRitsu;
    @ReportItem(name = "genmenNaiyo1", length = 20, order = 27)
    public RString genmenNaiyo1;
    @ReportItem(name = "gengakuRitsu", length = 10, order = 28)
    public RString gengakuRitsu;
    @ReportItem(name = "genmenNaiyo2", length = 20, order = 29)
    public RString genmenNaiyo2;
    @ReportItem(name = "hokenshaNo1", length = 1, order = 30)
    public RString hokenshaNo1;
    @ReportItem(name = "hokenshaNo2", length = 1, order = 31)
    public RString hokenshaNo2;
    @ReportItem(name = "hokenshaNo3", length = 1, order = 32)
    public RString hokenshaNo3;
    @ReportItem(name = "hokenshaNo4", length = 1, order = 33)
    public RString hokenshaNo4;
    @ReportItem(name = "hokenshaNo5", length = 1, order = 34)
    public RString hokenshaNo5;
    @ReportItem(name = "hokenshaNo6", length = 1, order = 35)
    public RString hokenshaNo6;
    @ReportItem(name = "hokenshaJusho", order = 36)
    public RString hokenshaJusho;
    @ReportItem(name = "hokenshaName1", length = 13, order = 37)
    public RString hokenshaName1;
    @ReportItem(name = "hokenshaName2", length = 15, order = 38)
    public RString hokenshaName2;
    @ReportItem(name = "hokenshaName3", length = 16, order = 39)
    public RString hokenshaName3;
    @ReportItem(name = "hokenshaName4", length = 18, order = 40)
    public RString hokenshaName4;
    @ReportItem(name = "hokenshaName5", length = 20, order = 41)
    public RString hokenshaName5;
    @ReportItem(name = "hokenshaTelNo", length = 20, order = 42)
    public RString hokenshaTelNo;
    @ReportItem(name = "pagecnt", length = 4, order = 43)
    public RString pagecnt;
    @ReportItem(name = "denshiKoin", order = 44)
    public RString denshiKoin;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    //追加コードは以下（「User Customize Area」内）に記述してください。
    //帳票ソースデータクラスを再作成する場合は、「User Customize Area」内のソースコードは記述されません。
    //再作成した後、当箇所に記述したコードを再作成された帳票ソースデータクラスの「User Customize Area」内にコピー＆ペーストする必要があります。
// </editor-fold>
}
