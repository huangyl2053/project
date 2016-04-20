package jp.co.ndensan.reams.db.dba.entity.db.basic;

import java.util.Objects;
import java.util.UUID;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;
import jp.co.ndensan.reams.uz.uza.util.db.TableName;

/**
 * 境界層保険料段階テーブルのエンティティクラスです。
 *
 * @reamsid_L DBA-9999-013 huangh
 */
public class DbT1007KyokaisoHokenryoDankaiEntity extends DbTableEntityBase<DbT1007KyokaisoHokenryoDankaiEntity> implements IDbAccessable {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.4.2">

    @TableName
    public static final RString TABLE_NAME = new RString("DbT1007KyokaisoHokenryoDankai");

    private RString insertDantaiCd;
    private RDateTime insertTimestamp;
    private RString insertReamsLoginId;
    private UUID insertContextId;
    private boolean isDeleted = false;
    private final int updateCount = 0;
    private RDateTime lastUpdateTimestamp;
    private RString lastUpdateReamsLoginId;
    @PrimaryKey
    private HihokenshaNo hihokenshaNo;
    @PrimaryKey
    private int rirekiNo;
    @PrimaryKey
    private int linkNo;
    @PrimaryKey
    private FlexibleYearMonth tekiyoKaishiYM;
    private FlexibleYearMonth tekiyoShuryoYM;
    private RString gengakuGoHokenryoDankai;
    private boolean logicalDeletedFlag;

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
    public HihokenshaNo getHihokenshaNo() {
        return hihokenshaNo;
    }

    /**
     * 被保険者番号のsetメソッドです。
     *
     * @param hihokenshaNo 被保険者番号
     */
    public void setHihokenshaNo(@Nonnull HihokenshaNo hihokenshaNo) {
        this.hihokenshaNo = hihokenshaNo;
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
    public void setRirekiNo(@Nonnull int rirekiNo) {
        this.rirekiNo = rirekiNo;
    }

    /**
     * リンク番号のgetメソッドです。
     *
     * @return リンク番号
     */
    public int getLinkNo() {
        return linkNo;
    }

    /**
     * リンク番号のsetメソッドです。
     *
     * @param linkNo リンク番号
     */
    public void setLinkNo(@Nonnull int linkNo) {
        this.linkNo = linkNo;
    }

    /**
     * 適用開始年月のgetメソッドです。
     *
     * @return 適用開始年月
     */
    public FlexibleYearMonth getTekiyoKaishiYM() {
        return tekiyoKaishiYM;
    }

    /**
     * 適用開始年月のsetメソッドです。
     *
     * @param tekiyoKaishiYM 適用開始年月
     */
    public void setTekiyoKaishiYM(@Nonnull FlexibleYearMonth tekiyoKaishiYM) {
        this.tekiyoKaishiYM = tekiyoKaishiYM;
    }

    /**
     * 適用終了年月のgetメソッドです。
     *
     * @return 適用終了年月
     */
    public FlexibleYearMonth getTekiyoShuryoYM() {
        return tekiyoShuryoYM;
    }

    /**
     * 適用終了年月のsetメソッドです。
     *
     * @param tekiyoShuryoYM 適用終了年月
     */
    public void setTekiyoShuryoYM(@Nonnull FlexibleYearMonth tekiyoShuryoYM) {
        this.tekiyoShuryoYM = tekiyoShuryoYM;
    }

    /**
     * 保険料納付減額後保険料段階のgetメソッドです。
     *
     * @return 保険料納付減額後保険料段階
     */
    public RString getGengakuGoHokenryoDankai() {
        return gengakuGoHokenryoDankai;
    }

    /**
     * 保険料納付減額後保険料段階のsetメソッドです。
     *
     * @param gengakuGoHokenryoDankai 保険料納付減額後保険料段階
     */
    public void setGengakuGoHokenryoDankai(@Nonnull RString gengakuGoHokenryoDankai) {
        this.gengakuGoHokenryoDankai = gengakuGoHokenryoDankai;
    }

    /**
     * 論理削除フラグのgetメソッドです。
     *
     * @return 論理削除フラグ
     */
    @CheckForNull
    public boolean getLogicalDeletedFlag() {
        return logicalDeletedFlag;
    }

    /**
     * 論理削除フラグのsetメソッドです。
     *
     * @param logicalDeletedFlag 論理削除フラグ
     */
    public void setLogicalDeletedFlag(boolean logicalDeletedFlag) {
        this.logicalDeletedFlag = logicalDeletedFlag;
    }

    /**
     * このエンティティの主キーが他の{@literal DbT1007KyokaisoHokenryoDankaiEntity}と等しいか判定します。
     *
     * @param other 比較するエンティティ
     * @return 比較するエンティティが同じ主キーを持つ{@literal DbT1007KyokaisoHokenryoDankaiEntity}の場合{@literal true}、それ以外の場合は{@literal false}
     */
    @Override
    public boolean equalsPrimaryKeys(DbT1007KyokaisoHokenryoDankaiEntity other) {
        if (other == null) {
            return false;
        }
        if (!Objects.equals(this.hihokenshaNo, other.hihokenshaNo)) {
            return false;
        }
        if (this.rirekiNo != other.rirekiNo) {
            return false;
        }
        if (this.linkNo != other.linkNo) {
            return false;
        }
        if (!Objects.equals(this.tekiyoKaishiYM, other.tekiyoKaishiYM)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     *
     * @param entity DbT1007KyokaisoHokenryoDankaiEntity
     */
    @Override
    public void shallowCopy(DbT1007KyokaisoHokenryoDankaiEntity entity) {
        this.hihokenshaNo = entity.hihokenshaNo;
        this.rirekiNo = entity.rirekiNo;
        this.linkNo = entity.linkNo;
        this.tekiyoKaishiYM = entity.tekiyoKaishiYM;
        this.tekiyoShuryoYM = entity.tekiyoShuryoYM;
        this.gengakuGoHokenryoDankai = entity.gengakuGoHokenryoDankai;
        this.logicalDeletedFlag = entity.logicalDeletedFlag;
    }

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public RString getMd5() {
        return super.toMd5(hihokenshaNo, rirekiNo, linkNo, tekiyoKaishiYM, tekiyoShuryoYM, gengakuGoHokenryoDankai, logicalDeletedFlag);
    }

// </editor-fold>
    private static final long serialVersionUID = 527790498636021373L;
}
