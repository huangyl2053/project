package jp.co.ndensan.reams.db.dbe.entity.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;
import jp.co.ndensan.reams.uz.uza.util.db.TableName;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import java.util.UUID;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import java.util.Objects;

/**
 * 主治医意見書作成報酬実績情報テーブルのエンティティクラスです。
 */
public class DbT5602ShujiiIkenshoHoshuJissekiJohoEntity extends DbTableEntityBase<DbT5602ShujiiIkenshoHoshuJissekiJohoEntity> implements IDbAccessable {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.3.9">
    @TableName
    public static final RString TABLE_NAME = new RString("DbT5602ShujiiIkenshoHoshuJissekiJoho");

    private RString insertDantaiCd;
    private RDateTime insertTimestamp;
    private RString insertReamsLoginId;
    private UUID insertContextId;
    private boolean isDeleted = false;
    private int updateCount = 0;
    private RDateTime lastUpdateTimestamp;
    private RString lastUpdateReamsLoginId;
    @PrimaryKey
    private RString shujiiIryoKikanCode;
    @PrimaryKey
    private RString shujiiCode;
    @PrimaryKey
    private DbUDD013ShinseishoKanriNo shinseishoKanriNo;
    @PrimaryKey
    private int ikenshoIraiRirekiNo;
    private FlexibleDate iraishoSakuseiIraiYMD;
    private FlexibleDate ikenshoKinyuYMD;
    private FlexibleDate ikenshoJuryoYMD;
    private Code ishiKubunCode;
    private int ikenshoSakuseiryo;
    private int ikenshoBettoShinryohi;
    private int ikenshoHoshu;
    private FlexibleDate hoshuShiharaiYMD;
    private RString hoshuShiharaiMemo;
    private boolean ginkoFurikomiShutsuryokuFlag;

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
     * 主治医医療機関コードのgetメソッドです。
     * <br/>
     * <br/>主治医医療機関情報
     * 
     * @return 主治医医療機関コード
     */
    public RString getShujiiIryoKikanCode() {
        return shujiiIryoKikanCode;
    }

    /**
     * 主治医医療機関コードのsetメソッドです。
     * <br/>
     * <br/>主治医医療機関情報
     * 
     * @param shujiiIryoKikanCode 主治医医療機関コード
     */
    public void setShujiiIryoKikanCode(RString shujiiIryoKikanCode) {
        this.shujiiIryoKikanCode = shujiiIryoKikanCode;
    }

    /**
     * 主治医コードのgetメソッドです。
     * <br/>
     * <br/>主治医情報
     * 
     * @return 主治医コード
     */
    public RString getShujiiCode() {
        return shujiiCode;
    }

    /**
     * 主治医コードのsetメソッドです。
     * <br/>
     * <br/>主治医情報
     * 
     * @param shujiiCode 主治医コード
     */
    public void setShujiiCode(RString shujiiCode) {
        this.shujiiCode = shujiiCode;
    }

    /**
     * 申請書管理番号のgetメソッドです。
     * <br/>
     * <br/>要介護認定申請情報
     * 
     * @return 申請書管理番号
     */
    public DbUDD013ShinseishoKanriNo getShinseishoKanriNo() {
        return shinseishoKanriNo;
    }

    /**
     * 申請書管理番号のsetメソッドです。
     * <br/>
     * <br/>要介護認定申請情報
     * 
     * @param shinseishoKanriNo 申請書管理番号
     */
    public void setShinseishoKanriNo(DbUDD013ShinseishoKanriNo shinseishoKanriNo) {
        this.shinseishoKanriNo = shinseishoKanriNo;
    }

    /**
     * 主治医意見書作成依頼履歴番号のgetメソッドです。
     * <br/>
     * <br/>主治医意見書作成依頼情報
     * 
     * @return 主治医意見書作成依頼履歴番号
     */
    public int getIkenshoIraiRirekiNo() {
        return ikenshoIraiRirekiNo;
    }

    /**
     * 主治医意見書作成依頼履歴番号のsetメソッドです。
     * <br/>
     * <br/>主治医意見書作成依頼情報
     * 
     * @param ikenshoIraiRirekiNo 主治医意見書作成依頼履歴番号
     */
    public void setIkenshoIraiRirekiNo(int ikenshoIraiRirekiNo) {
        this.ikenshoIraiRirekiNo = ikenshoIraiRirekiNo;
    }

