package jp.co.ndensan.reams.db.dbd.entity.report.dbd200018;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportExpandedInfo;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;
import jp.co.ndensan.reams.uz.uza.report.source.ReportPerson;

/**
 * 社会福祉法人軽減確認証・決定通知書発行一覧表ReportSourceです。
 *
 * @reamsid_L DBD-3981-070 b_liuyang2
 */
public class ShakaiFukushiHojinKeigenHakkoIchiranReportSource implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportItem(name = "printTimeStamp", length = 34, order = 1)
    public RString printTimeStamp;
    @ReportItem(name = "hokenshaNo", length = 6, order = 2)
    public RString hokenshaNo;
    @ReportItem(name = "hokenshaName", length = 12, order = 3)
    public RString hokenshaName;
    @ReportItem(name = "shutsuryokujun1", length = 10, order = 4)
    public RString shutsuryokujun1;
    @ReportItem(name = "shutsuryokujun2", length = 10, order = 5)
    public RString shutsuryokujun2;
    @ReportItem(name = "shutsuryokujun3", length = 10, order = 6)
    public RString shutsuryokujun3;
    @ReportItem(name = "shutsuryokujun4", length = 10, order = 7)
    public RString shutsuryokujun4;
    @ReportItem(name = "shutsuryokujun5", length = 10, order = 8)
    public RString shutsuryokujun5;
    @ReportItem(name = "list_1", length = 5, order = 9)
    public RString list_1;
    @ReportItem(name = "list_2", length = 10, order = 10)
    public RString list_2;
    @ReportItem(name = "list_3", length = 1, order = 11)
    public RString list_3;
    @ReportItem(name = "list_4", length = 10, order = 12)
    public RString list_4;
    @ReportItem(name = "list_5", length = 8, order = 13)
    public RString list_5;
    @ReportItem(name = "list_6", length = 14, order = 14)
    public RString list_6;
    @ReportItem(name = "list_7", length = 9, order = 15)
    public RString list_7;
    @ReportItem(name = "list_8", length = 9, order = 16)
    public RString list_8;
    @ReportItem(name = "list_9", length = 19, order = 17)
    public RString list_9;
    @ReportItem(name = "list_10", length = 2, order = 18)
    public RString list_10;
    @ReportItem(name = "list_11", length = 3, order = 19)
    public RString list_11;
    @ReportItem(name = "list_12", length = 8, order = 20)
    public RString list_12;
    @ReportItem(name = "list_13", length = 3, order = 21)
    public RString list_13;
    @ReportItem(name = "list_14", length = 5, order = 22)
    public RString list_14;
    @ReportItem(name = "list_15", length = 5, order = 23)
    public RString list_15;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    //追加コードは以下（「User Customize Area」内）に記述してください。
    //帳票ソースデータクラスを再作成する場合は、「User Customize Area」内のソースコードは記述されません。
    //再作成した後、当箇所に記述したコードを再作成された帳票ソースデータクラスの「User Customize Area」内にコピー＆ペーストする必要があります。
    @ReportExpandedInfo(id = "001", code = "003", name = "被保険者番号")
    public RString hihokenshaNo;
    @ReportPerson(id = "001")
    public RString shikibetsuCode;
// </editor-fold>
}