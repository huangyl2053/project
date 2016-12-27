/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.report.tokkijiko;

import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.core.shiryoshinsakai.TokkiJiko;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.tokkitexta4.TokkiA4Entity;
import jp.co.ndensan.reams.db.dbe.entity.report.source.tokkijiko.TokkiJikoReportSource;
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
 * 特記事項帳票の2頁目以降のReportEditorクラスです。
 */
public class TokkiJikoReport2Editor implements ITokkiJikoReportEditor {

    private static final int 短冊行数 = 15;
    private final TokkiJiko item;
    private final int pageIndex;

    /**
     * コンストラクタです。
     *
     * @param item {@link TokkiJiko}
     * @param pageIndex ページ数 - 1
     */
    public TokkiJikoReport2Editor(TokkiJiko item, int pageIndex) {
        this.item = item;
        this.pageIndex = pageIndex;
    }

    @Override
    public TokkiJikoReportSource edit(TokkiJikoReportSource source) {
        if (item.is委員用()) {
            source.two_hokenshaNo = RString.EMPTY;
            source.two_hihokenshaNo = RString.EMPTY;
            source.two_hihokenshaName = RString.EMPTY;
        } else {
            source.two_hokenshaNo = item.get保険者番号();
            source.two_hihokenshaNo = item.get被保険者番号();
            source.two_hihokenshaName = item.get名前();
        }

        source.two_sakuseiGengo = get元号(item.get認定申請年月日());
        source.two_sakuseiYY = get年(item.get認定申請年月日()).replace(get元号(item.get認定申請年月日()),
                RString.EMPTY).replace(new RString("年"), RString.EMPTY);
        source.two_sakuseiMM = new RString(item.get認定申請年月日().getMonthValue());
        source.two_sakuseiDD = new RString(item.get認定申請年月日().getDayValue());
        FlexibleDate システム日付 = FlexibleDate.getNowDate();
        source.two_chosaGengo = get元号(システム日付);
        source.two_chosaYY = get年(システム日付).replace(get元号(システム日付), RString.EMPTY)
                .replace(new RString("年"), RString.EMPTY);
        source.two_chosaMM = new RString(システム日付.getMonthValue());
        source.two_chosaDD = new RString(システム日付.getDayValue());
        source.two_shinseiGengo = get元号(item.get認定調査実施年月日());
        source.two_shinseiYY = get年(item.get認定調査実施年月日()).replace(get元号(item.get認定調査実施年月日()),
                RString.EMPTY).replace(new RString("年"), RString.EMPTY);
        source.two_shinseiMM = new RString(item.get認定調査実施年月日().getMonthValue());
        source.two_shinseiDD = new RString(item.get認定調査実施年月日().getDayValue());
        source.two_shinsaGengo = get元号(item.get介護認定審査会開催年月日());
        source.two_shinsaYY = get年(item.get介護認定審査会開催年月日()).replace(get元号(item.get介護認定審査会開催年月日()),
                RString.EMPTY).replace(new RString("年"), RString.EMPTY);
        source.two_shinsaMM = new RString(item.get介護認定審査会開催年月日().getMonthValue());
        source.two_shinsaDD = new RString(item.get介護認定審査会開催年月日().getDayValue());
        set特記事項短冊テキスト(source);
        set特記事項全面イメージ(source);
        set特記事項短冊イメージ(source);
        if (!item.is委員用()) {
            source.shikibetuCode = RString.isNullOrEmpty(item.get識別コード()) ? ShikibetsuCode.EMPTY : new ShikibetsuCode(item.get識別コード());
            if (!RString.isNullOrEmpty(item.get申請書管理番号())) {
                source.hishokenshaNo = new ExpandedInformation(new Code("0001"), new RString("申請書管理番号"),
                        item.get申請書管理番号());
            }
        }
        return source;
    }

    private void set特記事項短冊テキスト(TokkiJikoReportSource source) {
        int index = 短冊行数 * pageIndex;
        List<TokkiA4Entity> 短冊テキストリスト = item.get短冊テキストリスト();
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText1 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText2 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText3 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText4 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText5 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText6 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText7 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText8 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText9 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText10 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText11 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText12 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText13 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText14 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊テキストリスト.size()) {
            source.two_tokkiText15 = 短冊テキストリスト.get(index).get特記事項テキスト_イメージ();
        }
    }

    private void set特記事項全面イメージ(TokkiJikoReportSource source) {
        if (pageIndex < item.get全画面イメージリスト().size()) {
            source.two_tokkiImg = item.get全画面イメージリスト().get(pageIndex);
        }
    }

    private void set特記事項短冊イメージ(TokkiJikoReportSource source) {
        int index = 短冊行数 * pageIndex;
        List<TokkiA4Entity> 短冊イメージリスト = item.get短冊イメージリスト();
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg1 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg2 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg3 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg4 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg5 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg6 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg7 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg8 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg9 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg10 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg11 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg12 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg13 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg14 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
        index++;
        if (index < 短冊イメージリスト.size()) {
            source.two_tokkiImg15 = 短冊イメージリスト.get(index).get特記事項テキスト_イメージ();
        }
    }

    private RString get元号(FlexibleDate 年月日) {
        return get和暦(年月日).getEra();
    }

    private RString get年(FlexibleDate 年月日) {
        return get和暦(年月日).getYear();
    }

    private FillTypeFormatted get和暦(FlexibleDate 年月日) {
        return 年月日.wareki().eraType(EraType.KANJI)
                .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE)
                .fillType(FillType.BLANK);
    }

}
