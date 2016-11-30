/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.ketteitsuchisho.a4tate;

import java.util.List;
import jp.co.ndensan.reams.db.dbb.business.report.ketteitsuchisho.KaigoHokenHokenryogakuKetteiTsuchishoBusiness;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.EditedHonSanteiTsuchiShoKyotsu;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.EditedHonSanteiTsuchiShoKyotsuBeforeOrAfterCorrection;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.HyojiCodes;
import jp.co.ndensan.reams.db.dbb.entity.report.ketteitsuchisho.KaigoHokenHokenryogakuKetteiTsuchishoA4TateReportSource;
import jp.co.ndensan.reams.db.dbx.definition.core.choteijiyu.ChoteiJiyuCode;
import jp.co.ndensan.reams.db.dbz.business.report.util.EditedKoza;
import jp.co.ndensan.reams.ur.urc.definition.core.noki.nokikanri.GennenKanen;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.editor.DecimalFormatter;

/**
 *
 * 介護保険料額決定通知書のA4縦タイプのEditorです。
 *
 * @reamsid_L DBB-9080-010 sunhaidi
 */
public class KaigoHokenHokenryogakuKetteiTsuchishoA4TateEditor implements IKaigoHokenHokenryogakuKetteiTsuchishoA4TateEditor {

    private static final int SIZE_3 = 3;
    private final KaigoHokenHokenryogakuKetteiTsuchishoBusiness item;

    /**
     * インスタンスを生成します。
     *
     * @param item {@link KaigoHokenHokenryogakuKetteiTsuchishoBusiness}
     */
    protected KaigoHokenHokenryogakuKetteiTsuchishoA4TateEditor(KaigoHokenHokenryogakuKetteiTsuchishoBusiness item) {
        this.item = item;
    }

