/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.shokanketteissuchishosealer;

import jp.co.ndensan.reams.db.dbc.entity.report.source.shokanketteitsuchishosealer.ShokanKetteiTsuchiShoSealer2ReportSource;
import jp.co.ndensan.reams.uz.uza.report.ReportEditorJoiner;

/**
 * 償還払支給（不支給）決定通知書（ｼｰﾗﾀｲﾌﾟ2）Builderのインターフェースクラスです。
 *
 */
class ShokanKetteiTsuchiShoSealer2BuliderImpl implements IShokanKetteiTsuchiShoSealer2Builder {

    private final IShokanKetteiTsuchiShoSealer2Editor editor;

    /**
     * インスタンスを生成します。
     *
     * @param editor {@link IShokanKetteiTsuchiShoSealer2Editor}
     */
    public ShokanKetteiTsuchiShoSealer2BuliderImpl(IShokanKetteiTsuchiShoSealer2Editor editor) {
        this.editor = editor;
    }

    /**
     * 帳票ソースをビルドします。
     *
     * @return {@link NinteiChosaTokusokuTaishoshaIchiranhyoReportSource}
     */
    @Override
    public ShokanKetteiTsuchiShoSealer2ReportSource build() {
        return ReportEditorJoiner.from(new ShokanKetteiTsuchiShoSealer2ReportSource()).join(editor).buildSource();
    }

}
