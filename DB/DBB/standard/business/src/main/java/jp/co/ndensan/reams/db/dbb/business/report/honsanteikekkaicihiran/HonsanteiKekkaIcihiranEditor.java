/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.honsanteikekkaicihiran;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.ShikakuKikan;
import jp.co.ndensan.reams.db.dbb.business.core.fuka.ShikakuKikanJoho;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.honnsanteifuka.KeisangojohoAtenaKozaEntity;
import jp.co.ndensan.reams.db.dbb.entity.report.honsanteikekkaicihiran.HonsanteiKekkaIcihiranReportSource;
import jp.co.ndensan.reams.db.dbx.business.core.kanri.FuchoKiUtil;
import jp.co.ndensan.reams.db.dbx.business.core.kanri.Kitsuki;
import jp.co.ndensan.reams.db.dbx.business.core.kanri.KitsukiList;
import jp.co.ndensan.reams.ua.uax.business.core.koza.IKoza;
import jp.co.ndensan.reams.ua.uax.business.core.koza.Koza;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.ShikibetsuTaishoFactory;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.kojin.IKojin;
import jp.co.ndensan.reams.ua.uax.entity.db.relate.KozaRelateEntity;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.ChoikiCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.ui.binding.propertyenum.DisplayTimeFormat;
import jp.co.ndensan.reams.uz.uza.util.editor.DecimalFormatter;

/**
 * 「本算定賦課計算」ボディEditorです。
 *
 * @reamsid_L DBB-0730-030 lijunjun
 */
public class HonsanteiKekkaIcihiranEditor implements IHonsanteiKekkaIcihiranEditor {

    private final List<KeisangojohoAtenaKozaEntity> 計算後情報_宛名_口座EntityList;
    private final FlexibleYear 賦課年度;
    private final YMDHMS 調定日時;
    private final RString 市町村コード;
    private final RString 市町村名;
    private final RString 住所編集;
    private final List<RString> 出力順項目リスト;
    private final List<RString> 改頁項目リスト;
    private static final int NUM_0 = 0;
    private static final int NUM_1 = 1;
    private static final int NUM_2 = 2;
    private static final int NUM_3 = 3;
    private static final int NUM_4 = 4;
    private static final int NUM_5 = 5;
    private static final int NUM_6 = 6;
    private static final int NUM_7 = 7;
    private static final int NUM_8 = 8;
    private static final int NUM_9 = 9;
    private static final int NUM_10 = 10;
    private static final int NUM_11 = 11;
    private static final int NUM_12 = 12;
    private static final char CHAR_0 = '0';
    private static final RString 更正前後区分_更正前 = new RString("1");
    private static final RString 更正前後区分_更正後 = new RString("2");
    private static final RString 半角ハイフン = new RString("_");
    private final RString 特別徴収 = new RString("特別徴収");
    private final RString 普通徴収 = new RString("普通徴収");
    private final RString 併用徴収 = new RString("併用徴収");
    private final RString 本算定賦課なし = new RString("本算定賦課なし");
    private final RString 本算定前半普徴 = new RString("本算定前半普徴");
    private static final RString 作成 = new RString("作成");

    /**
     * コンストラクタです。
     *
     * @param 計算後情報_宛名_口座EntityList List<KeisangojohoAtenaKozaEntity>
     * @param 賦課年度 FlexibleYear
     * @param 調定日時 YMDHMS
     * @param 市町村コード RString
     * @param 市町村名 RString
     * @param 住所編集 RString
     * @param 出力順項目リスト List<RString>
     * @param 改頁項目リスト List<RString>
     */
    public HonsanteiKekkaIcihiranEditor(List<KeisangojohoAtenaKozaEntity> 計算後情報_宛名_口座EntityList,
            FlexibleYear 賦課年度,
            YMDHMS 調定日時,
            RString 市町村コード,
            RString 市町村名,
            RString 住所編集,
            List<RString> 出力順項目リスト,
            List<RString> 改頁項目リスト) {
        this.計算後情報_宛名_口座EntityList = 計算後情報_宛名_口座EntityList;
        this.賦課年度 = 賦課年度;
        this.調定日時 = 調定日時;
        this.市町村コード = 市町村コード;
        this.市町村名 = 市町村名;
        this.住所編集 = 住所編集;
        this.出力順項目リスト = 出力順項目リスト;
        this.改頁項目リスト = 改頁項目リスト;
    }

