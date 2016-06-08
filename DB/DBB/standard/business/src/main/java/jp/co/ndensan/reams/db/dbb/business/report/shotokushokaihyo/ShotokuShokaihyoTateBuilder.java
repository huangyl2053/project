/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.shotokushokaihyo;

import jp.co.ndensan.reams.db.dbb.entity.report.shotokushokaihyo.ShotokuShokaihyoTateSource;
import jp.co.ndensan.reams.uz.uza.report.ReportEditorJoiner;

/**
 * 帳票設計_DBBPR51002_所得照会票
 *
 * @reamsid_L DBB-1710-030 xuhao
 */
public class ShotokuShokaihyoTateBuilder implements IShotokuShokaihyoTateBuilder {

    private final IShotokuShokaihyoTateEditor editor;

    /**
     * インスタンスを生成します。
     *
     * @param editor {@link IKarisanteiFukaDaichoEditor}
     */
    public ShotokuShokaihyoTateBuilder(IShotokuShokaihyoTateEditor editor) {
        this.editor = editor;
    }

    /**
     * 帳票ソースビルド
     *
     * @return {@link JuToGaishaKojinBangoKakuninListReportSource}
     */
    @Override
    public ShotokuShokaihyoTateSource build() {
        return ReportEditorJoiner.from(new ShotokuShokaihyoTateSource()).join(editor).buildSource();
    }

}
