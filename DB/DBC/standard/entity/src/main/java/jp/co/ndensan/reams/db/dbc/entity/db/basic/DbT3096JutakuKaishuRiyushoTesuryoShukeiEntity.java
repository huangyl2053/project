package jp.co.ndensan.reams.db.dbc.entity.db.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;
import jp.co.ndensan.reams.uz.uza.util.db.TableName;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import java.util.UUID;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import java.util.Objects;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;

/**
 * 住宅改修理由書作成手数料請求集計テーブルのエンティティクラスです。
 */
public class DbT3096JutakuKaishuRiyushoTesuryoShukeiEntity extends DbTableEntityBase<DbT3096JutakuKaishuRiyushoTesuryoShukeiEntity> implements IDbAccessable {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.4.3">
    @TableName
    public static final RString TABLE_NAME = new RString("DbT3096JutakuKaishuRiyushoTesuryoShukei");

    private RString insertDantaiCd;
    private RDateTime insertTimestamp;
    private RString insertReamsLoginId;
    private UUID insertContextId;
    private boolean isDeleted = false;
    private int updateCount = 0;
    private RDateTime lastUpdateTimestamp;
    private RString lastUpdateReamsLoginId;
    @PrimaryKey
    private HokenshaNo shoKisaiHokenshaNo;
    @PrimaryKey
    private JigyoshaNo riyushoSakuseiJigyoshaNo;
    @PrimaryKey
    private RString shukeiNo;
    @PrimaryKey
    private int rirekiNo;
    private FlexibleYearMonth shukeiKaishiYM;
    private FlexibleYearMonth shukeiShuryoYM;
    private AtenaMeisho jutakuKaishuJigyoshaMeisho;
    private Decimal riyushoSakuseiKensu;
    private Decimal riyushoSakuseiTanka;
    private Decimal riyushoSakuseiSeikyuKingaku;
    private FlexibleDate seikyuJohoSakuseiYMD;
    private FlexibleDate shinseiYMD;
    private FlexibleDate uketsukeYMD;
    private ShikibetsuCode shikibetsuNo;
    private RString shiharaiHohoKubun;
    private RString kinyuKikanCode;
    private RString shitenCode;
    private RString kozaShubetsu;
    private RString kozaNo;
    private RString kozaMeiginin;
    private RString kozaMeigininKana;
    private long kozaID;

    /**
     * insertDantaiCdのgetメソッドです。
     * 
     * @return insertDantaiCd
     */
    public RString getInsertDantaiCd() {
        return insertDantaiCd;
    }

    /**
     * insertDantaiCdのsetメソッドです。
     * 
     * @param insertDantaiCd insertDantaiCd
     */
    public void setInsertDantaiCd(RString insertDantaiCd) {
        this.insertDantaiCd = insertDantaiCd;
    }

    /**
     * isDeletedのgetメソッドです。
     * 
     * @return isDeleted
     */
    public boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * isDeletedのsetメソッドです。
     * 
     * @param isDeleted isDeleted
     */
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * lastUpdateReamsLoginIdのsetメソッドです。
     * 
     * @param lastUpdateReamsLoginId lastUpdateReamsLoginId
     */
    public void setLastUpdateReamsLoginId(RString lastUpdateReamsLoginId) {
        this.lastUpdateReamsLoginId = lastUpdateReamsLoginId;
    }

    /**
     * 証記載保険者番号のgetメソッドです。
     * 
     * @return 証記載保険者番号
     */
    public HokenshaNo getShoKisaiHokenshaNo() {
        return shoKisaiHokenshaNo;
    }

    /**
     * 証記載保険者番号のsetメソッドです。
     * 
     * @param shoKisaiHokenshaNo 証記載保険者番号
     */
    public void setShoKisaiHokenshaNo(@Nonnull HokenshaNo shoKisaiHokenshaNo) {
        this.shoKisaiHokenshaNo = shoKisaiHokenshaNo;
    }

