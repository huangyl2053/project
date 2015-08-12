/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.service.core.basic;

import java.util.ArrayList;
import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.business.core.basic.KyufujissekiMeisai;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3018KyufujissekiMeisaiEntity;
import jp.co.ndensan.reams.db.dbc.persistence.db.basic.DbT3018KyufujissekiMeisaiDac;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.KokanShikibetsuNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.NyuryokuShikibetsuNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ServiceKomokuCode;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 給付実績明細を管理するクラスです。
 */
public class KyufujissekiMeisaiManager {

    private final DbT3018KyufujissekiMeisaiDac dac;

    /**
     * コンストラクタです。
     */
    public KyufujissekiMeisaiManager() {
        dac = InstanceProvider.create(DbT3018KyufujissekiMeisaiDac.class);
    }

    /**
     * テスト用コンストラクタです。
     *
     * @param dac {@link DbT3018KyufujissekiMeisaiDac}
     */
    KyufujissekiMeisaiManager(DbT3018KyufujissekiMeisaiDac dac) {
        this.dac = dac;
    }

    /**
     * 主キーに合致する給付実績明細を返します。
     *
     * @param 交換情報識別番号 KokanJohoShikibetsuNo
     * @param 入力識別番号 InputShikibetsuNo
     * @param レコード種別コード RecodeShubetsuCode
     * @param 証記載保険者番号 ShokisaiHokenshaNo
     * @param 被保険者番号 HiHokenshaNo
     * @param サービス提供年月 ServiceTeikyoYM
     * @param 事業所番号 JigyoshoNo
     * @param 通し番号 ToshiNo
     * @param サービス種類コード ServiceShuruiCode
     * @param サービス項目コード ServiceKomokuCode
     * @return KyufujissekiMeisai
     */
    @Transaction
    public KyufujissekiMeisai get給付実績明細(
            KokanShikibetsuNo 交換情報識別番号,
            NyuryokuShikibetsuNo 入力識別番号,
            RString レコード種別コード,
            HokenshaNo 証記載保険者番号,
            HihokenshaNo 被保険者番号,
            FlexibleYearMonth サービス提供年月,
            JigyoshaNo 事業所番号,
            RString 通し番号,
            ServiceShuruiCode サービス種類コード,
            ServiceKomokuCode サービス項目コード) {
        requireNonNull(交換情報識別番号, UrSystemErrorMessages.値がnull.getReplacedMessage("交換情報識別番号"));
        requireNonNull(入力識別番号, UrSystemErrorMessages.値がnull.getReplacedMessage("入力識別番号"));
        requireNonNull(レコード種別コード, UrSystemErrorMessages.値がnull.getReplacedMessage("レコード種別コード"));
        requireNonNull(証記載保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("証記載保険者番号"));
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(サービス提供年月, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス提供年月"));
        requireNonNull(事業所番号, UrSystemErrorMessages.値がnull.getReplacedMessage("事業所番号"));
        requireNonNull(通し番号, UrSystemErrorMessages.値がnull.getReplacedMessage("通し番号"));
        requireNonNull(サービス種類コード, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス種類コード"));
        requireNonNull(サービス項目コード, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス項目コード"));

        DbT3018KyufujissekiMeisaiEntity entity = dac.selectByKey(
                交換情報識別番号,
                入力識別番号,
                レコード種別コード,
                証記載保険者番号,
                被保険者番号,
                サービス提供年月,
                事業所番号,
                通し番号,
                サービス種類コード,
                サービス項目コード);
        if (entity == null) {
            return null;
        }
        entity.initializeMd5();
        return new KyufujissekiMeisai(entity);
    }

    /**
     * 給付実績明細を全件返します。
     *
     * @return List<KyufujissekiMeisai>
     */
    @Transaction
    public List<KyufujissekiMeisai> get給付実績明細一覧() {
        List<KyufujissekiMeisai> businessList = new ArrayList<>();

        for (DbT3018KyufujissekiMeisaiEntity entity : dac.selectAll()) {
            entity.initializeMd5();
            businessList.add(new KyufujissekiMeisai(entity));
        }

        return businessList;
    }

    /**
     * 給付実績明細{@link KyufujissekiMeisai}を保存します。
     *
     * @param 給付実績明細 {@link KyufujissekiMeisai}
     * @return 更新件数 更新結果の件数を返します。
     */
    @Transaction
    public boolean save給付実績明細(KyufujissekiMeisai 給付実績明細) {
        requireNonNull(給付実績明細, UrSystemErrorMessages.値がnull.getReplacedMessage("給付実績明細"));
        if (!給付実績明細.hasChanged()) {
            return false;
        }
        return 1 == dac.save(給付実績明細.toEntity());
    }
}
