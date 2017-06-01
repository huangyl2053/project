/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.ninteichosatokusokujyo;

import java.util.Map;
import jp.co.ndensan.reams.db.dbe.definition.core.chosa.ChohyoAtesakiKeisho;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.ninteichosatokusokujyo.AtenaKikan;
import jp.co.ndensan.reams.db.dbe.entity.report.ninteichosatokusokujyo.NinteiChosaTokusokujoReportSource;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBE;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbz.definition.core.seibetsu.Seibetsu;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.shinsei.NinteiShinseiShinseijiKubunCode;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5101NinteiShinseiJohoEntity;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;

/**
 * 要介護認定調査督促状のEditorです。
 *
 * @reamsid_L DBE-0030-020 xuyue
 */
public class NinteiChosaTokusokujoBodyEditor implements INinteiChosaTokusokujoEditor {

    private DbT5101NinteiShinseiJohoEntity entity;
    private final NinshoshaSource ninshoshaSource;
    private final RString 文書番号;
    private final Map<Integer, RString> 通知文;
    private final AtenaKikan atenaKikan;
    private final RString customerBarCode;
    private final FlexibleDate 調査依頼日;
    private final int pageCount;
    private static final int 一桁 = 1;
    private static final int 宛名連番桁数 = 8;

    /**
     * インスタンスを生成します。
     *
     * @param entity {@link DbT5101NinteiShinseiJohoEntity}
     * @param ninshoshaSource 認証者ソース
     * @param atenaKikan 宛名機関
     * @param 文書番号 文書番号
     * @param 通知文 通知文
     * @param customerBarCode customerBarCode
     * @param 調査依頼日 調査依頼日
     * @param pageCount ページ数
     */
    protected NinteiChosaTokusokujoBodyEditor(DbT5101NinteiShinseiJohoEntity entity, NinshoshaSource ninshoshaSource,
            AtenaKikan atenaKikan,
            RString 文書番号,
            Map<Integer, RString> 通知文, RString customerBarCode,
            FlexibleDate 調査依頼日, int pageCount) {
        this.entity = entity;
        this.ninshoshaSource = ninshoshaSource;
        this.atenaKikan = atenaKikan;
        this.文書番号 = 文書番号;
        this.通知文 = 通知文;
        this.customerBarCode = customerBarCode;
        this.調査依頼日 = 調査依頼日;
        this.pageCount = pageCount;
    }

    @Override
    public NinteiChosaTokusokujoReportSource edit(NinteiChosaTokusokujoReportSource source) {
        return editBody(source);
    }

    private NinteiChosaTokusokujoReportSource editBody(NinteiChosaTokusokujoReportSource source) {
        edit文書番号(source);
        edit認証者(source);
        editカスタマーバーコード(source);
        edit宛名郵便番号(source);
        edit宛名住所(source);
        edit宛名機関名(source);
        edit宛名機関名(source);
        edit宛名氏名(source);
        edti宛名名称付与(source);
        edit宛名その他(source);
        edit宛名連番(source);
        editタイトル(source);
        edit通知文定型文(source);
        edti被保険者番号(source);
        edit保険者番号(source);
        edit申請区分(source);
        edit被保険者氏名カナ(source);
        edit被保険者氏名(source);
        edit調査依頼日(source);
        edit申請日(source);
        edit性別(source);
        edti誕生日(source);
        edit住所郵便(source);
        edit住所(source);
        edit通知文問合せ(source);
        edit識別コード(source);
        edit拡張情報(source);
        return source;
    }

    private void edit文書番号(NinteiChosaTokusokujoReportSource source) {
        source.bunshoNo = 文書番号;
    }

    private void edit認証者(NinteiChosaTokusokujoReportSource source) {
        source.hakkoYMD1 = ninshoshaSource.hakkoYMD;
        source.denshiKoin = ninshoshaSource.denshiKoin;
        source.koinMojiretsu = ninshoshaSource.koinMojiretsu;
        source.koinShoryaku = ninshoshaSource.koinShoryaku;
        source.ninshoshaYakushokuMei = ninshoshaSource.ninshoshaYakushokuMei;
        source.ninshoshaYakushokuMei1 = ninshoshaSource.ninshoshaYakushokuMei1;
        source.ninshoshaYakushokuMei2 = ninshoshaSource.ninshoshaYakushokuMei2;
        source.ninshoshaShimeiKakenai = ninshoshaSource.ninshoshaShimeiKakenai;
        source.ninshoshaShimeiKakeru = ninshoshaSource.ninshoshaShimeiKakeru;
    }

