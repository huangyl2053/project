/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.view;

import java.io.Serializable;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbz.business.core.uzclasses.ParentModelBase;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbV3017KyufujissekiKihonEntity;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;

/**
 * 給付実績基本Aliveを管理するクラスです。
 */
public class KyufujissekiKihonAlive extends ParentModelBase<KyufujissekiKihonAliveIdentifier, DbV3017KyufujissekiKihonEntity, KyufujissekiKihonAlive> implements Serializable {

    private final DbV3017KyufujissekiKihonEntity entity;
    private final KyufujissekiKihonAliveIdentifier id;

    /**
     * コンストラクタです。<br/>
     * 給付実績基本Aliveの新規作成時に使用します。
     *
     * @param 交換情報識別番号 交換情報識別番号
     * @param 入力識別番号 入力識別番号
     * @param レコード種別コード レコード種別コード
     * @param 証記載保険者番号 証記載保険者番号
     * @param 被保険者番号 被保険者番号
     * @param サービス提供年月 サービス提供年月
     * @param 事業所番号 事業所番号
     * @param 給付実績情報作成区分コード 給付実績情報作成区分コード
     * @param 給付実績区分コード 給付実績区分コード
     * @param 通し番号 通し番号
     */
    public KyufujissekiKihonAlive(ShikibetsuCode 交換情報識別番号,
            ShikibetsuCode 入力識別番号,
            RString レコード種別コード,
            HokenshaNo 証記載保険者番号,
            HihokenshaNo 被保険者番号,
            FlexibleYearMonth サービス提供年月,
            JigyoshaNo 事業所番号,
            RString 給付実績情報作成区分コード,
            RString 給付実績区分コード,
            RString 通し番号) {
        requireNonNull(交換情報識別番号, UrSystemErrorMessages.値がnull.getReplacedMessage("交換情報識別番号"));
        requireNonNull(入力識別番号, UrSystemErrorMessages.値がnull.getReplacedMessage("入力識別番号"));
        requireNonNull(レコード種別コード, UrSystemErrorMessages.値がnull.getReplacedMessage("レコード種別コード"));
        requireNonNull(証記載保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("証記載保険者番号"));
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(サービス提供年月, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス提供年月"));
        requireNonNull(事業所番号, UrSystemErrorMessages.値がnull.getReplacedMessage("事業所番号"));
        requireNonNull(給付実績情報作成区分コード, UrSystemErrorMessages.値がnull.getReplacedMessage("給付実績情報作成区分コード"));
        requireNonNull(給付実績区分コード, UrSystemErrorMessages.値がnull.getReplacedMessage("給付実績区分コード"));
        requireNonNull(通し番号, UrSystemErrorMessages.値がnull.getReplacedMessage("通し番号"));
        this.entity = new DbV3017KyufujissekiKihonEntity();
        this.entity.setKokanShikibetsuNo(交換情報識別番号);
        this.entity.setInputShikibetsuNo(入力識別番号);
        this.entity.setRecodeShubetsuCode(レコード種別コード);
        this.entity.setHokenshaNo(証記載保険者番号);
        this.entity.setHiHokenshaNo(被保険者番号);
        this.entity.setServiceTeikyoYM(サービス提供年月);
        this.entity.setJigyoshoNo(事業所番号);
        this.entity.setKyufuSakuseiKubunCode(給付実績情報作成区分コード);
        this.entity.setKyufuJissekiKubunCode(給付実績区分コード);
        this.entity.setToshiNo(通し番号);
        this.id = new KyufujissekiKihonAliveIdentifier(
                交換情報識別番号,
                入力識別番号,
                レコード種別コード,
                証記載保険者番号,
                被保険者番号,
                サービス提供年月,
                事業所番号,
                給付実績情報作成区分コード,
                給付実績区分コード,
                通し番号
        );
    }

    /**
     * コンストラクタです。<br/>
     * DBより取得した{@link DbV3017KyufujissekiKihonEntity}より{@link KyufujissekiKihonAlive}を生成します。
     *
     * @param entity DBより取得した{@link DbV3017KyufujissekiKihonEntity}
     */
    public KyufujissekiKihonAlive(DbV3017KyufujissekiKihonEntity entity) {
        this.entity = requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("給付実績基本Alive"));
        this.id = new KyufujissekiKihonAliveIdentifier(
                entity.getKokanShikibetsuNo(),
                entity.getInputShikibetsuNo(),
                entity.getRecodeShubetsuCode(),
                entity.getHokenshaNo(),
                entity.getHiHokenshaNo(),
                entity.getServiceTeikyoYM(),
                entity.getJigyoshoNo(),
                entity.getKyufuSakuseiKubunCode(),
                entity.getKyufuJissekiKubunCode(),
                entity.getToshiNo());
    }

    /**
     * シリアライズ、ビルダー用コンストラクタです。
     *
     * @param entity {@link DbV3017KyufujissekiKihonEntity}
     * @param id {@link KyufujissekiKihonAliveIdentifier}
     */
    KyufujissekiKihonAlive(
            DbV3017KyufujissekiKihonEntity entity,
            KyufujissekiKihonAliveIdentifier id
    ) {
        this.entity = entity;
        this.id = id;
    }

//TODO getterを見直してください。意味のある単位でValueObjectを作成して公開してください。
    /**
     * 交換情報識別番号を返します。
     *
     * @return 交換情報識別番号
     */
    public ShikibetsuCode get交換情報識別番号() {
        return entity.getKokanShikibetsuNo();
    }

