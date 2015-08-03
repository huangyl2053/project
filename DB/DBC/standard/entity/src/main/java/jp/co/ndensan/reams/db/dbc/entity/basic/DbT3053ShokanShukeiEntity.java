package jp.co.ndensan.reams.db.dbc.entity.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;
import jp.co.ndensan.reams.uz.uza.util.db.TableName;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import java.util.UUID;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import java.util.Objects;

/**
 * 償還払請求集計テーブルのエンティティクラスです。
 */
public class DbT3053ShokanShukeiEntity extends DbTableEntityBase<DbT3053ShokanShukeiEntity> implements IDbAccessable {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.3.9">
    @TableName
    public static final RString TABLE_NAME = new RString("DbT3053ShokanShukei");

    private RString insertDantaiCd;
    private RDateTime insertTimestamp;
    private RString insertReamsLoginId;
    private UUID insertContextId;
    private boolean isDeleted = false;
    private int updateCount = 0;
    private RDateTime lastUpdateTimestamp;
    private RString lastUpdateReamsLoginId;
    @PrimaryKey
    private DbUDD002HihokenshaNo hiHokenshaNo;
    @PrimaryKey
    private FlexibleYearMonth serviceTeikyoYM;
    @PrimaryKey
    private RString seiriNo;
    @PrimaryKey
    private DbUDD004JigyoshaNo jigyoshaNo;
    @PrimaryKey
    private RString yoshikiNo;
    @PrimaryKey
    private RString junjiNo;
    @PrimaryKey
    private int rirekiNo;
    private DbUDD005ServiceShuruiCode serviceShuruiCode;
    private int serviceJitsunissu;
    private int planTanisu;
    private int gendogakuKanriTaishoTanisu;
    private int gendogakuKanriTaishogaiTanisu;
    private int tankiNyushoPlanNissu;
    private int tankiNyushoJitsunissu;
    private int tanisuTotal;
    private Decimal tanisuTanka;
    private Decimal seikyugaku;
    private int riyoshaFutangaku;
    private int dekidakaIryohiTanisuTotal;
    private Decimal dekidakaIryohiSeikyugaku;
    private Decimal dekidakaIryohiRiyoshaFutangaku;
    private RString shinsaHohoKubunCode;
    private FlexibleYearMonth shinsaYM;
    private RString shikyuKubunCode;
    private int tensuKingaku;
    private int shikyuKingaku;
    private int zougenten;
    private int seikyugakuSagakuKingaku;
    private int dekidakaSeikyugakuSagaku;
    private RString zougenRiyu;
    private RString hushikyuRiyu;
    private RString kounyuKaishuRireki;

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
     * 被保険者番号のgetメソッドです。
     * 
     * @return 被保険者番号
     */
    public DbUDD002HihokenshaNo getHiHokenshaNo() {
        return hiHokenshaNo;
    }

    /**
     * 被保険者番号のsetメソッドです。
     * 
     * @param hiHokenshaNo 被保険者番号
     */
    public void setHiHokenshaNo(DbUDD002HihokenshaNo hiHokenshaNo) {
        this.hiHokenshaNo = hiHokenshaNo;
    }

    /**
     * サービス提供年月のgetメソッドです。
     * 
     * @return サービス提供年月
     */
    public FlexibleYearMonth getServiceTeikyoYM() {
        return serviceTeikyoYM;
    }

    /**
     * サービス提供年月のsetメソッドです。
     * 
     * @param serviceTeikyoYM サービス提供年月
     */
    public void setServiceTeikyoYM(FlexibleYearMonth serviceTeikyoYM) {
        this.serviceTeikyoYM = serviceTeikyoYM;
    }

    /**
     * 整理番号のgetメソッドです。
     * 
     * @return 整理番号
     */
    public RString getSeiriNo() {
        return seiriNo;
    }

    /**
     * 整理番号のsetメソッドです。
     * 
     * @param seiriNo 整理番号
     */
    public void setSeiriNo(RString seiriNo) {
        this.seiriNo = seiriNo;
    }

    /**
     * 事業者番号のgetメソッドです。
     * 
     * @return 事業者番号
     */
    public DbUDD004JigyoshaNo getJigyoshaNo() {
        return jigyoshaNo;
    }

    /**
     * 事業者番号のsetメソッドです。
     * 
     * @param jigyoshaNo 事業者番号
     */
    public void setJigyoshaNo(DbUDD004JigyoshaNo jigyoshaNo) {
        this.jigyoshaNo = jigyoshaNo;
    }

