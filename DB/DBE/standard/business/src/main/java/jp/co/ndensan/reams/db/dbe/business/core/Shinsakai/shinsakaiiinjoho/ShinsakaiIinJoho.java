/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.core.Shinsakai.shinsakaiiinjoho;

import java.io.Serializable;
import java.util.Objects;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT5594ShinsakaiIinJohoEntity;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.AtenaJusho;
import jp.co.ndensan.reams.uz.uza.biz.AtenaKanaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.ChikuCode;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.TelNo;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.ModelBase;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;

/**
 * 介護認定審査会委員情報を管理するクラスです。
 */
public class ShinsakaiIinJoho extends ModelBase<ShinsakaiIinJohoIdentifier, DbT5594ShinsakaiIinJohoEntity, ShinsakaiIinJoho> implements Serializable {

    private final DbT5594ShinsakaiIinJohoEntity entity;
    private final ShinsakaiIinJohoIdentifier id;

    /**
     * コンストラクタです。<br/>
     * 介護認定審査会委員情報の新規作成時に使用します。
     *
     * @param 介護認定審査会委員コード 介護認定審査会委員コード
     */
    public ShinsakaiIinJoho(RString 介護認定審査会委員コード) {
        requireNonNull(介護認定審査会委員コード, UrSystemErrorMessages.値がnull.getReplacedMessage("介護認定審査会委員コード"));
        this.entity = new DbT5594ShinsakaiIinJohoEntity();
        this.entity.setShinsakaiIinCode(介護認定審査会委員コード);
        this.id = new ShinsakaiIinJohoIdentifier(
                介護認定審査会委員コード
        );
    }

