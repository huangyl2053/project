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
import jp.co.ndensan.reams.db.dbc.entity.db.basic.dbc.DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;

/**
 * 住宅改修理由書作成手数料請求明細を管理するクラスです。
 */
public class JutakuKaishuRiyushoTesuryoMeisai extends ParentModelBase<JutakuKaishuRiyushoTesuryoMeisaiIdentifier, DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity, JutakuKaishuRiyushoTesuryoMeisai> implements Serializable {

    private final DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity entity;
    private final JutakuKaishuRiyushoTesuryoMeisaiIdentifier id;

    /**
     * コンストラクタです。<br/>
     * 住宅改修理由書作成手数料請求明細の新規作成時に使用します。
     *
     * @param 証記載保険者番号 証記載保険者番号
     * @param 被保険者番号 被保険者番号
     * @param 履歴番号 履歴番号
     */
    public JutakuKaishuRiyushoTesuryoMeisai(HokenshaNo 証記載保険者番号,
HihokenshaNo 被保険者番号,
Decimal 履歴番号) {
        requireNonNull(証記載保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("証記載保険者番号"));
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("履歴番号"));
        this.entity = new DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity();
        this.entity.setShoKisaiHokenshaNo(証記載保険者番号);
        this.entity.setHihokenshaNo(被保険者番号);
        this.entity.setRirekiNo(履歴番号);
        this.id = new JutakuKaishuRiyushoTesuryoMeisaiIdentifier(
        証記載保険者番号,
        被保険者番号,
        履歴番号
                );
    }

    /**
     * コンストラクタです。<br/>
     * DBより取得した{@link DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity}より{@link JutakuKaishuRiyushoTesuryoMeisai}を生成します。
     *
     * @param entity DBより取得した{@link DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity}
     */
    public JutakuKaishuRiyushoTesuryoMeisai(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity entity) {
        this.entity = requireNonNull(entity, UrSystemErrorMessages.値がnull.getReplacedMessage("住宅改修理由書作成手数料請求明細"));
        this.id = new JutakuKaishuRiyushoTesuryoMeisaiIdentifier(
                entity.getShoKisaiHokenshaNo(),
                entity.getHihokenshaNo(),
                entity.getRirekiNo());
    }

    /**
     * シリアライズ、ビルダー用コンストラクタです。
     *
     * @param entity {@link DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity}
     * @param id {@link JutakuKaishuRiyushoTesuryoMeisaiIdentifier}
     */
    JutakuKaishuRiyushoTesuryoMeisai(
            DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity entity,
            JutakuKaishuRiyushoTesuryoMeisaiIdentifier id
    ) {
        this.entity = entity;
        this.id = id;
    }

