package jp.co.ndensan.reams.db.dbc.entity.basic;

import java.util.Objects;
import java.util.UUID;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.KokanShikibetsuNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.NyuryokuShikibetsuNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ServiceKomokuCode;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;
import jp.co.ndensan.reams.uz.uza.util.db.TableName;

/**
 * 給付実績明細・住所地特例テーブルのエンティティクラスです。
 */
public class DbT3106KyufujissekiMeisaiJushochiTokureiEntity extends DbTableEntityBase<DbT3106KyufujissekiMeisaiJushochiTokureiEntity> implements IDbAccessable {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.3.9">

    @TableName
    public static final RString TABLE_NAME = new RString("DbT3106KyufujissekiMeisaiJushochiTokurei");

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
    private RString toshiNo;
    @PrimaryKey
    private ServiceShuruiCode serviceShuruiCode;
    @PrimaryKey
    private ServiceKomokuCode serviceKomokuCode;
    private int tanisu;
    private int nissuKaisu;
    private int kohi1TaishoNissuKaisu;
    private int kohi2TaishoNissuKaisu;
    private int kohi3TaishoNissuKaisu;
    private int serviceTanisu;
    private int kohi1TaishoServiceTanisu;
    private int kohi2TaishoServiceTanisu;
    private int kohi3TaishoServiceTanisu;
    private ShoKisaiHokenshaNo shisetsuShozaiHokenshaNo;
    private RString tekiyo;
    private int atoTanisu;
    private int atoNissuKaisu;
    private int atoKohi1TaishoNissuKaisu;
    private int atoKohi2TaishoNissukaisu;
    private int atoKohi3TaishoNissuKaisu;
    private int atoServiceTanisu;
    private int atoKohi1TaishoServiceTanisu;
    private int atoKohi2TaishoServiceTanisu;
    private int atoKohi3TaishoServiceTanisu;
    private int saishinsaKaisu;
    private int kagoKaisu;
    private FlexibleYearMonth shinsaYM;
    private RString seiriNo;
    private FlexibleYearMonth torikomiYM;

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
     * 交換情報識別番号のgetメソッドです。
     *
     * @return 交換情報識別番号
     */
    public KokanShikibetsuNo getKokanJohoShikibetsuNo() {
        return kokanJohoShikibetsuNo;
    }

    /**
     * 交換情報識別番号のsetメソッドです。
     *
     * @param kokanJohoShikibetsuNo 交換情報識別番号
     */
    public void setKokanJohoShikibetsuNo(KokanShikibetsuNo kokanJohoShikibetsuNo) {
        this.kokanJohoShikibetsuNo = kokanJohoShikibetsuNo;
    }

    /**
     * 入力識別番号のgetメソッドです。
     *
     * @return 入力識別番号
     */
    public NyuryokuShikibetsuNo getInputShikibetsuNo() {
        return inputShikibetsuNo;
    }

    /**
     * 入力識別番号のsetメソッドです。
     *
     * @param inputShikibetsuNo 入力識別番号
     */
    public void setInputShikibetsuNo(NyuryokuShikibetsuNo inputShikibetsuNo) {
        this.inputShikibetsuNo = inputShikibetsuNo;
    }

    /**
     * レコード種別コードのgetメソッドです。
     *
     * @return レコード種別コード
     */
    public RString getRecodeShubetsuCode() {
        return recodeShubetsuCode;
    }

    /**
     * レコード種別コードのsetメソッドです。
     *
     * @param recodeShubetsuCode レコード種別コード
     */
    public void setRecodeShubetsuCode(RString recodeShubetsuCode) {
        this.recodeShubetsuCode = recodeShubetsuCode;
    }

    /**
     * 証記載保険者番号のgetメソッドです。
     *
     * @return 証記載保険者番号
     */
    public HokenshaNo getShokisaiHokenshaNo() {
        return shokisaiHokenshaNo;
    }

    /**
     * 証記載保険者番号のsetメソッドです。
     *
     * @param shokisaiHokenshaNo 証記載保険者番号
     */
    public void setShokisaiHokenshaNo(HokenshaNo shokisaiHokenshaNo) {
        this.shokisaiHokenshaNo = shokisaiHokenshaNo;
    }

    /**
     * 被保険者番号のgetメソッドです。
     *
     * @return 被保険者番号
     */
    public HihokenshaNo getHiHokenshaNo() {
        return hiHokenshaNo;
    }

