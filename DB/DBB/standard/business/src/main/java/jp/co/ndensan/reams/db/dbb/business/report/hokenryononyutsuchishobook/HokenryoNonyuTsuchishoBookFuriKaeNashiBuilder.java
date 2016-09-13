/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.hokenryononyutsuchishobook;

import jp.co.ndensan.reams.db.dbb.entity.report.hokenryononyutsuchishobook.HokenryoNonyuTsuchishoBookFuriKaeNashiCoverSource;
import jp.co.ndensan.reams.uz.uza.report.ReportEditorJoiner;

/**
 * 保険料納入通知書（本算定）【ブックタイプ】（口振依頼なし）通知書 HokenryoNonyuTsuchishoBookFuriKaeNashiBuilder
 *
 * @reamsid_L DBB-9110-010 huangh
 */
public class HokenryoNonyuTsuchishoBookFuriKaeNashiBuilder implements IHokenryoNonyuTsuchishoBookFuriKaeNashiBuilder {

    private final IHokenryoNonyuTsuchishoBookFuriKaeNashiEditor editor;

    /**
     * インスタンスを生成します。
     *
     * @param editor {@link IHokenryoNonyuTsuchishoBookFuriKaeNashiEditor}
     */
    public HokenryoNonyuTsuchishoBookFuriKaeNashiBuilder(IHokenryoNonyuTsuchishoBookFuriKaeNashiEditor editor) {
        this.editor = editor;
    }

    @Override
    public HokenryoNonyuTsuchishoBookFuriKaeNashiCoverSource build() {
        return ReportEditorJoiner.from(new HokenryoNonyuTsuchishoBookFuriKaeNashiCoverSource()).join(editor).buildSource();
    }

}