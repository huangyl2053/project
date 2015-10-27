/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbx.business.core.view;

import java.io.Serializable;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbx.business.core.uzclasses.ModelBase;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbV1003TashichosonJushochiTokureiEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;

/**
 * 他市町村住所地特例者台帳管理Aliveを管理するクラスです。
 */
public class TashichosonJushochiTokureiAlive extends ModelBase<TashichosonJushochiTokureiAliveIdentifier, DbV1003TashichosonJushochiTokureiEntity, TashichosonJushochiTokureiAlive> implements Serializable {

    private final DbV1003TashichosonJushochiTokureiEntity entity;
    private final TashichosonJushochiTokureiAliveIdentifier id;

    /**
     * コンストラクタです。<br/>
     * 他市町村住所地特例者台帳管理Aliveの新規作成時に使用します。
     *
     * @param 識別コード 識別コード
     * @param 異動日 異動日
     * @param 枝番 枝番
     */
    public TashichosonJushochiTokureiAlive(ShikibetsuCode 識別コード,
            FlexibleDate 異動日,
            RString 枝番) {
        requireNonNull(識別コード, UrSystemErrorMessages.値がnull.getReplacedMessage("識別コード"));
        requireNonNull(異動日, UrSystemErrorMessages.値がnull.getReplacedMessage("異動日"));
        requireNonNull(枝番, UrSystemErrorMessages.値がnull.getReplacedMessage("枝番"));
        this.entity = new DbV1003TashichosonJushochiTokureiEntity();
        this.entity.setShikibetsuCode(識別コード);
        this.entity.setIdoYMD(異動日);
        this.entity.setEdaNo(枝番);
        this.id = new TashichosonJushochiTokureiAliveIdentifier(
                識別コード,
                異動日,
                枝番
        );
    }

    /**
     * コンストラクタです。<br/>
     * DBより取得した{@link DbV1003TashichosonJushochiTokureiEntity}より{@link TashichosonJushochiTokureiAlive}を生成します。
     *
     * @param entity DBより取得した{@link DbV1003TashichosonJushochiTokureiEntity}
     */
    public TashichosonJushochiTokureiAlive(DbV1003TashichosonJushochiTokureiEntity entity) {
        this.entity = requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("他市町村住所地特例者台帳管理Alive"));
        this.id = new TashichosonJushochiTokureiAliveIdentifier(
                entity.getShikibetsuCode(),
                entity.getIdoYMD(),
                entity.getEdaNo());
    }

    /**
     * シリアライズ、ビルダー用コンストラクタです。
     *
     * @param entity {@link DbV1003TashichosonJushochiTokureiEntity}
     * @param id {@link TashichosonJushochiTokureiAliveIdentifier}
     */
    TashichosonJushochiTokureiAlive(
            DbV1003TashichosonJushochiTokureiEntity entity,
            TashichosonJushochiTokureiAliveIdentifier id
    ) {
        this.entity = entity;
        this.id = id;
    }

