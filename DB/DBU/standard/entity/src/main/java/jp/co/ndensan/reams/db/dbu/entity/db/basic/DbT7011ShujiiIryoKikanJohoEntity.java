package jp.co.ndensan.reams.db.dbu.entity.db.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;
import jp.co.ndensan.reams.uz.uza.util.db.TableName;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import java.util.UUID;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.biz.TelNo;
import jp.co.ndensan.reams.uz.uza.biz.KinyuKikanCode;
import jp.co.ndensan.reams.uz.uza.biz.KinyuKikanShitenCode;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import java.util.Objects;

/**
 * 主治医医療機関情報　継承テーブルのエンティティクラスです。
 */
public class DbT7011ShujiiIryoKikanJohoEntity extends DbTableEntityBase<DbT7011ShujiiIryoKikanJohoEntity> implements IDbAccessable {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.3.9">
    @TableName
    public static final RString TABLE_NAME = new RString("DbT7011ShujiiIryoKikanJoho");

    private RString insertDantaiCd;
    private RDateTime insertTimestamp;
    private RString insertReamsLoginId;
    private UUID insertContextId;
    private boolean isDeleted = false;
    private int updateCount = 0;
    private RDateTime lastUpdateTimestamp;
    private RString lastUpdateReamsLoginId;
    @PrimaryKey
    private LasdecCode shichosonCode;
    @PrimaryKey
    private RString kaigoIryokikanCode;
    private RString iryokikanCode;
    private RString iryokikanJokyo;
    private RString iryoKikanMeisho;
    private RString iryoKikanMeishoKana;
    private YubinNo yubinNo;
    private RString jusho;
    private RString jushoKana;
    private TelNo telNo;
    private KinyuKikanCode ginkoCode;
    private KinyuKikanShitenCode shitenCode;
    private Code kozaShubetsu;
    private Code kozaNo;
    private RString kozaMeiginin;
    private RString kozaMeigininKana;
    private Code kikanKubunCode;

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
     * 市町村コードのgetメソッドです。
     * 
     * @return 市町村コード
     */
    public LasdecCode getShichosonCode() {
        return shichosonCode;
    }

    /**
     * 市町村コードのsetメソッドです。
     * 
     * @param shichosonCode 市町村コード
     */
    public void setShichosonCode(LasdecCode shichosonCode) {
        this.shichosonCode = shichosonCode;
    }

    /**
     * 介護医療機関コードのgetメソッドです。
     * 
     * @return 介護医療機関コード
     */
    public RString getKaigoIryokikanCode() {
        return kaigoIryokikanCode;
    }

    /**
     * 介護医療機関コードのsetメソッドです。
     * 
     * @param kaigoIryokikanCode 介護医療機関コード
     */
    public void setKaigoIryokikanCode(RString kaigoIryokikanCode) {
        this.kaigoIryokikanCode = kaigoIryokikanCode;
    }

    /**
     * 医療機関コードのgetメソッドです。
     * 
     * @return 医療機関コード
     */
    public RString getIryokikanCode() {
        return iryokikanCode;
    }

    /**
     * 医療機関コードのsetメソッドです。
     * 
     * @param iryokikanCode 医療機関コード
     */
    public void setIryokikanCode(RString iryokikanCode) {
        this.iryokikanCode = iryokikanCode;
    }

    /**
     * 医療機関の状況のgetメソッドです。
     * 
     * @return 医療機関の状況
     */
    public RString getIryokikanJokyo() {
        return iryokikanJokyo;
    }

    /**
     * 医療機関の状況のsetメソッドです。
     * 
     * @param iryokikanJokyo 医療機関の状況
     */
    public void setIryokikanJokyo(RString iryokikanJokyo) {
        this.iryokikanJokyo = iryokikanJokyo;
    }

    /**
     * 医療機関名称のgetメソッドです。
     * 
     * @return 医療機関名称
     */
    public RString getIryoKikanMeisho() {
        return iryoKikanMeisho;
    }

    /**
     * 医療機関名称のsetメソッドです。
     * 
     * @param iryoKikanMeisho 医療機関名称
     */
    public void setIryoKikanMeisho(RString iryoKikanMeisho) {
        this.iryoKikanMeisho = iryoKikanMeisho;
    }

    /**
     * 医療機関名称カナのgetメソッドです。
     * 
     * @return 医療機関名称カナ
     */
    public RString getIryoKikanMeishoKana() {
        return iryoKikanMeishoKana;
    }

    /**
     * 医療機関名称カナのsetメソッドです。
     * 
     * @param iryoKikanMeishoKana 医療機関名称カナ
     */
    public void setIryoKikanMeishoKana(RString iryoKikanMeishoKana) {
        this.iryoKikanMeishoKana = iryoKikanMeishoKana;
    }

    /**
     * 郵便番号のgetメソッドです。
     * 
     * @return 郵便番号
     */
    public YubinNo getYubinNo() {
        return yubinNo;
    }

    /**
     * 郵便番号のsetメソッドです。
     * 
     * @param yubinNo 郵便番号
     */
    public void setYubinNo(YubinNo yubinNo) {
        this.yubinNo = yubinNo;
    }

    /**
     * 住所のgetメソッドです。
     * 
     * @return 住所
     */
    public RString getJusho() {
        return jusho;
    }

