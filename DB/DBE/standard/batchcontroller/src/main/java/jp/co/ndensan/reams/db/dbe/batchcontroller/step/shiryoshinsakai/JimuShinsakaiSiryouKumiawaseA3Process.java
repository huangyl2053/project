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
import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.IchijihanteikekkahyoItemSetteiA3;
import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.JimuShinsakaiWariateJohoBusiness;
import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.JimuShinsakaishiryoBusiness;
import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.JimuSonotashiryoBusiness;
import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.JimuTuikaSiryoBusiness;
import jp.co.ndensan.reams.db.dbe.business.report.jimushinsakaishiryoa3.JimuShinsakaishiryoA3Report;
import jp.co.ndensan.reams.db.dbe.definition.core.reportid.ReportIdDBE;
import jp.co.ndensan.reams.db.dbe.definition.core.shinsakai.ShinsakaiOrderKakuteiFlg;
import jp.co.ndensan.reams.db.dbe.definition.mybatisprm.shiryoshinsakai.JimuShinsakaiIinJohoMyBatisParameter;
import jp.co.ndensan.reams.db.dbe.definition.processprm.shiryoshinsakai.IinShinsakaiIinJohoProcessParameter;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.ichijihanteikekkahyo.IchijihanteikekkahyoA3Entity;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.shiryoshinsakai.ItiziHanteiEntity;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.shiryoshinsakai.ShinsakaiIinJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.shiryoshinsakai.ShinsakaiSiryoKyotsuEntity;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.shiryoshinsakai.ShinsakaiTaiyosyaJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.report.source.jimushinsakaishiryoa3.JimuShinsakaishiryoA3ReportSource;
import jp.co.ndensan.reams.db.dbe.persistence.db.mapper.relate.shiryoshinsakai.IJimuShiryoShinsakaiIinMapper;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.GenponMaskKubun;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.IsHaishi;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ServiceKubunCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.shinsei.ShoriJotaiKubun;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5205NinteichosahyoTokkijikoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5207NinteichosahyoServiceJokyoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5208NinteichosahyoServiceJokyoFlagEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5211NinteichosahyoChosaItemEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5304ShujiiIkenshoIkenItemEntity;
import jp.co.ndensan.reams.db.dbz.service.core.util.report.ReportUtil;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.SimpleBatchProcessBase;
import jp.co.ndensan.reams.uz.uza.biz.KamokuCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemName;
import jp.co.ndensan.reams.uz.uza.cooperation.FilesystemPath;
import jp.co.ndensan.reams.uz.uza.cooperation.SharedFile;
import jp.co.ndensan.reams.uz.uza.cooperation.descriptor.ReadOnlySharedFileEntryDescriptor;
import jp.co.ndensan.reams.uz.uza.io.Directory;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.BreakerCatalog;
import jp.co.ndensan.reams.uz.uza.report.ReportLineRecord;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.report.data.chart.ReportDynamicChart;

/**
 * 事務局審査会資料組み合わせ一覧A4版のバッチ処理です。
 *
 * @reamsid_L DBE-0150-200 lishengli
 */
public class JimuShinsakaiSiryouKumiawaseA3Process extends SimpleBatchProcessBase {

    private static final List<RString> PAGE_BREAK_KEYS = Collections.unmodifiableList(Arrays.asList(
            new RString(JimuShinsakaishiryoA3ReportSource.ReportSourceFields.tokkiText1.name()),
            new RString(JimuShinsakaishiryoA3ReportSource.ReportSourceFields.tokkiImg1.name())));
    private IinShinsakaiIinJohoProcessParameter paramter;
    private IJimuShiryoShinsakaiIinMapper mapper;
    private JimuShinsakaiIinJohoMyBatisParameter myBatisParameter;
    private List<ShinsakaiIinJohoEntity> shinsakaiIinJohoList;
    private List<ShinsakaiTaiyosyaJohoEntity> shinsakaiTaiyosyaJohoList;
    private List<JimuShinsakaishiryoBusiness> businessList;
    private List<ShinsakaiSiryoKyotsuEntity> 共通情報;
    private List<ItiziHanteiEntity> itiziHanteiEntityList;
    private int データ件数 = 0;
    private int no;
    private int count;
    private int shinsakaiOrder;
    private int 存在ファイルindex;
    private static final int INDEX_5 = 5;
    private static final boolean あり = true;
    private static final boolean 無し = false;
    private static final RString ファイル名_G0001 = new RString("G0001.png");
    private boolean is審査会対象一覧印刷済み;
    private static final RString SEPARATOR = new RString("/");
    private List<ShinsakaiTaiyosyaJohoEntity> 事務局審査会追加資料A3リスト;

