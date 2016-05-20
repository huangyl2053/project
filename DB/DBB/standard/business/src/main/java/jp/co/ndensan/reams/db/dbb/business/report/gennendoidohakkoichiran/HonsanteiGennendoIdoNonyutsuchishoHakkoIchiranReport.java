/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.gennendoidohakkoichiran;

import java.util.List;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.EditedHonSanteiTsuchiShoKyotsu;
import jp.co.ndensan.reams.db.dbb.entity.report.nonyutsuchishohonsanteihakkoichiran.NonyuTsuchIchiranSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.Report;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;

/**
 * 帳票設計_DBBRP44002_1_保険料納入通知書（本算定現年度異動）発行一覧表 Reportです。
 *
 * Sourceは帳票設計_DBBRP43002_2_保険料納入通知書（本算定）発行一覧表と同じです。
 *
 * @reamsid_L DBB-0880-050 zhangrui
 */
public class HonsanteiGennendoIdoNonyutsuchishoHakkoIchiranReport extends Report<NonyuTsuchIchiranSource> {

    private final List<EditedHonSanteiTsuchiShoKyotsu> 編集後本算定通知書共通情報;
    private final RString 賦課年度;
    private final RString 出力期;
    private final RString 帳票作成日時;
    private final RString 出力順ID;
    private final RString 地方公共団体コード;
    private final RString 市町村名;
    private static final int SIZE = 18;

    /**
     * コンストラクタです。
     *
     * @param 編集後本算定通知書共通情報 EditedHonSanteiTsuchiShoKyotsuのListです
     * @param 賦課年度 RString
     * @param 帳票作成日時 RString
     * @param 出力期 RString
     * @param 出力順ID RString
     * @param 地方公共団体コード RString
     * @param 市町村名 RString
     */
    public HonsanteiGennendoIdoNonyutsuchishoHakkoIchiranReport(
            List<EditedHonSanteiTsuchiShoKyotsu> 編集後本算定通知書共通情報,
            RString 賦課年度, RString 出力期, RString 帳票作成日時,
            RString 出力順ID, RString 地方公共団体コード, RString 市町村名) {
        this.編集後本算定通知書共通情報 = 編集後本算定通知書共通情報;
        this.賦課年度 = 賦課年度;
        this.出力期 = 出力期;
        this.帳票作成日時 = 帳票作成日時;
        this.出力順ID = 出力順ID;
        this.地方公共団体コード = 地方公共団体コード;
        this.市町村名 = 市町村名;
    }

    @Override
    public void writeBy(ReportSourceWriter<NonyuTsuchIchiranSource> writer) {
        int index = 0;
        for (EditedHonSanteiTsuchiShoKyotsu target : 編集後本算定通知書共通情報) {
            index++;
            int 連番 = (index - 1) % SIZE + 1;
            HonsanteiGennendoIdoNonyutsuchishoHakkoIchiranInputEntity inputEntity
                    = new HonsanteiGennendoIdoNonyutsuchishoHakkoIchiranInputEntity(target,
                            賦課年度, 出力期, 帳票作成日時, 出力順ID, 地方公共団体コード, 市町村名, 連番);
            IHonsanteiGennendoIdoNonyutsuchishoHakkoIchiranEditor headerEditor = new HeaderEditor(inputEntity);
            IHonsanteiGennendoIdoNonyutsuchishoHakkoIchiranEditor bodyEditor = new BodyEditor(inputEntity);
            IHonsanteiGennendoIdoNonyutsuchishoHakkoIchiranBuilder builder
                    = new HonsanteiGennendoIdoNonyutsuchishoHakkoIchiranBuilder(headerEditor, bodyEditor);
            writer.writeLine(builder);
        }

    }

}
