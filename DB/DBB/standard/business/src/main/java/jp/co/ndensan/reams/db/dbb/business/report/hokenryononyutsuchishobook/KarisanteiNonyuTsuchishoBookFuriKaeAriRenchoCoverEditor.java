/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.hokenryononyutsuchishobook;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.EditedKariSanteiTsuchiShoKyotsu;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.EditedKariSanteiTsuchiShoKyotsuAfterCorrection;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.KariSanteiNonyuTsuchiShoJoho;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.NofuShoKyotsu;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.NonyuTsuchiShoKiJoho;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.OrdinaryIncomeInformation;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.PrecedingFiscalYearInformation;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.SanteiNoKiso;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.UniversalPhase;
import jp.co.ndensan.reams.db.dbb.definition.core.ShoriKubun;
import jp.co.ndensan.reams.db.dbb.entity.report.hokenryononyutsuchishobook.KarisanteiNonyuTsuchishoBookFuriKaeAriRenchoCoverSource;
import jp.co.ndensan.reams.db.dbx.business.core.kanri.Kitsuki;
import jp.co.ndensan.reams.db.dbz.business.core.kaigosofubutsuatesakisource.KaigoSofubutsuAtesakiSource;
import jp.co.ndensan.reams.db.dbz.business.report.util.EditedAtesaki;
import jp.co.ndensan.reams.db.dbz.business.report.util.EditedKojin;
import jp.co.ndensan.reams.db.dbz.business.report.util.EditedKoza;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;
import jp.co.ndensan.reams.ur.urz.entity.report.sofubutsuatesaki.SofubutsuAtesakiSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringUtil;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 *
 * 保険料納入通知書（仮算定）【ブックタイプ】納付書連帳 （口振依頼あり）通知書_連帳
 * KarisanteiNonyuTsuchishoBookFuriKaeAriRenchoCoverEditor
 *
 * @reamsid_L DBB-9110-040 wangjie2
 */
