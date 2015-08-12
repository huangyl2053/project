/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.business.core.fdz.uzclasskoho.IModel;
import jp.co.ndensan.reams.db.dbc.business.core.fdz.uzclasskoho.Models;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.dbc.DbT3046ShokanServicePlan200604Entity;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;

/**
 * 償還払請求サービス計画200604を管理するクラスです。
 */
public class ShokanServicePlan200604 extends ParentModelBase<ShokanServicePlan200604Identifier, DbT3046ShokanServicePlan200604Entity, ShokanServicePlan200604> implements Serializable {

    private final DbT3046ShokanServicePlan200604Entity entity;
    private final ShokanServicePlan200604Identifier id;

    /**
     * コンストラクタです。<br/>
     * 償還払請求サービス計画200604の新規作成時に使用します。
     *

     */
    public ShokanServicePlan200604() {

        this.entity = new DbT3046ShokanServicePlan200604Entity();

        this.id = new ShokanServicePlan200604Identifier(

                );
    }

    /**
     * コンストラクタです。<br/>
     * DBより取得した{@link DbT3046ShokanServicePlan200604Entity}より{@link ShokanServicePlan200604}を生成します。
     *
     * @param entity DBより取得した{@link DbT3046ShokanServicePlan200604Entity}
     */
    public ShokanServicePlan200604(DbT3046ShokanServicePlan200604Entity entity) {
        this.entity = requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("償還払請求サービス計画200604"));
        this.id = new ShokanServicePlan200604Identifier(
);
    }

    /**
     * シリアライズ、ビルダー用コンストラクタです。
     *
     * @param entity {@link DbT3046ShokanServicePlan200604Entity}
     * @param id {@link ShokanServicePlan200604Identifier}
     */
    ShokanServicePlan200604(
            DbT3046ShokanServicePlan200604Entity entity,
            ShokanServicePlan200604Identifier id
    ) {
        this.entity = entity;
        this.id = id;
    }

