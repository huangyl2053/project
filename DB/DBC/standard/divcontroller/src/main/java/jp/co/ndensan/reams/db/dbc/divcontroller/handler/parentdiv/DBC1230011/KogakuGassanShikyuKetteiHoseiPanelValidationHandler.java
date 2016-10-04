/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.divcontroller.handler.parentdiv.DBC1230011;

import jp.co.ndensan.reams.db.dbc.business.core.kogakugassanshikyuketteihosei.AuthorityItemResult;
import jp.co.ndensan.reams.db.dbc.definition.message.DbcErrorMessages;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC1230011.KogakuGassanShikyuKetteiHoseiPanelDiv;
import jp.co.ndensan.reams.db.dbc.service.core.kogakugassanshikyuketteihosei.KogakuGassanShikyuKetteiHosei;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.GyomuBunrui;
import jp.co.ndensan.reams.db.dbx.service.core.shichosonsecurityjoho.ShichosonSecurityJoho;
import jp.co.ndensan.reams.ur.urz.business.UrControlDataFactory;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringUtil;
import jp.co.ndensan.reams.uz.uza.message.IMessageGettable;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessage;
import jp.co.ndensan.reams.uz.uza.message.Message;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPair;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;

/**
 * 画面設計_DBCMN62004_DBCMNN1005_支給決定情報補正（単）(事業分兼)
 *
 * @reamsid_L DBC-2290-010 quxiaodong
 */
public class KogakuGassanShikyuKetteiHoseiPanelValidationHandler {

    private final KogakuGassanShikyuKetteiHoseiPanelDiv div;
    private static final int NUM_THREE = 3;
    private static final int NUM_SIX = 6;
    private static final int NUM_ELEVEN = 11;
    private static final int NUM_SEVENTEEN = 6;
    private static final RString ONE = new RString("1");
    private static final RString TWO = new RString("2");
    private static final RString 年度 = new RString("年度");
    private static final RString 対象年度 = new RString("対象年度");
    private static final RString 先頭3桁 = new RString("先頭3桁");
    private static final RString 先頭6桁目から11桁目 = new RString("先頭6桁目から11桁目");
    private static final RString 証記載保険者番号 = new RString("証記載保険者番号");
    private static final RString 連絡票整理番号 = new RString("連絡票整理番号");
    private static final RString 支給申請書整理番号 = new RString("連絡票整理番号(支給申請書整理番号)");
    private static final RString 指定された記載保険者番号 = new RString("指定された記載保険者番号");
    private static final RString 平成20年度以降の年度 = new RString("平成20年度以降の年度");
    private static final RDate 定値_年度年度 = new RDate("2008");
    private static final RString 定値導入形態コード1 = new RString("111");
    private static final RString 定値導入形態コード2 = new RString("112");
    private static final RString 定値導入形態コード3 = new RString("120");

    /**
     * 初期化
     *
     * @param div KogakuSabisuhiShikyuShinseiPanel
     */
    public KogakuGassanShikyuKetteiHoseiPanelValidationHandler(KogakuGassanShikyuKetteiHoseiPanelDiv div) {
        this.div = div;
    }