    /**
     * 介護住宅改修理由書作成事業者番号のgetメソッドです。
     * 
     * @return 介護住宅改修理由書作成事業者番号
     */
    public JigyoshaNo getRiyushoSakuseiJigyoshaNo() {
        return riyushoSakuseiJigyoshaNo;
    }

    /**
     * 介護住宅改修理由書作成事業者番号のsetメソッドです。
     * 
     * @param riyushoSakuseiJigyoshaNo 介護住宅改修理由書作成事業者番号
     */
    public void setRiyushoSakuseiJigyoshaNo(@Nonnull JigyoshaNo riyushoSakuseiJigyoshaNo) {
        this.riyushoSakuseiJigyoshaNo = riyushoSakuseiJigyoshaNo;
    }

    /**
     * 集計関連付け番号のgetメソッドです。
     * <br/>
     * <br/>連番（申請書作成対象の証記載保険者番号＞事業者番号ごとに付番）
     * 
     * @return 集計関連付け番号
     */
    public RString getShukeiNo() {
        return shukeiNo;
    }

    /**
     * 集計関連付け番号のsetメソッドです。
     * <br/>
     * <br/>連番（申請書作成対象の証記載保険者番号＞事業者番号ごとに付番）
     * 
     * @param shukeiNo 集計関連付け番号
     */
    public void setShukeiNo(@Nonnull RString shukeiNo) {
        this.shukeiNo = shukeiNo;
    }

    /**
     * 履歴番号のgetメソッドです。
     * <br/>
     * <br/>処理の仕組み上、常に1
     * 
     * @return 履歴番号
     */
    public int getRirekiNo() {
        return rirekiNo;
    }

    /**
     * 履歴番号のsetメソッドです。
     * <br/>
     * <br/>処理の仕組み上、常に1
     * 
     * @param rirekiNo 履歴番号
     */
    public void setRirekiNo(@Nonnull int rirekiNo) {
        this.rirekiNo = rirekiNo;
    }

    /**
     * 集計開始年月のgetメソッドです。
     * 
     * @return 集計開始年月
     */
    @CheckForNull
    public FlexibleYearMonth getShukeiKaishiYM() {
        return shukeiKaishiYM;
    }

    /**
     * 集計開始年月のsetメソッドです。
     * 
     * @param shukeiKaishiYM 集計開始年月
     */
    public void setShukeiKaishiYM(FlexibleYearMonth shukeiKaishiYM) {
        this.shukeiKaishiYM = shukeiKaishiYM;
    }

    /**
     * 集計終了年月のgetメソッドです。
     * 
     * @return 集計終了年月
     */
    @CheckForNull
    public FlexibleYearMonth getShukeiShuryoYM() {
        return shukeiShuryoYM;
    }

    /**
     * 集計終了年月のsetメソッドです。
     * 
     * @param shukeiShuryoYM 集計終了年月
     */
    public void setShukeiShuryoYM(FlexibleYearMonth shukeiShuryoYM) {
        this.shukeiShuryoYM = shukeiShuryoYM;
    }

    /**
     * 介護住宅改修事業者名称のgetメソッドです。
     * 
     * @return 介護住宅改修事業者名称
     */
    @CheckForNull
    public AtenaMeisho getJutakuKaishuJigyoshaMeisho() {
        return jutakuKaishuJigyoshaMeisho;
    }

    /**
     * 介護住宅改修事業者名称のsetメソッドです。
     * 
     * @param jutakuKaishuJigyoshaMeisho 介護住宅改修事業者名称
     */
    public void setJutakuKaishuJigyoshaMeisho(AtenaMeisho jutakuKaishuJigyoshaMeisho) {
        this.jutakuKaishuJigyoshaMeisho = jutakuKaishuJigyoshaMeisho;
    }

