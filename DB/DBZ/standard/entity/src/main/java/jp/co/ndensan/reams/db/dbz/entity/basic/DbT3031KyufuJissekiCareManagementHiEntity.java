package jp.co.ndensan.reams.db.dbz.entity.basic;

import java.util.Objects;
import java.util.UUID;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.KokanShikibetsuNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.NyuryokuShikibetsuNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ServiceCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;
import jp.co.ndensan.reams.uz.uza.util.db.TableName;

/**
 * DbT3031KyufuJissekiCareManagementHiの項目定義クラスです
 *
 */
public class DbT3031KyufuJissekiCareManagementHiEntity extends DbTableEntityBase<DbT3031KyufuJissekiCareManagementHiEntity> implements IDbAccessable {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.3.1">

    @TableName
    public static final RString TABLE_NAME = new RString("DbT3031KyufuJissekiCareManagementHi");

    private RString insertDantaiCd;
    private RDateTime insertTimestamp;
    private RString insertReamsLoginId;
    private UUID insertContextId;
    private boolean isDeleted = false;
    private int updateCount = 0;
    private RDateTime lastUpdateTimestamp;
    private RString lastUpdateReamsLoginId;
    @PrimaryKey
    private KokanShikibetsuNo kokanJohoShikibetsuNo;
    @PrimaryKey
    private NyuryokuShikibetsuNo inputShikibetsuNo;
    @PrimaryKey
    private RString recodeShubetsuCode;
    @PrimaryKey
    private HokenshaNo shokisaiHokenshaNo;
    @PrimaryKey
    private HihokenshaNo hiHokenshaNo;
    @PrimaryKey
    private FlexibleYearMonth serviceTeikyoYM;
    @PrimaryKey
    private JigyoshaNo jigyoshoNo;
    @PrimaryKey
    private RString shiteiKijungaitoJigyoshoKubunCode;
    @PrimaryKey
    private FlexibleDate kyotakuServiceSakuseiIraiYMD;
    @PrimaryKey
    private RString toshiNo;
    @PrimaryKey
    private RString servicePlanhiMeisaiLineNo;
    private Decimal tanisuTanka;
    private ServiceCode serviceCode;
    private int tanisu;
    private int kaisu;
    private int serviceTanisu;
    private int serivceTanisuTotal;
    private int seikyuKingaku;
    private RString tantoKaigoShienSemmoninNo;
    private RString tekiyo;
    private int riyoushaFutangaku;
    private int atoTanisu;
    private int atoKaisu;
    private int atoServiceTanisu;
    private int atoServiceTanisuTotal;
    private int atoSeikyuKingaku;
    private int atoRiyoshaFutangaku;
    private int saishinsaKaisu;
    private int kagoKaisu;
    private FlexibleYearMonth shinsaYM;
    private RString seiriNo;
    private FlexibleYearMonth torikomiYM;

    /**
     * getInsertDantaiCd
     *
     * @return insertDantaiCd
     */
    public RString getInsertDantaiCd() {
        return insertDantaiCd;
    }

    /**
     * setInsertDantaiCd
     *
     * @param insertDantaiCd insertDantaiCd
     */
    public void setInsertDantaiCd(RString insertDantaiCd) {
        this.insertDantaiCd = insertDantaiCd;
    }

    /**
     * getIsDeleted
     *
     * @return isDeleted
     */
    public boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * setIsDeleted
     *
     * @param isDeleted isDeleted
     */
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * setLastUpdateReamsLoginId
     *
     * @param lastUpdateReamsLoginId lastUpdateReamsLoginId
     */
    public void setLastUpdateReamsLoginId(RString lastUpdateReamsLoginId) {
        this.lastUpdateReamsLoginId = lastUpdateReamsLoginId;
    }

    /**
     * getKokanJohoShikibetsuNo
     *
     * @return kokanJohoShikibetsuNo
     */
    public KokanShikibetsuNo getKokanJohoShikibetsuNo() {
        return kokanJohoShikibetsuNo;
    }

