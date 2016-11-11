/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.batchprm.DBC040010;

import jp.co.ndensan.reams.db.dbc.definition.processprm.dbc040010.DBC040010ProcessParameter;
import jp.co.ndensan.reams.uz.uza.batch.BatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchParameterBase;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * 画面設計_DBCMN62006_自己負担額計算（一括）のクラスです。
 *
 * @reamsid_L DBC-2060-010 chenyadong
 */
@Setter
@Getter
@SuppressWarnings("PMD.UnusedPrivateField")
public class DBC040010_KogakuGassanJikofutangakuKeisanParameter extends BatchParameterBase {

    private static final String KEY_SHORITIMESTAMP = "shoriTimestamp";
    private static final String KEY_TAISHOKAISHIDAY = "taishoKaishiDay";
    private static final String KEY_TAISHOSHURYODAY = "taishoShuryoDay";
    private static final String KEY_SHUTURYOKUFLG = "shuturyokuFlg";
    private static final String KEY_SHUTSURYOKUJUNID = "shutsuryokujunId";
    private static final String KEY_DANTAICD = "dantaiCd";

    @BatchParameter(key = KEY_SHORITIMESTAMP, name = "処理日時")
    private RDateTime shoriTimestamp;
    @BatchParameter(key = KEY_TAISHOKAISHIDAY, name = "申請対象開始日")
    private FlexibleDate taishoKaishiDay;
    @BatchParameter(key = KEY_TAISHOSHURYODAY, name = "申請対象日終了日")
    private FlexibleDate taishoShuryoDay;
    @BatchParameter(key = KEY_SHUTURYOKUFLG, name = "出力フラグ")
    private boolean shuturyokuFlg;
    @BatchParameter(key = KEY_SHUTSURYOKUJUNID, name = "帳票出力順ID")
    private Long shutsuryokujunId;
    @BatchParameter(key = KEY_DANTAICD, name = "市町村コード")
    private LasdecCode dantaiCd;

    /**
     * toDBC020080ProcessParameter のメソッドです。
     *
     * @return DBC020080ProcessParameter
     */
    public DBC040010ProcessParameter toDBC040010ProcessParameter() {
        return new DBC040010ProcessParameter(
                shoriTimestamp, taishoKaishiDay, taishoShuryoDay, shuturyokuFlg, shutsuryokujunId, dantaiCd);
    }
}