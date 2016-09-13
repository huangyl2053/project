/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.tokkia4;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.TokkiText1A4Business;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.tokkitexta4.TokkiA4Entity;
import jp.co.ndensan.reams.db.dbe.entity.report.source.tokkia4.TokkiText2A4ReportSource;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.TokkijikoTextImageKubun;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FillTypeFormatted;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.log.accesslog.core.ExpandedInformation;

/**
 * 特記事項2枚目以降（A4版）のEditorです。
 *
 * @reamsid_L DBE-0150-350 wangrenze
 */
public class TokkiText2A4Editor implements ITokkiText2A4Editor {

    private final TokkiText1A4Business item;
    private static final RString 全面 = new RString("1");
    private static final RString 短冊 = new RString("2");
    private final int index;
    private static final int INT_3 = 3;
    private static final int INT_4 = 4;
    private static final int INT_5 = 5;
    private static final int INT_6 = 6;
    private static final int INT_7 = 7;
    private static final int INT_8 = 8;
    private static final int INT_9 = 9;
    private static final int INT_10 = 10;
    private static final int INT_11 = 11;
    private static final int INT_12 = 12;
    private static final int INT_13 = 13;
    private static final int INT_14 = 14;
    private final List<TokkiA4Entity> 短冊情報リスト;

    /**
     * インスタンスを生成します。
     *
     * @param item TokkiText1A4Business
     * @param index Index
     * @param 短冊情報リスト List<TokkiA4Entity>
     */
    protected TokkiText2A4Editor(TokkiText1A4Business item, List<TokkiA4Entity> 短冊情報リスト, int index) {
        this.item = item;
        this.index = index;
        this.短冊情報リスト = 短冊情報リスト;
    }

    @Override
    public TokkiText2A4ReportSource edit(TokkiText2A4ReportSource source) {
        if (item.is委員用()) {
            source.hokenshaNo = RString.EMPTY;
            source.hihokenshaNo = RString.EMPTY;
            source.hihokenshaName = RString.EMPTY;
        } else {
            source.hokenshaNo = item.get保険者番号();
            source.hihokenshaNo = item.get被保険者番号();
            source.hihokenshaName = item.get名前();
        }

        source.sakuseiGengo = get元号(item.get認定申請年月日());
        source.sakuseiYY = get年(item.get認定申請年月日()).replace(get元号(item.get認定申請年月日()),
                RString.EMPTY).replace(new RString("年"), RString.EMPTY);
        source.sakuseiMM = new RString(item.get認定申請年月日().getMonthValue());
        source.sakuseiDD = new RString(item.get認定申請年月日().getDayValue());
        FlexibleDate システム日付 = FlexibleDate.getNowDate();
        source.chosaGengo = get元号(システム日付);
        source.chosaYY = get年(システム日付).replace(get元号(システム日付), RString.EMPTY)
                .replace(new RString("年"), RString.EMPTY);
        source.chosaMM = new RString(システム日付.getMonthValue());
        source.chosaDD = new RString(システム日付.getDayValue());
        source.shinseiGengo = get元号(item.get認定調査実施年月日());
        source.shinseiYY = get年(item.get認定調査実施年月日());
        source.shinseiMM = new RString(item.get認定調査実施年月日().getMonthValue());
        source.shinseiDD = new RString(item.get認定調査実施年月日().getDayValue());
        source.shinsaGengo = get元号(item.get介護認定審査会開催年月日());
        source.shinsaYY = get年(item.get介護認定審査会開催年月日()).replace(get元号(item.get介護認定審査会開催年月日()),
                RString.EMPTY).replace(new RString("年"), RString.EMPTY);
        source.shinsaMM = new RString(item.get介護認定審査会開催年月日().getMonthValue());
        source.shinsaDD = new RString(item.get介護認定審査会開催年月日().getDayValue());
        List<RString> 特記事項List = getBodyList();
        if (TokkijikoTextImageKubun.テキスト.getコード().equals(item.get特記事項テキスト_イメージ区分())) {
            if (全面.equals(item.get特記パターン())) {
                source.tokkiText = item.getTokkiText();
            } else if (短冊.equals(item.get特記パターン())) {
                editテキスト(source, 特記事項List);
                set特記事項テキスト(source);
            }
        } else if (TokkijikoTextImageKubun.イメージ.getコード().equals(item.get特記事項テキスト_イメージ区分())) {
            if (全面.equals(item.get特記パターン())) {
                source.tokkiImg = item.getTokkiImg();
            } else if (短冊.equals(item.get特記パターン())) {
                editイメージ(source, 特記事項List);
                set特記事項イメージ(source);
            }
        }

        source.shikibetuCode = ShikibetsuCode.EMPTY;

        if (!RString.isNullOrEmpty(item.get申請書管理番号())) {
            source.hishokenshaNo = new ExpandedInformation(new Code("0001"), new RString("申請書管理番号"),
                    item.get申請書管理番号());
        }

        return source;
    }

