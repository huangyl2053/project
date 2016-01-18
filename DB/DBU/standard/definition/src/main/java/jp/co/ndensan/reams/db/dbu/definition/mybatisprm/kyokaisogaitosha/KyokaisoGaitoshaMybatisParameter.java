/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.definition.mybatisprm.kyokaisogaitosha;

import jp.co.ndensan.reams.uz.uza.batch.parameter.IMyBatisParameter;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * 境界層管理マスタリストのMyBatisパラメータ
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class KyokaisoGaitoshaMybatisParameter implements IMyBatisParameter {

    private final RString mode;
    private final RString range;
    private final FlexibleDate date_FROM;
    private final FlexibleDate date_TO;
    private final RString iskyuufugakuFlag;
    private final RString ishyojunFutanFlag;
    private final RString iskyojuhinadoFutangFlag;
    private final RString isshokuhiKeiFlag;
    private final RString iskogakuFlag;
    private final RString ishokenFlag;
    private final RString order_ID;
    private final boolean ismodekjunhe;
    private final boolean ismoderange;
    private final boolean ismodenayi;
    private final boolean isRangeApplication;
    private final boolean isRangeStart;
    private final boolean isRangeEnd;
    private final boolean isDateFlag;
    private final boolean isDate_TOFlag;
    private final RString psmShikibetsuTaisho;

    /**
     * コンストラクタ。
     *
     * @param mode 取得モード
     * @param range 境界層対象抽出範囲
     * @param date_FROM 日付FROM
     * @param date_TO 日付TO
     * @param iskyuufugakuFlag 給付額減額解除該当区分フラグ
     * @param ishyojunFutanFlag 標準負担額減額該当区分フラグ
     * @param iskyojuhinadoFutangFlag 特定介護居住費等負担額減額該当区分フラグ
     * @param isshokuhiKeiFlag 特定介護食費負担額減額該当区分フラグ
     * @param iskogakuFlag 高額サービス費該当区分フラグ
     * @param ishokenFlag 納付減額該当区分フラグ
     * @param order_ID 出力順ID
     * @param ismodekjunhe 基準日
     * @param ismoderange 範囲
     * @param ismodenayi 指定無し
     * @param isRangeApplication 境界層該当申請日
     * @param isRangeStart 境界層該当開始日
     * @param isRangeEnd 境界層該当終了日
     * @param isDateFlag 日付FROMNULL
     * @param isDate_TOFlag 日付ToNULL
     * @param psmShikibetsuTaisho 宛名情報取得
     */
    public KyokaisoGaitoshaMybatisParameter(RString mode,
            RString range,
            FlexibleDate date_FROM,
            FlexibleDate date_TO,
            RString iskyuufugakuFlag,
            RString ishyojunFutanFlag,
            RString iskyojuhinadoFutangFlag,
            RString isshokuhiKeiFlag,
            RString iskogakuFlag,
            RString ishokenFlag,
            RString order_ID,
            boolean ismodekjunhe,
            boolean ismoderange,
            boolean ismodenayi,
            boolean isRangeApplication,
            boolean isRangeStart,
            boolean isRangeEnd,
            boolean isDateFlag,
            boolean isDate_TOFlag,
            RString psmShikibetsuTaisho) {
        this.date_FROM = date_FROM;
        this.date_TO = date_TO;
        this.iskyuufugakuFlag = iskyuufugakuFlag;
        this.range = range;
        this.ishyojunFutanFlag = ishyojunFutanFlag;
        this.iskyojuhinadoFutangFlag = iskyojuhinadoFutangFlag;
        this.isshokuhiKeiFlag = isshokuhiKeiFlag;
        this.iskogakuFlag = iskogakuFlag;
        this.mode = mode;
        this.order_ID = order_ID;
        this.ishokenFlag = ishokenFlag;
        this.ismodekjunhe = ismodekjunhe;
        this.ismoderange = ismoderange;
        this.ismodenayi = ismodenayi;
        this.isRangeApplication = isRangeApplication;
        this.isRangeStart = isRangeStart;
        this.isRangeEnd = isRangeEnd;
        this.isDateFlag = isDateFlag;
        this.isDate_TOFlag = isDate_TOFlag;
        this.psmShikibetsuTaisho = psmShikibetsuTaisho;
    }

    /**
     * mybatisのパラメータを生成します。
     *
     * @param mode 取得モード
     * @param range 境界層対象抽出範囲
     * @param date_FROM 日付FROM
     * @param date_TO 日付TO
     * @param iskyuufugakuFlag 給付額減額解除該当区分フラグ
     * @param ishyojunFutanFlag 標準負担額減額該当区分フラグ
     * @param iskyojuhinadoFutangFlag 特定介護居住費等負担額減額該当区分フラグ
     * @param isshokuhiKeiFlag 特定介護食費負担額減額該当区分フラグ
     * @param iskogakuFlag 高額サービス費該当区分フラグ
     * @param ishokenFlag 納付減額該当区分フラグ
     * @param order_ID 出力順ID
     * @param ismodekjunhe 基準日
     * @param ismoderange 範囲
     * @param ismodenayi 指定無し
     * @param isRangeApplication 境界層該当申請日
     * @param isRangeStart　境界層該当開始日
     * @param isRangeEnd　境界層該当終了日
     * @param isDateFlag　日付FROMNULL
     * @param isDate_TOFlag　日付ToNULL
     * @param psmShikibetsuTaisho 宛名情報取得
     * @return mybatisパラメータ
     */
    public static KyokaisoGaitoshaMybatisParameter createParam(RString mode,
            RString range,
            FlexibleDate date_FROM,
            FlexibleDate date_TO,
            RString iskyuufugakuFlag,
            RString ishyojunFutanFlag,
            RString iskyojuhinadoFutangFlag,
            RString isshokuhiKeiFlag,
            RString iskogakuFlag,
            RString ishokenFlag,
            RString order_ID,
            boolean ismodekjunhe,
            boolean ismoderange,
            boolean ismodenayi,
            boolean isRangeApplication,
            boolean isRangeStart,
            boolean isRangeEnd,
            boolean isDateFlag,
            boolean isDate_TOFlag,
            RString psmShikibetsuTaisho) {

        if (new RString("1").equals(mode)) {
            ismodekjunhe = true;
        }
        if (new RString("2").equals(mode)) {
            ismoderange = true;
        }
        if (new RString("3").equals(mode)) {
            ismodenayi = true;
        }
        if (new RString("1").equals(range)) {
            isRangeApplication = true;
        }
        if (new RString("2").equals(range)) {
            isRangeStart = true;
        }
        if (new RString("3").equals(range)) {
            isRangeEnd = true;
        }
        if (date_FROM == null || date_FROM.isEmpty()) {
            isDateFlag = true;
        }
        if (date_TO == null || date_TO.isEmpty()) {
            isDate_TOFlag = true;
        }
        return new KyokaisoGaitoshaMybatisParameter(mode,
                range,
                date_FROM,
                date_TO,
                iskyuufugakuFlag,
                ishyojunFutanFlag,
                iskyojuhinadoFutangFlag,
                isshokuhiKeiFlag,
                iskogakuFlag,
                ishokenFlag,
                order_ID,
                ismodekjunhe,
                ismoderange,
                ismodenayi,
                isRangeApplication,
                isRangeStart,
                isRangeEnd,
                isDateFlag,
                isDate_TOFlag,
                psmShikibetsuTaisho);

    }
}
