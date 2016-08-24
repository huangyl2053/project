/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.definition.processprm.dbd4030011;

import jp.co.ndensan.reams.uz.uza.batch.parameter.IBatchProcessParameter;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * 障がい者控除対象者認定書リスト バッチProcess用パラメータクラスです。
 *
 * @reamsid_L DBD-3860-030 donghj
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class ShogaishakojoTaishoshaListProcessParameter implements IBatchProcessParameter {

    private FlexibleYear 対象年度;
    private RString 被保険者番号;
    private RString 氏名;
    private RString 認定区分;
    private RString 認定内容;
    private RString 認知症高齢者の日常生活自立度;
    private RString 障害高齢者の日常生活自立度;
    private RString 障がい者手帳;
    private RString 喪失事由;
    private FlexibleDate 喪失日FROM;
    private FlexibleDate 喪失日TO;
    private FlexibleDate 決定日FROM;
    private FlexibleDate 決定日TO;
    private RString 前回非該当者;
    private RDate 交付日;
    private RString 出力順;

    /**
     *
     * @param 対象年度 対象年度
     * @param 被保険者番号 被保険者番号
     * @param 氏名 氏名
     * @param 認定区分 認定区分
     * @param 認定内容 認定内容
     * @param 認知症高齢者の日常生活自立度 認知症高齢者の日常生活自立度
     * @param 障害高齢者の日常生活自立度 障害高齢者の日常生活自立度
     * @param 障がい者手帳 障がい者手帳
     * @param 喪失事由 喪失事由
     * @param 喪失日FROM 喪失日FROM
     * @param 喪失日TO 喪失日TO
     * @param 決定日FROM 決定日FROM
     * @param 決定日TO 決定日TO
     * @param 前回非該当者 前回非該当者
     * @param 交付日 交付日
     * @param 出力順 出力順
     */
    public ShogaishakojoTaishoshaListProcessParameter(FlexibleYear 対象年度, RString 被保険者番号, RString 氏名, RString 認定区分,
            RString 認定内容, RString 認知症高齢者の日常生活自立度, RString 障害高齢者の日常生活自立度, RString 障がい者手帳,
            RString 喪失事由, FlexibleDate 喪失日FROM, FlexibleDate 喪失日TO, FlexibleDate 決定日FROM, FlexibleDate 決定日TO,
            RString 前回非該当者, RDate 交付日, RString 出力順) {
        this.対象年度 = 対象年度;
        this.被保険者番号 = 被保険者番号;
        this.氏名 = 氏名;
        this.認定区分 = 認定区分;
        this.認定内容 = 認定内容;
        this.認知症高齢者の日常生活自立度 = 認知症高齢者の日常生活自立度;
        this.障害高齢者の日常生活自立度 = 障害高齢者の日常生活自立度;
        this.障がい者手帳 = 障がい者手帳;
        this.喪失事由 = 喪失事由;
        this.喪失日FROM = 喪失日FROM;
        this.喪失日TO = 喪失日TO;
        this.決定日FROM = 決定日FROM;
        this.決定日TO = 決定日TO;
        this.前回非該当者 = 前回非該当者;
        this.交付日 = 交付日;
        this.出力順 = 出力順;
    }

}