    @BatchWriter
    private BatchReportWriter<JimuShinsakaishiryoA3ReportSource> batchReportWriter;
    private ReportSourceWriter<JimuShinsakaishiryoA3ReportSource> reportSourceWriter;

    static {
        System.setProperty("java.awt.headless", "true");
    }

    @Override
    protected void beforeExecute() {
        shinsakaiIinJohoList = new ArrayList<>();
        shinsakaiTaiyosyaJohoList = new ArrayList<>();
        businessList = new ArrayList<>();
        共通情報 = new ArrayList<>();
        itiziHanteiEntityList = new ArrayList<>();
        mapper = getMapper(IJimuShiryoShinsakaiIinMapper.class);
        myBatisParameter = paramter.toJimuShinsakaiIinJohoMyBatisParameter();
        myBatisParameter.setShoriJotaiKubun0(ShoriJotaiKubun.通常.getコード());
        myBatisParameter.setShoriJotaiKubun3(ShoriJotaiKubun.延期.getコード());
        myBatisParameter.setOrderKakuteiFlg(ShinsakaiOrderKakuteiFlg.確定.is介護認定審査会審査順確定());
        共通情報 = mapper.get共通情報(myBatisParameter);
        データ件数 = mapper.get事務局一次判定件数(myBatisParameter);
        itiziHanteiEntityList = mapper.get事務局一次判定(myBatisParameter);
        get審査対象者一覧表情報();
        is審査会対象一覧印刷済み = false;
        事務局審査会追加資料A3リスト = mapper.get審査会追加分(myBatisParameter);
    }

    @Override
    protected void process() {

        RString reportId = ReportIdDBE.DBE517902.getReportId().value();
        batchReportWriter = BatchReportFactory.createBatchReportWriter(reportId)
                .addBreak(new BreakerCatalog<JimuShinsakaishiryoA3ReportSource>().simplePageBreaker(PAGE_BREAK_KEYS))
                .addBreak(new BreakerCatalog<JimuShinsakaishiryoA3ReportSource>().
        new SimpleLayoutBreaker(JimuShinsakaishiryoA3ReportSource.LAYOUT_BREAK_KEYS) {
                    @Override
                    public ReportLineRecord<JimuShinsakaishiryoA3ReportSource> occuredBreak(
                            ReportLineRecord<JimuShinsakaishiryoA3ReportSource> currentRecord,
                            ReportLineRecord<JimuShinsakaishiryoA3ReportSource> nextRecord,
                            ReportDynamicChart dynamicChart) {
                                int layout = currentRecord.getSource().layout;
                                currentRecord.setFormGroupIndex(layout);
                                if (nextRecord != null && nextRecord.getSource() != null) {
                                    layout = nextRecord.getSource().layout;
                                    nextRecord.setFormGroupIndex(layout);
                                }
                                return currentRecord;
                            }
                }).create();
        reportSourceWriter = new ReportSourceWriter<>(batchReportWriter);
        List<ShinseishoKanriNo> 申請書管理番号List = new ArrayList<>();
        for (ItiziHanteiEntity entity : itiziHanteiEntityList) {
            if (!申請書管理番号List.contains(entity.getShinseishoKanriNo())) {
                申請書管理番号List.add(entity.getShinseishoKanriNo());
            }
        }
        for (ShinsakaiSiryoKyotsuEntity entity : 共通情報) {
            if (!申請書管理番号List.contains(entity.getShinseishoKanriNo())) {
                申請書管理番号List.add(entity.getShinseishoKanriNo());
            }
        }
        for (ShinseishoKanriNo shinseishoKanriNo : 申請書管理番号List) {
            JimuShinsakaishiryoA3Report report = new JimuShinsakaishiryoA3Report(businessList,
                    get一次判定結果票(shinseishoKanriNo), get主治医意見書情報(shinseishoKanriNo),
                    getその他資料情報(shinseishoKanriNo), get審査会追加資料情報(shinseishoKanriNo),
                    reportId, is審査会対象一覧印刷済み, paramter.getSakuseiJoken());
            report.writeBy(reportSourceWriter);
            is審査会対象一覧印刷済み = true;
        }
        batchReportWriter.close();
    }

    private JimuTuikaSiryoBusiness get審査会追加資料情報(ShinseishoKanriNo shinseishoKanriNo) {
        JimuTuikaSiryoBusiness 審査会追加資料 = null;
        for (ShinsakaiTaiyosyaJohoEntity entity : 事務局審査会追加資料A3リスト) {
            if (shinseishoKanriNo.equals(entity.getShinseishoKanriNo())) {
                審査会追加資料 = new JimuTuikaSiryoBusiness(entity, shinsakaiIinJohoList, paramter, count,
                        ReportUtil.get通知文(SubGyomuCode.DBE認定支援, ReportIdDBE.DBE517009.getReportId(),
                                KamokuCode.EMPTY, 1, 1, FlexibleDate.getNowDate()));
            }
        }
        return 審査会追加資料;
    }

