/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.business.report.dbd100007;

import java.util.Map;
import jp.co.ndensan.reams.db.dbd.business.core.shiharaihohohenko.ShiharaiHohoHenko;
import jp.co.ndensan.reams.db.dbd.entity.report.dbd100007.SashitomeShobunTsuchishoNigoReportSource;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoKyotsu;
import jp.co.ndensan.reams.ua.uax.business.core.atesaki.IAtesaki;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.kojin.IKojin;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.Report;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 差止処分通知書（２号被保険者用）のReportです。
 *
 * @reamsid_L DBD-3640-080 b_liuyang2
 */
public final class SashitomeShobunTsuchishoNigoReport extends Report<SashitomeShobunTsuchishoNigoReportSource> {

    private final IKojin 個人情報;
    private final IAtesaki 宛先;
    private final ChohyoSeigyoKyotsu 帳票制御共通;
    private final Association 地方公共団体;
    private final RString 文書番号;
    private final Map<Integer, RString> 通知書定型文リスト;
    private final NinshoshaSource 認証者ソースビルダー;
    private final ShiharaiHohoHenko 帳票情報;

    /**
     * インスタンスを生成します。
     *
     * @param 個人情報 IKojin
     * @param 宛先 IAtesaki
     * @param 帳票制御共通 ChohyoSeigyoKyotsu
     * @param 地方公共団体 Association
     * @param 文書番号 RString
     * @param 通知書定型文リスト Map<Integer, RString>
     * @param 認証者ソースビルダー NinshoshaSource
     * @param 帳票情報 ShiharaiHohoHenko
     * @return 差止処分通知書（２号被保険者用）
     */
    public static SashitomeShobunTsuchishoNigoReport createReport(IKojin 個人情報, IAtesaki 宛先,
            ChohyoSeigyoKyotsu 帳票制御共通, Association 地方公共団体, RString 文書番号, Map<Integer, RString> 通知書定型文リスト,
            NinshoshaSource 認証者ソースビルダー, ShiharaiHohoHenko 帳票情報) {
        return new SashitomeShobunTsuchishoNigoReport(個人情報, 宛先, 帳票制御共通, 地方公共団体, 文書番号, 通知書定型文リスト,
                認証者ソースビルダー, 帳票情報);
    }

    private SashitomeShobunTsuchishoNigoReport(IKojin 個人情報, IAtesaki 宛先, ChohyoSeigyoKyotsu 帳票制御共通,
            Association 地方公共団体, RString 文書番号, Map<Integer, RString> 通知書定型文リスト,
            NinshoshaSource 認証者ソースビルダー, ShiharaiHohoHenko 帳票情報) {
        this.個人情報 = 個人情報;
        this.宛先 = 宛先;
        this.帳票制御共通 = 帳票制御共通;
        this.地方公共団体 = 地方公共団体;
        this.文書番号 = 文書番号;
        this.通知書定型文リスト = 通知書定型文リスト;
        this.認証者ソースビルダー = 認証者ソースビルダー;
        this.帳票情報 = 帳票情報;
    }

    /**
     * writeBy
     *
     * @param writer ReportSourceWriter
     */
    @Override
    public void writeBy(ReportSourceWriter<SashitomeShobunTsuchishoNigoReportSource> writer) {
        ISashitomeShobunTsuchishoNigoEditor bodyEditor = new SashitomeShobunTsuchishoNigoEditor(個人情報, 宛先,
                帳票制御共通, 地方公共団体, 文書番号, 通知書定型文リスト, 認証者ソースビルダー, 帳票情報);
        ISashitomeShobunTsuchishoNigoBuilder builder = new SashitomeShobunTsuchishoNigoBuilder(bodyEditor);
        writer.writeLine(builder);
    }
}