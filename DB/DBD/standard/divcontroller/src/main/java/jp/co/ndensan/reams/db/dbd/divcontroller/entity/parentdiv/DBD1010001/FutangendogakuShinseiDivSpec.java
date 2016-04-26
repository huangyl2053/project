/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.divcontroller.entity.parentdiv.DBD1010001;

import java.util.ArrayList;
import jp.co.ndensan.reams.db.dbd.business.core.gemmengengaku.futangendogakunintei.FutanGendogakuNinteiViewState;
import jp.co.ndensan.reams.db.dbd.service.core.gemmengengaku.futangendogakunintei.FutangendogakuNinteiService;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBU;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.viewstate.ViewStateKeys;
import jp.co.ndensan.reams.db.dbx.service.core.dbbusinessconfig.DbBusinessConifg;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.core.validation.IPredicate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ViewStateHolder;

/**
 *
 * @author liangbc
 */
public enum FutangendogakuShinseiDivSpec implements IPredicate<FutangendogakuShinseiDiv> {

    受給共通_被保データなし {
                /**
                 * 受給共通_被保データなしチェックです。
                 *
                 * @param div TaishouWaritsukeDiv
                 * @return true:被保データありの場合です、false:被保データなしの場合です。
                 */
                @Override
                public boolean apply(FutangendogakuShinseiDiv div) {
                    return FutangendogakuNinteiService.createInstance().canBe利用者(
                            new HihokenshaNo(div.getHihokenshaNo()), div.getTxtTekiyoYMD().getValue());
                }
            },
    受給共通_受給者登録なし {
                /**
                 * 受給共通_受給者登録なしチェックです。
                 *
                 * @param div TaishouWaritsukeDiv
                 * @return true:受給者登録ありの場合です、false:受給者登録なしの場合です。
                 */
                @Override
                public boolean apply(FutangendogakuShinseiDiv div) {
                    return FutangendogakuNinteiService.createInstance().canBe利用者(
                            new HihokenshaNo(div.getHihokenshaNo()), div.getTxtTekiyoYMD().getValue());
                }
            },
    負担限度額認定_適用開始日が法施行以前 {
                /**
                 * 負担限度額認定_適用開始日が法施行以前チェックです。
                 *
                 * @param div TaishouWaritsukeDiv
                 * @return true:負担限度額認定_適用開始日が法施行以後の場合です、false:負担限度額認定_適用開始日が法施行以前の場合です。
                 */
                @Override
                public boolean apply(FutangendogakuShinseiDiv div) {
                    FlexibleDate 法施行日 = new FlexibleDate(DbBusinessConifg.get(ConfigNameDBU.介護保険法情報_介護保険施行日, RDate.getNowDate(), SubGyomuCode.DBD介護受給));
                    FlexibleDate 適用開始日 = div.getTxtTekiyoYMD().getValue();
                    return 法施行日.isBefore(適用開始日);
                }
            },
    負担限度額認定_適用終了日が年度外 {
                /**
                 * 負担限度額認定_適用終了日が年度外チェックです。
                 *
                 * @param div TaishouWaritsukeDiv
                 * @return true:負担限度額認定_適用終了日が年度内の場合です、false:負担限度額認定_適用終了日が年度外の場合です。
                 */
                @Override
                public boolean apply(FutangendogakuShinseiDiv div) {
                    FlexibleDate date = FutangendogakuNinteiService.createInstance().estimate有効期限(div.getTxtTekiyoYMD().getValue());
                    return div.getTxtYukoKigenYMD().getValue().isBefore(date);
                }
            },
    負担限度額認定_適用終了日が開始日以前 {
                /**
                 * 負担限度額認定_適用終了日が開始日以前チェックです。
                 *
                 * @param div TaishouWaritsukeDiv
                 * @return true:負担限度額認定_適用終了日が開始日以後です、false:負担限度額認定_適用終了日が開始日以前です。
                 */
                @Override
                public boolean apply(FutangendogakuShinseiDiv div) {
                    return div.getTxtTekiyoYMD().getValue().isBefore(div.getTxtYukoKigenYMD().getValue());
                }
            },
    減免減額_適用期間重複 {
                /**
                 * 減免減額_適用期間重複チェックです。
                 *
                 * @param div TaishouWaritsukeDiv
                 * @return true:減免減額_適用期間重複しない、false:減免減額_適用期間重複します。
                 */
                @Override
                public boolean apply(FutangendogakuShinseiDiv div) {
                    ArrayList<FutanGendogakuNinteiViewState> list = ViewStateHolder.get(ViewStateKeys.new負担限度額認定申請の情報, ArrayList.class);
                    if (list == null || list.isEmpty()) {
                        return true;
                    }
                    FlexibleDate 適用日１;
                    FlexibleDate 適用日２;
                    FlexibleDate 有効期限１;
                    FlexibleDate 有効期限２;
                    FutanGendogakuNinteiViewState joho１;
                    FutanGendogakuNinteiViewState joho２;
                    for (int i = 0, size = list.size(); i < size - 1; i++) {
                        joho１ = list.get(i);
                        適用日１ = joho１.getFutanGendogakuNintei().get適用開始年月日();
                        有効期限１ = joho１.getFutanGendogakuNintei().get適用終了年月日();
                        if (適用日１ == null || 適用日１.isEmpty() || 有効期限１ == null || 有効期限１.isEmpty()) {
                            continue;
                        }
                        for (int j = i + 1; j < size; j++) {
                            joho２ = list.get(j);
                            適用日２ = joho２.getFutanGendogakuNintei().get適用開始年月日();
                            有効期限２ = joho２.getFutanGendogakuNintei().get適用終了年月日();
                            if (適用日２ == null || 適用日２.isEmpty() || 有効期限２ == null || 有効期限２.isEmpty()) {
                                continue;
                            }
                            if (適用日２.isBeforeOrEquals(適用日１) && 有効期限１.isBeforeOrEquals(有効期限２)
                            || 適用日１.isBeforeOrEquals(適用日２) && 有効期限２.isBeforeOrEquals(有効期限１)
                            || 適用日１.isBeforeOrEquals(有効期限２)
                            || 有効期限１.isBeforeOrEquals(適用日２)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }

            };

}
