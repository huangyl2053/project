package jp.co.ndensan.reams.db.dbc.entity.report.gassanhoseizumijikofutangakusofuchiran;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportExpandedInfo;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;
import jp.co.ndensan.reams.uz.uza.report.source.ReportPerson;

/**
 * 帳票設計_DBC200032_高額合算補正済自己負担額情報送付一覧表 Sourceクラスです。
 *
 * @reamsid_L DBC-2660-040 lijian
 */
public class GassanHoseizumiJikofutangakuSofuchiranSource implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportItem(name = "printTimeStamp", length = 34, order = 1)
    public RString printTimeStamp;
    @ReportItem(name = "chohyoTitle", length = 24, order = 2)
    public RString chohyoTitle;
    @ReportItem(name = "sofuYM", length = 8, order = 3)
    public RString sofuYM;
    @ReportItem(name = "hokenshaNo", length = 6, order = 4)
    public RString hokenshaNo;
    @ReportItem(name = "hokenshaName", length = 12, order = 5)
    public RString hokenshaName;
    @ReportItem(name = "shutsuryokujun1", length = 10, order = 6)
    public RString shutsuryokujun1;
    @ReportItem(name = "shutsuryokujun2", length = 10, order = 7)
    public RString shutsuryokujun2;
    @ReportItem(name = "shutsuryokujun3", length = 10, order = 8)
    public RString shutsuryokujun3;
    @ReportItem(name = "shutsuryokujun4", length = 10, order = 9)
    public RString shutsuryokujun4;
    @ReportItem(name = "shutsuryokujun5", length = 10, order = 10)
    public RString shutsuryokujun5;
    @ReportItem(name = "kaipage1", length = 20, order = 11)
    public RString kaipage1;
    @ReportItem(name = "kaipage2", length = 20, order = 12)
    public RString kaipage2;
    @ReportItem(name = "kaipage3", length = 20, order = 13)
    public RString kaipage3;
    @ReportItem(name = "kaipage4", length = 20, order = 14)
    public RString kaipage4;
    @ReportItem(name = "kaipage5", length = 20, order = 15)
    public RString kaipage5;
    @ReportItem(name = "list_1", length = 5, order = 16)
    public RString list_1;
    @ReportItem(name = "list_2", length = 5, order = 17)
    public RString list_2;
    @ReportExpandedInfo(id = "A", code = "0003", name = "被保険者番号")
    @ReportItem(name = "list_3", length = 10, order = 18)
    public RString list_3;
    @ReportItem(name = "list_4", length = 17, order = 19)
    public RString list_4;
    @ReportItem(name = "list_5", length = 15, order = 20)
    public RString list_5;
    @ReportItem(name = "list_6", length = 6, order = 21)
    public RString list_6;
    @ReportItem(name = "list_7", length = 9, order = 22)
    public RString list_7;
    @ReportItem(name = "list_8", length = 9, order = 23)
    public RString list_8;
    @ReportItem(name = "list_9", length = 9, order = 24)
    public RString list_9;
    @ReportItem(name = "list_10", length = 19, order = 25)
    public RString list_10;
    @ReportItem(name = "list_11", length = 19, order = 26)
    public RString list_11;
    @ReportItem(name = "list_12", length = 13, order = 27)
    public RString list_12;
    @ReportItem(name = "list_13", length = 13, order = 28)
    public RString list_13;
    @ReportItem(name = "list_14", length = 13, order = 29)
    public RString list_14;
    @ReportItem(name = "list_15", length = 1, order = 30)
    public RString list_15;
    @ReportPerson(id = "A")
    @ReportItem(name = "shikibetsuCode", length = 15)
    public RString shikibetsuCode;
    @ReportItem(name = "yubinNo", length = 1, order = 31)
    public RString yubinNo;
    @ReportItem(name = "choikiCode", length = 1, order = 32)
    public RString choikiCode;
    @ReportItem(name = "gyoseikuCode", length = 1, order = 33)
    public RString gyoseikuCode;
    @ReportItem(name = "shimei50onKana", length = 1, order = 34)
    public RString shimei50onKana;
    @ReportItem(name = "shichosonCode", length = 1, order = 35)
    public RString shichosonCode;
    @ReportItem(name = "exShoHokenshaNo", length = 1, order = 36)
    public RString exShoHokenshaNo;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    //追加コードは以下（「User Customize Area」内）に記述してください。
    //帳票ソースデータクラスを再作成する場合は、「User Customize Area」内のソースコードは記述されません。
    //再作成した後、当箇所に記述したコードを再作成された帳票ソースデータクラスの「User Customize Area」内にコピー＆ペーストする必要があります。
// </editor-fold>
}