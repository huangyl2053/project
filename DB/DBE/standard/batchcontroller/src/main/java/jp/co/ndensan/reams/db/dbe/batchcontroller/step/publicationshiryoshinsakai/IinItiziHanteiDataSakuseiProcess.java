/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.batchcontroller.step.publicationshiryoshinsakai;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.core.publicationshiryoshinsakai.IchijihanteikekkahyoItemSettei;
import jp.co.ndensan.reams.db.dbe.business.report.ichijihanteikekkahyoa3.IchijihanteikekkahyoA3Report;
import jp.co.ndensan.reams.db.dbe.business.report.ichijihanteikekkahyoa4.IchijihanteikekkahyoA4Report;
import jp.co.ndensan.reams.db.dbe.definition.core.reportid.ReportIdDBE;
import jp.co.ndensan.reams.db.dbe.definition.core.shinsakai.ShinsakaiOrderKakuteiFlg;
import jp.co.ndensan.reams.db.dbe.definition.mybatisprm.publicationshiryoshinsakai.IinTokkiJikouItiziHanteiMyBatisParameter;
import jp.co.ndensan.reams.db.dbe.definition.processprm.publicationshiryoshinsakai.IinTokkiJikouItiziHanteiProcessParameter;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.publicationshiryoshinsakai.ItiziHanteiEntity;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.publicationshiryoshinsakai.NinteichosahyoTokkijikoEntity;
import jp.co.ndensan.reams.db.dbe.entity.report.source.ichijihanteikekkahyoa3.IchijihanteikekkahyoA3ReportSource;
import jp.co.ndensan.reams.db.dbe.entity.report.source.ichijihanteikekkahyoa3.IchijihanteikekkahyoA4ReportSource;
import jp.co.ndensan.reams.db.dbe.entity.report.source.ichijihanteikekkahyoa3.IchijihanteikekkahyoItem;
import jp.co.ndensan.reams.db.dbe.persistence.db.mapper.relate.publicationshiryoshinsakai.IShiryoShinsakaiIinMapper;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.GenponMaskKubun;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchKeyBreakBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 委員用一次判定結果票の取得バッチクラスです。
 *
 * @reamsid_L DBE-0150-200 linghuhang
 */
public class IinItiziHanteiDataSakuseiProcess extends BatchKeyBreakBase<ItiziHanteiEntity> {

    private static final RString SELECT_NINTEITIZIHANTEI = new RString("jp.co.ndensan.reams.db.dbe.persistence.db"
            + ".mapper.relate.publicationshiryoshinsakai.IShiryoShinsakaiIinMapper.getItiziHantei");
    private static final RString 出力スタイル_A4 = new RString("1");
    private IinTokkiJikouItiziHanteiProcessParameter paramter;
    private IShiryoShinsakaiIinMapper mapper;
    List<ItiziHanteiEntity> itiziHanteiEntityList;
    private IinTokkiJikouItiziHanteiMyBatisParameter myBatisParameter;
    @BatchWriter
    private BatchReportWriter<IchijihanteikekkahyoA3ReportSource> batchWriteA3;
    private ReportSourceWriter<IchijihanteikekkahyoA3ReportSource> reportSourceWriterA3;
    private BatchReportWriter<IchijihanteikekkahyoA4ReportSource> batchWriteA4;
    private ReportSourceWriter<IchijihanteikekkahyoA4ReportSource> reportSourceWriterA4;

    @Override
    protected void initialize() {
        itiziHanteiEntityList = new ArrayList<>();
        mapper = getMapper(IShiryoShinsakaiIinMapper.class);
        myBatisParameter = paramter.toIinTokkiJikouItiziHanteiMyBatisParameter();
        myBatisParameter.setOrderKakuteiFlg(ShinsakaiOrderKakuteiFlg.確定.is介護認定審査会審査順確定());
        itiziHanteiEntityList = mapper.getItiziHantei(myBatisParameter);
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(SELECT_NINTEITIZIHANTEI, myBatisParameter);
    }

    @Override
    protected void usualProcess(ItiziHanteiEntity entity) {

        myBatisParameter.setShinseishoKanri(entity.getDbt5502_shinseishoKanriNo());
        // TODO QA回答待ち、前回申請管理番号により、データの取得方法が無し。
//        ShinseishoKanriNo 前回申請管理番号 = mapper.getZenShinseishoKanriNo(myBatisParameter);
        myBatisParameter.setNinteichosaRirekiNo(entity.getDbT5203_ninteichosaRirekiNo());
        myBatisParameter.setGenponKubun(GenponMaskKubun.マスク.getコード());
        if (mapper.getNinteichosahyoTokkijikoCount(myBatisParameter) == 0) {
            myBatisParameter.setGenponKubun(GenponMaskKubun.原本.getコード());
        }
        List<NinteichosahyoTokkijikoEntity> 特記事項情報 = mapper.getNinteichosahyoTokkijiko(myBatisParameter);
        IchijihanteikekkahyoItemSettei itemSettei = new IchijihanteikekkahyoItemSettei();
        IchijihanteikekkahyoItem item = itemSettei.set項目(entity, 特記事項情報, paramter, itiziHanteiEntityList);
        if (出力スタイル_A4.equals(paramter.getShuturyokuSutairu())) {
            IchijihanteikekkahyoA3Report report = new IchijihanteikekkahyoA3Report(item);
            report.writeBy(reportSourceWriterA3);
        } else {
            IchijihanteikekkahyoA4Report report = new IchijihanteikekkahyoA4Report(item);
            report.writeBy(reportSourceWriterA4);
        }
    }

    @Override
    protected void createWriter() {
        batchWriteA3 = BatchReportFactory.createBatchReportWriter(ReportIdDBE.DBE517085.getReportId().value()).create();
        reportSourceWriterA3 = new ReportSourceWriter<>(batchWriteA3);
        batchWriteA4 = BatchReportFactory.createBatchReportWriter(ReportIdDBE.DBE517038.getReportId().value()).create();
        reportSourceWriterA4 = new ReportSourceWriter<>(batchWriteA4);
    }

    @Override
    protected void keyBreakProcess(ItiziHanteiEntity t) {
        hasBrek(getBefore(), t);
    }

    private boolean hasBrek(ItiziHanteiEntity before, ItiziHanteiEntity current) {
        return before.getDbt5502_shinsakaiOrder() != current.getDbt5502_shinsakaiOrder();
    }

    @Override
    protected void afterExecute() {
    }
}
