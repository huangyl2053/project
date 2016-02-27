/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.karisanteinonyutsuchishocvsmultinofusho;

import jp.co.ndensan.reams.db.dbb.entity.db.report.karisanteinonyutsuchishocvsmulti.KarisanteiNonyuTsuchishoCVSMultiNofushoSource;
import jp.co.ndensan.reams.uz.uza.report.ReportEditorJoiner;

/**
 * 保険料納入通知書（仮算定）【コンビニマルチ収納タイプ】納付書のBuilder
 *
 */
public class KarisanteiNonyuTsuchishoCVSMultiNofushoBuilder implements IKarisanteiNonyuTsuchishoCVSMultiNofushoBuilder {

    private final IKarisanteiNonyuTsuchishoCVSMultiNofushoEditor nofushoEditor;

    /**
     * インスタンスを生成します。
     *
     * @param nofushoEditor nofushoEditor
     */
    public KarisanteiNonyuTsuchishoCVSMultiNofushoBuilder(
            IKarisanteiNonyuTsuchishoCVSMultiNofushoEditor nofushoEditor) {

        this.nofushoEditor = nofushoEditor;
    }

    /**
     * 帳票ソースをビルドします。
     *
     * @return {@link KarisanteiNonyuTsuchishoCVSMultiNofushoSource}
     */
    @Override
    public KarisanteiNonyuTsuchishoCVSMultiNofushoSource build() {
        return ReportEditorJoiner.from(new KarisanteiNonyuTsuchishoCVSMultiNofushoSource()).join(nofushoEditor).buildSource();

    }

}
