package jp.co.ndensan.reams.db.dba.entity.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;
import jp.co.ndensan.reams.uz.uza.util.db.TableName;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import java.util.UUID;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import java.util.Objects;

/**
 * 他市町村住所地特例テーブルのエンティティクラスです。
 */
public class DbT1003TashichosonJushochiTokureiEntity extends DbTableEntityBase<DbT1003TashichosonJushochiTokureiEntity> implements IDbAccessable {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.3.9">
    @TableName
    public static final RString TABLE_NAME = new RString("DbT1003TashichosonJushochiTokurei");

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
    private ShikibetsuCode shikibetsuCode;
    @PrimaryKey
    private int rirekiNo;
    private RString tekiyoJiyuCode;
    private FlexibleDate tekiyoYMD;
    private FlexibleDate tekiyoTodokedeYMD;
    private FlexibleDate tekiyoUketsukeYMD;
    private RString kaijoJiyuCode;
    private FlexibleDate kaijoYMD;
    private FlexibleDate kaijoTodokedeYMD;
    private FlexibleDate kaijoUketsukeYMD;
    private DbUDD003HokenshaNo sochiHokenshaNo;
    private DbUDD002HihokenshaNo sochiHihokenshaNo;

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
     * 識別コードのgetメソッドです。
     * 
     * @return 識別コード
     */
    public ShikibetsuCode getShikibetsuCode() {
        return shikibetsuCode;
    }