//TODO getterを見直してください。意味のある単位でValueObjectを作成して公開してください。
    /**
     * 証記載保険者番号を返します。
     *
     * @return 証記載保険者番号
     */
    public HokenshaNo get証記載保険者番号() {
        return entity.getShoKisaiHokenshaNo();
    }

    /**
     * 被保険者番号を返します。
     *
     * @return 被保険者番号
     */
    public HihokenshaNo get被保険者番号() {
        return entity.getHihokenshaNo();
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
     * 識別コードを返します。
     *
     * @return 識別コード
     */
    public ShikibetsuCode get識別コード() {
        return entity.getShikibetsuCode();
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
     * 介護住宅改修事業者名称を返します。
     *
     * @return 介護住宅改修事業者名称
     */
    public AtenaMeisho get介護住宅改修事業者名称() {
        return entity.getJutakuKaishuJigyoshaMeisho();
    }

    /**
     * 介護住宅改修着工年月日を返します。
     *
     * @return 介護住宅改修着工年月日
     */
    public FlexibleDate get介護住宅改修着工年月日() {
        return entity.getJutakuKaishuChakkoYMD();
    }

    /**
     * 介護住宅改修住宅所有者を返します。
     *
     * @return 介護住宅改修住宅所有者
     */
    public AtenaMeisho get介護住宅改修住宅所有者() {
        return entity.getJutakuKaishuJushoShozaisha();
    }

    /**
     * 改修対象住宅住所を返します。
     *
     * @return 改修対象住宅住所
     */
    public RString get改修対象住宅住所() {
        return entity.getKaishuTaishoJutakuJusho();
    }

    /**
     * 改修内容・箇所及び規模を返します。
     *
     * @return 改修内容・箇所及び規模
     */
    public RString get改修内容・箇所及び規模() {
        return entity.getKaishuNaiyo_kasho_Kibo();
    }

    /**
     * 介護住宅改修理由書作成年月日を返します。
     *
     * @return 介護住宅改修理由書作成年月日
     */
    public FlexibleDate get介護住宅改修理由書作成年月日() {
        return entity.getRiyushoSakuseiYMD();
    }

    /**
     * 介護住宅改修理由書作成事業者番号を返します。
     *
     * @return 介護住宅改修理由書作成事業者番号
     */
    public JigyoshaNo get介護住宅改修理由書作成事業者番号() {
        return entity.getRiyushoSakuseiJigyoshaNo();
    }

    /**
     * 介護住宅改修理由書作成者名を返します。
     *
     * @return 介護住宅改修理由書作成者名
     */
    public AtenaMeisho get介護住宅改修理由書作成者名() {
        return entity.getRiyushoSakuseishaMei();
    }

    /**
     * 介護住宅改修理由書作成者資格を返します。
     *
     * @return 介護住宅改修理由書作成者資格
     */
    public RString get介護住宅改修理由書作成者資格() {
        return entity.getRiyushoSakuseishaShikaku();
    }

    /**
     * 介護住宅改修理由書作成申請年月日を返します。
     *
     * @return 介護住宅改修理由書作成申請年月日
     */
    public FlexibleDate get介護住宅改修理由書作成申請年月日() {
        return entity.getRiyushoSakuseiShinseiYMD();
    }

    /**
     * 介護住宅改修理由書作成受付年月日を返します。
     *
     * @return 介護住宅改修理由書作成受付年月日
     */
    public FlexibleDate get介護住宅改修理由書作成受付年月日() {
        return entity.getRiyushoSakuseiUketsukeYMD();
    }

    /**
     * {@link DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity}のクローンを返します。
     *
     * @return {@link DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity}のクローン
     */
    @Override
    public DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity toEntity() {
        return this.entity.clone();
    }

    /**
     * 住宅改修理由書作成手数料請求明細の識別子{@link JutakuKaishuRiyushoTesuryoMeisaiIdentifier}を返します。
     *
     * @return 住宅改修理由書作成手数料請求明細の識別子{@link JutakuKaishuRiyushoTesuryoMeisaiIdentifier}
     */
    @Override
    public JutakuKaishuRiyushoTesuryoMeisaiIdentifier identifier() {
        return this.id;
    }

    /**
     * 住宅改修理由書作成手数料請求明細のみを変更対象とします。<br/>
     * {@link DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば変更状態にします。
     *
     * @return 変更対象処理実施後の{@link JutakuKaishuRiyushoTesuryoMeisai}
     */
    @Override
    public JutakuKaishuRiyushoTesuryoMeisai modifiedModel() {
        DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity modifiedEntity = this.toEntity();
        if (!modifiedEntity.getState().equals(EntityDataState.Added)) {
            modifiedEntity.setState(EntityDataState.Modified);
        }
        return new JutakuKaishuRiyushoTesuryoMeisai(
                modifiedEntity, id);
    }

    /**
     * 保持する住宅改修理由書作成手数料請求明細を削除対象とします。<br/>
     * {@link DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば削除状態にします。
     *
     * @return 削除対象処理実施後の{@link JutakuKaishuRiyushoTesuryoMeisai}
     */
    @Override
    public JutakuKaishuRiyushoTesuryoMeisai deleted() {
        DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity deletedEntity = this.toEntity();
        if (deletedEntity.getState() != EntityDataState.Added) {
            deletedEntity.setState(EntityDataState.Deleted);
        } else {
            //TODO メッセージの検討
            throw new IllegalStateException(UrErrorMessages.不正.toString());
        }
        return new JutakuKaishuRiyushoTesuryoMeisai(deletedEntity, id);
    }
    /**
     * {@link JutakuKaishuRiyushoTesuryoMeisai}のシリアライズ形式を提供します。
     *
     * @return {@link JutakuKaishuRiyushoTesuryoMeisai}のシリアライズ形式
     */
    protected Object writeReplace() {
        return new _SerializationProxy(entity, id);

    }

    private static final class _SerializationProxy implements Serializable {

        private static final long serialVersionUID = // TODO serialVersionUIDを生成してください
        private final DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity entity;
        private final JutakuKaishuRiyushoTesuryoMeisaiIdentifier id;

        private _SerializationProxy(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity entity,JutakuKaishuRiyushoTesuryoMeisaiIdentifier id) {
            this.entity = entity;
            this.id = id;
        }

        private Object readResolve() {
            return new JutakuKaishuRiyushoTesuryoMeisai(this.entity, this.id);
        }
    }

    /**
     * このクラスの編集を行うBuilderを取得します。<br/>
     * 編集後のインスタンスを取得する場合は{@link SeishinTechoNini.createBuilderForEdit#build()}を使用してください。
     *
     * @return Builder
     */
    public JutakuKaishuRiyushoTesuryoMeisaiBuilder createBuilderForEdit() {
        return new JutakuKaishuRiyushoTesuryoMeisaiBuilder(entity, id);
    }

//TODO これはあくまでも雛形によるクラス生成です、必要な業務ロジックの追加、ValueObjectの導出を行う必要があります。
}
