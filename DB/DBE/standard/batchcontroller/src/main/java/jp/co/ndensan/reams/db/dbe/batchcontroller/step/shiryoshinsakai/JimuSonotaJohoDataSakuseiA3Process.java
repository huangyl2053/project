/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.batchcontroller.step.shiryoshinsakai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.JimuSonotashiryoBusiness;
import jp.co.ndensan.reams.db.dbe.business.report.sonotashiryoa3.SonotashiryoA3Report;
import jp.co.ndensan.reams.db.dbe.definition.core.reportid.ReportIdDBE;
import jp.co.ndensan.reams.db.dbe.definition.core.shinsakai.ShinsakaiOrderKakuteiFlg;
import jp.co.ndensan.reams.db.dbe.definition.mybatisprm.shiryoshinsakai.JimuShinsakaiIinJohoMyBatisParameter;
import jp.co.ndensan.reams.db.dbe.definition.processprm.shiryoshinsakai.IinShinsakaiIinJohoProcessParameter;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.shiryoshinsakai.ShinsakaiSiryoKyotsuEntity;
import jp.co.ndensan.reams.db.dbe.entity.report.source.sonotashiryoa3.SonotashiryoA3ReportSource;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.shinsei.ShoriJotaiKubun;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.report.outputjokenhyo.ReportOutputJokenhyoItem;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.OutputJokenhyoFactory;
import jp.co.ndensan.reams.uz.uza.batch.batchexecutor.util.JobContextHolder;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchKeyBreakBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemName;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemPath;
import jp.co.ndensan.reams.uz.uza.cooperation.SharedFile;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.ReadOnlySharedFileEntryDescriptor;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.report.BreakerCatalog;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 事務局用その他資料情報バッチクラスです。
 *
 * @reamsid_L DBE-0150-190 linghuhang
 */
public class JimuSonotaJohoDataSakuseiA3Process extends BatchKeyBreakBase<ShinsakaiSiryoKyotsuEntity> {

    private static final RString SELECT_JIMUTSONOTAJOHO = new RString("jp.co.ndensan.reams.db.dbe.persistence.db"
            + ".mapper.relate.shiryoshinsakai.IJimuShiryoShinsakaiIinMapper.get共通情報");
    private static final List<RString> PAGE_BREAK_KEYS_A3 = Collections.unmodifiableList(Arrays.asList(
            new RString(SonotashiryoA3ReportSource.ReportSourceFields.hokenshaNo.name())));
    private IinShinsakaiIinJohoProcessParameter paramter;
    private JimuShinsakaiIinJohoMyBatisParameter myBatisParameter;
    private JimuSonotashiryoBusiness business;
    private int shinsakaiOrder;
    private int 存在ファイルindex;
    private static final int INDEX_5 = 5;
    private static final boolean あり = true;
    private static final boolean 無し = false;
    private static final RString ファイル名_G0001 = new RString("G0001.png");

    @BatchWriter
    private BatchReportWriter<SonotashiryoA3ReportSource> batchWriteA3;
    private ReportSourceWriter<SonotashiryoA3ReportSource> reportSourceWriterA3;

    @Override
    protected void initialize() {
        shinsakaiOrder = -1;
        存在ファイルindex = 0;
        myBatisParameter = paramter.toJimuShinsakaiIinJohoMyBatisParameter();
        myBatisParameter.setOrderKakuteiFlg(ShinsakaiOrderKakuteiFlg.確定.is介護認定審査会審査順確定());
        myBatisParameter.setShoriJotaiKubun0(ShoriJotaiKubun.通常.getコード());
        myBatisParameter.setShoriJotaiKubun3(ShoriJotaiKubun.延期.getコード());
    }

    @Override
    protected IBatchReader createReader() {
        return new BatchDbReader(SELECT_JIMUTSONOTAJOHO, myBatisParameter);
    }

    @Override
    protected void usualProcess(ShinsakaiSiryoKyotsuEntity entity) {
        entity.setJimukyoku(true);
        if (shinsakaiOrder != entity.getShinsakaiOrder()) {
            存在ファイルindex = 0;
        }
        List<RString> イメージファイルリスト;
        if (!entity.isJimukyoku()) {
            イメージファイルリスト = getその他資料(entity.getImageSharedFileId(), getその他資料マスキング後イメージファイル名());
        } else {
            イメージファイルリスト = getその他資料(entity.getImageSharedFileId(), getその他資料原本イメージファイル名());
        }
        business = new JimuSonotashiryoBusiness(entity, イメージファイルリスト, 存在ファイルindex);
        business.set事務局概況特記イメージ(共有ファイルを引き出す(entity.getImageSharedFileId(), ファイル名_G0001));
        SonotashiryoA3Report reportA3 = new SonotashiryoA3Report(business);
        reportA3.writeBy(reportSourceWriterA3);
        存在ファイルindex = business.get存在ファイルIndex();
        shinsakaiOrder = entity.getShinsakaiOrder();
    }

