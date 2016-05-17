/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.henkokenchushitsuchisho.a4tate;

import jp.co.ndensan.reams.db.dbb.entity.report.henkokenchushitsuchisho.KaigoHokenryogakuHenkoKenChushiTsuchishoA4TateReportSource;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;

/**
 *
 * 介護保険料額変更兼特別徴収中止通知書のA4縦タイプのEditorです。
 *
 * @reamsid_L DBB-9080-020 sunhaidi
 */
public class CompNinshoshaEditor implements IKaigoHokenryogakuHenkoKenChushiTsuchishoA4TateEditor {

    private final NinshoshaSource ninshoshaSource;

    /**
     * インスタンスを生成します。
     *
     * @param ninshoshaSource NinshoshaSource
     */
    protected CompNinshoshaEditor(NinshoshaSource ninshoshaSource) {
        this.ninshoshaSource = ninshoshaSource;
    }

    @Override
    public KaigoHokenryogakuHenkoKenChushiTsuchishoA4TateReportSource edit(KaigoHokenryogakuHenkoKenChushiTsuchishoA4TateReportSource source) {
        source.denshiKoin = ninshoshaSource.denshiKoin;
        source.hakkoYMD = ninshoshaSource.hakkoYMD;
        source.koinMojiretsu = ninshoshaSource.koinMojiretsu;
        source.ninshoshaShimeiKakeru = ninshoshaSource.ninshoshaShimeiKakeru;
        source.ninshoshaShimeiKakenai = ninshoshaSource.ninshoshaShimeiKakenai;
        source.ninshoshaYakushokuMei = ninshoshaSource.ninshoshaYakushokuMei;
        source.koinShoryaku = ninshoshaSource.koinShoryaku;
        return source;
    }

}
