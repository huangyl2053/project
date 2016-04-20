package jp.co.ndensan.reams.db.dbz.business.report.parts.kaigotoiawasesaki;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;

/**
 *
 */
public class CompKaigoToiawasesakiSource implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportItem(name = "yubinBango", length = 8, order = 1)
    public RString yubinBango;
    @ReportItem(name = "shozaichi", order = 2)
    public RString shozaichi;
    @ReportItem(name = "choshaBushoName", order = 3)
    public RString choshaBushoName;
    @ReportItem(name = "tantoName", order = 4)
    public RString tantoName;
    @ReportItem(name = "telNo", length = 20, order = 5)
    public RString telNo;
    @ReportItem(name = "naisenLabel", length = 4, order = 6)
    public RString naisenLabel;
    @ReportItem(name = "naisenNo", length = 20, order = 7)
    public RString naisenNo;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    //追加コードは以下（「User Customize Area」内）に記述してください。
    //帳票ソースデータクラスを再作成する場合は、「User Customize Area」内のソースコードは記述されません。
    //再作成した後、当箇所に記述したコードを再作成された帳票ソースデータクラスの「User Customize Area」内にコピー＆ペーストする必要があります。
// </editor-fold>
}