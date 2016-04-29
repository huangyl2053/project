/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.tokubetsuchoshukaishitsuchishokari;

import jp.co.ndensan.reams.db.dbb.entity.report.tokubetsuchoshukaishitsuchishokari.TokubetsuChoshuKaishiTsuchishoKariOverlayB5YokoSource;
import jp.co.ndensan.reams.uz.uza.report.ReportEditorJoiner;

/**
 * 特別徴収開始通知書（仮算定）帳票 B5横・オーバレイタイプBuilder
 *
 * @reamsid_L DBB-0790-050 lijunjun
 */
public class TokubetsuChoshuKaishiTsuchishoKariOverlayB5YokoBuilder implements
        ITokubetsuChoshuKaishiTsuchishoKariOverlayB5YokoBuilder {

    private final ITokubetsuChoshuKaishiTsuchishoKariOverlayB5YokoEditor eidtor;

    /**
     * コンストラクタです
     *
     * @param eidtor ITokubetsuChoshuKaishiTsuchishoKariB5RenchoEditor
     */
    public TokubetsuChoshuKaishiTsuchishoKariOverlayB5YokoBuilder(
            ITokubetsuChoshuKaishiTsuchishoKariOverlayB5YokoEditor eidtor) {
        this.eidtor = eidtor;
    }

    @Override
    public TokubetsuChoshuKaishiTsuchishoKariOverlayB5YokoSource build() {
        return ReportEditorJoiner.from(new TokubetsuChoshuKaishiTsuchishoKariOverlayB5YokoSource())
                .join(eidtor).buildSource();
    }
}