    /**
     * 様式番号のgetメソッドです。
     * 
     * @return 様式番号
     */
    public RString getYoshikiNo() {
        return yoshikiNo;
    }

    /**
     * 様式番号のsetメソッドです。
     * 
     * @param yoshikiNo 様式番号
     */
    public void setYoshikiNo(RString yoshikiNo) {
        this.yoshikiNo = yoshikiNo;
    }

    /**
     * 順次番号のgetメソッドです。
     * <br/>
     * <br/>複数レコード対応のため
     * 
     * @return 順次番号
     */
    public RString getJunjiNo() {
        return junjiNo;
    }

    /**
     * 順次番号のsetメソッドです。
     * <br/>
     * <br/>複数レコード対応のため
     * 
     * @param junjiNo 順次番号
     */
    public void setJunjiNo(RString junjiNo) {
        this.junjiNo = junjiNo;
    }

    /**
     * 履歴番号のgetメソッドです。
     * 
     * @return 履歴番号
     */
    public int getRirekiNo() {
        return rirekiNo;
    }

    /**
     * 履歴番号のsetメソッドです。
     * 
     * @param rirekiNo 履歴番号
     */
    public void setRirekiNo(int rirekiNo) {
        this.rirekiNo = rirekiNo;
    }

    /**
     * サービス種類コードのgetメソッドです。
     * 
     * @return サービス種類コード
     */
    public DbUDD005ServiceShuruiCode getServiceShuruiCode() {
        return serviceShuruiCode;
    }

    /**
     * サービス種類コードのsetメソッドです。
     * 
     * @param serviceShuruiCode サービス種類コード
     */
    public void setServiceShuruiCode(DbUDD005ServiceShuruiCode serviceShuruiCode) {
        this.serviceShuruiCode = serviceShuruiCode;
    }

    /**
     * サービス実日数のgetメソッドです。
     * 
     * @return サービス実日数
     */
    public int getServiceJitsunissu() {
        return serviceJitsunissu;
    }

    /**
     * サービス実日数のsetメソッドです。
     * 
     * @param serviceJitsunissu サービス実日数
     */
    public void setServiceJitsunissu(int serviceJitsunissu) {
        this.serviceJitsunissu = serviceJitsunissu;
    }

    /**
     * 計画単位数のgetメソッドです。
     * 
     * @return 計画単位数
     */
    public int getPlanTanisu() {
        return planTanisu;
    }

    /**
     * 計画単位数のsetメソッドです。
     * 
     * @param planTanisu 計画単位数
     */
    public void setPlanTanisu(int planTanisu) {
        this.planTanisu = planTanisu;
    }

    /**
     * 限度額管理対象単位数のgetメソッドです。
     * 
     * @return 限度額管理対象単位数
     */
    public int getGendogakuKanriTaishoTanisu() {
        return gendogakuKanriTaishoTanisu;
    }

    /**
     * 限度額管理対象単位数のsetメソッドです。
     * 
     * @param gendogakuKanriTaishoTanisu 限度額管理対象単位数
     */
    public void setGendogakuKanriTaishoTanisu(int gendogakuKanriTaishoTanisu) {
        this.gendogakuKanriTaishoTanisu = gendogakuKanriTaishoTanisu;
    }

    /**
     * 限度額管理対象外単位数のgetメソッドです。
     * 
     * @return 限度額管理対象外単位数
     */
    public int getGendogakuKanriTaishogaiTanisu() {
        return gendogakuKanriTaishogaiTanisu;
    }

    /**
     * 限度額管理対象外単位数のsetメソッドです。
     * 
     * @param gendogakuKanriTaishogaiTanisu 限度額管理対象外単位数
     */
    public void setGendogakuKanriTaishogaiTanisu(int gendogakuKanriTaishogaiTanisu) {
        this.gendogakuKanriTaishogaiTanisu = gendogakuKanriTaishogaiTanisu;
    }

    /**
     * 短期入所計画日数のgetメソッドです。
     * 
     * @return 短期入所計画日数
     */
    public int getTankiNyushoPlanNissu() {
        return tankiNyushoPlanNissu;
    }

    /**
     * 短期入所計画日数のsetメソッドです。
     * 
     * @param tankiNyushoPlanNissu 短期入所計画日数
     */
    public void setTankiNyushoPlanNissu(int tankiNyushoPlanNissu) {
        this.tankiNyushoPlanNissu = tankiNyushoPlanNissu;
    }

    /**
     * 短期入所実日数のgetメソッドです。
     * 
     * @return 短期入所実日数
     */
    public int getTankiNyushoJitsunissu() {
        return tankiNyushoJitsunissu;
    }

