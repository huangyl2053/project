package jp.co.ndensan.reams.db.dbc.entity.report.source.jukyushakyufujissekiichiran;

import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportExpandedInfo;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;
import jp.co.ndensan.reams.uz.uza.report.source.ReportPerson;

/**
 * 受給者給付実績一覧表 のReportSourceです。
 *
 * @reamsid_L DBC-3070-040 dangjingjing
 */
public class JukyushaKyufuJissekiIchiranReportSource implements IReportSource {
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
    @ReportItem(name = "kaiPege1", length = 20, order = 9)
    public RString kaiPege1;
    @ReportItem(name = "kaiPege2", length = 20, order = 10)
    public RString kaiPege2;
    @ReportItem(name = "kaiPege3", length = 20, order = 11)
    public RString kaiPege3;
    @ReportItem(name = "kaiPege4", length = 20, order = 12)
    public RString kaiPege4;
    @ReportItem(name = "kaiPege5", length = 20, order = 13)
    public RString kaiPege5;
    @ReportItem(name = "listUpper_1", length = 10, order = 14)
    public RString listUpper_1;
    @ReportItem(name = "listUpper_2", length = 15, order = 15)
    public RString listUpper_2;
    @ReportItem(name = "listUpper_3", length = 4, order = 16)
    public RString listUpper_3;
    @ReportItem(name = "listUpper_4", length = 6, order = 17)
    public RString listUpper_4;
    @ReportItem(name = "listUpper_5", length = 8, order = 18)
    public RString listUpper_5;
    @ReportItem(name = "listUpper_6", length = 7, order = 19)
    public RString listUpper_6;
    @ReportItem(name = "listUpper_7", length = 10, order = 20)
    public RString listUpper_7;
    @ReportItem(name = "listUpper_8", length = 10, order = 21)
    public RString listUpper_8;
    @ReportItem(name = "listUpper_9", length = 11, order = 22)
    public RString listUpper_9;
    @ReportItem(name = "listUpper_10", length = 10, order = 23)
    public RString listUpper_10;
    @ReportItem(name = "listUpper_11", length = 10, order = 24)
    public RString listUpper_11;
    @ReportItem(name = "listUpper_12", length = 10, order = 25)
    public RString listUpper_12;
    @ReportItem(name = "listUpper_13", length = 11, order = 26)
    public RString listUpper_13;
    @ReportItem(name = "listUpper_14", length = 10, order = 27)
    public RString listUpper_14;
    @ReportItem(name = "listUpper_15", length = 11, order = 28)
    public RString listUpper_15;
    @ReportItem(name = "listUpper_16", length = 10, order = 29)
    public RString listUpper_16;
    @ReportItem(name = "listUpper_17", length = 10, order = 30)
    public RString listUpper_17;
    @ReportItem(name = "listUpper_18", length = 10, order = 31)
    public RString listUpper_18;
    @ReportItem(name = "listCenter_1", length = 12, order = 32)
    public RString listCenter_1;
    @ReportItem(name = "listCenter_2", length = 20, order = 33)
    public RString listCenter_2;
    @ReportItem(name = "listCenter_3", length = 7, order = 34)
    public RString listCenter_3;
    @ReportItem(name = "listCenter_4", length = 8, order = 35)
    public RString listCenter_4;
    @ReportItem(name = "listCenter_5", length = 7, order = 36)
    public RString listCenter_5;
    @ReportItem(name = "listCenter_6", length = 10, order = 37)
    public RString listCenter_6;
    @ReportItem(name = "listCenter_7", length = 10, order = 38)
    public RString listCenter_7;
    @ReportItem(name = "listCenter_8", length = 10, order = 39)
    public RString listCenter_8;
    @ReportItem(name = "listCenter_9", length = 10, order = 40)
    public RString listCenter_9;
    @ReportItem(name = "listCenter_10", length = 10, order = 41)
    public RString listCenter_10;
    @ReportItem(name = "listCenter_11", length = 10, order = 42)
    public RString listCenter_11;
    @ReportItem(name = "listCenter_12", length = 6, order = 43)
    public RString listCenter_12;
    @ReportItem(name = "listLower_1", length = 12, order = 44)
    public RString listLower_1;
    @ReportItem(name = "listLower_2", length = 10, order = 45)
    public RString listLower_2;
    @ReportItem(name = "listLower_3", length = 14, order = 46)
    public RString listLower_3;
    @ReportItem(name = "listLower_4", length = 4, order = 47)
    public RString listLower_4;
    @ReportItem(name = "listLower_5", length = 8, order = 48)
    public RString listLower_5;
    @ReportItem(name = "listLower_6", length = 7, order = 49)
    public RString listLower_6;
    @ReportItem(name = "listLower_7", length = 10, order = 50)
    public RString listLower_7;
    @ReportItem(name = "listLower_8", length = 10, order = 51)
    public RString listLower_8;
    @ReportItem(name = "listLower_9", length = 10, order = 52)
    public RString listLower_9;
    @ReportItem(name = "listLower_10", length = 10, order = 53)
    public RString listLower_10;
    @ReportItem(name = "listLower_11", length = 10, order = 54)
    public RString listLower_11;
    @ReportItem(name = "listLower_12", length = 10, order = 55)
    public RString listLower_12;
    @ReportPerson(id = "X")
    public ShikibetsuCode shikibetuCode;
    @ReportExpandedInfo(id = "X")
    public ExpandedInformation hihokenshaNo;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    //追加コードは以下（「User Customize Area」内）に記述してください。
    //帳票ソースデータクラスを再作成する場合は、「User Customize Area」内のソースコードは記述されません。
    //再作成した後、当箇所に記述したコードを再作成された帳票ソースデータクラスの「User Customize Area」内にコピー＆ペーストする必要があります。
// </editor-fold>
}