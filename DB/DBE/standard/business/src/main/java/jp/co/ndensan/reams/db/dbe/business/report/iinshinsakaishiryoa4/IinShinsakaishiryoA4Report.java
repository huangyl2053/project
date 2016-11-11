/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.iinshinsakaishiryoa4;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.JimuShinsakaiWariateJohoBusiness;
import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.JimuShinsakaishiryoBusiness;
import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.JimuSonotashiryoBusiness;
import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.JimuTuikaSiryoBusiness;
import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.TokkiText1A4Business;
import jp.co.ndensan.reams.db.dbe.definition.core.reportid.ReportIdDBE;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.ichijihanteikekkahyo.IchijihanteikekkahyoA4Entity;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.iinshinsakaishiryoa4.IinShinsakaishiryoA4ReportSource;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.tokkitexta4.TokkiA4Entity;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.Report;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 委員審査会資料組み合わせ一覧A4版のReportクラスです。
 *
 * @reamsid_L DBE-0150-200 lishengli
 */
public class IinShinsakaishiryoA4Report extends Report<IinShinsakaishiryoA4ReportSource> {

    private final List<JimuShinsakaishiryoBusiness> shinsakaishiryoList;
    private final IchijihanteikekkahyoA4Entity ichijihanteiEntity;
    private final TokkiText1A4Business tokkiTextBusiness;
    private final JimuShinsakaiWariateJohoBusiness shinsakaiWariateJoho;
    private final JimuSonotashiryoBusiness sonotashiryoBusiness;
    private final List<JimuTuikaSiryoBusiness> tuikaSiryoBusinessList;
    private final RString reportId;
    private static final int LENGTH_20 = 20;
    private static final int MAXCOUNT = 30;

    /**
     * インスタンスを生成します。
     *
     * @param shinsakaishiryoList List<JimuShinsakaishiryoBusiness>
     * @param ichijihanteiEntity IchijihanteikekkahyoA4Entity
     * @param tokkiTextBusiness 特記事項の編集クラス
     * @param shinsakaiWariateJoho 主治医意見書のBusinessの編集クラス
     * @param sonotashiryoBusiness その他資料情報のBusinessの編集クラス
     * @param tuikaSiryoBusinessList 追加資料鑑情報のBusinessの編集クラス
     * @param reportId 帳票ＩＤ
     */
    public IinShinsakaishiryoA4Report(List<JimuShinsakaishiryoBusiness> shinsakaishiryoList,
            IchijihanteikekkahyoA4Entity ichijihanteiEntity, TokkiText1A4Business tokkiTextBusiness,
            JimuShinsakaiWariateJohoBusiness shinsakaiWariateJoho, JimuSonotashiryoBusiness sonotashiryoBusiness,
            List<JimuTuikaSiryoBusiness> tuikaSiryoBusinessList, RString reportId) {
        this.shinsakaishiryoList = shinsakaishiryoList;
        this.ichijihanteiEntity = ichijihanteiEntity;
        this.tokkiTextBusiness = tokkiTextBusiness;
        this.shinsakaiWariateJoho = shinsakaiWariateJoho;
        this.sonotashiryoBusiness = sonotashiryoBusiness;
        this.tuikaSiryoBusinessList = tuikaSiryoBusinessList;
        this.reportId = reportId;
    }

