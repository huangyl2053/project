/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.report.source.kogakuservicejyuryokakuninsho;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.IReportSource;
import jp.co.ndensan.reams.uz.uza.report.source.ReportItem;

/**
 * 帳票設計_DBC100031_高額サービス費受領委任契約承認（不承認）確認書 のソースクラスです。
 *
 * @reamsid_L DBC-1980-040 qinzhen
 */
public class KogakuServiceJyuryoKakuninShoSource implements IReportSource {
// <editor-fold defaultstate="collapsed" desc="Generated Code">

    @ReportItem(name = "bunshoNo", length = 36, order = 1)
    public RString bunshoNo;
    @ReportItem(name = "tsuchiBun1", order = 2)
    public RString tsuchiBun1;
    @ReportItem(name = "hihokenshaNameKana", order = 3)
    public RString hihokenshaNameKana;
    @ReportItem(name = "hihokenshaName", order = 4)
    public RString hihokenshaName;
    @ReportItem(name = "hihokenshaNo", length = 10, order = 5)
    public RString hihokenshaNo;
    @ReportItem(name = "uketsukeYMD", length = 11, order = 6)
    public RString uketsukeYMD;
    @ReportItem(name = "fushoninRiyu", order = 7)
    public RString fushoninRiyu;
    @ReportItem(name = "shoninYMD", length = 10, order = 8)
    public RString shoninYMD;
    @ReportItem(name = "shonin", length = 3, order = 9)
    public RString shonin;
    @ReportItem(name = "jigyoshaName", order = 10)
    public RString jigyoshaName;
    @ReportItem(name = "daihyoshaName", order = 11)
    public RString daihyoshaName;
    @ReportItem(name = "jigyoshaYubinNo", length = 8, order = 12)
    public RString jigyoshaYubinNo;
    @ReportItem(name = "jigyoshaTelNo", length = 20, order = 13)
    public RString jigyoshaTelNo;
    @ReportItem(name = "jigyoshaAddress", order = 14)
    public RString jigyoshaAddress;
    @ReportItem(name = "riyoFutanJyogengaku", length = 10, order = 15)
    public RString riyoFutanJyogengaku;
    @ReportItem(name = "tsuchiBun2", order = 16)
    public RString tsuchiBun2;
    @ReportItem(name = "hakkoYMD", length = 12, order = 17)
    public RString hakkoYMD;
    @ReportItem(name = "denshiKoin", order = 18)
    public RString denshiKoin;
    @ReportItem(name = "ninshoshaYakushokuMei", length = 15, order = 19)
    public RString ninshoshaYakushokuMei;
    @ReportItem(name = "ninshoshaYakushokuMei1", order = 20)
    public RString ninshoshaYakushokuMei1;
    @ReportItem(name = "koinMojiretsu", length = 4, order = 21)
    public RString koinMojiretsu;
    @ReportItem(name = "ninshoshaYakushokuMei2", order = 22)
    public RString ninshoshaYakushokuMei2;
    @ReportItem(name = "ninshoshaShimeiKakenai", order = 23)
    public RString ninshoshaShimeiKakenai;
    @ReportItem(name = "ninshoshaShimeiKakeru", order = 24)
    public RString ninshoshaShimeiKakeru;
    @ReportItem(name = "koinShoryaku", length = 15, order = 25)
    public RString koinShoryaku;
    @ReportItem(name = "yubinNo", length = 8, order = 26)
    public RString yubinNo;
    @ReportItem(name = "gyoseiku", length = 14, order = 27)
    public RString gyoseiku;
    @ReportItem(name = "jusho3", length = 20, order = 28)
    public RString jusho3;
    @ReportItem(name = "jushoText", order = 29)
    public RString jushoText;
    @ReportItem(name = "jusho1", length = 20, order = 30)
    public RString jusho1;
    @ReportItem(name = "jusho2", length = 20, order = 31)
    public RString jusho2;
    @ReportItem(name = "katagakiText", order = 32)
    public RString katagakiText;
    @ReportItem(name = "katagaki2", length = 20, order = 33)
    public RString katagaki2;
    @ReportItem(name = "katagakiSmall2", length = 30, order = 34)
    public RString katagakiSmall2;
    @ReportItem(name = "katagaki1", length = 20, order = 35)
    public RString katagaki1;
    @ReportItem(name = "katagakiSmall1", length = 30, order = 36)
    public RString katagakiSmall1;
    @ReportItem(name = "shimei2", length = 20, order = 37)
    public RString shimei2;
    @ReportItem(name = "shimeiSmall2", length = 40, order = 38)
    public RString shimeiSmall2;
    @ReportItem(name = "shimeiText", order = 39)
    public RString shimeiText;
    @ReportItem(name = "meishoFuyo2", length = 3, order = 40)
    public RString meishoFuyo2;
    @ReportItem(name = "shimeiSmall1", length = 40, order = 41)
    public RString shimeiSmall1;
    @ReportItem(name = "dainoKubunMei", length = 8, order = 42)
    public RString dainoKubunMei;
    @ReportItem(name = "shimei1", length = 20, order = 43)
    public RString shimei1;
    @ReportItem(name = "meishoFuyo1", length = 3, order = 44)
    public RString meishoFuyo1;
    @ReportItem(name = "samabunShimeiText", order = 45)
    public RString samabunShimeiText;
    @ReportItem(name = "samaBun2", length = 3, order = 46)
    public RString samaBun2;
    @ReportItem(name = "samabunShimeiSmall2", length = 40, order = 47)
    public RString samabunShimeiSmall2;
    @ReportItem(name = "kakkoLeft2", length = 1, order = 48)
    public RString kakkoLeft2;
    @ReportItem(name = "samabunShimei2", length = 20, order = 49)
    public RString samabunShimei2;
    @ReportItem(name = "kakkoRight2", length = 1, order = 50)
    public RString kakkoRight2;
    @ReportItem(name = "kakkoLeft1", length = 1, order = 51)
    public RString kakkoLeft1;
    @ReportItem(name = "samabunShimei1", length = 20, order = 52)
    public RString samabunShimei1;
    @ReportItem(name = "samaBun1", length = 3, order = 53)
    public RString samaBun1;
    @ReportItem(name = "kakkoRight1", length = 1, order = 54)
    public RString kakkoRight1;
    @ReportItem(name = "samabunShimeiSmall1", length = 40, order = 55)
    public RString samabunShimeiSmall1;
    @ReportItem(name = "customerBarCode", order = 56)
    public RString customerBarCode;
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="User Customize Area">
    //追加コードは以下（「User Customize Area」内）に記述してください。
    //帳票ソースデータクラスを再作成する場合は、「User Customize Area」内のソースコードは記述されません。
    //再作成した後、当箇所に記述したコードを再作成された帳票ソースデータクラスの「User Customize Area」内にコピー＆ペーストする必要があります。
// </editor-fold>
}