//TODO getterを見直してください。意味のある単位でValueObjectを作成して公開してください。
    /**
     * 被保険者番号を返します。
     *
     * @return 被保険者番号
     */
    public HihokenshaNo get被保険者番号() {
        return entity.getHiHokenshaNo();
    }

    /**
     * サービス提供年月を返します。
     *
     * @return サービス提供年月
     */
    public FlexibleYearMonth getサービス提供年月() {
        return entity.getServiceTeikyoYM();
    }

    /**
     * 整理番号を返します。
     *
     * @return 整理番号
     */
    public RString get整理番号() {
        return entity.getSeiriNp();
    }

    /**
     * 事業者番号を返します。
     *
     * @return 事業者番号
     */
    public JigyoshaNo get事業者番号() {
        return entity.getJigyoshaNo();
    }

    /**
     * 様式番号を返します。
     *
     * @return 様式番号
     */
    public RString get様式番号() {
        return entity.getYoshikiNo();
    }

    /**
     * 履歴番号を返します。
     *
     * @return 履歴番号
     */
    public Decimal get履歴番号() {
        return entity.getRirekiNo();
    }

    /**
     * 指定／基準該当事業者区分コードを返します。
     *
     * @return 指定／基準該当事業者区分コード
     */
    public RString get指定／基準該当事業者区分コード() {
        return entity.getShiteiKijunGaitoJigyoshaKubunCode();
    }

    /**
     * 居宅サービス計画作成依頼届出年月日を返します。
     *
     * @return 居宅サービス計画作成依頼届出年月日
     */
    public FlexibleDate get居宅サービス計画作成依頼届出年月日() {
        return entity.getKyotakuServiceSakuseiIraiYMD();
    }

    /**
     * サービスコードを返します。
     *
     * @return サービスコード
     */
    public ServiceCode getサービスコード() {
        return entity.getServiceCode();
    }

    /**
     * 単位数を返します。
     *
     * @return 単位数
     */
    public int get単位数() {
        return entity.getTanisu();
    }

    /**
     * 単位数単価を返します。
     *
     * @return 単位数単価
     */
    public Decimal get単位数単価() {
        return entity.getTanisuTanka();
    }

    /**
     * 請求金額を返します。
     *
     * @return 請求金額
     */
    public int get請求金額() {
        return entity.getSeikyuKingaku();
    }

    /**
     * 担当介護支援専門員番号を返します。
     *
     * @return 担当介護支援専門員番号
     */
    public RString get担当介護支援専門員番号() {
        return entity.getTantokangoshienSemmoninNo();
    }

    /**
     * 摘要を返します。
     *
     * @return 摘要
     */
    public RString get摘要() {
        return entity.getTekiyo();
    }

    /**
     * 審査方法区分コードを返します。
     *
     * @return 審査方法区分コード
     */
    public RString get審査方法区分コード() {
        return entity.getShinsaHohoKubunCode();
    }

    /**
     * 審査年月を返します。
     *
     * @return 審査年月
     */
    public FlexibleYearMonth get審査年月() {
        return entity.getShinsaYM();
    }

    /**
     * 支給区分コードを返します。
     *
     * @return 支給区分コード
     */
    public RString get支給区分コード() {
        return entity.getShikyuKubunCode();
    }

    /**
     * 点数／金額を返します。
     *
     * @return 点数／金額
     */
    public int get点数／金額() {
        return entity.getTensuKingaku();
    }

    /**
     * 支給金額を返します。
     *
     * @return 支給金額
     */
    public int get支給金額() {
        return entity.getShikyuKingaku();
    }

    /**
     * 増減点を返します。
     *
     * @return 増減点
     */
    public int get増減点() {
        return entity.getZougenTen();
    }

    /**
     * 差額金額を返します。
     *
     * @return 差額金額
     */
    public int get差額金額() {
        return entity.getSagakuKingaku();
    }

    /**
     * 増減理由等を返します。
     *
     * @return 増減理由等
     */
    public RString get増減理由等() {
        return entity.getZougenRiyu();
    }

    /**
     * 不支給理由等を返します。
     *
     * @return 不支給理由等
     */
    public RString get不支給理由等() {
        return entity.getFushikyuRiyu();
    }

    /**
     * 購入・改修履歴等を返します。
     *
     * @return 購入・改修履歴等
     */
    public RString get購入・改修履歴等() {
        return entity.getKounyuKaishuRireki();
    }

    /**
     * {@link DbT3046ShokanServicePlan200604Entity}のクローンを返します。
     *
     * @return {@link DbT3046ShokanServicePlan200604Entity}のクローン
     */
    @Override
    public DbT3046ShokanServicePlan200604Entity toEntity() {
        return this.entity.clone();
    }

    /**
     * 償還払請求サービス計画200604の識別子{@link ShokanServicePlan200604Identifier}を返します。
     *
     * @return 償還払請求サービス計画200604の識別子{@link ShokanServicePlan200604Identifier}
     */
    @Override
    public ShokanServicePlan200604Identifier identifier() {
        return this.id;
    }

    /**
     * 償還払請求サービス計画200604のみを変更対象とします。<br/>
     * {@link DbT3046ShokanServicePlan200604Entity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば変更状態にします。
     *
     * @return 変更対象処理実施後の{@link ShokanServicePlan200604}
     */
    @Override
    public ShokanServicePlan200604 modifiedModel() {
        DbT3046ShokanServicePlan200604Entity modifiedEntity = this.toEntity();
        if (!modifiedEntity.getState().equals(EntityDataState.Added)) {
            modifiedEntity.setState(EntityDataState.Modified);
        }
        return new ShokanServicePlan200604(
                modifiedEntity, id);
    }

    /**
     * 保持する償還払請求サービス計画200604を削除対象とします。<br/>
     * {@link DbT3046ShokanServicePlan200604Entity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば削除状態にします。
     *
     * @return 削除対象処理実施後の{@link ShokanServicePlan200604}
     */
    @Override
    public ShokanServicePlan200604 deleted() {
        DbT3046ShokanServicePlan200604Entity deletedEntity = this.toEntity();
        if (deletedEntity.getState() != EntityDataState.Added) {
            deletedEntity.setState(EntityDataState.Deleted);
        } else {
            //TODO メッセージの検討
            throw new IllegalStateException(UrErrorMessages.不正.toString());
        }
        return new ShokanServicePlan200604(deletedEntity, id);
    }
    /**
     * {@link ShokanServicePlan200604}のシリアライズ形式を提供します。
     *
     * @return {@link ShokanServicePlan200604}のシリアライズ形式
     */
    protected Object writeReplace() {
        return new _SerializationProxy(entity, id);

    }

    private static final class _SerializationProxy implements Serializable {

        private static final long serialVersionUID = // TODO serialVersionUIDを生成してください
        private final DbT3046ShokanServicePlan200604Entity entity;
        private final ShokanServicePlan200604Identifier id;

        private _SerializationProxy(DbT3046ShokanServicePlan200604Entity entity,ShokanServicePlan200604Identifier id) {
            this.entity = entity;
            this.id = id;
        }

        private Object readResolve() {
            return new ShokanServicePlan200604(this.entity, this.id);
        }
    }

    /**
     * このクラスの編集を行うBuilderを取得します。<br/>
     * 編集後のインスタンスを取得する場合は{@link SeishinTechoNini.createBuilderForEdit#build()}を使用してください。
     *
     * @return Builder
     */
    public ShokanServicePlan200604Builder createBuilderForEdit() {
        return new ShokanServicePlan200604Builder(entity, id);
    }

//TODO これはあくまでも雛形によるクラス生成です、必要な業務ロジックの追加、ValueObjectの導出を行う必要があります。
}