    /**
     * 介護住宅改修理由書作成件数のgetメソッドです。
     * 
     * @return 介護住宅改修理由書作成件数
     */
    @CheckForNull
    public Decimal getRiyushoSakuseiKensu() {
        return riyushoSakuseiKensu;
    }

    /**
     * 介護住宅改修理由書作成件数のsetメソッドです。
     * 
     * @param riyushoSakuseiKensu 介護住宅改修理由書作成件数
     */
    public void setRiyushoSakuseiKensu(Decimal riyushoSakuseiKensu) {
        this.riyushoSakuseiKensu = riyushoSakuseiKensu;
    }

    /**
     * 介護住宅改修理由書作成単価のgetメソッドです。
     * 
     * @return 介護住宅改修理由書作成単価
     */
    @CheckForNull
    public Decimal getRiyushoSakuseiTanka() {
        return riyushoSakuseiTanka;
    }

    /**
     * 介護住宅改修理由書作成単価のsetメソッドです。
     * 
     * @param riyushoSakuseiTanka 介護住宅改修理由書作成単価
     */
    public void setRiyushoSakuseiTanka(Decimal riyushoSakuseiTanka) {
        this.riyushoSakuseiTanka = riyushoSakuseiTanka;
    }

    /**
     * 介護住宅改修理由書作成請求金額のgetメソッドです。
     * 
     * @return 介護住宅改修理由書作成請求金額
     */
    @CheckForNull
    public Decimal getRiyushoSakuseiSeikyuKingaku() {
        return riyushoSakuseiSeikyuKingaku;
    }

    /**
     * 介護住宅改修理由書作成請求金額のsetメソッドです。
     * 
     * @param riyushoSakuseiSeikyuKingaku 介護住宅改修理由書作成請求金額
     */
    public void setRiyushoSakuseiSeikyuKingaku(Decimal riyushoSakuseiSeikyuKingaku) {
        this.riyushoSakuseiSeikyuKingaku = riyushoSakuseiSeikyuKingaku;
    }

    /**
     * 請求情報作成年月日のgetメソッドです。
     * 
     * @return 請求情報作成年月日
     */
    @CheckForNull
    public FlexibleDate getSeikyuJohoSakuseiYMD() {
        return seikyuJohoSakuseiYMD;
    }

    /**
     * 請求情報作成年月日のsetメソッドです。
     * 
     * @param seikyuJohoSakuseiYMD 請求情報作成年月日
     */
    public void setSeikyuJohoSakuseiYMD(FlexibleDate seikyuJohoSakuseiYMD) {
        this.seikyuJohoSakuseiYMD = seikyuJohoSakuseiYMD;
    }

    /**
     * 申請年月日のgetメソッドです。
     * <br/>
     * <br/>住宅改修理由書作成手数料請求書兼申請書の申請日
     * 
     * @return 申請年月日
     */
    @CheckForNull
    public FlexibleDate getShinseiYMD() {
        return shinseiYMD;
    }

    /**
     * 申請年月日のsetメソッドです。
     * <br/>
     * <br/>住宅改修理由書作成手数料請求書兼申請書の申請日
     * 
     * @param shinseiYMD 申請年月日
     */
    public void setShinseiYMD(FlexibleDate shinseiYMD) {
        this.shinseiYMD = shinseiYMD;
    }

    /**
     * 受付年月日のgetメソッドです。
     * <br/>
     * <br/>住宅改修理由書作成手数料請求書兼申請書の受付日
     * 
     * @return 受付年月日
     */
    @CheckForNull
    public FlexibleDate getUketsukeYMD() {
        return uketsukeYMD;
    }

    /**
     * 受付年月日のsetメソッドです。
     * <br/>
     * <br/>住宅改修理由書作成手数料請求書兼申請書の受付日
     * 
     * @param uketsukeYMD 受付年月日
     */
    public void setUketsukeYMD(FlexibleDate uketsukeYMD) {
        this.uketsukeYMD = uketsukeYMD;
    }