    /**
     * 入力識別番号を返します。
     *
     * @return 入力識別番号
     */
    public ShikibetsuCode get入力識別番号() {
        return entity.getInputShikibetsuNo();
    }

    /**
     * レコード種別コードを返します。
     *
     * @return レコード種別コード
     */
    public RString getレコード種別コード() {
        return entity.getRecodeShubetsuCode();
    }

    /**
     * 証記載保険者番号を返します。
     *
     * @return 証記載保険者番号
     */
    public HokenshaNo get証記載保険者番号() {
        return entity.getHokenshaNo();
    }

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
     * 事業所番号を返します。
     *
     * @return 事業所番号
     */
    public JigyoshaNo get事業所番号() {
        return entity.getJigyoshoNo();
    }

    /**
     * 給付実績情報作成区分コードを返します。
     *
     * @return 給付実績情報作成区分コード
     */
    public RString get給付実績情報作成区分コード() {
        return entity.getKyufuSakuseiKubunCode();
    }

    /**
     * 給付実績区分コードを返します。
     *
     * @return 給付実績区分コード
     */
    public RString get給付実績区分コード() {
        return entity.getKyufuJissekiKubunCode();
    }

    /**
     * 通し番号を返します。
     *
     * @return 通し番号
     */
    public RString get通し番号() {
        return entity.getToshiNo();
    }

    /**
     * {@link DbV3017KyufujissekiKihonEntity}のクローンを返します。
     *
     * @return {@link DbV3017KyufujissekiKihonEntity}のクローン
     */
    @Override
    public DbV3017KyufujissekiKihonEntity toEntity() {
        return this.entity.clone();
    }

    /**
     * 給付実績基本Aliveの識別子{@link KyufujissekiKihonAliveIdentifier}を返します。
     *
     * @return 給付実績基本Aliveの識別子{@link KyufujissekiKihonAliveIdentifier}
     */
    @Override
    public KyufujissekiKihonAliveIdentifier identifier() {
        return this.id;
    }

    /**
     * 給付実績基本Aliveのみを変更対象とします。<br/>
     * {@link DbV3017KyufujissekiKihonEntity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば変更状態にします。
     *
     * @return 変更対象処理実施後の{@link KyufujissekiKihonAlive}
     */
    @Override
    public KyufujissekiKihonAlive modifiedModel() {
        DbV3017KyufujissekiKihonEntity modifiedEntity = entity.clone();
        if (modifiedEntity.getState().equals(EntityDataState.Unchanged)) {
            modifiedEntity.setState(EntityDataState.Modified);
        }
        return new KyufujissekiKihonAlive(
                modifiedEntity, id);
    }

    /**
     * 保持する給付実績基本Aliveを削除対象とします。<br/>
     * {@link DbV3017KyufujissekiKihonEntity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば削除状態にします。
     *
     * @return 削除対象処理実施後の{@link KyufujissekiKihonAlive}
     */
    @Override
    public KyufujissekiKihonAlive deleted() {
        DbV3017KyufujissekiKihonEntity deletedEntity = this.toEntity();
        if (deletedEntity.getState() != EntityDataState.Added) {
            deletedEntity.setState(EntityDataState.Deleted);
        } else {
            //TODO メッセージの検討
            throw new IllegalStateException(UrErrorMessages.不正.toString());
        }
        return new KyufujissekiKihonAlive(deletedEntity, id);
    }

    /**
     * {@link KyufujissekiKihonAlive}のシリアライズ形式を提供します。
     *
     * @return {@link KyufujissekiKihonAlive}のシリアライズ形式
     */
    protected Object writeReplace() {
        return new _SerializationProxy(entity, id);

    }

    @Override
    public boolean hasChanged() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static final class _SerializationProxy implements Serializable {

        private static final long serialVersionUID = 1L;// TODO serialVersionUIDを生成してください
        private final DbV3017KyufujissekiKihonEntity entity;
        private final KyufujissekiKihonAliveIdentifier id;

        private _SerializationProxy(DbV3017KyufujissekiKihonEntity entity, KyufujissekiKihonAliveIdentifier id) {
            this.entity = entity;
            this.id = id;
        }

        private Object readResolve() {
            return new KyufujissekiKihonAlive(this.entity, this.id);
        }
    }

    /**
     * このクラスの編集を行うBuilderを取得します。<br/>
     * 編集後のインスタンスを取得する場合は{@link SeishinTechoNini.createBuilderForEdit#build()}を使用してください。
     *
     * @return Builder
     */
    public KyufujissekiKihonAliveBuilder createBuilderForEdit() {
        return new KyufujissekiKihonAliveBuilder(entity, id);
    }

//TODO これはあくまでも雛形によるクラス生成です、必要な業務ロジックの追加、ValueObjectの導出を行う必要があります。
}