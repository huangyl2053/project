/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.karisanteihokenryononyutsuchishokigoto;

import jp.co.ndensan.reams.db.dbb.entity.report.karisanteihokenryononyutsuchishokigoto.KarisanteiHokenryoNonyuTsuchishoKigotoRenchoSource;
import jp.co.ndensan.reams.uz.uza.report.ReportEditorJoiner;

/**
 *
 * 帳票設計_DBBRP00007_2_保険料納入通知書（仮算定）【期毎タイプ】連帳 KarisanteiHokenryoNonyuTsuchishoKigotoRenchoBuilder
 *
 * @reamsid_L DBB-9110-020 wangjie2
 */
public class KarisanteiHokenryoNonyuTsuchishoKigotoRenchoBuilder implements IKarisanteiHokenryoNonyuTsuchishoKigotoRenchoBuilder {

    private final IKarisanteiHokenryoNonyuTsuchishoKigotoRenchoEditor editor;

    /**
     * インスタンスを生成します。
     *
     * @param editor {@link IKarisanteiHokenryoNonyuTsuchishoKigotoEditor}
     */
    public KarisanteiHokenryoNonyuTsuchishoKigotoRenchoBuilder(IKarisanteiHokenryoNonyuTsuchishoKigotoRenchoEditor editor) {
        this.editor = editor;
    }

    @Override
    public KarisanteiHokenryoNonyuTsuchishoKigotoRenchoSource build() {
        return ReportEditorJoiner.from(new KarisanteiHokenryoNonyuTsuchishoKigotoRenchoSource()).join(editor).buildSource();
    }

}