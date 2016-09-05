/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.entity.db.relate.tokuchokarisanteifukamanager;

import java.io.Serializable;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT2001ChoshuHohoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1001HihokenshaDaichoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT7006RoreiFukushiNenkinJukyushaEntity;
import jp.co.ndensan.reams.ur.urd.entity.db.basic.seikatsuhogo.UrT0508SeikatsuHogoJukyushaEntity;
import jp.co.ndensan.reams.ur.urd.entity.db.basic.seikatsuhogo.UrT0526SeikatsuHogoFujoShuruiEntity;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 資格等最新化（４月開始）entity
 *
 * @reamsid_L DBB-0700-020 xuhao
 */
@lombok.Getter
@lombok.Setter
public class SikakuSaisinnsikiRelateEntity implements Serializable {

    private FlexibleDate 生保開始日;
    private FlexibleDate 生保廃止日;
    private FlexibleDate 老年開始日;
    private FlexibleDate 老年廃止日;
    private RString 世帯課税区分;
    private RString 課税区分;
    private Decimal 合計所得金額;
    private Decimal 公的年金収入額;
    private FukaJohoTempEntity 賦課情報一時Entity;
//    private DbT2003KibetsuEntity 介護期別Entity;
//    private UrT0705ChoteiKyotsuEntity 調定共通Entity;
//    private FukaJohoRelateEntity 賦課の情報;
    private DbT2001ChoshuHohoEntity 徴収方法の情報;
    private DbT1001HihokenshaDaichoEntity 資格の情報;
    private UrT0508SeikatsuHogoJukyushaEntity 生活保護受給者Entity;
    private UrT0526SeikatsuHogoFujoShuruiEntity 生活保護扶助種類Entity;
//    private List<SeikatsuHogoJukyushaRelateEntity> 生保の情報;
    private DbT7006RoreiFukushiNenkinJukyushaEntity 老齢の情報;

}
