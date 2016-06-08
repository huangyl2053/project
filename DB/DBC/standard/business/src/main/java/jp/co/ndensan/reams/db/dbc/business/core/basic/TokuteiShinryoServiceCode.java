/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import java.io.Serializable;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7120TokuteiShinryoServiceCodeEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ServiceKomokuCode;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.db.dbz.business.core.uzclasses.ModelBase;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;

/**
 * 特定診療サービスコードを管理するクラスです。
 */
public class TokuteiShinryoServiceCode 
extends ModelBase<TokuteiShinryoServiceCodeIdentifier, 
        DbT7120TokuteiShinryoServiceCodeEntity, 
        TokuteiShinryoServiceCode> implements Serializable {

    private final DbT7120TokuteiShinryoServiceCodeEntity entity;
    private final TokuteiShinryoServiceCodeIdentifier id;

    /**
     * コンストラクタです。<br/>
     * 特定診療サービスコードの新規作成時に使用します。
     *
     * @param サービス種類コード サービス種類コード
     * @param サービス項目コード サービス項目コード
     * @param 適用開始年月 適用開始年月
     * @param 履歴番号 履歴番号
     */
    public TokuteiShinryoServiceCode(ServiceShuruiCode サービス種類コード,
            ServiceKomokuCode サービス項目コード,
            FlexibleYearMonth 適用開始年月,
            int 履歴番号) {
        requireNonNull(サービス種類コード, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス種類コード"));
        requireNonNull(サービス項目コード, UrSystemErrorMessages.値がnull.getReplacedMessage("サービス項目コード"));
        requireNonNull(適用開始年月, UrSystemErrorMessages.値がnull.getReplacedMessage("適用開始年月"));
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("履歴番号"));
        this.entity = new DbT7120TokuteiShinryoServiceCodeEntity();
        this.entity.setServiceShuruiCode(サービス種類コード);
        this.entity.setServiceKomokuCode(サービス項目コード);
        this.entity.setTekiyoKaishiYM(適用開始年月);
        this.entity.setRirekiNo(履歴番号);
        this.id = new TokuteiShinryoServiceCodeIdentifier(
                サービス種類コード,
                サービス項目コード,
                適用開始年月,
                履歴番号
        );
    }

    /**
     * コンストラクタです。<br/>
     * DBより取得した{@link DbT7120TokuteiShinryoServiceCodeEntity}より{@link TokuteiShinryoServiceCode}を生成します。
     *
     * @param entity DBより取得した{@link DbT7120TokuteiShinryoServiceCodeEntity}
     */
    public TokuteiShinryoServiceCode(DbT7120TokuteiShinryoServiceCodeEntity entity) {
        this.entity = requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("特定診療サービスコード"));
        this.id = new TokuteiShinryoServiceCodeIdentifier(
                entity.getServiceShuruiCode(),
                entity.getServiceKomokuCode(),
                entity.getTekiyoKaishiYM(),
                entity.getRirekiNo());
    }

    /**
     * シリアライズ、ビルダー用コンストラクタです。
     *
     * @param entity {@link DbT7120TokuteiShinryoServiceCodeEntity}
     * @param id {@link TokuteiShinryoServiceCodeIdentifier}
     */
    TokuteiShinryoServiceCode(
            DbT7120TokuteiShinryoServiceCodeEntity entity,
            TokuteiShinryoServiceCodeIdentifier id
    ) {
        this.entity = entity;
        this.id = id;
    }