public class KarisanteiNonyuTsuchishoBookFuriKaeAriRenchoCoverEditor
        implements IKarisanteiNonyuTsuchishoBookFuriKaeAriRenchoCoverEditor {

    private static final int INT1 = 1;
    private static final int INT2 = 2;
    private static final int INT3 = 3;
    private static final int INT4 = 4;
    private static final int INT5 = 5;
    private static final int INT6 = 6;
    private final KariSanteiNonyuTsuchiShoJoho 仮算定納入通知書情報;
    private final List<NonyuTsuchiShoKiJoho> 納入通知書期情報リスト;
    private final EditedKariSanteiTsuchiShoKyotsu 編集後仮算定通知書共通情報;
    private final List<Kitsuki> 出力期リスト;
    private final int 連番;
    private final NinshoshaSource ninshoshaSource;

    /**
     * インスタンスを生成します。
     *
     * @param item {@link HokenryoNonyuTsuchishoBookItem}
     * @param 納入通知書期情報リスト 納入通知書期情報リスト
     * @param 連番 連番
     */
    protected KarisanteiNonyuTsuchishoBookFuriKaeAriRenchoCoverEditor(
            HokenryoNonyuTsuchishoBookItem item,
            List<NonyuTsuchiShoKiJoho> 納入通知書期情報リスト,
            int 連番) {
        this.仮算定納入通知書情報 = null == item ? new KariSanteiNonyuTsuchiShoJoho() : item.get仮算定納入通知書情報();
        this.納入通知書期情報リスト = 納入通知書期情報リスト;
        this.編集後仮算定通知書共通情報 = null == 仮算定納入通知書情報.get編集後仮算定通知書共通情報()
                ? new EditedKariSanteiTsuchiShoKyotsu() : 仮算定納入通知書情報.get編集後仮算定通知書共通情報();
        this.出力期リスト = 仮算定納入通知書情報.get出力期リスト().isEmpty() ? new ArrayList<Kitsuki>() : 仮算定納入通知書情報.get出力期リスト();
        this.連番 = 連番;
        this.ninshoshaSource = item.getNinshoshaSource();
    }

    @Override
    public KarisanteiNonyuTsuchishoBookFuriKaeAriRenchoCoverSource edit(KarisanteiNonyuTsuchishoBookFuriKaeAriRenchoCoverSource source) {
        editCompNinshosha(source);
        editCompSofubutsuAtesaki(source);
        editレイヤ１(source);
        return source;
    }

    private void editCompSofubutsuAtesaki(KarisanteiNonyuTsuchishoBookFuriKaeAriRenchoCoverSource source) {
        EditedAtesaki 編集後宛先 = null == 編集後仮算定通知書共通情報 ? null : 編集後仮算定通知書共通情報.get編集後宛先();
        KaigoSofubutsuAtesakiSource kaigoSofubutsuAtesakiSource = null;
        if (編集後宛先 != null) {
            kaigoSofubutsuAtesakiSource = 編集後宛先.getSofubutsuAtesakiSource();
        }
        if (kaigoSofubutsuAtesakiSource != null) {
            SofubutsuAtesakiSource sofubutsuAtesakiSource = kaigoSofubutsuAtesakiSource.get送付物宛先ソース();
            if (sofubutsuAtesakiSource != null) {
                source.customerBarCode = sofubutsuAtesakiSource.customerBarCode;
                source.dainoKubunMei = sofubutsuAtesakiSource.dainoKubunMei;
                source.gyoseiku = sofubutsuAtesakiSource.gyoseiku;
                source.jusho1 = sofubutsuAtesakiSource.jusho1;
                source.jusho2 = sofubutsuAtesakiSource.jusho2;
                source.jusho3 = sofubutsuAtesakiSource.jusho3;
                source.jushoText = sofubutsuAtesakiSource.jushoText;
                source.kakkoLeft1 = sofubutsuAtesakiSource.kakkoLeft1;
                source.kakkoLeft2 = sofubutsuAtesakiSource.kakkoLeft2;
                source.kakkoRight1 = sofubutsuAtesakiSource.kakkoRight1;
                source.kakkoRight2 = sofubutsuAtesakiSource.kakkoRight2;
                source.katagaki1 = sofubutsuAtesakiSource.katagaki1;
                source.katagaki2 = sofubutsuAtesakiSource.katagaki2;
                source.katagakiSmall1 = sofubutsuAtesakiSource.katagakiSmall1;
                source.katagakiSmall2 = sofubutsuAtesakiSource.katagakiSmall2;
                source.katagakiText = sofubutsuAtesakiSource.katagakiText;
                source.meishoFuyo1 = sofubutsuAtesakiSource.meishoFuyo1;
                source.meishoFuyo2 = sofubutsuAtesakiSource.meishoFuyo2;
                source.samaBun1 = sofubutsuAtesakiSource.samaBun1;
                source.samaBun2 = sofubutsuAtesakiSource.samaBun2;
                source.samabunShimei1 = sofubutsuAtesakiSource.samabunShimei1;
                source.samabunShimei2 = sofubutsuAtesakiSource.samabunShimei2;
                source.samabunShimeiSmall1 = sofubutsuAtesakiSource.samabunShimeiSmall1;
                source.samabunShimeiSmall2 = sofubutsuAtesakiSource.samabunShimeiSmall2;
                source.samabunShimeiText = sofubutsuAtesakiSource.samabunShimeiText;
                source.shimei1 = sofubutsuAtesakiSource.shimei1;
                source.shimei2 = sofubutsuAtesakiSource.shimei2;
                source.shimeiSmall1 = sofubutsuAtesakiSource.shimeiSmall1;
                source.shimeiSmall2 = sofubutsuAtesakiSource.shimeiSmall2;
                source.shimeiText = sofubutsuAtesakiSource.shimeiText;
                source.yubinNo = sofubutsuAtesakiSource.yubinNo;
            }
        }
    }

    private void editCompNinshosha(KarisanteiNonyuTsuchishoBookFuriKaeAriRenchoCoverSource source) {
        if (ninshoshaSource != null) {
            source.denshiKoin = ninshoshaSource.denshiKoin;
            source.hakkoYMD = ninshoshaSource.hakkoYMD;
            source.ninshoshaYakushokuMei = ninshoshaSource.ninshoshaYakushokuMei;
            source.ninshoshaShimeiKakenai = ninshoshaSource.ninshoshaShimeiKakenai;
            source.ninshoshaShimeiKakeru = ninshoshaSource.ninshoshaShimeiKakeru;
            source.koinShoryaku = ninshoshaSource.koinShoryaku;
            source.koinMojiretsu = ninshoshaSource.koinMojiretsu;
        }
    }

    private void editレイヤ１(KarisanteiNonyuTsuchishoBookFuriKaeAriRenchoCoverSource source) {
        NonyuTsuchiShoKiJoho 納入通知書期情報リストの一番目
                = 納入通知書期情報リスト.isEmpty() ? new NonyuTsuchiShoKiJoho() : 納入通知書期情報リスト.get(0);
        NonyuTsuchiShoKiJoho 納入通知書期情報リストの二番目
                = 納入通知書期情報リスト.size() >= INT2 ? 納入通知書期情報リスト.get(INT1) : new NonyuTsuchiShoKiJoho();
        NonyuTsuchiShoKiJoho 納入通知書期情報リストの三番目
                = 納入通知書期情報リスト.size() >= INT3 ? 納入通知書期情報リスト.get(INT2) : new NonyuTsuchiShoKiJoho();
        NonyuTsuchiShoKiJoho 納入通知書期情報リストの四番目
                = 納入通知書期情報リスト.size() >= INT4 ? 納入通知書期情報リスト.get(INT3) : new NonyuTsuchiShoKiJoho();
        NonyuTsuchiShoKiJoho 納入通知書期情報リストの五番目
                = 納入通知書期情報リスト.size() >= INT5 ? 納入通知書期情報リスト.get(INT4) : new NonyuTsuchiShoKiJoho();
        NonyuTsuchiShoKiJoho 納入通知書期情報リストの六番目
                = 納入通知書期情報リスト.size() >= INT6 ? 納入通知書期情報リスト.get(INT5) : new NonyuTsuchiShoKiJoho();
        PrecedingFiscalYearInformation 前年度情報
                = null == 編集後仮算定通知書共通情報.get前年度情報() ? new PrecedingFiscalYearInformation() : 編集後仮算定通知書共通情報.get前年度情報();
        EditedKariSanteiTsuchiShoKyotsuAfterCorrection 更正後
                = null == 編集後仮算定通知書共通情報.get更正後()
                ? new EditedKariSanteiTsuchiShoKyotsuAfterCorrection() : 編集後仮算定通知書共通情報.get更正後();
        List<UniversalPhase> 普徴期別金額リスト
                = null == 更正後.get更正後普徴期別金額リスト() ? new ArrayList<UniversalPhase>() : 更正後.get更正後普徴期別金額リスト();

        SanteiNoKiso 算定の基礎 = null == 仮算定納入通知書情報.get算定の基礎() ? new SanteiNoKiso() : 仮算定納入通知書情報.get算定の基礎();
        source.titleNendo = RStringUtil.convert半角to全角(編集後仮算定通知書共通情報.get調定年度_年度なし());
        source.Hyojicode1 = 編集後仮算定通知書共通情報.get表示コード1();
        source.Hyojicode2 = 編集後仮算定通知書共通情報.get表示コード２();
        source.Hyojicode3 = 編集後仮算定通知書共通情報.get表示コード３();
        source.HyojicodeName1 = 編集後仮算定通知書共通情報.get表示コード１名();
        source.HyojicodeName2 = 編集後仮算定通知書共通情報.get表示コード２名();
        source.HyojicodeName3 = 編集後仮算定通知書共通情報.get表示コード３名();
        edit編集後個人And編集後口座(source);
        source.tsuchishoNo = 編集後仮算定通知書共通情報.get通知書番号().getColumnValue();
        source.keisanMeisaishoNendo = RStringUtil.convert半角to全角(編集後仮算定通知書共通情報.get調定年度_年度なし());
        source.keisanMeisaishoKi1 = 納入通知書期情報リストの一番目.get期表記();
        source.keisanMeisaishoTsuki1 = 納入通知書期情報リストの一番目.get月表記();
        source.keisanMeisaishoNokigenKaishi1 = 納入通知書期情報リストの一番目.get納期開始日表記();
        source.keisanMeisaishoNokigenShuryo1 = 納入通知書期情報リストの一番目.get納期終了日表記();
        source.keisanMeisaishoKi2 = 納入通知書期情報リストの二番目.get期表記();
        source.keisanMeisaishoTsuki2 = 納入通知書期情報リストの二番目.get月表記();
        source.keisanMeisaishoNokigenKaishi2 = 納入通知書期情報リストの二番目.get納期開始日表記();
        source.keisanMeisaishoNokigenShuryo2 = 納入通知書期情報リストの二番目.get納期終了日表記();
        source.keisanMeisaishoKi3 = 納入通知書期情報リストの三番目.get期表記();
        source.keisanMeisaishoTsuki3 = 納入通知書期情報リストの三番目.get月表記();
        source.keisanMeisaishoNokigenKaishi3 = 納入通知書期情報リストの三番目.get納期開始日表記();
        source.keisanMeisaishoNokigenShuryo3 = 納入通知書期情報リストの三番目.get納期終了日表記();
        source.keisanMeisaishoKi4 = 納入通知書期情報リストの四番目.get期表記();
        source.keisanMeisaishoTsuki4 = 納入通知書期情報リストの四番目.get月表記();
        source.keisanMeisaishoNokigenKaishi4 = 納入通知書期情報リストの四番目.get納期開始日表記();
        source.keisanMeisaishoNokigenShuryo4 = 納入通知書期情報リストの四番目.get納期終了日表記();
        source.keisanMeisaishoKi5 = 納入通知書期情報リストの五番目.get期表記();
        source.keisanMeisaishoTsuki5 = 納入通知書期情報リストの五番目.get月表記();
        source.keisanMeisaishoNokigenKaishi5 = 納入通知書期情報リストの五番目.get納期開始日表記();
        source.keisanMeisaishoNokigenShuryo5 = 納入通知書期情報リストの五番目.get納期終了日表記();
        source.keisanMeisaishoKi6 = 納入通知書期情報リストの六番目.get期表記();
        source.keisanMeisaishoTsuki6 = 納入通知書期情報リストの六番目.get月表記();
        source.keisanMeisaishoNokigenKaishi6 = 納入通知書期情報リストの六番目.get納期開始日表記();
        source.keisanMeisaishoNokigenShuryo6 = 納入通知書期情報リストの六番目.get納期終了日表記();
        source.keisanMeisaishoTsuchishoNo = 編集後仮算定通知書共通情報.get通知書番号().getColumnValue();
        source.keisanMeisaishoKaishiKi = get最小の月();
        source.kaisanMeisaishoShuryoKi = get最大の月();
        source.keisanMeisaishoNendo1 = 前年度情報.get前年度賦課年度();
        source.keisanMeisaishoShotokuDankai = RStringUtil.convert半角to全角(前年度情報.get前年度保険料段階());
        source.keisanMeisaishoNendo2 = is算定の基礎は空白(算定の基礎, INT1) ? RString.EMPTY : 前年度情報.get前年度賦課年度();
        source.keisanMeisaishoHokenryoRitsu
                = is算定の基礎は空白(算定の基礎, INT1) ? RString.EMPTY : new RString(前年度情報.get前年度保険料率().toString());
        source.keisanMeisaishoNendo3 = is算定の基礎は空白(算定の基礎, 2) ? RString.EMPTY : 前年度情報.get前年度賦課年度();
        source.kaisanMeisaishoNenGaku
                = is算定の基礎は空白(算定の基礎, INT2) ? RString.EMPTY : new RString(前年度情報.get前年度確定介護保険料_年額().toString());
        source.keisanMeisaishoNendo4 = is算定の基礎は空白(算定の基礎, INT3) ? RString.EMPTY : 前年度情報.get前年度賦課年度();
        source.keisanMeisaishoNendo2
                = is算定の基礎は空白(算定の基礎, INT3) ? RString.EMPTY : new RString(前年度情報.get前年度最終期普徴期別介護保険料().toString());
        source.keisanMeisaishoKisu = new RString(String.valueOf(編集後仮算定通知書共通情報.get普徴期数()));
        source.keisanMeisaishoGenmenGaku = new RString(更正後.get更正後介護保険料減免額().toString());
        source.kaisanMeisaishoTokuchoGokeiGaku = new RString(更正後.get更正後特徴期別金額合計().toString());
        source.keisanMeisaishoKiTitle1 = new RString("第").concat(String.valueOf(納入通知書期情報リストの一番目.get期())).concat("期");
        source.keisanMeisaishoKiNofuGaku1 = get普徴期別金額リスト中にX期の金額(普徴期別金額リスト, 納入通知書期情報リストの一番目.get期());
        source.keisanMeisaishoKiTitle2 = 納入通知書期情報リストの二番目.get期() > 0 ? new RString("次期以降") : RString.EMPTY;
        source.keisanMeisaishoKiNofuGaku2 = 納入通知書期情報リストの二番目.get期() > 0
                ? get普徴期別金額リスト中にX期の金額(普徴期別金額リスト, 納入通知書期情報リストの二番目.get期()) : RString.EMPTY;
        source.keisanMeisaishoKarisanteiGokeiGaku = new RString(更正後.get更正後介護保険料仮徴収額合計().toString());
        source.nokibetsuMeisaishoNendo = RStringUtil.convert半角to全角(編集後仮算定通知書共通情報.get調定年度_年度なし());
        source.nokibetsuMeisaishoTsuchishoNo = 編集後仮算定通知書共通情報.get通知書番号().getColumnValue();
        editNokibetsuMeisaishoHohokenshaName(source);
        editレイヤ１_1(source, 更正後, 納入通知書期情報リストの一番目, 納入通知書期情報リストの二番目,
                納入通知書期情報リストの三番目, 納入通知書期情報リストの四番目, 納入通知書期情報リストの五番目, 納入通知書期情報リストの六番目);
    }

    private void editNokibetsuMeisaishoHohokenshaName(KarisanteiNonyuTsuchishoBookFuriKaeAriRenchoCoverSource source) {
        NofuShoKyotsu 納付書共通 = null == 仮算定納入通知書情報.get納付書共通() ? new NofuShoKyotsu() : 仮算定納入通知書情報.get納付書共通();
        if (仮算定納入通知書情報 != null && 納付書共通 != null) {
            source.nokibetsuMeisaishoHohokenshaName = 納付書共通.get被保険者氏名().getColumnValue();
        }
    }

    private void edit編集後個人And編集後口座(KarisanteiNonyuTsuchishoBookFuriKaeAriRenchoCoverSource source) {
        EditedKojin 編集後個人 = 編集後仮算定通知書共通情報.get編集後個人();
        EditedKoza 編集後口座 = 編集後仮算定通知書共通情報.get編集後口座();
        if (編集後個人 != null) {
            source.setaiCode = 編集後個人.get世帯コード().getColumnValue();
            source.kaisanMeisaishoHihokenshaName = 編集後個人.get名称().getName().getColumnValue();
            source.keisanMeisaishoSetaiCode = 編集後個人.get世帯コード().getColumnValue();
            source.kaisanMeisaishoSetaiNushiName = 編集後個人.get世帯主名().getColumnValue();
            source.nokibetsuMeisaishoSetaiCode = 編集後個人.get世帯コード().getColumnValue();
            source.kozaIraishoLeftJusho = 編集後個人.get編集後住所();
            source.kozaIraishoRightJusho = 編集後個人.get編集後住所();
            source.kozaIraishoLeftHihokenshaName = 編集後個人.get名称().getName().getColumnValue();
            source.kozaIraishoRightHihokenshaName = 編集後個人.get名称().getName().getColumnValue();
        }
        if (編集後口座 != null) {
            source.bankCode = 編集後口座.get金融機関コードCombinedWith支店コード();
            source.kozaShurui = 編集後口座.get口座種別略称();
            source.kozaNo = 編集後口座.get口座番号Or通帳記号番号();
            source.bankName = 編集後口座.get金融機関名CombinedWith支店名();
            source.kozaMeiginin = 編集後口座.get口座名義人優先();
        }
    }

    private void editレイヤ１_1(KarisanteiNonyuTsuchishoBookFuriKaeAriRenchoCoverSource source,
            EditedKariSanteiTsuchiShoKyotsuAfterCorrection 更正後,
            NonyuTsuchiShoKiJoho 納入通知書期情報リストの一番目,
            NonyuTsuchiShoKiJoho 納入通知書期情報リストの二番目,
            NonyuTsuchiShoKiJoho 納入通知書期情報リストの三番目,
            NonyuTsuchiShoKiJoho 納入通知書期情報リストの四番目,
            NonyuTsuchiShoKiJoho 納入通知書期情報リストの五番目,
            NonyuTsuchiShoKiJoho 納入通知書期情報リストの六番目) {
        List<OrdinaryIncomeInformation> 特徴収入情報リスト
                = 編集後仮算定通知書共通情報.get特徴収入情報リスト().isEmpty()
                ? new ArrayList<OrdinaryIncomeInformation>() : 編集後仮算定通知書共通情報.get特徴収入情報リスト();
        Decimal 納期別明細書特徴納付額１ = null == 更正後.get更正後特徴期別金額01() ? Decimal.ZERO : 更正後.get更正後特徴期別金額01();
        Decimal 納期別明細書特徴納付額２ = null == 更正後.get更正後特徴期別金額02() ? Decimal.ZERO : 更正後.get更正後特徴期別金額02();
        Decimal 納期別明細書特徴納付額３ = null == 更正後.get更正後特徴期別金額03() ? Decimal.ZERO : 更正後.get更正後特徴期別金額03();
        Decimal 納期別明細書特徴納付額４ = 納期別明細書特徴納付額１.add(納期別明細書特徴納付額２).add(納期別明細書特徴納付額３);
        Decimal 納期別明細書特徴納付済額１ = get収入額(特徴収入情報リスト, INT1);
        Decimal 納期別明細書特徴納付済額２ = get収入額(特徴収入情報リスト, INT2);
        Decimal 納期別明細書特徴納付済額３ = get収入額(特徴収入情報リスト, INT3);
        Decimal 納期別明細書特徴納付済額４ = 納期別明細書特徴納付済額１.add(納期別明細書特徴納付済額２).add(納期別明細書特徴納付済額３);
        Decimal 納期別明細書特徴差額１ = 納期別明細書特徴納付額１.subtract(納期別明細書特徴納付済額１);
        Decimal 納期別明細書特徴差額２ = 納期別明細書特徴納付額２.subtract(納期別明細書特徴納付済額２);
        Decimal 納期別明細書特徴差額３ = 納期別明細書特徴納付額３.subtract(納期別明細書特徴納付済額３);
        Decimal 納期別明細書特徴差額４ = 納期別明細書特徴差額１.add(納期別明細書特徴差額２).add(納期別明細書特徴差額３);
        source.nokibetsuMeisaishoTokuchoNofuGaku1 = new RString(納期別明細書特徴納付額１.toString());
        source.nokibetsuMeisaishoTokuchoNofuZumiGaku1 = new RString(納期別明細書特徴納付済額１.toString());
        source.nokibetsuMeisaishoTokuchoSaGaku1 = new RString(納期別明細書特徴差額１.toString());
        source.nokibetsuMeisaishoTokuchoNofuGaku2 = new RString(納期別明細書特徴納付額２.toString());
        source.nokibetsuMeisaishoTokuchoNofuZumiGaku2 = new RString(納期別明細書特徴納付済額２.toString());
        source.nokibetsuMeisaishoTokuchoSaGaku2 = new RString(納期別明細書特徴差額２.toString());
        source.nokibetsuMeisaishoTokuchoNofuGaku3 = new RString(納期別明細書特徴納付額３.toString());
        source.nokibetsuMeisaishoTokuchoNofuZumiGaku3 = new RString(納期別明細書特徴納付済額３.toString());
        source.nokibetsuMeisaishoTokuchoSaGaku3 = new RString(納期別明細書特徴差額３.toString());
        source.nokibetsuMeisaishoTokuchoNofuGaku4 = new RString(納期別明細書特徴納付額４.toString());
        source.nokibetsuMeisaishoTokuchoNofuZumiGaku4 = new RString(納期別明細書特徴納付済額４.toString());
        source.nokibetsuMeisaishoTokuchoSaGaku4 = new RString(納期別明細書特徴差額４.toString());
        source.nokibetsuMeisaishoKi1 = new RString("第").concat(納入通知書期情報リストの一番目.get期表記()).concat("期");
        source.nokibetsuMeisaishoFuchoNofuGaku1 = 納入通知書期情報リストの一番目.get調定額表記();
        source.nokibetsuMeisaishoFuchoNofuZumiGaku1 = 納入通知書期情報リストの一番目.get収入額表記();
        source.nokibetsuMeisaishoFuchoSaGaku1 = 納入通知書期情報リストの一番目.get差額表記();
        source.nokibetsuMeisaishoNokigen1 = 納入通知書期情報リストの一番目.get納期限表記();
        source.nokibetsuMeisaishoKi2 = new RString("第").concat(納入通知書期情報リストの二番目.get期表記()).concat("期");
        source.nokibetsuMeisaishoFuchoNofuGaku2 = 納入通知書期情報リストの二番目.get調定額表記();
        source.nokibetsuMeisaishoFuchoNofuZumiGaku2 = 納入通知書期情報リストの二番目.get収入額表記();
        source.nokibetsuMeisaishoFuchoSaGaku2 = 納入通知書期情報リストの二番目.get差額表記();
        source.nokibetsuMeisaishoNokigen2 = 納入通知書期情報リストの二番目.get納期限表記();
        source.nokibetsuMeisaishoKi3 = new RString("第").concat(納入通知書期情報リストの三番目.get期表記()).concat("期");
        source.nokibetsuMeisaishoFuchoNofuGaku3 = 納入通知書期情報リストの三番目.get調定額表記();
        source.nokibetsuMeisaishoFuchoNofuZumiGaku3 = 納入通知書期情報リストの三番目.get収入額表記();
        source.nokibetsuMeisaishoFuchoSaGaku3 = 納入通知書期情報リストの三番目.get差額表記();
        source.nokibetsuMeisaishoNokigen3 = 納入通知書期情報リストの三番目.get納期限表記();
        source.nokibetsuMeisaishoKi4 = new RString("第").concat(納入通知書期情報リストの四番目.get期表記()).concat("期");
        source.nokibetsuMeisaishoFuchoNofuGaku4 = 納入通知書期情報リストの四番目.get調定額表記();
        source.nokibetsuMeisaishoFuchoNofuZumiGaku4 = 納入通知書期情報リストの四番目.get収入額表記();
        source.nokibetsuMeisaishoFuchoSaGaku4 = 納入通知書期情報リストの四番目.get差額表記();
        source.nokibetsuMeisaishoNokigen4 = 納入通知書期情報リストの四番目.get納期限表記();
        source.nokibetsuMeisaishoKi5 = new RString("第").concat(納入通知書期情報リストの五番目.get期表記()).concat("期");
        source.nokibetsuMeisaishoFuchoNofuGaku5 = 納入通知書期情報リストの五番目.get調定額表記();
        source.nokibetsuMeisaishoFuchoNofuZumiGaku5 = 納入通知書期情報リストの五番目.get収入額表記();
        source.nokibetsuMeisaishoFuchoSaGaku5 = 納入通知書期情報リストの五番目.get差額表記();
        source.nokibetsuMeisaishoNokigen5 = 納入通知書期情報リストの五番目.get納期限表記();
        source.nokibetsuMeisaishoKi6 = new RString("第").concat(納入通知書期情報リストの六番目.get期表記()).concat("期");
        source.nokibetsuMeisaishoFuchoNofuGaku6 = 納入通知書期情報リストの六番目.get調定額表記();
        source.nokibetsuMeisaishoFuchoNofuZumiGaku6 = 納入通知書期情報リストの六番目.get収入額表記();
        source.nokibetsuMeisaishoFuchoSaGaku6 = 納入通知書期情報リストの六番目.get差額表記();
        source.nokibetsuMeisaishoNokigen6 = 納入通知書期情報リストの六番目.get納期限表記();
        Decimal 納期別明細書普徴納付額７
                = get調定額(納入通知書期情報リストの一番目)
                .add(get調定額(納入通知書期情報リストの二番目))
                .add(get調定額(納入通知書期情報リストの三番目))
                .add(get調定額(納入通知書期情報リストの四番目))
                .add(get調定額(納入通知書期情報リストの五番目))
                .add(get調定額(納入通知書期情報リストの六番目));
        Decimal 納期別明細書普徴納付済額７
                = get収入額(納入通知書期情報リストの一番目)
                .add(get収入額(納入通知書期情報リストの二番目))
                .add(get収入額(納入通知書期情報リストの三番目))
                .add(get収入額(納入通知書期情報リストの四番目))
                .add(get収入額(納入通知書期情報リストの五番目))
                .add(get収入額(納入通知書期情報リストの六番目));
        Decimal 納期別明細書普徴差額７ = 納期別明細書普徴納付額７.subtract(納期別明細書普徴納付済額７);
        source.nokibetsuMeisaishoFuchoNofuGaku7 = new RString(納期別明細書普徴納付額７.toString());
        source.nokibetsuMeisaishoFuchoNofuZumiGaku7 = new RString(納期別明細書普徴納付済額７.toString());
        source.nokibetsuMeisaishoFuchoSaGaku7 = new RString(納期別明細書普徴差額７.toString());
        source.kozaIraishoLeftShikibetsuCode = 編集後仮算定通知書共通情報.get識別コード().getColumnValue();
        source.kozaIraishoRightShikibetsuCode = 編集後仮算定通知書共通情報.get識別コード().getColumnValue();
        source.pagerenban1
                = ShoriKubun.バッチ.equals(仮算定納入通知書情報.get処理区分()) ? new RString(String.valueOf(連番)).concat("-1") : new RString("1-1");
        source.pagerenban2
                = ShoriKubun.バッチ.equals(仮算定納入通知書情報.get処理区分()) ? new RString(String.valueOf(連番)).concat("-2") : new RString("1-2");
        source.pagerenban3
                = ShoriKubun.バッチ.equals(仮算定納入通知書情報.get処理区分()) ? new RString(String.valueOf(連番)).concat("-3") : new RString("1-3");
        source.pagerenban4
                = ShoriKubun.バッチ.equals(仮算定納入通知書情報.get処理区分()) ? new RString(String.valueOf(連番)).concat("-4") : new RString("1-4");
        source.noutsuRenban
                = ShoriKubun.バッチ.equals(仮算定納入通知書情報.get処理区分()) ? new RString(String.valueOf(連番)).padLeft("0", INT6) : RString.EMPTY;
    }

    private RString get普徴期別金額リスト中にX期の金額(List<UniversalPhase> 普徴期別金額リスト, int 期) {
        for (UniversalPhase 普徴期別金額 : 普徴期別金額リスト) {
            if (期 == 普徴期別金額.get期()) {
                return new RString(普徴期別金額.get金額().toString());
            }
        }
        return null;
    }

    private Decimal get調定額(NonyuTsuchiShoKiJoho 納入通知書期情報) {
        return null == 納入通知書期情報.get調定額() ? Decimal.ZERO : 納入通知書期情報.get調定額();
    }

    private Decimal get収入額(NonyuTsuchiShoKiJoho 納入通知書期情報) {
        return null == 納入通知書期情報.get収入額() ? Decimal.ZERO : 納入通知書期情報.get収入額();
    }

    private Decimal get収入額(List<OrdinaryIncomeInformation> 特徴収入情報リスト, int 期) {
        for (OrdinaryIncomeInformation 特徴収入情報 : 特徴収入情報リスト) {
            if (期 == 特徴収入情報.get期月().get期AsInt()) {
                return 特徴収入情報.get収入額();
            }
        }
        return Decimal.ZERO;
    }

    private boolean is算定の基礎は空白(SanteiNoKiso 算定の基礎, int 算定の基礎項番) {
        boolean is算定の基礎は空白 = true;
        switch (算定の基礎項番) {
            case INT1:
                is算定の基礎は空白 = null == 算定の基礎.get基礎1();
                break;
            case INT2:
                is算定の基礎は空白 = null == 算定の基礎.get基礎2();
                break;
            case INT3:
                is算定の基礎は空白 = null == 算定の基礎.get基礎3();
                break;
            default:
                break;
        }
        return is算定の基礎は空白;
    }

    private RString get最大の月() {
        int 最大月 = 0;
        RString 最大の月 = RString.EMPTY;
        for (Kitsuki 出力期 : 出力期リスト) {
            if (最大月 < 出力期.get月AsInt()) {
                最大の月 = 出力期.get月().get名称();
            }
        }
        return 最大の月;
    }

    private RString get最小の月() {
        int 最小月 = 0;
        RString 最小の月 = RString.EMPTY;
        for (Kitsuki 出力期 : 出力期リスト) {
            if (最小月 > 出力期.get月AsInt()) {
                最小の月 = 出力期.get月().get名称();
            }
        }
        return 最小の月;
    }

}
