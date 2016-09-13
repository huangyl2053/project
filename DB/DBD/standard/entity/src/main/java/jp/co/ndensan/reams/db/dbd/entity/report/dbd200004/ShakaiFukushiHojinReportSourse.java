/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.entity.report.dbd200004;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;

/**
 * 社会福祉法人軽減認定者リストReportSourceです。
 *
 * @reamsid_L DBD-3830-060 tianyh
 */
public class ShakaiFukushiHojinReportSourse implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportItem(name = "printTimeStamp", length = 34, order = 1)
    public RString printTimeStamp;
    @ReportItem(name = "title", length = 15, order = 2)
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
    @ReportItem(name = "kaiPege1", length = 20, order = 10)
    public RString kaiPege1;
    @ReportItem(name = "kaiPege2", length = 20, order = 11)
    public RString kaiPege2;
    @ReportItem(name = "kaiPege3", length = 20, order = 12)
    public RString kaiPege3;
    @ReportItem(name = "kaiPege4", length = 20, order = 13)
    public RString kaiPege4;
    @ReportItem(name = "kaiPege5", length = 20, order = 14)
    public RString kaiPege5;
    @ReportItem(name = "lblKakuninNo", length = 8, order = 15)
    public RString lblKakuninNo;
    @ReportItem(name = "list1_1", length = 10, order = 16)
    public RString list1_1;
    @ReportItem(name = "list1_2", length = 8, order = 17)
    public RString list1_2;
    @ReportItem(name = "list1_3", length = 20, order = 18)
    public RString list1_3;
    @ReportItem(name = "list1_4", length = 3, order = 19)
    public RString list1_4;
    @ReportItem(name = "list1_5", length = 9, order = 20)
    public RString list1_5;
    @ReportItem(name = "list1_6", length = 9, order = 21)
    public RString list1_6;
    @ReportItem(name = "list1_7", length = 1, order = 22)
    public RString list1_7;
    @ReportItem(name = "list1_8", length = 1, order = 23)
    public RString list1_8;
    @ReportItem(name = "list1_9", length = 1, order = 24)
    public RString list1_9;
    @ReportItem(name = "list1_10", length = 1, order = 25)
    public RString list1_10;
    @ReportItem(name = "list1_11", length = 4, order = 26)
    public RString list1_11;
    @ReportItem(name = "list1_12", length = 9, order = 27)
    public RString list1_12;
    @ReportItem(name = "list1_13", length = 8, order = 28)
    public RString list1_13;
    @ReportItem(name = "list1_14", length = 2, order = 29)
    public RString list1_14;
    @ReportItem(name = "list1_15", length = 1, order = 30)
    public RString list1_15;
    @ReportItem(name = "list1_16", length = 1, order = 31)
    public RString list1_16;
    @ReportItem(name = "list1_17", length = 1, order = 32)
    public RString list1_17;
    @ReportItem(name = "list2_1", length = 10, order = 33)
    public RString list2_1;
    @ReportItem(name = "list2_2", length = 11, order = 34)
    public RString list2_2;
    @ReportItem(name = "list2_3", length = 20, order = 35)
    public RString list2_3;
    @ReportItem(name = "list2_4", length = 4, order = 36)
    public RString list2_4;
    @ReportItem(name = "list2_5", length = 9, order = 37)
    public RString list2_5;
    @ReportItem(name = "list2_6", length = 9, order = 38)
    public RString list2_6;
    @ReportItem(name = "list2_7", length = 10, order = 39)
    public RString list2_7;
    @ReportItem(name = "list2_8", length = 1, order = 40)
    public RString list2_8;
    @ReportItem(name = "list2_9", length = 4, order = 41)
    public RString list2_9;
    @ReportItem(name = "list2_10", length = 9, order = 42)
    public RString list2_10;
    @ReportItem(name = "list2_11", length = 8, order = 43)
    public RString list2_11;
    @ReportItem(name = "list2_12", length = 2, order = 44)
    public RString list2_12;
    @ReportItem(name = "list2_13", length = 1, order = 45)
    public RString list2_13;
    @ReportItem(name = "list2_14", length = 1, order = 46)
    public RString list2_14;
    @ReportItem(name = "list2_15", length = 1, order = 47)
    public RString list2_15;
    @ReportItem(name = "list3_1", length = 10, order = 48)
    public RString list3_1;
    @ReportItem(name = "list3_2", length = 9, order = 49)
    public RString list3_2;
    @ReportItem(name = "list3_3", length = 20, order = 50)
    public RString list3_3;
    @ReportItem(name = "list3_4", length = 5, order = 51)
    public RString list3_4;
    @ReportItem(name = "list3_5", length = 10, order = 52)
    public RString list3_5;
    @ReportItem(name = "list3_6", length = 15, order = 53)
    public RString list3_6;
    @ReportItem(name = "list3_7", length = 9, order = 54)
    public RString list3_7;
    @ReportItem(name = "list3_8", length = 8, order = 55)
    public RString list3_8;
    @ReportItem(name = "list3_9", length = 2, order = 56)
    public RString list3_9;
    @ReportItem(name = "list3_10", length = 1, order = 57)
    public RString list3_10;
    @ReportItem(name = "list3_11", length = 1, order = 58)
    public RString list3_11;
    @ReportItem(name = "list3_12", length = 1, order = 59)
    public RString list3_12;
    @ReportItem(name = "list4_1", length = 10, order = 60)
    public RString list4_1;
    @ReportItem(name = "list4_2", length = 14, order = 61)
    public RString list4_2;
    @ReportItem(name = "list4_3", length = 10, order = 62)
    public RString list4_3;
    @ReportItem(name = "list4_4", length = 18, order = 63)
    public RString list4_4;
    @ReportItem(name = "list4_5", length = 8, order = 64)
    public RString list4_5;
    @ReportItem(name = "list4_6", length = 2, order = 65)
    public RString list4_6;
    @ReportItem(name = "list4_7", length = 1, order = 66)
    public RString list4_7;
    @ReportItem(name = "list4_8", length = 1, order = 67)
    public RString list4_8;
    @ReportItem(name = "list4_9", length = 1, order = 68)
    public RString list4_9;
// </editor-fold>
}