    private void editカスタマーバーコード(NinteiChosaTokusokujoReportSource source) {
        source.customerBarCode = customerBarCode;
    }

    private void edit宛名郵便番号(NinteiChosaTokusokujoReportSource source) {
        RString 宛名郵便番号 = RString.EMPTY;
        if (atenaKikan.get宛名郵便番号() != null) {
            宛名郵便番号 = atenaKikan.get宛名郵便番号().getEditedYubinNo();
        }
        source.yubinNo1 = 宛名郵便番号;
    }

    private void edit宛名住所(NinteiChosaTokusokujoReportSource source) {
        RString 住所 = RString.EMPTY;
        if (atenaKikan.get宛名住所() != null) {
            住所 = atenaKikan.get宛名住所();
        }

        source.jushoText = 住所;
    }

    private void edit宛名機関名(NinteiChosaTokusokujoReportSource source) {
        source.kikanNameText = atenaKikan.get宛名機関名();
    }

    private void edit宛名氏名(NinteiChosaTokusokujoReportSource source) {
        source.shimeiText = atenaKikan.get宛名氏名();
    }

    private void edti宛名名称付与(NinteiChosaTokusokujoReportSource source) {
        RString 帳票宛先敬称コード;
        RString tempP_宛名名称付与;
        try {
            帳票宛先敬称コード = DbBusinessConfig.get(ConfigNameDBE.認定調査督促状_宛先敬称, RDate.getNowDate(), SubGyomuCode.DBE認定支援);
            tempP_宛名名称付与 = ChohyoAtesakiKeisho.toValue(帳票宛先敬称コード).get名称();
        } catch (Exception e) {
            tempP_宛名名称付与 = RString.EMPTY;
        }

        source.meishoFuyo = tempP_宛名名称付与;
    }

    private void edit宛名その他(NinteiChosaTokusokujoReportSource source) {
        source.sonota = entity.getHihokenshaNo();
    }

    private void edit宛名連番(NinteiChosaTokusokujoReportSource source) {
        source.atenaRenban = new RString(pageCount).padZeroToLeft(宛名連番桁数);
    }

    private void editタイトル(NinteiChosaTokusokujoReportSource source) {
        source.title = 通知文.get(0);
    }

    private void edit通知文定型文(NinteiChosaTokusokujoReportSource source) {
        source.tsuchibun1 = 通知文.get(1);
    }

    private void edti被保険者番号(NinteiChosaTokusokujoReportSource source) {
        int 被保険者番号の桁 = 0;
        source.hihokenshaNo1 = getLenStr(entity.getHihokenshaNo(), 一桁 * 被保険者番号の桁++, 一桁);
        source.hihokenshaNo2 = getLenStr(entity.getHihokenshaNo(), 一桁 * 被保険者番号の桁++, 一桁);
        source.hihokenshaNo3 = getLenStr(entity.getHihokenshaNo(), 一桁 * 被保険者番号の桁++, 一桁);
        source.hihokenshaNo4 = getLenStr(entity.getHihokenshaNo(), 一桁 * 被保険者番号の桁++, 一桁);
        source.hihokenshaNo5 = getLenStr(entity.getHihokenshaNo(), 一桁 * 被保険者番号の桁++, 一桁);
        source.hihokenshaNo6 = getLenStr(entity.getHihokenshaNo(), 一桁 * 被保険者番号の桁++, 一桁);
        source.hihokenshaNo7 = getLenStr(entity.getHihokenshaNo(), 一桁 * 被保険者番号の桁++, 一桁);
        source.hihokenshaNo8 = getLenStr(entity.getHihokenshaNo(), 一桁 * 被保険者番号の桁++, 一桁);
        source.hihokenshaNo9 = getLenStr(entity.getHihokenshaNo(), 一桁 * 被保険者番号の桁++, 一桁);
        source.hihokenshaNo10 = getLenStr(entity.getHihokenshaNo(), 一桁 * 被保険者番号の桁++, 一桁);
    }