    @Override
    protected void createWriter() {
        batchWriteA3 = BatchReportFactory.createBatchReportWriter(ReportIdDBE.DBE517006.getReportId().value())
                .addBreak(new BreakerCatalog<SonotashiryoA3ReportSource>().simplePageBreaker(PAGE_BREAK_KEYS_A3))
                .create();
        reportSourceWriterA3 = new ReportSourceWriter<>(batchWriteA3);
    }

    @Override
    protected void keyBreakProcess(ShinsakaiSiryoKyotsuEntity current) {
        hasBrek(getBefore(), current);
    }

    private boolean hasBrek(ShinsakaiSiryoKyotsuEntity before, ShinsakaiSiryoKyotsuEntity current) {
        return before.getShinsakaiOrder() != current.getShinsakaiOrder();
    }

    @Override
    protected void afterExecute() {
        outputJokenhyoFactory();
    }

    private void outputJokenhyoFactory() {
        RString id = ReportIdDBE.DBE517006.getReportId().getColumnValue();
        RString idName = ReportIdDBE.DBE517006.getReportName();
        RString 総ページ数 = new RString(batchWriteA3.getPageCount());
        Association association = AssociationFinderFactory.createInstance().getAssociation();
        ReportOutputJokenhyoItem jokenhyoItem = new ReportOutputJokenhyoItem(
                id,
                association.getLasdecCode_().getColumnValue(),
                association.get市町村名(),
                new RString(String.valueOf(JobContextHolder.getJobId())),
                idName,
                総ページ数,
                RString.EMPTY,
                RString.EMPTY,
                出力条件());
        OutputJokenhyoFactory.createInstance(jokenhyoItem).print();
    }

    private List<RString> 出力条件() {
        List<RString> list = new ArrayList<>();
        RStringBuilder builder = new RStringBuilder();
        builder.append("【合議体番号】")
                .append(" ")
                .append(paramter.getGogitaiNo());
        RStringBuilder stringBuilder = new RStringBuilder();
        stringBuilder.append("【介護認定審査会開催予定年月日】")
                .append(" ")
                .append(paramter.getShinsakaiKaisaiYoteiYMD().wareki().toDateString());
        RStringBuilder 開催番号 = new RStringBuilder();
        stringBuilder.append("【介護認定審査会開催番号】")
                .append(" ")
                .append(paramter.getShinsakaiKaisaiNo());
        list.add(builder.toRString());
        list.add(stringBuilder.toRString());
        list.add(開催番号.toRString());
        return list;
    }

    /**
     * その他資料を取得します。
     *
     * @param sharedFileId 共有ファイルID
     * @param ファイル名List イメージファイルリスト
     * @return その他資料
     */
    public List<RString> getその他資料(RDateTime sharedFileId, List<RString> ファイル名List) {
        List<RString> ファイルPathList = new ArrayList<>();
        if (sharedFileId == null) {
            return ファイルPathList;
        }
        boolean is存在;
        int index = 0;
        for (int i = 0; i < ファイル名List.size(); i++) {
            RString ファイル名 = ファイル名List.get(i);
            ReadOnlySharedFileEntryDescriptor descriptor
                    = new ReadOnlySharedFileEntryDescriptor(new FilesystemName(ファイル名), sharedFileId);
            try {
                SharedFile.copyToLocal(descriptor, new FilesystemPath(batchWriteA3.getImageFolderPath()));
                is存在 = あり;
            } catch (Exception e) {
                is存在 = 無し;
            }
            if (is存在 && index < INDEX_5) {
                ファイルPathList.add(ファイル名);
                index = i + 1;
            }
            if (INDEX_5 <= index) {
                return ファイルPathList;
            }
        }
        return ファイルPathList;
    }