    /**
     * コンストラクタです。<br/>
     * DBより取得した{@link DbT5594ShinsakaiIinJohoEntity}より{@link ShinsakaiIinJoho}を生成します。
     *
     * @param entity DBより取得した{@link DbT5594ShinsakaiIinJohoEntity}
     */
    public ShinsakaiIinJoho(DbT5594ShinsakaiIinJohoEntity entity) {
        this.entity = requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("介護認定審査会委員情報"));
        this.id = new ShinsakaiIinJohoIdentifier(
                entity.getShinsakaiIinCode());
    }

    /**
     * シリアライズ、ビルダー用コンストラクタです。
     *
     * @param entity {@link DbT5594ShinsakaiIinJohoEntity}
     * @param id {@link ShinsakaiIinJohoIdentifier}
     */
    ShinsakaiIinJoho(
            DbT5594ShinsakaiIinJohoEntity entity,
            ShinsakaiIinJohoIdentifier id
    ) {
        this.entity = entity;
        this.id = id;
    }

    /**
     * 介護認定審査会委員コードを返します。
     *
     * @return 介護認定審査会委員コード
     */
    public RString get介護認定審査会委員コード() {
        return entity.getShinsakaiIinCode();
    }

    /**
     * 介護認定審査会委員開始年月日を返します。
     *
     * @return 介護認定審査会委員開始年月日
     */
    public FlexibleDate get介護認定審査会委員開始年月日() {
        return entity.getShinsakaiIinKaishiYMD();
    }

    /**
     * 介護認定審査会委員終了年月日を返します。
     *
     * @return 介護認定審査会委員終了年月日
     */
    public FlexibleDate get介護認定審査会委員終了年月日() {
        return entity.getShinsakaiIinShuryoYMD();
    }

    /**
     * 介護認定審査会委員氏名を返します。
     *
     * @return 介護認定審査会委員氏名
     */
    public AtenaMeisho get介護認定審査会委員氏名() {
        return entity.getShinsakaiIinShimei();
    }

    /**
     * 介護認定審査会委員氏名カナを返します。
     *
     * @return 介護認定審査会委員氏名カナ
     */
    public AtenaKanaMeisho get介護認定審査会委員氏名カナ() {
        return entity.getShinsakaiIinKanaShimei();
    }

    /**
     * 性別を返します。
     *
     * @return 性別
     */
    public RString get性別() {
        return entity.getSeibetsu();
    }

    /**
     * 介護認定審査員資格コードを返します。
     *
     * @return 介護認定審査員資格コード
     */
    public Code get介護認定審査員資格コード() {
        return entity.getShinsakaiIinShikakuCode();
    }

    /**
     * 審査員郵送区分を返します。
     *
     * @return 審査員郵送区分
     */
    public RString get審査員郵送区分() {
        return entity.getShinsainYusoKubun();
    }

    /**
     * 担当地区コードを返します。
     *
     * @return 担当地区コード
     */
    public ChikuCode get担当地区コード() {
        return entity.getTantoChikuCode();
    }

    /**
     * 郵便番号を返します。
     *
     * @return 郵便番号
     */
    public YubinNo get郵便番号() {
        return entity.getYubinNo();
    }

    /**
     * 住所を返します。
     *
     * @return 住所
     */
    public AtenaJusho get住所() {
        return entity.getJusho();
    }

    /**
     * 電話番号を返します。
     *
     * @return 電話番号
     */
    public TelNo get電話番号() {
        return entity.getTelNo();
    }

    /**
     * FAX番号を返します。
     *
     * @return FAX番号
     */
    public TelNo getFAX番号() {
        return entity.getFaxNo();
    }

    /**
     * 生年月日を返します。
     *
     * @return 生年月日
     */
    public FlexibleDate get生年月日() {
        return entity.getSeinengappiYMD();
    }

    /**
     * 備考を返します。
     *
     * @return 備考
     */
    public RString get備考() {
        return entity.getBiko();
    }

    /**
     * 廃止フラグを返します。
     *
     * @return 廃止フラグ
     */
    public boolean get廃止フラグ() {
        return entity.getHaishiFlag();
    }

    /**
     * 廃止年月日を返します。
     *
     * @return 廃止年月日
     */
    public FlexibleDate get廃止年月日() {
        return entity.getHaishiYMD();
    }

    /**
     * {@link DbT5594ShinsakaiIinJohoEntity}のクローンを返します。
     *
     * @return {@link DbT5594ShinsakaiIinJohoEntity}のクローン
     */
    @Override
    public DbT5594ShinsakaiIinJohoEntity toEntity() {
        return this.entity.clone();
    }

    /**
     * 介護認定審査会委員情報の識別子{@link ShinsakaiIinJohoIdentifier}を返します。
     *
     * @return 介護認定審査会委員情報の識別子{@link ShinsakaiIinJohoIdentifier}
     */
    @Override
    public ShinsakaiIinJohoIdentifier identifier() {
        return this.id;
    }

    /**
     * 介護認定審査会委員情報のみを変更対象とします。<br/>
     * {@link DbT5594ShinsakaiIinJohoEntity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば変更状態にします。
     *
     * @return 変更対象処理実施後の{@link ShinsakaiIinJoho}
     */
    public ShinsakaiIinJoho modifiedModel() {
        DbT5594ShinsakaiIinJohoEntity modifiedEntity = entity.clone();
        if (modifiedEntity.getState().equals(EntityDataState.Unchanged)) {
            modifiedEntity.setState(EntityDataState.Modified);
        }
        return new ShinsakaiIinJoho(
                modifiedEntity, id);
    }

    /**
     * 保持する介護認定審査会委員情報を削除対象とします。<br/>
     * {@link DbT5594ShinsakaiIinJohoEntity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば削除状態にします。
     *
     * @return 削除対象処理実施後の{@link ShinsakaiIinJoho}
     */
    @Override
    public ShinsakaiIinJoho deleted() {
        DbT5594ShinsakaiIinJohoEntity deletedEntity = this.toEntity();
        if (deletedEntity.getState() != EntityDataState.Added) {
            deletedEntity.setState(EntityDataState.Deleted);
        } else {

            throw new IllegalStateException(UrErrorMessages.不正.toString());
        }
        return new ShinsakaiIinJoho(deletedEntity, id);
    }

    /**
     * {@link ShinsakaiIinJoho}のシリアライズ形式を提供します。
     *
     * @return {@link ShinsakaiIinJoho}のシリアライズ形式
     */
    protected Object writeReplace() {
        return new _SerializationProxy(entity, id);

    }

    @Override
    public boolean hasChanged() {
        return hasChangedEntity();
    }

    private static final class _SerializationProxy implements Serializable {

        private final DbT5594ShinsakaiIinJohoEntity entity;
        private final ShinsakaiIinJohoIdentifier id;

        private _SerializationProxy(DbT5594ShinsakaiIinJohoEntity entity, ShinsakaiIinJohoIdentifier id) {
            this.entity = entity;
            this.id = id;
        }

        private Object readResolve() {
            return new ShinsakaiIinJoho(this.entity, this.id);
        }
    }

    /**
     * このクラスの編集を行うBuilderを取得します。<br/>
     * 編集後のインスタンスを取得する場合は{@link SeishinTechoNini.createBuilderForEdit#build()}を使用してください。
     *
     * @return Builder
     */
    public ShinsakaiIinJohoBuilder createBuilderForEdit() {
        return new ShinsakaiIinJohoBuilder(entity, id);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.id);
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
        final ShinsakaiIinJoho other = (ShinsakaiIinJoho) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
