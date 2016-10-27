/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.batchcontroller.step.DBC040050;

import jp.co.ndensan.reams.db.dbc.business.report.dbc200040.GassanShikyuFushikyuKetteishaIchiranReport;
import jp.co.ndensan.reams.db.dbc.definition.mybatisprm.kogakugassanshikyuketteitsuchisho.KogakugassanShikyuKetteitsuchishoMybatisParameter;
import jp.co.ndensan.reams.db.dbc.definition.processprm.kogakugassanshikyuketteitsuchisho.KogakugassanShikyuKetteitsuchishoProcessParameter;
import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kogakugassanshikyuketteitsuchisho.KogakuGassanShikyuFushikyuKetteiResultEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.kogakugassanshikyuketteitsuchisho.KogakugassanShikyuKetteitsuchishoTempEntity;
import jp.co.ndensan.reams.db.dbc.entity.report.dbc200040.GassanShikyuFushikyuKetteishaIchiranSource;
import jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate.kogakugassanshikyuketteitsuchisho.IKogakugassanShikyuKetteitsuchishoMapper;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchDbReader;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchEntityCreatedTempTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchProcessBase;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportFactory;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchReportWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.BatchWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchReader;
import jp.co.ndensan.reams.uz.uza.batch.process.IBatchTableWriter;
import jp.co.ndensan.reams.uz.uza.batch.process.OutputParameter;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 対象者抽出processクラスです。
 *
 * @reamsid_L DBC-2300-030 xuhao
 */
public class GetTaishoshaChushutsuProcess extends BatchProcessBase<KogakuGassanShikyuFushikyuKetteiResultEntity> {

    /**
     * OutputParameter用キー systemTime
     */
    public static final RString 件数;

    static {
        件数 = new RString("出力件数");

    }
    private OutputParameter<Integer> 出力件数;
    private static final RString READ_DATA_ID = new RString("jp.co.ndensan.reams.db.dbc.persistence.db.mapper.relate."
            + "kogakugassanshikyuketteitsuchisho.IKogakugassanShikyuKetteitsuchishoMapper.select高額合算支給不支給決定データ");

    private KogakugassanShikyuKetteitsuchishoProcessParameter processParameter;
    private int 対象者抽出件数;
    private static final RString TABLE_NAME = new RString("KogakugassanShikyuKetteitsuchishoTemp");
    private static final int INT_0 = 0;
    private static final int INT_1 = 1;
    private static final RString データ区分_国保連作成 = new RString("1");
    private static final RString データ区分_国保連作成返却 = new RString("3");
    private static final YubinNo 最大郵便番号 = new YubinNo("9999999");

    private BatchReportWriter<GassanShikyuFushikyuKetteishaIchiranSource> batchReportWriter_一覧表;
    private ReportSourceWriter<GassanShikyuFushikyuKetteishaIchiranSource> reportSourceWriter_一覧表;

    @BatchWriter
    private IBatchTableWriter tempDbWriter;

    @Override
    protected void initialize() {
        出力件数 = new OutputParameter<>();
        出力件数.setValue(INT_0);
        対象者抽出件数 = INT_0;
    }

    @Override
    protected void beforeExecute() {
        getMapper(IKogakugassanShikyuKetteitsuchishoMapper.class).delete高額合算支給決定通知書データ();
    }

    @Override
    protected IBatchReader createReader() {
        KogakugassanShikyuKetteitsuchishoMybatisParameter 高額合算支給不支給決定データParameter
                = new KogakugassanShikyuKetteitsuchishoMybatisParameter();
        高額合算支給不支給決定データParameter.set日付選択区分(processParameter.get日付選択区分());
        高額合算支給不支給決定データParameter.set印書区分(processParameter.get印書区分());
        高額合算支給不支給決定データParameter.set受取年月(processParameter.get受取年月());
        高額合算支給不支給決定データParameter.set申請開始年月日(processParameter.get申請開始年月日());
        高額合算支給不支給決定データParameter.set申請終了年月日(processParameter.get申請終了年月日());
        高額合算支給不支給決定データParameter.set決定開始年月日(processParameter.get決定開始年月日());
        高額合算支給不支給決定データParameter.set決定終了年月日(processParameter.get決定終了年月日());
        return new BatchDbReader(READ_DATA_ID, 高額合算支給不支給決定データParameter);
    }