    private void get審査対象者一覧表情報() {
        myBatisParameter.setOrderKakuteiFlg(ShinsakaiOrderKakuteiFlg.確定.is介護認定審査会審査順確定());
        myBatisParameter.setHaishiFlag_False(IsHaishi.有効.is廃止());
        myBatisParameter.setHaishiFlag_True(IsHaishi.廃止.is廃止());
        myBatisParameter.setShoriJotaiKubun0(ShoriJotaiKubun.通常.getコード());
        myBatisParameter.setShoriJotaiKubun3(ShoriJotaiKubun.延期.getコード());
        myBatisParameter.setSisutemuYMD(FlexibleDate.getNowDate());
        shinsakaiIinJohoList = mapper.get事務局委員氏名(myBatisParameter);
        count = mapper.get事務局情報件数(myBatisParameter);
        shinsakaiTaiyosyaJohoList = mapper.get事務局情報(myBatisParameter);
        no = 0;
        for (ShinsakaiTaiyosyaJohoEntity entity : shinsakaiTaiyosyaJohoList) {
            entity.setJimukyoku(true);
            JimuShinsakaishiryoBusiness business = new JimuShinsakaishiryoBusiness(paramter, entity, shinsakaiIinJohoList, no, count);
            businessList.add(business);
            no = no + 1;
        }
    }

    private IchijihanteikekkahyoA3Entity get一次判定結果票(ShinseishoKanriNo shinseishoKanriNo) {
        for (ItiziHanteiEntity entity : itiziHanteiEntityList) {
            ShinseishoKanriNo 申請書管理番号 = entity.getShinseishoKanriNo();
            if (shinseishoKanriNo.equals(申請書管理番号)) {
                ShinseishoKanriNo 前申請書管理番号 = entity.getZShinseishoKanriNo();
                int 認定調査依頼履歴番号 = entity.getNinteichosaIraiRirekiNo();
                int 主治医意見履歴番号 = entity.getIkenshoIraiRirekiNo();
                myBatisParameter.setShinseishoKanriNo(申請書管理番号);
                myBatisParameter.setNinteichosaRirekiNo(認定調査依頼履歴番号);
                myBatisParameter.setShinseishoKanriNoZ(前申請書管理番号);
                myBatisParameter.setIkenshoIraiRirekiNo(主治医意見履歴番号);
                List<DbT5207NinteichosahyoServiceJokyoEntity> 予防給付サービス利用状況 = new ArrayList<>();
                List<DbT5207NinteichosahyoServiceJokyoEntity> 介護給付サービス利用状況 = new ArrayList<>();
                List<DbT5304ShujiiIkenshoIkenItemEntity> 主治医意見書情報 = new ArrayList<>();
                DbT5208NinteichosahyoServiceJokyoFlagEntity サービス状況フラグ = new DbT5208NinteichosahyoServiceJokyoFlagEntity();
                if (ServiceKubunCode.予防給付サービス.getコード().equals(entity.getServiceKubunCode().getColumnValue())) {
                    予防給付サービス利用状況 = mapper.get予防給付(myBatisParameter);
                } else if (ServiceKubunCode.介護給付サービス.getコード().equals(entity.getServiceKubunCode().getColumnValue())) {
                    介護給付サービス利用状況 = mapper.get介護給付(myBatisParameter);
                } else {
                    サービス状況フラグ = mapper.get状況フラグ(myBatisParameter);
                }
                List<DbT5205NinteichosahyoTokkijikoEntity> 特記事項 = mapper.get特記事項(myBatisParameter);
                List<DbT5304ShujiiIkenshoIkenItemEntity> 主治医意見書 = mapper.get主治医意見書(myBatisParameter);
                List<DbT5211NinteichosahyoChosaItemEntity> 調査票調査項目 = mapper.get調査票項目(myBatisParameter);
                List<DbT5211NinteichosahyoChosaItemEntity> 前回調査票調査項目 = mapper.get前回調査票項目(myBatisParameter);
                List<DbT5304ShujiiIkenshoIkenItemEntity> 前回主治医意見書 = mapper.get前回主治医意見書(myBatisParameter);
                List<DbT5205NinteichosahyoTokkijikoEntity> 特記情報 = new ArrayList<>();
                if (get共通情報(共通情報, 申請書管理番号) != null) {
                    特記情報 = get特記情報(get共通情報(共通情報, 申請書管理番号));
                }
                主治医意見書情報.addAll(主治医意見書);
                return new IchijihanteikekkahyoItemSetteiA3().set項目(entity, 特記事項,
                        調査票調査項目, 前回調査票調査項目, 主治医意見書情報,
                        前回主治医意見書, 予防給付サービス利用状況, 介護給付サービス利用状況, サービス状況フラグ, データ件数,
                        get共通情報(共通情報, 申請書管理番号), 主治医意見書,
                        new RString(myBatisParameter.getGogitaiNo()), 特記情報, batchReportWriter.getImageFolderPath());
            }
        }
        return null;
    }

