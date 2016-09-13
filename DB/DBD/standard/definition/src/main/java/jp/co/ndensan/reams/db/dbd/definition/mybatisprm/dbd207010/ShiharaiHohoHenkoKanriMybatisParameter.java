/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.definition.mybatisprm.dbd207010;

import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBD;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.uz.uza.batch.parameter.IMyBatisParameter;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * 支払方法変更管理リストSQL使用されたパラメタークラスです．
 *
 * @reamsid_L DBD-3650-040 x_lilh
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@Getter
@Setter
public class ShiharaiHohoHenkoKanriMybatisParameter implements IMyBatisParameter {

    private static final RString 選択_0 = new RString("0");
    private static final RString 選択_1 = new RString("1");
    private static final RString 選択_2 = new RString("2");
    private static final RString 選択_3 = new RString("3");
    private static final RString 選択_4 = new RString("4");
    private static final RString 選択_5 = new RString("5");
    private static final RString 選択_6 = new RString("6");

    private FlexibleDate 基準日;
    private RDate 基準日RDate;
    private RString 出力順;
    private int 業務コンフィグ_支払方法変更_支払一時差止期限;
    private int 業務コンフィグ_支払方法変更_支払方法変更期限;
    private FlexibleDate 業務コンフィグ_日付関連_調定年度;

    private boolean is登録者選択_0;
    private boolean is登録者選択_1;
    private boolean is登録者選択_2;
    private boolean is登録者選択_3;
    private boolean is登録者選択_4;
    private boolean is登録者選択_5;
    private boolean is登録者選択_6;

    private boolean is２号差止予告登録者の選択_0;
    private boolean is２号差止予告登録者の選択_1;
    private boolean is２号差止予告登録者の選択_2;
    private boolean is２号差止予告登録者の選択_3;
    private boolean is２号差止予告登録者の選択_4;

    private boolean is２号差止登録者の選択_0;
    private boolean is２号差止登録者の選択_1;
    private boolean is２号差止登録者の選択_2;
    private boolean is２号差止登録者の選択_3;

    private boolean is１号償還予告登録者の選択_0;
    private boolean is１号償還予告登録者の選択_1;
    private boolean is１号償還予告登録者の選択_2;
    private boolean is１号償還予告登録者の選択_3;
    private boolean is１号償還予告登録者の選択_4;

    private boolean is１号償還決定登録者の選択_0;
    private boolean is１号償還決定登録者の選択_1;
    private boolean is１号償還決定登録者の選択_2;
    private boolean is１号償還決定登録者の選択_3;
    private boolean is１号償還決定登録者の選択_4;

    private boolean is１号償還決定登録者_差止中あり者のみの選択_0;
    private boolean is１号償還決定登録者_差止中あり者のみの選択_1;
    private boolean is１号償還決定登録者_差止中あり者のみの選択_2;

    private boolean is１号償還決定登録者_保険料控除あり者のみの選択_0;
    private boolean is１号償還決定登録者_保険料控除あり者のみの選択_1;
    private boolean is１号償還決定登録者_保険料控除あり者のみの選択_2;

    /**
     * コンストラクタです。
     *
     * @param 基準日 基準日
     * @param 登録者選択 登録者選択
     * @param 差止予告登録者２号の選択 差止予告登録者２号の選択
     * @param 差止登録者２号の選択 差止登録者２号の選択
     * @param 償還予告登録者１号の選択 償還予告登録者１号の選択
     * @param 償還決定登録者１号の選択 償還決定登録者１号の選択
     * @param 償還決定登録者１号_差止中あり者のみの選択 償還決定登録者１号_差止中あり者のみの選択
     * @param 償還決定登録者１号_保険料控除あり者のみの選択 償還決定登録者１号_保険料控除あり者のみの選択
     * @param 出力順 出力順
     */
    public ShiharaiHohoHenkoKanriMybatisParameter(FlexibleDate 基準日,
            RString 登録者選択,
            RString 差止予告登録者２号の選択,
            RString 差止登録者２号の選択,
            RString 償還予告登録者１号の選択,
            RString 償還決定登録者１号の選択,
            RString 償還決定登録者１号_差止中あり者のみの選択,
            RString 償還決定登録者１号_保険料控除あり者のみの選択,
            RString 出力順) {
        this.基準日 = 基準日;
        this.出力順 = 出力順;
        set基準日について(基準日);
        set登録者選択について(登録者選択);
        set差止予告登録者２号の選択について(差止予告登録者２号の選択);
        set差止登録者２号の選択について(差止登録者２号の選択);
        set償還予告登録者１号の選択について(償還予告登録者１号の選択);
        set償還決定登録者１号の選択について(償還決定登録者１号の選択);
        set償還決定登録者１号_差止中あり者のみの選択について(償還決定登録者１号_差止中あり者のみの選択);
        set償還決定登録者１号_保険料控除あり者のみの選択について(償還決定登録者１号_保険料控除あり者のみの選択);
        set業務コンフィグ_支払方法変更_支払一時差止期限();
        set業務コンフィグ_支払方法変更_支払方法変更期限();
    }

    private void set基準日について(FlexibleDate 基準日) {
        if (基準日 != null && !FlexibleDate.EMPTY.equals(基準日)) {
            基準日RDate = new RDate(基準日.toString());
        }
    }

