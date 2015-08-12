/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.service.core.basic;

import java.util.ArrayList;
import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.business.core.basic.ShokanShoteiShikkanShisetsuRyoyo;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3052ShokanShoteiShikkanShisetsuRyoyoEntity;
import jp.co.ndensan.reams.db.dbc.persistence.db.basic.DbT3052ShokanShoteiShikkanShisetsuRyoyoDac;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * 償還払請求所定疾患施設療養費等を管理するクラスです。
 */
public class ShokanShoteiShikkanShisetsuRyoyoManager {

    private final DbT3052ShokanShoteiShikkanShisetsuRyoyoDac dac;

    /**
     * コンストラクタです。
     */
    public ShokanShoteiShikkanShisetsuRyoyoManager() {
        dac = InstanceProvider.create(DbT3052ShokanShoteiShikkanShisetsuRyoyoDac.class);
    }

    /**
     * テスト用コンストラクタです。
     *
     * @param dac {@link DbT3052ShokanShoteiShikkanShisetsuRyoyoDac}
     */
    ShokanShoteiShikkanShisetsuRyoyoManager(DbT3052ShokanShoteiShikkanShisetsuRyoyoDac dac) {
        this.dac = dac;
    }

    /**
     * 主キーに合致する償還払請求所定疾患施設療養費等を返します。
     *
     * @param 被保険者番号 HiHokenshaNo
     * @param サービス提供年月 ServiceTeikyoYM
     * @param 整理番号 SeiriNo
     * @param 事業者番号 JigyoshaNo
     * @param 様式番号 YoshikiNo
     * @param 順次番号 JunjiNo
     * @param 履歴番号 RirekiNo
     * @return ShokanShoteiShikkanShisetsuRyoyo
     */
    @Transaction
    public ShokanShoteiShikkanShisetsuRyoyo get償還払請求所定疾患施設療養費等(
            HihokenshaNo 被保険者番号,
            FlexibleYearMonth サービス提供年月,
            RString 整理番号,
            JigyoshaNo 事業者番号,
            RString 様式番号,
            RString 順次番号,
            Decimal 履歴番号) {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(サービス提供年月, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス提供年月"));
        requireNonNull(整理番号, UrSystemErrorMessages.値がnull.getReplacedMessage("整理番号"));
        requireNonNull(事業者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("事業者番号"));
        requireNonNull(様式番号, UrSystemErrorMessages.値がnull.getReplacedMessage("様式番号"));
        requireNonNull(順次番号, UrSystemErrorMessages.値がnull.getReplacedMessage("順次番号"));
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("履歴番号"));

        DbT3052ShokanShoteiShikkanShisetsuRyoyoEntity entity = dac.selectByKey(
                被保険者番号,
                サービス提供年月,
                整理番号,
                事業者番号,
                様式番号,
                順次番号,
                履歴番号);
        if (entity == null) {
            return null;
        }
        entity.initializeMd5();
        return new ShokanShoteiShikkanShisetsuRyoyo(entity);
    }

    /**
     * 償還払請求所定疾患施設療養費等を全件返します。
     *
     * @return List<ShokanShoteiShikkanShisetsuRyoyo>
     */
    @Transaction
    public List<ShokanShoteiShikkanShisetsuRyoyo> get償還払請求所定疾患施設療養費等一覧() {
        List<ShokanShoteiShikkanShisetsuRyoyo> businessList = new ArrayList<>();

        for (DbT3052ShokanShoteiShikkanShisetsuRyoyoEntity entity : dac.selectAll()) {
            entity.initializeMd5();
            businessList.add(new ShokanShoteiShikkanShisetsuRyoyo(entity));
        }

        return businessList;
    }

    /**
     * 償還払請求所定疾患施設療養費等{@link ShokanShoteiShikkanShisetsuRyoyo}を保存します。
     *
     * @param 償還払請求所定疾患施設療養費等 {@link ShokanShoteiShikkanShisetsuRyoyo}
     * @return 更新件数 更新結果の件数を返します。
     */
    @Transaction
    public boolean save償還払請求所定疾患施設療養費等(ShokanShoteiShikkanShisetsuRyoyo 償還払請求所定疾患施設療養費等) {
        requireNonNull(償還払請求所定疾患施設療養費等, UrSystemErrorMessages.値がnull.getReplacedMessage("償還払請求所定疾患施設療養費等"));
        if (!償還払請求所定疾患施設療養費等.hasChanged()) {
            return false;
        }
        return 1 == dac.save(償還払請求所定疾患施設療養費等.toEntity());
    }
}