    /**
     * 識別コードのgetメソッドです。
     * <br/>
     * <br/>住宅改修理由書作成事業者の法人口座取得用
     * 
     * @return 識別コード
     */
    @CheckForNull
    public ShikibetsuCode getShikibetsuNo() {
        return shikibetsuNo;
    }

    /**
     * 識別コードのsetメソッドです。
     * <br/>
     * <br/>住宅改修理由書作成事業者の法人口座取得用
     * 
     * @param shikibetsuNo 識別コード
     */
    public void setShikibetsuNo(ShikibetsuCode shikibetsuNo) {
        this.shikibetsuNo = shikibetsuNo;
    }

    /**
     * 介護支払方法区分のgetメソッドです。
     * 
     * @return 介護支払方法区分
     */
    @CheckForNull
    public RString getShiharaiHohoKubun() {
        return shiharaiHohoKubun;
    }

    /**
     * 介護支払方法区分のsetメソッドです。
     * 
     * @param shiharaiHohoKubun 介護支払方法区分
     */
    public void setShiharaiHohoKubun(RString shiharaiHohoKubun) {
        this.shiharaiHohoKubun = shiharaiHohoKubun;
    }

    /**
     * 金融機関コードのgetメソッドです。
     * 
     * @return 金融機関コード
     */
    @CheckForNull
    public RString getKinyuKikanCode() {
        return kinyuKikanCode;
    }

    /**
     * 金融機関コードのsetメソッドです。
     * 
     * @param kinyuKikanCode 金融機関コード
     */
    public void setKinyuKikanCode(RString kinyuKikanCode) {
        this.kinyuKikanCode = kinyuKikanCode;
    }

    /**
     * 支店コードのgetメソッドです。
     * 
     * @return 支店コード
     */
    @CheckForNull
    public RString getShitenCode() {
        return shitenCode;
    }

    /**
     * 支店コードのsetメソッドです。
     * 
     * @param shitenCode 支店コード
     */
    public void setShitenCode(RString shitenCode) {
        this.shitenCode = shitenCode;
    }

    /**
     * 口座種別のgetメソッドです。
     * 
     * @return 口座種別
     */
    @CheckForNull
    public RString getKozaShubetsu() {
        return kozaShubetsu;
    }

    /**
     * 口座種別のsetメソッドです。
     * 
     * @param kozaShubetsu 口座種別
     */
    public void setKozaShubetsu(RString kozaShubetsu) {
        this.kozaShubetsu = kozaShubetsu;
    }

    /**
     * 口座番号のgetメソッドです。
     * 
     * @return 口座番号
     */
    @CheckForNull
    public RString getKozaNo() {
        return kozaNo;
    }

    /**
     * 口座番号のsetメソッドです。
     * 
     * @param kozaNo 口座番号
     */
    public void setKozaNo(RString kozaNo) {
        this.kozaNo = kozaNo;
    }

    /**
     * 口座名義人のgetメソッドです。
     * 
     * @return 口座名義人
     */
    @CheckForNull
    public RString getKozaMeiginin() {
        return kozaMeiginin;
    }

    /**
     * 口座名義人のsetメソッドです。
     * 
     * @param kozaMeiginin 口座名義人
     */
    public void setKozaMeiginin(RString kozaMeiginin) {
        this.kozaMeiginin = kozaMeiginin;
    }

    /**
     * 口座名義人カナのgetメソッドです。
     * 
     * @return 口座名義人カナ
     */
    @CheckForNull
    public RString getKozaMeigininKana() {
        return kozaMeigininKana;
    }

    /**
     * 口座名義人カナのsetメソッドです。
     * 
     * @param kozaMeigininKana 口座名義人カナ
     */
    public void setKozaMeigininKana(RString kozaMeigininKana) {
        this.kozaMeigininKana = kozaMeigininKana;
    }