    /**
     * 主治医意見書作成依頼年月日のgetメソッドです。
     * 
     * @return 主治医意見書作成依頼年月日
     */
    public FlexibleDate getIraishoSakuseiIraiYMD() {
        return iraishoSakuseiIraiYMD;
    }

    /**
     * 主治医意見書作成依頼年月日のsetメソッドです。
     * 
     * @param iraishoSakuseiIraiYMD 主治医意見書作成依頼年月日
     */
    public void setIraishoSakuseiIraiYMD(FlexibleDate iraishoSakuseiIraiYMD) {
        this.iraishoSakuseiIraiYMD = iraishoSakuseiIraiYMD;
    }

    /**
     * 主治医意見書記入年月日のgetメソッドです。
     * 
     * @return 主治医意見書記入年月日
     */
    public FlexibleDate getIkenshoKinyuYMD() {
        return ikenshoKinyuYMD;
    }

    /**
     * 主治医意見書記入年月日のsetメソッドです。
     * 
     * @param ikenshoKinyuYMD 主治医意見書記入年月日
     */
    public void setIkenshoKinyuYMD(FlexibleDate ikenshoKinyuYMD) {
        this.ikenshoKinyuYMD = ikenshoKinyuYMD;
    }

    /**
     * 主治医意見書受領年月日のgetメソッドです。
     * 
     * @return 主治医意見書受領年月日
     */
    public FlexibleDate getIkenshoJuryoYMD() {
        return ikenshoJuryoYMD;
    }

    /**
     * 主治医意見書受領年月日のsetメソッドです。
     * 
     * @param ikenshoJuryoYMD 主治医意見書受領年月日
     */
    public void setIkenshoJuryoYMD(FlexibleDate ikenshoJuryoYMD) {
        this.ikenshoJuryoYMD = ikenshoJuryoYMD;
    }

    /**
     * 医師区分コードのgetメソッドです。
     * <br/>
     * <br/>Enum（DBE：医師区分コード）
     * 
     * @return 医師区分コード
     */
    public Code getIshiKubunCode() {
        return ishiKubunCode;
    }

    /**
     * 医師区分コードのsetメソッドです。
     * <br/>
     * <br/>Enum（DBE：医師区分コード）
     * 
     * @param ishiKubunCode 医師区分コード
     */
    public void setIshiKubunCode(Code ishiKubunCode) {
        this.ishiKubunCode = ishiKubunCode;
    }

    /**
     * 主治医意見書作成料のgetメソッドです。
     * 
     * @return 主治医意見書作成料
     */
    public int getIkenshoSakuseiryo() {
        return ikenshoSakuseiryo;
    }

    /**
     * 主治医意見書作成料のsetメソッドです。
     * 
     * @param ikenshoSakuseiryo 主治医意見書作成料
     */
    public void setIkenshoSakuseiryo(int ikenshoSakuseiryo) {
        this.ikenshoSakuseiryo = ikenshoSakuseiryo;
    }

    /**
     * 主治医意見書別途診療費のgetメソッドです。
     * 
     * @return 主治医意見書別途診療費
     */
    public int getIkenshoBettoShinryohi() {
        return ikenshoBettoShinryohi;
    }

    /**
     * 主治医意見書別途診療費のsetメソッドです。
     * 
     * @param ikenshoBettoShinryohi 主治医意見書別途診療費
     */
    public void setIkenshoBettoShinryohi(int ikenshoBettoShinryohi) {
        this.ikenshoBettoShinryohi = ikenshoBettoShinryohi;
    }

    /**
     * 主治医意見書報酬のgetメソッドです。
     * 
     * @return 主治医意見書報酬
     */
    public int getIkenshoHoshu() {
        return ikenshoHoshu;
    }

    /**
     * 主治医意見書報酬のsetメソッドです。
     * 
     * @param ikenshoHoshu 主治医意見書報酬
     */
    public void setIkenshoHoshu(int ikenshoHoshu) {
        this.ikenshoHoshu = ikenshoHoshu;
    }

    /**
     * 主治医意見書報酬支払年月日のgetメソッドです。
     * 
     * @return 主治医意見書報酬支払年月日
     */
    public FlexibleDate getHoshuShiharaiYMD() {
        return hoshuShiharaiYMD;
    }

    /**
     * 主治医意見書報酬支払年月日のsetメソッドです。
     * 
     * @param hoshuShiharaiYMD 主治医意見書報酬支払年月日
     */
    public void setHoshuShiharaiYMD(FlexibleDate hoshuShiharaiYMD) {
        this.hoshuShiharaiYMD = hoshuShiharaiYMD;
    }

