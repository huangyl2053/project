/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.kogaku;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.business.core.basic.KogakuGassanShikyuGakuKeisanKekkaIdentifier;
import jp.co.ndensan.reams.db.dbc.business.core.basic.KogakuGassanShikyugakuKeisanKekkaMeisai;
import jp.co.ndensan.reams.db.dbc.business.core.basic.KogakuGassanShikyugakuKeisanKekkaMeisaiIdentifier;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT3073KogakuGassanShikyugakuKeisanKekkaMeisaiEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.dbc110070.KogakuGassanShikyuGakuKeisanKekkaRelateEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbz.business.core.uzclasses.Models;
import jp.co.ndensan.reams.db.dbz.business.core.uzclasses.ParentModelBase;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.TelNo;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;

/**
 * 高額合算支給額計算結果情報クラスです。
 *
 * @reamsid_L DBC-2030-030 huzongcheng
 */
public class KogakuGassanShikyuGakuKeisanKekkaRelate extends ParentModelBase<
        KogakuGassanShikyuGakuKeisanKekkaIdentifier, DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity, KogakuGassanShikyuGakuKeisanKekkaRelate>
        implements Serializable {

    private final DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity entity;
    private final KogakuGassanShikyuGakuKeisanKekkaIdentifier id;
    private final Models<KogakuGassanShikyugakuKeisanKekkaMeisaiIdentifier, KogakuGassanShikyugakuKeisanKekkaMeisai> 高額合算支給額計算結果;

    /**
     * コンストラクタです。<br/>
     * 高額合算支給額計算結果の新規作成時に使用します。
     *
     * @param 被保険者番号 被保険者番号
     * @param 対象年度 対象年度
     * @param 証記載保険者番号 証記載保険者番号
     * @param 支給申請書整理番号 支給申請書整理番号
     * @param 履歴番号 履歴番号
     */
    public KogakuGassanShikyuGakuKeisanKekkaRelate(HihokenshaNo 被保険者番号,
            FlexibleYear 対象年度,
            HokenshaNo 証記載保険者番号,
            RString 支給申請書整理番号,
            int 履歴番号) {
        requireNonNull(被保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("被保険者番号"));
        requireNonNull(対象年度, UrSystemErrorMessages.値がnull.getReplacedMessage("対象年度"));
        requireNonNull(証記載保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage("証記載保険者番号"));
        requireNonNull(支給申請書整理番号, UrSystemErrorMessages.値がnull.getReplacedMessage("支給申請書整理番号"));
        requireNonNull(履歴番号, UrSystemErrorMessages.値がnull.getReplacedMessage("履歴番号"));
        this.entity = new DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity();
        this.entity.setHihokenshaNo(被保険者番号);
        this.entity.setTaishoNendo(対象年度);
        this.entity.setShoKisaiHokenshaNo(証記載保険者番号);
        this.entity.setShikyuShinseishoSeiriNo(支給申請書整理番号);
        this.entity.setRirekiNo(履歴番号);
        this.id = new KogakuGassanShikyuGakuKeisanKekkaIdentifier(
                被保険者番号,
                対象年度,
                証記載保険者番号,
                支給申請書整理番号,
                履歴番号
        );
        this.高額合算支給額計算結果 = Models.create(new ArrayList<KogakuGassanShikyugakuKeisanKekkaMeisai>());
    }

    /**
     * コンストラクタです。<br/>
     * 高額合算支給額計算結果の新規作成時に使用します。
     */
    public KogakuGassanShikyuGakuKeisanKekkaRelate() {
        this.entity = new DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity();
        this.id = null;
        this.高額合算支給額計算結果 = Models.create(new ArrayList<KogakuGassanShikyugakuKeisanKekkaMeisai>());
    }

    /**
     * コンストラクタです。<br/>
     * DBより取得した{@link FutanWariaiSokujiKouseiRelateEntity}より{@link KogakuGassanShikyuGakuKeisanKekkaRelate}を生成します。
     *
     * @param entity DBより取得した{@link FutanWariaiSokujiKouseiRelateEntity}
     */
    public KogakuGassanShikyuGakuKeisanKekkaRelate(KogakuGassanShikyuGakuKeisanKekkaRelateEntity entity) {
        this.entity = requireNonNull(entity.get高額合算支給額計算結果(), UrSystemErrorMessages.値がnull.getReplacedMessage("高額合算支給額計算結果"));
        this.id = new KogakuGassanShikyuGakuKeisanKekkaIdentifier(
                entity.get高額合算支給額計算結果().getHihokenshaNo(),
                entity.get高額合算支給額計算結果().getTaishoNendo(),
                entity.get高額合算支給額計算結果().getShoKisaiHokenshaNo(),
                entity.get高額合算支給額計算結果().getShikyuShinseishoSeiriNo(),
                entity.get高額合算支給額計算結果().getRirekiNo());
        List<KogakuGassanShikyugakuKeisanKekkaMeisai> 高額合算支給額計算結果list = new ArrayList();
        for (DbT3073KogakuGassanShikyugakuKeisanKekkaMeisaiEntity 高額合算支給額計算結果entity : entity.get高額合算支給額計算結果明細リスト()) {
            高額合算支給額計算結果list.add(new KogakuGassanShikyugakuKeisanKekkaMeisai(高額合算支給額計算結果entity));
        }
        this.高額合算支給額計算結果 = Models.create(高額合算支給額計算結果list);
    }

    /**
     * シリアライズ、ビルダー用コンストラクタです。
     *
     * @param entity {@link DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity}
     * @param id {@link KogakuGassanShikyuGakuKeisanKekkaIdentifier}
     */
    KogakuGassanShikyuGakuKeisanKekkaRelate(
            DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity entity,
            KogakuGassanShikyuGakuKeisanKekkaIdentifier id,
            Models<KogakuGassanShikyugakuKeisanKekkaMeisaiIdentifier, KogakuGassanShikyugakuKeisanKekkaMeisai> 高額合算支給額計算結果
    ) {
        this.entity = entity;
        this.id = id;
        this.高額合算支給額計算結果 = 高額合算支給額計算結果;
    }

    /**
     * 高額合算支給額計算結果のリストを返します。
     *
     * @return {@link KogakuGassanShikyugakuKeisanKekkaMeisai}のリスト
     */
    public List<KogakuGassanShikyugakuKeisanKekkaMeisai> get高額合算支給額計算結果list() {
        return new ArrayList<>(高額合算支給額計算結果.clone().values());
    }

    /**
     * 高額合算支給額計算結果を返します。
     *
     * @param id {@link KogakuGassanShikyugakuKeisanKekkaMeisaiIdentifier}
     * @return {@link KogakuGassanShikyugakuKeisanKekkaMeisai}
     */
    public KogakuGassanShikyugakuKeisanKekkaMeisai get高額合算支給額計算結果(KogakuGassanShikyugakuKeisanKekkaMeisaiIdentifier id) {
        if (高額合算支給額計算結果.contains(id)) {
            return 高額合算支給額計算結果.clone().get(id);
        }
        throw new IllegalArgumentException(UrErrorMessages.不正.toString());
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
     * 対象年度を返します。
     *
     * @return 対象年度
     */
    public FlexibleYear get対象年度() {
        return entity.getTaishoNendo();
    }

    /**
     * 証記載保険者番号を返します。
     *
     * @return 証記載保険者番号
     */
    public HokenshaNo get証記載保険者番号() {
        return entity.getShoKisaiHokenshaNo();
    }

    /**
     * 支給申請書整理番号を返します。
     *
     * @return 支給申請書整理番号
     */
    public RString get支給申請書整理番号() {
        return entity.getShikyuShinseishoSeiriNo();
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
     * 保険制度コードを返します。
     *
     * @return 保険制度コード
     */
    public RString get保険制度コード() {
        return entity.getHokenSeidoCode();
    }

    /**
     * 自己負担額証明書整理番号を返します。
     *
     * @return 自己負担額証明書整理番号
     */
    public RString get自己負担額証明書整理番号() {
        return entity.getJikoFutanSeiriNo();
    }

    /**
     * 対象計算期間開始年月日を返します。
     *
     * @return 対象計算期間開始年月日
     */
    public FlexibleDate get対象計算期間開始年月日() {
        return entity.getTaishoKeisanKaishiYMD();
    }

    /**
     * 対象計算期間終了年月日を返します。
     *
     * @return 対象計算期間終了年月日
     */
    public FlexibleDate get対象計算期間終了年月日() {
        return entity.getTaishoKeisanShuryoYMD();
    }

    /**
     * 世帯負担総額を返します。
     *
     * @return 世帯負担総額
     */
    public Decimal get世帯負担総額() {
        return entity.getSetaiFutanSogaku();
    }

    /**
     * 介護等合算一部負担金等世帯合算額を返します。
     *
     * @return 介護等合算一部負担金等世帯合算額
     */
    public Decimal get介護等合算一部負担金等世帯合算額() {
        return entity.getSetaiGassanGaku();
    }

    /**
     * 70歳以上介護等合算一部負担金等世帯合算額を返します。
     *
     * @return 70歳以上介護等合算一部負担金等世帯合算額
     */
    public Decimal get70歳以上介護等合算一部負担金等世帯合算額() {
        return entity.getOver70_SetaiGassanGaku();
    }

    /**
     * 所得区分を返します。
     *
     * @return 所得区分
     */
    public RString get所得区分() {
        return entity.getShotokuKubun();
    }

    /**
     * 70歳以上の者に係る所得区分を返します。
     *
     * @return 70歳以上の者に係る所得区分
     */
    public RString get70歳以上の者に係る所得区分() {
        return entity.getOver70_ShotokuKubun();
    }

    /**
     * 介護等合算算定基準額を返します。
     *
     * @return 介護等合算算定基準額
     */
    public Decimal get介護等合算算定基準額() {
        return entity.getSanteiKijunGaku();
    }

    /**
     * 70歳以上介護等合算算定基準額を返します。
     *
     * @return 70歳以上介護等合算算定基準額
     */
    public Decimal get70歳以上介護等合算算定基準額() {
        return entity.getOver70_SanteiKijyunGaku();
    }

    /**
     * 世帯支給総額を返します。
     *
     * @return 世帯支給総額
     */
    public Decimal get世帯支給総額() {
        return entity.getSetaiShikyuSogaku();
    }

    /**
     * うち70歳以上分世帯支給総額を返します。
     *
     * @return うち70歳以上分世帯支給総額
     */
    public Decimal getうち70歳以上分世帯支給総額() {
        return entity.getOver70_SetaiShikyuSogaku();
    }

    /**
     * 按分後支給額を返します。
     *
     * @return 按分後支給額
     */
    public Decimal get按分後支給額() {
        return entity.getHonninShikyugaku();
    }

    /**
     * うち70歳以上分按分後支給額を返します。
     *
     * @return うち70歳以上分按分後支給額
     */
    public Decimal getうち70歳以上分按分後支給額() {
        return entity.getOver70_honninShikyugaku();
    }

    /**
     * 介護低所得者Ⅰ再計算実施の有無を返します。
     *
     * @return 介護低所得者Ⅰ再計算実施の有無
     */
    public RString get介護低所得者Ⅰ再計算実施の有無() {
        return entity.getTeiShotoku_1_SaiKeisanUmu();
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
     * 支給額計算結果連絡先郵便番号を返します。
     *
     * @return 支給額計算結果連絡先郵便番号
     */
    public YubinNo get支給額計算結果連絡先郵便番号() {
        return entity.getKekkaRenrakusakiYubinNo();
    }

    /**
     * 支給額計算結果連絡先住所を返します。
     *
     * @return 支給額計算結果連絡先住所
     */
    public RString get支給額計算結果連絡先住所() {
        return entity.getKekkaRenrakusakiJusho();
    }

    /**
     * 支給額計算結果連絡先名称1を返します。
     *
     * @return 支給額計算結果連絡先名称1
     */
    public RString get支給額計算結果連絡先名称1() {
        return entity.getKetteRenrakusakiMeisho1();
    }

    /**
     * 支給額計算結果連絡先名称2を返します。
     *
     * @return 支給額計算結果連絡先名称2
     */
    public RString get支給額計算結果連絡先名称2() {
        return entity.getKekkaRenrakusakiMeisho2();
    }

    /**
     * 通知年月日を返します。
     *
     * @return 通知年月日
     */
    public FlexibleDate get通知年月日() {
        return entity.getTsuchiYMD();
    }

    /**
     * 連絡票発行者名を返します。
     *
     * @return 連絡票発行者名
     */
    public AtenaMeisho get連絡票発行者名() {
        return entity.getRenrakuhyoHakkoshaMei();
    }

    /**
     * 連絡票発行者郵便番号を返します。
     *
     * @return 連絡票発行者郵便番号
     */
    public YubinNo get連絡票発行者郵便番号() {
        return entity.getRenrakuhyoHakkoshaYubinNo();
    }

    /**
     * 連絡票発行者住所を返します。
     *
     * @return 連絡票発行者住所
     */
    public RString get連絡票発行者住所() {
        return entity.getRenrakuhyoHakkoshaJusho();
    }

    /**
     * 問い合わせ先郵便番号を返します。
     *
     * @return 問い合わせ先郵便番号
     */
    public YubinNo get問い合わせ先郵便番号() {
        return entity.getToiawasesakiYobinNo();
    }

    /**
     * 問い合わせ先住所を返します。
     *
     * @return 問い合わせ先住所
     */
    public RString get問い合わせ先住所() {
        return entity.getToiawasesakiJusho();
    }

    /**
     * 問い合わせ先名称1を返します。
     *
     * @return 問い合わせ先名称1
     */
    public RString get問い合わせ先名称1() {
        return entity.getToiawasesakiMeisho1();
    }

    /**
     * 問い合わせ先名称2を返します。
     *
     * @return 問い合わせ先名称2
     */
    public RString get問い合わせ先名称2() {
        return entity.getToiawasesakiMeisho2();
    }

    /**
     * 問い合わせ先電話番号を返します。
     *
     * @return 問い合わせ先電話番号
     */
    public TelNo get問い合わせ先電話番号() {
        return entity.getToiawasesakiTelNo();
    }

    /**
     * 70歳以上負担額合計を返します。
     *
     * @return 70歳以上負担額合計
     */
    public Decimal get70歳以上負担額合計() {
        return entity.getOver70_FutangakuGokei();
    }

    /**
     * 70歳以上支給額合計を返します。
     *
     * @return 70歳以上支給額合計
     */
    public Decimal get70歳以上支給額合計() {
        return entity.getOver70_ShikyugakuGokei();
    }

    /**
     * 70歳未満負担額合計を返します。
     *
     * @return 70歳未満負担額合計
     */
    public Decimal get70歳未満負担額合計() {
        return entity.getUnder70_FutangakuGokei();
    }

    /**
     * 負担額の合計額を返します。
     *
     * @return 負担額の合計額
     */
    public Decimal get負担額の合計額() {
        return entity.getFutangakuGokei();
    }

    /**
     * 70歳未満支給額合計を返します。
     *
     * @return 70歳未満支給額合計
     */
    public Decimal get70歳未満支給額合計() {
        return entity.getUnder70_ShikyugakuGokei();
    }

    /**
     * 支給額合計額を返します。
     *
     * @return 支給額合計額
     */
    public Decimal get支給額合計額() {
        return entity.getShikyugakuGokei();
    }

    /**
     * データ区分を返します。
     *
     * @return データ区分
     */
    public RString getデータ区分() {
        return entity.getDataKubun();
    }

    /**
     * 受取年月を返します。
     *
     * @return 受取年月
     */
    public FlexibleYearMonth get受取年月() {
        return entity.getUketoriYM();
    }

    /**
     * 送付年月を返します。
     *
     * @return 送付年月
     */
    public FlexibleYearMonth get送付年月() {
        return entity.getSofuYM();
    }

    /**
     * 再送フラグを返します。
     *
     * @return 送付年月
     */
    public RString get再送フラグ() {
        return entity.getSaisoFG();
    }

    /**
     * 支給額計算結果連絡票作成年月日を返します。
     *
     * @return 送付年月
     */
    public FlexibleDate get支給額計算結果連絡票作成年月日() {
        return entity.getSikyugakuKeisanKekkaRenrakuhyoSakuseiYMD();
    }

    /**
     * {@link DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity}のクローンを返します。
     *
     * @return {@link DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity}のクローン
     */
    @Override
    public DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity toEntity() {
        return this.entity.clone();
    }

    /**
     * 利用者負担割合の識別子{@link KogakuGassanShikyuGakuKeisanKekkaIdentifier}を返します。
     *
     * @return 利用者負担割合の識別子{@link KogakuGassanShikyuGakuKeisanKekkaIdentifier}
     */
    @Override
    public KogakuGassanShikyuGakuKeisanKekkaIdentifier identifier() {
        return this.id;
    }

    /**
     * 利用者負担割合のみを変更対象とします。<br/>
     * {@link DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば変更状態にします。
     *
     * @return 変更対象処理実施後の{@link KogakuGassanShikyuGakuKeisanKekkaRelate}
     */
    @Override
    public KogakuGassanShikyuGakuKeisanKekkaRelate modifiedModel() {
        DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity modifiedEntity = this.toEntity();
        if (!modifiedEntity.getState().equals(EntityDataState.Added)) {
            modifiedEntity.setState(EntityDataState.Modified);
        }
        return new KogakuGassanShikyuGakuKeisanKekkaRelate(
                modifiedEntity, id, 高額合算支給額計算結果);
    }

    /**
     * 保持する利用者負担割合を削除対象とします。
     * <br/>
     * {@link DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity}の{@link EntityDataState}がすでにDBへ永続化されている物であれば削除状態にします。
     *
     * @return 削除対象処理実施後の{@link KogakuGassanShikyuGakuKeisanKekkaRelate}
     */
    @Override
    public KogakuGassanShikyuGakuKeisanKekkaRelate deleted() {
        DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity deletedEntity = this.toEntity();
        if (deletedEntity.getState() != EntityDataState.Added) {
            deletedEntity.setState(EntityDataState.Deleted);
        } else {
            throw new IllegalStateException(UrErrorMessages.不正.toString());
        }
        return new KogakuGassanShikyuGakuKeisanKekkaRelate(deletedEntity, id, 高額合算支給額計算結果);
    }

    /**
     * {@link KogakuGassanShikyuGakuKeisanKekkaRelate}のシリアライズ形式を提供します。
     *
     * @return {@link KogakuGassanShikyuGakuKeisanKekkaRelate}のシリアライズ形式
     */
    protected Object writeReplace() {
        return new _SerializationProxy(entity, id, 高額合算支給額計算結果);

    }

    @Override
    public boolean hasChanged() {
        return hasChangedEntity();
    }

    /**
     * getKogakuGassanShikyugakuKeisanKekkaMeisaiList
     *
     * @return UnsupportedOperationException("Not supported yet.")
     */
    public List<KogakuGassanShikyugakuKeisanKekkaMeisai> getKogakuGassanShikyugakuKeisanKekkaMeisaiList() {
        return new ArrayList<>(高額合算支給額計算結果.clone().values());
    }

    private static final class _SerializationProxy implements Serializable {

        private static final long serialVersionUID = 1L;

        private final DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity entity;
        private final KogakuGassanShikyuGakuKeisanKekkaIdentifier id;
        private final Models<KogakuGassanShikyugakuKeisanKekkaMeisaiIdentifier, KogakuGassanShikyugakuKeisanKekkaMeisai> 高額合算支給額計算結果;

        private _SerializationProxy(DbT3072KogakuGassanShikyuGakuKeisanKekkaEntity entity, KogakuGassanShikyuGakuKeisanKekkaIdentifier id,
                Models<KogakuGassanShikyugakuKeisanKekkaMeisaiIdentifier, KogakuGassanShikyugakuKeisanKekkaMeisai> 高額合算支給額計算結果) {
            this.entity = entity;
            this.id = id;
            this.高額合算支給額計算結果 = 高額合算支給額計算結果;
        }

        private Object readResolve() {
            return new KogakuGassanShikyuGakuKeisanKekkaRelate(this.entity, this.id, this.高額合算支給額計算結果);
        }
    }

    /**
     * このクラスの編集を行うBuilderを取得します。<br/>
     * 編集後のインスタンスを取得する場合は{@link SeishinTechoNini.createBuilderForEdit#build()}を使用してください。
     *
     * @return Builder
     */
    public KogakuGassanShikyuGakuKeisanKekkaRelateBuilder createBuilderForEdit() {
        return new KogakuGassanShikyuGakuKeisanKekkaRelateBuilder(entity, id, 高額合算支給額計算結果);
    }

}