    /**
     * 短期入所実日数のsetメソッドです。
     * 
     * @param tankiNyushoJitsunissu 短期入所実日数
     */
    public void setTankiNyushoJitsunissu(int tankiNyushoJitsunissu) {
        this.tankiNyushoJitsunissu = tankiNyushoJitsunissu;
    }

    /**
     * 単位数合計のgetメソッドです。
     * 
     * @return 単位数合計
     */
    public int getTanisuTotal() {
        return tanisuTotal;
    }

    /**
     * 単位数合計のsetメソッドです。
     * 
     * @param tanisuTotal 単位数合計
     */
    public void setTanisuTotal(int tanisuTotal) {
        this.tanisuTotal = tanisuTotal;
    }

    /**
     * 単位数単価のgetメソッドです。
     * 
     * @return 単位数単価
     */
    public Decimal getTanisuTanka() {
        return tanisuTanka;
    }

    /**
     * 単位数単価のsetメソッドです。
     * 
     * @param tanisuTanka 単位数単価
     */
    public void setTanisuTanka(Decimal tanisuTanka) {
        this.tanisuTanka = tanisuTanka;
    }

    /**
     * 請求額のgetメソッドです。
     * 
     * @return 請求額
     */
    public Decimal getSeikyugaku() {
        return seikyugaku;
    }

    /**
     * 請求額のsetメソッドです。
     * 
     * @param seikyugaku 請求額
     */
    public void setSeikyugaku(Decimal seikyugaku) {
        this.seikyugaku = seikyugaku;
    }

    /**
     * 利用者負担額のgetメソッドです。
     * 
     * @return 利用者負担額
     */
    public int getRiyoshaFutangaku() {
        return riyoshaFutangaku;
    }

    /**
     * 利用者負担額のsetメソッドです。
     * 
     * @param riyoshaFutangaku 利用者負担額
     */
    public void setRiyoshaFutangaku(int riyoshaFutangaku) {
        this.riyoshaFutangaku = riyoshaFutangaku;
    }

    /**
     * 出来高医療費単位数合計のgetメソッドです。
     * 
     * @return 出来高医療費単位数合計
     */
    public int getDekidakaIryohiTanisuTotal() {
        return dekidakaIryohiTanisuTotal;
    }

    /**
     * 出来高医療費単位数合計のsetメソッドです。
     * 
     * @param dekidakaIryohiTanisuTotal 出来高医療費単位数合計
     */
    public void setDekidakaIryohiTanisuTotal(int dekidakaIryohiTanisuTotal) {
        this.dekidakaIryohiTanisuTotal = dekidakaIryohiTanisuTotal;
    }

    /**
     * 出来高医療費請求額のgetメソッドです。
     * 
     * @return 出来高医療費請求額
     */
    public Decimal getDekidakaIryohiSeikyugaku() {
        return dekidakaIryohiSeikyugaku;
    }

    /**
     * 出来高医療費請求額のsetメソッドです。
     * 
     * @param dekidakaIryohiSeikyugaku 出来高医療費請求額
     */
    public void setDekidakaIryohiSeikyugaku(Decimal dekidakaIryohiSeikyugaku) {
        this.dekidakaIryohiSeikyugaku = dekidakaIryohiSeikyugaku;
    }

    /**
     * 出来高医療費利用者負担額のgetメソッドです。
     * 
     * @return 出来高医療費利用者負担額
     */
    public Decimal getDekidakaIryohiRiyoshaFutangaku() {
        return dekidakaIryohiRiyoshaFutangaku;
    }

    /**
     * 出来高医療費利用者負担額のsetメソッドです。
     * 
     * @param dekidakaIryohiRiyoshaFutangaku 出来高医療費利用者負担額
     */
    public void setDekidakaIryohiRiyoshaFutangaku(Decimal dekidakaIryohiRiyoshaFutangaku) {
        this.dekidakaIryohiRiyoshaFutangaku = dekidakaIryohiRiyoshaFutangaku;
    }

    /**
     * 審査方法区分コードのgetメソッドです。
     * 
     * @return 審査方法区分コード
     */
    public RString getShinsaHohoKubunCode() {
        return shinsaHohoKubunCode;
    }

    /**
     * 審査方法区分コードのsetメソッドです。
     * 
     * @param shinsaHohoKubunCode 審査方法区分コード
     */
    public void setShinsaHohoKubunCode(RString shinsaHohoKubunCode) {
        this.shinsaHohoKubunCode = shinsaHohoKubunCode;
    }