    /**
     * 被保険者番号のsetメソッドです。
     *
     * @param hiHokenshaNo 被保険者番号
     */
    public void setHiHokenshaNo(HihokenshaNo hiHokenshaNo) {
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
     * 事業所番号のgetメソッドです。
     *
     * @return 事業所番号
     */
    public JigyoshaNo getJigyoshoNo() {
        return jigyoshoNo;
    }

    /**
     * 事業所番号のsetメソッドです。
     *
     * @param jigyoshoNo 事業所番号
     */
    public void setJigyoshoNo(JigyoshaNo jigyoshoNo) {
        this.jigyoshoNo = jigyoshoNo;
    }

    /**
     * 通し番号のgetメソッドです。
     *
     * @return 通し番号
     */
    public RString getToshiNo() {
        return toshiNo;
    }

    /**
     * 通し番号のsetメソッドです。
     *
     * @param toshiNo 通し番号
     */
    public void setToshiNo(RString toshiNo) {
        this.toshiNo = toshiNo;
    }

    /**
     * サービス種類コードのgetメソッドです。
     *
     * @return サービス種類コード
     */
    public ServiceShuruiCode getServiceShuruiCode() {
        return serviceShuruiCode;
    }

    /**
     * サービス種類コードのsetメソッドです。
     *
     * @param serviceShuruiCode サービス種類コード
     */
    public void setServiceShuruiCode(ServiceShuruiCode serviceShuruiCode) {
        this.serviceShuruiCode = serviceShuruiCode;
    }

    /**
     * サービス項目コードのgetメソッドです。
     *
     * @return サービス項目コード
     */
    public ServiceKomokuCode getServiceKomokuCode() {
        return serviceKomokuCode;
    }

    /**
     * サービス項目コードのsetメソッドです。
     *
     * @param serviceKomokuCode サービス項目コード
     */
    public void setServiceKomokuCode(ServiceKomokuCode serviceKomokuCode) {
        this.serviceKomokuCode = serviceKomokuCode;
    }

    /**
     * 単位数のgetメソッドです。
     *
     * @return 単位数
     */
    public int getTanisu() {
        return tanisu;
    }

    /**
     * 単位数のsetメソッドです。
     *
     * @param tanisu 単位数
     */
    public void setTanisu(int tanisu) {
        this.tanisu = tanisu;
    }

    /**
     * 日数・回数のgetメソッドです。
     *
     * @return 日数・回数
     */
    public int getNissuKaisu() {
        return nissuKaisu;
    }

    /**
     * 日数・回数のsetメソッドです。
     *
     * @param nissuKaisu 日数・回数
     */
    public void setNissuKaisu(int nissuKaisu) {
        this.nissuKaisu = nissuKaisu;
    }

    /**
     * 公費１対象日数・回数のgetメソッドです。
     *
     * @return 公費１対象日数・回数
     */
    public int getKohi1TaishoNissuKaisu() {
        return kohi1TaishoNissuKaisu;
    }

    /**
     * 公費１対象日数・回数のsetメソッドです。
     *
     * @param kohi1TaishoNissuKaisu 公費１対象日数・回数
     */
    public void setKohi1TaishoNissuKaisu(int kohi1TaishoNissuKaisu) {
        this.kohi1TaishoNissuKaisu = kohi1TaishoNissuKaisu;
    }

    /**
     * 公費２対象日数・回数のgetメソッドです。
     *
     * @return 公費２対象日数・回数
     */
    public int getKohi2TaishoNissuKaisu() {
        return kohi2TaishoNissuKaisu;
    }

    /**
     * 公費２対象日数・回数のsetメソッドです。
     *
     * @param kohi2TaishoNissuKaisu 公費２対象日数・回数
     */
    public void setKohi2TaishoNissuKaisu(int kohi2TaishoNissuKaisu) {
        this.kohi2TaishoNissuKaisu = kohi2TaishoNissuKaisu;
    }

    /**
     * 公費３対象日数・回数のgetメソッドです。
     *
     * @return 公費３対象日数・回数
     */
    public int getKohi3TaishoNissuKaisu() {
        return kohi3TaishoNissuKaisu;
    }

    /**
     * 公費３対象日数・回数のsetメソッドです。
     *
     * @param kohi3TaishoNissuKaisu 公費３対象日数・回数
     */
    public void setKohi3TaishoNissuKaisu(int kohi3TaishoNissuKaisu) {
        this.kohi3TaishoNissuKaisu = kohi3TaishoNissuKaisu;
    }

    /**
     * サービス単位数のgetメソッドです。
     *
     * @return サービス単位数
     */
    public int getServiceTanisu() {
        return serviceTanisu;
    }

    /**
     * サービス単位数のsetメソッドです。
     *
     * @param serviceTanisu サービス単位数
     */
    public void setServiceTanisu(int serviceTanisu) {
        this.serviceTanisu = serviceTanisu;
    }

    /**
     * 公費１対象サービス単位数のgetメソッドです。
     *
     * @return 公費１対象サービス単位数
     */
    public int getKohi1TaishoServiceTanisu() {
        return kohi1TaishoServiceTanisu;
    }

    /**
     * 公費１対象サービス単位数のsetメソッドです。
     *
     * @param kohi1TaishoServiceTanisu 公費１対象サービス単位数
     */
    public void setKohi1TaishoServiceTanisu(int kohi1TaishoServiceTanisu) {
        this.kohi1TaishoServiceTanisu = kohi1TaishoServiceTanisu;
    }

    /**
     * 公費２対象サービス単位数のgetメソッドです。
     *
     * @return 公費２対象サービス単位数
     */
    public int getKohi2TaishoServiceTanisu() {
        return kohi2TaishoServiceTanisu;
    }

    /**
     * 公費２対象サービス単位数のsetメソッドです。
     *
     * @param kohi2TaishoServiceTanisu 公費２対象サービス単位数
     */
    public void setKohi2TaishoServiceTanisu(int kohi2TaishoServiceTanisu) {
        this.kohi2TaishoServiceTanisu = kohi2TaishoServiceTanisu;
    }

    /**
     * 公費３対象サービス単位数のgetメソッドです。
     *
     * @return 公費３対象サービス単位数
     */
    public int getKohi3TaishoServiceTanisu() {
        return kohi3TaishoServiceTanisu;
    }

    /**
     * 公費３対象サービス単位数のsetメソッドです。
     *
     * @param kohi3TaishoServiceTanisu 公費３対象サービス単位数
     */
    public void setKohi3TaishoServiceTanisu(int kohi3TaishoServiceTanisu) {
        this.kohi3TaishoServiceTanisu = kohi3TaishoServiceTanisu;
    }

    /**
     * 施設所在保険者番号のgetメソッドです。
     *
     * @return 施設所在保険者番号
     */
    public ShoKisaiHokenshaNo getShisetsuShozaiHokenshaNo() {
        return shisetsuShozaiHokenshaNo;
    }

    /**
     * 施設所在保険者番号のsetメソッドです。
     *
     * @param shisetsuShozaiHokenshaNo 施設所在保険者番号
     */
    public void setShisetsuShozaiHokenshaNo(ShoKisaiHokenshaNo shisetsuShozaiHokenshaNo) {
        this.shisetsuShozaiHokenshaNo = shisetsuShozaiHokenshaNo;
    }

    /**
     * 摘要のgetメソッドです。
     *
     * @return 摘要
     */
    public RString getTekiyo() {
        return tekiyo;
    }

    /**
     * 摘要のsetメソッドです。
     *
     * @param tekiyo 摘要
     */
    public void setTekiyo(RString tekiyo) {
        this.tekiyo = tekiyo;
    }

    /**
     * 後・単位数のgetメソッドです。
     *
     * @return 後・単位数
     */
    public int getAtoTanisu() {
        return atoTanisu;
    }

    /**
     * 後・単位数のsetメソッドです。
     *
     * @param atoTanisu 後・単位数
     */
    public void setAtoTanisu(int atoTanisu) {
        this.atoTanisu = atoTanisu;
    }

    /**
     * 後・日数・回数のgetメソッドです。
     *
     * @return 後・日数・回数
     */
    public int getAtoNissuKaisu() {
        return atoNissuKaisu;
    }

    /**
     * 後・日数・回数のsetメソッドです。
     *
     * @param atoNissuKaisu 後・日数・回数
     */
    public void setAtoNissuKaisu(int atoNissuKaisu) {
        this.atoNissuKaisu = atoNissuKaisu;
    }

    /**
     * 後・公費１対象日数・回数のgetメソッドです。
     *
     * @return 後・公費１対象日数・回数
     */
    public int getAtoKohi1TaishoNissuKaisu() {
        return atoKohi1TaishoNissuKaisu;
    }

    /**
     * 後・公費１対象日数・回数のsetメソッドです。
     *
     * @param atoKohi1TaishoNissuKaisu 後・公費１対象日数・回数
     */
    public void setAtoKohi1TaishoNissuKaisu(int atoKohi1TaishoNissuKaisu) {
        this.atoKohi1TaishoNissuKaisu = atoKohi1TaishoNissuKaisu;
    }

    /**
     * 後・公費２対象日数・回数のgetメソッドです。
     *
     * @return 後・公費２対象日数・回数
     */
    public int getAtoKohi2TaishoNissukaisu() {
        return atoKohi2TaishoNissukaisu;
    }

    /**
     * 後・公費２対象日数・回数のsetメソッドです。
     *
     * @param atoKohi2TaishoNissukaisu 後・公費２対象日数・回数
     */
    public void setAtoKohi2TaishoNissukaisu(int atoKohi2TaishoNissukaisu) {
        this.atoKohi2TaishoNissukaisu = atoKohi2TaishoNissukaisu;
    }

    /**
     * 後・公費３対象日数・回数のgetメソッドです。
     *
     * @return 後・公費３対象日数・回数
     */
    public int getAtoKohi3TaishoNissuKaisu() {
        return atoKohi3TaishoNissuKaisu;
    }

    /**
     * 後・公費３対象日数・回数のsetメソッドです。
     *
     * @param atoKohi3TaishoNissuKaisu 後・公費３対象日数・回数
     */
    public void setAtoKohi3TaishoNissuKaisu(int atoKohi3TaishoNissuKaisu) {
        this.atoKohi3TaishoNissuKaisu = atoKohi3TaishoNissuKaisu;
    }

    /**
     * 後・サービス単位数のgetメソッドです。
     *
     * @return 後・サービス単位数
     */
    public int getAtoServiceTanisu() {
        return atoServiceTanisu;
    }

    /**
     * 後・サービス単位数のsetメソッドです。
     *
     * @param atoServiceTanisu 後・サービス単位数
     */
    public void setAtoServiceTanisu(int atoServiceTanisu) {
        this.atoServiceTanisu = atoServiceTanisu;
    }

    /**
     * 後・公費１対象サービス単位数のgetメソッドです。
     *
     * @return 後・公費１対象サービス単位数
     */
    public int getAtoKohi1TaishoServiceTanisu() {
        return atoKohi1TaishoServiceTanisu;
    }

    /**
     * 後・公費１対象サービス単位数のsetメソッドです。
     *
     * @param atoKohi1TaishoServiceTanisu 後・公費１対象サービス単位数
     */
    public void setAtoKohi1TaishoServiceTanisu(int atoKohi1TaishoServiceTanisu) {
        this.atoKohi1TaishoServiceTanisu = atoKohi1TaishoServiceTanisu;
    }

    /**
     * 後・公費２対象サービス単位数のgetメソッドです。
     *
     * @return 後・公費２対象サービス単位数
     */
    public int getAtoKohi2TaishoServiceTanisu() {
        return atoKohi2TaishoServiceTanisu;
    }

    /**
     * 後・公費２対象サービス単位数のsetメソッドです。
     *
     * @param atoKohi2TaishoServiceTanisu 後・公費２対象サービス単位数
     */
    public void setAtoKohi2TaishoServiceTanisu(int atoKohi2TaishoServiceTanisu) {
        this.atoKohi2TaishoServiceTanisu = atoKohi2TaishoServiceTanisu;
    }

    /**
     * 後・公費３対象サービス単位数のgetメソッドです。
     *
     * @return 後・公費３対象サービス単位数
     */
    public int getAtoKohi3TaishoServiceTanisu() {
        return atoKohi3TaishoServiceTanisu;
    }

    /**
     * 後・公費３対象サービス単位数のsetメソッドです。
     *
     * @param atoKohi3TaishoServiceTanisu 後・公費３対象サービス単位数
     */
    public void setAtoKohi3TaishoServiceTanisu(int atoKohi3TaishoServiceTanisu) {
        this.atoKohi3TaishoServiceTanisu = atoKohi3TaishoServiceTanisu;
    }

    /**
     * 再審査回数のgetメソッドです。
     *
     * @return 再審査回数
     */
    public int getSaishinsaKaisu() {
        return saishinsaKaisu;
    }

    /**
     * 再審査回数のsetメソッドです。
     *
     * @param saishinsaKaisu 再審査回数
     */
    public void setSaishinsaKaisu(int saishinsaKaisu) {
        this.saishinsaKaisu = saishinsaKaisu;
    }

    /**
     * 過誤回数のgetメソッドです。
     *
     * @return 過誤回数
     */
    public int getKagoKaisu() {
        return kagoKaisu;
    }

    /**
     * 過誤回数のsetメソッドです。
     *
     * @param kagoKaisu 過誤回数
     */
    public void setKagoKaisu(int kagoKaisu) {
        this.kagoKaisu = kagoKaisu;
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
     * 取込年月のgetメソッドです。
     *
     * @return 取込年月
     */
    public FlexibleYearMonth getTorikomiYM() {
        return torikomiYM;
    }

    /**
     * 取込年月のsetメソッドです。
     *
     * @param torikomiYM 取込年月
     */
    public void setTorikomiYM(FlexibleYearMonth torikomiYM) {
        this.torikomiYM = torikomiYM;
    }

    /**
     * このエンティティの主キーが他の{@literal DbT3106KyufujissekiMeisaiJushochiTokureiEntity}と等しいか判定します。
     *
     * @param other 比較するエンティティ
     * @@return
     * 比較するエンティティが同じ主キーを持つ{@literal DbT3106KyufujissekiMeisaiJushochiTokureiEntity}の場合{@literal true}、それ以外の場合は{@literal false}
     */
    @Override
    public boolean equalsPrimaryKeys(DbT3106KyufujissekiMeisaiJushochiTokureiEntity other) {
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
        if (!Objects.equals(this.toshiNo, other.toshiNo)) {
            return false;
        }
        if (!Objects.equals(this.serviceShuruiCode, other.serviceShuruiCode)) {
            return false;
        }
        if (!Objects.equals(this.serviceKomokuCode, other.serviceKomokuCode)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void shallowCopy(DbT3106KyufujissekiMeisaiJushochiTokureiEntity entity) {
        this.kokanJohoShikibetsuNo = entity.kokanJohoShikibetsuNo;
        this.inputShikibetsuNo = entity.inputShikibetsuNo;
        this.recodeShubetsuCode = entity.recodeShubetsuCode;
        this.shokisaiHokenshaNo = entity.shokisaiHokenshaNo;
        this.hiHokenshaNo = entity.hiHokenshaNo;
        this.serviceTeikyoYM = entity.serviceTeikyoYM;
        this.jigyoshoNo = entity.jigyoshoNo;
        this.toshiNo = entity.toshiNo;
        this.serviceShuruiCode = entity.serviceShuruiCode;
        this.serviceKomokuCode = entity.serviceKomokuCode;
        this.tanisu = entity.tanisu;
        this.nissuKaisu = entity.nissuKaisu;
        this.kohi1TaishoNissuKaisu = entity.kohi1TaishoNissuKaisu;
        this.kohi2TaishoNissuKaisu = entity.kohi2TaishoNissuKaisu;
        this.kohi3TaishoNissuKaisu = entity.kohi3TaishoNissuKaisu;
        this.serviceTanisu = entity.serviceTanisu;
        this.kohi1TaishoServiceTanisu = entity.kohi1TaishoServiceTanisu;
        this.kohi2TaishoServiceTanisu = entity.kohi2TaishoServiceTanisu;
        this.kohi3TaishoServiceTanisu = entity.kohi3TaishoServiceTanisu;
        this.shisetsuShozaiHokenshaNo = entity.shisetsuShozaiHokenshaNo;
        this.tekiyo = entity.tekiyo;
        this.atoTanisu = entity.atoTanisu;
        this.atoNissuKaisu = entity.atoNissuKaisu;
        this.atoKohi1TaishoNissuKaisu = entity.atoKohi1TaishoNissuKaisu;
        this.atoKohi2TaishoNissukaisu = entity.atoKohi2TaishoNissukaisu;
        this.atoKohi3TaishoNissuKaisu = entity.atoKohi3TaishoNissuKaisu;
        this.atoServiceTanisu = entity.atoServiceTanisu;
        this.atoKohi1TaishoServiceTanisu = entity.atoKohi1TaishoServiceTanisu;
        this.atoKohi2TaishoServiceTanisu = entity.atoKohi2TaishoServiceTanisu;
        this.atoKohi3TaishoServiceTanisu = entity.atoKohi3TaishoServiceTanisu;
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
        return super.toMd5(kokanJohoShikibetsuNo, inputShikibetsuNo, recodeShubetsuCode, shokisaiHokenshaNo, hiHokenshaNo, serviceTeikyoYM, jigyoshoNo, toshiNo, serviceShuruiCode, serviceKomokuCode, tanisu, nissuKaisu, kohi1TaishoNissuKaisu, kohi2TaishoNissuKaisu, kohi3TaishoNissuKaisu, serviceTanisu, kohi1TaishoServiceTanisu, kohi2TaishoServiceTanisu, kohi3TaishoServiceTanisu, shisetsuShozaiHokenshaNo, tekiyo, atoTanisu, atoNissuKaisu, atoKohi1TaishoNissuKaisu, atoKohi2TaishoNissukaisu, atoKohi3TaishoNissuKaisu, atoServiceTanisu, atoKohi1TaishoServiceTanisu, atoKohi2TaishoServiceTanisu, atoKohi3TaishoServiceTanisu, saishinsaKaisu, kagoKaisu, shinsaYM, seiriNo, torikomiYM);
    }

// </editor-fold>
}