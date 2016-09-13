/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.hokenryononyutsuchishobook;

import jp.co.ndensan.reams.db.dbb.entity.report.hokenryononyutsuchishobook.HokenryoNonyuTsuchishoBookFuriKaeNashiRenchoCoverSource;
import jp.co.ndensan.reams.uz.uza.report.ReportEditorJoiner;

/**
 * 保険料納入通知書（本算定）【ブックタイプ】（口振依頼なし）通知書_連帳 HokenryoNonyuTsuchishoBookFuriKaeNashiRenchoCoverBuilder
 *
 * @reamsid_L DBB-9110-010 huangh
 */
public class HokenryoNonyuTsuchishoBookFuriKaeNashiRenchoCoverBuilder implements IHokenryoNonyuTsuchishoBookFuriKaeNashiRenchoCoverBuilder {

    private final IHokenryoNonyuTsuchishoBookFuriKaeNashiRenchoCoverEditor editor;

    /**
     * インスタンスを生成します。
     *
     * @param editor {@link IHokenryoNonyuTsuchishoBookFuriKaeNashiRenchoCoverEditor}
     */
    public HokenryoNonyuTsuchishoBookFuriKaeNashiRenchoCoverBuilder(IHokenryoNonyuTsuchishoBookFuriKaeNashiRenchoCoverEditor editor) {
        this.editor = editor;
    }

    @Override
    public HokenryoNonyuTsuchishoBookFuriKaeNashiRenchoCoverSource build() {
        return ReportEditorJoiner.from(new HokenryoNonyuTsuchishoBookFuriKaeNashiRenchoCoverSource()).join(editor).buildSource();
    }

}