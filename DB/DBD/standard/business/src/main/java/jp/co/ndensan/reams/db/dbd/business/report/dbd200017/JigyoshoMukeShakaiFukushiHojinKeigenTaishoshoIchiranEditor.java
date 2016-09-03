/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.business.report.dbd200017;

import jp.co.ndensan.reams.db.dbd.entity.db.relate.dbd206010.ShafukugemmenTaishoshaJohoEntity;
import jp.co.ndensan.reams.db.dbd.entity.report.dbd200017.JigyoshoMukeShakaiFukushiHojinKeigenReportSource;
import jp.co.ndensan.reams.db.dbz.definition.core.seibetsu.Seibetsu;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigojotaikubun.YokaigoJotaiKubun;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.ui.binding.propertyenum.DisplayTimeFormat;

/**
 * 事業所向け社会福祉法人軽減対象者一覧表Editorです。
 *
 * @reamsid_L DBD-3810-040 donghj
 */
public class JigyoshoMukeShakaiFukushiHojinKeigenTaishoshoIchiranEditor implements
        IJigyoshoMukeShakaiFukushiHojinKeigenTaishoshoIchiranEditor {

    private final ShafukugemmenTaishoshaJohoEntity 社福減免対象者情報;
    private final Association 地方公共団体;
    private final int index;

    /**
     * インスタンスを生成します。
     *
     * @param 社福減免対象者情報 ShafukugemmenTaishoshaJohoEntity
     * @param 地方公共団体 Association
     * @param index int
     */
    public JigyoshoMukeShakaiFukushiHojinKeigenTaishoshoIchiranEditor(
            ShafukugemmenTaishoshaJohoEntity 社福減免対象者情報, Association 地方公共団体, int index) {
        this.社福減免対象者情報 = 社福減免対象者情報;
        this.地方公共団体 = 地方公共団体;
        this.index = index;
    }

    @Override
    public JigyoshoMukeShakaiFukushiHojinKeigenReportSource edit(JigyoshoMukeShakaiFukushiHojinKeigenReportSource source) {
        return edit項目(source);
    }

    private JigyoshoMukeShakaiFukushiHojinKeigenReportSource edit項目(JigyoshoMukeShakaiFukushiHojinKeigenReportSource source) {
        source.printTimeStamp = get作成日付();

        source.hokenshaNo = 地方公共団体.get地方公共団体コード().getColumnValue();
        source.hokenshaName = 地方公共団体.get市町村名();

//        source.shutsuryokujun1 =;
//        source.shutsuryokujun2 =;
//        source.shutsuryokujun3 =;
//        source.shutsuryokujun4 =;
//        source.shutsuryokujun5 =;
//        source.kaiPege1 =;
//        source.kaiPege2 =;
//        source.kaiPege3 =;
//        source.kaiPege4 =;
//        source.kaiPege5 =;
        source.jigyoshaCd = 社福減免対象者情報.get事業所番号();
        source.jigyoshaName = 社福減免対象者情報.get事業者名称();
        source.yubinNo = 社福減免対象者情報.get郵便番号();
        source.jusho = 社福減免対象者情報.get事業者住所().getColumnValue();
        source.telNo = 社福減免対象者情報.get電話番号().getColumnValue();

        source.listHihokenshaNameKana_1 = 社福減免対象者情報.getカナ名称().getColumnValue();
        source.listHihokenshaName_1 = 社福減免対象者情報.get名称().getColumnValue();
        source.listMeisai_1 = new RString(index);
        source.listMeisai_2 = 社福減免対象者情報.get被保険者番号().getColumnValue();
        if (new RString("1").equals(社福減免対象者情報.get住民種別コード())
                || new RString("3").equals(社福減免対象者情報.get住民種別コード())) {
            source.listMeisai_3 = 社福減免対象者情報.get生年月日().wareki().eraType(EraType.KANJI).
                    firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
        } else {
            source.listMeisai_3 = 社福減免対象者情報.get生年月日().seireki().separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
        }
        source.listMeisai_4 = Seibetsu.toValue(社福減免対象者情報.get性別コード()).get名称();
        source.listMeisai_5 = YokaigoJotaiKubun.toValue(社福減免対象者情報.get要介護認定状態区分コード().getColumnValue()).get名称();
        source.listMeisai_6 = 社福減免対象者情報.get確認番号();
        source.listMeisai_7 = 社福減免対象者情報.get適用開始年月日().wareki().eraType(EraType.KANJI).
                firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
        source.listMeisai_8 = 社福減免対象者情報.get適用終了年月日().wareki().eraType(EraType.KANJI).
                firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
        source.listMeisai_9 = getサービス限定();

        source.listShohokenshaNo_1 = 社福減免対象者情報.get証記載保険者番号().getColumnValue();
        Association association = AssociationFinderFactory.createInstance().getAssociation(
                new LasdecCode(社福減免対象者情報.get証記載保険者番号().getColumnValue()));
        source.listShohokenshaName_1 = association.get市町村名();

        return source;
    }

    private RString get作成日付() {
        RStringBuilder systemDateTime = new RStringBuilder();
        RDateTime datetime = RDate.getNowDateTime();
        systemDateTime.append(datetime.getDate().wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN).
                separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString());
        RString 時分秒 = datetime.getTime().toFormattedTimeString(DisplayTimeFormat.HH時mm分ss秒);
        systemDateTime.append(時分秒);
        return systemDateTime.toRString();
    }

    private RString getサービス限定() {
        RStringBuilder サービス限定 = new RStringBuilder();
        if (社福減免対象者情報.is居宅サービス限定()) {
            サービス限定.append(new RString("宅"));
        } else {
            サービス限定.append(RString.FULL_SPACE);
        }
        if (社福減免対象者情報.is居住費食費のみ()) {
            サービス限定.append(new RString("住"));
        } else {
            サービス限定.append(RString.FULL_SPACE);
        }
        if (社福減免対象者情報.is旧措置者ユニット型個室のみ()) {
            サービス限定.append(new RString("ユ"));
        } else {
            サービス限定.append(RString.FULL_SPACE);
        }
        return サービス限定.toRString();
    }

}
