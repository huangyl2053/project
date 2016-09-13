/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.business.report.bemmeisyo;

import jp.co.ndensan.reams.db.dbu.entity.report.bemmeisyo.BemmeisyoReportSource;
import jp.co.ndensan.reams.uz.uza.report.ReportEditorJoiner;

/**
 * 弁明書Builderクラスです。
 *
 * @reamsid_L DBU-1080-150 linghuhang
 */
class BemmeisyoBuilderImpl implements IBemmeisyoBuilder {

    private final IBemmeisyoEditor headerEditor;

    /**
     * インスタンスを生成します。
     *
     * @param headerEditor {@link IBemmeisyoEditor}
     */
    public BemmeisyoBuilderImpl(IBemmeisyoEditor headerEditor) {
        this.headerEditor = headerEditor;
    }

    /**
     * 帳票ソースをビルドします。
     *
     * @return {@link BemmeisyoReportSource}
     */
    @Override
    public BemmeisyoReportSource build() {
        return ReportEditorJoiner.from(new BemmeisyoReportSource()).join(headerEditor).buildSource();
    }
}