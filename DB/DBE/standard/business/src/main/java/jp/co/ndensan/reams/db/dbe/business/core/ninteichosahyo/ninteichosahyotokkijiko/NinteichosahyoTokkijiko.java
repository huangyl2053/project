/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.core.ninteichosahyo.ninteichosahyotokkijiko;

import java.io.Serializable;
import java.util.Objects;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5205NinteichosahyoTokkijikoEntity;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.ModelBase;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;

/**
 * 認定調査票（特記情報）を管理するクラスです。
 *
 * @reamsid_L DBE-9999-011 sunhaidi
 */
public class NinteichosahyoTokkijiko
        extends ModelBase<NinteichosahyoTokkijikoIdentifier, DbT5205NinteichosahyoTokkijikoEntity, NinteichosahyoTokkijiko>
        implements Serializable {

    private final DbT5205NinteichosahyoTokkijikoEntity entity;
    private final NinteichosahyoTokkijikoIdentifier id;

    /**
     * コンストラクタです。<br/>
     * 認定調査票（特記情報）の新規作成時に使用します。
     *
     * @param 申請書管理番号 申請書管理番号
     * @param 認定調査依頼履歴番号 認定調査依頼履歴番号
     * @param 認定調査特記事項番号 認定調査特記事項番号
     * @param 認定調査特記事項連番 認定調査特記事項連番
     * @param 特記事項テキスト_イメージ区分 特記事項テキスト_イメージ区分
     * @param 原本マスク区分 原本マスク区分
     */
    public NinteichosahyoTokkijiko(ShinseishoKanriNo 申請書管理番号,
            int 認定調査依頼履歴番号,
            RString 認定調査特記事項番号,
            int 認定調査特記事項連番,
            RString 特記事項テキスト_イメージ区分,
            Code 原本マスク区分) {
        requireNonNull(申請書管理番号, UrSystemErrorMessages.値がnull.getReplacedMessage("申請書管理番号"));
        requireNonNull(認定調査依頼履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("認定調査依頼履歴番号"));
        requireNonNull(認定調査特記事項番号, UrSystemErrorMessages.値がnull.getReplacedMessage("認定調査特記事項番号"));
        requireNonNull(認定調査特記事項連番, UrSystemErrorMessages.値がnull.getReplacedMessage("認定調査特記事項連番"));
        requireNonNull(特記事項テキスト_イメージ区分, UrSystemErrorMessages.値がnull.getReplacedMessage("特記事項テキスト・イメージ区分"));
        requireNonNull(原本マスク区分, UrSystemErrorMessages.値がnull.getReplacedMessage("原本マスク区分"));
        this.entity = new DbT5205NinteichosahyoTokkijikoEntity();
        this.entity.setShinseishoKanriNo(申請書管理番号);
        this.entity.setNinteichosaRirekiNo(認定調査依頼履歴番号);
        this.entity.setNinteichosaTokkijikoNo(認定調査特記事項番号);
        this.entity.setNinteichosaTokkijikoRemban(認定調査特記事項連番);
        this.entity.setTokkijikoTextImageKubun(特記事項テキスト_イメージ区分);
        this.entity.setGenponMaskKubun(原本マスク区分);
        this.id = new NinteichosahyoTokkijikoIdentifier(
                申請書管理番号,
                認定調査依頼履歴番号,
                認定調査特記事項番号,
                認定調査特記事項連番,
                特記事項テキスト_イメージ区分,
                原本マスク区分
        );
    }

    /**
     * コンストラクタです。<br/>
     * DBより取得した{@link DbT5205NinteichosahyoTokkijikoEntity}より{@link NinteichosahyoTokkijiko}を生成します。
     *
     * @param entity DBより取得した{@link DbT5205NinteichosahyoTokkijikoEntity}
     */
    public NinteichosahyoTokkijiko(DbT5205NinteichosahyoTokkijikoEntity entity) {
        this.entity = requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("認定調査票（特記情報）"));
        this.id = new NinteichosahyoTokkijikoIdentifier(
                entity.getShinseishoKanriNo(),
                entity.getNinteichosaRirekiNo(),
                entity.getNinteichosaTokkijikoNo(),
                entity.getNinteichosaTokkijikoRemban(),
                entity.getTokkijikoTextImageKubun(),
                entity.getGenponMaskKubun());
    }

    /**
     * シリアライズ、ビルダー用コンストラクタです。
     *
     * @param entity {@link DbT5205NinteichosahyoTokkijikoEntity}
     * @param id {@link NinteichosahyoTokkijikoIdentifier}
     */
    NinteichosahyoTokkijiko(
            DbT5205NinteichosahyoTokkijikoEntity entity,
            NinteichosahyoTokkijikoIdentifier id
    ) {
        this.entity = entity;
        this.id = id;
    }

    /**
     * 申請書管理番号を返します。
     *
     * @return 申請書管理番号
     */
    public ShinseishoKanriNo get申請書管理番号() {
        return entity.getShinseishoKanriNo();
    }

    /**
     * 認定調査依頼履歴番号を返します。
     *
     * @return 認定調査依頼履歴番号
     */
    public int get認定調査依頼履歴番号() {
        return entity.getNinteichosaRirekiNo();
    }

    /**
     * 認定調査特記事項番号を返します。
     *
     * @return 認定調査特記事項番号
     */
    public RString get認定調査特記事項番号() {
        return entity.getNinteichosaTokkijikoNo();
    }

    /**
     * 認定調査特記事項連番を返します。
     *
     * @return 認定調査特記事項連番
     */
    public int get認定調査特記事項連番() {
        return entity.getNinteichosaTokkijikoRemban();
    }

    /**
     * 特記事項テキスト・イメージ区分を返します。
     *
     * @return 特記事項テキスト_イメージ区分
     */
    public RString get特記事項テキスト_イメージ区分() {
        return entity.getTokkijikoTextImageKubun();
    }

    /**
     * 原本マスク区分を返します。
     *
     * @return 原本マスク区分
     */
    public Code get原本マスク区分() {
        return entity.getGenponMaskKubun();
    }

    /**
     * 特記事項を返します。
     *
     * @return 特記事項
     */
    public RString get特記事項() {
        return entity.getTokkiJiko();
    }

    /**
     * {@link DbT5205NinteichosahyoTokkijikoEntity}のクローンを返します。
     *
     * @return {@link DbT5205NinteichosahyoTokkijikoEntity}のクローン
     */
    @Override
    public DbT5205NinteichosahyoTokkijikoEntity toEntity() {
        return this.entity.clone();
    }

    /**
     * 認定調査票（特記情報）の識別子{@link NinteichosahyoTokkijikoIdentifier}を返します。
     *
     * @return 認定調査票（特記情報）の識別子{@link NinteichosahyoTokkijikoIdentifier}
     */
    @Override
    public NinteichosahyoTokkijikoIdentifier identifier() {
        return this.id;
    }

    /**
     * 認定調査票（特記情報）のみを変更対象とします。<br/> {@link DbT5205NinteichosahyoTokkijikoEntity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば変更状態にします。
     *
     * @return 変更対象処理実施後の{@link NinteichosahyoTokkijiko}
     */
    public NinteichosahyoTokkijiko modifiedModel() {
        DbT5205NinteichosahyoTokkijikoEntity modifiedEntity = entity.clone();
        if (modifiedEntity.getState().equals(EntityDataState.Unchanged)) {
            modifiedEntity.setState(EntityDataState.Modified);
        }
        return new NinteichosahyoTokkijiko(
                modifiedEntity, id);
    }

    /**
     * 保持する認定調査票（特記情報）を削除対象とします。<br/> {@link DbT5205NinteichosahyoTokkijikoEntity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば削除状態にします。
     *
     * @return 削除対象処理実施後の{@link NinteichosahyoTokkijiko}
     */
    @Override
    public NinteichosahyoTokkijiko deleted() {
        DbT5205NinteichosahyoTokkijikoEntity deletedEntity = this.toEntity();
        if (deletedEntity.getState() != EntityDataState.Added) {
            deletedEntity.setState(EntityDataState.Deleted);
        } else {
            //TODO メッセージの検討
            throw new IllegalStateException(UrErrorMessages.不正.toString());
        }
        return new NinteichosahyoTokkijiko(deletedEntity, id);
    }

    /**
     * {@link NinteichosahyoTokkijiko}のシリアライズ形式を提供します。
     *
     * @return {@link NinteichosahyoTokkijiko}のシリアライズ形式
     */
    protected Object writeReplace() {
        return new _SerializationProxy(entity, id);

    }

    @Override
    public boolean hasChanged() {
        return hasChangedEntity();
    }

    private static final class _SerializationProxy implements Serializable {

        private static final long serialVersionUID = 663081730564632067L;
        private final DbT5205NinteichosahyoTokkijikoEntity entity;
        private final NinteichosahyoTokkijikoIdentifier id;

        private _SerializationProxy(DbT5205NinteichosahyoTokkijikoEntity entity, NinteichosahyoTokkijikoIdentifier id) {
            this.entity = entity;
            this.id = id;
        }

        private Object readResolve() {
            return new NinteichosahyoTokkijiko(this.entity, this.id);
        }
    }

    /**
     * このクラスの編集を行うBuilderを取得します。<br/>
     * 編集後のインスタンスを取得する場合は{@link NinteichosahyoTokkijikoBuilder.createBuilderForEdit#build()}を使用してください。
     *
     * @return Builder
     */
    public NinteichosahyoTokkijikoBuilder createBuilderForEdit() {
        return new NinteichosahyoTokkijikoBuilder(entity, id);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NinteichosahyoTokkijiko other = (NinteichosahyoTokkijiko) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
