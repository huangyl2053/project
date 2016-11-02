/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.core.hokenryodankai.fukakonkyo;

import java.util.List;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.fuka.SetaiShotokuEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.fuka.KazeiKubun;
import jp.co.ndensan.reams.db.dbz.business.core.basic.RoreiFukushiNenkinJukyusha;
import jp.co.ndensan.reams.db.dbz.business.core.hihokensha.seikatsuhogojukyusha.SeikatsuHogoJukyusha;
import jp.co.ndensan.reams.db.dbz.definition.core.shotoku.SetaiKazeiKubun;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;

/**
 * 賦課根拠作成（バッチ）用パラメータのクラスです。
 *
 * @reamsid_L DBB-9040-150 cuilin
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class FukaKonkyoBatchParameter {

    private FlexibleDate 賦課基準日;
    private List<SeikatsuHogoJukyusha> 生保の情報リスト;
    private List<RoreiFukushiNenkinJukyusha> 老齢の情報のリスト;
    private List<SetaiShotokuEntity> 世帯員所得情報List;
    private KazeiKubun 前年度課税区分;
    private SetaiKazeiKubun 前年度世帯課税区分;
}
