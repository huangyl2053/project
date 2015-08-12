/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3013NichijoSeikatsuYoboKeikakuJikoSakuseiTankiNyushoRiyoNissEntity;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrErrorMessages;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * {@link YoboKeikakuJikoSakuseiTankiRiyoNissu}の編集を行うビルダークラスです。
 */
public class YoboKeikakuJikoSakuseiTankiRiyoNissuBuilder {

    private final DbT3013NichijoSeikatsuYoboKeikakuJikoSakuseiTankiNyushoRiyoNissEntity entity;
    private final YoboKeikakuJikoSakuseiTankiRiyoNissuIdentifier id;

    /**
     * {@link DbT3013YoboKeikakuJikoSakuseiTankiRiyoNissuEntity}より{@link YoboKeikakuJikoSakuseiTankiRiyoNissu}の編集用Builderクラスを生成します。
     *
     * @param entity {@link DbT3013YoboKeikakuJikoSakuseiTankiRiyoNissuEntity}
     * @param id {@link YoboKeikakuJikoSakuseiTankiRiyoNissuIdentifier}
     *
     */
    YoboKeikakuJikoSakuseiTankiRiyoNissuBuilder(
            DbT3013NichijoSeikatsuYoboKeikakuJikoSakuseiTankiNyushoRiyoNissEntity entity,
            YoboKeikakuJikoSakuseiTankiRiyoNissuIdentifier id
    ) {
        this.entity = entity.clone();
        this.id = id;

    }

//TODO Key項目のsetterメソッドは削除してください。
//TODO 一緒に置換される値のまとまりで不変なクラスを作成し、その単位でsetterを作る様に見直してください。
    /**
     * 被保険者番号を設定します。
     *
     * @param 被保険者番号 被保険者番号
     * @return {@link YoboKeikakuJikoSakuseiTankiRiyoNissuBuilder}
     */
    public YoboKeikakuJikoSakuseiTankiRiyoNissuBuilder set被保険者番号(HihokenshaNo 被保険者番号) {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        entity.setHihokenshaNo(被保険者番号);
        return this;
    }

    /**
     * 対象年月を設定します。
     *
     * @param 対象年月 対象年月
     * @return {@link YoboKeikakuJikoSakuseiTankiRiyoNissuBuilder}
     */
    public YoboKeikakuJikoSakuseiTankiRiyoNissuBuilder set対象年月(FlexibleYearMonth 対象年月) {
        requireNonNull(対象年月, UrSystemErrorMessages.値がnull.getReplacedMessage("対象年月"));
        entity.setTaishoYM(対象年月);
        return this;
    }

    /**
     * 履歴番号を設定します。
     *
     * @param 履歴番号 履歴番号
     * @return {@link YoboKeikakuJikoSakuseiTankiRiyoNissuBuilder}
     */
    public YoboKeikakuJikoSakuseiTankiRiyoNissuBuilder set履歴番号(Decimal 履歴番号) {
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("履歴番号"));
        entity.setRirekiNo(履歴番号);
        return this;
    }

    /**
     * 前回迄利用日数を設定します。
     *
     * @param 前回迄利用日数 前回迄利用日数
     * @return {@link YoboKeikakuJikoSakuseiTankiRiyoNissuBuilder}
     */
    public YoboKeikakuJikoSakuseiTankiRiyoNissuBuilder set前回迄利用日数(Decimal 前回迄利用日数) {
        requireNonNull(前回迄利用日数, UrSystemErrorMessages.値がnull.getReplacedMessage("前回迄利用日数"));
        entity.setZenkaiRiyoNissu(前回迄利用日数);
        return this;
    }

    /**
     * 今回計画利用日数を設定します。
     *
     * @param 今回計画利用日数 今回計画利用日数
     * @return {@link YoboKeikakuJikoSakuseiTankiRiyoNissuBuilder}
     */
    public YoboKeikakuJikoSakuseiTankiRiyoNissuBuilder set今回計画利用日数(Decimal 今回計画利用日数) {
        requireNonNull(今回計画利用日数, UrSystemErrorMessages.値がnull.getReplacedMessage("今回計画利用日数"));
        entity.setKonkaiKeikakuRiyoNissu(今回計画利用日数);
        return this;
    }

    /**
     * {@link YoboKeikakuJikoSakuseiTankiRiyoNissu}のインスタンスを生成します。
     *
     * @return {@link YoboKeikakuJikoSakuseiTankiRiyoNissu}のインスタンス
     */
    public YoboKeikakuJikoSakuseiTankiRiyoNissu build() {
        return new YoboKeikakuJikoSakuseiTankiRiyoNissu(entity, id);
    }
}
