/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.dbbmn35003.dbb200014;

import jp.co.ndensan.reams.db.dbb.entity.report.dbbmn35003.dbb200014.KariSanteigakuHenkoTsuchishoHakkoIchiranReportSource;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RTime;
import jp.co.ndensan.reams.uz.uza.lang.Separator;

/**
 * 仮算定額変更通知書発行一覧表ヘッダEditorです。
 */
class KariSanteigakuHenkoTsuchishoHakkoIchiranHeaderEditor implements IKariSanteigakuHenkoTsuchishoHakkoIchiranEditor {

    private final KariSanteigakuHenkoTsuchishoHakkoIchiranItem item;

    /**
     * インスタンスを生成します。
     *
     * @param item {@link JukiRendoTorokuListItem}
     */
    public KariSanteigakuHenkoTsuchishoHakkoIchiranHeaderEditor(KariSanteigakuHenkoTsuchishoHakkoIchiranItem item) {
        this.item = item;
    }

    @Override
    public KariSanteigakuHenkoTsuchishoHakkoIchiranReportSource edit(KariSanteigakuHenkoTsuchishoHakkoIchiranReportSource source) {
        return editHeader(source);
    }

    private KariSanteigakuHenkoTsuchishoHakkoIchiranReportSource editHeader(KariSanteigakuHenkoTsuchishoHakkoIchiranReportSource source) {
        RTime time = RDate.getNowTime();
        RString hour = new RString(time.toString()).substring(0, 2);
        RString min = new RString(time.toString()).substring(3, 5);
        RString sec = new RString(time.toString()).substring(6, 8);
        RString timeFormat = hour.concat("時").concat(min).concat("分").concat(sec).concat("秒");
        source.printTimeStamp = new RString(RDate.getNowDate().wareki().eraType(EraType.KANJI).
                firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).
                fillType(FillType.ZERO).toDateString().toString() + RString.HALF_SPACE + timeFormat);
        source.nendo = item.getNendo();
        source.hokenshaName = item.getHokenshaName();
        source.hokenshaNo = item.getHokenshaNo();
        source.hyojicodeName1 = item.getHyojicodeName1();
        source.hyojicodeName2 = item.getHyojicodeName2();
        source.hyojicodeName3 = item.getHyojicodeName3();
        return source;
    }

}
