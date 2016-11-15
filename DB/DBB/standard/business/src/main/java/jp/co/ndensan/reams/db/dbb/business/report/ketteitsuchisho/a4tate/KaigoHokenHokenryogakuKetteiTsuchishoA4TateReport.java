/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.ketteitsuchisho.a4tate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jp.co.ndensan.reams.db.dbb.business.report.ketteitsuchisho.KaigoHokenHokenryogakuKetteiTsuchishoBusiness;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.AfterEditInformation;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.CharacteristicsPhase;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.EditedHonSanteiTsuchiShoKyotsu;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.HonSanteiTsuchiShoKyotsuKomokuHenshu;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.UniversalPhase;
import jp.co.ndensan.reams.db.dbb.entity.report.ketteitsuchisho.KaigoHokenHokenryogakuKetteiTsuchishoA4TateReportSource;
import jp.co.ndensan.reams.db.dbx.business.core.kanri.FuchoKiUtil;
import jp.co.ndensan.reams.db.dbx.business.core.kanri.Kitsuki;
import jp.co.ndensan.reams.db.dbx.business.core.kanri.KitsukiList;
import jp.co.ndensan.reams.db.dbx.business.core.kanri.TokuchoKiUtil;
import jp.co.ndensan.reams.db.dbx.definition.core.fuka.Tsuki;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.report.Report;
import jp.co.ndensan.reams.uz.uza.report.ReportSourceWriter;
import jp.co.ndensan.reams.uz.uza.util.editor.DecimalFormatter;

/**
 *
 * 介護保険料額決定通知書のA4縦タイプのReportです。
 *
 * @reamsid_L DBB-9080-010 sunhaidi
 */