    private List<RString> getその他資料マスキング後イメージファイル名() {
        List<RString> ファイル名 = new ArrayList<>();
        ファイル名.add(new RString("F1401A01.png"));
        ファイル名.add(new RString("F1401A02.png"));
        ファイル名.add(new RString("F1401A03.png"));
        ファイル名.add(new RString("F1401A04.png"));
        ファイル名.add(new RString("F1401A05.png"));
        ファイル名.add(new RString("F1401A06.png"));
        ファイル名.add(new RString("F1401B01.png"));
        ファイル名.add(new RString("F1401B02.png"));
        ファイル名.add(new RString("F1401B03.png"));
        ファイル名.add(new RString("F1401B04.png"));
        ファイル名.add(new RString("F1401B05.png"));
        ファイル名.add(new RString("F1401B06.png"));
        ファイル名.add(new RString("F1401C01.png"));
        ファイル名.add(new RString("F1401C02.png"));
        ファイル名.add(new RString("F1401C03.png"));
        ファイル名.add(new RString("F1401C04.png"));
        ファイル名.add(new RString("F1401C05.png"));
        ファイル名.add(new RString("F1401C06.png"));
        ファイル名.add(new RString("F1401D01.png"));
        ファイル名.add(new RString("F1401D02.png"));
        ファイル名.add(new RString("F1401D03.png"));
        ファイル名.add(new RString("F1401D04.png"));
        ファイル名.add(new RString("F1401D05.png"));
        ファイル名.add(new RString("F1401D06.png"));
        ファイル名.add(new RString("F1401E01.png"));
        ファイル名.add(new RString("F1401E02.png"));
        ファイル名.add(new RString("F1401E03.png"));
        ファイル名.add(new RString("F1401E04.png"));
        ファイル名.add(new RString("F1401E05.png"));
        ファイル名.add(new RString("F1401E06.png"));
        ファイル名.add(new RString("F1401F01.png"));
        ファイル名.add(new RString("F1401F02.png"));
        ファイル名.add(new RString("F1401F03.png"));
        ファイル名.add(new RString("F1401F04.png"));
        ファイル名.add(new RString("F1401F05.png"));
        ファイル名.add(new RString("F1401F06.png"));
        return ファイル名;
    }

    private List<RString> getその他資料原本イメージファイル名() {
        List<RString> ファイル名 = new ArrayList<>();
        ファイル名.add(new RString("F1401A01_BAK.png"));
        ファイル名.add(new RString("F1401A02_BAK.png"));
        ファイル名.add(new RString("F1401A03_BAK.png"));
        ファイル名.add(new RString("F1401A04_BAK.png"));
        ファイル名.add(new RString("F1401A05_BAK.png"));
        ファイル名.add(new RString("F1401A06_BAK.png"));
        ファイル名.add(new RString("F1401B01_BAK.png"));
        ファイル名.add(new RString("F1401B02_BAK.png"));
        ファイル名.add(new RString("F1401B03_BAK.png"));
        ファイル名.add(new RString("F1401B04_BAK.png"));
        ファイル名.add(new RString("F1401B05_BAK.png"));
        ファイル名.add(new RString("F1401B06_BAK.png"));
        ファイル名.add(new RString("F1401C01_BAK.png"));
        ファイル名.add(new RString("F1401C02_BAK.png"));
        ファイル名.add(new RString("F1401C03_BAK.png"));
        ファイル名.add(new RString("F1401C04_BAK.png"));
        ファイル名.add(new RString("F1401C05_BAK.png"));
        ファイル名.add(new RString("F1401C06_BAK.png"));
        ファイル名.add(new RString("F1401D01_BAK.png"));
        ファイル名.add(new RString("F1401D02_BAK.png"));
        ファイル名.add(new RString("F1401D03_BAK.png"));
        ファイル名.add(new RString("F1401D04_BAK.png"));
        ファイル名.add(new RString("F1401D05_BAK.png"));
        ファイル名.add(new RString("F1401D06_BAK.png"));
        ファイル名.add(new RString("F1401E01_BAK.png"));
        ファイル名.add(new RString("F1401E02_BAK.png"));
        ファイル名.add(new RString("F1401E03_BAK.png"));
        ファイル名.add(new RString("F1401E04_BAK.png"));
        ファイル名.add(new RString("F1401E05_BAK.png"));
        ファイル名.add(new RString("F1401E06_BAK.png"));
        ファイル名.add(new RString("F1401F01_BAK.png"));
        ファイル名.add(new RString("F1401F02_BAK.png"));
        ファイル名.add(new RString("F1401F03_BAK.png"));
        ファイル名.add(new RString("F1401F04_BAK.png"));
        ファイル名.add(new RString("F1401F05_BAK.png"));
        ファイル名.add(new RString("F1401F06_BAK.png"));
        return ファイル名;
    }

    private RString 共有ファイルを引き出す(RDateTime イメージID, RString sharedFileName) {
        RString imagePath = RString.EMPTY;
        if (イメージID != null) {
            imagePath = getFilePath(イメージID, sharedFileName);
        }
        return imagePath;
    }

    private RString getFilePath(RDateTime sharedFileId, RString sharedFileName) {
        ReadOnlySharedFileEntryDescriptor descriptor
                = new ReadOnlySharedFileEntryDescriptor(new FilesystemName(sharedFileName),
                        sharedFileId);
        try {
            SharedFile.copyToLocal(descriptor, new FilesystemPath(batchWriteA3.getImageFolderPath()));
        } catch (Exception e) {
            return RString.EMPTY;
        }
        return sharedFileName;
    }
}