    /**
     * 住所のsetメソッドです。
     * 
     * @param jusho 住所
     */
    public void setJusho(RString jusho) {
        this.jusho = jusho;
    }

    /**
     * 住所カナのgetメソッドです。
     * 
     * @return 住所カナ
     */
    public RString getJushoKana() {
        return jushoKana;
    }

    /**
     * 住所カナのsetメソッドです。
     * 
     * @param jushoKana 住所カナ
     */
    public void setJushoKana(RString jushoKana) {
        this.jushoKana = jushoKana;
    }

    /**
     * 電話番号のgetメソッドです。
     * 
     * @return 電話番号
     */
    public TelNo getTelNo() {
        return telNo;
    }

    /**
     * 電話番号のsetメソッドです。
     * 
     * @param telNo 電話番号
     */
    public void setTelNo(TelNo telNo) {
        this.telNo = telNo;
    }

    /**
     * 銀行コードのgetメソッドです。
     * 
     * @return 銀行コード
     */
    public KinyuKikanCode getGinkoCode() {
        return ginkoCode;
    }

    /**
     * 銀行コードのsetメソッドです。
     * 
     * @param ginkoCode 銀行コード
     */
    public void setGinkoCode(KinyuKikanCode ginkoCode) {
        this.ginkoCode = ginkoCode;
    }

    /**
     * 支店コードのgetメソッドです。
     * 
     * @return 支店コード
     */
    public KinyuKikanShitenCode getShitenCode() {
        return shitenCode;
    }

    /**
     * 支店コードのsetメソッドです。
     * 
     * @param shitenCode 支店コード
     */
    public void setShitenCode(KinyuKikanShitenCode shitenCode) {
        this.shitenCode = shitenCode;
    }

    /**
     * 口座種別のgetメソッドです。
     * 
     * @return 口座種別
     */
    public Code getKozaShubetsu() {
        return kozaShubetsu;
    }

    /**
     * 口座種別のsetメソッドです。
     * 
     * @param kozaShubetsu 口座種別
     */
    public void setKozaShubetsu(Code kozaShubetsu) {
        this.kozaShubetsu = kozaShubetsu;
    }

    /**
     * 口座番号のgetメソッドです。
     * 
     * @return 口座番号
     */
    public Code getKozaNo() {
        return kozaNo;
    }

    /**
     * 口座番号のsetメソッドです。
     * 
     * @param kozaNo 口座番号
     */
    public void setKozaNo(Code kozaNo) {
        this.kozaNo = kozaNo;
    }

    /**
     * 口座名義人のgetメソッドです。
     * 
     * @return 口座名義人
     */
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
     * 機関の区分コードのgetメソッドです。
     * 
     * @return 機関の区分コード
     */
    public Code getKikanKubunCode() {
        return kikanKubunCode;
    }

    /**
     * 機関の区分コードのsetメソッドです。
     * 
     * @param kikanKubunCode 機関の区分コード
     */
    public void setKikanKubunCode(Code kikanKubunCode) {
        this.kikanKubunCode = kikanKubunCode;
    }

    /**
     * このエンティティの主キーが他の{@literal DbT7011ShujiiIryoKikanJohoEntity}と等しいか判定します。
     * 
     * @param other 比較するエンティティ
     * @@return 
     * 比較するエンティティが同じ主キーを持つ{@literal DbT7011ShujiiIryoKikanJohoEntity}の場合{@literal true}、それ以外の場合は{@literal false}
     */
    @Override
    public boolean equalsPrimaryKeys(DbT7011ShujiiIryoKikanJohoEntity other) {
        if (other == null) {
            return false;
        }
        if (!Objects.equals(this.shichosonCode, other.shichosonCode)) {
            return false;
        }
        if (!Objects.equals(this.kaigoIryokikanCode, other.kaigoIryokikanCode)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void shallowCopy(DbT7011ShujiiIryoKikanJohoEntity entity) {
        this.shichosonCode = entity.shichosonCode;
        this.kaigoIryokikanCode = entity.kaigoIryokikanCode;
        this.iryokikanCode = entity.iryokikanCode;
        this.iryokikanJokyo = entity.iryokikanJokyo;
        this.iryoKikanMeisho = entity.iryoKikanMeisho;
        this.iryoKikanMeishoKana = entity.iryoKikanMeishoKana;
        this.yubinNo = entity.yubinNo;
        this.jusho = entity.jusho;
        this.jushoKana = entity.jushoKana;
        this.telNo = entity.telNo;
        this.ginkoCode = entity.ginkoCode;
        this.shitenCode = entity.shitenCode;
        this.kozaShubetsu = entity.kozaShubetsu;
        this.kozaNo = entity.kozaNo;
        this.kozaMeiginin = entity.kozaMeiginin;
        this.kozaMeigininKana = entity.kozaMeigininKana;
        this.kikanKubunCode = entity.kikanKubunCode;
    }

    /**
     * {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    public RString getMd5() {
        return super.toMd5(shichosonCode, kaigoIryokikanCode, iryokikanCode, iryokikanJokyo, iryoKikanMeisho, iryoKikanMeishoKana, yubinNo, jusho, jushoKana, telNo, ginkoCode, shitenCode, kozaShubetsu, kozaNo, kozaMeiginin, kozaMeigininKana, kikanKubunCode);
    }

// </editor-fold>
}