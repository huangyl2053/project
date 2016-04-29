/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3044ShokanShokujiHiyoSagakuShikyuEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * {@link ShokanShokujiHiyoSagakuShikyu}の編集を行うビルダークラスです。
 */
public class ShokanShokujiHiyoSagakuShikyuBuilder {

    private final DbT3044ShokanShokujiHiyoSagakuShikyuEntity entity;
    private final ShokanShokujiHiyoSagakuShikyuIdentifier id;

    /**
     * {@link DbT3044ShokanShokujiHiyoSagakuShikyuEntity}より{@link ShokanShokujiHiyoSagakuShikyu}の編集用Builderクラスを生成します。
     *
     * @param entity {@link DbT3044ShokanShokujiHiyoSagakuShikyuEntity}
     * @param id {@link ShokanShokujiHiyoSagakuShikyuIdentifier}
     *
     */
    ShokanShokujiHiyoSagakuShikyuBuilder(
            DbT3044ShokanShokujiHiyoSagakuShikyuEntity entity,
            ShokanShokujiHiyoSagakuShikyuIdentifier id
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
     * @return {@link ShokanShokujiHiyoSagakuShikyuBuilder}
     */
    public ShokanShokujiHiyoSagakuShikyuBuilder set被保険者番号(HihokenshaNo 被保険者番号) {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        entity.setHiHokenshaNo(被保険者番号);
        return this;
    }

    /**
     * サービス提供年月を設定します。
     *
     * @param サービス提供年月 サービス提供年月
     * @return {@link ShokanShokujiHiyoSagakuShikyuBuilder}
     */
    public ShokanShokujiHiyoSagakuShikyuBuilder setサービス提供年月(FlexibleYearMonth サービス提供年月) {
        requireNonNull(サービス提供年月, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス提供年月"));
        entity.setServiceTeikyoYM(サービス提供年月);
        return this;
    }

    /**
     * 整理番号を設定します。
     *
     * @param 整理番号 整理番号
     * @return {@link ShokanShokujiHiyoSagakuShikyuBuilder}
     */
    public ShokanShokujiHiyoSagakuShikyuBuilder set整理番号(RString 整理番号) {
        requireNonNull(整理番号, UrSystemErrorMessages.値がnull.getReplacedMessage("整理番号"));
        entity.setSeiriNo(整理番号);
        return this;
    }

    /**
     * 事業者番号を設定します。
     *
     * @param 事業者番号 事業者番号
     * @return {@link ShokanShokujiHiyoSagakuShikyuBuilder}
     */
    public ShokanShokujiHiyoSagakuShikyuBuilder set事業者番号(JigyoshaNo 事業者番号) {
        requireNonNull(事業者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("事業者番号"));
        entity.setJigyoshaNo(事業者番号);
        return this;
    }

    /**
     * 様式番号を設定します。
     *
     * @param 様式番号 様式番号
     * @return {@link ShokanShokujiHiyoSagakuShikyuBuilder}
     */
    public ShokanShokujiHiyoSagakuShikyuBuilder set様式番号(RString 様式番号) {
        requireNonNull(様式番号, UrSystemErrorMessages.値がnull.getReplacedMessage("様式番号"));
        entity.setYoshikiNo(様式番号);
        return this;
    }

    /**
     * 明細番号を設定します。
     *
     * @param 明細番号 明細番号
     * @return {@link ShokanShokujiHiyoSagakuShikyuBuilder}
     */
    public ShokanShokujiHiyoSagakuShikyuBuilder set明細番号(RString 明細番号) {
        requireNonNull(明細番号, UrSystemErrorMessages.値がnull.getReplacedMessage("明細番号"));
        entity.setMeisaiNo(明細番号);
        return this;
    }

    /**
     * 連番を設定します。
     *
     * @param 連番 連番
     * @return {@link ShokanShokujiHiyoSagakuShikyuBuilder}
     */
    public ShokanShokujiHiyoSagakuShikyuBuilder set連番(RString 連番) {
        requireNonNull(連番, UrSystemErrorMessages.値がnull.getReplacedMessage("連番"));
        entity.setMeisaiNo(連番);
        return this;
    }

    /**
     * 差額金額を設定します。
     *
     * @param 差額金額 差額金額
     * @return {@link ShokanShokujiHiyoSagakuShikyuBuilder}
     */
    public ShokanShokujiHiyoSagakuShikyuBuilder set差額金額(int 差額金額) {
        requireNonNull(差額金額, UrSystemErrorMessages.値がnull.getReplacedMessage("差額金額"));
        entity.setSagakuKingaku(差額金額);
        return this;
    }

    /**
     * 支給区分コードを設定します。
     *
     * @param 支給区分コード 支給区分コード
     * @return {@link ShokanShokujiHiyoSagakuShikyuBuilder}
     */
    public ShokanShokujiHiyoSagakuShikyuBuilder set支給区分コード(RString 支給区分コード) {
        requireNonNull(支給区分コード, UrSystemErrorMessages.値がnull.getReplacedMessage("支給区分コード"));
        entity.setShikyuKubunCode(支給区分コード);
        return this;
    }

    /**
     * 点数_金額を設定します。
     *
     * @param 点数_金額 点数_金額
     * @return {@link ShokanShokujiHiyoSagakuShikyuBuilder}
     */
    public ShokanShokujiHiyoSagakuShikyuBuilder set点数_金額(int 点数_金額) {
        requireNonNull(点数_金額, UrSystemErrorMessages.値がnull.getReplacedMessage("点数_金額"));
        entity.setTensuKingaku(点数_金額);
        return this;
    }

    /**
     * 支給金額を設定します。
     *
     * @param 支給金額 支給金額
     * @return {@link ShokanShokujiHiyoSagakuShikyuBuilder}
     */
    public ShokanShokujiHiyoSagakuShikyuBuilder set支給金額(int 支給金額) {
        requireNonNull(支給金額, UrSystemErrorMessages.値がnull.getReplacedMessage("支給金額"));
        entity.setShikyuKingaku(支給金額);
        return this;
    }

    /**
     * 支給_不支給理由を設定します。
     *
     * @param 支給_不支給理由 支給_不支給理由
     * @return {@link ShokanShokujiHiyoSagakuShikyuBuilder}
     */
    public ShokanShokujiHiyoSagakuShikyuBuilder set支給_不支給理由(RString 支給_不支給理由) {
        requireNonNull(支給_不支給理由, UrSystemErrorMessages.値がnull.getReplacedMessage("支給_不支給理由"));
        entity.setShikyuFushikyuRiyu(支給_不支給理由);
        return this;
    }

    /**
     * {@link ShokanShokujiHiyoSagakuShikyu}のインスタンスを生成します。
     *
     * @return {@link ShokanShokujiHiyoSagakuShikyu}のインスタンス
     */
    public ShokanShokujiHiyoSagakuShikyu build() {
        return new ShokanShokujiHiyoSagakuShikyu(entity, id);
    }
}
