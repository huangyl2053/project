/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.business.report.dbd200019;

import java.util.List;
import jp.co.ndensan.reams.db.dbd.definition.core.gemmengengaku.KetteiKubun;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.FutangakuNinteiHakkoIchiran.FutangakuNinteiHakkoIchiranEntity;
import jp.co.ndensan.reams.db.dbd.entity.report.dbd200019.FutangakuNinteiHakkoIchiranReportSource;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IOutputOrder;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.ISetSortItem;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RTime;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.ui.binding.propertyenum.DisplayTimeFormat;

/**
 * 負担額認定証・決定通知書発行一覧表Editorです。
 *
 * @reamsid_L DBD-3981-060 b_liuyang2
 */
public class FutangakuNinteiHakkoIchiranEditor implements IFutangakuNinteiHakkoIchiranEditor {

    private final List<FutangakuNinteiHakkoIchiranEntity> 帳票情報リスト;
    private final Association association;
    private final IOutputOrder iOutputOrder;
    private final int index;

    /**
     * インスタンスを生成します。
     *
     * @param 帳票情報リスト List<FutangakuNinteiHakkoIchiranEntity>
     * @param association Association
     * @param iOutputOrder IOutputOrder
     * @param index int
     */
    public FutangakuNinteiHakkoIchiranEditor(List<FutangakuNinteiHakkoIchiranEntity> 帳票情報リスト,
            Association association, IOutputOrder iOutputOrder, int index) {
        this.帳票情報リスト = 帳票情報リスト;
        this.association = association;
        this.iOutputOrder = iOutputOrder;
        this.index = index;
    }

    @Override
    public FutangakuNinteiHakkoIchiranReportSource edit(FutangakuNinteiHakkoIchiranReportSource source) {
        setLayer1(source);
        setAccessLogEditor(source);
        return source;
    }

    private void setLayer1(FutangakuNinteiHakkoIchiranReportSource source) {
        source.printTimeStamp = get印刷日時();
        source.title = new RString("負担限度額認定証・決定通知書発行一覧表");
        source.hokenshaNo = this.association.get地方公共団体コード().value();
        source.hokenshaName = this.association.get市町村名();
        List<ISetSortItem> 設定項目リスト = this.iOutputOrder.get設定項目リスト();
        source.shutsuryokujun1 = 設定項目リスト.get(0).get項目名();
        source.shutsuryokujun2 = 設定項目リスト.get(1).get項目名();
        source.shutsuryokujun3 = 設定項目リスト.get(2).get項目名();
        source.shutsuryokujun4 = 設定項目リスト.get(3).get項目名();
        source.shutsuryokujun5 = 設定項目リスト.get(4).get項目名();
        if (設定項目リスト.get(0).is改頁項目()) {
            source.kaipage1 = 設定項目リスト.get(0).get項目名();
        }
        if (設定項目リスト.get(1).is改頁項目()) {
            source.kaipage2 = 設定項目リスト.get(1).get項目名();
        }
        if (設定項目リスト.get(2).is改頁項目()) {
            source.kaipage3 = 設定項目リスト.get(2).get項目名();
        }
        if (設定項目リスト.get(3).is改頁項目()) {
            source.kaipage4 = 設定項目リスト.get(3).get項目名();
        }
        if (設定項目リスト.get(4).is改頁項目()) {
            source.kaipage5 = 設定項目リスト.get(4).get項目名();
        }
        source.list_1 = new RString(String.valueOf(index + 1));
        FutangakuNinteiHakkoIchiranEntity 帳票情報 = this.帳票情報リスト.get(index);
        FlexibleDate 喪失年月日 = 帳票情報.get喪失年月日();
        if (null != 喪失年月日 && !喪失年月日.isEmpty()) {
            source.list_2 = new RString("*");
        } else {
            source.list_2 = RString.EMPTY;
        }
        source.list_3 = 帳票情報.get被保険者番号().getColumnValue();
        //TODO個人情報に、被保険者氏名がない
//        source.list_4 = 帳票情報.get個人情報().get被保険者氏名();
        source.list_5 = 帳票情報.get個人情報().get住所().get住所();
        source.list_6 = 帳票情報.get申請日().wareki().toDateString();
        source.list_7 = 帳票情報.get決定日().wareki().toDateString();
        source.list_8 = get適用日有効期限();
        if (帳票情報.get決定().equals(KetteiKubun.承認する)) {
            source.list_9 = new RString("承認");
        } else if (帳票情報.get決定().equals(KetteiKubun.承認しない)) {
            source.list_9 = new RString("却下");
        }
        if (帳票情報.get決定().equals(KetteiKubun.承認する)) {
            source.list_10 = 帳票情報.get負担段階();
        } else if (帳票情報.get決定().equals(KetteiKubun.承認しない)) {
            source.list_10 = RString.EMPTY;
        }
        if (帳票情報.is認定証発行フラグ() && 帳票情報.is認定証発行済み()) {
            source.list_11 = new RString("○");
        }
        if (帳票情報.is認定証発行フラグ() && !帳票情報.is認定証発行済み()) {
            source.list_11 = new RString("却下");
        }
        if (!帳票情報.is認定証発行フラグ()) {
            source.list_11 = RString.EMPTY;
        }
        if (帳票情報.is通知書発行フラグ()) {
            source.list_12 = new RString("○");
        } else {
            source.list_12 = RString.EMPTY;
        }
        source.list_13 = 帳票情報.get入所施設CD();

    }

    private void setAccessLogEditor(FutangakuNinteiHakkoIchiranReportSource source) {
        FutangakuNinteiHakkoIchiranEntity 帳票情報 = this.帳票情報リスト.get(index);
        source.shikibetsuCode = 帳票情報.get個人情報().get識別コード().getColumnValue();
    }

    private RString get印刷日時() {
        FlexibleDate システム日 = FlexibleDate.getNowDate();
        RTime システム日時 = RTime.now();
        RString 年月日 = システム日.wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN).
                separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
        RString 時分秒 = システム日時.toFormattedTimeString(DisplayTimeFormat.HH時mm分ss秒);
        RString 印刷日時 = 年月日.concat("").concat(時分秒).concat("").concat("作成");
        return 印刷日時;
    }

    private RString get適用日有効期限() {
        FutangakuNinteiHakkoIchiranEntity 帳票情報 = this.帳票情報リスト.get(index);
        RString 適用日 = 帳票情報.get適用日().wareki().toDateString();
        RString 有効期限 = 帳票情報.get有効期限().wareki().toDateString();
        RString 適用日有効期限 = 適用日.concat(new RString("~")).concat(有効期限);
        return 適用日有効期限;
    }
}