    @Override
    public HonsanteiKekkaIcihiranReportSource edit(HonsanteiKekkaIcihiranReportSource source) {
        return editSource(source);
    }

    private HonsanteiKekkaIcihiranReportSource editSource(HonsanteiKekkaIcihiranReportSource source) {
        for (KeisangojohoAtenaKozaEntity entity : 計算後情報_宛名_口座EntityList) {

            editorSource_partONE(entity, source);
            editorSource_partTWO(entity, source);
            editorSource_partTHREE(entity, source);
        }
        return source;
    }

    private void editorSource_partONE(KeisangojohoAtenaKozaEntity entity, HonsanteiKekkaIcihiranReportSource source) {
        if (調定日時 != null) {
            RString 帳票作成年月日 = 調定日時.getDate().wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN)
                    .separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
            RString 帳票作成時 = 調定日時.getRDateTime().getTime().toFormattedTimeString(DisplayTimeFormat.HH時mm分ss秒);
            source.printTimeStamp = 帳票作成年月日.concat(RString.FULL_SPACE).concat(帳票作成時)
                    .concat(RString.FULL_SPACE).concat(作成);
        }
        if (賦課年度 != null) {
            source.nendo = 賦課年度.wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN)
                    .fillType(FillType.BLANK).getYear();
        }
        source.hokenshaNo = 市町村コード;
        source.hokenshaName = 市町村名;
        source.shutsuryokujun1 = set出力順();
        source.shutsuryokujun2 = set出力順();
        source.shutsuryokujun3 = set出力順();
        source.shutsuryokujun4 = set出力順();
        source.shutsuryokujun5 = set出力順();
        source.kaipage1 = set改ページ();
        source.kaipage2 = set改ページ();
        source.kaipage3 = set改ページ();
        source.kaipage4 = set改ページ();
        source.kaipage5 = set改ページ();
        List<RString> 期の表記 = set普徴期();
        source.fuchoKi1 = 期の表記.get(NUM_0);
        source.fuchoKi2 = 期の表記.get(NUM_1);
        source.fuchoKi3 = 期の表記.get(NUM_2);
        source.fuchoKi4 = 期の表記.get(NUM_3);
        source.fuchoKi5 = 期の表記.get(NUM_4);
        source.fuchoKi6 = 期の表記.get(NUM_5);
        source.fuchoKi7 = 期の表記.get(NUM_6);
        source.fuchoKi8 = 期の表記.get(NUM_7);
        source.fuchoKi9 = 期の表記.get(NUM_8);
        source.fuchoKi10 = 期の表記.get(NUM_9);
        source.fuchoKi11 = 期の表記.get(NUM_10);
        source.fuchoKi12 = 期の表記.get(NUM_11);

        if (entity.get通知書番号() != null) {
            source.listUpper_1 = new RString(entity.get通知書番号().toString());
        }
        AtenaMeisho 氏名 = entity.get宛名Entity().getKanjiShimei();
        if (氏名 != null) {
            source.listUpper_2 = 氏名.value();
        }
        IKojin 宛名 = ShikibetsuTaishoFactory.createKojin(entity.get宛名Entity());
        FlexibleDate 生年月日 = entity.get宛名Entity().getSeinengappiYMD();
        if (生年月日 != null) {

            if (宛名.is日本人()) {
                source.listUpper_3 = 生年月日.wareki().eraType(EraType.KANJI)
                        .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE)
                        .fillType(FillType.BLANK).toDateString();
            } else {
                source.listUpper_3 = 生年月日.seireki().toDateString();
            }
        }
        if (宛名.get性別() != null) {
            source.listUpper_4 = 宛名.get性別().code();
        }
        if (entity.get世帯コード() != null) {
            source.listUpper_5 = entity.get世帯コード().value();
        }
        if (entity.get識別コード() != null) {
            source.listUpper_6 = entity.get識別コード().value();
        }
        ChoikiCode 町域コード = entity.get宛名Entity().getChoikiCode();
        if (町域コード != null) {
            source.listUpper_7 = 町域コード.value();
        }
        YubinNo 郵便番号 = entity.get宛名Entity().getYubinNo();
        if (郵便番号 != null) {
            source.listUpper_8 = 郵便番号.value();
        }
        source.listUpper_9 = 住所編集;
        source.listUpper_10 = set口座の情報(entity);

    }

    private void editorSource_partTWO(KeisangojohoAtenaKozaEntity entity, HonsanteiKekkaIcihiranReportSource source) {
        if (entity.get被保険者番号() != null) {
            source.listCenter_1 = entity.get被保険者番号().value();
        }
        if (entity.get資格取得日() != null) {
            source.listCenter_2 = entity.get資格取得日().wareki().toDateString();
        }
        if (entity.get資格喪失日() != null) {
            source.listCenter_3 = entity.get資格喪失日().wareki().toDateString();
        }
        ShikakuKikan shikakuKikan = new ShikakuKikan();
        ShikakuKikanJoho shikakuKikanJoho = shikakuKikan.get資格期間(賦課年度, entity.get資格取得日(), entity.get資格喪失日());
        if (shikakuKikanJoho.get月数() != 0) {
            source.listCenter_4 = new RString(String.valueOf(shikakuKikanJoho.get月数()));
        }
        if (entity.get確定介護保険料_年額() != null) {
            source.listCenter_5 = DecimalFormatter.toコンマ区切りRString(entity.get確定介護保険料_年額(), 0);
        }
        if (entity.get減免前介護保険料_年額() != null) {
            source.listCenter_6 = DecimalFormatter.toコンマ区切りRString(entity.get減免前介護保険料_年額(), 0);
        }
        if (entity.get減免額() != null) {
            source.listCenter_7 = DecimalFormatter.toコンマ区切りRString(entity.get減免額(), 0);
        }
        source.listCenter_8 = set徴収方法(entity);
        set月別取得段階(entity, source);
        source.listCenter_21 = set備考1(entity);

    }

    private void editorSource_partTHREE(KeisangojohoAtenaKozaEntity entity, HonsanteiKekkaIcihiranReportSource source) {
        if (entity.get特徴期別金額01() != null) {
            source.listLower_1 = DecimalFormatter.toコンマ区切りRString(entity.get特徴期別金額01(), 0);
        }
        if (entity.get特徴期別金額02() != null) {
            source.listLower_2 = DecimalFormatter.toコンマ区切りRString(entity.get特徴期別金額02(), 0);
        }
        if (entity.get特徴期別金額03() != null) {
            source.listLower_3 = DecimalFormatter.toコンマ区切りRString(entity.get特徴期別金額03(), 0);
        }
        if (entity.get特徴期別金額04() != null) {
            source.listLower_4 = DecimalFormatter.toコンマ区切りRString(entity.get特徴期別金額04(), 0);
        }
        if (entity.get特徴期別金額05() != null) {
            source.listLower_5 = DecimalFormatter.toコンマ区切りRString(entity.get特徴期別金額05(), 0);
        }
        if (entity.get特徴期別金額06() != null) {
            source.listLower_6 = DecimalFormatter.toコンマ区切りRString(entity.get特徴期別金額06(), 0);
        }
        if (entity.get普徴期別金額01() != null) {
            source.listLower_7 = DecimalFormatter.toコンマ区切りRString(entity.get普徴期別金額01(), 0);
        }
        if (entity.get普徴期別金額02() != null) {
            source.listLower_8 = DecimalFormatter.toコンマ区切りRString(entity.get普徴期別金額02(), 0);
        }
        if (entity.get普徴期別金額03() != null) {
            source.listLower_9 = DecimalFormatter.toコンマ区切りRString(entity.get普徴期別金額03(), 0);
        }
        if (entity.get普徴期別金額04() != null) {

            source.listLower_10 = DecimalFormatter.toコンマ区切りRString(entity.get普徴期別金額04(), 0);
        }
        if (entity.get普徴期別金額05() != null) {
            source.listLower_11 = DecimalFormatter.toコンマ区切りRString(entity.get普徴期別金額05(), 0);
        }
        if (entity.get普徴期別金額06() != null) {
            source.listLower_12 = DecimalFormatter.toコンマ区切りRString(entity.get普徴期別金額06(), 0);
        }
        if (entity.get普徴期別金額07() != null) {
            source.listLower_13 = DecimalFormatter.toコンマ区切りRString(entity.get普徴期別金額07(), 0);
        }
        if (entity.get普徴期別金額08() != null) {
            source.listLower_14 = DecimalFormatter.toコンマ区切りRString(entity.get普徴期別金額08(), 0);
        }
        if (entity.get普徴期別金額09() != null) {
            source.listLower_15 = DecimalFormatter.toコンマ区切りRString(entity.get普徴期別金額09(), 0);
        }
        if (entity.get普徴期別金額10() != null) {
            source.listLower_16 = DecimalFormatter.toコンマ区切りRString(entity.get普徴期別金額10(), 0);
        }
        if (entity.get普徴期別金額11() != null) {
            source.listLower_17 = DecimalFormatter.toコンマ区切りRString(entity.get普徴期別金額11(), 0);
        }
        if (entity.get普徴期別金額12() != null) {
            source.listLower_18 = DecimalFormatter.toコンマ区切りRString(entity.get普徴期別金額12(), 0);
        }
    }

    private RString set出力順() {
        if (出力順項目リスト != null && !出力順項目リスト.isEmpty()) {
            if (出力順項目リスト.size() > NUM_0) {
                return 出力順項目リスト.get(NUM_0);
            } else if (出力順項目リスト.size() > NUM_1) {
                return 出力順項目リスト.get(NUM_1);
            } else if (出力順項目リスト.size() > NUM_2) {
                return 出力順項目リスト.get(NUM_2);
            } else if (出力順項目リスト.size() > NUM_3) {
                return 出力順項目リスト.get(NUM_3);
            } else if (出力順項目リスト.size() > NUM_4) {
                return 出力順項目リスト.get(NUM_4);
            }
        }
        return RString.EMPTY;
    }

    private RString set改ページ() {
        if (改頁項目リスト != null && !改頁項目リスト.isEmpty()) {
            if (改頁項目リスト.size() > NUM_0) {
                return 改頁項目リスト.get(NUM_0);
            } else if (改頁項目リスト.size() > NUM_1) {
                return 改頁項目リスト.get(NUM_1);
            } else if (改頁項目リスト.size() > NUM_2) {
                return 改頁項目リスト.get(NUM_2);
            } else if (改頁項目リスト.size() > NUM_3) {
                return 改頁項目リスト.get(NUM_3);
            } else if (改頁項目リスト.size() > NUM_4) {
                return 改頁項目リスト.get(NUM_4);
            }
        }
        return RString.EMPTY;
    }

    private List<RString> set普徴期() {
        FuchoKiUtil 月期対応取得_普徴 = new FuchoKiUtil();
        KitsukiList 期月リスト_普徴 = 月期対応取得_普徴.get期月リスト();
        List<Kitsuki> 表記リスト = 期月リスト_普徴.toList();
        Kitsuki 最終法定納期 = 期月リスト_普徴.get最終法定納期();
        List<RString> 期の表記 = new ArrayList<>();
        for (Kitsuki 期 : 表記リスト) {
            if (期.get期AsInt() <= 最終法定納期.get期AsInt()) {
                期の表記.add(期.get表記().asX期());
            } else {
                期の表記.add(RString.EMPTY);
            }
        }
        return 期の表記;
    }

    private RString set口座の情報(KeisangojohoAtenaKozaEntity entity) {

        KozaRelateEntity releteEntity = entity.get口座Entity();
        IKoza 口座 = new Koza(releteEntity);
        RString 金融機関コード = RString.EMPTY;
        RString 口座名義人漢字 = RString.EMPTY;
        if (口座.get金融機関コード() != null) {
            金融機関コード = 口座.get金融機関コード().value().substring(NUM_0, NUM_4);
        }
        if (口座.get口座名義人漢字() != null) {
            口座名義人漢字 = 口座.get口座名義人漢字().value();
        }
        if (口座.isゆうちょ銀行()) {
            RString 通帳記号 = 口座.get通帳記号().substring(NUM_0, NUM_5);
            RString 通帳番号 = 口座.get通帳番号().substring(NUM_0, NUM_8);
            return 金融機関コード.concat(RString.FULL_SPACE).concat(通帳記号).concat(半角ハイフン).concat(通帳番号)
                    .concat(RString.FULL_SPACE).concat(口座名義人漢字);
        } else {

            RString 支店コード = 口座.get支店コード().getColumnValue().substring(NUM_0, NUM_3);
//            RString 口座種別 = 口座.get預金種別().get預金種別略称().substring(NUM_0, NUM_2);
            RString 口座種別 = RString.EMPTY;
            RString 口座番号 = 口座.get口座番号().substring(NUM_0, NUM_7);
            return 金融機関コード.concat(半角ハイフン).concat(支店コード).concat(RString.FULL_SPACE).concat(口座種別)
                    .concat(半角ハイフン).concat(口座番号).concat(RString.FULL_SPACE).concat(口座名義人漢字);

        }
    }

    private RString set徴収方法(KeisangojohoAtenaKozaEntity entity) {
        Decimal 特徴期の期別金額の合計 = nullTOZero(entity.get特徴期別金額04())
                .add(nullTOZero(entity.get特徴期別金額05()))
                .add(nullTOZero(entity.get特徴期別金額06()));
        Decimal 普徴期の期別金額の合計 = nullTOZero(entity.get普徴期別金額01())
                .add(nullTOZero(entity.get普徴期別金額02()).add(nullTOZero(entity.get普徴期別金額03())))
                .add(nullTOZero(entity.get普徴期別金額04())).add(nullTOZero(entity.get普徴期別金額05()))
                .add(nullTOZero(entity.get普徴期別金額06())).add(nullTOZero(entity.get普徴期別金額07()))
                .add(nullTOZero(entity.get普徴期別金額08())).add(nullTOZero(entity.get普徴期別金額09()))
                .add(nullTOZero(entity.get普徴期別金額10())).add(nullTOZero(entity.get普徴期別金額11()))
                .add(nullTOZero(entity.get普徴期別金額12())).add(nullTOZero(entity.get普徴期別金額13()))
                .add(nullTOZero(entity.get普徴期別金額14()));
        if (特徴期の期別金額の合計 == Decimal.ZERO && 普徴期の期別金額の合計 == Decimal.ZERO) {
            return RString.EMPTY;
        } else if (特徴期の期別金額の合計.compareTo(Decimal.ONE) == 1 && 普徴期の期別金額の合計 == Decimal.ZERO) {
            return 特別徴収;
        } else if (特徴期の期別金額の合計 == Decimal.ZERO && 普徴期の期別金額の合計.compareTo(Decimal.ONE) == 1) {
            return 普通徴収;
        } else if (特徴期の期別金額の合計.compareTo(Decimal.ONE) == 1 && 普徴期の期別金額の合計.compareTo(Decimal.ONE) == 1) {
            return 併用徴収;
        } else {
            return null;
        }
    }

    private RString set備考1(KeisangojohoAtenaKozaEntity entity) {
        Decimal 特徴期の期別金額の合計 = nullTOZero(entity.get特徴期別金額04())
                .add(nullTOZero(entity.get特徴期別金額05()))
                .add(nullTOZero(entity.get特徴期別金額06()));
        Decimal 普徴期の期別金額の合計 = nullTOZero(entity.get普徴期別金額01())
                .add(nullTOZero(entity.get普徴期別金額02()).add(nullTOZero(entity.get普徴期別金額03())))
                .add(nullTOZero(entity.get普徴期別金額04())).add(nullTOZero(entity.get普徴期別金額05()))
                .add(nullTOZero(entity.get普徴期別金額06())).add(nullTOZero(entity.get普徴期別金額07()))
                .add(nullTOZero(entity.get普徴期別金額08())).add(nullTOZero(entity.get普徴期別金額09()))
                .add(nullTOZero(entity.get普徴期別金額10())).add(nullTOZero(entity.get普徴期別金額11()))
                .add(nullTOZero(entity.get普徴期別金額12())).add(nullTOZero(entity.get普徴期別金額13()))
                .add(nullTOZero(entity.get普徴期別金額14()));
        if (特徴期の期別金額の合計 == Decimal.ZERO && 普徴期の期別金額の合計 == Decimal.ZERO) {
            return 本算定賦課なし;
        } else if (特徴期の期別金額の合計.compareTo(Decimal.ONE) == 1 && 普徴期の期別金額の合計 == Decimal.ZERO) {
            return 本算定前半普徴;
        } else if (特徴期の期別金額の合計 == Decimal.ZERO && 普徴期の期別金額の合計.compareTo(Decimal.ONE) == 1) {
            return RString.EMPTY;
        } else if (特徴期の期別金額の合計.compareTo(Decimal.ONE) == 1 && 普徴期の期別金額の合計.compareTo(Decimal.ONE) == 1) {
            return RString.EMPTY;
        } else {
            return null;
        }
    }

