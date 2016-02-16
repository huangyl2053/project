/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.divcontroller.handler.parentdiv.DBE2400001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.core.iraisho.IraishoIkkatsuHakkoResult;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE2400001.IraishoIkkatsuHakkoDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE2400001.dgNinteiChosaIraiTaishoIchiran_Row;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE2400001.dgShujiiIkenshoSakuseiIraiTaishoIchiran_Row;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.ui.servlets.CommonButtonHolder;

/**
 *
 * 依頼書一括発行の抽象Handlerクラスです。
 */
public class IraishoIkkatsuHakkoHandler {

    private static final RString STATE_NINTEIO = new RString("1");
    private static final RString STATE_SHUJII = new RString("2");
    private static final RString COMMON_SELECTED = new RString("key0");
    private static final RString CHOHYO_CHECKED = new RString("key1");
    private static final RString SHUTSU_CHECKED = new RString("key2");
    private static final RString SHINSEI_KASAN = new RString("2");
    private final IraishoIkkatsuHakkoDiv div;

    /**
     * コンストラクタです。
     *
     * @param div 依頼書一括発行Div
     */
    public IraishoIkkatsuHakkoHandler(IraishoIkkatsuHakkoDiv div) {
        this.div = div;
    }

    /**
     *
     * 依頼書一括発行初期化の設定します。
     *
     * @param ninteiShinsei 認定調査期限設定方法
     */
    public void load(RString ninteiShinsei) {
        div.getRadTaishoSentaku().setSelectedKey(COMMON_SELECTED);
        div.getDgNinteiChosaIraiTaishoIchiran().init();
        div.getTxtIraibiFrom().clearValue();
        div.getTxtIraibiTo().clearValue();
        List<RString> selectKeys = new ArrayList<>();
        selectKeys.add(COMMON_SELECTED);
        div.getChkNinteioChosaIraisho().setSelectedItemsByKey(selectKeys);
        div.getCcdNinteiChosaHokensha().loadHokenshaList();
        div.getChkNinteiChosahyo().setSelectedItemsByKey(selectKeys);
        setNinteiChkShinseiTani(true);
        div.getChkNinteiChosaIraiChohyo().setSelectedItemsByKey(Collections.<RString>emptyList());
        div.getChkchosairaihakko().setSelectedItemsByKey(Collections.<RString>emptyList());
        setHakkobiAndTeishutsuKigen(ninteiShinsei);
        div.setState(STATE_NINTEIO);
        CommonButtonHolder.setVisibleByCommonButtonFieldName(new RString("btnBatchNintei"), false);
        CommonButtonHolder.setVisibleByCommonButtonFieldName(new RString("btnBatchSakusei"), false);
        CommonButtonHolder.setVisibleByCommonButtonFieldName(new RString("btnBatchTeishutu"), false);
        CommonButtonHolder.setVisibleByCommonButtonFieldName(new RString("btnBatchHoumon"), false);
    }

    /**
     *
     * 主治医意見書Divの設定します。
     *
     * @param ninteiShinsei 認定調査期限設定方法
     */
    public void shuziiiKenshoLoad(RString ninteiShinsei) {
        div.getDgShujiiIkenshoSakuseiIraiTaishoIchiran().init();
        div.getTxtShujiiIkenshoSakuseiIraibiFrom().clearValue();
        div.getTxtShujiiIkenshoSakuseiIraibiTo().clearValue();
        List<RString> selectKeys = new ArrayList<>();
        selectKeys.add(COMMON_SELECTED);
        div.getChkShujiiikenshoSakuseiIrai().setSelectedItemsByKey(selectKeys);
        div.getCcdShujiiIkenshoHokensha().loadHokenshaList();
        div.getChkShujiiIkensho().setSelectedItemsByKey(selectKeys);
        setShujiiChkShinseiTani(true);
        div.getChkShujiiIkenshoShutsuryoku().setSelectedItemsByKey(Collections.<RString>emptyList());
        div.getChkikenshiiraihakko().setSelectedItemsByKey(Collections.<RString>emptyList());
        setHakkobiAndTeishutsuKigen(ninteiShinsei);
        div.setState(STATE_SHUJII);
        CommonButtonHolder.setVisibleByCommonButtonFieldName(new RString("btnBatchNintei"), false);
        CommonButtonHolder.setVisibleByCommonButtonFieldName(new RString("btnBatchSakusei"), false);
        CommonButtonHolder.setVisibleByCommonButtonFieldName(new RString("btnBatchTeishutu"), false);
        CommonButtonHolder.setVisibleByCommonButtonFieldName(new RString("btnBatchHoumon"), false);
    }