    @Override
    protected void createWriter() {
        batchReportWriter_一覧表 = BatchReportFactory.createBatchReportWriter(
                ReportIdDBC.DBC200040.getReportId().value(), SubGyomuCode.DBC介護給付).create();
        reportSourceWriter_一覧表 = new ReportSourceWriter<>(batchReportWriter_一覧表);
        this.tempDbWriter = new BatchEntityCreatedTempTableWriter(TABLE_NAME, KogakugassanShikyuKetteitsuchishoTempEntity.class);
    }

    @Override
    protected void process(KogakuGassanShikyuFushikyuKetteiResultEntity entity) {
        if ((データ区分_国保連作成.equals(entity.getデータ区分()) || データ区分_国保連作成返却.equals(entity.getデータ区分()))
                && !最大郵便番号.equals(entity.get支給額計算結果連絡先郵便番号())) {
            KogakugassanShikyuKetteitsuchishoTempEntity データEntity = new KogakugassanShikyuKetteitsuchishoTempEntity();
            データEntity.setHihokenshaNo(entity.getHihokenshaNo());
            データEntity.setTaishoNendo(entity.getTaishoNendo());
            データEntity.setHokenshaNo(entity.getHokenshaNo());
            データEntity.setShikyuSeiriNo(entity.getShikyuSeiriNo());
            データEntity.setRirekiNo(entity.getRirekiNo());
            データEntity.setJikoFutanSeiriNo(entity.getJikoFutanSeiriNo());
            データEntity.setHokenSeidoCode(entity.getHokenSeidoCode());
            データEntity.setKokuho_HihokenshaShoKigo(entity.getKokuho_HihokenshaShoKigo());
            データEntity.setKeisanKaishiYMD(entity.getKeisanKaishiYMD());
            データEntity.setKeisanShuryoYMD(entity.getKeisanShuryoYMD());
            データEntity.setShinseiYMD(entity.getShinseiYMD());
            データEntity.setKetteiYMD(entity.getKetteiYMD());
            データEntity.setJikoFutanSogaku(entity.getJikoFutanSogaku());
            データEntity.setShikyuKubunCode(entity.getShikyuKubunCode());
            データEntity.setShikyugaku(entity.getShikyugaku());
            データEntity.setKyufuShurui(entity.getKyufuShurui());
            データEntity.setFushikyuRiyu(entity.getFushikyuRiyu());
            データEntity.setBiko(entity.getBiko());
            データEntity.setShiharaiHohoKubun(entity.getShiharaiHohoKubun());
            データEntity.setShiharaiBasho(entity.getShiharaiBasho());
            データEntity.setShiharaiKaishiYMD(entity.getShiharaiKaishiYMD());
            データEntity.setShiharaiShuryoYMD(entity.getShiharaiShuryoYMD());
            データEntity.setHeichoNaiyo(entity.getHeichoNaiyo());
            データEntity.setShiharaiKaishiTime(entity.getShiharaiKaishiTime());
            データEntity.setShiharaiShuryoTime(entity.getShiharaiShuryoTime());
            データEntity.setKetteiTsuchiSakuseiYMD(entity.getKetteiTsuchiSakuseiYMD());
            データEntity.setFurikomiTsuchiSakuseiYMD(entity.getFurikomiTsuchiSakuseiYMD());
            データEntity.setUketoriYM(entity.getUketoriYM());
            データEntity.setKozaID(entity.getKozaID());
            データEntity.setKetteiTsuchiRealHakkoFlag(entity.getKetteiTsuchiRealHakkoFlag());
            tempDbWriter.insert(データEntity);
            対象者抽出件数 = 対象者抽出件数 + INT_1;
        }
    }

    @Override
    protected void afterExecute() {
        出力件数.setValue(対象者抽出件数);
        if (対象者抽出件数 == INT_0) {
            GassanShikyuFushikyuKetteishaIchiranReport 一覧表report = new GassanShikyuFushikyuKetteishaIchiranReport(null,
                    processParameter.get処理日時(), false, null, null);
            一覧表report.writeBy(reportSourceWriter_一覧表);
            batchReportWriter_一覧表.close();
        }
    }

}