public class KaigoHokenHokenryogakuKetteiTsuchishoA4TateReport
        extends Report<KaigoHokenHokenryogakuKetteiTsuchishoA4TateReportSource> {

    private static final int ROWNUM = 14;
    private final List<KaigoHokenHokenryogakuKetteiTsuchishoBusiness> items;

    /**
     * コンストラクタです。
     *
     * @param items KaigoHokenHokenryogakuKetteiTsuchishoBusiness
     */
    public KaigoHokenHokenryogakuKetteiTsuchishoA4TateReport(
            List<KaigoHokenHokenryogakuKetteiTsuchishoBusiness> items) {
        this.items = items;
    }

    @Override
    public void writeBy(ReportSourceWriter<KaigoHokenHokenryogakuKetteiTsuchishoA4TateReportSource> reportSourceWriter) {
        for (KaigoHokenHokenryogakuKetteiTsuchishoBusiness item : items) {
            KaigoHokenHokenryogakuKetteiTsuchishoA4TateEditor yokoEditor = new KaigoHokenHokenryogakuKetteiTsuchishoA4TateEditor(item);
            CompSofubutsuAtesakiEditor compSofubutsuAtesakiEditor = new CompSofubutsuAtesakiEditor(item);
            CompNinshoshaEditor compNinshoshaEditor = new CompNinshoshaEditor(item.getNinshoshaSource());
            CompKaigoToiawasesakiEditor toiawasesakiEditor = new CompKaigoToiawasesakiEditor(item.getCompKaigoToiawasesakiSource());
            EditedHonSanteiTsuchiShoKyotsu 編集後本算定通知書共通情報 = item.get本算定決定通知書情報().get編集後本算定通知書共通情報();
            List<UniversalPhase> 更正前_普徴期別金額リスト = 編集後本算定通知書共通情報.get更正前().get普徴期別金額リスト();
            List<UniversalPhase> 更正後_普徴期別金額リスト = 編集後本算定通知書共通情報.get更正後().get普徴期別金額リスト();
            List<CharacteristicsPhase> 更正前_特徴期別金額リスト = 編集後本算定通知書共通情報.get更正前().get特徴期別金額リスト();
            List<CharacteristicsPhase> 更正後_特徴期別金額リスト = 編集後本算定通知書共通情報.get更正後().get特徴期別金額リスト();
            List<AfterEditInformation> 普徴納期情報リスト = 編集後本算定通知書共通情報.get普徴納期情報リスト();
            HonSanteiTsuchiShoKyotsuKomokuHenshu honSantei = new HonSanteiTsuchiShoKyotsuKomokuHenshu();
            List<RString> 特徴期リスト = honSantei.create特徴期リスト();
            特徴期リスト = sort期(特徴期リスト);
            List<Tsuki> 特徴月リス = create特徴月リスト(特徴期リスト);
            List<RString> 普徴期リスト = honSantei.create普徴期リスト();
            普徴期リスト = sort期(普徴期リスト);
            List<Tsuki> 普徴月リスト = create普徴月リスト(普徴期リスト);
            for (int i = 1; i <= ROWNUM; i++) {
                KibetsuBusiness kibetsuBusiness = new KibetsuBusiness();
                boolean flag = true;
                if (i <= 普徴期リスト.size()) {
                    flag = false;
                    RString 普徴期 = 普徴期リスト.get(i - 1);
                    Tsuki 普徴月Enum = 普徴月リスト.get(i - 1);
                    RString 普徴月 = get普徴月コード(普徴月Enum);
                    if (普徴月Enum != Tsuki.翌年度4月 && 普徴月Enum != Tsuki.翌年度5月) {
                        kibetsuBusiness.setListKibetsu_1(format月と期(普徴期));
                        kibetsuBusiness.setListKibetsu_2(format月と期(普徴月));
                        kibetsuBusiness.setListKibetsu_3(get納期限(普徴期, 普徴納期情報リスト));
                        set普徴期別金額(kibetsuBusiness, 普徴期, 更正前_普徴期別金額リスト, 更正後_普徴期別金額リスト);
                        kibetsuBusiness.setListZuiji_1(get随時(普徴期, 普徴納期情報リスト));
                    }
                }
                if (i <= 特徴期リスト.size()) {
                    flag = false;
                    RString 特徴期 = 特徴期リスト.get(i - 1);
                    RString 特徴月 = 特徴月リス.get(i - 1).getコード();
                    kibetsuBusiness.setListKibetsu_6(format月と期(特徴期));
                    kibetsuBusiness.setListKibetsu_7(format月と期(特徴月));
                    set特徴期別金額(kibetsuBusiness, 特徴期, 更正前_特徴期別金額リスト, 更正後_特徴期別金額リスト);
                }
                if (flag) {
                    break;
                }

                KibetsuEditor kibetsuEditor = new KibetsuEditor(kibetsuBusiness);

                KaigoHokenHokenryogakuKetteiTsuchishoA4TateBuilder builder
                        = new KaigoHokenHokenryogakuKetteiTsuchishoA4TateBuilder(yokoEditor,
                                kibetsuEditor,
                                compSofubutsuAtesakiEditor,
                                compNinshoshaEditor,
                                toiawasesakiEditor);
                reportSourceWriter.writeLine(builder);
            }
        }
    }

    private RString edit金額(Decimal 金額) {
        return DecimalFormatter.toコンマ区切りRString(金額, 0);
    }

    private List<Tsuki> create普徴月リスト(List<RString> 普徴期リスト) {
        List<Tsuki> tsukiList = new ArrayList<>();
        KitsukiList kitsukiList = new FuchoKiUtil().get期月リスト();
        for (RString 普徴期 : 普徴期リスト) {
            List<Kitsuki> kitsukiのlist = kitsukiList.get期の月(Integer.parseInt(String.valueOf(普徴期)));
            if (!kitsukiのlist.isEmpty()) {
                tsukiList.add(kitsukiのlist.get(kitsukiのlist.size() - 1).get月());
            }
        }
        return tsukiList;
    }

    private List<Tsuki> create特徴月リスト(List<RString> 特徴期リスト) {
        List<Tsuki> tsukiList = new ArrayList<>();
        KitsukiList kitsukiList = new TokuchoKiUtil().get期月リスト();
        for (RString 特徴期 : 特徴期リスト) {
            List<Kitsuki> kitsukiのlist = kitsukiList.get期の月(Integer.parseInt(String.valueOf(特徴期)));
            if (!kitsukiのlist.isEmpty()) {
                tsukiList.add(kitsukiのlist.get(kitsukiのlist.size() - 1).get月());
            }
        }
        return tsukiList;
    }

    private RString format月と期(RString value) {
        return new RString(Integer.valueOf(value.toString())).padLeft(RString.HALF_SPACE, 2);
    }

    private RString get普徴月コード(Tsuki 普徴月) {
        if (Tsuki.翌年度4月 == 普徴月) {
            return new RString("04");
        }
        if (Tsuki.翌年度5月 == 普徴月) {
            return new RString("05");
        }
        return 普徴月.getコード();
    }

    private List<RString> sort期(List<RString> 期リスト) {
        List<RString> list = new ArrayList<>();
        for (RString 期 : 期リスト) {
            if (Integer.parseInt(期.toString()) == 0 || list.contains(期)) {
                continue;
            }
            list.add(期);
        }
        Collections.sort(list, new Comparator<RString>() {
            @Override
            public int compare(RString arg0, RString arg1) {
                if (Integer.parseInt(arg0.toString()) < Integer.parseInt(arg1.toString())) {
                    return -1;
                } else if (Integer.parseInt(arg1.toString()) < Integer.parseInt(arg0.toString())) {
                    return 1;
                }
                return 0;
            }
        });
        return list;
    }

    private RString get納期限(RString 期, List<AfterEditInformation> 普徴納期情報リスト) {
        RString 納期限 = RString.EMPTY;
        for (AfterEditInformation afterEditInformation : 普徴納期情報リスト) {
            if (期.equals(afterEditInformation.get期())) {
                納期限 = afterEditInformation.get納期限();
                break;
            }
        }
        return 納期限;
    }

    private RString get随時(RString 期, List<AfterEditInformation> 普徴納期情報リスト) {
        RString 随時 = RString.EMPTY;
        for (AfterEditInformation afterEditInformation : 普徴納期情報リスト) {
            if (期.equals(afterEditInformation.get期())) {
                随時 = afterEditInformation.get随時();
                break;
            }
        }
        return 随時;
    }

    private void set普徴期別金額(KibetsuBusiness kibetsuBusiness,
            RString 期,
            List<UniversalPhase> 更正前_普徴期別金額リスト,
            List<UniversalPhase> 更正後_普徴期別金額リスト) {
        Decimal 更正前_普徴期別金額 = get普徴期別金額(期, 更正前_普徴期別金額リスト);
        Decimal 更正後_普徴期別金額 = get普徴期別金額(期, 更正後_普徴期別金額リスト);
        if (Decimal.ZERO.equals(更正前_普徴期別金額)
                && Decimal.ZERO.equals(更正後_普徴期別金額)) {
            kibetsuBusiness.setListKibetsu_4(RString.EMPTY);
            kibetsuBusiness.setListKibetsu_5(RString.EMPTY);
        } else {
            kibetsuBusiness.setListKibetsu_4(edit金額(更正前_普徴期別金額));
            kibetsuBusiness.setListKibetsu_5(edit金額(更正後_普徴期別金額));
        }
    }

    private Decimal get普徴期別金額(RString 期, List<UniversalPhase> 普徴期別金額リスト) {
        Decimal 普徴期別金額 = Decimal.ZERO;
        if (普徴期別金額リスト == null) {
            return 普徴期別金額;
        }
        for (UniversalPhase universalPhase : 普徴期別金額リスト) {
            if (new RString(universalPhase.get期()).padZeroToLeft(2).equals(期.padZeroToLeft(2))) {
                普徴期別金額 = universalPhase.get金額() == null
                        ? Decimal.ZERO : universalPhase.get金額();
                break;
            }
        }
        return 普徴期別金額;
    }

    private void set特徴期別金額(KibetsuBusiness kibetsuBusiness,
            RString 期,
            List<CharacteristicsPhase> 更正前_特徴期別金額リスト,
            List<CharacteristicsPhase> 更正後_特徴期別金額リスト) {
        Decimal 更正前_特徴期別金額 = get特徴期別金額(期, 更正前_特徴期別金額リスト);
        Decimal 更正後_特徴期別金額 = get特徴期別金額(期, 更正後_特徴期別金額リスト);
        if (Decimal.ZERO.equals(更正前_特徴期別金額)
                && Decimal.ZERO.equals(更正後_特徴期別金額)) {
            kibetsuBusiness.setListKibetsu_8(RString.EMPTY);
            kibetsuBusiness.setListKibetsu_9(RString.EMPTY);
        } else {
            kibetsuBusiness.setListKibetsu_8(edit金額(更正前_特徴期別金額));
            kibetsuBusiness.setListKibetsu_9(edit金額(更正後_特徴期別金額));
        }
    }

    private Decimal get特徴期別金額(RString 期, List<CharacteristicsPhase> 特徴期別金額リスト) {
        Decimal 特徴期別金額 = Decimal.ZERO;
        if (特徴期別金額リスト == null) {
            return 特徴期別金額;
        }
        for (CharacteristicsPhase characteristicsPhase : 特徴期別金額リスト) {

            if (characteristicsPhase.get期().padZeroToLeft(2).equals(期.padZeroToLeft(2))) {
                特徴期別金額 = characteristicsPhase.get金額() == null ? Decimal.ZERO : characteristicsPhase.get金額();
                break;
            }
        }
        return 特徴期別金額;
    }
}