    private TokkiText2A4ReportSource set特記事項テキスト(TokkiText2A4ReportSource source) {
        for (int i = 0; i < 短冊情報リスト.size(); i++) {
            if (i == 0) {
                source.tokkiText1 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == 1) {
                source.tokkiText2 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == 2) {
                source.tokkiText3 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_3) {
                source.tokkiText4 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_4) {
                source.tokkiText5 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_5) {
                source.tokkiText6 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_6) {
                source.tokkiText7 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_7) {
                source.tokkiText8 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_8) {
                source.tokkiText9 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_9) {
                source.tokkiText10 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_10) {
                source.tokkiText11 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_11) {
                source.tokkiText12 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_12) {
                source.tokkiText13 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_13) {
                source.tokkiText14 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_14) {
                source.tokkiText15 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            }

        }
        return source;
    }

    private TokkiText2A4ReportSource set特記事項イメージ(TokkiText2A4ReportSource source) {
        for (int i = 0; i < 短冊情報リスト.size(); i++) {
            if (i == 0) {
                source.tokkiImg1 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == 1) {
                source.tokkiImg2 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == 2) {
                source.tokkiImg3 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_3) {
                source.tokkiImg4 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_4) {
                source.tokkiImg5 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_5) {
                source.tokkiImg6 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_6) {
                source.tokkiImg7 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_7) {
                source.tokkiImg8 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_8) {
                source.tokkiImg9 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_9) {
                source.tokkiImg10 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_10) {
                source.tokkiImg11 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_11) {
                source.tokkiImg12 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_12) {
                source.tokkiImg13 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_13) {
                source.tokkiImg14 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            } else if (i == INT_14) {
                source.tokkiImg15 = 短冊情報リスト.get(i).get特記事項テキスト_イメージ();
            }

        }
        return source;
    }

    private void editテキスト(TokkiText2A4ReportSource source, List<RString> 特記事項List) {
        if (index < 特記事項List.size()) {
            source.listChosa1_1 = 特記事項List.get(index);
        }

    }

    private void editイメージ(TokkiText2A4ReportSource source, List<RString> 特記事項List) {
        if (index < 特記事項List.size()) {
            source.listChosa_1 = 特記事項List.get(index);
        }
    }

    private List<RString> getBodyList() {
        List<RString> bodyList = new ArrayList<>();
        if (!短冊情報リスト.isEmpty()) {
            for (TokkiA4Entity tokkiTextEntity : 短冊情報リスト) {
                bodyList.add(tokkiTextEntity.get事項番号());
                bodyList.add(tokkiTextEntity.get項目名称());
            }
        }
        return bodyList;
    }

    private RString get元号(FlexibleDate 年月日) {

        return パターン12(年月日).getEra();
    }

    private RString get年(FlexibleDate 年月日) {

        return パターン12(年月日).getYear();
    }

    private FillTypeFormatted パターン12(FlexibleDate 年月日) {

        return 年月日.wareki().eraType(EraType.KANJI)
                .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE)
                .fillType(FillType.BLANK);
    }
}