//TODO getterを見直してください。意味のある単位でValueObjectを作成して公開してください。
    /**
     * 識別コードを返します。
     *
     * @return 識別コード
     */
    public ShikibetsuCode get識別コード() {
        return entity.getShikibetsuCode();
    }

    /**
     * 異動日を返します。
     *
     * @return 異動日
     */
    public FlexibleDate get異動日() {
        return entity.getIdoYMD();
    }

    /**
     * 枝番を返します。
     *
     * @return 枝番
     */
    public RString get枝番() {
        return entity.getEdaNo();
    }

    /**
     * 異動事由コードを返します。
     *
     * @return 異動事由コード
     */
    public RString get異動事由コード() {
        return entity.getIdoJiyuCode();
    }

    /**
     * 市町村コードを返します。
     *
     * @return 市町村コード
     */
    public LasdecCode get市町村コード() {
        return entity.getShichosonCode();
    }

    /**
     * 他市町村住所地特例適用事由コードを返します。
     *
     * @return 他市町村住所地特例適用事由コード
     */
    public RString get他市町村住所地特例適用事由コード() {
        return entity.getTekiyoJiyuCode();
    }

    /**
     * 適用年月日を返します。
     *
     * @return 適用年月日
     */
    public FlexibleDate get適用年月日() {
        return entity.getTekiyoYMD();
    }

    /**
     * 適用届出年月日を返します。
     *
     * @return 適用届出年月日
     */
    public FlexibleDate get適用届出年月日() {
        return entity.getTekiyoTodokedeYMD();
    }

    /**
     * 適用受付年月日を返します。
     *
     * @return 適用受付年月日
     */
    public FlexibleDate get適用受付年月日() {
        return entity.getTekiyoUketsukeYMD();
    }

    /**
     * 他市町村住所地特例解除事由コードを返します。
     *
     * @return 他市町村住所地特例解除事由コード
     */
    public RString get他市町村住所地特例解除事由コード() {
        return entity.getKaijoJiyuCode();
    }

    /**
     * 解除年月日を返します。
     *
     * @return 解除年月日
     */
    public FlexibleDate get解除年月日() {
        return entity.getKaijoYMD();
    }

    /**
     * 解除届出年月日を返します。
     *
     * @return 解除届出年月日
     */
    public FlexibleDate get解除届出年月日() {
        return entity.getKaijoTodokedeYMD();
    }

    /**
     * 解除受付年月日を返します。
     *
     * @return 解除受付年月日
     */
    public FlexibleDate get解除受付年月日() {
        return entity.getKaijoUketsukeYMD();
    }

    /**
     * 措置保険者番号を返します。
     *
     * @return 措置保険者番号
     */
    public ShoKisaiHokenshaNo get措置保険者番号() {
        return entity.getSochiHokenshaNo();
    }

    /**
     * 措置被保険者番号を返します。
     *
     * @return 措置被保険者番号
     */
    public HihokenshaNo get措置被保険者番号() {
        return entity.getSochiHihokenshaNo();
    }

    /**
     * 他特例連絡票発行年月日を返します。
     *
     * @return 他特例連絡票発行年月日
     */
    public FlexibleDate get他特例連絡票発行年月日() {
        return entity.getTatokuRenrakuhyoHakkoYMD();
    }

    /**
     * 施設退所通知発行年月日を返します。
     *
     * @return 施設退所通知発行年月日
     */
    public FlexibleDate get施設退所通知発行年月日() {
        return entity.getShisetsuTaishoTsuchiHakkoYMD();
    }

    /**
     * 施設変更通知発行年月日を返します。
     *
     * @return 施設変更通知発行年月日
     */
    public FlexibleDate get施設変更通知発行年月日() {
        return entity.getShisetsuHenkoTsuchiHakkoYMD();
    }

    /**
     * 論理削除フラグを返します。
     *
     * @return 論理削除フラグ
     */
    public boolean get論理削除フラグ() {
        return entity.getLogicalDeletedFlag();
    }

    /**
     * {@link DbV1003TashichosonJushochiTokureiEntity}のクローンを返します。
     *
     * @return {@link DbV1003TashichosonJushochiTokureiEntity}のクローン
     */
    @Override
    public DbV1003TashichosonJushochiTokureiEntity toEntity() {
        return this.entity.clone();
    }

    /**
     * 他市町村住所地特例者台帳管理Aliveの識別子{@link TashichosonJushochiTokureiAliveIdentifier}を返します。
     *
     * @return
     * 他市町村住所地特例者台帳管理Aliveの識別子{@link TashichosonJushochiTokureiAliveIdentifier}
     */
    @Override
    public TashichosonJushochiTokureiAliveIdentifier identifier() {
        return this.id;
    }

    /**
     * 保持する他市町村住所地特例者台帳管理Aliveを削除対象とします。<br/>
     * {@link DbV1003TashichosonJushochiTokureiEntity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば削除状態にします。
     *
     * @return 削除対象処理実施後の{@link TashichosonJushochiTokureiAlive}
     */
    @Override
    public TashichosonJushochiTokureiAlive deleted() {
        DbV1003TashichosonJushochiTokureiEntity deletedEntity = this.toEntity();
        if (deletedEntity.getState() != EntityDataState.Added) {
            deletedEntity.setState(EntityDataState.Deleted);
        } else {
            //TODO メッセージの検討
            throw new IllegalStateException(UrErrorMessages.不正.toString());
        }
        return new TashichosonJushochiTokureiAlive(deletedEntity, id);
    }

    /**
     * {@link TashichosonJushochiTokureiAlive}のシリアライズ形式を提供します。
     *
     * @return {@link TashichosonJushochiTokureiAlive}のシリアライズ形式
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

        private final DbV1003TashichosonJushochiTokureiEntity entity;
        private final TashichosonJushochiTokureiAliveIdentifier id;

        private _SerializationProxy(DbV1003TashichosonJushochiTokureiEntity entity, TashichosonJushochiTokureiAliveIdentifier id) {
            this.entity = entity;
            this.id = id;
        }

        private Object readResolve() {
            return new TashichosonJushochiTokureiAlive(this.entity, this.id);
        }
    }

    /**
     * このクラスの編集を行うBuilderを取得します。<br/>
     * 編集後のインスタンスを取得する場合は{@link SeishinTechoNini.createBuilderForEdit#build()}を使用してください。
     *
     * @return Builder
     */
    public TashichosonJushochiTokureiAliveBuilder createBuilderForEdit() {
        return new TashichosonJushochiTokureiAliveBuilder(entity, id);
    }

//TODO これはあくまでも雛形によるクラス生成です、必要な業務ロジックの追加、ValueObjectの導出を行う必要があります。
}