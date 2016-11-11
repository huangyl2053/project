/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.definition.mybatisprm.dbdbt00002;

import java.util.List;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.common.KyusochishaKubun;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.gemmen.niteishalist.HihokenshaKeizaiJokyo;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.gemmen.niteishalist.JukyushaKubun2;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.gemmen.niteishalist.SetaiHyoji;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.gemmen.niteishalist.TargetList;
import jp.co.ndensan.reams.db.dbd.definition.core.gemmengengaku.GemmenGengakuShuru;
import jp.co.ndensan.reams.db.dbd.definition.core.gemmengengaku.KetteiKubun;
import jp.co.ndensan.reams.db.dbz.definition.batchprm.gemmen.niteishalist.CSVSettings;
import jp.co.ndensan.reams.ua.uax.definition.mybatisprm.shikibetsutaisho.UaFt200FindShikibetsuTaishoParam;
import jp.co.ndensan.reams.uz.uza.batch.parameter.IMyBatisParameter;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * 帳票出力情報の取得のMyBatis用パラメータクラスです。
 *
 * @reamsid_L DBD-3880-050 x_youyj
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class NinteishaListSakuseiMybatisprmParameter implements IMyBatisParameter {

    private TargetList 対象リスト;
    private FlexibleDate 基準日;
    private RString 所得年度;
    private KyusochishaKubun 旧措置区分;
    private SetaiHyoji 世帯表示;
    private JukyushaKubun2 受給者区分;
    private List<HihokenshaKeizaiJokyo> 世帯非課税等;
    private CSVSettings 出力設定;
    private Long 改頁出力順ID;
    private RString 帳票ID;
    private RDateTime 帳票作成日時;
    private RString 出力順;
    private final UaFt200FindShikibetsuTaishoParam shikibetsutaishoParam;
    private boolean is認定者リスト = false;
    private boolean is該当者リスト = false;
    private boolean is世帯表示しない = false;
    private boolean is市町村民税非課税世帯 = false;
    private boolean is所得税非課税世帯 = false;
    private boolean is市町村民税本人非課税者 = false;
    private boolean is老齢福祉年金受給者 = false;
    private boolean is生活保護受給者 = false;
    private RString 利用者負担額減額;
    private RString 承認する;

    /**
     * 利用者負担額減免認定者リスト発行の引数を返します。
     *
     * @param 対象リスト 対象リスト
     * @param 基準日 基準日
     * @param 世帯表示 世帯表示
     * @param 世帯非課税等 世帯非課税等
     * @param shikibetsutaishoParam UaFt200FindShikibetsuTaishoParam
     * @param 出力順 出力順
     */
    public NinteishaListSakuseiMybatisprmParameter(
            TargetList 対象リスト, FlexibleDate 基準日, SetaiHyoji 世帯表示,
            List<HihokenshaKeizaiJokyo> 世帯非課税等, UaFt200FindShikibetsuTaishoParam shikibetsutaishoParam, RString 出力順) {
        edit対象リスト(対象リスト);
        if (世帯表示 != null) {
            edit世帯表示(世帯表示);
        }
        edit世帯非課税等(世帯非課税等);
        this.出力順 = 出力順;
        this.基準日 = 基準日;
        this.shikibetsutaishoParam = shikibetsutaishoParam;
        this.利用者負担額減額 = GemmenGengakuShuru.利用者負担額減額.getコード();
        this.承認する = KetteiKubun.承認する.getコード();
    }

    private void edit対象リスト(TargetList 対象リスト) {
        if (対象リスト != null) {
            if (TargetList.認定者リスト.equals(対象リスト)) {
                is認定者リスト = true;
            } else if (TargetList.該当者リスト.equals(対象リスト)) {
                is該当者リスト = true;
            }
        }
    }

    private void edit世帯表示(SetaiHyoji 世帯表示) {

        if (SetaiHyoji.表示しない.equals(世帯表示)) {
            is世帯表示しない = true;
        }
    }

    private void edit世帯非課税等(List<HihokenshaKeizaiJokyo> 世帯非課税等) {
        if (null != 世帯非課税等) {
            if (世帯非課税等.contains(HihokenshaKeizaiJokyo.市町村民税本人非課税者)) {
                is市町村民税本人非課税者 = true;
            }
            if (世帯非課税等.contains(HihokenshaKeizaiJokyo.市町村民税非課税世帯)) {
                is市町村民税非課税世帯 = true;
            }
            if (世帯非課税等.contains(HihokenshaKeizaiJokyo.所得税非課税世帯)) {
                is所得税非課税世帯 = true;
            }
            if (世帯非課税等.contains(HihokenshaKeizaiJokyo.老齢福祉年金受給者)) {
                is老齢福祉年金受給者 = true;
            }
            if (世帯非課税等.contains(HihokenshaKeizaiJokyo.生活保護受給者)) {
                is生活保護受給者 = true;
            }
        }
    }
}