    /**
     * 新規登録_対象年度入力値チェックです。
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs check新規登録_対象年度() {
        ValidationMessageControlPairs validPairs = new ValidationMessageControlPairs();
        if (div.getShinkiPanel().getTxtShinkiTaishoNendo().getValue() != null
                && RStringUtil.isAlphabetAndHalfsizeNumberOnly(
                        div.getShinkiPanel().getTxtShinkiTaishoNendo().getValue().toDateString())) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.入力値が不正_追加メッセージあり, 年度.toString())));
            return validPairs;
        }
        if (div.getShinkiPanel().getTxtShinkiTaishoNendo().getValue() != null
                && div.getShinkiPanel().getTxtShinkiTaishoNendo().getValue().isBefore(定値_年度年度)) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.未指定, 平成20年度以降の年度.toString())));
        }
        return validPairs;
    }

    /**
     * 新規登録_証記載保険者番号入力値チェックです。
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs check新規登録_証記載保険者番号() {
        ValidationMessageControlPairs validPairs = new ValidationMessageControlPairs();
        if (div.getShinkiPanel().getTxtShinkiHihokenshaNo().getValue() != null
                && !div.getShinkiPanel().getTxtShinkiHihokenshaNo().getValue().isEmpty()
                && RStringUtil.isAlphabetAndHalfsizeNumberOnly(
                        div.getShinkiPanel().getTxtShinkiHihokenshaNo().getValue())) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.入力値が不正_追加メッセージあり, 証記載保険者番号.toString())));
            return validPairs;
        }
        if (div.getShinkiPanel().getTxtShinkiHihokenshaNo().getValue() != null
                && !div.getShinkiPanel().getTxtShinkiHihokenshaNo().getValue().isEmpty()
                && NUM_SIX != div.getShinkiPanel().getTxtShinkiHihokenshaNo().getValue().length()) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.入力値が不正_追加メッセージあり, 証記載保険者番号.toString())));
            return validPairs;
        }
        if (isCheck証記載保険者番号()) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.存在しない, 指定された記載保険者番号.toString())));
        }
        return validPairs;
    }

    /**
     * 新規登録_連絡票整理番号入力値チェックです。
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs check新規登録_連絡票整理番号() {
        ValidationMessageControlPairs validPairs = new ValidationMessageControlPairs();
        if (div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue() != null
                && !div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue().isEmpty()
                && RStringUtil.isAlphabetAndHalfsizeNumberOnly(
                        div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue())) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.入力値が不正_追加メッセージあり, 連絡票整理番号.toString())));
            return validPairs;
        }
        if (div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue() != null
                && !div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue().isEmpty()
                && NUM_SEVENTEEN != div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue().length()) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.入力値が不正_追加メッセージあり, 連絡票整理番号.toString())));
            return validPairs;
        }
        if (div.getShinkiPanel().getTxtShinkiTaishoNendo().getValue() != null
                && div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue() != null
                && !div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue().isEmpty()
                && !div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue().
                substring(0, NUM_THREE).equals(div.getShinkiPanel().
                        getTxtShinkiTaishoNendo().getValue().toDateString().substring(0, NUM_THREE))) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            DbcErrorMessages.支給申請書整理番号_不一致,
                            対象年度.toString(), 連絡票整理番号.toString(), 先頭3桁.toString())));
            return validPairs;
        }
        if (div.getShinkiPanel().getTxtShinkiHihokenshaNo().getValue() != null
                && !div.getShinkiPanel().getTxtShinkiHihokenshaNo().getValue().isEmpty()
                && div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue() != null
                && !div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue().isEmpty()
                && !div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue().
                substring(NUM_SIX, NUM_ELEVEN).equals(div.getShinkiPanel().
                        getTxtShinkiHihokenshaNo().getValue().substring(NUM_SIX, NUM_ELEVEN))) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            DbcErrorMessages.支給申請書整理番号_不一致,
                            証記載保険者番号.toString(), 連絡票整理番号.toString(), 先頭6桁目から11桁目.toString())));
            return validPairs;
        }
        return validPairs;
    }

    /**
     * 検索条件_対象年度入力値チェックです。
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs check検索条件_対象年度() {
        ValidationMessageControlPairs validPairs = new ValidationMessageControlPairs();
        if (div.getSearchPanel().getTxtKensakuTaishoNendo().getValue() != null
                && RStringUtil.isAlphabetAndHalfsizeNumberOnly(
                        div.getSearchPanel().getTxtKensakuTaishoNendo().getValue().toDateString())) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.入力値が不正_追加メッセージあり, 年度.toString())));
            return validPairs;
        }
        if (div.getSearchPanel().getTxtKensakuTaishoNendo().getValue() != null
                && div.getSearchPanel().getTxtKensakuTaishoNendo().getValue().isBefore(定値_年度年度)) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.未指定, 平成20年度以降の年度.toString())));
        }
        return validPairs;
    }

    /**
     * 検索条件_証記載保険者番号入力値チェックです。
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs check検索条件_証記載保険者番号() {
        ValidationMessageControlPairs validPairs = new ValidationMessageControlPairs();
        if (div.getSearchPanel().getTxtKensakuHihokenshaNo().getValue() != null
                && !div.getSearchPanel().getTxtKensakuHihokenshaNo().getValue().isEmpty()
                && RStringUtil.isAlphabetAndHalfsizeNumberOnly(
                        div.getSearchPanel().getTxtKensakuHihokenshaNo().getValue())) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.入力値が不正_追加メッセージあり, 証記載保険者番号.toString())));
            return validPairs;
        }
        if (div.getSearchPanel().getTxtKensakuHihokenshaNo().getValue() != null
                && !div.getSearchPanel().getTxtKensakuHihokenshaNo().getValue().isEmpty()
                && NUM_SIX != div.getSearchPanel().getTxtKensakuHihokenshaNo().getValue().length()) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.入力値が不正_追加メッセージあり, 証記載保険者番号.toString())));
            return validPairs;
        }
        if (isCheck証記載保険者番号()) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.存在しない, 指定された記載保険者番号.toString())));
        }
        return validPairs;
    }

    /**
     * 検索条件_連絡票整理番号入力値チェックです。
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs check検索条件_連絡票整理番号() {
        ValidationMessageControlPairs validPairs = new ValidationMessageControlPairs();
        if (div.getSearchPanel().getTxtKensakuShikyuSeiriNo().getValue() != null
                && !div.getSearchPanel().getTxtKensakuShikyuSeiriNo().getValue().isEmpty()
                && RStringUtil.isAlphabetAndHalfsizeNumberOnly(
                        div.getSearchPanel().getTxtKensakuShikyuSeiriNo().getValue())) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.入力値が不正_追加メッセージあり, 連絡票整理番号.toString())));
            return validPairs;
        }
        if (div.getSearchPanel().getTxtKensakuShikyuSeiriNo().getValue() != null
                && !div.getSearchPanel().getTxtKensakuShikyuSeiriNo().getValue().isEmpty()
                && NUM_SEVENTEEN != div.getSearchPanel().getTxtKensakuShikyuSeiriNo().getValue().length()) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.入力値が不正_追加メッセージあり, 連絡票整理番号.toString())));
            return validPairs;
        }
        if (div.getSearchPanel().getTxtKensakuTaishoNendo().getValue() != null
                && div.getSearchPanel().getTxtKensakuShikyuSeiriNo().getValue() != null
                && !div.getSearchPanel().getTxtKensakuShikyuSeiriNo().getValue().isEmpty()
                && !div.getSearchPanel().getTxtKensakuShikyuSeiriNo().getValue().
                substring(0, NUM_THREE).equals(div.getSearchPanel().getTxtKensakuTaishoNendo()
                        .getValue().toDateString().substring(0, NUM_THREE))) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            DbcErrorMessages.支給申請書整理番号_不一致,
                            対象年度.toString(), 連絡票整理番号.toString(), 先頭3桁.toString())));
            return validPairs;
        }
        if (div.getSearchPanel().getTxtKensakuHihokenshaNo().getValue() != null
                && !div.getSearchPanel().getTxtKensakuHihokenshaNo().getValue().isEmpty()
                && div.getSearchPanel().getTxtKensakuShikyuSeiriNo().getValue() != null
                && !div.getSearchPanel().getTxtKensakuShikyuSeiriNo().getValue().isEmpty()
                && !div.getSearchPanel().getTxtKensakuShikyuSeiriNo().getValue().
                substring(NUM_SIX, NUM_ELEVEN).equals(div.getSearchPanel().getTxtKensakuHihokenshaNo()
                        .getValue().substring(NUM_SIX, NUM_ELEVEN))) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            DbcErrorMessages.支給申請書整理番号_不一致,
                            証記載保険者番号.toString(), 連絡票整理番号.toString(), 先頭6桁目から11桁目.toString())));
            return validPairs;
        }
        return validPairs;
    }

    /**
     * 決定情報を追加する入力値チェックです。
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs check決定情報を追加する() {
        ValidationMessageControlPairs validPairs = new ValidationMessageControlPairs();
        if (div.getShinkiPanel().getTxtShinkiTaishoNendo().getValue() == null) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.必須, 対象年度.toString())));
        }
        if (div.getShinkiPanel().getTxtShinkiHihokenshaNo().getValue() == null
                || div.getShinkiPanel().getTxtShinkiHihokenshaNo().getValue().isEmpty()) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.必須, 証記載保険者番号.toString())));
        }
        if (div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue() == null
                || div.getShinkiPanel().getTxtShinkiShikyuSeiriNo().getValue().isEmpty()) {
            validPairs.add(new ValidationMessageControlPair(
                    new KogakuGassanShikyuKetteiHoseiPanelValidationHandler.IdocheckMessages(
                            UrErrorMessages.必須, 支給申請書整理番号.toString())));
        }
        return validPairs;
    }

    private boolean isCheck証記載保険者番号() {
        boolean flag = false;
        RString wk保険者構成 = RString.EMPTY;
        ShichosonSecurityJoho shseJoho = ShichosonSecurityJoho.getShichosonSecurityJoho(GyomuBunrui.介護事務);
        if (shseJoho != null && (定値導入形態コード2.equals(shseJoho.get導入形態コード().value())
                || 定値導入形態コード3.equals(shseJoho.get導入形態コード().value()))) {
            wk保険者構成 = ONE;
        } else if (shseJoho != null && 定値導入形態コード1.equals(shseJoho.get導入形態コード().value())) {
            wk保険者構成 = TWO;
        }
        RString ログインユーザID = UrControlDataFactory.createInstance().getLoginInfo().getUserId();
        AuthorityItemResult 市町村情報 = KogakuGassanShikyuKetteiHosei.createInstance().
                get市町村セキュリティ情報(ログインユーザID, wk保険者構成);
        if (ONE.equals(wk保険者構成)) {
            if (div.getShinkiPanel().getTxtShinkiHihokenshaNo().getValue() != null
                    && !div.getShinkiPanel().getTxtShinkiHihokenshaNo().getValue().
                    equals(市町村情報.getWk保険者番号().value())) {
                flag = true;
            }
        } else if (TWO.equals(wk保険者構成) && (市町村情報.getWk構成市町村情報() == null
                || 市町村情報.getWk構成市町村情報().isEmpty())) {
            flag = true;
        }
        return flag;
    }

    private static class IdocheckMessages implements IValidationMessage {

        private final Message message;

        public IdocheckMessages(IMessageGettable message, String... replacements) {
            this.message = message.getMessage().replace(replacements);
        }

        @Override
        public Message getMessage() {
            return message;
        }
    }

}