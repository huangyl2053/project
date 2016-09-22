package jp.co.ndensan.reams.db.dbc.entity.report.source.sogojigyohikohijukyusha;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportExpandedInfo;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;
import jp.co.ndensan.reams.uz.uza.report.source.ReportPerson;

/**
 * 総合事業費公費受給者別一覧表帳票Source。
 *
 * @reamsid_L DBC-4710-040 chenjie
 */
public class SogojigyohiKohiJukyushaSource implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportItem(name = "printTimeStamp", length = 34, order = 1)
    public RString printTimeStamp;
    @ReportItem(name = "shinsaYM", length = 8, order = 2)
    public RString shinsaYM;
    @ReportItem(name = "kohiFutanshaNo", length = 8, order = 3)
    public RString kohiFutanshaNo;
    @ReportItem(name = "kohiFutanshaName", length = 40, order = 4)
    public RString kohiFutanshaName;
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
    @ReportItem(name = "kokuhorenName", length = 15, order = 10)
    public RString kokuhorenName;
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
    @ReportItem(name = "listUpper_1", length = 7, order = 16)
    public RString listUpper_1;
    @ReportItem(name = "listUpper_2", length = 7, order = 17)
    public RString listUpper_2;
    @ReportItem(name = "listUpper_3", length = 10, order = 18)
    public RString listUpper_3;
    @ReportItem(name = "listUpper_4", length = 8, order = 19)
    public RString listUpper_4;
    @ReportItem(name = "listUpper_5", length = 8, order = 20)
    public RString listUpper_5;
    @ReportItem(name = "listUpper_6", length = 2, order = 21)
    public RString listUpper_6;
    @ReportItem(name = "listUpper_7", length = 16, order = 22)
    public RString listUpper_7;
    @ReportItem(name = "listUpper_8", length = 16, order = 23)
    public RString listUpper_8;
    @ReportItem(name = "listUpper_9", length = 15, order = 24)
    public RString listUpper_9;
    @ReportExpandedInfo(id = "A", code = "0003", name = "被保険者番号")
    @ReportItem(name = "listUpper_10", length = 10, order = 25)
    public RString listUpper_10;
    @ReportItem(name = "listUpper_11", length = 6, order = 26)
    public RString listUpper_11;
    @ReportItem(name = "listLower_1", length = 20, order = 27)
    public RString listLower_1;
    @ReportItem(name = "listLower_2", length = 9, order = 28)
    public RString listLower_2;
    @ReportItem(name = "listLower_3", length = 9, order = 29)
    public RString listLower_3;
    @ReportItem(name = "listLower_4", length = 20, order = 30)
    public RString listLower_4;
    @ReportItem(name = "kohiTensuGokei", length = 16, order = 31)
    public RString kohiTensuGokei;
    @ReportItem(name = "kohiFutanGakuGokei", length = 16, order = 32)
    public RString kohiFutanGakuGokei;
    @ReportItem(name = "kohiHonninFutanGakuGokei", length = 15, order = 33)
    public RString kohiHonninFutanGakuGokei;
    @ReportItem(name = "yubinNo", length = 40, order = 34)
    public RString yubinNo;
    @ReportItem(name = "choikiCode", length = 40, order = 35)
    public RString choikiCode;
    @ReportItem(name = "gyoseikuCode", length = 40, order = 36)
    public RString gyoseikuCode;
    @ReportItem(name = "shimei50onKana", length = 40, order = 37)
    public RString shimei50onKana;
    @ReportItem(name = "shichosonCode", length = 40, order = 38)
    public RString shichosonCode;
    @ReportPerson(id = "A")
    @ReportItem(name = "shikibetsuCode", length = 15)
    public RString shikibetsuCode;

// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    //追加コードは以下（「User Customize Area」内）に記述してください。
    //帳票ソースデータクラスを再作成する場合は、「User Customize Area」内のソースコードは記述されません。
    //再作成した後、当箇所に記述したコードを再作成された帳票ソースデータクラスの「User Customize Area」内にコピー＆ペーストする必要があります。
// </editor-fold>
    /**
     * SogojigyohiKohiJukyushaSourceのENUM
     */
    public enum ReportSourceFields {

        printTimeStamp,
        shinsaYM,
        kohiFutanshaNo,
        kohiFutanshaName,
        shutsuryokujun1,
        shutsuryokujun2,
        shutsuryokujun3,
        shutsuryokujun4,
        shutsuryokujun5,
        kokuhorenName,
        kaipage1,
        kaipage2,
        kaipage3,
        kaipage4,
        kaipage5,
        listUpper_1,
        listUpper_2,
        listUpper_3,
        listUpper_4,
        listUpper_5,
        listUpper_6,
        listUpper_7,
        listUpper_8,
        listUpper_9,
        listUpper_10,
        listUpper_11,
        listLower_1,
        listLower_2,
        listLower_3,
        listLower_4,
        kohiTensuGokei,
        kohiFutanGakuGokei,
        kohiHonninFutanGakuGokei,
        yubinNo,
        choikiCode,
        gyoseikuCode,
        shimei50onKana,
        shichosonCode
    }
}
