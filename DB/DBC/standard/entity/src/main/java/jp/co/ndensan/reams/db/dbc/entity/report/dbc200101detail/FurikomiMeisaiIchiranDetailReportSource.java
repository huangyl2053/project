package jp.co.ndensan.reams.db.dbc.entity.report.dbc200101detail;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;

/**
 * 振込明細一覧表（明細）ReportSourceです。
 *
 * @reamsid_L DBC-2180-050 b_liuyang2
 */
public class FurikomiMeisaiIchiranDetailReportSource implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportItem(name = "printTimeStamp", length = 34, order = 1)
    public RString printTimeStamp;
    @ReportItem(name = "title", length = 8, order = 2)
    public RString title;
    @ReportItem(name = "hokenshaNo", length = 6, order = 3)
    public RString hokenshaNo;
    @ReportItem(name = "hokenshaName", length = 12, order = 4)
    public RString hokenshaName;
    @ReportItem(name = "shutsuryokujun1", length = 10, order = 5)
    public RString shutsuryokujun1;
    @ReportItem(name = "shutsuryokujun2", length = 10, order = 6)
    public RString shutsuryokujun2;
    @ReportItem(name = "shutsuryokujun3", length = 10, order = 7)
    public RString shutsuryokujun3;
    @ReportItem(name = "shutsuryokujun4", length = 10, order = 8)
    public RString shutsuryokujun4;
    @ReportItem(name = "shutsuryokujun5", length = 10, order = 9)
    public RString shutsuryokujun5;
    @ReportItem(name = "hdrTitle1", length = 4, order = 10)
    public RString hdrTitle1;
    @ReportItem(name = "hdrTitle2", length = 4, order = 11)
    public RString hdrTitle2;
    @ReportItem(name = "hdrTitle3", length = 4, order = 12)
    public RString hdrTitle3;
    @ReportItem(name = "hdrTitle4", length = 5, order = 13)
    public RString hdrTitle4;
    @ReportItem(name = "listUpper_1", length = 10, order = 14)
    public RString listUpper_1;
    @ReportItem(name = "listUpper_2", length = 15, order = 15)
    public RString listUpper_2;
    @ReportItem(name = "listUpper_3", length = 8, order = 16)
    public RString listUpper_3;
    @ReportItem(name = "listUpper_4", length = 8, order = 17)
    public RString listUpper_4;
    @ReportItem(name = "listUpper_5", length = 10, order = 18)
    public RString listUpper_5;
    @ReportItem(name = "listUpper_6", length = 5, order = 19)
    public RString listUpper_6;
    @ReportItem(name = "listUpper_7", length = 10, order = 20)
    public RString listUpper_7;
    @ReportItem(name = "listUpper_8", length = 6, order = 21)
    public RString listUpper_8;
    @ReportItem(name = "listUpper_9", length = 6, order = 22)
    public RString listUpper_9;
    @ReportItem(name = "listUpper_10", length = 4, order = 23)
    public RString listUpper_10;
    @ReportItem(name = "listUpper_11", length = 9, order = 24)
    public RString listUpper_11;
    @ReportItem(name = "listUpper_12", length = 4, order = 25)
    public RString listUpper_12;
    @ReportItem(name = "listUpper_13", length = 1, order = 26)
    public RString listUpper_13;
    @ReportItem(name = "listUpper_14", length = 12, order = 27)
    public RString listUpper_14;
    @ReportItem(name = "listUpper_15", length = 1, order = 28)
    public RString listUpper_15;
    @ReportItem(name = "listUpper_16", length = 1, order = 29)
    public RString listUpper_16;
    @ReportItem(name = "listUpper_17", length = 3, order = 30)
    public RString listUpper_17;
    @ReportItem(name = "listMadoguchiUpper_1", length = 30, order = 31)
    public RString listMadoguchiUpper_1;
    @ReportItem(name = "listMadoguchiUpper_2", length = 15, order = 32)
    public RString listMadoguchiUpper_2;
    @ReportItem(name = "listMadoguchiLower_1", length = 15, order = 33)
    public RString listMadoguchiLower_1;
    @ReportItem(name = "listLower_1", length = 20, order = 34)
    public RString listLower_1;
    @ReportItem(name = "listLower_2", length = 15, order = 35)
    public RString listLower_2;
    @ReportItem(name = "listLower_3", length = 24, order = 36)
    public RString listLower_3;
    @ReportItem(name = "listLower_4", length = 3, order = 37)
    public RString listLower_4;
    @ReportItem(name = "listLower_5", length = 4, order = 38)
    public RString listLower_5;
    @ReportItem(name = "listLower_6", length = 9, order = 39)
    public RString listLower_6;
    @ReportItem(name = "listLower_7", length = 4, order = 40)
    public RString listLower_7;
    @ReportItem(name = "listLower_8", length = 1, order = 41)
    public RString listLower_8;
    @ReportItem(name = "listLower_9", length = 12, order = 42)
    public RString listLower_9;
    @ReportItem(name = "listLower_10", length = 1, order = 43)
    public RString listLower_10;
    @ReportItem(name = "listLower_11", length = 4, order = 44)
    public RString listLower_11;
    @ReportItem(name = "shokeiNinzu", length = 5, order = 45)
    public RString shokeiNinzu;
    @ReportItem(name = "shokeiKingaku", length = 15, order = 46)
    public RString shokeiKingaku;
    @ReportItem(name = "gokeiNinzu", length = 5, order = 47)
    public RString gokeiNinzu;
    @ReportItem(name = "gokeiKingaku", length = 15, order = 48)
    public RString gokeiKingaku;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    //追加コードは以下（「User Customize Area」内）に記述してください。
    //帳票ソースデータクラスを再作成する場合は、「User Customize Area」内のソースコードは記述されません。
    //再作成した後、当箇所に記述したコードを再作成された帳票ソースデータクラスの「User Customize Area」内にコピー＆ペーストする必要があります。
// </editor-fold>
}
