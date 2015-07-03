package jp.co.ndensan.reams.db.dbz.entity.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.DbTableEntityBase;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;
import jp.co.ndensan.reams.uz.uza.util.db.TableName;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import java.util.UUID;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import java.util.Objects;

/**
 * DbT7110TankiNyushoShikyuGendoGakuの項目定義クラスです
 *
 */
public class DbT7110TankiNyushoShikyuGendoGakuEntity extends DbTableEntityBase<DbT7110TankiNyushoShikyuGendoGakuEntity> implements IDbAccessable {
// <editor-fold defaultstate="collapsed" desc="Created By POJO Tool ver 1.3.1">
    @TableName
    public static final RString TABLE_NAME = new RString("DbT7110TankiNyushoShikyuGendoGaku");

    private RString insertDantaiCd;
    private RDateTime insertTimestamp;
    private RString insertReamsLoginId;
    private UUID insertContextId;
    private boolean isDeleted = false;
    private int updateCount = 0;
    private RDateTime lastUpdateTimestamp;
    private RString lastUpdateReamsLoginId;
    @PrimaryKey
    private RString yoKaigoJotaiKubun;
    @PrimaryKey
    private FlexibleYearMonth tekiyoKaishiYM;
    @PrimaryKey
    private YMDHMS shoriTimestamp;
    private FlexibleYearMonth tekiyoShuryoYM;
    private Decimal shikyuGendoNissu;

    /**
     * getInsertDantaiCd
     * @return insertDantaiCd
     */
    public RString getInsertDantaiCd() {
        return insertDantaiCd;
    }

    /**
     * setInsertDantaiCd
     * @param insertDantaiCd insertDantaiCd
     */
    public void setInsertDantaiCd(RString insertDantaiCd) {
        this.insertDantaiCd = insertDantaiCd;
    }

    /**
     * getIsDeleted
     * @return isDeleted
     */
    public boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * setIsDeleted
     * @param isDeleted isDeleted
     */
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * setLastUpdateReamsLoginId
     * @param lastUpdateReamsLoginId lastUpdateReamsLoginId
     */
    public void setLastUpdateReamsLoginId(RString lastUpdateReamsLoginId) {
        this.lastUpdateReamsLoginId = lastUpdateReamsLoginId;
    }

    /**
     * getYoKaigoJotaiKubun
     * @return yoKaigoJotaiKubun
     */
    public RString getYoKaigoJotaiKubun() {
        return yoKaigoJotaiKubun;
    }

    /**
     * setYoKaigoJotaiKubun
     * @param yoKaigoJotaiKubun yoKaigoJotaiKubun
     */
    public void setYoKaigoJotaiKubun(RString yoKaigoJotaiKubun) {
        this.yoKaigoJotaiKubun = yoKaigoJotaiKubun;
    }

    /**
     * getTekiyoKaishiYM
     * @return tekiyoKaishiYM
     */
    public FlexibleYearMonth getTekiyoKaishiYM() {
        return tekiyoKaishiYM;
    }

    /**
     * setTekiyoKaishiYM
     * @param tekiyoKaishiYM tekiyoKaishiYM
     */
    public void setTekiyoKaishiYM(FlexibleYearMonth tekiyoKaishiYM) {
        this.tekiyoKaishiYM = tekiyoKaishiYM;
    }

    /**
     * getShoriTimestamp
     * @return shoriTimestamp
     */
    public YMDHMS getShoriTimestamp() {
        return shoriTimestamp;
    }

    /**
     * setShoriTimestamp
     * @param shoriTimestamp shoriTimestamp
     */
    public void setShoriTimestamp(YMDHMS shoriTimestamp) {
        this.shoriTimestamp = shoriTimestamp;
    }

    /**
     * getTekiyoShuryoYM
     * @return tekiyoShuryoYM
     */
    public FlexibleYearMonth getTekiyoShuryoYM() {
        return tekiyoShuryoYM;
    }

    /**
     * setTekiyoShuryoYM
     * @param tekiyoShuryoYM tekiyoShuryoYM
     */
    public void setTekiyoShuryoYM(FlexibleYearMonth tekiyoShuryoYM) {
        this.tekiyoShuryoYM = tekiyoShuryoYM;
    }

    /**
     * getShikyuGendoNissu
     * @return shikyuGendoNissu
     */
    public Decimal getShikyuGendoNissu() {
        return shikyuGendoNissu;
    }

    /**
     * setShikyuGendoNissu
     * @param shikyuGendoNissu shikyuGendoNissu
     */
    public void setShikyuGendoNissu(Decimal shikyuGendoNissu) {
        this.shikyuGendoNissu = shikyuGendoNissu;
    }

    /**
     * このエンティティの主キーが他の{@literal DbT7110TankiNyushoShikyuGendoGakuEntity}と等しいか判定します。
     * 
     * @param other 比較するエンティティ
     * @@return 
     * 比較するエンティティが同じ主キーを持つ{@literal DbT7110TankiNyushoShikyuGendoGakuEntity}の場合{@literal true}、それ以外の場合は{@literal false}
     */
    @Override
    public boolean equalsPrimaryKeys(DbT7110TankiNyushoShikyuGendoGakuEntity other) {
        if (other == null) {
            return false;
        }
        if (!Objects.equals(this.yoKaigoJotaiKubun, other.yoKaigoJotaiKubun)) {
            return false;
        }
        if (!Objects.equals(this.tekiyoKaishiYM, other.tekiyoKaishiYM)) {
            return false;
        }
        if (!Objects.equals(this.shoriTimestamp, other.shoriTimestamp)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void shallowCopy(DbT7110TankiNyushoShikyuGendoGakuEntity entity) {
        this.yoKaigoJotaiKubun = entity.yoKaigoJotaiKubun;
        this.tekiyoKaishiYM = entity.tekiyoKaishiYM;
        this.shoriTimestamp = entity.shoriTimestamp;
        this.tekiyoShuryoYM = entity.tekiyoShuryoYM;
        this.shikyuGendoNissu = entity.shikyuGendoNissu;
    }

    /**
     * {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    public RString getMd5() {
        return super.toMd5(yoKaigoJotaiKubun, tekiyoKaishiYM, shoriTimestamp, tekiyoShuryoYM, shikyuGendoNissu);
    }

// </editor-fold>

}