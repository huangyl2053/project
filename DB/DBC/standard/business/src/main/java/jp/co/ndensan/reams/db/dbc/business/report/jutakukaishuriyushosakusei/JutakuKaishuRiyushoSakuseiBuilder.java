/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.jutakukaishuriyushosakusei;

import jp.co.ndensan.reams.db.dbc.entity.report.jutakukaishuriyushosakusei.JutakuKaishuRiyushoSakuseiReportSource;
import jp.co.ndensan.reams.uz.uza.report.ReportEditorJoiner;

/**
 * 帳票設計_DBC100044_住宅改修理由書作成手数料支給（不支給）決定通知書Builderクラスです。
 *
 * @reamsid_L DBC-2850-040 lizhuoxuan
 *
 */
public class JutakuKaishuRiyushoSakuseiBuilder implements IJutakuKaishuRiyushoSakuseiBuilder {

    private final IJutakuKaishuRiyushoSakuseiEditor editor;

    /**
     * インスタンスを生成します。
     *
     * @param editor {@link IJutakuKaishuRiyushoSakuseiEditor}
     */
    public JutakuKaishuRiyushoSakuseiBuilder(IJutakuKaishuRiyushoSakuseiEditor editor) {
        this.editor = editor;
    }

    /**
     * 帳票ソースをビルドします。
     *
     * @return {@link JutakuKaishuRiyushoSakuseiReportSource}
     */
    @Override
    public JutakuKaishuRiyushoSakuseiReportSource build() {
        return ReportEditorJoiner.from(new JutakuKaishuRiyushoSakuseiReportSource()).join(editor).buildSource();
    }
}