    /**
     * setKokanJohoShikibetsuNo
     *
     * @param kokanJohoShikibetsuNo kokanJohoShikibetsuNo
     */
    public void setKokanJohoShikibetsuNo(KokanShikibetsuNo kokanJohoShikibetsuNo) {
        this.kokanJohoShikibetsuNo = kokanJohoShikibetsuNo;
    }

    /**
     * getInputShikibetsuNo
     *
     * @return inputShikibetsuNo
     */
    public NyuryokuShikibetsuNo getInputShikibetsuNo() {
        return inputShikibetsuNo;
    }

    /**
     * setInputShikibetsuNo
     *
     * @param inputShikibetsuNo inputShikibetsuNo
     */
    public void setInputShikibetsuNo(NyuryokuShikibetsuNo inputShikibetsuNo) {
        this.inputShikibetsuNo = inputShikibetsuNo;
    }

    /**
     * getRecodeShubetsuCode
     *
     * @return recodeShubetsuCode
     */
    public RString getRecodeShubetsuCode() {
        return recodeShubetsuCode;
    }

    /**
     * setRecodeShubetsuCode
     *
     * @param recodeShubetsuCode recodeShubetsuCode
     */
    public void setRecodeShubetsuCode(RString recodeShubetsuCode) {
        this.recodeShubetsuCode = recodeShubetsuCode;
    }

    /**
     * getShokisaiHokenshaNo
     *
     * @return shokisaiHokenshaNo
     */
    public HokenshaNo getShokisaiHokenshaNo() {
        return shokisaiHokenshaNo;
    }

    /**
     * setShokisaiHokenshaNo
     *
     * @param shokisaiHokenshaNo shokisaiHokenshaNo
     */
    public void setShokisaiHokenshaNo(HokenshaNo shokisaiHokenshaNo) {
        this.shokisaiHokenshaNo = shokisaiHokenshaNo;
    }

    /**
     * getHiHokenshaNo
     *
     * @return hiHokenshaNo
     */
    public HihokenshaNo getHiHokenshaNo() {
        return hiHokenshaNo;
    }

    /**
     * setHiHokenshaNo
     *
     * @param hiHokenshaNo hiHokenshaNo
     */
    public void setHiHokenshaNo(HihokenshaNo hiHokenshaNo) {
        this.hiHokenshaNo = hiHokenshaNo;
    }

    /**
     * getServiceTeikyoYM
     *
     * @return serviceTeikyoYM
     */
    public FlexibleYearMonth getServiceTeikyoYM() {
        return serviceTeikyoYM;
    }

    /**
     * setServiceTeikyoYM
     *
     * @param serviceTeikyoYM serviceTeikyoYM
     */
    public void setServiceTeikyoYM(FlexibleYearMonth serviceTeikyoYM) {
        this.serviceTeikyoYM = serviceTeikyoYM;
    }

    /**
     * getJigyoshoNo
     *
     * @return jigyoshoNo
     */
    public JigyoshaNo getJigyoshoNo() {
        return jigyoshoNo;
    }

    /**
     * setJigyoshoNo
     *
     * @param jigyoshoNo jigyoshoNo
     */
    public void setJigyoshoNo(JigyoshaNo jigyoshoNo) {
        this.jigyoshoNo = jigyoshoNo;
    }

    /**
     * getShiteiKijungaitoJigyoshoKubunCode
     *
     * @return shiteiKijungaitoJigyoshoKubunCode
     */
    public RString getShiteiKijungaitoJigyoshoKubunCode() {
        return shiteiKijungaitoJigyoshoKubunCode;
    }

    /**
     * setShiteiKijungaitoJigyoshoKubunCode
     *
     * @param shiteiKijungaitoJigyoshoKubunCode shiteiKijungaitoJigyoshoKubunCode
     */
    public void setShiteiKijungaitoJigyoshoKubunCode(RString shiteiKijungaitoJigyoshoKubunCode) {
        this.shiteiKijungaitoJigyoshoKubunCode = shiteiKijungaitoJigyoshoKubunCode;
    }