    @Override
    public KaigoHokenHokenryogakuKetteiTsuchishoA4TateReportSource edit(KaigoHokenHokenryogakuKetteiTsuchishoA4TateReportSource reportSource) {
        EditedHonSanteiTsuchiShoKyotsu 編集後本算定通知書共通情報 = item.get本算定決定通知書情報().get編集後本算定通知書共通情報();
        EditedHonSanteiTsuchiShoKyotsuBeforeOrAfterCorrection 更正後 = 編集後本算定通知書共通情報.get更正後();
        EditedHonSanteiTsuchiShoKyotsuBeforeOrAfterCorrection 更正前 = 編集後本算定通知書共通情報.get更正前();
        reportSource.bankCode = 編集後本算定通知書共通情報.get編集後口座().get金融機関コードCombinedWith支店コード();
        reportSource.bankName = 編集後本算定通知書共通情報.get編集後口座().get金融機関名CombinedWith支店名();
        reportSource.bunshoNo = item.get文書番号();
        List<RString> 調定事由リスト = item.get調定事由リスト();
        if (調定事由リスト != null && !調定事由リスト.isEmpty()) {
            reportSource.choteiJiyu1 = 調定事由リスト.get(0);
            if (1 < 調定事由リスト.size()) {
                reportSource.choteiJiyu2 = 調定事由リスト.get(1);
            }
            if (2 < 調定事由リスト.size()) {
                reportSource.choteiJiyu3 = 調定事由リスト.get(2);
            }
            if (SIZE_3 < 調定事由リスト.size()) {
                reportSource.choteiJiyu4 = 調定事由リスト.get(SIZE_3);
            }

        } else {
            reportSource.choteiJiyu1 = 編集後本算定通知書共通情報.get調定事由１();
            reportSource.choteiJiyu2 = 編集後本算定通知書共通情報.get調定事由２();
            reportSource.choteiJiyu3 = 編集後本算定通知書共通情報.get調定事由３();
            reportSource.choteiJiyu4 = 編集後本算定通知書共通情報.get調定事由４();
        }
        reportSource.choteiNendo = 編集後本算定通知書共通情報.get調定年度().wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN)
                .fillType(FillType.BLANK).toDateString();
        reportSource.fukaNendo = 編集後本算定通知書共通情報.get賦課年度().wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN)
                .fillType(FillType.BLANK).toDateString();
        reportSource.genmenAto = decimalToRString(更正後.get減免額());

        reportSource.hihokenshaNo = 編集後本算定通知書共通情報.get被保険者番号().value();
        reportSource.hokenGakuAto = decimalToRString(更正後.get確定保険料_年額());

        reportSource.hokenRitsuAto = decimalToRString(更正後.get保険料率());

        reportSource.hokenSanshutsuAto = decimalToRString(更正後.get減免前保険料_年額());

        HyojiCodes 表示コード = 編集後本算定通知書共通情報.get表示コード();
        reportSource.hyojicode1 = 表示コード.get表示コード１();
        reportSource.hyojicode2 = 表示コード.get表示コード２();
        reportSource.hyojicode3 = 表示コード.get表示コード３();
        reportSource.hyojicodeName1 = 表示コード.get表示コード名１();
        reportSource.hyojicodeName2 = 表示コード.get表示コード名２();
        reportSource.hyojicodeName3 = 表示コード.get表示コード名３();
        reportSource.kakuteiHokenryoGaku = decimalToRString(更正後.get確定保険料_年額());
        reportSource.kongoNofusubekiGaku = decimalToRString(編集後本算定通知書共通情報.get今後納付すべき額_収入元に());
        reportSource.korekaraChoshuho = 更正後.get徴収方法();
        reportSource.koseiNaiyo = new RString("年額保険料が");
        reportSource.koseiNaiyo2 = RString.EMPTY;
        reportSource.koseiRiyu = new RString("円に決定しました。");
        EditedKoza 口座情報 = 編集後本算定通知書共通情報.get編集後口座();
        reportSource.kozaMeigi = 口座情報.get口座名義人優先();
        reportSource.kozaNo = 口座情報.get口座番号Or通帳記号番号();
        reportSource.kozaShurui = 口座情報.get口座種別略称();
        reportSource.nofuzumiGaku = decimalToRString(編集後本算定通知書共通情報.get納付済額_未到来期含む());
        reportSource.setaiCode = 編集後本算定通知書共通情報.get編集後個人().get世帯コード().value();
        reportSource.shikibetsuCode = 編集後本算定通知書共通情報.get識別コード().value();
        reportSource.shotokuKbnAto = 更正後.get保険料段階();

        reportSource.shutokuYmdAto = new FlexibleDate(更正後.get期間_自_西暦()).wareki().fillType(FillType.BLANK).toDateString();

        reportSource.soshitsuYmdAto = new FlexibleDate(更正後.get期間_至_西暦()).wareki().fillType(FillType.BLANK).toDateString();

        set転入者通知文(reportSource, 編集後本算定通知書共通情報);
        set通知文1と通知区分(reportSource, 編集後本算定通知書共通情報);
        reportSource.tsuchishoNo = 編集後本算定通知書共通情報.get通知書番号().value();

        reportSource.tsukisuAto = 更正後.get月数_ケ月();

        reportSource.zogenGaku = decimalToRString(編集後本算定通知書共通情報.get増減額());
        reportSource.koseigoHokenryoGaku = decimalToRString(更正後.get確定保険料_年額());
        reportSource.tokuchoGimusha = 更正後.get特別徴収義務者();
        reportSource.tokuchoTaishoNenkin = 更正後.get特別徴収対象年金();
        if (更正前 != null && item.get本算定決定通知書情報().isHas更正前()) {
            reportSource.genmenMae = edit金額(更正前.get減免額());
            reportSource.hokenGakuMae = edit金額(更正前.get確定保険料_年額());
            reportSource.hokenRitsuMae = edit金額(更正前.get保険料率());
            reportSource.hokenSanshutsuMae = edit金額(更正前.get減免前保険料_年額());
            reportSource.shotokuKbnMae = 更正前.get保険料段階();
            reportSource.shutokuYmdMae = new FlexibleDate(更正前.get期間_自_西暦()).wareki().fillType(FillType.BLANK).toDateString();
            reportSource.tsukisuMae = 更正前.get月数_ケ月();
            reportSource.soshitsuYmdMae = new FlexibleDate(更正前.get期間_至_西暦()).wareki().fillType(FillType.BLANK).toDateString();
            reportSource.honninKazeiKubunMae = 更正前.get市町村民税課税区分_本人();
            reportSource.setaiKazeiKubunMae = 更正前.get市町村民税課税区分_世帯();
            reportSource.gokeiShotokuKingakuMae = edit金額(更正前.get合計所得金額());
            reportSource.kotekiNenkinShunyuGakuMae = edit金額(更正前.get公的年金収入額());
            reportSource.seikatsuHogoFujoShuruiMae = 更正前.get生活保護扶助種類();
            reportSource.seihoKaishiYmdMae = 更正前.get生保開始日();
            reportSource.seihoHaishiYmdMae = 更正前.get生保廃止日();
            reportSource.roreiKaishiYmdMae = 更正前.get老齢開始日();
            reportSource.roreiHaishiYmdMae = 更正前.get老齢廃止日();
        }
        reportSource.honninKazeiKubunAto = 更正後.get市町村民税課税区分_本人();
        reportSource.setaiKazeiKubunAto = 更正後.get市町村民税課税区分_世帯();
        reportSource.gokeiShotokuKingakuAto = edit金額(更正後.get合計所得金額());
        reportSource.kotekiNenkinShunyuGakuAto = edit金額(更正後.get公的年金収入額());
        reportSource.seikatsuHogoFujoShuruiAto = 更正後.get生活保護扶助種類();
        reportSource.seihoKaishiYmdAto = 更正後.get生保開始日();
        reportSource.seihoHaishiYmdAto = 更正後.get生保廃止日();
        reportSource.roreiKaishiYmdAto = 更正後.get老齢開始日();
        reportSource.roreiHaishiYmdAto = 更正後.get老齢廃止日();
        reportSource.nofuzumiGakuToraiKi = edit金額(編集後本算定通知書共通情報.get納付済額_未到来期含まない());
        reportSource.nofuzumiGakuMiToraiKi = edit金額(編集後本算定通知書共通情報.get未到来期の納付済額());
        reportSource.fuchoNofuzumiGaku = edit金額(編集後本算定通知書共通情報.get普徴納付済額_未到来期含む());
        reportSource.tokuchoNofuzumiGaku = edit金額(編集後本算定通知書共通情報.get特徴納付済額_未到来期含む());
        reportSource.fuchoNofuzumiGakuToraiKi = edit金額(編集後本算定通知書共通情報.get普徴納付済額_未到来期含まない());
        reportSource.tokuchoNofuzumiGakuToraiKi = edit金額(編集後本算定通知書共通情報.get特徴納付済額_未到来期含まない());
        reportSource.nofuzumiGakuSanshutsuYmd = 編集後本算定通知書共通情報.get納付済額算出年月日();
        reportSource.sudeniNofuSubekiGaku = edit金額(編集後本算定通知書共通情報.get既に納付すべき額());
        reportSource.fuchoSudeniNofuSubekiGaku = edit金額(編集後本算定通知書共通情報.get普徴既に納付すべき額());
        reportSource.tokuchoSudeniNofuSubekiGaku = edit金額(編集後本算定通知書共通情報.get特徴既に納付すべき額());
        reportSource.fuchoKongoNofuSubekiGakuChotei = edit金額(編集後本算定通知書共通情報.get普徴今後納付すべき額_調定元に());
        reportSource.fuchoKongoNofuSubekiGakuShunyu = edit金額(編集後本算定通知書共通情報.get普徴今後納付すべき額_収入元に());
        reportSource.tokuchoKongoNofuSubekiGakuChotei = edit金額(編集後本算定通知書共通情報.get特徴今後納付すべき額_調定元に());
        reportSource.tokuchoKongoNofuSubekiGakuShunyu = edit金額(編集後本算定通知書共通情報.get特徴今後納付すべき額_収入元に());
        reportSource.kongoNofuSubekiGakuChotei = edit金額(編集後本算定通知書共通情報.get今後納付すべき額_調定元に());
        return reportSource;
    }

    private RString edit金額(Decimal 金額) {
        if (金額 == null || Decimal.ZERO.compareTo(金額) == 0) {
            return RString.HALF_SPACE;
        } else {
            return DecimalFormatter.toコンマ区切りRString(金額, 0);
        }
    }

    private void set通知文1と通知区分(KaigoHokenHokenryogakuKetteiTsuchishoA4TateReportSource reportSource,
            EditedHonSanteiTsuchiShoKyotsu 編集後本算定通知書共通情報) {
        if (GennenKanen.過年度.equals(item.get本算定決定通知書情報().get現年度_過年度区分())) {
            RStringBuilder tsuchibun1 = new RStringBuilder();
            tsuchibun1.append(編集後本算定通知書共通情報.get賦課年度().toDateString());
            tsuchibun1.append(new RString("以前にさかのぼって資格取得・更正した分"));
            reportSource.tsuchibun1 = tsuchibun1.toRString();
            reportSource.tsuchibun2 = new RString("（過年度）");
        }
    }

    private void set転入者通知文(KaigoHokenHokenryogakuKetteiTsuchishoA4TateReportSource reportSource,
            EditedHonSanteiTsuchiShoKyotsu 編集後本算定通知書共通情報) {

        if (ChoteiJiyuCode.転入.getコード().equals(編集後本算定通知書共通情報.get調定事由１())
                || ChoteiJiyuCode.転入.getコード().equals(編集後本算定通知書共通情報.get調定事由２())
                || ChoteiJiyuCode.転入.getコード().equals(編集後本算定通知書共通情報.get調定事由３())
                || ChoteiJiyuCode.転入.getコード().equals(編集後本算定通知書共通情報.get調定事由４())) {
            reportSource.tennyushaTsuchibun = item.get通知書定型文();
        }
    }

    private RString decimalToRString(Decimal number) {
        if (number != null) {
            return DecimalFormatter.toコンマ区切りRString(number, 0);
        }
        return RString.EMPTY;
    }
}
