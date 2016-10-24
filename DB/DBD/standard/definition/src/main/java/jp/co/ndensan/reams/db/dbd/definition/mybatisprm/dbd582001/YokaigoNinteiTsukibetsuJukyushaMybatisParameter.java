/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.definition.mybatisprm.dbd582001;

import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.shikibetsutaisho.IShikibetsuTaishoPSMSearchKey;
import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.shikibetsutaisho.UaFt200FindShikibetsuTaishoParam;
import jp.co.ndensan.reams.uz.uza.batch.parameter.IMyBatisParameter;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 要介護認定月別受給者数状況表（統計表）(バッチ)SQLのパラメータクラス
 *
 * @reamsid_L DBD-1771-033 donghj
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class YokaigoNinteiTsukibetsuJukyushaMybatisParameter implements IMyBatisParameter {

    private boolean is基準フラグ0;
    private boolean is基準フラグ1;
    private FlexibleDate 年齢基準日;
    private FlexibleDate 基準年月日04;
    private FlexibleDate 基準年月日05;
    private FlexibleDate 基準年月日06;
    private FlexibleDate 基準年月日07;
    private FlexibleDate 基準年月日08;
    private FlexibleDate 基準年月日09;
    private FlexibleDate 基準年月日10;
    private FlexibleDate 基準年月日11;
    private FlexibleDate 基準年月日12;
    private FlexibleDate 基準年月日01;
    private FlexibleDate 基準年月日02;
    private FlexibleDate 基準年月日03;
    private RString 基準年月04;
    private RString 基準年月05;
    private RString 基準年月06;
    private RString 基準年月07;
    private RString 基準年月08;
    private RString 基準年月09;
    private RString 基準年月10;
    private RString 基準年月11;
    private RString 基準年月12;
    private RString 基準年月01;
    private RString 基準年月02;
    private RString 基準年月03;
    private FlexibleDate 生年月日From;
    private FlexibleDate 生年月日To;
    private FlexibleDate 生年月日From2;
    private FlexibleDate 生年月日To2;
    private RString 地区区分;
    private Code 開始地区コード;
    private Code 終了地区コード;
    private RString 集計単位;
    private final UaFt200FindShikibetsuTaishoParam shikibetsutaishoParam;
    private boolean is住所;
    private boolean is行政区;
    private boolean is地区2;
    private boolean is受給申請事由;
    private boolean is申請区分申請時;
    private boolean is申請区分法令;
    private static final RString 地区区分住所 = new RString("JUSHO");
    private static final RString 地区区分行政区 = new RString("GYOSEIKU");
    private static final RString 地区区分地区２ = new RString("CHIKU2");
    private static final RString 集計単位申請事由 = new RString("ZIYU");
    private static final RString 集計単位申請時 = new RString("SHINSEIZI");
    private static final RString 集計単位法令 = new RString("HOUREI");

    /**
     * コンストラクタです。
     *
     * @param 基準フラグ 基準フラグ
     * @param 年齢基準日 年齢基準日
     * @param 基準年月日04 基準年月日04
     * @param 基準年月日05 基準年月日05
     * @param 基準年月日06 基準年月日06
     * @param 基準年月日07 基準年月日07
     * @param 基準年月日08 基準年月日08
     * @param 基準年月日09 基準年月日09
     * @param 基準年月日10 基準年月日10
     * @param 基準年月日11 基準年月日11
     * @param 基準年月日12 基準年月日12
     * @param 基準年月日01 基準年月日01
     * @param 基準年月日02 基準年月日02
     * @param 基準年月日03 基準年月日03
     * @param 基準年月04 基準年月04
     * @param 基準年月05 基準年月05
     * @param 基準年月06 基準年月06
     * @param 基準年月07 基準年月07
     * @param 基準年月08 基準年月08
     * @param 基準年月09 基準年月09
     * @param 基準年月10 基準年月10
     * @param 基準年月11 基準年月11
     * @param 基準年月12 基準年月12
     * @param 基準年月01 基準年月01
     * @param 基準年月02 基準年月02
     * @param 基準年月03 基準年月03
     * @param 生年月日From 生年月日From
     * @param 生年月日To 生年月日To
     * @param 地区区分 地区区分
     * @param 開始地区コード 開始地区コード
     * @param 終了地区コード 終了地区コード
     * @param 集計単位 集計単位
     * @param 年齢From 年齢From
     * @param 年齢To 年齢To
     * @param searchKey IShikibetsuTaishoPSMSearchKey
     */
    public YokaigoNinteiTsukibetsuJukyushaMybatisParameter(
            RString 基準フラグ,
            FlexibleDate 年齢基準日,
            FlexibleDate 基準年月日04,
            FlexibleDate 基準年月日05,
            FlexibleDate 基準年月日06,
            FlexibleDate 基準年月日07,
            FlexibleDate 基準年月日08,
            FlexibleDate 基準年月日09,
            FlexibleDate 基準年月日10,
            FlexibleDate 基準年月日11,
            FlexibleDate 基準年月日12,
            FlexibleDate 基準年月日01,
            FlexibleDate 基準年月日02,
            FlexibleDate 基準年月日03,
            RString 基準年月04,
            RString 基準年月05,
            RString 基準年月06,
            RString 基準年月07,
            RString 基準年月08,
            RString 基準年月09,
            RString 基準年月10,
            RString 基準年月11,
            RString 基準年月12,
            RString 基準年月01,
            RString 基準年月02,
            RString 基準年月03,
            FlexibleDate 生年月日From,
            FlexibleDate 生年月日To,
            RString 地区区分,
            Code 開始地区コード,
            Code 終了地区コード,
            RString 集計単位,
            int 年齢From,
            int 年齢To,
            IShikibetsuTaishoPSMSearchKey searchKey) {
        if (基準フラグ.equals(new RString("0"))) {
            this.is基準フラグ0 = true;
        } else if (基準フラグ.equals(new RString("1"))) {
            this.is基準フラグ1 = true;
        }
        this.基準年月日04 = 基準年月日04;
        this.基準年月日05 = 基準年月日05;
        this.基準年月日06 = 基準年月日06;
        this.基準年月日07 = 基準年月日07;
        this.基準年月日08 = 基準年月日08;
        this.基準年月日09 = 基準年月日09;
        this.基準年月日10 = 基準年月日10;
        this.基準年月日11 = 基準年月日11;
        this.基準年月日12 = 基準年月日12;
        this.基準年月日01 = 基準年月日01;
        this.基準年月日02 = 基準年月日02;
        this.基準年月日03 = 基準年月日03;
        this.基準年月04 = 基準年月04;
        this.基準年月05 = 基準年月05;
        this.基準年月06 = 基準年月06;
        this.基準年月07 = 基準年月07;
        this.基準年月08 = 基準年月08;
        this.基準年月09 = 基準年月09;
        this.基準年月10 = 基準年月10;
        this.基準年月11 = 基準年月11;
        this.基準年月12 = 基準年月12;
        this.基準年月01 = 基準年月01;
        this.基準年月02 = 基準年月02;
        this.基準年月03 = 基準年月03;
        this.生年月日From = 生年月日From;
        this.生年月日To = 生年月日To;
        if (年齢基準日 != null && !年齢基準日.isEmpty()) {
            this.年齢基準日 = 年齢基準日;
            this.生年月日From2 = 年齢基準日.minusYear(年齢To);
            this.生年月日To2 = 年齢基準日.minusYear(年齢From);
        }
        if (地区区分.equals(地区区分住所)) {
            this.is住所 = true;
        } else if (地区区分.equals(地区区分行政区)) {
            this.is行政区 = true;
        } else if (地区区分.equals(地区区分地区２)) {
            this.is地区2 = true;
        }
        this.開始地区コード = 開始地区コード;
        this.終了地区コード = 終了地区コード;
        if (集計単位.equals(集計単位申請事由)) {
            this.is受給申請事由 = true;
        } else if (集計単位.equals(集計単位申請時)) {
            this.is申請区分申請時 = true;
        } else if (集計単位.equals(集計単位法令)) {
            this.is申請区分法令 = true;
        }
        this.shikibetsutaishoParam = new UaFt200FindShikibetsuTaishoParam(searchKey);
    }
}