    private void edit保険者番号(NinteiChosaTokusokujoReportSource source) {
        int 保険者番号の桁 = 0;
        source.hokenshaNo1 = getLenStr(entity.getShoKisaiHokenshaNo(), 一桁 * 保険者番号の桁++, 一桁);
        source.hokenshaNo2 = getLenStr(entity.getShoKisaiHokenshaNo(), 一桁 * 保険者番号の桁++, 一桁);
        source.hokenshaNo3 = getLenStr(entity.getShoKisaiHokenshaNo(), 一桁 * 保険者番号の桁++, 一桁);
        source.hokenshaNo4 = getLenStr(entity.getShoKisaiHokenshaNo(), 一桁 * 保険者番号の桁++, 一桁);
        source.hokenshaNo5 = getLenStr(entity.getShoKisaiHokenshaNo(), 一桁 * 保険者番号の桁++, 一桁);
        source.hokenshaNo6 = getLenStr(entity.getShoKisaiHokenshaNo(), 一桁 * 保険者番号の桁++, 一桁);
    }

    private void edit申請区分(NinteiChosaTokusokujoReportSource source) {
        RString 申請区分コード = entity.getNinteiShinseiShinseijiKubunCode().getColumnValue();
        RString 申請区分 = NinteiShinseiShinseijiKubunCode.toValue(申請区分コード).get略称();

        source.shinseiKubun = 申請区分;
    }

    private void edit被保険者氏名カナ(NinteiChosaTokusokujoReportSource source) {
        source.hihokenshaNameKana = entity.getHihokenshaKana() == null ? RString.EMPTY : entity.getHihokenshaKana().getColumnValue();
    }

    private void edit被保険者氏名(NinteiChosaTokusokujoReportSource source) {
        source.hihokenshaName = entity.getHihokenshaName() == null ? RString.EMPTY : entity.getHihokenshaName().getColumnValue();
    }

    private void edit調査依頼日(NinteiChosaTokusokujoReportSource source) {
        RString 調査依頼年月日 = 調査依頼日 == null ? RString.EMPTY
                : 調査依頼日.wareki()
                .eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN).
                separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
        source.chosaIraiYMD = 調査依頼年月日;
    }

    private void edit申請日(NinteiChosaTokusokujoReportSource source) {
        FlexibleDate 年月日 = entity.getNinteiShinseiYMD();
        RString 申請年月日 = 年月日 == null ? RString.EMPTY : 年月日.wareki()
                .eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN).
                separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
        source.shinseiYMD = 申請年月日;
    }

    private void edit性別(NinteiChosaTokusokujoReportSource source) {
        if (entity.getSeibetsu() != null && !RString.isNullOrEmpty(entity.getSeibetsu().getColumnValue().trim())) {
            source.seibetsu = Seibetsu.toValue(entity.getSeibetsu().getColumnValue()).get名称();
        }
    }

    private void edti誕生日(NinteiChosaTokusokujoReportSource source) {
        source.birthGengo = entity.getSeinengappiYMD() == null
                ? RString.EMPTY : entity.getSeinengappiYMD().wareki().eraType(EraType.KANJI).getEra();
        source.birthYMD = entity.getSeinengappiYMD() == null ? RString.EMPTY : entity.getSeinengappiYMD().
                wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN).
                separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString().substring(2);
    }

    private void edit住所郵便(NinteiChosaTokusokujoReportSource source) {
        source.yubinNo = entity.getYubinNo() == null ? RString.EMPTY : entity.getYubinNo().getEditedYubinNo();
    }

    private void edit住所(NinteiChosaTokusokujoReportSource source) {
        source.jusho = entity.getJusho() == null ? RString.EMPTY : entity.getJusho().getColumnValue();
    }

    private void edit通知文問合せ(NinteiChosaTokusokujoReportSource source) {
        source.tsuchibun2 = 通知文.get(2);
    }

    private void edit識別コード(NinteiChosaTokusokujoReportSource source) {
        source.識別コード = new ShikibetsuCode(entity.getShoKisaiHokenshaNo().substring(0, 5).concat(entity.getHihokenshaNo()));
    }

    private void edit拡張情報(NinteiChosaTokusokujoReportSource source) {
        source.拡張情報 = new ExpandedInformation(new Code("0001"), new RString("申請書管理番号"), new RString(entity.getShinseishoKanriNo().toString()));
    }

    private RString getLenStr(RString rstr, int startIndex, int len) {
        if (!RString.isNullOrEmpty(rstr)) {
            if (rstr.length() >= startIndex + len) {
                return rstr.substring(startIndex, startIndex + len);
            } else if (rstr.length() > startIndex) {
                return rstr.substring(startIndex);
            }
        }
        return RString.EMPTY;
    }

}