    private JimuShinsakaiWariateJohoBusiness get主治医意見書情報(ShinseishoKanriNo shinseishoKanriNo) {
        for (ShinsakaiSiryoKyotsuEntity entity : 共通情報) {
            if (shinseishoKanriNo.equals(entity.getShinseishoKanriNo())) {
                entity.setJimukyoku(true);
                return new JimuShinsakaiWariateJohoBusiness(entity);
            }
        }
        return null;
    }

    private JimuSonotashiryoBusiness getその他資料情報(ShinseishoKanriNo shinseishoKanriNo) {
        JimuSonotashiryoBusiness business = null;
        for (ShinsakaiSiryoKyotsuEntity entity : 共通情報) {
            if (shinseishoKanriNo.equals(entity.getShinseishoKanriNo())) {
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
                RString 共有ファイル名 = entity.getShoKisaiHokenshaNo().concat(entity.getHihokenshaNo());
                RString path = getFilePath(entity.getImageSharedFileId(), 共有ファイル名);
                business = new JimuSonotashiryoBusiness(entity, イメージファイルリスト, 存在ファイルindex);
                business.set事務局概況特記イメージ(共有ファイルを引き出す(path, ファイル名_G0001));
                存在ファイルindex = business.get存在ファイルIndex();
                shinsakaiOrder = entity.getShinsakaiOrder();
            }
        }
        return business;
    }

    private ShinsakaiSiryoKyotsuEntity get共通情報(List<ShinsakaiSiryoKyotsuEntity> 共通情報,
            ShinseishoKanriNo 申請書管理番号) {
        for (ShinsakaiSiryoKyotsuEntity 共通情報Entity : 共通情報) {
            if (申請書管理番号.equals(共通情報Entity.getShinseishoKanriNo())) {
                共通情報Entity.setJimukyoku(true);
                return 共通情報Entity;
            }
        }
        return null;
    }

    private List<DbT5205NinteichosahyoTokkijikoEntity> get特記情報(ShinsakaiSiryoKyotsuEntity entity) {
        List<ShinseishoKanriNo> 申請書管理番号リスト = new ArrayList<>();
        List<Integer> 認定調査依頼履歴番号リスト = new ArrayList<>();
        申請書管理番号リスト.add(entity.getShinseishoKanriNo());
        認定調査依頼履歴番号リスト.add(entity.getNinteichosaRirekiNo());
        myBatisParameter.setGenponMaskKubun(GenponMaskKubun.原本.getコード());
        myBatisParameter.setShinseishoKanriNoList(申請書管理番号リスト);
        myBatisParameter.setNinteichosaRirekiNoList(認定調査依頼履歴番号リスト);
        return mapper.get事務局特記情報(myBatisParameter);
    }

    @Override
    protected void afterExecute() {
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
                SharedFile.copyToLocal(descriptor, new FilesystemPath(batchReportWriter.getImageFolderPath()));
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

    private RString 共有ファイルを引き出す(RString path, RString fileName) {
        if (!RString.isNullOrEmpty(getFilePath(path, fileName))) {
            return getFilePath(path, fileName);
        }
        return RString.EMPTY;
    }

    private RString getFilePath(RString 出力イメージフォルダパス, RString ファイル名) {
        if (Directory.exists(Path.combinePath(出力イメージフォルダパス, SEPARATOR, ファイル名))) {
            return Path.combinePath(出力イメージフォルダパス, SEPARATOR, ファイル名);
        }
        return RString.EMPTY;
    }

    private RString getFilePath(RDateTime sharedFileId, RString sharedFileName) {
        ReadOnlySharedFileEntryDescriptor descriptor
                = new ReadOnlySharedFileEntryDescriptor(new FilesystemName(sharedFileName),
                        sharedFileId);
        try {
            SharedFile.copyToLocal(descriptor, new FilesystemPath(batchReportWriter.getImageFolderPath()));
        } catch (Exception e) {
            return RString.EMPTY;
        }
        return sharedFileName;
    }
}
