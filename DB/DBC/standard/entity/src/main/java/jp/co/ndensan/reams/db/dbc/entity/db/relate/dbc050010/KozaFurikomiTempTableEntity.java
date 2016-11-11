/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc050010;

import java.util.UUID;
import jp.co.ndensan.reams.uz.uza.biz.AtenaKanaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.EdabanCode;
import jp.co.ndensan.reams.uz.uza.biz.KamokuCode;
import jp.co.ndensan.reams.uz.uza.biz.KinyuKikanCode;
import jp.co.ndensan.reams.uz.uza.biz.KinyuKikanShitenCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;
import jp.co.ndensan.reams.uz.uza.util.db.annotation.TempTableColumnOrder;
import lombok.Getter;
import lombok.Setter;

/**
 * 口座振込一時テーブルクラスです．
 *
 * @reamsid_L DBC-5010-030 x_lilh
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class KozaFurikomiTempTableEntity extends DbTableEntityBase<KozaFurikomiTempTableEntity> implements IDbAccessable {

    /**
     * 口座振込一時テーブル名称
     */
    public static final RString TABLE_NAME;

    static {
        TABLE_NAME = new RString("DbWT0511KozaFurikomi");
    }

    private RString insertDantaiCd;
    private RDateTime insertTimestamp;
    private RString insertReamsLoginId;
    private UUID insertContextId;
    private boolean isDeleted = false;
    private int updateCount = 0;
    private RDateTime lastUpdateTimestamp;
    private RString lastUpdateReamsLoginId;
    @PrimaryKey
    @TempTableColumnOrder(1)
    private long furikomiId;
    @TempTableColumnOrder(2)
    private Decimal itakushaId;
    @TempTableColumnOrder(3)
    private RDate furikomiYMD;
    @TempTableColumnOrder(4)
    private Decimal sakuseiKaisu;
    @TempTableColumnOrder(5)
    private SubGyomuCode subGyomuCode;
    @TempTableColumnOrder(6)
    private RString gyomunaiKubun;
    @TempTableColumnOrder(7)
    private KamokuCode kamokuCode;
    @TempTableColumnOrder(8)
    private EdabanCode kamokuEdabanCode;
    @TempTableColumnOrder(9)
    private Code ryokinShubetsuCode;
    @TempTableColumnOrder(10)
    private Code jigyoKubunCode;
    @TempTableColumnOrder(11)
    private Code furikomiKubun;
    @TempTableColumnOrder(12)
    private KinyuKikanCode kinyuKikanCode;
    @TempTableColumnOrder(13)
    private RString kinyuKikanName;
    @TempTableColumnOrder(14)
    private RString kinyuKikanKanaName;
    @TempTableColumnOrder(15)
    private KinyuKikanShitenCode kinyuKikanShitenCode;
    @TempTableColumnOrder(16)
    private RString kinyuKikanShitenName;
    @TempTableColumnOrder(17)
    private RString kinyuKikanShitenKanaName;
    @TempTableColumnOrder(18)
    private RString yokinShubetsu;
    @TempTableColumnOrder(19)
    private RString yokinShubetsuName;
    @TempTableColumnOrder(20)
    private RString kozaNo;
    @TempTableColumnOrder(21)
    private AtenaKanaMeisho kozaMeiginin;
    @TempTableColumnOrder(22)
    private AtenaMeisho kozaMeigininKanji;
    @TempTableColumnOrder(23)
    private Decimal furikomigaku;
    @TempTableColumnOrder(24)
    private RString kokyakuCode1;
    @TempTableColumnOrder(25)
    private RString kokyakuCode2;
    @TempTableColumnOrder(26)
    private RString kozaTekiyo;
    @TempTableColumnOrder(27)
    private RString tesuryoFutanKubun;
    @TempTableColumnOrder(28)
    private Decimal tesuryo;
    @TempTableColumnOrder(29)
    private Code furikomiSakuseiKubun;
    @TempTableColumnOrder(30)
    private YMDHMS furikomiSakuseiYMDHMS;
    @TempTableColumnOrder(31)
    private ShikibetsuCode taishoshaShikibetsuCode;
    @TempTableColumnOrder(32)
    private boolean baitaiSakuseizumiFlag;
    @TempTableColumnOrder(33)
    private boolean iraishoSakuseizumiFlag;
    @TempTableColumnOrder(34)
    private boolean sakujoFlag;
    @TempTableColumnOrder(35)
    private RString gyomuKoyuKey;

}