    /**
     * 審査年月のgetメソッドです。
     * 
     * @return 審査年月
     */
    public FlexibleYearMonth getShinsaYM() {
        return shinsaYM;
    }

    /**
     * 審査年月のsetメソッドです。
     * 
     * @param shinsaYM 審査年月
     */
    public void setShinsaYM(FlexibleYearMonth shinsaYM) {
        this.shinsaYM = shinsaYM;
    }

    /**
     * 支給区分コードのgetメソッドです。
     * 
     * @return 支給区分コード
     */
    public RString getShikyuKubunCode() {
        return shikyuKubunCode;
    }

    /**
     * 支給区分コードのsetメソッドです。
     * 
     * @param shikyuKubunCode 支給区分コード
     */
    public void setShikyuKubunCode(RString shikyuKubunCode) {
        this.shikyuKubunCode = shikyuKubunCode;
    }

    /**
     * 点数／金額のgetメソッドです。
     * 
     * @return 点数／金額
     */
    public int getTensuKingaku() {
        return tensuKingaku;
    }

    /**
     * 点数／金額のsetメソッドです。
     * 
     * @param tensuKingaku 点数／金額
     */
    public void setTensuKingaku(int tensuKingaku) {
        this.tensuKingaku = tensuKingaku;
    }

    /**
     * 支払金額のgetメソッドです。
     * 
     * @return 支払金額
     */
    public int getShikyuKingaku() {
        return shikyuKingaku;
    }

    /**
     * 支払金額のsetメソッドです。
     * 
     * @param shikyuKingaku 支払金額
     */
    public void setShikyuKingaku(int shikyuKingaku) {
        this.shikyuKingaku = shikyuKingaku;
    }

    /**
     * 増減点のgetメソッドです。
     * 
     * @return 増減点
     */
    public int getZougenten() {
        return zougenten;
    }

    /**
     * 増減点のsetメソッドです。
     * 
     * @param zougenten 増減点
     */
    public void setZougenten(int zougenten) {
        this.zougenten = zougenten;
    }

    /**
     * 請求額差額金額のgetメソッドです。
     * 
     * @return 請求額差額金額
     */
    public int getSeikyugakuSagakuKingaku() {
        return seikyugakuSagakuKingaku;
    }

    /**
     * 請求額差額金額のsetメソッドです。
     * 
     * @param seikyugakuSagakuKingaku 請求額差額金額
     */
    public void setSeikyugakuSagakuKingaku(int seikyugakuSagakuKingaku) {
        this.seikyugakuSagakuKingaku = seikyugakuSagakuKingaku;
    }

    /**
     * 出来高請求額差額金額のgetメソッドです。
     * 
     * @return 出来高請求額差額金額
     */
    public int getDekidakaSeikyugakuSagaku() {
        return dekidakaSeikyugakuSagaku;
    }

    /**
     * 出来高請求額差額金額のsetメソッドです。
     * 
     * @param dekidakaSeikyugakuSagaku 出来高請求額差額金額
     */
    public void setDekidakaSeikyugakuSagaku(int dekidakaSeikyugakuSagaku) {
        this.dekidakaSeikyugakuSagaku = dekidakaSeikyugakuSagaku;
    }

    /**
     * 増減理由等のgetメソッドです。
     * 
     * @return 増減理由等
     */
    public RString getZougenRiyu() {
        return zougenRiyu;
    }

    /**
     * 増減理由等のsetメソッドです。
     * 
     * @param zougenRiyu 増減理由等
     */
    public void setZougenRiyu(RString zougenRiyu) {
        this.zougenRiyu = zougenRiyu;
    }

    /**
     * 不支給理由等のgetメソッドです。
     * 
     * @return 不支給理由等
     */
    public RString getHushikyuRiyu() {
        return hushikyuRiyu;
    }

    /**
     * 不支給理由等のsetメソッドです。
     * 
     * @param hushikyuRiyu 不支給理由等
     */
    public void setHushikyuRiyu(RString hushikyuRiyu) {
        this.hushikyuRiyu = hushikyuRiyu;
    }

    /**
     * 購入・改修履歴等のgetメソッドです。
     * 
     * @return 購入・改修履歴等
     */
    public RString getKounyuKaishuRireki() {
        return kounyuKaishuRireki;
    }

    /**
     * 購入・改修履歴等のsetメソッドです。
     * 
     * @param kounyuKaishuRireki 購入・改修履歴等
     */
    public void setKounyuKaishuRireki(RString kounyuKaishuRireki) {
        this.kounyuKaishuRireki = kounyuKaishuRireki;
    }