    private void set登録者選択について(RString 登録者選択) {
        if (選択_0.equals(登録者選択)) {
            is登録者選択_0 = true;
        } else if (選択_1.equals(登録者選択)) {
            is登録者選択_1 = true;
        } else if (選択_2.equals(登録者選択)) {
            is登録者選択_2 = true;
        } else if (選択_3.equals(登録者選択)) {
            is登録者選択_3 = true;
        } else if (選択_4.equals(登録者選択)) {
            is登録者選択_4 = true;
        } else if (選択_5.equals(登録者選択)) {
            is登録者選択_5 = true;
        } else if (選択_6.equals(登録者選択)) {
            is登録者選択_6 = true;
        }
    }

    private void set差止予告登録者２号の選択について(RString 差止予告登録者２号の選択) {
        if (選択_0.equals(差止予告登録者２号の選択)) {
            is２号差止予告登録者の選択_0 = true;
        } else if (選択_1.equals(差止予告登録者２号の選択)) {
            is２号差止予告登録者の選択_1 = true;
        } else if (選択_2.equals(差止予告登録者２号の選択)) {
            is２号差止予告登録者の選択_2 = true;
        } else if (選択_3.equals(差止予告登録者２号の選択)) {
            is２号差止予告登録者の選択_3 = true;
        } else if (選択_4.equals(差止予告登録者２号の選択)) {
            is２号差止予告登録者の選択_4 = true;
        }
    }

    private void set差止登録者２号の選択について(RString 差止登録者２号の選択) {
        if (選択_0.equals(差止登録者２号の選択)) {
            is２号差止登録者の選択_0 = true;
        } else if (選択_1.equals(差止登録者２号の選択)) {
            is２号差止登録者の選択_1 = true;
        } else if (選択_2.equals(差止登録者２号の選択)) {
            is２号差止登録者の選択_2 = true;
        } else if (選択_3.equals(差止登録者２号の選択)) {
            is２号差止登録者の選択_3 = true;
        }
    }

    private void set償還予告登録者１号の選択について(RString 償還予告登録者１号の選択) {
        if (選択_0.equals(償還予告登録者１号の選択)) {
            is１号償還予告登録者の選択_0 = true;
        } else if (選択_1.equals(償還予告登録者１号の選択)) {
            is１号償還予告登録者の選択_1 = true;
        } else if (選択_2.equals(償還予告登録者１号の選択)) {
            is１号償還予告登録者の選択_2 = true;
        } else if (選択_3.equals(償還予告登録者１号の選択)) {
            is１号償還予告登録者の選択_3 = true;
        } else if (選択_4.equals(償還予告登録者１号の選択)) {
            is１号償還予告登録者の選択_4 = true;
        }
    }

    private void set償還決定登録者１号の選択について(RString 償還決定登録者１号の選択) {
        if (選択_0.equals(償還決定登録者１号の選択)) {
            is１号償還決定登録者の選択_0 = true;
        } else if (選択_1.equals(償還決定登録者１号の選択)) {
            is１号償還決定登録者の選択_1 = true;
        } else if (選択_2.equals(償還決定登録者１号の選択)) {
            is１号償還決定登録者の選択_2 = true;
        } else if (選択_3.equals(償還決定登録者１号の選択)) {
            is１号償還決定登録者の選択_3 = true;
        } else if (選択_4.equals(償還決定登録者１号の選択)) {
            is１号償還決定登録者の選択_4 = true;
        }
    }

    private void set償還決定登録者１号_差止中あり者のみの選択について(RString 償還決定登録者１号_差止中あり者のみの選択) {
        if (選択_0.equals(償還決定登録者１号_差止中あり者のみの選択)) {
            is１号償還決定登録者_差止中あり者のみの選択_0 = true;
        } else if (選択_1.equals(償還決定登録者１号_差止中あり者のみの選択)) {
            is１号償還決定登録者_差止中あり者のみの選択_1 = true;
        } else if (選択_2.equals(償還決定登録者１号_差止中あり者のみの選択)) {
            is１号償還決定登録者_差止中あり者のみの選択_2 = true;
        }
    }

    private void set償還決定登録者１号_保険料控除あり者のみの選択について(RString 償還決定登録者１号_保険料控除あり者のみの選択) {
        if (選択_0.equals(償還決定登録者１号_保険料控除あり者のみの選択)) {
            is１号償還決定登録者_保険料控除あり者のみの選択_0 = true;
        } else if (選択_1.equals(償還決定登録者１号_保険料控除あり者のみの選択)) {
            is１号償還決定登録者_保険料控除あり者のみの選択_1 = true;
        } else if (選択_2.equals(償還決定登録者１号_保険料控除あり者のみの選択)) {
            is１号償還決定登録者_保険料控除あり者のみの選択_2 = true;
        }
    }

    private void set業務コンフィグ_支払方法変更_支払一時差止期限() {
        RString configValue = DbBusinessConfig.get(ConfigNameDBD.支払方法変更_支払一時差止期限, RDate.getNowDate(), SubGyomuCode.DBD介護受給);
        業務コンフィグ_支払方法変更_支払一時差止期限 = Integer.parseInt(configValue.toString());
    }

    private void set業務コンフィグ_支払方法変更_支払方法変更期限() {
        RString configValue = DbBusinessConfig.get(ConfigNameDBD.支払方法変更_支払方法変更期限, RDate.getNowDate(), SubGyomuCode.DBD介護受給);
        業務コンフィグ_支払方法変更_支払方法変更期限 = Integer.parseInt(configValue.toString());
    }
}