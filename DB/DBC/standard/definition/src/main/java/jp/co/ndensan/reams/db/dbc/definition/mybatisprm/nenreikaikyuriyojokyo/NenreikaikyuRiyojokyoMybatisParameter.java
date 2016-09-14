/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.mybatisprm.nenreikaikyuriyojokyo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jp.co.ndensan.reams.ur.urz.definition.core.chiku.ChikuShubetsu;
import jp.co.ndensan.reams.uz.uza.batch.parameter.IMyBatisParameter;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;

/**
 *
 * 年齢階級別利用状況作成Mybatis用パラメータクラスです。
 *
 * @reamsid_L DBC-3470-030 xuyongchao
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@Getter
public class NenreikaikyuRiyojokyoMybatisParameter implements IMyBatisParameter {

    private static final Code CODE = new Code("000000");
    private static final RString 町域 = new RString("町域");
    private final FlexibleDate serviceTeikyoYM;
    private final FlexibleDate sinsaYM;
    private final FlexibleDate nenreiSansyutuKijyubi;
    private final RString sentakuTaisyoKubun;
    private final List<RString> sentakuTaisyoList;
    private final Code shichosonCode;
    private final RString shichosonMeisho;
    private final Code kyoShichosonCode;
    private final RString kyoShichosonMeisho;
    private final boolean teikyoYMFlag;
    private final boolean sinsaYMFlag;
    private final boolean shichosonFlag;
    private final boolean kyuShichosonFlag;
    private final boolean shichosonAndKyu;
    private final boolean tyouikiFlag;
    private final boolean gyoseikuFlag;
    private final boolean chikuCode1Flag;
    private final boolean chikuCode2Flag;
    private final boolean chikuCode3Flag;

    /**
     * コンストラクタです。
     *
     * @param serviceTeikyoYM サービス提供年月
     * @param sinsaYM 審査年月
     * @param nenreiSansyutuKijyubi 年齢算出基準日
     * @param sentakuTaisyoKubun 選択対象区分
     * @param sentakuTaisyoList 選択対象リスト
     * @param shichosonCode 市町村コード
     * @param shichosonMeisho 市町村名称
     * @param kyoShichosonCode 旧市町村コード
     * @param kyoShichosonMeisho 旧市町村名称
     * @param teikyoYMFlag teikyoYMFlag
     * @param sinsaYMFlag sinsaYMFlag
     * @param shichosonFlag shichosonFlag
     * @param kyuShichosonFlag kyuShichosonFlag
     * @param shichosonAndKyu shichosonAndKyu
     * @param tyouikiFlag tyouikiFlag
     * @param gyoseikuFlag gyoseikuFlag
     * @param chikuCode1Flag chikuCode1Flag
     * @param chikuCode2Flag chikuCode2Flag
     * @param chikuCode3Flag chikuCode3Flag
     */
    protected NenreikaikyuRiyojokyoMybatisParameter(FlexibleDate serviceTeikyoYM,
            FlexibleDate sinsaYM,
            FlexibleDate nenreiSansyutuKijyubi,
            RString sentakuTaisyoKubun,
            List<RString> sentakuTaisyoList,
            Code shichosonCode,
            RString shichosonMeisho,
            Code kyoShichosonCode,
            RString kyoShichosonMeisho,
            boolean teikyoYMFlag,
            boolean sinsaYMFlag,
            boolean shichosonFlag,
            boolean kyuShichosonFlag,
            boolean shichosonAndKyu,
            boolean tyouikiFlag,
            boolean gyoseikuFlag,
            boolean chikuCode1Flag,
            boolean chikuCode2Flag,
            boolean chikuCode3Flag) {
        this.serviceTeikyoYM = serviceTeikyoYM;
        this.sinsaYM = sinsaYM;
        this.nenreiSansyutuKijyubi = nenreiSansyutuKijyubi;
        this.sentakuTaisyoKubun = sentakuTaisyoKubun;
        this.sentakuTaisyoList = sentakuTaisyoList;
        this.shichosonCode = shichosonCode;
        this.shichosonMeisho = shichosonMeisho;
        this.kyoShichosonCode = kyoShichosonCode;
        this.kyoShichosonMeisho = kyoShichosonMeisho;
        this.teikyoYMFlag = teikyoYMFlag;
        this.sinsaYMFlag = sinsaYMFlag;
        this.shichosonFlag = shichosonFlag;
        this.kyuShichosonFlag = kyuShichosonFlag;
        this.shichosonAndKyu = shichosonAndKyu;
        this.tyouikiFlag = tyouikiFlag;
        this.gyoseikuFlag = gyoseikuFlag;
        this.chikuCode1Flag = chikuCode1Flag;
        this.chikuCode2Flag = chikuCode2Flag;
        this.chikuCode3Flag = chikuCode3Flag;
    }

    /**
     * @param serviceTeikyoYM サービス提供年月
     * @param sinsaYM 審査年月
     * @param nenreiSansyutuKijyubi 年齢算出基準日
     * @param sentakuTaisyoKubun 選択対象区分
     * @param sentakuTaisyoMap 選択対象Map
     * @param shichosonCode 市町村コード
     * @param shichosonMeisho 市町村名称
     * @param kyoShichosonCode 旧市町村コード
     * @param kyoShichosonMeisho 旧市町村名称
     * @return NenreikaikyuRiyojokyoMybatisParameter
     */
    public static NenreikaikyuRiyojokyoMybatisParameter createParam(FlexibleDate serviceTeikyoYM,
            FlexibleDate sinsaYM,
            FlexibleDate nenreiSansyutuKijyubi,
            RString sentakuTaisyoKubun,
            Map<RString, RString> sentakuTaisyoMap,
            Code shichosonCode,
            RString shichosonMeisho,
            Code kyoShichosonCode,
            RString kyoShichosonMeisho) {
        boolean teikyoYMFlag = false;
        boolean sinsaYMFlag = false;
        boolean shichosonFlag = false;
        boolean kyuShichosonFlag = false;
        boolean shichosonAndKyu = false;
        boolean tyouikiFlag = false;
        boolean gyoseikuFlag = false;
        boolean chikuCode1Flag = false;
        boolean chikuCode2Flag = false;
        boolean chikuCode3Flag = false;
        RString tmpSentakuTaisyo = RString.EMPTY;
        if (!serviceTeikyoYM.isEmpty()) {
            teikyoYMFlag = true;
        } else {
            sinsaYMFlag = true;
        }
        if (!kyoShichosonCode.isEmpty() && !CODE.equals(kyoShichosonCode)) {
            kyuShichosonFlag = true;
        } else {
            if (!shichosonCode.isEmpty() && !CODE.equals(shichosonCode)) {
                shichosonFlag = true;
            }
        }
        if (!sentakuTaisyoKubun.isNullOrEmpty()) {
            tmpSentakuTaisyo = new RString(sentakuTaisyoKubun.toString());
        }
        if (kyoShichosonCode.isEmpty() && shichosonCode.isEmpty()) {
            shichosonAndKyu = true;
            if (町域.equals(tmpSentakuTaisyo)) {
                tyouikiFlag = true;
            }
            if (ChikuShubetsu.行政区.toString().equals(tmpSentakuTaisyo.toString())) {
                gyoseikuFlag = true;
            }
            if (ChikuShubetsu.地区1.toString().equals(tmpSentakuTaisyo.toString())) {
                chikuCode1Flag = true;
            }
            if (ChikuShubetsu.地区2.toString().equals(tmpSentakuTaisyo.toString())) {
                chikuCode2Flag = true;
            }
            if (ChikuShubetsu.地区3.toString().equals(tmpSentakuTaisyo.toString())) {
                chikuCode3Flag = true;
            }
        }
        List<RString> sentakuTaisyoList = new ArrayList<>();
        for (RString code : sentakuTaisyoMap.keySet()) {
            sentakuTaisyoList.add(code);
        }
        return new NenreikaikyuRiyojokyoMybatisParameter(serviceTeikyoYM,
                sinsaYM,
                nenreiSansyutuKijyubi,
                sentakuTaisyoKubun,
                sentakuTaisyoList,
                shichosonCode,
                shichosonMeisho,
                kyoShichosonCode,
                kyoShichosonMeisho,
                teikyoYMFlag,
                sinsaYMFlag,
                shichosonFlag,
                kyuShichosonFlag,
                shichosonAndKyu,
                tyouikiFlag,
                gyoseikuFlag,
                chikuCode1Flag,
                chikuCode2Flag,
                chikuCode3Flag);
    }

}