    @Override
    public void writeBy(ReportSourceWriter<IinShinsakaishiryoA4ReportSource> reportSourceWriter) {
        for (JimuShinsakaishiryoBusiness business : shinsakaishiryoList) {
            IIinShinsakaishiryoA4Editor editor = new IinShinsakaishiryoA4Group1Editor(business);
            IIinShinsakaishiryoA4Builder builder = new IinShinsakaishiryoA4Builder(editor);
            reportSourceWriter.writeLine(builder);
        }
        for (int i = 0; i < LENGTH_20; i++) {
            IIinShinsakaishiryoA4Editor editor = new IinShinsakaishiryoA4Group2Editor(ichijihanteiEntity, i);
            IIinShinsakaishiryoA4Builder builder = new IinShinsakaishiryoA4Builder(editor);
            reportSourceWriter.writeLine(builder);
        }
        List<TokkiA4Entity> 短冊情報リスト = tokkiTextBusiness.get短冊情報リスト();
        List<RString> 短冊リスト = get短冊リスト(短冊情報リスト);
        for (int i = 0; i < 短冊リスト.size(); i++) {
            if (i < MAXCOUNT) {
                IIinShinsakaishiryoA4Editor editor1 = new IinShinsakaishiryoA4Group3Editor(tokkiTextBusiness, 短冊情報リスト, 短冊リスト, i);
                IIinShinsakaishiryoA4Builder builder = new IinShinsakaishiryoA4Builder(editor1);
                reportSourceWriter.writeLine(builder);
            }
        }
        if (ReportIdDBE.DBE517905.getReportId().value().equals(reportId)) {
            for (int i = 0; i < 短冊リスト.size(); i++) {
                if (MAXCOUNT <= i) {
                    int page = (i + MAXCOUNT) / MAXCOUNT;
                    IIinShinsakaishiryoA4Editor editor2 = new IinShinsakaishiryoA4Group4Editor(
                            tokkiTextBusiness, 短冊情報リスト, 短冊リスト, i, page - 1, reportId);
                    IIinShinsakaishiryoA4Builder builder2 = new IinShinsakaishiryoA4Builder(editor2);
                    reportSourceWriter.writeLine(builder2);
                }
            }
        }
        IIinShinsakaishiryoA4Editor editor = new IinShinsakaishiryoA4Group5Editor(shinsakaiWariateJoho, reportId);
        IIinShinsakaishiryoA4Builder builder = new IinShinsakaishiryoA4Builder(editor);
        reportSourceWriter.writeLine(builder);
        IIinShinsakaishiryoA4Editor editor1 = new IinShinsakaishiryoA4Group6Editor(shinsakaiWariateJoho, reportId);
        IIinShinsakaishiryoA4Builder builder1 = new IinShinsakaishiryoA4Builder(editor1);
        reportSourceWriter.writeLine(builder1);
        if (ReportIdDBE.DBE517906.getReportId().value().equals(reportId)) {
            for (int i = 0; i < 短冊リスト.size(); i++) {
                if (MAXCOUNT <= i) {
                    int page = (i + MAXCOUNT) / MAXCOUNT;
                    IIinShinsakaishiryoA4Editor editor2 = new IinShinsakaishiryoA4Group4Editor(
                            tokkiTextBusiness, 短冊情報リスト, 短冊リスト, i, page - 1, reportId);
                    IIinShinsakaishiryoA4Builder builder2 = new IinShinsakaishiryoA4Builder(editor2);
                    reportSourceWriter.writeLine(builder2);
                }
            }
        }
        //TODO 複数件の場合、実装なし。
        IIinShinsakaishiryoA4Editor editor2 = new IinShinsakaishiryoA4Group7Editor(sonotashiryoBusiness);
        IIinShinsakaishiryoA4Builder builder2 = new IinShinsakaishiryoA4Builder(editor2);
        reportSourceWriter.writeLine(builder2);
        for (JimuTuikaSiryoBusiness tuikaSiryoBusiness : tuikaSiryoBusinessList) {
            IIinShinsakaishiryoA4Editor editor3 = new IinShinsakaishiryoA4Group8Editor(tuikaSiryoBusiness);
            IIinShinsakaishiryoA4Builder builder3 = new IinShinsakaishiryoA4Builder(editor3);
            reportSourceWriter.writeLine(builder3);
        }
    }

    private List<RString> get短冊リスト(List<TokkiA4Entity> 短冊情報リスト) {
        List<RString> bodyList = new ArrayList<>();
        if (!短冊情報リスト.isEmpty()) {
            for (TokkiA4Entity entity : 短冊情報リスト) {
                bodyList.add(entity.get事項番号());
                bodyList.add(entity.get項目名称());
            }
        }
        return bodyList;
    }
}