    /**
     * 口座IDのgetメソッドです。
     * 
     * @return 口座ID
     */
    @CheckForNull
    public long getKozaID() {
        return kozaID;
    }

    /**
     * 口座IDのsetメソッドです。
     * 
     * @param kozaID 口座ID
     */
    public void setKozaID(long kozaID) {
        this.kozaID = kozaID;
    }

    /**
     * このエンティティの主キーが他の{@literal DbT3096JutakuKaishuRiyushoTesuryoShukeiEntity}と等しいか判定します。
     * 
     * @param other 比較するエンティティ
     * @return 
     * 比較するエンティティが同じ主キーを持つ{@literal DbT3096JutakuKaishuRiyushoTesuryoShukeiEntity}の場合{@literal true}、それ以外の場合は{@literal false}
     */
    @Override
    public boolean equalsPrimaryKeys(DbT3096JutakuKaishuRiyushoTesuryoShukeiEntity other) {
        if (other == null) {
            return false;
        }
        if (!Objects.equals(this.shoKisaiHokenshaNo, other.shoKisaiHokenshaNo)) {
            return false;
        }
        if (!Objects.equals(this.riyushoSakuseiJigyoshaNo, other.riyushoSakuseiJigyoshaNo)) {
            return false;
        }
        if (!Objects.equals(this.shukeiNo, other.shukeiNo)) {
            return false;
        }
        if (this.rirekiNo != other.rirekiNo) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void shallowCopy(DbT3096JutakuKaishuRiyushoTesuryoShukeiEntity entity) {
        this.shoKisaiHokenshaNo = entity.shoKisaiHokenshaNo;
        this.riyushoSakuseiJigyoshaNo = entity.riyushoSakuseiJigyoshaNo;
        this.shukeiNo = entity.shukeiNo;
        this.rirekiNo = entity.rirekiNo;
        this.shukeiKaishiYM = entity.shukeiKaishiYM;
        this.shukeiShuryoYM = entity.shukeiShuryoYM;
        this.jutakuKaishuJigyoshaMeisho = entity.jutakuKaishuJigyoshaMeisho;
        this.riyushoSakuseiKensu = entity.riyushoSakuseiKensu;
        this.riyushoSakuseiTanka = entity.riyushoSakuseiTanka;
        this.riyushoSakuseiSeikyuKingaku = entity.riyushoSakuseiSeikyuKingaku;
        this.seikyuJohoSakuseiYMD = entity.seikyuJohoSakuseiYMD;
        this.shinseiYMD = entity.shinseiYMD;
        this.uketsukeYMD = entity.uketsukeYMD;
        this.shikibetsuNo = entity.shikibetsuNo;
        this.shiharaiHohoKubun = entity.shiharaiHohoKubun;
        this.kinyuKikanCode = entity.kinyuKikanCode;
        this.shitenCode = entity.shitenCode;
        this.kozaShubetsu = entity.kozaShubetsu;
        this.kozaNo = entity.kozaNo;
        this.kozaMeiginin = entity.kozaMeiginin;
        this.kozaMeigininKana = entity.kozaMeigininKana;
        this.kozaID = entity.kozaID;
    }

    /**
     * {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    public RString getMd5() {
        return super.toMd5(shoKisaiHokenshaNo, riyushoSakuseiJigyoshaNo, shukeiNo, rirekiNo, shukeiKaishiYM, shukeiShuryoYM, jutakuKaishuJigyoshaMeisho, riyushoSakuseiKensu, riyushoSakuseiTanka, riyushoSakuseiSeikyuKingaku, seikyuJohoSakuseiYMD, shinseiYMD, uketsukeYMD, shikibetsuNo, shiharaiHohoKubun, kinyuKikanCode, shitenCode, kozaShubetsu, kozaNo, kozaMeiginin, kozaMeigininKana, kozaID);
    }

// </editor-fold>

}
