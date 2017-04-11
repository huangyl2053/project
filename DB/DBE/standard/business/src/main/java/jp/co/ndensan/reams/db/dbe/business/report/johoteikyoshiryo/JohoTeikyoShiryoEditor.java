/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.johoteikyoshiryo;

import jp.co.ndensan.reams.db.dbe.entity.report.johoteikyoshiryo.JohoTeikyoShiryoReportSource;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;

/**
 * 要介護認定結果情報提供票（主治医）のEditorです。
 *
 * @reamsid_L DBE-0220-020 wangkun
 */
public class JohoTeikyoShiryoEditor implements IJohoTeikyoShiryoEditor {

    private final JohoTeikyoShiryo item;

    /**
     * インスタンスを生成します。
     *
     * @param item {@link JohoTeikyoShiryo}
     */
    protected JohoTeikyoShiryoEditor(JohoTeikyoShiryo item) {
        this.item = item;
    }

    @Override
    public JohoTeikyoShiryoReportSource edit(JohoTeikyoShiryoReportSource source) {
        return editSource(source);
    }

    private JohoTeikyoShiryoReportSource editSource(JohoTeikyoShiryoReportSource source) {
        if (item != null) {
            if (item.getHakkoYMD() != null) {
                source.hakkoYMD = item.getHakkoYMD().wareki()
                        .eraType(EraType.KANJI)
                        .firstYear(FirstYear.GAN_NEN)
                        .separator(Separator.JAPANESE)
                        .fillType(FillType.BLANK).toDateString();
            }
            source.title = item.getTitle();
            source.tsuchibun1 = item.getTsuchibun1();
            source.hihokenshaName = item.getHihokenshaName();
            source.jusho = item.getJusho();
            if (item.getInfoNijiDate() != null) {
                source.infoNijiDate = item.getInfoNijiDate().wareki()
                        .eraType(EraType.KANJI)
                        .firstYear(FirstYear.GAN_NEN)
                        .separator(Separator.JAPANESE)
                        .fillType(FillType.BLANK).toDateString();
                source.ninteiKekka = item.getNinteiKekka();
            }
            if (item.getYokaigoNiteiKaishoYMD() != null) {
                source.yokaigoNiteiKaishoYMD = item.getYokaigoNiteiKaishoYMD().wareki()
                        .eraType(EraType.KANJI)
                        .firstYear(FirstYear.GAN_NEN)
                        .separator(Separator.JAPANESE)
                        .fillType(FillType.BLANK).toDateString();

            }
            if (item.getYokaigoNinteiShuryoYMD() != null) {
                source.yokaigoNinteiShuryoYMD = item.getYokaigoNinteiShuryoYMD().wareki()
                        .eraType(EraType.KANJI)
                        .firstYear(FirstYear.GAN_NEN)
                        .separator(Separator.JAPANESE)
                        .fillType(FillType.BLANK).toDateString();
            }
            source.shinsakaiIken = item.getShinsakaiIken();
            source.denshiKoin = item.getDenshiKoin();
            source.koinMojiretsu = item.getKoinMojiretsu();
            source.koinShoryaku = item.getKoinShoryaku();
            source.ninshoshaShimeiKakeru = item.getNinshoshaShimeiKakeru();
            source.ninshoshaShimeiKakenai = item.getNinshoshaShimeiKakenai();
            source.ninshoshaYakushokuMei = item.getNinshoshaYakushokuMei();
            source.ninshoshaYakushokuMei1 = item.getNinshoshaYakushokuMei1();
            source.ninshoshaYakushokuMei2 = item.getNinshoshaYakushokuMei2();
            source.bunshoNo = item.getBunshoNo();
            source.pageCount = item.getPageCount();
            source.customerBarCode = item.getCustomerBarCode();
            source.jushoText = item.getJushoText();
            source.kikanNameText = item.getKikanNameText();
            source.shimeiText = item.getShimeiText();
            source.meishoFuyo = item.getMeishoFuyo();
            source.sonota = item.getSonota();
            source.tsuchibun2 = item.getTsuchibun2();
            source.yubinNo = item.getYubinNo();
            setAccessLogInfo(source);
        }
        return source;
    }
    
    private void setAccessLogInfo(JohoTeikyoShiryoReportSource source) {
        RStringBuilder 識別コードStr = new RStringBuilder();
        識別コードStr.append(item.getShoKisaiHokenshaNo().getColumnValue().substring(0, 5));
        識別コードStr.append(item.getHihokenshaNo());
        ShikibetsuCode 識別コード = new ShikibetsuCode(識別コードStr.toRString());
        ExpandedInformation 拡張情報 = new ExpandedInformation(new Code("0001"), new RString("申請書管理番号"), item.getShinseishoKanriNo());
        source.識別コード = 識別コード;
        source.拡張情報 = 拡張情報;
    }
}