    /**
     * 対象調査員一覧Gridを設定します。
     *
     * @param resultList 対象調査員一覧データ
     */
    public void setDataGrid(List<IraishoIkkatsuHakkoResult> resultList) {
        if (STATE_NINTEIO.equals(div.getState())) {
            List<dgNinteiChosaIraiTaishoIchiran_Row> rowList = new ArrayList<>();
            for (IraishoIkkatsuHakkoResult result : resultList) {
                dgNinteiChosaIraiTaishoIchiran_Row row = new dgNinteiChosaIraiTaishoIchiran_Row();
                row.setNinteiChosaitakusaki(result.get認定調査委託先コード() == null
                        ? RString.EMPTY : result.get認定調査委託先コード().value());
                row.setNinteiChosaItakusakiMeisho(result.get事業者名称());
                row.setNinteiChosainNo(result.get認定調査員コード());
                row.setNinteiChosainShimei(result.get調査員氏名());
                row.getShinseishaNinzu().setValue(new Decimal(result.get申請者人数()));
                rowList.add(row);
            }
            div.getDgNinteiChosaIraiTaishoIchiran().setDataSource(rowList);
        }
        if (STATE_SHUJII.equals(div.getState())) {
            List<dgShujiiIkenshoSakuseiIraiTaishoIchiran_Row> rowList = new ArrayList<>();
            for (IraishoIkkatsuHakkoResult result : resultList) {
                dgShujiiIkenshoSakuseiIraiTaishoIchiran_Row row = new dgShujiiIkenshoSakuseiIraiTaishoIchiran_Row();
                row.setShujiiIryoKikanCode(result.get主治医医療機関コード());
                row.setShujiiIryoKikanMeisho(result.get医療機関名称());
                row.setIshiNo(result.get主治医コード());
                row.setIshiShimei(result.get主治医氏名() == null ? RString.EMPTY : result.get主治医氏名().value());
                row.getShinseishaNinzu().setValue(new Decimal(result.get申請者人数()));
                rowList.add(row);
            }
            div.getDgShujiiIkenshoSakuseiIraiTaishoIchiran().setDataSource(rowList);
        }
    }

    /**
     * 申請単位チェックボックス選択の場合、ある他のチェックボックスを設定します。
     */
    public void setChkShinseiTani() {
        if (STATE_NINTEIO.equals(div.getState())) {
            if (div.getChkNinteiChosaIraiChohyo().getSelectedKeys().contains(CHOHYO_CHECKED)) {
                setNinteiChkShinseiTani(false);
            } else {
                setNinteiChkShinseiTani(true);
            }
        }
        if (div.getState().equals(div.getState())) {
            if (div.getChkShujiiIkenshoShutsuryoku().getSelectedKeys().contains(SHUTSU_CHECKED)) {
                setShujiiChkShinseiTani(false);
            } else {
                setShujiiChkShinseiTani(true);
            }
        }
    }

    /**
     * 共通日付txtの使用可否などを設定します。
     */
    public void setTxtKyotsuHizuke() {
        if (SHUTSU_CHECKED.equals(div.getRadTeishutsuKigen().getSelectedKey())) {
            div.getTxtKyotsuHizuke().setReadOnly(false);
        } else {
            div.getTxtKyotsuHizuke().setReadOnly(true);
        }
    }

    private void setShujiiChkShinseiTani(boolean flag) {
        div.getChkShujiiIkenshoSakuseiIraisho().setDisabled(flag);
        div.getChkShujiIkenshoKinyuAndSakuseiryoSeikyu().setDisabled(flag);
        div.getChkShindanMeireishoAndTeishutsuIraisho().setDisabled(flag);
    }

    private void setNinteiChkShinseiTani(boolean flag) {
        div.getChkNinteiChosaIraisho().setDisabled(flag);
        div.getChkNinteiChosahyoShurui().setDisabled(flag);
        div.getChkNinteiChosahyoOcrShurui().setDisabled(flag);
        div.getChkNinteiChosahyoSonota().setDisabled(flag);
    }

    private void setHakkobiAndTeishutsuKigen(RString ninteiShinsei) {
        div.getTxtHakkobi().setValue(RDate.getNowDate());
        if (SHINSEI_KASAN.equals(ninteiShinsei)) {
            div.getRadTeishutsuKigen().setDisabled(true);
        }
        div.getTxtKyotsuHizuke().setValue(RDate.getNowDate());
    }
}