    /**
     * getKyotakuServiceSakuseiIraiYMD
     *
     * @return kyotakuServiceSakuseiIraiYMD
     */
    public FlexibleDate getKyotakuServiceSakuseiIraiYMD() {
        return kyotakuServiceSakuseiIraiYMD;
    }

    /**
     * setKyotakuServiceSakuseiIraiYMD
     *
     * @param kyotakuServiceSakuseiIraiYMD kyotakuServiceSakuseiIraiYMD
     */
    public void setKyotakuServiceSakuseiIraiYMD(FlexibleDate kyotakuServiceSakuseiIraiYMD) {
        this.kyotakuServiceSakuseiIraiYMD = kyotakuServiceSakuseiIraiYMD;
    }

    /**
     * getToshiNo
     *
     * @return toshiNo
     */
    public RString getToshiNo() {
        return toshiNo;
    }

    /**
     * setToshiNo
     *
     * @param toshiNo toshiNo
     */
    public void setToshiNo(RString toshiNo) {
        this.toshiNo = toshiNo;
    }

    /**
     * getServicePlanhiMeisaiLineNo
     *
     * @return servicePlanhiMeisaiLineNo
     */
    public RString getServicePlanhiMeisaiLineNo() {
        return servicePlanhiMeisaiLineNo;
    }

    /**
     * setServicePlanhiMeisaiLineNo
     *
     * @param servicePlanhiMeisaiLineNo servicePlanhiMeisaiLineNo
     */
    public void setServicePlanhiMeisaiLineNo(RString servicePlanhiMeisaiLineNo) {
        this.servicePlanhiMeisaiLineNo = servicePlanhiMeisaiLineNo;
    }

    /**
     * getTanisuTanka
     *
     * @return tanisuTanka
     */
    public Decimal getTanisuTanka() {
        return tanisuTanka;
    }

    /**
     * setTanisuTanka
     *
     * @param tanisuTanka tanisuTanka
     */
    public void setTanisuTanka(Decimal tanisuTanka) {
        this.tanisuTanka = tanisuTanka;
    }

    /**
     * getServiceCode
     *
     * @return serviceCode
     */
    public ServiceCode getServiceCode() {
        return serviceCode;
    }