//TODO getterを見直してください。意味のある単位でValueObjectを作成して公開してください。
    /**
     * サービス種類コードを返します。
     *
     * @return サービス種類コード
     */
    public ServiceShuruiCode getサービス種類コード() {
        return entity.getServiceShuruiCode();
    }

    /**
     * サービス項目コードを返します。
     *
     * @return サービス項目コード
     */
    public ServiceKomokuCode getサービス項目コード() {
        return entity.getServiceKomokuCode();
    }

    /**
     * 適用開始年月を返します。
     *
     * @return 適用開始年月
     */
    public FlexibleYearMonth get適用開始年月() {
        return entity.getTekiyoKaishiYM();
    }

    /**
     * 履歴番号を返します。
     *
     * @return 履歴番号
     */
    public int get履歴番号() {
        return entity.getRirekiNo();
    }

    /**
     * 適用終了年月を返します。
     *
     * @return 適用終了年月
     */
    public FlexibleYearMonth get適用終了年月() {
        return entity.getTekiyoShuryoYM();
    }

    /**
     * サービス名称を返します。
     *
     * @return サービス名称
     */
    public RString getサービス名称() {
        return entity.getServiceMeisho();
    }

    /**
     * 単位数を返します。
     *
     * @return 単位数
     */
    public Decimal get単位数() {
        return entity.getTaniSu();
    }

    /**
     * 単位数識別を返します。
     *
     * @return 単位数識別
     */
    public RString get単位数識別() {
        return entity.getTaniSuShikibetsu();
    }

    /**
     * 算定単位を返します。
     *
     * @return 算定単位
     */
    public RString get算定単位() {
        return entity.getSanteiTani();
    }

    /**
     * 合成識別区分を返します。
     *
     * @return 合成識別区分
     */
    public RString get合成識別区分() {
        return entity.getGoseiShikibetsuKubun();
    }

    /**
     * 特定診療区分コードを返します。
     *
     * @return 特定診療区分コード
     */
    public RString get特定診療区分コード() {
        return entity.getTokuteiShinryoKubunCode();
    }

    /**
     * 特定診療項目コードを返します。
     *
     * @return 特定診療項目コード
     */
    public RString get特定診療項目コード() {
        return entity.getTokuteiShinryoKomokuCode();
    }

    /**
     * 算定制約期間を返します。
     *
     * @return 算定制約期間
     */
    public RString get算定制約期間() {
        return entity.getSanteiSeiyakuKikan();
    }

    /**
     * 算定制約回数を返します。
     *
     * @return 算定制約回数
     */
    public Decimal get算定制約回数() {
        return entity.getSanteiSeiyakuKaisu();
    }

    /**
     * {@link DbT7120TokuteiShinryoServiceCodeEntity}のクローンを返します。
     *
     * @return {@link DbT7120TokuteiShinryoServiceCodeEntity}のクローン
     */
    @Override
    public DbT7120TokuteiShinryoServiceCodeEntity toEntity() {
        return this.entity.clone();
    }

    /**
     * 特定診療サービスコードの識別子{@link TokuteiShinryoServiceCodeIdentifier}を返します。
     *
     * @return 特定診療サービスコードの識別子{@link TokuteiShinryoServiceCodeIdentifier}
     */
    @Override
    public TokuteiShinryoServiceCodeIdentifier identifier() {
        return this.id;
    }

    /**
     * 保持する特定診療サービスコードを削除対象とします。<br/>
     * {@link DbT7120TokuteiShinryoServiceCodeEntity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば削除状態にします。
     *
     * @return 削除対象処理実施後の{@link TokuteiShinryoServiceCode}
     */
    @Override
    public TokuteiShinryoServiceCode deleted() {
        DbT7120TokuteiShinryoServiceCodeEntity deletedEntity = this.toEntity();
        if (deletedEntity.getState() != EntityDataState.Added) {
            deletedEntity.setState(EntityDataState.Deleted);
        } else {
            //TODO メッセージの検討
            throw new IllegalStateException(UrErrorMessages.不正.toString());
        }
        return new TokuteiShinryoServiceCode(deletedEntity, id);
    }

    /**
     * {@link TokuteiShinryoServiceCode}のシリアライズ形式を提供します。
     *
     * @return {@link TokuteiShinryoServiceCode}のシリアライズ形式
     */
    protected Object writeReplace() {
        return new _SerializationProxy(entity, id);

    }

    @Override
    public boolean hasChanged() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static final class _SerializationProxy implements Serializable {

        private static final long serialVersionUID = 1L;

        private final DbT7120TokuteiShinryoServiceCodeEntity entity;
        private final TokuteiShinryoServiceCodeIdentifier id;

        private _SerializationProxy(DbT7120TokuteiShinryoServiceCodeEntity entity, TokuteiShinryoServiceCodeIdentifier id) {
            this.entity = entity;
            this.id = id;
        }

        private Object readResolve() {
            return new TokuteiShinryoServiceCode(this.entity, this.id);
        }
    }

    /**
     * このクラスの編集を行うBuilderを取得します。<br/>
     * 編集後のインスタンスを取得する場合は{@link SeishinTechoNini.createBuilderForEdit#build()}を使用してください。
     *
     * @return Builder
     */
    public TokuteiShinryoServiceCodeBuilder createBuilderForEdit() {
        return new TokuteiShinryoServiceCodeBuilder(entity, id);
    }

//TODO これはあくまでも雛形によるクラス生成です、必要な業務ロジックの追加、ValueObjectの導出を行う必要があります。
}