    /**
     * 主治医意見書報酬支払メモのgetメソッドです。
     * 
     * @return 主治医意見書報酬支払メモ
     */
    public RString getHoshuShiharaiMemo() {
        return hoshuShiharaiMemo;
    }

    /**
     * 主治医意見書報酬支払メモのsetメソッドです。
     * 
     * @param hoshuShiharaiMemo 主治医意見書報酬支払メモ
     */
    public void setHoshuShiharaiMemo(RString hoshuShiharaiMemo) {
        this.hoshuShiharaiMemo = hoshuShiharaiMemo;
    }

    /**
     * 銀行振込出力フラグのgetメソッドです。
     * <br/>
     * <br/>Enum（DBE：銀行振込出力フラグ）
     * 
     * @return 銀行振込出力フラグ
     */
    public boolean getGinkoFurikomiShutsuryokuFlag() {
        return ginkoFurikomiShutsuryokuFlag;
    }

    /**
     * 銀行振込出力フラグのsetメソッドです。
     * <br/>
     * <br/>Enum（DBE：銀行振込出力フラグ）
     * 
     * @param ginkoFurikomiShutsuryokuFlag 銀行振込出力フラグ
     */
    public void setGinkoFurikomiShutsuryokuFlag(boolean ginkoFurikomiShutsuryokuFlag) {
        this.ginkoFurikomiShutsuryokuFlag = ginkoFurikomiShutsuryokuFlag;
    }

    /**
     * このエンティティの主キーが他の{@literal DbT5602ShujiiIkenshoHoshuJissekiJohoEntity}と等しいか判定します。
     * 
     * @param other 比較するエンティティ
     * @@return 
     * 比較するエンティティが同じ主キーを持つ{@literal DbT5602ShujiiIkenshoHoshuJissekiJohoEntity}の場合{@literal true}、それ以外の場合は{@literal false}
     */
    @Override
    public boolean equalsPrimaryKeys(DbT5602ShujiiIkenshoHoshuJissekiJohoEntity other) {
        if (other == null) {
            return false;
        }
        if (!Objects.equals(this.shujiiIryoKikanCode, other.shujiiIryoKikanCode)) {
            return false;
        }
        if (!Objects.equals(this.shujiiCode, other.shujiiCode)) {
            return false;
        }
        if (!Objects.equals(this.shinseishoKanriNo, other.shinseishoKanriNo)) {
            return false;
        }
        if (this.ikenshoIraiRirekiNo != other.ikenshoIraiRirekiNo) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void shallowCopy(DbT5602ShujiiIkenshoHoshuJissekiJohoEntity entity) {
        this.shujiiIryoKikanCode = entity.shujiiIryoKikanCode;
        this.shujiiCode = entity.shujiiCode;
        this.shinseishoKanriNo = entity.shinseishoKanriNo;
        this.ikenshoIraiRirekiNo = entity.ikenshoIraiRirekiNo;
        this.iraishoSakuseiIraiYMD = entity.iraishoSakuseiIraiYMD;
        this.ikenshoKinyuYMD = entity.ikenshoKinyuYMD;
        this.ikenshoJuryoYMD = entity.ikenshoJuryoYMD;
        this.ishiKubunCode = entity.ishiKubunCode;
        this.ikenshoSakuseiryo = entity.ikenshoSakuseiryo;
        this.ikenshoBettoShinryohi = entity.ikenshoBettoShinryohi;
        this.ikenshoHoshu = entity.ikenshoHoshu;
        this.hoshuShiharaiYMD = entity.hoshuShiharaiYMD;
        this.hoshuShiharaiMemo = entity.hoshuShiharaiMemo;
        this.ginkoFurikomiShutsuryokuFlag = entity.ginkoFurikomiShutsuryokuFlag;
    }

    /**
     * {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    public RString getMd5() {
        return super.toMd5(shujiiIryoKikanCode, shujiiCode, shinseishoKanriNo, ikenshoIraiRirekiNo, iraishoSakuseiIraiYMD, ikenshoKinyuYMD, ikenshoJuryoYMD, ishiKubunCode, ikenshoSakuseiryo, ikenshoBettoShinryohi, ikenshoHoshu, hoshuShiharaiYMD, hoshuShiharaiMemo, ginkoFurikomiShutsuryokuFlag);
    }

// </editor-fold>

}