    /**
     * 識別コードのsetメソッドです。
     * 
     * @param shikibetsuCode 識別コード
     */
    public void setShikibetsuCode(ShikibetsuCode shikibetsuCode) {
        this.shikibetsuCode = shikibetsuCode;
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
     * 他市町村住所地特例適用事由コードのgetメソッドです。
     * 
     * @return 他市町村住所地特例適用事由コード
     */
    public RString getTekiyoJiyuCode() {
        return tekiyoJiyuCode;
    }

    /**
     * 他市町村住所地特例適用事由コードのsetメソッドです。
     * 
     * @param tekiyoJiyuCode 他市町村住所地特例適用事由コード
     */
    public void setTekiyoJiyuCode(RString tekiyoJiyuCode) {
        this.tekiyoJiyuCode = tekiyoJiyuCode;
    }

    /**
     * 適用年月日のgetメソッドです。
     * 
     * @return 適用年月日
     */
    public FlexibleDate getTekiyoYMD() {
        return tekiyoYMD;
    }

    /**
     * 適用年月日のsetメソッドです。
     * 
     * @param tekiyoYMD 適用年月日
     */
    public void setTekiyoYMD(FlexibleDate tekiyoYMD) {
        this.tekiyoYMD = tekiyoYMD;
    }

    /**
     * 適用届出年月日のgetメソッドです。
     * 
     * @return 適用届出年月日
     */
    public FlexibleDate getTekiyoTodokedeYMD() {
        return tekiyoTodokedeYMD;
    }

    /**
     * 適用届出年月日のsetメソッドです。
     * 
     * @param tekiyoTodokedeYMD 適用届出年月日
     */
    public void setTekiyoTodokedeYMD(FlexibleDate tekiyoTodokedeYMD) {
        this.tekiyoTodokedeYMD = tekiyoTodokedeYMD;
    }

    /**
     * 適用受付年月日のgetメソッドです。
     * 
     * @return 適用受付年月日
     */
    public FlexibleDate getTekiyoUketsukeYMD() {
        return tekiyoUketsukeYMD;
    }

    /**
     * 適用受付年月日のsetメソッドです。
     * 
     * @param tekiyoUketsukeYMD 適用受付年月日
     */
    public void setTekiyoUketsukeYMD(FlexibleDate tekiyoUketsukeYMD) {
        this.tekiyoUketsukeYMD = tekiyoUketsukeYMD;
    }

    /**
     * 他市町村住所地特例解除事由コードのgetメソッドです。
     * 
     * @return 他市町村住所地特例解除事由コード
     */
    public RString getKaijoJiyuCode() {
        return kaijoJiyuCode;
    }

    /**
     * 他市町村住所地特例解除事由コードのsetメソッドです。
     * 
     * @param kaijoJiyuCode 他市町村住所地特例解除事由コード
     */
    public void setKaijoJiyuCode(RString kaijoJiyuCode) {
        this.kaijoJiyuCode = kaijoJiyuCode;
    }

    /**
     * 解除年月日のgetメソッドです。
     * 
     * @return 解除年月日
     */
    public FlexibleDate getKaijoYMD() {
        return kaijoYMD;
    }

    /**
     * 解除年月日のsetメソッドです。
     * 
     * @param kaijoYMD 解除年月日
     */
    public void setKaijoYMD(FlexibleDate kaijoYMD) {
        this.kaijoYMD = kaijoYMD;
    }

    /**
     * 解除届出年月日のgetメソッドです。
     * 
     * @return 解除届出年月日
     */
    public FlexibleDate getKaijoTodokedeYMD() {
        return kaijoTodokedeYMD;
    }

    /**
     * 解除届出年月日のsetメソッドです。
     * 
     * @param kaijoTodokedeYMD 解除届出年月日
     */
    public void setKaijoTodokedeYMD(FlexibleDate kaijoTodokedeYMD) {
        this.kaijoTodokedeYMD = kaijoTodokedeYMD;
    }

    /**
     * 解除受付年月日のgetメソッドです。
     * 
     * @return 解除受付年月日
     */
    public FlexibleDate getKaijoUketsukeYMD() {
        return kaijoUketsukeYMD;
    }

    /**
     * 解除受付年月日のsetメソッドです。
     * 
     * @param kaijoUketsukeYMD 解除受付年月日
     */
    public void setKaijoUketsukeYMD(FlexibleDate kaijoUketsukeYMD) {
        this.kaijoUketsukeYMD = kaijoUketsukeYMD;
    }

    /**
     * 措置保険者番号のgetメソッドです。
     * 
     * @return 措置保険者番号
     */
    public DbUDD003HokenshaNo getSochiHokenshaNo() {
        return sochiHokenshaNo;
    }

    /**
     * 措置保険者番号のsetメソッドです。
     * 
     * @param sochiHokenshaNo 措置保険者番号
     */
    public void setSochiHokenshaNo(DbUDD003HokenshaNo sochiHokenshaNo) {
        this.sochiHokenshaNo = sochiHokenshaNo;
    }

    /**
     * 措置被保険者番号のgetメソッドです。
     * 
     * @return 措置被保険者番号
     */
    public DbUDD002HihokenshaNo getSochiHihokenshaNo() {
        return sochiHihokenshaNo;
    }

    /**
     * 措置被保険者番号のsetメソッドです。
     * 
     * @param sochiHihokenshaNo 措置被保険者番号
     */
    public void setSochiHihokenshaNo(DbUDD002HihokenshaNo sochiHihokenshaNo) {
        this.sochiHihokenshaNo = sochiHihokenshaNo;
    }

    /**
     * このエンティティの主キーが他の{@literal DbT1003TashichosonJushochiTokureiEntity}と等しいか判定します。
     * 
     * @param other 比較するエンティティ
     * @@return 
     * 比較するエンティティが同じ主キーを持つ{@literal DbT1003TashichosonJushochiTokureiEntity}の場合{@literal true}、それ以外の場合は{@literal false}
     */
    @Override
    public boolean equalsPrimaryKeys(DbT1003TashichosonJushochiTokureiEntity other) {
        if (other == null) {
            return false;
        }
        if (!Objects.equals(this.shichosonCode, other.shichosonCode)) {
            return false;
        }
        if (!Objects.equals(this.shikibetsuCode, other.shikibetsuCode)) {
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
    public void shallowCopy(DbT1003TashichosonJushochiTokureiEntity entity) {
        this.shichosonCode = entity.shichosonCode;
        this.shikibetsuCode = entity.shikibetsuCode;
        this.rirekiNo = entity.rirekiNo;
        this.tekiyoJiyuCode = entity.tekiyoJiyuCode;
        this.tekiyoYMD = entity.tekiyoYMD;
        this.tekiyoTodokedeYMD = entity.tekiyoTodokedeYMD;
        this.tekiyoUketsukeYMD = entity.tekiyoUketsukeYMD;
        this.kaijoJiyuCode = entity.kaijoJiyuCode;
        this.kaijoYMD = entity.kaijoYMD;
        this.kaijoTodokedeYMD = entity.kaijoTodokedeYMD;
        this.kaijoUketsukeYMD = entity.kaijoUketsukeYMD;
        this.sochiHokenshaNo = entity.sochiHokenshaNo;
        this.sochiHihokenshaNo = entity.sochiHihokenshaNo;
    }

    /**
     * {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    public RString getMd5() {
        return super.toMd5(shichosonCode, shikibetsuCode, rirekiNo, tekiyoJiyuCode, tekiyoYMD, tekiyoTodokedeYMD, tekiyoUketsukeYMD, kaijoJiyuCode, kaijoYMD, kaijoTodokedeYMD, kaijoUketsukeYMD, sochiHokenshaNo, sochiHihokenshaNo);
    }

// </editor-fold>
}