//    private void set月別取得段階(KeisangojohoAtenaKozaEntity entity, HonsanteiKekkaIcihiranReportSource source) {
//        List<Integer> 月List = new ArrayList<>();
//        月List.add(NUM_1);
//        月List.add(NUM_2);
//        月List.add(NUM_3);
//        月List.add(NUM_4);
//        月List.add(NUM_5);
//        月List.add(NUM_6);
//        月List.add(NUM_7);
//        月List.add(NUM_8);
//        月List.add(NUM_9);
//        月List.add(NUM_10);
//        月List.add(NUM_11);
//        月List.add(NUM_12);
//
//        FlexibleDate 月割開始年月1 = entity.get月割開始年月1();
//        int 開始月1 = 月割開始年月1.getMonthValue();
//        FlexibleDate 月割終了年月1 = entity.get月割終了年月1();
//        int 終了月1 = 月割終了年月1.getMonthValue();
//        RString 保険料算定段階1 = entity.get保険料算定段階1().substring(NUM_0, NUM_2);
//        RString 保険料算定段階2 = entity.get保険料算定段階2().substring(NUM_0, NUM_2);
//        for (int i = 0; i < 月List.size(); i++) {
//            if (開始月1 <= 終了月1) {
//                取得段階1(i, 月List, 保険料算定段階1, 保険料算定段階2, 開始月1, 終了月1, source);
//            } else {
//                取得段階2(i, 月List, 保険料算定段階1, 保険料算定段階2, 開始月1, 終了月1, source);
//            }
//        }
//    }
//
//    private void 取得段階1(int i, List<Integer> 月List,
//            RString 保険料算定段階1,
//            RString 保険料算定段階2,
//            int 開始月1,
//            int 終了月1,
//            HonsanteiKekkaIcihiranReportSource source) {
//        if (月List.get(i) >= 開始月1 && 月List.get(i) <= 終了月1) {
//            set月別取得段階1(保険料算定段階1, 月List.get(i), source);
//        } else {
//            set月別取得段階2(保険料算定段階2, 月List.get(i), source);
//        }
//    }
//
//    private void 取得段階2(int i, List<Integer> 月List,
//            RString 保険料算定段階1,
//            RString 保険料算定段階2,
//            int 開始月1,
//            int 終了月1,
//            HonsanteiKekkaIcihiranReportSource source) {
//        if (月List.get(i) < 開始月1 || 月List.get(i) > 終了月1) {
//            set月別取得段階1(保険料算定段階1, 月List.get(i), source);
//        } else {
//            set月別取得段階2(保険料算定段階2, 月List.get(i), source);
//        }
//    }
//
//    private void set月別取得段階1(RString 保険料算定段階1, int 月別, HonsanteiKekkaIcihiranReportSource source) {
//        switch (月別) {
//            case NUM_4:
//                source.listCenter_9 = 保険料算定段階1;
//                break;
//            case NUM_5:
//                source.listCenter_10 = 保険料算定段階1;
//                break;
//            case NUM_6:
//                source.listCenter_11 = 保険料算定段階1;
//                break;
//            case NUM_7:
//                source.listCenter_12 = 保険料算定段階1;
//                break;
//            case NUM_8:
//                source.listCenter_13 = 保険料算定段階1;
//                break;
//            case NUM_9:
//                source.listCenter_14 = 保険料算定段階1;
//                break;
//            case NUM_10:
//                source.listCenter_15 = 保険料算定段階1;
//                break;
//            case NUM_11:
//                source.listCenter_16 = 保険料算定段階1;
//                break;
//            case NUM_12:
//                source.listCenter_17 = 保険料算定段階1;
//                break;
//            case NUM_1:
//                source.listCenter_18 = 保険料算定段階1;
//                break;
//            case NUM_2:
//                source.listCenter_19 = 保険料算定段階1;
//                break;
//            case NUM_3:
//                source.listCenter_20 = 保険料算定段階1;
//                break;
//            default:
//                break;
//        }
//    }
//
//    private void set月別取得段階2(RString 保険料算定段階2, int 月別, HonsanteiKekkaIcihiranReportSource source) {
//        switch (月別) {
//            case NUM_4:
//                source.listCenter_9 = 保険料算定段階2;
//                break;
//            case NUM_5:
//                source.listCenter_10 = 保険料算定段階2;
//                break;
//            case NUM_6:
//                source.listCenter_11 = 保険料算定段階2;
//                break;
//            case NUM_7:
//                source.listCenter_12 = 保険料算定段階2;
//                break;
//            case NUM_8:
//                source.listCenter_13 = 保険料算定段階2;
//                break;
//            case NUM_9:
//                source.listCenter_14 = 保険料算定段階2;
//                break;
//            case NUM_10:
//                source.listCenter_15 = 保険料算定段階2;
//                break;
//            case NUM_11:
//                source.listCenter_16 = 保険料算定段階2;
//                break;
//            case NUM_12:
//                source.listCenter_17 = 保険料算定段階2;
//                break;
//            case NUM_1:
//                source.listCenter_18 = 保険料算定段階2;
//                break;
//            case NUM_2:
//                source.listCenter_19 = 保険料算定段階2;
//                break;
//            case NUM_3:
//                source.listCenter_20 = 保険料算定段階2;
//                break;
//            default:
//                break;
//        }
//    }
    private Decimal nullTOZero(Decimal 特徴普徴期別金額) {
        if (特徴普徴期別金額 == null) {
            return Decimal.ZERO;
        }
        return 特徴普徴期別金額;
    }

    private void set月別取得段階(KeisangojohoAtenaKozaEntity entity, HonsanteiKekkaIcihiranReportSource source) {
        RString 更正前後区分 = entity.get更正前後区分();
        FlexibleDate 月割開始年月1 = entity.get月割開始年月1();
        int 開始月1 = 月割開始年月1.getMonthValue();
        FlexibleDate 月割終了年月1 = entity.get月割終了年月1();
        int 終了月1 = 月割終了年月1.getMonthValue();
        if (entity.get保険料算定段階1().length() >= NUM_2) {
            RString 保険料算定段階1 = entity.get保険料算定段階1().substring(NUM_0, NUM_2).trimStart(CHAR_0);
            set月別取得段階(source, 開始月1, 終了月1, 保険料算定段階1, 更正前後区分);
        }
        FlexibleDate 月割開始年月2 = entity.get月割開始年月2();
        int 開始月2 = 月割開始年月2.getMonthValue();
        FlexibleDate 月割終了年月2 = entity.get月割終了年月2();
        int 終了月2 = 月割終了年月2.getMonthValue();
        if (entity.get保険料算定段階2().length() >= NUM_2) {
            RString 保険料算定段階2 = entity.get保険料算定段階2().substring(NUM_0, NUM_2).trimStart(CHAR_0);
            if (!月割開始年月2.isEmpty() && !月割終了年月2.isEmpty() && !保険料算定段階2.isEmpty()) {
                set月別取得段階(source, 開始月2, 終了月2, 保険料算定段階2, 更正前後区分);
            }
        }
    }

    private void set月別取得段階(HonsanteiKekkaIcihiranReportSource source, int 開始月, int 終了月,
            RString 保険料算定段階, RString 更正前後区分) {
        for (int i = 開始月; i <= (開始月 > 終了月 ? (終了月 + NUM_12) : 終了月); i++) {
            int currentMonth = (i - 1) % NUM_12 + 1;
            if (更正前後区分_更正前.equals(更正前後区分)) {
                set更正前_保険料算定段階(source, currentMonth, 保険料算定段階);
            } else if (更正前後区分_更正後.equals(更正前後区分)) {
                set更正後_保険料算定段階(source, currentMonth, 保険料算定段階);
            }
        }
    }

    private void set更正前_保険料算定段階(HonsanteiKekkaIcihiranReportSource source,
            int currentMonth, RString 保険料算定段階) {
        switch (currentMonth) {
            case NUM_1:
                source.listCenter_9 = 保険料算定段階;
                break;
            case NUM_2:
                source.listCenter_10 = 保険料算定段階;
                break;
            case NUM_3:
                source.listCenter_11 = 保険料算定段階;
                break;
            case NUM_4:
                source.listCenter_12 = 保険料算定段階;
                break;
            case NUM_5:
                source.listCenter_13 = 保険料算定段階;
                break;
            case NUM_6:
                source.listCenter_14 = 保険料算定段階;
                break;
            case NUM_7:
                source.listCenter_15 = 保険料算定段階;
                break;
            case NUM_8:
                source.listCenter_16 = 保険料算定段階;
                break;
            case NUM_9:
                source.listCenter_17 = 保険料算定段階;
                break;
            case NUM_10:
                source.listCenter_18 = 保険料算定段階;
                break;
            case NUM_11:
                source.listCenter_19 = 保険料算定段階;
                break;
            case NUM_12:
                source.listCenter_20 = 保険料算定段階;
                break;
            default:
                break;
        }
    }

    private void set更正後_保険料算定段階(HonsanteiKekkaIcihiranReportSource source,
            int currentMonth, RString 保険料算定段階) {
        switch (currentMonth) {
            case NUM_1:
                source.listCenter_9 = 保険料算定段階;
                break;
            case NUM_2:
                source.listCenter_10 = 保険料算定段階;
                break;
            case NUM_3:
                source.listCenter_11 = 保険料算定段階;
                break;
            case NUM_4:
                source.listCenter_12 = 保険料算定段階;
                break;
            case NUM_5:
                source.listCenter_13 = 保険料算定段階;
                break;
            case NUM_6:
                source.listCenter_14 = 保険料算定段階;
                break;
            case NUM_7:
                source.listCenter_15 = 保険料算定段階;
                break;
            case NUM_8:
                source.listCenter_16 = 保険料算定段階;
                break;
            case NUM_9:
                source.listCenter_17 = 保険料算定段階;
                break;
            case NUM_10:
                source.listCenter_18 = 保険料算定段階;
                break;
            case NUM_11:
                source.listCenter_19 = 保険料算定段階;
                break;
            case NUM_12:
                source.listCenter_20 = 保険料算定段階;
                break;
            default:
                break;
        }
    }

}