    /**
     * setServiceCode
     *
     * @param serviceCode serviceCode
     */
    public void setServiceCode(ServiceCode serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * getTanisu
     *
     * @return tanisu
     */
    public int getTanisu() {
        return tanisu;
    }

    /**
     * setTanisu
     *
     * @param tanisu tanisu
     */
    public void setTanisu(int tanisu) {
        this.tanisu = tanisu;
    }

    /**
     * getKaisu
     *
     * @return kaisu
     */
    public int getKaisu() {
        return kaisu;
    }

    /**
     * setKaisu
     *
     * @param kaisu kaisu
     */
    public void setKaisu(int kaisu) {
        this.kaisu = kaisu;
    }

    /**
     * getServiceTanisu
     *
     * @return serviceTanisu
     */
    public int getServiceTanisu() {
        return serviceTanisu;
    }

    /**
     * setServiceTanisu
     *
     * @param serviceTanisu serviceTanisu
     */
    public void setServiceTanisu(int serviceTanisu) {
        this.serviceTanisu = serviceTanisu;
    }

    /**
     * getSerivceTanisuTotal
     *
     * @return serivceTanisuTotal
     */
    public int getSerivceTanisuTotal() {
        return serivceTanisuTotal;
    }

    /**
     * setSerivceTanisuTotal
     *
     * @param serivceTanisuTotal serivceTanisuTotal
     */
    public void setSerivceTanisuTotal(int serivceTanisuTotal) {
        this.serivceTanisuTotal = serivceTanisuTotal;
    }

    /**
     * getSeikyuKingaku
     *
     * @return seikyuKingaku
     */
    public int getSeikyuKingaku() {
        return seikyuKingaku;
    }

    /**
     * setSeikyuKingaku
     *
     * @param seikyuKingaku seikyuKingaku
     */
    public void setSeikyuKingaku(int seikyuKingaku) {
        this.seikyuKingaku = seikyuKingaku;
    }

    /**
     * getTantoKaigoShienSemmoninNo
     *
     * @return tantoKaigoShienSemmoninNo
     */
    public RString getTantoKaigoShienSemmoninNo() {
        return tantoKaigoShienSemmoninNo;
    }

    /**
     * setTantoKaigoShienSemmoninNo
     *
     * @param tantoKaigoShienSemmoninNo tantoKaigoShienSemmoninNo
     */
    public void setTantoKaigoShienSemmoninNo(RString tantoKaigoShienSemmoninNo) {
        this.tantoKaigoShienSemmoninNo = tantoKaigoShienSemmoninNo;
    }

    /**
     * getTekiyo
     *
     * @return tekiyo
     */
    public RString getTekiyo() {
        return tekiyo;
    }

    /**
     * setTekiyo
     *
     * @param tekiyo tekiyo
     */
    public void setTekiyo(RString tekiyo) {
        this.tekiyo = tekiyo;
    }

    /**
     * getRiyoushaFutangaku
     *
     * @return riyoushaFutangaku
     */
    public int getRiyoushaFutangaku() {
        return riyoushaFutangaku;
    }

    /**
     * setRiyoushaFutangaku
     *
     * @param riyoushaFutangaku riyoushaFutangaku
     */
    public void setRiyoushaFutangaku(int riyoushaFutangaku) {
        this.riyoushaFutangaku = riyoushaFutangaku;
    }

    /**
     * getAtoTanisu
     *
     * @return atoTanisu
     */
    public int getAtoTanisu() {
        return atoTanisu;
    }

    /**
     * setAtoTanisu
     *
     * @param atoTanisu atoTanisu
     */
    public void setAtoTanisu(int atoTanisu) {
        this.atoTanisu = atoTanisu;
    }

    /**
     * getAtoKaisu
     *
     * @return atoKaisu
     */
    public int getAtoKaisu() {
        return atoKaisu;
    }

    /**
     * setAtoKaisu
     *
     * @param atoKaisu atoKaisu
     */
    public void setAtoKaisu(int atoKaisu) {
        this.atoKaisu = atoKaisu;
    }

    /**
     * getAtoServiceTanisu
     *
     * @return atoServiceTanisu
     */
    public int getAtoServiceTanisu() {
        return atoServiceTanisu;
    }

    /**
     * setAtoServiceTanisu
     *
     * @param atoServiceTanisu atoServiceTanisu
     */
    public void setAtoServiceTanisu(int atoServiceTanisu) {
        this.atoServiceTanisu = atoServiceTanisu;
    }

    /**
     * getAtoServiceTanisuTotal
     *
     * @return atoServiceTanisuTotal
     */
    public int getAtoServiceTanisuTotal() {
        return atoServiceTanisuTotal;
    }

    /**
     * setAtoServiceTanisuTotal
     *
     * @param atoServiceTanisuTotal atoServiceTanisuTotal
     */
    public void setAtoServiceTanisuTotal(int atoServiceTanisuTotal) {
        this.atoServiceTanisuTotal = atoServiceTanisuTotal;
    }

    /**
     * getAtoSeikyuKingaku
     *
     * @return atoSeikyuKingaku
     */
    public int getAtoSeikyuKingaku() {
        return atoSeikyuKingaku;
    }

    /**
     * setAtoSeikyuKingaku
     *
     * @param atoSeikyuKingaku atoSeikyuKingaku
     */
    public void setAtoSeikyuKingaku(int atoSeikyuKingaku) {
        this.atoSeikyuKingaku = atoSeikyuKingaku;
    }

    /**
     * getAtoRiyoshaFutangaku
     *
     * @return atoRiyoshaFutangaku
     */
    public int getAtoRiyoshaFutangaku() {
        return atoRiyoshaFutangaku;
    }

    /**
     * setAtoRiyoshaFutangaku
     *
     * @param atoRiyoshaFutangaku atoRiyoshaFutangaku
     */
    public void setAtoRiyoshaFutangaku(int atoRiyoshaFutangaku) {
        this.atoRiyoshaFutangaku = atoRiyoshaFutangaku;
    }

    /**
     * getSaishinsaKaisu
     *
     * @return saishinsaKaisu
     */
    public int getSaishinsaKaisu() {
        return saishinsaKaisu;
    }

    /**
     * setSaishinsaKaisu
     *
     * @param saishinsaKaisu saishinsaKaisu
     */
    public void setSaishinsaKaisu(int saishinsaKaisu) {
        this.saishinsaKaisu = saishinsaKaisu;
    }

    /**
     * getKagoKaisu
     *
     * @return kagoKaisu
     */
    public int getKagoKaisu() {
        return kagoKaisu;
    }

    /**
     * setKagoKaisu
     *
     * @param kagoKaisu kagoKaisu
     */
    public void setKagoKaisu(int kagoKaisu) {
        this.kagoKaisu = kagoKaisu;
    }

    /**
     * getShinsaYM
     *
     * @return shinsaYM
     */
    public FlexibleYearMonth getShinsaYM() {
        return shinsaYM;
    }

    /**
     * setShinsaYM
     *
     * @param shinsaYM shinsaYM
     */
    public void setShinsaYM(FlexibleYearMonth shinsaYM) {
        this.shinsaYM = shinsaYM;
    }

    /**
     * getSeiriNo
     *
     * @return seiriNo
     */
    public RString getSeiriNo() {
        return seiriNo;
    }

    /**
     * setSeiriNo
     *
     * @param seiriNo seiriNo
     */
    public void setSeiriNo(RString seiriNo) {
        this.seiriNo = seiriNo;
    }

    /**
     * getTorikomiYM
     *
     * @return torikomiYM
     */
    public FlexibleYearMonth getTorikomiYM() {
        return torikomiYM;
    }

    /**
     * setTorikomiYM
     *
     * @param torikomiYM torikomiYM
     */
    public void setTorikomiYM(FlexibleYearMonth torikomiYM) {
        this.torikomiYM = torikomiYM;
    }

    /**
     * このエンティティの主キーが他の{@literal DbT3031KyufuJissekiCareManagementHiEntity}と等しいか判定します。
     *
     * @param other 比較するエンティティ
     * @@return
     * 比較するエンティティが同じ主キーを持つ{@literal DbT3031KyufuJissekiCareManagementHiEntity}の場合{@literal true}、それ以外の場合は{@literal false}
     */
    @Override
    public boolean equalsPrimaryKeys(DbT3031KyufuJissekiCareManagementHiEntity other) {
        if (other == null) {
            return false;
        }
        if (!Objects.equals(this.kokanJohoShikibetsuNo, other.kokanJohoShikibetsuNo)) {
            return false;
        }
        if (!Objects.equals(this.inputShikibetsuNo, other.inputShikibetsuNo)) {
            return false;
        }
        if (!Objects.equals(this.recodeShubetsuCode, other.recodeShubetsuCode)) {
            return false;
        }
        if (!Objects.equals(this.shokisaiHokenshaNo, other.shokisaiHokenshaNo)) {
            return false;
        }
        if (!Objects.equals(this.hiHokenshaNo, other.hiHokenshaNo)) {
            return false;
        }
        if (!Objects.equals(this.serviceTeikyoYM, other.serviceTeikyoYM)) {
            return false;
        }
        if (!Objects.equals(this.jigyoshoNo, other.jigyoshoNo)) {
            return false;
        }
        if (!Objects.equals(this.shiteiKijungaitoJigyoshoKubunCode, other.shiteiKijungaitoJigyoshoKubunCode)) {
            return false;
        }
        if (!Objects.equals(this.kyotakuServiceSakuseiIraiYMD, other.kyotakuServiceSakuseiIraiYMD)) {
            return false;
        }
        if (!Objects.equals(this.toshiNo, other.toshiNo)) {
            return false;
        }
        if (!Objects.equals(this.servicePlanhiMeisaiLineNo, other.servicePlanhiMeisaiLineNo)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void shallowCopy(DbT3031KyufuJissekiCareManagementHiEntity entity) {
        this.kokanJohoShikibetsuNo = entity.kokanJohoShikibetsuNo;
        this.inputShikibetsuNo = entity.inputShikibetsuNo;
        this.recodeShubetsuCode = entity.recodeShubetsuCode;
        this.shokisaiHokenshaNo = entity.shokisaiHokenshaNo;
        this.hiHokenshaNo = entity.hiHokenshaNo;
        this.serviceTeikyoYM = entity.serviceTeikyoYM;
        this.jigyoshoNo = entity.jigyoshoNo;
        this.shiteiKijungaitoJigyoshoKubunCode = entity.shiteiKijungaitoJigyoshoKubunCode;
        this.kyotakuServiceSakuseiIraiYMD = entity.kyotakuServiceSakuseiIraiYMD;
        this.toshiNo = entity.toshiNo;
        this.servicePlanhiMeisaiLineNo = entity.servicePlanhiMeisaiLineNo;
        this.tanisuTanka = entity.tanisuTanka;
        this.serviceCode = entity.serviceCode;
        this.tanisu = entity.tanisu;
        this.kaisu = entity.kaisu;
        this.serviceTanisu = entity.serviceTanisu;
        this.serivceTanisuTotal = entity.serivceTanisuTotal;
        this.seikyuKingaku = entity.seikyuKingaku;
        this.tantoKaigoShienSemmoninNo = entity.tantoKaigoShienSemmoninNo;
        this.tekiyo = entity.tekiyo;
        this.riyoushaFutangaku = entity.riyoushaFutangaku;
        this.atoTanisu = entity.atoTanisu;
        this.atoKaisu = entity.atoKaisu;
        this.atoServiceTanisu = entity.atoServiceTanisu;
        this.atoServiceTanisuTotal = entity.atoServiceTanisuTotal;
        this.atoSeikyuKingaku = entity.atoSeikyuKingaku;
        this.atoRiyoshaFutangaku = entity.atoRiyoshaFutangaku;
        this.saishinsaKaisu = entity.saishinsaKaisu;
        this.kagoKaisu = entity.kagoKaisu;
        this.shinsaYM = entity.shinsaYM;
        this.seiriNo = entity.seiriNo;
        this.torikomiYM = entity.torikomiYM;
    }

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public RString getMd5() {
        return super.toMd5(kokanJohoShikibetsuNo, inputShikibetsuNo, recodeShubetsuCode, shokisaiHokenshaNo, hiHokenshaNo, serviceTeikyoYM, jigyoshoNo, shiteiKijungaitoJigyoshoKubunCode, kyotakuServiceSakuseiIraiYMD, toshiNo, servicePlanhiMeisaiLineNo, tanisuTanka, serviceCode, tanisu, kaisu, serviceTanisu, serivceTanisuTotal, seikyuKingaku, tantoKaigoShienSemmoninNo, tekiyo, riyoushaFutangaku, atoTanisu, atoKaisu, atoServiceTanisu, atoServiceTanisuTotal, atoSeikyuKingaku, atoRiyoshaFutangaku, saishinsaKaisu, kagoKaisu, shinsaYM, seiriNo, torikomiYM);
    }

// </editor-fold>
}