    /**
     * このエンティティの主キーが他の{@literal DbT3053ShokanShukeiEntity}と等しいか判定します。
     * 
     * @param other 比較するエンティティ
     * @@return 
     * 比較するエンティティが同じ主キーを持つ{@literal DbT3053ShokanShukeiEntity}の場合{@literal true}、それ以外の場合は{@literal false}
     */
    @Override
    public boolean equalsPrimaryKeys(DbT3053ShokanShukeiEntity other) {
        if (other == null) {
            return false;
        }
        if (!Objects.equals(this.hiHokenshaNo, other.hiHokenshaNo)) {
            return false;
        }
        if (!Objects.equals(this.serviceTeikyoYM, other.serviceTeikyoYM)) {
            return false;
        }
        if (!Objects.equals(this.seiriNo, other.seiriNo)) {
            return false;
        }
        if (!Objects.equals(this.jigyoshaNo, other.jigyoshaNo)) {
            return false;
        }
        if (!Objects.equals(this.yoshikiNo, other.yoshikiNo)) {
            return false;
        }
        if (!Objects.equals(this.junjiNo, other.junjiNo)) {
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
    public void shallowCopy(DbT3053ShokanShukeiEntity entity) {
        this.hiHokenshaNo = entity.hiHokenshaNo;
        this.serviceTeikyoYM = entity.serviceTeikyoYM;
        this.seiriNo = entity.seiriNo;
        this.jigyoshaNo = entity.jigyoshaNo;
        this.yoshikiNo = entity.yoshikiNo;
        this.junjiNo = entity.junjiNo;
        this.rirekiNo = entity.rirekiNo;
        this.serviceShuruiCode = entity.serviceShuruiCode;
        this.serviceJitsunissu = entity.serviceJitsunissu;
        this.planTanisu = entity.planTanisu;
        this.gendogakuKanriTaishoTanisu = entity.gendogakuKanriTaishoTanisu;
        this.gendogakuKanriTaishogaiTanisu = entity.gendogakuKanriTaishogaiTanisu;
        this.tankiNyushoPlanNissu = entity.tankiNyushoPlanNissu;
        this.tankiNyushoJitsunissu = entity.tankiNyushoJitsunissu;
        this.tanisuTotal = entity.tanisuTotal;
        this.tanisuTanka = entity.tanisuTanka;
        this.seikyugaku = entity.seikyugaku;
        this.riyoshaFutangaku = entity.riyoshaFutangaku;
        this.dekidakaIryohiTanisuTotal = entity.dekidakaIryohiTanisuTotal;
        this.dekidakaIryohiSeikyugaku = entity.dekidakaIryohiSeikyugaku;
        this.dekidakaIryohiRiyoshaFutangaku = entity.dekidakaIryohiRiyoshaFutangaku;
        this.shinsaHohoKubunCode = entity.shinsaHohoKubunCode;
        this.shinsaYM = entity.shinsaYM;
        this.shikyuKubunCode = entity.shikyuKubunCode;
        this.tensuKingaku = entity.tensuKingaku;
        this.shikyuKingaku = entity.shikyuKingaku;
        this.zougenten = entity.zougenten;
        this.seikyugakuSagakuKingaku = entity.seikyugakuSagakuKingaku;
        this.dekidakaSeikyugakuSagaku = entity.dekidakaSeikyugakuSagaku;
        this.zougenRiyu = entity.zougenRiyu;
        this.hushikyuRiyu = entity.hushikyuRiyu;
        this.kounyuKaishuRireki = entity.kounyuKaishuRireki;
    }

    /**
     * {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    public RString getMd5() {
        return super.toMd5(hiHokenshaNo, serviceTeikyoYM, seiriNo, jigyoshaNo, yoshikiNo, junjiNo, rirekiNo, serviceShuruiCode, serviceJitsunissu, planTanisu, gendogakuKanriTaishoTanisu, gendogakuKanriTaishogaiTanisu, tankiNyushoPlanNissu, tankiNyushoJitsunissu, tanisuTotal, tanisuTanka, seikyugaku, riyoshaFutangaku, dekidakaIryohiTanisuTotal, dekidakaIryohiSeikyugaku, dekidakaIryohiRiyoshaFutangaku, shinsaHohoKubunCode, shinsaYM, shikyuKubunCode, tensuKingaku, shikyuKingaku, zougenten, seikyugakuSagakuKingaku, dekidakaSeikyugakuSagaku, zougenRiyu, hushikyuRiyu, kounyuKaishuRireki);
    }

// </editor-fold>
}